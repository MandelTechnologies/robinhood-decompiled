package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EphemeralOperation.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/stripe/android/EphemeralOperation;", "Landroid/os/Parcelable;", "<init>", "()V", "Customer", "Lcom/stripe/android/EphemeralOperation$Customer;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public abstract class EphemeralOperation implements Parcelable {
    public /* synthetic */ EphemeralOperation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private EphemeralOperation() {
    }

    /* compiled from: EphemeralOperation.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/stripe/android/EphemeralOperation$Customer;", "Lcom/stripe/android/EphemeralOperation;", "<init>", "()V", "AttachPaymentMethod", "DetachPaymentMethod", "GetPaymentMethods", "UpdateShipping", "Lcom/stripe/android/EphemeralOperation$Customer$AttachPaymentMethod;", "Lcom/stripe/android/EphemeralOperation$Customer$DetachPaymentMethod;", "Lcom/stripe/android/EphemeralOperation$Customer$GetPaymentMethods;", "Lcom/stripe/android/EphemeralOperation$Customer$UpdateShipping;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static abstract class Customer extends EphemeralOperation {
        public /* synthetic */ Customer(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Customer() {
            super(null);
        }

        /* compiled from: EphemeralOperation.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m3636d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$AttachPaymentMethod;", "Lcom/stripe/android/EphemeralOperation$Customer;", "", "paymentMethodId", "id", "", "productUsage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPaymentMethodId", "getId$payments_core_release", "Ljava/util/Set;", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class AttachPaymentMethod extends Customer {
            public static final Parcelable.Creator<AttachPaymentMethod> CREATOR = new Creator();
            private final String id;
            private final String paymentMethodId;
            private final Set<String> productUsage;

            /* compiled from: EphemeralOperation.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<AttachPaymentMethod> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AttachPaymentMethod createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new AttachPaymentMethod(string2, string3, linkedHashSet);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AttachPaymentMethod[] newArray(int i) {
                    return new AttachPaymentMethod[i];
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
                if (!(other instanceof AttachPaymentMethod)) {
                    return false;
                }
                AttachPaymentMethod attachPaymentMethod = (AttachPaymentMethod) other;
                return Intrinsics.areEqual(this.paymentMethodId, attachPaymentMethod.paymentMethodId) && Intrinsics.areEqual(this.id, attachPaymentMethod.id) && Intrinsics.areEqual(this.productUsage, attachPaymentMethod.productUsage);
            }

            public int hashCode() {
                return (((this.paymentMethodId.hashCode() * 31) + this.id.hashCode()) * 31) + this.productUsage.hashCode();
            }

            public String toString() {
                return "AttachPaymentMethod(paymentMethodId=" + this.paymentMethodId + ", id=" + this.id + ", productUsage=" + this.productUsage + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.paymentMethodId);
                parcel.writeString(this.id);
                Set<String> set = this.productUsage;
                parcel.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    parcel.writeString(it.next());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AttachPaymentMethod(String paymentMethodId, String id, Set<String> productUsage) {
                super(null);
                Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                this.paymentMethodId = paymentMethodId;
                this.id = id;
                this.productUsage = productUsage;
            }
        }

        /* compiled from: EphemeralOperation.kt */
        @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, m3636d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$DetachPaymentMethod;", "Lcom/stripe/android/EphemeralOperation$Customer;", "", "paymentMethodId", "id", "", "productUsage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPaymentMethodId", "getId$payments_core_release", "Ljava/util/Set;", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class DetachPaymentMethod extends Customer {
            public static final Parcelable.Creator<DetachPaymentMethod> CREATOR = new Creator();
            private final String id;
            private final String paymentMethodId;
            private final Set<String> productUsage;

            /* compiled from: EphemeralOperation.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<DetachPaymentMethod> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DetachPaymentMethod createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new DetachPaymentMethod(string2, string3, linkedHashSet);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final DetachPaymentMethod[] newArray(int i) {
                    return new DetachPaymentMethod[i];
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
                if (!(other instanceof DetachPaymentMethod)) {
                    return false;
                }
                DetachPaymentMethod detachPaymentMethod = (DetachPaymentMethod) other;
                return Intrinsics.areEqual(this.paymentMethodId, detachPaymentMethod.paymentMethodId) && Intrinsics.areEqual(this.id, detachPaymentMethod.id) && Intrinsics.areEqual(this.productUsage, detachPaymentMethod.productUsage);
            }

            public int hashCode() {
                return (((this.paymentMethodId.hashCode() * 31) + this.id.hashCode()) * 31) + this.productUsage.hashCode();
            }

            public String toString() {
                return "DetachPaymentMethod(paymentMethodId=" + this.paymentMethodId + ", id=" + this.id + ", productUsage=" + this.productUsage + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.paymentMethodId);
                parcel.writeString(this.id);
                Set<String> set = this.productUsage;
                parcel.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    parcel.writeString(it.next());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DetachPaymentMethod(String paymentMethodId, String id, Set<String> productUsage) {
                super(null);
                Intrinsics.checkNotNullParameter(paymentMethodId, "paymentMethodId");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                this.paymentMethodId = paymentMethodId;
                this.id = id;
                this.productUsage = productUsage;
            }
        }

        /* compiled from: EphemeralOperation.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b%\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b&\u0010\u000fR\u001a\u0010\t\u001a\u00020\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b'\u0010\u000fR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, m3636d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$GetPaymentMethods;", "Lcom/stripe/android/EphemeralOperation$Customer;", "Lcom/stripe/android/model/PaymentMethod$Type;", "type", "", "limit", "", "endingBefore", "startingAfter", "id", "", "productUsage", "<init>", "(Lcom/stripe/android/model/PaymentMethod$Type;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/PaymentMethod$Type;", "getType$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$Type;", "Ljava/lang/Integer;", "getLimit$payments_core_release", "()Ljava/lang/Integer;", "Ljava/lang/String;", "getEndingBefore$payments_core_release", "getStartingAfter$payments_core_release", "getId$payments_core_release", "Ljava/util/Set;", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class GetPaymentMethods extends Customer {
            public static final Parcelable.Creator<GetPaymentMethods> CREATOR = new Creator();
            private final String endingBefore;
            private final String id;
            private final Integer limit;
            private final Set<String> productUsage;
            private final String startingAfter;
            private final PaymentMethod.Type type;

            /* compiled from: EphemeralOperation.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<GetPaymentMethods> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GetPaymentMethods createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    PaymentMethod.Type typeCreateFromParcel = PaymentMethod.Type.CREATOR.createFromParcel(parcel);
                    Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new GetPaymentMethods(typeCreateFromParcel, numValueOf, string2, string3, string4, linkedHashSet);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final GetPaymentMethods[] newArray(int i) {
                    return new GetPaymentMethods[i];
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
                if (!(other instanceof GetPaymentMethods)) {
                    return false;
                }
                GetPaymentMethods getPaymentMethods = (GetPaymentMethods) other;
                return this.type == getPaymentMethods.type && Intrinsics.areEqual(this.limit, getPaymentMethods.limit) && Intrinsics.areEqual(this.endingBefore, getPaymentMethods.endingBefore) && Intrinsics.areEqual(this.startingAfter, getPaymentMethods.startingAfter) && Intrinsics.areEqual(this.id, getPaymentMethods.id) && Intrinsics.areEqual(this.productUsage, getPaymentMethods.productUsage);
            }

            public int hashCode() {
                int iHashCode = this.type.hashCode() * 31;
                Integer num = this.limit;
                int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                String str = this.endingBefore;
                int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.startingAfter;
                return ((((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.id.hashCode()) * 31) + this.productUsage.hashCode();
            }

            public String toString() {
                return "GetPaymentMethods(type=" + this.type + ", limit=" + this.limit + ", endingBefore=" + this.endingBefore + ", startingAfter=" + this.startingAfter + ", id=" + this.id + ", productUsage=" + this.productUsage + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                int iIntValue;
                Intrinsics.checkNotNullParameter(parcel, "out");
                this.type.writeToParcel(parcel, flags);
                Integer num = this.limit;
                if (num == null) {
                    iIntValue = 0;
                } else {
                    parcel.writeInt(1);
                    iIntValue = num.intValue();
                }
                parcel.writeInt(iIntValue);
                parcel.writeString(this.endingBefore);
                parcel.writeString(this.startingAfter);
                parcel.writeString(this.id);
                Set<String> set = this.productUsage;
                parcel.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    parcel.writeString(it.next());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GetPaymentMethods(PaymentMethod.Type type2, Integer num, String str, String str2, String id, Set<String> productUsage) {
                super(null);
                Intrinsics.checkNotNullParameter(type2, "type");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                this.type = type2;
                this.limit = num;
                this.endingBefore = str;
                this.startingAfter = str2;
                this.id = id;
                this.productUsage = productUsage;
            }
        }

        /* compiled from: EphemeralOperation.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, m3636d2 = {"Lcom/stripe/android/EphemeralOperation$Customer$UpdateShipping;", "Lcom/stripe/android/EphemeralOperation$Customer;", "Lcom/stripe/android/model/ShippingInformation;", "shippingInformation", "", "id", "", "productUsage", "<init>", "(Lcom/stripe/android/model/ShippingInformation;Ljava/lang/String;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/ShippingInformation;", "getShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "Ljava/lang/String;", "getId$payments_core_release", "Ljava/util/Set;", "getProductUsage$payments_core_release", "()Ljava/util/Set;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final /* data */ class UpdateShipping extends Customer {
            public static final Parcelable.Creator<UpdateShipping> CREATOR = new Creator();
            private final String id;
            private final Set<String> productUsage;
            private final ShippingInformation shippingInformation;

            /* compiled from: EphemeralOperation.kt */
            @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<UpdateShipping> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdateShipping createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    ShippingInformation shippingInformationCreateFromParcel = ShippingInformation.CREATOR.createFromParcel(parcel);
                    String string2 = parcel.readString();
                    int i = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new UpdateShipping(shippingInformationCreateFromParcel, string2, linkedHashSet);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final UpdateShipping[] newArray(int i) {
                    return new UpdateShipping[i];
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
                if (!(other instanceof UpdateShipping)) {
                    return false;
                }
                UpdateShipping updateShipping = (UpdateShipping) other;
                return Intrinsics.areEqual(this.shippingInformation, updateShipping.shippingInformation) && Intrinsics.areEqual(this.id, updateShipping.id) && Intrinsics.areEqual(this.productUsage, updateShipping.productUsage);
            }

            public int hashCode() {
                return (((this.shippingInformation.hashCode() * 31) + this.id.hashCode()) * 31) + this.productUsage.hashCode();
            }

            public String toString() {
                return "UpdateShipping(shippingInformation=" + this.shippingInformation + ", id=" + this.id + ", productUsage=" + this.productUsage + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                this.shippingInformation.writeToParcel(parcel, flags);
                parcel.writeString(this.id);
                Set<String> set = this.productUsage;
                parcel.writeInt(set.size());
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    parcel.writeString(it.next());
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UpdateShipping(ShippingInformation shippingInformation, String id, Set<String> productUsage) {
                super(null);
                Intrinsics.checkNotNullParameter(shippingInformation, "shippingInformation");
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(productUsage, "productUsage");
                this.shippingInformation = shippingInformation;
                this.id = id;
                this.productUsage = productUsage;
            }
        }
    }
}
