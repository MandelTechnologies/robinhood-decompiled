package com.robinhood.shared.trade.crypto.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.recurring.RecurringCreationFlowParentFragment;
import com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleFragment;
import com.robinhood.android.common.recurring.trade.RecurringOrderFragment;
import com.robinhood.android.common.recurring.trade.RecurringOrderParentFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.TypefaceUtils;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.crypto.contracts.CryptoOrderIntentKey;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.style.RebrandBackgroundOverlay;
import com.robinhood.android.engagement.cryptoEducationTrading.prefs.HasCryptoTradingEducationRewardImpressionPref;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.lib.trade.BaseOrderActivity;
import com.robinhood.android.lib.trade.BaseOrderConfirmationFragment;
import com.robinhood.android.lib.trade.BaseOrderFragment;
import com.robinhood.android.lib.trade.submission.OrderSubmissionManager;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.ReturnedData;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.navigation.fragment.ReplaceFragmentBuilder;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.navigation.keys.NavigationKey;
import com.robinhood.android.recurring.contracts.RecurringOrderConfiguration;
import com.robinhood.android.referral.contracts.CryptoLearnAndEarnRewardsClaimIntentKey;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.transfers.contracts.ThreeDSecureIntentKey;
import com.robinhood.android.transfers.contracts.ThreeDSecureNavigationContract;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.librobinhood.data.store.CurrencyPairV2Store;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Order;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.util.Money;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.prefs.EnumPreference;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.contracts.CryptoSduiMessagingIntentKey;
import com.robinhood.shared.crypto.contracts.lib.TradeAction;
import com.robinhood.shared.crypto.trading.CryptoOrderManager;
import com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey;
import com.robinhood.shared.education.order.OrderTypeEducationFragmentCallbacks;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import com.robinhood.shared.education.order.OrderTypeEducationManager;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.i18n.car.CarSuitabilityType;
import com.robinhood.shared.recurring.resolver.InvestmentScheduleKeyResolver;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.activity.CryptoOrderActivityEvent;
import com.robinhood.shared.trade.crypto.p397ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerFragment;
import com.robinhood.shared.trade.crypto.p397ui.fee.submissionFailed.CryptoFeeOrderSubmissionFailedAlertDialogFragment;
import com.robinhood.shared.trade.crypto.p397ui.limitOrder.CryptoLimitOrderFragment;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderFragment;
import com.robinhood.shared.trade.crypto.p397ui.order.CryptoOrderPrices;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.CryptoOrderConfirmationFragment;
import com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector.CryptoOrderTypeSelectorFragment;
import com.robinhood.shared.trade.crypto.p397ui.price.CryptoOrderPriceFragment;
import com.robinhood.shared.trade.crypto.p397ui.price.CryptoOrderPriceGroup;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.CryptoQuoteOrderFragment;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.parent.CryptoTaxLotParentFragment;
import com.robinhood.shared.trade.crypto.p397ui.timeInForce.CryptoOrderTimeInForceFragment;
import com.robinhood.tooltips.TooltipActivity;
import com.robinhood.tooltips.TooltipManager;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.List;
import java.util.Set;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.LocalDate;

/* compiled from: CryptoOrderActivity.kt */
@Metadata(m3635d1 = {"\u0000¦\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u009c\u00022\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f2\u00020\u00102\u00020\u00112\u00020\u0012:\u0002\u009c\u0002B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00172\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J'\u0010'\u001a\u00020\u00172\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b)\u0010*JG\u00104\u001a\u00020\u00172\b\b\u0002\u0010+\u001a\u00020 2\b\b\u0002\u0010-\u001a\u00020,2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00103\u001a\u0004\u0018\u000102H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\u00172\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\b8\u00109J\u001d\u0010=\u001a\u00020\u00172\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0:H\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0017H\u0002¢\u0006\u0004\b?\u0010\u0014J\u0017\u0010A\u001a\u00020 2\u0006\u0010@\u001a\u00020 H\u0002¢\u0006\u0004\bA\u0010BJ\u0019\u0010C\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\bC\u0010\u0019J!\u0010H\u001a\u00020\u00172\u0006\u0010E\u001a\u00020D2\b\u0010G\u001a\u0004\u0018\u00010FH\u0014¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020 2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u0017H\u0016¢\u0006\u0004\bN\u0010\u0014J\u000f\u0010O\u001a\u00020\u0003H\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010S\u001a\u00020\u00172\u0006\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020 H\u0014¢\u0006\u0004\bU\u0010VJ\u000f\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\bX\u0010YJ\u001f\u0010]\u001a\u00020\u00172\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020 H\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010_\u001a\u00020\u00172\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b_\u0010#J\u0017\u0010`\u001a\u00020\u00172\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b`\u0010#J!\u0010c\u001a\u00020\u00172\b\u0010b\u001a\u0004\u0018\u00010a2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\u00172\u0006\u0010e\u001a\u00020aH\u0016¢\u0006\u0004\bf\u0010gJ\u0017\u0010h\u001a\u00020\u00172\u0006\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bh\u0010gJ\u0017\u0010i\u001a\u00020\u00172\u0006\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bi\u0010gJ\u001f\u0010j\u001a\u00020\u00172\u0006\u0010b\u001a\u00020a2\u0006\u0010e\u001a\u00020aH\u0016¢\u0006\u0004\bj\u0010kJ\u001f\u0010p\u001a\u00020\u00172\u0006\u0010m\u001a\u00020l2\u0006\u0010o\u001a\u00020nH\u0016¢\u0006\u0004\bp\u0010qJ\u001f\u0010r\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\br\u0010sJ)\u0010w\u001a\u00020\u00172\u0006\u0010R\u001a\u00020Q2\u0006\u0010t\u001a\u00020Z2\b\u0010v\u001a\u0004\u0018\u00010uH\u0016¢\u0006\u0004\bw\u0010xJ\u000f\u0010y\u001a\u00020\u0017H\u0016¢\u0006\u0004\by\u0010\u0014J\u000f\u0010z\u001a\u00020\u0017H\u0016¢\u0006\u0004\bz\u0010\u0014J\u0017\u0010}\u001a\u00020\u00172\u0006\u0010|\u001a\u00020{H\u0016¢\u0006\u0004\b}\u0010~J\u0017\u0010\u007f\u001a\u00020\u00172\u0006\u0010|\u001a\u00020{H\u0016¢\u0006\u0004\b\u007f\u0010~J\u0019\u0010\u0080\u0001\u001a\u00020\u00172\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0005\b\u0080\u0001\u00109J\u001a\u0010\u0082\u0001\u001a\u00020\u00172\u0007\u0010\u0081\u0001\u001a\u00020 H\u0016¢\u0006\u0005\b\u0082\u0001\u0010#J\u001a\u0010\u0084\u0001\u001a\u00020\u00172\u0007\u0010\u0083\u0001\u001a\u00020 H\u0016¢\u0006\u0005\b\u0084\u0001\u0010#J0\u0010\u0085\u0001\u001a\u00020\u00172\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00101\u001a\u0004\u0018\u0001002\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001b\u0010\u0088\u0001\u001a\u00020\u00172\u0007\u0010m\u001a\u00030\u0087\u0001H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J(\u0010\u008c\u0001\u001a\u00020\u00172\t\b\u0001\u0010\u008a\u0001\u001a\u00020F2\t\b\u0001\u0010\u008b\u0001\u001a\u00020FH\u0016¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J4\u0010\u0092\u0001\u001a\u00020\u00172\u000e\u0010\u008f\u0001\u001a\t\u0012\u0004\u0012\u00020\u00170\u008e\u00012\b\u0010\u0091\u0001\u001a\u00030\u0090\u00012\u0006\u0010@\u001a\u00020 H\u0016¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u0019\u0010\u0094\u0001\u001a\u00020\u00172\u0006\u0010@\u001a\u00020 H\u0016¢\u0006\u0005\b\u0094\u0001\u0010#J\u001a\u0010\u0096\u0001\u001a\u00020\u00172\u0007\u0010\u0095\u0001\u001a\u00020{H\u0016¢\u0006\u0005\b\u0096\u0001\u0010~J\u0011\u0010\u0097\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0005\b\u0097\u0001\u0010\u0014J\u0011\u0010\u0098\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0005\b\u0098\u0001\u0010\u0014J\u0019\u0010\u0099\u0001\u001a\u00020\u00172\u0006\u0010@\u001a\u00020 H\u0016¢\u0006\u0005\b\u0099\u0001\u0010#J\u001a\u0010\u009c\u0001\u001a\u00020\u00172\b\u0010\u009b\u0001\u001a\u00030\u009a\u0001¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u001a\u0010\u009e\u0001\u001a\u00020\u00172\b\u0010\u009b\u0001\u001a\u00030\u009a\u0001¢\u0006\u0006\b\u009e\u0001\u0010\u009d\u0001J\u0012\u0010\u009f\u0001\u001a\u00020 H\u0096\u0001¢\u0006\u0005\b\u009f\u0001\u0010VR\u001f\u0010 \u0001\u001a\u00020{8\u0016X\u0096D¢\u0006\u0010\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001R)\u0010¤\u0001\u001a\u00020\u00028\u0016@\u0016X\u0097.¢\u0006\u0018\n\u0006\b¤\u0001\u0010¥\u0001\u001a\u0006\b¦\u0001\u0010§\u0001\"\u0006\b¨\u0001\u0010©\u0001R0\u0010«\u0001\u001a\t\u0012\u0004\u0012\u00020u0ª\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R*\u0010²\u0001\u001a\u00030±\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R*\u0010¹\u0001\u001a\u00030¸\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¹\u0001\u0010º\u0001\u001a\u0006\b»\u0001\u0010¼\u0001\"\u0006\b½\u0001\u0010¾\u0001R*\u0010À\u0001\u001a\u00030¿\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001\"\u0006\bÄ\u0001\u0010Å\u0001R*\u0010Ç\u0001\u001a\u00030Æ\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÇ\u0001\u0010È\u0001\u001a\u0006\bÉ\u0001\u0010Ê\u0001\"\u0006\bË\u0001\u0010Ì\u0001R*\u0010Î\u0001\u001a\u00030Í\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÎ\u0001\u0010Ï\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001R*\u0010Õ\u0001\u001a\u00030Ô\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÕ\u0001\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001\"\u0006\bÙ\u0001\u0010Ú\u0001R*\u0010Ü\u0001\u001a\u00030Û\u00018\u0016@\u0016X\u0097.¢\u0006\u0018\n\u0006\bÜ\u0001\u0010Ý\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001\"\u0006\bà\u0001\u0010á\u0001R*\u0010ã\u0001\u001a\u00030â\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bã\u0001\u0010ä\u0001\u001a\u0006\bå\u0001\u0010æ\u0001\"\u0006\bç\u0001\u0010è\u0001R*\u0010ê\u0001\u001a\u00030é\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bê\u0001\u0010ë\u0001\u001a\u0006\bì\u0001\u0010í\u0001\"\u0006\bî\u0001\u0010ï\u0001R*\u0010ñ\u0001\u001a\u00030ð\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bñ\u0001\u0010ò\u0001\u001a\u0006\bó\u0001\u0010ô\u0001\"\u0006\bõ\u0001\u0010ö\u0001R\u001c\u0010÷\u0001\u001a\u0005\u0018\u00010\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b÷\u0001\u0010ø\u0001R!\u0010þ\u0001\u001a\u00030ù\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bú\u0001\u0010û\u0001\u001a\u0006\bü\u0001\u0010ý\u0001R \u0010\u0080\u0002\u001a\u00030ÿ\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u0080\u0002\u0010\u0081\u0002\u001a\u0006\b\u0082\u0002\u0010\u0083\u0002R'\u0010\u0084\u0002\u001a\u00020 8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0006\b\u0084\u0002\u0010\u0085\u0002\u001a\u0005\b\u0086\u0002\u0010V\"\u0005\b\u0087\u0002\u0010#R\u0019\u0010\u0081\u0001\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0085\u0002R&\u0010\u008b\u0002\u001a\u0011\u0012\f\u0012\n\u0012\u0005\u0012\u00030\u008a\u00020\u0089\u00020\u0088\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0002\u0010\u008c\u0002R\u001f\u0010\u008d\u0002\u001a\n\u0012\u0005\u0012\u00030\u0090\u00010\u0088\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0002\u0010\u008c\u0002R\u0017\u0010\u008f\u0002\u001a\u00020{8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008e\u0002\u0010£\u0001R\u001e\u0010\u0093\u0002\u001a\t\u0012\u0004\u0012\u00020{0\u0090\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002R\u0017\u0010\u0096\u0002\u001a\u00020n8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002R\u001f\u0010\u009b\u0002\u001a\n\u0012\u0005\u0012\u00030\u0098\u00020\u0097\u00028\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0099\u0002\u0010\u009a\u0002¨\u0006\u009d\u0002"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivity;", "Lcom/robinhood/android/lib/trade/BaseOrderActivity;", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderFragment;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderFragment$Callbacks;", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderFragment$Callbacks;", "Lcom/robinhood/shared/trade/crypto/ui/limitOrder/CryptoLimitOrderFragment$Callbacks;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/parent/CryptoTaxLotParentFragment$Callbacks;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationFragment$Callbacks;", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceFragment$Callbacks;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorFragment$Callbacks;", "Lcom/robinhood/shared/trade/crypto/ui/timeInForce/CryptoOrderTimeInForceFragment$Callbacks;", "Lcom/robinhood/android/lib/trade/BaseOrderFragment$Callbacks;", "Lcom/robinhood/android/common/recurring/trade/RecurringOrderParentFragment$Callbacks;", "Lcom/robinhood/shared/education/order/OrderTypeEducationFragmentCallbacks;", "Lcom/robinhood/shared/trade/crypto/ui/fee/submissionFailed/CryptoFeeOrderSubmissionFailedAlertDialogFragment$Callbacks;", "Lcom/robinhood/shared/trade/crypto/ui/fee/notificationPrimer/CryptoFeeTierNotificationPrimerFragment$Callbacks;", "Lcom/robinhood/tooltips/TooltipActivity;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "showOrderType", "(Landroid/os/Bundle;)V", "Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;", "orderPrices", "Lcom/robinhood/models/db/OrderTimeInForce;", "timeInForce", "showOrderFragmentM1", "(Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;Lcom/robinhood/models/db/OrderTimeInForce;)V", "", "replaceWithoutBackStack", "startLimitOrder", "(Z)V", "Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceGroup;", "priceGroup", "popBackStack", "showOrderPriceFragment", "(Lcom/robinhood/shared/trade/crypto/ui/price/CryptoOrderPriceGroup;ZZ)V", "showTimeInForce", "(Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;)V", "isFromHook", "Lcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;", "loggingEntryPoint", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "j$/time/LocalDate", "startDate", "Lcom/robinhood/models/util/Money;", "amount", "showRecurringOrderConfigurationFlow", "(ZLcom/robinhood/rosetta/eventlogging/RecurringContext$EntryPoint;Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;Lcom/robinhood/models/util/Money;)V", "Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;", "orderConfiguration", "showRecurringOrderFragment", "(Lcom/robinhood/android/recurring/contracts/RecurringOrderConfiguration;)V", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityEvent;", "event", "bindEvent", "(Lcom/robinhood/android/udf/event/Event;)V", "launchCryptoLearnAndEarnReward", "isOrderFilled", "shouldLaunchCryptoLearnAndEarnRewardConfirmation", "(Z)Z", "onCreate", "Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result$Failure;", "result", "", "errorDialogThemeOverride", "onSubmissionFailure", "(Lcom/robinhood/android/lib/trade/submission/OrderSubmissionManager$Result$Failure;Ljava/lang/Integer;)V", "Landroid/view/Menu;", "menu", "onPrepareOptionsMenu", "(Landroid/view/Menu;)Z", "onBackPressed", "createOrderCreateFragment", "()Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderFragment;", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "uiCurrencyPair", "showQuoteTickerOrderFragment", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;)V", "allowShowingOrderConfirmation", "()Z", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationFragment;", "createOrderConfirmationFragment", "()Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationFragment;", "Lcom/robinhood/models/api/CryptoOrderType;", "orderType", "isRecurringOrder", "showOrderTypeSelector", "(Lcom/robinhood/models/api/CryptoOrderType;Z)V", "convertToLimitOrder", "convertToStopOrder", "Ljava/math/BigDecimal;", "stopPrice", "convertToStopLimitOrder", "(Ljava/math/BigDecimal;Z)V", "limitPrice", "onLimitOrderPriceSelected", "(Ljava/math/BigDecimal;)V", "onStopLossOrderPriceSelected", "onStopLimitOrderStopPriceSelected", "onStopLimitOrderLimitPriceSelected", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;)V", "Lcom/robinhood/models/db/Order$Configuration;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/models/db/OrderSide;", "orderSide", "onOrderTypeInfoClicked", "(Lcom/robinhood/models/db/Order$Configuration;Lcom/robinhood/models/db/OrderSide;)V", "onTimeInForceConfirmed", "(Lcom/robinhood/models/db/OrderTimeInForce;Lcom/robinhood/shared/trade/crypto/ui/order/CryptoOrderPrices;)V", "type", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "inputMode", "onOrderTypeSelected", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/api/CryptoOrderType;Lcom/robinhood/shared/formats/crypto/CryptoInputMode;)V", "onTaxLotTypeSelected", "onRecurringOrderSelected", "", "accountNumber", "startOrderConfigurationSelection", "(Ljava/lang/String;)V", "editRecurringOrder", "setRecurringOrderConfiguration", "isReviewing", "onReviewingStateChanged", "reviewing", "onReviewStateChanged", "enterRecurringFlowFromHook", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;Lcom/robinhood/models/util/Money;)V", "Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;", "onOrderTypeEducationFinished", "(Lcom/robinhood/shared/education/contracts/OrderTypeEducationFragmentKey$OrderTypeEducationConfiguration;)V", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, OrderTypeEducationLearnMoreFragment.ARG_DESCRIPTION_RES, "onLearnMoreClicked", "(II)V", "Lkotlin/Function0;", "launchPostTradeUpsell", "Landroid/content/Intent;", "postTradeUpsellIntent", "launchPostUpsellAndMaybeLearnEarnRewardAndFinish", "(Lkotlin/jvm/functions/Function0;Landroid/content/Intent;Z)V", "onOrderFlowFinished", "url", "onBillingOrder3DSecureRedirect", "convertToRebateOrder", "cancelTradeFlow", "onContinueToNotificationPrimer", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderSubmissionFailureCallbacks;", "callbacks", "setOrderSubmissionFailureCallbacks", "(Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderSubmissionFailureCallbacks;)V", "removeOrderSubmissionFailureCallbacks", "onDismissUnsupportedFeatureDialog", "analyticsErrorString", "Ljava/lang/String;", "getAnalyticsErrorString", "()Ljava/lang/String;", "orderManager", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;", "getOrderManager", "()Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;", "setOrderManager", "(Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;)V", "Lcom/robinhood/prefs/EnumPreference;", "cryptoInputModePref", "Lcom/robinhood/prefs/EnumPreference;", "getCryptoInputModePref", "()Lcom/robinhood/prefs/EnumPreference;", "setCryptoInputModePref", "(Lcom/robinhood/prefs/EnumPreference;)V", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "currencyPairStore", "Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "getCurrencyPairStore", "()Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;", "setCurrencyPairStore", "(Lcom/robinhood/librobinhood/data/store/CurrencyPairV2Store;)V", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "getCryptoExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "setCryptoExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;)V", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "getCryptoAccountProvider", "()Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "setCryptoAccountProvider", "(Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;)V", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "Lcom/robinhood/shared/education/order/OrderTypeEducationManager;", "orderTypeEducationManager", "Lcom/robinhood/shared/education/order/OrderTypeEducationManager;", "getOrderTypeEducationManager", "()Lcom/robinhood/shared/education/order/OrderTypeEducationManager;", "setOrderTypeEducationManager", "(Lcom/robinhood/shared/education/order/OrderTypeEducationManager;)V", "Lcom/robinhood/shared/app/type/AppType;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "Lcom/robinhood/tooltips/TooltipManager;", "tooltipManager", "Lcom/robinhood/tooltips/TooltipManager;", "getTooltipManager", "()Lcom/robinhood/tooltips/TooltipManager;", "setTooltipManager", "(Lcom/robinhood/tooltips/TooltipManager;)V", "Lcom/robinhood/coroutines/rx/RxFactory;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "getRxFactory", "()Lcom/robinhood/coroutines/rx/RxFactory;", "setRxFactory", "(Lcom/robinhood/coroutines/rx/RxFactory;)V", "Lcom/robinhood/shared/recurring/resolver/InvestmentScheduleKeyResolver;", "recurringKeyResolver", "Lcom/robinhood/shared/recurring/resolver/InvestmentScheduleKeyResolver;", "getRecurringKeyResolver", "()Lcom/robinhood/shared/recurring/resolver/InvestmentScheduleKeyResolver;", "setRecurringKeyResolver", "(Lcom/robinhood/shared/recurring/resolver/InvestmentScheduleKeyResolver;)V", "Lcom/robinhood/prefs/BooleanPreference;", "hasCryptoTradingEducationRewardImpressionPref", "Lcom/robinhood/prefs/BooleanPreference;", "getHasCryptoTradingEducationRewardImpressionPref", "()Lcom/robinhood/prefs/BooleanPreference;", "setHasCryptoTradingEducationRewardImpressionPref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "orderSubmissionFailureCallbacks", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderSubmissionFailureCallbacks;", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "getDuxo", "()Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivityDuxo;", "duxo", "Lcom/robinhood/shared/i18n/car/CarSuitabilityType$Unsupported;", "carSuitabilityType", "Lcom/robinhood/shared/i18n/car/CarSuitabilityType$Unsupported;", "getCarSuitabilityType", "()Lcom/robinhood/shared/i18n/car/CarSuitabilityType$Unsupported;", "finishActivityAfterSuitabilityQuestionnaire", "Z", "getFinishActivityAfterSuitabilityQuestionnaire", "setFinishActivityAfterSuitabilityQuestionnaire", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/android/navigation/contracts/NavigationActivityResultContract$NavigationParams;", "Lcom/robinhood/android/transfers/contracts/ThreeDSecureIntentKey;", "billingOrder3DSecureLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "cryptoPostTradeUpsellLauncher", "getScreenName", "screenName", "Lio/reactivex/Observable;", "getAccountNumberObs", "()Lio/reactivex/Observable;", "accountNumberObs", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "side", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "requiresRegionGates", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoOrderActivity extends BaseOrderActivity<CryptoOrderManager, CryptoOrderFragment> implements CryptoQuoteOrderFragment.Callbacks, CryptoOrderFragment.Callbacks, CryptoLimitOrderFragment.Callbacks, CryptoTaxLotParentFragment.Callbacks, CryptoOrderConfirmationFragment.Callbacks, CryptoOrderPriceFragment.Callbacks, CryptoOrderTypeSelectorFragment.Callbacks, CryptoOrderTimeInForceFragment.Callbacks, BaseOrderFragment.Callbacks, RecurringOrderParentFragment.Callbacks, OrderTypeEducationFragmentCallbacks, CryptoFeeOrderSubmissionFailedAlertDialogFragment.Callbacks, CryptoFeeTierNotificationPrimerFragment.Callbacks, TooltipActivity, RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public AccountProvider accountProvider;
    private final String analyticsErrorString;
    public AppType appType;
    private final ActivityResultLauncher<NavigationActivityResultContract.NavigationParams<ThreeDSecureIntentKey>> billingOrder3DSecureLauncher;
    private final CarSuitabilityType.Unsupported carSuitabilityType;
    public CryptoAccountProvider cryptoAccountProvider;
    public CryptoExperimentsStore cryptoExperimentsStore;
    public EnumPreference<CryptoInputMode> cryptoInputModePref;
    private final ActivityResultLauncher<Intent> cryptoPostTradeUpsellLauncher;
    public CurrencyPairV2Store currencyPairStore;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private boolean finishActivityAfterSuitabilityQuestionnaire;

    @HasCryptoTradingEducationRewardImpressionPref
    public BooleanPreference hasCryptoTradingEducationRewardImpressionPref;
    private boolean isReviewing;
    public CryptoOrderManager orderManager;
    private CryptoOrderSubmissionFailureCallbacks orderSubmissionFailureCallbacks;
    public OrderTypeEducationManager orderTypeEducationManager;
    public InvestmentScheduleKeyResolver recurringKeyResolver;
    public RxFactory rxFactory;
    public TooltipManager tooltipManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Set<String> CRYPTO_LEARN_EARN_REWARD_ENTRYPOINT = SetsKt.setOf((Object[]) new String[]{"crypto_education_trading_1_dollar", "crypto_education_trading_5_dollar"});
    private static final Set<String> STAKING_ENTRYPOINT = SetsKt.setOf(CryptoOrderIntentKey.ENTRYPOINT_STAKING);

    /* compiled from: CryptoOrderActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;
        public static final /* synthetic */ int[] $EnumSwitchMapping$5;

        static {
            int[] iArr = new int[TradeAction.values().length];
            try {
                iArr[TradeAction.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TradeAction.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CryptoOrderIntentKey.OrderType.values().length];
            try {
                iArr2[CryptoOrderIntentKey.OrderType.TAX_LOTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CryptoOrderIntentKey.OrderType.STOP_LIMIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CryptoOrderIntentKey.OrderType.LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CryptoOrderIntentKey.OrderType.MARKET.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CryptoOrderIntentKey.OrderType.STOP_LOSS.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CryptoOrderIntentKey.OrderType.RECURRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AppType.values().length];
            try {
                iArr3[AppType.RHC.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[AppType.NCW.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[AppType.TRADER.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[CryptoInputMode.values().length];
            try {
                iArr4[CryptoInputMode.QUOTE_CURRENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[CryptoInputMode.ASSET_CURRENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[CryptoOrderType.values().length];
            try {
                iArr5[CryptoOrderType.LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[CryptoOrderType.MARKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[CryptoOrderType.STOP_LOSS.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr5[CryptoOrderType.STOP_LIMIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$4 = iArr5;
            int[] iArr6 = new int[Order.Configuration.values().length];
            try {
                iArr6[Order.Configuration.LIMIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr6[Order.Configuration.STOP_LOSS.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr6[Order.Configuration.STOP_LIMIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$5 = iArr6;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindEvent(final Event<CryptoOrderActivityEvent> event) {
        EventConsumer<CryptoOrderActivityEvent> eventConsumerInvoke;
        EventConsumer<CryptoOrderActivityEvent> eventConsumerInvoke2;
        EventConsumer<CryptoOrderActivityEvent> eventConsumerInvoke3;
        EventConsumer<CryptoOrderActivityEvent> eventConsumerInvoke4;
        EventConsumer<CryptoOrderActivityEvent> eventConsumerInvoke5;
        if ((event.getData() instanceof CryptoOrderActivityEvent.ShowScreen) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.activity.CryptoOrderActivity$bindEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25798invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25798invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Navigator.DefaultImpls.startActivity$default(this.getNavigator(), this, new CryptoSduiMessagingIntentKey(((CryptoOrderActivityEvent.ShowScreen) event.getData()).getSduiMessagingScreen()), null, false, null, null, 60, null);
                }
            });
        }
        if ((event.getData() instanceof CryptoOrderActivityEvent.ShowGenericSubmissionFailureAlert) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.activity.CryptoOrderActivity$bindEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                    m25799invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25799invoke(Object it) throws Throwable {
                    CryptoOrderSubmissionFailureCallbacks cryptoOrderSubmissionFailureCallbacks;
                    Intrinsics.checkNotNullParameter(it, "it");
                    CryptoOrderActivityEvent.ShowGenericSubmissionFailureAlert showGenericSubmissionFailureAlert = (CryptoOrderActivityEvent.ShowGenericSubmissionFailureAlert) event.getData();
                    super/*com.robinhood.android.lib.trade.BaseOrderActivity*/.onSubmissionFailure(showGenericSubmissionFailureAlert.getResult(), Integer.valueOf(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome));
                    if (!showGenericSubmissionFailureAlert.getSetFormStateToEditing() || (cryptoOrderSubmissionFailureCallbacks = this.orderSubmissionFailureCallbacks) == null) {
                        return;
                    }
                    cryptoOrderSubmissionFailureCallbacks.setFormStateToEditing();
                }
            });
        }
        if ((event.getData() instanceof CryptoOrderActivityEvent.ShowFeeOrderSubmissionFailedAlert) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.activity.CryptoOrderActivity$bindEvent$$inlined$consumeIfType$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25800invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25800invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    CryptoFeeOrderSubmissionFailedAlertDialogFragment cryptoFeeOrderSubmissionFailedAlertDialogFragment = (CryptoFeeOrderSubmissionFailedAlertDialogFragment) CryptoFeeOrderSubmissionFailedAlertDialogFragment.INSTANCE.newInstance();
                    FragmentManager supportFragmentManager = this.getSupportFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                    cryptoFeeOrderSubmissionFailedAlertDialogFragment.show(supportFragmentManager, "feeOrderSubmissionFailedAlertDialog");
                    this.popEntireFragmentBackstack();
                }
            });
        }
        if ((event.getData() instanceof CryptoOrderActivityEvent.ShowCryptoOrderTypeSelector) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.activity.CryptoOrderActivity$bindEvent$$inlined$consumeIfType$4
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25801invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25801invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    CryptoOrderActivityEvent.ShowCryptoOrderTypeSelector showCryptoOrderTypeSelector = (CryptoOrderActivityEvent.ShowCryptoOrderTypeSelector) event.getData();
                    CryptoOrderActivity cryptoOrderActivity = this;
                    cryptoOrderActivity.replaceFragment(CryptoOrderTypeSelectorFragment.INSTANCE.newInstance((Parcelable) new CryptoOrderTypeSelectorFragment.Args(((CryptoOrderIntentKey) CryptoOrderActivity.INSTANCE.getExtras((Activity) this)).getCurrencyPairId(), cryptoOrderActivity.getSide(), showCryptoOrderTypeSelector.getOrderType(), this.getOrderUuid(), showCryptoOrderTypeSelector.isRecurringOrder(), showCryptoOrderTypeSelector.getInitialMonetizationModelPreference())));
                }
            });
        }
        if (!(event.getData() instanceof CryptoOrderActivityEvent.ShowBillingOrderFailureAlert) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.activity.CryptoOrderActivity$bindEvent$$inlined$consumeIfType$5
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m25802invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m25802invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                CryptoOrderActivityEvent.ShowBillingOrderFailureAlert showBillingOrderFailureAlert = (CryptoOrderActivityEvent.ShowBillingOrderFailureAlert) event.getData();
                RhDialogFragment.Builder positiveButton = RhDialogFragment.INSTANCE.create(this).setId(C40095R.id.dialog_id_billing_order_failure).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setTitle(showBillingOrderFailureAlert.getTitle(), new Object[0]).setMessage(showBillingOrderFailureAlert.getMessage(), new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
                FragmentManager supportFragmentManager = this.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "billingOrderFailureAlert", false, 4, null);
                this.popEntireFragmentBackstack();
            }
        });
    }

    public CryptoOrderActivity() {
        super(C40095R.layout.activity_crypto_order);
        this.$$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);
        this.analyticsErrorString = AnalyticsStrings.ERROR_PLACE_CRYPTO_ORDER;
        this.duxo = DuxosKt.duxo(this, CryptoOrderActivityDuxo.class);
        this.carSuitabilityType = CarSuitabilityType.Unsupported.INSTANCE;
        this.billingOrder3DSecureLauncher = registerForActivityResult(new ThreeDSecureNavigationContract(new Function0() { // from class: com.robinhood.shared.trade.crypto.activity.CryptoOrderActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.f$0.getNavigator();
            }
        }), new ActivityResultCallback() { // from class: com.robinhood.shared.trade.crypto.activity.CryptoOrderActivity$billingOrder3DSecureLauncher$2
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ThreeDSecureNavigationContract.Result result) {
                if (Intrinsics.areEqual(result, ThreeDSecureNavigationContract.Result.Completed.INSTANCE)) {
                    this.this$0.getOrderManager().setBillingOrder3DSecureComplete();
                } else if (Intrinsics.areEqual(result, ThreeDSecureNavigationContract.Result.Canceled.INSTANCE)) {
                    this.this$0.finish();
                } else if (result != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        });
        this.cryptoPostTradeUpsellLauncher = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.shared.trade.crypto.activity.CryptoOrderActivity$cryptoPostTradeUpsellLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.launchCryptoLearnAndEarnReward();
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return "ForexOrderActivity";
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderActivity
    public String getAnalyticsErrorString() {
        return this.analyticsErrorString;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderActivity
    public CryptoOrderManager getOrderManager() {
        CryptoOrderManager cryptoOrderManager = this.orderManager;
        if (cryptoOrderManager != null) {
            return cryptoOrderManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderManager");
        return null;
    }

    public void setOrderManager(CryptoOrderManager cryptoOrderManager) {
        Intrinsics.checkNotNullParameter(cryptoOrderManager, "<set-?>");
        this.orderManager = cryptoOrderManager;
    }

    public final EnumPreference<CryptoInputMode> getCryptoInputModePref() {
        EnumPreference<CryptoInputMode> enumPreference = this.cryptoInputModePref;
        if (enumPreference != null) {
            return enumPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cryptoInputModePref");
        return null;
    }

    public final void setCryptoInputModePref(EnumPreference<CryptoInputMode> enumPreference) {
        Intrinsics.checkNotNullParameter(enumPreference, "<set-?>");
        this.cryptoInputModePref = enumPreference;
    }

    public final CurrencyPairV2Store getCurrencyPairStore() {
        CurrencyPairV2Store currencyPairV2Store = this.currencyPairStore;
        if (currencyPairV2Store != null) {
            return currencyPairV2Store;
        }
        Intrinsics.throwUninitializedPropertyAccessException("currencyPairStore");
        return null;
    }

    public final void setCurrencyPairStore(CurrencyPairV2Store currencyPairV2Store) {
        Intrinsics.checkNotNullParameter(currencyPairV2Store, "<set-?>");
        this.currencyPairStore = currencyPairV2Store;
    }

    public final CryptoExperimentsStore getCryptoExperimentsStore() {
        CryptoExperimentsStore cryptoExperimentsStore = this.cryptoExperimentsStore;
        if (cryptoExperimentsStore != null) {
            return cryptoExperimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cryptoExperimentsStore");
        return null;
    }

    public final void setCryptoExperimentsStore(CryptoExperimentsStore cryptoExperimentsStore) {
        Intrinsics.checkNotNullParameter(cryptoExperimentsStore, "<set-?>");
        this.cryptoExperimentsStore = cryptoExperimentsStore;
    }

    public final CryptoAccountProvider getCryptoAccountProvider() {
        CryptoAccountProvider cryptoAccountProvider = this.cryptoAccountProvider;
        if (cryptoAccountProvider != null) {
            return cryptoAccountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("cryptoAccountProvider");
        return null;
    }

    public final void setCryptoAccountProvider(CryptoAccountProvider cryptoAccountProvider) {
        Intrinsics.checkNotNullParameter(cryptoAccountProvider, "<set-?>");
        this.cryptoAccountProvider = cryptoAccountProvider;
    }

    public final AccountProvider getAccountProvider() {
        AccountProvider accountProvider = this.accountProvider;
        if (accountProvider != null) {
            return accountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountProvider");
        return null;
    }

    public final void setAccountProvider(AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "<set-?>");
        this.accountProvider = accountProvider;
    }

    public final OrderTypeEducationManager getOrderTypeEducationManager() {
        OrderTypeEducationManager orderTypeEducationManager = this.orderTypeEducationManager;
        if (orderTypeEducationManager != null) {
            return orderTypeEducationManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("orderTypeEducationManager");
        return null;
    }

    public final void setOrderTypeEducationManager(OrderTypeEducationManager orderTypeEducationManager) {
        Intrinsics.checkNotNullParameter(orderTypeEducationManager, "<set-?>");
        this.orderTypeEducationManager = orderTypeEducationManager;
    }

    public final AppType getAppType() {
        AppType appType = this.appType;
        if (appType != null) {
            return appType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("appType");
        return null;
    }

    public final void setAppType(AppType appType) {
        Intrinsics.checkNotNullParameter(appType, "<set-?>");
        this.appType = appType;
    }

    @Override // com.robinhood.tooltips.TooltipActivity
    public TooltipManager getTooltipManager() {
        TooltipManager tooltipManager = this.tooltipManager;
        if (tooltipManager != null) {
            return tooltipManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tooltipManager");
        return null;
    }

    public void setTooltipManager(TooltipManager tooltipManager) {
        Intrinsics.checkNotNullParameter(tooltipManager, "<set-?>");
        this.tooltipManager = tooltipManager;
    }

    public final RxFactory getRxFactory() {
        RxFactory rxFactory = this.rxFactory;
        if (rxFactory != null) {
            return rxFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rxFactory");
        return null;
    }

    public final void setRxFactory(RxFactory rxFactory) {
        Intrinsics.checkNotNullParameter(rxFactory, "<set-?>");
        this.rxFactory = rxFactory;
    }

    public final InvestmentScheduleKeyResolver getRecurringKeyResolver() {
        InvestmentScheduleKeyResolver investmentScheduleKeyResolver = this.recurringKeyResolver;
        if (investmentScheduleKeyResolver != null) {
            return investmentScheduleKeyResolver;
        }
        Intrinsics.throwUninitializedPropertyAccessException("recurringKeyResolver");
        return null;
    }

    public final void setRecurringKeyResolver(InvestmentScheduleKeyResolver investmentScheduleKeyResolver) {
        Intrinsics.checkNotNullParameter(investmentScheduleKeyResolver, "<set-?>");
        this.recurringKeyResolver = investmentScheduleKeyResolver;
    }

    public final BooleanPreference getHasCryptoTradingEducationRewardImpressionPref() {
        BooleanPreference booleanPreference = this.hasCryptoTradingEducationRewardImpressionPref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hasCryptoTradingEducationRewardImpressionPref");
        return null;
    }

    public final void setHasCryptoTradingEducationRewardImpressionPref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.hasCryptoTradingEducationRewardImpressionPref = booleanPreference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CryptoOrderActivityDuxo getDuxo() {
        return (CryptoOrderActivityDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderActivity
    public CarSuitabilityType.Unsupported getCarSuitabilityType() {
        return this.carSuitabilityType;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderActivity
    public boolean getFinishActivityAfterSuitabilityQuestionnaire() {
        return this.finishActivityAfterSuitabilityQuestionnaire;
    }

    public void setFinishActivityAfterSuitabilityQuestionnaire(boolean z) {
        this.finishActivityAfterSuitabilityQuestionnaire = z;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderActivity
    public Observable<String> getAccountNumberObs() {
        return getAccountProvider().streamIndividualAccountNumber();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderActivity
    public OrderSide getSide() {
        int i = WhenMappings.$EnumSwitchMapping$0[((CryptoOrderIntentKey) INSTANCE.getExtras((Activity) this)).getAction().ordinal()];
        if (i == 1) {
            return OrderSide.BUY;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return OrderSide.SELL;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderActivity, com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), RebrandBackgroundOverlay.INSTANCE, null, 2, null);
        Companion companion = INSTANCE;
        if (((CryptoOrderIntentKey) companion.getExtras((Activity) this)).getRecurringAction() instanceof CryptoOrderIntentKey.RecurringAction.ShowOrderConfiguration) {
            CryptoOrderIntentKey.RecurringAction recurringAction = ((CryptoOrderIntentKey) companion.getExtras((Activity) this)).getRecurringAction();
            Intrinsics.checkNotNull(recurringAction, "null cannot be cast to non-null type com.robinhood.android.crypto.contracts.CryptoOrderIntentKey.RecurringAction.ShowOrderConfiguration");
            showRecurringOrderFragment(((CryptoOrderIntentKey.RecurringAction.ShowOrderConfiguration) recurringAction).getConfiguration());
        } else if (((CryptoOrderIntentKey) companion.getExtras((Activity) this)).getOrderType() != null) {
            CryptoOrderIntentKey.OrderType orderType = ((CryptoOrderIntentKey) companion.getExtras((Activity) this)).getOrderType();
            if (orderType == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            switch (WhenMappings.$EnumSwitchMapping$1[orderType.ordinal()]) {
                case 1:
                    onTaxLotTypeSelected();
                    break;
                case 2:
                    convertToStopLimitOrder(null, true);
                    break;
                case 3:
                    convertToLimitOrder(true);
                    break;
                case 4:
                    showOrderType(savedInstanceState);
                    break;
                case 5:
                    convertToStopOrder(true);
                    break;
                case 6:
                    showRecurringOrderConfigurationFlow$default(this, false, null, null, null, null, 31, null);
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } else {
            showOrderType(savedInstanceState);
        }
        BaseActivity.collectDuxoState$default(this, null, new C400961(null), 1, null);
    }

    /* compiled from: CryptoOrderActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.activity.CryptoOrderActivity$onCreate$1", m3645f = "CryptoOrderActivity.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.activity.CryptoOrderActivity$onCreate$1 */
    static final class C400961 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C400961(Continuation<? super C400961> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderActivity.this.new C400961(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C400961) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoOrderActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.activity.CryptoOrderActivity$onCreate$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ CryptoOrderActivity $tmp0;

            AnonymousClass1(CryptoOrderActivity cryptoOrderActivity) {
                this.$tmp0 = cryptoOrderActivity;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, CryptoOrderActivity.class, "bindEvent", "bindEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<CryptoOrderActivityEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$bindEvent = C400961.invokeSuspend$bindEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$bindEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bindEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<CryptoOrderActivityEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$bindEvent(CryptoOrderActivity cryptoOrderActivity, Event event, Continuation continuation) {
            cryptoOrderActivity.bindEvent(event);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(CryptoOrderActivity.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderActivity.this);
                this.label = 1;
                if (flowFilterNotNull.collect(anonymousClass1, this) == coroutine_suspended) {
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
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderActivity
    protected void onSubmissionFailure(OrderSubmissionManager.Result.Failure result, Integer errorDialogThemeOverride) {
        Intrinsics.checkNotNullParameter(result, "result");
        getDuxo().onSubmissionFailure(result);
    }

    private final void showOrderType(Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            Observable<UiCurrencyPair> observableTake = getCurrencyPairStore().streamCurrencyPair(((CryptoOrderIntentKey) INSTANCE.getExtras((Activity) this)).getCurrencyPairId()).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.trade.crypto.activity.CryptoOrderActivity$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoOrderActivity.showOrderType$lambda$1(this.f$0, (UiCurrencyPair) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showOrderType$lambda$1(CryptoOrderActivity cryptoOrderActivity, UiCurrencyPair uiCurrencyPair) {
        Intrinsics.checkNotNull(uiCurrencyPair);
        cryptoOrderActivity.onOrderTypeSelected(uiCurrencyPair, CryptoOrderType.MARKET, (CryptoInputMode) cryptoOrderActivity.getCryptoInputModePref().getValue());
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        boolean zOnPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
        TypefaceUtils.INSTANCE.applyFontToMenu(this, menu, RhTypeface.MEDIUM_CONDENSED.load(this));
        return zOnPrepareOptionsMenu;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        FragmentManager childFragmentManager;
        List<Fragment> fragments;
        Fragment currentFragment = getCurrentFragment();
        Fragment fragment = (currentFragment == null || (childFragmentManager = currentFragment.getChildFragmentManager()) == null || (fragments = childFragmentManager.getFragments()) == null) ? null : (Fragment) CollectionsKt.firstOrNull((List) fragments);
        if ((fragment instanceof RecurringOrderScheduleFragment) || (fragment instanceof RecurringOrderParentFragment) || (fragment instanceof RecurringOrderFragment) || (fragment instanceof RecurringCreationFlowParentFragment)) {
            if (!this.isReviewing) {
                finish();
                return;
            } else {
                super.onBackPressed();
                return;
            }
        }
        super.onBackPressed();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderActivity
    public CryptoOrderFragment createOrderCreateFragment() {
        return (CryptoOrderFragment) CryptoOrderFragment.INSTANCE.newInstance((Parcelable) new CryptoOrderFragment.Args(((CryptoOrderIntentKey) INSTANCE.getExtras((Activity) this)).getCurrencyPairId(), getSide(), getOrderUuid(), CryptoOrderPrices.Market.INSTANCE, OrderTimeInForce.GTC));
    }

    private final void showOrderFragmentM1(CryptoOrderPrices orderPrices, OrderTimeInForce timeInForce) {
        popEntireFragmentBackstack();
        replaceFragmentWithoutBackStack((CryptoOrderFragment) CryptoOrderFragment.INSTANCE.newInstance((Parcelable) new CryptoOrderFragment.Args(((CryptoOrderIntentKey) INSTANCE.getExtras((Activity) this)).getCurrencyPairId(), getSide(), getOrderUuid(), orderPrices, timeInForce)));
    }

    @Override // com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.Callbacks
    public void showQuoteTickerOrderFragment(UiCurrencyPair uiCurrencyPair) {
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        EnumPreference<CryptoInputMode> cryptoInputModePref = getCryptoInputModePref();
        CryptoInputMode cryptoInputMode = CryptoInputMode.QUOTE_CURRENCY;
        cryptoInputModePref.setValue(cryptoInputMode);
        popEntireFragmentBackstack();
        replaceFragmentWithoutBackStack((CryptoQuoteOrderFragment) CryptoQuoteOrderFragment.INSTANCE.newInstance((Parcelable) new CryptoQuoteOrderFragment.Args(uiCurrencyPair, getSide(), cryptoInputMode, getOrderUuid())));
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderActivity
    protected boolean allowShowingOrderConfirmation() {
        Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag(BaseOrderActivity.getTAG_ORDER_CONFIRMATION_FRAGMENT());
        if (fragmentFindFragmentByTag == null) {
            fragmentFindFragmentByTag = getCurrentFragment();
        }
        return !(fragmentFindFragmentByTag instanceof BaseOrderConfirmationFragment);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderActivity
    public CryptoOrderConfirmationFragment createOrderConfirmationFragment() {
        return (CryptoOrderConfirmationFragment) CryptoOrderConfirmationFragment.INSTANCE.newInstance((Parcelable) new CryptoOrderConfirmationFragment.InitArgs(((CryptoOrderIntentKey) INSTANCE.getExtras((Activity) this)).getSource()));
    }

    @Override // com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.Callbacks, com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.Callbacks, com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment.Callbacks, com.robinhood.shared.trade.crypto.ui.taxLots.parent.CryptoTaxLotParentFragment.Callbacks
    public void showOrderTypeSelector(CryptoOrderType orderType, boolean isRecurringOrder) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        getDuxo().onShowOrderTypeSelector(orderType, isRecurringOrder);
    }

    @Override // com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.Callbacks
    public void convertToLimitOrder(boolean replaceWithoutBackStack) {
        if (getAppType() == AppType.RHC) {
            OrderTypeEducationManager orderTypeEducationManager = getOrderTypeEducationManager();
            Order.Configuration configuration = Order.Configuration.LIMIT;
            if (OrderTypeEducationManager.shouldShowEducation$default(orderTypeEducationManager, configuration, getSide(), null, false, 4, null)) {
                replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new OrderTypeEducationFragmentKey(new OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder(configuration, getSide(), null, getOrderUuid(), true, OrderTypeEducationFragmentKey.NavIconType.BACK_BUTTON, replaceWithoutBackStack)), null, 2, null));
                return;
            }
        }
        startLimitOrder(replaceWithoutBackStack);
    }

    @Override // com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.Callbacks
    public void convertToStopOrder(boolean replaceWithoutBackStack) {
        OrderTypeEducationManager orderTypeEducationManager = getOrderTypeEducationManager();
        Order.Configuration configuration = Order.Configuration.STOP_LOSS;
        if (OrderTypeEducationManager.shouldShowEducation$default(orderTypeEducationManager, configuration, getSide(), null, false, 4, null)) {
            Fragment fragmentCreateFragment$default = Navigator.DefaultImpls.createFragment$default(getNavigator(), new OrderTypeEducationFragmentKey(new OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder(configuration, getSide(), ((CryptoOrderIntentKey) INSTANCE.getExtras((Activity) this)).getCurrencyPairId(), getOrderUuid(), true, OrderTypeEducationFragmentKey.NavIconType.BACK_BUTTON, replaceWithoutBackStack)), null, 2, null);
            if (replaceWithoutBackStack) {
                replaceFragmentWithoutBackStack(fragmentCreateFragment$default);
                return;
            } else {
                replaceFragment(fragmentCreateFragment$default);
                return;
            }
        }
        showOrderPriceFragment(new CryptoOrderPriceGroup.StopLoss(null), true, replaceWithoutBackStack);
    }

    @Override // com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.Callbacks
    public void convertToStopLimitOrder(BigDecimal stopPrice, boolean replaceWithoutBackStack) {
        OrderTypeEducationManager orderTypeEducationManager = getOrderTypeEducationManager();
        Order.Configuration configuration = Order.Configuration.STOP_LIMIT;
        if (OrderTypeEducationManager.shouldShowEducation$default(orderTypeEducationManager, configuration, getSide(), null, false, 4, null)) {
            Fragment fragmentCreateFragment$default = Navigator.DefaultImpls.createFragment$default(getNavigator(), new OrderTypeEducationFragmentKey(new OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder(configuration, getSide(), ((CryptoOrderIntentKey) INSTANCE.getExtras((Activity) this)).getCurrencyPairId(), getOrderUuid(), true, OrderTypeEducationFragmentKey.NavIconType.BACK_BUTTON, replaceWithoutBackStack)), null, 2, null);
            if (replaceWithoutBackStack) {
                replaceFragmentWithoutBackStack(fragmentCreateFragment$default);
                return;
            } else {
                replaceFragment(fragmentCreateFragment$default);
                return;
            }
        }
        showOrderPriceFragment(new CryptoOrderPriceGroup.StopLimit(stopPrice, null), stopPrice == null, replaceWithoutBackStack);
    }

    private final void startLimitOrder(boolean replaceWithoutBackStack) {
        if (WhenMappings.$EnumSwitchMapping$2[getAppType().ordinal()] == 1) {
            popEntireFragmentBackstack();
            replaceFragmentWithoutBackStack(CryptoLimitOrderFragment.INSTANCE.newInstance((Parcelable) new CryptoLimitOrderFragment.Args(((CryptoOrderIntentKey) INSTANCE.getExtras((Activity) this)).getCurrencyPairId(), getOrderUuid(), getSide())));
            return;
        }
        showOrderPriceFragment(new CryptoOrderPriceGroup.Limit(null), true, replaceWithoutBackStack);
    }

    private final void showOrderPriceFragment(CryptoOrderPriceGroup priceGroup, boolean popBackStack, boolean replaceWithoutBackStack) {
        CryptoOrderPriceFragment cryptoOrderPriceFragment = (CryptoOrderPriceFragment) CryptoOrderPriceFragment.INSTANCE.newInstance((Parcelable) new CryptoOrderPriceFragment.Args(getSide(), ((CryptoOrderIntentKey) INSTANCE.getExtras((Activity) this)).getCurrencyPairId(), getOrderUuid(), priceGroup));
        if (popBackStack) {
            popEntireFragmentBackstack();
        }
        if (replaceWithoutBackStack) {
            replaceFragmentWithoutBackStack(cryptoOrderPriceFragment);
        } else {
            replaceFragment(cryptoOrderPriceFragment);
        }
    }

    @Override // com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceFragment.Callbacks
    public void onLimitOrderPriceSelected(BigDecimal limitPrice) {
        Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
        showOrderFragmentM1(new CryptoOrderPrices.Limit(limitPrice), OrderTimeInForce.GTC);
        invalidateOptionsMenu();
    }

    @Override // com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceFragment.Callbacks
    public void onStopLossOrderPriceSelected(BigDecimal stopPrice) {
        Intrinsics.checkNotNullParameter(stopPrice, "stopPrice");
        showTimeInForce(new CryptoOrderPrices.StopLoss(stopPrice));
        invalidateOptionsMenu();
    }

    @Override // com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceFragment.Callbacks
    public void onStopLimitOrderStopPriceSelected(BigDecimal stopPrice) {
        Intrinsics.checkNotNullParameter(stopPrice, "stopPrice");
        CryptoOrderFragment.Callbacks.DefaultImpls.convertToStopLimitOrder$default(this, stopPrice, false, 2, null);
        invalidateOptionsMenu();
    }

    @Override // com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceFragment.Callbacks
    public void onStopLimitOrderLimitPriceSelected(BigDecimal stopPrice, BigDecimal limitPrice) {
        Intrinsics.checkNotNullParameter(stopPrice, "stopPrice");
        Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
        showTimeInForce(new CryptoOrderPrices.StopLimit(limitPrice, stopPrice));
        invalidateOptionsMenu();
    }

    private final void showTimeInForce(CryptoOrderPrices orderPrices) {
        replaceFragment(CryptoOrderTimeInForceFragment.INSTANCE.newInstance((Parcelable) new CryptoOrderTimeInForceFragment.Args(getSide(), ((CryptoOrderIntentKey) INSTANCE.getExtras((Activity) this)).getCurrencyPairId(), orderPrices, getOrderUuid())));
    }

    @Override // com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.Callbacks, com.robinhood.shared.trade.crypto.ui.price.CryptoOrderPriceFragment.Callbacks
    public void onOrderTypeInfoClicked(Order.Configuration configuration, OrderSide orderSide) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(orderSide, "orderSide");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(getNavigator(), this, new OrderTypeEducationFragmentKey(new OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder(configuration, orderSide, ((CryptoOrderIntentKey) INSTANCE.getExtras((Activity) this)).getCurrencyPairId(), getOrderUuid(), false, OrderTypeEducationFragmentKey.NavIconType.CLOSE_BUTTON, false)), false, false, false, false, null, false, null, null, 1020, null);
    }

    @Override // com.robinhood.shared.trade.crypto.ui.timeInForce.CryptoOrderTimeInForceFragment.Callbacks
    public void onTimeInForceConfirmed(OrderTimeInForce timeInForce, CryptoOrderPrices orderPrices) {
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(orderPrices, "orderPrices");
        showOrderFragmentM1(orderPrices, timeInForce);
        invalidateOptionsMenu();
    }

    @Override // com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorFragment.Callbacks
    public void onOrderTypeSelected(UiCurrencyPair uiCurrencyPair, CryptoOrderType type2, CryptoInputMode inputMode) {
        Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
        Intrinsics.checkNotNullParameter(type2, "type");
        if (inputMode != null) {
            getCryptoInputModePref().setValue(inputMode);
        }
        int i = WhenMappings.$EnumSwitchMapping$4[type2.ordinal()];
        if (i == 1) {
            CryptoOrderFragment.Callbacks.DefaultImpls.convertToLimitOrder$default(this, false, 1, null);
            return;
        }
        if (i != 2) {
            if (i == 3) {
                CryptoOrderFragment.Callbacks.DefaultImpls.convertToStopOrder$default(this, false, 1, null);
                return;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                CryptoOrderFragment.Callbacks.DefaultImpls.convertToStopLimitOrder$default(this, null, false, 2, null);
                return;
            }
        }
        popEntireFragmentBackstack();
        int i2 = inputMode == null ? -1 : WhenMappings.$EnumSwitchMapping$3[inputMode.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                showQuoteTickerOrderFragment(uiCurrencyPair);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                showOrderFragmentM1(CryptoOrderPrices.Market.INSTANCE, OrderTimeInForce.GTC);
            }
        }
    }

    @Override // com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorFragment.Callbacks
    public void onTaxLotTypeSelected() {
        popEntireFragmentBackstack();
        replaceFragmentWithoutBackStack(CryptoTaxLotParentFragment.INSTANCE.newInstance((Parcelable) new CryptoTaxLotParentFragment.Args(((CryptoOrderIntentKey) INSTANCE.getExtras((Activity) this)).getCurrencyPairId(), getOrderUuid())));
    }

    @Override // com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorFragment.Callbacks
    public void onRecurringOrderSelected() {
        showRecurringOrderConfigurationFlow$default(this, false, null, null, null, null, 31, null);
    }

    static /* synthetic */ void showRecurringOrderConfigurationFlow$default(CryptoOrderActivity cryptoOrderActivity, boolean z, RecurringContext.EntryPoint entryPoint, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, Money money, int i, Object obj) {
        Money money2;
        LocalDate localDate2;
        RecurringContext.EntryPoint entryPoint2;
        ApiInvestmentSchedule.Frequency frequency2;
        CryptoOrderActivity cryptoOrderActivity2;
        boolean z2;
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            entryPoint = RecurringContext.EntryPoint.CRYPTO_SELECT_ORDER_KIND_PAGE;
        }
        if ((i & 4) != 0) {
            frequency = null;
        }
        if ((i & 8) != 0) {
            localDate = null;
        }
        if ((i & 16) != 0) {
            money2 = null;
            frequency2 = frequency;
            localDate2 = localDate;
            z2 = z;
            entryPoint2 = entryPoint;
            cryptoOrderActivity2 = cryptoOrderActivity;
        } else {
            money2 = money;
            localDate2 = localDate;
            entryPoint2 = entryPoint;
            frequency2 = frequency;
            cryptoOrderActivity2 = cryptoOrderActivity;
            z2 = z;
        }
        cryptoOrderActivity2.showRecurringOrderConfigurationFlow(z2, entryPoint2, frequency2, localDate2, money2);
    }

    private final void showRecurringOrderConfigurationFlow(boolean isFromHook, RecurringContext.EntryPoint loggingEntryPoint, ApiInvestmentSchedule.Frequency frequency, LocalDate startDate, Money amount) {
        int i = WhenMappings.$EnumSwitchMapping$2[getAppType().ordinal()];
        if (i == 1) {
            NavigationKey recurringCreationKey = getRecurringKeyResolver().getRecurringCreationKey(((CryptoOrderIntentKey) INSTANCE.getExtras((Activity) this)).getCurrencyPairId(), isFromHook, loggingEntryPoint, frequency, startDate, amount, null);
            Navigator navigator = getNavigator();
            Intrinsics.checkNotNull(recurringCreationKey, "null cannot be cast to non-null type com.robinhood.android.navigation.keys.IntentKey");
            Navigator.DefaultImpls.startActivity$default(navigator, this, (IntentKey) recurringCreationKey, null, false, null, null, 60, null);
            return;
        }
        if (i == 2) {
            throw new IllegalStateException("Not supported");
        }
        if (i == 3) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C400971(isFromHook, loggingEntryPoint, frequency, startDate, amount, null), 3, null);
            return;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* compiled from: CryptoOrderActivity.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.activity.CryptoOrderActivity$showRecurringOrderConfigurationFlow$1", m3645f = "CryptoOrderActivity.kt", m3646l = {626}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.activity.CryptoOrderActivity$showRecurringOrderConfigurationFlow$1 */
    static final class C400971 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Money $amount;
        final /* synthetic */ ApiInvestmentSchedule.Frequency $frequency;
        final /* synthetic */ boolean $isFromHook;
        final /* synthetic */ RecurringContext.EntryPoint $loggingEntryPoint;
        final /* synthetic */ LocalDate $startDate;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C400971(boolean z, RecurringContext.EntryPoint entryPoint, ApiInvestmentSchedule.Frequency frequency, LocalDate localDate, Money money, Continuation<? super C400971> continuation) {
            super(2, continuation);
            this.$isFromHook = z;
            this.$loggingEntryPoint = entryPoint;
            this.$frequency = frequency;
            this.$startDate = localDate;
            this.$amount = money;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderActivity.this.new C400971(this.$isFromHook, this.$loggingEntryPoint, this.$frequency, this.$startDate, this.$amount, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C400971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowConnectWhen = Operators.connectWhen(CryptoOrderActivity.this.getCryptoAccountProvider().streamAccountNumber(new CryptoAccountSwitcherLocation.Buy(((CryptoOrderIntentKey) CryptoOrderActivity.INSTANCE.getExtras((Activity) CryptoOrderActivity.this)).getCurrencyPairId())), CryptoOrderActivity.this.getCryptoExperimentsStore().streamCryptoMibExperiment(), FlowKt.flowOf((Object) null));
                this.label = 1;
                obj = FlowKt.first(flowConnectWhen, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            NavigationKey recurringCreationKey = CryptoOrderActivity.this.getRecurringKeyResolver().getRecurringCreationKey(((CryptoOrderIntentKey) CryptoOrderActivity.INSTANCE.getExtras((Activity) CryptoOrderActivity.this)).getCurrencyPairId(), this.$isFromHook, this.$loggingEntryPoint, this.$frequency, this.$startDate, this.$amount, (String) obj);
            FragmentManager supportFragmentManager = CryptoOrderActivity.this.getSupportFragmentManager();
            final CryptoOrderActivity cryptoOrderActivity = CryptoOrderActivity.this;
            supportFragmentManager.setFragmentResultListener(ReturnedData.EXTRA_RETURNED_DATA, cryptoOrderActivity, new FragmentResultListener() { // from class: com.robinhood.shared.trade.crypto.activity.CryptoOrderActivity.showRecurringOrderConfigurationFlow.1.1
                @Override // androidx.fragment.app.FragmentResultListener
                public final void onFragmentResult(String str, Bundle bundle) {
                    Parcelable parcelable;
                    Intrinsics.checkNotNullParameter(str, "<unused var>");
                    Intrinsics.checkNotNullParameter(bundle, "bundle");
                    cryptoOrderActivity.getSupportFragmentManager().clearFragmentResultListener(ReturnedData.EXTRA_RETURNED_DATA);
                    if (Build.VERSION.SDK_INT >= 34) {
                        parcelable = (Parcelable) bundle.getParcelable(ReturnedData.EXTRA_RETURNED_DATA, RecurringOrderConfiguration.class);
                    } else {
                        Parcelable parcelable2 = bundle.getParcelable(ReturnedData.EXTRA_RETURNED_DATA);
                        if (!(parcelable2 instanceof RecurringOrderConfiguration)) {
                            parcelable2 = null;
                        }
                        parcelable = (RecurringOrderConfiguration) parcelable2;
                    }
                    if (parcelable != null) {
                        cryptoOrderActivity.popEntireFragmentBackstack();
                        cryptoOrderActivity.showRecurringOrderFragment((RecurringOrderConfiguration) parcelable);
                        return;
                    }
                    throw new IllegalStateException("Recurring fragment passed no data");
                }
            });
            CryptoOrderActivity cryptoOrderActivity2 = CryptoOrderActivity.this;
            Navigator navigator = cryptoOrderActivity2.getNavigator();
            Intrinsics.checkNotNull(recurringCreationKey, "null cannot be cast to non-null type com.robinhood.android.navigation.keys.FragmentKey");
            cryptoOrderActivity2.replaceFragment(Navigator.DefaultImpls.createFragment$default(navigator, (FragmentKey) recurringCreationKey, null, 2, null));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRecurringOrderFragment(RecurringOrderConfiguration orderConfiguration) {
        popEntireFragmentBackstack();
        new ReplaceFragmentBuilder((RecurringOrderParentFragment) RecurringOrderParentFragment.INSTANCE.newInstance((Parcelable) new RecurringOrderParentFragment.Args(new InvestmentTarget(((CryptoOrderIntentKey) INSTANCE.getExtras((Activity) this)).getCurrencyPairId(), null, ApiAssetType.CRYPTO), orderConfiguration, "CryptoOrderActivity"))).setAddToBackstack(true).buildAndExecute(this);
    }

    @Override // com.robinhood.android.common.recurring.trade.RecurringOrderParentFragment.Callbacks
    public void startOrderConfigurationSelection(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        showOrderTypeSelector(CryptoOrderType.MARKET, true);
    }

    @Override // com.robinhood.android.common.recurring.trade.RecurringOrderParentFragment.Callbacks
    public void editRecurringOrder(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        showRecurringOrderConfigurationFlow$default(this, false, null, null, null, null, 31, null);
    }

    @Override // com.robinhood.android.common.recurring.trade.RecurringOrderParentFragment.Callbacks
    public void setRecurringOrderConfiguration(RecurringOrderConfiguration orderConfiguration) {
        Intrinsics.checkNotNullParameter(orderConfiguration, "orderConfiguration");
        showRecurringOrderFragment(orderConfiguration);
    }

    @Override // com.robinhood.android.common.recurring.trade.RecurringOrderParentFragment.Callbacks
    public void onReviewingStateChanged(boolean isReviewing) {
        onReviewStateChanged(isReviewing);
    }

    @Override // com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.Callbacks, com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.Callbacks
    public void onReviewStateChanged(boolean reviewing) {
        this.isReviewing = reviewing;
    }

    @Override // com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.Callbacks
    public void enterRecurringFlowFromHook(ApiInvestmentSchedule.Frequency frequency, LocalDate startDate, Money amount) {
        showRecurringOrderConfigurationFlow$default(this, false, RecurringContext.EntryPoint.ENTRY_POINT_UNSPECIFIED, frequency, startDate, amount, 1, null);
    }

    @Override // com.robinhood.shared.education.order.OrderTypeEducationFragmentCallbacks
    public void onOrderTypeEducationFinished(OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        if (configuration instanceof OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) {
            OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder cryptoOrder = (OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.CryptoOrder) configuration;
            int i = WhenMappings.$EnumSwitchMapping$5[cryptoOrder.getOrderConfiguration().ordinal()];
            if (i == 1) {
                startLimitOrder(cryptoOrder.getReplaceWithoutBackStack());
                return;
            } else if (i == 2) {
                showOrderPriceFragment(new CryptoOrderPriceGroup.StopLoss(null), true, cryptoOrder.getReplaceWithoutBackStack());
                return;
            } else {
                if (i == 3) {
                    showOrderPriceFragment(new CryptoOrderPriceGroup.StopLimit(null, null), true, cryptoOrder.getReplaceWithoutBackStack());
                    return;
                }
                throw new IllegalStateException("Other order types not supported");
            }
        }
        throw new IllegalStateException("Non crypto orders not supported");
    }

    @Override // com.robinhood.shared.education.order.OrderTypeEducationFragmentCallbacks
    public void onLearnMoreClicked(int titleRes, int descriptionRes) {
        replaceFragment(OrderTypeEducationLearnMoreFragment.INSTANCE.newInstance(titleRes, descriptionRes));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchCryptoLearnAndEarnReward() {
        getHasCryptoTradingEducationRewardImpressionPref().set(true);
        Navigator.DefaultImpls.startActivity$default(getNavigator(), this, new CryptoLearnAndEarnRewardsClaimIntentKey(((CryptoOrderIntentKey) INSTANCE.getExtras((Activity) this)).getSource()), null, false, null, null, 60, null);
        finish();
    }

    private final boolean shouldLaunchCryptoLearnAndEarnRewardConfirmation(boolean isOrderFilled) {
        return CollectionsKt.contains(CRYPTO_LEARN_EARN_REWARD_ENTRYPOINT, ((CryptoOrderIntentKey) INSTANCE.getExtras((Activity) this)).getSource()) && isOrderFilled && !getHasCryptoTradingEducationRewardImpressionPref().get();
    }

    @Override // com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment.Callbacks
    public void launchPostUpsellAndMaybeLearnEarnRewardAndFinish(Function0<Unit> launchPostTradeUpsell, Intent postTradeUpsellIntent, boolean isOrderFilled) {
        Intrinsics.checkNotNullParameter(launchPostTradeUpsell, "launchPostTradeUpsell");
        Intrinsics.checkNotNullParameter(postTradeUpsellIntent, "postTradeUpsellIntent");
        super.onOrderFlowFinished();
        if (shouldLaunchCryptoLearnAndEarnRewardConfirmation(isOrderFilled)) {
            this.cryptoPostTradeUpsellLauncher.launch(postTradeUpsellIntent);
        } else {
            launchPostTradeUpsell.invoke();
            finish();
        }
    }

    @Override // com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment.Callbacks, com.robinhood.shared.trade.crypto.ui.fee.notificationPrimer.CryptoFeeTierNotificationPrimerFragment.Callbacks
    public void onOrderFlowFinished(boolean isOrderFilled) {
        super.onOrderFlowFinished();
        if (!shouldLaunchCryptoLearnAndEarnRewardConfirmation(isOrderFilled)) {
            finish();
        } else {
            launchCryptoLearnAndEarnReward();
        }
    }

    @Override // com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment.Callbacks
    public void onBillingOrder3DSecureRedirect(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        NavigationActivityResultContract3.launch$default(this.billingOrder3DSecureLauncher, new ThreeDSecureIntentKey(url), null, false, 6, null);
    }

    @Override // com.robinhood.shared.trade.crypto.ui.fee.submissionFailed.CryptoFeeOrderSubmissionFailedAlertDialogFragment.Callbacks
    public void convertToRebateOrder() {
        CryptoOrderSubmissionFailureCallbacks cryptoOrderSubmissionFailureCallbacks = this.orderSubmissionFailureCallbacks;
        if (cryptoOrderSubmissionFailureCallbacks != null) {
            cryptoOrderSubmissionFailureCallbacks.convertToRebateOrder();
        }
    }

    @Override // com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.Callbacks, com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment.Callbacks, com.robinhood.shared.trade.crypto.ui.taxLots.parent.CryptoTaxLotParentFragment.Callbacks, com.robinhood.shared.trade.crypto.ui.fee.submissionFailed.CryptoFeeOrderSubmissionFailedAlertDialogFragment.Callbacks
    public void cancelTradeFlow() {
        finish();
    }

    @Override // com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment.Callbacks
    public void onContinueToNotificationPrimer(boolean isOrderFilled) {
        replaceFragment(Navigator.DefaultImpls.createFragment$default(getNavigator(), new CryptoFeeTierNotificationPrimerFragment.CryptoFeeTierNotificationPrimerFragmentKey(isOrderFilled), null, 2, null));
    }

    public final void setOrderSubmissionFailureCallbacks(CryptoOrderSubmissionFailureCallbacks callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.orderSubmissionFailureCallbacks = callbacks;
    }

    public final void removeOrderSubmissionFailureCallbacks(CryptoOrderSubmissionFailureCallbacks callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        if (Intrinsics.areEqual(this.orderSubmissionFailureCallbacks, callbacks)) {
            this.orderSubmissionFailureCallbacks = null;
        }
    }

    /* compiled from: CryptoOrderActivity.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderActivity;", "Lcom/robinhood/android/crypto/contracts/CryptoOrderIntentKey;", "<init>", "()V", "CRYPTO_LEARN_EARN_REWARD_ENTRYPOINT", "", "", "getCRYPTO_LEARN_EARN_REWARD_ENTRYPOINT", "()Ljava/util/Set;", "STAKING_ENTRYPOINT", "getSTAKING_ENTRYPOINT", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<CryptoOrderActivity, CryptoOrderIntentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public CryptoOrderIntentKey getExtras(CryptoOrderActivity cryptoOrderActivity) {
            return (CryptoOrderIntentKey) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, cryptoOrderActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, CryptoOrderIntentKey cryptoOrderIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, cryptoOrderIntentKey);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, CryptoOrderIntentKey cryptoOrderIntentKey) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, cryptoOrderIntentKey);
        }

        public final Set<String> getCRYPTO_LEARN_EARN_REWARD_ENTRYPOINT() {
            return CryptoOrderActivity.CRYPTO_LEARN_EARN_REWARD_ENTRYPOINT;
        }

        public final Set<String> getSTAKING_ENTRYPOINT() {
            return CryptoOrderActivity.STAKING_ENTRYPOINT;
        }
    }
}
