CREATE TABLE Produto (
    id INT NOT NULL,
    nome VARCHAR(50) NOT NULL,
    descricao VARCHAR(200),
    fotoUrl VARCHAR(400),
    dataCadastro DATE,
    dataUltimaAtualizacao TIMESTAMP,
    valorUnitario FLOAT(5.2)
);