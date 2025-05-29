package customer_server.hexagram;

import java.util.List;

import lombok.Data;

@Data
public class EditHexagramDto {

	private Long hexagramId;
	
	private List<EditYaoxiangDto> editYaoxiangDtos;


}
