package com.robinhood.android.oauth;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.fragment.app.FragmentActivity;
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
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieAnimationState;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.animateLottieCompositionAsState;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.robinhood.analytics.EventLogger;
import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.oauth.targets.OAuthWaitingEvent;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.OAuthInfo;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.compose.LocalActivity3;
import com.salesforce.android.smi.network.data.domain.auth.Auth;
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

/* compiled from: OAuthWaitingComposable.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0007\"\u0016\u0010\b\u001a\u00020\u00038\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\n¨\u0006\u000b²\u0006\u0012\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u008a\u0084\u0002²\u0006\f\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u008a\u0084\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0012X\u008a\u0084\u0002"}, m3636d2 = {"OAuthWaitingComposable", "", Auth.DEVELOPER_NAME, "", "referenceId", "duxo", "Lcom/robinhood/android/oauth/OAuthWaitingDuxo;", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/oauth/OAuthWaitingDuxo;Landroidx/compose/runtime/Composer;II)V", "OAuthWaitingLottieTestTag", "getOAuthWaitingLottieTestTag$annotations", "()V", "feature-oauth_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/oauth/targets/OAuthWaitingEvent;", "composition", "Lcom/airbnb/lottie/LottieComposition;", "progress", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.oauth.OAuthWaitingComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class OAuthWaitingComposable {
    public static final String OAuthWaitingLottieTestTag = "OAuthWaitingLottie";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OAuthWaitingComposable$lambda$8(String str, String str2, OAuthWaitingDuxo oAuthWaitingDuxo, int i, int i2, Composer composer, int i3) {
        OAuthWaitingComposable(str, str2, oAuthWaitingDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getOAuthWaitingLottieTestTag$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OAuthWaitingComposable(final String clientId, final String str, OAuthWaitingDuxo oAuthWaitingDuxo, Composer composer, final int i, final int i2) {
        int i3;
        OAuthWaitingDuxo oAuthWaitingDuxo2;
        Event<OAuthWaitingEvent> event;
        final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState;
        final Event<OAuthWaitingEvent> eventOAuthWaitingComposable$lambda$0;
        int i4;
        Object obj;
        final Event<OAuthWaitingEvent> eventOAuthWaitingComposable$lambda$02;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChanged;
        Object objRememberedValue;
        final OAuthWaitingDuxo oAuthWaitingDuxo3;
        EventConsumer<OAuthWaitingEvent> eventConsumerInvoke;
        EventConsumer<OAuthWaitingEvent> eventConsumerInvoke2;
        final String referenceId = str;
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(referenceId, "referenceId");
        Composer composerStartRestartGroup = composer.startRestartGroup(-261321977);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(clientId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(referenceId) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                oAuthWaitingDuxo2 = oAuthWaitingDuxo;
                int i5 = composerStartRestartGroup.changedInstance(oAuthWaitingDuxo2) ? 256 : 128;
                i3 |= i5;
            } else {
                oAuthWaitingDuxo2 = oAuthWaitingDuxo;
            }
            i3 |= i5;
        } else {
            oAuthWaitingDuxo2 = oAuthWaitingDuxo;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            oAuthWaitingDuxo3 = oAuthWaitingDuxo2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 4) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(OAuthWaitingDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.oauth.OAuthWaitingComposableKt$OAuthWaitingComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.oauth.OAuthWaitingComposableKt$OAuthWaitingComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    oAuthWaitingDuxo2 = (OAuthWaitingDuxo) baseDuxo;
                    i3 &= -897;
                }
                OAuthWaitingDuxo oAuthWaitingDuxo4 = oAuthWaitingDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-261321977, i3, -1, "com.robinhood.android.oauth.OAuthWaitingComposable (OAuthWaitingComposable.kt:42)");
                }
                final StateFlow<Event<OAuthWaitingEvent>> eventFlow = oAuthWaitingDuxo4.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.android.oauth.OAuthWaitingComposableKt$OAuthWaitingComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.oauth.OAuthWaitingComposableKt$OAuthWaitingComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.oauth.OAuthWaitingComposableKt$OAuthWaitingComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "OAuthWaitingComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.oauth.OAuthWaitingComposableKt$OAuthWaitingComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof OAuthWaitingEvent) {
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
                Event<OAuthWaitingEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof OAuthWaitingEvent)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                final FragmentActivity fragmentActivity = (FragmentActivity) composerStartRestartGroup.consume(LocalActivity3.getLocalActivity());
                EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                Intrinsics.checkNotNull(current2, "null cannot be cast to non-null type com.robinhood.analytics.SharedEventLogger");
                final SharedEventLogger sharedEventLogger = (SharedEventLogger) current2;
                LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(LottieUrl.SECURITY_OAUTH_SPINNER.getUrl().getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(OAuthWaitingComposable$lambda$1(lottieCompositionResultRememberLottieComposition), false, false, false, null, 0.0f, Integer.MAX_VALUE, null, false, false, composerStartRestartGroup, 1572864, 958);
                eventOAuthWaitingComposable$lambda$0 = OAuthWaitingComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (eventOAuthWaitingComposable$lambda$0 == null) {
                    if (!(eventOAuthWaitingComposable$lambda$0.getData() instanceof OAuthWaitingEvent.LaunchDeeplink) || (eventConsumerInvoke2 = eventOAuthWaitingComposable$lambda$0.getGetEventConsumer().invoke()) == null) {
                        i4 = 0;
                        obj = null;
                    } else {
                        i4 = 0;
                        obj = null;
                        Function1<? super OAuthWaitingEvent, Unit> function1 = new Function1() { // from class: com.robinhood.android.oauth.OAuthWaitingComposableKt$OAuthWaitingComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m16773invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m16773invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                try {
                                    fragmentActivity.startActivity(new Intent("android.intent.action.VIEW", ((OAuthWaitingEvent.LaunchDeeplink) eventOAuthWaitingComposable$lambda$0.getData()).getUri()));
                                    SharedEventLogger.DefaultImpls.logAccountSecurityEvent$default(sharedEventLogger, null, null, new OAuthInfo(OAuthInfo.OAuthStep.REDIRECT_SUCCESS, clientId, str, null, null, null, 56, null), null, null, 27, null);
                                } catch (ActivityNotFoundException unused) {
                                    SharedEventLogger.DefaultImpls.logAccountSecurityEvent$default(sharedEventLogger, null, null, new OAuthInfo(OAuthInfo.OAuthStep.REDIRECT_FAILURE, clientId, str, null, null, null, 56, null), null, null, 27, null);
                                }
                                fragmentActivity.finishAndRemoveTask();
                            }
                        };
                        fragmentActivity = fragmentActivity;
                        referenceId = str;
                        eventConsumerInvoke2.consume(eventOAuthWaitingComposable$lambda$0, function1);
                    }
                    Unit unit = Unit.INSTANCE;
                } else {
                    i4 = 0;
                    obj = null;
                }
                eventOAuthWaitingComposable$lambda$02 = OAuthWaitingComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (eventOAuthWaitingComposable$lambda$02 != null) {
                    if ((eventOAuthWaitingComposable$lambda$02.getData() instanceof OAuthWaitingEvent.Error) && (eventConsumerInvoke = eventOAuthWaitingComposable$lambda$02.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventOAuthWaitingComposable$lambda$02, new Function1() { // from class: com.robinhood.android.oauth.OAuthWaitingComposableKt$OAuthWaitingComposable$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) throws Throwable {
                                m16774invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m16774invoke(Object it) throws Throwable {
                                Intrinsics.checkNotNullParameter(it, "it");
                                OAuthWaitingEvent.Error error = (OAuthWaitingEvent.Error) eventOAuthWaitingComposable$lambda$02.getData();
                                EventLogger.DefaultImpls.logScreenAppear$default(sharedEventLogger, null, new Screen(Screen.Name.OAUTH_WATING_SCREEN, null, referenceId, null, 10, null), new Component(Component.ComponentType.ALERT, null, null, 6, null), null, null, 25, null);
                                ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, fragmentActivity, error.getThrowable(), true, false, 0, null, 56, null);
                            }
                        });
                    }
                    Unit unit2 = Unit.INSTANCE;
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composerStartRestartGroup, i6).getJet(), null, 2, null), 0.0f, 1, obj);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5091spacedByD5KLDUw(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), companion2.getCenterVertically()), companion2.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i4);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifierM5162requiredSize3ABfNKs = SizeKt.m5162requiredSize3ABfNKs(TestTag3.testTag(companion, OAuthWaitingLottieTestTag), C2002Dp.m7995constructorimpl(120));
                LottieComposition lottieCompositionOAuthWaitingComposable$lambda$1 = OAuthWaitingComposable$lambda$1(lottieCompositionResultRememberLottieComposition);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.oauth.OAuthWaitingComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(OAuthWaitingComposable.OAuthWaitingComposable$lambda$2(lottieAnimationStateAnimateLottieCompositionAsState));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                LottieAnimation2.LottieAnimation(lottieCompositionOAuthWaitingComposable$lambda$1, (Function0) objRememberedValue, modifierM5162requiredSize3ABfNKs, false, false, false, null, false, null, null, null, false, false, null, null, false, composerStartRestartGroup, 384, 0, 65528);
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C22626R.string.oauth_waiting_title, composerStartRestartGroup, i4), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i6).getNova()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8122);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                oAuthWaitingDuxo3 = oAuthWaitingDuxo4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                OAuthWaitingDuxo oAuthWaitingDuxo42 = oAuthWaitingDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final Flow eventFlow2 = oAuthWaitingDuxo42.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.android.oauth.OAuthWaitingComposableKt$OAuthWaitingComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.oauth.OAuthWaitingComposableKt$OAuthWaitingComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.android.oauth.OAuthWaitingComposableKt$OAuthWaitingComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "OAuthWaitingComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.android.oauth.OAuthWaitingComposableKt$OAuthWaitingComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof OAuthWaitingEvent) {
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
                Event<OAuthWaitingEvent> value2 = eventFlow2.getValue();
                event = value2;
                if (!((event == null ? event.getData() : null) instanceof OAuthWaitingEvent)) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                final FragmentActivity fragmentActivity2 = (FragmentActivity) composerStartRestartGroup.consume(LocalActivity3.getLocalActivity());
                EventLogger current22 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                Intrinsics.checkNotNull(current22, "null cannot be cast to non-null type com.robinhood.analytics.SharedEventLogger");
                final SharedEventLogger sharedEventLogger2 = (SharedEventLogger) current22;
                LottieCompositionResult lottieCompositionResultRememberLottieComposition2 = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.Url.m9176boximpl(LottieCompositionSpec.Url.m9177constructorimpl(LottieUrl.SECURITY_OAUTH_SPINNER.getUrl().getUrl())), null, null, null, null, null, composerStartRestartGroup, 0, 62);
                lottieAnimationStateAnimateLottieCompositionAsState = animateLottieCompositionAsState.animateLottieCompositionAsState(OAuthWaitingComposable$lambda$1(lottieCompositionResultRememberLottieComposition2), false, false, false, null, 0.0f, Integer.MAX_VALUE, null, false, false, composerStartRestartGroup, 1572864, 958);
                eventOAuthWaitingComposable$lambda$0 = OAuthWaitingComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                if (eventOAuthWaitingComposable$lambda$0 == null) {
                }
                eventOAuthWaitingComposable$lambda$02 = OAuthWaitingComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                if (eventOAuthWaitingComposable$lambda$02 != null) {
                }
                Modifier.Companion companion4 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Background3.m4872backgroundbw27NRU$default(companion4, bentoTheme2.getColors(composerStartRestartGroup, i62).getJet(), null, 2, null), 0.0f, 1, obj);
                Alignment.Companion companion22 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5091spacedByD5KLDUw(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), companion22.getCenterVertically()), companion22.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i4);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion32.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    Modifier modifierM5162requiredSize3ABfNKs2 = SizeKt.m5162requiredSize3ABfNKs(TestTag3.testTag(companion4, OAuthWaitingLottieTestTag), C2002Dp.m7995constructorimpl(120));
                    LottieComposition lottieCompositionOAuthWaitingComposable$lambda$12 = OAuthWaitingComposable$lambda$1(lottieCompositionResultRememberLottieComposition2);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.oauth.OAuthWaitingComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(OAuthWaitingComposable.OAuthWaitingComposable$lambda$2(lottieAnimationStateAnimateLottieCompositionAsState));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        LottieAnimation2.LottieAnimation(lottieCompositionOAuthWaitingComposable$lambda$12, (Function0) objRememberedValue, modifierM5162requiredSize3ABfNKs2, false, false, false, null, false, null, null, null, false, false, null, null, false, composerStartRestartGroup, 384, 0, 65528);
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C22626R.string.oauth_waiting_title, composerStartRestartGroup, i4), null, Color.m6701boximpl(bentoTheme2.getColors(composerStartRestartGroup, i62).getNova()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8122);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        oAuthWaitingDuxo3 = oAuthWaitingDuxo42;
                    }
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.oauth.OAuthWaitingComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return OAuthWaitingComposable.OAuthWaitingComposable$lambda$8(clientId, referenceId, oAuthWaitingDuxo3, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    private static final Event<OAuthWaitingEvent> OAuthWaitingComposable$lambda$0(SnapshotState4<Event<OAuthWaitingEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final LottieComposition OAuthWaitingComposable$lambda$1(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float OAuthWaitingComposable$lambda$2(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }
}
