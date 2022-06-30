insert into usuario(nombre, password, username) values('Christian Marcatoma','chris', 'chrisadr');
insert into usuario(nombre, password, username) values('Lourdes Espinoza','adri', 'luluadr');
insert into banco (institucion) values ('Banco del Austro');
insert into banco (institucion) values ('Cooperativa JEP');

insert into tipo_cuenta (tipo) values ('AHORROS');
insert into tipo_cuenta (tipo) values ('CORRIENTE');

insert into cuenta_bancaria (monto_credito, monto_efectivo, numero_cuenta, tipo_cuenta_id, banco_id) values (0.0, 0.86, '789456123',1 ,1);
insert into cuenta_bancaria (monto_credito, monto_efectivo, numero_cuenta, tipo_cuenta_id, banco_id) values (0.0, 0.0, '789456123025',1 ,2);

insert into cuenta_bancaria_usuario (cuenta_bancaria_id, usuario_id) values(1,1);
insert into cuenta_bancaria_usuario (cuenta_bancaria_id, usuario_id) values(2,1);
insert into cuenta_bancaria_usuario (cuenta_bancaria_id, usuario_id) values(1,2);

insert into tipo_transaccion (signo, tipo_trans) values ('-', 'PAGO');
insert into tipo_transaccion (signo, tipo_trans) values ('+', 'DEPOSITO');
insert into tipo_transaccion (signo, tipo_trans) values ('-', 'DEBITO');
insert into tipo_transaccion (signo, tipo_trans) values ('+', 'GIRO');
insert into tipo_transaccion (signo, tipo_trans) values ('-', 'RECARGA');

insert into transaccion (concepto, monto, cuenta_bancaria_id, tipo_trans_id, usuario_id) values ('giro al ecuador', 500.00, 1, 4, 2);

