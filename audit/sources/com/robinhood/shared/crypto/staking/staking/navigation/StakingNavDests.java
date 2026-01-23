package com.robinhood.shared.crypto.staking.staking.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs;
import com.robinhood.shared.crypto.staking.staking.input.CryptoStakingInputDuxo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StakingNavDests.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/navigation/AmountInputDest;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestinationWithArgs;", "Lcom/robinhood/shared/crypto/staking/staking/input/CryptoStakingInputDuxo$InitArgs;", "<init>", "()V", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.staking.staking.navigation.AmountInputDest, reason: use source file name */
/* loaded from: classes6.dex */
public final class StakingNavDests extends ComposableDestinationWithArgs<CryptoStakingInputDuxo.InitArgs> {
    public static final StakingNavDests INSTANCE = new StakingNavDests();
    public static final int $stable = ComposableDestinationWithArgs.$stable;
    public static final Parcelable.Creator<StakingNavDests> CREATOR = new Creator();

    /* compiled from: StakingNavDests.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.staking.staking.navigation.AmountInputDest$Creator */
    public static final class Creator implements Parcelable.Creator<StakingNavDests> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StakingNavDests createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return StakingNavDests.INSTANCE;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final StakingNavDests[] newArray(int i) {
            return new StakingNavDests[i];
        }
    }

    @Override // com.robinhood.android.navigation.compose.destination.ComposableDestinationWithArgs, android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }

    private StakingNavDests() {
        super("crypto_staking_destination_input", CryptoStakingInputDuxo.InitArgs.class, null, null, null, 28, null);
    }
}
