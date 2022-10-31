package eclipsePracticeDTO;

import java.sql.Timestamp;

public class DTO {
	private int hte_seq;
	private String hte_title;
	private String hte_writer;
	private String hte_contents;
	private Timestamp hte_write_date;
	private int hte_view_count;
	private String hte_nickname;
	
	public DTO() {};
	
	public DTO(int hte_seq, String hte_title, String hte_writer, String hte_contents, Timestamp hte_write_date,
			int hte_view_count, String hte_nickname) {
		super();
		this.hte_seq = hte_seq;
		this.hte_title = hte_title;
		this.hte_writer = hte_writer;
		this.hte_contents = hte_contents;
		this.hte_write_date = hte_write_date;
		this.hte_view_count = hte_view_count;
		this.hte_nickname = hte_nickname;
	}
	public int getHte_seq() {
		return hte_seq;
	}
	public void setHte_seq(int hte_seq) {
		this.hte_seq = hte_seq;
	}
	public String getHte_title() {
		return hte_title;
	}
	public void setHte_title(String hte_title) {
		this.hte_title = hte_title;
	}
	public String getHte_writer() {
		return hte_writer;
	}
	public void setHte_writer(String hte_writer) {
		this.hte_writer = hte_writer;
	}
	public String getHte_contents() {
		return hte_contents;
	}
	public void setHte_contents(String hte_contents) {
		this.hte_contents = hte_contents;
	}
	public Timestamp getHte_write_date() {
		return hte_write_date;
	}
	public void setHte_write_date(Timestamp hte_write_date) {
		this.hte_write_date = hte_write_date;
	}
	public int getHte_view_count() {
		return hte_view_count;
	}
	public void setHte_view_count(int hte_view_count) {
		this.hte_view_count = hte_view_count;
	}
	public String getHte_nickname() {
		return hte_nickname;
	}
	public void setHte_nickname(String hte_nickname) {
		this.hte_nickname = hte_nickname;
	}
	
	

}
