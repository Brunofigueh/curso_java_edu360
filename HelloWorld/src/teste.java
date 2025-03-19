import java.util.ArrayList;
import java.util.Collections;

public class teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//            012345678910
		String cpf = "11144477705";
		
	
		
		//String pCpf;
		//pCpf = cpf.substring(0, 9);
		//System.out.println(pCpf);
		
		
		//String  fCpf;
		//fCpf = cpf.substring(11, 12);
		//System.out.println(fCpf);
		
		//int cpff = 111444777;
		//int tot = 0;
		//int multiplicador = 2;
		
		//9 primeiros digitos do CPF
			
		//9 primeiros digitos do CPF
		String vCpf1 = cpf.substring(0, 9);
		
		//primeiro digito do cpf
		String dCpf1 = cpf.substring(9, 10);
		
		//segundo digito do cpf
		String dCpf2 = cpf.substring(10, 11);
		
		//lista para armazenar 9 primeiros digitos
		ArrayList<Integer> cpfValid1 = new ArrayList<>();
		
		//Fasendo conversão para intenrio da primeira parte do cpf, os nove digitos;
		try {
			vCpf1.strip();
			// = Integer.parseInt(vCpf1.strip());
			for (char num : vCpf1.toCharArray()) {
				
				int number = num - '0';
				
				cpfValid1.add(number);
			}
		
		}catch (Exception e) {
			System.out.println("Erro de cast fase 1.");
		}
		
		//Convertendo primeiro Digito do Cpf
		try {
			int dCpf1_ = Integer.parseInt(dCpf2.strip());
		}catch (Exception e) {
			System.out.println("Erro de cast fase 2.");
		}
		
		//Convertendo segundo Digito do cpf
		try {
			int dCpf2_ = Integer.parseInt(dCpf2.strip());
		}catch (Exception e) {
			System.out.println("Erro de cast fase 3.");
		}
		
		
		//Calcuculo primeiro digito
		for(int i=2; i <= 11; i++ )
		{
			
		}
		
		Collections.reverse(cpfValid1);
		System.out.println(cpfValid1);
		
			
	
	}

}
