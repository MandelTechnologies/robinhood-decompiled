package com.robinhood.android.crypto.costbasis.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.crypto.contracts.CryptoCostBasisDetailsIntentKey;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoCostBasisDetailsDestinations.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/CryptoCostBasisDetailsListDest;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "Lcom/robinhood/android/crypto/contracts/CryptoCostBasisDetailsIntentKey;", "<init>", "()V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.costbasis.details.CryptoCostBasisDetailsListDest, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoCostBasisDetailsDestinations2 extends ComposableDestinationWithArgs<CryptoCostBasisDetailsIntentKey> {
    public static final CryptoCostBasisDetailsDestinations2 INSTANCE = new CryptoCostBasisDetailsDestinations2();
    public static final int $stable = ComposableDestinationWithArgs.$stable;
    public static final Parcelable.Creator<CryptoCostBasisDetailsDestinations2> CREATOR = new Creator();

    /* compiled from: CryptoCostBasisDetailsDestinations.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.crypto.costbasis.details.CryptoCostBasisDetailsListDest$Creator */
    public static final class Creator implements Parcelable.Creator<CryptoCostBasisDetailsDestinations2> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoCostBasisDetailsDestinations2 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return CryptoCostBasisDetailsDestinations2.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CryptoCostBasisDetailsDestinations2[] newArray(int i) {
            return new CryptoCostBasisDetailsDestinations2[i];
        }
    }

    @Override // com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    private CryptoCostBasisDetailsDestinations2() {
        super("cost_basis_details_list_dest", CryptoCostBasisDetailsIntentKey.class, null, null, null, 28, null);
    }
}
