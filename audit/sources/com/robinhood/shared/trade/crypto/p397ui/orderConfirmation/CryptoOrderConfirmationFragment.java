package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.lib.account.crypto.CryptoAccountProvider;
import com.robinhood.android.lib.trade.BaseOrderConfirmationFragment;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.navigation.keys.NavigationKey;
import com.robinhood.android.productupsell.contracts.ProductUpsellKey;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.librobinhood.data.store.CryptoExperimentsStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.models.crypto.p314db.fee.CryptoFeeTierInfo;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.rosetta.eventlogging.AdvancedChartsAboutContext;
import com.robinhood.rosetta.eventlogging.AdvancedChartsContext;
import com.robinhood.rosetta.eventlogging.AgreementContext;
import com.robinhood.rosetta.eventlogging.AlertContext;
import com.robinhood.rosetta.eventlogging.Article;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Basket;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.BrokerageAccountSwitcherContext;
import com.robinhood.rosetta.eventlogging.CXInquiryContext;
import com.robinhood.rosetta.eventlogging.CXIssue;
import com.robinhood.rosetta.eventlogging.ChallengeContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CryptoAssetContext;
import com.robinhood.rosetta.eventlogging.CryptoGiftContext;
import com.robinhood.rosetta.eventlogging.CryptoOrderContext;
import com.robinhood.rosetta.eventlogging.CryptoTokenApprovalContext;
import com.robinhood.rosetta.eventlogging.CryptoTransactionContext;
import com.robinhood.rosetta.eventlogging.CryptoTransferContext;
import com.robinhood.rosetta.eventlogging.DappRequestContext;
import com.robinhood.rosetta.eventlogging.DcfKycContext;
import com.robinhood.rosetta.eventlogging.DirectDepositContext;
import com.robinhood.rosetta.eventlogging.DirectDepositSwitcherContext;
import com.robinhood.rosetta.eventlogging.DisclosureDropdown;
import com.robinhood.rosetta.eventlogging.EducationHome;
import com.robinhood.rosetta.eventlogging.EducationSeries;
import com.robinhood.rosetta.eventlogging.EducationTour;
import com.robinhood.rosetta.eventlogging.EducationTourOutro;
import com.robinhood.rosetta.eventlogging.EducationTourOutroTooltip;
import com.robinhood.rosetta.eventlogging.EducationTourSection;
import com.robinhood.rosetta.eventlogging.EquityOrderContext;
import com.robinhood.rosetta.eventlogging.EtpCompositionContext;
import com.robinhood.rosetta.eventlogging.Feedback;
import com.robinhood.rosetta.eventlogging.FundingContext;
import com.robinhood.rosetta.eventlogging.GoldContext;
import com.robinhood.rosetta.eventlogging.GraphContext;
import com.robinhood.rosetta.eventlogging.IAVContext;
import com.robinhood.rosetta.eventlogging.InAppComm;
import com.robinhood.rosetta.eventlogging.InAppSurvey;
import com.robinhood.rosetta.eventlogging.InstantDeposit;
import com.robinhood.rosetta.eventlogging.InvestFlowContext;
import com.robinhood.rosetta.eventlogging.InvestorProfileQuestionnaireContext;
import com.robinhood.rosetta.eventlogging.IpoAccessInstrumentContext;
import com.robinhood.rosetta.eventlogging.IpoAccessListVideoContext;
import com.robinhood.rosetta.eventlogging.IpoaAllocationCylinderContext;
import com.robinhood.rosetta.eventlogging.IpoaParticipationGraphContext;
import com.robinhood.rosetta.eventlogging.IpoaPostCobFollowUpContext;
import com.robinhood.rosetta.eventlogging.KeychainLoginContext;
import com.robinhood.rosetta.eventlogging.LearningAnswer;
import com.robinhood.rosetta.eventlogging.LearningLesson;
import com.robinhood.rosetta.eventlogging.LearningMatchingExercise;
import com.robinhood.rosetta.eventlogging.LearningMatchingExerciseBucket;
import com.robinhood.rosetta.eventlogging.LearningMatchingExerciseEntity;
import com.robinhood.rosetta.eventlogging.LearningSection;
import com.robinhood.rosetta.eventlogging.List;
import com.robinhood.rosetta.eventlogging.ListsContext;
import com.robinhood.rosetta.eventlogging.LoginContext;
import com.robinhood.rosetta.eventlogging.MAXTransferAccountSelectionContext;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.MarginUpgradeContext;
import com.robinhood.rosetta.eventlogging.NcwFundingContext;
import com.robinhood.rosetta.eventlogging.NcwOnboardingContext;
import com.robinhood.rosetta.eventlogging.NetworkContext;
import com.robinhood.rosetta.eventlogging.NewsFeedItem;
import com.robinhood.rosetta.eventlogging.OptionStrategyContext;
import com.robinhood.rosetta.eventlogging.OptionWatchlistAboutContext;
import com.robinhood.rosetta.eventlogging.OptionsContext;
import com.robinhood.rosetta.eventlogging.OptionsEligibilityContext;
import com.robinhood.rosetta.eventlogging.OrderKind;
import com.robinhood.rosetta.eventlogging.OrderSummaryNbbo;
import com.robinhood.rosetta.eventlogging.PasskeyEnrollmentContext;
import com.robinhood.rosetta.eventlogging.PaycheckSectionContext;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import com.robinhood.rosetta.eventlogging.PerformanceChartContext;
import com.robinhood.rosetta.eventlogging.PlaidEventData;
import com.robinhood.rosetta.eventlogging.QueuedDepositContext;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.RecommendationsContext;
import com.robinhood.rosetta.eventlogging.RecsRetirementContext;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.RewardContext;
import com.robinhood.rosetta.eventlogging.SLIPContext;
import com.robinhood.rosetta.eventlogging.SLIPHubStockRowContext;
import com.robinhood.rosetta.eventlogging.SafetyLabelInfoTag;
import com.robinhood.rosetta.eventlogging.SafetyLabelLesson;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.SearchResultItem;
import com.robinhood.rosetta.eventlogging.ShareholderQAContext;
import com.robinhood.rosetta.eventlogging.TechnicalIndicatorContext;
import com.robinhood.rosetta.eventlogging.TransactionDisputeContext;
import com.robinhood.rosetta.eventlogging.TransferContext;
import com.robinhood.rosetta.eventlogging.URLComponents;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.rosetta.eventlogging.ValueSelectorContext;
import com.robinhood.rosetta.eventlogging.VoiceRecordContext;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.crypto.contracts.CryptoTradeBonusBottomSheetFragmentKey;
import com.robinhood.shared.crypto.p375ui.trade.confirmation.CryptoConfirmationScreenComposable6;
import com.robinhood.shared.crypto.p375ui.trade.confirmation.CryptoConfirmationState;
import com.robinhood.shared.crypto.trading.CryptoOrderManager;
import com.robinhood.shared.history.navigation.HistoryNavigator;
import com.robinhood.shared.recurring.resolver.InvestmentScheduleKeyResolver;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.databinding.FragmentCryptoOrderConfirmationBinding;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.CryptoOrderConfirmationEvent;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.CryptoOrderConfirmationFragment;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.CryptoOrderConfirmationViewState3;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierStatus.CryptoFeeTierStatusComposableKt;
import com.robinhood.shared.trade.crypto.p397ui.orderConfirmation.feeTierUpgraded.CryptoFeeTierUpgradedComposableKt;
import com.robinhood.shared.trade.crypto.p397ui.tradeBonus.extensions.UiCryptoOrders2;
import com.robinhood.shared.trading.tradeflow.OrderInProgressLoadingView2;
import com.robinhood.shared.transfers.store.cryptocheckout.BillingCryptoOrderCallbacks;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.reactivex.Observable;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CryptoOrderConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u008f\u00012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0006\u008d\u0001\u008e\u0001\u008f\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010U\u001a\u0004\u0018\u00010V2\u0006\u0010W\u001a\u00020X2\b\u0010Y\u001a\u0004\u0018\u00010Z2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0016J\u0010\u0010]\u001a\u00020^2\u0006\u0010_\u001a\u00020`H\u0016J\u001a\u0010a\u001a\u00020^2\u0006\u0010b\u001a\u00020V2\b\u0010[\u001a\u0004\u0018\u00010\\H\u0016J\b\u0010c\u001a\u00020^H\u0016J\b\u0010d\u001a\u00020^H\u0016J\u0010\u0010e\u001a\u00020^2\u0006\u0010f\u001a\u00020gH\u0002J!\u0010h\u001a\u00020^*\u00020i2\u0006\u0010j\u001a\u00020k2\u0006\u0010l\u001a\u00020RH\u0003¢\u0006\u0002\u0010mJ\u0016\u0010n\u001a\u00020^2\f\u0010o\u001a\b\u0012\u0004\u0012\u00020q0pH\u0002J\u0010\u0010r\u001a\u00020^2\u0006\u0010l\u001a\u00020RH\u0002J\u0010\u0010s\u001a\u00020^2\u0006\u0010t\u001a\u00020\u0002H\u0016J\u0010\u0010u\u001a\u00020^2\u0006\u0010t\u001a\u00020\u0002H\u0016J\u0010\u0010v\u001a\u00020^2\u0006\u0010t\u001a\u00020wH\u0002J\u0010\u0010x\u001a\u00020^2\u0006\u0010t\u001a\u00020wH\u0002J\u0010\u0010y\u001a\u00020^2\u0006\u0010o\u001a\u00020zH\u0002J\u0010\u0010{\u001a\u00020^2\u0006\u0010o\u001a\u00020|H\u0002J\u001a\u0010}\u001a\u00020R2\u0006\u0010~\u001a\u00020N2\b\u0010\u007f\u001a\u0004\u0018\u00010\\H\u0016J\u001b\u0010\u0080\u0001\u001a\u00020R2\u0006\u0010~\u001a\u00020N2\b\u0010\u007f\u001a\u0004\u0018\u00010\\H\u0016J\u0013\u0010\u0081\u0001\u001a\u00020R2\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0002J\u0011\u0010\u0084\u0001\u001a\u00020^2\u0006\u0010t\u001a\u00020wH\u0002J\u0013\u0010\u0085\u0001\u001a\u00020^2\b\u0010\u0086\u0001\u001a\u00030\u0083\u0001H\u0016J\n\u0010\u0087\u0001\u001a\u00020RH\u0096\u0001R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u00020\u00038\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001e\u0010&\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001e\u00102\u001a\u0002038\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0014\u00108\u001a\u0002098BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001b\u0010<\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b>\u0010?R\u001b\u0010B\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bD\u0010ER\u001b\u0010H\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010A\u001a\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020NX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020RX\u0096D¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u001d\u0010\u0088\u0001\u001a\n\u0012\u0005\u0012\u00030\u008a\u00010\u0089\u0001X\u0096\u0005¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001¨\u0006\u0090\u0001²\u0006\f\u0010\u0091\u0001\u001a\u00030\u0092\u0001X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationFragment;", "Lcom/robinhood/android/lib/trade/BaseOrderConfirmationFragment;", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager$Response;", "Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$OnClickListener;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/shared/transfers/store/cryptocheckout/BillingCryptoOrderCallbacks;", "<init>", "()V", "appType", "Lcom/robinhood/shared/app/type/AppType;", "getAppType", "()Lcom/robinhood/shared/app/type/AppType;", "setAppType", "(Lcom/robinhood/shared/app/type/AppType;)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "cryptoExperimentsStore", "Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "getCryptoExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;", "setCryptoExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/CryptoExperimentsStore;)V", "cryptoAccountProvider", "Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "getCryptoAccountProvider", "()Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;", "setCryptoAccountProvider", "(Lcom/robinhood/android/lib/account/crypto/CryptoAccountProvider;)V", "orderManager", "getOrderManager", "()Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;", "setOrderManager", "(Lcom/robinhood/shared/crypto/trading/CryptoOrderManager;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "historyNavigator", "Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "getHistoryNavigator", "()Lcom/robinhood/shared/history/navigation/HistoryNavigator;", "setHistoryNavigator", "(Lcom/robinhood/shared/history/navigation/HistoryNavigator;)V", "investmentScheduleKeyResolver", "Lcom/robinhood/shared/recurring/resolver/InvestmentScheduleKeyResolver;", "getInvestmentScheduleKeyResolver", "()Lcom/robinhood/shared/recurring/resolver/InvestmentScheduleKeyResolver;", "setInvestmentScheduleKeyResolver", "(Lcom/robinhood/shared/recurring/resolver/InvestmentScheduleKeyResolver;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "fragmentBinding", "Lcom/robinhood/shared/trade/crypto/databinding/FragmentCryptoOrderConfirmationBinding;", "getFragmentBinding", "()Lcom/robinhood/shared/trade/crypto/databinding/FragmentCryptoOrderConfirmationBinding;", "fragmentBinding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationDuxo;", "getDuxo", "()Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationFragment$Callbacks;", "callbacks$delegate", "confirmationLayoutId", "", "getConfirmationLayoutId", "()I", "usePrimaryBackground", "", "getUsePrimaryBackground", "()Z", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "onDestroyView", "onStop", "bindUi", "viewState", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationViewState;", "ConfirmationContent", "Landroidx/compose/animation/AnimatedVisibilityScope;", "confirmationContent", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent;", "isOrderFilled", "(Landroidx/compose/animation/AnimatedVisibilityScope;Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoConfirmationContent;ZLandroidx/compose/runtime/Composer;I)V", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent;", "showNotificationUpsell", "onOrderReceived", Card.Icon.ORDER, "onOrderUpdated", "openOrderDetail", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "openCostDetail", "showFeeDefinitionBottomSheet", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent$ShowFeeDefinitionBottomSheet;", "showTradeBonusBottomSheet", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationEvent$ShowTradeBonusBottomSheet;", "onPrimaryButtonClicked", "dialogId", "passthroughArgs", "onSecondaryButtonClicked", "processLink", "link", "", "showRecurringInvestmentFlow", "on3DSecureRedirect", "url", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "InitArgs", "Companion", "feature-trade-crypto_externalDebug", "cornerRadius", "Landroidx/compose/ui/unit/Dp;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoOrderConfirmationFragment extends BaseOrderConfirmationFragment<CryptoOrderManager.Response, CryptoOrderManager> implements RhBottomSheetDialogFragment.OnClickListener, RegionGated, BillingCryptoOrderCallbacks {
    private static final int CONFIRMATION_SCREEN_BOTTOM_SHEET_ID = 0;
    private static final long DIRECT_DEEPLINK_LOADING_INDICATOR_THRESHOLD_MS = 500;
    private static final String PASSTHROUGH_LINK = "PASSTHROUGH_LINK";
    public AnalyticsLogger analytics;
    public AppType appType;
    public CryptoAccountProvider cryptoAccountProvider;
    public CryptoExperimentsStore cryptoExperimentsStore;
    public EventLogger eventLogger;
    public HistoryNavigator historyNavigator;
    public InvestmentScheduleKeyResolver investmentScheduleKeyResolver;
    public CryptoOrderManager orderManager;
    private final boolean usePrimaryBackground;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoOrderConfirmationFragment.class, "fragmentBinding", "getFragmentBinding()Lcom/robinhood/shared/trade/crypto/databinding/FragmentCryptoOrderConfirmationBinding;", 0)), Reflection.property1(new PropertyReference1Impl(CryptoOrderConfirmationFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);

    /* renamed from: fragmentBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 fragmentBinding = ViewBinding5.viewBinding(this, CryptoOrderConfirmationFragment4.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, CryptoOrderConfirmationDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof CryptoOrderConfirmationFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final int confirmationLayoutId = C40095R.layout.fragment_crypto_order_confirmation;

    /* compiled from: CryptoOrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J&\u0010\n\u001a\u00020\u00032\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationFragment$Callbacks;", "", "onOrderFlowFinished", "", "isOrderFilled", "", "onContinueToNotificationPrimer", "onBillingOrder3DSecureRedirect", "url", "", "launchPostUpsellAndMaybeLearnEarnRewardAndFinish", "launchPostTradeUpsell", "Lkotlin/Function0;", "postTradeUpsellIntent", "Landroid/content/Intent;", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void launchPostUpsellAndMaybeLearnEarnRewardAndFinish(Function0<Unit> launchPostTradeUpsell, Intent postTradeUpsellIntent, boolean isOrderFilled);

        void onBillingOrder3DSecureRedirect(String url);

        void onContinueToNotificationPrimer(boolean isOrderFilled);

        void onOrderFlowFinished(boolean isOrderFilled);
    }

    /* compiled from: CryptoOrderConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OrderSide.values().length];
            try {
                iArr[OrderSide.BUY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OrderSide.SELL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AppType.values().length];
            try {
                iArr2[AppType.NCW.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AppType.RHC.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AppType.TRADER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfirmationContent$lambda$1(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, AnimatedVisibilityScope animatedVisibilityScope, CryptoOrderConfirmationViewState3 cryptoOrderConfirmationViewState3, boolean z, int i, Composer composer, int i2) {
        cryptoOrderConfirmationFragment.ConfirmationContent(animatedVisibilityScope, cryptoOrderConfirmationViewState3, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onSecondaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<CryptoOrderConfirmationEvent> event) {
        EventConsumer<CryptoOrderConfirmationEvent> eventConsumerInvoke;
        EventConsumer<CryptoOrderConfirmationEvent> eventConsumerInvoke2;
        EventConsumer<CryptoOrderConfirmationEvent> eventConsumerInvoke3;
        EventConsumer<CryptoOrderConfirmationEvent> eventConsumerInvoke4;
        EventConsumer<CryptoOrderConfirmationEvent> eventConsumerInvoke5;
        if ((event.getData() instanceof CryptoOrderConfirmationEvent.Close) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25866invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25866invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    CryptoOrderConfirmationEvent.Close close = (CryptoOrderConfirmationEvent.Close) event.getData();
                    if (!(close instanceof CryptoOrderConfirmationEvent.Close.NotificationUpsell)) {
                        if (close instanceof CryptoOrderConfirmationEvent.Close.Deeplink) {
                            BuildersKt__Builders_commonKt.launch$default(this.getLifecycleScope(), null, null, new CryptoOrderConfirmationFragment5(this, close, close, null), 3, null);
                            return;
                        } else {
                            if (!(close instanceof CryptoOrderConfirmationEvent.Close.Default)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            this.getCallbacks().onOrderFlowFinished(((CryptoOrderConfirmationEvent.Close.Default) close).getIsOrderFilled());
                            return;
                        }
                    }
                    this.showNotificationUpsell(((CryptoOrderConfirmationEvent.Close.NotificationUpsell) close).getIsOrderFilled());
                }
            });
        }
        if ((event.getData() instanceof CryptoOrderConfirmationEvent.OpenOrderDetail) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25867invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25867invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.openOrderDetail(((CryptoOrderConfirmationEvent.OpenOrderDetail) event.getData()).getOrder());
                }
            });
        }
        if ((event.getData() instanceof CryptoOrderConfirmationEvent.OpenCostDetail) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$handleEvent$$inlined$consumeIfType$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25868invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25868invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.openCostDetail(((CryptoOrderConfirmationEvent.OpenCostDetail) event.getData()).getOrder());
                }
            });
        }
        if ((event.getData() instanceof CryptoOrderConfirmationEvent.ShowFeeDefinitionBottomSheet) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$handleEvent$$inlined$consumeIfType$4
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25869invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25869invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.showFeeDefinitionBottomSheet((CryptoOrderConfirmationEvent.ShowFeeDefinitionBottomSheet) event.getData());
                }
            });
        }
        if (!(event.getData() instanceof CryptoOrderConfirmationEvent.ShowTradeBonusBottomSheet) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$handleEvent$$inlined$consumeIfType$5
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m25870invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m25870invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.showTradeBonusBottomSheet((CryptoOrderConfirmationEvent.ShowTradeBonusBottomSheet) event.getData());
            }
        });
    }

    /* compiled from: CryptoOrderConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$ConfirmationContent$1 */
    static final class C403621 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ CryptoOrderConfirmationViewState3 $confirmationContent;
        final /* synthetic */ boolean $isOrderFilled;
        final /* synthetic */ CryptoOrderConfirmationFragment this$0;

        C403621(CryptoOrderConfirmationViewState3 cryptoOrderConfirmationViewState3, CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, boolean z) {
            this.$confirmationContent = cryptoOrderConfirmationViewState3;
            this.this$0 = cryptoOrderConfirmationFragment;
            this.$isOrderFilled = z;
        }

        private static final float invoke$lambda$0(SnapshotState4<C2002Dp> snapshotState4) {
            return snapshotState4.getValue().getValue();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1998603569, i, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment.ConfirmationContent.<anonymous> (CryptoOrderConfirmationFragment.kt:236)");
            }
            composer.startReplaceGroup(-807645447);
            float fM7995constructorimpl = this.$confirmationContent.getIsFullScreen() ? C2002Dp.m7995constructorimpl(0) : BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM();
            composer.endReplaceGroup();
            Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(invoke$lambda$0(AnimateAsState.m4812animateDpAsStateAjpBEmI(fM7995constructorimpl, null, "cornerRadius", null, composer, 384, 10))));
            Alignment center = Alignment.INSTANCE.getCenter();
            CryptoOrderConfirmationViewState3 cryptoOrderConfirmationViewState3 = this.$confirmationContent;
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$ConfirmationContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoOrderConfirmationFragment.C403621.invoke$lambda$2$lambda$1((AnimatedContentTransitionScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$ConfirmationContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoOrderConfirmationFragment.C403621.invoke$lambda$4$lambda$3((CryptoOrderConfirmationViewState3) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            AnimatedContentKt.AnimatedContent(cryptoOrderConfirmationViewState3, modifierM4871backgroundbw27NRU, function1, center, "confirmationContent", (Function1) objRememberedValue2, ComposableLambda3.rememberComposableLambda(1161285741, true, new AnonymousClass3(this.this$0, this.$isOrderFilled), composer, 54), composer, 1797504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invoke$lambda$4$lambda$3(CryptoOrderConfirmationViewState3 targetState) {
            Intrinsics.checkNotNullParameter(targetState, "targetState");
            if (targetState instanceof CryptoOrderConfirmationViewState3.Receipt) {
                return "Receipt";
            }
            if (targetState instanceof CryptoOrderConfirmationViewState3.AggressiveRecurringUpsell) {
                return "AggressiveRecurringUpsell";
            }
            if (targetState instanceof CryptoOrderConfirmationViewState3.FeeTierStatus) {
                return "FeeTierStatus";
            }
            if (targetState instanceof CryptoOrderConfirmationViewState3.FeeTierUpgraded) {
                return "FeeTierUpgraded";
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ContentTransform invoke$lambda$2$lambda$1(AnimatedContentTransitionScope AnimatedContent) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            return AnimatedContent.using(AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 350, null, 4, null), 0.0f, 2, null), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(300, 0, null, 6, null), 0.0f, 2, null)), AnimatedContentKt.SizeTransform$default(true, null, 2, null));
        }

        /* compiled from: CryptoOrderConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$ConfirmationContent$1$3, reason: invalid class name */
        static final class AnonymousClass3 implements Function4<AnimatedContentScope, CryptoOrderConfirmationViewState3, Composer, Integer, Unit> {
            final /* synthetic */ boolean $isOrderFilled;
            final /* synthetic */ CryptoOrderConfirmationFragment this$0;

            AnonymousClass3(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, boolean z) {
                this.this$0 = cryptoOrderConfirmationFragment;
                this.$isOrderFilled = z;
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, CryptoOrderConfirmationViewState3 cryptoOrderConfirmationViewState3, Composer composer, Integer num) throws Resources.NotFoundException {
                invoke(animatedContentScope, cryptoOrderConfirmationViewState3, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(AnimatedContentScope AnimatedContent, final CryptoOrderConfirmationViewState3 content, Composer composer, int i) throws Resources.NotFoundException {
                Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                Intrinsics.checkNotNullParameter(content, "content");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1161285741, i, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment.ConfirmationContent.<anonymous>.<anonymous> (CryptoOrderConfirmationFragment.kt:268)");
                }
                if (content instanceof CryptoOrderConfirmationViewState3.Receipt) {
                    composer.startReplaceGroup(-695893787);
                    CryptoOrderConfirmationViewState3.Receipt receipt = (CryptoOrderConfirmationViewState3.Receipt) content;
                    CryptoConfirmationState confirmationState = receipt.getConfirmationState();
                    CryptoOrderConfirmationDuxo duxo = this.this$0.getDuxo();
                    composer.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer.changedInstance(duxo);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new CryptoOrderConfirmationFragment2(duxo);
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    Function1 function1 = (Function1) ((KFunction) objRememberedValue);
                    composer.startReplaceGroup(-1633490746);
                    int i2 = (i & 112) ^ 48;
                    boolean zChangedInstance2 = composer.changedInstance(this.this$0) | ((i2 > 32 && composer.changed(content)) || (i & 48) == 32);
                    final CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment = this.this$0;
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$ConfirmationContent$1$3$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoOrderConfirmationFragment.C403621.AnonymousClass3.invoke$lambda$2$lambda$1(cryptoOrderConfirmationFragment, content);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    Function0 function0 = (Function0) objRememberedValue2;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-1633490746);
                    boolean zChangedInstance3 = composer.changedInstance(this.this$0) | ((i2 > 32 && composer.changed(content)) || (i & 48) == 32);
                    final CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment2 = this.this$0;
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$ConfirmationContent$1$3$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoOrderConfirmationFragment.C403621.AnonymousClass3.invoke$lambda$4$lambda$3(cryptoOrderConfirmationFragment2, content);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    Function0 function02 = (Function0) objRememberedValue3;
                    composer.endReplaceGroup();
                    Modifier modifierAutoLogEvents$default = receipt.getShowPassiveRecurringUpsell() ? ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, this.this$0.getEventScreen(), UserInteractionEventData.Action.ENTER_RECURRING_CREATION, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new RecurringContext(null, null, null, null, null, 0.0d, null, RecurringContext.UpsellType.QUIET, 0.0d, null, null, 1919, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -8388609, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 33, null), true, false, false, true, false, null, 108, null) : Modifier.INSTANCE;
                    composer.startReplaceGroup(-1633490746);
                    boolean zChangedInstance4 = composer.changedInstance(this.this$0) | ((i2 > 32 && composer.changed(content)) || (i & 48) == 32);
                    final CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment3 = this.this$0;
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$ConfirmationContent$1$3$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoOrderConfirmationFragment.C403621.AnonymousClass3.invoke$lambda$6$lambda$5(content, cryptoOrderConfirmationFragment3);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    composer.endReplaceGroup();
                    CryptoConfirmationScreenComposable6.ConfirmationReceiptCard(confirmationState, function1, function0, function02, null, modifierAutoLogEvents$default, (Function0) objRememberedValue4, composer, CryptoConfirmationState.$stable, 16);
                    composer.endReplaceGroup();
                } else if (content instanceof CryptoOrderConfirmationViewState3.AggressiveRecurringUpsell) {
                    composer.startReplaceGroup(-695815470);
                    String code = ((CryptoOrderConfirmationViewState3.AggressiveRecurringUpsell) content).getUiCryptoOrder().getAssetCurrency().getCode();
                    composer.startReplaceGroup(-1633490746);
                    boolean zChangedInstance5 = composer.changedInstance(this.this$0) | ((((i & 112) ^ 48) > 32 && composer.changed(content)) || (i & 48) == 32);
                    final CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment4 = this.this$0;
                    Object objRememberedValue5 = composer.rememberedValue();
                    if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$ConfirmationContent$1$3$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoOrderConfirmationFragment.C403621.AnonymousClass3.invoke$lambda$8$lambda$7(cryptoOrderConfirmationFragment4, content);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue5);
                    }
                    Function0 function03 = (Function0) objRememberedValue5;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-1633490746);
                    boolean zChangedInstance6 = composer.changedInstance(this.this$0) | composer.changed(this.$isOrderFilled);
                    final CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment5 = this.this$0;
                    final boolean z = this.$isOrderFilled;
                    Object objRememberedValue6 = composer.rememberedValue();
                    if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue6 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$ConfirmationContent$1$3$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoOrderConfirmationFragment.C403621.AnonymousClass3.invoke$lambda$10$lambda$9(cryptoOrderConfirmationFragment5, z);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue6);
                    }
                    composer.endReplaceGroup();
                    CryptoRecurringOrderUpsellComposable4.CryptoRecurringOrderUpsellComposable(code, function03, (Function0) objRememberedValue6, null, composer, 0, 8);
                    composer.endReplaceGroup();
                } else if (content instanceof CryptoOrderConfirmationViewState3.FeeTierStatus) {
                    composer.startReplaceGroup(-695797476);
                    CryptoOrderConfirmationViewState3.FeeTierStatus feeTierStatus = (CryptoOrderConfirmationViewState3.FeeTierStatus) content;
                    CryptoFeeTierInfo feeTierInfo = feeTierStatus.getFeeTierInfo();
                    Boolean canSkipNotificationPrompt = feeTierStatus.getCanSkipNotificationPrompt();
                    composer.startReplaceGroup(-1633490746);
                    boolean zChangedInstance7 = composer.changedInstance(this.this$0) | composer.changed(this.$isOrderFilled);
                    final CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment6 = this.this$0;
                    final boolean z2 = this.$isOrderFilled;
                    Object objRememberedValue7 = composer.rememberedValue();
                    if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue7 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$ConfirmationContent$1$3$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoOrderConfirmationFragment.C403621.AnonymousClass3.invoke$lambda$12$lambda$11(cryptoOrderConfirmationFragment6, z2);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue7);
                    }
                    Function0 function04 = (Function0) objRememberedValue7;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-1633490746);
                    boolean zChangedInstance8 = composer.changedInstance(this.this$0) | composer.changed(this.$isOrderFilled);
                    final CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment7 = this.this$0;
                    final boolean z3 = this.$isOrderFilled;
                    Object objRememberedValue8 = composer.rememberedValue();
                    if (zChangedInstance8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue8 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$ConfirmationContent$1$3$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoOrderConfirmationFragment.C403621.AnonymousClass3.invoke$lambda$14$lambda$13(cryptoOrderConfirmationFragment7, z3);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue8);
                    }
                    composer.endReplaceGroup();
                    CryptoFeeTierStatusComposableKt.CryptoFeeTierStatusComposable(feeTierInfo, canSkipNotificationPrompt, function04, (Function0) objRememberedValue8, null, null, composer, 0, 48);
                    composer.endReplaceGroup();
                } else {
                    if (!(content instanceof CryptoOrderConfirmationViewState3.FeeTierUpgraded)) {
                        composer.startReplaceGroup(-695894249);
                        composer.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(-695774146);
                    CryptoOrderConfirmationViewState3.FeeTierUpgraded feeTierUpgraded = (CryptoOrderConfirmationViewState3.FeeTierUpgraded) content;
                    CryptoFeeTierInfo feeTierInfo2 = feeTierUpgraded.getFeeTierInfo();
                    Boolean canSkipNotificationPrompt2 = feeTierUpgraded.getCanSkipNotificationPrompt();
                    composer.startReplaceGroup(-1633490746);
                    boolean zChangedInstance9 = composer.changedInstance(this.this$0) | composer.changed(this.$isOrderFilled);
                    final CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment8 = this.this$0;
                    final boolean z4 = this.$isOrderFilled;
                    Object objRememberedValue9 = composer.rememberedValue();
                    if (zChangedInstance9 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue9 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$ConfirmationContent$1$3$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoOrderConfirmationFragment.C403621.AnonymousClass3.invoke$lambda$16$lambda$15(cryptoOrderConfirmationFragment8, z4);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue9);
                    }
                    Function0 function05 = (Function0) objRememberedValue9;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-1633490746);
                    boolean zChangedInstance10 = composer.changedInstance(this.this$0) | composer.changed(this.$isOrderFilled);
                    final CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment9 = this.this$0;
                    final boolean z5 = this.$isOrderFilled;
                    Object objRememberedValue10 = composer.rememberedValue();
                    if (zChangedInstance10 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue10 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$ConfirmationContent$1$3$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoOrderConfirmationFragment.C403621.AnonymousClass3.invoke$lambda$18$lambda$17(cryptoOrderConfirmationFragment9, z5);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue10);
                    }
                    composer.endReplaceGroup();
                    CryptoFeeTierUpgradedComposableKt.CryptoFeeTierUpgradedComposable(feeTierInfo2, canSkipNotificationPrompt2, function05, (Function0) objRememberedValue10, null, null, composer, 0, 48);
                    composer.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$2$lambda$1(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, CryptoOrderConfirmationViewState3 cryptoOrderConfirmationViewState3) {
                cryptoOrderConfirmationFragment.getDuxo().onReceiptPrimaryButtonClick(((CryptoOrderConfirmationViewState3.Receipt) cryptoOrderConfirmationViewState3).getPrimaryButtonAction());
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$4$lambda$3(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, CryptoOrderConfirmationViewState3 cryptoOrderConfirmationViewState3) {
                EventLogger.DefaultImpls.logTap$default(cryptoOrderConfirmationFragment.getEventLogger(), null, cryptoOrderConfirmationFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, "view_order", null, 4, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ((CryptoOrderConfirmationViewState3.Receipt) cryptoOrderConfirmationViewState3).getCryptoOrderContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), false, 41, null);
                cryptoOrderConfirmationFragment.getDuxo().viewOrder();
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$6$lambda$5(CryptoOrderConfirmationViewState3 cryptoOrderConfirmationViewState3, CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment) {
                CryptoOrderConfirmationViewState3.Receipt receipt = (CryptoOrderConfirmationViewState3.Receipt) cryptoOrderConfirmationViewState3;
                if (receipt.getUiCryptoOrder() != null) {
                    cryptoOrderConfirmationFragment.showRecurringInvestmentFlow(receipt.getUiCryptoOrder());
                }
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$8$lambda$7(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, CryptoOrderConfirmationViewState3 cryptoOrderConfirmationViewState3) {
                cryptoOrderConfirmationFragment.showRecurringInvestmentFlow(((CryptoOrderConfirmationViewState3.AggressiveRecurringUpsell) cryptoOrderConfirmationViewState3).getUiCryptoOrder());
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$10$lambda$9(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, boolean z) {
                cryptoOrderConfirmationFragment.getCallbacks().onOrderFlowFinished(z);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$12$lambda$11(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, boolean z) {
                cryptoOrderConfirmationFragment.getCallbacks().onOrderFlowFinished(z);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$14$lambda$13(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, boolean z) {
                cryptoOrderConfirmationFragment.getCallbacks().onContinueToNotificationPrimer(z);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$16$lambda$15(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, boolean z) {
                cryptoOrderConfirmationFragment.getCallbacks().onOrderFlowFinished(z);
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$18$lambda$17(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, boolean z) {
                cryptoOrderConfirmationFragment.getCallbacks().onContinueToNotificationPrimer(z);
                return Unit.INSTANCE;
            }
        }
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

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
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

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
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

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    public final HistoryNavigator getHistoryNavigator() {
        HistoryNavigator historyNavigator = this.historyNavigator;
        if (historyNavigator != null) {
            return historyNavigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("historyNavigator");
        return null;
    }

    public final void setHistoryNavigator(HistoryNavigator historyNavigator) {
        Intrinsics.checkNotNullParameter(historyNavigator, "<set-?>");
        this.historyNavigator = historyNavigator;
    }

    public final InvestmentScheduleKeyResolver getInvestmentScheduleKeyResolver() {
        InvestmentScheduleKeyResolver investmentScheduleKeyResolver = this.investmentScheduleKeyResolver;
        if (investmentScheduleKeyResolver != null) {
            return investmentScheduleKeyResolver;
        }
        Intrinsics.throwUninitializedPropertyAccessException("investmentScheduleKeyResolver");
        return null;
    }

    public final void setInvestmentScheduleKeyResolver(InvestmentScheduleKeyResolver investmentScheduleKeyResolver) {
        Intrinsics.checkNotNullParameter(investmentScheduleKeyResolver, "<set-?>");
        this.investmentScheduleKeyResolver = investmentScheduleKeyResolver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Screen getEventScreen() {
        return getDuxo().getEventScreen();
    }

    private final FragmentCryptoOrderConfirmationBinding getFragmentBinding() {
        Object value = this.fragmentBinding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentCryptoOrderConfirmationBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CryptoOrderConfirmationDuxo getDuxo() {
        return (CryptoOrderConfirmationDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public int getConfirmationLayoutId() {
        return this.confirmationLayoutId;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public boolean getUsePrimaryBackground() {
        return this.usePrimaryBackground;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return inflater.inflate(getConfirmationLayoutId(), container, false);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putAchromaticOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    /* compiled from: CryptoOrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$onViewCreated$1", m3645f = "CryptoOrderConfirmationFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$onViewCreated$1 */
    static final class C403671 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C403671(Continuation<? super C403671> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderConfirmationFragment.this.new C403671(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C403671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoOrderConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<CryptoOrderConfirmationViewState, Continuation<? super Unit>, Object>, ContinuationImpl6 {
            AnonymousClass1(Object obj) {
                super(2, obj, CryptoOrderConfirmationFragment.class, "bindUi", "bindUi(Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationViewState;)V", 4);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState, Continuation<? super Unit> continuation) {
                return C403671.invokeSuspend$bindUi((CryptoOrderConfirmationFragment) this.receiver, cryptoOrderConfirmationViewState, continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$bindUi(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState, Continuation continuation) {
            cryptoOrderConfirmationFragment.bindUi(cryptoOrderConfirmationViewState);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<CryptoOrderConfirmationViewState> stateFlow = CryptoOrderConfirmationFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderConfirmationFragment.this);
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
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C403671(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C403682(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C403693(null), 1, null);
        FrameLayout frameLayout = getFragmentBinding().contentRoot;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        frameLayout.setBackgroundTintList(ColorStateList.valueOf(ThemeColors.getThemeColor(contextRequireContext, C20690R.attr.colorBackgroundPrimary)));
        getOrderManager().setBillingOrderCallbacks(this);
    }

    /* compiled from: CryptoOrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$onViewCreated$2", m3645f = "CryptoOrderConfirmationFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$onViewCreated$2 */
    static final class C403682 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C403682(Continuation<? super C403682> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderConfirmationFragment.this.new C403682(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C403682) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoOrderConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$onViewCreated$2$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ CryptoOrderConfirmationFragment $tmp0;

            AnonymousClass1(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment) {
                this.$tmp0 = cryptoOrderConfirmationFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, CryptoOrderConfirmationFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<CryptoOrderConfirmationEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C403682.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<CryptoOrderConfirmationEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, Event event, Continuation continuation) {
            cryptoOrderConfirmationFragment.handleEvent(event);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(CryptoOrderConfirmationFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderConfirmationFragment.this);
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

    /* compiled from: CryptoOrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$onViewCreated$3", m3645f = "CryptoOrderConfirmationFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$onViewCreated$3 */
    static final class C403693 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C403693(Continuation<? super C403693> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderConfirmationFragment.this.new C403693(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C403693) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<CryptoOrderConfirmationViewState> stateFlow = CryptoOrderConfirmationFragment.this.getDuxo().getStateFlow();
                Flow flowTake = FlowKt.take(new Flow<CryptoOrderContext>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$onViewCreated$3$invokeSuspend$$inlined$mapNotNull$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CryptoOrderContext> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$onViewCreated$3$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$onViewCreated$3$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "CryptoOrderConfirmationFragment.kt", m3646l = {52}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$onViewCreated$3$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
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
                                CryptoOrderContext cryptoOrderContext = ((CryptoOrderConfirmationViewState) obj).getCryptoOrderContext();
                                if (cryptoOrderContext != null) {
                                    anonymousClass1.label = 1;
                                    if (flowCollector.emit(cryptoOrderContext, anonymousClass1) == coroutine_suspended) {
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
                }, 1);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoOrderConfirmationFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTake, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: CryptoOrderConfirmationFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$onViewCreated$3$2", m3645f = "CryptoOrderConfirmationFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$onViewCreated$3$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CryptoOrderContext, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoOrderConfirmationFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoOrderConfirmationFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoOrderContext cryptoOrderContext, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(cryptoOrderContext, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Context.ProductTag productTag = null;
                int i4 = 0;
                String str5 = null;
                String str6 = null;
                String str7 = null;
                Screen screen = null;
                String str8 = null;
                Asset asset = null;
                List list = null;
                NewsFeedItem newsFeedItem = null;
                Feedback feedback = null;
                CXIssue cXIssue = null;
                InAppSurvey inAppSurvey = null;
                ListsContext listsContext = null;
                DirectDepositContext directDepositContext = null;
                DirectDepositSwitcherContext directDepositSwitcherContext = null;
                RecurringContext recurringContext = null;
                OrderKind orderKind = null;
                InAppComm inAppComm = null;
                LearningLesson learningLesson = null;
                LearningSection learningSection = null;
                LearningMatchingExercise learningMatchingExercise = null;
                LearningAnswer learningAnswer = null;
                LearningMatchingExerciseEntity learningMatchingExerciseEntity = null;
                LearningMatchingExerciseBucket learningMatchingExerciseBucket = null;
                SafetyLabelInfoTag safetyLabelInfoTag = null;
                SafetyLabelLesson safetyLabelLesson = null;
                String str9 = null;
                EducationTour educationTour = null;
                EducationTourSection educationTourSection = null;
                EducationTourOutroTooltip educationTourOutroTooltip = null;
                EducationTourOutro educationTourOutro = null;
                EducationSeries educationSeries = null;
                EducationHome educationHome = null;
                FundingContext fundingContext = null;
                URLComponents uRLComponents = null;
                Article article = null;
                TransactionDisputeContext transactionDisputeContext = null;
                NetworkContext networkContext = null;
                PlaidEventData plaidEventData = null;
                IAVContext iAVContext = null;
                TransferContext transferContext = null;
                MAXTransferContext mAXTransferContext = null;
                MAXTransferAccountSelectionContext mAXTransferAccountSelectionContext = null;
                QueuedDepositContext queuedDepositContext = null;
                RewardContext rewardContext = null;
                SearchResultItem searchResultItem = null;
                OptionsContext optionsContext = null;
                OptionStrategyContext optionStrategyContext = null;
                OptionWatchlistAboutContext optionWatchlistAboutContext = null;
                DisclosureDropdown disclosureDropdown = null;
                GraphContext graphContext = null;
                EtpCompositionContext etpCompositionContext = null;
                LoginContext loginContext = null;
                OrderSummaryNbbo orderSummaryNbbo = null;
                AgreementContext agreementContext = null;
                IpoAccessListVideoContext ipoAccessListVideoContext = null;
                RecommendationsContext recommendationsContext = null;
                IpoAccessInstrumentContext ipoAccessInstrumentContext = null;
                IpoaAllocationCylinderContext ipoaAllocationCylinderContext = null;
                IpoaParticipationGraphContext ipoaParticipationGraphContext = null;
                IpoaPostCobFollowUpContext ipoaPostCobFollowUpContext = null;
                VoiceRecordContext voiceRecordContext = null;
                CXInquiryContext cXInquiryContext = null;
                InstantDeposit instantDeposit = null;
                CryptoTransferContext cryptoTransferContext = null;
                CryptoGiftContext cryptoGiftContext = null;
                ShareholderQAContext shareholderQAContext = null;
                RHYContext rHYContext = null;
                ChallengeContext challengeContext = null;
                SLIPContext sLIPContext = null;
                SLIPHubStockRowContext sLIPHubStockRowContext = null;
                PaymentLinkingContext paymentLinkingContext = null;
                AdvancedChartsContext advancedChartsContext = null;
                PaycheckSectionContext paycheckSectionContext = null;
                Basket basket = null;
                InvestFlowContext investFlowContext = null;
                MarginUpgradeContext marginUpgradeContext = null;
                AlertContext alertContext = null;
                TechnicalIndicatorContext technicalIndicatorContext = null;
                DcfKycContext dcfKycContext = null;
                ValueSelectorContext valueSelectorContext = null;
                AdvancedChartsAboutContext advancedChartsAboutContext = null;
                GoldContext goldContext = null;
                RecsRetirementContext recsRetirementContext = null;
                InvestorProfileQuestionnaireContext investorProfileQuestionnaireContext = null;
                EquityOrderContext equityOrderContext = null;
                KeychainLoginContext keychainLoginContext = null;
                PasskeyEnrollmentContext passkeyEnrollmentContext = null;
                CryptoAssetContext cryptoAssetContext = null;
                CryptoTransactionContext cryptoTransactionContext = null;
                CryptoTokenApprovalContext cryptoTokenApprovalContext = null;
                NcwOnboardingContext ncwOnboardingContext = null;
                NcwFundingContext ncwFundingContext = null;
                DappRequestContext dappRequestContext = null;
                String str10 = null;
                PerformanceChartContext performanceChartContext = null;
                BrokerageAccountContext brokerageAccountContext = null;
                BrokerageAccountSwitcherContext brokerageAccountSwitcherContext = null;
                OptionsEligibilityContext optionsEligibilityContext = null;
                EventLogger.DefaultImpls.logAppear$default(this.this$0.getEventLogger(), null, this.this$0.getEventScreen(), null, null, new com.robinhood.rosetta.eventlogging.Context(i, i2, i3, str, str2, str3, str4, productTag, i4, str5, str6, str7, screen, str8, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str9, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str10, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, (CryptoOrderContext) this.L$0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), 13, null);
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getOrderManager().setBillingOrderCallbacks(null);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        EventLogger.DefaultImpls.logScreenDisappear$default(getEventLogger(), null, getEventScreen(), null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, getDuxo().getStateFlow().getValue().getCryptoOrderContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), 13, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindUi(final CryptoOrderConfirmationViewState viewState) {
        ScarletManager scarletManager;
        getFragmentBinding().orderConfirmationLayoutContainer.setContent(ComposableLambda3.composableLambdaInstance(247852491, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment.bindUi.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(247852491, i, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment.bindUi.<anonymous> (CryptoOrderConfirmationFragment.kt:193)");
                }
                ProvidedValue[] providedValueArr = {LocalNavigator.getLocalNavigator().provides(CryptoOrderConfirmationFragment.this.getNavigator()), AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor().provides(new UserInteractionEventDescriptor(null, CryptoOrderConfirmationFragment.this.getEventScreen(), null, null, null, null, 61, null))};
                final CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState = viewState;
                final CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment = CryptoOrderConfirmationFragment.this;
                CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambda3.rememberComposableLambda(350536331, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment.bindUi.1.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(350536331, i2, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment.bindUi.<anonymous>.<anonymous> (CryptoOrderConfirmationFragment.kt:199)");
                        }
                        final CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState2 = cryptoOrderConfirmationViewState;
                        final CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment2 = cryptoOrderConfirmationFragment;
                        BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1139573827, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment.bindUi.1.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i3) {
                                if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1139573827, i3, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment.bindUi.<anonymous>.<anonymous>.<anonymous> (CryptoOrderConfirmationFragment.kt:200)");
                                }
                                final CryptoOrderConfirmationViewState3 confirmationContent = cryptoOrderConfirmationViewState2.getConfirmationContent();
                                if (confirmationContent != null) {
                                    final CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment3 = cryptoOrderConfirmationFragment2;
                                    final CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState3 = cryptoOrderConfirmationViewState2;
                                    AnimatedVisibilityKt.AnimatedVisibility(true, (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, (Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(-1322148042, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment.bindUi.1.1.1.1
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer4, Integer num) {
                                            invoke(animatedVisibilityScope, composer4, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer4, int i4) {
                                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1322148042, i4, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment.bindUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoOrderConfirmationFragment.kt:203)");
                                            }
                                            cryptoOrderConfirmationFragment3.ConfirmationContent(AnimatedVisibility, confirmationContent, cryptoOrderConfirmationViewState3.isOrderFilled(), composer4, i4 & 14);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer3, 54), composer3, 196614, 30);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 100663296, 255);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        ScarletContextWrapper scarletContextWrapper = getScarletContextWrapper();
        if (scarletContextWrapper == null || (scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper)) == null) {
            scarletManager = getScarletManager();
        }
        final Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(scarletManager);
        getFragmentBinding().loadingView.setContent(ComposableLambda3.composableLambdaInstance(-624365182, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment.bindUi.2
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-624365182, i, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment.bindUi.<anonymous> (CryptoOrderConfirmationFragment.kt:215)");
                }
                Observable<ThemesFromScarlet> observable = observableThemeChangesForCompose;
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new io.reactivex.functions.Function() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$bindUi$2$1$1
                        @Override // io.reactivex.functions.Function
                        public final ThemesFromScarlet apply(ThemesFromScarlet it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            return ThemesFromScarlet.copy$default(it, false, false, false, false, false, null, 55, null);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Observable<R> map = observable.map((io.reactivex.functions.Function) objRememberedValue);
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                final CryptoOrderConfirmationViewState cryptoOrderConfirmationViewState = viewState;
                BentoTheme2.BentoTheme(map, null, ComposableLambda3.rememberComposableLambda(1769641268, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment.bindUi.2.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1769641268, i2, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment.bindUi.<anonymous>.<anonymous> (CryptoOrderConfirmationFragment.kt:216)");
                        }
                        boolean orderReceived = cryptoOrderConfirmationViewState.getOrderReceived();
                        Modifier modifierSafeDrawingPadding = WindowInsetsPadding_androidKt.safeDrawingPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null));
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i3 = BentoTheme.$stable;
                        OrderInProgressLoadingView2.m26346OrderInProgressLoadingViewt6yy7ic(orderReceived, modifierSafeDrawingPadding, bentoTheme.getColors(composer2, i3).m21368getAccent0d7_KjU(), bentoTheme.getColors(composer2, i3).getNova(), null, composer2, 0, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 384, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ConfirmationContent(final AnimatedVisibilityScope animatedVisibilityScope, final CryptoOrderConfirmationViewState3 cryptoOrderConfirmationViewState3, final boolean z, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-742032142);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(animatedVisibilityScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(cryptoOrderConfirmationViewState3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-742032142, i2, -1, "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment.ConfirmationContent (CryptoOrderConfirmationFragment.kt:232)");
            }
            CryptoConfirmationScreenComposable6.CryptoConfirmationScreenComposable(animatedVisibilityScope, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), ComposableLambda3.rememberComposableLambda(-1998603569, true, new C403621(cryptoOrderConfirmationViewState3, this, z), composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 432, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoOrderConfirmationFragment.ConfirmationContent$lambda$1(this.f$0, animatedVisibilityScope, cryptoOrderConfirmationViewState3, z, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotificationUpsell(boolean isOrderFilled) {
        Callbacks callbacks = getCallbacks();
        Function0<Unit> function0 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoOrderConfirmationFragment.showNotificationUpsell$lambda$7(this.f$0);
            }
        };
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        callbacks.launchPostUpsellAndMaybeLearnEarnRewardAndFinish(function0, Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, ProductUpsellKey.INSTANCE.getUpsellNotificationPostCryptoTrade(), null, false, 12, null), isOrderFilled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showNotificationUpsell$lambda$7(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment) {
        Navigator navigator = cryptoOrderConfirmationFragment.getNavigator();
        android.content.Context contextRequireContext = cryptoOrderConfirmationFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, ProductUpsellKey.INSTANCE.getUpsellNotificationPostCryptoTrade(), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public void onOrderReceived(CryptoOrderManager.Response order) {
        Intrinsics.checkNotNullParameter(order, "order");
        getAnalytics().logUserAction(AnalyticsStrings.USER_ACTION_TRADED_CRYPTO);
        getDuxo().onOrderUpdated(order);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderConfirmationFragment
    public void onOrderUpdated(CryptoOrderManager.Response order) {
        Intrinsics.checkNotNullParameter(order, "order");
        getDuxo().onOrderUpdated(order);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openOrderDetail(UiCryptoOrder order) {
        FragmentKey fragmentKeyResolve$default = HistoryNavigator.resolve$default(getHistoryNavigator(), order.getCryptoOrder().getTransactionReference(), true, false, 4, null);
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, fragmentKeyResolve$default, false, false, false, null, false, null, true, false, null, NavigationType.PUSH, 1788, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void openCostDetail(UiCryptoOrder order) {
        int i;
        RhBottomSheetDialogFragment.Companion companion = RhBottomSheetDialogFragment.INSTANCE;
        CharSequence text = getText(C11048R.string.crypto_order_collar_explanation_dialog_title);
        int i2 = WhenMappings.$EnumSwitchMapping$0[order.getCryptoOrder().getSide().ordinal()];
        if (i2 == 1) {
            i = C11048R.string.crypto_order_collar_explanation_dialog_message_buy;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C11048R.string.crypto_order_collar_explanation_dialog_message_sell;
        }
        String string2 = getString(i, new Object[0]);
        String string3 = getString(C11048R.string.general_action_learn_more);
        String string4 = getString(C11048R.string.general_label_dismiss);
        Bundle bundle = new Bundle();
        bundle.putString(PASSTHROUGH_LINK, getString(C11048R.string.url_crypto_market_price_faq));
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) companion.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(0, text, null, string2, null, string3, null, string4, null, false, false, null, bundle, null, true, true, false, false, null, null, null, 2043732, null));
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        rhBottomSheetDialogFragment.show(parentFragmentManager, "cryptoCostDetailBottomSheet");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showFeeDefinitionBottomSheet(CryptoOrderConfirmationEvent.ShowFeeDefinitionBottomSheet event) {
        CryptoFeeDefinitionBottomSheetFragment cryptoFeeDefinitionBottomSheetFragment = (CryptoFeeDefinitionBottomSheetFragment) CryptoFeeDefinitionBottomSheetFragment.INSTANCE.newInstance((Parcelable) event.getArgs());
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        cryptoFeeDefinitionBottomSheetFragment.show(childFragmentManager, "cryptoFeeDefinitionBottomSheet");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showTradeBonusBottomSheet(CryptoOrderConfirmationEvent.ShowTradeBonusBottomSheet event) {
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new CryptoTradeBonusBottomSheetFragmentKey(CryptoTradeBonusBottomSheetFragmentKey.EntryPoint.OrderConfirmation.INSTANCE, UiCryptoOrders2.tradeBonusBottomSheetOrderExecutionState(event.getOrder(), event.isEstimate())), null, 2, null).show(getChildFragmentManager(), "tradeBonusBottomSheet");
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onPrimaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        if (dialogId == 0) {
            String string2 = passthroughArgs != null ? passthroughArgs.getString(PASSTHROUGH_LINK) : null;
            if (string2 != null) {
                return processLink(string2);
            }
        }
        return false;
    }

    private final boolean processLink(String link) {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, link);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRecurringInvestmentFlow(UiCryptoOrder order) {
        boolean z = !order.getExecutions().isEmpty();
        int i = WhenMappings.$EnumSwitchMapping$1[getAppType().ordinal()];
        if (i == 1) {
            throw new IllegalStateException("Not supported");
        }
        if (i != 2) {
            if (i == 3) {
                BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C403702(order, z, null), 3, null);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
        NavigationKey recurringCreationKey = getInvestmentScheduleKeyResolver().getRecurringCreationKey(order.getCurrencyPair().getId(), true, RecurringContext.EntryPoint.CRYPTO_ORDER_RECEIPT, null, null, null, null);
        Intrinsics.checkNotNull(recurringCreationKey, "null cannot be cast to non-null type com.robinhood.android.navigation.keys.IntentKey");
        final IntentKey intentKey = (IntentKey) recurringCreationKey;
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        getCallbacks().launchPostUpsellAndMaybeLearnEarnRewardAndFinish(new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoOrderConfirmationFragment.showRecurringInvestmentFlow$lambda$10(this.f$0, intentKey);
            }
        }, Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, intentKey, null, false, 12, null), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRecurringInvestmentFlow$lambda$10(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, IntentKey intentKey) {
        Navigator navigator = cryptoOrderConfirmationFragment.getNavigator();
        android.content.Context contextRequireContext = cryptoOrderConfirmationFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, intentKey, null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoOrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$showRecurringInvestmentFlow$2", m3645f = "CryptoOrderConfirmationFragment.kt", m3646l = {532}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$showRecurringInvestmentFlow$2 */
    static final class C403702 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $isOrderFilled;
        final /* synthetic */ UiCryptoOrder $order;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C403702(UiCryptoOrder uiCryptoOrder, boolean z, Continuation<? super C403702> continuation) {
            super(2, continuation);
            this.$order = uiCryptoOrder;
            this.$isOrderFilled = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderConfirmationFragment.this.new C403702(this.$order, this.$isOrderFilled, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C403702) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objFirst;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowConnectWhen = Operators.connectWhen(CryptoOrderConfirmationFragment.this.getCryptoAccountProvider().streamAccountNumber(new CryptoAccountSwitcherLocation.Buy(this.$order.getCurrencyPair().getId())), CryptoOrderConfirmationFragment.this.getCryptoExperimentsStore().streamCryptoMibExperiment(), FlowKt.flowOf((Object) null));
                this.label = 1;
                objFirst = FlowKt.first(flowConnectWhen, this);
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                objFirst = obj;
            }
            NavigationKey recurringCreationKey = CryptoOrderConfirmationFragment.this.getInvestmentScheduleKeyResolver().getRecurringCreationKey(this.$order.getCurrencyPair().getId(), true, RecurringContext.EntryPoint.CRYPTO_ORDER_RECEIPT, null, null, null, (String) objFirst);
            Intrinsics.checkNotNull(recurringCreationKey, "null cannot be cast to non-null type com.robinhood.android.navigation.keys.FragmentKey");
            final FragmentKey fragmentKey = (FragmentKey) recurringCreationKey;
            Navigator navigator = CryptoOrderConfirmationFragment.this.getNavigator();
            android.content.Context contextRequireContext = CryptoOrderConfirmationFragment.this.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Intent intentCreateIntentForFragment$default = Navigator.DefaultImpls.createIntentForFragment$default(navigator, contextRequireContext, fragmentKey, false, false, false, null, false, false, false, false, false, null, false, 7924, null);
            Callbacks callbacks = CryptoOrderConfirmationFragment.this.getCallbacks();
            final CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment = CryptoOrderConfirmationFragment.this;
            callbacks.launchPostUpsellAndMaybeLearnEarnRewardAndFinish(new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$showRecurringInvestmentFlow$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoOrderConfirmationFragment.C403702.invokeSuspend$lambda$0(cryptoOrderConfirmationFragment, fragmentKey);
                }
            }, intentCreateIntentForFragment$default, this.$isOrderFilled);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, FragmentKey fragmentKey) {
            Navigator navigator = cryptoOrderConfirmationFragment.getNavigator();
            android.content.Context contextRequireContext = cryptoOrderConfirmationFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, contextRequireContext, fragmentKey, false, false, false, false, null, false, null, null, 1012, null);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.shared.transfers.store.cryptocheckout.BillingCryptoOrderCallbacks
    public void on3DSecureRedirect(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        getCallbacks().onBillingOrder3DSecureRedirect(url);
    }

    /* compiled from: CryptoOrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationFragment$InitArgs;", "Landroid/os/Parcelable;", "source", "", "<init>", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitArgs implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<InitArgs> CREATOR = new Creator();
        private final String source;

        /* compiled from: CryptoOrderConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitArgs(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs[] newArray(int i) {
                return new InitArgs[i];
            }
        }

        public static /* synthetic */ InitArgs copy$default(InitArgs initArgs, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = initArgs.source;
            }
            return initArgs.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        public final InitArgs copy(String source) {
            return new InitArgs(source);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InitArgs) && Intrinsics.areEqual(this.source, ((InitArgs) other).source);
        }

        public int hashCode() {
            String str = this.source;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "InitArgs(source=" + this.source + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.source);
        }

        public InitArgs(String str) {
            this.source = str;
        }

        public final String getSource() {
            return this.source;
        }
    }

    /* compiled from: CryptoOrderConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationFragment;", "Lcom/robinhood/shared/trade/crypto/ui/orderConfirmation/CryptoOrderConfirmationFragment$InitArgs;", "<init>", "()V", CryptoOrderConfirmationFragment.PASSTHROUGH_LINK, "", "CONFIRMATION_SCREEN_BOTTOM_SHEET_ID", "", "DIRECT_DEEPLINK_LOADING_INDICATOR_THRESHOLD_MS", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CryptoOrderConfirmationFragment, InitArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public InitArgs getArgs(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment) {
            return (InitArgs) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoOrderConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoOrderConfirmationFragment newInstance(InitArgs initArgs) {
            return (CryptoOrderConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, initArgs);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoOrderConfirmationFragment cryptoOrderConfirmationFragment, InitArgs initArgs) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoOrderConfirmationFragment, initArgs);
        }
    }
}
