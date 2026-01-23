package com.robinhood.android.investorprofile.question;

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
import com.robinhood.android.common.C11048R;
import com.robinhood.android.investorprofile.question.FreeFormTextQuestionScreen2;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireQuestion;
import com.robinhood.android.questionnaire.p220ui.QuestionnaireAnswer;
import com.robinhood.android.questionnaire.p220ui.UiQuestionContent;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.singular.sdk.internal.Constants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: FreeFormTextQuestionScreen.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\u001a+\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\r\u0010\t\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u008e\u0002"}, m3636d2 = {"FreeFormTextQuestionScreen", "", "question", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$StringQuestion;", "modifier", "Landroidx/compose/ui/Modifier;", "callbacks", "Lcom/robinhood/android/investorprofile/question/FreeFormTextQuestionCallbacks;", "(Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$StringQuestion;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/investorprofile/question/FreeFormTextQuestionCallbacks;Landroidx/compose/runtime/Composer;II)V", "PreviewFreeFormTextQuestionScreen", "(Landroidx/compose/runtime/Composer;I)V", "feature-investor-profile_externalDebug", "answer", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investorprofile.question.FreeFormTextQuestionScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class FreeFormTextQuestionScreen2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FreeFormTextQuestionScreen$lambda$6(UiQuestionnaireQuestion.StringQuestion stringQuestion, Modifier modifier, FreeFormTextQuestionScreen freeFormTextQuestionScreen, int i, int i2, Composer composer, int i3) {
        FreeFormTextQuestionScreen(stringQuestion, modifier, freeFormTextQuestionScreen, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewFreeFormTextQuestionScreen$lambda$7(int i, Composer composer, int i2) {
        PreviewFreeFormTextQuestionScreen(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FreeFormTextQuestionScreen(final UiQuestionnaireQuestion.StringQuestion question, Modifier modifier, FreeFormTextQuestionScreen freeFormTextQuestionScreen, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean zChanged;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final FreeFormTextQuestionScreen freeFormTextQuestionScreen2 = freeFormTextQuestionScreen;
        Intrinsics.checkNotNullParameter(question, "question");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2114329844);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(question) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(freeFormTextQuestionScreen2) : composerStartRestartGroup.changedInstance(freeFormTextQuestionScreen2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (i4 != 0) {
                    freeFormTextQuestionScreen2 = null;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2114329844, i3, -1, "com.robinhood.android.investorprofile.question.FreeFormTextQuestionScreen (FreeFormTextQuestionScreen.kt:30)");
                }
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.investorprofile.question.FreeFormTextQuestionScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FreeFormTextQuestionScreen2.FreeFormTextQuestionScreen$lambda$1$lambda$0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                String title = question.getTitle();
                String subtitle = question.getSubtitle();
                String disclosureMarkdown = question.getDisclosureMarkdown();
                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composerStartRestartGroup, 0);
                boolean z = (question.isOptional() && StringsKt.isBlank(FreeFormTextQuestionScreen$lambda$2(snapshotState))) ? false : true;
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(question) | ((i3 & 896) != 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(freeFormTextQuestionScreen2)));
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.investorprofile.question.FreeFormTextQuestionScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return FreeFormTextQuestionScreen2.FreeFormTextQuestionScreen$lambda$5$lambda$4(question, freeFormTextQuestionScreen2, snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                ConfirmQuestionLayout.ConfirmQuestionLayout(title, subtitle, disclosureMarkdown, strStringResource, (Function0) objRememberedValue2, z, modifier5, ComposableLambda3.rememberComposableLambda(1857913354, true, new C196542(question, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 << 15) & 3670016) | 12582912, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            final FreeFormTextQuestionScreen freeFormTextQuestionScreen3 = freeFormTextQuestionScreen2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.question.FreeFormTextQuestionScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return FreeFormTextQuestionScreen2.FreeFormTextQuestionScreen$lambda$6(question, modifier3, freeFormTextQuestionScreen3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            String title2 = question.getTitle();
            String subtitle2 = question.getSubtitle();
            String disclosureMarkdown2 = question.getDisclosureMarkdown();
            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composerStartRestartGroup, 0);
            if (question.isOptional()) {
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                if ((i3 & 896) != 256) {
                    zChanged = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(question) | ((i3 & 896) != 256 || ((i3 & 512) != 0 && composerStartRestartGroup.changedInstance(freeFormTextQuestionScreen2)));
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.investorprofile.question.FreeFormTextQuestionScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return FreeFormTextQuestionScreen2.FreeFormTextQuestionScreen$lambda$5$lambda$4(question, freeFormTextQuestionScreen2, snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier52 = modifier4;
                        ConfirmQuestionLayout.ConfirmQuestionLayout(title2, subtitle2, disclosureMarkdown2, strStringResource2, (Function0) objRememberedValue2, z, modifier52, ComposableLambda3.rememberComposableLambda(1857913354, true, new C196542(question, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 << 15) & 3670016) | 12582912, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        final FreeFormTextQuestionScreen freeFormTextQuestionScreen32 = freeFormTextQuestionScreen2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState FreeFormTextQuestionScreen$lambda$1$lambda$0() {
        return SnapshotState3.mutableStateOf$default("", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FreeFormTextQuestionScreen$lambda$5$lambda$4(UiQuestionnaireQuestion.StringQuestion stringQuestion, FreeFormTextQuestionScreen freeFormTextQuestionScreen, SnapshotState snapshotState) {
        String strFreeFormTextQuestionScreen$lambda$2 = FreeFormTextQuestionScreen$lambda$2(snapshotState);
        if ((stringQuestion.isOptional() || !StringsKt.isBlank(strFreeFormTextQuestionScreen$lambda$2)) && freeFormTextQuestionScreen != null) {
            freeFormTextQuestionScreen.onFreeFormTextQuestionAnswered(new QuestionnaireAnswer.StringAnswer(stringQuestion, false, StringsKt.trim(strFreeFormTextQuestionScreen$lambda$2).toString(), 2, null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: FreeFormTextQuestionScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.investorprofile.question.FreeFormTextQuestionScreenKt$FreeFormTextQuestionScreen$2 */
    static final class C196542 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<String> $answer$delegate;
        final /* synthetic */ UiQuestionnaireQuestion.StringQuestion $question;

        C196542(UiQuestionnaireQuestion.StringQuestion stringQuestion, SnapshotState<String> snapshotState) {
            this.$question = stringQuestion;
            this.$answer$delegate = snapshotState;
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
                ComposerKt.traceEventStart(1857913354, i, -1, "com.robinhood.android.investorprofile.question.FreeFormTextQuestionScreen.<anonymous> (FreeFormTextQuestionScreen.kt:52)");
            }
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            String strFreeFormTextQuestionScreen$lambda$2 = FreeFormTextQuestionScreen2.FreeFormTextQuestionScreen$lambda$2(this.$answer$delegate);
            String placeholder = this.$question.getContent().getPlaceholder();
            int maxLength = this.$question.getContent().getMaxLength();
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$answer$delegate);
            final SnapshotState<String> snapshotState = this.$answer$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.investorprofile.question.FreeFormTextQuestionScreenKt$FreeFormTextQuestionScreen$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FreeFormTextQuestionScreen2.C196542.invoke$lambda$1$lambda$0(snapshotState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoTextInput4.BentoTextArea(strFreeFormTextQuestionScreen$lambda$2, (Function1) objRememberedValue, modifierM5144paddingVpY3zN4$default, null, placeholder, null, null, Integer.valueOf(maxLength), null, null, false, false, null, composer, 0, 0, 8040);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, String newAnswer) {
            Intrinsics.checkNotNullParameter(newAnswer, "newAnswer");
            FreeFormTextQuestionScreen2.FreeFormTextQuestionScreen$lambda$3(snapshotState, newAnswer);
            return Unit.INSTANCE;
        }
    }

    private static final void PreviewFreeFormTextQuestionScreen(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1016453101);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1016453101, i, -1, "com.robinhood.android.investorprofile.question.PreviewFreeFormTextQuestionScreen (FreeFormTextQuestionScreen.kt:66)");
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
            final UiQuestionnaireQuestion.StringQuestion stringQuestion = new UiQuestionnaireQuestion.StringQuestion(uuidRandomUUID, Constants.SdidMigrationStatusCodes.SUCCESSFULLY_MIGRATED, "Who let the dogs out?", "Just tell us", null, new UiQuestionContent.StringContent(50, "Who, who, who, who, who?", null), ApiQuestionnaireQuestion.Context.UNKNOWN, true);
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(161770405, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.question.FreeFormTextQuestionScreenKt.PreviewFreeFormTextQuestionScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(161770405, i2, -1, "com.robinhood.android.investorprofile.question.PreviewFreeFormTextQuestionScreen.<anonymous> (FreeFormTextQuestionScreen.kt:82)");
                    }
                    FreeFormTextQuestionScreen2.FreeFormTextQuestionScreen(stringQuestion, null, null, composer2, 0, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.question.FreeFormTextQuestionScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FreeFormTextQuestionScreen2.PreviewFreeFormTextQuestionScreen$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String FreeFormTextQuestionScreen$lambda$2(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FreeFormTextQuestionScreen$lambda$3(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }
}
