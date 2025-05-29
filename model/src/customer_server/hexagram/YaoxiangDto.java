package customer_server.hexagram;

import lombok.Data;

@Data
public class YaoxiangDto {

	private Long yaoxiangId;
	
	private Long hexagramId;
	
	private Long hexagramYaoxiangId;
	
	private int index;
	
	private String remark;

	private String state;

}
