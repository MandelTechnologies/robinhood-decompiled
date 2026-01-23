package com.robinhood.shared.security.verify.credentials.email;

import android.app.Activity;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.view.compose.LocalActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.security.verify.credentials.C39685R;
import com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposable;
import com.robinhood.shared.security.verify.credentials.email.UpdateEmailEvent;
import java.util.UUID;
import kotlin.Metadata;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: UpdateEmailComposable.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\"\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\u0004X\u008a\u008e\u0002²\u0006\f\u0010\r\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\u0012\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u008a\u0084\u0002"}, m3636d2 = {"UpdateEmailComposable", "", "onUpdateEmailSuccess", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/security/verify/credentials/email/UpdateEmailDuxo;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/security/verify/credentials/email/UpdateEmailDuxo;Landroidx/compose/runtime/Composer;II)V", "VerificationPrivacyDisclosureId", "feature-verify-credentials_externalDebug", "email", "privacyDisclosureRes", "", "viewState", "Lcom/robinhood/shared/security/verify/credentials/email/UpdateEmailViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/security/verify/credentials/email/UpdateEmailEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class UpdateEmailComposable {
    private static final String VerificationPrivacyDisclosureId = "VERIFICATION_PRIVACY_DISCLOSURE";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateEmailComposable$lambda$21(Function1 function1, Modifier modifier, UpdateEmailDuxo updateEmailDuxo, int i, int i2, Composer composer, int i3) {
        UpdateEmailComposable(function1, modifier, updateEmailDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04b1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UpdateEmailComposable(final Function1<? super String, Unit> onUpdateEmailSuccess, Modifier modifier, UpdateEmailDuxo updateEmailDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        UpdateEmailDuxo updateEmailDuxo2;
        int i4;
        final Modifier modifier3;
        final UpdateEmailDuxo updateEmailDuxo3;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        Event<UpdateEmailEvent> event;
        boolean zChangedInstance;
        Object objRememberedValue3;
        final Event<UpdateEmailEvent> eventUpdateEmailComposable$lambda$7;
        final Event<UpdateEmailEvent> eventUpdateEmailComposable$lambda$72;
        final Event<UpdateEmailEvent> eventUpdateEmailComposable$lambda$73;
        final Event<UpdateEmailEvent> eventUpdateEmailComposable$lambda$74;
        Integer numUpdateEmailComposable$lambda$4;
        SnapshotState4 snapshotState4;
        UpdateEmailDuxo updateEmailDuxo4;
        SnapshotState snapshotState2;
        final UpdateEmailDuxo updateEmailDuxo5;
        EventConsumer<UpdateEmailEvent> eventConsumerInvoke;
        EventConsumer<UpdateEmailEvent> eventConsumerInvoke2;
        EventConsumer<UpdateEmailEvent> eventConsumerInvoke3;
        EventConsumer<UpdateEmailEvent> eventConsumerInvoke4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onUpdateEmailSuccess, "onUpdateEmailSuccess");
        Composer composerStartRestartGroup = composer.startRestartGroup(1231242010);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onUpdateEmailSuccess) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    updateEmailDuxo2 = updateEmailDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(updateEmailDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    updateEmailDuxo2 = updateEmailDuxo;
                }
                i3 |= i6;
            } else {
                updateEmailDuxo2 = updateEmailDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(UpdateEmailDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposableKt$UpdateEmailComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposableKt$UpdateEmailComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i4 = i3 & (-897);
                        modifier3 = modifier4;
                        updateEmailDuxo3 = (UpdateEmailDuxo) baseDuxo;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1231242010, i4, -1, "com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposable (UpdateEmailComposable.kt:43)");
                        }
                        Object objConsume = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                        Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type android.app.Activity");
                        final Activity activity = (Activity) objConsume;
                        EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default("", null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        final SnapshotState snapshotState3 = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        Event<UpdateEmailEvent> event2 = null;
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(updateEmailDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        final StateFlow<Event<UpdateEmailEvent>> eventFlow = updateEmailDuxo3.getEventFlow();
                        composerStartRestartGroup.startReplaceGroup(-523522313);
                        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                        Lifecycle.State state = Lifecycle.State.STARTED;
                        CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                        Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposableKt$UpdateEmailComposable$$inlined$collectEventAsStateWithLifecycle$1

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposableKt$UpdateEmailComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposableKt$UpdateEmailComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "UpdateEmailComposable.kt", m3646l = {50}, m3647m = "emit")
                                /* renamed from: com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposableKt$UpdateEmailComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                        if ((event != null ? event.getData() : null) instanceof UpdateEmailEvent) {
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
                        Event<UpdateEmailEvent> value = eventFlow.getValue();
                        event = value;
                        if ((event == null ? event.getData() : null) instanceof UpdateEmailEvent) {
                            event2 = value;
                        }
                        int i7 = i4;
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, event2, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChangedInstance = composerStartRestartGroup.changedInstance(updateEmailDuxo3);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return UpdateEmailComposable.UpdateEmailComposable$lambda$9$lambda$8(updateEmailDuxo3, snapshotState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        final Function2<UUID, Boolean, Unit> function2RememberSuvLauncher = SuvLauncher.rememberSuvLauncher(navigator, (Function0) objRememberedValue3, null, composerStartRestartGroup, 0, 4);
                        Composer composer2 = composerStartRestartGroup;
                        eventUpdateEmailComposable$lambda$7 = UpdateEmailComposable$lambda$7(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventUpdateEmailComposable$lambda$7 != null) {
                            if ((eventUpdateEmailComposable$lambda$7.getData() instanceof UpdateEmailEvent.ShowPrivacyDisclosureDialog) && (eventConsumerInvoke4 = eventUpdateEmailComposable$lambda$7.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke4.consume(eventUpdateEmailComposable$lambda$7, new Function1() { // from class: com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposableKt$UpdateEmailComposable$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        m25678invoke(obj);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m25678invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        snapshotState3.setValue(Integer.valueOf(((UpdateEmailEvent.ShowPrivacyDisclosureDialog) eventUpdateEmailComposable$lambda$7.getData()).getPrivacyDisclosureRes()));
                                    }
                                });
                            }
                            Unit unit = Unit.INSTANCE;
                        }
                        eventUpdateEmailComposable$lambda$72 = UpdateEmailComposable$lambda$7(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventUpdateEmailComposable$lambda$72 != null) {
                            if ((eventUpdateEmailComposable$lambda$72.getData() instanceof UpdateEmailEvent.Success) && (eventConsumerInvoke3 = eventUpdateEmailComposable$lambda$72.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke3.consume(eventUpdateEmailComposable$lambda$72, new Function1() { // from class: com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposableKt$UpdateEmailComposable$$inlined$consumeIfType$2
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        m25679invoke(obj);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m25679invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        onUpdateEmailSuccess.invoke(((UpdateEmailEvent.Success) eventUpdateEmailComposable$lambda$72.getData()).getEmail());
                                    }
                                });
                            }
                            Unit unit2 = Unit.INSTANCE;
                        }
                        eventUpdateEmailComposable$lambda$73 = UpdateEmailComposable$lambda$7(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventUpdateEmailComposable$lambda$73 != null) {
                            if ((eventUpdateEmailComposable$lambda$73.getData() instanceof UpdateEmailEvent.Error) && (eventConsumerInvoke2 = eventUpdateEmailComposable$lambda$73.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke2.consume(eventUpdateEmailComposable$lambda$73, new Function1() { // from class: com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposableKt$UpdateEmailComposable$$inlined$consumeIfType$3
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                                        m25680invoke(obj);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m25680invoke(Object it) throws Throwable {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, activity, ((UpdateEmailEvent.Error) eventUpdateEmailComposable$lambda$73.getData()).getThrowable(), true, false, 0, Integer.valueOf(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome), 24, null);
                                    }
                                });
                            }
                            Unit unit3 = Unit.INSTANCE;
                        }
                        eventUpdateEmailComposable$lambda$74 = UpdateEmailComposable$lambda$7(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventUpdateEmailComposable$lambda$74 != null) {
                            if ((eventUpdateEmailComposable$lambda$74.getData() instanceof UpdateEmailEvent.VerificationWorkflow) && (eventConsumerInvoke = eventUpdateEmailComposable$lambda$74.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(eventUpdateEmailComposable$lambda$74, new Function1() { // from class: com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposableKt$UpdateEmailComposable$$inlined$consumeIfType$4
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                        m25681invoke(obj);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m25681invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        UpdateEmailEvent.VerificationWorkflow verificationWorkflow = (UpdateEmailEvent.VerificationWorkflow) eventUpdateEmailComposable$lambda$74.getData();
                                        function2RememberSuvLauncher.invoke(verificationWorkflow.getWorkflowId(), Boolean.valueOf(verificationWorkflow.isMigrated()));
                                    }
                                });
                            }
                            Unit unit4 = Unit.INSTANCE;
                        }
                        numUpdateEmailComposable$lambda$4 = UpdateEmailComposable$lambda$4(snapshotState3);
                        composer2.startReplaceGroup(2107611246);
                        if (numUpdateEmailComposable$lambda$4 != null) {
                            snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                            snapshotState2 = snapshotState;
                            updateEmailDuxo4 = updateEmailDuxo3;
                        } else {
                            int iIntValue = numUpdateEmailComposable$lambda$4.intValue();
                            String strStringResource = StringResources_androidKt.stringResource(C39685R.string.update_email_privacy_disclosure_title, composer2, 0);
                            BentoAlertDialog2.Body.MarkdownText markdownText = new BentoAlertDialog2.Body.MarkdownText(StringResources_androidKt.stringResource(iIntValue, composer2, 0));
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Screen.Name name = Screen.Name.REVAMP_LOGIN_UPDATE_EMAIL;
                            Screen screen = new Screen(name, null, null, null, 14, null);
                            Component.ComponentType componentType = Component.ComponentType.ALERT;
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(ModifiersKt.logScreenTransitions(companion2, new UserInteractionEventDescriptor(null, screen, null, null, new Component(componentType, VerificationPrivacyDisclosureId, null, 4, null), null, 45, null)), new UserInteractionEventDescriptor(null, new Screen(name, null, null, null, 14, null), UserInteractionEventData.Action.CONTINUE, null, new Component(componentType, VerificationPrivacyDisclosureId, null, 4, null), null, 41, null), false, false, false, true, false, null, 110, null);
                            String strStringResource2 = StringResources_androidKt.stringResource(C39685R.string.update_email_privacy_disclosure_primary_cta_text, composer2, 0);
                            composer2.startReplaceGroup(-1746271574);
                            boolean zChangedInstance3 = composer2.changedInstance(updateEmailDuxo3);
                            Object objRememberedValue5 = composer2.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue5 == companion.getEmpty()) {
                                objRememberedValue5 = new Function0() { // from class: com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposableKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return UpdateEmailComposable.UpdateEmailComposable$lambda$20$lambda$15$lambda$14(updateEmailDuxo3, snapshotState, snapshotState3);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue5);
                            }
                            composer2.endReplaceGroup();
                            BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue5, modifierAutoLogEvents$default, null, null, false, 56, null);
                            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(companion2, new UserInteractionEventDescriptor(null, new Screen(name, null, null, null, 14, null), UserInteractionEventData.Action.CANCEL, null, new Component(componentType, VerificationPrivacyDisclosureId, null, 4, null), null, 41, null), false, false, false, true, false, null, 110, null);
                            String strStringResource3 = StringResources_androidKt.stringResource(C39685R.string.update_email_privacy_disclosure_secondary_cta_text, composer2, 0);
                            composer2.startReplaceGroup(5004770);
                            Object objRememberedValue6 = composer2.rememberedValue();
                            if (objRememberedValue6 == companion.getEmpty()) {
                                objRememberedValue6 = new Function0() { // from class: com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposableKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return UpdateEmailComposable.UpdateEmailComposable$lambda$20$lambda$17$lambda$16(snapshotState3);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue6);
                            }
                            composer2.endReplaceGroup();
                            BentoAlertButton bentoAlertButton2 = new BentoAlertButton(strStringResource3, (Function0) objRememberedValue6, modifierAutoLogEvents$default2, null, null, false, 56, null);
                            composer2.startReplaceGroup(5004770);
                            Object objRememberedValue7 = composer2.rememberedValue();
                            if (objRememberedValue7 == companion.getEmpty()) {
                                objRememberedValue7 = new Function0() { // from class: com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposableKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return UpdateEmailComposable.UpdateEmailComposable$lambda$20$lambda$19$lambda$18(snapshotState3);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue7);
                            }
                            Function0 function0 = (Function0) objRememberedValue7;
                            composer2.endReplaceGroup();
                            int i8 = (BentoAlertDialog2.Body.MarkdownText.$stable << 3) | 100663296;
                            int i9 = BentoAlertButton.$stable;
                            int i10 = i8 | (i9 << 6) | (i9 << 12);
                            snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                            updateEmailDuxo4 = updateEmailDuxo3;
                            snapshotState2 = snapshotState;
                            BentoAlertDialog.BentoAlertDialog(strStringResource, markdownText, bentoAlertButton, null, bentoAlertButton2, null, false, null, function0, composer2, i10, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                            composer2 = composer2;
                            Unit unit5 = Unit.INSTANCE;
                        }
                        composer2.endReplaceGroup();
                        Composer composer3 = composer2;
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(ModifiersKt.logScreenTransitions(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier3, 0.0f, composer2, (i7 >> 3) & 14, 1), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.REVAMP_LOGIN_UPDATE_EMAIL, null, null, null, 14, null), null, null, null, null, 61, null)), false, ComposableLambda3.rememberComposableLambda(1036700239, true, new C397306(current2, updateEmailDuxo4, snapshotState2, snapshotState4), composer2, 54), ComposableLambda3.rememberComposableLambda(-1295930878, true, new C397317(snapshotState2, snapshotState4), composer2, 54), composer3, 3456, 2);
                        composerStartRestartGroup = composer3;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        updateEmailDuxo5 = updateEmailDuxo4;
                    } else {
                        i4 = i3;
                        modifier3 = modifier4;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                }
                updateEmailDuxo3 = updateEmailDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Object objConsume2 = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume2, "null cannot be cast to non-null type android.app.Activity");
                final Activity activity2 = (Activity) objConsume2;
                EventLogger current22 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                final SnapshotState snapshotState32 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Event<UpdateEmailEvent> event22 = null;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(updateEmailDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Flow eventFlow2 = updateEmailDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposableKt$UpdateEmailComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposableKt$UpdateEmailComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposableKt$UpdateEmailComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "UpdateEmailComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposableKt$UpdateEmailComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof UpdateEmailEvent) {
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
                        Object objCollect = eventFlow2.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                Event<UpdateEmailEvent> value2 = eventFlow2.getValue();
                event = value2;
                if ((event == null ? event.getData() : null) instanceof UpdateEmailEvent) {
                }
                int i72 = i4;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, event22, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(updateEmailDuxo3);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UpdateEmailComposable.UpdateEmailComposable$lambda$9$lambda$8(updateEmailDuxo3, snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    composerStartRestartGroup.endReplaceGroup();
                    final Function2 function2RememberSuvLauncher2 = SuvLauncher.rememberSuvLauncher(navigator2, (Function0) objRememberedValue3, null, composerStartRestartGroup, 0, 4);
                    Composer composer22 = composerStartRestartGroup;
                    eventUpdateEmailComposable$lambda$7 = UpdateEmailComposable$lambda$7(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventUpdateEmailComposable$lambda$7 != null) {
                    }
                    eventUpdateEmailComposable$lambda$72 = UpdateEmailComposable$lambda$7(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventUpdateEmailComposable$lambda$72 != null) {
                    }
                    eventUpdateEmailComposable$lambda$73 = UpdateEmailComposable$lambda$7(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventUpdateEmailComposable$lambda$73 != null) {
                    }
                    eventUpdateEmailComposable$lambda$74 = UpdateEmailComposable$lambda$7(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventUpdateEmailComposable$lambda$74 != null) {
                    }
                    numUpdateEmailComposable$lambda$4 = UpdateEmailComposable$lambda$4(snapshotState32);
                    composer22.startReplaceGroup(2107611246);
                    if (numUpdateEmailComposable$lambda$4 != null) {
                    }
                    composer22.endReplaceGroup();
                    Composer composer32 = composer22;
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(ModifiersKt.logScreenTransitions(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier3, 0.0f, composer22, (i72 >> 3) & 14, 1), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.REVAMP_LOGIN_UPDATE_EMAIL, null, null, null, 14, null), null, null, null, null, 61, null)), false, ComposableLambda3.rememberComposableLambda(1036700239, true, new C397306(current22, updateEmailDuxo4, snapshotState2, snapshotState4), composer22, 54), ComposableLambda3.rememberComposableLambda(-1295930878, true, new C397317(snapshotState2, snapshotState4), composer22, 54), composer32, 3456, 2);
                    composerStartRestartGroup = composer32;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    updateEmailDuxo5 = updateEmailDuxo4;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                updateEmailDuxo5 = updateEmailDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UpdateEmailComposable.UpdateEmailComposable$lambda$21(onUpdateEmailSuccess, modifier3, updateEmailDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateEmailComposable$lambda$9$lambda$8(UpdateEmailDuxo updateEmailDuxo, SnapshotState snapshotState) {
        updateEmailDuxo.updateEmail(UpdateEmailComposable$lambda$1(snapshotState));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String UpdateEmailComposable$lambda$1(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    private static final Integer UpdateEmailComposable$lambda$4(SnapshotState<Integer> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UpdateEmailViewState UpdateEmailComposable$lambda$6(SnapshotState4<UpdateEmailViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<UpdateEmailEvent> UpdateEmailComposable$lambda$7(SnapshotState4<Event<UpdateEmailEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: UpdateEmailComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposableKt$UpdateEmailComposable$7 */
    static final class C397317 implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<String> $email$delegate;
        final /* synthetic */ SnapshotState4<UpdateEmailViewState> $viewState$delegate;

        C397317(SnapshotState<String> snapshotState, SnapshotState4<UpdateEmailViewState> snapshotState4) {
            this.$email$delegate = snapshotState;
            this.$viewState$delegate = snapshotState4;
        }

        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1295930878, i, -1, "com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposable.<anonymous> (UpdateEmailComposable.kt:155)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            final SnapshotState<String> snapshotState = this.$email$delegate;
            SnapshotState4<UpdateEmailViewState> snapshotState4 = this.$viewState$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            String strUpdateEmailComposable$lambda$1 = UpdateEmailComposable.UpdateEmailComposable$lambda$1(snapshotState);
            String strStringResource = StringResources_androidKt.stringResource(C39685R.string.update_email_placeholder, composer, 0);
            boolean z = !UpdateEmailComposable.UpdateEmailComposable$lambda$6(snapshotState4).isLoading();
            composer.startReplaceGroup(5004770);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposableKt$UpdateEmailComposable$7$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UpdateEmailComposable.C397317.invoke$lambda$2$lambda$1$lambda$0(snapshotState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoTextInput4.BentoHeroTextInput(strUpdateEmailComposable$lambda$1, (Function1) objRememberedValue, companion, null, strStringResource, null, null, null, null, null, null, null, z, false, composer, 432, 0, 12264);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(SnapshotState snapshotState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            UpdateEmailComposable.UpdateEmailComposable$lambda$2(snapshotState, it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateEmailComposable$lambda$20$lambda$15$lambda$14(UpdateEmailDuxo updateEmailDuxo, SnapshotState snapshotState, SnapshotState snapshotState2) {
        updateEmailDuxo.submitConsentAndEmail(UpdateEmailComposable$lambda$1(snapshotState));
        snapshotState2.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UpdateEmailComposable$lambda$2(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateEmailComposable$lambda$20$lambda$17$lambda$16(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdateEmailComposable$lambda$20$lambda$19$lambda$18(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* compiled from: UpdateEmailComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposableKt$UpdateEmailComposable$6 */
    static final class C397306 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
        final /* synthetic */ UpdateEmailDuxo $duxo;
        final /* synthetic */ SnapshotState<String> $email$delegate;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ SnapshotState4<UpdateEmailViewState> $viewState$delegate;

        C397306(EventLogger eventLogger, UpdateEmailDuxo updateEmailDuxo, SnapshotState<String> snapshotState, SnapshotState4<UpdateEmailViewState> snapshotState4) {
            this.$eventLogger = eventLogger;
            this.$duxo = updateEmailDuxo;
            this.$email$delegate = snapshotState;
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
            invoke(bentoButtonBar3, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1036700239, i, -1, "com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposable.<anonymous> (UpdateEmailComposable.kt:141)");
            }
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$duxo);
            final EventLogger eventLogger = this.$eventLogger;
            final UpdateEmailDuxo updateEmailDuxo = this.$duxo;
            final SnapshotState<String> snapshotState = this.$email$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposableKt$UpdateEmailComposable$6$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdateEmailComposable.C397306.invoke$lambda$1$lambda$0(eventLogger, updateEmailDuxo, snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function0, StringResources_androidKt.stringResource(C39685R.string.update_email_primary_cta_text, composer, 0), UpdateEmailComposable.UpdateEmailComposable$lambda$6(this.$viewState$delegate).isLoading(), null, UpdateEmailComposable.UpdateEmailComposable$lambda$1(this.$email$delegate).length() > 0, null, null, false, null, false, composer, 0, 0, 64063);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, UpdateEmailDuxo updateEmailDuxo, SnapshotState snapshotState) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.PRIMARY_CTA, new Screen(Screen.Name.REVAMP_LOGIN_UPDATE_EMAIL, null, null, null, 14, null), null, null, null, false, 60, null);
            updateEmailDuxo.onPrimaryCtaClicked(UpdateEmailComposable.UpdateEmailComposable$lambda$1(snapshotState));
            return Unit.INSTANCE;
        }
    }
}
