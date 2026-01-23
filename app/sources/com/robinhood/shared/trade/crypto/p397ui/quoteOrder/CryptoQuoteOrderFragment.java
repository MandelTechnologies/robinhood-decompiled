package com.robinhood.shared.trade.crypto.p397ui.quoteOrder;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.jakewharton.rxrelay2.PublishRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.AnimationUtils;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.numpad.RdsNumpadView;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.font.C16915R;
import com.robinhood.android.lib.trade.BaseOrderFragment;
import com.robinhood.android.lib.trade.C20649R;
import com.robinhood.android.lib.trade.DefaultOrderState;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.navigation.fragment.DialogFragments;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay;
import com.robinhood.compose.bento.component.numpad.BentoNumpad4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.idl.IdlDecimal;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.ServerDrivenAlert;
import com.robinhood.models.serverdriven.experimental.api.CryptoValidateOrderAction;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.CryptoOrderContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.LocalScarletManager;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.crypto.p375ui.tickerinputview.CryptoTickerInputView;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderAnimatedBentoNumpad;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderAnimatedBentoNumpadState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresComposable3;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRow3;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.activity.CryptoOrderActivity;
import com.robinhood.shared.trade.crypto.activity.CryptoOrderSubmissionFailureCallbacks;
import com.robinhood.shared.trade.crypto.databinding.FragmentCryptoQuoteOrderBinding;
import com.robinhood.shared.trade.crypto.databinding.MergeCryptoQuoteOrderBinding;
import com.robinhood.shared.trade.crypto.p397ui.account.CryptoTradeAccountSwitcherDropdownArgs;
import com.robinhood.shared.trade.crypto.p397ui.account.CryptoTradeAccountSwitcherDropdownComposable;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment;
import com.robinhood.shared.trade.crypto.p397ui.fee.event.CryptoFeeUiEventProvider4;
import com.robinhood.shared.trade.crypto.p397ui.fee.unsupported.coin.CryptoFeeUnsupportedCoinBannerComposable;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.ActionViewState;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.CryptoQuoteOrderEvent;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.CryptoQuoteOrderFragment;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.CryptoQuoteOrderViewState;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.recurringAlert.CryptoRecurringOrderAlertDialogFragment;
import com.robinhood.shared.trade.crypto.p397ui.quoteOrder.views.CryptoQuoteOrderRecurringHookChipState;
import com.robinhood.shared.trade.crypto.p397ui.recurringHook.CryptoOrderRecurringHookBottomSheet;
import com.robinhood.shared.trade.crypto.p397ui.tooltip.CryptoOrderTooltipData;
import com.robinhood.shared.trade.crypto.p397ui.tradeBonus.reviewOrderBottomSheet.CryptoTradeBonusReviewOrderBottomSheetFragment;
import com.robinhood.shared.trade.crypto.p397ui.validation.CryptoSduiOrderValidationAlertDialogFragment;
import com.robinhood.shared.trade.crypto.p397ui.validation.CryptoSduiOrderValidationAlertDialogFragmentV2;
import com.robinhood.tooltips.TooltipActivity;
import com.robinhood.tooltips.TooltipData;
import com.robinhood.tooltips.TooltipData2;
import com.robinhood.tooltips.TooltipManager;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import contracts.crypto.trade.proto.p431v1.ValidateCryptoOrderResponseDto;
import io.reactivex.Observable;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
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
import kotlin.jvm.functions.Function3;
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
import p479j$.time.LocalDate;

/* compiled from: CryptoQuoteOrderFragment.kt */
@Metadata(m3635d1 = {"\u0000Â\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 Å\u00012\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0006Æ\u0001Ç\u0001Å\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001c\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\"\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b(\u0010\u0012J-\u0010/\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010,\u001a\u0004\u0018\u00010+2\b\u0010.\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b1\u0010\u000fJ\u0017\u00104\u001a\u00020\r2\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\rH\u0002¢\u0006\u0004\b6\u0010\nJ\u001d\u0010:\u001a\u00020\r2\f\u00109\u001a\b\u0012\u0004\u0012\u00020807H\u0002¢\u0006\u0004\b:\u0010;J\u0019\u0010>\u001a\u00020\r2\b\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\rH\u0016¢\u0006\u0004\b@\u0010\nJ\u000f\u0010A\u001a\u00020\rH\u0016¢\u0006\u0004\bA\u0010\nJ\u000f\u0010B\u001a\u00020\rH\u0016¢\u0006\u0004\bB\u0010\nJ\u000f\u0010C\u001a\u00020\rH\u0014¢\u0006\u0004\bC\u0010\nJ!\u0010F\u001a\u00020\r2\u0006\u0010E\u001a\u00020D2\b\u0010=\u001a\u0004\u0018\u00010<H\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\rH\u0016¢\u0006\u0004\bH\u0010\nJ\u0017\u0010I\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\bI\u0010\u0012J\u001f\u0010M\u001a\u00020\r2\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020JH\u0016¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\rH\u0016¢\u0006\u0004\bO\u0010\nJ\u000f\u0010P\u001a\u00020\rH\u0016¢\u0006\u0004\bP\u0010\nJ\u0017\u0010R\u001a\u00020Q2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\bR\u0010SJ\u000f\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010Y\u001a\u00020\r2\u0006\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\rH\u0016¢\u0006\u0004\b[\u0010\nJ\u000f\u0010\\\u001a\u00020\rH\u0016¢\u0006\u0004\b\\\u0010\nJ)\u0010a\u001a\u00020T2\u0006\u0010^\u001a\u00020]2\b\u0010_\u001a\u0004\u0018\u00010<2\u0006\u0010`\u001a\u00020\u0017H\u0016¢\u0006\u0004\ba\u0010bJ!\u0010e\u001a\u00020\r2\b\u0010c\u001a\u0004\u0018\u00010)2\u0006\u0010d\u001a\u00020+H\u0016¢\u0006\u0004\be\u0010fJ\u0017\u0010i\u001a\u00020\r2\u0006\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020\rH\u0016¢\u0006\u0004\bk\u0010\nJ\u0017\u0010i\u001a\u00020\r2\u0006\u0010h\u001a\u00020lH\u0016¢\u0006\u0004\bi\u0010mJ\u0017\u0010o\u001a\u00020\r2\u0006\u0010n\u001a\u00020\u0017H\u0016¢\u0006\u0004\bo\u0010\u001aJ\u000f\u0010p\u001a\u00020\rH\u0016¢\u0006\u0004\bp\u0010\nJ\u000f\u0010q\u001a\u00020\rH\u0016¢\u0006\u0004\bq\u0010\nJ\u0010\u0010r\u001a\u00020TH\u0096\u0001¢\u0006\u0004\br\u0010VR\"\u0010t\u001a\u00020s8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u001a\u0010|\u001a\b\u0012\u0004\u0012\u00020{0z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010}R\u001f\u0010\u0083\u0001\u001a\u00020~8BX\u0082\u0084\u0002¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R!\u0010\u0088\u0001\u001a\u00030\u0084\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0080\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001R!\u0010\u008d\u0001\u001a\u00030\u0089\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u0080\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R!\u0010\u0093\u0001\u001a\u00030\u008e\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0017\u0010\u0094\u0001\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0017\u0010\u0096\u0001\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0095\u0001R\u0017\u0010\u0097\u0001\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0095\u0001R\u0017\u0010\u0098\u0001\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0095\u0001R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\f\u0010\u0099\u0001R\u001c\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u001c\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R3\u0010§\u0001\u001a\u00020]2\u0007\u0010 \u0001\u001a\u00020]8B@BX\u0082\u008e\u0002¢\u0006\u0018\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R\u001c\u0010©\u0001\u001a\u0005\u0018\u00010¨\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001c\u0010¬\u0001\u001a\u0005\u0018\u00010«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u0018\u0010±\u0001\u001a\u00030®\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001R\u0017\u0010³\u0001\u001a\u00020]8BX\u0082\u0004¢\u0006\b\u001a\u0006\b²\u0001\u0010¤\u0001R\u0018\u0010·\u0001\u001a\u00030´\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010¶\u0001R\u0016\u0010¹\u0001\u001a\u00020T8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010VR\u0017\u0010»\u0001\u001a\u00020]8VX\u0096\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010¤\u0001R\u0017\u0010½\u0001\u001a\u00020]8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010¤\u0001R\u0016\u0010¿\u0001\u001a\u00020T8TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010VR\u001f\u0010Ä\u0001\u001a\n\u0012\u0005\u0012\u00030Á\u00010À\u00018\u0016X\u0096\u0005¢\u0006\b\u001a\u0006\bÂ\u0001\u0010Ã\u0001¨\u0006É\u0001²\u0006\u000f\u0010È\u0001\u001a\u00020T8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderFragment;", "Lcom/robinhood/android/lib/trade/BaseOrderFragment;", "Lcom/robinhood/android/lib/trade/DefaultOrderState;", "Lcom/robinhood/shared/trade/crypto/activity/CryptoOrderSubmissionFailureCallbacks;", "Lcom/robinhood/shared/trade/crypto/ui/recurringHook/CryptoOrderRecurringHookBottomSheet$Callbacks;", "Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragment$Callbacks;", "Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragmentV2$Callbacks;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/recurringAlert/CryptoRecurringOrderAlertDialogFragment$Callbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;", "viewState", "", "bindViewState", "(Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;)V", "formState", "setBackgroundColor", "(Lcom/robinhood/android/lib/trade/DefaultOrderState;)V", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;", "actionViewState", "bindActionContainer", "(Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState;)V", "", "analyticsIdentifier", "trackReviewContinueButtonClicked", "(Ljava/lang/String;)V", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$QuickTrades;", "bindQuickTrade", "(Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$QuickTrades;)V", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$QuickTrade;", "quickTrade", "Lcom/robinhood/android/designsystem/button/RdsButton;", "button", "bindQuickTradeButton", "(Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$QuickTrade;Lcom/robinhood/android/designsystem/button/RdsButton;)V", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$QuickTrade$AmountQuote;", "amountQuote", "setQuickTradeAmountOrder", "(Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/ActionViewState$QuickTrade$AmountQuote;)V", "bindFormState", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "recurringHookFrequency", "j$/time/LocalDate", "recurringHookStartDate", "Lcom/robinhood/models/util/Money;", "recurringHookAmount", "enterRecurringFlow", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;Lcom/robinhood/models/util/Money;)V", "showRecurringHookBottomSheet", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent;", "event", "handleEvent", "(Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderEvent;)V", "displayCryptoFeeTooltip", "", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto$SideEffectDto;", "sideEffects", "handleSideEffects", "(Ljava/util/List;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "onStart", "onStop", "initializeNumpad", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onFormStateChanged", "", "ratio", "maxDragDistance", "onAnimationStep", "(FF)V", "setFormStateToEditing", "onFormStateUpdated", "Landroidx/constraintlayout/widget/ConstraintSet;", "getConstraintsForState", "(Lcom/robinhood/android/lib/trade/DefaultOrderState;)Landroidx/constraintlayout/widget/ConstraintSet;", "", "onBackPressed", "()Z", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "toolbar", "configureToolbar", "(Lcom/robinhood/android/common/ui/view/RhToolbar;)V", "validateAndReviewOrder", "performSubmitOrder", "", "id", "passthroughArgs", "url", "onLinkTextClicked", "(ILandroid/os/Bundle;Ljava/lang/String;)Z", "frequency", "startDate", "onRecurringOptionsSelected", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;)V", "Lcom/robinhood/models/serverdriven/experimental/api/CryptoValidateOrderAction;", "action", "handleAction", "(Lcom/robinhood/models/serverdriven/experimental/api/CryptoValidateOrderAction;)V", "convertToRebateOrder", "Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto;", "(Lcontracts/crypto/trade/proto/v1/ValidateCryptoOrderResponseDto$MobileDto$ActionDto;)V", "uri", "handleDeeplink", "onContinueRecurringValidation", "onRecurringDepositFunds", "onDismissUnsupportedFeatureDialog", "Lcom/robinhood/analytics/EventLogger;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "Lcom/jakewharton/rxrelay2/PublishRelay;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderContext;", "loggingCryptoOrderContextRelay", "Lcom/jakewharton/rxrelay2/PublishRelay;", "Lcom/robinhood/shared/trade/crypto/databinding/FragmentCryptoQuoteOrderBinding;", "fragmentBinding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getFragmentBinding", "()Lcom/robinhood/shared/trade/crypto/databinding/FragmentCryptoQuoteOrderBinding;", "fragmentBinding", "Lcom/robinhood/shared/trade/crypto/databinding/MergeCryptoQuoteOrderBinding;", "contentBinding$delegate", "getContentBinding", "()Lcom/robinhood/shared/trade/crypto/databinding/MergeCryptoQuoteOrderBinding;", "contentBinding", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderFragment$Callbacks;", "callbacks$delegate", "getCallbacks", "()Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderFragment$Callbacks;", "callbacks", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "getDuxo", "()Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderDuxo;", "duxo", "initialConstraints", "Landroidx/constraintlayout/widget/ConstraintSet;", "reviewingConstraints", "editingContentConstraints", "reviewingContentConstraints", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;", "Landroid/view/ViewGroup;", "toolbarContent", "Landroid/view/ViewGroup;", "Lcom/robinhood/android/designsystem/text/RhTextView;", "toolbarText", "Lcom/robinhood/android/designsystem/text/RhTextView;", "<set-?>", "cardViewBottomY$delegate", "Landroidx/compose/runtime/MutableIntState;", "getCardViewBottomY", "()I", "setCardViewBottomY", "(I)V", "cardViewBottomY", "Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragment;", "validationAlertDialogFragment", "Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragment;", "Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragmentV2;", "validationAlertDialogFragmentV2", "Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragmentV2;", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventScreen", "getReviewingConstraintLayoutRes", "reviewingConstraintLayoutRes", "Lcom/robinhood/tooltips/TooltipManager;", "getTooltipManager", "()Lcom/robinhood/tooltips/TooltipManager;", "tooltipManager", "getUseDesignSystemToolbar", "useDesignSystemToolbar", "getInitialLayoutRes", "initialLayoutRes", "getContentRes", "contentRes", "getUsePrimaryColorBackground", "usePrimaryColorBackground", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "requiresRegionGates", "Companion", "Callbacks", "Args", "isBannerDisplayed", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoQuoteOrderFragment extends BaseOrderFragment<DefaultOrderState> implements CryptoOrderSubmissionFailureCallbacks, CryptoOrderRecurringHookBottomSheet.Callbacks, CryptoSduiOrderValidationAlertDialogFragment.Callbacks, CryptoSduiOrderValidationAlertDialogFragmentV2.Callbacks, CryptoRecurringOrderAlertDialogFragment.Callbacks, RegionGated {
    private static final String DIALOG_RECURRING_HOOK_BOTTOM_SHEET = "recurringHookBottomSheet";
    private static final String ORDER_TYPE_SELECTOR_TOOLTIP = "crypto_order_type_selector_tooltip";
    private static final String TAG_FEE_DEF_BOTTOM_SHEET = "cryptoFeeDefinitionBottomSheet";
    private static final String TAG_MICROGRAM_ORDER_VALIDATION_ALERT = "microgramOrderValidationAlert";
    private static final String TAG_ORDER_VALIDATION_ALERT = "orderValidationAlert";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: cardViewBottomY$delegate, reason: from kotlin metadata */
    private final SnapshotIntState2 cardViewBottomY;

    /* renamed from: contentBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 contentBinding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final ConstraintSet editingContentConstraints;
    public EventLogger eventLogger;

    /* renamed from: fragmentBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 fragmentBinding;
    private final ConstraintSet initialConstraints;
    private final PublishRelay<CryptoOrderContext> loggingCryptoOrderContextRelay;
    private final ConstraintSet reviewingConstraints;
    private final ConstraintSet reviewingContentConstraints;
    private ViewGroup toolbarContent;
    private RhTextView toolbarText;
    private CryptoSduiOrderValidationAlertDialogFragment validationAlertDialogFragment;
    private CryptoSduiOrderValidationAlertDialogFragmentV2 validationAlertDialogFragmentV2;
    private CryptoQuoteOrderViewState viewState;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoQuoteOrderFragment.class, "fragmentBinding", "getFragmentBinding()Lcom/robinhood/shared/trade/crypto/databinding/FragmentCryptoQuoteOrderBinding;", 0)), Reflection.property1(new PropertyReference1Impl(CryptoQuoteOrderFragment.class, "contentBinding", "getContentBinding()Lcom/robinhood/shared/trade/crypto/databinding/MergeCryptoQuoteOrderBinding;", 0)), Reflection.property1(new PropertyReference1Impl(CryptoQuoteOrderFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CryptoQuoteOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0012\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H&¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H&¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderFragment$Callbacks;", "Lcom/robinhood/android/lib/trade/BaseOrderFragment$Callbacks;", "Lcom/robinhood/models/api/CryptoOrderType;", "orderType", "", "isRecurringOrder", "", "showOrderTypeSelector", "(Lcom/robinhood/models/api/CryptoOrderType;Z)V", "reviewing", "onReviewStateChanged", "(Z)V", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;", "frequency", "j$/time/LocalDate", "startDate", "Lcom/robinhood/models/util/Money;", "amount", "enterRecurringFlowFromHook", "(Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule$Frequency;Lj$/time/LocalDate;Lcom/robinhood/models/util/Money;)V", "cancelTradeFlow", "()V", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks extends BaseOrderFragment.Callbacks {
        void cancelTradeFlow();

        void enterRecurringFlowFromHook(ApiInvestmentSchedule.Frequency frequency, LocalDate startDate, Money amount);

        void onReviewStateChanged(boolean reviewing);

        void showOrderTypeSelector(CryptoOrderType orderType, boolean isRecurringOrder);
    }

    /* compiled from: CryptoQuoteOrderFragment.kt */
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

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    protected boolean getUsePrimaryColorBackground() {
        return true;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    /* compiled from: CryptoQuoteOrderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$handleEvent$2 */
    static final class C406482 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ CryptoQuoteOrderEvent $event;

        C406482(CryptoQuoteOrderEvent cryptoQuoteOrderEvent) {
            this.$event = cryptoQuoteOrderEvent;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean invoke$lambda$1(SnapshotState<Boolean> snapshotState) {
            return snapshotState.getValue().booleanValue();
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
            snapshotState.setValue(Boolean.valueOf(z));
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(634704649, i, -1, "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.handleEvent.<anonymous> (CryptoQuoteOrderFragment.kt:800)");
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            ProvidedValue<Navigator> providedValueProvides = LocalNavigator.getLocalNavigator().provides(CryptoQuoteOrderFragment.this.getNavigator());
            final CryptoQuoteOrderEvent cryptoQuoteOrderEvent = this.$event;
            final CryptoQuoteOrderFragment cryptoQuoteOrderFragment = CryptoQuoteOrderFragment.this;
            CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(-477063607, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.handleEvent.2.1
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
                        ComposerKt.traceEventStart(-477063607, i2, -1, "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.handleEvent.<anonymous>.<anonymous> (CryptoQuoteOrderFragment.kt:804)");
                    }
                    BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1786705007, true, new C508021(cryptoQuoteOrderEvent, cryptoQuoteOrderFragment, snapshotState), composer2, 54), composer2, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: CryptoQuoteOrderFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$handleEvent$2$1$1, reason: invalid class name and collision with other inner class name */
                static final class C508021 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ CryptoQuoteOrderEvent $event;
                    final /* synthetic */ SnapshotState<Boolean> $isBannerDisplayed$delegate;
                    final /* synthetic */ CryptoQuoteOrderFragment this$0;

                    C508021(CryptoQuoteOrderEvent cryptoQuoteOrderEvent, CryptoQuoteOrderFragment cryptoQuoteOrderFragment, SnapshotState<Boolean> snapshotState) {
                        this.$event = cryptoQuoteOrderEvent;
                        this.this$0 = cryptoQuoteOrderFragment;
                        this.$isBannerDisplayed$delegate = snapshotState;
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
                            ComposerKt.traceEventStart(-1786705007, i, -1, "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.handleEvent.<anonymous>.<anonymous>.<anonymous> (CryptoQuoteOrderFragment.kt:807)");
                        }
                        if (C406482.invoke$lambda$1(this.$isBannerDisplayed$delegate)) {
                            String assetCurrencyCode = ((CryptoFeeUiEventProvider4.CryptoQuoteOrder.ShowFeeUnsupportedForCurrencyPairBanner) ((CryptoQuoteOrderEvent.HandleCryptoFeeEventType) this.$event).getType()).getAssetCurrencyCode();
                            boolean zIsRebateMarketMakersSupported = ((CryptoFeeUiEventProvider4.CryptoQuoteOrder.ShowFeeUnsupportedForCurrencyPairBanner) ((CryptoQuoteOrderEvent.HandleCryptoFeeEventType) this.$event).getType()).isRebateMarketMakersSupported();
                            composer.startReplaceGroup(-1746271574);
                            boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changed(this.$event);
                            final CryptoQuoteOrderFragment cryptoQuoteOrderFragment = this.this$0;
                            final CryptoQuoteOrderEvent cryptoQuoteOrderEvent = this.$event;
                            final SnapshotState<Boolean> snapshotState = this.$isBannerDisplayed$delegate;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$handleEvent$2$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoQuoteOrderFragment.C406482.AnonymousClass1.C508021.invoke$lambda$1$lambda$0(cryptoQuoteOrderFragment, cryptoQuoteOrderEvent, snapshotState);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            CryptoFeeUnsupportedCoinBannerComposable.CryptoFeeUnsupportedCoinBannerComposable(assetCurrencyCode, zIsRebateMarketMakersSupported, (Function0) objRememberedValue, null, composer, 0, 8);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(CryptoQuoteOrderFragment cryptoQuoteOrderFragment, CryptoQuoteOrderEvent cryptoQuoteOrderEvent, SnapshotState snapshotState) {
                        cryptoQuoteOrderFragment.getDuxo().updateFeeUnavailableBannerDismissedTimestampPref(((CryptoFeeUiEventProvider4.CryptoQuoteOrder.ShowFeeUnsupportedForCurrencyPairBanner) ((CryptoQuoteOrderEvent.HandleCryptoFeeEventType) cryptoQuoteOrderEvent).getType()).getAssetCurrencyCode());
                        C406482.invoke$lambda$2(snapshotState, false);
                        ComposeView cryptoFeeBannerComposeView = cryptoQuoteOrderFragment.getContentBinding().cryptoFeeBannerComposeView;
                        Intrinsics.checkNotNullExpressionValue(cryptoFeeBannerComposeView, "cryptoFeeBannerComposeView");
                        cryptoFeeBannerComposeView.setVisibility(8);
                        return Unit.INSTANCE;
                    }
                }
            }, composer, 54), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    public CryptoQuoteOrderFragment() {
        super(DefaultOrderState.EDITING);
        this.$$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);
        PublishRelay<CryptoOrderContext> publishRelayCreate = PublishRelay.create();
        Intrinsics.checkNotNullExpressionValue(publishRelayCreate, "create(...)");
        this.loggingCryptoOrderContextRelay = publishRelayCreate;
        this.fragmentBinding = ViewBinding5.viewBinding(this, CryptoQuoteOrderFragment$fragmentBinding$2.INSTANCE);
        this.contentBinding = ViewBinding5.viewBinding(this, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoQuoteOrderFragment.contentBinding_delegate$lambda$0(this.f$0, (View) obj);
            }
        });
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof CryptoQuoteOrderFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.duxo = DuxosKt.duxo(this, CryptoQuoteOrderDuxo.class);
        this.initialConstraints = new ConstraintSet();
        this.reviewingConstraints = new ConstraintSet();
        this.editingContentConstraints = new ConstraintSet();
        this.reviewingContentConstraints = new ConstraintSet();
        this.cardViewBottomY = SnapshotIntState3.mutableIntStateOf(0);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final Screen getEventScreen() {
        return getDuxo().getEventScreen();
    }

    private final FragmentCryptoQuoteOrderBinding getFragmentBinding() {
        Object value = this.fragmentBinding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentCryptoQuoteOrderBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MergeCryptoQuoteOrderBinding contentBinding_delegate$lambda$0(CryptoQuoteOrderFragment cryptoQuoteOrderFragment, View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return MergeCryptoQuoteOrderBinding.bind(cryptoQuoteOrderFragment.getFragmentBinding().content);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MergeCryptoQuoteOrderBinding getContentBinding() {
        return (MergeCryptoQuoteOrderBinding) this.contentBinding.getValue(this, $$delegatedProperties[1]);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CryptoQuoteOrderDuxo getDuxo() {
        return (CryptoQuoteOrderDuxo) this.duxo.getValue();
    }

    private final int getReviewingConstraintLayoutRes() {
        return C40095R.layout.fragment_crypto_quote_order_reviewing;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public int getInitialLayoutRes() {
        return C40095R.layout.fragment_crypto_quote_order;
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public int getContentRes() {
        return C40095R.layout.merge_crypto_quote_order;
    }

    private final int getCardViewBottomY() {
        return this.cardViewBottomY.getIntValue();
    }

    private final void setCardViewBottomY(int i) {
        this.cardViewBottomY.setIntValue(i);
    }

    private final TooltipManager getTooltipManager() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        Intrinsics.checkNotNull(componentRequireActivity, "null cannot be cast to non-null type com.robinhood.tooltips.TooltipActivity");
        return ((TooltipActivity) componentRequireActivity).getTooltipManager();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        BaseActivity baseActivityRequireBaseActivity = requireBaseActivity();
        Intrinsics.checkNotNull(baseActivityRequireBaseActivity, "null cannot be cast to non-null type com.robinhood.shared.trade.crypto.activity.CryptoOrderActivity");
        ((CryptoOrderActivity) baseActivityRequireBaseActivity).setOrderSubmissionFailureCallbacks(this);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        BaseActivity baseActivityRequireBaseActivity = requireBaseActivity();
        Intrinsics.checkNotNull(baseActivityRequireBaseActivity, "null cannot be cast to non-null type com.robinhood.shared.trade.crypto.activity.CryptoOrderActivity");
        ((CryptoOrderActivity) baseActivityRequireBaseActivity).removeOrderSubmissionFailureCallbacks(this);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Observable<CryptoOrderContext> observableTake = this.loggingCryptoOrderContextRelay.distinctUntilChanged().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableTake, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoQuoteOrderFragment.onStart$lambda$1(this.f$0, (CryptoOrderContext) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(CryptoQuoteOrderFragment cryptoQuoteOrderFragment, CryptoOrderContext cryptoOrderContext) {
        EventLogger.DefaultImpls.logScreenAppear$default(cryptoQuoteOrderFragment.getEventLogger(), null, cryptoQuoteOrderFragment.getEventScreen(), null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoOrderContext, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), 13, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C406491(null), 3, null);
    }

    /* compiled from: CryptoQuoteOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$onStop$1", m3645f = "CryptoQuoteOrderFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PIN_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$onStop$1 */
    static final class C406491 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406491(Continuation<? super C406491> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoQuoteOrderFragment.this.new C406491(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objFirst;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<CryptoQuoteOrderViewState> stateFlow = CryptoQuoteOrderFragment.this.getDuxo().getStateFlow();
                this.label = 1;
                objFirst = FlowKt.first(stateFlow, this);
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
            com.robinhood.shared.trade.crypto.context.CryptoOrderContext cryptoOrderContext = ((CryptoQuoteOrderViewState) objFirst).getCryptoOrderContext();
            EventLogger.DefaultImpls.logScreenDisappear$default(CryptoQuoteOrderFragment.this.getEventLogger(), null, CryptoQuoteOrderFragment.this.getEventScreen(), null, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, cryptoOrderContext != null ? cryptoOrderContext.getLoggingCryptoOrderContext() : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), 13, null);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    protected void initializeNumpad() {
        RdsNumpadView numpad = getFragmentBinding().numpad;
        Intrinsics.checkNotNullExpressionValue(numpad, "numpad");
        numpad.setVisibility(8);
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        this.initialConstraints.clone(getRoot());
        this.reviewingConstraints.clone(getActivity(), getReviewingConstraintLayoutRes());
        this.editingContentConstraints.clone(getFragmentBinding().content);
        ConstraintSet constraintSet = this.reviewingContentConstraints;
        constraintSet.clone(getFragmentBinding().content);
        constraintSet.setVisibility(getContentBinding().cryptoReviewTxtComposeView.getId(), 0);
        constraintSet.setVisibility(getContentBinding().cryptoOrderRowsComposeView.getId(), 0);
        constraintSet.setVisibility(getContentBinding().accountSelectorComposeView.getId(), 8);
        constraintSet.setVerticalBias(getContentBinding().inputView.getId(), 0.0f);
        constraintSet.setMargin(getContentBinding().inputView.getId(), 3, getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_medium));
        CryptoTickerInputView cryptoTickerInputView = getContentBinding().inputView;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        cryptoTickerInputView.setTypeface(ContextsUiExtensions.getFont(contextRequireContext, C16915R.font.capsule_sans_medium));
        getCardView().setBackground(requireContext().getDrawable(C40095R.drawable.bottom_rounded_corner_background));
        setBackgroundColor(getFormState());
        LifecycleHost.DefaultImpls.bind$default(this, requireBaseActivity().getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoQuoteOrderFragment.onViewCreated$lambda$3(this.f$0, (DayNightOverlay) obj);
            }
        });
        BaseFragment.collectDuxoState$default(this, null, new C406503(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C406514(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C406525(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3(CryptoQuoteOrderFragment cryptoQuoteOrderFragment, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        cryptoQuoteOrderFragment.setBackgroundColor(cryptoQuoteOrderFragment.getFormState());
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoQuoteOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$onViewCreated$3", m3645f = "CryptoQuoteOrderFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$onViewCreated$3 */
    static final class C406503 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406503(Continuation<? super C406503> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoQuoteOrderFragment.this.new C406503(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406503) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoQuoteOrderFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$onViewCreated$3$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ CryptoQuoteOrderFragment $tmp0;

            AnonymousClass1(CryptoQuoteOrderFragment cryptoQuoteOrderFragment) {
                this.$tmp0 = cryptoQuoteOrderFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, CryptoQuoteOrderFragment.class, "bindViewState", "bindViewState(Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$bindViewState = C406503.invokeSuspend$bindViewState(this.$tmp0, cryptoQuoteOrderViewState, continuation);
                return objInvokeSuspend$bindViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bindViewState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((CryptoQuoteOrderViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<CryptoQuoteOrderViewState> stateFlow = CryptoQuoteOrderFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoQuoteOrderFragment.this);
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
        public static final /* synthetic */ Object invokeSuspend$bindViewState(CryptoQuoteOrderFragment cryptoQuoteOrderFragment, CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation continuation) {
            cryptoQuoteOrderFragment.bindViewState(cryptoQuoteOrderViewState);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: CryptoQuoteOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$onViewCreated$4", m3645f = "CryptoQuoteOrderFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$onViewCreated$4 */
    static final class C406514 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406514(Continuation<? super C406514> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoQuoteOrderFragment.this.new C406514(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406514) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(CryptoQuoteOrderFragment.this.getDuxo().getEventFlow());
                final CryptoQuoteOrderFragment cryptoQuoteOrderFragment = CryptoQuoteOrderFragment.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.onViewCreated.4.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<CryptoQuoteOrderEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<CryptoQuoteOrderEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<CryptoQuoteOrderEvent> eventConsumerInvoke;
                        final CryptoQuoteOrderFragment cryptoQuoteOrderFragment2 = cryptoQuoteOrderFragment;
                        if ((event.getData() instanceof CryptoQuoteOrderEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$onViewCreated$4$1$emit$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                    m25989invoke(obj2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25989invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    cryptoQuoteOrderFragment2.handleEvent((CryptoQuoteOrderEvent) event.getData());
                                }
                            });
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (flowFilterNotNull.collect(flowCollector, this) == coroutine_suspended) {
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

    /* compiled from: CryptoQuoteOrderFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$onViewCreated$5", m3645f = "CryptoQuoteOrderFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$onViewCreated$5 */
    static final class C406525 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C406525(Continuation<? super C406525> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoQuoteOrderFragment.this.new C406525(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C406525) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Flow flowDistinctUntilChangedBy = FlowKt.distinctUntilChangedBy(CryptoQuoteOrderFragment.this.getDuxo().getStateFlow(), new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$onViewCreated$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CryptoQuoteOrderFragment.C406525.invokeSuspend$lambda$0((CryptoQuoteOrderViewState) obj2);
                    }
                });
                Flow<CryptoQuoteOrderViewState> flow = new Flow<CryptoQuoteOrderViewState>() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$onViewCreated$5$invokeSuspend$$inlined$filter$1
                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super CryptoQuoteOrderViewState> flowCollector, Continuation continuation) {
                        Object objCollect = flowDistinctUntilChangedBy.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$onViewCreated$5$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$onViewCreated$5$invokeSuspend$$inlined$filter$1$2", m3645f = "CryptoQuoteOrderFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$onViewCreated$5$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
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
                                CryptoQuoteOrderViewState.OrderContextViewState orderContextViewState = ((CryptoQuoteOrderViewState) obj).getOrderContextViewState();
                                if ((orderContextViewState != null ? orderContextViewState.getActionViewState$feature_trade_crypto_externalDebug() : null) instanceof ActionViewState.QuickTrades) {
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
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(CryptoQuoteOrderFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass3, this) == coroutine_suspended) {
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
        public static final ActionViewState invokeSuspend$lambda$0(CryptoQuoteOrderViewState cryptoQuoteOrderViewState) {
            CryptoQuoteOrderViewState.OrderContextViewState orderContextViewState = cryptoQuoteOrderViewState.getOrderContextViewState();
            if (orderContextViewState != null) {
                return orderContextViewState.getActionViewState$feature_trade_crypto_externalDebug();
            }
            return null;
        }

        /* compiled from: CryptoQuoteOrderFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "viewState", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$onViewCreated$5$3", m3645f = "CryptoQuoteOrderFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$onViewCreated$5$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<CryptoQuoteOrderViewState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ CryptoQuoteOrderFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(CryptoQuoteOrderFragment cryptoQuoteOrderFragment, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.this$0 = cryptoQuoteOrderFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(cryptoQuoteOrderViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) throws Resources.NotFoundException {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                CryptoQuoteOrderViewState cryptoQuoteOrderViewState = (CryptoQuoteOrderViewState) this.L$0;
                CryptoQuoteOrderViewState.OrderContextViewState orderContextViewState = cryptoQuoteOrderViewState.getOrderContextViewState();
                ActionViewState actionViewState$feature_trade_crypto_externalDebug = orderContextViewState != null ? orderContextViewState.getActionViewState$feature_trade_crypto_externalDebug() : null;
                Intrinsics.checkNotNull(actionViewState$feature_trade_crypto_externalDebug, "null cannot be cast to non-null type com.robinhood.shared.trade.crypto.ui.quoteOrder.ActionViewState.QuickTrades");
                List<ActionViewState.QuickTrade> list = CollectionsKt.toList(((ActionViewState.QuickTrades) actionViewState$feature_trade_crypto_externalDebug).getQuickTrades());
                CryptoQuoteOrderFragment cryptoQuoteOrderFragment = this.this$0;
                for (ActionViewState.QuickTrade quickTrade : list) {
                    EventLogger eventLogger = cryptoQuoteOrderFragment.getEventLogger();
                    Screen eventScreen = cryptoQuoteOrderFragment.getEventScreen();
                    Component component = new Component(Component.ComponentType.BUTTON, "crypto_trade_flow_quick_trade", null, 4, null);
                    int index = quickTrade.getIndex();
                    StringResource buttonText = quickTrade.getButtonText();
                    Resources resources = cryptoQuoteOrderFragment.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    CharSequence text = buttonText.getText(resources);
                    Intrinsics.checkNotNull(text, "null cannot be cast to non-null type kotlin.String");
                    EventLogger.DefaultImpls.logAppear$default(eventLogger, null, eventScreen, component, null, cryptoQuoteOrderViewState.getLoggingOrderPillEventContext(index, (String) text, quickTrade instanceof ActionViewState.QuickTrade.AmountQuote ? ((ActionViewState.QuickTrade.AmountQuote) quickTrade).isRecurringOrder() : false), 9, null);
                }
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        getContentBinding().inputView.requestFocus();
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment
    public void onFormStateChanged(DefaultOrderState formState) {
        Intrinsics.checkNotNullParameter(formState, "formState");
        super.onFormStateChanged((CryptoQuoteOrderFragment) formState);
        setBackgroundColor(formState);
        int i = WhenMappings.$EnumSwitchMapping$0[formState.ordinal()];
        if (i == 1) {
            requireBaseActivity().showCloseIcon();
            this.editingContentConstraints.applyTo(getFragmentBinding().content);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            requireBaseActivity().showBackArrowIcon();
            ComposeView cryptoFeeBannerComposeView = getContentBinding().cryptoFeeBannerComposeView;
            Intrinsics.checkNotNullExpressionValue(cryptoFeeBannerComposeView, "cryptoFeeBannerComposeView");
            cryptoFeeBannerComposeView.setVisibility(8);
            this.reviewingContentConstraints.applyTo(getFragmentBinding().content);
        }
        ScarletManager2.overrideAttribute(requireToolbar().getToolbar(), R$attr.colorControlNormal, ThemeAttributes.INSTANCE.getCOLOR_POSITIVE());
    }

    @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.view.SwipeToConfirmTouchListener.Callbacks
    public void onAnimationStep(float ratio, float maxDragDistance) {
        super.onAnimationStep(ratio, maxDragDistance);
        float f = ratio * maxDragDistance * (-1);
        setCardViewBottomY(Math.max(0, (int) getCardView().getY()) + getCardView().getHeight() + ((int) f));
        getFragmentBinding().rebrandUnderlay.setTranslationY(Math.min(0.0f, f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindViewState(final CryptoQuoteOrderViewState viewState) {
        RhTextView rhTextView;
        TooltipData.Target target;
        CryptoOrderContext loggingCryptoOrderContext;
        this.viewState = viewState;
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C406421(viewState, null), 3, null);
        getFragmentBinding().numpadComposeView.setContent(ComposableLambda3.composableLambdaInstance(1830018101, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.bindViewState.2
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
                    ComposerKt.traceEventStart(1830018101, i, -1, "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.bindViewState.<anonymous> (CryptoQuoteOrderFragment.kt:345)");
                }
                StringResource backspaceOverrideText = viewState.getCryptoOrderAnimatedBentoNumpadState().getBackspaceOverrideText();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(viewState) | composer.changedInstance(this);
                CryptoQuoteOrderViewState cryptoQuoteOrderViewState = viewState;
                CryptoQuoteOrderFragment cryptoQuoteOrderFragment = this;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new CryptoQuoteOrderFragment$bindViewState$2$1$1(cryptoQuoteOrderViewState, cryptoQuoteOrderFragment, null);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                EffectsKt.LaunchedEffect(backspaceOverrideText, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer, StringResource.$stable);
                final CryptoQuoteOrderViewState cryptoQuoteOrderViewState2 = viewState;
                final CryptoQuoteOrderFragment cryptoQuoteOrderFragment2 = this;
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-592043651, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.bindViewState.2.2
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
                            ComposerKt.traceEventStart(-592043651, i2, -1, "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.bindViewState.<anonymous>.<anonymous> (CryptoQuoteOrderFragment.kt:364)");
                        }
                        final CryptoQuoteOrderViewState cryptoQuoteOrderViewState3 = cryptoQuoteOrderViewState2;
                        final CryptoQuoteOrderFragment cryptoQuoteOrderFragment3 = cryptoQuoteOrderFragment2;
                        BentoAccentNumpadOverlay.BentoAccentNumpadOverlay(ComposableLambda3.rememberComposableLambda(1530413102, true, new Function3<BentoNumpad4, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.bindViewState.2.2.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoNumpad4 bentoNumpad4, Composer composer3, Integer num) {
                                invoke(bentoNumpad4, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoNumpad4 BentoAccentNumpadOverlay, Composer composer3, int i3) {
                                Intrinsics.checkNotNullParameter(BentoAccentNumpadOverlay, "$this$BentoAccentNumpadOverlay");
                                if ((i3 & 17) == 16 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1530413102, i3, -1, "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.bindViewState.<anonymous>.<anonymous>.<anonymous> (CryptoQuoteOrderFragment.kt:365)");
                                }
                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                                CryptoOrderAnimatedBentoNumpadState cryptoOrderAnimatedBentoNumpadState = cryptoQuoteOrderViewState3.getCryptoOrderAnimatedBentoNumpadState();
                                CryptoQuoteOrderDuxo duxo = cryptoQuoteOrderFragment3.getDuxo();
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer3.changedInstance(duxo);
                                Object objRememberedValue2 = composer3.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new CryptoQuoteOrderFragment$bindViewState$2$2$1$1$1(duxo);
                                    composer3.updateRememberedValue(objRememberedValue2);
                                }
                                KFunction kFunction = (KFunction) objRememberedValue2;
                                composer3.endReplaceGroup();
                                CryptoQuoteOrderDuxo duxo2 = cryptoQuoteOrderFragment3.getDuxo();
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance3 = composer3.changedInstance(duxo2);
                                Object objRememberedValue3 = composer3.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new CryptoQuoteOrderFragment$bindViewState$2$2$1$2$1(duxo2);
                                    composer3.updateRememberedValue(objRememberedValue3);
                                }
                                composer3.endReplaceGroup();
                                CryptoOrderAnimatedBentoNumpad.CryptoOrderAnimatedBentoNumpad(cryptoOrderAnimatedBentoNumpadState, (Function1) kFunction, modifierM5146paddingqDBjuR0$default, (Function0) ((KFunction) objRememberedValue3), composer3, CryptoOrderAnimatedBentoNumpadState.$stable, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), composer, 100663296, 255);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        RhTextView rhTextView2 = this.toolbarText;
        if (rhTextView2 != null) {
            TextViewsKt.setVisibilityText(rhTextView2, StringResources6.getText(this, viewState.getToolbarTitle()));
        }
        ViewGroup viewGroup = this.toolbarContent;
        if (viewGroup != null) {
            viewGroup.setVisibility(viewState.isToolbarVisible() ? 0 : 8);
        }
        View view = getView();
        if (view != null) {
            if (!view.isLaidOut() || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$bindViewState$$inlined$doOnLayout$1
                    @Override // android.view.View.OnLayoutChangeListener
                    public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                        view2.removeOnLayoutChangeListener(this);
                        CryptoTickerInputView cryptoTickerInputView = this.this$0.getContentBinding().inputView;
                        char[] charArray = viewState.getInputText().toCharArray();
                        Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
                        cryptoTickerInputView.transitionTo(charArray);
                    }
                });
            } else {
                CryptoTickerInputView cryptoTickerInputView = getContentBinding().inputView;
                char[] charArray = viewState.getInputText().toCharArray();
                Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
                cryptoTickerInputView.transitionTo(charArray);
            }
        }
        final CryptoQuoteOrderViewState.OrderContextViewState orderContextViewState = viewState.getOrderContextViewState();
        if (orderContextViewState != null) {
            RhTextView cryptoPowerTxt = getContentBinding().cryptoPowerTxt;
            Intrinsics.checkNotNullExpressionValue(cryptoPowerTxt, "cryptoPowerTxt");
            OnClickListeners.onClick(cryptoPowerTxt, new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoQuoteOrderFragment.bindViewState$lambda$9$lambda$6(orderContextViewState, this);
                }
            });
            RdsButton sellAllButton = getFragmentBinding().sellAllButton;
            Intrinsics.checkNotNullExpressionValue(sellAllButton, "sellAllButton");
            OnClickListeners.onClick(sellAllButton, new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoQuoteOrderFragment.bindViewState$lambda$9$lambda$7(this.f$0, viewState);
                }
            });
            final CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresStateM2898xc5d7f028 = orderContextViewState.m2898xc5d7f028();
            ComposeView cryptoReviewTxtComposeView = getContentBinding().cryptoReviewTxtComposeView;
            Intrinsics.checkNotNullExpressionValue(cryptoReviewTxtComposeView, "cryptoReviewTxtComposeView");
            cryptoReviewTxtComposeView.setVisibility(cryptoOrderReviewMessageAndDisclosuresStateM2898xc5d7f028 != null ? 0 : 8);
            getContentBinding().cryptoReviewTxtComposeView.setContent(ComposableLambda3.composableLambdaInstance(1810988310, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$bindViewState$4$3
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
                        ComposerKt.traceEventStart(1810988310, i, -1, "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.bindViewState.<anonymous>.<anonymous> (CryptoQuoteOrderFragment.kt:413)");
                    }
                    if (cryptoOrderReviewMessageAndDisclosuresStateM2898xc5d7f028 != null) {
                        ProvidedValue<Navigator> providedValueProvides = LocalNavigator.getLocalNavigator().provides(this.getNavigator());
                        final CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState = cryptoOrderReviewMessageAndDisclosuresStateM2898xc5d7f028;
                        CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(-435980453, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$bindViewState$4$3.1
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
                                    ComposerKt.traceEventStart(-435980453, i2, -1, "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.bindViewState.<anonymous>.<anonymous>.<anonymous> (CryptoQuoteOrderFragment.kt:417)");
                                }
                                final CryptoOrderReviewMessageAndDisclosuresState cryptoOrderReviewMessageAndDisclosuresState2 = cryptoOrderReviewMessageAndDisclosuresState;
                                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(363414179, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.bindViewState.4.3.1.1
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
                                            ComposerKt.traceEventStart(363414179, i3, -1, "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.bindViewState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoQuoteOrderFragment.kt:418)");
                                        }
                                        CryptoOrderReviewMessageAndDisclosuresComposable3.CryptoOrderReviewMessageAndDisclosuresComposable(cryptoOrderReviewMessageAndDisclosuresState2, null, composer3, CryptoOrderReviewMessageAndDisclosuresState.$stable, 2);
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
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }));
            RhTextView cryptoPowerTxt2 = getContentBinding().cryptoPowerTxt;
            Intrinsics.checkNotNullExpressionValue(cryptoPowerTxt2, "cryptoPowerTxt");
            TextViewsKt.setVisibilityText(cryptoPowerTxt2, StringResources6.getText(this, orderContextViewState.getCryptoPowerText()));
            RhTextView cryptoPowerTxt3 = getContentBinding().cryptoPowerTxt;
            Intrinsics.checkNotNullExpressionValue(cryptoPowerTxt3, "cryptoPowerTxt");
            TextViewsKt.setDrawables$default((TextView) cryptoPowerTxt3, 0, 0, orderContextViewState.getPowerInfoIconRes(), 0, true, 11, (Object) null);
            ComposeView composeView = getContentBinding().accountSelectorComposeView;
            Intrinsics.checkNotNull(composeView);
            composeView.setVisibility(viewState.isSelectedAccountVisible() ? 0 : 8);
            if (viewState.isSelectedAccountVisible()) {
                composeView.setContent(ComposableLambda3.composableLambdaInstance(1642983039, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$bindViewState$4$4$1
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
                            ComposerKt.traceEventStart(1642983039, i, -1, "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.bindViewState.<anonymous>.<anonymous>.<anonymous> (CryptoQuoteOrderFragment.kt:436)");
                        }
                        final CryptoQuoteOrderFragment cryptoQuoteOrderFragment = this.this$0;
                        BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1384725449, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$bindViewState$4$4$1.1
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
                                    ComposerKt.traceEventStart(-1384725449, i2, -1, "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.bindViewState.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoQuoteOrderFragment.kt:437)");
                                }
                                CryptoQuoteOrderFragment.Companion companion = CryptoQuoteOrderFragment.INSTANCE;
                                CryptoTradeAccountSwitcherDropdownComposable.CryptoTradeAccountSwitcherDropdownComposable(new CryptoTradeAccountSwitcherDropdownArgs(((CryptoQuoteOrderFragment.Args) companion.getArgs((Fragment) cryptoQuoteOrderFragment)).getUiCurrencyPair().getId(), CryptoTradeAccountSwitcherDropdownArgs.Source.QUOTE_ORDER, ((CryptoQuoteOrderFragment.Args) companion.getArgs((Fragment) cryptoQuoteOrderFragment)).getSide()), null, null, composer2, 0, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer, 54), composer, 100663296, 255);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
            RhTextView result = getContentBinding().result;
            Intrinsics.checkNotNullExpressionValue(result, "result");
            TextViewsKt.setVisibilityText(result, StringResources6.getText(this, orderContextViewState.getResult()));
            CryptoQuoteOrderViewState.OrderContextViewState orderContextViewState2 = viewState.getOrderContextViewState();
            if (orderContextViewState2 == null || !orderContextViewState2.getResultShowsClickablePriceEstimate()) {
                RhTextView result2 = getContentBinding().result;
                Intrinsics.checkNotNullExpressionValue(result2, "result");
                TextViewsKt.setDrawableEnd(result2, null);
                RhTextView result3 = getContentBinding().result;
                Intrinsics.checkNotNullExpressionValue(result3, "result");
                OnClickListeners.onClick(result3, null);
            } else {
                RhTextView result4 = getContentBinding().result;
                Intrinsics.checkNotNullExpressionValue(result4, "result");
                TextViewsKt.setDrawableEnd(result4, requireContext().getDrawable(C20690R.drawable.ic_rds_question_16dp));
                RhTextView result5 = getContentBinding().result;
                Intrinsics.checkNotNullExpressionValue(result5, "result");
                OnClickListeners.onClick(result5, new CryptoQuoteOrderFragment$bindViewState$4$5(getDuxo()));
            }
            bindActionContainer(viewState, orderContextViewState.getActionViewState$feature_trade_crypto_externalDebug());
        }
        ComposeView composeView2 = getContentBinding().cryptoRecurringHookChip;
        final CryptoQuoteOrderRecurringHookChipState recurringHookState$feature_trade_crypto_externalDebug = viewState.getRecurringHookState$feature_trade_crypto_externalDebug();
        Intrinsics.checkNotNull(composeView2);
        composeView2.setVisibility(recurringHookState$feature_trade_crypto_externalDebug != null ? 0 : 8);
        if (recurringHookState$feature_trade_crypto_externalDebug != null) {
            composeView2.setContent(ComposableLambda3.composableLambdaInstance(-1473406882, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$bindViewState$5$1

                /* compiled from: CryptoQuoteOrderFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$bindViewState$5$1$1 */
                static final class C406461 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ CryptoQuoteOrderRecurringHookChipState $recurringHookState;
                    final /* synthetic */ CryptoQuoteOrderViewState $viewState;
                    final /* synthetic */ CryptoQuoteOrderFragment this$0;

                    C406461(CryptoQuoteOrderRecurringHookChipState cryptoQuoteOrderRecurringHookChipState, CryptoQuoteOrderFragment cryptoQuoteOrderFragment, CryptoQuoteOrderViewState cryptoQuoteOrderViewState) {
                        this.$recurringHookState = cryptoQuoteOrderRecurringHookChipState;
                        this.this$0 = cryptoQuoteOrderFragment;
                        this.$viewState = cryptoQuoteOrderViewState;
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
                            ComposerKt.traceEventStart(-1049569258, i, -1, "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.bindViewState.<anonymous>.<anonymous>.<anonymous> (CryptoQuoteOrderFragment.kt:470)");
                        }
                        CryptoQuoteOrderRecurringHookChipState cryptoQuoteOrderRecurringHookChipState = this.$recurringHookState;
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer.changedInstance(this.this$0) | composer.changedInstance(this.$viewState);
                        final CryptoQuoteOrderFragment cryptoQuoteOrderFragment = this.this$0;
                        final CryptoQuoteOrderViewState cryptoQuoteOrderViewState = this.$viewState;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = 
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0048: CONSTRUCTOR (r2v1 'objRememberedValue' java.lang.Object) = 
                                  (r0v4 'cryptoQuoteOrderFragment' com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment A[DONT_INLINE])
                                  (r1v1 'cryptoQuoteOrderViewState' com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderViewState A[DONT_INLINE])
                                 A[MD:(com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment, com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderViewState):void (m)] (LINE:473) call: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$bindViewState$5$1$1$$ExternalSyntheticLambda0.<init>(com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment, com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderViewState):void type: CONSTRUCTOR in method: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$bindViewState$5$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes12.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$bindViewState$5$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 25 more
                                */
                            /*
                                this = this;
                                r0 = r11 & 3
                                r1 = 2
                                if (r0 != r1) goto L10
                                boolean r0 = r10.getSkipping()
                                if (r0 != 0) goto Lc
                                goto L10
                            Lc:
                                r10.skipToGroupEnd()
                                return
                            L10:
                                boolean r0 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r0 == 0) goto L1f
                                r0 = -1
                                java.lang.String r1 = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.bindViewState.<anonymous>.<anonymous>.<anonymous> (CryptoQuoteOrderFragment.kt:470)"
                                r2 = -1049569258(0xffffffffc170d816, float:-15.052755)
                                androidx.compose.runtime.ComposerKt.traceEventStart(r2, r11, r0, r1)
                            L1f:
                                com.robinhood.shared.trade.crypto.ui.quoteOrder.views.CryptoQuoteOrderRecurringHookChipState r3 = r9.$recurringHookState
                                r11 = -1633490746(0xffffffff9ea2e8c6, float:-1.724869E-20)
                                r10.startReplaceGroup(r11)
                                com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment r11 = r9.this$0
                                boolean r11 = r10.changedInstance(r11)
                                com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderViewState r0 = r9.$viewState
                                boolean r0 = r10.changedInstance(r0)
                                r11 = r11 | r0
                                com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment r0 = r9.this$0
                                com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderViewState r1 = r9.$viewState
                                java.lang.Object r2 = r10.rememberedValue()
                                if (r11 != 0) goto L46
                                androidx.compose.runtime.Composer$Companion r11 = androidx.compose.runtime.Composer.INSTANCE
                                java.lang.Object r11 = r11.getEmpty()
                                if (r2 != r11) goto L4e
                            L46:
                                com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$bindViewState$5$1$1$$ExternalSyntheticLambda0 r2 = new com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$bindViewState$5$1$1$$ExternalSyntheticLambda0
                                r2.<init>(r0, r1)
                                r10.updateRememberedValue(r2)
                            L4e:
                                r4 = r2
                                kotlin.jvm.functions.Function0 r4 = (kotlin.jvm.functions.Function0) r4
                                r10.endReplaceGroup()
                                int r7 = com.robinhood.utils.resource.StringResource.$stable
                                r8 = 4
                                r5 = 0
                                r6 = r10
                                com.robinhood.shared.trade.crypto.p397ui.quoteOrder.views.CryptoQuoteOrderRecurringHookChip.CryptoQuoteOrderRecurringHookChip(r3, r4, r5, r6, r7, r8)
                                boolean r10 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
                                if (r10 == 0) goto L65
                                androidx.compose.runtime.ComposerKt.traceEventEnd()
                            L65:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.trade.crypto.p397ui.quoteOrder.CryptoQuoteOrderFragment$bindViewState$5$1.C406461.invoke(androidx.compose.runtime.Composer, int):void");
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(CryptoQuoteOrderFragment cryptoQuoteOrderFragment, CryptoQuoteOrderViewState cryptoQuoteOrderViewState) {
                            cryptoQuoteOrderFragment.showRecurringHookBottomSheet(cryptoQuoteOrderViewState);
                            return Unit.INSTANCE;
                        }
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
                            ComposerKt.traceEventStart(-1473406882, i, -1, "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.bindViewState.<anonymous>.<anonymous> (CryptoQuoteOrderFragment.kt:469)");
                        }
                        BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1049569258, true, new C406461(recurringHookState$feature_trade_crypto_externalDebug, this, viewState), composer, 54), composer, 100663296, 255);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
            }
            getContentBinding().cryptoOrderRowsComposeView.setContent(ComposableLambda3.composableLambdaInstance(-211807202, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.bindViewState.6
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
                        ComposerKt.traceEventStart(-211807202, i, -1, "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.bindViewState.<anonymous> (CryptoQuoteOrderFragment.kt:481)");
                    }
                    CompositionLocal6<ScarletManager> localScarletManager = LocalScarletManager.getLocalScarletManager();
                    ScarletContextWrapper scarletContextWrapper = CryptoQuoteOrderFragment.this.getScarletContextWrapper();
                    if (scarletContextWrapper == null || (scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper)) == null) {
                        Context contextRequireContext = CryptoQuoteOrderFragment.this.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        scarletManager = ScarletManager2.getScarletManager(contextRequireContext);
                    }
                    ProvidedValue<ScarletManager> providedValueProvides = localScarletManager.provides(scarletManager);
                    final CryptoQuoteOrderViewState cryptoQuoteOrderViewState = viewState;
                    final CryptoQuoteOrderFragment cryptoQuoteOrderFragment = CryptoQuoteOrderFragment.this;
                    CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(296613726, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.bindViewState.6.1
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
                                ComposerKt.traceEventStart(296613726, i2, -1, "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.bindViewState.<anonymous>.<anonymous> (CryptoQuoteOrderFragment.kt:485)");
                            }
                            final CryptoQuoteOrderViewState cryptoQuoteOrderViewState2 = cryptoQuoteOrderViewState;
                            final CryptoQuoteOrderFragment cryptoQuoteOrderFragment2 = cryptoQuoteOrderFragment;
                            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1213734746, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.bindViewState.6.1.1
                                public final void invoke(Composer composer3, int i3) {
                                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1213734746, i3, -1, "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment.bindViewState.<anonymous>.<anonymous>.<anonymous> (CryptoQuoteOrderFragment.kt:486)");
                                    }
                                    CryptoQuoteOrderViewState cryptoQuoteOrderViewState3 = cryptoQuoteOrderViewState2;
                                    CryptoQuoteOrderFragment cryptoQuoteOrderFragment3 = cryptoQuoteOrderFragment2;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    composer3.startReplaceGroup(-1664064368);
                                    for (CryptoOrderReviewRowState cryptoOrderReviewRowState : cryptoQuoteOrderViewState3.getOrderReviewRowStates()) {
                                        CryptoQuoteOrderDuxo duxo = cryptoQuoteOrderFragment3.getDuxo();
                                        composer3.startReplaceGroup(5004770);
                                        boolean zChangedInstance = composer3.changedInstance(duxo);
                                        Object objRememberedValue = composer3.rememberedValue();
                                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new CryptoQuoteOrderFragment$bindViewState$6$1$1$1$1$1$1(duxo);
                                            composer3.updateRememberedValue(objRememberedValue);
                                        }
                                        composer3.endReplaceGroup();
                                        CryptoOrderReviewRow3.CryptoOrderReviewRow(cryptoOrderReviewRowState, null, (Function1) ((KFunction) objRememberedValue), composer3, CryptoOrderReviewRowState.$stable, 2);
                                    }
                                    composer3.endReplaceGroup();
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
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
            bindFormState(viewState.getInput().getFormState$feature_trade_crypto_externalDebug());
            com.robinhood.shared.trade.crypto.context.CryptoOrderContext cryptoOrderContext = viewState.getCryptoOrderContext();
            if (cryptoOrderContext != null && (loggingCryptoOrderContext = cryptoOrderContext.getLoggingCryptoOrderContext()) != null) {
                this.loggingCryptoOrderContextRelay.accept(loggingCryptoOrderContext);
            }
            final CryptoOrderTooltipData tooltipData = viewState.getTooltipData();
            if (tooltipData != null && (rhTextView = this.toolbarText) != null && (target = TooltipData2.toTarget(rhTextView)) != null) {
                TooltipManager tooltipManager = getTooltipManager();
                StringResource text = tooltipData.getText();
                Resources resources = getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                TooltipManager.DefaultImpls.addTooltip$default(tooltipManager, false, new TooltipData(ORDER_TYPE_SELECTOR_TOOLTIP, text.getText(resources), target, null, new TooltipData.Behavior(null, null, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoQuoteOrderFragment.bindViewState$lambda$14$lambda$13$lambda$12(this.f$0, tooltipData, (View) obj);
                    }
                }, null, 11, null), 8, null), 1, null);
            }
            if (viewState.isToolbarVisible()) {
                return;
            }
            getTooltipManager().removeTooltip(ORDER_TYPE_SELECTOR_TOOLTIP);
        }

        /* compiled from: CryptoQuoteOrderFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$bindViewState$1", m3645f = "CryptoQuoteOrderFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$bindViewState$1 */
        static final class C406421 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CryptoQuoteOrderViewState $viewState;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C406421(CryptoQuoteOrderViewState cryptoQuoteOrderViewState, Continuation<? super C406421> continuation) {
                super(2, continuation);
                this.$viewState = cryptoQuoteOrderViewState;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return CryptoQuoteOrderFragment.this.new C406421(this.$viewState, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C406421) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    CryptoQuoteOrderFragment.this.getDuxo().emitBottomSheetData(this.$viewState.getBottomSheetTypeDtos());
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindViewState$lambda$9$lambda$6(CryptoQuoteOrderViewState.OrderContextViewState orderContextViewState, CryptoQuoteOrderFragment cryptoQuoteOrderFragment) {
            ServerDrivenAlert powerInfoAlert = orderContextViewState.getPowerInfoAlert();
            if (powerInfoAlert != null) {
                Navigator.DefaultImpls.createDialogFragment$default(cryptoQuoteOrderFragment.getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlertSheet(powerInfoAlert, true, true, 0, 8, (DefaultConstructorMarker) null), null, 2, null).show(cryptoQuoteOrderFragment.getParentFragmentManager(), "crypto-buying-power-info");
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindViewState$lambda$9$lambda$7(CryptoQuoteOrderFragment cryptoQuoteOrderFragment, CryptoQuoteOrderViewState cryptoQuoteOrderViewState) {
            cryptoQuoteOrderFragment.getDuxo().sellAll();
            EventLogger.DefaultImpls.logTap$default(cryptoQuoteOrderFragment.getEventLogger(), null, cryptoQuoteOrderFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, cryptoQuoteOrderViewState.getLoggingOrderPillEventContext(1, cryptoQuoteOrderFragment.getFragmentBinding().sellAllButton.getText().toString(), false), false, 41, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindViewState$lambda$14$lambda$13$lambda$12(CryptoQuoteOrderFragment cryptoQuoteOrderFragment, CryptoOrderTooltipData cryptoOrderTooltipData, View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            cryptoQuoteOrderFragment.getDuxo().onTooltipShown(cryptoOrderTooltipData.getType());
            return Unit.INSTANCE;
        }

        private final void setBackgroundColor(DefaultOrderState formState) {
            int i;
            int i2 = WhenMappings.$EnumSwitchMapping$0[formState.ordinal()];
            if (i2 == 1) {
                i = C20690R.attr.colorBackground1;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C20690R.attr.colorBackgroundPrimary;
            }
            ConstraintLayout constraintLayout = getFragmentBinding().constraintLayout;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            constraintLayout.setBackgroundTintList(ColorStateList.valueOf(ThemeColors.getThemeColor(contextRequireContext, i)));
        }

        private final void bindActionContainer(final CryptoQuoteOrderViewState viewState, final ActionViewState actionViewState) {
            RdsButton sellAllButton = getFragmentBinding().sellAllButton;
            Intrinsics.checkNotNullExpressionValue(sellAllButton, "sellAllButton");
            sellAllButton.setVisibility(actionViewState.isSellAllVisible() ? 0 : 8);
            RdsButton reviewBtn = getFragmentBinding().reviewBtn;
            Intrinsics.checkNotNullExpressionValue(reviewBtn, "reviewBtn");
            reviewBtn.setVisibility(actionViewState.isReviewVisible() ? 0 : 8);
            getFragmentBinding().reviewBtn.setEnabled(actionViewState.isButtonEnabled());
            LinearLayout quickTradeContainer = getFragmentBinding().quickTradeContainer;
            Intrinsics.checkNotNullExpressionValue(quickTradeContainer, "quickTradeContainer");
            quickTradeContainer.setVisibility(actionViewState.isQuickTradeVisible() ? 0 : 8);
            if (actionViewState instanceof ActionViewState.Review) {
                ActionViewState.Review review = (ActionViewState.Review) actionViewState;
                getFragmentBinding().reviewBtn.setEnabled(review.isEnabled());
                getFragmentBinding().reviewBtn.setText(StringResources6.getText(this, review.getButtonText()));
                RdsButton reviewBtn2 = getFragmentBinding().reviewBtn;
                Intrinsics.checkNotNullExpressionValue(reviewBtn2, "reviewBtn");
                OnClickListeners.onClick(reviewBtn2, new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoQuoteOrderFragment.bindActionContainer$lambda$15(this.f$0, actionViewState);
                    }
                });
            } else if (actionViewState instanceof ActionViewState.Continue) {
                ActionViewState.Continue r2 = (ActionViewState.Continue) actionViewState;
                getFragmentBinding().reviewBtn.setEnabled(r2.isButtonEnabled());
                getFragmentBinding().reviewBtn.setText(StringResources6.getText(this, r2.getButtonText()));
                RdsButton reviewBtn3 = getFragmentBinding().reviewBtn;
                Intrinsics.checkNotNullExpressionValue(reviewBtn3, "reviewBtn");
                OnClickListeners.onClick(reviewBtn3, new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoQuoteOrderFragment.bindActionContainer$lambda$16(this.f$0, actionViewState, viewState);
                    }
                });
            } else if (!(actionViewState instanceof ActionViewState.SellAll) && !(actionViewState instanceof ActionViewState.Empty)) {
                if (!(actionViewState instanceof ActionViewState.QuickTrades)) {
                    if (!Intrinsics.areEqual(actionViewState, ActionViewState.BuyMax.INSTANCE) && !(actionViewState instanceof ActionViewState.Submit) && !(actionViewState instanceof ActionViewState.SwipeToSubmit)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("Unsupported on regular trade flow.");
                }
                bindQuickTrade(viewState, (ActionViewState.QuickTrades) actionViewState);
            }
            getFragmentBinding().reviewBtn.setLoading(viewState.isReviewOrderButtonLoading());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindActionContainer$lambda$15(CryptoQuoteOrderFragment cryptoQuoteOrderFragment, ActionViewState actionViewState) {
            cryptoQuoteOrderFragment.trackReviewContinueButtonClicked(((ActionViewState.Review) actionViewState).getAnalyticsIdentifier());
            cryptoQuoteOrderFragment.validateAndReviewOrder();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindActionContainer$lambda$16(CryptoQuoteOrderFragment cryptoQuoteOrderFragment, ActionViewState actionViewState, CryptoQuoteOrderViewState cryptoQuoteOrderViewState) {
            ActionViewState.Continue r11 = (ActionViewState.Continue) actionViewState;
            cryptoQuoteOrderFragment.trackReviewContinueButtonClicked(r11.getAnalyticsIdentifier());
            if (r11.isRecurring()) {
                CryptoQuoteOrderDuxo duxo = cryptoQuoteOrderFragment.getDuxo();
                Money recurringBuyingPower = cryptoQuoteOrderViewState.getRecurringBuyingPower();
                Money recurringMinOrderSize = cryptoQuoteOrderViewState.getRecurringMinOrderSize();
                Money recurringMaxOrderSize = cryptoQuoteOrderViewState.getRecurringMaxOrderSize();
                duxo.validateRecurring(cryptoQuoteOrderViewState.getRecurringHookAmount(), cryptoQuoteOrderViewState.getRecurringHookFrequency(), recurringBuyingPower, recurringMinOrderSize, recurringMaxOrderSize, cryptoQuoteOrderViewState.getRecurringHookStartDate(), (64 & 64) != 0 ? false : false);
            } else {
                cryptoQuoteOrderFragment.validateAndReviewOrder();
            }
            return Unit.INSTANCE;
        }

        private final void trackReviewContinueButtonClicked(String analyticsIdentifier) {
            com.robinhood.shared.trade.crypto.context.CryptoOrderContext cryptoOrderContext;
            EventLogger eventLogger = getEventLogger();
            Screen eventScreen = getEventScreen();
            Component component = new Component(Component.ComponentType.BUTTON, analyticsIdentifier, null, 4, null);
            CryptoQuoteOrderViewState cryptoQuoteOrderViewState = this.viewState;
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, eventScreen, component, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, (cryptoQuoteOrderViewState == null || (cryptoOrderContext = cryptoQuoteOrderViewState.getCryptoOrderContext()) == null) ? null : cryptoOrderContext.getLoggingCryptoOrderContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null), false, 41, null);
        }

        private final void bindQuickTrade(CryptoQuoteOrderViewState viewState, ActionViewState.QuickTrades actionViewState) {
            ActionViewState.QuickTrade quickTrade = actionViewState.getQuickTrades().get(0);
            RdsButton quickTrade1Button = getFragmentBinding().quickTrade1Button;
            Intrinsics.checkNotNullExpressionValue(quickTrade1Button, "quickTrade1Button");
            bindQuickTradeButton(viewState, quickTrade, quickTrade1Button);
            ActionViewState.QuickTrade quickTrade2 = actionViewState.getQuickTrades().get(1);
            RdsButton quickTrade2Button = getFragmentBinding().quickTrade2Button;
            Intrinsics.checkNotNullExpressionValue(quickTrade2Button, "quickTrade2Button");
            bindQuickTradeButton(viewState, quickTrade2, quickTrade2Button);
            ActionViewState.QuickTrade quickTrade3 = actionViewState.getQuickTrades().get(2);
            RdsButton quickTrade3Button = getFragmentBinding().quickTrade3Button;
            Intrinsics.checkNotNullExpressionValue(quickTrade3Button, "quickTrade3Button");
            bindQuickTradeButton(viewState, quickTrade3, quickTrade3Button);
        }

        private final void bindQuickTradeButton(final CryptoQuoteOrderViewState viewState, final ActionViewState.QuickTrade quickTrade, RdsButton button) {
            TextViewsKt.setVisibilityText(button, StringResources6.getText(this, quickTrade.getButtonText()));
            OnClickListeners.onClick(button, new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CryptoQuoteOrderFragment.bindQuickTradeButton$lambda$17(quickTrade, this, viewState);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bindQuickTradeButton$lambda$17(ActionViewState.QuickTrade quickTrade, CryptoQuoteOrderFragment cryptoQuoteOrderFragment, CryptoQuoteOrderViewState cryptoQuoteOrderViewState) throws Resources.NotFoundException {
            if (quickTrade instanceof ActionViewState.QuickTrade.AmountQuote) {
                cryptoQuoteOrderFragment.setQuickTradeAmountOrder((ActionViewState.QuickTrade.AmountQuote) quickTrade);
            } else {
                if (!(quickTrade instanceof ActionViewState.QuickTrade.SellAll)) {
                    if (quickTrade instanceof ActionViewState.QuickTrade.BuyMax) {
                        throw new IllegalStateException("Unsupported on regular trade flow.");
                    }
                    throw new NoWhenBranchMatchedException();
                }
                cryptoQuoteOrderFragment.getDuxo().sellAll();
            }
            EventLogger eventLogger = cryptoQuoteOrderFragment.getEventLogger();
            Screen eventScreen = cryptoQuoteOrderFragment.getEventScreen();
            Component component = new Component(Component.ComponentType.BUTTON, "crypto_trade_flow_quick_trade", null, 4, null);
            int index = quickTrade.getIndex();
            StringResource buttonText = quickTrade.getButtonText();
            Resources resources = cryptoQuoteOrderFragment.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            CharSequence text = buttonText.getText(resources);
            Intrinsics.checkNotNull(text, "null cannot be cast to non-null type kotlin.String");
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, eventScreen, component, null, cryptoQuoteOrderViewState.getLoggingOrderPillEventContext(index, (String) text, quickTrade instanceof ActionViewState.QuickTrade.AmountQuote ? ((ActionViewState.QuickTrade.AmountQuote) quickTrade).isRecurringOrder() : false), false, 41, null);
            return Unit.INSTANCE;
        }

        private final void setQuickTradeAmountOrder(ActionViewState.QuickTrade.AmountQuote amountQuote) {
            getDuxo().setAmountAndContinue(amountQuote.getInputAmount().getAmount(), amountQuote.isRecurringOrder());
        }

        @Override // com.robinhood.shared.trade.crypto.activity.CryptoOrderSubmissionFailureCallbacks
        public void setFormStateToEditing() {
            getDuxo().setFormState(DefaultOrderState.EDITING);
        }

        private final void bindFormState(DefaultOrderState formState) {
            setFormState(formState);
        }

        @Override // com.robinhood.android.lib.trade.BaseOrderFragment
        public void onFormStateUpdated() {
            super.onFormStateUpdated();
            getCallbacks().onReviewStateChanged(getReviewing());
        }

        private final void enterRecurringFlow(ApiInvestmentSchedule.Frequency recurringHookFrequency, LocalDate recurringHookStartDate, Money recurringHookAmount) {
            getCallbacks().enterRecurringFlowFromHook(recurringHookFrequency, recurringHookStartDate, recurringHookAmount);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void showRecurringHookBottomSheet(CryptoQuoteOrderViewState viewState) {
            Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag(DIALOG_RECURRING_HOOK_BOTTOM_SHEET);
            CryptoOrderRecurringHookBottomSheet cryptoOrderRecurringHookBottomSheet = fragmentFindFragmentByTag instanceof CryptoOrderRecurringHookBottomSheet ? (CryptoOrderRecurringHookBottomSheet) fragmentFindFragmentByTag : null;
            if (cryptoOrderRecurringHookBottomSheet == null) {
                cryptoOrderRecurringHookBottomSheet = (CryptoOrderRecurringHookBottomSheet) CryptoOrderRecurringHookBottomSheet.INSTANCE.newInstance((Parcelable) new CryptoOrderRecurringHookBottomSheet.Args(((Args) INSTANCE.getArgs((Fragment) this)).getUiCurrencyPair().getAssetCurrency(), viewState.getRecurringHookFrequency(), viewState.m2888x5cfb4369()));
            }
            if (cryptoOrderRecurringHookBottomSheet.isAdded()) {
                return;
            }
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            cryptoOrderRecurringHookBottomSheet.show(childFragmentManager, DIALOG_RECURRING_HOOK_BOTTOM_SHEET);
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

        @Override // com.robinhood.android.lib.trade.BaseOrderFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
        public boolean onBackPressed() {
            if (!getReviewing()) {
                return false;
            }
            getDuxo().setFormState(DefaultOrderState.EDITING);
            return true;
        }

        @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
        public void configureToolbar(RhToolbar toolbar) {
            ViewGroup viewGroup;
            Intrinsics.checkNotNullParameter(toolbar, "toolbar");
            super.configureToolbar(toolbar);
            requireBaseActivity().showCloseIcon();
            ScarletManager2.overrideAttribute(toolbar.getToolbar(), R$attr.colorControlNormal, ThemeAttributes.INSTANCE.getCOLOR_POSITIVE());
            View viewFindViewById = toolbar.findViewById(C40095R.id.crypto_order_toolbar_content);
            if (viewFindViewById == null) {
                RhToolbar.addCustomView$default(toolbar, C40095R.layout.include_crypto_order_toolbar, false, 0, 6, null);
                View viewFindViewById2 = toolbar.findViewById(C40095R.id.crypto_order_toolbar_content);
                Intrinsics.checkNotNull(viewFindViewById2, "null cannot be cast to non-null type android.view.ViewGroup");
                viewGroup = (ViewGroup) viewFindViewById2;
            } else {
                viewGroup = (ViewGroup) viewFindViewById;
            }
            this.toolbarContent = viewGroup;
            this.toolbarText = viewGroup != null ? (RhTextView) viewGroup.findViewById(C40095R.id.action_order_types_txt) : null;
            ViewGroup viewGroup2 = this.toolbarContent;
            if (viewGroup2 != null) {
                OnClickListeners.onClick(viewGroup2, new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.quoteOrder.CryptoQuoteOrderFragment$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoQuoteOrderFragment.configureToolbar$lambda$18(this.f$0);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit configureToolbar$lambda$18(CryptoQuoteOrderFragment cryptoQuoteOrderFragment) {
            cryptoQuoteOrderFragment.getTooltipManager().removeTooltip(ORDER_TYPE_SELECTOR_TOOLTIP);
            cryptoQuoteOrderFragment.getDuxo().onToolbarContentTapped();
            return Unit.INSTANCE;
        }

        @Override // com.robinhood.android.lib.trade.BaseOrderFragment
        public void validateAndReviewOrder() {
            com.robinhood.shared.trade.crypto.context.CryptoOrderContext cryptoOrderContext;
            CryptoQuoteOrderViewState cryptoQuoteOrderViewState = this.viewState;
            if (cryptoQuoteOrderViewState == null || (cryptoOrderContext = cryptoQuoteOrderViewState.getCryptoOrderContext()) == null) {
                return;
            }
            getDuxo().validateOrder(cryptoOrderContext);
        }

        @Override // com.robinhood.android.lib.trade.BaseOrderFragment
        public void performSubmitOrder() {
            com.robinhood.shared.trade.crypto.context.CryptoOrderContext cryptoOrderContext;
            CryptoQuoteOrderViewState cryptoQuoteOrderViewState = this.viewState;
            if (cryptoQuoteOrderViewState == null || (cryptoOrderContext = cryptoQuoteOrderViewState.getCryptoOrderContext()) == null) {
                return;
            }
            getDuxo().submitOrder(cryptoOrderContext);
        }

        @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
        public boolean onLinkTextClicked(int id, Bundle passthroughArgs, String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (id == C20649R.id.dialog_id_validation_failure) {
                Navigator navigator = getNavigator();
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, url);
                return true;
            }
            return super.onLinkTextClicked(id, passthroughArgs, url);
        }

        @Override // com.robinhood.shared.trade.crypto.ui.recurringHook.CryptoOrderRecurringHookBottomSheet.Callbacks
        public void onRecurringOptionsSelected(ApiInvestmentSchedule.Frequency frequency, LocalDate startDate) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            getDuxo().setRecurringOptionsFromHook(frequency, startDate);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void handleEvent(CryptoQuoteOrderEvent event) {
            DialogFragment dialogFragment;
            if (Intrinsics.areEqual(event, CryptoQuoteOrderEvent.DisplayCryptoFeeTooltip.INSTANCE)) {
                displayCryptoFeeTooltip();
                Unit unit = Unit.INSTANCE;
                return;
            }
            if (event instanceof CryptoQuoteOrderEvent.ShakeInput) {
                AnimationUtils animationUtils = AnimationUtils.INSTANCE;
                CryptoTickerInputView inputView = getContentBinding().inputView;
                Intrinsics.checkNotNullExpressionValue(inputView, "inputView");
                AnimationUtils.animateErrorShake$default(animationUtils, inputView, 0L, 0.05f, 1, null);
                Unit unit2 = Unit.INSTANCE;
                return;
            }
            if (event instanceof CryptoQuoteOrderEvent.ShowFeeDefinitionBottomSheet) {
                CryptoFeeDefinitionBottomSheetFragment cryptoFeeDefinitionBottomSheetFragment = (CryptoFeeDefinitionBottomSheetFragment) CryptoFeeDefinitionBottomSheetFragment.INSTANCE.newInstance((Parcelable) ((CryptoQuoteOrderEvent.ShowFeeDefinitionBottomSheet) event).getArgs());
                FragmentManager parentFragmentManager = getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
                cryptoFeeDefinitionBottomSheetFragment.show(parentFragmentManager, TAG_FEE_DEF_BOTTOM_SHEET);
                Unit unit3 = Unit.INSTANCE;
                return;
            }
            if (event instanceof CryptoQuoteOrderEvent.DismissFeeDefinitionBottomSheet) {
                Fragment fragmentFindFragmentByTag = getParentFragmentManager().findFragmentByTag(TAG_FEE_DEF_BOTTOM_SHEET);
                dialogFragment = fragmentFindFragmentByTag instanceof DialogFragment ? (DialogFragment) fragmentFindFragmentByTag : null;
                if (dialogFragment != null) {
                    dialogFragment.dismiss();
                    Unit unit4 = Unit.INSTANCE;
                    return;
                }
                return;
            }
            if (event instanceof CryptoQuoteOrderEvent.ShowTradeBonusBottomSheet) {
                CryptoTradeBonusReviewOrderBottomSheetFragment cryptoTradeBonusReviewOrderBottomSheetFragment = (CryptoTradeBonusReviewOrderBottomSheetFragment) CryptoTradeBonusReviewOrderBottomSheetFragment.INSTANCE.newInstance((Parcelable) ((CryptoQuoteOrderEvent.ShowTradeBonusBottomSheet) event).getArgs());
                FragmentManager parentFragmentManager2 = getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager2, "getParentFragmentManager(...)");
                cryptoTradeBonusReviewOrderBottomSheetFragment.show(parentFragmentManager2, "cryptoTradeBonusReviewOrderBottomSheetFragment");
                Unit unit5 = Unit.INSTANCE;
                return;
            }
            if (event instanceof CryptoQuoteOrderEvent.StartActivity) {
                Navigator navigator = getNavigator();
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, ((CryptoQuoteOrderEvent.StartActivity) event).getIntentKey(), null, false, null, null, 60, null);
                Unit unit6 = Unit.INSTANCE;
                return;
            }
            if (event instanceof CryptoQuoteOrderEvent.ShowSduiValidationAlert) {
                Fragment fragmentFindFragmentByTag2 = getChildFragmentManager().findFragmentByTag(TAG_ORDER_VALIDATION_ALERT);
                dialogFragment = fragmentFindFragmentByTag2 instanceof CryptoSduiOrderValidationAlertDialogFragment ? (CryptoSduiOrderValidationAlertDialogFragment) fragmentFindFragmentByTag2 : null;
                if (dialogFragment != null) {
                    dialogFragment.dismissNow();
                    Unit unit7 = Unit.INSTANCE;
                }
                CryptoSduiOrderValidationAlertDialogFragment cryptoSduiOrderValidationAlertDialogFragment = (CryptoSduiOrderValidationAlertDialogFragment) CryptoSduiOrderValidationAlertDialogFragment.INSTANCE.newInstance((Parcelable) new CryptoSduiOrderValidationAlertDialogFragment.Args(((CryptoQuoteOrderEvent.ShowSduiValidationAlert) event).getContent()));
                FragmentManager childFragmentManager = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                cryptoSduiOrderValidationAlertDialogFragment.show(childFragmentManager, TAG_ORDER_VALIDATION_ALERT);
                this.validationAlertDialogFragment = cryptoSduiOrderValidationAlertDialogFragment;
                Unit unit8 = Unit.INSTANCE;
                return;
            }
            if (event instanceof CryptoQuoteOrderEvent.ShowValidationFailure) {
                CryptoQuoteOrderEvent.ShowValidationFailure showValidationFailure = (CryptoQuoteOrderEvent.ShowValidationFailure) event;
                showValidationFailure.getFailure().showAlert(requireBaseActivity(), showValidationFailure.getCryptoOrderContext());
                Unit unit9 = Unit.INSTANCE;
                return;
            }
            if (event instanceof CryptoQuoteOrderEvent.HandleCryptoFeeEventType) {
                CryptoFeeUiEventProvider4.CryptoQuoteOrder type2 = ((CryptoQuoteOrderEvent.HandleCryptoFeeEventType) event).getType();
                if (type2 instanceof CryptoFeeUiEventProvider4.CryptoQuoteOrder.ShowFeeTierUpsellBottomSheet) {
                    getDuxo().showFeeTierUpsellBottomSheet();
                } else {
                    if (!(type2 instanceof CryptoFeeUiEventProvider4.CryptoQuoteOrder.ShowFeeUnsupportedForCurrencyPairBanner)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ComposeView cryptoFeeBannerComposeView = getContentBinding().cryptoFeeBannerComposeView;
                    Intrinsics.checkNotNullExpressionValue(cryptoFeeBannerComposeView, "cryptoFeeBannerComposeView");
                    cryptoFeeBannerComposeView.setVisibility(0);
                    getContentBinding().cryptoFeeBannerComposeView.setContent(ComposableLambda3.composableLambdaInstance(634704649, true, new C406482(event)));
                }
                Unit unit10 = Unit.INSTANCE;
                return;
            }
            if (event instanceof CryptoQuoteOrderEvent.EnterRecurringFlow) {
                CryptoQuoteOrderEvent.EnterRecurringFlow enterRecurringFlow = (CryptoQuoteOrderEvent.EnterRecurringFlow) event;
                enterRecurringFlow(enterRecurringFlow.getRecurringHookFrequency(), enterRecurringFlow.getRecurringHookStartDate(), enterRecurringFlow.getRecurringHookAmount());
                Unit unit11 = Unit.INSTANCE;
                return;
            }
            if (event instanceof CryptoQuoteOrderEvent.ShowOrderTypeSelector) {
                getCallbacks().showOrderTypeSelector(CryptoOrderType.MARKET, ((CryptoQuoteOrderEvent.ShowOrderTypeSelector) event).isRecurringOrder());
                Unit unit12 = Unit.INSTANCE;
                return;
            }
            if (event instanceof CryptoQuoteOrderEvent.ShowFragmentInActivity) {
                Navigator navigator2 = getNavigator();
                Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
                Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator2, contextRequireContext2, ((CryptoQuoteOrderEvent.ShowFragmentInActivity) event).getFragmentKey(), false, false, false, false, null, false, null, NavigationType.PRESENT, 508, null);
                Unit unit13 = Unit.INSTANCE;
                return;
            }
            if (event instanceof CryptoQuoteOrderEvent.ShowDialogFragment) {
                DialogFragment dialogFragmentCreateDialogFragment$default = Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), ((CryptoQuoteOrderEvent.ShowDialogFragment) event).getDialogFragmentKey(), null, 2, null);
                FragmentManager childFragmentManager2 = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager2, "getChildFragmentManager(...)");
                DialogFragments.showIfNotFound(dialogFragmentCreateDialogFragment$default, childFragmentManager2, "microgramCryptoQuoteOrderDialogFragment");
                Unit unit14 = Unit.INSTANCE;
                return;
            }
            if (event instanceof CryptoQuoteOrderEvent.ShowAlertDto) {
                Fragment fragmentFindFragmentByTag3 = getChildFragmentManager().findFragmentByTag(TAG_MICROGRAM_ORDER_VALIDATION_ALERT);
                dialogFragment = fragmentFindFragmentByTag3 instanceof CryptoSduiOrderValidationAlertDialogFragmentV2 ? (CryptoSduiOrderValidationAlertDialogFragmentV2) fragmentFindFragmentByTag3 : null;
                if (dialogFragment != null) {
                    dialogFragment.dismissNow();
                    Unit unit15 = Unit.INSTANCE;
                }
                CryptoQuoteOrderEvent.ShowAlertDto showAlertDto = (CryptoQuoteOrderEvent.ShowAlertDto) event;
                CryptoSduiOrderValidationAlertDialogFragmentV2 cryptoSduiOrderValidationAlertDialogFragmentV2 = (CryptoSduiOrderValidationAlertDialogFragmentV2) CryptoSduiOrderValidationAlertDialogFragmentV2.INSTANCE.newInstance((Parcelable) new CryptoSduiOrderValidationAlertDialogFragmentV2.Args(showAlertDto.getAlertDto(), getEventScreen(), new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, showAlertDto.getLoggingCryptoOrderContext(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -2049, -1, -1, 16383, null)));
                FragmentManager childFragmentManager3 = getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager3, "getChildFragmentManager(...)");
                cryptoSduiOrderValidationAlertDialogFragmentV2.show(childFragmentManager3, TAG_MICROGRAM_ORDER_VALIDATION_ALERT);
                this.validationAlertDialogFragmentV2 = cryptoSduiOrderValidationAlertDialogFragmentV2;
                Unit unit16 = Unit.INSTANCE;
                return;
            }
            if (!(event instanceof CryptoQuoteOrderEvent.ShowRecurringAlertDialog)) {
                throw new NoWhenBranchMatchedException();
            }
            CryptoRecurringOrderAlertDialogFragment cryptoRecurringOrderAlertDialogFragment = (CryptoRecurringOrderAlertDialogFragment) CryptoRecurringOrderAlertDialogFragment.INSTANCE.newInstance((Parcelable) ((CryptoQuoteOrderEvent.ShowRecurringAlertDialog) event).getArgs());
            FragmentManager childFragmentManager4 = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager4, "getChildFragmentManager(...)");
            cryptoRecurringOrderAlertDialogFragment.show(childFragmentManager4, "cryptoRecurringOrderAlertDialogFragment");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.shared.trade.crypto.ui.validation.CryptoSduiOrderValidationAlertDialogFragment.Callbacks
        public void handleAction(CryptoValidateOrderAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            if (action instanceof CryptoValidateOrderAction.ContinueAction) {
                CryptoSduiOrderValidationAlertDialogFragment cryptoSduiOrderValidationAlertDialogFragment = this.validationAlertDialogFragment;
                if (cryptoSduiOrderValidationAlertDialogFragment != null) {
                    cryptoSduiOrderValidationAlertDialogFragment.dismiss();
                }
                CryptoQuoteOrderDuxo duxo = getDuxo();
                CryptoQuoteOrderViewState cryptoQuoteOrderViewState = this.viewState;
                com.robinhood.shared.trade.crypto.context.CryptoOrderContext cryptoOrderContext = cryptoQuoteOrderViewState != null ? cryptoQuoteOrderViewState.getCryptoOrderContext() : null;
                if (cryptoOrderContext == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                duxo.fetchTradeBonusEligibility(cryptoOrderContext);
                return;
            }
            if (action instanceof CryptoValidateOrderAction.CryptoAcknowledgeAlertAndContinue) {
                CryptoSduiOrderValidationAlertDialogFragment cryptoSduiOrderValidationAlertDialogFragment2 = this.validationAlertDialogFragment;
                if (cryptoSduiOrderValidationAlertDialogFragment2 != null) {
                    cryptoSduiOrderValidationAlertDialogFragment2.dismiss();
                }
                getDuxo().onAcknowledgeAlertAndContinue(((CryptoValidateOrderAction.CryptoAcknowledgeAlertAndContinue) action).getValue2());
                return;
            }
            if (action instanceof CryptoValidateOrderAction.CryptoCancelTradeFlow) {
                getCallbacks().cancelTradeFlow();
                return;
            }
            if (action instanceof CryptoValidateOrderAction.Deeplink) {
                ActionHandlingFragment2.handleDeeplink$default(this, ((CryptoValidateOrderAction.Deeplink) action).getValue2(), null, 2, null);
                return;
            }
            if (!(action instanceof CryptoValidateOrderAction.Dismiss)) {
                if (!(action instanceof CryptoValidateOrderAction.InfoAlert) && !(action instanceof CryptoValidateOrderAction.SetCryptoOrderQuantity)) {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                CryptoSduiOrderValidationAlertDialogFragment cryptoSduiOrderValidationAlertDialogFragment3 = this.validationAlertDialogFragment;
                if (cryptoSduiOrderValidationAlertDialogFragment3 != null) {
                    cryptoSduiOrderValidationAlertDialogFragment3.dismiss();
                }
            }
        }

        @Override // com.robinhood.shared.trade.crypto.activity.CryptoOrderSubmissionFailureCallbacks
        public void convertToRebateOrder() {
            getDuxo().convertToRebateOrder();
        }

        private final void displayCryptoFeeTooltip() {
            TooltipData.Target target;
            RhTextView rhTextView = this.toolbarText;
            if (rhTextView == null || (target = TooltipData2.toTarget(rhTextView)) == null) {
                return;
            }
            TooltipManager tooltipManager = getTooltipManager();
            String string2 = getString(C40095R.string.crypto_fee_upsell_bottom_sheet_maybe_later_tooltip);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            TooltipManager.DefaultImpls.addTooltip$default(tooltipManager, false, new TooltipData(ORDER_TYPE_SELECTOR_TOOLTIP, string2, target, null, null, 24, null), 1, null);
        }

        @Override // com.robinhood.shared.trade.crypto.ui.validation.CryptoSduiOrderValidationAlertDialogFragmentV2.Callbacks
        public void handleAction(ValidateCryptoOrderResponseDto.MobileDto.ActionDto action) {
            Intrinsics.checkNotNullParameter(action, "action");
            ValidateCryptoOrderResponseDto.MobileDto.ActionDto.TypeDto type2 = action.getType();
            if (type2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (type2 instanceof ValidateCryptoOrderResponseDto.MobileDto.ActionDto.TypeDto.Dismiss) {
                CryptoSduiOrderValidationAlertDialogFragmentV2 cryptoSduiOrderValidationAlertDialogFragmentV2 = this.validationAlertDialogFragmentV2;
                if (cryptoSduiOrderValidationAlertDialogFragmentV2 != null) {
                    cryptoSduiOrderValidationAlertDialogFragmentV2.dismiss();
                }
                handleSideEffects(((ValidateCryptoOrderResponseDto.MobileDto.ActionDto.TypeDto.Dismiss) type2).getValue().getSide_effects());
                return;
            }
            if (type2 instanceof ValidateCryptoOrderResponseDto.MobileDto.ActionDto.TypeDto.AcknowledgeAndContinue) {
                CryptoSduiOrderValidationAlertDialogFragmentV2 cryptoSduiOrderValidationAlertDialogFragmentV22 = this.validationAlertDialogFragmentV2;
                if (cryptoSduiOrderValidationAlertDialogFragmentV22 != null) {
                    cryptoSduiOrderValidationAlertDialogFragmentV22.dismiss();
                }
                getDuxo().onOrderValidationAcknowledgeAndContinue(((ValidateCryptoOrderResponseDto.MobileDto.ActionDto.TypeDto.AcknowledgeAndContinue) type2).getValue().getAcknowledge_id());
            }
        }

        @Override // com.robinhood.shared.trade.crypto.ui.validation.CryptoSduiOrderValidationAlertDialogFragmentV2.Callbacks
        public void handleDeeplink(String uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(uri), null, null, false, null, 60, null);
        }

        private final void handleSideEffects(List<ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto> sideEffects) {
            Iterator<T> it = sideEffects.iterator();
            while (it.hasNext()) {
                ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto type2 = ((ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto) it.next()).getType();
                if (type2 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                if (type2 instanceof ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.DeeplinkAction) {
                    handleDeeplink(((ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.DeeplinkAction) type2).getValue().getUrl());
                } else if (type2 instanceof ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.SetOrderSize) {
                    CryptoQuoteOrderDuxo duxo = getDuxo();
                    IdlDecimal quote_amount = ((ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.SetOrderSize) type2).getValue().getQuote_amount();
                    if (quote_amount == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    duxo.setOrderSize(quote_amount.toBigDecimalOrThrow());
                } else if (type2 instanceof ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.StartDepositFlow) {
                    getDuxo().initiateDeposit();
                } else if (type2 instanceof ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.ConvertToSellAll) {
                    getDuxo().sellAll();
                } else if (type2 instanceof ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.SetPdtWarningAsSeen) {
                    getDuxo().setPdtWarningAsSeen();
                } else if (type2 instanceof ValidateCryptoOrderResponseDto.MobileDto.ActionDto.SideEffectDto.TypeDto.ShowPaymentMethodSelection) {
                    throw new IllegalStateException(("Unexpected sideEffectType " + type2).toString());
                }
            }
        }

        @Override // com.robinhood.shared.trade.crypto.ui.quoteOrder.recurringAlert.CryptoRecurringOrderAlertDialogFragment.Callbacks
        public void onContinueRecurringValidation() {
            CryptoQuoteOrderViewState cryptoQuoteOrderViewState = this.viewState;
            if (cryptoQuoteOrderViewState != null) {
                CryptoQuoteOrderDuxo duxo = getDuxo();
                Money recurringBuyingPower = cryptoQuoteOrderViewState.getRecurringBuyingPower();
                Money recurringMinOrderSize = cryptoQuoteOrderViewState.getRecurringMinOrderSize();
                Money recurringMaxOrderSize = cryptoQuoteOrderViewState.getRecurringMaxOrderSize();
                duxo.validateRecurring(cryptoQuoteOrderViewState.getRecurringHookAmount(), cryptoQuoteOrderViewState.getRecurringHookFrequency(), recurringBuyingPower, recurringMinOrderSize, recurringMaxOrderSize, cryptoQuoteOrderViewState.getRecurringHookStartDate(), true);
            }
        }

        @Override // com.robinhood.shared.trade.crypto.ui.quoteOrder.recurringAlert.CryptoRecurringOrderAlertDialogFragment.Callbacks
        public void onRecurringDepositFunds() {
            getDuxo().initiateDeposit();
        }

        /* compiled from: CryptoQuoteOrderFragment.kt */
        @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0016\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderFragment$Args;", "Landroid/os/Parcelable;", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "side", "Lcom/robinhood/models/db/OrderSide;", "inputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "orderUuid", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/shared/formats/crypto/CryptoInputMode;Ljava/util/UUID;)V", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "getInputMode", "()Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "getOrderUuid", "()Ljava/util/UUID;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Args implements Parcelable {
            public static final int $stable = 8;
            public static final Parcelable.Creator<Args> CREATOR = new Creator();
            private final CryptoInputMode inputMode;
            private final UUID orderUuid;
            private final OrderSide side;
            private final UiCurrencyPair uiCurrencyPair;

            /* compiled from: CryptoQuoteOrderFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Args> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Args createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Args((UiCurrencyPair) parcel.readParcelable(Args.class.getClassLoader()), OrderSide.valueOf(parcel.readString()), CryptoInputMode.valueOf(parcel.readString()), (UUID) parcel.readSerializable());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Args[] newArray(int i) {
                    return new Args[i];
                }
            }

            public static /* synthetic */ Args copy$default(Args args, UiCurrencyPair uiCurrencyPair, OrderSide orderSide, CryptoInputMode cryptoInputMode, UUID uuid, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiCurrencyPair = args.uiCurrencyPair;
                }
                if ((i & 2) != 0) {
                    orderSide = args.side;
                }
                if ((i & 4) != 0) {
                    cryptoInputMode = args.inputMode;
                }
                if ((i & 8) != 0) {
                    uuid = args.orderUuid;
                }
                return args.copy(uiCurrencyPair, orderSide, cryptoInputMode, uuid);
            }

            /* renamed from: component1, reason: from getter */
            public final UiCurrencyPair getUiCurrencyPair() {
                return this.uiCurrencyPair;
            }

            /* renamed from: component2, reason: from getter */
            public final OrderSide getSide() {
                return this.side;
            }

            /* renamed from: component3, reason: from getter */
            public final CryptoInputMode getInputMode() {
                return this.inputMode;
            }

            /* renamed from: component4, reason: from getter */
            public final UUID getOrderUuid() {
                return this.orderUuid;
            }

            public final Args copy(UiCurrencyPair uiCurrencyPair, OrderSide side, CryptoInputMode inputMode, UUID orderUuid) {
                Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(inputMode, "inputMode");
                Intrinsics.checkNotNullParameter(orderUuid, "orderUuid");
                return new Args(uiCurrencyPair, side, inputMode, orderUuid);
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
                return Intrinsics.areEqual(this.uiCurrencyPair, args.uiCurrencyPair) && this.side == args.side && this.inputMode == args.inputMode && Intrinsics.areEqual(this.orderUuid, args.orderUuid);
            }

            public int hashCode() {
                return (((((this.uiCurrencyPair.hashCode() * 31) + this.side.hashCode()) * 31) + this.inputMode.hashCode()) * 31) + this.orderUuid.hashCode();
            }

            public String toString() {
                return "Args(uiCurrencyPair=" + this.uiCurrencyPair + ", side=" + this.side + ", inputMode=" + this.inputMode + ", orderUuid=" + this.orderUuid + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.uiCurrencyPair, flags);
                dest.writeString(this.side.name());
                dest.writeString(this.inputMode.name());
                dest.writeSerializable(this.orderUuid);
            }

            public Args(UiCurrencyPair uiCurrencyPair, OrderSide side, CryptoInputMode inputMode, UUID orderUuid) {
                Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
                Intrinsics.checkNotNullParameter(side, "side");
                Intrinsics.checkNotNullParameter(inputMode, "inputMode");
                Intrinsics.checkNotNullParameter(orderUuid, "orderUuid");
                this.uiCurrencyPair = uiCurrencyPair;
                this.side = side;
                this.inputMode = inputMode;
                this.orderUuid = orderUuid;
            }

            public final UiCurrencyPair getUiCurrencyPair() {
                return this.uiCurrencyPair;
            }

            public final OrderSide getSide() {
                return this.side;
            }

            public final CryptoInputMode getInputMode() {
                return this.inputMode;
            }

            public final UUID getOrderUuid() {
                return this.orderUuid;
            }
        }

        /* compiled from: CryptoQuoteOrderFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderFragment;", "Lcom/robinhood/shared/trade/crypto/ui/quoteOrder/CryptoQuoteOrderFragment$Args;", "<init>", "()V", "DIALOG_RECURRING_HOOK_BOTTOM_SHEET", "", "ORDER_TYPE_SELECTOR_TOOLTIP", "TAG_ORDER_VALIDATION_ALERT", "TAG_MICROGRAM_ORDER_VALIDATION_ALERT", "TAG_FEE_DEF_BOTTOM_SHEET", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements FragmentWithArgsCompanion<CryptoQuoteOrderFragment, Args> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
            public Args getArgs(CryptoQuoteOrderFragment cryptoQuoteOrderFragment) {
                return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoQuoteOrderFragment);
            }

            @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
            public CryptoQuoteOrderFragment newInstance(Args args) {
                return (CryptoQuoteOrderFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
            }

            @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
            public void setArgs(CryptoQuoteOrderFragment cryptoQuoteOrderFragment, Args args) {
                FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoQuoteOrderFragment, args);
            }
        }
    }
