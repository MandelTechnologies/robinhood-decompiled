package com.robinhood.shared.security.verify.credentials;

import android.app.Activity;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsKt;
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
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.view.compose.LocalActivity;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposable3;
import com.robinhood.shared.security.verify.credentials.VerifyCredentialsEvent;
import com.robinhood.shared.security.verify.credentials.VerifyCredentialsViewState;
import com.robinhood.shared.security.verify.credentials.email.CheckYourEmailComposable;
import com.robinhood.shared.security.verify.credentials.email.ReviewEmailComposable;
import com.robinhood.shared.security.verify.credentials.email.UpdateEmailComposable;
import com.robinhood.shared.security.verify.credentials.password.ReviewPasswordComposable3;
import com.robinhood.shared.security.verify.credentials.password.UpdatePasswordComposable;
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
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: VerifyCredentialsComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a=\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\u0014\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\nX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsDuxo;", "duxo", "Landroidx/compose/ui/Modifier;", "modifier", "", "VerifyCredentialsComposable", "(Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsDuxo;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsViewState;", "viewState", "Lkotlin/Function0;", "onBackClicked", "content", "VerifyCredentialsScaffold", "(Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/security/verify/credentials/VerifyCredentialsEvent;", "event", "feature-verify-credentials_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class VerifyCredentialsComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerifyCredentialsComposable$lambda$5(VerifyCredentialsDuxo verifyCredentialsDuxo, Modifier modifier, int i, int i2, Composer composer, int i3) {
        VerifyCredentialsComposable(verifyCredentialsDuxo, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerifyCredentialsScaffold$lambda$6(VerifyCredentialsViewState verifyCredentialsViewState, Function0 function0, Modifier modifier, Function2 function2, int i, int i2, Composer composer, int i3) {
        VerifyCredentialsScaffold(verifyCredentialsViewState, function0, modifier, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VerifyCredentialsComposable(final VerifyCredentialsDuxo duxo, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        final Activity activity;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Event<VerifyCredentialsEvent> event;
        final Event<VerifyCredentialsEvent> eventVerifyCredentialsComposable$lambda$1;
        boolean zChanged;
        Object objRememberedValue;
        EventConsumer<VerifyCredentialsEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Composer composerStartRestartGroup = composer.startRestartGroup(70597067);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(duxo) : composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(70597067, i4, -1, "com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposable (VerifyCredentialsComposable.kt:33)");
                }
                Object objConsume = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type android.app.Activity");
                activity = (Activity) objConsume;
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final StateFlow<Event<VerifyCredentialsEvent>> eventFlow = duxo.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt$VerifyCredentialsComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt$VerifyCredentialsComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt$VerifyCredentialsComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "VerifyCredentialsComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt$VerifyCredentialsComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof VerifyCredentialsEvent) {
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
                Event<VerifyCredentialsEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof VerifyCredentialsEvent)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
                eventVerifyCredentialsComposable$lambda$1 = VerifyCredentialsComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventVerifyCredentialsComposable$lambda$1 != null && (eventVerifyCredentialsComposable$lambda$1.getData() instanceof VerifyCredentialsEvent.Finished) && (eventConsumerInvoke = eventVerifyCredentialsComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventVerifyCredentialsComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt$VerifyCredentialsComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25667invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25667invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            activity.finish();
                        }
                    });
                }
                VerifyCredentialsViewState verifyCredentialsViewStateVerifyCredentialsComposable$lambda$0 = VerifyCredentialsComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = ((i4 & 14) != 4 || ((i4 & 8) != 0 && composerStartRestartGroup.changedInstance(duxo))) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return VerifyCredentialsComposable3.VerifyCredentialsComposable$lambda$4$lambda$3(duxo, snapshotState4CollectAsStateWithLifecycle);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifier2 = modifier3;
                VerifyCredentialsScaffold(verifyCredentialsViewStateVerifyCredentialsComposable$lambda$0, (Function0) objRememberedValue, modifier2, ComposableLambda3.rememberComposableLambda(489896032, true, new C396943(duxo, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 << 3) & 896) | 3072, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return VerifyCredentialsComposable3.VerifyCredentialsComposable$lambda$5(duxo, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Object objConsume2 = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
            Intrinsics.checkNotNull(objConsume2, "null cannot be cast to non-null type android.app.Activity");
            activity = (Activity) objConsume2;
            snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final Flow eventFlow2 = duxo.getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state2 = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt$VerifyCredentialsComposable$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt$VerifyCredentialsComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt$VerifyCredentialsComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "VerifyCredentialsComposable.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt$VerifyCredentialsComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                            if ((event != null ? event.getData() : null) instanceof VerifyCredentialsEvent) {
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
            Event<VerifyCredentialsEvent> value2 = eventFlow2.getValue();
            event = value2;
            if (!((event == null ? event.getData() : null) instanceof VerifyCredentialsEvent)) {
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.endReplaceGroup();
            eventVerifyCredentialsComposable$lambda$1 = VerifyCredentialsComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
            if (eventVerifyCredentialsComposable$lambda$1 != null) {
                eventConsumerInvoke.consume(eventVerifyCredentialsComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt$VerifyCredentialsComposable$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m25667invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m25667invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        activity.finish();
                    }
                });
            }
            VerifyCredentialsViewState verifyCredentialsViewStateVerifyCredentialsComposable$lambda$02 = VerifyCredentialsComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            if ((i4 & 14) != 4) {
                zChanged = ((i4 & 14) != 4 || ((i4 & 8) != 0 && composerStartRestartGroup.changedInstance(duxo))) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return VerifyCredentialsComposable3.VerifyCredentialsComposable$lambda$4$lambda$3(duxo, snapshotState4CollectAsStateWithLifecycle);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    modifier2 = modifier3;
                    VerifyCredentialsScaffold(verifyCredentialsViewStateVerifyCredentialsComposable$lambda$02, (Function0) objRememberedValue, modifier2, ComposableLambda3.rememberComposableLambda(489896032, true, new C396943(duxo, snapshotState4CollectAsStateWithLifecycle), composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 << 3) & 896) | 3072, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: VerifyCredentialsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt$VerifyCredentialsComposable$3 */
    static final class C396943 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ VerifyCredentialsDuxo $duxo;
        final /* synthetic */ SnapshotState4<VerifyCredentialsViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C396943(VerifyCredentialsDuxo verifyCredentialsDuxo, SnapshotState4<? extends VerifyCredentialsViewState> snapshotState4) {
            this.$duxo = verifyCredentialsDuxo;
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
                ComposerKt.traceEventStart(489896032, i, -1, "com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposable.<anonymous> (VerifyCredentialsComposable.kt:48)");
            }
            final VerifyCredentialsViewState verifyCredentialsViewStateVerifyCredentialsComposable$lambda$0 = VerifyCredentialsComposable3.VerifyCredentialsComposable$lambda$0(this.$viewState$delegate);
            if (verifyCredentialsViewStateVerifyCredentialsComposable$lambda$0 instanceof VerifyCredentialsViewState.ReviewEmail) {
                composer.startReplaceGroup(-1656312482);
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(this.$duxo) | composer.changed(verifyCredentialsViewStateVerifyCredentialsComposable$lambda$0);
                final VerifyCredentialsDuxo verifyCredentialsDuxo = this.$duxo;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt$VerifyCredentialsComposable$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return VerifyCredentialsComposable3.C396943.invoke$lambda$1$lambda$0(verifyCredentialsDuxo, verifyCredentialsViewStateVerifyCredentialsComposable$lambda$0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = composer.changedInstance(this.$duxo) | composer.changed(verifyCredentialsViewStateVerifyCredentialsComposable$lambda$0);
                final VerifyCredentialsDuxo verifyCredentialsDuxo2 = this.$duxo;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt$VerifyCredentialsComposable$3$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return VerifyCredentialsComposable3.C396943.invoke$lambda$3$lambda$2(verifyCredentialsDuxo2, verifyCredentialsViewStateVerifyCredentialsComposable$lambda$0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                ReviewEmailComposable.ReviewEmailComposable(function0, (Function0) objRememberedValue2, null, null, composer, 0, 12);
                composer.endReplaceGroup();
            } else if (verifyCredentialsViewStateVerifyCredentialsComposable$lambda$0 instanceof VerifyCredentialsViewState.UpdateEmail) {
                composer.startReplaceGroup(-1656304601);
                Object obj = this.$duxo;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance3 = composer.changedInstance(obj);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new VerifyCredentialsComposable4(obj);
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                UpdateEmailComposable.UpdateEmailComposable((Function1) ((KFunction) objRememberedValue3), null, null, composer, 0, 6);
                composer.endReplaceGroup();
            } else if (verifyCredentialsViewStateVerifyCredentialsComposable$lambda$0 instanceof VerifyCredentialsViewState.CheckYourEmail) {
                composer.startReplaceGroup(-1656299273);
                String email = ((VerifyCredentialsViewState.CheckYourEmail) verifyCredentialsViewStateVerifyCredentialsComposable$lambda$0).getEmail();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance4 = composer.changedInstance(this.$duxo) | composer.changed(verifyCredentialsViewStateVerifyCredentialsComposable$lambda$0);
                final VerifyCredentialsDuxo verifyCredentialsDuxo3 = this.$duxo;
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt$VerifyCredentialsComposable$3$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return VerifyCredentialsComposable3.C396943.invoke$lambda$6$lambda$5(verifyCredentialsDuxo3, verifyCredentialsViewStateVerifyCredentialsComposable$lambda$0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                CheckYourEmailComposable.CheckYourEmailComposable(email, (Function0) objRememberedValue4, null, null, composer, 0, 12);
                composer.endReplaceGroup();
            } else if (verifyCredentialsViewStateVerifyCredentialsComposable$lambda$0 instanceof VerifyCredentialsViewState.ReviewPassword) {
                composer.startReplaceGroup(-1656292415);
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance5 = composer.changedInstance(this.$duxo) | composer.changed(verifyCredentialsViewStateVerifyCredentialsComposable$lambda$0);
                final VerifyCredentialsDuxo verifyCredentialsDuxo4 = this.$duxo;
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt$VerifyCredentialsComposable$3$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return VerifyCredentialsComposable3.C396943.invoke$lambda$8$lambda$7(verifyCredentialsDuxo4, verifyCredentialsViewStateVerifyCredentialsComposable$lambda$0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                Function0 function02 = (Function0) objRememberedValue5;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance6 = composer.changedInstance(this.$duxo) | composer.changed(verifyCredentialsViewStateVerifyCredentialsComposable$lambda$0);
                final VerifyCredentialsDuxo verifyCredentialsDuxo5 = this.$duxo;
                Object objRememberedValue6 = composer.rememberedValue();
                if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt$VerifyCredentialsComposable$3$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return VerifyCredentialsComposable3.C396943.invoke$lambda$10$lambda$9(verifyCredentialsDuxo5, verifyCredentialsViewStateVerifyCredentialsComposable$lambda$0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue6);
                }
                composer.endReplaceGroup();
                ReviewPasswordComposable3.ReviewPasswordComposable(function02, (Function0) objRememberedValue6, null, composer, 0, 4);
                composer.endReplaceGroup();
            } else {
                if (!(verifyCredentialsViewStateVerifyCredentialsComposable$lambda$0 instanceof VerifyCredentialsViewState.UpdatePassword)) {
                    composer.startReplaceGroup(-1656314394);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1656284334);
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance7 = composer.changedInstance(this.$duxo) | composer.changed(verifyCredentialsViewStateVerifyCredentialsComposable$lambda$0);
                final VerifyCredentialsDuxo verifyCredentialsDuxo6 = this.$duxo;
                Object objRememberedValue7 = composer.rememberedValue();
                if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue7 = new Function0() { // from class: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt$VerifyCredentialsComposable$3$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return VerifyCredentialsComposable3.C396943.invoke$lambda$12$lambda$11(verifyCredentialsDuxo6, verifyCredentialsViewStateVerifyCredentialsComposable$lambda$0);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue7);
                }
                composer.endReplaceGroup();
                UpdatePasswordComposable.UpdatePasswordComposable((Function0) objRememberedValue7, null, null, composer, 0, 6);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(VerifyCredentialsDuxo verifyCredentialsDuxo, VerifyCredentialsViewState verifyCredentialsViewState) {
            verifyCredentialsDuxo.onPrimaryCtaClicked(verifyCredentialsViewState);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(VerifyCredentialsDuxo verifyCredentialsDuxo, VerifyCredentialsViewState verifyCredentialsViewState) {
            verifyCredentialsDuxo.onSecondaryCtaClicked(verifyCredentialsViewState);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5(VerifyCredentialsDuxo verifyCredentialsDuxo, VerifyCredentialsViewState verifyCredentialsViewState) {
            verifyCredentialsDuxo.onPrimaryCtaClicked(verifyCredentialsViewState);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7(VerifyCredentialsDuxo verifyCredentialsDuxo, VerifyCredentialsViewState verifyCredentialsViewState) {
            verifyCredentialsDuxo.onPrimaryCtaClicked(verifyCredentialsViewState);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$10$lambda$9(VerifyCredentialsDuxo verifyCredentialsDuxo, VerifyCredentialsViewState verifyCredentialsViewState) {
            verifyCredentialsDuxo.onSecondaryCtaClicked(verifyCredentialsViewState);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$12$lambda$11(VerifyCredentialsDuxo verifyCredentialsDuxo, VerifyCredentialsViewState verifyCredentialsViewState) {
            verifyCredentialsDuxo.onPrimaryCtaClicked(verifyCredentialsViewState);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit VerifyCredentialsComposable$lambda$4$lambda$3(VerifyCredentialsDuxo verifyCredentialsDuxo, SnapshotState4 snapshotState4) {
        verifyCredentialsDuxo.onBackPressed(VerifyCredentialsComposable$lambda$0(snapshotState4));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VerifyCredentialsScaffold(final VerifyCredentialsViewState viewState, final Function0<Unit> onBackClicked, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1725390051);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClicked) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1725390051, i3, -1, "com.robinhood.shared.security.verify.credentials.VerifyCredentialsScaffold (VerifyCredentialsComposable.kt:82)");
                }
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default, ComposableLambda3.rememberComposableLambda(-938747423, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt.VerifyCredentialsScaffold.1
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
                            ComposerKt.traceEventStart(-938747423, i6, -1, "com.robinhood.shared.security.verify.credentials.VerifyCredentialsScaffold.<anonymous> (VerifyCredentialsComposable.kt:89)");
                        }
                        AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                        Function2<Composer, Integer, Unit> function2M25665getLambda$355714610$feature_verify_credentials_externalDebug = VerifyCredentialsComposable.INSTANCE.m25665getLambda$355714610$feature_verify_credentials_externalDebug();
                        final VerifyCredentialsViewState verifyCredentialsViewState = viewState;
                        final Function0<Unit> function0 = onBackClicked;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M25665getLambda$355714610$feature_verify_credentials_externalDebug, null, ComposableLambda3.rememberComposableLambda(-455665374, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt.VerifyCredentialsScaffold.1.1
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
                                    ComposerKt.traceEventStart(-455665374, i7, -1, "com.robinhood.shared.security.verify.credentials.VerifyCredentialsScaffold.<anonymous>.<anonymous> (VerifyCredentialsComposable.kt:91)");
                                }
                                if (verifyCredentialsViewState.getShowBackButton()) {
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, appBarType, null, 0L, null, composer3, 12583302, 0, 1914);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU(), WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null), ComposableLambda3.rememberComposableLambda(772537900, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt.VerifyCredentialsScaffold.2
                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                        int i7;
                        int i8;
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
                            ComposerKt.traceEventStart(772537900, i7, -1, "com.robinhood.shared.security.verify.credentials.VerifyCredentialsScaffold.<anonymous> (VerifyCredentialsComposable.kt:102)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
                        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                        VerifyCredentialsViewState verifyCredentialsViewState = viewState;
                        Function2<Composer, Integer, Unit> function2 = content;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierPadding);
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
                        int i9 = BentoTheme.$stable;
                        Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme2.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                        String strStringResource = StringResources_androidKt.stringResource(verifyCredentialsViewState.getTitleRes(), composer3, 0);
                        TextAlign.Companion companion3 = TextAlign.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i9).getDisplayCapsuleMedium(), composer3, 0, 0, 8124);
                        Integer subtitleRes = verifyCredentialsViewState.getSubtitleRes();
                        composer3.startReplaceGroup(-289873484);
                        if (subtitleRes == null) {
                            i8 = 0;
                        } else {
                            int iIntValue = subtitleRes.intValue();
                            i8 = 0;
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(iIntValue, composer3, 0), com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme2.getSpacing(composer3, i9).m21593getSmallD9Ej5fM(), 0.0f, 2, null), null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i9).getTextM(), composer3, 0, 0, 8124);
                        }
                        composer3.endReplaceGroup();
                        function2.invoke(composer3, Integer.valueOf(i8));
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
                }, composerStartRestartGroup, 54), composer2, 805306416, 60);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return VerifyCredentialsComposable3.VerifyCredentialsScaffold$lambda$6(viewState, onBackClicked, modifier3, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifierFillMaxSize$default2, ComposableLambda3.rememberComposableLambda(-938747423, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt.VerifyCredentialsScaffold.1
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
                        ComposerKt.traceEventStart(-938747423, i6, -1, "com.robinhood.shared.security.verify.credentials.VerifyCredentialsScaffold.<anonymous> (VerifyCredentialsComposable.kt:89)");
                    }
                    AppBarType appBarType = AppBarType.CENTER_ALIGNED;
                    Function2<Composer, Integer, Unit> function2M25665getLambda$355714610$feature_verify_credentials_externalDebug = VerifyCredentialsComposable.INSTANCE.m25665getLambda$355714610$feature_verify_credentials_externalDebug();
                    final VerifyCredentialsViewState verifyCredentialsViewState = viewState;
                    final Function0<Unit> function0 = onBackClicked;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M25665getLambda$355714610$feature_verify_credentials_externalDebug, null, ComposableLambda3.rememberComposableLambda(-455665374, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt.VerifyCredentialsScaffold.1.1
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
                                ComposerKt.traceEventStart(-455665374, i7, -1, "com.robinhood.shared.security.verify.credentials.VerifyCredentialsScaffold.<anonymous>.<anonymous> (VerifyCredentialsComposable.kt:91)");
                            }
                            if (verifyCredentialsViewState.getShowBackButton()) {
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, false, false, appBarType, null, 0L, null, composer3, 12583302, 0, 1914);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU(), WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null), ComposableLambda3.rememberComposableLambda(772537900, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.security.verify.credentials.VerifyCredentialsComposableKt.VerifyCredentialsScaffold.2
                public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                    int i7;
                    int i8;
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
                        ComposerKt.traceEventStart(772537900, i7, -1, "com.robinhood.shared.security.verify.credentials.VerifyCredentialsScaffold.<anonymous> (VerifyCredentialsComposable.kt:102)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    VerifyCredentialsViewState verifyCredentialsViewState = viewState;
                    Function2<Composer, Integer, Unit> function2 = content;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer3, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierPadding);
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
                    int i9 = BentoTheme.$stable;
                    Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme22.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                    String strStringResource = StringResources_androidKt.stringResource(verifyCredentialsViewState.getTitleRes(), composer3, 0);
                    TextAlign.Companion companion3 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer3, i9).getDisplayCapsuleMedium(), composer3, 0, 0, 8124);
                    Integer subtitleRes = verifyCredentialsViewState.getSubtitleRes();
                    composer3.startReplaceGroup(-289873484);
                    if (subtitleRes == null) {
                        i8 = 0;
                    } else {
                        int iIntValue = subtitleRes.intValue();
                        i8 = 0;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(iIntValue, composer3, 0), com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, bentoTheme22.getSpacing(composer3, i9).m21593getSmallD9Ej5fM(), 0.0f, 2, null), null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer3, i9).getTextM(), composer3, 0, 0, 8124);
                    }
                    composer3.endReplaceGroup();
                    function2.invoke(composer3, Integer.valueOf(i8));
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
            }, composerStartRestartGroup, 54), composer2, 805306416, 60);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerifyCredentialsViewState VerifyCredentialsComposable$lambda$0(SnapshotState4<? extends VerifyCredentialsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<VerifyCredentialsEvent> VerifyCredentialsComposable$lambda$1(SnapshotState4<Event<VerifyCredentialsEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
