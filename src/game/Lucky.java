package game;

import java.util.Scanner;

public class Lucky {
	public static void main(String args[]){		
		String b=""; //��������ַ�����y\n��ֵ��
		String biaozhi="";//�����Ƿ�ע�ᡢ��½��ʶ
		String name1="000";//�����û���
		String mima1="000";//��������
		int n=1;//����У�����
		String number="";//����ϵͳ�������
		String sign="";//�����Ƿ���ͬ���
		
		Scanner sn = new Scanner(System.in);
		//��ӭ����
		do{
		System.out.println("\n*****��ӭ���뽱�͸���ϵͳ*****");
		System.out.println("\t1.ע��\n\r\t2.��½\n\r\t3.�齱");
		System.out.println("*****************************");
		System.out.print("��ѡ��˵���");
		
		int i = sn.nextInt();				
		switch(i){
		case 1:{
			//�ж��û��Ƿ��Ѿ�ע���
			if(!biaozhi.equals("ture")){
				biaozhi = "ע��";
			   System.out.println("[���͸���ϵͳ> "+biaozhi+"]");
			   //����ע��
			   System.out.println("����д����ע����Ϣ��");
			   System.out.print("�û�����");
			   name1 = sn.next();		
			   System.out.print("����:");
			   mima1 = sn.next();			
			   //ע��ɹ�
			   biaozhi = "ture";
			   System.out.println("\nע��ɹ�����Ǻ����Ļ�Ա����");
			   System.out.printf("%-27s%-25s%-4s\n","�û��� ","����","����");
			   System.out.printf("%-15s%-12s",name1,mima1);
			   //��������λ��
			   for(int k=1;k<=4;k++){
				   String a =(int)(Math.random()*9)+"";
				   number+=a;				  
				   } 
			   System.out.print(number);		
			   System.out.print("\n");
			   //�Ƿ��������
			   System.out.println("�����𣿣�y/n��");			
		       String a = sn.next();
		           if(a.equals("y")) b=a; //System.out.println(b);
		           else{ b = "";
		                System.out.println("ϵͳ�˳���ллʹ�ã�");		    
		           }
		       }
		       else System.out.println("[���͸���ϵͳ> "+biaozhi+"]\n"+"����ע��ɹ�������ע��!!!"+"\n"); break;
		    }
		
		case 2:{
			//�ж��û��Ƿ����˺�
			if(!biaozhi.equals("ture")&&!biaozhi.equals("success")){
				System.out.println("�Բ�������ע��һ���˺ţ�");
			}
			else{
			//�û���½
			System.out.println("[���͸���ϵͳ>��½]");
			do{
				System.out.println("�������û�����");
			    String name2 = sn.next();
			    System.out.println("�������û����룺");
			    String mima2 = sn.next();			
				//�û���������У��			    
			    if(name2.equals(name1) && mima2.equals(mima1)){	
			    	biaozhi = "success";
			    	System.out.println("��ӭ����"+name1+"\n");
			    	//�Ƿ��������
			    	System.out.println("�����𣿣�y\\n��");
		            String a = sn.next();
		            if(a.equals("y")) b=a;
		            else{
		            	b = ""; 
		    	        System.out.println("ϵͳ�˳���ллʹ�ã�");
		    	        }			    				       
		            }			    
			    else{
			    	System.out.println("�û������������������µ�¼��������"+(3-n)+"�λ��ᣡ");			    	
			    	if(n==3){
			    		System.out.println("ϵͳ�˳���ллʹ�ã�");
			    		b = "";
			    	}
			    	n++;           
			    	}
			}while(n>1&&n<=3);
			}						 
			break;
			}		

		case 3:{
			//�ж��û��Ƿ��½
			if(!biaozhi.equals("success")){
				System.out.println("�Բ������ȵ�½��");
				b="y";
			}
			else{	
			//�û��齱			
			System.out.println("[���͸���ϵͳ>�齱]");
			do{	
			    System.out.println("���������Ŀ��ţ�");
			    String no1=sn.next();
			    //String a1=number;			System.out.println(a1);
			    //�жϿ��ź����뿨���Ƿ�ƥ��
			    if(no1.equals(number)){
			    	n=1;
				    System.out.println("������������Ϊ��");
			        //�������5����λ��
				    for(int j=1;j<=5;j++){
			    	number="";
			    	for(int k=1;k<=4;k++){
			    		String a =(int)(Math.random()*9)+"";
				        number+=a;				  
				        } 
			    	System.out.print(number+"  ");
			    	//�жϿ��ź����������Ƿ�ƥ��
			    	if(no1.equals(number)) sign="1";
			        else sign="0";			   
			    	}
			        //�齱���
                    if(sign.equals("1")) System.out.println("\n��ϲ����������Ϊ�������˻�Ա������");
                    else{
                    	System.out.println("\n��Ǹ�������Ǳ������˻�Ա��");
            	        //�Ƿ��������
            	        System.out.println("�����𣿣�y\\n��");			
 		                String a = sn.next();
 		                if(a.equals("y")){
 		                	b=a;
 		                	//һ�γ齱���������ݸ�ʽ��
 		                	biaozhi="";
 		           		    name1="000";
 		           		    mima1="000";
 		           		    sign="";
 		                	}
 		                else{ b = "";
 		                System.out.println("ϵͳ�˳���ллʹ�ã�");		    
 		                }
 		                 }	
                    }
			else{
                  System.out.println("���Ų���ȷ����������ȷ���ţ�");
                  n=2;
                  }
			}while(n>1);
			}	
			break;
		}
				
		default:System.out.println("������������");break;
		}	
		}while(b.equals("y"));
						
	}
}


