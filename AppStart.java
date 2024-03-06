public class AppStart {
    public static void main(String[] args) {
        // Teste da classe enumerada Size
        
        // Obtendo e imprimindo as descrições de cada tamanho
        System.out.println("Descrições dos tamanhos:");
        System.out.println("Pequeno: " + Size.SMALL.getDescription());
        System.out.println("Médio: " + Size.MEDIUM.getDescription());
        System.out.println("Grande: " + Size.LARGE.getDescription());
        
        // Obtendo e imprimindo os valores mínimos de cada tamanho
        System.out.println("\nValores mínimos dos tamanhos:");
        System.out.println("Pequeno: " + Size.SMALL.getMinValue());
        System.out.println("Médio: " + Size.MEDIUM.getMinValue());
        System.out.println("Grande: " + Size.LARGE.getMinValue());
        
        // Obtendo e imprimindo os valores máximos de cada tamanho
        System.out.println("\nValores máximos dos tamanhos:");
        System.out.println("Pequeno: " + Size.SMALL.getMaxValue());
        System.out.println("Médio: " + Size.MEDIUM.getMaxValue());
        System.out.println("Grande: " + Size.LARGE.getMaxValue());
        
        // Obtendo e imprimindo os códigos de cada tamanho
        System.out.println("\nCódigos dos tamanhos:");
        System.out.println("Pequeno: " + Size.SMALL.getCode());
        System.out.println("Médio: " + Size.MEDIUM.getCode());
        System.out.println("Grande: " + Size.LARGE.getCode());
    }
}