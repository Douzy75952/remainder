package cn.douzy.tools.genertor.genertor;

import cn.douzy.tools.genertor.velocity.ContentEngine;

import java.io.File;

public class VelocityMain {
	

	public static void main(String[] args) {

	}

	public  void genertor(final String modelName, final String pk) {
		// TODO Auto-generated method stub
		String projectBasePath = new File("").getAbsolutePath();
		
		String mapperBasePath = "F:\\project\\remainder\\remainder.dao\\src\\main\\java\\cn\\douzy\\remainder\\dao\\";
		String mapper_package_name="cn.douzy.remainder.dao";
		String object_package_name="cn.douzy.remainder.entity";

		File mapperFile = new File(mapperBasePath);
		if (!mapperFile.exists())
			new File(mapperBasePath).mkdirs();
		if (!filerFile(mapperBasePath + modelName + "Mapper")) {

			String[] args = new String[] { "3",
					projectBasePath + "/remainder.common/src/main/java/cn/douzy/tools/genertor/velocity/",
					"Object.properties", "ObjectMapper.vm", modelName,
					mapperBasePath, pk ,mapper_package_name,object_package_name};

			new ContentEngine().generatorVelocity(args);

		
		}

		System.out.println("generator=" + modelName + "mapper success");

//		String servicesBasePath = projectBasePath
//				+ "/src/main/java/com/wos/services/";
//
//		File servicesFile = new File(servicesBasePath);
//		if (!servicesFile.exists())
//			new File(servicesBasePath).mkdirs();
//		if (!filerFile(servicesBasePath + modelName + "Services")) {
//
//			String[] args = new String[] { "1",
//					projectBasePath + "/src/genertor/resouces/velocity/",
//					"Object.properties", "ObjectServices.vm", modelName,
//					servicesBasePath, pk };
//
//			new ContentEngine().generatorVelocity(args);
//
//			
//		}
//
//		System.out.println("generator=" + modelName + "servcice success");

	}

	private  boolean filerFile(String fileName) {
		return fileName.contains("CompressedMapper.java");
	}
}
