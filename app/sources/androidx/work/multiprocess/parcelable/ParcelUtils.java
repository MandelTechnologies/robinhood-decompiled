package androidx.work.multiprocess.parcelable;

import android.os.Parcel;

/* loaded from: classes16.dex */
public final class ParcelUtils {
    public static boolean readBooleanValue(Parcel parcel) {
        return parcel.readInt() == 1;
    }

    public static void writeBooleanValue(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }
}
