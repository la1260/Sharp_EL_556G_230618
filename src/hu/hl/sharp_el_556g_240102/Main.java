package hu.hl.sharp_el_556g_240102;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

import hu.hl.sharp_el_556g_230926.Frame;

public class Main {
	private static DecimalFormat df= new DecimalFormat("#.#########");
	private String in_str= "";
	public static void main(String[] args) {
		HashMap<Integer, Integer> tm= new HashMap<Integer, Integer>();
		new Main();
	}
	public void rfr() {
		f.update(new String[]{"", (in_str+"e ").split("e")[0], (in_str+"e ").split("e")[1]});
	}
	Frame f;
	public Main() {
		key(16); // C
		KeyListener kl;
		f= new Frame(new KeyListener() {
			public void keyTyped(KeyEvent e) {
			}
			public void keyPressed(KeyEvent e) {
				f.setTitle(String.valueOf(getStatus()));
				int code= KeyCode.getCode(e);
				if (code<63) {
					key(code);
				}
				rfr();
			}
			public void keyReleased(KeyEvent e) {
			}
		});

/*		in_str= ""; System.out.println(getStatus()<<6);
		in_str= "1"; System.out.println(getStatus()<<6);
		in_str= "123456"; System.out.println(getStatus()<<6);
		
		System.out.println();
		in_str= "1."; System.out.println(getStatus()<<6);
		in_str= "12345.6789"; System.out.println(getStatus()<<6);
		in_str= "123456"; System.out.println(getStatus()<<6);
		in_str= "12345.67890"; System.out.println(getStatus()<<6);
		in_str= "1.e00"; System.out.println(getStatus()<<6);
		in_str= "1e00"; System.out.println(getStatus()<<6);
		in_str= "12345.6789e00"; System.out.println(getStatus()<<6);
		in_str= "1234567890e00"; System.out.println(getStatus()<<6);
		System.out.println();
		in_str= "1/4"; System.out.println(getStatus()<<6); //peresbe szám és per is 
		in_str= "33/333"; System.out.println(getStatus()<<6); //peresbe csak per
		in_str= "1/4/4"; System.out.println(getStatus()<<6); //peresbe csak szám
		in_str= "1111/222"; System.out.println(getStatus()<<6); //peresbe se szám se per
		System.out.println();
		in_str= "1°"; System.out.println(getStatus()<<6);
		in_str= "1°1°1°1"; System.out.println(getStatus()<<6);

		System.exit(4);
/*		print("1/1/1");
		print("1/1/22");
		print("1/1/333");
		print("1/22/1");
		print("1/22/22");
		print("1/22/333");
		print("1/333/1");
		print("1/333/22");
		print("1/333/333");
		print("22/1/1");
		print("22/1/22");
		print("22/1/333");
		print("22/22/1");
		print("22/22/22");
		print("22/22/333");
		print("22/333/1");
		print("22/333/22");
		print("22/333/333");
		print("333/1/1");
		print("333/1/22");
		print("333/1/333");
		print("333/22/1");
		print("333/22/22");
		print("333/22/333");
		print("333/333/1");
		print("333/333/22");
		print("4444/1");
		print("4444/22");
		print("4444/333");
		print("55555/1");
		print("55555/22");
		print("55555/333");
		print("666666/1");
		print("666666/22");
		print("666666/333");
		
		
/*		in_str= "1"; print();
		in_str= "1.5"; print();
		in_str= "-1"; print();
		in_str= "-1.5"; print();
		in_str= "1e01"; print();
		in_str= "1.5e01"; print();
		in_str= "-1e01"; print();
		in_str= "-1.5e01"; print();
		in_str= "1e-01"; print();
		in_str= "1.5e-01"; print();
		in_str= "-1e-01"; print();
		in_str= "-1.5e-01"; print();
		
		in_str= "1234567891"; print();
		in_str= "1.234567891"; print();
		in_str= "-1234567891"; print();
		in_str= "-1.234567891"; print();
		in_str= "1234567891e01"; print();
		in_str= "1.234567891e01"; print();
		in_str= "-1234567891e01"; print();
		in_str= "-1.234567891e01"; print();
		in_str= "1234567891e-01"; print();
		in_str= "1.234567891e-01"; print();
		in_str= "-1234567891e-01"; print();
		in_str= "-1.234567891e-01"; print();
		in_str= "abc1234567"; print();*/
	
//		Arrays.stream(new int[]{5, 4, 3, 16, 16, 16, 62, 63}).forEach(i -> key(i));
		
//		Arrays.stream(new int[]{17, 18, 0, 16}).forEach(i -> key(i));
//		Arrays.stream(new int[]{1, 2, 3, 21, 21, 16}).forEach(i -> key(i));
//		Arrays.stream(new int[]{17, 18, 2, 16}).forEach(i -> key(i));
//		Arrays.stream(new int[]{17, 18, 3, 16}).forEach(i -> key(i));
//		Arrays.stream(new int[]{17, 18, 4, 16}).forEach(i -> key(i));
//		Arrays.stream(new int[]{17, 18, 5, 16}).forEach(i -> key(i));
//		Arrays.stream(new int[]{17, 18, 6, 16}).forEach(i -> key(i));
//		Arrays.stream(new int[]{17, 18, 7, 16}).forEach(i -> key(i));
//		Arrays.stream(new int[]{17, 18, 8, 16}).forEach(i -> key(i));
//		Arrays.stream(new int[]{17, 18, 9, 16}).forEach(i -> key(i));
//		Arrays.stream(new int[]{17, 18, 17, 16}).forEach(i -> key(i));
//		Arrays.stream(new int[]{17, 18, 18, 16}).forEach(i -> key(i));
//		Arrays.stream(new int[]{17, 18, 19, 16}).forEach(i -> key(i));
//		Arrays.stream(new int[]{17, 18, 20, 16}).forEach(i -> key(i));
//		Arrays.stream(new int[]{17, 18, 21, 16}).forEach(i -> key(i));
//		Arrays.stream(new int[]{17, 18, 22, 16}).forEach(i -> key(i));
//		Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 19, 20}).forEach(i -> key(i));
//		Arrays.stream(new int[]{1, 16, 17, 17, 19, 20}).forEach(i -> key(i));
//		Arrays.stream(new int[]{1, 16, 17, 18, 19, 20}).forEach(i -> key(i));
//		Arrays.stream(new int[]{1, 16, 17, 18, 19, 20}).forEach(i -> key(i));
//		Arrays.stream(new int[]{1, 2, 19, 20}).forEach(i -> key(i));
//		Arrays.stream(new int[]{1, 2, 3, 19, 20}).forEach(i -> key(i));
//		Arrays.stream(new int[]{1, 2, 3, 4, 19, 20}).forEach(i -> key(i));
//		Arrays.stream(new int[]{1, 2, 3, 4, 5, 19, 20}).forEach(i -> key(i));
//		Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 19, 20}).forEach(i -> key(i));
//		Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 19, 20}).forEach(i -> key(i));
//		Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 19, 20}).forEach(i -> key(i));
//		Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 19, 20}).forEach(i -> key(i));
//		Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 19, 20}).forEach(i -> key(i));
	}
	private int getStatus() {
		return
			in_str.isEmpty() ? 7 :
			((in_str.matches("^.*\\.$") || in_str.matches("^.*/[0-9]{3}$") || in_str.matches("^[0-9]{3}/[0-9]{3}/[0-9]{2}$") || in_str.matches("^.*°.*°.*°.*$")) ? 1 : 0)<<6 |
			((in_str.matches("^.*/.*/.*$") || in_str.matches("^.*/$")) ? 1 : 0)<<5 |
			(
					(in_str.matches(".*e.*")) ? 4 : (in_str.matches(".*\\..*")) ? 2 : (in_str.matches(".*/.*")) ? 6 : (in_str.matches(".*°.*")) ? 7 : 0
			)<<2 |
			(
				(in_str.replace(".", "").matches("^-?[0-9]{10}.*$")) ? 5 :
				(in_str.replace(".", "").matches("^-?[0-9]{7,}.*$")) ? 4 :
				(in_str.replace(".", "").matches("^-?[0-9]{5,}.*$")) ? 3 :
				(in_str.replace(".", "").matches("^-?[0-9]{4,}.*$")) ? 2 :
				(in_str.replace(".", "").matches("^-?[0-9]{2,}.*$")) ? 1 : 0
			)
		;
	}
	private void key(int code) {
		int stat= getStatus()<<6 | code;
		switch (stat) {
		case 206: 
		case 269: 
		case 270: 
		case 321: 
		case 322: 
		case 323: 
		case 324: 
		case 325: 
		case 326: 
		case 327: 
		case 328: 
		case 329: 
		case 330: 
		case 331: 
		case 333: 
		case 334: 
		case 449: 
		case 461: 
		case 462: 
		case 463: 
		case 464: 
		case 587: 
		case 589: 
		case 590: 
		case 651: 
		case 653: 
		case 654: 
		case 715: 
		case 717: 
		case 718: 
		case 779: 
		case 781: 
		case 782: 
		case 833: 
		case 834: 
		case 835: 
		case 836: 
		case 837: 
		case 838: 
		case 839: 
		case 840: 
		case 841: 
		case 842: 
		case 843: 
		case 845: 
		case 846: 
		case 1035: 
		case 1036: 
		case 1037: 
		case 1038: 
		case 1099: 
		case 1100: 
		case 1101: 
		case 1102: 
		case 1163: 
		case 1164: 
		case 1165: 
		case 1166: 
		case 1227: 
		case 1228: 
		case 1229: 
		case 1230: 
		case 1291: 
		case 1292: 
		case 1293: 
		case 1294: 
		case 1355: 
		case 1356: 
		case 1357: 
		case 1358: 
		case 1547: 
		case 1548: 
		case 1550: 
		case 1611: 
		case 1612: 
		case 1614: 
		case 1675: 
		case 1676: 
		case 1677: 
		case 1678: 
		case 1739: 
		case 1740: 
		case 1741: 
		case 1742: 
		case 1803: 
		case 1804: 
		case 1805: 
		case 1867: 
		case 1868: 
		case 1869: 
		case 1931: 
		case 1932: 
		case 1933: 
		case 3595: 
		case 3596: 
		case 3597: 
		case 3598: 
		case 3659: 
		case 3660: 
		case 3661: 
		case 3662: 
		case 3723: 
		case 3724: 
		case 3725: 
		case 3726: 
		case 3787: 
		case 3788: 
		case 3789: 
		case 3790: 
		case 4619: 
		case 4621: 
		case 4622: 
		case 4683: 
		case 4685: 
		case 4686: 
		case 4747: 
		case 4749: 
		case 4750: 
		case 4811: 
		case 4813: 
		case 4814: 
		case 4875: 
		case 4877: 
		case 4878: 
		case 5633: 
		case 5634: 
		case 5635: 
		case 5636: 
		case 5637: 
		case 5638: 
		case 5639: 
		case 5640: 
		case 5641: 
		case 5642: 
		case 5643: 
		case 5644: 
		case 5646: 
		case 5697: 
		case 5698: 
		case 5699: 
		case 5700: 
		case 5701: 
		case 5702: 
		case 5703: 
		case 5704: 
		case 5705: 
		case 5706: 
		case 5707: 
		case 5708: 
		case 5710: 
		case 5761: 
		case 5762: 
		case 5763: 
		case 5764: 
		case 5765: 
		case 5766: 
		case 5767: 
		case 5768: 
		case 5769: 
		case 5770: 
		case 5771: 
		case 5772: 
		case 5773: 
		case 5774: 
		case 5825: 
		case 5826: 
		case 5827: 
		case 5828: 
		case 5829: 
		case 5830: 
		case 5831: 
		case 5832: 
		case 5833: 
		case 5834: 
		case 5835: 
		case 5836: 
		case 5837: 
		case 5838: 
		case 5899: 
		case 5900: 
		case 5901: 
		case 5902: 
		case 5963: 
		case 5964: 
		case 5965: 
		case 5966: 
		case 6027: 
		case 6028: 
		case 6029: 
		case 6030: 
		case 7681: 
		case 7682: 
		case 7683: 
		case 7684: 
		case 7685: 
		case 7686: 
		case 7687: 
		case 7688: 
		case 7689: 
		case 7690: 
		case 7691: 
		case 7692: 
		case 7693: 
		case 7694: 
		case 7745: 
		case 7746: 
		case 7747: 
		case 7748: 
		case 7749: 
		case 7750: 
		case 7751: 
		case 7752: 
		case 7753: 
		case 7754: 
		case 7755: 
		case 7756: 
		case 7757: 
		case 7758: break; //semmi
		case 0: 
		case 64: 
		case 128: 
		case 192: 
		case 256: 
		case 320: 
		case 448: 
		case 576: 
		case 640: 
		case 704: 
		case 768: 
		case 832: 
		case 1024: 
		case 1088: 
		case 1152: 
		case 1216: 
		case 1280: 
		case 1344: 
		case 1536: 
		case 1600: 
		case 1664: 
		case 1728: 
		case 1792: 
		case 1856: 
		case 1920: 
		case 3584: 
		case 3648: 
		case 3712: 
		case 3776: 
		case 4608: 
		case 4672: 
		case 4736: 
		case 4800: 
		case 4864: 
		case 5632: 
		case 5696: 
		case 5760: 
		case 5824: 
		case 5888: 
		case 5952: 
		case 6016: 
		case 7680: 
		case 7744: in_str= ""; break;
		case 1: 
		case 65: 
		case 129: 
		case 193: 
		case 257: 
		case 577: 
		case 641: 
		case 705: 
		case 769: 
		case 1537: 
		case 1601: 
		case 1665: 
		case 1729: 
		case 3585: 
		case 3649: 
		case 3713: 
		case 3777: 
		case 4609: 
		case 4673: 
		case 4737: 
		case 4801: 
		case 4865: in_str+= "0"; break;
		case 2: 
		case 66: 
		case 130: 
		case 194: 
		case 258: 
		case 450: 
		case 578: 
		case 642: 
		case 706: 
		case 770: 
		case 1538: 
		case 1602: 
		case 1666: 
		case 1730: 
		case 3586: 
		case 3650: 
		case 3714: 
		case 3778: 
		case 4610: 
		case 4674: 
		case 4738: 
		case 4802: 
		case 4866: in_str+= "1"; break;
		case 3: 
		case 67: 
		case 131: 
		case 195: 
		case 259: 
		case 451: 
		case 579: 
		case 643: 
		case 707: 
		case 771: 
		case 1539: 
		case 1603: 
		case 1667: 
		case 1731: 
		case 3587: 
		case 3651: 
		case 3715: 
		case 3779: 
		case 4611: 
		case 4675: 
		case 4739: 
		case 4803: 
		case 4867: in_str+= "2"; break;
		case 4: 
		case 68: 
		case 132: 
		case 196: 
		case 260: 
		case 452: 
		case 580: 
		case 644: 
		case 708: 
		case 772: 
		case 1540: 
		case 1604: 
		case 1668: 
		case 1732: 
		case 3588: 
		case 3652: 
		case 3716: 
		case 3780: 
		case 4612: 
		case 4676: 
		case 4740: 
		case 4804: 
		case 4868: in_str+= "3"; break;
		case 5: 
		case 69: 
		case 133: 
		case 197: 
		case 261: 
		case 453: 
		case 581: 
		case 645: 
		case 709: 
		case 773: 
		case 1541: 
		case 1605: 
		case 1669: 
		case 1733: 
		case 3589: 
		case 3653: 
		case 3717: 
		case 3781: 
		case 4613: 
		case 4677: 
		case 4741: 
		case 4805: 
		case 4869: in_str+= "4"; break;
		case 6: 
		case 70: 
		case 134: 
		case 198: 
		case 262: 
		case 454: 
		case 582: 
		case 646: 
		case 710: 
		case 774: 
		case 1542: 
		case 1606: 
		case 1670: 
		case 1734: 
		case 3590: 
		case 3654: 
		case 3718: 
		case 3782: 
		case 4614: 
		case 4678: 
		case 4742: 
		case 4806: 
		case 4870: in_str+= "5"; break;
		case 7: 
		case 71: 
		case 135: 
		case 199: 
		case 263: 
		case 455: 
		case 583: 
		case 647: 
		case 711: 
		case 775: 
		case 1543: 
		case 1607: 
		case 1671: 
		case 1735: 
		case 3591: 
		case 3655: 
		case 3719: 
		case 3783: 
		case 4615: 
		case 4679: 
		case 4743: 
		case 4807: 
		case 4871: in_str+= "6"; break;
		case 8: 
		case 72: 
		case 136: 
		case 200: 
		case 264: 
		case 456: 
		case 584: 
		case 648: 
		case 712: 
		case 776: 
		case 1544: 
		case 1608: 
		case 1672: 
		case 1736: 
		case 3592: 
		case 3656: 
		case 3720: 
		case 3784: 
		case 4616: 
		case 4680: 
		case 4744: 
		case 4808: 
		case 4872: in_str+= "7"; break;
		case 9: 
		case 73: 
		case 137: 
		case 201: 
		case 265: 
		case 457: 
		case 585: 
		case 649: 
		case 713: 
		case 777: 
		case 1545: 
		case 1609: 
		case 1673: 
		case 1737: 
		case 3593: 
		case 3657: 
		case 3721: 
		case 3785: 
		case 4617: 
		case 4681: 
		case 4745: 
		case 4809: 
		case 4873: in_str+= "8"; break;
		case 10: 
		case 74: 
		case 138: 
		case 202: 
		case 266: 
		case 458: 
		case 586: 
		case 650: 
		case 714: 
		case 778: 
		case 1546: 
		case 1610: 
		case 1674: 
		case 1738: 
		case 3594: 
		case 3658: 
		case 3722: 
		case 3786: 
		case 4618: 
		case 4682: 
		case 4746: 
		case 4810: 
		case 4874: in_str+= "9"; break;
		case 11: 
		case 75: 
		case 139: 
		case 203: 
		case 267: in_str+= "."; break;
		case 12: 
		case 76: 
		case 140: 
		case 204: 
		case 268: 
		case 332: 
		case 588: 
		case 652: 
		case 716: 
		case 780: 
		case 844: 
		case 4620: 
		case 4684: 
		case 4748: 
		case 4812: 
		case 4876: in_str+= "e00"; break;
		case 13: 
		case 77: 
		case 141: 
		case 205: 
		case 1549: 
		case 1613: 
		case 5645: 
		case 5709: in_str+= "/"; break;
		case 14: 
		case 78: 
		case 142: 
		case 1806: 
		case 1870: 
		case 1934: in_str+= "°00"; break;
		case 459: in_str= "0."; break;
		case 460: in_str= "1e00"; break;
		case 15: 
		case 79: 
		case 143: 
		case 207: 
		case 271: 
		case 335: 
		case 591: 
		case 655: 
		case 719: 
		case 783: 
		case 847: 
		case 1551: 
		case 1615: 
		case 1679: 
		case 1743: 
		case 3599: 
		case 3663: 
		case 3727: 
		case 3791: 
		case 4623: 
		case 5647: 
		case 5711: 
		case 5775: 
		case 5839: 
		case 7695: 
		case 7759: in_str= in_str.replaceAll("^(.*).$", "$1"); break; //utolsót levágja
		case 4687: 
		case 4751: 
		case 4815: 
		case 4879: in_str= in_str.replaceAll("^(.*)..$", "$1"); break; //utolsó kettőt levágja
		case 1025: 
		case 1089: 
		case 1153: 
		case 1217: 
		case 1281: 
		case 1345: 
		case 1793: 
		case 1857: 
		case 1921: 
		case 5889: 
		case 5953: 
		case 6017: in_str= in_str.replaceAll("^(.*).(.)$", "$1$2")+"0"; break; //utolsó előttit törli; hozzáadja a 0-t
		case 1026: 
		case 1090: 
		case 1154: 
		case 1218: 
		case 1282: 
		case 1346: 
		case 1794: 
		case 1858: 
		case 1922: 
		case 5890: 
		case 5954: 
		case 6018: in_str= in_str.replaceAll("^(.*).(.)$", "$1$2")+"1"; break; //utolsó előttit törli; hozzáadja a 1-t
		case 1027: 
		case 1091: 
		case 1155: 
		case 1219: 
		case 1283: 
		case 1347: 
		case 1795: 
		case 1859: 
		case 1923: 
		case 5891: 
		case 5955: 
		case 6019: in_str= in_str.replaceAll("^(.*).(.)$", "$1$2")+"2"; break; //utolsó előttit törli; hozzáadja a 2-t
		case 1028: 
		case 1092: 
		case 1156: 
		case 1220: 
		case 1284: 
		case 1348: 
		case 1796: 
		case 1860: 
		case 1924: 
		case 5892: 
		case 5956: 
		case 6020: in_str= in_str.replaceAll("^(.*).(.)$", "$1$2")+"3"; break; //utolsó előttit törli; hozzáadja a 3-t
		case 1029: 
		case 1093: 
		case 1157: 
		case 1221: 
		case 1285: 
		case 1349: 
		case 1797: 
		case 1861: 
		case 1925: 
		case 5893: 
		case 5957: 
		case 6021: in_str= in_str.replaceAll("^(.*).(.)$", "$1$2")+"4"; break; //utolsó előttit törli; hozzáadja a 4-t
		case 1030: 
		case 1094: 
		case 1158: 
		case 1222: 
		case 1286: 
		case 1350: 
		case 1798: 
		case 1862: 
		case 1926: 
		case 5894: 
		case 5958: 
		case 6022: in_str= in_str.replaceAll("^(.*).(.)$", "$1$2")+"5"; break; //utolsó előttit törli; hozzáadja a 5-t
		case 1031: 
		case 1095: 
		case 1159: 
		case 1223: 
		case 1287: 
		case 1351: 
		case 1799: 
		case 1863: 
		case 1927: 
		case 5895: 
		case 5959: 
		case 6023: in_str= in_str.replaceAll("^(.*).(.)$", "$1$2")+"6"; break; //utolsó előttit törli; hozzáadja a 6-t
		case 1032: 
		case 1096: 
		case 1160: 
		case 1224: 
		case 1288: 
		case 1352: 
		case 1800: 
		case 1864: 
		case 1928: 
		case 5896: 
		case 5960: 
		case 6024: in_str= in_str.replaceAll("^(.*).(.)$", "$1$2")+"7"; break; //utolsó előttit törli; hozzáadja a 7-t
		case 1033: 
		case 1097: 
		case 1161: 
		case 1225: 
		case 1289: 
		case 1353: 
		case 1801: 
		case 1865: 
		case 1929: 
		case 5897: 
		case 5961: 
		case 6025: in_str= in_str.replaceAll("^(.*).(.)$", "$1$2")+"8"; break; //utolsó előttit törli; hozzáadja a 8-t
		case 1034: 
		case 1098: 
		case 1162: 
		case 1226: 
		case 1290: 
		case 1354: 
		case 1802: 
		case 1866: 
		case 1930: 
		case 5898: 
		case 5962: 
		case 6026: in_str= in_str.replaceAll("^(.*).(.)$", "$1$2")+"9"; break; //utolsó előttit törli; hozzáadja a 9-t
		case 1039: 
		case 1103: 
		case 1167: 
		case 1231: 
		case 1295: 
		case 1359: 
		case 1807: 
		case 1871: 
		case 1935: 
		case 5903: 
		case 5967: 
		case 6031: in_str= in_str.replaceAll("^(.*)(.).$", "$1×$2").replace("×", "0"); break; //utolsó előttibe 0-t szúr, utolsót levágja
		case 16: 
		case 80: 
		case 144: 
		case 208: 
		case 272: 
		case 336: 
		case 592: 
		case 656: 
		case 720: 
		case 784: 
		case 848: 
		case 1552: 
		case 1616: 
		case 1680: 
		case 1744: 
		case 1808: 
		case 1872: 
		case 1936: 
		case 3600: 
		case 3664: 
		case 3728: 
		case 3792: 
		case 4624: 
		case 4688: 
		case 4752: 
		case 4816: 
		case 4880: 
		case 5648: 
		case 5712: 
		case 5776: 
		case 5840: 
		case 5904: 
		case 5968: 
		case 6032: 
		case 7696: 
		case 7760: in_str= ("-"+in_str).replace("--", ""); break; //előjelet vált a mantissza előtt
		case 1040: 
		case 1104: 
		case 1168: 
		case 1232: 
		case 1296: 
		case 1360: in_str= in_str.replace("e", "e-").replace("--", ""); break; //előjelet vált az exponens előtt
		
		case 17:
		case 81:
		case 145:
		case 209:
		case 273:
		case 337:
		case 465:
		case 593:
		case 657:
		case 721:
		case 785:
		case 849:
		case 1041:
		case 1105:
		case 1169:
		case 1233:
		case 1297:
		case 1361:
		case 1553:
		case 1617:
		case 1681:
		case 1745:
		case 1809:
		case 1873:
		case 1937:
		case 3601:
		case 3665:
		case 3729:
		case 3793:
		case 4625:
		case 4689:
		case 4753:
		case 4817:
		case 4881:
		case 5649:
		case 5713:
		case 5777:
		case 5841:
		case 5905:
		case 5969:
		case 6033:
		case 7697:
		case 7761:
			break;
		default: System.out.print("hlba!"); System.exit(stat); break;
		}
		System.out.println(in_str+", "+getStatus()+","+code+":"+stat);
	}
	private void imput() {
		
	}
}