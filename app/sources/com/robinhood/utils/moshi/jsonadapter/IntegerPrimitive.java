package com.robinhood.utils.moshi.jsonadapter;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: JsonPrimitive.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/utils/moshi/jsonadapter/IntegerPrimitive;", "Lcom/robinhood/utils/moshi/jsonadapter/NumberPrimitive;", "", "value", "<init>", "(J)V", "getValue", "()Ljava/lang/Long;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-serialization-utils_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class IntegerPrimitive extends JsonPrimitive5<Long> {
    public static final Parcelable.Creator<IntegerPrimitive> CREATOR = new Creator();
    private final long value;

    /* compiled from: JsonPrimitive.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<IntegerPrimitive> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntegerPrimitive createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IntegerPrimitive(parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntegerPrimitive[] newArray(int i) {
            return new IntegerPrimitive[i];
        }
    }

    public static /* synthetic */ IntegerPrimitive copy$default(IntegerPrimitive integerPrimitive, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = integerPrimitive.value;
        }
        return integerPrimitive.copy(j);
    }

    /* renamed from: component1, reason: from getter */
    public final long getValue() {
        return this.value;
    }

    public final IntegerPrimitive copy(long value) {
        return new IntegerPrimitive(value);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof IntegerPrimitive) && this.value == ((IntegerPrimitive) other).value;
    }

    public int hashCode() {
        return Long.hashCode(this.value);
    }

    public String toString() {
        return "IntegerPrimitive(value=" + this.value + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.value);
    }

    public IntegerPrimitive(long j) {
        super(null);
        this.value = j;
    }

    @Override // com.robinhood.utils.moshi.jsonadapter.WrappedValue
    /* renamed from: getValue */
    public Long getValue2() {
        return Long.valueOf(this.value);
    }
}
