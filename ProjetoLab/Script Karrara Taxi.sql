CREATE TABLE public."Veiculo"
(
    "Modelo" character varying COLLATE pg_catalog."default",
    "Placa" character varying COLLATE pg_catalog."default" NOT NULL,
    "Ano" integer,
    "Tipo Combustivel" character varying COLLATE pg_catalog."default",
    "Motor" character varying COLLATE pg_catalog."default",
    CONSTRAINT "Placa" PRIMARY KEY ("Placa")
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."Veiculo"
    OWNER to postgres;
	
CREATE TABLE public."Motorista"
(
    "Nome" character varying COLLATE pg_catalog."default",
    "Idade" integer,
    "CPF" character varying COLLATE pg_catalog."default" NOT NULL,
    "Endereco" character varying COLLATE pg_catalog."default",
    email character varying COLLATE pg_catalog."default",
    "Telefone" character varying COLLATE pg_catalog."default",
    "Habilitacao" character varying COLLATE pg_catalog."default",
    "Placa Veiculo" character varying COLLATE pg_catalog."default",
    CONSTRAINT "CPF" PRIMARY KEY ("CPF"),
    CONSTRAINT "Placa" FOREIGN KEY ("Placa Veiculo")
        REFERENCES public."Veiculo" ("Placa") MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."Motorista"
    OWNER to postgres;
	
CREATE TABLE public."Viagem"
(
    "Hora inicio" character varying COLLATE pg_catalog."default",
    "Hora Fim" character varying COLLATE pg_catalog."default",
	"ID" SERIAL,
    "Placa Veiculo" character varying COLLATE pg_catalog."default",
    "Valor" character varying COLLATE pg_catalog."default",
    CONSTRAINT "Placa" FOREIGN KEY ("Placa Veiculo")
        REFERENCES public."Veiculo" ("Placa") MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public."Viagem"
    OWNER to postgres;
	
	INSERT INTO public."Veiculo"(
	"Modelo", "Placa", "Ano","Tipo Combustivel", "Motor")
	VALUES ('Gol', 'TYR-0990', 2011,'Gasolina/Etanol', '1.6 Flex');
	INSERT INTO public."Veiculo"(
	"Modelo", "Placa", "Ano","Tipo Combustivel", "Motor")
	VALUES ('Vectra', 'FFF-3090', 2012,'Gasolina/Etanol', '1.8 Eco');
	INSERT INTO public."Veiculo"(
	"Modelo", "Placa", "Ano","Tipo Combustivel", "Motor")
	VALUES ('Palio Weekend', 'ROV-1345', 2014,'Gasolina/Etanol', '1.6 Flex');
	INSERT INTO public."Veiculo"(
	"Modelo", "Placa", "Ano", "Tipo Combustivel", "Motor")
	VALUES ('Corolla', 'HIM-1991', 2016,'Gasolina/Etanol', '2.0 Turbo');
	
	INSERT INTO public."Motorista"(
	"Nome", "Idade", "CPF", "Endereco", email, "Telefone", "Habilitacao","Placa Veiculo")
	VALUES ('João das Neves',30,'20030040001','Rua Miosotis 500 Bairro Universitario','jaodasneve@gmail.com','34988992233', '12345678910', 'FFF-3090');
	INSERT INTO public."Motorista"(
	"Nome", "Idade", "CPF", "Endereco", email, "Telefone", "Habilitacao","Placa Veiculo")
	VALUES ('Claudio Menezes',50,'40030040021','Avenida Paranaiba 50 Bairro Universitario','claudinhotaxicista@gmail.com','34999456743','01987654321', 'TYR-0990');
	INSERT INTO public."Motorista"(
	"Nome", "Idade", "CPF", "Endereco", email, "Telefone", "Habilitacao","Placa Veiculo")
	VALUES ('Mario Karrara',55,'70030043671','Rua Barão São Francisco 400 Bairro Centro','karrarataxi@gmail.com','34991874994', '67891012345', 'ROV-1345');
	INSERT INTO public."Motorista"(
	"Nome", "Idade", "CPF", "Endereco", email, "Telefone", "Habilitacao","Placa Veiculo")
	VALUES ('Roberto da Silda',30,'22259713009','Rua Barão São Francisco 500 Bairro Centro','robertolindaorp@gmail.com','349893454311', '34567891012', 'HIM-1991');
	
	INSERT INTO public."Viagem"(
	"Hora inicio", "Hora Fim","ID","Placa Veiculo", "Valor")
	VALUES ('12:30', '12:50',DEFAULT, 'HIM-1991', 'R$15,00');
	INSERT INTO public."Viagem"(
	"Hora inicio", "Hora Fim","ID","Placa Veiculo", "Valor")
	VALUES ('13:30', '13:50',DEFAULT, 'ROV-1345', 'R$15,00');
	INSERT INTO public."Viagem"(
	"Hora inicio", "Hora Fim","ID","Placa Veiculo", "Valor")
	VALUES ('16:20', '16:40',DEFAULT, 'ROV-1345', 'R$15,00');
	INSERT INTO public."Viagem"(
	"Hora inicio", "Hora Fim","ID","Placa Veiculo", "Valor")
	VALUES ('15:30', '17:00',DEFAULT, 'FFF-3090', 'R$50,00');
	INSERT INTO public."Viagem"(
	"Hora inicio", "Hora Fim","ID","Placa Veiculo", "Valor")
	VALUES ('9:30', '10:00',DEFAULT, 'FFF-3090', 'R$20,00');
	INSERT INTO public."Viagem"(
	"Hora inicio", "Hora Fim","ID","Placa Veiculo", "Valor")
	VALUES ('00:30', '01:00',DEFAULT, 'HIM-1991', 'R$20,00');
	INSERT INTO public."Viagem"(
	"Hora inicio", "Hora Fim","ID","Placa Veiculo", "Valor")
	VALUES ('14:10', '14:20',DEFAULT, 'TYR-0990', 'R$10,00');
	INSERT INTO public."Viagem"(
	"Hora inicio", "Hora Fim","ID","Placa Veiculo", "Valor")
	VALUES ('18:30', '19:30',DEFAULT, 'TYR-0990', 'R$30,00');
	INSERT INTO public."Viagem"(
	"Hora inicio", "Hora Fim","ID","Placa Veiculo", "Valor")
	VALUES ('13:10', '13:50',DEFAULT, 'TYR-0990', 'R$15,00');
	
	