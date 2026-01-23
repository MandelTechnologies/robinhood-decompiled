package com.robinhood.android.creditcard.p091ui.creditapplication.limitreveal;

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
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.creditcard.p091ui.creditapplication.CreditApplicationDuxo8;
import com.robinhood.android.creditcard.p091ui.creditapplication.limitreveal.LimitCarouselBottomSheet;
import com.robinhood.android.creditcard.p091ui.creditapplication.limitreveal.LimitRevealDuxo2;
import com.robinhood.android.creditcard.p091ui.creditapplication.limitreveal.LimitRevealFragment;
import com.robinhood.android.models.creditcard.api.graphql.PremiumCreditLimitChoice;
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
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import p479j$.time.Instant;
import p479j$.time.ZoneId;
import p479j$.time.format.DateTimeFormatter;

/* compiled from: LimitRevealFragment.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0003,-.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0016\u0010\u001b\u001a\u00020\u00162\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002J\r\u0010\u001f\u001a\u00020\u0016H\u0017¢\u0006\u0002\u0010 J\u0019\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0002\u0010%J\t\u0010&\u001a\u00020\fH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020)0(X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "duxo", "Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealDuxo;", "getDuxo", "()Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "toolbarVisible", "", "getToolbarVisible", "()Z", "callbacks", "Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "handleDuxoEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealEvent;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "formatEpoch", "", "epochMilli", "", "(Ljava/lang/Long;)Ljava/lang/String;", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class LimitRevealFragment extends GenericComposeFragment implements RegionGated {
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(LimitRevealFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CreditCardRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, LimitRevealDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof LimitRevealFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: LimitRevealFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealFragment$Callbacks;", "", "onContinue", "", "fxn", "Lcom/robinhood/android/creditcard/ui/creditapplication/Fxn;", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onContinue(CreditApplicationDuxo8 fxn);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(LimitRevealFragment limitRevealFragment, int i, Composer composer, int i2) {
        limitRevealFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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
    public final LimitRevealDuxo getDuxo() {
        return (LimitRevealDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleDuxoEvent(final Event<LimitRevealDuxo2> event) {
        EventConsumer<LimitRevealDuxo2> eventConsumerInvoke;
        if (!(event.getData() instanceof LimitRevealDuxo2) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealFragment$handleDuxoEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m12781invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m12781invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (!(((LimitRevealDuxo2) event.getData()) instanceof LimitRevealDuxo2.ChoosePremiumLimit)) {
                    throw new NoWhenBranchMatchedException();
                }
                LimitCarouselBottomSheet.Companion companion = LimitCarouselBottomSheet.INSTANCE;
                LimitRevealFragment.Companion companion2 = LimitRevealFragment.INSTANCE;
                List<PremiumCreditLimitChoice> premiumCreditLimitChoices = ((LimitRevealFragment.Args) companion2.getArgs((Fragment) this)).getPremiumCreditLimitChoices();
                LimitRevealFragment limitRevealFragment = this;
                String epoch = limitRevealFragment.formatEpoch(((LimitRevealFragment.Args) companion2.getArgs((Fragment) limitRevealFragment)).getPremiumCreditLimitExpiresAt());
                if (epoch == null) {
                    epoch = "";
                }
                LimitCarouselBottomSheet limitCarouselBottomSheet = (LimitCarouselBottomSheet) companion.newInstance((Parcelable) new LimitCarouselBottomSheet.Args(premiumCreditLimitChoices, epoch));
                FragmentManager childFragmentManager = this.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                limitCarouselBottomSheet.show(childFragmentManager, "credit-application-premium-limit-carousel");
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* compiled from: LimitRevealFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealFragment$onViewCreated$1", m3645f = "LimitRevealFragment.kt", m3646l = {41}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealFragment$onViewCreated$1 */
    static final class C124861 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C124861(Continuation<? super C124861> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LimitRevealFragment.this.new C124861(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C124861) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: LimitRevealFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ LimitRevealFragment $tmp0;

            AnonymousClass1(LimitRevealFragment limitRevealFragment) {
                this.$tmp0 = limitRevealFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, LimitRevealFragment.class, "handleDuxoEvent", "handleDuxoEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<LimitRevealDuxo2> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleDuxoEvent = C124861.invokeSuspend$handleDuxoEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleDuxoEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleDuxoEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<LimitRevealDuxo2>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$handleDuxoEvent(LimitRevealFragment limitRevealFragment, Event event, Continuation continuation) {
            limitRevealFragment.handleDuxoEvent(event);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(LimitRevealFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(LimitRevealFragment.this);
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
        BaseFragment.collectDuxoState$default(this, null, new C124861(null), 1, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1051216377);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1051216377, i2, -1, "com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealFragment.ComposeContent (LimitRevealFragment.kt:59)");
            }
            Companion companion = INSTANCE;
            String epoch = formatEpoch(((Args) companion.getArgs((Fragment) this)).getPremiumCreditLimitExpiresAt());
            long limit = ((Args) companion.getArgs((Fragment) this)).getLimit();
            composerStartRestartGroup.startReplaceGroup(-901617083);
            boolean z = (((Args) companion.getArgs((Fragment) this)).getPremiumCreditLimitChoices().isEmpty() || epoch == null || !((LimitRevealState) FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7).getValue()).getInPremiumCreditLimitExperiment()) ? false : true;
            composerStartRestartGroup.endReplaceGroup();
            PremiumCreditLimitChoice premiumCreditLimitChoice = (PremiumCreditLimitChoice) CollectionsKt.lastOrNull((List) ((Args) companion.getArgs((Fragment) this)).getPremiumCreditLimitChoices());
            Long lValueOf = premiumCreditLimitChoice != null ? Long.valueOf(premiumCreditLimitChoice.getNewCreditLimitMicro()) : null;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LimitRevealFragment.ComposeContent$lambda$2$lambda$1(this.f$0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            LimitRevealComposable2.LimitReveal(limit, lValueOf, epoch, (Function0) objRememberedValue, z, null, composerStartRestartGroup, 0, 32);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.limitreveal.LimitRevealFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LimitRevealFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2$lambda$1(LimitRevealFragment limitRevealFragment) {
        limitRevealFragment.getCallbacks().onContinue(CreditApplicationDuxo8.NextPage.INSTANCE);
        return Unit.INSTANCE;
    }

    /* compiled from: LimitRevealFragment.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ4\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0017HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealFragment$Args;", "Landroid/os/Parcelable;", "limit", "", "premiumCreditLimitChoices", "", "Lcom/robinhood/android/models/creditcard/api/graphql/PremiumCreditLimitChoice;", "premiumCreditLimitExpiresAt", "<init>", "(JLjava/util/List;Ljava/lang/Long;)V", "getLimit", "()J", "getPremiumCreditLimitChoices", "()Ljava/util/List;", "getPremiumCreditLimitExpiresAt", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(JLjava/util/List;Ljava/lang/Long;)Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealFragment$Args;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final long limit;
        private final List<PremiumCreditLimitChoice> premiumCreditLimitChoices;
        private final Long premiumCreditLimitExpiresAt;

        /* compiled from: LimitRevealFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                long j = parcel.readLong();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(parcel.readParcelable(Args.class.getClassLoader()));
                }
                return new Args(j, arrayList, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Args copy$default(Args args, long j, List list, Long l, int i, Object obj) {
            if ((i & 1) != 0) {
                j = args.limit;
            }
            if ((i & 2) != 0) {
                list = args.premiumCreditLimitChoices;
            }
            if ((i & 4) != 0) {
                l = args.premiumCreditLimitExpiresAt;
            }
            return args.copy(j, list, l);
        }

        /* renamed from: component1, reason: from getter */
        public final long getLimit() {
            return this.limit;
        }

        public final List<PremiumCreditLimitChoice> component2() {
            return this.premiumCreditLimitChoices;
        }

        /* renamed from: component3, reason: from getter */
        public final Long getPremiumCreditLimitExpiresAt() {
            return this.premiumCreditLimitExpiresAt;
        }

        public final Args copy(long limit, List<PremiumCreditLimitChoice> premiumCreditLimitChoices, Long premiumCreditLimitExpiresAt) {
            Intrinsics.checkNotNullParameter(premiumCreditLimitChoices, "premiumCreditLimitChoices");
            return new Args(limit, premiumCreditLimitChoices, premiumCreditLimitExpiresAt);
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
            return this.limit == args.limit && Intrinsics.areEqual(this.premiumCreditLimitChoices, args.premiumCreditLimitChoices) && Intrinsics.areEqual(this.premiumCreditLimitExpiresAt, args.premiumCreditLimitExpiresAt);
        }

        public int hashCode() {
            int iHashCode = ((Long.hashCode(this.limit) * 31) + this.premiumCreditLimitChoices.hashCode()) * 31;
            Long l = this.premiumCreditLimitExpiresAt;
            return iHashCode + (l == null ? 0 : l.hashCode());
        }

        public String toString() {
            return "Args(limit=" + this.limit + ", premiumCreditLimitChoices=" + this.premiumCreditLimitChoices + ", premiumCreditLimitExpiresAt=" + this.premiumCreditLimitExpiresAt + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeLong(this.limit);
            List<PremiumCreditLimitChoice> list = this.premiumCreditLimitChoices;
            dest.writeInt(list.size());
            Iterator<PremiumCreditLimitChoice> it = list.iterator();
            while (it.hasNext()) {
                dest.writeParcelable(it.next(), flags);
            }
            Long l = this.premiumCreditLimitExpiresAt;
            if (l == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeLong(l.longValue());
            }
        }

        public Args(long j, List<PremiumCreditLimitChoice> premiumCreditLimitChoices, Long l) {
            Intrinsics.checkNotNullParameter(premiumCreditLimitChoices, "premiumCreditLimitChoices");
            this.limit = j;
            this.premiumCreditLimitChoices = premiumCreditLimitChoices;
            this.premiumCreditLimitExpiresAt = l;
        }

        public final long getLimit() {
            return this.limit;
        }

        public final List<PremiumCreditLimitChoice> getPremiumCreditLimitChoices() {
            return this.premiumCreditLimitChoices;
        }

        public final Long getPremiumCreditLimitExpiresAt() {
            return this.premiumCreditLimitExpiresAt;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatEpoch(Long epochMilli) {
        if (epochMilli != null) {
            return Instant.ofEpochMilli(epochMilli.longValue()).atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("MMM, d"));
        }
        return null;
    }

    /* compiled from: LimitRevealFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealFragment;", "Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/LimitRevealFragment$Args;", "<init>", "()V", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<LimitRevealFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(LimitRevealFragment limitRevealFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, limitRevealFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public LimitRevealFragment newInstance(Args args) {
            return (LimitRevealFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(LimitRevealFragment limitRevealFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, limitRevealFragment, args);
        }
    }
}
