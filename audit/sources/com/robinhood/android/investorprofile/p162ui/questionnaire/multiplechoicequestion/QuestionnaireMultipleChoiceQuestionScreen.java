package com.robinhood.android.investorprofile.p162ui.questionnaire.multiplechoicequestion;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.investorprofile.C19641R;
import com.robinhood.android.investorprofile.p162ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreen;
import com.robinhood.android.investorprofile.question.InvestorProfileComponents3;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.questionnaire.api.ApiQuestionnaireQuestion;
import com.robinhood.android.questionnaire.p220ui.UiQuestionContent;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.extensions.ResourceTypes;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: QuestionnaireMultipleChoiceQuestionScreen.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a3\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u000f\u001a5\u0010\u0010\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\b\b\u0002\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0017\u001a\u0017\u0010\u0018\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u0019¨\u0006\u001a²\u0006\f\u0010\u001b\u001a\u0004\u0018\u00010\u000eX\u008a\u008e\u0002"}, m3636d2 = {"QuestionnaireMultipleChoiceQuestionScreen", "", ResourceTypes.STYLE, "Lcom/robinhood/android/investorprofile/ui/questionnaire/multiplechoicequestion/Style;", "question", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$MultipleChoiceQuestion;", "onQuestionAnswered", "Lkotlin/Function1;", "Ljava/util/UUID;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/investorprofile/ui/questionnaire/multiplechoicequestion/Style;Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$MultipleChoiceQuestion;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Row", "choice", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$MultipleChoiceContent$Answer;", "(Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$MultipleChoiceContent$Answer;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RadioRow", "isSelected", "", "onClick", "Lkotlin/Function0;", "(Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$MultipleChoiceContent$Answer;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PreviewRadioStyle", "(Landroidx/compose/runtime/Composer;I)V", "Preview", "(Lcom/robinhood/android/investorprofile/ui/questionnaire/multiplechoicequestion/Style;Landroidx/compose/runtime/Composer;II)V", "feature-investor-profile_externalDebug", "selectedAnswer"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class QuestionnaireMultipleChoiceQuestionScreen {

    /* compiled from: QuestionnaireMultipleChoiceQuestionScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreenKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QuestionnaireMultipleChoiceQuestionScreen5.values().length];
            try {
                iArr[QuestionnaireMultipleChoiceQuestionScreen5.ROW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QuestionnaireMultipleChoiceQuestionScreen5.RADIO_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$18(QuestionnaireMultipleChoiceQuestionScreen5 questionnaireMultipleChoiceQuestionScreen5, int i, int i2, Composer composer, int i3) {
        Preview(questionnaireMultipleChoiceQuestionScreen5, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewRadioStyle$lambda$17(int i, Composer composer, int i2) {
        PreviewRadioStyle(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuestionnaireMultipleChoiceQuestionScreen$lambda$12(QuestionnaireMultipleChoiceQuestionScreen5 questionnaireMultipleChoiceQuestionScreen5, UiQuestionnaireQuestion.MultipleChoiceQuestion multipleChoiceQuestion, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        QuestionnaireMultipleChoiceQuestionScreen(questionnaireMultipleChoiceQuestionScreen5, multipleChoiceQuestion, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RadioRow$lambda$16(UiQuestionContent.MultipleChoiceContent.Answer answer, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        RadioRow(answer, z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Row$lambda$15(UiQuestionContent.MultipleChoiceContent.Answer answer, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Row(answer, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0233  */
    /* JADX WARN: Type inference failed for: r7v17, types: [int] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void QuestionnaireMultipleChoiceQuestionScreen(final QuestionnaireMultipleChoiceQuestionScreen5 style, final UiQuestionnaireQuestion.MultipleChoiceQuestion question, final Function1<? super UUID, Unit> onQuestionAnswered, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChanged;
        Object objRememberedValue2;
        String disclosureMarkdown;
        boolean z;
        float fM7995constructorimpl;
        Modifier.Companion companion2;
        ?? r7;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(onQuestionAnswered, "onQuestionAnswered");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1285053881);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(style.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(question) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onQuestionAnswered) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1285053881, i3, -1, "com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreen (QuestionnaireMultipleChoiceQuestionScreen.kt:57)");
                }
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return QuestionnaireMultipleChoiceQuestionScreen.QuestionnaireMultipleChoiceQuestionScreen$lambda$1$lambda$0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier4, null, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierLogScreenTransitions$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierWeight$default = Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(question) | ((i3 & 14) != 4);
                int i5 = i3 & 896;
                zChanged = zChangedInstance | (i5 != 256) | composerStartRestartGroup.changed(snapshotState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return QuestionnaireMultipleChoiceQuestionScreen.m2139x8ce2ae3e(question, style, onQuestionAnswered, snapshotState, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                boolean z2 = true;
                LazyDslKt.LazyColumn(modifierWeight$default, null, null, false, null, null, null, false, null, (Function1) objRememberedValue2, composerStartRestartGroup, 0, 510);
                composerStartRestartGroup = composerStartRestartGroup;
                disclosureMarkdown = question.getDisclosureMarkdown();
                composerStartRestartGroup.startReplaceGroup(-2106720246);
                if (disclosureMarkdown != null) {
                    companion2 = companion4;
                    r7 = 0;
                } else {
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    float fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM();
                    composerStartRestartGroup.startReplaceGroup(-2106712664);
                    if (style == QuestionnaireMultipleChoiceQuestionScreen5.ROW) {
                        fM7995constructorimpl = bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM();
                        z = false;
                    } else {
                        if (style != QuestionnaireMultipleChoiceQuestionScreen5.RADIO_BUTTON) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z = false;
                        fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    companion2 = companion4;
                    InvestorProfileComponents3.InvestorProfileDisclosureMarkdown(disclosureMarkdown, PaddingKt.m5146paddingqDBjuR0$default(companion4, 0.0f, fM21590getDefaultD9Ej5fM, 0.0f, fM7995constructorimpl, 5, null), composerStartRestartGroup, z ? 1 : 0, z ? 1 : 0);
                    r7 = z;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-2106705897);
                if (style == QuestionnaireMultipleChoiceQuestionScreen5.RADIO_BUTTON) {
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composerStartRestartGroup, 6, 1);
                    String strStringResource = StringResources_androidKt.stringResource(C19641R.string.questionnaire_continue_cta, composerStartRestartGroup, r7);
                    boolean z3 = QuestionnaireMultipleChoiceQuestionScreen$lambda$2(snapshotState) != null ? true : r7;
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChanged2 = composerStartRestartGroup.changed(snapshotState);
                    if (i5 != 256) {
                        z2 = r7;
                    }
                    boolean z4 = z2 | zChanged2;
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (z4 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreenKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return QuestionnaireMultipleChoiceQuestionScreen.m2138x60d684a9(onQuestionAnswered, snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoButtonBar2.BentoButtonBar(modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, false, null, null, (Function0) objRememberedValue3, strStringResource, false, null, z3, null, null, false, null, false, composerStartRestartGroup, 0, 0, 64318);
                    composerStartRestartGroup = composerStartRestartGroup;
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
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return QuestionnaireMultipleChoiceQuestionScreen.QuestionnaireMultipleChoiceQuestionScreen$lambda$12(style, question, onQuestionAnswered, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
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
            Modifier modifierLogScreenTransitions$default2 = ModifiersKt.logScreenTransitions$default(modifier4, null, 1, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierLogScreenTransitions$default2);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
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
                Modifier.Companion companion42 = Modifier.INSTANCE;
                Modifier modifierWeight$default2 = Column5.weight$default(column62, SizeKt.fillMaxWidth$default(companion42, 0.0f, 1, null), 1.0f, false, 2, null);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(question) | ((i3 & 14) != 4);
                int i52 = i3 & 896;
                zChanged = zChangedInstance2 | (i52 != 256) | composerStartRestartGroup.changed(snapshotState);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return QuestionnaireMultipleChoiceQuestionScreen.m2139x8ce2ae3e(question, style, onQuestionAnswered, snapshotState, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier52 = modifier4;
                    boolean z22 = true;
                    LazyDslKt.LazyColumn(modifierWeight$default2, null, null, false, null, null, null, false, null, (Function1) objRememberedValue2, composerStartRestartGroup, 0, 510);
                    composerStartRestartGroup = composerStartRestartGroup;
                    disclosureMarkdown = question.getDisclosureMarkdown();
                    composerStartRestartGroup.startReplaceGroup(-2106720246);
                    if (disclosureMarkdown != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-2106705897);
                    if (style == QuestionnaireMultipleChoiceQuestionScreen5.RADIO_BUTTON) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
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
    public static final SnapshotState QuestionnaireMultipleChoiceQuestionScreen$lambda$1$lambda$0() {
        return SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QuestionnaireMultipleChoiceQuestionScreen$lambda$11$lambda$7$lambda$6 */
    public static final Unit m2139x8ce2ae3e(final UiQuestionnaireQuestion.MultipleChoiceQuestion multipleChoiceQuestion, final QuestionnaireMultipleChoiceQuestionScreen5 questionnaireMultipleChoiceQuestionScreen5, final Function1 function1, final SnapshotState snapshotState, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1769014308, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreenKt$QuestionnaireMultipleChoiceQuestionScreen$1$1$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1769014308, i, -1, "com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuestionnaireMultipleChoiceQuestionScreen.kt:69)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(multipleChoiceQuestion.getTitle(), com.robinhood.compose.bento.util.PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8188);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        final String subtitle = multipleChoiceQuestion.getSubtitle();
        if (subtitle.length() > 0) {
            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(590505313, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreenKt$QuestionnaireMultipleChoiceQuestionScreen$1$1$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                    invoke(lazyItemScope, composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(LazyItemScope item, Composer composer, int i) {
                    Intrinsics.checkNotNullParameter(item, "$this$item");
                    if ((i & 17) == 16 && composer.getSkipping()) {
                        composer.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(590505313, i, -1, "com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuestionnaireMultipleChoiceQuestionScreen.kt:81)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i2 = BentoTheme.$stable;
                    BentoMarkdownText2.BentoMarkdownText(subtitle, com.robinhood.compose.bento.util.PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 1, null), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i2).getTextM(), 0, 0L, 0L, false, composer, BentoMarkdownText.$stable << 15, 30), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 24);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), 3, null);
        }
        final List<UiQuestionContent.MultipleChoiceContent.Answer> answerChoices = multipleChoiceQuestion.getContent().getAnswerChoices();
        final C19798xfa72f1e8 c19798xfa72f1e8 = new Function1() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreenKt$QuestionnaireMultipleChoiceQuestionScreen$lambda$11$lambda$7$lambda$6$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(UiQuestionContent.MultipleChoiceContent.Answer answer) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((UiQuestionContent.MultipleChoiceContent.Answer) obj);
            }
        };
        LazyColumn.items(answerChoices.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreenKt$QuestionnaireMultipleChoiceQuestionScreen$lambda$11$lambda$7$lambda$6$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c19798xfa72f1e8.invoke(answerChoices.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreenKt$QuestionnaireMultipleChoiceQuestionScreen$lambda$11$lambda$7$lambda$6$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                Composer composer2;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final UiQuestionContent.MultipleChoiceContent.Answer answer = (UiQuestionContent.MultipleChoiceContent.Answer) answerChoices.get(i);
                composer.startReplaceGroup(1027918152);
                int i4 = QuestionnaireMultipleChoiceQuestionScreen.WhenMappings.$EnumSwitchMapping$0[questionnaireMultipleChoiceQuestionScreen5.ordinal()];
                if (i4 == 1) {
                    composer2 = composer;
                    composer2.startReplaceGroup(1141538518);
                    QuestionnaireMultipleChoiceQuestionScreen.Row(answer, function1, null, composer2, 0, 4);
                    composer2.endReplaceGroup();
                } else {
                    if (i4 != 2) {
                        composer.startReplaceGroup(1141537307);
                        composer.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(1141544388);
                    boolean zAreEqual = Intrinsics.areEqual(answer, QuestionnaireMultipleChoiceQuestionScreen.QuestionnaireMultipleChoiceQuestionScreen$lambda$2(snapshotState));
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged = composer.changed(snapshotState) | composer.changedInstance(answer);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        final SnapshotState snapshotState2 = snapshotState;
                        objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreenKt$QuestionnaireMultipleChoiceQuestionScreen$1$1$1$3$1$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                snapshotState2.setValue(answer);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    QuestionnaireMultipleChoiceQuestionScreen.RadioRow(answer, zAreEqual, (Function0) objRememberedValue, null, composer, 0, 8);
                    composer2 = composer;
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiQuestionContent.MultipleChoiceContent.Answer QuestionnaireMultipleChoiceQuestionScreen$lambda$2(SnapshotState<UiQuestionContent.MultipleChoiceContent.Answer> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QuestionnaireMultipleChoiceQuestionScreen$lambda$11$lambda$10$lambda$9 */
    public static final Unit m2138x60d684a9(Function1 function1, SnapshotState snapshotState) {
        UUID id;
        UiQuestionContent.MultipleChoiceContent.Answer answerQuestionnaireMultipleChoiceQuestionScreen$lambda$2 = QuestionnaireMultipleChoiceQuestionScreen$lambda$2(snapshotState);
        if (answerQuestionnaireMultipleChoiceQuestionScreen$lambda$2 != null && (id = answerQuestionnaireMultipleChoiceQuestionScreen$lambda$2.getId()) != null) {
            function1.invoke(id);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Row(final UiQuestionContent.MultipleChoiceContent.Answer answer, final Function1<? super UUID, Unit> function1, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-445929409);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(answer) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) != 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            } else {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-445929409, i3, -1, "com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.Row (QuestionnaireMultipleChoiceQuestionScreen.kt:134)");
                }
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier2, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.ROW, answer.getKey(), null, 4, null), null, 43, null)), true, false, false, true, false, null, 108, null);
                Modifier modifier4 = modifier2;
                String title = answer.getTitle();
                String subtitle = answer.getSubtitle();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(answer);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return QuestionnaireMultipleChoiceQuestionScreen.Row$lambda$14$lambda$13(function1, answer);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default, null, title, subtitle, null, null, null, false, false, false, 0L, (Function0) objRememberedValue, composer2, 0, 0, 2034);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return QuestionnaireMultipleChoiceQuestionScreen.Row$lambda$15(answer, function1, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) != 146) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier2, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.ROW, answer.getKey(), null, 4, null), null, 43, null)), true, false, false, true, false, null, 108, null);
            Modifier modifier42 = modifier2;
            String title2 = answer.getTitle();
            String subtitle2 = answer.getSubtitle();
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            zChangedInstance = ((i3 & 112) != 32) | composerStartRestartGroup.changedInstance(answer);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return QuestionnaireMultipleChoiceQuestionScreen.Row$lambda$14$lambda$13(function1, answer);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default2, null, title2, subtitle2, null, null, null, false, false, false, 0L, (Function0) objRememberedValue, composer2, 0, 0, 2034);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Row$lambda$14$lambda$13(Function1 function1, UiQuestionContent.MultipleChoiceContent.Answer answer) {
        function1.invoke(answer.getId());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RadioRow(UiQuestionContent.MultipleChoiceContent.Answer answer, final boolean z, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        final UiQuestionContent.MultipleChoiceContent.Answer answer2;
        int i3;
        boolean z2;
        Function0<Unit> function02;
        int i4;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-81410535);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            answer2 = answer;
        } else if ((i & 6) == 0) {
            answer2 = answer;
            i3 = (composerStartRestartGroup.changedInstance(answer2) ? 4 : 2) | i;
        } else {
            answer2 = answer;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-81410535, i3, -1, "com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.RadioRow (QuestionnaireMultipleChoiceQuestionScreen.kt:161)");
                    }
                    modifier3 = modifier4;
                    BentoSelectionRow2.BentoSelectionRow(ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.SELECT, null, new Component(Component.ComponentType.RADIO_BUTTON, answer2.getKey(), null, 4, null), null, 43, null)), true, false, false, true, false, null, 108, null), new BentoSelectionRowState(BentoSelectionRowState.Type.RadioButton, answer2.getTitle(), z2, (BentoBaseRowState.Text) new BentoBaseRowState.Text.Plain(answer2.getSubtitle()), false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2032, (DefaultConstructorMarker) null), function02, composerStartRestartGroup, (BentoSelectionRowState.$stable << 3) | (i3 & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return QuestionnaireMultipleChoiceQuestionScreen.RadioRow$lambda$16(answer2, z, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            modifier2 = modifier;
            if ((i3 & 1171) != 1170) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier4;
                BentoSelectionRow2.BentoSelectionRow(ModifiersKt.autoLogEvents$default(modifier4, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.SELECT, null, new Component(Component.ComponentType.RADIO_BUTTON, answer2.getKey(), null, 4, null), null, 43, null)), true, false, false, true, false, null, 108, null), new BentoSelectionRowState(BentoSelectionRowState.Type.RadioButton, answer2.getTitle(), z2, (BentoBaseRowState.Text) new BentoBaseRowState.Text.Plain(answer2.getSubtitle()), false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2032, (DefaultConstructorMarker) null), function02, composerStartRestartGroup, (BentoSelectionRowState.$stable << 3) | (i3 & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        function02 = function0;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void PreviewRadioStyle(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1323898909);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1323898909, i, -1, "com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.PreviewRadioStyle (QuestionnaireMultipleChoiceQuestionScreen.kt:188)");
            }
            Preview(QuestionnaireMultipleChoiceQuestionScreen5.RADIO_BUTTON, composerStartRestartGroup, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuestionnaireMultipleChoiceQuestionScreen.PreviewRadioStyle$lambda$17(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Preview(QuestionnaireMultipleChoiceQuestionScreen5 questionnaireMultipleChoiceQuestionScreen5, Composer composer, final int i, final int i2) {
        int i3;
        final QuestionnaireMultipleChoiceQuestionScreen5 questionnaireMultipleChoiceQuestionScreen52;
        Composer composerStartRestartGroup = composer.startRestartGroup(1366895288);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(questionnaireMultipleChoiceQuestionScreen5 == null ? -1 : questionnaireMultipleChoiceQuestionScreen5.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            questionnaireMultipleChoiceQuestionScreen52 = i4 != 0 ? QuestionnaireMultipleChoiceQuestionScreen5.ROW : questionnaireMultipleChoiceQuestionScreen5;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1366895288, i3, -1, "com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.Preview (QuestionnaireMultipleChoiceQuestionScreen.kt:194)");
            }
            BentoTheme2.BentoTheme(Boolean.FALSE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-820398592, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreenKt.Preview.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-820398592, i5, -1, "com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.Preview.<anonymous> (QuestionnaireMultipleChoiceQuestionScreen.kt:196)");
                    }
                    CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{InspectionMode.getLocalInspectionMode().provides(Boolean.TRUE), AutoLoggingCompositionLocals.getLocalEventLogger().provides(EventLogger.Noop.INSTANCE)}, ComposableLambda3.rememberComposableLambda(582121792, true, new AnonymousClass1(questionnaireMultipleChoiceQuestionScreen52), composer2, 54), composer2, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: QuestionnaireMultipleChoiceQuestionScreen.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreenKt$Preview$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ QuestionnaireMultipleChoiceQuestionScreen5 $style;

                    AnonymousClass1(QuestionnaireMultipleChoiceQuestionScreen5 questionnaireMultipleChoiceQuestionScreen5) {
                        this.$style = questionnaireMultipleChoiceQuestionScreen5;
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
                            ComposerKt.traceEventStart(582121792, i, -1, "com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.Preview.<anonymous>.<anonymous> (QuestionnaireMultipleChoiceQuestionScreen.kt:200)");
                        }
                        QuestionnaireMultipleChoiceQuestionScreen5 questionnaireMultipleChoiceQuestionScreen5 = this.$style;
                        UUID uuidRandomUUID = UUID.randomUUID();
                        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
                        UUID uuidRandomUUID2 = UUID.randomUUID();
                        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID2, "randomUUID(...)");
                        UiQuestionContent.MultipleChoiceContent.Answer answer = new UiQuestionContent.MultipleChoiceContent.Answer(uuidRandomUUID2, "At $50", "", "key", null);
                        UUID uuidRandomUUID3 = UUID.randomUUID();
                        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID3, "randomUUID(...)");
                        UiQuestionContent.MultipleChoiceContent.Answer answer2 = new UiQuestionContent.MultipleChoiceContent.Answer(uuidRandomUUID3, "Until it reaches past $100", "", "key", null);
                        UUID uuidRandomUUID4 = UUID.randomUUID();
                        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID4, "randomUUID(...)");
                        UiQuestionnaireQuestion.MultipleChoiceQuestion multipleChoiceQuestion = new UiQuestionnaireQuestion.MultipleChoiceQuestion(uuidRandomUUID, "key", "How long will you hold HOOD until?", "Are you a long-term investor or a trader?", "Disclosure: Holding hood may give you gains but can you handle the pain?", new UiQuestionContent.MultipleChoiceContent(CollectionsKt.listOf((Object[]) new UiQuestionContent.MultipleChoiceContent.Answer[]{answer, answer2, new UiQuestionContent.MultipleChoiceContent.Answer(uuidRandomUUID4, "To the moon and back", "aka hold it forever", "key", null)})), ApiQuestionnaireQuestion.Context.UNKNOWN);
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreenKt$Preview$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return QuestionnaireMultipleChoiceQuestionScreen.C198021.AnonymousClass1.invoke$lambda$1$lambda$0((UUID) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        QuestionnaireMultipleChoiceQuestionScreen.QuestionnaireMultipleChoiceQuestionScreen(questionnaireMultipleChoiceQuestionScreen5, multipleChoiceQuestion, (Function1) objRememberedValue, null, composer, 384, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(UUID it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            questionnaireMultipleChoiceQuestionScreen52 = questionnaireMultipleChoiceQuestionScreen5;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multiplechoicequestion.QuestionnaireMultipleChoiceQuestionScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuestionnaireMultipleChoiceQuestionScreen.Preview$lambda$18(questionnaireMultipleChoiceQuestionScreen52, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
