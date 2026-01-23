package com.robinhood.android.account.p060ui;

import com.robinhood.android.account.overview.C8159R;
import com.robinhood.android.models.accountoverview.p184db.CardOrder;
import com.robinhood.librobinhood.data.store.DripSettingsStore;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountOverviewDripCard.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0010HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/account/ui/DripSectionState;", "Lcom/robinhood/android/account/ui/AccountOverviewSectionState;", "dripCardType", "Lcom/robinhood/librobinhood/data/store/DripSettingsStore$DripCardType;", "isDripOnboarded", "", "accountNumber", "", "<init>", "(Lcom/robinhood/librobinhood/data/store/DripSettingsStore$DripCardType;ZLjava/lang/String;)V", "getDripCardType", "()Lcom/robinhood/librobinhood/data/store/DripSettingsStore$DripCardType;", "()Z", "getAccountNumber", "()Ljava/lang/String;", "statusTextRes", "", "getStatusTextRes", "()I", "enableActionTextRes", "getEnableActionTextRes", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class DripSectionState extends AccountOverviewSectionState {
    public static final int $stable = 0;
    private final String accountNumber;
    private final DripSettingsStore.DripCardType dripCardType;
    private final boolean isDripOnboarded;

    /* compiled from: AccountOverviewDripCard.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DripSettingsStore.DripCardType.values().length];
            try {
                iArr[DripSettingsStore.DripCardType.DISABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DripSettingsStore.DripCardType.ENABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DripSettingsStore.DripCardType.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ DripSectionState copy$default(DripSectionState dripSectionState, DripSettingsStore.DripCardType dripCardType, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            dripCardType = dripSectionState.dripCardType;
        }
        if ((i & 2) != 0) {
            z = dripSectionState.isDripOnboarded;
        }
        if ((i & 4) != 0) {
            str = dripSectionState.accountNumber;
        }
        return dripSectionState.copy(dripCardType, z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final DripSettingsStore.DripCardType getDripCardType() {
        return this.dripCardType;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsDripOnboarded() {
        return this.isDripOnboarded;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final DripSectionState copy(DripSettingsStore.DripCardType dripCardType, boolean isDripOnboarded, String accountNumber) {
        Intrinsics.checkNotNullParameter(dripCardType, "dripCardType");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return new DripSectionState(dripCardType, isDripOnboarded, accountNumber);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DripSectionState)) {
            return false;
        }
        DripSectionState dripSectionState = (DripSectionState) other;
        return this.dripCardType == dripSectionState.dripCardType && this.isDripOnboarded == dripSectionState.isDripOnboarded && Intrinsics.areEqual(this.accountNumber, dripSectionState.accountNumber);
    }

    public int hashCode() {
        return (((this.dripCardType.hashCode() * 31) + Boolean.hashCode(this.isDripOnboarded)) * 31) + this.accountNumber.hashCode();
    }

    public String toString() {
        return "DripSectionState(dripCardType=" + this.dripCardType + ", isDripOnboarded=" + this.isDripOnboarded + ", accountNumber=" + this.accountNumber + ")";
    }

    public final DripSettingsStore.DripCardType getDripCardType() {
        return this.dripCardType;
    }

    public final boolean isDripOnboarded() {
        return this.isDripOnboarded;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DripSectionState(DripSettingsStore.DripCardType dripCardType, boolean z, String accountNumber) {
        super(CardOrder.CardIdentifier.DRIP, null);
        Intrinsics.checkNotNullParameter(dripCardType, "dripCardType");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.dripCardType = dripCardType;
        this.isDripOnboarded = z;
        this.accountNumber = accountNumber;
    }

    public final int getStatusTextRes() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.dripCardType.ordinal()];
        if (i == 1) {
            return C8159R.string.account_overview_drip_disabled;
        }
        if (i == 2) {
            return C8159R.string.account_overview_drip_enabled;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Unexpected DRIP card type: NONE");
    }

    public final int getEnableActionTextRes() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.dripCardType.ordinal()];
        if (i == 1) {
            return C8159R.string.account_overview_drip_enable_action;
        }
        if (i == 2) {
            return C8159R.string.account_overview_drip_edit_action;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Unexpected DRIP card type: NONE");
    }
}
