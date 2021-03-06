### Changelog

#### WildFly Liquibase 0.7.0

**Enhancements**

* [#36][36] Upgrade to WildFly 17.0.0.Final
* [#37][37] Upgrade to Liquibase 3.7.0
* [#38][38] Upgrade to WildFly 17.0.1.Final
* [#39][39] Move LiquibaseTestSupport into test extension
* [#41][41] Upgrade to Liquibase 3.8.0
* [#43][43] Upgrade to WildFly 18.0.0.Final
* [#45][45] Remove usage of WildFlyLiquibaseFileSystemResourceAccessor
* [#47][47] Upgrade to WildFly 18.0.1.Final
* [#48][48] Upgrade to Liquibase 3.8.2

For details see [0.7.0 Enhancements](https://github.com/jamesnetherton/wildfly-liquibase/issues?q=milestone%3A"0.7.0"+label%3Aenhancement)

**Bugs**

* [#44][44] LiquibaseTestSupport leaks database connections

For details see [0.7.0 Bugs](https://github.com/jamesnetherton/wildfly-liquibase/issues?q=milestone%3A"0.7.0"+label%3Abug)

[36]: https://github.com/jamesnetherton/wildfly-liquibase/issues/36
[37]: https://github.com/jamesnetherton/wildfly-liquibase/issues/37
[38]: https://github.com/jamesnetherton/wildfly-liquibase/issues/38
[39]: https://github.com/jamesnetherton/wildfly-liquibase/issues/39
[41]: https://github.com/jamesnetherton/wildfly-liquibase/issues/41
[43]: https://github.com/jamesnetherton/wildfly-liquibase/issues/43
[45]: https://github.com/jamesnetherton/wildfly-liquibase/issues/45
[47]: https://github.com/jamesnetherton/wildfly-liquibase/issues/47
[48]: https://github.com/jamesnetherton/wildfly-liquibase/issues/48
[44]: https://github.com/jamesnetherton/wildfly-liquibase/issues/44

#### WildFly Liquibase 0.6.0

**Enhancements**

* [#2][2] Create docker image distribution
* [#3][3] Add support for change logs to be defined via Kubernetes ConfigMap
* [#34][34] Upgrade to WildFly 16.0.0.Final

For details see [0.6.0 Enhancements](https://github.com/jamesnetherton/wildfly-liquibase/issues?q=milestone%3A"0.6.0"+label%3Aenhancement)

[2]: https://github.com/jamesnetherton/wildfly-liquibase/issues/2
[3]: https://github.com/jamesnetherton/wildfly-liquibase/issues/3
[34]: https://github.com/jamesnetherton/wildfly-liquibase/issues/34

#### WildFly Liquibase 0.5.0

**Enhancements**

* [#30][30] Upgrade to WildFly 14.0.1.Final
* [#31][31] Support JDK 11
* [#32][32] Upgrade to WildFly 15.0.1.Final
* [#33][33] Upgrade to Liquibase 3.6.3

For details see [0.5.0 Enhancements](https://github.com/jamesnetherton/wildfly-liquibase/issues?q=milestone%3A"0.5.0"+label%3Aenhancement)

[30]: https://github.com/jamesnetherton/wildfly-liquibase/issues/30
[31]: https://github.com/jamesnetherton/wildfly-liquibase/issues/31
[32]: https://github.com/jamesnetherton/wildfly-liquibase/issues/32
[33]: https://github.com/jamesnetherton/wildfly-liquibase/issues/33

#### WildFly Liquibase 0.4.0

**Enhancements**

* [#20][20] Upgrade liquibase to 3.5.5
* [#21][21] Upgrade to WildFly 12.0.0.Final
* [#22][22] Upgrade to Liquibase 3.6.0
* [#24][24] Upgrade to Liquibase 3.6.1
* [#25][25] Upgrade to WildFly 13.0.0.Final
* [#26][26] Upgrade to Liquibase 3.6.2
* [#27][27] Add timeout argument to jboss-cli script invocations
* [#28][28] Set NOPAUSE environment variable for jboss-cli script invocation
* [#29][29] Upgrade to WildFly 14.0.0.Final

For details see [0.4.0 Enhancements](https://github.com/jamesnetherton/wildfly-liquibase/issues?q=milestone%3A"0.4.0"+label%3Aenhancement)

[20]: https://github.com/jamesnetherton/wildfly-liquibase/issues/20
[21]: https://github.com/jamesnetherton/wildfly-liquibase/issues/21
[22]: https://github.com/jamesnetherton/wildfly-liquibase/issues/22
[24]: https://github.com/jamesnetherton/wildfly-liquibase/issues/24
[25]: https://github.com/jamesnetherton/wildfly-liquibase/issues/25
[26]: https://github.com/jamesnetherton/wildfly-liquibase/issues/26
[27]: https://github.com/jamesnetherton/wildfly-liquibase/issues/27
[28]: https://github.com/jamesnetherton/wildfly-liquibase/issues/28
[29]: https://github.com/jamesnetherton/wildfly-liquibase/issues/29

#### WildFly Liquibase 0.2.0

**Enhancements**

* [#1][1] Enable DMR model updates to modify existing change logs
* [#4][4] Add Liquibase module dependency to deployments
* [#5][5] Add Liquibase CDI integration
* [#9][9] Use name attribute of databaseChangeLog element as the file name
* [#10][10] Add support for SQL change logs
* [#14][14] Add support for property placeholders in Liquibase configuration

For details see [0.2.0 Enhancements](https://github.com/jamesnetherton/wildfly-liquibase/issues?q=milestone%3A"0.2.0"+label%3Aenhancement)

**Bugs**

* [#12][12] Standalone XML change log deployments do not work
* [#17][17] Multiple databaseChangeLog subsystem configurations does not work

For details see [0.2.0 Bugs](https://github.com/jamesnetherton/wildfly-liquibase/issues?q=milestone%3A"0.2.0"+label%3Abug)

[1]: https://github.com/jamesnetherton/wildfly-liquibase/issues/1
[4]: https://github.com/jamesnetherton/wildfly-liquibase/issues/4
[5]: https://github.com/jamesnetherton/wildfly-liquibase/issues/5
[9]: https://github.com/jamesnetherton/wildfly-liquibase/issues/9
[10]: https://github.com/jamesnetherton/wildfly-liquibase/issues/10
[14]: https://github.com/jamesnetherton/wildfly-liquibase/issues/14
[12]: https://github.com/jamesnetherton/wildfly-liquibase/issues/12
[17]: https://github.com/jamesnetherton/wildfly-liquibase/issues/17