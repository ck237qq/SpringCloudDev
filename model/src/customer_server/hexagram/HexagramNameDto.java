package customer_server.hexagram;

import lombok.Data;

/**
 * 卦象
 */
@Data
public class HexagramNameDto {

	private Long hexagramId;
	
	private Long hexagramNo;

	private String hexagramName;

}
