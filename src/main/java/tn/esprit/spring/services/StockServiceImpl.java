package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Stock;
import tn.esprit.spring.repository.StockRepository;
import tn.esprit.spring.services.StockService;

@Service
public class StockServiceImpl implements StockService{
	@Autowired
	 
	 StockRepository stockrepository ;
		@Override
		public List<Stock> retrieveAllStocks() {
			List <Stock> stocks = (List<Stock>) stockrepository.findAll();
			return stocks;
		}

		@Override
		public Stock addStock(Stock s) {
			Stock t = stockrepository.save(s);
			return t;
		}

		@Override
		public Stock updateStock(Stock u) {
			Stock t = stockrepository.save(u);
			return t;
		}

		@Override
		public Stock retrieveStock(Long id) {
			Stock t = stockrepository.findById(id).get();
			return t;
		}


}
