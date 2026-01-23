package com.robinhood.android.transfers.p271ui.p272v2;

import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.models.retirement.api.transfers.ApiRothConversionTransferInfo;
import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.p271ui.max.CreateTransferViewState;
import com.robinhood.android.transfers.p271ui.max.suggestionpills.QuickSelectorChip;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2ModeState;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2ViewState;
import com.robinhood.android.transfers.p271ui.p272v2.TransferSummaryState;
import com.robinhood.android.transfers.p271ui.p272v2.additionaldata.CreateTransferV2AdditionalDataClient;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryRequest;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.utils.Either;
import com.robinhood.utils.Either2;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferV2StateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2StateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2ViewState;", "<init>", "()V", "reduce", "dataState", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class CreateTransferV2StateProvider implements StateProvider<CreateTransferV2DataState, CreateTransferV2ViewState> {
    public static final int $stable = 0;

    /* compiled from: CreateTransferV2StateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CreateTransferViewState.Mode.values().length];
            try {
                iArr[CreateTransferViewState.Mode.EDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CreateTransferViewState.Mode.REVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.StateProvider
    public CreateTransferV2ViewState reduce(CreateTransferV2DataState dataState) {
        CreateTransferV2ModeState createTransferV2ModeState;
        Either eitherAsRight;
        List<UIComponent<GenericAction>> footer_content;
        List<UIComponent<GenericAction>> editStateDisclosure;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        boolean zIsContinueButtonLoading = CreateTransferV2StateProvider2.isContinueButtonLoading(dataState);
        List<QuickSelectorChip> quickSelectorChips = CreateTransferV2StateProvider2.getQuickSelectorChips(dataState);
        UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, CreateTransferV2DataState.INSTANCE.getScreen$feature_transfers_externalRelease(), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, dataState.getMaxTransferContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null), null, null, 53, null);
        CreateTransferV2AdditionalDataClient.Request request = new CreateTransferV2AdditionalDataClient.Request(dataState.getAmount(), dataState.getMode(), CreateTransferV2StateProvider2.fromTransferAccount(dataState), CreateTransferV2StateProvider2.toTransferAccount(dataState), dataState.getDirection(), CreateTransferV2StateProvider2.configuredTransferType(dataState));
        CreateTransferV2EligibleInstantBundle createTransferV2EligibleInstantBundle = new CreateTransferV2EligibleInstantBundle(dataState.getAmount(), CreateTransferV2StateProvider2.fromTransferAccount(dataState), CreateTransferV2StateProvider2.toTransferAccount(dataState), dataState.isCreatingTransfer());
        MAXTransferContext.EntryPoint entryPoint = dataState.getEntryPoint();
        CreateTransferViewState.IraDistributionFeeRequest iraDistributionFeesRequest = CreateTransferV2DataState2.getIraDistributionFeesRequest(dataState);
        CreateTransferViewState.IraDistributionTaxWithholdingRequest iraDistributionTaxWithholdingRequest = CreateTransferV2DataState2.getIraDistributionTaxWithholdingRequest(dataState);
        TransferAccount transferAccount = CreateTransferV2StateProvider2.toTransferAccount(dataState);
        ApiTransferSummaryRequest transferSummaryRequest = CreateTransferV2DataState2.getTransferSummaryRequest(dataState);
        BigDecimal amount = dataState.getAmount();
        char[] charArray = dataState.getInputChars().toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        boolean animateInput = dataState.getAnimateInput();
        CreateTransferV2DropdownChipViewState createTransferV2DropdownChipViewStateDropdownChipViewState = CreateTransferV2StateProvider2.dropdownChipViewState(dataState);
        CreateTransferV2ViewState.InfoTagState infoTagStateAmountInfoTagState = CreateTransferV2StateProvider2.amountInfoTagState(dataState);
        StringResource stringResourceAmountFooterText = CreateTransferV2StateProvider2.amountFooterText(dataState);
        boolean hideFrequency = dataState.getHideFrequency();
        boolean zIsInstantTransfersButtonEnabled = CreateTransferV2StateProvider2.isInstantTransfersButtonEnabled(dataState, zIsContinueButtonLoading);
        boolean zIsInstantTransfersButtonVisible = CreateTransferV2StateProvider2.isInstantTransfersButtonVisible(dataState);
        boolean zIsContinueButtonEnabled = CreateTransferV2StateProvider2.isContinueButtonEnabled(dataState);
        boolean zIsContinueButtonVisible = CreateTransferV2StateProvider2.isContinueButtonVisible(dataState, quickSelectorChips);
        StringResource stringResourceContinueButtonCopy = CreateTransferV2StateProvider2.continueButtonCopy(dataState);
        int i = WhenMappings.$EnumSwitchMapping$0[dataState.getMode().ordinal()];
        if (i == 1) {
            createTransferV2ModeState = CreateTransferV2ModeState.Edit.INSTANCE;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            createTransferV2ModeState = CreateTransferV2ModeState.Review.INSTANCE;
        }
        CreateTransferV2ModeState createTransferV2ModeState2 = createTransferV2ModeState;
        List<CreateTransferV2DataRowState> reviewRows = CreateTransferV2StateProvider2.getReviewRows(dataState, zIsContinueButtonLoading);
        CreateTransferV2InstantBankTransferSelectorViewState instantTransferSelectorViewState = CreateTransferV2StateProvider2.getInstantTransferSelectorViewState(dataState);
        boolean showDisclosure = dataState.getShowDisclosure();
        TransferSummaryState transferSummaryState = dataState.getTransferSummaryState();
        TransferSummaryState.Success success = transferSummaryState instanceof TransferSummaryState.Success ? (TransferSummaryState.Success) transferSummaryState : null;
        if (success == null || (editStateDisclosure = success.getEditStateDisclosure()) == null || (eitherAsRight = Either2.asLeft(editStateDisclosure)) == null) {
            ApiRothConversionTransferInfo rothConversionTransferInfo = dataState.getRothConversionTransferInfo();
            eitherAsRight = (rothConversionTransferInfo == null || (footer_content = rothConversionTransferInfo.getFooter_content()) == null) ? Either2.asRight(dataState.getDisclosureMicrogramApplication()) : Either2.asLeft(footer_content);
        }
        return new CreateTransferV2ViewState(userInteractionEventDescriptor, request, createTransferV2EligibleInstantBundle, entryPoint, iraDistributionFeesRequest, iraDistributionTaxWithholdingRequest, transferAccount, transferSummaryRequest, amount, charArray, animateInput, createTransferV2DropdownChipViewStateDropdownChipViewState, dataState.getShouldShowRothIraReviewStateErrorRetryText() ? StringResource.INSTANCE.invoke(C30065R.string.something_went_wrong_retry, new Object[0]) : null, infoTagStateAmountInfoTagState, stringResourceAmountFooterText, hideFrequency, zIsInstantTransfersButtonEnabled, zIsInstantTransfersButtonVisible, zIsContinueButtonEnabled, zIsContinueButtonLoading, zIsContinueButtonVisible, stringResourceContinueButtonCopy, quickSelectorChips, createTransferV2ModeState2, reviewRows, instantTransferSelectorViewState, showDisclosure, eitherAsRight, CreateTransferV2DataState2.getRewardPillRequestData(dataState), dataState.getDepositIncentivePillData(), dataState.getPromotionType(), dataState.getRothConversionTransferInfo());
    }
}
