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
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.security.verify.credentials.C39685R;
import com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposable;
import com.robinhood.shared.security.verify.credentials.email.CheckYourEmailEvent;
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
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CheckYourEmailComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\"\u000e\u0010\u000b\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u000f\u001a\u00020\u000eX\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\u0012\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u008a\u0084\u0002"}, m3636d2 = {"CheckYourEmailComposable", "", "email", "", "onPrimaryCtaClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/security/verify/credentials/email/CheckYourEmailDuxo;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/security/verify/credentials/email/CheckYourEmailDuxo;Landroidx/compose/runtime/Composer;II)V", "UnverifiedEmailAlertId", "feature-verify-credentials_externalDebug", "showWarningDialog", "", "showLinkSentDialog", "viewState", "Lcom/robinhood/shared/security/verify/credentials/email/CheckYourEmailViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/security/verify/credentials/email/CheckYourEmailEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CheckYourEmailComposable {
    private static final String UnverifiedEmailAlertId = "UNVERIFIED_EMAIL_ALERT";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckYourEmailComposable$lambda$23(String str, Function0 function0, Modifier modifier, CheckYourEmailDuxo checkYourEmailDuxo, int i, int i2, Composer composer, int i3) {
        CheckYourEmailComposable(str, function0, modifier, checkYourEmailDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01db  */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CheckYourEmailComposable(final String email, final Function0<Unit> onPrimaryCtaClicked, Modifier modifier, CheckYourEmailDuxo checkYourEmailDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CheckYourEmailDuxo checkYourEmailDuxo2;
        int i4;
        Modifier modifier3;
        int i5;
        final CheckYourEmailDuxo checkYourEmailDuxo3;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState snapshotState;
        Object objRememberedValue2;
        boolean zChangedInstance;
        Object objRememberedValue3;
        Event<CheckYourEmailEvent> event;
        final Event<CheckYourEmailEvent> eventCheckYourEmailComposable$lambda$9;
        final Event<CheckYourEmailEvent> eventCheckYourEmailComposable$lambda$92;
        final Event<CheckYourEmailEvent> eventCheckYourEmailComposable$lambda$93;
        final Event<CheckYourEmailEvent> eventCheckYourEmailComposable$lambda$94;
        boolean zChangedInstance2;
        Object objRememberedValue4;
        int i6;
        Composer composer2;
        final SnapshotState snapshotState2;
        int i7;
        CheckYourEmailDuxo checkYourEmailDuxo4;
        EventLogger eventLogger;
        Modifier modifier4;
        int i8;
        ?? r9;
        final SnapshotState snapshotState3;
        Composer composer3;
        final Modifier modifier5;
        final CheckYourEmailDuxo checkYourEmailDuxo5;
        EventConsumer<CheckYourEmailEvent> eventConsumerInvoke;
        EventConsumer<CheckYourEmailEvent> eventConsumerInvoke2;
        EventConsumer<CheckYourEmailEvent> eventConsumerInvoke3;
        EventConsumer<CheckYourEmailEvent> eventConsumerInvoke4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(onPrimaryCtaClicked, "onPrimaryCtaClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1617328486);
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
            i3 |= composerStartRestartGroup.changedInstance(onPrimaryCtaClicked) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    checkYourEmailDuxo2 = checkYourEmailDuxo;
                    int i10 = composerStartRestartGroup.changedInstance(checkYourEmailDuxo2) ? 2048 : 1024;
                    i3 |= i10;
                } else {
                    checkYourEmailDuxo2 = checkYourEmailDuxo;
                }
                i3 |= i10;
            } else {
                checkYourEmailDuxo2 = checkYourEmailDuxo;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CheckYourEmailDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt$CheckYourEmailComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt$CheckYourEmailComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i5 = i4 & (-7169);
                        checkYourEmailDuxo3 = (CheckYourEmailDuxo) baseDuxo;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1617328486, i5, -1, "com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposable (CheckYourEmailComposable.kt:47)");
                    }
                    Object objConsume = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                    Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type android.app.Activity");
                    final Activity activity = (Activity) objConsume;
                    final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    snapshotState = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    final SnapshotState snapshotState4 = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    int i11 = i5 & 14;
                    zChangedInstance = composerStartRestartGroup.changedInstance(checkYourEmailDuxo3) | (i11 == 4);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CheckYourEmailComposable.CheckYourEmailComposable$lambda$7$lambda$6(checkYourEmailDuxo3, email);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    final Function2<UUID, Boolean, Unit> function2RememberSuvLauncher = SuvLauncher.rememberSuvLauncher(navigator, (Function0) objRememberedValue3, null, composerStartRestartGroup, 0, 4);
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(checkYourEmailDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    final StateFlow<Event<CheckYourEmailEvent>> eventFlow = checkYourEmailDuxo3.getEventFlow();
                    composerStartRestartGroup.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt$CheckYourEmailComposable$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt$CheckYourEmailComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt$CheckYourEmailComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CheckYourEmailComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt$CheckYourEmailComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                    if ((event != null ? event.getData() : null) instanceof CheckYourEmailEvent) {
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
                    Event<CheckYourEmailEvent> value = eventFlow.getValue();
                    event = value;
                    if (!((event == null ? event.getData() : null) instanceof CheckYourEmailEvent)) {
                        value = null;
                    }
                    int i12 = i5;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    eventCheckYourEmailComposable$lambda$9 = CheckYourEmailComposable$lambda$9(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventCheckYourEmailComposable$lambda$9 != null) {
                        if ((eventCheckYourEmailComposable$lambda$9.getData() instanceof CheckYourEmailEvent.EmailVerified) && (eventConsumerInvoke4 = eventCheckYourEmailComposable$lambda$9.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke4.consume(eventCheckYourEmailComposable$lambda$9, new Function1() { // from class: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt$CheckYourEmailComposable$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m25672invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25672invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    EventLogger.DefaultImpls.logDisappear$default(current2, UserInteractionEventData.Action.VERIFIED_EMAIL, new Screen(Screen.Name.REVAMP_LOGIN_VERIFY_EMAIL, null, null, null, 14, null), null, null, null, 28, null);
                                    onPrimaryCtaClicked.invoke();
                                }
                            });
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                    eventCheckYourEmailComposable$lambda$92 = CheckYourEmailComposable$lambda$9(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventCheckYourEmailComposable$lambda$92 != null) {
                        if ((eventCheckYourEmailComposable$lambda$92.getData() instanceof CheckYourEmailEvent.LinkSent) && (eventConsumerInvoke3 = eventCheckYourEmailComposable$lambda$92.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke3.consume(eventCheckYourEmailComposable$lambda$92, new Function1() { // from class: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt$CheckYourEmailComposable$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m25673invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25673invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    CheckYourEmailComposable.CheckYourEmailComposable$lambda$5(snapshotState4, true);
                                }
                            });
                        }
                        Unit unit2 = Unit.INSTANCE;
                    }
                    eventCheckYourEmailComposable$lambda$93 = CheckYourEmailComposable$lambda$9(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventCheckYourEmailComposable$lambda$93 != null) {
                        if ((eventCheckYourEmailComposable$lambda$93.getData() instanceof CheckYourEmailEvent.Error) && (eventConsumerInvoke2 = eventCheckYourEmailComposable$lambda$93.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(eventCheckYourEmailComposable$lambda$93, new Function1() { // from class: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt$CheckYourEmailComposable$$inlined$consumeIfType$3
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                                    m25674invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25674invoke(Object it) throws Throwable {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, activity, ((CheckYourEmailEvent.Error) eventCheckYourEmailComposable$lambda$93.getData()).getThrowable(), true, false, 0, Integer.valueOf(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome), 24, null);
                                }
                            });
                        }
                        Unit unit3 = Unit.INSTANCE;
                    }
                    eventCheckYourEmailComposable$lambda$94 = CheckYourEmailComposable$lambda$9(snapshotState4CollectAsStateWithLifecycle2);
                    if (eventCheckYourEmailComposable$lambda$94 != null) {
                        if ((eventCheckYourEmailComposable$lambda$94.getData() instanceof CheckYourEmailEvent.VerificationWorkflow) && (eventConsumerInvoke = eventCheckYourEmailComposable$lambda$94.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(eventCheckYourEmailComposable$lambda$94, new Function1() { // from class: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt$CheckYourEmailComposable$$inlined$consumeIfType$4
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m25675invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25675invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    CheckYourEmailEvent.VerificationWorkflow verificationWorkflow = (CheckYourEmailEvent.VerificationWorkflow) eventCheckYourEmailComposable$lambda$94.getData();
                                    function2RememberSuvLauncher.invoke(verificationWorkflow.getWorkflowId(), Boolean.valueOf(verificationWorkflow.isMigrated()));
                                }
                            });
                        }
                        Unit unit4 = Unit.INSTANCE;
                    }
                    Unit unit5 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(checkYourEmailDuxo3) | (i11 != 4);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new CheckYourEmailComposable2(checkYourEmailDuxo3, email, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceGroup(525539192);
                    if (CheckYourEmailComposable$lambda$1(snapshotState)) {
                        i6 = 5004770;
                        composer2 = composerStartRestartGroup;
                        snapshotState2 = snapshotState4;
                        i7 = 6;
                        checkYourEmailDuxo4 = checkYourEmailDuxo3;
                        eventLogger = current2;
                        modifier4 = modifier3;
                        i8 = 0;
                        r9 = 1;
                        snapshotState3 = snapshotState;
                    } else {
                        String strStringResource = StringResources_androidKt.stringResource(C39685R.string.check_your_email_warning_dialog_title, composerStartRestartGroup, 0);
                        BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C39685R.string.check_your_email_warning_dialog_message, composerStartRestartGroup, 0));
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Screen.Name name = Screen.Name.REVAMP_LOGIN_VERIFY_EMAIL;
                        Screen screen = new Screen(name, null, null, null, 14, null);
                        Component.ComponentType componentType = Component.ComponentType.ALERT;
                        BentoAlertButton bentoAlertButton = new BentoAlertButton(StringResources_androidKt.stringResource(C39685R.string.check_your_email_warning_dialog_primary_cta_text, composerStartRestartGroup, 0), onPrimaryCtaClicked, ModifiersKt.autoLogEvents$default(ModifiersKt.logScreenTransitions(companion2, new UserInteractionEventDescriptor(null, screen, null, null, new Component(componentType, UnverifiedEmailAlertId, null, 4, null), null, 45, null)), new UserInteractionEventDescriptor(null, new Screen(name, null, null, null, 14, null), UserInteractionEventData.Action.CONTINUE, null, new Component(componentType, UnverifiedEmailAlertId, null, 4, null), null, 41, null), false, false, false, true, false, null, 110, null), null, null, false, 56, null);
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion2, new UserInteractionEventDescriptor(null, new Screen(name, null, null, null, 14, null), UserInteractionEventData.Action.CANCEL, null, new Component(componentType, UnverifiedEmailAlertId, null, 4, null), null, 41, null), false, false, false, true, false, null, 110, null);
                        String strStringResource2 = StringResources_androidKt.stringResource(C39685R.string.check_your_email_warning_dialog_secondary_cta_text, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                            snapshotState3 = snapshotState;
                            objRememberedValue6 = new Function0() { // from class: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckYourEmailComposable.CheckYourEmailComposable$lambda$16$lambda$15(snapshotState3);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            snapshotState3 = snapshotState;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoAlertButton bentoAlertButton2 = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue6, modifierAutoLogEvents$default, null, null, false, 56, null);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue7 == companion.getEmpty()) {
                            objRememberedValue7 = new Function0() { // from class: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckYourEmailComposable.CheckYourEmailComposable$lambda$18$lambda$17(snapshotState3);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        }
                        Function0 function0 = (Function0) objRememberedValue7;
                        composerStartRestartGroup.endReplaceGroup();
                        int i13 = (BentoAlertDialog2.Body.Text.$stable << 3) | 100663296;
                        int i14 = BentoAlertButton.$stable;
                        int i15 = i13 | (i14 << 6) | (i14 << 12);
                        checkYourEmailDuxo4 = checkYourEmailDuxo3;
                        i7 = 6;
                        i8 = 0;
                        snapshotState2 = snapshotState4;
                        eventLogger = current2;
                        r9 = 1;
                        i6 = 5004770;
                        modifier4 = modifier3;
                        BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, bentoAlertButton2, null, false, null, function0, composerStartRestartGroup, i15, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                        composer2 = composerStartRestartGroup;
                    }
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(525615304);
                    if (CheckYourEmailComposable$lambda$4(snapshotState2)) {
                        String strStringResource3 = StringResources_androidKt.stringResource(C39685R.string.check_your_email_link_sent_dialog_title, composer2, i8);
                        BentoAlertDialog2.Body.Text text2 = new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C39685R.string.check_your_email_link_sent_dialog_message, new Object[]{email}, composer2, i8));
                        String strStringResource4 = StringResources_androidKt.stringResource(C39685R.string.check_your_email_link_sent_dialog_primary_cta_text, composer2, i8);
                        composer2.startReplaceGroup(i6);
                        Object objRememberedValue8 = composer2.rememberedValue();
                        if (objRememberedValue8 == companion.getEmpty()) {
                            objRememberedValue8 = new Function0() { // from class: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckYourEmailComposable.CheckYourEmailComposable$lambda$20$lambda$19(snapshotState2);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue8);
                        }
                        composer2.endReplaceGroup();
                        BentoAlertButton bentoAlertButton3 = new BentoAlertButton(strStringResource4, (Function0) objRememberedValue8);
                        composer2.startReplaceGroup(i6);
                        Object objRememberedValue9 = composer2.rememberedValue();
                        if (objRememberedValue9 == companion.getEmpty()) {
                            objRememberedValue9 = new Function0() { // from class: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CheckYourEmailComposable.CheckYourEmailComposable$lambda$22$lambda$21(snapshotState2);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue9);
                        }
                        composer2.endReplaceGroup();
                        BentoAlertDialog.BentoAlertDialog(strStringResource3, text2, bentoAlertButton3, null, null, null, false, null, (Function0) objRememberedValue9, composer2, (BentoAlertDialog2.Body.Text.$stable << 3) | 100663296 | (BentoAlertButton.$stable << i7), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                    }
                    composer2.endReplaceGroup();
                    CheckYourEmailDuxo checkYourEmailDuxo6 = checkYourEmailDuxo4;
                    Composer composer4 = composer2;
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(ModifiersKt.logScreenTransitions(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier4, 0.0f, composer2, (i12 >> 6) & 14, r9), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.REVAMP_LOGIN_VERIFY_EMAIL, null, null, null, 14, null), null, null, null, null, 61, null)), false, ComposableLambda3.rememberComposableLambda(759038927, r9, new C3971210(eventLogger, checkYourEmailDuxo4, email, snapshotState3, snapshotState4CollectAsStateWithLifecycle), composer2, 54), ComposableLambda3.rememberComposableLambda(1432165762, r9, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt.CheckYourEmailComposable.11
                        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer5, int i16) {
                            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                            if ((i16 & 17) == 16 && composer5.getSkipping()) {
                                composer5.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1432165762, i16, -1, "com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposable.<anonymous> (CheckYourEmailComposable.kt:184)");
                            }
                            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                            String str = email;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer5, 54);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierFillMaxSize$default);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            if (composer5.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer5.startReusableNode();
                            if (composer5.getInserting()) {
                                composer5.createNode(constructor);
                            } else {
                                composer5.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer5, BentoTheme.$stable).getTextL(), composer5, 0, 0, 8126);
                            composer5.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer5, Integer num) {
                            invoke(boxScope, composer5, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer4, 3456, 2);
                    composer3 = composer4;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    checkYourEmailDuxo5 = checkYourEmailDuxo6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i4 &= -7169;
                    }
                    modifier3 = modifier2;
                }
                i5 = i4;
                checkYourEmailDuxo3 = checkYourEmailDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Object objConsume2 = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume2, "null cannot be cast to non-null type android.app.Activity");
                final Activity activity2 = (Activity) objConsume2;
                final EventLogger current22 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
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
                final SnapshotState snapshotState42 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i112 = i5 & 14;
                zChangedInstance = composerStartRestartGroup.changedInstance(checkYourEmailDuxo3) | (i112 == 4);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CheckYourEmailComposable.CheckYourEmailComposable$lambda$7$lambda$6(checkYourEmailDuxo3, email);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    composerStartRestartGroup.endReplaceGroup();
                    final Function2 function2RememberSuvLauncher2 = SuvLauncher.rememberSuvLauncher(navigator2, (Function0) objRememberedValue3, null, composerStartRestartGroup, 0, 4);
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(checkYourEmailDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    final Flow eventFlow2 = checkYourEmailDuxo3.getEventFlow();
                    composerStartRestartGroup.startReplaceGroup(-523522313);
                    LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                    Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt$CheckYourEmailComposable$$inlined$collectEventAsStateWithLifecycle$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt$CheckYourEmailComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt$CheckYourEmailComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "CheckYourEmailComposable.kt", m3646l = {50}, m3647m = "emit")
                            /* renamed from: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt$CheckYourEmailComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                    if ((event != null ? event.getData() : null) instanceof CheckYourEmailEvent) {
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
                    Event<CheckYourEmailEvent> value2 = eventFlow2.getValue();
                    event = value2;
                    if (!((event == null ? event.getData() : null) instanceof CheckYourEmailEvent)) {
                    }
                    int i122 = i5;
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    eventCheckYourEmailComposable$lambda$9 = CheckYourEmailComposable$lambda$9(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventCheckYourEmailComposable$lambda$9 != null) {
                    }
                    eventCheckYourEmailComposable$lambda$92 = CheckYourEmailComposable$lambda$9(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventCheckYourEmailComposable$lambda$92 != null) {
                    }
                    eventCheckYourEmailComposable$lambda$93 = CheckYourEmailComposable$lambda$9(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventCheckYourEmailComposable$lambda$93 != null) {
                    }
                    eventCheckYourEmailComposable$lambda$94 = CheckYourEmailComposable$lambda$9(snapshotState4CollectAsStateWithLifecycle22);
                    if (eventCheckYourEmailComposable$lambda$94 != null) {
                    }
                    Unit unit52 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(checkYourEmailDuxo3) | (i112 != 4);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue4 = new CheckYourEmailComposable2(checkYourEmailDuxo3, email, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit52, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceGroup(525539192);
                        if (CheckYourEmailComposable$lambda$1(snapshotState)) {
                        }
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(525615304);
                        if (CheckYourEmailComposable$lambda$4(snapshotState2)) {
                        }
                        composer2.endReplaceGroup();
                        CheckYourEmailDuxo checkYourEmailDuxo62 = checkYourEmailDuxo4;
                        Composer composer42 = composer2;
                        BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(ModifiersKt.logScreenTransitions(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier4, 0.0f, composer2, (i122 >> 6) & 14, r9), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.REVAMP_LOGIN_VERIFY_EMAIL, null, null, null, 14, null), null, null, null, null, 61, null)), false, ComposableLambda3.rememberComposableLambda(759038927, r9, new C3971210(eventLogger, checkYourEmailDuxo4, email, snapshotState3, snapshotState4CollectAsStateWithLifecycle3), composer2, 54), ComposableLambda3.rememberComposableLambda(1432165762, r9, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt.CheckYourEmailComposable.11
                            public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer5, int i16) {
                                Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                                if ((i16 & 17) == 16 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1432165762, i16, -1, "com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposable.<anonymous> (CheckYourEmailComposable.kt:184)");
                                }
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                                String str = email;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer5, 54);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierFillMaxSize$default);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                if (composer5.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer5.startReusableNode();
                                if (composer5.getInserting()) {
                                    composer5.createNode(constructor);
                                } else {
                                    composer5.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(str, null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer5, BentoTheme.$stable).getTextL(), composer5, 0, 0, 8126);
                                composer5.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer5, Integer num) {
                                invoke(boxScope, composer5, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composer2, 54), composer42, 3456, 2);
                        composer3 = composer42;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier5 = modifier4;
                        checkYourEmailDuxo5 = checkYourEmailDuxo62;
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
                checkYourEmailDuxo5 = checkYourEmailDuxo2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CheckYourEmailComposable.CheckYourEmailComposable$lambda$23(email, onPrimaryCtaClicked, modifier5, checkYourEmailDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i9 == 0) {
                }
                if ((i2 & 8) == 0) {
                    i5 = i4;
                    checkYourEmailDuxo3 = checkYourEmailDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Object objConsume22 = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume22, "null cannot be cast to non-null type android.app.Activity");
                final Activity activity22 = (Activity) objConsume22;
                final EventLogger current222 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
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
                final SnapshotState snapshotState422 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                Navigator navigator22 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i1122 = i5 & 14;
                zChangedInstance = composerStartRestartGroup.changedInstance(checkYourEmailDuxo3) | (i1122 == 4);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CheckYourEmailComposable$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CheckYourEmailComposable$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckYourEmailComposable$lambda$7$lambda$6(CheckYourEmailDuxo checkYourEmailDuxo, String str) {
        checkYourEmailDuxo.resendLink(str);
        return Unit.INSTANCE;
    }

    private static final boolean CheckYourEmailComposable$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean CheckYourEmailComposable$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckYourEmailViewState CheckYourEmailComposable$lambda$8(SnapshotState4<CheckYourEmailViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CheckYourEmailEvent> CheckYourEmailComposable$lambda$9(SnapshotState4<Event<CheckYourEmailEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckYourEmailComposable$lambda$16$lambda$15(SnapshotState snapshotState) {
        CheckYourEmailComposable$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckYourEmailComposable$lambda$18$lambda$17(SnapshotState snapshotState) {
        CheckYourEmailComposable$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckYourEmailComposable$lambda$20$lambda$19(SnapshotState snapshotState) {
        CheckYourEmailComposable$lambda$5(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CheckYourEmailComposable$lambda$22$lambda$21(SnapshotState snapshotState) {
        CheckYourEmailComposable$lambda$5(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* compiled from: CheckYourEmailComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt$CheckYourEmailComposable$10 */
    static final class C3971210 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
        final /* synthetic */ CheckYourEmailDuxo $duxo;
        final /* synthetic */ String $email;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ SnapshotState<Boolean> $showWarningDialog$delegate;
        final /* synthetic */ SnapshotState4<CheckYourEmailViewState> $viewState$delegate;

        C3971210(EventLogger eventLogger, CheckYourEmailDuxo checkYourEmailDuxo, String str, SnapshotState<Boolean> snapshotState, SnapshotState4<CheckYourEmailViewState> snapshotState4) {
            this.$eventLogger = eventLogger;
            this.$duxo = checkYourEmailDuxo;
            this.$email = str;
            this.$showWarningDialog$delegate = snapshotState;
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
                ComposerKt.traceEventStart(759038927, i, -1, "com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposable.<anonymous> (CheckYourEmailComposable.kt:162)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C39685R.string.check_your_email_helper_text, composer, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C39685R.string.check_your_email_inline_link_text, composer, 0);
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$duxo) | composer.changed(this.$email);
            final EventLogger eventLogger = this.$eventLogger;
            final CheckYourEmailDuxo checkYourEmailDuxo = this.$duxo;
            final String str = this.$email;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt$CheckYourEmailComposable$10$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CheckYourEmailComposable.C3971210.invoke$lambda$1$lambda$0(eventLogger, checkYourEmailDuxo, str);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger);
            final EventLogger eventLogger2 = this.$eventLogger;
            final SnapshotState<Boolean> snapshotState = this.$showWarningDialog$delegate;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposableKt$CheckYourEmailComposable$10$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CheckYourEmailComposable.C3971210.invoke$lambda$3$lambda$2(eventLogger2, snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(null, strStringResource, strStringResource2, false, function0, null, (Function0) objRememberedValue2, StringResources_androidKt.stringResource(C39685R.string.check_your_email_primary_cta_text, composer, 0), CheckYourEmailComposable.CheckYourEmailComposable$lambda$8(this.$viewState$delegate).isLoading(), null, false, null, null, false, null, false, composer, 0, 0, 65065);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, CheckYourEmailDuxo checkYourEmailDuxo, String str) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.RESEND_LINK, new Screen(Screen.Name.REVAMP_LOGIN_VERIFY_EMAIL, null, null, null, 14, null), null, null, null, false, 60, null);
            checkYourEmailDuxo.resendLink(str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, SnapshotState snapshotState) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.CONTINUE, new Screen(Screen.Name.REVAMP_LOGIN_VERIFY_EMAIL, null, null, null, 14, null), null, null, null, false, 60, null);
            CheckYourEmailComposable.CheckYourEmailComposable$lambda$2(snapshotState, true);
            return Unit.INSTANCE;
        }
    }
}
