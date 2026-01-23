package com.robinhood.shared.crypto.staking.staking.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.models.crypto.p315ui.staking.UiCryptoStakingOrderModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StakingNavDests.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/navigation/OrderReceiptDest;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "Lcom/robinhood/models/crypto/ui/staking/UiCryptoStakingOrderModel;", "<init>", "()V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.staking.staking.navigation.OrderReceiptDest, reason: use source file name */
/* loaded from: classes6.dex */
public final class StakingNavDests4 extends ComposableDestinationWithArgs<UiCryptoStakingOrderModel> {
    public static final StakingNavDests4 INSTANCE = new StakingNavDests4();
    public static final int $stable = ComposableDestinationWithArgs.$stable;
    public static final Parcelable.Creator<StakingNavDests4> CREATOR = new Creator();

    /* compiled from: StakingNavDests.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.staking.staking.navigation.OrderReceiptDest$Creator */
    public static final class Creator implements Parcelable.Creator<StakingNavDests4> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StakingNavDests4 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return StakingNavDests4.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StakingNavDests4[] newArray(int i) {
            return new StakingNavDests4[i];
        }
    }

    @Override // com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    private StakingNavDests4() {
        super("crypto_staking_destination_receipt", UiCryptoStakingOrderModel.class, null, null, null, 28, null);
    }
}
