
public enum FormaDePagamento {

		DINHEIRO("DIN", "Dinheiro"), 
		CARTAO_CREDITO("CCR", "Cartão de Crédito"),
		CARTAO_DEBITO("CCD", "Cartão de Débito"),
		PIX("PIX","Pagamento via pix."),
		TRASFERENCIA("TRN", "Transferência banciaria.");
	
		private final String codigo;
		private final String descricao;

		FormaDePagamento(String codigo, String descricao)
		{
			// TODO Auto-generated constructor stub
			this.codigo = codigo;
			this.descricao = descricao;
		}

		public String getCodigo()
		{
			return codigo;
		}

		public String getDescricao() 
		{
			return descricao;
		}
		
		
}
