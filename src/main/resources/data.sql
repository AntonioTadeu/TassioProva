INSERT INTO categoria(id, imagemSimboloUrl, nome, descricao)
VALUES (1, 'https://yellmobile.vteximg.com.br/arquivos/ids/167890-1000-1000/celular-samsung-galaxy-a12-vermelho-64gb-tela-4gb-ram-4-camera-yell-mobile-04.jpg?v=637632648473430000', 'Celular', 'texto exemplo');

INSERT INTO Produto(id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao, valorUnitario)
VALUES(1, 'Moto G5 Plus', 'Celular com rede 5G', 'https://a-static.mlcdn.com.br/1500x1500/capa-anti-shock-pelicula-de-gel-para-motorola-moto-g-5g-plus-fse-acessorios/fseacessorios/649007779/34a012d10687d5687c256baf47255f76.jpg', '2021-09-22', CURRENT_TIMESTAMP(), 1799.00);

INSERT INTO Produto(id, nome, descricao, fotoUrl, dataCadastro, dataUltimaAtualizacao, valorUnitario)
VALUES(2, 'Samsung Galaxy S9', 'Nova versão da Samsung', 'https://www.maniavirtual.com.br/content/images/thumbs/0072663_600.gif', '2021-09-21', CURRENT_TIMESTAMP(), 1899.00);

INSERT INTO categoriaProduto(id, id_categoria, id_produto)
VALUES (1, 1, 1), (2,1,2);

INSERT INTO tabelaPromocao(id, nome, descricao, dataInicio, dataFim, dataCadastro, dataUltimaAtualizacao)
VALUES (1, 'Promoção relampago', 'celular', '2021-09-25', '2021-09-27', '2021-09-30', CURRENT_TIMESTAMP());

INSERT INTO promocaoItem(id, valorPromocao, dataCadastro, dataUltimaAtualizacao, id_tabelaPromocao, id_produto)
VALUES (1, 200, '2021-09-30', CURRENT_TIMESTAMP(), 1, 1);