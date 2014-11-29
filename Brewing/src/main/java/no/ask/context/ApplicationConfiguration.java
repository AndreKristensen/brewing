package no.ask.context;

import no.ask.repository.BeerSmithDAO;
import no.ask.repository.BeerSmithDAOService;
import no.ask.repository.BrewDAO;
import no.ask.repository.BrewDAOService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "no.ask")
public class ApplicationConfiguration {

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        PropertySourcesPlaceholderConfigurer ppc = new PropertySourcesPlaceholderConfigurer();
        return ppc;
    }

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/jsp/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

//    @Bean
//    public BrewDAO brewDAO() {
//        return new BrewDAOService();
//    }
//    
//    @Bean
//    public BeerSmithDAO beerSmithDAO() {
//        return new BeerSmithDAOService();
//    }

}