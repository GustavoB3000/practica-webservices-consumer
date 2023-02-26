/**
 * 
 */
package com.devpredator.practicawebservicesconsumer.client;

import java.time.LocalDateTime;
import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.devpredator.practicawebservicesconsumer.dto.RestauranteDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;


/**
 * @author 4PF28LA_2004
 *
 */
public class RestaurantesWSClient {

	public static void main(String[] args) {
		// MEDIANTE GET
		
		//Ok para un solo elemento:
//		Client client = ClientBuilder.newClient();
//
//		String entity = client.target("http://localhost:8080/practica-webservices/devpredator/restaurantesWS")
//				.path("consultarRestaurante").path("1").request(MediaType.APPLICATION_JSON).header("some-header", "true")
//				.get(String.class);
//		
//		System.out.println(entity);
//
//		RestauranteDTO restaurantesDTO = client
//				.target("http://localhost:8080/practica-webservices/devpredator/restaurantesWS")
//				.path("consultarRestaurante").path("1").request(MediaType.APPLICATION_JSON).get()
//				.readEntity(RestauranteDTO.class);
//		
//		System.out.println(restaurantesDTO.toString());
		
		
		//OK para LISTADO:
//		ObjectMapper mapper = new ObjectMapper();
//		List<RestauranteDTO> restaurantes = null;
//	    try {
//	    	restaurantes = mapper.reader()
//			  .forType(new TypeReference<List<RestauranteDTO>>() {})
//			  .readValue(entity);
//		} catch (JsonProcessingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		restaurantes.forEach(restaurante ->{
//			System.out.println(restaurante.toString());
//		});
		
		// MEDIANTE POST:
				Client client = ClientBuilder.newClient();
				
				WebTarget web = client.target("http://localhost:8080/practica-webservices/devpredator/restaurantesWS").path("guardarRestaurante");
				
				RestauranteDTO em = new RestauranteDTO();
				
				em.setIdRestaurante(6L);
				em.setNombre("La perla 6.");
				em.setDireccion("Las serranas 406.");
				em.setSlogan("Slogan 6.");
				
				Invocation.Builder invo = web.request(MediaType.APPLICATION_JSON);
				
				Response resp = invo.post(Entity.entity(em, MediaType.APPLICATION_JSON));
				
				if(resp.getStatus() == 400) {
					String error = resp.readEntity(String.class);
					System.out.println(error);
				}
				
				if(resp.getStatus() == 200) {
					RestauranteDTO restauranteDTO = resp.readEntity(RestauranteDTO.class);
					System.out.println(restauranteDTO.toString());
				}

	}
}