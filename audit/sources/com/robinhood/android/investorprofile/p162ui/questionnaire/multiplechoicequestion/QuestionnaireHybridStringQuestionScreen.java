package com.robinhood.android.investorprofile.p162ui.questionnaire.multiplechoicequestion;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.android.investorprofile.C19641R;
import com.robinhood.android.investorprofile.p162ui.questionnaire.multiplechoicequestion.QuestionnaireHybridStringQuestionScreen;
import com.robinhood.android.investorprofile.question.ConfirmQuestionLayout;
import com.robinhood.android.questionnaire.p220ui.UiQuestionContent;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: QuestionnaireHybridStringQuestionScreen.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\f\u0010\f\u001a\u0004\u0018\u00010\rX\u008a\u008e\u0002²\u0006\f\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u008a\u008e\u0002"}, m3636d2 = {"QuestionnaireHybridStringQuestionScreen", "", "question", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$HybridQuestion;", "onQuestionAnswered", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$HybridQuestion;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-investor-profile_externalDebug", "selectedAnswer", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$HybridContent$Answer;", "stringAnswer"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireHybridStringQuestionScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class QuestionnaireHybridStringQuestionScreen {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuestionnaireHybridStringQuestionScreen$lambda$11(UiQuestionnaireQuestion.HybridQuestion hybridQuestion, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        QuestionnaireHybridStringQuestionScreen(hybridQuestion, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void QuestionnaireHybridStringQuestionScreen(final UiQuestionnaireQuestion.HybridQuestion question, final Function2<? super UUID, ? super String, Unit> onQuestionAnswered, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        final SnapshotState snapshotState2;
        boolean zChanged;
        Object objRememberedValue3;
        final Modifier modifier3;
        String strQuestionnaireHybridStringQuestionScreen$lambda$6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(onQuestionAnswered, "onQuestionAnswered");
        Composer composerStartRestartGroup = composer.startRestartGroup(1942687168);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(question) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onQuestionAnswered) ? 32 : 16;
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
                    ComposerKt.traceEventStart(1942687168, i3, -1, "com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireHybridStringQuestionScreen (QuestionnaireHybridStringQuestionScreen.kt:26)");
                }
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireHybridStringQuestionScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return QuestionnaireHybridStringQuestionScreen.QuestionnaireHybridStringQuestionScreen$lambda$1$lambda$0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                Object[] objArr2 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireHybridStringQuestionScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return QuestionnaireHybridStringQuestionScreen.QuestionnaireHybridStringQuestionScreen$lambda$5$lambda$4();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
                String title = question.getTitle();
                String subtitle = question.getSubtitle();
                String disclosureMarkdown = question.getDisclosureMarkdown();
                String strStringResource = StringResources_androidKt.stringResource(C19641R.string.questionnaire_continue_cta, composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged = ((i3 & 112) != 32) | composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changed(snapshotState2);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireHybridStringQuestionScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return QuestionnaireHybridStringQuestionScreen.QuestionnaireHybridStringQuestionScreen$lambda$9$lambda$8(onQuestionAnswered, snapshotState, snapshotState2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                Function0 function0 = (Function0) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                UiQuestionContent.HybridContent.Answer answerQuestionnaireHybridStringQuestionScreen$lambda$2 = QuestionnaireHybridStringQuestionScreen$lambda$2(snapshotState);
                boolean z = answerQuestionnaireHybridStringQuestionScreen$lambda$2 == null && !(answerQuestionnaireHybridStringQuestionScreen$lambda$2.isHybridResponse() && ((strQuestionnaireHybridStringQuestionScreen$lambda$6 = QuestionnaireHybridStringQuestionScreen$lambda$6(snapshotState2)) == null || StringsKt.isBlank(strQuestionnaireHybridStringQuestionScreen$lambda$6)));
                Modifier modifier5 = modifier4;
                ConfirmQuestionLayout.ConfirmQuestionLayout(title, subtitle, disclosureMarkdown, strStringResource, function0, z, modifier5, ComposableLambda3.rememberComposableLambda(-511076990, true, new C197833(question, snapshotState, snapshotState2), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 << 12) & 3670016) | 12582912, 0);
                composerStartRestartGroup = composerStartRestartGroup;
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireHybridStringQuestionScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return QuestionnaireHybridStringQuestionScreen.QuestionnaireHybridStringQuestionScreen$lambda$11(question, onQuestionAnswered, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            Object[] objArr3 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            Object[] objArr22 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
            String title2 = question.getTitle();
            String subtitle2 = question.getSubtitle();
            String disclosureMarkdown2 = question.getDisclosureMarkdown();
            String strStringResource2 = StringResources_androidKt.stringResource(C19641R.string.questionnaire_continue_cta, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            zChanged = ((i3 & 112) != 32) | composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changed(snapshotState2);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireHybridStringQuestionScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return QuestionnaireHybridStringQuestionScreen.QuestionnaireHybridStringQuestionScreen$lambda$9$lambda$8(onQuestionAnswered, snapshotState, snapshotState2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                Function0 function02 = (Function0) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                UiQuestionContent.HybridContent.Answer answerQuestionnaireHybridStringQuestionScreen$lambda$22 = QuestionnaireHybridStringQuestionScreen$lambda$2(snapshotState);
                if (answerQuestionnaireHybridStringQuestionScreen$lambda$22 == null) {
                    boolean z2 = answerQuestionnaireHybridStringQuestionScreen$lambda$22 == null && !(answerQuestionnaireHybridStringQuestionScreen$lambda$22.isHybridResponse() && ((strQuestionnaireHybridStringQuestionScreen$lambda$6 = QuestionnaireHybridStringQuestionScreen$lambda$6(snapshotState2)) == null || StringsKt.isBlank(strQuestionnaireHybridStringQuestionScreen$lambda$6)));
                    Modifier modifier52 = modifier4;
                    ConfirmQuestionLayout.ConfirmQuestionLayout(title2, subtitle2, disclosureMarkdown2, strStringResource2, function02, z2, modifier52, ComposableLambda3.rememberComposableLambda(-511076990, true, new C197833(question, snapshotState, snapshotState2), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 << 12) & 3670016) | 12582912, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState QuestionnaireHybridStringQuestionScreen$lambda$1$lambda$0() {
        return SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState QuestionnaireHybridStringQuestionScreen$lambda$5$lambda$4() {
        return SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuestionnaireHybridStringQuestionScreen$lambda$9$lambda$8(Function2 function2, SnapshotState snapshotState, SnapshotState snapshotState2) {
        UiQuestionContent.HybridContent.Answer answerQuestionnaireHybridStringQuestionScreen$lambda$2 = QuestionnaireHybridStringQuestionScreen$lambda$2(snapshotState);
        if (answerQuestionnaireHybridStringQuestionScreen$lambda$2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        function2.invoke(answerQuestionnaireHybridStringQuestionScreen$lambda$2.getId(), QuestionnaireHybridStringQuestionScreen$lambda$6(snapshotState2));
        return Unit.INSTANCE;
    }

    /* compiled from: QuestionnaireHybridStringQuestionScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireHybridStringQuestionScreenKt$QuestionnaireHybridStringQuestionScreen$3 */
    static final class C197833 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ UiQuestionnaireQuestion.HybridQuestion $question;
        final /* synthetic */ SnapshotState<UiQuestionContent.HybridContent.Answer> $selectedAnswer$delegate;
        final /* synthetic */ SnapshotState<String> $stringAnswer$delegate;

        C197833(UiQuestionnaireQuestion.HybridQuestion hybridQuestion, SnapshotState<UiQuestionContent.HybridContent.Answer> snapshotState, SnapshotState<String> snapshotState2) {
            this.$question = hybridQuestion;
            this.$selectedAnswer$delegate = snapshotState;
            this.$stringAnswer$delegate = snapshotState2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(UiQuestionContent.HybridContent.Answer answer, SnapshotState snapshotState, SnapshotState snapshotState2) {
            if (!Intrinsics.areEqual(QuestionnaireHybridStringQuestionScreen.QuestionnaireHybridStringQuestionScreen$lambda$2(snapshotState), answer)) {
                QuestionnaireHybridStringQuestionScreen.QuestionnaireHybridStringQuestionScreen$lambda$3(snapshotState, answer);
                if (!answer.isHybridResponse()) {
                    QuestionnaireHybridStringQuestionScreen.QuestionnaireHybridStringQuestionScreen$lambda$7(snapshotState2, null);
                }
            }
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            Composer composer2 = composer;
            if ((i & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-511076990, i, -1, "com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireHybridStringQuestionScreen.<anonymous> (QuestionnaireHybridStringQuestionScreen.kt:39)");
            }
            for (final UiQuestionContent.HybridContent.Answer answer : this.$question.getContent().getAnswerChoices()) {
                BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(BentoSelectionRowState.Type.RadioButton, answer.getTitle(), Intrinsics.areEqual(QuestionnaireHybridStringQuestionScreen.QuestionnaireHybridStringQuestionScreen$lambda$2(this.$selectedAnswer$delegate), answer), (BentoBaseRowState.Text) new BentoBaseRowState.Text.Plain(answer.getSubtitle()), false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2032, (DefaultConstructorMarker) null);
                composer2.startReplaceGroup(-1746271574);
                boolean zChanged = composer2.changed(this.$selectedAnswer$delegate) | composer2.changedInstance(answer) | composer2.changed(this.$stringAnswer$delegate);
                final SnapshotState<UiQuestionContent.HybridContent.Answer> snapshotState = this.$selectedAnswer$delegate;
                final SnapshotState<String> snapshotState2 = this.$stringAnswer$delegate;
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireHybridStringQuestionScreenKt$QuestionnaireHybridStringQuestionScreen$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return QuestionnaireHybridStringQuestionScreen.C197833.invoke$lambda$1$lambda$0(answer, snapshotState, snapshotState2);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState, (Function0) objRememberedValue, composer2, BentoSelectionRowState.$stable << 3, 1);
                composer2.startReplaceGroup(-1518691443);
                if (answer.isHybridResponse() && Intrinsics.areEqual(QuestionnaireHybridStringQuestionScreen.QuestionnaireHybridStringQuestionScreen$lambda$2(this.$selectedAnswer$delegate), answer)) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(companion, bentoTheme.getSpacing(composer2, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM());
                    String strQuestionnaireHybridStringQuestionScreen$lambda$6 = QuestionnaireHybridStringQuestionScreen.QuestionnaireHybridStringQuestionScreen$lambda$6(this.$stringAnswer$delegate);
                    if (strQuestionnaireHybridStringQuestionScreen$lambda$6 == null) {
                        strQuestionnaireHybridStringQuestionScreen$lambda$6 = "";
                    }
                    String placeholder = this.$question.getContent().getPlaceholder();
                    int maxLength = this.$question.getContent().getMaxLength();
                    composer2.startReplaceGroup(5004770);
                    boolean zChanged2 = composer2.changed(this.$stringAnswer$delegate);
                    final SnapshotState<String> snapshotState3 = this.$stringAnswer$delegate;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireHybridStringQuestionScreenKt$QuestionnaireHybridStringQuestionScreen$3$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return QuestionnaireHybridStringQuestionScreen.C197833.invoke$lambda$3$lambda$2(snapshotState3, (String) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    BentoTextInput4.BentoTextArea(strQuestionnaireHybridStringQuestionScreen$lambda$6, (Function1) objRememberedValue2, modifierM5143paddingVpY3zN4, null, placeholder, null, null, Integer.valueOf(maxLength), null, null, false, false, null, composer2, 0, 0, 8040);
                }
                composer.endReplaceGroup();
                composer2 = composer;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState, String newAnswer) {
            Intrinsics.checkNotNullParameter(newAnswer, "newAnswer");
            QuestionnaireHybridStringQuestionScreen.QuestionnaireHybridStringQuestionScreen$lambda$7(snapshotState, newAnswer);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiQuestionContent.HybridContent.Answer QuestionnaireHybridStringQuestionScreen$lambda$2(SnapshotState<UiQuestionContent.HybridContent.Answer> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String QuestionnaireHybridStringQuestionScreen$lambda$6(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void QuestionnaireHybridStringQuestionScreen$lambda$3(SnapshotState<UiQuestionContent.HybridContent.Answer> snapshotState, UiQuestionContent.HybridContent.Answer answer) {
        snapshotState.setValue(answer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void QuestionnaireHybridStringQuestionScreen$lambda$7(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }
}
