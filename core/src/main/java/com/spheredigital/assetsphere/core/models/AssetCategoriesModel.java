package com.spheredigital.assetsphere.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables= {Resource.class},
		resourceType= {"assetsphere/components/content/categories"},
		defaultInjectionStrategy=DefaultInjectionStrategy.OPTIONAL)
@Exporter(extensions = "json", name = "jackson")
public class AssetCategoriesModel {
	
	@ValueMapValue
	private String heading;
	
	@ValueMapValue
	private String description;

	public String getHeading() {
		return heading;
	}

	public String getDescription() {
		return description;
	}
}
