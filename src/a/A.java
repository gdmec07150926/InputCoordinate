package a;

import java.util.Scanner;

public class A {
	double Ax,Ay,Bx,By,Cx,Cy,Dx,Dy;
	double ABx,ABy,BCx,BCy,CDx,CDy,DAx,DAy;

	A(double Ax,double Ay,double Bx,double By,double Cx,double Cy,double Dx,double Dy){
		//������
		this.Ax=Ax;
		this.Ay=Ay;
		this.Bx=Bx;
		this.By=By;
		this.Cx=Cx;
		this.Cy=Ay;
		this.Dx=Dx;
		this.Dy=Dy;
		//��������
		this.ABx=Bx-Ax;
		this.ABy=By-Ay;
		this.BCx=Cx-Bx;
		this.BCy=Cy-By;
		this.CDx=Dx-Cx;
		this.CDy=Dy-Cy;
		this.DAx=Ax-Dx;
		this.DAy=Ay-Dy;
	}
	//ABx*ABx+ABy*ABy==BCx*BCx+BCy*BCy	�߶����
	//ABx*CDy-ABy*CDx==0	����ƽ��
	//ABx*BCx+ABy*BCy==0	������ֱ
	//|AB|*|BC|cosB		���������ڻ��������
	//|AB|*|BC|sinB		ʸ����������������
	//(0,0,ABx*BCy-ABy*BCx)		������
	
	//0�������κ�����ƽ���Ҵ�ֱ
	
	
	
	
	//��
	public Boolean isPoint(){
		if(Ax==Bx && Bx==Cx && Cx==Dx && Ay==By && By==Cy && Cy==Dy){
			return true;
		}else{
			return false;
		}
	}
	//�����߶�
	public Boolean isSegment(){
		if((ABx*BCy-ABy*BCx==0 && DAx*CDy-DAy*CDx==0) ||
			(CDx*BCy-CDy*BCx==0 && DAx*ABy-DAy*ABx==0)){
			return true;
		}else{
			return false;
		}
	}
	//������
	public Boolean isTriangle(){
		if((ABx*BCy-ABy*BCx==0 && DAx*CDy-DAy*CDx!=0) ||
				(CDx*BCy-CDy*BCx==0 && DAx*ABy-DAy*ABx!=0) ||
				(DAx*CDy-DAy*CDx==0 && ABx*BCy-ABy*BCx!=0) ||
				(DAx*ABy-DAy*ABx==0 && CDx*BCy-CDy*BCx!=0)){
			return true;
		}else{
			return false;
		}
	}
	//�ȱ�������
	public Boolean isEquilateral(){
		if((ABx*ABx+ABy*ABy==BCx*BCx+BCy*BCy && (CDx+DAx)*(CDx+DAx)+(CDy+DAy)*(CDy+DAy)==BCx*BCx+BCy*BCy) ||
				(CDx*CDx+CDy*CDy==DAx*DAx+DAy*DAy && (ABx+BCx)*(ABx+BCx)+(ABy+BCy)*(ABy+BCy)==DAx*DAx+DAy*DAy)){
			return true;
		}else{
			return false;
		}
	}
	//����������
	public Boolean isIsosceles(){
		if((ABx*ABx+ABy*ABy!=BCx*BCx+BCy*BCy && (CDx+DAx)*(CDx+DAx)+(CDy+DAy)*(CDy+DAy)==BCx*BCx+BCy*BCy) && (ABx*ABx+ABy*ABy!=(CDx+DAx)*(CDx+DAx)+(CDy+DAy)*(CDy+DAy)) ||
				(CDx*CDx+CDy*CDy!=DAx*DAx+DAy*DAy && (ABx+BCx)*(ABx+BCx)+(ABy+BCy)*(ABy+BCy)==DAx*DAx+DAy*DAy) && (CDx*CDx+CDy*CDy!=(ABx+BCx)*(ABx+BCx)+(ABy+BCy)*(ABy+BCy))||
				(ABx*ABx+ABy*ABy==BCx*BCx+BCy*BCy && (CDx+DAx)*(CDx+DAx)+(CDy+DAy)*(CDy+DAy)!=BCx*BCx+BCy*BCy) && (ABx*ABx+ABy*ABy!=(CDx+DAx)*(CDx+DAx)+(CDy+DAy)*(CDy+DAy))||
				(CDx*CDx+CDy*CDy==DAx*DAx+DAy*DAy && (ABx+BCx)*(ABx+BCx)+(ABy+BCy)*(ABy+BCy)!=DAx*DAx+DAy*DAy) && (CDx*CDx+CDy*CDy!=(ABx+BCx)*(ABx+BCx)+(ABy+BCy)*(ABy+BCy))){
			return true;
		}else{
			return false;
		}
	}
	//ֱ��������	����ֱ��������
	public Boolean isRightAngled(){
		if((ABx*BCx+ABy*BCy==0 && ABx*ABx+ABy*ABy!=0 && BCx*BCx+BCy*BCy!=0) ||
				(BCx*CDx+BCy*CDy==0 && BCx*BCx+BCy*BCy!=0 && CDx*CDx+CDy*CDy!=0) ||
				(CDx*DAx+CDy*DAy==0 && CDx*CDx+CDy*CDy!=0 && DAx*DAx+DAy*DAy!=0) ||
				(DAx*ABx+DAy*ABy==0 && DAx*DAx+DAy*DAy!=0 && ABx*ABx+ABy*ABy!=0)){
			return true;
		}else{
			return false;
		}
	}
	//�ı���
	public Boolean isQuadrilateral(){
		if(ABx*BCy-ABy*BCx!=0 && DAx*CDy-DAy*CDx!=0 &&
				CDx*BCy-CDy*BCx!=0 && DAx*ABy-DAy*ABx!=0){
			return true;
		}else{
			return false;
		}
	}
	//���ı���
	public Boolean isConcave(){
		if(((ABx*BCy-ABy*BCx)*(CDx*DAy-CDy*DAx)>0 && (BCx*CDy-BCy*CDx)*(DAx*ABy-DAy*ABx)<0) ||
		((ABx*BCy-ABy*BCx)*(CDx*DAy-CDy*DAx)<0 && (BCx*CDy-BCy*CDx)*(DAx*ABy-DAy*ABx)>0)){
			return true;
		}else{
			return false;
		}
	}
	//���ı���
	public Boolean isComplex(){
		if((ABx*BCy-ABy*BCx)*(CDx*DAy-CDy*DAx)<0 && (BCx*CDy-BCy*CDx)*(DAx*ABy-DAy*ABx)<0){
			return true;
		}else{
			return false;
		}
	}
	//͹�ı���
	public Boolean isConvex(){
		if((ABx*BCy-ABy*BCx)*(CDx*DAy-CDy*DAx)>0 && (BCx*CDy-BCy*CDx)*(DAx*ABy-DAy*ABx)>0){
			return true;
		}else{
			return false;
		}
	}
	//����
	public Boolean isTrapezium(){
		if((ABx*CDy-ABy*CDx==0 && BCx*DAy-BCy*DAx!=0) ||
				ABx*CDy-ABy*CDx!=0 && BCx*DAy-BCy*DAx==0){
			return true;
		}else{
			return false;
		}
	}
	//��������
	public Boolean isIsoscelesTrapezium(){
		if(ABx*ABx+ABy*ABy==CDx*CDx+CDy*CDy || BCx*BCx+BCy*BCy==DAx*DAx+DAy*DAy){
			return true;
		}else{
			return false;
		}
	}
	//ֱ������
	public Boolean isRightAngledTrapezium(){
		if(ABx*BCx+ABy*BCy==0 || CDx*DAx+CDy*DAy==0){
			return true;
		}else{
			return false;
		}
	}
	//ƽ���ı���
	public Boolean isParallelogram(){
		if(ABx*CDy-ABy*CDx==0 && BCx*DAy-BCy*DAx==0){
			return true;
		}else{
			return false;
		}
	}
	//����
	public Boolean isRectangle(){
		if(ABx*BCx+ABy*BCy==0){
			return true;
		}else{
			return false;
		}
	}
	//����	������
	public Boolean isRhombusORisSquare(){
		if(ABx*ABx+ABy*ABy==BCx*BCx+BCy*BCy){
			return true;
		}else{
			return false;
		}
	}
	
	
	
	
	public String calculate(){
		if(isPoint()){
			System.out.println("��");
			return "��";
		}else if(isSegment()){
			System.out.println("�����߶�");
			return "�����߶�";
		}else if(isTriangle()){
			//������
			if(isEquilateral()){
				System.out.println("�ȱ�������");
				return "�ȱ�������";
			}else if(isIsosceles()){
				if(isRightAngled()){
					System.out.println("����ֱ��������");
					return "����ֱ��������";
				}else{
					System.out.println("����������");
					return "����������";
				}
			}else if(isRightAngled()){
				System.out.println("ֱ��������");
				return "ֱ��������";
			}else{
				System.out.println("��ͨ������");
				return "��ͨ������";
			}
		}else if(isQuadrilateral()){
			//�ı���
			if(isComplex()){
				System.out.println("���ı���");
				return "���ı���";
			}else if(isConcave()){
				System.out.println("���ı���");
				return "���ı���";
			}else {
				if(isTrapezium()){
					//����
					if(isRightAngledTrapezium()){
						System.out.println("ֱ������");
						return "ֱ������";
					}else if(isIsoscelesTrapezium()){
						System.out.println("��������");
						return "��������";
					}else{
						System.out.println("����");
						return "����";
					}
				}else if(isParallelogram()){
					//ƽ���ı���
					if(isRectangle()){
						if(isRhombusORisSquare()){
							System.out.println("������");
							return "������";
						}else{
							System.out.println("����");
							return "����";
						}
					}else if(isRhombusORisSquare()){
						System.out.println("����");
						return "����";
					}else{
						System.out.println("ƽ���ı���");
						return "ƽ���ı���";
					}
				}else{
					System.out.println("��ͨ͹�ı���");
					return "��ͨ͹�ı���";
				}
			}
		}else{
			System.out.println("�Ƿ����룡");
			return "�Ƿ����룡";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Ax,Ay,Bx,By,Cx,Cy,Dx,Dy;
		Scanner scanner = new Scanner(System.in);

		System.out.println("\t�˴������ڼ����ı��ε���״");
		System.out.println("����Ҫ�����ĵ��x��y��ֱ�����꣺");

		System.out.println("Ax:");
		Ax = scanner.nextDouble();
		System.out.println("Ay:");
		Ay = scanner.nextDouble();
		System.out.println("Bx:");
		Bx = scanner.nextDouble();
		System.out.println("By:");
		By = scanner.nextDouble();
		System.out.println("Cx:");
		Cx = scanner.nextDouble();
		System.out.println("Cy:");
		Cy = scanner.nextDouble();
		System.out.println("Dx:");
		Dx = scanner.nextDouble();
		System.out.println("Dy:");
		Dy = scanner.nextDouble();
		scanner.close();
		
		A a = new A(Ax,Ay,Bx,By,Cx,Cy,Dx,Dy);
		a.calculate();
	}

}
