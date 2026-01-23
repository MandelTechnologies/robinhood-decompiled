package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.rosetta.eventlogging.WiresContext;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WireRoutingDetailsInputActivityIntentKey.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J+\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputActivityIntentKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "transferAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "wiresContext", "Lcom/robinhood/rosetta/eventlogging/WiresContext;", "needNewAccountResult", "", "<init>", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/rosetta/eventlogging/WiresContext;Z)V", "getTransferAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getWiresContext", "()Lcom/robinhood/rosetta/eventlogging/WiresContext;", "getNeedNewAccountResult", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class WireRoutingDetailsInputActivityIntentKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<WireRoutingDetailsInputActivityIntentKey> CREATOR = new Creator();
    private final boolean needNewAccountResult;
    private final TransferAccount transferAccount;
    private final WiresContext wiresContext;

    /* compiled from: WireRoutingDetailsInputActivityIntentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<WireRoutingDetailsInputActivityIntentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireRoutingDetailsInputActivityIntentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WireRoutingDetailsInputActivityIntentKey((TransferAccount) parcel.readParcelable(WireRoutingDetailsInputActivityIntentKey.class.getClassLoader()), (WiresContext) parcel.readSerializable(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final WireRoutingDetailsInputActivityIntentKey[] newArray(int i) {
            return new WireRoutingDetailsInputActivityIntentKey[i];
        }
    }

    public static /* synthetic */ WireRoutingDetailsInputActivityIntentKey copy$default(WireRoutingDetailsInputActivityIntentKey wireRoutingDetailsInputActivityIntentKey, TransferAccount transferAccount, WiresContext wiresContext, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            transferAccount = wireRoutingDetailsInputActivityIntentKey.transferAccount;
        }
        if ((i & 2) != 0) {
            wiresContext = wireRoutingDetailsInputActivityIntentKey.wiresContext;
        }
        if ((i & 4) != 0) {
            z = wireRoutingDetailsInputActivityIntentKey.needNewAccountResult;
        }
        return wireRoutingDetailsInputActivityIntentKey.copy(transferAccount, wiresContext, z);
    }

    /* renamed from: component1, reason: from getter */
    public final TransferAccount getTransferAccount() {
        return this.transferAccount;
    }

    /* renamed from: component2, reason: from getter */
    public final WiresContext getWiresContext() {
        return this.wiresContext;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getNeedNewAccountResult() {
        return this.needNewAccountResult;
    }

    public final WireRoutingDetailsInputActivityIntentKey copy(TransferAccount transferAccount, WiresContext wiresContext, boolean needNewAccountResult) {
        return new WireRoutingDetailsInputActivityIntentKey(transferAccount, wiresContext, needNewAccountResult);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WireRoutingDetailsInputActivityIntentKey)) {
            return false;
        }
        WireRoutingDetailsInputActivityIntentKey wireRoutingDetailsInputActivityIntentKey = (WireRoutingDetailsInputActivityIntentKey) other;
        return Intrinsics.areEqual(this.transferAccount, wireRoutingDetailsInputActivityIntentKey.transferAccount) && Intrinsics.areEqual(this.wiresContext, wireRoutingDetailsInputActivityIntentKey.wiresContext) && this.needNewAccountResult == wireRoutingDetailsInputActivityIntentKey.needNewAccountResult;
    }

    public int hashCode() {
        TransferAccount transferAccount = this.transferAccount;
        int iHashCode = (transferAccount == null ? 0 : transferAccount.hashCode()) * 31;
        WiresContext wiresContext = this.wiresContext;
        return ((iHashCode + (wiresContext != null ? wiresContext.hashCode() : 0)) * 31) + Boolean.hashCode(this.needNewAccountResult);
    }

    public String toString() {
        return "WireRoutingDetailsInputActivityIntentKey(transferAccount=" + this.transferAccount + ", wiresContext=" + this.wiresContext + ", needNewAccountResult=" + this.needNewAccountResult + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.transferAccount, flags);
        dest.writeSerializable(this.wiresContext);
        dest.writeInt(this.needNewAccountResult ? 1 : 0);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public WireRoutingDetailsInputActivityIntentKey(TransferAccount transferAccount, WiresContext wiresContext, boolean z) {
        this.transferAccount = transferAccount;
        this.wiresContext = wiresContext;
        this.needNewAccountResult = z;
    }

    public /* synthetic */ WireRoutingDetailsInputActivityIntentKey(TransferAccount transferAccount, WiresContext wiresContext, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(transferAccount, wiresContext, (i & 4) != 0 ? false : z);
    }

    public final TransferAccount getTransferAccount() {
        return this.transferAccount;
    }

    public final WiresContext getWiresContext() {
        return this.wiresContext;
    }

    public final boolean getNeedNewAccountResult() {
        return this.needNewAccountResult;
    }
}
