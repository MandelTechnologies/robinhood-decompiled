package com.robinhood.android.directdeposit.p101ui.p102v3;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import androidx.compose.p011ui.hapticfeedback.HapticFeedback;
import androidx.compose.p011ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.snackbar.RdsSnackbar;
import com.robinhood.android.directdeposit.C14044R;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.librobinhood.data.store.AccountRoutingDetailsStore;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
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
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: DirectDepositV3ManualSetupFragment.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u00010B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u0016\u0010!\u001a\u00020\u00162\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#H\u0002J\r\u0010%\u001a\u00020\u0016H\u0017¢\u0006\u0002\u0010&J;\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020,2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0002\u0010/R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012¨\u00061²\u0006\n\u00102\u001a\u000203X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3ManualSetupFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "callbacks", "Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3ManualSetupFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3ManualSetupFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3ManualSetupDuxo;", "getDuxo", "()Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3ManualSetupDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onAttach", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "handleEvent", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositSetupCompletedEvent;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "copyToClipboardWithHapticFeedback", "text", "", "clipboardLabel", "haptic", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "toastTextRes", "", "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/hapticfeedback/HapticFeedback;Ljava/lang/Integer;Landroid/view/View;)V", "Callbacks", "feature-direct-deposit_externalDebug", "viewState", "Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3ManualSetupViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectDepositV3ManualSetupFragment extends GenericComposeFragment implements AutoLoggableFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectDepositV3ManualSetupFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3ManualSetupFragment$Callbacks;", 0))};
    public static final int $stable = 8;
    private final Screen eventScreen = new Screen(null, null, getScreenName(), null, 11, null);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.directdeposit.ui.v3.DirectDepositV3ManualSetupFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, DirectDepositV3ManualSetupDuxo.class);

    /* compiled from: DirectDepositV3ManualSetupFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositV3ManualSetupFragment$Callbacks;", "", "onGetPrefilledForm", "", "onManualDirectDepositFlowCompleted", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onGetPrefilledForm();

        void onManualDirectDepositFlowCompleted();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$8(DirectDepositV3ManualSetupFragment directDepositV3ManualSetupFragment, int i, Composer composer, int i2) {
        directDepositV3ManualSetupFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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
    public final void handleEvent(final Event<DirectDepositV3ManualSetupDuxo2> event) {
        EventConsumer<DirectDepositV3ManualSetupDuxo2> eventConsumerInvoke;
        if (!(event.getData() instanceof DirectDepositV3ManualSetupDuxo2) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.directdeposit.ui.v3.DirectDepositV3ManualSetupFragment$handleEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m13352invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m13352invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                this.getCallbacks().onManualDirectDepositFlowCompleted();
            }
        });
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return this.eventScreen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DirectDepositV3ManualSetupDuxo getDuxo() {
        return (DirectDepositV3ManualSetupDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    /* compiled from: DirectDepositV3ManualSetupFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.directdeposit.ui.v3.DirectDepositV3ManualSetupFragment$onViewCreated$1", m3645f = "DirectDepositV3ManualSetupFragment.kt", m3646l = {55}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.directdeposit.ui.v3.DirectDepositV3ManualSetupFragment$onViewCreated$1 */
    static final class C141671 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C141671(Continuation<? super C141671> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DirectDepositV3ManualSetupFragment.this.new C141671(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C141671) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: DirectDepositV3ManualSetupFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.directdeposit.ui.v3.DirectDepositV3ManualSetupFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ DirectDepositV3ManualSetupFragment $tmp0;

            AnonymousClass1(DirectDepositV3ManualSetupFragment directDepositV3ManualSetupFragment) {
                this.$tmp0 = directDepositV3ManualSetupFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, DirectDepositV3ManualSetupFragment.class, "handleEvent", "handleEvent(Lcom/robinhood/android/udf/event/Event;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(Event<DirectDepositV3ManualSetupDuxo2> event, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$handleEvent = C141671.invokeSuspend$handleEvent(this.$tmp0, event, continuation);
                return objInvokeSuspend$handleEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$handleEvent : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((Event<DirectDepositV3ManualSetupDuxo2>) obj, (Continuation<? super Unit>) continuation);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowFilterNotNull = FlowKt.filterNotNull(DirectDepositV3ManualSetupFragment.this.getDuxo().getEventFlow());
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DirectDepositV3ManualSetupFragment.this);
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
        public static final /* synthetic */ Object invokeSuspend$handleEvent(DirectDepositV3ManualSetupFragment directDepositV3ManualSetupFragment, Event event, Continuation continuation) {
            directDepositV3ManualSetupFragment.handleEvent(event);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C141671(null), 1, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1357180711);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1357180711, i2, -1, "com.robinhood.android.directdeposit.ui.v3.DirectDepositV3ManualSetupFragment.ComposeContent (DirectDepositV3ManualSetupFragment.kt:65)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            DirectDepositV3ManualSetupViewState directDepositV3ManualSetupViewStateComposeContent$lambda$2 = ComposeContent$lambda$2(snapshotState4CollectAsStateWithLifecycle);
            Callbacks callbacks = getCallbacks();
            DirectDepositV3ManualSetupDuxo duxo = getDuxo();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new DirectDepositV3ManualSetupFragment2(duxo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            KFunction kFunction = (KFunction) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.directdeposit.ui.v3.DirectDepositV3ManualSetupFragment$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DirectDepositV3ManualSetupFragment.ComposeContent$lambda$5$lambda$4(this.f$0, snapshotState4CollectAsStateWithLifecycle, (HapticFeedback) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1 function1 = (Function1) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(this) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.directdeposit.ui.v3.DirectDepositV3ManualSetupFragment$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return DirectDepositV3ManualSetupFragment.ComposeContent$lambda$7$lambda$6(this.f$0, snapshotState4CollectAsStateWithLifecycle, (HapticFeedback) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            DirectDepositManualSetupComposable.DirectDepositManualSetupComposable(directDepositV3ManualSetupViewStateComposeContent$lambda$2, callbacks, function1, (Function1) objRememberedValue3, (Function0) kFunction, composerStartRestartGroup, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.directdeposit.ui.v3.DirectDepositV3ManualSetupFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DirectDepositV3ManualSetupFragment.ComposeContent$lambda$8(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$7$lambda$6(DirectDepositV3ManualSetupFragment directDepositV3ManualSetupFragment, SnapshotState4 snapshotState4, HapticFeedback haptic) {
        Intrinsics.checkNotNullParameter(haptic, "haptic");
        AccountRoutingDetailsStore.RoutingDetails routingDetails = ComposeContent$lambda$2(snapshotState4).getRoutingDetails();
        String routingNumber = routingDetails != null ? routingDetails.getRoutingNumber() : null;
        if (routingNumber == null) {
            routingNumber = "";
        }
        String string2 = directDepositV3ManualSetupFragment.getString(C14044R.string.rhy_routing_details_routing_number);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        directDepositV3ManualSetupFragment.copyToClipboardWithHapticFeedback(routingNumber, string2, haptic, Integer.valueOf(C14044R.string.rhy_routing_details_routing_number_copied), directDepositV3ManualSetupFragment.getView());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5$lambda$4(DirectDepositV3ManualSetupFragment directDepositV3ManualSetupFragment, SnapshotState4 snapshotState4, HapticFeedback haptic) {
        Intrinsics.checkNotNullParameter(haptic, "haptic");
        AccountRoutingDetailsStore.RoutingDetails routingDetails = ComposeContent$lambda$2(snapshotState4).getRoutingDetails();
        String accountNumber = routingDetails != null ? routingDetails.getAccountNumber() : null;
        if (accountNumber == null) {
            accountNumber = "";
        }
        String string2 = directDepositV3ManualSetupFragment.getString(C14044R.string.rhy_routing_details_account_number);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        directDepositV3ManualSetupFragment.copyToClipboardWithHapticFeedback(accountNumber, string2, haptic, Integer.valueOf(C14044R.string.rhy_routing_details_account_number_copied), directDepositV3ManualSetupFragment.getView());
        return Unit.INSTANCE;
    }

    private static final DirectDepositV3ManualSetupViewState ComposeContent$lambda$2(SnapshotState4<DirectDepositV3ManualSetupViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    static /* synthetic */ void copyToClipboardWithHapticFeedback$default(DirectDepositV3ManualSetupFragment directDepositV3ManualSetupFragment, String str, String str2, HapticFeedback hapticFeedback, Integer num, View view, int i, Object obj) {
        if ((i & 8) != 0) {
            num = null;
        }
        directDepositV3ManualSetupFragment.copyToClipboardWithHapticFeedback(str, str2, hapticFeedback, num, view);
    }

    private final void copyToClipboardWithHapticFeedback(String text, String clipboardLabel, HapticFeedback haptic, Integer toastTextRes, View view) {
        ClipboardManager clipboardManager;
        if (StringsKt.isBlank(text)) {
            return;
        }
        android.content.Context context = getContext();
        if (context != null && (clipboardManager = ContextSystemServices.getClipboardManager(context)) != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(clipboardLabel, text));
        }
        if (toastTextRes != null && view != null) {
            RdsSnackbar.INSTANCE.make(view, toastTextRes.intValue(), 0).show();
        }
        haptic.mo7039performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m7046getLongPress5zf0vsI());
    }
}
