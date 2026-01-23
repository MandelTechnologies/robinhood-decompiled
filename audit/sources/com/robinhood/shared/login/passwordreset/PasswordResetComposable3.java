package com.robinhood.shared.login.passwordreset;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.p011ui.text.style.TextAlign;
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
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.shared.login.C39089R;
import com.robinhood.shared.login.passwordreset.PasswordResetComposable3;
import com.robinhood.shared.login.passwordreset.PasswordResetEvent;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: PasswordResetComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aC\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002²\u0006\u0012\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0004X\u008a\u008e\u0002²\u0006\f\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u008a\u008e\u0002"}, m3636d2 = {"PasswordResetComposable", "", "onEmailSent", "Lkotlin/Function1;", "", "onBackClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/login/passwordreset/PasswordResetDuxo;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/login/passwordreset/PasswordResetDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-login_externalRelease", "viewState", "Lcom/robinhood/shared/login/passwordreset/PasswordResetViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/login/passwordreset/PasswordResetEvent;", "email", "errorMessage"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class PasswordResetComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PasswordResetComposable$lambda$13(Function1 function1, Function0 function0, Modifier modifier, PasswordResetDuxo passwordResetDuxo, int i, int i2, Composer composer, int i3) {
        PasswordResetComposable(function1, function0, modifier, passwordResetDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0208  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PasswordResetComposable(final Function1<? super String, Unit> onEmailSent, final Function0<Unit> onBackClicked, Modifier modifier, PasswordResetDuxo passwordResetDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        PasswordResetDuxo passwordResetDuxo2;
        Modifier modifier3;
        int i4;
        PasswordResetDuxo passwordResetDuxo3;
        Event<PasswordResetEvent> event;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        final SnapshotState snapshotState;
        final Event<PasswordResetEvent> eventPasswordResetComposable$lambda$1;
        final Event<PasswordResetEvent> eventPasswordResetComposable$lambda$12;
        final Modifier modifier4;
        final PasswordResetDuxo passwordResetDuxo4;
        EventConsumer<PasswordResetEvent> eventConsumerInvoke;
        EventConsumer<PasswordResetEvent> eventConsumerInvoke2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onEmailSent, "onEmailSent");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1833471719);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onEmailSent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClicked) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    passwordResetDuxo2 = passwordResetDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(passwordResetDuxo2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    passwordResetDuxo2 = passwordResetDuxo;
                }
                i3 |= i6;
            } else {
                passwordResetDuxo2 = passwordResetDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PasswordResetDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt$PasswordResetComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt$PasswordResetComposable$$inlined$duxo$1.1
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
                        PasswordResetDuxo passwordResetDuxo5 = (PasswordResetDuxo) baseDuxo;
                        i4 = i3 & (-7169);
                        passwordResetDuxo3 = passwordResetDuxo5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1833471719, i4, -1, "com.robinhood.shared.login.passwordreset.PasswordResetComposable (PasswordResetComposable.kt:39)");
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(passwordResetDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    final StateFlow<Event<PasswordResetEvent>> eventFlow = passwordResetDuxo3.getEventFlow();
                    composerStartRestartGroup.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    Composer composer2 = composerStartRestartGroup;
                    CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt$PasswordResetComposable$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt$PasswordResetComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.shared.login.passwordreset.PasswordResetComposableKt$PasswordResetComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "PasswordResetComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt$PasswordResetComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                    if ((event != null ? event.getData() : null) instanceof PasswordResetEvent) {
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
                    Event<PasswordResetEvent> value = eventFlow.getValue();
                    event = value;
                    if (!((event != null ? event.getData() : null) instanceof PasswordResetEvent)) {
                        value = null;
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composer2, 0, 0);
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(1849434622);
                    objRememberedValue = composer2.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new FocusRequester();
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    FocusRequester focusRequester = (FocusRequester) objRememberedValue;
                    composer2.endReplaceGroup();
                    Object[] objArr = new Object[0];
                    composer2.startReplaceGroup(1849434622);
                    objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PasswordResetComposable3.PasswordResetComposable$lambda$4$lambda$3();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue2, composer2, 3072, 6);
                    Object[] objArr2 = new Object[0];
                    composer2.startReplaceGroup(1849434622);
                    objRememberedValue3 = composer2.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PasswordResetComposable3.PasswordResetComposable$lambda$8$lambda$7();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    composer2.endReplaceGroup();
                    snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue3, composer2, 3072, 6);
                    eventPasswordResetComposable$lambda$1 = PasswordResetComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventPasswordResetComposable$lambda$1 != null && (eventPasswordResetComposable$lambda$1.getData() instanceof PasswordResetEvent.EmailSent) && (eventConsumerInvoke2 = eventPasswordResetComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke2.consume(eventPasswordResetComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt$PasswordResetComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25515invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25515invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                onEmailSent.invoke(((PasswordResetEvent.EmailSent) eventPasswordResetComposable$lambda$1.getData()).getEmail());
                            }
                        });
                    }
                    eventPasswordResetComposable$lambda$12 = PasswordResetComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventPasswordResetComposable$lambda$12 != null && (eventPasswordResetComposable$lambda$12.getData() instanceof PasswordResetEvent.Error) && (eventConsumerInvoke = eventPasswordResetComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventPasswordResetComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt$PasswordResetComposable$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m25516invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m25516invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                PasswordResetComposable3.PasswordResetComposable$lambda$10(snapshotState, ((PasswordResetEvent.Error) eventPasswordResetComposable$lambda$12.getData()).getMessage());
                            }
                        });
                    }
                    Modifier modifierSystemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(modifier3);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    PasswordResetDuxo passwordResetDuxo6 = passwordResetDuxo3;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierSystemBarsPadding, ComposableLambda3.rememberComposableLambda(1606566357, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt.PasswordResetComposable.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i8) {
                            if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1606566357, i8, -1, "com.robinhood.shared.login.passwordreset.PasswordResetComposable.<anonymous> (PasswordResetComposable.kt:60)");
                            }
                            Function2<Composer, Integer, Unit> function2M25512getLambda$785499064$feature_login_externalRelease = PasswordResetComposable.INSTANCE.m25512getLambda$785499064$feature_login_externalRelease();
                            final Function0<Unit> function0 = onBackClicked;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M25512getLambda$785499064$feature_login_externalRelease, null, ComposableLambda3.rememberComposableLambda(1747178100, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt.PasswordResetComposable.3.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                    invoke(bentoAppBarScope, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i9) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i9 & 6) == 0) {
                                        i9 |= (i9 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1747178100, i9, -1, "com.robinhood.shared.login.passwordreset.PasswordResetComposable.<anonymous>.<anonymous> (PasswordResetComposable.kt:62)");
                                    }
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), ComposableLambda3.rememberComposableLambda(922336052, true, new C391574(passwordResetDuxo3, snapshotState2, snapshotState4CollectAsStateWithLifecycle), composer2, 54), null, null, 0, bentoTheme.getColors(composer2, i7).m21371getBg0d7_KjU(), bentoTheme.getColors(composer2, i7).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(253590570, true, new C391585(focusRequester, snapshotState2, snapshotState, snapshotState4CollectAsStateWithLifecycle), composer2, 54), composer2, 805306800, EnumC7081g.f2774x74902ae0);
                    composerStartRestartGroup = composer2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    passwordResetDuxo4 = passwordResetDuxo6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                }
                i4 = i3;
                passwordResetDuxo3 = passwordResetDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(passwordResetDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Flow eventFlow2 = passwordResetDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                Composer composer22 = composerStartRestartGroup;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt$PasswordResetComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt$PasswordResetComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.login.passwordreset.PasswordResetComposableKt$PasswordResetComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "PasswordResetComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt$PasswordResetComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof PasswordResetEvent) {
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
                Event<PasswordResetEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event != null ? event.getData() : null) instanceof PasswordResetEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composer22, 0, 0);
                composer22.endReplaceGroup();
                composer22.startReplaceGroup(1849434622);
                objRememberedValue = composer22.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                FocusRequester focusRequester2 = (FocusRequester) objRememberedValue;
                composer22.endReplaceGroup();
                Object[] objArr3 = new Object[0];
                composer22.startReplaceGroup(1849434622);
                objRememberedValue2 = composer22.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                composer22.endReplaceGroup();
                SnapshotState snapshotState22 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue2, composer22, 3072, 6);
                Object[] objArr22 = new Object[0];
                composer22.startReplaceGroup(1849434622);
                objRememberedValue3 = composer22.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                composer22.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) objRememberedValue3, composer22, 3072, 6);
                eventPasswordResetComposable$lambda$1 = PasswordResetComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventPasswordResetComposable$lambda$1 != null) {
                    eventConsumerInvoke2.consume(eventPasswordResetComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt$PasswordResetComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25515invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25515invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            onEmailSent.invoke(((PasswordResetEvent.EmailSent) eventPasswordResetComposable$lambda$1.getData()).getEmail());
                        }
                    });
                }
                eventPasswordResetComposable$lambda$12 = PasswordResetComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventPasswordResetComposable$lambda$12 != null) {
                    eventConsumerInvoke.consume(eventPasswordResetComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt$PasswordResetComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25516invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25516invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            PasswordResetComposable3.PasswordResetComposable$lambda$10(snapshotState, ((PasswordResetEvent.Error) eventPasswordResetComposable$lambda$12.getData()).getMessage());
                        }
                    });
                }
                Modifier modifierSystemBarsPadding2 = WindowInsetsPadding_androidKt.systemBarsPadding(modifier3);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i72 = BentoTheme.$stable;
                PasswordResetDuxo passwordResetDuxo62 = passwordResetDuxo3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierSystemBarsPadding2, ComposableLambda3.rememberComposableLambda(1606566357, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt.PasswordResetComposable.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i8) {
                        if ((i8 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1606566357, i8, -1, "com.robinhood.shared.login.passwordreset.PasswordResetComposable.<anonymous> (PasswordResetComposable.kt:60)");
                        }
                        Function2<Composer, Integer, Unit> function2M25512getLambda$785499064$feature_login_externalRelease = PasswordResetComposable.INSTANCE.m25512getLambda$785499064$feature_login_externalRelease();
                        final Function0<Unit> function0 = onBackClicked;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M25512getLambda$785499064$feature_login_externalRelease, null, ComposableLambda3.rememberComposableLambda(1747178100, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt.PasswordResetComposable.3.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i9) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i9 & 6) == 0) {
                                    i9 |= (i9 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1747178100, i9, -1, "com.robinhood.shared.login.passwordreset.PasswordResetComposable.<anonymous>.<anonymous> (PasswordResetComposable.kt:62)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer22, 54), ComposableLambda3.rememberComposableLambda(922336052, true, new C391574(passwordResetDuxo3, snapshotState22, snapshotState4CollectAsStateWithLifecycle3), composer22, 54), null, null, 0, bentoTheme2.getColors(composer22, i72).m21371getBg0d7_KjU(), bentoTheme2.getColors(composer22, i72).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(253590570, true, new C391585(focusRequester2, snapshotState22, snapshotState, snapshotState4CollectAsStateWithLifecycle3), composer22, 54), composer22, 805306800, EnumC7081g.f2774x74902ae0);
                composerStartRestartGroup = composer22;
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                passwordResetDuxo4 = passwordResetDuxo62;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                passwordResetDuxo4 = passwordResetDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PasswordResetComposable3.PasswordResetComposable$lambda$13(onEmailSent, onBackClicked, modifier4, passwordResetDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 8) == 0) {
                    i4 = i3;
                    passwordResetDuxo3 = passwordResetDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle32 = FlowExtKt.collectAsStateWithLifecycle(passwordResetDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final Flow eventFlow22 = passwordResetDuxo3.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner22 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state22 = Lifecycle.State.STARTED;
                Composer composer222 = composerStartRestartGroup;
                CoroutineContextImpl6 coroutineContextImpl622 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow22 = new Flow<Event<?>>() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt$PasswordResetComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt$PasswordResetComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.login.passwordreset.PasswordResetComposableKt$PasswordResetComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "PasswordResetComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt$PasswordResetComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof PasswordResetEvent) {
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
                        Object objCollect = eventFlow22.collect(new AnonymousClass2(flowCollector), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                    }
                };
                Event<PasswordResetEvent> value22 = eventFlow22.getValue();
                event = value22;
                if (!((event != null ? event.getData() : null) instanceof PasswordResetEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle222 = FlowExtKt.collectAsStateWithLifecycle(flow22, value22, lifecycleOwner22.getLifecycle(), state22, coroutineContextImpl622, composer222, 0, 0);
                composer222.endReplaceGroup();
                composer222.startReplaceGroup(1849434622);
                objRememberedValue = composer222.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                FocusRequester focusRequester22 = (FocusRequester) objRememberedValue;
                composer222.endReplaceGroup();
                Object[] objArr32 = new Object[0];
                composer222.startReplaceGroup(1849434622);
                objRememberedValue2 = composer222.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                composer222.endReplaceGroup();
                SnapshotState snapshotState222 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr32, (Saver) null, (String) null, (Function0) objRememberedValue2, composer222, 3072, 6);
                Object[] objArr222 = new Object[0];
                composer222.startReplaceGroup(1849434622);
                objRememberedValue3 = composer222.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                composer222.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr222, (Saver) null, (String) null, (Function0) objRememberedValue3, composer222, 3072, 6);
                eventPasswordResetComposable$lambda$1 = PasswordResetComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle222);
                if (eventPasswordResetComposable$lambda$1 != null) {
                }
                eventPasswordResetComposable$lambda$12 = PasswordResetComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle222);
                if (eventPasswordResetComposable$lambda$12 != null) {
                }
                Modifier modifierSystemBarsPadding22 = WindowInsetsPadding_androidKt.systemBarsPadding(modifier3);
                BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                int i722 = BentoTheme.$stable;
                PasswordResetDuxo passwordResetDuxo622 = passwordResetDuxo3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierSystemBarsPadding22, ComposableLambda3.rememberComposableLambda(1606566357, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt.PasswordResetComposable.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i8) {
                        if ((i8 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1606566357, i8, -1, "com.robinhood.shared.login.passwordreset.PasswordResetComposable.<anonymous> (PasswordResetComposable.kt:60)");
                        }
                        Function2<Composer, Integer, Unit> function2M25512getLambda$785499064$feature_login_externalRelease = PasswordResetComposable.INSTANCE.m25512getLambda$785499064$feature_login_externalRelease();
                        final Function0<Unit> function0 = onBackClicked;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M25512getLambda$785499064$feature_login_externalRelease, null, ComposableLambda3.rememberComposableLambda(1747178100, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt.PasswordResetComposable.3.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i9) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i9 & 6) == 0) {
                                    i9 |= (i9 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i9 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1747178100, i9, -1, "com.robinhood.shared.login.passwordreset.PasswordResetComposable.<anonymous>.<anonymous> (PasswordResetComposable.kt:62)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i9 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer222, 54), ComposableLambda3.rememberComposableLambda(922336052, true, new C391574(passwordResetDuxo3, snapshotState222, snapshotState4CollectAsStateWithLifecycle32), composer222, 54), null, null, 0, bentoTheme22.getColors(composer222, i722).m21371getBg0d7_KjU(), bentoTheme22.getColors(composer222, i722).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(253590570, true, new C391585(focusRequester22, snapshotState222, snapshotState, snapshotState4CollectAsStateWithLifecycle32), composer222, 54), composer222, 805306800, EnumC7081g.f2774x74902ae0);
                composerStartRestartGroup = composer222;
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
                passwordResetDuxo4 = passwordResetDuxo622;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState PasswordResetComposable$lambda$4$lambda$3() {
        return SnapshotState3.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState PasswordResetComposable$lambda$8$lambda$7() {
        return SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    /* compiled from: PasswordResetComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt$PasswordResetComposable$4 */
    static final class C391574 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ PasswordResetDuxo $duxo;
        final /* synthetic */ SnapshotState<String> $email$delegate;
        final /* synthetic */ SnapshotState4<PasswordResetViewState> $viewState$delegate;

        C391574(PasswordResetDuxo passwordResetDuxo, SnapshotState<String> snapshotState, SnapshotState4<PasswordResetViewState> snapshotState4) {
            this.$duxo = passwordResetDuxo;
            this.$email$delegate = snapshotState;
            this.$viewState$delegate = snapshotState4;
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
                ComposerKt.traceEventStart(922336052, i, -1, "com.robinhood.shared.login.passwordreset.PasswordResetComposable.<anonymous> (PasswordResetComposable.kt:68)");
            }
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(this.$duxo) | composer.changed(this.$email$delegate);
            final PasswordResetDuxo passwordResetDuxo = this.$duxo;
            final SnapshotState<String> snapshotState = this.$email$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt$PasswordResetComposable$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return PasswordResetComposable3.C391574.invoke$lambda$1$lambda$0(passwordResetDuxo, snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, false, null, null, function0, StringResources_androidKt.stringResource(C39089R.string.password_reset_action, composer, 0), PasswordResetComposable3.PasswordResetComposable$lambda$0(this.$viewState$delegate).isLoading(), null, PasswordResetComposable3.PasswordResetComposable$lambda$5(this.$email$delegate).length() > 0, null, null, false, null, false, composer, 0, 0, 64062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(PasswordResetDuxo passwordResetDuxo, SnapshotState snapshotState) {
            passwordResetDuxo.requestPasswordResetEmail(PasswordResetComposable3.PasswordResetComposable$lambda$5(snapshotState));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: PasswordResetComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt$PasswordResetComposable$5 */
    static final class C391585 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<String> $email$delegate;
        final /* synthetic */ FocusRequester $emailFocusRequester;
        final /* synthetic */ SnapshotState<String> $errorMessage$delegate;
        final /* synthetic */ SnapshotState4<PasswordResetViewState> $viewState$delegate;

        C391585(FocusRequester focusRequester, SnapshotState<String> snapshotState, SnapshotState<String> snapshotState2, SnapshotState4<PasswordResetViewState> snapshotState4) {
            this.$emailFocusRequester = focusRequester;
            this.$email$delegate = snapshotState;
            this.$errorMessage$delegate = snapshotState2;
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(253590570, i2, -1, "com.robinhood.shared.login.passwordreset.PasswordResetComposable.<anonymous> (PasswordResetComposable.kt:77)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(androidx.compose.foundation.layout.PaddingKt.padding(companion, paddingValues), 0.0f, composer, 0, 1);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            FocusRequester focusRequester = this.$emailFocusRequester;
            final SnapshotState<String> snapshotState = this.$email$delegate;
            final SnapshotState<String> snapshotState2 = this.$errorMessage$delegate;
            SnapshotState4<PasswordResetViewState> snapshotState4 = this.$viewState$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21623defaultHorizontalPaddingrAjV9yQ);
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
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
            String strStringResource = StringResources_androidKt.stringResource(C39089R.string.password_reset_title, composer, 0);
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleMedium(), composer, 0, 0, 8124);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39089R.string.password_reset_prompt, composer, 0), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 0, 0, 8124);
            Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(FocusRequesterModifier3.focusRequester(companion, focusRequester), 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
            String strPasswordResetComposable$lambda$5 = PasswordResetComposable3.PasswordResetComposable$lambda$5(snapshotState);
            String strStringResource2 = StringResources_androidKt.stringResource(C39089R.string.password_reset_email_hint, composer, 0);
            String strPasswordResetComposable$lambda$9 = PasswordResetComposable3.PasswordResetComposable$lambda$9(snapshotState2);
            BentoTextInput8.Message.Error error = strPasswordResetComposable$lambda$9 != null ? new BentoTextInput8.Message.Error(strPasswordResetComposable$lambda$9) : null;
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.m7780getEmailPjHm6EE(), 0, null, null, null, 123, null);
            boolean z = !PasswordResetComposable3.PasswordResetComposable$lambda$0(snapshotState4).isLoading();
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(snapshotState) | composer.changed(snapshotState2);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetComposableKt$PasswordResetComposable$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return PasswordResetComposable3.C391585.invoke$lambda$4$lambda$2$lambda$1(snapshotState, snapshotState2, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoTextInput4.BentoHeroTextInput(strPasswordResetComposable$lambda$5, (Function1) objRememberedValue, modifierM5146paddingqDBjuR0$default2, null, strStringResource2, null, null, error, null, keyboardOptions, null, null, z, false, composer, (BentoTextInput8.Message.Error.$stable << 21) | 805306368, 0, 11624);
            Unit unit = Unit.INSTANCE;
            composer.startReplaceGroup(5004770);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new PasswordResetComposable4(focusRequester, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 6);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$4$lambda$2$lambda$1(SnapshotState snapshotState, SnapshotState snapshotState2, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            PasswordResetComposable3.PasswordResetComposable$lambda$6(snapshotState, it);
            PasswordResetComposable3.PasswordResetComposable$lambda$10(snapshotState2, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PasswordResetViewState PasswordResetComposable$lambda$0(SnapshotState4<PasswordResetViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<PasswordResetEvent> PasswordResetComposable$lambda$1(SnapshotState4<Event<PasswordResetEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String PasswordResetComposable$lambda$5(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String PasswordResetComposable$lambda$9(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PasswordResetComposable$lambda$10(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PasswordResetComposable$lambda$6(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }
}
