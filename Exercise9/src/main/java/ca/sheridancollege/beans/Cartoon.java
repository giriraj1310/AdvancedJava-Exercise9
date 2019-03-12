package ca.sheridancollege.beans;

import java.io.Serializable;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cartoon implements Serializable {

	private int id;
	private String show;
	private String character;
}
