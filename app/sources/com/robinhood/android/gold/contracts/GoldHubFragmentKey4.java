package com.robinhood.android.gold.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.gold.lib.hub.api.GoldDepositBoostHubPayoutSection;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldHubFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/gold/contracts/GoldDepositBoostUpcomingPayoutFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/gold/lib/hub/api/GoldDepositBoostHubPayoutSection;", "<init>", "(Lcom/robinhood/android/gold/lib/hub/api/GoldDepositBoostHubPayoutSection;)V", "getData", "()Lcom/robinhood/android/gold/lib/hub/api/GoldDepositBoostHubPayoutSection;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.contracts.GoldDepositBoostUpcomingPayoutFragmentKey, reason: use source file name */
/* loaded from: classes17.dex */
public final class GoldHubFragmentKey4 implements FragmentKey, Parcelable {
    public static final Parcelable.Creator<GoldHubFragmentKey4> CREATOR = new Creator();
    private final GoldDepositBoostHubPayoutSection data;

    /* compiled from: GoldHubFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.gold.contracts.GoldDepositBoostUpcomingPayoutFragmentKey$Creator */
    /* loaded from: classes10.dex */
    public static final class Creator implements Parcelable.Creator<GoldHubFragmentKey4> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldHubFragmentKey4 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GoldHubFragmentKey4((GoldDepositBoostHubPayoutSection) parcel.readParcelable(GoldHubFragmentKey4.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldHubFragmentKey4[] newArray(int i) {
            return new GoldHubFragmentKey4[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.data, flags);
    }

    public GoldHubFragmentKey4(GoldDepositBoostHubPayoutSection data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public final GoldDepositBoostHubPayoutSection getData() {
        return this.data;
    }
}
