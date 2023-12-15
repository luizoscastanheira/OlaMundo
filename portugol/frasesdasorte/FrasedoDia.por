programa
{
    funcao inicio()
    {
    //declarando variáveis
    inteiro dia
    

    escreva("FRASE DA SORTE DO ANIVERSÁRIO")
    escreva("*****************************")
    escreva("Escreva o dia do seu aniversário:")
    //entrada de dados
    leia(dia)

    escreva("****************  " + "  ****************")
    escreva("O dia do seu aniversário é: " + dia+".")

    escolha(dia)
    {
    caso 1:
        escreva("Dia Bão")
    caso 2:
        escreva("Dia Bão também")    
    }
    
    }
}