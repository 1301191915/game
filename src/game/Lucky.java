package game;

import java.util.Scanner;

public class Lucky {
	public static void main(String args[]){		
		String b=""; //定义输出字符串“y\n的值”
		String biaozhi="";//定义是否注册、登陆标识
		String name1="000";//定义用户名
		String mima1="000";//定义密码
		int n=1;//定义校验次数
		String number="";//定义系统随机号码
		String sign="";//定义是否相同标记
		
		Scanner sn = new Scanner(System.in);
		//欢迎界面
		do{
		System.out.println("\n*****欢迎进入奖客富翁系统*****");
		System.out.println("\t1.注册\n\r\t2.登陆\n\r\t3.抽奖");
		System.out.println("*****************************");
		System.out.print("请选择菜单：");
		
		int i = sn.nextInt();				
		switch(i){
		case 1:{
			//判断用户是否已经注册过
			if(!biaozhi.equals("ture")){
				biaozhi = "注册";
			   System.out.println("[奖客富翁系统> "+biaozhi+"]");
			   //进行注册
			   System.out.println("请填写个人注册信息：");
			   System.out.print("用户名：");
			   name1 = sn.next();		
			   System.out.print("密码:");
			   mima1 = sn.next();			
			   //注册成功
			   biaozhi = "ture";
			   System.out.println("\n注册成功，请记好您的会员卡号");
			   System.out.printf("%-27s%-25s%-4s\n","用户名 ","密码","卡号");
			   System.out.printf("%-15s%-12s",name1,mima1);
			   //输出随机四位数
			   for(int k=1;k<=4;k++){
				   String a =(int)(Math.random()*9)+"";
				   number+=a;				  
				   } 
			   System.out.print(number);		
			   System.out.print("\n");
			   //是否继续操作
			   System.out.println("继续吗？（y/n）");			
		       String a = sn.next();
		           if(a.equals("y")) b=a; //System.out.println(b);
		           else{ b = "";
		                System.out.println("系统退出，谢谢使用！");		    
		           }
		       }
		       else System.out.println("[奖客富翁系统> "+biaozhi+"]\n"+"您已注册成功无须再注册!!!"+"\n"); break;
		    }
		
		case 2:{
			//判断用户是否有账号
			if(!biaozhi.equals("ture")&&!biaozhi.equals("success")){
				System.out.println("对不起，请先注册一个账号！");
			}
			else{
			//用户登陆
			System.out.println("[奖客富翁系统>登陆]");
			do{
				System.out.println("请输入用户名：");
			    String name2 = sn.next();
			    System.out.println("请输入用户密码：");
			    String mima2 = sn.next();			
				//用户名、密码校验			    
			    if(name2.equals(name1) && mima2.equals(mima1)){	
			    	biaozhi = "success";
			    	System.out.println("欢迎您："+name1+"\n");
			    	//是否继续操作
			    	System.out.println("继续吗？（y\\n）");
		            String a = sn.next();
		            if(a.equals("y")) b=a;
		            else{
		            	b = ""; 
		    	        System.out.println("系统退出，谢谢使用！");
		    	        }			    				       
		            }			    
			    else{
			    	System.out.println("用户名或密码有误，请重新登录！您还有"+(3-n)+"次机会！");			    	
			    	if(n==3){
			    		System.out.println("系统退出，谢谢使用！");
			    		b = "";
			    	}
			    	n++;           
			    	}
			}while(n>1&&n<=3);
			}						 
			break;
			}		

		case 3:{
			//判断用户是否登陆
			if(!biaozhi.equals("success")){
				System.out.println("对不起，请先登陆！");
				b="y";
			}
			else{	
			//用户抽奖			
			System.out.println("[奖客富翁系统>抽奖]");
			do{	
			    System.out.println("请输入您的卡号：");
			    String no1=sn.next();
			    //String a1=number;			System.out.println(a1);
			    //判断卡号和输入卡号是否匹配
			    if(no1.equals(number)){
			    	n=1;
				    System.out.println("本日幸运数字为：");
			        //随机产生5个四位数
				    for(int j=1;j<=5;j++){
			    	number="";
			    	for(int k=1;k<=4;k++){
			    		String a =(int)(Math.random()*9)+"";
				        number+=a;				  
				        } 
			    	System.out.print(number+"  ");
			    	//判断卡号和幸运数字是否匹配
			    	if(no1.equals(number)) sign="1";
			        else sign="0";			   
			    	}
			        //抽奖结果
                    if(sign.equals("1")) System.out.println("\n恭喜您！您将成为本日幸运会员！！！");
                    else{
                    	System.out.println("\n抱歉，您不是本日幸运会员！");
            	        //是否继续操作
            	        System.out.println("继续吗？（y\\n）");			
 		                String a = sn.next();
 		                if(a.equals("y")){
 		                	b=a;
 		                	//一次抽奖结束，数据格式化
 		                	biaozhi="";
 		           		    name1="000";
 		           		    mima1="000";
 		           		    sign="";
 		                	}
 		                else{ b = "";
 		                System.out.println("系统退出，谢谢使用！");		    
 		                }
 		                 }	
                    }
			else{
                  System.out.println("卡号不正确，请输入正确卡号！");
                  n=2;
                  }
			}while(n>1);
			}	
			break;
		}
				
		default:System.out.println("您的输入有误！");break;
		}	
		}while(b.equals("y"));
						
	}
}


