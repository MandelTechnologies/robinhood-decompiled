package com.robinhood.android.internalassettransfers;

import com.robinhood.android.internalassettransfers.accountselection.UiIatAccount;
import com.robinhood.android.internalassettransfers.presubmissionwarn.PresubmissionChecksAlertSheet;
import com.robinhood.android.internalassettransfers.review.models.UiAssets;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAssets;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferEvent.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/InternalAssetTransferEvent;", "", "NavigateToFullPartialChoiceScreen", "NavigateToAgreementsScreen", "NavigateToCustomSelectionScreen", "NavigateToCashBalanceScreen", "NavigateToReviewScreen", "NavigateToReviewAssetsScreen", "NavigateToPreSubmissionWarnsScreen", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferEvent$NavigateToAgreementsScreen;", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferEvent$NavigateToCashBalanceScreen;", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferEvent$NavigateToCustomSelectionScreen;", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferEvent$NavigateToFullPartialChoiceScreen;", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferEvent$NavigateToPreSubmissionWarnsScreen;", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferEvent$NavigateToReviewAssetsScreen;", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferEvent$NavigateToReviewScreen;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface InternalAssetTransferEvent {

    /* compiled from: InternalAssetTransferEvent.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/InternalAssetTransferEvent$NavigateToFullPartialChoiceScreen;", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferEvent;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "sourceEligibleAssets", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "source", "", "<init>", "(Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;Ljava/lang/String;)V", "getSinkAccount", "()Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "getSourceAccount", "getSourceEligibleAssets", "()Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "getSource", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToFullPartialChoiceScreen implements InternalAssetTransferEvent {
        public static final int $stable = 8;
        private final UiIatAccount sinkAccount;
        private final String source;
        private final UiIatAccount sourceAccount;
        private final EligibleAssets sourceEligibleAssets;

        public static /* synthetic */ NavigateToFullPartialChoiceScreen copy$default(NavigateToFullPartialChoiceScreen navigateToFullPartialChoiceScreen, UiIatAccount uiIatAccount, UiIatAccount uiIatAccount2, EligibleAssets eligibleAssets, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                uiIatAccount = navigateToFullPartialChoiceScreen.sinkAccount;
            }
            if ((i & 2) != 0) {
                uiIatAccount2 = navigateToFullPartialChoiceScreen.sourceAccount;
            }
            if ((i & 4) != 0) {
                eligibleAssets = navigateToFullPartialChoiceScreen.sourceEligibleAssets;
            }
            if ((i & 8) != 0) {
                str = navigateToFullPartialChoiceScreen.source;
            }
            return navigateToFullPartialChoiceScreen.copy(uiIatAccount, uiIatAccount2, eligibleAssets, str);
        }

        /* renamed from: component1, reason: from getter */
        public final UiIatAccount getSinkAccount() {
            return this.sinkAccount;
        }

        /* renamed from: component2, reason: from getter */
        public final UiIatAccount getSourceAccount() {
            return this.sourceAccount;
        }

        /* renamed from: component3, reason: from getter */
        public final EligibleAssets getSourceEligibleAssets() {
            return this.sourceEligibleAssets;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final NavigateToFullPartialChoiceScreen copy(UiIatAccount sinkAccount, UiIatAccount sourceAccount, EligibleAssets sourceEligibleAssets, String source) {
            Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
            Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
            Intrinsics.checkNotNullParameter(sourceEligibleAssets, "sourceEligibleAssets");
            Intrinsics.checkNotNullParameter(source, "source");
            return new NavigateToFullPartialChoiceScreen(sinkAccount, sourceAccount, sourceEligibleAssets, source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigateToFullPartialChoiceScreen)) {
                return false;
            }
            NavigateToFullPartialChoiceScreen navigateToFullPartialChoiceScreen = (NavigateToFullPartialChoiceScreen) other;
            return Intrinsics.areEqual(this.sinkAccount, navigateToFullPartialChoiceScreen.sinkAccount) && Intrinsics.areEqual(this.sourceAccount, navigateToFullPartialChoiceScreen.sourceAccount) && Intrinsics.areEqual(this.sourceEligibleAssets, navigateToFullPartialChoiceScreen.sourceEligibleAssets) && Intrinsics.areEqual(this.source, navigateToFullPartialChoiceScreen.source);
        }

        public int hashCode() {
            return (((((this.sinkAccount.hashCode() * 31) + this.sourceAccount.hashCode()) * 31) + this.sourceEligibleAssets.hashCode()) * 31) + this.source.hashCode();
        }

        public String toString() {
            return "NavigateToFullPartialChoiceScreen(sinkAccount=" + this.sinkAccount + ", sourceAccount=" + this.sourceAccount + ", sourceEligibleAssets=" + this.sourceEligibleAssets + ", source=" + this.source + ")";
        }

        public NavigateToFullPartialChoiceScreen(UiIatAccount sinkAccount, UiIatAccount sourceAccount, EligibleAssets sourceEligibleAssets, String source) {
            Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
            Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
            Intrinsics.checkNotNullParameter(sourceEligibleAssets, "sourceEligibleAssets");
            Intrinsics.checkNotNullParameter(source, "source");
            this.sinkAccount = sinkAccount;
            this.sourceAccount = sourceAccount;
            this.sourceEligibleAssets = sourceEligibleAssets;
            this.source = source;
        }

        public final UiIatAccount getSinkAccount() {
            return this.sinkAccount;
        }

        public final UiIatAccount getSourceAccount() {
            return this.sourceAccount;
        }

        public final EligibleAssets getSourceEligibleAssets() {
            return this.sourceEligibleAssets;
        }

        public final String getSource() {
            return this.source;
        }
    }

    /* compiled from: InternalAssetTransferEvent.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/InternalAssetTransferEvent$NavigateToAgreementsScreen;", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferEvent;", "source", "", "<init>", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToAgreementsScreen implements InternalAssetTransferEvent {
        public static final int $stable = 0;
        private final String source;

        public static /* synthetic */ NavigateToAgreementsScreen copy$default(NavigateToAgreementsScreen navigateToAgreementsScreen, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateToAgreementsScreen.source;
            }
            return navigateToAgreementsScreen.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final NavigateToAgreementsScreen copy(String source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new NavigateToAgreementsScreen(source);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NavigateToAgreementsScreen) && Intrinsics.areEqual(this.source, ((NavigateToAgreementsScreen) other).source);
        }

        public int hashCode() {
            return this.source.hashCode();
        }

        public String toString() {
            return "NavigateToAgreementsScreen(source=" + this.source + ")";
        }

        public NavigateToAgreementsScreen(String source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.source = source;
        }

        public final String getSource() {
            return this.source;
        }
    }

    /* compiled from: InternalAssetTransferEvent.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/InternalAssetTransferEvent$NavigateToCustomSelectionScreen;", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferEvent;", "source", "", "sourceEligibleAssets", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "assetSelection", "Lcom/robinhood/android/internalassettransfers/AssetSelection;", "accountSelection", "Lcom/robinhood/android/internalassettransfers/AccountSelection;", "abortTheFlow", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;Lcom/robinhood/android/internalassettransfers/AssetSelection;Lcom/robinhood/android/internalassettransfers/AccountSelection;Z)V", "getSource", "()Ljava/lang/String;", "getSourceEligibleAssets", "()Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "getAssetSelection", "()Lcom/robinhood/android/internalassettransfers/AssetSelection;", "getAccountSelection", "()Lcom/robinhood/android/internalassettransfers/AccountSelection;", "getAbortTheFlow", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToCustomSelectionScreen implements InternalAssetTransferEvent {
        public static final int $stable = 8;
        private final boolean abortTheFlow;
        private final AccountSelection accountSelection;
        private final AssetSelection assetSelection;
        private final String source;
        private final EligibleAssets sourceEligibleAssets;

        public static /* synthetic */ NavigateToCustomSelectionScreen copy$default(NavigateToCustomSelectionScreen navigateToCustomSelectionScreen, String str, EligibleAssets eligibleAssets, AssetSelection assetSelection, AccountSelection accountSelection, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateToCustomSelectionScreen.source;
            }
            if ((i & 2) != 0) {
                eligibleAssets = navigateToCustomSelectionScreen.sourceEligibleAssets;
            }
            if ((i & 4) != 0) {
                assetSelection = navigateToCustomSelectionScreen.assetSelection;
            }
            if ((i & 8) != 0) {
                accountSelection = navigateToCustomSelectionScreen.accountSelection;
            }
            if ((i & 16) != 0) {
                z = navigateToCustomSelectionScreen.abortTheFlow;
            }
            boolean z2 = z;
            AssetSelection assetSelection2 = assetSelection;
            return navigateToCustomSelectionScreen.copy(str, eligibleAssets, assetSelection2, accountSelection, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final EligibleAssets getSourceEligibleAssets() {
            return this.sourceEligibleAssets;
        }

        /* renamed from: component3, reason: from getter */
        public final AssetSelection getAssetSelection() {
            return this.assetSelection;
        }

        /* renamed from: component4, reason: from getter */
        public final AccountSelection getAccountSelection() {
            return this.accountSelection;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getAbortTheFlow() {
            return this.abortTheFlow;
        }

        public final NavigateToCustomSelectionScreen copy(String source, EligibleAssets sourceEligibleAssets, AssetSelection assetSelection, AccountSelection accountSelection, boolean abortTheFlow) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sourceEligibleAssets, "sourceEligibleAssets");
            Intrinsics.checkNotNullParameter(assetSelection, "assetSelection");
            Intrinsics.checkNotNullParameter(accountSelection, "accountSelection");
            return new NavigateToCustomSelectionScreen(source, sourceEligibleAssets, assetSelection, accountSelection, abortTheFlow);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigateToCustomSelectionScreen)) {
                return false;
            }
            NavigateToCustomSelectionScreen navigateToCustomSelectionScreen = (NavigateToCustomSelectionScreen) other;
            return Intrinsics.areEqual(this.source, navigateToCustomSelectionScreen.source) && Intrinsics.areEqual(this.sourceEligibleAssets, navigateToCustomSelectionScreen.sourceEligibleAssets) && Intrinsics.areEqual(this.assetSelection, navigateToCustomSelectionScreen.assetSelection) && Intrinsics.areEqual(this.accountSelection, navigateToCustomSelectionScreen.accountSelection) && this.abortTheFlow == navigateToCustomSelectionScreen.abortTheFlow;
        }

        public int hashCode() {
            return (((((((this.source.hashCode() * 31) + this.sourceEligibleAssets.hashCode()) * 31) + this.assetSelection.hashCode()) * 31) + this.accountSelection.hashCode()) * 31) + Boolean.hashCode(this.abortTheFlow);
        }

        public String toString() {
            return "NavigateToCustomSelectionScreen(source=" + this.source + ", sourceEligibleAssets=" + this.sourceEligibleAssets + ", assetSelection=" + this.assetSelection + ", accountSelection=" + this.accountSelection + ", abortTheFlow=" + this.abortTheFlow + ")";
        }

        public NavigateToCustomSelectionScreen(String source, EligibleAssets sourceEligibleAssets, AssetSelection assetSelection, AccountSelection accountSelection, boolean z) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sourceEligibleAssets, "sourceEligibleAssets");
            Intrinsics.checkNotNullParameter(assetSelection, "assetSelection");
            Intrinsics.checkNotNullParameter(accountSelection, "accountSelection");
            this.source = source;
            this.sourceEligibleAssets = sourceEligibleAssets;
            this.assetSelection = assetSelection;
            this.accountSelection = accountSelection;
            this.abortTheFlow = z;
        }

        public final String getSource() {
            return this.source;
        }

        public final EligibleAssets getSourceEligibleAssets() {
            return this.sourceEligibleAssets;
        }

        public final AssetSelection getAssetSelection() {
            return this.assetSelection;
        }

        public final AccountSelection getAccountSelection() {
            return this.accountSelection;
        }

        public final boolean getAbortTheFlow() {
            return this.abortTheFlow;
        }
    }

    /* compiled from: InternalAssetTransferEvent.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/InternalAssetTransferEvent$NavigateToCashBalanceScreen;", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferEvent;", "source", "", "sourceEligibleAssets", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "assetSelection", "Lcom/robinhood/android/internalassettransfers/AssetSelection;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;Lcom/robinhood/android/internalassettransfers/AssetSelection;)V", "getSource", "()Ljava/lang/String;", "getSourceEligibleAssets", "()Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "getAssetSelection", "()Lcom/robinhood/android/internalassettransfers/AssetSelection;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToCashBalanceScreen implements InternalAssetTransferEvent {
        public static final int $stable = 8;
        private final AssetSelection assetSelection;
        private final String source;
        private final EligibleAssets sourceEligibleAssets;

        public static /* synthetic */ NavigateToCashBalanceScreen copy$default(NavigateToCashBalanceScreen navigateToCashBalanceScreen, String str, EligibleAssets eligibleAssets, AssetSelection assetSelection, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateToCashBalanceScreen.source;
            }
            if ((i & 2) != 0) {
                eligibleAssets = navigateToCashBalanceScreen.sourceEligibleAssets;
            }
            if ((i & 4) != 0) {
                assetSelection = navigateToCashBalanceScreen.assetSelection;
            }
            return navigateToCashBalanceScreen.copy(str, eligibleAssets, assetSelection);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final EligibleAssets getSourceEligibleAssets() {
            return this.sourceEligibleAssets;
        }

        /* renamed from: component3, reason: from getter */
        public final AssetSelection getAssetSelection() {
            return this.assetSelection;
        }

        public final NavigateToCashBalanceScreen copy(String source, EligibleAssets sourceEligibleAssets, AssetSelection assetSelection) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sourceEligibleAssets, "sourceEligibleAssets");
            Intrinsics.checkNotNullParameter(assetSelection, "assetSelection");
            return new NavigateToCashBalanceScreen(source, sourceEligibleAssets, assetSelection);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigateToCashBalanceScreen)) {
                return false;
            }
            NavigateToCashBalanceScreen navigateToCashBalanceScreen = (NavigateToCashBalanceScreen) other;
            return Intrinsics.areEqual(this.source, navigateToCashBalanceScreen.source) && Intrinsics.areEqual(this.sourceEligibleAssets, navigateToCashBalanceScreen.sourceEligibleAssets) && Intrinsics.areEqual(this.assetSelection, navigateToCashBalanceScreen.assetSelection);
        }

        public int hashCode() {
            return (((this.source.hashCode() * 31) + this.sourceEligibleAssets.hashCode()) * 31) + this.assetSelection.hashCode();
        }

        public String toString() {
            return "NavigateToCashBalanceScreen(source=" + this.source + ", sourceEligibleAssets=" + this.sourceEligibleAssets + ", assetSelection=" + this.assetSelection + ")";
        }

        public NavigateToCashBalanceScreen(String source, EligibleAssets sourceEligibleAssets, AssetSelection assetSelection) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sourceEligibleAssets, "sourceEligibleAssets");
            Intrinsics.checkNotNullParameter(assetSelection, "assetSelection");
            this.source = source;
            this.sourceEligibleAssets = sourceEligibleAssets;
            this.assetSelection = assetSelection;
        }

        public final String getSource() {
            return this.source;
        }

        public final EligibleAssets getSourceEligibleAssets() {
            return this.sourceEligibleAssets;
        }

        public final AssetSelection getAssetSelection() {
            return this.assetSelection;
        }
    }

    /* compiled from: InternalAssetTransferEvent.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/InternalAssetTransferEvent$NavigateToReviewScreen;", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferEvent;", "accountSelection", "Lcom/robinhood/android/internalassettransfers/AccountSelection;", "source", "", "assetsToTransfer", "Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "nonTransferableAssetsToDisplay", "<init>", "(Lcom/robinhood/android/internalassettransfers/AccountSelection;Ljava/lang/String;Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;)V", "getAccountSelection", "()Lcom/robinhood/android/internalassettransfers/AccountSelection;", "getSource", "()Ljava/lang/String;", "getAssetsToTransfer", "()Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "getNonTransferableAssetsToDisplay", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToReviewScreen implements InternalAssetTransferEvent {
        public static final int $stable = 8;
        private final AccountSelection accountSelection;
        private final UiAssets assetsToTransfer;
        private final UiAssets nonTransferableAssetsToDisplay;
        private final String source;

        public static /* synthetic */ NavigateToReviewScreen copy$default(NavigateToReviewScreen navigateToReviewScreen, AccountSelection accountSelection, String str, UiAssets uiAssets, UiAssets uiAssets2, int i, Object obj) {
            if ((i & 1) != 0) {
                accountSelection = navigateToReviewScreen.accountSelection;
            }
            if ((i & 2) != 0) {
                str = navigateToReviewScreen.source;
            }
            if ((i & 4) != 0) {
                uiAssets = navigateToReviewScreen.assetsToTransfer;
            }
            if ((i & 8) != 0) {
                uiAssets2 = navigateToReviewScreen.nonTransferableAssetsToDisplay;
            }
            return navigateToReviewScreen.copy(accountSelection, str, uiAssets, uiAssets2);
        }

        /* renamed from: component1, reason: from getter */
        public final AccountSelection getAccountSelection() {
            return this.accountSelection;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component3, reason: from getter */
        public final UiAssets getAssetsToTransfer() {
            return this.assetsToTransfer;
        }

        /* renamed from: component4, reason: from getter */
        public final UiAssets getNonTransferableAssetsToDisplay() {
            return this.nonTransferableAssetsToDisplay;
        }

        public final NavigateToReviewScreen copy(AccountSelection accountSelection, String source, UiAssets assetsToTransfer, UiAssets nonTransferableAssetsToDisplay) {
            Intrinsics.checkNotNullParameter(accountSelection, "accountSelection");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(assetsToTransfer, "assetsToTransfer");
            Intrinsics.checkNotNullParameter(nonTransferableAssetsToDisplay, "nonTransferableAssetsToDisplay");
            return new NavigateToReviewScreen(accountSelection, source, assetsToTransfer, nonTransferableAssetsToDisplay);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigateToReviewScreen)) {
                return false;
            }
            NavigateToReviewScreen navigateToReviewScreen = (NavigateToReviewScreen) other;
            return Intrinsics.areEqual(this.accountSelection, navigateToReviewScreen.accountSelection) && Intrinsics.areEqual(this.source, navigateToReviewScreen.source) && Intrinsics.areEqual(this.assetsToTransfer, navigateToReviewScreen.assetsToTransfer) && Intrinsics.areEqual(this.nonTransferableAssetsToDisplay, navigateToReviewScreen.nonTransferableAssetsToDisplay);
        }

        public int hashCode() {
            return (((((this.accountSelection.hashCode() * 31) + this.source.hashCode()) * 31) + this.assetsToTransfer.hashCode()) * 31) + this.nonTransferableAssetsToDisplay.hashCode();
        }

        public String toString() {
            return "NavigateToReviewScreen(accountSelection=" + this.accountSelection + ", source=" + this.source + ", assetsToTransfer=" + this.assetsToTransfer + ", nonTransferableAssetsToDisplay=" + this.nonTransferableAssetsToDisplay + ")";
        }

        public NavigateToReviewScreen(AccountSelection accountSelection, String source, UiAssets assetsToTransfer, UiAssets nonTransferableAssetsToDisplay) {
            Intrinsics.checkNotNullParameter(accountSelection, "accountSelection");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(assetsToTransfer, "assetsToTransfer");
            Intrinsics.checkNotNullParameter(nonTransferableAssetsToDisplay, "nonTransferableAssetsToDisplay");
            this.accountSelection = accountSelection;
            this.source = source;
            this.assetsToTransfer = assetsToTransfer;
            this.nonTransferableAssetsToDisplay = nonTransferableAssetsToDisplay;
        }

        public final AccountSelection getAccountSelection() {
            return this.accountSelection;
        }

        public final String getSource() {
            return this.source;
        }

        public final UiAssets getAssetsToTransfer() {
            return this.assetsToTransfer;
        }

        public final UiAssets getNonTransferableAssetsToDisplay() {
            return this.nonTransferableAssetsToDisplay;
        }
    }

    /* compiled from: InternalAssetTransferEvent.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/InternalAssetTransferEvent$NavigateToReviewAssetsScreen;", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferEvent;", "source", "", "assets", "Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;)V", "getSource", "()Ljava/lang/String;", "getAssets", "()Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToReviewAssetsScreen implements InternalAssetTransferEvent {
        public static final int $stable = 8;
        private final UiAssets assets;
        private final String source;

        public static /* synthetic */ NavigateToReviewAssetsScreen copy$default(NavigateToReviewAssetsScreen navigateToReviewAssetsScreen, String str, UiAssets uiAssets, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateToReviewAssetsScreen.source;
            }
            if ((i & 2) != 0) {
                uiAssets = navigateToReviewAssetsScreen.assets;
            }
            return navigateToReviewAssetsScreen.copy(str, uiAssets);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component2, reason: from getter */
        public final UiAssets getAssets() {
            return this.assets;
        }

        public final NavigateToReviewAssetsScreen copy(String source, UiAssets assets) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(assets, "assets");
            return new NavigateToReviewAssetsScreen(source, assets);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigateToReviewAssetsScreen)) {
                return false;
            }
            NavigateToReviewAssetsScreen navigateToReviewAssetsScreen = (NavigateToReviewAssetsScreen) other;
            return Intrinsics.areEqual(this.source, navigateToReviewAssetsScreen.source) && Intrinsics.areEqual(this.assets, navigateToReviewAssetsScreen.assets);
        }

        public int hashCode() {
            return (this.source.hashCode() * 31) + this.assets.hashCode();
        }

        public String toString() {
            return "NavigateToReviewAssetsScreen(source=" + this.source + ", assets=" + this.assets + ")";
        }

        public NavigateToReviewAssetsScreen(String source, UiAssets assets) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(assets, "assets");
            this.source = source;
            this.assets = assets;
        }

        public final String getSource() {
            return this.source;
        }

        public final UiAssets getAssets() {
            return this.assets;
        }
    }

    /* compiled from: InternalAssetTransferEvent.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/InternalAssetTransferEvent$NavigateToPreSubmissionWarnsScreen;", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferEvent;", "source", "", "alerts", "", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/PresubmissionChecksAlertSheet;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getSource", "()Ljava/lang/String;", "getAlerts", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class NavigateToPreSubmissionWarnsScreen implements InternalAssetTransferEvent {
        public static final int $stable = 8;
        private final List<PresubmissionChecksAlertSheet> alerts;
        private final String source;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ NavigateToPreSubmissionWarnsScreen copy$default(NavigateToPreSubmissionWarnsScreen navigateToPreSubmissionWarnsScreen, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = navigateToPreSubmissionWarnsScreen.source;
            }
            if ((i & 2) != 0) {
                list = navigateToPreSubmissionWarnsScreen.alerts;
            }
            return navigateToPreSubmissionWarnsScreen.copy(str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final List<PresubmissionChecksAlertSheet> component2() {
            return this.alerts;
        }

        public final NavigateToPreSubmissionWarnsScreen copy(String source, List<PresubmissionChecksAlertSheet> alerts) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(alerts, "alerts");
            return new NavigateToPreSubmissionWarnsScreen(source, alerts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NavigateToPreSubmissionWarnsScreen)) {
                return false;
            }
            NavigateToPreSubmissionWarnsScreen navigateToPreSubmissionWarnsScreen = (NavigateToPreSubmissionWarnsScreen) other;
            return Intrinsics.areEqual(this.source, navigateToPreSubmissionWarnsScreen.source) && Intrinsics.areEqual(this.alerts, navigateToPreSubmissionWarnsScreen.alerts);
        }

        public int hashCode() {
            return (this.source.hashCode() * 31) + this.alerts.hashCode();
        }

        public String toString() {
            return "NavigateToPreSubmissionWarnsScreen(source=" + this.source + ", alerts=" + this.alerts + ")";
        }

        public NavigateToPreSubmissionWarnsScreen(String source, List<PresubmissionChecksAlertSheet> alerts) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(alerts, "alerts");
            this.source = source;
            this.alerts = alerts;
        }

        public final String getSource() {
            return this.source;
        }

        public final List<PresubmissionChecksAlertSheet> getAlerts() {
            return this.alerts;
        }
    }
}
