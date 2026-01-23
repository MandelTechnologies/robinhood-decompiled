package com.robinhood.android.optionschain.sbschain;

import com.robinhood.android.common.options.OptionDefaultPricingState;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.options.contracts.OptionOrderIntentKey;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState2;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainEvent;
import com.robinhood.android.optionschain.view.OptionChainTooltipBanner3;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.OptionCurrentOrNextMarketDates;
import com.robinhood.models.p320db.OptionMarketHoursParam2;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionStrategyLegDisplay;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.datetime.ZoneIds;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.chrono.ChronoLocalDate;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: OptionSideBySideChainStateProvider.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\b\u001a\u00020\u00022\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainViewState;", "j$/time/Clock", Card.Icon.CLOCK, "<init>", "(Lj$/time/Clock;)V", "ds", "Lcom/robinhood/android/optionschain/view/OptionChainTooltipBannerType;", "getTopTooltipBannerType", "(Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;)Lcom/robinhood/android/optionschain/view/OptionChainTooltipBannerType;", "", "currentTabIndex", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "adjustedExpirationDateStates", "", "isOnTodayTab", "(Lj$/time/Clock;Ljava/lang/Integer;Lkotlinx/collections/immutable/ImmutableList;)Z", "getAdjustedExpirationDateStates", "(Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;)Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent;", "getInitialExpirationPageScrollingEvent", "(Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;Lkotlinx/collections/immutable/ImmutableList;)Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainEvent;", "dataState", "reduce", "(Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainDataState;)Lcom/robinhood/android/optionschain/sbschain/OptionSideBySideChainViewState;", "Lj$/time/Clock;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionSideBySideChainStateProvider implements StateProvider<OptionSideBySideChainDataState, OptionSideBySideChainViewState> {
    public static final int $stable = 8;
    private final Clock clock;

    public OptionSideBySideChainStateProvider(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.clock = clock;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public OptionSideBySideChainViewState reduce(OptionSideBySideChainDataState dataState) {
        String accountNumber;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        ImmutableList<OptionChainExpirationDateState> adjustedExpirationDateStates = getAdjustedExpirationDateStates(dataState);
        Account account = dataState.getAccount();
        OptionOrderIntentKey.FromOptionOrderBundle optionOrderIntentKey = null;
        String accountNumber2 = account != null ? account.getAccountNumber() : null;
        Account account2 = dataState.getAccount();
        if (account2 != null && (accountNumber = account2.getAccountNumber()) != null) {
            optionOrderIntentKey = OptionSideBySideChainStateProvider2.getOptionOrderIntentKey(accountNumber, dataState.getSelectedLegs(), dataState.getLaunchMode(), dataState.getDefaultPricingSettingOverride());
        }
        return new OptionSideBySideChainViewState(accountNumber2, optionOrderIntentKey, dataState.getCurrentPage(), OptionDefaultPricingState.INSTANCE.from(dataState.getDefaultPricingSettingServerValue(), dataState.getDefaultPricingSettingOverride(), dataState.getShouldIgnoreDefaultPricing()), dataState.getLaunchMode(), adjustedExpirationDateStates, extensions2.toImmutableList(dataState.getSelectedLegs()), dataState.getSelloutSnackbarDismissedOrElapsed(), dataState.getCallPutSwitcherState(), !dataState.getSelectedLegs().isEmpty(), dataState.isEtfSupported(), dataState.getSupportMultileg(), dataState.getTooltipEligibility(), dataState.getTooltipState(), getTopTooltipBannerType(dataState), dataState.getNuxMode(), dataState.isNuxSearchDismissed(), getInitialExpirationPageScrollingEvent(dataState, adjustedExpirationDateStates), isOnTodayTab(this.clock, dataState.getCurrentPage(), adjustedExpirationDateStates), dataState.isSelloutSnackbarDismissalExperimentEnabled(), dataState.getInSelloutImprovementExperiment(), dataState.getInSbsNuxRevampExperiment(), dataState.getEduFooterAnimationState(), dataState.getEduFooterAnimateDismissed(), dataState.getLottieNuxAnimationSeen(), dataState.isMemberPdtRevampV1());
    }

    private final OptionChainTooltipBanner3 getTopTooltipBannerType(OptionSideBySideChainDataState ds) {
        boolean z = !ds.getHasSeenTopTooltipBannerInThisSession() && ds.getLaunchMode().hasFeature(OptionChainLaunchMode.Feature.SIMULATED_RETURN_PRE_TRADE_DEEPLINK) && (!ds.getLaunchMode().hasFeature(OptionChainLaunchMode.Feature.ONBOARDING_SEARCH_POPUP) || ds.isNuxSearchDismissed());
        if (ds.getNuxMode() == OptionSideBySideChainDataState4.SBS_NUX_REVAMP) {
            return null;
        }
        if (z && ds.getSupportMultileg()) {
            return OptionChainTooltipBanner3.TAP_TO_SIMULATE;
        }
        if (z && !ds.getSupportMultileg()) {
            return OptionChainTooltipBanner3.LONG_PRESS;
        }
        if (ds.getHasSeenSimulatedReturnLongPressBanner() || ds.getSupportMultileg()) {
            return null;
        }
        return OptionChainTooltipBanner3.LONG_PRESS;
    }

    private final boolean isOnTodayTab(Clock clock, Integer currentTabIndex, ImmutableList<OptionChainExpirationDateState> adjustedExpirationDateStates) {
        OptionChainExpirationDateState optionChainExpirationDateState;
        LocalDate expirationDate;
        if (currentTabIndex != null && (optionChainExpirationDateState = (OptionChainExpirationDateState) CollectionsKt.getOrNull(adjustedExpirationDateStates, currentTabIndex.intValue())) != null && (expirationDate = optionChainExpirationDateState.getExpirationDate()) != null) {
            LocalDate localDateNow = LocalDate.now(clock);
            Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
            if (expirationDate.until(localDateNow, ChronoUnit.DAYS) == 0) {
                return true;
            }
        }
        return false;
    }

    private final ImmutableList<OptionChainExpirationDateState> getAdjustedExpirationDateStates(OptionSideBySideChainDataState ds) {
        List<OptionChainExpirationDateState> sortedExpirationDateStates = OptionChainExpirationDateState2.getSortedExpirationDateStates(ds.getUiOptionChains());
        if (ds.getCurrentOrNextMarketDates() != null && ds.getTradeOnExpirationState() != null && !(ds.getLaunchMode() instanceof OptionChainLaunchMode.Normal) && !(ds.getLaunchMode() instanceof OptionChainLaunchMode.SideBySideChainOnboardingFirstStep) && !(ds.getLaunchMode() instanceof OptionChainLaunchMode.SideBySideChainOnboardingSecondStep)) {
            sortedExpirationDateStates = OptionChainExpirationDateState2.adjust(sortedExpirationDateStates, ds.getTradeOnExpirationState(), ds.getCurrentOrNextMarketDates());
        }
        return extensions2.toImmutableList(CollectionsKt.toSortedSet(CollectionsKt.plus((Collection) sortedExpirationDateStates, (Iterable) ds.getExistingPositionExpirationDateStates())));
    }

    private final OptionSideBySideChainEvent getInitialExpirationPageScrollingEvent(OptionSideBySideChainDataState ds, ImmutableList<OptionChainExpirationDateState> adjustedExpirationDateStates) {
        OptionChainExpirationDateState targetExpirationDate;
        OptionChainExpirationDateState optionChainExpirationDateState;
        OptionChainExpirationDateState next;
        OptionSettings.TradingOnExpirationState tradeOnExpirationState;
        int i;
        boolean zHasFeature = ds.getLaunchMode().hasFeature(OptionChainLaunchMode.Feature.SIMULATED_RETURN_PRE_TRADE_DEEPLINK);
        OptionSideBySideChainDataState4 nuxMode = ds.getNuxMode();
        Boolean boolValueOf = nuxMode != null ? Boolean.valueOf(nuxMode.getInNuxMode()) : null;
        int i2 = 0;
        boolean z = true;
        if (!zHasFeature && !Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
            if (boolValueOf == null) {
                return null;
            }
            z = false;
        }
        if (ds.getTargetExpirationDate() != null) {
            targetExpirationDate = ds.getTargetExpirationDate();
        } else {
            if (!ds.getTargetLegs().isEmpty()) {
                Iterator<UiOptionStrategyLegDisplay> it = ds.getTargetLegs().iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                LocalDate expirationDate = it.next().getExpirationDate();
                while (it.hasNext()) {
                    LocalDate expirationDate2 = it.next().getExpirationDate();
                    if (expirationDate.compareTo(expirationDate2) > 0) {
                        expirationDate = expirationDate2;
                    }
                }
                ImmutableList<UiOptionStrategyLegDisplay> targetLegs = ds.getTargetLegs();
                ArrayList arrayList = new ArrayList();
                for (UiOptionStrategyLegDisplay uiOptionStrategyLegDisplay : targetLegs) {
                    if (Intrinsics.areEqual(uiOptionStrategyLegDisplay.getExpirationDate(), expirationDate)) {
                        arrayList.add(uiOptionStrategyLegDisplay);
                    }
                }
                ImmutableList immutableList = extensions2.toImmutableList(arrayList);
                if (adjustedExpirationDateStates != null) {
                    Iterator<OptionChainExpirationDateState> it2 = adjustedExpirationDateStates.iterator();
                    loop4: while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it2.next();
                        OptionChainExpirationDateState optionChainExpirationDateState2 = next;
                        if (Intrinsics.areEqual(optionChainExpirationDateState2.getExpirationDate(), expirationDate) && (immutableList == null || !immutableList.isEmpty())) {
                            Iterator<E> it3 = immutableList.iterator();
                            while (it3.hasNext()) {
                                if (Intrinsics.areEqual(((UiOptionStrategyLegDisplay) it3.next()).getOptionInstrument().getOptionChainId(), optionChainExpirationDateState2.getUiOptionChain().getOptionChain().getId())) {
                                    break loop4;
                                }
                            }
                        }
                    }
                    optionChainExpirationDateState = next;
                } else {
                    optionChainExpirationDateState = null;
                }
                if (optionChainExpirationDateState != null) {
                    return new OptionSideBySideChainEvent.ScrollToLegs(optionChainExpirationDateState, immutableList);
                }
            }
            targetExpirationDate = null;
        }
        if (targetExpirationDate != null && !z) {
            return new OptionSideBySideChainEvent.ScrollToExpirationPage(targetExpirationDate);
        }
        OptionCurrentOrNextMarketDates currentOrNextMarketDates = ds.getCurrentOrNextMarketDates();
        if (currentOrNextMarketDates != null && (tradeOnExpirationState = ds.getTradeOnExpirationState()) != null) {
            boolean zIsEnabled = tradeOnExpirationState.isEnabled();
            Instant instantNow = Instant.now(this.clock);
            if (adjustedExpirationDateStates != null && !adjustedExpirationDateStates.isEmpty()) {
                Iterator<OptionChainExpirationDateState> it4 = adjustedExpirationDateStates.iterator();
                int i3 = 0;
                while (true) {
                    i = -1;
                    if (!it4.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    OptionChainExpirationDateState next2 = it4.next();
                    UiOptionChain uiOptionChain = next2.getUiOptionChain();
                    LocalDate expirationDate3 = next2.getExpirationDate();
                    Intrinsics.checkNotNull(instantNow);
                    LocalDate date = currentOrNextMarketDates.getDate(OptionMarketHoursParam2.getOptionMarketHoursParam(uiOptionChain, expirationDate3, Instants.toLocalDate(instantNow, ZoneIds.INSTANCE.getNEW_YORK())));
                    if (!zIsEnabled) {
                        if (next2.getExpirationDate().compareTo((ChronoLocalDate) date) > 0) {
                            break;
                        }
                        i3++;
                    } else if (!z) {
                        if (next2.getExpirationDate().compareTo((ChronoLocalDate) date) >= 0) {
                            break;
                        }
                        i3++;
                    } else {
                        if (ds.getEarliestSelloutTime() == null) {
                            return null;
                        }
                        if (instantNow.compareTo(ds.getEarliestSelloutTime()) < 0) {
                            if (next2.getExpirationDate().compareTo((ChronoLocalDate) date) >= 0) {
                                break;
                            }
                            i3++;
                        } else if (ds.isInOptionRegularTradingOpenHours()) {
                            if (next2.getExpirationDate().compareTo((ChronoLocalDate) date) > 0) {
                                break;
                            }
                            i3++;
                        } else {
                            if (next2.getExpirationDate().compareTo((ChronoLocalDate) date) >= 0) {
                                break;
                            }
                            i3++;
                        }
                    }
                }
                if (i3 == -1) {
                    if (targetExpirationDate == null) {
                        targetExpirationDate = (OptionChainExpirationDateState) CollectionsKt.firstOrNull((List) adjustedExpirationDateStates);
                    }
                } else if (targetExpirationDate == null) {
                    targetExpirationDate = adjustedExpirationDateStates.get(i3);
                } else {
                    Iterator<OptionChainExpirationDateState> it5 = adjustedExpirationDateStates.iterator();
                    while (true) {
                        if (!it5.hasNext()) {
                            break;
                        }
                        if (Intrinsics.areEqual(it5.next().getKey(), targetExpirationDate.getKey())) {
                            i = i2;
                            break;
                        }
                        i2++;
                    }
                    targetExpirationDate = adjustedExpirationDateStates.get(Math.max(i, i3));
                }
                if (targetExpirationDate != null) {
                    if (ds.getTargetStrikePrice() == null) {
                        return new OptionSideBySideChainEvent.ScrollToExpirationPage(targetExpirationDate);
                    }
                    return new OptionSideBySideChainEvent.ScrollToStrike(targetExpirationDate, ds.getTargetStrikePrice());
                }
            }
            return null;
        }
        return null;
    }
}
