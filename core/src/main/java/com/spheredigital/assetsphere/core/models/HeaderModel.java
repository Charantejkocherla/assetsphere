package com.spheredigital.assetsphere.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = { Resource.class, SlingHttpServletRequest.class }, resourceType = {
		"assetsphere/components/structure/header" }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(extensions = "json", name = "jackson")
public class HeaderModel {

	@ValueMapValue
	private String headerTitle;

	@ValueMapValue
	private String logoPath;

	public String getHeaderTitle() {
		return headerTitle;
	}

	public String getLogoPath() {
		return logoPath;
	}

}
