package com.robinhood.shared.security.verify.credentials.password;

import android.app.Activity;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.p011ui.text.input.VisualTransformation2;
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
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
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
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.shared.security.verify.credentials.C39685R;
import com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposable;
import com.robinhood.shared.security.verify.credentials.password.UpdatePasswordEvent;
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

/* compiled from: UpdatePasswordComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\f\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002²\u0006\u0012\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012X\u008a\u0084\u0002"}, m3636d2 = {"UpdatePasswordComposable", "", "onPrimaryCtaClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/security/verify/credentials/password/UpdatePasswordDuxo;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/security/verify/credentials/password/UpdatePasswordDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-verify-credentials_externalDebug", "newPassword", "", "confirmPassword", "showSuccessDialog", "", "viewState", "Lcom/robinhood/shared/security/verify/credentials/password/UpdatePasswordViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/security/verify/credentials/password/UpdatePasswordEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class UpdatePasswordComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdatePasswordComposable$lambda$16(Function0 function0, Modifier modifier, UpdatePasswordDuxo updatePasswordDuxo, int i, int i2, Composer composer, int i3) {
        UpdatePasswordComposable(function0, modifier, updatePasswordDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UpdatePasswordComposable(final Function0<Unit> onPrimaryCtaClicked, Modifier modifier, UpdatePasswordDuxo updatePasswordDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        UpdatePasswordDuxo updatePasswordDuxo2;
        int i4;
        Modifier modifier3;
        Composer composer2;
        int i5;
        final UpdatePasswordDuxo updatePasswordDuxo3;
        final Activity activity;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final SnapshotState snapshotState2;
        boolean zChangedInstance;
        Object objRememberedValue4;
        final Function2<UUID, Boolean, Unit> function2RememberSuvLauncher;
        Event<UpdatePasswordEvent> event;
        Flow<Event<?>> flow;
        UpdatePasswordEvent data;
        final Event<UpdatePasswordEvent> eventUpdatePasswordComposable$lambda$12;
        final Event<UpdatePasswordEvent> eventUpdatePasswordComposable$lambda$122;
        final Event<UpdatePasswordEvent> eventUpdatePasswordComposable$lambda$123;
        UpdatePasswordDuxo updatePasswordDuxo4;
        Composer composer3;
        final UpdatePasswordDuxo updatePasswordDuxo5;
        final Modifier modifier4;
        EventConsumer<UpdatePasswordEvent> eventConsumerInvoke;
        EventConsumer<UpdatePasswordEvent> eventConsumerInvoke2;
        EventConsumer<UpdatePasswordEvent> eventConsumerInvoke3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onPrimaryCtaClicked, "onPrimaryCtaClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-147007997);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onPrimaryCtaClicked) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    updatePasswordDuxo2 = updatePasswordDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(updatePasswordDuxo2) ? 256 : 128;
                    i3 |= i7;
                } else {
                    updatePasswordDuxo2 = updatePasswordDuxo;
                }
                i3 |= i7;
            } else {
                updatePasswordDuxo2 = updatePasswordDuxo;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        composer2 = composerStartRestartGroup;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(UpdatePasswordDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 0, 0);
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue5 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposableKt$UpdatePasswordComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposableKt$UpdatePasswordComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue5);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composer2, 0);
                        composer2.endReplaceGroup();
                        i5 = i4 & (-897);
                        updatePasswordDuxo3 = (UpdatePasswordDuxo) baseDuxo;
                    }
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-147007997, i5, -1, "com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposable (UpdatePasswordComposable.kt:40)");
                    }
                    Object objConsume = composer2.consume(LocalActivity.getLocalActivity());
                    Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type android.app.Activity");
                    activity = (Activity) objConsume;
                    composer2.startReplaceGroup(1849434622);
                    objRememberedValue = composer2.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default("", null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(1849434622);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotState3.mutableStateOf$default("", null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    SnapshotState snapshotState3 = (SnapshotState) objRememberedValue2;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(1849434622);
                    objRememberedValue3 = composer2.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    snapshotState2 = (SnapshotState) objRememberedValue3;
                    composer2.endReplaceGroup();
                    Navigator navigator = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                    composer2.startReplaceGroup(-1633490746);
                    zChangedInstance = composer2.changedInstance(updatePasswordDuxo3);
                    objRememberedValue4 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return UpdatePasswordComposable.UpdatePasswordComposable$lambda$10$lambda$9(updatePasswordDuxo3, snapshotState);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceGroup();
                    Composer composer4 = composer2;
                    function2RememberSuvLauncher = SuvLauncher.rememberSuvLauncher(navigator, (Function0) objRememberedValue4, null, composer4, 0, 4);
                    Event<UpdatePasswordEvent> event2 = null;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(updatePasswordDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
                    Composer composer5 = composer4;
                    final StateFlow<Event<UpdatePasswordEvent>> eventFlow = updatePasswordDuxo3.getEventFlow();
                    composer5.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) composer5.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposableKt$UpdatePasswordComposable$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposableKt$UpdatePasswordComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposableKt$UpdatePasswordComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "UpdatePasswordComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposableKt$UpdatePasswordComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                    if ((event != null ? event.getData() : null) instanceof UpdatePasswordEvent) {
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
                    Event<UpdatePasswordEvent> value = eventFlow.getValue();
                    event = value;
                    if (event == null) {
                        flow = flow2;
                        data = event.getData();
                    } else {
                        flow = flow2;
                        data = null;
                    }
                    if (data instanceof UpdatePasswordEvent) {
                        event2 = value;
                    }
                    int i8 = i5;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, event2, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composer5, 0, 0);
                    composer5.endReplaceGroup();
                    eventUpdatePasswordComposable$lambda$12 = UpdatePasswordComposable$lambda$12(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventUpdatePasswordComposable$lambda$12 != null && (eventUpdatePasswordComposable$lambda$12.getData() instanceof UpdatePasswordEvent.Success) && (eventConsumerInvoke3 = eventUpdatePasswordComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke3.consume(eventUpdatePasswordComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposableKt$UpdatePasswordComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25685invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25685invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                UpdatePasswordComposable.UpdatePasswordComposable$lambda$8(snapshotState2, true);
                            }
                        });
                    }
                    eventUpdatePasswordComposable$lambda$122 = UpdatePasswordComposable$lambda$12(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventUpdatePasswordComposable$lambda$122 != null && (eventUpdatePasswordComposable$lambda$122.getData() instanceof UpdatePasswordEvent.Error) && (eventConsumerInvoke2 = eventUpdatePasswordComposable$lambda$122.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke2.consume(eventUpdatePasswordComposable$lambda$122, new Function1() { // from class: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposableKt$UpdatePasswordComposable$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                                m25686invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25686invoke(Object it) throws Throwable {
                                Intrinsics.checkNotNullParameter(it, "it");
                                ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, activity, ((UpdatePasswordEvent.Error) eventUpdatePasswordComposable$lambda$122.getData()).getThrowable(), true, false, 0, Integer.valueOf(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome), 24, null);
                            }
                        });
                    }
                    eventUpdatePasswordComposable$lambda$123 = UpdatePasswordComposable$lambda$12(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventUpdatePasswordComposable$lambda$123 != null && (eventUpdatePasswordComposable$lambda$123.getData() instanceof UpdatePasswordEvent.VerificationWorkflow) && (eventConsumerInvoke = eventUpdatePasswordComposable$lambda$123.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventUpdatePasswordComposable$lambda$123, new Function1() { // from class: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposableKt$UpdatePasswordComposable$$inlined$consumeIfType$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25687invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25687invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                UpdatePasswordEvent.VerificationWorkflow verificationWorkflow = (UpdatePasswordEvent.VerificationWorkflow) eventUpdatePasswordComposable$lambda$123.getData();
                                function2RememberSuvLauncher.invoke(verificationWorkflow.getWorkflowId(), Boolean.valueOf(verificationWorkflow.isMigrated()));
                            }
                        });
                    }
                    composer5.startReplaceGroup(459275313);
                    if (UpdatePasswordComposable$lambda$7(snapshotState2)) {
                        updatePasswordDuxo4 = updatePasswordDuxo3;
                    } else {
                        updatePasswordDuxo4 = updatePasswordDuxo3;
                        BentoAlertDialog.BentoAlertDialog(StringResources_androidKt.stringResource(C39685R.string.update_password_success_dialog_title, composer5, 0), new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C39685R.string.update_password_success_dialog_message, composer5, 0)), new BentoAlertButton(StringResources_androidKt.stringResource(C39685R.string.update_password_success_dialog_primary_cta_text, composer5, 0), onPrimaryCtaClicked), null, null, null, false, null, onPrimaryCtaClicked, composer5, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6) | ((i8 << 24) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                        composer5 = composer5;
                    }
                    composer5.endReplaceGroup();
                    Composer composer6 = composer5;
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier3, 0.0f, composer5, (i8 >> 3) & 14, 1), false, ComposableLambda3.rememberComposableLambda(45233592, true, new C397444(updatePasswordDuxo4, snapshotState, snapshotState4CollectAsStateWithLifecycle, snapshotState3), composer5, 54), ComposableLambda3.rememberComposableLambda(-1628430101, true, new C397455(snapshotState, snapshotState4CollectAsStateWithLifecycle, snapshotState3), composer5, 54), composer6, 3456, 2);
                    composer3 = composer6;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    updatePasswordDuxo5 = updatePasswordDuxo4;
                    modifier4 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i4 &= -897;
                    }
                    modifier3 = modifier2;
                }
                composer2 = composerStartRestartGroup;
                i5 = i4;
                updatePasswordDuxo3 = updatePasswordDuxo2;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Object objConsume2 = composer2.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume2, "null cannot be cast to non-null type android.app.Activity");
                activity = (Activity) objConsume2;
                composer2.startReplaceGroup(1849434622);
                objRememberedValue = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(1849434622);
                objRememberedValue2 = composer2.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                SnapshotState snapshotState32 = (SnapshotState) objRememberedValue2;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(1849434622);
                objRememberedValue3 = composer2.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                snapshotState2 = (SnapshotState) objRememberedValue3;
                composer2.endReplaceGroup();
                Navigator navigator2 = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                composer2.startReplaceGroup(-1633490746);
                zChangedInstance = composer2.changedInstance(updatePasswordDuxo3);
                objRememberedValue4 = composer2.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UpdatePasswordComposable.UpdatePasswordComposable$lambda$10$lambda$9(updatePasswordDuxo3, snapshotState);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue4);
                    composer2.endReplaceGroup();
                    Composer composer42 = composer2;
                    function2RememberSuvLauncher = SuvLauncher.rememberSuvLauncher(navigator2, (Function0) objRememberedValue4, null, composer42, 0, 4);
                    Event<UpdatePasswordEvent> event22 = null;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(updatePasswordDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer42, 0, 7);
                    Composer composer52 = composer42;
                    final Flow eventFlow2 = updatePasswordDuxo3.getEventFlow();
                    composer52.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composer52.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow22 = new Flow<Event<?>>() { // from class: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposableKt$UpdatePasswordComposable$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposableKt$UpdatePasswordComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposableKt$UpdatePasswordComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "UpdatePasswordComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposableKt$UpdatePasswordComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                    if ((event != null ? event.getData() : null) instanceof UpdatePasswordEvent) {
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
                    Event<UpdatePasswordEvent> value2 = eventFlow2.getValue();
                    event = value2;
                    if (event == null) {
                    }
                    if (data instanceof UpdatePasswordEvent) {
                    }
                    int i82 = i5;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow, event22, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composer52, 0, 0);
                    composer52.endReplaceGroup();
                    eventUpdatePasswordComposable$lambda$12 = UpdatePasswordComposable$lambda$12(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventUpdatePasswordComposable$lambda$12 != null) {
                        eventConsumerInvoke3.consume(eventUpdatePasswordComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposableKt$UpdatePasswordComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25685invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25685invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                UpdatePasswordComposable.UpdatePasswordComposable$lambda$8(snapshotState2, true);
                            }
                        });
                    }
                    eventUpdatePasswordComposable$lambda$122 = UpdatePasswordComposable$lambda$12(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventUpdatePasswordComposable$lambda$122 != null) {
                        eventConsumerInvoke2.consume(eventUpdatePasswordComposable$lambda$122, new Function1() { // from class: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposableKt$UpdatePasswordComposable$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                                m25686invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25686invoke(Object it) throws Throwable {
                                Intrinsics.checkNotNullParameter(it, "it");
                                ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, activity, ((UpdatePasswordEvent.Error) eventUpdatePasswordComposable$lambda$122.getData()).getThrowable(), true, false, 0, Integer.valueOf(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome), 24, null);
                            }
                        });
                    }
                    eventUpdatePasswordComposable$lambda$123 = UpdatePasswordComposable$lambda$12(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventUpdatePasswordComposable$lambda$123 != null) {
                        eventConsumerInvoke.consume(eventUpdatePasswordComposable$lambda$123, new Function1() { // from class: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposableKt$UpdatePasswordComposable$$inlined$consumeIfType$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25687invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25687invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                UpdatePasswordEvent.VerificationWorkflow verificationWorkflow = (UpdatePasswordEvent.VerificationWorkflow) eventUpdatePasswordComposable$lambda$123.getData();
                                function2RememberSuvLauncher.invoke(verificationWorkflow.getWorkflowId(), Boolean.valueOf(verificationWorkflow.isMigrated()));
                            }
                        });
                    }
                    composer52.startReplaceGroup(459275313);
                    if (UpdatePasswordComposable$lambda$7(snapshotState2)) {
                    }
                    composer52.endReplaceGroup();
                    Composer composer62 = composer52;
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier3, 0.0f, composer52, (i82 >> 3) & 14, 1), false, ComposableLambda3.rememberComposableLambda(45233592, true, new C397444(updatePasswordDuxo4, snapshotState, snapshotState4CollectAsStateWithLifecycle3, snapshotState32), composer52, 54), ComposableLambda3.rememberComposableLambda(-1628430101, true, new C397455(snapshotState, snapshotState4CollectAsStateWithLifecycle3, snapshotState32), composer52, 54), composer62, 3456, 2);
                    composer3 = composer62;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    updatePasswordDuxo5 = updatePasswordDuxo4;
                    modifier4 = modifier3;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                composer3 = composerStartRestartGroup;
                updatePasswordDuxo5 = updatePasswordDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UpdatePasswordComposable.UpdatePasswordComposable$lambda$16(onPrimaryCtaClicked, modifier4, updatePasswordDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
        i4 = i3;
        if ((i4 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 4) == 0) {
                    composer2 = composerStartRestartGroup;
                    i5 = i4;
                    updatePasswordDuxo3 = updatePasswordDuxo2;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Object objConsume22 = composer2.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume22, "null cannot be cast to non-null type android.app.Activity");
                activity = (Activity) objConsume22;
                composer2.startReplaceGroup(1849434622);
                objRememberedValue = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(1849434622);
                objRememberedValue2 = composer2.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                SnapshotState snapshotState322 = (SnapshotState) objRememberedValue2;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(1849434622);
                objRememberedValue3 = composer2.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                snapshotState2 = (SnapshotState) objRememberedValue3;
                composer2.endReplaceGroup();
                Navigator navigator22 = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                composer2.startReplaceGroup(-1633490746);
                zChangedInstance = composer2.changedInstance(updatePasswordDuxo3);
                objRememberedValue4 = composer2.rememberedValue();
                if (zChangedInstance) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UpdatePasswordComposable$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UpdatePasswordComposable$lambda$10$lambda$9(UpdatePasswordDuxo updatePasswordDuxo, SnapshotState snapshotState) {
        updatePasswordDuxo.submitPassword(UpdatePasswordComposable$lambda$1(snapshotState));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String UpdatePasswordComposable$lambda$1(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UpdatePasswordViewState UpdatePasswordComposable$lambda$11(SnapshotState4<UpdatePasswordViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<UpdatePasswordEvent> UpdatePasswordComposable$lambda$12(SnapshotState4<Event<UpdatePasswordEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String UpdatePasswordComposable$lambda$4(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean UpdatePasswordComposable$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* compiled from: UpdatePasswordComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposableKt$UpdatePasswordComposable$4 */
    static final class C397444 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<String> $confirmPassword$delegate;
        final /* synthetic */ UpdatePasswordDuxo $duxo;
        final /* synthetic */ SnapshotState<String> $newPassword$delegate;
        final /* synthetic */ SnapshotState4<UpdatePasswordViewState> $viewState$delegate;

        C397444(UpdatePasswordDuxo updatePasswordDuxo, SnapshotState<String> snapshotState, SnapshotState4<UpdatePasswordViewState> snapshotState4, SnapshotState<String> snapshotState2) {
            this.$duxo = updatePasswordDuxo;
            this.$newPassword$delegate = snapshotState;
            this.$viewState$delegate = snapshotState4;
            this.$confirmPassword$delegate = snapshotState2;
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
                ComposerKt.traceEventStart(45233592, i, -1, "com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposable.<anonymous> (UpdatePasswordComposable.kt:89)");
            }
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$duxo);
            final UpdatePasswordDuxo updatePasswordDuxo = this.$duxo;
            final SnapshotState<String> snapshotState = this.$newPassword$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposableKt$UpdatePasswordComposable$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UpdatePasswordComposable.C397444.invoke$lambda$1$lambda$0(updatePasswordDuxo, snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            boolean z = false;
            String strStringResource = StringResources_androidKt.stringResource(C39685R.string.update_password_primary_cta_text, composer, 0);
            boolean zIsLoading = UpdatePasswordComposable.UpdatePasswordComposable$lambda$11(this.$viewState$delegate).isLoading();
            if (UpdatePasswordComposable.UpdatePasswordComposable$lambda$1(this.$newPassword$delegate).length() > 0 && Intrinsics.areEqual(UpdatePasswordComposable.UpdatePasswordComposable$lambda$1(this.$newPassword$delegate), UpdatePasswordComposable.UpdatePasswordComposable$lambda$4(this.$confirmPassword$delegate))) {
                z = true;
            }
            BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function0, strStringResource, zIsLoading, null, z, null, null, false, null, false, composer, 0, 0, 64063);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(UpdatePasswordDuxo updatePasswordDuxo, SnapshotState snapshotState) {
            updatePasswordDuxo.submitPassword(UpdatePasswordComposable.UpdatePasswordComposable$lambda$1(snapshotState));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: UpdatePasswordComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposableKt$UpdatePasswordComposable$5 */
    static final class C397455 implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<String> $confirmPassword$delegate;
        final /* synthetic */ SnapshotState<String> $newPassword$delegate;
        final /* synthetic */ SnapshotState4<UpdatePasswordViewState> $viewState$delegate;

        C397455(SnapshotState<String> snapshotState, SnapshotState4<UpdatePasswordViewState> snapshotState4, SnapshotState<String> snapshotState2) {
            this.$newPassword$delegate = snapshotState;
            this.$viewState$delegate = snapshotState4;
            this.$confirmPassword$delegate = snapshotState2;
        }

        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1628430101, i, -1, "com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposable.<anonymous> (UpdatePasswordComposable.kt:97)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement.Vertical verticalM5091spacedByD5KLDUw = Arrangement.INSTANCE.m5091spacedByD5KLDUw(BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), companion2.getCenterVertically());
            final SnapshotState<String> snapshotState = this.$newPassword$delegate;
            SnapshotState4<UpdatePasswordViewState> snapshotState4 = this.$viewState$delegate;
            final SnapshotState<String> snapshotState2 = this.$confirmPassword$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(verticalM5091spacedByD5KLDUw, centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            String strUpdatePasswordComposable$lambda$1 = UpdatePasswordComposable.UpdatePasswordComposable$lambda$1(snapshotState);
            String strStringResource = StringResources_androidKt.stringResource(C39685R.string.update_password_new_placeholder, composer, 0);
            KeyboardType.Companion companion4 = KeyboardType.INSTANCE;
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, companion4.m7783getPasswordPjHm6EE(), 0, null, null, null, 123, null);
            VisualTransformation2 visualTransformation2 = new VisualTransformation2((char) 0, 1, null);
            boolean z = !UpdatePasswordComposable.UpdatePasswordComposable$lambda$11(snapshotState4).isLoading();
            composer.startReplaceGroup(5004770);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion5 = Composer.INSTANCE;
            if (objRememberedValue == companion5.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposableKt$UpdatePasswordComposable$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UpdatePasswordComposable.C397455.invoke$lambda$4$lambda$1$lambda$0(snapshotState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoTextInput4.BentoHeroTextInput(strUpdatePasswordComposable$lambda$1, (Function1) objRememberedValue, companion, null, strStringResource, null, null, null, null, keyboardOptions, null, visualTransformation2, z, false, composer, 805306800, 0, 9704);
            String strUpdatePasswordComposable$lambda$4 = UpdatePasswordComposable.UpdatePasswordComposable$lambda$4(snapshotState2);
            String strStringResource2 = StringResources_androidKt.stringResource(C39685R.string.update_password_confirm_placeholder, composer, 0);
            KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, null, companion4.m7783getPasswordPjHm6EE(), 0, null, null, null, 123, null);
            VisualTransformation2 visualTransformation22 = new VisualTransformation2((char) 0, 1, null);
            boolean z2 = !UpdatePasswordComposable.UpdatePasswordComposable$lambda$11(snapshotState4).isLoading();
            composer.startReplaceGroup(5004770);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion5.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposableKt$UpdatePasswordComposable$5$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UpdatePasswordComposable.C397455.invoke$lambda$4$lambda$3$lambda$2(snapshotState2, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoTextInput4.BentoHeroTextInput(strUpdatePasswordComposable$lambda$4, (Function1) objRememberedValue2, companion, null, strStringResource2, null, null, null, null, keyboardOptions2, null, visualTransformation22, z2, false, composer, 805306800, 0, 9704);
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
        public static final Unit invoke$lambda$4$lambda$1$lambda$0(SnapshotState snapshotState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            UpdatePasswordComposable.UpdatePasswordComposable$lambda$2(snapshotState, it);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$3$lambda$2(SnapshotState snapshotState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            UpdatePasswordComposable.UpdatePasswordComposable$lambda$5(snapshotState, it);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UpdatePasswordComposable$lambda$2(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void UpdatePasswordComposable$lambda$5(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }
}
