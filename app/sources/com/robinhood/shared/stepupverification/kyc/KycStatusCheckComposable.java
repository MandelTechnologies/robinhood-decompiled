package com.robinhood.shared.stepupverification.kyc;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.common.ShimmerLoaderType;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.security.lib.workflow.WorkflowErrorResponses;
import com.robinhood.shared.stepupverification.C39791R;
import com.robinhood.shared.stepupverification.kyc.KycStatusCheckEvent;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: KycStatusCheckComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\b\"\u0016\u0010\t\u001a\u00020\n8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\f\"\u0016\u0010\r\u001a\u00020\n8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\f¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\u0012\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u008e\u0002²\u0006\f\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u008a\u0084\u0002"}, m3636d2 = {"KycStatusCheckComposable", "", "duxo", "Lcom/robinhood/shared/stepupverification/kyc/KycStatusCheckDuxo;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/stepupverification/kyc/KycStatusCheckDuxo;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "WaitingComposable", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", KycStatusCheckComposable.KycStatusCheckLoadingTestTag, "", "getKycStatusCheckLoadingTestTag$annotations", "()V", KycStatusCheckComposable.KycStatusCheckLottieTestTag, "getKycStatusCheckLottieTestTag$annotations", "feature-step-up-verification_externalDebug", "viewState", "Lcom/robinhood/shared/stepupverification/kyc/KycStatusCheckViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/stepupverification/kyc/KycStatusCheckEvent;", "showTimedOutDialog", "", "composition", "Lcom/airbnb/lottie/LottieComposition;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.stepupverification.kyc.KycStatusCheckComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class KycStatusCheckComposable {
    public static final String KycStatusCheckLoadingTestTag = "KycStatusCheckLoadingTestTag";
    public static final String KycStatusCheckLottieTestTag = "KycStatusCheckLottieTestTag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KycStatusCheckComposable$lambda$9(KycStatusCheckDuxo kycStatusCheckDuxo, Modifier modifier, int i, int i2, Composer composer, int i3) {
        KycStatusCheckComposable(kycStatusCheckDuxo, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WaitingComposable$lambda$12(Modifier modifier, int i, int i2, Composer composer, int i3) {
        WaitingComposable(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getKycStatusCheckLoadingTestTag$annotations() {
    }

    public static /* synthetic */ void getKycStatusCheckLottieTestTag$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KycStatusCheckComposable(final KycStatusCheckDuxo duxo, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final FragmentActivity fragmentActivity;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        Event<KycStatusCheckEvent> event;
        Composer composer2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        final Event<KycStatusCheckEvent> eventKycStatusCheckComposable$lambda$1;
        final Event<KycStatusCheckEvent> eventKycStatusCheckComposable$lambda$12;
        final Modifier modifier3;
        EventConsumer<KycStatusCheckEvent> eventConsumerInvoke;
        EventConsumer<KycStatusCheckEvent> eventConsumerInvoke2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1145905861);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
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
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1145905861, i4, -1, "com.robinhood.shared.stepupverification.kyc.KycStatusCheckComposable (KycStatusCheckComposable.kt:48)");
                }
                Object objConsume = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                fragmentActivity = (FragmentActivity) objConsume;
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final StateFlow<Event<KycStatusCheckEvent>> eventFlow = duxo.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.stepupverification.kyc.KycStatusCheckComposableKt$KycStatusCheckComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.stepupverification.kyc.KycStatusCheckComposableKt$KycStatusCheckComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.kyc.KycStatusCheckComposableKt$KycStatusCheckComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "KycStatusCheckComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.stepupverification.kyc.KycStatusCheckComposableKt$KycStatusCheckComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof KycStatusCheckEvent) {
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
                Event<KycStatusCheckEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof KycStatusCheckEvent)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composer2 = composerStartRestartGroup;
                composer2.endReplaceGroup();
                composer2.startReplaceGroup(1849434622);
                objRememberedValue = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composer2.endReplaceGroup();
                eventKycStatusCheckComposable$lambda$1 = KycStatusCheckComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventKycStatusCheckComposable$lambda$1 != null && (eventKycStatusCheckComposable$lambda$1.getData() instanceof KycStatusCheckEvent.Error) && (eventConsumerInvoke2 = eventKycStatusCheckComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventKycStatusCheckComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.stepupverification.kyc.KycStatusCheckComposableKt$KycStatusCheckComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25725invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25725invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            WorkflowErrorResponses.handleWorkflowError$default(fragmentActivity, ((KycStatusCheckEvent.Error) eventKycStatusCheckComposable$lambda$1.getData()).getThrowable(), 0, 2, null);
                        }
                    });
                }
                eventKycStatusCheckComposable$lambda$12 = KycStatusCheckComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventKycStatusCheckComposable$lambda$12 != null && (eventKycStatusCheckComposable$lambda$12.getData() instanceof KycStatusCheckEvent.TimedOut) && (eventConsumerInvoke = eventKycStatusCheckComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventKycStatusCheckComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.stepupverification.kyc.KycStatusCheckComposableKt$KycStatusCheckComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25726invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25726invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            KycStatusCheckComposable.KycStatusCheckComposable$lambda$4(snapshotState, true);
                        }
                    });
                }
                if (!KycStatusCheckComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getHasUploaded()) {
                    composer2.startReplaceGroup(-1280827663);
                    WaitingComposable(modifier4, composer2, (i4 >> 3) & 14, 0);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-1280763710);
                    LoadingScreenComposablesKt.ShimmerLoadingComposable(new ShimmerLoaderType.Generic(false), TestTag3.testTag(modifier4, KycStatusCheckLoadingTestTag), composer2, ShimmerLoaderType.Generic.$stable, 0);
                    composer2.endReplaceGroup();
                }
                if (KycStatusCheckComposable$lambda$3(snapshotState)) {
                    modifier3 = modifier4;
                } else {
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer2.changedInstance(duxo);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.stepupverification.kyc.KycStatusCheckComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return KycStatusCheckComposable.KycStatusCheckComposable$lambda$8$lambda$7(duxo, snapshotState);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    Function0 function0 = (Function0) objRememberedValue2;
                    composer2.endReplaceGroup();
                    modifier3 = modifier4;
                    BentoAlertDialog.BentoAlertDialog(StringResources_androidKt.stringResource(C39791R.string.kyc_status_check_wait_timeout_dialog_title, composer2, 0), new BentoAlertDialog2.Body.Text(StringResources_androidKt.stringResource(C39791R.string.kyc_status_check_wait_timeout_dialog_body, composer2, 0)), new BentoAlertButton(StringResources_androidKt.stringResource(C39791R.string.kyc_status_check_wait_timeout_dialog_cta_text, composer2, 0), function0), null, null, null, false, null, function0, composer2, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                    composer2 = composer2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.stepupverification.kyc.KycStatusCheckComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return KycStatusCheckComposable.KycStatusCheckComposable$lambda$9(duxo, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Intrinsics.checkNotNull(objConsume2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            fragmentActivity = (FragmentActivity) objConsume2;
            snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final Flow eventFlow2 = duxo.getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state2 = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.stepupverification.kyc.KycStatusCheckComposableKt$KycStatusCheckComposable$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.stepupverification.kyc.KycStatusCheckComposableKt$KycStatusCheckComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.kyc.KycStatusCheckComposableKt$KycStatusCheckComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "KycStatusCheckComposable.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.shared.stepupverification.kyc.KycStatusCheckComposableKt$KycStatusCheckComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                            if ((event != null ? event.getData() : null) instanceof KycStatusCheckEvent) {
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
            Event<KycStatusCheckEvent> value2 = eventFlow2.getValue();
            event = value2;
            if (!((event == null ? event.getData() : null) instanceof KycStatusCheckEvent)) {
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
            composer2 = composerStartRestartGroup;
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1849434622);
            objRememberedValue = composer2.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composer2.endReplaceGroup();
            eventKycStatusCheckComposable$lambda$1 = KycStatusCheckComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
            if (eventKycStatusCheckComposable$lambda$1 != null) {
                eventConsumerInvoke2.consume(eventKycStatusCheckComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.stepupverification.kyc.KycStatusCheckComposableKt$KycStatusCheckComposable$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m25725invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m25725invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        WorkflowErrorResponses.handleWorkflowError$default(fragmentActivity, ((KycStatusCheckEvent.Error) eventKycStatusCheckComposable$lambda$1.getData()).getThrowable(), 0, 2, null);
                    }
                });
            }
            eventKycStatusCheckComposable$lambda$12 = KycStatusCheckComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
            if (eventKycStatusCheckComposable$lambda$12 != null) {
                eventConsumerInvoke.consume(eventKycStatusCheckComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.stepupverification.kyc.KycStatusCheckComposableKt$KycStatusCheckComposable$$inlined$consumeIfType$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m25726invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m25726invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        KycStatusCheckComposable.KycStatusCheckComposable$lambda$4(snapshotState, true);
                    }
                });
            }
            if (!KycStatusCheckComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getHasUploaded()) {
            }
            if (KycStatusCheckComposable$lambda$3(snapshotState)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void KycStatusCheckComposable$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KycStatusCheckComposable$lambda$8$lambda$7(KycStatusCheckDuxo kycStatusCheckDuxo, SnapshotState snapshotState) {
        KycStatusCheckComposable$lambda$4(snapshotState, false);
        kycStatusCheckDuxo.sendProceed(true);
        return Unit.INSTANCE;
    }

    private static final KycStatusCheckViewState KycStatusCheckComposable$lambda$0(SnapshotState4<KycStatusCheckViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<KycStatusCheckEvent> KycStatusCheckComposable$lambda$1(SnapshotState4<Event<KycStatusCheckEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean KycStatusCheckComposable$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final LottieComposition WaitingComposable$lambda$10(LottieCompositionResult lottieCompositionResult) {
        return lottieCompositionResult.getValue();
    }

    private static final void WaitingComposable(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-578280928);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-578280928, i3, -1, "com.robinhood.shared.stepupverification.kyc.WaitingComposable (KycStatusCheckComposable.kt:93)");
            }
            LottieCompositionResult lottieCompositionResultRememberLottieComposition = rememberLottieComposition.rememberLottieComposition(LottieCompositionSpec.RawRes.m9170boximpl(LottieCompositionSpec.RawRes.m9171constructorimpl(C11048R.raw.lottie_hour_glass)), null, null, null, null, null, composerStartRestartGroup, 0, 62);
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(WindowInsetsPadding6.windowInsetsPadding(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), 0.0f, composerStartRestartGroup, 0, 1), WindowInsets_androidKt.getNavigationBars(WindowInsets.INSTANCE, composerStartRestartGroup, 6)), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, new Screen(Screen.Name.WORKFLOW_KYC_WAITING, null, null, null, 14, null), null, null, null, null, 61, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAutoLogEvents$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifier4 = modifier3;
            LottieAnimation2.LottieAnimation(WaitingComposable$lambda$10(lottieCompositionResultRememberLottieComposition), TestTag3.testTag(AspectRatio3.aspectRatio$default(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21596getXxlargeD9Ej5fM(), 0.0f, 2, null), 1.0f, false, 2, null), KycStatusCheckLottieTestTag), false, false, null, 0.0f, Integer.MAX_VALUE, false, false, false, null, false, false, null, null, null, false, false, null, false, null, composerStartRestartGroup, 1572864, 0, 0, 2097084);
            Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
            String strStringResource = StringResources_androidKt.stringResource(C39791R.string.kyc_status_check_wait_title, composerStartRestartGroup, 0);
            TextAlign.Companion companion3 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8124);
            Modifier modifierM5146paddingqDBjuR0$default2 = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null);
            composer2 = composerStartRestartGroup;
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39791R.string.kyc_status_check_wait_subtitle, composerStartRestartGroup, 0), modifierM5146paddingqDBjuR0$default2, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composer2, 0, 0, 8124);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.stepupverification.kyc.KycStatusCheckComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return KycStatusCheckComposable.WaitingComposable$lambda$12(modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
