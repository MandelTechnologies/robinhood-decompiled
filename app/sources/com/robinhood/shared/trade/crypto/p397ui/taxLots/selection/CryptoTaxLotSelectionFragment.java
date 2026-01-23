package com.robinhood.shared.trade.crypto.p397ui.taxLots.selection;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.lib.trade.validation.DefaultValidatorFailure;
import com.robinhood.android.lib.trade.validation.Validator;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.regiongate.CryptoRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.serverdriven.experimental.api.CryptoValidateOrderAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.CryptoTaxLotSelectionEvent;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.selection.CryptoTaxLotSelectionFragment;
import com.robinhood.shared.trade.crypto.p397ui.validation.CryptoSduiOrderValidationAlertDialogFragment;
import com.robinhood.shared.trade.crypto.validation.CryptoOrderValidator3;
import com.robinhood.shared.trade.crypto.validation.RequestInputs;
import com.robinhood.shared.trade.crypto.validation.alert.CryptoOrderValidationFailureAlertDialogFragment;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import contracts.crypto.trade.proto.p431v1.BottomSheetTypeDto;
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
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
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
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import nummus.p512v1.TaxLotStrategyTypeDto;

/* compiled from: CryptoTaxLotSelectionFragment.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 82\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0003678B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\r\u0010#\u001a\u00020\u001bH\u0017¢\u0006\u0002\u0010$J\b\u0010%\u001a\u00020&H\u0016J\u0016\u0010'\u001a\u00020\u001b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)H\u0002J\b\u0010+\u001a\u00020\u001bH\u0016J\b\u0010,\u001a\u00020\u001bH\u0016J\u0010\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020/H\u0016J\t\u00100\u001a\u00020&H\u0096\u0001R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u00101\u001a\b\u0012\u0004\u0012\u00020302X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105¨\u00069"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/shared/trade/crypto/validation/alert/CryptoOrderValidationFailureAlertDialogFragment$Callbacks;", "Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragment$Callbacks;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionDuxo;", "getDuxo", "()Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "validationAlertDialogFragment", "Lcom/robinhood/shared/trade/crypto/ui/validation/CryptoSduiOrderValidationAlertDialogFragment;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onBackPressed", "", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionEvent;", "onPositiveResponse", "onNegativeResponse", "handleAction", "action", "Lcom/robinhood/models/serverdriven/experimental/api/CryptoValidateOrderAction;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class CryptoTaxLotSelectionFragment extends GenericComposeFragment implements AutoLoggableFragment, CryptoOrderValidationFailureAlertDialogFragment.Callbacks, CryptoSduiOrderValidationAlertDialogFragment.Callbacks, RegionGated {
    private static final String TAG_ORDER_VALIDATION_ALERT = "orderValidationAlert";
    private CryptoSduiOrderValidationAlertDialogFragment validationAlertDialogFragment;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoTaxLotSelectionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CryptoRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, CryptoTaxLotSelectionDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* compiled from: CryptoTaxLotSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionFragment$Callbacks;", "", "onLotSelectionFinished", "", "requestInputs", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;", "cancelTradeFlow", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void cancelTradeFlow();

        void onLotSelectionFinished(RequestInputs.AsAsset requestInputs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(CryptoTaxLotSelectionFragment cryptoTaxLotSelectionFragment, int i, Composer composer, int i2) {
        cryptoTaxLotSelectionFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<CryptoTaxLotSelectionEvent> event) {
        EventConsumer<CryptoTaxLotSelectionEvent> eventConsumerInvoke;
        EventConsumer<CryptoTaxLotSelectionEvent> eventConsumerInvoke2;
        EventConsumer<CryptoTaxLotSelectionEvent> eventConsumerInvoke3;
        EventConsumer<CryptoTaxLotSelectionEvent> eventConsumerInvoke4;
        EventConsumer<CryptoTaxLotSelectionEvent> eventConsumerInvoke5;
        if ((event.getData() instanceof CryptoTaxLotSelectionEvent.ContinueToReview) && (eventConsumerInvoke5 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke5.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m26025invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m26025invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.getCallbacks().onLotSelectionFinished(((CryptoTaxLotSelectionEvent.ContinueToReview) event.getData()).getRequestInputs());
                }
            });
        }
        if ((event.getData() instanceof CryptoTaxLotSelectionEvent.GoBack) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionFragment$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m26026invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m26026invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.getParentFragmentManager().popBackStackImmediate();
                }
            });
        }
        if ((event.getData() instanceof CryptoTaxLotSelectionEvent.ValidationFailureAlert) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionFragment$handleEvent$$inlined$consumeIfType$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m26027invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m26027invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    Validator.Failure<CryptoOrderContext, CryptoOrderValidator3> failure = ((CryptoTaxLotSelectionEvent.ValidationFailureAlert) event.getData()).getFailure();
                    Intrinsics.checkNotNull(failure, "null cannot be cast to non-null type com.robinhood.android.lib.trade.validation.DefaultValidatorFailure<com.robinhood.shared.trade.crypto.context.CryptoOrderContext, com.robinhood.shared.trade.crypto.validation.CryptoOrderValidationFailureResolver>");
                    DefaultValidatorFailure defaultValidatorFailure = (DefaultValidatorFailure) failure;
                    CryptoOrderValidationFailureAlertDialogFragment.Companion companion = CryptoOrderValidationFailureAlertDialogFragment.INSTANCE;
                    String string2 = defaultValidatorFailure.getTitle(this.requireBaseActivity()).toString();
                    String string3 = defaultValidatorFailure.getMessage(this.requireBaseActivity()).toString();
                    CharSequence positiveAction = defaultValidatorFailure.getPositiveAction(this.requireBaseActivity());
                    if (positiveAction == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    String string4 = positiveAction.toString();
                    CharSequence negativeAction = defaultValidatorFailure.getNegativeAction(this.requireBaseActivity());
                    CryptoOrderValidationFailureAlertDialogFragment cryptoOrderValidationFailureAlertDialogFragment = (CryptoOrderValidationFailureAlertDialogFragment) companion.newInstance((Parcelable) new CryptoOrderValidationFailureAlertDialogFragment.Args(string2, string3, string4, negativeAction != null ? negativeAction.toString() : null));
                    FragmentManager childFragmentManager = this.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    cryptoOrderValidationFailureAlertDialogFragment.show(childFragmentManager, "cryptoOrderValidationFailure");
                }
            });
        }
        if ((event.getData() instanceof CryptoTaxLotSelectionEvent.ShowSduiValidationAlert) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionFragment$handleEvent$$inlined$consumeIfType$4
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m26028invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m26028invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    CryptoTaxLotSelectionEvent.ShowSduiValidationAlert showSduiValidationAlert = (CryptoTaxLotSelectionEvent.ShowSduiValidationAlert) event.getData();
                    Fragment fragmentFindFragmentByTag = this.getChildFragmentManager().findFragmentByTag("orderValidationAlert");
                    CryptoSduiOrderValidationAlertDialogFragment cryptoSduiOrderValidationAlertDialogFragment = fragmentFindFragmentByTag instanceof CryptoSduiOrderValidationAlertDialogFragment ? (CryptoSduiOrderValidationAlertDialogFragment) fragmentFindFragmentByTag : null;
                    if (cryptoSduiOrderValidationAlertDialogFragment != null) {
                        cryptoSduiOrderValidationAlertDialogFragment.dismissNow();
                    }
                    CryptoTaxLotSelectionFragment cryptoTaxLotSelectionFragment = this;
                    CryptoSduiOrderValidationAlertDialogFragment cryptoSduiOrderValidationAlertDialogFragment2 = (CryptoSduiOrderValidationAlertDialogFragment) CryptoSduiOrderValidationAlertDialogFragment.INSTANCE.newInstance((Parcelable) new CryptoSduiOrderValidationAlertDialogFragment.Args(showSduiValidationAlert.getContent()));
                    FragmentManager childFragmentManager = this.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    cryptoSduiOrderValidationAlertDialogFragment2.show(childFragmentManager, "orderValidationAlert");
                    cryptoTaxLotSelectionFragment.validationAlertDialogFragment = cryptoSduiOrderValidationAlertDialogFragment2;
                }
            });
        }
        if (!(event.getData() instanceof CryptoTaxLotSelectionEvent.ShowDialogFragment) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionFragment$handleEvent$$inlined$consumeIfType$5
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m26029invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m26029invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Navigator.DefaultImpls.createDialogFragment$default(this.getNavigator(), ((CryptoTaxLotSelectionEvent.ShowDialogFragment) event.getData()).getDialogFragmentKey(), null, 2, null).show(this.getChildFragmentManager(), "microgramCryptoTaxLotSelectionDialogFragment");
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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CryptoTaxLotSelectionDuxo getDuxo() {
        return (CryptoTaxLotSelectionDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return getDuxo().getEventScreen();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    /* compiled from: CryptoTaxLotSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionFragment$onViewCreated$1", m3645f = "CryptoTaxLotSelectionFragment.kt", m3646l = {69}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionFragment$onViewCreated$1 */
    static final class C407851 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C407851(Continuation<? super C407851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotSelectionFragment.this.new C407851(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C407851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoTaxLotSelectionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionFragment$onViewCreated$1$2, reason: invalid class name */
        /* synthetic */ class AnonymousClass2 extends AdaptedFunctionReference implements Function2<ImmutableList<? extends BottomSheetTypeDto>, Continuation<? super Unit>, Object>, ContinuationImpl6 {
            AnonymousClass2(Object obj) {
                super(2, obj, CryptoTaxLotSelectionDuxo.class, "emitBottomSheetData", "emitBottomSheetData(Lkotlinx/collections/immutable/ImmutableList;)V", 4);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(ImmutableList<? extends BottomSheetTypeDto> immutableList, Continuation<? super Unit> continuation) {
                return invoke2((ImmutableList<BottomSheetTypeDto>) immutableList, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(ImmutableList<BottomSheetTypeDto> immutableList, Continuation<? super Unit> continuation) {
                return C407851.invokeSuspend$emitBottomSheetData((CryptoTaxLotSelectionDuxo) this.receiver, immutableList, continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$emitBottomSheetData(CryptoTaxLotSelectionDuxo cryptoTaxLotSelectionDuxo, ImmutableList immutableList, Continuation continuation) {
            cryptoTaxLotSelectionDuxo.emitBottomSheetData(immutableList);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final StateFlow<CryptoTaxLotSelectionViewState> stateFlow = CryptoTaxLotSelectionFragment.this.getDuxo().getStateFlow();
                Flow<ImmutableList<? extends BottomSheetTypeDto>> flow = new Flow<ImmutableList<? extends BottomSheetTypeDto>>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionFragment$onViewCreated$1$invokeSuspend$$inlined$map$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionFragment$onViewCreated$1$invokeSuspend$$inlined$map$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionFragment$onViewCreated$1$invokeSuspend$$inlined$map$1$2", m3645f = "CryptoTaxLotSelectionFragment.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionFragment$onViewCreated$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
                                ImmutableList<BottomSheetTypeDto> bottomSheetTypeDtos = ((CryptoTaxLotSelectionViewState) obj).getBottomSheetTypeDtos();
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(bottomSheetTypeDtos, anonymousClass1) == coroutine_suspended) {
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

                    @Override // kotlinx.coroutines.flow.Flow
                    public Object collect(FlowCollector<? super ImmutableList<? extends BottomSheetTypeDto>> flowCollector, Continuation continuation) {
                        Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(CryptoTaxLotSelectionFragment.this.getDuxo());
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass2, this) == coroutine_suspended) {
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

    /* compiled from: CryptoTaxLotSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionFragment$onViewCreated$2", m3645f = "CryptoTaxLotSelectionFragment.kt", m3646l = {70}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionFragment$onViewCreated$2 */
    static final class C407862 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C407862(Continuation<? super C407862> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CryptoTaxLotSelectionFragment.this.new C407862(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C407862) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoTaxLotSelectionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionFragment$onViewCreated$2$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ CryptoTaxLotSelectionFragment $tmp0;

            AnonymousClass1(CryptoTaxLotSelectionFragment cryptoTaxLotSelectionFragment) {
                this.$tmp0 = cryptoTaxLotSelectionFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, CryptoTaxLotSelectionFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<CryptoTaxLotSelectionEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C407862.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<CryptoTaxLotSelectionEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(CryptoTaxLotSelectionFragment cryptoTaxLotSelectionFragment, Event event, Continuation continuation) {
            cryptoTaxLotSelectionFragment.handleEvent(event);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(CryptoTaxLotSelectionFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(CryptoTaxLotSelectionFragment.this);
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
        BaseFragment.collectDuxoState$default(this, null, new C407851(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C407862(null), 1, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-79282135);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-79282135, i2, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionFragment.ComposeContent (CryptoTaxLotSelectionFragment.kt:73)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1492553697, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionFragment.ComposeContent.1

                /* compiled from: CryptoTaxLotSelectionFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ CryptoTaxLotSelectionFragment this$0;

                    AnonymousClass1(CryptoTaxLotSelectionFragment cryptoTaxLotSelectionFragment) {
                        this.this$0 = cryptoTaxLotSelectionFragment;
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
                            ComposerKt.traceEventStart(1413424268, i, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionFragment.ComposeContent.<anonymous>.<anonymous> (CryptoTaxLotSelectionFragment.kt:76)");
                        }
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final CryptoTaxLotSelectionFragment cryptoTaxLotSelectionFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoTaxLotSelectionFragment.C407841.AnonymousClass1.invoke$lambda$1$lambda$0(cryptoTaxLotSelectionFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        CryptoTaxLotSelectionComposableKt.CryptoTaxLotSelectionComposable((Function0) objRememberedValue, null, null, composer, 0, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(CryptoTaxLotSelectionFragment cryptoTaxLotSelectionFragment) {
                        cryptoTaxLotSelectionFragment.getParentFragmentManager().popBackStackImmediate();
                        return Unit.INSTANCE;
                    }
                }

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
                        ComposerKt.traceEventStart(1492553697, i3, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionFragment.ComposeContent.<anonymous> (CryptoTaxLotSelectionFragment.kt:75)");
                    }
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, CryptoTaxLotSelectionFragment.this.getEventScreen(), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1413424268, true, new AnonymousClass1(CryptoTaxLotSelectionFragment.this), composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.selection.CryptoTaxLotSelectionFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTaxLotSelectionFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getDuxo().onBackPressed();
        return true;
    }

    @Override // com.robinhood.shared.trade.crypto.validation.alert.CryptoOrderValidationFailureAlertDialogFragment.Callbacks
    public void onPositiveResponse() {
        getDuxo().onPositiveResponse();
    }

    @Override // com.robinhood.shared.trade.crypto.validation.alert.CryptoOrderValidationFailureAlertDialogFragment.Callbacks
    public void onNegativeResponse() {
        getDuxo().onNegativeResponse();
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
            getDuxo().continueToReview();
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

    /* compiled from: CryptoTaxLotSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006%"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionFragment$Args;", "Landroid/os/Parcelable;", "orderUuid", "Ljava/util/UUID;", "currencyPairId", "strategy", "Lnummus/v1/TaxLotStrategyTypeDto;", "initialRequestInputs", "Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Lnummus/v1/TaxLotStrategyTypeDto;Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;)V", "getOrderUuid", "()Ljava/util/UUID;", "getCurrencyPairId", "getStrategy", "()Lnummus/v1/TaxLotStrategyTypeDto;", "getInitialRequestInputs", "()Lcom/robinhood/shared/trade/crypto/validation/RequestInputs$AsAsset;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID currencyPairId;
        private final RequestInputs.AsAsset initialRequestInputs;
        private final UUID orderUuid;
        private final TaxLotStrategyTypeDto strategy;

        /* compiled from: CryptoTaxLotSelectionFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable(), (UUID) parcel.readSerializable(), (TaxLotStrategyTypeDto) parcel.readParcelable(Args.class.getClassLoader()), RequestInputs.AsAsset.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, UUID uuid, UUID uuid2, TaxLotStrategyTypeDto taxLotStrategyTypeDto, RequestInputs.AsAsset asAsset, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = args.orderUuid;
            }
            if ((i & 2) != 0) {
                uuid2 = args.currencyPairId;
            }
            if ((i & 4) != 0) {
                taxLotStrategyTypeDto = args.strategy;
            }
            if ((i & 8) != 0) {
                asAsset = args.initialRequestInputs;
            }
            return args.copy(uuid, uuid2, taxLotStrategyTypeDto, asAsset);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getOrderUuid() {
            return this.orderUuid;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component3, reason: from getter */
        public final TaxLotStrategyTypeDto getStrategy() {
            return this.strategy;
        }

        /* renamed from: component4, reason: from getter */
        public final RequestInputs.AsAsset getInitialRequestInputs() {
            return this.initialRequestInputs;
        }

        public final Args copy(UUID orderUuid, UUID currencyPairId, TaxLotStrategyTypeDto strategy, RequestInputs.AsAsset initialRequestInputs) {
            Intrinsics.checkNotNullParameter(orderUuid, "orderUuid");
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(strategy, "strategy");
            Intrinsics.checkNotNullParameter(initialRequestInputs, "initialRequestInputs");
            return new Args(orderUuid, currencyPairId, strategy, initialRequestInputs);
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
            return Intrinsics.areEqual(this.orderUuid, args.orderUuid) && Intrinsics.areEqual(this.currencyPairId, args.currencyPairId) && this.strategy == args.strategy && Intrinsics.areEqual(this.initialRequestInputs, args.initialRequestInputs);
        }

        public int hashCode() {
            return (((((this.orderUuid.hashCode() * 31) + this.currencyPairId.hashCode()) * 31) + this.strategy.hashCode()) * 31) + this.initialRequestInputs.hashCode();
        }

        public String toString() {
            return "Args(orderUuid=" + this.orderUuid + ", currencyPairId=" + this.currencyPairId + ", strategy=" + this.strategy + ", initialRequestInputs=" + this.initialRequestInputs + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.orderUuid);
            dest.writeSerializable(this.currencyPairId);
            dest.writeParcelable(this.strategy, flags);
            this.initialRequestInputs.writeToParcel(dest, flags);
        }

        public Args(UUID orderUuid, UUID currencyPairId, TaxLotStrategyTypeDto strategy, RequestInputs.AsAsset initialRequestInputs) {
            Intrinsics.checkNotNullParameter(orderUuid, "orderUuid");
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(strategy, "strategy");
            Intrinsics.checkNotNullParameter(initialRequestInputs, "initialRequestInputs");
            this.orderUuid = orderUuid;
            this.currencyPairId = currencyPairId;
            this.strategy = strategy;
            this.initialRequestInputs = initialRequestInputs;
        }

        public final UUID getOrderUuid() {
            return this.orderUuid;
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final TaxLotStrategyTypeDto getStrategy() {
            return this.strategy;
        }

        public final RequestInputs.AsAsset getInitialRequestInputs() {
            return this.initialRequestInputs;
        }
    }

    /* compiled from: CryptoTaxLotSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionFragment;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/selection/CryptoTaxLotSelectionFragment$Args;", "<init>", "()V", "TAG_ORDER_VALIDATION_ALERT", "", "feature-trade-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CryptoTaxLotSelectionFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CryptoTaxLotSelectionFragment cryptoTaxLotSelectionFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoTaxLotSelectionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoTaxLotSelectionFragment newInstance(Args args) {
            return (CryptoTaxLotSelectionFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoTaxLotSelectionFragment cryptoTaxLotSelectionFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoTaxLotSelectionFragment, args);
        }
    }
}
