package utils;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by parashan on 8/2/2017.
 */
@javax.persistence.Entity
@Table(name="vehiclemodelrequests")
public class VehicleModelRequest {
    @Id@GeneratedValue
    @Column
    int requestId;

    @Column(unique = true)
    int modelId;

    @Column
    boolean isProcessed;

    @Column
    int units;

    @Column
    Date orderDate;

    public VehicleModelRequest(int modelId, boolean isProcessed, int units, Date orderDate) {
        this.modelId = modelId;
        this.isProcessed = isProcessed;
        this.units = units;
        this.orderDate = orderDate;
    }
    public VehicleModelRequest(){

    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public boolean isProcessed() {
        return isProcessed;
    }

    public void setProcessed(boolean processed) {
        isProcessed = processed;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}