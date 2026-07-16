package com.spheredigital.assetsphere.core.models;

import javax.annotation.PostConstruct;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = {Resource.class, SlingHttpServletRequest.class}, resourceType = {
		"assetsphere/components/content/search" }, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
@Exporter(extensions = "json", name = "jackson")
public class SearchModel {

	private static final Logger LOG = LoggerFactory.getLogger(SearchModel.class);

	@ValueMapValue
	private String heading;

	@ValueMapValue
	private String description;

	@ValueMapValue
	private String placeholder;

	@ValueMapValue
	private String buttonText;

	public String getHeading() {
		return heading;
	}

	public String getDescription() {
		return description;
	}

	public String getPlaceholder() {
		return placeholder;
	}

	public String getButtonText() {
		return buttonText;
	}

	@PostConstruct
	public void init() {
		LOG.info("SearchModel initialized");

		LOG.info("Heading: {}", heading);
		LOG.info("Description: {}", description);
		LOG.info("Placeholder: {}", placeholder);
		LOG.info("Button: {}", buttonText);
	}

}
