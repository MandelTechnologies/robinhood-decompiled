package com.robinhood.shared.login.passwordreset;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import com.robinhood.android.lib.stepupverification.SuvLauncher;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.login.LoginStatus;
import com.robinhood.shared.login.C39089R;
import com.robinhood.shared.login.passwordreset.PasswordResetEvent;
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

/* compiled from: PasswordResetEmailSentComposable.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001as\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001aC\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\u0012\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u008a\u0084\u0002²\u0006\n\u0010\u001a\u001a\u00020\u0006X\u008a\u008e\u0002"}, m3636d2 = {"PasswordResetEmailSentComposable", "", "email", "", "showBottomSheet", "Lkotlin/Function1;", "", "onBackClicked", "Lkotlin/Function0;", "onAccountRecoverySuccess", "Lcom/robinhood/login/LoginStatus;", "onAccountRecoveryError", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/login/passwordreset/PasswordResetDuxo;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/login/passwordreset/PasswordResetDuxo;Landroidx/compose/runtime/Composer;II)V", "MainContent", "viewState", "Lcom/robinhood/shared/login/passwordreset/PasswordResetViewState;", "(Ljava/lang/String;Lcom/robinhood/shared/login/passwordreset/PasswordResetViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-login_externalRelease", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/login/passwordreset/PasswordResetEvent;", "showSuccessDialog"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class PasswordResetEmailSentComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$18(String str, PasswordResetViewState passwordResetViewState, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MainContent(str, passwordResetViewState, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PasswordResetEmailSentComposable$lambda$17(String str, Function1 function1, Function0 function0, Function1 function12, Function1 function13, Modifier modifier, PasswordResetDuxo passwordResetDuxo, int i, int i2, Composer composer, int i3) {
        PasswordResetEmailSentComposable(str, function1, function0, function12, function13, modifier, passwordResetDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PasswordResetEmailSentComposable(final String email, final Function1<? super Boolean, Unit> showBottomSheet, final Function0<Unit> onBackClicked, final Function1<? super LoginStatus, Unit> onAccountRecoverySuccess, final Function1<? super Throwable, Unit> onAccountRecoveryError, Modifier modifier, PasswordResetDuxo passwordResetDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        PasswordResetDuxo passwordResetDuxo2;
        int i4;
        final PasswordResetDuxo passwordResetDuxo3;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Event<PasswordResetEvent> event;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final Event<PasswordResetEvent> eventPasswordResetEmailSentComposable$lambda$1;
        final Event<PasswordResetEvent> eventPasswordResetEmailSentComposable$lambda$12;
        final Event<PasswordResetEvent> eventPasswordResetEmailSentComposable$lambda$13;
        final Event<PasswordResetEvent> eventPasswordResetEmailSentComposable$lambda$14;
        boolean zChanged;
        Object objRememberedValue3;
        final Modifier modifier3;
        EventConsumer<PasswordResetEvent> eventConsumerInvoke;
        EventConsumer<PasswordResetEvent> eventConsumerInvoke2;
        EventConsumer<PasswordResetEvent> eventConsumerInvoke3;
        EventConsumer<PasswordResetEvent> eventConsumerInvoke4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(showBottomSheet, "showBottomSheet");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(onAccountRecoverySuccess, "onAccountRecoverySuccess");
        Intrinsics.checkNotNullParameter(onAccountRecoveryError, "onAccountRecoveryError");
        Composer composerStartRestartGroup = composer.startRestartGroup(-140636696);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(email) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(showBottomSheet) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClicked) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAccountRecoverySuccess) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAccountRecoveryError) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((1572864 & i) != 0) {
                if ((i2 & 64) == 0) {
                    passwordResetDuxo2 = passwordResetDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(passwordResetDuxo2) ? 1048576 : 524288;
                    i3 |= i6;
                } else {
                    passwordResetDuxo2 = passwordResetDuxo;
                }
                i3 |= i6;
            } else {
                passwordResetDuxo2 = passwordResetDuxo;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i5 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i2 & 64) == 0) {
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
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$PasswordResetEmailSentComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$PasswordResetEmailSentComposable$$inlined$duxo$1.1
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
                        i4 = i3 & (-3670017);
                        passwordResetDuxo3 = (PasswordResetDuxo) baseDuxo;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-140636696, i4, -1, "com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposable (PasswordResetEmailSentComposable.kt:43)");
                    }
                    Composer composer2 = composerStartRestartGroup;
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(passwordResetDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                    final StateFlow<Event<PasswordResetEvent>> eventFlow = passwordResetDuxo3.getEventFlow();
                    composer2.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$PasswordResetEmailSentComposable$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$PasswordResetEmailSentComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$PasswordResetEmailSentComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "PasswordResetEmailSentComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$PasswordResetEmailSentComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                    composerStartRestartGroup = composer2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance = composerStartRestartGroup.changedInstance(passwordResetDuxo3);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PasswordResetEmailSentComposable3.PasswordResetEmailSentComposable$lambda$6$lambda$5(passwordResetDuxo3);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    final Function2<UUID, Boolean, Unit> function2RememberSuvLauncher = SuvLauncher.rememberSuvLauncher(navigator, (Function0) objRememberedValue2, null, composerStartRestartGroup, 0, 4);
                    eventPasswordResetEmailSentComposable$lambda$1 = PasswordResetEmailSentComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventPasswordResetEmailSentComposable$lambda$1 != null) {
                        if ((eventPasswordResetEmailSentComposable$lambda$1.getData() instanceof PasswordResetEvent.EmailSent) && (eventConsumerInvoke4 = eventPasswordResetEmailSentComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke4.consume(eventPasswordResetEmailSentComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$PasswordResetEmailSentComposable$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m25522invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25522invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    PasswordResetEmailSentComposable3.PasswordResetEmailSentComposable$lambda$4(snapshotState, true);
                                }
                            });
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    eventPasswordResetEmailSentComposable$lambda$12 = PasswordResetEmailSentComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventPasswordResetEmailSentComposable$lambda$12 != null) {
                        if ((eventPasswordResetEmailSentComposable$lambda$12.getData() instanceof PasswordResetEvent.AccountRecoverySuccess) && (eventConsumerInvoke3 = eventPasswordResetEmailSentComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke3.consume(eventPasswordResetEmailSentComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$PasswordResetEmailSentComposable$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m25523invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25523invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    onAccountRecoverySuccess.invoke(((PasswordResetEvent.AccountRecoverySuccess) eventPasswordResetEmailSentComposable$lambda$12.getData()).getLoginStatus());
                                }
                            });
                        }
                        Unit unit2 = Unit.INSTANCE;
                    }
                    eventPasswordResetEmailSentComposable$lambda$13 = PasswordResetEmailSentComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventPasswordResetEmailSentComposable$lambda$13 != null) {
                        if ((eventPasswordResetEmailSentComposable$lambda$13.getData() instanceof PasswordResetEvent.AccountRecoveryError) && (eventConsumerInvoke2 = eventPasswordResetEmailSentComposable$lambda$13.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(eventPasswordResetEmailSentComposable$lambda$13, new Function1() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$PasswordResetEmailSentComposable$$inlined$consumeIfType$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m25524invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25524invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    onAccountRecoveryError.invoke(((PasswordResetEvent.AccountRecoveryError) eventPasswordResetEmailSentComposable$lambda$13.getData()).getThrowable());
                                }
                            });
                        }
                        Unit unit3 = Unit.INSTANCE;
                    }
                    eventPasswordResetEmailSentComposable$lambda$14 = PasswordResetEmailSentComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventPasswordResetEmailSentComposable$lambda$14 != null) {
                        if ((eventPasswordResetEmailSentComposable$lambda$14.getData() instanceof PasswordResetEvent.VerificationWorkflow) && (eventConsumerInvoke = eventPasswordResetEmailSentComposable$lambda$14.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(eventPasswordResetEmailSentComposable$lambda$14, new Function1() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$PasswordResetEmailSentComposable$$inlined$consumeIfType$4
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m25525invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25525invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    PasswordResetEvent.VerificationWorkflow verificationWorkflow = (PasswordResetEvent.VerificationWorkflow) eventPasswordResetEmailSentComposable$lambda$14.getData();
                                    function2RememberSuvLauncher.invoke(verificationWorkflow.getWorkflowId(), Boolean.valueOf(verificationWorkflow.isMigrated()));
                                }
                            });
                        }
                        Unit unit4 = Unit.INSTANCE;
                    }
                    composerStartRestartGroup.startReplaceGroup(-2007841159);
                    if (PasswordResetEmailSentComposable$lambda$3(snapshotState)) {
                        String strStringResource = StringResources_androidKt.stringResource(C39089R.string.password_reset_email_resent_title, composerStartRestartGroup, 0);
                        BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C39089R.string.password_reset_email_resent_message, new Object[]{email}, composerStartRestartGroup, 0));
                        String strStringResource2 = StringResources_androidKt.stringResource(C39089R.string.password_reset_email_resent_cta_text, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new Function0() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PasswordResetEmailSentComposable3.PasswordResetEmailSentComposable$lambda$12$lambda$11(snapshotState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue5);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = new Function0() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PasswordResetEmailSentComposable3.PasswordResetEmailSentComposable$lambda$14$lambda$13(snapshotState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, null, null, false, null, (Function0) objRememberedValue6, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | 100663296 | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                        composerStartRestartGroup = composerStartRestartGroup;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    PasswordResetViewState passwordResetViewStatePasswordResetEmailSentComposable$lambda$0 = PasswordResetEmailSentComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | ((i4 & 112) != 32);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PasswordResetEmailSentComposable3.PasswordResetEmailSentComposable$lambda$16$lambda$15(showBottomSheet, snapshotState4CollectAsStateWithLifecycle);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier4 = modifier2;
                    passwordResetDuxo2 = passwordResetDuxo3;
                    MainContent(email, passwordResetViewStatePasswordResetEmailSentComposable$lambda$0, (Function0) objRememberedValue3, onBackClicked, modifier4, composerStartRestartGroup, (i4 & 14) | ((i4 << 3) & 7168) | (57344 & (i4 >> 3)), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 64) != 0) {
                        i3 &= -3670017;
                    }
                }
                i4 = i3;
                passwordResetDuxo3 = passwordResetDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer22 = composerStartRestartGroup;
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(passwordResetDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer22, 0, 7);
                final Flow eventFlow2 = passwordResetDuxo3.getEventFlow();
                composer22.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composer22.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$PasswordResetEmailSentComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$PasswordResetEmailSentComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$PasswordResetEmailSentComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "PasswordResetEmailSentComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$PasswordResetEmailSentComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                composerStartRestartGroup = composer22;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(passwordResetDuxo3);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PasswordResetEmailSentComposable3.PasswordResetEmailSentComposable$lambda$6$lambda$5(passwordResetDuxo3);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    final Function2 function2RememberSuvLauncher2 = SuvLauncher.rememberSuvLauncher(navigator2, (Function0) objRememberedValue2, null, composerStartRestartGroup, 0, 4);
                    eventPasswordResetEmailSentComposable$lambda$1 = PasswordResetEmailSentComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventPasswordResetEmailSentComposable$lambda$1 != null) {
                    }
                    eventPasswordResetEmailSentComposable$lambda$12 = PasswordResetEmailSentComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventPasswordResetEmailSentComposable$lambda$12 != null) {
                    }
                    eventPasswordResetEmailSentComposable$lambda$13 = PasswordResetEmailSentComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventPasswordResetEmailSentComposable$lambda$13 != null) {
                    }
                    eventPasswordResetEmailSentComposable$lambda$14 = PasswordResetEmailSentComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventPasswordResetEmailSentComposable$lambda$14 != null) {
                    }
                    composerStartRestartGroup.startReplaceGroup(-2007841159);
                    if (PasswordResetEmailSentComposable$lambda$3(snapshotState)) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    PasswordResetViewState passwordResetViewStatePasswordResetEmailSentComposable$lambda$02 = PasswordResetEmailSentComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | ((i4 & 112) != 32);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PasswordResetEmailSentComposable3.PasswordResetEmailSentComposable$lambda$16$lambda$15(showBottomSheet, snapshotState4CollectAsStateWithLifecycle);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier42 = modifier2;
                        passwordResetDuxo2 = passwordResetDuxo3;
                        MainContent(email, passwordResetViewStatePasswordResetEmailSentComposable$lambda$02, (Function0) objRememberedValue3, onBackClicked, modifier42, composerStartRestartGroup, (i4 & 14) | ((i4 << 3) & 7168) | (57344 & (i4 >> 3)), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier42;
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            final PasswordResetDuxo passwordResetDuxo4 = passwordResetDuxo2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PasswordResetEmailSentComposable3.PasswordResetEmailSentComposable$lambda$17(email, showBottomSheet, onBackClicked, onAccountRecoverySuccess, onAccountRecoveryError, modifier3, passwordResetDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((1572864 & i) != 0) {
        }
        if ((599187 & i3) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                }
                if ((i2 & 64) == 0) {
                    i4 = i3;
                    passwordResetDuxo3 = passwordResetDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer222 = composerStartRestartGroup;
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(passwordResetDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer222, 0, 7);
                final Flow eventFlow22 = passwordResetDuxo3.getEventFlow();
                composer222.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner22 = (LifecycleOwner) composer222.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state22 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl622 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow22 = new Flow<Event<?>>() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$PasswordResetEmailSentComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$PasswordResetEmailSentComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$PasswordResetEmailSentComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "PasswordResetEmailSentComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$PasswordResetEmailSentComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                composerStartRestartGroup = composer222;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Navigator navigator22 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(passwordResetDuxo3);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                }
            }
        }
        final PasswordResetDuxo passwordResetDuxo42 = passwordResetDuxo2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PasswordResetEmailSentComposable$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PasswordResetEmailSentComposable$lambda$6$lambda$5(PasswordResetDuxo passwordResetDuxo) {
        passwordResetDuxo.onForgotEmail(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PasswordResetEmailSentComposable$lambda$12$lambda$11(SnapshotState snapshotState) {
        PasswordResetEmailSentComposable$lambda$4(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PasswordResetEmailSentComposable$lambda$14$lambda$13(SnapshotState snapshotState) {
        PasswordResetEmailSentComposable$lambda$4(snapshotState, false);
        return Unit.INSTANCE;
    }

    private static final PasswordResetViewState PasswordResetEmailSentComposable$lambda$0(SnapshotState4<PasswordResetViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<PasswordResetEvent> PasswordResetEmailSentComposable$lambda$1(SnapshotState4<Event<PasswordResetEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean PasswordResetEmailSentComposable$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PasswordResetEmailSentComposable$lambda$16$lambda$15(Function1 function1, SnapshotState4 snapshotState4) {
        function1.invoke(Boolean.valueOf(PasswordResetEmailSentComposable$lambda$0(snapshotState4).getShowSuvBottomSheet()));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void MainContent(final String str, final PasswordResetViewState passwordResetViewState, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-447194052);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(passwordResetViewState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-447194052, i3, -1, "com.robinhood.shared.login.passwordreset.MainContent (PasswordResetEmailSentComposable.kt:99)");
                }
                Modifier modifierSystemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(modifier4);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierSystemBarsPadding, ComposableLambda3.rememberComposableLambda(895917824, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt.MainContent.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(895917824, i6, -1, "com.robinhood.shared.login.passwordreset.MainContent.<anonymous> (PasswordResetEmailSentComposable.kt:105)");
                        }
                        Function2<Composer, Integer, Unit> function2M25513getLambda$1580091923$feature_login_externalRelease = PasswordResetEmailSentComposable.INSTANCE.m25513getLambda$1580091923$feature_login_externalRelease();
                        final Function0<Unit> function03 = function02;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M25513getLambda$1580091923$feature_login_externalRelease, null, ComposableLambda3.rememberComposableLambda(325341505, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt.MainContent.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i7 & 6) == 0) {
                                    i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(325341505, i7, -1, "com.robinhood.shared.login.passwordreset.MainContent.<anonymous>.<anonymous> (PasswordResetEmailSentComposable.kt:107)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function03, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-372752255, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt.MainContent.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-372752255, i6, -1, "com.robinhood.shared.login.passwordreset.MainContent.<anonymous> (PasswordResetEmailSentComposable.kt:113)");
                        }
                        BentoButtonBar2.BentoButtonBar(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer3, 6, 1), null, null, false, null, null, null, null, false, null, false, function0, StringResources_androidKt.stringResource(C39089R.string.password_reset_email_help_title, composer3, 0), passwordResetViewState.isLoading(), null, false, composer3, 0, 0, 51198);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(1550791755, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt.MainContent.3
                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                        int i7;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 6) == 0) {
                            i7 = i6 | (composer3.changed(paddingValues) ? 4 : 2);
                        } else {
                            i7 = i6;
                        }
                        if ((i7 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1550791755, i7, -1, "com.robinhood.shared.login.passwordreset.MainContent.<anonymous> (PasswordResetEmailSentComposable.kt:121)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(androidx.compose.foundation.layout.PaddingKt.padding(companion, paddingValues), 0.0f, 1, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        String str2 = str;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer3, 54);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer3.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme2.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        String strStringResource = StringResources_androidKt.stringResource(C39089R.string.password_reset_email_sent_title, composer3, 0);
                        TextAlign.Companion companion3 = TextAlign.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i8).getDisplayCapsuleMedium(), composer3, 0, 0, 8124);
                        Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme2.getSpacing(composer3, i8).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39089R.string.password_reset_email_sent_prompt, composer3, 0), modifierM5146paddingqDBjuR0$default2, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i8).getTextM(), composer3, 0, 0, 8124);
                        Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer3, 0);
                        BentoText2.m20747BentoText38GnDrw(str2, null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i8).getTextL(), composer3, 0, 0, 8126);
                        Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer3, 0);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composer2, 805306800, EnumC7081g.f2774x74902ae0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PasswordResetEmailSentComposable3.MainContent$lambda$18(str, passwordResetViewState, function0, function02, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierSystemBarsPadding2 = WindowInsetsPadding_androidKt.systemBarsPadding(modifier4);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierSystemBarsPadding2, ComposableLambda3.rememberComposableLambda(895917824, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt.MainContent.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(895917824, i6, -1, "com.robinhood.shared.login.passwordreset.MainContent.<anonymous> (PasswordResetEmailSentComposable.kt:105)");
                    }
                    Function2<Composer, Integer, Unit> function2M25513getLambda$1580091923$feature_login_externalRelease = PasswordResetEmailSentComposable.INSTANCE.m25513getLambda$1580091923$feature_login_externalRelease();
                    final Function0<Unit> function03 = function02;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M25513getLambda$1580091923$feature_login_externalRelease, null, ComposableLambda3.rememberComposableLambda(325341505, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt.MainContent.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i7 & 6) == 0) {
                                i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(325341505, i7, -1, "com.robinhood.shared.login.passwordreset.MainContent.<anonymous>.<anonymous> (PasswordResetEmailSentComposable.kt:107)");
                            }
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function03, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-372752255, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt.MainContent.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-372752255, i6, -1, "com.robinhood.shared.login.passwordreset.MainContent.<anonymous> (PasswordResetEmailSentComposable.kt:113)");
                    }
                    BentoButtonBar2.BentoButtonBar(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer3, 6, 1), null, null, false, null, null, null, null, false, null, false, function0, StringResources_androidKt.stringResource(C39089R.string.password_reset_email_help_title, composer3, 0), passwordResetViewState.isLoading(), null, false, composer3, 0, 0, 51198);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, 0, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(1550791755, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.login.passwordreset.PasswordResetEmailSentComposableKt.MainContent.3
                public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                    int i7;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i6 & 6) == 0) {
                        i7 = i6 | (composer3.changed(paddingValues) ? 4 : 2);
                    } else {
                        i7 = i6;
                    }
                    if ((i7 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1550791755, i7, -1, "com.robinhood.shared.login.passwordreset.MainContent.<anonymous> (PasswordResetEmailSentComposable.kt:121)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(androidx.compose.foundation.layout.PaddingKt.padding(companion, paddingValues), 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    String str2 = str;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer3, 54);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer3.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer3.startReusableNode();
                    if (composer3.getInserting()) {
                        composer3.createNode(constructor);
                    } else {
                        composer3.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme22.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    String strStringResource = StringResources_androidKt.stringResource(C39089R.string.password_reset_email_sent_title, composer3, 0);
                    TextAlign.Companion companion3 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer3, i8).getDisplayCapsuleMedium(), composer3, 0, 0, 8124);
                    Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme22.getSpacing(composer3, i8).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39089R.string.password_reset_email_sent_prompt, composer3, 0), modifierM5146paddingqDBjuR0$default2, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer3, i8).getTextM(), composer3, 0, 0, 8124);
                    Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer3, 0);
                    BentoText2.m20747BentoText38GnDrw(str2, null, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer3, i8).getTextL(), composer3, 0, 0, 8126);
                    Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer3, 0);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composer2, 805306800, EnumC7081g.f2774x74902ae0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
