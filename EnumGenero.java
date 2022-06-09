public enum EnumGenero{
    MASCULINO("Masculino"),
    FEMININO ("Feminino" );
	 
    private String descricao;
    
    EnumGenero(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return descricao;
    }
}