package com.robinhood.android.transfers.p271ui.retirement.contributions;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.retirement.api.ApiRetirementMatchResponse3;
import com.robinhood.android.models.retirement.api.contributions.ApiGoldMatchSelectionRow;
import com.robinhood.android.models.retirement.api.contributions.ContributionYear;
import com.robinhood.android.models.retirement.api.contributions.KeypadChip;
import com.robinhood.android.models.retirement.p194db.MatchRateBreakdown;
import com.robinhood.android.models.retirement.p194db.RetirementMatchRate;
import com.robinhood.android.retirement.contributions.AccountSelectionData;
import com.robinhood.android.retirement.contributions.C26981R;
import com.robinhood.android.retirement.contributions.ContributionEditModeState;
import com.robinhood.android.retirement.contributions.ContributionFooterState;
import com.robinhood.android.retirement.contributions.ContributionProgressRingState;
import com.robinhood.android.retirement.contributions.ContributionReviewModeState;
import com.robinhood.android.retirement.contributions.ContributionSink;
import com.robinhood.android.retirement.contributions.ContributionTypeRowState;
import com.robinhood.android.retirement.contributions.ExtensionsKt;
import com.robinhood.android.retirement.contributions.Frequency2;
import com.robinhood.android.retirement.contributions.GoldMatchSelectionRowState;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.p271ui.max.TransferData;
import com.robinhood.android.transfers.p271ui.retirement.contributions.CreateRetirementContributionViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Year;

/* compiled from: CreateRetirementContributionStateProvider.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\f\u0010\b\u001a\u00020\u0003*\u00020\u0002H\u0002J\f\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u0002J\f\u0010\u000b\u001a\u0004\u0018\u00010\f*\u00020\u0002J\f\u0010\r\u001a\u00020\u000e*\u00020\u0002H\u0002J\f\u0010\u000f\u001a\u00020\u0010*\u00020\u0002H\u0002R\u0015\u0010\u0011\u001a\u00020\u0012*\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDataState;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState;", "<init>", "()V", "reduce", "dataState", "createState", "getMatchAmount", "", "getGoldMatchSelectionRowState", "Lcom/robinhood/android/retirement/contributions/GoldMatchSelectionRowState;", "getButtonText", "Lcom/robinhood/utils/resource/StringResource;", "getCtaAction", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState$ContributionCtaAction;", "textRes", "", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "getTextRes", "(Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;)I", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CreateRetirementContributionStateProvider implements StateProvider<CreateRetirementContributionDataState, CreateRetirementContributionViewState> {
    public static final int $stable = 0;
    public static final CreateRetirementContributionStateProvider INSTANCE = new CreateRetirementContributionStateProvider();

    private CreateRetirementContributionStateProvider() {
    }

    @Override // com.robinhood.android.udf.StateProvider
    public CreateRetirementContributionViewState reduce(CreateRetirementContributionDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        return dataState.getHasApiError() ? CreateRetirementContributionViewState.Error.INSTANCE : INSTANCE.createState(dataState);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final CreateRetirementContributionViewState createState(CreateRetirementContributionDataState createRetirementContributionDataState) {
        Object next;
        BigDecimal decimalValue;
        BigDecimal decimalValue2;
        List<KeypadChip> listEmptyList;
        MatchRateBreakdown activeBreakdownForAch;
        List<MatchRateBreakdown> matchRateBreakdowns;
        Object next2;
        ApiRetirementMatchResponse3 breakdownType;
        Money amountContributed;
        Money contributionLimit;
        if (createRetirementContributionDataState.getScreenInfo() == null || createRetirementContributionDataState.getSinkAccount() == null || createRetirementContributionDataState.getTaxYear() == null) {
            return CreateRetirementContributionViewState.Loading.INSTANCE;
        }
        Iterator<T> it = createRetirementContributionDataState.getScreenInfo().getContributionYears().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(Year.m3433of(((ContributionYear) next).getTaxYear()), createRetirementContributionDataState.getTaxYear())) {
                break;
            }
        }
        ContributionYear contributionYear = (ContributionYear) next;
        Currency currency = Currencies.USD;
        if (contributionYear == null || (contributionLimit = contributionYear.getContributionLimit()) == null || (decimalValue = contributionLimit.getDecimalValue()) == null) {
            decimalValue = BigDecimal.ZERO;
        }
        Intrinsics.checkNotNull(decimalValue);
        Money money = new Money(currency, decimalValue);
        if (contributionYear == null || (amountContributed = contributionYear.getAmountContributed()) == null || (decimalValue2 = amountContributed.getDecimalValue()) == null) {
            decimalValue2 = BigDecimal.ZERO;
        }
        if (contributionYear == null || (listEmptyList = contributionYear.getChips()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List<KeypadChip> list = listEmptyList;
        IraContributionQuestionnaireResult.IraContribution.OneTimeContribution oneTimeContribution = new IraContributionQuestionnaireResult.IraContribution.OneTimeContribution(createRetirementContributionDataState.getSinkAccount(), createRetirementContributionDataState.getTaxYear(), money);
        boolean z = createRetirementContributionDataState.getFrequency() != ApiCreateTransferRequest2.ONCE;
        boolean z2 = createRetirementContributionDataState.getEntryPoint() == MAXTransferContext.EntryPoint.RETIREMENT_UNFUNDED_LEARN_AND_EARN_EDUCATION_LESSON;
        boolean z3 = createRetirementContributionDataState.getEffectiveMatchRateOverride() == ApiRetirementMatchResponse3.GOLD;
        if (!createRetirementContributionDataState.getSinkAccountIsManaged()) {
            if (z3) {
                RetirementMatchRate matchRate = createRetirementContributionDataState.getMatchRate();
                if (matchRate == null || (matchRateBreakdowns = matchRate.getMatchRateBreakdowns()) == null) {
                    activeBreakdownForAch = null;
                } else {
                    Iterator<T> it2 = matchRateBreakdowns.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        if (((MatchRateBreakdown) next2).getBreakdownType() == ApiRetirementMatchResponse3.GOLD) {
                            break;
                        }
                    }
                    activeBreakdownForAch = (MatchRateBreakdown) next2;
                }
            } else {
                TransferAccount sourceAccount = createRetirementContributionDataState.getSourceAccount();
                if (sourceAccount == null || sourceAccount.isExternal()) {
                    RetirementMatchRate matchRate2 = createRetirementContributionDataState.getMatchRate();
                    if (matchRate2 != null) {
                        activeBreakdownForAch = matchRate2.getActiveBreakdownForAch();
                    }
                } else {
                    RetirementMatchRate matchRate3 = createRetirementContributionDataState.getMatchRate();
                    if (matchRate3 != null) {
                        activeBreakdownForAch = matchRate3.getActiveBreakdownForInternal();
                    }
                }
            }
        }
        String title = contributionYear != null ? contributionYear.getTitle() : null;
        if (title == null) {
            title = "";
        }
        String str = title;
        boolean zIsInEditMode = createRetirementContributionDataState.isInEditMode();
        String userInputString = createRetirementContributionDataState.getUserInputString();
        String accountNumber = createRetirementContributionDataState.getSinkAccount().getAccountNumber();
        Year taxYear = createRetirementContributionDataState.getTaxYear();
        float contributionPercent = ExtensionsKt.getContributionPercent(contributionYear, createRetirementContributionDataState.getUserInputAmount());
        String userInputString2 = createRetirementContributionDataState.getUserInputString();
        String matchAmount = getMatchAmount(createRetirementContributionDataState);
        if (activeBreakdownForAch == null || (breakdownType = activeBreakdownForAch.getBreakdownType()) == null) {
            breakdownType = ApiRetirementMatchResponse3.BASE;
        }
        ContributionProgressRingState contributionProgressRingState = new ContributionProgressRingState(contributionPercent, userInputString2, breakdownType, matchAmount);
        String str2 = Formats.getCurrencyFormat().format(createRetirementContributionDataState.getUserInputAmount());
        ApiCreateTransferRequest2 frequency = createRetirementContributionDataState.getFrequency();
        boolean z4 = createRetirementContributionDataState.getCanShowFrequencyRow() && !z2;
        TransferAccount sourceAccount2 = createRetirementContributionDataState.getSourceAccount();
        ContributionSink.Account account = new ContributionSink.Account(createRetirementContributionDataState.getSinkAccount());
        List<TransferAccount> accounts2 = createRetirementContributionDataState.getAccounts();
        if (accounts2 == null) {
            accounts2 = CollectionsKt.emptyList();
        }
        ContributionReviewModeState contributionReviewModeState = new ContributionReviewModeState(str2, frequency, z4, new AccountSelectionData(sourceAccount2, account, accounts2, createRetirementContributionDataState.getEffectiveMatchRateOverride()), createRetirementContributionDataState.getTaxYear(), createRetirementContributionDataState.isContributionRequestLoading(), z, new ContributionTypeRowState(z || z2 || z3 || createRetirementContributionDataState.getGoldMatchSelectionRowSelected(), getTextRes(oneTimeContribution)), getGoldMatchSelectionRowState(createRetirementContributionDataState));
        ContributionEditModeState contributionEditModeState = new ContributionEditModeState(ExtensionsKt.getDeltaUntilMaxText(contributionYear, createRetirementContributionDataState.getUserInputAmount()), list, Intrinsics.areEqual(createRetirementContributionDataState.getUserInputAmount(), BigDecimal.ZERO) && !list.isEmpty(), createRetirementContributionDataState.getUserInputAmount(), createRetirementContributionDataState.getTaxYear());
        ContributionFooterState contributionFooterState = new ContributionFooterState(getButtonText(createRetirementContributionDataState), createRetirementContributionDataState.isContributionRequestLoading(), Frequency2.getRetirementContributionReviewFooterText(createRetirementContributionDataState.getFrequency(), createRetirementContributionDataState.getUserInputAmount()), createRetirementContributionDataState.getSourceAccount() != null);
        MAXTransferContext.EntryPoint entryPoint = createRetirementContributionDataState.getEntryPoint();
        BigDecimal userInputAmount = createRetirementContributionDataState.getUserInputAmount();
        BigDecimal userInputAmount2 = createRetirementContributionDataState.getUserInputAmount();
        TransferAccount sourceAccount3 = createRetirementContributionDataState.getSourceAccount();
        TransferConfiguration.IraContribution iraContribution = new TransferConfiguration.IraContribution(userInputAmount2, null, sourceAccount3 != null ? new TransferConfiguration.TransferAccountSelection(sourceAccount3.getAccountId(), false, sourceAccount3.getType(), 2, null) : null, new TransferConfiguration.TransferAccountSelection(createRetirementContributionDataState.getSinkAccount().getAccountId(), false, createRetirementContributionDataState.getSinkAccount().getType(), 2, null), null, null, null, null, EnumC7081g.f2778x3356acf6, null);
        Portfolio portfolio = createRetirementContributionDataState.getPortfolio();
        UnifiedBalances unifiedBalances = createRetirementContributionDataState.getUnifiedBalances();
        boolean areMarketsOpenExtended = createRetirementContributionDataState.getAreMarketsOpenExtended();
        boolean overrideNoEnokiAlert = createRetirementContributionDataState.getOverrideNoEnokiAlert();
        boolean zIsInInterEntityMatchExperiment = createRetirementContributionDataState.isInInterEntityMatchExperiment();
        boolean zIsContributionRequestLoading = createRetirementContributionDataState.isContributionRequestLoading();
        Map<TransferData, UUID> transferDataToRefId = createRetirementContributionDataState.getTransferDataToRefId();
        TransferAccount sourceAccount4 = createRetirementContributionDataState.getSourceAccount();
        TransferAccount sinkAccount = createRetirementContributionDataState.getSinkAccount();
        boolean showEnokiCelebration = createRetirementContributionDataState.getShowEnokiCelebration();
        ApiCreateTransferRequest2 frequency2 = createRetirementContributionDataState.getFrequency();
        BigDecimal decimalValue3 = money.getDecimalValue();
        Intrinsics.checkNotNull(decimalValue2);
        BigDecimal bigDecimalSubtract = decimalValue3.subtract(decimalValue2);
        Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return new CreateRetirementContributionViewState.Loaded(str, zIsInEditMode, userInputString, accountNumber, taxYear, contributionProgressRingState, contributionReviewModeState, contributionEditModeState, contributionFooterState, zIsContributionRequestLoading, transferDataToRefId, sourceAccount4, sinkAccount, frequency2, oneTimeContribution, entryPoint, userInputAmount, iraContribution, portfolio, unifiedBalances, areMarketsOpenExtended, overrideNoEnokiAlert, zIsInInterEntityMatchExperiment, showEnokiCelebration, bigDecimalSubtract, getCtaAction(createRetirementContributionDataState));
    }

    public final String getMatchAmount(CreateRetirementContributionDataState createRetirementContributionDataState) {
        ArrayList arrayList;
        List<MatchRateBreakdown> matchRateBreakdowns;
        Intrinsics.checkNotNullParameter(createRetirementContributionDataState, "<this>");
        if (createRetirementContributionDataState.getSinkAccountIsManaged()) {
            return null;
        }
        RetirementMatchRate matchRate = createRetirementContributionDataState.getMatchRate();
        if (matchRate == null || (matchRateBreakdowns = matchRate.getMatchRateBreakdowns()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (Object obj : matchRateBreakdowns) {
                MatchRateBreakdown matchRateBreakdown = (MatchRateBreakdown) obj;
                if (matchRateBreakdown.isActive() || matchRateBreakdown.getBreakdownType() == createRetirementContributionDataState.getEffectiveMatchRateOverride()) {
                    arrayList.add(obj);
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        MatchRateBreakdown matchRateBreakdown2 = (MatchRateBreakdown) it.next();
        TransferAccount sourceAccount = createRetirementContributionDataState.getSourceAccount();
        BigDecimal achTransferPercentage = (sourceAccount == null || sourceAccount.isExternal()) ? matchRateBreakdown2.getAchTransferPercentage() : matchRateBreakdown2.getInternalAccountTransferPercentage();
        while (it.hasNext()) {
            MatchRateBreakdown matchRateBreakdown3 = (MatchRateBreakdown) it.next();
            TransferAccount sourceAccount2 = createRetirementContributionDataState.getSourceAccount();
            BigDecimal achTransferPercentage2 = (sourceAccount2 == null || sourceAccount2.isExternal()) ? matchRateBreakdown3.getAchTransferPercentage() : matchRateBreakdown3.getInternalAccountTransferPercentage();
            if (achTransferPercentage.compareTo(achTransferPercentage2) < 0) {
                achTransferPercentage = achTransferPercentage2;
            }
        }
        return ExtensionsKt.calculateMatchString(createRetirementContributionDataState.getUserInputAmount(), achTransferPercentage);
    }

    public final GoldMatchSelectionRowState getGoldMatchSelectionRowState(CreateRetirementContributionDataState createRetirementContributionDataState) {
        ApiGoldMatchSelectionRow goldMatchSelectionRow;
        Intrinsics.checkNotNullParameter(createRetirementContributionDataState, "<this>");
        if (createRetirementContributionDataState.getSinkAccountIsManaged() || createRetirementContributionDataState.getPassedInMatchTypeOverride() != null || (goldMatchSelectionRow = createRetirementContributionDataState.getGoldMatchSelectionRow()) == null) {
            return null;
        }
        return new GoldMatchSelectionRowState(goldMatchSelectionRow.getTitle(), goldMatchSelectionRow.getSubtitle(), goldMatchSelectionRow.getImage(), goldMatchSelectionRow.getLogging_id(), createRetirementContributionDataState.getGoldMatchSelectionRowSelected());
    }

    private final StringResource getButtonText(CreateRetirementContributionDataState createRetirementContributionDataState) {
        if (createRetirementContributionDataState.getShouldContinueInsteadOfSubmit() || createRetirementContributionDataState.getGoldMatchSelectionRowSelected()) {
            return StringResource.INSTANCE.invoke(C11048R.string.general_label_continue, new Object[0]);
        }
        return StringResource.INSTANCE.invoke(C11048R.string.general_action_submit, new Object[0]);
    }

    private final CreateRetirementContributionViewState.ContributionCtaAction getCtaAction(CreateRetirementContributionDataState createRetirementContributionDataState) {
        return createRetirementContributionDataState.getShouldContinueInsteadOfSubmit() ? CreateRetirementContributionViewState.ContributionCtaAction.CONTINUE_IN_FULLSCREEN_MATCH_SELECTION : createRetirementContributionDataState.getGoldMatchSelectionRowSelected() ? CreateRetirementContributionViewState.ContributionCtaAction.CONTINUE_TO_CONTRIBUTION_AND_GOLD_AGREEMENTS : CreateRetirementContributionViewState.ContributionCtaAction.SUBMIT_CONTRIBUTION;
    }

    public final int getTextRes(IraContributionQuestionnaireResult.IraContribution iraContribution) {
        Intrinsics.checkNotNullParameter(iraContribution, "<this>");
        if (iraContribution instanceof IraContributionQuestionnaireResult.IraContribution.IndirectRollover) {
            return C26981R.string.transfer_ira_contribution_type_indirect_rollover;
        }
        if (!(iraContribution instanceof IraContributionQuestionnaireResult.IraContribution.OneTimeContribution)) {
            throw new NoWhenBranchMatchedException();
        }
        return C26981R.string.transfer_ira_contribution_type_one_time;
    }
}
