```bash
docker pull mysql:5.7.19
mkdir -p /database/mysql/mysql5.7.19/{conf.d,log,data}
```
官方镜像
> MYSQL_ROOT_PASSWORD ： 设置mysql数据库root的密码
> MYSQL_DATABASE ： 启动时创建数据库
> TZ=Asia/shanghai ： 设置容器时区
> character-set-server ： 服务器字符集，在创建数据库和表时不特别指定字符集，这样统一采用character-set-server字符集。
>     character-set-database ： 数据库字符集
>     character-set-table ： 数据库表字符集
> collation-server ： 排序规则字符集
> default-time_zone ： mysql的时区


```bash
docker run -p 3306:3306 --name mysql \
--volume /database/mysql/mysql5.7.19/conf.d:/etc/mysql/conf.d \
--volume /database/mysql/mysql5.7.19/log:/var/log/mysql \
--volume /database/mysql/mysql5.7.19/data:/var/lib/mysql \
-e MYSQL_ROOT_PASSWORD=mysql123 \
-e TZ=Asia/Shanghai \
-itd mysql:5.7.19 &
```

firewall-cmd --add-port=3306/tcp --permanent
firewall-cmd --reload
docker exec -it mysql /bin/bash
mysql -uroot -pmysql123 -h127.0.0.1

```sql
show variables like '%time_zone%';
select now()
```

仅修改当前会话的时区，停止会话失效(CET)

> settime_zone = '+8:00';

修改全局的时区配置

> set globaltime_zone = '+8:00';
> flush privileges;







```bash
docker pull mysql:5.7.19
mkdir -p /database/mysql/mysql5.7.19/{conf.d,log,data}
```


```bash
docker run -p 3306:3306 --name mysql \
--volume /database/mysql/mysql5.7.19/conf.d:/etc/mysql/conf.d \
--volume /database/mysql/mysql5.7.19/log:/var/log/mysql \
--volume /database/mysql/mysql5.7.19/data:/var/lib/mysql \
-e MYSQL_ROOT_PASSWORD=mysql123 \
-itd mysql:5.7.19 &

```

firewall-cmd --add-port=3306/tcp --permanent
firewall-cmd --reload
docker exec -it mysql /bin/bash
mysql -uroot -pmysql123 -h127.0.0.1
