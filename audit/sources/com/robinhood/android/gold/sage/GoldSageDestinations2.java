package com.robinhood.android.gold.sage;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldSageDestinations.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/gold/sage/LoadingDest;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestination;", "<init>", "()V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "feature-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.sage.LoadingDest, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldSageDestinations2 extends ComposableDestination {
    public static final GoldSageDestinations2 INSTANCE = new GoldSageDestinations2();
    public static final int $stable = ComposableDestination.$stable;
    public static final Parcelable.Creator<GoldSageDestinations2> CREATOR = new Creator();

    /* compiled from: GoldSageDestinations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.gold.sage.LoadingDest$Creator */
    public static final class Creator implements Parcelable.Creator<GoldSageDestinations2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldSageDestinations2 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return GoldSageDestinations2.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldSageDestinations2[] newArray(int i) {
            return new GoldSageDestinations2[i];
        }
    }

    @Override // com.robinhood.android.navigation.compose.destination.ComposableDestination, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    private GoldSageDestinations2() {
        super("gold_sage_loading", null, null, 6, null);
    }
}
