package com.robinhood.android.transfers.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectDepositShimKey.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eBW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0018R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/transfers/contracts/DirectDepositShimKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "requireCashManagement", "", "fromManualSetupDeeplink", "fromRhyMigration", "fromDDOnboardingFlow", "showEarlyPayHook", "showConfirmationScreen", "fromDirectDepositToBrokerageDeeplink", "fromTransfersHub", "<init>", "(ZZZZZZZZ)V", "getRequireCashManagement", "()Z", "getFromManualSetupDeeplink", "getFromRhyMigration", "getFromDDOnboardingFlow", "getShowEarlyPayHook", "getShowConfirmationScreen", "getFromDirectDepositToBrokerageDeeplink", "getFromTransfersHub", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class DirectDepositShimKey implements IntentKey, Parcelable {
    public static final String EXTRA_DROP_OFF_SURVEY = "dropOffSurvey";
    private final boolean fromDDOnboardingFlow;
    private final boolean fromDirectDepositToBrokerageDeeplink;
    private final boolean fromManualSetupDeeplink;
    private final boolean fromRhyMigration;
    private final boolean fromTransfersHub;
    private final boolean requireCashManagement;
    private final boolean showConfirmationScreen;
    private final boolean showEarlyPayHook;
    public static final Parcelable.Creator<DirectDepositShimKey> CREATOR = new Creator();

    /* compiled from: DirectDepositShimKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes9.dex */
    public static final class Creator implements Parcelable.Creator<DirectDepositShimKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DirectDepositShimKey createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z8 = false;
            boolean z9 = true;
            if (parcel.readInt() != 0) {
                z = false;
                z8 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z9 = z;
            }
            if (parcel.readInt() != 0) {
                z3 = z2;
            } else {
                z3 = z2;
                z2 = z;
            }
            if (parcel.readInt() != 0) {
                z4 = z3;
            } else {
                z4 = z3;
                z3 = z;
            }
            if (parcel.readInt() != 0) {
                z5 = z4;
            } else {
                z5 = z4;
                z4 = z;
            }
            if (parcel.readInt() != 0) {
                z6 = z5;
            } else {
                z6 = z5;
                z5 = z;
            }
            if (parcel.readInt() != 0) {
                z7 = z6;
            } else {
                z7 = z6;
                z6 = z;
            }
            if (parcel.readInt() == 0) {
                z7 = z;
            }
            return new DirectDepositShimKey(z8, z9, z2, z3, z4, z5, z6, z7);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DirectDepositShimKey[] newArray(int i) {
            return new DirectDepositShimKey[i];
        }
    }

    public DirectDepositShimKey() {
        this(false, false, false, false, false, false, false, false, 255, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.requireCashManagement ? 1 : 0);
        dest.writeInt(this.fromManualSetupDeeplink ? 1 : 0);
        dest.writeInt(this.fromRhyMigration ? 1 : 0);
        dest.writeInt(this.fromDDOnboardingFlow ? 1 : 0);
        dest.writeInt(this.showEarlyPayHook ? 1 : 0);
        dest.writeInt(this.showConfirmationScreen ? 1 : 0);
        dest.writeInt(this.fromDirectDepositToBrokerageDeeplink ? 1 : 0);
        dest.writeInt(this.fromTransfersHub ? 1 : 0);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public DirectDepositShimKey(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.requireCashManagement = z;
        this.fromManualSetupDeeplink = z2;
        this.fromRhyMigration = z3;
        this.fromDDOnboardingFlow = z4;
        this.showEarlyPayHook = z5;
        this.showConfirmationScreen = z6;
        this.fromDirectDepositToBrokerageDeeplink = z7;
        this.fromTransfersHub = z8;
    }

    public /* synthetic */ DirectDepositShimKey(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? true : z5, (i & 32) != 0 ? true : z6, (i & 64) != 0 ? false : z7, (i & 128) != 0 ? false : z8);
    }

    public final boolean getRequireCashManagement() {
        return this.requireCashManagement;
    }

    public final boolean getFromManualSetupDeeplink() {
        return this.fromManualSetupDeeplink;
    }

    public final boolean getFromRhyMigration() {
        return this.fromRhyMigration;
    }

    public final boolean getFromDDOnboardingFlow() {
        return this.fromDDOnboardingFlow;
    }

    public final boolean getShowEarlyPayHook() {
        return this.showEarlyPayHook;
    }

    public final boolean getShowConfirmationScreen() {
        return this.showConfirmationScreen;
    }

    public final boolean getFromDirectDepositToBrokerageDeeplink() {
        return this.fromDirectDepositToBrokerageDeeplink;
    }

    public final boolean getFromTransfersHub() {
        return this.fromTransfersHub;
    }
}
