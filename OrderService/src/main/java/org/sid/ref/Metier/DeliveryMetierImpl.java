package org.sid.ref.Metier;

import org.sid.ref.Dao.DeliveryInfoRepository;
import org.sid.ref.Model.DeliveryInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryMetierImpl implements DeliveryInfoMetier {
    @Autowired
    private DeliveryInfoRepository deliveryInfoRepository;
    @Override
    public DeliveryInfo saveDeliveryInfo(DeliveryInfo deliveryInfo) {
        return deliveryInfoRepository.save(deliveryInfo);
    }

    @Override
    public DeliveryInfo updateDeliveryInfo(Long id, DeliveryInfo deliveryInfo) {
        deliveryInfo.setId(id);
        return deliveryInfoRepository.save(deliveryInfo);
    }

    @Override
    public void deleteDeliveryInfo(Long id) {
        deliveryInfoRepository.deleteById(id);
    }

    @Override
    public List<DeliveryInfo> DELIVERY_INFO_LIST() {
        return deliveryInfoRepository.findAll();
    }
}
