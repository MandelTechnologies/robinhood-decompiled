package com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableString;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.models.api.CryptoOrderType;
import com.robinhood.models.api.fee.MonetizationModel;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.ComponentHierarchy;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.contracts.CryptoFeeTierIntentKey;
import com.robinhood.shared.crypto.p375ui.fee.unsupported.recurring.CryptoFeeUnsupportedRecurringAlertDialogFragment;
import com.robinhood.shared.formats.crypto.CryptoInputMode;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector.CryptoOrderTypeSelectorEvent;
import com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector.CryptoOrderTypeSelectorFragment;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Function;
import kotlin.Lazy;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import okio.ByteString;

/* compiled from: CryptoOrderTypeSelectorFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 E2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003CDEB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\r\u0010)\u001a\u00020$H\u0017¢\u0006\u0002\u0010*J\u0016\u0010+\u001a\u00020$2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-H\u0002J\u0010\u0010/\u001a\u00020$2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020$2\u0006\u00103\u001a\u000204H\u0016J\b\u00105\u001a\u00020$H\u0016J\b\u00106\u001a\u00020$H\u0002J\b\u00107\u001a\u000208H\u0016J\u001a\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010(H\u0016J\t\u0010=\u001a\u000208H\u0096\u0001R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0018\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?X\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010B¨\u0006F"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/shared/crypto/ui/fee/unsupported/recurring/CryptoFeeUnsupportedRecurringAlertDialogFragment$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "callbacks", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorDuxo;", "getDuxo", "()Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "dialogFragment", "Lcom/robinhood/android/common/ui/RhDialogFragment;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorEvent;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onPositiveAction", "action", "Lcom/robinhood/shared/crypto/ui/fee/unsupported/recurring/CryptoFeeUnsupportedRecurringAlertDialogFragment$PositiveAction;", "onCancel", "onShowFeeTierScreen", "onBackPressed", "", "onPositiveButtonClicked", "id", "", "passthroughArgs", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoOrderTypeSelectorFragment extends GenericComposeFragment implements CryptoFeeUnsupportedRecurringAlertDialogFragment.Callbacks, AutoLoggableFragment, RegionGated {
    private static final String TAX_LOT_DISABLED_ALERT_DISMISS_CTA_IDENTIFIER = "dismiss";
    private static final String TAX_LOT_DISABLED_ALERT_IDENTIFIER = "tax_lots_disabled";
    private RhDialogFragment dialogFragment;
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoOrderTypeSelectorFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof CryptoOrderTypeSelectorFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, CryptoOrderTypeSelectorDuxo.class);

    /* compiled from: CryptoOrderTypeSelectorFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoFeeUnsupportedRecurringAlertDialogFragment.PositiveAction.values().length];
            try {
                iArr[CryptoFeeUnsupportedRecurringAlertDialogFragment.PositiveAction.CONTINUE_WITH_RECURRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoFeeUnsupportedRecurringAlertDialogFragment.PositiveAction.DISMISS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(CryptoOrderTypeSelectorFragment cryptoOrderTypeSelectorFragment, int i, Composer composer, int i2) {
        cryptoOrderTypeSelectorFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.shared.crypto.ui.fee.unsupported.recurring.CryptoFeeUnsupportedRecurringAlertDialogFragment.Callbacks
    public void onCancel() {
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<CryptoOrderTypeSelectorEvent> event) {
        EventConsumer<CryptoOrderTypeSelectorEvent> eventConsumerInvoke;
        EventConsumer<CryptoOrderTypeSelectorEvent> eventConsumerInvoke2;
        EventConsumer<CryptoOrderTypeSelectorEvent> eventConsumerInvoke3;
        EventConsumer<CryptoOrderTypeSelectorEvent> eventConsumerInvoke4;
        EventConsumer<CryptoOrderTypeSelectorEvent> eventConsumerInvoke5;
        EventConsumer<CryptoOrderTypeSelectorEvent> eventConsumerInvoke6;
        EventConsumer<CryptoOrderTypeSelectorEvent> eventConsumerInvoke7;
        if ((event.getData() instanceof CryptoOrderTypeSelectorEvent.EnterRecurringOrderFlow) && (eventConsumerInvoke7 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke7.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25925invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25925invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.getCallbacks().onRecurringOrderSelected();
                }
            });
        }
        if ((event.getData() instanceof CryptoOrderTypeSelectorEvent.ShowRecurringIneligibleAlert) && (eventConsumerInvoke6 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke6.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorFragment$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25926invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25926invoke(Object it) {
                    SpannableString spannableString$default;
                    Intrinsics.checkNotNullParameter(it, "it");
                    CryptoOrderTypeSelectorEvent.ShowRecurringIneligibleAlert showRecurringIneligibleAlert = (CryptoOrderTypeSelectorEvent.ShowRecurringIneligibleAlert) event.getData();
                    RhBottomSheetDialogFragment.Companion companion = RhBottomSheetDialogFragment.INSTANCE;
                    String title = showRecurringIneligibleAlert.getReason().getTitle();
                    RichText description = showRecurringIneligibleAlert.getReason().getDescription();
                    if (description != null) {
                        Context contextRequireContext = this.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        spannableString$default = RichTexts.toSpannableString$default(description, contextRequireContext, null, false, null, 14, null);
                    } else {
                        spannableString$default = null;
                    }
                    RhBottomSheetDialogFragment rhBottomSheetDialogFragment = (RhBottomSheetDialogFragment) companion.newInstance((Parcelable) new RhBottomSheetDialogFragment.Args(0, title, null, spannableString$default, null, this.getResources().getString(C11048R.string.general_label_dismiss), null, null, null, false, false, null, null, null, false, false, false, false, null, null, null, 2097109, null));
                    FragmentManager childFragmentManager = this.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    rhBottomSheetDialogFragment.show(childFragmentManager, "recurring-ineligible-bottom-sheet");
                }
            });
        }
        if ((event.getData() instanceof CryptoOrderTypeSelectorEvent.ShowCryptoFeeUnsupportedRecurringAlert) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorFragment$handleEvent$$inlined$consumeIfType$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25927invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25927invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    CryptoOrderTypeSelectorEvent.ShowCryptoFeeUnsupportedRecurringAlert showCryptoFeeUnsupportedRecurringAlert = (CryptoOrderTypeSelectorEvent.ShowCryptoFeeUnsupportedRecurringAlert) event.getData();
                    CryptoFeeUnsupportedRecurringAlertDialogFragment cryptoFeeUnsupportedRecurringAlertDialogFragment = (CryptoFeeUnsupportedRecurringAlertDialogFragment) CryptoFeeUnsupportedRecurringAlertDialogFragment.INSTANCE.newInstance((Parcelable) new CryptoFeeUnsupportedRecurringAlertDialogFragment.Args(this.getEventScreen(), showCryptoFeeUnsupportedRecurringAlert.getAssetCurrencyCode(), showCryptoFeeUnsupportedRecurringAlert.getPositiveAction()));
                    FragmentManager childFragmentManager = this.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    cryptoFeeUnsupportedRecurringAlertDialogFragment.show(childFragmentManager, "cryptoFeeUnsupportedRecurringAlertDialogFragment");
                }
            });
        }
        if ((event.getData() instanceof CryptoOrderTypeSelectorEvent.DismissTypeSelectorFragment) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorFragment$handleEvent$$inlined$consumeIfType$4
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25928invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25928invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.getParentFragmentManager().popBackStack();
                }
            });
        }
        if ((event.getData() instanceof CryptoOrderTypeSelectorEvent.OrderTypeSelected) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorFragment$handleEvent$$inlined$consumeIfType$5
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25929invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25929invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    CryptoOrderTypeSelectorEvent.OrderTypeSelected orderTypeSelected = (CryptoOrderTypeSelectorEvent.OrderTypeSelected) event.getData();
                    this.getCallbacks().onOrderTypeSelected(orderTypeSelected.getUiCurrencyPair(), orderTypeSelected.getType(), orderTypeSelected.getInputMode());
                }
            });
        }
        if ((event.getData() instanceof CryptoOrderTypeSelectorEvent.EnterTaxLotOrderFlow) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorFragment$handleEvent$$inlined$consumeIfType$6
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m25930invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m25930invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.getCallbacks().onTaxLotTypeSelected();
                }
            });
        }
        if (!(event.getData() instanceof CryptoOrderTypeSelectorEvent.ShowTaxLotOrderDisabledAlert) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorFragment$handleEvent$$inlined$consumeIfType$7
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m25931invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m25931invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                CryptoOrderTypeSelectorEvent.ShowTaxLotOrderDisabledAlert showTaxLotOrderDisabledAlert = (CryptoOrderTypeSelectorEvent.ShowTaxLotOrderDisabledAlert) event.getData();
                EventLogger.DefaultImpls.logAppear$default(this.getEventLogger(), null, this.getEventScreen(), new Component(Component.ComponentType.ALERT, "tax_lots_disabled", null, 4, null), null, null, 25, null);
                RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
                FragmentActivity fragmentActivityRequireActivity = this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                RhDialogFragment.Builder positiveButton = companion.create(fragmentActivityRequireActivity).setId(C40095R.id.dialog_id_tax_lot_disabled).setTheme(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome).setTitle(showTaxLotOrderDisabledAlert.getTitle()).setMessage(showTaxLotOrderDisabledAlert.getMessage()).setPositiveButton(showTaxLotOrderDisabledAlert.getDismissCtaText());
                FragmentManager supportFragmentManager = this.requireActivity().getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                this.dialogFragment = RhDialogFragment.Builder.show$default(positiveButton, supportFragmentManager, "taxLotOrderDisabledAlert", false, 4, null);
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
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return getDuxo().getEventScreen();
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return getDuxo().getScreenEventContext();
    }

    /* compiled from: CryptoOrderTypeSelectorFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorFragment$Callbacks;", "", "onRecurringOrderSelected", "", "onOrderTypeSelected", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "type", "Lcom/robinhood/models/api/CryptoOrderType;", "inputMode", "Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "onTaxLotTypeSelected", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onOrderTypeSelected(UiCurrencyPair uiCurrencyPair, CryptoOrderType type2, CryptoInputMode inputMode);

        void onRecurringOrderSelected();

        void onTaxLotTypeSelected();

        /* compiled from: CryptoOrderTypeSelectorFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class DefaultImpls {
            public static /* synthetic */ void onOrderTypeSelected$default(Callbacks callbacks, UiCurrencyPair uiCurrencyPair, CryptoOrderType cryptoOrderType, CryptoInputMode cryptoInputMode, int i, Object obj) {
                if (obj != null) {
                    throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onOrderTypeSelected");
                }
                if ((i & 4) != 0) {
                    cryptoInputMode = null;
                }
                callbacks.onOrderTypeSelected(uiCurrencyPair, cryptoOrderType, cryptoInputMode);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CryptoOrderTypeSelectorDuxo getDuxo() {
        return (CryptoOrderTypeSelectorDuxo) this.duxo.getValue();
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

    /* compiled from: CryptoOrderTypeSelectorFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorFragment$onViewCreated$1", m3645f = "CryptoOrderTypeSelectorFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorFragment$onViewCreated$1 */
    static final class C404931 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C404931(Continuation<? super C404931> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoOrderTypeSelectorFragment.this.new C404931(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C404931) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoOrderTypeSelectorFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ CryptoOrderTypeSelectorFragment $tmp0;

            AnonymousClass1(CryptoOrderTypeSelectorFragment cryptoOrderTypeSelectorFragment) {
                this.$tmp0 = cryptoOrderTypeSelectorFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, CryptoOrderTypeSelectorFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<CryptoOrderTypeSelectorEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C404931.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<CryptoOrderTypeSelectorEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(CryptoOrderTypeSelectorFragment cryptoOrderTypeSelectorFragment, Event event, Continuation continuation) {
            cryptoOrderTypeSelectorFragment.handleEvent(event);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(CryptoOrderTypeSelectorFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoOrderTypeSelectorFragment.this);
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

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C404931(null), 1, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1967331619);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1967331619, i2, -1, "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorFragment.ComposeContent (CryptoOrderTypeSelectorFragment.kt:74)");
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new CryptoOrderTypeSelectorFragment2(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function0 = (Function0) ((KFunction) objRememberedValue);
            CryptoOrderTypeSelectorDuxo duxo = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(duxo);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new CryptoOrderTypeSelectorFragment3(duxo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            CryptoOrderTypeSelectorComposable.CryptoOrderTypeSelectorComposable(function0, (Function1) ((KFunction) objRememberedValue2), null, null, composerStartRestartGroup, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoOrderTypeSelectorFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle((CharSequence) null);
    }

    @Override // com.robinhood.shared.crypto.ui.fee.unsupported.recurring.CryptoFeeUnsupportedRecurringAlertDialogFragment.Callbacks
    public void onPositiveAction(CryptoFeeUnsupportedRecurringAlertDialogFragment.PositiveAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        int i = WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i == 1) {
            getCallbacks().onRecurringOrderSelected();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            getParentFragmentManager().popBackStack();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onShowFeeTierScreen() {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new CryptoFeeTierIntentKey(CryptoFeeTierIntentKey.LaunchType.PUSH, null, 2, 0 == true ? 1 : 0), null, false, null, null, 60, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getDuxo().onBackPressed();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C40095R.id.dialog_id_tax_lot_disabled) {
            EventLogger eventLogger = getEventLogger();
            Screen eventScreen = getEventScreen();
            Component component = null;
            Component component2 = null;
            ByteString byteString = null;
            Object[] objArr = 0 == true ? 1 : 0;
            EventLogger.DefaultImpls.logTap$default(eventLogger, null, eventScreen, new Component(Component.ComponentType.BUTTON, "dismiss", 0 == true ? 1 : 0, 4, null), new ComponentHierarchy(new Component(Component.ComponentType.ALERT, TAX_LOT_DISABLED_ALERT_IDENTIFIER, null, 4, null), component, component2, objArr, byteString, 30, null), null, false, 49, null);
            RhDialogFragment rhDialogFragment = this.dialogFragment;
            if (rhDialogFragment == null) {
                return true;
            }
            rhDialogFragment.dismiss();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    /* compiled from: CryptoOrderTypeSelectorFragment.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003JG\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0006\u0010 \u001a\u00020!J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020!HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001J\u0016\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006-"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorFragment$Args;", "Landroid/os/Parcelable;", "currencyPairId", "Ljava/util/UUID;", "side", "Lcom/robinhood/models/db/OrderSide;", "orderType", "Lcom/robinhood/models/api/CryptoOrderType;", "orderUuid", "isRecurringOrder", "", "initialMonetizationModelPreference", "Lcom/robinhood/models/api/fee/MonetizationModel;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/OrderSide;Lcom/robinhood/models/api/CryptoOrderType;Ljava/util/UUID;ZLcom/robinhood/models/api/fee/MonetizationModel;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getSide", "()Lcom/robinhood/models/db/OrderSide;", "getOrderType", "()Lcom/robinhood/models/api/CryptoOrderType;", "getOrderUuid", "()Z", "getInitialMonetizationModelPreference", "()Lcom/robinhood/models/api/fee/MonetizationModel;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID currencyPairId;
        private final MonetizationModel initialMonetizationModelPreference;
        private final boolean isRecurringOrder;
        private final CryptoOrderType orderType;
        private final UUID orderUuid;
        private final OrderSide side;

        /* compiled from: CryptoOrderTypeSelectorFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable(), OrderSide.valueOf(parcel.readString()), CryptoOrderType.valueOf(parcel.readString()), (UUID) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : MonetizationModel.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, OrderSide orderSide, CryptoOrderType cryptoOrderType, UUID uuid2, boolean z, MonetizationModel monetizationModel, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.currencyPairId;
            }
            if ((i & 2) != 0) {
                orderSide = args.side;
            }
            if ((i & 4) != 0) {
                cryptoOrderType = args.orderType;
            }
            if ((i & 8) != 0) {
                uuid2 = args.orderUuid;
            }
            if ((i & 16) != 0) {
                z = args.isRecurringOrder;
            }
            if ((i & 32) != 0) {
                monetizationModel = args.initialMonetizationModelPreference;
            }
            boolean z2 = z;
            MonetizationModel monetizationModel2 = monetizationModel;
            return args.copy(uuid, orderSide, cryptoOrderType, uuid2, z2, monetizationModel2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component2, reason: from getter */
        public final OrderSide getSide() {
            return this.side;
        }

        /* renamed from: component3, reason: from getter */
        public final CryptoOrderType getOrderType() {
            return this.orderType;
        }

        /* renamed from: component4, reason: from getter */
        public final UUID getOrderUuid() {
            return this.orderUuid;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsRecurringOrder() {
            return this.isRecurringOrder;
        }

        /* renamed from: component6, reason: from getter */
        public final MonetizationModel getInitialMonetizationModelPreference() {
            return this.initialMonetizationModelPreference;
        }

        public final Args copy(UUID currencyPairId, OrderSide side, CryptoOrderType orderType, UUID orderUuid, boolean isRecurringOrder, MonetizationModel initialMonetizationModelPreference) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(orderUuid, "orderUuid");
            return new Args(currencyPairId, side, orderType, orderUuid, isRecurringOrder, initialMonetizationModelPreference);
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
            return Intrinsics.areEqual(this.currencyPairId, args.currencyPairId) && this.side == args.side && this.orderType == args.orderType && Intrinsics.areEqual(this.orderUuid, args.orderUuid) && this.isRecurringOrder == args.isRecurringOrder && this.initialMonetizationModelPreference == args.initialMonetizationModelPreference;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.currencyPairId.hashCode() * 31) + this.side.hashCode()) * 31) + this.orderType.hashCode()) * 31) + this.orderUuid.hashCode()) * 31) + Boolean.hashCode(this.isRecurringOrder)) * 31;
            MonetizationModel monetizationModel = this.initialMonetizationModelPreference;
            return iHashCode + (monetizationModel == null ? 0 : monetizationModel.hashCode());
        }

        public String toString() {
            return "Args(currencyPairId=" + this.currencyPairId + ", side=" + this.side + ", orderType=" + this.orderType + ", orderUuid=" + this.orderUuid + ", isRecurringOrder=" + this.isRecurringOrder + ", initialMonetizationModelPreference=" + this.initialMonetizationModelPreference + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.currencyPairId);
            dest.writeString(this.side.name());
            dest.writeString(this.orderType.name());
            dest.writeSerializable(this.orderUuid);
            dest.writeInt(this.isRecurringOrder ? 1 : 0);
            MonetizationModel monetizationModel = this.initialMonetizationModelPreference;
            if (monetizationModel == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(monetizationModel.name());
            }
        }

        public Args(UUID currencyPairId, OrderSide side, CryptoOrderType orderType, UUID orderUuid, boolean z, MonetizationModel monetizationModel) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(side, "side");
            Intrinsics.checkNotNullParameter(orderType, "orderType");
            Intrinsics.checkNotNullParameter(orderUuid, "orderUuid");
            this.currencyPairId = currencyPairId;
            this.side = side;
            this.orderType = orderType;
            this.orderUuid = orderUuid;
            this.isRecurringOrder = z;
            this.initialMonetizationModelPreference = monetizationModel;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final OrderSide getSide() {
            return this.side;
        }

        public final CryptoOrderType getOrderType() {
            return this.orderType;
        }

        public final UUID getOrderUuid() {
            return this.orderUuid;
        }

        public final boolean isRecurringOrder() {
            return this.isRecurringOrder;
        }

        public final MonetizationModel getInitialMonetizationModelPreference() {
            return this.initialMonetizationModelPreference;
        }
    }

    /* compiled from: CryptoOrderTypeSelectorFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorFragment;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorFragment$Args;", "<init>", "()V", "TAX_LOT_DISABLED_ALERT_IDENTIFIER", "", "TAX_LOT_DISABLED_ALERT_DISMISS_CTA_IDENTIFIER", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CryptoOrderTypeSelectorFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CryptoOrderTypeSelectorFragment cryptoOrderTypeSelectorFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoOrderTypeSelectorFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoOrderTypeSelectorFragment newInstance(Args args) {
            return (CryptoOrderTypeSelectorFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoOrderTypeSelectorFragment cryptoOrderTypeSelectorFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoOrderTypeSelectorFragment, args);
        }
    }
}
