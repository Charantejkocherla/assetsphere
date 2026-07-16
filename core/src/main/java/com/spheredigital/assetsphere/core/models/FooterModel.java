package com.spheredigital.assetsphere.core.models;


import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = {Resource.class},
		resourceType = {"assetsphere/components/content/footer"},
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(extensions = "json", name = "jackson")
public class FooterModel {
	@ValueMapValue
	private String companyName;
	
	@ValueMapValue
	private String description;
	
	@ValueMapValue
	private String copyright;

	public String getCompanyName() {
		return companyName;
	}

	public String getDescription() {
		return description;
	}

	public String getCopyright() {
		return copyright;
	}
}
