package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.network.IdClass;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: OverridableText.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0015J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;", "Landroid/os/Parcelable;", "", "", "backingData", "<init>", "(Ljava/util/Map;)V", "countryCode", "idClass", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "side", "getText", "(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;)Ljava/lang/String;", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getBackingData", "()Ljava/util/Map;", "Builder", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes18.dex */
public final /* data */ class OverridableText implements Parcelable {
    public static final Parcelable.Creator<OverridableText> CREATOR = new Creator();
    private final Map<String, String> backingData;

    /* compiled from: OverridableText.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<OverridableText> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OverridableText createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new OverridableText(linkedHashMap);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OverridableText[] newArray(int i) {
            return new OverridableText[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OverridableText) && Intrinsics.areEqual(this.backingData, ((OverridableText) other).backingData);
    }

    public int hashCode() {
        return this.backingData.hashCode();
    }

    public String toString() {
        return "OverridableText(backingData=" + this.backingData + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Map<String, String> map = this.backingData;
        dest.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            dest.writeString(entry.getKey());
            dest.writeString(entry.getValue());
        }
    }

    public OverridableText(Map<String, String> backingData) {
        Intrinsics.checkNotNullParameter(backingData, "backingData");
        this.backingData = backingData;
    }

    public final String getText(String countryCode, String idClass, IdConfig.Side side) {
        Intrinsics.checkNotNullParameter(side, "side");
        if (countryCode == null) {
            countryCode = "unpopulated";
        }
        if (Intrinsics.areEqual(idClass, IdClass.KeyAutoClassification) || idClass == null) {
            idClass = "unpopulated";
        }
        Map<String, String> map = this.backingData;
        String str = countryCode + "-" + idClass + "-" + side.getKey();
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = str.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str2 = map.get(lowerCase);
        if (str2 != null) {
            return str2;
        }
        Map<String, String> map2 = this.backingData;
        String str3 = ((String) null) + "-" + idClass + "-" + side.getKey();
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase2 = str3.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
        String str4 = map2.get(lowerCase2);
        if (str4 != null) {
            return str4;
        }
        Map<String, String> map3 = this.backingData;
        String str5 = ((String) null) + "-" + ((String) null) + "-" + side.getKey();
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase3 = str5.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
        String str6 = map3.get(lowerCase3);
        if (str6 != null) {
            return str6;
        }
        return null;
    }

    /* compiled from: OverridableText.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u000fR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText$Builder;", "", "<init>", "()V", "backingData", "", "", "putText", "", "countryCode", "idClass", "side", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$Side;", "text", "build", "Lcom/withpersona/sdk2/inquiry/governmentid/OverridableText;", "government-id_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Builder {
        private final Map<String, String> backingData = new LinkedHashMap();

        public final void putText(String countryCode, String idClass, IdConfig.Side side, String text) {
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(text, "text");
            Map<String, String> map = this.backingData;
            String str = countryCode + "-" + idClass + "-" + side.getKey();
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            map.put(lowerCase, text);
        }

        public final OverridableText build() {
            return new OverridableText(this.backingData);
        }
    }
}
