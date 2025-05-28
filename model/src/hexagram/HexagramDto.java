package hexagram;

import lombok.Data;

/**
 * 卦象
 */
@Data
public class HexagramDto {

	private Long hexagramId;
	
	private Long hexagramNo;

	private String hexagramName;

	private Long topHexagramKindId;

	private Long upHexagramKindId;

	public HexagramDto() {
		
	}
	
	public HexagramDto(String hexagramNameParm, Long upHexagramKindParmId, Long topHexagramKindParmId,
			Long hexagramNoParm) {
		hexagramName = hexagramNameParm;
		topHexagramKindId = topHexagramKindParmId;
		upHexagramKindId = upHexagramKindParmId;
		hexagramNo = hexagramNoParm;
	}

}
