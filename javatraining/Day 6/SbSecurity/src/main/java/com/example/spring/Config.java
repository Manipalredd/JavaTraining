package com.example.spring;

public class Config {
	
	@EnableWebSecurity
	public class Config extends  WebSecurityConfigurerAdapter {
	 
		  // Adding the roles 
	    @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception { 
	        auth.inMemoryAuthentication() 
	                .withUser("archana") 
	                .password("archana") 
	                .roles("admin_role") 
	                .and() 
	                .withUser("subbarayudu") 
	                .password("subbarayudu") 
	                .roles("student_role"); 
	    } 
	    // Configuring the api  
	      // according to the roles. 
	    @Override
	    protected void configure(HttpSecurity http) throws Exception { 
	        http. 
	                httpBasic() 
	                .and() 
	                .authorizeRequests() 
	                .antMatchers("/delete").hasRole("admin_role") 
	                .and() 
	                .formLogin(); 
	    } 
	      // Function to encode the password 
	      // assign to the particular roles. 
	    @Bean
	    public PasswordEncoder getPasswordEncoder(){ 
	        return NoOpPasswordEncoder.getInstance(); 
	    } 

}
