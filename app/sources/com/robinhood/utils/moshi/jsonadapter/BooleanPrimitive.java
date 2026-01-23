package com.robinhood.utils.moshi.jsonadapter;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JsonPrimitive.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/BooleanPrimitive;", "Lcom/robinhood/utils/moshi/jsonadapter/JsonPrimitive;", "", "value", "<init>", "(Z)V", "getValue", "()Ljava/lang/Boolean;", "component1", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-serialization-utils_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BooleanPrimitive extends JsonPrimitive<Boolean> {
    public static final Parcelable.Creator<BooleanPrimitive> CREATOR = new Creator();
    private final boolean value;

    /* compiled from: JsonPrimitive.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<BooleanPrimitive> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BooleanPrimitive createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BooleanPrimitive(parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BooleanPrimitive[] newArray(int i) {
            return new BooleanPrimitive[i];
        }
    }

    public static /* synthetic */ BooleanPrimitive copy$default(BooleanPrimitive booleanPrimitive, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = booleanPrimitive.value;
        }
        return booleanPrimitive.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getValue() {
        return this.value;
    }

    public final BooleanPrimitive copy(boolean value) {
        return new BooleanPrimitive(value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BooleanPrimitive) && this.value == ((BooleanPrimitive) other).value;
    }

    public int hashCode() {
        return Boolean.hashCode(this.value);
    }

    public String toString() {
        return "BooleanPrimitive(value=" + this.value + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.value ? 1 : 0);
    }

    public BooleanPrimitive(boolean z) {
        super(null);
        this.value = z;
    }

    @Override // com.robinhood.utils.moshi.jsonadapter.WrappedValue
    /* renamed from: getValue */
    public Boolean getValue2() {
        return Boolean.valueOf(this.value);
    }
}
