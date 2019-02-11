package enums;

public enum CustomerSQL {
	SIGNUP,SIGNIN,LIST;
	@Override
	public String toString() {
		StringBuffer query = new StringBuffer();
		switch (this) {
		case SIGNUP:
			query.append("INSERT INTO CUSTOMERS (CUSTOMER_ID,CUSTOMER_NAME,PASSWORD,ADDRESS,CITY,POSTAL_CODE,SSN,PHONE)"
            + "VALUES(?,?, ?, ?, ?, ?,?,?)");
			break;
		case SIGNIN:
			query.append("SELECT * FROM CUSTOMERS WHERE CUSTOMER_ID LIKE ? AND PASSWORD LIKE ?");
			break;
		case LIST:
			query.append("SELECT * FROM CUSTOMERS");
			break;
		default:
			break;
		}
		return query.toString();
	}
}
