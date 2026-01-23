package com.robinhood.android.transfers.p271ui.p272v2;

import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.engagement.depositincentive.model.DepositIncentivePillData;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.models.retirement.api.transfers.ApiRothConversionTransferInfo;
import com.robinhood.android.transfers.p271ui.max.CreateTransferViewState;
import com.robinhood.android.transfers.p271ui.max.suggestionpills.QuickSelectorChip;
import com.robinhood.android.transfers.p271ui.p272v2.additionaldata.CreateTransferV2AdditionalDataClient;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryRequest;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.utils.Either;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.android.RemoteMicrogramApplication;

/* compiled from: CreateTransferV2ViewState.kt */
@Metadata(m3635d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\b\u0007\u0018\u00002\u00020\u0001:\u0001pBÑ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0017\u0012\u0006\u0010 \u001a\u00020\u0017\u0012\u0006\u0010!\u001a\u00020\u0017\u0012\u0006\u0010\"\u001a\u00020\u0017\u0012\u0006\u0010#\u001a\u00020\u0017\u0012\u0006\u0010$\u001a\u00020\u0017\u0012\u0006\u0010%\u001a\u00020\u001b\u0012\u000e\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'\u0012\u0006\u0010)\u001a\u00020*\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0'\u0012\b\u0010-\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u0010/\u001a\u00020\u0017\u0012\u001e\u00100\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000203020'\u0012\u0004\u0012\u00020401\u0012\b\u00105\u001a\u0004\u0018\u000106\u0012\b\u00107\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<¢\u0006\u0004\b=\u0010>R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\bC\u0010DR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\bM\u0010NR\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001b¢\u0006\b\n\u0000\u001a\u0004\b[\u0010XR\u0011\u0010\u001f\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010TR\u0011\u0010 \u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b \u0010TR\u0011\u0010!\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b!\u0010TR\u0011\u0010\"\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010TR\u0011\u0010#\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b#\u0010TR\u0011\u0010$\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b$\u0010TR\u0011\u0010%\u001a\u00020\u001b¢\u0006\b\n\u0000\u001a\u0004\b]\u0010XR\u0019\u0010&\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b`\u0010aR\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020,0'¢\u0006\b\n\u0000\u001a\u0004\bb\u0010_R\u0013\u0010-\u001a\u0004\u0018\u00010.¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0011\u0010/\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\be\u0010TR)\u00100\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000203020'\u0012\u0004\u0012\u00020401¢\u0006\b\n\u0000\u001a\u0004\bf\u0010gR\u0013\u00105\u001a\u0004\u0018\u000106¢\u0006\b\n\u0000\u001a\u0004\bh\u0010iR\u0013\u00107\u001a\u0004\u0018\u000108¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0013\u00109\u001a\u0004\u0018\u00010:¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0013\u0010;\u001a\u0004\u0018\u00010<¢\u0006\b\n\u0000\u001a\u0004\bn\u0010o¨\u0006q"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2ViewState;", "", "userInteractionEventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "createTransferV2AdditionalDataRequest", "Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$Request;", "eligibleInstantDepositBundle", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2EligibleInstantBundle;", "entrypoint", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "iraDistributionFeesRequest", "Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$IraDistributionFeeRequest;", "iraDistributionTaxWithholdingRequest", "Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$IraDistributionTaxWithholdingRequest;", "toAccount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "transferSummaryRequest", "Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryRequest;", "amount", "Ljava/math/BigDecimal;", "inputChars", "", "animateInput", "", "dropdownChipViewState", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DropdownChipViewState;", "rothInformationErrorViewState", "Lcom/robinhood/utils/resource/StringResource;", "amountInfoTagState", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2ViewState$InfoTagState;", "amountFooterText", "hideFrequency", "isInstantTransfersButtonEnabled", "isInstantTransfersButtonVisible", "isContinueButtonEnabled", "isContinueButtonLoading", "isContinueButtonVisible", "continueButtonCopy", "quickSelectorChips", "", "Lcom/robinhood/android/transfers/ui/max/suggestionpills/QuickSelectorChip;", "modeState", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2ModeState;", "reviewDataRowStates", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState;", "instantBankTransferViewState", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2InstantBankTransferSelectorViewState;", "showDisclosure", "disclosureSource", "Lcom/robinhood/utils/Either;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "Lmicrogram/android/RemoteMicrogramApplication;", "depositIncentiveRequestData", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;", "depositIncentivePillData", "Lcom/robinhood/android/engagement/depositincentive/model/DepositIncentivePillData;", "promotionType", "", "rothConversionTransferInfo", "Lcom/robinhood/android/models/retirement/api/transfers/ApiRothConversionTransferInfo;", "<init>", "(Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$Request;Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2EligibleInstantBundle;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$IraDistributionFeeRequest;Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$IraDistributionTaxWithholdingRequest;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryRequest;Ljava/math/BigDecimal;[CZLcom/robinhood/android/transfers/ui/v2/CreateTransferV2DropdownChipViewState;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2ViewState$InfoTagState;Lcom/robinhood/utils/resource/StringResource;ZZZZZZLcom/robinhood/utils/resource/StringResource;Ljava/util/List;Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2ModeState;Ljava/util/List;Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2InstantBankTransferSelectorViewState;ZLcom/robinhood/utils/Either;Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;Lcom/robinhood/android/engagement/depositincentive/model/DepositIncentivePillData;Ljava/lang/String;Lcom/robinhood/android/models/retirement/api/transfers/ApiRothConversionTransferInfo;)V", "getUserInteractionEventDescriptor", "()Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "getCreateTransferV2AdditionalDataRequest", "()Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$Request;", "getEligibleInstantDepositBundle", "()Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2EligibleInstantBundle;", "getEntrypoint", "()Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "getIraDistributionFeesRequest", "()Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$IraDistributionFeeRequest;", "getIraDistributionTaxWithholdingRequest", "()Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$IraDistributionTaxWithholdingRequest;", "getToAccount", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "getTransferSummaryRequest", "()Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryRequest;", "getAmount", "()Ljava/math/BigDecimal;", "getInputChars", "()[C", "getAnimateInput", "()Z", "getDropdownChipViewState", "()Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DropdownChipViewState;", "getRothInformationErrorViewState", "()Lcom/robinhood/utils/resource/StringResource;", "getAmountInfoTagState", "()Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2ViewState$InfoTagState;", "getAmountFooterText", "getHideFrequency", "getContinueButtonCopy", "getQuickSelectorChips", "()Ljava/util/List;", "getModeState", "()Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2ModeState;", "getReviewDataRowStates", "getInstantBankTransferViewState", "()Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2InstantBankTransferSelectorViewState;", "getShowDisclosure", "getDisclosureSource", "()Lcom/robinhood/utils/Either;", "getDepositIncentiveRequestData", "()Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;", "getDepositIncentivePillData", "()Lcom/robinhood/android/engagement/depositincentive/model/DepositIncentivePillData;", "getPromotionType", "()Ljava/lang/String;", "getRothConversionTransferInfo", "()Lcom/robinhood/android/models/retirement/api/transfers/ApiRothConversionTransferInfo;", "InfoTagState", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class CreateTransferV2ViewState {
    public static final int $stable = 8;
    private final BigDecimal amount;
    private final StringResource amountFooterText;
    private final InfoTagState amountInfoTagState;
    private final boolean animateInput;
    private final StringResource continueButtonCopy;
    private final CreateTransferV2AdditionalDataClient.Request createTransferV2AdditionalDataRequest;
    private final DepositIncentivePillData depositIncentivePillData;
    private final ApiCreateTransferRequest depositIncentiveRequestData;
    private final Either<List<UIComponent<GenericAction>>, RemoteMicrogramApplication> disclosureSource;
    private final CreateTransferV2DropdownChipViewState dropdownChipViewState;
    private final CreateTransferV2EligibleInstantBundle eligibleInstantDepositBundle;
    private final MAXTransferContext.EntryPoint entrypoint;
    private final boolean hideFrequency;
    private final char[] inputChars;
    private final CreateTransferV2InstantBankTransferSelectorViewState instantBankTransferViewState;
    private final CreateTransferViewState.IraDistributionFeeRequest iraDistributionFeesRequest;
    private final CreateTransferViewState.IraDistributionTaxWithholdingRequest iraDistributionTaxWithholdingRequest;
    private final boolean isContinueButtonEnabled;
    private final boolean isContinueButtonLoading;
    private final boolean isContinueButtonVisible;
    private final boolean isInstantTransfersButtonEnabled;
    private final boolean isInstantTransfersButtonVisible;
    private final CreateTransferV2ModeState modeState;
    private final String promotionType;
    private final List<QuickSelectorChip> quickSelectorChips;
    private final List<CreateTransferV2DataRowState> reviewDataRowStates;
    private final ApiRothConversionTransferInfo rothConversionTransferInfo;
    private final StringResource rothInformationErrorViewState;
    private final boolean showDisclosure;
    private final TransferAccount toAccount;
    private final ApiTransferSummaryRequest transferSummaryRequest;
    private final UserInteractionEventDescriptor userInteractionEventDescriptor;

    /* JADX WARN: Multi-variable type inference failed */
    public CreateTransferV2ViewState(UserInteractionEventDescriptor userInteractionEventDescriptor, CreateTransferV2AdditionalDataClient.Request createTransferV2AdditionalDataRequest, CreateTransferV2EligibleInstantBundle eligibleInstantDepositBundle, MAXTransferContext.EntryPoint entrypoint, CreateTransferViewState.IraDistributionFeeRequest iraDistributionFeeRequest, CreateTransferViewState.IraDistributionTaxWithholdingRequest iraDistributionTaxWithholdingRequest, TransferAccount transferAccount, ApiTransferSummaryRequest apiTransferSummaryRequest, BigDecimal amount, char[] inputChars, boolean z, CreateTransferV2DropdownChipViewState createTransferV2DropdownChipViewState, StringResource stringResource, InfoTagState infoTagState, StringResource stringResource2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, StringResource continueButtonCopy, List<QuickSelectorChip> list, CreateTransferV2ModeState modeState, List<CreateTransferV2DataRowState> reviewDataRowStates, CreateTransferV2InstantBankTransferSelectorViewState createTransferV2InstantBankTransferSelectorViewState, boolean z8, Either<? extends List<? extends UIComponent<? extends GenericAction>>, RemoteMicrogramApplication> disclosureSource, ApiCreateTransferRequest apiCreateTransferRequest, DepositIncentivePillData depositIncentivePillData, String str, ApiRothConversionTransferInfo apiRothConversionTransferInfo) {
        Intrinsics.checkNotNullParameter(userInteractionEventDescriptor, "userInteractionEventDescriptor");
        Intrinsics.checkNotNullParameter(createTransferV2AdditionalDataRequest, "createTransferV2AdditionalDataRequest");
        Intrinsics.checkNotNullParameter(eligibleInstantDepositBundle, "eligibleInstantDepositBundle");
        Intrinsics.checkNotNullParameter(entrypoint, "entrypoint");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(inputChars, "inputChars");
        Intrinsics.checkNotNullParameter(continueButtonCopy, "continueButtonCopy");
        Intrinsics.checkNotNullParameter(modeState, "modeState");
        Intrinsics.checkNotNullParameter(reviewDataRowStates, "reviewDataRowStates");
        Intrinsics.checkNotNullParameter(disclosureSource, "disclosureSource");
        this.userInteractionEventDescriptor = userInteractionEventDescriptor;
        this.createTransferV2AdditionalDataRequest = createTransferV2AdditionalDataRequest;
        this.eligibleInstantDepositBundle = eligibleInstantDepositBundle;
        this.entrypoint = entrypoint;
        this.iraDistributionFeesRequest = iraDistributionFeeRequest;
        this.iraDistributionTaxWithholdingRequest = iraDistributionTaxWithholdingRequest;
        this.toAccount = transferAccount;
        this.transferSummaryRequest = apiTransferSummaryRequest;
        this.amount = amount;
        this.inputChars = inputChars;
        this.animateInput = z;
        this.dropdownChipViewState = createTransferV2DropdownChipViewState;
        this.rothInformationErrorViewState = stringResource;
        this.amountInfoTagState = infoTagState;
        this.amountFooterText = stringResource2;
        this.hideFrequency = z2;
        this.isInstantTransfersButtonEnabled = z3;
        this.isInstantTransfersButtonVisible = z4;
        this.isContinueButtonEnabled = z5;
        this.isContinueButtonLoading = z6;
        this.isContinueButtonVisible = z7;
        this.continueButtonCopy = continueButtonCopy;
        this.quickSelectorChips = list;
        this.modeState = modeState;
        this.reviewDataRowStates = reviewDataRowStates;
        this.instantBankTransferViewState = createTransferV2InstantBankTransferSelectorViewState;
        this.showDisclosure = z8;
        this.disclosureSource = disclosureSource;
        this.depositIncentiveRequestData = apiCreateTransferRequest;
        this.depositIncentivePillData = depositIncentivePillData;
        this.promotionType = str;
        this.rothConversionTransferInfo = apiRothConversionTransferInfo;
    }

    public /* synthetic */ CreateTransferV2ViewState(UserInteractionEventDescriptor userInteractionEventDescriptor, CreateTransferV2AdditionalDataClient.Request request, CreateTransferV2EligibleInstantBundle createTransferV2EligibleInstantBundle, MAXTransferContext.EntryPoint entryPoint, CreateTransferViewState.IraDistributionFeeRequest iraDistributionFeeRequest, CreateTransferViewState.IraDistributionTaxWithholdingRequest iraDistributionTaxWithholdingRequest, TransferAccount transferAccount, ApiTransferSummaryRequest apiTransferSummaryRequest, BigDecimal bigDecimal, char[] cArr, boolean z, CreateTransferV2DropdownChipViewState createTransferV2DropdownChipViewState, StringResource stringResource, InfoTagState infoTagState, StringResource stringResource2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, StringResource stringResource3, List list, CreateTransferV2ModeState createTransferV2ModeState, List list2, CreateTransferV2InstantBankTransferSelectorViewState createTransferV2InstantBankTransferSelectorViewState, boolean z8, Either either, ApiCreateTransferRequest apiCreateTransferRequest, DepositIncentivePillData depositIncentivePillData, String str, ApiRothConversionTransferInfo apiRothConversionTransferInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(userInteractionEventDescriptor, request, createTransferV2EligibleInstantBundle, entryPoint, iraDistributionFeeRequest, iraDistributionTaxWithholdingRequest, transferAccount, apiTransferSummaryRequest, bigDecimal, cArr, z, createTransferV2DropdownChipViewState, (i & 4096) != 0 ? null : stringResource, infoTagState, stringResource2, (32768 & i) != 0 ? false : z2, z3, z4, z5, z6, z7, stringResource3, list, createTransferV2ModeState, list2, createTransferV2InstantBankTransferSelectorViewState, (67108864 & i) != 0 ? false : z8, either, apiCreateTransferRequest, depositIncentivePillData, (1073741824 & i) != 0 ? null : str, (i & Integer.MIN_VALUE) != 0 ? null : apiRothConversionTransferInfo);
    }

    public final UserInteractionEventDescriptor getUserInteractionEventDescriptor() {
        return this.userInteractionEventDescriptor;
    }

    public final CreateTransferV2AdditionalDataClient.Request getCreateTransferV2AdditionalDataRequest() {
        return this.createTransferV2AdditionalDataRequest;
    }

    public final CreateTransferV2EligibleInstantBundle getEligibleInstantDepositBundle() {
        return this.eligibleInstantDepositBundle;
    }

    public final MAXTransferContext.EntryPoint getEntrypoint() {
        return this.entrypoint;
    }

    public final CreateTransferViewState.IraDistributionFeeRequest getIraDistributionFeesRequest() {
        return this.iraDistributionFeesRequest;
    }

    public final CreateTransferViewState.IraDistributionTaxWithholdingRequest getIraDistributionTaxWithholdingRequest() {
        return this.iraDistributionTaxWithholdingRequest;
    }

    public final TransferAccount getToAccount() {
        return this.toAccount;
    }

    public final ApiTransferSummaryRequest getTransferSummaryRequest() {
        return this.transferSummaryRequest;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    public final char[] getInputChars() {
        return this.inputChars;
    }

    public final boolean getAnimateInput() {
        return this.animateInput;
    }

    public final CreateTransferV2DropdownChipViewState getDropdownChipViewState() {
        return this.dropdownChipViewState;
    }

    public final StringResource getRothInformationErrorViewState() {
        return this.rothInformationErrorViewState;
    }

    public final InfoTagState getAmountInfoTagState() {
        return this.amountInfoTagState;
    }

    public final StringResource getAmountFooterText() {
        return this.amountFooterText;
    }

    public final boolean getHideFrequency() {
        return this.hideFrequency;
    }

    /* renamed from: isInstantTransfersButtonEnabled, reason: from getter */
    public final boolean getIsInstantTransfersButtonEnabled() {
        return this.isInstantTransfersButtonEnabled;
    }

    /* renamed from: isInstantTransfersButtonVisible, reason: from getter */
    public final boolean getIsInstantTransfersButtonVisible() {
        return this.isInstantTransfersButtonVisible;
    }

    /* renamed from: isContinueButtonEnabled, reason: from getter */
    public final boolean getIsContinueButtonEnabled() {
        return this.isContinueButtonEnabled;
    }

    /* renamed from: isContinueButtonLoading, reason: from getter */
    public final boolean getIsContinueButtonLoading() {
        return this.isContinueButtonLoading;
    }

    /* renamed from: isContinueButtonVisible, reason: from getter */
    public final boolean getIsContinueButtonVisible() {
        return this.isContinueButtonVisible;
    }

    public final StringResource getContinueButtonCopy() {
        return this.continueButtonCopy;
    }

    public final List<QuickSelectorChip> getQuickSelectorChips() {
        return this.quickSelectorChips;
    }

    public final CreateTransferV2ModeState getModeState() {
        return this.modeState;
    }

    public final List<CreateTransferV2DataRowState> getReviewDataRowStates() {
        return this.reviewDataRowStates;
    }

    public final CreateTransferV2InstantBankTransferSelectorViewState getInstantBankTransferViewState() {
        return this.instantBankTransferViewState;
    }

    public final boolean getShowDisclosure() {
        return this.showDisclosure;
    }

    public final Either<List<UIComponent<GenericAction>>, RemoteMicrogramApplication> getDisclosureSource() {
        return this.disclosureSource;
    }

    public final ApiCreateTransferRequest getDepositIncentiveRequestData() {
        return this.depositIncentiveRequestData;
    }

    public final DepositIncentivePillData getDepositIncentivePillData() {
        return this.depositIncentivePillData;
    }

    public final String getPromotionType() {
        return this.promotionType;
    }

    public final ApiRothConversionTransferInfo getRothConversionTransferInfo() {
        return this.rothConversionTransferInfo;
    }

    /* compiled from: CreateTransferV2ViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2ViewState$InfoTagState;", "", "text", "", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", "getText", "()Ljava/lang/String;", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InfoTagState {
        public static final int $stable = 0;
        private final ServerToBentoAssetMapper2 icon;
        private final String text;

        public static /* synthetic */ InfoTagState copy$default(InfoTagState infoTagState, String str, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = infoTagState.text;
            }
            if ((i & 2) != 0) {
                serverToBentoAssetMapper2 = infoTagState.icon;
            }
            return infoTagState.copy(str, serverToBentoAssetMapper2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final ServerToBentoAssetMapper2 getIcon() {
            return this.icon;
        }

        public final InfoTagState copy(String text, ServerToBentoAssetMapper2 icon) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new InfoTagState(text, icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InfoTagState)) {
                return false;
            }
            InfoTagState infoTagState = (InfoTagState) other;
            return Intrinsics.areEqual(this.text, infoTagState.text) && this.icon == infoTagState.icon;
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.icon.hashCode();
        }

        public String toString() {
            return "InfoTagState(text=" + this.text + ", icon=" + this.icon + ")";
        }

        public InfoTagState(String text, ServerToBentoAssetMapper2 icon) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.text = text;
            this.icon = icon;
        }

        public final String getText() {
            return this.text;
        }

        public final ServerToBentoAssetMapper2 getIcon() {
            return this.icon;
        }
    }
}
