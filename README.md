# data-dictionary
数据字典

###
```bash
mvn clean package
mvn clean package -DskipTests
# 启动
java -jar data-dictionary-1.0.0-RELEASE.jar
# 通过参数指定 profile
java -jar -Dspring.profiles.active=prod data-dictionary-1.0.0-RELEASE.jar
```