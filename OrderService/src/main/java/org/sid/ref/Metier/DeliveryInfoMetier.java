package org.sid.ref.Metier;

import org.sid.ref.Model.DeliveryInfo;

import java.util.List;

public interface DeliveryInfoMetier {
    public DeliveryInfo saveDeliveryInfo(DeliveryInfo deliveryInfo);
    public DeliveryInfo updateDeliveryInfo(Long id , DeliveryInfo deliveryInfo);
    public void deleteDeliveryInfo(Long id);
    public List<DeliveryInfo> DELIVERY_INFO_LIST();
}
