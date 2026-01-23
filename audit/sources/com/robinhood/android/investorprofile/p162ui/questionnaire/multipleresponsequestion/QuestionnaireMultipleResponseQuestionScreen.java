package com.robinhood.android.investorprofile.p162ui.questionnaire.multipleresponsequestion;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.investorprofile.C19641R;
import com.robinhood.android.investorprofile.p162ui.questionnaire.QuestionnaireLoggingInfo;
import com.robinhood.android.investorprofile.p162ui.questionnaire.multipleresponsequestion.QuestionnaireMultipleResponseQuestionScreen;
import com.robinhood.android.investorprofile.question.InvestorProfileComponents3;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.questionnaire.p220ui.UiQuestionContent;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
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
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: QuestionnaireMultipleResponseQuestionScreen.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aE\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u001c\u0010\t\u001a\u0018\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u000b\u0012\u0004\u0012\u00020\u00040\n2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e*\u0016\u0010\u0000\"\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u000f"}, m3636d2 = {"CheckedAnswerIds", "", "Ljava/util/UUID;", "QuestionnaireMultipleResponseQuestionScreen", "", "question", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$MultipleResponseQuestion;", "loggingInfo", "Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;", "onClickCta", "Lkotlin/Function1;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/multipleresponsequestion/CheckedAnswerIds;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$MultipleResponseQuestion;Lcom/robinhood/android/investorprofile/ui/questionnaire/QuestionnaireLoggingInfo;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-investor-profile_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.multipleresponsequestion.QuestionnaireMultipleResponseQuestionScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class QuestionnaireMultipleResponseQuestionScreen {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuestionnaireMultipleResponseQuestionScreen$lambda$0(UiQuestionnaireQuestion.MultipleResponseQuestion multipleResponseQuestion, QuestionnaireLoggingInfo questionnaireLoggingInfo, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        QuestionnaireMultipleResponseQuestionScreen(multipleResponseQuestion, questionnaireLoggingInfo, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void QuestionnaireMultipleResponseQuestionScreen(final UiQuestionnaireQuestion.MultipleResponseQuestion question, final QuestionnaireLoggingInfo loggingInfo, final Function1<? super List<UUID>, Unit> onClickCta, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(loggingInfo, "loggingInfo");
        Intrinsics.checkNotNullParameter(onClickCta, "onClickCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(1282484340);
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
            i3 |= composerStartRestartGroup.changedInstance(loggingInfo) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickCta) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 2048 : 1024;
        }
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1282484340, i3, -1, "com.robinhood.android.investorprofile.ui.questionnaire.multipleresponsequestion.QuestionnaireMultipleResponseQuestionScreen (QuestionnaireMultipleResponseQuestionScreen.kt:47)");
            }
            InvestorProfileComponents3.InvestorProfileQuestionContainer(question, loggingInfo, ComposableLambda3.rememberComposableLambda(-1352426099, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multipleresponsequestion.QuestionnaireMultipleResponseQuestionScreenKt.QuestionnaireMultipleResponseQuestionScreen.1
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
                        ComposerKt.traceEventStart(-1352426099, i5, -1, "com.robinhood.android.investorprofile.ui.questionnaire.multipleresponsequestion.QuestionnaireMultipleResponseQuestionScreen.<anonymous> (QuestionnaireMultipleResponseQuestionScreen.kt:52)");
                    }
                    composer2.startReplaceGroup(1849434622);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateListOf();
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
                    composer2.endReplaceGroup();
                    BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(ModifiersKt.logScreenTransitions$default(modifier, null, 1, null), false, ComposableLambda3.rememberComposableLambda(1428309496, true, new AnonymousClass1(question, onClickCta, snapshotStateList), composer2, 54), ComposableLambda3.rememberComposableLambda(44997541, true, new AnonymousClass2(question, snapshotStateList), composer2, 54), composer2, 3456, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: QuestionnaireMultipleResponseQuestionScreen.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.multipleresponsequestion.QuestionnaireMultipleResponseQuestionScreenKt$QuestionnaireMultipleResponseQuestionScreen$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotStateList<UiQuestionContent.MultipleResponseContent.Answer> $checkedAnswers;
                    final /* synthetic */ Function1<List<UUID>, Unit> $onClickCta;
                    final /* synthetic */ UiQuestionnaireQuestion.MultipleResponseQuestion $question;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(UiQuestionnaireQuestion.MultipleResponseQuestion multipleResponseQuestion, Function1<? super List<UUID>, Unit> function1, SnapshotStateList<UiQuestionContent.MultipleResponseContent.Answer> snapshotStateList) {
                        this.$question = multipleResponseQuestion;
                        this.$onClickCta = function1;
                        this.$checkedAnswers = snapshotStateList;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
                        invoke(bentoButtonBar3, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer, int i) {
                        Composer composer2;
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i & 17) == 16 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1428309496, i, -1, "com.robinhood.android.investorprofile.ui.questionnaire.multipleresponsequestion.QuestionnaireMultipleResponseQuestionScreen.<anonymous>.<anonymous> (QuestionnaireMultipleResponseQuestionScreen.kt:57)");
                        }
                        String disclosureMarkdown = this.$question.getDisclosureMarkdown();
                        composer.startReplaceGroup(-1784107168);
                        if (disclosureMarkdown == null) {
                            composer2 = composer;
                        } else {
                            BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            composer2 = composer;
                            BentoMarkdownText2.BentoMarkdownText(disclosureMarkdown, (Modifier) null, bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i2).getTextS(), 0, 0L, 0L, false, composer, BentoMarkdownText.$stable << 15, 30), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, bentoTheme.getSpacing(composer2, i2).m21593getSmallD9Ej5fM()), composer2, 0);
                            Unit unit = Unit.INSTANCE;
                        }
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChanged = composer2.changed(this.$onClickCta);
                        final Function1<List<UUID>, Unit> function1 = this.$onClickCta;
                        final SnapshotStateList<UiQuestionContent.MultipleResponseContent.Answer> snapshotStateList = this.$checkedAnswers;
                        Object objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multipleresponsequestion.QuestionnaireMultipleResponseQuestionScreenKt$QuestionnaireMultipleResponseQuestionScreen$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return QuestionnaireMultipleResponseQuestionScreen.C198171.AnonymousClass1.invoke$lambda$3$lambda$2(function1, snapshotStateList);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        composer2.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(this.$checkedAnswers.isEmpty() ? C19641R.string.questionnaire_multi_response_none_selected : C11048R.string.general_label_continue, composer2, 0), ModifiersKt.autoLogEvents$default(PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CONTINUE, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null)), false, false, false, true, false, null, 110, null), null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(Function1 function1, SnapshotStateList snapshotStateList) {
                        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(snapshotStateList, 10));
                        Iterator<T> it = snapshotStateList.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((UiQuestionContent.MultipleResponseContent.Answer) it.next()).getId());
                        }
                        function1.invoke(arrayList);
                        return Unit.INSTANCE;
                    }
                }

                /* compiled from: QuestionnaireMultipleResponseQuestionScreen.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.multipleresponsequestion.QuestionnaireMultipleResponseQuestionScreenKt$QuestionnaireMultipleResponseQuestionScreen$1$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function3<BoxScope, Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotStateList<UiQuestionContent.MultipleResponseContent.Answer> $checkedAnswers;
                    final /* synthetic */ UiQuestionnaireQuestion.MultipleResponseQuestion $question;

                    AnonymousClass2(UiQuestionnaireQuestion.MultipleResponseQuestion multipleResponseQuestion, SnapshotStateList<UiQuestionContent.MultipleResponseContent.Answer> snapshotStateList) {
                        this.$question = multipleResponseQuestion;
                        this.$checkedAnswers = snapshotStateList;
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
                            ComposerKt.traceEventStart(44997541, i, -1, "com.robinhood.android.investorprofile.ui.questionnaire.multipleresponsequestion.QuestionnaireMultipleResponseQuestionScreen.<anonymous>.<anonymous> (QuestionnaireMultipleResponseQuestionScreen.kt:94)");
                        }
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer.changedInstance(this.$question);
                        final UiQuestionnaireQuestion.MultipleResponseQuestion multipleResponseQuestion = this.$question;
                        final SnapshotStateList<UiQuestionContent.MultipleResponseContent.Answer> snapshotStateList = this.$checkedAnswers;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multipleresponsequestion.QuestionnaireMultipleResponseQuestionScreenKt$QuestionnaireMultipleResponseQuestionScreen$1$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return QuestionnaireMultipleResponseQuestionScreen.C198171.AnonymousClass2.invoke$lambda$3$lambda$2(multipleResponseQuestion, snapshotStateList, (LazyListScope) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (Function1) objRememberedValue, composer, 0, 511);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(final UiQuestionnaireQuestion.MultipleResponseQuestion multipleResponseQuestion, final SnapshotStateList snapshotStateList, LazyListScope LazyColumn) {
                        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1057139632, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multipleresponsequestion.QuestionnaireMultipleResponseQuestionScreenKt$QuestionnaireMultipleResponseQuestionScreen$1$2$1$1$1
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
                                    ComposerKt.traceEventStart(1057139632, i, -1, "com.robinhood.android.investorprofile.ui.questionnaire.multipleresponsequestion.QuestionnaireMultipleResponseQuestionScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuestionnaireMultipleResponseQuestionScreen.kt:96)");
                                }
                                String title = multipleResponseQuestion.getTitle();
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i2 = BentoTheme.$stable;
                                BentoText2.m20747BentoText38GnDrw(title, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), composer, 0, 0), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall(), composer, 0, 0, 8188);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }), 3, null);
                        if (!StringsKt.isBlank(multipleResponseQuestion.getSubtitle())) {
                            LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(212044917, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multipleresponsequestion.QuestionnaireMultipleResponseQuestionScreenKt$QuestionnaireMultipleResponseQuestionScreen$1$2$1$1$2
                                public final void invoke(LazyItemScope item, Composer composer, int i) {
                                    Intrinsics.checkNotNullParameter(item, "$this$item");
                                    if ((i & 17) == 16 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(212044917, i, -1, "com.robinhood.android.investorprofile.ui.questionnaire.multipleresponsequestion.QuestionnaireMultipleResponseQuestionScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (QuestionnaireMultipleResponseQuestionScreen.kt:109)");
                                    }
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i2 = BentoTheme.$stable;
                                    Modifier modifierM21622defaultHorizontalPaddingWMci_g0 = com.robinhood.compose.bento.util.PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21595getXsmallD9Ej5fM(), composer, 6, 1);
                                    UiQuestionnaireQuestion.MultipleResponseQuestion multipleResponseQuestion2 = multipleResponseQuestion;
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM21622defaultHorizontalPaddingWMci_g0);
                                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                    if (composer.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer.startReusableNode();
                                    if (composer.getInserting()) {
                                        composer.createNode(constructor);
                                    } else {
                                        composer.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    BentoMarkdownText2.BentoMarkdownText(multipleResponseQuestion2.getSubtitle(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, i2).getTextM(), 0, 0L, 0L, false, composer, BentoMarkdownText.$stable << 15, 30), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer, MarkdownStyle.$stable << 6, 26);
                                    composer.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                                    invoke(lazyItemScope, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }), 3, null);
                        }
                        final List<UiQuestionContent.MultipleResponseContent.Answer> answerChoices = multipleResponseQuestion.getContent().getAnswerChoices();
                        final C19813xae6eb482 c19813xae6eb482 = new Function1() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multipleresponsequestion.QuestionnaireMultipleResponseQuestionScreenKt$QuestionnaireMultipleResponseQuestionScreen$1$2$invoke$lambda$3$lambda$2$$inlined$items$default$1
                            @Override // kotlin.jvm.functions.Function1
                            public final Void invoke(UiQuestionContent.MultipleResponseContent.Answer answer) {
                                return null;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke((UiQuestionContent.MultipleResponseContent.Answer) obj);
                            }
                        };
                        LazyColumn.items(answerChoices.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multipleresponsequestion.QuestionnaireMultipleResponseQuestionScreenKt$QuestionnaireMultipleResponseQuestionScreen$1$2$invoke$lambda$3$lambda$2$$inlined$items$default$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                                return invoke(num.intValue());
                            }

                            public final Object invoke(int i) {
                                return c19813xae6eb482.invoke(answerChoices.get(i));
                            }
                        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multipleresponsequestion.QuestionnaireMultipleResponseQuestionScreenKt$QuestionnaireMultipleResponseQuestionScreen$1$2$invoke$lambda$3$lambda$2$$inlined$items$default$4
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
                                if ((i2 & 6) == 0) {
                                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                                final UiQuestionContent.MultipleResponseContent.Answer answer = (UiQuestionContent.MultipleResponseContent.Answer) answerChoices.get(i);
                                composer.startReplaceGroup(-1120058533);
                                BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(BentoSelectionRowState.Type.Checkbox, answer.getTitle(), snapshotStateList.contains(answer), (BentoBaseRowState.Text) new BentoBaseRowState.Text.Plain(answer.getSubtitle()), false, false, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2032, (DefaultConstructorMarker) null);
                                composer.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composer.changedInstance(answer);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    final SnapshotStateList snapshotStateList2 = snapshotStateList;
                                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multipleresponsequestion.QuestionnaireMultipleResponseQuestionScreenKt$QuestionnaireMultipleResponseQuestionScreen$1$2$1$1$3$1$1
                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            if (snapshotStateList2.contains(answer)) {
                                                snapshotStateList2.remove(answer);
                                            } else {
                                                snapshotStateList2.add(answer);
                                            }
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState, (Function0) objRememberedValue, composer, BentoSelectionRowState.$stable << 3, 1);
                                composer.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 112) | (i3 & 14) | 384);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.ui.questionnaire.multipleresponsequestion.QuestionnaireMultipleResponseQuestionScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return QuestionnaireMultipleResponseQuestionScreen.QuestionnaireMultipleResponseQuestionScreen$lambda$0(question, loggingInfo, onClickCta, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
