package a;

import java.util.Scanner;

public class A {
	double Ax,Ay,Bx,By,Cx,Cy,Dx,Dy;
	double ABx,ABy,BCx,BCy,CDx,CDy,DAx,DAy;

	A(double Ax,double Ay,double Bx,double By,double Cx,double Cy,double Dx,double Dy){
		//点坐标
		this.Ax=Ax;
		this.Ay=Ay;
		this.Bx=Bx;
		this.By=By;
		this.Cx=Cx;
		this.Cy=Ay;
		this.Dx=Dx;
		this.Dy=Dy;
		//向量坐标
		this.ABx=Bx-Ax;
		this.ABy=By-Ay;
		this.BCx=Cx-Bx;
		this.BCy=Cy-By;
		this.CDx=Dx-Cx;
		this.CDy=Dy-Cy;
		this.DAx=Ax-Dx;
		this.DAy=Ay-Dy;
	}
	//ABx*ABx+ABy*ABy==BCx*BCx+BCy*BCy	线段相等
	//ABx*CDy-ABy*CDx==0	向量平行
	//ABx*BCx+ABy*BCy==0	向量垂直
	//|AB|*|BC|cosB		数量积（内积，点积）
	//|AB|*|BC|sinB		矢量积（外积，叉积）
	//(0,0,ABx*BCy-ABy*BCx)		法向量
	
	//0向量与任何向量平行且垂直
	
	
	
	
	//点
	public Boolean isPoint(){
		if(Ax==Bx && Bx==Cx && Cx==Dx && Ay==By && By==Cy && Cy==Dy){
			return true;
		}else{
			return false;
		}
	}
	//多条线段
	public Boolean isSegment(){
		if((ABx*BCy-ABy*BCx==0 && DAx*CDy-DAy*CDx==0) ||
			(CDx*BCy-CDy*BCx==0 && DAx*ABy-DAy*ABx==0)){
			return true;
		}else{
			return false;
		}
	}
	//三角形
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
	//等边三角形
	public Boolean isEquilateral(){
		if((ABx*ABx+ABy*ABy==BCx*BCx+BCy*BCy && (CDx+DAx)*(CDx+DAx)+(CDy+DAy)*(CDy+DAy)==BCx*BCx+BCy*BCy) ||
				(CDx*CDx+CDy*CDy==DAx*DAx+DAy*DAy && (ABx+BCx)*(ABx+BCx)+(ABy+BCy)*(ABy+BCy)==DAx*DAx+DAy*DAy)){
			return true;
		}else{
			return false;
		}
	}
	//等腰三角形
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
	//直角三角形	等腰直角三角形
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
	//四边形
	public Boolean isQuadrilateral(){
		if(ABx*BCy-ABy*BCx!=0 && DAx*CDy-DAy*CDx!=0 &&
				CDx*BCy-CDy*BCx!=0 && DAx*ABy-DAy*ABx!=0){
			return true;
		}else{
			return false;
		}
	}
	//凹四边形
	public Boolean isConcave(){
		if(((ABx*BCy-ABy*BCx)*(CDx*DAy-CDy*DAx)>0 && (BCx*CDy-BCy*CDx)*(DAx*ABy-DAy*ABx)<0) ||
		((ABx*BCy-ABy*BCx)*(CDx*DAy-CDy*DAx)<0 && (BCx*CDy-BCy*CDx)*(DAx*ABy-DAy*ABx)>0)){
			return true;
		}else{
			return false;
		}
	}
	//折四边形
	public Boolean isComplex(){
		if((ABx*BCy-ABy*BCx)*(CDx*DAy-CDy*DAx)<0 && (BCx*CDy-BCy*CDx)*(DAx*ABy-DAy*ABx)<0){
			return true;
		}else{
			return false;
		}
	}
	//凸四边形
	public Boolean isConvex(){
		if((ABx*BCy-ABy*BCx)*(CDx*DAy-CDy*DAx)>0 && (BCx*CDy-BCy*CDx)*(DAx*ABy-DAy*ABx)>0){
			return true;
		}else{
			return false;
		}
	}
	//梯形
	public Boolean isTrapezium(){
		if((ABx*CDy-ABy*CDx==0 && BCx*DAy-BCy*DAx!=0) ||
				ABx*CDy-ABy*CDx!=0 && BCx*DAy-BCy*DAx==0){
			return true;
		}else{
			return false;
		}
	}
	//等腰梯形
	public Boolean isIsoscelesTrapezium(){
		if(ABx*ABx+ABy*ABy==CDx*CDx+CDy*CDy || BCx*BCx+BCy*BCy==DAx*DAx+DAy*DAy){
			return true;
		}else{
			return false;
		}
	}
	//直角梯形
	public Boolean isRightAngledTrapezium(){
		if(ABx*BCx+ABy*BCy==0 || CDx*DAx+CDy*DAy==0){
			return true;
		}else{
			return false;
		}
	}
	//平行四边形
	public Boolean isParallelogram(){
		if(ABx*CDy-ABy*CDx==0 && BCx*DAy-BCy*DAx==0){
			return true;
		}else{
			return false;
		}
	}
	//矩形
	public Boolean isRectangle(){
		if(ABx*BCx+ABy*BCy==0){
			return true;
		}else{
			return false;
		}
	}
	//菱形	正方形
	public Boolean isRhombusORisSquare(){
		if(ABx*ABx+ABy*ABy==BCx*BCx+BCy*BCy){
			return true;
		}else{
			return false;
		}
	}
	
	
	
	
	public String calculate(){
		if(isPoint()){
			System.out.println("掂");
			return "掂";
		}else if(isSegment()){
			System.out.println("多条线段");
			return "多条线段";
		}else if(isTriangle()){
			//三角形
			if(isEquilateral()){
				System.out.println("等边三角形");
				return "等边三角形";
			}else if(isIsosceles()){
				if(isRightAngled()){
					System.out.println("等腰直角三角形");
					return "等腰直角三角形";
				}else{
					System.out.println("等腰三角形");
					return "等腰三角形";
				}
			}else if(isRightAngled()){
				System.out.println("直角三角形");
				return "直角三角形";
			}else{
				System.out.println("普通三角形");
				return "普通三角形";
			}
		}else if(isQuadrilateral()){
			//四边形
			if(isComplex()){
				System.out.println("折四边形");
				return "折四边形";
			}else if(isConcave()){
				System.out.println("凹四边形");
				return "凹四边形";
			}else {
				if(isTrapezium()){
					//梯形
					if(isRightAngledTrapezium()){
						System.out.println("直角梯形");
						return "直角梯形";
					}else if(isIsoscelesTrapezium()){
						System.out.println("等腰梯形");
						return "等腰梯形";
					}else{
						System.out.println("梯形");
						return "梯形";
					}
				}else if(isParallelogram()){
					//平行四边形
					if(isRectangle()){
						if(isRhombusORisSquare()){
							System.out.println("正方形");
							return "正方形";
						}else{
							System.out.println("矩形");
							return "矩形";
						}
					}else if(isRhombusORisSquare()){
						System.out.println("菱形");
						return "菱形";
					}else{
						System.out.println("平行四边形");
						return "平行四边形";
					}
				}else{
					System.out.println("普通凸四边形");
					return "普通凸四边形";
				}
			}
		}else{
			System.out.println("非法输入！");
			return "非法输入！";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double Ax,Ay,Bx,By,Cx,Cy,Dx,Dy;
		Scanner scanner = new Scanner(System.in);

		System.out.println("\t此代码用于计算四边形的形状");
		System.out.println("首先要输入四点的x，y轴直角坐标：");

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
