package com.robinhood.android.margin.upgrade.rates;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment;
import com.robinhood.android.common.margin.p083ui.MarginUpgradeStep;
import com.robinhood.android.common.margin.p083ui.eligibility.MarginEligibilityChecklistViewState4;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.lib.margin.api.ApiMarginEligibility;
import com.robinhood.android.lib.margin.p167db.models.MarginTieredRates;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.margin.contracts.EnableMarginInvestingKey2;
import com.robinhood.android.margin.upgrade.C21137R;
import com.robinhood.android.margin.upgrade.agreements.MarginUpgradeCallbacks;
import com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesDuxo2;
import com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.util.Money;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: MarginUpgradeRatesFragment.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\b\u0007\u0018\u0000 62\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003456B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\u0016\u0010-\u001a\u00020(2\f\u0010.\u001a\b\u0012\u0004\u0012\u0002000/H\u0002J\r\u00101\u001a\u00020(H\u0017¢\u0006\u0002\u00102J\b\u00103\u001a\u00020\rH\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0011\u001a\u00020\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010\u001d\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\u001f\u0010 R\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0010\u001a\u0004\b$\u0010%¨\u00067²\u0006\n\u00108\u001a\u000209X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesFragment;", "Lcom/robinhood/android/common/margin/ui/BaseMarginUpgradeStepComposeFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "()V", "navigationIcon", "Lcom/robinhood/android/common/margin/ui/BaseMarginUpgradeStepComposeFragment$NavigationIcon;", "getNavigationIcon", "()Lcom/robinhood/android/common/margin/ui/BaseMarginUpgradeStepComposeFragment$NavigationIcon;", "setNavigationIcon", "(Lcom/robinhood/android/common/margin/ui/BaseMarginUpgradeStepComposeFragment$NavigationIcon;)V", "isUk", "", "()Z", "isUk$delegate", "Lkotlin/Lazy;", "step", "Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep;", "getStep", "()Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep;", "setStep", "(Lcom/robinhood/android/common/margin/ui/MarginUpgradeStep;)V", "callbacks", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "marginUpgradeCallbacks", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeCallbacks;", "getMarginUpgradeCallbacks", "()Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeCallbacks;", "marginUpgradeCallbacks$delegate", "duxo", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesDuxo;", "getDuxo", "()Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesDuxo;", "duxo$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesEvent;", "MarginUpgradeStepComposable", "(Landroidx/compose/runtime/Composer;I)V", "onBackPressed", "Callbacks", "Args", "Companion", "feature-margin-upgrade_externalDebug", "state", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarginUpgradeRatesFragment extends BaseMarginUpgradeStepComposeFragment implements SduiActionHandler<GenericAction> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MarginUpgradeRatesFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesFragment$Callbacks;", 0)), Reflection.property1(new PropertyReference1Impl(MarginUpgradeRatesFragment.class, "marginUpgradeCallbacks", "getMarginUpgradeCallbacks()Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private BaseMarginUpgradeStepComposeFragment.NavigationIcon navigationIcon = BaseMarginUpgradeStepComposeFragment.NavigationIcon.CLOSE;

    /* renamed from: isUk$delegate, reason: from kotlin metadata */
    private final Lazy isUk = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(MarginUpgradeRatesFragment.isUk_delegate$lambda$0(this.f$0));
        }
    });
    private MarginUpgradeStep step = MarginUpgradeStep.TIERED_RATES;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof MarginUpgradeRatesFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: marginUpgradeCallbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 marginUpgradeCallbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(MarginUpgradeCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment$special$$inlined$hostActivityCallbacks$2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof MarginUpgradeCallbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, MarginUpgradeRatesDuxo.class);

    /* compiled from: MarginUpgradeRatesFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesFragment$Callbacks;", "", "onRatesContinue", "", "marginFlow", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;", "onRatesDismiss", "onRatesIneligible", "reason", "Lcom/robinhood/android/lib/margin/api/ApiMarginEligibility$ApiMarginUpgradeBlocked;", "onRatesShowInvestorProfile", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onRatesContinue(MarginEligibilityChecklistViewState4 marginFlow);

        void onRatesDismiss();

        void onRatesIneligible(ApiMarginEligibility.ApiMarginUpgradeBlocked reason);

        void onRatesShowInvestorProfile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginUpgradeStepComposable$lambda$10(MarginUpgradeRatesFragment marginUpgradeRatesFragment, int i, Composer composer, int i2) {
        marginUpgradeRatesFragment.MarginUpgradeStepComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment
    public BaseMarginUpgradeStepComposeFragment.NavigationIcon getNavigationIcon() {
        return this.navigationIcon;
    }

    public void setNavigationIcon(BaseMarginUpgradeStepComposeFragment.NavigationIcon navigationIcon) {
        Intrinsics.checkNotNullParameter(navigationIcon, "<set-?>");
        this.navigationIcon = navigationIcon;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isUk_delegate$lambda$0(MarginUpgradeRatesFragment marginUpgradeRatesFragment) {
        return ((Args) INSTANCE.getArgs((Fragment) marginUpgradeRatesFragment)).isUk();
    }

    @Override // com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment
    /* renamed from: isUk */
    public boolean getIsUk() {
        return ((Boolean) this.isUk.getValue()).booleanValue();
    }

    @Override // com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment
    public MarginUpgradeStep getStep() {
        return this.step;
    }

    public void setStep(MarginUpgradeStep marginUpgradeStep) {
        Intrinsics.checkNotNullParameter(marginUpgradeStep, "<set-?>");
        this.step = marginUpgradeStep;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(final Event<MarginUpgradeRatesDuxo2> event) {
        EventConsumer<MarginUpgradeRatesDuxo2> eventConsumerInvoke;
        EventConsumer<MarginUpgradeRatesDuxo2> eventConsumerInvoke2;
        EventConsumer<MarginUpgradeRatesDuxo2> eventConsumerInvoke3;
        EventConsumer<MarginUpgradeRatesDuxo2> eventConsumerInvoke4;
        if ((event.getData() instanceof MarginUpgradeRatesDuxo2.UpgradeSuccess) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment$handleEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m16234invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m16234invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    MarginUpgradeRatesDuxo2.UpgradeSuccess upgradeSuccess = (MarginUpgradeRatesDuxo2.UpgradeSuccess) event.getData();
                    MarginUpgradeCallbacks marginUpgradeCallbacks = this.getMarginUpgradeCallbacks();
                    Money newBuyingPower = upgradeSuccess.getNewBuyingPower();
                    MarginUpgradeRatesFragment.Companion companion = MarginUpgradeRatesFragment.INSTANCE;
                    marginUpgradeCallbacks.onMarginUpgradeSuccess(newBuyingPower, ((MarginUpgradeRatesFragment.Args) companion.getArgs((Fragment) this)).getMarginFlowType(), ((MarginUpgradeRatesFragment.Args) companion.getArgs((Fragment) this)).getDisplayName());
                }
            });
        }
        if ((event.getData() instanceof MarginUpgradeRatesDuxo2.UpgradeError) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment$handleEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m16235invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m16235invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    MarginUpgradeRatesDuxo2.UpgradeError upgradeError = (MarginUpgradeRatesDuxo2.UpgradeError) event.getData();
                    this.getMarginUpgradeCallbacks().onMarginUpgradeError(upgradeError.getResult(), upgradeError.getErrorReason());
                }
            });
        }
        if ((event.getData() instanceof MarginUpgradeRatesDuxo2.GenericError) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment$handleEvent$$inlined$consumeIfType$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m16236invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m16236invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    AbsErrorHandler.handleError$default(this.getActivityErrorHandler(), ((MarginUpgradeRatesDuxo2.GenericError) event.getData()).getThrowable(), false, 2, null);
                }
            });
        }
        if (!(event.getData() instanceof MarginUpgradeRatesDuxo2.Ineligible) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment$handleEvent$$inlined$consumeIfType$4
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m16237invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m16237invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.getCallbacks().onRatesIneligible(((MarginUpgradeRatesDuxo2.Ineligible) event.getData()).getReason());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarginUpgradeCallbacks getMarginUpgradeCallbacks() {
        return (MarginUpgradeCallbacks) this.marginUpgradeCallbacks.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarginUpgradeRatesDuxo getDuxo() {
        return (MarginUpgradeRatesDuxo) this.duxo.getValue();
    }

    /* compiled from: MarginUpgradeRatesFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment$onViewCreated$1", m3645f = "MarginUpgradeRatesFragment.kt", m3646l = {50}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment$onViewCreated$1 */
    static final class C212141 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C212141(Continuation<? super C212141> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarginUpgradeRatesFragment.this.new C212141(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C212141) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: MarginUpgradeRatesFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ MarginUpgradeRatesFragment $tmp0;

            AnonymousClass1(MarginUpgradeRatesFragment marginUpgradeRatesFragment) {
                this.$tmp0 = marginUpgradeRatesFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, MarginUpgradeRatesFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<MarginUpgradeRatesDuxo2> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C212141.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<MarginUpgradeRatesDuxo2>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(MarginUpgradeRatesFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(MarginUpgradeRatesFragment.this);
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
        public static final /* synthetic */ Object invokeSuspend$handleEvent(MarginUpgradeRatesFragment marginUpgradeRatesFragment, Event event, Continuation continuation) {
            marginUpgradeRatesFragment.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C212141(null), 1, null);
    }

    @Override // com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment
    public void MarginUpgradeStepComposable(Composer composer, final int i) {
        int i2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(785376086);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(785376086, i2, -1, "com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment.MarginUpgradeStepComposable (MarginUpgradeRatesFragment.kt:69)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            MarginTieredRates marginTieredRates = MarginUpgradeStepComposable$lambda$5(snapshotState4CollectAsStateWithLifecycle).getMarginTieredRates();
            if (marginTieredRates == null) {
                composerStartRestartGroup.startReplaceGroup(-1842628620);
                MarginUpgradeRatesComposable.MarginUpgradeRatesLoadingState(null, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1842523995);
                boolean zIsLoading = MarginUpgradeStepComposable$lambda$5(snapshotState4CollectAsStateWithLifecycle).isLoading();
                Companion companion = INSTANCE;
                boolean zIsGold = ((Args) companion.getArgs((Fragment) this)).isGold();
                boolean zIsInSlipRegionGate = ((Args) companion.getArgs((Fragment) this)).isInSlipRegionGate();
                boolean z = ((Args) companion.getArgs((Fragment) this)).getMarginFlowType() instanceof MarginEligibilityChecklistViewState4.QuickOnboarding;
                UserInteractionEventDescriptor tieredRatesEventDescriptor = getTieredRatesEventDescriptor(marginTieredRates.getMarginAvailable().getDecimalValue().doubleValue(), marginTieredRates.getHighlightedRate().getMarginBalanceRange(), marginTieredRates.getHighlightedRate().getInterestRateDisplay());
                MarginTieredRates.Content content = marginTieredRates.getContent();
                if (content == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (((Args) companion.getArgs((Fragment) this)).isCash()) {
                    i3 = C11048R.string.general_label_continue;
                } else {
                    i3 = C21137R.string.margin_upgrade_rates_enable_margin_investing;
                }
                String string2 = getString(i3);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MarginUpgradeRatesFragment.MarginUpgradeStepComposable$lambda$7$lambda$6(this.f$0);
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
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MarginUpgradeRatesFragment.MarginUpgradeStepComposable$lambda$9$lambda$8(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                MarginUpgradeRatesComposable.MarginUpgradeRatesComposable(content, zIsLoading, zIsGold, zIsInSlipRegionGate, z, string2, function0, tieredRatesEventDescriptor, null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 256);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.upgrade.rates.MarginUpgradeRatesFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginUpgradeRatesFragment.MarginUpgradeStepComposable$lambda$10(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final MarginUpgradeRatesViewState MarginUpgradeStepComposable$lambda$5(SnapshotState4<MarginUpgradeRatesViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginUpgradeStepComposable$lambda$7$lambda$6(MarginUpgradeRatesFragment marginUpgradeRatesFragment) {
        marginUpgradeRatesFragment.getCallbacks().onRatesShowInvestorProfile();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarginUpgradeStepComposable$lambda$9$lambda$8(MarginUpgradeRatesFragment marginUpgradeRatesFragment) {
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) marginUpgradeRatesFragment)).isCash() || ((Args) companion.getArgs((Fragment) marginUpgradeRatesFragment)).isUk()) {
            marginUpgradeRatesFragment.getCallbacks().onRatesContinue(((Args) companion.getArgs((Fragment) marginUpgradeRatesFragment)).getMarginFlowType());
        } else {
            marginUpgradeRatesFragment.getDuxo().enableMarginInvesting();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.margin.p083ui.BaseMarginUpgradeStepComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        getCallbacks().onRatesDismiss();
        return true;
    }

    /* compiled from: MarginUpgradeRatesFragment.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0007HÆ\u0003J\t\u0010'\u001a\u00020\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003J\t\u0010+\u001a\u00020\u0007HÆ\u0003J\t\u0010,\u001a\u00020\u0011HÆ\u0003J{\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0006\u0010.\u001a\u00020/J\u0013\u00100\u001a\u00020\u00072\b\u00101\u001a\u0004\u0018\u000102HÖ\u0003J\t\u00103\u001a\u00020/HÖ\u0001J\t\u00104\u001a\u00020\u0003HÖ\u0001J\u0016\u00105\u001a\u0002062\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020/R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0018R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\u0018¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesFragment$Args;", "Landroid/os/Parcelable;", "accountNumber", "", "displayName", "Lcom/robinhood/android/account/strings/DisplayName;", "isGold", "", "isInSlipRegionGate", "isUk", "isCash", "goldInterestExemptionAmount", "source", "sourceType", "Lcom/robinhood/android/margin/contracts/EnableMarginSourceType;", "checkEligibility", "marginFlowType", "Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/account/strings/DisplayName;ZZZZLjava/lang/String;Ljava/lang/String;Lcom/robinhood/android/margin/contracts/EnableMarginSourceType;ZLcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;)V", "getAccountNumber", "()Ljava/lang/String;", "getDisplayName", "()Lcom/robinhood/android/account/strings/DisplayName;", "()Z", "getGoldInterestExemptionAmount", "getSource", "getSourceType", "()Lcom/robinhood/android/margin/contracts/EnableMarginSourceType;", "getCheckEligibility", "getMarginFlowType", "()Lcom/robinhood/android/common/margin/ui/eligibility/MarginFlow;", "fromAcats", "getFromAcats", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final String accountNumber;
        private final boolean checkEligibility;
        private final DisplayName displayName;
        private final String goldInterestExemptionAmount;
        private final boolean isCash;
        private final boolean isGold;
        private final boolean isInSlipRegionGate;
        private final boolean isUk;
        private final MarginEligibilityChecklistViewState4 marginFlowType;
        private final String source;
        private final EnableMarginInvestingKey2 sourceType;

        /* compiled from: MarginUpgradeRatesFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string2 = parcel.readString();
                DisplayName displayName = (DisplayName) parcel.readParcelable(Args.class.getClassLoader());
                boolean z5 = false;
                boolean z6 = true;
                boolean z7 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = false;
                    z5 = true;
                } else {
                    z = false;
                }
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = true;
                    z6 = z;
                }
                if (parcel.readInt() != 0) {
                    z3 = z;
                    z = z2;
                    z4 = z;
                } else {
                    z3 = z;
                    z4 = z2;
                }
                String string3 = parcel.readString();
                boolean z8 = z3;
                String string4 = parcel.readString();
                EnableMarginInvestingKey2 enableMarginInvestingKey2 = (EnableMarginInvestingKey2) parcel.readParcelable(Args.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z8 = z4;
                }
                return new Args(string2, displayName, z7, z5, z6, z, string3, string4, enableMarginInvestingKey2, z8, (MarginEligibilityChecklistViewState4) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, String str, DisplayName displayName, boolean z, boolean z2, boolean z3, boolean z4, String str2, String str3, EnableMarginInvestingKey2 enableMarginInvestingKey2, boolean z5, MarginEligibilityChecklistViewState4 marginEligibilityChecklistViewState4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = args.accountNumber;
            }
            if ((i & 2) != 0) {
                displayName = args.displayName;
            }
            if ((i & 4) != 0) {
                z = args.isGold;
            }
            if ((i & 8) != 0) {
                z2 = args.isInSlipRegionGate;
            }
            if ((i & 16) != 0) {
                z3 = args.isUk;
            }
            if ((i & 32) != 0) {
                z4 = args.isCash;
            }
            if ((i & 64) != 0) {
                str2 = args.goldInterestExemptionAmount;
            }
            if ((i & 128) != 0) {
                str3 = args.source;
            }
            if ((i & 256) != 0) {
                enableMarginInvestingKey2 = args.sourceType;
            }
            if ((i & 512) != 0) {
                z5 = args.checkEligibility;
            }
            if ((i & 1024) != 0) {
                marginEligibilityChecklistViewState4 = args.marginFlowType;
            }
            boolean z6 = z5;
            MarginEligibilityChecklistViewState4 marginEligibilityChecklistViewState42 = marginEligibilityChecklistViewState4;
            String str4 = str3;
            EnableMarginInvestingKey2 enableMarginInvestingKey22 = enableMarginInvestingKey2;
            boolean z7 = z4;
            String str5 = str2;
            boolean z8 = z3;
            boolean z9 = z;
            return args.copy(str, displayName, z9, z2, z8, z7, str5, str4, enableMarginInvestingKey22, z6, marginEligibilityChecklistViewState42);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        /* renamed from: component10, reason: from getter */
        public final boolean getCheckEligibility() {
            return this.checkEligibility;
        }

        /* renamed from: component11, reason: from getter */
        public final MarginEligibilityChecklistViewState4 getMarginFlowType() {
            return this.marginFlowType;
        }

        /* renamed from: component2, reason: from getter */
        public final DisplayName getDisplayName() {
            return this.displayName;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsGold() {
            return this.isGold;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsInSlipRegionGate() {
            return this.isInSlipRegionGate;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsUk() {
            return this.isUk;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getIsCash() {
            return this.isCash;
        }

        /* renamed from: component7, reason: from getter */
        public final String getGoldInterestExemptionAmount() {
            return this.goldInterestExemptionAmount;
        }

        /* renamed from: component8, reason: from getter */
        public final String getSource() {
            return this.source;
        }

        /* renamed from: component9, reason: from getter */
        public final EnableMarginInvestingKey2 getSourceType() {
            return this.sourceType;
        }

        public final Args copy(String accountNumber, DisplayName displayName, boolean isGold, boolean isInSlipRegionGate, boolean isUk, boolean isCash, String goldInterestExemptionAmount, String source, EnableMarginInvestingKey2 sourceType, boolean checkEligibility, MarginEligibilityChecklistViewState4 marginFlowType) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(sourceType, "sourceType");
            Intrinsics.checkNotNullParameter(marginFlowType, "marginFlowType");
            return new Args(accountNumber, displayName, isGold, isInSlipRegionGate, isUk, isCash, goldInterestExemptionAmount, source, sourceType, checkEligibility, marginFlowType);
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
            return Intrinsics.areEqual(this.accountNumber, args.accountNumber) && Intrinsics.areEqual(this.displayName, args.displayName) && this.isGold == args.isGold && this.isInSlipRegionGate == args.isInSlipRegionGate && this.isUk == args.isUk && this.isCash == args.isCash && Intrinsics.areEqual(this.goldInterestExemptionAmount, args.goldInterestExemptionAmount) && Intrinsics.areEqual(this.source, args.source) && Intrinsics.areEqual(this.sourceType, args.sourceType) && this.checkEligibility == args.checkEligibility && Intrinsics.areEqual(this.marginFlowType, args.marginFlowType);
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.accountNumber.hashCode() * 31) + this.displayName.hashCode()) * 31) + Boolean.hashCode(this.isGold)) * 31) + Boolean.hashCode(this.isInSlipRegionGate)) * 31) + Boolean.hashCode(this.isUk)) * 31) + Boolean.hashCode(this.isCash)) * 31;
            String str = this.goldInterestExemptionAmount;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.source;
            return ((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.sourceType.hashCode()) * 31) + Boolean.hashCode(this.checkEligibility)) * 31) + this.marginFlowType.hashCode();
        }

        public String toString() {
            return "Args(accountNumber=" + this.accountNumber + ", displayName=" + this.displayName + ", isGold=" + this.isGold + ", isInSlipRegionGate=" + this.isInSlipRegionGate + ", isUk=" + this.isUk + ", isCash=" + this.isCash + ", goldInterestExemptionAmount=" + this.goldInterestExemptionAmount + ", source=" + this.source + ", sourceType=" + this.sourceType + ", checkEligibility=" + this.checkEligibility + ", marginFlowType=" + this.marginFlowType + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.accountNumber);
            dest.writeParcelable(this.displayName, flags);
            dest.writeInt(this.isGold ? 1 : 0);
            dest.writeInt(this.isInSlipRegionGate ? 1 : 0);
            dest.writeInt(this.isUk ? 1 : 0);
            dest.writeInt(this.isCash ? 1 : 0);
            dest.writeString(this.goldInterestExemptionAmount);
            dest.writeString(this.source);
            dest.writeParcelable(this.sourceType, flags);
            dest.writeInt(this.checkEligibility ? 1 : 0);
            dest.writeParcelable(this.marginFlowType, flags);
        }

        public Args(String accountNumber, DisplayName displayName, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, EnableMarginInvestingKey2 sourceType, boolean z5, MarginEligibilityChecklistViewState4 marginFlowType) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(sourceType, "sourceType");
            Intrinsics.checkNotNullParameter(marginFlowType, "marginFlowType");
            this.accountNumber = accountNumber;
            this.displayName = displayName;
            this.isGold = z;
            this.isInSlipRegionGate = z2;
            this.isUk = z3;
            this.isCash = z4;
            this.goldInterestExemptionAmount = str;
            this.source = str2;
            this.sourceType = sourceType;
            this.checkEligibility = z5;
            this.marginFlowType = marginFlowType;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final DisplayName getDisplayName() {
            return this.displayName;
        }

        public final boolean isGold() {
            return this.isGold;
        }

        public final boolean isInSlipRegionGate() {
            return this.isInSlipRegionGate;
        }

        public final boolean isUk() {
            return this.isUk;
        }

        public final boolean isCash() {
            return this.isCash;
        }

        public final String getGoldInterestExemptionAmount() {
            return this.goldInterestExemptionAmount;
        }

        public final String getSource() {
            return this.source;
        }

        public /* synthetic */ Args(String str, DisplayName displayName, boolean z, boolean z2, boolean z3, boolean z4, String str2, String str3, EnableMarginInvestingKey2 enableMarginInvestingKey2, boolean z5, MarginEligibilityChecklistViewState4 marginEligibilityChecklistViewState4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, displayName, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? EnableMarginInvestingKey2.Default.INSTANCE : enableMarginInvestingKey2, (i & 512) != 0 ? false : z5, (i & 1024) != 0 ? MarginEligibilityChecklistViewState4.Default.INSTANCE : marginEligibilityChecklistViewState4);
        }

        public final EnableMarginInvestingKey2 getSourceType() {
            return this.sourceType;
        }

        public final boolean getCheckEligibility() {
            return this.checkEligibility;
        }

        public final MarginEligibilityChecklistViewState4 getMarginFlowType() {
            return this.marginFlowType;
        }

        public final boolean getFromAcats() {
            return Intrinsics.areEqual(this.sourceType, EnableMarginInvestingKey2.AcatsIn.INSTANCE);
        }
    }

    /* compiled from: MarginUpgradeRatesFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesFragment;", "Lcom/robinhood/android/margin/upgrade/rates/MarginUpgradeRatesFragment$Args;", "<init>", "()V", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MarginUpgradeRatesFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(MarginUpgradeRatesFragment marginUpgradeRatesFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, marginUpgradeRatesFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MarginUpgradeRatesFragment newInstance(Args args) {
            return (MarginUpgradeRatesFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MarginUpgradeRatesFragment marginUpgradeRatesFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, marginUpgradeRatesFragment, args);
        }
    }
}
