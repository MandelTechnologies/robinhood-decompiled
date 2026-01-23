package com.robinhood.shared.stepupverification.kba;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.lib.verification.C20682R;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.DateOfBirthVisualTransformation;
import com.robinhood.compose.common.SsnVisualTransformation;
import com.robinhood.models.p355ui.pathfinder.contexts.KbaContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.stepupverification.C39791R;
import com.robinhood.shared.stepupverification.kba.KbaComposable;
import com.robinhood.shared.stepupverification.kba.KbaEvent;
import com.robinhood.utils.compose.LocalActivity3;
import com.robinhood.utils.extensions.Activity;
import java.util.Locale;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: KbaComposable.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001aM\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u000eH\u0003¢\u0006\u0002\u0010\u0010\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u000bH\u0002\u001a\f\u0010\u0013\u001a\u00020\u0012*\u00020\u000bH\u0002\"\u0016\u0010\u0014\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0016\"\u0016\u0010\u0017\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0018\u0010\u0016\"\u0016\u0010\u0019\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u001a\u0010\u0016¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\u0012\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001fX\u008a\u0084\u0002²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010\f\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\u0012X\u008a\u008e\u0002²\u0006\n\u0010\"\u001a\u00020\u0012X\u008a\u008e\u0002"}, m3636d2 = {"KbaComposable", "", "pathfinderContext", "Lcom/robinhood/models/ui/pathfinder/contexts/KbaContext;", "duxo", "Lcom/robinhood/shared/stepupverification/kba/KbaDuxo;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/ui/pathfinder/contexts/KbaContext;Lcom/robinhood/shared/stepupverification/kba/KbaDuxo;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MainContent", "dateOfBirth", "", "ssn", "onDateOfBirthChanged", "Lkotlin/Function1;", "onSsnChanged", "(Lcom/robinhood/models/ui/pathfinder/contexts/KbaContext;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "isValidDate", "", "isValidSsn", KbaComposable.DateOfBirthTestTag, "getDateOfBirthTestTag$annotations", "()V", KbaComposable.SsnTestTag, "getSsnTestTag$annotations", KbaComposable.VerificationSplashTestTag, "getVerificationSplashTestTag$annotations", "feature-step-up-verification_externalDebug", "viewState", "Lcom/robinhood/shared/stepupverification/kba/KbaViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/stepupverification/kba/KbaEvent;", "dateOfBirthFocused", "ssnFocused"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.stepupverification.kba.KbaComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class KbaComposable {
    public static final String DateOfBirthTestTag = "DateOfBirthTestTag";
    public static final String SsnTestTag = "SsnTestTag";
    public static final String VerificationSplashTestTag = "VerificationSplashTestTag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KbaComposable$lambda$9(KbaContext kbaContext, KbaDuxo kbaDuxo, Modifier modifier, int i, int i2, Composer composer, int i3) {
        KbaComposable(kbaContext, kbaDuxo, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$23(KbaContext kbaContext, String str, String str2, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        MainContent(kbaContext, str, str2, function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getDateOfBirthTestTag$annotations() {
    }

    public static /* synthetic */ void getSsnTestTag$annotations() {
    }

    public static /* synthetic */ void getVerificationSplashTestTag$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KbaComposable(final KbaContext pathfinderContext, final KbaDuxo duxo, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final FragmentActivity fragmentActivity;
        Event<KbaEvent> event;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final Event<KbaEvent> eventKbaComposable$lambda$1;
        final Modifier modifier3;
        EventConsumer<KbaEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(pathfinderContext, "pathfinderContext");
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Composer composerStartRestartGroup = composer.startRestartGroup(-808397800);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(pathfinderContext) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(duxo) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-808397800, i3, -1, "com.robinhood.shared.stepupverification.kba.KbaComposable (KbaComposable.kt:54)");
                }
                fragmentActivity = (FragmentActivity) composerStartRestartGroup.consume(LocalActivity3.getLocalActivity());
                EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final StateFlow<Event<KbaEvent>> eventFlow = duxo.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.stepupverification.kba.KbaComposableKt$KbaComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.stepupverification.kba.KbaComposableKt$KbaComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.kba.KbaComposableKt$KbaComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "KbaComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.stepupverification.kba.KbaComposableKt$KbaComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof KbaEvent) {
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
                Event<KbaEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof KbaEvent)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default("", null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default("", null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                eventKbaComposable$lambda$1 = KbaComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventKbaComposable$lambda$1 != null && (eventKbaComposable$lambda$1.getData() instanceof KbaEvent.Error) && (eventConsumerInvoke = eventKbaComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventKbaComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.stepupverification.kba.KbaComposableKt$KbaComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                            m25722invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25722invoke(Object it) throws Throwable {
                            Intrinsics.checkNotNullParameter(it, "it");
                            ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, fragmentActivity, ((KbaEvent.Error) eventKbaComposable$lambda$1.getData()).getThrowable(), true, false, 0, Integer.valueOf(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome), 24, null);
                        }
                    });
                }
                Modifier modifier5 = modifier4;
                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(ModifiersKt.logScreenTransitions(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.KBA_VERIFICATION, null, null, null, 14, null), null, null, null, null, 61, null)), false, ComposableLambda3.rememberComposableLambda(-597575539, true, new C398752(current, fragmentActivity, duxo, pathfinderContext, snapshotState, snapshotState2, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1391031552, true, new C398763(pathfinderContext, snapshotState, snapshotState2), composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.stepupverification.kba.KbaComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return KbaComposable.KbaComposable$lambda$9(pathfinderContext, duxo, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            fragmentActivity = (FragmentActivity) composerStartRestartGroup.consume(LocalActivity3.getLocalActivity());
            EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final Flow eventFlow2 = duxo.getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state2 = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.stepupverification.kba.KbaComposableKt$KbaComposable$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.stepupverification.kba.KbaComposableKt$KbaComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.kba.KbaComposableKt$KbaComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "KbaComposable.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.shared.stepupverification.kba.KbaComposableKt$KbaComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                            if ((event != null ? event.getData() : null) instanceof KbaEvent) {
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
            Event<KbaEvent> value2 = eventFlow2.getValue();
            event = value2;
            if (!((event == null ? event.getData() : null) instanceof KbaEvent)) {
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            SnapshotState snapshotState3 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            SnapshotState snapshotState22 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            eventKbaComposable$lambda$1 = KbaComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
            if (eventKbaComposable$lambda$1 != null) {
                eventConsumerInvoke.consume(eventKbaComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.stepupverification.kba.KbaComposableKt$KbaComposable$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                        m25722invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m25722invoke(Object it) throws Throwable {
                        Intrinsics.checkNotNullParameter(it, "it");
                        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, fragmentActivity, ((KbaEvent.Error) eventKbaComposable$lambda$1.getData()).getThrowable(), true, false, 0, Integer.valueOf(C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome), 24, null);
                    }
                });
            }
            Modifier modifier52 = modifier4;
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(ModifiersKt.logScreenTransitions(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.KBA_VERIFICATION, null, null, null, 14, null), null, null, null, null, 61, null)), false, ComposableLambda3.rememberComposableLambda(-597575539, true, new C398752(current2, fragmentActivity, duxo, pathfinderContext, snapshotState3, snapshotState22, snapshotState4CollectAsStateWithLifecycle3), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1391031552, true, new C398763(pathfinderContext, snapshotState3, snapshotState22), composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 2);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: KbaComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.stepupverification.kba.KbaComposableKt$KbaComposable$2 */
    static final class C398752 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ SnapshotState<String> $dateOfBirth$delegate;
        final /* synthetic */ KbaDuxo $duxo;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ KbaContext $pathfinderContext;
        final /* synthetic */ SnapshotState<String> $ssn$delegate;
        final /* synthetic */ SnapshotState4<KbaViewState> $viewState$delegate;

        C398752(EventLogger eventLogger, FragmentActivity fragmentActivity, KbaDuxo kbaDuxo, KbaContext kbaContext, SnapshotState<String> snapshotState, SnapshotState<String> snapshotState2, SnapshotState4<KbaViewState> snapshotState4) {
            this.$eventLogger = eventLogger;
            this.$activity = fragmentActivity;
            this.$duxo = kbaDuxo;
            this.$pathfinderContext = kbaContext;
            this.$dateOfBirth$delegate = snapshotState;
            this.$ssn$delegate = snapshotState2;
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
                ComposerKt.traceEventStart(-597575539, i, -1, "com.robinhood.shared.stepupverification.kba.KbaComposable.<anonymous> (KbaComposable.kt:82)");
            }
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Modifier.INSTANCE, 0.0f, 1, null);
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$activity) | composer.changedInstance(this.$duxo);
            final EventLogger eventLogger = this.$eventLogger;
            final FragmentActivity fragmentActivity = this.$activity;
            final KbaDuxo kbaDuxo = this.$duxo;
            final SnapshotState<String> snapshotState = this.$dateOfBirth$delegate;
            final SnapshotState<String> snapshotState2 = this.$ssn$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function0 function0 = new Function0() { // from class: com.robinhood.shared.stepupverification.kba.KbaComposableKt$KbaComposable$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return KbaComposable.C398752.invoke$lambda$1$lambda$0(eventLogger, fragmentActivity, kbaDuxo, snapshotState, snapshotState2);
                    }
                };
                composer.updateRememberedValue(function0);
                objRememberedValue = function0;
            }
            Function0 function02 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, false, null, null, function02, this.$pathfinderContext.getPrimaryCta(), KbaComposable.KbaComposable$lambda$0(this.$viewState$delegate).isLoading(), null, KbaComposable.isValidDate(KbaComposable.KbaComposable$lambda$3(this.$dateOfBirth$delegate)) && KbaComposable.isValidSsn(KbaComposable.KbaComposable$lambda$6(this.$ssn$delegate)), null, null, false, null, false, composer, 0, 0, 64062);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, FragmentActivity fragmentActivity, KbaDuxo kbaDuxo, SnapshotState snapshotState, SnapshotState snapshotState2) {
            EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.CONTINUE, new Screen(Screen.Name.KBA_VERIFICATION, null, null, null, 14, null), null, null, null, false, 60, null);
            Activity.hideKeyboard$default(fragmentActivity, false, 1, null);
            kbaDuxo.onContinue(KbaComposable.KbaComposable$lambda$3(snapshotState), KbaComposable.KbaComposable$lambda$6(snapshotState2));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KbaViewState KbaComposable$lambda$0(SnapshotState4<KbaViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<KbaEvent> KbaComposable$lambda$1(SnapshotState4<Event<KbaEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String KbaComposable$lambda$3(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String KbaComposable$lambda$6(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean MainContent$lambda$12(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean MainContent$lambda$16(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* compiled from: KbaComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.stepupverification.kba.KbaComposableKt$KbaComposable$3 */
    static final class C398763 implements Function3<BoxScope, Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<String> $dateOfBirth$delegate;
        final /* synthetic */ KbaContext $pathfinderContext;
        final /* synthetic */ SnapshotState<String> $ssn$delegate;

        C398763(KbaContext kbaContext, SnapshotState<String> snapshotState, SnapshotState<String> snapshotState2) {
            this.$pathfinderContext = kbaContext;
            this.$dateOfBirth$delegate = snapshotState;
            this.$ssn$delegate = snapshotState2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer, Integer num) {
            invoke(boxScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1391031552, i, -1, "com.robinhood.shared.stepupverification.kba.KbaComposable.<anonymous> (KbaComposable.kt:98)");
            }
            KbaContext kbaContext = this.$pathfinderContext;
            String strKbaComposable$lambda$3 = KbaComposable.KbaComposable$lambda$3(this.$dateOfBirth$delegate);
            String strKbaComposable$lambda$6 = KbaComposable.KbaComposable$lambda$6(this.$ssn$delegate);
            composer.startReplaceGroup(5004770);
            final SnapshotState<String> snapshotState = this.$dateOfBirth$delegate;
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.stepupverification.kba.KbaComposableKt$KbaComposable$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return KbaComposable.C398763.invoke$lambda$2$lambda$1(snapshotState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            final SnapshotState<String> snapshotState2 = this.$ssn$delegate;
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.stepupverification.kba.KbaComposableKt$KbaComposable$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return KbaComposable.C398763.invoke$lambda$5$lambda$4(snapshotState2, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            KbaComposable.MainContent(kbaContext, strKbaComposable$lambda$3, strKbaComposable$lambda$6, function1, (Function1) objRememberedValue2, composer, 27648);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(SnapshotState snapshotState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.length() <= 8) {
                int i = 0;
                while (true) {
                    if (i >= it.length()) {
                        KbaComposable.KbaComposable$lambda$4(snapshotState, it);
                        break;
                    }
                    if (!Character.isDigit(it.charAt(i))) {
                        break;
                    }
                    i++;
                }
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(SnapshotState snapshotState, String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.length() <= 9) {
                int i = 0;
                while (true) {
                    if (i >= it.length()) {
                        KbaComposable.KbaComposable$lambda$7(snapshotState, it);
                        break;
                    }
                    if (!Character.isDigit(it.charAt(i))) {
                        break;
                    }
                    i++;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KbaComposable$lambda$4(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KbaComposable$lambda$7(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void MainContent(final KbaContext kbaContext, final String str, final String str2, final Function1<? super String, Unit> function1, final Function1<? super String, Unit> function12, Composer composer, final int i) {
        int i2;
        String str3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-200872900);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(kbaContext) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            str3 = str2;
            i2 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        } else {
            str3 = str2;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
        }
        if ((i2 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-200872900, i2, -1, "com.robinhood.shared.stepupverification.kba.MainContent (KbaComposable.kt:124)");
            }
            Object[] objArr = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.stepupverification.kba.KbaComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return KbaComposable.MainContent$lambda$11$lambda$10();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.stepupverification.kba.KbaComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return KbaComposable.MainContent$lambda$15$lambda$14();
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            final SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            int i4 = i2;
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(C20682R.drawable.svg_ic_success_illustration, composerStartRestartGroup, 0), (String) null, androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(TestTag3.testTag(companion2, VerificationSplashTestTag), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21590getDefaultD9Ej5fM(), 1, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 48, 120);
            String heading = kbaContext.getHeading();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(heading, null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8126);
            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
            BentoText2.m20747BentoText38GnDrw(kbaContext.getSubheading(), modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), composerStartRestartGroup, 0, 0, 8124);
            Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(companion2, DateOfBirthTestTag), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged = composerStartRestartGroup.changed(snapshotState);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.stepupverification.kba.KbaComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return KbaComposable.MainContent$lambda$22$lambda$19$lambda$18(snapshotState, (FocusState) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierOnFocusChanged = FocusChangedModifier2.onFocusChanged(modifierM5146paddingqDBjuR0$default2, (Function1) objRememberedValue3);
            String strStringResource = StringResources_androidKt.stringResource(C39791R.string.kba_date_of_birth_label, composerStartRestartGroup, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C39791R.string.kba_date_of_birth_placeholder, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1405217702);
            BentoTextInput8.Message.Error error = (MainContent$lambda$12(snapshotState) || str.length() <= 0 || isValidDate(str)) ? null : new BentoTextInput8.Message.Error(StringResources_androidKt.stringResource(C39791R.string.kba_date_of_birth_invalid_error, composerStartRestartGroup, 0));
            composerStartRestartGroup.endReplaceGroup();
            KeyboardType.Companion companion5 = KeyboardType.INSTANCE;
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, companion5.m7782getNumberPasswordPjHm6EE(), 0, null, null, null, 123, null);
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            DateOfBirthVisualTransformation dateOfBirthVisualTransformation = new DateOfBirthVisualTransformation(US, null, 2, 0 == true ? 1 : 0);
            int i5 = i4 >> 6;
            int i6 = BentoTextInput8.Message.Error.$stable;
            BentoTextInput4.BentoTextInput(str, function1, modifierOnFocusChanged, strStringResource, strStringResource2, null, error, null, null, null, keyboardOptions, null, dateOfBirthVisualTransformation, false, false, composerStartRestartGroup, ((i4 >> 3) & 14) | (i5 & 112) | (i6 << 18), 6, 27552);
            Modifier modifierM5146paddingqDBjuR0$default3 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(companion2, SsnTestTag), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChanged2 = composerStartRestartGroup.changed(snapshotState2);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.stepupverification.kba.KbaComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return KbaComposable.MainContent$lambda$22$lambda$21$lambda$20(snapshotState2, (FocusState) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierOnFocusChanged2 = FocusChangedModifier2.onFocusChanged(modifierM5146paddingqDBjuR0$default3, (Function1) objRememberedValue4);
            String strStringResource3 = StringResources_androidKt.stringResource(C39791R.string.kba_ssn_label, composerStartRestartGroup, 0);
            String strStringResource4 = StringResources_androidKt.stringResource(C39791R.string.kba_ssn_placeholder, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(1405247875);
            BentoTextInput8.Message.Error error2 = (MainContent$lambda$16(snapshotState2) || str3.length() <= 0 || isValidSsn(str3)) ? null : new BentoTextInput8.Message.Error(StringResources_androidKt.stringResource(C39791R.string.kba_ssn_invalid_error, composerStartRestartGroup, 0));
            composerStartRestartGroup.endReplaceGroup();
            BentoTextInput4.BentoTextInput(str3, function12, modifierOnFocusChanged2, strStringResource3, strStringResource4, null, error2, null, null, null, new KeyboardOptions(0, null, companion5.m7782getNumberPasswordPjHm6EE(), 0, null, null, null, 123, null), null, new SsnVisualTransformation(MainContent$lambda$16(snapshotState2)), false, false, composerStartRestartGroup, (i5 & 14) | ((i4 >> 9) & 112) | (i6 << 18), 6, 27552);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.stepupverification.kba.KbaComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return KbaComposable.MainContent$lambda$23(kbaContext, str, str2, function1, function12, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState MainContent$lambda$11$lambda$10() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private static final void MainContent$lambda$13(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState MainContent$lambda$15$lambda$14() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private static final void MainContent$lambda$17(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$22$lambda$19$lambda$18(SnapshotState snapshotState, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        MainContent$lambda$13(snapshotState, it.isFocused());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$22$lambda$21$lambda$20(SnapshotState snapshotState, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        MainContent$lambda$17(snapshotState, it.isFocused());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isValidDate(String str) {
        if (str.length() == 8) {
            String strSubstring = str.substring(0, 2);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            if (Integer.parseInt(strSubstring) <= 12) {
                String strSubstring2 = str.substring(2, 4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                if (Integer.parseInt(strSubstring2) <= 31) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isValidSsn(String str) {
        return str.length() == 9;
    }
}
