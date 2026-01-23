package com.robinhood.android.internalassettransfers.review;

import com.robinhood.android.internalassettransfers.accountselection.UiIatAccount;
import com.robinhood.android.internalassettransfers.review.models.UiAssets;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalAssetTransferReviewDataState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u0011\u0010\"\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000eHÆ\u0003JY\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewDataState;", "", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "assetsToTransfer", "Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "nonTransferableAssetsToDisplay", "submitLoading", "", "submitException", "Ljava/lang/Exception;", "Lkotlin/Exception;", "presubmitAlerts", "Lcom/robinhood/android/internalassettransfers/review/PresubmitAlertsWrapper;", "<init>", "(Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;ZLjava/lang/Exception;Lcom/robinhood/android/internalassettransfers/review/PresubmitAlertsWrapper;)V", "getSourceAccount", "()Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", "getSinkAccount", "getAssetsToTransfer", "()Lcom/robinhood/android/internalassettransfers/review/models/UiAssets;", "getNonTransferableAssetsToDisplay", "getSubmitLoading", "()Z", "getSubmitException", "()Ljava/lang/Exception;", "getPresubmitAlerts", "()Lcom/robinhood/android/internalassettransfers/review/PresubmitAlertsWrapper;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class InternalAssetTransferReviewDataState {
    public static final int $stable = 8;
    private final UiAssets assetsToTransfer;
    private final UiAssets nonTransferableAssetsToDisplay;
    private final PresubmitAlertsWrapper presubmitAlerts;
    private final UiIatAccount sinkAccount;
    private final UiIatAccount sourceAccount;
    private final Exception submitException;
    private final boolean submitLoading;

    public static /* synthetic */ InternalAssetTransferReviewDataState copy$default(InternalAssetTransferReviewDataState internalAssetTransferReviewDataState, UiIatAccount uiIatAccount, UiIatAccount uiIatAccount2, UiAssets uiAssets, UiAssets uiAssets2, boolean z, Exception exc, PresubmitAlertsWrapper presubmitAlertsWrapper, int i, Object obj) {
        if ((i & 1) != 0) {
            uiIatAccount = internalAssetTransferReviewDataState.sourceAccount;
        }
        if ((i & 2) != 0) {
            uiIatAccount2 = internalAssetTransferReviewDataState.sinkAccount;
        }
        if ((i & 4) != 0) {
            uiAssets = internalAssetTransferReviewDataState.assetsToTransfer;
        }
        if ((i & 8) != 0) {
            uiAssets2 = internalAssetTransferReviewDataState.nonTransferableAssetsToDisplay;
        }
        if ((i & 16) != 0) {
            z = internalAssetTransferReviewDataState.submitLoading;
        }
        if ((i & 32) != 0) {
            exc = internalAssetTransferReviewDataState.submitException;
        }
        if ((i & 64) != 0) {
            presubmitAlertsWrapper = internalAssetTransferReviewDataState.presubmitAlerts;
        }
        Exception exc2 = exc;
        PresubmitAlertsWrapper presubmitAlertsWrapper2 = presubmitAlertsWrapper;
        boolean z2 = z;
        UiAssets uiAssets3 = uiAssets;
        return internalAssetTransferReviewDataState.copy(uiIatAccount, uiIatAccount2, uiAssets3, uiAssets2, z2, exc2, presubmitAlertsWrapper2);
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

    public final InternalAssetTransferReviewDataState copy(UiIatAccount sourceAccount, UiIatAccount sinkAccount, UiAssets assetsToTransfer, UiAssets nonTransferableAssetsToDisplay, boolean submitLoading, Exception submitException, PresubmitAlertsWrapper presubmitAlerts) {
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        Intrinsics.checkNotNullParameter(assetsToTransfer, "assetsToTransfer");
        Intrinsics.checkNotNullParameter(nonTransferableAssetsToDisplay, "nonTransferableAssetsToDisplay");
        return new InternalAssetTransferReviewDataState(sourceAccount, sinkAccount, assetsToTransfer, nonTransferableAssetsToDisplay, submitLoading, submitException, presubmitAlerts);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalAssetTransferReviewDataState)) {
            return false;
        }
        InternalAssetTransferReviewDataState internalAssetTransferReviewDataState = (InternalAssetTransferReviewDataState) other;
        return Intrinsics.areEqual(this.sourceAccount, internalAssetTransferReviewDataState.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, internalAssetTransferReviewDataState.sinkAccount) && Intrinsics.areEqual(this.assetsToTransfer, internalAssetTransferReviewDataState.assetsToTransfer) && Intrinsics.areEqual(this.nonTransferableAssetsToDisplay, internalAssetTransferReviewDataState.nonTransferableAssetsToDisplay) && this.submitLoading == internalAssetTransferReviewDataState.submitLoading && Intrinsics.areEqual(this.submitException, internalAssetTransferReviewDataState.submitException) && Intrinsics.areEqual(this.presubmitAlerts, internalAssetTransferReviewDataState.presubmitAlerts);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.sourceAccount.hashCode() * 31) + this.sinkAccount.hashCode()) * 31) + this.assetsToTransfer.hashCode()) * 31) + this.nonTransferableAssetsToDisplay.hashCode()) * 31) + Boolean.hashCode(this.submitLoading)) * 31;
        Exception exc = this.submitException;
        int iHashCode2 = (iHashCode + (exc == null ? 0 : exc.hashCode())) * 31;
        PresubmitAlertsWrapper presubmitAlertsWrapper = this.presubmitAlerts;
        return iHashCode2 + (presubmitAlertsWrapper != null ? presubmitAlertsWrapper.hashCode() : 0);
    }

    public String toString() {
        return "InternalAssetTransferReviewDataState(sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ", assetsToTransfer=" + this.assetsToTransfer + ", nonTransferableAssetsToDisplay=" + this.nonTransferableAssetsToDisplay + ", submitLoading=" + this.submitLoading + ", submitException=" + this.submitException + ", presubmitAlerts=" + this.presubmitAlerts + ")";
    }

    public InternalAssetTransferReviewDataState(UiIatAccount sourceAccount, UiIatAccount sinkAccount, UiAssets assetsToTransfer, UiAssets nonTransferableAssetsToDisplay, boolean z, Exception exc, PresubmitAlertsWrapper presubmitAlertsWrapper) {
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        Intrinsics.checkNotNullParameter(assetsToTransfer, "assetsToTransfer");
        Intrinsics.checkNotNullParameter(nonTransferableAssetsToDisplay, "nonTransferableAssetsToDisplay");
        this.sourceAccount = sourceAccount;
        this.sinkAccount = sinkAccount;
        this.assetsToTransfer = assetsToTransfer;
        this.nonTransferableAssetsToDisplay = nonTransferableAssetsToDisplay;
        this.submitLoading = z;
        this.submitException = exc;
        this.presubmitAlerts = presubmitAlertsWrapper;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ InternalAssetTransferReviewDataState(com.robinhood.android.internalassettransfers.accountselection.UiIatAccount r9, com.robinhood.android.internalassettransfers.accountselection.UiIatAccount r10, com.robinhood.android.internalassettransfers.review.models.UiAssets r11, com.robinhood.android.internalassettransfers.review.models.UiAssets r12, boolean r13, java.lang.Exception r14, com.robinhood.android.internalassettransfers.review.PresubmitAlertsWrapper r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 16
            if (r0 == 0) goto L5
            r13 = 0
        L5:
            r5 = r13
            r13 = r16 & 32
            r0 = 0
            if (r13 == 0) goto Ld
            r6 = r0
            goto Le
        Ld:
            r6 = r14
        Le:
            r13 = r16 & 64
            if (r13 == 0) goto L19
            r7 = r0
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r0 = r8
            goto L1f
        L19:
            r7 = r15
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
        L1f:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewDataState.<init>(com.robinhood.android.internalassettransfers.accountselection.UiIatAccount, com.robinhood.android.internalassettransfers.accountselection.UiIatAccount, com.robinhood.android.internalassettransfers.review.models.UiAssets, com.robinhood.android.internalassettransfers.review.models.UiAssets, boolean, java.lang.Exception, com.robinhood.android.internalassettransfers.review.PresubmitAlertsWrapper, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final UiIatAccount getSourceAccount() {
        return this.sourceAccount;
    }

    public final UiIatAccount getSinkAccount() {
        return this.sinkAccount;
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
}
