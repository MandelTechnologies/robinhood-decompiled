package com.robinhood.microgram.sdui;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidAttributes.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/AndroidAttributes;", "Landroid/os/Parcelable;", "statusBarStyle", "Lcom/robinhood/microgram/sdui/StatusBarStyle;", "addNavigationBarsPadding", "", "<init>", "(Lcom/robinhood/microgram/sdui/StatusBarStyle;Ljava/lang/Boolean;)V", "getStatusBarStyle", "()Lcom/robinhood/microgram/sdui/StatusBarStyle;", "getAddNavigationBarsPadding", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Lcom/robinhood/microgram/sdui/StatusBarStyle;Ljava/lang/Boolean;)Lcom/robinhood/microgram/sdui/AndroidAttributes;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AndroidAttributes implements Parcelable {
    public static final Parcelable.Creator<AndroidAttributes> CREATOR = new Creator();
    private final Boolean addNavigationBarsPadding;
    private final AndroidAttributes3 statusBarStyle;

    /* compiled from: AndroidAttributes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<AndroidAttributes> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AndroidAttributes createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean boolValueOf = null;
            AndroidAttributes3 androidAttributes3ValueOf = parcel.readInt() == 0 ? null : AndroidAttributes3.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AndroidAttributes(androidAttributes3ValueOf, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AndroidAttributes[] newArray(int i) {
            return new AndroidAttributes[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidAttributes() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AndroidAttributes copy$default(AndroidAttributes androidAttributes, AndroidAttributes3 androidAttributes3, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            androidAttributes3 = androidAttributes.statusBarStyle;
        }
        if ((i & 2) != 0) {
            bool = androidAttributes.addNavigationBarsPadding;
        }
        return androidAttributes.copy(androidAttributes3, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final AndroidAttributes3 getStatusBarStyle() {
        return this.statusBarStyle;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getAddNavigationBarsPadding() {
        return this.addNavigationBarsPadding;
    }

    public final AndroidAttributes copy(AndroidAttributes3 statusBarStyle, Boolean addNavigationBarsPadding) {
        return new AndroidAttributes(statusBarStyle, addNavigationBarsPadding);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidAttributes)) {
            return false;
        }
        AndroidAttributes androidAttributes = (AndroidAttributes) other;
        return this.statusBarStyle == androidAttributes.statusBarStyle && Intrinsics.areEqual(this.addNavigationBarsPadding, androidAttributes.addNavigationBarsPadding);
    }

    public int hashCode() {
        AndroidAttributes3 androidAttributes3 = this.statusBarStyle;
        int iHashCode = (androidAttributes3 == null ? 0 : androidAttributes3.hashCode()) * 31;
        Boolean bool = this.addNavigationBarsPadding;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "AndroidAttributes(statusBarStyle=" + this.statusBarStyle + ", addNavigationBarsPadding=" + this.addNavigationBarsPadding + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        AndroidAttributes3 androidAttributes3 = this.statusBarStyle;
        if (androidAttributes3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(androidAttributes3.name());
        }
        Boolean bool = this.addNavigationBarsPadding;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    public AndroidAttributes(AndroidAttributes3 androidAttributes3, Boolean bool) {
        this.statusBarStyle = androidAttributes3;
        this.addNavigationBarsPadding = bool;
    }

    public /* synthetic */ AndroidAttributes(AndroidAttributes3 androidAttributes3, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : androidAttributes3, (i & 2) != 0 ? null : bool);
    }

    public final AndroidAttributes3 getStatusBarStyle() {
        return this.statusBarStyle;
    }

    public final Boolean getAddNavigationBarsPadding() {
        return this.addNavigationBarsPadding;
    }
}
