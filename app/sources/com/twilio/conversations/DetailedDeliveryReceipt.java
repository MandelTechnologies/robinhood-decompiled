package com.twilio.conversations;

import java.util.Date;

/* loaded from: classes12.dex */
public class DetailedDeliveryReceipt {
    private final String mChannelMessageSid;
    private final String mConversationSid;
    private final Date mDateCreated;
    private final Date mDateUpdated;
    private final int mErrorCode;
    private final String mMessageSid;
    private final String mParticipantSid;
    private final String mSid;
    private final DeliveryStatus mStatus;

    public enum DeliveryStatus {
        READ(0),
        UNDELIVERED(1),
        DELIVERED(2),
        FAILED(3),
        SENT(4),
        QUEUED(5);

        private final int mValue;

        DeliveryStatus(int i) {
            this.mValue = i;
        }

        public int getValue() {
            return this.mValue;
        }

        public static DeliveryStatus fromInt(int i) {
            for (DeliveryStatus deliveryStatus : values()) {
                if (deliveryStatus.getValue() == i) {
                    return deliveryStatus;
                }
            }
            throw new IllegalStateException("Invalid value " + i + " for DeliveryReceipt.DeliveryStatus");
        }
    }

    DetailedDeliveryReceipt(String str, String str2, String str3, String str4, String str5, DeliveryStatus deliveryStatus, int i, Date date, Date date2) {
        this.mSid = str;
        this.mMessageSid = str2;
        this.mConversationSid = str3;
        this.mChannelMessageSid = str4;
        this.mParticipantSid = str5;
        this.mStatus = deliveryStatus;
        this.mErrorCode = i;
        this.mDateCreated = date;
        this.mDateUpdated = date2;
    }

    public String getSid() {
        return this.mSid;
    }

    public String getMessageSid() {
        return this.mMessageSid;
    }

    public String getConversationSid() {
        return this.mConversationSid;
    }

    public String getChannelMessageSid() {
        return this.mChannelMessageSid;
    }

    public String getParticipantSid() {
        return this.mParticipantSid;
    }

    public DeliveryStatus getStatus() {
        return this.mStatus;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public Date getDateCreatedAsDate() {
        return this.mDateCreated;
    }

    public Date getDateUpdatedAsDate() {
        return this.mDateUpdated;
    }

    public int hashCode() {
        String str = this.mSid;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.mMessageSid;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mConversationSid;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.mChannelMessageSid;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.mParticipantSid;
        int iHashCode5 = (((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.mErrorCode) * 31;
        Date date = this.mDateCreated;
        int iHashCode6 = (iHashCode5 + (date != null ? date.hashCode() : 0)) * 31;
        Date date2 = this.mDateUpdated;
        return iHashCode6 + (date2 != null ? date2.hashCode() : 0);
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Date date;
        Date date2;
        Date date3;
        Date date4;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DetailedDeliveryReceipt)) {
            return false;
        }
        DetailedDeliveryReceipt detailedDeliveryReceipt = (DetailedDeliveryReceipt) obj;
        String str9 = this.mSid;
        String str10 = detailedDeliveryReceipt.mSid;
        return (str9 == str10 || (str9 != null && str9.equals(str10))) && ((str = this.mMessageSid) == (str2 = detailedDeliveryReceipt.mMessageSid) || (str != null && str.equals(str2))) && (((str3 = this.mConversationSid) == (str4 = detailedDeliveryReceipt.mConversationSid) || (str3 != null && str3.equals(str4))) && (((str5 = this.mChannelMessageSid) == (str6 = detailedDeliveryReceipt.mChannelMessageSid) || (str5 != null && str5.equals(str6))) && (((str7 = this.mParticipantSid) == (str8 = detailedDeliveryReceipt.mParticipantSid) || (str7 != null && str7.equals(str8))) && this.mErrorCode == detailedDeliveryReceipt.mErrorCode && (((date = this.mDateCreated) == (date2 = detailedDeliveryReceipt.mDateCreated) || (date != null && date.equals(date2))) && ((date3 = this.mDateUpdated) == (date4 = detailedDeliveryReceipt.mDateUpdated) || (date3 != null && date3.equals(date4)))))));
    }

    public String toString() {
        return "DeliveryReceipt(\nsid: " + this.mSid + "\nmessageSid: " + this.mMessageSid + "\nconversationSid: " + this.mConversationSid + "\nchannelSid: " + this.mChannelMessageSid + "\nparticipantSid: " + this.mParticipantSid + "\nstatus: " + this.mStatus + "\nerrorCode: " + this.mErrorCode + "\ndateCreated: " + this.mDateCreated + "\ndateUpdated: " + this.mDateUpdated + "\n)";
    }
}
