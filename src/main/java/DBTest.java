
import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;
public class DBTest {
    public static void main(String[] args) throws SQLException {
        //获取驱动，创建连接对象
        Driver driver = new com.mysql.cj.jdbc.Driver();
        //jdbc:mysql:协议
        //localhost:ip地址
        //3306:默认端口号
        //test:数据库
        String url = "jdbc:mysql://localhost:3306/czhhhlatest";
        //将用户名和密码封装再Properties
        Properties info = new Properties();
        info.setProperty("user","root");//用户名
        info.setProperty("password","181042czhLR!!!");//密码
        Connection conn = driver.connect(url,info);
        System.out.println(conn);
    }
}