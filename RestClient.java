/*
 ==========[ API Usage Example - Java ]==========

  Steps:
     1. Use any recent JDK e.g. v7, v8
     2. Construct a URL Object 
     3. Open a connection using the URL             
     4. Set the request method i.e. GET
     5. Set the request accept (content type) i.e. applcation/json
     6. Set the request authorization i.e. API key     
     7. Invoke connection and examine the response HTTP code
     8. Construct a BufferedReader and loop thorugh the response stream 
     9. Deserialize the output to standard output
      

 ==============================================
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RestClient {

	public static void main(String... args) {

		try {

			URL url = new URL(
					"https://uk1.ukvehicledata.co.uk/api/datapackage/VehicleData?v=2&api_nullitems=1&key_vrm=LG06JYL");

			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json; charset=utf-8");
			conn.setRequestProperty("authorization", "ukvd-ipwhitelist 4b4cdd08-698c-4956-9741-fc70937f40bb");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				System.out.println(output);
			}

			conn.disconnect();

		} catch (MalformedURLException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}

	}

}
