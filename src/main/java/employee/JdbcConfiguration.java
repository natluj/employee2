package employee;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.jolbox.bonecp.BoneCPDataSource;

@EnableTransactionManagement
@Configuration
public class JdbcConfiguration {
	
	@Bean(destroyMethod="close")
	public DataSource dataSource() {
		BoneCPDataSource ds = new BoneCPDataSource();
		ds.setDriverClass("org.postgresql.Driver");
		ds.setJdbcUrl("jdbc:postgresql://localhost:5432/bddSpring");
		ds.setUsername("postgres");
		ds.setPassword("postgres92");
		ds.setIdleConnectionTestPeriodInMinutes(10);
		ds.setIdleMaxAgeInMinutes(1);
		ds.setMaxConnectionsPerPartition(10);
		ds.setMinConnectionsPerPartition(1);
		ds.setPartitionCount(10);
		ds.setAcquireIncrement(1);
		ds.setStatementsCacheSize(10_000);
		return ds;
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
	return new DataSourceTransactionManager(dataSource());
	}
	
}
