package com.boot.service.factory.front;

import java.util.HashMap;
import java.util.Map;

import com.boot.entity.ModelParams;
import com.boot.service.factory.AbstractCodelModel;

public class FrontDetailContentModel extends AbstractCodelModel {

	@Override
	public void generateCode(ModelParams modelParams) {
		modelParams.setFilePath(modelParams.getFilePathPre() + modelParams.getComponentPre() + "/children/");
		modelParams.setTemplateName("frontDetailContent");
		modelParams.setFileName(modelParams.getFileName() + "DetailContent");
		
		Map<String, Object> dataParams = new HashMap<>();
		
		dataParams.put("componentPre", modelParams.getComponentPre());
		dataParams.put("packName", modelParams.getPackName());
		
		this.generateFile(modelParams, dataParams, true);
	}

}
