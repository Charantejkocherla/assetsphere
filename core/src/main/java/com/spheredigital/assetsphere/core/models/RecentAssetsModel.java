package com.spheredigital.assetsphere.core.models;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;

@Model(adaptables = SlingHttpServletRequest.class,
	defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(extensions = "json", name = "jackson")
public class RecentAssetsModel{
	
}