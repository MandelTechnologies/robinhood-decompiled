package com.robinhood.shared.crypto.acats.history;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAcatsHistoryDestinations.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/history/CryptoAcatsHistoryDest;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestination;", "<init>", "()V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryDest, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoAcatsHistoryDestinations extends ComposableDestination {
    public static final CryptoAcatsHistoryDestinations INSTANCE = new CryptoAcatsHistoryDestinations();
    public static final int $stable = ComposableDestination.$stable;
    public static final Parcelable.Creator<CryptoAcatsHistoryDestinations> CREATOR = new Creator();

    /* compiled from: CryptoAcatsHistoryDestinations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.acats.history.CryptoAcatsHistoryDest$Creator */
    public static final class Creator implements Parcelable.Creator<CryptoAcatsHistoryDestinations> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoAcatsHistoryDestinations createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return CryptoAcatsHistoryDestinations.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoAcatsHistoryDestinations[] newArray(int i) {
            return new CryptoAcatsHistoryDestinations[i];
        }
    }

    @Override // com.robinhood.android.navigation.compose.destination.ComposableDestination, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    private CryptoAcatsHistoryDestinations() {
        super("crypto_acats_history", null, null, 6, null);
    }
}
