package com.robinhood.shared.stepupverification.challenge.sms;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.view.compose.LocalActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.lib.challenge.C39076R;
import com.robinhood.shared.stepupverification.C39791R;
import com.robinhood.shared.stepupverification.challenge.ChallengeCodeInputComposable;
import com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeEvent;
import com.robinhood.utils.resource.StringResource;
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
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: SmsChallengeComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002²\u0006\u0012\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u008a\u0084\u0002²\u0006\f\u0010\r\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002"}, m3636d2 = {"SmsChallengeComposable", "", "duxo", "Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeDuxo;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeDuxo;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-step-up-verification_externalDebug", "viewState", "Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeEvent;", "dialogContent", "Lcom/robinhood/shared/stepupverification/challenge/sms/SmsChallengeEvent$ShowDialog;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class SmsChallengeComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SmsChallengeComposable$lambda$13(SmsChallengeDuxo smsChallengeDuxo, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SmsChallengeComposable(smsChallengeDuxo, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SmsChallengeComposable(final SmsChallengeDuxo duxo, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final Activity activity;
        UserInteractionEventDescriptor userInteractionEventDescriptor;
        Event<SmsChallengeEvent> event;
        Object objRememberedValue;
        Composer.Companion companion;
        final Event<SmsChallengeEvent> eventSmsChallengeComposable$lambda$1;
        final Event<SmsChallengeEvent> eventSmsChallengeComposable$lambda$12;
        final UserInteractionEventDescriptor userInteractionEventDescriptor2;
        boolean zChangedInstance;
        int i4;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        boolean zChangedInstance3;
        Object objRememberedValue3;
        final SmsChallengeEvent.ShowDialog showDialogSmsChallengeComposable$lambda$3;
        int i5;
        CharSequence text;
        EventConsumer<SmsChallengeEvent> eventConsumerInvoke;
        EventConsumer<SmsChallengeEvent> eventConsumerInvoke2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Composer composerStartRestartGroup = composer.startRestartGroup(-400344775);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-400344775, i3, -1, "com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeComposable (SmsChallengeComposable.kt:32)");
                }
                Object objConsume = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type android.app.Activity");
                activity = (Activity) objConsume;
                Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final StateFlow<Event<SmsChallengeEvent>> eventFlow = duxo.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeComposableKt$SmsChallengeComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeComposableKt$SmsChallengeComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeComposableKt$SmsChallengeComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "SmsChallengeComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeComposableKt$SmsChallengeComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof SmsChallengeEvent) {
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
                Event<SmsChallengeEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof SmsChallengeEvent)) {
                    value = null;
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(flow, value, lifecycleOwner.getLifecycle(), state, coroutineContextImpl6, composerStartRestartGroup, 0, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                eventSmsChallengeComposable$lambda$1 = SmsChallengeComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventSmsChallengeComposable$lambda$1 != null && (eventSmsChallengeComposable$lambda$1.getData() instanceof SmsChallengeEvent.Error) && (eventConsumerInvoke2 = eventSmsChallengeComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventSmsChallengeComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeComposableKt$SmsChallengeComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                            m25708invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25708invoke(Object it) throws Throwable {
                            Intrinsics.checkNotNullParameter(it, "it");
                            ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, activity, ((SmsChallengeEvent.Error) eventSmsChallengeComposable$lambda$1.getData()).getThrowable(), true, false, 0, null, 56, null);
                        }
                    });
                }
                eventSmsChallengeComposable$lambda$12 = SmsChallengeComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventSmsChallengeComposable$lambda$12 == null && (eventSmsChallengeComposable$lambda$12.getData() instanceof SmsChallengeEvent.ShowDialog) && (eventConsumerInvoke = eventSmsChallengeComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                    userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                    eventConsumerInvoke.consume(eventSmsChallengeComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeComposableKt$SmsChallengeComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25709invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25709invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            SmsChallengeEvent.ShowDialog showDialog = (SmsChallengeEvent.ShowDialog) eventSmsChallengeComposable$lambda$12.getData();
                            EventLogger.DefaultImpls.logUserInteractionEvent$default(current, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, null, new Component(Component.ComponentType.ALERT, null, null, 6, null), null, 47, null), UserInteractionEventData.EventType.APPEAR), false, false, 6, null);
                            snapshotState.setValue(showDialog);
                        }
                    });
                } else {
                    userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                }
                boolean zIsLoading = SmsChallengeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isLoading();
                String strStringResource = StringResources_androidKt.stringResource(C39076R.string.challenge_verification_title_sms, composerStartRestartGroup, 0);
                StringResource subtitle = SmsChallengeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getSubtitle();
                Intrinsics.checkNotNull(resources);
                String string2 = subtitle.getText(resources).toString();
                String inputText = SmsChallengeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getInputText();
                String strStringResource2 = StringResources_androidKt.stringResource(C39076R.string.challenge_verification_help_bottom_sheet_title, composerStartRestartGroup, 0);
                String strStringResource3 = StringResources_androidKt.stringResource(C39076R.string.uar_challenge_verification_help_bottom_sheet_sms_subtitle, composerStartRestartGroup, 0);
                StringResource fallbackText = SmsChallengeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getFallbackText();
                String string3 = (fallbackText != null || (text = fallbackText.getText(resources)) == null) ? null : text.toString();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance) {
                    i4 = i3;
                    if (objRememberedValue4 == companion.getEmpty()) {
                    }
                    KFunction kFunction = (KFunction) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(duxo);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new SmsChallengeComposable3(duxo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    KFunction kFunction2 = (KFunction) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(duxo);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance3 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new SmsChallengeComposable4(duxo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    final UserInteractionEventDescriptor userInteractionEventDescriptor3 = userInteractionEventDescriptor2;
                    ChallengeCodeInputComposable.ChallengeCodeInputComposable(zIsLoading, strStringResource, string2, inputText, strStringResource2, strStringResource3, string3, (Function1) kFunction, (Function0) kFunction2, (Function0) ((KFunction) objRememberedValue3), modifier3, composerStartRestartGroup, 0, (i4 >> 3) & 14, 0);
                    Modifier modifier4 = modifier3;
                    composerStartRestartGroup = composerStartRestartGroup;
                    showDialogSmsChallengeComposable$lambda$3 = SmsChallengeComposable$lambda$3(snapshotState);
                    if (showDialogSmsChallengeComposable$lambda$3 != null) {
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor3) | composerStartRestartGroup.changedInstance(showDialogSmsChallengeComposable$lambda$3) | composerStartRestartGroup.changedInstance(duxo);
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue5 == companion.getEmpty()) {
                            i5 = 0;
                            Function0 function0 = new Function0() { // from class: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return SmsChallengeComposable.SmsChallengeComposable$lambda$12$lambda$11$lambda$10(current, userInteractionEventDescriptor3, showDialogSmsChallengeComposable$lambda$3, duxo, snapshotState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function0);
                            objRememberedValue5 = function0;
                        } else {
                            i5 = 0;
                        }
                        Function0 function02 = (Function0) objRememberedValue5;
                        composerStartRestartGroup.endReplaceGroup();
                        BentoAlertDialog.BentoAlertDialog(showDialogSmsChallengeComposable$lambda$3.getTitle().getText(resources).toString(), new BentoAlertDialog2.Body.Text(showDialogSmsChallengeComposable$lambda$3.getBody().getText(resources).toString()), new BentoAlertButton(StringResources_androidKt.stringResource(C39791R.string.challenge_dialog_dismiss, composerStartRestartGroup, i5), function02), null, null, null, false, null, function02, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                        composerStartRestartGroup = composerStartRestartGroup;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier4;
                } else {
                    i4 = i3;
                }
                objRememberedValue4 = new SmsChallengeComposable2(duxo);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                KFunction kFunction3 = (KFunction) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance2 = composerStartRestartGroup.changedInstance(duxo);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2) {
                    objRememberedValue2 = new SmsChallengeComposable3(duxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    KFunction kFunction22 = (KFunction) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance3 = composerStartRestartGroup.changedInstance(duxo);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance3) {
                        objRememberedValue3 = new SmsChallengeComposable4(duxo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        final UserInteractionEventDescriptor userInteractionEventDescriptor32 = userInteractionEventDescriptor2;
                        ChallengeCodeInputComposable.ChallengeCodeInputComposable(zIsLoading, strStringResource, string2, inputText, strStringResource2, strStringResource3, string3, (Function1) kFunction3, (Function0) kFunction22, (Function0) ((KFunction) objRememberedValue3), modifier3, composerStartRestartGroup, 0, (i4 >> 3) & 14, 0);
                        Modifier modifier42 = modifier3;
                        composerStartRestartGroup = composerStartRestartGroup;
                        showDialogSmsChallengeComposable$lambda$3 = SmsChallengeComposable$lambda$3(snapshotState);
                        if (showDialogSmsChallengeComposable$lambda$3 != null) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier42;
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SmsChallengeComposable.SmsChallengeComposable$lambda$13(duxo, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Object objConsume2 = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
            Intrinsics.checkNotNull(objConsume2, "null cannot be cast to non-null type android.app.Activity");
            activity = (Activity) objConsume2;
            Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final Flow eventFlow2 = duxo.getEventFlow();
            composerStartRestartGroup.startReplaceGroup(-523522313);
            LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
            Lifecycle.State state2 = Lifecycle.State.STARTED;
            CoroutineContextImpl6 coroutineContextImpl62 = CoroutineContextImpl6.INSTANCE;
            Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeComposableKt$SmsChallengeComposable$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeComposableKt$SmsChallengeComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeComposableKt$SmsChallengeComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "SmsChallengeComposable.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeComposableKt$SmsChallengeComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                            if ((event != null ? event.getData() : null) instanceof SmsChallengeEvent) {
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
            Event<SmsChallengeEvent> value2 = eventFlow2.getValue();
            event = value2;
            if (!((event == null ? event.getData() : null) instanceof SmsChallengeEvent)) {
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(flow2, value2, lifecycleOwner2.getLifecycle(), state2, coroutineContextImpl62, composerStartRestartGroup, 0, 0);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            eventSmsChallengeComposable$lambda$1 = SmsChallengeComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
            if (eventSmsChallengeComposable$lambda$1 != null) {
                eventConsumerInvoke2.consume(eventSmsChallengeComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.stepupverification.challenge.sms.SmsChallengeComposableKt$SmsChallengeComposable$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                        m25708invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m25708invoke(Object it) throws Throwable {
                        Intrinsics.checkNotNullParameter(it, "it");
                        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, activity, ((SmsChallengeEvent.Error) eventSmsChallengeComposable$lambda$1.getData()).getThrowable(), true, false, 0, null, 56, null);
                    }
                });
            }
            eventSmsChallengeComposable$lambda$12 = SmsChallengeComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
            if (eventSmsChallengeComposable$lambda$12 == null) {
                userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                boolean zIsLoading2 = SmsChallengeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).isLoading();
                String strStringResource4 = StringResources_androidKt.stringResource(C39076R.string.challenge_verification_title_sms, composerStartRestartGroup, 0);
                StringResource subtitle2 = SmsChallengeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getSubtitle();
                Intrinsics.checkNotNull(resources2);
                String string22 = subtitle2.getText(resources2).toString();
                String inputText2 = SmsChallengeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getInputText();
                String strStringResource22 = StringResources_androidKt.stringResource(C39076R.string.challenge_verification_help_bottom_sheet_title, composerStartRestartGroup, 0);
                String strStringResource32 = StringResources_androidKt.stringResource(C39076R.string.uar_challenge_verification_help_bottom_sheet_sms_subtitle, composerStartRestartGroup, 0);
                StringResource fallbackText2 = SmsChallengeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getFallbackText();
                if (fallbackText2 != null) {
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
                    Object objRememberedValue42 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                    }
                    objRememberedValue42 = new SmsChallengeComposable2(duxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue42);
                    KFunction kFunction32 = (KFunction) objRememberedValue42;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(duxo);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2) {
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SmsChallengeComposable$lambda$12$lambda$11$lambda$10(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, SmsChallengeEvent.ShowDialog showDialog, SmsChallengeDuxo smsChallengeDuxo, SnapshotState snapshotState) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.DISMISS, null, new Component(Component.ComponentType.ALERT, null, null, 6, null), null, 43, null), UserInteractionEventData.EventType.APPEAR), false, false, 6, null);
        snapshotState.setValue(null);
        if (showDialog.getProceedOnDismiss()) {
            smsChallengeDuxo.proceed();
        }
        return Unit.INSTANCE;
    }

    private static final SmsChallengeViewState SmsChallengeComposable$lambda$0(SnapshotState4<SmsChallengeViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<SmsChallengeEvent> SmsChallengeComposable$lambda$1(SnapshotState4<Event<SmsChallengeEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final SmsChallengeEvent.ShowDialog SmsChallengeComposable$lambda$3(SnapshotState<SmsChallengeEvent.ShowDialog> snapshotState) {
        return snapshotState.getValue();
    }
}
