package com.robinhood.android.investorprofile.question;

import android.view.KeyEvent;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.selection.Toggleable2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.Role;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.investorprofile.question.OptionalIntegerQuestionScreen2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.questionnaire.p220ui.OptionalIntegerQuestionAnswer;
import com.robinhood.android.questionnaire.p220ui.UiQuestionContent;
import com.robinhood.android.questionnaire.p220ui.UiQuestionnaireQuestion;
import com.robinhood.compose.bento.component.BentoCheckbox2;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.numpad.BentoNumpad4;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScreenLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.Haptics;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.extensions.KeyEvents2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;
import kotlin.text.StringsKt;

/* compiled from: OptionalIntegerQuestionScreen.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a=\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\r\u001a\u001c\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\n\u0010\u0011\u001a\u00060\u0012j\u0002`\u0013H\u0002\u001aS\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001aA\u0010\u001f\u001a\u00020\u00012\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0002\u0010$\"\u000e\u0010\u001e\u001a\u00020\u000fX\u0080T¢\u0006\u0002\n\u0000¨\u0006%²\u0006\n\u0010&\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010'\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010(\u001a\u00020\u0005X\u008a\u0084\u0002"}, m3636d2 = {"onOptionalIntegerQuestionContinueClicked", "", "content", "Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$OptionalIntegerContent;", "checked", "", "integerValue", "", "actionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "callbacks", "Lcom/robinhood/android/investorprofile/question/OptionalIntegerQuestionCallbacks;", "(Lcom/robinhood/android/questionnaire/ui/UiQuestionContent$OptionalIntegerContent;ZLjava/lang/Integer;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/android/investorprofile/question/OptionalIntegerQuestionCallbacks;)V", "combineKeyEventWithString", "", "string", "event", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "TextInputWithCheckbox", "text", "placeholder", "checkboxText", "onCheckedChange", "Lkotlin/Function1;", "checkboxLoggingIdentifier", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "OptionalIntegerScrollColumnTestTag", "OptionalIntegerQuestionScreen", "question", "Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$OptionalIntegerQuestion;", "existingAnswer", "Lcom/robinhood/android/questionnaire/ui/OptionalIntegerQuestionAnswer;", "(Lcom/robinhood/android/questionnaire/ui/UiQuestionnaireQuestion$OptionalIntegerQuestion;Lcom/robinhood/android/questionnaire/ui/OptionalIntegerQuestionAnswer;Lcom/robinhood/android/investorprofile/question/OptionalIntegerQuestionCallbacks;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Landroidx/compose/runtime/Composer;II)V", "feature-investor-profile_externalDebug", "noneChecked", "textInput", "showFooterDivider"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investorprofile.question.OptionalIntegerQuestionScreenKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class OptionalIntegerQuestionScreen2 {
    public static final String OptionalIntegerScrollColumnTestTag = "optional_integer_scroll_column";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionalIntegerQuestionScreen$lambda$16(UiQuestionnaireQuestion.OptionalIntegerQuestion optionalIntegerQuestion, OptionalIntegerQuestionAnswer optionalIntegerQuestionAnswer, OptionalIntegerQuestionScreen optionalIntegerQuestionScreen, Modifier modifier, SduiActionHandler sduiActionHandler, int i, int i2, Composer composer, int i3) {
        OptionalIntegerQuestionScreen(optionalIntegerQuestion, optionalIntegerQuestionAnswer, optionalIntegerQuestionScreen, modifier, sduiActionHandler, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TextInputWithCheckbox$lambda$4(String str, String str2, String str3, boolean z, Function1 function1, String str4, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TextInputWithCheckbox(str, str2, str3, z, function1, str4, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void onOptionalIntegerQuestionContinueClicked(UiQuestionContent.OptionalIntegerContent content, boolean z, Integer num, SduiActionHandler<? super GenericAction> actionHandler, OptionalIntegerQuestionScreen callbacks) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        int minValue = content.getMinValue();
        int maxValue = content.getMaxValue();
        if (z) {
            callbacks.onOptionalIntegerQuestionAnswered(OptionalIntegerQuestionAnswer.None.INSTANCE);
            return;
        }
        if (num == null) {
            throw new IllegalStateException("Should not call continue clicked when checked is false and integerValue is null");
        }
        if (new PrimitiveRanges2(minValue, maxValue).contains(num.intValue())) {
            callbacks.onOptionalIntegerQuestionAnswered(new OptionalIntegerQuestionAnswer.Integer(num.intValue()));
        } else if (num.intValue() < minValue) {
            GenericActionHandlerKt.handleAlert(actionHandler, content.getBelowMinValueAlert(), GenericAlertMobilePresentationStyle.MODAL);
        } else if (num.intValue() > maxValue) {
            GenericActionHandlerKt.handleAlert(actionHandler, content.getAboveMaxValueAlert(), GenericAlertMobilePresentationStyle.MODAL);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String OptionalIntegerQuestionScreen$lambda$11(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean OptionalIntegerQuestionScreen$lambda$15(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean OptionalIntegerQuestionScreen$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* compiled from: OptionalIntegerQuestionScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.investorprofile.question.OptionalIntegerQuestionScreenKt$OptionalIntegerQuestionScreen$1 */
    static final class C196621 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<Boolean> $noneChecked$delegate;
        final /* synthetic */ UiQuestionnaireQuestion.OptionalIntegerQuestion $question;
        final /* synthetic */ String $renderedValue;
        final /* synthetic */ ScrollState $scrollState;
        final /* synthetic */ SnapshotState4<Boolean> $showFooterDivider$delegate;

        C196621(ScrollState scrollState, UiQuestionnaireQuestion.OptionalIntegerQuestion optionalIntegerQuestion, String str, SnapshotState<Boolean> snapshotState, SnapshotState4<Boolean> snapshotState4) {
            this.$scrollState = scrollState;
            this.$question = optionalIntegerQuestion;
            this.$renderedValue = str;
            this.$noneChecked$delegate = snapshotState;
            this.$showFooterDivider$delegate = snapshotState4;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2137712151, i, -1, "com.robinhood.android.investorprofile.question.OptionalIntegerQuestionScreen.<anonymous> (OptionalIntegerQuestionScreen.kt:197)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            ScrollState scrollState = this.$scrollState;
            UiQuestionnaireQuestion.OptionalIntegerQuestion optionalIntegerQuestion = this.$question;
            String str = this.$renderedValue;
            final SnapshotState<Boolean> snapshotState = this.$noneChecked$delegate;
            SnapshotState4<Boolean> snapshotState4 = this.$showFooterDivider$delegate;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, TestTag3.testTag(companion, OptionalIntegerQuestionScreen2.OptionalIntegerScrollColumnTestTag), 1.0f, false, 2, null), scrollState, false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            InvestorProfileComponents3.InvestorProfileHeader(optionalIntegerQuestion.getTitle(), optionalIntegerQuestion.getSubtitle(), null, composer, 0, 4);
            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer, 0);
            String placeholder = optionalIntegerQuestion.getContent().getPlaceholder();
            String checkboxLabel = optionalIntegerQuestion.getContent().getCheckboxLabel();
            boolean zOptionalIntegerQuestionScreen$lambda$7 = OptionalIntegerQuestionScreen2.OptionalIntegerQuestionScreen$lambda$7(snapshotState);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(snapshotState);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.investorprofile.question.OptionalIntegerQuestionScreenKt$OptionalIntegerQuestionScreen$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionalIntegerQuestionScreen2.C196621.invoke$lambda$3$lambda$2$lambda$1$lambda$0(snapshotState, ((Boolean) obj).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            String checkboxLoggingIdentifier = optionalIntegerQuestion.getContent().getCheckboxLoggingIdentifier();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            OptionalIntegerQuestionScreen2.TextInputWithCheckbox(str, placeholder, checkboxLabel, zOptionalIntegerQuestionScreen$lambda$7, (Function1) objRememberedValue, checkboxLoggingIdentifier, PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM()), composer, 0, 0);
            Spacer2.Spacer(Column5.weight$default(column6, companion, 1.0f, false, 2, null), composer, 0);
            composer.endNode();
            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, Color.m6705copywmQWz5c$default(bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), OptionalIntegerQuestionScreen2.OptionalIntegerQuestionScreen$lambda$15(snapshotState4) ? 1.0f : 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, composer, 0, 5);
            String disclosureMarkdown = optionalIntegerQuestion.getDisclosureMarkdown();
            composer.startReplaceGroup(-1378309853);
            if (disclosureMarkdown != null) {
                InvestorProfileComponents3.InvestorProfileDisclosureMarkdown(disclosureMarkdown, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM(), 5, null), composer, 0, 0);
            }
            composer.endReplaceGroup();
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1$lambda$0(SnapshotState snapshotState, boolean z) {
            OptionalIntegerQuestionScreen2.OptionalIntegerQuestionScreen$lambda$8(snapshotState, z);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String combineKeyEventWithString(String str, KeyEvent keyEvent) {
        if (KeyEvents2.isDelete(keyEvent)) {
            return str.length() == 0 ? str : StringsKt.dropLast(str, 1);
        }
        if (str.length() >= 3 || !KeyEvents2.isDigit(keyEvent)) {
            return str;
        }
        return str + keyEvent.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OptionalIntegerQuestionScreen$lambda$12(SnapshotState<String> snapshotState, String str) {
        snapshotState.setValue(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TextInputWithCheckbox(final String text, final String placeholder, final String checkboxText, final boolean z, final Function1<? super Boolean, Unit> onCheckedChange, final String checkboxLoggingIdentifier, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(checkboxText, "checkboxText");
        Intrinsics.checkNotNullParameter(onCheckedChange, "onCheckedChange");
        Intrinsics.checkNotNullParameter(checkboxLoggingIdentifier, "checkboxLoggingIdentifier");
        Composer composerStartRestartGroup = composer.startRestartGroup(1147206003);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(placeholder) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(checkboxText) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onCheckedChange) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changed(checkboxLoggingIdentifier) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((599187 & i3) != 599186 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1147206003, i3, -1, "com.robinhood.android.investorprofile.question.TextInputWithCheckbox (OptionalIntegerQuestionScreen.kt:116)");
                }
                Arrangement arrangement = Arrangement.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM());
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, companion.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.investorprofile.question.OptionalIntegerQuestionScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return OptionalIntegerQuestionScreen2.TextInputWithCheckbox$lambda$3$lambda$1$lambda$0((String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i6 = i3;
                Modifier modifier5 = modifier4;
                BentoTextInput4.BentoHeroTextInput(text, (Function1) objRememberedValue, null, null, placeholder, null, null, null, null, null, null, null, !z, true, composerStartRestartGroup, (i3 & 14) | 48 | ((i3 << 9) & 57344), 3072, 4076);
                Modifier modifierM5320toggleableXHw0xAI$default = Toggleable2.m5320toggleableXHw0xAI$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.TOGGLE, checkboxLoggingIdentifier, null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null), z, false, Role.m7472boximpl(Role.INSTANCE.m7481getCheckboxo7Vup1c()), onCheckedChange, 2, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), companion.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5320toggleableXHw0xAI$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                int i7 = i6 >> 6;
                BentoCheckbox2.m20599BentoCheckboxSj8uqqQ(null, z, false, null, null, composerStartRestartGroup, (i7 & 112) | 24576, 13);
                BentoText2.m20747BentoText38GnDrw(checkboxText, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, i7 & 14, 0, 8190);
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.question.OptionalIntegerQuestionScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionalIntegerQuestionScreen2.TextInputWithCheckbox$lambda$4(text, placeholder, checkboxText, z, onCheckedChange, checkboxLoggingIdentifier, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        if ((599187 & i3) != 599186) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Arrangement arrangement2 = Arrangement.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21590getDefaultD9Ej5fM());
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, companion3.getCenterHorizontally(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                int i62 = i3;
                Modifier modifier52 = modifier4;
                BentoTextInput4.BentoHeroTextInput(text, (Function1) objRememberedValue, null, null, placeholder, null, null, null, null, null, null, null, !z, true, composerStartRestartGroup, (i3 & 14) | 48 | ((i3 << 9) & 57344), 3072, 4076);
                Modifier modifierM5320toggleableXHw0xAI$default2 = Toggleable2.m5320toggleableXHw0xAI$default(ModifiersKt.autoLogEvents$default(Modifier.INSTANCE, UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.TOGGLE, checkboxLoggingIdentifier, null, 4, null), null, 47, null), true, false, false, true, false, null, 108, null), z, false, Role.m7472boximpl(Role.INSTANCE.m7481getCheckboxo7Vup1c()), onCheckedChange, 2, null);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM()), companion3.getCenterVertically(), composerStartRestartGroup, 48);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5320toggleableXHw0xAI$default2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    int i72 = i62 >> 6;
                    BentoCheckbox2.m20599BentoCheckboxSj8uqqQ(null, z, false, null, null, composerStartRestartGroup, (i72 & 112) | 24576, 13);
                    BentoText2.m20747BentoText38GnDrw(checkboxText, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM(), composerStartRestartGroup, i72 & 14, 0, 8190);
                    composerStartRestartGroup.endNode();
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
    public static final Unit TextInputWithCheckbox$lambda$3$lambda$1$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionalIntegerQuestionScreen(final UiQuestionnaireQuestion.OptionalIntegerQuestion question, final OptionalIntegerQuestionAnswer optionalIntegerQuestionAnswer, final OptionalIntegerQuestionScreen callbacks, Modifier modifier, SduiActionHandler<? super GenericAction> sduiActionHandler, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final SduiActionHandler<? super GenericAction> sduiActionHandler2;
        int i4;
        Modifier modifier3;
        SduiActionHandler<? super GenericAction> sduiActionHandlerCurrentActionHandler;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        Object objRememberedValue3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(1451948716);
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
            i3 |= composerStartRestartGroup.changedInstance(optionalIntegerQuestionAnswer) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    sduiActionHandler2 = sduiActionHandler;
                    int i6 = composerStartRestartGroup.changedInstance(sduiActionHandler2) ? 16384 : 8192;
                    i3 |= i6;
                } else {
                    sduiActionHandler2 = sduiActionHandler;
                }
                i3 |= i6;
            } else {
                sduiActionHandler2 = sduiActionHandler;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 16) == 0) {
                        Modifier modifier5 = modifier4;
                        i4 = i3 & (-57345);
                        modifier3 = modifier5;
                        sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0);
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1451948716, i4, -1, "com.robinhood.android.investorprofile.question.OptionalIntegerQuestionScreen (OptionalIntegerQuestionScreen.kt:170)");
                        }
                        Object[] objArr = {optionalIntegerQuestionAnswer};
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChangedInstance = composerStartRestartGroup.changedInstance(optionalIntegerQuestionAnswer);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.investorprofile.question.OptionalIntegerQuestionScreenKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return OptionalIntegerQuestionScreen2.OptionalIntegerQuestionScreen$lambda$6$lambda$5(optionalIntegerQuestionAnswer);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        SnapshotState snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
                        Object[] objArr2 = {optionalIntegerQuestionAnswer};
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChangedInstance2 = composerStartRestartGroup.changedInstance(optionalIntegerQuestionAnswer) | composerStartRestartGroup.changedInstance(question);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.investorprofile.question.OptionalIntegerQuestionScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return OptionalIntegerQuestionScreen2.OptionalIntegerQuestionScreen$lambda$10$lambda$9(optionalIntegerQuestionAnswer, question);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 6);
                        String noneRenderValue = !OptionalIntegerQuestionScreen$lambda$7(snapshotState) ? question.getContent().getNoneRenderValue() : OptionalIntegerQuestionScreen$lambda$11(snapshotState2);
                        Integer intOrNull = StringsKt.toIntOrNull(OptionalIntegerQuestionScreen$lambda$11(snapshotState2));
                        final ScrollState scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.investorprofile.question.OptionalIntegerQuestionScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Boolean.valueOf(scrollStateRememberScrollState.getCanScrollForward());
                                }
                            });
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier6 = modifier3;
                        String str = noneRenderValue;
                        SduiActionHandler<? super GenericAction> sduiActionHandler3 = sduiActionHandlerCurrentActionHandler;
                        BentoNumpadScreenLayout.BentoNumpadScreenLayout(ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null), ComposableLambda3.rememberComposableLambda(-2137712151, true, new C196621(scrollStateRememberScrollState, question, str, snapshotState, (SnapshotState4) objRememberedValue3), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-346196743, true, new C196632(intOrNull, question, snapshotState, sduiActionHandler3, callbacks, snapshotState2), composerStartRestartGroup, 54), composerStartRestartGroup, 432, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        sduiActionHandler2 = sduiActionHandler3;
                        modifier2 = modifier6;
                    } else {
                        Modifier modifier7 = modifier4;
                        i4 = i3;
                        modifier3 = modifier7;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                }
                sduiActionHandlerCurrentActionHandler = sduiActionHandler2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Object[] objArr3 = {optionalIntegerQuestionAnswer};
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(optionalIntegerQuestionAnswer);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.investorprofile.question.OptionalIntegerQuestionScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return OptionalIntegerQuestionScreen2.OptionalIntegerQuestionScreen$lambda$6$lambda$5(optionalIntegerQuestionAnswer);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    SnapshotState snapshotState3 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
                    Object[] objArr22 = {optionalIntegerQuestionAnswer};
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance2 = composerStartRestartGroup.changedInstance(optionalIntegerQuestionAnswer) | composerStartRestartGroup.changedInstance(question);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.investorprofile.question.OptionalIntegerQuestionScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return OptionalIntegerQuestionScreen2.OptionalIntegerQuestionScreen$lambda$10$lambda$9(optionalIntegerQuestionAnswer, question);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        SnapshotState snapshotState22 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 6);
                        if (!OptionalIntegerQuestionScreen$lambda$7(snapshotState3)) {
                        }
                        Integer intOrNull2 = StringsKt.toIntOrNull(OptionalIntegerQuestionScreen$lambda$11(snapshotState22));
                        final ScrollState scrollStateRememberScrollState2 = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier62 = modifier3;
                        String str2 = noneRenderValue;
                        SduiActionHandler<? super GenericAction> sduiActionHandler32 = sduiActionHandlerCurrentActionHandler;
                        BentoNumpadScreenLayout.BentoNumpadScreenLayout(ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null), ComposableLambda3.rememberComposableLambda(-2137712151, true, new C196621(scrollStateRememberScrollState2, question, str2, snapshotState3, (SnapshotState4) objRememberedValue3), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-346196743, true, new C196632(intOrNull2, question, snapshotState3, sduiActionHandler32, callbacks, snapshotState22), composerStartRestartGroup, 54), composerStartRestartGroup, 432, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        sduiActionHandler2 = sduiActionHandler32;
                        modifier2 = modifier62;
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investorprofile.question.OptionalIntegerQuestionScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionalIntegerQuestionScreen2.OptionalIntegerQuestionScreen$lambda$16(question, optionalIntegerQuestionAnswer, callbacks, modifier2, sduiActionHandler2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i & 24576) != 0) {
        }
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 16) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OptionalIntegerQuestionScreen$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState OptionalIntegerQuestionScreen$lambda$6$lambda$5(OptionalIntegerQuestionAnswer optionalIntegerQuestionAnswer) {
        return SnapshotState3.mutableStateOf$default(Boolean.valueOf(optionalIntegerQuestionAnswer instanceof OptionalIntegerQuestionAnswer.None), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState OptionalIntegerQuestionScreen$lambda$10$lambda$9(OptionalIntegerQuestionAnswer optionalIntegerQuestionAnswer, UiQuestionnaireQuestion.OptionalIntegerQuestion optionalIntegerQuestion) {
        String strValueOf;
        if (optionalIntegerQuestionAnswer instanceof OptionalIntegerQuestionAnswer.Integer) {
            strValueOf = String.valueOf(((OptionalIntegerQuestionAnswer.Integer) optionalIntegerQuestionAnswer).getValue());
        } else {
            strValueOf = optionalIntegerQuestion.getContent().getDefaultValue() != null ? String.valueOf(optionalIntegerQuestion.getContent().getDefaultValue()) : "";
        }
        return SnapshotState3.mutableStateOf$default(strValueOf, null, 2, null);
    }

    /* compiled from: OptionalIntegerQuestionScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.investorprofile.question.OptionalIntegerQuestionScreenKt$OptionalIntegerQuestionScreen$2 */
    static final class C196632 implements Function3<BentoNumpad4, Composer, Integer, Unit> {
        final /* synthetic */ SduiActionHandler<GenericAction> $actionHandler;
        final /* synthetic */ OptionalIntegerQuestionScreen $callbacks;
        final /* synthetic */ Integer $integerValue;
        final /* synthetic */ SnapshotState<Boolean> $noneChecked$delegate;
        final /* synthetic */ UiQuestionnaireQuestion.OptionalIntegerQuestion $question;
        final /* synthetic */ SnapshotState<String> $textInput$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C196632(Integer num, UiQuestionnaireQuestion.OptionalIntegerQuestion optionalIntegerQuestion, SnapshotState<Boolean> snapshotState, SduiActionHandler<? super GenericAction> sduiActionHandler, OptionalIntegerQuestionScreen optionalIntegerQuestionScreen, SnapshotState<String> snapshotState2) {
            this.$integerValue = num;
            this.$question = optionalIntegerQuestion;
            this.$noneChecked$delegate = snapshotState;
            this.$actionHandler = sduiActionHandler;
            this.$callbacks = optionalIntegerQuestionScreen;
            this.$textInput$delegate = snapshotState2;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoNumpad4 bentoNumpad4, Composer composer, Integer num) {
            invoke(bentoNumpad4, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoNumpad4 BentoNumpadScreenLayout, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(BentoNumpadScreenLayout, "$this$BentoNumpadScreenLayout");
            if ((i & 6) == 0) {
                i2 = i | ((i & 8) == 0 ? composer.changed(BentoNumpadScreenLayout) : composer.changedInstance(BentoNumpadScreenLayout) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-346196743, i2, -1, "com.robinhood.android.investorprofile.question.OptionalIntegerQuestionScreen.<anonymous> (OptionalIntegerQuestionScreen.kt:243)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
            boolean z = OptionalIntegerQuestionScreen2.OptionalIntegerQuestionScreen$lambda$7(this.$noneChecked$delegate) || this.$integerValue != null;
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(this.$question) | composer.changed(this.$noneChecked$delegate) | composer.changed(this.$integerValue) | composer.changedInstance(this.$actionHandler) | composer.changedInstance(this.$callbacks);
            final UiQuestionnaireQuestion.OptionalIntegerQuestion optionalIntegerQuestion = this.$question;
            final Integer num = this.$integerValue;
            final SduiActionHandler<GenericAction> sduiActionHandler = this.$actionHandler;
            final OptionalIntegerQuestionScreen optionalIntegerQuestionScreen = this.$callbacks;
            final SnapshotState<Boolean> snapshotState = this.$noneChecked$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Function0 function0 = new Function0() { // from class: com.robinhood.android.investorprofile.question.OptionalIntegerQuestionScreenKt$OptionalIntegerQuestionScreen$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return OptionalIntegerQuestionScreen2.C196632.invoke$lambda$1$lambda$0(optionalIntegerQuestion, num, sduiActionHandler, optionalIntegerQuestionScreen, snapshotState);
                    }
                };
                composer.updateRememberedValue(function0);
                objRememberedValue = function0;
            }
            composer.endReplaceGroup();
            Function0<Unit> function0HapticClick = Haptics.hapticClick((Function0) objRememberedValue, composer, 0);
            composer.startReplaceGroup(5004770);
            boolean zChanged = composer.changed(this.$textInput$delegate);
            final SnapshotState<String> snapshotState2 = this.$textInput$delegate;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.investorprofile.question.OptionalIntegerQuestionScreenKt$OptionalIntegerQuestionScreen$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return OptionalIntegerQuestionScreen2.C196632.invoke$lambda$3$lambda$2(snapshotState2, (KeyEvent) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoNumpadScreenLayout.BentoNumpadWithButton(null, (Function1) objRememberedValue2, strStringResource, function0HapticClick, false, z, false, false, false, false, null, false, composer, 100663296, (BentoNumpad4.$stable << 6) | ((i2 << 6) & 896), 3793);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState, KeyEvent keyEvent) {
            Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
            OptionalIntegerQuestionScreen2.OptionalIntegerQuestionScreen$lambda$12(snapshotState, OptionalIntegerQuestionScreen2.combineKeyEventWithString(OptionalIntegerQuestionScreen2.OptionalIntegerQuestionScreen$lambda$11(snapshotState), keyEvent));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(UiQuestionnaireQuestion.OptionalIntegerQuestion optionalIntegerQuestion, Integer num, SduiActionHandler sduiActionHandler, OptionalIntegerQuestionScreen optionalIntegerQuestionScreen, SnapshotState snapshotState) {
            OptionalIntegerQuestionScreen2.onOptionalIntegerQuestionContinueClicked(optionalIntegerQuestion.getContent(), OptionalIntegerQuestionScreen2.OptionalIntegerQuestionScreen$lambda$7(snapshotState), num, sduiActionHandler, optionalIntegerQuestionScreen);
            return Unit.INSTANCE;
        }
    }
}
