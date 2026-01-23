package com.robinhood.microgram.sdui;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenScrollToBottomRequest.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0006\u0010\f\u001a\u00020\tJ\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/ScreenScrollToBottomRequest;", "Landroid/os/Parcelable;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class ScreenScrollToBottomRequest implements Parcelable {
    public static final Parcelable.Creator<ScreenScrollToBottomRequest> CREATOR = new Creator();

    /* compiled from: ScreenScrollToBottomRequest.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ScreenScrollToBottomRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScreenScrollToBottomRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return new ScreenScrollToBottomRequest();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScreenScrollToBottomRequest[] newArray(int i) {
            return new ScreenScrollToBottomRequest[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    public boolean equals(Object other) {
        return other instanceof ScreenScrollToBottomRequest;
    }

    public int hashCode() {
        return ScreenScrollToBottomRequest.class.hashCode();
    }

    public String toString() {
        String simpleName = ScreenScrollToBottomRequest.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
