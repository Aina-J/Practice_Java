package HanbitMedia.hanbit08;

public class Oracle implements DataAccessObject {

	@Override
	public void select() {
		System.out.println("오라클 DB에서 검색");	
	}

	@Override
	public void insert() {
		System.out.println("오라클 DB에서 삽입");	
	}

	@Override
	public void update() {
		System.out.println("오라클 DB를 수정");
	}

	@Override
	public void delete() {
		System.out.println("오라클 DB를 삭제");
	}

}
