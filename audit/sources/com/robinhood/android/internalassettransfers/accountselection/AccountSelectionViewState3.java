package com.robinhood.android.internalassettransfers.accountselection;

import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountSelectionViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/ButtonState;", "", "loading", "", "getLoading", "()Z", "Enabled", "Disabled", "Lcom/robinhood/android/internalassettransfers/accountselection/ButtonState$Disabled;", "Lcom/robinhood/android/internalassettransfers/accountselection/ButtonState$Enabled;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.internalassettransfers.accountselection.ButtonState, reason: use source file name */
/* loaded from: classes10.dex */
public interface AccountSelectionViewState3 {
    boolean getLoading();

    /* compiled from: AccountSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/ButtonState$Enabled;", "Lcom/robinhood/android/internalassettransfers/accountselection/ButtonState;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "loading", "", "<init>", "(Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Z)V", "getSourceAccount", "()Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "getSinkAccount", "getLoading", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.internalassettransfers.accountselection.ButtonState$Enabled, reason: from toString */
    public static final /* data */ class Enabled implements AccountSelectionViewState3 {
        public static final int $stable = 8;
        private final boolean loading;
        private final UiIatAccount sinkAccount;
        private final UiIatAccount sourceAccount;

        public static /* synthetic */ Enabled copy$default(Enabled enabled, UiIatAccount uiIatAccount, UiIatAccount uiIatAccount2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uiIatAccount = enabled.sourceAccount;
            }
            if ((i & 2) != 0) {
                uiIatAccount2 = enabled.sinkAccount;
            }
            if ((i & 4) != 0) {
                z = enabled.loading;
            }
            return enabled.copy(uiIatAccount, uiIatAccount2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final UiIatAccount getSourceAccount() {
            return this.sourceAccount;
        }

        /* renamed from: component2, reason: from getter */
        public final UiIatAccount getSinkAccount() {
            return this.sinkAccount;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getLoading() {
            return this.loading;
        }

        public final Enabled copy(UiIatAccount sourceAccount, UiIatAccount sinkAccount, boolean loading) {
            Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
            Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
            return new Enabled(sourceAccount, sinkAccount, loading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Enabled)) {
                return false;
            }
            Enabled enabled = (Enabled) other;
            return Intrinsics.areEqual(this.sourceAccount, enabled.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, enabled.sinkAccount) && this.loading == enabled.loading;
        }

        public int hashCode() {
            return (((this.sourceAccount.hashCode() * 31) + this.sinkAccount.hashCode()) * 31) + Boolean.hashCode(this.loading);
        }

        public String toString() {
            return "Enabled(sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ", loading=" + this.loading + ")";
        }

        public Enabled(UiIatAccount sourceAccount, UiIatAccount sinkAccount, boolean z) {
            Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
            Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
            this.sourceAccount = sourceAccount;
            this.sinkAccount = sinkAccount;
            this.loading = z;
        }

        public final UiIatAccount getSourceAccount() {
            return this.sourceAccount;
        }

        public final UiIatAccount getSinkAccount() {
            return this.sinkAccount;
        }

        @Override // com.robinhood.android.internalassettransfers.accountselection.AccountSelectionViewState3
        public boolean getLoading() {
            return this.loading;
        }
    }

    /* compiled from: AccountSelectionViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/accountselection/ButtonState$Disabled;", "Lcom/robinhood/android/internalassettransfers/accountselection/ButtonState;", "<init>", "()V", "loading", "", "getLoading", "()Z", "equals", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.internalassettransfers.accountselection.ButtonState$Disabled */
    public static final /* data */ class Disabled implements AccountSelectionViewState3 {
        public static final int $stable = 0;
        public static final Disabled INSTANCE = new Disabled();
        private static final boolean loading = false;

        public boolean equals(Object other) {
            return this == other || (other instanceof Disabled);
        }

        public int hashCode() {
            return 616666101;
        }

        public String toString() {
            return "Disabled";
        }

        private Disabled() {
        }

        @Override // com.robinhood.android.internalassettransfers.accountselection.AccountSelectionViewState3
        public boolean getLoading() {
            return loading;
        }
    }
}
