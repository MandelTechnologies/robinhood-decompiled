package com.stripe.android.payments.bankaccount.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.model.StripeModel;
import com.stripe.android.financialconnections.model.FinancialConnectionsSession;
import com.stripe.android.model.StripeIntent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CollectBankAccountResultInternal.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0002%&B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal;", "Lcom/stripe/android/core/model/StripeModel;", "Lcom/stripe/android/model/StripeIntent;", "intent", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;", "usBankAccountData", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;", "instantDebitsData", "<init>", "(Lcom/stripe/android/model/StripeIntent;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/StripeIntent;", "getIntent", "()Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;", "getUsBankAccountData", "()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;", "Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;", "getInstantDebitsData", "()Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;", "InstantDebitsData", "USBankAccountData", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes22.dex */
public final /* data */ class CollectBankAccountResponseInternal implements StripeModel {
    public static final int $stable = FinancialConnectionsSession.$stable;
    public static final Parcelable.Creator<CollectBankAccountResponseInternal> CREATOR = new Creator();
    private final InstantDebitsData instantDebitsData;
    private final StripeIntent intent;
    private final USBankAccountData usBankAccountData;

    /* compiled from: CollectBankAccountResultInternal.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<CollectBankAccountResponseInternal> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CollectBankAccountResponseInternal createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CollectBankAccountResponseInternal((StripeIntent) parcel.readParcelable(CollectBankAccountResponseInternal.class.getClassLoader()), parcel.readInt() == 0 ? null : USBankAccountData.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? InstantDebitsData.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CollectBankAccountResponseInternal[] newArray(int i) {
            return new CollectBankAccountResponseInternal[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollectBankAccountResponseInternal)) {
            return false;
        }
        CollectBankAccountResponseInternal collectBankAccountResponseInternal = (CollectBankAccountResponseInternal) other;
        return Intrinsics.areEqual(this.intent, collectBankAccountResponseInternal.intent) && Intrinsics.areEqual(this.usBankAccountData, collectBankAccountResponseInternal.usBankAccountData) && Intrinsics.areEqual(this.instantDebitsData, collectBankAccountResponseInternal.instantDebitsData);
    }

    public int hashCode() {
        StripeIntent stripeIntent = this.intent;
        int iHashCode = (stripeIntent == null ? 0 : stripeIntent.hashCode()) * 31;
        USBankAccountData uSBankAccountData = this.usBankAccountData;
        int iHashCode2 = (iHashCode + (uSBankAccountData == null ? 0 : uSBankAccountData.hashCode())) * 31;
        InstantDebitsData instantDebitsData = this.instantDebitsData;
        return iHashCode2 + (instantDebitsData != null ? instantDebitsData.hashCode() : 0);
    }

    public String toString() {
        return "CollectBankAccountResponseInternal(intent=" + this.intent + ", usBankAccountData=" + this.usBankAccountData + ", instantDebitsData=" + this.instantDebitsData + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeParcelable(this.intent, flags);
        USBankAccountData uSBankAccountData = this.usBankAccountData;
        if (uSBankAccountData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            uSBankAccountData.writeToParcel(parcel, flags);
        }
        InstantDebitsData instantDebitsData = this.instantDebitsData;
        if (instantDebitsData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            instantDebitsData.writeToParcel(parcel, flags);
        }
    }

    public CollectBankAccountResponseInternal(StripeIntent stripeIntent, USBankAccountData uSBankAccountData, InstantDebitsData instantDebitsData) {
        this.intent = stripeIntent;
        this.usBankAccountData = uSBankAccountData;
        this.instantDebitsData = instantDebitsData;
    }

    /* compiled from: CollectBankAccountResultInternal.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$USBankAccountData;", "Lcom/stripe/android/core/model/StripeModel;", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "financialConnectionsSession", "<init>", "(Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "getFinancialConnectionsSession", "()Lcom/stripe/android/financialconnections/model/FinancialConnectionsSession;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class USBankAccountData implements StripeModel {
        public static final int $stable = FinancialConnectionsSession.$stable;
        public static final Parcelable.Creator<USBankAccountData> CREATOR = new Creator();
        private final FinancialConnectionsSession financialConnectionsSession;

        /* compiled from: CollectBankAccountResultInternal.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<USBankAccountData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccountData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new USBankAccountData(parcel.readParcelable(USBankAccountData.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final USBankAccountData[] newArray(int i) {
                return new USBankAccountData[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof USBankAccountData) && Intrinsics.areEqual(this.financialConnectionsSession, ((USBankAccountData) other).financialConnectionsSession);
        }

        public int hashCode() {
            return this.financialConnectionsSession.hashCode();
        }

        public String toString() {
            return "USBankAccountData(financialConnectionsSession=" + this.financialConnectionsSession + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeParcelable((Parcelable) this.financialConnectionsSession, flags);
        }

        public USBankAccountData(FinancialConnectionsSession financialConnectionsSession) {
            Intrinsics.checkNotNullParameter(financialConnectionsSession, "financialConnectionsSession");
            this.financialConnectionsSession = financialConnectionsSession;
        }
    }

    /* compiled from: CollectBankAccountResultInternal.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\t¨\u0006\u001d"}, m3636d2 = {"Lcom/stripe/android/payments/bankaccount/navigation/CollectBankAccountResponseInternal$InstantDebitsData;", "Lcom/stripe/android/core/model/StripeModel;", "", "paymentMethodId", "last4", "bankName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPaymentMethodId", "getLast4", "getBankName", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final /* data */ class InstantDebitsData implements StripeModel {
        public static final Parcelable.Creator<InstantDebitsData> CREATOR = new Creator();
        private final String bankName;
        private final String last4;
        private final String paymentMethodId;

        /* compiled from: CollectBankAccountResultInternal.kt */
        @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InstantDebitsData> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InstantDebitsData createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InstantDebitsData(parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InstantDebitsData[] newArray(int i) {
                return new InstantDebitsData[i];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InstantDebitsData)) {
                return false;
            }
            InstantDebitsData instantDebitsData = (InstantDebitsData) other;
            return Intrinsics.areEqual(this.paymentMethodId, instantDebitsData.paymentMethodId) && Intrinsics.areEqual(this.last4, instantDebitsData.last4) && Intrinsics.areEqual(this.bankName, instantDebitsData.bankName);
        }

        public int hashCode() {
            int iHashCode = this.paymentMethodId.hashCode() * 31;
            String str = this.last4;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.bankName;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "InstantDebitsData(paymentMethodId=" + this.paymentMethodId + ", last4=" + this.last4 + ", bankName=" + this.bankName + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.paymentMethodId);
            parcel.writeString(this.last4);
            parcel.writeString(this.bankName);
        }

        public InstantDebitsData(String paymentMethodId, String str, String str2) {
            Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
            this.paymentMethodId = paymentMethodId;
            this.last4 = str;
            this.bankName = str2;
        }
    }
}
