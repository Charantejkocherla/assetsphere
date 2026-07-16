package com.spheredigital.assetsphere.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = {Resource.class},
		resourceType = {"assetsphere/components/content/dashboardcards"},
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(extensions = "json", name = "jackson")
public class DashoardCardsModel {

	@ValueMapValue
	private String assetsTitle;
	
	@ValueMapValue
	private String usersTitle;
	
	@ValueMapValue
	private String downloadsTitle;
	
	@ValueMapValue
	private String storageTitle;

	public String getAssetsTitle() {
		return assetsTitle;
	}

	public String getUsersTitle() {
		return usersTitle;
	}

	public String getDownloadsTitle() {
		return downloadsTitle;
	}

	public String getStorageTitle() {
		return storageTitle;
	}
}
