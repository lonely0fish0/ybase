MybatisGenerator用来对应表自动生成相关的DOMAIN类，以及DAO类和它对应的Mapper.xml

修改好generatorConfig.xml文件的相关配置之后，在该文件夹下打开cmd，运行java -jar mybatis-generator-core-1.3.7.jar -configfile generatorConfig.xml -overwrite