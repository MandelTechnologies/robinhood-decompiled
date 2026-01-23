package com.robinhood.android.transfers.p271ui.max.i18n;

import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.p273ui.transfers.ekiben.p274uk.SwitchableTickerInputViewData;
import com.robinhood.android.transfers.p271ui.max.i18n.composable.TransferEditScreenData;
import com.robinhood.android.transfers.p271ui.max.i18n.composable.TransferReviewScreenData;
import com.robinhood.android.transfers.p271ui.p272v2.TransferSummaryState;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternationalTransferViewState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001fJ\\\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u000fHÖ\u0001J\t\u0010.\u001a\u00020/HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001f¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferViewState;", "", "userInteractionEventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "switcherDisplayData", "Lcom/robinhood/android/ui/transfers/ekiben/uk/SwitchableTickerInputViewData;", "transferEditScreenData", "Lcom/robinhood/android/transfers/ui/max/i18n/composable/TransferEditScreenData;", "transferReviewScreenData", "Lcom/robinhood/android/transfers/ui/max/i18n/composable/TransferReviewScreenData;", "transferSummaryRequest", "Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryRequest;", "transferSummaryState", "Lcom/robinhood/android/transfers/ui/v2/TransferSummaryState;", "toolbarTitleRes", "", "<init>", "(Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;Lcom/robinhood/android/ui/transfers/ekiben/uk/SwitchableTickerInputViewData;Lcom/robinhood/android/transfers/ui/max/i18n/composable/TransferEditScreenData;Lcom/robinhood/android/transfers/ui/max/i18n/composable/TransferReviewScreenData;Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryRequest;Lcom/robinhood/android/transfers/ui/v2/TransferSummaryState;Ljava/lang/Integer;)V", "getUserInteractionEventDescriptor", "()Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "getSwitcherDisplayData", "()Lcom/robinhood/android/ui/transfers/ekiben/uk/SwitchableTickerInputViewData;", "getTransferEditScreenData", "()Lcom/robinhood/android/transfers/ui/max/i18n/composable/TransferEditScreenData;", "getTransferReviewScreenData", "()Lcom/robinhood/android/transfers/ui/max/i18n/composable/TransferReviewScreenData;", "getTransferSummaryRequest", "()Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryRequest;", "getTransferSummaryState", "()Lcom/robinhood/android/transfers/ui/v2/TransferSummaryState;", "getToolbarTitleRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;Lcom/robinhood/android/ui/transfers/ekiben/uk/SwitchableTickerInputViewData;Lcom/robinhood/android/transfers/ui/max/i18n/composable/TransferEditScreenData;Lcom/robinhood/android/transfers/ui/max/i18n/composable/TransferReviewScreenData;Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryRequest;Lcom/robinhood/android/transfers/ui/v2/TransferSummaryState;Ljava/lang/Integer;)Lcom/robinhood/android/transfers/ui/max/i18n/InternationalTransferViewState;", "equals", "", "other", "hashCode", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InternationalTransferViewState {
    public static final int $stable = 8;
    private final SwitchableTickerInputViewData switcherDisplayData;
    private final Integer toolbarTitleRes;
    private final TransferEditScreenData transferEditScreenData;
    private final TransferReviewScreenData transferReviewScreenData;
    private final ApiTransferSummaryRequest transferSummaryRequest;
    private final TransferSummaryState transferSummaryState;
    private final UserInteractionEventDescriptor userInteractionEventDescriptor;

    public static /* synthetic */ InternationalTransferViewState copy$default(InternationalTransferViewState internationalTransferViewState, UserInteractionEventDescriptor userInteractionEventDescriptor, SwitchableTickerInputViewData switchableTickerInputViewData, TransferEditScreenData transferEditScreenData, TransferReviewScreenData transferReviewScreenData, ApiTransferSummaryRequest apiTransferSummaryRequest, TransferSummaryState transferSummaryState, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            userInteractionEventDescriptor = internationalTransferViewState.userInteractionEventDescriptor;
        }
        if ((i & 2) != 0) {
            switchableTickerInputViewData = internationalTransferViewState.switcherDisplayData;
        }
        if ((i & 4) != 0) {
            transferEditScreenData = internationalTransferViewState.transferEditScreenData;
        }
        if ((i & 8) != 0) {
            transferReviewScreenData = internationalTransferViewState.transferReviewScreenData;
        }
        if ((i & 16) != 0) {
            apiTransferSummaryRequest = internationalTransferViewState.transferSummaryRequest;
        }
        if ((i & 32) != 0) {
            transferSummaryState = internationalTransferViewState.transferSummaryState;
        }
        if ((i & 64) != 0) {
            num = internationalTransferViewState.toolbarTitleRes;
        }
        TransferSummaryState transferSummaryState2 = transferSummaryState;
        Integer num2 = num;
        ApiTransferSummaryRequest apiTransferSummaryRequest2 = apiTransferSummaryRequest;
        TransferEditScreenData transferEditScreenData2 = transferEditScreenData;
        return internationalTransferViewState.copy(userInteractionEventDescriptor, switchableTickerInputViewData, transferEditScreenData2, transferReviewScreenData, apiTransferSummaryRequest2, transferSummaryState2, num2);
    }

    /* renamed from: component1, reason: from getter */
    public final UserInteractionEventDescriptor getUserInteractionEventDescriptor() {
        return this.userInteractionEventDescriptor;
    }

    /* renamed from: component2, reason: from getter */
    public final SwitchableTickerInputViewData getSwitcherDisplayData() {
        return this.switcherDisplayData;
    }

    /* renamed from: component3, reason: from getter */
    public final TransferEditScreenData getTransferEditScreenData() {
        return this.transferEditScreenData;
    }

    /* renamed from: component4, reason: from getter */
    public final TransferReviewScreenData getTransferReviewScreenData() {
        return this.transferReviewScreenData;
    }

    /* renamed from: component5, reason: from getter */
    public final ApiTransferSummaryRequest getTransferSummaryRequest() {
        return this.transferSummaryRequest;
    }

    /* renamed from: component6, reason: from getter */
    public final TransferSummaryState getTransferSummaryState() {
        return this.transferSummaryState;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getToolbarTitleRes() {
        return this.toolbarTitleRes;
    }

    public final InternationalTransferViewState copy(UserInteractionEventDescriptor userInteractionEventDescriptor, SwitchableTickerInputViewData switcherDisplayData, TransferEditScreenData transferEditScreenData, TransferReviewScreenData transferReviewScreenData, ApiTransferSummaryRequest transferSummaryRequest, TransferSummaryState transferSummaryState, Integer toolbarTitleRes) {
        Intrinsics.checkNotNullParameter(userInteractionEventDescriptor, "userInteractionEventDescriptor");
        Intrinsics.checkNotNullParameter(switcherDisplayData, "switcherDisplayData");
        Intrinsics.checkNotNullParameter(transferSummaryState, "transferSummaryState");
        return new InternationalTransferViewState(userInteractionEventDescriptor, switcherDisplayData, transferEditScreenData, transferReviewScreenData, transferSummaryRequest, transferSummaryState, toolbarTitleRes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternationalTransferViewState)) {
            return false;
        }
        InternationalTransferViewState internationalTransferViewState = (InternationalTransferViewState) other;
        return Intrinsics.areEqual(this.userInteractionEventDescriptor, internationalTransferViewState.userInteractionEventDescriptor) && Intrinsics.areEqual(this.switcherDisplayData, internationalTransferViewState.switcherDisplayData) && Intrinsics.areEqual(this.transferEditScreenData, internationalTransferViewState.transferEditScreenData) && Intrinsics.areEqual(this.transferReviewScreenData, internationalTransferViewState.transferReviewScreenData) && Intrinsics.areEqual(this.transferSummaryRequest, internationalTransferViewState.transferSummaryRequest) && Intrinsics.areEqual(this.transferSummaryState, internationalTransferViewState.transferSummaryState) && Intrinsics.areEqual(this.toolbarTitleRes, internationalTransferViewState.toolbarTitleRes);
    }

    public int hashCode() {
        int iHashCode = ((this.userInteractionEventDescriptor.hashCode() * 31) + this.switcherDisplayData.hashCode()) * 31;
        TransferEditScreenData transferEditScreenData = this.transferEditScreenData;
        int iHashCode2 = (iHashCode + (transferEditScreenData == null ? 0 : transferEditScreenData.hashCode())) * 31;
        TransferReviewScreenData transferReviewScreenData = this.transferReviewScreenData;
        int iHashCode3 = (iHashCode2 + (transferReviewScreenData == null ? 0 : transferReviewScreenData.hashCode())) * 31;
        ApiTransferSummaryRequest apiTransferSummaryRequest = this.transferSummaryRequest;
        int iHashCode4 = (((iHashCode3 + (apiTransferSummaryRequest == null ? 0 : apiTransferSummaryRequest.hashCode())) * 31) + this.transferSummaryState.hashCode()) * 31;
        Integer num = this.toolbarTitleRes;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "InternationalTransferViewState(userInteractionEventDescriptor=" + this.userInteractionEventDescriptor + ", switcherDisplayData=" + this.switcherDisplayData + ", transferEditScreenData=" + this.transferEditScreenData + ", transferReviewScreenData=" + this.transferReviewScreenData + ", transferSummaryRequest=" + this.transferSummaryRequest + ", transferSummaryState=" + this.transferSummaryState + ", toolbarTitleRes=" + this.toolbarTitleRes + ")";
    }

    public InternationalTransferViewState(UserInteractionEventDescriptor userInteractionEventDescriptor, SwitchableTickerInputViewData switcherDisplayData, TransferEditScreenData transferEditScreenData, TransferReviewScreenData transferReviewScreenData, ApiTransferSummaryRequest apiTransferSummaryRequest, TransferSummaryState transferSummaryState, Integer num) {
        Intrinsics.checkNotNullParameter(userInteractionEventDescriptor, "userInteractionEventDescriptor");
        Intrinsics.checkNotNullParameter(switcherDisplayData, "switcherDisplayData");
        Intrinsics.checkNotNullParameter(transferSummaryState, "transferSummaryState");
        this.userInteractionEventDescriptor = userInteractionEventDescriptor;
        this.switcherDisplayData = switcherDisplayData;
        this.transferEditScreenData = transferEditScreenData;
        this.transferReviewScreenData = transferReviewScreenData;
        this.transferSummaryRequest = apiTransferSummaryRequest;
        this.transferSummaryState = transferSummaryState;
        this.toolbarTitleRes = num;
    }

    public /* synthetic */ InternationalTransferViewState(UserInteractionEventDescriptor userInteractionEventDescriptor, SwitchableTickerInputViewData switchableTickerInputViewData, TransferEditScreenData transferEditScreenData, TransferReviewScreenData transferReviewScreenData, ApiTransferSummaryRequest apiTransferSummaryRequest, TransferSummaryState transferSummaryState, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userInteractionEventDescriptor, switchableTickerInputViewData, (i & 4) != 0 ? null : transferEditScreenData, (i & 8) != 0 ? null : transferReviewScreenData, apiTransferSummaryRequest, transferSummaryState, (i & 64) != 0 ? null : num);
    }

    public final UserInteractionEventDescriptor getUserInteractionEventDescriptor() {
        return this.userInteractionEventDescriptor;
    }

    public final SwitchableTickerInputViewData getSwitcherDisplayData() {
        return this.switcherDisplayData;
    }

    public final TransferEditScreenData getTransferEditScreenData() {
        return this.transferEditScreenData;
    }

    public final TransferReviewScreenData getTransferReviewScreenData() {
        return this.transferReviewScreenData;
    }

    public final ApiTransferSummaryRequest getTransferSummaryRequest() {
        return this.transferSummaryRequest;
    }

    public final TransferSummaryState getTransferSummaryState() {
        return this.transferSummaryState;
    }

    public final Integer getToolbarTitleRes() {
        return this.toolbarTitleRes;
    }
}
