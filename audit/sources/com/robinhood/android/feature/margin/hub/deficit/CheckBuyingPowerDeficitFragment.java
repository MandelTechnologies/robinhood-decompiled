package com.robinhood.android.feature.margin.hub.deficit;

import android.content.Context;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.feature.margin.hub.C16839R;
import com.robinhood.android.feature.margin.hub.composables.BuyingPowerHubComposable;
import com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerDeficitDuxo2;
import com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerDeficitFragment;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.models.api.ApiBuyingPowerBreakdown;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CheckBuyingPowerDeficitFragment.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J)\u0010\u0015\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017H\u0003¢\u0006\u0002\u0010\u0019R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\u0012\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/deficit/CheckBuyingPowerDeficitFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/feature/margin/hub/deficit/CheckBuyingPowerDeficitDuxo;", "getDuxo", "()Lcom/robinhood/android/feature/margin/hub/deficit/CheckBuyingPowerDeficitDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/feature/margin/hub/deficit/CheckBuyingPowerDeficitFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/feature/margin/hub/deficit/CheckBuyingPowerDeficitFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onBackPressed", "", "LoadingError", "onRetry", "Lkotlin/Function0;", "onDismissed", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Callbacks", "feature-margin-hub_externalDebug", "state", "Lcom/robinhood/android/feature/margin/hub/deficit/CheckBuyingPowerViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/feature/margin/hub/deficit/CheckBuyingPowerEvent;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CheckBuyingPowerDeficitFragment extends GenericComposeFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CheckBuyingPowerDeficitFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/feature/margin/hub/deficit/CheckBuyingPowerDeficitFragment$Callbacks;", 0))};
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, CheckBuyingPowerDeficitDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerDeficitFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof CheckBuyingPowerDeficitFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: CheckBuyingPowerDeficitFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/deficit/CheckBuyingPowerDeficitFragment$Callbacks;", "", "onNavigateToDestinationEventReceived", "", "accountNumber", "", "showMarginResolutionScreen", "", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onNavigateToDestinationEventReceived(String accountNumber, boolean showMarginResolutionScreen);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$7(CheckBuyingPowerDeficitFragment checkBuyingPowerDeficitFragment, int i, Composer composer, int i2) {
        checkBuyingPowerDeficitFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadingError$lambda$8(CheckBuyingPowerDeficitFragment checkBuyingPowerDeficitFragment, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        checkBuyingPowerDeficitFragment.LoadingError(function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final CheckBuyingPowerDeficitDuxo getDuxo() {
        return (CheckBuyingPowerDeficitDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        EventConsumer<CheckBuyingPowerDeficitDuxo2> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(2024203454);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2024203454, i2, -1, "com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerDeficitFragment.ComposeContent (CheckBuyingPowerDeficitFragment.kt:25)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final StateFlow<Event<CheckBuyingPowerDeficitDuxo2>> eventFlow = getDuxo().getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerDeficitFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerDeficitFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerDeficitFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CheckBuyingPowerDeficitFragment.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerDeficitFragment$ComposeContent$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                            if ((event != null ? event.getData() : null) instanceof CheckBuyingPowerDeficitDuxo2) {
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
            Event<CheckBuyingPowerDeficitDuxo2> value = eventFlow.getValue();
            Event<CheckBuyingPowerDeficitDuxo2> event = value;
            if (!((event != null ? event.getData() : null) instanceof CheckBuyingPowerDeficitDuxo2)) {
                value = null;
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endReplaceGroup();
            final Event<CheckBuyingPowerDeficitDuxo2> eventComposeContent$lambda$1 = ComposeContent$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            if (eventComposeContent$lambda$1 != null && (eventComposeContent$lambda$1.getData() instanceof CheckBuyingPowerDeficitDuxo2.NavigateToDestination) && (eventConsumerInvoke = eventComposeContent$lambda$1.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventComposeContent$lambda$1, new Function1() { // from class: com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerDeficitFragment$ComposeContent$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m14497invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m14497invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        CheckBuyingPowerDeficitDuxo2.NavigateToDestination navigateToDestination = (CheckBuyingPowerDeficitDuxo2.NavigateToDestination) eventComposeContent$lambda$1.getData();
                        this.getCallbacks().onNavigateToDestinationEventReceived(navigateToDestination.getAccountNumber(), navigateToDestination.getShowMarginResolutionScreen());
                    }
                });
            }
            composerStartRestartGroup.startReplaceGroup(-360651718);
            Result<ApiBuyingPowerBreakdown> resultM14499getBuyingPowerBreakdownxLWZpok = ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle).m14499getBuyingPowerBreakdownxLWZpok();
            if ((resultM14499getBuyingPowerBreakdownxLWZpok != null ? Result.m28553exceptionOrNullimpl(resultM14499getBuyingPowerBreakdownxLWZpok.getValue()) : null) != null) {
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerDeficitFragment$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CheckBuyingPowerDeficitFragment.ComposeContent$lambda$4$lambda$3(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0<Unit> function0 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerDeficitFragment$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CheckBuyingPowerDeficitFragment.ComposeContent$lambda$6$lambda$5(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                LoadingError(function0, (Function0) objRememberedValue2, composerStartRestartGroup, (i2 << 6) & 896);
            }
            composerStartRestartGroup.endReplaceGroup();
            BuyingPowerHubComposable.BuyingPowerHubLoadingScreen(WindowInsetsPadding_androidKt.systemBarsPadding(Modifier.INSTANCE), composerStartRestartGroup, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerDeficitFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CheckBuyingPowerDeficitFragment.ComposeContent$lambda$7(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4$lambda$3(CheckBuyingPowerDeficitFragment checkBuyingPowerDeficitFragment) {
        checkBuyingPowerDeficitFragment.getDuxo().retryLoadingBuyingPowerBreakdown();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$6$lambda$5(CheckBuyingPowerDeficitFragment checkBuyingPowerDeficitFragment) {
        FragmentActivity activity = checkBuyingPowerDeficitFragment.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return true;
        }
        activity.finish();
        return true;
    }

    private final void LoadingError(final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(385637153);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(385637153, i2, -1, "com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerDeficitFragment.LoadingError (CheckBuyingPowerDeficitFragment.kt:52)");
            }
            BentoAlertDialog.BentoAlertDialog(StringResources_androidKt.stringResource(C16839R.string.load_buying_power_error_dialog_title, composerStartRestartGroup, 0), new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C16839R.string.load_buying_power_error_dialog_description, composerStartRestartGroup, 0)), new BentoAlertButton(StringResources_androidKt.stringResource(C16839R.string.load_buying_power_error_dialog_cta_label, composerStartRestartGroup, 0), function0), null, null, null, false, null, function02, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6) | ((i2 << 21) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.margin.hub.deficit.CheckBuyingPowerDeficitFragment$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CheckBuyingPowerDeficitFragment.LoadingError$lambda$8(this.f$0, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final CheckBuyingPowerViewState ComposeContent$lambda$0(SnapshotState4<CheckBuyingPowerViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CheckBuyingPowerDeficitDuxo2> ComposeContent$lambda$1(SnapshotState4<Event<CheckBuyingPowerDeficitDuxo2>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
