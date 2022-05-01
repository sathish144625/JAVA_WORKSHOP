package com.Ex.example;




public class UserAction extends UserDao{
	private EndUser user;
	private UserDao userDao = new UserDao();
	public String userLogin() throws Exception {
		//User login Action method
		String forward = null;
		EndUser user2 = userDao.find(user);
		if(user2 != null) {
			forward = "success";
		}else {
			forward = "failure";
		}
		return forward;
	}
	
	public String userRegister() throws Exception {
		//User registration Action method
		String forward = "error";//Error marking value when database saves data
		int flag = 0;
		EndUser user2 = (userDao.find(user));
		if(user2 != null) {
			forward = "erroe_user";//User name is already in use tag value
		}else {
			flag = userDao.save(user);
			if(flag == 1) {
				forward = "success";//Tag value registered successfully
			}
		}
		return forward;
	}

	public EndUser getUser() {
		return user;
	}

	public void setUser(EndUser user) {
		this.user = user;
	}

}