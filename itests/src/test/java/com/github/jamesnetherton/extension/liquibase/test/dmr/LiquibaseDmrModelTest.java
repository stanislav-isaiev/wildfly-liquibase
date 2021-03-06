/*-
 * #%L
 * wildfly-liquibase-itests
 * %%
 * Copyright (C) 2017 James Netherton
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package com.github.jamesnetherton.extension.liquibase.test.dmr;

import java.io.File;
import java.util.Arrays;

import com.github.jamesnetherton.liquibase.arquillian.LiquibaseTestSupport;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class LiquibaseDmrModelTest extends LiquibaseTestSupport {

    @Deployment
    public static Archive<?> deployment() {
        return ShrinkWrap.create(JavaArchive.class, "liquibase-dmr-model-test.jar")
            .addAsManifestResource("configs/ds/liquibase-example-ds.xml", "liquibase-example-ds.xml");
    }

    @Test
    public void testDmrModelCreate() throws Exception {
        try {
            boolean success = executeCliScript(new File("target/test-classes/cli/changelog-add.cli"));
            Assert.assertTrue("Expected changelog-add.cli success but it failed", success);
            assertTableModified("dmr_add");
        } finally {
            removeLiquibaseDmrModel("dmr-model-test.xml");
        }
    }

    @Test
    public void testDmrModelCreateWithContext() throws Exception {
        try {
            boolean success = executeCliScript(new File("target/test-classes/cli/changelog-add-with-context.cli"));
            Assert.assertTrue("Expected changelog-add-with-context.cli success but it failed", success);
            assertTableModified("dmr_add_with_context", Arrays.asList("firstname", "id", "lastname", "state"));
        } finally {
            removeLiquibaseDmrModel("dmr-model-with-context-test.xml");
        }
    }

    @Test
    public void testDmrModelCreateWithNoFileNameExtension() throws Exception {
        try {
            boolean success = executeCliScript(new File("target/test-classes/cli/changelog-add-with-no-filename-extension.cli"));
            Assert.assertTrue("Expected changelog-add-with-no-filename-extension.cli success but it failed", success);
            assertTableModified("dmr_add_name_with_no_filename_extension");
        } finally {
            removeLiquibaseDmrModel("dmr-model-with-no-file-extension");
        }
    }

    @Test
    public void testDmrModelCreateWithDatasourceRefPlaceholder() throws Exception {
        try {
            System.setProperty("datasource.name", "java:jboss/datasources/ExampleDS");
            boolean success = executeCliScript(new File("target/test-classes/cli/changelog-add-with-datasource-ref-placeholder.cli"));
            Assert.assertTrue("Expected changelog-add-with-datasource-ref-placeholder.cli success but it failed", success);
            assertTableModified("dmr_add_name_with_datasource_ref_placeholder");
        } finally {
            removeLiquibaseDmrModel("dmr-model-with-datasource-ref-placeholder.xml");
            System.clearProperty("datasource.name");
        }
    }

    @Test
    public void testDmrModelCreateWithContextPlaceholder() throws Exception {
        try {
            System.setProperty("context.name", "context-placeholder-test");
            boolean success = executeCliScript(new File("target/test-classes/cli/changelog-add-with-context-placeholder.cli"));
            Assert.assertTrue("Expected changelog-add-with-context-placeholder.cli success but it failed", success);
            assertTableModified("dmr_add_with_context", Arrays.asList("firstname", "id", "lastname", "state"));
        } finally {
            removeLiquibaseDmrModel("dmr-model-with-context-placeholder.xml");
            System.clearProperty("context.name");
        }
    }

    @Test
    public void testDmrModelCreateWithDuplicateDatasourceRef() throws Exception {
        boolean success = executeCliScript(new File("target/test-classes/cli/changelog-add-with-duplicate-datasource-ref.cli"));
        Assert.assertFalse("Expected changelog-add-with-duplicate-datasource-ref.cli to fail but it was successful", success);
    }

    @Test
    public void testDmrModelUpdate() throws Exception {
        try {
            boolean success = executeCliScript(new File("target/test-classes/cli/changelog-update.cli"));
            Assert.assertTrue("Expected changelog-update.cli success but it failed", success);
            assertTableModified("dmr_update");
        } finally {
            removeLiquibaseDmrModel("dmr-model-update-test.xml");
        }
    }

    @Test
    public void testDmrModelUpdateContextNames() throws Exception {
        try {
            boolean success = executeCliScript(new File("target/test-classes/cli/changelog-update-with-context.cli"));
            Assert.assertTrue("Expected changelog-update-with-context.cli success but it failed", success);
            assertTableModified("dmr_update_with_context", Arrays.asList("firstname", "id", "lastname", "state"));
        } finally {
            removeLiquibaseDmrModel("dmr-model-update-with-context-test.xml");
        }
    }

    @Test
    public void testDmrModelUpdateDatasourceRef() throws Exception {
        try {
            boolean success = executeCliScript(new File("target/test-classes/cli/changelog-update-with-datasource-ref.cli"));
            Assert.assertFalse("Expected changelog-update-with-datasource-ref.cli to fail but it was successful", success);
        } finally {
            removeLiquibaseDmrModel("dmr-model-update-with-datasource-ref-test.xml");
        }
    }
}
