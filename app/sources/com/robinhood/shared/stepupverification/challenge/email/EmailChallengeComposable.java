package com.robinhood.shared.stepupverification.challenge.email;

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
import com.robinhood.shared.stepupverification.challenge.email.EmailChallengeEvent;
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

/* compiled from: EmailChallengeComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002²\u0006\u0012\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u008a\u0084\u0002²\u0006\f\u0010\r\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002"}, m3636d2 = {"EmailChallengeComposable", "", "duxo", "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeDuxo;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeDuxo;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-step-up-verification_externalDebug", "viewState", "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeEvent;", "dialogContent", "Lcom/robinhood/shared/stepupverification/challenge/email/EmailChallengeEvent$ShowDialog;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class EmailChallengeComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailChallengeComposable$lambda$13(EmailChallengeDuxo emailChallengeDuxo, Modifier modifier, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        EmailChallengeComposable(emailChallengeDuxo, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EmailChallengeComposable(final EmailChallengeDuxo duxo, Modifier modifier, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        final Modifier modifier2;
        final Activity activity;
        UserInteractionEventDescriptor userInteractionEventDescriptor;
        Event<EmailChallengeEvent> event;
        Object objRememberedValue;
        Composer.Companion companion;
        final Event<EmailChallengeEvent> eventEmailChallengeComposable$lambda$1;
        final Event<EmailChallengeEvent> eventEmailChallengeComposable$lambda$12;
        final UserInteractionEventDescriptor userInteractionEventDescriptor2;
        StringResource fallbackText;
        String str;
        boolean zChangedInstance;
        int i4;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        final EmailChallengeEvent.ShowDialog showDialogEmailChallengeComposable$lambda$3;
        int i5;
        EventConsumer<EmailChallengeEvent> eventConsumerInvoke;
        EventConsumer<EmailChallengeEvent> eventConsumerInvoke2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1397740359);
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
                    ComposerKt.traceEventStart(-1397740359, i3, -1, "com.robinhood.shared.stepupverification.challenge.email.EmailChallengeComposable (EmailChallengeComposable.kt:32)");
                }
                Object objConsume = composerStartRestartGroup.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type android.app.Activity");
                activity = (Activity) objConsume;
                Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final StateFlow<Event<EmailChallengeEvent>> eventFlow = duxo.getEventFlow();
                composerStartRestartGroup.startReplaceGroup(-523522313);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                Lifecycle.State state = Lifecycle.State.STARTED;
                CoroutineContextImpl6 coroutineContextImpl6 = CoroutineContextImpl6.INSTANCE;
                Flow<Event<?>> flow = new Flow<Event<?>>() { // from class: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeComposableKt$EmailChallengeComposable$$inlined$collectEventAsStateWithLifecycle$1

                    /* compiled from: Emitters.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeComposableKt$EmailChallengeComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                    public static final class AnonymousClass2<T> implements FlowCollector {
                        final /* synthetic */ FlowCollector $this_unsafeFlow;

                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.email.EmailChallengeComposableKt$EmailChallengeComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "EmailChallengeComposable.kt", m3646l = {50}, m3647m = "emit")
                        /* renamed from: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeComposableKt$EmailChallengeComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                                if ((event != null ? event.getData() : null) instanceof EmailChallengeEvent) {
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
                Event<EmailChallengeEvent> value = eventFlow.getValue();
                event = value;
                if (!((event == null ? event.getData() : null) instanceof EmailChallengeEvent)) {
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
                eventEmailChallengeComposable$lambda$1 = EmailChallengeComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventEmailChallengeComposable$lambda$1 != null && (eventEmailChallengeComposable$lambda$1.getData() instanceof EmailChallengeEvent.Error) && (eventConsumerInvoke2 = eventEmailChallengeComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventEmailChallengeComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeComposableKt$EmailChallengeComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                            m25706invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25706invoke(Object it) throws Throwable {
                            Intrinsics.checkNotNullParameter(it, "it");
                            ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, activity, ((EmailChallengeEvent.Error) eventEmailChallengeComposable$lambda$1.getData()).getThrowable(), true, false, 0, null, 56, null);
                        }
                    });
                }
                eventEmailChallengeComposable$lambda$12 = EmailChallengeComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventEmailChallengeComposable$lambda$12 == null && (eventEmailChallengeComposable$lambda$12.getData() instanceof EmailChallengeEvent.ShowDialog) && (eventConsumerInvoke = eventEmailChallengeComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                    userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                    eventConsumerInvoke.consume(eventEmailChallengeComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeComposableKt$EmailChallengeComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25707invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25707invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            EmailChallengeEvent.ShowDialog showDialog = (EmailChallengeEvent.ShowDialog) eventEmailChallengeComposable$lambda$12.getData();
                            EventLogger.DefaultImpls.logUserInteractionEvent$default(current, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor2, null, null, null, null, new Component(Component.ComponentType.ALERT, null, null, 6, null), null, 47, null), UserInteractionEventData.EventType.APPEAR), false, false, 6, null);
                            snapshotState.setValue(showDialog);
                        }
                    });
                } else {
                    userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                }
                boolean zIsLoading = EmailChallengeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isLoading();
                String strStringResource = StringResources_androidKt.stringResource(C39076R.string.challenge_verification_title_email, composerStartRestartGroup, 0);
                String inputText = EmailChallengeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getInputText();
                String strStringResource2 = StringResources_androidKt.stringResource(C39076R.string.challenge_verification_help_bottom_sheet_title, composerStartRestartGroup, 0);
                String strStringResource3 = StringResources_androidKt.stringResource(C39076R.string.challenge_verification_help_bottom_sheet_email_subtitle, composerStartRestartGroup, 0);
                fallbackText = EmailChallengeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getFallbackText();
                if (fallbackText == null) {
                    Intrinsics.checkNotNull(resources);
                    CharSequence text = fallbackText.getText(resources);
                    String string2 = text != null ? text.toString() : null;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(duxo);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3) {
                        str = strStringResource;
                    } else {
                        str = strStringResource;
                        if (objRememberedValue3 == companion.getEmpty()) {
                        }
                        KFunction kFunction = (KFunction) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance) {
                            i4 = i3;
                            if (objRememberedValue4 == companion.getEmpty()) {
                            }
                            KFunction kFunction2 = (KFunction) objRememberedValue4;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            zChangedInstance2 = composerStartRestartGroup.changedInstance(duxo);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new EmailChallengeComposable4(duxo);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            int i7 = (i4 >> 3) & 14;
                            final UserInteractionEventDescriptor userInteractionEventDescriptor3 = userInteractionEventDescriptor2;
                            ChallengeCodeInputComposable.ChallengeCodeInputComposable(zIsLoading, str, "", inputText, strStringResource2, strStringResource3, string2, (Function1) kFunction, (Function0) kFunction2, (Function0) ((KFunction) objRememberedValue2), modifier3, composerStartRestartGroup, 384, i7, 0);
                            Modifier modifier4 = modifier3;
                            composerStartRestartGroup = composerStartRestartGroup;
                            showDialogEmailChallengeComposable$lambda$3 = EmailChallengeComposable$lambda$3(snapshotState);
                            if (showDialogEmailChallengeComposable$lambda$3 != null) {
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor3) | composerStartRestartGroup.changedInstance(showDialogEmailChallengeComposable$lambda$3) | composerStartRestartGroup.changedInstance(duxo);
                                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance4 || objRememberedValue5 == companion.getEmpty()) {
                                    i5 = 0;
                                    Function0 function0 = new Function0() { // from class: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeComposableKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return EmailChallengeComposable.EmailChallengeComposable$lambda$12$lambda$11$lambda$10(current, userInteractionEventDescriptor3, showDialogEmailChallengeComposable$lambda$3, duxo, snapshotState);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(function0);
                                    objRememberedValue5 = function0;
                                } else {
                                    i5 = 0;
                                }
                                Function0 function02 = (Function0) objRememberedValue5;
                                composerStartRestartGroup.endReplaceGroup();
                                StringResource title = showDialogEmailChallengeComposable$lambda$3.getTitle();
                                Intrinsics.checkNotNull(resources);
                                BentoAlertDialog.BentoAlertDialog(title.getText(resources).toString(), new BentoAlertDialog2.Body.Text(showDialogEmailChallengeComposable$lambda$3.getBody().getText(resources).toString()), new BentoAlertButton(StringResources_androidKt.stringResource(C39791R.string.challenge_dialog_dismiss, composerStartRestartGroup, i5), function02), null, null, null, false, null, function02, composerStartRestartGroup, (BentoAlertDialog2.Body.Text.$stable << 3) | (BentoAlertButton.$stable << 6), EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                                composerStartRestartGroup = composerStartRestartGroup;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier4;
                        } else {
                            i4 = i3;
                        }
                        objRememberedValue4 = new EmailChallengeComposable3(duxo);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        KFunction kFunction22 = (KFunction) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(duxo);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2) {
                            objRememberedValue2 = new EmailChallengeComposable4(duxo);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            int i72 = (i4 >> 3) & 14;
                            final UserInteractionEventDescriptor userInteractionEventDescriptor32 = userInteractionEventDescriptor2;
                            ChallengeCodeInputComposable.ChallengeCodeInputComposable(zIsLoading, str, "", inputText, strStringResource2, strStringResource3, string2, (Function1) kFunction, (Function0) kFunction22, (Function0) ((KFunction) objRememberedValue2), modifier3, composerStartRestartGroup, 384, i72, 0);
                            Modifier modifier42 = modifier3;
                            composerStartRestartGroup = composerStartRestartGroup;
                            showDialogEmailChallengeComposable$lambda$3 = EmailChallengeComposable$lambda$3(snapshotState);
                            if (showDialogEmailChallengeComposable$lambda$3 != null) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = modifier42;
                        }
                    }
                    objRememberedValue3 = new EmailChallengeComposable2(duxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    KFunction kFunction3 = (KFunction) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance = composerStartRestartGroup.changedInstance(duxo);
                    Object objRememberedValue42 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                    }
                    objRememberedValue42 = new EmailChallengeComposable3(duxo);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue42);
                    KFunction kFunction222 = (KFunction) objRememberedValue42;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(duxo);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2) {
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EmailChallengeComposable.EmailChallengeComposable$lambda$13(duxo, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Flow<Event<?>> flow2 = new Flow<Event<?>>() { // from class: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeComposableKt$EmailChallengeComposable$$inlined$collectEventAsStateWithLifecycle$1

                /* compiled from: Emitters.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeComposableKt$EmailChallengeComposable$$inlined$collectEventAsStateWithLifecycle$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @DebugMetadata(m3644c = "com.robinhood.shared.stepupverification.challenge.email.EmailChallengeComposableKt$EmailChallengeComposable$$inlined$collectEventAsStateWithLifecycle$1$2", m3645f = "EmailChallengeComposable.kt", m3646l = {50}, m3647m = "emit")
                    /* renamed from: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeComposableKt$EmailChallengeComposable$$inlined$collectEventAsStateWithLifecycle$1$2$1, reason: invalid class name */
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
                            if ((event != null ? event.getData() : null) instanceof EmailChallengeEvent) {
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
            Event<EmailChallengeEvent> value2 = eventFlow2.getValue();
            event = value2;
            if (!((event == null ? event.getData() : null) instanceof EmailChallengeEvent)) {
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
            eventEmailChallengeComposable$lambda$1 = EmailChallengeComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
            if (eventEmailChallengeComposable$lambda$1 != null) {
                eventConsumerInvoke2.consume(eventEmailChallengeComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.stepupverification.challenge.email.EmailChallengeComposableKt$EmailChallengeComposable$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                        m25706invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m25706invoke(Object it) throws Throwable {
                        Intrinsics.checkNotNullParameter(it, "it");
                        ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, activity, ((EmailChallengeEvent.Error) eventEmailChallengeComposable$lambda$1.getData()).getThrowable(), true, false, 0, null, 56, null);
                    }
                });
            }
            eventEmailChallengeComposable$lambda$12 = EmailChallengeComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
            if (eventEmailChallengeComposable$lambda$12 == null) {
                userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                boolean zIsLoading2 = EmailChallengeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).isLoading();
                String strStringResource4 = StringResources_androidKt.stringResource(C39076R.string.challenge_verification_title_email, composerStartRestartGroup, 0);
                String inputText2 = EmailChallengeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getInputText();
                String strStringResource22 = StringResources_androidKt.stringResource(C39076R.string.challenge_verification_help_bottom_sheet_title, composerStartRestartGroup, 0);
                String strStringResource32 = StringResources_androidKt.stringResource(C39076R.string.challenge_verification_help_bottom_sheet_email_subtitle, composerStartRestartGroup, 0);
                fallbackText = EmailChallengeComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getFallbackText();
                if (fallbackText == null) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailChallengeComposable$lambda$12$lambda$11$lambda$10(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, EmailChallengeEvent.ShowDialog showDialog, EmailChallengeDuxo emailChallengeDuxo, SnapshotState snapshotState) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.DISMISS, null, new Component(Component.ComponentType.ALERT, null, null, 6, null), null, 43, null), UserInteractionEventData.EventType.APPEAR), false, false, 6, null);
        snapshotState.setValue(null);
        if (showDialog.getProceedOnDismiss()) {
            emailChallengeDuxo.proceed();
        }
        return Unit.INSTANCE;
    }

    private static final EmailChallengeViewState EmailChallengeComposable$lambda$0(SnapshotState4<EmailChallengeViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<EmailChallengeEvent> EmailChallengeComposable$lambda$1(SnapshotState4<Event<EmailChallengeEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final EmailChallengeEvent.ShowDialog EmailChallengeComposable$lambda$3(SnapshotState<EmailChallengeEvent.ShowDialog> snapshotState) {
        return snapshotState.getValue();
    }
}
