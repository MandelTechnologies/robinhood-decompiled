package com.robinhood.android.advanced.alert.alerthub;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.RadioGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroup2;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advanced.alert.C8387R;
import com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertDuxo;
import com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertFragment;
import com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertViewState;
import com.robinhood.android.advanced.alert.databinding.FragmentAlertHubCreateIndicatorAlertBinding;
import com.robinhood.android.advanced.alert.utils.AlertHubUiResources2;
import com.robinhood.android.advanced.alert.utils.ApiCreateIndicatorAlertItemRequest2;
import com.robinhood.android.advanced.alert.utils.DecimalDigitsInputFilter;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.p088ui.view.RhEditText;
import com.robinhood.android.common.p088ui.view.RhRadioButton;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.p090rx.ErrorHandlers;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.education.contracts.AlertHubCreateIndicatorAlert;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.models.advanced.alert.api.ApiAlertHubSettingItem;
import com.robinhood.models.advanced.alert.api.ApiCreateIndicatorAlertItemRequest;
import com.robinhood.models.advanced.alert.api.IndicatorAlertDisplayResources;
import com.robinhood.models.advanced.alert.api.IndicatorDisplayResources;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettingItem;
import com.robinhood.models.advanced.alert.p302db.AlertHubUiResources;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.singular.sdk.internal.Constants;
import io.noties.markwon.Markwon;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: AlertHubCreateIndicatorAlertFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 O2\u00020\u00012\u00020\u0002:\u0001OB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\u0010\u0010B\u001a\u00020=2\u0006\u0010C\u001a\u00020DH\u0016J\b\u0010E\u001a\u00020=H\u0016J\u0012\u0010F\u001a\u00020=2\b\u0010@\u001a\u0004\u0018\u00010AH\u0016J\b\u0010G\u001a\u00020=H\u0016J\b\u0010H\u001a\u00020=H\u0016J\b\u0010I\u001a\u00020=H\u0003J\u0010\u0010J\u001a\u00020=2\u0006\u0010K\u001a\u00020LH\u0002J\u0010\u0010M\u001a\u00020=2\u0006\u0010N\u001a\u00020+H\u0002R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u00060\u0010j\u0002`\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0016\u0010\"\u001a\u0004\u0018\u00010#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0016\u0010&\u001a\u0004\u0018\u00010'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020+X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u00100\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b2\u00103R\u001b\u00106\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b8\u00109¨\u0006P"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthub/AlertHubCreateIndicatorAlertFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "indicatorName", "", "getIndicatorName", "()Ljava/lang/String;", "technicalIndicator", "Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "getTechnicalIndicator", "()Lcom/robinhood/shared/models/advancedChart/api/ApiTechnicalIndicator;", "alert", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;", "getAlert", "()Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;", "chartInterval", "Lcom/robinhood/models/ui/Historical$Interval;", "getChartInterval", "()Lcom/robinhood/models/ui/Historical$Interval;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "originalSoftInputMode", "", "binding", "Lcom/robinhood/android/advanced/alert/databinding/FragmentAlertHubCreateIndicatorAlertBinding;", "getBinding", "()Lcom/robinhood/android/advanced/alert/databinding/FragmentAlertHubCreateIndicatorAlertBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/advanced/alert/alerthub/AlertHubCreateIndicatorAlertDuxo;", "getDuxo", "()Lcom/robinhood/android/advanced/alert/alerthub/AlertHubCreateIndicatorAlertDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onResume", "onCreate", "onPause", "onStart", "bindView", "updateUiResource", "uiResource", "Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;", "updateLoading", "isLoading", "Companion", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AlertHubCreateIndicatorAlertFragment extends BaseFragment implements AutoLoggableFragment {
    public static final double MOVING_MAX_VALUE = 1.0E12d;
    public static final int RSI_MAX_VALUE = 100;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    public Markwon markwon;
    private int originalSoftInputMode;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AlertHubCreateIndicatorAlertFragment.class, "binding", "getBinding()Lcom/robinhood/android/advanced/alert/databinding/FragmentAlertHubCreateIndicatorAlertBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AlertHubCreateIndicatorAlertFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[AlertHubCreateIndicatorAlertViewState2.values().length];
            try {
                iArr[AlertHubCreateIndicatorAlertViewState2.CROSSES_ABOVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlertHubCreateIndicatorAlertViewState2.CROSSES_BELOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AlertHubCreateIndicatorAlertViewState2.MOVE_ABOVE_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AlertHubCreateIndicatorAlertViewState2.MOVE_BELOW_VALUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ApiTechnicalIndicator.Type.values().length];
            try {
                iArr2[ApiTechnicalIndicator.Type.RSI.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ApiTechnicalIndicator.Type.VWAP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ApiTechnicalIndicator.Type.BOLL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ApiTechnicalIndicator.Type.MACD.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ApiAlertHubSettingItem.Interval.values().length];
            try {
                iArr3[ApiAlertHubSettingItem.Interval.FIVE_MINUTES.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[ApiAlertHubSettingItem.Interval.TEN_MINUTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[ApiAlertHubSettingItem.Interval.HOUR.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[ApiAlertHubSettingItem.Interval.DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[ApiAlertHubSettingItem.Interval.WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[Historical.Interval.values().length];
            try {
                iArr4[Historical.Interval.FIVE_MINUTES.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[Historical.Interval.TEN_MINUTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[Historical.Interval.ONE_HOUR.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[Historical.Interval.ONE_DAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr4[Historical.Interval.WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public AlertHubCreateIndicatorAlertFragment() {
        super(C8387R.layout.fragment_alert_hub_create_indicator_alert);
        this.useDesignSystemToolbar = true;
        this.binding = ViewBinding5.viewBinding(this, AlertHubCreateIndicatorAlertFragment3.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, AlertHubCreateIndicatorAlertDuxo.class);
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

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.INDICATOR_ALERT_EDITOR, null, getTechnicalIndicator().getType().getServerValue(), null, 10, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getEventContext() {
        String string2 = ((AlertHubCreateIndicatorAlert) INSTANCE.getArgs((Fragment) this)).getInstrumentId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, new Asset(string2, Asset.AssetType.INSTRUMENT, null, null, 12, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -1, -1, 16383, null);
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    private final String getIndicatorName() {
        return ((AlertHubCreateIndicatorAlert) INSTANCE.getArgs((Fragment) this)).getIndicatorName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ApiTechnicalIndicator getTechnicalIndicator() {
        return ((AlertHubCreateIndicatorAlert) INSTANCE.getArgs((Fragment) this)).getTechnicalIndicator();
    }

    private final AlertHubSettingItem getAlert() {
        return ((AlertHubCreateIndicatorAlert) INSTANCE.getArgs((Fragment) this)).getAlert();
    }

    private final Historical.Interval getChartInterval() {
        return ((AlertHubCreateIndicatorAlert) INSTANCE.getArgs((Fragment) this)).getChartInterval();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentAlertHubCreateIndicatorAlertBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAlertHubCreateIndicatorAlertBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AlertHubCreateIndicatorAlertDuxo getDuxo() {
        return (AlertHubCreateIndicatorAlertDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        getBinding().titleTxt.setText(getString(C8387R.string.alert_hub_create_alert_title, getIndicatorName()));
        bindView();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        final String id;
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
        AlertHubSettingItem alert = getAlert();
        if (alert == null || (id = alert.getId()) == null || toolbar.findViewById(C8387R.id.delete_alert_toolbar_custom_view) != null) {
            return;
        }
        RhToolbar.addCustomView$default(toolbar, C8387R.layout.toolbar_delete_alert_button, false, 8388613, 2, null);
        RdsTextButton rdsTextButton = (RdsTextButton) toolbar.findViewById(C8387R.id.delete_alert_btn);
        if (rdsTextButton != null) {
            OnClickListeners.onClick(rdsTextButton, new Function0() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertFragment$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AlertHubCreateIndicatorAlertFragment.configureToolbar$lambda$1$lambda$0(this.f$0, id);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit configureToolbar$lambda$1$lambda$0(AlertHubCreateIndicatorAlertFragment alertHubCreateIndicatorAlertFragment, String str) {
        alertHubCreateIndicatorAlertFragment.getDuxo().deleteSetting(str);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertFragment.onResume.1
            @Override // io.reactivex.functions.Function
            public final AlertHubCreateIndicatorAlertViewState2 apply(AlertHubCreateIndicatorAlertViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getSelectedIndicatorMovingType();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubCreateIndicatorAlertFragment.onResume$lambda$2(this.f$0, (AlertHubCreateIndicatorAlertViewState2) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertFragment.onResume.3
            @Override // io.reactivex.functions.Function
            public final AlertHubCreateIndicatorAlertViewState.TopTitleState apply(AlertHubCreateIndicatorAlertViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getTopTitleState();
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubCreateIndicatorAlertFragment.onResume$lambda$3(this.f$0, (AlertHubCreateIndicatorAlertViewState.TopTitleState) obj);
            }
        });
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(Contexts7.requireBaseActivityBaseContext(contextRequireContext).getDayNightStyleChanges()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubCreateIndicatorAlertFragment.onResume$lambda$5(this.f$0, (DayNightOverlay) obj);
            }
        });
        if (Build.VERSION.SDK_INT >= 30) {
            WindowCompat.setDecorFitsSystemWindows(requireActivity().getWindow(), false);
            ViewCompat.setOnApplyWindowInsetsListener(requireView(), new OnApplyWindowInsetsListener() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertFragment.onResume.6
                @Override // androidx.core.view.OnApplyWindowInsetsListener
                public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
                    Intrinsics.checkNotNullParameter(view, "<unused var>");
                    Intrinsics.checkNotNullParameter(insets, "insets");
                    Insets insets2 = insets.getInsets(WindowInsetsCompat.Type.navigationBars());
                    Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
                    View viewRequireView = AlertHubCreateIndicatorAlertFragment.this.requireView();
                    Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
                    viewRequireView.setPadding(viewRequireView.getPaddingLeft(), viewRequireView.getPaddingTop(), viewRequireView.getPaddingRight(), insets2.bottom);
                    return WindowInsetsCompat.CONSUMED;
                }
            });
        } else {
            requireActivity().getWindow().setSoftInputMode(48);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(AlertHubCreateIndicatorAlertFragment alertHubCreateIndicatorAlertFragment, AlertHubCreateIndicatorAlertViewState2 alertHubCreateIndicatorAlertViewState2) throws NumberFormatException {
        double d;
        ConstraintLayout priceInputLayout = alertHubCreateIndicatorAlertFragment.getBinding().priceInputLayout;
        Intrinsics.checkNotNullExpressionValue(priceInputLayout, "priceInputLayout");
        AlertHubCreateIndicatorAlertViewState.Companion companion = AlertHubCreateIndicatorAlertViewState.INSTANCE;
        priceInputLayout.setVisibility(companion.getVALUE_MOVING_TYPE().contains(alertHubCreateIndicatorAlertViewState2) ? 0 : 8);
        if (companion.getVALUE_MOVING_TYPE().contains(alertHubCreateIndicatorAlertViewState2)) {
            try {
                d = Double.parseDouble(String.valueOf(alertHubCreateIndicatorAlertFragment.getBinding().movingValueEditTxt.getText()));
            } catch (NumberFormatException unused) {
                d = 0.0d;
            }
            alertHubCreateIndicatorAlertFragment.getBinding().saveBtn.setEnabled(d > 0.0d);
        } else {
            alertHubCreateIndicatorAlertFragment.getBinding().saveBtn.setEnabled(true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$3(AlertHubCreateIndicatorAlertFragment alertHubCreateIndicatorAlertFragment, AlertHubCreateIndicatorAlertViewState.TopTitleState topTitleState) {
        String strReplacePeriodParam;
        IndicatorAlertDisplayResources crossesAbove;
        String summaryMarkdown;
        IndicatorAlertDisplayResources crossesAbove2;
        IndicatorAlertDisplayResources crossesAbove3;
        IndicatorAlertDisplayResources crossesBelow;
        String summaryMarkdown2;
        IndicatorAlertDisplayResources crossesBelow2;
        IndicatorAlertDisplayResources crossesBelow3;
        IndicatorAlertDisplayResources movesAboveValue;
        String summaryMarkdown3;
        IndicatorAlertDisplayResources movesAboveValue2;
        IndicatorAlertDisplayResources movesAboveValue3;
        IndicatorAlertDisplayResources movesBelowValue;
        String summaryMarkdown4;
        IndicatorAlertDisplayResources movesBelowValue2;
        IndicatorAlertDisplayResources movesBelowValue3;
        AlertHubUiResources uiResource = topTitleState.getUiResource();
        IndicatorDisplayResources editorDisplayResource = uiResource != null ? AlertHubUiResources2.getEditorDisplayResource(uiResource, alertHubCreateIndicatorAlertFragment.getTechnicalIndicator()) : null;
        int i = WhenMappings.$EnumSwitchMapping$0[topTitleState.getSelectedIndicatorMovingType().ordinal()];
        if (i == 1) {
            alertHubCreateIndicatorAlertFragment.getBinding().indicatorTitle.setText((editorDisplayResource == null || (crossesAbove3 = editorDisplayResource.getCrossesAbove()) == null) ? null : crossesAbove3.getAlertTypeTitle());
            RhTextView rhTextView = alertHubCreateIndicatorAlertFragment.getBinding().indicatorSubtitle;
            Markwon markwon = alertHubCreateIndicatorAlertFragment.getMarkwon();
            String helpMarkdown = (editorDisplayResource == null || (crossesAbove2 = editorDisplayResource.getCrossesAbove()) == null) ? null : crossesAbove2.getHelpMarkdown();
            if (helpMarkdown == null) {
                helpMarkdown = "";
            }
            rhTextView.setText(markwon.toMarkdown(helpMarkdown));
            strReplacePeriodParam = (editorDisplayResource == null || (crossesAbove = editorDisplayResource.getCrossesAbove()) == null || (summaryMarkdown = crossesAbove.getSummaryMarkdown()) == null) ? null : AlertHubUiResources2.replacePeriodParam(summaryMarkdown, alertHubCreateIndicatorAlertFragment.getTechnicalIndicator());
            RhTextView bottomExplainTxt = alertHubCreateIndicatorAlertFragment.getBinding().bottomExplainTxt;
            Intrinsics.checkNotNullExpressionValue(bottomExplainTxt, "bottomExplainTxt");
            bottomExplainTxt.setVisibility(0);
        } else if (i == 2) {
            alertHubCreateIndicatorAlertFragment.getBinding().indicatorTitle.setText((editorDisplayResource == null || (crossesBelow3 = editorDisplayResource.getCrossesBelow()) == null) ? null : crossesBelow3.getAlertTypeTitle());
            RhTextView rhTextView2 = alertHubCreateIndicatorAlertFragment.getBinding().indicatorSubtitle;
            Markwon markwon2 = alertHubCreateIndicatorAlertFragment.getMarkwon();
            String helpMarkdown2 = (editorDisplayResource == null || (crossesBelow2 = editorDisplayResource.getCrossesBelow()) == null) ? null : crossesBelow2.getHelpMarkdown();
            if (helpMarkdown2 == null) {
                helpMarkdown2 = "";
            }
            rhTextView2.setText(markwon2.toMarkdown(helpMarkdown2));
            strReplacePeriodParam = (editorDisplayResource == null || (crossesBelow = editorDisplayResource.getCrossesBelow()) == null || (summaryMarkdown2 = crossesBelow.getSummaryMarkdown()) == null) ? null : AlertHubUiResources2.replacePeriodParam(summaryMarkdown2, alertHubCreateIndicatorAlertFragment.getTechnicalIndicator());
            RhTextView bottomExplainTxt2 = alertHubCreateIndicatorAlertFragment.getBinding().bottomExplainTxt;
            Intrinsics.checkNotNullExpressionValue(bottomExplainTxt2, "bottomExplainTxt");
            bottomExplainTxt2.setVisibility(0);
        } else if (i == 3) {
            alertHubCreateIndicatorAlertFragment.getBinding().indicatorTitle.setText((editorDisplayResource == null || (movesAboveValue3 = editorDisplayResource.getMovesAboveValue()) == null) ? null : movesAboveValue3.getAlertTypeTitle());
            RhTextView rhTextView3 = alertHubCreateIndicatorAlertFragment.getBinding().indicatorSubtitle;
            Markwon markwon3 = alertHubCreateIndicatorAlertFragment.getMarkwon();
            String helpMarkdown3 = (editorDisplayResource == null || (movesAboveValue2 = editorDisplayResource.getMovesAboveValue()) == null) ? null : movesAboveValue2.getHelpMarkdown();
            if (helpMarkdown3 == null) {
                helpMarkdown3 = "";
            }
            rhTextView3.setText(markwon3.toMarkdown(helpMarkdown3));
            strReplacePeriodParam = (editorDisplayResource == null || (movesAboveValue = editorDisplayResource.getMovesAboveValue()) == null || (summaryMarkdown3 = movesAboveValue.getSummaryMarkdown()) == null) ? null : AlertHubUiResources2.replacePeriodParam(summaryMarkdown3, alertHubCreateIndicatorAlertFragment.getTechnicalIndicator());
            RhTextView bottomExplainTxt3 = alertHubCreateIndicatorAlertFragment.getBinding().bottomExplainTxt;
            Intrinsics.checkNotNullExpressionValue(bottomExplainTxt3, "bottomExplainTxt");
            bottomExplainTxt3.setVisibility(String.valueOf(alertHubCreateIndicatorAlertFragment.getBinding().movingValueEditTxt.getText()).length() > 0 ? 0 : 8);
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            alertHubCreateIndicatorAlertFragment.getBinding().indicatorTitle.setText((editorDisplayResource == null || (movesBelowValue3 = editorDisplayResource.getMovesBelowValue()) == null) ? null : movesBelowValue3.getAlertTypeTitle());
            RhTextView rhTextView4 = alertHubCreateIndicatorAlertFragment.getBinding().indicatorSubtitle;
            Markwon markwon4 = alertHubCreateIndicatorAlertFragment.getMarkwon();
            String helpMarkdown4 = (editorDisplayResource == null || (movesBelowValue2 = editorDisplayResource.getMovesBelowValue()) == null) ? null : movesBelowValue2.getHelpMarkdown();
            if (helpMarkdown4 == null) {
                helpMarkdown4 = "";
            }
            rhTextView4.setText(markwon4.toMarkdown(helpMarkdown4));
            strReplacePeriodParam = (editorDisplayResource == null || (movesBelowValue = editorDisplayResource.getMovesBelowValue()) == null || (summaryMarkdown4 = movesBelowValue.getSummaryMarkdown()) == null) ? null : AlertHubUiResources2.replacePeriodParam(summaryMarkdown4, alertHubCreateIndicatorAlertFragment.getTechnicalIndicator());
            RhTextView bottomExplainTxt4 = alertHubCreateIndicatorAlertFragment.getBinding().bottomExplainTxt;
            Intrinsics.checkNotNullExpressionValue(bottomExplainTxt4, "bottomExplainTxt");
            bottomExplainTxt4.setVisibility(String.valueOf(alertHubCreateIndicatorAlertFragment.getBinding().movingValueEditTxt.getText()).length() > 0 ? 0 : 8);
        }
        String str = strReplacePeriodParam;
        alertHubCreateIndicatorAlertFragment.getDuxo().updateBottomTextPlaceholder(str == null ? "" : str);
        RhTextView rhTextView5 = alertHubCreateIndicatorAlertFragment.getBinding().bottomExplainTxt;
        Markwon markwon5 = alertHubCreateIndicatorAlertFragment.getMarkwon();
        String strReplace$default = str != null ? StringsKt.replace$default(str, AlertHubUiResources.VALUE_PARAM, String.valueOf(alertHubCreateIndicatorAlertFragment.getBinding().movingValueEditTxt.getText()), false, 4, (Object) null) : null;
        rhTextView5.setText(markwon5.toMarkdown(strReplace$default != null ? strReplace$default : ""));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$5(AlertHubCreateIndicatorAlertFragment alertHubCreateIndicatorAlertFragment, DayNightOverlay it) {
        Intrinsics.checkNotNullParameter(it, "it");
        RadioGroup intervalRadioGroup = alertHubCreateIndicatorAlertFragment.getBinding().intervalRadioGroup;
        Intrinsics.checkNotNullExpressionValue(intervalRadioGroup, "intervalRadioGroup");
        for (View view : ViewGroup2.getChildren(intervalRadioGroup)) {
            if (view instanceof RhRadioButton) {
                ((RhRadioButton) view).setBackground(alertHubCreateIndicatorAlertFragment.requireContext().getDrawable(C8387R.drawable.interval_radio_btn_background));
            }
        }
        if (DayNightChanges.isDay(it)) {
            alertHubCreateIndicatorAlertFragment.getBinding().movesAboveValueBtn.setBackground(alertHubCreateIndicatorAlertFragment.requireContext().getDrawable(C8387R.drawable.moves_above_value_light_mode_btn));
            alertHubCreateIndicatorAlertFragment.getBinding().movesBelowValueBtn.setBackground(alertHubCreateIndicatorAlertFragment.requireContext().getDrawable(C8387R.drawable.moves_below_value_light_mode_btn));
            alertHubCreateIndicatorAlertFragment.getBinding().crossesAboveBtn.setBackground(alertHubCreateIndicatorAlertFragment.requireContext().getDrawable(C8387R.drawable.crosses_above_light_mode_btn));
            alertHubCreateIndicatorAlertFragment.getBinding().crossesBelowBtn.setBackground(alertHubCreateIndicatorAlertFragment.requireContext().getDrawable(C8387R.drawable.crosses_below_light_mode_btn));
        } else {
            alertHubCreateIndicatorAlertFragment.getBinding().movesAboveValueBtn.setBackground(alertHubCreateIndicatorAlertFragment.requireContext().getDrawable(C8387R.drawable.moves_above_value_dark_mode_btn));
            alertHubCreateIndicatorAlertFragment.getBinding().movesBelowValueBtn.setBackground(alertHubCreateIndicatorAlertFragment.requireContext().getDrawable(C8387R.drawable.moves_below_value_dark_mode_btn));
            alertHubCreateIndicatorAlertFragment.getBinding().crossesAboveBtn.setBackground(alertHubCreateIndicatorAlertFragment.requireContext().getDrawable(C8387R.drawable.crosses_above_dark_mode_btn));
            alertHubCreateIndicatorAlertFragment.getBinding().crossesBelowBtn.setBackground(alertHubCreateIndicatorAlertFragment.requireContext().getDrawable(C8387R.drawable.crosses_below_dark_mode_btn));
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT < 30) {
            this.originalSoftInputMode = requireActivity().getWindow().getAttributes().softInputMode;
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        if (Build.VERSION.SDK_INT >= 30) {
            WindowCompat.setDecorFitsSystemWindows(requireActivity().getWindow(), true);
        } else {
            requireActivity().getWindow().setSoftInputMode(this.originalSoftInputMode);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertFragment$onStart$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((AlertHubCreateIndicatorAlertViewState) it).getUiResource());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C8396xb3bbafd5<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableDistinctUntilChanged = ObservablesKt.filterIsPresent(map).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C84042(this));
        Observable<R> map2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertFragment$onStart$$inlined$mapNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(Boolean.valueOf(((AlertHubCreateIndicatorAlertViewState) it).isLoading()));
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C8397xb3bbafd6<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        Observable observableDistinctUntilChanged2 = ObservablesKt.filterIsPresent(map2).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C84054(this));
        Observable<R> map3 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertFragment$onStart$$inlined$mapDistinctNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((AlertHubCreateIndicatorAlertViewState) it).getDismissEvent());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C8394x12b0e39<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        Observable observableDistinctUntilChanged3 = ObservablesKt.filterIsPresent(map3).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged3, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged3), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubCreateIndicatorAlertFragment.onStart$lambda$9(this.f$0, (UiEvent) obj);
            }
        });
        Observable<R> map4 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertFragment$onStart$$inlined$mapDistinctNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((AlertHubCreateIndicatorAlertViewState) it).getErrorEvent());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((C8395x12b0e3a<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        Observable observableDistinctUntilChanged4 = ObservablesKt.filterIsPresent(map4).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged4, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged4), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubCreateIndicatorAlertFragment.onStart$lambda$11(this.f$0, (UiEvent) obj);
            }
        });
    }

    /* compiled from: AlertHubCreateIndicatorAlertFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertFragment$onStart$2 */
    /* synthetic */ class C84042 extends FunctionReferenceImpl implements Function1<AlertHubUiResources, Unit> {
        C84042(Object obj) {
            super(1, obj, AlertHubCreateIndicatorAlertFragment.class, "updateUiResource", "updateUiResource(Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AlertHubUiResources alertHubUiResources) {
            invoke2(alertHubUiResources);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AlertHubUiResources p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AlertHubCreateIndicatorAlertFragment) this.receiver).updateUiResource(p0);
        }
    }

    /* compiled from: AlertHubCreateIndicatorAlertFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertFragment$onStart$4 */
    /* synthetic */ class C84054 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
        C84054(Object obj) {
            super(1, obj, AlertHubCreateIndicatorAlertFragment.class, "updateLoading", "updateLoading(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(bool.booleanValue());
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z) {
            ((AlertHubCreateIndicatorAlertFragment) this.receiver).updateLoading(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$9(AlertHubCreateIndicatorAlertFragment alertHubCreateIndicatorAlertFragment, UiEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.consume() != null) {
            BaseActivity baseActivity = alertHubCreateIndicatorAlertFragment.getBaseActivity();
            if (baseActivity != null) {
                baseActivity.setResult(-1);
            }
            BaseActivity baseActivity2 = alertHubCreateIndicatorAlertFragment.getBaseActivity();
            if (baseActivity2 != null) {
                baseActivity2.finish();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$11(AlertHubCreateIndicatorAlertFragment alertHubCreateIndicatorAlertFragment, UiEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ErrorHandlers.handleErrorEvent(alertHubCreateIndicatorAlertFragment.getActivityErrorHandler(), it);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01ba  */
    @SuppressLint({"SetTextI18n"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void bindView() {
        Unit unit;
        getBinding().indicatorMoveRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertFragment.bindView.1
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                AlertHubCreateIndicatorAlertViewState2 alertHubCreateIndicatorAlertViewState2;
                if (i == C8387R.id.crosses_above_btn) {
                    alertHubCreateIndicatorAlertViewState2 = AlertHubCreateIndicatorAlertViewState2.CROSSES_ABOVE;
                } else if (i == C8387R.id.crosses_below_btn) {
                    alertHubCreateIndicatorAlertViewState2 = AlertHubCreateIndicatorAlertViewState2.CROSSES_BELOW;
                } else if (i == C8387R.id.moves_above_value_btn) {
                    alertHubCreateIndicatorAlertViewState2 = AlertHubCreateIndicatorAlertViewState2.MOVE_ABOVE_VALUE;
                } else {
                    if (i != C8387R.id.moves_below_value_btn) {
                        Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(i));
                        throw new ExceptionsH();
                    }
                    alertHubCreateIndicatorAlertViewState2 = AlertHubCreateIndicatorAlertViewState2.MOVE_BELOW_VALUE;
                }
                AlertHubCreateIndicatorAlertFragment.this.getDuxo().updateIndicatorMovingType(alertHubCreateIndicatorAlertViewState2);
                EventLogger.DefaultImpls.logTap$default(AlertHubCreateIndicatorAlertFragment.this.getEventLogger(), null, AlertHubCreateIndicatorAlertFragment.this.getEventScreen(), new Component(Component.ComponentType.BUTTON, alertHubCreateIndicatorAlertViewState2.getServerValue(), null, 4, null), null, AlertHubCreateIndicatorAlertFragment.this.getEventContext(), false, 41, null);
            }
        });
        getBinding().intervalRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertFragment.bindView.2
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i) {
                ApiAlertHubSettingItem.Interval interval;
                if (i == C8387R.id.interval_5m_btn) {
                    interval = ApiAlertHubSettingItem.Interval.FIVE_MINUTES;
                } else if (i == C8387R.id.interval_10m_btn) {
                    interval = ApiAlertHubSettingItem.Interval.TEN_MINUTES;
                } else if (i == C8387R.id.interval_1h_btn) {
                    interval = ApiAlertHubSettingItem.Interval.HOUR;
                } else if (i == C8387R.id.interval_1d_btn) {
                    interval = ApiAlertHubSettingItem.Interval.DAY;
                } else {
                    if (i != C8387R.id.interval_1w_btn) {
                        Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(i));
                        throw new ExceptionsH();
                    }
                    interval = ApiAlertHubSettingItem.Interval.WEEK;
                }
                RhTextView intervalSubtitle = AlertHubCreateIndicatorAlertFragment.this.getBinding().intervalSubtitle;
                Intrinsics.checkNotNullExpressionValue(intervalSubtitle, "intervalSubtitle");
                intervalSubtitle.setVisibility(8);
                AlertHubCreateIndicatorAlertFragment.this.getDuxo().updateIntervalLength(interval);
                EventLogger.DefaultImpls.logTap$default(AlertHubCreateIndicatorAlertFragment.this.getEventLogger(), null, AlertHubCreateIndicatorAlertFragment.this.getEventScreen(), new Component(Component.ComponentType.BUTTON, "interval-" + interval.getServerValue(), null, 4, null), null, AlertHubCreateIndicatorAlertFragment.this.getEventContext(), false, 41, null);
            }
        });
        getBinding().crossesAboveBtn.setChecked(true);
        int i = WhenMappings.$EnumSwitchMapping$1[getTechnicalIndicator().getType().ordinal()];
        if (i == 1) {
            RhRadioButton crossesAboveBtn = getBinding().crossesAboveBtn;
            Intrinsics.checkNotNullExpressionValue(crossesAboveBtn, "crossesAboveBtn");
            crossesAboveBtn.setVisibility(8);
            RhRadioButton crossesBelowBtn = getBinding().crossesBelowBtn;
            Intrinsics.checkNotNullExpressionValue(crossesBelowBtn, "crossesBelowBtn");
            crossesBelowBtn.setVisibility(8);
            getBinding().movesAboveValueBtn.setChecked(true);
            RhTextView dollarSign = getBinding().dollarSign;
            Intrinsics.checkNotNullExpressionValue(dollarSign, "dollarSign");
            dollarSign.setVisibility(8);
        } else if (i == 2) {
            RhRadioButton interval10mBtn = getBinding().interval10mBtn;
            Intrinsics.checkNotNullExpressionValue(interval10mBtn, "interval10mBtn");
            interval10mBtn.setVisibility(8);
            RhRadioButton interval1hBtn = getBinding().interval1hBtn;
            Intrinsics.checkNotNullExpressionValue(interval1hBtn, "interval1hBtn");
            interval1hBtn.setVisibility(8);
            RhRadioButton interval1dBtn = getBinding().interval1dBtn;
            Intrinsics.checkNotNullExpressionValue(interval1dBtn, "interval1dBtn");
            interval1dBtn.setVisibility(8);
            RhRadioButton interval1wBtn = getBinding().interval1wBtn;
            Intrinsics.checkNotNullExpressionValue(interval1wBtn, "interval1wBtn");
            interval1wBtn.setVisibility(8);
        } else if (i == 3 || i == 4) {
            RhRadioButton movesAboveValueBtn = getBinding().movesAboveValueBtn;
            Intrinsics.checkNotNullExpressionValue(movesAboveValueBtn, "movesAboveValueBtn");
            movesAboveValueBtn.setVisibility(8);
            RhRadioButton movesBelowValueBtn = getBinding().movesBelowValueBtn;
            Intrinsics.checkNotNullExpressionValue(movesBelowValueBtn, "movesBelowValueBtn");
            movesBelowValueBtn.setVisibility(8);
        }
        getBinding().movingValueEditTxt.setFilters(new DecimalDigitsInputFilter[]{new DecimalDigitsInputFilter(13, 2)});
        RdsButton saveBtn = getBinding().saveBtn;
        Intrinsics.checkNotNullExpressionValue(saveBtn, "saveBtn");
        OnClickListeners.onClick(saveBtn, new Function0() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AlertHubCreateIndicatorAlertFragment.bindView$lambda$13(this.f$0);
            }
        });
        AlertHubSettingItem alert = getAlert();
        if (alert != null) {
            AlertHubCreateIndicatorAlertDuxo.InitialStateFromAlert initialStateFromAlert = getDuxo().getInitialStateFromAlert(alert);
            int i2 = WhenMappings.$EnumSwitchMapping$0[initialStateFromAlert.getMoveType().ordinal()];
            if (i2 == 1) {
                getBinding().indicatorMoveRadioGroup.check(C8387R.id.crosses_above_btn);
            } else if (i2 == 2) {
                getBinding().indicatorMoveRadioGroup.check(C8387R.id.crosses_below_btn);
            } else if (i2 == 3) {
                getBinding().indicatorMoveRadioGroup.check(C8387R.id.moves_above_value_btn);
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                getBinding().indicatorMoveRadioGroup.check(C8387R.id.moves_below_value_btn);
            }
            int i3 = WhenMappings.$EnumSwitchMapping$2[initialStateFromAlert.getInterval().ordinal()];
            if (i3 == 1) {
                getBinding().intervalRadioGroup.check(C8387R.id.interval_5m_btn);
            } else if (i3 == 2) {
                getBinding().intervalRadioGroup.check(C8387R.id.interval_10m_btn);
            } else if (i3 == 3) {
                getBinding().intervalRadioGroup.check(C8387R.id.interval_1h_btn);
            } else if (i3 == 4) {
                getBinding().intervalRadioGroup.check(C8387R.id.interval_1d_btn);
            } else if (i3 == 5) {
                getBinding().intervalRadioGroup.check(C8387R.id.interval_1w_btn);
            }
            BigDecimal value = initialStateFromAlert.getValue();
            if (value != null) {
                getBinding().movingValueEditTxt.setText(value.toString());
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                if (getTechnicalIndicator().getType() == ApiTechnicalIndicator.Type.RSI) {
                    ApiTechnicalIndicator technicalIndicator = getTechnicalIndicator();
                    Intrinsics.checkNotNull(technicalIndicator, "null cannot be cast to non-null type com.robinhood.shared.models.advancedChart.api.ApiTechnicalIndicator.ApiRelativeStrengthIndex");
                    getBinding().movingValueEditTxt.setText(String.valueOf(((ApiTechnicalIndicator.ApiRelativeStrengthIndex) technicalIndicator).getOverbought_level()));
                    RhTextView bottomExplainTxt = getBinding().bottomExplainTxt;
                    Intrinsics.checkNotNullExpressionValue(bottomExplainTxt, "bottomExplainTxt");
                    bottomExplainTxt.setVisibility(0);
                }
                Historical.Interval chartInterval = getChartInterval();
                if (chartInterval != null) {
                    int i4 = WhenMappings.$EnumSwitchMapping$3[chartInterval.ordinal()];
                    if (i4 == 1) {
                        getBinding().intervalRadioGroup.check(C8387R.id.interval_5m_btn);
                    } else if (i4 == 2) {
                        getBinding().intervalRadioGroup.check(C8387R.id.interval_10m_btn);
                    } else if (i4 == 3) {
                        getBinding().intervalRadioGroup.check(C8387R.id.interval_1h_btn);
                    } else if (i4 == 4) {
                        getBinding().intervalRadioGroup.check(C8387R.id.interval_1d_btn);
                    } else if (i4 != 5) {
                        getBinding().intervalRadioGroup.check(C8387R.id.interval_5m_btn);
                    } else {
                        getBinding().intervalRadioGroup.check(C8387R.id.interval_1w_btn);
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
        getBinding().movingValueEditTxt.addTextChangedListener(new C84006());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$13(final AlertHubCreateIndicatorAlertFragment alertHubCreateIndicatorAlertFragment) {
        Observable<AlertHubCreateIndicatorAlertViewState> observableTake = alertHubCreateIndicatorAlertFragment.getDuxo().getStates().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(alertHubCreateIndicatorAlertFragment, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AlertHubCreateIndicatorAlertFragment.bindView$lambda$13$lambda$12(this.f$0, (AlertHubCreateIndicatorAlertViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindView$lambda$13$lambda$12(AlertHubCreateIndicatorAlertFragment alertHubCreateIndicatorAlertFragment, AlertHubCreateIndicatorAlertViewState alertHubCreateIndicatorAlertViewState) {
        ApiCreateIndicatorAlertItemRequest apiCreateIndicatorAlertItemRequestConstructIndicatorAlertItemRequest;
        if (alertHubCreateIndicatorAlertFragment.getAlert() != null) {
            AlertHubCreateIndicatorAlertDuxo duxo = alertHubCreateIndicatorAlertFragment.getDuxo();
            AlertHubSettingItem alert = alertHubCreateIndicatorAlertFragment.getAlert();
            apiCreateIndicatorAlertItemRequestConstructIndicatorAlertItemRequest = duxo.constructIndicatorAlertItemRequest(alert != null ? alert.getId() : null, alertHubCreateIndicatorAlertViewState.getSelectedIndicatorMovingType(), alertHubCreateIndicatorAlertViewState.getSelectedIntervalLength(), String.valueOf(alertHubCreateIndicatorAlertFragment.getBinding().movingValueEditTxt.getText()));
            alertHubCreateIndicatorAlertFragment.getDuxo().updateIndicatorAlert(apiCreateIndicatorAlertItemRequestConstructIndicatorAlertItemRequest);
        } else {
            apiCreateIndicatorAlertItemRequestConstructIndicatorAlertItemRequest = alertHubCreateIndicatorAlertFragment.getDuxo().constructIndicatorAlertItemRequest(null, alertHubCreateIndicatorAlertViewState.getSelectedIndicatorMovingType(), alertHubCreateIndicatorAlertViewState.getSelectedIntervalLength(), String.valueOf(alertHubCreateIndicatorAlertFragment.getBinding().movingValueEditTxt.getText()));
            alertHubCreateIndicatorAlertFragment.getDuxo().createIndicatorAlert(apiCreateIndicatorAlertItemRequestConstructIndicatorAlertItemRequest);
        }
        EventLogger.DefaultImpls.logTap$default(alertHubCreateIndicatorAlertFragment.getEventLogger(), UserInteractionEventData.Action.SAVE, alertHubCreateIndicatorAlertFragment.getEventScreen(), new Component(Component.ComponentType.BUTTON, ApiCreateIndicatorAlertItemRequest2.getType(apiCreateIndicatorAlertItemRequestConstructIndicatorAlertItemRequest).getServerValue(), null, 4, null), null, alertHubCreateIndicatorAlertFragment.getEventContext(), false, 40, null);
        return Unit.INSTANCE;
    }

    /* compiled from: AlertHubCreateIndicatorAlertFragment.kt */
    @Metadata(m3635d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016J(\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, m3636d2 = {"com/robinhood/android/advanced/alert/alerthub/AlertHubCreateIndicatorAlertFragment$bindView$6", "Landroid/text/TextWatcher;", "beforeTextChanged", "", Constants.RequestParamsKeys.SESSION_ID_KEY, "", "start", "", "count", "after", "onTextChanged", "before", "afterTextChanged", "editText", "Landroid/text/Editable;", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertFragment$bindView$6 */
    public static final class C84006 implements TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            Intrinsics.checkNotNullParameter(s, "s");
        }

        C84006() {
        }

        /* JADX WARN: Type inference failed for: r10v1, types: [T, java.lang.String] */
        @Override // android.text.TextWatcher
        public void onTextChanged(final CharSequence s, int start, int before, int count) {
            Intrinsics.checkNotNullParameter(s, "s");
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = s.toString();
            try {
                if (AlertHubCreateIndicatorAlertFragment.this.getTechnicalIndicator().getType() == ApiTechnicalIndicator.Type.RSI) {
                    if (Integer.parseInt(s.toString()) > 100) {
                        AlertHubCreateIndicatorAlertFragment.this.getBinding().movingValueEditTxt.setText("100");
                        RhEditText rhEditText = AlertHubCreateIndicatorAlertFragment.this.getBinding().movingValueEditTxt;
                        Editable text = AlertHubCreateIndicatorAlertFragment.this.getBinding().movingValueEditTxt.getText();
                        rhEditText.setSelection(text != null ? text.length() : 0);
                        objectRef.element = "100";
                    }
                } else if (Double.parseDouble(s.toString()) > 1.0E12d) {
                    AlertHubCreateIndicatorAlertFragment.this.getBinding().movingValueEditTxt.setText(new BigDecimal(String.valueOf(1.0E12d)).toPlainString());
                    RhEditText rhEditText2 = AlertHubCreateIndicatorAlertFragment.this.getBinding().movingValueEditTxt;
                    Editable text2 = AlertHubCreateIndicatorAlertFragment.this.getBinding().movingValueEditTxt.getText();
                    rhEditText2.setSelection(text2 != null ? text2.length() : 0);
                    objectRef.element = "1.0E12";
                }
            } catch (NumberFormatException unused) {
            }
            AlertHubCreateIndicatorAlertFragment alertHubCreateIndicatorAlertFragment = AlertHubCreateIndicatorAlertFragment.this;
            Observable<AlertHubCreateIndicatorAlertViewState> observableTake = alertHubCreateIndicatorAlertFragment.getDuxo().getStates().take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            Observable map = ObservablesAndroid.observeOnMainThread(observableTake).map(new Function() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertFragment$bindView$6$onTextChanged$1
                @Override // io.reactivex.functions.Function
                public final String apply(AlertHubCreateIndicatorAlertViewState it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return it.getBottomTextPlaceholder();
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            ScopedObservable scopedObservableBind$default = LifecycleHost.DefaultImpls.bind$default(alertHubCreateIndicatorAlertFragment, map, (LifecycleEvent) null, 1, (Object) null);
            final AlertHubCreateIndicatorAlertFragment alertHubCreateIndicatorAlertFragment2 = AlertHubCreateIndicatorAlertFragment.this;
            scopedObservableBind$default.subscribeKotlin(new Function1() { // from class: com.robinhood.android.advanced.alert.alerthub.AlertHubCreateIndicatorAlertFragment$bindView$6$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AlertHubCreateIndicatorAlertFragment.C84006.onTextChanged$lambda$0(alertHubCreateIndicatorAlertFragment2, s, objectRef, (String) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit onTextChanged$lambda$0(AlertHubCreateIndicatorAlertFragment alertHubCreateIndicatorAlertFragment, CharSequence charSequence, Ref.ObjectRef objectRef, String str) {
            RhTextView bottomExplainTxt = alertHubCreateIndicatorAlertFragment.getBinding().bottomExplainTxt;
            Intrinsics.checkNotNullExpressionValue(bottomExplainTxt, "bottomExplainTxt");
            bottomExplainTxt.setVisibility(charSequence.toString().length() > 0 ? 0 : 8);
            RhTextView rhTextView = alertHubCreateIndicatorAlertFragment.getBinding().bottomExplainTxt;
            Markwon markwon = alertHubCreateIndicatorAlertFragment.getMarkwon();
            Intrinsics.checkNotNull(str);
            rhTextView.setText(markwon.toMarkdown(StringsKt.replace$default(str, AlertHubUiResources.VALUE_PARAM, ((String) objectRef.element).toString(), false, 4, (Object) null)));
            return Unit.INSTANCE;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editText) throws NumberFormatException {
            double d;
            Intrinsics.checkNotNullParameter(editText, "editText");
            RhEditText movingValueEditTxt = AlertHubCreateIndicatorAlertFragment.this.getBinding().movingValueEditTxt;
            Intrinsics.checkNotNullExpressionValue(movingValueEditTxt, "movingValueEditTxt");
            if (movingValueEditTxt.getVisibility() == 0) {
                try {
                    d = Double.parseDouble(editText.toString());
                } catch (NumberFormatException unused) {
                    d = 0.0d;
                }
                AlertHubCreateIndicatorAlertFragment.this.getBinding().saveBtn.setEnabled(d > 0.0d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateUiResource(AlertHubUiResources uiResource) {
        String editorIntervalSectionFooterMarkdown;
        getBinding().titleTxt.setText(AlertHubUiResources2.getEditorTitleResource(uiResource, getTechnicalIndicator()));
        getBinding().saveBtn.setText(uiResource.getContent().getEditorSaveButtonTitle());
        getBinding().currentPriceTxt.setText(AlertHubUiResources2.getCurrentLabel(uiResource, getTechnicalIndicator()));
        if (getTechnicalIndicator().getType() == ApiTechnicalIndicator.Type.VWAP) {
            IndicatorDisplayResources editorDisplayResource = AlertHubUiResources2.getEditorDisplayResource(uiResource, getTechnicalIndicator());
            if (editorDisplayResource == null || (editorIntervalSectionFooterMarkdown = editorDisplayResource.getEditorIntervalSectionFooterMarkdown()) == null) {
                return;
            }
            getBinding().intervalSubtitle.setText(getMarkwon().toMarkdown(editorIntervalSectionFooterMarkdown));
            return;
        }
        getBinding().intervalSubtitle.setText(getMarkwon().toMarkdown(uiResource.getContent().getInterval().getEditorSectionFooterMarkdown()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateLoading(boolean isLoading) {
        getBinding().saveBtn.setLoading(isLoading);
    }

    /* compiled from: AlertHubCreateIndicatorAlertFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/alerthub/AlertHubCreateIndicatorAlertFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/education/contracts/AlertHubCreateIndicatorAlert;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/advanced/alert/alerthub/AlertHubCreateIndicatorAlertFragment;", "<init>", "()V", "RSI_MAX_VALUE", "", "MOVING_MAX_VALUE", "", "createFragment", "key", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<AlertHubCreateIndicatorAlert>, FragmentWithArgsCompanion<AlertHubCreateIndicatorAlertFragment, AlertHubCreateIndicatorAlert> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AlertHubCreateIndicatorAlert getArgs(AlertHubCreateIndicatorAlertFragment alertHubCreateIndicatorAlertFragment) {
            return (AlertHubCreateIndicatorAlert) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, alertHubCreateIndicatorAlertFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AlertHubCreateIndicatorAlertFragment newInstance(AlertHubCreateIndicatorAlert alertHubCreateIndicatorAlert) {
            return (AlertHubCreateIndicatorAlertFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, alertHubCreateIndicatorAlert);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AlertHubCreateIndicatorAlertFragment alertHubCreateIndicatorAlertFragment, AlertHubCreateIndicatorAlert alertHubCreateIndicatorAlert) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, alertHubCreateIndicatorAlertFragment, alertHubCreateIndicatorAlert);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public AlertHubCreateIndicatorAlertFragment createFragment(AlertHubCreateIndicatorAlert key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (AlertHubCreateIndicatorAlertFragment) AlertHubCreateIndicatorAlertFragment.INSTANCE.newInstance((Parcelable) key);
        }
    }
}
