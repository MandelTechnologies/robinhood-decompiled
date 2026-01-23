package com.twilio.conversations;

/* loaded from: classes12.dex */
public class AggregatedDeliveryReceipt {
    private final DeliveryAmount mDelivered;
    private final DeliveryAmount mFailed;
    private final DeliveryAmount mRead;
    private final DeliveryAmount mSent;
    private final int mTotal;
    private final DeliveryAmount mUndelivered;

    public enum DeliveryAmount {
        NONE(0),
        SOME(1),
        ALL(2);

        private final int mValue;

        DeliveryAmount(int i) {
            this.mValue = i;
        }

        public int getValue() {
            return this.mValue;
        }

        public static DeliveryAmount fromInt(int i) {
            for (DeliveryAmount deliveryAmount : values()) {
                if (deliveryAmount.getValue() == i) {
                    return deliveryAmount;
                }
            }
            throw new IllegalStateException("Invalid value " + i + " for AggregatedDeliveryReceipt.DeliveryAmount");
        }
    }

    AggregatedDeliveryReceipt(int i, DeliveryAmount deliveryAmount, DeliveryAmount deliveryAmount2, DeliveryAmount deliveryAmount3, DeliveryAmount deliveryAmount4, DeliveryAmount deliveryAmount5) {
        this.mTotal = i;
        this.mRead = deliveryAmount;
        this.mUndelivered = deliveryAmount2;
        this.mDelivered = deliveryAmount3;
        this.mFailed = deliveryAmount4;
        this.mSent = deliveryAmount5;
    }

    public int getTotal() {
        return this.mTotal;
    }

    public DeliveryAmount getSent() {
        return this.mSent;
    }

    public DeliveryAmount getDelivered() {
        return this.mDelivered;
    }

    public DeliveryAmount getUndelivered() {
        return this.mUndelivered;
    }

    public DeliveryAmount getRead() {
        return this.mRead;
    }

    public DeliveryAmount getFailed() {
        return this.mFailed;
    }

    public String toString() {
        return "AggregatedDeliveryReceipt(\ntotal: " + this.mTotal + "\nread: " + this.mRead + "\nundelivered: " + this.mUndelivered + "\ndelivered: " + this.mDelivered + "\nfailed: " + this.mFailed + "\nsent: " + this.mSent + "\n)";
    }

    public int hashCode() {
        return (((((((((this.mTotal * 31) + this.mRead.hashCode()) * 31) + this.mUndelivered.hashCode()) * 31) + this.mDelivered.hashCode()) * 31) + this.mFailed.hashCode()) * 31) + this.mSent.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AggregatedDeliveryReceipt)) {
            return false;
        }
        AggregatedDeliveryReceipt aggregatedDeliveryReceipt = (AggregatedDeliveryReceipt) obj;
        return this.mTotal == aggregatedDeliveryReceipt.mTotal && this.mRead.equals(aggregatedDeliveryReceipt.mRead) && this.mUndelivered.equals(aggregatedDeliveryReceipt.mUndelivered) && this.mDelivered.equals(aggregatedDeliveryReceipt.mDelivered) && this.mFailed.equals(aggregatedDeliveryReceipt.mFailed) && this.mSent.equals(aggregatedDeliveryReceipt.mSent);
    }
}
