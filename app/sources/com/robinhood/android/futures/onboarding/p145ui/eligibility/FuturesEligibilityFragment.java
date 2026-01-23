package com.robinhood.android.futures.onboarding.p145ui.eligibility;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.futures.onboarding.p145ui.UserHasNoBrokerageAccountBottomSheet;
import com.robinhood.android.futures.onboarding.p145ui.eligibility.FuturesEligibilityDuxo4;
import com.robinhood.android.futures.onboarding.p145ui.eligibility.FuturesEligibilityFragment;
import com.robinhood.android.margin.contracts.EnableMarginInvestingKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.onboarding.contracts.PostUserCreationShimIntentKey;
import com.robinhood.android.options.contracts.OptionOnboarding;
import com.robinhood.android.options.contracts.OptionOnboarding2;
import com.robinhood.android.regiongate.FuturesTradingOrEventContractsRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.ceres.p284v1.AccountFuturesEligibilityStatusDto;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: FuturesEligibilityFragment.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 32\u00020\u00012\u00020\u0002:\u0003123B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0019\u001a\u00020\u001aH\u0017¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\u001a\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010&\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0017\u0010'\u001a\u00020\u001a2\b\u0010(\u001a\u0004\u0018\u00010)H\u0003¢\u0006\u0002\u0010*J\t\u0010+\u001a\u00020!H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00064²\u0006\n\u00105\u001a\u000206X\u008a\u0084\u0002²\u0006\u0012\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u000107X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "duxo", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityDuxo;", "getDuxo", "()Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ineligibleScreenInfo", "Lcom/robinhood/rosetta/eventlogging/Screen;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "handleEvent", "event", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityEvent;", "showUserHasNoBrokerageAccountBottomSheet", "onPrimaryButtonClicked", "", "dialogId", "", "passthroughArgs", "Landroid/os/Bundle;", "onSecondaryButtonClicked", "Ineligible", "rhsAccountNumber", "", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-futures-onboarding_externalDebug", "state", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityViewState;", "Lcom/robinhood/android/udf/event/Event;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FuturesEligibilityFragment extends GenericComposeFragment implements RegionGated {
    public EventLogger eventLogger;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(FuturesEligibilityFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(FuturesTradingOrEventContractsRegionGate.INSTANCE);

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, FuturesEligibilityDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof FuturesEligibilityFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    private final Screen ineligibleScreenInfo = new Screen(Screen.Name.FUTURES_ONBOARDING_ELIGIBILITY_CHECK, null, null, null, 14, null);

    /* compiled from: FuturesEligibilityFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityFragment$Callbacks;", "", "onUserBecameEligible", "", "onUserAlreadyHasAccount", "onUsersApplicationIsInReview", "onUserIsNotEligible", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onUserAlreadyHasAccount();

        void onUserBecameEligible();

        void onUserIsNotEligible();

        void onUsersApplicationIsInReview();
    }

    /* compiled from: FuturesEligibilityFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountFuturesEligibilityStatusDto.values().length];
            try {
                iArr[AccountFuturesEligibilityStatusDto.INELIGIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountFuturesEligibilityStatusDto.ELIGIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountFuturesEligibilityStatusDto.ALREADY_HAS_ACCOUNT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountFuturesEligibilityStatusDto.IN_MANUAL_REVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountFuturesEligibilityStatusDto.ACCOUNT_FUTURES_ELIGIBILITY_STATUS_UNSPECIFIED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(FuturesEligibilityFragment futuresEligibilityFragment, int i, Composer composer, int i2) {
        futuresEligibilityFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ineligible$lambda$3(FuturesEligibilityFragment futuresEligibilityFragment, String str, int i, Composer composer, int i2) {
        futuresEligibilityFragment.Ineligible(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
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

    private final FuturesEligibilityDuxo getDuxo() {
        return (FuturesEligibilityDuxo) this.duxo.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x011d  */
    @Override // com.robinhood.compose.app.GenericComposeFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        EventConsumer<FuturesEligibilityDuxo4> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(-66122195);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-66122195, i2, -1, "com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityFragment.ComposeContent (FuturesEligibilityFragment.kt:50)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final StateFlow<Event<FuturesEligibilityDuxo4>> eventFlow = getDuxo().getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "FuturesEligibilityFragment.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                            Event event = (Event) obj;
                            if ((event != null ? event.getData() : null) instanceof FuturesEligibilityDuxo4) {
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

                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super Event<?>> flowCollector, Continuation continuation) {
                    Object objCollect = eventFlow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                }
            };
            Event<FuturesEligibilityDuxo4> value = eventFlow.getValue();
            Event<FuturesEligibilityDuxo4> event = value;
            if (!((event != null ? event.getData() : null) instanceof FuturesEligibilityDuxo4)) {
                value = null;
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endReplaceGroup();
            final Event<FuturesEligibilityDuxo4> eventComposeContent$lambda$1 = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            if (eventComposeContent$lambda$1 != null && (eventComposeContent$lambda$1.getData() instanceof FuturesEligibilityDuxo4) && (eventConsumerInvoke = eventComposeContent$lambda$1.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventComposeContent$lambda$1, new Function1() { // from class: com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityFragment$ComposeContent$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m14701invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m14701invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        this.handleEvent((FuturesEligibilityDuxo4) eventComposeContent$lambda$1.getData());
                    }
                });
            }
            AccountFuturesEligibilityStatusDto eligibilityStatus = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getEligibilityStatus();
            int i3 = eligibilityStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[eligibilityStatus.ordinal()];
            if (i3 == -1) {
                composerStartRestartGroup.startReplaceGroup(881103294);
                LoadingScreenComposablesKt.PromoLoadingScreenComposable(null, 1, composerStartRestartGroup, 48, 1);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else if (i3 != 1) {
                if (i3 != 2 && i3 != 3 && i3 != 4 && i3 != 5) {
                    composerStartRestartGroup.startReplaceGroup(881088858);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(881103294);
                LoadingScreenComposablesKt.PromoLoadingScreenComposable(null, 1, composerStartRestartGroup, 48, 1);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
            } else {
                composerStartRestartGroup.startReplaceGroup(881091390);
                Ineligible(ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).getFuturesEligibleRhsAccountNumber(), composerStartRestartGroup, (i2 << 3) & 112);
                composerStartRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesEligibilityFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(FuturesEligibilityDuxo4 event) {
        ActivityErrorHandler activityErrorHandler;
        if (Intrinsics.areEqual(event, FuturesEligibilityDuxo4.UserHasNoBrokerageAccountEvent.INSTANCE)) {
            showUserHasNoBrokerageAccountBottomSheet();
            return;
        }
        if (Intrinsics.areEqual(event, FuturesEligibilityDuxo4.UserBecameEligibleEvent.INSTANCE)) {
            getCallbacks().onUserBecameEligible();
            return;
        }
        if (event instanceof FuturesEligibilityDuxo4.UserHasAccountEvent) {
            getCallbacks().onUserAlreadyHasAccount();
            return;
        }
        if (Intrinsics.areEqual(event, FuturesEligibilityDuxo4.UsersApplicationPendingReviewEvent.INSTANCE)) {
            getCallbacks().onUsersApplicationIsInReview();
            return;
        }
        if (Intrinsics.areEqual(event, FuturesEligibilityDuxo4.UserIsIneligibleButHasOptionsOrMargin.INSTANCE)) {
            getCallbacks().onUserIsNotEligible();
            return;
        }
        if (!(event instanceof FuturesEligibilityDuxo4.NetworkError)) {
            throw new NoWhenBranchMatchedException();
        }
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity == null || (activityErrorHandler = baseActivity.getActivityErrorHandler()) == null) {
            return;
        }
        AbsErrorHandler.handleError$default(activityErrorHandler, ((FuturesEligibilityDuxo4.NetworkError) event).getThrowable(), false, 2, null);
    }

    private final void showUserHasNoBrokerageAccountBottomSheet() {
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        RhBottomSheetDialogFragment rhBottomSheetDialogFragmentShowUserHasNoBrokerageAccountBottomSheet = UserHasNoBrokerageAccountBottomSheet.showUserHasNoBrokerageAccountBottomSheet(resources, ((Args) INSTANCE.getArgs((Fragment) this)).isEventsContracts());
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        rhBottomSheetDialogFragmentShowUserHasNoBrokerageAccountBottomSheet.show(childFragmentManager, "noBrokerageAccountBottomSheet");
    }

    private static final FuturesEligibilityViewState ComposeContent$lambda$0(SnapshotState4<FuturesEligibilityViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<FuturesEligibilityDuxo4> ComposeContent$lambda$1(SnapshotState4<Event<FuturesEligibilityDuxo4>> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseRhBottomSheetDialogHostFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onPrimaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        if (dialogId == 73462) {
            Navigator navigator = getNavigator();
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new PostUserCreationShimIntentKey(false, null, null, false, null, 31, null), null, false, null, null, 60, null);
            return true;
        }
        return super.onPrimaryButtonClicked(dialogId, passthroughArgs);
    }

    @Override // com.robinhood.android.common.p088ui.BaseRhBottomSheetDialogHostFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhBottomSheetDialogFragment.OnClickListener
    public boolean onSecondaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        if (dialogId == 73462) {
            requireBaseActivity().onBackPressed();
            return true;
        }
        return super.onPrimaryButtonClicked(dialogId, passthroughArgs);
    }

    /* compiled from: FuturesEligibilityFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityFragment$Ineligible$1 */
    static final class C173911 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ String $rhsAccountNumber;

        C173911(String str) {
            this.$rhsAccountNumber = str;
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
                ComposerKt.traceEventStart(-568203930, i, -1, "com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityFragment.Ineligible.<anonymous> (FuturesEligibilityFragment.kt:112)");
            }
            boolean zIsEventsContracts = ((Args) FuturesEligibilityFragment.INSTANCE.getArgs((Fragment) FuturesEligibilityFragment.this)).isEventsContracts();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(FuturesEligibilityFragment.this) | composer.changed(this.$rhsAccountNumber);
            final FuturesEligibilityFragment futuresEligibilityFragment = FuturesEligibilityFragment.this;
            final String str = this.$rhsAccountNumber;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityFragment$Ineligible$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FuturesEligibilityFragment.C173911.invoke$lambda$2$lambda$1(futuresEligibilityFragment, str);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composer.changedInstance(FuturesEligibilityFragment.this) | composer.changed(this.$rhsAccountNumber);
            final FuturesEligibilityFragment futuresEligibilityFragment2 = FuturesEligibilityFragment.this;
            final String str2 = this.$rhsAccountNumber;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityFragment$Ineligible$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return FuturesEligibilityFragment.C173911.invoke$lambda$4$lambda$3(futuresEligibilityFragment2, str2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            IneligibleScreen.IneligibleScreen(zIsEventsContracts, function0, (Function0) objRememberedValue2, ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, new UserInteractionEventDescriptor(null, FuturesEligibilityFragment.this.ineligibleScreenInfo, null, null, null, null, 61, null), true, false, true, false, false, null, 116, null), composer, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(FuturesEligibilityFragment futuresEligibilityFragment, String str) {
            EventLogger.DefaultImpls.logTap$default(futuresEligibilityFragment.getEventLogger(), UserInteractionEventData.Action.ENABLE_OPTIONS_TRADING, futuresEligibilityFragment.ineligibleScreenInfo, null, null, null, false, 60, null);
            if (str != null) {
                Navigator navigator = futuresEligibilityFragment.getNavigator();
                Context contextRequireContext = futuresEligibilityFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new OptionOnboarding(new OptionOnboarding2.AccountNumber(str), new OptionOnboarding.OptionOnboardingSource.Legacy("futures_onboarding"), null, 4, null), null, false, null, null, 60, null);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3(FuturesEligibilityFragment futuresEligibilityFragment, String str) {
            EventLogger.DefaultImpls.logTap$default(futuresEligibilityFragment.getEventLogger(), UserInteractionEventData.Action.ENABLE_MARGIN_INVESTING, futuresEligibilityFragment.ineligibleScreenInfo, null, null, null, false, 60, null);
            Navigator navigator = futuresEligibilityFragment.getNavigator();
            Context contextRequireContext = futuresEligibilityFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new EnableMarginInvestingKey(str, null, null, false, false, 22, null), null, false, null, null, 60, null);
            return Unit.INSTANCE;
        }
    }

    private final void Ineligible(final String str, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(595323345);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(this) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(595323345, i2, -1, "com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityFragment.Ineligible (FuturesEligibilityFragment.kt:110)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-568203930, true, new C173911(str), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.onboarding.ui.eligibility.FuturesEligibilityFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FuturesEligibilityFragment.Ineligible$lambda$3(this.f$0, str, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: FuturesEligibilityFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityFragment$Args;", "Landroid/os/Parcelable;", "status", "Lcom/robinhood/ceres/v1/AccountFuturesEligibilityStatusDto;", "isEventsContracts", "", "<init>", "(Lcom/robinhood/ceres/v1/AccountFuturesEligibilityStatusDto;Z)V", "getStatus", "()Lcom/robinhood/ceres/v1/AccountFuturesEligibilityStatusDto;", "()Z", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 0;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final boolean isEventsContracts;
        private final AccountFuturesEligibilityStatusDto status;

        /* compiled from: FuturesEligibilityFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((AccountFuturesEligibilityStatusDto) parcel.readParcelable(Args.class.getClassLoader()), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, AccountFuturesEligibilityStatusDto accountFuturesEligibilityStatusDto, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                accountFuturesEligibilityStatusDto = args.status;
            }
            if ((i & 2) != 0) {
                z = args.isEventsContracts;
            }
            return args.copy(accountFuturesEligibilityStatusDto, z);
        }

        /* renamed from: component1, reason: from getter */
        public final AccountFuturesEligibilityStatusDto getStatus() {
            return this.status;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsEventsContracts() {
            return this.isEventsContracts;
        }

        public final Args copy(AccountFuturesEligibilityStatusDto status, boolean isEventsContracts) {
            return new Args(status, isEventsContracts);
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
            return this.status == args.status && this.isEventsContracts == args.isEventsContracts;
        }

        public int hashCode() {
            AccountFuturesEligibilityStatusDto accountFuturesEligibilityStatusDto = this.status;
            return ((accountFuturesEligibilityStatusDto == null ? 0 : accountFuturesEligibilityStatusDto.hashCode()) * 31) + Boolean.hashCode(this.isEventsContracts);
        }

        public String toString() {
            return "Args(status=" + this.status + ", isEventsContracts=" + this.isEventsContracts + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.status, flags);
            dest.writeInt(this.isEventsContracts ? 1 : 0);
        }

        public Args(AccountFuturesEligibilityStatusDto accountFuturesEligibilityStatusDto, boolean z) {
            this.status = accountFuturesEligibilityStatusDto;
            this.isEventsContracts = z;
        }

        public final AccountFuturesEligibilityStatusDto getStatus() {
            return this.status;
        }

        public final boolean isEventsContracts() {
            return this.isEventsContracts;
        }
    }

    /* compiled from: FuturesEligibilityFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityFragment;", "Lcom/robinhood/android/futures/onboarding/ui/eligibility/FuturesEligibilityFragment$Args;", "<init>", "()V", "feature-futures-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<FuturesEligibilityFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(FuturesEligibilityFragment futuresEligibilityFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, futuresEligibilityFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public FuturesEligibilityFragment newInstance(Args args) {
            return (FuturesEligibilityFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(FuturesEligibilityFragment futuresEligibilityFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, futuresEligibilityFragment, args);
        }
    }
}
