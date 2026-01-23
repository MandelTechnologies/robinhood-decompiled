package com.withpersona.sdk2.inquiry.governmentid.digitalId;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DigitalIdConfig.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdConfig;", "Landroid/os/Parcelable;", "", "merchantId", "nonce", "fieldKeyMobileDriversLicense", "", "Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdRequest;", "digitalIdRequests", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Ljava/lang/String;", "getMerchantId", "()Ljava/lang/String;", "getNonce", "getFieldKeyMobileDriversLicense", "Ljava/util/List;", "getDigitalIdRequests", "()Ljava/util/List;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class DigitalIdConfig implements Parcelable {
    public static final Parcelable.Creator<DigitalIdConfig> CREATOR = new Creator();
    private final List<DigitalIdConfig2> digitalIdRequests;
    private final String fieldKeyMobileDriversLicense;
    private final String merchantId;
    private final String nonce;

    /* compiled from: DigitalIdConfig.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<DigitalIdConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DigitalIdConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(DigitalIdConfig2.CREATOR.createFromParcel(parcel));
            }
            return new DigitalIdConfig(string2, string3, string4, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DigitalIdConfig[] newArray(int i) {
            return new DigitalIdConfig[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.merchantId);
        dest.writeString(this.nonce);
        dest.writeString(this.fieldKeyMobileDriversLicense);
        List<DigitalIdConfig2> list = this.digitalIdRequests;
        dest.writeInt(list.size());
        Iterator<DigitalIdConfig2> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public DigitalIdConfig(String merchantId, String nonce, String fieldKeyMobileDriversLicense, List<DigitalIdConfig2> digitalIdRequests) {
        Intrinsics.checkNotNullParameter(merchantId, "merchantId");
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(fieldKeyMobileDriversLicense, "fieldKeyMobileDriversLicense");
        Intrinsics.checkNotNullParameter(digitalIdRequests, "digitalIdRequests");
        this.merchantId = merchantId;
        this.nonce = nonce;
        this.fieldKeyMobileDriversLicense = fieldKeyMobileDriversLicense;
        this.digitalIdRequests = digitalIdRequests;
    }
}
