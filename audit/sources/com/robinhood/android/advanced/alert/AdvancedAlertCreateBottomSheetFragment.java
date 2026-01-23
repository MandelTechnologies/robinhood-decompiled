package com.robinhood.android.advanced.alert;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetEvent;
import com.robinhood.android.advanced.alert.databinding.FragmentAdvancedCreateAlertBottomsheetBinding;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhMoneyInputView;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.textinput.TextWatcherAdapter;
import com.robinhood.android.lib.formats.DefaultNumberFormatter;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.advanced.alert.api.ApiAdvancedAlert2;
import com.robinhood.models.advanced.alert.api.ApiAlertHubSettingItem;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettingItem;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.rosetta.eventlogging.Asset;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.formats.crypto.MoneyInputFormatting;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: AdvancedAlertCreateBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000¹\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001=\b\u0007\u0018\u0000 _2\u00020\u00012\u00020\u0002:\u0002^_B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020JH\u0016J\u0012\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010NH\u0016J\u001a\u0010O\u001a\u00020H2\u0006\u0010P\u001a\u00020Q2\b\u0010M\u001a\u0004\u0018\u00010NH\u0016J\b\u0010R\u001a\u00020HH\u0016J\u0016\u0010S\u001a\u00020H2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020V0UH\u0002J\b\u0010W\u001a\u00020HH\u0002J\b\u0010X\u001a\u00020HH\u0002J\u0010\u0010Y\u001a\u00020H2\u0006\u0010Z\u001a\u00020[H\u0002J\b\u0010\\\u001a\u00020HH\u0002J\b\u0010]\u001a\u00020HH\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\n\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u0004\u0018\u00010 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010#\u001a\u0004\u0018\u00010$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020,8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u0010/\u001a\u000200X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0014\u00103\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0018\u00107\u001a\u000608j\u0002`98BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u001b\u0010<\u001a\u00020=8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\n\u001a\u0004\b>\u0010?R\u001e\u0010A\u001a\u00020B8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010D\"\u0004\bE\u0010F¨\u0006`"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetDuxo;", "getDuxo", "()Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/advanced/alert/databinding/FragmentAdvancedCreateAlertBottomsheetBinding;", "getBinding", "()Lcom/robinhood/android/advanced/alert/databinding/FragmentAdvancedCreateAlertBottomsheetBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetFragment$DismissCallback;", "getCallbacks", "()Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetFragment$DismissCallback;", "callbacks$delegate", "priceFormat", "Lcom/robinhood/android/lib/formats/NumberFormatter;", "getPriceFormat", "()Lcom/robinhood/android/lib/formats/NumberFormatter;", "priceFormat$delegate", "settingItem", "Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;", "getSettingItem", "()Lcom/robinhood/models/advanced/alert/db/AlertHubSettingItem;", "editorTitle", "", "getEditorTitle", "()Ljava/lang/String;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Ljava/math/BigDecimal;", "getPrice", "()Ljava/math/BigDecimal;", "assetType", "Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "getAssetType", "()Lcom/robinhood/rosetta/eventlogging/Asset$AssetType;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "excludeFromAutoScreenEventLogging", "", "getExcludeFromAutoScreenEventLogging", "()Z", "eventComponent", "Lcom/robinhood/rosetta/eventlogging/Component;", "getEventComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "displayPriceTextWatcher", "com/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetFragment$displayPriceTextWatcher$2$1", "getDisplayPriceTextWatcher", "()Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetFragment$displayPriceTextWatcher$2$1;", "displayPriceTextWatcher$delegate", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "onAttach", "", "context", "Landroid/content/Context;", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onDestroyView", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetEvent;", "updateSaveBtnVisibility", "bindSaveBtn", "setViewState", "viewState", "Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetViewState;", "handleError", "bindLoggingEvent", "DismissCallback", "Companion", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AdvancedAlertCreateBottomSheetFragment extends BaseBottomSheetDialogFragment implements AutoLoggableFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: displayPriceTextWatcher$delegate, reason: from kotlin metadata */
    private final Lazy displayPriceTextWatcher;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public EventLogger eventLogger;
    private final boolean excludeFromAutoScreenEventLogging;

    /* renamed from: priceFormat$delegate, reason: from kotlin metadata */
    private final Lazy priceFormat;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AdvancedAlertCreateBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/advanced/alert/databinding/FragmentAdvancedCreateAlertBottomsheetBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AdvancedAlertCreateBottomSheetFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetFragment$DismissCallback;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AdvancedAlertCreateBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetFragment$DismissCallback;", "", "onDismiss", "", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface DismissCallback {
        void onDismiss();
    }

    /* compiled from: AdvancedAlertCreateBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiAdvancedAlert2.values().length];
            try {
                iArr[ApiAdvancedAlert2.INSTRUMENTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiAdvancedAlert2.CRYPTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<AdvancedAlertCreateBottomSheetEvent> event) {
        EventConsumer<AdvancedAlertCreateBottomSheetEvent> eventConsumerInvoke;
        EventConsumer<AdvancedAlertCreateBottomSheetEvent> eventConsumerInvoke2;
        EventConsumer<AdvancedAlertCreateBottomSheetEvent> eventConsumerInvoke3;
        if ((event.getData() instanceof AdvancedAlertCreateBottomSheetEvent.LoadingEvent) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m10905invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m10905invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.getBinding().saveBtn.setLoading(((AdvancedAlertCreateBottomSheetEvent.LoadingEvent) event.getData()).isLoading());
                }
            });
        }
        if ((event.getData() instanceof AdvancedAlertCreateBottomSheetEvent.ErrorEvent) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m10906invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m10906invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.handleError();
                }
            });
        }
        if (!(event.getData() instanceof AdvancedAlertCreateBottomSheetEvent.DismissEvent) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment$handleEvent$$inlined$consumeIfType$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m10907invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m10907invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.dismiss();
                this.getCallbacks().onDismiss();
            }
        });
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

    public AdvancedAlertCreateBottomSheetFragment() {
        super(C8387R.layout.fragment_advanced_create_alert_bottomsheet);
        this.duxo = DuxosKt.duxo(this, AdvancedAlertCreateBottomSheetDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, AdvancedAlertCreateBottomSheetFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(DismissCallback.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment$special$$inlined$targetFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment targetFragment = CallbacksProperty.getTargetFragment();
                if (targetFragment != null) {
                    return targetFragment;
                }
                throw new IllegalStateException("Required value was null.");
            }
        });
        this.priceFormat = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedAlertCreateBottomSheetFragment.priceFormat_delegate$lambda$1(this.f$0);
            }
        });
        this.excludeFromAutoScreenEventLogging = true;
        this.displayPriceTextWatcher = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedAlertCreateBottomSheetFragment.displayPriceTextWatcher_delegate$lambda$2(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdvancedAlertCreateBottomSheetDuxo getDuxo() {
        return (AdvancedAlertCreateBottomSheetDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentAdvancedCreateAlertBottomsheetBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAdvancedCreateAlertBottomsheetBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DismissCallback getCallbacks() {
        return (DismissCallback) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    private final NumberFormatter getPriceFormat() {
        return (NumberFormatter) this.priceFormat.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultNumberFormatter priceFormat_delegate$lambda$1(AdvancedAlertCreateBottomSheetFragment advancedAlertCreateBottomSheetFragment) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.US);
        currencyInstance.setGroupingUsed(true);
        Companion companion = INSTANCE;
        Integer maximumFractionDigits = ((AdvancedAlertCreateBottomSheetArgs) companion.getArgs((Fragment) advancedAlertCreateBottomSheetFragment)).getMaximumFractionDigits();
        currencyInstance.setMinimumFractionDigits(maximumFractionDigits != null ? maximumFractionDigits.intValue() : 2);
        Integer maximumFractionDigits2 = ((AdvancedAlertCreateBottomSheetArgs) companion.getArgs((Fragment) advancedAlertCreateBottomSheetFragment)).getMaximumFractionDigits();
        currencyInstance.setMaximumFractionDigits(maximumFractionDigits2 != null ? maximumFractionDigits2.intValue() : 2);
        if (currencyInstance instanceof DecimalFormat) {
            ((DecimalFormat) currencyInstance).setParseBigDecimal(true);
        }
        Intrinsics.checkNotNullExpressionValue(currencyInstance, "apply(...)");
        return new DefaultNumberFormatter(currencyInstance);
    }

    private final AlertHubSettingItem getSettingItem() {
        return ((AdvancedAlertCreateBottomSheetArgs) INSTANCE.getArgs((Fragment) this)).getSettingItem();
    }

    private final String getEditorTitle() {
        if (getSettingItem() instanceof AlertHubSettingItem.PriceBelow) {
            AlertHubSettingItem settingItem = getSettingItem();
            Intrinsics.checkNotNull(settingItem, "null cannot be cast to non-null type com.robinhood.models.advanced.alert.db.AlertHubSettingItem.PriceBelow");
            return ((AlertHubSettingItem.PriceBelow) settingItem).getEditorTitle();
        }
        if (!(getSettingItem() instanceof AlertHubSettingItem.PriceAbove)) {
            return null;
        }
        AlertHubSettingItem settingItem2 = getSettingItem();
        Intrinsics.checkNotNull(settingItem2, "null cannot be cast to non-null type com.robinhood.models.advanced.alert.db.AlertHubSettingItem.PriceAbove");
        return ((AlertHubSettingItem.PriceAbove) settingItem2).getEditorTitle();
    }

    private final BigDecimal getPrice() {
        if (getSettingItem() instanceof AlertHubSettingItem.PriceBelow) {
            AlertHubSettingItem settingItem = getSettingItem();
            Intrinsics.checkNotNull(settingItem, "null cannot be cast to non-null type com.robinhood.models.advanced.alert.db.AlertHubSettingItem.PriceBelow");
            return ((AlertHubSettingItem.PriceBelow) settingItem).getPrice();
        }
        if (!(getSettingItem() instanceof AlertHubSettingItem.PriceAbove)) {
            return null;
        }
        AlertHubSettingItem settingItem2 = getSettingItem();
        Intrinsics.checkNotNull(settingItem2, "null cannot be cast to non-null type com.robinhood.models.advanced.alert.db.AlertHubSettingItem.PriceAbove");
        return ((AlertHubSettingItem.PriceAbove) settingItem2).getPrice();
    }

    private final Asset.AssetType getAssetType() {
        int i = WhenMappings.$EnumSwitchMapping$0[((AdvancedAlertCreateBottomSheetArgs) INSTANCE.getArgs((Fragment) this)).getEntityType().ordinal()];
        if (i == 1) {
            return Asset.AssetType.INSTRUMENT;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Asset.AssetType.CURRENCY_PAIR;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Companion companion = INSTANCE;
        Screen.Name screenName = ((AdvancedAlertCreateBottomSheetArgs) companion.getArgs((Fragment) this)).getScreenName();
        String string2 = ((AdvancedAlertCreateBottomSheetArgs) companion.getArgs((Fragment) this)).getEntityId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(screenName, null, string2, null, 10, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return this.excludeFromAutoScreenEventLogging;
    }

    private final Component getEventComponent() {
        Component.ComponentType componentType = Component.ComponentType.PRICE_ALERT_EDITOR;
        ApiAlertHubSettingItem.Type settingType = ((AdvancedAlertCreateBottomSheetArgs) INSTANCE.getArgs((Fragment) this)).getSettingItem().getSettingType();
        String serverValue = settingType != null ? settingType.getServerValue() : null;
        if (serverValue == null) {
            serverValue = "";
        }
        return new Component(componentType, serverValue, null, 4, null);
    }

    private final Context getEventContext() {
        String string2 = ((AdvancedAlertCreateBottomSheetArgs) INSTANCE.getArgs((Fragment) this)).getEntityId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, new Asset(string2, getAssetType(), null, null, 12, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -1, -1, 16383, null);
    }

    private final AdvancedAlertCreateBottomSheetFragment3 getDisplayPriceTextWatcher() {
        return (AdvancedAlertCreateBottomSheetFragment3) this.displayPriceTextWatcher.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment$displayPriceTextWatcher$2$1] */
    public static final AdvancedAlertCreateBottomSheetFragment3 displayPriceTextWatcher_delegate$lambda$2(final AdvancedAlertCreateBottomSheetFragment advancedAlertCreateBottomSheetFragment) {
        return new TextWatcherAdapter() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment$displayPriceTextWatcher$2$1
            private int cursorPosition;

            {
                this.cursorPosition = this.this$0.getBinding().priceEditText.getLength();
            }

            @Override // com.robinhood.android.designsystem.textinput.TextWatcherAdapter, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                TextWatcherAdapter.DefaultImpls.afterTextChanged(this, editable);
            }

            @Override // com.robinhood.android.designsystem.textinput.TextWatcherAdapter, android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                Intrinsics.checkNotNullParameter(text, "text");
                RhMoneyInputView rhMoneyInputView = this.this$0.getBinding().priceEditText;
                this.cursorPosition = rhMoneyInputView.getLength() - rhMoneyInputView.getSelectionEnd();
            }

            @Override // com.robinhood.android.designsystem.textinput.TextWatcherAdapter, android.text.TextWatcher
            public void onTextChanged(CharSequence text, int start, int before, int count) {
                Intrinsics.checkNotNullParameter(text, "text");
                if (!StringsKt.isBlank(text)) {
                    this.this$0.getBinding().priceEditText.overrideAmountText(MoneyInputFormatting.toReadableMoneyString$default(text.toString(), ((AdvancedAlertCreateBottomSheetArgs) AdvancedAlertCreateBottomSheetFragment.INSTANCE.getArgs((Fragment) this.this$0)).getMaximumFractionDigits(), false, 2, null), this);
                    restoreCursorPosition();
                }
                this.this$0.updateSaveBtnVisibility();
            }

            private final void restoreCursorPosition() {
                RhMoneyInputView rhMoneyInputView = this.this$0.getBinding().priceEditText;
                rhMoneyInputView.setSelection(RangesKt.coerceAtLeast(rhMoneyInputView.getLength() - this.cursorPosition, 0));
            }
        };
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

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, com.robinhood.hammer.android.fragment.HammerDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(savedInstanceState);
        dialogOnCreateDialog.setCanceledOnTouchOutside(false);
        return dialogOnCreateDialog;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().priceEditText.addAmountTextChangedListener(getDisplayPriceTextWatcher());
        RhMoneyInputView rhMoneyInputView = getBinding().priceEditText;
        Companion companion = INSTANCE;
        rhMoneyInputView.setMaximumFractionDigits(((AdvancedAlertCreateBottomSheetArgs) companion.getArgs((Fragment) this)).getMaximumFractionDigits());
        getBinding().priceEditText.setHintMaximumFractionDigits(((AdvancedAlertCreateBottomSheetArgs) companion.getArgs((Fragment) this)).getMaximumFractionDigits());
        getBinding().advancedAlertSettingTitle.setText(getEditorTitle());
        ImageView backBtn = getBinding().backBtn;
        Intrinsics.checkNotNullExpressionValue(backBtn, "backBtn");
        OnClickListeners.onClick(backBtn, new Function0() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedAlertCreateBottomSheetFragment.onViewCreated$lambda$5(this.f$0);
            }
        });
        getBinding().currentPriceTxt.setText(getString(C8387R.string.advanced_alert_current_price, getPriceFormat().format(0)));
        BigDecimal price = getPrice();
        if (price != null) {
            getBinding().priceEditText.setAmount(Money3.toMoney(price, Currencies.USD));
        }
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getBinding().priceNumpad.getKeyEvents()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C83693(getBinding().priceEditText));
        bindSaveBtn();
        bindLoggingEvent();
        BaseDialogFragment.collectDuxoState$default(this, null, new C83704(null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5(AdvancedAlertCreateBottomSheetFragment advancedAlertCreateBottomSheetFragment) {
        advancedAlertCreateBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* compiled from: AdvancedAlertCreateBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment$onViewCreated$3 */
    /* synthetic */ class C83693 extends FunctionReferenceImpl implements Function1<KeyEvent, Unit> {
        C83693(Object obj) {
            super(1, obj, RhMoneyInputView.class, "dispatchInputKeyEvent", "dispatchInputKeyEvent(Landroid/view/KeyEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(KeyEvent keyEvent) {
            invoke2(keyEvent);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(KeyEvent p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((RhMoneyInputView) this.receiver).dispatchInputKeyEvent(p0);
        }
    }

    /* compiled from: AdvancedAlertCreateBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment$onViewCreated$4", m3645f = "AdvancedAlertCreateBottomSheetFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment$onViewCreated$4 */
    static final class C83704 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C83704(Continuation<? super C83704> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C83704 c83704 = AdvancedAlertCreateBottomSheetFragment.this.new C83704(continuation);
            c83704.L$0 = obj;
            return c83704;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C83704) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AdvancedAlertCreateBottomSheetFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment$onViewCreated$4$1", m3645f = "AdvancedAlertCreateBottomSheetFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment$onViewCreated$4$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvancedAlertCreateBottomSheetFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AdvancedAlertCreateBottomSheetFragment advancedAlertCreateBottomSheetFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = advancedAlertCreateBottomSheetFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: AdvancedAlertCreateBottomSheetFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment$onViewCreated$4$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C495281 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ AdvancedAlertCreateBottomSheetFragment $tmp0;

                C495281(AdvancedAlertCreateBottomSheetFragment advancedAlertCreateBottomSheetFragment) {
                    this.$tmp0 = advancedAlertCreateBottomSheetFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, AdvancedAlertCreateBottomSheetFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(Event<AdvancedAlertCreateBottomSheetEvent> event, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$handleEvent = AnonymousClass1.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                    return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((Event<AdvancedAlertCreateBottomSheetEvent>) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getEventFlow());
                    C495281 c495281 = new C495281(this.this$0);
                    this.label = 1;
                    if (flowFilterNotNull.collect(c495281, this) == coroutine_suspended) {
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
            public static final /* synthetic */ Object invokeSuspend$handleEvent(AdvancedAlertCreateBottomSheetFragment advancedAlertCreateBottomSheetFragment, Event event, Continuation continuation) {
                advancedAlertCreateBottomSheetFragment.handleEvent(event);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(AdvancedAlertCreateBottomSheetFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(AdvancedAlertCreateBottomSheetFragment.this, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: AdvancedAlertCreateBottomSheetFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment$onViewCreated$4$2", m3645f = "AdvancedAlertCreateBottomSheetFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment$onViewCreated$4$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ AdvancedAlertCreateBottomSheetFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AdvancedAlertCreateBottomSheetFragment advancedAlertCreateBottomSheetFragment, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = advancedAlertCreateBottomSheetFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: AdvancedAlertCreateBottomSheetFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment$onViewCreated$4$2$1, reason: invalid class name */
            /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ AdvancedAlertCreateBottomSheetFragment $tmp0;

                AnonymousClass1(AdvancedAlertCreateBottomSheetFragment advancedAlertCreateBottomSheetFragment) {
                    this.$tmp0 = advancedAlertCreateBottomSheetFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, AdvancedAlertCreateBottomSheetFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(AdvancedAlertCreateBottomSheetViewState advancedAlertCreateBottomSheetViewState, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$setViewState = AnonymousClass2.invokeSuspend$setViewState(this.$tmp0, advancedAlertCreateBottomSheetViewState, continuation);
                    return objInvokeSuspend$setViewState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setViewState : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((AdvancedAlertCreateBottomSheetViewState) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Flow flowFilterNotNull = FlowKt.filterNotNull(this.this$0.getDuxo().getStateFlow());
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
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

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$setViewState(AdvancedAlertCreateBottomSheetFragment advancedAlertCreateBottomSheetFragment, AdvancedAlertCreateBottomSheetViewState advancedAlertCreateBottomSheetViewState, Continuation continuation) {
                advancedAlertCreateBottomSheetFragment.setViewState(advancedAlertCreateBottomSheetViewState);
                return Unit.INSTANCE;
            }
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        EventLogger.DefaultImpls.logDisappear$default(getEventLogger(), UserInteractionEventData.Action.DISMISS, getEventScreen(), getEventComponent(), null, getEventContext(), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateSaveBtnVisibility() {
        getBinding().saveBtn.setEnabled(Money3.isPositive(getBinding().priceEditText.getAmount()));
    }

    private final void bindSaveBtn() {
        RdsButton rdsButton = getBinding().saveBtn;
        Money amount = getBinding().priceEditText.getAmount();
        rdsButton.setEnabled((amount == null || amount.isZero()) ? false : true);
        Intrinsics.checkNotNull(rdsButton);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedAlertCreateBottomSheetFragment.bindSaveBtn$lambda$12$lambda$10(this.f$0);
            }
        });
        ViewsKt.eventData$default(rdsButton, false, new Function0() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedAlertCreateBottomSheetFragment.bindSaveBtn$lambda$12$lambda$11(this.f$0);
            }
        }, 1, null);
        ViewsKt.setLoggingConfig(rdsButton, new AutoLoggingConfig(false, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindSaveBtn$lambda$12$lambda$10(AdvancedAlertCreateBottomSheetFragment advancedAlertCreateBottomSheetFragment) {
        String id = advancedAlertCreateBottomSheetFragment.getSettingItem().getId();
        if (id == null) {
            id = "";
        }
        if (id.length() > 0) {
            AdvancedAlertCreateBottomSheetDuxo duxo = advancedAlertCreateBottomSheetFragment.getDuxo();
            Money amount = advancedAlertCreateBottomSheetFragment.getBinding().priceEditText.getAmount();
            duxo.updateSetting(id, String.valueOf(amount != null ? amount.getDecimalValue() : null), true);
        } else {
            AdvancedAlertCreateBottomSheetDuxo duxo2 = advancedAlertCreateBottomSheetFragment.getDuxo();
            ApiAlertHubSettingItem.Type settingType = advancedAlertCreateBottomSheetFragment.getSettingItem().getSettingType();
            String serverValue = settingType != null ? settingType.getServerValue() : null;
            String str = serverValue != null ? serverValue : "";
            Money amount2 = advancedAlertCreateBottomSheetFragment.getBinding().priceEditText.getAmount();
            duxo2.createSetting(str, String.valueOf(amount2 != null ? amount2.getDecimalValue() : null), true);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bindSaveBtn$lambda$12$lambda$11(AdvancedAlertCreateBottomSheetFragment advancedAlertCreateBottomSheetFragment) {
        Component eventComponent = advancedAlertCreateBottomSheetFragment.getEventComponent();
        UserInteractionEventData.Action action = UserInteractionEventData.Action.SAVE;
        String string2 = ((AdvancedAlertCreateBottomSheetArgs) INSTANCE.getArgs((Fragment) advancedAlertCreateBottomSheetFragment)).getEntityId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new UserInteractionEventDescriptor(null, null, action, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, new Asset(string2, advancedAlertCreateBottomSheetFragment.getAssetType(), null, null, 12, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16385, -1, -1, -1, -1, -1, 16383, null), eventComponent, null, 35, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(AdvancedAlertCreateBottomSheetViewState viewState) {
        getBinding().currentPriceTxt.setText(getString(C8387R.string.advanced_alert_current_price, getPriceFormat().format(Double.valueOf(viewState.getCurrentPriceDouble()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleError() {
        dismiss();
        RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        RhDialogFragment.Builder positiveButton = companion.create(contextRequireContext).setUseDesignSystemOverlay(true).setTitle(C8387R.string.advanced_alert_failed_dialog_title, new Object[0]).setMessage(C8387R.string.advanced_alert_failed_dialog_subtitle, new Object[0]).setPositiveButton(C11048R.string.general_label_dismiss, new Object[0]);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        RhDialogFragment.Builder.show$default(positiveButton, parentFragmentManager, "load_advanced_alert_details_error", false, 4, null);
    }

    private final void bindLoggingEvent() {
        ConstraintLayout root = getBinding().getRoot();
        Intrinsics.checkNotNull(root);
        ViewsKt.eventData$default(root, false, new Function0() { // from class: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AdvancedAlertCreateBottomSheetFragment.bindLoggingEvent$lambda$14$lambda$13(this.f$0);
            }
        }, 1, null);
        ViewsKt.setLoggingConfig(root, new AutoLoggingConfig(false, true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bindLoggingEvent$lambda$14$lambda$13(AdvancedAlertCreateBottomSheetFragment advancedAlertCreateBottomSheetFragment) {
        return new UserInteractionEventDescriptor(null, null, null, advancedAlertCreateBottomSheetFragment.getEventContext(), advancedAlertCreateBottomSheetFragment.getEventComponent(), null, 39, null);
    }

    /* compiled from: AdvancedAlertCreateBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsAndCallbacksCompanion;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetFragment;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetArgs;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetFragment$DismissCallback;", "<init>", "()V", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsAndCallbacksCompanion<AdvancedAlertCreateBottomSheetFragment, AdvancedAlertCreateBottomSheetArgs, DismissCallback> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AdvancedAlertCreateBottomSheetArgs getArgs(AdvancedAlertCreateBottomSheetFragment advancedAlertCreateBottomSheetFragment) {
            return (AdvancedAlertCreateBottomSheetArgs) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.getArgs(this, advancedAlertCreateBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsAndCallbacksCompanion
        public /* bridge */ /* synthetic */ DialogFragment newInstance(Parcelable parcelable, Fragment fragment, int i) {
            return newInstance((AdvancedAlertCreateBottomSheetArgs) parcelable, (AdvancedAlertCreateBottomSheetArgs) fragment, i);
        }

        public <C extends Fragment & DismissCallback> AdvancedAlertCreateBottomSheetFragment newInstance(AdvancedAlertCreateBottomSheetArgs advancedAlertCreateBottomSheetArgs, C c, int i) {
            return (AdvancedAlertCreateBottomSheetFragment) FragmentWithArgsAndCallbacksCompanion.DefaultImpls.newInstance(this, advancedAlertCreateBottomSheetArgs, c, i);
        }
    }
}
