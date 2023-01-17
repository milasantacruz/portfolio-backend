
package com.spring02.demo.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter{
   @Override
   public Authentication attemptAuthentication(HttpServletRequest request,
                                                HttpServletResponse response){
       
       AuthCredentials authCredentials = new AuthCredentials();
       try {
           authCredentials = new ObjectMapper().readValue(request.getReader(), AuthCredentials.class);
       } catch (IOException ex) {
           Logger.getLogger(JWTAuthenticationFilter.class.getName()).log(Level.SEVERE, null, ex);
       }
   
       UsernamePasswordAuthenticationToken usernamePAT = new UsernamePasswordAuthenticationToken(
               authCredentials.getEmail(),
               authCredentials.getPassword(),
               Collections.emptyList()
       );
       
       return getAuthenticationManager().authenticate(usernamePAT);
   }
   
   @Override
   protected void successfulAuthentication(HttpServletRequest request,
                                        HttpServletResponse response,
                                        FilterChain filterChain,
                                        Authentication authResult) throws IOException, ServletException{
       UserDetailsImpl userDetails = (UserDetailsImpl) authResult.getPrincipal();
       String token;
       token = TokenUtils.createToken(userDetails.getNombre(),userDetails.getUsername());
       
       response.addHeader("Authorization","Bearer "+token);
       response.getWriter().flush();
       
       super.successfulAuthentication(request, response, filterChain, authResult);
   }
}
