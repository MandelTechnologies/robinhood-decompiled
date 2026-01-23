package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.core.model.StripeModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Customer.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Bm\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0017J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010%\u001a\u0004\b&\u0010'R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b1\u0010\u0015R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b2\u0010\u0015R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b3\u0010\u0015R\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0011\u0010+\u001a\u0004\b4\u0010-¨\u00065"}, m3636d2 = {"Lcom/stripe/android/model/Customer;", "Lcom/stripe/android/core/model/StripeModel;", "", "id", "defaultSource", "Lcom/stripe/android/model/ShippingInformation;", "shippingInformation", "", "", "sources", "", "hasMore", "", "totalCount", "url", "description", "email", "liveMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ShippingInformation;Ljava/util/List;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getDefaultSource", "Lcom/stripe/android/model/ShippingInformation;", "getShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "Ljava/util/List;", "getSources", "()Ljava/util/List;", "Z", "getHasMore", "()Z", "Ljava/lang/Integer;", "getTotalCount", "()Ljava/lang/Integer;", "getUrl", "getDescription", "getEmail", "getLiveMode", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final /* data */ class Customer implements StripeModel {
    public static final Parcelable.Creator<Customer> CREATOR = new Creator();
    private final String defaultSource;
    private final String description;
    private final String email;
    private final boolean hasMore;
    private final String id;
    private final boolean liveMode;
    private final ShippingInformation shippingInformation;
    private final List<Object> sources;
    private final Integer totalCount;
    private final String url;

    /* compiled from: Customer.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<Customer> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Customer createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ShippingInformation shippingInformationCreateFromParcel = parcel.readInt() == 0 ? null : ShippingInformation.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            boolean z2 = false;
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(Customer.class.getClassLoader()));
            }
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new Customer(string2, string3, shippingInformationCreateFromParcel, arrayList, z2, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? true : z);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Customer[] newArray(int i) {
            return new Customer[i];
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
        if (!(other instanceof Customer)) {
            return false;
        }
        Customer customer = (Customer) other;
        return Intrinsics.areEqual(this.id, customer.id) && Intrinsics.areEqual(this.defaultSource, customer.defaultSource) && Intrinsics.areEqual(this.shippingInformation, customer.shippingInformation) && Intrinsics.areEqual(this.sources, customer.sources) && this.hasMore == customer.hasMore && Intrinsics.areEqual(this.totalCount, customer.totalCount) && Intrinsics.areEqual(this.url, customer.url) && Intrinsics.areEqual(this.description, customer.description) && Intrinsics.areEqual(this.email, customer.email) && this.liveMode == customer.liveMode;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.defaultSource;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ShippingInformation shippingInformation = this.shippingInformation;
        int iHashCode3 = (((((iHashCode2 + (shippingInformation == null ? 0 : shippingInformation.hashCode())) * 31) + this.sources.hashCode()) * 31) + Boolean.hashCode(this.hasMore)) * 31;
        Integer num = this.totalCount;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str3 = this.url;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.description;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.email;
        return ((iHashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31) + Boolean.hashCode(this.liveMode);
    }

    public String toString() {
        return "Customer(id=" + this.id + ", defaultSource=" + this.defaultSource + ", shippingInformation=" + this.shippingInformation + ", sources=" + this.sources + ", hasMore=" + this.hasMore + ", totalCount=" + this.totalCount + ", url=" + this.url + ", description=" + this.description + ", email=" + this.email + ", liveMode=" + this.liveMode + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.id);
        parcel.writeString(this.defaultSource);
        ShippingInformation shippingInformation = this.shippingInformation;
        if (shippingInformation == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shippingInformation.writeToParcel(parcel, flags);
        }
        List<Object> list = this.sources;
        parcel.writeInt(list.size());
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((Parcelable) it.next(), flags);
        }
        parcel.writeInt(this.hasMore ? 1 : 0);
        Integer num = this.totalCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.url);
        parcel.writeString(this.description);
        parcel.writeString(this.email);
        parcel.writeInt(this.liveMode ? 1 : 0);
    }

    public Customer(String str, String str2, ShippingInformation shippingInformation, List<Object> sources, boolean z, Integer num, String str3, String str4, String str5, boolean z2) {
        Intrinsics.checkNotNullParameter(sources, "sources");
        this.id = str;
        this.defaultSource = str2;
        this.shippingInformation = shippingInformation;
        this.sources = sources;
        this.hasMore = z;
        this.totalCount = num;
        this.url = str3;
        this.description = str4;
        this.email = str5;
        this.liveMode = z2;
    }

    public final ShippingInformation getShippingInformation() {
        return this.shippingInformation;
    }
}
