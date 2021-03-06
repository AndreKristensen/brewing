package no.ask.context;


//@Configuration
//@EnableTransactionManagement(proxyTargetClass = false)
//@EnableJpaRepositories("no.ask")
//@PropertySource("classpath:database.properties")
public class DbConfiguration {

    private static final String HIBERNATE_HBM2DDL_AUTO = "hibernate.hbm2ddl.auto";
    private static final String HIBERNATE_FORMAT_SQL = "hibernate.format_sql";
    private static final String HIBERNATE_DIALECT = "hibernate.dialect";
    private static final String HIBERNATE_SHOW_SQL = "hibernate.show_sql";

//    @Value("${db.driver}")
//    private String driver;
//
//    @Value("${db.url}")
//    private String url;
//
//    @Value("${" + HIBERNATE_DIALECT + "}")
//    private String dialect;
//
//    @Value("${" + HIBERNATE_SHOW_SQL + "}")
//    private String showSQL;
//
//    @Value("${entitymanager.packages.to.scan}")
//    private String packageToScan;
//
//    @Value("${" + HIBERNATE_HBM2DDL_AUTO + "}")
//    private String hibernateCreatMode;
//    
//    @Value("${" + HIBERNATE_FORMAT_SQL + "}")
//    private String formatSQL;
//    
//    public DbConfiguration() {
//        super();
//    }
    

//    @Bean
//    public DataSource dataSource() {
//        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName(driver);
//        dataSource.setUrl(url);
//        return dataSource;
//    }
//    
//    
//
//    
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
//        final LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
//        em.setDataSource(dataSource());
//        em.setPersistenceProvider(new HibernatePersistenceProvider());
//        final HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        em.setJpaVendorAdapter(vendorAdapter);
//        em.setJpaProperties(hibProperties());
//
//        return em;
//    }
//
//    private Properties hibProperties() {
//        Properties properties = new Properties();
//        properties.put(HIBERNATE_DIALECT, dialect);
//        properties.put(HIBERNATE_SHOW_SQL, showSQL);
//        properties.put(HIBERNATE_FORMAT_SQL, formatSQL);
//        properties.put(HIBERNATE_HBM2DDL_AUTO, hibernateCreatMode);
//        return properties;
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager(final EntityManagerFactory emf) {
//        final JpaTransactionManager transactionManager = new JpaTransactionManager();
//        transactionManager.setEntityManagerFactory(emf);
//        return transactionManager;
//    }
//
//    @Bean
//    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
//        return new PersistenceExceptionTranslationPostProcessor();
//    }
    

}
