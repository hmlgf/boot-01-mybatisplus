package com.lgf.demo;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;

public class WskCode {

    public static void main(String[] args){

        //1、创建代码生成器对象
        AutoGenerator mpg = new AutoGenerator();

        //2、全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");//获取当前目录
        gc.setOutputDir(projectPath+"/src/main/java");//输出到哪个目录 
        gc.setAuthor("lgf");
        gc.setOpen(false);//生成后是否打开资源管理器
        gc.setFileOverride(false);//重新生成时文件是否覆盖
        gc.setServiceName("%sService");//去掉Service接口的首字母I
        gc.setIdType(IdType.ID_WORKER);//主键策略
        gc.setDateType(DateType.ONLY_DATE);//定义生成的实体类中日期类型
        gc.setSwagger2(true);//开启Swagger2模式
        mpg.setGlobalConfig(gc);

        //3、设置数据源
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUsername("root");//对那一张表生成代码
        dsc.setPassword("123456");
        dsc.setUrl("jdbc:mysql://192.168.1.134:3306/jy_oa_develop?&allowMultiQueries=true&useUnicode=true&characterEncoding=UTF-8&rewriteBatchedStatements=true");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);

        //4、包的配置
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(null);//设置模块名
        pc.setParent("com.lgf.demo");
        pc.setEntity("pojo");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setController("controller");
        mpg.setPackageInfo(pc);

        //5、策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setInclude("person_info");//设置要映射的表名,只需改这里即可
        strategy.setNaming(NamingStrategy.underline_to_camel);//数据库表映射到实体的命名策略
        //strategy.setTablePrefix(pc.getModuleName() + "_"); //生成实体时去掉表前缀
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);//数据库表字段映射到实体的命名策略
        strategy.setEntityLombokModel(true);//是否使用lombok开启注解
        //strategy.setRestControllerStyle(true); //restful api风格控制器
        //strategy.setControllerMappingHyphenStyle(true); //url中驼峰转连字符
        strategy.setLogicDeleteFieldName("isdel");

        //自动填充配置
        TableFill gmtCreate = new TableFill("createdate", FieldFill.INSERT);
        TableFill gmtUpdate = new TableFill("updatedate", FieldFill.INSERT_UPDATE);
        ArrayList<TableFill> tableFills = new ArrayList<>();
        tableFills.add(gmtCreate);
        tableFills.add(gmtUpdate);
        strategy.setTableFillList(tableFills);

        //乐观锁配置
        strategy.setVersionFieldName("version");
        strategy.setRestControllerStyle(true);//开启驼峰命名
        strategy.setControllerMappingHyphenStyle(true);//localhost:8080/hello_id_2
        mpg.setStrategy(strategy);

        // 6、执行
        mpg.execute();

    }

}
