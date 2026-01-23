package com.robinhood.shared.stepupverification.loggedinchallenge;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
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
import androidx.view.compose.ActivityResultRegistry3;
import androidx.view.compose.ActivityResultRegistry8;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p355ui.pathfinder.contexts.LoggedInChallengeContext;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.shared.lib.challenge.ChallengeVerificationResult;
import com.robinhood.shared.lib.challenge.ChallengeVerificationResultContract;
import com.robinhood.shared.security.contracts.ChallengeVerificationInput;
import com.robinhood.shared.security.contracts.ChallengeVerificationIntentKey;
import com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: LoggedInChallengeComposable.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001aE\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\u0012\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u008a\u0084\u0002"}, m3636d2 = {"LoggedInChallengeComposable", "", "loggedInChallengeContext", "Lcom/robinhood/models/ui/pathfinder/contexts/LoggedInChallengeContext;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "onError", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/stepupverification/loggedinchallenge/LoggedInChallengeDuxo;", "(Lcom/robinhood/models/ui/pathfinder/contexts/LoggedInChallengeContext;Lcom/robinhood/shared/app/type/AppType;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/stepupverification/loggedinchallenge/LoggedInChallengeDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-step-up-verification_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/stepupverification/loggedinchallenge/LoggedInChallengeEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class LoggedInChallengeComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Navigator LoggedInChallengeComposable$lambda$1$lambda$0(Navigator navigator) {
        return navigator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoggedInChallengeComposable$lambda$7(LoggedInChallengeContext loggedInChallengeContext, AppType appType, Function1 function1, Modifier modifier, LoggedInChallengeDuxo loggedInChallengeDuxo, int i, int i2, Composer composer, int i3) {
        LoggedInChallengeComposable(loggedInChallengeContext, appType, function1, modifier, loggedInChallengeDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0178  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoggedInChallengeComposable(final LoggedInChallengeContext loggedInChallengeContext, final AppType appType, final Function1<? super Throwable, Unit> onError, Modifier modifier, LoggedInChallengeDuxo loggedInChallengeDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        LoggedInChallengeDuxo loggedInChallengeDuxo2;
        Modifier modifier3;
        int i4;
        final LoggedInChallengeDuxo loggedInChallengeDuxo3;
        final Navigator navigator;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        final ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult;
        Event<LoggedInChallengeEvent> event;
        final Event<LoggedInChallengeEvent> eventLoggedInChallengeComposable$lambda$4;
        final Event<LoggedInChallengeEvent> eventLoggedInChallengeComposable$lambda$42;
        final LoggedInChallengeDuxo loggedInChallengeDuxo4;
        EventConsumer<LoggedInChallengeEvent> eventConsumerInvoke;
        EventConsumer<LoggedInChallengeEvent> eventConsumerInvoke2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(loggedInChallengeContext, "loggedInChallengeContext");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2002092622);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(loggedInChallengeContext) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(appType.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onError) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    loggedInChallengeDuxo2 = loggedInChallengeDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(loggedInChallengeDuxo2) ? 16384 : 8192;
                    i3 |= i6;
                } else {
                    loggedInChallengeDuxo2 = loggedInChallengeDuxo;
                }
                i3 |= i6;
            } else {
                loggedInChallengeDuxo2 = loggedInChallengeDuxo;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(LoggedInChallengeDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeComposableKt$LoggedInChallengeComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeComposableKt$LoggedInChallengeComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i4 = i3 & (-57345);
                        loggedInChallengeDuxo3 = (LoggedInChallengeDuxo) baseDuxo;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2002092622, i4, -1, "com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeComposable (LoggedInChallengeComposable.kt:26)");
                        }
                        navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChangedInstance = composerStartRestartGroup.changedInstance(navigator);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return LoggedInChallengeComposable.LoggedInChallengeComposable$lambda$1$lambda$0(navigator);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        ChallengeVerificationResultContract challengeVerificationResultContract = new ChallengeVerificationResultContract((Function0) objRememberedValue);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(loggedInChallengeDuxo3);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeComposableKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return LoggedInChallengeComposable.LoggedInChallengeComposable$lambda$3$lambda$2(loggedInChallengeDuxo3, (ChallengeVerificationResult) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        activityResultRegistry8RememberLauncherForActivityResult = ActivityResultRegistry3.rememberLauncherForActivityResult(challengeVerificationResultContract, (Function1) objRememberedValue2, composerStartRestartGroup, ChallengeVerificationResultContract.$stable);
                        final StateFlow<Event<LoggedInChallengeEvent>> eventFlow = loggedInChallengeDuxo3.getEventFlow();
                        composerStartRestartGroup.startReplaceGroup(-523522313);
                        LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                        Lifecycle.State state = Lifecycle.State.STARTED;
                        CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                        Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeComposableKt$LoggedInChallengeComposable$$inlined$collectEventAsStateWithLifecycle$1

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeComposableKt$LoggedInChallengeComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeComposableKt$LoggedInChallengeComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "LoggedInChallengeComposable.kt", m3646l = {50}, m3647m = "emit")
                                /* renamed from: com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeComposableKt$LoggedInChallengeComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                        if ((event != null ? event.getData() : null) instanceof LoggedInChallengeEvent) {
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
                        Event<LoggedInChallengeEvent> value = eventFlow.getValue();
                        event = value;
                        if (!((event == null ? event.getData() : null) instanceof LoggedInChallengeEvent)) {
                            value = null;
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        eventLoggedInChallengeComposable$lambda$4 = LoggedInChallengeComposable$lambda$4(snapshotState4CollectAsStateWithLifecycle);
                        if (eventLoggedInChallengeComposable$lambda$4 != null && (eventLoggedInChallengeComposable$lambda$4.getData() instanceof LoggedInChallengeEvent.ChallengeLoaded) && (eventConsumerInvoke2 = eventLoggedInChallengeComposable$lambda$4.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke2.consume(eventLoggedInChallengeComposable$lambda$4, new Function1() { // from class: com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeComposableKt$LoggedInChallengeComposable$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m25727invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25727invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    NavigationActivityResultContract3.launch$default(activityResultRegistry8RememberLauncherForActivityResult, new ChallengeVerificationIntentKey(new ChallengeVerificationInput(loggedInChallengeContext.getSheriffFlowId(), appType != AppType.RHC, ((LoggedInChallengeEvent.ChallengeLoaded) eventLoggedInChallengeComposable$lambda$4.getData()).getChallenge(), null, null, loggedInChallengeContext.getVerificationWorkflowId(), loggedInChallengeContext.getFallbackCtaText(), null, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, null)), null, false, 6, null);
                                }
                            });
                        }
                        eventLoggedInChallengeComposable$lambda$42 = LoggedInChallengeComposable$lambda$4(snapshotState4CollectAsStateWithLifecycle);
                        if (eventLoggedInChallengeComposable$lambda$42 != null && (eventLoggedInChallengeComposable$lambda$42.getData() instanceof LoggedInChallengeEvent.Error) && (eventConsumerInvoke = eventLoggedInChallengeComposable$lambda$42.getGetEventConsumer().invoke()) != null) {
                            eventConsumerInvoke.consume(eventLoggedInChallengeComposable$lambda$42, new Function1() { // from class: com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeComposableKt$LoggedInChallengeComposable$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m25728invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25728invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    onError.invoke(((LoggedInChallengeEvent.Error) eventLoggedInChallengeComposable$lambda$42.getData()).getThrowable());
                                }
                            });
                        }
                        modifier2 = modifier3;
                        LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(modifier2, new ShimmerLoaderType.Hero.Size.Relative(0.5f), false, true, composerStartRestartGroup, ((i4 >> 9) & 14) | 3072 | (ShimmerLoaderType.Hero.Size.Relative.$stable << 3), 4);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        loggedInChallengeDuxo4 = loggedInChallengeDuxo3;
                    } else {
                        i4 = i3;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                }
                loggedInChallengeDuxo3 = loggedInChallengeDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(navigator);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LoggedInChallengeComposable.LoggedInChallengeComposable$lambda$1$lambda$0(navigator);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    ChallengeVerificationResultContract challengeVerificationResultContract2 = new ChallengeVerificationResultContract((Function0) objRememberedValue);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(loggedInChallengeDuxo3);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return LoggedInChallengeComposable.LoggedInChallengeComposable$lambda$3$lambda$2(loggedInChallengeDuxo3, (ChallengeVerificationResult) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        activityResultRegistry8RememberLauncherForActivityResult = ActivityResultRegistry3.rememberLauncherForActivityResult(challengeVerificationResultContract2, (Function1) objRememberedValue2, composerStartRestartGroup, ChallengeVerificationResultContract.$stable);
                        final Flow eventFlow2 = loggedInChallengeDuxo3.getEventFlow();
                        composerStartRestartGroup.startReplaceGroup(-523522313);
                        LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                        Lifecycle.State state2 = Lifecycle.State.STARTED;
                        CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                        Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeComposableKt$LoggedInChallengeComposable$$inlined$collectEventAsStateWithLifecycle$1

                            /* compiled from: Emitters.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeComposableKt$LoggedInChallengeComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                            public static final class AnonymousClass2<T> implements FlowCollector {
                                final /* synthetic */ FlowCollector $this_unsafeFlow;

                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeComposableKt$LoggedInChallengeComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "LoggedInChallengeComposable.kt", m3646l = {50}, m3647m = "emit")
                                /* renamed from: com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeComposableKt$LoggedInChallengeComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                        if ((event != null ? event.getData() : null) instanceof LoggedInChallengeEvent) {
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
                        Event<LoggedInChallengeEvent> value2 = eventFlow2.getValue();
                        event = value2;
                        if (!((event == null ? event.getData() : null) instanceof LoggedInChallengeEvent)) {
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        eventLoggedInChallengeComposable$lambda$4 = LoggedInChallengeComposable$lambda$4(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventLoggedInChallengeComposable$lambda$4 != null) {
                            eventConsumerInvoke2.consume(eventLoggedInChallengeComposable$lambda$4, new Function1() { // from class: com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeComposableKt$LoggedInChallengeComposable$$inlined$consumeIfType$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m25727invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25727invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    NavigationActivityResultContract3.launch$default(activityResultRegistry8RememberLauncherForActivityResult, new ChallengeVerificationIntentKey(new ChallengeVerificationInput(loggedInChallengeContext.getSheriffFlowId(), appType != AppType.RHC, ((LoggedInChallengeEvent.ChallengeLoaded) eventLoggedInChallengeComposable$lambda$4.getData()).getChallenge(), null, null, loggedInChallengeContext.getVerificationWorkflowId(), loggedInChallengeContext.getFallbackCtaText(), null, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, null)), null, false, 6, null);
                                }
                            });
                        }
                        eventLoggedInChallengeComposable$lambda$42 = LoggedInChallengeComposable$lambda$4(snapshotState4CollectAsStateWithLifecycle2);
                        if (eventLoggedInChallengeComposable$lambda$42 != null) {
                            eventConsumerInvoke.consume(eventLoggedInChallengeComposable$lambda$42, new Function1() { // from class: com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeComposableKt$LoggedInChallengeComposable$$inlined$consumeIfType$2
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                    m25728invoke(obj);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: collision with other method in class */
                                public final void m25728invoke(Object it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    onError.invoke(((LoggedInChallengeEvent.Error) eventLoggedInChallengeComposable$lambda$42.getData()).getThrowable());
                                }
                            });
                        }
                        modifier2 = modifier3;
                        LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(modifier2, new ShimmerLoaderType.Hero.Size.Relative(0.5f), false, true, composerStartRestartGroup, ((i4 >> 9) & 14) | 3072 | (ShimmerLoaderType.Hero.Size.Relative.$stable << 3), 4);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        loggedInChallengeDuxo4 = loggedInChallengeDuxo3;
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                loggedInChallengeDuxo4 = loggedInChallengeDuxo2;
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.stepupverification.loggedinchallenge.LoggedInChallengeComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LoggedInChallengeComposable.LoggedInChallengeComposable$lambda$7(loggedInChallengeContext, appType, onError, modifier4, loggedInChallengeDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
            }
        }
        final Modifier modifier42 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoggedInChallengeComposable$lambda$3$lambda$2(LoggedInChallengeDuxo loggedInChallengeDuxo, ChallengeVerificationResult challengeVerificationResult) {
        if (challengeVerificationResult instanceof ChallengeVerificationResult.Completed) {
            loggedInChallengeDuxo.submitChallengeResult(((ChallengeVerificationResult.Completed) challengeVerificationResult).getChallengeId(), false, false);
        } else if (challengeVerificationResult instanceof ChallengeVerificationResult.Fallback) {
            loggedInChallengeDuxo.submitChallengeResult(((ChallengeVerificationResult.Fallback) challengeVerificationResult).getChallengeId(), false, true);
        } else {
            loggedInChallengeDuxo.submitChallengeResult(null, true, false);
        }
        return Unit.INSTANCE;
    }

    private static final Event<LoggedInChallengeEvent> LoggedInChallengeComposable$lambda$4(SnapshotState4<Event<LoggedInChallengeEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
