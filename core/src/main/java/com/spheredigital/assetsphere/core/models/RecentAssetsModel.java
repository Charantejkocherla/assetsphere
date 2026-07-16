package com.spheredigital.assetsphere.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = {Resource.class, SlingHttpServletRequest.class}, 
		resourceType = {"assetsphere/components/content/recentassets"},
		defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(extensions = "json", name = "jackson")
public class RecentAssetsModel {
	private static final Logger  LOG = LoggerFactory.getLogger(RecentAssetsModel.class);
	
	@ValueMapValue
	@Default(values = "Recent Assets")
	private String heading;
	
	@ValueMapValue
	private String description;
}
