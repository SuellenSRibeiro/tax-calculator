# Tax Calculator
## O objetivo é calcular a quantia de imposto que um contribuinte deve pagar com base em sua renda anual e outros fatores específicos.

Os códigos foram criados usando a programação orientada a objetos, com a classe abstrata TaxPayer como classe pai e as classes Individual e Company como classes filhas. A classe Individual é usada para contribuintes individuais e a classe Company é usada para empresas. O cálculo de imposto é feito com base nas informações do objeto de cada classe.

## Programa Principal
O programa principal Program.java é responsável por lidar com a entrada do usuário e chamar as funções apropriadas para calcular o imposto de cada contribuinte. Ele inicia pedindo ao usuário o número de contribuintes e, em seguida, solicita as informações necessárias para cada contribuinte, como o nome, renda anual e outros fatores específicos, dependendo se o contribuinte é uma pessoa física ou uma empresa. O programa calcula e exibe a quantia de imposto que cada contribuinte deve pagar, bem como o total de impostos pagos por todos os contribuintes.

## Classes Individual e Company
As classes Individual e Company estendem a classe abstrata TaxPayer e implementam o método tax() de maneira diferente. O método tax() calcula o imposto que o contribuinte deve pagar com base nas informações específicas de cada objeto. A classe Individual leva em consideração as despesas com saúde do contribuinte e a classe Company considera o número de funcionários da empresa.

## Classe Abstrata TaxPayer
A classe abstrata TaxPayer é a classe pai que fornece o modelo geral para as classes Individual e Company. Ele contém as propriedades name e annualIncome e fornece métodos de acesso e modificação para essas propriedades. A classe abstrata também contém o método abstrato tax() que deve ser implementado pelas classes filhas.

## Classe BusinessException
A classe BusinessException é uma exceção personalizada que pode ser lançada se houver um erro de entrada do usuário. A mensagem de erro pode ser passada como um parâmetro ao lançar uma exceção dessa classe. Essa classe pode ser usada para lidar com exceções específicas em vez de usar as exceções genéricas já fornecidas pelo Java.
