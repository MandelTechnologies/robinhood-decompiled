package com.robinhood.android.equitydetail.p123ui.earnings;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.LogOnceAnalytics;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.databinding.IncludeEarningsDataViewBinding;
import com.robinhood.android.equitydetail.p123ui.EarningsViewData;
import com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView;
import com.robinhood.android.equitydetail.p123ui.earnings.EarningsGraph;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.equities.models.instrumentdetails.p380db.Earning;
import com.robinhood.shared.equities.models.instrumentdetails.p381ui.UiEarnings;
import com.robinhood.utils.android.C41827R;
import com.robinhood.utils.datetime.LocalDates4;
import com.robinhood.utils.datetime.format.MonthDayFormatter;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.color.ThemeColors;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import org.threeten.extra.AmPm;
import org.threeten.extra.YearQuarter;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneOffset;
import p479j$.time.format.DateTimeFormatter;

/* compiled from: EarningsDataView.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \\2\u00020\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0001\\B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J1\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010#\u001a\u00020\"2\b\b\u0001\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J!\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&*\u00020\u00052\u0006\u0010%\u001a\u00020\u0011H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u000e2\b\b\u0001\u0010!\u001a\u00020 ¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u000eH\u0014¢\u0006\u0004\b,\u0010\u001fJ\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u0005H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u000eH\u0016¢\u0006\u0004\b0\u0010\u001fR\"\u00102\u001a\u0002018\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001a\u00109\u001a\u0002088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R$\u0010>\u001a\u0004\u0018\u00010=8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010D\u001a\u00020 8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010+R\u001b\u0010N\u001a\u00020I8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\"\u0010P\u001a\u00020O8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001b\u0010[\u001a\u00020V8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z¨\u0006]"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/earnings/EarningsDataView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView;", "Lcom/robinhood/android/common/util/UiCallbacks$Clearable;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/android/equitydetail/ui/EarningsViewData;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/robinhood/shared/equities/models/instrumentdetails/ui/UiEarnings;", "earnings", "", "bindBrokebackEarnings", "(Lcom/robinhood/shared/equities/models/instrumentdetails/ui/UiEarnings;)V", "Landroid/content/res/Resources;", "res", "Lorg/threeten/extra/AmPm;", "timing", "", "getTimingString", "(Landroid/content/res/Resources;Lorg/threeten/extra/AmPm;)Ljava/lang/String;", "j$/time/LocalDate", "reportDate", "", TransitionReason.MICRODEPOSIT_VERIFIED, "getAvailabilityString", "(Landroid/content/res/Resources;Lj$/time/LocalDate;Ljava/lang/String;Z)Ljava/lang/String;", "onEpsClicked", "()V", "", ResourceTypes.COLOR, "Landroid/graphics/drawable/Drawable;", "getEpsCircle", "(I)Landroid/graphics/drawable/Drawable;", "resources", "", "Lcom/robinhood/android/equitydetail/ui/earnings/EarningsGraph$Item;", "getGraphItems", "(Lcom/robinhood/android/equitydetail/ui/EarningsViewData;Landroid/content/res/Resources;)Ljava/util/List;", "setColor", "(I)V", "onFinishInflate", "state", "bind", "(Lcom/robinhood/android/equitydetail/ui/EarningsViewData;)V", "clear", "Lcom/robinhood/android/navigation/Navigator;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "componentType", "Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "getComponentType", "()Lcom/robinhood/rosetta/eventlogging/Component$ComponentType;", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView$Callbacks;", "analyticsCallbacks", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView$Callbacks;", "getAnalyticsCallbacks", "()Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView$Callbacks;", "setAnalyticsCallbacks", "(Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpView$Callbacks;)V", "themeColor", "I", "getThemeColor", "()I", "setThemeColor", "Lcom/robinhood/android/equitydetail/databinding/IncludeEarningsDataViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getBinding", "()Lcom/robinhood/android/equitydetail/databinding/IncludeEarningsDataViewBinding;", "binding", "Lcom/robinhood/analytics/AnalyticsLogger;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "Lcom/robinhood/analytics/LogOnceAnalytics;", "logOnceAnalytics$delegate", "Lkotlin/Lazy;", "getLogOnceAnalytics", "()Lcom/robinhood/analytics/LogOnceAnalytics;", "logOnceAnalytics", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class EarningsDataView extends Hammer_EarningsDataView implements LoggableSdpView, UiCallbacks.Clearable, Bindable<EarningsViewData> {
    public AnalyticsLogger analytics;
    private LoggableSdpView.Callbacks analyticsCallbacks;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final Component.ComponentType componentType;

    /* renamed from: logOnceAnalytics$delegate, reason: from kotlin metadata */
    private final Lazy logOnceAnalytics;
    public Navigator navigator;
    private int themeColor;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EarningsDataView.class, "binding", "getBinding()Lcom/robinhood/android/equitydetail/databinding/IncludeEarningsDataViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EarningsDataView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CallButtonType.values().length];
            try {
                iArr[CallButtonType.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CallButtonType.JOIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CallButtonType.REPLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AmPm.values().length];
            try {
                iArr2[AmPm.AM.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AmPm.PM.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView, android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        LoggableSdpView.DefaultImpls.onViewAttachedToWindow(this, view);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView, android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        LoggableSdpView.DefaultImpls.onViewDetachedFromWindow(this, view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningsDataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.componentType = Component.ComponentType.EARNINGS_SECTION;
        this.themeColor = -1;
        this.binding = ViewBinding5.viewBinding(this, EarningsDataView3.INSTANCE);
        this.logOnceAnalytics = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.equitydetail.ui.earnings.EarningsDataView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EarningsDataView.logOnceAnalytics_delegate$lambda$0(this.f$0);
            }
        });
        int[] EarningsDataView = C15314R.styleable.EarningsDataView;
        Intrinsics.checkNotNullExpressionValue(EarningsDataView, "EarningsDataView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, EarningsDataView, 0, 0);
        this.themeColor = typedArrayObtainStyledAttributes.getColor(C15314R.styleable.EarningsDataView_edv_color, ThemeColors.getThemeColor(context, C20690R.attr.colorPrimary));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView
    public Component.ComponentType getComponentType() {
        return this.componentType;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView
    public LoggableSdpView.Callbacks getAnalyticsCallbacks() {
        return this.analyticsCallbacks;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpView
    public void setAnalyticsCallbacks(LoggableSdpView.Callbacks callbacks) {
        this.analyticsCallbacks = callbacks;
    }

    public final int getThemeColor() {
        return this.themeColor;
    }

    public final void setThemeColor(int i) {
        this.themeColor = i;
    }

    private final IncludeEarningsDataViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (IncludeEarningsDataViewBinding) value;
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

    private final LogOnceAnalytics getLogOnceAnalytics() {
        return (LogOnceAnalytics) this.logOnceAnalytics.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LogOnceAnalytics logOnceAnalytics_delegate$lambda$0(EarningsDataView earningsDataView) {
        return new LogOnceAnalytics(earningsDataView.getAnalytics());
    }

    public final void setColor(int color) {
        this.themeColor = color;
        Drawable epsCircle = getEpsCircle(color);
        Drawable epsCircle2 = getEpsCircle(color);
        IncludeEarningsDataViewBinding binding = getBinding();
        binding.earningsActualEpsLabelTxt.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, epsCircle, (Drawable) null);
        binding.earningsEstimatedEpsLabelTxt.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, epsCircle2, (Drawable) null);
        binding.earningsEstimatedEpsLabelTxt.getCompoundDrawables()[2].setAlpha(MathKt.roundToInt(102.0f));
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        RhTextView earningsEstimatedEpsLabelTxt = getBinding().earningsEstimatedEpsLabelTxt;
        Intrinsics.checkNotNullExpressionValue(earningsEstimatedEpsLabelTxt, "earningsEstimatedEpsLabelTxt");
        OnClickListeners.onClick(earningsEstimatedEpsLabelTxt, new C154761(this));
        RhTextView earningsActualEpsTxt = getBinding().earningsActualEpsTxt;
        Intrinsics.checkNotNullExpressionValue(earningsActualEpsTxt, "earningsActualEpsTxt");
        OnClickListeners.onClick(earningsActualEpsTxt, new C154772(this));
        setColor(this.themeColor);
    }

    /* compiled from: EarningsDataView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.earnings.EarningsDataView$onFinishInflate$1 */
    /* loaded from: classes3.dex */
    /* synthetic */ class C154761 extends FunctionReferenceImpl implements Function0<Unit> {
        C154761(Object obj) {
            super(0, obj, EarningsDataView.class, "onEpsClicked", "onEpsClicked()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((EarningsDataView) this.receiver).onEpsClicked();
        }
    }

    /* compiled from: EarningsDataView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.earnings.EarningsDataView$onFinishInflate$2 */
    /* loaded from: classes3.dex */
    /* synthetic */ class C154772 extends FunctionReferenceImpl implements Function0<Unit> {
        C154772(Object obj) {
            super(0, obj, EarningsDataView.class, "onEpsClicked", "onEpsClicked()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((EarningsDataView) this.receiver).onEpsClicked();
        }
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(EarningsViewData state) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(state, "state");
        EarningsGraph earningsGraph = getBinding().earningsGraph;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        earningsGraph.setItems(getGraphItems(state, resources));
        bindBrokebackEarnings(((EarningsViewData.Brokeback) state).getEarnings());
    }

    private final void bindBrokebackEarnings(UiEarnings earnings) throws Resources.NotFoundException {
        final CallButtonType callButtonType;
        IncludeEarningsDataViewBinding binding = getBinding();
        Earning mostRecentEarning = earnings.getMostRecentEarning();
        if (mostRecentEarning == null) {
            return;
        }
        Earning.Eps eps = mostRecentEarning.getEps();
        Earning.Report report = mostRecentEarning.getReport();
        String timingString = null;
        LocalDate date = report != null ? report.getDate() : null;
        AmPm timing = report != null ? report.getTiming() : null;
        if ((eps != null ? eps.getEstimate() : null) != null) {
            RhTextView rhTextView = binding.earningsEstimatedEpsTxt;
            NumberFormatter priceFormat = Formats.getPriceFormat();
            BigDecimal estimate = eps.getEstimate();
            Intrinsics.checkNotNull(estimate);
            rhTextView.setText(priceFormat.format(estimate));
        } else {
            binding.earningsEstimatedEpsTxt.setText(C41827R.string.general_label_n_a);
        }
        if ((eps != null ? eps.getActual() : null) != null) {
            RhTextView rhTextView2 = binding.earningsActualEpsTxt;
            NumberFormatter priceFormat2 = Formats.getPriceFormat();
            BigDecimal actual = eps.getActual();
            Intrinsics.checkNotNull(actual);
            rhTextView2.setText(priceFormat2.format(actual));
        } else if (date != null) {
            Resources resources = getResources();
            if (timing != null) {
                Intrinsics.checkNotNull(resources);
                timingString = getTimingString(resources, timing);
            }
            Intrinsics.checkNotNull(resources);
            binding.earningsActualEpsTxt.setText(getAvailabilityString(resources, date, timingString, report.getVerified()));
        } else {
            binding.earningsActualEpsTxt.setText(C41827R.string.general_label_n_a);
        }
        Instant instantNow = Instant.now();
        Intrinsics.checkNotNull(instantNow);
        boolean zShouldShowPreviewBtn = mostRecentEarning.shouldShowPreviewBtn(instantNow);
        boolean zShouldShowJoinBtn = mostRecentEarning.shouldShowJoinBtn(instantNow);
        boolean zShouldShowReplayBtn = mostRecentEarning.shouldShowReplayBtn(instantNow);
        if (!zShouldShowPreviewBtn && !zShouldShowJoinBtn && !zShouldShowReplayBtn) {
            binding.earningsActionBtn.setVisibility(8);
            return;
        }
        Earning.Call call = mostRecentEarning.getCall();
        if (zShouldShowPreviewBtn) {
            callButtonType = CallButtonType.PREVIEW;
        } else if (zShouldShowJoinBtn) {
            callButtonType = CallButtonType.JOIN;
        } else {
            callButtonType = CallButtonType.REPLAY;
        }
        if (call != null) {
            final String broadcastUrl = call.getBroadcastUrl();
            String replayUrl = call.getReplayUrl();
            int i = WhenMappings.$EnumSwitchMapping$0[callButtonType.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                broadcastUrl = replayUrl;
            }
            final RdsTextButton rdsTextButton = binding.earningsActionBtn;
            rdsTextButton.setVisibility(0);
            rdsTextButton.setText(rdsTextButton.getContext().getResources().getText(callButtonType.getStringRes()));
            rdsTextButton.setOnClickListener(new View.OnClickListener() { // from class: com.robinhood.android.equitydetail.ui.earnings.EarningsDataView$bindBrokebackEarnings$1$1$1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WebUtils.viewUrl$default(rdsTextButton.getContext(), broadcastUrl, 0, 4, (Object) null);
                    AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(this.getAnalytics(), AnalyticsStrings.BUTTON_GROUP_EARNINGS_VIEW, callButtonType.getAnalyticsString(), null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
                }
            });
            LogOnceAnalytics.logButtonGroupAppear$default(getLogOnceAnalytics(), AnalyticsStrings.BUTTON_GROUP_EARNINGS_VIEW, callButtonType.getAnalyticsString(), null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
        }
    }

    private final String getTimingString(Resources res, AmPm timing) throws Resources.NotFoundException {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$1[timing.ordinal()];
        if (i2 == 1) {
            i = C15314R.string.earnings_timing_am;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C15314R.string.earnings_timing_pm;
        }
        String string2 = res.getString(i);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    private final String getAvailabilityString(Resources res, LocalDate reportDate, String timing, boolean verified) throws Resources.NotFoundException {
        int i;
        int i2;
        LocalDate localDate = reportDate.atStartOfDay().atOffset(ZoneOffset.UTC).toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "toLocalDate(...)");
        String str = MonthDayFormatter.MEDIUM.format(LocalDates4.getMonthDay(localDate));
        if (timing == null) {
            if (verified) {
                i2 = C15314R.string.instrument_detail_earnings_eps_available_no_timing_format;
            } else {
                i2 = C15314R.string.f4126x84cdcb91;
            }
            String string2 = res.getString(i2, str);
            Intrinsics.checkNotNull(string2);
            return string2;
        }
        if (verified) {
            i = C15314R.string.instrument_detail_earnings_eps_available_format;
        } else {
            i = C15314R.string.instrument_detail_earnings_eps_available_unverified_format;
        }
        String string3 = res.getString(i, str, timing);
        Intrinsics.checkNotNull(string3);
        return string3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEpsClicked() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext(context);
        RhDialogFragment.Builder positiveButton = RhDialogFragment.INSTANCE.create(appCompatActivityRequireActivityBaseContext).setTitle(C15314R.string.instrument_detail_earnings_eps_dialog_title, new Object[0]).setMessage(C15314R.string.instrument_detail_earnings_eps_dialog_message, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
        FragmentManager supportFragmentManager = appCompatActivityRequireActivityBaseContext.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "eps_dialog", false, 4, null);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.Clearable
    public void clear() {
        IncludeEarningsDataViewBinding binding = getBinding();
        binding.earningsGraph.clear();
        binding.earningsEstimatedEpsTxt.setText((CharSequence) null);
        binding.earningsActualEpsTxt.setText((CharSequence) null);
        binding.earningsActionBtn.setText((CharSequence) null);
        binding.earningsActionBtn.setVisibility(8);
        getLogOnceAnalytics().reset();
    }

    private final Drawable getEpsCircle(int color) {
        Drawable drawable = ViewsKt.getDrawable(this, C11048R.drawable.eps_circle_positive);
        drawable.setTint(color);
        return drawable;
    }

    private final List<EarningsGraph.Item> getGraphItems(EarningsViewData earningsViewData, Resources resources) throws Resources.NotFoundException {
        BigDecimal actual;
        BigDecimal estimate;
        Intrinsics.checkNotNull(earningsViewData, "null cannot be cast to non-null type com.robinhood.android.equitydetail.ui.EarningsViewData.Brokeback");
        List<Earning> earningsForDisplay = ((EarningsViewData.Brokeback) earningsViewData).getEarnings().getEarningsForDisplay();
        if (earningsForDisplay == null) {
            return CollectionsKt.emptyList();
        }
        List<Earning> list = earningsForDisplay;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Earning earning : list) {
            YearQuarter yearQuarter = earning.getYearQuarter();
            Earning.Eps eps = earning.getEps();
            Float fValueOf = null;
            Float fValueOf2 = (eps == null || (estimate = eps.getEstimate()) == null) ? null : Float.valueOf(estimate.floatValue());
            Earning.Eps eps2 = earning.getEps();
            if (eps2 != null && (actual = eps2.getActual()) != null) {
                fValueOf = Float.valueOf(actual.floatValue());
            }
            String string2 = resources.getString(C15314R.string.instrument_detail_earnings_quarter_label_format, Integer.valueOf(yearQuarter.getQuarterValue()), yearQuarter.format(DateTimeFormatter.ofPattern("yy", Locale.US)));
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            arrayList.add(new EarningsGraph.Item(fValueOf2, fValueOf, string2));
        }
        return arrayList;
    }

    /* compiled from: EarningsDataView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/earnings/EarningsDataView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/equitydetail/ui/earnings/EarningsDataView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion implements Inflater<EarningsDataView> {
        private final /* synthetic */ Inflater<EarningsDataView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public EarningsDataView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (EarningsDataView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C15314R.layout.include_earnings_data_view);
        }
    }
}
