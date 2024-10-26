# Conversão de Moedas com ExchangeRate-API

Este projeto foi desenvolvido como parte da formação **Oracle Next Education** oferecida pela **Alura**, com foco em **Backend Java**. Ele utiliza a [ExchangeRate-API](https://www.exchangerate-api.com/) para realizar a conversão de moedas entre diferentes países, baseado em dois códigos de moeda fornecidos pelo usuário.

## Índice
- [Descrição](#descrição)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Funcionalidades](#funcionalidades)
- [Configuração do Ambiente](#configuração-do-ambiente)
- [Como Usar](#como-usar)
- [Contribuições](#contribuições)
- [Licença](#licença)

## Descrição

Este projeto em **Java** permite a conversão de valores entre moedas, com base nas taxas de câmbio fornecidas pela **ExchangeRate-API**. O usuário fornece dois códigos de moeda (ex: USD para dólar americano e BRL para real brasileiro) e o valor a ser convertido, e o sistema retorna a taxa de conversão e o valor convertido.

Este repositório faz parte do curso **Backend com Java** oferecido na formação Oracle Next Education, onde são abordados os fundamentos de **APIs RESTful** e integração com APIs externas.

## Tecnologias Utilizadas

- **Java 11+**
- **ExchangeRate-API**
- **Gson** (para manipulação de JSON)

## Funcionalidades

- Conexão com a **ExchangeRate-API** para obter as taxas de câmbio atuais.
- Recebe dois códigos de moeda e calcula o valor convertido com base na taxa de câmbio entre elas.
- Gera uma resposta JSON com os detalhes da conversão.

## Configuração do Ambiente

1. Clone este repositório:
   ```bash
   git clone https://github.com/joasgabriel/ONECurrencyConversor.git
   cd nome-do-repositorio
   ```

2. Crie uma conta na [ExchangeRate-API](https://www.exchangerate-api.com) para obter uma API Key.

3. Adicione a chave de API no código onde é feita a requisição à ExchangeRate-API, substituindo YOUR_API_KEY pela sua chave.

## Como Usar

O programa permite a conversão de valores entre duas moedas especificadas, retornando um JSON com os detalhes da conversão.

### Exemplo de Resposta JSON

A resposta da conversão segue o seguinte formato JSON:

```
{
    "valorParaConverter": 5.0,
    "valorConvertido": 28.343500000000002,
    "codigoMoedaOrigem": "USD",
    "codigoMoedaDestino": "BRL",
    "taxaDeCambio": 5.6687
}
```

- **valorParaConverter**: Valor informado para a conversão.
- **valorConvertido**: Valor convertido para a moeda de destino.
- **codigoMoedaOrigem**: Código da moeda de origem.
- **codigoMoedaDestino**: Código da moeda de destino.
- **taxaDeCambio**: Taxa de câmbio entre as duas moedas.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma Issue ou um Pull Request com melhorias, correções de bugs ou novas funcionalidades.

## Licença

Este projeto está licenciado sob a **MIT License**.

<div>
    <p>
        <img src="Badge-Conversor.png" height="300" tittle="site"> 
    </p>
</div>