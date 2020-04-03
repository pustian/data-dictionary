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
