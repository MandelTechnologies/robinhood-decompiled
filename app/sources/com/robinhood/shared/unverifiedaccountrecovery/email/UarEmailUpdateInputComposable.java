package com.robinhood.shared.unverifiedaccountrecovery.email;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.beneficiaries.p067ui.detail.BeneficiaryDetailCompose2;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.Validation;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RichTexts2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.pathfinder.contexts.CtaAction;
import com.robinhood.models.p355ui.pathfinder.contexts.UarEmailUpdateInputContext;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.shared.unverifiedaccountrecovery.C41128R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: UarEmailUpdateInputComposable.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a7\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\n\u001a)\u0010\u000b\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0003¢\u0006\u0002\u0010\u000f\u001a\u0015\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0003¢\u0006\u0002\u0010\u0013\u001a3\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0019H\u0003¢\u0006\u0002\u0010\u001a\u001a3\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0003¢\u0006\u0002\u0010\u001e\u001a\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u00172\u0006\u0010 \u001a\u00020\bH\u0003¢\u0006\u0002\u0010!¨\u0006\"²\u0006\n\u0010 \u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010#\u001a\u00020\u0005X\u008a\u008e\u0002"}, m3636d2 = {"UarEmailUpdateInputComposable", "", "context", "Lcom/robinhood/models/ui/pathfinder/contexts/UarEmailUpdateInputContext;", "sendingInput", "", "onClickCta", "Lkotlin/Function2;", "", "Lcom/robinhood/models/api/pathfinder/contexts/CtaAction;", "(Lcom/robinhood/models/ui/pathfinder/contexts/UarEmailUpdateInputContext;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "ConfirmationDialog", "onPrimaryButtonClick", "Lkotlin/Function0;", "dismissDialog", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "Heading", "heading", "Lcom/robinhood/models/serverdriven/db/RichText;", "(Lcom/robinhood/models/serverdriven/db/RichText;Landroidx/compose/runtime/Composer;I)V", "EmailInput", "text", "message", "Lcom/robinhood/compose/bento/component/BentoTextInputs$Message;", "onValueChange", "Lkotlin/Function1;", "(Ljava/lang/String;Lcom/robinhood/compose/bento/component/BentoTextInputs$Message;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", BeneficiaryDetailCompose2.BENEFICIARY_DETAIL_REMOVE_CTA_BUTTON, "enabled", "onClick", "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "getMessageForTextInput", "textInput", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/bento/component/BentoTextInputs$Message;", "feature-unverified-account-recovery_externalDebug", "showConfirmationDialog"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateInputComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class UarEmailUpdateInputComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ConfirmationDialog$lambda$16(Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        ConfirmationDialog(function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CtaButton$lambda$19(String str, boolean z, boolean z2, Function0 function0, int i, Composer composer, int i2) {
        CtaButton(str, z, z2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailInput$lambda$18(String str, BentoTextInput8.Message message, Function1 function1, int i, Composer composer, int i2) {
        EmailInput(str, message, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Heading$lambda$17(RichText richText, int i, Composer composer, int i2) {
        Heading(richText, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UarEmailUpdateInputComposable$lambda$15(UarEmailUpdateInputContext uarEmailUpdateInputContext, boolean z, Function2 function2, int i, Composer composer, int i2) {
        UarEmailUpdateInputComposable(uarEmailUpdateInputContext, z, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void UarEmailUpdateInputComposable(final UarEmailUpdateInputContext context, final boolean z, final Function2<? super String, ? super CtaAction, Unit> onClickCta, Composer composer, final int i) {
        int i2;
        String str;
        boolean z2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onClickCta, "onClickCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1093851285);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(context) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickCta) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1093851285, i3, -1, "com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateInputComposable (UarEmailUpdateInputComposable.kt:34)");
            }
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
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
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            BentoTextInput8.Message messageForTextInput = getMessageForTextInput(UarEmailUpdateInputComposable$lambda$14$lambda$1(snapshotState), composerStartRestartGroup, 0);
            Heading(context.getHeading(), composerStartRestartGroup, 0);
            String strUarEmailUpdateInputComposable$lambda$14$lambda$1 = UarEmailUpdateInputComposable$lambda$14$lambda$1(snapshotState);
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateInputComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UarEmailUpdateInputComposable.UarEmailUpdateInputComposable$lambda$14$lambda$7$lambda$6(snapshotState, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            EmailInput(strUarEmailUpdateInputComposable$lambda$14$lambda$1, messageForTextInput, (Function1) objRememberedValue3, composerStartRestartGroup, (BentoTextInput8.Message.$stable << 3) | 384);
            String text = context.getPrimaryCta().getText();
            if (messageForTextInput == null) {
                str = text;
                z2 = true;
            } else {
                str = text;
                z2 = false;
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion2.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateInputComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return UarEmailUpdateInputComposable.UarEmailUpdateInputComposable$lambda$14$lambda$9$lambda$8(snapshotState2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            composerStartRestartGroup.endReplaceGroup();
            CtaButton(str, z2, z, (Function0) objRememberedValue4, composerStartRestartGroup, ((i3 << 3) & 896) | 3072);
            composerStartRestartGroup.startReplaceGroup(865346822);
            if (UarEmailUpdateInputComposable$lambda$14$lambda$4(snapshotState2)) {
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(context) | ((i3 & 896) == 256);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue5 == companion2.getEmpty()) {
                    objRememberedValue5 = new Function0() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateInputComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UarEmailUpdateInputComposable.UarEmailUpdateInputComposable$lambda$14$lambda$11$lambda$10(onClickCta, context, snapshotState2, snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Function0 function0 = (Function0) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue6 == companion2.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateInputComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return UarEmailUpdateInputComposable.UarEmailUpdateInputComposable$lambda$14$lambda$13$lambda$12(snapshotState2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                ConfirmationDialog(function0, (Function0) objRememberedValue6, composerStartRestartGroup, 48);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateInputComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UarEmailUpdateInputComposable.UarEmailUpdateInputComposable$lambda$15(context, z, onClickCta, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void UarEmailUpdateInputComposable$lambda$14$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UarEmailUpdateInputComposable$lambda$14$lambda$7$lambda$6(SnapshotState snapshotState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        snapshotState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UarEmailUpdateInputComposable$lambda$14$lambda$9$lambda$8(SnapshotState snapshotState) {
        UarEmailUpdateInputComposable$lambda$14$lambda$5(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UarEmailUpdateInputComposable$lambda$14$lambda$11$lambda$10(Function2 function2, UarEmailUpdateInputContext uarEmailUpdateInputContext, SnapshotState snapshotState, SnapshotState snapshotState2) {
        UarEmailUpdateInputComposable$lambda$14$lambda$5(snapshotState, false);
        function2.invoke(UarEmailUpdateInputComposable$lambda$14$lambda$1(snapshotState2), uarEmailUpdateInputContext.getPrimaryCta().getAction());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UarEmailUpdateInputComposable$lambda$14$lambda$13$lambda$12(SnapshotState snapshotState) {
        UarEmailUpdateInputComposable$lambda$14$lambda$5(snapshotState, false);
        return Unit.INSTANCE;
    }

    private static final void ConfirmationDialog(final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(256598662);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(256598662, i2, -1, "com.robinhood.shared.unverifiedaccountrecovery.email.ConfirmationDialog (UarEmailUpdateInputComposable.kt:71)");
            }
            String strStringResource = StringResources_androidKt.stringResource(C41128R.string.uar_email_update_input_dialog_title, composerStartRestartGroup, 0);
            int i3 = i2;
            BentoAlertDialog2.Body.MarkdownText markdownText = new BentoAlertDialog2.Body.MarkdownText(StringResources_androidKt.stringResource(C41128R.string.uar_email_update_input_dialog_body, composerStartRestartGroup, 0));
            BentoAlertButton bentoAlertButton = new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composerStartRestartGroup, 0), function0);
            BentoAlertButton bentoAlertButton2 = new BentoAlertButton(StringResources_androidKt.stringResource(C11048R.string.general_label_cancel, composerStartRestartGroup, 0), function02);
            int i4 = BentoAlertDialog2.Body.MarkdownText.$stable << 3;
            int i5 = BentoAlertButton.$stable;
            BentoAlertDialog.BentoAlertDialog(strStringResource, markdownText, bentoAlertButton, null, bentoAlertButton2, null, false, null, function02, composerStartRestartGroup, i4 | (i5 << 6) | (i5 << 12) | ((i3 << 21) & 234881024), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateInputComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UarEmailUpdateInputComposable.ConfirmationDialog$lambda$16(function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Heading(final RichText richText, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1333434556);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(richText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1333434556, i2, -1, "com.robinhood.shared.unverifiedaccountrecovery.email.Heading (UarEmailUpdateInputComposable.kt:82)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            BentoText2.m20748BentoTextQnj7Zds(RichTexts2.m15956toAnnotatedStringiJQMabo(richText, 0L, composerStartRestartGroup, i2 & 14, 1), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21596getXxlargeD9Ej5fM(), 7, null), null, null, null, null, null, 0, false, 0, 0, null, null, bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateInputComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UarEmailUpdateInputComposable.Heading$lambda$17(richText, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String UarEmailUpdateInputComposable$lambda$14$lambda$1(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean UarEmailUpdateInputComposable$lambda$14$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final void EmailInput(final String str, final BentoTextInput8.Message message, final Function1<? super String, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1732526404);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(message) : composerStartRestartGroup.changedInstance(message) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1732526404, i2, -1, "com.robinhood.shared.unverifiedaccountrecovery.email.EmailInput (UarEmailUpdateInputComposable.kt:95)");
            }
            BentoTextInput4.BentoTextInput(str, function1, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21594getXlargeD9Ej5fM(), 7, null), null, StringResources_androidKt.stringResource(C41128R.string.uar_email_update_input_placeholder, composerStartRestartGroup, 0), null, message, null, null, null, null, null, null, false, false, composerStartRestartGroup, (i2 & 14) | ((i2 >> 3) & 112) | (BentoTextInput8.Message.$stable << 18) | ((i2 << 15) & 3670016), 0, 32680);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateInputComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UarEmailUpdateInputComposable.EmailInput$lambda$18(str, message, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CtaButton(final String str, final boolean z, final boolean z2, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(297994184);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(297994184, i2, -1, "com.robinhood.shared.unverifiedaccountrecovery.email.CtaButton (UarEmailUpdateInputComposable.kt:111)");
            }
            int i3 = ((i2 >> 9) & 14) | 384 | ((i2 << 3) & 112);
            int i4 = i2 << 12;
            composer2 = composerStartRestartGroup;
            BentoButtonKt.m20586BentoButtonEikTQX8(function0, str, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, z, z2, null, null, null, null, false, null, composer2, i3 | (458752 & i4) | (i4 & 3670016), 0, 8088);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateInputComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UarEmailUpdateInputComposable.CtaButton$lambda$19(str, z, z2, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final BentoTextInput8.Message getMessageForTextInput(String str, Composer composer, int i) {
        BentoTextInput8.Message.Error error;
        composer.startReplaceGroup(1480947720);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1480947720, i, -1, "com.robinhood.shared.unverifiedaccountrecovery.email.getMessageForTextInput (UarEmailUpdateInputComposable.kt:122)");
        }
        if (StringsKt.isBlank(str)) {
            composer.startReplaceGroup(1556589130);
            error = new BentoTextInput8.Message.Error(StringResources_androidKt.stringResource(C41128R.string.uar_email_update_input_error_blank, composer, 0));
            composer.endReplaceGroup();
        } else if (!Validation.INSTANCE.isEmailValid(str)) {
            composer.startReplaceGroup(1556593676);
            error = new BentoTextInput8.Message.Error(StringResources_androidKt.stringResource(C41128R.string.uar_email_update_input_error_invalid, composer, 0));
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1009842069);
            composer.endReplaceGroup();
            error = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return error;
    }
}
