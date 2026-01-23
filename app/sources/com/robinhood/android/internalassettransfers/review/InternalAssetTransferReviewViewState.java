package com.robinhood.android.internalassettransfers.review;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.internalassettransfers.C18977R;
import com.robinhood.android.internalassettransfers.accountselection.UiIatAccount;
import com.robinhood.android.internalassettransfers.review.models.UiAssets;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.models.api.ManagementType;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: InternalAssetTransferReviewViewState.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u00018BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\u0006HÆ\u0003J\t\u0010.\u001a\u00020\u0006HÆ\u0003J\t\u0010/\u001a\u00020\tHÆ\u0003J\u0011\u00100\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u000eHÆ\u0003JY\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u00103\u001a\u00020\t2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020(HÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\"8F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0011\u0010'\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u00069"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewViewState;", "", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "assetsToTransfer", "Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "nonTransferableAssetsToDisplay", "submitLoading", "", "submitException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "presubmitAlerts", "Lcom/robinhood/android/internalassettransfers/review/PresubmitAlertsWrapper;", "<init>", "(Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;ZLjava/lang/Exception;Lcom/robinhood/android/internalassettransfers/review/PresubmitAlertsWrapper;)V", "getSinkAccount", "()Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "getSourceAccount", "getAssetsToTransfer", "()Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "getNonTransferableAssetsToDisplay", "getSubmitLoading", "()Z", "getSubmitException", "()Ljava/lang/Exception;", "getPresubmitAlerts", "()Lcom/robinhood/android/internalassettransfers/review/PresubmitAlertsWrapper;", "infoBannerState", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewViewState$InfoBannerState;", "getInfoBannerState", "()Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewViewState$InfoBannerState;", "sourceDisplayNameShort", "Lcom/robinhood/utils/resource/StringResource;", "getSourceDisplayNameShort", "()Lcom/robinhood/utils/resource/StringResource;", "sinkDisplayNameShort", "getSinkDisplayNameShort", "reviewAlertTextRes", "", "getReviewAlertTextRes", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "InfoBannerState", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class InternalAssetTransferReviewViewState {
    public static final int $stable = 8;
    private final UiAssets assetsToTransfer;
    private final UiAssets nonTransferableAssetsToDisplay;
    private final PresubmitAlertsWrapper presubmitAlerts;
    private final UiIatAccount sinkAccount;
    private final UiIatAccount sourceAccount;
    private final Exception submitException;
    private final boolean submitLoading;

    public static /* synthetic */ InternalAssetTransferReviewViewState copy$default(InternalAssetTransferReviewViewState internalAssetTransferReviewViewState, UiIatAccount uiIatAccount, UiIatAccount uiIatAccount2, UiAssets uiAssets, UiAssets uiAssets2, boolean z, Exception exc, PresubmitAlertsWrapper presubmitAlertsWrapper, int i, Object obj) {
        if ((i & 1) != 0) {
            uiIatAccount = internalAssetTransferReviewViewState.sinkAccount;
        }
        if ((i & 2) != 0) {
            uiIatAccount2 = internalAssetTransferReviewViewState.sourceAccount;
        }
        if ((i & 4) != 0) {
            uiAssets = internalAssetTransferReviewViewState.assetsToTransfer;
        }
        if ((i & 8) != 0) {
            uiAssets2 = internalAssetTransferReviewViewState.nonTransferableAssetsToDisplay;
        }
        if ((i & 16) != 0) {
            z = internalAssetTransferReviewViewState.submitLoading;
        }
        if ((i & 32) != 0) {
            exc = internalAssetTransferReviewViewState.submitException;
        }
        if ((i & 64) != 0) {
            presubmitAlertsWrapper = internalAssetTransferReviewViewState.presubmitAlerts;
        }
        Exception exc2 = exc;
        PresubmitAlertsWrapper presubmitAlertsWrapper2 = presubmitAlertsWrapper;
        boolean z2 = z;
        UiAssets uiAssets3 = uiAssets;
        return internalAssetTransferReviewViewState.copy(uiIatAccount, uiIatAccount2, uiAssets3, uiAssets2, z2, exc2, presubmitAlertsWrapper2);
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
    public final UiAssets getAssetsToTransfer() {
        return this.assetsToTransfer;
    }

    /* renamed from: component4, reason: from getter */
    public final UiAssets getNonTransferableAssetsToDisplay() {
        return this.nonTransferableAssetsToDisplay;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getSubmitLoading() {
        return this.submitLoading;
    }

    /* renamed from: component6, reason: from getter */
    public final Exception getSubmitException() {
        return this.submitException;
    }

    /* renamed from: component7, reason: from getter */
    public final PresubmitAlertsWrapper getPresubmitAlerts() {
        return this.presubmitAlerts;
    }

    public final InternalAssetTransferReviewViewState copy(UiIatAccount sinkAccount, UiIatAccount sourceAccount, UiAssets assetsToTransfer, UiAssets nonTransferableAssetsToDisplay, boolean submitLoading, Exception submitException, PresubmitAlertsWrapper presubmitAlerts) {
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(assetsToTransfer, "assetsToTransfer");
        Intrinsics.checkNotNullParameter(nonTransferableAssetsToDisplay, "nonTransferableAssetsToDisplay");
        return new InternalAssetTransferReviewViewState(sinkAccount, sourceAccount, assetsToTransfer, nonTransferableAssetsToDisplay, submitLoading, submitException, presubmitAlerts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalAssetTransferReviewViewState)) {
            return false;
        }
        InternalAssetTransferReviewViewState internalAssetTransferReviewViewState = (InternalAssetTransferReviewViewState) other;
        return Intrinsics.areEqual(this.sinkAccount, internalAssetTransferReviewViewState.sinkAccount) && Intrinsics.areEqual(this.sourceAccount, internalAssetTransferReviewViewState.sourceAccount) && Intrinsics.areEqual(this.assetsToTransfer, internalAssetTransferReviewViewState.assetsToTransfer) && Intrinsics.areEqual(this.nonTransferableAssetsToDisplay, internalAssetTransferReviewViewState.nonTransferableAssetsToDisplay) && this.submitLoading == internalAssetTransferReviewViewState.submitLoading && Intrinsics.areEqual(this.submitException, internalAssetTransferReviewViewState.submitException) && Intrinsics.areEqual(this.presubmitAlerts, internalAssetTransferReviewViewState.presubmitAlerts);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.sinkAccount.hashCode() * 31) + this.sourceAccount.hashCode()) * 31) + this.assetsToTransfer.hashCode()) * 31) + this.nonTransferableAssetsToDisplay.hashCode()) * 31) + Boolean.hashCode(this.submitLoading)) * 31;
        Exception exc = this.submitException;
        int iHashCode2 = (iHashCode + (exc == null ? 0 : exc.hashCode())) * 31;
        PresubmitAlertsWrapper presubmitAlertsWrapper = this.presubmitAlerts;
        return iHashCode2 + (presubmitAlertsWrapper != null ? presubmitAlertsWrapper.hashCode() : 0);
    }

    public String toString() {
        return "InternalAssetTransferReviewViewState(sinkAccount=" + this.sinkAccount + ", sourceAccount=" + this.sourceAccount + ", assetsToTransfer=" + this.assetsToTransfer + ", nonTransferableAssetsToDisplay=" + this.nonTransferableAssetsToDisplay + ", submitLoading=" + this.submitLoading + ", submitException=" + this.submitException + ", presubmitAlerts=" + this.presubmitAlerts + ")";
    }

    public InternalAssetTransferReviewViewState(UiIatAccount sinkAccount, UiIatAccount sourceAccount, UiAssets assetsToTransfer, UiAssets nonTransferableAssetsToDisplay, boolean z, Exception exc, PresubmitAlertsWrapper presubmitAlertsWrapper) {
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(assetsToTransfer, "assetsToTransfer");
        Intrinsics.checkNotNullParameter(nonTransferableAssetsToDisplay, "nonTransferableAssetsToDisplay");
        this.sinkAccount = sinkAccount;
        this.sourceAccount = sourceAccount;
        this.assetsToTransfer = assetsToTransfer;
        this.nonTransferableAssetsToDisplay = nonTransferableAssetsToDisplay;
        this.submitLoading = z;
        this.submitException = exc;
        this.presubmitAlerts = presubmitAlertsWrapper;
    }

    public final UiIatAccount getSinkAccount() {
        return this.sinkAccount;
    }

    public final UiIatAccount getSourceAccount() {
        return this.sourceAccount;
    }

    public final UiAssets getAssetsToTransfer() {
        return this.assetsToTransfer;
    }

    public final UiAssets getNonTransferableAssetsToDisplay() {
        return this.nonTransferableAssetsToDisplay;
    }

    public final boolean getSubmitLoading() {
        return this.submitLoading;
    }

    public final Exception getSubmitException() {
        return this.submitException;
    }

    public final PresubmitAlertsWrapper getPresubmitAlerts() {
        return this.presubmitAlerts;
    }

    /* compiled from: InternalAssetTransferReviewViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewViewState$InfoBannerState;", "", "NoAvailableAssets", "HasIneligibleAssets", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewViewState$InfoBannerState$HasIneligibleAssets;", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewViewState$InfoBannerState$NoAvailableAssets;", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface InfoBannerState {

        /* compiled from: InternalAssetTransferReviewViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewViewState$InfoBannerState$NoAvailableAssets;", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewViewState$InfoBannerState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NoAvailableAssets implements InfoBannerState {
            public static final int $stable = 0;
            public static final NoAvailableAssets INSTANCE = new NoAvailableAssets();

            public boolean equals(Object other) {
                return this == other || (other instanceof NoAvailableAssets);
            }

            public int hashCode() {
                return 2015278701;
            }

            public String toString() {
                return "NoAvailableAssets";
            }

            private NoAvailableAssets() {
            }
        }

        /* compiled from: InternalAssetTransferReviewViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewViewState$InfoBannerState$HasIneligibleAssets;", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewViewState$InfoBannerState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class HasIneligibleAssets implements InfoBannerState {
            public static final int $stable = 0;
            public static final HasIneligibleAssets INSTANCE = new HasIneligibleAssets();

            public boolean equals(Object other) {
                return this == other || (other instanceof HasIneligibleAssets);
            }

            public int hashCode() {
                return 1116829083;
            }

            public String toString() {
                return "HasIneligibleAssets";
            }

            private HasIneligibleAssets() {
            }
        }
    }

    public final InfoBannerState getInfoBannerState() {
        if (this.assetsToTransfer.getAssetsCount() == 0 && Intrinsics.areEqual(this.assetsToTransfer.getCash(), BigDecimal.ZERO)) {
            return InfoBannerState.NoAvailableAssets.INSTANCE;
        }
        if (this.nonTransferableAssetsToDisplay.getAssetsCount() != 0) {
            return InfoBannerState.HasIneligibleAssets.INSTANCE;
        }
        return null;
    }

    public final StringResource getSourceDisplayNameShort() {
        StringResource nicknameDotFormat;
        String nickname = this.sourceAccount.getNickname();
        if (nickname != null) {
            if (StringsKt.isBlank(nickname)) {
                nickname = null;
            }
            if (nickname != null && (nicknameDotFormat = AccountDisplayNames.getNicknameDotFormat(nickname, this.sourceAccount.getBrokerageAccountType(), this.sourceAccount.getManagementType())) != null) {
                return nicknameDotFormat;
            }
        }
        return AccountDisplayNames.getDisplayName$default(this.sourceAccount.getBrokerageAccountType(), this.sourceAccount.getManagementType(), null, 4, null).getShort().getTitle();
    }

    public final StringResource getSinkDisplayNameShort() {
        StringResource nicknameDotFormat;
        String nickname = this.sinkAccount.getNickname();
        if (nickname != null) {
            if (StringsKt.isBlank(nickname)) {
                nickname = null;
            }
            if (nickname != null && (nicknameDotFormat = AccountDisplayNames.getNicknameDotFormat(nickname, this.sinkAccount.getBrokerageAccountType(), this.sinkAccount.getManagementType())) != null) {
                return nicknameDotFormat;
            }
        }
        return AccountDisplayNames.getDisplayName$default(this.sinkAccount.getBrokerageAccountType(), this.sinkAccount.getManagementType(), null, 4, null).getShort().getTitle();
    }

    public final int getReviewAlertTextRes() {
        if (this.sinkAccount.getBrokerageAccountType().isRetirement() && this.sinkAccount.getManagementType() == ManagementType.MANAGED) {
            return C18977R.string.f4222x996dbb08;
        }
        if (this.sinkAccount.getManagementType() == ManagementType.MANAGED) {
            return C18977R.string.f4223x430d4fc;
        }
        return C18977R.string.f4224x2e1c9246;
    }
}
