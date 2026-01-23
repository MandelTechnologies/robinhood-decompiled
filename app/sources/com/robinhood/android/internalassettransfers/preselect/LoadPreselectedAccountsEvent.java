package com.robinhood.android.internalassettransfers.preselect;

import com.robinhood.android.internalassettransfers.accountselection.UiIatAccount;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAssets;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoadPreselectedAccountsEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/preselect/LoadPreselectedAccountsEvent;", "", "Incompatible", "Compatible", "Lcom/robinhood/android/internalassettransfers/preselect/LoadPreselectedAccountsEvent$Compatible;", "Lcom/robinhood/android/internalassettransfers/preselect/LoadPreselectedAccountsEvent$Incompatible;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface LoadPreselectedAccountsEvent {

    /* compiled from: LoadPreselectedAccountsEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/preselect/LoadPreselectedAccountsEvent$Incompatible;", "Lcom/robinhood/android/internalassettransfers/preselect/LoadPreselectedAccountsEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Incompatible implements LoadPreselectedAccountsEvent {
        public static final int $stable = 0;
        public static final Incompatible INSTANCE = new Incompatible();

        public boolean equals(Object other) {
            return this == other || (other instanceof Incompatible);
        }

        public int hashCode() {
            return 1524919735;
        }

        public String toString() {
            return "Incompatible";
        }

        private Incompatible() {
        }
    }

    /* compiled from: LoadPreselectedAccountsEvent.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/preselect/LoadPreselectedAccountsEvent$Compatible;", "Lcom/robinhood/android/internalassettransfers/preselect/LoadPreselectedAccountsEvent;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "eligibleAssets", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "<init>", "(Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;)V", "getSourceAccount", "()Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "getSinkAccount", "getEligibleAssets", "()Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Compatible implements LoadPreselectedAccountsEvent {
        public static final int $stable = 8;
        private final EligibleAssets eligibleAssets;
        private final UiIatAccount sinkAccount;
        private final UiIatAccount sourceAccount;

        public static /* synthetic */ Compatible copy$default(Compatible compatible, UiIatAccount uiIatAccount, UiIatAccount uiIatAccount2, EligibleAssets eligibleAssets, int i, Object obj) {
            if ((i & 1) != 0) {
                uiIatAccount = compatible.sourceAccount;
            }
            if ((i & 2) != 0) {
                uiIatAccount2 = compatible.sinkAccount;
            }
            if ((i & 4) != 0) {
                eligibleAssets = compatible.eligibleAssets;
            }
            return compatible.copy(uiIatAccount, uiIatAccount2, eligibleAssets);
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
        public final EligibleAssets getEligibleAssets() {
            return this.eligibleAssets;
        }

        public final Compatible copy(UiIatAccount sourceAccount, UiIatAccount sinkAccount, EligibleAssets eligibleAssets) {
            Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
            Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
            Intrinsics.checkNotNullParameter(eligibleAssets, "eligibleAssets");
            return new Compatible(sourceAccount, sinkAccount, eligibleAssets);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Compatible)) {
                return false;
            }
            Compatible compatible = (Compatible) other;
            return Intrinsics.areEqual(this.sourceAccount, compatible.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, compatible.sinkAccount) && Intrinsics.areEqual(this.eligibleAssets, compatible.eligibleAssets);
        }

        public int hashCode() {
            return (((this.sourceAccount.hashCode() * 31) + this.sinkAccount.hashCode()) * 31) + this.eligibleAssets.hashCode();
        }

        public String toString() {
            return "Compatible(sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ", eligibleAssets=" + this.eligibleAssets + ")";
        }

        public Compatible(UiIatAccount sourceAccount, UiIatAccount sinkAccount, EligibleAssets eligibleAssets) {
            Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
            Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
            Intrinsics.checkNotNullParameter(eligibleAssets, "eligibleAssets");
            this.sourceAccount = sourceAccount;
            this.sinkAccount = sinkAccount;
            this.eligibleAssets = eligibleAssets;
        }

        public final UiIatAccount getSourceAccount() {
            return this.sourceAccount;
        }

        public final UiIatAccount getSinkAccount() {
            return this.sinkAccount;
        }

        public final EligibleAssets getEligibleAssets() {
            return this.eligibleAssets;
        }
    }
}
