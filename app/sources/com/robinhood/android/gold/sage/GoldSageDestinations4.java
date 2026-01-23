package com.robinhood.android.gold.sage;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.gold.sage.data.GoldSageDestinationArgs;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldSageDestinations.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/gold/sage/StartApplicationDest;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "Lcom/robinhood/android/gold/sage/data/GoldSageDestinationArgs;", "<init>", "()V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "feature-gold-sage_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.sage.StartApplicationDest, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldSageDestinations4 extends ComposableDestinationWithArgs<GoldSageDestinationArgs> {
    public static final GoldSageDestinations4 INSTANCE = new GoldSageDestinations4();
    public static final int $stable = ComposableDestinationWithArgs.$stable;
    public static final Parcelable.Creator<GoldSageDestinations4> CREATOR = new Creator();

    /* compiled from: GoldSageDestinations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.gold.sage.StartApplicationDest$Creator */
    public static final class Creator implements Parcelable.Creator<GoldSageDestinations4> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldSageDestinations4 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return GoldSageDestinations4.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldSageDestinations4[] newArray(int i) {
            return new GoldSageDestinations4[i];
        }
    }

    @Override // com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    private GoldSageDestinations4() {
        super("gold_sage_start_application", GoldSageDestinationArgs.class, null, null, null, 28, null);
    }
}
