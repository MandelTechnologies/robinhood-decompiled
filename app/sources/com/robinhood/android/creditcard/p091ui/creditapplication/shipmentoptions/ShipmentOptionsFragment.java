package com.robinhood.android.creditcard.p091ui.creditapplication.shipmentoptions;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentOnAttachListener;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo8;
import com.robinhood.android.creditcard.p091ui.creditapplication.shipmentoptions.ShipmentOptionsEvent;
import com.robinhood.android.creditcard.p091ui.creditapplication.shipmentoptions.ShipmentOptionsFragment;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.android.models.creditcard.api.graphql.AddressType2;
import com.robinhood.android.models.creditcard.api.graphql.ShipmentOption;
import com.robinhood.android.regiongate.CreditCardRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
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
import kotlin.reflect.KProperty;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: ShipmentOptionsFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 02\u00020\u00012\u00020\u0002:\u0004-./0B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\u0016\u0010!\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002J\r\u0010%\u001a\u00020\u001bH\u0017¢\u0006\u0002\u0010&J\t\u0010'\u001a\u00020\u0006H\u0096\u0001R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00061"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "toolbarVisible", "", "getToolbarVisible", "()Z", "activityCallbacks", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsFragment$ActivityCallbacks;", "getActivityCallbacks", "()Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsFragment$ActivityCallbacks;", "activityCallbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "parentCallbacks", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsFragment$ParentCallbacks;", "getParentCallbacks", "()Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsFragment$ParentCallbacks;", "parentCallbacks$delegate", "duxo", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsDuxo;", "getDuxo", "()Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsEvent;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "ActivityCallbacks", "ParentCallbacks", "Args", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class ShipmentOptionsFragment extends GenericComposeFragment implements RegionGated {
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ShipmentOptionsFragment.class, "activityCallbacks", "getActivityCallbacks()Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsFragment$ActivityCallbacks;", 0)), Reflection.property1(new PropertyReference1Impl(ShipmentOptionsFragment.class, "parentCallbacks", "getParentCallbacks()Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsFragment$ParentCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CreditCardRegionGate.INSTANCE);

    /* renamed from: activityCallbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 activityCallbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(ActivityCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof ShipmentOptionsFragment.ActivityCallbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: parentCallbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 parentCallbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(ParentCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, ShipmentOptionsDuxo.class);

    /* compiled from: ShipmentOptionsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsFragment$ActivityCallbacks;", "", "onContinue", "", "fxn", "Lcom/robinhood/android/creditcard/ui/creditapplication/Fxn;", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface ActivityCallbacks {
        void onContinue(CreditApplicationDuxo8 fxn);
    }

    /* compiled from: ShipmentOptionsFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J0\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH&¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsFragment$ParentCallbacks;", "", "showConfirmation", "", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "Lcom/robinhood/android/models/creditcard/api/graphql/ShipmentOption;", "onEditShipmentAddress", "toAddressValidationError", PlaceTypes.ADDRESS, "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "error", "Lcom/robinhood/android/models/creditcard/api/graphql/AddressErrorType;", "isSkippable", "", "sigRequired", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface ParentCallbacks {
        void onEditShipmentAddress();

        void showConfirmation(ShipmentOption option);

        void toAddressValidationError(AddressType address, AddressType2 error, boolean isSkippable, ShipmentOption option, boolean sigRequired);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$7(ShipmentOptionsFragment shipmentOptionsFragment, int i, Composer composer, int i2) {
        shipmentOptionsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public final void handleEvent(final Event<ShipmentOptionsEvent> event) {
        EventConsumer<ShipmentOptionsEvent> eventConsumerInvoke;
        EventConsumer<ShipmentOptionsEvent> eventConsumerInvoke2;
        EventConsumer<ShipmentOptionsEvent> eventConsumerInvoke3;
        if ((event.getData() instanceof ShipmentOptionsEvent.Continue) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m12819invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m12819invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    this.getParentCallbacks().showConfirmation(((ShipmentOptionsEvent.Continue) event.getData()).getOption());
                }
            });
        }
        if ((event.getData() instanceof ShipmentOptionsEvent.AddressValidationError) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsFragment$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m12820invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m12820invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    ShipmentOptionsEvent.AddressValidationError addressValidationError = (ShipmentOptionsEvent.AddressValidationError) event.getData();
                    this.getParentCallbacks().toAddressValidationError(addressValidationError.getAddress(), addressValidationError.getError(), addressValidationError.isSkippable(), addressValidationError.getOption(), addressValidationError.getSigRequired());
                }
            });
        }
        if (!(event.getData() instanceof ShipmentOptionsEvent.Error) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsFragment$handleEvent$$inlined$consumeIfType$3
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m12821invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m12821invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.getActivityCallbacks().onContinue(CreditApplicationDuxo8.Error.INSTANCE);
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ActivityCallbacks getActivityCallbacks() {
        return (ActivityCallbacks) this.activityCallbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParentCallbacks getParentCallbacks() {
        return (ParentCallbacks) this.parentCallbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShipmentOptionsDuxo getDuxo() {
        return (ShipmentOptionsDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requireActivity().getSupportFragmentManager().addFragmentOnAttachListener(new FragmentOnAttachListener() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsFragment.onCreate.1
            @Override // androidx.fragment.app.FragmentOnAttachListener
            public final void onAttachFragment(FragmentManager fragmentManager, Fragment fragment) {
                Intrinsics.checkNotNullParameter(fragmentManager, "<unused var>");
                Intrinsics.checkNotNullParameter(fragment, "fragment");
                if (Intrinsics.areEqual(fragment.getTag(), "unexpected-error")) {
                    ShipmentOptionsFragment.this.getDuxo().doneLoading$feature_credit_card_externalDebug();
                }
            }
        });
    }

    /* compiled from: ShipmentOptionsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsFragment$onViewCreated$1", m3645f = "ShipmentOptionsFragment.kt", m3646l = {66}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsFragment$onViewCreated$1 */
    static final class C125641 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C125641(Continuation<? super C125641> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ShipmentOptionsFragment.this.new C125641(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C125641) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ShipmentOptionsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ ShipmentOptionsFragment $tmp0;

            AnonymousClass1(ShipmentOptionsFragment shipmentOptionsFragment) {
                this.$tmp0 = shipmentOptionsFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, ShipmentOptionsFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<ShipmentOptionsEvent> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C125641.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<ShipmentOptionsEvent>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleEvent(ShipmentOptionsFragment shipmentOptionsFragment, Event event, Continuation continuation) {
            shipmentOptionsFragment.handleEvent(event);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(ShipmentOptionsFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(ShipmentOptionsFragment.this);
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
        BaseFragment.collectDuxoState$default(this, null, new C125641(null), 1, null);
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).getAutoSubmit()) {
            getDuxo().m1880xd227ee18(((Args) companion.getArgs((Fragment) this)).getOption(), ((Args) companion.getArgs((Fragment) this)).getSigRequired(), ((Args) companion.getArgs((Fragment) this)).getAddress());
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1359473667);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1359473667, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsFragment.ComposeContent (ShipmentOptionsFragment.kt:94)");
            }
            ShipmentOptionsViewState shipmentOptionsViewState = (ShipmentOptionsViewState) FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7).getValue();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ShipmentOptionsFragment.ComposeContent$lambda$4$lambda$3(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ShipmentOptionsFragment.ComposeContent$lambda$6$lambda$5(this.f$0, (ShipmentOption) obj, ((Boolean) obj2).booleanValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Companion companion = INSTANCE;
            ShipmentOptionsComposableKt.ShipmentOptions(function0, (Function2) objRememberedValue2, ((Args) companion.getArgs((Fragment) this)).getAddress(), ((Args) companion.getArgs((Fragment) this)).getIsSolidGold(), ((Args) companion.getArgs((Fragment) this)).getEntryPointSource(), ((Args) companion.getArgs((Fragment) this)).getLat(), ((Args) companion.getArgs((Fragment) this)).getLong(), ((Args) companion.getArgs((Fragment) this)).getOptions(), shipmentOptionsViewState.isLoading(), ((Args) companion.getArgs((Fragment) this)).getOption(), ((Args) companion.getArgs((Fragment) this)).getSigRequired(), composerStartRestartGroup, 0, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ShipmentOptionsFragment.ComposeContent$lambda$7(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4$lambda$3(ShipmentOptionsFragment shipmentOptionsFragment) {
        shipmentOptionsFragment.getParentCallbacks().onEditShipmentAddress();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$6$lambda$5(ShipmentOptionsFragment shipmentOptionsFragment, ShipmentOption option, boolean z) {
        Intrinsics.checkNotNullParameter(option, "option");
        shipmentOptionsFragment.getDuxo().onContinue$feature_credit_card_externalDebug(option, z, ((Args) INSTANCE.getArgs((Fragment) shipmentOptionsFragment)).getAddress());
        return Unit.INSTANCE;
    }

    /* compiled from: ShipmentOptionsFragment.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b\u0005\u0010 R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010'R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b+\u0010 R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b/\u0010 ¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsFragment$Args;", "Landroid/os/Parcelable;", "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", PlaceTypes.ADDRESS, "", "isSolidGold", "", "lat", "long", "", "entryPointSource", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/models/creditcard/api/graphql/ShipmentOption;", "options", "autoSubmit", AnalyticsStrings.BUTTON_AUTOMATIC_DEPOSIT_FREQUENCY_SELECTION_OPTION, "sigRequired", "<init>", "(Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;ZLjava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/android/models/creditcard/api/graphql/ShipmentOption;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "getAddress", "()Lcom/robinhood/android/models/creditcard/api/graphql/AddressType;", "Z", "()Z", "Ljava/lang/Double;", "getLat", "()Ljava/lang/Double;", "getLong", "Ljava/lang/String;", "getEntryPointSource", "()Ljava/lang/String;", "Lkotlinx/collections/immutable/ImmutableList;", "getOptions", "()Lkotlinx/collections/immutable/ImmutableList;", "getAutoSubmit", "Lcom/robinhood/android/models/creditcard/api/graphql/ShipmentOption;", "getOption", "()Lcom/robinhood/android/models/creditcard/api/graphql/ShipmentOption;", "getSigRequired", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final AddressType address;
        private final boolean autoSubmit;
        private final String entryPointSource;
        private final boolean isSolidGold;
        private final Double lat;
        private final Double long;
        private final ShipmentOption option;
        private final ImmutableList<ShipmentOption> options;
        private final boolean sigRequired;

        /* compiled from: ShipmentOptionsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                boolean z;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                AddressType addressType = (AddressType) parcel.readParcelable(Args.class.getClassLoader());
                boolean z2 = true;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = true;
                    z2 = false;
                }
                ImmutableList3 persistentList = null;
                Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
                Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
                String string2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(parcel.readParcelable(Args.class.getClassLoader()));
                    }
                    persistentList = extensions2.toPersistentList(arrayList);
                }
                return new Args(addressType, z2, dValueOf, dValueOf2, string2, persistentList, parcel.readInt() != 0 ? z : false, (ShipmentOption) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0 ? z : false);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.address, flags);
            dest.writeInt(this.isSolidGold ? 1 : 0);
            Double d = this.lat;
            if (d == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeDouble(d.doubleValue());
            }
            Double d2 = this.long;
            if (d2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeDouble(d2.doubleValue());
            }
            dest.writeString(this.entryPointSource);
            ImmutableList<ShipmentOption> immutableList = this.options;
            if (immutableList == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeInt(immutableList.size());
                Iterator<ShipmentOption> it = immutableList.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
            }
            dest.writeInt(this.autoSubmit ? 1 : 0);
            dest.writeParcelable(this.option, flags);
            dest.writeInt(this.sigRequired ? 1 : 0);
        }

        public Args(AddressType address, boolean z, Double d, Double d2, String str, ImmutableList<ShipmentOption> immutableList, boolean z2, ShipmentOption shipmentOption, boolean z3) {
            Intrinsics.checkNotNullParameter(address, "address");
            this.address = address;
            this.isSolidGold = z;
            this.lat = d;
            this.long = d2;
            this.entryPointSource = str;
            this.options = immutableList;
            this.autoSubmit = z2;
            this.option = shipmentOption;
            this.sigRequired = z3;
        }

        public /* synthetic */ Args(AddressType addressType, boolean z, Double d, Double d2, String str, ImmutableList immutableList, boolean z2, ShipmentOption shipmentOption, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(addressType, z, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : d2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : immutableList, z2, (i & 128) != 0 ? null : shipmentOption, (i & 256) != 0 ? false : z3);
        }

        public final AddressType getAddress() {
            return this.address;
        }

        /* renamed from: isSolidGold, reason: from getter */
        public final boolean getIsSolidGold() {
            return this.isSolidGold;
        }

        public final Double getLat() {
            return this.lat;
        }

        public final Double getLong() {
            return this.long;
        }

        public final String getEntryPointSource() {
            return this.entryPointSource;
        }

        public final ImmutableList<ShipmentOption> getOptions() {
            return this.options;
        }

        public final boolean getAutoSubmit() {
            return this.autoSubmit;
        }

        public final ShipmentOption getOption() {
            return this.option;
        }

        public final boolean getSigRequired() {
            return this.sigRequired;
        }
    }

    /* compiled from: ShipmentOptionsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsFragment;", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsFragment$Args;", "<init>", "()V", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ShipmentOptionsFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(ShipmentOptionsFragment shipmentOptionsFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, shipmentOptionsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ShipmentOptionsFragment newInstance(Args args) {
            return (ShipmentOptionsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ShipmentOptionsFragment shipmentOptionsFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, shipmentOptionsFragment, args);
        }
    }
}
