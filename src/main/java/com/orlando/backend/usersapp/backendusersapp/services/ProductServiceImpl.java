package  com.orlando.backend.usersapp.backendusersapp.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.orlando.backend.usersapp.backendusersapp.repositories.ProductRepository;
import com.orlando.backend.usersapp.backendusersapp.models.entities.Product;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return (List<Product>) repository.findAll();
    }
}
