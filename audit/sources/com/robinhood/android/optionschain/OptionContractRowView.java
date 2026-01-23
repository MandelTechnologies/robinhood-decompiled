package com.robinhood.android.optionschain;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.common.view.AnimatedRhTextView;
import com.robinhood.android.designsystem.row.RdsDataRowView;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.optionchain.chainsettings.OptionChainFallbackMetrics;
import com.robinhood.android.optionchain.chainsettings.OptionChainMetricValueConverter;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.optionschain.OptionContractRowView;
import com.robinhood.android.optionschain.OptionInstrumentRowModel;
import com.robinhood.android.optionschain.databinding.IncludeOptionContractRowBinding;
import com.robinhood.android.optionschain.extensions.UiOptionPositionCounts2;
import com.robinhood.android.optionschain.view.OptionInstrumentRowModels;
import com.robinhood.android.performancelogger.PerformanceLogger;
import com.robinhood.android.util.style.ThemeAttributes;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p320db.OptionChainAvailableMetrics;
import com.robinhood.models.p320db.OptionInstrument;
import com.robinhood.models.p320db.OptionInstrumentQuote;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionStatisticsTradableState;
import com.robinhood.models.p355ui.OptionWatchlistItemState;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionPositionCounts;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.PerformanceMetricEventData;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.ScarletOverlay;
import com.robinhood.scarlet.util.resource.ResourceReferences4;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.utils.Either;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.math.BigDecimals7;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import okio.ByteString;
import p479j$.time.Instant;

/* compiled from: OptionContractRowView.kt */
@Metadata(m3635d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 H2\u00020\u0001:\u0003FGHB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010.\u001a\u00020\u001bJ\f\u0010/\u001a\u00020,*\u00020!H\u0002J\f\u00100\u001a\u00020,*\u00020!H\u0002J\u0014\u00101\u001a\u000202*\u00020!2\u0006\u00103\u001a\u000204H\u0002J\u0014\u00105\u001a\u00020,*\u00020!2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u001c\u00106\u001a\u00020,*\u00020!2\u0006\u00107\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\u0010\u00108\u001a\u00020%2\u0006\u00109\u001a\u00020:H\u0017J\b\u0010;\u001a\u00020%H\u0016J \u0010<\u001a\u00020,2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u00107\u001a\u00020%2\u0006\u0010=\u001a\u00020>H\u0002J\f\u0010?\u001a\u00020,*\u00020!H\u0002J\u0006\u0010@\u001a\u00020,J\b\u0010A\u001a\u00020,H\u0002J\b\u0010B\u001a\u00020,H\u0002J\b\u0010C\u001a\u00020,H\u0002J\b\u0010D\u001a\u00020,H\u0002J\b\u0010E\u001a\u00020,H\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020%8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006I"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionContractRowView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "performanceLogger", "Lcom/robinhood/android/performancelogger/PerformanceLogger;", "getPerformanceLogger", "()Lcom/robinhood/android/performancelogger/PerformanceLogger;", "setPerformanceLogger", "(Lcom/robinhood/android/performancelogger/PerformanceLogger;)V", "binding", "Lcom/robinhood/android/optionschain/databinding/IncludeOptionContractRowBinding;", "getBinding", "()Lcom/robinhood/android/optionschain/databinding/IncludeOptionContractRowBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "optionlistViewCallbacks", "Lcom/robinhood/android/optionschain/OptionContractRowView$OptionChainListViewCallbacks;", "lastBoundOptionInstrumentId", "Ljava/util/UUID;", "callbacks", "Lcom/robinhood/android/optionschain/OptionContractRowView$Callbacks;", "viewModel", "Lcom/robinhood/android/optionschain/OptionInstrumentRowModel;", "gestureDetector", "Landroid/view/GestureDetector;", "value", "", "bottomDividerVisible", "getBottomDividerVisible", "()Z", "setBottomDividerVisible", "(Z)V", "bind", "", "model", "listViewCallbacks", "bindToViews", "bindCustomizedMetrics", "getChainMetricValue", "", "metric", "Lcom/robinhood/models/db/OptionChainAvailableMetrics$Metric;", "setOnClickListeners", "onPricePillClickWhenMultilegAvailable", "selected", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "performClick", "onSelectRowTapped", "optionLegBundle", "Lcom/robinhood/models/ui/OptionLegBundle;", "setViewColorAttributes", "showRipple", "logOptionInstrumentRowTap", "logOptionInstrumentPrimaryTap", "logOptionInstrumentSecondaryTap", "logOptionInstrumentRowSelect", "logOptionInstrumentRowDeselect", "Callbacks", "OptionChainListViewCallbacks", "Companion", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class OptionContractRowView extends Hammer_OptionContractRowView {
    private static final ThemedResourceReference<ColorStateList> DISABLED_TEXT_COLOR_REFERENCE;
    private static final ThemedResourceReference<ColorStateList> SELECTED_TEXT_COLOR_REFERENCE;
    private static final ThemedResourceReference<ColorStateList> STALE_TEXT_COLOR_REFERENCE;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private Callbacks callbacks;
    public EventLogger eventLogger;
    private final GestureDetector gestureDetector;
    private UUID lastBoundOptionInstrumentId;
    private OptionChainListViewCallbacks optionlistViewCallbacks;
    public PerformanceLogger performanceLogger;
    private OptionInstrumentRowModel viewModel;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(OptionContractRowView.class, "binding", "getBinding()Lcom/robinhood/android/optionschain/databinding/IncludeOptionContractRowBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: OptionContractRowView.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H&¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H&¢\u0006\u0004\b\u001d\u0010\u001cJ\u0019\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH&¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\"\u0010\u0006J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b#\u0010\u0006¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionContractRowView$Callbacks;", "", "Lcom/robinhood/models/ui/OptionLegBundle;", "optionLegBundle", "", "onLaunchSingleLegOrder", "(Lcom/robinhood/models/ui/OptionLegBundle;)V", "j$/time/Instant", "selloutTime", "showTradeOnExpirationAfterSelloutDialog", "(Lj$/time/Instant;)V", "Lcom/robinhood/models/ui/OptionStatisticsTradableState;", "tradableState", "", "hasMarketdata", "onLaunchStatisticsDetail", "(Lcom/robinhood/models/ui/OptionLegBundle;Lcom/robinhood/models/ui/OptionStatisticsTradableState;Z)V", "Lcom/robinhood/models/db/OptionInstrument;", "optionInstrument", "Lcom/robinhood/models/db/OrderSide;", "side", "Lcom/robinhood/models/ui/UiOptionChain;", "uiOptionChain", "Lcom/robinhood/models/ui/OptionWatchlistItemState;", "state", "onWatchlistAddOrRemove", "(Lcom/robinhood/models/db/OptionInstrument;Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/models/ui/UiOptionChain;Lcom/robinhood/models/ui/OptionWatchlistItemState;)V", "showWatchlistAddOrRemovePcoErrorDialog", "()V", "dismissSwitchFocusedToSbsTooltip", "Lcom/robinhood/models/db/OptionChain$UnderlyingType;", "underlyingType", "showDiscoverZeroDteBottomSheet", "(Lcom/robinhood/models/db/OptionChain$UnderlyingType;)V", "onMultiLegAdd", "onMultiLegRemove", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void dismissSwitchFocusedToSbsTooltip();

        void onLaunchSingleLegOrder(OptionLegBundle optionLegBundle);

        void onLaunchStatisticsDetail(OptionLegBundle optionLegBundle, OptionStatisticsTradableState tradableState, boolean hasMarketdata);

        void onMultiLegAdd(OptionLegBundle optionLegBundle);

        void onMultiLegRemove(OptionLegBundle optionLegBundle);

        void onWatchlistAddOrRemove(OptionInstrument optionInstrument, OrderSide side, UiOptionChain uiOptionChain, OptionWatchlistItemState state);

        void showDiscoverZeroDteBottomSheet(OptionChain.UnderlyingType underlyingType);

        void showTradeOnExpirationAfterSelloutDialog(Instant selloutTime);

        void showWatchlistAddOrRemovePcoErrorDialog();
    }

    /* compiled from: OptionContractRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionContractRowView$OptionChainListViewCallbacks;", "", "dismissSelloutSnackbar", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface OptionChainListViewCallbacks {
        void dismissSelloutSnackbar();
    }

    /* compiled from: OptionContractRowView.kt */
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
            int[] iArr2 = new int[OptionInstrumentRowModel.PcoOptionUpsellType.values().length];
            try {
                iArr2[OptionInstrumentRowModel.PcoOptionUpsellType.DISCOVER_ZERO_DTE_BOTTOM_SHEET.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OptionInstrumentRowModel.PcoOptionUpsellType.TRADE_ON_EXPIRATION_AFTER_SELLOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionContractRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, OptionContractRowView2.INSTANCE);
        this.gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() { // from class: com.robinhood.android.optionschain.OptionContractRowView$gestureDetector$1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent e) {
                OptionContractRowView.Callbacks callbacks;
                Intrinsics.checkNotNullParameter(e, "e");
                OptionInstrumentRowModel optionInstrumentRowModel = this.this$0.viewModel;
                if (optionInstrumentRowModel == null || (callbacks = this.this$0.callbacks) == null) {
                    return false;
                }
                if (!optionInstrumentRowModel.getIsPco() && optionInstrumentRowModel.getUiOptionChain() != null) {
                    callbacks.onWatchlistAddOrRemove(optionInstrumentRowModel.getOptionInstrument(), optionInstrumentRowModel.getOptionConfigurationBundle().getOptionSide(), optionInstrumentRowModel.getUiOptionChain(), optionInstrumentRowModel.getWatchlistItemState());
                    return true;
                }
                callbacks.showWatchlistAddOrRemovePcoErrorDialog();
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onSingleTapConfirmed(MotionEvent e) {
                Intrinsics.checkNotNullParameter(e, "e");
                this.this$0.performClick();
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public boolean onSingleTapUp(MotionEvent e) {
                Intrinsics.checkNotNullParameter(e, "e");
                this.this$0.showRipple();
                return true;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public void onShowPress(MotionEvent e) {
                Intrinsics.checkNotNullParameter(e, "e");
                this.this$0.showRipple();
            }
        });
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

    public final PerformanceLogger getPerformanceLogger() {
        PerformanceLogger performanceLogger = this.performanceLogger;
        if (performanceLogger != null) {
            return performanceLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("performanceLogger");
        return null;
    }

    public final void setPerformanceLogger(PerformanceLogger performanceLogger) {
        Intrinsics.checkNotNullParameter(performanceLogger, "<set-?>");
        this.performanceLogger = performanceLogger;
    }

    static {
        ResourceType.COLOR_STATE_LIST color_state_list = ResourceType.COLOR_STATE_LIST.INSTANCE;
        DISABLED_TEXT_COLOR_REFERENCE = new ThemedResourceReference<>(color_state_list, C20690R.attr.colorForeground3);
        STALE_TEXT_COLOR_REFERENCE = new ThemedResourceReference<>(color_state_list, C20690R.attr.colorForeground2);
        SELECTED_TEXT_COLOR_REFERENCE = new ThemedResourceReference<>(color_state_list, C20690R.attr.colorBackground1);
    }

    private final IncludeOptionContractRowBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IncludeOptionContractRowBinding) value;
    }

    public final boolean getBottomDividerVisible() {
        View optionContractBottomDivider = getBinding().optionContractBottomDivider;
        Intrinsics.checkNotNullExpressionValue(optionContractBottomDivider, "optionContractBottomDivider");
        return optionContractBottomDivider.getVisibility() == 0;
    }

    public final void setBottomDividerVisible(boolean z) {
        View optionContractBottomDivider = getBinding().optionContractBottomDivider;
        Intrinsics.checkNotNullExpressionValue(optionContractBottomDivider, "optionContractBottomDivider");
        optionContractBottomDivider.setVisibility(z ? 0 : 8);
    }

    public final void bind(OptionInstrumentRowModel model, Callbacks callbacks, OptionChainListViewCallbacks listViewCallbacks) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(listViewCallbacks, "listViewCallbacks");
        this.optionlistViewCallbacks = listViewCallbacks;
        bindToViews(model);
        setOnClickListeners(model, callbacks);
        setViewColorAttributes(model);
    }

    private final void bindToViews(OptionInstrumentRowModel optionInstrumentRowModel) {
        ScarletOverlay scarletOverlay;
        BigDecimal todaysPercentChange;
        CharSequence errorMsg;
        int i;
        this.lastBoundOptionInstrumentId = optionInstrumentRowModel.getOptionInstrument().getId();
        RhTextView rhTextView = getBinding().optionContractStrikePriceTxt;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        rhTextView.setText(OptionInstrumentRowModels.getStrikeValueString(optionInstrumentRowModel, resources));
        OptionInstrumentQuote optionInstrumentQuote = optionInstrumentRowModel.getOptionInstrumentQuote();
        String positionCountDeltaString = null;
        Boolean boolValueOf = optionInstrumentQuote != null ? Boolean.valueOf(optionInstrumentQuote.isStaleForUi()) : null;
        String contractPriceDisplayString = optionInstrumentRowModel.getContractPriceDisplayString();
        if (contractPriceDisplayString == null) {
            contractPriceDisplayString = "    -    ";
        }
        CharSequence text = getBinding().optionContractPriceDeltaTxt.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        text.length();
        getBinding().optionContractPriceTxt.setVisibilityText(contractPriceDisplayString, false);
        if (boolValueOf != null) {
            getBinding().optionContractPriceTxt.setStale(boolValueOf.booleanValue());
        }
        AppCompatImageView optionContractPlusBtn = getBinding().optionContractPlusBtn;
        Intrinsics.checkNotNullExpressionValue(optionContractPlusBtn, "optionContractPlusBtn");
        AnimatedRhTextView optionContractPriceTxt = getBinding().optionContractPriceTxt;
        Intrinsics.checkNotNullExpressionValue(optionContractPriceTxt, "optionContractPriceTxt");
        optionContractPlusBtn.setVisibility(optionContractPriceTxt.getVisibility() == 0 ? 0 : 8);
        RhTextView rhTextView2 = getBinding().optionContractPriceDeltaTxt;
        String contractPriceDeltaPercentageString = optionInstrumentRowModel.getContractPriceDeltaPercentageString();
        rhTextView2.setText(contractPriceDeltaPercentageString != null ? ViewsKt.getString(this, C24135R.string.option_order_contract_quote_delta_txt, contractPriceDeltaPercentageString) : null);
        if (boolValueOf != null) {
            getBinding().optionContractPriceDeltaTxt.setStale(boolValueOf.booleanValue());
        }
        bindCustomizedMetrics(optionInstrumentRowModel);
        if (optionInstrumentRowModel.getFeatureSet().contains(OptionChainLaunchMode.Feature.ACHROMATIC)) {
            scarletOverlay = AchromaticOverlay.INSTANCE;
        } else {
            OptionInstrumentQuote optionInstrumentQuote2 = optionInstrumentRowModel.getOptionInstrumentQuote();
            if (optionInstrumentQuote2 == null || (todaysPercentChange = optionInstrumentQuote2.getTodaysPercentChange()) == null || !BigDecimals7.isNegative(todaysPercentChange)) {
                scarletOverlay = optionInstrumentRowModel.getOptionInstrumentQuote() != null ? DirectionOverlay.POSITIVE : null;
            } else {
                scarletOverlay = DirectionOverlay.NEGATIVE;
            }
        }
        if (scarletOverlay != null) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), scarletOverlay, null, 2, null);
        }
        OrderSide optionSide = optionInstrumentRowModel.getOptionConfigurationBundle().getOptionSide();
        RhTextView optionContractMessageTxt = getBinding().optionContractMessageTxt;
        Intrinsics.checkNotNullExpressionValue(optionContractMessageTxt, "optionContractMessageTxt");
        OptionInstrumentRowModel.GrayedOutRowDisabledState grayedOutRowDisabledState = optionInstrumentRowModel.getGrayedOutRowDisabledState();
        if (grayedOutRowDisabledState != null) {
            Resources resources2 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            errorMsg = grayedOutRowDisabledState.getErrorMsg(resources2, optionSide);
        } else {
            errorMsg = null;
        }
        TextViewsKt.setVisibilityText(optionContractMessageTxt, errorMsg);
        AppCompatImageView appCompatImageView = getBinding().optionContractPlusBtn;
        appCompatImageView.setSelected(optionInstrumentRowModel.getContractSelected());
        if (optionInstrumentRowModel.getContractSelected()) {
            i = C20690R.drawable.ic_rds_checkmark_16dp;
        } else {
            i = C20690R.drawable.ic_rds_plus_16dp;
        }
        appCompatImageView.setImageResource(i);
        getBinding().optionContractPriceTxt.setSelected(optionInstrumentRowModel.getContractSelected());
        RdsDataRowView optionContractMetricOneTxt = getBinding().optionContractMetricOneTxt;
        Intrinsics.checkNotNullExpressionValue(optionContractMetricOneTxt, "optionContractMetricOneTxt");
        optionContractMetricOneTxt.setVisibility(optionInstrumentRowModel.getGrayedOutRowDisabledState() != null ? 4 : 0);
        RdsDataRowView optionContractMetricTwoTxt = getBinding().optionContractMetricTwoTxt;
        Intrinsics.checkNotNullExpressionValue(optionContractMetricTwoTxt, "optionContractMetricTwoTxt");
        optionContractMetricTwoTxt.setVisibility(optionInstrumentRowModel.getGrayedOutRowDisabledState() != null ? 4 : 0);
        RhTextView optionContractPositionCountTxt = getBinding().optionContractPositionCountTxt;
        Intrinsics.checkNotNullExpressionValue(optionContractPositionCountTxt, "optionContractPositionCountTxt");
        UiOptionPositionCounts optionPositionCounts = optionInstrumentRowModel.getOptionPositionCounts();
        if (optionPositionCounts != null) {
            Resources resources3 = getResources();
            Intrinsics.checkNotNullExpressionValue(resources3, "getResources(...)");
            positionCountDeltaString = UiOptionPositionCounts2.getPositionCountDeltaString(optionPositionCounts, resources3);
        }
        TextViewsKt.setVisibilityText(optionContractPositionCountTxt, positionCountDeltaString);
        AppCompatImageView addedToWatchlistCheck = getBinding().addedToWatchlistCheck;
        Intrinsics.checkNotNullExpressionValue(addedToWatchlistCheck, "addedToWatchlistCheck");
        addedToWatchlistCheck.setVisibility(optionInstrumentRowModel.getWatchlistItemState() == OptionWatchlistItemState.ADDED ? 0 : 8);
    }

    private final void bindCustomizedMetrics(OptionInstrumentRowModel optionInstrumentRowModel) {
        OptionChainAvailableMetrics.Metric selectedMetricOne;
        OptionChainAvailableMetrics.Metric selectedMetricTwo;
        int i = WhenMappings.$EnumSwitchMapping$0[optionInstrumentRowModel.getOptionConfigurationBundle().getOptionSide().ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (optionInstrumentRowModel.getSellSelectedMetrics() == null) {
                Resources resources = getContext().getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                Tuples2<OptionChainAvailableMetrics.Metric, OptionChainAvailableMetrics.Metric> fallbackSelectedMetric = OptionChainFallbackMetrics.getFallbackSelectedMetric(resources, new Either.Left(OrderSide.SELL));
                selectedMetricOne = fallbackSelectedMetric.getFirst();
                selectedMetricTwo = fallbackSelectedMetric.getSecond();
            } else {
                selectedMetricOne = optionInstrumentRowModel.getSellSelectedMetrics().getSelectedMetricOne();
                selectedMetricTwo = optionInstrumentRowModel.getSellSelectedMetrics().getSelectedMetricTwo();
            }
        } else if (optionInstrumentRowModel.getBuySelectedMetrics() == null) {
            Resources resources2 = getContext().getResources();
            Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
            Tuples2<OptionChainAvailableMetrics.Metric, OptionChainAvailableMetrics.Metric> fallbackSelectedMetric2 = OptionChainFallbackMetrics.getFallbackSelectedMetric(resources2, new Either.Left(OrderSide.BUY));
            selectedMetricOne = fallbackSelectedMetric2.getFirst();
            selectedMetricTwo = fallbackSelectedMetric2.getSecond();
        } else {
            selectedMetricOne = optionInstrumentRowModel.getBuySelectedMetrics().getSelectedMetricOne();
            selectedMetricTwo = optionInstrumentRowModel.getBuySelectedMetrics().getSelectedMetricTwo();
        }
        getBinding().optionContractMetricOneTxt.setLabelText(selectedMetricOne.getMetricChainLabel());
        getBinding().optionContractMetricTwoTxt.setLabelText(selectedMetricTwo.getMetricChainLabel());
        getBinding().optionContractMetricOneTxt.setValueTextWrapContent(true);
        getBinding().optionContractMetricTwoTxt.setValueTextWrapContent(true);
        getBinding().optionContractMetricOneTxt.setValueText(getChainMetricValue(optionInstrumentRowModel, selectedMetricOne));
        getBinding().optionContractMetricTwoTxt.setValueText(getChainMetricValue(optionInstrumentRowModel, selectedMetricTwo));
    }

    private final String getChainMetricValue(OptionInstrumentRowModel optionInstrumentRowModel, OptionChainAvailableMetrics.Metric metric) {
        String chainMetricValue;
        return (metric.getMetricEnabled() && metric.isSupported() && (chainMetricValue = OptionChainMetricValueConverter.getChainMetricValue(metric.getMetricType(), optionInstrumentRowModel.getOptionInstrumentQuote(), optionInstrumentRowModel.getUnderlyingQuote(), optionInstrumentRowModel.getOptionConfigurationBundle().getOptionSide())) != null) ? chainMetricValue : ViewsKt.getString(this, C11048R.string.general_label_n_a_short);
    }

    private final void setOnClickListeners(final OptionInstrumentRowModel optionInstrumentRowModel, final Callbacks callbacks) {
        this.viewModel = optionInstrumentRowModel;
        this.callbacks = callbacks;
        if (optionInstrumentRowModel.getGrayedOutRowDisabledState() != null) {
            AppCompatImageView appCompatImageView = getBinding().optionContractPlusBtn;
            appCompatImageView.setClickable(false);
            appCompatImageView.setOnClickListener(null);
            AnimatedRhTextView animatedRhTextView = getBinding().optionContractPriceTxt;
            animatedRhTextView.setClickable(false);
            animatedRhTextView.setOnClickListener(null);
            Intrinsics.checkNotNull(animatedRhTextView);
            return;
        }
        if (optionInstrumentRowModel.getMultilegAvailable()) {
            final boolean zIsSelected = getBinding().optionContractPlusBtn.isSelected();
            AppCompatImageView optionContractPlusBtn = getBinding().optionContractPlusBtn;
            Intrinsics.checkNotNullExpressionValue(optionContractPlusBtn, "optionContractPlusBtn");
            OnClickListeners.onClick(optionContractPlusBtn, new Function0() { // from class: com.robinhood.android.optionschain.OptionContractRowView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionContractRowView.setOnClickListeners$lambda$7(callbacks, this, optionInstrumentRowModel, zIsSelected);
                }
            });
            AnimatedRhTextView optionContractPriceTxt = getBinding().optionContractPriceTxt;
            Intrinsics.checkNotNullExpressionValue(optionContractPriceTxt, "optionContractPriceTxt");
            OnClickListeners.onClick(optionContractPriceTxt, new Function0() { // from class: com.robinhood.android.optionschain.OptionContractRowView$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionContractRowView.setOnClickListeners$lambda$8(callbacks, this, optionInstrumentRowModel, zIsSelected);
                }
            });
            return;
        }
        if (optionInstrumentRowModel.getForceBottomSheetForL2()) {
            AppCompatImageView optionContractPlusBtn2 = getBinding().optionContractPlusBtn;
            Intrinsics.checkNotNullExpressionValue(optionContractPlusBtn2, "optionContractPlusBtn");
            OnClickListeners.onClick(optionContractPlusBtn2, new Function0() { // from class: com.robinhood.android.optionschain.OptionContractRowView$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionContractRowView.setOnClickListeners$lambda$9(callbacks, this, optionInstrumentRowModel);
                }
            });
            AnimatedRhTextView optionContractPriceTxt2 = getBinding().optionContractPriceTxt;
            Intrinsics.checkNotNullExpressionValue(optionContractPriceTxt2, "optionContractPriceTxt");
            OnClickListeners.onClick(optionContractPriceTxt2, new Function0() { // from class: com.robinhood.android.optionschain.OptionContractRowView$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return OptionContractRowView.setOnClickListeners$lambda$10(callbacks, this, optionInstrumentRowModel);
                }
            });
            return;
        }
        AppCompatImageView optionContractPlusBtn3 = getBinding().optionContractPlusBtn;
        Intrinsics.checkNotNullExpressionValue(optionContractPlusBtn3, "optionContractPlusBtn");
        OnClickListeners.onClick(optionContractPlusBtn3, new Function0() { // from class: com.robinhood.android.optionschain.OptionContractRowView$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionContractRowView.setOnClickListeners$lambda$11(callbacks, this, optionInstrumentRowModel);
            }
        });
        AnimatedRhTextView optionContractPriceTxt3 = getBinding().optionContractPriceTxt;
        Intrinsics.checkNotNullExpressionValue(optionContractPriceTxt3, "optionContractPriceTxt");
        OnClickListeners.onClick(optionContractPriceTxt3, new Function0() { // from class: com.robinhood.android.optionschain.OptionContractRowView$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionContractRowView.setOnClickListeners$lambda$12(callbacks, this, optionInstrumentRowModel);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setOnClickListeners$lambda$7(Callbacks callbacks, OptionContractRowView optionContractRowView, OptionInstrumentRowModel optionInstrumentRowModel, boolean z) {
        callbacks.dismissSwitchFocusedToSbsTooltip();
        OptionChainListViewCallbacks optionChainListViewCallbacks = optionContractRowView.optionlistViewCallbacks;
        if (optionChainListViewCallbacks != null) {
            optionChainListViewCallbacks.dismissSelloutSnackbar();
        }
        optionContractRowView.logOptionInstrumentSecondaryTap();
        optionContractRowView.onPricePillClickWhenMultilegAvailable(optionInstrumentRowModel, z, callbacks);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setOnClickListeners$lambda$8(Callbacks callbacks, OptionContractRowView optionContractRowView, OptionInstrumentRowModel optionInstrumentRowModel, boolean z) {
        callbacks.dismissSwitchFocusedToSbsTooltip();
        OptionChainListViewCallbacks optionChainListViewCallbacks = optionContractRowView.optionlistViewCallbacks;
        if (optionChainListViewCallbacks != null) {
            optionChainListViewCallbacks.dismissSelloutSnackbar();
        }
        optionContractRowView.logOptionInstrumentPrimaryTap();
        optionContractRowView.onPricePillClickWhenMultilegAvailable(optionInstrumentRowModel, z, callbacks);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setOnClickListeners$lambda$9(Callbacks callbacks, OptionContractRowView optionContractRowView, OptionInstrumentRowModel optionInstrumentRowModel) {
        callbacks.dismissSwitchFocusedToSbsTooltip();
        OptionChainListViewCallbacks optionChainListViewCallbacks = optionContractRowView.optionlistViewCallbacks;
        if (optionChainListViewCallbacks != null) {
            optionChainListViewCallbacks.dismissSelloutSnackbar();
        }
        optionContractRowView.logOptionInstrumentSecondaryTap();
        callbacks.onLaunchStatisticsDetail(optionInstrumentRowModel.getOptionLegBundle(), optionInstrumentRowModel.getTradableState(), optionInstrumentRowModel.getOptionInstrumentQuote() != null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setOnClickListeners$lambda$10(Callbacks callbacks, OptionContractRowView optionContractRowView, OptionInstrumentRowModel optionInstrumentRowModel) {
        callbacks.dismissSwitchFocusedToSbsTooltip();
        OptionChainListViewCallbacks optionChainListViewCallbacks = optionContractRowView.optionlistViewCallbacks;
        if (optionChainListViewCallbacks != null) {
            optionChainListViewCallbacks.dismissSelloutSnackbar();
        }
        optionContractRowView.logOptionInstrumentPrimaryTap();
        callbacks.onLaunchStatisticsDetail(optionInstrumentRowModel.getOptionLegBundle(), optionInstrumentRowModel.getTradableState(), optionInstrumentRowModel.getOptionInstrumentQuote() != null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setOnClickListeners$lambda$11(Callbacks callbacks, OptionContractRowView optionContractRowView, OptionInstrumentRowModel optionInstrumentRowModel) {
        callbacks.dismissSwitchFocusedToSbsTooltip();
        OptionChainListViewCallbacks optionChainListViewCallbacks = optionContractRowView.optionlistViewCallbacks;
        if (optionChainListViewCallbacks != null) {
            optionChainListViewCallbacks.dismissSelloutSnackbar();
        }
        optionContractRowView.logOptionInstrumentSecondaryTap();
        callbacks.onLaunchSingleLegOrder(optionInstrumentRowModel.getOptionLegBundle());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setOnClickListeners$lambda$12(Callbacks callbacks, OptionContractRowView optionContractRowView, OptionInstrumentRowModel optionInstrumentRowModel) {
        callbacks.dismissSwitchFocusedToSbsTooltip();
        OptionChainListViewCallbacks optionChainListViewCallbacks = optionContractRowView.optionlistViewCallbacks;
        if (optionChainListViewCallbacks != null) {
            optionChainListViewCallbacks.dismissSelloutSnackbar();
        }
        optionContractRowView.logOptionInstrumentPrimaryTap();
        callbacks.onLaunchSingleLegOrder(optionInstrumentRowModel.getOptionLegBundle());
        return Unit.INSTANCE;
    }

    private final void onPricePillClickWhenMultilegAvailable(OptionInstrumentRowModel optionInstrumentRowModel, boolean z, Callbacks callbacks) {
        OptionChainListViewCallbacks optionChainListViewCallbacks = this.optionlistViewCallbacks;
        if (optionChainListViewCallbacks != null) {
            optionChainListViewCallbacks.dismissSelloutSnackbar();
        }
        if (optionInstrumentRowModel.getTradableState().isSingleLegTradable()) {
            callbacks.onLaunchStatisticsDetail(optionInstrumentRowModel.getOptionLegBundle(), optionInstrumentRowModel.getTradableState(), optionInstrumentRowModel.getOptionInstrumentQuote() != null);
        } else {
            onSelectRowTapped(callbacks, z, optionInstrumentRowModel.getOptionLegBundle());
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.gestureDetector.onTouchEvent(event);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        Callbacks callbacks;
        super.performClick();
        OptionInstrumentRowModel optionInstrumentRowModel = this.viewModel;
        if (optionInstrumentRowModel == null || (callbacks = this.callbacks) == null) {
            return false;
        }
        if (optionInstrumentRowModel.getIsPcoAndPositionOpening()) {
            OptionInstrumentRowModel.PcoOptionUpsellType pcoOptionUpsellType = optionInstrumentRowModel.getPcoOptionUpsellType();
            int i = pcoOptionUpsellType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[pcoOptionUpsellType.ordinal()];
            if (i == 1) {
                UiOptionChain uiOptionChain = optionInstrumentRowModel.getUiOptionChain();
                callbacks.showDiscoverZeroDteBottomSheet(uiOptionChain != null ? uiOptionChain.getUnderlyingType() : null);
            } else {
                if (i != 2) {
                    return false;
                }
                callbacks.showTradeOnExpirationAfterSelloutDialog(optionInstrumentRowModel.getOptionInstrument().getSelloutDatetime());
            }
        } else {
            OptionChainListViewCallbacks optionChainListViewCallbacks = this.optionlistViewCallbacks;
            if (optionChainListViewCallbacks != null) {
                optionChainListViewCallbacks.dismissSelloutSnackbar();
            }
            logOptionInstrumentRowTap();
            callbacks.onLaunchStatisticsDetail(optionInstrumentRowModel.getOptionLegBundle(), optionInstrumentRowModel.getTradableState(), optionInstrumentRowModel.getOptionInstrumentQuote() != null);
        }
        return true;
    }

    private final void onSelectRowTapped(Callbacks callbacks, boolean selected, OptionLegBundle optionLegBundle) {
        if (selected) {
            callbacks.onMultiLegRemove(optionLegBundle);
            logOptionInstrumentRowDeselect();
        } else {
            callbacks.onMultiLegAdd(optionLegBundle);
            logOptionInstrumentRowSelect();
        }
    }

    private final void setViewColorAttributes(OptionInstrumentRowModel optionInstrumentRowModel) {
        ResourceReferences4 color_primary;
        boolean z = optionInstrumentRowModel.getGrayedOutRowDisabledState() != null;
        ThemedResourceReference<ColorStateList> text_color_primary = z ? DISABLED_TEXT_COLOR_REFERENCE : ThemeAttributes.INSTANCE.getTEXT_COLOR_PRIMARY();
        RhTextView optionContractStrikePriceTxt = getBinding().optionContractStrikePriceTxt;
        Intrinsics.checkNotNullExpressionValue(optionContractStrikePriceTxt, "optionContractStrikePriceTxt");
        ScarletManager2.overrideAttribute(optionContractStrikePriceTxt, android.R.attr.textColor, text_color_primary);
        RhTextView optionContractPositionCountTxt = getBinding().optionContractPositionCountTxt;
        Intrinsics.checkNotNullExpressionValue(optionContractPositionCountTxt, "optionContractPositionCountTxt");
        ScarletManager2.overrideAttribute(optionContractPositionCountTxt, android.R.attr.textColor, text_color_primary);
        ResourceReferences4 color_primary2 = z ? DISABLED_TEXT_COLOR_REFERENCE : ThemeAttributes.INSTANCE.getCOLOR_PRIMARY();
        AnimatedRhTextView optionContractPriceTxt = getBinding().optionContractPriceTxt;
        Intrinsics.checkNotNullExpressionValue(optionContractPriceTxt, "optionContractPriceTxt");
        ScarletManager2.overrideAttribute(optionContractPriceTxt, android.R.attr.backgroundTint, color_primary2);
        RhTextView optionContractPriceDeltaTxt = getBinding().optionContractPriceDeltaTxt;
        Intrinsics.checkNotNullExpressionValue(optionContractPriceDeltaTxt, "optionContractPriceDeltaTxt");
        ScarletManager2.overrideAttribute(optionContractPriceDeltaTxt, android.R.attr.textColor, color_primary2);
        AppCompatImageView optionContractPlusBtn = getBinding().optionContractPlusBtn;
        Intrinsics.checkNotNullExpressionValue(optionContractPlusBtn, "optionContractPlusBtn");
        ScarletManager2.overrideAttribute(optionContractPlusBtn, android.R.attr.backgroundTint, color_primary2);
        AppCompatImageView optionContractPlusBtn2 = getBinding().optionContractPlusBtn;
        Intrinsics.checkNotNullExpressionValue(optionContractPlusBtn2, "optionContractPlusBtn");
        if (optionInstrumentRowModel.getContractSelected()) {
            color_primary2 = SELECTED_TEXT_COLOR_REFERENCE;
        }
        ScarletManager2.overrideAttribute(optionContractPlusBtn2, android.R.attr.tint, color_primary2);
        AnimatedRhTextView optionContractPriceTxt2 = getBinding().optionContractPriceTxt;
        Intrinsics.checkNotNullExpressionValue(optionContractPriceTxt2, "optionContractPriceTxt");
        if (optionInstrumentRowModel.getContractSelected()) {
            color_primary = SELECTED_TEXT_COLOR_REFERENCE;
        } else if (z) {
            color_primary = DISABLED_TEXT_COLOR_REFERENCE;
        } else {
            OptionInstrumentQuote optionInstrumentQuote = optionInstrumentRowModel.getOptionInstrumentQuote();
            color_primary = (optionInstrumentQuote == null || !optionInstrumentQuote.isStaleForUi()) ? ThemeAttributes.INSTANCE.getCOLOR_PRIMARY() : STALE_TEXT_COLOR_REFERENCE;
        }
        ScarletManager2.overrideAttribute(optionContractPriceTxt2, android.R.attr.textColor, color_primary);
    }

    public final void showRipple() {
        final UUID uuid = this.lastBoundOptionInstrumentId;
        postDelayed(new Runnable() { // from class: com.robinhood.android.optionschain.OptionContractRowView$showRipple$$inlined$postDelayed$1
            @Override // java.lang.Runnable
            public final void run() {
                if (Intrinsics.areEqual(this.this$0.lastBoundOptionInstrumentId, uuid)) {
                    Views.dispatchDrawableHotspotChangedCompat(this.this$0, this.this$0.getWidth() / 2.0f, this.this$0.getHeight() / 2.0f);
                    this.this$0.setPressed(true);
                    final OptionContractRowView optionContractRowView = this.this$0;
                    optionContractRowView.postDelayed(new Runnable() { // from class: com.robinhood.android.optionschain.OptionContractRowView$showRipple$lambda$14$$inlined$postDelayed$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            optionContractRowView.setPressed(false);
                        }
                    }, 250L);
                }
            }
        }, 250L);
    }

    private final void logOptionInstrumentRowTap() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        ByteString byteString = null;
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.TAP_OPTION_INSTRUMENT_ROW, new Screen(Screen.Name.OPTION_CHAIN_EXPIRATION_PAGE, null, str, byteString, 14, defaultConstructorMarker), new Component(Component.ComponentType.OPTION_INSTRUMENT_ROW, str, byteString, 6, defaultConstructorMarker), null, null, false, 56, null);
        PerformanceLogger.DefaultImpls.beginMetric$default(getPerformanceLogger(), PerformanceMetricEventData.Name.OPTIONS_CONTRACT_BUY_BUTTON, null, null, null, 14, null);
    }

    private final void logOptionInstrumentPrimaryTap() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        ByteString byteString = null;
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.TAP_OPTION_INSTRUMENT_PRIMARY_BUTTON, new Screen(Screen.Name.OPTION_CHAIN_EXPIRATION_PAGE, null, str, byteString, 14, defaultConstructorMarker), new Component(Component.ComponentType.OPTION_INSTRUMENT_ROW, str, byteString, 6, defaultConstructorMarker), null, null, false, 56, null);
    }

    private final void logOptionInstrumentSecondaryTap() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        ByteString byteString = null;
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.TAP_OPTION_INSTRUMENT_SECONDARY_BUTTON, new Screen(Screen.Name.OPTION_CHAIN_EXPIRATION_PAGE, null, str, byteString, 14, defaultConstructorMarker), new Component(Component.ComponentType.OPTION_INSTRUMENT_ROW, str, byteString, 6, defaultConstructorMarker), null, null, false, 56, null);
    }

    private final void logOptionInstrumentRowSelect() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        ByteString byteString = null;
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.SELECT, new Screen(Screen.Name.OPTION_CHAIN_EXPIRATION_PAGE, null, str, byteString, 14, defaultConstructorMarker), new Component(Component.ComponentType.OPTION_INSTRUMENT_ROW, str, byteString, 6, defaultConstructorMarker), null, null, false, 56, null);
    }

    private final void logOptionInstrumentRowDeselect() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str = null;
        ByteString byteString = null;
        EventLogger.DefaultImpls.logTap$default(getEventLogger(), UserInteractionEventData.Action.DESELECT, new Screen(Screen.Name.OPTION_CHAIN_EXPIRATION_PAGE, null, str, byteString, 14, defaultConstructorMarker), new Component(Component.ComponentType.OPTION_INSTRUMENT_ROW, str, byteString, 6, defaultConstructorMarker), null, null, false, 56, null);
    }

    /* compiled from: OptionContractRowView.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\fH\u0096\u0001R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionContractRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/optionschain/OptionContractRowView;", "<init>", "()V", "DISABLED_TEXT_COLOR_REFERENCE", "Lcom/robinhood/scarlet/util/resource/ThemedResourceReference;", "Landroid/content/res/ColorStateList;", "STALE_TEXT_COLOR_REFERENCE", "SELECTED_TEXT_COLOR_REFERENCE", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<OptionContractRowView> {
        private final /* synthetic */ Inflater<OptionContractRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public OptionContractRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (OptionContractRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C24135R.layout.include_option_contract_row);
        }
    }
}
