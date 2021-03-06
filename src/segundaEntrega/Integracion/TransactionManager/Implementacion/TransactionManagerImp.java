package segundaEntrega.Integracion.TransactionManager.Implementacion;
import java.util.concurrent.ConcurrentHashMap;

import segundaEntrega.Integracion.Transaccion.Transaccion;
import segundaEntrega.Integracion.Transaccion.TransaccionMYSQL.TransaccionMYSQL;
import segundaEntrega.Integracion.TransactionManager.TransactionManager;

	public class TransactionManagerImp extends TransactionManager {
		ConcurrentHashMap<Thread, Transaccion> myConcurrentHashMap;
		
		public TransactionManagerImp() {
			myConcurrentHashMap = new ConcurrentHashMap<Thread, Transaccion>();
		}
		
		
		@Override
		public Transaccion nuevaTransaccion() {
			// TODO Auto-generated method stub
			Transaccion t = new TransaccionMYSQL();
			myConcurrentHashMap.put(Thread.currentThread(),t);
			return getTransaccion();
		}

		@Override
		public void eliminarTransaccion() {
			myConcurrentHashMap.remove(Thread.currentThread());
			
		}

		@Override
		public Transaccion getTransaccion() {
			// TODO Auto-generated method stub
			Transaccion TransaccionReturned = myConcurrentHashMap.get(Thread
					.currentThread());
		
		return TransaccionReturned;
	}
}