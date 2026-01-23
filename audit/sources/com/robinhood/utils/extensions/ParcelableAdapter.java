package com.robinhood.utils.extensions;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: Parcelable.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/utils/extensions/ParcelableAdapter;", "Landroid/os/Parcelable;", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "lib-utils-android_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public interface ParcelableAdapter extends Parcelable {

    /* compiled from: Parcelable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public static final class DefaultImpls {
        public static int describeContents(ParcelableAdapter parcelableAdapter) {
            return 0;
        }
    }

    int describeContents();

    void writeToParcel(Parcel dest, int flags);
}
