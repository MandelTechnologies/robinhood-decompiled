package com.robinhood.android.transfers.p271ui.retirement.contributions;

import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.data.store.logging.utils.EventLoggers;
import com.robinhood.android.data.store.portfolio.TraderPortfolioStore;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.models.retirement.api.contributions.ApiGoldMatchSelectionRow;
import com.robinhood.android.models.retirement.api.contributions.ApiGoldMatchSelectionRowResponse;
import com.robinhood.android.models.retirement.api.contributions.ApiRetirementContributionsResponse;
import com.robinhood.android.models.retirement.api.contributions.KeypadChip;
import com.robinhood.android.models.retirement.p194db.RetirementMatchRate;
import com.robinhood.android.retirement.contracts.RetirementExperiments;
import com.robinhood.android.tickerinputview.keyevent.DollarInputConsumer;
import com.robinhood.android.tickerinputview.keyevent.InputKeyEventConsumer;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.lib.validation.TransferValidator;
import com.robinhood.android.transfers.lib.validation.ValidationFailure;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.transfers.p271ui.max.CreateTransferLogging;
import com.robinhood.android.transfers.p271ui.max.TransferData;
import com.robinhood.android.transfers.p271ui.max.TransferData2;
import com.robinhood.android.transfers.p271ui.max.validation.TransferValidationInputUtils;
import com.robinhood.android.transfers.p271ui.retirement.contributions.CreateRetirementContributionDuxo;
import com.robinhood.android.transfers.p271ui.retirement.contributions.CreateRetirementContributionEvent;
import com.robinhood.android.transfers.p271ui.retirement.contributions.CreateRetirementContributionFragment;
import com.robinhood.android.transfers.p271ui.retirement.contributions.CreateRetirementContributionViewState;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
import com.robinhood.android.transfers.preference.HasSeenFullscreenMatchSelectionPref;
import com.robinhood.android.transfers.util.PreCreateLoggingEvents;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.disposer.ScopedSingle;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.prefs.DefaultAchRelationship;
import com.robinhood.librobinhood.data.store.BalancesStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.ContributionStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementMatchStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RetirementTransfersMatchRateSelectionStore;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.ApiCreateTransferResponse;
import com.robinhood.models.api.bonfire.ApiPostTransferPage;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.api.bonfire.transfer.ApiPreCreateTransferResponse;
import com.robinhood.models.api.bonfire.transfer.ApiPreCreateTransferSduiContainer;
import com.robinhood.models.api.bonfire.transfer.PreCreatePopupType;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow2;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.DisplayRTPUpsellAction;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.store.base.PortfolioStore;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Year;
import retrofit2.Response;

/* compiled from: CreateRetirementContributionDuxo.kt */
@Metadata(m3635d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u0081\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0002\u0081\u0001B\u008d\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0001\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b-\u0010,J3\u00102\u001a\u00020*\"\u0004\b\u0000\u0010.*\b\u0012\u0004\u0012\u00028\u00000/2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020*00H\u0002¢\u0006\u0004\b2\u00103J3\u00102\u001a\u00020*\"\u0004\b\u0000\u0010.*\b\u0012\u0004\u0012\u00028\u0000042\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020*00H\u0002¢\u0006\u0004\b2\u00106J\u000f\u00107\u001a\u00020*H\u0016¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u00020*¢\u0006\u0004\b9\u00108J\u001d\u0010>\u001a\u00020*2\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020*¢\u0006\u0004\b@\u00108J\u0015\u0010C\u001a\u00020*2\u0006\u0010B\u001a\u00020A¢\u0006\u0004\bC\u0010DJ\u0017\u0010G\u001a\u00020*2\b\u0010F\u001a\u0004\u0018\u00010E¢\u0006\u0004\bG\u0010HJ\u0015\u0010K\u001a\u00020*2\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LJ\u001f\u0010O\u001a\u00020*2\u0006\u0010J\u001a\u00020I2\b\u0010N\u001a\u0004\u0018\u00010M¢\u0006\u0004\bO\u0010PJ\u0015\u0010S\u001a\u00020*2\u0006\u0010R\u001a\u00020Q¢\u0006\u0004\bS\u0010TJ\u0015\u0010W\u001a\u00020*2\u0006\u0010V\u001a\u00020U¢\u0006\u0004\bW\u0010XJ\u0015\u0010Y\u001a\u00020*2\u0006\u0010=\u001a\u00020<¢\u0006\u0004\bY\u0010ZJ\u0015\u0010[\u001a\u00020*2\u0006\u0010=\u001a\u00020<¢\u0006\u0004\b[\u0010ZJ\r\u0010\\\u001a\u00020*¢\u0006\u0004\b\\\u00108J\r\u0010]\u001a\u00020*¢\u0006\u0004\b]\u00108J\u0015\u0010^\u001a\u00020*2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b^\u0010,J\r\u0010_\u001a\u00020*¢\u0006\u0004\b_\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010`R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010cR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010dR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010eR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010fR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010gR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010hR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010iR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010jR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010kR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010lR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010mR\u001a\u0010%\u001a\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010n\u001a\u0004\bo\u0010pR\"\u0010r\u001a\u00020q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u0017\u0010y\u001a\u00020x8\u0006¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\u001b\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020~0}8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001¨\u0006\u0082\u0001"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDataState;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "transfersBonfireApi", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/ContributionStore;", "contributionStore", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/prefs/StringPreference;", "defaultAchRelationshipPref", "Lcom/robinhood/android/transfers/lib/validation/TransferValidator;", "validator", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "portfolioStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "balancesStore", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "marketHoursManager", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "retirementMatchStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementTransfersMatchRateSelectionStore;", "retirementTransfersMatchRateSelectionStore", "Lcom/robinhood/prefs/BooleanPreference;", "hasSeenFullscreenMatchSelectionPref", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/ContributionStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/android/transfers/lib/validation/TransferValidator;Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;Lcom/robinhood/librobinhood/data/store/BalancesStore;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementTransfersMatchRateSelectionStore;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "Lcom/robinhood/android/transfers/ui/retirement/contributions/ContributionBundle;", "contributionBundle", "", "makeContributionRequest", "(Lcom/robinhood/android/transfers/ui/retirement/contributions/ContributionBundle;)V", "preCreateTransferThenMakeContributionRequest", "T", "Lcom/robinhood/disposer/ScopedObservable;", "Lkotlin/Function1;", "onNext", "subscribeHandleError", "(Lcom/robinhood/disposer/ScopedObservable;Lkotlin/jvm/functions/Function1;)V", "Lcom/robinhood/disposer/ScopedSingle;", "onSuccess", "(Lcom/robinhood/disposer/ScopedSingle;Lkotlin/jvm/functions/Function1;)V", "onCreate", "()V", "refresh", "Landroid/view/KeyEvent;", "keyEvent", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState$Loaded;", "state", "consumeKeyEvent", "(Landroid/view/KeyEvent;Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState$Loaded;)V", "onContinueClicked", "", "isInEditMode", "setEditMode", "(Z)V", "j$/time/Year", "taxYear", "setTaxYear", "(Lj$/time/Year;)V", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "account", "setSourceAccount", "(Lcom/robinhood/models/db/bonfire/TransferAccount;)V", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", CreateTransferDuxo.SAVED_STATE_CONTRIBUTION_INFO, "setSinkAccount", "(Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;)V", "Lcom/robinhood/android/models/retirement/api/contributions/KeypadChip;", "chip", "onChipPress", "(Lcom/robinhood/android/models/retirement/api/contributions/KeypadChip;)V", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "frequency", "onFrequencySelected", "(Lcom/robinhood/models/api/bonfire/TransferFrequency;)V", "overrideNoEnokiAlert", "(Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionViewState$Loaded;)V", "onSubmitClicked", "onGoldSelectionRowClicked", "onBackPressed", "onAcatsClawbackAlertConfirmed", "onAcatsClawbackAlertDismissed", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/ContributionStore;", "Lcom/robinhood/analytics/EventLogger;", "Lcom/robinhood/prefs/StringPreference;", "Lcom/robinhood/android/transfers/lib/validation/TransferValidator;", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementMatchStore;", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RetirementTransfersMatchRateSelectionStore;", "Lcom/robinhood/prefs/BooleanPreference;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Ljava/util/UUID;", "sessionId", "Ljava/util/UUID;", "getSessionId", "()Ljava/util/UUID;", "setSessionId", "(Ljava/util/UUID;)V", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "analyticsScreenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getAnalyticsScreenName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/models/db/Account;", "accountRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class CreateRetirementContributionDuxo extends BaseDuxo3<CreateRetirementContributionDataState, CreateRetirementContributionViewState, CreateRetirementContributionEvent> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final BehaviorRelay<Account> accountRelay;
    private final Screen.Name analyticsScreenName;
    private final BalancesStore balancesStore;
    private final ContributionStore contributionStore;
    private final StringPreference defaultAchRelationshipPref;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final BooleanPreference hasSeenFullscreenMatchSelectionPref;
    private final TraderMarketHoursManager marketHoursManager;
    private final TraderPortfolioStore portfolioStore;
    private final RetirementMatchStore retirementMatchStore;
    private final RetirementTransfersMatchRateSelectionStore retirementTransfersMatchRateSelectionStore;
    private final SavedStateHandle savedStateHandle;
    public UUID sessionId;
    private final TransferAccountStore transferAccountStore;
    private final TransfersBonfireApi transfersBonfireApi;
    private final TransferValidator validator;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Set<MAXTransferContext.EntryPoint> entryPointsWithFullscreenMatchSelection = SetsKt.setOf((Object[]) new MAXTransferContext.EntryPoint[]{MAXTransferContext.EntryPoint.RETIREMENT_UNFUNDED_DASHBOARD, MAXTransferContext.EntryPoint.RECOMMENDATIONS_FOR_RETIREMENT});

    /* compiled from: CreateRetirementContributionDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CreateRetirementContributionViewState.ContributionCtaAction.values().length];
            try {
                iArr[CreateRetirementContributionViewState.ContributionCtaAction.SUBMIT_CONTRIBUTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CreateRetirementContributionViewState.ContributionCtaAction.CONTINUE_IN_FULLSCREEN_MATCH_SELECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CreateRetirementContributionViewState.ContributionCtaAction.CONTINUE_TO_CONTRIBUTION_AND_GOLD_AGREEMENTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CreateRetirementContributionDuxo(AccountProvider accountProvider, TransfersBonfireApi transfersBonfireApi, TransferAccountStore transferAccountStore, ContributionStore contributionStore, EventLogger eventLogger, @DefaultAchRelationship StringPreference defaultAchRelationshipPref, TransferValidator validator, TraderPortfolioStore portfolioStore, BalancesStore balancesStore, TraderMarketHoursManager marketHoursManager, ExperimentsStore experimentsStore, RetirementMatchStore retirementMatchStore, RetirementTransfersMatchRateSelectionStore retirementTransfersMatchRateSelectionStore, @HasSeenFullscreenMatchSelectionPref BooleanPreference hasSeenFullscreenMatchSelectionPref, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(contributionStore, "contributionStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(defaultAchRelationshipPref, "defaultAchRelationshipPref");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(retirementMatchStore, "retirementMatchStore");
        Intrinsics.checkNotNullParameter(retirementTransfersMatchRateSelectionStore, "retirementTransfersMatchRateSelectionStore");
        Intrinsics.checkNotNullParameter(hasSeenFullscreenMatchSelectionPref, "hasSeenFullscreenMatchSelectionPref");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        String accountNumber = ((CreateRetirementContributionFragment.Args) companion.getArgs(savedStateHandle)).getAccountNumber();
        MAXTransferContext.EntryPoint entryPoint = ((CreateRetirementContributionFragment.Args) companion.getArgs(savedStateHandle)).getEntryPoint();
        BigDecimal amount = ((CreateRetirementContributionFragment.Args) companion.getArgs(savedStateHandle)).getAmount();
        BigDecimal bigDecimal = amount == null ? BigDecimal.ZERO : amount;
        Intrinsics.checkNotNull(bigDecimal);
        super(new CreateRetirementContributionDataState(accountNumber, entryPoint, ((CreateRetirementContributionFragment.Args) companion.getArgs(savedStateHandle)).getSelectedTaxYear(), !((CreateRetirementContributionFragment.Args) companion.getArgs(savedStateHandle)).getStartInSubmitMode(), null, null, null, null, ((CreateRetirementContributionFragment.Args) companion.getArgs(savedStateHandle)).getShowFrequencyRow(), null, null, false, false, null, ((CreateRetirementContributionFragment.Args) companion.getArgs(savedStateHandle)).getShowEnokiCelebration(), bigDecimal, null, null, false, false, false, null, ((CreateRetirementContributionFragment.Args) companion.getArgs(savedStateHandle)).getMatchRateTypeOverride(), ((CreateRetirementContributionFragment.Args) companion.getArgs(savedStateHandle)).getShouldContinueInsteadOfSubmit(), false, null, false, 121585392, null), CreateRetirementContributionStateProvider.INSTANCE, duxoBundle);
        this.accountProvider = accountProvider;
        this.transfersBonfireApi = transfersBonfireApi;
        this.transferAccountStore = transferAccountStore;
        this.contributionStore = contributionStore;
        this.eventLogger = eventLogger;
        this.defaultAchRelationshipPref = defaultAchRelationshipPref;
        this.validator = validator;
        this.portfolioStore = portfolioStore;
        this.balancesStore = balancesStore;
        this.marketHoursManager = marketHoursManager;
        this.experimentsStore = experimentsStore;
        this.retirementMatchStore = retirementMatchStore;
        this.retirementTransfersMatchRateSelectionStore = retirementTransfersMatchRateSelectionStore;
        this.hasSeenFullscreenMatchSelectionPref = hasSeenFullscreenMatchSelectionPref;
        this.savedStateHandle = savedStateHandle;
        this.analyticsScreenName = Screen.Name.CREATE_RETIREMENT_CONTRIBUTION;
        BehaviorRelay<Account> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.accountRelay = behaviorRelayCreate;
    }

    public final UUID getSessionId() {
        UUID uuid = this.sessionId;
        if (uuid != null) {
            return uuid;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sessionId");
        return null;
    }

    public final void setSessionId(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<set-?>");
        this.sessionId = uuid;
    }

    public final Screen.Name getAnalyticsScreenName() {
        return this.analyticsScreenName;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        subscribeHandleError(LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{RetirementExperiments.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateRetirementContributionDuxo.onCreate$lambda$0(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        subscribeHandleError(LifecycleHost.DefaultImpls.bind$default(this, this.retirementMatchStore.streamNoPolling(), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateRetirementContributionDuxo.onCreate$lambda$1(this.f$0, (RetirementMatchRate) obj);
            }
        });
        this.accountProvider.refresh(true);
        Observables observables = Observables.INSTANCE;
        ObservableSource observableSourceSwitchMap = this.accountRelay.switchMap(new Function() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo.onCreate.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends ApiRetirementContributionsResponse> apply(Account account) {
                Intrinsics.checkNotNullParameter(account, "account");
                return CreateRetirementContributionDuxo.this.contributionStore.getContributionsScreenInfo(account.getAccountNumber()).toObservable();
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSourceSwitchMap, "switchMap(...)");
        subscribeHandleError(LifecycleHost.DefaultImpls.bind$default(this, observables.combineLatest(observableSourceSwitchMap, this.transferAccountStore.fetchIfStaleThenStream()), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateRetirementContributionDuxo.onCreate$lambda$2(this.f$0, (Tuples2) obj);
            }
        });
        Observable<R> observableSwitchMap = this.accountRelay.switchMap(new Function() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo.onCreate.5
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<Portfolio, UnifiedBalances>> apply(Account account) {
                Intrinsics.checkNotNullParameter(account, "account");
                PortfolioStore.DefaultImpls.refreshPortfolio$default(CreateRetirementContributionDuxo.this.portfolioStore, account.getAccountNumber(), false, 2, null);
                BalancesStore.refreshAccount$default(CreateRetirementContributionDuxo.this.balancesStore, account.getAccountNumber(), false, 2, null);
                Observables observables2 = Observables.INSTANCE;
                Observable<Portfolio> portfolio = CreateRetirementContributionDuxo.this.portfolioStore.getPortfolio(account.getAccountNumber());
                CreateRetirementContributionDuxo createRetirementContributionDuxo = CreateRetirementContributionDuxo.this;
                return observables2.combineLatest(portfolio, createRetirementContributionDuxo.asObservable(createRetirementContributionDuxo.balancesStore.streamSelectedAccountUnifiedBalances(account)));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        subscribeHandleError(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateRetirementContributionDuxo.onCreate$lambda$3(this.f$0, (Tuples2) obj);
            }
        });
        getLifecycleScope().launchWhenCreated(new C310427(null));
        refresh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(CreateRetirementContributionDuxo createRetirementContributionDuxo, boolean z) {
        createRetirementContributionDuxo.applyMutation(new CreateRetirementContributionDuxo$onCreate$1$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(CreateRetirementContributionDuxo createRetirementContributionDuxo, RetirementMatchRate matchRates) {
        Intrinsics.checkNotNullParameter(matchRates, "matchRates");
        createRetirementContributionDuxo.applyMutation(new CreateRetirementContributionDuxo$onCreate$2$1(matchRates, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(CreateRetirementContributionDuxo createRetirementContributionDuxo, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        createRetirementContributionDuxo.applyMutation(new CreateRetirementContributionDuxo$onCreate$4$1((ApiRetirementContributionsResponse) tuples2.component1(), (List) tuples2.component2(), createRetirementContributionDuxo, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(CreateRetirementContributionDuxo createRetirementContributionDuxo, Tuples2 tuples2) {
        createRetirementContributionDuxo.applyMutation(new CreateRetirementContributionDuxo$onCreate$6$1((Portfolio) tuples2.component1(), (UnifiedBalances) tuples2.component2(), createRetirementContributionDuxo, null));
        return Unit.INSTANCE;
    }

    /* compiled from: CreateRetirementContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$onCreate$7", m3645f = "CreateRetirementContributionDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$onCreate$7 */
    static final class C310427 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C310427(Continuation<? super C310427> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRetirementContributionDuxo.this.new C310427(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C310427) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ApiGoldMatchSelectionRow view_model;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Exception unused) {
                view_model = null;
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (!CreateRetirementContributionDuxo.entryPointsWithFullscreenMatchSelection.contains(((CreateRetirementContributionFragment.Args) CreateRetirementContributionDuxo.INSTANCE.getArgs((HasSavedState) CreateRetirementContributionDuxo.this)).getEntryPoint()) || CreateRetirementContributionDuxo.this.hasSeenFullscreenMatchSelectionPref.get()) {
                    RetirementTransfersMatchRateSelectionStore retirementTransfersMatchRateSelectionStore = CreateRetirementContributionDuxo.this.retirementTransfersMatchRateSelectionStore;
                    this.label = 1;
                    obj = retirementTransfersMatchRateSelectionStore.getGoldMatchSelectionRow(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    CreateRetirementContributionDuxo.this.applyMutation(new AnonymousClass2(null));
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            view_model = ((ApiGoldMatchSelectionRowResponse) obj).getView_model();
            CreateRetirementContributionDuxo.this.applyMutation(new AnonymousClass1(view_model, null));
            return Unit.INSTANCE;
        }

        /* compiled from: CreateRetirementContributionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$onCreate$7$1", m3645f = "CreateRetirementContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$onCreate$7$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CreateRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState>, Object> {
            final /* synthetic */ ApiGoldMatchSelectionRow $matchSelectionRow;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ApiGoldMatchSelectionRow apiGoldMatchSelectionRow, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$matchSelectionRow = apiGoldMatchSelectionRow;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$matchSelectionRow, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CreateRetirementContributionDataState createRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState> continuation) {
                return ((AnonymousClass1) create(createRetirementContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CreateRetirementContributionDataState.copy$default((CreateRetirementContributionDataState) this.L$0, null, null, null, false, null, null, null, null, false, null, null, false, false, null, false, null, null, null, false, false, false, null, null, false, true, this.$matchSelectionRow, false, 83886079, null);
            }
        }

        /* compiled from: CreateRetirementContributionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$onCreate$7$2", m3645f = "CreateRetirementContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$onCreate$7$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CreateRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CreateRetirementContributionDataState createRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState> continuation) {
                return ((AnonymousClass2) create(createRetirementContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CreateRetirementContributionDataState.copy$default((CreateRetirementContributionDataState) this.L$0, null, null, null, false, null, null, null, null, false, null, null, false, false, null, false, null, null, null, false, false, false, null, null, false, true, null, false, 117440511, null);
            }
        }
    }

    /* compiled from: CreateRetirementContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$refresh$1", m3645f = "CreateRetirementContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$refresh$1 */
    static final class C310481 extends ContinuationImpl7 implements Function2<CreateRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C310481(Continuation<? super C310481> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C310481 c310481 = CreateRetirementContributionDuxo.this.new C310481(continuation);
            c310481.L$0 = obj;
            return c310481;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateRetirementContributionDataState createRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState> continuation) {
            return ((C310481) create(createRetirementContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreateRetirementContributionDataState createRetirementContributionDataState = (CreateRetirementContributionDataState) this.L$0;
            CreateRetirementContributionDuxo createRetirementContributionDuxo = CreateRetirementContributionDuxo.this;
            Single<Account> singleFirstOrError = createRetirementContributionDuxo.accountProvider.streamAccount(createRetirementContributionDataState.getAccountNumber()).firstOrError();
            Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
            createRetirementContributionDuxo.subscribeHandleError(LifecycleHost.DefaultImpls.bind$default(createRetirementContributionDuxo, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null), new AnonymousClass1(CreateRetirementContributionDuxo.this.accountRelay));
            return CreateRetirementContributionDataState.copy$default(createRetirementContributionDataState, null, null, null, false, null, null, null, null, false, null, null, false, false, null, false, null, null, null, false, false, false, null, null, false, false, null, false, 66976255, null);
        }

        /* compiled from: CreateRetirementContributionDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$refresh$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Account, Unit> {
            AnonymousClass1(Object obj) {
                super(1, obj, BehaviorRelay.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Account account) {
                invoke2(account);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Account p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((BehaviorRelay) this.receiver).accept(p0);
            }
        }
    }

    public final void refresh() {
        applyMutation(new C310481(null));
    }

    /* compiled from: CreateRetirementContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$consumeKeyEvent$1", m3645f = "CreateRetirementContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$consumeKeyEvent$1 */
    static final class C310331 extends ContinuationImpl7 implements Function2<CreateRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState>, Object> {
        final /* synthetic */ KeyEvent $keyEvent;
        final /* synthetic */ CreateRetirementContributionViewState.Loaded $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C310331(CreateRetirementContributionViewState.Loaded loaded, KeyEvent keyEvent, Continuation<? super C310331> continuation) {
            super(2, continuation);
            this.$state = loaded;
            this.$keyEvent = keyEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C310331 c310331 = new C310331(this.$state, this.$keyEvent, continuation);
            c310331.L$0 = obj;
            return c310331;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateRetirementContributionDataState createRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState> continuation) {
            return ((C310331) create(createRetirementContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreateRetirementContributionDataState createRetirementContributionDataState = (CreateRetirementContributionDataState) this.L$0;
            DollarInputConsumer dollarInputConsumer = new DollarInputConsumer(this.$state.getAmountRemainingUntilLimit(), true);
            BigDecimal contributionAmount = this.$state.getContributionAmount();
            char[] charArray = this.$state.getUserInputString().toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            InputKeyEventConsumer.InputState<BigDecimal> inputStateConsume = dollarInputConsumer.consume(new InputKeyEventConsumer.InputState(contributionAmount, charArray), this.$keyEvent);
            return CreateRetirementContributionDataState.copy$default(createRetirementContributionDataState, null, null, null, false, null, null, null, null, false, null, null, false, false, null, false, inputStateConsume.component1(), new String(inputStateConsume.getInput()), null, false, false, false, null, null, false, false, null, false, 134119423, null);
        }
    }

    public final void consumeKeyEvent(KeyEvent keyEvent, CreateRetirementContributionViewState.Loaded state) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        Intrinsics.checkNotNullParameter(state, "state");
        applyMutation(new C310331(state, keyEvent, null));
    }

    /* compiled from: CreateRetirementContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$onContinueClicked$1", m3645f = "CreateRetirementContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$onContinueClicked$1 */
    static final class C310391 extends ContinuationImpl7 implements Function2<CreateRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C310391(Continuation<? super C310391> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C310391 c310391 = CreateRetirementContributionDuxo.this.new C310391(continuation);
            c310391.L$0 = obj;
            return c310391;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateRetirementContributionDataState createRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState> continuation) {
            return ((C310391) create(createRetirementContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CreateRetirementContributionDataState createRetirementContributionDataState = (CreateRetirementContributionDataState) this.L$0;
                EventLogger eventLogger = CreateRetirementContributionDuxo.this.eventLogger;
                BigDecimal userInputAmount = createRetirementContributionDataState.getUserInputAmount();
                Screen.Name analyticsScreenName = CreateRetirementContributionDuxo.this.getAnalyticsScreenName();
                Companion companion = CreateRetirementContributionDuxo.INSTANCE;
                CreateTransferLogging.logAmountEntered$default(eventLogger, userInputAmount, analyticsScreenName, ((CreateRetirementContributionFragment.Args) companion.getArgs((HasSavedState) CreateRetirementContributionDuxo.this)).getEntryPoint(), null, 8, null);
                if (createRetirementContributionDataState.getReviewShouldLaunchMatchRateSelection()) {
                    CreateRetirementContributionDuxo.this.submit(new CreateRetirementContributionEvent.LaunchGoldMatchFlow(new MatchSelectionActivity.Extras(new MatchSelectionActivity.Extras.LaunchMode.MatchRateSelection(createRetirementContributionDataState.getAccountNumber(), createRetirementContributionDataState.getUserInputAmount(), createRetirementContributionDataState.getTaxYear(), ((CreateRetirementContributionFragment.Args) companion.getArgs((HasSavedState) CreateRetirementContributionDuxo.this)).getEntryPoint(), ((CreateRetirementContributionFragment.Args) companion.getArgs((HasSavedState) CreateRetirementContributionDuxo.this)).getShowEnokiCelebration(), ((CreateRetirementContributionFragment.Args) companion.getArgs((HasSavedState) CreateRetirementContributionDuxo.this)).getShowFrequencyRow()))));
                    return CreateRetirementContributionDataState.copy$default(createRetirementContributionDataState, null, null, null, false, null, null, null, null, false, null, null, false, false, null, false, null, null, null, false, false, false, null, null, false, false, null, false, 134217727, null);
                }
                return CreateRetirementContributionDataState.copy$default(createRetirementContributionDataState, null, null, null, false, null, null, null, null, false, null, null, false, false, null, false, null, null, null, false, false, false, null, null, false, false, null, false, 134217719, null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void onContinueClicked() {
        applyMutation(new C310391(null));
    }

    /* compiled from: CreateRetirementContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$setEditMode$1", m3645f = "CreateRetirementContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$setEditMode$1 */
    static final class C310491 extends ContinuationImpl7 implements Function2<CreateRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState>, Object> {
        final /* synthetic */ boolean $isInEditMode;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C310491(boolean z, Continuation<? super C310491> continuation) {
            super(2, continuation);
            this.$isInEditMode = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C310491 c310491 = new C310491(this.$isInEditMode, continuation);
            c310491.L$0 = obj;
            return c310491;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateRetirementContributionDataState createRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState> continuation) {
            return ((C310491) create(createRetirementContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CreateRetirementContributionDataState.copy$default((CreateRetirementContributionDataState) this.L$0, null, null, null, this.$isInEditMode, null, null, null, null, false, null, null, false, false, null, false, null, null, null, false, false, false, null, null, false, false, null, false, 134217719, null);
        }
    }

    public final void setEditMode(boolean isInEditMode) {
        applyMutation(new C310491(isInEditMode, null));
    }

    /* compiled from: CreateRetirementContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$setTaxYear$1", m3645f = "CreateRetirementContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$setTaxYear$1 */
    static final class C310521 extends ContinuationImpl7 implements Function2<CreateRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState>, Object> {
        final /* synthetic */ Year $taxYear;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CreateRetirementContributionDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C310521(Year year, CreateRetirementContributionDuxo createRetirementContributionDuxo, Continuation<? super C310521> continuation) {
            super(2, continuation);
            this.$taxYear = year;
            this.this$0 = createRetirementContributionDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C310521 c310521 = new C310521(this.$taxYear, this.this$0, continuation);
            c310521.L$0 = obj;
            return c310521;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateRetirementContributionDataState createRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState> continuation) {
            return ((C310521) create(createRetirementContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreateRetirementContributionDataState createRetirementContributionDataState = (CreateRetirementContributionDataState) this.L$0;
            if (this.$taxYear == null && createRetirementContributionDataState.getTaxYear() == null) {
                this.this$0.submit(CreateRetirementContributionEvent.FinishEvent.INSTANCE);
            }
            Year taxYear = this.$taxYear;
            if (taxYear == null) {
                taxYear = createRetirementContributionDataState.getTaxYear();
            }
            return CreateRetirementContributionDataState.copy$default(createRetirementContributionDataState, null, null, taxYear, false, null, null, null, null, false, null, null, false, false, null, false, null, null, null, false, false, false, null, null, false, false, null, false, 134217723, null);
        }
    }

    public final void setTaxYear(Year taxYear) {
        applyMutation(new C310521(taxYear, this, null));
    }

    public final void setSourceAccount(TransferAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        CreateTransferLogging.logAccountSelected$default(this.eventLogger, account, TransferAccountDirection.SOURCE, null, null, this.analyticsScreenName, ((CreateRetirementContributionFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getEntryPoint(), null, 76, null);
        applyMutation(new C310511(account, null));
    }

    /* compiled from: CreateRetirementContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$setSourceAccount$1", m3645f = "CreateRetirementContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$setSourceAccount$1 */
    static final class C310511 extends ContinuationImpl7 implements Function2<CreateRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState>, Object> {
        final /* synthetic */ TransferAccount $account;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C310511(TransferAccount transferAccount, Continuation<? super C310511> continuation) {
            super(2, continuation);
            this.$account = transferAccount;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C310511 c310511 = new C310511(this.$account, continuation);
            c310511.L$0 = obj;
            return c310511;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateRetirementContributionDataState createRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState> continuation) {
            return ((C310511) create(createRetirementContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CreateRetirementContributionDataState.copy$default((CreateRetirementContributionDataState) this.L$0, null, null, null, false, null, this.$account, null, null, false, null, null, false, false, null, false, null, null, null, false, false, false, null, null, false, false, null, false, 134217695, null);
        }
    }

    public final void setSinkAccount(TransferAccount account, IraContributionQuestionnaireResult.IraContribution iraContribution) {
        Intrinsics.checkNotNullParameter(account, "account");
        CreateTransferLogging.logAccountSelected$default(this.eventLogger, account, TransferAccountDirection.SINK, iraContribution != null ? iraContribution.toIraContributionData() : null, null, this.analyticsScreenName, ((CreateRetirementContributionFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getEntryPoint(), null, 72, null);
        applyMutation(new C310501(iraContribution, this, account, null));
    }

    /* compiled from: CreateRetirementContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$setSinkAccount$1", m3645f = "CreateRetirementContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$setSinkAccount$1 */
    static final class C310501 extends ContinuationImpl7 implements Function2<CreateRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState>, Object> {
        final /* synthetic */ TransferAccount $account;
        final /* synthetic */ IraContributionQuestionnaireResult.IraContribution $iraContribution;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CreateRetirementContributionDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C310501(IraContributionQuestionnaireResult.IraContribution iraContribution, CreateRetirementContributionDuxo createRetirementContributionDuxo, TransferAccount transferAccount, Continuation<? super C310501> continuation) {
            super(2, continuation);
            this.$iraContribution = iraContribution;
            this.this$0 = createRetirementContributionDuxo;
            this.$account = transferAccount;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C310501 c310501 = new C310501(this.$iraContribution, this.this$0, this.$account, continuation);
            c310501.L$0 = obj;
            return c310501;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateRetirementContributionDataState createRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState> continuation) {
            return ((C310501) create(createRetirementContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final CreateRetirementContributionDataState createRetirementContributionDataState = (CreateRetirementContributionDataState) this.L$0;
            if (this.$iraContribution instanceof IraContributionQuestionnaireResult.IraContribution.IndirectRollover) {
                final CreateRetirementContributionDuxo createRetirementContributionDuxo = this.this$0;
                final TransferAccount transferAccount = this.$account;
                createRetirementContributionDuxo.withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$setSinkAccount$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CreateRetirementContributionDuxo.C310501.invokeSuspend$lambda$1(createRetirementContributionDataState, transferAccount, createRetirementContributionDuxo, (CreateRetirementContributionDataState) obj2);
                    }
                });
            }
            if (!Intrinsics.areEqual(this.$account.getAccountNumber(), createRetirementContributionDataState.getAccountNumber())) {
                this.this$0.refresh();
            }
            return CreateRetirementContributionDataState.copy$default(createRetirementContributionDataState, this.$account.getAccountNumber(), null, null, false, null, null, this.$account, null, false, null, null, false, false, null, false, null, null, null, false, false, false, null, null, false, false, null, false, 134217662, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(CreateRetirementContributionDataState createRetirementContributionDataState, TransferAccount transferAccount, CreateRetirementContributionDuxo createRetirementContributionDuxo, CreateRetirementContributionDataState createRetirementContributionDataState2) {
            BigDecimal userInputAmount = createRetirementContributionDataState.getUserInputAmount();
            TransferAccount sourceAccount = createRetirementContributionDataState.getSourceAccount();
            createRetirementContributionDuxo.submit(new CreateRetirementContributionEvent.StartRolloverEvent(new TransferConfiguration.IraContribution(userInputAmount, null, sourceAccount != null ? new TransferConfiguration.TransferAccountSelection(sourceAccount.getAccountId(), false, sourceAccount.getType(), 2, null) : null, new TransferConfiguration.TransferAccountSelection(transferAccount.getAccountId(), false, transferAccount.getType(), 2, null), IraContributionType.INDIRECT_ROLLOVER, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, null)));
            return Unit.INSTANCE;
        }
    }

    public final void onChipPress(KeypadChip chip) {
        Intrinsics.checkNotNullParameter(chip, "chip");
        CreateTransferLogging.logAmountEntered$default(this.eventLogger, chip.getValue().getDecimalValue(), this.analyticsScreenName, ((CreateRetirementContributionFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getEntryPoint(), null, 8, null);
        applyMutation(new C310381(chip, null));
    }

    /* compiled from: CreateRetirementContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$onChipPress$1", m3645f = "CreateRetirementContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$onChipPress$1 */
    static final class C310381 extends ContinuationImpl7 implements Function2<CreateRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState>, Object> {
        final /* synthetic */ KeypadChip $chip;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C310381(KeypadChip keypadChip, Continuation<? super C310381> continuation) {
            super(2, continuation);
            this.$chip = keypadChip;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C310381 c310381 = CreateRetirementContributionDuxo.this.new C310381(this.$chip, continuation);
            c310381.L$0 = obj;
            return c310381;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateRetirementContributionDataState createRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState> continuation) {
            return ((C310381) create(createRetirementContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreateRetirementContributionDataState createRetirementContributionDataState = (CreateRetirementContributionDataState) this.L$0;
            if (createRetirementContributionDataState.getReviewShouldLaunchMatchRateSelection()) {
                CreateRetirementContributionDuxo createRetirementContributionDuxo = CreateRetirementContributionDuxo.this;
                String accountNumber = createRetirementContributionDataState.getAccountNumber();
                BigDecimal decimalValue = this.$chip.getValue().getDecimalValue();
                Year taxYear = createRetirementContributionDataState.getTaxYear();
                Companion companion = CreateRetirementContributionDuxo.INSTANCE;
                createRetirementContributionDuxo.submit(new CreateRetirementContributionEvent.LaunchGoldMatchFlow(new MatchSelectionActivity.Extras(new MatchSelectionActivity.Extras.LaunchMode.MatchRateSelection(accountNumber, decimalValue, taxYear, ((CreateRetirementContributionFragment.Args) companion.getArgs((HasSavedState) CreateRetirementContributionDuxo.this)).getEntryPoint(), ((CreateRetirementContributionFragment.Args) companion.getArgs((HasSavedState) CreateRetirementContributionDuxo.this)).getShowEnokiCelebration(), ((CreateRetirementContributionFragment.Args) companion.getArgs((HasSavedState) CreateRetirementContributionDuxo.this)).getShowFrequencyRow()))));
                BigDecimal decimalValue2 = this.$chip.getValue().getDecimalValue();
                NumberFormatter strikePriceFormat = Formats.getStrikePriceFormat();
                BigDecimal bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(this.$chip.getValue().getDecimalValue());
                Intrinsics.checkNotNullExpressionValue(bigDecimalM822m, "stripTrailingZeros(...)");
                return CreateRetirementContributionDataState.copy$default(createRetirementContributionDataState, null, null, null, false, null, null, null, null, false, null, null, false, false, null, false, decimalValue2, strikePriceFormat.format(bigDecimalM822m), null, false, false, false, null, null, false, false, null, false, 134119423, null);
            }
            BigDecimal decimalValue3 = this.$chip.getValue().getDecimalValue();
            NumberFormatter strikePriceFormat2 = Formats.getStrikePriceFormat();
            BigDecimal bigDecimalM822m2 = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(this.$chip.getValue().getDecimalValue());
            Intrinsics.checkNotNullExpressionValue(bigDecimalM822m2, "stripTrailingZeros(...)");
            return CreateRetirementContributionDataState.copy$default(createRetirementContributionDataState, null, null, null, false, null, null, null, null, false, null, null, false, false, null, false, decimalValue3, strikePriceFormat2.format(bigDecimalM822m2), null, false, false, false, null, null, false, false, null, false, 134119415, null);
        }
    }

    /* compiled from: CreateRetirementContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$onFrequencySelected$1", m3645f = "CreateRetirementContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$onFrequencySelected$1 */
    static final class C310431 extends ContinuationImpl7 implements Function2<CreateRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState>, Object> {
        final /* synthetic */ ApiCreateTransferRequest2 $frequency;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C310431(ApiCreateTransferRequest2 apiCreateTransferRequest2, Continuation<? super C310431> continuation) {
            super(2, continuation);
            this.$frequency = apiCreateTransferRequest2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C310431 c310431 = new C310431(this.$frequency, continuation);
            c310431.L$0 = obj;
            return c310431;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateRetirementContributionDataState createRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState> continuation) {
            return ((C310431) create(createRetirementContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CreateRetirementContributionDataState.copy$default((CreateRetirementContributionDataState) this.L$0, null, null, null, false, null, null, null, this.$frequency, false, null, null, false, false, null, false, null, null, null, false, false, false, null, null, false, false, null, false, 134217599, null);
        }
    }

    public final void onFrequencySelected(ApiCreateTransferRequest2 frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        CreateTransferLogging.logFrequencySelected(this.eventLogger, frequency, this.analyticsScreenName);
        applyMutation(new C310431(frequency, null));
    }

    /* compiled from: CreateRetirementContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$overrideNoEnokiAlert$1", m3645f = "CreateRetirementContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$overrideNoEnokiAlert$1 */
    static final class C310461 extends ContinuationImpl7 implements Function2<CreateRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C310461(Continuation<? super C310461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C310461 c310461 = new C310461(continuation);
            c310461.L$0 = obj;
            return c310461;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateRetirementContributionDataState createRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState> continuation) {
            return ((C310461) create(createRetirementContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CreateRetirementContributionDataState.copy$default((CreateRetirementContributionDataState) this.L$0, null, null, null, false, null, null, null, null, false, null, null, false, false, null, false, null, null, null, false, true, false, null, null, false, false, null, false, 133693439, null);
        }
    }

    public final void overrideNoEnokiAlert(CreateRetirementContributionViewState.Loaded state) {
        Intrinsics.checkNotNullParameter(state, "state");
        applyMutation(new C310461(null));
        onSubmitClicked(state);
    }

    public final void onSubmitClicked(CreateRetirementContributionViewState.Loaded state) {
        String accountId;
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.isContributionRequestLoading()) {
            return;
        }
        ValidationFailure error$default = TransferValidator.getError$default(this.validator, TransferValidationInputUtils.transferValidationInput(getSessionId(), state), null, 2, null);
        if (error$default != null) {
            submit(new CreateRetirementContributionEvent.ValidationFailureEvent(error$default));
            applyMutation(new C310451(null));
            return;
        }
        TransferAccount sourceAccount = state.getSourceAccount();
        if (sourceAccount == null || (accountId = sourceAccount.getAccountId()) == null) {
            return;
        }
        ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount = new ApiCreateTransferRequest.ApiTransferAccount(accountId, state.getSourceAccount().getType(), null, null, 12, null);
        ApiCreateTransferRequest.ApiTransferAccount apiTransferAccount2 = new ApiCreateTransferRequest.ApiTransferAccount(state.getSinkAccount().getAccountId(), state.getSinkAccount().getType(), null, null, 12, null);
        TransferData transferData = new TransferData(state.getContributionAmount(), state.getFrequency(), apiTransferAccount, apiTransferAccount2, state.getIraContribution().toIraContributionData(), null, null, null, 128, null);
        UUID uuidRandomUUID = state.getTransferDataToRefId().get(transferData);
        if (uuidRandomUUID == null) {
            uuidRandomUUID = UUID.randomUUID();
        }
        UUID uuid = uuidRandomUUID;
        ApiCreateTransferRequest.ApiTransferAdditionalData apiTransferAdditionalData = new ApiCreateTransferRequest.ApiTransferAdditionalData(null, state.getIraContribution().toIraContributionData(), null, null, state.getEntryPoint().getValue(), null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 2097133, null);
        Intrinsics.checkNotNull(uuid);
        ContributionBundle contributionBundle = new ContributionBundle(new ApiCreateTransferRequest(uuid, state.getContributionAmount(), apiTransferAccount, apiTransferAccount2, state.getFrequency(), Boolean.FALSE, apiTransferAdditionalData, !state.getShowEnokiCelebration() ? new ApiCreateTransferRequest.ApiPostTransferPageConfig(CollectionsKt.listOf(ApiPostTransferPage.PostTransferPageType.IRA_CONTRIBUTION_CELEBRATION)) : null, null, null, null, false, null, 7936, null), transferData, TransferData2.toLoggingContext$default(transferData, uuid, ((CreateRetirementContributionFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getEntryPoint(), null, null, null, 28, null), uuid, state.getSourceAccount(), state.getSinkAccount());
        int i = WhenMappings.$EnumSwitchMapping$0[state.getCtaAction().ordinal()];
        if (i == 1) {
            preCreateTransferThenMakeContributionRequest(contributionBundle);
            applyMutation(new CreateRetirementContributionDuxo$onSubmitClicked$2$1(transferData, uuid, null));
        } else if (i == 2) {
            submit(new CreateRetirementContributionEvent.ContinueInFullscreenMatchSelection(contributionBundle));
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            submit(new CreateRetirementContributionEvent.LaunchGoldMatchFlow(new MatchSelectionActivity.Extras(new MatchSelectionActivity.Extras.LaunchMode.ContributionAndAgreement(contributionBundle))));
        }
    }

    /* compiled from: CreateRetirementContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$onSubmitClicked$1", m3645f = "CreateRetirementContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$onSubmitClicked$1 */
    static final class C310451 extends ContinuationImpl7 implements Function2<CreateRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C310451(Continuation<? super C310451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C310451 c310451 = new C310451(continuation);
            c310451.L$0 = obj;
            return c310451;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateRetirementContributionDataState createRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState> continuation) {
            return ((C310451) create(createRetirementContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CreateRetirementContributionDataState.copy$default((CreateRetirementContributionDataState) this.L$0, null, null, null, false, null, null, null, null, false, null, null, false, false, null, false, null, null, null, false, false, false, null, null, false, false, null, false, 134213631, null);
        }
    }

    /* compiled from: CreateRetirementContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$onGoldSelectionRowClicked$1", m3645f = "CreateRetirementContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$onGoldSelectionRowClicked$1 */
    static final class C310441 extends ContinuationImpl7 implements Function2<CreateRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C310441(Continuation<? super C310441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C310441 c310441 = new C310441(continuation);
            c310441.L$0 = obj;
            return c310441;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateRetirementContributionDataState createRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState> continuation) {
            return ((C310441) create(createRetirementContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CreateRetirementContributionDataState.copy$default((CreateRetirementContributionDataState) this.L$0, null, null, null, false, null, null, null, null, false, null, null, false, false, null, false, null, null, null, false, false, false, null, null, false, false, null, !r2.getGoldMatchSelectionRowSelected(), 67108863, null);
        }
    }

    public final void onGoldSelectionRowClicked() {
        applyMutation(new C310441(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void makeContributionRequest(final ContributionBundle contributionBundle) {
        final MAXTransferContext loggingContext = contributionBundle.getLoggingContext();
        Single singleDoOnSubscribe = EventLoggers.logResponseMetadataAndUnwrap(this.eventLogger, RxFactory.DefaultImpls.rxSingle$default(this, null, new C310341(contributionBundle, null), 1, null), new Function1() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateRetirementContributionDuxo.makeContributionRequest$lambda$5(loggingContext, this, (Response) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateRetirementContributionDuxo.makeContributionRequest$lambda$6(loggingContext, this, (Throwable) obj);
            }
        }).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo.makeContributionRequest.4
            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                CreateTransferLogging.logTransferSubmit$default(CreateRetirementContributionDuxo.this.eventLogger, contributionBundle.getTransferData(), contributionBundle.getRefId(), CreateRetirementContributionDuxo.this.getSessionId(), contributionBundle.getSourceAccount(), contributionBundle.getSinkAccount(), CreateRetirementContributionDuxo.this.getAnalyticsScreenName(), ((CreateRetirementContributionFragment.Args) CreateRetirementContributionDuxo.INSTANCE.getArgs((HasSavedState) CreateRetirementContributionDuxo.this)).getEntryPoint(), null, null, null, 896, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateRetirementContributionDuxo.makeContributionRequest$lambda$7(this.f$0, contributionBundle, (ApiCreateTransferResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateRetirementContributionDuxo.makeContributionRequest$lambda$8(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: CreateRetirementContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$makeContributionRequest$1", m3645f = "CreateRetirementContributionDuxo.kt", m3646l = {519}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$makeContributionRequest$1 */
    static final class C310341 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Response<ApiCreateTransferResponse>>, Object> {
        final /* synthetic */ ContributionBundle $contributionBundle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C310341(ContributionBundle contributionBundle, Continuation<? super C310341> continuation) {
            super(2, continuation);
            this.$contributionBundle = contributionBundle;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRetirementContributionDuxo.this.new C310341(this.$contributionBundle, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Response<ApiCreateTransferResponse>> continuation) {
            return ((C310341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            TransfersBonfireApi transfersBonfireApi = CreateRetirementContributionDuxo.this.transfersBonfireApi;
            ApiCreateTransferRequest transferRequest = this.$contributionBundle.getTransferRequest();
            this.label = 1;
            Object objCreateTransfer = transfersBonfireApi.createTransfer(transferRequest, this);
            return objCreateTransfer == coroutine_suspended ? coroutine_suspended : objCreateTransfer;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventData makeContributionRequest$lambda$5(MAXTransferContext mAXTransferContext, CreateRetirementContributionDuxo createRetirementContributionDuxo, Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CreateTransferLogging.createTransferSuccessEvent$default(it, mAXTransferContext, null, createRetirementContributionDuxo.analyticsScreenName, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventData makeContributionRequest$lambda$6(MAXTransferContext mAXTransferContext, CreateRetirementContributionDuxo createRetirementContributionDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CreateTransferLogging.createTransferErrorEvent$default(it, mAXTransferContext, null, createRetirementContributionDuxo.analyticsScreenName, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeContributionRequest$lambda$7(CreateRetirementContributionDuxo createRetirementContributionDuxo, ContributionBundle contributionBundle, ApiCreateTransferResponse apiCreateTransferResponse) {
        Intrinsics.checkNotNull(apiCreateTransferResponse);
        createRetirementContributionDuxo.submit(new CreateRetirementContributionEvent.CreateContributionSuccessEvent(PostTransferFlow2.toUiModel(apiCreateTransferResponse, contributionBundle.getTransferData().getSinkAccount().getType())));
        createRetirementContributionDuxo.applyMutation(new CreateRetirementContributionDuxo$makeContributionRequest$5$1(null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeContributionRequest$lambda$8(CreateRetirementContributionDuxo createRetirementContributionDuxo, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        createRetirementContributionDuxo.submit(new CreateRetirementContributionEvent.CreateContributionErrorEvent(throwable));
        createRetirementContributionDuxo.applyMutation(new CreateRetirementContributionDuxo$makeContributionRequest$6$1(null));
        return Unit.INSTANCE;
    }

    /* compiled from: CreateRetirementContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$preCreateTransferThenMakeContributionRequest$1", m3645f = "CreateRetirementContributionDuxo.kt", m3646l = {565}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$preCreateTransferThenMakeContributionRequest$1 */
    static final class C310471 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ContributionBundle $contributionBundle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C310471(ContributionBundle contributionBundle, Continuation<? super C310471> continuation) {
            super(2, continuation);
            this.$contributionBundle = contributionBundle;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateRetirementContributionDuxo.this.new C310471(this.$contributionBundle, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C310471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ApiPreCreateTransferResponse apiPreCreateTransferResponse;
            AlertAction<DisplayRTPUpsellAction> sduiAlertAction;
            List<ApiPreCreateTransferSduiContainer> preTransferActions;
            Object next;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TransfersBonfireApi transfersBonfireApi = CreateRetirementContributionDuxo.this.transfersBonfireApi;
                    ApiCreateTransferRequest transferRequest = this.$contributionBundle.getTransferRequest();
                    this.label = 1;
                    obj = transfersBonfireApi.getPreCreateTransferContent(transferRequest, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                apiPreCreateTransferResponse = (ApiPreCreateTransferResponse) obj;
            } catch (Throwable unused) {
                apiPreCreateTransferResponse = null;
            }
            if (apiPreCreateTransferResponse == null || (preTransferActions = apiPreCreateTransferResponse.getPreTransferActions()) == null) {
                sduiAlertAction = null;
            } else {
                Iterator<T> it = preTransferActions.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((ApiPreCreateTransferSduiContainer) next).getType() == PreCreatePopupType.ACATS_CLAWBACK_ALERT) {
                        break;
                    }
                }
                ApiPreCreateTransferSduiContainer apiPreCreateTransferSduiContainer = (ApiPreCreateTransferSduiContainer) next;
                if (apiPreCreateTransferSduiContainer != null) {
                    sduiAlertAction = apiPreCreateTransferSduiContainer.getSduiAlertAction();
                }
            }
            if (sduiAlertAction == null) {
                CreateRetirementContributionDuxo.this.makeContributionRequest(this.$contributionBundle);
            } else {
                CreateRetirementContributionDuxo.this.submit(new CreateRetirementContributionEvent.ShowAcatsClawbackAlert(sduiAlertAction, this.$contributionBundle));
                CreateRetirementContributionDuxo.this.applyMutation(new AnonymousClass1(null));
            }
            return Unit.INSTANCE;
        }

        /* compiled from: CreateRetirementContributionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$preCreateTransferThenMakeContributionRequest$1$1", m3645f = "CreateRetirementContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$preCreateTransferThenMakeContributionRequest$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CreateRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CreateRetirementContributionDataState createRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState> continuation) {
                return ((AnonymousClass1) create(createRetirementContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CreateRetirementContributionDataState.copy$default((CreateRetirementContributionDataState) this.L$0, null, null, null, false, null, null, null, null, false, null, null, false, false, null, false, null, null, null, false, false, false, null, null, false, false, null, false, 134213631, null);
            }
        }
    }

    private final void preCreateTransferThenMakeContributionRequest(ContributionBundle contributionBundle) {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C310471(contributionBundle, null), 3, null);
    }

    /* compiled from: CreateRetirementContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$onBackPressed$1", m3645f = "CreateRetirementContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$onBackPressed$1 */
    static final class C310371 extends ContinuationImpl7 implements Function2<CreateRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C310371(Continuation<? super C310371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C310371 c310371 = CreateRetirementContributionDuxo.this.new C310371(continuation);
            c310371.L$0 = obj;
            return c310371;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateRetirementContributionDataState createRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState> continuation) {
            return ((C310371) create(createRetirementContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreateRetirementContributionDataState createRetirementContributionDataState = (CreateRetirementContributionDataState) this.L$0;
            if (createRetirementContributionDataState.isInEditMode()) {
                if (createRetirementContributionDataState.getEntryPoint() == MAXTransferContext.EntryPoint.RETIREMENT_UNFUNDED_LEARN_AND_EARN_EDUCATION_LESSON) {
                    CreateRetirementContributionDuxo.this.submit(CreateRetirementContributionEvent.ShowRewardReminder.INSTANCE);
                } else {
                    CreateRetirementContributionDuxo.this.submit(CreateRetirementContributionEvent.BackEvent.INSTANCE);
                }
            } else if (((CreateRetirementContributionFragment.Args) CreateRetirementContributionDuxo.INSTANCE.getArgs((HasSavedState) CreateRetirementContributionDuxo.this)).getStartInSubmitMode()) {
                CreateRetirementContributionDuxo.this.submit(CreateRetirementContributionEvent.BackEvent.INSTANCE);
            }
            return CreateRetirementContributionDataState.copy$default(createRetirementContributionDataState, null, null, null, true, null, null, null, null, false, null, null, false, false, null, false, null, null, null, false, false, false, null, null, false, false, null, false, 134217719, null);
        }
    }

    public final void onBackPressed() {
        applyMutation(new C310371(null));
    }

    public final void onAcatsClawbackAlertConfirmed(ContributionBundle contributionBundle) {
        Intrinsics.checkNotNullParameter(contributionBundle, "contributionBundle");
        PreCreateLoggingEvents.logPreCreateBottomSheetClick(this.eventLogger, PreCreatePopupType.ACATS_CLAWBACK_ALERT, UserInteractionEventData.Action.CONTINUE, this.analyticsScreenName);
        makeContributionRequest(contributionBundle);
        applyMutation(new C310361(null));
    }

    /* compiled from: CreateRetirementContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$onAcatsClawbackAlertConfirmed$1", m3645f = "CreateRetirementContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$onAcatsClawbackAlertConfirmed$1 */
    static final class C310361 extends ContinuationImpl7 implements Function2<CreateRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C310361(Continuation<? super C310361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C310361 c310361 = new C310361(continuation);
            c310361.L$0 = obj;
            return c310361;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateRetirementContributionDataState createRetirementContributionDataState, Continuation<? super CreateRetirementContributionDataState> continuation) {
            return ((C310361) create(createRetirementContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return CreateRetirementContributionDataState.copy$default((CreateRetirementContributionDataState) this.L$0, null, null, null, false, null, null, null, null, false, null, null, false, true, null, false, null, null, null, false, false, false, null, null, false, false, null, false, 134213631, null);
        }
    }

    public final void onAcatsClawbackAlertDismissed() {
        PreCreateLoggingEvents.logPreCreateBottomSheetClick(this.eventLogger, PreCreatePopupType.ACATS_CLAWBACK_ALERT, UserInteractionEventData.Action.DISMISS, this.analyticsScreenName);
    }

    private final <T> void subscribeHandleError(ScopedObservable<T> scopedObservable, Function1<? super T, Unit> function1) {
        ScopedObservable.subscribeKotlin$default(scopedObservable, function1, new Function1() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateRetirementContributionDuxo.subscribeHandleError$lambda$9(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeHandleError$lambda$9(CreateRetirementContributionDuxo createRetirementContributionDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        createRetirementContributionDuxo.applyMutation(new CreateRetirementContributionDuxo$subscribeHandleError$1$1(null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> void subscribeHandleError(ScopedSingle<T> scopedSingle, Function1<? super T, Unit> function1) {
        scopedSingle.subscribeKotlin(function1, new Function1() { // from class: com.robinhood.android.transfers.ui.retirement.contributions.CreateRetirementContributionDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateRetirementContributionDuxo.subscribeHandleError$lambda$10(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribeHandleError$lambda$10(CreateRetirementContributionDuxo createRetirementContributionDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        createRetirementContributionDuxo.applyMutation(new CreateRetirementContributionDuxo$subscribeHandleError$2$1(null));
        return Unit.INSTANCE;
    }

    /* compiled from: CreateRetirementContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionDuxo;", "Lcom/robinhood/android/transfers/ui/retirement/contributions/CreateRetirementContributionFragment$Args;", "<init>", "()V", "entryPointsWithFullscreenMatchSelection", "", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$EntryPoint;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CreateRetirementContributionDuxo, CreateRetirementContributionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CreateRetirementContributionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (CreateRetirementContributionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public CreateRetirementContributionFragment.Args getArgs(CreateRetirementContributionDuxo createRetirementContributionDuxo) {
            return (CreateRetirementContributionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, createRetirementContributionDuxo);
        }
    }
}
