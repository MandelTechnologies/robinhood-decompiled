package com.robinhood.shared.security.workflow;

import android.net.Uri;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.view.compose.LocalActivity;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.compose.LottieAnimation2;
import com.airbnb.lottie.compose.LottieCompositionResult;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.compose.rememberLottieComposition;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.lib.pathfinder.C20366R;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.contracts.NavigationActivityResultContract3;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.workflow.p358ui.UiWorkflowStatus;
import com.robinhood.models.workflow.p358ui.screens.InfoScreen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.security.contracts.InfoFragmentKey;
import com.robinhood.shared.security.lib.workflow.WorkflowErrorResponses;
import com.robinhood.shared.security.prompts.C39672R;
import com.robinhood.shared.security.workflow.InfoComposable;
import com.robinhood.shared.security.workflow.InfoDuxo;
import com.robinhood.shared.security.workflow.InfoEvent;
import com.robinhood.shared.support.supportchat.C40042R;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: InfoComposable.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a!\u0010\u0007\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002²\u0006\u0012\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u008a\u0084\u0002²\u0006\f\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u008a\u0084\u0002²\u0006\f\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u008a\u0084\u0002"}, m3636d2 = {"InfoComposable", "", "duxo", "Lcom/robinhood/shared/security/workflow/InfoDuxo;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/security/workflow/InfoDuxo;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Splash", "image", "Lcom/robinhood/models/workflow/ui/screens/InfoScreen$Image;", "(Lcom/robinhood/models/workflow/ui/screens/InfoScreen$Image;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-workflow_externalDebug", "viewState", "Lcom/robinhood/shared/security/workflow/InfoViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/security/workflow/InfoEvent;", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.security.workflow.InfoComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class InfoComposable {

    /* compiled from: InfoComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.security.workflow.InfoComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InfoScreen.Image.values().length];
            try {
                iArr[InfoScreen.Image.HOURGLASS_LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InfoScreen.Image.ALERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InfoScreen.Image.SECURITY_AND_PRIVACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InfoScreen.Image.PROMPT_ATTEMPT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[InfoScreen.Image.SECURE_LOCK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InfoComposable$lambda$5(InfoDuxo infoDuxo, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InfoComposable(infoDuxo, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Splash$lambda$8(InfoScreen.Image image, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Splash(image, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InfoComposable(final InfoDuxo duxo, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        final FragmentActivity fragmentActivity;
        final Navigator navigator;
        Event<InfoEvent> event;
        final Event<InfoEvent> eventInfoComposable$lambda$1;
        final Event<InfoEvent> eventInfoComposable$lambda$12;
        final Event<InfoEvent> eventInfoComposable$lambda$13;
        EventConsumer<InfoEvent> eventConsumerInvoke;
        EventConsumer<InfoEvent> eventConsumerInvoke2;
        EventConsumer<InfoEvent> eventConsumerInvoke3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Composer composerStartRestartGroup = composer.startRestartGroup(-613331376);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(duxo) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-613331376, i3, -1, "com.robinhood.shared.security.workflow.InfoComposable (InfoComposable.kt:66)");
                }
                Object objConsume = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                fragmentActivity = (FragmentActivity) objConsume;
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final StateFlow<Event<InfoEvent>> eventFlow = duxo.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.security.workflow.InfoComposableKt$InfoComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.security.workflow.InfoComposableKt$InfoComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.security.workflow.InfoComposableKt$InfoComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "InfoComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.security.workflow.InfoComposableKt$InfoComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof InfoEvent) {
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
                Event<InfoEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof InfoEvent)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
                eventInfoComposable$lambda$1 = InfoComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventInfoComposable$lambda$1 != null && (eventInfoComposable$lambda$1.getData() instanceof InfoEvent.Exit) && (eventConsumerInvoke3 = eventInfoComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke3.consume(eventInfoComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.security.workflow.InfoComposableKt$InfoComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25689invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25689invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            NavigationActivityResultContract3.finishWithResult$default(fragmentActivity, UiWorkflowStatus.DENIED, 0, 2, null);
                        }
                    });
                }
                eventInfoComposable$lambda$12 = InfoComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventInfoComposable$lambda$12 != null && (eventInfoComposable$lambda$12.getData() instanceof InfoEvent.Error) && (eventConsumerInvoke2 = eventInfoComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventInfoComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.security.workflow.InfoComposableKt$InfoComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25690invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25690invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            WorkflowErrorResponses.handleWorkflowError$default(fragmentActivity, ((InfoEvent.Error) eventInfoComposable$lambda$12.getData()).getThrowable(), 0, 2, null);
                        }
                    });
                }
                eventInfoComposable$lambda$13 = InfoComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventInfoComposable$lambda$13 != null && (eventInfoComposable$lambda$13.getData() instanceof InfoEvent.Deeplink) && (eventConsumerInvoke = eventInfoComposable$lambda$13.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventInfoComposable$lambda$13, new Function1() { // from class: com.robinhood.shared.security.workflow.InfoComposableKt$InfoComposable$$inlined$consumeIfType$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25691invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25691invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            Navigator.DefaultImpls.handleDeepLink$default(navigator, fragmentActivity, Uri.parse(((InfoEvent.Deeplink) eventInfoComposable$lambda$13.getData()).getDeeplink()), null, null, false, null, 60, null);
                            fragmentActivity.finish();
                        }
                    });
                }
                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier3, 0.0f, 1, null), false, ComposableLambda3.rememberComposableLambda(601706427, true, new C397514(duxo, current, userInteractionEventDescriptor, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(2002605160, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.security.workflow.InfoComposableKt.InfoComposable.5
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                        invoke(boxScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i5) {
                        Modifier.Companion companion;
                        InfoDuxo infoDuxo;
                        InfoDuxo.Companion companion2;
                        Modifier.Companion companion3;
                        InfoDuxo infoDuxo2;
                        InfoDuxo.Companion companion4;
                        Modifier.Companion companion5;
                        InfoDuxo infoDuxo3;
                        InfoDuxo.Companion companion6;
                        Modifier.Companion companion7;
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i5 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2002605160, i5, -1, "com.robinhood.shared.security.workflow.InfoComposable.<anonymous> (InfoComposable.kt:90)");
                        }
                        Modifier.Companion companion8 = Modifier.INSTANCE;
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion8, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                        InfoDuxo infoDuxo4 = duxo;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                        ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion9.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion9.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion9.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion9.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion9.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        InfoDuxo.Companion companion10 = InfoDuxo.INSTANCE;
                        String headerTitle = ((InfoFragmentKey) companion10.getArgs((HasSavedState) infoDuxo4)).getWorkflowScreen().getHeaderTitle();
                        composer2.startReplaceGroup(425032420);
                        if (headerTitle == null) {
                            companion = companion8;
                            companion2 = companion10;
                            infoDuxo = infoDuxo4;
                        } else {
                            composer2.startReplaceGroup(425034447);
                            Modifier modifierM5146paddingqDBjuR0$default = infoDuxo4.getToolbarVisible() ? companion8 : androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(WindowInsetsPadding_androidKt.statusBarsPadding(companion8), 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                            composer2.endReplaceGroup();
                            Modifier modifier4 = modifierM5146paddingqDBjuR0$default;
                            companion = companion8;
                            infoDuxo = infoDuxo4;
                            companion2 = companion10;
                            BentoText2.m20747BentoText38GnDrw(headerTitle, modifier4, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getDisplayCapsuleLarge(), composer2, 0, 0, 8124);
                        }
                        composer2.endReplaceGroup();
                        InfoDuxo infoDuxo5 = infoDuxo;
                        InfoDuxo.Companion companion11 = companion2;
                        String headerBody = ((InfoFragmentKey) companion11.getArgs((HasSavedState) infoDuxo5)).getWorkflowScreen().getHeaderBody();
                        composer2.startReplaceGroup(425051954);
                        if (headerBody == null) {
                            infoDuxo2 = infoDuxo5;
                            companion4 = companion11;
                            companion3 = companion;
                        } else {
                            Modifier.Companion companion12 = companion;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion12, 0.0f, 1, null);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            companion3 = companion12;
                            infoDuxo2 = infoDuxo5;
                            companion4 = companion11;
                            BentoText2.m20747BentoText38GnDrw(headerBody, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer2, i6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getTextM(), composer2, 0, 0, 8124);
                        }
                        composer2.endReplaceGroup();
                        Spacer2.Spacer(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), composer2, 0);
                        InfoDuxo infoDuxo6 = infoDuxo2;
                        InfoDuxo.Companion companion13 = companion4;
                        InfoComposable.Splash(((InfoFragmentKey) companion13.getArgs((HasSavedState) infoDuxo6)).getWorkflowScreen().getImage(), null, composer2, 0, 2);
                        String title = ((InfoFragmentKey) companion13.getArgs((HasSavedState) infoDuxo6)).getWorkflowScreen().getTitle();
                        composer2.startReplaceGroup(425069273);
                        if (title == null) {
                            infoDuxo3 = infoDuxo6;
                            companion6 = companion13;
                            companion5 = companion3;
                        } else {
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            companion5 = companion3;
                            infoDuxo3 = infoDuxo6;
                            companion6 = companion13;
                            BentoText2.m20747BentoText38GnDrw(title, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme2.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i7).getDisplayCapsuleMedium(), composer2, 0, 0, 8124);
                        }
                        composer2.endReplaceGroup();
                        String body = ((InfoFragmentKey) companion6.getArgs((HasSavedState) infoDuxo3)).getWorkflowScreen().getBody();
                        composer2.startReplaceGroup(425081330);
                        if (body == null) {
                            companion7 = companion5;
                        } else {
                            Modifier.Companion companion14 = companion5;
                            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion14, 0.0f, 1, null);
                            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            companion7 = companion14;
                            BentoText2.m20747BentoText38GnDrw(body, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, 0.0f, bentoTheme3.getSpacing(composer2, i8).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer2, i8).getTextM(), composer2, 0, 0, 8124);
                        }
                        composer2.endReplaceGroup();
                        Spacer2.Spacer(Column5.weight$default(column6, companion7, 1.0f, false, 2, null), composer2, 0);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.security.workflow.InfoComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InfoComposable.InfoComposable$lambda$5(duxo, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Object objConsume2 = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
            Intrinsics.checkNotNull(objConsume2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            fragmentActivity = (FragmentActivity) objConsume2;
            navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final Flow eventFlow2 = duxo.getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state2 = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.security.workflow.InfoComposableKt$InfoComposable$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.security.workflow.InfoComposableKt$InfoComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.shared.security.workflow.InfoComposableKt$InfoComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "InfoComposable.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.shared.security.workflow.InfoComposableKt$InfoComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                            if ((event != null ? event.getData() : null) instanceof InfoEvent) {
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
            Event<InfoEvent> value2 = eventFlow2.getValue();
            event = value2;
            if (!((event == null ? event.getData() : null) instanceof InfoEvent)) {
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endReplaceGroup();
            eventInfoComposable$lambda$1 = InfoComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
            if (eventInfoComposable$lambda$1 != null) {
                eventConsumerInvoke3.consume(eventInfoComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.security.workflow.InfoComposableKt$InfoComposable$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m25689invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m25689invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        NavigationActivityResultContract3.finishWithResult$default(fragmentActivity, UiWorkflowStatus.DENIED, 0, 2, null);
                    }
                });
            }
            eventInfoComposable$lambda$12 = InfoComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
            if (eventInfoComposable$lambda$12 != null) {
                eventConsumerInvoke2.consume(eventInfoComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.security.workflow.InfoComposableKt$InfoComposable$$inlined$consumeIfType$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m25690invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m25690invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        WorkflowErrorResponses.handleWorkflowError$default(fragmentActivity, ((InfoEvent.Error) eventInfoComposable$lambda$12.getData()).getThrowable(), 0, 2, null);
                    }
                });
            }
            eventInfoComposable$lambda$13 = InfoComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
            if (eventInfoComposable$lambda$13 != null) {
                eventConsumerInvoke.consume(eventInfoComposable$lambda$13, new Function1() { // from class: com.robinhood.shared.security.workflow.InfoComposableKt$InfoComposable$$inlined$consumeIfType$3
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m25691invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m25691invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        Navigator.DefaultImpls.handleDeepLink$default(navigator, fragmentActivity, Uri.parse(((InfoEvent.Deeplink) eventInfoComposable$lambda$13.getData()).getDeeplink()), null, null, false, null, 60, null);
                        fragmentActivity.finish();
                    }
                });
            }
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier3, 0.0f, 1, null), false, ComposableLambda3.rememberComposableLambda(601706427, true, new C397514(duxo, current2, userInteractionEventDescriptor2, snapshotState4CollectAsStateWithLifecycle3), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(2002605160, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.security.workflow.InfoComposableKt.InfoComposable.5
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i5) {
                    Modifier.Companion companion;
                    InfoDuxo infoDuxo;
                    InfoDuxo.Companion companion2;
                    Modifier.Companion companion3;
                    InfoDuxo infoDuxo2;
                    InfoDuxo.Companion companion4;
                    Modifier.Companion companion5;
                    InfoDuxo infoDuxo3;
                    InfoDuxo.Companion companion6;
                    Modifier.Companion companion7;
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2002605160, i5, -1, "com.robinhood.shared.security.workflow.InfoComposable.<anonymous> (InfoComposable.kt:90)");
                    }
                    Modifier.Companion companion8 = Modifier.INSTANCE;
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(companion8, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
                    InfoDuxo infoDuxo4 = duxo;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(center, centerHorizontally, composer2, 54);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion9.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion9.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion9.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion9.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion9.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    InfoDuxo.Companion companion10 = InfoDuxo.INSTANCE;
                    String headerTitle = ((InfoFragmentKey) companion10.getArgs((HasSavedState) infoDuxo4)).getWorkflowScreen().getHeaderTitle();
                    composer2.startReplaceGroup(425032420);
                    if (headerTitle == null) {
                        companion = companion8;
                        companion2 = companion10;
                        infoDuxo = infoDuxo4;
                    } else {
                        composer2.startReplaceGroup(425034447);
                        Modifier modifierM5146paddingqDBjuR0$default = infoDuxo4.getToolbarVisible() ? companion8 : androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(WindowInsetsPadding_androidKt.statusBarsPadding(companion8), 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        composer2.endReplaceGroup();
                        Modifier modifier4 = modifierM5146paddingqDBjuR0$default;
                        companion = companion8;
                        infoDuxo = infoDuxo4;
                        companion2 = companion10;
                        BentoText2.m20747BentoText38GnDrw(headerTitle, modifier4, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getDisplayCapsuleLarge(), composer2, 0, 0, 8124);
                    }
                    composer2.endReplaceGroup();
                    InfoDuxo infoDuxo5 = infoDuxo;
                    InfoDuxo.Companion companion11 = companion2;
                    String headerBody = ((InfoFragmentKey) companion11.getArgs((HasSavedState) infoDuxo5)).getWorkflowScreen().getHeaderBody();
                    composer2.startReplaceGroup(425051954);
                    if (headerBody == null) {
                        infoDuxo2 = infoDuxo5;
                        companion4 = companion11;
                        companion3 = companion;
                    } else {
                        Modifier.Companion companion12 = companion;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion12, 0.0f, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        companion3 = companion12;
                        infoDuxo2 = infoDuxo5;
                        companion4 = companion11;
                        BentoText2.m20747BentoText38GnDrw(headerBody, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer2, i6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getTextM(), composer2, 0, 0, 8124);
                    }
                    composer2.endReplaceGroup();
                    Spacer2.Spacer(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), composer2, 0);
                    InfoDuxo infoDuxo6 = infoDuxo2;
                    InfoDuxo.Companion companion13 = companion4;
                    InfoComposable.Splash(((InfoFragmentKey) companion13.getArgs((HasSavedState) infoDuxo6)).getWorkflowScreen().getImage(), null, composer2, 0, 2);
                    String title = ((InfoFragmentKey) companion13.getArgs((HasSavedState) infoDuxo6)).getWorkflowScreen().getTitle();
                    composer2.startReplaceGroup(425069273);
                    if (title == null) {
                        infoDuxo3 = infoDuxo6;
                        companion6 = companion13;
                        companion5 = companion3;
                    } else {
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        companion5 = companion3;
                        infoDuxo3 = infoDuxo6;
                        companion6 = companion13;
                        BentoText2.m20747BentoText38GnDrw(title, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme2.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i7).getDisplayCapsuleMedium(), composer2, 0, 0, 8124);
                    }
                    composer2.endReplaceGroup();
                    String body = ((InfoFragmentKey) companion6.getArgs((HasSavedState) infoDuxo3)).getWorkflowScreen().getBody();
                    composer2.startReplaceGroup(425081330);
                    if (body == null) {
                        companion7 = companion5;
                    } else {
                        Modifier.Companion companion14 = companion5;
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion14, 0.0f, 1, null);
                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        companion7 = companion14;
                        BentoText2.m20747BentoText38GnDrw(body, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, 0.0f, bentoTheme3.getSpacing(composer2, i8).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer2, i8).getTextM(), composer2, 0, 0, 8124);
                    }
                    composer2.endReplaceGroup();
                    Spacer2.Spacer(Column5.weight$default(column6, companion7, 1.0f, false, 2, null), composer2, 0);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 2);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InfoViewState InfoComposable$lambda$0(SnapshotState4<InfoViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<InfoEvent> InfoComposable$lambda$1(SnapshotState4<Event<InfoEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final LottieComposition Splash$lambda$6(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    private static final LottieComposition Splash$lambda$7(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    /* compiled from: InfoComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.security.workflow.InfoComposableKt$InfoComposable$4 */
    static final class C397514 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
        final /* synthetic */ InfoDuxo $duxo;
        final /* synthetic */ UserInteractionEventDescriptor $eventDescriptor;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ SnapshotState4<InfoViewState> $viewState$delegate;

        C397514(InfoDuxo infoDuxo, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, SnapshotState4<InfoViewState> snapshotState4) {
            this.$duxo = infoDuxo;
            this.$eventLogger = eventLogger;
            this.$eventDescriptor = userInteractionEventDescriptor;
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
                ComposerKt.traceEventStart(601706427, i, -1, "com.robinhood.shared.security.workflow.InfoComposable.<anonymous> (InfoComposable.kt:145)");
            }
            InfoDuxo.Companion companion = InfoDuxo.INSTANCE;
            if (((InfoFragmentKey) companion.getArgs((HasSavedState) this.$duxo)).getWorkflowScreen().getPrimaryCtaText() != null || ((InfoFragmentKey) companion.getArgs((HasSavedState) this.$duxo)).getWorkflowScreen().getSecondaryCtaText() != null) {
                String primaryCtaText = ((InfoFragmentKey) companion.getArgs((HasSavedState) this.$duxo)).getWorkflowScreen().getPrimaryCtaText();
                boolean zIsLoading = InfoComposable.InfoComposable$lambda$0(this.$viewState$delegate).isLoading();
                String secondaryCtaText = ((InfoFragmentKey) companion.getArgs((HasSavedState) this.$duxo)).getWorkflowScreen().getSecondaryCtaText();
                boolean zIsLoading2 = InfoComposable.InfoComposable$lambda$0(this.$viewState$delegate).isLoading();
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$duxo);
                final EventLogger eventLogger = this.$eventLogger;
                final UserInteractionEventDescriptor userInteractionEventDescriptor = this.$eventDescriptor;
                final InfoDuxo infoDuxo = this.$duxo;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.security.workflow.InfoComposableKt$InfoComposable$4$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InfoComposable.C397514.invoke$lambda$1$lambda$0(eventLogger, userInteractionEventDescriptor, infoDuxo);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance2 = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$eventDescriptor) | composer.changedInstance(this.$duxo);
                final EventLogger eventLogger2 = this.$eventLogger;
                final UserInteractionEventDescriptor userInteractionEventDescriptor2 = this.$eventDescriptor;
                final InfoDuxo infoDuxo2 = this.$duxo;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.security.workflow.InfoComposableKt$InfoComposable$4$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InfoComposable.C397514.invoke$lambda$3$lambda$2(eventLogger2, userInteractionEventDescriptor2, infoDuxo2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function0, primaryCtaText, zIsLoading, null, false, (Function0) objRememberedValue2, secondaryCtaText, zIsLoading2, null, false, composer, 0, 0, 50751);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, InfoDuxo infoDuxo) {
            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.PRIMARY_CTA, null, null, null, 59, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
            infoDuxo.onPrimaryCtaClicked();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, InfoDuxo infoDuxo) {
            EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.SECONDARY_CTA, null, null, null, 59, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
            infoDuxo.onSecondaryCtaClicked();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Splash(final InfoScreen.Image image, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Modifier modifier3;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-288417725);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(image == null ? -1 : image.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-288417725, i3, -1, "com.robinhood.shared.security.workflow.Splash (InfoComposable.kt:177)");
                }
                i4 = image != null ? -1 : WhenMappings.$EnumSwitchMapping$0[image.ordinal()];
                if (i4 != -1) {
                    modifier3 = modifier5;
                    composerStartRestartGroup.startReplaceGroup(1979742096);
                    composerStartRestartGroup.endReplaceGroup();
                } else if (i4 != 1) {
                    if (i4 == 2) {
                        modifier4 = modifier5;
                        composerStartRestartGroup.startReplaceGroup(1978094477);
                        ImageKt.Image(PainterResources_androidKt.painterResource(C11048R.drawable.svg_caution_tube_white_with_shadow, composerStartRestartGroup, 0), (String) null, TestTag3.testTag(modifier4, InfoComposable2.ALERT), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (i4 == 3) {
                        modifier4 = modifier5;
                        composerStartRestartGroup.startReplaceGroup(1978419977);
                        ImageKt.Image(PainterResources_androidKt.painterResource(C20366R.drawable.svg_pending_application, composerStartRestartGroup, 0), (String) null, TestTag3.testTag(SizeKt.m5156height3ABfNKs(modifier4, C2002Dp.m7995constructorimpl(255)), InfoComposable2.SECURITY_AND_PRIVACY), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                        composerStartRestartGroup.endReplaceGroup();
                    } else if (i4 == 4) {
                        composerStartRestartGroup.startReplaceGroup(1978840089);
                        modifier3 = modifier5;
                        LottieAnimation2.LottieAnimation(Splash$lambda$7(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(C39672R.raw.lottie_prompts_attempt)), null, null, null, null, null, composerStartRestartGroup, 0, 62)), TestTag3.testTag(AspectRatio3.aspectRatio$default(modifier5, 1.0f, false, 2, null), InfoComposable2.PROMPT_ATTEMPT), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composerStartRestartGroup, 1572864, 0, 0, 2097084);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (i4 != 5) {
                            composerStartRestartGroup.startReplaceGroup(2003446440);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(1979390308);
                        ImageKt.Image(PainterResources_androidKt.painterResource(C39756R.drawable.svg_secure_lock, composerStartRestartGroup, 0), (String) null, TestTag3.testTag(SizeKt.m5156height3ABfNKs(modifier5, C2002Dp.m7995constructorimpl(255)), InfoComposable2.SECURE_LOCK), (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composerStartRestartGroup, 24624, 104);
                        composerStartRestartGroup.endReplaceGroup();
                        modifier3 = modifier5;
                    }
                    modifier3 = modifier4;
                } else {
                    composerStartRestartGroup.startReplaceGroup(1977302613);
                    modifier3 = modifier5;
                    LottieAnimation2.LottieAnimation(Splash$lambda$6(rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay() ? C40042R.raw.lottie_chat_hourglass_day : C40042R.raw.lottie_chat_hourglass_night)), null, null, null, null, null, composerStartRestartGroup, 0, 62)), TestTag3.testTag(AspectRatio3.aspectRatio$default(SizeKt.m5156height3ABfNKs(modifier5, C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE)), 1.0f, false, 2, null), InfoComposable2.HOURGLASS_LOADING), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composerStartRestartGroup, 1572864, 0, 0, 2097084);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.security.workflow.InfoComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InfoComposable.Splash$lambda$8(image, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (image != null) {
            }
            if (i4 != -1) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
