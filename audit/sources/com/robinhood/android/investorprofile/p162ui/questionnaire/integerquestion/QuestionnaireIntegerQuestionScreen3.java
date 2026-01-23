package com.robinhood.android.investorprofile.p162ui.questionnaire.integerquestion;

import android.view.KeyEvent;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Alpha;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
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
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.investorprofile.C19641R;
import com.robinhood.android.investorprofile.p162ui.questionnaire.ContextualQuestionInfo;
import com.robinhood.android.investorprofile.p162ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionDuxo;
import com.robinhood.android.investorprofile.p162ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionEvent;
import com.robinhood.android.investorprofile.p162ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtonState;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.numpad.BentoNumpad3;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;

/* compiled from: QuestionnaireIntegerQuestionScreen.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001aa\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u0010j\u0002`\u0011\u0012\u0004\u0012\u00020\u00010\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00132\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0003¢\u0006\u0002\u0010\u0016\u001a)\u0010\u0017\u001a\u00020\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u0013H\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001d¨\u0006\u001e²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002²\u0006\u0012\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 X\u008a\u0084\u0002"}, m3636d2 = {"IntegerQuestionScreen", "", "onQuestionAnswered", "Lkotlin/Function2;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/ContextualQuestionInfo;", "Lcom/robinhood/android/questionnaire/ui/QuestionnaireAnswer;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/investorprofile/ui/questionnaire/integerquestion/QuestionnaireIntegerQuestionDuxo;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/investorprofile/ui/questionnaire/integerquestion/QuestionnaireIntegerQuestionDuxo;Landroidx/compose/runtime/Composer;II)V", "IntegerQuestionInput", "state", "Lcom/robinhood/android/investorprofile/ui/questionnaire/integerquestion/QuestionnaireIntegerQuestionViewState;", "onKeyPress", "Lkotlin/Function1;", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "onResetToDefault", "Lkotlin/Function0;", "onContinue", "onDismissAlert", "(Lcom/robinhood/android/investorprofile/ui/questionnaire/integerquestion/QuestionnaireIntegerQuestionViewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "AlertContent", "alertContent", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "feature-investor-profile_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/integerquestion/QuestionnaireIntegerQuestionEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class QuestionnaireIntegerQuestionScreen3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertContent$lambda$18(GenericAlertContent genericAlertContent, Function0 function0, int i, Composer composer, int i2) {
        AlertContent(genericAlertContent, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntegerQuestionInput$lambda$14(QuestionnaireIntegerQuestionViewState questionnaireIntegerQuestionViewState, Function1 function1, Function0 function0, Function0 function02, Modifier modifier, Function0 function03, int i, int i2, Composer composer, int i3) {
        IntegerQuestionInput(questionnaireIntegerQuestionViewState, function1, function0, function02, modifier, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntegerQuestionScreen$lambda$8(Function2 function2, Modifier modifier, QuestionnaireIntegerQuestionDuxo questionnaireIntegerQuestionDuxo, int i, int i2, Composer composer, int i3) {
        IntegerQuestionScreen(function2, modifier, questionnaireIntegerQuestionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$19(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void IntegerQuestionScreen(final Function2<? super ContextualQuestionInfo, ? super QuestionnaireAnswer, Unit> onQuestionAnswered, Modifier modifier, QuestionnaireIntegerQuestionDuxo questionnaireIntegerQuestionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        final QuestionnaireIntegerQuestionDuxo questionnaireIntegerQuestionDuxo2;
        EventConsumer<QuestionnaireIntegerQuestionEvent> eventConsumerInvoke;
        EventConsumer<QuestionnaireIntegerQuestionEvent> eventConsumerInvoke2;
        Intrinsics.checkNotNullParameter(onQuestionAnswered, "onQuestionAnswered");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2063189905);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onQuestionAnswered) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                questionnaireIntegerQuestionDuxo2 = questionnaireIntegerQuestionDuxo;
                int i5 = composerStartRestartGroup.changedInstance(questionnaireIntegerQuestionDuxo2) ? 256 : 128;
                i3 |= i5;
            } else {
                questionnaireIntegerQuestionDuxo2 = questionnaireIntegerQuestionDuxo;
            }
            i3 |= i5;
        } else {
            questionnaireIntegerQuestionDuxo2 = questionnaireIntegerQuestionDuxo;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if (i4 != 0) {
                    modifier = Modifier.INSTANCE;
                }
                if ((i2 & 4) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(QuestionnaireIntegerQuestionDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionScreenKt$IntegerQuestionScreen$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionScreenKt$IntegerQuestionScreen$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    i3 &= -897;
                    questionnaireIntegerQuestionDuxo2 = (QuestionnaireIntegerQuestionDuxo) baseDuxo;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2063189905, i3, -1, "com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.IntegerQuestionScreen (QuestionnaireIntegerQuestionScreen.kt:54)");
            }
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(questionnaireIntegerQuestionDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(questionnaireIntegerQuestionDuxo2.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final Event<QuestionnaireIntegerQuestionEvent> eventIntegerQuestionScreen$lambda$1 = IntegerQuestionScreen$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            if (eventIntegerQuestionScreen$lambda$1 != null && (eventIntegerQuestionScreen$lambda$1.getData() instanceof QuestionnaireIntegerQuestionEvent.Answered) && (eventConsumerInvoke2 = eventIntegerQuestionScreen$lambda$1.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke2.consume(eventIntegerQuestionScreen$lambda$1, new Function1() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionScreenKt$IntegerQuestionScreen$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m15684invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m15684invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        int input = ((QuestionnaireIntegerQuestionEvent.Answered) eventIntegerQuestionScreen$lambda$1.getData()).getInput();
                        Function2 function2 = onQuestionAnswered;
                        QuestionnaireIntegerQuestionDuxo.Companion companion = QuestionnaireIntegerQuestionDuxo.INSTANCE;
                        function2.invoke(((QuestionnaireIntegerQuestionFragment.Args) companion.getArgs((HasSavedState) questionnaireIntegerQuestionDuxo2)).getContextualQuestionInfo(), new QuestionnaireAnswer.IntegerAnswer(((QuestionnaireIntegerQuestionFragment.Args) companion.getArgs((HasSavedState) questionnaireIntegerQuestionDuxo2)).getIntegerQuestion(), false, input, 2, null));
                    }
                });
            }
            final Event<QuestionnaireIntegerQuestionEvent> eventIntegerQuestionScreen$lambda$12 = IntegerQuestionScreen$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
            if (eventIntegerQuestionScreen$lambda$12 != null && (eventIntegerQuestionScreen$lambda$12.getData() instanceof QuestionnaireIntegerQuestionEvent.ValueThresholdAlert) && (eventConsumerInvoke = eventIntegerQuestionScreen$lambda$12.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventIntegerQuestionScreen$lambda$12, new Function1() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionScreenKt$IntegerQuestionScreen$$inlined$consumeIfType$2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m15685invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m15685invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        questionnaireIntegerQuestionDuxo2.showAlert(((QuestionnaireIntegerQuestionEvent.ValueThresholdAlert) eventIntegerQuestionScreen$lambda$12.getData()).component1());
                    }
                });
            }
            QuestionnaireIntegerQuestionViewState questionnaireIntegerQuestionViewStateIntegerQuestionScreen$lambda$0 = IntegerQuestionScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(questionnaireIntegerQuestionDuxo2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new QuestionnaireIntegerQuestionScreen5(questionnaireIntegerQuestionDuxo2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            KFunction kFunction = (KFunction) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(questionnaireIntegerQuestionDuxo2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new QuestionnaireIntegerQuestionScreen6(questionnaireIntegerQuestionDuxo2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            KFunction kFunction2 = (KFunction) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(questionnaireIntegerQuestionDuxo2);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new QuestionnaireIntegerQuestionScreen7(questionnaireIntegerQuestionDuxo2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            KFunction kFunction3 = (KFunction) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(questionnaireIntegerQuestionDuxo2);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new QuestionnaireIntegerQuestionScreen8(questionnaireIntegerQuestionDuxo2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceGroup();
            Composer composer2 = composerStartRestartGroup;
            IntegerQuestionInput(questionnaireIntegerQuestionViewStateIntegerQuestionScreen$lambda$0, (Function1) kFunction, (Function0) kFunction2, (Function0) kFunction3, modifier, (Function0) ((KFunction) objRememberedValue5), composer2, (i3 << 9) & 57344, 0);
            composerStartRestartGroup = composer2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuestionnaireIntegerQuestionScreen3.IntegerQuestionScreen$lambda$8(onQuestionAnswered, modifier2, questionnaireIntegerQuestionDuxo2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final QuestionnaireIntegerQuestionViewState IntegerQuestionScreen$lambda$0(SnapshotState4<QuestionnaireIntegerQuestionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<QuestionnaireIntegerQuestionEvent> IntegerQuestionScreen$lambda$1(SnapshotState4<Event<QuestionnaireIntegerQuestionEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0298  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IntegerQuestionInput(final QuestionnaireIntegerQuestionViewState questionnaireIntegerQuestionViewState, final Function1<? super KeyEvent, Unit> function1, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, final Function0<Unit> function03, Composer composer, final int i, final int i2) {
        QuestionnaireIntegerQuestionViewState questionnaireIntegerQuestionViewState2;
        int i3;
        Function0<Unit> function04;
        Function0<Unit> function05;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        String disclosureMarkdown;
        int i5;
        GenericAlertContent<GenericAction> thresholdValueAlert;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1004025826);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            questionnaireIntegerQuestionViewState2 = questionnaireIntegerQuestionViewState;
        } else if ((i & 6) == 0) {
            questionnaireIntegerQuestionViewState2 = questionnaireIntegerQuestionViewState;
            i3 = (composerStartRestartGroup.changedInstance(questionnaireIntegerQuestionViewState2) ? 4 : 2) | i;
        } else {
            questionnaireIntegerQuestionViewState2 = questionnaireIntegerQuestionViewState;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    function04 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function04) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function05 = function02;
                        i3 |= composerStartRestartGroup.changedInstance(function05) ? 2048 : 1024;
                    }
                    i4 = i2 & 16;
                    if (i4 != 0) {
                        if ((i & 24576) == 0) {
                            modifier2 = modifier;
                            i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                        }
                        if ((i2 & 32) != 0) {
                            i3 |= 196608;
                        } else if ((i & 196608) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function03) ? 131072 : 65536;
                        }
                        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1004025826, i3, -1, "com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.IntegerQuestionInput (QuestionnaireIntegerQuestionScreen.kt:89)");
                            }
                            Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier4, null, 1, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierLogScreenTransitions$default);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (!composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN4 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM());
                            Modifier modifier5 = modifier4;
                            String title = questionnaireIntegerQuestionViewState2.getTitle();
                            TextAlign.Companion companion3 = TextAlign.INSTANCE;
                            int i7 = i3;
                            BentoText2.m20747BentoText38GnDrw(title, modifierM21620defaultFillMaxWidthPaddingVpY3zN4, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8124);
                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, 1, null);
                            String subtitle = questionnaireIntegerQuestionViewState.getSubtitle();
                            BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                            TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i6).getTextM();
                            int iM7919getCentere0LSkKk = companion3.m7919getCentere0LSkKk();
                            int i8 = BentoMarkdownText.$stable;
                            MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = bentoMarkdownText.m21100withTextStylesYhh7B2I(textM, iM7919getCentere0LSkKk, 0L, 0L, false, composerStartRestartGroup, i8 << 15, 28);
                            int i9 = MarkdownStyle.$stable;
                            BentoMarkdownText2.BentoMarkdownText(subtitle, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, i9 << 6, 24);
                            Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM());
                            String inputString = questionnaireIntegerQuestionViewState.getInputString();
                            String inputPlaceholder = questionnaireIntegerQuestionViewState.getInputPlaceholder();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionScreenKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return QuestionnaireIntegerQuestionScreen3.IntegerQuestionInput$lambda$13$lambda$10$lambda$9((String) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            BentoTextInput4.BentoHeroTextInput(inputString, (Function1) objRememberedValue, modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, inputPlaceholder, null, null, null, null, null, null, null, false, true, composerStartRestartGroup, 48, 3072, 8168);
                            int i10 = i7 >> 6;
                            BentoTextButton2.m20715BentoTextButtonPIknLig(function04, StringResources_androidKt.stringResource(C19641R.string.investor_profile_reset_to_default, composerStartRestartGroup, 0), Alpha.alpha(companion2, !questionnaireIntegerQuestionViewState.getShowResetDefaultButton() ? 1.0f : 0.0f), null, null, questionnaireIntegerQuestionViewState.getShowResetDefaultButton(), null, composerStartRestartGroup, i10 & 14, 88);
                            Composer composer2 = composerStartRestartGroup;
                            Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composer2, 0);
                            disclosureMarkdown = questionnaireIntegerQuestionViewState.getDisclosureMarkdown();
                            composer2.startReplaceGroup(-1153924283);
                            if (disclosureMarkdown != null) {
                                i5 = 6;
                            } else {
                                i5 = 6;
                                composer2 = composer2;
                                BentoMarkdownText2.BentoMarkdownText(disclosureMarkdown, androidx.compose.foundation.layout.PaddingKt.m5143paddingVpY3zN4(companion2, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i6).m21593getSmallD9Ej5fM()), bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, i6).getTextS(), companion3.m7919getCentere0LSkKk(), bentoTheme.getColors(composer2, i6).m21426getFg20d7_KjU(), 0L, false, composer2, i8 << 15, 24), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, i9 << 6, 24);
                            }
                            composer2.endReplaceGroup();
                            Composer composer3 = composer2;
                            BentoButtonKt.BentoButton(new BentoButtonState(StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer2, 0), (BentoButtons.Icon.Size16) null, (BentoButtons.Type) null, questionnaireIntegerQuestionViewState.getCtaEnabled(), false, (Color) null, (Color) null, (Color) null, (TextStyle) null, (Color) null, false, 2038, (DefaultConstructorMarker) null), function05, PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(ModifiersKt.autoLogEvents$default(companion2, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null)), false, false, false, true, false, null, 110, null), bentoTheme.getSpacing(composer2, i6).m21595getXsmallD9Ej5fM()), (String) null, composer3, BentoButtonState.$stable | (i10 & 112), 8);
                            BentoNumpad3.BentoNumpad(WindowInsetsPadding6.windowInsetsPadding(companion2, WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeContent(WindowInsets.INSTANCE, composer3, i5), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM())), function1, true, null, false, false, composer3, (i7 & 112) | 3456, 48);
                            composerStartRestartGroup = composer3;
                            thresholdValueAlert = questionnaireIntegerQuestionViewState.getThresholdValueAlert();
                            composerStartRestartGroup.startReplaceGroup(-1153868029);
                            if (thresholdValueAlert != null) {
                                AlertContent(thresholdValueAlert, function03, composerStartRestartGroup, (i7 >> 12) & 112);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionScreenKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return QuestionnaireIntegerQuestionScreen3.IntegerQuestionInput$lambda$14(questionnaireIntegerQuestionViewState, function1, function0, function02, modifier3, function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    modifier2 = modifier;
                    if ((i2 & 32) != 0) {
                    }
                    if ((74899 & i3) != 74898) {
                        if (i4 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Modifier modifierLogScreenTransitions$default2 = ModifiersKt.logScreenTransitions$default(modifier4, null, 1, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierLogScreenTransitions$default2);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            Modifier.Companion companion22 = Modifier.INSTANCE;
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i62 = BentoTheme.$stable;
                            Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN42 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM());
                            Modifier modifier52 = modifier4;
                            String title2 = questionnaireIntegerQuestionViewState2.getTitle();
                            TextAlign.Companion companion32 = TextAlign.INSTANCE;
                            int i72 = i3;
                            BentoText2.m20747BentoText38GnDrw(title2, modifierM21620defaultFillMaxWidthPaddingVpY3zN42, null, null, null, null, TextAlign.m7912boximpl(companion32.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleSmall(), composerStartRestartGroup, 0, 0, 8124);
                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion22, 0.0f, 1, null);
                            String subtitle2 = questionnaireIntegerQuestionViewState.getSubtitle();
                            BentoMarkdownText bentoMarkdownText2 = BentoMarkdownText.INSTANCE;
                            TextStyle textM2 = bentoTheme2.getTypography(composerStartRestartGroup, i62).getTextM();
                            int iM7919getCentere0LSkKk2 = companion32.m7919getCentere0LSkKk();
                            int i82 = BentoMarkdownText.$stable;
                            MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I2 = bentoMarkdownText2.m21100withTextStylesYhh7B2I(textM2, iM7919getCentere0LSkKk2, 0L, 0L, false, composerStartRestartGroup, i82 << 15, 28);
                            int i92 = MarkdownStyle.$stable;
                            BentoMarkdownText2.BentoMarkdownText(subtitle2, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2, markdownStyleM21100withTextStylesYhh7B2I2, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composerStartRestartGroup, i92 << 6, 24);
                            Spacer2.Spacer(Column5.weight$default(column62, companion22, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                            Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs2 = PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM());
                            String inputString2 = questionnaireIntegerQuestionViewState.getInputString();
                            String inputPlaceholder2 = questionnaireIntegerQuestionViewState.getInputPlaceholder();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            BentoTextInput4.BentoHeroTextInput(inputString2, (Function1) objRememberedValue, modifierM21618defaultFillMaxWidthPadding3ABfNKs2, null, inputPlaceholder2, null, null, null, null, null, null, null, false, true, composerStartRestartGroup, 48, 3072, 8168);
                            int i102 = i72 >> 6;
                            BentoTextButton2.m20715BentoTextButtonPIknLig(function04, StringResources_androidKt.stringResource(C19641R.string.investor_profile_reset_to_default, composerStartRestartGroup, 0), Alpha.alpha(companion22, !questionnaireIntegerQuestionViewState.getShowResetDefaultButton() ? 1.0f : 0.0f), null, null, questionnaireIntegerQuestionViewState.getShowResetDefaultButton(), null, composerStartRestartGroup, i102 & 14, 88);
                            Composer composer22 = composerStartRestartGroup;
                            Spacer2.Spacer(Column5.weight$default(column62, companion22, 1.0f, false, 2, null), composer22, 0);
                            disclosureMarkdown = questionnaireIntegerQuestionViewState.getDisclosureMarkdown();
                            composer22.startReplaceGroup(-1153924283);
                            if (disclosureMarkdown != null) {
                            }
                            composer22.endReplaceGroup();
                            Composer composer32 = composer22;
                            BentoButtonKt.BentoButton(new BentoButtonState(StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer22, 0), (BentoButtons.Icon.Size16) null, (BentoButtons.Type) null, questionnaireIntegerQuestionViewState.getCtaEnabled(), false, (Color) null, (Color) null, (Color) null, (TextStyle) null, (Color) null, false, 2038, (DefaultConstructorMarker) null), function05, PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(ModifiersKt.autoLogEvents$default(companion22, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer22.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null)), false, false, false, true, false, null, 110, null), bentoTheme2.getSpacing(composer22, i62).m21595getXsmallD9Ej5fM()), (String) null, composer32, BentoButtonState.$stable | (i102 & 112), 8);
                            BentoNumpad3.BentoNumpad(WindowInsetsPadding6.windowInsetsPadding(companion22, WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeContent(WindowInsets.INSTANCE, composer32, i5), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM())), function1, true, null, false, false, composer32, (i72 & 112) | 3456, 48);
                            composerStartRestartGroup = composer32;
                            thresholdValueAlert = questionnaireIntegerQuestionViewState.getThresholdValueAlert();
                            composerStartRestartGroup.startReplaceGroup(-1153868029);
                            if (thresholdValueAlert != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier52;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function05 = function02;
                i4 = i2 & 16;
                if (i4 != 0) {
                }
                modifier2 = modifier;
                if ((i2 & 32) != 0) {
                }
                if ((74899 & i3) != 74898) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function04 = function0;
            if ((i2 & 8) != 0) {
            }
            function05 = function02;
            i4 = i2 & 16;
            if (i4 != 0) {
            }
            modifier2 = modifier;
            if ((i2 & 32) != 0) {
            }
            if ((74899 & i3) != 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        function04 = function0;
        if ((i2 & 8) != 0) {
        }
        function05 = function02;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i2 & 32) != 0) {
        }
        if ((74899 & i3) != 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit IntegerQuestionInput$lambda$13$lambda$10$lambda$9(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    private static final void AlertContent(GenericAlertContent<? extends GenericAction> genericAlertContent, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        final GenericAlertContent<? extends GenericAction> genericAlertContent2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1756387790);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(genericAlertContent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1756387790, i2, -1, "com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.AlertContent (QuestionnaireIntegerQuestionScreen.kt:187)");
            }
            SduiAlert sduiAlert = SduiAlert.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new SduiActionHandler() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionScreenKt$AlertContent$1$1
                    @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                    /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                    public final boolean mo15941handle(GenericAction action) {
                        Intrinsics.checkNotNullParameter(action, "action");
                        if (!(action instanceof GenericAction.Dismiss)) {
                            return false;
                        }
                        function0.invoke();
                        return true;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z2 = i3 == 32;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return QuestionnaireIntegerQuestionScreen3.AlertContent$lambda$17$lambda$16(function0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            genericAlertContent2 = genericAlertContent;
            sduiAlert.Dialog(genericAlertContent2, sduiActionHandler, null, (Function0) objRememberedValue2, composerStartRestartGroup, (i2 & 14) | (SduiAlert.$stable << 12), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            genericAlertContent2 = genericAlertContent;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuestionnaireIntegerQuestionScreen3.AlertContent$lambda$18(genericAlertContent2, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AlertContent$lambda$17$lambda$16(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-69842841);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-69842841, i, -1, "com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.Preview (QuestionnaireIntegerQuestionScreen.kt:204)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, QuestionnaireIntegerQuestionScreen.INSTANCE.getLambda$2145727007$feature_investor_profile_externalDebug(), composerStartRestartGroup, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.integerquestion.QuestionnaireIntegerQuestionScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuestionnaireIntegerQuestionScreen3.Preview$lambda$19(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
