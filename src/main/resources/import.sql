insert into usuario(nombre, password, username, email) values('Christian Marcatoma','chris', 'chrisadr', 'marcatoma99@gmail.com');
insert into usuario(nombre, password, username, email) values('Lourdes Espinoza','adri', 'luluadr', 'lourdesespinoza@gmail.com');
insert into banco (institucion, imagen) values ('Banco del Austro', 'jep.png');
insert into banco (institucion, imagen) values ('Cooperativa JEP', 'austro.png');

insert into tipo_cuenta (tipo) values ('AHORROS');
insert into tipo_cuenta (tipo) values ('CORRIENTE');

insert into prestador (nombre) values ('Nube Marcatoma');
insert into prestador (nombre) values ('Rosario pena');
insert into prestador (nombre) values ('Andres Marcatoma');

insert into credito (cantidad_a_deber, cantidad_pagada, descripcion, pagado, prestador_id) values (250, 0, 'Credito para pagar el unifirme', false, 1);

insert into cuenta_bancaria (monto_credito, monto_efectivo, numero_cuenta, tipo_cuenta_id, banco_id) values (0.0, 1599.80, '789456123',1 ,1);
insert into cuenta_bancaria (monto_credito, monto_efectivo, numero_cuenta, tipo_cuenta_id, banco_id) values (0.0, 10500.99, '789456123025',1 ,2);

insert into cuenta_bancaria_usuario (cuenta_bancaria_id, usuario_id) values(1,1);
insert into cuenta_bancaria_usuario (cuenta_bancaria_id, usuario_id) values(2,1);
insert into cuenta_bancaria_usuario (cuenta_bancaria_id, usuario_id) values(1,2);

insert into tipo_transaccion (signo, tipo_trans) values ('-', 'PAGO');
insert into tipo_transaccion (signo, tipo_trans) values ('+', 'DEPOSITO');
insert into tipo_transaccion (signo, tipo_trans) values ('-', 'DEBITO');
insert into tipo_transaccion (signo, tipo_trans) values ('+', 'GIRO');
insert into tipo_transaccion (signo, tipo_trans) values ('-', 'RECARGA');
insert into tipo_transaccion (signo, tipo_trans) values ('+', 'CREDITO');

insert into transaccion (concepto, monto, cuenta_bancaria_id, tipo_trans_id, usuario_id, created_at, updated_at) values ('gráfico al ecuador', 500.00, 1, 4, 2, '2022-06-30','2022-06-30');
insert into transaccion (concepto, monto, cuenta_bancaria_id, tipo_trans_id, usuario_id, created_at, updated_at) values ('debito luz casa', 5.45, 1, 3, 2, '2022-06-30','2022-06-30');
insert into transaccion (concepto, monto, cuenta_bancaria_id, tipo_trans_id, usuario_id, created_at, updated_at) values ('Deposito dinero de la semana', 50.00, 1, 2, 2, '2022-06-30','2022-06-30');
insert into transaccion (concepto, monto, cuenta_bancaria_id, tipo_trans_id, usuario_id, created_at, updated_at) values ('pago mensual del carro', 299.90, 1, 1, 2, '2022-06-30','2022-06-30');
insert into transaccion (concepto, monto, cuenta_bancaria_id, tipo_trans_id, usuario_id, created_at, updated_at) values ('Recarga de internet del telefono', 500.00, 1, 5, 2, '2022-06-30','2022-06-30');
insert into transaccion (concepto, monto, cuenta_bancaria_id, tipo_trans_id, usuario_id, created_at, updated_at, credito_id) values ('Pago de: prestamo para el uniforme ref del prestamo id: 1', 100.00, 1, 1, 2, '2022-06-30','2022-06-30', 1);
insert into transaccion (concepto, monto, cuenta_bancaria_id, tipo_trans_id, usuario_id, created_at, updated_at, credito_id) values ('Pago de: prestamo para el uniforme ref del prestamo id: 1', 100.00, 1, 1, 2, '2022-06-30','2022-06-30', 1);
