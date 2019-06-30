package nhap_phan_tu_vao_mang;

import java.util.Scanner;

public class nhapphantuvaomang {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		
		System.out.println("Nhap vao kich thuoc mang");
		int N = input.nextInt();
		//Khai bao mang
		int[] A = new int [N];
		int[] B = new int [N+1];
		//nhap gia tri tu ban phim
		for(int i=0; i<A.length;i++) {
			System.out.println("A["+i+"]=");
			A[i]= input.nextInt();
		}
		System.out.println("Nhap gia tri can chen vao");
		int x = input.nextInt();
		System.out.println("Nhap vi tri can chen vao");
		int vitri = input.nextInt();
		if(vitri<=0 ||vitri>=A.length) {
			System.out.println("khong chen duoc phan tu vao mang");
		}else {
			for(int i= 0;i<vitri;i++) {
				B[i]=A[i];
				System.out.println(B[i]);
			}
		}
		
		B[vitri] = x;
		for(int i = vitri; i<A.length;i++) {
			B[i+1] = A[i];
		}
		
		for(int i= 0;i<B.length;i++) {
			System.out.println(B[i]);
		}
	}

}
