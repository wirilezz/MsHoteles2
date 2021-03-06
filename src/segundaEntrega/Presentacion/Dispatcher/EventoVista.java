package segundaEntrega.Presentacion.Dispatcher;

public class EventoVista {
	
	//PRIMERA ENTREGA
	
		//EVENTOS DE EXITO
		
		public final static int ALTA_HABITACION_EXITO = 1010;
		public final static int BAJA_HABITACION_EXITO = 1020;
		public final static int MODIFICAR_HABITACION_EXITO = 1030;
		public final static int MOSTRAR_HABITACION_EXITO = 1040;
		public final static int MOSTRAR_HABITACIONES_EXITO = 1050;
		public final static int MOSTRAR_HABITACION_N_RESERVAS_EXITO = 1060;

		
		public final static int ALTA_CLIENTE_EXITO = 2010;
		public final static int BAJA_CLIENTE_EXITO = 2020;
		public final static int MODIFICAR_CLIENTE_EXITO = 2030;
		public final static int MOSTRAR_CLIENTE_EXITO = 2040;
		public final static int MOSTRAR_CLIENTES_EXITO = 2050;
		public final static int MOSTRAR_CLIENTE_N_RESERVAS_EXITO = 2060;

		
		public final static int ALTA_RESERVA_EXITO = 3010;
		public final static int BAJA_RESERVA_EXITO = 3020;
		public final static int MODIFICAR_RESERVA_EXITO = 3030;
		public final static int MOSTRAR_RESERVA_EXITO = 3040;
		public final static int MOSTRAR_RESERVAS_EXITO = 3050;
		public final static int ADD_HABITACION_EXITO = 3060;
		public final static int QUITAR_HABITACION_EXITO = 3070;

		
		//EVENTOS DE FALLO
		
		public final static int ALTA_HABITACION_FALLO = 1011;
		public final static int BAJA_HABITACION_FALLO = 1021;
		public final static int MODIFICAR_HABITACION_FALLO = 1031;
		public final static int MOSTRAR_HABITACION_FALLO = 1041;
		public final static int MOSTRAR_HABITACIONES_FALLO = 1051;
		public final static int MOSTRAR_HABITACION_N_RESERVAS_FALLO = 1061;

		
		public final static int ALTA_CLIENTE_FALLO = 2011;
		public final static int BAJA_CLIENTE_FALLO = 2021;
		public final static int MODIFICAR_CLIENTE_FALLO = 2031;
		public final static int MOSTRAR_CLIENTE_FALLO = 2041;
		public final static int MOSTRAR_CLIENTES_FALLO= 2051;
		public final static int MOSTRAR_CLIENTE_N_RESERVAS_FALLO = 2061;

		
		public final static int ALTA_RESERVA_FALLO = 3011;
		public final static int BAJA_RESERVA_FALLO = 3021;
		public final static int MODIFICAR_RESERVA_FALLO = 3031;
		public final static int MOSTRAR_RESERVA_FALLO = 3041;
		public final static int MOSTRAR_RESERVAS_FALLO = 3051;
		public final static int ADD_HABITACION_FALLO = 3061;
		public final static int QUITAR_HABITACION_FALLO = 3071;
		
		//EVENTOS DE FLUJO ALTERNATIVO
		public final static int ALTA_HABITACION_CAPACIDAD_NO_VALIDA = 1012;
		public final static int ALTA_HABITACION_NUMERO_YA_EXISTE = 1013;
		
		public final static int BAJA_HABITACION_NO_EXISTE = 1022;
		public final static int BAJA_HABITACION_CLIENTES_ASOCIADOS = 1023;
		public final static int BAJA_HABITACION_RESERVAS_ASOCIADOS = 1024;
		
		public final static int MODIFICAR_HABITACION_NO_EXISTE = 1032;
		public final static int MODIFICAR_HABITACION_CAPACIDAD_MENOR_OCUPANTES = 1033;
		
		public final static int ALTA_CLIENTE_DNI_YA_EXISTE = 2012;
		public final static int ALTA_CLIENTE_HABITACION_NO_EXISTE = 2013;
		public final static int ALTA_CLIENTE_HABITACION_LLENA = 2014;
		
		public final static int BAJA_CLIENTE_NO_EXISTE = 2022;
		public final static int BAJA_CLIENTES_RESERVAS_ASOCIADAS = 2023;
		
		public final static int MODIFICAR_CLIENTE_NO_EXISTE = 2032;
		
		public final static int ALTA_RESERVA_CLIENTE_NO_EXISTE = 3012;
		
		public final static int BAJA_RESERVA_NO_EXISTE = 3022;
		
		public final static int MODIFICAR_RESERVA_NO_EXISTE = 3032;
		
		public final static int ASGNAR_RESERVA_NO_EXISTE = 3062;
		public final static int ASGNAR_HABITACION_NO_EXISTE = 3063;
		
		
		//SEGUNDA ENTREGA
		
		//EVENTOS DE �XITO
		public final static int ALTA_DEPARTAMENTO_EXITO = 4010;
		public final static int BAJA_DEPARTAMENTO_EXITO = 4020;
		public final static int MOSTAR_DEPARTAMENTO_EXITO = 4030;
		public final static int MOSTRAR_DEPARTAMENTOS_EXITO = 4040;
		public final static int MODIFICAR_DEPARTAMENTO_EXITO = 4050;
		public final static int CALCULAR_SALARIO_DEPARTAMENTO_EXITO = 4060;


		
		public final static int ALTA_EMPLEADO_EXITO = 5010;
		public final static int BAJA_EMPLEADO_EXITO = 5020;
		public final static int MOSTRAR_EMPLEADO_EXITO = 5030;
		public final static int MOSTRAR_EMPLEADOS_EXITO = 5040;
		public final static int ASIGNAR_TAREA_EXITO = 5050;
		public final static int ELIMINAR_TAREA_EXITO = 5060;
		
		public final static int ALTA_TAREA_EXITO = 6010;
		public final static int BAJA_TAREA_EXITO = 6020;
		public final static int MOSTRAR_TAREA_EXITO = 6030;
		public final static int MOSTRAR_TAREAS_EXITO = 6040;
		
		//EVENTOS DE FALLO
		public final static int ALTA_DEPARTAMENTO_FALLO = 4011;
		public final static int BAJA_DEPARTAMENTO_FALLO = 4021;
		public final static int MOSTAR_DEPARTAMENTO_FALLO = 4031;
		public final static int MOSTRAR_DEPARTAMENTOS_FALLO = 4041;
		public final static int MODIFICAR_DEPARTAMENTO_FALLO = 4051;
		public final static int CALCULAR_SALARIO_DEPARTAMENTO_FALLO = 4061;
		
		public final static int ALTA_EMPLEADO_FALLO = 5011;
		public final static int BAJA_EMPLEADO_FALLO = 5021;
		public final static int MOSTRAR_EMPLEADO_FALLO = 5031;
		public final static int MOSTRAR_EMPLEADOS_FALLO = 5041;
		public final static int ASIGNAR_TAREA_FALLO = 5051;
		public final static int ELIMINAR_TAREA_FALLO = 5061;
		
		public final static int ALTA_TAREA_FALLO = 6011;
		public final static int BAJA_TAREA_FALLO = 6021;
		public final static int MOSTRAR_TAREA_FALLO = 6031;
		public final static int MOSTRAR_TAREAS_FALLO = 6041;
		
		//EVENTOS DE FLUJO ALTERNATIVO
		public final static int ALTA_DEPARTAMENTO_NOMBRE_EXISTE = 4012;
		public final static int ALTA_EMPLEADO_DEPARTAMENTO_NO_EXISTE = 5012;
		
		public final static int ASIGNAR_TAREA_FALLO_EMPLEADO_NO_EXISTE = 5051;
		public final static int ASIGNAR_TAREA_FALLO_TAREA_NO_EXISTE = 5052;
		public final static int ASIGNAR_TAREA_FALLO_TAREA_YA_ASIGNADA_EMPLEADO = 5053;
		public final static int ASIGNAR_TAREA_FALLO_EMPLEADO_YA_ASIGNADO_TAREA = 5054;

}
