package hu.hl.sharp_el_556g_250708;

public class Test {
	public static void run0(ICalculator calculator) {
		"2+3o+7=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //18
		"2+9+7=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //18
		"2+3o".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //9
		"+7=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //18
		"5(2+3)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //25
		"5*(2+3)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //25
		"5/(2+3)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //1
		"5o(2+3)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //125
		"5o*(2+3)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //125
		"5o/(2+3)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //5
		"2(3(4(5(6(7(8))))))=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //40320
		"3+9)(5+7)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //144
		"1+2*(3+4(5-6)(7-8))=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //15
		"8/2*15y/((5-8)-7)+9+6*3=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //33
		"1/(1/12+1/6)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //4
		"((2+3)*8)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //40
		"(2+3)(5+7)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //60
		"(2)3)5)7)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //7
		"(2+3)o(5+7)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //300
		"(2+3)o".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //25
		"(2)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //50
		"(2+3)(5+7))(9)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //540
		"(12ao+6ao)ao".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //4
		"3as2f9=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //27
		"3asf8=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //8 helyett 24; nagyon macerás lenne megoldani
		"f(1+2)f".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //0
		"(5f8+3f9)".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //17
		"6oas=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //113.09733552923255
		"3f3+9f12*4f5=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //63
		"3=(9)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //9
		"3=o(9)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //81
		"12+(5*7))(11)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //517
		"asas=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //9.869604401089358
		"2*15as=/as=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //30
		"4+3al=4+(5-(8-(5al)))=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //121
		"3+as8=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //11
		"6.48=-o12of12as=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //-31.219111843077517
		"4+5(9)y=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //-41
		"9=/(1+2)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //3
		"3+(5-()7))=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //1
		"3+(8+(llee0lf".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //( _
		"f2+7+5l=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //9.45
		"2+(7*5)l=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //2.7
		"2+(7*5*11)l=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //9.7
		"2+7*5l=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //2.35
		"2*7*5l=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //0.7
		"5+5l=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //5.25
		"6+l=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //+_
		"f6+8l=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //6.48
		"1+8*al9=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //73
		"lllf2+3l=f2*9l=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //0.18
		"n(7+9)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //6.788225099390856
		"f3n16=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //12
		"f3+2n16=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //11
		"fn16=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //4
		"f49=n=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //7
		"f3=n64=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //8
		"f5+n16=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //9
		"9n9=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //27
		"(2+3)n(2*67+5*7)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //65
		"9=n=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //3
		"fn8=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //2.8284271247461903
		"*n8=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //8.000000000000002
		"f.0625=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //0.0625
		"nao=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //4
		"an8000=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //20
		"fm8=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //0
		"fam8=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //Er2
		"f(7+2)mn64=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //43046721
		"4aoam(3-8)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //625
		"3+m2(2m3)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //72
		"f33-y7=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //40
		"2asn(10sy6*100sy9)=ao".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //159154.94309189534
		"3asf".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //0.0 helyett (*)_ ; nagyon macerás lenne megoldani
		"f8=aq=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //2980.9579870417283
		"agj8ao=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //0.125657214
		"agj8=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //Er2
		"f9ac".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //0.15707963267948966
		"ac".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //10
		"ac".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //9
		"fh(9*10)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //1
		"fai2ao=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //60
		"5-6mn144*.25=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //-5.44195579E8
		"casacac".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //180
		"chas/2=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //0
		"(3+3)as=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //6.283185307179586
		"ias/2=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //-0.5
		"i(as/2)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //1.3785034646766525
		"fi(as/2)=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //0
		"fai(n3/2)=acac".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //30
		"cfiasas=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //-0.902685362
		"fias5=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //0.28366218546322625
		"f3=asagi=×".chars().forEach(i -> calculator.key((char) i));
		"f9=n(9)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi(2)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agias=×".chars().forEach(i -> calculator.key((char) i));
		"fhnan729000000=".chars().forEach(i -> calculator.key((char) i));

/*		"d03*d30=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //81.5374894915
		"10*d01=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //2.99792458E9
		"1048576=q/q2=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //20
		"fdd13f10*80d01as=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //
*/
		/*
		"f1+e==e==(6(7))==".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //44
		"f3+e5+9=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //17
		"f3+e===6*8=".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //51
		"1-e===e6*8==".chars().forEach(i -> calculator.key((char) i)); System.out.println("--"); //-47 -47
*/		
	}
	public static void run1(ICalculator calculator) {
		"f-2as3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f-2as3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f-2as3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f-2as3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f-2as3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f-2as3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f-2as3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f-2as3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f-2as3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f-2as3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f(2as3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f(2as3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f(2as3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f(2as3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f(2as3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f(2as3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f(2as3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f(2as3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f(2as3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f(2as3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f)2as3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f)2as3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f)2as3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f)2as3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f)2as3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f)2as3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f)2as3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f)2as3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f)2as3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f)2as3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f/2as3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f/2as3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f/2as3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f/2as3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f/2as3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f/2as3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f/2as3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f/2as3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f/2as3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f/2as3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f=2as3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f=2as3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f=2as3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f=2as3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f=2as3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f=2as3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f=2as3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f=2as3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f=2as3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f=2as3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"fagi2as3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"fagi2as3==×".chars().forEach(i -> calculator.key((char) i)); //
		"fagi2as3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"fagi2as3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"fagi2as3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"fagi2as3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"fagi2as3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"fagi2as3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"fagi2as3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"fagi2as3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"fam2as3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"fam2as3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"fam2as3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"fam2as3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"fam2as3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"fam2as3==×".chars().forEach(i -> calculator.key((char) i)); //
		"fam2as3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"fam2as3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"fam2as3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"fam2as3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"fas2as3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"fas2as3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"fas2as3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"fas2as3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"fas2as3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"fas2as3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"fas2as3==×".chars().forEach(i -> calculator.key((char) i)); //
		"fas2as3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"fas2as3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"fas2as3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"ff2as3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"ff2as3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"ff2as3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"ff2as3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"ff2as3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"ff2as3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"ff2as3==×".chars().forEach(i -> calculator.key((char) i)); //
		"ff2as3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"ff2as3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"ff2as3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"fl2as3==×".chars().forEach(i -> calculator.key((char) i)); //
		"fl2as3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"fl2as3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"fl2as3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"fl2as3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"fl2as3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"fl2as3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"fl2as3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"fl2as3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"fl2as3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3-2as3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f3-2as3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3-2as3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3-2as3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3-2as3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3-2as3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3-2as3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3-2as3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3-2as3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3-2as3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3(2as3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3(2as3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3(2as3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3(2as3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f3(2as3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3(2as3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3(2as3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3(2as3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3(2as3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3(2as3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3)2as3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f3)2as3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3)2as3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3)2as3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3)2as3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3)2as3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3)2as3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3)2as3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3)2as3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3)2as3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3/2as3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f3/2as3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3/2as3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3/2as3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3/2as3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3/2as3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3/2as3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3/2as3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3/2as3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3/2as3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3=2as3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3=2as3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3=2as3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3=2as3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3=2as3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3=2as3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3=2as3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3=2as3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3=2as3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f3=2as3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3agi2as3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3agi2as3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3agi2as3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3agi2as3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3agi2as3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3agi2as3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3agi2as3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f3agi2as3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3agi2as3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3agi2as3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3am2as3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3am2as3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3am2as3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3am2as3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3am2as3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3am2as3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3am2as3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3am2as3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3am2as3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3am2as3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f3as2as3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3as2as3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3as2as3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3as2as3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3as2as3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3as2as3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f3as2as3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3as2as3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3as2as3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3as2as3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3f2as3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3f2as3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3f2as3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3f2as3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3f2as3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3f2as3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f3f2as3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3f2as3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3f2as3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3f2as3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3l2as3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3l2as3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3l2as3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3l2as3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f3l2as3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3l2as3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3l2as3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3l2as3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3l2as3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3l2as3)=×".chars().forEach(i -> calculator.key((char) i)); //
		
		"f-2agi3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f-2agi3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f-2agi3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f-2agi3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f-2agi3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f-2agi3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f-2agi3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f-2agi3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f-2agi3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f-2agi3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f(2agi3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f(2agi3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f(2agi3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f(2agi3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f(2agi3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f(2agi3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f(2agi3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f(2agi3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f(2agi3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f(2agi3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f)2agi3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f)2agi3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f)2agi3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f)2agi3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f)2agi3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f)2agi3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f)2agi3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f)2agi3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f)2agi3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f)2agi3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f/2agi3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f/2agi3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f/2agi3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f/2agi3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f/2agi3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f/2agi3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f/2agi3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f/2agi3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f/2agi3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f/2agi3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f=2agi3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f=2agi3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f=2agi3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f=2agi3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f=2agi3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f=2agi3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f=2agi3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f=2agi3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f=2agi3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f=2agi3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"fagi2agi3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"fagi2agi3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"fagi2agi3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"fagi2agi3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"fagi2agi3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"fagi2agi3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"fagi2agi3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"fagi2agi3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"fagi2agi3==×".chars().forEach(i -> calculator.key((char) i)); //
		"fagi2agi3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"fam2agi3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"fam2agi3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"fam2agi3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"fam2agi3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"fam2agi3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"fam2agi3==×".chars().forEach(i -> calculator.key((char) i)); //
		"fam2agi3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"fam2agi3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"fam2agi3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"fam2agi3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"fas2agi3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"fas2agi3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"fas2agi3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"fas2agi3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"fas2agi3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"fas2agi3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"fas2agi3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"fas2agi3==×".chars().forEach(i -> calculator.key((char) i)); //
		"fas2agi3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"fas2agi3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"ff2agi3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"ff2agi3==×".chars().forEach(i -> calculator.key((char) i)); //
		"ff2agi3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"ff2agi3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"ff2agi3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"ff2agi3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"ff2agi3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"ff2agi3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"ff2agi3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"ff2agi3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"fl2agi3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"fl2agi3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"fl2agi3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"fl2agi3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"fl2agi3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"fl2agi3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"fl2agi3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"fl2agi3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"fl2agi3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"fl2agi3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f3-2agi3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3-2agi3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3-2agi3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3-2agi3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3-2agi3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3-2agi3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3-2agi3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3-2agi3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f3-2agi3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3-2agi3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3(2agi3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3(2agi3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3(2agi3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3(2agi3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3(2agi3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3(2agi3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3(2agi3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3(2agi3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3(2agi3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3(2agi3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f3)2agi3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3)2agi3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3)2agi3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3)2agi3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3)2agi3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3)2agi3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3)2agi3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f3)2agi3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3)2agi3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3)2agi3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3/2agi3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3/2agi3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f3/2agi3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3/2agi3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3/2agi3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3/2agi3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3/2agi3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3/2agi3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3/2agi3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3/2agi3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3=2agi3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3=2agi3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f3=2agi3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3=2agi3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3=2agi3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3=2agi3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3=2agi3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3=2agi3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3=2agi3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3=2agi3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3agi2agi3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3agi2agi3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3agi2agi3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3agi2agi3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3agi2agi3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3agi2agi3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3agi2agi3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3agi2agi3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f3agi2agi3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3agi2agi3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3am2agi3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3am2agi3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3am2agi3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3am2agi3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3am2agi3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3am2agi3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3am2agi3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f3am2agi3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3am2agi3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3am2agi3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3as2agi3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3as2agi3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f3as2agi3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3as2agi3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3as2agi3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3as2agi3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3as2agi3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3as2agi3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3as2agi3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3as2agi3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3f2agi3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3f2agi3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f3f2agi3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3f2agi3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3f2agi3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3f2agi3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3f2agi3-=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3f2agi3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3f2agi3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3f2agi3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3l2agi3am=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3l2agi3agi=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3l2agi3l=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3l2agi3==×".chars().forEach(i -> calculator.key((char) i)); //
		"f3l2agi3)=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3l2agi3as=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3l2agi3(=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3l2agi3/=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3l2agi3f=×".chars().forEach(i -> calculator.key((char) i)); //
		"f3l2agi3-=×".chars().forEach(i -> calculator.key((char) i)); //		
	}
	public static void run2(ICalculator calculator) {
		"f3=--=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as-=×".chars().forEach(i -> calculator.key((char) i));
		"f3==-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=//=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as/=×".chars().forEach(i -> calculator.key((char) i));
		"f3==/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agiam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asam=×".chars().forEach(i -> calculator.key((char) i));
		"f3==am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agiagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3==agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=((=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as(=×".chars().forEach(i -> calculator.key((char) i));
		"f3==(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=()=×".chars().forEach(i -> calculator.key((char) i));
		"f3=))=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as)=×".chars().forEach(i -> calculator.key((char) i));
		"f3==)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amas=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agias=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asas=×".chars().forEach(i -> calculator.key((char) i));
		"f3==as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fas=×".chars().forEach(i -> calculator.key((char) i));
		"f3=las=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-==×".chars().forEach(i -> calculator.key((char) i));
		"f3=/==×".chars().forEach(i -> calculator.key((char) i));
		"f3=am==×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi==×".chars().forEach(i -> calculator.key((char) i));
		"f3=(==×".chars().forEach(i -> calculator.key((char) i));
		"f3=)==×".chars().forEach(i -> calculator.key((char) i));
		"f3=as==×".chars().forEach(i -> calculator.key((char) i));
		"f3====×".chars().forEach(i -> calculator.key((char) i));
		"f3=f==×".chars().forEach(i -> calculator.key((char) i));
		"f3=l==×".chars().forEach(i -> calculator.key((char) i));
		"f3=3==×".chars().forEach(i -> calculator.key((char) i));
		"f3=-f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amf=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agif=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asf=×".chars().forEach(i -> calculator.key((char) i));
		"f3==f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=ff=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lf=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=aml=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agil=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asl=×".chars().forEach(i -> calculator.key((char) i));
		"f3==l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fl=×".chars().forEach(i -> calculator.key((char) i));
		"f3=ll=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as3=×".chars().forEach(i -> calculator.key((char) i));
		"f3==3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=33=×".chars().forEach(i -> calculator.key((char) i));
		"f3=--=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as-=×".chars().forEach(i -> calculator.key((char) i));
		"f3==-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=//=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as/=×".chars().forEach(i -> calculator.key((char) i));
		"f3==/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agiam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asam=×".chars().forEach(i -> calculator.key((char) i));
		"f3==am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agiagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3==agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=((=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as(=×".chars().forEach(i -> calculator.key((char) i));
		"f3==(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=()=×".chars().forEach(i -> calculator.key((char) i));
		"f3=))=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as)=×".chars().forEach(i -> calculator.key((char) i));
		"f3==)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amas=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agias=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asas=×".chars().forEach(i -> calculator.key((char) i));
		"f3==as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fas=×".chars().forEach(i -> calculator.key((char) i));
		"f3=las=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-==×".chars().forEach(i -> calculator.key((char) i));
		"f3=/==×".chars().forEach(i -> calculator.key((char) i));
		"f3=am==×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi==×".chars().forEach(i -> calculator.key((char) i));
		"f3=(==×".chars().forEach(i -> calculator.key((char) i));
		"f3=)==×".chars().forEach(i -> calculator.key((char) i));
		"f3=as==×".chars().forEach(i -> calculator.key((char) i));
		"f3====×".chars().forEach(i -> calculator.key((char) i));
		"f3=f==×".chars().forEach(i -> calculator.key((char) i));
		"f3=l==×".chars().forEach(i -> calculator.key((char) i));
		"f3=3==×".chars().forEach(i -> calculator.key((char) i));
		"f3=-f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amf=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agif=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asf=×".chars().forEach(i -> calculator.key((char) i));
		"f3==f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=ff=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lf=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=aml=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agil=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asl=×".chars().forEach(i -> calculator.key((char) i));
		"f3==l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fl=×".chars().forEach(i -> calculator.key((char) i));
		"f3=ll=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as3=×".chars().forEach(i -> calculator.key((char) i));
		"f3==3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=33=×".chars().forEach(i -> calculator.key((char) i));
		"f3=--=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as-=×".chars().forEach(i -> calculator.key((char) i));
		"f3==-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=//=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as/=×".chars().forEach(i -> calculator.key((char) i));
		"f3==/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agiam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asam=×".chars().forEach(i -> calculator.key((char) i));
		"f3==am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agiagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3==agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=((=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as(=×".chars().forEach(i -> calculator.key((char) i));
		"f3==(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=()=×".chars().forEach(i -> calculator.key((char) i));
		"f3=))=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as)=×".chars().forEach(i -> calculator.key((char) i));
		"f3==)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amas=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agias=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asas=×".chars().forEach(i -> calculator.key((char) i));
		"f3==as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fas=×".chars().forEach(i -> calculator.key((char) i));
		"f3=las=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-==×".chars().forEach(i -> calculator.key((char) i));
		"f3=/==×".chars().forEach(i -> calculator.key((char) i));
		"f3=am==×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi==×".chars().forEach(i -> calculator.key((char) i));
		"f3=(==×".chars().forEach(i -> calculator.key((char) i));
		"f3=)==×".chars().forEach(i -> calculator.key((char) i));
		"f3=as==×".chars().forEach(i -> calculator.key((char) i));
		"f3====×".chars().forEach(i -> calculator.key((char) i));
		"f3=f==×".chars().forEach(i -> calculator.key((char) i));
		"f3=l==×".chars().forEach(i -> calculator.key((char) i));
		"f3=3==×".chars().forEach(i -> calculator.key((char) i));
		"f3=-f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amf=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agif=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asf=×".chars().forEach(i -> calculator.key((char) i));
		"f3==f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=ff=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lf=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=aml=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agil=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asl=×".chars().forEach(i -> calculator.key((char) i));
		"f3==l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fl=×".chars().forEach(i -> calculator.key((char) i));
		"f3=ll=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as3=×".chars().forEach(i -> calculator.key((char) i));
		"f3==3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=33=×".chars().forEach(i -> calculator.key((char) i));
		"f3=--=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as-=×".chars().forEach(i -> calculator.key((char) i));
		"f3==-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=//=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as/=×".chars().forEach(i -> calculator.key((char) i));
		"f3==/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agiam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asam=×".chars().forEach(i -> calculator.key((char) i));
		"f3==am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agiagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3==agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=((=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as(=×".chars().forEach(i -> calculator.key((char) i));
		"f3==(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=()=×".chars().forEach(i -> calculator.key((char) i));
		"f3=))=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as)=×".chars().forEach(i -> calculator.key((char) i));
		"f3==)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amas=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agias=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asas=×".chars().forEach(i -> calculator.key((char) i));
		"f3==as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fas=×".chars().forEach(i -> calculator.key((char) i));
		"f3=las=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-==×".chars().forEach(i -> calculator.key((char) i));
		"f3=/==×".chars().forEach(i -> calculator.key((char) i));
		"f3=am==×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi==×".chars().forEach(i -> calculator.key((char) i));
		"f3=(==×".chars().forEach(i -> calculator.key((char) i));
		"f3=)==×".chars().forEach(i -> calculator.key((char) i));
		"f3=as==×".chars().forEach(i -> calculator.key((char) i));
		"f3====×".chars().forEach(i -> calculator.key((char) i));
		"f3=f==×".chars().forEach(i -> calculator.key((char) i));
		"f3=l==×".chars().forEach(i -> calculator.key((char) i));
		"f3=3==×".chars().forEach(i -> calculator.key((char) i));
		"f3=-f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amf=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agif=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asf=×".chars().forEach(i -> calculator.key((char) i));
		"f3==f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=ff=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lf=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=aml=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agil=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asl=×".chars().forEach(i -> calculator.key((char) i));
		"f3==l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fl=×".chars().forEach(i -> calculator.key((char) i));
		"f3=ll=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as3=×".chars().forEach(i -> calculator.key((char) i));
		"f3==3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=33=×".chars().forEach(i -> calculator.key((char) i));
		"f3=--=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as-=×".chars().forEach(i -> calculator.key((char) i));
		"f3==-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=//=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as/=×".chars().forEach(i -> calculator.key((char) i));
		"f3==/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agiam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asam=×".chars().forEach(i -> calculator.key((char) i));
		"f3==am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agiagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3==agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=((=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as(=×".chars().forEach(i -> calculator.key((char) i));
		"f3==(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=()=×".chars().forEach(i -> calculator.key((char) i));
		"f3=))=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as)=×".chars().forEach(i -> calculator.key((char) i));
		"f3==)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amas=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agias=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asas=×".chars().forEach(i -> calculator.key((char) i));
		"f3==as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fas=×".chars().forEach(i -> calculator.key((char) i));
		"f3=las=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-==×".chars().forEach(i -> calculator.key((char) i));
		"f3=/==×".chars().forEach(i -> calculator.key((char) i));
		"f3=am==×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi==×".chars().forEach(i -> calculator.key((char) i));
		"f3=(==×".chars().forEach(i -> calculator.key((char) i));
		"f3=)==×".chars().forEach(i -> calculator.key((char) i));
		"f3=as==×".chars().forEach(i -> calculator.key((char) i));
		"f3====×".chars().forEach(i -> calculator.key((char) i));
		"f3=f==×".chars().forEach(i -> calculator.key((char) i));
		"f3=l==×".chars().forEach(i -> calculator.key((char) i));
		"f3=3==×".chars().forEach(i -> calculator.key((char) i));
		"f3=-f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amf=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agif=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asf=×".chars().forEach(i -> calculator.key((char) i));
		"f3==f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=ff=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lf=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=aml=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agil=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asl=×".chars().forEach(i -> calculator.key((char) i));
		"f3==l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fl=×".chars().forEach(i -> calculator.key((char) i));
		"f3=ll=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as3=×".chars().forEach(i -> calculator.key((char) i));
		"f3==3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=33=×".chars().forEach(i -> calculator.key((char) i));
		"f3=--=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as-=×".chars().forEach(i -> calculator.key((char) i));
		"f3==-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=//=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as/=×".chars().forEach(i -> calculator.key((char) i));
		"f3==/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agiam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asam=×".chars().forEach(i -> calculator.key((char) i));
		"f3==am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agiagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3==agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=((=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as(=×".chars().forEach(i -> calculator.key((char) i));
		"f3==(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=()=×".chars().forEach(i -> calculator.key((char) i));
		"f3=))=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as)=×".chars().forEach(i -> calculator.key((char) i));
		"f3==)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amas=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agias=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asas=×".chars().forEach(i -> calculator.key((char) i));
		"f3==as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fas=×".chars().forEach(i -> calculator.key((char) i));
		"f3=las=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-==×".chars().forEach(i -> calculator.key((char) i));
		"f3=/==×".chars().forEach(i -> calculator.key((char) i));
		"f3=am==×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi==×".chars().forEach(i -> calculator.key((char) i));
		"f3=(==×".chars().forEach(i -> calculator.key((char) i));
		"f3=)==×".chars().forEach(i -> calculator.key((char) i));
		"f3=as==×".chars().forEach(i -> calculator.key((char) i));
		"f3====×".chars().forEach(i -> calculator.key((char) i));
		"f3=f==×".chars().forEach(i -> calculator.key((char) i));
		"f3=l==×".chars().forEach(i -> calculator.key((char) i));
		"f3=3==×".chars().forEach(i -> calculator.key((char) i));
		"f3=-f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amf=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agif=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asf=×".chars().forEach(i -> calculator.key((char) i));
		"f3==f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=ff=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lf=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=aml=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agil=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asl=×".chars().forEach(i -> calculator.key((char) i));
		"f3==l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fl=×".chars().forEach(i -> calculator.key((char) i));
		"f3=ll=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as3=×".chars().forEach(i -> calculator.key((char) i));
		"f3==3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=33=×".chars().forEach(i -> calculator.key((char) i));
		"f3=--=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as-=×".chars().forEach(i -> calculator.key((char) i));
		"f3==-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=//=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as/=×".chars().forEach(i -> calculator.key((char) i));
		"f3==/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agiam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asam=×".chars().forEach(i -> calculator.key((char) i));
		"f3==am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agiagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3==agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=((=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as(=×".chars().forEach(i -> calculator.key((char) i));
		"f3==(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=()=×".chars().forEach(i -> calculator.key((char) i));
		"f3=))=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as)=×".chars().forEach(i -> calculator.key((char) i));
		"f3==)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amas=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agias=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asas=×".chars().forEach(i -> calculator.key((char) i));
		"f3==as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fas=×".chars().forEach(i -> calculator.key((char) i));
		"f3=las=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-==×".chars().forEach(i -> calculator.key((char) i));
		"f3=/==×".chars().forEach(i -> calculator.key((char) i));
		"f3=am==×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi==×".chars().forEach(i -> calculator.key((char) i));
		"f3=(==×".chars().forEach(i -> calculator.key((char) i));
		"f3=)==×".chars().forEach(i -> calculator.key((char) i));
		"f3=as==×".chars().forEach(i -> calculator.key((char) i));
		"f3====×".chars().forEach(i -> calculator.key((char) i));
		"f3=f==×".chars().forEach(i -> calculator.key((char) i));
		"f3=l==×".chars().forEach(i -> calculator.key((char) i));
		"f3=3==×".chars().forEach(i -> calculator.key((char) i));
		"f3=-f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amf=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agif=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asf=×".chars().forEach(i -> calculator.key((char) i));
		"f3==f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=ff=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lf=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=aml=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agil=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asl=×".chars().forEach(i -> calculator.key((char) i));
		"f3==l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fl=×".chars().forEach(i -> calculator.key((char) i));
		"f3=ll=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as3=×".chars().forEach(i -> calculator.key((char) i));
		"f3==3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=33=×".chars().forEach(i -> calculator.key((char) i));
		"f3=--=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as-=×".chars().forEach(i -> calculator.key((char) i));
		"f3==-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=//=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as/=×".chars().forEach(i -> calculator.key((char) i));
		"f3==/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agiam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asam=×".chars().forEach(i -> calculator.key((char) i));
		"f3==am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agiagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3==agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=((=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as(=×".chars().forEach(i -> calculator.key((char) i));
		"f3==(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=()=×".chars().forEach(i -> calculator.key((char) i));
		"f3=))=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as)=×".chars().forEach(i -> calculator.key((char) i));
		"f3==)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amas=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agias=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asas=×".chars().forEach(i -> calculator.key((char) i));
		"f3==as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fas=×".chars().forEach(i -> calculator.key((char) i));
		"f3=las=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-==×".chars().forEach(i -> calculator.key((char) i));
		"f3=/==×".chars().forEach(i -> calculator.key((char) i));
		"f3=am==×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi==×".chars().forEach(i -> calculator.key((char) i));
		"f3=(==×".chars().forEach(i -> calculator.key((char) i));
		"f3=)==×".chars().forEach(i -> calculator.key((char) i));
		"f3=as==×".chars().forEach(i -> calculator.key((char) i));
		"f3====×".chars().forEach(i -> calculator.key((char) i));
		"f3=f==×".chars().forEach(i -> calculator.key((char) i));
		"f3=l==×".chars().forEach(i -> calculator.key((char) i));
		"f3=3==×".chars().forEach(i -> calculator.key((char) i));
		"f3=-f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amf=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agif=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asf=×".chars().forEach(i -> calculator.key((char) i));
		"f3==f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=ff=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lf=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=aml=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agil=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asl=×".chars().forEach(i -> calculator.key((char) i));
		"f3==l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fl=×".chars().forEach(i -> calculator.key((char) i));
		"f3=ll=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as3=×".chars().forEach(i -> calculator.key((char) i));
		"f3==3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=33=×".chars().forEach(i -> calculator.key((char) i));
		"f3=--=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as-=×".chars().forEach(i -> calculator.key((char) i));
		"f3==-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=//=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as/=×".chars().forEach(i -> calculator.key((char) i));
		"f3==/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agiam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asam=×".chars().forEach(i -> calculator.key((char) i));
		"f3==am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agiagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3==agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=((=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as(=×".chars().forEach(i -> calculator.key((char) i));
		"f3==(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=()=×".chars().forEach(i -> calculator.key((char) i));
		"f3=))=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as)=×".chars().forEach(i -> calculator.key((char) i));
		"f3==)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amas=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agias=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asas=×".chars().forEach(i -> calculator.key((char) i));
		"f3==as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fas=×".chars().forEach(i -> calculator.key((char) i));
		"f3=las=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-==×".chars().forEach(i -> calculator.key((char) i));
		"f3=/==×".chars().forEach(i -> calculator.key((char) i));
		"f3=am==×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi==×".chars().forEach(i -> calculator.key((char) i));
		"f3=(==×".chars().forEach(i -> calculator.key((char) i));
		"f3=)==×".chars().forEach(i -> calculator.key((char) i));
		"f3=as==×".chars().forEach(i -> calculator.key((char) i));
		"f3====×".chars().forEach(i -> calculator.key((char) i));
		"f3=f==×".chars().forEach(i -> calculator.key((char) i));
		"f3=l==×".chars().forEach(i -> calculator.key((char) i));
		"f3=3==×".chars().forEach(i -> calculator.key((char) i));
		"f3=-f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amf=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agif=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asf=×".chars().forEach(i -> calculator.key((char) i));
		"f3==f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=ff=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lf=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=aml=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agil=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asl=×".chars().forEach(i -> calculator.key((char) i));
		"f3==l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fl=×".chars().forEach(i -> calculator.key((char) i));
		"f3=ll=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as3=×".chars().forEach(i -> calculator.key((char) i));
		"f3==3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=33=×".chars().forEach(i -> calculator.key((char) i));
		"f3=--=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as-=×".chars().forEach(i -> calculator.key((char) i));
		"f3==-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=//=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as/=×".chars().forEach(i -> calculator.key((char) i));
		"f3==/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agiam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asam=×".chars().forEach(i -> calculator.key((char) i));
		"f3==am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agiagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3==agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=((=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as(=×".chars().forEach(i -> calculator.key((char) i));
		"f3==(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=()=×".chars().forEach(i -> calculator.key((char) i));
		"f3=))=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as)=×".chars().forEach(i -> calculator.key((char) i));
		"f3==)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amas=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agias=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asas=×".chars().forEach(i -> calculator.key((char) i));
		"f3==as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fas=×".chars().forEach(i -> calculator.key((char) i));
		"f3=las=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-==×".chars().forEach(i -> calculator.key((char) i));
		"f3=/==×".chars().forEach(i -> calculator.key((char) i));
		"f3=am==×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi==×".chars().forEach(i -> calculator.key((char) i));
		"f3=(==×".chars().forEach(i -> calculator.key((char) i));
		"f3=)==×".chars().forEach(i -> calculator.key((char) i));
		"f3=as==×".chars().forEach(i -> calculator.key((char) i));
		"f3====×".chars().forEach(i -> calculator.key((char) i));
		"f3=f==×".chars().forEach(i -> calculator.key((char) i));
		"f3=l==×".chars().forEach(i -> calculator.key((char) i));
		"f3=3==×".chars().forEach(i -> calculator.key((char) i));
		"f3=-f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amf=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agif=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asf=×".chars().forEach(i -> calculator.key((char) i));
		"f3==f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=ff=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lf=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=aml=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agil=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asl=×".chars().forEach(i -> calculator.key((char) i));
		"f3==l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fl=×".chars().forEach(i -> calculator.key((char) i));
		"f3=ll=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as3=×".chars().forEach(i -> calculator.key((char) i));
		"f3==3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=33=×".chars().forEach(i -> calculator.key((char) i));
		"f3=--=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as-=×".chars().forEach(i -> calculator.key((char) i));
		"f3==-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3-=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=//=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as/=×".chars().forEach(i -> calculator.key((char) i));
		"f3==/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3/=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agiam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asam=×".chars().forEach(i -> calculator.key((char) i));
		"f3==am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lam=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3am=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agiagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3==agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lagi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3agi=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=((=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as(=×".chars().forEach(i -> calculator.key((char) i));
		"f3==(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3(=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=()=×".chars().forEach(i -> calculator.key((char) i));
		"f3=))=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as)=×".chars().forEach(i -> calculator.key((char) i));
		"f3==)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3)=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amas=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agias=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asas=×".chars().forEach(i -> calculator.key((char) i));
		"f3==as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fas=×".chars().forEach(i -> calculator.key((char) i));
		"f3=las=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3as=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-==×".chars().forEach(i -> calculator.key((char) i));
		"f3=/==×".chars().forEach(i -> calculator.key((char) i));
		"f3=am==×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi==×".chars().forEach(i -> calculator.key((char) i));
		"f3=(==×".chars().forEach(i -> calculator.key((char) i));
		"f3=)==×".chars().forEach(i -> calculator.key((char) i));
		"f3=as==×".chars().forEach(i -> calculator.key((char) i));
		"f3====×".chars().forEach(i -> calculator.key((char) i));
		"f3=f==×".chars().forEach(i -> calculator.key((char) i));
		"f3=l==×".chars().forEach(i -> calculator.key((char) i));
		"f3=3==×".chars().forEach(i -> calculator.key((char) i));
		"f3=-f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=amf=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agif=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asf=×".chars().forEach(i -> calculator.key((char) i));
		"f3==f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=ff=×".chars().forEach(i -> calculator.key((char) i));
		"f3=lf=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3f=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=aml=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agil=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=asl=×".chars().forEach(i -> calculator.key((char) i));
		"f3==l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=fl=×".chars().forEach(i -> calculator.key((char) i));
		"f3=ll=×".chars().forEach(i -> calculator.key((char) i));
		"f3=3l=×".chars().forEach(i -> calculator.key((char) i));
		"f3=-3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=/3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=am3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=agi3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=(3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=)3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=as3=×".chars().forEach(i -> calculator.key((char) i));
		"f3==3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=f3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=l3=×".chars().forEach(i -> calculator.key((char) i));
		"f3=33=×".chars().forEach(i -> calculator.key((char) i));
	}
}