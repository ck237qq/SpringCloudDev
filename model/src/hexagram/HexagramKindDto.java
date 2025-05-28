package hexagram;

import lombok.Data;

@Data
public class HexagramKindDto {
	
	private Long hexagramKindId;
	
	private Long hexagramKindNo;

	private String hexagramKindName;
	
	public HexagramKindDto(){
	}
	
	public HexagramKindDto(Long hexagramKindNoParm,String hexagramKindNameParm){
		hexagramKindNo = hexagramKindNoParm;
		hexagramKindName = hexagramKindNameParm;
	}

}
