insert into usuario(nombre, password, username) values('Christian Marcatoma','chris', 'chrisadr');
insert into usuario(nombre, password, username) values('Lourdes Espinoza','adri', 'luluadr');
insert into banco (institucion) values ('Banco del Austro');
insert into banco (institucion) values ('Cooperativa JEP');

insert into cuenta_bancaria (monto_credito, monto_efectivo, numero_cuenta, banco_id) values (0.0, 0.86, '789456123', 1);
insert into cuenta_bancaria (monto_credito, monto_efectivo, numero_cuenta, banco_id) values (0.0, 0.0, '789456123025', 2);

insert into cuenta_bancaria_usuario (cuenta_bancaria_id, usuario_id) values(1,1);
insert into cuenta_bancaria_usuario (cuenta_bancaria_id, usuario_id) values(2,1);
insert into cuenta_bancaria_usuario (cuenta_bancaria_id, usuario_id) values(1,2);