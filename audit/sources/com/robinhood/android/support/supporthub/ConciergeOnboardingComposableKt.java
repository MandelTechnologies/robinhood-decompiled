package com.robinhood.android.support.supporthub;

import android.content.Context;
import android.net.Uri;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.AnimationModifier;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.TopAppBarColors;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.platform.WindowInfo;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.Font;
import androidx.compose.p011ui.text.font.Font2;
import androidx.compose.p011ui.text.font.FontFamily4;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongState2;
import androidx.compose.runtime.SnapshotLongState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.Cue;
import androidx.media3.common.text.CueGroup;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.font.C16915R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt;
import com.robinhood.android.support.supporthub.ConciergeOnboardingEvent;
import com.robinhood.android.support.supporthub.ConciergeOnboardingViewState;
import com.robinhood.android.support.supporthub.ConciergeOnboardingViewState2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.rosetta.eventlogging.AcatsInContext;
import com.robinhood.rosetta.eventlogging.AccountType;
import com.robinhood.rosetta.eventlogging.AdvancedChartsAboutContext;
import com.robinhood.rosetta.eventlogging.AdvancedChartsContext;
import com.robinhood.rosetta.eventlogging.AdvisoryFundingMethodContext;
import com.robinhood.rosetta.eventlogging.AdvisoryFutureReturnScrubBarContext;
import com.robinhood.rosetta.eventlogging.AdvisoryFutureReturnsGraphContext;
import com.robinhood.rosetta.eventlogging.AgreementContext;
import com.robinhood.rosetta.eventlogging.AlertContext;
import com.robinhood.rosetta.eventlogging.Article;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Basket;
import com.robinhood.rosetta.eventlogging.BreakingNewsContext;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.BrokerageAccountSwitcherContext;
import com.robinhood.rosetta.eventlogging.BuyingPowerHubContext;
import com.robinhood.rosetta.eventlogging.BuyingPowerRowContext;
import com.robinhood.rosetta.eventlogging.CXInquiryContext;
import com.robinhood.rosetta.eventlogging.CXIssue;
import com.robinhood.rosetta.eventlogging.CatpayOrderContext;
import com.robinhood.rosetta.eventlogging.ChallengeContext;
import com.robinhood.rosetta.eventlogging.ComboOrderDetailContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ConciergePlusSupportContext;
import com.robinhood.rosetta.eventlogging.ConciergeSupportContext;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.CortexDigestContext;
import com.robinhood.rosetta.eventlogging.CortexDigestOnboardingContext;
import com.robinhood.rosetta.eventlogging.CortexPortfolioDigestContext;
import com.robinhood.rosetta.eventlogging.CountryGatingContext;
import com.robinhood.rosetta.eventlogging.CryptoAssetContext;
import com.robinhood.rosetta.eventlogging.CryptoFeeTierStatusContext;
import com.robinhood.rosetta.eventlogging.CryptoGiftContext;
import com.robinhood.rosetta.eventlogging.CryptoOrderContext;
import com.robinhood.rosetta.eventlogging.CryptoPostTradeFeeTierStatusContext;
import com.robinhood.rosetta.eventlogging.CryptoPostTradeFeeTierUpgradedContext;
import com.robinhood.rosetta.eventlogging.CryptoQuickTradeButtonContext;
import com.robinhood.rosetta.eventlogging.CryptoStakingContext;
import com.robinhood.rosetta.eventlogging.CryptoTokenApprovalContext;
import com.robinhood.rosetta.eventlogging.CryptoTransactionContext;
import com.robinhood.rosetta.eventlogging.CryptoTransferContext;
import com.robinhood.rosetta.eventlogging.CryptoTransferLimitContext;
import com.robinhood.rosetta.eventlogging.DappBrowserContext;
import com.robinhood.rosetta.eventlogging.DappRequestContext;
import com.robinhood.rosetta.eventlogging.DashboardWidgetContext;
import com.robinhood.rosetta.eventlogging.DayTradeCardContext;
import com.robinhood.rosetta.eventlogging.DayTradeCounterGraphicContext;
import com.robinhood.rosetta.eventlogging.DcfKycContext;
import com.robinhood.rosetta.eventlogging.DeepLinkContext;
import com.robinhood.rosetta.eventlogging.DirectDepositContext;
import com.robinhood.rosetta.eventlogging.DirectDepositSwitcherContext;
import com.robinhood.rosetta.eventlogging.DisclosureDropdown;
import com.robinhood.rosetta.eventlogging.EarningsCallContext;
import com.robinhood.rosetta.eventlogging.EducationHome;
import com.robinhood.rosetta.eventlogging.EducationSeries;
import com.robinhood.rosetta.eventlogging.EducationTour;
import com.robinhood.rosetta.eventlogging.EducationTourOutro;
import com.robinhood.rosetta.eventlogging.EducationTourOutroTooltip;
import com.robinhood.rosetta.eventlogging.EducationTourSection;
import com.robinhood.rosetta.eventlogging.EquitiesLadderContext;
import com.robinhood.rosetta.eventlogging.EquityOrderContext;
import com.robinhood.rosetta.eventlogging.EquityScreenerContext;
import com.robinhood.rosetta.eventlogging.EtpCompositionContext;
import com.robinhood.rosetta.eventlogging.EventContractHubCardContext;
import com.robinhood.rosetta.eventlogging.EventContractOrderContext;
import com.robinhood.rosetta.eventlogging.EventContractsPositionContext;
import com.robinhood.rosetta.eventlogging.FXRate;
import com.robinhood.rosetta.eventlogging.Feedback;
import com.robinhood.rosetta.eventlogging.FundingContext;
import com.robinhood.rosetta.eventlogging.FuturesAccountStatusContext;
import com.robinhood.rosetta.eventlogging.FuturesContractContext;
import com.robinhood.rosetta.eventlogging.FuturesLadderContext;
import com.robinhood.rosetta.eventlogging.FuturesOrderButtonContext;
import com.robinhood.rosetta.eventlogging.FuturesOrderContext;
import com.robinhood.rosetta.eventlogging.FuturesPositionContext;
import com.robinhood.rosetta.eventlogging.FuturesTradeBarContext;
import com.robinhood.rosetta.eventlogging.GDPRConsentManagementContext;
import com.robinhood.rosetta.eventlogging.GoldContext;
import com.robinhood.rosetta.eventlogging.GoldDefaultOptInContext;
import com.robinhood.rosetta.eventlogging.GoldUpgradeContext;
import com.robinhood.rosetta.eventlogging.GoldUpgradeType;
import com.robinhood.rosetta.eventlogging.GraphContext;
import com.robinhood.rosetta.eventlogging.IAVContext;
import com.robinhood.rosetta.eventlogging.InAppComm;
import com.robinhood.rosetta.eventlogging.InAppSurvey;
import com.robinhood.rosetta.eventlogging.InstantDeposit;
import com.robinhood.rosetta.eventlogging.InstantUpsellContext;
import com.robinhood.rosetta.eventlogging.InternalAssetTransferContext;
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
import com.robinhood.rosetta.eventlogging.LegendAdvancedChartsContext;
import com.robinhood.rosetta.eventlogging.List;
import com.robinhood.rosetta.eventlogging.ListsContext;
import com.robinhood.rosetta.eventlogging.LoadingOverlaySpinnerContext;
import com.robinhood.rosetta.eventlogging.LoginContext;
import com.robinhood.rosetta.eventlogging.LogoutContext;
import com.robinhood.rosetta.eventlogging.MAXTransferAccountSelectionContext;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.MarginCallMarketOrderDataMismatch;
import com.robinhood.rosetta.eventlogging.MarginHealthState;
import com.robinhood.rosetta.eventlogging.MarginMaintenanceTableRowContext;
import com.robinhood.rosetta.eventlogging.MarginTieredRatesContext;
import com.robinhood.rosetta.eventlogging.MarginUpgradeContext;
import com.robinhood.rosetta.eventlogging.MicrogramInstallContext;
import com.robinhood.rosetta.eventlogging.NCWTokenVisibilityContext;
import com.robinhood.rosetta.eventlogging.NcwFundingContext;
import com.robinhood.rosetta.eventlogging.NcwMultichainTokenContext;
import com.robinhood.rosetta.eventlogging.NcwOnboardingContext;
import com.robinhood.rosetta.eventlogging.NcwTransferContext;
import com.robinhood.rosetta.eventlogging.NetworkContext;
import com.robinhood.rosetta.eventlogging.NewsFeedItem;
import com.robinhood.rosetta.eventlogging.NotificationContext;
import com.robinhood.rosetta.eventlogging.OnboardingWelcomeTakeoverScreenContext;
import com.robinhood.rosetta.eventlogging.OptionOnboardingActionContext;
import com.robinhood.rosetta.eventlogging.OptionOnboardingContext;
import com.robinhood.rosetta.eventlogging.OptionOnboardingErrorContext;
import com.robinhood.rosetta.eventlogging.OptionOrderBidAskBarContext;
import com.robinhood.rosetta.eventlogging.OptionOrderDetailContext;
import com.robinhood.rosetta.eventlogging.OptionOrderDetailLegContext;
import com.robinhood.rosetta.eventlogging.OptionSimulatedReturnsContext;
import com.robinhood.rosetta.eventlogging.OptionStrategyContext;
import com.robinhood.rosetta.eventlogging.OptionWatchlistAboutContext;
import com.robinhood.rosetta.eventlogging.OptionsCancelNewContext;
import com.robinhood.rosetta.eventlogging.OptionsChainCustomizationContext;
import com.robinhood.rosetta.eventlogging.OptionsContext;
import com.robinhood.rosetta.eventlogging.OptionsEligibilityContext;
import com.robinhood.rosetta.eventlogging.OrderKind;
import com.robinhood.rosetta.eventlogging.OrderSummaryNbbo;
import com.robinhood.rosetta.eventlogging.P2PContext;
import com.robinhood.rosetta.eventlogging.PasskeyEnrollmentContext;
import com.robinhood.rosetta.eventlogging.PatternDayTradingContext;
import com.robinhood.rosetta.eventlogging.PaycheckSectionContext;
import com.robinhood.rosetta.eventlogging.PaymentLinkingContext;
import com.robinhood.rosetta.eventlogging.PendingOptionOrderContext;
import com.robinhood.rosetta.eventlogging.PerformanceChartContext;
import com.robinhood.rosetta.eventlogging.PerpetualContractContext;
import com.robinhood.rosetta.eventlogging.PerpetualPositionContext;
import com.robinhood.rosetta.eventlogging.PerpetualsOrderContext;
import com.robinhood.rosetta.eventlogging.PlaidEventData;
import com.robinhood.rosetta.eventlogging.PortfolioAccountContext;
import com.robinhood.rosetta.eventlogging.PortfolioSharingContext;
import com.robinhood.rosetta.eventlogging.PositionsInstrumentType;
import com.robinhood.rosetta.eventlogging.PositionsSortOptionsContext;
import com.robinhood.rosetta.eventlogging.PostSignupOnboardingContext;
import com.robinhood.rosetta.eventlogging.PostTransferActionContext;
import com.robinhood.rosetta.eventlogging.PostTransferUpsellContext;
import com.robinhood.rosetta.eventlogging.PrismContext;
import com.robinhood.rosetta.eventlogging.QueuedDepositContext;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.RecommendationsContext;
import com.robinhood.rosetta.eventlogging.RecsRetirementContext;
import com.robinhood.rosetta.eventlogging.RecurringContext;
import com.robinhood.rosetta.eventlogging.ReferralEntryPointContext;
import com.robinhood.rosetta.eventlogging.ReferralInviteContext;
import com.robinhood.rosetta.eventlogging.ResumeApplicationTakeoverContext;
import com.robinhood.rosetta.eventlogging.RetirementContext;
import com.robinhood.rosetta.eventlogging.RetirementFundingMethodsContext;
import com.robinhood.rosetta.eventlogging.ReturnsComparisonContext;
import com.robinhood.rosetta.eventlogging.RewardContext;
import com.robinhood.rosetta.eventlogging.SLIPContext;
import com.robinhood.rosetta.eventlogging.SLIPHubStockRowContext;
import com.robinhood.rosetta.eventlogging.SafetyLabelInfoTag;
import com.robinhood.rosetta.eventlogging.SafetyLabelLesson;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.SearchEquityScreenerContext;
import com.robinhood.rosetta.eventlogging.SearchResultItem;
import com.robinhood.rosetta.eventlogging.ShareholderQAContext;
import com.robinhood.rosetta.eventlogging.SlipOnboardingCheckboxContext;
import com.robinhood.rosetta.eventlogging.SocialTradingContext;
import com.robinhood.rosetta.eventlogging.StepUpVerificationContext;
import com.robinhood.rosetta.eventlogging.SupportAppointmentSettingContext;
import com.robinhood.rosetta.eventlogging.TechnicalIndicatorContext;
import com.robinhood.rosetta.eventlogging.TransactionDisputeContext;
import com.robinhood.rosetta.eventlogging.TransferContext;
import com.robinhood.rosetta.eventlogging.TransferErrorContext;
import com.robinhood.rosetta.eventlogging.URLComponents;
import com.robinhood.rosetta.eventlogging.UpsellBannerContext;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.rosetta.eventlogging.ValueSelectorContext;
import com.robinhood.rosetta.eventlogging.VoiceRecordContext;
import com.robinhood.rosetta.eventlogging.WiresContext;
import com.robinhood.shared.support.C39996R;
import com.robinhood.shared.support.contracts.SupportHubFragmentKey;
import com.robinhood.utils.p409ui.edge2edge.OverrideSystemBarsStyle;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import okio.ByteString;

/* compiled from: ConciergeOnboardingComposable.kt */
@Metadata(m3635d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\u001a=\u0010\b\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u001d\u0010\n\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\f\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\f\u0010\u000b\u001a[\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001aM\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u009c\u0001\u0010'\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0019\b\u0002\u0010\u001f\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\u0002\b\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010 2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\b\u0002\u0010$\u001a\u00020\u000f2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00030\u001cH\u0003¢\u0006\u0004\b'\u0010(\u001a\u000f\u0010)\u001a\u00020\u0003H\u0003¢\u0006\u0004\b)\u0010*\u001a3\u0010+\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b+\u0010,\u001a3\u00100\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u000f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b0\u0010,\u001a\u0019\u00101\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b1\u00102\u001aM\u00106\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u000f2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b6\u00107\u001ae\u0010A\u001a\u00020\u00032\u0006\u00108\u001a\u00020%2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010:\u001a\u0004\u0018\u0001092\u0006\u0010;\u001a\u00020 2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010<\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010 2\u000e\b\u0002\u0010@\u001a\b\u0012\u0004\u0012\u00020?0>H\u0003¢\u0006\u0004\bA\u0010B\u001a+\u0010C\u001a\u00020\u00032\u0006\u00108\u001a\u00020%2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\bC\u0010D\u001a+\u0010E\u001a\u00020\u00032\u0006\u00108\u001a\u00020%2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\bE\u0010D\u001a\u0013\u0010G\u001a\u00020F*\u00020\rH\u0002¢\u0006\u0004\bG\u0010H\u001a)\u0010M\u001a\u00020\u0006*\u00020\u00062\n\u0010K\u001a\u00060Ij\u0002`J2\b\u0010L\u001a\u0004\u0018\u00010FH\u0002¢\u0006\u0004\bM\u0010N\u001a/\u0010S\u001a\u00020\u0003*\u00020O2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010Q\u001a\u00020P2\n\u0010R\u001a\u00060Ij\u0002`JH\u0002¢\u0006\u0004\bS\u0010T\"\u001a\u0010U\u001a\u00020 8\u0002X\u0082T¢\u0006\f\n\u0004\bU\u0010V\u0012\u0004\bW\u0010X\"\u001a\u0010Y\u001a\u00020 8\u0002X\u0082T¢\u0006\f\n\u0004\bY\u0010V\u0012\u0004\bZ\u0010X\"\u001a\u0010[\u001a\u00020 8\u0002X\u0082T¢\u0006\f\n\u0004\b[\u0010V\u0012\u0004\b\\\u0010X¨\u0006k²\u0006\f\u0010^\u001a\u00020]8\nX\u008a\u0084\u0002²\u0006\u0014\u0010a\u001a\n\u0012\u0004\u0012\u00020`\u0018\u00010_8\nX\u008a\u0084\u0002²\u0006\u000e\u0010b\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010c\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\u000e\u0010d\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010e\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010f\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010g\u001a\u0004\u0018\u00010 8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010h\u001a\u0004\u0018\u00010 8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010j\u001a\u00020i8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/ConciergeOnboardingDuxo;", "duxo", "Lkotlin/Function0;", "", "onToolbarBackPressed", "onCloseAll", "Landroidx/compose/ui/Modifier;", "modifier", "ConciergeOnboardingComposable", "(Lcom/robinhood/android/support/supporthub/ConciergeOnboardingDuxo;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ConciergeLoadingComposable", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "ConciergeErrorComposable", "Lcom/robinhood/android/support/supporthub/SubScreen;", "subScreen", "", "useNavBackButton", "showEndButton", "", "progressPercentage", "onClickContinue", "Lkotlinx/collections/immutable/ImmutableList;", "orderedScreens", "ConciergeContentComposable", "(Lcom/robinhood/android/support/supporthub/SubScreen;ZZLjava/lang/Float;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlinx/collections/immutable/ImmutableList;Landroidx/compose/runtime/Composer;I)V", "ConciergeNonVideoScreensComposable", "(Lcom/robinhood/android/support/supporthub/SubScreen;ZZLjava/lang/Float;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "appBarUseCloseButton", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "appBarActions", "", "bottomSummary", "bottomPrimaryCtaLabel", "bottomPrimaryCta", "isFinalScreen", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "ConciergeScaffold", "(Lcom/robinhood/android/support/supporthub/SubScreen;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ConciergeWelcome", "(Landroidx/compose/runtime/Composer;I)V", "ConciergeWelcomeVideo", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "isVideoEnd", "onClickSkip", "onClickReplay", "ConciergeAppBarVideoCta", "ConciergeWelcomeEndVideoText", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "isVideoPlaying", "isLoading", "onClickPlay", "ConciergeWelcomeVideoControls", "(ZZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "paddingValues", "Landroidx/compose/ui/graphics/painter/Painter;", "heroImage", "title", "subtitle", Footer.f10637type, "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/support/supporthub/ConciergeRow;", "rows", "ConciergeHeroImageWithRows", "(Landroidx/compose/foundation/layout/PaddingValues;Ljava/lang/Float;Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/PersistentList;Landroidx/compose/runtime/Composer;II)V", "ConciergeFeatureDedicatedAgent", "(Landroidx/compose/foundation/layout/PaddingValues;Ljava/lang/Float;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ConciergeFeatureSupport247", "Lcom/robinhood/rosetta/eventlogging/ConciergeSupportContext$OnboardingScreen;", "mapToLogOnboardingScreen", "(Lcom/robinhood/android/support/supporthub/SubScreen;)Lcom/robinhood/rosetta/eventlogging/ConciergeSupportContext$OnboardingScreen;", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "action", "onboardingScreen", "autoLogCtaEvents", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/rosetta/eventlogging/ConciergeSupportContext$OnboardingScreen;)Landroidx/compose/ui/Modifier;", "Lcom/robinhood/analytics/EventLogger;", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "eventBaseDescriptor", "eventAction", "logTapEvent", "(Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/support/supporthub/SubScreen;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;)V", "WELCOME_HERO_FILE", "Ljava/lang/String;", "getWELCOME_HERO_FILE$annotations", "()V", "WELCOME_VIDEO_FILE", "getWELCOME_VIDEO_FILE$annotations", "WELCOME_VIDEO_SUBTITLE_FILE", "getWELCOME_VIDEO_SUBTITLE_FILE$annotations", "Lcom/robinhood/android/support/supporthub/ConciergeOnboardingViewState;", "state", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/support/supporthub/ConciergeOnboardingEvent;", "event", "isVideoReady", "videoAlpha", "videoLoading", "videoPlaying", "videoEnd", "videoError", "currentSubtitle", "", "playerPosition", "feature-support_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ConciergeOnboardingComposableKt {
    private static final String WELCOME_HERO_FILE = "https://cdn.robinhood.com/app_assets/concierge_support/welcome_hero_image/mobile.mp4";
    private static final String WELCOME_VIDEO_FILE = "https://cdn.robinhood.com/app_assets/concierge_support/welcome_to_concierge_mobile.mp4";
    private static final String WELCOME_VIDEO_SUBTITLE_FILE = "https://cdn.robinhood.com/app_assets/concierge_support/welcome_to_concierge_mobile.srt";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConciergeAppBarVideoCta$lambda$59(boolean z, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        ConciergeAppBarVideoCta(z, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ConciergeContentComposable$lambda$16$lambda$15$lambda$11(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ConciergeContentComposable$lambda$16$lambda$15$lambda$12(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ConciergeContentComposable$lambda$16$lambda$15$lambda$13(int i) {
        return -i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ConciergeContentComposable$lambda$16$lambda$15$lambda$14(int i) {
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConciergeContentComposable$lambda$17(ConciergeOnboardingViewState2 conciergeOnboardingViewState2, boolean z, boolean z2, Float f, Function0 function0, Function0 function02, ImmutableList immutableList, int i, Composer composer, int i2) {
        ConciergeContentComposable(conciergeOnboardingViewState2, z, z2, f, function0, function02, immutableList, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConciergeErrorComposable$lambda$8(Function0 function0, int i, Composer composer, int i2) {
        ConciergeErrorComposable(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConciergeFeatureDedicatedAgent$lambda$83(PaddingValues paddingValues, Float f, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ConciergeFeatureDedicatedAgent(paddingValues, f, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConciergeFeatureSupport247$lambda$84(PaddingValues paddingValues, Float f, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ConciergeFeatureSupport247(paddingValues, f, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConciergeHeroImageWithRows$lambda$82(PaddingValues paddingValues, Float f, Painter painter, String str, Modifier modifier, String str2, String str3, ImmutableList3 immutableList3, int i, int i2, Composer composer, int i3) {
        ConciergeHeroImageWithRows(paddingValues, f, painter, str, modifier, str2, str3, immutableList3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConciergeLoadingComposable$lambda$7(Function0 function0, int i, Composer composer, int i2) {
        ConciergeLoadingComposable(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConciergeNonVideoScreensComposable$lambda$18(ConciergeOnboardingViewState2 conciergeOnboardingViewState2, boolean z, boolean z2, Float f, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        ConciergeNonVideoScreensComposable(conciergeOnboardingViewState2, z, z2, f, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConciergeOnboardingComposable$lambda$6(ConciergeOnboardingDuxo conciergeOnboardingDuxo, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ConciergeOnboardingComposable(conciergeOnboardingDuxo, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConciergeScaffold$lambda$20(ConciergeOnboardingViewState2 conciergeOnboardingViewState2, Function0 function0, boolean z, Modifier modifier, Function3 function3, String str, String str2, Function0 function02, boolean z2, Function3 function32, int i, int i2, Composer composer, int i3) {
        ConciergeScaffold(conciergeOnboardingViewState2, function0, z, modifier, function3, str, str2, function02, z2, function32, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConciergeWelcome$lambda$33(int i, Composer composer, int i2) {
        ConciergeWelcome(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConciergeWelcomeEndVideoText$lambda$63(Modifier modifier, int i, int i2, Composer composer, int i3) {
        ConciergeWelcomeEndVideoText(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConciergeWelcomeVideo$lambda$57(boolean z, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        ConciergeWelcomeVideo(z, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConciergeWelcomeVideoControls$lambda$75(boolean z, boolean z2, boolean z3, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ConciergeWelcomeVideoControls(z, z2, z3, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static /* synthetic */ void getWELCOME_HERO_FILE$annotations() {
    }

    private static /* synthetic */ void getWELCOME_VIDEO_FILE$annotations() {
    }

    private static /* synthetic */ void getWELCOME_VIDEO_SUBTITLE_FILE$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ConciergeWelcomeVideo$lambda$52(SnapshotLongState2 snapshotLongState2) {
        return snapshotLongState2.getLongValue();
    }

    private static final ConciergeOnboardingViewState ConciergeOnboardingComposable$lambda$0(SnapshotState4<ConciergeOnboardingViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<ConciergeOnboardingEvent> ConciergeOnboardingComposable$lambda$1(SnapshotState4<Event<ConciergeOnboardingEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ConciergeWelcome$lambda$32$lambda$22(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float ConciergeWelcome$lambda$32$lambda$24(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ConciergeWelcomeVideo$lambda$35(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ConciergeWelcomeVideo$lambda$38(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ConciergeWelcomeVideo$lambda$41(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ConciergeWelcomeVideo$lambda$47(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ConciergeWelcomeVideo$lambda$53(SnapshotLongState2 snapshotLongState2, long j) {
        snapshotLongState2.setLongValue(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConciergeOnboardingComposable(final ConciergeOnboardingDuxo duxo, Function0<Unit> function0, final Function0<Unit> onCloseAll, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Event<ConciergeOnboardingEvent> event;
        Modifier modifier3;
        final ConciergeOnboardingViewState.InitialLoadingState initialLoadingState;
        final Context context;
        final Navigator navigator;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier modifier4;
        final Event<ConciergeOnboardingEvent> eventConciergeOnboardingComposable$lambda$1;
        final Modifier modifier5;
        EventConsumer<ConciergeOnboardingEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Function0<Unit> onToolbarBackPressed = function0;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(onToolbarBackPressed, "onToolbarBackPressed");
        Intrinsics.checkNotNullParameter(onCloseAll, "onCloseAll");
        Composer composerStartRestartGroup = composer.startRestartGroup(921484426);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onToolbarBackPressed) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCloseAll) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier6 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(921484426, i4, -1, "com.robinhood.android.support.supporthub.ConciergeOnboardingComposable (ConciergeOnboardingComposable.kt:152)");
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                final StateFlow<Event<ConciergeOnboardingEvent>> eventFlow = duxo.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeOnboardingComposable$$inlined$collectEventAsStateWithLifecycle$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                        Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeOnboardingComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeOnboardingComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "ConciergeOnboardingComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeOnboardingComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                Event event = (Event) obj;
                                if ((event != null ? event.getData() : null) instanceof ConciergeOnboardingEvent) {
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
                Event<ConciergeOnboardingEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof ConciergeOnboardingEvent)) {
                    value = null;
                }
                modifier3 = modifier6;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                initialLoadingState = ConciergeOnboardingComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getInitialLoadingState();
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                OverrideSystemBarsStyle.OverrideSystemBarsStyle(false, composerStartRestartGroup, 6);
                Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierNavigationBarsPadding);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (!Intrinsics.areEqual(initialLoadingState, ConciergeOnboardingViewState.InitialLoadingState.Uninitialized.INSTANCE) || Intrinsics.areEqual(initialLoadingState, ConciergeOnboardingViewState.InitialLoadingState.Loading.INSTANCE)) {
                    onToolbarBackPressed = function0;
                    modifier4 = modifier3;
                    composerStartRestartGroup.startReplaceGroup(285783696);
                    ConciergeLoadingComposable(onToolbarBackPressed, composerStartRestartGroup, (i4 >> 3) & 14);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (initialLoadingState instanceof ConciergeOnboardingViewState.InitialLoadingState.Loaded) {
                    composerStartRestartGroup.startReplaceGroup(286000572);
                    ConciergeOnboardingViewState.InitialLoadingState.Loaded loaded = (ConciergeOnboardingViewState.InitialLoadingState.Loaded) initialLoadingState;
                    ConciergeOnboardingViewState2 subScreen = loaded.getSubScreen();
                    boolean useCloseNavButton = loaded.getUseCloseNavButton();
                    boolean useEndButton = loaded.getUseEndButton();
                    Float fValueOf = Float.valueOf(loaded.getProgressPercentage());
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(duxo) | composerStartRestartGroup.changedInstance(initialLoadingState);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda17
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConciergeOnboardingComposableKt.ConciergeOnboardingComposable$lambda$4$lambda$3$lambda$2(duxo, initialLoadingState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    modifier4 = modifier3;
                    ConciergeContentComposable(subScreen, useCloseNavButton, useEndButton, fValueOf, function0, (Function0) objRememberedValue, loaded.getOrderedScreens(), composerStartRestartGroup, (i4 << 9) & 57344);
                    onToolbarBackPressed = function0;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    onToolbarBackPressed = function0;
                    modifier4 = modifier3;
                    if (!(initialLoadingState instanceof ConciergeOnboardingViewState.InitialLoadingState.Error)) {
                        composerStartRestartGroup.startReplaceGroup(1256141866);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(286710534);
                    ConciergeErrorComposable(onCloseAll, composerStartRestartGroup, (i4 >> 6) & 14);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                eventConciergeOnboardingComposable$lambda$1 = ConciergeOnboardingComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventConciergeOnboardingComposable$lambda$1 != null && (eventConciergeOnboardingComposable$lambda$1.getData() instanceof ConciergeOnboardingEvent.ShowSupportHub) && (eventConsumerInvoke = eventConciergeOnboardingComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventConciergeOnboardingComposable$lambda$1, new Function1() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeOnboardingComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m19109invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m19109invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onCloseAll.invoke();
                            context.startActivity(Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, SupportHubFragmentKey.INSTANCE, true, true, true, null, false, true, false, false, false, null, true, 3936, null));
                        }
                    });
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda18
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ConciergeOnboardingComposableKt.ConciergeOnboardingComposable$lambda$6(duxo, onToolbarBackPressed, onCloseAll, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup = composerStartRestartGroup;
            final Flow eventFlow2 = duxo.getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state2 = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeOnboardingComposable$$inlined$collectEventAsStateWithLifecycle$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                    Object objCollect = eventFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeOnboardingComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeOnboardingComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "ConciergeOnboardingComposable.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeOnboardingComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                            Event event = (Event) obj;
                            if ((event != null ? event.getData() : null) instanceof ConciergeOnboardingEvent) {
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
            Event<ConciergeOnboardingEvent> value2 = eventFlow2.getValue();
            event = value2;
            if (!((event == null ? event.getData() : null) instanceof ConciergeOnboardingEvent)) {
            }
            modifier3 = modifier6;
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceGroup();
            initialLoadingState = ConciergeOnboardingComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getInitialLoadingState();
            context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            OverrideSystemBarsStyle.OverrideSystemBarsStyle(false, composerStartRestartGroup, 6);
            Modifier modifierNavigationBarsPadding2 = WindowInsetsPadding_androidKt.navigationBarsPadding(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierNavigationBarsPadding2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                if (!Intrinsics.areEqual(initialLoadingState, ConciergeOnboardingViewState.InitialLoadingState.Uninitialized.INSTANCE)) {
                    onToolbarBackPressed = function0;
                    modifier4 = modifier3;
                    composerStartRestartGroup.startReplaceGroup(285783696);
                    ConciergeLoadingComposable(onToolbarBackPressed, composerStartRestartGroup, (i4 >> 3) & 14);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    eventConciergeOnboardingComposable$lambda$1 = ConciergeOnboardingComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventConciergeOnboardingComposable$lambda$1 != null) {
                        eventConsumerInvoke.consume(eventConciergeOnboardingComposable$lambda$1, new Function1() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeOnboardingComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m19109invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m19109invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                onCloseAll.invoke();
                                context.startActivity(Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, SupportHubFragmentKey.INSTANCE, true, true, true, null, false, true, false, false, false, null, true, 3936, null));
                            }
                        });
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier5 = modifier4;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConciergeOnboardingComposable$lambda$4$lambda$3$lambda$2(ConciergeOnboardingDuxo conciergeOnboardingDuxo, ConciergeOnboardingViewState.InitialLoadingState initialLoadingState) {
        conciergeOnboardingDuxo.handleContinue(((ConciergeOnboardingViewState.InitialLoadingState.Loaded) initialLoadingState).getSubScreen());
        return Unit.INSTANCE;
    }

    public static final void ConciergeLoadingComposable(final Function0<Unit> onToolbarBackPressed, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onToolbarBackPressed, "onToolbarBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(447301390);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onToolbarBackPressed) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(447301390, i2, -1, "com.robinhood.android.support.supporthub.ConciergeLoadingComposable (ConciergeOnboardingComposable.kt:223)");
            }
            ConciergeScaffold(null, onToolbarBackPressed, true, null, null, null, null, null, false, ComposableSingletons$ConciergeOnboardingComposableKt.INSTANCE.m19094getLambda$1245686020$feature_support_externalRelease(), composerStartRestartGroup, ((i2 << 3) & 112) | 805306758, 504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConciergeOnboardingComposableKt.ConciergeLoadingComposable$lambda$7(onToolbarBackPressed, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ConciergeErrorComposable(final Function0<Unit> onCloseAll, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onCloseAll, "onCloseAll");
        Composer composerStartRestartGroup = composer.startRestartGroup(282351770);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onCloseAll) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(282351770, i2, -1, "com.robinhood.android.support.supporthub.ConciergeErrorComposable (ConciergeOnboardingComposable.kt:238)");
            }
            ConciergeScaffold(null, onCloseAll, true, null, null, null, null, null, false, ComposableLambda3.rememberComposableLambda(1219136520, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt.ConciergeErrorComposable.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                    invoke(paddingValues, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer2, int i3) {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i3 & 6) == 0) {
                        i3 |= composer2.changed(paddingValues) ? 4 : 2;
                    }
                    if ((i3 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1219136520, i3, -1, "com.robinhood.android.support.supporthub.ConciergeErrorComposable.<anonymous> (ConciergeOnboardingComposable.kt:244)");
                    }
                    ConciergeOnboardingErrorComposable3.ConciergeOnboardingErrorComposable(paddingValues, onCloseAll, composer2, i3 & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i2 << 3) & 112) | 805306758, 504);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConciergeOnboardingComposableKt.ConciergeErrorComposable$lambda$8(onCloseAll, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x00f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ConciergeContentComposable(final ConciergeOnboardingViewState2 conciergeOnboardingViewState2, final boolean z, final boolean z2, final Float f, final Function0<Unit> function0, final Function0<Unit> function02, final ImmutableList<? extends ConciergeOnboardingViewState2> immutableList, Composer composer, final int i) {
        boolean z3;
        Float f2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1310648851);
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? composerStartRestartGroup.changed(conciergeOnboardingViewState2) : composerStartRestartGroup.changedInstance(conciergeOnboardingViewState2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            z3 = z;
            i2 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            f2 = f;
            i2 |= composerStartRestartGroup.changed(f2) ? 2048 : 1024;
        } else {
            f2 = f;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= (i & 2097152) == 0 ? composerStartRestartGroup.changed(immutableList) : composerStartRestartGroup.changedInstance(immutableList) ? 1048576 : 524288;
        }
        if ((599187 & i2) != 599186 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1310648851, i2, -1, "com.robinhood.android.support.supporthub.ConciergeContentComposable (ConciergeOnboardingComposable.kt:262)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z4 = (3670016 & i2) == 1048576 || ((i2 & 2097152) != 0 && composerStartRestartGroup.changed(immutableList));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z4) {
                Object obj = objRememberedValue;
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    Iterable<IndexedValue> iterableWithIndex = CollectionsKt.withIndex(immutableList);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(iterableWithIndex, 10)), 16));
                    for (IndexedValue indexedValue : iterableWithIndex) {
                        Tuples2 tuples2M3642to = Tuples4.m3642to(indexedValue.getValue(), Integer.valueOf(indexedValue.getIndex()));
                        linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
                    }
                    composerStartRestartGroup.updateRememberedValue(linkedHashMap);
                    obj = linkedHashMap;
                }
                final Map map = (Map) obj;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, "LoadedScreen");
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(map);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return ConciergeOnboardingComposableKt.ConciergeContentComposable$lambda$16$lambda$15(map, (AnimatedContentTransitionScope) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                final boolean z5 = z3;
                final Float f3 = f2;
                AnimatedContentKt.AnimatedContent(conciergeOnboardingViewState2, modifierTestTag, (Function1) objRememberedValue2, null, null, null, ComposableLambda3.rememberComposableLambda(-1500355956, true, new Function4<AnimatedContentScope, ConciergeOnboardingViewState2, Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt.ConciergeContentComposable.2
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, ConciergeOnboardingViewState2 conciergeOnboardingViewState22, Composer composer2, Integer num) {
                        invoke(animatedContentScope, conciergeOnboardingViewState22, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedContentScope AnimatedContent, ConciergeOnboardingViewState2 screen, Composer composer2, int i3) {
                        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                        Intrinsics.checkNotNullParameter(screen, "screen");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1500355956, i3, -1, "com.robinhood.android.support.supporthub.ConciergeContentComposable.<anonymous> (ConciergeOnboardingComposable.kt:296)");
                        }
                        if (screen instanceof ConciergeOnboardingViewState2.WelcomeVideo) {
                            composer2.startReplaceGroup(1266940402);
                            ConciergeOnboardingComposableKt.ConciergeWelcomeVideo(z2, function0, function02, composer2, 0);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1266947598);
                            ConciergeOnboardingComposableKt.ConciergeNonVideoScreensComposable(screen, z5, z2, f3, function0, function02, composer2, (i3 >> 3) & 14);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 1572864, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ConciergeOnboardingComposableKt.ConciergeContentComposable$lambda$17(conciergeOnboardingViewState2, z, z2, f, function0, function02, immutableList, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform ConciergeContentComposable$lambda$16$lambda$15(Map map, AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        if (((Number) MapsKt.getValue(map, AnimatedContent.getTargetState())).intValue() > ((Number) MapsKt.getValue(map, AnimatedContent.getInitialState())).intValue()) {
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(300, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda23
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(ConciergeOnboardingComposableKt.ConciergeContentComposable$lambda$16$lambda$15$lambda$11(((Integer) obj).intValue()));
                }
            }), EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween$default(300, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda24
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(ConciergeOnboardingComposableKt.ConciergeContentComposable$lambda$16$lambda$15$lambda$12(((Integer) obj).intValue()));
                }
            }));
        }
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.slideInHorizontally(AnimationSpecKt.tween$default(300, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(ConciergeOnboardingComposableKt.ConciergeContentComposable$lambda$16$lambda$15$lambda$13(((Integer) obj).intValue()));
            }
        }), EnterExitTransitionKt.slideOutHorizontally(AnimationSpecKt.tween$default(300, 0, null, 6, null), new Function1() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(ConciergeOnboardingComposableKt.ConciergeContentComposable$lambda$16$lambda$15$lambda$14(((Integer) obj).intValue()));
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ConciergeNonVideoScreensComposable(final ConciergeOnboardingViewState2 conciergeOnboardingViewState2, final boolean z, final boolean z2, final Float f, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        boolean z3;
        String strStringResource;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1391721761);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(conciergeOnboardingViewState2) : composerStartRestartGroup.changedInstance(conciergeOnboardingViewState2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z3 = z;
            i2 |= composerStartRestartGroup.changed(z3) ? 32 : 16;
        } else {
            z3 = z;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1391721761, i2, -1, "com.robinhood.android.support.supporthub.ConciergeNonVideoScreensComposable (ConciergeOnboardingComposable.kt:325)");
            }
            if (z2) {
                composerStartRestartGroup.startReplaceGroup(-1463177258);
                strStringResource = StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_cta_end, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1463094767);
                strStringResource = StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_cta_continue, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            ConciergeScaffold(conciergeOnboardingViewState2, function0, z3, null, null, null, strStringResource, function02, z2, ComposableLambda3.rememberComposableLambda(645331789, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt.ConciergeNonVideoScreensComposable.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                    invoke(paddingValues, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer2, int i3) {
                    int i4;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i3 & 6) == 0) {
                        i4 = (composer2.changed(paddingValues) ? 4 : 2) | i3;
                    } else {
                        i4 = i3;
                    }
                    if ((i4 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(645331789, i4, -1, "com.robinhood.android.support.supporthub.ConciergeNonVideoScreensComposable.<anonymous> (ConciergeOnboardingComposable.kt:338)");
                    }
                    ConciergeOnboardingViewState2 conciergeOnboardingViewState22 = conciergeOnboardingViewState2;
                    if (Intrinsics.areEqual(conciergeOnboardingViewState22, ConciergeOnboardingViewState2.Welcome.INSTANCE)) {
                        composer2.startReplaceGroup(1688561151);
                        ConciergeOnboardingComposableKt.ConciergeWelcome(composer2, 0);
                        composer2.endReplaceGroup();
                    } else if (Intrinsics.areEqual(conciergeOnboardingViewState22, ConciergeOnboardingViewState2.PerksDedicatedExpert.INSTANCE)) {
                        composer2.startReplaceGroup(1688563394);
                        ConciergeOnboardingComposableKt.ConciergeFeatureDedicatedAgent(paddingValues, f, null, composer2, i4 & 14, 4);
                        composer2.endReplaceGroup();
                    } else {
                        int i5 = i4;
                        if (!Intrinsics.areEqual(conciergeOnboardingViewState22, ConciergeOnboardingViewState2.PerksPrioritySupport.INSTANCE)) {
                            composer2.startReplaceGroup(1688574925);
                            composer2.endReplaceGroup();
                            throw new IllegalArgumentException();
                        }
                        composer2.startReplaceGroup(1688569694);
                        ConciergeOnboardingComposableKt.ConciergeFeatureSupport247(paddingValues, f, null, composer2, i5 & 14, 4);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 805306368 | ((i2 >> 9) & 112) | ((i2 << 3) & 896) | (29360128 & (i2 << 6)) | ((i2 << 18) & 234881024), 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConciergeOnboardingComposableKt.ConciergeNonVideoScreensComposable$lambda$18(conciergeOnboardingViewState2, z, z2, f, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ConciergeScaffold(final ConciergeOnboardingViewState2 conciergeOnboardingViewState2, final Function0<Unit> function0, final boolean z, Modifier modifier, Function3<? super Row5, ? super Composer, ? super Integer, Unit> function3, String str, String str2, Function0<Unit> function02, boolean z2, final Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function33;
        int i5;
        String str3;
        int i6;
        String str4;
        int i7;
        int i8;
        int i9;
        int i10;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Function0<Unit> function03;
        Composer composer2;
        final String str5;
        final boolean z3;
        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> function34;
        final String str6;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(840664414);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(conciergeOnboardingViewState2) : composerStartRestartGroup.changedInstance(conciergeOnboardingViewState2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    function33 = function3;
                    i3 |= composerStartRestartGroup.changedInstance(function33) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else {
                    if ((196608 & i) == 0) {
                        str3 = str;
                        i3 |= composerStartRestartGroup.changed(str3) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else {
                        if ((1572864 & i) == 0) {
                            str4 = str2;
                            i3 |= composerStartRestartGroup.changed(str4) ? 1048576 : 524288;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else {
                            if ((i & 12582912) == 0) {
                                i8 = i7;
                                i3 |= composerStartRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
                            }
                            i9 = i2 & 256;
                            if (i9 == 0) {
                                i3 |= 100663296;
                            } else {
                                if ((i & 100663296) == 0) {
                                    i10 = i9;
                                    i3 |= composerStartRestartGroup.changed(z2) ? 67108864 : 33554432;
                                }
                                if ((i2 & 512) == 0) {
                                    if ((i & 805306368) == 0) {
                                        i3 |= composerStartRestartGroup.changedInstance(function32) ? 536870912 : 268435456;
                                    }
                                    if ((i3 & 306783379) != 306783378 && composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        z3 = z2;
                                        modifier3 = modifier2;
                                        function34 = function33;
                                        str5 = str3;
                                        composer2 = composerStartRestartGroup;
                                        str6 = str4;
                                        function03 = function02;
                                    } else {
                                        Modifier modifier4 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                                        final Function3<? super Row5, ? super Composer, ? super Integer, Unit> lambda$2001814583$feature_support_externalRelease = i4 == 0 ? ComposableSingletons$ConciergeOnboardingComposableKt.INSTANCE.getLambda$2001814583$feature_support_externalRelease() : function33;
                                        if (i5 != 0) {
                                            str3 = null;
                                        }
                                        String str7 = i6 == 0 ? null : str4;
                                        Function0<Unit> function04 = i8 == 0 ? null : function02;
                                        boolean z4 = i10 == 0 ? false : z2;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(840664414, i3, -1, "com.robinhood.android.support.supporthub.ConciergeScaffold (ConciergeOnboardingComposable.kt:369)");
                                        }
                                        Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                                        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getJet(), null, 2, null);
                                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        Modifier modifier5 = modifier4;
                                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
                                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion.getConstructor();
                                        if (composerStartRestartGroup.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (!composerStartRestartGroup.getInserting()) {
                                            composerStartRestartGroup.createNode(constructor);
                                        } else {
                                            composerStartRestartGroup.useNode();
                                        }
                                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                        String str8 = str7;
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function35 = lambda$2001814583$feature_support_externalRelease;
                                        String str9 = str3;
                                        boolean z5 = z4;
                                        function03 = function04;
                                        composer2 = composerStartRestartGroup;
                                        ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(-106639404, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeScaffold$1$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i12) {
                                                if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-106639404, i12, -1, "com.robinhood.android.support.supporthub.ConciergeScaffold.<anonymous>.<anonymous> (ConciergeOnboardingComposable.kt:380)");
                                                }
                                                Function2<Composer, Integer, Unit> function2M19095getLambda$2106116456$feature_support_externalRelease = ComposableSingletons$ConciergeOnboardingComposableKt.INSTANCE.m19095getLambda$2106116456$feature_support_externalRelease();
                                                final boolean z6 = z;
                                                final ConciergeOnboardingViewState2 conciergeOnboardingViewState22 = conciergeOnboardingViewState2;
                                                final Function0<Unit> function05 = function0;
                                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(2097540634, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeScaffold$1$1.1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                        invoke(composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer4, int i13) {
                                                        if ((i13 & 3) == 2 && composer4.getSkipping()) {
                                                            composer4.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(2097540634, i13, -1, "com.robinhood.android.support.supporthub.ConciergeScaffold.<anonymous>.<anonymous>.<anonymous> (ConciergeOnboardingComposable.kt:383)");
                                                        }
                                                        if (z6) {
                                                            composer4.startReplaceGroup(353907928);
                                                            BentoAppBarScope bentoAppBarScope = BentoAppBarScope.INSTANCE;
                                                            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, "ToolbarCloseButton");
                                                            UserInteractionEventData.Action action = UserInteractionEventData.Action.CANCEL;
                                                            ConciergeOnboardingViewState2 conciergeOnboardingViewState23 = conciergeOnboardingViewState22;
                                                            bentoAppBarScope.m20576BentoCloseButtoncf5BqRc(ConciergeOnboardingComposableKt.autoLogCtaEvents(modifierTestTag, action, conciergeOnboardingViewState23 != null ? ConciergeOnboardingComposableKt.mapToLogOnboardingScreen(conciergeOnboardingViewState23) : null), false, 0L, function05, composer4, BentoAppBarScope.$stable << 12, 6);
                                                            composer4.endReplaceGroup();
                                                        } else {
                                                            composer4.startReplaceGroup(354500989);
                                                            BentoAppBarScope bentoAppBarScope2 = BentoAppBarScope.INSTANCE;
                                                            Modifier modifierTestTag2 = TestTag3.testTag(Modifier.INSTANCE, "ToolbarBackButton");
                                                            UserInteractionEventData.Action action2 = UserInteractionEventData.Action.BACK;
                                                            ConciergeOnboardingViewState2 conciergeOnboardingViewState24 = conciergeOnboardingViewState22;
                                                            bentoAppBarScope2.m20575BentoBackButtondrOMvmE(ConciergeOnboardingComposableKt.autoLogCtaEvents(modifierTestTag2, action2, conciergeOnboardingViewState24 != null ? ConciergeOnboardingComposableKt.mapToLogOnboardingScreen(conciergeOnboardingViewState24) : null), false, null, function05, composer4, BentoAppBarScope.$stable << 12, 6);
                                                            composer4.endReplaceGroup();
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer3, 54);
                                                Function3<Row5, Composer, Integer, Unit> function36 = lambda$2001814583$feature_support_externalRelease;
                                                TopAppBarColors topAppBarColors = TopAppBarDefaults.INSTANCE.topAppBarColors(composer3, TopAppBarDefaults.$stable);
                                                Color.Companion companion2 = Color.INSTANCE;
                                                AppBarKt.m5704TopAppBarGHTll3U(function2M19095getLambda$2106116456$feature_support_externalRelease, null, composableLambdaRememberComposableLambda, function36, 0.0f, null, TopAppBarColors.m6077copyt635Npw$default(topAppBarColors, companion2.m6725getTransparent0d7_KjU(), 0L, companion2.m6725getTransparent0d7_KjU(), 0L, 0L, 26, null), null, composer3, 390, EnumC7081g.f2773x8d9721ad);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composerStartRestartGroup, 54), null, null, null, 0, Color.INSTANCE.m6725getTransparent0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(1926264489, true, new ConciergeOnboardingComposableKt$ConciergeScaffold$1$2(function32, str9, context, str8, conciergeOnboardingViewState2, current, z5, function03), composerStartRestartGroup, 54), composer2, 806879280, 445);
                                        composer2.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        str5 = str9;
                                        z3 = z5;
                                        function34 = function35;
                                        str6 = str8;
                                        modifier3 = modifier5;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return ConciergeOnboardingComposableKt.ConciergeScaffold$lambda$20(conciergeOnboardingViewState2, function0, z, modifier3, function34, str5, str6, function03, z3, function32, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i3 |= 805306368;
                                if ((i3 & 306783379) != 306783378) {
                                    if (i11 == 0) {
                                    }
                                    if (i4 == 0) {
                                    }
                                    if (i5 != 0) {
                                    }
                                    if (i6 == 0) {
                                    }
                                    if (i8 == 0) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                    EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                                    Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getJet(), null, 2, null);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    Modifier modifier52 = modifier4;
                                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (!composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    String str82 = str7;
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl.getInserting()) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                        Function3<? super Row5, ? super Composer, ? super Integer, Unit> function352 = lambda$2001814583$feature_support_externalRelease;
                                        String str92 = str3;
                                        boolean z52 = z4;
                                        function03 = function04;
                                        composer2 = composerStartRestartGroup;
                                        ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(-106639404, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeScaffold$1$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i12) {
                                                if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-106639404, i12, -1, "com.robinhood.android.support.supporthub.ConciergeScaffold.<anonymous>.<anonymous> (ConciergeOnboardingComposable.kt:380)");
                                                }
                                                Function2<Composer, Integer, Unit> function2M19095getLambda$2106116456$feature_support_externalRelease = ComposableSingletons$ConciergeOnboardingComposableKt.INSTANCE.m19095getLambda$2106116456$feature_support_externalRelease();
                                                final boolean z6 = z;
                                                final ConciergeOnboardingViewState2 conciergeOnboardingViewState22 = conciergeOnboardingViewState2;
                                                final Function0<Unit> function05 = function0;
                                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(2097540634, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeScaffold$1$1.1
                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                        invoke(composer4, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(Composer composer4, int i13) {
                                                        if ((i13 & 3) == 2 && composer4.getSkipping()) {
                                                            composer4.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(2097540634, i13, -1, "com.robinhood.android.support.supporthub.ConciergeScaffold.<anonymous>.<anonymous>.<anonymous> (ConciergeOnboardingComposable.kt:383)");
                                                        }
                                                        if (z6) {
                                                            composer4.startReplaceGroup(353907928);
                                                            BentoAppBarScope bentoAppBarScope = BentoAppBarScope.INSTANCE;
                                                            Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, "ToolbarCloseButton");
                                                            UserInteractionEventData.Action action = UserInteractionEventData.Action.CANCEL;
                                                            ConciergeOnboardingViewState2 conciergeOnboardingViewState23 = conciergeOnboardingViewState22;
                                                            bentoAppBarScope.m20576BentoCloseButtoncf5BqRc(ConciergeOnboardingComposableKt.autoLogCtaEvents(modifierTestTag, action, conciergeOnboardingViewState23 != null ? ConciergeOnboardingComposableKt.mapToLogOnboardingScreen(conciergeOnboardingViewState23) : null), false, 0L, function05, composer4, BentoAppBarScope.$stable << 12, 6);
                                                            composer4.endReplaceGroup();
                                                        } else {
                                                            composer4.startReplaceGroup(354500989);
                                                            BentoAppBarScope bentoAppBarScope2 = BentoAppBarScope.INSTANCE;
                                                            Modifier modifierTestTag2 = TestTag3.testTag(Modifier.INSTANCE, "ToolbarBackButton");
                                                            UserInteractionEventData.Action action2 = UserInteractionEventData.Action.BACK;
                                                            ConciergeOnboardingViewState2 conciergeOnboardingViewState24 = conciergeOnboardingViewState22;
                                                            bentoAppBarScope2.m20575BentoBackButtondrOMvmE(ConciergeOnboardingComposableKt.autoLogCtaEvents(modifierTestTag2, action2, conciergeOnboardingViewState24 != null ? ConciergeOnboardingComposableKt.mapToLogOnboardingScreen(conciergeOnboardingViewState24) : null), false, null, function05, composer4, BentoAppBarScope.$stable << 12, 6);
                                                            composer4.endReplaceGroup();
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composer3, 54);
                                                Function3<Row5, Composer, Integer, Unit> function36 = lambda$2001814583$feature_support_externalRelease;
                                                TopAppBarColors topAppBarColors = TopAppBarDefaults.INSTANCE.topAppBarColors(composer3, TopAppBarDefaults.$stable);
                                                Color.Companion companion22 = Color.INSTANCE;
                                                AppBarKt.m5704TopAppBarGHTll3U(function2M19095getLambda$2106116456$feature_support_externalRelease, null, composableLambdaRememberComposableLambda, function36, 0.0f, null, TopAppBarColors.m6077copyt635Npw$default(topAppBarColors, companion22.m6725getTransparent0d7_KjU(), 0L, companion22.m6725getTransparent0d7_KjU(), 0L, 0L, 26, null), null, composer3, 390, EnumC7081g.f2773x8d9721ad);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composerStartRestartGroup, 54), null, null, null, 0, Color.INSTANCE.m6725getTransparent0d7_KjU(), 0L, null, ComposableLambda3.rememberComposableLambda(1926264489, true, new ConciergeOnboardingComposableKt$ConciergeScaffold$1$2(function32, str92, context2, str82, conciergeOnboardingViewState2, current2, z52, function03), composerStartRestartGroup, 54), composer2, 806879280, 445);
                                        composer2.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        str5 = str92;
                                        z3 = z52;
                                        function34 = function352;
                                        str6 = str82;
                                        modifier3 = modifier52;
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i10 = i9;
                            if ((i2 & 512) == 0) {
                            }
                            if ((i3 & 306783379) != 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i8 = i7;
                        i9 = i2 & 256;
                        if (i9 == 0) {
                        }
                        i10 = i9;
                        if ((i2 & 512) == 0) {
                        }
                        if ((i3 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    str4 = str2;
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    i8 = i7;
                    i9 = i2 & 256;
                    if (i9 == 0) {
                    }
                    i10 = i9;
                    if ((i2 & 512) == 0) {
                    }
                    if ((i3 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                str3 = str;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                str4 = str2;
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                i8 = i7;
                i9 = i2 & 256;
                if (i9 == 0) {
                }
                i10 = i9;
                if ((i2 & 512) == 0) {
                }
                if ((i3 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function33 = function3;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            str3 = str;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            str4 = str2;
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i2 & 256;
            if (i9 == 0) {
            }
            i10 = i9;
            if ((i2 & 512) == 0) {
            }
            if ((i3 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function33 = function3;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        str3 = str;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        str4 = str2;
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i2 & 256;
        if (i9 == 0) {
        }
        i10 = i9;
        if ((i2 & 512) == 0) {
        }
        if ((i3 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void ConciergeWelcome(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(594618053);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(594618053, i, -1, "com.robinhood.android.support.supporthub.ConciergeWelcome (ConciergeOnboardingComposable.kt:485)");
            }
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Context.ProductTag productTag = null;
            int i5 = 0;
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
            CryptoOrderContext cryptoOrderContext = null;
            NcwTransferContext ncwTransferContext = null;
            NotificationContext notificationContext = null;
            NcwMultichainTokenContext ncwMultichainTokenContext = null;
            RetirementContext retirementContext = null;
            PostTransferActionContext postTransferActionContext = null;
            BuyingPowerRowContext buyingPowerRowContext = null;
            StepUpVerificationContext stepUpVerificationContext = null;
            GoldUpgradeContext goldUpgradeContext = null;
            OptionOrderDetailContext optionOrderDetailContext = null;
            OptionOrderDetailLegContext optionOrderDetailLegContext = null;
            PendingOptionOrderContext pendingOptionOrderContext = null;
            CryptoQuickTradeButtonContext cryptoQuickTradeButtonContext = null;
            EquityScreenerContext equityScreenerContext = null;
            AcatsInContext acatsInContext = null;
            CatpayOrderContext catpayOrderContext = null;
            SearchEquityScreenerContext searchEquityScreenerContext = null;
            P2PContext p2PContext = null;
            RetirementFundingMethodsContext retirementFundingMethodsContext = null;
            ReturnsComparisonContext returnsComparisonContext = null;
            AccountType accountType = null;
            MarginHealthState marginHealthState = null;
            BuyingPowerHubContext buyingPowerHubContext = null;
            UpsellBannerContext upsellBannerContext = null;
            ReferralEntryPointContext referralEntryPointContext = null;
            OnboardingWelcomeTakeoverScreenContext onboardingWelcomeTakeoverScreenContext = null;
            ReferralInviteContext referralInviteContext = null;
            WiresContext wiresContext = null;
            PortfolioSharingContext portfolioSharingContext = null;
            PatternDayTradingContext patternDayTradingContext = null;
            DayTradeCardContext dayTradeCardContext = null;
            OptionsChainCustomizationContext optionsChainCustomizationContext = null;
            DappBrowserContext dappBrowserContext = null;
            DayTradeCounterGraphicContext dayTradeCounterGraphicContext = null;
            PositionsInstrumentType positionsInstrumentType = null;
            PositionsSortOptionsContext positionsSortOptionsContext = null;
            FXRate fXRate = null;
            TransferErrorContext transferErrorContext = null;
            PortfolioAccountContext portfolioAccountContext = null;
            OptionSimulatedReturnsContext optionSimulatedReturnsContext = null;
            CountryGatingContext countryGatingContext = null;
            InstantUpsellContext instantUpsellContext = null;
            GDPRConsentManagementContext gDPRConsentManagementContext = null;
            NCWTokenVisibilityContext nCWTokenVisibilityContext = null;
            OptionOrderBidAskBarContext optionOrderBidAskBarContext = null;
            GoldDefaultOptInContext goldDefaultOptInContext = null;
            GoldUpgradeType goldUpgradeType = null;
            CryptoTransferLimitContext cryptoTransferLimitContext = null;
            MarginTieredRatesContext marginTieredRatesContext = null;
            ResumeApplicationTakeoverContext resumeApplicationTakeoverContext = null;
            CryptoStakingContext cryptoStakingContext = null;
            OptionsCancelNewContext optionsCancelNewContext = null;
            LogoutContext logoutContext = null;
            PostTransferUpsellContext postTransferUpsellContext = null;
            MicrogramInstallContext microgramInstallContext = null;
            PostSignupOnboardingContext postSignupOnboardingContext = null;
            FuturesOrderContext futuresOrderContext = null;
            FuturesContractContext futuresContractContext = null;
            FuturesTradeBarContext futuresTradeBarContext = null;
            OptionOnboardingContext optionOnboardingContext = null;
            OptionOnboardingActionContext optionOnboardingActionContext = null;
            OptionOnboardingErrorContext optionOnboardingErrorContext = null;
            DashboardWidgetContext dashboardWidgetContext = null;
            SlipOnboardingCheckboxContext slipOnboardingCheckboxContext = null;
            FuturesOrderButtonContext futuresOrderButtonContext = null;
            FuturesLadderContext futuresLadderContext = null;
            LoadingOverlaySpinnerContext loadingOverlaySpinnerContext = null;
            EarningsCallContext earningsCallContext = null;
            InternalAssetTransferContext internalAssetTransferContext = null;
            DeepLinkContext deepLinkContext = null;
            AdvisoryFutureReturnsGraphContext advisoryFutureReturnsGraphContext = null;
            AdvisoryFutureReturnScrubBarContext advisoryFutureReturnScrubBarContext = null;
            SupportAppointmentSettingContext supportAppointmentSettingContext = null;
            EventContractOrderContext eventContractOrderContext = null;
            FuturesPositionContext futuresPositionContext = null;
            FuturesAccountStatusContext futuresAccountStatusContext = null;
            MarginMaintenanceTableRowContext marginMaintenanceTableRowContext = null;
            BreakingNewsContext breakingNewsContext = null;
            AdvisoryFundingMethodContext advisoryFundingMethodContext = null;
            CryptoPostTradeFeeTierStatusContext cryptoPostTradeFeeTierStatusContext = null;
            PerpetualsOrderContext perpetualsOrderContext = null;
            PerpetualPositionContext perpetualPositionContext = null;
            PerpetualContractContext perpetualContractContext = null;
            PrismContext prismContext = null;
            CryptoPostTradeFeeTierUpgradedContext cryptoPostTradeFeeTierUpgradedContext = null;
            LegendAdvancedChartsContext legendAdvancedChartsContext = null;
            EventContractHubCardContext eventContractHubCardContext = null;
            ComboOrderDetailContext comboOrderDetailContext = null;
            CryptoFeeTierStatusContext cryptoFeeTierStatusContext = null;
            CortexDigestContext cortexDigestContext = null;
            CortexDigestOnboardingContext cortexDigestOnboardingContext = null;
            EventContractsPositionContext eventContractsPositionContext = null;
            EquitiesLadderContext equitiesLadderContext = null;
            MarginCallMarketOrderDataMismatch marginCallMarketOrderDataMismatch = null;
            ConciergePlusSupportContext conciergePlusSupportContext = null;
            CortexPortfolioDigestContext cortexPortfolioDigestContext = null;
            SocialTradingContext socialTradingContext = null;
            ByteString byteString = null;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            int i11 = -8388609;
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, new com.robinhood.rosetta.eventlogging.Context(i2, i3, i4, str, str2, str3, str4, productTag, i5, str5, str6, str7, screen, str8, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str9, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str10, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, new ConciergeSupportContext(ConciergeSupportContext.OnboardingScreen.LANDING, null, 2, 0 == true ? 1 : 0), marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString, i6, i7, i8, i9, i10, i11, 16383, null), null, null, 55, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            composerStartRestartGroup.startReplaceGroup(-1003410150);
            composerStartRestartGroup.startReplaceGroup(212064437);
            composerStartRestartGroup.endReplaceGroup();
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Measurer2(density);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Measurer2 measurer2 = (Measurer2) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ConstraintLayoutScope();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue5;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
            final int i12 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
            boolean zChanged = zChangedInstance | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                objRememberedValue6 = new MeasurePolicy() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeWelcome$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list2, int i13) {
                        return super.maxIntrinsicHeight(intrinsicMeasureScope, list2, i13);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list2, int i13) {
                        return super.maxIntrinsicWidth(intrinsicMeasureScope, list2, i13);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list2, int i13) {
                        return super.minIntrinsicHeight(intrinsicMeasureScope, list2, i13);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list2, int i13) {
                        return super.minIntrinsicWidth(intrinsicMeasureScope, list2, i13);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final java.util.List<? extends Measurable> list2, long j) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        snapshotState2.getValue();
                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list2, linkedHashMap, i12);
                        snapshotState.getValue();
                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeWelcome$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                measurer22.performLayout(placementScope, list2, linkedHashMap);
                            }
                        }, 4, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue6;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeWelcome$$inlined$ConstraintLayout$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        snapshotState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                        constraintSetForInlineDsl.setKnownDirty(true);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            final Function0 function0 = (Function0) objRememberedValue7;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeWelcome$$inlined$ConstraintLayout$4
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierAutoLogEvents$default, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeWelcome$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i13) {
                    if ((i13 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1200550679, i13, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                    }
                    snapshotState2.setValue(Unit.INSTANCE);
                    int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                    constraintLayoutScope.reset();
                    ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                    composer2.startReplaceGroup(535452345);
                    android.content.Context context = (android.content.Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                    ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                    composer2.startReplaceGroup(1849434622);
                    Object objRememberedValue9 = composer2.rememberedValue();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objRememberedValue9 == companion2.getEmpty()) {
                        objRememberedValue9 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue9);
                    }
                    SnapshotState snapshotState3 = (SnapshotState) objRememberedValue9;
                    composer2.endReplaceGroup();
                    SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(ConciergeOnboardingComposableKt.ConciergeWelcome$lambda$32$lambda$22(snapshotState3) ? 1.0f : 0.0f, AnimationSpecKt.tween$default(1000, 100, null, 4, null), 0.0f, "videoFadeIn", null, composer2, 3120, 20);
                    composer2.startReplaceGroup(1849434622);
                    Object objRememberedValue10 = composer2.rememberedValue();
                    Object obj = objRememberedValue10;
                    if (objRememberedValue10 == companion2.getEmpty()) {
                        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).build();
                        exoPlayerBuild.setRepeatMode(2);
                        exoPlayerBuild.setPlayWhenReady(true);
                        exoPlayerBuild.setVideoScalingMode(2);
                        ProgressiveMediaSource progressiveMediaSourceCreateMediaSource = new ProgressiveMediaSource.Factory(new DefaultDataSource.Factory(context)).createMediaSource(MediaItem.fromUri("https://cdn.robinhood.com/app_assets/concierge_support/welcome_hero_image/mobile.mp4"));
                        Intrinsics.checkNotNullExpressionValue(progressiveMediaSourceCreateMediaSource, "createMediaSource(...)");
                        exoPlayerBuild.setMediaSource(progressiveMediaSourceCreateMediaSource);
                        exoPlayerBuild.prepare();
                        composer2.updateRememberedValue(exoPlayerBuild);
                        obj = exoPlayerBuild;
                    }
                    ExoPlayer exoPlayer = (ExoPlayer) obj;
                    composer2.endReplaceGroup();
                    Intrinsics.checkNotNull(exoPlayer);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    composer2.startReplaceGroup(5004770);
                    boolean zChanged2 = composer2.changed(constraintLayoutBaseScope4Component2);
                    Object objRememberedValue11 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue11 == companion2.getEmpty()) {
                        objRememberedValue11 = new ConciergeOnboardingComposableKt$ConciergeWelcome$1$1$1(constraintLayoutBaseScope4Component2);
                        composer2.updateRememberedValue(objRememberedValue11);
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierM6758graphicsLayerAp8cVGQ$default = GraphicsLayerModifier6.m6758graphicsLayerAp8cVGQ$default(constraintLayoutScope2.constrainAs(modifierFillMaxWidth$default, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue11), 1.1f, 1.1f, ConciergeOnboardingComposableKt.ConciergeWelcome$lambda$32$lambda$24(snapshotState4AnimateFloatAsState), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 131064, null);
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance3 = composer2.changedInstance(context) | composer2.changedInstance(exoPlayer);
                    Object objRememberedValue12 = composer2.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue12 == companion2.getEmpty()) {
                        objRememberedValue12 = new ConciergeOnboardingComposableKt$ConciergeWelcome$1$2$1(context, exoPlayer);
                        composer2.updateRememberedValue(objRememberedValue12);
                    }
                    composer2.endReplaceGroup();
                    AndroidView_androidKt.AndroidView((Function1) objRememberedValue12, modifierM6758graphicsLayerAp8cVGQ$default, null, composer2, 0, 4);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i14 = BentoTheme.$stable;
                    Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default2, bentoTheme.getColors(composer2, i14).getJet(), null, 2, null);
                    composer2.startReplaceGroup(5004770);
                    boolean zChanged3 = composer2.changed(constraintLayoutBaseScope4Component1);
                    Object objRememberedValue13 = composer2.rememberedValue();
                    if (zChanged3 || objRememberedValue13 == companion2.getEmpty()) {
                        objRememberedValue13 = new ConciergeOnboardingComposableKt$ConciergeWelcome$1$3$1(constraintLayoutBaseScope4Component1);
                        composer2.updateRememberedValue(objRememberedValue13);
                    }
                    composer2.endReplaceGroup();
                    Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(modifierM4872backgroundbw27NRU$default, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue13);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierConstrainAs);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme.getSpacing(composer2, i14).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null);
                    String strStringResource = StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_welcome_title, composer2, 0);
                    TextAlign.Companion companion5 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifierFillMaxWidth$default3, null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer2, i14).getDisplayCapsuleLarge(), 0L, 0L, null, null, null, FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(C16915R.font.martina_regular, FontWeight.INSTANCE.getNormal(), 0, 0, 12, null)), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null), composer2, 0, 0, 8124);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_welcome_description, composer2, 0), SizeKt.fillMaxWidth$default(PaddingKt.m5143paddingVpY3zN4(companion3, bentoTheme.getSpacing(composer2, i14).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i14).m21593getSmallD9Ej5fM()), 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i14).getTextM(), composer2, 0, 0, 8124);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer2, i14).m21594getXlargeD9Ej5fM()), composer2, 0);
                    composer2.endNode();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance4 = composer2.changedInstance(exoPlayer);
                    Object objRememberedValue14 = composer2.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue14 == companion2.getEmpty()) {
                        objRememberedValue14 = new ConciergeOnboardingComposableKt$ConciergeWelcome$1$5$1(exoPlayer, snapshotState3);
                        composer2.updateRememberedValue(objRememberedValue14);
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.DisposableEffect(exoPlayer, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue14, composer2, 0);
                    composer2.endReplaceGroup();
                    if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                        EffectsKt.SideEffect(function0, composer2, 6);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), measurePolicy, composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConciergeOnboardingComposableKt.ConciergeWelcome$lambda$33(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ConciergeWelcome$lambda$32$lambda$23(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ConciergeWelcomeVideo(final boolean z, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Object obj;
        final Function0<Unit> function03;
        Composer composer2;
        ExoPlayer exoPlayer;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1591928720);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function03 = function02;
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1591928720, i3, -1, "com.robinhood.android.support.supporthub.ConciergeWelcomeVideo (ConciergeOnboardingComposable.kt:624)");
            }
            final android.content.Context context = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final SnapshotState snapshotState4 = (SnapshotState) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final SnapshotState snapshotState5 = (SnapshotState) objRememberedValue5;
            composerStartRestartGroup.endReplaceGroup();
            boolean z2 = ConciergeWelcomeVideo$lambda$35(snapshotState) && !ConciergeWelcomeVideo$lambda$38(snapshotState2);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue6 == companion.getEmpty()) {
                ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).build();
                ProgressiveMediaSource progressiveMediaSourceCreateMediaSource = new ProgressiveMediaSource.Factory(new DefaultDataSource.Factory(context)).createMediaSource(MediaItem.fromUri(WELCOME_VIDEO_FILE));
                Intrinsics.checkNotNullExpressionValue(progressiveMediaSourceCreateMediaSource, "createMediaSource(...)");
                exoPlayerBuild.setMediaSource(progressiveMediaSourceCreateMediaSource);
                MediaItem.SubtitleConfiguration subtitleConfigurationBuild = new MediaItem.SubtitleConfiguration.Builder(Uri.parse(WELCOME_VIDEO_SUBTITLE_FILE)).setMimeType("application/x-subrip").setLanguage("en").setSelectionFlags(1).build();
                Intrinsics.checkNotNullExpressionValue(subtitleConfigurationBuild, "build(...)");
                MediaItem mediaItemBuild = new MediaItem.Builder().setUri(Uri.parse(WELCOME_VIDEO_FILE)).setSubtitleConfigurations(extensions2.persistentListOf(subtitleConfigurationBuild)).build();
                Intrinsics.checkNotNullExpressionValue(mediaItemBuild, "build(...)");
                exoPlayerBuild.setMediaItem(mediaItemBuild);
                exoPlayerBuild.setRepeatMode(0);
                exoPlayerBuild.setPlayWhenReady(false);
                exoPlayerBuild.setVideoScalingMode(2);
                exoPlayerBuild.prepare();
                composerStartRestartGroup.updateRememberedValue(exoPlayerBuild);
                obj = exoPlayerBuild;
            } else {
                obj = objRememberedValue6;
            }
            final ExoPlayer exoPlayer2 = (ExoPlayer) obj;
            composerStartRestartGroup.endReplaceGroup();
            Intrinsics.checkNotNull(exoPlayer2);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = SnapshotLongState3.mutableLongStateOf(0L);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            final SnapshotLongState2 snapshotLongState2 = (SnapshotLongState2) objRememberedValue7;
            composerStartRestartGroup.endReplaceGroup();
            final UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ConciergeSupportContext(ConciergeSupportContext.OnboardingScreen.VIDEO, null, 2, false ? 1 : 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -8388609, 16383, null), null, null, 55, null);
            ConciergeOnboardingViewState2.WelcomeVideo welcomeVideo = ConciergeOnboardingViewState2.WelcomeVideo.INSTANCE;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-2008027038, true, new C290361(function02, current, userInteractionEventDescriptor, exoPlayer2, snapshotState3, snapshotLongState2), composerStartRestartGroup, 54);
            final boolean z3 = z2;
            function03 = function02;
            composer2 = composerStartRestartGroup;
            ConciergeScaffold(welcomeVideo, function0, z, null, composableLambdaRememberComposableLambda, null, null, null, false, ComposableLambda3.rememberComposableLambda(-26748094, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt.ConciergeWelcomeVideo.2
                public final void invoke(PaddingValues unused$var$, Composer composer3, int i4) {
                    final ConstraintSetForInlineDsl constraintSetForInlineDsl;
                    final SnapshotState snapshotState6;
                    Intrinsics.checkNotNullParameter(unused$var$, "$unused$var$");
                    if ((i4 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-26748094, i4, -1, "com.robinhood.android.support.supporthub.ConciergeWelcomeVideo.<anonymous> (ConciergeOnboardingComposable.kt:704)");
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, userInteractionEventDescriptorCopy$default, true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null), 0.0f, 1, null);
                    final android.content.Context context2 = context;
                    final ExoPlayer exoPlayer3 = exoPlayer2;
                    final boolean z4 = z3;
                    final SnapshotState<Boolean> snapshotState7 = snapshotState3;
                    final SnapshotState<Boolean> snapshotState8 = snapshotState2;
                    final SnapshotState<String> snapshotState9 = snapshotState5;
                    final Function0<Unit> function04 = function02;
                    final SnapshotState<Boolean> snapshotState10 = snapshotState;
                    composer3.startReplaceGroup(-1003410150);
                    composer3.startReplaceGroup(212064437);
                    composer3.endReplaceGroup();
                    Density density = (Density) composer3.consume(CompositionLocalsKt.getLocalDensity());
                    Object objRememberedValue8 = composer3.rememberedValue();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objRememberedValue8 == companion2.getEmpty()) {
                        objRememberedValue8 = new Measurer2(density);
                        composer3.updateRememberedValue(objRememberedValue8);
                    }
                    final Measurer2 measurer2 = (Measurer2) objRememberedValue8;
                    Object objRememberedValue9 = composer3.rememberedValue();
                    if (objRememberedValue9 == companion2.getEmpty()) {
                        objRememberedValue9 = new ConstraintLayoutScope();
                        composer3.updateRememberedValue(objRememberedValue9);
                    }
                    final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue9;
                    Object objRememberedValue10 = composer3.rememberedValue();
                    if (objRememberedValue10 == companion2.getEmpty()) {
                        objRememberedValue10 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer3.updateRememberedValue(objRememberedValue10);
                    }
                    final SnapshotState snapshotState11 = (SnapshotState) objRememberedValue10;
                    Object objRememberedValue11 = composer3.rememberedValue();
                    if (objRememberedValue11 == companion2.getEmpty()) {
                        objRememberedValue11 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                        composer3.updateRememberedValue(objRememberedValue11);
                    }
                    final ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) objRememberedValue11;
                    Object objRememberedValue12 = composer3.rememberedValue();
                    if (objRememberedValue12 == companion2.getEmpty()) {
                        objRememberedValue12 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                        composer3.updateRememberedValue(objRememberedValue12);
                    }
                    final SnapshotState snapshotState12 = (SnapshotState) objRememberedValue12;
                    boolean zChangedInstance = composer3.changedInstance(measurer2);
                    final int i5 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
                    boolean zChanged = zChangedInstance | composer3.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
                    Object objRememberedValue13 = composer3.rememberedValue();
                    if (zChanged || objRememberedValue13 == companion2.getEmpty()) {
                        objRememberedValue13 = new MeasurePolicy() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$invoke$$inlined$ConstraintLayout$2
                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i6) {
                                return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i6);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i6) {
                                return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i6);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i6) {
                                return super.minIntrinsicHeight(intrinsicMeasureScope, list, i6);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i6) {
                                return super.minIntrinsicWidth(intrinsicMeasureScope, list, i6);
                            }

                            @Override // androidx.compose.p011ui.layout.MeasurePolicy
                            /* renamed from: measure-3p2s80s */
                            public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final java.util.List<? extends Measurable> list, long j) {
                                final LinkedHashMap linkedHashMap = new LinkedHashMap();
                                snapshotState12.getValue();
                                long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl2, list, linkedHashMap, i5);
                                snapshotState11.getValue();
                                int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                                int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                                final Measurer2 measurer22 = measurer2;
                                return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$invoke$$inlined$ConstraintLayout$2.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        invoke2(placementScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Placeable.PlacementScope placementScope) {
                                        measurer22.performLayout(placementScope, list, linkedHashMap);
                                    }
                                }, 4, null);
                            }
                        };
                        constraintSetForInlineDsl = constraintSetForInlineDsl2;
                        snapshotState6 = snapshotState11;
                        composer3.updateRememberedValue(objRememberedValue13);
                    } else {
                        constraintSetForInlineDsl = constraintSetForInlineDsl2;
                        snapshotState6 = snapshotState11;
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue13;
                    Object objRememberedValue14 = composer3.rememberedValue();
                    if (objRememberedValue14 == companion2.getEmpty()) {
                        objRememberedValue14 = new Function0<Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$invoke$$inlined$ConstraintLayout$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                snapshotState6.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                                constraintSetForInlineDsl.setKnownDirty(true);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue14);
                    }
                    final Function0 function05 = (Function0) objRememberedValue14;
                    boolean zChangedInstance2 = composer3.changedInstance(measurer2);
                    Object objRememberedValue15 = composer3.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue15 == companion2.getEmpty()) {
                        objRememberedValue15 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$invoke$$inlined$ConstraintLayout$4
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue15);
                    }
                    LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierFillMaxSize$default, false, (Function1) objRememberedValue15, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$invoke$$inlined$ConstraintLayout$5
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Type inference failed for: r13v12 */
                        /* JADX WARN: Type inference failed for: r13v3 */
                        /* JADX WARN: Type inference failed for: r13v4, types: [androidx.compose.animation.core.Easing, androidx.compose.animation.core.FiniteAnimationSpec, java.lang.Object, kotlin.coroutines.Continuation] */
                        /* JADX WARN: Type inference failed for: r14v1 */
                        /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
                        /* JADX WARN: Type inference failed for: r14v5 */
                        public final void invoke(Composer composer4, int i6) {
                            int i7;
                            Modifier.Companion companion3;
                            ConstraintLayoutScope constraintLayoutScope2;
                            float f;
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4;
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope42;
                            int i8;
                            ?? r13;
                            ?? r14;
                            Composer composer5;
                            String strConciergeWelcomeVideo$lambda$47;
                            if ((i6 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                            }
                            snapshotState12.setValue(Unit.INSTANCE);
                            int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                            constraintLayoutScope.reset();
                            ConstraintLayoutScope constraintLayoutScope3 = constraintLayoutScope;
                            composer4.startReplaceGroup(509153946);
                            ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope3.createRefs();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component3 = constrainedLayoutReferencesCreateRefs.component3();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component4 = constrainedLayoutReferencesCreateRefs.component4();
                            ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component5 = constrainedLayoutReferencesCreateRefs.component5();
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(LocalShowPlaceholder.withBentoPlaceholder$default(companion4, false, null, 3, null), 0.0f, 1, null);
                            composer4.startReplaceGroup(1849434622);
                            Object objRememberedValue16 = composer4.rememberedValue();
                            Composer.Companion companion5 = Composer.INSTANCE;
                            if (objRememberedValue16 == companion5.getEmpty()) {
                                objRememberedValue16 = ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$1$1.INSTANCE;
                                composer4.updateRememberedValue(objRememberedValue16);
                            }
                            composer4.endReplaceGroup();
                            Modifier modifierConstrainAs = constraintLayoutScope3.constrainAs(modifierFillMaxWidth$default, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue16);
                            composer4.startReplaceGroup(-1633490746);
                            boolean zChangedInstance3 = composer4.changedInstance(exoPlayer3) | composer4.changedInstance(context2);
                            Object objRememberedValue17 = composer4.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue17 == companion5.getEmpty()) {
                                objRememberedValue17 = new ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$2$1(context2, exoPlayer3);
                                composer4.updateRememberedValue(objRememberedValue17);
                            }
                            composer4.endReplaceGroup();
                            AndroidView_androidKt.AndroidView((Function1) objRememberedValue17, modifierConstrainAs, null, composer4, 0, 4);
                            Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), AnimationSpecKt.tween$default(1000, 500, null, 4, null), null, 2, null);
                            composer4.startReplaceGroup(-1633490746);
                            boolean zChanged2 = composer4.changed(constraintLayoutBaseScope4Component1);
                            Object objRememberedValue18 = composer4.rememberedValue();
                            if (zChanged2 || objRememberedValue18 == companion5.getEmpty()) {
                                objRememberedValue18 = new ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$3$1(constraintLayoutBaseScope4Component1, snapshotState7);
                                composer4.updateRememberedValue(objRememberedValue18);
                            }
                            composer4.endReplaceGroup();
                            Modifier modifierConstrainAs2 = constraintLayoutScope3.constrainAs(modifierAnimateContentSize$default, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue18);
                            Brush.Companion companion6 = Brush.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i9 = BentoTheme.$stable;
                            Modifier modifierBackground$default = Background3.background$default(modifierConstrainAs2, Brush.Companion.m6682verticalGradient8A3gB4$default(companion6, CollectionsKt.listOf((Object[]) new Color[]{Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer4, i9).getJet(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m6701boximpl(Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer4, i9).getJet(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null))}), 0.0f, 0.0f, 0, 14, (Object) null), null, 0.0f, 6, null);
                            Alignment.Companion companion7 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion7.getTopStart(), false);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierBackground$default);
                            ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion8.getConstructor();
                            if (composer4.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion8.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion8.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion8.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion8.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            Spacer2.Spacer(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null), composer4, 6);
                            composer4.endNode();
                            composer4.startReplaceGroup(293588618);
                            if (!ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$38(snapshotState8) || (strConciergeWelcomeVideo$lambda$47 = ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$47(snapshotState9)) == null) {
                                i7 = helpersHashCode;
                                companion3 = companion4;
                                constraintLayoutScope2 = constraintLayoutScope3;
                                f = 0.0f;
                                constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component4;
                                constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component3;
                                i8 = 1849434622;
                                r13 = 0;
                                r14 = 1;
                                composer5 = composer4;
                            } else {
                                composer4.startReplaceGroup(5004770);
                                boolean zChanged3 = composer4.changed(constraintLayoutBaseScope4Component1);
                                Object objRememberedValue19 = composer4.rememberedValue();
                                if (zChanged3 || objRememberedValue19 == companion5.getEmpty()) {
                                    objRememberedValue19 = new ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$5$1$1(constraintLayoutBaseScope4Component1);
                                    composer4.updateRememberedValue(objRememberedValue19);
                                }
                                composer4.endReplaceGroup();
                                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(constraintLayoutScope3.constrainAs(companion4, constraintLayoutBaseScope4Component5, (Function1) objRememberedValue19), 0.0f, 1, null);
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion7.getStart(), composer4, 0);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                                Function0<ComposeUiNode> constructor2 = companion8.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion8.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion8.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion8.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion8.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                float f2 = 100;
                                constraintLayoutScope2 = constraintLayoutScope3;
                                i7 = helpersHashCode;
                                companion3 = companion4;
                                constraintLayoutBaseScope4 = constraintLayoutBaseScope4Component4;
                                constraintLayoutBaseScope42 = constraintLayoutBaseScope4Component3;
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_welcome_video_vlad, composer4, 0), PaddingKt.m5143paddingVpY3zN4(BorderKt.m4876borderxT4_qwU(Background3.m4871backgroundbw27NRU(column6.align(companion4, companion7.getCenterHorizontally()), bentoTheme.getColors(composer4, i9).m21371getBg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f2))), C2002Dp.m7995constructorimpl((float) 0.5d), bentoTheme.getColors(composer4, i9).m21427getFg30d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f2))), C2002Dp.m7995constructorimpl(12), C2002Dp.m7995constructorimpl(2)), Color.m6701boximpl(bentoTheme.getColors(composer4, i9).m21425getFg0d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer4, i9).getTextS(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 8120);
                                r13 = 0;
                                f = 0.0f;
                                EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(300, 200, null, 4, null), 0.0f, 2, null);
                                TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, 200, null, 4, null);
                                composer4.startReplaceGroup(1849434622);
                                Object objRememberedValue20 = composer4.rememberedValue();
                                if (objRememberedValue20 == companion5.getEmpty()) {
                                    objRememberedValue20 = C29038x64520.INSTANCE;
                                    composer4.updateRememberedValue(objRememberedValue20);
                                }
                                composer4.endReplaceGroup();
                                EnterTransition enterTransitionPlus = enterTransitionFadeIn$default.plus(EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue20));
                                ExitTransition exitTransitionFadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(200, 0, null, 6, null), 0.0f, 2, null);
                                TweenSpec tweenSpecTween$default2 = AnimationSpecKt.tween$default(200, 0, null, 6, null);
                                composer4.startReplaceGroup(1849434622);
                                Object objRememberedValue21 = composer4.rememberedValue();
                                if (objRememberedValue21 == companion5.getEmpty()) {
                                    objRememberedValue21 = C29039x648e1.INSTANCE;
                                    composer4.updateRememberedValue(objRememberedValue21);
                                }
                                composer4.endReplaceGroup();
                                i8 = 1849434622;
                                r14 = 1;
                                AnimatedVisibilityKt.AnimatedVisibility((Column5) column6, true, (Modifier) null, enterTransitionPlus, exitTransitionFadeOut$default.plus(EnterExitTransitionKt.slideOutVertically(tweenSpecTween$default2, (Function1) objRememberedValue21)), (String) null, (Function3<? super AnimatedVisibilityScope, ? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(1767609128, true, new ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$5$2$3(strConciergeWelcomeVideo$lambda$47), composer4, 54), composer4, 1600566, 18);
                                composer5 = composer4;
                                composer5.endNode();
                            }
                            composer5.endReplaceGroup();
                            Modifier.Companion companion9 = companion3;
                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion9, f, r14, r13);
                            composer5.startReplaceGroup(i8);
                            Object objRememberedValue22 = composer5.rememberedValue();
                            if (objRememberedValue22 == companion5.getEmpty()) {
                                objRememberedValue22 = ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$6$1.INSTANCE;
                                composer5.updateRememberedValue(objRememberedValue22);
                            }
                            composer5.endReplaceGroup();
                            ConstraintLayoutScope constraintLayoutScope4 = constraintLayoutScope2;
                            Modifier modifierConstrainAs3 = constraintLayoutScope4.constrainAs(modifierFillMaxWidth$default2, constraintLayoutBaseScope42, (Function1) objRememberedValue22);
                            boolean zConciergeWelcomeVideo$lambda$41 = ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$41(snapshotState7);
                            composer5.startReplaceGroup(i8);
                            Object objRememberedValue23 = composer5.rememberedValue();
                            if (objRememberedValue23 == companion5.getEmpty()) {
                                objRememberedValue23 = ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$7$1.INSTANCE;
                                composer5.updateRememberedValue(objRememberedValue23);
                            }
                            composer5.endReplaceGroup();
                            EnterTransition enterTransitionPlus2 = EnterExitTransitionKt.slideInVertically$default(r13, (Function1) objRememberedValue23, r14, r13).plus(EnterExitTransitionKt.fadeIn$default(r13, f, 3, r13));
                            composer5.startReplaceGroup(i8);
                            Object objRememberedValue24 = composer5.rememberedValue();
                            if (objRememberedValue24 == companion5.getEmpty()) {
                                objRememberedValue24 = ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$8$1.INSTANCE;
                                composer5.updateRememberedValue(objRememberedValue24);
                            }
                            composer5.endReplaceGroup();
                            ExitTransition exitTransitionPlus = EnterExitTransitionKt.slideOutVertically$default(r13, (Function1) objRememberedValue24, r14, r13).plus(EnterExitTransitionKt.fadeOut$default(r13, f, 3, r13));
                            ComposableSingletons$ConciergeOnboardingComposableKt composableSingletons$ConciergeOnboardingComposableKt = ComposableSingletons$ConciergeOnboardingComposableKt.INSTANCE;
                            AnimatedVisibilityKt.AnimatedVisibility(zConciergeWelcomeVideo$lambda$41, modifierConstrainAs3, enterTransitionPlus2, exitTransitionPlus, (String) null, composableSingletons$ConciergeOnboardingComposableKt.getLambda$881661233$feature_support_externalRelease(), composer5, 200064, 16);
                            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion9, f, r14, r13);
                            composer5.startReplaceGroup(i8);
                            Object objRememberedValue25 = composer5.rememberedValue();
                            if (objRememberedValue25 == companion5.getEmpty()) {
                                objRememberedValue25 = ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$9$1.INSTANCE;
                                composer5.updateRememberedValue(objRememberedValue25);
                            }
                            composer5.endReplaceGroup();
                            Modifier modifierConstrainAs4 = constraintLayoutScope4.constrainAs(modifierFillMaxWidth$default3, constraintLayoutBaseScope4, (Function1) objRememberedValue25);
                            boolean zConciergeWelcomeVideo$lambda$412 = ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$41(snapshotState7);
                            EnterTransition enterTransitionFadeIn$default2 = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(600, 200, r13, 4, r13), f, 2, r13);
                            TweenSpec tweenSpecTween$default3 = AnimationSpecKt.tween$default(600, 200, r13, 4, r13);
                            composer5.startReplaceGroup(i8);
                            Object objRememberedValue26 = composer5.rememberedValue();
                            if (objRememberedValue26 == companion5.getEmpty()) {
                                objRememberedValue26 = ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$10$1.INSTANCE;
                                composer5.updateRememberedValue(objRememberedValue26);
                            }
                            composer5.endReplaceGroup();
                            EnterTransition enterTransitionPlus3 = enterTransitionFadeIn$default2.plus(EnterExitTransitionKt.slideInVertically(tweenSpecTween$default3, (Function1) objRememberedValue26));
                            ExitTransition exitTransitionFadeOut$default2 = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(300, 0, r13, 6, r13), f, 2, r13);
                            TweenSpec tweenSpecTween$default4 = AnimationSpecKt.tween$default(300, 0, r13, 6, r13);
                            composer5.startReplaceGroup(i8);
                            Object objRememberedValue27 = composer5.rememberedValue();
                            if (objRememberedValue27 == companion5.getEmpty()) {
                                objRememberedValue27 = ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$11$1.INSTANCE;
                                composer5.updateRememberedValue(objRememberedValue27);
                            }
                            composer5.endReplaceGroup();
                            AnimatedVisibilityKt.AnimatedVisibility(zConciergeWelcomeVideo$lambda$412, modifierConstrainAs4, enterTransitionPlus3, exitTransitionFadeOut$default2.plus(EnterExitTransitionKt.slideOutVertically(tweenSpecTween$default4, (Function1) objRememberedValue27)), (String) null, ComposableLambda3.rememberComposableLambda(2049317736, r14, new ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$12(exoPlayer3, function04, snapshotState8, snapshotState7, snapshotState10), composer5, 54), composer5, 200064, 16);
                            AnimatedVisibilityKt.AnimatedVisibility(z4, (Modifier) null, EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween$default(0, 0, r13, 6, r13), f, 2, r13), EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(1000, 0, r13, 6, r13), f, 2, r13), (String) null, composableSingletons$ConciergeOnboardingComposableKt.m19096getLambda$416443223$feature_support_externalRelease(), composer4, 200064, 18);
                            Boolean boolValueOf = Boolean.valueOf(z4);
                            composer4.startReplaceGroup(-1746271574);
                            boolean zChanged4 = composer4.changed(z4) | composer4.changedInstance(exoPlayer3);
                            Object objRememberedValue28 = composer4.rememberedValue();
                            if (zChanged4 || objRememberedValue28 == companion5.getEmpty()) {
                                objRememberedValue28 = new ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$2$1$13$1(z4, exoPlayer3, 1000, r13);
                                composer4.updateRememberedValue(objRememberedValue28);
                            }
                            composer4.endReplaceGroup();
                            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue28, composer4, 0);
                            composer4.endReplaceGroup();
                            if (constraintLayoutScope.getHelpersHashCode() != i7) {
                                EffectsKt.SideEffect(function05, composer4, 6);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), measurePolicy, composer3, 48, 0);
                    composer3.endReplaceGroup();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composer2, (i3 & 112) | 805330950 | ((i3 << 6) & 896), 488);
            composer2.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer2.changedInstance(exoPlayer2) | composer2.changedInstance(lifecycleOwner);
            Object objRememberedValue8 = composer2.rememberedValue();
            if (zChangedInstance || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new Function1() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$56$lambda$55(lifecycleOwner, exoPlayer2, snapshotLongState2, snapshotState2, snapshotState4, snapshotState, snapshotState3, snapshotState5, (DisposableEffectScope) obj2);
                    }
                };
                exoPlayer = exoPlayer2;
                composer2.updateRememberedValue(objRememberedValue8);
            } else {
                exoPlayer = exoPlayer2;
            }
            composer2.endReplaceGroup();
            EffectsKt.DisposableEffect(exoPlayer, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue8, composer2, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$57(z, function0, function03, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ConciergeWelcomeVideo$lambda$36(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ConciergeWelcomeVideo$lambda$39(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ConciergeWelcomeVideo$lambda$42(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: ConciergeOnboardingComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$1 */
    static final class C290361 implements Function3<Row5, Composer, Integer, Unit> {
        final /* synthetic */ UserInteractionEventDescriptor $baseEvent;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ ExoPlayer $exoPlayer;
        final /* synthetic */ Function0<Unit> $onClickContinue;
        final /* synthetic */ SnapshotLongState2 $playerPosition$delegate;
        final /* synthetic */ SnapshotState<Boolean> $videoEnd$delegate;

        C290361(Function0<Unit> function0, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, ExoPlayer exoPlayer, SnapshotState<Boolean> snapshotState, SnapshotLongState2 snapshotLongState2) {
            this.$onClickContinue = function0;
            this.$eventLogger = eventLogger;
            this.$baseEvent = userInteractionEventDescriptor;
            this.$exoPlayer = exoPlayer;
            this.$videoEnd$delegate = snapshotState;
            this.$playerPosition$delegate = snapshotLongState2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 ConciergeScaffold, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(ConciergeScaffold, "$this$ConciergeScaffold");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2008027038, i, -1, "com.robinhood.android.support.supporthub.ConciergeWelcomeVideo.<anonymous> (ConciergeOnboardingComposable.kt:685)");
            }
            boolean zConciergeWelcomeVideo$lambda$41 = ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$41(this.$videoEnd$delegate);
            Function0<Unit> function0 = this.$onClickContinue;
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$baseEvent) | composer.changedInstance(this.$exoPlayer);
            final EventLogger eventLogger = this.$eventLogger;
            final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$baseEvent;
            final ExoPlayer exoPlayer = this.$exoPlayer;
            final SnapshotLongState2 snapshotLongState2 = this.$playerPosition$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ConciergeOnboardingComposableKt.C290361.invoke$lambda$1$lambda$0(eventLogger, userInteractionEventDescriptor, exoPlayer, snapshotLongState2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            ConciergeOnboardingComposableKt.ConciergeAppBarVideoCta(zConciergeWelcomeVideo$lambda$41, function0, (Function0) objRememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, ExoPlayer exoPlayer, SnapshotLongState2 snapshotLongState2) {
            ConciergeOnboardingComposableKt.logTapEvent(eventLogger, ConciergeOnboardingViewState2.WelcomeVideo.INSTANCE, userInteractionEventDescriptor, UserInteractionEventData.Action.REPLAY);
            ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$53(snapshotLongState2, 0L);
            exoPlayer.pause();
            exoPlayer.seekTo(ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$52(snapshotLongState2));
            exoPlayer.play();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.media3.common.Player$Listener, com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$3$1$playerObserver$1] */
    public static final DisposableEffectResult ConciergeWelcomeVideo$lambda$56$lambda$55(final LifecycleOwner lifecycleOwner, final ExoPlayer exoPlayer, final SnapshotLongState2 snapshotLongState2, final SnapshotState snapshotState, final SnapshotState snapshotState2, final SnapshotState snapshotState3, final SnapshotState snapshotState4, final SnapshotState snapshotState5, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$3$1$lifecycleObserver$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                Intrinsics.checkNotNullParameter(lifecycleOwner2, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == Lifecycle.Event.ON_STOP) {
                    ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$53(snapshotLongState2, exoPlayer.getCurrentPosition());
                    exoPlayer.pause();
                } else if (event == Lifecycle.Event.ON_START) {
                    exoPlayer.seekTo(ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$52(snapshotLongState2));
                    if (ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$38(snapshotState)) {
                        exoPlayer.play();
                    }
                }
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        final ?? r0 = new Player.Listener() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$3$1$playerObserver$1
            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
                super.onAudioAttributesChanged(audioAttributes);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i) {
                super.onAudioSessionIdChanged(i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
                super.onAvailableCommandsChanged(commands);
            }

            @Override // androidx.media3.common.Player.Listener
            @Deprecated
            public /* bridge */ /* synthetic */ void onCues(java.util.List list) {
                super.onCues((java.util.List<Cue>) list);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
                super.onDeviceInfoChanged(deviceInfo);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
                super.onDeviceVolumeChanged(i, z);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onEvents(Player player, Player.Events events) {
                super.onEvents(player, events);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
                super.onIsLoadingChanged(z);
            }

            @Override // androidx.media3.common.Player.Listener
            @Deprecated
            public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
                super.onLoadingChanged(z);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
                super.onMaxSeekToPreviousPositionChanged(j);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i) {
                super.onMediaItemTransition(mediaItem, i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
                super.onMediaMetadataChanged(mediaMetadata);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onMetadata(androidx.media3.common.Metadata metadata) {
                super.onMetadata(metadata);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
                super.onPlayWhenReadyChanged(z, i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
                super.onPlaybackParametersChanged(playbackParameters);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
                super.onPlaybackSuppressionReasonChanged(i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
                super.onPlayerErrorChanged(playbackException);
            }

            @Override // androidx.media3.common.Player.Listener
            @Deprecated
            public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
                super.onPlayerStateChanged(z, i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
                super.onPlaylistMetadataChanged(mediaMetadata);
            }

            @Override // androidx.media3.common.Player.Listener
            @Deprecated
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
                super.onPositionDiscontinuity(i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i) {
                super.onPositionDiscontinuity(positionInfo, positionInfo2, i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
                super.onRenderedFirstFrame();
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
                super.onRepeatModeChanged(i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
                super.onSeekBackIncrementChanged(j);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
                super.onSeekForwardIncrementChanged(j);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
                super.onShuffleModeEnabledChanged(z);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
                super.onSkipSilenceEnabledChanged(z);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
                super.onSurfaceSizeChanged(i, i2);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onTimelineChanged(Timeline timeline, int i) {
                super.onTimelineChanged(timeline, i);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
                super.onTrackSelectionParametersChanged(trackSelectionParameters);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onTracksChanged(Tracks tracks) {
                super.onTracksChanged(tracks);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
                super.onVideoSizeChanged(videoSize);
            }

            @Override // androidx.media3.common.Player.Listener
            public /* bridge */ /* synthetic */ void onVolumeChanged(float f) {
                super.onVolumeChanged(f);
            }

            @Override // androidx.media3.common.Player.Listener
            public void onIsPlayingChanged(boolean isPlaying) {
                ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$39(snapshotState, isPlaying);
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPlayerError(PlaybackException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                snapshotState2.setValue(error.getMessage());
            }

            @Override // androidx.media3.common.Player.Listener
            public void onPlaybackStateChanged(int playbackState) {
                if (playbackState == 1) {
                    ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$36(snapshotState3, false);
                    ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$39(snapshotState, false);
                    snapshotState2.setValue(null);
                    ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$42(snapshotState4, false);
                    return;
                }
                if (playbackState == 2) {
                    ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$36(snapshotState3, true);
                    ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$42(snapshotState4, false);
                } else if (playbackState == 3) {
                    ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$36(snapshotState3, false);
                    ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$42(snapshotState4, false);
                } else {
                    if (playbackState != 4) {
                        return;
                    }
                    ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$39(snapshotState, false);
                    ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$36(snapshotState3, false);
                    ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$42(snapshotState4, true);
                    snapshotState2.setValue(null);
                }
            }

            @Override // androidx.media3.common.Player.Listener
            public void onCues(CueGroup cues) {
                CharSequence charSequence;
                Intrinsics.checkNotNullParameter(cues, "cues");
                SnapshotState<String> snapshotState6 = snapshotState5;
                com.google.common.collect.ImmutableList<Cue> cues2 = cues.cues;
                Intrinsics.checkNotNullExpressionValue(cues2, "cues");
                Cue cue = (Cue) CollectionsKt.firstOrNull((java.util.List) cues2);
                snapshotState6.setValue((cue == null || (charSequence = cue.text) == null) ? null : charSequence.toString());
            }
        };
        exoPlayer.addListener(r0);
        return new DisposableEffectResult() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeWelcomeVideo$lambda$56$lambda$55$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                lifecycleOwner.getLifecycle().removeObserver(lifecycleEventObserver);
                exoPlayer.removeListener(r0);
                exoPlayer.stop();
                exoPlayer.setPlayWhenReady(false);
                exoPlayer.release();
                ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$36(snapshotState3, false);
                ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$39(snapshotState, false);
                ConciergeOnboardingComposableKt.ConciergeWelcomeVideo$lambda$42(snapshotState4, false);
                snapshotState2.setValue(null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ConciergeAppBarVideoCta(final boolean z, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2142466594);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2142466594, i2, -1, "com.robinhood.android.support.supporthub.ConciergeAppBarVideoCta (ConciergeOnboardingComposable.kt:994)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 11, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            if (z) {
                composerStartRestartGroup.startReplaceGroup(1139657363);
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_welcome_video_cta_replay, composerStartRestartGroup, 0), ClickableKt.m4893clickableXHw0xAI$default(TestTag3.testTag(companion, "ToolbarVideoReplayButton"), false, null, null, function02, 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16380);
                composer2.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(1139993465);
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_welcome_video_cta_skip, composerStartRestartGroup, 0), ClickableKt.m4893clickableXHw0xAI$default(TestTag3.testTag(companion, "ToolbarVideoSkipButton"), false, null, null, function0, 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16380);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ConciergeOnboardingComposableKt.ConciergeAppBarVideoCta$lambda$59(z, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ConciergeWelcomeEndVideoText(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Object obj;
        final SnapshotState snapshotState;
        Composer composerStartRestartGroup = composer.startRestartGroup(175162639);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(175162639, i3, -1, "com.robinhood.android.support.supporthub.ConciergeWelcomeEndVideoText (ConciergeOnboardingComposable.kt:1020)");
            }
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier3, 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(-1003410150);
            composerStartRestartGroup.startReplaceGroup(212064437);
            composerStartRestartGroup.endReplaceGroup();
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Measurer2(density);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final Measurer2 measurer2 = (Measurer2) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new ConstraintLayoutScope();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final ConstraintLayoutScope constraintLayoutScope = (ConstraintLayoutScope) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            final ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) objRememberedValue4;
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = SnapshotStateKt.mutableStateOf(Unit.INSTANCE, SnapshotStateKt.neverEqualPolicy());
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue5;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(measurer2);
            final int i5 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
            boolean zChanged = zChangedInstance | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                obj = new MeasurePolicy() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeWelcomeEndVideoText$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i6) {
                        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i6);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i6) {
                        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i6);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i6) {
                        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i6);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, java.util.List list, int i6) {
                        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i6);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final java.util.List<? extends Measurable> list, long j) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        snapshotState3.getValue();
                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i5);
                        snapshotState2.getValue();
                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeWelcomeEndVideoText$$inlined$ConstraintLayout$2.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                measurer22.performLayout(placementScope, list, linkedHashMap);
                            }
                        }, 4, null);
                    }
                };
                snapshotState = snapshotState2;
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                obj = objRememberedValue6;
                snapshotState = snapshotState2;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) obj;
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeWelcomeEndVideoText$$inlined$ConstraintLayout$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        snapshotState.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                        constraintSetForInlineDsl.setKnownDirty(true);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            final Function0 function0 = (Function0) objRememberedValue7;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(measurer2);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeWelcomeEndVideoText$$inlined$ConstraintLayout$4
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        ToolingUtils2.setDesignInfoProvider(semanticsPropertyReceiver, measurer2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$ConciergeWelcomeEndVideoText$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1200550679, i6, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                        }
                        snapshotState3.setValue(Unit.INSTANCE);
                        int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                        constraintLayoutScope.reset();
                        ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                        composer2.startReplaceGroup(-1258544943);
                        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged2 = composer2.changed(constraintLayoutBaseScope4Component2);
                        Object objRememberedValue9 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue9 = new C29034x6b9536a3(constraintLayoutBaseScope4Component2);
                            composer2.updateRememberedValue(objRememberedValue9);
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierWrapContentWidth$default = SizeKt.wrapContentWidth$default(constraintLayoutScope2.constrainAs(companion2, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue9), null, false, 3, null);
                        String strStringResource = StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_welcome_video_title, composer2, 0);
                        TextAlign.Companion companion3 = TextAlign.INSTANCE;
                        int iM7919getCentere0LSkKk = companion3.m7919getCentere0LSkKk();
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(strStringResource, modifierWrapContentWidth$default, null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer2, i7).getDisplayCapsuleLarge(), 0L, 0L, null, null, null, FontFamily4.FontFamily(Font2.m7691FontYpTlLL0$default(C16915R.font.martina_regular, FontWeight.INSTANCE.getNormal(), 0, 0, 12, null)), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null), composer2, 0, 0, 8124);
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged3 = composer2.changed(constraintLayoutBaseScope4Component1);
                        Object objRememberedValue10 = composer2.rememberedValue();
                        if (zChanged3 || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue10 = new C29035x6b953a64(constraintLayoutBaseScope4Component1);
                            composer2.updateRememberedValue(objRememberedValue10);
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(modifierM5146paddingqDBjuR0$default, constraintLayoutBaseScope4Component2, (Function1) objRememberedValue10);
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_welcome_video_subtitle_2, composer2, 0), modifierConstrainAs, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextM(), composer2, 0, 0, 8124);
                        composer2.endReplaceGroup();
                        if (constraintLayoutScope.getHelpersHashCode() != helpersHashCode) {
                            EffectsKt.SideEffect(function0, composer2, 6);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }, composerStartRestartGroup, 54), measurePolicy, composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return ConciergeOnboardingComposableKt.ConciergeWelcomeEndVideoText$lambda$63(modifier2, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConciergeWelcomeVideoControls(final boolean z, final boolean z2, final boolean z3, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(636829017);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(636829017, i3, -1, "com.robinhood.android.support.supporthub.ConciergeWelcomeVideoControls (ConciergeOnboardingComposable.kt:1068)");
                }
                final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifier2, bentoTheme.getColors(composerStartRestartGroup, i5).getJet(), null, 2, null);
                modifier3 = modifier2;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                if (z && !z3 && !z2) {
                    composerStartRestartGroup.startReplaceGroup(1874803220);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null);
                    String strStringResource = StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_welcome_video_cta_play, composerStartRestartGroup, 0);
                    String strStringResource2 = StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_welcome_video_cta_skip, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | ((i3 & 7168) == 2048);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConciergeOnboardingComposableKt.ConciergeWelcomeVideoControls$lambda$74$lambda$65$lambda$64(current, userInteractionEventDescriptor, function0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Function0 function03 = (Function0) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | ((57344 & i3) == 16384);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConciergeOnboardingComposableKt.ConciergeWelcomeVideoControls$lambda$74$lambda$67$lambda$66(current, userInteractionEventDescriptor, function02);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoButtonBar2.BentoButtonBar(modifierFillMaxWidth$default, null, null, false, null, null, function03, strStringResource, false, null, false, (Function0) objRememberedValue2, strStringResource2, false, null, false, composerStartRestartGroup, 0, 0, 59198);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (!z3 && !z) {
                    composerStartRestartGroup.startReplaceGroup(1875937386);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null);
                    String strStringResource3 = StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_welcome_video_cta_play, composerStartRestartGroup, 0);
                    String strStringResource4 = StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_welcome_video_cta_skip, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | ((i3 & 7168) == 2048);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConciergeOnboardingComposableKt.ConciergeWelcomeVideoControls$lambda$74$lambda$69$lambda$68(current, userInteractionEventDescriptor, function0);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    Function0 function04 = (Function0) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | ((57344 & i3) == 16384);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConciergeOnboardingComposableKt.ConciergeWelcomeVideoControls$lambda$74$lambda$71$lambda$70(current, userInteractionEventDescriptor, function02);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoButtonBar2.BentoButtonBar(modifierFillMaxWidth$default2, null, null, false, null, null, function04, strStringResource3, true, null, false, (Function0) objRememberedValue4, strStringResource4, false, null, true, composerStartRestartGroup, 100663296, 196614, 25150);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (z2) {
                    composerStartRestartGroup.startReplaceGroup(1877797727);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1877168272);
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null);
                    String strStringResource5 = StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_welcome_video_cta_continue, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | ((57344 & i3) == 16384);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return ConciergeOnboardingComposableKt.ConciergeWelcomeVideoControls$lambda$74$lambda$73$lambda$72(current, userInteractionEventDescriptor, function02);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoButtonBar2.BentoButtonBar(modifierFillMaxWidth$default3, null, null, false, null, null, (Function0) objRememberedValue5, strStringResource5, false, null, false, null, null, false, null, false, composerStartRestartGroup, 0, 0, 65342);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ConciergeOnboardingComposableKt.ConciergeWelcomeVideoControls$lambda$75(z, z2, z3, function0, function02, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(modifier2, bentoTheme2.getColors(composerStartRestartGroup, i52).getJet(), null, 2, null);
            modifier3 = modifier2;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                if (z) {
                    if (!z3) {
                        if (z2) {
                        }
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConciergeWelcomeVideoControls$lambda$74$lambda$65$lambda$64(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function0 function0) {
        logTapEvent(eventLogger, ConciergeOnboardingViewState2.WelcomeVideo.INSTANCE, userInteractionEventDescriptor, UserInteractionEventData.Action.PLAY);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConciergeWelcomeVideoControls$lambda$74$lambda$67$lambda$66(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function0 function0) {
        logTapEvent(eventLogger, ConciergeOnboardingViewState2.WelcomeVideo.INSTANCE, userInteractionEventDescriptor, UserInteractionEventData.Action.SKIP);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConciergeWelcomeVideoControls$lambda$74$lambda$69$lambda$68(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function0 function0) {
        logTapEvent(eventLogger, ConciergeOnboardingViewState2.WelcomeVideo.INSTANCE, userInteractionEventDescriptor, UserInteractionEventData.Action.PLAY);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConciergeWelcomeVideoControls$lambda$74$lambda$71$lambda$70(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function0 function0) {
        logTapEvent(eventLogger, ConciergeOnboardingViewState2.WelcomeVideo.INSTANCE, userInteractionEventDescriptor, UserInteractionEventData.Action.SKIP);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConciergeWelcomeVideoControls$lambda$74$lambda$73$lambda$72(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function0 function0) {
        logTapEvent(eventLogger, ConciergeOnboardingViewState2.WelcomeVideo.INSTANCE, userInteractionEventDescriptor, UserInteractionEventData.Action.CONTINUE);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0485 A[LOOP:0: B:145:0x047f->B:147:0x0485, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0566  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void ConciergeHeroImageWithRows(final PaddingValues paddingValues, final Float f, final Painter painter, final String str, Modifier modifier, String str2, String str3, ImmutableList3<ConciergeRow> immutableList3, Composer composer, final int i, final int i2) {
        PaddingValues paddingValues2;
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        String str4;
        int i6;
        String str5;
        int i7;
        ImmutableList3<ConciergeRow> immutableList3PersistentListOf;
        String str6;
        String str7;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier modifier3;
        android.content.Context context;
        float f2;
        int i8;
        int i9;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        float f3;
        Modifier.Companion companion;
        int i10;
        String str8;
        String str9;
        final String str10;
        final String str11;
        final ImmutableList3<ConciergeRow> immutableList32;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2011801824);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            paddingValues2 = paddingValues;
        } else if ((i & 6) == 0) {
            paddingValues2 = paddingValues;
            i3 = (composerStartRestartGroup.changed(paddingValues2) ? 4 : 2) | i;
        } else {
            paddingValues2 = paddingValues;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(painter) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else {
                    if ((196608 & i) == 0) {
                        str4 = str2;
                        i3 |= composerStartRestartGroup.changed(str4) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 != 0) {
                        if ((1572864 & i) == 0) {
                            str5 = str3;
                            i3 |= composerStartRestartGroup.changed(str5) ? 1048576 : 524288;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                            immutableList3PersistentListOf = immutableList3;
                        } else {
                            immutableList3PersistentListOf = immutableList3;
                            if ((i & 12582912) == 0) {
                                i3 |= composerStartRestartGroup.changed(immutableList3PersistentListOf) ? 8388608 : 4194304;
                            }
                        }
                        if ((i3 & 4793491) == 4793490 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            immutableList32 = immutableList3PersistentListOf;
                            modifier4 = modifier2;
                            str11 = str4;
                            str10 = str5;
                        } else {
                            Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            str6 = i5 == 0 ? null : str4;
                            str7 = i6 == 0 ? null : str5;
                            if (i7 != 0) {
                                immutableList3PersistentListOf = extensions2.persistentListOf();
                            }
                            ImmutableList3<ConciergeRow> immutableList33 = immutableList3PersistentListOf;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2011801824, i3, -1, "com.robinhood.android.support.supporthub.ConciergeHeroImageWithRows (ConciergeOnboardingComposable.kt:1170)");
                            }
                            android.content.Context context2 = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            composerStartRestartGroup.startReplaceGroup(-606257358);
                            float fMo5013toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() & 4294967295L));
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null), 0.0f, paddingValues2.getTop(), 0.0f, 0.0f, 13, null);
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.useNode();
                            } else {
                                composerStartRestartGroup.createNode(constructor);
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(1082835779);
                            if (f != null) {
                                modifier3 = modifier5;
                                context = context2;
                                f2 = 0.0f;
                                i9 = i3;
                                i8 = 1;
                            } else {
                                float fFloatValue = f.floatValue();
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(TestTag3.testTag(Modifier.INSTANCE, "ProgressBar"), 0.0f, 1, null);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i11 = BentoTheme.$stable;
                                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, bentoTheme.getSpacing(composerStartRestartGroup, i11).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i11).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i11).m21592getMediumD9Ej5fM(), 0.0f, 8, null);
                                modifier3 = modifier5;
                                context = context2;
                                f2 = 0.0f;
                                i8 = 1;
                                i9 = i3;
                                BentoProgressBar2.m20698BentoProgressBarjB83MbM(fFloatValue, modifierM5146paddingqDBjuR0$default2, 0, 0L, 0L, false, composerStartRestartGroup, 0, 60);
                                composerStartRestartGroup = composerStartRestartGroup;
                                Unit unit = Unit.INSTANCE;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion4, f2, i8, null), 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, i8), false, null, false, 14, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.useNode();
                            } else {
                                composerStartRestartGroup.createNode(constructor2);
                            }
                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            composerStartRestartGroup.startReplaceGroup(-430523728);
                            if (painter == null) {
                                companion = companion4;
                                f3 = f2;
                                i10 = 0;
                                ImageKt.Image(painter, (String) null, SizeKt.m5158heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), f2, i8, null), f2, C2002Dp.m7995constructorimpl(fMo5013toDpu2uoSUM * 0.2f), i8, null), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composerStartRestartGroup, ((i9 >> 6) & 14) | 24624, 104);
                            } else {
                                f3 = f2;
                                companion = companion4;
                                i10 = 0;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i12 = BentoTheme.$stable;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme2.getSpacing(composerStartRestartGroup, i12).m21591getLargeD9Ej5fM()), composerStartRestartGroup, i10);
                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme2.getSpacing(composerStartRestartGroup, i12).m21592getMediumD9Ej5fM(), f3, 2, null), f3, i8, null);
                            TextAlign.Companion companion5 = TextAlign.INSTANCE;
                            int iM7919getCentere0LSkKk = companion5.m7919getCentere0LSkKk();
                            TextStyle displayCapsuleLarge = bentoTheme2.getTypography(composerStartRestartGroup, i12).getDisplayCapsuleLarge();
                            Font[] fontArr = new Font[i8];
                            fontArr[i10] = Font2.m7691FontYpTlLL0$default(C16915R.font.martina_regular, FontWeight.INSTANCE.getNormal(), 0, 0, 12, null);
                            Composer composer2 = composerStartRestartGroup;
                            Modifier.Companion companion6 = companion;
                            float f4 = f3;
                            final android.content.Context context3 = context;
                            int i13 = i9;
                            BentoText2.m20747BentoText38GnDrw(str, modifierFillMaxWidth$default2, null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(displayCapsuleLarge, 0L, 0L, null, null, null, FontFamily4.FontFamily(fontArr), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null), composer2, (i9 >> 9) & 14, 0, 8124);
                            composerStartRestartGroup = composer2;
                            composerStartRestartGroup.startReplaceGroup(-430489793);
                            if (str6 == null) {
                                String str12 = str6;
                                BentoText2.m20747BentoText38GnDrw(str12, SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion6, bentoTheme2.getSpacing(composerStartRestartGroup, i12).m21592getMediumD9Ej5fM(), f4, 2, null), f4, 1, null), null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i12).getTextM(), composerStartRestartGroup, (i13 >> 15) & 14, 0, 8124);
                                str8 = str12;
                                composerStartRestartGroup = composerStartRestartGroup;
                            } else {
                                str8 = str6;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, bentoTheme2.getSpacing(composerStartRestartGroup, i12).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceGroup(-430472415);
                            for (ConciergeRow conciergeRow : immutableList33) {
                                BentoValuePropRow3.BentoValuePropRow(conciergeRow.getPrimaryText(), conciergeRow.getSecondaryText(), new BentoValuePropRow2.Icon(conciergeRow.getLeadingIcon(), null, 2, null), BentoValuePropRow.Center, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, f4, 1, null), composerStartRestartGroup, (BentoValuePropRow2.Icon.$stable << 6) | 27648, 0);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.startReplaceGroup(1082922818);
                            if (str7 == null) {
                                Modifier.Companion companion7 = Modifier.INSTANCE;
                                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                int i14 = BentoTheme.$stable;
                                Modifier modifierAlign = column6.align(PaddingKt.m5144paddingVpY3zN4$default(companion7, bentoTheme3.getSpacing(composerStartRestartGroup, i14).m21592getMediumD9Ej5fM(), f4, 2, null), Alignment.INSTANCE.getCenterHorizontally());
                                Composer composer3 = composerStartRestartGroup;
                                MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme3.getTypography(composerStartRestartGroup, i14).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme3.getColors(composerStartRestartGroup, i14).m21427getFg30d7_KjU(), bentoTheme3.getColors(composerStartRestartGroup, i14).m21427getFg30d7_KjU(), false, composer3, BentoMarkdownText.$stable << 15, 16);
                                composerStartRestartGroup = composer3;
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                boolean zChangedInstance = composerStartRestartGroup.changedInstance(context3);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda19
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return ConciergeOnboardingComposableKt.ConciergeHeroImageWithRows$lambda$81$lambda$80$lambda$79(context3, (String) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                str9 = str7;
                                BentoMarkdownText2.BentoMarkdownText(str9, modifierAlign, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composerStartRestartGroup, ((i13 >> 18) & 14) | (MarkdownStyle.$stable << 6), 8);
                            } else {
                                str9 = str7;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str10 = str9;
                            str11 = str8;
                            immutableList32 = immutableList33;
                            modifier4 = modifier3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda20
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ConciergeOnboardingComposableKt.ConciergeHeroImageWithRows$lambda$82(paddingValues, f, painter, str, modifier4, str11, str10, immutableList32, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 1572864;
                    str5 = str3;
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    if ((i3 & 4793491) == 4793490) {
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        ImmutableList3<ConciergeRow> immutableList332 = immutableList3PersistentListOf;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        android.content.Context context22 = (android.content.Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        composerStartRestartGroup.startReplaceGroup(-606257358);
                        float fMo5013toDpu2uoSUM2 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (((WindowInfo) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalWindowInfo())).mo7449getContainerSizeYbymL2g() & 4294967295L));
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM5146paddingqDBjuR0$default3 = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null), 0.0f, paddingValues2.getTop(), 0.0f, 0.0f, 13, null);
                        Arrangement arrangement2 = Arrangement.INSTANCE;
                        Arrangement.Vertical top2 = arrangement2.getTop();
                        Alignment.Companion companion22 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default3);
                        ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion32.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            composerStartRestartGroup.startReplaceGroup(1082835779);
                            if (f != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier.Companion companion42 = Modifier.INSTANCE;
                            Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(Column5.weight$default(column62, SizeKt.fillMaxWidth$default(companion42, f2, i8, null), 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, i8), false, null, false, 14, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                            Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting()) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                                composerStartRestartGroup.startReplaceGroup(-430523728);
                                if (painter == null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                                int i122 = BentoTheme.$stable;
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme22.getSpacing(composerStartRestartGroup, i122).m21591getLargeD9Ej5fM()), composerStartRestartGroup, i10);
                                Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme22.getSpacing(composerStartRestartGroup, i122).m21592getMediumD9Ej5fM(), f3, 2, null), f3, i8, null);
                                TextAlign.Companion companion52 = TextAlign.INSTANCE;
                                int iM7919getCentere0LSkKk2 = companion52.m7919getCentere0LSkKk();
                                TextStyle displayCapsuleLarge2 = bentoTheme22.getTypography(composerStartRestartGroup, i122).getDisplayCapsuleLarge();
                                Font[] fontArr2 = new Font[i8];
                                fontArr2[i10] = Font2.m7691FontYpTlLL0$default(C16915R.font.martina_regular, FontWeight.INSTANCE.getNormal(), 0, 0, 12, null);
                                Composer composer22 = composerStartRestartGroup;
                                Modifier.Companion companion62 = companion;
                                float f42 = f3;
                                final android.content.Context context32 = context;
                                int i132 = i9;
                                BentoText2.m20747BentoText38GnDrw(str, modifierFillMaxWidth$default22, null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk2), 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(displayCapsuleLarge2, 0L, 0L, null, null, null, FontFamily4.FontFamily(fontArr2), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777183, null), composer22, (i9 >> 9) & 14, 0, 8124);
                                composerStartRestartGroup = composer22;
                                composerStartRestartGroup.startReplaceGroup(-430489793);
                                if (str6 == null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion62, bentoTheme22.getSpacing(composerStartRestartGroup, i122).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceGroup(-430472415);
                                while (r0.hasNext()) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.startReplaceGroup(1082922818);
                                if (str7 == null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                str10 = str9;
                                str11 = str8;
                                immutableList32 = immutableList332;
                                modifier4 = modifier3;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                str4 = str2;
                i6 = i2 & 64;
                if (i6 != 0) {
                }
                str5 = str3;
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            str4 = str2;
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            str5 = str3;
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        str4 = str2;
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        str5 = str3;
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConciergeHeroImageWithRows$lambda$81$lambda$80$lambda$79(android.content.Context context, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        WebUtils.viewUrl$default(context, url, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConciergeFeatureDedicatedAgent(final PaddingValues paddingValues, final Float f, Modifier modifier, Composer composer, final int i, final int i2) {
        PaddingValues paddingValues2;
        int i3;
        Float f2;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-111909637);
        int i4 = 2;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            paddingValues2 = paddingValues;
        } else if ((i & 6) == 0) {
            paddingValues2 = paddingValues;
            i3 = (composerStartRestartGroup.changed(paddingValues2) ? 4 : 2) | i;
        } else {
            paddingValues2 = paddingValues;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            f2 = f;
        } else {
            f2 = f;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
            }
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-111909637, i3, -1, "com.robinhood.android.support.supporthub.ConciergeFeatureDedicatedAgent (ConciergeOnboardingComposable.kt:1280)");
                }
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ConciergeSupportContext(ConciergeSupportContext.OnboardingScreen.PERKS_DEDICATED_EXPERT, null, i4, 0 == true ? 1 : 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -8388609, 16383, null), null, null, 55, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                Modifier modifier5 = modifier4;
                Painter painterPainterResource = PainterResources_androidKt.painterResource(C39996R.drawable.concierge_hub_dedicated_agent_hero_image, composerStartRestartGroup, 0);
                String strStringResource = StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_feature_dedicated_agent_title, composerStartRestartGroup, 0);
                String strStringResource2 = StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_feature_dedicated_agent_feature_1_primary, composerStartRestartGroup, 0);
                String strStringResource3 = StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_feature_dedicated_agent_feature_1_secondary, composerStartRestartGroup, 0);
                ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.SPARKLE_BULLET_24;
                ConciergeHeroImageWithRows(paddingValues2, f2, painterPainterResource, strStringResource, modifierAutoLogEvents$default, null, StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_feature_dedicated_agent_footer, composerStartRestartGroup, 0), extensions2.persistentListOf(new ConciergeRow(strStringResource2, strStringResource3, serverToBentoAssetMapper2), new ConciergeRow(StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_feature_dedicated_agent_feature_2_primary, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_feature_dedicated_agent_feature_2_secondary, composerStartRestartGroup, 0), serverToBentoAssetMapper2)), composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ConciergeOnboardingComposableKt.ConciergeFeatureDedicatedAgent$lambda$83(paddingValues, f, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ConciergeSupportContext(ConciergeSupportContext.OnboardingScreen.PERKS_DEDICATED_EXPERT, null, i4, 0 == true ? 1 : 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -8388609, 16383, null), null, null, 55, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            Modifier modifier52 = modifier4;
            Painter painterPainterResource2 = PainterResources_androidKt.painterResource(C39996R.drawable.concierge_hub_dedicated_agent_hero_image, composerStartRestartGroup, 0);
            String strStringResource4 = StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_feature_dedicated_agent_title, composerStartRestartGroup, 0);
            String strStringResource22 = StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_feature_dedicated_agent_feature_1_primary, composerStartRestartGroup, 0);
            String strStringResource32 = StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_feature_dedicated_agent_feature_1_secondary, composerStartRestartGroup, 0);
            ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = ServerToBentoAssetMapper2.SPARKLE_BULLET_24;
            ConciergeHeroImageWithRows(paddingValues2, f2, painterPainterResource2, strStringResource4, modifierAutoLogEvents$default2, null, StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_feature_dedicated_agent_footer, composerStartRestartGroup, 0), extensions2.persistentListOf(new ConciergeRow(strStringResource22, strStringResource32, serverToBentoAssetMapper22), new ConciergeRow(StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_feature_dedicated_agent_feature_2_primary, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_feature_dedicated_agent_feature_2_secondary, composerStartRestartGroup, 0), serverToBentoAssetMapper22)), composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 32);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConciergeFeatureSupport247(final PaddingValues paddingValues, final Float f, Modifier modifier, Composer composer, final int i, final int i2) {
        PaddingValues paddingValues2;
        int i3;
        Float f2;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1044547787);
        int i4 = 2;
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            paddingValues2 = paddingValues;
        } else if ((i & 6) == 0) {
            paddingValues2 = paddingValues;
            i3 = (composerStartRestartGroup.changed(paddingValues2) ? 4 : 2) | i;
        } else {
            paddingValues2 = paddingValues;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            f2 = f;
        } else {
            f2 = f;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
            }
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1044547787, i3, -1, "com.robinhood.android.support.supporthub.ConciergeFeatureSupport247 (ConciergeOnboardingComposable.kt:1319)");
                }
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ConciergeSupportContext(ConciergeSupportContext.OnboardingScreen.PERKS_PRIORITY_SUPPORT, null, i4, 0 == true ? 1 : 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -8388609, 16383, null), null, null, 55, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                Modifier modifier5 = modifier4;
                Painter painterPainterResource = PainterResources_androidKt.painterResource(C39996R.drawable.concierge_hub_support_247_hero_image, composerStartRestartGroup, 0);
                String strStringResource = StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_feature_247_title, composerStartRestartGroup, 0);
                String strStringResource2 = StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_feature_247_feature_1_primary, composerStartRestartGroup, 0);
                String strStringResource3 = StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_feature_247_feature_1_secondary, composerStartRestartGroup, 0);
                ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.SPARKLE_BULLET_24;
                ConciergeHeroImageWithRows(paddingValues2, f2, painterPainterResource, strStringResource, modifierAutoLogEvents$default, null, StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_feature_247_footer, composerStartRestartGroup, 0), extensions2.persistentListOf(new ConciergeRow(strStringResource2, strStringResource3, serverToBentoAssetMapper2), new ConciergeRow(StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_feature_247_feature_2_primary, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_feature_247_feature_2_secondary, composerStartRestartGroup, 0), serverToBentoAssetMapper2)), composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ConciergeOnboardingComposableKt.ConciergeFeatureSupport247$lambda$84(paddingValues, f, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ConciergeSupportContext(ConciergeSupportContext.OnboardingScreen.PERKS_PRIORITY_SUPPORT, null, i4, 0 == true ? 1 : 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -8388609, 16383, null), null, null, 55, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            Modifier modifier52 = modifier4;
            Painter painterPainterResource2 = PainterResources_androidKt.painterResource(C39996R.drawable.concierge_hub_support_247_hero_image, composerStartRestartGroup, 0);
            String strStringResource4 = StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_feature_247_title, composerStartRestartGroup, 0);
            String strStringResource22 = StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_feature_247_feature_1_primary, composerStartRestartGroup, 0);
            String strStringResource32 = StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_feature_247_feature_1_secondary, composerStartRestartGroup, 0);
            ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = ServerToBentoAssetMapper2.SPARKLE_BULLET_24;
            ConciergeHeroImageWithRows(paddingValues2, f2, painterPainterResource2, strStringResource4, modifierAutoLogEvents$default2, null, StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_feature_247_footer, composerStartRestartGroup, 0), extensions2.persistentListOf(new ConciergeRow(strStringResource22, strStringResource32, serverToBentoAssetMapper22), new ConciergeRow(StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_feature_247_feature_2_primary, composerStartRestartGroup, 0), StringResources_androidKt.stringResource(C39996R.string.concierge_onboarding_feature_247_feature_2_secondary, composerStartRestartGroup, 0), serverToBentoAssetMapper22)), composerStartRestartGroup, i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 32);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ConciergeSupportContext.OnboardingScreen mapToLogOnboardingScreen(ConciergeOnboardingViewState2 conciergeOnboardingViewState2) {
        if (Intrinsics.areEqual(conciergeOnboardingViewState2, ConciergeOnboardingViewState2.Welcome.INSTANCE)) {
            return ConciergeSupportContext.OnboardingScreen.LANDING;
        }
        if (Intrinsics.areEqual(conciergeOnboardingViewState2, ConciergeOnboardingViewState2.WelcomeVideo.INSTANCE)) {
            return ConciergeSupportContext.OnboardingScreen.VIDEO;
        }
        if (Intrinsics.areEqual(conciergeOnboardingViewState2, ConciergeOnboardingViewState2.PerksDedicatedExpert.INSTANCE)) {
            return ConciergeSupportContext.OnboardingScreen.PERKS_DEDICATED_EXPERT;
        }
        if (Intrinsics.areEqual(conciergeOnboardingViewState2, ConciergeOnboardingViewState2.PerksPrioritySupport.INSTANCE)) {
            return ConciergeSupportContext.OnboardingScreen.PERKS_PRIORITY_SUPPORT;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier autoLogCtaEvents(Modifier modifier, final UserInteractionEventData.Action action, final ConciergeSupportContext.OnboardingScreen onboardingScreen) {
        return ComposedModifier2.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.robinhood.android.support.supporthub.ConciergeOnboardingComposableKt.autoLogCtaEvents.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final Modifier invoke(Modifier composed, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceGroup(891990353);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(891990353, i, -1, "com.robinhood.android.support.supporthub.autoLogCtaEvents.<anonymous> (ConciergeOnboardingComposable.kt:1366)");
                }
                if (onboardingScreen == null) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceGroup();
                    return composed;
                }
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Component component = new Component(Component.ComponentType.BUTTON, null, null, 6, null);
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                Context.ProductTag productTag = null;
                int i5 = 0;
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
                CryptoOrderContext cryptoOrderContext = null;
                NcwTransferContext ncwTransferContext = null;
                NotificationContext notificationContext = null;
                NcwMultichainTokenContext ncwMultichainTokenContext = null;
                RetirementContext retirementContext = null;
                PostTransferActionContext postTransferActionContext = null;
                BuyingPowerRowContext buyingPowerRowContext = null;
                StepUpVerificationContext stepUpVerificationContext = null;
                GoldUpgradeContext goldUpgradeContext = null;
                OptionOrderDetailContext optionOrderDetailContext = null;
                OptionOrderDetailLegContext optionOrderDetailLegContext = null;
                PendingOptionOrderContext pendingOptionOrderContext = null;
                CryptoQuickTradeButtonContext cryptoQuickTradeButtonContext = null;
                EquityScreenerContext equityScreenerContext = null;
                AcatsInContext acatsInContext = null;
                CatpayOrderContext catpayOrderContext = null;
                SearchEquityScreenerContext searchEquityScreenerContext = null;
                P2PContext p2PContext = null;
                RetirementFundingMethodsContext retirementFundingMethodsContext = null;
                ReturnsComparisonContext returnsComparisonContext = null;
                AccountType accountType = null;
                MarginHealthState marginHealthState = null;
                BuyingPowerHubContext buyingPowerHubContext = null;
                UpsellBannerContext upsellBannerContext = null;
                ReferralEntryPointContext referralEntryPointContext = null;
                OnboardingWelcomeTakeoverScreenContext onboardingWelcomeTakeoverScreenContext = null;
                ReferralInviteContext referralInviteContext = null;
                WiresContext wiresContext = null;
                PortfolioSharingContext portfolioSharingContext = null;
                PatternDayTradingContext patternDayTradingContext = null;
                DayTradeCardContext dayTradeCardContext = null;
                OptionsChainCustomizationContext optionsChainCustomizationContext = null;
                DappBrowserContext dappBrowserContext = null;
                DayTradeCounterGraphicContext dayTradeCounterGraphicContext = null;
                PositionsInstrumentType positionsInstrumentType = null;
                PositionsSortOptionsContext positionsSortOptionsContext = null;
                FXRate fXRate = null;
                TransferErrorContext transferErrorContext = null;
                PortfolioAccountContext portfolioAccountContext = null;
                OptionSimulatedReturnsContext optionSimulatedReturnsContext = null;
                CountryGatingContext countryGatingContext = null;
                InstantUpsellContext instantUpsellContext = null;
                GDPRConsentManagementContext gDPRConsentManagementContext = null;
                NCWTokenVisibilityContext nCWTokenVisibilityContext = null;
                OptionOrderBidAskBarContext optionOrderBidAskBarContext = null;
                GoldDefaultOptInContext goldDefaultOptInContext = null;
                GoldUpgradeType goldUpgradeType = null;
                CryptoTransferLimitContext cryptoTransferLimitContext = null;
                MarginTieredRatesContext marginTieredRatesContext = null;
                ResumeApplicationTakeoverContext resumeApplicationTakeoverContext = null;
                CryptoStakingContext cryptoStakingContext = null;
                OptionsCancelNewContext optionsCancelNewContext = null;
                LogoutContext logoutContext = null;
                PostTransferUpsellContext postTransferUpsellContext = null;
                MicrogramInstallContext microgramInstallContext = null;
                PostSignupOnboardingContext postSignupOnboardingContext = null;
                FuturesOrderContext futuresOrderContext = null;
                FuturesContractContext futuresContractContext = null;
                FuturesTradeBarContext futuresTradeBarContext = null;
                OptionOnboardingContext optionOnboardingContext = null;
                OptionOnboardingActionContext optionOnboardingActionContext = null;
                OptionOnboardingErrorContext optionOnboardingErrorContext = null;
                DashboardWidgetContext dashboardWidgetContext = null;
                SlipOnboardingCheckboxContext slipOnboardingCheckboxContext = null;
                FuturesOrderButtonContext futuresOrderButtonContext = null;
                FuturesLadderContext futuresLadderContext = null;
                LoadingOverlaySpinnerContext loadingOverlaySpinnerContext = null;
                EarningsCallContext earningsCallContext = null;
                InternalAssetTransferContext internalAssetTransferContext = null;
                DeepLinkContext deepLinkContext = null;
                AdvisoryFutureReturnsGraphContext advisoryFutureReturnsGraphContext = null;
                AdvisoryFutureReturnScrubBarContext advisoryFutureReturnScrubBarContext = null;
                SupportAppointmentSettingContext supportAppointmentSettingContext = null;
                EventContractOrderContext eventContractOrderContext = null;
                FuturesPositionContext futuresPositionContext = null;
                FuturesAccountStatusContext futuresAccountStatusContext = null;
                MarginMaintenanceTableRowContext marginMaintenanceTableRowContext = null;
                BreakingNewsContext breakingNewsContext = null;
                AdvisoryFundingMethodContext advisoryFundingMethodContext = null;
                CryptoPostTradeFeeTierStatusContext cryptoPostTradeFeeTierStatusContext = null;
                PerpetualsOrderContext perpetualsOrderContext = null;
                PerpetualPositionContext perpetualPositionContext = null;
                PerpetualContractContext perpetualContractContext = null;
                PrismContext prismContext = null;
                CryptoPostTradeFeeTierUpgradedContext cryptoPostTradeFeeTierUpgradedContext = null;
                LegendAdvancedChartsContext legendAdvancedChartsContext = null;
                EventContractHubCardContext eventContractHubCardContext = null;
                ComboOrderDetailContext comboOrderDetailContext = null;
                CryptoFeeTierStatusContext cryptoFeeTierStatusContext = null;
                CortexDigestContext cortexDigestContext = null;
                CortexDigestOnboardingContext cortexDigestOnboardingContext = null;
                EventContractsPositionContext eventContractsPositionContext = null;
                EquitiesLadderContext equitiesLadderContext = null;
                MarginCallMarketOrderDataMismatch marginCallMarketOrderDataMismatch = null;
                ConciergePlusSupportContext conciergePlusSupportContext = null;
                CortexPortfolioDigestContext cortexPortfolioDigestContext = null;
                SocialTradingContext socialTradingContext = null;
                ByteString byteString = null;
                int i6 = -1;
                int i7 = -1;
                int i8 = -1;
                int i9 = -1;
                int i10 = -1;
                int i11 = -8388609;
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(composed, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, new com.robinhood.rosetta.eventlogging.Context(i2, i3, i4, str, str2, str3, str4, productTag, i5, str5, str6, str7, screen, str8, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str9, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str10, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, new ConciergeSupportContext(onboardingScreen, null, 2, 0 == true ? 1 : 0), marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString, i6, i7, i8, i9, i10, i11, 16383, null), component, null, 35, null), false, false, false, true, false, null, 108, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifierAutoLogEvents$default;
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void logTapEvent(EventLogger eventLogger, ConciergeOnboardingViewState2 conciergeOnboardingViewState2, UserInteractionEventDescriptor userInteractionEventDescriptor, UserInteractionEventData.Action action) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new ConciergeSupportContext(mapToLogOnboardingScreen(conciergeOnboardingViewState2), null, 2, 0 == true ? 1 : 0), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -1, -8388609, 16383, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 35, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
    }
}
