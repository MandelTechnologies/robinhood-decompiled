package com.robinhood.android.advisory.tlh;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Destinations.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/advisory/tlh/GainsAndLossesDestination;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestination;", "<init>", "()V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "feature-tax-loss-harvesting_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class GainsAndLossesDestination extends ComposableDestination {
    public static final GainsAndLossesDestination INSTANCE = new GainsAndLossesDestination();
    public static final int $stable = ComposableDestination.$stable;
    public static final Parcelable.Creator<GainsAndLossesDestination> CREATOR = new Creator();

    /* compiled from: Destinations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<GainsAndLossesDestination> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GainsAndLossesDestination createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return GainsAndLossesDestination.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GainsAndLossesDestination[] newArray(int i) {
            return new GainsAndLossesDestination[i];
        }
    }

    @Override // com.robinhood.android.navigation.compose.destination.ComposableDestination, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    private GainsAndLossesDestination() {
        super("tax_loss_harvest_gains_and_losses", null, null, 6, null);
    }
}
