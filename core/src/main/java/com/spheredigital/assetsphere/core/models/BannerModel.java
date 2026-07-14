package com.spheredigital.assetsphere.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = {Resource.class, SlingHttpServletRequest.class},
		resourceType= {"assetsphere/components/content/banner"},
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(extensions = "json", name = "jackson")
public class BannerModel {
	
	@ValueMapValue
	private String bannerImage;
	
	@ValueMapValue
	private String heading;
	
	@ValueMapValue
	private String description;
	
	@ValueMapValue
	private String buttonOne;
	
	@ValueMapValue
	private String buttonTwo;

	public String getBannerImage() {
		return bannerImage;
	}

	public String getHeading() {
		return heading;
	}

	public String getDescription() {
		return description;
	}

	public String getButtonOne() {
		return buttonOne;
	}

	public String getButtonTwo() {
		return buttonTwo;
	}
}