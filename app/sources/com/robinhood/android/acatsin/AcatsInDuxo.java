package com.robinhood.android.acatsin;

import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import bonfire.proto.idl.acats.p027v1.AcatsService;
import bonfire.proto.idl.acats.p027v1.AcatsTransferHubBottomSheetDetailsDto;
import bonfire.proto.idl.acats.p027v1.GetAcatsTransferHubBottomSheetRequestDto;
import bonfire.proto.idl.acats.p027v1.GetAcatsTransferHubBottomSheetResponseDto;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventViewName;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkSuccess;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.experiments.ExperimentExposureLogger;
import com.robinhood.android.acats.contracts.AcatsIn;
import com.robinhood.android.acats.contracts.experiments.AcatsRejectedImprovementsExperiment;
import com.robinhood.android.acatsin.AcatsInEvent;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.prefs.AcatsInFailedBottomSheetShownPref;
import com.robinhood.android.acatsin.prefs.AcatsInIntroBonusLastShownPromoIdPref;
import com.robinhood.android.acatsin.prefs.AcatsInIntroWithFeeShownPref;
import com.robinhood.android.acatsin.store.AcatsInActivityStore;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.acatsin.util.names.FetchAccountNamesUseCase;
import com.robinhood.android.acatsin.util.names.NamesOnAccount;
import com.robinhood.android.dagger.ApplicationPackageInfoModule2;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.lib.margin.p167db.models.MarginSettings;
import com.robinhood.android.trading.contracts.EquitiesSubzero;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.AccountAccessStore;
import com.robinhood.librobinhood.data.store.AccountFeature;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.AcatsBonusStore;
import com.robinhood.librobinhood.data.store.bonfire.AcatsBrokerageStore;
import com.robinhood.librobinhood.data.store.bonfire.AcatsPlaidStore;
import com.robinhood.models.acats.p299db.bonfire.AccountContentItem;
import com.robinhood.models.acats.p299db.bonfire.AvailableAccount;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.PlaidBrokerAssets;
import com.robinhood.models.acats.p299db.p300ui.CapabilityStatus;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.AcatsTransferHubBottomSheetDetails;
import com.robinhood.models.api.bonfire.AcatsTransferHubBottomSheetResponse3;
import com.robinhood.models.api.bonfire.ApiAcatsAccountContentsResponse;
import com.robinhood.models.api.bonfire.ApiAcatsBonusPromoInfo;
import com.robinhood.models.api.bonfire.ApiAvailableDestinationsResponse;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.api.bonfire.ApiSearchBrokeragesResponse;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p355ui.UiSlipAgreements;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.StringPreference;
import com.robinhood.prefs.StringSetPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.PlaidEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.Either;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.Some;
import com.robinhood.utils.extensions.Lists4;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples3;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableDeferred3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxAwait3;
import kotlinx.coroutines.rx2.RxConvert;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: AcatsInDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u0086\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0002\u0086\u0001B©\u0001\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0001\u0010\u001c\u001a\u00020\u001d\u0012\b\b\u0001\u0010\u001e\u001a\u00020\u001f\u0012\b\b\u0001\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'\u0012\u0006\u0010(\u001a\u00020)\u0012\u0006\u0010*\u001a\u00020+¢\u0006\u0004\b,\u0010-J\b\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020:H\u0016J\b\u0010<\u001a\u00020:H\u0016J\u0006\u0010=\u001a\u00020:J\u000e\u0010>\u001a\u00020:2\u0006\u0010?\u001a\u00020@J\u0006\u0010A\u001a\u00020:J\u000e\u0010B\u001a\u00020:2\u0006\u0010C\u001a\u00020!J\u000e\u0010D\u001a\u00020:2\u0006\u0010E\u001a\u000201J\u000e\u0010F\u001a\u00020:2\u0006\u0010G\u001a\u00020HJ\u000e\u0010I\u001a\u00020:2\u0006\u0010J\u001a\u00020KJ\u000e\u0010L\u001a\u00020:2\u0006\u0010M\u001a\u00020NJ\u000e\u0010O\u001a\u00020:2\u0006\u0010P\u001a\u00020!J\u000e\u0010Q\u001a\u00020:2\u0006\u0010R\u001a\u00020SJ,\u0010T\u001a\u00020:2\f\u0010U\u001a\b\u0012\u0004\u0012\u00020W0V2\f\u0010X\u001a\b\u0012\u0004\u0012\u00020Y0V2\b\u0010Z\u001a\u0004\u0018\u00010!J\u0006\u0010[\u001a\u00020:J\u000e\u0010\\\u001a\u00020:2\u0006\u0010]\u001a\u00020^J\u000e\u0010_\u001a\u00020:2\u0006\u0010`\u001a\u00020^J\u0014\u0010a\u001a\u00020\u0002*\u00020\u00022\u0006\u0010`\u001a\u00020^H\u0002J\u0018\u0010b\u001a\u0004\u0018\u00010\u00022\u0006\u0010c\u001a\u00020\u0002H\u0082@¢\u0006\u0002\u0010dJ\u0018\u0010e\u001a\u00020:2\u0006\u0010c\u001a\u00020\u00022\u0006\u0010f\u001a\u00020gH\u0002J\u0014\u0010h\u001a\u00020:2\f\u0010i\u001a\b\u0012\u0004\u0012\u00020j0VJ\u0006\u0010k\u001a\u00020:J\u000e\u0010l\u001a\u00020:2\u0006\u0010m\u001a\u00020nJ\u000e\u0010o\u001a\u00020:2\u0006\u0010p\u001a\u00020gJ\u000e\u0010q\u001a\u00020:2\u0006\u0010r\u001a\u00020gJ\u000e\u0010s\u001a\u00020:2\u0006\u0010r\u001a\u00020gJ\u0012\u0010t\u001a\u00020:2\b\u0010u\u001a\u0004\u0018\u000101H\u0002J\u0012\u0010v\u001a\u00020:2\b\u0010w\u001a\u0004\u0018\u00010!H\u0002J\u0014\u0010x\u001a\u00020:2\f\u0010y\u001a\b\u0012\u0004\u0012\u00020!0VJ\u0016\u0010z\u001a\u00020:2\u000e\u0010{\u001a\n\u0012\u0004\u0012\u00020|\u0018\u00010VJ\u0006\u0010}\u001a\u00020:J\u000e\u0010~\u001a\u00020:2\u0006\u0010\u007f\u001a\u00020^J\u0011\u0010\u0080\u0001\u001a\u00020:2\u0006\u0010?\u001a\u00020@H\u0002J\u0011\u0010\u0081\u0001\u001a\u00020:2\u0006\u0010c\u001a\u00020\u0002H\u0002J\u0011\u0010\u0082\u0001\u001a\u00020^2\u0006\u0010c\u001a\u00020\u0002H\u0002J\u001a\u0010\u0083\u0001\u001a\u00020:2\u0006\u0010c\u001a\u00020\u00022\u0007\u0010\u0084\u0001\u001a\u00020^H\u0002J\u0013\u0010\u0085\u0001\u001a\u00020g*\u00020\u0002H\u0082@¢\u0006\u0002\u0010dR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u0004¢\u0006\u0002\n\u0000R(\u00102\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u000201 5*\n\u0012\u0004\u0012\u000201\u0018\u0001040403X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0407X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0407X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0087\u0001"}, m3636d2 = {"Lcom/robinhood/android/acatsin/AcatsInDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/acatsin/AcatsInDataState;", "Lcom/robinhood/android/acatsin/AcatsInViewState;", "Lcom/robinhood/android/acatsin/AcatsInEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "acatsInActivityStore", "Lcom/robinhood/android/acatsin/store/AcatsInActivityStore;", "acatsPlaidStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsPlaidStore;", "brokerageStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBrokerageStore;", "acatsBonusStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBonusStore;", "marginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "accountAccessStore", "Lcom/robinhood/librobinhood/data/store/AccountAccessStore;", "fetchAccountNamesUseCase", "Lcom/robinhood/android/acatsin/util/names/FetchAccountNamesUseCase;", "introWithFeeShownPref", "Lcom/robinhood/prefs/BooleanPreference;", "introBonusLastShownIdPref", "Lcom/robinhood/prefs/StringPreference;", "failedBottomSheetShownPref", "Lcom/robinhood/prefs/StringSetPreference;", "packageName", "", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "experimentExposureLogger", "Lcom/robinhood/analytics/experiments/ExperimentExposureLogger;", "acatsService", "Lbonfire/proto/idl/acats/v1/AcatsService;", "stateProvider", "Lcom/robinhood/android/acatsin/AcatsInStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/acatsin/store/AcatsInActivityStore;Lcom/robinhood/librobinhood/data/store/bonfire/AcatsPlaidStore;Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBrokerageStore;Lcom/robinhood/librobinhood/data/store/bonfire/AcatsBonusStore;Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/data/store/AccountAccessStore;Lcom/robinhood/android/acatsin/util/names/FetchAccountNamesUseCase;Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/prefs/StringSetPreference;Ljava/lang/String;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/analytics/experiments/ExperimentExposureLogger;Lbonfire/proto/idl/acats/v1/AcatsService;Lcom/robinhood/android/acatsin/AcatsInStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "savedRhsAccount", "Lcom/robinhood/models/acats/db/bonfire/AvailableAccount;", "selectedRhsAccountRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/utils/Optional;", "kotlin.jvm.PlatformType", "rhsAccountNumberStream", "Lio/reactivex/Observable;", "rhfAccountNumberStream", "onCreate", "", "onStart", "onStop", "setIntroShown", "onBrokerageSelected", "brokerage", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "onManualBrokerageEntrySelected", "onDtcNumberEntered", "dtccNumber", "onRhsAccountSelected", "account", "onPlaidLinkSuccess", "linkSuccess", "Lcom/plaid/link/result/LinkSuccess;", "onPlaidLinkExit", "linkExit", "Lcom/plaid/link/result/LinkExit;", "handlePlaidLinkEvent", "linkEvent", "Lcom/plaid/link/event/LinkEvent;", "onAccountNumberEntered", "accountNumber", "onAccountNameConfirmed", "accountNames", "Lcom/robinhood/android/acatsin/util/names/NamesOnAccount;", "onAccountContentsDeclared", "selectedContent", "", "Lcom/robinhood/models/acats/db/bonfire/AccountContentItem;", "supportedContentTypes", "Lcom/robinhood/models/api/bonfire/ApiAcatsAccountContentsResponse$SupportedContentType;", "buildPartialBannerContentfulId", "onFullTransferSelected", "onOptionsEnableResult", "isOptionsEnabled", "", "onMarginEnableResult", "isMarginEnabled", "updateMarginCapabilityStatus", "refreshPlaidAssetsAfterMarginEnable", "dataState", "(Lcom/robinhood/android/acatsin/AcatsInDataState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "navigateToNextStep", "currentStep", "Lcom/robinhood/android/acatsin/util/AcatsFlowStep;", "onBuildPartialTransferComplete", "assets", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "showBorrowingFeeBottomSheet", "onAcatsSubmitted", "acatsTransferId", "Ljava/util/UUID;", "showAlternate", "alternateStep", "completeStepForPromo", "completedStep", "completeStep", "confirmAccountNamesWithPlaid", "availableAccount", "exposeAcatsInSbExperiment", "variant", "setUnsupportedAccountContents", "unsupportedItems", "setSlipAgreements", "slipAgreements", "Lcom/robinhood/models/ui/UiSlipAgreements$Agreement;", "matchRateSelected", "onInfoEntryMethodSelected", "isPlaid", "logBrokerageSelected", "logManualDtcNumberEntered", "shouldShowPromoScreen", "submitPromoScreenNavigationEvent", "shouldFinishActivity", "onCreateInitialStepFullPromoFlow", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInDuxo extends BaseDuxo3<AcatsInDataState, AcatsInViewState, AcatsInEvent> implements HasSavedState {
    private final AcatsBonusStore acatsBonusStore;
    private final AcatsInActivityStore acatsInActivityStore;
    private final AcatsPlaidStore acatsPlaidStore;
    private final AcatsService acatsService;
    private final AccountAccessStore accountAccessStore;
    private final AccountProvider accountProvider;
    private final AcatsBrokerageStore brokerageStore;
    private final EventLogger eventLogger;
    private final ExperimentExposureLogger experimentExposureLogger;
    private final ExperimentsStore experimentsStore;
    private final StringSetPreference failedBottomSheetShownPref;
    private final FetchAccountNamesUseCase fetchAccountNamesUseCase;
    private final StringPreference introBonusLastShownIdPref;
    private final BooleanPreference introWithFeeShownPref;
    private final LeveredMarginSettingsStore marginSettingsStore;
    private final String packageName;
    private final Observable<Optional<String>> rhfAccountNumberStream;
    private final Observable<Optional<String>> rhsAccountNumberStream;
    private final AvailableAccount savedRhsAccount;
    private final SavedStateHandle savedStateHandle;
    private final BehaviorRelay<Optional<AvailableAccount>> selectedRhsAccountRelay;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AcatsInExperiments3.values().length];
            try {
                iArr[AcatsInExperiments3.MEMBER_A.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AcatsInExperiments3.MEMBER_B.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AcatsInExperiments3.CONTROL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo", m3645f = "AcatsInDuxo.kt", m3646l = {1200}, m3647m = "onCreateInitialStepFullPromoFlow")
    /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onCreateInitialStepFullPromoFlow$1 */
    static final class C77081 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C77081(Continuation<? super C77081> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AcatsInDuxo.this.onCreateInitialStepFullPromoFlow(null, this);
        }
    }

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo", m3645f = "AcatsInDuxo.kt", m3646l = {918}, m3647m = "refreshPlaidAssetsAfterMarginEnable")
    /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$refreshPlaidAssetsAfterMarginEnable$1 */
    static final class C77201 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C77201(Continuation<? super C77201> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AcatsInDuxo.this.refreshPlaidAssetsAfterMarginEnable(null, this);
        }
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AcatsInDuxo(AcatsInActivityStore acatsInActivityStore, AcatsPlaidStore acatsPlaidStore, AcatsBrokerageStore brokerageStore, AcatsBonusStore acatsBonusStore, LeveredMarginSettingsStore marginSettingsStore, AccountProvider accountProvider, ExperimentsStore experimentsStore, EventLogger eventLogger, AccountAccessStore accountAccessStore, FetchAccountNamesUseCase fetchAccountNamesUseCase, @AcatsInIntroWithFeeShownPref BooleanPreference introWithFeeShownPref, @AcatsInIntroBonusLastShownPromoIdPref StringPreference introBonusLastShownIdPref, @AcatsInFailedBottomSheetShownPref StringSetPreference failedBottomSheetShownPref, @ApplicationPackageInfoModule2 String packageName, SavedStateHandle savedStateHandle, ExperimentExposureLogger experimentExposureLogger, AcatsService acatsService, AcatsInStateProvider stateProvider, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(acatsInActivityStore, "acatsInActivityStore");
        Intrinsics.checkNotNullParameter(acatsPlaidStore, "acatsPlaidStore");
        Intrinsics.checkNotNullParameter(brokerageStore, "brokerageStore");
        Intrinsics.checkNotNullParameter(acatsBonusStore, "acatsBonusStore");
        Intrinsics.checkNotNullParameter(marginSettingsStore, "marginSettingsStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(accountAccessStore, "accountAccessStore");
        Intrinsics.checkNotNullParameter(fetchAccountNamesUseCase, "fetchAccountNamesUseCase");
        Intrinsics.checkNotNullParameter(introWithFeeShownPref, "introWithFeeShownPref");
        Intrinsics.checkNotNullParameter(introBonusLastShownIdPref, "introBonusLastShownIdPref");
        Intrinsics.checkNotNullParameter(failedBottomSheetShownPref, "failedBottomSheetShownPref");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(experimentExposureLogger, "experimentExposureLogger");
        Intrinsics.checkNotNullParameter(acatsService, "acatsService");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        String source = ((AcatsIn) companion.getExtras(savedStateHandle)).getSource();
        boolean skipIntro = ((AcatsIn) companion.getExtras(savedStateHandle)).getSkipIntro();
        Boolean bool = (Boolean) savedStateHandle.get("intro_shown");
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Either brokerageOrDtccNumber = AcatsInDuxoKt.getBrokerageOrDtccNumber(savedStateHandle);
        boolean z = zBooleanValue;
        ApiAvailableDestinationsResponse apiAvailableDestinationsResponse = (ApiAvailableDestinationsResponse) savedStateHandle.get("available_destinations");
        AvailableAccount availableAccount = (AvailableAccount) savedStateHandle.get("selected_rhs_account");
        String str = (String) savedStateHandle.get("contra_account_number");
        String str2 = (String) savedStateHandle.get("plaid_access_token_id");
        NamesOnAccount namesOnAccount = (NamesOnAccount) savedStateHandle.get("account_names");
        List list = (List) savedStateHandle.get("account_contents");
        List listEmptyList = list == null ? CollectionsKt.emptyList() : list;
        List<ApiAcatsAccountContentsResponse.SupportedContentType> list2 = (List) savedStateHandle.get("supported_content_types");
        List<ApiAcatsAccountContentsResponse.SupportedContentType> legacySupportedContentTypes = list2 == null ? AcatsInViewState.INSTANCE.getLegacySupportedContentTypes() : list2;
        String str3 = (String) savedStateHandle.get("build_partial_banner_contentful_id");
        List list3 = (List) savedStateHandle.get("assets");
        UUID uuid = (UUID) savedStateHandle.get(MatchSelectionActivity.TRANSFER_ID_EXTRA);
        Boolean bool2 = (Boolean) savedStateHandle.get("match_rate_selected");
        super(new AcatsInDataState(source, skipIntro, z, brokerageOrDtccNumber, apiAvailableDestinationsResponse, availableAccount, null, str, str2, null, namesOnAccount, null, null, listEmptyList, legacySupportedContentTypes, null, str3, list3, uuid, null, null, null, null, null, false, null, bool2 != null ? bool2.booleanValue() : false, false, false, false, false, null, false, false, false, false, -67593664, 15, null), stateProvider, duxoBundle);
        this.acatsInActivityStore = acatsInActivityStore;
        this.acatsPlaidStore = acatsPlaidStore;
        this.brokerageStore = brokerageStore;
        this.acatsBonusStore = acatsBonusStore;
        this.marginSettingsStore = marginSettingsStore;
        this.accountProvider = accountProvider;
        this.experimentsStore = experimentsStore;
        this.eventLogger = eventLogger;
        this.accountAccessStore = accountAccessStore;
        this.fetchAccountNamesUseCase = fetchAccountNamesUseCase;
        this.introWithFeeShownPref = introWithFeeShownPref;
        this.introBonusLastShownIdPref = introBonusLastShownIdPref;
        this.failedBottomSheetShownPref = failedBottomSheetShownPref;
        this.packageName = packageName;
        this.savedStateHandle = savedStateHandle;
        this.experimentExposureLogger = experimentExposureLogger;
        this.acatsService = acatsService;
        AvailableAccount availableAccount2 = (AvailableAccount) getSavedStateHandle().get("selected_rhs_account");
        this.savedRhsAccount = availableAccount2;
        BehaviorRelay<Optional<AvailableAccount>> behaviorRelayCreateDefault = BehaviorRelay.createDefault(Optional3.asOptional(availableAccount2));
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.selectedRhsAccountRelay = behaviorRelayCreateDefault;
        Observable map = behaviorRelayCreateDefault.map(new Function() { // from class: com.robinhood.android.acatsin.AcatsInDuxo$rhsAccountNumberStream$1
            @Override // io.reactivex.functions.Function
            public final Optional<String> apply(Optional<AvailableAccount> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof Some) {
                    return Optional.INSTANCE.m2972of(((AvailableAccount) ((Some) it).getValue()).getRhsAccountNumber());
                }
                if (it instanceof Optional2) {
                    return Optional2.INSTANCE;
                }
                throw new NoWhenBranchMatchedException();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.rhsAccountNumberStream = map;
        Observable map2 = behaviorRelayCreateDefault.map(new Function() { // from class: com.robinhood.android.acatsin.AcatsInDuxo$rhfAccountNumberStream$1
            @Override // io.reactivex.functions.Function
            public final Optional<String> apply(Optional<AvailableAccount> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof Some) {
                    return Optional.INSTANCE.m2972of(((AvailableAccount) ((Some) it).getValue()).getAccountNumber());
                }
                if (it instanceof Optional2) {
                    return Optional2.INSTANCE;
                }
                throw new NoWhenBranchMatchedException();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        this.rhfAccountNumberStream = map2;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C77041(null), 3, null);
        Observable<R> map = this.selectedRhsAccountRelay.map(new Function() { // from class: com.robinhood.android.acatsin.AcatsInDuxo.onCreate.2
            @Override // io.reactivex.functions.Function
            public final Boolean apply(Optional<AvailableAccount> it) {
                BrokerageAccountType brokerageAccountType;
                Intrinsics.checkNotNullParameter(it, "it");
                AvailableAccount orNull = it.getOrNull();
                boolean z = false;
                if (orNull != null && (brokerageAccountType = orNull.getBrokerageAccountType()) != null && brokerageAccountType.isRetirement()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acatsin.AcatsInDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInDuxo.onCreate$lambda$1(this.f$0, (Boolean) obj);
            }
        });
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C77074(null));
    }

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onCreate$1", m3645f = "AcatsInDuxo.kt", m3646l = {1200, EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onCreate$1 */
    static final class C77041 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        C77041(Continuation<? super C77041> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C77041 c77041 = AcatsInDuxo.this.new C77041(continuation);
            c77041.L$0 = obj;
            return c77041;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C77041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(1:(1:(7:6|44|7|33|34|38|39)(2:11|12))(3:13|46|14))(5:18|42|19|(1:22)|31)|23|28|40|29|(5:32|33|34|38|39)|31|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
        
            r1 = r10;
            r10 = r0;
            r2 = r3;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object objM28550constructorimpl;
            Object obj2;
            CoroutineScope coroutineScope2;
            Object objFetchAvailableDestinations;
            Object objM28550constructorimpl2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                AcatsInDuxo acatsInDuxo = AcatsInDuxo.this;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    Single<ApiAcatsBonusPromoInfo> bonusInfo = acatsInDuxo.acatsBonusStore.getBonusInfo();
                    this.L$0 = coroutineScope3;
                    this.label = 1;
                    Object objAwait = RxAwait3.await(bonusInfo, this);
                    if (objAwait != coroutine_suspended) {
                        coroutineScope = coroutineScope3;
                        obj = objAwait;
                    }
                } catch (Throwable th) {
                    th = th;
                    coroutineScope = coroutineScope3;
                    Throwable th2 = th;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th2));
                    AcatsInActivityStore acatsInActivityStore = AcatsInDuxo.this.acatsInActivityStore;
                    this.L$0 = coroutineScope;
                    this.L$1 = objM28550constructorimpl;
                    this.label = 2;
                    objFetchAvailableDestinations = acatsInActivityStore.fetchAvailableDestinations(this);
                    if (objFetchAvailableDestinations != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    objM28550constructorimpl2 = Result.m28550constructorimpl((ApiAvailableDestinationsResponse) obj);
                } catch (Throwable th3) {
                    Throwable th4 = th3;
                    Result.Companion companion3 = Result.INSTANCE;
                    objM28550constructorimpl2 = Result.m28550constructorimpl(ResultKt.createFailure(th4));
                    Object obj3 = objM28550constructorimpl2;
                    Object obj4 = obj2;
                    CoroutineScope coroutineScope4 = coroutineScope2;
                    AcatsInDuxo acatsInDuxo2 = AcatsInDuxo.this;
                    acatsInDuxo2.applyMutation(new AnonymousClass1(acatsInDuxo2, obj3, obj4, coroutineScope4, null));
                    return Unit.INSTANCE;
                }
                Object obj32 = objM28550constructorimpl2;
                Object obj42 = obj2;
                CoroutineScope coroutineScope42 = coroutineScope2;
                AcatsInDuxo acatsInDuxo22 = AcatsInDuxo.this;
                acatsInDuxo22.applyMutation(new AnonymousClass1(acatsInDuxo22, obj32, obj42, coroutineScope42, null));
                return Unit.INSTANCE;
            }
            coroutineScope = (CoroutineScope) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th5) {
                th = th5;
                Throwable th22 = th;
                Result.Companion companion22 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th22));
                AcatsInActivityStore acatsInActivityStore2 = AcatsInDuxo.this.acatsInActivityStore;
                this.L$0 = coroutineScope;
                this.L$1 = objM28550constructorimpl;
                this.label = 2;
                objFetchAvailableDestinations = acatsInActivityStore2.fetchAvailableDestinations(this);
                if (objFetchAvailableDestinations != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            objM28550constructorimpl = Result.m28550constructorimpl((ApiAcatsBonusPromoInfo) obj);
            AcatsInActivityStore acatsInActivityStore22 = AcatsInDuxo.this.acatsInActivityStore;
            this.L$0 = coroutineScope;
            this.L$1 = objM28550constructorimpl;
            this.label = 2;
            objFetchAvailableDestinations = acatsInActivityStore22.fetchAvailableDestinations(this);
            if (objFetchAvailableDestinations != coroutine_suspended) {
                obj2 = objM28550constructorimpl;
                obj = objFetchAvailableDestinations;
                coroutineScope2 = coroutineScope;
                objM28550constructorimpl2 = Result.m28550constructorimpl((ApiAvailableDestinationsResponse) obj);
                Object obj322 = objM28550constructorimpl2;
                Object obj422 = obj2;
                CoroutineScope coroutineScope422 = coroutineScope2;
                AcatsInDuxo acatsInDuxo222 = AcatsInDuxo.this;
                acatsInDuxo222.applyMutation(new AnonymousClass1(acatsInDuxo222, obj322, obj422, coroutineScope422, null));
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        }

        /* compiled from: AcatsInDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/AcatsInDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onCreate$1$1", m3645f = "AcatsInDuxo.kt", m3646l = {1200, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, 302}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AcatsInDataState, Continuation<? super AcatsInDataState>, Object> {
            final /* synthetic */ CoroutineScope $$this$launch;
            final /* synthetic */ Object $bonusInfoDeferred;
            final /* synthetic */ Object $destinationsResponseDeferred;
            int I$0;
            int I$1;
            int I$2;
            int I$3;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            Object L$3;
            Object L$4;
            Object L$5;
            Object L$6;
            Object L$7;
            int label;
            final /* synthetic */ AcatsInDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AcatsInDuxo acatsInDuxo, Object obj, Object obj2, CoroutineScope coroutineScope, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = acatsInDuxo;
                this.$destinationsResponseDeferred = obj;
                this.$bonusInfoDeferred = obj2;
                this.$$this$launch = coroutineScope;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$destinationsResponseDeferred, this.$bonusInfoDeferred, this.$$this$launch, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
                return ((AnonymousClass1) create(acatsInDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:194:0x05b5, code lost:
            
                if (r3 == r2) goto L195;
             */
            /* JADX WARN: Code restructure failed: missing block: B:68:0x0298, code lost:
            
                if (r12 == r2) goto L195;
             */
            /* JADX WARN: Code restructure failed: missing block: B:76:0x02e6, code lost:
            
                if (r13 == r2) goto L195;
             */
            /* JADX WARN: Code restructure failed: missing block: B:84:0x0338, code lost:
            
                if (r5 == r2) goto L195;
             */
            /* JADX WARN: Code restructure failed: missing block: B:95:0x037f, code lost:
            
                if (r9 == r2) goto L195;
             */
            /* JADX WARN: Removed duplicated region for block: B:102:0x0398  */
            /* JADX WARN: Removed duplicated region for block: B:108:0x03c6  */
            /* JADX WARN: Removed duplicated region for block: B:109:0x03d7  */
            /* JADX WARN: Removed duplicated region for block: B:110:0x03d9  */
            /* JADX WARN: Removed duplicated region for block: B:113:0x03f1  */
            /* JADX WARN: Removed duplicated region for block: B:115:0x03ff  */
            /* JADX WARN: Removed duplicated region for block: B:117:0x0404  */
            /* JADX WARN: Removed duplicated region for block: B:123:0x0430  */
            /* JADX WARN: Removed duplicated region for block: B:125:0x0443  */
            /* JADX WARN: Removed duplicated region for block: B:129:0x0455  */
            /* JADX WARN: Removed duplicated region for block: B:132:0x045e  */
            /* JADX WARN: Removed duplicated region for block: B:133:0x0461  */
            /* JADX WARN: Removed duplicated region for block: B:135:0x0465  */
            /* JADX WARN: Removed duplicated region for block: B:136:0x0468  */
            /* JADX WARN: Removed duplicated region for block: B:138:0x046c  */
            /* JADX WARN: Removed duplicated region for block: B:139:0x046f  */
            /* JADX WARN: Removed duplicated region for block: B:141:0x0473  */
            /* JADX WARN: Removed duplicated region for block: B:142:0x0476  */
            /* JADX WARN: Removed duplicated region for block: B:145:0x04bd  */
            /* JADX WARN: Removed duplicated region for block: B:148:0x04c2  */
            /* JADX WARN: Removed duplicated region for block: B:151:0x04d7  */
            /* JADX WARN: Removed duplicated region for block: B:154:0x04df  */
            /* JADX WARN: Removed duplicated region for block: B:155:0x04e7  */
            /* JADX WARN: Removed duplicated region for block: B:176:0x0554  */
            /* JADX WARN: Removed duplicated region for block: B:191:0x058e  */
            /* JADX WARN: Removed duplicated region for block: B:199:0x05c4  */
            /* JADX WARN: Removed duplicated region for block: B:202:0x05ca  */
            /* JADX WARN: Removed duplicated region for block: B:204:0x05d0  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0207  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x0210  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x0225  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x022d  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x026f  */
            /* JADX WARN: Removed duplicated region for block: B:73:0x02bb  */
            /* JADX WARN: Removed duplicated region for block: B:81:0x030b  */
            /* JADX WARN: Removed duplicated region for block: B:91:0x035d  */
            /* JADX WARN: Removed duplicated region for block: B:94:0x0362  */
            /* JADX WARN: Removed duplicated region for block: B:99:0x038d  */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objM28550constructorimpl;
                Object obj2;
                Deferred deferred;
                Deferred deferred2;
                AcatsInDataState acatsInDataState;
                Deferred<PlaidBrokerAssets> plaidBrokerAssets;
                Object obj3;
                ApiAvailableDestinationsResponse apiAvailableDestinationsResponse;
                AvailableAccount availableAccount;
                AvailableAccount defaultAccount;
                int i;
                AcatsInDataState acatsInDataState2;
                Deferred deferred3;
                Deferred deferred4;
                Object obj4;
                Deferred<PlaidBrokerAssets> deferred5;
                ApiAvailableDestinationsResponse apiAvailableDestinationsResponse2;
                AvailableAccount availableAccount2;
                int i2;
                int i3;
                String accountNumber;
                Object objFirst;
                boolean z;
                AcatsInDataState acatsInDataState3;
                Deferred deferred6;
                Deferred deferred7;
                Object obj5;
                Deferred<PlaidBrokerAssets> deferred8;
                ApiAvailableDestinationsResponse apiAvailableDestinationsResponse3;
                AvailableAccount availableAccount3;
                int i4;
                int i5;
                int i6;
                String accountNumber2;
                Object objFirst2;
                AvailableAccount availableAccount4;
                int i7;
                int i8;
                int i9;
                int i10;
                String accountNumber3;
                Object objFirst3;
                AcatsInDataState acatsInDataState4;
                Deferred deferred9;
                Deferred deferred10;
                Object obj6;
                ApiAvailableDestinationsResponse apiAvailableDestinationsResponse4;
                Object obj7;
                ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo;
                AvailableAccount availableAccount5;
                Object obj8;
                PlaidBrokerAssets plaidBrokerAssets2;
                Object objAwait;
                AcatsInDataState acatsInDataState5;
                Deferred deferred11;
                ApiAvailableDestinationsResponse apiAvailableDestinationsResponse5;
                ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo2;
                String plaidAccessTokenId;
                boolean z2;
                Object objAwait2;
                Object obj9;
                CapabilityStatus capabilityStatus;
                AvailableAccount availableAccount6;
                PlaidBrokerAssets plaidBrokerAssets3;
                CapabilityStatus capabilityStatus2;
                ApiAvailableDestinationsResponse apiAvailableDestinationsResponse6;
                ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo3;
                String str;
                int i11;
                int i12;
                int i13;
                AcatsInDataState acatsInDataState6;
                Object obj10;
                Object objAwait3;
                ApiAvailableDestinationsResponse apiAvailableDestinationsResponse7;
                ApiAvailableDestinationsResponse apiAvailableDestinationsResponse8;
                CapabilityStatus capabilityStatus3;
                AcatsInDataState acatsInDataState7;
                AcatsInDataState acatsInDataStateCopy$default;
                Object obj11;
                AcatsFlowStep nextFlowStep;
                Object objOnCreateInitialStepFullPromoFlow;
                String promo_id;
                AcatsInDataState acatsInDataState8;
                Deferred deferredCompletableDeferred;
                Deferred deferred12;
                Deferred deferredCompletableDeferred2;
                Deferred deferred13;
                Object objAwait4;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                try {
                } catch (Throwable th) {
                    Result.Companion companion = Result.INSTANCE;
                    objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                }
                switch (this.label) {
                    case 0:
                        z = false;
                        ResultKt.throwOnFailure(obj);
                        acatsInDataState8 = (AcatsInDataState) this.L$0;
                        AvailableAccount selectedRhsAccount = acatsInDataState8.getSelectedRhsAccount();
                        if (selectedRhsAccount == null || (deferredCompletableDeferred = BuildersKt__Builders_commonKt.async$default(this.$$this$launch, null, null, new AcatsInDuxo$onCreate$1$1$isOptionsInvestingEnabledDeferred$1$1(this.this$0, selectedRhsAccount, null), 3, null)) == null) {
                            deferredCompletableDeferred = CompletableDeferred3.CompletableDeferred(boxing.boxBoolean(false));
                        }
                        deferred12 = deferredCompletableDeferred;
                        AvailableAccount selectedRhsAccount2 = acatsInDataState8.getSelectedRhsAccount();
                        if (selectedRhsAccount2 == null || (deferredCompletableDeferred2 = BuildersKt__Builders_commonKt.async$default(this.$$this$launch, null, null, new AcatsInDuxo$onCreate$1$1$isMarginInvestingEnabledDeferred$1$1(this.this$0, selectedRhsAccount2, null), 3, null)) == null) {
                            deferredCompletableDeferred2 = CompletableDeferred3.CompletableDeferred(boxing.boxBoolean(false));
                        }
                        deferred13 = deferredCompletableDeferred2;
                        AcatsInDuxo acatsInDuxo = this.this$0;
                        Result.Companion companion2 = Result.INSTANCE;
                        Single singleFirst = acatsInDuxo.accountProvider.streamIndividualAccount().map(new Function() { // from class: com.robinhood.android.acatsin.AcatsInDuxo$onCreate$1$1$isGoldUser$1$1
                            @Override // io.reactivex.functions.Function
                            public final Boolean apply(Account it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                return Boolean.valueOf(it.isGold());
                            }
                        }).first(boxing.boxBoolean(false));
                        Intrinsics.checkNotNullExpressionValue(singleFirst, "first(...)");
                        this.L$0 = acatsInDataState8;
                        this.L$1 = deferred12;
                        this.L$2 = deferred13;
                        this.label = 1;
                        objAwait4 = RxAwait3.await(singleFirst, this);
                        if (objAwait4 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objM28550constructorimpl = Result.m28550constructorimpl((Boolean) objAwait4);
                        obj2 = objM28550constructorimpl;
                        deferred = deferred13;
                        deferred2 = deferred12;
                        acatsInDataState = acatsInDataState8;
                        plaidBrokerAssets = (acatsInDataState.getSelectedRhsAccount() != null || acatsInDataState.getContraAccountNumber() == null || acatsInDataState.getPlaidAccessTokenId() == null) ? null : this.this$0.acatsInActivityStore.getPlaidBrokerAssets(acatsInDataState.getSelectedRhsAccount().getRhsAccountNumber(), acatsInDataState.getContraAccountNumber(), acatsInDataState.getPlaidAccessTokenId(), true);
                        obj3 = this.$destinationsResponseDeferred;
                        if (Result.m28555isFailureimpl(obj3)) {
                            obj3 = null;
                        }
                        apiAvailableDestinationsResponse = (ApiAvailableDestinationsResponse) obj3;
                        this.this$0.getSavedStateHandle().set("available_destinations", apiAvailableDestinationsResponse);
                        if (acatsInDataState.getSelectedRhsAccount() == null) {
                            defaultAccount = acatsInDataState.getSelectedRhsAccount();
                        } else {
                            AvailableAccount availableAccountFindExistingAccountByAccountNumber = apiAvailableDestinationsResponse != null ? AcatsInDataState2.findExistingAccountByAccountNumber(apiAvailableDestinationsResponse, ((AcatsIn) AcatsInDuxo.INSTANCE.getExtras(this.this$0.getSavedStateHandle())).getPreselectedAccountNumber()) : null;
                            if (availableAccountFindExistingAccountByAccountNumber != null) {
                                availableAccount = availableAccountFindExistingAccountByAccountNumber;
                                i = 1;
                                this.this$0.getSavedStateHandle().set("selected_rhs_account", availableAccount);
                                this.this$0.selectedRhsAccountRelay.accept(Optional3.asOptional(availableAccount));
                                if (availableAccount == null && (accountNumber = availableAccount.getAccountNumber()) != null) {
                                    Flow<Boolean> featureAccess = this.this$0.accountAccessStore.getFeatureAccess(accountNumber, AccountFeature.MARGIN);
                                    this.L$0 = acatsInDataState;
                                    this.L$1 = deferred2;
                                    this.L$2 = deferred;
                                    this.L$3 = obj2;
                                    this.L$4 = plaidBrokerAssets;
                                    this.L$5 = apiAvailableDestinationsResponse;
                                    this.L$6 = availableAccount;
                                    this.I$0 = i;
                                    this.label = 2;
                                    objFirst = FlowKt.first(featureAccess, this);
                                    break;
                                } else {
                                    acatsInDataState2 = acatsInDataState;
                                    deferred3 = deferred2;
                                    deferred4 = deferred;
                                    obj4 = obj2;
                                    deferred5 = plaidBrokerAssets;
                                    apiAvailableDestinationsResponse2 = apiAvailableDestinationsResponse;
                                    availableAccount2 = availableAccount;
                                    i2 = i;
                                    i3 = z ? 1 : 0;
                                    if (availableAccount2 == null && (accountNumber2 = availableAccount2.getAccountNumber()) != null) {
                                        Flow<Boolean> featureAccess2 = this.this$0.accountAccessStore.getFeatureAccess(accountNumber2, AccountFeature.ACATS_BROKERAGE_MATCH);
                                        this.L$0 = acatsInDataState2;
                                        this.L$1 = deferred3;
                                        this.L$2 = deferred4;
                                        this.L$3 = obj4;
                                        this.L$4 = deferred5;
                                        this.L$5 = apiAvailableDestinationsResponse2;
                                        this.L$6 = availableAccount2;
                                        this.I$0 = i2;
                                        this.I$1 = i3;
                                        this.label = 3;
                                        objFirst2 = FlowKt.first(featureAccess2, this);
                                        break;
                                    } else {
                                        acatsInDataState3 = acatsInDataState2;
                                        deferred6 = deferred3;
                                        deferred7 = deferred4;
                                        obj5 = obj4;
                                        deferred8 = deferred5;
                                        apiAvailableDestinationsResponse3 = apiAvailableDestinationsResponse2;
                                        availableAccount3 = availableAccount2;
                                        i4 = i2;
                                        i5 = i3;
                                        i6 = z ? 1 : 0;
                                        if (availableAccount3 == null && (accountNumber3 = availableAccount3.getAccountNumber()) != null) {
                                            Flow<Boolean> featureAccess3 = this.this$0.accountAccessStore.getFeatureAccess(accountNumber3, AccountFeature.OPTIONS_SUPPORTED);
                                            this.L$0 = acatsInDataState3;
                                            this.L$1 = deferred6;
                                            this.L$2 = deferred7;
                                            this.L$3 = obj5;
                                            this.L$4 = deferred8;
                                            this.L$5 = apiAvailableDestinationsResponse3;
                                            this.L$6 = availableAccount3;
                                            this.I$0 = i4;
                                            this.I$1 = i5;
                                            this.I$2 = i6;
                                            this.label = 4;
                                            objFirst3 = FlowKt.first(featureAccess3, this);
                                            break;
                                        } else {
                                            availableAccount4 = availableAccount3;
                                            i7 = i4;
                                            i8 = i5;
                                            i9 = i6;
                                            i10 = z ? 1 : 0;
                                            acatsInDataState4 = acatsInDataState3;
                                            deferred9 = deferred6;
                                            deferred10 = deferred7;
                                            obj6 = obj5;
                                            apiAvailableDestinationsResponse4 = apiAvailableDestinationsResponse3;
                                            obj7 = this.$bonusInfoDeferred;
                                            if (Result.m28555isFailureimpl(obj7)) {
                                                obj7 = null;
                                            }
                                            apiAcatsBonusPromoInfo = (ApiAcatsBonusPromoInfo) obj7;
                                            if (deferred8 != null) {
                                                this.L$0 = acatsInDataState4;
                                                this.L$1 = deferred9;
                                                this.L$2 = deferred10;
                                                this.L$3 = obj6;
                                                this.L$4 = apiAvailableDestinationsResponse4;
                                                this.L$5 = availableAccount4;
                                                this.L$6 = apiAcatsBonusPromoInfo;
                                                this.I$0 = i7;
                                                this.I$1 = i8;
                                                this.I$2 = i9;
                                                this.I$3 = i10;
                                                this.label = 5;
                                                objAwait = deferred8.await(this);
                                                break;
                                            } else {
                                                availableAccount5 = availableAccount4;
                                                obj8 = obj6;
                                                plaidBrokerAssets2 = null;
                                                acatsInDataState5 = acatsInDataState4;
                                                deferred11 = deferred10;
                                                apiAvailableDestinationsResponse5 = apiAvailableDestinationsResponse4;
                                                apiAcatsBonusPromoInfo2 = apiAcatsBonusPromoInfo;
                                                plaidAccessTokenId = acatsInDataState5.getPlaidAccessTokenId();
                                                if (i10 == 0) {
                                                    this.L$0 = acatsInDataState5;
                                                    this.L$1 = deferred11;
                                                    this.L$2 = obj8;
                                                    this.L$3 = apiAvailableDestinationsResponse5;
                                                    this.L$4 = availableAccount5;
                                                    this.L$5 = apiAcatsBonusPromoInfo2;
                                                    this.L$6 = plaidBrokerAssets2;
                                                    this.L$7 = plaidAccessTokenId;
                                                    this.I$0 = i7;
                                                    this.I$1 = i8;
                                                    this.I$2 = i9;
                                                    this.I$3 = i10;
                                                    z2 = true;
                                                    this.label = 6;
                                                    objAwait2 = deferred9.await(this);
                                                    if (objAwait2 != coroutine_suspended) {
                                                        obj9 = obj8;
                                                        if (!((Boolean) objAwait2).booleanValue()) {
                                                            PlaidBrokerAssets plaidBrokerAssets4 = plaidBrokerAssets2;
                                                            capabilityStatus2 = CapabilityStatus.ENABLED;
                                                            apiAvailableDestinationsResponse6 = apiAvailableDestinationsResponse5;
                                                            apiAcatsBonusPromoInfo3 = apiAcatsBonusPromoInfo2;
                                                            str = plaidAccessTokenId;
                                                            i11 = i7;
                                                            i12 = i8;
                                                            i13 = i9;
                                                            acatsInDataState6 = acatsInDataState5;
                                                            obj10 = obj9;
                                                            availableAccount6 = availableAccount5;
                                                            plaidBrokerAssets3 = plaidBrokerAssets4;
                                                            if (i12 != 0) {
                                                                this.L$0 = acatsInDataState6;
                                                                this.L$1 = obj10;
                                                                this.L$2 = apiAvailableDestinationsResponse6;
                                                                this.L$3 = availableAccount6;
                                                                this.L$4 = apiAcatsBonusPromoInfo3;
                                                                this.L$5 = plaidBrokerAssets3;
                                                                this.L$6 = str;
                                                                this.L$7 = capabilityStatus2;
                                                                this.I$0 = i11;
                                                                this.I$1 = i12;
                                                                this.I$2 = i13;
                                                                this.I$3 = i10;
                                                                this.label = 7;
                                                                objAwait3 = deferred11.await(this);
                                                                if (objAwait3 != coroutine_suspended) {
                                                                    apiAvailableDestinationsResponse7 = apiAvailableDestinationsResponse6;
                                                                    if (!((Boolean) objAwait3).booleanValue()) {
                                                                        capabilityStatus3 = CapabilityStatus.ENABLED;
                                                                        apiAvailableDestinationsResponse8 = apiAvailableDestinationsResponse7;
                                                                        acatsInDataState7 = acatsInDataState6;
                                                                        CapabilityStatus capabilityStatus4 = capabilityStatus2;
                                                                        String str2 = str;
                                                                        PlaidBrokerAssets plaidBrokerAssets5 = plaidBrokerAssets3;
                                                                        ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo4 = apiAcatsBonusPromoInfo3;
                                                                        AvailableAccount availableAccount7 = availableAccount6;
                                                                        Boolean boolBoxBoolean = boxing.boxBoolean(z);
                                                                        if (Result.m28555isFailureimpl(obj10)) {
                                                                            obj10 = boolBoxBoolean;
                                                                        }
                                                                        acatsInDataStateCopy$default = AcatsInDataState.copy$default(acatsInDataState7, null, false, false, null, apiAvailableDestinationsResponse8, availableAccount7, null, null, str2, plaidBrokerAssets5, null, null, null, null, null, null, null, null, null, capabilityStatus4, capabilityStatus3, apiAcatsBonusPromoInfo4, null, null, false, null, false, i11 == 0 ? z2 : z ? 1 : 0, i10 == 0 ? z2 : z ? 1 : 0, i12 == 0 ? z2 : z ? 1 : 0, i13 == 0 ? z2 : z ? 1 : 0, null, false, ((Boolean) obj10).booleanValue(), false, false, -2016936753, 13, null);
                                                                        obj11 = this.$bonusInfoDeferred;
                                                                        if (Result.m28555isFailureimpl(obj11)) {
                                                                            obj11 = null;
                                                                        }
                                                                        ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo5 = (ApiAcatsBonusPromoInfo) obj11;
                                                                        boolean zAreEqual = (apiAcatsBonusPromoInfo5 != null || (promo_id = apiAcatsBonusPromoInfo5.getPromo_id()) == null) ? z2 : Intrinsics.areEqual(promo_id, this.this$0.introBonusLastShownIdPref.get());
                                                                        if (acatsInDataState7.getAccountNames() == null) {
                                                                            nextFlowStep = acatsInDataStateCopy$default.getNextFlowStep(AcatsFlowStep.CONFIRM_ACCOUNT_NAME);
                                                                        } else if (acatsInDataState7.getContraAccountNumber() != null) {
                                                                            nextFlowStep = acatsInDataStateCopy$default.getNextFlowStep(AcatsFlowStep.ENTER_ACCOUNT_NUMBER);
                                                                        } else if (Intrinsics.areEqual(this.this$0.getSavedStateHandle().get("plaid_link_pending"), boxing.boxBoolean(z2))) {
                                                                            nextFlowStep = AcatsFlowStep.PLAID_ACCOUNT_NUMBER;
                                                                        } else if (i11 != 0) {
                                                                            nextFlowStep = acatsInDataStateCopy$default.getNextFlowStep(AcatsFlowStep.AVAILABLE_DESTINATIONS);
                                                                        } else if (acatsInDataState7.getSkipIntro()) {
                                                                            nextFlowStep = acatsInDataStateCopy$default.getNextFlowStep(AcatsFlowStep.INTRO_SWIPIES);
                                                                        } else if (((AcatsIn) AcatsInDuxo.INSTANCE.getExtras(this.this$0.getSavedStateHandle())).getForceBonusIntro()) {
                                                                            Object obj12 = this.$bonusInfoDeferred;
                                                                            if (Result.m28555isFailureimpl(obj12)) {
                                                                                obj12 = null;
                                                                            }
                                                                            ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo6 = (ApiAcatsBonusPromoInfo) obj12;
                                                                            if (apiAcatsBonusPromoInfo6 == null || apiAcatsBonusPromoInfo6.is_active() != z2) {
                                                                                if (!zAreEqual || !this.this$0.introWithFeeShownPref.get()) {
                                                                                    if (zAreEqual || !this.this$0.introWithFeeShownPref.get()) {
                                                                                        if (!this.this$0.introWithFeeShownPref.get()) {
                                                                                            AcatsInDuxo acatsInDuxo2 = this.this$0;
                                                                                            this.L$0 = acatsInDataStateCopy$default;
                                                                                            this.L$1 = null;
                                                                                            this.L$2 = null;
                                                                                            this.L$3 = null;
                                                                                            this.L$4 = null;
                                                                                            this.L$5 = null;
                                                                                            this.L$6 = null;
                                                                                            this.L$7 = null;
                                                                                            this.label = 8;
                                                                                            objOnCreateInitialStepFullPromoFlow = acatsInDuxo2.onCreateInitialStepFullPromoFlow(acatsInDataState7, this);
                                                                                            break;
                                                                                        } else {
                                                                                            nextFlowStep = acatsInDataStateCopy$default.getNextFlowStep(AcatsFlowStep.INTRO_SWIPIES);
                                                                                        }
                                                                                    } else {
                                                                                        Object obj13 = this.$bonusInfoDeferred;
                                                                                        if (Result.m28555isFailureimpl(obj13)) {
                                                                                            obj13 = null;
                                                                                        }
                                                                                        ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo7 = (ApiAcatsBonusPromoInfo) obj13;
                                                                                        if (apiAcatsBonusPromoInfo7 != null && apiAcatsBonusPromoInfo7.is_active()) {
                                                                                            nextFlowStep = AcatsFlowStep.INTRO_SWIPIES_BONUS_ONLY;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    nextFlowStep = acatsInDataStateCopy$default.getNextFlowStep(AcatsFlowStep.INTRO_SWIPIES);
                                                                                }
                                                                            } else {
                                                                                nextFlowStep = AcatsFlowStep.INTRO_SWIPIES_BONUS_ONLY;
                                                                            }
                                                                        }
                                                                        if (nextFlowStep == null) {
                                                                            nextFlowStep = AcatsFlowStep.BROKERAGE_SEARCH;
                                                                        }
                                                                        if ((nextFlowStep != AcatsFlowStep.BROKERAGE_SEARCH || acatsInDataStateCopy$default.isGoldUser()) && this.this$0.shouldShowPromoScreen(acatsInDataStateCopy$default)) {
                                                                            this.this$0.submitPromoScreenNavigationEvent(acatsInDataStateCopy$default, true);
                                                                        }
                                                                        this.this$0.submit(new AcatsInEvent.FlowNavigationEvent(nextFlowStep, acatsInDataStateCopy$default, z));
                                                                        return acatsInDataStateCopy$default;
                                                                    }
                                                                    apiAvailableDestinationsResponse6 = apiAvailableDestinationsResponse7;
                                                                }
                                                            }
                                                            apiAvailableDestinationsResponse8 = apiAvailableDestinationsResponse6;
                                                            capabilityStatus3 = CapabilityStatus.DISABLED;
                                                            acatsInDataState7 = acatsInDataState6;
                                                            CapabilityStatus capabilityStatus42 = capabilityStatus2;
                                                            String str22 = str;
                                                            PlaidBrokerAssets plaidBrokerAssets52 = plaidBrokerAssets3;
                                                            ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo42 = apiAcatsBonusPromoInfo3;
                                                            AvailableAccount availableAccount72 = availableAccount6;
                                                            Boolean boolBoxBoolean2 = boxing.boxBoolean(z);
                                                            if (Result.m28555isFailureimpl(obj10)) {
                                                            }
                                                            acatsInDataStateCopy$default = AcatsInDataState.copy$default(acatsInDataState7, null, false, false, null, apiAvailableDestinationsResponse8, availableAccount72, null, null, str22, plaidBrokerAssets52, null, null, null, null, null, null, null, null, null, capabilityStatus42, capabilityStatus3, apiAcatsBonusPromoInfo42, null, null, false, null, false, i11 == 0 ? z2 : z ? 1 : 0, i10 == 0 ? z2 : z ? 1 : 0, i12 == 0 ? z2 : z ? 1 : 0, i13 == 0 ? z2 : z ? 1 : 0, null, false, ((Boolean) obj10).booleanValue(), false, false, -2016936753, 13, null);
                                                            obj11 = this.$bonusInfoDeferred;
                                                            if (Result.m28555isFailureimpl(obj11)) {
                                                            }
                                                            ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo52 = (ApiAcatsBonusPromoInfo) obj11;
                                                            if (apiAcatsBonusPromoInfo52 != null) {
                                                                if (acatsInDataState7.getAccountNames() == null) {
                                                                }
                                                            }
                                                            if (nextFlowStep == null) {
                                                            }
                                                            if (nextFlowStep != AcatsFlowStep.BROKERAGE_SEARCH) {
                                                                this.this$0.submitPromoScreenNavigationEvent(acatsInDataStateCopy$default, true);
                                                            } else {
                                                                this.this$0.submitPromoScreenNavigationEvent(acatsInDataStateCopy$default, true);
                                                            }
                                                            this.this$0.submit(new AcatsInEvent.FlowNavigationEvent(nextFlowStep, acatsInDataStateCopy$default, z));
                                                            return acatsInDataStateCopy$default;
                                                        }
                                                        obj8 = obj9;
                                                        if (!Intrinsics.areEqual(this.this$0.getSavedStateHandle().get("options_declined"), boxing.boxBoolean(z2))) {
                                                            capabilityStatus = CapabilityStatus.DECLINED;
                                                        } else {
                                                            capabilityStatus = CapabilityStatus.DISABLED;
                                                        }
                                                        availableAccount6 = availableAccount5;
                                                        plaidBrokerAssets3 = plaidBrokerAssets2;
                                                        capabilityStatus2 = capabilityStatus;
                                                        apiAvailableDestinationsResponse6 = apiAvailableDestinationsResponse5;
                                                        apiAcatsBonusPromoInfo3 = apiAcatsBonusPromoInfo2;
                                                        str = plaidAccessTokenId;
                                                        i11 = i7;
                                                        i12 = i8;
                                                        i13 = i9;
                                                        acatsInDataState6 = acatsInDataState5;
                                                        obj10 = obj8;
                                                        if (i12 != 0) {
                                                        }
                                                        apiAvailableDestinationsResponse8 = apiAvailableDestinationsResponse6;
                                                        capabilityStatus3 = CapabilityStatus.DISABLED;
                                                        acatsInDataState7 = acatsInDataState6;
                                                        CapabilityStatus capabilityStatus422 = capabilityStatus2;
                                                        String str222 = str;
                                                        PlaidBrokerAssets plaidBrokerAssets522 = plaidBrokerAssets3;
                                                        ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo422 = apiAcatsBonusPromoInfo3;
                                                        AvailableAccount availableAccount722 = availableAccount6;
                                                        Boolean boolBoxBoolean22 = boxing.boxBoolean(z);
                                                        if (Result.m28555isFailureimpl(obj10)) {
                                                        }
                                                        acatsInDataStateCopy$default = AcatsInDataState.copy$default(acatsInDataState7, null, false, false, null, apiAvailableDestinationsResponse8, availableAccount722, null, null, str222, plaidBrokerAssets522, null, null, null, null, null, null, null, null, null, capabilityStatus422, capabilityStatus3, apiAcatsBonusPromoInfo422, null, null, false, null, false, i11 == 0 ? z2 : z ? 1 : 0, i10 == 0 ? z2 : z ? 1 : 0, i12 == 0 ? z2 : z ? 1 : 0, i13 == 0 ? z2 : z ? 1 : 0, null, false, ((Boolean) obj10).booleanValue(), false, false, -2016936753, 13, null);
                                                        obj11 = this.$bonusInfoDeferred;
                                                        if (Result.m28555isFailureimpl(obj11)) {
                                                        }
                                                        ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo522 = (ApiAcatsBonusPromoInfo) obj11;
                                                        if (apiAcatsBonusPromoInfo522 != null) {
                                                        }
                                                        if (nextFlowStep == null) {
                                                        }
                                                        if (nextFlowStep != AcatsFlowStep.BROKERAGE_SEARCH) {
                                                        }
                                                        this.this$0.submit(new AcatsInEvent.FlowNavigationEvent(nextFlowStep, acatsInDataStateCopy$default, z));
                                                        return acatsInDataStateCopy$default;
                                                    }
                                                    return coroutine_suspended;
                                                }
                                                z2 = true;
                                                if (!Intrinsics.areEqual(this.this$0.getSavedStateHandle().get("options_declined"), boxing.boxBoolean(z2))) {
                                                }
                                                availableAccount6 = availableAccount5;
                                                plaidBrokerAssets3 = plaidBrokerAssets2;
                                                capabilityStatus2 = capabilityStatus;
                                                apiAvailableDestinationsResponse6 = apiAvailableDestinationsResponse5;
                                                apiAcatsBonusPromoInfo3 = apiAcatsBonusPromoInfo2;
                                                str = plaidAccessTokenId;
                                                i11 = i7;
                                                i12 = i8;
                                                i13 = i9;
                                                acatsInDataState6 = acatsInDataState5;
                                                obj10 = obj8;
                                                if (i12 != 0) {
                                                }
                                                apiAvailableDestinationsResponse8 = apiAvailableDestinationsResponse6;
                                                capabilityStatus3 = CapabilityStatus.DISABLED;
                                                acatsInDataState7 = acatsInDataState6;
                                                CapabilityStatus capabilityStatus4222 = capabilityStatus2;
                                                String str2222 = str;
                                                PlaidBrokerAssets plaidBrokerAssets5222 = plaidBrokerAssets3;
                                                ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo4222 = apiAcatsBonusPromoInfo3;
                                                AvailableAccount availableAccount7222 = availableAccount6;
                                                Boolean boolBoxBoolean222 = boxing.boxBoolean(z);
                                                if (Result.m28555isFailureimpl(obj10)) {
                                                }
                                                acatsInDataStateCopy$default = AcatsInDataState.copy$default(acatsInDataState7, null, false, false, null, apiAvailableDestinationsResponse8, availableAccount7222, null, null, str2222, plaidBrokerAssets5222, null, null, null, null, null, null, null, null, null, capabilityStatus4222, capabilityStatus3, apiAcatsBonusPromoInfo4222, null, null, false, null, false, i11 == 0 ? z2 : z ? 1 : 0, i10 == 0 ? z2 : z ? 1 : 0, i12 == 0 ? z2 : z ? 1 : 0, i13 == 0 ? z2 : z ? 1 : 0, null, false, ((Boolean) obj10).booleanValue(), false, false, -2016936753, 13, null);
                                                obj11 = this.$bonusInfoDeferred;
                                                if (Result.m28555isFailureimpl(obj11)) {
                                                }
                                                ApiAcatsBonusPromoInfo apiAcatsBonusPromoInfo5222 = (ApiAcatsBonusPromoInfo) obj11;
                                                if (apiAcatsBonusPromoInfo5222 != null) {
                                                }
                                                if (nextFlowStep == null) {
                                                }
                                                if (nextFlowStep != AcatsFlowStep.BROKERAGE_SEARCH) {
                                                }
                                                this.this$0.submit(new AcatsInEvent.FlowNavigationEvent(nextFlowStep, acatsInDataStateCopy$default, z));
                                                return acatsInDataStateCopy$default;
                                            }
                                        }
                                    }
                                }
                            } else if (apiAvailableDestinationsResponse != null) {
                                defaultAccount = AcatsInDataState2.getDefaultAccount(apiAvailableDestinationsResponse);
                            } else {
                                availableAccount = null;
                                i = z ? 1 : 0;
                                this.this$0.getSavedStateHandle().set("selected_rhs_account", availableAccount);
                                this.this$0.selectedRhsAccountRelay.accept(Optional3.asOptional(availableAccount));
                                if (availableAccount == null) {
                                }
                                acatsInDataState2 = acatsInDataState;
                                deferred3 = deferred2;
                                deferred4 = deferred;
                                obj4 = obj2;
                                deferred5 = plaidBrokerAssets;
                                apiAvailableDestinationsResponse2 = apiAvailableDestinationsResponse;
                                availableAccount2 = availableAccount;
                                i2 = i;
                                i3 = z ? 1 : 0;
                                if (availableAccount2 == null) {
                                }
                                acatsInDataState3 = acatsInDataState2;
                                deferred6 = deferred3;
                                deferred7 = deferred4;
                                obj5 = obj4;
                                deferred8 = deferred5;
                                apiAvailableDestinationsResponse3 = apiAvailableDestinationsResponse2;
                                availableAccount3 = availableAccount2;
                                i4 = i2;
                                i5 = i3;
                                i6 = z ? 1 : 0;
                                if (availableAccount3 == null) {
                                }
                                availableAccount4 = availableAccount3;
                                i7 = i4;
                                i8 = i5;
                                i9 = i6;
                                i10 = z ? 1 : 0;
                                acatsInDataState4 = acatsInDataState3;
                                deferred9 = deferred6;
                                deferred10 = deferred7;
                                obj6 = obj5;
                                apiAvailableDestinationsResponse4 = apiAvailableDestinationsResponse3;
                                obj7 = this.$bonusInfoDeferred;
                                if (Result.m28555isFailureimpl(obj7)) {
                                }
                                apiAcatsBonusPromoInfo = (ApiAcatsBonusPromoInfo) obj7;
                                if (deferred8 != null) {
                                }
                            }
                        }
                        availableAccount = defaultAccount;
                        i = z ? 1 : 0;
                        this.this$0.getSavedStateHandle().set("selected_rhs_account", availableAccount);
                        this.this$0.selectedRhsAccountRelay.accept(Optional3.asOptional(availableAccount));
                        if (availableAccount == null) {
                        }
                        acatsInDataState2 = acatsInDataState;
                        deferred3 = deferred2;
                        deferred4 = deferred;
                        obj4 = obj2;
                        deferred5 = plaidBrokerAssets;
                        apiAvailableDestinationsResponse2 = apiAvailableDestinationsResponse;
                        availableAccount2 = availableAccount;
                        i2 = i;
                        i3 = z ? 1 : 0;
                        if (availableAccount2 == null) {
                        }
                        acatsInDataState3 = acatsInDataState2;
                        deferred6 = deferred3;
                        deferred7 = deferred4;
                        obj5 = obj4;
                        deferred8 = deferred5;
                        apiAvailableDestinationsResponse3 = apiAvailableDestinationsResponse2;
                        availableAccount3 = availableAccount2;
                        i4 = i2;
                        i5 = i3;
                        i6 = z ? 1 : 0;
                        if (availableAccount3 == null) {
                        }
                        availableAccount4 = availableAccount3;
                        i7 = i4;
                        i8 = i5;
                        i9 = i6;
                        i10 = z ? 1 : 0;
                        acatsInDataState4 = acatsInDataState3;
                        deferred9 = deferred6;
                        deferred10 = deferred7;
                        obj6 = obj5;
                        apiAvailableDestinationsResponse4 = apiAvailableDestinationsResponse3;
                        obj7 = this.$bonusInfoDeferred;
                        if (Result.m28555isFailureimpl(obj7)) {
                        }
                        apiAcatsBonusPromoInfo = (ApiAcatsBonusPromoInfo) obj7;
                        if (deferred8 != null) {
                        }
                        break;
                    case 1:
                        z = false;
                        deferred13 = (Deferred) this.L$2;
                        deferred12 = (Deferred) this.L$1;
                        acatsInDataState8 = (AcatsInDataState) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objAwait4 = obj;
                        objM28550constructorimpl = Result.m28550constructorimpl((Boolean) objAwait4);
                        obj2 = objM28550constructorimpl;
                        deferred = deferred13;
                        deferred2 = deferred12;
                        acatsInDataState = acatsInDataState8;
                        if (acatsInDataState.getSelectedRhsAccount() != null) {
                            obj3 = this.$destinationsResponseDeferred;
                            if (Result.m28555isFailureimpl(obj3)) {
                            }
                            apiAvailableDestinationsResponse = (ApiAvailableDestinationsResponse) obj3;
                            this.this$0.getSavedStateHandle().set("available_destinations", apiAvailableDestinationsResponse);
                            if (acatsInDataState.getSelectedRhsAccount() == null) {
                            }
                            availableAccount = defaultAccount;
                            i = z ? 1 : 0;
                            this.this$0.getSavedStateHandle().set("selected_rhs_account", availableAccount);
                            this.this$0.selectedRhsAccountRelay.accept(Optional3.asOptional(availableAccount));
                            if (availableAccount == null) {
                            }
                            acatsInDataState2 = acatsInDataState;
                            deferred3 = deferred2;
                            deferred4 = deferred;
                            obj4 = obj2;
                            deferred5 = plaidBrokerAssets;
                            apiAvailableDestinationsResponse2 = apiAvailableDestinationsResponse;
                            availableAccount2 = availableAccount;
                            i2 = i;
                            i3 = z ? 1 : 0;
                            if (availableAccount2 == null) {
                            }
                            acatsInDataState3 = acatsInDataState2;
                            deferred6 = deferred3;
                            deferred7 = deferred4;
                            obj5 = obj4;
                            deferred8 = deferred5;
                            apiAvailableDestinationsResponse3 = apiAvailableDestinationsResponse2;
                            availableAccount3 = availableAccount2;
                            i4 = i2;
                            i5 = i3;
                            i6 = z ? 1 : 0;
                            if (availableAccount3 == null) {
                            }
                            availableAccount4 = availableAccount3;
                            i7 = i4;
                            i8 = i5;
                            i9 = i6;
                            i10 = z ? 1 : 0;
                            acatsInDataState4 = acatsInDataState3;
                            deferred9 = deferred6;
                            deferred10 = deferred7;
                            obj6 = obj5;
                            apiAvailableDestinationsResponse4 = apiAvailableDestinationsResponse3;
                            obj7 = this.$bonusInfoDeferred;
                            if (Result.m28555isFailureimpl(obj7)) {
                            }
                            apiAcatsBonusPromoInfo = (ApiAcatsBonusPromoInfo) obj7;
                            if (deferred8 != null) {
                            }
                            break;
                        }
                        if (nextFlowStep == null) {
                        }
                        if (nextFlowStep != AcatsFlowStep.BROKERAGE_SEARCH) {
                        }
                        this.this$0.submit(new AcatsInEvent.FlowNavigationEvent(nextFlowStep, acatsInDataStateCopy$default, z));
                        return acatsInDataStateCopy$default;
                    case 2:
                        z = false;
                        i = this.I$0;
                        availableAccount = (AvailableAccount) this.L$6;
                        apiAvailableDestinationsResponse = (ApiAvailableDestinationsResponse) this.L$5;
                        plaidBrokerAssets = (Deferred) this.L$4;
                        obj2 = this.L$3;
                        deferred = (Deferred) this.L$2;
                        deferred2 = (Deferred) this.L$1;
                        acatsInDataState = (AcatsInDataState) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objFirst = obj;
                        AvailableAccount availableAccount8 = availableAccount;
                        i2 = i;
                        i3 = ((Boolean) objFirst).booleanValue() ? 1 : 0;
                        acatsInDataState2 = acatsInDataState;
                        deferred3 = deferred2;
                        deferred4 = deferred;
                        obj4 = obj2;
                        deferred5 = plaidBrokerAssets;
                        apiAvailableDestinationsResponse2 = apiAvailableDestinationsResponse;
                        availableAccount2 = availableAccount8;
                        if (availableAccount2 == null) {
                        }
                        acatsInDataState3 = acatsInDataState2;
                        deferred6 = deferred3;
                        deferred7 = deferred4;
                        obj5 = obj4;
                        deferred8 = deferred5;
                        apiAvailableDestinationsResponse3 = apiAvailableDestinationsResponse2;
                        availableAccount3 = availableAccount2;
                        i4 = i2;
                        i5 = i3;
                        i6 = z ? 1 : 0;
                        if (availableAccount3 == null) {
                        }
                        availableAccount4 = availableAccount3;
                        i7 = i4;
                        i8 = i5;
                        i9 = i6;
                        i10 = z ? 1 : 0;
                        acatsInDataState4 = acatsInDataState3;
                        deferred9 = deferred6;
                        deferred10 = deferred7;
                        obj6 = obj5;
                        apiAvailableDestinationsResponse4 = apiAvailableDestinationsResponse3;
                        obj7 = this.$bonusInfoDeferred;
                        if (Result.m28555isFailureimpl(obj7)) {
                        }
                        apiAcatsBonusPromoInfo = (ApiAcatsBonusPromoInfo) obj7;
                        if (deferred8 != null) {
                        }
                        break;
                    case 3:
                        z = false;
                        i3 = this.I$1;
                        i2 = this.I$0;
                        availableAccount2 = (AvailableAccount) this.L$6;
                        apiAvailableDestinationsResponse2 = (ApiAvailableDestinationsResponse) this.L$5;
                        deferred5 = (Deferred) this.L$4;
                        obj4 = this.L$3;
                        deferred4 = (Deferred) this.L$2;
                        deferred3 = (Deferred) this.L$1;
                        acatsInDataState2 = (AcatsInDataState) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objFirst2 = obj;
                        int i14 = i2;
                        i5 = i3;
                        i6 = ((Boolean) objFirst2).booleanValue() ? 1 : 0;
                        acatsInDataState3 = acatsInDataState2;
                        deferred6 = deferred3;
                        deferred7 = deferred4;
                        obj5 = obj4;
                        deferred8 = deferred5;
                        apiAvailableDestinationsResponse3 = apiAvailableDestinationsResponse2;
                        availableAccount3 = availableAccount2;
                        i4 = i14;
                        if (availableAccount3 == null) {
                        }
                        availableAccount4 = availableAccount3;
                        i7 = i4;
                        i8 = i5;
                        i9 = i6;
                        i10 = z ? 1 : 0;
                        acatsInDataState4 = acatsInDataState3;
                        deferred9 = deferred6;
                        deferred10 = deferred7;
                        obj6 = obj5;
                        apiAvailableDestinationsResponse4 = apiAvailableDestinationsResponse3;
                        obj7 = this.$bonusInfoDeferred;
                        if (Result.m28555isFailureimpl(obj7)) {
                        }
                        apiAcatsBonusPromoInfo = (ApiAcatsBonusPromoInfo) obj7;
                        if (deferred8 != null) {
                        }
                        break;
                    case 4:
                        z = false;
                        i6 = this.I$2;
                        i5 = this.I$1;
                        i4 = this.I$0;
                        availableAccount3 = (AvailableAccount) this.L$6;
                        apiAvailableDestinationsResponse3 = (ApiAvailableDestinationsResponse) this.L$5;
                        deferred8 = (Deferred) this.L$4;
                        obj5 = this.L$3;
                        deferred7 = (Deferred) this.L$2;
                        deferred6 = (Deferred) this.L$1;
                        acatsInDataState3 = (AcatsInDataState) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objFirst3 = obj;
                        int i15 = i5;
                        i9 = i6;
                        i10 = ((Boolean) objFirst3).booleanValue() ? 1 : 0;
                        availableAccount4 = availableAccount3;
                        i7 = i4;
                        i8 = i15;
                        acatsInDataState4 = acatsInDataState3;
                        deferred9 = deferred6;
                        deferred10 = deferred7;
                        obj6 = obj5;
                        apiAvailableDestinationsResponse4 = apiAvailableDestinationsResponse3;
                        obj7 = this.$bonusInfoDeferred;
                        if (Result.m28555isFailureimpl(obj7)) {
                        }
                        apiAcatsBonusPromoInfo = (ApiAcatsBonusPromoInfo) obj7;
                        if (deferred8 != null) {
                        }
                        break;
                    case 5:
                        z = false;
                        i10 = this.I$3;
                        i9 = this.I$2;
                        i8 = this.I$1;
                        i7 = this.I$0;
                        apiAcatsBonusPromoInfo = (ApiAcatsBonusPromoInfo) this.L$6;
                        AvailableAccount availableAccount9 = (AvailableAccount) this.L$5;
                        apiAvailableDestinationsResponse4 = (ApiAvailableDestinationsResponse) this.L$4;
                        obj6 = this.L$3;
                        deferred10 = (Deferred) this.L$2;
                        deferred9 = (Deferred) this.L$1;
                        acatsInDataState4 = (AcatsInDataState) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        availableAccount4 = availableAccount9;
                        objAwait = obj;
                        plaidBrokerAssets2 = (PlaidBrokerAssets) objAwait;
                        Object obj14 = obj6;
                        availableAccount5 = availableAccount4;
                        obj8 = obj14;
                        acatsInDataState5 = acatsInDataState4;
                        deferred11 = deferred10;
                        apiAvailableDestinationsResponse5 = apiAvailableDestinationsResponse4;
                        apiAcatsBonusPromoInfo2 = apiAcatsBonusPromoInfo;
                        plaidAccessTokenId = acatsInDataState5.getPlaidAccessTokenId();
                        if (i10 == 0) {
                        }
                        break;
                    case 6:
                        z = false;
                        i10 = this.I$3;
                        i9 = this.I$2;
                        i8 = this.I$1;
                        i7 = this.I$0;
                        plaidAccessTokenId = (String) this.L$7;
                        plaidBrokerAssets2 = (PlaidBrokerAssets) this.L$6;
                        apiAcatsBonusPromoInfo2 = (ApiAcatsBonusPromoInfo) this.L$5;
                        availableAccount5 = (AvailableAccount) this.L$4;
                        apiAvailableDestinationsResponse5 = (ApiAvailableDestinationsResponse) this.L$3;
                        obj9 = this.L$2;
                        deferred11 = (Deferred) this.L$1;
                        acatsInDataState5 = (AcatsInDataState) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        z2 = true;
                        objAwait2 = obj;
                        if (!((Boolean) objAwait2).booleanValue()) {
                        }
                        break;
                    case 7:
                        i10 = this.I$3;
                        i13 = this.I$2;
                        i12 = this.I$1;
                        i11 = this.I$0;
                        capabilityStatus2 = (CapabilityStatus) this.L$7;
                        str = (String) this.L$6;
                        plaidBrokerAssets3 = (PlaidBrokerAssets) this.L$5;
                        apiAcatsBonusPromoInfo3 = (ApiAcatsBonusPromoInfo) this.L$4;
                        availableAccount6 = (AvailableAccount) this.L$3;
                        apiAvailableDestinationsResponse7 = (ApiAvailableDestinationsResponse) this.L$2;
                        obj10 = this.L$1;
                        z = false;
                        acatsInDataState6 = (AcatsInDataState) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objAwait3 = obj;
                        z2 = true;
                        if (!((Boolean) objAwait3).booleanValue()) {
                        }
                        break;
                    case 8:
                        acatsInDataStateCopy$default = (AcatsInDataState) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        objOnCreateInitialStepFullPromoFlow = obj;
                        z = false;
                        nextFlowStep = (AcatsFlowStep) objOnCreateInitialStepFullPromoFlow;
                        if (nextFlowStep == null) {
                        }
                        if (nextFlowStep != AcatsFlowStep.BROKERAGE_SEARCH) {
                        }
                        this.this$0.submit(new AcatsInEvent.FlowNavigationEvent(nextFlowStep, acatsInDataStateCopy$default, z));
                        return acatsInDataStateCopy$default;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(final AcatsInDuxo acatsInDuxo, final Boolean bool) {
        acatsInDuxo.withDataState(new Function1() { // from class: com.robinhood.android.acatsin.AcatsInDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInDuxo.onCreate$lambda$1$lambda$0(bool, acatsInDuxo, (AcatsInDataState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1$lambda$0(Boolean bool, AcatsInDuxo acatsInDuxo, AcatsInDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (bool.booleanValue() && !dataState.getMatchRateSelected()) {
            acatsInDuxo.submit(AcatsInEvent.MatchRateSelectionEvent.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4 */
    static final class C77074 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C77074(Continuation<? super C77074> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C77074 c77074 = AcatsInDuxo.this.new C77074(continuation);
            c77074.L$0 = obj;
            return c77074;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C77074) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AcatsInDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$1", m3645f = "AcatsInDuxo.kt", m3646l = {351}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AcatsInDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AcatsInDuxo acatsInDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = acatsInDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(this.this$0.rhfAccountNumberStream), Integer.MAX_VALUE, null, 2, null);
                    Flow flowTransformLatest = FlowKt.transformLatest(new Flow<String>() { // from class: com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$1$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                            Object objCollect = flowBuffer$default.collect(new C76912(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$1$invokeSuspend$$inlined$mapNotNull$1$2 */
                        public static final class C76912<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "AcatsInDuxo.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C76912.this.emit(null, this);
                                }
                            }

                            public C76912(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    Object orNull = ((Optional) obj).getOrNull();
                                    if (orNull != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(orNull, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, new AcatsInDuxo$onCreate$4$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0));
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowTransformLatest, anonymousClass3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: AcatsInDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Triple;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$1$3", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$1$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Tuples3<? extends Boolean, ? extends Boolean, ? extends Boolean>, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AcatsInDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(AcatsInDuxo acatsInDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = acatsInDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Tuples3<? extends Boolean, ? extends Boolean, ? extends Boolean> tuples3, Continuation<? super Unit> continuation) {
                    return invoke2((Tuples3<Boolean, Boolean, Boolean>) tuples3, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Tuples3<Boolean, Boolean, Boolean> tuples3, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(tuples3, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AcatsInDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/AcatsInDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$1$3$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$1$3$1, reason: invalid class name and collision with other inner class name */
                static final class C494971 extends ContinuationImpl7 implements Function2<AcatsInDataState, Continuation<? super AcatsInDataState>, Object> {
                    final /* synthetic */ boolean $isAcatsBrokerageMatchSupported;
                    final /* synthetic */ boolean $isMarginSupported;
                    final /* synthetic */ boolean $isOptionsSupported;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C494971(boolean z, boolean z2, boolean z3, Continuation<? super C494971> continuation) {
                        super(2, continuation);
                        this.$isOptionsSupported = z;
                        this.$isMarginSupported = z2;
                        this.$isAcatsBrokerageMatchSupported = z3;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C494971 c494971 = new C494971(this.$isOptionsSupported, this.$isMarginSupported, this.$isAcatsBrokerageMatchSupported, continuation);
                        c494971.L$0 = obj;
                        return c494971;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
                        return ((C494971) create(acatsInDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AcatsInDataState.copy$default((AcatsInDataState) this.L$0, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, this.$isOptionsSupported, this.$isMarginSupported, this.$isAcatsBrokerageMatchSupported, null, false, false, false, false, -1879048193, 15, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        Tuples3 tuples3 = (Tuples3) this.L$0;
                        boolean zBooleanValue = ((Boolean) tuples3.component1()).booleanValue();
                        this.this$0.applyMutation(new C494971(((Boolean) tuples3.component2()).booleanValue(), zBooleanValue, ((Boolean) tuples3.component3()).booleanValue(), null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(AcatsInDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(AcatsInDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass3(AcatsInDuxo.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: AcatsInDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$2", m3645f = "AcatsInDuxo.kt", m3646l = {389}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AcatsInDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AcatsInDuxo acatsInDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = acatsInDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{AcatsRejectedImprovementsExperiment.INSTANCE}, false, null, 6, null);
                    final AcatsInDuxo acatsInDuxo = this.this$0;
                    final Flow<AcatsTransferHubBottomSheetDetails> flow = new Flow<AcatsTransferHubBottomSheetDetails>() { // from class: com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$2$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super AcatsTransferHubBottomSheetDetails> flowCollector, Continuation continuation) {
                            Object objCollect = flowStreamStateFlow$default.collect(new C76932(flowCollector, acatsInDuxo), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$2$invokeSuspend$$inlined$mapNotNull$1$2 */
                        public static final class C76932<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;
                            final /* synthetic */ AcatsInDuxo this$0;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "AcatsInDuxo.kt", m3646l = {58, 70}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C76932.this.emit(null, this);
                                }
                            }

                            public C76932(FlowCollector flowCollector, AcatsInDuxo acatsInDuxo) {
                                this.$this_unsafeFlow = flowCollector;
                                this.this$0 = acatsInDuxo;
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
                            
                                if (r2.emit(r0, r14) == r1) goto L39;
                             */
                            /* JADX WARN: Removed duplicated region for block: B:37:0x0090  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                FlowCollector flowCollector;
                                Throwable th;
                                FlowCollector flowCollector2;
                                AcatsTransferHubBottomSheetDetails uiModel;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                AnonymousClass1 anonymousClass12 = anonymousClass1;
                                Object objGetAcatsTransferHubBottomSheet = anonymousClass12.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass12.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(objGetAcatsTransferHubBottomSheet);
                                    flowCollector = this.$this_unsafeFlow;
                                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                                    this.this$0.applyMutation(new AcatsInDuxo$onCreate$4$2$1$1(zBooleanValue, null));
                                    if (!zBooleanValue) {
                                        uiModel = null;
                                        if (uiModel != null) {
                                            anonymousClass12.L$0 = null;
                                            anonymousClass12.label = 2;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    try {
                                        AcatsService acatsService = this.this$0.acatsService;
                                        GetAcatsTransferHubBottomSheetRequestDto getAcatsTransferHubBottomSheetRequestDto = new GetAcatsTransferHubBottomSheetRequestDto();
                                        anonymousClass12.L$0 = flowCollector;
                                        anonymousClass12.label = 1;
                                        objGetAcatsTransferHubBottomSheet = acatsService.GetAcatsTransferHubBottomSheet(getAcatsTransferHubBottomSheetRequestDto, anonymousClass12);
                                        if (objGetAcatsTransferHubBottomSheet != coroutine_suspended) {
                                            flowCollector2 = flowCollector;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        flowCollector2 = flowCollector;
                                        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                                        flowCollector = flowCollector2;
                                        if (uiModel != null) {
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    return coroutine_suspended;
                                }
                                if (i2 != 1) {
                                    if (i2 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(objGetAcatsTransferHubBottomSheet);
                                    return Unit.INSTANCE;
                                }
                                flowCollector2 = (FlowCollector) anonymousClass12.L$0;
                                try {
                                    ResultKt.throwOnFailure(objGetAcatsTransferHubBottomSheet);
                                } catch (Throwable th3) {
                                    th = th3;
                                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                                    flowCollector = flowCollector2;
                                    if (uiModel != null) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                AcatsTransferHubBottomSheetDetailsDto bottom_sheet_details = ((GetAcatsTransferHubBottomSheetResponseDto) objGetAcatsTransferHubBottomSheet).getBottom_sheet_details();
                                uiModel = bottom_sheet_details != null ? AcatsTransferHubBottomSheetResponse3.toUiModel(bottom_sheet_details) : null;
                                flowCollector = flowCollector2;
                                if (uiModel != null) {
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    final AcatsInDuxo acatsInDuxo2 = this.this$0;
                    Flow<AcatsTransferHubBottomSheetDetails> flow2 = new Flow<AcatsTransferHubBottomSheetDetails>() { // from class: com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$2$invokeSuspend$$inlined$filter$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super AcatsTransferHubBottomSheetDetails> flowCollector, Continuation continuation) {
                            Object objCollect = flow.collect(new C76922(flowCollector, acatsInDuxo2), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$2$invokeSuspend$$inlined$filter$1$2 */
                        public static final class C76922<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;
                            final /* synthetic */ AcatsInDuxo this$0;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$2$invokeSuspend$$inlined$filter$1$2", m3645f = "AcatsInDuxo.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                Object L$1;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return C76922.this.emit(null, this);
                                }
                            }

                            public C76922(FlowCollector flowCollector, AcatsInDuxo acatsInDuxo) {
                                this.$this_unsafeFlow = flowCollector;
                                this.this$0 = acatsInDuxo;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    if (!this.this$0.failedBottomSheetShownPref.getValues().contains(((AcatsTransferHubBottomSheetDetails) obj).getTransferId())) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    };
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flow2, anonymousClass3, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: AcatsInDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/models/api/bonfire/AcatsTransferHubBottomSheetDetails;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$2$3", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$2$3, reason: invalid class name */
            static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<AcatsTransferHubBottomSheetDetails, Continuation<? super Unit>, Object> {
                /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AcatsInDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(AcatsInDuxo acatsInDuxo, Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                    this.this$0 = acatsInDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                    anonymousClass3.L$0 = obj;
                    return anonymousClass3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AcatsTransferHubBottomSheetDetails acatsTransferHubBottomSheetDetails, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(acatsTransferHubBottomSheetDetails, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        AcatsTransferHubBottomSheetDetails acatsTransferHubBottomSheetDetails = (AcatsTransferHubBottomSheetDetails) this.L$0;
                        this.this$0.failedBottomSheetShownPref.add(acatsTransferHubBottomSheetDetails.getTransferId());
                        this.this$0.submit(new AcatsInEvent.ShowFailedTransferBottomSheet(acatsTransferHubBottomSheetDetails));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* compiled from: AcatsInDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$3", m3645f = "AcatsInDuxo.kt", m3646l = {398}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AcatsInDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(AcatsInDuxo acatsInDuxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = acatsInDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{EquitiesSubzero.INSTANCE}, false, null, 6, null);
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                    this.label = 1;
                    if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }

            /* compiled from: AcatsInDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "inExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$3$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
                /* synthetic */ boolean Z$0;
                int label;
                final /* synthetic */ AcatsInDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AcatsInDuxo acatsInDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = acatsInDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                    anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                    return invoke(bool.booleanValue(), continuation);
                }

                public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: AcatsInDuxo.kt */
                @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/AcatsInDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$3$1$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
                /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onCreate$4$3$1$1, reason: invalid class name and collision with other inner class name */
                static final class C494981 extends ContinuationImpl7 implements Function2<AcatsInDataState, Continuation<? super AcatsInDataState>, Object> {
                    final /* synthetic */ boolean $inExperiment;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C494981(boolean z, Continuation<? super C494981> continuation) {
                        super(2, continuation);
                        this.$inExperiment = z;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C494981 c494981 = new C494981(this.$inExperiment, continuation);
                        c494981.L$0 = obj;
                        return c494981;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
                        return ((C494981) create(acatsInDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return AcatsInDataState.copy$default((AcatsInDataState) this.L$0, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, this.$inExperiment, -1, 7, null);
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.this$0.applyMutation(new C494981(this.Z$0, null));
                        return Unit.INSTANCE;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        Observable<R> observableSwitchMap = this.rhsAccountNumberStream.switchMap(new Function() { // from class: com.robinhood.android.acatsin.AcatsInDuxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<MarginSettings>> apply(Optional<String> it) {
                Observable optionals;
                Intrinsics.checkNotNullParameter(it, "it");
                String orNull = it.getOrNull();
                return (orNull == null || (optionals = ObservablesKt.toOptionals(AcatsInDuxo.this.marginSettingsStore.streamMarginSettings(orNull))) == null) ? Observable.just(Optional2.INSTANCE) : optionals;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acatsin.AcatsInDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInDuxo.onStart$lambda$2(this.f$0, (Optional) obj);
            }
        });
        Observable<R> observableSwitchMap2 = this.rhsAccountNumberStream.switchMap(new Function() { // from class: com.robinhood.android.acatsin.AcatsInDuxo.onStart.3
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<Account, Boolean>> apply(Optional<String> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                String strComponent1 = optional.component1();
                if (strComponent1 != null) {
                    Observable<Account> observableStreamAccountByRhs = AcatsInDuxo.this.accountProvider.streamAccountByRhs(strComponent1);
                    final AcatsInDuxo acatsInDuxo = AcatsInDuxo.this;
                    return observableStreamAccountByRhs.switchMap(new Function() { // from class: com.robinhood.android.acatsin.AcatsInDuxo.onStart.3.1
                        @Override // io.reactivex.functions.Function
                        public final ObservableSource<? extends Tuples2<Account, Boolean>> apply(final Account accountDetails) {
                            Intrinsics.checkNotNullParameter(accountDetails, "accountDetails");
                            AcatsInDuxo acatsInDuxo2 = acatsInDuxo;
                            final Flow<Boolean> featureAccess = acatsInDuxo2.accountAccessStore.getFeatureAccess(accountDetails, AccountFeature.OPTIONS_HAS_ACCESS);
                            return acatsInDuxo2.asObservable(new Flow<Tuples2<? extends Account, ? extends Boolean>>() { // from class: com.robinhood.android.acatsin.AcatsInDuxo$onStart$3$1$apply$$inlined$map$1
                                @Override // kotlinx.coroutines.flow.Flow
                                public Object collect(FlowCollector<? super Tuples2<? extends Account, ? extends Boolean>> flowCollector, Continuation continuation) {
                                    Object objCollect = featureAccess.collect(new C76942(flowCollector, accountDetails), continuation);
                                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                                }

                                /* compiled from: Emitters.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onStart$3$1$apply$$inlined$map$1$2 */
                                public static final class C76942<T> implements FlowCollector {
                                    final /* synthetic */ Account $accountDetails$inlined;
                                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onStart$3$1$apply$$inlined$map$1$2", m3645f = "AcatsInDuxo.kt", m3646l = {50}, m3647m = "emit")
                                    /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onStart$3$1$apply$$inlined$map$1$2$1, reason: invalid class name */
                                    public static final class AnonymousClass1 extends ContinuationImpl {
                                        Object L$0;
                                        int label;
                                        /* synthetic */ Object result;

                                        public AnonymousClass1(Continuation continuation) {
                                            super(continuation);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                        public final Object invokeSuspend(Object obj) {
                                            this.result = obj;
                                            this.label |= Integer.MIN_VALUE;
                                            return C76942.this.emit(null, this);
                                        }
                                    }

                                    public C76942(FlowCollector flowCollector, Account account) {
                                        this.$this_unsafeFlow = flowCollector;
                                        this.$accountDetails$inlined = account;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                                    @Override // kotlinx.coroutines.flow.FlowCollector
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                    */
                                    public final Object emit(Object obj, Continuation continuation) {
                                        AnonymousClass1 anonymousClass1;
                                        if (continuation instanceof AnonymousClass1) {
                                            anonymousClass1 = (AnonymousClass1) continuation;
                                            int i = anonymousClass1.label;
                                            if ((i & Integer.MIN_VALUE) != 0) {
                                                anonymousClass1.label = i - Integer.MIN_VALUE;
                                            } else {
                                                anonymousClass1 = new AnonymousClass1(continuation);
                                            }
                                        }
                                        Object obj2 = anonymousClass1.result;
                                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        int i2 = anonymousClass1.label;
                                        if (i2 == 0) {
                                            ResultKt.throwOnFailure(obj2);
                                            FlowCollector flowCollector = this.$this_unsafeFlow;
                                            Tuples2 tuples2M3642to = Tuples4.m3642to(this.$accountDetails$inlined, boxing.boxBoolean(((Boolean) obj).booleanValue()));
                                            anonymousClass1.label = 1;
                                            if (flowCollector.emit(tuples2M3642to, anonymousClass1) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } else {
                                            if (i2 != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj2);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                            });
                        }
                    });
                }
                return Observable.just(Tuples4.m3642to(null, Boolean.FALSE));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acatsin.AcatsInDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInDuxo.onStart$lambda$3(this.f$0, (Tuples2) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.experimentsStore.streamVariation(AcatsInExperiments.INSTANCE, false), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acatsin.AcatsInDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInDuxo.onStart$lambda$4(this.f$0, (Optional) obj);
            }
        });
        Observable<R> observableSwitchMap3 = this.rhsAccountNumberStream.switchMap(new Function() { // from class: com.robinhood.android.acatsin.AcatsInDuxo.onStart.6
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<String>> apply(Optional<String> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                String orNull = it.getOrNull();
                if (orNull != null) {
                    AcatsInDuxo acatsInDuxo = AcatsInDuxo.this;
                    return RxFactory.DefaultImpls.rxObservable$default(acatsInDuxo, null, new AnonymousClass1(acatsInDuxo, orNull, null), 1, null);
                }
                return Observable.never();
            }

            /* compiled from: AcatsInDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onStart$6$1", m3645f = "AcatsInDuxo.kt", m3646l = {473, 472}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onStart$6$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Produce4<? super List<? extends String>>, Continuation<? super Unit>, Object> {
                final /* synthetic */ String $rhsAccountNumber;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AcatsInDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AcatsInDuxo acatsInDuxo, String str, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = acatsInDuxo;
                    this.$rhsAccountNumber = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$rhsAccountNumber, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Produce4<? super List<? extends String>> produce4, Continuation<? super Unit> continuation) {
                    return invoke2((Produce4<? super List<String>>) produce4, continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(Produce4<? super List<String>> produce4, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
                
                    if (r1.send(r6, r5) == r0) goto L15;
                 */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Produce4 produce4;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        produce4 = (Produce4) this.L$0;
                        AcatsBrokerageStore acatsBrokerageStore = this.this$0.brokerageStore;
                        String str = this.$rhsAccountNumber;
                        this.L$0 = produce4;
                        this.label = 1;
                        obj = acatsBrokerageStore.searchBrokerages("", str, this);
                        if (obj != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    produce4 = (Produce4) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    List<String> dtcc_list_requiring_coowner_signature = ((ApiSearchBrokeragesResponse) obj).getDtcc_list_requiring_coowner_signature();
                    this.L$0 = null;
                    this.label = 2;
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap3, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.acatsin.AcatsInDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInDuxo.onStart$lambda$5(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(AcatsInDuxo acatsInDuxo, Optional optional) {
        acatsInDuxo.applyMutation(new AcatsInDuxo$onStart$2$1((MarginSettings) optional.component1(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(AcatsInDuxo acatsInDuxo, Tuples2 tuples2) {
        acatsInDuxo.applyMutation(new AcatsInDuxo$onStart$4$1((Account) tuples2.component1(), ((Boolean) tuples2.component2()).booleanValue(), null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$4(AcatsInDuxo acatsInDuxo, Optional variant) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        acatsInDuxo.applyMutation(new AcatsInDuxo$onStart$5$1(variant, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(AcatsInDuxo acatsInDuxo, List list) {
        acatsInDuxo.applyMutation(new AcatsInDuxo$onStart$7$1(list, null));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStop() {
        super.onStop();
        withDataState(new Function1() { // from class: com.robinhood.android.acatsin.AcatsInDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInDuxo.onStop$lambda$7(this.f$0, (AcatsInDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStop$lambda$7(AcatsInDuxo acatsInDuxo, AcatsInDataState ds) {
        String promo_id;
        Intrinsics.checkNotNullParameter(ds, "ds");
        if (ds.getIntroShown()) {
            acatsInDuxo.introWithFeeShownPref.set(true);
            ApiAcatsBonusPromoInfo acatsBonusPromoInfo = ds.getAcatsBonusPromoInfo();
            if (acatsBonusPromoInfo != null && (promo_id = acatsBonusPromoInfo.getPromo_id()) != null) {
                acatsInDuxo.introBonusLastShownIdPref.set(promo_id);
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/AcatsInDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$setIntroShown$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$setIntroShown$1 */
    static final class C77211 extends ContinuationImpl7 implements Function2<AcatsInDataState, Continuation<? super AcatsInDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C77211(Continuation<? super C77211> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C77211 c77211 = new C77211(continuation);
            c77211.L$0 = obj;
            return c77211;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
            return ((C77211) create(acatsInDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInDataState.copy$default((AcatsInDataState) this.L$0, null, false, true, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, false, -5, 15, null);
        }
    }

    public final void setIntroShown() {
        getSavedStateHandle().set("intro_shown", Boolean.TRUE);
        applyMutation(new C77211(null));
    }

    public final void onBrokerageSelected(final ApiBrokerage brokerage) {
        Intrinsics.checkNotNullParameter(brokerage, "brokerage");
        final Either.Left left = new Either.Left(brokerage);
        AcatsInDuxoKt.setBrokerageOrDtccNumber(getSavedStateHandle(), left);
        getSavedStateHandle().remove("account_names");
        getSavedStateHandle().remove("contra_account_number");
        getSavedStateHandle().remove("plaid_access_token_id");
        withDataState(new Function1() { // from class: com.robinhood.android.acatsin.AcatsInDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInDuxo.onBrokerageSelected$lambda$9(this.f$0, brokerage, left, (AcatsInDataState) obj);
            }
        });
        logBrokerageSelected(brokerage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBrokerageSelected$lambda$9(AcatsInDuxo acatsInDuxo, ApiBrokerage apiBrokerage, Either.Left left, AcatsInDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        AvailableAccount selectedRhsAccount = dataState.getSelectedRhsAccount();
        String rhsAccountNumber = selectedRhsAccount != null ? selectedRhsAccount.getRhsAccountNumber() : null;
        if (rhsAccountNumber != null) {
            BuildersKt__Builders_commonKt.launch$default(acatsInDuxo.getLifecycleScope(), null, null, new AcatsInDuxo$onBrokerageSelected$1$1(apiBrokerage, new Ref.ObjectRef(), acatsInDuxo, rhsAccountNumber, new Ref.ObjectRef(), left, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("No RHS account");
    }

    public final void onManualBrokerageEntrySelected() {
        withDataState(new Function1() { // from class: com.robinhood.android.acatsin.AcatsInDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInDuxo.onManualBrokerageEntrySelected$lambda$10(this.f$0, (AcatsInDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onManualBrokerageEntrySelected$lambda$10(AcatsInDuxo acatsInDuxo, AcatsInDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AcatsFlowStep acatsFlowStep = AcatsFlowStep.MANUAL_BROKERAGE_ENTRY;
        acatsInDuxo.submit(new AcatsInEvent.FlowNavigationEvent(acatsFlowStep, it, acatsFlowStep.getShouldPromptForLockScreen()));
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/AcatsInDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onDtcNumberEntered$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onDtcNumberEntered$1 */
    static final class C77091 extends ContinuationImpl7 implements Function2<AcatsInDataState, Continuation<? super AcatsInDataState>, Object> {
        final /* synthetic */ Either.Right<String> $brokerageOrDtcNumber;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AcatsInDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C77091(Either.Right<String> right, AcatsInDuxo acatsInDuxo, Continuation<? super C77091> continuation) {
            super(2, continuation);
            this.$brokerageOrDtcNumber = right;
            this.this$0 = acatsInDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C77091 c77091 = new C77091(this.$brokerageOrDtcNumber, this.this$0, continuation);
            c77091.L$0 = obj;
            return c77091;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
            return ((C77091) create(acatsInDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsInDataState acatsInDataStateCopy$default = AcatsInDataState.copy$default((AcatsInDataState) this.L$0, null, false, false, this.$brokerageOrDtcNumber, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, false, -9, 15, null);
            this.this$0.logManualDtcNumberEntered(acatsInDataStateCopy$default);
            return acatsInDataStateCopy$default;
        }
    }

    public final void onDtcNumberEntered(String dtccNumber) {
        Intrinsics.checkNotNullParameter(dtccNumber, "dtccNumber");
        Either.Right right = new Either.Right(dtccNumber);
        applyMutation(new C77091(right, this, null));
        AcatsInDuxoKt.setBrokerageOrDtccNumber(getSavedStateHandle(), right);
    }

    public final void onRhsAccountSelected(AvailableAccount account) {
        Intrinsics.checkNotNullParameter(account, "account");
        getSavedStateHandle().set("selected_rhs_account", account);
        this.selectedRhsAccountRelay.accept(Optional3.asOptional(account));
        applyMutation(new C77161(account, null));
    }

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/AcatsInDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onRhsAccountSelected$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onRhsAccountSelected$1 */
    static final class C77161 extends ContinuationImpl7 implements Function2<AcatsInDataState, Continuation<? super AcatsInDataState>, Object> {
        final /* synthetic */ AvailableAccount $account;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C77161(AvailableAccount availableAccount, Continuation<? super C77161> continuation) {
            super(2, continuation);
            this.$account = availableAccount;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C77161 c77161 = new C77161(this.$account, continuation);
            c77161.L$0 = obj;
            return c77161;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
            return ((C77161) create(acatsInDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInDataState.copy$default((AcatsInDataState) this.L$0, null, false, false, null, null, this.$account, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, false, -33, 15, null);
        }
    }

    public final void onPlaidLinkSuccess(final LinkSuccess linkSuccess) {
        Intrinsics.checkNotNullParameter(linkSuccess, "linkSuccess");
        withDataState(new Function1() { // from class: com.robinhood.android.acatsin.AcatsInDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInDuxo.onPlaidLinkSuccess$lambda$12(this.f$0, linkSuccess, (AcatsInDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPlaidLinkSuccess$lambda$12(AcatsInDuxo acatsInDuxo, LinkSuccess linkSuccess, AcatsInDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        AvailableAccount selectedRhsAccount = dataState.getSelectedRhsAccount();
        String rhsAccountNumber = selectedRhsAccount != null ? selectedRhsAccount.getRhsAccountNumber() : null;
        if (rhsAccountNumber != null) {
            BuildersKt__Builders_commonKt.launch$default(acatsInDuxo.getLifecycleScope(), null, null, new AcatsInDuxo$onPlaidLinkSuccess$1$1(acatsInDuxo, rhsAccountNumber, linkSuccess, dataState, null), 3, null);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("No RHS account");
    }

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onPlaidLinkExit$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onPlaidLinkExit$1 */
    static final class C77141 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ LinkExit $linkExit;
        int label;
        final /* synthetic */ AcatsInDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C77141(LinkExit linkExit, AcatsInDuxo acatsInDuxo, Continuation<? super C77141> continuation) {
            super(2, continuation);
            this.$linkExit = linkExit;
            this.this$0 = acatsInDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C77141(this.$linkExit, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C77141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            LinkError error = this.$linkExit.getError();
            if (error != null) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new RuntimeException("Plaid link error: " + error.getErrorMessage()), false, null, 4, null);
            }
            this.this$0.getLifecycleScope().launchWhenResumed(new AnonymousClass2(this.this$0, this.$linkExit, null));
            return Unit.INSTANCE;
        }

        /* compiled from: AcatsInDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onPlaidLinkExit$1$2", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onPlaidLinkExit$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ LinkExit $linkExit;
            int label;
            final /* synthetic */ AcatsInDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AcatsInDuxo acatsInDuxo, LinkExit linkExit, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = acatsInDuxo;
                this.$linkExit = linkExit;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$linkExit, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.this$0.getSavedStateHandle().set("plaid_link_pending", boxing.boxBoolean(false));
                AcatsInDuxo acatsInDuxo = this.this$0;
                acatsInDuxo.applyMutation(new AnonymousClass1(this.$linkExit, acatsInDuxo, null));
                return Unit.INSTANCE;
            }

            /* compiled from: AcatsInDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/AcatsInDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onPlaidLinkExit$1$2$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onPlaidLinkExit$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AcatsInDataState, Continuation<? super AcatsInDataState>, Object> {
                final /* synthetic */ LinkExit $linkExit;
                private /* synthetic */ Object L$0;
                int label;
                final /* synthetic */ AcatsInDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(LinkExit linkExit, AcatsInDuxo acatsInDuxo, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$linkExit = linkExit;
                    this.this$0 = acatsInDuxo;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$linkExit, this.this$0, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
                    return ((AnonymousClass1) create(acatsInDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    AcatsInDataState acatsInDataStateCopy$default = AcatsInDataState.copy$default((AcatsInDataState) this.L$0, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.$linkExit.getError() != null, null, false, false, false, false, false, null, false, false, false, false, -16778177, 15, null);
                    this.this$0.submit(new AcatsInEvent.FlowNavigationEvent(AcatsFlowStep.ENTER_ACCOUNT_NUMBER, acatsInDataStateCopy$default, false));
                    return acatsInDataStateCopy$default;
                }
            }
        }
    }

    public final void onPlaidLinkExit(LinkExit linkExit) {
        Intrinsics.checkNotNullParameter(linkExit, "linkExit");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C77141(linkExit, this, null), 3, null);
    }

    public final void handlePlaidLinkEvent(final LinkEvent linkEvent) {
        Intrinsics.checkNotNullParameter(linkEvent, "linkEvent");
        withDataState(new Function1() { // from class: com.robinhood.android.acatsin.AcatsInDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInDuxo.handlePlaidLinkEvent$lambda$13(this.f$0, linkEvent, (AcatsInDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit handlePlaidLinkEvent$lambda$13(AcatsInDuxo acatsInDuxo, LinkEvent linkEvent, AcatsInDataState dataState) {
        String jsonValue;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        EventLogger eventLogger = acatsInDuxo.eventLogger;
        UserInteractionEventData.EventType eventType = UserInteractionEventData.EventType.PLAID_ACATS_IN;
        String errorType = linkEvent.getMetadata().getErrorType();
        String str = errorType == null ? "" : errorType;
        String errorCode = linkEvent.getMetadata().getErrorCode();
        String str2 = errorCode == null ? "" : errorCode;
        String errorMessage = linkEvent.getMetadata().getErrorMessage();
        String str3 = errorMessage == null ? "" : errorMessage;
        PlaidEventData.Event event = PlaidEventData.Event.ON_EVENT;
        String json = linkEvent.getEventName().getJson();
        String institutionId = linkEvent.getMetadata().getInstitutionId();
        String str4 = institutionId == null ? "" : institutionId;
        String institutionName = linkEvent.getMetadata().getInstitutionName();
        String str5 = institutionName == null ? "" : institutionName;
        String institutionSearchQuery = linkEvent.getMetadata().getInstitutionSearchQuery();
        String str6 = institutionSearchQuery == null ? "" : institutionSearchQuery;
        String linkSessionId = linkEvent.getMetadata().getLinkSessionId();
        String mfaType = linkEvent.getMetadata().getMfaType();
        String str7 = mfaType == null ? "" : mfaType;
        String requestId = linkEvent.getMetadata().getRequestId();
        String str8 = requestId == null ? "" : requestId;
        String timestamp = linkEvent.getMetadata().getTimestamp();
        LinkEventViewName viewName = linkEvent.getMetadata().getViewName();
        String str9 = (viewName == null || (jsonValue = viewName.getJsonValue()) == null) ? "" : jsonValue;
        String str10 = null;
        Object[] objArr = 0 == true ? 1 : 0;
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, new UserInteractionEventData(eventType, null, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, str10, null, null, null, null, null, null, null, null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, objArr, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new PlaidEventData(event, json, str2, str3, str, null, str10, str4, str5, str6, linkSessionId, str7, str8, timestamp, str9, null, null, null, null, null, 1015904, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, dataState.getScreenContext().toLoggingContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -16385, -1, -33554433, -1, -1, 16383, null), null, null, 110, null), false, false, 6, null);
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/AcatsInDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onAccountNumberEntered$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onAccountNumberEntered$1 */
    static final class C77011 extends ContinuationImpl7 implements Function2<AcatsInDataState, Continuation<? super AcatsInDataState>, Object> {
        final /* synthetic */ String $accountNumber;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C77011(String str, Continuation<? super C77011> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C77011 c77011 = new C77011(this.$accountNumber, continuation);
            c77011.L$0 = obj;
            return c77011;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
            return ((C77011) create(acatsInDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInDataState.copy$default((AcatsInDataState) this.L$0, null, false, false, null, null, null, null, this.$accountNumber, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, false, -129, 15, null);
        }
    }

    public final void onAccountNumberEntered(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        applyMutation(new C77011(accountNumber, null));
        getSavedStateHandle().set("contra_account_number", accountNumber);
    }

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/AcatsInDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onAccountNameConfirmed$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onAccountNameConfirmed$1 */
    static final class C77001 extends ContinuationImpl7 implements Function2<AcatsInDataState, Continuation<? super AcatsInDataState>, Object> {
        final /* synthetic */ NamesOnAccount $accountNames;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C77001(NamesOnAccount namesOnAccount, Continuation<? super C77001> continuation) {
            super(2, continuation);
            this.$accountNames = namesOnAccount;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C77001 c77001 = new C77001(this.$accountNames, continuation);
            c77001.L$0 = obj;
            return c77001;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
            return ((C77001) create(acatsInDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsInDataState acatsInDataState = (AcatsInDataState) this.L$0;
            NamesOnAccount namesOnAccount = this.$accountNames;
            CapabilityStatus optionsCapabilityStatus = acatsInDataState.getOptionsCapabilityStatus();
            CapabilityStatus capabilityStatus = CapabilityStatus.ENABLED;
            if (optionsCapabilityStatus != capabilityStatus) {
                optionsCapabilityStatus = null;
            }
            if (optionsCapabilityStatus == null) {
                optionsCapabilityStatus = CapabilityStatus.DISABLED;
            }
            CapabilityStatus capabilityStatus2 = optionsCapabilityStatus;
            CapabilityStatus marginCapabilityStatus = acatsInDataState.getMarginCapabilityStatus();
            CapabilityStatus capabilityStatus3 = marginCapabilityStatus == capabilityStatus ? marginCapabilityStatus : null;
            if (capabilityStatus3 == null) {
                capabilityStatus3 = CapabilityStatus.DISABLED;
            }
            return AcatsInDataState.copy$default(acatsInDataState, null, false, false, null, null, null, null, null, null, null, namesOnAccount, null, null, null, null, null, null, null, null, capabilityStatus2, capabilityStatus3, null, null, null, false, null, false, false, false, false, false, null, false, false, false, false, -1573889, 15, null);
        }
    }

    public final void onAccountNameConfirmed(NamesOnAccount accountNames) {
        Intrinsics.checkNotNullParameter(accountNames, "accountNames");
        applyMutation(new C77001(accountNames, null));
        getSavedStateHandle().set("account_names", accountNames);
        getSavedStateHandle().remove("options_declined");
    }

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/AcatsInDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onAccountContentsDeclared$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onAccountContentsDeclared$1 */
    static final class C76991 extends ContinuationImpl7 implements Function2<AcatsInDataState, Continuation<? super AcatsInDataState>, Object> {
        final /* synthetic */ String $buildPartialBannerContentfulId;
        final /* synthetic */ List<AccountContentItem> $selectedContent;
        final /* synthetic */ List<ApiAcatsAccountContentsResponse.SupportedContentType> $supportedContentTypes;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C76991(List<AccountContentItem> list, List<? extends ApiAcatsAccountContentsResponse.SupportedContentType> list2, String str, Continuation<? super C76991> continuation) {
            super(2, continuation);
            this.$selectedContent = list;
            this.$supportedContentTypes = list2;
            this.$buildPartialBannerContentfulId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C76991 c76991 = new C76991(this.$selectedContent, this.$supportedContentTypes, this.$buildPartialBannerContentfulId, continuation);
            c76991.L$0 = obj;
            return c76991;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
            return ((C76991) create(acatsInDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInDataState.copy$default((AcatsInDataState) this.L$0, null, false, false, null, null, null, null, null, null, null, null, null, null, this.$selectedContent, this.$supportedContentTypes, null, this.$buildPartialBannerContentfulId, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, false, -90113, 15, null);
        }
    }

    public final void onAccountContentsDeclared(List<AccountContentItem> selectedContent, List<? extends ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes, String buildPartialBannerContentfulId) {
        Intrinsics.checkNotNullParameter(selectedContent, "selectedContent");
        Intrinsics.checkNotNullParameter(supportedContentTypes, "supportedContentTypes");
        applyMutation(new C76991(selectedContent, supportedContentTypes, buildPartialBannerContentfulId, null));
        getSavedStateHandle().set("account_contents", Lists4.toArrayList(selectedContent));
        getSavedStateHandle().set("supported_content_types", Lists4.toArrayList(supportedContentTypes));
        getSavedStateHandle().set("build_partial_banner_contentful_id", buildPartialBannerContentfulId);
    }

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/AcatsInDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onFullTransferSelected$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onFullTransferSelected$1 */
    static final class C77101 extends ContinuationImpl7 implements Function2<AcatsInDataState, Continuation<? super AcatsInDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C77101(Continuation<? super C77101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C77101 c77101 = AcatsInDuxo.this.new C77101(continuation);
            c77101.L$0 = obj;
            return c77101;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
            return ((C77101) create(acatsInDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsInDataState acatsInDataStateCopy$default = AcatsInDataState.copy$default((AcatsInDataState) this.L$0, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, false, -131073, 15, null);
            AcatsFlowStep nextFlowStep = acatsInDataStateCopy$default.getNextFlowStep(AcatsFlowStep.CONFIRM_ELIGIBLE);
            if (nextFlowStep != null) {
                AcatsInDuxo.this.submit(new AcatsInEvent.FlowNavigationEvent(nextFlowStep, acatsInDataStateCopy$default, nextFlowStep.getShouldPromptForLockScreen()));
            }
            return acatsInDataStateCopy$default;
        }
    }

    public final void onFullTransferSelected() {
        applyMutation(new C77101(null));
    }

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onOptionsEnableResult$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onOptionsEnableResult$1 */
    static final class C77131 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isOptionsEnabled;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C77131(boolean z, Continuation<? super C77131> continuation) {
            super(2, continuation);
            this.$isOptionsEnabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInDuxo.this.new C77131(this.$isOptionsEnabled, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C77131) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AcatsInDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/AcatsInDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onOptionsEnableResult$1$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onOptionsEnableResult$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AcatsInDataState, Continuation<? super AcatsInDataState>, Object> {
            final /* synthetic */ boolean $isOptionsEnabled;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AcatsInDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(boolean z, AcatsInDuxo acatsInDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$isOptionsEnabled = z;
                this.this$0 = acatsInDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$isOptionsEnabled, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
                return ((AnonymousClass1) create(acatsInDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                CapabilityStatus capabilityStatus;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AcatsInDataState acatsInDataState = (AcatsInDataState) this.L$0;
                if (this.$isOptionsEnabled) {
                    capabilityStatus = CapabilityStatus.ENABLED;
                } else {
                    capabilityStatus = CapabilityStatus.DECLINED;
                }
                AcatsInDataState acatsInDataStateCopy$default = AcatsInDataState.copy$default(acatsInDataState, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, capabilityStatus, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, false, -524289, 15, null);
                this.this$0.getSavedStateHandle().set("options_declined", boxing.boxBoolean(!this.$isOptionsEnabled));
                AcatsFlowStep nextFlowStep = acatsInDataStateCopy$default.getNextFlowStep(AcatsFlowStep.ENABLE_OPTIONS);
                if (nextFlowStep != null) {
                    this.this$0.submit(new AcatsInEvent.FlowNavigationEvent(nextFlowStep, acatsInDataStateCopy$default, nextFlowStep.getShouldPromptForLockScreen()));
                }
                return acatsInDataStateCopy$default;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsInDuxo acatsInDuxo = AcatsInDuxo.this;
            acatsInDuxo.applyMutation(new AnonymousClass1(this.$isOptionsEnabled, acatsInDuxo, null));
            return Unit.INSTANCE;
        }
    }

    public final void onOptionsEnableResult(boolean isOptionsEnabled) {
        getLifecycleScope().launchWhenResumed(new C77131(isOptionsEnabled, null));
    }

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onMarginEnableResult$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onMarginEnableResult$1 */
    static final class C77121 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isMarginEnabled;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C77121(boolean z, Continuation<? super C77121> continuation) {
            super(2, continuation);
            this.$isMarginEnabled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInDuxo.this.new C77121(this.$isMarginEnabled, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C77121) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AcatsInDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/AcatsInDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onMarginEnableResult$1$1", m3645f = "AcatsInDuxo.kt", m3646l = {865}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onMarginEnableResult$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AcatsInDataState, Continuation<? super AcatsInDataState>, Object> {
            final /* synthetic */ boolean $isMarginEnabled;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AcatsInDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AcatsInDuxo acatsInDuxo, boolean z, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = acatsInDuxo;
                this.$isMarginEnabled = z;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$isMarginEnabled, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
                return ((AnonymousClass1) create(acatsInDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                AcatsInDataState acatsInDataStateUpdateMarginCapabilityStatus;
                AcatsInDataState acatsInDataState;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    acatsInDataStateUpdateMarginCapabilityStatus = this.this$0.updateMarginCapabilityStatus((AcatsInDataState) this.L$0, this.$isMarginEnabled);
                    if (this.$isMarginEnabled && acatsInDataStateUpdateMarginCapabilityStatus.getHasPlaidAssets()) {
                        AcatsInDuxo acatsInDuxo = this.this$0;
                        this.L$0 = acatsInDataStateUpdateMarginCapabilityStatus;
                        this.label = 1;
                        Object objRefreshPlaidAssetsAfterMarginEnable = acatsInDuxo.refreshPlaidAssetsAfterMarginEnable(acatsInDataStateUpdateMarginCapabilityStatus, this);
                        if (objRefreshPlaidAssetsAfterMarginEnable == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        acatsInDataState = acatsInDataStateUpdateMarginCapabilityStatus;
                        obj = objRefreshPlaidAssetsAfterMarginEnable;
                    }
                    this.this$0.navigateToNextStep(acatsInDataStateUpdateMarginCapabilityStatus, AcatsFlowStep.ENABLE_MARGIN);
                    return acatsInDataStateUpdateMarginCapabilityStatus;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                acatsInDataState = (AcatsInDataState) this.L$0;
                ResultKt.throwOnFailure(obj);
                acatsInDataStateUpdateMarginCapabilityStatus = (AcatsInDataState) obj;
                if (acatsInDataStateUpdateMarginCapabilityStatus == null) {
                    acatsInDataStateUpdateMarginCapabilityStatus = acatsInDataState;
                }
                this.this$0.navigateToNextStep(acatsInDataStateUpdateMarginCapabilityStatus, AcatsFlowStep.ENABLE_MARGIN);
                return acatsInDataStateUpdateMarginCapabilityStatus;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsInDuxo acatsInDuxo = AcatsInDuxo.this;
            acatsInDuxo.applyMutation(new AnonymousClass1(acatsInDuxo, this.$isMarginEnabled, null));
            return Unit.INSTANCE;
        }
    }

    public final void onMarginEnableResult(boolean isMarginEnabled) {
        getLifecycleScope().launchWhenResumed(new C77121(isMarginEnabled, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsInDataState updateMarginCapabilityStatus(AcatsInDataState acatsInDataState, boolean z) {
        CapabilityStatus capabilityStatus;
        if (z) {
            capabilityStatus = CapabilityStatus.ENABLED;
        } else {
            capabilityStatus = CapabilityStatus.DECLINED;
        }
        return AcatsInDataState.copy$default(acatsInDataState, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, capabilityStatus, null, null, null, false, null, false, false, false, false, false, null, false, false, false, false, -1048577, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object refreshPlaidAssetsAfterMarginEnable(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
        C77201 c77201;
        String str;
        AcatsInDataState acatsInDataState2;
        if (continuation instanceof C77201) {
            c77201 = (C77201) continuation;
            int i = c77201.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c77201.label = i - Integer.MIN_VALUE;
            } else {
                c77201 = new C77201(continuation);
            }
        }
        Object objAwait = c77201.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c77201.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwait);
            AvailableAccount rhsAccount = acatsInDataState.getRhsAccount();
            String rhsAccountNumber = rhsAccount != null ? rhsAccount.getRhsAccountNumber() : null;
            String contraAccountNumber = acatsInDataState.getContraAccountNumber();
            String plaidAccessTokenId = acatsInDataState.getPlaidAccessTokenId();
            if (rhsAccountNumber != null && contraAccountNumber != null && plaidAccessTokenId != null) {
                try {
                    Deferred<PlaidBrokerAssets> plaidBrokerAssets = this.acatsInActivityStore.getPlaidBrokerAssets(rhsAccountNumber, contraAccountNumber, plaidAccessTokenId, true);
                    acatsInDataState2 = acatsInDataState;
                    c77201.L$0 = acatsInDataState2;
                    c77201.L$1 = rhsAccountNumber;
                    c77201.label = 1;
                    objAwait = plaidBrokerAssets.await(c77201);
                    if (objAwait == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = rhsAccountNumber;
                } catch (Exception e) {
                    e = e;
                    str = rhsAccountNumber;
                    CrashReporter.INSTANCE.reportNonFatal(e, true, new EventMetadata(SentryTeam.ACATS, MapsKt.mapOf(Tuples4.m3642to("context", "margin_enable_plaid_refresh"), Tuples4.m3642to("rhsAccountNumber", str)), null, 4, null));
                    return null;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str = (String) c77201.L$1;
        AcatsInDataState acatsInDataState3 = (AcatsInDataState) c77201.L$0;
        try {
            ResultKt.throwOnFailure(objAwait);
            acatsInDataState2 = acatsInDataState3;
        } catch (Exception e2) {
            e = e2;
            CrashReporter.INSTANCE.reportNonFatal(e, true, new EventMetadata(SentryTeam.ACATS, MapsKt.mapOf(Tuples4.m3642to("context", "margin_enable_plaid_refresh"), Tuples4.m3642to("rhsAccountNumber", str)), null, 4, null));
            return null;
        }
        return AcatsInDataState.copy$default(acatsInDataState2, null, false, false, null, null, null, null, null, null, (PlaidBrokerAssets) objAwait, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, false, -513, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void navigateToNextStep(AcatsInDataState dataState, AcatsFlowStep currentStep) {
        AcatsFlowStep nextFlowStep = dataState.getNextFlowStep(currentStep);
        if (nextFlowStep != null) {
            submit(new AcatsInEvent.FlowNavigationEvent(nextFlowStep, dataState, nextFlowStep.getShouldPromptForLockScreen()));
        }
    }

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/AcatsInDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onBuildPartialTransferComplete$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onBuildPartialTransferComplete$1 */
    static final class C77031 extends ContinuationImpl7 implements Function2<AcatsInDataState, Continuation<? super AcatsInDataState>, Object> {
        final /* synthetic */ List<UiAcatsAsset> $assets;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AcatsInDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C77031(List<? extends UiAcatsAsset> list, AcatsInDuxo acatsInDuxo, Continuation<? super C77031> continuation) {
            super(2, continuation);
            this.$assets = list;
            this.this$0 = acatsInDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C77031 c77031 = new C77031(this.$assets, this.this$0, continuation);
            c77031.L$0 = obj;
            return c77031;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
            return ((C77031) create(acatsInDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            AcatsInEvent flowNavigationEvent;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsInDataState acatsInDataStateCopy$default = AcatsInDataState.copy$default((AcatsInDataState) this.L$0, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.$assets, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, false, -131073, 15, null);
            AcatsFlowStep nextFlowStep = acatsInDataStateCopy$default.getNextFlowStep(AcatsFlowStep.PARTIAL_TRANSFER_FLOW);
            AcatsInDuxo acatsInDuxo = this.this$0;
            if (nextFlowStep != null) {
                flowNavigationEvent = new AcatsInEvent.FlowNavigationEvent(nextFlowStep, acatsInDataStateCopy$default, nextFlowStep.getShouldPromptForLockScreen());
            } else {
                flowNavigationEvent = AcatsInEvent.FlowCompleteEvent.INSTANCE;
            }
            acatsInDuxo.submit(flowNavigationEvent);
            return acatsInDataStateCopy$default;
        }
    }

    public final void onBuildPartialTransferComplete(List<? extends UiAcatsAsset> assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        applyMutation(new C77031(assets, this, null));
        getSavedStateHandle().set("assets", Lists4.toArrayList(assets));
    }

    public final void showBorrowingFeeBottomSheet() {
        withDataState(new Function1() { // from class: com.robinhood.android.acatsin.AcatsInDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInDuxo.showBorrowingFeeBottomSheet$lambda$15(this.f$0, (AcatsInDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showBorrowingFeeBottomSheet$lambda$15(AcatsInDuxo acatsInDuxo, AcatsInDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        acatsInDuxo.submit(new AcatsInEvent.ShowBorrowingFeeBottomSheet(dataState.getShortPositionFeeData()));
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/AcatsInDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onAcatsSubmitted$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onAcatsSubmitted$1 */
    static final class C76981 extends ContinuationImpl7 implements Function2<AcatsInDataState, Continuation<? super AcatsInDataState>, Object> {
        final /* synthetic */ UUID $acatsTransferId;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AcatsInDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C76981(UUID uuid, AcatsInDuxo acatsInDuxo, Continuation<? super C76981> continuation) {
            super(2, continuation);
            this.$acatsTransferId = uuid;
            this.this$0 = acatsInDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C76981 c76981 = new C76981(this.$acatsTransferId, this.this$0, continuation);
            c76981.L$0 = obj;
            return c76981;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
            return ((C76981) create(acatsInDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsInDataState acatsInDataState = (AcatsInDataState) this.L$0;
            AcatsInDataState acatsInDataStateCopy$default = AcatsInDataState.copy$default(acatsInDataState, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.$acatsTransferId, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, false, -262145, 15, null);
            AcatsFlowStep nextFlowStep = acatsInDataState.getNextFlowStep(AcatsFlowStep.REVIEW_AND_SUBMIT);
            if (nextFlowStep != null) {
                this.this$0.submit(new AcatsInEvent.FlowNavigationEvent(nextFlowStep, acatsInDataStateCopy$default, nextFlowStep.getShouldPromptForLockScreen()));
            }
            return acatsInDataStateCopy$default;
        }
    }

    public final void onAcatsSubmitted(UUID acatsTransferId) {
        Intrinsics.checkNotNullParameter(acatsTransferId, "acatsTransferId");
        applyMutation(new C76981(acatsTransferId, this, null));
        getSavedStateHandle().set(MatchSelectionActivity.TRANSFER_ID_EXTRA, acatsTransferId);
    }

    public final void showAlternate(final AcatsFlowStep alternateStep) {
        Intrinsics.checkNotNullParameter(alternateStep, "alternateStep");
        withDataState(new Function1() { // from class: com.robinhood.android.acatsin.AcatsInDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInDuxo.showAlternate$lambda$16(this.f$0, alternateStep, (AcatsInDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAlternate$lambda$16(AcatsInDuxo acatsInDuxo, AcatsFlowStep acatsFlowStep, AcatsInDataState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        acatsInDuxo.submit(new AcatsInEvent.FlowNavigationEvent(acatsFlowStep, it, acatsFlowStep.getShouldPromptForLockScreen()));
        return Unit.INSTANCE;
    }

    public final void completeStepForPromo(final AcatsFlowStep completedStep) {
        Intrinsics.checkNotNullParameter(completedStep, "completedStep");
        withDataState(new Function1() { // from class: com.robinhood.android.acatsin.AcatsInDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AcatsInDuxo.completeStepForPromo$lambda$17(this.f$0, completedStep, (AcatsInDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit completeStepForPromo$lambda$17(AcatsInDuxo acatsInDuxo, AcatsFlowStep acatsFlowStep, AcatsInDataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (!dataState.isGoldUser() && acatsInDuxo.shouldShowPromoScreen(dataState)) {
            acatsInDuxo.submitPromoScreenNavigationEvent(dataState, false);
        } else {
            acatsInDuxo.completeStep(acatsFlowStep);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/AcatsInDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$completeStep$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$completeStep$1 */
    static final class C76951 extends ContinuationImpl7 implements Function2<AcatsInDataState, Continuation<? super AcatsInDataState>, Object> {
        final /* synthetic */ AcatsFlowStep $completedStep;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AcatsInDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C76951(AcatsFlowStep acatsFlowStep, AcatsInDuxo acatsInDuxo, Continuation<? super C76951> continuation) {
            super(2, continuation);
            this.$completedStep = acatsFlowStep;
            this.this$0 = acatsInDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C76951 c76951 = new C76951(this.$completedStep, this.this$0, continuation);
            c76951.L$0 = obj;
            return c76951;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
            return ((C76951) create(acatsInDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            AcatsInEvent flowNavigationEvent;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsInDataState acatsInDataState = (AcatsInDataState) this.L$0;
            AcatsFlowStep nextFlowStep = acatsInDataState.getNextFlowStep(this.$completedStep);
            AcatsInDuxo acatsInDuxo = this.this$0;
            if (nextFlowStep != null) {
                flowNavigationEvent = new AcatsInEvent.FlowNavigationEvent(nextFlowStep, acatsInDataState, nextFlowStep.getShouldPromptForLockScreen());
            } else {
                flowNavigationEvent = AcatsInEvent.FlowCompleteEvent.INSTANCE;
            }
            acatsInDuxo.submit(flowNavigationEvent);
            return acatsInDataState;
        }
    }

    public final void completeStep(AcatsFlowStep completedStep) {
        Intrinsics.checkNotNullParameter(completedStep, "completedStep");
        applyMutation(new C76951(completedStep, this, null));
    }

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$confirmAccountNamesWithPlaid$1", m3645f = "AcatsInDuxo.kt", m3646l = {1039}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$confirmAccountNamesWithPlaid$1 */
    static final class C76961 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ AvailableAccount $availableAccount;
        final /* synthetic */ AvailableAccount $rhsAccount;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C76961(AvailableAccount availableAccount, AvailableAccount availableAccount2, Continuation<? super C76961> continuation) {
            super(2, continuation);
            this.$availableAccount = availableAccount;
            this.$rhsAccount = availableAccount2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInDuxo.this.new C76961(this.$availableAccount, this.$rhsAccount, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C76961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FetchAccountNamesUseCase fetchAccountNamesUseCase = AcatsInDuxo.this.fetchAccountNamesUseCase;
                String rhsAccountNumber = this.$availableAccount.getRhsAccountNumber();
                BrokerageAccountType brokerageAccountType = this.$rhsAccount.getBrokerageAccountType();
                this.label = 1;
                obj = fetchAccountNamesUseCase.invoke(rhsAccountNumber, brokerageAccountType, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AcatsInDuxo.this.onAccountNameConfirmed((NamesOnAccount) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void confirmAccountNamesWithPlaid(AvailableAccount availableAccount) {
        if (availableAccount != null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C76961(availableAccount, availableAccount, null), 3, null);
            return;
        }
        throw new IllegalStateException("can't advance acats flow without an RHS account");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void exposeAcatsInSbExperiment(String variant) {
        if (variant == null) {
            return;
        }
        this.experimentExposureLogger.logExposure(AcatsInExperiments.INSTANCE.getServerName(), variant);
    }

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/AcatsInDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$setUnsupportedAccountContents$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$setUnsupportedAccountContents$1 */
    static final class C77231 extends ContinuationImpl7 implements Function2<AcatsInDataState, Continuation<? super AcatsInDataState>, Object> {
        final /* synthetic */ List<String> $unsupportedItems;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C77231(List<String> list, Continuation<? super C77231> continuation) {
            super(2, continuation);
            this.$unsupportedItems = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C77231 c77231 = new C77231(this.$unsupportedItems, continuation);
            c77231.L$0 = obj;
            return c77231;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
            return ((C77231) create(acatsInDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInDataState.copy$default((AcatsInDataState) this.L$0, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, this.$unsupportedItems, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, false, false, false, false, -32769, 15, null);
        }
    }

    public final void setUnsupportedAccountContents(List<String> unsupportedItems) {
        Intrinsics.checkNotNullParameter(unsupportedItems, "unsupportedItems");
        applyMutation(new C77231(unsupportedItems, null));
    }

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/AcatsInDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$setSlipAgreements$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$setSlipAgreements$1 */
    static final class C77221 extends ContinuationImpl7 implements Function2<AcatsInDataState, Continuation<? super AcatsInDataState>, Object> {
        final /* synthetic */ List<UiSlipAgreements.Agreement> $slipAgreements;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C77221(List<UiSlipAgreements.Agreement> list, Continuation<? super C77221> continuation) {
            super(2, continuation);
            this.$slipAgreements = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C77221 c77221 = new C77221(this.$slipAgreements, continuation);
            c77221.L$0 = obj;
            return c77221;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
            return ((C77221) create(acatsInDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInDataState.copy$default((AcatsInDataState) this.L$0, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.$slipAgreements, false, null, false, false, false, false, false, null, false, false, false, false, -8388609, 15, null);
        }
    }

    public final void setSlipAgreements(List<UiSlipAgreements.Agreement> slipAgreements) {
        applyMutation(new C77221(slipAgreements, null));
    }

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/AcatsInDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$matchRateSelected$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$matchRateSelected$1 */
    static final class C76971 extends ContinuationImpl7 implements Function2<AcatsInDataState, Continuation<? super AcatsInDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C76971(Continuation<? super C76971> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C76971 c76971 = new C76971(continuation);
            c76971.L$0 = obj;
            return c76971;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
            return ((C76971) create(acatsInDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInDataState.copy$default((AcatsInDataState) this.L$0, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, true, false, false, false, false, null, false, false, false, false, -67108865, 15, null);
        }
    }

    public final void matchRateSelected() {
        applyMutation(new C76971(null));
        getSavedStateHandle().set("match_rate_selected", Boolean.TRUE);
    }

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/AcatsInDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.AcatsInDuxo$onInfoEntryMethodSelected$1", m3645f = "AcatsInDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.AcatsInDuxo$onInfoEntryMethodSelected$1 */
    static final class C77111 extends ContinuationImpl7 implements Function2<AcatsInDataState, Continuation<? super AcatsInDataState>, Object> {
        final /* synthetic */ boolean $isPlaid;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C77111(boolean z, Continuation<? super C77111> continuation) {
            super(2, continuation);
            this.$isPlaid = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C77111 c77111 = new C77111(this.$isPlaid, continuation);
            c77111.L$0 = obj;
            return c77111;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInDataState acatsInDataState, Continuation<? super AcatsInDataState> continuation) {
            return ((C77111) create(acatsInDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInDataState.copy$default((AcatsInDataState) this.L$0, null, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, false, false, false, false, null, this.$isPlaid, false, false, false, -1, 14, null);
        }
    }

    public final void onInfoEntryMethodSelected(boolean isPlaid) {
        applyMutation(new C77111(isPlaid, null));
        completeStep(AcatsFlowStep.PLAID_INTRO);
    }

    private final void logBrokerageSelected(ApiBrokerage brokerage) {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, new Screen(Screen.Name.ACATS_IN_SELECT_BROKERAGE, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, brokerage.getName(), null, 4, null), null, null, false, 57, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logManualDtcNumberEntered(AcatsInDataState dataState) {
        EventLogger.DefaultImpls.logTap$default(this.eventLogger, null, new Screen(Screen.Name.ACATS_IN_DTC_ENTRY, null, null, null, 14, null), new Component(Component.ComponentType.BUTTON, "acats_brokerage_manual_entry_continue", null, 4, null), null, dataState.getScreenContext().toEventContext(), false, 41, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldShowPromoScreen(AcatsInDataState dataState) {
        if (dataState.getAcatsBonusPromoInfo() == null || !dataState.getAcatsBonusPromoInfo().is_active() || !dataState.getAcatsBonusPromoInfo().getShow_promo_screen() || ((AcatsIn) INSTANCE.getExtras(getSavedStateHandle())).getSkipPromoScreen()) {
            return false;
        }
        AvailableAccount selectedRhsAccount = dataState.getSelectedRhsAccount();
        return (selectedRhsAccount != null ? selectedRhsAccount.getRhsAccountNumber() : null) != null || dataState.isGoldUser();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitPromoScreenNavigationEvent(AcatsInDataState dataState, boolean shouldFinishActivity) {
        String rhsAccountNumber;
        String source = dataState.getSource();
        if (StringsKt.isBlank(source)) {
            source = null;
        }
        String str = "robinhood://acats_transfer_promo?";
        if (source != null) {
            str = ((Object) "robinhood://acats_transfer_promo?") + "source=" + source + "&";
        }
        AvailableAccount selectedRhsAccount = dataState.getSelectedRhsAccount();
        if (selectedRhsAccount != null && (rhsAccountNumber = selectedRhsAccount.getRhsAccountNumber()) != null) {
            str = ((Object) str) + "account_number=" + rhsAccountNumber;
        }
        submit(new AcatsInEvent.OpenPromoFlow(str, shouldFinishActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object onCreateInitialStepFullPromoFlow(AcatsInDataState acatsInDataState, Continuation<? super AcatsFlowStep> continuation) {
        C77081 c77081;
        if (continuation instanceof C77081) {
            c77081 = (C77081) continuation;
            int i = c77081.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c77081.label = i - Integer.MIN_VALUE;
            } else {
                c77081 = new C77081(continuation);
            }
        }
        Object objAwaitFirst = c77081.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c77081.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objAwaitFirst);
            Observable observableStreamVariant$default = ExperimentsProvider.DefaultImpls.streamVariant$default(this.experimentsStore, AcatsInExperiments2.INSTANCE, AcatsInExperiments3.CONTROL, false, 4, null);
            c77081.L$0 = acatsInDataState;
            c77081.label = 1;
            objAwaitFirst = RxAwait3.awaitFirst(observableStreamVariant$default, c77081);
            if (objAwaitFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            acatsInDataState = (AcatsInDataState) c77081.L$0;
            ResultKt.throwOnFailure(objAwaitFirst);
        }
        AcatsInExperiments3 acatsInExperiments3 = (AcatsInExperiments3) objAwaitFirst;
        int i3 = acatsInExperiments3 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[acatsInExperiments3.ordinal()];
        if (i3 == 1) {
            return AcatsFlowStep.INTRO_CONSOLIDATED;
        }
        if (i3 != 2) {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return AcatsFlowStep.INTRO_SWIPIES;
        }
        if (acatsInDataState.getDefaultRhsAccount() == null) {
            return AcatsFlowStep.AVAILABLE_DESTINATIONS;
        }
        return AcatsFlowStep.BROKERAGE_SEARCH;
    }

    /* compiled from: AcatsInDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/AcatsInDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/acatsin/AcatsInDuxo;", "Lcom/robinhood/android/acats/contracts/AcatsIn;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<AcatsInDuxo, AcatsIn> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public AcatsIn getExtras(SavedStateHandle savedStateHandle) {
            return (AcatsIn) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public AcatsIn getExtras(AcatsInDuxo acatsInDuxo) {
            return (AcatsIn) DuxoCompanion2.DefaultImpls.getExtras(this, acatsInDuxo);
        }
    }
}
