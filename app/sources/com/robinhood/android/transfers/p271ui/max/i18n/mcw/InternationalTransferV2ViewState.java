package com.robinhood.android.transfers.p271ui.max.i18n.mcw;

import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.p271ui.common.TransferAmountEntryLayout;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2Composable3;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryRequest;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.util.Money;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: InternationalTransferV2ViewState.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002ABB\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0014\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\u0007HÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\t\u00102\u001a\u00020\tHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\rHÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0010HÆ\u0003J\t\u00107\u001a\u00020\u0010HÆ\u0003J\t\u00108\u001a\u00020\u0013HÆ\u0003J\u0017\u00109\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u0015HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u009d\u0001\u0010;\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010<\u001a\u00020\u00102\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020?HÖ\u0001J\t\u0010@\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010(R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010(R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001f\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001c¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState;", "", "toolbarTitle", "Lcom/robinhood/utils/resource/StringResource;", "amountInput", "", "amountEntryState", "Lcom/robinhood/android/transfers/ui/common/AmountEntryState;", "sourceAccountRowState", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState$AccountRowState;", "sinkAccountRowState", "sourceDropdownChipText", "amountInputPrimaryAction", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState$AmountInputPrimaryAction;", "primaryButtonText", "isPrimaryButtonEnabled", "", "isPrimaryButtonLoading", "transferSummaryRequest", "Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryRequest;", "transferSummaryContent", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "promotionInfoTagText", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;Lcom/robinhood/android/transfers/ui/common/AmountEntryState;Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState$AccountRowState;Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState$AccountRowState;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState$AmountInputPrimaryAction;Lcom/robinhood/utils/resource/StringResource;ZZLcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryRequest;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/utils/resource/StringResource;)V", "getToolbarTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getAmountInput", "()Ljava/lang/String;", "getAmountEntryState", "()Lcom/robinhood/android/transfers/ui/common/AmountEntryState;", "getSourceAccountRowState", "()Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState$AccountRowState;", "getSinkAccountRowState", "getSourceDropdownChipText", "getAmountInputPrimaryAction", "()Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState$AmountInputPrimaryAction;", "getPrimaryButtonText", "()Z", "getTransferSummaryRequest", "()Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryRequest;", "getTransferSummaryContent", "()Lkotlinx/collections/immutable/ImmutableList;", "getPromotionInfoTagText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", "toString", "AmountInputPrimaryAction", "AccountRowState", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class InternationalTransferV2ViewState {
    public static final int $stable = 8;
    private final TransferAmountEntryLayout amountEntryState;
    private final String amountInput;
    private final AmountInputPrimaryAction amountInputPrimaryAction;
    private final boolean isPrimaryButtonEnabled;
    private final boolean isPrimaryButtonLoading;
    private final StringResource primaryButtonText;
    private final StringResource promotionInfoTagText;
    private final AccountRowState sinkAccountRowState;
    private final AccountRowState sourceAccountRowState;
    private final StringResource sourceDropdownChipText;
    private final StringResource toolbarTitle;
    private final ImmutableList<UIComponent<GenericAction>> transferSummaryContent;
    private final ApiTransferSummaryRequest transferSummaryRequest;

    public static /* synthetic */ InternationalTransferV2ViewState copy$default(InternationalTransferV2ViewState internationalTransferV2ViewState, StringResource stringResource, String str, TransferAmountEntryLayout transferAmountEntryLayout, AccountRowState accountRowState, AccountRowState accountRowState2, StringResource stringResource2, AmountInputPrimaryAction amountInputPrimaryAction, StringResource stringResource3, boolean z, boolean z2, ApiTransferSummaryRequest apiTransferSummaryRequest, ImmutableList immutableList, StringResource stringResource4, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = internationalTransferV2ViewState.toolbarTitle;
        }
        return internationalTransferV2ViewState.copy(stringResource, (i & 2) != 0 ? internationalTransferV2ViewState.amountInput : str, (i & 4) != 0 ? internationalTransferV2ViewState.amountEntryState : transferAmountEntryLayout, (i & 8) != 0 ? internationalTransferV2ViewState.sourceAccountRowState : accountRowState, (i & 16) != 0 ? internationalTransferV2ViewState.sinkAccountRowState : accountRowState2, (i & 32) != 0 ? internationalTransferV2ViewState.sourceDropdownChipText : stringResource2, (i & 64) != 0 ? internationalTransferV2ViewState.amountInputPrimaryAction : amountInputPrimaryAction, (i & 128) != 0 ? internationalTransferV2ViewState.primaryButtonText : stringResource3, (i & 256) != 0 ? internationalTransferV2ViewState.isPrimaryButtonEnabled : z, (i & 512) != 0 ? internationalTransferV2ViewState.isPrimaryButtonLoading : z2, (i & 1024) != 0 ? internationalTransferV2ViewState.transferSummaryRequest : apiTransferSummaryRequest, (i & 2048) != 0 ? internationalTransferV2ViewState.transferSummaryContent : immutableList, (i & 4096) != 0 ? internationalTransferV2ViewState.promotionInfoTagText : stringResource4);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getToolbarTitle() {
        return this.toolbarTitle;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsPrimaryButtonLoading() {
        return this.isPrimaryButtonLoading;
    }

    /* renamed from: component11, reason: from getter */
    public final ApiTransferSummaryRequest getTransferSummaryRequest() {
        return this.transferSummaryRequest;
    }

    public final ImmutableList<UIComponent<GenericAction>> component12() {
        return this.transferSummaryContent;
    }

    /* renamed from: component13, reason: from getter */
    public final StringResource getPromotionInfoTagText() {
        return this.promotionInfoTagText;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAmountInput() {
        return this.amountInput;
    }

    /* renamed from: component3, reason: from getter */
    public final TransferAmountEntryLayout getAmountEntryState() {
        return this.amountEntryState;
    }

    /* renamed from: component4, reason: from getter */
    public final AccountRowState getSourceAccountRowState() {
        return this.sourceAccountRowState;
    }

    /* renamed from: component5, reason: from getter */
    public final AccountRowState getSinkAccountRowState() {
        return this.sinkAccountRowState;
    }

    /* renamed from: component6, reason: from getter */
    public final StringResource getSourceDropdownChipText() {
        return this.sourceDropdownChipText;
    }

    /* renamed from: component7, reason: from getter */
    public final AmountInputPrimaryAction getAmountInputPrimaryAction() {
        return this.amountInputPrimaryAction;
    }

    /* renamed from: component8, reason: from getter */
    public final StringResource getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsPrimaryButtonEnabled() {
        return this.isPrimaryButtonEnabled;
    }

    public final InternationalTransferV2ViewState copy(StringResource toolbarTitle, String amountInput, TransferAmountEntryLayout amountEntryState, AccountRowState sourceAccountRowState, AccountRowState sinkAccountRowState, StringResource sourceDropdownChipText, AmountInputPrimaryAction amountInputPrimaryAction, StringResource primaryButtonText, boolean isPrimaryButtonEnabled, boolean isPrimaryButtonLoading, ApiTransferSummaryRequest transferSummaryRequest, ImmutableList<? extends UIComponent<? extends GenericAction>> transferSummaryContent, StringResource promotionInfoTagText) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(amountInput, "amountInput");
        Intrinsics.checkNotNullParameter(amountEntryState, "amountEntryState");
        Intrinsics.checkNotNullParameter(sourceAccountRowState, "sourceAccountRowState");
        Intrinsics.checkNotNullParameter(sinkAccountRowState, "sinkAccountRowState");
        Intrinsics.checkNotNullParameter(amountInputPrimaryAction, "amountInputPrimaryAction");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(transferSummaryRequest, "transferSummaryRequest");
        return new InternationalTransferV2ViewState(toolbarTitle, amountInput, amountEntryState, sourceAccountRowState, sinkAccountRowState, sourceDropdownChipText, amountInputPrimaryAction, primaryButtonText, isPrimaryButtonEnabled, isPrimaryButtonLoading, transferSummaryRequest, transferSummaryContent, promotionInfoTagText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternationalTransferV2ViewState)) {
            return false;
        }
        InternationalTransferV2ViewState internationalTransferV2ViewState = (InternationalTransferV2ViewState) other;
        return Intrinsics.areEqual(this.toolbarTitle, internationalTransferV2ViewState.toolbarTitle) && Intrinsics.areEqual(this.amountInput, internationalTransferV2ViewState.amountInput) && this.amountEntryState == internationalTransferV2ViewState.amountEntryState && Intrinsics.areEqual(this.sourceAccountRowState, internationalTransferV2ViewState.sourceAccountRowState) && Intrinsics.areEqual(this.sinkAccountRowState, internationalTransferV2ViewState.sinkAccountRowState) && Intrinsics.areEqual(this.sourceDropdownChipText, internationalTransferV2ViewState.sourceDropdownChipText) && Intrinsics.areEqual(this.amountInputPrimaryAction, internationalTransferV2ViewState.amountInputPrimaryAction) && Intrinsics.areEqual(this.primaryButtonText, internationalTransferV2ViewState.primaryButtonText) && this.isPrimaryButtonEnabled == internationalTransferV2ViewState.isPrimaryButtonEnabled && this.isPrimaryButtonLoading == internationalTransferV2ViewState.isPrimaryButtonLoading && Intrinsics.areEqual(this.transferSummaryRequest, internationalTransferV2ViewState.transferSummaryRequest) && Intrinsics.areEqual(this.transferSummaryContent, internationalTransferV2ViewState.transferSummaryContent) && Intrinsics.areEqual(this.promotionInfoTagText, internationalTransferV2ViewState.promotionInfoTagText);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.toolbarTitle.hashCode() * 31) + this.amountInput.hashCode()) * 31) + this.amountEntryState.hashCode()) * 31) + this.sourceAccountRowState.hashCode()) * 31) + this.sinkAccountRowState.hashCode()) * 31;
        StringResource stringResource = this.sourceDropdownChipText;
        int iHashCode2 = (((((((((((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + this.amountInputPrimaryAction.hashCode()) * 31) + this.primaryButtonText.hashCode()) * 31) + Boolean.hashCode(this.isPrimaryButtonEnabled)) * 31) + Boolean.hashCode(this.isPrimaryButtonLoading)) * 31) + this.transferSummaryRequest.hashCode()) * 31;
        ImmutableList<UIComponent<GenericAction>> immutableList = this.transferSummaryContent;
        int iHashCode3 = (iHashCode2 + (immutableList == null ? 0 : immutableList.hashCode())) * 31;
        StringResource stringResource2 = this.promotionInfoTagText;
        return iHashCode3 + (stringResource2 != null ? stringResource2.hashCode() : 0);
    }

    public String toString() {
        return "InternationalTransferV2ViewState(toolbarTitle=" + this.toolbarTitle + ", amountInput=" + this.amountInput + ", amountEntryState=" + this.amountEntryState + ", sourceAccountRowState=" + this.sourceAccountRowState + ", sinkAccountRowState=" + this.sinkAccountRowState + ", sourceDropdownChipText=" + this.sourceDropdownChipText + ", amountInputPrimaryAction=" + this.amountInputPrimaryAction + ", primaryButtonText=" + this.primaryButtonText + ", isPrimaryButtonEnabled=" + this.isPrimaryButtonEnabled + ", isPrimaryButtonLoading=" + this.isPrimaryButtonLoading + ", transferSummaryRequest=" + this.transferSummaryRequest + ", transferSummaryContent=" + this.transferSummaryContent + ", promotionInfoTagText=" + this.promotionInfoTagText + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InternationalTransferV2ViewState(StringResource toolbarTitle, String amountInput, TransferAmountEntryLayout amountEntryState, AccountRowState sourceAccountRowState, AccountRowState sinkAccountRowState, StringResource stringResource, AmountInputPrimaryAction amountInputPrimaryAction, StringResource primaryButtonText, boolean z, boolean z2, ApiTransferSummaryRequest transferSummaryRequest, ImmutableList<? extends UIComponent<? extends GenericAction>> immutableList, StringResource stringResource2) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(amountInput, "amountInput");
        Intrinsics.checkNotNullParameter(amountEntryState, "amountEntryState");
        Intrinsics.checkNotNullParameter(sourceAccountRowState, "sourceAccountRowState");
        Intrinsics.checkNotNullParameter(sinkAccountRowState, "sinkAccountRowState");
        Intrinsics.checkNotNullParameter(amountInputPrimaryAction, "amountInputPrimaryAction");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(transferSummaryRequest, "transferSummaryRequest");
        this.toolbarTitle = toolbarTitle;
        this.amountInput = amountInput;
        this.amountEntryState = amountEntryState;
        this.sourceAccountRowState = sourceAccountRowState;
        this.sinkAccountRowState = sinkAccountRowState;
        this.sourceDropdownChipText = stringResource;
        this.amountInputPrimaryAction = amountInputPrimaryAction;
        this.primaryButtonText = primaryButtonText;
        this.isPrimaryButtonEnabled = z;
        this.isPrimaryButtonLoading = z2;
        this.transferSummaryRequest = transferSummaryRequest;
        this.transferSummaryContent = immutableList;
        this.promotionInfoTagText = stringResource2;
    }

    public /* synthetic */ InternationalTransferV2ViewState(StringResource stringResource, String str, TransferAmountEntryLayout transferAmountEntryLayout, AccountRowState accountRowState, AccountRowState accountRowState2, StringResource stringResource2, AmountInputPrimaryAction amountInputPrimaryAction, StringResource stringResource3, boolean z, boolean z2, ApiTransferSummaryRequest apiTransferSummaryRequest, ImmutableList immutableList, StringResource stringResource4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(stringResource, str, transferAmountEntryLayout, accountRowState, accountRowState2, stringResource2, amountInputPrimaryAction, stringResource3, z, z2, apiTransferSummaryRequest, immutableList, (i & 4096) != 0 ? null : stringResource4);
    }

    public final StringResource getToolbarTitle() {
        return this.toolbarTitle;
    }

    public final String getAmountInput() {
        return this.amountInput;
    }

    public final TransferAmountEntryLayout getAmountEntryState() {
        return this.amountEntryState;
    }

    public final AccountRowState getSourceAccountRowState() {
        return this.sourceAccountRowState;
    }

    public final AccountRowState getSinkAccountRowState() {
        return this.sinkAccountRowState;
    }

    public final StringResource getSourceDropdownChipText() {
        return this.sourceDropdownChipText;
    }

    public final AmountInputPrimaryAction getAmountInputPrimaryAction() {
        return this.amountInputPrimaryAction;
    }

    public final StringResource getPrimaryButtonText() {
        return this.primaryButtonText;
    }

    public final boolean isPrimaryButtonEnabled() {
        return this.isPrimaryButtonEnabled;
    }

    public final boolean isPrimaryButtonLoading() {
        return this.isPrimaryButtonLoading;
    }

    public final ApiTransferSummaryRequest getTransferSummaryRequest() {
        return this.transferSummaryRequest;
    }

    public final ImmutableList<UIComponent<GenericAction>> getTransferSummaryContent() {
        return this.transferSummaryContent;
    }

    public final StringResource getPromotionInfoTagText() {
        return this.promotionInfoTagText;
    }

    /* compiled from: InternationalTransferV2ViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState$AmountInputPrimaryAction;", "", CreateTransferV2Composable3.ContinueButtonTag, "SuggestedAmounts", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState$AmountInputPrimaryAction$ContinueButton;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState$AmountInputPrimaryAction$SuggestedAmounts;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface AmountInputPrimaryAction {

        /* compiled from: InternationalTransferV2ViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState$AmountInputPrimaryAction$ContinueButton;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState$AmountInputPrimaryAction;", "enabled", "", "<init>", "(Z)V", "getEnabled", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ContinueButton implements AmountInputPrimaryAction {
            public static final int $stable = 0;
            private final boolean enabled;

            public static /* synthetic */ ContinueButton copy$default(ContinueButton continueButton, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = continueButton.enabled;
                }
                return continueButton.copy(z);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getEnabled() {
                return this.enabled;
            }

            public final ContinueButton copy(boolean enabled) {
                return new ContinueButton(enabled);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ContinueButton) && this.enabled == ((ContinueButton) other).enabled;
            }

            public int hashCode() {
                return Boolean.hashCode(this.enabled);
            }

            public String toString() {
                return "ContinueButton(enabled=" + this.enabled + ")";
            }

            public ContinueButton(boolean z) {
                this.enabled = z;
            }

            public final boolean getEnabled() {
                return this.enabled;
            }
        }

        /* compiled from: InternationalTransferV2ViewState.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState$AmountInputPrimaryAction$SuggestedAmounts;", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState$AmountInputPrimaryAction;", "amounts", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/util/Money;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;)V", "getAmounts", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SuggestedAmounts implements AmountInputPrimaryAction {
            public static final int $stable = 8;
            private final ImmutableList<Money> amounts;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SuggestedAmounts copy$default(SuggestedAmounts suggestedAmounts, ImmutableList immutableList, int i, Object obj) {
                if ((i & 1) != 0) {
                    immutableList = suggestedAmounts.amounts;
                }
                return suggestedAmounts.copy(immutableList);
            }

            public final ImmutableList<Money> component1() {
                return this.amounts;
            }

            public final SuggestedAmounts copy(ImmutableList<Money> amounts) {
                Intrinsics.checkNotNullParameter(amounts, "amounts");
                return new SuggestedAmounts(amounts);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SuggestedAmounts) && Intrinsics.areEqual(this.amounts, ((SuggestedAmounts) other).amounts);
            }

            public int hashCode() {
                return this.amounts.hashCode();
            }

            public String toString() {
                return "SuggestedAmounts(amounts=" + this.amounts + ")";
            }

            public SuggestedAmounts(ImmutableList<Money> amounts) {
                Intrinsics.checkNotNullParameter(amounts, "amounts");
                this.amounts = amounts;
            }

            public final ImmutableList<Money> getAmounts() {
                return this.amounts;
            }
        }
    }

    /* compiled from: InternationalTransferV2ViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState$AccountRowState;", "", "text", "Lcom/robinhood/utils/resource/StringResource;", "isEnabled", "", "isLoading", "<init>", "(Lcom/robinhood/utils/resource/StringResource;ZZ)V", "getText", "()Lcom/robinhood/utils/resource/StringResource;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class AccountRowState {
        private final boolean isEnabled;
        private final boolean isLoading;
        private final StringResource text;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = StringResource.$stable;

        public static /* synthetic */ AccountRowState copy$default(AccountRowState accountRowState, StringResource stringResource, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = accountRowState.text;
            }
            if ((i & 2) != 0) {
                z = accountRowState.isEnabled;
            }
            if ((i & 4) != 0) {
                z2 = accountRowState.isLoading;
            }
            return accountRowState.copy(stringResource, z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public final AccountRowState copy(StringResource text, boolean isEnabled, boolean isLoading) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new AccountRowState(text, isEnabled, isLoading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AccountRowState)) {
                return false;
            }
            AccountRowState accountRowState = (AccountRowState) other;
            return Intrinsics.areEqual(this.text, accountRowState.text) && this.isEnabled == accountRowState.isEnabled && this.isLoading == accountRowState.isLoading;
        }

        public int hashCode() {
            return (((this.text.hashCode() * 31) + Boolean.hashCode(this.isEnabled)) * 31) + Boolean.hashCode(this.isLoading);
        }

        public String toString() {
            return "AccountRowState(text=" + this.text + ", isEnabled=" + this.isEnabled + ", isLoading=" + this.isLoading + ")";
        }

        public AccountRowState(StringResource text, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.isEnabled = z;
            this.isLoading = z2;
        }

        public final StringResource getText() {
            return this.text;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }

        /* compiled from: InternationalTransferV2ViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\u0005¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState$AccountRowState$Companion;", "", "<init>", "()V", "placeholder", "Lcom/robinhood/android/transfers/ui/max/i18n/mcw/InternationalTransferV2ViewState$AccountRowState;", "newBankAccount", "isEnabled", "", "selectAccount", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final AccountRowState placeholder() {
                return new AccountRowState(StringResource.INSTANCE.invoke("----"), false, true);
            }

            public final AccountRowState newBankAccount(boolean isEnabled) {
                return new AccountRowState(StringResource.INSTANCE.invoke(C30065R.string.new_bank_account, new Object[0]), isEnabled, false);
            }

            public final AccountRowState selectAccount() {
                return new AccountRowState(StringResource.INSTANCE.invoke(C30065R.string.mcw_transfer_select_account, new Object[0]), true, false);
            }
        }
    }
}
