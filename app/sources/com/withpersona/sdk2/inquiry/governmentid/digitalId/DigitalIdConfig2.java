package com.withpersona.sdk2.inquiry.governmentid.digitalId;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.governmentid.network.IdClass;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DigitalIdConfig.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdRequest;", "Landroid/os/Parcelable;", "Lcom/withpersona/sdk2/inquiry/governmentid/network/IdClass;", "idType", "", "minAge", "", "", "elementToStoreLength", "<init>", "(Lcom/withpersona/sdk2/inquiry/governmentid/network/IdClass;Ljava/lang/String;Ljava/util/Map;)V", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/withpersona/sdk2/inquiry/governmentid/network/IdClass;", "getIdType", "()Lcom/withpersona/sdk2/inquiry/governmentid/network/IdClass;", "Ljava/lang/String;", "getMinAge", "()Ljava/lang/String;", "Ljava/util/Map;", "getElementToStoreLength", "()Ljava/util/Map;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.inquiry.governmentid.digitalId.DigitalIdRequest, reason: use source file name */
/* loaded from: classes18.dex */
public final class DigitalIdConfig2 implements Parcelable {
    public static final Parcelable.Creator<DigitalIdConfig2> CREATOR = new Creator();
    private final Map<String, Integer> elementToStoreLength;
    private final IdClass idType;
    private final String minAge;

    /* compiled from: DigitalIdConfig.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.inquiry.governmentid.digitalId.DigitalIdRequest$Creator */
    public static final class Creator implements Parcelable.Creator<DigitalIdConfig2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DigitalIdConfig2 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            IdClass idClassValueOf = IdClass.valueOf(parcel.readString());
            String string2 = parcel.readString();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
            }
            return new DigitalIdConfig2(idClassValueOf, string2, linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DigitalIdConfig2[] newArray(int i) {
            return new DigitalIdConfig2[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.idType.name());
        dest.writeString(this.minAge);
        Map<String, Integer> map = this.elementToStoreLength;
        dest.writeInt(map.size());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeInt(entry.getValue().intValue());
        }
    }

    public DigitalIdConfig2(IdClass idType, String minAge, Map<String, Integer> elementToStoreLength) {
        Intrinsics.checkNotNullParameter(idType, "idType");
        Intrinsics.checkNotNullParameter(minAge, "minAge");
        Intrinsics.checkNotNullParameter(elementToStoreLength, "elementToStoreLength");
        this.idType = idType;
        this.minAge = minAge;
        this.elementToStoreLength = elementToStoreLength;
    }
}
