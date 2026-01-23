package com.robinhood.android.investmentstracker;

import accio.service.p003v1.PurposeDto;
import accio.service.p003v1.SpanDto;
import android.app.Activity;
import androidx.view.result.ActivityResultLauncher;
import bff_money_movement.service.p019v1.AgreementStatusDto;
import bff_money_movement.service.p019v1.BffMoneyMovementService;
import bff_money_movement.service.p019v1.C3328x929dba61;
import bff_money_movement.service.p019v1.GetAgreementRequestDto;
import bff_money_movement.service.p019v1.GetAgreementResponseDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerActionDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerAgreementTypeDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerCategorySectionDetailsDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerCategorySectionRowDetailsDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentAllocationsBarDetailsDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentButtonDetailsDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentCategoryPercentageCellDetailsDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentMetadataDetailsDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentPerformanceChartDetailsDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentTypeDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentUpsellCardDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerComponentUpsellDetailsDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerGetAgreementResponseDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerGetPageResponseDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerManageExternalAccountsDetailsDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerOnboardingCarouselItemDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerOnboardingDataDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerOnboardingFirstPageDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerPageTypeDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerScrubPointDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerScrubPointMetadataDto;
import bff_money_movement.service.p019v1.SignAgreementRequestDto;
import com.plaid.internal.EnumC7081g;
import com.plaid.link.PlaidHandler;
import com.plaid.link.result.LinkResult;
import com.robinhood.android.banking.experiments.InvestmentTrackerGradientShutOffFlag;
import com.robinhood.android.charts.models.p080db.SpanOption;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.dagger.ApplicationPackageInfoModule2;
import com.robinhood.android.investmentstracker.composables.InvestmentsTrackerEvent;
import com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions;
import com.robinhood.android.investmentstracker.linking.models.PlaidLinkResultData;
import com.robinhood.android.investmentstracker.security.SecurityFilter;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerAgreementViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerAllocationsBarViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerButtonViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerCategoryPercentageViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerCategorySectionViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponentType;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerDisclosureMarkdownViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerMetadataViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerPerformanceChartViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerPerformanceHeaderViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerSwitcherAllocationsData;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerSwitcherPerformanceData;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerSwitcherViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerUpsellCardViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerUpsellViewModel;
import com.robinhood.android.investmentstracker.viewmodels.ManageExternalAccountsViewModel;
import com.robinhood.android.investmentstracker.viewmodels.OnboardingViewModel;
import com.robinhood.android.lib.p166fx.provider.DisplayCurrencyExtensions;
import com.robinhood.android.lib.p166fx.provider.DisplayCurrencySelectionPrefs;
import com.robinhood.android.models.accountcenter.api.ApiAccountCenterPage;
import com.robinhood.android.plaidconnect.api.PlaidConnectApi;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.AccountCenterStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.IntPreference;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.shared.i18n.models.currency.DisplayCurrency;
import com.robinhood.store.achrelationship.IavStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.logging.CrashReporter;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: InvestmentsTrackerDuxo.kt */
@Metadata(m3635d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 ^2\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003:\u0001^Bi\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010,\u001a\u00020-H\u0016J\u0012\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u000100H\u0002J\b\u00101\u001a\u00020-H\u0002J\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020403*\u00020\u00022\u0006\u00105\u001a\u00020+H\u0002J \u00106\u001a\u00020-2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u00108\u001a\u0004\u0018\u000109H\u0002J\u001c\u0010:\u001a\u00020-2\b\b\u0002\u0010;\u001a\u00020+2\b\b\u0002\u0010<\u001a\u00020+H\u0002J\u0018\u0010=\u001a\u00020-2\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AJ\u0016\u0010B\u001a\u00020-2\u0006\u0010>\u001a\u00020C2\u0006\u0010@\u001a\u00020AJ\u0006\u0010D\u001a\u00020-J\u0006\u0010E\u001a\u00020-J6\u0010F\u001a\u00020-2'\u0010G\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020I\u0012\u0006\u0012\u0004\u0018\u00010A0H¢\u0006\u0002\bJH\u0016¢\u0006\u0002\u0010KJ\b\u0010L\u001a\u00020-H\u0016J\u0010\u0010M\u001a\u00020-2\b\u0010N\u001a\u0004\u0018\u00010OJ\u0006\u0010P\u001a\u00020-J\u0006\u0010Q\u001a\u00020-J\u001e\u0010R\u001a\u00020-2\b\b\u0002\u0010S\u001a\u00020+2\n\b\u0002\u0010T\u001a\u0004\u0018\u00010\u0012H\u0002J\u0006\u0010U\u001a\u00020-J\u0006\u0010V\u001a\u00020-J\u0006\u0010W\u001a\u00020-J\u000e\u0010X\u001a\u00020-2\u0006\u0010Y\u001a\u00020ZJ\u0006\u0010[\u001a\u00020-J\u0006\u0010\\\u001a\u00020-J\u0006\u0010]\u001a\u00020-R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0014\u0010\u0015\u001a\u00020\u0016X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010\u0017\u001a\u00020\u0018X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020+0*X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006_"}, m3636d2 = {"Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDuxo;", "Lcom/robinhood/android/investmentstracker/features/plaid/PlaidEnabledDuxo;", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDataState;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerViewState;", "Lcom/robinhood/android/investmentstracker/composables/InvestmentsTrackerEvent;", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "accountTabCurrencyPref", "Lcom/robinhood/prefs/IntPreference;", "onboardingSeen", "Lcom/robinhood/prefs/BooleanPreference;", "upsellCardClosed", "accountCenterStore", "Lcom/robinhood/librobinhood/data/store/AccountCenterStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "packageName", "", "plaidConnectApi", "Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;", "iavStore", "Lcom/robinhood/librobinhood/data/store/bonfire/cashier/IavStore;", "achRelationshipStore", "Lcom/robinhood/store/achrelationship/IavStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "<init>", "(Lbff_money_movement/service/v1/BffMoneyMovementService;Lcom/robinhood/prefs/IntPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/librobinhood/data/store/AccountCenterStore;Lcom/robinhood/android/udf/DuxoBundle;Ljava/lang/String;Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;Lcom/robinhood/librobinhood/data/store/bonfire/cashier/IavStore;Lcom/robinhood/store/achrelationship/IavStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "getBffMoneyMovementService", "()Lbff_money_movement/service/v1/BffMoneyMovementService;", "getPackageName", "()Ljava/lang/String;", "getPlaidConnectApi", "()Lcom/robinhood/android/plaidconnect/api/PlaidConnectApi;", "getIavStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/cashier/IavStore;", "getAchRelationshipStore", "()Lcom/robinhood/store/achrelationship/IavStore;", "updateCenter", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerUpdateCenter;", "categoryMapping", "", "", "onCreate", "", "setupInvestmentsTrackerOnboardingExperience", "onboardingData", "Lbff_money_movement/service/v1/InvestmentsTrackerOnboardingDataDto;", "setupFullInvestmentsTrackerExperience", "getViewComponentList", "", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponent;", "firstDraw", "updateHeader", "amountOverride", "metadataOverride", "Lbff_money_movement/service/v1/InvestmentsTrackerScrubPointMetadataDto;", "redraw", "accountWasClicked", "poppingScreen", "handleNativeAction", "action", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerNativeAction;", "value", "", "handleAction", "Lbff_money_movement/service/v1/InvestmentsTrackerActionDto;", "transferClicked", "backSelected", "applyMutationOverride", "mutator", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function2;)V", "plaidFinishedCallback", "onScrub", "verticalLineInfo", "Lbff_money_movement/service/v1/InvestmentsTrackerScrubPointDto;", "finishedLink", "securityHeaderClicked", "startPlaidWithChecks", "useUpdateMode", "institutionId", "onboardingContinueClicked", "onboardingBottomSheetFinished", "closeAgreements", "agreetoAgreement", "response", "Lbff_money_movement/service/v1/InvestmentsTrackerGetAgreementResponseDto;", "infoClicked", "infoClosed", "exoPlayerLoaded", "Companion", "feature-investments-tracker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InvestmentsTrackerDuxo extends BaseDuxo3<InvestmentsTrackerDataState, InvestmentsTrackerViewState, InvestmentsTrackerEvent> implements DuxoExtensions<InvestmentsTrackerDataState> {
    private static final String ALLOCATION_SWITCHER_ID = "allocation-switcher";
    private final AccountCenterStore accountCenterStore;
    private final IntPreference accountTabCurrencyPref;
    private final IavStore achRelationshipStore;
    private final BffMoneyMovementService bffMoneyMovementService;
    private final Map<String, Boolean> categoryMapping;
    private final ExperimentsStore experimentsStore;
    private final com.robinhood.librobinhood.data.store.bonfire.cashier.IavStore iavStore;
    private final BooleanPreference onboardingSeen;
    private final String packageName;
    private final PlaidConnectApi plaidConnectApi;
    private final InvestmentsTrackerUpdateCenter updateCenter;
    private final BooleanPreference upsellCardClosed;
    public static final int $stable = 8;

    /* compiled from: InvestmentsTrackerDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[InvestmentsTrackerComponentTypeDto.values().length];
            try {
                iArr[InvestmentsTrackerComponentTypeDto.BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InvestmentsTrackerComponentTypeDto.UPSELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InvestmentsTrackerComponentTypeDto.CATEGORY_SECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InvestmentsTrackerComponentTypeDto.MANAGE_EXTERNAL_ACCOUNTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InvestmentsTrackerComponentTypeDto.PERFORMANCE_CHART.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[InvestmentsTrackerComponentTypeDto.METADATA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[InvestmentsTrackerComponentTypeDto.CATEGORY_PERCENTAGE_CELL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[InvestmentsTrackerComponentTypeDto.ALLOCATIONS_BAR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[InvestmentsTrackerComponentTypeDto.UPSELL_CARD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InvestmentsTrackerNativeAction.values().length];
            try {
                iArr2[InvestmentsTrackerNativeAction.CATEGORY_CLICKED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[InvestmentsTrackerNativeAction.CONNECT_ACCOUNT_CLICKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[InvestmentsTrackerNativeAction.MANAGE_ACCOUNTS_CLICKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[InvestmentsTrackerNativeAction.SPAN_SELECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[InvestmentsTrackerNativeAction.ALLOCATION_BAR_SELECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[InvestmentsTrackerNativeAction.CATEGORY_PERCENTAGE_ITEM_CLICKED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[InvestmentsTrackerNativeAction.SWITCHER_SELECTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[InvestmentsTrackerNativeAction.METADATA_SELECTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[InvestmentsTrackerNativeAction.METADATA_RECONNECT_SELECTED.ordinal()] = 9;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[InvestmentsTrackerNativeAction.ACCOUNT_CELL_RECONNECT_SELECTED.ordinal()] = 10;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[InvestmentsTrackerNativeAction.ALLOCATION_BAR_TOP_SELECTED.ordinal()] = 11;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr2[InvestmentsTrackerNativeAction.UPSELL_CLOSE_CARD_CLICKED.ordinal()] = 12;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[InvestmentsTrackerActionDto.values().length];
            try {
                iArr3[InvestmentsTrackerActionDto.TRANSFER_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr3[InvestmentsTrackerActionDto.ACCOUNT_CLICKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr3[InvestmentsTrackerActionDto.CONNECT_ROW_CLICKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr3[InvestmentsTrackerActionDto.CONNECT_ROW_CLICKED_BANK_ACCOUNT.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    @Override // com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions
    public void handlePlaidCallback(LinkResult linkResult, ActivityErrorHandler activityErrorHandler, boolean z, String str) {
        DuxoExtensions.DefaultImpls.handlePlaidCallback(this, linkResult, activityErrorHandler, z, str);
    }

    @Override // com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions
    public void linkUsingOldPlaidFlow(PlaidLinkResultData plaidLinkResultData, Function0<Unit> function0) {
        DuxoExtensions.DefaultImpls.linkUsingOldPlaidFlow(this, plaidLinkResultData, function0);
    }

    @Override // com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions
    public void startOldPlaid(Activity activity, ActivityResultLauncher<PlaidHandler> activityResultLauncher) {
        DuxoExtensions.DefaultImpls.startOldPlaid(this, activity, activityResultLauncher);
    }

    @Override // com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions
    public void startPlaid(Activity activity, ActivityResultLauncher<PlaidHandler> activityResultLauncher, PurposeDto purposeDto, String str) {
        DuxoExtensions.DefaultImpls.startPlaid(this, activity, activityResultLauncher, purposeDto, str);
    }

    @Override // com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions
    public BffMoneyMovementService getBffMoneyMovementService() {
        return this.bffMoneyMovementService;
    }

    @Override // com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions
    public String getPackageName() {
        return this.packageName;
    }

    @Override // com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions
    public PlaidConnectApi getPlaidConnectApi() {
        return this.plaidConnectApi;
    }

    @Override // com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions
    public com.robinhood.librobinhood.data.store.bonfire.cashier.IavStore getIavStore() {
        return this.iavStore;
    }

    @Override // com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions
    public IavStore getAchRelationshipStore() {
        return this.achRelationshipStore;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerDuxo(BffMoneyMovementService bffMoneyMovementService, @DisplayCurrencySelectionPrefs IntPreference accountTabCurrencyPref, @InvestmentsTrackerPreferences BooleanPreference onboardingSeen, @InvestmentsTrackerPreferences2 BooleanPreference upsellCardClosed, AccountCenterStore accountCenterStore, DuxoBundle duxoBundle, @ApplicationPackageInfoModule2 String packageName, PlaidConnectApi plaidConnectApi, com.robinhood.librobinhood.data.store.bonfire.cashier.IavStore iavStore, IavStore achRelationshipStore, ExperimentsStore experimentsStore) {
        super(new InvestmentsTrackerDataState(null, false, (SpanOption) CollectionsKt.first((List) InvestmentsTrackerUtilityFunctions.getSpanOptionList(null, false)), false, null, null, null, null, true, null, null, null, null, null, false, new ArrayDeque(CollectionsKt.listOf(new CurrentPageInformation(InvestmentsTrackerPageTypeDto.HOME, ""))), null, null, false, false, null, null, new SecurityFilter(true), null, null, null, null, false, null, false, 1069514296, null), new InvestmentsTrackerStateProvider(), duxoBundle);
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(accountTabCurrencyPref, "accountTabCurrencyPref");
        Intrinsics.checkNotNullParameter(onboardingSeen, "onboardingSeen");
        Intrinsics.checkNotNullParameter(upsellCardClosed, "upsellCardClosed");
        Intrinsics.checkNotNullParameter(accountCenterStore, "accountCenterStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(plaidConnectApi, "plaidConnectApi");
        Intrinsics.checkNotNullParameter(iavStore, "iavStore");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.accountTabCurrencyPref = accountTabCurrencyPref;
        this.onboardingSeen = onboardingSeen;
        this.upsellCardClosed = upsellCardClosed;
        this.accountCenterStore = accountCenterStore;
        this.packageName = packageName;
        this.plaidConnectApi = plaidConnectApi;
        this.iavStore = iavStore;
        this.achRelationshipStore = achRelationshipStore;
        this.experimentsStore = experimentsStore;
        this.updateCenter = new InvestmentsTrackerUpdateCenter(getBffMoneyMovementService());
        this.categoryMapping = new LinkedHashMap();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C194531(null), 3, null);
    }

    /* compiled from: InvestmentsTrackerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$onCreate$1", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {106}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$onCreate$1 */
    static final class C194531 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C194531(Continuation<? super C194531> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestmentsTrackerDuxo.this.new C194531(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C194531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InvestmentsTrackerUpdateCenter investmentsTrackerUpdateCenter = InvestmentsTrackerDuxo.this.updateCenter;
                this.label = 1;
                if (investmentsTrackerUpdateCenter.refresh(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            InvestmentsTrackerGetPageResponseDto pageResponseForType = InvestmentsTrackerDuxo.this.updateCenter.getPageResponseForType(InvestmentsTrackerPageTypeDto.HOME);
            if (InvestmentsTrackerDuxo.this.onboardingSeen.get() || pageResponseForType == null || pageResponseForType.getOnboarding_data() == null) {
                InvestmentsTrackerDuxo.this.setupFullInvestmentsTrackerExperience();
            } else {
                InvestmentsTrackerDuxo.this.setupInvestmentsTrackerOnboardingExperience(pageResponseForType.getOnboarding_data());
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupInvestmentsTrackerOnboardingExperience(InvestmentsTrackerOnboardingDataDto onboardingData) {
        List<InvestmentsTrackerOnboardingCarouselItemDto> carousel_items;
        InvestmentsTrackerOnboardingCarouselItemDto investmentsTrackerOnboardingCarouselItemDto;
        List<InvestmentsTrackerOnboardingCarouselItemDto> carousel_items2;
        InvestmentsTrackerOnboardingCarouselItemDto investmentsTrackerOnboardingCarouselItemDto2;
        if (onboardingData != null) {
            InvestmentsTrackerOnboardingFirstPageDto first_page = onboardingData.getFirst_page();
            String image_url = (first_page == null || (carousel_items2 = first_page.getCarousel_items()) == null || (investmentsTrackerOnboardingCarouselItemDto2 = (InvestmentsTrackerOnboardingCarouselItemDto) CollectionsKt.first((List) carousel_items2)) == null) ? null : investmentsTrackerOnboardingCarouselItemDto2.getImage_url();
            InvestmentsTrackerOnboardingFirstPageDto first_page2 = onboardingData.getFirst_page();
            String image_url2 = (first_page2 == null || (carousel_items = first_page2.getCarousel_items()) == null || (investmentsTrackerOnboardingCarouselItemDto = (InvestmentsTrackerOnboardingCarouselItemDto) CollectionsKt.last((List) carousel_items)) == null) ? null : investmentsTrackerOnboardingCarouselItemDto.getImage_url();
            if (image_url != null && image_url2 != null) {
                submit(new InvestmentsTrackerEvent.SetupExoPlayer(image_url, image_url2));
            }
            applyMutation(new C19461xd6438cd0(onboardingData, null));
        }
    }

    /* compiled from: InvestmentsTrackerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$setupFullInvestmentsTrackerExperience$1", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$setupFullInvestmentsTrackerExperience$1 */
    static final class C194581 extends ContinuationImpl7 implements Function2<InvestmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C194581(Continuation<? super C194581> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C194581 c194581 = InvestmentsTrackerDuxo.this.new C194581(continuation);
            c194581.L$0 = obj;
            return c194581;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestmentsTrackerDataState investmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState> continuation) {
            return ((C194581) create(investmentsTrackerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InvestmentsTrackerDataState investmentsTrackerDataState = (InvestmentsTrackerDataState) this.L$0;
                ResultKt.throwOnFailure(obj);
                return investmentsTrackerDataState;
            }
            ResultKt.throwOnFailure(obj);
            InvestmentsTrackerDataState investmentsTrackerDataState2 = (InvestmentsTrackerDataState) this.L$0;
            InvestmentsTrackerUpdateCenter investmentsTrackerUpdateCenter = InvestmentsTrackerDuxo.this.updateCenter;
            this.L$0 = investmentsTrackerDataState2;
            this.label = 1;
            return investmentsTrackerUpdateCenter.refresh(this) == coroutine_suspended ? coroutine_suspended : investmentsTrackerDataState2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupFullInvestmentsTrackerExperience() {
        applyMutation(new C194581(null));
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{InvestmentTrackerGradientShutOffFlag.INSTANCE}, false, null, 4, null), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentsTrackerDuxo.setupFullInvestmentsTrackerExperience$lambda$1(this.f$0, ((Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentsTrackerDuxo.setupFullInvestmentsTrackerExperience$lambda$2((Throwable) obj);
            }
        }, null, null, 12, null);
        Observable<R> observableSwitchMap = DisplayCurrencyExtensions.displayCurrencyObservable(this.accountTabCurrencyPref).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo.setupFullInvestmentsTrackerExperience.4
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ApiAccountCenterPage> apply(DisplayCurrency it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return InvestmentsTrackerDuxo.this.accountCenterStore.backendPollAccountCenterPage(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentsTrackerDuxo.setupFullInvestmentsTrackerExperience$lambda$3(this.f$0, (ApiAccountCenterPage) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentsTrackerDuxo.setupFullInvestmentsTrackerExperience$lambda$4((Throwable) obj);
            }
        }, null, null, 12, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C194607(null), 3, null);
        redraw$default(this, false, false, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupFullInvestmentsTrackerExperience$lambda$1(InvestmentsTrackerDuxo investmentsTrackerDuxo, boolean z) {
        investmentsTrackerDuxo.applyMutation(new InvestmentsTrackerDuxo$setupFullInvestmentsTrackerExperience$2$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupFullInvestmentsTrackerExperience$lambda$2(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, it, false, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupFullInvestmentsTrackerExperience$lambda$3(InvestmentsTrackerDuxo investmentsTrackerDuxo, ApiAccountCenterPage apiAccountCenterPage) {
        investmentsTrackerDuxo.applyMutation(new InvestmentsTrackerDuxo$setupFullInvestmentsTrackerExperience$5$1(apiAccountCenterPage, null));
        redraw$default(investmentsTrackerDuxo, false, false, 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setupFullInvestmentsTrackerExperience$lambda$4(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, throwable, false, null, 6, null);
        return Unit.INSTANCE;
    }

    /* compiled from: InvestmentsTrackerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$setupFullInvestmentsTrackerExperience$7", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$setupFullInvestmentsTrackerExperience$7 */
    static final class C194607 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C194607(Continuation<? super C194607> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestmentsTrackerDuxo.this.new C194607(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C194607) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003d -> B:11:0x001e). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            long refreshDelay;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    InvestmentsTrackerUpdateCenter investmentsTrackerUpdateCenter = InvestmentsTrackerDuxo.this.updateCenter;
                    this.label = 2;
                    if (investmentsTrackerUpdateCenter.refresh(this) != coroutine_suspended) {
                        refreshDelay = InvestmentsTrackerDuxo.this.updateCenter.getRefreshDelay();
                        this.label = 1;
                        if (DelayKt.delay(refreshDelay, this) != coroutine_suspended) {
                            InvestmentsTrackerUpdateCenter investmentsTrackerUpdateCenter2 = InvestmentsTrackerDuxo.this.updateCenter;
                            this.label = 2;
                            if (investmentsTrackerUpdateCenter2.refresh(this) != coroutine_suspended) {
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            ResultKt.throwOnFailure(obj);
            refreshDelay = InvestmentsTrackerDuxo.this.updateCenter.getRefreshDelay();
            this.label = 1;
            if (DelayKt.delay(refreshDelay, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<InvestmentsTrackerComponent> getViewComponentList(InvestmentsTrackerDataState investmentsTrackerDataState, boolean z) {
        InvestmentsTrackerGetPageResponseDto pageResponseForType;
        List<InvestmentsTrackerComponentDto> components;
        String accountId;
        List<InvestmentsTrackerComponent> components2 = investmentsTrackerDataState.getComponents();
        if (components2 == null) {
            components2 = new ArrayList<>();
        }
        if (investmentsTrackerDataState.getActiveAllocationBarId() == null) {
            components2.removeIf(new Predicate() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo.getViewComponentList.1
                @Override // java.util.function.Predicate
                public final boolean test(InvestmentsTrackerComponent it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getType() == InvestmentsTrackerComponentType.CATEGORY_PERCENTAGE;
                }
            });
        }
        if (investmentsTrackerDataState.getCurrentPageType() == InvestmentsTrackerPageTypeDto.ACCOUNT) {
            CurrentPageInformation currentPageInformationLastOrNull = investmentsTrackerDataState.getCurrentPageInformationStack().lastOrNull();
            pageResponseForType = (currentPageInformationLastOrNull == null || (accountId = currentPageInformationLastOrNull.getAccountId()) == null) ? null : this.updateCenter.getAccountResponseForId(accountId);
        } else {
            pageResponseForType = this.updateCenter.getPageResponseForType(investmentsTrackerDataState.getCurrentPageType());
        }
        if (pageResponseForType != null && (components = pageResponseForType.getComponents()) != null) {
            int i = 0;
            for (Object obj : components) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                InvestmentsTrackerComponentDto investmentsTrackerComponentDto = (InvestmentsTrackerComponentDto) obj;
                switch (WhenMappings.$EnumSwitchMapping$0[investmentsTrackerComponentDto.getType().ordinal()]) {
                    case 1:
                        InvestmentsTrackerComponentButtonDetailsDto button_details = investmentsTrackerComponentDto.getButton_details();
                        if (button_details != null) {
                            InvestmentsTrackerComponentType investmentsTrackerComponentType = InvestmentsTrackerComponentType.BUTTON;
                            InvestmentsTrackerUtilityFunctions.updateModelForTypeAndDraw$default(components2, z, new InvestmentsTrackerButtonViewModel(investmentsTrackerComponentType, button_details, investmentsTrackerComponentType + "-" + button_details.getText(), investmentsTrackerDataState.getSecurityFilter()), false, 4, null);
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        InvestmentsTrackerComponentUpsellDetailsDto upsell_details = investmentsTrackerComponentDto.getUpsell_details();
                        if (upsell_details != null) {
                            InvestmentsTrackerComponentType investmentsTrackerComponentType2 = InvestmentsTrackerComponentType.UPSELL;
                            InvestmentsTrackerUtilityFunctions.updateModelForTypeAndDraw$default(components2, z, new InvestmentsTrackerUpsellViewModel(investmentsTrackerComponentType2, upsell_details, investmentsTrackerComponentType2 + "-" + upsell_details.getHeader_text(), investmentsTrackerDataState.getSecurityFilter()), false, 4, null);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        InvestmentsTrackerCategorySectionDetailsDto category_section_details = investmentsTrackerComponentDto.getCategory_section_details();
                        if (category_section_details != null) {
                            InvestmentsTrackerComponentType investmentsTrackerComponentType3 = InvestmentsTrackerComponentType.CATEGORY_SECTION;
                            String str = investmentsTrackerComponentType3 + "-" + category_section_details.getHeader_text();
                            Boolean bool = this.categoryMapping.get(str);
                            InvestmentsTrackerUtilityFunctions.updateModelForTypeAndDraw$default(components2, z, new InvestmentsTrackerCategorySectionViewModel(investmentsTrackerComponentType3, bool != null ? bool.booleanValue() : false, category_section_details, str, investmentsTrackerDataState.getSecurityFilter()), false, 4, null);
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        InvestmentsTrackerManageExternalAccountsDetailsDto manage_external_account_details = investmentsTrackerComponentDto.getManage_external_account_details();
                        if (manage_external_account_details != null) {
                            InvestmentsTrackerComponentType investmentsTrackerComponentType4 = InvestmentsTrackerComponentType.MANAGE_EXTERNAL_ACCOUNTS;
                            InvestmentsTrackerUtilityFunctions.updateModelForTypeAndDraw$default(components2, z, new ManageExternalAccountsViewModel(investmentsTrackerComponentType4, manage_external_account_details, investmentsTrackerComponentType4 + "-" + manage_external_account_details.getHeader(), investmentsTrackerDataState.getSecurityFilter()), false, 4, null);
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        List<InvestmentsTrackerComponent> list = components2;
                        if (investmentsTrackerDataState.getLoadingNewSpan()) {
                            InvestmentsTrackerComponentType investmentsTrackerComponentType5 = InvestmentsTrackerComponentType.PERFORMANCE_CHART;
                            components2 = list;
                            InvestmentsTrackerUtilityFunctions.updateModelForTypeAndDraw$default(components2, z, new InvestmentsTrackerPerformanceChartViewModel(investmentsTrackerComponentType5, null, investmentsTrackerDataState.getSpanOption(), InvestmentsTrackerUtilityFunctions.getSpanOptionList(investmentsTrackerDataState.getSpanOption(), investmentsTrackerDataState.getLoadingNewSpan()), investmentsTrackerDataState.getSubtitleOverride(), true, investmentsTrackerDataState.getCanUseGradient(), String.valueOf(investmentsTrackerComponentType5), z, investmentsTrackerDataState.getSecurityFilter()), false, 4, null);
                            break;
                        } else {
                            InvestmentsTrackerComponentPerformanceChartDetailsDto performance_chart_details = investmentsTrackerComponentDto.getPerformance_chart_details();
                            if (performance_chart_details != null) {
                                InvestmentsTrackerScrubPointMetadataDto metadata = ((InvestmentsTrackerScrubPointDto) CollectionsKt.last((List) performance_chart_details.getScrub_points())).getMetadata();
                                Number numberValueOf = metadata != null ? Double.valueOf(metadata.getPercent()) : 0;
                                InvestmentsTrackerComponentType investmentsTrackerComponentType6 = InvestmentsTrackerComponentType.PERFORMANCE_CHART;
                                SpanOption spanOption = investmentsTrackerDataState.getSpanOption();
                                ImmutableList3<SpanOption> spanOptionList = InvestmentsTrackerUtilityFunctions.getSpanOptionList(investmentsTrackerDataState.getSpanOption(), investmentsTrackerDataState.getLoadingNewSpan());
                                String subtitleOverride = investmentsTrackerDataState.getSubtitleOverride();
                                String strValueOf = String.valueOf(investmentsTrackerComponentType6);
                                boolean z2 = numberValueOf.floatValue() >= 0.0f;
                                components2 = list;
                                InvestmentsTrackerUtilityFunctions.updateModelForTypeAndDraw$default(components2, z, new InvestmentsTrackerPerformanceChartViewModel(investmentsTrackerComponentType6, performance_chart_details, spanOption, spanOptionList, subtitleOverride, z2, investmentsTrackerDataState.getCanUseGradient(), strValueOf, z, investmentsTrackerDataState.getSecurityFilter()), false, 4, null);
                                break;
                            } else {
                                components2 = list;
                                break;
                            }
                        }
                    case 6:
                        InvestmentsTrackerComponentMetadataDetailsDto metadata_details = investmentsTrackerComponentDto.getMetadata_details();
                        if (metadata_details != null) {
                            InvestmentsTrackerComponentType investmentsTrackerComponentType7 = InvestmentsTrackerComponentType.METADATA;
                            InvestmentsTrackerUtilityFunctions.updateModelForTypeAndDraw$default(components2, z, new InvestmentsTrackerMetadataViewModel(investmentsTrackerComponentType7, metadata_details, investmentsTrackerComponentType7 + "-" + metadata_details.getHeader(), investmentsTrackerDataState.getSecurityFilter()), false, 4, null);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        InvestmentsTrackerComponentCategoryPercentageCellDetailsDto category_percentage_cell_details = investmentsTrackerComponentDto.getCategory_percentage_cell_details();
                        if (category_percentage_cell_details == null) {
                            break;
                        } else if (investmentsTrackerDataState.getActiveAllocationBarId() != null && Intrinsics.areEqual(category_percentage_cell_details.getId(), investmentsTrackerDataState.getActiveAllocationBarId())) {
                            components2.removeIf(new Predicate() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$getViewComponentList$2$7$1
                                @Override // java.util.function.Predicate
                                public final boolean test(InvestmentsTrackerComponent it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    return it.getType() == InvestmentsTrackerComponentType.CATEGORY_PERCENTAGE;
                                }
                            });
                            InvestmentsTrackerComponentType investmentsTrackerComponentType8 = InvestmentsTrackerComponentType.CATEGORY_PERCENTAGE;
                            InvestmentsTrackerUtilityFunctions.updateModelForTypeAndDraw(components2, z, new InvestmentsTrackerCategoryPercentageViewModel(investmentsTrackerComponentType8, category_percentage_cell_details, true, false, investmentsTrackerComponentType8 + "-" + category_percentage_cell_details.getId(), investmentsTrackerDataState.getSecurityFilter(), 8, null), true);
                            break;
                        } else if (investmentsTrackerDataState.getActiveAllocationBarId() == null) {
                            InvestmentsTrackerComponentType investmentsTrackerComponentType9 = InvestmentsTrackerComponentType.CATEGORY_PERCENTAGE;
                            InvestmentsTrackerUtilityFunctions.updateModelForTypeAndDraw(components2, z, new InvestmentsTrackerCategoryPercentageViewModel(investmentsTrackerComponentType9, category_percentage_cell_details, false, false, investmentsTrackerComponentType9 + "-" + category_percentage_cell_details.getId(), investmentsTrackerDataState.getSecurityFilter(), 12, null), true);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case 8:
                        InvestmentsTrackerComponentAllocationsBarDetailsDto allocations_bar_details = investmentsTrackerComponentDto.getAllocations_bar_details();
                        if (allocations_bar_details != null) {
                            applyMutation(new InvestmentsTrackerDuxo$getViewComponentList$2$8$1(allocations_bar_details, null));
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        final InvestmentsTrackerComponentUpsellCardDto upsell_card_details = investmentsTrackerComponentDto.getUpsell_card_details();
                        if (upsell_card_details == null) {
                            break;
                        } else if (!this.upsellCardClosed.get()) {
                            InvestmentsTrackerComponentType investmentsTrackerComponentType10 = InvestmentsTrackerComponentType.UPSELL_CARD;
                            InvestmentsTrackerUtilityFunctions.updateModelForTypeAndDraw$default(components2, z, new InvestmentsTrackerUpsellCardViewModel(upsell_card_details, investmentsTrackerComponentType10, investmentsTrackerComponentType10 + "-" + upsell_card_details.getLink_text(), investmentsTrackerDataState.getSecurityFilter()), false, 4, null);
                            break;
                        } else {
                            components2.removeIf(new Predicate() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$getViewComponentList$2$9$1
                                @Override // java.util.function.Predicate
                                public final boolean test(InvestmentsTrackerComponent it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    return Intrinsics.areEqual(it.getId(), InvestmentsTrackerComponentType.UPSELL_CARD + "-" + upsell_card_details.getLink_text());
                                }
                            });
                            break;
                        }
                }
                i = i2;
            }
        }
        String disclosureMarkdown = investmentsTrackerDataState.getDisclosureMarkdown();
        if (disclosureMarkdown != null) {
            InvestmentsTrackerUtilityFunctions.updateModelForTypeAndDraw$default(components2, z, new InvestmentsTrackerDisclosureMarkdownViewModel(InvestmentsTrackerComponentType.DISCLOSURE_MARKDOWN, null, disclosureMarkdown, investmentsTrackerDataState.getSecurityFilter(), 2, null), false, 4, null);
        }
        return components2;
    }

    static /* synthetic */ void updateHeader$default(InvestmentsTrackerDuxo investmentsTrackerDuxo, String str, InvestmentsTrackerScrubPointMetadataDto investmentsTrackerScrubPointMetadataDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            investmentsTrackerScrubPointMetadataDto = null;
        }
        investmentsTrackerDuxo.updateHeader(str, investmentsTrackerScrubPointMetadataDto);
    }

    /* compiled from: InvestmentsTrackerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$updateHeader$1", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$updateHeader$1 */
    static final class C194631 extends ContinuationImpl7 implements Function2<InvestmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState>, Object> {
        final /* synthetic */ String $amountOverride;
        final /* synthetic */ InvestmentsTrackerScrubPointMetadataDto $metadataOverride;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: InvestmentsTrackerDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$updateHeader$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InvestmentsTrackerPageTypeDto.values().length];
                try {
                    iArr[InvestmentsTrackerPageTypeDto.HOME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InvestmentsTrackerPageTypeDto.ALLOCATION_VIEW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InvestmentsTrackerPageTypeDto.ACCOUNT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C194631(InvestmentsTrackerScrubPointMetadataDto investmentsTrackerScrubPointMetadataDto, String str, Continuation<? super C194631> continuation) {
            super(2, continuation);
            this.$metadataOverride = investmentsTrackerScrubPointMetadataDto;
            this.$amountOverride = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C194631 c194631 = InvestmentsTrackerDuxo.this.new C194631(this.$metadataOverride, this.$amountOverride, continuation);
            c194631.L$0 = obj;
            return c194631;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestmentsTrackerDataState investmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState> continuation) {
            return ((C194631) create(investmentsTrackerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:108:0x0203  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            List<InvestmentsTrackerComponentDto> components;
            MoneyDto total_amount;
            Money money;
            String amount;
            InvestmentsTrackerSwitcherViewModel investmentsTrackerSwitcherViewModel;
            MoneyDto delta_amount;
            Money money2;
            String title;
            String str;
            InvestmentsTrackerAnalyticsStateData analyticsState;
            InvestmentsTrackerAnalyticsStateData investmentsTrackerAnalyticsStateData;
            String accountId;
            String title2;
            InvestmentsTrackerComponentAllocationsBarDetailsDto allocations_bar_details;
            MoneyDto total_amount2;
            Money money3;
            InvestmentsTrackerComponentPerformanceChartDetailsDto performance_chart_details;
            List<InvestmentsTrackerScrubPointDto> scrub_points;
            InvestmentsTrackerScrubPointDto investmentsTrackerScrubPointDto;
            String accountId2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InvestmentsTrackerDataState investmentsTrackerDataState = (InvestmentsTrackerDataState) this.L$0;
            InvestmentsTrackerAllocationsBarViewModel allocationBarData = null;
            String str2 = "";
            if (!investmentsTrackerDataState.getInHomeExperience()) {
                InvestmentsTrackerUpdateCenter investmentsTrackerUpdateCenter = InvestmentsTrackerDuxo.this.updateCenter;
                CurrentPageInformation currentPageInformationLastOrNull = investmentsTrackerDataState.getCurrentPageInformationStack().lastOrNull();
                if (currentPageInformationLastOrNull == null || (accountId2 = currentPageInformationLastOrNull.getAccountId()) == null) {
                    accountId2 = "";
                }
                InvestmentsTrackerGetPageResponseDto accountResponseForId = investmentsTrackerUpdateCenter.getAccountResponseForId(accountId2);
                components = accountResponseForId != null ? accountResponseForId.getComponents() : null;
            } else {
                InvestmentsTrackerGetPageResponseDto pageResponseForType = InvestmentsTrackerDuxo.this.updateCenter.getPageResponseForType(investmentsTrackerDataState.getCurrentPageType());
                if (pageResponseForType != null) {
                    components = pageResponseForType.getComponents();
                }
            }
            if (components == null) {
                components = CollectionsKt.emptyList();
            }
            InvestmentsTrackerScrubPointMetadataDto metadata = this.$metadataOverride;
            if (metadata == null) {
                InvestmentsTrackerComponentDto investmentsTrackerComponentDto = components.get(0);
                metadata = (investmentsTrackerComponentDto == null || (performance_chart_details = investmentsTrackerComponentDto.getPerformance_chart_details()) == null || (scrub_points = performance_chart_details.getScrub_points()) == null || (investmentsTrackerScrubPointDto = (InvestmentsTrackerScrubPointDto) CollectionsKt.last((List) scrub_points)) == null) ? null : investmentsTrackerScrubPointDto.getMetadata();
            }
            int i = WhenMappings.$EnumSwitchMapping$0[investmentsTrackerDataState.getCurrentPageType().ordinal()];
            String str3 = (i == 1 ? metadata == null || (total_amount = metadata.getTotal_amount()) == null || (money = Money3.toMoney(total_amount)) == null || (amount = Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null)) == null : i == 2 ? (allocations_bar_details = components.get(0).getAllocations_bar_details()) == null || (amount = allocations_bar_details.getAmount()) == null : i != 3 || metadata == null || (total_amount2 = metadata.getTotal_amount()) == null || (money3 = Money3.toMoney(total_amount2)) == null || (amount = Money.format$default(money3, null, false, null, false, 0, null, false, null, false, false, 1023, null)) == null) ? "" : amount;
            if (investmentsTrackerDataState.getInAllocationsView()) {
                investmentsTrackerSwitcherViewModel = new InvestmentsTrackerSwitcherViewModel(null, new InvestmentsTrackerSwitcherAllocationsData(""), investmentsTrackerDataState.getInHomeExperience(), InvestmentsTrackerComponentType.ALLOCATION_SWITCHER, InvestmentsTrackerDuxo.ALLOCATION_SWITCHER_ID, investmentsTrackerDataState.getSecurityFilter());
            } else {
                investmentsTrackerSwitcherViewModel = new InvestmentsTrackerSwitcherViewModel(new InvestmentsTrackerSwitcherPerformanceData(metadata != null ? boxing.boxDouble(metadata.getPercent()) : null, (metadata == null || (delta_amount = metadata.getDelta_amount()) == null || (money2 = Money3.toMoney(delta_amount)) == null) ? null : Money.format$default(money2, null, false, null, false, 0, null, false, null, false, false, 1023, null), metadata != null ? metadata.getTime_text() : null, investmentsTrackerDataState.getSubtitleOverride()), null, investmentsTrackerDataState.getInHomeExperience(), InvestmentsTrackerComponentType.ALLOCATION_SWITCHER, InvestmentsTrackerDuxo.ALLOCATION_SWITCHER_ID, investmentsTrackerDataState.getSecurityFilter());
            }
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            if (!investmentsTrackerDataState.getInHomeExperience()) {
                CurrentPageInformation currentPageInformationLastOrNull2 = investmentsTrackerDataState.getCurrentPageInformationStack().lastOrNull();
                if (currentPageInformationLastOrNull2 != null && (accountId = currentPageInformationLastOrNull2.getAccountId()) != null) {
                    InvestmentsTrackerDuxo investmentsTrackerDuxo = InvestmentsTrackerDuxo.this;
                    booleanRef.element = true;
                    InvestmentsTrackerGetPageResponseDto accountResponseForId2 = investmentsTrackerDuxo.updateCenter.getAccountResponseForId(accountId);
                    if (accountResponseForId2 != null && (title2 = accountResponseForId2.getTitle()) != null) {
                        str2 = title2;
                    }
                }
            } else {
                InvestmentsTrackerGetPageResponseDto pageResponseForType2 = InvestmentsTrackerDuxo.this.updateCenter.getPageResponseForType(investmentsTrackerDataState.getCurrentPageType());
                if (pageResponseForType2 != null && (title = pageResponseForType2.getTitle()) != null) {
                    str = title;
                }
                InvestmentsTrackerPerformanceHeaderViewModel investmentsTrackerPerformanceHeaderViewModel = new InvestmentsTrackerPerformanceHeaderViewModel(InvestmentsTrackerComponentType.PERFORMANCE_CHART_HEADER, str, str3, this.$amountOverride, investmentsTrackerDataState.getInHomeExperience(), "investments-tracker-header", investmentsTrackerDataState.getSecurityFilter());
                if (investmentsTrackerDataState.getInHomeExperience() && investmentsTrackerDataState.getInAllocationsView()) {
                    allocationBarData = investmentsTrackerDataState.getAllocationBarData();
                }
                InvestmentsTrackerAllocationsBarViewModel investmentsTrackerAllocationsBarViewModel = allocationBarData;
                analyticsState = investmentsTrackerDataState.getAnalyticsState();
                if (analyticsState != null || (investmentsTrackerAnalyticsStateData = analyticsState.copy(investmentsTrackerDataState.getInHomeExperience(), investmentsTrackerDataState.getInAllocationsView(), booleanRef.element)) == null) {
                    investmentsTrackerAnalyticsStateData = new InvestmentsTrackerAnalyticsStateData(investmentsTrackerDataState.getInHomeExperience(), investmentsTrackerDataState.getInAllocationsView(), booleanRef.element);
                }
                return InvestmentsTrackerDataState.copy$default(investmentsTrackerDataState, null, false, null, false, null, null, null, null, false, null, null, null, investmentsTrackerPerformanceHeaderViewModel, investmentsTrackerSwitcherViewModel, false, null, null, null, false, false, null, investmentsTrackerAllocationsBarViewModel, null, null, null, null, null, false, investmentsTrackerAnalyticsStateData, false, 803196927, null);
            }
            str = str2;
            InvestmentsTrackerPerformanceHeaderViewModel investmentsTrackerPerformanceHeaderViewModel2 = new InvestmentsTrackerPerformanceHeaderViewModel(InvestmentsTrackerComponentType.PERFORMANCE_CHART_HEADER, str, str3, this.$amountOverride, investmentsTrackerDataState.getInHomeExperience(), "investments-tracker-header", investmentsTrackerDataState.getSecurityFilter());
            if (investmentsTrackerDataState.getInHomeExperience()) {
                allocationBarData = investmentsTrackerDataState.getAllocationBarData();
            }
            InvestmentsTrackerAllocationsBarViewModel investmentsTrackerAllocationsBarViewModel2 = allocationBarData;
            analyticsState = investmentsTrackerDataState.getAnalyticsState();
            if (analyticsState != null) {
                investmentsTrackerAnalyticsStateData = new InvestmentsTrackerAnalyticsStateData(investmentsTrackerDataState.getInHomeExperience(), investmentsTrackerDataState.getInAllocationsView(), booleanRef.element);
            }
            return InvestmentsTrackerDataState.copy$default(investmentsTrackerDataState, null, false, null, false, null, null, null, null, false, null, null, null, investmentsTrackerPerformanceHeaderViewModel2, investmentsTrackerSwitcherViewModel, false, null, null, null, false, false, null, investmentsTrackerAllocationsBarViewModel2, null, null, null, null, null, false, investmentsTrackerAnalyticsStateData, false, 803196927, null);
        }
    }

    private final void updateHeader(String amountOverride, InvestmentsTrackerScrubPointMetadataDto metadataOverride) {
        applyMutation(new C194631(metadataOverride, amountOverride, null));
    }

    static /* synthetic */ void redraw$default(InvestmentsTrackerDuxo investmentsTrackerDuxo, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        investmentsTrackerDuxo.redraw(z, z2);
    }

    /* compiled from: InvestmentsTrackerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$redraw$1", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$redraw$1 */
    static final class C194561 extends ContinuationImpl7 implements Function2<InvestmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState>, Object> {
        final /* synthetic */ boolean $accountWasClicked;
        final /* synthetic */ boolean $poppingScreen;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C194561(boolean z, boolean z2, Continuation<? super C194561> continuation) {
            super(2, continuation);
            this.$accountWasClicked = z;
            this.$poppingScreen = z2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C194561 c194561 = InvestmentsTrackerDuxo.this.new C194561(this.$accountWasClicked, this.$poppingScreen, continuation);
            c194561.L$0 = obj;
            return c194561;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestmentsTrackerDataState investmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState> continuation) {
            return ((C194561) create(investmentsTrackerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            InvestmentsTrackerGetPageResponseDto pageResponseForType;
            String accountId;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InvestmentsTrackerDataState investmentsTrackerDataState = (InvestmentsTrackerDataState) this.L$0;
            if (!investmentsTrackerDataState.getInHomeExperience()) {
                InvestmentsTrackerUpdateCenter investmentsTrackerUpdateCenter = InvestmentsTrackerDuxo.this.updateCenter;
                CurrentPageInformation currentPageInformationLastOrNull = investmentsTrackerDataState.getCurrentPageInformationStack().lastOrNull();
                if (currentPageInformationLastOrNull == null || (accountId = currentPageInformationLastOrNull.getAccountId()) == null) {
                    accountId = "";
                }
                pageResponseForType = investmentsTrackerUpdateCenter.getAccountResponseForId(accountId);
            } else {
                pageResponseForType = InvestmentsTrackerDuxo.this.updateCenter.getPageResponseForType(investmentsTrackerDataState.getCurrentPageType());
            }
            return InvestmentsTrackerDataState.copy$default(investmentsTrackerDataState, investmentsTrackerDataState.getComponents() == null ? InvestmentsTrackerDuxo.this.getViewComponentList(investmentsTrackerDataState, true) : InvestmentsTrackerDuxo.this.getViewComponentList(investmentsTrackerDataState, false), false, null, false, null, null, new UiEvent(boxing.boxBoolean(this.$accountWasClicked)), new UiEvent(boxing.boxBoolean(this.$poppingScreen)), investmentsTrackerDataState.getInHomeExperience(), null, null, null, null, null, false, null, pageResponseForType != null ? pageResponseForType.getNavigation_title() : null, null, false, false, null, null, null, null, null, null, null, false, null, false, 1073675838, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void redraw(boolean accountWasClicked, boolean poppingScreen) {
        applyMutation(new C194561(accountWasClicked, poppingScreen, null));
        updateHeader$default(this, null, null, 3, null);
    }

    public final void handleNativeAction(InvestmentsTrackerNativeAction action, Object value) {
        String deeplink;
        Intrinsics.checkNotNullParameter(action, "action");
        switch (WhenMappings.$EnumSwitchMapping$1[action.ordinal()]) {
            case 1:
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerCategorySectionViewModel");
                String id = ((InvestmentsTrackerCategorySectionViewModel) value).getId();
                this.categoryMapping.put(id, Boolean.valueOf(!(this.categoryMapping.get(id) != null ? r7.booleanValue() : false)));
                redraw$default(this, false, false, 3, null);
                return;
            case 2:
                startPlaidWithChecks$default(this, false, null, 3, null);
                return;
            case 3:
                submit(InvestmentsTrackerEvent.NavigateToAccountsList.INSTANCE);
                return;
            case 4:
                applyMutation(new C194451(value, null));
                redraw(false, false);
                applyMutation(new C194462(null));
                return;
            case 5:
                applyMutation(new C194473(value, null));
                redraw(false, false);
                return;
            case 6:
                C3328x929dba61 c3328x929dba61 = value instanceof C3328x929dba61 ? (C3328x929dba61) value : null;
                if (c3328x929dba61 == null || (deeplink = c3328x929dba61.getDeeplink()) == null || deeplink.length() <= 0) {
                    return;
                }
                submit(new InvestmentsTrackerEvent.Deeplink(deeplink));
                return;
            case 7:
                applyMutation(new C194485(null));
                applyMutation(new C194496(null));
                return;
            case 8:
                String str = value instanceof String ? (String) value : null;
                if (str == null || str.length() <= 0) {
                    return;
                }
                submit(new InvestmentsTrackerEvent.Deeplink(str));
                return;
            case 9:
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
                startPlaidWithChecks(true, (String) value);
                return;
            case 10:
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.String");
                startPlaidWithChecks(true, (String) value);
                return;
            case 11:
                applyMutation(new C194508(value, null));
                redraw$default(this, false, false, 3, null);
                return;
            case 12:
                this.upsellCardClosed.set(true);
                redraw$default(this, false, false, 3, null);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: InvestmentsTrackerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$handleNativeAction$1", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$handleNativeAction$1 */
    static final class C194451 extends ContinuationImpl7 implements Function2<InvestmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState>, Object> {
        final /* synthetic */ Object $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C194451(Object obj, Continuation<? super C194451> continuation) {
            super(2, continuation);
            this.$value = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C194451 c194451 = new C194451(this.$value, continuation);
            c194451.L$0 = obj;
            return c194451;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestmentsTrackerDataState investmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState> continuation) {
            return ((C194451) create(investmentsTrackerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            SpanOption next;
            InvestmentsTrackerDataState investmentsTrackerDataStateCopy$default;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InvestmentsTrackerDataState investmentsTrackerDataState = (InvestmentsTrackerDataState) this.L$0;
            ImmutableList3<SpanOption> spanOptionList = InvestmentsTrackerUtilityFunctions.getSpanOptionList(investmentsTrackerDataState.getSpanOption(), true);
            Object obj2 = this.$value;
            Iterator<SpanOption> it = spanOptionList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                String queryValue = next.getQueryValue();
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                if (Intrinsics.areEqual(queryValue, (String) obj2)) {
                    break;
                }
            }
            SpanOption spanOption = next;
            return (spanOption == null || (investmentsTrackerDataStateCopy$default = InvestmentsTrackerDataState.copy$default(investmentsTrackerDataState, null, false, spanOption, true, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, 1073741811, null)) == null) ? investmentsTrackerDataState : investmentsTrackerDataStateCopy$default;
        }
    }

    /* compiled from: InvestmentsTrackerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$handleNativeAction$2", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {560}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$handleNativeAction$2 */
    static final class C194462 extends ContinuationImpl7 implements Function2<InvestmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        C194462(Continuation<? super C194462> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C194462 c194462 = InvestmentsTrackerDuxo.this.new C194462(continuation);
            c194462.L$0 = obj;
            return c194462;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestmentsTrackerDataState investmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState> continuation) {
            return ((C194462) create(investmentsTrackerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            InvestmentsTrackerDataState investmentsTrackerDataState;
            InvestmentsTrackerDuxo investmentsTrackerDuxo;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                investmentsTrackerDataState = (InvestmentsTrackerDataState) this.L$0;
                SpanOption spanOption = investmentsTrackerDataState.getSpanOption();
                if (spanOption != null) {
                    InvestmentsTrackerDuxo investmentsTrackerDuxo2 = InvestmentsTrackerDuxo.this;
                    InvestmentsTrackerUpdateCenter investmentsTrackerUpdateCenter = investmentsTrackerDuxo2.updateCenter;
                    SpanDto spanDto = InvestmentsTrackerUtilityFunctions.toSpanDto(spanOption);
                    this.L$0 = investmentsTrackerDataState;
                    this.L$1 = investmentsTrackerDuxo2;
                    this.label = 1;
                    if (investmentsTrackerUpdateCenter.setSpanOption(spanDto, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    investmentsTrackerDuxo = investmentsTrackerDuxo2;
                }
                return investmentsTrackerDataState;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            investmentsTrackerDuxo = (InvestmentsTrackerDuxo) this.L$1;
            investmentsTrackerDataState = (InvestmentsTrackerDataState) this.L$0;
            ResultKt.throwOnFailure(obj);
            investmentsTrackerDuxo.redraw(false, false);
            investmentsTrackerDuxo.applyMutation(new InvestmentsTrackerDuxo$handleNativeAction$2$1$1(null));
            investmentsTrackerDuxo.redraw(false, false);
            return investmentsTrackerDataState;
        }
    }

    /* compiled from: InvestmentsTrackerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$handleNativeAction$3", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$handleNativeAction$3 */
    static final class C194473 extends ContinuationImpl7 implements Function2<InvestmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState>, Object> {
        final /* synthetic */ Object $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C194473(Object obj, Continuation<? super C194473> continuation) {
            super(2, continuation);
            this.$value = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C194473 c194473 = new C194473(this.$value, continuation);
            c194473.L$0 = obj;
            return c194473;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestmentsTrackerDataState investmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState> continuation) {
            return ((C194473) create(investmentsTrackerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InvestmentsTrackerDataState investmentsTrackerDataState = (InvestmentsTrackerDataState) this.L$0;
            String str = Intrinsics.areEqual(investmentsTrackerDataState.getActiveAllocationBarId(), (String) this.$value) ? null : (String) this.$value;
            InvestmentsTrackerAllocationsBarViewModel allocationBarData = investmentsTrackerDataState.getAllocationBarData();
            return InvestmentsTrackerDataState.copy$default(investmentsTrackerDataState, null, false, null, false, null, null, null, null, false, null, null, str, null, null, false, null, null, null, false, false, null, allocationBarData != null ? InvestmentsTrackerAllocationsBarViewModel.copy$default(allocationBarData, null, str, null, null, null, 29, null) : null, null, null, null, null, null, false, null, false, 1071642623, null);
        }
    }

    /* compiled from: InvestmentsTrackerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$handleNativeAction$5", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$handleNativeAction$5 */
    static final class C194485 extends ContinuationImpl7 implements Function2<InvestmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C194485(Continuation<? super C194485> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C194485 c194485 = new C194485(continuation);
            c194485.L$0 = obj;
            return c194485;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestmentsTrackerDataState investmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState> continuation) {
            return ((C194485) create(investmentsTrackerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            InvestmentsTrackerPageTypeDto investmentsTrackerPageTypeDto;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InvestmentsTrackerDataState investmentsTrackerDataState = (InvestmentsTrackerDataState) this.L$0;
            if (!investmentsTrackerDataState.getInAllocationsView()) {
                investmentsTrackerPageTypeDto = InvestmentsTrackerPageTypeDto.ALLOCATION_VIEW;
            } else {
                investmentsTrackerPageTypeDto = InvestmentsTrackerPageTypeDto.HOME;
            }
            return InvestmentsTrackerDataState.copy$default(investmentsTrackerDataState, null, false, null, false, null, null, null, null, false, null, null, null, null, null, !investmentsTrackerDataState.getInAllocationsView(), new ArrayDeque(CollectionsKt.listOf(new CurrentPageInformation(investmentsTrackerPageTypeDto, null))), null, null, false, false, null, null, null, null, null, null, null, false, null, false, 1073692670, null);
        }
    }

    /* compiled from: InvestmentsTrackerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$handleNativeAction$6", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$handleNativeAction$6 */
    static final class C194496 extends ContinuationImpl7 implements Function2<InvestmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C194496(Continuation<? super C194496> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C194496 c194496 = InvestmentsTrackerDuxo.this.new C194496(continuation);
            c194496.L$0 = obj;
            return c194496;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestmentsTrackerDataState investmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState> continuation) {
            return ((C194496) create(investmentsTrackerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InvestmentsTrackerDataState investmentsTrackerDataState = (InvestmentsTrackerDataState) this.L$0;
            InvestmentsTrackerDuxo.redraw$default(InvestmentsTrackerDuxo.this, false, false, 3, null);
            return investmentsTrackerDataState;
        }
    }

    /* compiled from: InvestmentsTrackerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$handleNativeAction$8", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$handleNativeAction$8 */
    static final class C194508 extends ContinuationImpl7 implements Function2<InvestmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState>, Object> {
        final /* synthetic */ Object $value;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C194508(Object obj, Continuation<? super C194508> continuation) {
            super(2, continuation);
            this.$value = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C194508 c194508 = new C194508(this.$value, continuation);
            c194508.L$0 = obj;
            return c194508;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestmentsTrackerDataState investmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState> continuation) {
            return ((C194508) create(investmentsTrackerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InvestmentsTrackerDataState investmentsTrackerDataState = (InvestmentsTrackerDataState) this.L$0;
            return InvestmentsTrackerDataState.copy$default(investmentsTrackerDataState, null, false, null, false, null, null, null, null, false, null, null, Intrinsics.areEqual(investmentsTrackerDataState.getActiveAllocationBarId(), (String) this.$value) ? null : (String) this.$value, null, null, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, 1073739775, null);
        }
    }

    public final void handleAction(InvestmentsTrackerActionDto action, Object value) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(value, "value");
        int i = WhenMappings.$EnumSwitchMapping$2[action.ordinal()];
        if (i == 1) {
            submit(InvestmentsTrackerEvent.NavigateToTransfers.INSTANCE);
            return;
        }
        if (i != 2) {
            if (i == 3) {
                startPlaidWithChecks$default(this, false, null, 3, null);
                return;
            } else {
                if (i != 4) {
                    return;
                }
                startPlaidWithChecks$default(this, false, null, 3, null);
                return;
            }
        }
        InvestmentsTrackerCategorySectionRowDetailsDto investmentsTrackerCategorySectionRowDetailsDto = value instanceof InvestmentsTrackerCategorySectionRowDetailsDto ? (InvestmentsTrackerCategorySectionRowDetailsDto) value : null;
        if (investmentsTrackerCategorySectionRowDetailsDto != null) {
            if (investmentsTrackerCategorySectionRowDetailsDto.getDeeplink().length() > 0) {
                submit(new InvestmentsTrackerEvent.Deeplink(investmentsTrackerCategorySectionRowDetailsDto.getDeeplink()));
                return;
            }
            boolean zAddAccountToRefresh = this.updateCenter.addAccountToRefresh(((InvestmentsTrackerCategorySectionRowDetailsDto) value).getId());
            applyMutation(new InvestmentsTrackerDuxo$handleAction$1$1(null));
            applyMutation(new InvestmentsTrackerDuxo$handleAction$1$2(value, zAddAccountToRefresh, this, null));
            applyMutation(new InvestmentsTrackerDuxo$handleAction$1$3(null));
            redraw$default(this, true, false, 2, null);
        }
    }

    public final void transferClicked() {
        submit(InvestmentsTrackerEvent.NavigateToTransfers.INSTANCE);
    }

    public final void backSelected() {
        withDataState(new Function1() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentsTrackerDuxo.backSelected$lambda$20(this.f$0, (InvestmentsTrackerDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit backSelected$lambda$20(InvestmentsTrackerDuxo investmentsTrackerDuxo, InvestmentsTrackerDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        investmentsTrackerDuxo.applyMutation(new InvestmentsTrackerDuxo$backSelected$1$1(null));
        if (!dataState.getInHomeExperience()) {
            dataState.getCurrentPageInformationStack().remove(dataState.getCurrentPageInformationStack().size() - 1);
            redraw$default(investmentsTrackerDuxo, false, true, 1, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: InvestmentsTrackerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$applyMutationOverride$1", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {739}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$applyMutationOverride$1 */
    static final class C194411 extends ContinuationImpl7 implements Function2<InvestmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState>, Object> {
        final /* synthetic */ Function2<InvestmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState>, Object> $mutator;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C194411(Function2<? super InvestmentsTrackerDataState, ? super Continuation<? super InvestmentsTrackerDataState>, ? extends Object> function2, Continuation<? super C194411> continuation) {
            super(2, continuation);
            this.$mutator = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C194411 c194411 = new C194411(this.$mutator, continuation);
            c194411.L$0 = obj;
            return c194411;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestmentsTrackerDataState investmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState> continuation) {
            return ((C194411) create(investmentsTrackerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            InvestmentsTrackerDataState investmentsTrackerDataState = (InvestmentsTrackerDataState) this.L$0;
            Function2<InvestmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState>, Object> function2 = this.$mutator;
            this.label = 1;
            Object objInvoke = function2.invoke(investmentsTrackerDataState, this);
            return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
        }
    }

    @Override // com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions
    public void applyMutationOverride(Function2<? super InvestmentsTrackerDataState, ? super Continuation<? super InvestmentsTrackerDataState>, ? extends Object> mutator) {
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        applyMutation(new C194411(mutator, null));
    }

    /* compiled from: InvestmentsTrackerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$plaidFinishedCallback$1", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {743}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$plaidFinishedCallback$1 */
    static final class C194551 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C194551(Continuation<? super C194551> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestmentsTrackerDuxo.this.new C194551(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C194551) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InvestmentsTrackerUpdateCenter investmentsTrackerUpdateCenter = InvestmentsTrackerDuxo.this.updateCenter;
                this.label = 1;
                if (investmentsTrackerUpdateCenter.refresh(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            InvestmentsTrackerDuxo.redraw$default(InvestmentsTrackerDuxo.this, false, false, 3, null);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.investmentstracker.features.plaid.DuxoExtensions
    public void plaidFinishedCallback() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C194551(null), 3, null);
    }

    public final void onScrub(InvestmentsTrackerScrubPointDto verticalLineInfo) {
        MoneyDto total_amount;
        Money money;
        String str = null;
        if (verticalLineInfo != null) {
            InvestmentsTrackerScrubPointMetadataDto metadata = verticalLineInfo.getMetadata();
            if (metadata != null && (total_amount = metadata.getTotal_amount()) != null && (money = Money3.toMoney(total_amount)) != null) {
                str = Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null);
            }
            updateHeader(str, verticalLineInfo.getMetadata());
            return;
        }
        updateHeader$default(this, null, null, 3, null);
    }

    public final void finishedLink() {
        redraw$default(this, false, false, 3, null);
    }

    /* compiled from: InvestmentsTrackerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$securityHeaderClicked$1", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$securityHeaderClicked$1 */
    static final class C194571 extends ContinuationImpl7 implements Function2<InvestmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C194571(Continuation<? super C194571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C194571 c194571 = new C194571(continuation);
            c194571.L$0 = obj;
            return c194571;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestmentsTrackerDataState investmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState> continuation) {
            return ((C194571) create(investmentsTrackerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InvestmentsTrackerDataState.copy$default((InvestmentsTrackerDataState) this.L$0, null, false, null, false, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, false, null, null, new SecurityFilter(!r2.getSecurityFilter().getHideAll()), null, null, null, null, false, null, false, 1069547519, null);
        }
    }

    public final void securityHeaderClicked() {
        applyMutation(new C194571(null));
        redraw$default(this, false, false, 3, null);
    }

    /* compiled from: InvestmentsTrackerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$startPlaidWithChecks$1", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {778}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$startPlaidWithChecks$1 */
    static final class C194621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $institutionId;
        final /* synthetic */ boolean $useUpdateMode;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C194621(boolean z, String str, Continuation<? super C194621> continuation) {
            super(2, continuation);
            this.$useUpdateMode = z;
            this.$institutionId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InvestmentsTrackerDuxo.this.new C194621(this.$useUpdateMode, this.$institutionId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C194621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: InvestmentsTrackerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$startPlaidWithChecks$1$1", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$startPlaidWithChecks$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InvestmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState>, Object> {
            final /* synthetic */ boolean $useUpdateMode;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$useUpdateMode = z;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$useUpdateMode, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InvestmentsTrackerDataState investmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState> continuation) {
                return ((AnonymousClass1) create(investmentsTrackerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return InvestmentsTrackerDataState.copy$default((InvestmentsTrackerDataState) this.L$0, null, false, null, false, null, null, null, null, false, null, null, null, null, null, false, null, null, null, this.$useUpdateMode, false, null, null, null, null, null, null, null, false, null, false, 1073479679, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InvestmentsTrackerDuxo.this.applyMutation(new AnonymousClass1(this.$useUpdateMode, null));
                BffMoneyMovementService bffMoneyMovementService = InvestmentsTrackerDuxo.this.getBffMoneyMovementService();
                GetAgreementRequestDto getAgreementRequestDto = new GetAgreementRequestDto(InvestmentsTrackerAgreementTypeDto.CONNECT_ACCOUNT);
                this.label = 1;
                obj = bffMoneyMovementService.GetAgreement(getAgreementRequestDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            GetAgreementResponseDto getAgreementResponseDto = (GetAgreementResponseDto) obj;
            InvestmentsTrackerGetAgreementResponseDto agreement_response = getAgreementResponseDto.getAgreement_response();
            if (getAgreementResponseDto.getAgreement_status() == AgreementStatusDto.AGREEMENT_NOT_SIGNED && agreement_response != null) {
                InvestmentsTrackerDuxo.this.applyMutation(new AnonymousClass2(agreement_response, null));
            } else {
                InvestmentsTrackerDuxo.this.submit(new InvestmentsTrackerEvent.Plaid(this.$useUpdateMode, this.$institutionId));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: InvestmentsTrackerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$startPlaidWithChecks$1$2", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$startPlaidWithChecks$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<InvestmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState>, Object> {
            final /* synthetic */ InvestmentsTrackerGetAgreementResponseDto $response;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(InvestmentsTrackerGetAgreementResponseDto investmentsTrackerGetAgreementResponseDto, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$response = investmentsTrackerGetAgreementResponseDto;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$response, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InvestmentsTrackerDataState investmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState> continuation) {
                return ((AnonymousClass2) create(investmentsTrackerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return InvestmentsTrackerDataState.copy$default((InvestmentsTrackerDataState) this.L$0, null, false, null, false, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, false, null, null, null, null, null, new InvestmentsTrackerAgreementViewModel(this.$response, false), null, false, null, false, 1040187391, null);
            }
        }
    }

    static /* synthetic */ void startPlaidWithChecks$default(InvestmentsTrackerDuxo investmentsTrackerDuxo, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        investmentsTrackerDuxo.startPlaidWithChecks(z, str);
    }

    private final void startPlaidWithChecks(boolean useUpdateMode, String institutionId) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C194621(useUpdateMode, institutionId, null), 3, null);
    }

    public final void onboardingContinueClicked() {
        withDataState(new Function1() { // from class: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InvestmentsTrackerDuxo.onboardingContinueClicked$lambda$21(this.f$0, (InvestmentsTrackerDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onboardingContinueClicked$lambda$21(InvestmentsTrackerDuxo investmentsTrackerDuxo, InvestmentsTrackerDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        OnboardingViewModel onboardingData = dataState.getOnboardingData();
        if (onboardingData != null && onboardingData.getCurrentPage() == 0) {
            investmentsTrackerDuxo.applyMutation(new InvestmentsTrackerDuxo$onboardingContinueClicked$1$1(null));
            redraw$default(investmentsTrackerDuxo, false, false, 3, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: InvestmentsTrackerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$onboardingBottomSheetFinished$1", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$onboardingBottomSheetFinished$1 */
    static final class C194541 extends ContinuationImpl7 implements Function2<InvestmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C194541(Continuation<? super C194541> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C194541 c194541 = new C194541(continuation);
            c194541.L$0 = obj;
            return c194541;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestmentsTrackerDataState investmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState> continuation) {
            return ((C194541) create(investmentsTrackerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InvestmentsTrackerDataState.copy$default((InvestmentsTrackerDataState) this.L$0, null, false, null, false, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, 1056964607, null);
        }
    }

    public final void onboardingBottomSheetFinished() {
        this.onboardingSeen.set(true);
        applyMutation(new C194541(null));
    }

    /* compiled from: InvestmentsTrackerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$closeAgreements$1", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$closeAgreements$1 */
    static final class C194421 extends ContinuationImpl7 implements Function2<InvestmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C194421(Continuation<? super C194421> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C194421 c194421 = new C194421(continuation);
            c194421.L$0 = obj;
            return c194421;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestmentsTrackerDataState investmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState> continuation) {
            return ((C194421) create(investmentsTrackerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InvestmentsTrackerDataState.copy$default((InvestmentsTrackerDataState) this.L$0, null, false, null, false, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, 1040187391, null);
        }
    }

    public final void closeAgreements() {
        applyMutation(new C194421(null));
    }

    /* compiled from: InvestmentsTrackerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$agreetoAgreement$1", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$agreetoAgreement$1 */
    static final class C194391 extends ContinuationImpl7 implements Function2<InvestmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C194391(Continuation<? super C194391> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C194391 c194391 = new C194391(continuation);
            c194391.L$0 = obj;
            return c194391;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestmentsTrackerDataState investmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState> continuation) {
            return ((C194391) create(investmentsTrackerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InvestmentsTrackerDataState investmentsTrackerDataState = (InvestmentsTrackerDataState) this.L$0;
            InvestmentsTrackerAgreementViewModel agreementResponse = investmentsTrackerDataState.getAgreementResponse();
            return InvestmentsTrackerDataState.copy$default(investmentsTrackerDataState, null, false, null, false, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, false, null, null, null, null, null, agreementResponse != null ? InvestmentsTrackerAgreementViewModel.copy$default(agreementResponse, null, true, 1, null) : null, null, false, null, false, 1040187391, null);
        }
    }

    public final void agreetoAgreement(InvestmentsTrackerGetAgreementResponseDto response) {
        Intrinsics.checkNotNullParameter(response, "response");
        applyMutation(new C194391(null));
        applyMutation(new C194402(response, null));
    }

    /* compiled from: InvestmentsTrackerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$agreetoAgreement$2", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {848}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$agreetoAgreement$2 */
    static final class C194402 extends ContinuationImpl7 implements Function2<InvestmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState>, Object> {
        final /* synthetic */ InvestmentsTrackerGetAgreementResponseDto $response;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C194402(InvestmentsTrackerGetAgreementResponseDto investmentsTrackerGetAgreementResponseDto, Continuation<? super C194402> continuation) {
            super(2, continuation);
            this.$response = investmentsTrackerGetAgreementResponseDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C194402 c194402 = InvestmentsTrackerDuxo.this.new C194402(this.$response, continuation);
            c194402.L$0 = obj;
            return c194402;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestmentsTrackerDataState investmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState> continuation) {
            return ((C194402) create(investmentsTrackerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            InvestmentsTrackerDataState investmentsTrackerDataState;
            InvestmentsTrackerDataState investmentsTrackerDataState2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InvestmentsTrackerDataState investmentsTrackerDataState3 = (InvestmentsTrackerDataState) this.L$0;
                try {
                    BffMoneyMovementService bffMoneyMovementService = InvestmentsTrackerDuxo.this.getBffMoneyMovementService();
                    SignAgreementRequestDto signAgreementRequestDto = new SignAgreementRequestDto(this.$response.getAgreement_type());
                    this.L$0 = investmentsTrackerDataState3;
                    this.label = 1;
                    if (bffMoneyMovementService.SignAgreement(signAgreementRequestDto, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    investmentsTrackerDataState2 = investmentsTrackerDataState3;
                    InvestmentsTrackerDuxo.startPlaidWithChecks$default(InvestmentsTrackerDuxo.this, false, null, 3, null);
                    return InvestmentsTrackerDataState.copy$default(investmentsTrackerDataState2, null, false, null, false, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, 1040187391, null);
                } catch (Exception unused) {
                    investmentsTrackerDataState = investmentsTrackerDataState3;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InvestmentsTrackerDataState investmentsTrackerDataState4 = (InvestmentsTrackerDataState) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    investmentsTrackerDataState2 = investmentsTrackerDataState4;
                    try {
                        InvestmentsTrackerDuxo.startPlaidWithChecks$default(InvestmentsTrackerDuxo.this, false, null, 3, null);
                        return InvestmentsTrackerDataState.copy$default(investmentsTrackerDataState2, null, false, null, false, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, 1040187391, null);
                    } catch (Exception unused2) {
                        investmentsTrackerDataState = investmentsTrackerDataState2;
                    }
                } catch (Exception unused3) {
                    investmentsTrackerDataState = investmentsTrackerDataState4;
                }
            }
            InvestmentsTrackerAgreementViewModel agreementResponse = investmentsTrackerDataState.getAgreementResponse();
            return InvestmentsTrackerDataState.copy$default(investmentsTrackerDataState, null, false, null, false, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, false, null, null, null, null, null, agreementResponse != null ? InvestmentsTrackerAgreementViewModel.copy$default(agreementResponse, null, false, 1, null) : null, null, false, null, false, 1040187391, null);
        }
    }

    /* compiled from: InvestmentsTrackerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$infoClicked$1", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$infoClicked$1 */
    static final class C194511 extends ContinuationImpl7 implements Function2<InvestmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C194511(Continuation<? super C194511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C194511 c194511 = InvestmentsTrackerDuxo.this.new C194511(continuation);
            c194511.L$0 = obj;
            return c194511;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestmentsTrackerDataState investmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState> continuation) {
            return ((C194511) create(investmentsTrackerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InvestmentsTrackerDataState investmentsTrackerDataState = (InvestmentsTrackerDataState) this.L$0;
            InvestmentsTrackerGetPageResponseDto pageResponseForType = InvestmentsTrackerDuxo.this.updateCenter.getPageResponseForType(investmentsTrackerDataState.getCurrentPageType());
            return InvestmentsTrackerDataState.copy$default(investmentsTrackerDataState, null, false, null, false, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, false, null, null, null, null, null, null, pageResponseForType != null ? pageResponseForType.getTooltip() : null, false, null, false, 1006632959, null);
        }
    }

    public final void infoClicked() {
        applyMutation(new C194511(null));
    }

    /* compiled from: InvestmentsTrackerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$infoClosed$1", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$infoClosed$1 */
    static final class C194521 extends ContinuationImpl7 implements Function2<InvestmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C194521(Continuation<? super C194521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C194521 c194521 = new C194521(continuation);
            c194521.L$0 = obj;
            return c194521;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestmentsTrackerDataState investmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState> continuation) {
            return ((C194521) create(investmentsTrackerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InvestmentsTrackerDataState.copy$default((InvestmentsTrackerDataState) this.L$0, null, false, null, false, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, false, null, null, null, null, null, null, null, false, null, false, 1006632959, null);
        }
    }

    public final void infoClosed() {
        applyMutation(new C194521(null));
    }

    /* compiled from: InvestmentsTrackerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$exoPlayerLoaded$1", m3645f = "InvestmentsTrackerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investmentstracker.InvestmentsTrackerDuxo$exoPlayerLoaded$1 */
    static final class C194431 extends ContinuationImpl7 implements Function2<InvestmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C194431(Continuation<? super C194431> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C194431 c194431 = new C194431(continuation);
            c194431.L$0 = obj;
            return c194431;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InvestmentsTrackerDataState investmentsTrackerDataState, Continuation<? super InvestmentsTrackerDataState> continuation) {
            return ((C194431) create(investmentsTrackerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InvestmentsTrackerDataState.copy$default((InvestmentsTrackerDataState) this.L$0, null, false, null, false, null, null, null, null, false, null, null, null, null, null, false, null, null, null, false, false, null, null, null, null, null, null, null, true, null, false, 939524095, null);
        }
    }

    public final void exoPlayerLoaded() {
        applyMutation(new C194431(null));
    }
}
