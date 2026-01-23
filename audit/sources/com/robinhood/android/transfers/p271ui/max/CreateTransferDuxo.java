package com.robinhood.android.transfers.p271ui.max;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import bff_money_movement.service.p019v1.BffMoneyMovementService;
import billy_mays.service.p023v1.BillyMaysService;
import billy_mays.service.p023v1.DepositBoostInformation;
import billy_mays.service.p023v1.DepositBoostInformationDto;
import billy_mays.service.p023v1.GetGoldEarningsFeaturesRequestDto;
import billy_mays.service.p023v1.GetGoldEarningsFeaturesResponseDto;
import com.google.android.gms.internal.measurement.zzah$$ExternalSyntheticBackportWithForwarding0;
import com.jakewharton.rxrelay2.PublishRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advisory.contracts.AdvisoryFullWithdrawalKey;
import com.robinhood.android.api.retirement.transfers.RetirementTransfersApi;
import com.robinhood.android.api.transfers.DisclosureLocation;
import com.robinhood.android.api.transfers.TransfersBonfireApi;
import com.robinhood.android.banking.TransferMicrogramAppNames;
import com.robinhood.android.banking.experiments.RecurringDepositIncludeCurrent;
import com.robinhood.android.banking.util.RefIdFactory;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.data.store.logging.utils.EventLoggers;
import com.robinhood.android.data.store.portfolio.TraderPortfolioStore;
import com.robinhood.android.gold.boost.maxawareness.GoldDepositBoostMaxAwarenessStore;
import com.robinhood.android.incentives.wonka.WonkaServiceManager;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.lib.stepupverification.SuvWorkflowManager;
import com.robinhood.android.lib.transfers.AchTransferOption;
import com.robinhood.android.lib.transfers.util.AssetRetentionUtils;
import com.robinhood.android.lib.transfers.util.GetThreeDSRedirectUrl;
import com.robinhood.android.lib.transfers.util.IdlConverters;
import com.robinhood.android.lib.transfers.util.TransferAccounts2;
import com.robinhood.android.margin.experiments.PdtRevampV1;
import com.robinhood.android.markethours.util.TraderMarketHoursManager;
import com.robinhood.android.microgramsdui.MicrogramManager;
import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.android.models.retirement.api.transfers.ApiIraDistributionFee;
import com.robinhood.android.models.retirement.api.transfers.ApiIraDistributionTaxWithholding;
import com.robinhood.android.models.retirement.api.transfers.ApiRothConversionTransferInfo;
import com.robinhood.android.models.transfer.shared.ThirdPartyOutgoingWiresInfo;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.app.keys.data.DebitCardLinkingConfiguration;
import com.robinhood.android.retirement.contracts.RetirementExperiments;
import com.robinhood.android.tickerinputview.keyevent.DollarInputConsumer;
import com.robinhood.android.tickerinputview.keyevent.InputKeyEventConsumer;
import com.robinhood.android.transfers.OutgoingWireExperiment;
import com.robinhood.android.transfers.contracts.GoldApyBoostMinDepositContext;
import com.robinhood.android.transfers.contracts.IraContributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.IraDistributionQuestionnaireResult;
import com.robinhood.android.transfers.contracts.TransferAccountDirection;
import com.robinhood.android.transfers.contracts.TransferAccountSelectionKey;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.TransferFrequencyBottomSheetFragmentKey;
import com.robinhood.android.transfers.contracts.WireRoutingDetailsInputActivityResultContract3;
import com.robinhood.android.transfers.lib.limits.CreateTransferLimitsState;
import com.robinhood.android.transfers.lib.validation.TransferValidator;
import com.robinhood.android.transfers.lib.validation.ValidationFailure;
import com.robinhood.android.transfers.p271ui.TransfersRequestCreator;
import com.robinhood.android.transfers.p271ui.composecomponents.OutgoingWireMemoEntryData;
import com.robinhood.android.transfers.p271ui.instant.InstantRestrictionBottomSheet;
import com.robinhood.android.transfers.p271ui.max.BaseCreateTransferFragment;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.transfers.p271ui.max.CreateTransferViewState;
import com.robinhood.android.transfers.p271ui.max.InstantTransferAnalyticsStateMachine;
import com.robinhood.android.transfers.p271ui.max.ServiceFeeParamsState;
import com.robinhood.android.transfers.p271ui.max.createtransfer.TransferConstraints;
import com.robinhood.android.transfers.p271ui.max.limits.CreateTransferLimitsBundle;
import com.robinhood.android.transfers.p271ui.max.suggestionpills.QuickSelectorChip;
import com.robinhood.android.transfers.p271ui.max.validation.TransferValidationInputUtils;
import com.robinhood.android.transfers.util.PreCreateLoggingEvents;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.enums.RhEnum;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.prefs.DefaultAchRelationship;
import com.robinhood.librobinhood.data.store.BalancesStore;
import com.robinhood.librobinhood.data.store.CryptoPendingAndCancelStore;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferLimitsStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferWireAccountStore;
import com.robinhood.librobinhood.data.store.bonfire.retirement.RothConversionStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.librobinhood.util.PersistentCacheManager;
import com.robinhood.models.api.ApiCryptoCancelAllPendingOrders;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.ApiCreateTransferResponse;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.ApiTransferAccountsResponse;
import com.robinhood.models.api.bonfire.IraContributionType;
import com.robinhood.models.api.bonfire.IraDistributionType;
import com.robinhood.models.api.bonfire.ValidateContributionTypeResponse;
import com.robinhood.models.api.bonfire.transfer.ApiDisclosureUIResponse;
import com.robinhood.models.api.bonfire.transfer.ApiPreCreateTransferResponse;
import com.robinhood.models.api.bonfire.transfer.ApiPreCreateTransferSduiContainer;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeParams;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeResponse;
import com.robinhood.models.api.bonfire.transfer.AssetRetentionUpsellContent;
import com.robinhood.models.api.bonfire.transfer.InstantOptionRow;
import com.robinhood.models.api.bonfire.transfer.PreCreatePopupType;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiAmountLimit;
import com.robinhood.models.api.bonfire.transfer.limitsv1.ApiLimitsHubResponse;
import com.robinhood.models.api.bonfire.transfer.limitsv1.TransferProductType;
import com.robinhood.models.api.bonfire.transfer.wires.ApiOutgoingWireDetails;
import com.robinhood.models.api.bonfire.wires.RecipientType;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Portfolio;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount6;
import com.robinhood.models.p320db.bonfire.TransferAccountAdditionalData;
import com.robinhood.models.p355ui.IacUpsell;
import com.robinhood.models.p355ui.IacUpsellLocation;
import com.robinhood.models.p355ui.bonfire.PostTransferFlow2;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.DisplayRTPUpsellAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.p370rx.delay.SingleDelay2;
import com.robinhood.prefs.StringPreference;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.rosetta.eventlogging.WiresContext;
import com.robinhood.shared.data.store.iac.IacUpsellStore;
import com.robinhood.store.base.PortfolioStore;
import com.robinhood.store.stripe.StripeStore;
import com.robinhood.transfers.api.TransferType;
import com.robinhood.transfers.suggestions.pills.contracts.DynamicPillSelectionManagedService;
import com.robinhood.transfers.suggestions.pills.contracts.DynamicPillValueManagedService;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.SinglesKt;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.JsonEncodingException;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import microgram.android.MicrogramLaunchId;
import microgram.android.RemoteMicrogramApplication;
import microgram.contracts.money_movement.form_entry.proto.p500v1.FormInputDto;
import p479j$.time.Year;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: CreateTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000Ô\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0019\b\u0007\u0018\u0000 ã\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006á\u0001â\u0001ã\u0001B\u008f\u0002\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020%\u0012\u0006\u0010&\u001a\u00020'\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020,0)\u0012\u0006\u0010-\u001a\u00020.\u0012\u0006\u0010/\u001a\u000200\u0012\u0006\u00101\u001a\u000202\u0012\u0006\u00103\u001a\u000204\u0012\b\b\u0001\u00105\u001a\u000206\u0012\u0006\u00107\u001a\u000208\u0012\u0006\u00109\u001a\u00020:\u0012\u0006\u0010;\u001a\u00020<\u0012\u0006\u0010=\u001a\u00020>\u0012\u0006\u0010?\u001a\u00020@\u0012\u0006\u0010A\u001a\u00020B¢\u0006\u0004\bC\u0010DJ\b\u0010h\u001a\u00020iH\u0016J\u001d\u0010j\u001a\u00020i2\u0006\u0010k\u001a\u00020^2\u0006\u0010l\u001a\u00020TH\u0001¢\u0006\u0002\bmJ\u0018\u0010n\u001a\u00020i2\u0006\u0010k\u001a\u00020^2\u0006\u0010o\u001a\u00020,H\u0003J'\u0010p\u001a\u00020q2\u0006\u0010k\u001a\u00020^2\b\u0010r\u001a\u0004\u0018\u00010s2\u0006\u0010o\u001a\u00020,H\u0001¢\u0006\u0002\btJ \u0010u\u001a\u00020i2\u0006\u0010k\u001a\u00020^2\u0006\u0010o\u001a\u00020,2\u0006\u0010v\u001a\u00020wH\u0003J\u0018\u0010x\u001a\u00020i2\u0006\u0010k\u001a\u00020^2\u0006\u0010o\u001a\u00020,H\u0003J\u0010\u0010y\u001a\u00020i2\u0006\u0010k\u001a\u00020^H\u0003J\u0014\u0010z\u001a\u00020i2\f\u0010{\u001a\b\u0012\u0004\u0012\u00020}0|J\u0014\u0010~\u001a\u00020i2\f\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020}0|J\u0017\u0010\u0080\u0001\u001a\u00020i2\u000e\u0010\u0081\u0001\u001a\t\u0012\u0005\u0012\u00030\u0082\u00010|J\u0013\u0010\u0083\u0001\u001a\u00020i2\n\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0085\u0001J\u0011\u0010\u0086\u0001\u001a\u00020i2\b\u0010\u0087\u0001\u001a\u00030\u0088\u0001J\u0012\u0010\u0089\u0001\u001a\u00020i2\t\b\u0002\u0010\u008a\u0001\u001a\u00020}J\u0012\u0010\u008b\u0001\u001a\u00020i2\t\b\u0002\u0010\u008c\u0001\u001a\u00020}J\u0007\u0010\u008d\u0001\u001a\u00020iJ_\u0010\u008e\u0001\u001a\u00020i2\u0007\u0010\u008f\u0001\u001a\u00020N2\u0007\u0010\u0090\u0001\u001a\u00020*2\b\u0010\u0091\u0001\u001a\u00030\u0092\u00012\b\u0010\u0093\u0001\u001a\u00030\u0094\u00012\b\u0010\u0095\u0001\u001a\u00030\u0094\u00012\b\u0010\u0096\u0001\u001a\u00030\u0097\u00012\n\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0099\u00012\b\u0010\u009a\u0001\u001a\u00030\u0097\u0001H\u0002¢\u0006\u0003\u0010\u009b\u0001J\u0007\u0010\u009c\u0001\u001a\u00020iJ\u0011\u0010\u009d\u0001\u001a\u00020i2\b\u0010\u009e\u0001\u001a\u00030\u009f\u0001J\u0011\u0010 \u0001\u001a\u00020i2\b\u0010¡\u0001\u001a\u00030¢\u0001J\u0019\u0010£\u0001\u001a\u00020i2\u0007\u0010¤\u0001\u001a\u00020,2\u0007\u0010¥\u0001\u001a\u00020,J\u0007\u0010¦\u0001\u001a\u00020iJ\u0007\u0010§\u0001\u001a\u00020iJ\u0007\u0010¨\u0001\u001a\u00020iJ\u0007\u0010©\u0001\u001a\u00020iJ\u000f\u0010ª\u0001\u001a\u00020i2\u0006\u0010r\u001a\u00020sJ\u001f\u0010«\u0001\u001a\u00020i2\n\u0010¬\u0001\u001a\u0005\u0018\u00010\u0094\u00012\n\u0010\u00ad\u0001\u001a\u0005\u0018\u00010®\u0001J7\u0010¯\u0001\u001a\u00020i2\n\u0010¬\u0001\u001a\u0005\u0018\u00010\u0094\u00012\n\u0010°\u0001\u001a\u0005\u0018\u00010±\u00012\n\u0010²\u0001\u001a\u0005\u0018\u00010³\u00012\n\u0010´\u0001\u001a\u0005\u0018\u00010µ\u0001J\u0011\u0010¶\u0001\u001a\u00020i2\b\u0010·\u0001\u001a\u00030¸\u0001J\u0007\u0010¹\u0001\u001a\u00020iJ\u0011\u0010º\u0001\u001a\u00020i2\b\u0010»\u0001\u001a\u00030¼\u0001J\u0007\u0010½\u0001\u001a\u00020iJ\u0007\u0010¾\u0001\u001a\u00020iJQ\u0010¿\u0001\u001a\u00020i2\u0007\u0010À\u0001\u001a\u00020,2\t\b\u0002\u0010Á\u0001\u001a\u00020}2\u0012\b\u0002\u0010Â\u0001\u001a\u000b\u0012\u0004\u0012\u00020,\u0018\u00010Ã\u00012\u0013\b\u0002\u0010Ä\u0001\u001a\f\u0018\u00010Å\u0001j\u0005\u0018\u0001`Æ\u00012\t\b\u0002\u0010Ç\u0001\u001a\u00020}H\u0002J\u0007\u0010È\u0001\u001a\u00020iJ\u0013\u0010É\u0001\u001a\u00020}2\b\u0010Ê\u0001\u001a\u00030Ë\u0001H\u0002J\"\u0010Ì\u0001\u001a\u0005\u0018\u00010\u0094\u0001*\n\u0012\u0005\u0012\u00030\u0094\u00010Ã\u00012\b\u0010Í\u0001\u001a\u00030\u0094\u0001H\u0002J\u0007\u0010Î\u0001\u001a\u00020iJ\u0007\u0010Ï\u0001\u001a\u00020iJ\u0010\u0010Ð\u0001\u001a\u00020i2\u0007\u0010\u008a\u0001\u001a\u00020}J\u0007\u0010Ñ\u0001\u001a\u00020iJ\u0007\u0010Ò\u0001\u001a\u00020iJ\u0007\u0010Ó\u0001\u001a\u00020iJ\u0012\u0010Ô\u0001\u001a\u00020i2\u0007\u0010Õ\u0001\u001a\u00020}H\u0002J \u0010Ö\u0001\u001a\u0004\u0018\u00010\u0002*\u00020\u00022\b\u0010×\u0001\u001a\u00030\u0092\u0001H\u0082@¢\u0006\u0003\u0010Ø\u0001J\u0007\u0010Ù\u0001\u001a\u00020iJ\u0007\u0010Ú\u0001\u001a\u00020iJ\u0011\u0010Û\u0001\u001a\u00020i2\b\u0010Ü\u0001\u001a\u00030\u0097\u0001J\u0007\u0010Ý\u0001\u001a\u00020iJ\u0007\u0010Þ\u0001\u001a\u00020iJ\u0007\u0010ß\u0001\u001a\u00020iJ\u0007\u0010à\u0001\u001a\u00020iR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010+\u001a\b\u0012\u0004\u0012\u00020,0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010;\u001a\u00020<X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u000e\u0010=\u001a\u00020>X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010A\u001a\u00020BX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010HR\u0010\u0010I\u001a\u0004\u0018\u00010JX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010K\u001a\u0004\u0018\u00010LX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010M\u001a\u00020NX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u000e\u0010S\u001a\u00020TX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010U\u001a\b\u0012\u0004\u0012\u00020W0VX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010X\u001a\b\u0012\u0004\u0012\u00020Y0VX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010Z\u001a\u0004\u0018\u00010[X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\\\u001a\u0010\u0012\f\u0012\n _*\u0004\u0018\u00010^0^0]8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b`\u0010aR\u0010\u0010b\u001a\u0004\u0018\u00010cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010d\u001a\u0004\u0018\u00010eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020gX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006ä\u0001"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "transfersBonfireApi", "Lcom/robinhood/android/api/transfers/TransfersBonfireApi;", "retirementTransfersApi", "Lcom/robinhood/android/api/retirement/transfers/RetirementTransfersApi;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "transferLimitsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferLimitsStore;", "transferWireAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferWireAccountStore;", "marketHoursManager", "Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "persistentCacheManager", "Lcom/robinhood/librobinhood/util/PersistentCacheManager;", "portfolioStore", "Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "rothConversionStore", "Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RothConversionStore;", "stripeStore", "Lcom/robinhood/store/stripe/StripeStore;", "cardManager", "Lcom/robinhood/android/common/util/CardManager;", "validator", "Lcom/robinhood/android/transfers/lib/validation/TransferValidator;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "suvWorkflowManager", "Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;", "cryptoPendingAndCancelStore", "Lcom/robinhood/librobinhood/data/store/CryptoPendingAndCancelStore;", "refIdFactory", "Lcom/robinhood/android/banking/util/RefIdFactory;", "Lcom/robinhood/android/transfers/ui/max/TransferData;", "refIdFactoryForRfp", "Ljava/math/BigDecimal;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "iacUpsellStore", "Lcom/robinhood/shared/data/store/iac/IacUpsellStore;", "microgramManager", "Lcom/robinhood/android/microgramsdui/MicrogramManager;", "sortingHatStore", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "defaultAchRelationshipPref", "Lcom/robinhood/prefs/StringPreference;", "billyMaysService", "Lbilly_mays/service/v1/BillyMaysService;", "goldDepositBoostMaxAwarenessStore", "Lcom/robinhood/android/gold/boost/maxawareness/GoldDepositBoostMaxAwarenessStore;", "bffMoneyMovementService", "Lbff_money_movement/service/v1/BffMoneyMovementService;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "wonkaServiceManager", "Lcom/robinhood/android/incentives/wonka/WonkaServiceManager;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/api/transfers/TransfersBonfireApi;Lcom/robinhood/android/api/retirement/transfers/RetirementTransfersApi;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/librobinhood/data/store/bonfire/TransferLimitsStore;Lcom/robinhood/librobinhood/data/store/bonfire/TransferWireAccountStore;Lcom/robinhood/android/markethours/util/TraderMarketHoursManager;Lcom/robinhood/librobinhood/data/store/BalancesStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/librobinhood/util/PersistentCacheManager;Lcom/robinhood/android/data/store/portfolio/TraderPortfolioStore;Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/librobinhood/data/store/bonfire/retirement/RothConversionStore;Lcom/robinhood/store/stripe/StripeStore;Lcom/robinhood/android/common/util/CardManager;Lcom/robinhood/android/transfers/lib/validation/TransferValidator;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/lib/stepupverification/SuvWorkflowManager;Lcom/robinhood/librobinhood/data/store/CryptoPendingAndCancelStore;Lcom/robinhood/android/banking/util/RefIdFactory;Lcom/robinhood/android/banking/util/RefIdFactory;Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/shared/data/store/iac/IacUpsellStore;Lcom/robinhood/android/microgramsdui/MicrogramManager;Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;Lcom/robinhood/prefs/StringPreference;Lbilly_mays/service/v1/BillyMaysService;Lcom/robinhood/android/gold/boost/maxawareness/GoldDepositBoostMaxAwarenessStore;Lbff_money_movement/service/v1/BffMoneyMovementService;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/android/incentives/wonka/WonkaServiceManager;Landroidx/lifecycle/SavedStateHandle;)V", "getBffMoneyMovementService$feature_transfers_externalRelease", "()Lbff_money_movement/service/v1/BffMoneyMovementService;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "managedPillService", "Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillValueManagedService;", "dynamicPillSelectionManagedService", "Lcom/robinhood/transfers/suggestions/pills/contracts/DynamicPillSelectionManagedService;", "sessionId", "Ljava/util/UUID;", "getSessionId", "()Ljava/util/UUID;", "setSessionId", "(Ljava/util/UUID;)V", "transferConfig", "Lcom/robinhood/android/transfers/contracts/TransferConfiguration;", "errorResponseAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$ErrorResponse;", "moneyAdapter", "Lcom/robinhood/models/util/Money;", "currentRequest", "Lcom/robinhood/android/transfers/ui/TransfersRequestCreator$Result;", "disclosureBundlePublishSubject", "Lcom/jakewharton/rxrelay2/PublishRelay;", "Lcom/robinhood/android/transfers/ui/max/DisclosureBundle;", "kotlin.jvm.PlatformType", "getDisclosureBundlePublishSubject$annotations", "()V", "rtpAnalytics", "Lcom/robinhood/android/transfers/ui/max/InstantTransferAnalyticsStateMachine;", "wireLoggingContext", "Lcom/robinhood/rosetta/eventlogging/WiresContext;", "inputKeyEventConsumer", "Lcom/robinhood/android/tickerinputview/keyevent/DollarInputConsumer;", "onCreate", "", "updateAndDrawDisclosure", "disclosureBundle", "transferConfiguration", "updateAndDrawDisclosure$feature_transfers_externalRelease", "fetchDisclosure", "amount", "fetchDisclosureInEditMode", "Lkotlinx/coroutines/Job;", "frequency", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "fetchDisclosureInEditMode$feature_transfers_externalRelease", "fetchOutgoingWireDisclosure", "location", "Lcom/robinhood/android/api/transfers/DisclosureLocation;", "fetchMarginCallDisclosure", "disclosureFallback", "bindSourceAccountRowIsLoadingStream", "sourceAccountRowIsLoadingStream", "Lio/reactivex/Observable;", "", "bindSinkAccountRowIsLoadingStream", "sinkAccountRowIsLoadingStream", "bindSinkAccountRowTransferConstraintsStream", "sinkAccountRowAdjustedAmountStream", "Lcom/robinhood/android/transfers/ui/max/createtransfer/TransferConstraints;", "selectAchTransferOption", "achTransferOption", "Lcom/robinhood/android/lib/transfers/AchTransferOption;", "consumeKeyEvent", "keyEvent", "Landroid/view/KeyEvent;", "onContinueClick", "skipPreCreate", "createTransfer", "resubmissionAfter3DS", "onVerificationResultNotApproved", "createTransferInternal", "refId", "transferData", "transferRequest", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/db/bonfire/TransferAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "entryPointIdentifier", "", "rothConversionYear", "", "screenIdentifier", "(Ljava/util/UUID;Lcom/robinhood/android/transfers/ui/max/TransferData;Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/db/bonfire/TransferAccount;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "enterEditMode", "setTaxYear", "result", "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$UpdateTaxYear;", "setWithdrawalReason", "distributionType", "Lcom/robinhood/models/api/bonfire/IraDistributionType;", "setCustomIraDistributionTaxWithholding", "federalWithholdingPercent", "stateWithholdingPercent", "overrideNoEnokiAlert", "overrideDistributionEnokiRemovalAlert", "overrideDistributionPreReviewAlert", "overrideGoldApyMinDepositAlert", "setFrequency", "setSourceAccount", "account", CreateTransferDuxo.SAVED_STATE_DISTRIBUTION_INFO, "Lcom/robinhood/android/transfers/contracts/IraDistributionQuestionnaireResult$IraDistribution;", "setSinkAccount", CreateTransferDuxo.SAVED_STATE_CONTRIBUTION_INFO, "Lcom/robinhood/android/transfers/contracts/IraContributionQuestionnaireResult$IraContribution;", CreateTransferDuxo.SAVED_STATE_OUTGOING_WIRE_RECIPIENT_TYPE, "Lcom/robinhood/models/api/bonfire/wires/RecipientType;", "wireRoutingDetails", "Lcom/robinhood/android/transfers/contracts/WireRoutingDetailsInputResult$Success;", "onAccountRowClicked", "direction", "Lcom/robinhood/android/transfers/contracts/TransferAccountDirection;", "showFrequencyBottomSheet", "onQuickSelectorChipSelected", "chip", "Lcom/robinhood/android/transfers/ui/max/suggestionpills/QuickSelectorChip;", "resetSinkToRhsAccount", "cancelPendingCryptoOrders", "setAmount", "amt", "enterReviewMode", "amountsForLogging", "", "componentOverride", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/robinhood/rosetta/eventlogging/ComponentType;", "logSourceAndSink", "invalidateRefIdForCurrentTransfer", "shouldInvalidateRefId", "throwable", "", "getDefaultSinkAccount", "source", "selectInstantTransfers", "handleDebitCardAction", "continueTransaction", "alertDismissed", "continueWithRfp", "fallbackToStandardTransfer", "finishRfpFlow", "isInstant", "getPreCreateContentState", "request", "(Lcom/robinhood/android/transfers/ui/max/CreateTransferViewState;Lcom/robinhood/models/api/bonfire/ApiCreateTransferRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onMatchRateSelected", "onGoldNativeFundingUpsellCompleted", "memoTextChanged", "newMemoText", "memoSaveSelected", "memoSkipSelected", "triggerNavigationToFullWithdrawal", "clearCreatingTransfer", "ErrorResponse", "CalculatedTaxWithholdingResult", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class CreateTransferDuxo extends OldBaseDuxo<CreateTransferViewState> implements HasSavedState {
    private static final double INPUT_MAX_AMOUNT = 1000000.0d;
    private static final double INPUT_MAX_AMOUNT_WIRE = 1.0E9d;
    public static final String QUEUED_DEPOSIT_SCREEN_IDENTIFIER = "queued_deposit";
    public static final String SAVED_STATE_AMOUNT = "amount";
    public static final String SAVED_STATE_CONTRIBUTION_INFO = "iraContribution";
    public static final String SAVED_STATE_CUSTOM_FEDERAL_WITHHOLDING = "customIraFederalWithholdingPercent";
    public static final String SAVED_STATE_CUSTOM_STATE_WITHHOLDING = "customIraStateWithholdingPercent";
    public static final String SAVED_STATE_DISTRIBUTION_INFO = "iraDistribution";
    public static final String SAVED_STATE_IRA_DISTRIBUTION_FEE = "iraDistributionFee";
    public static final String SAVED_STATE_IRA_TAX_WITHHOLDING = "iraDistributionTaxWithholding";
    public static final String SAVED_STATE_OUTGOING_WIRE_RECIPIENT_TYPE = "outgoingWireRecipientType";
    public static final String SAVED_STATE_SINK_ACCOUNT = "sinkAccount";
    public static final String SAVED_STATE_SOURCE_ACCOUNT = "sourceAccount";
    private final AccountProvider accountProvider;
    private final BalancesStore balancesStore;
    private final BffMoneyMovementService bffMoneyMovementService;
    private final BillyMaysService billyMaysService;
    private final CardManager cardManager;
    private final CryptoPendingAndCancelStore cryptoPendingAndCancelStore;
    private TransfersRequestCreator.Result currentRequest;
    private final StringPreference defaultAchRelationshipPref;
    private final PublishRelay<DisclosureBundle> disclosureBundlePublishSubject;
    private DynamicPillSelectionManagedService dynamicPillSelectionManagedService;
    private final JsonAdapter<ErrorResponse> errorResponseAdapter;
    private final EventLogger eventLogger;
    private final ExperimentsStore experimentsStore;
    private final GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore;
    private final IacUpsellStore iacUpsellStore;
    private final DollarInputConsumer inputKeyEventConsumer;
    private DynamicPillValueManagedService managedPillService;
    private final TraderMarketHoursManager marketHoursManager;
    private final MicrogramManager microgramManager;
    private final JsonAdapter<Money> moneyAdapter;
    private final LazyMoshi moshi;
    private final PersistentCacheManager persistentCacheManager;
    private final TraderPortfolioStore portfolioStore;
    private final RefIdFactory<TransferData> refIdFactory;
    private final RefIdFactory<BigDecimal> refIdFactoryForRfp;
    private final RetirementTransfersApi retirementTransfersApi;
    private final RhyAccountStore rhyAccountStore;
    private final RothConversionStore rothConversionStore;
    private InstantTransferAnalyticsStateMachine rtpAnalytics;
    private final SavedStateHandle savedStateHandle;
    public UUID sessionId;
    private final BaseSortingHatStore sortingHatStore;
    private final StripeStore stripeStore;
    private final SuvWorkflowManager suvWorkflowManager;
    private final TransferAccountStore transferAccountStore;
    private final TransferConfiguration transferConfig;
    private final TransferLimitsStore transferLimitsStore;
    private final TransferWireAccountStore transferWireAccountStore;
    private final TransfersBonfireApi transfersBonfireApi;
    private final TransferValidator validator;
    private final WiresContext wireLoggingContext;
    private final WonkaServiceManager wonkaServiceManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CreateTransferDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

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
            int[] iArr4 = new int[PreCreatePopupType.values().length];
            try {
                iArr4[PreCreatePopupType.ACATS_CLAWBACK_ALERT.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr4[PreCreatePopupType.CRYPTO_CLAWBACK_ALERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[PreCreatePopupType.RTP_UPSELL.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[PreCreatePopupType.GOLD_JOINT_ACCOUNT_ALERT.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[PreCreatePopupType.POST_DEPOSIT_INCENTIVE_UPSELL.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[PreCreatePopupType.INSTANT_UPSELL.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[PreCreatePopupType.RFP_UPSELL.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[PreCreatePopupType.ASSET_RETENTION_UPSELL.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[PreCreatePopupType.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* compiled from: CreateTransferDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxo", m3645f = "CreateTransferDuxo.kt", m3646l = {2239}, m3647m = "getPreCreateContentState")
    /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$getPreCreateContentState$1 */
    static final class C306521 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C306521(Continuation<? super C306521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CreateTransferDuxo.this.getPreCreateContentState(null, null, this);
        }
    }

    @Deprecated
    private static /* synthetic */ void getDisclosureBundlePublishSubject$annotations() {
    }

    private final boolean shouldInvalidateRefId(Throwable throwable) {
        Response<?> response;
        String strExtractErrorBodyString;
        ErrorResponse errorResponseFromJson;
        ErrorResponse.ErrorCode error_code = null;
        try {
            HttpException httpException = (HttpException) Throwables.findCause(throwable, HttpException.class);
            if (httpException != null && (response = httpException.response()) != null && (strExtractErrorBodyString = NetworkThrowables.extractErrorBodyString(response)) != null && (errorResponseFromJson = this.errorResponseAdapter.fromJson(strExtractErrorBodyString)) != null) {
                error_code = errorResponseFromJson.getError_code();
            }
        } catch (Throwable th) {
            if ((th instanceof JsonDataException) || (th instanceof JsonEncodingException)) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            } else {
                throw th;
            }
        }
        return error_code == ErrorResponse.ErrorCode.UPSTREAM_ERROR || error_code == ErrorResponse.ErrorCode.DUPLICATE_REF_ID;
    }

    /* renamed from: getBffMoneyMovementService$feature_transfers_externalRelease, reason: from getter */
    public final BffMoneyMovementService getBffMoneyMovementService() {
        return this.bffMoneyMovementService;
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CreateTransferDuxo(TransfersBonfireApi transfersBonfireApi, RetirementTransfersApi retirementTransfersApi, TransferAccountStore transferAccountStore, TransferLimitsStore transferLimitsStore, TransferWireAccountStore transferWireAccountStore, TraderMarketHoursManager marketHoursManager, BalancesStore balancesStore, EventLogger eventLogger, PersistentCacheManager persistentCacheManager, TraderPortfolioStore portfolioStore, RhyAccountStore rhyAccountStore, RothConversionStore rothConversionStore, StripeStore stripeStore, CardManager cardManager, TransferValidator validator, ExperimentsStore experimentsStore, SuvWorkflowManager suvWorkflowManager, CryptoPendingAndCancelStore cryptoPendingAndCancelStore, RefIdFactory<TransferData> refIdFactory, RefIdFactory<BigDecimal> refIdFactoryForRfp, AccountProvider accountProvider, IacUpsellStore iacUpsellStore, MicrogramManager microgramManager, BaseSortingHatStore sortingHatStore, @DefaultAchRelationship StringPreference defaultAchRelationshipPref, BillyMaysService billyMaysService, GoldDepositBoostMaxAwarenessStore goldDepositBoostMaxAwarenessStore, BffMoneyMovementService bffMoneyMovementService, LazyMoshi moshi, WonkaServiceManager wonkaServiceManager, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(transfersBonfireApi, "transfersBonfireApi");
        Intrinsics.checkNotNullParameter(retirementTransfersApi, "retirementTransfersApi");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(transferLimitsStore, "transferLimitsStore");
        Intrinsics.checkNotNullParameter(transferWireAccountStore, "transferWireAccountStore");
        Intrinsics.checkNotNullParameter(marketHoursManager, "marketHoursManager");
        Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(persistentCacheManager, "persistentCacheManager");
        Intrinsics.checkNotNullParameter(portfolioStore, "portfolioStore");
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(rothConversionStore, "rothConversionStore");
        Intrinsics.checkNotNullParameter(stripeStore, "stripeStore");
        Intrinsics.checkNotNullParameter(cardManager, "cardManager");
        Intrinsics.checkNotNullParameter(validator, "validator");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(suvWorkflowManager, "suvWorkflowManager");
        Intrinsics.checkNotNullParameter(cryptoPendingAndCancelStore, "cryptoPendingAndCancelStore");
        Intrinsics.checkNotNullParameter(refIdFactory, "refIdFactory");
        Intrinsics.checkNotNullParameter(refIdFactoryForRfp, "refIdFactoryForRfp");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(iacUpsellStore, "iacUpsellStore");
        Intrinsics.checkNotNullParameter(microgramManager, "microgramManager");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(defaultAchRelationshipPref, "defaultAchRelationshipPref");
        Intrinsics.checkNotNullParameter(billyMaysService, "billyMaysService");
        Intrinsics.checkNotNullParameter(goldDepositBoostMaxAwarenessStore, "goldDepositBoostMaxAwarenessStore");
        Intrinsics.checkNotNullParameter(bffMoneyMovementService, "bffMoneyMovementService");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(wonkaServiceManager, "wonkaServiceManager");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        CreateTransferViewState.Companion companion = CreateTransferViewState.INSTANCE;
        Companion companion2 = INSTANCE;
        super(companion.initialState(((BaseCreateTransferFragment.Args) companion2.getArgs(savedStateHandle)).getTransferConfiguration(), savedStateHandle), null, 2, null);
        this.transfersBonfireApi = transfersBonfireApi;
        this.retirementTransfersApi = retirementTransfersApi;
        this.transferAccountStore = transferAccountStore;
        this.transferLimitsStore = transferLimitsStore;
        this.transferWireAccountStore = transferWireAccountStore;
        this.marketHoursManager = marketHoursManager;
        this.balancesStore = balancesStore;
        this.eventLogger = eventLogger;
        this.persistentCacheManager = persistentCacheManager;
        this.portfolioStore = portfolioStore;
        this.rhyAccountStore = rhyAccountStore;
        this.rothConversionStore = rothConversionStore;
        this.stripeStore = stripeStore;
        this.cardManager = cardManager;
        this.validator = validator;
        this.experimentsStore = experimentsStore;
        this.suvWorkflowManager = suvWorkflowManager;
        this.cryptoPendingAndCancelStore = cryptoPendingAndCancelStore;
        this.refIdFactory = refIdFactory;
        this.refIdFactoryForRfp = refIdFactoryForRfp;
        this.accountProvider = accountProvider;
        this.iacUpsellStore = iacUpsellStore;
        this.microgramManager = microgramManager;
        this.sortingHatStore = sortingHatStore;
        this.defaultAchRelationshipPref = defaultAchRelationshipPref;
        this.billyMaysService = billyMaysService;
        this.goldDepositBoostMaxAwarenessStore = goldDepositBoostMaxAwarenessStore;
        this.bffMoneyMovementService = bffMoneyMovementService;
        this.moshi = moshi;
        this.wonkaServiceManager = wonkaServiceManager;
        this.savedStateHandle = savedStateHandle;
        TransferConfiguration transferConfiguration = ((BaseCreateTransferFragment.Args) companion2.getArgs((HasSavedState) this)).getTransferConfiguration();
        this.transferConfig = transferConfiguration;
        Types types = Types.INSTANCE;
        this.errorResponseAdapter = moshi.adapter(new TypeToken<ErrorResponse>() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$special$$inlined$getAdapter$1
        }.getType());
        this.moneyAdapter = moshi.adapter(new TypeToken<Money>() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$special$$inlined$getAdapter$2
        }.getType());
        PublishRelay<DisclosureBundle> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.disclosureBundlePublishSubject = publishRelayCreate;
        TransferConfiguration.OutgoingWire outgoingWire = transferConfiguration instanceof TransferConfiguration.OutgoingWire ? (TransferConfiguration.OutgoingWire) transferConfiguration : null;
        this.wireLoggingContext = outgoingWire != null ? outgoingWire.getLoggingContext() : null;
        this.inputKeyEventConsumer = new DollarInputConsumer(new BigDecimal((int) (transferConfiguration instanceof TransferConfiguration.OutgoingWire ? INPUT_MAX_AMOUNT_WIRE : INPUT_MAX_AMOUNT)), true);
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

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        String screenIdentifier;
        UserInteractionEventData.Action action;
        Observable<List<TransferAccount>> observableFetchIfStaleThenStream;
        Observable<List<TransferAccount>> observableRefCount;
        super.onCreate();
        LifecycleHost.DefaultImpls.bind$default(this, getStates(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda44
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$0(this.f$0, (CreateTransferViewState) obj);
            }
        });
        Observable observableSwitchMap = getStates().map(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo.onCreate.2
            @Override // io.reactivex.functions.Function
            public final CreateTransferLimitsBundle apply(CreateTransferViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return new CreateTransferLimitsBundle(state.getSourceAccount(), state.getSinkAccount(), state.getAdjustedFrequency(), state.getTransferConfiguration());
            }
        }).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo.onCreate.3

            /* compiled from: CreateTransferDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/transfer/limitsv1/ApiLimitsHubResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$3$1", m3645f = "CreateTransferDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$3$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiLimitsHubResponse>, Object> {
                final /* synthetic */ CreateTransferLimitsBundle $limitsBundle;
                int label;
                final /* synthetic */ CreateTransferDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CreateTransferDuxo createTransferDuxo, CreateTransferLimitsBundle createTransferLimitsBundle, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = createTransferDuxo;
                    this.$limitsBundle = createTransferLimitsBundle;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$limitsBundle, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiLimitsHubResponse> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    TransferLimitsStore transferLimitsStore = this.this$0.transferLimitsStore;
                    TransferDirection direction = this.$limitsBundle.getDirection();
                    TransferProductType transferProductType = this.$limitsBundle.getTransferProductType();
                    Intrinsics.checkNotNull(transferProductType);
                    this.label = 1;
                    Object transferLimits = transferLimitsStore.getTransferLimits(direction, transferProductType, this);
                    return transferLimits == coroutine_suspended ? coroutine_suspended : transferLimits;
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends CreateTransferLimitsState> apply(CreateTransferLimitsBundle limitsBundle) {
                Intrinsics.checkNotNullParameter(limitsBundle, "limitsBundle");
                if (limitsBundle.getShouldRetrieveLimits()) {
                    CreateTransferDuxo createTransferDuxo = CreateTransferDuxo.this;
                    return RxFactory.DefaultImpls.rxSingle$default(createTransferDuxo, null, new AnonymousClass1(createTransferDuxo, limitsBundle, null), 1, null).map(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo.onCreate.3.2
                        @Override // io.reactivex.functions.Function
                        public final CreateTransferLimitsState.LimitsRetrieved apply(ApiLimitsHubResponse p0) {
                            Intrinsics.checkNotNullParameter(p0, "p0");
                            return new CreateTransferLimitsState.LimitsRetrieved(p0);
                        }
                    }).onErrorReturn(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo.onCreate.3.3
                        @Override // io.reactivex.functions.Function
                        public final CreateTransferLimitsState apply(Throwable t) throws Throwable {
                            Intrinsics.checkNotNullParameter(t, "t");
                            if (Throwables.isNetworkRelated(t)) {
                                return CreateTransferLimitsState.None.INSTANCE;
                            }
                            throw t;
                        }
                    }).toObservable().startWith((Observable<R>) CreateTransferLimitsState.Loading.INSTANCE);
                }
                return Observable.just(CreateTransferLimitsState.None.INSTANCE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda55
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$2(this.f$0, (CreateTransferLimitsState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{RetirementExperiments.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda61
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$4(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Observable<R> observableSwitchMap2 = this.goldDepositBoostMaxAwarenessStore.streamGoldDepositBoostMaxAwareness().distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo.onCreate.6
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<DepositBoostInformation>> apply(Boolean isInMaxAwareness) {
                Intrinsics.checkNotNullParameter(isInMaxAwareness, "isInMaxAwareness");
                if (isInMaxAwareness.booleanValue()) {
                    Observable<R> observableDistinctUntilChanged = CreateTransferDuxo.this.getStates().map(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo.onCreate.6.1
                        @Override // io.reactivex.functions.Function
                        public final Optional<Tuples2<TransferAccount, TransferAccount>> apply(CreateTransferViewState state) {
                            Intrinsics.checkNotNullParameter(state, "state");
                            if (state.getSourceAccount() != null && state.getSinkAccount() != null && !Intrinsics.areEqual(state.getSourceAccount(), state.getSinkAccount())) {
                                return Optional3.asOptional(Tuples4.m3642to(state.getSourceAccount(), state.getSinkAccount()));
                            }
                            return Optional2.INSTANCE;
                        }
                    }).distinctUntilChanged();
                    final CreateTransferDuxo createTransferDuxo = CreateTransferDuxo.this;
                    return observableDistinctUntilChanged.switchMap(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo.onCreate.6.2

                        /* compiled from: CreateTransferDuxo.kt */
                        @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/robinhood/utils/Optional;", "Lbilly_mays/service/v1/DepositBoostInformation;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$6$2$1", m3645f = "CreateTransferDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
                        /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$6$2$1, reason: invalid class name */
                        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Produce4<? super Optional<? extends DepositBoostInformation>>, Continuation<? super Unit>, Object> {
                            final /* synthetic */ Tuples2<TransferAccount, TransferAccount> $accounts;
                            private /* synthetic */ Object L$0;
                            int label;
                            final /* synthetic */ CreateTransferDuxo this$0;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            AnonymousClass1(CreateTransferDuxo createTransferDuxo, Tuples2<TransferAccount, TransferAccount> tuples2, Continuation<? super AnonymousClass1> continuation) {
                                super(2, continuation);
                                this.this$0 = createTransferDuxo;
                                this.$accounts = tuples2;
                            }

                            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$accounts, continuation);
                                anonymousClass1.L$0 = obj;
                                return anonymousClass1;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Object invoke(Produce4<? super Optional<? extends DepositBoostInformation>> produce4, Continuation<? super Unit> continuation) {
                                return invoke2((Produce4<? super Optional<DepositBoostInformation>>) produce4, continuation);
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final Object invoke2(Produce4<? super Optional<DepositBoostInformation>> produce4, Continuation<? super Unit> continuation) {
                                return ((AnonymousClass1) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
                            
                                if (r1.send(r8, r7) == r0) goto L19;
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
                                    BillyMaysService billyMaysService = this.this$0.billyMaysService;
                                    GetGoldEarningsFeaturesRequestDto getGoldEarningsFeaturesRequestDto = new GetGoldEarningsFeaturesRequestDto(IdlConverters.toTransferAccountDto(this.$accounts.getFirst()), IdlConverters.toTransferAccountDto(this.$accounts.getSecond()));
                                    this.L$0 = produce4;
                                    this.label = 1;
                                    obj = billyMaysService.GetGoldEarningsFeatures(getGoldEarningsFeaturesRequestDto, this);
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
                                DepositBoostInformationDto deposit_boost_information = ((GetGoldEarningsFeaturesResponseDto) obj).getDeposit_boost_information();
                                Optional optionalAsOptional = Optional3.asOptional(deposit_boost_information != null ? deposit_boost_information.toProto() : null);
                                this.L$0 = null;
                                this.label = 2;
                            }
                        }

                        @Override // io.reactivex.functions.Function
                        public final ObservableSource<? extends Optional<DepositBoostInformation>> apply(Optional<Tuples2<TransferAccount, TransferAccount>> optional) {
                            Intrinsics.checkNotNullParameter(optional, "<destruct>");
                            Tuples2<TransferAccount, TransferAccount> tuples2Component1 = optional.component1();
                            if (tuples2Component1 != null) {
                                CreateTransferDuxo createTransferDuxo2 = createTransferDuxo;
                                return RxFactory.DefaultImpls.rxObservable$default(createTransferDuxo2, null, new AnonymousClass1(createTransferDuxo2, tuples2Component1, null), 1, null);
                            }
                            Observable observableJust = Observable.just(Optional2.INSTANCE);
                            Intrinsics.checkNotNull(observableJust);
                            return observableJust;
                        }
                    });
                }
                return Observable.just(Optional2.INSTANCE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap2, "switchMap(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap2, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda62
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$6(this.f$0, (Optional) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda63
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$7((Throwable) obj);
            }
        }, null, null, 12, null);
        Companion companion = INSTANCE;
        if (((BaseCreateTransferFragment.Args) companion.getArgs((HasSavedState) this)).getTransferConfiguration().getEntryPoint() == MAXTransferContext.EntryPoint.MENU_OF_OPTIONS && !getStatesFlow().getValue().getHasSeenGoldNativeFundingUpsellEvent()) {
            applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda64
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferDuxo.onCreate$lambda$8((CreateTransferViewState) obj);
                }
            });
        }
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C3065310(null), 3, null);
        LifecycleHost.DefaultImpls.bind$default(this, this.accountProvider.streamIndividualAccount(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda65
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$10(this.f$0, (Account) obj);
            }
        });
        Observable observableJust = Observable.just(Boolean.valueOf(this.transferConfig instanceof TransferConfiguration.RothConversion));
        Intrinsics.checkNotNullExpressionValue(observableJust, "just(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.connectWhen$default(this.rothConversionStore.getTransferInfoQuery().invoke(), observableJust, null, 2, null), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda66
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$12(this.f$0, (ApiRothConversionTransferInfo) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda67
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$14(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
        Observable<DisclosureBundle> observableDistinctUntilChanged = this.disclosureBundlePublishSubject.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda68
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$15(this.f$0, (DisclosureBundle) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$16((Throwable) obj);
            }
        }, null, null, 12, null);
        if (!this.transferConfig.getUseQueuedDepositMode()) {
            TransferConfiguration transferConfiguration = this.transferConfig;
            TransferConfiguration.OutgoingWire outgoingWire = transferConfiguration instanceof TransferConfiguration.OutgoingWire ? (TransferConfiguration.OutgoingWire) transferConfiguration : null;
            if ((outgoingWire != null ? outgoingWire.getInitialRecipientType() : null) != null) {
                Observable observableDistinctUntilChanged2 = asObservable(getStatesFlow()).map(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$transferAccountsStream$1
                    @Override // io.reactivex.functions.Function
                    public final Optional<RecipientType> apply(CreateTransferViewState it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Optional3.asOptional(it.getOutgoingWireRecipientType());
                    }
                }).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
                observableRefCount = ObservablesKt.filterIsPresent(observableDistinctUntilChanged2).switchMap(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$transferAccountsStream$2
                    @Override // io.reactivex.functions.Function
                    public final ObservableSource<? extends List<TransferAccount>> apply(RecipientType recipientType) {
                        Intrinsics.checkNotNullParameter(recipientType, "recipientType");
                        this.this$0.transferWireAccountStore.refresh(recipientType, false);
                        return this.this$0.transferWireAccountStore.streamOutgoingWiresAccountByRecipientType(recipientType);
                    }
                });
            } else {
                TransferConfiguration transferConfiguration2 = this.transferConfig;
                TransferConfiguration.OutgoingWire outgoingWire2 = transferConfiguration2 instanceof TransferConfiguration.OutgoingWire ? (TransferConfiguration.OutgoingWire) transferConfiguration2 : null;
                if (outgoingWire2 != null && outgoingWire2.isThirdPartyWireConfigured()) {
                    TransferAccountStore transferAccountStore = this.transferAccountStore;
                    ThirdPartyOutgoingWiresInfo thirdPartyWiresInfo = ((TransferConfiguration.OutgoingWire) this.transferConfig).getThirdPartyWiresInfo();
                    if (thirdPartyWiresInfo != null) {
                        observableRefCount = transferAccountStore.fetchAccountsForThirdPartyOutgoingWires(thirdPartyWiresInfo);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    TransferConfiguration transferConfiguration3 = this.transferConfig;
                    TransferConfiguration.OutgoingWire outgoingWire3 = transferConfiguration3 instanceof TransferConfiguration.OutgoingWire ? (TransferConfiguration.OutgoingWire) transferConfiguration3 : null;
                    if (outgoingWire3 != null && outgoingWire3.isFirstParty()) {
                        observableFetchIfStaleThenStream = this.transferAccountStore.fetchAccountsForOutgoingWires();
                    } else {
                        observableFetchIfStaleThenStream = this.transferAccountStore.fetchIfStaleThenStream();
                    }
                    observableRefCount = observableFetchIfStaleThenStream.replay(1).refCount();
                }
            }
            Intrinsics.checkNotNull(observableRefCount);
            ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableRefCount, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda46
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferDuxo.onCreate$lambda$19(this.f$0, (List) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda47
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferDuxo.onCreate$lambda$21(this.f$0, (Throwable) obj);
                }
            }, null, null, 12, null);
        }
        Observable observableSwitchMap3 = getStates().map(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo.onCreate.18
            @Override // io.reactivex.functions.Function
            public final Optional<CreateTransferViewState.IraDistributionTaxWithholdingRequest> apply(CreateTransferViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return Optional3.asOptional(state.getIraDistributionTaxWithholdingRequest());
            }
        }).distinctUntilChanged().switchMap(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo.onCreate.19

            /* compiled from: CreateTransferDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$19$1", m3645f = "CreateTransferDuxo.kt", m3646l = {537}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$19$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiIraDistributionTaxWithholding>, Object> {
                final /* synthetic */ CreateTransferViewState.IraDistributionTaxWithholdingRequest $request;
                int label;
                final /* synthetic */ CreateTransferDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CreateTransferDuxo createTransferDuxo, CreateTransferViewState.IraDistributionTaxWithholdingRequest iraDistributionTaxWithholdingRequest, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = createTransferDuxo;
                    this.$request = iraDistributionTaxWithholdingRequest;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$request, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiIraDistributionTaxWithholding> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    RetirementTransfersApi retirementTransfersApi = this.this$0.retirementTransfersApi;
                    BigDecimal amount = this.$request.getAmount();
                    String accountNumber = this.$request.getIraTransferAccount().getAccountNumber();
                    ApiTransferAccount.TransferAccountType type2 = this.$request.getIraTransferAccount().getType();
                    IraDistributionType distributionType = this.$request.getDistributionType();
                    BigDecimal stateWithholdingPercent = this.$request.getStateWithholdingPercent();
                    BigDecimal federalWithholdingPercent = this.$request.getFederalWithholdingPercent();
                    this.label = 1;
                    Object iraDistributionTaxWithholding = retirementTransfersApi.getIraDistributionTaxWithholding(amount, accountNumber, type2, distributionType, stateWithholdingPercent, federalWithholdingPercent, this);
                    return iraDistributionTaxWithholding == coroutine_suspended ? coroutine_suspended : iraDistributionTaxWithholding;
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends CalculatedTaxWithholdingResult> apply(Optional<CreateTransferViewState.IraDistributionTaxWithholdingRequest> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                CreateTransferViewState.IraDistributionTaxWithholdingRequest iraDistributionTaxWithholdingRequestComponent1 = optional.component1();
                if (iraDistributionTaxWithholdingRequestComponent1 != null) {
                    CreateTransferDuxo createTransferDuxo = CreateTransferDuxo.this;
                    return RxFactory.DefaultImpls.rxSingle$default(createTransferDuxo, null, new AnonymousClass1(createTransferDuxo, iraDistributionTaxWithholdingRequestComponent1, null), 1, null).toObservable().map(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo.onCreate.19.3
                        @Override // io.reactivex.functions.Function
                        public final CalculatedTaxWithholdingResult.Success apply(ApiIraDistributionTaxWithholding p0) {
                            Intrinsics.checkNotNullParameter(p0, "p0");
                            return new CalculatedTaxWithholdingResult.Success(p0, false, 2, null);
                        }
                    }).startWith((Observable<R>) CalculatedTaxWithholdingResult.Loading.INSTANCE).onErrorReturn(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo.onCreate.19.4
                        @Override // io.reactivex.functions.Function
                        public final CalculatedTaxWithholdingResult.Error apply(Throwable p0) {
                            Intrinsics.checkNotNullParameter(p0, "p0");
                            return new CalculatedTaxWithholdingResult.Error(p0);
                        }
                    });
                }
                return Observable.just(CalculatedTaxWithholdingResult.None.INSTANCE);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap3, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda48
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$25(this.f$0, (CreateTransferDuxo.CalculatedTaxWithholdingResult) obj);
            }
        });
        Observable observableSwitchMapSingle = getStates().map(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo.onCreate.21
            @Override // io.reactivex.functions.Function
            public final Optional<CreateTransferViewState.IraDistributionFeeRequest> apply(CreateTransferViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                return Optional3.asOptional(state.getIraDistributionFeeRequest());
            }
        }).distinctUntilChanged().switchMapSingle(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo.onCreate.22

            /* compiled from: CreateTransferDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionFee;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$22$1", m3645f = "CreateTransferDuxo.kt", m3646l = {581}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$22$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiIraDistributionFee>, Object> {
                final /* synthetic */ CreateTransferViewState.IraDistributionFeeRequest $request;
                int label;
                final /* synthetic */ CreateTransferDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CreateTransferDuxo createTransferDuxo, CreateTransferViewState.IraDistributionFeeRequest iraDistributionFeeRequest, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = createTransferDuxo;
                    this.$request = iraDistributionFeeRequest;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$request, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiIraDistributionFee> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    RetirementTransfersApi retirementTransfersApi = this.this$0.retirementTransfersApi;
                    BigDecimal amount = this.$request.getAmount();
                    this.label = 1;
                    Object distributionFee = retirementTransfersApi.getDistributionFee(amount, null, this);
                    return distributionFee == coroutine_suspended ? coroutine_suspended : distributionFee;
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Optional<ApiIraDistributionFee>> apply(Optional<CreateTransferViewState.IraDistributionFeeRequest> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                CreateTransferViewState.IraDistributionFeeRequest iraDistributionFeeRequestComponent1 = optional.component1();
                if (iraDistributionFeeRequestComponent1 != null) {
                    CreateTransferDuxo createTransferDuxo = CreateTransferDuxo.this;
                    Single<T> singleOnErrorReturnItem = SinglesKt.mapToOptional(RxFactory.DefaultImpls.rxSingle$default(createTransferDuxo, null, new AnonymousClass1(createTransferDuxo, iraDistributionFeeRequestComponent1, null), 1, null)).onErrorReturnItem(Optional2.INSTANCE);
                    Intrinsics.checkNotNull(singleOnErrorReturnItem);
                    return singleOnErrorReturnItem;
                }
                Single singleJust = Single.just(Optional2.INSTANCE);
                Intrinsics.checkNotNull(singleJust);
                return singleJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle, "switchMapSingle(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda49
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$27(this.f$0, (Optional) obj);
            }
        });
        Observable observableDistinctUntilChanged3 = getStates().map(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo.onCreate.24
            @Override // io.reactivex.functions.Function
            public final Optional<String> apply(CreateTransferViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                TransferAccount sourceAccount = state.getSourceAccount();
                return Optional3.asOptional(sourceAccount != null ? sourceAccount.getAccountNumber() : null);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        Observable observableSwitchMap4 = ObservablesKt.filterIsPresent(observableDistinctUntilChanged3).switchMap(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo.onCreate.25
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends UnifiedBalances> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                BalancesStore.refreshAccount$default(CreateTransferDuxo.this.balancesStore, accountNumber, false, 2, null);
                CreateTransferDuxo createTransferDuxo = CreateTransferDuxo.this;
                return createTransferDuxo.asObservable(createTransferDuxo.balancesStore.streamUnifiedBalances(accountNumber));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap4, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap4, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda50
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$29(this.f$0, (UnifiedBalances) obj);
            }
        });
        Observable observableDistinctUntilChanged4 = getStates().map(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo.onCreate.27
            @Override // io.reactivex.functions.Function
            public final Optional<String> apply(CreateTransferViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                TransferAccount sourceAccount = state.getSourceAccount();
                return Optional3.asOptional(sourceAccount != null ? sourceAccount.getAccountNumber() : null);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        Observable observableSwitchMap5 = ObservablesKt.filterIsPresent(observableDistinctUntilChanged4).switchMap(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo.onCreate.28
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Portfolio> apply(String accountNumber) {
                Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
                PortfolioStore.DefaultImpls.refreshPortfolio$default(CreateTransferDuxo.this.portfolioStore, accountNumber, false, 2, null);
                return CreateTransferDuxo.this.portfolioStore.getPortfolio(accountNumber);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap5, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap5, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda51
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$31(this.f$0, (Portfolio) obj);
            }
        });
        Observable observableDistinctUntilChanged5 = getStates().map(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo.onCreate.30
            @Override // io.reactivex.functions.Function
            public final Boolean apply(CreateTransferViewState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                TransferAccount sourceAccount = state.getSourceAccount();
                boolean z = false;
                if (sourceAccount != null && sourceAccount.isIraOrRhsAccount()) {
                    z = true;
                }
                return Boolean.valueOf(!z);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged5, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda52
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$33(this.f$0, (Boolean) obj);
            }
        });
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda53
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$39(this.f$0, (CreateTransferViewState) obj);
            }
        });
        if (this.transferConfig.getUseQueuedDepositMode()) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C3066533(null), 3, null);
        }
        Observable observableJust2 = Observable.just(Boolean.valueOf(this.transferConfig instanceof TransferConfiguration.OutgoingWire));
        Intrinsics.checkNotNullExpressionValue(observableJust2, "just(...)");
        TransferConfiguration transferConfiguration4 = ((BaseCreateTransferFragment.Args) companion.getArgs((HasSavedState) this)).getTransferConfiguration();
        final TransferConfiguration.OutgoingWire outgoingWire4 = transferConfiguration4 instanceof TransferConfiguration.OutgoingWire ? (TransferConfiguration.OutgoingWire) transferConfiguration4 : null;
        Observable map = ObservablesKt.connectWhen$default(getStates(), observableJust2, null, 2, null).map(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((CreateTransferViewState) it).getSinkAccount());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((CreateTransferDuxo$onCreate$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableSwitchMapSingle2 = ObservablesKt.filterIsPresent(map).distinctUntilChanged().switchMapSingle(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo.onCreate.35

            /* compiled from: CreateTransferDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u0001*\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/robinhood/models/api/bonfire/transfer/wires/ApiOutgoingWireDetails;", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "Lkotlin/jvm/internal/EnhancedNullability;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$35$1", m3645f = "CreateTransferDuxo.kt", m3646l = {743}, m3647m = "invokeSuspend")
            @SourceDebugExtension
            /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$35$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Tuples2<? extends ApiOutgoingWireDetails, ? extends TransferAccount>>, Object> {
                final /* synthetic */ TransferConfiguration.OutgoingWire $outgoingWireConfig;
                final /* synthetic */ TransferAccount $transferAccount;
                int label;
                final /* synthetic */ CreateTransferDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(TransferConfiguration.OutgoingWire outgoingWire, CreateTransferDuxo createTransferDuxo, TransferAccount transferAccount, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$outgoingWireConfig = outgoingWire;
                    this.this$0 = createTransferDuxo;
                    this.$transferAccount = transferAccount;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$outgoingWireConfig, this.this$0, this.$transferAccount, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Tuples2<? extends ApiOutgoingWireDetails, ? extends TransferAccount>> continuation) {
                    return invoke2(coroutineScope, (Continuation<? super Tuples2<ApiOutgoingWireDetails, TransferAccount>>) continuation);
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Tuples2<ApiOutgoingWireDetails, TransferAccount>> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Collection collectionEmptyList;
                    List<FormInputDto> reviewFields;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        TransferConfiguration.OutgoingWire outgoingWire = this.$outgoingWireConfig;
                        boolean z = ((outgoingWire != null ? outgoingWire.getOutgoingWireRoutingNumber() : null) == null || this.$outgoingWireConfig.getOutgoingWireAccountNumber() == null) ? false : true;
                        TransfersBonfireApi transfersBonfireApi = this.this$0.transfersBonfireApi;
                        String accountId = this.$transferAccount.getAccountId();
                        ApiTransferAccount.TransferAccountType type2 = this.$transferAccount.getType();
                        this.label = 1;
                        obj = transfersBonfireApi.getOutgoingWireDetails(accountId, type2, z, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    ApiOutgoingWireDetails apiOutgoingWireDetails = (ApiOutgoingWireDetails) obj;
                    TransferConfiguration.OutgoingWire outgoingWire2 = this.$outgoingWireConfig;
                    if ((outgoingWire2 != null ? outgoingWire2.getThirdPartyWiresInfo() : null) != null) {
                        ThirdPartyOutgoingWiresInfo thirdPartyWiresInfo = this.$outgoingWireConfig.getThirdPartyWiresInfo();
                        if (thirdPartyWiresInfo != null && (reviewFields = thirdPartyWiresInfo.getReviewFields()) != null) {
                            List<FormInputDto> list = reviewFields;
                            collectionEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                            for (FormInputDto formInputDto : list) {
                                collectionEmptyList.add(new ApiOutgoingWireDetails.Row(formInputDto.getHeader(), formInputDto.getValue()));
                            }
                        } else {
                            collectionEmptyList = CollectionsKt.emptyList();
                        }
                        apiOutgoingWireDetails = new ApiOutgoingWireDetails(CollectionsKt.plus(collectionEmptyList, (Iterable) apiOutgoingWireDetails.getRows()));
                    }
                    return Tuples4.m3642to(apiOutgoingWireDetails, this.$transferAccount);
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Tuples2<ApiOutgoingWireDetails, TransferAccount>> apply(TransferAccount transferAccount) {
                Intrinsics.checkNotNullParameter(transferAccount, "transferAccount");
                CreateTransferDuxo createTransferDuxo = CreateTransferDuxo.this;
                return RxFactory.DefaultImpls.rxSingle$default(createTransferDuxo, null, new AnonymousClass1(outgoingWire4, createTransferDuxo, transferAccount, null), 1, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle2, "switchMapSingle(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda54
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$43(outgoingWire4, this, (Tuples2) obj);
            }
        });
        Observable map2 = ObservablesKt.connectWhen$default(getStates(), observableJust2, null, 2, null).map(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$$inlined$mapNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                BigDecimal amount = ((CreateTransferViewState) it).getAmount();
                if (!BigDecimals7.m2978gt(amount, BigDecimal.ZERO)) {
                    amount = null;
                }
                return Optional3.asOptional(amount);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((CreateTransferDuxo$onCreate$$inlined$mapNotNull$2<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableSwitchMapSingle3 = ObservablesKt.filterIsPresent(map2).distinctUntilChanged().switchMapSingle(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo.onCreate.38

            /* compiled from: CreateTransferDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$38$1", m3645f = "CreateTransferDuxo.kt", m3646l = {796}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$38$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiServiceFeeResponse>, Object> {
                final /* synthetic */ BigDecimal $it;
                int label;
                final /* synthetic */ CreateTransferDuxo this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(CreateTransferDuxo createTransferDuxo, BigDecimal bigDecimal, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.this$0 = createTransferDuxo;
                    this.$it = bigDecimal;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.this$0, this.$it, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiServiceFeeResponse> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
                    TransfersBonfireApi transfersBonfireApi = this.this$0.transfersBonfireApi;
                    JsonAdapter jsonAdapter = this.this$0.moneyAdapter;
                    BigDecimal bigDecimal = this.$it;
                    Intrinsics.checkNotNull(bigDecimal);
                    String json = jsonAdapter.toJson(Money3.toMoney(bigDecimal, Currencies.USD));
                    Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                    ApiTransferAccount.TransferAccountType transferAccountType = ApiTransferAccount.TransferAccountType.RHS;
                    ApiTransferAccount.TransferAccountType transferAccountType2 = ApiTransferAccount.TransferAccountType.ACH;
                    TransferType transferType = TransferType.OUTGOING_WIRE;
                    this.label = 1;
                    Object serviceFee = transfersBonfireApi.getServiceFee(json, transferAccountType, transferAccountType2, transferType, this);
                    return serviceFee == coroutine_suspended ? coroutine_suspended : serviceFee;
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends ApiServiceFeeResponse> apply(BigDecimal it) {
                Intrinsics.checkNotNullParameter(it, "it");
                CreateTransferDuxo createTransferDuxo = CreateTransferDuxo.this;
                return RxFactory.DefaultImpls.rxSingle$default(createTransferDuxo, null, new AnonymousClass1(createTransferDuxo, it, null), 1, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMapSingle3, "switchMapSingle(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMapSingle3, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda56
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$47(this.f$0, (ApiServiceFeeResponse) obj);
            }
        });
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C3066840(null), 3, null);
        CreateTransferViewState value = getStatesFlow().getValue();
        EventLogger eventLogger = this.eventLogger;
        if (this.transferConfig.getUseQueuedDepositMode()) {
            screenIdentifier = QUEUED_DEPOSIT_SCREEN_IDENTIFIER;
        } else {
            screenIdentifier = value.getScreenIdentifier();
        }
        String str = screenIdentifier;
        BigDecimal amount = value.getAmount();
        List<BigDecimal> depositSuggestionsForLogging = value.getDepositSuggestionsForLogging();
        String entryPointIdentifier = value.getEntryPointIdentifier();
        if (TransferConfigurations.getInitialMode(this.transferConfig) == CreateTransferViewState.Mode.REVIEW) {
            action = UserInteractionEventData.Action.SUBMIT_TRANSFER;
        } else {
            action = UserInteractionEventData.Action.REVIEW_TRANSFER;
        }
        CreateTransferLogging.logButtonTransfer$default(eventLogger, amount, depositSuggestionsForLogging, entryPointIdentifier, action, null, this.transferConfig.getEntryPoint(), this.transferConfig.getEntryPointLoggingIdentifier(), UserInteractionEventData.EventType.APPEAR, this.wireLoggingContext, str, null, null, null, 7184, null);
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{RecurringDepositIncludeCurrent.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda57
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$50(this.f$0, ((Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda58
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$51((Throwable) obj);
            }
        }, null, null, 12, null);
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{OutgoingWireExperiment.INSTANCE}, false, null, 6, null), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda59
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$53(this.f$0, ((Boolean) obj).booleanValue());
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda60
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$54((Throwable) obj);
            }
        }, null, null, 12, null);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C3066946(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(CreateTransferDuxo createTransferDuxo, CreateTransferViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        createTransferDuxo.getSavedStateHandle().set("amount", it.getAmount());
        createTransferDuxo.getSavedStateHandle().set(SAVED_STATE_SOURCE_ACCOUNT, it.getSourceAccount());
        createTransferDuxo.getSavedStateHandle().set(SAVED_STATE_SINK_ACCOUNT, it.getSinkAccount());
        createTransferDuxo.getSavedStateHandle().set(SAVED_STATE_CONTRIBUTION_INFO, it.getIraContribution());
        createTransferDuxo.getSavedStateHandle().set(SAVED_STATE_DISTRIBUTION_INFO, it.getIraDistribution());
        createTransferDuxo.getSavedStateHandle().set(SAVED_STATE_IRA_TAX_WITHHOLDING, it.getIraDistributionTaxWithholding());
        createTransferDuxo.getSavedStateHandle().set(SAVED_STATE_IRA_DISTRIBUTION_FEE, it.getIraDistributionFee());
        createTransferDuxo.getSavedStateHandle().set(SAVED_STATE_CUSTOM_FEDERAL_WITHHOLDING, it.getCustomIraFederalWithholdingPercent());
        createTransferDuxo.getSavedStateHandle().set(SAVED_STATE_CUSTOM_STATE_WITHHOLDING, it.getCustomIraStateWithholdingPercent());
        createTransferDuxo.getSavedStateHandle().set(SAVED_STATE_OUTGOING_WIRE_RECIPIENT_TYPE, it.getOutgoingWireRecipientType());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$2(CreateTransferDuxo createTransferDuxo, final CreateTransferLimitsState createTransferLimitsState) {
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda95
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$2$lambda$1(createTransferLimitsState, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onCreate$lambda$2$lambda$1(CreateTransferLimitsState createTransferLimitsState, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Intrinsics.checkNotNull(createTransferLimitsState);
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, createTransferLimitsState, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -33, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$4(CreateTransferDuxo createTransferDuxo, final boolean z) {
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda98
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$4$lambda$3(z, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onCreate$lambda$4$lambda$3(boolean z, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, z, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -1, 262142, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$6(CreateTransferDuxo createTransferDuxo, Optional optional) {
        final DepositBoostInformation depositBoostInformation = (DepositBoostInformation) optional.component1();
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$6$lambda$5(depositBoostInformation, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onCreate$lambda$6$lambda$5(DepositBoostInformation depositBoostInformation, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, depositBoostInformation, null, false, null, null, null, null, false, null, false, false, -1, -1, 262015, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$7(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onCreate$lambda$8(CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, new UiEvent(Unit.INSTANCE), false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -513, 262143, null);
    }

    /* compiled from: CreateTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$10", m3645f = "CreateTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$10 */
    static final class C3065310 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C3065310(Continuation<? super C3065310> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateTransferDuxo.this.new C3065310(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C3065310) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final RemoteMicrogramApplication remoteMicrogramApplication = new RemoteMicrogramApplication(TransferMicrogramAppNames.PILL_SUGGESTIONS, null, 2, null);
            MicrogramManager2 microgramManager2M16549getInstancemoChb0s$default = MicrogramManager.DefaultImpls.m16549getInstancemoChb0s$default(CreateTransferDuxo.this.microgramManager, CreateTransferDuxo.this.getLifecycleScope(), new MicrogramLaunchId(remoteMicrogramApplication, null, 2, null), null, 4, null);
            CreateTransferDuxo.this.managedPillService = (DynamicPillValueManagedService) microgramManager2M16549getInstancemoChb0s$default.getComponent().getServiceLocator().getClient(DynamicPillValueManagedService.class);
            CreateTransferDuxo.this.dynamicPillSelectionManagedService = (DynamicPillSelectionManagedService) microgramManager2M16549getInstancemoChb0s$default.getComponent().getServiceLocator().getHostImplementation(DynamicPillSelectionManagedService.class);
            DynamicPillSelectionManagedService dynamicPillSelectionManagedService = CreateTransferDuxo.this.dynamicPillSelectionManagedService;
            Intrinsics.checkNotNull(dynamicPillSelectionManagedService, "null cannot be cast to non-null type com.robinhood.android.transfers.ui.max.DynamicPillSelectionManagedServiceImpl");
            final CreateTransferDuxo createTransferDuxo = CreateTransferDuxo.this;
            ((DynamicPillSelectionManagedServiceImpl) dynamicPillSelectionManagedService).setLoadedCallback(new Function0() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$10$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CreateTransferDuxo.C3065310.invokeSuspend$lambda$3(createTransferDuxo);
                }
            });
            DynamicPillSelectionManagedService dynamicPillSelectionManagedService2 = CreateTransferDuxo.this.dynamicPillSelectionManagedService;
            Intrinsics.checkNotNull(dynamicPillSelectionManagedService2, "null cannot be cast to non-null type com.robinhood.android.transfers.ui.max.DynamicPillSelectionManagedServiceImpl");
            final CreateTransferDuxo createTransferDuxo2 = CreateTransferDuxo.this;
            ((DynamicPillSelectionManagedServiceImpl) dynamicPillSelectionManagedService2).setCallback(new Function3() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$10$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    return CreateTransferDuxo.C3065310.invokeSuspend$lambda$4(createTransferDuxo2, (String) obj2, (String) obj3, (List) obj4);
                }
            });
            CreateTransferDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$10$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CreateTransferDuxo.C3065310.invokeSuspend$lambda$5(remoteMicrogramApplication, (CreateTransferViewState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3(final CreateTransferDuxo createTransferDuxo) {
            ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(createTransferDuxo, createTransferDuxo.persistentCacheManager.getTransfersDynamicPillAmountResponse(), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$10$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferDuxo.C3065310.invokeSuspend$lambda$3$lambda$1(createTransferDuxo, (String) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$10$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferDuxo.C3065310.invokeSuspend$lambda$3$lambda$2((Throwable) obj);
                }
            }, null, null, 12, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3$lambda$1(final CreateTransferDuxo createTransferDuxo, final String str) {
            createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$10$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferDuxo.C3065310.invokeSuspend$lambda$3$lambda$1$lambda$0(createTransferDuxo, str, (CreateTransferViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CreateTransferViewState invokeSuspend$lambda$3$lambda$1$lambda$0(CreateTransferDuxo createTransferDuxo, String str, CreateTransferViewState createTransferViewState) {
            BuildersKt__Builders_commonKt.launch$default(createTransferDuxo.getLifecycleScope(), null, null, new CreateTransferDuxo$onCreate$10$1$1$1$1(createTransferDuxo, str, createTransferViewState, null), 3, null);
            return createTransferViewState;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$3$lambda$2(Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$4(CreateTransferDuxo createTransferDuxo, String str, String str2, List list) {
            if (Intrinsics.areEqual(str, Currencies.USD.getCurrencyCode())) {
                createTransferDuxo.setAmount(new BigDecimal(str2), true, list, Component.ComponentType.CHIP_GRID, true);
            } else {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException("Unsupported currency: " + str), false, null, 6, null);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CreateTransferViewState invokeSuspend$lambda$5(RemoteMicrogramApplication remoteMicrogramApplication, CreateTransferViewState createTransferViewState) {
            return CreateTransferViewState.copy$default(createTransferViewState, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, remoteMicrogramApplication, false, null, null, null, null, false, null, false, false, -1, -1, 261887, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$10(CreateTransferDuxo createTransferDuxo, final Account individualAccount) {
        Intrinsics.checkNotNullParameter(individualAccount, "individualAccount");
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$10$lambda$9(individualAccount, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onCreate$lambda$10$lambda$9(Account account, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, account.isGold(), null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -1, 262139, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$12(CreateTransferDuxo createTransferDuxo, final ApiRothConversionTransferInfo result) {
        Intrinsics.checkNotNullParameter(result, "result");
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$12$lambda$11(result, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onCreate$lambda$12$lambda$11(ApiRothConversionTransferInfo apiRothConversionTransferInfo, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, apiRothConversionTransferInfo, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -33554433, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$14(CreateTransferDuxo createTransferDuxo, final Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda30
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$14$lambda$13(t, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onCreate$lambda$14$lambda$13(Throwable th, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, new UiEvent(th), null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -67108865, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$15(CreateTransferDuxo createTransferDuxo, DisclosureBundle disclosureBundle) {
        Intrinsics.checkNotNull(disclosureBundle);
        createTransferDuxo.updateAndDrawDisclosure$feature_transfers_externalRelease(disclosureBundle, ((BaseCreateTransferFragment.Args) INSTANCE.getArgs((HasSavedState) createTransferDuxo)).getTransferConfiguration());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$16(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, it, false, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$19(final CreateTransferDuxo createTransferDuxo, final List accounts2) {
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda86
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$19$lambda$18(accounts2, createTransferDuxo, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onCreate$lambda$19$lambda$18(List list, CreateTransferDuxo createTransferDuxo, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        CreateTransferViewState createTransferViewStateMutateAccountPreselection = applyMutation.mutateAccountPreselection(list, createTransferDuxo.defaultAchRelationshipPref.get());
        createTransferDuxo.disclosureBundlePublishSubject.accept(new DisclosureBundle(createTransferViewStateMutateAccountPreselection.getMode(), createTransferViewStateMutateAccountPreselection.getSourceAccount(), createTransferViewStateMutateAccountPreselection.getSinkAccount()));
        return createTransferViewStateMutateAccountPreselection;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$21(CreateTransferDuxo createTransferDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$21$lambda$20(throwable, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onCreate$lambda$21$lambda$20(Throwable th, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, new UiEvent(th), false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -4097, -1, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$25(CreateTransferDuxo createTransferDuxo, final CalculatedTaxWithholdingResult calculatedTaxWithholdingResult) {
        if (!Intrinsics.areEqual(calculatedTaxWithholdingResult, CalculatedTaxWithholdingResult.Loading.INSTANCE)) {
            if (Intrinsics.areEqual(calculatedTaxWithholdingResult, CalculatedTaxWithholdingResult.None.INSTANCE)) {
                createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda100
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreateTransferDuxo.onCreate$lambda$25$lambda$22((CreateTransferViewState) obj);
                    }
                });
            } else if (calculatedTaxWithholdingResult instanceof CalculatedTaxWithholdingResult.Success) {
                createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda101
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreateTransferDuxo.onCreate$lambda$25$lambda$23(calculatedTaxWithholdingResult, (CreateTransferViewState) obj);
                    }
                });
            } else {
                if (!(calculatedTaxWithholdingResult instanceof CalculatedTaxWithholdingResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, ((CalculatedTaxWithholdingResult.Error) calculatedTaxWithholdingResult).getThrowable(), false, null, 6, null);
                createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda102
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CreateTransferDuxo.onCreate$lambda$25$lambda$24((CreateTransferViewState) obj);
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onCreate$lambda$25$lambda$22(CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -262145, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onCreate$lambda$25$lambda$23(CalculatedTaxWithholdingResult calculatedTaxWithholdingResult, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, ((CalculatedTaxWithholdingResult.Success) calculatedTaxWithholdingResult).getCalculatedTaxWithholding(), null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -262145, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onCreate$lambda$25$lambda$24(CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -262145, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$27(CreateTransferDuxo createTransferDuxo, Optional optional) {
        final ApiIraDistributionFee apiIraDistributionFee = (ApiIraDistributionFee) optional.component1();
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$27$lambda$26(apiIraDistributionFee, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onCreate$lambda$27$lambda$26(ApiIraDistributionFee apiIraDistributionFee, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, apiIraDistributionFee, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -524289, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$29(final CreateTransferDuxo createTransferDuxo, final UnifiedBalances unifiedBalances) {
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda99
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$29$lambda$28(unifiedBalances, createTransferDuxo, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onCreate$lambda$29$lambda$28(UnifiedBalances unifiedBalances, CreateTransferDuxo createTransferDuxo, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, unifiedBalances, createTransferDuxo.marketHoursManager.areMarketsOpenExtended(), null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -12582913, -1, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$31(CreateTransferDuxo createTransferDuxo, final Portfolio portfolio) {
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda72
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$31$lambda$30(portfolio, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onCreate$lambda$31$lambda$30(Portfolio portfolio, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, portfolio, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -2097153, -1, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$33(CreateTransferDuxo createTransferDuxo, Boolean bool) {
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda84
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$33$lambda$32((CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onCreate$lambda$33$lambda$32(CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -6291457, -1, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onCreate$lambda$39(final CreateTransferDuxo createTransferDuxo, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if ((((BaseCreateTransferFragment.Args) INSTANCE.getArgs((HasSavedState) createTransferDuxo)).getTransferConfiguration() instanceof TransferConfiguration.IraContribution) && applyMutation.isValidatingContributionType()) {
            LifecycleHost.DefaultImpls.bind$default(createTransferDuxo, RxFactory.DefaultImpls.rxSingle$default(createTransferDuxo, null, new CreateTransferDuxo$onCreate$32$1(createTransferDuxo, null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda74
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferDuxo.onCreate$lambda$39$lambda$36(this.f$0, (ValidateContributionTypeResponse) obj);
                }
            }, new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda75
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferDuxo.onCreate$lambda$39$lambda$38(this.f$0, (Throwable) obj);
                }
            });
            return applyMutation;
        }
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, Integer.MAX_VALUE, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$39$lambda$36(CreateTransferDuxo createTransferDuxo, final ValidateContributionTypeResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$39$lambda$36$lambda$35(response, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onCreate$lambda$39$lambda$36$lambda$35(ValidateContributionTypeResponse validateContributionTypeResponse, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        AlertAction<GenericAction> alert_action = validateContributionTypeResponse.getAlert_action();
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, alert_action != null ? new UiEvent(alert_action) : null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, 1610612735, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$39$lambda$38(CreateTransferDuxo createTransferDuxo, final Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$39$lambda$38$lambda$37(t, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onCreate$lambda$39$lambda$38$lambda$37(Throwable th, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, new UiEvent(th), false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, 1073741823, 262143, null);
    }

    /* compiled from: CreateTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$33", m3645f = "CreateTransferDuxo.kt", m3646l = {675}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$33 */
    static final class C3066533 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C3066533(Continuation<? super C3066533> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateTransferDuxo.this.new C3066533(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C3066533) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object transferAccounts$default;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    TransfersBonfireApi transfersBonfireApi = CreateTransferDuxo.this.transfersBonfireApi;
                    this.label = 1;
                    transferAccounts$default = TransfersBonfireApi.DefaultImpls.getTransferAccounts$default(transfersBonfireApi, true, null, null, this, 6, null);
                    if (transferAccounts$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    transferAccounts$default = obj;
                }
                ApiTransferAccount apiTransferAccount = (ApiTransferAccount) CollectionsKt.firstOrNull((List) ((ApiTransferAccountsResponse) transferAccounts$default).getResults());
                if (apiTransferAccount != null) {
                    final CreateTransferDuxo createTransferDuxo = CreateTransferDuxo.this;
                    TransferAccount transferAccountCopy$default = TransferAccount.copy$default(TransferAccount6.toDbModel(apiTransferAccount), null, null, null, null, null, false, null, null, null, null, null, false, "", null, false, false, false, false, null, null, null, null, null, null, null, null, 67104767, null);
                    final List listListOf = CollectionsKt.listOf((Object[]) new TransferAccount[]{transferAccountCopy$default, new TransferAccount("robinhood", "robinhood", ApiTransferAccount.TransferAccountType.RHS, ApiTransferAccount.TransferAccountStatus.APPROVED, boxing.boxBoolean(true), false, "Robinhood", "robinhood", apiTransferAccount.getTransfer_limit(), null, null, false, "", "Robinhood", true, false, false, false, null, null, null, null, null, null, null, null, 25165824, null)});
                    createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$33$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return CreateTransferDuxo.C3066533.invokeSuspend$lambda$2$lambda$1(listListOf, createTransferDuxo, (CreateTransferViewState) obj2);
                        }
                    });
                    createTransferDuxo.setSourceAccount(transferAccountCopy$default, null);
                    createTransferDuxo.setSinkAccount((TransferAccount) CollectionsKt.last(listListOf), null, null, null);
                }
                return Unit.INSTANCE;
            } catch (Exception unused) {
                throw new IllegalStateException("Could not retrieve accounts yet asked to make a queued deposit.");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CreateTransferViewState invokeSuspend$lambda$2$lambda$1(List list, CreateTransferDuxo createTransferDuxo, CreateTransferViewState createTransferViewState) {
            CreateTransferViewState createTransferViewStateMutateAccountPreselection = createTransferViewState.mutateAccountPreselection(list, createTransferDuxo.defaultAchRelationshipPref.get());
            createTransferDuxo.disclosureBundlePublishSubject.accept(new DisclosureBundle(createTransferViewStateMutateAccountPreselection.getMode(), createTransferViewStateMutateAccountPreselection.getSourceAccount(), createTransferViewStateMutateAccountPreselection.getSinkAccount()));
            return createTransferViewStateMutateAccountPreselection;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$43(final TransferConfiguration.OutgoingWire outgoingWire, CreateTransferDuxo createTransferDuxo, Tuples2 tuples2) {
        final ApiOutgoingWireDetails apiOutgoingWireDetails = (ApiOutgoingWireDetails) tuples2.component1();
        Object objComponent2 = tuples2.component2();
        Intrinsics.checkNotNullExpressionValue(objComponent2, "component2(...)");
        final TransferAccount transferAccount = (TransferAccount) objComponent2;
        if (outgoingWire != null && outgoingWire.isFirstParty()) {
            createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda106
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferDuxo.onCreate$lambda$43$lambda$41(transferAccount, outgoingWire, apiOutgoingWireDetails, (CreateTransferViewState) obj);
                }
            });
        } else {
            createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda107
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferDuxo.onCreate$lambda$43$lambda$42(apiOutgoingWireDetails, (CreateTransferViewState) obj);
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onCreate$lambda$43$lambda$41(TransferAccount transferAccount, TransferConfiguration.OutgoingWire outgoingWire, ApiOutgoingWireDetails apiOutgoingWireDetails, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, apiOutgoingWireDetails, null, new WireRoutingDetailsInputActivityResultContract3.Success(transferAccount, outgoingWire.getOutgoingWireRoutingNumber(), outgoingWire.getOutgoingWireAccountNumber()), null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -335544321, -1, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onCreate$lambda$43$lambda$42(ApiOutgoingWireDetails apiOutgoingWireDetails, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, apiOutgoingWireDetails, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -67108865, -1, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$47(CreateTransferDuxo createTransferDuxo, final ApiServiceFeeResponse apiServiceFeeResponse) {
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$47$lambda$46(apiServiceFeeResponse, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onCreate$lambda$47$lambda$46(ApiServiceFeeResponse apiServiceFeeResponse, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, apiServiceFeeResponse, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -536870913, -1, 262143, null);
    }

    /* compiled from: CreateTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$40", m3645f = "CreateTransferDuxo.kt", m3646l = {812}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$40 */
    static final class C3066840 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C3066840(Continuation<? super C3066840> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateTransferDuxo.this.new C3066840(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C3066840) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C3066840 c3066840;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IacUpsellStore iacUpsellStore = CreateTransferDuxo.this.iacUpsellStore;
                IacUpsellLocation iacUpsellLocation = IacUpsellLocation.UPSELL_MAX_TRANSFER;
                String lowerCase = ((BaseCreateTransferFragment.Args) CreateTransferDuxo.INSTANCE.getArgs((HasSavedState) CreateTransferDuxo.this)).getTransferConfiguration().getEntryPoint().name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                this.label = 1;
                c3066840 = this;
                obj = IacUpsellStore.getUpsellByLocation$default(iacUpsellStore, iacUpsellLocation, null, null, null, null, lowerCase, null, c3066840, 94, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                c3066840 = this;
            }
            final IacUpsell iacUpsell = (IacUpsell) ((Optional) obj).getOrNull();
            if (iacUpsell != null) {
                CreateTransferDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$40$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CreateTransferDuxo.C3066840.invokeSuspend$lambda$1$lambda$0(iacUpsell, (CreateTransferViewState) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CreateTransferViewState invokeSuspend$lambda$1$lambda$0(IacUpsell iacUpsell, CreateTransferViewState createTransferViewState) {
            return CreateTransferViewState.copy$default(createTransferViewState, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, new UiEvent(iacUpsell), null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -1, 262127, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$50(final CreateTransferDuxo createTransferDuxo, final boolean z) {
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$50$lambda$49(z, createTransferDuxo, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onCreate$lambda$50$lambda$49(boolean z, CreateTransferDuxo createTransferDuxo, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, z && !CollectionsKt.listOf((Object[]) new MAXTransferContext.EntryPoint[]{MAXTransferContext.EntryPoint.RECURRING_TRANSFER_HUB, MAXTransferContext.EntryPoint.RECURRING_DEPOSIT_UPSELL}).contains(createTransferDuxo.transferConfig.getEntryPoint()), null, false, false, -1, -1, 245759, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$51(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, it, false, null, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$53(CreateTransferDuxo createTransferDuxo, final boolean z) {
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda71
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onCreate$lambda$53$lambda$52(z, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onCreate$lambda$53$lambda$52(boolean z, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, z, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -3, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$54(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, it, false, null, 6, null);
        return Unit.INSTANCE;
    }

    /* compiled from: CreateTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$46", m3645f = "CreateTransferDuxo.kt", m3646l = {877}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$46 */
    static final class C3066946 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C3066946(Continuation<? super C3066946> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateTransferDuxo.this.new C3066946(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C3066946) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(CreateTransferDuxo.this.experimentsStore, new Experiment[]{PdtRevampV1.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CreateTransferDuxo.this, null);
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

        /* compiled from: CreateTransferDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$46$1", m3645f = "CreateTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$46$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ CreateTransferDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CreateTransferDuxo createTransferDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = createTransferDuxo;
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

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final boolean z = this.Z$0;
                this.this$0.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$onCreate$46$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CreateTransferDuxo.C3066946.AnonymousClass1.invokeSuspend$lambda$0(z, (CreateTransferViewState) obj2);
                    }
                });
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final CreateTransferViewState invokeSuspend$lambda$0(boolean z, CreateTransferViewState createTransferViewState) {
                return CreateTransferViewState.copy$default(createTransferViewState, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, z, -1, -1, 131071, null);
            }
        }
    }

    @Deprecated
    public final void updateAndDrawDisclosure$feature_transfers_externalRelease(DisclosureBundle disclosureBundle, TransferConfiguration transferConfiguration) {
        TransferAccount sinkAccount;
        Intrinsics.checkNotNullParameter(disclosureBundle, "disclosureBundle");
        Intrinsics.checkNotNullParameter(transferConfiguration, "transferConfiguration");
        mutate(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.updateAndDrawDisclosure$lambda$55((CreateTransferViewState) obj);
            }
        });
        CreateTransferViewState createTransferViewStateBlockingFirst = getStates().blockingFirst();
        Tuples2 tuples2M3642to = Tuples4.m3642to(createTransferViewStateBlockingFirst.getAmount(), createTransferViewStateBlockingFirst.getAdjustedFrequency());
        BigDecimal bigDecimal = (BigDecimal) tuples2M3642to.component1();
        ApiCreateTransferRequest2 apiCreateTransferRequest2 = (ApiCreateTransferRequest2) tuples2M3642to.component2();
        int i = WhenMappings.$EnumSwitchMapping$0[disclosureBundle.getMode().ordinal()];
        if (i == 1) {
            fetchDisclosureInEditMode$feature_transfers_externalRelease(disclosureBundle, apiCreateTransferRequest2, bigDecimal);
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (transferConfiguration instanceof TransferConfiguration.OutgoingWire) {
            fetchOutgoingWireDisclosure(disclosureBundle, bigDecimal, DisclosureLocation.CREATE_TRANSFER_REVIEW_PAGE);
            return;
        }
        TransferAccount sinkAccount2 = disclosureBundle.getSinkAccount();
        if ((sinkAccount2 != null && sinkAccount2.getHasWithdrawalFee()) || (TransferAccounts2.isRtpEligibleSource(disclosureBundle.getSourceAccount()) && (sinkAccount = disclosureBundle.getSinkAccount()) != null && TransferAccounts2.isRtpEligible(sinkAccount))) {
            fetchDisclosure(disclosureBundle, bigDecimal);
        } else if (transferConfiguration instanceof TransferConfiguration.MarginResolution) {
            fetchMarginCallDisclosure(disclosureBundle, bigDecimal);
        } else {
            disclosureFallback(disclosureBundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState updateAndDrawDisclosure$lambda$55(CreateTransferViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CreateTransferViewState.copy$default(it, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -261, 262143, null);
    }

    /* compiled from: CreateTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeParams;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxo$fetchDisclosure$1", m3645f = "CreateTransferDuxo.kt", m3646l = {940}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$fetchDisclosure$1 */
    static final class C306461 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiServiceFeeParams>, Object> {
        final /* synthetic */ DisclosureBundle $disclosureBundle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C306461(DisclosureBundle disclosureBundle, Continuation<? super C306461> continuation) {
            super(2, continuation);
            this.$disclosureBundle = disclosureBundle;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateTransferDuxo.this.new C306461(this.$disclosureBundle, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiServiceFeeParams> continuation) {
            return ((C306461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            TransfersBonfireApi transfersBonfireApi = CreateTransferDuxo.this.transfersBonfireApi;
            TransferType transferType = TransferType.DEBIT_CARD_TRANSFER;
            TransferAccount sourceAccount = this.$disclosureBundle.getSourceAccount();
            ApiTransferAccount.TransferAccountType type2 = sourceAccount != null ? sourceAccount.getType() : null;
            TransferAccount sinkAccount = this.$disclosureBundle.getSinkAccount();
            ApiTransferAccount.TransferAccountType type3 = sinkAccount != null ? sinkAccount.getType() : null;
            this.label = 1;
            Object serviceFeeParams = transfersBonfireApi.getServiceFeeParams(transferType, type2, type3, this);
            return serviceFeeParams == coroutine_suspended ? coroutine_suspended : serviceFeeParams;
        }
    }

    @Deprecated
    private final void fetchDisclosure(final DisclosureBundle disclosureBundle, BigDecimal amount) {
        Observables observables = Observables.INSTANCE;
        Observable observableStartWith = RxFactory.DefaultImpls.rxSingle$default(this, null, new C306461(disclosureBundle, null), 1, null).map(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo.fetchDisclosure.2
            @Override // io.reactivex.functions.Function
            public final ServiceFeeParamsState.Loaded apply(ApiServiceFeeParams p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new ServiceFeeParamsState.Loaded(p0);
            }
        }).onErrorReturn(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo.fetchDisclosure.3
            @Override // io.reactivex.functions.Function
            public final ServiceFeeParamsState apply(Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return new ServiceFeeParamsState.Error(new UiEvent(it));
            }
        }).toObservable().startWith((Observable) ServiceFeeParamsState.Loading.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(observableStartWith, "startWith(...)");
        Observable observable = RxFactory.DefaultImpls.rxSingle$default(this, null, new C306494(disclosureBundle, amount, null), 1, null).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observables.combineLatest(observableStartWith, observable), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda108
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.fetchDisclosure$lambda$57(this.f$0, (Tuples2) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda109
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.fetchDisclosure$lambda$58(this.f$0, disclosureBundle, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* compiled from: CreateTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/transfer/ApiDisclosureUIResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxo$fetchDisclosure$4", m3645f = "CreateTransferDuxo.kt", m3646l = {951}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$fetchDisclosure$4 */
    static final class C306494 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiDisclosureUIResponse>, Object> {
        final /* synthetic */ BigDecimal $amount;
        final /* synthetic */ DisclosureBundle $disclosureBundle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C306494(DisclosureBundle disclosureBundle, BigDecimal bigDecimal, Continuation<? super C306494> continuation) {
            super(2, continuation);
            this.$disclosureBundle = disclosureBundle;
            this.$amount = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateTransferDuxo.this.new C306494(this.$disclosureBundle, this.$amount, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiDisclosureUIResponse> continuation) {
            return ((C306494) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            TransfersBonfireApi transfersBonfireApi = CreateTransferDuxo.this.transfersBonfireApi;
            DisclosureLocation disclosureLocation = DisclosureLocation.CREATE_TRANSFER_REVIEW_PAGE;
            TransferType transferType = TransferType.DEBIT_CARD_TRANSFER;
            TransferAccount sourceAccount = this.$disclosureBundle.getSourceAccount();
            ApiTransferAccount.TransferAccountType type2 = sourceAccount != null ? sourceAccount.getType() : null;
            TransferAccount sinkAccount = this.$disclosureBundle.getSinkAccount();
            ApiTransferAccount.TransferAccountType type3 = sinkAccount != null ? sinkAccount.getType() : null;
            BigDecimal bigDecimal = this.$amount;
            this.label = 1;
            Object disclosure$default = TransfersBonfireApi.DefaultImpls.getDisclosure$default(transfersBonfireApi, disclosureLocation, transferType, type2, type3, bigDecimal, null, this, 32, null);
            return disclosure$default == coroutine_suspended ? coroutine_suspended : disclosure$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchDisclosure$lambda$57(CreateTransferDuxo createTransferDuxo, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        final ServiceFeeParamsState serviceFeeParamsState = (ServiceFeeParamsState) tuples2.component1();
        final ApiDisclosureUIResponse apiDisclosureUIResponse = (ApiDisclosureUIResponse) tuples2.component2();
        createTransferDuxo.mutate(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.fetchDisclosure$lambda$57$lambda$56(serviceFeeParamsState, apiDisclosureUIResponse, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState fetchDisclosure$lambda$57$lambda$56(ServiceFeeParamsState serviceFeeParamsState, ApiDisclosureUIResponse apiDisclosureUIResponse, CreateTransferViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CreateTransferViewState.copy$default(it, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, serviceFeeParamsState, null, null, null, null, null, null, null, false, apiDisclosureUIResponse, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -33554433, -5, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchDisclosure$lambda$58(CreateTransferDuxo createTransferDuxo, DisclosureBundle disclosureBundle, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        createTransferDuxo.disclosureFallback(disclosureBundle);
        return Unit.INSTANCE;
    }

    @Deprecated
    public final Job fetchDisclosureInEditMode$feature_transfers_externalRelease(DisclosureBundle disclosureBundle, ApiCreateTransferRequest2 frequency, BigDecimal amount) {
        Intrinsics.checkNotNullParameter(disclosureBundle, "disclosureBundle");
        Intrinsics.checkNotNullParameter(amount, "amount");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new CreateTransferDuxo$fetchDisclosureInEditMode$1(disclosureBundle, this, frequency, amount, null), 3, null);
    }

    /* compiled from: CreateTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/transfer/ApiDisclosureUIResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxo$fetchOutgoingWireDisclosure$1", m3645f = "CreateTransferDuxo.kt", m3646l = {1019}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$fetchOutgoingWireDisclosure$1 */
    static final class C306511 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiDisclosureUIResponse>, Object> {
        final /* synthetic */ BigDecimal $amount;
        final /* synthetic */ DisclosureLocation $location;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C306511(DisclosureLocation disclosureLocation, BigDecimal bigDecimal, Continuation<? super C306511> continuation) {
            super(2, continuation);
            this.$location = disclosureLocation;
            this.$amount = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateTransferDuxo.this.new C306511(this.$location, this.$amount, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiDisclosureUIResponse> continuation) {
            return ((C306511) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            TransfersBonfireApi transfersBonfireApi = CreateTransferDuxo.this.transfersBonfireApi;
            DisclosureLocation disclosureLocation = this.$location;
            TransferType transferType = TransferType.OUTGOING_WIRE;
            ApiTransferAccount.TransferAccountType transferAccountType = ApiTransferAccount.TransferAccountType.RHS;
            ApiTransferAccount.TransferAccountType transferAccountType2 = ApiTransferAccount.TransferAccountType.ACH;
            BigDecimal bigDecimal = this.$amount;
            this.label = 1;
            Object disclosure$default = TransfersBonfireApi.DefaultImpls.getDisclosure$default(transfersBonfireApi, disclosureLocation, transferType, transferAccountType, transferAccountType2, bigDecimal, null, this, 32, null);
            return disclosure$default == coroutine_suspended ? coroutine_suspended : disclosure$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final void fetchOutgoingWireDisclosure(final DisclosureBundle disclosureBundle, BigDecimal amount, DisclosureLocation location) {
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C306511(location, amount, null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.fetchOutgoingWireDisclosure$lambda$60(this.f$0, (ApiDisclosureUIResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.fetchOutgoingWireDisclosure$lambda$61(this.f$0, disclosureBundle, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchOutgoingWireDisclosure$lambda$60(CreateTransferDuxo createTransferDuxo, final ApiDisclosureUIResponse disclosureResponse) {
        Intrinsics.checkNotNullParameter(disclosureResponse, "disclosureResponse");
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda96
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.fetchOutgoingWireDisclosure$lambda$60$lambda$59(disclosureResponse, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState fetchOutgoingWireDisclosure$lambda$60$lambda$59(ApiDisclosureUIResponse apiDisclosureUIResponse, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, apiDisclosureUIResponse, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -5, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchOutgoingWireDisclosure$lambda$61(CreateTransferDuxo createTransferDuxo, DisclosureBundle disclosureBundle, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        createTransferDuxo.disclosureFallback(disclosureBundle);
        return Unit.INSTANCE;
    }

    /* compiled from: CreateTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/transfer/ApiDisclosureUIResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxo$fetchMarginCallDisclosure$1", m3645f = "CreateTransferDuxo.kt", m3646l = {1044}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$fetchMarginCallDisclosure$1 */
    static final class C306501 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiDisclosureUIResponse>, Object> {
        final /* synthetic */ BigDecimal $amount;
        final /* synthetic */ DisclosureBundle $disclosureBundle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C306501(DisclosureBundle disclosureBundle, BigDecimal bigDecimal, Continuation<? super C306501> continuation) {
            super(2, continuation);
            this.$disclosureBundle = disclosureBundle;
            this.$amount = bigDecimal;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateTransferDuxo.this.new C306501(this.$disclosureBundle, this.$amount, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiDisclosureUIResponse> continuation) {
            return ((C306501) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            TransfersBonfireApi transfersBonfireApi = CreateTransferDuxo.this.transfersBonfireApi;
            DisclosureLocation disclosureLocation = DisclosureLocation.CREATE_TRANSFER_REVIEW_PAGE;
            TransferAccount sourceAccount = this.$disclosureBundle.getSourceAccount();
            ApiTransferAccount.TransferAccountType type2 = sourceAccount != null ? sourceAccount.getType() : null;
            TransferAccount sinkAccount = this.$disclosureBundle.getSinkAccount();
            ApiTransferAccount.TransferAccountType type3 = sinkAccount != null ? sinkAccount.getType() : null;
            BigDecimal bigDecimal = this.$amount;
            Integer numBoxInt = boxing.boxInt(MAXTransferContext.EntryPoint.MAINTENANCE_CALL.getValue());
            this.label = 1;
            Object disclosure = transfersBonfireApi.getDisclosure(disclosureLocation, null, type2, type3, bigDecimal, numBoxInt, this);
            return disclosure == coroutine_suspended ? coroutine_suspended : disclosure;
        }
    }

    @Deprecated
    private final void fetchMarginCallDisclosure(DisclosureBundle disclosureBundle, BigDecimal amount) {
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C306501(disclosureBundle, amount, null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.fetchMarginCallDisclosure$lambda$63(this.f$0, (ApiDisclosureUIResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchMarginCallDisclosure$lambda$63(CreateTransferDuxo createTransferDuxo, final ApiDisclosureUIResponse disclosureResponse) {
        Intrinsics.checkNotNullParameter(disclosureResponse, "disclosureResponse");
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.fetchMarginCallDisclosure$lambda$63$lambda$62(disclosureResponse, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState fetchMarginCallDisclosure$lambda$63$lambda$62(ApiDisclosureUIResponse apiDisclosureUIResponse, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, apiDisclosureUIResponse, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -5, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final void disclosureFallback(DisclosureBundle disclosureBundle) {
        Observable observableJust;
        TransferAccount sinkAccount;
        TransferAccount sinkAccount2;
        if (disclosureBundle.getMode() == CreateTransferViewState.Mode.REVIEW && (((sinkAccount = disclosureBundle.getSinkAccount()) != null && sinkAccount.getHasWithdrawalFee()) || (TransferAccounts2.isRtpEligibleSource(disclosureBundle.getSourceAccount()) && (sinkAccount2 = disclosureBundle.getSinkAccount()) != null && TransferAccounts2.isRtpEligible(sinkAccount2)))) {
            observableJust = RxFactory.DefaultImpls.rxSingle$default(this, null, new C306421(disclosureBundle, null), 1, null).map(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo.disclosureFallback.2
                @Override // io.reactivex.functions.Function
                public final ServiceFeeParamsState.Loaded apply(ApiServiceFeeParams p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    return new ServiceFeeParamsState.Loaded(p0);
                }
            }).onErrorReturn(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo.disclosureFallback.3
                @Override // io.reactivex.functions.Function
                public final ServiceFeeParamsState apply(Throwable it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return new ServiceFeeParamsState.Error(new UiEvent(it));
                }
            }).toObservable().startWith((Observable) ServiceFeeParamsState.Loading.INSTANCE);
        } else {
            observableJust = Observable.just(ServiceFeeParamsState.None.INSTANCE);
        }
        Intrinsics.checkNotNull(observableJust);
        LifecycleHost.DefaultImpls.bind$default(this, observableJust, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C306454());
    }

    /* compiled from: CreateTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/transfer/ApiServiceFeeParams;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxo$disclosureFallback$1", m3645f = "CreateTransferDuxo.kt", m3646l = {1071}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$disclosureFallback$1 */
    static final class C306421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiServiceFeeParams>, Object> {
        final /* synthetic */ DisclosureBundle $disclosureBundle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C306421(DisclosureBundle disclosureBundle, Continuation<? super C306421> continuation) {
            super(2, continuation);
            this.$disclosureBundle = disclosureBundle;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreateTransferDuxo.this.new C306421(this.$disclosureBundle, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiServiceFeeParams> continuation) {
            return ((C306421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            TransfersBonfireApi transfersBonfireApi = CreateTransferDuxo.this.transfersBonfireApi;
            TransferType transferType = TransferType.DEBIT_CARD_TRANSFER;
            TransferAccount sourceAccount = this.$disclosureBundle.getSourceAccount();
            ApiTransferAccount.TransferAccountType type2 = sourceAccount != null ? sourceAccount.getType() : null;
            ApiTransferAccount.TransferAccountType type3 = this.$disclosureBundle.getSinkAccount().getType();
            this.label = 1;
            Object serviceFeeParams = transfersBonfireApi.getServiceFeeParams(transferType, type2, type3, this);
            return serviceFeeParams == coroutine_suspended ? coroutine_suspended : serviceFeeParams;
        }
    }

    /* compiled from: CreateTransferDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$disclosureFallback$4 */
    static final class C306454 implements Function1<?, Unit> {
        C306454() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((ServiceFeeParamsState) obj);
            return Unit.INSTANCE;
        }

        public final void invoke(final ServiceFeeParamsState serviceFeeParamsState) {
            CreateTransferDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$disclosureFallback$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferDuxo.C306454.invoke$lambda$0(serviceFeeParamsState, (CreateTransferViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CreateTransferViewState invoke$lambda$0(ServiceFeeParamsState serviceFeeParamsState, CreateTransferViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, serviceFeeParamsState, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -33554433, -1, 262143, null);
        }
    }

    public final void bindSourceAccountRowIsLoadingStream(Observable<Boolean> sourceAccountRowIsLoadingStream) {
        Intrinsics.checkNotNullParameter(sourceAccountRowIsLoadingStream, "sourceAccountRowIsLoadingStream");
        LifecycleHost.DefaultImpls.bind$default(this, sourceAccountRowIsLoadingStream, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda85
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.bindSourceAccountRowIsLoadingStream$lambda$65(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindSourceAccountRowIsLoadingStream$lambda$65(CreateTransferDuxo createTransferDuxo, final boolean z) {
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda93
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.bindSourceAccountRowIsLoadingStream$lambda$65$lambda$64(z, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState bindSourceAccountRowIsLoadingStream$lambda$65$lambda$64(boolean z, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, z, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -257, -1, 262143, null);
    }

    public final void bindSinkAccountRowIsLoadingStream(Observable<Boolean> sinkAccountRowIsLoadingStream) {
        Intrinsics.checkNotNullParameter(sinkAccountRowIsLoadingStream, "sinkAccountRowIsLoadingStream");
        LifecycleHost.DefaultImpls.bind$default(this, sinkAccountRowIsLoadingStream, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda111
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.bindSinkAccountRowIsLoadingStream$lambda$67(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindSinkAccountRowIsLoadingStream$lambda$67(CreateTransferDuxo createTransferDuxo, final boolean z) {
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.bindSinkAccountRowIsLoadingStream$lambda$67$lambda$66(z, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState bindSinkAccountRowIsLoadingStream$lambda$67$lambda$66(boolean z, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, z, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1025, -1, 262143, null);
    }

    public final void bindSinkAccountRowTransferConstraintsStream(Observable<TransferConstraints> sinkAccountRowAdjustedAmountStream) {
        Intrinsics.checkNotNullParameter(sinkAccountRowAdjustedAmountStream, "sinkAccountRowAdjustedAmountStream");
        LifecycleHost.DefaultImpls.bind$default(this, sinkAccountRowAdjustedAmountStream, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda92
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.bindSinkAccountRowTransferConstraintsStream$lambda$69(this.f$0, (TransferConstraints) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindSinkAccountRowTransferConstraintsStream$lambda$69(CreateTransferDuxo createTransferDuxo, TransferConstraints transferConstraints) {
        Intrinsics.checkNotNullParameter(transferConstraints, "<destruct>");
        final ApiServiceFeeResponse serviceFee = transferConstraints.getServiceFee();
        final ApiAmountLimit dailyLimits = transferConstraints.getDailyLimits();
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.bindSinkAccountRowTransferConstraintsStream$lambda$69$lambda$68(serviceFee, dailyLimits, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState bindSinkAccountRowTransferConstraintsStream$lambda$69$lambda$68(ApiServiceFeeResponse apiServiceFeeResponse, ApiAmountLimit apiAmountLimit, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, apiServiceFeeResponse, apiAmountLimit, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -13, -1, 262143, null);
    }

    public final void selectAchTransferOption(final AchTransferOption achTransferOption) {
        InstantTransferAnalyticsStateMachine instantTransferAnalyticsStateMachine = this.rtpAnalytics;
        if (instantTransferAnalyticsStateMachine != null) {
            instantTransferAnalyticsStateMachine.transferTypeChanged();
        }
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda79
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.selectAchTransferOption$lambda$70(achTransferOption, (CreateTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState selectAchTransferOption$lambda$70(AchTransferOption achTransferOption, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, achTransferOption, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -17, 262143, null);
    }

    public final void consumeKeyEvent(final KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda94
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.consumeKeyEvent$lambda$71(this.f$0, keyEvent, (CreateTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState consumeKeyEvent$lambda$71(CreateTransferDuxo createTransferDuxo, KeyEvent keyEvent, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        InputKeyEventConsumer.InputState<BigDecimal> inputStateConsume = createTransferDuxo.inputKeyEventConsumer.consume(new InputKeyEventConsumer.InputState(applyMutation.getAmount(), applyMutation.getInputChars()), keyEvent);
        return CreateTransferViewState.copy$default(applyMutation, null, inputStateConsume.component1(), null, null, inputStateConsume.getInput(), new UiEvent(Boolean.TRUE), null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -51, -16777217, 262143, null);
    }

    public static /* synthetic */ void onContinueClick$default(CreateTransferDuxo createTransferDuxo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        createTransferDuxo.onContinueClick(z);
    }

    public final void onContinueClick(final boolean skipPreCreate) {
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onContinueClick$lambda$72(this.f$0, skipPreCreate, (CreateTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onContinueClick$lambda$72(CreateTransferDuxo createTransferDuxo, boolean z, CreateTransferViewState applyMutation) {
        UserInteractionEventData.Action action;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        EventLogger eventLogger = createTransferDuxo.eventLogger;
        boolean useQueuedDepositMode = createTransferDuxo.transferConfig.getUseQueuedDepositMode();
        String screenIdentifier = QUEUED_DEPOSIT_SCREEN_IDENTIFIER;
        String screenIdentifier2 = useQueuedDepositMode ? QUEUED_DEPOSIT_SCREEN_IDENTIFIER : applyMutation.getScreenIdentifier();
        BigDecimal amount = applyMutation.getAmount();
        List<BigDecimal> depositSuggestionsForLogging = applyMutation.getDepositSuggestionsForLogging();
        String entryPointIdentifier = applyMutation.getEntryPointIdentifier();
        if (applyMutation.getMode() == CreateTransferViewState.Mode.EDIT) {
            action = UserInteractionEventData.Action.REVIEW_TRANSFER;
        } else {
            action = UserInteractionEventData.Action.SUBMIT_TRANSFER;
        }
        CreateTransferLogging.logButtonTransfer$default(eventLogger, amount, depositSuggestionsForLogging, entryPointIdentifier, action, null, applyMutation.getTransferConfiguration().getEntryPoint(), applyMutation.getTransferConfiguration().getEntryPointLoggingIdentifier(), UserInteractionEventData.EventType.TAP, createTransferDuxo.wireLoggingContext, screenIdentifier2, null, null, null, 7184, null);
        int i = WhenMappings.$EnumSwitchMapping$0[applyMutation.getMode().ordinal()];
        if (i == 1) {
            CreateTransferLogging.logAmountEntered$default(createTransferDuxo.eventLogger, applyMutation.getAmount(), null, applyMutation.getTransferConfiguration().getEntryPoint(), applyMutation.getTransferConfiguration().getEntryPointLoggingIdentifier(), 2, null);
            EventLogger eventLogger2 = createTransferDuxo.eventLogger;
            if (!createTransferDuxo.transferConfig.getUseQueuedDepositMode()) {
                screenIdentifier = applyMutation.getScreenIdentifier();
            }
            CreateTransferLogging.logButtonTransfer$default(eventLogger2, applyMutation.getAmount(), applyMutation.getDepositSuggestionsForLogging(), applyMutation.getEntryPointIdentifier(), UserInteractionEventData.Action.SUBMIT_TRANSFER, null, applyMutation.getTransferConfiguration().getEntryPoint(), applyMutation.getTransferConfiguration().getEntryPointLoggingIdentifier(), UserInteractionEventData.EventType.APPEAR, createTransferDuxo.wireLoggingContext, screenIdentifier, null, null, null, 7184, null);
            BuildersKt__Builders_commonKt.launch$default(createTransferDuxo.getLifecycleScope(), null, null, new CreateTransferDuxo$onContinueClick$1$1(createTransferDuxo, applyMutation, null), 3, null);
            return applyMutation;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (applyMutation.getSourceAccount() == null || applyMutation.getSinkAccount() == null) {
            return applyMutation;
        }
        if (applyMutation.getShowMatchRateSelectionScreen()) {
            return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, new UiEvent(Unit.INSTANCE), null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -1, 262135, null);
        }
        ValidationFailure error$default = TransferValidator.getError$default(createTransferDuxo.validator, TransferValidationInputUtils.transferValidationInput(createTransferDuxo.getSessionId(), applyMutation), null, 2, null);
        if (error$default == null) {
            BuildersKt__Builders_commonKt.launch$default(createTransferDuxo.getLifecycleScope(), null, null, new CreateTransferDuxo$onContinueClick$1$2(createTransferDuxo, applyMutation, z, null), 3, null);
            return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -134217729, 262143, null);
        }
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, new UiEvent(error$default), false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -524289, -1, 262143, null);
    }

    public static /* synthetic */ void createTransfer$default(CreateTransferDuxo createTransferDuxo, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        createTransferDuxo.createTransfer(z);
    }

    public final void createTransfer(final boolean resubmissionAfter3DS) {
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.createTransfer$lambda$74(this.f$0, resubmissionAfter3DS, (CreateTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState createTransfer$lambda$74(CreateTransferDuxo createTransferDuxo, boolean z, CreateTransferViewState applyMutation) {
        TransfersRequestCreator.Result result;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        TransferAccount sourceAccount = applyMutation.getSourceAccount();
        TransferAccount sinkAccount = applyMutation.getSinkAccount();
        if (sourceAccount != null && sinkAccount != null && (result = createTransferDuxo.currentRequest) != null) {
            createTransferDuxo.createTransferInternal(result.getRefId(), result.getTransferData(), ApiCreateTransferRequest.copy$default(result.getApiCreateTransferRequest(), null, null, null, null, null, null, null, null, null, null, null, z, null, 6143, null), sourceAccount, sinkAccount, applyMutation.getEntryPointIdentifier(), applyMutation.getRothConversionYear(), applyMutation.getScreenIdentifier());
        }
        return CreateTransferViewState.copy$default(applyMutation, CreateTransferViewState.Mode.REVIEW, null, null, null, null, null, null, null, false, null, false, null, null, true, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -8194, -1, 262143, null);
    }

    public final void onVerificationResultNotApproved() {
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda88
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onVerificationResultNotApproved$lambda$75((CreateTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onVerificationResultNotApproved$lambda$75(CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -8193, -1, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createTransferInternal(UUID refId, final TransferData transferData, ApiCreateTransferRequest transferRequest, final TransferAccount sourceAccount, final TransferAccount sinkAccount, final String entryPointIdentifier, Integer rothConversionYear, String screenIdentifier) {
        InstantTransferAnalyticsStateMachine.Result state = InstantTransferAnalyticsStateMachine2.getState(this.rtpAnalytics);
        final MAXTransferContext loggingContext = TransferData2.toLoggingContext(transferData, refId, this.transferConfig.getEntryPoint(), this.transferConfig.getEntryPointLoggingIdentifier(), state.getCausedByDefault(), state.getCausedByUpsell());
        this.suvWorkflowManager.handleRequest(new C306411(screenIdentifier, transferData, refId, sourceAccount, sinkAccount, rothConversionYear, transferRequest, null), new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.createTransferInternal$lambda$82(this.f$0, loggingContext, entryPointIdentifier, sourceAccount, sinkAccount, transferData, (Response) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.createTransferInternal$lambda$84(this.f$0, transferData, (Throwable) obj);
            }
        }, new Function2() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return CreateTransferDuxo.createTransferInternal$lambda$86(this.f$0, (UUID) obj, ((Boolean) obj2).booleanValue());
            }
        });
    }

    /* compiled from: CreateTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "Lcom/robinhood/models/api/bonfire/ApiCreateTransferResponse;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.ui.max.CreateTransferDuxo$createTransferInternal$1", m3645f = "CreateTransferDuxo.kt", m3646l = {1419}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$createTransferInternal$1 */
    static final class C306411 extends ContinuationImpl7 implements Function1<Continuation<? super Response<ApiCreateTransferResponse>>, Object> {
        final /* synthetic */ UUID $refId;
        final /* synthetic */ Integer $rothConversionYear;
        final /* synthetic */ String $screenIdentifier;
        final /* synthetic */ TransferAccount $sinkAccount;
        final /* synthetic */ TransferAccount $sourceAccount;
        final /* synthetic */ TransferData $transferData;
        final /* synthetic */ ApiCreateTransferRequest $transferRequest;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C306411(String str, TransferData transferData, UUID uuid, TransferAccount transferAccount, TransferAccount transferAccount2, Integer num, ApiCreateTransferRequest apiCreateTransferRequest, Continuation<? super C306411> continuation) {
            super(1, continuation);
            this.$screenIdentifier = str;
            this.$transferData = transferData;
            this.$refId = uuid;
            this.$sourceAccount = transferAccount;
            this.$sinkAccount = transferAccount2;
            this.$rothConversionYear = num;
            this.$transferRequest = apiCreateTransferRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return CreateTransferDuxo.this.new C306411(this.$screenIdentifier, this.$transferData, this.$refId, this.$sourceAccount, this.$sinkAccount, this.$rothConversionYear, this.$transferRequest, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Response<ApiCreateTransferResponse>> continuation) {
            return ((C306411) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            String str;
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
            EventLogger eventLogger = CreateTransferDuxo.this.eventLogger;
            UUID sessionId = CreateTransferDuxo.this.getSessionId();
            MAXTransferContext.EntryPoint entryPoint = CreateTransferDuxo.this.transferConfig.getEntryPoint();
            String entryPointLoggingIdentifier = CreateTransferDuxo.this.transferConfig.getEntryPointLoggingIdentifier();
            if (CreateTransferDuxo.this.transferConfig.getUseQueuedDepositMode()) {
                str = CreateTransferDuxo.QUEUED_DEPOSIT_SCREEN_IDENTIFIER;
            } else {
                str = this.$screenIdentifier;
            }
            CreateTransferLogging.logTransferSubmit$default(eventLogger, this.$transferData, this.$refId, sessionId, this.$sourceAccount, this.$sinkAccount, null, entryPoint, entryPointLoggingIdentifier, str, this.$rothConversionYear, 32, null);
            TransfersBonfireApi transfersBonfireApi = CreateTransferDuxo.this.transfersBonfireApi;
            ApiCreateTransferRequest apiCreateTransferRequest = this.$transferRequest;
            this.label = 1;
            Object objCreateTransfer = transfersBonfireApi.createTransfer(apiCreateTransferRequest, this);
            return objCreateTransfer == coroutine_suspended ? coroutine_suspended : objCreateTransfer;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createTransferInternal$lambda$82(final CreateTransferDuxo createTransferDuxo, final MAXTransferContext mAXTransferContext, final String str, final TransferAccount transferAccount, final TransferAccount transferAccount2, final TransferData transferData, Response response) {
        Intrinsics.checkNotNullParameter(response, "response");
        Single singleDoOnSuccess = EventLoggers.logResponseMetadataAndUnwrap(createTransferDuxo.eventLogger, RxFactory.DefaultImpls.rxSingle$default(createTransferDuxo, null, new CreateTransferDuxo$createTransferInternal$2$1(response, null), 1, null), new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.createTransferInternal$lambda$82$lambda$76(mAXTransferContext, str, (Response) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.createTransferInternal$lambda$82$lambda$77(mAXTransferContext, str, (Throwable) obj);
            }
        }).doOnSuccess(new Consumer() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$createTransferInternal$2$4
            @Override // io.reactivex.functions.Consumer
            public final void accept(ApiCreateTransferResponse apiCreateTransferResponse) {
                this.this$0.cardManager.invalidateCardsBestEffort();
                ApiTransferAccount.TransferAccountType type2 = transferAccount.getType();
                ApiTransferAccount.TransferAccountType transferAccountType = ApiTransferAccount.TransferAccountType.RHY;
                if (type2 == transferAccountType || transferAccount2.getType() == transferAccountType) {
                    this.this$0.rhyAccountStore.refresh(true);
                }
                this.this$0.sortingHatStore.invalidateSortingHatCacheIfNeeded();
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoOnSuccess, "doOnSuccess(...)");
        LifecycleHost.DefaultImpls.bind$default(createTransferDuxo, singleDoOnSuccess, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.createTransferInternal$lambda$82$lambda$79(this.f$0, transferAccount2, (ApiCreateTransferResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.createTransferInternal$lambda$82$lambda$81(this.f$0, transferData, (Throwable) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventData createTransferInternal$lambda$82$lambda$76(MAXTransferContext mAXTransferContext, String str, Response it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CreateTransferLogging.createTransferSuccessEvent$default(it, mAXTransferContext, str, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventData createTransferInternal$lambda$82$lambda$77(MAXTransferContext mAXTransferContext, String str, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CreateTransferLogging.createTransferErrorEvent$default(it, mAXTransferContext, str, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createTransferInternal$lambda$82$lambda$79(CreateTransferDuxo createTransferDuxo, final TransferAccount transferAccount, final ApiCreateTransferResponse apiCreateTransferResponse) {
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.createTransferInternal$lambda$82$lambda$79$lambda$78(apiCreateTransferResponse, transferAccount, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState createTransferInternal$lambda$82$lambda$79$lambda$78(ApiCreateTransferResponse apiCreateTransferResponse, TransferAccount transferAccount, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Result.Companion companion = Result.INSTANCE;
        Intrinsics.checkNotNull(apiCreateTransferResponse);
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, new UiEvent(Result.m28549boximpl(Result.m28550constructorimpl(PostTransferFlow2.toUiModel(apiCreateTransferResponse, transferAccount.getType())))), null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -40961, -268435457, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createTransferInternal$lambda$82$lambda$81(CreateTransferDuxo createTransferDuxo, TransferData transferData, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (createTransferDuxo.shouldInvalidateRefId(throwable)) {
            createTransferDuxo.refIdFactory.invalidateTransfer(transferData);
        }
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.createTransferInternal$lambda$82$lambda$81$lambda$80(throwable, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState createTransferInternal$lambda$82$lambda$81$lambda$80(Throwable th, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Result.Companion companion = Result.INSTANCE;
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, new UiEvent(Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(th)))), null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -40961, -276824065, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, com.robinhood.udf.UiEvent] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, com.robinhood.udf.UiEvent] */
    public static final Unit createTransferInternal$lambda$84(CreateTransferDuxo createTransferDuxo, TransferData transferData, Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (createTransferDuxo.shouldInvalidateRefId(throwable)) {
            createTransferDuxo.refIdFactory.invalidateTransfer(transferData);
        }
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        String threeDSRedirectUrl = GetThreeDSRedirectUrl.getThreeDSRedirectUrl(throwable);
        if (threeDSRedirectUrl == null) {
            Result.Companion companion = Result.INSTANCE;
            objectRef.element = new UiEvent(Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(throwable))));
        } else {
            objectRef2.element = new UiEvent(threeDSRedirectUrl);
        }
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.createTransferInternal$lambda$84$lambda$83(objectRef, objectRef2, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final CreateTransferViewState createTransferInternal$lambda$84$lambda$83(Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, (UiEvent) objectRef.element, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, (UiEvent) objectRef2.element, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -40961, -276832257, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createTransferInternal$lambda$86(CreateTransferDuxo createTransferDuxo, final UUID workflowId, final boolean z) {
        Intrinsics.checkNotNullParameter(workflowId, "workflowId");
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.createTransferInternal$lambda$86$lambda$85(workflowId, z, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState createTransferInternal$lambda$86$lambda$85(UUID uuid, boolean z, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, new UiEvent(Tuples4.m3642to(uuid, Boolean.valueOf(z))), null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -8193, -268435521, 262143, null);
    }

    public final void enterEditMode() {
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda80
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.enterEditMode$lambda$87(this.f$0, (CreateTransferViewState) obj);
            }
        });
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda81
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.enterEditMode$lambda$88((CreateTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState enterEditMode$lambda$87(CreateTransferDuxo createTransferDuxo, CreateTransferViewState applyMutation) {
        TransferAccountAdditionalData additionalData;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (applyMutation.isCreatingTransfer()) {
            return applyMutation;
        }
        PublishRelay<DisclosureBundle> publishRelay = createTransferDuxo.disclosureBundlePublishSubject;
        CreateTransferViewState.Mode mode = CreateTransferViewState.Mode.EDIT;
        publishRelay.accept(new DisclosureBundle(mode, applyMutation.getSourceAccount(), applyMutation.getSinkAccount()));
        TransferAccount sinkAccount = applyMutation.getSinkAccount();
        AchTransferOption selectedAchTransferOption = (sinkAccount == null || (additionalData = sinkAccount.getAdditionalData()) == null || !additionalData.isDefaultWithdrawalOptionInstant()) ? null : applyMutation.getSelectedAchTransferOption();
        return CreateTransferViewState.copy$default(applyMutation, mode, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, selectedAchTransferOption != null ? new UiEvent(selectedAchTransferOption) : null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -2, -9, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState enterEditMode$lambda$88(CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.isOutgoingWireMemoExperimentEnabled() ? CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, new UiEvent(new ShowOutgoingWireMemoDataHolder(null)), null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1073741825, -1, 262143, null) : applyMutation;
    }

    public final void setTaxYear(final IraContributionQuestionnaireResult.UpdateTaxYear result) {
        Intrinsics.checkNotNullParameter(result, "result");
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.setTaxYear$lambda$90(result, (CreateTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState setTaxYear$lambda$90(IraContributionQuestionnaireResult.UpdateTaxYear updateTaxYear, CreateTransferViewState createTransferViewState) {
        CreateTransferViewState applyMutation = createTransferViewState;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        IraContributionQuestionnaireResult.IraContribution iraContribution = applyMutation.getIraContribution();
        if (iraContribution != null) {
            if (iraContribution instanceof IraContributionQuestionnaireResult.IraContribution.IndirectRollover) {
                throw new IllegalStateException("Setting tax year on indirect rollover");
            }
            if (!(iraContribution instanceof IraContributionQuestionnaireResult.IraContribution.OneTimeContribution)) {
                throw new NoWhenBranchMatchedException();
            }
            IraContributionQuestionnaireResult.IraContribution.OneTimeContribution oneTimeContribution = (IraContributionQuestionnaireResult.IraContribution.OneTimeContribution) iraContribution;
            Year taxYear = updateTaxYear.getTaxYear();
            if (taxYear != null) {
                applyMutation = CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, IraContributionQuestionnaireResult.IraContribution.OneTimeContribution.copy$default(oneTimeContribution, null, taxYear, updateTaxYear.getContributionLimit(), 1, null), null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -32769, 262143, null);
            }
            if (applyMutation != null) {
                return applyMutation;
            }
        }
        return createTransferViewState;
    }

    public final void setWithdrawalReason(final IraDistributionType distributionType) {
        Intrinsics.checkNotNullParameter(distributionType, "distributionType");
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda27
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.setWithdrawalReason$lambda$92(distributionType, (CreateTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState setWithdrawalReason$lambda$92(IraDistributionType iraDistributionType, CreateTransferViewState applyMutation) {
        Tuples2 tuples2M3642to;
        CreateTransferViewState createTransferViewStateCopy$default;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        IraDistributionQuestionnaireResult.IraDistribution iraDistribution = applyMutation.getIraDistribution();
        if ((iraDistribution != null ? iraDistribution.getDistributionType() : null) == iraDistributionType) {
            tuples2M3642to = Tuples4.m3642to(applyMutation.getCustomIraFederalWithholdingPercent(), applyMutation.getCustomIraStateWithholdingPercent());
        } else {
            tuples2M3642to = Tuples4.m3642to(null, null);
        }
        BigDecimal bigDecimal = (BigDecimal) tuples2M3642to.component1();
        BigDecimal bigDecimal2 = (BigDecimal) tuples2M3642to.component2();
        IraDistributionQuestionnaireResult.IraDistribution iraDistribution2 = applyMutation.getIraDistribution();
        return (iraDistribution2 == null || (createTransferViewStateCopy$default = CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, IraDistributionQuestionnaireResult.IraDistribution.copy$default(iraDistribution2, null, iraDistributionType, 1, null), null, null, null, bigDecimal, bigDecimal2, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -3211265, 262143, null)) == null) ? applyMutation : createTransferViewStateCopy$default;
    }

    public final void setCustomIraDistributionTaxWithholding(final BigDecimal federalWithholdingPercent, final BigDecimal stateWithholdingPercent) {
        Intrinsics.checkNotNullParameter(federalWithholdingPercent, "federalWithholdingPercent");
        Intrinsics.checkNotNullParameter(stateWithholdingPercent, "stateWithholdingPercent");
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda77
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.setCustomIraDistributionTaxWithholding$lambda$93(federalWithholdingPercent, stateWithholdingPercent, (CreateTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState setCustomIraDistributionTaxWithholding$lambda$93(BigDecimal bigDecimal, BigDecimal bigDecimal2, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, bigDecimal, bigDecimal2, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -3145729, 262143, null);
    }

    public final void overrideNoEnokiAlert() {
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.overrideNoEnokiAlert$lambda$94((CreateTransferViewState) obj);
            }
        });
        onContinueClick$default(this, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState overrideNoEnokiAlert$lambda$94(CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, true, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -4194305, 262143, null);
    }

    public final void overrideDistributionEnokiRemovalAlert() {
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.overrideDistributionEnokiRemovalAlert$lambda$95((CreateTransferViewState) obj);
            }
        });
        onContinueClick$default(this, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState overrideDistributionEnokiRemovalAlert$lambda$95(CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, true, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -16777217, 262143, null);
    }

    public final void overrideDistributionPreReviewAlert() {
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda76
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.overrideDistributionPreReviewAlert$lambda$96((CreateTransferViewState) obj);
            }
        });
        onContinueClick$default(this, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState overrideDistributionPreReviewAlert$lambda$96(CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, true, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -8388609, 262143, null);
    }

    public final void overrideGoldApyMinDepositAlert() {
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda73
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.overrideGoldApyMinDepositAlert$lambda$97((CreateTransferViewState) obj);
            }
        });
        onContinueClick$default(this, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState overrideGoldApyMinDepositAlert$lambda$97(CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, true, null, null, false, null, null, null, null, false, null, false, false, -1, -1, 262079, null);
    }

    public final void setFrequency(final ApiCreateTransferRequest2 frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        CreateTransferLogging.logFrequencySelected$default(this.eventLogger, frequency, null, 2, null);
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda103
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.setFrequency$lambda$98(frequency, (CreateTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState setFrequency$lambda$98(ApiCreateTransferRequest2 apiCreateTransferRequest2, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, apiCreateTransferRequest2, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -65, -1, 262143, null);
    }

    public final void setSourceAccount(final TransferAccount account, final IraDistributionQuestionnaireResult.IraDistribution iraDistribution) {
        CreateTransferLogging.logAccountSelected$default(this.eventLogger, account, TransferAccountDirection.SOURCE, null, null, null, this.transferConfig.getEntryPoint(), this.transferConfig.getEntryPointLoggingIdentifier(), 28, null);
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.setSourceAccount$lambda$100(account, iraDistribution, this, (CreateTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final CreateTransferViewState setSourceAccount$lambda$100(TransferAccount transferAccount, IraDistributionQuestionnaireResult.IraDistribution iraDistribution, CreateTransferDuxo createTransferDuxo, CreateTransferViewState applyMutation) {
        Tuples2 tuples2M3642to;
        Tuples2 tuples2M3642to2;
        TransferAccount transferAccount2;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        TransferAccount defaultSinkAccount = null;
        if (transferAccount != null) {
            TransferAccount sourceAccount = applyMutation.getSourceAccount();
            if ((sourceAccount != null ? sourceAccount.getType() : null) == transferAccount.getType()) {
                IraDistributionQuestionnaireResult.IraDistribution iraDistribution2 = applyMutation.getIraDistribution();
                if ((iraDistribution2 != null ? iraDistribution2.getDistributionType() : null) == (iraDistribution != null ? iraDistribution.getDistributionType() : null)) {
                    tuples2M3642to = Tuples4.m3642to(applyMutation.getCustomIraFederalWithholdingPercent(), applyMutation.getCustomIraStateWithholdingPercent());
                }
            }
        } else {
            tuples2M3642to = Tuples4.m3642to(null, null);
        }
        BigDecimal bigDecimal = (BigDecimal) tuples2M3642to.component1();
        BigDecimal bigDecimal2 = (BigDecimal) tuples2M3642to.component2();
        if (iraDistribution != null) {
            TransferAccount sinkAccount = applyMutation.getSinkAccount();
            tuples2M3642to2 = Tuples4.m3642to((sinkAccount == null || !sinkAccount.isIra()) ? applyMutation.getSinkAccount() : null, null);
        } else {
            tuples2M3642to2 = Tuples4.m3642to(applyMutation.getSinkAccount(), applyMutation.getIraContribution());
        }
        TransferAccount transferAccount3 = (TransferAccount) tuples2M3642to2.component1();
        IraContributionQuestionnaireResult.IraContribution iraContribution = (IraContributionQuestionnaireResult.IraContribution) tuples2M3642to2.component2();
        if (Intrinsics.areEqual(transferAccount != null ? transferAccount.getId() : null, transferAccount3 != null ? transferAccount3.getId() : null)) {
            transferAccount2 = defaultSinkAccount;
        } else if (transferAccount == null || !transferAccount.isExternal() || transferAccount3 == null || !transferAccount3.isExternal()) {
            transferAccount2 = transferAccount3;
        } else {
            List<TransferAccount> accounts2 = applyMutation.getAccounts();
            if (accounts2 != null) {
                defaultSinkAccount = createTransferDuxo.getDefaultSinkAccount(accounts2, transferAccount);
            }
            transferAccount2 = defaultSinkAccount;
        }
        BuildersKt__Builders_commonKt.launch$default(createTransferDuxo.getLifecycleScope(), null, null, new CreateTransferDuxo$setSourceAccount$1$1(createTransferDuxo, transferAccount, transferAccount2, applyMutation, null), 3, null);
        CreateTransferViewState createTransferViewStateCopy$default = CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, transferAccount, false, transferAccount2, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, iraContribution, iraDistribution, null, null, null, bigDecimal, bigDecimal2, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -641, -7438337, 262143, null);
        createTransferDuxo.disclosureBundlePublishSubject.accept(new DisclosureBundle(createTransferViewStateCopy$default.getMode(), transferAccount, transferAccount3));
        return createTransferViewStateCopy$default;
    }

    public final void setSinkAccount(final TransferAccount account, final IraContributionQuestionnaireResult.IraContribution iraContribution, final RecipientType outgoingWireRecipientType, final WireRoutingDetailsInputActivityResultContract3.Success wireRoutingDetails) {
        CreateTransferLogging.logAccountSelected$default(this.eventLogger, account, TransferAccountDirection.SINK, iraContribution != null ? iraContribution.toIraContributionData() : null, this.wireLoggingContext, null, this.transferConfig.getEntryPoint(), this.transferConfig.getEntryPointLoggingIdentifier(), 16, null);
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda82
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.setSinkAccount$lambda$102(this.f$0, account, iraContribution, outgoingWireRecipientType, wireRoutingDetails, (CreateTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState setSinkAccount$lambda$102(CreateTransferDuxo createTransferDuxo, TransferAccount transferAccount, IraContributionQuestionnaireResult.IraContribution iraContribution, RecipientType recipientType, WireRoutingDetailsInputActivityResultContract3.Success success, CreateTransferViewState applyMutation) {
        TransferAccount sourceAccount;
        ApiCreateTransferRequest2 frequency;
        IraDistributionQuestionnaireResult.IraDistribution iraDistribution;
        BigDecimal customIraFederalWithholdingPercent;
        BigDecimal customIraStateWithholdingPercent;
        boolean overrideDistributionPreReviewAlert;
        boolean overrideDistributionEnokiRemovalAlert;
        AchTransferOption achTransferOption;
        TransferAccountAdditionalData additionalData;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        createTransferDuxo.disclosureBundlePublishSubject.accept(new DisclosureBundle(applyMutation.getMode(), applyMutation.getSourceAccount(), transferAccount));
        if (iraContribution != null) {
            TransferAccount sourceAccount2 = applyMutation.getSourceAccount();
            sourceAccount = (sourceAccount2 == null || !sourceAccount2.isIra()) ? applyMutation.getSourceAccount() : null;
            int i = WhenMappings.$EnumSwitchMapping$1[iraContribution.getIraContributionType().ordinal()];
            if (i == 1) {
                frequency = applyMutation.getFrequency();
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                frequency = ApiCreateTransferRequest2.ONCE;
            }
            overrideDistributionPreReviewAlert = false;
            overrideDistributionEnokiRemovalAlert = false;
            iraDistribution = null;
            customIraFederalWithholdingPercent = null;
            customIraStateWithholdingPercent = null;
        } else {
            sourceAccount = applyMutation.getSourceAccount();
            frequency = applyMutation.getFrequency();
            iraDistribution = applyMutation.getIraDistribution();
            customIraFederalWithholdingPercent = applyMutation.getCustomIraFederalWithholdingPercent();
            customIraStateWithholdingPercent = applyMutation.getCustomIraStateWithholdingPercent();
            overrideDistributionPreReviewAlert = applyMutation.getOverrideDistributionPreReviewAlert();
            overrideDistributionEnokiRemovalAlert = applyMutation.getOverrideDistributionEnokiRemovalAlert();
        }
        ApiCreateTransferRequest2 apiCreateTransferRequest2 = frequency;
        createTransferDuxo.rtpAnalytics = new InstantTransferAnalyticsStateMachine();
        if (transferAccount == null || (additionalData = transferAccount.getAdditionalData()) == null || !additionalData.isDefaultWithdrawalOptionInstant()) {
            achTransferOption = null;
        } else {
            InstantTransferAnalyticsStateMachine instantTransferAnalyticsStateMachine = createTransferDuxo.rtpAnalytics;
            if (instantTransferAnalyticsStateMachine != null) {
                instantTransferAnalyticsStateMachine.sinkAccountChosenInstantDefaultSelected();
            }
            achTransferOption = AchTransferOption.INSTANT;
        }
        BuildersKt__Builders_commonKt.launch$default(createTransferDuxo.getLifecycleScope(), null, null, new CreateTransferDuxo$setSinkAccount$1$1(createTransferDuxo, sourceAccount, transferAccount, applyMutation, null), 3, null);
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, apiCreateTransferRequest2, sourceAccount, false, transferAccount, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, recipientType, success, null, null, null, null, false, null, achTransferOption != null ? new UiEvent(achTransferOption) : null, null, null, null, null, null, null, false, null, null, null, null, iraContribution, iraDistribution, null, null, null, customIraFederalWithholdingPercent, customIraStateWithholdingPercent, false, overrideDistributionPreReviewAlert, overrideDistributionEnokiRemovalAlert, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -402653889, -32604169, 262143, null);
    }

    public final void onAccountRowClicked(final TransferAccountDirection direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        CreateTransferViewState value = getStatesFlow().getValue();
        TransferConfiguration transferConfiguration = this.transferConfig;
        TransferConfiguration.OutgoingWire outgoingWire = transferConfiguration instanceof TransferConfiguration.OutgoingWire ? (TransferConfiguration.OutgoingWire) transferConfiguration : null;
        final boolean z = false;
        final boolean z2 = outgoingWire != null && outgoingWire.isFirstParty();
        Companion companion = INSTANCE;
        if (((BaseCreateTransferFragment.Args) companion.getArgs((HasSavedState) this)).getTransferConfiguration().getUseQueuedDepositMode()) {
            return;
        }
        boolean zIsSourceAccountRowFixed = value.isSourceAccountRowFixed();
        TransferConfiguration.TransferAccountSelection to = this.transferConfig.getTo();
        if (to != null && to.isFixed()) {
            z = true;
        }
        if (direction == TransferAccountDirection.SOURCE && zIsSourceAccountRowFixed) {
            return;
        }
        TransferAccountDirection transferAccountDirection = TransferAccountDirection.SINK;
        if (direction == transferAccountDirection && z) {
            return;
        }
        if (direction == transferAccountDirection && (((BaseCreateTransferFragment.Args) companion.getArgs((HasSavedState) this)).getTransferConfiguration() instanceof TransferConfiguration.GoldApyBoostMinDeposit)) {
            applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferDuxo.onAccountRowClicked$lambda$103((CreateTransferViewState) obj);
                }
            });
        } else {
            applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferDuxo.onAccountRowClicked$lambda$107(this.f$0, z2, direction, z, (CreateTransferViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onAccountRowClicked$lambda$103(CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, new UiEvent(CreateTransferViewState.ApyGoldBoostErrorEvent.DestinationAccountNotRhs.INSTANCE), false, null, null, false, null, null, null, null, false, null, false, false, -1, -1, 262111, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onAccountRowClicked$lambda$107(CreateTransferDuxo createTransferDuxo, boolean z, TransferAccountDirection transferAccountDirection, boolean z2, CreateTransferViewState applyMutation) {
        List accounts2;
        String id;
        String str;
        TransferAccount sinkAccount;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (applyMutation.getAccounts() == null || applyMutation.isCreatingTransfer()) {
            return applyMutation;
        }
        Companion companion = INSTANCE;
        GoldApyBoostMinDepositContext goldApyBoostMinDepositContext = ((BaseCreateTransferFragment.Args) companion.getArgs((HasSavedState) createTransferDuxo)).getTransferConfiguration() instanceof TransferConfiguration.GoldApyBoostMinDeposit ? new GoldApyBoostMinDepositContext(((BaseCreateTransferFragment.Args) companion.getArgs((HasSavedState) createTransferDuxo)).getTransferConfiguration().getMinDepositRate(), ((BaseCreateTransferFragment.Args) companion.getArgs((HasSavedState) createTransferDuxo)).getTransferConfiguration().getMinDepositAmount()) : null;
        MAXTransferContext.EntryPoint entryPoint = createTransferDuxo.transferConfig.getEntryPoint();
        if (z) {
            int i = WhenMappings.$EnumSwitchMapping$2[transferAccountDirection.ordinal()];
            if (i == 1) {
                List<TransferAccount> accounts3 = applyMutation.getAccounts();
                accounts2 = new ArrayList();
                for (Object obj : accounts3) {
                    TransferAccount transferAccount = (TransferAccount) obj;
                    if (transferAccount.getType() == ApiTransferAccount.TransferAccountType.RHS && !transferAccount.isManaged()) {
                        accounts2.add(obj);
                    }
                }
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                List<TransferAccount> accounts4 = applyMutation.getAccounts();
                accounts2 = new ArrayList();
                for (Object obj2 : accounts4) {
                    if (((TransferAccount) obj2).getType() == ApiTransferAccount.TransferAccountType.OUTGOING_WIRE_ACCOUNT) {
                        accounts2.add(obj2);
                    }
                }
            }
        } else {
            accounts2 = applyMutation.getAccounts();
        }
        List list = accounts2;
        int[] iArr = WhenMappings.$EnumSwitchMapping$2;
        int i2 = iArr[transferAccountDirection.ordinal()];
        if (i2 == 1) {
            TransferAccount sourceAccount = applyMutation.getSourceAccount();
            if (sourceAccount != null) {
                id = sourceAccount.getId();
                str = id;
            }
            str = null;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            TransferAccount sinkAccount2 = applyMutation.getSinkAccount();
            if (sinkAccount2 != null) {
                id = sinkAccount2.getId();
                str = id;
            }
            str = null;
        }
        int i3 = iArr[transferAccountDirection.ordinal()];
        if (i3 == 1) {
            sinkAccount = applyMutation.getSinkAccount();
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            sinkAccount = applyMutation.getSourceAccount();
        }
        TransferAccount transferAccount2 = sinkAccount;
        IraContributionQuestionnaireResult.IraContribution iraContribution = applyMutation.getIraContribution();
        IraContributionType iraContributionType = iraContribution != null ? iraContribution.getIraContributionType() : null;
        boolean zIsOutgoingWire = applyMutation.isOutgoingWire();
        RecipientType outgoingWireRecipientType = applyMutation.getOutgoingWireRecipientType();
        WiresContext wiresContext = createTransferDuxo.wireLoggingContext;
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, new UiEvent(new TransferAccountSelectionKey(entryPoint, transferAccountDirection, list, str, z2, transferAccount2, iraContributionType, false, null, null, Boolean.valueOf(zIsOutgoingWire), outgoingWireRecipientType, Boolean.valueOf(z), wiresContext != null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, wiresContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -65, -1, 16383, null) : null, goldApyBoostMinDepositContext, null, 33536, null)), null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -65537, -1, 262143, null);
    }

    public final void showFrequencyBottomSheet() {
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.showFrequencyBottomSheet$lambda$108(this.f$0, (CreateTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState showFrequencyBottomSheet$lambda$108(CreateTransferDuxo createTransferDuxo, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (applyMutation.isCreatingTransfer()) {
            return applyMutation;
        }
        Companion companion = INSTANCE;
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, new UiEvent(new TransferFrequencyBottomSheetFragmentKey(((BaseCreateTransferFragment.Args) companion.getArgs((HasSavedState) createTransferDuxo)).getTransferConfiguration() instanceof TransferConfiguration.RadHook, applyMutation.getAdjustedFrequency(), ((BaseCreateTransferFragment.Args) companion.getArgs((HasSavedState) createTransferDuxo)).getTransferConfiguration().getEntryPoint())), false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -131073, -1, 262143, null);
    }

    public final void onQuickSelectorChipSelected(QuickSelectorChip chip) {
        Intrinsics.checkNotNullParameter(chip, "chip");
        setAmount$default(this, chip.getValue(), true, null, null, false, 28, null);
    }

    public final void resetSinkToRhsAccount() {
        Observable<CreateTransferViewState> observableTake = getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        Observable<R> map = observableTake.map(new Function() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$resetSinkToRhsAccount$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((CreateTransferViewState) it).getAccounts());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((CreateTransferDuxo$resetSinkToRhsAccount$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.filterIsPresent(map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda110
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.resetSinkToRhsAccount$lambda$111(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit resetSinkToRhsAccount$lambda$111(CreateTransferDuxo createTransferDuxo, List accounts2) {
        Object next;
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Iterator it = accounts2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((TransferAccount) next).isRhs()) {
                break;
            }
        }
        TransferAccount transferAccount = (TransferAccount) next;
        if (transferAccount != null) {
            createTransferDuxo.setSinkAccount(transferAccount, null, null, null);
        }
        return Unit.INSTANCE;
    }

    public final void cancelPendingCryptoOrders() {
        Single singleDoOnSubscribe = SingleDelay2.minTimeInFlight$default(this.cryptoPendingAndCancelStore.cancelAllBuySidePendingOrders(), 1000L, null, 2, null).doOnSubscribe(new C306401());
        Intrinsics.checkNotNullExpressionValue(singleDoOnSubscribe, "doOnSubscribe(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoOnSubscribe, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda89
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.cancelPendingCryptoOrders$lambda$113(this.f$0, (ApiCryptoCancelAllPendingOrders) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda90
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.cancelPendingCryptoOrders$lambda$116(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: CreateTransferDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$cancelPendingCryptoOrders$1 */
    static final class C306401<T> implements Consumer {
        C306401() {
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            CreateTransferDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$cancelPendingCryptoOrders$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferDuxo.C306401.accept$lambda$0((CreateTransferViewState) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CreateTransferViewState accept$lambda$0(CreateTransferViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, true, null, null, null, null, false, null, false, false, -1, -1, 261631, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelPendingCryptoOrders$lambda$113(CreateTransferDuxo createTransferDuxo, final ApiCryptoCancelAllPendingOrders apiCryptoCancelAllPendingOrders) {
        createTransferDuxo.balancesStore.refreshIndividualAccount(true);
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.cancelPendingCryptoOrders$lambda$113$lambda$112(apiCryptoCancelAllPendingOrders, (CreateTransferViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState cancelPendingCryptoOrders$lambda$113$lambda$112(ApiCryptoCancelAllPendingOrders apiCryptoCancelAllPendingOrders, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, new UiEvent(apiCryptoCancelAllPendingOrders), null, null, false, null, false, false, -1, -1, 259583, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelPendingCryptoOrders$lambda$116(CreateTransferDuxo createTransferDuxo, final Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda69
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.cancelPendingCryptoOrders$lambda$116$lambda$114((CreateTransferViewState) obj);
            }
        });
        if (Throwables.isNetworkRelated(throwable)) {
            createTransferDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda70
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CreateTransferDuxo.cancelPendingCryptoOrders$lambda$116$lambda$115(throwable, (CreateTransferViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        throw throwable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState cancelPendingCryptoOrders$lambda$116$lambda$114(CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -1, 261631, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState cancelPendingCryptoOrders$lambda$116$lambda$115(Throwable th, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, new UiEvent(th), null, null, null, false, null, false, false, -1, -1, 261119, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void setAmount$default(CreateTransferDuxo createTransferDuxo, BigDecimal bigDecimal, boolean z, List list, Component.ComponentType componentType, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            componentType = null;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        createTransferDuxo.setAmount(bigDecimal, z, list, componentType, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAmount(final BigDecimal amt, final boolean enterReviewMode, final List<? extends BigDecimal> amountsForLogging, final Component.ComponentType componentOverride, final boolean logSourceAndSink) {
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda87
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.setAmount$lambda$117(enterReviewMode, this, amountsForLogging, logSourceAndSink, amt, componentOverride, (CreateTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState setAmount$lambda$117(boolean z, CreateTransferDuxo createTransferDuxo, List list, boolean z2, BigDecimal bigDecimal, Component.ComponentType componentType, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (z) {
            CreateTransferLogging.logButtonTransfer$default(createTransferDuxo.eventLogger, bigDecimal, list == null ? applyMutation.getDepositSuggestionsForLogging() : list, applyMutation.getEntryPointIdentifier(), UserInteractionEventData.Action.REVIEW_TRANSFER, null, createTransferDuxo.transferConfig.getEntryPoint(), createTransferDuxo.transferConfig.getEntryPointLoggingIdentifier(), UserInteractionEventData.EventType.TAP, null, createTransferDuxo.transferConfig.getUseQueuedDepositMode() ? QUEUED_DEPOSIT_SCREEN_IDENTIFIER : "", componentType, z2 ? applyMutation.getSourceAccount() : null, z2 ? applyMutation.getSinkAccount() : null, EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, null);
            CreateTransferLogging.logButtonTransfer$default(createTransferDuxo.eventLogger, bigDecimal, list == null ? applyMutation.getDepositSuggestionsForLogging() : list, applyMutation.getEntryPointIdentifier(), UserInteractionEventData.Action.SUBMIT_TRANSFER, null, createTransferDuxo.transferConfig.getEntryPoint(), createTransferDuxo.transferConfig.getEntryPointLoggingIdentifier(), UserInteractionEventData.EventType.APPEAR, null, createTransferDuxo.transferConfig.getUseQueuedDepositMode() ? QUEUED_DEPOSIT_SCREEN_IDENTIFIER : "", componentType, z2 ? applyMutation.getSourceAccount() : null, z2 ? applyMutation.getSinkAccount() : null, EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, null);
        }
        BuildersKt__Builders_commonKt.launch$default(createTransferDuxo.getLifecycleScope(), null, null, new CreateTransferDuxo$setAmount$1$1(createTransferDuxo, applyMutation, null), 3, null);
        NumberFormatter strikePriceFormat = Formats.getStrikePriceFormat();
        BigDecimal bigDecimalM822m = zzah$$ExternalSyntheticBackportWithForwarding0.m822m(bigDecimal);
        Intrinsics.checkNotNullExpressionValue(bigDecimalM822m, "stripTrailingZeros(...)");
        char[] charArray = strikePriceFormat.format(bigDecimalM822m).toCharArray();
        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        return CreateTransferViewState.copy$default(applyMutation, z ? CreateTransferViewState.Mode.REVIEW : CreateTransferViewState.Mode.EDIT, bigDecimal, null, null, charArray, new UiEvent(Boolean.TRUE), null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -52, -1, 262143, null);
    }

    public final void invalidateRefIdForCurrentTransfer() {
        TransferData transferData;
        getStatesFlow().getValue();
        TransfersRequestCreator.Result result = this.currentRequest;
        if (result == null || (transferData = result.getTransferData()) == null) {
            return;
        }
        this.refIdFactory.invalidateTransfer(transferData);
    }

    private final TransferAccount getDefaultSinkAccount(List<TransferAccount> list, TransferAccount transferAccount) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            TransferAccount transferAccount2 = (TransferAccount) obj;
            if (!Intrinsics.areEqual(transferAccount, transferAccount2) && (!transferAccount.isExternal() || !transferAccount2.isExternal())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == 1) {
            return (TransferAccount) CollectionsKt.first((List) arrayList);
        }
        return null;
    }

    /* compiled from: CreateTransferDuxo.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$ErrorResponse;", "", com.robinhood.models.api.ErrorResponse.DETAIL, "", com.robinhood.models.api.ErrorResponse.ERROR_CODE, "Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$ErrorResponse$ErrorCode;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$ErrorResponse$ErrorCode;)V", "getDetail", "()Ljava/lang/String;", "getError_code", "()Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$ErrorResponse$ErrorCode;", "ErrorCode", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ErrorResponse {
        public static final int $stable = 0;
        private final String detail;
        private final ErrorCode error_code;

        public ErrorResponse(String detail, ErrorCode errorCode) {
            Intrinsics.checkNotNullParameter(detail, "detail");
            this.detail = detail;
            this.error_code = errorCode;
        }

        public final String getDetail() {
            return this.detail;
        }

        public final ErrorCode getError_code() {
            return this.error_code;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CreateTransferDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$ErrorResponse$ErrorCode;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "UPSTREAM_ERROR", "DUPLICATE_REF_ID", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ErrorCode implements RhEnum<ErrorCode> {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ ErrorCode[] $VALUES;
            private final String serverValue;
            public static final ErrorCode UPSTREAM_ERROR = new ErrorCode("UPSTREAM_ERROR", 0, "upstream_error");
            public static final ErrorCode DUPLICATE_REF_ID = new ErrorCode("DUPLICATE_REF_ID", 1, "duplicate_ref_id");

            private static final /* synthetic */ ErrorCode[] $values() {
                return new ErrorCode[]{UPSTREAM_ERROR, DUPLICATE_REF_ID};
            }

            public static EnumEntries<ErrorCode> getEntries() {
                return $ENTRIES;
            }

            private ErrorCode(String str, int i, String str2) {
                this.serverValue = str2;
            }

            @Override // com.robinhood.enums.RhEnum
            public String getServerValue() {
                return this.serverValue;
            }

            static {
                ErrorCode[] errorCodeArr$values = $values();
                $VALUES = errorCodeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(errorCodeArr$values);
                INSTANCE = new Companion(null);
            }

            public static ErrorCode valueOf(String str) {
                return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
            }

            public static ErrorCode[] values() {
                return (ErrorCode[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: CreateTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$CalculatedTaxWithholdingResult;", "Landroid/os/Parcelable;", "Loading", "Success", "Error", "None", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$CalculatedTaxWithholdingResult$Error;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$CalculatedTaxWithholdingResult$Loading;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$CalculatedTaxWithholdingResult$None;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$CalculatedTaxWithholdingResult$Success;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface CalculatedTaxWithholdingResult extends Parcelable {

        /* compiled from: CreateTransferDuxo.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$CalculatedTaxWithholdingResult$Loading;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$CalculatedTaxWithholdingResult;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading implements CalculatedTaxWithholdingResult {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();
            public static final Parcelable.Creator<Loading> CREATOR = new Creator();

            /* compiled from: CreateTransferDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Loading> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Loading createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Loading.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Loading[] newArray(int i) {
                    return new Loading[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return 2098047728;
            }

            public String toString() {
                return "Loading";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private Loading() {
            }
        }

        /* compiled from: CreateTransferDuxo.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$CalculatedTaxWithholdingResult$Success;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$CalculatedTaxWithholdingResult;", "calculatedTaxWithholding", "Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;", "useManagedAccountDisplay", "", "<init>", "(Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;Z)V", "getCalculatedTaxWithholding", "()Lcom/robinhood/android/models/retirement/api/transfers/ApiIraDistributionTaxWithholding;", "getUseManagedAccountDisplay", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success implements CalculatedTaxWithholdingResult {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Success> CREATOR = new Creator();
            private final ApiIraDistributionTaxWithholding calculatedTaxWithholding;
            private final boolean useManagedAccountDisplay;

            /* compiled from: CreateTransferDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Success> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Success createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Success((ApiIraDistributionTaxWithholding) parcel.readParcelable(Success.class.getClassLoader()), parcel.readInt() != 0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Success[] newArray(int i) {
                    return new Success[i];
                }
            }

            public static /* synthetic */ Success copy$default(Success success, ApiIraDistributionTaxWithholding apiIraDistributionTaxWithholding, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    apiIraDistributionTaxWithholding = success.calculatedTaxWithholding;
                }
                if ((i & 2) != 0) {
                    z = success.useManagedAccountDisplay;
                }
                return success.copy(apiIraDistributionTaxWithholding, z);
            }

            /* renamed from: component1, reason: from getter */
            public final ApiIraDistributionTaxWithholding getCalculatedTaxWithholding() {
                return this.calculatedTaxWithholding;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getUseManagedAccountDisplay() {
                return this.useManagedAccountDisplay;
            }

            public final Success copy(ApiIraDistributionTaxWithholding calculatedTaxWithholding, boolean useManagedAccountDisplay) {
                Intrinsics.checkNotNullParameter(calculatedTaxWithholding, "calculatedTaxWithholding");
                return new Success(calculatedTaxWithholding, useManagedAccountDisplay);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.areEqual(this.calculatedTaxWithholding, success.calculatedTaxWithholding) && this.useManagedAccountDisplay == success.useManagedAccountDisplay;
            }

            public int hashCode() {
                return (this.calculatedTaxWithholding.hashCode() * 31) + Boolean.hashCode(this.useManagedAccountDisplay);
            }

            public String toString() {
                return "Success(calculatedTaxWithholding=" + this.calculatedTaxWithholding + ", useManagedAccountDisplay=" + this.useManagedAccountDisplay + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.calculatedTaxWithholding, flags);
                dest.writeInt(this.useManagedAccountDisplay ? 1 : 0);
            }

            public Success(ApiIraDistributionTaxWithholding calculatedTaxWithholding, boolean z) {
                Intrinsics.checkNotNullParameter(calculatedTaxWithholding, "calculatedTaxWithholding");
                this.calculatedTaxWithholding = calculatedTaxWithholding;
                this.useManagedAccountDisplay = z;
            }

            public /* synthetic */ Success(ApiIraDistributionTaxWithholding apiIraDistributionTaxWithholding, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(apiIraDistributionTaxWithholding, (i & 2) != 0 ? false : z);
            }

            public final ApiIraDistributionTaxWithholding getCalculatedTaxWithholding() {
                return this.calculatedTaxWithholding;
            }

            public final boolean getUseManagedAccountDisplay() {
                return this.useManagedAccountDisplay;
            }
        }

        /* compiled from: CreateTransferDuxo.kt */
        @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$CalculatedTaxWithholdingResult$Error;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$CalculatedTaxWithholdingResult;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Error implements CalculatedTaxWithholdingResult {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Error> CREATOR = new Creator();
            private final Throwable throwable;

            /* compiled from: CreateTransferDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Error> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Error createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Error((Throwable) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Error[] newArray(int i) {
                    return new Error[i];
                }
            }

            public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = error.throwable;
                }
                return error.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final Error copy(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return new Error(throwable);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            public String toString() {
                return "Error(throwable=" + this.throwable + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeSerializable(this.throwable);
            }

            public Error(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }
        }

        /* compiled from: CreateTransferDuxo.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0013\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\n\u001a\u00020\u0005HÖ\u0001J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$CalculatedTaxWithholdingResult$None;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$CalculatedTaxWithholdingResult;", "<init>", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class None implements CalculatedTaxWithholdingResult {
            public static final int $stable = 0;
            public static final None INSTANCE = new None();
            public static final Parcelable.Creator<None> CREATOR = new Creator();

            /* compiled from: CreateTransferDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<None> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final None createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return None.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final None[] newArray(int i) {
                    return new None[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof None);
            }

            public int hashCode() {
                return -197238268;
            }

            public String toString() {
                return "None";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private None() {
            }
        }
    }

    public final void selectInstantTransfers() {
        InstantTransferAnalyticsStateMachine instantTransferAnalyticsStateMachine = this.rtpAnalytics;
        if (instantTransferAnalyticsStateMachine != null) {
            instantTransferAnalyticsStateMachine.selectInstantTransferSelected();
        }
        PreCreateLoggingEvents.logPreCreateBottomSheetClick$default(this.eventLogger, PreCreatePopupType.RTP_UPSELL, UserInteractionEventData.Action.PRIMARY_CTA, null, 4, null);
        mutate(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.selectInstantTransfers$lambda$122((CreateTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState selectInstantTransfers$lambda$122(CreateTransferViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CreateTransferViewState.copy$default(it, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, new UiEvent(AchTransferOption.INSTANT), null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -134217737, 262143, null);
    }

    public final void handleDebitCardAction() {
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.handleDebitCardAction$lambda$124((CreateTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final CreateTransferViewState handleDebitCardAction$lambda$124(CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        List<TransferAccount> accounts2 = applyMutation.getAccounts();
        TransferAccount transferAccount = null;
        if (accounts2 != null) {
            Iterator<T> it = accounts2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((TransferAccount) next).getType() == ApiTransferAccount.TransferAccountType.DEBIT_CARD) {
                    transferAccount = next;
                    break;
                }
            }
            transferAccount = transferAccount;
        }
        TransferAccount transferAccount2 = transferAccount;
        if (transferAccount2 == null) {
            return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, new UiEvent(new LegacyIntentKey.DebitCardLinking(new DebitCardLinkingConfiguration.Standard(true, false, PaymentLinkingContext.EntryPoint.MAX_TRANSFER_REVIEW, null, 8, null))), null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -4097, 262143, null);
        }
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, transferAccount2, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -129, -1, 262143, null);
    }

    public final void continueTransaction(boolean skipPreCreate) {
        onContinueClick(skipPreCreate);
    }

    public final void alertDismissed() {
        mutate(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.alertDismissed$lambda$125((CreateTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState alertDismissed$lambda$125(CreateTransferViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return CreateTransferViewState.copy$default(it, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -8193, -1, 262143, null);
    }

    public final void continueWithRfp() {
        finishRfpFlow(true);
    }

    public final void fallbackToStandardTransfer() {
        finishRfpFlow(false);
    }

    private final void finishRfpFlow(boolean isInstant) {
        String str;
        ApiCreateTransferRequest apiCreateTransferRequest;
        ApiCreateTransferRequest.ApiTransferAdditionalData additional_data;
        ApiCreateTransferRequest apiCreateTransferRequest2;
        ApiCreateTransferRequest apiCreateTransferRequest3;
        ApiCreateTransferRequest.ApiTransferAdditionalData additional_data2;
        if (isInstant) {
            TransfersRequestCreator.Result result = this.currentRequest;
            ApiCreateTransferRequest.ApiTransferAdditionalData apiTransferAdditionalDataCopy$default = (result == null || (apiCreateTransferRequest3 = result.getApiCreateTransferRequest()) == null || (additional_data2 = apiCreateTransferRequest3.getAdditional_data()) == null) ? null : ApiCreateTransferRequest.ApiTransferAdditionalData.copy$default(additional_data2, null, null, null, null, 0, null, Boolean.TRUE, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 2097087, null);
            TransfersRequestCreator.Result result2 = this.currentRequest;
            ApiCreateTransferRequest apiCreateTransferRequestCopy$default = (result2 == null || (apiCreateTransferRequest2 = result2.getApiCreateTransferRequest()) == null) ? null : ApiCreateTransferRequest.copy$default(apiCreateTransferRequest2, null, null, null, null, null, null, apiTransferAdditionalDataCopy$default, null, null, null, null, false, null, 8127, null);
            if (apiCreateTransferRequestCopy$default != null) {
                UUID uuidGenerateRefId = this.refIdFactoryForRfp.generateRefId(apiCreateTransferRequestCopy$default.getAmount());
                TransfersRequestCreator.Result result3 = this.currentRequest;
                this.currentRequest = result3 != null ? TransfersRequestCreator.Result.copy$default(result3, uuidGenerateRefId, ApiCreateTransferRequest.copy$default(apiCreateTransferRequestCopy$default, uuidGenerateRefId, null, null, null, null, null, null, null, null, null, null, false, null, 8190, null), null, 4, null) : null;
            } else {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Tried to make RFP transaction but newTransferRequest was wrong."), false, null, 6, null);
            }
        }
        TransfersRequestCreator.Result result4 = this.currentRequest;
        if (result4 != null && (apiCreateTransferRequest = result4.getApiCreateTransferRequest()) != null && (additional_data = apiCreateTransferRequest.getAdditional_data()) != null) {
            additional_data.is_instant_transfer();
        }
        CreateTransferViewState value = getStatesFlow().getValue();
        if (value.getSourceAccount() != null && value.getSinkAccount() != null) {
            TransfersRequestCreator.Result result5 = this.currentRequest;
            if (result5 != null) {
                createTransferInternal(result5.getRefId(), result5.getTransferData(), result5.getApiCreateTransferRequest(), value.getSourceAccount(), value.getSinkAccount(), value.getEntryPointIdentifier(), value.getRothConversionYear(), value.getScreenIdentifier());
                return;
            }
            return;
        }
        if (isInstant) {
            str = "RFP";
        } else {
            str = "standard";
        }
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Tried to make " + str + " transaction but source and sink account were null"), false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getPreCreateContentState(CreateTransferViewState createTransferViewState, ApiCreateTransferRequest apiCreateTransferRequest, Continuation<? super CreateTransferViewState> continuation) {
        C306521 c306521;
        CreateTransferViewState createTransferViewState2;
        Exception exc;
        CreateTransferViewState createTransferViewState3;
        TransfersBonfireApi transfersBonfireApi;
        ApiPreCreateTransferSduiContainer apiPreCreateTransferSduiContainer;
        PreCreatePopupType type2;
        if (continuation instanceof C306521) {
            c306521 = (C306521) continuation;
            int i = c306521.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c306521.label = i - Integer.MIN_VALUE;
            } else {
                c306521 = new C306521(continuation);
            }
        }
        Object preCreateTransferContent = c306521.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c306521.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(preCreateTransferContent);
            try {
                transfersBonfireApi = this.transfersBonfireApi;
                createTransferViewState2 = createTransferViewState;
            } catch (Exception e) {
                e = e;
                createTransferViewState2 = createTransferViewState;
            }
            try {
                c306521.L$0 = createTransferViewState2;
                c306521.label = 1;
                preCreateTransferContent = transfersBonfireApi.getPreCreateTransferContent(apiCreateTransferRequest, c306521);
                if (preCreateTransferContent == coroutine_suspended) {
                    return coroutine_suspended;
                }
                createTransferViewState3 = createTransferViewState2;
            } catch (Exception e2) {
                e = e2;
                exc = e;
                createTransferViewState3 = createTransferViewState2;
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, exc, false, null, 4, null);
                apiPreCreateTransferSduiContainer = null;
                CreateTransferViewState createTransferViewState4 = createTransferViewState3;
                if (apiPreCreateTransferSduiContainer != null) {
                }
                switch (type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$3[type2.ordinal()]) {
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            createTransferViewState3 = (CreateTransferViewState) c306521.L$0;
            try {
                ResultKt.throwOnFailure(preCreateTransferContent);
            } catch (Exception e3) {
                exc = e3;
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, exc, false, null, 4, null);
                apiPreCreateTransferSduiContainer = null;
                CreateTransferViewState createTransferViewState42 = createTransferViewState3;
                if (apiPreCreateTransferSduiContainer != null) {
                }
                switch (type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$3[type2.ordinal()]) {
                }
            }
        }
        apiPreCreateTransferSduiContainer = (ApiPreCreateTransferSduiContainer) CollectionsKt.firstOrNull(AssetRetentionUtils.filterAssetRetentionUpsellIfNeeded(((ApiPreCreateTransferResponse) preCreateTransferContent).getPreTransferActions(), this.wonkaServiceManager));
        CreateTransferViewState createTransferViewState422 = createTransferViewState3;
        type2 = apiPreCreateTransferSduiContainer != null ? apiPreCreateTransferSduiContainer.getType() : null;
        switch (type2 == null ? -1 : WhenMappings.$EnumSwitchMapping$3[type2.ordinal()]) {
            case -1:
            case 9:
                return null;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                AlertAction<DisplayRTPUpsellAction> sduiAlertAction = apiPreCreateTransferSduiContainer.getSduiAlertAction();
                if (sduiAlertAction == null) {
                    return null;
                }
                PreCreateLoggingEvents.logPreCreateBottomSheetAppeared$default(this.eventLogger, type2, null, 2, null);
                return CreateTransferViewState.copy$default(createTransferViewState422, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, new UiEvent(new CreateTransferViewState.PreCreateGenericAlert(type2, sduiAlertAction)), null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -134217729, 262143, null);
            case 6:
                List<InstantOptionRow> instantUpsellContent = apiPreCreateTransferSduiContainer.getInstantUpsellContent();
                AlertAction<DisplayRTPUpsellAction> sduiAlertAction2 = apiPreCreateTransferSduiContainer.getSduiAlertAction();
                List<InstantOptionRow> list = instantUpsellContent;
                if (list == null || list.isEmpty() || sduiAlertAction2 == null) {
                    return null;
                }
                return CreateTransferViewState.copy$default(createTransferViewState422, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, new UiEvent(new InstantRestrictionBottomSheet.Args(instantUpsellContent, sduiAlertAction2)), null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -2049, 262143, null);
            case 7:
                return CreateTransferViewState.copy$default(createTransferViewState422, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, new UiEvent(apiPreCreateTransferSduiContainer), null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -268435457, 262143, null);
            case 8:
                AssetRetentionUpsellContent assetRetentionUpsellContent = apiPreCreateTransferSduiContainer.getAssetRetentionUpsellContent();
                return CreateTransferViewState.copy$default(createTransferViewState422, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, assetRetentionUpsellContent != null ? new UiEvent(assetRetentionUpsellContent) : null, null, false, null, false, false, -1, -1, 258047, null);
        }
    }

    public final void onMatchRateSelected() {
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda97
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onMatchRateSelected$lambda$129((CreateTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onMatchRateSelected$lambda$129(CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, true, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -1, 262141, null);
    }

    public final void onGoldNativeFundingUpsellCompleted() {
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda104
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.onGoldNativeFundingUpsellCompleted$lambda$130((CreateTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState onGoldNativeFundingUpsellCompleted$lambda$130(CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, true, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1, -1025, 262143, null);
    }

    public final void memoTextChanged(final String newMemoText) {
        Intrinsics.checkNotNullParameter(newMemoText, "newMemoText");
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda105
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.memoTextChanged$lambda$131(newMemoText, (CreateTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState memoTextChanged$lambda$131(String str, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        OutgoingWireMemoEntryData.Companion companion = OutgoingWireMemoEntryData.INSTANCE;
        String strSubstring = str.substring(0, Math.min(str.length(), 125));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, new UiEvent(new ShowOutgoingWireMemoDataHolder(companion.withMemoText(strSubstring))), str, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, 1073741823, -1, 262143, null);
    }

    public final void memoSaveSelected() {
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda91
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.memoSaveSelected$lambda$132((CreateTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState memoSaveSelected$lambda$132(CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, new UiEvent(new ShowOutgoingWireMemoDataHolder(null)), null, applyMutation.getPendingMemoText(), false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1073741825, -2, 262143, null);
    }

    public final void memoSkipSelected() {
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda78
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.memoSkipSelected$lambda$133((CreateTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState memoSkipSelected$lambda$133(CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, new UiEvent(new ShowOutgoingWireMemoDataHolder(null)), null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -1073741825, -1, 262143, null);
    }

    public final void triggerNavigationToFullWithdrawal() {
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.triggerNavigationToFullWithdrawal$lambda$134(this.f$0, (CreateTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState triggerNavigationToFullWithdrawal$lambda$134(CreateTransferDuxo createTransferDuxo, CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        TransferAccount sourceAccount = applyMutation.getSourceAccount();
        TransferAccount sinkAccount = applyMutation.getSinkAccount();
        return (sourceAccount == null || sinkAccount == null) ? applyMutation : CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, new UiEvent(new AdvisoryFullWithdrawalKey(sourceAccount.getAccountNumber(), sinkAccount.getAccountId(), applyMutation.getIraDistributionData(), createTransferDuxo.transferConfig.getEntryPoint())), false, false, -1, -1, 229375, null);
    }

    public final void clearCreatingTransfer() {
        applyMutation(new Function1() { // from class: com.robinhood.android.transfers.ui.max.CreateTransferDuxo$$ExternalSyntheticLambda83
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateTransferDuxo.clearCreatingTransfer$lambda$135((CreateTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateTransferViewState clearCreatingTransfer$lambda$135(CreateTransferViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateTransferViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, false, null, false, null, null, false, false, null, null, null, false, null, false, null, null, false, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, false, false, false, false, null, null, null, false, null, null, false, null, null, null, null, false, null, false, false, -8193, -1, 262143, null);
    }

    /* compiled from: CreateTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/ui/max/CreateTransferDuxo;", "Lcom/robinhood/android/transfers/ui/max/BaseCreateTransferFragment$Args;", "<init>", "()V", "SAVED_STATE_AMOUNT", "", "SAVED_STATE_SOURCE_ACCOUNT", "SAVED_STATE_SINK_ACCOUNT", "SAVED_STATE_CONTRIBUTION_INFO", "SAVED_STATE_DISTRIBUTION_INFO", "SAVED_STATE_IRA_TAX_WITHHOLDING", "SAVED_STATE_IRA_DISTRIBUTION_FEE", "SAVED_STATE_CUSTOM_FEDERAL_WITHHOLDING", "SAVED_STATE_CUSTOM_STATE_WITHHOLDING", "SAVED_STATE_OUTGOING_WIRE_RECIPIENT_TYPE", "QUEUED_DEPOSIT_SCREEN_IDENTIFIER", "INPUT_MAX_AMOUNT", "", "INPUT_MAX_AMOUNT_WIRE", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CreateTransferDuxo, BaseCreateTransferFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BaseCreateTransferFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (BaseCreateTransferFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public BaseCreateTransferFragment.Args getArgs(CreateTransferDuxo createTransferDuxo) {
            return (BaseCreateTransferFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, createTransferDuxo);
        }
    }
}
