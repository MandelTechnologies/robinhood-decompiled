package com.robinhood.android.trade.options;

import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.window.AndroidDialog_androidKt;
import androidx.compose.p011ui.window.DialogProperties;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.brokeragecontent.BrokerageDisclosure;
import com.robinhood.android.brokeragecontent.BrokerageResource2;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.options.order.LimitPriceWithSource;
import com.robinhood.android.common.options.order.OptionOrderContext;
import com.robinhood.android.common.options.order.OptionOrderLimitPrice;
import com.robinhood.android.common.options.order.OptionOrderType2;
import com.robinhood.android.common.options.upsell.plchart.ProfitAndLossChartEducationFragment;
import com.robinhood.android.common.options.utils.PairUtils;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhMoneyInputView;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.OptionExtensions;
import com.robinhood.android.common.util.transition.Interpolators;
import com.robinhood.android.common.util.transition.Rotation;
import com.robinhood.android.common.util.transition.SimpleSlide;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.designsystem.infotag.RdsInfoTag;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks2;
import com.robinhood.android.lib.trade.BaseOrderFragment;
import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.lib.trade.view.TradeAccountSwitcherState;
import com.robinhood.android.lib.trade.view.TradeAccountSwitcherView;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiButton2;
import com.robinhood.android.mcw.contracts.QuickConversionCallbacks;
import com.robinhood.android.mcw.contracts.QuickConversionKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.options.contracts.OptionOrderDetailFragmentKey;
import com.robinhood.android.options.contracts.OptionStatisticsFragmentKey;
import com.robinhood.android.options.contracts.OptionsProfitLossChartAnalysisFragmentKey;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.android.regiongate.OptionsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.android.trade.options.OptionOrderFragment;
import com.robinhood.android.trade.options.OptionOrderLimitPriceRowComposeView;
import com.robinhood.android.trade.options.OptionOrderMarketPriceRowComposeView;
import com.robinhood.android.trade.options.OptionOrderQuantityRowComposeView;
import com.robinhood.android.trade.options.OptionOrderStopTriggerPriceRowView;
import com.robinhood.android.trade.options.OptionOrderTimeInForcePickerDialogFragment;
import com.robinhood.android.trade.options.OptionOrderTimeInForceRowComposeView;
import com.robinhood.android.trade.options.OptionOrderTotalCostRowComposeView;
import com.robinhood.android.trade.options.OptionOrderTradingSessionPickerDialogFragment;
import com.robinhood.android.trade.options.OptionOrderTradingSessionRowComposeView;
import com.robinhood.android.trade.options.OptionOrderViewState;
import com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarComposeView;
import com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarViewState;
import com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarViewState3;
import com.robinhood.android.trade.options.confirmation.OptionOrderConfirmationFragment;
import com.robinhood.android.trade.options.databinding.MergeOptionOrderBinding;
import com.robinhood.android.trade.options.extensions.OptionOrderContexts;
import com.robinhood.android.trade.options.extensions.OptionOrderSource;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartView;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossInfoBar;
import com.robinhood.android.trade.options.profitloss.ProfitLossAdditionalInfo;
import com.robinhood.android.trade.options.profitloss.UserEnteredProfitLossParams;
import com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver;
import com.robinhood.android.trade.options.validation.SufficientBuyingPowerCryptoFailure;
import com.robinhood.android.transfers.contracts.DepositFundsDeepLink;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.TransferV2;
import com.robinhood.android.transfers.contracts.experiments.OptionsOrderChecksToGuided;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.android.util.PriceTextWatcher;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.android.util.style.ThemeAttributes;
import com.robinhood.compose.bento.component.BentoPogKt;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.alerts.BentoAlerts2;
import com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.ApiCollateral;
import com.robinhood.models.api.ApiOptionsProfitLossChartRequestParams;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.OptionOrder;
import com.robinhood.models.p320db.OptionOrderType;
import com.robinhood.models.p320db.OptionSettings;
import com.robinhood.models.p320db.OrderDirection;
import com.robinhood.models.p320db.OrderTimeInForce;
import com.robinhood.models.p355ui.OptionChainDisplayMode;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.models.p355ui.OptionStatisticsTradableState;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.OptionOrderFormAction;
import com.robinhood.models.serverdriven.experimental.api.Pictogram;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.p347db.GenericOrderCheckAction;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.converters.options.OptionOrders2;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.OptionOrderMeta;
import com.robinhood.rosetta.eventlogging.OptionOrderPayload;
import com.robinhood.rosetta.eventlogging.OptionOrderRelationType;
import com.robinhood.rosetta.eventlogging.OptionRelatedOrderData;
import com.robinhood.rosetta.eventlogging.OrderCheckAbortReason;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.DirectResourceReference;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherBottomSheetFragmentKey;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.account.contracts.switcher.SduiAccountSwitcherBottomSheetFragmentKey;
import com.robinhood.shared.common.contracts.RemoteDisclosureKey;
import com.robinhood.shared.settings.contracts.Constants6;
import com.robinhood.shared.settings.contracts.SettingsPage;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.datetime.ZoneIds;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.Transitions2;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import contracts.account_switcher.proto.p427v1.SurfaceDto;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import java.math.BigDecimal;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import p479j$.time.Clock;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import rosetta.option.MarketabilityType;
import rosetta.option.OptionOrderFormSource;

/* compiled from: OptionOrderFragment.kt */
@Metadata(m3635d1 = {"\u0000¼\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 Ô\u00022\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\bÕ\u0002Ö\u0002×\u0002Ô\u0002B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010#\u001a\u00020\u000e\"\b\b\u0000\u0010\u001e*\u00020\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010!H\u0003¢\u0006\u0004\b#\u0010$J-\u0010*\u001a\u00020\u000e2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010)\u001a\u0004\u0018\u00010'H\u0003¢\u0006\u0004\b*\u0010+J?\u0010/\u001a\u00020\u000e\"\b\b\u0000\u0010\u001e*\u00020\u001d2\u0012\u0010.\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000-0,2\u0010\b\u0002\u0010\"\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010!H\u0003¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u000eH\u0002¢\u0006\u0004\b1\u0010\u000bJ\u000f\u00102\u001a\u00020\u000eH\u0002¢\u0006\u0004\b2\u0010\u000bJ\u000f\u00103\u001a\u00020\u000eH\u0002¢\u0006\u0004\b3\u0010\u000bJ\u000f\u00104\u001a\u00020\u000eH\u0002¢\u0006\u0004\b4\u0010\u000bJ\u0017\u00107\u001a\u00020\u000e2\u0006\u00106\u001a\u000205H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u000eH\u0002¢\u0006\u0004\b9\u0010\u000bJ\u000f\u0010:\u001a\u00020\u000eH\u0002¢\u0006\u0004\b:\u0010\u000bJ\u0013\u0010<\u001a\u00020\u000e*\u00020;H\u0003¢\u0006\u0004\b<\u0010=J\u001b\u0010@\u001a\u00020\u000e*\u00020;2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ!\u0010F\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020B2\b\u0010E\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u000eH\u0016¢\u0006\u0004\bH\u0010\u000bJ!\u0010L\u001a\u00020>2\u0006\u0010J\u001a\u00020I2\b\u0010K\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bL\u0010MJ!\u0010N\u001a\u00020>2\u0006\u0010J\u001a\u00020I2\b\u0010K\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bN\u0010MJ\u000f\u0010O\u001a\u00020\u000eH\u0016¢\u0006\u0004\bO\u0010\u000bJ\u000f\u0010P\u001a\u00020\u000eH\u0016¢\u0006\u0004\bP\u0010\u000bJ\u0017\u0010Q\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\bQ\u0010\u0018J\u001d\u0010U\u001a\u00020\u000e2\u0006\u0010S\u001a\u00020R2\u0006\u0010T\u001a\u00020>¢\u0006\u0004\bU\u0010VJ\u001d\u0010Y\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020W2\u0006\u0010T\u001a\u00020>¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\u000eH\u0016¢\u0006\u0004\b[\u0010\u000bJ1\u0010d\u001a\u00020\u000e2\b\u0010]\u001a\u0004\u0018\u00010\\2\u0006\u0010_\u001a\u00020^2\u0006\u0010a\u001a\u00020`2\u0006\u0010c\u001a\u00020bH\u0016¢\u0006\u0004\bd\u0010eJ\u0017\u0010h\u001a\u00020\u000e2\u0006\u0010g\u001a\u00020fH\u0016¢\u0006\u0004\bh\u0010iJ\u0017\u0010l\u001a\u00020\u000e2\u0006\u0010k\u001a\u00020jH\u0016¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u00020\u000eH\u0016¢\u0006\u0004\bn\u0010\u000bJ\u0017\u0010p\u001a\u00020\u000e2\u0006\u0010o\u001a\u00020\\H\u0017¢\u0006\u0004\bp\u0010qJ\u0017\u0010s\u001a\u00020\u000e2\u0006\u0010r\u001a\u00020\\H\u0016¢\u0006\u0004\bs\u0010qJ\u000f\u0010t\u001a\u00020\u000eH\u0016¢\u0006\u0004\bt\u0010\u000bJ\u0017\u0010u\u001a\u00020\u000e2\u0006\u0010c\u001a\u00020bH\u0016¢\u0006\u0004\bu\u0010vJ\u000f\u0010w\u001a\u00020\u000eH\u0016¢\u0006\u0004\bw\u0010\u000bJ\u0017\u0010z\u001a\u00020\u000e2\u0006\u0010y\u001a\u00020xH\u0016¢\u0006\u0004\bz\u0010{J\u0017\u0010}\u001a\u00020\u000e2\u0006\u0010|\u001a\u00020>H\u0016¢\u0006\u0004\b}\u0010~J\u000f\u0010\u007f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u007f\u0010\u000bJ\u0011\u0010\u0080\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0080\u0001\u0010\u000bJ\u0011\u0010\u0081\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0081\u0001\u0010\u000bJ\u0011\u0010\u0082\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0082\u0001\u0010\u000bJ\u0011\u0010\u0083\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0083\u0001\u0010\u000bJ\u0011\u0010\u0084\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0084\u0001\u0010\u000bJ\u0011\u0010\u0085\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0085\u0001\u0010\u000bJ*\u0010\u0088\u0001\u001a\u00020\u000e2\u000e\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020j0\u0086\u00012\u0006\u0010c\u001a\u00020bH\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0011\u0010\u008a\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u008a\u0001\u0010\u000bJ\u001c\u0010\u008d\u0001\u001a\u00030\u008c\u00012\u0007\u0010\u008b\u0001\u001a\u00020\u0002H\u0016¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u001b\u0010\u008f\u0001\u001a\u00020\u000e2\u0007\u0010\u008b\u0001\u001a\u00020\u0002H\u0016¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u0012\u0010\u0091\u0001\u001a\u00020>H\u0016¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0011\u0010\u0093\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b\u0093\u0001\u0010\u000bJ\u001c\u0010\u0096\u0001\u001a\u00020\u000e2\b\u0010\u0095\u0001\u001a\u00030\u0094\u0001H\u0016¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001c\u0010\u009a\u0001\u001a\u00020\u000e2\b\u0010\u0099\u0001\u001a\u00030\u0098\u0001H\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\"\u0010\u009c\u0001\u001a\u00020\u000e2\u0006\u0010c\u001a\u00020b2\u0006\u0010_\u001a\u00020^H\u0016¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u001c\u0010 \u0001\u001a\u00020\u000e2\b\u0010\u009f\u0001\u001a\u00030\u009e\u0001H\u0016¢\u0006\u0006\b \u0001\u0010¡\u0001J\u0011\u0010¢\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b¢\u0001\u0010\u000bJ\u0011\u0010£\u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b£\u0001\u0010\u000bJ\u001a\u0010¤\u0001\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020WH\u0016¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u001a\u0010§\u0001\u001a\u00020\u000e2\u0007\u0010¦\u0001\u001a\u00020bH\u0016¢\u0006\u0005\b§\u0001\u0010vJ\u001c\u0010ª\u0001\u001a\u00020\u000e2\b\u0010©\u0001\u001a\u00030¨\u0001H\u0016¢\u0006\u0006\bª\u0001\u0010«\u0001J\u0013\u0010¬\u0001\u001a\u00020>H\u0096\u0001¢\u0006\u0006\b¬\u0001\u0010\u0092\u0001R*\u0010®\u0001\u001a\u00030\u00ad\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b®\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R*\u0010µ\u0001\u001a\u00030´\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R*\u0010¼\u0001\u001a\u00030»\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R*\u0010Ã\u0001\u001a\u00030Â\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\bÃ\u0001\u0010Ä\u0001\u001a\u0006\bÅ\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R!\u0010Î\u0001\u001a\u00030É\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001R!\u0010Ó\u0001\u001a\u00030Ï\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÐ\u0001\u0010Ë\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001R \u0010×\u0001\u001a\u00020B8BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÔ\u0001\u0010Ë\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001R!\u0010Ü\u0001\u001a\u00030Ø\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÙ\u0001\u0010Ë\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001R!\u0010ß\u0001\u001a\u00030Ø\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÝ\u0001\u0010Ë\u0001\u001a\u0006\bÞ\u0001\u0010Û\u0001R!\u0010ä\u0001\u001a\u00030à\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bá\u0001\u0010Ë\u0001\u001a\u0006\bâ\u0001\u0010ã\u0001R!\u0010ç\u0001\u001a\u00030Ø\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bå\u0001\u0010Ë\u0001\u001a\u0006\bæ\u0001\u0010Û\u0001R!\u0010ê\u0001\u001a\u00030Ø\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bè\u0001\u0010Ë\u0001\u001a\u0006\bé\u0001\u0010Û\u0001R!\u0010í\u0001\u001a\u00030Ø\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bë\u0001\u0010Ë\u0001\u001a\u0006\bì\u0001\u0010Û\u0001R!\u0010ð\u0001\u001a\u00030Ø\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bî\u0001\u0010Ë\u0001\u001a\u0006\bï\u0001\u0010Û\u0001R!\u0010õ\u0001\u001a\u00030ñ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bò\u0001\u0010Ë\u0001\u001a\u0006\bó\u0001\u0010ô\u0001R!\u0010ø\u0001\u001a\u00030Ø\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bö\u0001\u0010Ë\u0001\u001a\u0006\b÷\u0001\u0010Û\u0001R#\u0010ý\u0001\u001a\u0005\u0018\u00010ù\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bú\u0001\u0010Ë\u0001\u001a\u0006\bû\u0001\u0010ü\u0001R!\u0010\u0080\u0002\u001a\u00030Ø\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bþ\u0001\u0010Ë\u0001\u001a\u0006\bÿ\u0001\u0010Û\u0001R#\u0010\u0083\u0002\u001a\u0005\u0018\u00010ù\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0081\u0002\u0010Ë\u0001\u001a\u0006\b\u0082\u0002\u0010ü\u0001R!\u0010\u0088\u0002\u001a\u00030\u0084\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0085\u0002\u0010Ë\u0001\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002R!\u0010\u008d\u0002\u001a\u00030\u0089\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008a\u0002\u0010Ë\u0001\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002R!\u0010\u0092\u0002\u001a\u00030\u008e\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008f\u0002\u0010Ë\u0001\u001a\u0006\b\u0090\u0002\u0010\u0091\u0002R7\u0010\u0099\u0002\u001a\u0004\u0018\u00010W2\t\u0010\u0093\u0002\u001a\u0004\u0018\u00010W8B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b\u0094\u0002\u0010\u0095\u0002\u001a\u0006\b\u0096\u0002\u0010\u0097\u0002\"\u0006\b\u0098\u0002\u0010¥\u0001R!\u0010\u009f\u0002\u001a\u00030\u009a\u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009b\u0002\u0010\u009c\u0002\u001a\u0006\b\u009d\u0002\u0010\u009e\u0002R!\u0010¤\u0002\u001a\u00030 \u00028BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¡\u0002\u0010Ë\u0001\u001a\u0006\b¢\u0002\u0010£\u0002R\u0017\u0010¥\u0002\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0002\u0010¦\u0002R\u0018\u0010§\u0002\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0002\u0010¨\u0002R\u0018\u0010©\u0002\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0002\u0010¨\u0002R\u001f\u0010ª\u0002\u001a\u00020I8\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bª\u0002\u0010¦\u0002\u001a\u0006\b«\u0002\u0010¬\u0002R\u001f\u0010\u00ad\u0002\u001a\u00020>8\u0016X\u0096D¢\u0006\u0010\n\u0006\b\u00ad\u0002\u0010®\u0002\u001a\u0006\b¯\u0002\u0010\u0092\u0001R \u0010±\u0002\u001a\u00030°\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b±\u0002\u0010²\u0002\u001a\u0006\b³\u0002\u0010´\u0002R*\u0010¶\u0002\u001a\u00030µ\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b¶\u0002\u0010·\u0002\u001a\u0006\b¸\u0002\u0010¹\u0002\"\u0006\bº\u0002\u0010»\u0002R\u001c\u0010½\u0002\u001a\u0005\u0018\u00010¼\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0002\u0010¾\u0002R\u001c\u0010¿\u0002\u001a\u0005\u0018\u00010Ø\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0002\u0010À\u0002R\u001b\u0010Á\u0002\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0002\u0010Â\u0002R\u001b\u0010Ã\u0002\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0002\u0010Â\u0002R(\u0010Ä\u0002\u001a\u00020>8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0006\bÄ\u0002\u0010®\u0002\u001a\u0006\bÅ\u0002\u0010\u0092\u0001\"\u0005\bÆ\u0002\u0010~R\u0018\u0010Ê\u0002\u001a\u00030Ç\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÈ\u0002\u0010É\u0002R\u0017\u0010Ì\u0002\u001a\u00020I8VX\u0096\u0004¢\u0006\b\u001a\u0006\bË\u0002\u0010¬\u0002R\u0017\u0010Î\u0002\u001a\u00020>8VX\u0096\u0004¢\u0006\b\u001a\u0006\bÍ\u0002\u0010\u0092\u0001R\u001f\u0010Ó\u0002\u001a\n\u0012\u0005\u0012\u00030Ð\u00020Ï\u00028\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\bÑ\u0002\u0010Ò\u0002¨\u0006Ø\u0002"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderFragment;", "Lcom/robinhood/android/lib/trade/BaseOrderFragment;", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "Lcom/robinhood/android/trade/options/validation/OptionOrderValidationFailureResolver;", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarAnalyticable;", "Lcom/robinhood/android/trade/options/OptionOrderTimeInForcePickerDialogFragment$Callbacks;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$OnClickListener;", "Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCombinedCallbacks;", "Lcom/robinhood/android/mcw/contracts/QuickConversionCallbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "Lcom/robinhood/android/util/PriceTextWatcher;", "priceTextWatcher", "", "addTextChangedListener", "(Lcom/robinhood/android/util/PriceTextWatcher;)V", "Lcom/robinhood/android/trade/options/OptionOrderViewState$Marketability$MarketabilityType;", "marketabilityType", "showOptionMarketabilityBottomSheet", "(Lcom/robinhood/android/trade/options/OptionOrderViewState$Marketability$MarketabilityType;)V", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "toolbar", "onConfigureToolbar", "(Lcom/robinhood/android/common/ui/view/RhToolbar;)V", "Lcom/robinhood/android/trade/options/OptionOrderViewState;", "state", "refreshUi", "(Lcom/robinhood/android/trade/options/OptionOrderViewState;)V", "Landroid/os/Parcelable;", "ActionT", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "content", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "actionHandler", "DialogContent", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/models/serverdriven/experimental/api/Pictogram;", "pog", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "foregroundColor", "backgroundColor", "Pog", "(Lcom/robinhood/models/serverdriven/experimental/api/Pictogram;Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;Landroidx/compose/runtime/Composer;I)V", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/Button;", CarResultComposable2.BUTTONS, "ButtonList", "(Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Landroidx/compose/runtime/Composer;II)V", "clearStopPrice", "updateLimitPriceColor", "updateContractQuantityColor", "updateCollateralVisibility", "Lcom/robinhood/android/common/options/order/OptionOrderContext;", "orderContext", "updateReviewButtonVisibility", "(Lcom/robinhood/android/common/options/order/OptionOrderContext;)V", "updateInfoTextVisibility", "launchFullMarketDataActivity", "Lcom/robinhood/android/trade/options/OptionOrderFragment$ProfitLossChartContext$NormalDevice;", "initializeViews", "(Lcom/robinhood/android/trade/options/OptionOrderFragment$ProfitLossChartContext$NormalDevice;)V", "", "chartVisible", "setChartVisibility", "(Lcom/robinhood/android/trade/options/OptionOrderFragment$ProfitLossChartContext$NormalDevice;Z)V", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "", "dialogId", "passthroughArgs", "onPrimaryButtonClicked", "(ILandroid/os/Bundle;)Z", "onLearnMoreActionClicked", "onStart", "onStop", "configureToolbar", "Lcom/robinhood/models/db/OptionOrderType;", "optionOrderType", "editedByUser", "setOptionOrderType", "(Lcom/robinhood/models/db/OptionOrderType;Z)V", "Lcom/robinhood/models/db/OrderTimeInForce;", "timeInForce", "setTimeInForce", "(Lcom/robinhood/models/db/OrderTimeInForce;Z)V", "validateAndReviewOrder", "Ljava/math/BigDecimal;", "amount", "Lcom/robinhood/models/api/BrokerageAccountType;", "brokerageAccountType", "Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;", "transferAccountType", "", "accountNumber", "launchTransfers", "(Ljava/math/BigDecimal;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/bonfire/ApiTransferAccount$TransferAccountType;Ljava/lang/String;)V", "Landroid/net/Uri;", "uri", "launchDeepLink", "(Landroid/net/Uri;)V", "Ljava/util/UUID;", "orderId", "viewExistingOptionOrder", "(Ljava/util/UUID;)V", "promptForLimitPrice", "newQuantity", "updateQuantity", "(Ljava/math/BigDecimal;)V", "newLimitPrice", "updateLimitPrice", "overrideDayTradeChecks", "launchDayTradeSettings", "(Ljava/lang/String;)V", "overrideDtbpChecks", "Lcom/robinhood/models/db/OrderDirection;", "direction", "overrideDirection", "(Lcom/robinhood/models/db/OrderDirection;)V", "preserveUserInput", "setPreserveUserInput", "(Z)V", "launchRhsConversion", "promptAndClearStopPrice", "disableStopPrice", "promptForStopPrice", "disableStopPriceAndPromptLimit", "cancelPendingCryptoOrders", "clearCancelPendingCryptoState", "", "optionOrderRhIds", "cancelBlockingOrders", "(Ljava/util/List;Ljava/lang/String;)V", "onFormStateUpdated", "formState", "Landroidx/constraintlayout/widget/ConstraintSet;", "getConstraintsForState", "(Lcom/robinhood/android/lib/trade/DefaultOrderState;)Landroidx/constraintlayout/widget/ConstraintSet;", "onFormStateAnimationEnd", "(Lcom/robinhood/android/lib/trade/DefaultOrderState;)V", "onBackPressed", "()Z", "performSubmitOrder", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "args", "onAccountSwitcherCtaClicked", "(Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;)V", "Lcontracts/account_switcher/proto/v1/SurfaceDto;", "surface", "showSduiAccountSwitcher", "(Lcontracts/account_switcher/proto/v1/SurfaceDto;)V", "onAccountSelected", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;)V", "", "duration", "onSwipeToSubmitAnimationStart", "(J)V", "onSwipeToSubmitAnimationComplete", "onRefreshAccountsClicked", "onTimeInForcePicked", "(Lcom/robinhood/models/db/OrderTimeInForce;)V", "message", "onConversionComplete", "Lcom/robinhood/models/serverdriven/db/GenericOrderCheckAction;", "action", "onConversionOrderCheckAction", "(Lcom/robinhood/models/serverdriven/db/GenericOrderCheckAction;)V", "onDismissUnsupportedFeatureDialog", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "j$/time/Clock", Card.Icon.CLOCK, "Lj$/time/Clock;", "getClock", "()Lj$/time/Clock;", "setClock", "(Lj$/time/Clock;)V", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "getMoshi", "()Lcom/robinhood/utils/moshi/LazyMoshi;", "setMoshi", "(Lcom/robinhood/utils/moshi/LazyMoshi;)V", "Lcom/robinhood/android/trade/options/databinding/MergeOptionOrderBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBinding", "()Lcom/robinhood/android/trade/options/databinding/MergeOptionOrderBinding;", "binding", "Lcom/robinhood/android/lib/trade/view/TradeAccountSwitcherView;", "accountSwitcherBtn$delegate", "getAccountSwitcherBtn", "()Lcom/robinhood/android/lib/trade/view/TradeAccountSwitcherView;", "accountSwitcherBtn", "reviewBtnHolder$delegate", "getReviewBtnHolder", "()Landroid/view/View;", "reviewBtnHolder", "Landroid/widget/TextView;", "contractSubtitleLabel$delegate", "getContractSubtitleLabel", "()Landroid/widget/TextView;", "contractSubtitleLabel", "contractsLabel$delegate", "getContractsLabel", "contractsLabel", "Landroid/widget/EditText;", "contractsEdt$delegate", "getContractsEdt", "()Landroid/widget/EditText;", "contractsEdt", "priceLabel$delegate", "getPriceLabel", "priceLabel", "bidAskTxt$delegate", "getBidAskTxt", "bidAskTxt", "bidAskSingleLegTxt$delegate", "getBidAskSingleLegTxt", "bidAskSingleLegTxt", "stopPriceLabel$delegate", "getStopPriceLabel", "stopPriceLabel", "Lcom/robinhood/android/common/ui/view/RhMoneyInputView;", "stopPriceInputView$delegate", "getStopPriceInputView", "()Lcom/robinhood/android/common/ui/view/RhMoneyInputView;", "stopPriceInputView", "releasedCollateralTxt$delegate", "getReleasedCollateralTxt", "releasedCollateralTxt", "Landroidx/constraintlayout/widget/Group;", "releasedCollateralGroup$delegate", "getReleasedCollateralGroup", "()Landroidx/constraintlayout/widget/Group;", "releasedCollateralGroup", "collateralTxt$delegate", "getCollateralTxt", "collateralTxt", "collateralGroup$delegate", "getCollateralGroup", "collateralGroup", "Landroidx/constraintlayout/widget/ConstraintLayout;", "numpadContainer$delegate", "getNumpadContainer", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "numpadContainer", "Lcom/robinhood/android/designsystem/infotag/RdsInfoTag;", "marketabilityInfoTag$delegate", "getMarketabilityInfoTag", "()Lcom/robinhood/android/designsystem/infotag/RdsInfoTag;", "marketabilityInfoTag", "Landroidx/compose/ui/platform/ComposeView;", "sduiAlertView$delegate", "getSduiAlertView", "()Landroidx/compose/ui/platform/ComposeView;", "sduiAlertView", "<set-?>", "timeInForceBundle$delegate", "Lkotlin/properties/ReadWriteProperty;", "getTimeInForceBundle", "()Lcom/robinhood/models/db/OrderTimeInForce;", "setTimeInForceBundle", "timeInForceBundle", "Lcom/robinhood/android/trade/options/OptionOrderDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "getDuxo", "()Lcom/robinhood/android/trade/options/OptionOrderDuxo;", "duxo", "Lcom/robinhood/android/trade/options/OptionOrderFragment$Callbacks;", "callbacks$delegate", "getCallbacks", "()Lcom/robinhood/android/trade/options/OptionOrderFragment$Callbacks;", "callbacks", "reviewingConstraintLayoutRes", "I", "initialConstraints", "Landroidx/constraintlayout/widget/ConstraintSet;", "reviewingConstraints", "contentRes", "getContentRes", "()I", "useDesignSystemToolbar", "Z", "getUseDesignSystemToolbar", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarAnalyticable$Source;", "source", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarAnalyticable$Source;", "getSource", "()Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBarAnalyticable$Source;", "j$/time/Instant", "lastExpanded", "Lj$/time/Instant;", "getLastExpanded", "()Lj$/time/Instant;", "setLastExpanded", "(Lj$/time/Instant;)V", "Landroid/view/ViewGroup;", "toolbarContent", "Landroid/view/ViewGroup;", "actionOptionOrderTypeTxt", "Landroid/widget/TextView;", "actionOptionOrderTypeContainer", "Landroid/view/View;", "optionOrderToolbarDiscoveryDot", "submitBeforeAnimation", "getSubmitBeforeAnimation", "setSubmitBeforeAnimation", "Lcom/robinhood/android/trade/options/OptionOrderFragment$ProfitLossChartContext;", "getProfitLossChartContext", "()Lcom/robinhood/android/trade/options/OptionOrderFragment$ProfitLossChartContext;", "profitLossChartContext", "getInitialLayoutRes", "initialLayoutRes", "getChartContainerVisibility", "chartContainerVisibility", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "requiresRegionGates", "Companion", "Callbacks", "ProfitLossChartContext", "Args", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class OptionOrderFragment extends BaseOrderFragment<DefaultOrderState> implements OptionOrderValidationFailureResolver, OptionsProfitLossAnalytics2, OptionOrderTimeInForcePickerDialogFragment.Callbacks, RhBottomSheetDialogFragment.OnClickListener, AccountSwitcherCallbacks2, QuickConversionCallbacks, RegionGated {
    private static final DirectResourceReference<ColorStateList> CONTRACT_QUANTITY_HINT_TEXT_COLOR;
    private static final long LIMIT_PRICE_DEBOUNCE_TIME = 500;
    private static final DirectResourceReference<ColorStateList> LIMIT_PRICE_HINT_TEXT_COLOR;
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: accountSwitcherBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 accountSwitcherBtn;
    private View actionOptionOrderTypeContainer;
    private TextView actionOptionOrderTypeTxt;

    /* renamed from: bidAskSingleLegTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 bidAskSingleLegTxt;

    /* renamed from: bidAskTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 bidAskTxt;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public Clock clock;

    /* renamed from: collateralGroup$delegate, reason: from kotlin metadata */
    private final Interfaces2 collateralGroup;

    /* renamed from: collateralTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 collateralTxt;
    private final int contentRes;

    /* renamed from: contractSubtitleLabel$delegate, reason: from kotlin metadata */
    private final Interfaces2 contractSubtitleLabel;

    /* renamed from: contractsEdt$delegate, reason: from kotlin metadata */
    private final Interfaces2 contractsEdt;

    /* renamed from: contractsLabel$delegate, reason: from kotlin metadata */
    private final Interfaces2 contractsLabel;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    public ExperimentsStore experimentsStore;
    private final ConstraintSet initialConstraints;
    private Instant lastExpanded;

    /* renamed from: marketabilityInfoTag$delegate, reason: from kotlin metadata */
    private final Interfaces2 marketabilityInfoTag;
    public LazyMoshi moshi;

    /* renamed from: numpadContainer$delegate, reason: from kotlin metadata */
    private final Interfaces2 numpadContainer;
    private View optionOrderToolbarDiscoveryDot;

    /* renamed from: priceLabel$delegate, reason: from kotlin metadata */
    private final Interfaces2 priceLabel;

    /* renamed from: releasedCollateralGroup$delegate, reason: from kotlin metadata */
    private final Interfaces2 releasedCollateralGroup;

    /* renamed from: releasedCollateralTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 releasedCollateralTxt;

    /* renamed from: reviewBtnHolder$delegate, reason: from kotlin metadata */
    private final Interfaces2 reviewBtnHolder;
    private final int reviewingConstraintLayoutRes;
    private final ConstraintSet reviewingConstraints;

    /* renamed from: sduiAlertView$delegate, reason: from kotlin metadata */
    private final Interfaces2 sduiAlertView;
    private final OptionsProfitLossAnalytics2.Source source;

    /* renamed from: stopPriceInputView$delegate, reason: from kotlin metadata */
    private final Interfaces2 stopPriceInputView;

    /* renamed from: stopPriceLabel$delegate, reason: from kotlin metadata */
    private final Interfaces2 stopPriceLabel;
    private boolean submitBeforeAnimation;

    /* renamed from: timeInForceBundle$delegate, reason: from kotlin metadata */
    private final Interfaces3 timeInForceBundle;
    private ViewGroup toolbarContent;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionOrderFragment.class, "binding", "getBinding()Lcom/robinhood/android/trade/options/databinding/MergeOptionOrderBinding;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderFragment.class, "accountSwitcherBtn", "getAccountSwitcherBtn()Lcom/robinhood/android/lib/trade/view/TradeAccountSwitcherView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderFragment.class, "reviewBtnHolder", "getReviewBtnHolder()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderFragment.class, "contractSubtitleLabel", "getContractSubtitleLabel()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderFragment.class, "contractsLabel", "getContractsLabel()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderFragment.class, "contractsEdt", "getContractsEdt()Landroid/widget/EditText;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderFragment.class, "priceLabel", "getPriceLabel()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderFragment.class, "bidAskTxt", "getBidAskTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderFragment.class, "bidAskSingleLegTxt", "getBidAskSingleLegTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderFragment.class, "stopPriceLabel", "getStopPriceLabel()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderFragment.class, "stopPriceInputView", "getStopPriceInputView()Lcom/robinhood/android/common/ui/view/RhMoneyInputView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderFragment.class, "releasedCollateralTxt", "getReleasedCollateralTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderFragment.class, "releasedCollateralGroup", "getReleasedCollateralGroup()Landroidx/constraintlayout/widget/Group;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderFragment.class, "collateralTxt", "getCollateralTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderFragment.class, "collateralGroup", "getCollateralGroup()Landroidx/constraintlayout/widget/Group;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderFragment.class, "numpadContainer", "getNumpadContainer()Landroidx/constraintlayout/widget/ConstraintLayout;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderFragment.class, "marketabilityInfoTag", "getMarketabilityInfoTag()Lcom/robinhood/android/designsystem/infotag/RdsInfoTag;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderFragment.class, "sduiAlertView", "getSduiAlertView()Landroidx/compose/ui/platform/ComposeView;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(OptionOrderFragment.class, "timeInForceBundle", "getTimeInForceBundle()Lcom/robinhood/models/db/OrderTimeInForce;", 0)), Reflection.property1(new PropertyReference1Impl(OptionOrderFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/trade/options/OptionOrderFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderFragment$Callbacks;", "Lcom/robinhood/android/lib/trade/BaseOrderFragment$Callbacks;", "onLoadPassthroughContext", "", "passthroughContext", "Lcom/robinhood/android/trade/options/confirmation/OptionOrderConfirmationFragment$Args$PassthroughContext;", "onProfitLossAnalysisSelected", "key", "Lcom/robinhood/android/options/contracts/OptionsProfitLossChartAnalysisFragmentKey;", "startOptionOrderTypeFlow", "optionOrderContext", "Lcom/robinhood/android/common/options/order/OptionOrderContext;", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends BaseOrderFragment.Callbacks {
        void onLoadPassthroughContext(OptionOrderConfirmationFragment.Args.PassthroughContext passthroughContext);

        void onProfitLossAnalysisSelected(OptionsProfitLossChartAnalysisFragmentKey key);

        void startOptionOrderTypeFlow(OptionOrderContext optionOrderContext);
    }

    /* compiled from: OptionOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DefaultOrderState.values().length];
            try {
                iArr[DefaultOrderState.EDITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DefaultOrderState.REVIEWING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ButtonList$lambda$90(OptionOrderFragment optionOrderFragment, ImmutableList immutableList, SduiActionHandler sduiActionHandler, int i, int i2, Composer composer, int i3) {
        optionOrderFragment.ButtonList(immutableList, sduiActionHandler, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DialogContent$lambda$85(OptionOrderFragment optionOrderFragment, GenericAlertContent genericAlertContent, SduiActionHandler sduiActionHandler, int i, int i2, Composer composer, int i3) {
        optionOrderFragment.DialogContent(genericAlertContent, sduiActionHandler, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Pog$lambda$88(OptionOrderFragment optionOrderFragment, Pictogram pictogram, ThemedColor themedColor, ThemedColor themedColor2, int i, Composer composer, int i2) {
        optionOrderFragment.Pog(pictogram, themedColor, themedColor2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public boolean onPrimaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        return true;
    }

    @Override // com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver
    public OptionOrderValidationFailureResolver.ActionWithOverrideName handleOrderCheckAction(OptionOrderFormAction optionOrderFormAction, OptionOrderContext optionOrderContext) {
        return OptionOrderValidationFailureResolver.DefaultImpls.handleOrderCheckAction(this, optionOrderFormAction, optionOrderContext);
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public void logChartDisappear(AnalyticsLogger analyticsLogger) {
        OptionsProfitLossAnalytics2.DefaultImpls.logChartDisappear(this, analyticsLogger);
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public void logOptionsProfitLossAnalysisBtnAppear(AnalyticsLogger analyticsLogger) {
        OptionsProfitLossAnalytics2.DefaultImpls.logOptionsProfitLossAnalysisBtnAppear(this, analyticsLogger);
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public void logOptionsProfitLossAnalysisBtnTap(AnalyticsLogger analyticsLogger) {
        OptionsProfitLossAnalytics2.DefaultImpls.logOptionsProfitLossAnalysisBtnTap(this, analyticsLogger);
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public void logOptionsProfitLossInfoBarAppear(AnalyticsLogger analyticsLogger) {
        OptionsProfitLossAnalytics2.DefaultImpls.logOptionsProfitLossInfoBarAppear(this, analyticsLogger);
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public void logOptionsProfitLossInfoBarCollapse(AnalyticsLogger analyticsLogger) {
        OptionsProfitLossAnalytics2.DefaultImpls.logOptionsProfitLossInfoBarCollapse(this, analyticsLogger);
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public void logOptionsProfitLossInfoBarCollapse(EventLogger eventLogger) {
        OptionsProfitLossAnalytics2.DefaultImpls.logOptionsProfitLossInfoBarCollapse(this, eventLogger);
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public void logOptionsProfitLossInfoBarError(AnalyticsLogger analyticsLogger) {
        OptionsProfitLossAnalytics2.DefaultImpls.logOptionsProfitLossInfoBarError(this, analyticsLogger);
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public void logOptionsProfitLossInfoBarExpand(AnalyticsLogger analyticsLogger) {
        OptionsProfitLossAnalytics2.DefaultImpls.logOptionsProfitLossInfoBarExpand(this, analyticsLogger);
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public void logOptionsProfitLossInfoBarExpand(EventLogger eventLogger) {
        OptionsProfitLossAnalytics2.DefaultImpls.logOptionsProfitLossInfoBarExpand(this, eventLogger);
    }

    @Override // com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver
    public String loggingIdentifier(OptionOrderFormAction optionOrderFormAction) {
        return OptionOrderValidationFailureResolver.DefaultImpls.loggingIdentifier(this, optionOrderFormAction);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onAllAccountsSelected() {
        AccountSwitcherCallbacks2.DefaultImpls.onAllAccountsSelected(this);
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public void onInfoBarClickWithLogging(OptionsProfitLossInfoBar optionsProfitLossInfoBar, AnalyticsLogger analyticsLogger, EventLogger eventLogger, Function1<? super Boolean, Unit> function1, Function1<? super Throwable, Unit> function12) {
        OptionsProfitLossAnalytics2.DefaultImpls.onInfoBarClickWithLogging(this, optionsProfitLossInfoBar, analyticsLogger, eventLogger, function1, function12);
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onPendingApplicationClicked(String str, BrokerageAccountType brokerageAccountType) {
        AccountSwitcherCallbacks2.DefaultImpls.onPendingApplicationClicked(this, str, brokerageAccountType);
    }

    public OptionOrderFragment() {
        super(DefaultOrderState.EDITING);
        this.$$delegate_0 = new RegionGated2(OptionsRegionGate.INSTANCE);
        this.binding = ViewBinding5.viewBinding(this, OptionOrderFragment$binding$2.INSTANCE);
        this.accountSwitcherBtn = bindView(C29757R.id.account_switcher_btn);
        this.reviewBtnHolder = bindView(C29757R.id.review_btn_holder);
        this.contractSubtitleLabel = bindView(C29757R.id.option_order_contract_subtitle_label);
        this.contractsLabel = bindView(C29757R.id.option_order_contracts_label);
        this.contractsEdt = bindView(C29757R.id.option_order_fragment_contracts_edt);
        this.priceLabel = bindView(C29757R.id.option_order_price_label);
        this.bidAskTxt = bindView(C29757R.id.option_order_bid_ask_txt);
        this.bidAskSingleLegTxt = bindView(C29757R.id.option_order_bid_ask_single_leg_txt);
        this.stopPriceLabel = bindView(C29757R.id.option_order_stop_price_label);
        this.stopPriceInputView = bindView(C29757R.id.option_order_fragment_stop_price_inputview);
        this.releasedCollateralTxt = bindView(C29757R.id.option_order_fragment_released_collateral_txt);
        this.releasedCollateralGroup = bindView(C29757R.id.released_collateral_group);
        this.collateralTxt = bindView(C29757R.id.option_order_fragment_collateral_txt);
        this.collateralGroup = bindView(C29757R.id.collateral_group);
        this.numpadContainer = bindView(C29757R.id.design_system_review_container);
        this.marketabilityInfoTag = bindView(C29757R.id.option_order_marketability_info_tag);
        this.sduiAlertView = bindView(C29757R.id.sdui_alert_view);
        this.timeInForceBundle = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, $$delegatedProperties[18]);
        this.duxo = OldDuxos.oldDuxo(this, OptionOrderDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof OptionOrderFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.reviewingConstraintLayoutRes = C29757R.layout.fragment_option_order_reviewing;
        this.initialConstraints = new ConstraintSet();
        this.reviewingConstraints = new ConstraintSet();
        this.contentRes = C29757R.layout.merge_option_order;
        this.useDesignSystemToolbar = true;
        this.source = OptionsProfitLossAnalytics2.Source.ORDER_FLOW;
        Instant instantNow = Instant.now();
        Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
        this.lastExpanded = instantNow;
    }

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    public final Clock getClock() {
        Clock clock = this.clock;
        if (clock != null) {
            return clock;
        }
        Intrinsics.throwUninitializedPropertyAccessException(Card.Icon.CLOCK);
        return null;
    }

    public final void setClock(Clock clock) {
        Intrinsics.checkNotNullParameter(clock, "<set-?>");
        this.clock = clock;
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

    public final LazyMoshi getMoshi() {
        LazyMoshi lazyMoshi = this.moshi;
        if (lazyMoshi != null) {
            return lazyMoshi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("moshi");
        return null;
    }

    public final void setMoshi(LazyMoshi lazyMoshi) {
        Intrinsics.checkNotNullParameter(lazyMoshi, "<set-?>");
        this.moshi = lazyMoshi;
    }

    static {
        ResourceType.COLOR_STATE_LIST color_state_list = ResourceType.COLOR_STATE_LIST.INSTANCE;
        CONTRACT_QUANTITY_HINT_TEXT_COLOR = new DirectResourceReference<>(color_state_list, C13997R.color.text_secondary_selector);
        LIMIT_PRICE_HINT_TEXT_COLOR = new DirectResourceReference<>(color_state_list, C29757R.color.selector_text_color_hint_disappearing);
    }

    private final MergeOptionOrderBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeOptionOrderBinding) value;
    }

    private final TradeAccountSwitcherView getAccountSwitcherBtn() {
        return (TradeAccountSwitcherView) this.accountSwitcherBtn.getValue(this, $$delegatedProperties[1]);
    }

    private final View getReviewBtnHolder() {
        return (View) this.reviewBtnHolder.getValue(this, $$delegatedProperties[2]);
    }

    private final TextView getContractSubtitleLabel() {
        return (TextView) this.contractSubtitleLabel.getValue(this, $$delegatedProperties[3]);
    }

    private final TextView getContractsLabel() {
        return (TextView) this.contractsLabel.getValue(this, $$delegatedProperties[4]);
    }

    private final EditText getContractsEdt() {
        return (EditText) this.contractsEdt.getValue(this, $$delegatedProperties[5]);
    }

    private final TextView getPriceLabel() {
        return (TextView) this.priceLabel.getValue(this, $$delegatedProperties[6]);
    }

    private final TextView getBidAskTxt() {
        return (TextView) this.bidAskTxt.getValue(this, $$delegatedProperties[7]);
    }

    private final TextView getBidAskSingleLegTxt() {
        return (TextView) this.bidAskSingleLegTxt.getValue(this, $$delegatedProperties[8]);
    }

    private final TextView getStopPriceLabel() {
        return (TextView) this.stopPriceLabel.getValue(this, $$delegatedProperties[9]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RhMoneyInputView getStopPriceInputView() {
        return (RhMoneyInputView) this.stopPriceInputView.getValue(this, $$delegatedProperties[10]);
    }

    private final TextView getReleasedCollateralTxt() {
        return (TextView) this.releasedCollateralTxt.getValue(this, $$delegatedProperties[11]);
    }

    private final Group getReleasedCollateralGroup() {
        return (Group) this.releasedCollateralGroup.getValue(this, $$delegatedProperties[12]);
    }

    private final TextView getCollateralTxt() {
        return (TextView) this.collateralTxt.getValue(this, $$delegatedProperties[13]);
    }

    private final Group getCollateralGroup() {
        return (Group) this.collateralGroup.getValue(this, $$delegatedProperties[14]);
    }

    private final ConstraintLayout getNumpadContainer() {
        return (ConstraintLayout) this.numpadContainer.getValue(this, $$delegatedProperties[15]);
    }

    private final RdsInfoTag getMarketabilityInfoTag() {
        return (RdsInfoTag) this.marketabilityInfoTag.getValue(this, $$delegatedProperties[16]);
    }

    private final ComposeView getSduiAlertView() {
        return (ComposeView) this.sduiAlertView.getValue(this, $$delegatedProperties[17]);
    }

    private final OrderTimeInForce getTimeInForceBundle() {
        return (OrderTimeInForce) this.timeInForceBundle.getValue(this, $$delegatedProperties[18]);
    }

    private final void setTimeInForceBundle(OrderTimeInForce orderTimeInForce) {
        this.timeInForceBundle.setValue(this, $$delegatedProperties[18], orderTimeInForce);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OptionOrderDuxo getDuxo() {
        return (OptionOrderDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[19]);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public int getInitialLayoutRes() {
        if (((Args) INSTANCE.getArgs((Fragment) this)).getShouldShowPlCharts()) {
            return C29757R.layout.fragment_option_order_with_pl_chart;
        }
        return C29757R.layout.fragment_option_order;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public int getContentRes() {
        return this.contentRes;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public OptionsProfitLossAnalytics2.Source getSource() {
        return this.source;
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public Instant getLastExpanded() {
        return this.lastExpanded;
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public void setLastExpanded(Instant instant) {
        Intrinsics.checkNotNullParameter(instant, "<set-?>");
        this.lastExpanded = instant;
    }

    @Override // com.robinhood.android.trade.options.profitloss.OptionsProfitLossAnalytics2
    public boolean getChartContainerVisibility() {
        ProfitLossChartContext profitLossChartContext = getProfitLossChartContext();
        ProfitLossChartContext.NormalDevice normalDevice = profitLossChartContext instanceof ProfitLossChartContext.NormalDevice ? (ProfitLossChartContext.NormalDevice) profitLossChartContext : null;
        if (normalDevice != null) {
            return normalDevice.getChartContainerVisibility();
        }
        return false;
    }

    private final ProfitLossChartContext getProfitLossChartContext() {
        ProfitLossChartContext normalDevice;
        View viewRequireView = requireView();
        View viewFindViewById = viewRequireView.findViewById(C29757R.id.options_profit_loss_chart_btn);
        OptionsProfitLossInfoBar optionsProfitLossInfoBar = (OptionsProfitLossInfoBar) viewRequireView.findViewById(C29757R.id.options_profit_loss_info_bar);
        OptionsProfitLossChartView optionsProfitLossChartView = (OptionsProfitLossChartView) viewRequireView.findViewById(C29757R.id.options_profit_loss_chart);
        View viewFindViewById2 = viewRequireView.findViewById(C29757R.id.design_system_review_top_position);
        View viewFindViewById3 = viewRequireView.findViewById(C29757R.id.design_system_review_bottom_position);
        View viewFindViewById4 = viewRequireView.findViewById(C29757R.id.options_profit_loss_chart_learn_more);
        Group group = (Group) viewRequireView.findViewById(C29757R.id.options_profit_loss_chart_container);
        if (viewFindViewById != null) {
            normalDevice = new ProfitLossChartContext.SmallDevice(viewFindViewById);
        } else if (optionsProfitLossInfoBar != null && optionsProfitLossChartView != null && viewFindViewById2 != null && viewFindViewById3 != null && viewFindViewById4 != null && group != null) {
            normalDevice = new ProfitLossChartContext.NormalDevice(optionsProfitLossInfoBar, optionsProfitLossChartView, viewFindViewById2, viewFindViewById3, viewFindViewById4, group);
        } else {
            normalDevice = ProfitLossChartContext.Control.INSTANCE;
        }
        normalDevice.throwNonfatalIfUnexpectedContext(((Args) INSTANCE.getArgs((Fragment) this)).getShouldShowPlCharts(), viewRequireView.getResources().getBoolean(C29757R.bool.options_chart_screen_is_small_device));
        return normalDevice;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.view.SwipeToConfirmTouchListener.Callbacks
    public boolean getSubmitBeforeAnimation() {
        return this.submitBeforeAnimation;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.view.SwipeToConfirmTouchListener.Callbacks
    public void setSubmitBeforeAnimation(boolean z) {
        this.submitBeforeAnimation = z;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(final View view, Bundle savedInstanceState) {
        BigDecimal quantity;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        if (savedInstanceState == null) {
            getDuxo().setAccountNumber(((Args) INSTANCE.getArgs((Fragment) this)).getInitialAccountNumber());
        }
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onViewCreated$$inlined$mapDistinctNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                UiEvent<UiOptionOrder> initializeOrderToReplaceEvent = ((OptionOrderViewState) it).getInitializeOrderToReplaceEvent();
                return Optional3.asOptional(initializeOrderToReplaceEvent != null ? initializeOrderToReplaceEvent.consume() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionOrderFragment$onViewCreated$$inlined$mapDistinctNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda32
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onViewCreated$lambda$3(this.f$0, (UiOptionOrder) obj);
            }
        });
        Observable<R> map2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onViewCreated$$inlined$mapDistinctNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                UiEvent<BigDecimal> initializePrefilledQuantityEvent = ((OptionOrderViewState) it).getInitializePrefilledQuantityEvent();
                return Optional3.asOptional(initializePrefilledQuantityEvent != null ? initializePrefilledQuantityEvent.consume() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionOrderFragment$onViewCreated$$inlined$mapDistinctNotNull$2<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableDistinctUntilChanged2 = ObservablesKt.filterIsPresent(map2).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onViewCreated$lambda$5(this.f$0, (BigDecimal) obj);
            }
        });
        Observable<R> map3 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onViewCreated$$inlined$mapDistinctNotNull$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                UiEvent<OptionOrderType> initializePrefilledOrderTypeEvent = ((OptionOrderViewState) it).getInitializePrefilledOrderTypeEvent();
                return Optional3.asOptional(initializePrefilledOrderTypeEvent != null ? initializePrefilledOrderTypeEvent.consume() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionOrderFragment$onViewCreated$$inlined$mapDistinctNotNull$3<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        Observable observableDistinctUntilChanged3 = ObservablesKt.filterIsPresent(map3).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onViewCreated$lambda$7(this.f$0, (OptionOrderType) obj);
            }
        });
        Observable<R> map4 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onViewCreated$$inlined$mapDistinctNotNull$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                UiEvent<OrderTimeInForce> initializePrefilledTimeInForceEvent = ((OptionOrderViewState) it).getInitializePrefilledTimeInForceEvent();
                return Optional3.asOptional(initializePrefilledTimeInForceEvent != null ? initializePrefilledTimeInForceEvent.consume() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionOrderFragment$onViewCreated$$inlined$mapDistinctNotNull$4<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        Observable observableDistinctUntilChanged4 = ObservablesKt.filterIsPresent(map4).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged4), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda44
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onViewCreated$lambda$9(this.f$0, (OrderTimeInForce) obj);
            }
        });
        Observable observableDistinctUntilChanged5 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onViewCreated$$inlined$mapDistinct$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) Boolean.valueOf(((OptionOrderViewState) it).isInLatencyDecreaseExperiment());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged5), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda45
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onViewCreated$lambda$11(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        this.initialConstraints.clone(getRoot());
        this.reviewingConstraints.clone(getActivity(), this.reviewingConstraintLayoutRes);
        addTextChangedListener(new PriceTextWatcher());
        getContractsLabel().setEnabled(false);
        getPriceLabel().setEnabled(false);
        getStopPriceLabel().setEnabled(false);
        Companion companion = INSTANCE;
        UiOptionOrder orderToReplace = ((Args) companion.getArgs((Fragment) this)).getOrderToReplace();
        if (orderToReplace == null || (quantity = orderToReplace.getUnprocessedQuantity()) == null) {
            quantity = ((Args) companion.getArgs((Fragment) this)).getOptionOrderBundle().getQuantity();
        }
        if (quantity != null) {
            getContractsEdt().setText(String.valueOf(quantity.intValue()));
        }
        ProfitLossChartContext profitLossChartContext = getProfitLossChartContext();
        if (profitLossChartContext instanceof ProfitLossChartContext.SmallDevice) {
            if (((ProfitLossChartContext.SmallDevice) profitLossChartContext).getAnalysisBtn().getVisibility() == 0) {
                getDuxo().runWithAnalytics(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda46
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionOrderFragment.onViewCreated$lambda$12(this.f$0, (AnalyticsLogger) obj);
                    }
                });
            }
        } else if (profitLossChartContext instanceof ProfitLossChartContext.NormalDevice) {
            OnClickListeners.onClick(((ProfitLossChartContext.NormalDevice) profitLossChartContext).getLearnMoreLink(), new Function0() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda47
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionOrderFragment.onViewCreated$lambda$14(this.f$0);
                }
            });
        } else if (!(profitLossChartContext instanceof ProfitLossChartContext.Control)) {
            throw new NoWhenBranchMatchedException();
        }
        Observable<R> map5 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onViewCreated$$inlined$mapDistinctNotNull$5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionOrderViewState) it).getOptionsValuationTradeFlowM1Variant());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionOrderFragment$onViewCreated$$inlined$mapDistinctNotNull$5<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        Observable observableDistinctUntilChanged6 = ObservablesKt.filterIsPresent(map5).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged6, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged6), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda48
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onViewCreated$lambda$16(this.f$0, (Experiments.OptionsValuationTradeFlowM1Experiment.Variant) obj);
            }
        });
        Observable observableDistinctUntilChanged7 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onViewCreated$$inlined$mapDistinct$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Resources resources = this.this$0.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                return (R) ((OptionOrderViewState) it).getQuantityRowState(resources);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged7, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged7), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda49
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onViewCreated$lambda$18(this.f$0, (OptionOrderQuantityRowState) obj);
            }
        });
        Observable observableDistinctUntilChanged8 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onViewCreated$$inlined$mapDistinct$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Resources resources = this.this$0.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                return (R) Optional3.asOptional(((OptionOrderViewState) it).getStopTriggerPriceRowState(resources));
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged8, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged8), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda50
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onViewCreated$lambda$20(this.f$0, (Optional) obj);
            }
        });
        Observable observableDistinctUntilChanged9 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onViewCreated$$inlined$mapDistinct$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Resources resources = this.this$0.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                return (R) Optional3.asOptional(((OptionOrderViewState) it).getMarketPriceRowState(resources));
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged9, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged9), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onViewCreated$lambda$22(this.f$0, (Optional) obj);
            }
        });
        Observable observableDistinctUntilChanged10 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onViewCreated$$inlined$mapDistinct$5
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OptionOrderViewState optionOrderViewState = (OptionOrderViewState) it;
                Resources resources = this.this$0.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                return (R) Tuples4.m3642to(optionOrderViewState.getLimitPriceRowState(resources, this.this$0.getClock()), optionOrderViewState.getOptionsValuationTradeFlowM1Variant());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged10, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged10), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda34
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onViewCreated$lambda$24(this.f$0, (Tuples2) obj);
            }
        });
        Observable observableDistinctUntilChanged11 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onViewCreated$$inlined$mapDistinct$6
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Resources resources = this.this$0.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                return (R) Optional3.asOptional(((OptionOrderViewState) it).getBidAskBarState(resources));
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged11, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged11), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda35
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onViewCreated$lambda$26(this.f$0, view, (Optional) obj);
            }
        });
        Observable observableDistinctUntilChanged12 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onViewCreated$$inlined$mapDistinct$7
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OptionOrderViewState optionOrderViewState = (OptionOrderViewState) it;
                Resources resources = this.this$0.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                return (R) Tuples4.m3642to(optionOrderViewState.getTradingSessionRowState(resources), optionOrderViewState.getSingleUiOptionChain());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged12, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged12), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda36
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onViewCreated$lambda$28(this.f$0, (Tuples2) obj);
            }
        });
        Observable observableDistinctUntilChanged13 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onViewCreated$$inlined$mapDistinct$8
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Resources resources = this.this$0.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                return (R) Optional3.asOptional(((OptionOrderViewState) it).getTimeInForceRowState(resources));
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged13, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged13), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda37
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onViewCreated$lambda$30(this.f$0, (Optional) obj);
            }
        });
        Observable observableDistinctUntilChanged14 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onViewCreated$$inlined$mapDistinct$9
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Resources resources = this.this$0.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                return (R) ((OptionOrderViewState) it).getTotalCostRowState(resources);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged14, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged14), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onViewCreated$lambda$32(this.f$0, (OptionOrderTotalCostRowState) obj);
            }
        });
        Observable observableDistinctUntilChanged15 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onViewCreated$$inlined$mapDistinct$10
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Resources resources = this.this$0.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                LocalDate localDateNow = LocalDate.now(ZoneIds.INSTANCE.getNEW_YORK());
                Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
                return (R) Optional3.asOptional(((OptionOrderViewState) it).getSingleLegOrderSummary(resources, localDateNow));
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged15, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged15), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda39
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onViewCreated$lambda$34(this.f$0, (Optional) obj);
            }
        });
        Observable observableDistinctUntilChanged16 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onViewCreated$$inlined$mapDistinct$11
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Resources resources = this.this$0.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                return (R) Optional3.asOptional(((OptionOrderViewState) it).getMultiLegOrderSummaryList(resources));
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged16, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged16), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda40
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onViewCreated$lambda$38(this.f$0, (Optional) obj);
            }
        });
        Observable observableDistinctUntilChanged17 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onViewCreated$$inlined$mapDistinct$12
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OptionOrderViewState optionOrderViewState = (OptionOrderViewState) it;
                return (R) Tuples4.m3642to(Boolean.valueOf(optionOrderViewState.getShouldShowAfterHoursDisclosure()), Integer.valueOf(optionOrderViewState.getAfterHoursDisclosureUrl()));
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged17, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged17), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onViewCreated$lambda$40(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(OptionOrderFragment optionOrderFragment, UiOptionOrder orderToReplace) {
        Intrinsics.checkNotNullParameter(orderToReplace, "orderToReplace");
        optionOrderFragment.getDuxo().setQuantity(orderToReplace.getUnprocessedQuantity(), false);
        optionOrderFragment.setOptionOrderType(OptionOrderType2.toReplacedOrderType(orderToReplace.getOptionOrder()), false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(OptionOrderFragment optionOrderFragment, BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        optionOrderFragment.getDuxo().setQuantity(quantity, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$7(OptionOrderFragment optionOrderFragment, OptionOrderType orderType) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        optionOrderFragment.getDuxo().setOptionOrderType(orderType, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$9(OptionOrderFragment optionOrderFragment, OrderTimeInForce timeInForce) {
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        optionOrderFragment.getDuxo().setTimeInForce(timeInForce, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$11(OptionOrderFragment optionOrderFragment, boolean z) {
        optionOrderFragment.setSubmitBeforeAnimation(z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$12(OptionOrderFragment optionOrderFragment, AnalyticsLogger runWithAnalytics) {
        Intrinsics.checkNotNullParameter(runWithAnalytics, "$this$runWithAnalytics");
        optionOrderFragment.logOptionsProfitLossAnalysisBtnAppear(runWithAnalytics);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$14(OptionOrderFragment optionOrderFragment) {
        optionOrderFragment.getDuxo().runWithAnalytics(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onViewCreated$lambda$14$lambda$13((AnalyticsLogger) obj);
            }
        });
        ProfitAndLossChartEducationFragment.Companion companion = ProfitAndLossChartEducationFragment.INSTANCE;
        Context contextRequireContext = optionOrderFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        optionOrderFragment.startActivity(companion.getIntent(contextRequireContext, optionOrderFragment.getNavigator()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$14$lambda$13(AnalyticsLogger runWithAnalytics) {
        Intrinsics.checkNotNullParameter(runWithAnalytics, "$this$runWithAnalytics");
        OptionsProfitLossAnalytics.logOptionsProfitLossLearnMoreTap(runWithAnalytics);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$16(OptionOrderFragment optionOrderFragment, Experiments.OptionsValuationTradeFlowM1Experiment.Variant variant) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        OptionOrderQuantityRowComposeView optionOrderQuantityComposeRowData = optionOrderFragment.getBinding().optionOrderQuantityComposeRowData;
        Intrinsics.checkNotNullExpressionValue(optionOrderQuantityComposeRowData, "optionOrderQuantityComposeRowData");
        optionOrderQuantityComposeRowData.setVisibility(variant.isInExperiment() ? 0 : 8);
        ConstraintLayout optionOrderQuantityRowData = optionOrderFragment.getBinding().optionOrderQuantityRowData;
        Intrinsics.checkNotNullExpressionValue(optionOrderQuantityRowData, "optionOrderQuantityRowData");
        optionOrderQuantityRowData.setVisibility(variant.isInExperiment() ? 8 : 0);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$18(final OptionOrderFragment optionOrderFragment, OptionOrderQuantityRowState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        optionOrderFragment.getBinding().optionOrderQuantityComposeRowData.bind(state, new OptionOrderQuantityRowComposeView.Callbacks() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onViewCreated$16$1
            @Override // com.robinhood.android.trade.options.OptionOrderQuantityRowComposeView.Callbacks
            public void onTitleTapped() {
                OptionOrderLoggings.logOptionOrderTapToOptionStatsPage(this.this$0.getEventLogger(), OptionOrderLoggings.OPEN_OPTION_STATS_FROM_TITLE_IDENTIFIER);
                this.this$0.launchFullMarketDataActivity();
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$20(final OptionOrderFragment optionOrderFragment, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        OptionOrderStopTriggerPriceRowState optionOrderStopTriggerPriceRowState = (OptionOrderStopTriggerPriceRowState) optional.component1();
        OptionOrderStopTriggerPriceRowView optionOrderStopTriggerPriceRow = optionOrderFragment.getBinding().optionOrderStopTriggerPriceRow;
        Intrinsics.checkNotNullExpressionValue(optionOrderStopTriggerPriceRow, "optionOrderStopTriggerPriceRow");
        optionOrderStopTriggerPriceRow.setVisibility(optionOrderStopTriggerPriceRowState != null ? 0 : 8);
        View stopTriggerPriceDivider = optionOrderFragment.getBinding().stopTriggerPriceDivider;
        Intrinsics.checkNotNullExpressionValue(stopTriggerPriceDivider, "stopTriggerPriceDivider");
        stopTriggerPriceDivider.setVisibility(optionOrderStopTriggerPriceRowState != null ? 0 : 8);
        OptionOrderStopTriggerPriceRowView optionOrderStopTriggerPriceRowView = optionOrderFragment.getBinding().optionOrderStopTriggerPriceRow;
        if (optionOrderStopTriggerPriceRowState != null) {
            optionOrderStopTriggerPriceRowView.bind(optionOrderStopTriggerPriceRowState, new OptionOrderStopTriggerPriceRowView.Callbacks() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onViewCreated$18$1
                @Override // com.robinhood.android.trade.options.OptionOrderStopTriggerPriceRowView.Callbacks
                public void onTextInputValueChange(String newValue) {
                    Intrinsics.checkNotNullParameter(newValue, "newValue");
                    this.this$0.getDuxo().onStopTriggerPriceTextInputValueChange(newValue);
                }

                @Override // com.robinhood.android.trade.options.OptionOrderStopTriggerPriceRowView.Callbacks
                public void onStopPriceFocused() {
                    this.this$0.getDuxo().onStopPriceFocused();
                }
            });
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$22(final OptionOrderFragment optionOrderFragment, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        OptionOrderMarketPriceRowState optionOrderMarketPriceRowState = (OptionOrderMarketPriceRowState) optional.component1();
        OptionOrderMarketPriceRowComposeView optionOrderMarketPriceRow = optionOrderFragment.getBinding().optionOrderMarketPriceRow;
        Intrinsics.checkNotNullExpressionValue(optionOrderMarketPriceRow, "optionOrderMarketPriceRow");
        optionOrderMarketPriceRow.setVisibility(optionOrderMarketPriceRowState != null ? 0 : 8);
        View marketPriceDivider = optionOrderFragment.getBinding().marketPriceDivider;
        Intrinsics.checkNotNullExpressionValue(marketPriceDivider, "marketPriceDivider");
        marketPriceDivider.setVisibility(optionOrderMarketPriceRowState != null ? 0 : 8);
        OptionOrderMarketPriceRowComposeView optionOrderMarketPriceRowComposeView = optionOrderFragment.getBinding().optionOrderMarketPriceRow;
        if (optionOrderMarketPriceRowState != null) {
            optionOrderMarketPriceRowComposeView.bind(optionOrderMarketPriceRowState, new OptionOrderMarketPriceRowComposeView.Callbacks() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onViewCreated$20$1
                @Override // com.robinhood.android.trade.options.OptionOrderMarketPriceRowComposeView.Callbacks
                public void onSubtitleTapped() {
                    this.this$0.launchFullMarketDataActivity();
                }
            });
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$24(final OptionOrderFragment optionOrderFragment, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        final OptionOrderLimitPriceRowState optionOrderLimitPriceRowComposeView2 = (OptionOrderLimitPriceRowState) tuples2.component1();
        Experiments.OptionsValuationTradeFlowM1Experiment.Variant variant = (Experiments.OptionsValuationTradeFlowM1Experiment.Variant) tuples2.component2();
        OptionOrderLimitPriceRowComposeView optionOrderLimitPriceComposeData = optionOrderFragment.getBinding().optionOrderLimitPriceComposeData;
        Intrinsics.checkNotNullExpressionValue(optionOrderLimitPriceComposeData, "optionOrderLimitPriceComposeData");
        optionOrderLimitPriceComposeData.setVisibility(optionOrderLimitPriceRowComposeView2 != null && variant.isInExperiment() ? 0 : 8);
        ConstraintLayout optionOrderLimitPriceData = optionOrderFragment.getBinding().optionOrderLimitPriceData;
        Intrinsics.checkNotNullExpressionValue(optionOrderLimitPriceData, "optionOrderLimitPriceData");
        optionOrderLimitPriceData.setVisibility(optionOrderLimitPriceRowComposeView2 != null && !variant.isInExperiment() ? 0 : 8);
        Space optionOrderPriceDividerTopPlaceholder = optionOrderFragment.getBinding().optionOrderPriceDividerTopPlaceholder;
        Intrinsics.checkNotNullExpressionValue(optionOrderPriceDividerTopPlaceholder, "optionOrderPriceDividerTopPlaceholder");
        optionOrderPriceDividerTopPlaceholder.setVisibility(optionOrderLimitPriceRowComposeView2 != null && !variant.isInExperiment() ? 0 : 8);
        RhMoneyInputView optionOrderLimitPriceInput = optionOrderFragment.getBinding().optionOrderLimitPriceInput;
        Intrinsics.checkNotNullExpressionValue(optionOrderLimitPriceInput, "optionOrderLimitPriceInput");
        optionOrderLimitPriceInput.setVisibility(optionOrderLimitPriceRowComposeView2 != null ? 0 : 8);
        View priceDivider = optionOrderFragment.getBinding().priceDivider;
        Intrinsics.checkNotNullExpressionValue(priceDivider, "priceDivider");
        priceDivider.setVisibility(optionOrderLimitPriceRowComposeView2 != null ? 0 : 8);
        OptionOrderLimitPriceRowComposeView optionOrderLimitPriceRowComposeView = optionOrderFragment.getBinding().optionOrderLimitPriceComposeData;
        if (optionOrderLimitPriceRowComposeView2 == null) {
            return Unit.INSTANCE;
        }
        optionOrderLimitPriceRowComposeView.bind(optionOrderLimitPriceRowComposeView2, new OptionOrderLimitPriceRowComposeView.Callbacks() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onViewCreated$22$1
            @Override // com.robinhood.android.trade.options.OptionOrderLimitPriceRowComposeView.Callbacks
            public void onInfoTagClicked() {
                this.this$0.showOptionMarketabilityBottomSheet(optionOrderLimitPriceRowComposeView2.getInfoTagState().getMarketability().getMarketabilityType());
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$26(final OptionOrderFragment optionOrderFragment, View view, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        OptionOrderBidAskBarViewState optionOrderBidAskBarViewState = (OptionOrderBidAskBarViewState) optional.component1();
        OptionOrderBidAskBarComposeView optionOrderBidAskBar = optionOrderFragment.getBinding().optionOrderBidAskBar;
        Intrinsics.checkNotNullExpressionValue(optionOrderBidAskBar, "optionOrderBidAskBar");
        optionOrderBidAskBar.setVisibility(optionOrderBidAskBarViewState != null ? 0 : 8);
        OptionOrderBidAskBarComposeView optionOrderBidAskBarComposeView = optionOrderFragment.getBinding().optionOrderBidAskBar;
        if (optionOrderBidAskBarViewState != null) {
            optionOrderBidAskBarComposeView.bind(optionOrderBidAskBarViewState, new OptionOrderBidAskBarComposeView.Callbacks() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onViewCreated$24$1
                @Override // com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarComposeView.Callbacks
                public void onBidDebugInputChanged(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.this$0.getDuxo().onBidDebugInputChanged(value);
                }

                @Override // com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarComposeView.Callbacks
                public void onMarkDebugInputChanged(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.this$0.getDuxo().onMarkDebugInputChanged(value);
                }

                @Override // com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarComposeView.Callbacks
                public void onAskDebugInputChanged(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.this$0.getDuxo().onAskDebugInputChanged(value);
                }

                @Override // com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarComposeView.Callbacks
                public void onCanvasWidthUpdated(float width) {
                    this.this$0.getDuxo().onBidAskBarCanvasWidthUpdated(width);
                }

                @Override // com.robinhood.android.trade.options.bidaskbar.OptionOrderBidAskBarComposeView.Callbacks
                public void onTouchEvent(OptionOrderBidAskBarViewState3 event) {
                    Intrinsics.checkNotNullParameter(event, "event");
                    this.this$0.getDuxo().onBidAskBarTouchEvent(event);
                }
            });
            UiEvent<Unit> hapticFeedbackUiEvent = optionOrderBidAskBarViewState.getHapticFeedbackUiEvent();
            if ((hapticFeedbackUiEvent != null ? hapticFeedbackUiEvent.consume() : null) != null) {
                view.performHapticFeedback(1);
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$28(final OptionOrderFragment optionOrderFragment, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        OptionOrderTradingSessionRowState optionOrderTradingSessionRowState = (OptionOrderTradingSessionRowState) tuples2.component1();
        final UiOptionChain uiOptionChain = (UiOptionChain) tuples2.component2();
        OptionOrderTradingSessionRowComposeView optionOrderTradingSessionRow = optionOrderFragment.getBinding().optionOrderTradingSessionRow;
        Intrinsics.checkNotNullExpressionValue(optionOrderTradingSessionRow, "optionOrderTradingSessionRow");
        optionOrderTradingSessionRow.setVisibility(optionOrderTradingSessionRowState != null ? 0 : 8);
        View tradingSessionDivider = optionOrderFragment.getBinding().tradingSessionDivider;
        Intrinsics.checkNotNullExpressionValue(tradingSessionDivider, "tradingSessionDivider");
        tradingSessionDivider.setVisibility(optionOrderTradingSessionRowState != null ? 0 : 8);
        OptionOrderTradingSessionRowComposeView optionOrderTradingSessionRowComposeView = optionOrderFragment.getBinding().optionOrderTradingSessionRow;
        if (optionOrderTradingSessionRowState != null) {
            optionOrderTradingSessionRowComposeView.bind(optionOrderTradingSessionRowState, new OptionOrderTradingSessionRowComposeView.Callbacks() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onViewCreated$26$1
                @Override // com.robinhood.android.trade.options.OptionOrderTradingSessionRowComposeView.Callbacks
                public void onDropdownTapped() {
                    OptionOrderTradingSessionPickerDialogFragment optionOrderTradingSessionPickerDialogFragment = (OptionOrderTradingSessionPickerDialogFragment) OptionOrderTradingSessionPickerDialogFragment.INSTANCE.newInstance((Parcelable) new OptionOrderTradingSessionPickerDialogFragment.Args(uiOptionChain.getUnderlyingType(), uiOptionChain.getOptionChain().getId()));
                    FragmentManager childFragmentManager = optionOrderFragment.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    optionOrderTradingSessionPickerDialogFragment.show(childFragmentManager, "OptionOrderTradingSessionPickerDialogFragment");
                }
            });
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$30(final OptionOrderFragment optionOrderFragment, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        final OptionOrderTimeInForceRowState optionOrderTimeInForceRowState = (OptionOrderTimeInForceRowState) optional.component1();
        OptionOrderTimeInForceRowComposeView optionOrderTimeInForceRow = optionOrderFragment.getBinding().optionOrderTimeInForceRow;
        Intrinsics.checkNotNullExpressionValue(optionOrderTimeInForceRow, "optionOrderTimeInForceRow");
        optionOrderTimeInForceRow.setVisibility(optionOrderTimeInForceRowState != null ? 0 : 8);
        View timeInForceDivider = optionOrderFragment.getBinding().timeInForceDivider;
        Intrinsics.checkNotNullExpressionValue(timeInForceDivider, "timeInForceDivider");
        timeInForceDivider.setVisibility(optionOrderTimeInForceRowState != null ? 0 : 8);
        OptionOrderTimeInForceRowComposeView optionOrderTimeInForceRowComposeView = optionOrderFragment.getBinding().optionOrderTimeInForceRow;
        if (optionOrderTimeInForceRowState != null) {
            optionOrderTimeInForceRowComposeView.bind(optionOrderTimeInForceRowState, new OptionOrderTimeInForceRowComposeView.Callbacks() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onViewCreated$28$1
                @Override // com.robinhood.android.trade.options.OptionOrderTimeInForceRowComposeView.Callbacks
                public void onDropdownTapped() {
                    OptionOrderTimeInForcePickerDialogFragment optionOrderTimeInForcePickerDialogFragment = (OptionOrderTimeInForcePickerDialogFragment) OptionOrderTimeInForcePickerDialogFragment.INSTANCE.newInstance((Parcelable) new OptionOrderTimeInForcePickerDialogFragment.Args(optionOrderTimeInForceRowState.getTimeInForce(), optionOrderTimeInForceRowState.getInIndexOptionsCurbHoursExperiment()));
                    FragmentManager childFragmentManager = optionOrderFragment.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    optionOrderTimeInForcePickerDialogFragment.show(childFragmentManager, "OptionOrderTimeInForcePickerDialogFragment");
                }
            });
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$32(final OptionOrderFragment optionOrderFragment, OptionOrderTotalCostRowState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        optionOrderFragment.getBinding().optionOrderTotalCostRow.bind(state, new OptionOrderTotalCostRowComposeView.Callbacks() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onViewCreated$30$1
            @Override // com.robinhood.android.trade.options.OptionOrderTotalCostRowComposeView.Callbacks
            public void onTitleTapped() {
                this.this$0.getDuxo().updateTotalCostRowCollapsedState();
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$34(OptionOrderFragment optionOrderFragment, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        String str = (String) optional.component1();
        RhTextView optionOrderFragmentSinglelegSummaryBody = optionOrderFragment.getBinding().optionOrderFragmentSinglelegSummaryBody;
        Intrinsics.checkNotNullExpressionValue(optionOrderFragmentSinglelegSummaryBody, "optionOrderFragmentSinglelegSummaryBody");
        TextViewsKt.setVisibilityText(optionOrderFragmentSinglelegSummaryBody, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$38(OptionOrderFragment optionOrderFragment, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        List<Tuples2> list = (List) optional.component1();
        optionOrderFragment.getBinding().optionOrderFragmentMultilegSummaryContainer.removeAllViews();
        if (list != null) {
            for (Tuples2 tuples2 : list) {
                String str = (String) tuples2.component1();
                String str2 = (String) tuples2.component2();
                LinearLayout linearLayout = optionOrderFragment.getBinding().optionOrderFragmentMultilegSummaryContainer;
                Context contextRequireContext = optionOrderFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                MultilegOrderSummaryItemView multilegOrderSummaryItemView = new MultilegOrderSummaryItemView(contextRequireContext);
                multilegOrderSummaryItemView.setText(str, str2);
                linearLayout.addView(multilegOrderSummaryItemView);
            }
        }
        LinearLayout optionOrderFragmentMultilegSummaryContainer = optionOrderFragment.getBinding().optionOrderFragmentMultilegSummaryContainer;
        Intrinsics.checkNotNullExpressionValue(optionOrderFragmentMultilegSummaryContainer, "optionOrderFragmentMultilegSummaryContainer");
        optionOrderFragmentMultilegSummaryContainer.setVisibility(list != null ? 0 : 8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$40(OptionOrderFragment optionOrderFragment, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        boolean zBooleanValue = ((Boolean) tuples2.component1()).booleanValue();
        int iIntValue = ((Number) tuples2.component2()).intValue();
        OptionOrderAfterHoursDisclosureComposeView optionOrderFragmentAfterHoursDisclosureComposeView = optionOrderFragment.getBinding().optionOrderFragmentAfterHoursDisclosureComposeView;
        Intrinsics.checkNotNullExpressionValue(optionOrderFragmentAfterHoursDisclosureComposeView, "optionOrderFragmentAfterHoursDisclosureComposeView");
        optionOrderFragmentAfterHoursDisclosureComposeView.setVisibility(zBooleanValue ? 0 : 8);
        optionOrderFragment.getBinding().optionOrderFragmentAfterHoursDisclosureComposeView.bind(iIntValue);
        return Unit.INSTANCE;
    }

    private final void addTextChangedListener(PriceTextWatcher priceTextWatcher) {
        getBinding().optionOrderLimitPriceInput.addAmountTextChangedListener(priceTextWatcher);
        getStopPriceInputView().addAmountTextChangedListener(priceTextWatcher);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        OptionOrder optionOrder;
        super.onResume();
        EditText contractsEdt = getContractsEdt();
        contractsEdt.addTextChangedListener(new TextWatcher() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onResume$lambda$43$$inlined$addTextChangedListener$default$1
            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                if (s == null || !BigDecimals7.isZero(BigDecimals7.toBigDecimalOrZero(s.toString()))) {
                    return;
                }
                s.clear();
            }
        });
        Observable<R> map = RxTextView.textChanges(contractsEdt).map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onResume$1$2
            @Override // io.reactivex.functions.Function
            public final Tuples2<BigDecimal, Boolean> apply(CharSequence it) {
                Intrinsics.checkNotNullParameter(it, "it");
                BigDecimal default_quantity = OptionOrderViewState2.getDEFAULT_QUANTITY();
                Intrinsics.checkNotNullExpressionValue(default_quantity, "<get-DEFAULT_QUANTITY>(...)");
                return Tuples4.m3642to(BigDecimals7.toBigDecimalOrDefault(it, default_quantity), Boolean.valueOf(it.length() > 0));
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onResume$lambda$43$lambda$42(this.f$0, (Tuples2) obj);
            }
        });
        contractsEdt.setSelection(contractsEdt.getText().toString().length());
        contractsEdt.requestFocus();
        Observable<R> map2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onResume$$inlined$mapDistinctNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((OptionOrderViewState) it).getUserInputPrices().getAbsoluteLimitPriceFromBidAskBarToUpdateTextInput());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionOrderFragment$onResume$$inlined$mapDistinctNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map2).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onResume$lambda$45(this.f$0, (BigDecimal) obj);
            }
        });
        Observable<R> map3 = getBinding().optionOrderLimitPriceInput.getAmountObservable().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment.onResume.4
            @Override // io.reactivex.functions.Function
            public final Optional<BigDecimal> apply(Optional<Money> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Money orNull = it.getOrNull();
                return Optional3.asOptional(orNull != null ? orNull.getDecimalValue() : null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(map3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onResume$lambda$47(this.f$0, (Optional) obj);
            }
        });
        Observable observableDebounce = getBinding().optionOrderLimitPriceInput.getAmountObservable().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment.onResume.6
            @Override // io.reactivex.functions.Function
            public final Optional<BigDecimal> apply(Optional<Money> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Money orNull = it.getOrNull();
                return Optional3.asOptional(orNull != null ? orNull.getDecimalValue() : null);
            }
        }).debounce(500L, TimeUnit.MILLISECONDS, AndroidSchedulers.mainThread());
        Intrinsics.checkNotNullExpressionValue(observableDebounce, "debounce(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDebounce, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onResume$lambda$48(this.f$0, (Optional) obj);
            }
        });
        Observable<R> map4 = getStopPriceInputView().getAmountObservable().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment.onResume.8
            @Override // io.reactivex.functions.Function
            public final Optional<BigDecimal> apply(Optional<Money> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Money orNull = it.getOrNull();
                return Optional3.asOptional(orNull != null ? orNull.getDecimalValue() : null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(map4), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onResume$lambda$49(this.f$0, (Optional) obj);
            }
        });
        ProfitLossChartContext profitLossChartContext = getProfitLossChartContext();
        ProfitLossChartContext.NormalDevice normalDevice = profitLossChartContext instanceof ProfitLossChartContext.NormalDevice ? (ProfitLossChartContext.NormalDevice) profitLossChartContext : null;
        if (normalDevice != null) {
            initializeViews(normalDevice);
        }
        OrderTimeInForce timeInForceBundle = getTimeInForceBundle();
        if (timeInForceBundle == null) {
            UiOptionOrder orderToReplace = ((Args) INSTANCE.getArgs((Fragment) this)).getOrderToReplace();
            timeInForceBundle = (orderToReplace == null || (optionOrder = orderToReplace.getOptionOrder()) == null) ? null : optionOrder.getTimeInForce();
            if (timeInForceBundle == null) {
                timeInForceBundle = OrderTimeInForce.GFD;
            }
        }
        setTimeInForce(timeInForceBundle, false);
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C2972510(this));
        Observable<OptionOrderViewState> states = getDuxo().getStates();
        final C2972611 c2972611 = new PropertyReference1Impl() { // from class: com.robinhood.android.trade.options.OptionOrderFragment.onResume.11
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty7
            public Object get(Object obj) {
                return ((OptionOrderViewState) obj).getFormState();
            }
        };
        Observable observableDistinctUntilChanged2 = states.map(new Function(c2972611) { // from class: com.robinhood.android.trade.options.OptionOrderFragment$sam$io_reactivex_functions_Function$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(c2972611, "function");
                this.function = c2972611;
            }

            @Override // io.reactivex.functions.Function
            public final /* synthetic */ Object apply(Object obj) {
                return this.function.invoke(obj);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C2972712(this));
        if (!(getProfitLossChartContext() instanceof ProfitLossChartContext.NormalDevice)) {
            getDuxo().finishPerformanceLogging();
        }
        Observable observableDistinctUntilChanged3 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onResume$$inlined$mapDistinct$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Resources resources = this.this$0.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                return (R) ((OptionOrderViewState) it).getOptionOrderTypeText(resources);
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onResume$lambda$51(this.f$0, (String) obj);
            }
        });
        Observable observableDistinctUntilChanged4 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onResume$$inlined$mapDistinct$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) Boolean.valueOf(((OptionOrderViewState) it).isToolbarOrderTypeDiscoveryDotVisible());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged4), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onResume$lambda$53(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Observable<R> map5 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onResume$$inlined$mapDistinctNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                OptionOrderViewState.Marketability marketability;
                OptionOrderViewState.Marketability.MarketabilityType marketabilityType;
                Intrinsics.checkNotNullParameter(it, "it");
                OptionOrderViewState.UiMarketability uiMarketabilitySingleLegMarketabilityForLogging = ((OptionOrderViewState) it).singleLegMarketabilityForLogging(this.this$0.getClock());
                return Optional3.asOptional((uiMarketabilitySingleLegMarketabilityForLogging == null || (marketability = uiMarketabilitySingleLegMarketabilityForLogging.getMarketability()) == null || (marketabilityType = marketability.getMarketabilityType()) == null) ? null : marketabilityType.getRosettaType());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionOrderFragment$onResume$$inlined$mapDistinctNotNull$2<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        Observable observableDistinctUntilChanged5 = ObservablesKt.filterIsPresent(map5).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged5, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged5), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onResume$lambda$55(this.f$0, (MarketabilityType) obj);
            }
        });
        Observable<R> map6 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onResume$$inlined$mapDistinctNotNull$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OptionOrderViewState optionOrderViewState = (OptionOrderViewState) it;
                return Optional3.asOptional(PairUtils.toNullable(Tuples4.m3642to(optionOrderViewState.debouncedMarketability(this.this$0.getClock()), optionOrderViewState.getMarketabilityVisibleState())));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionOrderFragment$onResume$$inlined$mapDistinctNotNull$3<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map6, "map(...)");
        Observable observableDistinctUntilChanged6 = ObservablesKt.filterIsPresent(map6).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged6, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged6), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onResume$lambda$59(this.f$0, (Tuples2) obj);
            }
        });
        Observable observableDistinctUntilChanged7 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onResume$$inlined$mapDistinct$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OptionOrderViewState optionOrderViewState = (OptionOrderViewState) it;
                return (R) Tuples4.m3642to(optionOrderViewState.getAccountSwitcherState(), Boolean.valueOf(optionOrderViewState.getShouldShowAccountSwitcher()));
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged7, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged7), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onResume$lambda$61(this.f$0, (Tuples2) obj);
            }
        });
        Observable observableDistinctUntilChanged8 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onResume$$inlined$mapDistinct$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OptionOrderViewState optionOrderViewState = (OptionOrderViewState) it;
                return (R) Boolean.valueOf(optionOrderViewState.getFormState() != DefaultOrderState.REVIEWING && optionOrderViewState.isMarketOrdersTooltipVisible());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged8, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged8), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onResume$lambda$65(this.f$0, ((Boolean) obj).booleanValue());
            }
        });
        Observable<R> map7 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onResume$$inlined$mapDistinctNotNull$4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                UiEvent<Either<AccountSwitcherData, Throwable>> accountSwitcherRefreshedEvent = ((OptionOrderViewState) it).getAccountSwitcherRefreshedEvent();
                return Optional3.asOptional(accountSwitcherRefreshedEvent != null ? accountSwitcherRefreshedEvent.consume() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionOrderFragment$onResume$$inlined$mapDistinctNotNull$4<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map7, "map(...)");
        Observable observableDistinctUntilChanged9 = ObservablesKt.filterIsPresent(map7).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged9, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged9), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onResume$lambda$67(this.f$0, (Either) obj);
            }
        });
        Observable<R> map8 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onResume$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                UiEvent<QuickConversionKey> presentQuickConversionSheet = ((OptionOrderViewState) it).getPresentQuickConversionSheet();
                return Optional3.asOptional(presentQuickConversionSheet != null ? presentQuickConversionSheet.consume() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionOrderFragment$onResume$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map8, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(ObservablesKt.filterIsPresent(map8)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onResume$lambda$69(this.f$0, (QuickConversionKey) obj);
            }
        });
        IdlingResourceCounters2.setBusy(IdlingResourceType.OPTION_ORDER, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$43$lambda$42(OptionOrderFragment optionOrderFragment, Tuples2 tuples2) {
        optionOrderFragment.getDuxo().setQuantity((BigDecimal) tuples2.component1(), ((Boolean) tuples2.component2()).booleanValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$45(OptionOrderFragment optionOrderFragment, BigDecimal limitPrice) {
        Intrinsics.checkNotNullParameter(limitPrice, "limitPrice");
        optionOrderFragment.updateLimitPrice(limitPrice);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$47(OptionOrderFragment optionOrderFragment, Optional optional) {
        BigDecimal bigDecimal = (BigDecimal) optional.component1();
        optionOrderFragment.getDuxo().setLimitPrice(bigDecimal != null ? new LimitPriceWithSource(bigDecimal, OptionOrderLimitPrice.TEXT_INPUT) : null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$48(OptionOrderFragment optionOrderFragment, Optional optional) {
        optionOrderFragment.getDuxo().setDebouncedLimitPrice((BigDecimal) optional.component1());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$49(OptionOrderFragment optionOrderFragment, Optional optional) {
        optionOrderFragment.getDuxo().setStopPriceInStopLimitOrder((BigDecimal) optional.component1());
        return Unit.INSTANCE;
    }

    /* compiled from: OptionOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.OptionOrderFragment$onResume$10 */
    /* synthetic */ class C2972510 extends FunctionReferenceImpl implements Function1<OptionOrderViewState, Unit> {
        C2972510(Object obj) {
            super(1, obj, OptionOrderFragment.class, "refreshUi", "refreshUi(Lcom/robinhood/android/trade/options/OptionOrderViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(OptionOrderViewState optionOrderViewState) throws Resources.NotFoundException {
            invoke2(optionOrderViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(OptionOrderViewState p0) throws Resources.NotFoundException {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OptionOrderFragment) this.receiver).refreshUi(p0);
        }
    }

    /* compiled from: OptionOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.OptionOrderFragment$onResume$12 */
    /* synthetic */ class C2972712 extends FunctionReferenceImpl implements Function1<DefaultOrderState, Unit> {
        C2972712(Object obj) {
            super(1, obj, OptionOrderFragment.class, "setFormState", "setFormState(Lcom/robinhood/android/lib/trade/OrderState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DefaultOrderState defaultOrderState) {
            invoke2(defaultOrderState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DefaultOrderState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OptionOrderFragment) this.receiver).setFormState(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$51(OptionOrderFragment optionOrderFragment, String optionOrderTypeText) {
        Intrinsics.checkNotNullParameter(optionOrderTypeText, "optionOrderTypeText");
        TextView textView = optionOrderFragment.actionOptionOrderTypeTxt;
        if (textView != null) {
            textView.setText(optionOrderTypeText);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$53(OptionOrderFragment optionOrderFragment, boolean z) {
        View view = optionOrderFragment.optionOrderToolbarDiscoveryDot;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$55(OptionOrderFragment optionOrderFragment, MarketabilityType rosettaType) {
        Intrinsics.checkNotNullParameter(rosettaType, "rosettaType");
        OptionOrderDuxo duxo = optionOrderFragment.getDuxo();
        String string2 = ((Args) INSTANCE.getArgs((Fragment) optionOrderFragment)).getOrderUuid().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        duxo.logSingleLegMarketability(string2, rosettaType);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$59(final OptionOrderFragment optionOrderFragment, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        final OptionOrderViewState.UiMarketability uiMarketability = (OptionOrderViewState.UiMarketability) tuples2.component1();
        OptionOrderViewState.MarketabilityVisibleState marketabilityVisibleState = (OptionOrderViewState.MarketabilityVisibleState) tuples2.component2();
        OptionOrderDuxo duxo = optionOrderFragment.getDuxo();
        String string2 = ((Args) INSTANCE.getArgs((Fragment) optionOrderFragment)).getOrderUuid().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        duxo.logMarketabilityUiChange(string2, uiMarketability);
        RdsInfoTag marketabilityInfoTag = optionOrderFragment.getMarketabilityInfoTag();
        marketabilityInfoTag.setVisibility(uiMarketability.getIsTagVisible() && marketabilityVisibleState == OptionOrderViewState.MarketabilityVisibleState.LEGACY ? 0 : 8);
        if (uiMarketability.getTagIconDrawable() != null) {
            marketabilityInfoTag.setIconDrawable(AppCompatResources.getDrawable(optionOrderFragment.requireContext(), uiMarketability.getTagIconDrawable().intValue()));
        }
        OnClickListeners.onClick(optionOrderFragment.getMarketabilityInfoTag(), new Function0() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOrderFragment.onResume$lambda$59$lambda$58(this.f$0, uiMarketability);
            }
        });
        optionOrderFragment.getMarketabilityInfoTag().setText(optionOrderFragment.getString(uiMarketability.getFormTitleRes()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$59$lambda$58(OptionOrderFragment optionOrderFragment, OptionOrderViewState.UiMarketability uiMarketability) {
        optionOrderFragment.showOptionMarketabilityBottomSheet(uiMarketability.getMarketability().getMarketabilityType());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$61(OptionOrderFragment optionOrderFragment, Tuples2 tuples2) {
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        TradeAccountSwitcherState tradeAccountSwitcherState = (TradeAccountSwitcherState) tuples2.component1();
        optionOrderFragment.getAccountSwitcherBtn().setVisibility(((Boolean) tuples2.component2()).booleanValue() ? 0 : 8);
        if (tradeAccountSwitcherState != null) {
            optionOrderFragment.getAccountSwitcherBtn().bind(tradeAccountSwitcherState, optionOrderFragment, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$65(final OptionOrderFragment optionOrderFragment, boolean z) {
        View viewFindViewById;
        View view = optionOrderFragment.getView();
        if (view != null && (viewFindViewById = view.findViewById(C29757R.id.option_order_market_tooltip)) != null) {
            viewFindViewById.setVisibility(z ? 0 : 8);
            OnClickListeners.onClick(viewFindViewById, new Function0() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionOrderFragment.onResume$lambda$65$lambda$64$lambda$63(this.f$0);
                }
            });
        }
        if (z) {
            optionOrderFragment.getDuxo().recordOptionsMarketTooltipSeen();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$65$lambda$64$lambda$63(OptionOrderFragment optionOrderFragment) {
        optionOrderFragment.getDuxo().dismissOptionsMarketTooltip();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$67(OptionOrderFragment optionOrderFragment, Either event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof Either.Left) {
            optionOrderFragment.onAccountSwitcherCtaClicked((AccountSwitcherData) ((Either.Left) event).getValue());
        } else {
            if (!(event instanceof Either.Right)) {
                throw new NoWhenBranchMatchedException();
            }
            AbsErrorHandler.handleError$default(optionOrderFragment.getActivityErrorHandler(), (Throwable) ((Either.Right) event).getValue(), false, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$69(OptionOrderFragment optionOrderFragment, QuickConversionKey it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Navigator.DefaultImpls.createDialogFragment$default(optionOrderFragment.getNavigator(), it, null, 2, null).show(optionOrderFragment.getChildFragmentManager(), "quick-conversion");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showOptionMarketabilityBottomSheet(OptionOrderViewState.Marketability.MarketabilityType marketabilityType) {
        RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) RhBottomSheetDialogFragment.INSTANCE.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(C29757R.id.dialog_id_option_order_marketability, getString(marketabilityType.getBottomSheetTitleRes()), null, getString(marketabilityType.getBottomSheetDescriptionRes()), null, getString(C11048R.string.general_label_dismiss), null, null, null, true, true, getString(C29757R.string.option_order_marketability_learn_more), null, null, false, true, false, false, null, null, getString(C29757R.string.option_order_marketability_bottom_sheet), 1012180, null));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rhBottomSheetDialogFragment.show(childFragmentManager, "optionMarketabilityBottomSheet");
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onLearnMoreActionClicked(int dialogId, Bundle passthroughArgs) {
        if (dialogId != C29757R.id.dialog_id_option_order_marketability) {
            return true;
        }
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        requireContext().startActivity(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, new RemoteDisclosureKey(new Function0() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda51
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOrderFragment.onLearnMoreActionClicked$lambda$70(this.f$0);
            }
        }.toString(), null, true, false, null, null, null, false, 250, null), null, false, 12, null));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onLearnMoreActionClicked$lambda$70(OptionOrderFragment optionOrderFragment) {
        return BrokerageResource2.getContentfulId(BrokerageDisclosure.OPTION_MARKETABILITY_DISCLOSURE, optionOrderFragment.getDuxo().getStatesFlow().getValue().getLocality());
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (getChartContainerVisibility()) {
            Instant instantNow = Instant.now();
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
            setLastExpanded(instantNow);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (getChartContainerVisibility()) {
            getDuxo().runWithAnalytics(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda30
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return OptionOrderFragment.onStop$lambda$71(this.f$0, (AnalyticsLogger) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStop$lambda$71(OptionOrderFragment optionOrderFragment, AnalyticsLogger runWithAnalytics) {
        Intrinsics.checkNotNullParameter(runWithAnalytics, "$this$runWithAnalytics");
        optionOrderFragment.logChartDisappear(runWithAnalytics);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        onConfigureToolbar(toolbar);
    }

    private final void onConfigureToolbar(RhToolbar toolbar) {
        final RhToolbar rhToolbar;
        ViewGroup viewGroup = (ViewGroup) toolbar.findViewById(C29757R.id.option_order_toolbar_content);
        this.toolbarContent = viewGroup;
        if (viewGroup == null) {
            rhToolbar = toolbar;
            RhToolbar.addCustomView$default(rhToolbar, C29757R.layout.include_option_order_toolbar, false, 0, 6, null);
            this.toolbarContent = (ViewGroup) rhToolbar.findViewById(C29757R.id.option_order_toolbar_content);
        } else {
            rhToolbar = toolbar;
        }
        ViewGroup viewGroup2 = this.toolbarContent;
        Intrinsics.checkNotNull(viewGroup2);
        this.optionOrderToolbarDiscoveryDot = viewGroup2.findViewById(C29757R.id.option_order_toolbar_discovery_dot);
        this.actionOptionOrderTypeTxt = (TextView) viewGroup2.findViewById(C29757R.id.action_option_order_types_txt);
        View viewFindViewById = viewGroup2.findViewById(C29757R.id.action_option_order_types);
        Intrinsics.checkNotNull(viewFindViewById, "null cannot be cast to non-null type android.view.View");
        OnClickListeners.onClick(viewFindViewById, new Function0() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda31
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOrderFragment.onConfigureToolbar$lambda$75$lambda$74(rhToolbar, this);
            }
        });
        viewFindViewById.setVisibility(!getReviewing() ? 0 : 8);
        this.actionOptionOrderTypeContainer = viewFindViewById;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onConfigureToolbar$lambda$75$lambda$74(final RhToolbar rhToolbar, final OptionOrderFragment optionOrderFragment) {
        rhToolbar.setLoadingViewVisible(true);
        Observable<R> map = optionOrderFragment.getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$onConfigureToolbar$lambda$75$lambda$74$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OptionOrderViewState optionOrderViewState = (OptionOrderViewState) it;
                return Optional3.asOptional(PairUtils.toNullable(Tuples4.m3642to(optionOrderViewState.getOptionOrderContext(), optionOrderViewState.getUserInputPrices().getOptionOrderType())));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C29718x8ace32e0<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableTake = ObservablesKt.filterIsPresent(map).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(optionOrderFragment, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda52
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.onConfigureToolbar$lambda$75$lambda$74$lambda$73(this.f$0, rhToolbar, (Tuples2) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onConfigureToolbar$lambda$75$lambda$74$lambda$73(OptionOrderFragment optionOrderFragment, RhToolbar rhToolbar, Tuples2 tuples2) {
        CharSequence text;
        OptionOrderContext optionOrderContext = (OptionOrderContext) tuples2.component1();
        OptionOrderType optionOrderType = (OptionOrderType) tuples2.component2();
        OptionOrderDuxo duxo = optionOrderFragment.getDuxo();
        String string2 = optionOrderType.toString();
        TextView textView = optionOrderFragment.actionOptionOrderTypeTxt;
        duxo.logTapOptionOrderTypePicker(string2, (textView == null || (text = textView.getText()) == null) ? null : text.toString());
        optionOrderFragment.getCallbacks().startOptionOrderTypeFlow(optionOrderContext);
        rhToolbar.setLoadingViewVisible(false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void refreshUi(final OptionOrderViewState state) throws Resources.NotFoundException {
        CharSequence text;
        SufficientBuyingPowerCryptoFailure sufficientBuyingPowerCryptoFailureConsume;
        IdlingResourceCounters2.setBusy(IdlingResourceType.OPTION_ORDER, state.getOptionOrderContext() == null);
        Group stopLimitPriceGroup = getBinding().stopLimitPriceGroup;
        Intrinsics.checkNotNullExpressionValue(stopLimitPriceGroup, "stopLimitPriceGroup");
        stopLimitPriceGroup.setVisibility(state.getShouldShowStopLimitPriceRow() ? 0 : 8);
        Group stopLimitPriceGroup2 = getBinding().stopLimitPriceGroup;
        Intrinsics.checkNotNullExpressionValue(stopLimitPriceGroup2, "stopLimitPriceGroup");
        if (stopLimitPriceGroup2.getVisibility() != 0) {
            RhMoneyInputView optionOrderLimitPriceInput = getBinding().optionOrderLimitPriceInput;
            Intrinsics.checkNotNullExpressionValue(optionOrderLimitPriceInput, "optionOrderLimitPriceInput");
            if (optionOrderLimitPriceInput.getVisibility() == 0) {
                UiEvent<Unit> initialFocusLimitPriceEvent = state.getInitialFocusLimitPriceEvent();
                if ((initialFocusLimitPriceEvent != null ? initialFocusLimitPriceEvent.consume() : null) != null) {
                    getBinding().optionOrderLimitPriceInput.requestAmountTextFocus();
                }
            }
        } else {
            UiEvent<Unit> initialFocusStopPriceEvent = state.getInitialFocusStopPriceEvent();
            if ((initialFocusStopPriceEvent != null ? initialFocusStopPriceEvent.consume() : null) != null) {
                getStopPriceInputView().requestAmountTextFocus();
            }
        }
        ProfitLossChartContext profitLossChartContext = getProfitLossChartContext();
        if (profitLossChartContext instanceof ProfitLossChartContext.NormalDevice) {
            ProfitLossChartContext.NormalDevice normalDevice = (ProfitLossChartContext.NormalDevice) profitLossChartContext;
            if (state.getShouldShowProfitAndLossChart()) {
                UserEnteredProfitLossParams lastRefreshedProfitLossParams = state.getLastRefreshedProfitLossParams();
                if (lastRefreshedProfitLossParams != null) {
                    normalDevice.getInfoBar().setParamsToRefresh(lastRefreshedProfitLossParams);
                }
            } else {
                normalDevice.getInfoBar().reset();
            }
            ApiOptionsProfitLossChartRequestParams profitLossChartRequestParams = state.getProfitLossChartRequestParams();
            if (profitLossChartRequestParams != null) {
                normalDevice.getChart().updateRequestParams(profitLossChartRequestParams);
            }
        } else if (profitLossChartContext instanceof ProfitLossChartContext.SmallDevice) {
            ProfitLossChartContext.SmallDevice smallDevice = (ProfitLossChartContext.SmallDevice) profitLossChartContext;
            final OptionsProfitLossChartAnalysisFragmentKey profitLossChartAnalysisKey = state.getProfitLossChartAnalysisKey();
            if (profitLossChartAnalysisKey != null) {
                OnClickListeners.onClick(smallDevice.getAnalysisBtn(), new Function0() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionOrderFragment.refreshUi$lambda$80$lambda$79(this.f$0, profitLossChartAnalysisKey);
                    }
                });
            }
        }
        View accountDivider = getBinding().accountDivider;
        Intrinsics.checkNotNullExpressionValue(accountDivider, "accountDivider");
        accountDivider.setVisibility(state.getShowSelectedAccountRow() ? 0 : 8);
        LinearLayout accountGroup = getBinding().accountGroup;
        Intrinsics.checkNotNullExpressionValue(accountGroup, "accountGroup");
        accountGroup.setVisibility(state.getShowSelectedAccountRow() ? 0 : 8);
        RhTextView rhTextView = getBinding().optionOrderSelectedAccountTitle;
        StringResource accountNameTitle = state.getAccountNameTitle();
        if (accountNameTitle != null) {
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            text = accountNameTitle.getText(resources);
        } else {
            text = null;
        }
        rhTextView.setText(text);
        StringResource accountNameSubtitle = state.getAccountNameSubtitle();
        if (accountNameSubtitle != null) {
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            CharSequence text2 = accountNameSubtitle.getText(resources2);
            if (text2 != null) {
                RhTextView optionOrderSelectedAccountSubtitle = getBinding().optionOrderSelectedAccountSubtitle;
                Intrinsics.checkNotNullExpressionValue(optionOrderSelectedAccountSubtitle, "optionOrderSelectedAccountSubtitle");
                optionOrderSelectedAccountSubtitle.setVisibility(0);
                getBinding().optionOrderSelectedAccountSubtitle.setText(text2);
            } else {
                RhTextView optionOrderSelectedAccountSubtitle2 = getBinding().optionOrderSelectedAccountSubtitle;
                Intrinsics.checkNotNullExpressionValue(optionOrderSelectedAccountSubtitle2, "optionOrderSelectedAccountSubtitle");
                optionOrderSelectedAccountSubtitle2.setVisibility(8);
            }
        }
        if (state.getChainSymbol() != null && state.getOptionsBuyingPower() != null) {
            TextView contractSubtitleLabel = getContractSubtitleLabel();
            Resources resources3 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
            TextViewsKt.setVisibilityText(contractSubtitleLabel, state.getQuantityRowSubtitle(resources3));
        }
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNull(baseActivity);
        Resources resources4 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources4, "getResources(...)");
        final OptionOrderContext optionOrderContext = state.getOptionOrderContext();
        if (optionOrderContext == null) {
            return;
        }
        getSduiAlertView().setContent(ComposableLambda3.composableLambdaInstance(-48285988, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.options.OptionOrderFragment.refreshUi.5
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
                    ComposerKt.traceEventStart(-48285988, i, -1, "com.robinhood.android.trade.options.OptionOrderFragment.refreshUi.<anonymous> (OptionOrderFragment.kt:942)");
                }
                Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(OptionOrderFragment.this.getScarletManager());
                final OptionOrderViewState optionOrderViewState = state;
                final OptionOrderFragment optionOrderFragment = OptionOrderFragment.this;
                final OptionOrderContext optionOrderContext2 = optionOrderContext;
                BentoTheme2.BentoTheme(observableThemeChangesForCompose, null, ComposableLambda3.rememberComposableLambda(2087187470, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.options.OptionOrderFragment.refreshUi.5.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* compiled from: OptionOrderFragment.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.options.OptionOrderFragment$refreshUi$5$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C505841 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ SduiActionHandler<OptionOrderFormAction> $actionHandler;
                        final /* synthetic */ OptionOrderViewState $state;
                        final /* synthetic */ OptionOrderFragment this$0;

                        /* JADX WARN: Multi-variable type inference failed */
                        C505841(OptionOrderFragment optionOrderFragment, OptionOrderViewState optionOrderViewState, SduiActionHandler<? super OptionOrderFormAction> sduiActionHandler) {
                            this.this$0 = optionOrderFragment;
                            this.$state = optionOrderViewState;
                            this.$actionHandler = sduiActionHandler;
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
                                ComposerKt.traceEventStart(667537866, i, -1, "com.robinhood.android.trade.options.OptionOrderFragment.refreshUi.<anonymous>.<anonymous>.<anonymous> (OptionOrderFragment.kt:968)");
                            }
                            composer.startReplaceGroup(1849434622);
                            Object objRememberedValue = composer.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$refreshUi$5$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            DialogProperties dialogProperties = new DialogProperties(false, false, false);
                            final OptionOrderFragment optionOrderFragment = this.this$0;
                            final OptionOrderViewState optionOrderViewState = this.$state;
                            final SduiActionHandler<OptionOrderFormAction> sduiActionHandler = this.$actionHandler;
                            AndroidDialog_androidKt.Dialog((Function0) objRememberedValue, dialogProperties, ComposableLambda3.rememberComposableLambda(-207299487, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.options.OptionOrderFragment.refreshUi.5.1.1.2
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
                                        ComposerKt.traceEventStart(-207299487, i2, -1, "com.robinhood.android.trade.options.OptionOrderFragment.refreshUi.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OptionOrderFragment.kt:979)");
                                    }
                                    optionOrderFragment.DialogContent(optionOrderViewState.getValidationFailure().getContent(), sduiActionHandler, composer2, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer, 54), composer, 438, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2087187470, i2, -1, "com.robinhood.android.trade.options.OptionOrderFragment.refreshUi.<anonymous>.<anonymous> (OptionOrderFragment.kt:943)");
                        }
                        if (optionOrderViewState.getValidationFailure() != null) {
                            composer2.startReplaceGroup(-1746271574);
                            boolean zChangedInstance = composer2.changedInstance(optionOrderFragment) | composer2.changedInstance(optionOrderViewState) | composer2.changedInstance(optionOrderContext2);
                            final OptionOrderFragment optionOrderFragment2 = optionOrderFragment;
                            final OptionOrderContext optionOrderContext3 = optionOrderContext2;
                            final OptionOrderViewState optionOrderViewState2 = optionOrderViewState;
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$refreshUi$5$1$actionHandler$1$1
                                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                                    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                                    public final boolean mo15941handle(OptionOrderFormAction action) {
                                        Intrinsics.checkNotNullParameter(action, "action");
                                        String strLoggingIdentifier = optionOrderFragment2.loggingIdentifier(action);
                                        if (strLoggingIdentifier != null) {
                                            OptionOrderFragment optionOrderFragment3 = optionOrderFragment2;
                                            OptionOrderViewState optionOrderViewState3 = optionOrderViewState2;
                                            optionOrderFragment3.getDuxo().logServerDrivenOrderCheckAlertTap(optionOrderViewState3, optionOrderViewState3.getValidationFailure(), strLoggingIdentifier);
                                        }
                                        OptionOrderValidationFailureResolver.ActionWithOverrideName actionWithOverrideNameHandleOrderCheckAction = optionOrderFragment2.handleOrderCheckAction(action, optionOrderContext3);
                                        if (actionWithOverrideNameHandleOrderCheckAction == null) {
                                            optionOrderFragment2.getDuxo().skipAllChecksAndContinue(OrderCheckAbortReason.UNRECOGNIZED_ACTION, optionOrderViewState2.getValidationFailure().getType(), optionOrderFragment2.loggingIdentifier(action));
                                            return true;
                                        }
                                        optionOrderFragment2.getDuxo().handleFailureResolution(actionWithOverrideNameHandleOrderCheckAction.getAction(), actionWithOverrideNameHandleOrderCheckAction.getOverrideName());
                                        return true;
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue;
                            composer2.endReplaceGroup();
                            SduiActionHandler3.ProvideActionHandler(sduiActionHandler, ComposableLambda3.rememberComposableLambda(667537866, true, new C505841(optionOrderFragment, optionOrderViewState, sduiActionHandler), composer2, 54), composer2, 48);
                        }
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
        OptionOrderContext.ValidationContext validationContext = optionOrderContext.getValidationContext();
        Callbacks callbacks = getCallbacks();
        ApiCollateral collateral = validationContext.getCollateral();
        OptionOrderPayload protobuf = OptionOrders2.toProtobuf(optionOrderContext.getApiRequest(), getMoshi().get());
        OptionOrderContext.QuoteAggregation quoteAggregation = optionOrderContext.getPrices().getQuoteAggregation();
        BigDecimal bidPriceForLogging = quoteAggregation != null ? quoteAggregation.getBidPriceForLogging() : null;
        OptionOrderContext.QuoteAggregation quoteAggregation2 = optionOrderContext.getPrices().getQuoteAggregation();
        BigDecimal askPriceForLogging = quoteAggregation2 != null ? quoteAggregation2.getAskPriceForLogging() : null;
        int size = optionOrderContext.getApiRequest().getLegs().size();
        UiOptionOrder orderToReplace = ((Args) INSTANCE.getArgs((Fragment) this)).getOrderToReplace();
        callbacks.onLoadPassthroughContext(new OptionOrderConfirmationFragment.Args.PassthroughContext(collateral, protobuf, bidPriceForLogging, askPriceForLogging, size, orderToReplace != null ? orderToReplace.getId() : null, state.getSingleUiOptionChain(), state.getUiOptionOrderFee()));
        getContractsLabel().setText(state.getQuantityRowTitle(resources4));
        OptionOrderContext.Prices prices = optionOrderContext.getPrices();
        TextView bidAskTxt = getBidAskTxt();
        Resources resources5 = baseActivity.getResources();
        Intrinsics.checkNotNullExpressionValue(resources5, "getResources(...)");
        bidAskTxt.setText(OptionOrderContexts.getBidAskText(prices, resources5));
        TextView bidAskSingleLegTxt = getBidAskSingleLegTxt();
        Resources resources6 = baseActivity.getResources();
        Intrinsics.checkNotNullExpressionValue(resources6, "getResources(...)");
        bidAskSingleLegTxt.setText(OptionOrderContexts.getBidAskText(prices, resources6));
        getBidAskTxt().setVisibility(!optionOrderContext.isSingleLeg() && getBidAskTxt().getText() != null ? 0 : 8);
        getBidAskSingleLegTxt().setVisibility(optionOrderContext.isSingleLeg() && getBidAskSingleLegTxt().getText() != null ? 0 : 8);
        OnClickListeners.onClick(getBidAskSingleLegTxt(), new Function0() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOrderFragment.refreshUi$lambda$83(this.f$0);
            }
        });
        Money defaultPrice = state.getDefaultPrice();
        Integer numValueOf = defaultPrice == null ? Integer.valueOf(C29757R.string.option_order_price_placeholder) : null;
        getBinding().optionOrderLimitPriceInput.updateHintOverride(numValueOf);
        getStopPriceInputView().updateHintOverride(numValueOf);
        if (!Intrinsics.areEqual(getBinding().optionOrderLimitPriceInput.getHint(), defaultPrice)) {
            getBinding().optionOrderLimitPriceInput.setHint(defaultPrice);
        }
        if (getStopPriceInputView().getVisibility() == 0 && !Intrinsics.areEqual(getStopPriceInputView().getHint(), defaultPrice)) {
            getStopPriceInputView().setHint(defaultPrice);
        }
        TextView releasedCollateralTxt = getReleasedCollateralTxt();
        ApiCollateral collateral2 = validationContext.getCollateral();
        releasedCollateralTxt.setText(collateral2 != null ? OptionExtensions.getDisplayString(collateral2, baseActivity, OrderDirection.CREDIT) : null);
        TextView collateralTxt = getCollateralTxt();
        ApiCollateral collateral3 = validationContext.getCollateral();
        collateralTxt.setText(collateral3 != null ? OptionExtensions.getDisplayString(collateral3, baseActivity, OrderDirection.DEBIT) : null);
        getReviewOrderBtn().setLoading(state.getPendingValidation());
        updateCollateralVisibility();
        updateReviewButtonVisibility(optionOrderContext);
        updateInfoTextVisibility();
        baseActivity.invalidateOptionsMenu();
        UiEvent<SufficientBuyingPowerCryptoFailure> cryptoCancelAllPendingOrdersFailure = state.getCryptoCancelAllPendingOrdersFailure();
        if (cryptoCancelAllPendingOrdersFailure != null && (sufficientBuyingPowerCryptoFailureConsume = cryptoCancelAllPendingOrdersFailure.consume()) != null) {
            sufficientBuyingPowerCryptoFailureConsume.showAlert(baseActivity, optionOrderContext);
        }
        Validator.Action.RetryWhen<OptionOrderContext> retryWhenAction = state.getRetryWhenAction();
        if (retryWhenAction == null || !retryWhenAction.matches(optionOrderContext)) {
            return;
        }
        getDuxo().validateAndReviewOrder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$80$lambda$79(final OptionOrderFragment optionOrderFragment, OptionsProfitLossChartAnalysisFragmentKey optionsProfitLossChartAnalysisFragmentKey) {
        optionOrderFragment.getDuxo().runWithAnalytics(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.refreshUi$lambda$80$lambda$79$lambda$78(this.f$0, (AnalyticsLogger) obj);
            }
        });
        optionOrderFragment.getCallbacks().onProfitLossAnalysisSelected(optionsProfitLossChartAnalysisFragmentKey);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$80$lambda$79$lambda$78(OptionOrderFragment optionOrderFragment, AnalyticsLogger runWithAnalytics) {
        Intrinsics.checkNotNullParameter(runWithAnalytics, "$this$runWithAnalytics");
        optionOrderFragment.logOptionsProfitLossAnalysisBtnTap(runWithAnalytics);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshUi$lambda$83(OptionOrderFragment optionOrderFragment) {
        OptionOrderLoggings.logOptionOrderTapToOptionStatsPage(optionOrderFragment.getEventLogger(), OptionOrderLoggings.OPEN_OPTION_STATS_FROM_BID_ASK_IDENTIFIER);
        optionOrderFragment.launchFullMarketDataActivity();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <ActionT extends Parcelable> void DialogContent(final GenericAlertContent<? extends ActionT> genericAlertContent, final SduiActionHandler<? super ActionT> sduiActionHandler, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1389672165);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(genericAlertContent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(sduiActionHandler) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(this) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                sduiActionHandler = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1389672165, i3, -1, "com.robinhood.android.trade.options.OptionOrderFragment.DialogContent (OptionOrderFragment.kt:1051)");
            }
            Modifier modifierClip = Clip.clip(SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, 2, null), 0.0f, 1, null), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoAlertDialog2.INSTANCE.m20850getCornerRadiusD9Ej5fM()));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierClip);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BentoThemeOverlays.ElevatedThemeOverlay(ComposableLambda3.rememberComposableLambda(-1527604233, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$DialogContent$1$1
                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1527604233, i5, -1, "com.robinhood.android.trade.options.OptionOrderFragment.DialogContent.<anonymous>.<anonymous> (OptionOrderFragment.kt:1059)");
                    }
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, bentoTheme.getColors(composer2, i6).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM());
                    OptionOrderFragment optionOrderFragment = this.this$0;
                    GenericAlertContent<ActionT> genericAlertContent2 = genericAlertContent;
                    SduiActionHandler<ActionT> sduiActionHandler2 = sduiActionHandler;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5145paddingqDBjuR0);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    optionOrderFragment.Pog(genericAlertContent2.getPog(), genericAlertContent2.getPog_foreground_color(), genericAlertContent2.getPog_background_color(), composer2, 0);
                    BentoText2.m20747BentoText38GnDrw(genericAlertContent2.getTitle(), null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getDisplayCapsuleSmall(), composer2, 0, 0, 8126);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i6).m21593getSmallD9Ej5fM()), composer2, 0);
                    BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(genericAlertContent2.getBody_markdown(), null, null, null, 0, 1, 0, 0, null, composer2, 196608, 478);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM()), composer2, 0);
                    optionOrderFragment.ButtonList(extensions2.toImmutableList(genericAlertContent2.getAction_buttons()), sduiActionHandler2, composer2, 0, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final SduiActionHandler<? super ActionT> sduiActionHandler2 = sduiActionHandler;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOrderFragment.DialogContent$lambda$85(this.f$0, genericAlertContent, sduiActionHandler2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Pog(final Pictogram pictogram, final ThemedColor themedColor, final ThemedColor themedColor2, Composer composer, final int i) {
        int i2;
        String serverValue;
        Composer composerStartRestartGroup = composer.startRestartGroup(1430581388);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(pictogram == null ? -1 : pictogram.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(themedColor) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(themedColor2) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1430581388, i2, -1, "com.robinhood.android.trade.options.OptionOrderFragment.Pog (OptionOrderFragment.kt:1094)");
            }
            ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = (pictogram == null || (serverValue = pictogram.getServerValue()) == null) ? null : ServerToBentoAssetMapper3.INSTANCE.fromServerValue(serverValue);
            if (serverToBentoAssetMapper3FromServerValue != null) {
                int resourceId = serverToBentoAssetMapper3FromServerValue.getResourceId();
                BentoPogSize bentoPogSize = BentoPogSize.Hero;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 7, null);
                composerStartRestartGroup.startReplaceGroup(399195484);
                Color composeColor = themedColor == null ? null : SduiColors2.toComposeColor(themedColor, composerStartRestartGroup, (i2 >> 3) & 14);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(399198076);
                Color composeColor2 = themedColor2 != null ? SduiColors2.toComposeColor(themedColor2, composerStartRestartGroup, (i2 >> 6) & 14) : null;
                composerStartRestartGroup.endReplaceGroup();
                BentoPogKt.m20684BentoPictogramPogRhg8lNc(resourceId, modifierM5146paddingqDBjuR0$default, false, bentoPogSize, null, composeColor, composeColor2, composerStartRestartGroup, 3072, 20);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return OptionOrderFragment.Pog$lambda$88(this.f$0, pictogram, themedColor, themedColor2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <ActionT extends Parcelable> void ButtonList(ImmutableList<? extends Button<? extends ActionT>> immutableList, SduiActionHandler<? super ActionT> sduiActionHandler, Composer composer, final int i, final int i2) {
        final ImmutableList<? extends Button<? extends ActionT>> immutableList2;
        int i3;
        SduiActionHandler<? super ActionT> sduiActionHandler2;
        int i4;
        final SduiActionHandler<? super ActionT> sduiActionHandler3;
        SduiActionHandler<? super ActionT> sduiActionHandler4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1062255284);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            immutableList2 = immutableList;
        } else {
            immutableList2 = immutableList;
            i3 = (i & 6) == 0 ? i | (composerStartRestartGroup.changedInstance(immutableList2) ? 4 : 2) : i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                sduiActionHandler2 = sduiActionHandler;
                i3 |= composerStartRestartGroup.changedInstance(sduiActionHandler2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i5 != 0) {
                    sduiActionHandler2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1062255284, i4, -1, "com.robinhood.android.trade.options.OptionOrderFragment.ButtonList (OptionOrderFragment.kt:1112)");
                }
                int i6 = 0;
                for (Button<? extends ActionT> button : immutableList2) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    Button<? extends ActionT> button2 = button;
                    composerStartRestartGroup.startReplaceGroup(-1374880843);
                    if (i6 != 0) {
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (button2.getTint_color() != null) {
                        composerStartRestartGroup.startReplaceGroup(-1654516916);
                        SduiButton2.SduiButton(button2, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), composerStartRestartGroup, 48, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        sduiActionHandler4 = sduiActionHandler2;
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1654356274);
                        sduiActionHandler4 = sduiActionHandler2;
                        BentoAlerts2.AchromaticAlertButton(SduiAlert.INSTANCE.toAlertButton(button2, sduiActionHandler2, composerStartRestartGroup, (i4 & 112) | (SduiAlert.$stable << 6), 0), i6 == 0, null, composerStartRestartGroup, BentoAlertButton.$stable, 4);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    i6 = i7;
                    sduiActionHandler2 = sduiActionHandler4;
                }
                SduiActionHandler<? super ActionT> sduiActionHandler5 = sduiActionHandler2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                sduiActionHandler3 = sduiActionHandler5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                sduiActionHandler3 = sduiActionHandler2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionOrderFragment.ButtonList$lambda$90(this.f$0, immutableList2, sduiActionHandler3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        sduiActionHandler2 = sduiActionHandler;
        i4 = i3;
        if ((i4 & 19) == 18) {
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i62 = 0;
            while (r0.hasNext()) {
            }
            SduiActionHandler<? super ActionT> sduiActionHandler52 = sduiActionHandler2;
            if (ComposerKt.isTraceInProgress()) {
            }
            sduiActionHandler3 = sduiActionHandler52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public final void setOptionOrderType(OptionOrderType optionOrderType, boolean editedByUser) {
        Intrinsics.checkNotNullParameter(optionOrderType, "optionOrderType");
        getDuxo().setOptionOrderType(optionOrderType, editedByUser);
        if (isResumed()) {
            getBinding().optionOrderLimitPriceInput.setAmount(null);
            getStopPriceInputView().setAmount(null);
        }
    }

    public final void setTimeInForce(OrderTimeInForce timeInForce, boolean editedByUser) {
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        getDuxo().setTimeInForce(timeInForce, editedByUser);
        setTimeInForceBundle(timeInForce);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void validateAndReviewOrder() {
        getDuxo().logReviewClicked();
        getDuxo().validateAndReviewOrder();
    }

    @Override // com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver
    public void launchTransfers(final BigDecimal amount, final BrokerageAccountType brokerageAccountType, ApiTransferAccount.TransferAccountType transferAccountType, String accountNumber) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(transferAccountType, "transferAccountType");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        final TransferConfiguration.Standard standard = new TransferConfiguration.Standard(amount, null, false, new TransferConfiguration.TransferAccountSelection(null, false, ApiTransferAccount.TransferAccountType.ACH, 3, null), new TransferConfiguration.TransferAccountSelection(accountNumber, false, transferAccountType, 2, null), null, MAXTransferContext.EntryPoint.OPTIONS_ORDER_CHECK, null, false, false, null, null, false, 8102, null);
        Observable observableTake = ExperimentsProvider.DefaultImpls.streamState$default(getExperimentsStore(), new Experiment[]{OptionsOrderChecksToGuided.INSTANCE}, false, null, 6, null).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.launchTransfers$lambda$91(standard, amount, brokerageAccountType, this, (Boolean) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchTransfers$lambda$91(TransferConfiguration.Standard standard, BigDecimal bigDecimal, BrokerageAccountType brokerageAccountType, OptionOrderFragment optionOrderFragment, Boolean bool) {
        IntentKey depositFundsDeepLink;
        if (bool.booleanValue()) {
            depositFundsDeepLink = new TransferV2(TransferDirectionV2.DEPOSIT, standard, null, 4, null);
        } else {
            depositFundsDeepLink = new DepositFundsDeepLink(bigDecimal, null, TransferContext.RobinhoodAccountType.INSTANCE.from(brokerageAccountType), false, MAXTransferContext.EntryPoint.OPTIONS_ORDER_CHECK, 10, null);
        }
        Navigator navigator = optionOrderFragment.getNavigator();
        Context contextRequireContext = optionOrderFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, depositFundsDeepLink, null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver
    public void launchDeepLink(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, uri, null, null, false, null, 60, null);
    }

    @Override // com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver
    public void viewExistingOptionOrder(UUID orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, new OptionOrderDetailFragmentKey(orderId), false, false, false, null, true, null, false, false, null, null, 4028, null);
    }

    @Override // com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver
    public void promptForLimitPrice() {
        getBinding().optionOrderLimitPriceInput.requestAmountTextFocus();
    }

    @Override // com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver
    @SuppressLint({"SetTextI18n"})
    public void updateQuantity(BigDecimal newQuantity) {
        Intrinsics.checkNotNullParameter(newQuantity, "newQuantity");
        getBinding().optionOrderFragmentContractsEdt.setText(String.valueOf(newQuantity.intValue()));
    }

    @Override // com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver
    public void updateLimitPrice(BigDecimal newLimitPrice) {
        Intrinsics.checkNotNullParameter(newLimitPrice, "newLimitPrice");
        getBinding().optionOrderLimitPriceInput.setAmount(Money3.toMoney(newLimitPrice, Currencies.USD));
    }

    @Override // com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver
    public void overrideDayTradeChecks() {
        getDuxo().overrideDayTradeChecks();
    }

    @Override // com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver
    public void launchDayTradeSettings(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Navigator navigator = getNavigator();
        SettingsPage settingsPage = new SettingsPage(Constants6.DAY_TRADE_SETTINGS_PAGE_ID, accountNumber, null, 4, null);
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.showFragment$default(navigator, contextRequireContext, settingsPage, false, false, false, null, false, null, false, false, null, null, 4092, null);
    }

    @Override // com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver
    public void overrideDtbpChecks() {
        getDuxo().overrideDtbpChecks();
    }

    @Override // com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver
    public void overrideDirection(OrderDirection direction) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        getDuxo().overrideDirection(direction);
    }

    @Override // com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver
    public void setPreserveUserInput(boolean preserveUserInput) {
        getDuxo().setPreserveUserInput(preserveUserInput);
    }

    @Override // com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver
    public void launchRhsConversion() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.RhsConversion(true), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver
    public void promptAndClearStopPrice() {
        clearStopPrice();
        getBinding().optionOrderLimitPriceInput.requestAmountTextFocus();
    }

    @Override // com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver
    public void disableStopPrice() {
        clearStopPrice();
        setOptionOrderType(OptionOrderType.LIMIT, true);
    }

    /* compiled from: OptionOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderFragment$promptForStopPrice$1", m3645f = "OptionOrderFragment.kt", m3646l = {1260}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.trade.options.OptionOrderFragment$promptForStopPrice$1 */
    static final class C297311 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C297311(Continuation<? super C297311> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OptionOrderFragment.this.new C297311(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C297311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<OptionOrderViewState> statesFlow = OptionOrderFragment.this.getDuxo().getStatesFlow();
                Flow flowTake = FlowKt.take(new Flow<OptionOrderType>() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$promptForStopPrice$1$invokeSuspend$$inlined$map$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super OptionOrderType> flowCollector, Continuation continuation) {
                        Object objCollect = statesFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.options.OptionOrderFragment$promptForStopPrice$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.trade.options.OptionOrderFragment$promptForStopPrice$1$invokeSuspend$$inlined$map$1$2", m3645f = "OptionOrderFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.trade.options.OptionOrderFragment$promptForStopPrice$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                OptionOrderType optionOrderType = ((OptionOrderViewState) obj).getUserInputPrices().getOptionOrderType();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(optionOrderType, anonymousClass1) == coroutine_suspended) {
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
                }, 1);
                final OptionOrderFragment optionOrderFragment = OptionOrderFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.trade.options.OptionOrderFragment.promptForStopPrice.1.2

                    /* compiled from: OptionOrderFragment.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.trade.options.OptionOrderFragment$promptForStopPrice$1$2$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[OptionOrderType.values().length];
                            try {
                                iArr[OptionOrderType.STOP_LIMIT.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[OptionOrderType.STOP_MARKET.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[OptionOrderType.LIMIT.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[OptionOrderType.MARKET.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((OptionOrderType) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(OptionOrderType optionOrderType, Continuation<? super Unit> continuation) {
                        int i2 = WhenMappings.$EnumSwitchMapping$0[optionOrderType.ordinal()];
                        if (i2 == 1) {
                            optionOrderFragment.getStopPriceInputView().requestAmountTextFocus();
                        } else if (i2 == 2) {
                            optionOrderFragment.getDuxo().requestFocusStopTriggerPrice();
                        } else {
                            if (i2 != 3 && i2 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("SDOC requests focus for stop price, but the order type is " + optionOrderType), false, null, 6, null);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowTake.collect(flowCollector, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver
    public void promptForStopPrice() {
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C297311(null), 3, null);
    }

    @Override // com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver
    public void disableStopPriceAndPromptLimit() {
        clearStopPrice();
        setOptionOrderType(OptionOrderType.LIMIT, true);
        promptForLimitPrice();
    }

    @Override // com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver
    public void cancelPendingCryptoOrders() {
        getDuxo().cancelPendingCryptoOrders();
    }

    @Override // com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver
    public void clearCancelPendingCryptoState() {
        getDuxo().clearCancelPendingCryptoState();
    }

    @Override // com.robinhood.android.trade.options.validation.OptionOrderValidationFailureResolver
    public void cancelBlockingOrders(List<UUID> optionOrderRhIds, String accountNumber) {
        Intrinsics.checkNotNullParameter(optionOrderRhIds, "optionOrderRhIds");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        OptionOrderDuxo duxo = getDuxo();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        duxo.cancelBlockingOrders(contextRequireContext, optionOrderRhIds, accountNumber);
    }

    private final void clearStopPrice() {
        getStopPriceInputView().setAmount(null);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void onFormStateUpdated() {
        updateLimitPriceColor();
        updateContractQuantityColor();
        if (!getReviewing()) {
            getDuxo().clearOrderCheckOverride();
        }
        View view = this.actionOptionOrderTypeContainer;
        if (view != null) {
            view.setVisibility(!getReviewing() ? 0 : 8);
        }
        getContractsEdt().setEnabled(!getReviewing());
        getBinding().optionOrderLimitPriceInput.setAmountEnabled(!getReviewing());
        getStopPriceInputView().setAmountEnabled(!getReviewing());
        updateCollateralVisibility();
        updateInfoTextVisibility();
        super.onFormStateUpdated();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public ConstraintSet getConstraintsForState(DefaultOrderState formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        int i = WhenMappings.$EnumSwitchMapping$0[formState.ordinal()];
        if (i == 1) {
            return this.initialConstraints;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return this.reviewingConstraints;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void onFormStateAnimationEnd(DefaultOrderState formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        if (formState.getIsReviewingState()) {
            getDuxo().logReviewingReadyToSubmit();
        }
    }

    private final void updateLimitPriceColor() {
        if (getReviewing()) {
            RhMoneyInputView rhMoneyInputView = getBinding().optionOrderLimitPriceInput;
            ThemeAttributes themeAttributes = ThemeAttributes.INSTANCE;
            rhMoneyInputView.overrideAmountHintTextColor(themeAttributes.getTEXT_COLOR_PRIMARY_NO_DISABLE());
            getStopPriceInputView().overrideAmountHintTextColor(themeAttributes.getTEXT_COLOR_PRIMARY_NO_DISABLE());
            return;
        }
        RhMoneyInputView rhMoneyInputView2 = getBinding().optionOrderLimitPriceInput;
        DirectResourceReference<ColorStateList> directResourceReference = LIMIT_PRICE_HINT_TEXT_COLOR;
        rhMoneyInputView2.overrideAmountHintTextColor(directResourceReference);
        getStopPriceInputView().overrideAmountHintTextColor(directResourceReference);
    }

    private final void updateContractQuantityColor() {
        if (getReviewing()) {
            ScarletManager2.overrideAttribute(getContractsEdt(), android.R.attr.textColorHint, ThemeAttributes.INSTANCE.getTEXT_COLOR_PRIMARY_NO_DISABLE());
        } else {
            ScarletManager2.overrideAttribute(getContractsEdt(), android.R.attr.textColorHint, CONTRACT_QUANTITY_HINT_TEXT_COLOR);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateCollateralVisibility() {
        boolean z;
        boolean z2;
        TextView releasedCollateralTxt = getReleasedCollateralTxt();
        if (getReviewing()) {
            CharSequence text = releasedCollateralTxt.getText();
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            z = !StringsKt.isBlank(text);
        }
        Group releasedCollateralGroup = getReleasedCollateralGroup();
        if (releasedCollateralGroup != null) {
            releasedCollateralGroup.setVisibility(z ? 0 : 8);
        }
        TextView collateralTxt = getCollateralTxt();
        if (getReviewing()) {
            CharSequence text2 = collateralTxt.getText();
            Intrinsics.checkNotNullExpressionValue(text2, "getText(...)");
            z2 = StringsKt.isBlank(text2) ? false : true;
        }
        Group collateralGroup = getCollateralGroup();
        if (collateralGroup != null) {
            collateralGroup.setVisibility(z2 ? 0 : 8);
        }
    }

    private final void updateReviewButtonVisibility(OptionOrderContext orderContext) {
        if (getReviewing()) {
            return;
        }
        getReviewOrderBtn().setEnabled(orderContext.getIsReviewable());
    }

    private final void updateInfoTextVisibility() {
        if (getReviewing()) {
            getBidAskTxt().setVisibility(getBidAskTxt().getText() != null ? 0 : 8);
            getBidAskSingleLegTxt().setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchFullMarketDataActivity() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        OptionLegBundle optionLegBundle = (OptionLegBundle) CollectionsKt.singleOrNull((List) ((Args) INSTANCE.getArgs((Fragment) this)).getOptionOrderBundle().getLegBundles());
        if (optionLegBundle != null) {
            Navigator.DefaultImpls.showFragment$default(getNavigator(), fragmentActivityRequireActivity, new OptionStatisticsFragmentKey(optionLegBundle, null, OptionStatisticsTradableState.NotAvailable.INSTANCE, null, false, 24, null), false, false, false, null, false, null, false, false, null, null, 4084, null);
            return;
        }
        throw new UnsupportedOperationException("multileg marketdata screen when api is available");
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        if (getReviewing()) {
            getDuxo().setFormState(DefaultOrderState.EDITING);
            return true;
        }
        return super.onBackPressed();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void performSubmitOrder() {
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$performSubmitOrder$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                OptionOrderViewState optionOrderViewState = (OptionOrderViewState) it;
                OptionOrderContext optionOrderContext = optionOrderViewState.getOptionOrderContext();
                return Optional3.asOptional(optionOrderContext != null ? Tuples4.m3642to(optionOrderContext, optionOrderViewState) : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((OptionOrderFragment$performSubmitOrder$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Single singleFirstOrError = ObservablesKt.filterIsPresent(map).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(singleFirstOrError), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.performSubmitOrder$lambda$94(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit performSubmitOrder$lambda$94(OptionOrderFragment optionOrderFragment, Tuples2 tuples2) {
        MarketabilityType rosettaType;
        OptionOrderViewState.Marketability marketability;
        OptionOrderViewState.Marketability.MarketabilityType marketabilityType;
        OptionOrder optionOrder;
        OptionOrderContext optionOrderContext = (OptionOrderContext) tuples2.component1();
        OptionOrderViewState optionOrderViewState = (OptionOrderViewState) tuples2.component2();
        OptionOrderDuxo duxo = optionOrderFragment.getDuxo();
        rosetta.account.BrokerageAccountType analyticsAccountType = optionOrderViewState.getAnalyticsAccountType();
        BigDecimal absoluteLimitPriceForAnalytics = optionOrderViewState.getUserInputPrices().getAbsoluteLimitPriceForAnalytics();
        String symbol = optionOrderContext.getRequestContext().getOptionChain().getOptionChain().getSymbol();
        Companion companion = INSTANCE;
        UiOptionOrder orderToReplace = ((Args) companion.getArgs((Fragment) optionOrderFragment)).getOrderToReplace();
        UUID id = (orderToReplace == null || (optionOrder = orderToReplace.getOptionOrder()) == null) ? null : optionOrder.getId();
        OptionOrderMeta.Source metaSource = OptionOrderSource.toMetaSource(((Args) companion.getArgs((Fragment) optionOrderFragment)).getSource());
        OptionOrderViewState.UiMarketability uiMarketabilitySingleLegMarketabilityForLogging = optionOrderViewState.singleLegMarketabilityForLogging(optionOrderFragment.getClock());
        if (uiMarketabilitySingleLegMarketabilityForLogging == null || (marketability = uiMarketabilitySingleLegMarketabilityForLogging.getMarketability()) == null || (marketabilityType = marketability.getMarketabilityType()) == null || (rosettaType = marketabilityType.getRosettaType()) == null) {
            rosettaType = MarketabilityType.MARKETABILITY_UNSPECIFIED;
        }
        duxo.submit(analyticsAccountType, optionOrderContext, absoluteLimitPriceForAnalytics, symbol, id, metaSource, rosettaType);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks3
    public void onAccountSwitcherCtaClicked(AccountSwitcherData args) {
        Intrinsics.checkNotNullParameter(args, "args");
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new AccountSwitcherBottomSheetFragmentKey(args), null, 2, null).show(getChildFragmentManager(), "account-switcher");
    }

    @Override // com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks3
    public void showSduiAccountSwitcher(SurfaceDto surface) {
        Intrinsics.checkNotNullParameter(surface, "surface");
        Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new SduiAccountSwitcherBottomSheetFragmentKey(surface), null, 2, null).show(getChildFragmentManager(), "sdui-account-switcher");
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onAccountSelected(String accountNumber, BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        getDuxo().setAccountNumber(accountNumber);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.view.SwipeToConfirmTouchListener.Callbacks
    public void onSwipeToSubmitAnimationStart(long duration) {
        getDuxo().onSwipeToSubmitAnimationStart();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), UserInteractionEventData.Action.ANIMATION, new Screen(Screen.Name.OPTION_ORDER_FORM, null, null, null, 14, null), null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, (int) duration, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, -1, -1, -1, -1, 16383, null), 12, null);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.view.SwipeToConfirmTouchListener.Callbacks
    public void onSwipeToSubmitAnimationComplete() {
        getDuxo().onSwipeToSubmitAnimationComplete();
    }

    @Override // com.robinhood.shared.account.contracts.switcher.AccountSwitcherCallbacks
    public void onRefreshAccountsClicked() {
        getDuxo().refreshAccountSwitcher();
    }

    @Override // com.robinhood.android.trade.options.OptionOrderTimeInForcePickerDialogFragment.Callbacks
    public void onTimeInForcePicked(OrderTimeInForce timeInForce) {
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        getDuxo().logTapTimeInForce(timeInForce);
        setTimeInForce(timeInForce, true);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void initializeViews(final ProfitLossChartContext.NormalDevice normalDevice) {
        getBinding().optionOrderLimitPriceInput.setOnAmountTouchListener(new Function0() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOrderFragment.initializeViews$lambda$95(this.f$0, normalDevice);
            }
        });
        getStopPriceInputView().setOnAmountTouchListener(new Function0() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionOrderFragment.initializeViews$lambda$96(this.f$0, normalDevice);
            }
        });
        getContractsEdt().setOnTouchListener(new View.OnTouchListener() { // from class: com.robinhood.android.trade.options.OptionOrderFragment.initializeViews.3
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                OptionOrderFragment.this.setChartVisibility(normalDevice, false);
                return false;
            }
        });
        Observables observables = Observables.INSTANCE;
        Observable<ProfitLossAdditionalInfo> profitLossAdditionalInfoObs = normalDevice.getChart().getProfitLossAdditionalInfoObs();
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$initializeViews$$inlined$mapDistinct$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final R apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (R) Boolean.valueOf(((OptionOrderViewState) it).getShouldShowProfitAndLossChart());
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        Observable observableCombineLatest = Observable.combineLatest(profitLossAdditionalInfoObs, observableDistinctUntilChanged, new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$initializeViews$$inlined$combineLatest$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.BiFunction
            public final R apply(T1 t1, T2 t2) {
                Intrinsics.checkParameterIsNotNull(t1, "t1");
                Intrinsics.checkParameterIsNotNull(t2, "t2");
                ProfitLossAdditionalInfo profitLossAdditionalInfo = (ProfitLossAdditionalInfo) t1;
                if (!((Boolean) t2).booleanValue()) {
                    profitLossAdditionalInfo = null;
                }
                return (R) Optional3.asOptional(profitLossAdditionalInfo);
            }
        });
        Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(ObservablesKt.filterIsPresent(observableCombineLatest)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C297246(normalDevice.getInfoBar()));
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(normalDevice.getInfoBar().getShouldForceCollapseChartObs()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.initializeViews$lambda$100(this.f$0, normalDevice, (Unit) obj);
            }
        });
        getDuxo().runWithAnalytics(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.initializeViews$lambda$102(this.f$0, normalDevice, (AnalyticsLogger) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeViews$lambda$95(OptionOrderFragment optionOrderFragment, ProfitLossChartContext.NormalDevice normalDevice) {
        optionOrderFragment.setChartVisibility(normalDevice, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeViews$lambda$96(OptionOrderFragment optionOrderFragment, ProfitLossChartContext.NormalDevice normalDevice) {
        optionOrderFragment.setChartVisibility(normalDevice, false);
        return Unit.INSTANCE;
    }

    /* compiled from: OptionOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.trade.options.OptionOrderFragment$initializeViews$6 */
    /* synthetic */ class C297246 extends FunctionReferenceImpl implements Function1<ProfitLossAdditionalInfo, Unit> {
        C297246(Object obj) {
            super(1, obj, OptionsProfitLossInfoBar.class, "updateInfo", "updateInfo(Lcom/robinhood/android/trade/options/profitloss/ProfitLossAdditionalInfo;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ProfitLossAdditionalInfo profitLossAdditionalInfo) {
            invoke2(profitLossAdditionalInfo);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ProfitLossAdditionalInfo p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((OptionsProfitLossInfoBar) this.receiver).updateInfo(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeViews$lambda$100(OptionOrderFragment optionOrderFragment, ProfitLossChartContext.NormalDevice normalDevice, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        optionOrderFragment.setChartVisibility(normalDevice, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeViews$lambda$102(final OptionOrderFragment optionOrderFragment, final ProfitLossChartContext.NormalDevice normalDevice, AnalyticsLogger analytics) {
        Intrinsics.checkNotNullParameter(analytics, "$this$analytics");
        optionOrderFragment.logOptionsProfitLossInfoBarAppear(analytics);
        optionOrderFragment.onInfoBarClickWithLogging(normalDevice.getInfoBar(), analytics, null, new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.initializeViews$lambda$102$lambda$101(this.f$0, normalDevice, ((Boolean) obj).booleanValue());
            }
        }, optionOrderFragment.getActivityErrorHandler());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initializeViews$lambda$102$lambda$101(OptionOrderFragment optionOrderFragment, ProfitLossChartContext.NormalDevice normalDevice, boolean z) {
        optionOrderFragment.setChartVisibility(normalDevice, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setChartVisibility(ProfitLossChartContext.NormalDevice normalDevice, boolean z) {
        if (getReviewing() || normalDevice.getChartContainerVisibility() == z) {
            return;
        }
        ConstraintLayout numpadContainer = getNumpadContainer();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$setChartVisibility$$inlined$beginDelayedTransition$1
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
                IdlingResourceCounters2.increment(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        transitionSet.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$setChartVisibility$$inlined$beginDelayedTransition$2
            @Override // android.transition.Transition.TransitionListener
            public void onTransitionCancel(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionPause(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionResume(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionStart(Transition transition) {
            }

            @Override // android.transition.Transition.TransitionListener
            public void onTransitionEnd(Transition transition) {
                IdlingResourceCounters2.decrement(IdlingResourceType.DELAYED_TRANSITION);
            }
        });
        Transitions2.add(transitionSet, new Fade());
        SimpleSlide simpleSlide = new SimpleSlide(0, 1, null);
        simpleSlide.addTarget(getNumpad());
        transitionSet.addTransition(simpleSlide);
        Transitions2.add(transitionSet, new Rotation());
        Transitions2.add(transitionSet, new ChangeBounds());
        transitionSet.setInterpolator((TimeInterpolator) Interpolators.INSTANCE.getFastOutSlowIn());
        TransitionManager.beginDelayedTransition(numpadContainer, transitionSet);
        normalDevice.setChartContainerVisibility(z);
        getNumpad().setVisibility(z ? 4 : 0);
        normalDevice.getInfoBar().setChartExpanded(z);
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(getNumpadContainer());
        int id = getReviewBtnHolder().getId();
        int id2 = (z ? normalDevice.getBottomPosition() : normalDevice.getTopPosition()).getId();
        constraintSet.connect(id, 3, id2, 3, 0);
        constraintSet.connect(id, 4, id2, 4, 0);
        constraintSet.applyTo(getNumpadContainer());
        if (z) {
            return;
        }
        getDuxo().runWithAnalytics(new Function1() { // from class: com.robinhood.android.trade.options.OptionOrderFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionOrderFragment.setChartVisibility$lambda$106(this.f$0, (AnalyticsLogger) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setChartVisibility$lambda$106(OptionOrderFragment optionOrderFragment, AnalyticsLogger runWithAnalytics) {
        Intrinsics.checkNotNullParameter(runWithAnalytics, "$this$runWithAnalytics");
        optionOrderFragment.logChartDisappear(runWithAnalytics);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.mcw.contracts.QuickConversionCallbacks
    public void onConversionComplete(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        RdsSnackbar.Companion companion = RdsSnackbar.INSTANCE;
        View viewRequireView = requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
        companion.make(viewRequireView, message, 0).show();
    }

    @Override // com.robinhood.android.mcw.contracts.QuickConversionCallbacks
    public void onConversionOrderCheckAction(GenericOrderCheckAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof GenericOrderCheckAction.OptionsConvertToLimit) {
            disableStopPriceAndPromptLimit();
            return;
        }
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Unsupported conversion order check action in options order: " + action), false, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: OptionOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderFragment$ProfitLossChartContext;", "", "<init>", "()V", "throwNonfatalIfUnexpectedContext", "", "showProfitLossChart", "", "isSmallDevice", "Control", "SmallDevice", "NormalDevice", "Lcom/robinhood/android/trade/options/OptionOrderFragment$ProfitLossChartContext$Control;", "Lcom/robinhood/android/trade/options/OptionOrderFragment$ProfitLossChartContext$NormalDevice;", "Lcom/robinhood/android/trade/options/OptionOrderFragment$ProfitLossChartContext$SmallDevice;", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static abstract class ProfitLossChartContext {
        public /* synthetic */ ProfitLossChartContext(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ProfitLossChartContext() {
        }

        /* compiled from: OptionOrderFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderFragment$ProfitLossChartContext$Control;", "Lcom/robinhood/android/trade/options/OptionOrderFragment$ProfitLossChartContext;", "<init>", "()V", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Control extends ProfitLossChartContext {
            public static final int $stable = 0;
            public static final Control INSTANCE = new Control();

            private Control() {
                super(null);
            }
        }

        /* compiled from: OptionOrderFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderFragment$ProfitLossChartContext$SmallDevice;", "Lcom/robinhood/android/trade/options/OptionOrderFragment$ProfitLossChartContext;", "analysisBtn", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "getAnalysisBtn", "()Landroid/view/View;", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class SmallDevice extends ProfitLossChartContext {
            public static final int $stable = 8;
            private final View analysisBtn;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SmallDevice(View analysisBtn) {
                super(null);
                Intrinsics.checkNotNullParameter(analysisBtn, "analysisBtn");
                this.analysisBtn = analysisBtn;
            }

            public final View getAnalysisBtn() {
                return this.analysisBtn;
            }
        }

        /* compiled from: OptionOrderFragment.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00178F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderFragment$ProfitLossChartContext$NormalDevice;", "Lcom/robinhood/android/trade/options/OptionOrderFragment$ProfitLossChartContext;", "infoBar", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBar;", "chart", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartView;", "topPosition", "Landroid/view/View;", "bottomPosition", "learnMoreLink", "chartContainer", "Landroidx/constraintlayout/widget/Group;", "<init>", "(Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBar;Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartView;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroidx/constraintlayout/widget/Group;)V", "getInfoBar", "()Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossInfoBar;", "getChart", "()Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartView;", "getTopPosition", "()Landroid/view/View;", "getBottomPosition", "getLearnMoreLink", "value", "", "chartContainerVisibility", "getChartContainerVisibility", "()Z", "setChartContainerVisibility", "(Z)V", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class NormalDevice extends ProfitLossChartContext {
            public static final int $stable = 8;
            private final View bottomPosition;
            private final OptionsProfitLossChartView chart;
            private final Group chartContainer;
            private final OptionsProfitLossInfoBar infoBar;
            private final View learnMoreLink;
            private final View topPosition;

            public final OptionsProfitLossInfoBar getInfoBar() {
                return this.infoBar;
            }

            public final OptionsProfitLossChartView getChart() {
                return this.chart;
            }

            public final View getTopPosition() {
                return this.topPosition;
            }

            public final View getBottomPosition() {
                return this.bottomPosition;
            }

            public final View getLearnMoreLink() {
                return this.learnMoreLink;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NormalDevice(OptionsProfitLossInfoBar infoBar, OptionsProfitLossChartView chart, View topPosition, View bottomPosition, View learnMoreLink, Group chartContainer) {
                super(null);
                Intrinsics.checkNotNullParameter(infoBar, "infoBar");
                Intrinsics.checkNotNullParameter(chart, "chart");
                Intrinsics.checkNotNullParameter(topPosition, "topPosition");
                Intrinsics.checkNotNullParameter(bottomPosition, "bottomPosition");
                Intrinsics.checkNotNullParameter(learnMoreLink, "learnMoreLink");
                Intrinsics.checkNotNullParameter(chartContainer, "chartContainer");
                this.infoBar = infoBar;
                this.chart = chart;
                this.topPosition = topPosition;
                this.bottomPosition = bottomPosition;
                this.learnMoreLink = learnMoreLink;
                this.chartContainer = chartContainer;
            }

            public final boolean getChartContainerVisibility() {
                return this.chartContainer.getVisibility() == 0;
            }

            public final void setChartContainerVisibility(boolean z) {
                this.chartContainer.setVisibility(z ? 0 : 8);
            }
        }

        public final void throwNonfatalIfUnexpectedContext(boolean showProfitLossChart, boolean isSmallDevice) {
            String simpleName;
            String simpleName2 = Reflection.getOrCreateKotlinClass(getClass()).getSimpleName();
            if (!showProfitLossChart) {
                simpleName = Reflection.getOrCreateKotlinClass(Control.class).getSimpleName();
            } else if (isSmallDevice) {
                simpleName = Reflection.getOrCreateKotlinClass(SmallDevice.class).getSimpleName();
            } else {
                simpleName = Reflection.getOrCreateKotlinClass(NormalDevice.class).getSimpleName();
            }
            if (Intrinsics.areEqual(simpleName, simpleName2)) {
                return;
            }
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Tried to use " + simpleName + " P/L state but was actually in " + simpleName2 + " P/L state"), false, null, 6, null);
        }
    }

    /* compiled from: OptionOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010:\u001a\u0004\u0018\u00010;J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010B\u001a\u00020\u000fHÆ\u0003J\t\u0010C\u001a\u00020\u000fHÆ\u0003J\t\u0010D\u001a\u00020\u000fHÆ\u0003J\t\u0010E\u001a\u00020\u0007HÆ\u0003J\t\u0010F\u001a\u00020\u0014HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\t\u0010I\u001a\u00020\u000fHÆ\u0003J\t\u0010J\u001a\u00020\u0016HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u001cHÆ\u0003J¹\u0001\u0010L\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u000f2\b\b\u0002\u0010\u001a\u001a\u00020\u00162\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÆ\u0001J\u0006\u0010M\u001a\u00020NJ\u0013\u0010O\u001a\u00020\u000f2\b\u0010P\u001a\u0004\u0018\u00010QHÖ\u0003J\t\u0010R\u001a\u00020NHÖ\u0001J\t\u0010S\u001a\u00020\u0016HÖ\u0001J\u0016\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020NR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0010\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010,R\u0011\u0010\u0011\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b.\u0010,R\u0011\u0010\u0012\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b/\u0010$R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u0010\u0019\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b6\u0010,R\u0011\u0010\u001a\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b7\u00103R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b8\u00109¨\u0006Y"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderFragment$Args;", "Landroid/os/Parcelable;", "optionOrderBundle", "Lcom/robinhood/models/ui/OptionOrderBundle;", "orderToReplace", "Lcom/robinhood/models/ui/UiOptionOrder;", "orderIdToPlaceAgain", "Ljava/util/UUID;", "prefilledQuantity", "Ljava/math/BigDecimal;", "prefilledOrderType", "Lcom/robinhood/models/db/OptionOrderType;", "prefilledTimeInForce", "Lcom/robinhood/models/db/OrderTimeInForce;", "shouldSetInitialFocusToLimitPrice", "", "shouldSetInitialFocusToStopPrice", "shouldShowPlCharts", "orderUuid", "source", "Lrosetta/option/OptionOrderFormSource;", "strategyCode", "", "defaultPricingSettingOverride", "Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "shouldIgnoreDefaultPricing", "initialAccountNumber", "chainDisplayModeForLogging", "Lcom/robinhood/models/ui/OptionChainDisplayMode;", "<init>", "(Lcom/robinhood/models/ui/OptionOrderBundle;Lcom/robinhood/models/ui/UiOptionOrder;Ljava/util/UUID;Ljava/math/BigDecimal;Lcom/robinhood/models/db/OptionOrderType;Lcom/robinhood/models/db/OrderTimeInForce;ZZZLjava/util/UUID;Lrosetta/option/OptionOrderFormSource;Ljava/lang/String;Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;ZLjava/lang/String;Lcom/robinhood/models/ui/OptionChainDisplayMode;)V", "getOptionOrderBundle", "()Lcom/robinhood/models/ui/OptionOrderBundle;", "getOrderToReplace", "()Lcom/robinhood/models/ui/UiOptionOrder;", "getOrderIdToPlaceAgain", "()Ljava/util/UUID;", "getPrefilledQuantity", "()Ljava/math/BigDecimal;", "getPrefilledOrderType", "()Lcom/robinhood/models/db/OptionOrderType;", "getPrefilledTimeInForce", "()Lcom/robinhood/models/db/OrderTimeInForce;", "getShouldSetInitialFocusToLimitPrice", "()Z", "getShouldSetInitialFocusToStopPrice", "getShouldShowPlCharts", "getOrderUuid", "getSource", "()Lrosetta/option/OptionOrderFormSource;", "getStrategyCode", "()Ljava/lang/String;", "getDefaultPricingSettingOverride", "()Lcom/robinhood/models/db/OptionSettings$DefaultPricingSetting;", "getShouldIgnoreDefaultPricing", "getInitialAccountNumber", "getChainDisplayModeForLogging", "()Lcom/robinhood/models/ui/OptionChainDisplayMode;", "getOptionRelatedOrderData", "Lcom/robinhood/rosetta/eventlogging/OptionRelatedOrderData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final OptionChainDisplayMode chainDisplayModeForLogging;
        private final OptionSettings.DefaultPricingSetting defaultPricingSettingOverride;
        private final String initialAccountNumber;
        private final OptionOrderBundle optionOrderBundle;
        private final UUID orderIdToPlaceAgain;
        private final UiOptionOrder orderToReplace;
        private final UUID orderUuid;
        private final OptionOrderType prefilledOrderType;
        private final BigDecimal prefilledQuantity;
        private final OrderTimeInForce prefilledTimeInForce;
        private final boolean shouldIgnoreDefaultPricing;
        private final boolean shouldSetInitialFocusToLimitPrice;
        private final boolean shouldSetInitialFocusToStopPrice;
        private final boolean shouldShowPlCharts;
        private final OptionOrderFormSource source;
        private final String strategyCode;

        /* compiled from: OptionOrderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                OptionOrderBundle optionOrderBundle = (OptionOrderBundle) parcel.readParcelable(Args.class.getClassLoader());
                UiOptionOrder uiOptionOrder = (UiOptionOrder) parcel.readParcelable(Args.class.getClassLoader());
                UUID uuid = (UUID) parcel.readSerializable();
                BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
                OptionOrderType optionOrderTypeValueOf = parcel.readInt() == 0 ? null : OptionOrderType.valueOf(parcel.readString());
                OrderTimeInForce orderTimeInForce = (OrderTimeInForce) parcel.readParcelable(Args.class.getClassLoader());
                boolean z3 = false;
                boolean z4 = true;
                boolean z5 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = false;
                    z3 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z4 = z;
                }
                UUID uuid2 = (UUID) parcel.readSerializable();
                OptionOrderFormSource optionOrderFormSourceValueOf = OptionOrderFormSource.valueOf(parcel.readString());
                boolean z6 = z;
                String string2 = parcel.readString();
                OptionSettings.DefaultPricingSetting defaultPricingSettingValueOf = parcel.readInt() == 0 ? null : OptionSettings.DefaultPricingSetting.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    z6 = z2;
                }
                return new Args(optionOrderBundle, uiOptionOrder, uuid, bigDecimal, optionOrderTypeValueOf, orderTimeInForce, z5, z3, z4, uuid2, optionOrderFormSourceValueOf, string2, defaultPricingSettingValueOf, z6, parcel.readString(), parcel.readInt() != 0 ? OptionChainDisplayMode.valueOf(parcel.readString()) : null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* renamed from: component1, reason: from getter */
        public final OptionOrderBundle getOptionOrderBundle() {
            return this.optionOrderBundle;
        }

        /* renamed from: component10, reason: from getter */
        public final UUID getOrderUuid() {
            return this.orderUuid;
        }

        /* renamed from: component11, reason: from getter */
        public final OptionOrderFormSource getSource() {
            return this.source;
        }

        /* renamed from: component12, reason: from getter */
        public final String getStrategyCode() {
            return this.strategyCode;
        }

        /* renamed from: component13, reason: from getter */
        public final OptionSettings.DefaultPricingSetting getDefaultPricingSettingOverride() {
            return this.defaultPricingSettingOverride;
        }

        /* renamed from: component14, reason: from getter */
        public final boolean getShouldIgnoreDefaultPricing() {
            return this.shouldIgnoreDefaultPricing;
        }

        /* renamed from: component15, reason: from getter */
        public final String getInitialAccountNumber() {
            return this.initialAccountNumber;
        }

        /* renamed from: component16, reason: from getter */
        public final OptionChainDisplayMode getChainDisplayModeForLogging() {
            return this.chainDisplayModeForLogging;
        }

        /* renamed from: component2, reason: from getter */
        public final UiOptionOrder getOrderToReplace() {
            return this.orderToReplace;
        }

        /* renamed from: component3, reason: from getter */
        public final UUID getOrderIdToPlaceAgain() {
            return this.orderIdToPlaceAgain;
        }

        /* renamed from: component4, reason: from getter */
        public final BigDecimal getPrefilledQuantity() {
            return this.prefilledQuantity;
        }

        /* renamed from: component5, reason: from getter */
        public final OptionOrderType getPrefilledOrderType() {
            return this.prefilledOrderType;
        }

        /* renamed from: component6, reason: from getter */
        public final OrderTimeInForce getPrefilledTimeInForce() {
            return this.prefilledTimeInForce;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getShouldSetInitialFocusToLimitPrice() {
            return this.shouldSetInitialFocusToLimitPrice;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getShouldSetInitialFocusToStopPrice() {
            return this.shouldSetInitialFocusToStopPrice;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getShouldShowPlCharts() {
            return this.shouldShowPlCharts;
        }

        public final Args copy(OptionOrderBundle optionOrderBundle, UiOptionOrder orderToReplace, UUID orderIdToPlaceAgain, BigDecimal prefilledQuantity, OptionOrderType prefilledOrderType, OrderTimeInForce prefilledTimeInForce, boolean shouldSetInitialFocusToLimitPrice, boolean shouldSetInitialFocusToStopPrice, boolean shouldShowPlCharts, UUID orderUuid, OptionOrderFormSource source, String strategyCode, OptionSettings.DefaultPricingSetting defaultPricingSettingOverride, boolean shouldIgnoreDefaultPricing, String initialAccountNumber, OptionChainDisplayMode chainDisplayModeForLogging) {
            Intrinsics.checkNotNullParameter(optionOrderBundle, "optionOrderBundle");
            Intrinsics.checkNotNullParameter(orderUuid, "orderUuid");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(initialAccountNumber, "initialAccountNumber");
            return new Args(optionOrderBundle, orderToReplace, orderIdToPlaceAgain, prefilledQuantity, prefilledOrderType, prefilledTimeInForce, shouldSetInitialFocusToLimitPrice, shouldSetInitialFocusToStopPrice, shouldShowPlCharts, orderUuid, source, strategyCode, defaultPricingSettingOverride, shouldIgnoreDefaultPricing, initialAccountNumber, chainDisplayModeForLogging);
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
            return Intrinsics.areEqual(this.optionOrderBundle, args.optionOrderBundle) && Intrinsics.areEqual(this.orderToReplace, args.orderToReplace) && Intrinsics.areEqual(this.orderIdToPlaceAgain, args.orderIdToPlaceAgain) && Intrinsics.areEqual(this.prefilledQuantity, args.prefilledQuantity) && this.prefilledOrderType == args.prefilledOrderType && this.prefilledTimeInForce == args.prefilledTimeInForce && this.shouldSetInitialFocusToLimitPrice == args.shouldSetInitialFocusToLimitPrice && this.shouldSetInitialFocusToStopPrice == args.shouldSetInitialFocusToStopPrice && this.shouldShowPlCharts == args.shouldShowPlCharts && Intrinsics.areEqual(this.orderUuid, args.orderUuid) && this.source == args.source && Intrinsics.areEqual(this.strategyCode, args.strategyCode) && this.defaultPricingSettingOverride == args.defaultPricingSettingOverride && this.shouldIgnoreDefaultPricing == args.shouldIgnoreDefaultPricing && Intrinsics.areEqual(this.initialAccountNumber, args.initialAccountNumber) && this.chainDisplayModeForLogging == args.chainDisplayModeForLogging;
        }

        public int hashCode() {
            int iHashCode = this.optionOrderBundle.hashCode() * 31;
            UiOptionOrder uiOptionOrder = this.orderToReplace;
            int iHashCode2 = (iHashCode + (uiOptionOrder == null ? 0 : uiOptionOrder.hashCode())) * 31;
            UUID uuid = this.orderIdToPlaceAgain;
            int iHashCode3 = (iHashCode2 + (uuid == null ? 0 : uuid.hashCode())) * 31;
            BigDecimal bigDecimal = this.prefilledQuantity;
            int iHashCode4 = (iHashCode3 + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            OptionOrderType optionOrderType = this.prefilledOrderType;
            int iHashCode5 = (iHashCode4 + (optionOrderType == null ? 0 : optionOrderType.hashCode())) * 31;
            OrderTimeInForce orderTimeInForce = this.prefilledTimeInForce;
            int iHashCode6 = (((((((((((iHashCode5 + (orderTimeInForce == null ? 0 : orderTimeInForce.hashCode())) * 31) + Boolean.hashCode(this.shouldSetInitialFocusToLimitPrice)) * 31) + Boolean.hashCode(this.shouldSetInitialFocusToStopPrice)) * 31) + Boolean.hashCode(this.shouldShowPlCharts)) * 31) + this.orderUuid.hashCode()) * 31) + this.source.hashCode()) * 31;
            String str = this.strategyCode;
            int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
            OptionSettings.DefaultPricingSetting defaultPricingSetting = this.defaultPricingSettingOverride;
            int iHashCode8 = (((((iHashCode7 + (defaultPricingSetting == null ? 0 : defaultPricingSetting.hashCode())) * 31) + Boolean.hashCode(this.shouldIgnoreDefaultPricing)) * 31) + this.initialAccountNumber.hashCode()) * 31;
            OptionChainDisplayMode optionChainDisplayMode = this.chainDisplayModeForLogging;
            return iHashCode8 + (optionChainDisplayMode != null ? optionChainDisplayMode.hashCode() : 0);
        }

        public String toString() {
            return "Args(optionOrderBundle=" + this.optionOrderBundle + ", orderToReplace=" + this.orderToReplace + ", orderIdToPlaceAgain=" + this.orderIdToPlaceAgain + ", prefilledQuantity=" + this.prefilledQuantity + ", prefilledOrderType=" + this.prefilledOrderType + ", prefilledTimeInForce=" + this.prefilledTimeInForce + ", shouldSetInitialFocusToLimitPrice=" + this.shouldSetInitialFocusToLimitPrice + ", shouldSetInitialFocusToStopPrice=" + this.shouldSetInitialFocusToStopPrice + ", shouldShowPlCharts=" + this.shouldShowPlCharts + ", orderUuid=" + this.orderUuid + ", source=" + this.source + ", strategyCode=" + this.strategyCode + ", defaultPricingSettingOverride=" + this.defaultPricingSettingOverride + ", shouldIgnoreDefaultPricing=" + this.shouldIgnoreDefaultPricing + ", initialAccountNumber=" + this.initialAccountNumber + ", chainDisplayModeForLogging=" + this.chainDisplayModeForLogging + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.optionOrderBundle, flags);
            dest.writeParcelable(this.orderToReplace, flags);
            dest.writeSerializable(this.orderIdToPlaceAgain);
            dest.writeSerializable(this.prefilledQuantity);
            OptionOrderType optionOrderType = this.prefilledOrderType;
            if (optionOrderType == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(optionOrderType.name());
            }
            dest.writeParcelable(this.prefilledTimeInForce, flags);
            dest.writeInt(this.shouldSetInitialFocusToLimitPrice ? 1 : 0);
            dest.writeInt(this.shouldSetInitialFocusToStopPrice ? 1 : 0);
            dest.writeInt(this.shouldShowPlCharts ? 1 : 0);
            dest.writeSerializable(this.orderUuid);
            dest.writeString(this.source.name());
            dest.writeString(this.strategyCode);
            OptionSettings.DefaultPricingSetting defaultPricingSetting = this.defaultPricingSettingOverride;
            if (defaultPricingSetting == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(defaultPricingSetting.name());
            }
            dest.writeInt(this.shouldIgnoreDefaultPricing ? 1 : 0);
            dest.writeString(this.initialAccountNumber);
            OptionChainDisplayMode optionChainDisplayMode = this.chainDisplayModeForLogging;
            if (optionChainDisplayMode == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(optionChainDisplayMode.name());
            }
        }

        public Args(OptionOrderBundle optionOrderBundle, UiOptionOrder uiOptionOrder, UUID uuid, BigDecimal bigDecimal, OptionOrderType optionOrderType, OrderTimeInForce orderTimeInForce, boolean z, boolean z2, boolean z3, UUID orderUuid, OptionOrderFormSource source, String str, OptionSettings.DefaultPricingSetting defaultPricingSetting, boolean z4, String initialAccountNumber, OptionChainDisplayMode optionChainDisplayMode) {
            Intrinsics.checkNotNullParameter(optionOrderBundle, "optionOrderBundle");
            Intrinsics.checkNotNullParameter(orderUuid, "orderUuid");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(initialAccountNumber, "initialAccountNumber");
            this.optionOrderBundle = optionOrderBundle;
            this.orderToReplace = uiOptionOrder;
            this.orderIdToPlaceAgain = uuid;
            this.prefilledQuantity = bigDecimal;
            this.prefilledOrderType = optionOrderType;
            this.prefilledTimeInForce = orderTimeInForce;
            this.shouldSetInitialFocusToLimitPrice = z;
            this.shouldSetInitialFocusToStopPrice = z2;
            this.shouldShowPlCharts = z3;
            this.orderUuid = orderUuid;
            this.source = source;
            this.strategyCode = str;
            this.defaultPricingSettingOverride = defaultPricingSetting;
            this.shouldIgnoreDefaultPricing = z4;
            this.initialAccountNumber = initialAccountNumber;
            this.chainDisplayModeForLogging = optionChainDisplayMode;
        }

        public final OptionOrderBundle getOptionOrderBundle() {
            return this.optionOrderBundle;
        }

        public final UiOptionOrder getOrderToReplace() {
            return this.orderToReplace;
        }

        public final UUID getOrderIdToPlaceAgain() {
            return this.orderIdToPlaceAgain;
        }

        public final BigDecimal getPrefilledQuantity() {
            return this.prefilledQuantity;
        }

        public final OptionOrderType getPrefilledOrderType() {
            return this.prefilledOrderType;
        }

        public final OrderTimeInForce getPrefilledTimeInForce() {
            return this.prefilledTimeInForce;
        }

        public final boolean getShouldSetInitialFocusToLimitPrice() {
            return this.shouldSetInitialFocusToLimitPrice;
        }

        public final boolean getShouldSetInitialFocusToStopPrice() {
            return this.shouldSetInitialFocusToStopPrice;
        }

        public final boolean getShouldShowPlCharts() {
            return this.shouldShowPlCharts;
        }

        public final UUID getOrderUuid() {
            return this.orderUuid;
        }

        public final OptionOrderFormSource getSource() {
            return this.source;
        }

        public final String getStrategyCode() {
            return this.strategyCode;
        }

        public final OptionSettings.DefaultPricingSetting getDefaultPricingSettingOverride() {
            return this.defaultPricingSettingOverride;
        }

        public final boolean getShouldIgnoreDefaultPricing() {
            return this.shouldIgnoreDefaultPricing;
        }

        public final String getInitialAccountNumber() {
            return this.initialAccountNumber;
        }

        public final OptionChainDisplayMode getChainDisplayModeForLogging() {
            return this.chainDisplayModeForLogging;
        }

        public final OptionRelatedOrderData getOptionRelatedOrderData() {
            UUID uuid = this.orderIdToPlaceAgain;
            if (uuid == null) {
                return null;
            }
            String string2 = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            return new OptionRelatedOrderData(string2, OptionOrderRelationType.OPTION_ORDER_RELATION_TYPE_DUPLICATE, null, 4, null);
        }
    }

    /* compiled from: OptionOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/trade/options/OptionOrderFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/trade/options/OptionOrderFragment;", "Lcom/robinhood/android/trade/options/OptionOrderFragment$Args;", "<init>", "()V", "LIMIT_PRICE_DEBOUNCE_TIME", "", "CONTRACT_QUANTITY_HINT_TEXT_COLOR", "Lcom/robinhood/scarlet/util/resource/DirectResourceReference;", "Landroid/content/res/ColorStateList;", "LIMIT_PRICE_HINT_TEXT_COLOR", "feature-trade-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<OptionOrderFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(OptionOrderFragment optionOrderFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, optionOrderFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public OptionOrderFragment newInstance(Args args) {
            return (OptionOrderFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(OptionOrderFragment optionOrderFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, optionOrderFragment, args);
        }
    }
}
