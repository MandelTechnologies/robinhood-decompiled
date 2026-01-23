package com.robinhood.android.rhyrewards.p246ui;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.IntrinsicMeasureScope;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.res.PrimitiveResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.compose.ConstrainScope;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope4;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintScopeCommon5;
import androidx.constraintlayout.compose.ConstraintScopeCommon6;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.constraintlayout.compose.ToolingUtils2;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.button.RdsButtonBarView;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.history.p153ui.MerchantRewardDetailComposable;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiIcon2;
import com.robinhood.android.navigation.DeepLinkOrigin;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.android.rhyonboarding.contracts.RhyUpgradeKey;
import com.robinhood.android.rhyrewards.C27650R;
import com.robinhood.android.rhyrewards.databinding.FragmentMerchantrewardsOfferDetailsBottomSheetBinding;
import com.robinhood.android.rhyrewards.p246ui.MerchantRewardsOfferDetailsBottomSheet;
import com.robinhood.android.rhyrewards.p246ui.MerchantRewardsOfferDetailsViewState;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.android.util.extensions.IconExtensions;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.text.AutoSizeText;
import com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.models.api.pluto.ApiMerchantOfferV2;
import com.robinhood.models.p320db.mcduckling.MerchantOfferBanner;
import com.robinhood.models.p320db.mcduckling.MerchantOfferV2;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
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
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.HttpUrl;
import okio.ByteString;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: MerchantRewardsOfferDetailsBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u0094\u00012\u00020\u00012\u00020\u0002:\u0006\u0095\u0001\u0096\u0001\u0094\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tJ!\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010&\u001a\u00020\u00072\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0#H\u0003¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00072\u0006\u0010(\u001a\u00020$H\u0003¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u00072\u0006\u0010,\u001a\u00020/H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\u00072\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00072\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\b6\u00107J\u001f\u0010;\u001a\u00020\u00072\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u000208H\u0003¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00072\u0006\u00103\u001a\u000202H\u0003¢\u0006\u0004\b=\u00107J\u0017\u0010?\u001a\u00020\u00072\u0006\u00103\u001a\u00020>H\u0003¢\u0006\u0004\b?\u0010@J\u0017\u0010?\u001a\u00020\u00072\u0006\u00103\u001a\u00020AH\u0003¢\u0006\u0004\b?\u0010BJ#\u0010F\u001a\u00020\u0007*\u00020C2\u0006\u00109\u001a\u0002082\u0006\u0010E\u001a\u00020DH\u0003¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\u00072\u0006\u0010I\u001a\u00020HH\u0002¢\u0006\u0004\bJ\u0010KJ%\u0010O\u001a\u00020\u00072\u0006\u0010M\u001a\u00020L2\f\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0002¢\u0006\u0004\bO\u0010PJ\u0017\u0010S\u001a\u00020\u00072\u0006\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bS\u0010TJ!\u0010X\u001a\u00020\u00072\u0006\u0010M\u001a\u00020U2\b\u0010W\u001a\u0004\u0018\u00010VH\u0016¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u0007H\u0016¢\u0006\u0004\bZ\u0010\u0004J\u0010\u0010\\\u001a\u00020[H\u0096\u0001¢\u0006\u0004\b\\\u0010]R\"\u0010_\u001a\u00020^8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010f\u001a\u00020e8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u001a\u0010l\u001a\u00020[8\u0016X\u0096D¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010]R\u001a\u0010o\u001a\u00020[8\u0016X\u0096D¢\u0006\f\n\u0004\bo\u0010m\u001a\u0004\bp\u0010]R\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u001b\u0010y\u001a\u00020t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010xR\u001b\u0010\u007f\u001a\u00020z8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R \u0010\u0084\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u0081\u0001\u0010v\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R)\u0010\u0088\u0001\u001a\u0014\u0012\u000f\u0012\r \u0087\u0001*\u0005\u0018\u00010\u0086\u00010\u0086\u00010\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001d\u0010\u008e\u0001\u001a\b0\u008a\u0001j\u0003`\u008b\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001f\u0010\u0093\u0001\u001a\n\u0012\u0005\u0012\u00030\u0090\u00010\u008f\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001¨\u0006\u009a\u0001²\u0006\u0010\u0010\u0098\u0001\u001a\u00030\u0097\u00018\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0099\u0001\u001a\u00030\u0097\u00018\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0098\u0001\u001a\u00030\u0097\u00018\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsBottomSheet;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsViewState;", "state", "", "bind", "(Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsViewState;)V", "bindDefaultButtons", "Lcom/robinhood/models/api/pluto/ApiMerchantOfferV2$Button$Action;", "action", "Lkotlin/Function0;", "handleButtonAction", "(Lcom/robinhood/models/api/pluto/ApiMerchantOfferV2$Button$Action;)Lkotlin/jvm/functions/Function0;", "Lcom/robinhood/models/api/pluto/ApiMerchantOfferV2$Button$Action$Predefined;", "Lkotlin/reflect/KFunction0;", "handlePredefinedActions", "(Lcom/robinhood/models/api/pluto/ApiMerchantOfferV2$Button$Action$Predefined;)Lkotlin/reflect/KFunction;", "bindShowAllOffersButton", "Lcom/robinhood/models/api/pluto/ApiMerchantOfferV2$Status;", "status", "bindStatus", "(Lcom/robinhood/models/api/pluto/ApiMerchantOfferV2$Status;)V", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2$DetailAsset$ProgressBar;", "progressBar", "bindProgressBar", "(Lcom/robinhood/models/db/mcduckling/MerchantOfferV2$DetailAsset$ProgressBar;)V", "MerchantRewardsOfferProgressBar", "(Lcom/robinhood/models/db/mcduckling/MerchantOfferV2$DetailAsset$ProgressBar;Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "merchantOffer", "bindDetails", "(Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;)V", "", "Lcom/robinhood/models/api/pluto/ApiMerchantOfferV2$OfferDetail;", ErrorBundle.DETAIL_ENTRY, "MerchantRewardsOfferDetailList", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", ErrorResponse.DETAIL, "MerchantRewardsOfferDetail", "(Lcom/robinhood/models/api/pluto/ApiMerchantOfferV2$OfferDetail;Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2$DetailAsset$Image;", "detailAsset", "bindImage", "(Lcom/robinhood/models/db/mcduckling/MerchantOfferV2$DetailAsset$Image;)V", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2$DetailAsset;", "bindDetailAsset", "(Lcom/robinhood/models/db/mcduckling/MerchantOfferV2$DetailAsset;)V", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2$DetailAsset$GaugeV2;", "gauge", "bindGaugeAsset", "(Lcom/robinhood/models/db/mcduckling/MerchantOfferV2$DetailAsset$GaugeV2;)V", "MerchantRewardsOfferDetailGauge", "(Lcom/robinhood/models/db/mcduckling/MerchantOfferV2$DetailAsset$GaugeV2;Landroidx/compose/runtime/Composer;I)V", "", "mainText", "labelText", "MerchantRewardsOfferDetailProgressBarLabel", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "MerchantRewardsOfferDetailGaugeInnerContent", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2$DetailAsset$GaugeV2$GaugeMoney;", "MerchantRewardsOfferDetailGaugeInnerContentMainValue", "(Lcom/robinhood/models/db/mcduckling/MerchantOfferV2$DetailAsset$GaugeV2$GaugeMoney;Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2$DetailAsset$GaugeV2$GaugePercent;", "(Lcom/robinhood/models/db/mcduckling/MerchantOfferV2$DetailAsset$GaugeV2$GaugePercent;Landroidx/compose/runtime/Composer;I)V", "Landroidx/constraintlayout/compose/ConstraintLayoutScope;", "Landroidx/constraintlayout/compose/ConstrainedLayoutReference;", "constraintRef", "MerchantRewardsOfferDetailGaugeInnerContentMainText", "(Landroidx/constraintlayout/compose/ConstraintLayoutScope;Ljava/lang/String;Landroidx/constraintlayout/compose/ConstrainedLayoutReference;Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/models/db/mcduckling/MerchantOfferBanner;", MerchantRewardDetailComposable.BANNER_TEST_TAG, "bindBanner", "(Lcom/robinhood/models/db/mcduckling/MerchantOfferBanner;)V", "Landroidx/compose/ui/platform/ComposeView;", "view", "composable", "bindComposableWithTheme", "(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/view/View;", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStop", "", "onDismissUnsupportedFeatureDialog", "()Z", "Lcom/robinhood/android/rhimage/ImageLoader;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "excludeFromSourceLogging", "Z", "getExcludeFromSourceLogging", "excludeFromAnalyticsLogging", "getExcludeFromAnalyticsLogging", "Lcom/robinhood/rosetta/eventlogging/Component;", "loggingComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", "Lcom/robinhood/android/rhyrewards/databinding/FragmentMerchantrewardsOfferDetailsBottomSheetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBinding", "()Lcom/robinhood/android/rhyrewards/databinding/FragmentMerchantrewardsOfferDetailsBottomSheetBinding;", "binding", "Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "getDuxo", "()Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsDuxo;", "duxo", "Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsBottomSheet$Callbacks;", "callbacks$delegate", "getCallbacks", "()Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsBottomSheet$Callbacks;", "callbacks", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "transferLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "requiresRegionGates", "Companion", "Callbacks", "Args", "", "completedSteps", "pendingSteps", "feature-lib-rhy-rewards_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class MerchantRewardsOfferDetailsBottomSheet extends BaseBottomSheetDialogFragment implements RegionGated {
    public static final String GAS_GROCERIES_OFFER = "644afb3d-46bb-49a5-9bd4-472320a225f8";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final boolean excludeFromAnalyticsLogging;
    private final boolean excludeFromSourceLogging;
    public ImageLoader imageLoader;
    private final Component loggingComponent;
    private final ActivityResultLauncher<Intent> transferLauncher;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MerchantRewardsOfferDetailsBottomSheet.class, "binding", "getBinding()Lcom/robinhood/android/rhyrewards/databinding/FragmentMerchantrewardsOfferDetailsBottomSheetBinding;", 0)), Reflection.property1(new PropertyReference1Impl(MerchantRewardsOfferDetailsBottomSheet.class, "callbacks", "getCallbacks()Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsBottomSheet$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MerchantRewardsOfferDetailsBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsBottomSheet$Callbacks;", "", "onRadTaskCompleted", "", "offer", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "feature-lib-rhy-rewards_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onRadTaskCompleted(MerchantOfferV2 offer);
    }

    /* compiled from: MerchantRewardsOfferDetailsBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MerchantRewardsOfferDetailsViewState.OfferDetailType.values().length];
            try {
                iArr[MerchantRewardsOfferDetailsViewState.OfferDetailType.SPECIAL_SPEND_OFFER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MerchantRewardsOfferDetailsViewState.OfferDetailType.P2P_ONLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MerchantRewardsOfferDetailsViewState.OfferDetailType.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiMerchantOfferV2.Button.PredefinedActionType.values().length];
            try {
                iArr2[ApiMerchantOfferV2.Button.PredefinedActionType.DISMISS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MerchantRewardsOfferDetail$lambda$34(MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet, ApiMerchantOfferV2.OfferDetail offerDetail, int i, Composer composer, int i2) {
        merchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetail(offerDetail, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MerchantRewardsOfferDetailGauge$lambda$43(MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet, MerchantOfferV2.DetailAsset.GaugeV2 gaugeV2, int i, Composer composer, int i2) {
        merchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetailGauge(gaugeV2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MerchantRewardsOfferDetailGaugeInnerContent$lambda$49(MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet, MerchantOfferV2.DetailAsset.GaugeV2 gaugeV2, int i, Composer composer, int i2) {
        merchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetailGaugeInnerContent(gaugeV2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MerchantRewardsOfferDetailGaugeInnerContentMainText$lambda$58(MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet, ConstraintLayoutScope constraintLayoutScope, String str, ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, int i, Composer composer, int i2) {
        merchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetailGaugeInnerContentMainText(constraintLayoutScope, str, constraintLayoutBaseScope4, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MerchantRewardsOfferDetailGaugeInnerContentMainValue$lambda$52(MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet, MerchantOfferV2.DetailAsset.GaugeV2.GaugeMoney gaugeMoney, int i, Composer composer, int i2) {
        merchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetailGaugeInnerContentMainValue(gaugeMoney, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MerchantRewardsOfferDetailGaugeInnerContentMainValue$lambda$55(MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet, MerchantOfferV2.DetailAsset.GaugeV2.GaugePercent gaugePercent, int i, Composer composer, int i2) {
        merchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetailGaugeInnerContentMainValue(gaugePercent, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MerchantRewardsOfferDetailList$lambda$31(MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet, List list, int i, Composer composer, int i2) {
        merchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetailList(list, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MerchantRewardsOfferDetailProgressBarLabel$lambda$47(MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet, String str, String str2, int i, Composer composer, int i2) {
        merchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetailProgressBarLabel(str, str2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MerchantRewardsOfferProgressBar$lambda$28(MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet, MerchantOfferV2.DetailAsset.ProgressBar progressBar, int i, Composer composer, int i2) {
        merchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferProgressBar(progressBar, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    public MerchantRewardsOfferDetailsBottomSheet() {
        super(C27650R.layout.fragment_merchantrewards_offer_details_bottom_sheet);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.excludeFromSourceLogging = true;
        this.excludeFromAnalyticsLogging = true;
        this.loggingComponent = new Component(Component.ComponentType.MERCHANT_REWARD_OFFER_DETAIL, null, null, 6, null);
        this.binding = ViewBinding5.viewBinding(this, MerchantRewardsOfferDetailsBottomSheet7.INSTANCE);
        this.duxo = DuxosKt.duxo(this, MerchantRewardsOfferDetailsDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$transferLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.this$0.getCallbacks().onRadTaskCompleted(((MerchantRewardsOfferDetailsBottomSheet.Args) MerchantRewardsOfferDetailsBottomSheet.INSTANCE.getArgs((Fragment) this.this$0)).getMerchantOffer());
                this.this$0.dismiss();
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.transferLauncher = activityResultLauncherRegisterForActivityResult;
        setSkipCollapsed(true);
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
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

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromSourceLogging() {
        return this.excludeFromSourceLogging;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return this.excludeFromAnalyticsLogging;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Context getLoggingContext() {
        RHYContext rHYContext = new RHYContext(RHYContext.ProductArea.REWARDS, "merchant_rewards_general", "unknown", null, null, null, 56, null);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        String str = null;
        int i4 = 0;
        String str2 = null;
        String str3 = null;
        Screen screen = null;
        String str4 = null;
        Asset asset = null;
        com.robinhood.rosetta.eventlogging.List list = null;
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
        String str5 = null;
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
        String str6 = null;
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
        ConciergeSupportContext conciergeSupportContext = null;
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
        int i5 = -1025;
        int i6 = -1;
        int i7 = -2049;
        int i8 = -1;
        int i9 = -1;
        int i10 = -1;
        Object[] objArr = 0 == true ? 1 : 0;
        return new Context(i, i2, i3, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, str, objArr, i4, str2, String.valueOf(((Args) INSTANCE.getArgs((Fragment) this)).getMerchantOffer().getId()), str3, screen, str4, asset, list, newsFeedItem, feedback, cXIssue, inAppSurvey, listsContext, directDepositContext, directDepositSwitcherContext, recurringContext, orderKind, inAppComm, learningLesson, learningSection, learningMatchingExercise, learningAnswer, learningMatchingExerciseEntity, learningMatchingExerciseBucket, safetyLabelInfoTag, safetyLabelLesson, str5, educationTour, educationTourSection, educationTourOutroTooltip, educationTourOutro, educationSeries, educationHome, fundingContext, uRLComponents, article, transactionDisputeContext, networkContext, plaidEventData, iAVContext, transferContext, mAXTransferContext, mAXTransferAccountSelectionContext, queuedDepositContext, rewardContext, searchResultItem, optionsContext, optionStrategyContext, optionWatchlistAboutContext, disclosureDropdown, graphContext, etpCompositionContext, loginContext, orderSummaryNbbo, agreementContext, ipoAccessListVideoContext, recommendationsContext, ipoAccessInstrumentContext, ipoaAllocationCylinderContext, ipoaParticipationGraphContext, ipoaPostCobFollowUpContext, voiceRecordContext, cXInquiryContext, instantDeposit, cryptoTransferContext, cryptoGiftContext, shareholderQAContext, rHYContext, challengeContext, sLIPContext, sLIPHubStockRowContext, paymentLinkingContext, advancedChartsContext, paycheckSectionContext, basket, investFlowContext, marginUpgradeContext, alertContext, technicalIndicatorContext, dcfKycContext, valueSelectorContext, advancedChartsAboutContext, goldContext, recsRetirementContext, investorProfileQuestionnaireContext, equityOrderContext, keychainLoginContext, passkeyEnrollmentContext, cryptoAssetContext, cryptoTransactionContext, cryptoTokenApprovalContext, ncwOnboardingContext, ncwFundingContext, dappRequestContext, str6, performanceChartContext, brokerageAccountContext, brokerageAccountSwitcherContext, optionsEligibilityContext, cryptoOrderContext, ncwTransferContext, notificationContext, ncwMultichainTokenContext, retirementContext, postTransferActionContext, buyingPowerRowContext, stepUpVerificationContext, goldUpgradeContext, optionOrderDetailContext, optionOrderDetailLegContext, pendingOptionOrderContext, cryptoQuickTradeButtonContext, equityScreenerContext, acatsInContext, catpayOrderContext, searchEquityScreenerContext, p2PContext, retirementFundingMethodsContext, returnsComparisonContext, accountType, marginHealthState, buyingPowerHubContext, upsellBannerContext, referralEntryPointContext, onboardingWelcomeTakeoverScreenContext, referralInviteContext, wiresContext, portfolioSharingContext, patternDayTradingContext, dayTradeCardContext, optionsChainCustomizationContext, dappBrowserContext, dayTradeCounterGraphicContext, positionsInstrumentType, positionsSortOptionsContext, fXRate, transferErrorContext, portfolioAccountContext, optionSimulatedReturnsContext, countryGatingContext, instantUpsellContext, gDPRConsentManagementContext, nCWTokenVisibilityContext, optionOrderBidAskBarContext, goldDefaultOptInContext, goldUpgradeType, cryptoTransferLimitContext, marginTieredRatesContext, resumeApplicationTakeoverContext, cryptoStakingContext, optionsCancelNewContext, logoutContext, postTransferUpsellContext, microgramInstallContext, postSignupOnboardingContext, futuresOrderContext, futuresContractContext, futuresTradeBarContext, optionOnboardingContext, optionOnboardingActionContext, optionOnboardingErrorContext, dashboardWidgetContext, slipOnboardingCheckboxContext, futuresOrderButtonContext, futuresLadderContext, loadingOverlaySpinnerContext, earningsCallContext, internalAssetTransferContext, deepLinkContext, advisoryFutureReturnsGraphContext, advisoryFutureReturnScrubBarContext, supportAppointmentSettingContext, eventContractOrderContext, futuresPositionContext, futuresAccountStatusContext, conciergeSupportContext, marginMaintenanceTableRowContext, breakingNewsContext, advisoryFundingMethodContext, cryptoPostTradeFeeTierStatusContext, perpetualsOrderContext, perpetualPositionContext, perpetualContractContext, prismContext, cryptoPostTradeFeeTierUpgradedContext, legendAdvancedChartsContext, eventContractHubCardContext, comboOrderDetailContext, cryptoFeeTierStatusContext, cortexDigestContext, cortexDigestOnboardingContext, eventContractsPositionContext, equitiesLadderContext, marginCallMarketOrderDataMismatch, conciergePlusSupportContext, cortexPortfolioDigestContext, socialTradingContext, byteString, i5, i6, i7, i8, i9, i10, 16383, null);
    }

    private final FragmentMerchantrewardsOfferDetailsBottomSheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentMerchantrewardsOfferDetailsBottomSheetBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MerchantRewardsOfferDetailsDuxo getDuxo() {
        return (MerchantRewardsOfferDetailsDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, null, this.loggingComponent, null, getLoggingContext(), 11, null);
        BaseDialogFragment.collectDuxoState$default(this, null, new C276871(null), 1, null);
    }

    /* compiled from: MerchantRewardsOfferDetailsBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$onViewCreated$1", m3645f = "MerchantRewardsOfferDetailsBottomSheet.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$onViewCreated$1 */
    static final class C276871 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C276871(Continuation<? super C276871> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MerchantRewardsOfferDetailsBottomSheet.this.new C276871(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C276871) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MerchantRewardsOfferDetailsBottomSheet.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ MerchantRewardsOfferDetailsBottomSheet $tmp0;

            AnonymousClass1(MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet) {
                this.$tmp0 = merchantRewardsOfferDetailsBottomSheet;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, MerchantRewardsOfferDetailsBottomSheet.class, "bind", "bind(Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(MerchantRewardsOfferDetailsViewState merchantRewardsOfferDetailsViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$bind = C276871.invokeSuspend$bind(this.$tmp0, merchantRewardsOfferDetailsViewState, continuation);
                return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((MerchantRewardsOfferDetailsViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<MerchantRewardsOfferDetailsViewState> stateFlow = MerchantRewardsOfferDetailsBottomSheet.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MerchantRewardsOfferDetailsBottomSheet.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$bind(MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet, MerchantRewardsOfferDetailsViewState merchantRewardsOfferDetailsViewState, Continuation continuation) {
            merchantRewardsOfferDetailsBottomSheet.bind(merchantRewardsOfferDetailsViewState);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        EventLogger.DefaultImpls.logDisappear$default(getEventLogger(), null, null, this.loggingComponent, null, getLoggingContext(), 11, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final MerchantRewardsOfferDetailsViewState state) {
        bindDetailAsset(state.getMerchantOffer().getDetailAsset());
        getBinding().merchantrewardsOfferDetailsLogo.setClipToOutline(true);
        RhTextView merchantrewardsOfferDetailsName = getBinding().merchantrewardsOfferDetailsName;
        Intrinsics.checkNotNullExpressionValue(merchantrewardsOfferDetailsName, "merchantrewardsOfferDetailsName");
        TextViewsKt.setVisibilityText(merchantrewardsOfferDetailsName, state.getMerchantOffer().getMerchantName());
        getBinding().merchantrewardsOfferDetailsTitle.setText(state.getMerchantOffer().getOfferDescription());
        bindDetails(state.getMerchantOffer());
        RhTextView merchantrewardsOfferDetailsTerms = getBinding().merchantrewardsOfferDetailsTerms;
        Intrinsics.checkNotNullExpressionValue(merchantrewardsOfferDetailsTerms, "merchantrewardsOfferDetailsTerms");
        OnClickListeners.onClick(merchantrewardsOfferDetailsTerms, new Function0() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MerchantRewardsOfferDetailsBottomSheet.bind$lambda$1(this.f$0, state);
            }
        });
        int i = WhenMappings.$EnumSwitchMapping$0[state.getOfferDetailType().ordinal()];
        if (i == 1) {
            if (state.getBanner() != null) {
                bindBanner(state.getBanner());
            } else {
                ApiMerchantOfferV2.Status status = state.getMerchantOffer().getStatus();
                if (status != null) {
                    bindStatus(status);
                }
            }
            RdsButtonBarView rdsButtonBarView = getBinding().merchantrewardsOfferDetailsButtonBar;
            ApiMerchantOfferV2.Button primaryButton = state.getMerchantOffer().getPrimaryButton();
            rdsButtonBarView.setPrimaryButtonText(primaryButton != null ? primaryButton.getText() : null);
            rdsButtonBarView.setPrimaryButtonIcon(ContextCompat.getDrawable(requireContext(), ServerToBentoAssetMapper2.LOCK_16.getResourceId()));
            ApiMerchantOfferV2.Button primaryButton2 = state.getMerchantOffer().getPrimaryButton();
            ApiMerchantOfferV2.Button.Action action = primaryButton2 != null ? primaryButton2.getAction() : null;
            final ApiMerchantOfferV2.Button.Action.Deeplink deeplink = action instanceof ApiMerchantOfferV2.Button.Action.Deeplink ? (ApiMerchantOfferV2.Button.Action.Deeplink) action : null;
            if (deeplink != null) {
                rdsButtonBarView.onPrimaryButtonClick(new Function0() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MerchantRewardsOfferDetailsBottomSheet.bind$lambda$5$lambda$3(this.f$0, deeplink);
                    }
                });
            }
            rdsButtonBarView.onSecondaryButtonClick(new Function0() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MerchantRewardsOfferDetailsBottomSheet.bind$lambda$5$lambda$4(this.f$0);
                }
            });
            Intrinsics.checkNotNull(rdsButtonBarView);
            return;
        }
        if (i == 2) {
            RhTextView merchantrewardsOfferDetailsAvailability = getBinding().merchantrewardsOfferDetailsAvailability;
            Intrinsics.checkNotNullExpressionValue(merchantrewardsOfferDetailsAvailability, "merchantrewardsOfferDetailsAvailability");
            merchantrewardsOfferDetailsAvailability.setVisibility(8);
            RdsButtonBarView rdsButtonBarView2 = getBinding().merchantrewardsOfferDetailsButtonBar;
            rdsButtonBarView2.onPrimaryButtonClick(new Function0() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MerchantRewardsOfferDetailsBottomSheet.bind$lambda$8$lambda$6(this.f$0);
                }
            });
            rdsButtonBarView2.setPrimaryButtonText(getText(C27650R.string.cash_merchant_rhy_upsell_get_card));
            rdsButtonBarView2.onSecondaryButtonClick(new Function0() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MerchantRewardsOfferDetailsBottomSheet.bind$lambda$8$lambda$7(this.f$0);
                }
            });
            Intrinsics.checkNotNull(rdsButtonBarView2);
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (state.getBanner() != null) {
            bindBanner(state.getBanner());
        } else {
            ApiMerchantOfferV2.Status status2 = state.getMerchantOffer().getStatus();
            if (status2 != null) {
                bindStatus(status2);
            }
        }
        if (state.getShowViewAllOffersButton()) {
            bindShowAllOffersButton();
            getBinding().merchantrewardsOfferDetailsButtonBar.onSecondaryButtonClick(new Function0() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MerchantRewardsOfferDetailsBottomSheet.bind$lambda$10(this.f$0);
                }
            });
        } else {
            bindDefaultButtons(state);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$1(MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet, MerchantRewardsOfferDetailsViewState merchantRewardsOfferDetailsViewState) {
        Navigator navigator = merchantRewardsOfferDetailsBottomSheet.getNavigator();
        android.content.Context contextRequireContext = merchantRewardsOfferDetailsBottomSheet.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new LegacyFragmentKey.RhyMerchantRewardsOfferTerms(merchantRewardsOfferDetailsViewState.getMerchantOffer().getId()), false, false, false, null, false, null, false, false, null, null, 4092, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$5$lambda$3(MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet, ApiMerchantOfferV2.Button.Action.Deeplink deeplink) {
        Navigator navigator = merchantRewardsOfferDetailsBottomSheet.getNavigator();
        android.content.Context contextRequireContext = merchantRewardsOfferDetailsBottomSheet.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Uri uri = Uri.parse(deeplink.getData());
        Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
        merchantRewardsOfferDetailsBottomSheet.transferLauncher.launch((Intent) ArraysKt.last(Navigator.DefaultImpls.resolveDeepLink$default(navigator, contextRequireContext, uri, null, DeepLinkOrigin.Internal.INSTANCE, false, 20, null)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$5$lambda$4(MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet) {
        merchantRewardsOfferDetailsBottomSheet.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$8$lambda$6(MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet) {
        Navigator navigator = merchantRewardsOfferDetailsBottomSheet.getNavigator();
        android.content.Context contextRequireContext = merchantRewardsOfferDetailsBottomSheet.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new RhyUpgradeKey(null, null, 3, null), null, false, null, null, 60, null);
        merchantRewardsOfferDetailsBottomSheet.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$8$lambda$7(MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet) {
        merchantRewardsOfferDetailsBottomSheet.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$10(MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet) {
        merchantRewardsOfferDetailsBottomSheet.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindDefaultButtons(MerchantRewardsOfferDetailsViewState state) {
        String text;
        Icon icon;
        BentoIcon4 bentoIcon;
        ServerToBentoAssetMapper2 asset;
        Icon icon2;
        BentoIcon4 bentoIcon2;
        ServerToBentoAssetMapper2 asset2;
        RdsButtonBarView rdsButtonBarView = getBinding().merchantrewardsOfferDetailsButtonBar;
        ApiMerchantOfferV2.Button primaryButton = state.getMerchantOffer().getPrimaryButton();
        String text2 = null;
        final Function0<Unit> function0HandleButtonAction = handleButtonAction(primaryButton != null ? primaryButton.getAction() : null);
        if (function0HandleButtonAction != null) {
            rdsButtonBarView.onPrimaryButtonClick(new Function0() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MerchantRewardsOfferDetailsBottomSheet.bindDefaultButtons$lambda$17$lambda$13$lambda$11(function0HandleButtonAction);
                }
            });
            if (primaryButton != null && (icon2 = primaryButton.getIcon()) != null && (bentoIcon2 = SduiIcon2.toBentoIcon(icon2)) != null && (asset2 = bentoIcon2.getAsset()) != null) {
                rdsButtonBarView.setPrimaryButtonIcon(requireContext().getDrawable(asset2.getResourceId()));
            }
            text = primaryButton != null ? primaryButton.getText() : null;
        }
        rdsButtonBarView.setPrimaryButtonText(text);
        ApiMerchantOfferV2.Button secondaryButton = state.getMerchantOffer().getSecondaryButton();
        final Function0<Unit> function0HandleButtonAction2 = handleButtonAction(secondaryButton != null ? secondaryButton.getAction() : null);
        if (function0HandleButtonAction2 != null) {
            rdsButtonBarView.onSecondaryButtonClick(new Function0() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MerchantRewardsOfferDetailsBottomSheet.bindDefaultButtons$lambda$17$lambda$16$lambda$14(function0HandleButtonAction2);
                }
            });
            if (secondaryButton != null && (icon = secondaryButton.getIcon()) != null && (bentoIcon = SduiIcon2.toBentoIcon(icon)) != null && (asset = bentoIcon.getAsset()) != null) {
                rdsButtonBarView.setSecondaryButtonIcon(requireContext().getDrawable(asset.getResourceId()));
            }
            if (secondaryButton != null) {
                text2 = secondaryButton.getText();
            }
        }
        rdsButtonBarView.setSecondaryButtonText(text2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindDefaultButtons$lambda$17$lambda$13$lambda$11(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private final void bindComposableWithTheme(final ComposeView view, final Function2<? super Composer, ? super Integer, Unit> composable) {
        view.setVisibility(0);
        view.setContent(ComposableLambda3.composableLambdaInstance(1417804963, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$bindComposableWithTheme$1$1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                ScarletManager scarletManager;
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1417804963, i, -1, "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.bindComposableWithTheme.<anonymous>.<anonymous> (MerchantRewardsOfferDetailsBottomSheet.kt:642)");
                }
                ScarletContextWrapper scarletContextWrapper = this.this$0.getScarletContextWrapper();
                if (scarletContextWrapper == null || (scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper)) == null) {
                    scarletManager = ScarletManager2.getScarletManager(view);
                }
                Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(scarletManager);
                final Function2<Composer, Integer, Unit> function2 = composable;
                BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(1011999153, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$bindComposableWithTheme$1$1.1
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
                            ComposerKt.traceEventStart(1011999153, i2, -1, "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.bindComposableWithTheme.<anonymous>.<anonymous>.<anonymous> (MerchantRewardsOfferDetailsBottomSheet.kt:644)");
                        }
                        function2.invoke(composer2, 0);
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
    public static final Unit bindDefaultButtons$lambda$17$lambda$16$lambda$14(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private final Function0<Unit> handleButtonAction(final ApiMerchantOfferV2.Button.Action action) {
        if (action instanceof ApiMerchantOfferV2.Button.Action.Deeplink) {
            return new Function0() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MerchantRewardsOfferDetailsBottomSheet.handleButtonAction$lambda$18(this.f$0, action);
                }
            };
        }
        if (action instanceof ApiMerchantOfferV2.Button.Action.Predefined) {
            return (Function0) handlePredefinedActions((ApiMerchantOfferV2.Button.Action.Predefined) action);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleButtonAction$lambda$18(MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet, ApiMerchantOfferV2.Button.Action action) {
        Navigator navigator = merchantRewardsOfferDetailsBottomSheet.getNavigator();
        android.content.Context contextRequireContext = merchantRewardsOfferDetailsBottomSheet.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(((ApiMerchantOfferV2.Button.Action.Deeplink) action).getData()), null, null, false, null, 60, null);
        merchantRewardsOfferDetailsBottomSheet.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: MerchantRewardsOfferDetailsBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$handlePredefinedActions$1 */
    /* synthetic */ class C276861 extends FunctionReferenceImpl implements Function0<Unit> {
        C276861(Object obj) {
            super(0, obj, MerchantRewardsOfferDetailsBottomSheet.class, "dismiss", "dismiss()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((MerchantRewardsOfferDetailsBottomSheet) this.receiver).dismiss();
        }
    }

    private final KFunction<Unit> handlePredefinedActions(ApiMerchantOfferV2.Button.Action.Predefined action) {
        if (WhenMappings.$EnumSwitchMapping$1[action.getData().ordinal()] == 1) {
            return new C276861(this);
        }
        return null;
    }

    private final void bindShowAllOffersButton() {
        RdsButtonBarView rdsButtonBarView = getBinding().merchantrewardsOfferDetailsButtonBar;
        rdsButtonBarView.onPrimaryButtonClick(new Function0() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MerchantRewardsOfferDetailsBottomSheet.bindShowAllOffersButton$lambda$20$lambda$19(this.f$0);
            }
        });
        rdsButtonBarView.setPrimaryButtonText(getText(C27650R.string.cash_merchant_rewards_offer_view_all_offers));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindShowAllOffersButton$lambda$20$lambda$19(MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet) {
        EventLogger.DefaultImpls.logTap$default(merchantRewardsOfferDetailsBottomSheet.getEventLogger(), UserInteractionEventData.Action.VIEW_ALL_OFFERS, null, merchantRewardsOfferDetailsBottomSheet.loggingComponent, null, merchantRewardsOfferDetailsBottomSheet.getLoggingContext(), false, 42, null);
        Navigator navigator = merchantRewardsOfferDetailsBottomSheet.getNavigator();
        android.content.Context contextRequireContext = merchantRewardsOfferDetailsBottomSheet.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.RhyMerchantRewards(null, 1, null), null, false, null, null, 60, null);
        merchantRewardsOfferDetailsBottomSheet.dismiss();
        return Unit.INSTANCE;
    }

    private final void bindStatus(ApiMerchantOfferV2.Status status) {
        ResourceReferences4<Integer> colorResource;
        View merchantOfferStatusSeparator = getBinding().merchantOfferStatusSeparator;
        Intrinsics.checkNotNullExpressionValue(merchantOfferStatusSeparator, "merchantOfferStatusSeparator");
        merchantOfferStatusSeparator.setVisibility(0);
        RhTextView rhTextView = getBinding().merchantrewardsOfferDetailsAvailability;
        Intrinsics.checkNotNull(rhTextView);
        rhTextView.setVisibility(0);
        rhTextView.setText(status.getMessage());
        Icon icon = status.getIcon();
        TextViewsKt.setDrawableStart(rhTextView, icon != null ? ViewsKt.getDrawable(rhTextView, IconExtensions.getResourceId(icon)) : null);
        ThemedColor icon_color = status.getIcon_color();
        if (icon_color == null || (colorResource = SduiColors2.toColorResource(icon_color)) == null) {
            return;
        }
        Resources.Theme theme = rhTextView.getContext().getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        Integer numResolve = colorResource.resolve(theme);
        if (numResolve != null) {
            TextViewsKt.tintDrawables(rhTextView, numResolve.intValue());
        }
    }

    private final void bindProgressBar(final MerchantOfferV2.DetailAsset.ProgressBar progressBar) {
        ComposeView merchantOfferProgressBar = getBinding().merchantOfferProgressBar;
        Intrinsics.checkNotNullExpressionValue(merchantOfferProgressBar, "merchantOfferProgressBar");
        bindComposableWithTheme(merchantOfferProgressBar, ComposableLambda3.composableLambdaInstance(322704567, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.bindProgressBar.1
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
                    ComposerKt.traceEventStart(322704567, i, -1, "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.bindProgressBar.<anonymous> (MerchantRewardsOfferDetailsBottomSheet.kt:327)");
                }
                MerchantRewardsOfferDetailsBottomSheet.this.MerchantRewardsOfferProgressBar(progressBar, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MerchantRewardsOfferProgressBar(final MerchantOfferV2.DetailAsset.ProgressBar progressBar, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1111451815);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(progressBar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1111451815, i2, -1, "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferProgressBar (MerchantRewardsOfferDetailsBottomSheet.kt:332)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue2;
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(progressBar);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new MerchantRewardsOfferDetailsBottomSheet5(coroutineScope, progressBar, snapshotIntState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 6);
            RhyProgressBar3.RhyProgressBar(progressBar.getTotalChunks(), PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, PrimitiveResources_androidKt.dimensionResource(C27650R.dimen.merchantrewards_progress_bar_height, composerStartRestartGroup, 0)), 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0, snapshotIntState2.getIntValue(), null, null, ComposableLambda3.rememberComposableLambda(-399410127, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferProgressBar.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-399410127, i3, -1, "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferProgressBar.<anonymous> (MerchantRewardsOfferDetailsBottomSheet.kt:350)");
                    }
                    MerchantRewardsOfferDetailsBottomSheet.this.MerchantRewardsOfferDetailProgressBarLabel(progressBar.getMainText(), progressBar.getLabelText(), composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1573248, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MerchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferProgressBar$lambda$28(this.f$0, progressBar, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void bindDetails(final MerchantOfferV2 merchantOffer) {
        ComposeView merchantrewardsOfferDetailsList = getBinding().merchantrewardsOfferDetailsList;
        Intrinsics.checkNotNullExpressionValue(merchantrewardsOfferDetailsList, "merchantrewardsOfferDetailsList");
        bindComposableWithTheme(merchantrewardsOfferDetailsList, ComposableLambda3.composableLambdaInstance(1709609585, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.bindDetails.1
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
                    ComposerKt.traceEventStart(1709609585, i, -1, "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.bindDetails.<anonymous> (MerchantRewardsOfferDetailsBottomSheet.kt:356)");
                }
                MerchantRewardsOfferDetailsBottomSheet.this.MerchantRewardsOfferDetailList(merchantOffer.getDetails(), composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MerchantRewardsOfferDetailList(final List<ApiMerchantOfferV2.OfferDetail> list, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(891690324);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(891690324, i2, -1, "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetailList (MerchantRewardsOfferDetailsBottomSheet.kt:361)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM()), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-2012237134);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                MerchantRewardsOfferDetail((ApiMerchantOfferV2.OfferDetail) it.next(), composerStartRestartGroup, i2 & 112);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MerchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetailList$lambda$31(this.f$0, list, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void MerchantRewardsOfferDetail(final ApiMerchantOfferV2.OfferDetail offerDetail, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-76224199);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(offerDetail) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-76224199, i2, -1, "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetail (MerchantRewardsOfferDetailsBottomSheet.kt:375)");
            }
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
            BentoIcon4 bentoIcon = SduiIcon2.toBentoIcon(offerDetail.getIcon());
            composerStartRestartGroup.startReplaceGroup(-2012369092);
            if (bentoIcon != null) {
                BentoIcon2.m20644BentoIconFU0evQE(bentoIcon, null, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU(), null, null, false, composerStartRestartGroup, BentoIcon4.$stable | 48, 56);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            if (StringsKt.contains$default((CharSequence) offerDetail.getMessage(), (CharSequence) "robinhood://", false, 2, (Object) null)) {
                composerStartRestartGroup.startReplaceGroup(2041317636);
                BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(offerDetail.getMessage(), PaddingKt.m5146paddingqDBjuR0$default(companion, C2002Dp.m7995constructorimpl(14), 0.0f, 0.0f, 0.0f, 14, null), null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU()), 0, null, 0, 0, null, composerStartRestartGroup, 48, 500);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(2041608261);
                Composer composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(offerDetail.getMessage(), PaddingKt.m5146paddingqDBjuR0$default(companion, C2002Dp.m7995constructorimpl(14), 0.0f, 0.0f, 0.0f, 14, null), null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextM(), composer2, 48, 0, 8188);
                composerStartRestartGroup = composer2;
                composerStartRestartGroup.endReplaceGroup();
            }
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MerchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetail$lambda$34(this.f$0, offerDetail, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void bindImage(final MerchantOfferV2.DetailAsset.Image detailAsset) {
        FrameLayout merchantrewardsOfferDetailsLogoCard = getBinding().merchantrewardsOfferDetailsLogoCard;
        Intrinsics.checkNotNullExpressionValue(merchantrewardsOfferDetailsLogoCard, "merchantrewardsOfferDetailsLogoCard");
        merchantrewardsOfferDetailsLogoCard.setVisibility(8);
        ComposeView merchantrewardsOfferDetailsGaugeContainer = getBinding().merchantrewardsOfferDetailsGaugeContainer;
        Intrinsics.checkNotNullExpressionValue(merchantrewardsOfferDetailsGaugeContainer, "merchantrewardsOfferDetailsGaugeContainer");
        merchantrewardsOfferDetailsGaugeContainer.setVisibility(0);
        ComposeView merchantrewardsOfferDetailsGaugeContainer2 = getBinding().merchantrewardsOfferDetailsGaugeContainer;
        Intrinsics.checkNotNullExpressionValue(merchantrewardsOfferDetailsGaugeContainer2, "merchantrewardsOfferDetailsGaugeContainer");
        bindComposableWithTheme(merchantrewardsOfferDetailsGaugeContainer2, ComposableLambda3.composableLambdaInstance(-1360856883, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.bindImage.1
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
                    ComposerKt.traceEventStart(-1360856883, i, -1, "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.bindImage.<anonymous> (MerchantRewardsOfferDetailsBottomSheet.kt:407)");
                }
                AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(detailAsset.getUrl(), null, null, null, 0, null, composer, 0, 62);
                Modifier.Companion companion = Modifier.INSTANCE;
                C2002Dp c2002DpM7993boximpl = detailAsset.getHeight() != null ? C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(r2.intValue())) : null;
                composer.startReplaceGroup(-2113399902);
                float fDimensionResource = c2002DpM7993boximpl == null ? PrimitiveResources_androidKt.dimensionResource(C27650R.dimen.merchantrewards_offer_image_size, composer, 0) : c2002DpM7993boximpl.getValue();
                composer.endReplaceGroup();
                ImageKt.Image(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, (String) null, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.m5156height3ABfNKs(companion, fDimensionResource), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    private final void bindDetailAsset(MerchantOfferV2.DetailAsset detailAsset) {
        if (detailAsset instanceof MerchantOfferV2.DetailAsset.ProgressBar) {
            MerchantOfferV2.DetailAsset.ProgressBar progressBar = (MerchantOfferV2.DetailAsset.ProgressBar) detailAsset;
            bindProgressBar(progressBar);
            MerchantOfferV2.DetailAsset.Image image = progressBar.getImage();
            if (image != null) {
                bindImage(image);
                return;
            }
            return;
        }
        if (detailAsset instanceof MerchantOfferV2.DetailAsset.Gauge) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            bindGaugeAsset(MerchantRewardsOfferDetailsBottomSheet9.toV2((MerchantOfferV2.DetailAsset.Gauge) detailAsset, resources));
            return;
        }
        if (detailAsset instanceof MerchantOfferV2.DetailAsset.GaugeV2) {
            bindGaugeAsset((MerchantOfferV2.DetailAsset.GaugeV2) detailAsset);
            return;
        }
        if (detailAsset instanceof MerchantOfferV2.DetailAsset.Image) {
            bindImage((MerchantOfferV2.DetailAsset.Image) detailAsset);
            return;
        }
        if (!(detailAsset instanceof MerchantOfferV2.DetailAsset.BorderedImage)) {
            throw new NoWhenBranchMatchedException();
        }
        FrameLayout merchantrewardsOfferDetailsLogoCard = getBinding().merchantrewardsOfferDetailsLogoCard;
        Intrinsics.checkNotNullExpressionValue(merchantrewardsOfferDetailsLogoCard, "merchantrewardsOfferDetailsLogoCard");
        merchantrewardsOfferDetailsLogoCard.setVisibility(0);
        ComposeView merchantrewardsOfferDetailsGaugeContainer = getBinding().merchantrewardsOfferDetailsGaugeContainer;
        Intrinsics.checkNotNullExpressionValue(merchantrewardsOfferDetailsGaugeContainer, "merchantrewardsOfferDetailsGaugeContainer");
        merchantrewardsOfferDetailsGaugeContainer.setVisibility(8);
        ImageLoader.ImageRequest imageRequestLoad = getImageLoader().load(HttpUrl.INSTANCE.get(((MerchantOfferV2.DetailAsset.BorderedImage) detailAsset).getUrl()));
        ImageView merchantrewardsOfferDetailsLogo = getBinding().merchantrewardsOfferDetailsLogo;
        Intrinsics.checkNotNullExpressionValue(merchantrewardsOfferDetailsLogo, "merchantrewardsOfferDetailsLogo");
        ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad, merchantrewardsOfferDetailsLogo, null, null, 6, null);
    }

    private final void bindGaugeAsset(final MerchantOfferV2.DetailAsset.GaugeV2 gauge) {
        FrameLayout merchantrewardsOfferDetailsLogoCard = getBinding().merchantrewardsOfferDetailsLogoCard;
        Intrinsics.checkNotNullExpressionValue(merchantrewardsOfferDetailsLogoCard, "merchantrewardsOfferDetailsLogoCard");
        merchantrewardsOfferDetailsLogoCard.setVisibility(8);
        ComposeView merchantrewardsOfferDetailsGaugeContainer = getBinding().merchantrewardsOfferDetailsGaugeContainer;
        Intrinsics.checkNotNullExpressionValue(merchantrewardsOfferDetailsGaugeContainer, "merchantrewardsOfferDetailsGaugeContainer");
        bindComposableWithTheme(merchantrewardsOfferDetailsGaugeContainer, ComposableLambda3.composableLambdaInstance(-994933829, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.bindGaugeAsset.1
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
                    ComposerKt.traceEventStart(-994933829, i, -1, "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.bindGaugeAsset.<anonymous> (MerchantRewardsOfferDetailsBottomSheet.kt:447)");
                }
                MerchantRewardsOfferDetailsBottomSheet.this.MerchantRewardsOfferDetailGauge(gauge, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MerchantRewardsOfferDetailGauge(final MerchantOfferV2.DetailAsset.GaugeV2 gaugeV2, Composer composer, final int i) {
        int i2;
        SnapshotIntState2 snapshotIntState2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2111876458);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(gaugeV2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2111876458, i2, -1, "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetailGauge (MerchantRewardsOfferDetailsBottomSheet.kt:452)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotIntState3.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SnapshotIntState2 snapshotIntState23 = (SnapshotIntState2) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue3;
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changedInstance(gaugeV2);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                snapshotIntState2 = snapshotIntState22;
                MerchantRewardsOfferDetailsBottomSheet2 merchantRewardsOfferDetailsBottomSheet2 = new MerchantRewardsOfferDetailsBottomSheet2(coroutineScope, gaugeV2, snapshotIntState2, snapshotIntState23, null);
                composerStartRestartGroup.updateRememberedValue(merchantRewardsOfferDetailsBottomSheet2);
                objRememberedValue4 = merchantRewardsOfferDetailsBottomSheet2;
            } else {
                snapshotIntState2 = snapshotIntState22;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 6);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            float f = EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE;
            composer2 = composerStartRestartGroup;
            StepGauge6.StepGauge(SizeKt.m5174width3ABfNKs(SizeKt.m5156height3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f)), C2002Dp.m7995constructorimpl(f)), gaugeV2.getTotalChunks(), snapshotIntState2.getIntValue(), snapshotIntState23.getIntValue(), !gaugeV2.isGaugeSmooth(), null, null, ComposableLambda3.rememberComposableLambda(810130171, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetailGauge.2
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
                        ComposerKt.traceEventStart(810130171, i3, -1, "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetailGauge.<anonymous> (MerchantRewardsOfferDetailsBottomSheet.kt:472)");
                    }
                    MerchantRewardsOfferDetailsBottomSheet.this.MerchantRewardsOfferDetailGaugeInnerContent(gaugeV2, composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 12582918, 96);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MerchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetailGauge$lambda$43(this.f$0, gaugeV2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MerchantRewardsOfferDetailProgressBarLabel(final String str, final String str2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1818272684);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1818272684, i2, -1, "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetailProgressBarLabel (MerchantRewardsOfferDetailsBottomSheet.kt:478)");
            }
            composerStartRestartGroup.startReplaceGroup(-691634798);
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            int iPushStyle = builder.pushStyle(SpanStyle.m7595copyGSF8kmg$default(bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS().toSpanStyle(), bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65530, null));
            try {
                builder.append(str);
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                builder.append(PlaceholderUtils.XXShortPlaceholderText);
                iPushStyle = builder.pushStyle(SpanStyle.m7595copyGSF8kmg$default(bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS().toSpanStyle(), bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                try {
                    builder.append(str2);
                    builder.pop(iPushStyle);
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    composer2 = composerStartRestartGroup;
                    BentoText2.m20748BentoTextQnj7Zds(annotatedString, PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 1, null), null, null, null, null, null, 0, false, 0, 0, null, null, null, composer2, 0, 0, 16380);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } finally {
                }
            } finally {
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MerchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetailProgressBarLabel$lambda$47(this.f$0, str, str2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MerchantRewardsOfferDetailGaugeInnerContent(final MerchantOfferV2.DetailAsset.GaugeV2 gaugeV2, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1434936979);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(gaugeV2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1434936979, i2, -1, "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetailGaugeInnerContent (MerchantRewardsOfferDetailsBottomSheet.kt:503)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            if (gaugeV2 instanceof MerchantOfferV2.DetailAsset.GaugeV2.GaugePercent) {
                composerStartRestartGroup.startReplaceGroup(1112532672);
                MerchantRewardsOfferDetailGaugeInnerContentMainValue((MerchantOfferV2.DetailAsset.GaugeV2.GaugePercent) gaugeV2, composerStartRestartGroup, i2 & 112);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(gaugeV2 instanceof MerchantOfferV2.DetailAsset.GaugeV2.GaugeMoney)) {
                    composerStartRestartGroup.startReplaceGroup(1112529558);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1112537728);
                MerchantRewardsOfferDetailGaugeInnerContentMainValue((MerchantOfferV2.DetailAsset.GaugeV2.GaugeMoney) gaugeV2, composerStartRestartGroup, i2 & 112);
                composerStartRestartGroup.endReplaceGroup();
            }
            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            String subtitleOneText = gaugeV2.getSubtitleOneText();
            if (subtitleOneText == null) {
                subtitleOneText = "";
            }
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            int iM7919getCentere0LSkKk = companion3.m7919getCentere0LSkKk();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU();
            BentoText2.m20747BentoText38GnDrw(subtitleOneText, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 2, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS(), composerStartRestartGroup, 805306368, 0, 7610);
            String subtitleTwoText = gaugeV2.getSubtitleTwoText();
            String str = subtitleTwoText != null ? subtitleTwoText : "";
            int iM7919getCentere0LSkKk2 = companion3.m7919getCentere0LSkKk();
            long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i3).m21426getFg20d7_KjU();
            BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk2), 0, false, 1, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextS(), composerStartRestartGroup, 805306368, 0, 7610);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MerchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetailGaugeInnerContent$lambda$49(this.f$0, gaugeV2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void MerchantRewardsOfferDetailGaugeInnerContentMainValue(final MerchantOfferV2.DetailAsset.GaugeV2.GaugeMoney gaugeMoney, Composer composer, final int i) {
        int i2;
        Object obj;
        final SnapshotState snapshotState;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1720539671);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(gaugeMoney) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1720539671, i2, -1, "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetailGaugeInnerContentMainValue (MerchantRewardsOfferDetailsBottomSheet.kt:539)");
            }
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 0.0f, 2, null);
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
            final int i3 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
            boolean zChanged = zChangedInstance | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                obj = new MeasurePolicy() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$MerchantRewardsOfferDetailGaugeInnerContentMainValue$$inlined$ConstraintLayout$2
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        snapshotState3.getValue();
                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i3);
                        snapshotState2.getValue();
                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$MerchantRewardsOfferDetailGaugeInnerContentMainValue$$inlined$ConstraintLayout$2.1
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
                objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$MerchantRewardsOfferDetailGaugeInnerContentMainValue$$inlined$ConstraintLayout$3
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
                objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$MerchantRewardsOfferDetailGaugeInnerContentMainValue$$inlined$ConstraintLayout$4
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
            LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierM5144paddingVpY3zN4$default, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$MerchantRewardsOfferDetailGaugeInnerContentMainValue$$inlined$ConstraintLayout$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1200550679, i4, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                        }
                        snapshotState3.setValue(Unit.INSTANCE);
                        int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                        constraintLayoutScope.reset();
                        ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                        composer2.startReplaceGroup(-228966011);
                        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i5 = BentoTheme.$stable;
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i5).m21597getXxsmallD9Ej5fM());
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged2 = composer2.changed(constraintLayoutBaseScope4Component2);
                        Object objRememberedValue9 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue9 = new MerchantRewardsOfferDetailsBottomSheet3(constraintLayoutBaseScope4Component2);
                            composer2.updateRememberedValue(objRememberedValue9);
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(modifierM5142padding3ABfNKs, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue9);
                        String strStringResource = StringResources_androidKt.stringResource(C27650R.string.cash_merchant_rewards_offer_gauge_content_dollar_sign, composer2, 0);
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU();
                        TextStyle textS = bentoTheme.getTypography(composer2, i5).getTextS();
                        BentoText2.m20747BentoText38GnDrw(strStringResource, modifierConstrainAs, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7962getVisiblegIe3tQ8(), false, 1, 0, null, 0, textS, composer2, 817889280, 0, 7544);
                        this.MerchantRewardsOfferDetailGaugeInnerContentMainText(constraintLayoutScope2, gaugeMoney.getMainText(), constraintLayoutBaseScope4Component2, composer2, ConstraintLayoutScope.$stable);
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
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return MerchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetailGaugeInnerContentMainValue$lambda$52(this.f$0, gaugeMoney, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private final void MerchantRewardsOfferDetailGaugeInnerContentMainValue(final MerchantOfferV2.DetailAsset.GaugeV2.GaugePercent gaugePercent, Composer composer, final int i) {
        int i2;
        Object obj;
        final SnapshotState snapshotState;
        Composer composerStartRestartGroup = composer.startRestartGroup(1681609988);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(gaugePercent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1681609988, i2, -1, "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetailGaugeInnerContentMainValue (MerchantRewardsOfferDetailsBottomSheet.kt:567)");
            }
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21595getXsmallD9Ej5fM(), 0.0f, 2, null);
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
            final int i3 = EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE;
            boolean zChanged = zChangedInstance | composerStartRestartGroup.changed(EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                obj = new MeasurePolicy() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$MerchantRewardsOfferDetailGaugeInnerContentMainValue$$inlined$ConstraintLayout$7
                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.maxIntrinsicHeight(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.maxIntrinsicWidth(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.minIntrinsicHeight(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    public /* bridge */ /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i4) {
                        return super.minIntrinsicWidth(intrinsicMeasureScope, list, i4);
                    }

                    @Override // androidx.compose.p011ui.layout.MeasurePolicy
                    /* renamed from: measure-3p2s80s */
                    public final MeasureResult mo4748measure3p2s80s(MeasureScope measureScope, final List<? extends Measurable> list, long j) {
                        final LinkedHashMap linkedHashMap = new LinkedHashMap();
                        snapshotState3.getValue();
                        long jM8166performMeasureDjhGOtQ = measurer2.m8166performMeasureDjhGOtQ(j, measureScope.getLayoutDirection(), constraintSetForInlineDsl, list, linkedHashMap, i3);
                        snapshotState2.getValue();
                        int iM8060getWidthimpl = IntSize.m8060getWidthimpl(jM8166performMeasureDjhGOtQ);
                        int iM8059getHeightimpl = IntSize.m8059getHeightimpl(jM8166performMeasureDjhGOtQ);
                        final Measurer2 measurer22 = measurer2;
                        return MeasureScope.layout$default(measureScope, iM8060getWidthimpl, iM8059getHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$MerchantRewardsOfferDetailGaugeInnerContentMainValue$$inlined$ConstraintLayout$7.1
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
                objRememberedValue7 = new Function0<Unit>() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$MerchantRewardsOfferDetailGaugeInnerContentMainValue$$inlined$ConstraintLayout$8
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
                objRememberedValue8 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$MerchantRewardsOfferDetailGaugeInnerContentMainValue$$inlined$ConstraintLayout$9
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
            LayoutKt.MultiMeasureLayout(SemanticsModifier6.semantics$default(modifierM5144paddingVpY3zN4$default, false, (Function1) objRememberedValue8, 1, null), ComposableLambda3.rememberComposableLambda(1200550679, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$MerchantRewardsOfferDetailGaugeInnerContentMainValue$$inlined$ConstraintLayout$10
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1200550679, i4, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                        }
                        snapshotState3.setValue(Unit.INSTANCE);
                        int helpersHashCode = constraintLayoutScope.getHelpersHashCode();
                        constraintLayoutScope.reset();
                        ConstraintLayoutScope constraintLayoutScope2 = constraintLayoutScope;
                        composer2.startReplaceGroup(1009188647);
                        ConstraintLayoutScope.ConstrainedLayoutReferences constrainedLayoutReferencesCreateRefs = constraintLayoutScope2.createRefs();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component1 = constrainedLayoutReferencesCreateRefs.component1();
                        ConstraintLayoutBaseScope4 constraintLayoutBaseScope4Component2 = constrainedLayoutReferencesCreateRefs.component2();
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i5 = BentoTheme.$stable;
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i5).m21597getXxsmallD9Ej5fM());
                        composer2.startReplaceGroup(5004770);
                        boolean zChanged2 = composer2.changed(constraintLayoutBaseScope4Component2);
                        Object objRememberedValue9 = composer2.rememberedValue();
                        if (zChanged2 || objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue9 = new MerchantRewardsOfferDetailsBottomSheet4(constraintLayoutBaseScope4Component2);
                            composer2.updateRememberedValue(objRememberedValue9);
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierConstrainAs = constraintLayoutScope2.constrainAs(modifierM5142padding3ABfNKs, constraintLayoutBaseScope4Component1, (Function1) objRememberedValue9);
                        String strStringResource = StringResources_androidKt.stringResource(C27650R.string.cash_merchant_rewards_offer_gauge_content_percent_sign, composer2, 0);
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer2, i5).m21425getFg0d7_KjU();
                        TextStyle textS = bentoTheme.getTypography(composer2, i5).getTextS();
                        BentoText2.m20747BentoText38GnDrw(strStringResource, modifierConstrainAs, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, TextOverflow.INSTANCE.m7962getVisiblegIe3tQ8(), false, 1, 0, null, 0, textS, composer2, 817889280, 0, 7544);
                        this.MerchantRewardsOfferDetailGaugeInnerContentMainText(constraintLayoutScope2, gaugePercent.getMainText(), constraintLayoutBaseScope4Component2, composer2, ConstraintLayoutScope.$stable);
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
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return MerchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetailGaugeInnerContentMainValue$lambda$55(this.f$0, gaugePercent, i, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MerchantRewardsOfferDetailGaugeInnerContentMainText(final ConstraintLayoutScope constraintLayoutScope, final String str, final ConstraintLayoutBaseScope4 constraintLayoutBaseScope4, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-925926467);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(constraintLayoutScope) : composerStartRestartGroup.changedInstance(constraintLayoutScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(constraintLayoutBaseScope4) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-925926467, i2, -1, "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetailGaugeInnerContentMainText (MerchantRewardsOfferDetailsBottomSheet.kt:596)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return MerchantRewardsOfferDetailsBottomSheet.m2444xb8e82626((ConstrainScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierConstrainAs = constraintLayoutScope.constrainAs(companion, constraintLayoutBaseScope4, (Function1) objRememberedValue);
            int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            AutoSizeText.m21098AutoSizeTextG_RxxvU(modifierConstrainAs, str, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU()), (FontStyle) null, (FontWeight) null, (TextDecoration) null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, (Function1<? super TextLayoutResult, Unit>) null, bentoTheme.getTypography(composerStartRestartGroup, i3).getBookCoverCapsuleMedium(), 0.2f, 0.0f, composer2, i2 & 112, 6, 2488);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MerchantRewardsOfferDetailsBottomSheet.MerchantRewardsOfferDetailGaugeInnerContentMainText$lambda$58(this.f$0, constraintLayoutScope, str, constraintLayoutBaseScope4, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MerchantRewardsOfferDetailGaugeInnerContentMainText$lambda$57$lambda$56 */
    public static final Unit m2444xb8e82626(ConstrainScope constrainAs) {
        Intrinsics.checkNotNullParameter(constrainAs, "$this$constrainAs");
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getStart(), constrainAs.getParent().getStart(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon6.m8185linkToVpY3zN4$default(constrainAs.getEnd(), constrainAs.getParent().getEnd(), 0.0f, 0.0f, 6, null);
        ConstraintScopeCommon5.m8162linkToVpY3zN4$default(constrainAs.getTop(), constrainAs.getParent().getTop(), 0.0f, 0.0f, 6, null);
        return Unit.INSTANCE;
    }

    private final void bindBanner(MerchantOfferBanner banner) {
        View merchantOfferStatusSeparator = getBinding().merchantOfferStatusSeparator;
        Intrinsics.checkNotNullExpressionValue(merchantOfferStatusSeparator, "merchantOfferStatusSeparator");
        merchantOfferStatusSeparator.setVisibility(8);
        RhTextView merchantrewardsOfferDetailsAvailability = getBinding().merchantrewardsOfferDetailsAvailability;
        Intrinsics.checkNotNullExpressionValue(merchantrewardsOfferDetailsAvailability, "merchantrewardsOfferDetailsAvailability");
        merchantrewardsOfferDetailsAvailability.setVisibility(8);
        ComposeView merchantOfferBanner = getBinding().merchantOfferBanner;
        Intrinsics.checkNotNullExpressionValue(merchantOfferBanner, "merchantOfferBanner");
        bindComposableWithTheme(merchantOfferBanner, ComposableLambda3.composableLambdaInstance(-212410725, true, new C276801(banner, this)));
    }

    /* compiled from: MerchantRewardsOfferDetailsBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$bindBanner$1 */
    static final class C276801 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ MerchantOfferBanner $banner;
        final /* synthetic */ MerchantRewardsOfferDetailsBottomSheet this$0;

        C276801(MerchantOfferBanner merchantOfferBanner, MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet) {
            this.$banner = merchantOfferBanner;
            this.this$0 = merchantRewardsOfferDetailsBottomSheet;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            long jM21373getBg30d7_KjU;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-212410725, i, -1, "com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet.bindBanner.<anonymous> (MerchantRewardsOfferDetailsBottomSheet.kt:617)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, composer, 6, 2);
            String text = this.$banner.getText();
            Icon icon = this.$banner.getIcon();
            BentoIcon4 bentoIcon = icon != null ? SduiIcon2.toBentoIcon(icon) : null;
            String ctaText = this.$banner.getCtaText();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changedInstance(this.$banner);
            final MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet = this.this$0;
            final MerchantOfferBanner merchantOfferBanner = this.$banner;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.rhyrewards.ui.MerchantRewardsOfferDetailsBottomSheet$bindBanner$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return MerchantRewardsOfferDetailsBottomSheet.C276801.invoke$lambda$1$lambda$0(merchantRewardsOfferDetailsBottomSheet, merchantOfferBanner);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
            if (bentoTheme.getColors(composer, i2).getIsDay()) {
                composer.startReplaceGroup(-1440475446);
                jM21373getBg30d7_KjU = bentoTheme.getColors(composer, i2).m21372getBg20d7_KjU();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1440408982);
                jM21373getBg30d7_KjU = bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU();
                composer.endReplaceGroup();
            }
            BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(modifierM21622defaultHorizontalPaddingWMci_g0, text, bentoIcon, ctaText, function0, null, jM21425getFg0d7_KjU, jM21373getBg30d7_KjU, composer, BentoIcon4.$stable << 6, 32);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet, MerchantOfferBanner merchantOfferBanner) {
            Navigator navigator = merchantRewardsOfferDetailsBottomSheet.getNavigator();
            android.content.Context contextRequireContext = merchantRewardsOfferDetailsBottomSheet.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(merchantOfferBanner.getCtaDeeplink()), null, null, false, null, 60, null);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: MerchantRewardsOfferDetailsBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsBottomSheet$Args;", "Landroid/os/Parcelable;", "merchantOffer", "Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "showViewAllOffersButton", "", "<init>", "(Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;Z)V", "getMerchantOffer", "()Lcom/robinhood/models/db/mcduckling/MerchantOfferV2;", "getShowViewAllOffersButton", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-rhy-rewards_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final MerchantOfferV2 merchantOffer;
        private final boolean showViewAllOffersButton;

        /* compiled from: MerchantRewardsOfferDetailsBottomSheet.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((MerchantOfferV2) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, MerchantOfferV2 merchantOfferV2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                merchantOfferV2 = args.merchantOffer;
            }
            if ((i & 2) != 0) {
                z = args.showViewAllOffersButton;
            }
            return args.copy(merchantOfferV2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final MerchantOfferV2 getMerchantOffer() {
            return this.merchantOffer;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getShowViewAllOffersButton() {
            return this.showViewAllOffersButton;
        }

        public final Args copy(MerchantOfferV2 merchantOffer, boolean showViewAllOffersButton) {
            Intrinsics.checkNotNullParameter(merchantOffer, "merchantOffer");
            return new Args(merchantOffer, showViewAllOffersButton);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.merchantOffer, args.merchantOffer) && this.showViewAllOffersButton == args.showViewAllOffersButton;
        }

        public int hashCode() {
            return (this.merchantOffer.hashCode() * 31) + Boolean.hashCode(this.showViewAllOffersButton);
        }

        public String toString() {
            return "Args(merchantOffer=" + this.merchantOffer + ", showViewAllOffersButton=" + this.showViewAllOffersButton + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.merchantOffer, flags);
            dest.writeInt(this.showViewAllOffersButton ? 1 : 0);
        }

        public Args(MerchantOfferV2 merchantOffer, boolean z) {
            Intrinsics.checkNotNullParameter(merchantOffer, "merchantOffer");
            this.merchantOffer = merchantOffer;
            this.showViewAllOffersButton = z;
        }

        public /* synthetic */ Args(MerchantOfferV2 merchantOfferV2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(merchantOfferV2, (i & 2) != 0 ? false : z);
        }

        public final MerchantOfferV2 getMerchantOffer() {
            return this.merchantOffer;
        }

        public final boolean getShowViewAllOffersButton() {
            return this.showViewAllOffersButton;
        }
    }

    /* compiled from: MerchantRewardsOfferDetailsBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsBottomSheet$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsBottomSheet;", "Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsBottomSheet$Args;", "<init>", "()V", "GAS_GROCERIES_OFFER", "", "SpecialSpendOffers", "feature-lib-rhy-rewards_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MerchantRewardsOfferDetailsBottomSheet, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, merchantRewardsOfferDetailsBottomSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MerchantRewardsOfferDetailsBottomSheet newInstance(Args args) {
            return (MerchantRewardsOfferDetailsBottomSheet) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MerchantRewardsOfferDetailsBottomSheet merchantRewardsOfferDetailsBottomSheet, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, merchantRewardsOfferDetailsBottomSheet, args);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MerchantRewardsOfferDetailsBottomSheet.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsBottomSheet$Companion$SpecialSpendOffers;", "", "offerId", "", "contentfulId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getOfferId", "()Ljava/lang/String;", "getContentfulId", "ONE_PERCENT_OFFER", "TWO_PERCENT_OFFER", "ONE_PERCENT_RAD_OFFER", "TWO_PERCENT_RAD_OFFER", "FIRST_SPEND_OFFER", "Companion", "feature-lib-rhy-rewards_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class SpecialSpendOffers {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ SpecialSpendOffers[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Map<String, SpecialSpendOffers> map;
            private final String contentfulId;
            private final String offerId;
            public static final SpecialSpendOffers ONE_PERCENT_OFFER = new SpecialSpendOffers("ONE_PERCENT_OFFER", 0, "3358d2c0-5eea-4602-bbac-c7ce27707d18", "1mq1ySZVFhyfPO0D8LpbY5");
            public static final SpecialSpendOffers TWO_PERCENT_OFFER = new SpecialSpendOffers("TWO_PERCENT_OFFER", 1, "ebe29d60-e820-44fa-986e-18c657fa0415", "1mq1ySZVFhyfPO0D8LpbY5");
            public static final SpecialSpendOffers ONE_PERCENT_RAD_OFFER = new SpecialSpendOffers("ONE_PERCENT_RAD_OFFER", 2, "63ee852f-8bd7-47d2-967c-230b8328dd9c", "gstvRl0Pb57e4aTiIKBRQ");
            public static final SpecialSpendOffers TWO_PERCENT_RAD_OFFER = new SpecialSpendOffers("TWO_PERCENT_RAD_OFFER", 3, "63ee8569-22ed-4b29-a2b1-657b21ea5a71", "gstvRl0Pb57e4aTiIKBRQ");
            public static final SpecialSpendOffers FIRST_SPEND_OFFER = new SpecialSpendOffers("FIRST_SPEND_OFFER", 4, "749b579f-2c7a-485e-a974-65a5bf5e97f3", "1LvG1tcPXwxq6porulzYki");

            private static final /* synthetic */ SpecialSpendOffers[] $values() {
                return new SpecialSpendOffers[]{ONE_PERCENT_OFFER, TWO_PERCENT_OFFER, ONE_PERCENT_RAD_OFFER, TWO_PERCENT_RAD_OFFER, FIRST_SPEND_OFFER};
            }

            public static EnumEntries<SpecialSpendOffers> getEntries() {
                return $ENTRIES;
            }

            private SpecialSpendOffers(String str, int i, String str2, String str3) {
                this.offerId = str2;
                this.contentfulId = str3;
            }

            public final String getOfferId() {
                return this.offerId;
            }

            public final String getContentfulId() {
                return this.contentfulId;
            }

            static {
                SpecialSpendOffers[] specialSpendOffersArr$values = $values();
                $VALUES = specialSpendOffersArr$values;
                $ENTRIES = EnumEntries2.enumEntries(specialSpendOffersArr$values);
                INSTANCE = new Companion(null);
                SpecialSpendOffers[] specialSpendOffersArrValues = values();
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(specialSpendOffersArrValues.length), 16));
                for (SpecialSpendOffers specialSpendOffers : specialSpendOffersArrValues) {
                    linkedHashMap.put(specialSpendOffers.offerId, specialSpendOffers);
                }
                map = linkedHashMap;
            }

            /* compiled from: MerchantRewardsOfferDetailsBottomSheet.kt */
            @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0006H\u0086\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsBottomSheet$Companion$SpecialSpendOffers$Companion;", "", "<init>", "()V", "map", "", "", "Lcom/robinhood/android/rhyrewards/ui/MerchantRewardsOfferDetailsBottomSheet$Companion$SpecialSpendOffers;", "fromOfferId", "offerId", "isRadFlatPercentOffer", "", "feature-lib-rhy-rewards_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                public final SpecialSpendOffers fromOfferId(String offerId) {
                    Intrinsics.checkNotNullParameter(offerId, "offerId");
                    return (SpecialSpendOffers) SpecialSpendOffers.map.get(offerId);
                }

                public final boolean isRadFlatPercentOffer(String offerId) {
                    Intrinsics.checkNotNullParameter(offerId, "offerId");
                    return Intrinsics.areEqual(offerId, SpecialSpendOffers.ONE_PERCENT_RAD_OFFER.getOfferId()) || Intrinsics.areEqual(offerId, SpecialSpendOffers.TWO_PERCENT_RAD_OFFER.getOfferId());
                }
            }

            public static SpecialSpendOffers valueOf(String str) {
                return (SpecialSpendOffers) Enum.valueOf(SpecialSpendOffers.class, str);
            }

            public static SpecialSpendOffers[] values() {
                return (SpecialSpendOffers[]) $VALUES.clone();
            }
        }
    }
}
