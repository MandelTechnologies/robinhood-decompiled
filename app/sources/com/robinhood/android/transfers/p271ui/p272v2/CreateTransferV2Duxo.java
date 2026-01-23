package com.robinhood.android.transfers.p271ui.p272v2;

import android.content.Context;
import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import bff_money_movement.service.p019v1.TransferActionDto;
import bff_money_movement.service.p019v1.TransferActionTypeDto;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advisory.contracts.AdvisoryFullWithdrawalKey;
import com.robinhood.android.api.retirement.transfers.RetirementTransfersApi;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.banking.experiments.RecurringDepositIncludeCurrent;
import com.robinhood.android.banking.experiments.TransfersRedesignExperiment;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.data.store.portfolio.TraderPortfolioStore;
import com.robinhood.android.engagement.depositincentive.DepositIncentiveStore;
import com.robinhood.android.engagement.depositincentive.model.DepositIncentiveCancellationDialogData;
import com.robinhood.android.engagement.depositincentive.model.DepositIncentivePillData;
import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.lib.transfers.AchTransferOption;
import com.robinhood.android.lib.transfers.AdvisoryIraRothConversionExperiment;
import com.robinhood.android.lib.transfers.LimitWireAlertOnAndroid;
import com.robinhood.android.lib.transfers.TransferFactoryForV2;
import com.robinhood.android.margin.experiments.PdtRevampV1;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.models.retirement.api.transfers.ApiIraDistributionFee;
import com.robinhood.android.models.retirement.api.transfers.ApiRothConversionTransferInfo;
import com.robinhood.android.models.transfer.shared.ThirdPartyOutgoingWiresInfo;
import com.robinhood.android.moneymovement.checkoutflow.MicrogramConstants;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.DebitCardLinkingConfiguration;
import com.robinhood.android.navigation.keys.DialogFragmentKey;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.onboarding.contracts.GoldNativeFundingUpsellIntentKey;
import com.robinhood.android.retirement.contracts.RetirementEnokiInfo;
import com.robinhood.android.tickerinputview.keyevent.DollarInputConsumer;
import com.robinhood.android.tickerinputview.keyevent.InputKeyEventConsumer;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireLaunchMode;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.IraDistributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.TransferFrequencyBottomSheetFragmentKey;
import com.robinhood.android.transfers.contracts.TransferV2;
import com.robinhood.android.transfers.contracts.WireRoutingDetailsInputActivityResultContract3;
import com.robinhood.android.transfers.lib.lastused.PaymentMethodLastUsagesPref;
import com.robinhood.android.transfers.lib.validation.TransferValidator;
import com.robinhood.android.transfers.lib.validation.ValidationFailure;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.transfers.p271ui.max.CreateTransferViewState;
import com.robinhood.android.transfers.p271ui.max.iradistribution.IraDistributionQuestionnaireLaunchMode;
import com.robinhood.android.transfers.p271ui.max.irataxwithholding.IraDistributionTaxWithholdingBottomSheetFragment;
import com.robinhood.android.transfers.p271ui.max.suggestionpills.QuickSelectorChip;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2DataRowState;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2Duxo;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferV2Event;
import com.robinhood.android.transfers.p271ui.p272v2.accounts.MicrogramConverters2;
import com.robinhood.android.transfers.p271ui.p272v2.accounts.TransferLimitsServiceImpl;
import com.robinhood.android.transfers.p271ui.p272v2.additionaldata.CreateTransferV2AdditionalDataClient;
import com.robinhood.android.transfers.p271ui.p272v2.extensions.ToTransferData;
import com.robinhood.android.transfers.p271ui.p272v2.logging.TransferAccountBottomSheetLogger;
import com.robinhood.android.transfers.p271ui.p272v2.logging.TransferFrequencyBottomSheetFragment;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.experiments.SimpleVariant;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.lib.transfers.contracts.TransferLimitsService;
import com.robinhood.lib.transfers.contracts.models.TransferAccountType;
import com.robinhood.librobinhood.data.store.BalancesStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.SuggestedAmountsStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferV2LimitsStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RothConversionStore;
import com.robinhood.models.api.ColorTheme;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.api.bonfire.IraDistributionType;
import com.robinhood.models.api.bonfire.transfer.ApiSuggestedAmountsResponse;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryRequest;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubResponse;
import com.robinhood.models.api.bonfire.transfer.limitsv1.TransferProductType;
import com.robinhood.models.api.bonfire.transfer.rewarddetail.ApiTransferRewardDetailResponse;
import com.robinhood.models.api.bonfire.transfer.wires.ApiOutgoingWireDetails;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.util.Money;
import com.robinhood.prefs.StringToLongMapPreference;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.common.microgramdeeplinklaunch.RealMicrogramDeeplinkService;
import com.robinhood.shared.common.microgramuilaunch.RealMicrogramUiLaunchService2;
import com.robinhood.shared.data.store.iac.IacUpsellStore;
import com.robinhood.transfers.accounts.contracts.AccountSelectionBottomSheetService;
import com.robinhood.transfers.accounts.contracts.AccountSelectionResolver;
import com.robinhood.transfers.accounts.contracts.model.IraTransferType;
import com.robinhood.transfers.accounts.contracts.model.TransferAccountDirection;
import com.robinhood.transfers.disclosures.contracts.TransferDisclosureManagedService;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.moshi.LazyMoshi;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import microgram.android.MicrogramLaunchId;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import microgram.android.service.ManagedServiceExtension2;
import p479j$.time.Year;

/* compiled from: CreateTransferV2Duxo.kt */
@Metadata(m3635d1 = {"\u0000ö\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ©\u00012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u0006:\u0002©\u0001BÍ\u0001\b\u0007\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u0012\u0006\u0010\u001f\u001a\u00020 \u0012\u0006\u0010!\u001a\u00020\"\u0012\u0006\u0010#\u001a\u00020$\u0012\u0006\u0010%\u001a\u00020&\u0012\u0006\u0010'\u001a\u00020(\u0012\u0006\u0010)\u001a\u00020*\u0012\u0006\u0010+\u001a\u00020,\u0012\u0006\u0010-\u001a\u00020.\u0012\u0006\u0010/\u001a\u000200\u0012\u0006\u00101\u001a\u000202\u0012\u0006\u00103\u001a\u000204\u0012\b\b\u0001\u00105\u001a\u000206¢\u0006\u0004\b7\u00108J\b\u0010M\u001a\u00020NH\u0016J\b\u0010O\u001a\u00020NH\u0002J\b\u0010P\u001a\u00020NH\u0016J!\u0010Q\u001a\u00020N2\u0017\u0010R\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020S¢\u0006\u0002\bTH\u0002J\u000e\u0010U\u001a\u00020N2\u0006\u0010V\u001a\u00020WJ\u000e\u0010X\u001a\u00020N2\u0006\u0010Y\u001a\u00020ZJ\u0006\u0010[\u001a\u00020NJ\u000e\u0010\\\u001a\u00020N2\u0006\u0010]\u001a\u00020^J\u0006\u0010_\u001a\u00020NJ\u0006\u0010`\u001a\u00020NJ\u0010\u0010a\u001a\u00020N2\b\u0010b\u001a\u0004\u0018\u00010cJ\u0006\u0010d\u001a\u00020NJ\u0006\u0010e\u001a\u00020NJ\u001a\u0010f\u001a\u00020N2\u0006\u0010g\u001a\u00020h2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010jJ\u001a\u0010k\u001a\u00020N2\u0006\u0010g\u001a\u00020h2\n\b\u0002\u0010l\u001a\u0004\u0018\u00010mJ\u000e\u0010n\u001a\u00020N2\u0006\u0010o\u001a\u00020pJ\u0016\u0010q\u001a\u00020N2\u0006\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020sJ\u000e\u0010u\u001a\u00020N2\u0006\u0010v\u001a\u00020wJ+\u0010x\u001a\u00020N2\b\b\u0002\u0010y\u001a\u00020z2\b\b\u0002\u0010{\u001a\u00020z2\n\b\u0002\u0010|\u001a\u0004\u0018\u00010z¢\u0006\u0002\u0010}J\u0006\u0010~\u001a\u00020NJ\u0006\u0010\u007f\u001a\u00020NJ\u0007\u0010\u0080\u0001\u001a\u00020NJ\u0007\u0010\u0081\u0001\u001a\u00020NJ\u0007\u0010\u0082\u0001\u001a\u00020NJ\u0007\u0010\u0083\u0001\u001a\u00020NJ\u0011\u0010\u0084\u0001\u001a\u00020N2\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001J\u001a\u0010\u0087\u0001\u001a\u00020N2\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001H\u0096@¢\u0006\u0003\u0010\u008a\u0001J,\u0010\u008b\u0001\u001a\u00020N2\u0006\u0010g\u001a\u00020h2\b\u0010\u008c\u0001\u001a\u00030\u008d\u00012\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001H\u0096@¢\u0006\u0003\u0010\u008e\u0001J\"\u0010\u008f\u0001\u001a\u00020N2\u0006\u0010g\u001a\u00020h2\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001H\u0096@¢\u0006\u0003\u0010\u0090\u0001J,\u0010\u0091\u0001\u001a\u00020N2\b\u0010\u0092\u0001\u001a\u00030\u0093\u00012\u0007\u0010\u0094\u0001\u001a\u00020h2\u0007\u0010\u0095\u0001\u001a\u00020hH\u0096@¢\u0006\u0003\u0010\u0096\u0001J\u0010\u0010\u0097\u0001\u001a\u00020NH\u0096@¢\u0006\u0003\u0010\u0098\u0001J\u0010\u0010\u0099\u0001\u001a\u00020NH\u0096@¢\u0006\u0003\u0010\u0098\u0001J\u0010\u0010\u009a\u0001\u001a\u00020NH\u0096@¢\u0006\u0003\u0010\u0098\u0001J\u0010\u0010\u009b\u0001\u001a\u00020NH\u0096@¢\u0006\u0003\u0010\u0098\u0001J\u0010\u0010\u009c\u0001\u001a\u00020N2\u0007\u0010\u009d\u0001\u001a\u00020zJ\u001a\u0010\u009e\u0001\u001a\u00020N2\b\u0010\u009f\u0001\u001a\u00030 \u00012\u0007\u0010\u009d\u0001\u001a\u00020zJ\u0010\u0010¡\u0001\u001a\u00020N2\u0007\u0010\u0085\u0001\u001a\u00020mJ\u0010\u0010¢\u0001\u001a\u00020N2\u0007\u0010\u0085\u0001\u001a\u00020jJ\u0007\u0010£\u0001\u001a\u00020NJ\t\u0010¤\u0001\u001a\u00020NH\u0002J\u001e\u0010¥\u0001\u001a\u0005\u0018\u00010¦\u00012\u0007\u0010§\u0001\u001a\u00020\u00022\u0007\u0010¨\u0001\u001a\u00020@H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u0018X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\u00020,X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010?\u001a\u00020@X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u000e\u0010C\u001a\u00020DX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020HX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010I\u001a\u0004\u0018\u00010JX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010K\u001a\u0004\u0018\u00010LX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006ª\u0001"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Duxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2ViewState;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event;", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionResolver;", "Lcom/robinhood/android/udf/HasSavedState;", "paymentMethodLastUsagesPref", "Lcom/robinhood/prefs/StringToLongMapPreference;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "iacUpsellStore", "Lcom/robinhood/shared/data/store/iac/IacUpsellStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "transferLimitsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferV2LimitsStore;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "suggestedAmountsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/SuggestedAmountsStore;", "retirementTransfersApi", "Lcom/robinhood/android/api/retirement/transfers/RetirementTransfersApi;", "additionalDataClient", "Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "transferFactory", "Lcom/robinhood/android/lib/transfers/TransferFactoryForV2;", "transferValidator", "Lcom/robinhood/android/transfers/lib/validation/TransferValidator;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "depositIncentiveStore", "Lcom/robinhood/android/engagement/depositincentive/DepositIncentiveStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "rothConversionStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RothConversionStore;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "context", "Landroid/content/Context;", "<init>", "(Lcom/robinhood/prefs/StringToLongMapPreference;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/BalancesStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/shared/data/store/iac/IacUpsellStore;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/librobinhood/data/store/bonfire/TransferV2LimitsStore;Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/librobinhood/data/store/bonfire/SuggestedAmountsStore;Lcom/robinhood/android/api/retirement/transfers/RetirementTransfersApi;Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient;Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;Lcom/robinhood/android/lib/transfers/TransferFactoryForV2;Lcom/robinhood/android/transfers/lib/validation/TransferValidator;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/engagement/depositincentive/DepositIncentiveStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RothConversionStore;Lcom/robinhood/android/navigation/Navigator;Landroid/content/Context;)V", "getTransfersBonfireApi$feature_transfers_externalRelease", "()Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "disclosureService", "Lcom/robinhood/transfers/disclosures/contracts/TransferDisclosureManagedService;", "transferConfiguration", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "getTransferConfiguration$feature_transfers_externalRelease", "()Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "inputKeyEventConsumer", "Lcom/robinhood/android/tickerinputview/keyevent/DollarInputConsumer;", "accountSelectionMicrogramComponent", "Lmicrogram/android/inject/MicrogramComponent;", "accountSelectionService", "Lcom/robinhood/transfers/accounts/contracts/AccountSelectionBottomSheetService;", "unifiedBalances", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", AnalyticsStrings.TAB_NAV_TAB_BAR_PORTFOLIO, "Lcom/robinhood/models/db/Portfolio;", "onCreate", "", "initializeDisclosureMicrogram", "onStart", "updateDataState", "callback", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "onKeyPress", "keyEvent", "Landroid/view/KeyEvent;", "onFrequencyChange", "frequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "onContinueButtonClick", "onQuickSelectorChipClick", "chip", "Lcom/robinhood/android/transfers/ui/max/suggestionpills/QuickSelectorChip;", "switchToEditMode", "onBackPressed", "onRowClick", "rowOnClickAction", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataRowState$OnClickAction;", "onDropdownChipClick", "onAmountFooterClick", "onFromAccountSelected", "transferAccountId", "", CreateTransferDuxo.SAVED_STATE_DISTRIBUTION_INFO, "Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$IraDistribution;", "onToAccountSelected", CreateTransferDuxo.SAVED_STATE_CONTRIBUTION_INFO, "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", "onIraDistributionTypeUpdate", "updatedDistributionType", "Lcom/robinhood/models/api/bonfire/IraDistributionType;", "overrideIraDistributionTaxWithholding", "iraFederalWithholdingPercentOverride", "Ljava/math/BigDecimal;", "iraStateWithholdingPercentOverride", "onAchTransferOptionSelected", "achTransferOption", "Lcom/robinhood/android/lib/transfers/AchTransferOption;", "createTransfer", "continuingTransferAfterValidation", "", "resubmissionAfter3DS", "clawbackGracePeriodOptIn", "(ZZLjava/lang/Boolean;)V", "invalidateCurrentTransfer", "onVerificationResultNotApproved", "overrideNoEnokiAlert", "overrideDistributionEnokiRemovalAlert", "overrideDistributionPreReviewAlert", "overrideGoldApyMinDepositAlert", "setTaxYear", "result", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$UpdateTaxYear;", "onBottomSheetAppear", "direction", "Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;", "(Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAccountRowAppear", "transferAccountType", "Lcom/robinhood/lib/transfers/contracts/models/TransferAccountType;", "(Ljava/lang/String;Lcom/robinhood/lib/transfers/contracts/models/TransferAccountType;Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "accountSelected", "(Ljava/lang/String;Lcom/robinhood/transfers/accounts/contracts/model/TransferAccountDirection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchIraQuestionnaire", "iraTransferType", "Lcom/robinhood/transfers/accounts/contracts/model/IraTransferType;", "iraId", "selectingAccountId", "(Lcom/robinhood/transfers/accounts/contracts/model/IraTransferType;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchIraMatchInfo", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchDebitCardLinking", "addNewAccount", "sendWireTransfer", "validationAlertDismissed", "leavingEditMode", "alertActionSelected", "action", "Lbff_money_movement/service/v1/TransferActionDto;", "onContributionQuestionnaireFinished", "onDistributionQuestionnaireFinished", "rothInformationErrorTextClicked", "callReviewStateInfoAndDraw", "validateForSubmission", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Event$ValidationError;", "state", "transferConfig", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CreateTransferV2Duxo extends BaseDuxo3<CreateTransferV2DataState, CreateTransferV2ViewState, CreateTransferV2Event> implements AccountSelectionResolver, HasSavedState {
    public static final String LatestStateKey = "LATEST_STATE";
    public static final String MENU_OF_OPTIONS_INITIAL_SCREEN_SOURCE = "menu_of_options_initial_screen";
    private final AccountProvider accountProvider;
    private final MicrogramComponent accountSelectionMicrogramComponent;
    private final AccountSelectionBottomSheetService accountSelectionService;
    private final CreateTransferV2AdditionalDataClient additionalDataClient;
    private final BalancesStore balancesStore;
    private final DepositIncentiveStore depositIncentiveStore;
    private TransferDisclosureManagedService disclosureService;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final IacUpsellStore iacUpsellStore;
    private final DollarInputConsumer inputKeyEventConsumer;
    private final TraderMarketHoursManager marketHoursManager;
    private final MicrogramManager microgramManager;
    private final LazyMoshi moshi;
    private final StringToLongMapPreference paymentMethodLastUsagesPref;
    private Portfolio portfolio;
    private final TraderPortfolioStore portfolioStore;
    private final RetirementTransfersApi retirementTransfersApi;
    private final RothConversionStore rothConversionStore;
    private final SavedStateHandle savedStateHandle;
    private final SuggestedAmountsStore suggestedAmountsStore;
    private final TransferAccountStore transferAccountStore;
    private final TransferConfiguration transferConfiguration;
    private final TransferFactoryForV2 transferFactory;
    private final TransferV2LimitsStore transferLimitsStore;
    private final TransferValidator transferValidator;
    private final TransfersBonfireApi transfersBonfireApi;
    private UnifiedBalances unifiedBalances;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final BigDecimal DefaultMaxAmount = new BigDecimal(InvestFlowConstants.MAX_ONE_TIME_AMOUNT);
    private static final BigDecimal WiresMaxAmount = new BigDecimal(1000000000);

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

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
            int[] iArr2 = new int[IraContributionType.values().length];
            try {
                iArr2[IraContributionType.ONE_TIME_CONTRIBUTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[IraContributionType.INDIRECT_ROLLOVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IraContributionType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[TransferAccountDirection.values().length];
            try {
                iArr3[TransferAccountDirection.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[TransferAccountDirection.SINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[IraTransferType.values().length];
            try {
                iArr4[IraTransferType.CONTRIBUTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[IraTransferType.DISTRIBUTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[TransferActionTypeDto.values().length];
            try {
                iArr5[TransferActionTypeDto.TRANSFER_ACTION_TYPE_DISMISS.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr5[TransferActionTypeDto.TRANSFER_ACTION_TYPE_EDIT_AMOUNT.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr5[TransferActionTypeDto.TRANSFER_ACTION_TYPE_CONTINUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[TransferActionTypeDto.TRANSFER_ACTION_TYPE_WITHDRAW_FULL_BALANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    /* renamed from: getTransfersBonfireApi$feature_transfers_externalRelease, reason: from getter */
    public final TransfersBonfireApi getTransfersBonfireApi() {
        return this.transfersBonfireApi;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTransferV2Duxo(@PaymentMethodLastUsagesPref StringToLongMapPreference paymentMethodLastUsagesPref, AccountProvider accountProvider, BalancesStore balancesStore, ExperimentsStore experimentsStore, IacUpsellStore iacUpsellStore, TraderMarketHoursManager marketHoursManager, TransferAccountStore transferAccountStore, TransferV2LimitsStore transferLimitsStore, TransfersBonfireApi transfersBonfireApi, SuggestedAmountsStore suggestedAmountsStore, RetirementTransfersApi retirementTransfersApi, CreateTransferV2AdditionalDataClient additionalDataClient, TraderPortfolioStore portfolioStore, TransferFactoryForV2 transferFactory, TransferValidator transferValidator, EventLogger eventLogger, DepositIncentiveStore depositIncentiveStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, MicrogramManager microgramManager, LazyMoshi moshi, RothConversionStore rothConversionStore, Navigator navigator, Context context) {
        BigDecimal bigDecimal;
        super(SavedStateHandles.getSavedDataStateOrCreateInitialState(savedStateHandle, paymentMethodLastUsagesPref.getValues()), new CreateTransferV2StateProvider(), duxoBundle);
        Intrinsics.checkNotNullParameter(paymentMethodLastUsagesPref, "paymentMethodLastUsagesPref");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(iacUpsellStore, "iacUpsellStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(transferLimitsStore, "transferLimitsStore");
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(suggestedAmountsStore, "suggestedAmountsStore");
        Intrinsics.checkNotNullParameter(retirementTransfersApi, "retirementTransfersApi");
        Intrinsics.checkNotNullParameter(additionalDataClient, "additionalDataClient");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(transferFactory, "transferFactory");
        Intrinsics.checkNotNullParameter(transferValidator, "transferValidator");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(depositIncentiveStore, "depositIncentiveStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(rothConversionStore, "rothConversionStore");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        this.paymentMethodLastUsagesPref = paymentMethodLastUsagesPref;
        this.accountProvider = accountProvider;
        this.balancesStore = balancesStore;
        this.experimentsStore = experimentsStore;
        this.iacUpsellStore = iacUpsellStore;
        this.marketHoursManager = marketHoursManager;
        this.transferAccountStore = transferAccountStore;
        this.transferLimitsStore = transferLimitsStore;
        this.transfersBonfireApi = transfersBonfireApi;
        this.suggestedAmountsStore = suggestedAmountsStore;
        this.retirementTransfersApi = retirementTransfersApi;
        this.additionalDataClient = additionalDataClient;
        this.portfolioStore = portfolioStore;
        this.transferFactory = transferFactory;
        this.transferValidator = transferValidator;
        this.eventLogger = eventLogger;
        this.depositIncentiveStore = depositIncentiveStore;
        this.savedStateHandle = savedStateHandle;
        this.microgramManager = microgramManager;
        this.moshi = moshi;
        this.rothConversionStore = rothConversionStore;
        TransferConfiguration transferConfiguration = ((TransferV2) INSTANCE.getArgs((HasSavedState) this)).getTransferConfiguration();
        this.transferConfiguration = transferConfiguration;
        if (transferConfiguration instanceof TransferConfiguration.OutgoingWire) {
            bigDecimal = WiresMaxAmount;
        } else {
            bigDecimal = DefaultMaxAmount;
        }
        this.inputKeyEventConsumer = new DollarInputConsumer(bigDecimal, true);
        MicrogramComponent componentWithUiLaunch = RealMicrogramUiLaunchService2.getComponentWithUiLaunch(microgramManager, new RemoteMicrogramApplication(MicrogramConstants.PAYMENT_PREFERENCE_MICROGRAM_APP, null, 2, null), getLifecycleScope(), moshi, MapsKt.mapOf(ManagedServiceExtension2.providedBy(Reflection.getOrCreateKotlinClass(AccountSelectionResolver.class), this), ManagedServiceExtension2.providedBy(Reflection.getOrCreateKotlinClass(TransferLimitsService.class), new TransferLimitsServiceImpl(transferLimitsStore)), RealMicrogramDeeplinkService.INSTANCE.getExtension(context, navigator)), new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.accountSelectionMicrogramComponent$lambda$0((FragmentKey) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.accountSelectionMicrogramComponent$lambda$1(this.f$0, (DialogFragmentKey) obj);
            }
        });
        this.accountSelectionMicrogramComponent = componentWithUiLaunch;
        this.accountSelectionService = (AccountSelectionBottomSheetService) componentWithUiLaunch.getServiceLocator().getClient(AccountSelectionBottomSheetService.class);
    }

    /* renamed from: getTransferConfiguration$feature_transfers_externalRelease, reason: from getter */
    public final TransferConfiguration getTransferConfiguration() {
        return this.transferConfiguration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit accountSelectionMicrogramComponent$lambda$0(FragmentKey it) {
        Intrinsics.checkNotNullParameter(it, "it");
        throw new IllegalStateException("doesn't launch UI.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit accountSelectionMicrogramComponent$lambda$1(CreateTransferV2Duxo createTransferV2Duxo, DialogFragmentKey key) {
        Intrinsics.checkNotNullParameter(key, "key");
        createTransferV2Duxo.submit(new CreateTransferV2Event.LaunchDialog(key));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        initializeDisclosureMicrogram();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C311571(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C311632(null), 3, null);
        Observable observableRefCount = ExperimentsProvider.DefaultImpls.streamVariant$default(this.experimentsStore, TransfersRedesignExperiment.INSTANCE, SimpleVariant.CONTROL, false, 4, null).replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Observable observableOnErrorResumeNext = observableRefCount.filter(new Predicate() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo.onCreate.3
            @Override // io.reactivex.functions.Predicate
            public final boolean test(SimpleVariant it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it != SimpleVariant.CONTROL;
            }
        }).take(1L).flatMap(new Function() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo.onCreate.4
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends List<Money>> apply(SimpleVariant variant) {
                Intrinsics.checkNotNullParameter(variant, "variant");
                CreateTransferV2Duxo createTransferV2Duxo = CreateTransferV2Duxo.this;
                Observable<T> observableAsObservable = createTransferV2Duxo.asObservable(createTransferV2Duxo.suggestedAmountsStore.get(true, variant.getServerValue()));
                final AnonymousClass1 anonymousClass1 = new PropertyReference1Impl() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo.onCreate.4.1
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
                    public Object get(Object obj) {
                        return ((ApiSuggestedAmountsResponse) obj).getSuggested_deposit_amounts();
                    }
                };
                return observableAsObservable.map(new Function(anonymousClass1) { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$sam$io_reactivex_functions_Function$0
                    private final /* synthetic */ Function1 function;

                    {
                        Intrinsics.checkNotNullParameter(anonymousClass1, "function");
                        this.function = anonymousClass1;
                    }

                    @Override // io.reactivex.functions.Function
                    public final /* synthetic */ Object apply(Object obj) {
                        return this.function.invoke(obj);
                    }
                });
            }
        }).timeout(350L, TimeUnit.MILLISECONDS).doOnError(new Consumer() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo.onCreate.5

            /* compiled from: CreateTransferV2Duxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$5$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$5$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CreateTransferV2DataState, Continuation<? super CreateTransferV2DataState>, Object> {
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
                public final Object invoke(CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2DataState> continuation) {
                    return ((AnonymousClass1) create(createTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CreateTransferV2DataState createTransferV2DataState = (CreateTransferV2DataState) this.L$0;
                    return createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : null, ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : null, ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : null, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : true, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : null, (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : null, (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : false, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : false);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Throwable th) {
                if (th instanceof TimeoutException) {
                    CreateTransferV2Duxo.this.applyMutation(new AnonymousClass1(null));
                }
            }
        }).onErrorResumeNext(Observable.empty());
        Intrinsics.checkNotNullExpressionValue(observableOnErrorResumeNext, "onErrorResumeNext(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableOnErrorResumeNext, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.onCreate$lambda$2(this.f$0, (List) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C311707(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C311718(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C311729(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C3115810(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C3115911(null), 3, null);
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.onCreate$lambda$3(this.f$0, (CreateTransferV2DataState) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C3116013(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C3116114(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C3116215(null), 3, null);
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{RecurringDepositIncludeCurrent.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.onCreate$lambda$4(this.f$0, ((Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.onCreate$lambda$5((Throwable) obj);
            }
        }, null, null, 12, null);
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.onCreate$lambda$6(this.f$0, (CreateTransferV2DataState) obj);
            }
        });
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.onCreate$lambda$7(this.f$0, (CreateTransferV2DataState) obj);
            }
        });
        try {
            if (this.transferConfiguration instanceof TransferConfiguration.RothConversion) {
                ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.connectWhen$default(this.rothConversionStore.getTransferInfoQuery().invoke(), ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{AdvisoryIraRothConversionExperiment.INSTANCE}, false, null, 6, null), null, 2, null), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda36
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreateTransferV2Duxo.onCreate$lambda$8(this.f$0, (ApiRothConversionTransferInfo) obj);
                    }
                }, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda37
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreateTransferV2Duxo.onCreate$lambda$9(this.f$0, (Throwable) obj);
                    }
                }, null, null, 12, null);
            }
        } catch (Exception e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, false, null, 6, null);
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C3116422(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C3116523(null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C3116624(null), 3, null);
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$1 */
    static final class C311571 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C311571(Continuation<? super C311571> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateTransferV2Duxo.this.new C311571(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C311571) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                TransferV2LimitsStore transferV2LimitsStore = CreateTransferV2Duxo.this.transferLimitsStore;
                this.label = 1;
                obj = transferV2LimitsStore.getAllTransferLimits(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            CreateTransferV2Duxo.this.applyMutation(new AnonymousClass1((Map) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: CreateTransferV2Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$1$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CreateTransferV2DataState, Continuation<? super CreateTransferV2DataState>, Object> {
            final /* synthetic */ Map<Tuples2<TransferProductType, TransferDirection>, ApiLimitsHubResponse> $transferLimitsMapping;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(Map<Tuples2<TransferProductType, TransferDirection>, ApiLimitsHubResponse> map, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$transferLimitsMapping = map;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transferLimitsMapping, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2DataState> continuation) {
                return ((AnonymousClass1) create(createTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CreateTransferV2DataState createTransferV2DataState = (CreateTransferV2DataState) this.L$0;
                return createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : null, ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : null, ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : null, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : this.$transferLimitsMapping, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : null, (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : null, (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : false, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : false);
            }
        }
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$2", m3645f = "CreateTransferV2Duxo.kt", m3646l = {224}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$2 */
    static final class C311632 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C311632(Continuation<? super C311632> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateTransferV2Duxo.this.new C311632(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C311632) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<CreateTransferV2ViewState> stateFlow = CreateTransferV2Duxo.this.getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CreateTransferV2Duxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: CreateTransferV2Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2ViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$2$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CreateTransferV2ViewState, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CreateTransferV2Duxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CreateTransferV2Duxo createTransferV2Duxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = createTransferV2Duxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CreateTransferV2ViewState createTransferV2ViewState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(createTransferV2ViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final CreateTransferV2Duxo createTransferV2Duxo = this.this$0;
                createTransferV2Duxo.withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CreateTransferV2Duxo.C311632.AnonymousClass1.invokeSuspend$lambda$0(createTransferV2Duxo, (CreateTransferV2DataState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invokeSuspend$lambda$0(CreateTransferV2Duxo createTransferV2Duxo, CreateTransferV2DataState createTransferV2DataState) {
                createTransferV2Duxo.getSavedStateHandle().set(CreateTransferV2Duxo.LatestStateKey, createTransferV2DataState);
                return Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(CreateTransferV2Duxo createTransferV2Duxo, List list) {
        createTransferV2Duxo.applyMutation(new CreateTransferV2Duxo$onCreate$6$1(list, null));
        return Unit.INSTANCE;
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$7", m3645f = "CreateTransferV2Duxo.kt", m3646l = {280}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$7 */
    static final class C311707 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C311707(Continuation<? super C311707> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateTransferV2Duxo.this.new C311707(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C311707) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(CreateTransferV2Duxo.this.getStateFlow(), new PropertyReference1Impl() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo.onCreate.7.1
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
                    public Object get(Object obj2) {
                        return ((CreateTransferV2ViewState) obj2).getCreateTransferV2AdditionalDataRequest();
                    }
                });
                Flow flowTransformLatest = FlowKt.transformLatest(new Flow<CreateTransferV2AdditionalDataClient.Request>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$7$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CreateTransferV2AdditionalDataClient.Request> flowCollector, Continuation continuation) {
                        Object objCollect = flowDistinctUntilChangedBy.collect(new C311522(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$7$invokeSuspend$$inlined$map$1$2 */
                    public static final class C311522<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$7$invokeSuspend$$inlined$map$1$2", m3645f = "CreateTransferV2Duxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$7$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C311522.this.emit(null, this);
                            }
                        }

                        public C311522(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
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
                                CreateTransferV2AdditionalDataClient.Request createTransferV2AdditionalDataRequest = ((CreateTransferV2ViewState) obj).getCreateTransferV2AdditionalDataRequest();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(createTransferV2AdditionalDataRequest, anonymousClass1) == coroutine_suspended) {
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
                }, new C31151xe7a4df97(null, CreateTransferV2Duxo.this));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(CreateTransferV2Duxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass4, this) == coroutine_suspended) {
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

        /* compiled from: CreateTransferV2Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "additionalDataState", "Lcom/robinhood/android/transfers/ui/v2/additionaldata/CreateTransferV2AdditionalDataClient$AdditionalDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$7$4", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$7$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CreateTransferV2AdditionalDataClient.AdditionalDataState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CreateTransferV2Duxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(CreateTransferV2Duxo createTransferV2Duxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = createTransferV2Duxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CreateTransferV2AdditionalDataClient.AdditionalDataState additionalDataState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(additionalDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final CreateTransferV2AdditionalDataClient.AdditionalDataState additionalDataState = (CreateTransferV2AdditionalDataClient.AdditionalDataState) this.L$0;
                CreateTransferV2AdditionalDataClient.AdditionalDataState.ValidationCheck validationCheck = additionalDataState instanceof CreateTransferV2AdditionalDataClient.AdditionalDataState.ValidationCheck ? (CreateTransferV2AdditionalDataClient.AdditionalDataState.ValidationCheck) additionalDataState : null;
                if (validationCheck != null) {
                    this.this$0.submit(new CreateTransferV2Event.ShowValidationAlert(true, validationCheck.getErrorDetails()));
                }
                this.this$0.updateDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$7$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CreateTransferV2Duxo.C311707.AnonymousClass4.invokeSuspend$lambda$0(additionalDataState, (CreateTransferV2DataState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final CreateTransferV2DataState invokeSuspend$lambda$0(CreateTransferV2AdditionalDataClient.AdditionalDataState additionalDataState, CreateTransferV2DataState createTransferV2DataState) {
                return createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : null, ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : null, ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : null, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : additionalDataState, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : null, (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : null, (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : false, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : false);
            }
        }
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$8", m3645f = "CreateTransferV2Duxo.kt", m3646l = {334}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$8 */
    static final class C311718 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C311718(Continuation<? super C311718> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateTransferV2Duxo.this.new C311718(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C311718) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(CreateTransferV2Duxo.this.getStateFlow(), new PropertyReference1Impl() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo.onCreate.8.1
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
                    public Object get(Object obj2) {
                        return ((CreateTransferV2ViewState) obj2).getEligibleInstantDepositBundle();
                    }
                });
                Flow flowTransformLatest = FlowKt.transformLatest(new Flow<CreateTransferV2EligibleInstantBundle>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$8$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CreateTransferV2EligibleInstantBundle> flowCollector, Continuation continuation) {
                        Object objCollect = flowDistinctUntilChangedBy.collect(new C311542(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$8$invokeSuspend$$inlined$map$1$2 */
                    public static final class C311542<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$8$invokeSuspend$$inlined$map$1$2", m3645f = "CreateTransferV2Duxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$8$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C311542.this.emit(null, this);
                            }
                        }

                        public C311542(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
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
                                CreateTransferV2EligibleInstantBundle eligibleInstantDepositBundle = ((CreateTransferV2ViewState) obj).getEligibleInstantDepositBundle();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(eligibleInstantDepositBundle, anonymousClass1) == coroutine_suspended) {
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
                }, new C31153x3ec2d076(null, CreateTransferV2Duxo.this));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(CreateTransferV2Duxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass4, this) == coroutine_suspended) {
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

        /* compiled from: CreateTransferV2Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isEligibleForInstantDeposits", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$8$4", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$8$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CreateTransferV2Duxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(CreateTransferV2Duxo createTransferV2Duxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = createTransferV2Duxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    final boolean z = this.Z$0;
                    this.this$0.updateDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$8$4$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return CreateTransferV2Duxo.C311718.AnonymousClass4.invokeSuspend$lambda$0(z, (CreateTransferV2DataState) obj2);
                        }
                    });
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final CreateTransferV2DataState invokeSuspend$lambda$0(boolean z, CreateTransferV2DataState createTransferV2DataState) {
                return createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : null, ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : null, ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : null, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : z, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : null, (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : null, (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : false, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : false);
            }
        }
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$9", m3645f = "CreateTransferV2Duxo.kt", m3646l = {357}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$9 */
    static final class C311729 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C311729(Continuation<? super C311729> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateTransferV2Duxo.this.new C311729(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C311729) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(CreateTransferV2Duxo.this.getStateFlow(), new PropertyReference1Impl() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo.onCreate.9.1
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
                    public Object get(Object obj2) {
                        return ((CreateTransferV2ViewState) obj2).getIraDistributionFeesRequest();
                    }
                });
                Flow flowMapLatest = FlowKt.mapLatest(new Flow<CreateTransferViewState.IraDistributionTaxWithholdingRequest>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$9$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CreateTransferViewState.IraDistributionTaxWithholdingRequest> flowCollector, Continuation continuation) {
                        Object objCollect = flowDistinctUntilChangedBy.collect(new C311552(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$9$invokeSuspend$$inlined$map$1$2 */
                    public static final class C311552<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$9$invokeSuspend$$inlined$map$1$2", m3645f = "CreateTransferV2Duxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$9$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C311552.this.emit(null, this);
                            }
                        }

                        public C311552(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
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
                                CreateTransferViewState.IraDistributionTaxWithholdingRequest iraDistributionTaxWithholdingRequest = ((CreateTransferV2ViewState) obj).getIraDistributionTaxWithholdingRequest();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(iraDistributionTaxWithholdingRequest, anonymousClass1) == coroutine_suspended) {
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
                }, new AnonymousClass3(CreateTransferV2Duxo.this, null));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(CreateTransferV2Duxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowMapLatest, anonymousClass4, this) == coroutine_suspended) {
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

        /* compiled from: CreateTransferV2Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionFee;", "request", "Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState$IraDistributionTaxWithholdingRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$9$3", m3645f = "CreateTransferV2Duxo.kt", m3646l = {351}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$9$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CreateTransferViewState.IraDistributionTaxWithholdingRequest, Continuation<? super ApiIraDistributionFee>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CreateTransferV2Duxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CreateTransferV2Duxo createTransferV2Duxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = createTransferV2Duxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CreateTransferViewState.IraDistributionTaxWithholdingRequest iraDistributionTaxWithholdingRequest, Continuation<? super ApiIraDistributionFee> continuation) {
                return ((AnonymousClass3) create(iraDistributionTaxWithholdingRequest, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CreateTransferViewState.IraDistributionTaxWithholdingRequest iraDistributionTaxWithholdingRequest = (CreateTransferViewState.IraDistributionTaxWithholdingRequest) this.L$0;
                    if (iraDistributionTaxWithholdingRequest == null) {
                        return null;
                    }
                    RetirementTransfersApi retirementTransfersApi = this.this$0.retirementTransfersApi;
                    BigDecimal amount = iraDistributionTaxWithholdingRequest.getAmount();
                    String accountNumber = iraDistributionTaxWithholdingRequest.getIraTransferAccount().getAccountNumber();
                    this.label = 1;
                    obj = retirementTransfersApi.getDistributionFee(amount, accountNumber, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return (ApiIraDistributionFee) obj;
            }
        }

        /* compiled from: CreateTransferV2Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", CreateTransferDuxo.SAVED_STATE_IRA_DISTRIBUTION_FEE, "Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionFee;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$9$4", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$9$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<ApiIraDistributionFee, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CreateTransferV2Duxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(CreateTransferV2Duxo createTransferV2Duxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = createTransferV2Duxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiIraDistributionFee apiIraDistributionFee, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(apiIraDistributionFee, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CreateTransferV2Duxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$9$4$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$9$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CreateTransferV2DataState, Continuation<? super CreateTransferV2DataState>, Object> {
                final /* synthetic */ ApiIraDistributionFee $iraDistributionFee;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ApiIraDistributionFee apiIraDistributionFee, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$iraDistributionFee = apiIraDistributionFee;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$iraDistributionFee, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2DataState> continuation) {
                    return ((AnonymousClass1) create(createTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CreateTransferV2DataState createTransferV2DataState = (CreateTransferV2DataState) this.L$0;
                    return createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : null, ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : null, ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : null, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : null, (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : this.$iraDistributionFee, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : null, (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : false, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((ApiIraDistributionFee) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$10", m3645f = "CreateTransferV2Duxo.kt", m3646l = {397}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$10 */
    static final class C3115810 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C3115810(Continuation<? super C3115810> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateTransferV2Duxo.this.new C3115810(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C3115810) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(CreateTransferV2Duxo.this.getStateFlow(), new PropertyReference1Impl() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo.onCreate.10.1
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
                    public Object get(Object obj2) {
                        return ((CreateTransferV2ViewState) obj2).getIraDistributionTaxWithholdingRequest();
                    }
                });
                Flow flowTransformLatest = FlowKt.transformLatest(new Flow<CreateTransferViewState.IraDistributionTaxWithholdingRequest>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$10$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CreateTransferViewState.IraDistributionTaxWithholdingRequest> flowCollector, Continuation continuation) {
                        Object objCollect = flowDistinctUntilChangedBy.collect(new C311412(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$10$invokeSuspend$$inlined$map$1$2 */
                    public static final class C311412<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$10$invokeSuspend$$inlined$map$1$2", m3645f = "CreateTransferV2Duxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$10$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C311412.this.emit(null, this);
                            }
                        }

                        public C311412(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
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
                                CreateTransferViewState.IraDistributionTaxWithholdingRequest iraDistributionTaxWithholdingRequest = ((CreateTransferV2ViewState) obj).getIraDistributionTaxWithholdingRequest();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(iraDistributionTaxWithholdingRequest, anonymousClass1) == coroutine_suspended) {
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
                }, new C31140x3db2b20f(null, CreateTransferV2Duxo.this));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(CreateTransferV2Duxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass4, this) == coroutine_suspended) {
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

        /* compiled from: CreateTransferV2Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "result", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$CalculatedTaxWithholdingResult;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$10$4", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$10$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<CreateTransferDuxo.CalculatedTaxWithholdingResult, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CreateTransferV2Duxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(CreateTransferV2Duxo createTransferV2Duxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = createTransferV2Duxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CreateTransferDuxo.CalculatedTaxWithholdingResult calculatedTaxWithholdingResult, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(calculatedTaxWithholdingResult, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CreateTransferV2Duxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$10$4$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$10$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CreateTransferV2DataState, Continuation<? super CreateTransferV2DataState>, Object> {
                final /* synthetic */ CreateTransferDuxo.CalculatedTaxWithholdingResult $result;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CreateTransferDuxo.CalculatedTaxWithholdingResult calculatedTaxWithholdingResult, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$result = calculatedTaxWithholdingResult;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$result, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2DataState> continuation) {
                    return ((AnonymousClass1) create(createTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CreateTransferV2DataState createTransferV2DataState = (CreateTransferV2DataState) this.L$0;
                    return createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : null, ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : null, ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : null, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : null, (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : this.$result, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : null, (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : false, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((CreateTransferDuxo.CalculatedTaxWithholdingResult) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$11", m3645f = "CreateTransferV2Duxo.kt", m3646l = {434}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$11 */
    static final class C3115911 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C3115911(Continuation<? super C3115911> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateTransferV2Duxo.this.new C3115911(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C3115911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(CreateTransferV2Duxo.this.getStateFlow(), new PropertyReference1Impl() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo.onCreate.11.1
                    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
                    public Object get(Object obj2) {
                        return ((CreateTransferV2ViewState) obj2).getTransferSummaryRequest();
                    }
                });
                Flow flowTransformLatest = FlowKt.transformLatest(new Flow<ApiTransferSummaryRequest>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$11$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super ApiTransferSummaryRequest> flowCollector, Continuation continuation) {
                        Object objCollect = flowDistinctUntilChangedBy.collect(new C311432(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$11$invokeSuspend$$inlined$map$1$2 */
                    public static final class C311432<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$11$invokeSuspend$$inlined$map$1$2", m3645f = "CreateTransferV2Duxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$11$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                return C311432.this.emit(null, this);
                            }
                        }

                        public C311432(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
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
                                ApiTransferSummaryRequest transferSummaryRequest = ((CreateTransferV2ViewState) obj).getTransferSummaryRequest();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(transferSummaryRequest, anonymousClass1) == coroutine_suspended) {
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
                }, new C31142x94d0a2ee(null, CreateTransferV2Duxo.this));
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(CreateTransferV2Duxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass4, this) == coroutine_suspended) {
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

        /* compiled from: CreateTransferV2Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000b\u0010\u0002\u001a\u00070\u0003¢\u0006\u0002\b\u0004H\n"}, m3636d2 = {"<anonymous>", "", "transferSummaryState", "Lcom/robinhood/android/transfers/ui/v2/TransferSummaryState;", "Lkotlin/internal/Exact;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$11$4", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$11$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<TransferSummaryState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CreateTransferV2Duxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(CreateTransferV2Duxo createTransferV2Duxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = createTransferV2Duxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(TransferSummaryState transferSummaryState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(transferSummaryState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CreateTransferV2Duxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$11$4$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$11$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CreateTransferV2DataState, Continuation<? super CreateTransferV2DataState>, Object> {
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
                public final Object invoke(CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2DataState> continuation) {
                    return ((AnonymousClass1) create(createTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CreateTransferV2DataState createTransferV2DataState = (CreateTransferV2DataState) this.L$0;
                    return createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : null, ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : null, ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : null, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : null, (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : null, (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : false, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    TransferSummaryState transferSummaryState = (TransferSummaryState) this.L$0;
                    this.this$0.applyMutation(new AnonymousClass1(null));
                    this.this$0.applyMutation(new AnonymousClass2(transferSummaryState, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* compiled from: CreateTransferV2Duxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$11$4$2", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$11$4$2, reason: invalid class name */
            static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CreateTransferV2DataState, Continuation<? super CreateTransferV2DataState>, Object> {
                final /* synthetic */ TransferSummaryState $transferSummaryState;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(TransferSummaryState transferSummaryState, Continuation<? super AnonymousClass2> continuation) {
                    super(2, continuation);
                    this.$transferSummaryState = transferSummaryState;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$transferSummaryState, continuation);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2DataState> continuation) {
                    return ((AnonymousClass2) create(createTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CreateTransferV2DataState createTransferV2DataState = (CreateTransferV2DataState) this.L$0;
                    return createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : null, ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : null, ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : null, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : this.$transferSummaryState, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : null, (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : null, (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : true, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(CreateTransferV2Duxo createTransferV2Duxo, CreateTransferV2DataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getEntryPoint() == MAXTransferContext.EntryPoint.MENU_OF_OPTIONS && !dataState.getHasSeenGoldNativeFundingUpsell()) {
            createTransferV2Duxo.submit(new CreateTransferV2Event.ShowActivity(new GoldNativeFundingUpsellIntentKey(MENU_OF_OPTIONS_INITIAL_SCREEN_SOURCE, false, ColorTheme.DEFAULT)));
            createTransferV2Duxo.applyMutation(new CreateTransferV2Duxo$onCreate$12$1(null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$13", m3645f = "CreateTransferV2Duxo.kt", m3646l = {478}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$13 */
    static final class C3116013 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C3116013(Continuation<? super C3116013> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateTransferV2Duxo.this.new C3116013(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C3116013) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<CreateTransferV2ViewState> stateFlow = CreateTransferV2Duxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$13$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$13$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$13$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "CreateTransferV2Duxo.kt", m3646l = {55}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$13$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
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
                                TransferAccount sourceAccount = ((CreateTransferV2ViewState) obj).getCreateTransferV2AdditionalDataRequest().getSourceAccount();
                                String accountNumber = sourceAccount != null ? sourceAccount.getAccountNumber() : null;
                                if (accountNumber != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(accountNumber, anonymousClass1) == coroutine_suspended) {
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
                }), new C31144x430c84ac(null, CreateTransferV2Duxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(CreateTransferV2Duxo.this, null);
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

        /* compiled from: CreateTransferV2Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "unifiedBalances", "Lcom/robinhood/models/crypto/db/UnifiedBalances;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$13$3", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$13$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<UnifiedBalances, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CreateTransferV2Duxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CreateTransferV2Duxo createTransferV2Duxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = createTransferV2Duxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(UnifiedBalances unifiedBalances, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(unifiedBalances, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.unifiedBalances = (UnifiedBalances) this.L$0;
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$14", m3645f = "CreateTransferV2Duxo.kt", m3646l = {497}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$14 */
    static final class C3116114 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C3116114(Continuation<? super C3116114> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateTransferV2Duxo.this.new C3116114(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C3116114) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<CreateTransferV2ViewState> stateFlow = CreateTransferV2Duxo.this.getStateFlow();
                Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<String>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$14$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super String> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$14$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$14$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "CreateTransferV2Duxo.kt", m3646l = {55}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$14$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
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
                                TransferAccount sourceAccount = ((CreateTransferV2ViewState) obj).getCreateTransferV2AdditionalDataRequest().getSourceAccount();
                                String accountNumber = sourceAccount != null ? sourceAccount.getAccountNumber() : null;
                                if (accountNumber != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(accountNumber, anonymousClass1) == coroutine_suspended) {
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
                }), new C31146x9a2a758b(null, CreateTransferV2Duxo.this));
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(CreateTransferV2Duxo.this, null);
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

        /* compiled from: CreateTransferV2Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", AnalyticsStrings.TAB_NAV_TAB_BAR_PORTFOLIO, "Lcom/robinhood/models/db/Portfolio;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$14$3", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$14$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<Portfolio, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CreateTransferV2Duxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CreateTransferV2Duxo createTransferV2Duxo, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = createTransferV2Duxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Portfolio portfolio, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(portfolio, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.portfolio = (Portfolio) this.L$0;
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$15", m3645f = "CreateTransferV2Duxo.kt", m3646l = {510}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$15 */
    static final class C3116215 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C3116215(Continuation<? super C3116215> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateTransferV2Duxo.this.new C3116215(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C3116215) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<CreateTransferV2ViewState> stateFlow = CreateTransferV2Duxo.this.getStateFlow();
                final Flow<CreateTransferV2ViewState> flow = new Flow<CreateTransferV2ViewState>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$15$invokeSuspend$$inlined$filter$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CreateTransferV2ViewState> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new C311482(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$15$invokeSuspend$$inlined$filter$1$2 */
                    public static final class C311482<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$15$invokeSuspend$$inlined$filter$1$2", m3645f = "CreateTransferV2Duxo.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$15$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                return C311482.this.emit(null, this);
                            }
                        }

                        public C311482(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
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
                                if (((CreateTransferV2ViewState) obj).getPromotionType() != null) {
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
                final Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(new Flow<ApiCreateTransferRequest>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$15$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super ApiCreateTransferRequest> flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$15$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$15$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "CreateTransferV2Duxo.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$15$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector) {
                            this.$this_unsafeFlow = flowCollector;
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
                                ApiCreateTransferRequest depositIncentiveRequestData = ((CreateTransferV2ViewState) obj).getDepositIncentiveRequestData();
                                if (depositIncentiveRequestData != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(depositIncentiveRequestData, anonymousClass1) == coroutine_suspended) {
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
                });
                final CreateTransferV2Duxo createTransferV2Duxo = CreateTransferV2Duxo.this;
                Flow<ApiTransferRewardDetailResponse> flow2 = new Flow<ApiTransferRewardDetailResponse>() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$15$invokeSuspend$$inlined$mapNotNull$2
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super ApiTransferRewardDetailResponse> flowCollector, Continuation continuation) {
                        Object objCollect = flowDistinctUntilChanged.collect(new AnonymousClass2(flowCollector, createTransferV2Duxo), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$15$invokeSuspend$$inlined$mapNotNull$2$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;
                        final /* synthetic */ CreateTransferV2Duxo this$0;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$15$invokeSuspend$$inlined$mapNotNull$2$2", m3645f = "CreateTransferV2Duxo.kt", m3646l = {51, 52}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$15$invokeSuspend$$inlined$mapNotNull$2$2$1, reason: invalid class name */
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
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, CreateTransferV2Duxo createTransferV2Duxo) {
                            this.$this_unsafeFlow = flowCollector;
                            this.this$0 = createTransferV2Duxo;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
                        
                            if (r7.emit(r8, r0) == r1) goto L23;
                         */
                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, Continuation continuation) {
                            AnonymousClass1 anonymousClass1;
                            FlowCollector flowCollector;
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
                                FlowCollector flowCollector2 = this.$this_unsafeFlow;
                                DepositIncentiveStore depositIncentiveStore = this.this$0.depositIncentiveStore;
                                anonymousClass1.L$0 = flowCollector2;
                                anonymousClass1.label = 1;
                                Object rewardDetail = depositIncentiveStore.getRewardDetail((ApiCreateTransferRequest) obj, anonymousClass1);
                                if (rewardDetail != coroutine_suspended) {
                                    obj2 = rewardDetail;
                                    flowCollector = flowCollector2;
                                }
                                return coroutine_suspended;
                            }
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ResultKt.throwOnFailure(obj2);
                                return Unit.INSTANCE;
                            }
                            FlowCollector flowCollector3 = (FlowCollector) anonymousClass1.L$0;
                            ResultKt.throwOnFailure(obj2);
                            flowCollector = flowCollector3;
                            if (obj2 != null) {
                                anonymousClass1.L$0 = null;
                                anonymousClass1.label = 2;
                            }
                            return Unit.INSTANCE;
                        }
                    }
                };
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(CreateTransferV2Duxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow2, anonymousClass4, this) == coroutine_suspended) {
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

        /* compiled from: CreateTransferV2Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "rewardDetails", "Lcom/robinhood/models/api/bonfire/transfer/rewarddetail/ApiTransferRewardDetailResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$15$4", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$15$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<ApiTransferRewardDetailResponse, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CreateTransferV2Duxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass4(CreateTransferV2Duxo createTransferV2Duxo, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.this$0 = createTransferV2Duxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ApiTransferRewardDetailResponse apiTransferRewardDetailResponse, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(apiTransferRewardDetailResponse, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ApiTransferRewardDetailResponse apiTransferRewardDetailResponse = (ApiTransferRewardDetailResponse) this.L$0;
                ApiTransferRewardDetailResponse.Pill pill = apiTransferRewardDetailResponse.getPill();
                DepositIncentivePillData depositIncentivePillData = pill != null ? new DepositIncentivePillData(pill.getText(), pill.getIcon(), pill.getLoggingIdentifier(), pill.getType()) : null;
                ApiTransferRewardDetailResponse.CancelDialog cancelDialog = apiTransferRewardDetailResponse.getCancelDialog();
                this.this$0.applyMutation(new AnonymousClass1(depositIncentivePillData, cancelDialog != null ? new DepositIncentiveCancellationDialogData(cancelDialog.getTitle(), cancelDialog.getMessage(), cancelDialog.getPrimaryButtonText(), cancelDialog.getSecondaryButtonText(), cancelDialog.getLoggingIdentifier()) : null, null));
                return Unit.INSTANCE;
            }

            /* compiled from: CreateTransferV2Duxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$15$4$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$15$4$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CreateTransferV2DataState, Continuation<? super CreateTransferV2DataState>, Object> {
                final /* synthetic */ DepositIncentiveCancellationDialogData $cancelDialog;
                final /* synthetic */ DepositIncentivePillData $pillData;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(DepositIncentivePillData depositIncentivePillData, DepositIncentiveCancellationDialogData depositIncentiveCancellationDialogData, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$pillData = depositIncentivePillData;
                    this.$cancelDialog = depositIncentiveCancellationDialogData;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$pillData, this.$cancelDialog, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2DataState> continuation) {
                    return ((AnonymousClass1) create(createTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CreateTransferV2DataState createTransferV2DataState = (CreateTransferV2DataState) this.L$0;
                    return createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : null, ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : null, ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : null, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : null, (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : null, (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : false, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : this.$pillData, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : this.$cancelDialog, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(CreateTransferV2Duxo createTransferV2Duxo, boolean z) {
        createTransferV2Duxo.applyMutation(new CreateTransferV2Duxo$onCreate$16$1(z, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$5(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, it, false, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(CreateTransferV2Duxo createTransferV2Duxo, CreateTransferV2DataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        MAXTransferContext.EntryPoint entryPoint = dataState.getEntryPoint();
        String lowerCase = entryPoint.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        BuildersKt__Builders_commonKt.launch$default(createTransferV2Duxo.getLifecycleScope(), null, null, new CreateTransferV2Duxo$onCreate$18$1(createTransferV2Duxo, lowerCase, entryPoint, dataState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$7(CreateTransferV2Duxo createTransferV2Duxo, CreateTransferV2DataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (CreateTransferV2DataState2.getShowFrequencyBottomSheetOnLaunch(dataState)) {
            createTransferV2Duxo.applyMutation(new CreateTransferV2Duxo$onCreate$19$1(createTransferV2Duxo, null));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$8(CreateTransferV2Duxo createTransferV2Duxo, ApiRothConversionTransferInfo result) {
        Intrinsics.checkNotNullParameter(result, "result");
        createTransferV2Duxo.applyMutation(new CreateTransferV2Duxo$onCreate$20$1(result, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$9(CreateTransferV2Duxo createTransferV2Duxo, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        createTransferV2Duxo.applyMutation(new CreateTransferV2Duxo$onCreate$21$1(null));
        return Unit.INSTANCE;
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$22", m3645f = "CreateTransferV2Duxo.kt", m3646l = {629}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$22 */
    static final class C3116422 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C3116422(Continuation<? super C3116422> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateTransferV2Duxo.this.new C3116422(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C3116422) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(CreateTransferV2Duxo.this.experimentsStore, new Experiment[]{LimitWireAlertOnAndroid.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CreateTransferV2Duxo.this, null);
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

        /* compiled from: CreateTransferV2Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$22$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$22$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CreateTransferV2Duxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CreateTransferV2Duxo createTransferV2Duxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = createTransferV2Duxo;
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

            /* compiled from: CreateTransferV2Duxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$22$1$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$22$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506291 extends ContinuationImpl7 implements Function2<CreateTransferV2DataState, Continuation<? super CreateTransferV2DataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506291(boolean z, Continuation<? super C506291> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506291 c506291 = new C506291(this.$it, continuation);
                    c506291.L$0 = obj;
                    return c506291;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2DataState> continuation) {
                    return ((C506291) create(createTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CreateTransferV2DataState createTransferV2DataState = (CreateTransferV2DataState) this.L$0;
                    return createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : null, ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : null, ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : null, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : null, (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : null, (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : false, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : this.$it, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : false);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C506291(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$23", m3645f = "CreateTransferV2Duxo.kt", m3646l = {638}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$23 */
    static final class C3116523 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C3116523(Continuation<? super C3116523> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateTransferV2Duxo.this.new C3116523(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C3116523) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final CreateTransferV2Duxo createTransferV2Duxo = CreateTransferV2Duxo.this;
                Function3 function3 = new Function3() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$23$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        return CreateTransferV2Duxo.C3116523.invokeSuspend$lambda$0(createTransferV2Duxo, (TransferAccount) obj2, (ApiOutgoingWireDetails) obj3, (WireRoutingDetailsInputActivityResultContract3.Success) obj4);
                    }
                };
                this.label = 1;
                if (CreateTransferV2Duxos.streamOutgoingWireDetails(createTransferV2Duxo, function3, this) == coroutine_suspended) {
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

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(CreateTransferV2Duxo createTransferV2Duxo, TransferAccount transferAccount, ApiOutgoingWireDetails apiOutgoingWireDetails, WireRoutingDetailsInputActivityResultContract3.Success success) {
            createTransferV2Duxo.applyMutation(new CreateTransferV2Duxo$onCreate$23$1$1(transferAccount, apiOutgoingWireDetails, success, null));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$24", m3645f = "CreateTransferV2Duxo.kt", m3646l = {651}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$24 */
    static final class C3116624 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C3116624(Continuation<? super C3116624> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateTransferV2Duxo.this.new C3116624(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C3116624) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(CreateTransferV2Duxo.this.experimentsStore, new Experiment[]{PdtRevampV1.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CreateTransferV2Duxo.this, null);
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

        /* compiled from: CreateTransferV2Duxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$24$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$24$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CreateTransferV2Duxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CreateTransferV2Duxo createTransferV2Duxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = createTransferV2Duxo;
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

            /* compiled from: CreateTransferV2Duxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$24$1$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onCreate$24$1$1, reason: invalid class name and collision with other inner class name */
            static final class C506301 extends ContinuationImpl7 implements Function2<CreateTransferV2DataState, Continuation<? super CreateTransferV2DataState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C506301(boolean z, Continuation<? super C506301> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C506301 c506301 = new C506301(this.$it, continuation);
                    c506301.L$0 = obj;
                    return c506301;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2DataState> continuation) {
                    return ((C506301) create(createTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    CreateTransferV2DataState createTransferV2DataState = (CreateTransferV2DataState) this.L$0;
                    return createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : null, ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : null, ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : null, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : null, (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : null, (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : false, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : this.$it);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C506301(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    private final void initializeDisclosureMicrogram() {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.initializeDisclosureMicrogram$lambda$10(this.f$0, (CreateTransferV2DataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeDisclosureMicrogram$lambda$10(CreateTransferV2Duxo createTransferV2Duxo, CreateTransferV2DataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        createTransferV2Duxo.disclosureService = (TransferDisclosureManagedService) MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(createTransferV2Duxo.microgramManager, createTransferV2Duxo.getLifecycleScope(), new MicrogramLaunchId(state.getDisclosureMicrogramApplication(), null, 2, null), null, 4, null).getComponent().getServiceLocator().getClient(TransferDisclosureManagedService.class);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        Observable<List<TransferAccount>> observableRefCount;
        super.onStart();
        TransferConfiguration transferConfiguration = this.transferConfiguration;
        if (transferConfiguration instanceof TransferConfiguration.OutgoingWire) {
            if (((TransferConfiguration.OutgoingWire) transferConfiguration).isThirdPartyWireConfigured()) {
                TransferAccountStore transferAccountStore = this.transferAccountStore;
                ThirdPartyOutgoingWiresInfo thirdPartyWiresInfo = ((TransferConfiguration.OutgoingWire) this.transferConfiguration).getThirdPartyWiresInfo();
                if (thirdPartyWiresInfo != null) {
                    observableRefCount = transferAccountStore.fetchAccountsForThirdPartyOutgoingWires(thirdPartyWiresInfo);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                observableRefCount = this.transferAccountStore.fetchAccountsForOutgoingWires();
            }
        } else {
            observableRefCount = this.transferAccountStore.forceFetchAndStream().replay(1).refCount();
            Intrinsics.checkNotNull(observableRefCount);
        }
        Observable<R> map = this.accountProvider.getIndividualAccountForced().map(new Function() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo.onStart.1
            @Override // io.reactivex.functions.Function
            public final Optional<BigDecimal> apply(Account it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getBalances().getEligibleDepositAsInstant());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableFilterIsPresent = ObservablesKt.filterIsPresent(map);
        Observable<R> map2 = observableRefCount.map(new Function() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo.onStart.2
            @Override // io.reactivex.functions.Function
            public final Boolean apply(List<TransferAccount> transferAccounts) {
                Intrinsics.checkNotNullParameter(transferAccounts, "transferAccounts");
                List<TransferAccount> list = transferAccounts;
                boolean z = false;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (((TransferAccount) it.next()).getType() == ApiTransferAccount.TransferAccountType.RHS) {
                            z = true;
                            break;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.connectWhen$default(observableFilterIsPresent, map2, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.onStart$lambda$11(this.f$0, (BigDecimal) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, observableRefCount, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.onStart$lambda$13(this.f$0, (List) obj);
            }
        });
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.onStart$lambda$14(this.f$0, (CreateTransferV2DataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$11(CreateTransferV2Duxo createTransferV2Duxo, BigDecimal eligibleDepositAsInstant) {
        Intrinsics.checkNotNullParameter(eligibleDepositAsInstant, "eligibleDepositAsInstant");
        createTransferV2Duxo.applyMutation(new CreateTransferV2Duxo$onStart$3$1(eligibleDepositAsInstant, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$13(final CreateTransferV2Duxo createTransferV2Duxo, final List transferAccounts) {
        Intrinsics.checkNotNullParameter(transferAccounts, "transferAccounts");
        createTransferV2Duxo.updateDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda44
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.onStart$lambda$13$lambda$12(transferAccounts, createTransferV2Duxo, (CreateTransferV2DataState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferV2DataState onStart$lambda$13$lambda$12(List list, CreateTransferV2Duxo createTransferV2Duxo, CreateTransferV2DataState updateDataState) {
        Intrinsics.checkNotNullParameter(updateDataState, "$this$updateDataState");
        List list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        for (Object obj : list2) {
            linkedHashMap.put(((TransferAccount) obj).getAccountId(), obj);
        }
        CreateTransferV2DataState createTransferV2DataStateCopy = updateDataState.copy(((-1) & 1) != 0 ? updateDataState.sessionId : null, ((-1) & 2) != 0 ? updateDataState.direction : null, ((-1) & 4) != 0 ? updateDataState.entryPoint : null, ((-1) & 8) != 0 ? updateDataState.amount : null, ((-1) & 16) != 0 ? updateDataState.inputChars : null, ((-1) & 32) != 0 ? updateDataState.animateInput : false, ((-1) & 64) != 0 ? updateDataState.transferAccounts : linkedHashMap, ((-1) & 128) != 0 ? updateDataState.fromAccountId : null, ((-1) & 256) != 0 ? updateDataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? updateDataState.toAccountId : null, ((-1) & 1024) != 0 ? updateDataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? updateDataState.frequency : null, ((-1) & 4096) != 0 ? updateDataState.hideFrequency : false, ((-1) & 8192) != 0 ? updateDataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? updateDataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? updateDataState.mode : null, ((-1) & 65536) != 0 ? updateDataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? updateDataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? updateDataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? updateDataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? updateDataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? updateDataState.additionalDataState : null, ((-1) & 4194304) != 0 ? updateDataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? updateDataState.transferLimits : null, ((-1) & 16777216) != 0 ? updateDataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? updateDataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? updateDataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? updateDataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? updateDataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? updateDataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? updateDataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? updateDataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? updateDataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? updateDataState.iraDistribution : null, (16646143 & 4) != 0 ? updateDataState.iraDistributionFee : null, (16646143 & 8) != 0 ? updateDataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? updateDataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? updateDataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? updateDataState.iraContribution : null, (16646143 & 128) != 0 ? updateDataState.systemCalendarYear : null, (16646143 & 256) != 0 ? updateDataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? updateDataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? updateDataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? updateDataState.showDisclosure : false, (16646143 & 4096) != 0 ? updateDataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? updateDataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? updateDataState.promotionName : null, (16646143 & 32768) != 0 ? updateDataState.promotionType : null, (16646143 & 65536) != 0 ? updateDataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? updateDataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? updateDataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? updateDataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? updateDataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? updateDataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? updateDataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? updateDataState.isMemberPdtRevampV1 : false);
        if (CreateTransferV2DataState2.getShouldDefaultFromAccountOnStart(updateDataState)) {
            return createTransferV2DataStateCopy.copy(((-1) & 1) != 0 ? createTransferV2DataStateCopy.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataStateCopy.direction : null, ((-1) & 4) != 0 ? createTransferV2DataStateCopy.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataStateCopy.amount : null, ((-1) & 16) != 0 ? createTransferV2DataStateCopy.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataStateCopy.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataStateCopy.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataStateCopy.fromAccountId : CreateTransferV2DataState2.fromDefault(createTransferV2DataStateCopy, createTransferV2Duxo.transferConfiguration.getFrom(), createTransferV2Duxo.eventLogger, createTransferV2Duxo.transferConfiguration), ((-1) & 256) != 0 ? createTransferV2DataStateCopy.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataStateCopy.toAccountId : null, ((-1) & 1024) != 0 ? createTransferV2DataStateCopy.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataStateCopy.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataStateCopy.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataStateCopy.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataStateCopy.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataStateCopy.mode : null, ((-1) & 65536) != 0 ? createTransferV2DataStateCopy.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataStateCopy.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataStateCopy.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataStateCopy.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataStateCopy.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataStateCopy.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataStateCopy.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataStateCopy.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataStateCopy.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataStateCopy.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataStateCopy.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataStateCopy.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataStateCopy.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataStateCopy.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataStateCopy.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataStateCopy.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataStateCopy.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataStateCopy.iraDistribution : null, (16646143 & 4) != 0 ? createTransferV2DataStateCopy.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataStateCopy.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataStateCopy.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataStateCopy.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataStateCopy.iraContribution : null, (16646143 & 128) != 0 ? createTransferV2DataStateCopy.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataStateCopy.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataStateCopy.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataStateCopy.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataStateCopy.showDisclosure : false, (16646143 & 4096) != 0 ? createTransferV2DataStateCopy.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataStateCopy.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataStateCopy.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataStateCopy.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataStateCopy.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataStateCopy.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataStateCopy.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataStateCopy.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataStateCopy.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataStateCopy.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataStateCopy.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataStateCopy.isMemberPdtRevampV1 : false);
        }
        return createTransferV2DataStateCopy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$14(CreateTransferV2Duxo createTransferV2Duxo, CreateTransferV2DataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.getDirection() == TransferDirectionV2.DEPOSIT) {
            createTransferV2Duxo.getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new CreateTransferV2Duxo$onStart$5$1(createTransferV2Duxo, null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$updateDataState$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$updateDataState$1 */
    static final class C311861 extends ContinuationImpl7 implements Function2<CreateTransferV2DataState, Continuation<? super CreateTransferV2DataState>, Object> {
        final /* synthetic */ Function1<CreateTransferV2DataState, CreateTransferV2DataState> $callback;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C311861(Function1<? super CreateTransferV2DataState, CreateTransferV2DataState> function1, Continuation<? super C311861> continuation) {
            super(2, continuation);
            this.$callback = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C311861 c311861 = new C311861(this.$callback, continuation);
            c311861.L$0 = obj;
            return c311861;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2DataState> continuation) {
            return ((C311861) create(createTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return this.$callback.invoke((CreateTransferV2DataState) this.L$0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDataState(Function1<? super CreateTransferV2DataState, CreateTransferV2DataState> callback) {
        applyMutation(new C311861(callback, null));
        applyMutation(new C311872(null));
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.updateDataState$lambda$15(this.f$0, (CreateTransferV2DataState) obj);
            }
        });
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$updateDataState$2", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$updateDataState$2 */
    static final class C311872 extends ContinuationImpl7 implements Function2<CreateTransferV2DataState, Continuation<? super CreateTransferV2DataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C311872(Continuation<? super C311872> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C311872 c311872 = new C311872(continuation);
            c311872.L$0 = obj;
            return c311872;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2DataState> continuation) {
            return ((C311872) create(createTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreateTransferV2DataState createTransferV2DataState = (CreateTransferV2DataState) this.L$0;
            return createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : null, ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : null, ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : null, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : null, (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : null, (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : false, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateDataState$lambda$15(CreateTransferV2Duxo createTransferV2Duxo, CreateTransferV2DataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        BuildersKt__Builders_commonKt.launch$default(createTransferV2Duxo.getLifecycleScope(), null, null, new CreateTransferV2Duxo$updateDataState$3$1(createTransferV2Duxo, state, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void onKeyPress(final KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        updateDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.onKeyPress$lambda$16(this.f$0, keyEvent, (CreateTransferV2DataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferV2DataState onKeyPress$lambda$16(CreateTransferV2Duxo createTransferV2Duxo, KeyEvent keyEvent, CreateTransferV2DataState updateDataState) {
        Intrinsics.checkNotNullParameter(updateDataState, "$this$updateDataState");
        DollarInputConsumer dollarInputConsumer = createTransferV2Duxo.inputKeyEventConsumer;
        BigDecimal amount = updateDataState.getAmount();
        char[] charArray = updateDataState.getInputChars().toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        InputKeyEventConsumer.InputState<BigDecimal> inputStateConsume = dollarInputConsumer.consume(new InputKeyEventConsumer.InputState(amount, charArray), keyEvent);
        return updateDataState.copy(((-1) & 1) != 0 ? updateDataState.sessionId : null, ((-1) & 2) != 0 ? updateDataState.direction : null, ((-1) & 4) != 0 ? updateDataState.entryPoint : null, ((-1) & 8) != 0 ? updateDataState.amount : inputStateConsume.component1(), ((-1) & 16) != 0 ? updateDataState.inputChars : StringsKt.concatToString(inputStateConsume.getInput()), ((-1) & 32) != 0 ? updateDataState.animateInput : true, ((-1) & 64) != 0 ? updateDataState.transferAccounts : null, ((-1) & 128) != 0 ? updateDataState.fromAccountId : null, ((-1) & 256) != 0 ? updateDataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? updateDataState.toAccountId : null, ((-1) & 1024) != 0 ? updateDataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? updateDataState.frequency : null, ((-1) & 4096) != 0 ? updateDataState.hideFrequency : false, ((-1) & 8192) != 0 ? updateDataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? updateDataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? updateDataState.mode : null, ((-1) & 65536) != 0 ? updateDataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? updateDataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? updateDataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? updateDataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? updateDataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? updateDataState.additionalDataState : null, ((-1) & 4194304) != 0 ? updateDataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? updateDataState.transferLimits : null, ((-1) & 16777216) != 0 ? updateDataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? updateDataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? updateDataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? updateDataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? updateDataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? updateDataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? updateDataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? updateDataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? updateDataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? updateDataState.iraDistribution : null, (16646143 & 4) != 0 ? updateDataState.iraDistributionFee : null, (16646143 & 8) != 0 ? updateDataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? updateDataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? updateDataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? updateDataState.iraContribution : null, (16646143 & 128) != 0 ? updateDataState.systemCalendarYear : null, (16646143 & 256) != 0 ? updateDataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? updateDataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? updateDataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? updateDataState.showDisclosure : false, (16646143 & 4096) != 0 ? updateDataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? updateDataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? updateDataState.promotionName : null, (16646143 & 32768) != 0 ? updateDataState.promotionType : null, (16646143 & 65536) != 0 ? updateDataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? updateDataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? updateDataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? updateDataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? updateDataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? updateDataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? updateDataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? updateDataState.isMemberPdtRevampV1 : false);
    }

    public final void onFrequencyChange(final ApiCreateTransferRequest2 frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        updateDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.onFrequencyChange$lambda$18(frequency, this, (CreateTransferV2DataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferV2DataState onFrequencyChange$lambda$18(ApiCreateTransferRequest2 apiCreateTransferRequest2, CreateTransferV2Duxo createTransferV2Duxo, CreateTransferV2DataState updateDataState) {
        Intrinsics.checkNotNullParameter(updateDataState, "$this$updateDataState");
        CreateTransferV2DataState createTransferV2DataStateCopy = updateDataState.copy(((-1) & 1) != 0 ? updateDataState.sessionId : null, ((-1) & 2) != 0 ? updateDataState.direction : null, ((-1) & 4) != 0 ? updateDataState.entryPoint : null, ((-1) & 8) != 0 ? updateDataState.amount : null, ((-1) & 16) != 0 ? updateDataState.inputChars : null, ((-1) & 32) != 0 ? updateDataState.animateInput : false, ((-1) & 64) != 0 ? updateDataState.transferAccounts : null, ((-1) & 128) != 0 ? updateDataState.fromAccountId : null, ((-1) & 256) != 0 ? updateDataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? updateDataState.toAccountId : null, ((-1) & 1024) != 0 ? updateDataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? updateDataState.frequency : apiCreateTransferRequest2, ((-1) & 4096) != 0 ? updateDataState.hideFrequency : false, ((-1) & 8192) != 0 ? updateDataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? updateDataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? updateDataState.mode : null, ((-1) & 65536) != 0 ? updateDataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? updateDataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? updateDataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? updateDataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? updateDataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? updateDataState.additionalDataState : null, ((-1) & 4194304) != 0 ? updateDataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? updateDataState.transferLimits : null, ((-1) & 16777216) != 0 ? updateDataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? updateDataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? updateDataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? updateDataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? updateDataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? updateDataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? updateDataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? updateDataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? updateDataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? updateDataState.iraDistribution : null, (16646143 & 4) != 0 ? updateDataState.iraDistributionFee : null, (16646143 & 8) != 0 ? updateDataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? updateDataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? updateDataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? updateDataState.iraContribution : null, (16646143 & 128) != 0 ? updateDataState.systemCalendarYear : null, (16646143 & 256) != 0 ? updateDataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? updateDataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? updateDataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? updateDataState.showDisclosure : false, (16646143 & 4096) != 0 ? updateDataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? updateDataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? updateDataState.promotionName : null, (16646143 & 32768) != 0 ? updateDataState.promotionType : null, (16646143 & 65536) != 0 ? updateDataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? updateDataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? updateDataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? updateDataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? updateDataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? updateDataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? updateDataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? updateDataState.isMemberPdtRevampV1 : false);
        TransferFrequencyBottomSheetFragment.logFrequencySelection(createTransferV2Duxo.eventLogger, createTransferV2DataStateCopy.getMaxTransferContext());
        return createTransferV2DataStateCopy;
    }

    public final void onContinueButtonClick() {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.onContinueButtonClick$lambda$20(this.f$0, (CreateTransferV2DataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onContinueButtonClick$lambda$20(final CreateTransferV2Duxo createTransferV2Duxo, CreateTransferV2DataState dataState) {
        UserInteractionEventData.Action action;
        final CreateTransferV2DataState createTransferV2DataState;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        EventLogger eventLogger = createTransferV2Duxo.eventLogger;
        CreateTransferViewState.Mode mode = dataState.getMode();
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[mode.ordinal()];
        if (i == 1) {
            action = UserInteractionEventData.Action.REVIEW_TRANSFER;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            action = UserInteractionEventData.Action.SUBMIT_TRANSFER;
        }
        UserInteractionEventData.Action action2 = action;
        EventLogger.DefaultImpls.logTap$default(eventLogger, action2, CreateTransferV2DataState.INSTANCE.getScreen$feature_transfers_externalRelease(), null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, dataState.getMaxTransferContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null), false, 44, null);
        int i2 = iArr[dataState.getMode().ordinal()];
        if (i2 == 1) {
            if (CreateTransferV2DataState2.getShouldValidateBeforeReview(dataState)) {
                createTransferV2DataState = dataState;
                ValidationFailure error = createTransferV2Duxo.transferValidator.getError(CreateTransferV2DataState2.transferValidationInput(createTransferV2DataState, CreateTransferV2StateProvider2.fromTransferAccount(dataState), CreateTransferV2StateProvider2.toTransferAccount(dataState), dataState.getSessionId(), ((TransferV2) INSTANCE.getArgs((HasSavedState) createTransferV2Duxo)).getTransferConfiguration(), createTransferV2Duxo.unifiedBalances, createTransferV2Duxo.portfolio, dataState.getIraContribution(), createTransferV2Duxo.marketHoursManager.areMarketsOpenExtended()), TransferValidator.Step.REVIEW);
                if (error != null) {
                    createTransferV2Duxo.submit(new CreateTransferV2Event.ValidationError(error));
                }
            } else {
                createTransferV2DataState = dataState;
            }
            createTransferV2Duxo.callReviewStateInfoAndDraw();
            createTransferV2Duxo.updateDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda38
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferV2Duxo.onContinueButtonClick$lambda$20$lambda$19(createTransferV2DataState, createTransferV2Duxo, (CreateTransferV2DataState) obj);
                }
            });
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            createTransfer$default(createTransferV2Duxo, false, false, null, 7, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferV2DataState onContinueButtonClick$lambda$20$lambda$19(CreateTransferV2DataState createTransferV2DataState, CreateTransferV2Duxo createTransferV2Duxo, CreateTransferV2DataState updateDataState) {
        Intrinsics.checkNotNullParameter(updateDataState, "$this$updateDataState");
        CreateTransferV2DataState createTransferV2DataStateMutateToEnterReviewMode = CreateTransferV2DataState2.mutateToEnterReviewMode(createTransferV2DataState, createTransferV2Duxo.transferConfiguration, createTransferV2Duxo.eventLogger);
        if (!CreateTransferV2DataState2.shouldLaunchIraDistributionWhenContinueToReview(createTransferV2DataStateMutateToEnterReviewMode)) {
            return createTransferV2DataStateMutateToEnterReviewMode;
        }
        TransferAccount transferAccountFromTransferAccount = CreateTransferV2StateProvider2.fromTransferAccount(createTransferV2DataStateMutateToEnterReviewMode);
        if (transferAccountFromTransferAccount != null) {
            createTransferV2Duxo.submit(new CreateTransferV2Event.IraDistributionQuestionnaire(new IraDistributionQuestionnaireLaunchMode.FullQuestionnaire(transferAccountFromTransferAccount)));
            return createTransferV2DataStateMutateToEnterReviewMode;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void onQuickSelectorChipClick(final QuickSelectorChip chip) {
        Intrinsics.checkNotNullParameter(chip, "chip");
        updateDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.onQuickSelectorChipClick$lambda$22(chip, (CreateTransferV2DataState) obj);
            }
        });
        onContinueButtonClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferV2DataState onQuickSelectorChipClick$lambda$22(QuickSelectorChip quickSelectorChip, CreateTransferV2DataState updateDataState) {
        Intrinsics.checkNotNullParameter(updateDataState, "$this$updateDataState");
        BigDecimal value = quickSelectorChip.getValue();
        NumberFormatter strikePriceFormat = Formats.getStrikePriceFormat();
        BigDecimal bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(quickSelectorChip.getValue());
        Intrinsics.checkNotNullExpressionValue(bigDecimalM822m, "stripTrailingZeros(...)");
        return updateDataState.copy(((-1) & 1) != 0 ? updateDataState.sessionId : null, ((-1) & 2) != 0 ? updateDataState.direction : null, ((-1) & 4) != 0 ? updateDataState.entryPoint : null, ((-1) & 8) != 0 ? updateDataState.amount : value, ((-1) & 16) != 0 ? updateDataState.inputChars : strikePriceFormat.format(bigDecimalM822m), ((-1) & 32) != 0 ? updateDataState.animateInput : true, ((-1) & 64) != 0 ? updateDataState.transferAccounts : null, ((-1) & 128) != 0 ? updateDataState.fromAccountId : null, ((-1) & 256) != 0 ? updateDataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? updateDataState.toAccountId : null, ((-1) & 1024) != 0 ? updateDataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? updateDataState.frequency : null, ((-1) & 4096) != 0 ? updateDataState.hideFrequency : false, ((-1) & 8192) != 0 ? updateDataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? updateDataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? updateDataState.mode : null, ((-1) & 65536) != 0 ? updateDataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? updateDataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? updateDataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? updateDataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? updateDataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? updateDataState.additionalDataState : null, ((-1) & 4194304) != 0 ? updateDataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? updateDataState.transferLimits : null, ((-1) & 16777216) != 0 ? updateDataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? updateDataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? updateDataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? updateDataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? updateDataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? updateDataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? updateDataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? updateDataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? updateDataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? updateDataState.iraDistribution : null, (16646143 & 4) != 0 ? updateDataState.iraDistributionFee : null, (16646143 & 8) != 0 ? updateDataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? updateDataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? updateDataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? updateDataState.iraContribution : null, (16646143 & 128) != 0 ? updateDataState.systemCalendarYear : null, (16646143 & 256) != 0 ? updateDataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? updateDataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? updateDataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? updateDataState.showDisclosure : false, (16646143 & 4096) != 0 ? updateDataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? updateDataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? updateDataState.promotionName : null, (16646143 & 32768) != 0 ? updateDataState.promotionType : null, (16646143 & 65536) != 0 ? updateDataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? updateDataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? updateDataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? updateDataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? updateDataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? updateDataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? updateDataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? updateDataState.isMemberPdtRevampV1 : false);
    }

    public final void switchToEditMode() {
        if (SetsKt.setOf((Object[]) new MAXTransferContext.EntryPoint[]{MAXTransferContext.EntryPoint.INCENTIVE_PRE_DEPOSIT, MAXTransferContext.EntryPoint.INCENTIVE_POST_DEPOSIT}).contains(((TransferV2) INSTANCE.getArgs((HasSavedState) this)).getTransferConfiguration().getEntryPoint())) {
            return;
        }
        applyMutation(new C311851(null));
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$switchToEditMode$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$switchToEditMode$1 */
    static final class C311851 extends ContinuationImpl7 implements Function2<CreateTransferV2DataState, Continuation<? super CreateTransferV2DataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C311851(Continuation<? super C311851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C311851 c311851 = new C311851(continuation);
            c311851.L$0 = obj;
            return c311851;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2DataState> continuation) {
            return ((C311851) create(createTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreateTransferV2DataState createTransferV2DataState = (CreateTransferV2DataState) this.L$0;
            return createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : CreateTransferV2DataState2.getShouldResetFromAccountWhenReturningToEdit(createTransferV2DataState) ? null : createTransferV2DataState.getFromAccountId(), ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : CreateTransferV2DataState2.getShouldResetToAccountWhenReturningToEdit(createTransferV2DataState) ? null : createTransferV2DataState.getToAccountId(), ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : CreateTransferViewState.Mode.EDIT, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : null, (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : null, (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : false, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : false);
        }
    }

    public final void onBackPressed() {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.onBackPressed$lambda$24(this.f$0, (CreateTransferV2DataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBackPressed$lambda$24(CreateTransferV2Duxo createTransferV2Duxo, CreateTransferV2DataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (CreateTransferV2StateProvider2.isContinueButtonLoading(dataState)) {
            return Unit.INSTANCE;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[dataState.getMode().ordinal()];
        if (i == 1) {
            createTransferV2Duxo.submit(CreateTransferV2Event.Finish.INSTANCE);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (dataState.getDepositIncentiveCancelDialog() != null) {
                createTransferV2Duxo.submit(new CreateTransferV2Event.ShowDepositIncentiveCancellationAlert(dataState.getDepositIncentiveCancelDialog()));
            } else {
                createTransferV2Duxo.updateDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreateTransferV2Duxo.onBackPressed$lambda$24$lambda$23((CreateTransferV2DataState) obj);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferV2DataState onBackPressed$lambda$24$lambda$23(CreateTransferV2DataState updateDataState) {
        Intrinsics.checkNotNullParameter(updateDataState, "$this$updateDataState");
        return updateDataState.copy(((-1) & 1) != 0 ? updateDataState.sessionId : null, ((-1) & 2) != 0 ? updateDataState.direction : null, ((-1) & 4) != 0 ? updateDataState.entryPoint : null, ((-1) & 8) != 0 ? updateDataState.amount : null, ((-1) & 16) != 0 ? updateDataState.inputChars : null, ((-1) & 32) != 0 ? updateDataState.animateInput : false, ((-1) & 64) != 0 ? updateDataState.transferAccounts : null, ((-1) & 128) != 0 ? updateDataState.fromAccountId : CreateTransferV2DataState2.getShouldResetFromAccountWhenReturningToEdit(updateDataState) ? null : updateDataState.getFromAccountId(), ((-1) & 256) != 0 ? updateDataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? updateDataState.toAccountId : CreateTransferV2DataState2.getShouldResetToAccountWhenReturningToEdit(updateDataState) ? null : updateDataState.getToAccountId(), ((-1) & 1024) != 0 ? updateDataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? updateDataState.frequency : null, ((-1) & 4096) != 0 ? updateDataState.hideFrequency : false, ((-1) & 8192) != 0 ? updateDataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? updateDataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? updateDataState.mode : CreateTransferViewState.Mode.EDIT, ((-1) & 65536) != 0 ? updateDataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? updateDataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? updateDataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? updateDataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? updateDataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? updateDataState.additionalDataState : null, ((-1) & 4194304) != 0 ? updateDataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? updateDataState.transferLimits : null, ((-1) & 16777216) != 0 ? updateDataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? updateDataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? updateDataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? updateDataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? updateDataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? updateDataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? updateDataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? updateDataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? updateDataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? updateDataState.iraDistribution : null, (16646143 & 4) != 0 ? updateDataState.iraDistributionFee : null, (16646143 & 8) != 0 ? updateDataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? updateDataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? updateDataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? updateDataState.iraContribution : CreateTransferV2DataState2.getShouldResetToAccountWhenReturningToEdit(updateDataState) ? null : updateDataState.getIraContribution(), (16646143 & 128) != 0 ? updateDataState.systemCalendarYear : null, (16646143 & 256) != 0 ? updateDataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? updateDataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? updateDataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? updateDataState.showDisclosure : false, (16646143 & 4096) != 0 ? updateDataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? updateDataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? updateDataState.promotionName : null, (16646143 & 32768) != 0 ? updateDataState.promotionType : null, (16646143 & 65536) != 0 ? updateDataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? updateDataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? updateDataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? updateDataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? updateDataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? updateDataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? updateDataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? updateDataState.isMemberPdtRevampV1 : false);
    }

    public final void onRowClick(final CreateTransferV2DataRowState.OnClickAction rowOnClickAction) {
        if (rowOnClickAction instanceof CreateTransferV2DataRowState.OnClickAction.AccountSelection) {
            withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferV2Duxo.onRowClick$lambda$25(this.f$0, rowOnClickAction, (CreateTransferV2DataState) obj);
                }
            });
            return;
        }
        if (rowOnClickAction instanceof CreateTransferV2DataRowState.OnClickAction.EditIraContributionType) {
            CreateTransferV2DataRowState.OnClickAction.EditIraContributionType editIraContributionType = (CreateTransferV2DataRowState.OnClickAction.EditIraContributionType) rowOnClickAction;
            submit(new CreateTransferV2Event.IraContributionQuestionnaire(new IraContributionQuestionnaireLaunchMode.EditContributionType(editIraContributionType.getTransferAccount(), editIraContributionType.getCurrentContributionType())));
            return;
        }
        if (rowOnClickAction instanceof CreateTransferV2DataRowState.OnClickAction.EditIraContributionTaxYear) {
            submit(new CreateTransferV2Event.IraContributionQuestionnaire(new IraContributionQuestionnaireLaunchMode.EditTaxYear(IraContributionQuestionnaireLaunchMode.SelectionStyle.NAVIGATION_ROW)));
            return;
        }
        if (rowOnClickAction instanceof CreateTransferV2DataRowState.OnClickAction.EditIraDistributionType) {
            submit(new CreateTransferV2Event.EditIraDistributionType(new IraDistributionQuestionnaireLaunchMode.EditDistributionType(((CreateTransferV2DataRowState.OnClickAction.EditIraDistributionType) rowOnClickAction).getTransferAccount())));
            return;
        }
        if (Intrinsics.areEqual(rowOnClickAction, CreateTransferV2DataRowState.OnClickAction.EditIraDistributionTaxWithholding.INSTANCE)) {
            withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferV2Duxo.onRowClick$lambda$26(this.f$0, (CreateTransferV2DataState) obj);
                }
            });
        } else if (rowOnClickAction instanceof CreateTransferV2DataRowState.OnClickAction.FrequencySelection) {
            withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferV2Duxo.onRowClick$lambda$27(this.f$0, (CreateTransferV2DataState) obj);
                }
            });
        } else if (rowOnClickAction != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onRowClick$lambda$25(CreateTransferV2Duxo createTransferV2Duxo, CreateTransferV2DataRowState.OnClickAction onClickAction, CreateTransferV2DataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        TransferAccountBottomSheetLogger.logTransferAccountSelectionRowTap(createTransferV2Duxo.eventLogger, MicrogramConverters2.toMicrogramTransferAccountDirection(((CreateTransferV2DataRowState.OnClickAction.AccountSelection) onClickAction).getDirection()), state.getMaxTransferContext());
        BuildersKt__Builders_commonKt.launch$default(createTransferV2Duxo.getLifecycleScope(), null, null, new CreateTransferV2Duxo$onRowClick$1$1(createTransferV2Duxo, onClickAction, state, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onRowClick$lambda$26(CreateTransferV2Duxo createTransferV2Duxo, CreateTransferV2DataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        CreateTransferDuxo.CalculatedTaxWithholdingResult iraCalculatedTaxWithholdingResult = state.getIraCalculatedTaxWithholdingResult();
        Intrinsics.checkNotNull(iraCalculatedTaxWithholdingResult, "null cannot be cast to non-null type com.robinhood.android.transfers.ui.max.CreateTransferDuxo.CalculatedTaxWithholdingResult.Success");
        CreateTransferDuxo.CalculatedTaxWithholdingResult.Success success = (CreateTransferDuxo.CalculatedTaxWithholdingResult.Success) iraCalculatedTaxWithholdingResult;
        createTransferV2Duxo.submit(new CreateTransferV2Event.EditIraDistributionTaxWithholding(new IraDistributionTaxWithholdingBottomSheetFragment.Args(success.getCalculatedTaxWithholding(), success.getUseManagedAccountDisplay())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onRowClick$lambda$27(CreateTransferV2Duxo createTransferV2Duxo, CreateTransferV2DataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        createTransferV2Duxo.submit(new CreateTransferV2Event.FrequencySelection(new TransferFrequencyBottomSheetFragmentKey(createTransferV2Duxo.transferConfiguration instanceof TransferConfiguration.RadHook, state.getFrequency(), createTransferV2Duxo.transferConfiguration.getEntryPoint())));
        return Unit.INSTANCE;
    }

    public final void onDropdownChipClick() {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.onDropdownChipClick$lambda$28(this.f$0, (CreateTransferV2DataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDropdownChipClick$lambda$28(CreateTransferV2Duxo createTransferV2Duxo, CreateTransferV2DataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        BuildersKt__Builders_commonKt.launch$default(createTransferV2Duxo.getLifecycleScope(), null, null, new CreateTransferV2Duxo$onDropdownChipClick$1$1(createTransferV2Duxo, state, null), 3, null);
        return Unit.INSTANCE;
    }

    public final void onAmountFooterClick() {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.onAmountFooterClick$lambda$30(this.f$0, (CreateTransferV2DataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAmountFooterClick$lambda$30(CreateTransferV2Duxo createTransferV2Duxo, CreateTransferV2DataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        CreateTransferDuxo.CalculatedTaxWithholdingResult iraCalculatedTaxWithholdingResult = state.getIraCalculatedTaxWithholdingResult();
        CreateTransferDuxo.CalculatedTaxWithholdingResult.Success success = iraCalculatedTaxWithholdingResult instanceof CreateTransferDuxo.CalculatedTaxWithholdingResult.Success ? (CreateTransferDuxo.CalculatedTaxWithholdingResult.Success) iraCalculatedTaxWithholdingResult : null;
        if (success != null) {
            createTransferV2Duxo.submit(new CreateTransferV2Event.EditIraDistributionTaxWithholding(new IraDistributionTaxWithholdingBottomSheetFragment.Args(success.getCalculatedTaxWithholding(), success.getUseManagedAccountDisplay())));
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void onFromAccountSelected$default(CreateTransferV2Duxo createTransferV2Duxo, String str, IraDistributionQuestionnaireResult.IraDistribution iraDistribution, int i, Object obj) {
        if ((i & 2) != 0) {
            iraDistribution = null;
        }
        createTransferV2Duxo.onFromAccountSelected(str, iraDistribution);
    }

    public final void onFromAccountSelected(final String transferAccountId, final IraDistributionQuestionnaireResult.IraDistribution iraDistribution) {
        Intrinsics.checkNotNullParameter(transferAccountId, "transferAccountId");
        updateDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.onFromAccountSelected$lambda$31(transferAccountId, iraDistribution, (CreateTransferV2DataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferV2DataState onFromAccountSelected$lambda$31(String str, IraDistributionQuestionnaireResult.IraDistribution iraDistribution, CreateTransferV2DataState updateDataState) {
        Intrinsics.checkNotNullParameter(updateDataState, "$this$updateDataState");
        String toAccountId = Intrinsics.areEqual(str, updateDataState.getToAccountId()) ? null : updateDataState.getToAccountId();
        TransferAccount transferAccount = updateDataState.getTransferAccounts().get(str);
        return updateDataState.copy(((-1) & 1) != 0 ? updateDataState.sessionId : null, ((-1) & 2) != 0 ? updateDataState.direction : null, ((-1) & 4) != 0 ? updateDataState.entryPoint : null, ((-1) & 8) != 0 ? updateDataState.amount : null, ((-1) & 16) != 0 ? updateDataState.inputChars : null, ((-1) & 32) != 0 ? updateDataState.animateInput : false, ((-1) & 64) != 0 ? updateDataState.transferAccounts : null, ((-1) & 128) != 0 ? updateDataState.fromAccountId : str, ((-1) & 256) != 0 ? updateDataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? updateDataState.toAccountId : toAccountId, ((-1) & 1024) != 0 ? updateDataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? updateDataState.frequency : null, ((-1) & 4096) != 0 ? updateDataState.hideFrequency : false, ((-1) & 8192) != 0 ? updateDataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? updateDataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? updateDataState.mode : null, ((-1) & 65536) != 0 ? updateDataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? updateDataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? updateDataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? updateDataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? updateDataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? updateDataState.additionalDataState : null, ((-1) & 4194304) != 0 ? updateDataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? updateDataState.transferLimits : null, ((-1) & 16777216) != 0 ? updateDataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? updateDataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? updateDataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? updateDataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? updateDataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? updateDataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? updateDataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? updateDataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? updateDataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? updateDataState.iraDistribution : iraDistribution, (16646143 & 4) != 0 ? updateDataState.iraDistributionFee : null, (16646143 & 8) != 0 ? updateDataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? updateDataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? updateDataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? updateDataState.iraContribution : (transferAccount == null || !transferAccount.isIra()) ? updateDataState.getIraContribution() : null, (16646143 & 128) != 0 ? updateDataState.systemCalendarYear : null, (16646143 & 256) != 0 ? updateDataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? updateDataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? updateDataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? updateDataState.showDisclosure : false, (16646143 & 4096) != 0 ? updateDataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? updateDataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? updateDataState.promotionName : null, (16646143 & 32768) != 0 ? updateDataState.promotionType : null, (16646143 & 65536) != 0 ? updateDataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? updateDataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? updateDataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? updateDataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? updateDataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? updateDataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? updateDataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? updateDataState.isMemberPdtRevampV1 : false);
    }

    public static /* synthetic */ void onToAccountSelected$default(CreateTransferV2Duxo createTransferV2Duxo, String str, IraContributionQuestionnaireResult.IraContribution iraContribution, int i, Object obj) {
        if ((i & 2) != 0) {
            iraContribution = null;
        }
        createTransferV2Duxo.onToAccountSelected(str, iraContribution);
    }

    public final void onToAccountSelected(final String transferAccountId, final IraContributionQuestionnaireResult.IraContribution iraContribution) {
        Intrinsics.checkNotNullParameter(transferAccountId, "transferAccountId");
        updateDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.onToAccountSelected$lambda$32(transferAccountId, iraContribution, (CreateTransferV2DataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferV2DataState onToAccountSelected$lambda$32(String str, IraContributionQuestionnaireResult.IraContribution iraContribution, CreateTransferV2DataState updateDataState) {
        ApiCreateTransferRequest2 adjustedFrequency;
        Intrinsics.checkNotNullParameter(updateDataState, "$this$updateDataState");
        String fromAccountId = Intrinsics.areEqual(str, updateDataState.getFromAccountId()) ? null : updateDataState.getFromAccountId();
        if (iraContribution != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[iraContribution.getIraContributionType().ordinal()];
            if (i == 1) {
                adjustedFrequency = CreateTransferV2DataState2.getAdjustedFrequency(updateDataState);
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                adjustedFrequency = ApiCreateTransferRequest2.ONCE;
            }
        } else {
            adjustedFrequency = CreateTransferV2DataState2.getAdjustedFrequency(updateDataState);
        }
        ApiCreateTransferRequest2 apiCreateTransferRequest2 = adjustedFrequency;
        TransferAccount transferAccount = updateDataState.getTransferAccounts().get(str);
        return updateDataState.copy(((-1) & 1) != 0 ? updateDataState.sessionId : null, ((-1) & 2) != 0 ? updateDataState.direction : null, ((-1) & 4) != 0 ? updateDataState.entryPoint : null, ((-1) & 8) != 0 ? updateDataState.amount : null, ((-1) & 16) != 0 ? updateDataState.inputChars : null, ((-1) & 32) != 0 ? updateDataState.animateInput : false, ((-1) & 64) != 0 ? updateDataState.transferAccounts : null, ((-1) & 128) != 0 ? updateDataState.fromAccountId : fromAccountId, ((-1) & 256) != 0 ? updateDataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? updateDataState.toAccountId : str, ((-1) & 1024) != 0 ? updateDataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? updateDataState.frequency : apiCreateTransferRequest2, ((-1) & 4096) != 0 ? updateDataState.hideFrequency : false, ((-1) & 8192) != 0 ? updateDataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? updateDataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? updateDataState.mode : null, ((-1) & 65536) != 0 ? updateDataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? updateDataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? updateDataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? updateDataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? updateDataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? updateDataState.additionalDataState : null, ((-1) & 4194304) != 0 ? updateDataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? updateDataState.transferLimits : null, ((-1) & 16777216) != 0 ? updateDataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? updateDataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? updateDataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? updateDataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? updateDataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? updateDataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? updateDataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? updateDataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? updateDataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? updateDataState.iraDistribution : (transferAccount == null || !transferAccount.isIra()) ? updateDataState.getIraDistribution() : null, (16646143 & 4) != 0 ? updateDataState.iraDistributionFee : null, (16646143 & 8) != 0 ? updateDataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? updateDataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? updateDataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? updateDataState.iraContribution : iraContribution, (16646143 & 128) != 0 ? updateDataState.systemCalendarYear : null, (16646143 & 256) != 0 ? updateDataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? updateDataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? updateDataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? updateDataState.showDisclosure : false, (16646143 & 4096) != 0 ? updateDataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? updateDataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? updateDataState.promotionName : null, (16646143 & 32768) != 0 ? updateDataState.promotionType : null, (16646143 & 65536) != 0 ? updateDataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? updateDataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? updateDataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? updateDataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? updateDataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? updateDataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? updateDataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? updateDataState.isMemberPdtRevampV1 : false);
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onIraDistributionTypeUpdate$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onIraDistributionTypeUpdate$1 */
    static final class C311741 extends ContinuationImpl7 implements Function2<CreateTransferV2DataState, Continuation<? super CreateTransferV2DataState>, Object> {
        final /* synthetic */ IraDistributionType $updatedDistributionType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C311741(IraDistributionType iraDistributionType, Continuation<? super C311741> continuation) {
            super(2, continuation);
            this.$updatedDistributionType = iraDistributionType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C311741 c311741 = new C311741(this.$updatedDistributionType, continuation);
            c311741.L$0 = obj;
            return c311741;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2DataState> continuation) {
            return ((C311741) create(createTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreateTransferV2DataState createTransferV2DataState = (CreateTransferV2DataState) this.L$0;
            IraDistributionQuestionnaireResult.IraDistribution iraDistribution = createTransferV2DataState.getIraDistribution();
            if ((iraDistribution != null ? iraDistribution.getDistributionType() : null) == this.$updatedDistributionType) {
                return createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : null, ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : null, ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : null, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : IraDistributionQuestionnaireResult.IraDistribution.copy$default(createTransferV2DataState.getIraDistribution(), null, this.$updatedDistributionType, 1, null), (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : null, (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : false, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : false);
            }
            IraDistributionQuestionnaireResult.IraDistribution iraDistribution2 = createTransferV2DataState.getIraDistribution();
            return createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : null, ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : null, ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : null, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : iraDistribution2 != null ? IraDistributionQuestionnaireResult.IraDistribution.copy$default(iraDistribution2, null, this.$updatedDistributionType, 1, null) : null, (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : null, (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : false, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : false);
        }
    }

    public final void onIraDistributionTypeUpdate(IraDistributionType updatedDistributionType) {
        Intrinsics.checkNotNullParameter(updatedDistributionType, "updatedDistributionType");
        applyMutation(new C311741(updatedDistributionType, null));
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$overrideIraDistributionTaxWithholding$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$overrideIraDistributionTaxWithholding$1 */
    static final class C311821 extends ContinuationImpl7 implements Function2<CreateTransferV2DataState, Continuation<? super CreateTransferV2DataState>, Object> {
        final /* synthetic */ BigDecimal $iraFederalWithholdingPercentOverride;
        final /* synthetic */ BigDecimal $iraStateWithholdingPercentOverride;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C311821(BigDecimal bigDecimal, BigDecimal bigDecimal2, Continuation<? super C311821> continuation) {
            super(2, continuation);
            this.$iraFederalWithholdingPercentOverride = bigDecimal;
            this.$iraStateWithholdingPercentOverride = bigDecimal2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C311821 c311821 = new C311821(this.$iraFederalWithholdingPercentOverride, this.$iraStateWithholdingPercentOverride, continuation);
            c311821.L$0 = obj;
            return c311821;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2DataState> continuation) {
            return ((C311821) create(createTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreateTransferV2DataState createTransferV2DataState = (CreateTransferV2DataState) this.L$0;
            return createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : null, ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : null, ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : null, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : null, (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : this.$iraFederalWithholdingPercentOverride, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : this.$iraStateWithholdingPercentOverride, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : null, (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : false, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : false);
        }
    }

    public final void overrideIraDistributionTaxWithholding(BigDecimal iraFederalWithholdingPercentOverride, BigDecimal iraStateWithholdingPercentOverride) {
        Intrinsics.checkNotNullParameter(iraFederalWithholdingPercentOverride, "iraFederalWithholdingPercentOverride");
        Intrinsics.checkNotNullParameter(iraStateWithholdingPercentOverride, "iraStateWithholdingPercentOverride");
        applyMutation(new C311821(iraFederalWithholdingPercentOverride, iraStateWithholdingPercentOverride, null));
    }

    public final void onAchTransferOptionSelected(final AchTransferOption achTransferOption) {
        Intrinsics.checkNotNullParameter(achTransferOption, "achTransferOption");
        updateDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.onAchTransferOptionSelected$lambda$33(achTransferOption, (CreateTransferV2DataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferV2DataState onAchTransferOptionSelected$lambda$33(AchTransferOption achTransferOption, CreateTransferV2DataState updateDataState) {
        Intrinsics.checkNotNullParameter(updateDataState, "$this$updateDataState");
        if (CreateTransferV2StateProvider2.isContinueButtonLoading(updateDataState)) {
            return updateDataState;
        }
        return updateDataState.copy(((-1) & 1) != 0 ? updateDataState.sessionId : null, ((-1) & 2) != 0 ? updateDataState.direction : null, ((-1) & 4) != 0 ? updateDataState.entryPoint : null, ((-1) & 8) != 0 ? updateDataState.amount : null, ((-1) & 16) != 0 ? updateDataState.inputChars : null, ((-1) & 32) != 0 ? updateDataState.animateInput : false, ((-1) & 64) != 0 ? updateDataState.transferAccounts : null, ((-1) & 128) != 0 ? updateDataState.fromAccountId : null, ((-1) & 256) != 0 ? updateDataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? updateDataState.toAccountId : null, ((-1) & 1024) != 0 ? updateDataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? updateDataState.frequency : null, ((-1) & 4096) != 0 ? updateDataState.hideFrequency : false, ((-1) & 8192) != 0 ? updateDataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? updateDataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? updateDataState.mode : null, ((-1) & 65536) != 0 ? updateDataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? updateDataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? updateDataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? updateDataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? updateDataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? updateDataState.additionalDataState : null, ((-1) & 4194304) != 0 ? updateDataState.selectedAchTransferOption : achTransferOption, ((-1) & 8388608) != 0 ? updateDataState.transferLimits : null, ((-1) & 16777216) != 0 ? updateDataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? updateDataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? updateDataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? updateDataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? updateDataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? updateDataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? updateDataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? updateDataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? updateDataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? updateDataState.iraDistribution : null, (16646143 & 4) != 0 ? updateDataState.iraDistributionFee : null, (16646143 & 8) != 0 ? updateDataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? updateDataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? updateDataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? updateDataState.iraContribution : null, (16646143 & 128) != 0 ? updateDataState.systemCalendarYear : null, (16646143 & 256) != 0 ? updateDataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? updateDataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? updateDataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? updateDataState.showDisclosure : false, (16646143 & 4096) != 0 ? updateDataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? updateDataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? updateDataState.promotionName : null, (16646143 & 32768) != 0 ? updateDataState.promotionType : null, (16646143 & 65536) != 0 ? updateDataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? updateDataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? updateDataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? updateDataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? updateDataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? updateDataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? updateDataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? updateDataState.isMemberPdtRevampV1 : false);
    }

    public static /* synthetic */ void createTransfer$default(CreateTransferV2Duxo createTransferV2Duxo, boolean z, boolean z2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        createTransferV2Duxo.createTransfer(z, z2, bool);
    }

    public final void createTransfer(final boolean continuingTransferAfterValidation, final boolean resubmissionAfter3DS, final Boolean clawbackGracePeriodOptIn) {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.createTransfer$lambda$34(this.f$0, clawbackGracePeriodOptIn, continuingTransferAfterValidation, resubmissionAfter3DS, (CreateTransferV2DataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createTransfer$lambda$34(CreateTransferV2Duxo createTransferV2Duxo, Boolean bool, boolean z, boolean z2, CreateTransferV2DataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        CreateTransferV2Event.ValidationError validationErrorValidateForSubmission = createTransferV2Duxo.validateForSubmission(dataState, ((TransferV2) INSTANCE.getArgs((HasSavedState) createTransferV2Duxo)).getTransferConfiguration());
        if (validationErrorValidateForSubmission == null) {
            BuildersKt__Builders_commonKt.launch$default(createTransferV2Duxo.getLifecycleScope(), null, null, new CreateTransferV2Duxo$createTransfer$1$1(createTransferV2Duxo, dataState, bool, z, z2, null), 3, null);
            return Unit.INSTANCE;
        }
        createTransferV2Duxo.submit(validationErrorValidateForSubmission);
        return Unit.INSTANCE;
    }

    public final void invalidateCurrentTransfer() {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.invalidateCurrentTransfer$lambda$35(this.f$0, (CreateTransferV2DataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invalidateCurrentTransfer$lambda$35(CreateTransferV2Duxo createTransferV2Duxo, CreateTransferV2DataState ds) {
        Intrinsics.checkNotNullParameter(ds, "ds");
        createTransferV2Duxo.transferFactory.invalidatePreviousState(ToTransferData.toTransferData$default(ds, null, 1, null));
        return Unit.INSTANCE;
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onVerificationResultNotApproved$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onVerificationResultNotApproved$1 */
    static final class C311781 extends ContinuationImpl7 implements Function2<CreateTransferV2DataState, Continuation<? super CreateTransferV2DataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C311781(Continuation<? super C311781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C311781 c311781 = new C311781(continuation);
            c311781.L$0 = obj;
            return c311781;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2DataState> continuation) {
            return ((C311781) create(createTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreateTransferV2DataState createTransferV2DataState = (CreateTransferV2DataState) this.L$0;
            return createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : null, ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : null, ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : null, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : null, (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : null, (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : false, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : false);
        }
    }

    public final void onVerificationResultNotApproved() {
        applyMutation(new C311781(null));
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$overrideNoEnokiAlert$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$overrideNoEnokiAlert$1 */
    static final class C311831 extends ContinuationImpl7 implements Function2<CreateTransferV2DataState, Continuation<? super CreateTransferV2DataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C311831(Continuation<? super C311831> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C311831 c311831 = new C311831(continuation);
            c311831.L$0 = obj;
            return c311831;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2DataState> continuation) {
            return ((C311831) create(createTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreateTransferV2DataState createTransferV2DataState = (CreateTransferV2DataState) this.L$0;
            return createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : null, ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : null, ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : null, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : true, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : null, (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : null, (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : false, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : false);
        }
    }

    public final void overrideNoEnokiAlert() {
        applyMutation(new C311831(null));
        createTransfer$default(this, false, false, null, 7, null);
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$overrideDistributionEnokiRemovalAlert$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$overrideDistributionEnokiRemovalAlert$1 */
    static final class C311791 extends ContinuationImpl7 implements Function2<CreateTransferV2DataState, Continuation<? super CreateTransferV2DataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C311791(Continuation<? super C311791> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C311791 c311791 = new C311791(continuation);
            c311791.L$0 = obj;
            return c311791;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2DataState> continuation) {
            return ((C311791) create(createTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreateTransferV2DataState createTransferV2DataState = (CreateTransferV2DataState) this.L$0;
            return createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : null, ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : null, ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : null, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : null, (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : null, (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : true, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : false, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : false);
        }
    }

    public final void overrideDistributionEnokiRemovalAlert() {
        applyMutation(new C311791(null));
        createTransfer$default(this, false, false, null, 7, null);
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$overrideDistributionPreReviewAlert$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$overrideDistributionPreReviewAlert$1 */
    static final class C311801 extends ContinuationImpl7 implements Function2<CreateTransferV2DataState, Continuation<? super CreateTransferV2DataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C311801(Continuation<? super C311801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C311801 c311801 = new C311801(continuation);
            c311801.L$0 = obj;
            return c311801;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2DataState> continuation) {
            return ((C311801) create(createTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreateTransferV2DataState createTransferV2DataState = (CreateTransferV2DataState) this.L$0;
            return createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : null, ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : null, ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : null, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : null, (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : null, (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : true, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : false, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : false);
        }
    }

    public final void overrideDistributionPreReviewAlert() {
        applyMutation(new C311801(null));
        createTransfer$default(this, false, false, null, 7, null);
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$overrideGoldApyMinDepositAlert$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$overrideGoldApyMinDepositAlert$1 */
    static final class C311811 extends ContinuationImpl7 implements Function2<CreateTransferV2DataState, Continuation<? super CreateTransferV2DataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C311811(Continuation<? super C311811> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C311811 c311811 = new C311811(continuation);
            c311811.L$0 = obj;
            return c311811;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2DataState> continuation) {
            return ((C311811) create(createTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreateTransferV2DataState createTransferV2DataState = (CreateTransferV2DataState) this.L$0;
            return createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : null, ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : null, ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : null, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : null, (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : null, (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : true, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : false, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : false);
        }
    }

    public final void overrideGoldApyMinDepositAlert() {
        applyMutation(new C311811(null));
        createTransfer$default(this, false, false, null, 7, null);
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$setTaxYear$1", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$setTaxYear$1 */
    static final class C311841 extends ContinuationImpl7 implements Function2<CreateTransferV2DataState, Continuation<? super CreateTransferV2DataState>, Object> {
        final /* synthetic */ IraContributionQuestionnaireResult.UpdateTaxYear $result;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C311841(IraContributionQuestionnaireResult.UpdateTaxYear updateTaxYear, Continuation<? super C311841> continuation) {
            super(2, continuation);
            this.$result = updateTaxYear;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C311841 c311841 = new C311841(this.$result, continuation);
            c311841.L$0 = obj;
            return c311841;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2DataState> continuation) {
            return ((C311841) create(createTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            CreateTransferV2DataState createTransferV2DataStateCopy;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreateTransferV2DataState createTransferV2DataState = (CreateTransferV2DataState) this.L$0;
            IraContributionQuestionnaireResult.IraContribution iraContribution = createTransferV2DataState.getIraContribution();
            if (iraContribution != null) {
                IraContributionQuestionnaireResult.UpdateTaxYear updateTaxYear = this.$result;
                if (iraContribution instanceof IraContributionQuestionnaireResult.IraContribution.IndirectRollover) {
                    throw new IllegalStateException("Setting tax year on indirect rollover");
                }
                if (!(iraContribution instanceof IraContributionQuestionnaireResult.IraContribution.OneTimeContribution)) {
                    throw new NoWhenBranchMatchedException();
                }
                IraContributionQuestionnaireResult.IraContribution.OneTimeContribution oneTimeContribution = (IraContributionQuestionnaireResult.IraContribution.OneTimeContribution) iraContribution;
                Year taxYear = updateTaxYear.getTaxYear();
                if (taxYear == null) {
                    createTransferV2DataStateCopy = createTransferV2DataState;
                } else {
                    createTransferV2DataStateCopy = createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : null, ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : null, ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : null, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : null, (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : IraContributionQuestionnaireResult.IraContribution.OneTimeContribution.copy$default(oneTimeContribution, null, taxYear, updateTaxYear.getContributionLimit(), 1, null), (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : false, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : false);
                }
                if (createTransferV2DataStateCopy != null) {
                    return createTransferV2DataStateCopy;
                }
            }
            return createTransferV2DataState;
        }
    }

    public final void setTaxYear(IraContributionQuestionnaireResult.UpdateTaxYear result) {
        Intrinsics.checkNotNullParameter(result, "result");
        applyMutation(new C311841(result, null));
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object onBottomSheetAppear(final TransferAccountDirection transferAccountDirection, Continuation<? super Unit> continuation) {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.onBottomSheetAppear$lambda$36(this.f$0, transferAccountDirection, (CreateTransferV2DataState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBottomSheetAppear$lambda$36(CreateTransferV2Duxo createTransferV2Duxo, TransferAccountDirection transferAccountDirection, CreateTransferV2DataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        TransferAccountBottomSheetLogger.logTransferAccountBottomSheetAppear(createTransferV2Duxo.eventLogger, transferAccountDirection, dataState.getMaxTransferContext());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object onAccountRowAppear(final String str, TransferAccountType transferAccountType, final TransferAccountDirection transferAccountDirection, Continuation<? super Unit> continuation) {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.onAccountRowAppear$lambda$37(this.f$0, str, transferAccountDirection, (CreateTransferV2DataState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAccountRowAppear$lambda$37(CreateTransferV2Duxo createTransferV2Duxo, String str, TransferAccountDirection transferAccountDirection, CreateTransferV2DataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        EventLogger eventLogger = createTransferV2Duxo.eventLogger;
        TransferAccount transferAccount = dataState.getTransferAccounts().get(str);
        if (transferAccount == null) {
            return Unit.INSTANCE;
        }
        TransferAccountBottomSheetLogger.logTransferAccountRowAppear(eventLogger, transferAccount, transferAccountDirection, dataState.getMaxTransferContext());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object accountSelected(final String str, final TransferAccountDirection transferAccountDirection, Continuation<? super Unit> continuation) {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.accountSelected$lambda$38(this.f$0, str, transferAccountDirection, (CreateTransferV2DataState) obj);
            }
        });
        int i = WhenMappings.$EnumSwitchMapping$2[transferAccountDirection.ordinal()];
        if (i == 1) {
            onFromAccountSelected$default(this, str, null, 2, null);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            onToAccountSelected$default(this, str, null, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit accountSelected$lambda$38(CreateTransferV2Duxo createTransferV2Duxo, String str, TransferAccountDirection transferAccountDirection, CreateTransferV2DataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        EventLogger eventLogger = createTransferV2Duxo.eventLogger;
        TransferAccount transferAccount = dataState.getTransferAccounts().get(str);
        if (transferAccount == null) {
            return Unit.INSTANCE;
        }
        TransferAccountBottomSheetLogger.logTransferAccountRowTap(eventLogger, transferAccount, transferAccountDirection, dataState.getMaxTransferContext());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object launchIraQuestionnaire(final IraTransferType iraTransferType, final String str, final String str2, Continuation<? super Unit> continuation) {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.launchIraQuestionnaire$lambda$39(this.f$0, str2, iraTransferType, str, (CreateTransferV2DataState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchIraQuestionnaire$lambda$39(CreateTransferV2Duxo createTransferV2Duxo, String str, IraTransferType iraTransferType, String str2, CreateTransferV2DataState dataState) {
        TransferAccountDirection transferAccountDirection;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        EventLogger eventLogger = createTransferV2Duxo.eventLogger;
        TransferAccount transferAccount = dataState.getTransferAccounts().get(str);
        if (transferAccount == null) {
            return Unit.INSTANCE;
        }
        int[] iArr = WhenMappings.$EnumSwitchMapping$3;
        int i = iArr[iraTransferType.ordinal()];
        if (i == 1) {
            transferAccountDirection = TransferAccountDirection.SINK;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            transferAccountDirection = TransferAccountDirection.SOURCE;
        }
        TransferAccountBottomSheetLogger.logTransferAccountRowTap(eventLogger, transferAccount, transferAccountDirection, dataState.getMaxTransferContext());
        createTransferV2Duxo.applyMutation(new CreateTransferV2Duxo$launchIraQuestionnaire$2$1(dataState, str, null));
        TransferAccount transferAccount2 = dataState.getTransferAccounts().get(str2);
        Intrinsics.checkNotNull(transferAccount2);
        TransferAccount transferAccount3 = transferAccount2;
        int i2 = iArr[iraTransferType.ordinal()];
        if (i2 == 1) {
            createTransferV2Duxo.submit(new CreateTransferV2Event.IraContributionQuestionnaire(new IraContributionQuestionnaireLaunchMode.FullQuestionnaire(transferAccount3)));
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            createTransferV2Duxo.submit(new CreateTransferV2Event.IraDistributionQuestionnaire(new IraDistributionQuestionnaireLaunchMode.FullQuestionnaire(transferAccount3)));
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object launchIraMatchInfo(Continuation<? super Unit> continuation) {
        submit(new CreateTransferV2Event.ShowFragment(new RetirementEnokiInfo(null, 1, null)));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object launchDebitCardLinking(Continuation<? super Unit> continuation) {
        submit(new CreateTransferV2Event.StartActivityForResult(new LegacyIntentKey.DebitCardLinking(new DebitCardLinkingConfiguration.Standard(true, false, PaymentLinkingContext.EntryPoint.TRANSFER_ACCOUNT_SELECTION, null, 8, null)), CreateTransferV2Fragment.DEBIT_CARD_LINKING_REQUEST_CODE));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object addNewAccount(Continuation<? super Unit> continuation) {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.addNewAccount$lambda$40(this.f$0, (CreateTransferV2DataState) obj);
            }
        });
        submit(CreateTransferV2Event.AddNewAccount.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addNewAccount$lambda$40(CreateTransferV2Duxo createTransferV2Duxo, CreateTransferV2DataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        TransferAccountBottomSheetLogger.logGeneralRowTap(createTransferV2Duxo.eventLogger, dataState.getMaxTransferContext(), "add_account");
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.transfers.accounts.contracts.AccountSelectionResolver
    public Object sendWireTransfer(Continuation<? super Unit> continuation) {
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.sendWireTransfer$lambda$41(this.f$0, (CreateTransferV2DataState) obj);
            }
        });
        submit(CreateTransferV2Event.SendWireTransfer.INSTANCE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit sendWireTransfer$lambda$41(CreateTransferV2Duxo createTransferV2Duxo, CreateTransferV2DataState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        TransferAccountBottomSheetLogger.logGeneralRowTap(createTransferV2Duxo.eventLogger, dataState.getMaxTransferContext(), "send_wire");
        return Unit.INSTANCE;
    }

    public final void validationAlertDismissed(boolean leavingEditMode) {
        if (leavingEditMode) {
            switchToEditMode();
        }
    }

    public final void alertActionSelected(TransferActionDto action, boolean leavingEditMode) {
        IdlDecimal amount;
        final BigDecimal bigDecimalOrThrow;
        Intrinsics.checkNotNullParameter(action, "action");
        int i = WhenMappings.$EnumSwitchMapping$4[action.getType().ordinal()];
        if (i == 1) {
            if (leavingEditMode) {
                switchToEditMode();
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 3) {
                createTransfer$default(this, true, false, null, 6, null);
                return;
            } else {
                if (i != 4) {
                    return;
                }
                withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda25
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreateTransferV2Duxo.alertActionSelected$lambda$44(this.f$0, (CreateTransferV2DataState) obj);
                    }
                });
                return;
            }
        }
        MoneyDto amount2 = action.getAmount();
        if (amount2 == null || (amount = amount2.getAmount()) == null || (bigDecimalOrThrow = amount.toBigDecimalOrThrow()) == null) {
            return;
        }
        switchToEditMode();
        updateDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.alertActionSelected$lambda$43$lambda$42(bigDecimalOrThrow, (CreateTransferV2DataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferV2DataState alertActionSelected$lambda$43$lambda$42(BigDecimal bigDecimal, CreateTransferV2DataState updateDataState) {
        Intrinsics.checkNotNullParameter(updateDataState, "$this$updateDataState");
        return updateDataState.copy(((-1) & 1) != 0 ? updateDataState.sessionId : null, ((-1) & 2) != 0 ? updateDataState.direction : null, ((-1) & 4) != 0 ? updateDataState.entryPoint : null, ((-1) & 8) != 0 ? updateDataState.amount : bigDecimal, ((-1) & 16) != 0 ? updateDataState.inputChars : BigDecimals5.inputStringFormat(bigDecimal), ((-1) & 32) != 0 ? updateDataState.animateInput : false, ((-1) & 64) != 0 ? updateDataState.transferAccounts : null, ((-1) & 128) != 0 ? updateDataState.fromAccountId : null, ((-1) & 256) != 0 ? updateDataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? updateDataState.toAccountId : null, ((-1) & 1024) != 0 ? updateDataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? updateDataState.frequency : null, ((-1) & 4096) != 0 ? updateDataState.hideFrequency : false, ((-1) & 8192) != 0 ? updateDataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? updateDataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? updateDataState.mode : null, ((-1) & 65536) != 0 ? updateDataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? updateDataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? updateDataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? updateDataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? updateDataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? updateDataState.additionalDataState : null, ((-1) & 4194304) != 0 ? updateDataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? updateDataState.transferLimits : null, ((-1) & 16777216) != 0 ? updateDataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? updateDataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? updateDataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? updateDataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? updateDataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? updateDataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? updateDataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? updateDataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? updateDataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? updateDataState.iraDistribution : null, (16646143 & 4) != 0 ? updateDataState.iraDistributionFee : null, (16646143 & 8) != 0 ? updateDataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? updateDataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? updateDataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? updateDataState.iraContribution : null, (16646143 & 128) != 0 ? updateDataState.systemCalendarYear : null, (16646143 & 256) != 0 ? updateDataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? updateDataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? updateDataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? updateDataState.showDisclosure : false, (16646143 & 4096) != 0 ? updateDataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? updateDataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? updateDataState.promotionName : null, (16646143 & 32768) != 0 ? updateDataState.promotionType : null, (16646143 & 65536) != 0 ? updateDataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? updateDataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? updateDataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? updateDataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? updateDataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? updateDataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? updateDataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? updateDataState.isMemberPdtRevampV1 : false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit alertActionSelected$lambda$44(CreateTransferV2Duxo createTransferV2Duxo, CreateTransferV2DataState dataState) {
        TransferAccount transferAccount;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        TransferAccount transferAccountFromTransferAccount = CreateTransferV2StateProvider2.fromTransferAccount(dataState);
        if (transferAccountFromTransferAccount != null && (transferAccount = CreateTransferV2StateProvider2.toTransferAccount(dataState)) != null) {
            createTransferV2Duxo.submit(new CreateTransferV2Event.ShowFragment(new AdvisoryFullWithdrawalKey(transferAccountFromTransferAccount.getAccountNumber(), transferAccount.getAccountId(), CreateTransferV2DataState2.getIraDistributionData(dataState), dataState.getEntryPoint())));
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public final void onContributionQuestionnaireFinished(final IraContributionQuestionnaireResult.IraContribution result) {
        Intrinsics.checkNotNullParameter(result, "result");
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.onContributionQuestionnaireFinished$lambda$46(this.f$0, result, (CreateTransferV2DataState) obj);
            }
        });
        applyMutation(new C311562(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onContributionQuestionnaireFinished$lambda$46(CreateTransferV2Duxo createTransferV2Duxo, IraContributionQuestionnaireResult.IraContribution iraContribution, CreateTransferV2DataState dataState) {
        String accountId;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        TransferAccount pendingTransferAccountToSet = dataState.getPendingTransferAccountToSet();
        if (pendingTransferAccountToSet != null && (accountId = pendingTransferAccountToSet.getAccountId()) != null) {
            if (Intrinsics.areEqual(accountId, iraContribution.getAccount().getAccountId())) {
                createTransferV2Duxo.onToAccountSelected(accountId, iraContribution);
            } else {
                createTransferV2Duxo.onFromAccountSelected(accountId, dataState.getIraDistribution());
            }
        }
        createTransferV2Duxo.applyMutation(new CreateTransferV2Duxo$onContributionQuestionnaireFinished$1$2(iraContribution, null));
        return Unit.INSTANCE;
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onContributionQuestionnaireFinished$2", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onContributionQuestionnaireFinished$2 */
    static final class C311562 extends ContinuationImpl7 implements Function2<CreateTransferV2DataState, Continuation<? super CreateTransferV2DataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C311562(Continuation<? super C311562> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C311562 c311562 = new C311562(continuation);
            c311562.L$0 = obj;
            return c311562;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2DataState> continuation) {
            return ((C311562) create(createTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreateTransferV2DataState createTransferV2DataState = (CreateTransferV2DataState) this.L$0;
            return createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : null, ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : null, ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : null, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : null, (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : null, (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : false, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : false);
        }
    }

    public final void onDistributionQuestionnaireFinished(final IraDistributionQuestionnaireResult.IraDistribution result) {
        Intrinsics.checkNotNullParameter(result, "result");
        withDataState(new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.onDistributionQuestionnaireFinished$lambda$48(this.f$0, result, (CreateTransferV2DataState) obj);
            }
        });
        applyMutation(new C311732(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDistributionQuestionnaireFinished$lambda$48(CreateTransferV2Duxo createTransferV2Duxo, IraDistributionQuestionnaireResult.IraDistribution iraDistribution, CreateTransferV2DataState dataState) {
        String accountId;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        TransferAccount pendingTransferAccountToSet = dataState.getPendingTransferAccountToSet();
        if (pendingTransferAccountToSet != null && (accountId = pendingTransferAccountToSet.getAccountId()) != null) {
            if (Intrinsics.areEqual(accountId, iraDistribution.getTransferAccount().getAccountId())) {
                createTransferV2Duxo.onFromAccountSelected(accountId, iraDistribution);
            } else {
                createTransferV2Duxo.onToAccountSelected(accountId, dataState.getIraContribution());
            }
        }
        createTransferV2Duxo.applyMutation(new CreateTransferV2Duxo$onDistributionQuestionnaireFinished$1$2(iraDistribution, null));
        return Unit.INSTANCE;
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2DataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onDistributionQuestionnaireFinished$2", m3645f = "CreateTransferV2Duxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$onDistributionQuestionnaireFinished$2 */
    static final class C311732 extends ContinuationImpl7 implements Function2<CreateTransferV2DataState, Continuation<? super CreateTransferV2DataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C311732(Continuation<? super C311732> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C311732 c311732 = new C311732(continuation);
            c311732.L$0 = obj;
            return c311732;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CreateTransferV2DataState createTransferV2DataState, Continuation<? super CreateTransferV2DataState> continuation) {
            return ((C311732) create(createTransferV2DataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CreateTransferV2DataState createTransferV2DataState = (CreateTransferV2DataState) this.L$0;
            return createTransferV2DataState.copy(((-1) & 1) != 0 ? createTransferV2DataState.sessionId : null, ((-1) & 2) != 0 ? createTransferV2DataState.direction : null, ((-1) & 4) != 0 ? createTransferV2DataState.entryPoint : null, ((-1) & 8) != 0 ? createTransferV2DataState.amount : null, ((-1) & 16) != 0 ? createTransferV2DataState.inputChars : null, ((-1) & 32) != 0 ? createTransferV2DataState.animateInput : false, ((-1) & 64) != 0 ? createTransferV2DataState.transferAccounts : null, ((-1) & 128) != 0 ? createTransferV2DataState.fromAccountId : null, ((-1) & 256) != 0 ? createTransferV2DataState.isFromAccountFixed : false, ((-1) & 512) != 0 ? createTransferV2DataState.toAccountId : null, ((-1) & 1024) != 0 ? createTransferV2DataState.isToAccountFixed : false, ((-1) & 2048) != 0 ? createTransferV2DataState.frequency : null, ((-1) & 4096) != 0 ? createTransferV2DataState.hideFrequency : false, ((-1) & 8192) != 0 ? createTransferV2DataState.shouldShowFrequencyBottomSheetOnLaunch : false, ((-1) & 16384) != 0 ? createTransferV2DataState.stopShowingFrequencyBottomSheetOnLaunch : false, ((-1) & 32768) != 0 ? createTransferV2DataState.mode : null, ((-1) & 65536) != 0 ? createTransferV2DataState.depositSuggestionPills : null, ((-1) & 131072) != 0 ? createTransferV2DataState.skipWaitingForSuggestionPills : false, ((-1) & 262144) != 0 ? createTransferV2DataState.isCreatingTransfer : false, ((-1) & 524288) != 0 ? createTransferV2DataState.disclosureMicrogramApplication : null, ((-1) & 1048576) != 0 ? createTransferV2DataState.transferSummaryState : null, ((-1) & 2097152) != 0 ? createTransferV2DataState.additionalDataState : null, ((-1) & 4194304) != 0 ? createTransferV2DataState.selectedAchTransferOption : null, ((-1) & 8388608) != 0 ? createTransferV2DataState.transferLimits : null, ((-1) & 16777216) != 0 ? createTransferV2DataState.isEligibleForInstantDeposits : false, ((-1) & 33554432) != 0 ? createTransferV2DataState.eligbleDepositAsInstant : null, ((-1) & 67108864) != 0 ? createTransferV2DataState.hasSeenGoldNativeFundingUpsell : false, ((-1) & 134217728) != 0 ? createTransferV2DataState.paymentMethodLastUsagesMap : null, ((-1) & 268435456) != 0 ? createTransferV2DataState.isInIndividualAccountDepositsDefaultingExperiment : false, ((-1) & 536870912) != 0 ? createTransferV2DataState.configureForOutgoingWires : false, ((-1) & 1073741824) != 0 ? createTransferV2DataState.outgoingWireDetails : null, ((-1) & Integer.MIN_VALUE) != 0 ? createTransferV2DataState.outgoingWireRoutingDetails : null, (16646143 & 1) != 0 ? createTransferV2DataState.overrideNoEnokiAlert : false, (16646143 & 2) != 0 ? createTransferV2DataState.iraDistribution : null, (16646143 & 4) != 0 ? createTransferV2DataState.iraDistributionFee : null, (16646143 & 8) != 0 ? createTransferV2DataState.iraCalculatedTaxWithholdingResult : null, (16646143 & 16) != 0 ? createTransferV2DataState.iraFederalWithholdingPercentOverride : null, (16646143 & 32) != 0 ? createTransferV2DataState.iraStateWithholdingPercentOverride : null, (16646143 & 64) != 0 ? createTransferV2DataState.iraContribution : null, (16646143 & 128) != 0 ? createTransferV2DataState.systemCalendarYear : null, (16646143 & 256) != 0 ? createTransferV2DataState.overrideDistributionEnokiRemovalAlert : false, (16646143 & 512) != 0 ? createTransferV2DataState.overrideDistributionPreReviewAlert : false, (16646143 & 1024) != 0 ? createTransferV2DataState.overrideGoldApyBoostMinDepositCheck : false, (16646143 & 2048) != 0 ? createTransferV2DataState.showDisclosure : false, (16646143 & 4096) != 0 ? createTransferV2DataState.depositIncentivePillData : null, (16646143 & 8192) != 0 ? createTransferV2DataState.depositIncentiveCancelDialog : null, (16646143 & 16384) != 0 ? createTransferV2DataState.promotionName : null, (16646143 & 32768) != 0 ? createTransferV2DataState.promotionType : null, (16646143 & 65536) != 0 ? createTransferV2DataState.inRecurringIncludeDepositExperiment : false, (16646143 & 131072) != 0 ? createTransferV2DataState.pendingTransferAccountToSet : null, (16646143 & 262144) != 0 ? createTransferV2DataState.inRothConversionAdvisoryExperiment : false, (16646143 & 524288) != 0 ? createTransferV2DataState.rothConversionTransferInfo : null, (16646143 & 1048576) != 0 ? createTransferV2DataState.shouldShowRothIraReviewStateErrorRetryText : false, (16646143 & 2097152) != 0 ? createTransferV2DataState.makingRothConversion : false, (16646143 & 4194304) != 0 ? createTransferV2DataState.isLimitWireUpsellEnabled : false, (16646143 & 8388608) != 0 ? createTransferV2DataState.isMemberPdtRevampV1 : false);
        }
    }

    public final void rothInformationErrorTextClicked() {
        callReviewStateInfoAndDraw();
    }

    private final void callReviewStateInfoAndDraw() {
        Observable observableJust = Observable.just(Boolean.valueOf(this.transferConfiguration instanceof TransferConfiguration.RothConversion));
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.connectWhen$default(ObservablesKt.connectWhen$default(this.rothConversionStore.getTransferInfoQuery().invoke(), observableJust, null, 2, null), ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{AdvisoryIraRothConversionExperiment.INSTANCE}, false, null, 6, null), null, 2, null), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.callReviewStateInfoAndDraw$lambda$49(this.f$0, (ApiRothConversionTransferInfo) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ui.v2.CreateTransferV2Duxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferV2Duxo.callReviewStateInfoAndDraw$lambda$50(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit callReviewStateInfoAndDraw$lambda$49(CreateTransferV2Duxo createTransferV2Duxo, ApiRothConversionTransferInfo result) {
        Intrinsics.checkNotNullParameter(result, "result");
        createTransferV2Duxo.applyMutation(new CreateTransferV2Duxo$callReviewStateInfoAndDraw$1$1(result, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit callReviewStateInfoAndDraw$lambda$50(CreateTransferV2Duxo createTransferV2Duxo, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        createTransferV2Duxo.applyMutation(new CreateTransferV2Duxo$callReviewStateInfoAndDraw$2$1(null));
        return Unit.INSTANCE;
    }

    private final CreateTransferV2Event.ValidationError validateForSubmission(CreateTransferV2DataState state, TransferConfiguration transferConfig) {
        ValidationFailure error;
        TransferAccount transferAccountFromTransferAccount = CreateTransferV2StateProvider2.fromTransferAccount(state);
        TransferAccount transferAccount = CreateTransferV2StateProvider2.toTransferAccount(state);
        if (transferAccountFromTransferAccount == null || transferAccount == null || (error = this.transferValidator.getError(CreateTransferV2DataState2.transferValidationInput(state, transferAccountFromTransferAccount, transferAccount, state.getSessionId(), transferConfig, this.unifiedBalances, this.portfolio, state.getIraContribution(), this.marketHoursManager.areMarketsOpenExtended()), TransferValidator.Step.SUBMIT)) == null) {
            return null;
        }
        return new CreateTransferV2Event.ValidationError(error);
    }

    /* compiled from: CreateTransferV2Duxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Duxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ui/v2/CreateTransferV2Duxo;", "Lcom/robinhood/android/transfers/contracts/TransferV2;", "<init>", "()V", "LatestStateKey", "", "MENU_OF_OPTIONS_INITIAL_SCREEN_SOURCE", "DefaultMaxAmount", "Ljava/math/BigDecimal;", "getDefaultMaxAmount$feature_transfers_externalRelease", "()Ljava/math/BigDecimal;", "WiresMaxAmount", "getWiresMaxAmount$feature_transfers_externalRelease", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CreateTransferV2Duxo, TransferV2> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public TransferV2 getArgs(SavedStateHandle savedStateHandle) {
            return (TransferV2) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public TransferV2 getArgs(CreateTransferV2Duxo createTransferV2Duxo) {
            return (TransferV2) DuxoCompanion.DefaultImpls.getArgs(this, createTransferV2Duxo);
        }

        public final BigDecimal getDefaultMaxAmount$feature_transfers_externalRelease() {
            return CreateTransferV2Duxo.DefaultMaxAmount;
        }

        public final BigDecimal getWiresMaxAmount$feature_transfers_externalRelease() {
            return CreateTransferV2Duxo.WiresMaxAmount;
        }
    }
}
