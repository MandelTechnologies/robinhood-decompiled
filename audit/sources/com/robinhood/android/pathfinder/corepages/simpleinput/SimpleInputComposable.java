package com.robinhood.android.pathfinder.corepages.simpleinput;

import android.net.Uri;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import com.robinhood.android.beneficiaries.p067ui.detail.BeneficiaryDetailCompose2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.BentoRichText;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p355ui.pathfinder.contexts.SimpleInputContext;
import com.robinhood.models.serverdriven.p347db.RichText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SimpleInputComposable.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a1\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00012\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0003¢\u0006\u0002\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0003¢\u0006\u0002\u0010\r\u001a;\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0003¢\u0006\u0002\u0010\u0015\u001a3\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u001aH\u0003¢\u0006\u0002\u0010\u001b\"\u000e\u0010\u001c\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001f\u001a\u00020\bX\u0080T¢\u0006\u0002\n\u0000¨\u0006 ²\u0006\n\u0010!\u001a\u00020\bX\u008a\u008e\u0002"}, m3636d2 = {"SimpleInputComposable", "", "context", "Lcom/robinhood/models/ui/pathfinder/contexts/SimpleInputContext;", "sendingInput", "", "onClickCta", "Lkotlin/Function1;", "", "(Lcom/robinhood/models/ui/pathfinder/contexts/SimpleInputContext;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Heading", "heading", "Lcom/robinhood/models/serverdriven/db/RichText;", "(Lcom/robinhood/models/serverdriven/db/RichText;Landroidx/compose/runtime/Composer;I)V", "Subheading", "subheading", "Input", "value", "placeholder", "error", "onValueChange", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", BeneficiaryDetailCompose2.BENEFICIARY_DETAIL_REMOVE_CTA_BUTTON, "text", "enabled", "onClick", "Lkotlin/Function0;", "(Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", SimpleInputComposable.SimpleInputTestTagInput, SimpleInputComposable.SimpleInputTestTagCta, SimpleInputComposable.SimpleInputTestTagHeading, SimpleInputComposable.SimpleInputTestTagSubheading, "feature-pathfinder-core-pages_externalDebug", "input"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.pathfinder.corepages.simpleinput.SimpleInputComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class SimpleInputComposable {
    public static final String SimpleInputTestTagCta = "SimpleInputTestTagCta";
    public static final String SimpleInputTestTagHeading = "SimpleInputTestTagHeading";
    public static final String SimpleInputTestTagInput = "SimpleInputTestTagInput";
    public static final String SimpleInputTestTagSubheading = "SimpleInputTestTagSubheading";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CtaButton$lambda$14(String str, boolean z, boolean z2, Function0 function0, int i, Composer composer, int i2) {
        CtaButton(str, z, z2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Heading$lambda$10(RichText richText, int i, Composer composer, int i2) {
        Heading(richText, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Input$lambda$13(String str, String str2, String str3, Function1 function1, int i, Composer composer, int i2) {
        Input(str, str2, str3, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimpleInputComposable$lambda$9(SimpleInputContext simpleInputContext, boolean z, Function1 function1, int i, Composer composer, int i2) {
        SimpleInputComposable(simpleInputContext, z, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Subheading$lambda$11(RichText richText, int i, Composer composer, int i2) {
        Subheading(richText, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void SimpleInputComposable(final SimpleInputContext context, final boolean z, final Function1<? super String, Unit> onClickCta, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onClickCta, "onClickCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(839404168);
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
        if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(839404168, i2, -1, "com.robinhood.android.pathfinder.corepages.simpleinput.SimpleInputComposable (SimpleInputComposable.kt:28)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default("", null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierWeight$default = Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getCenter(), companion2.getCenterHorizontally(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Heading(context.getHeading(), composerStartRestartGroup, 0);
            Subheading(context.getSubheading(), composerStartRestartGroup, 0);
            String text = null;
            String strSimpleInputComposable$lambda$8$lambda$1 = SimpleInputComposable$lambda$8$lambda$1(snapshotState);
            String inputPlaceholder = context.getInputPlaceholder();
            RichText error = context.getError();
            if (error != null) {
                text = error.getText();
            }
            String str = text;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion4.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.simpleinput.SimpleInputComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SimpleInputComposable.SimpleInputComposable$lambda$8$lambda$5$lambda$4$lambda$3(context, snapshotState, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            Input(strSimpleInputComposable$lambda$8$lambda$1, inputPlaceholder, str, (Function1) objRememberedValue2, composerStartRestartGroup, 0);
            composerStartRestartGroup.endNode();
            String primaryCta = context.getPrimaryCta();
            boolean z2 = SimpleInputComposable$lambda$8$lambda$1(snapshotState).length() > 0;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z3 = (i2 & 896) == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == companion4.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.pathfinder.corepages.simpleinput.SimpleInputComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return SimpleInputComposable.SimpleInputComposable$lambda$8$lambda$7$lambda$6(onClickCta, snapshotState);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            CtaButton(primaryCta, z2, z, (Function0) objRememberedValue3, composerStartRestartGroup, (i2 << 3) & 896);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.simpleinput.SimpleInputComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SimpleInputComposable.SimpleInputComposable$lambda$9(context, z, onClickCta, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimpleInputComposable$lambda$8$lambda$5$lambda$4$lambda$3(SimpleInputContext simpleInputContext, SnapshotState snapshotState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.length() <= simpleInputContext.getInputCharacterLimit()) {
            snapshotState.setValue(it);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SimpleInputComposable$lambda$8$lambda$7$lambda$6(Function1 function1, SnapshotState snapshotState) {
        function1.invoke(SimpleInputComposable$lambda$8$lambda$1(snapshotState));
        return Unit.INSTANCE;
    }

    private static final void Heading(final RichText richText, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(296839988);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(richText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(296839988, i2, -1, "com.robinhood.android.pathfinder.corepages.simpleinput.Heading (SimpleInputComposable.kt:67)");
            }
            if (richText != null) {
                Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, SimpleInputTestTagHeading);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                BentoRichText.m15948BentoRichText0sCZWFg(richText, PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 7, null), TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), 0L, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) null, composerStartRestartGroup, i2 & 14, 1016);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.simpleinput.SimpleInputComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SimpleInputComposable.Heading$lambda$10(richText, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void Subheading(final RichText richText, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-207096232);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(richText) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-207096232, i2, -1, "com.robinhood.android.pathfinder.corepages.simpleinput.Subheading (SimpleInputComposable.kt:80)");
            }
            if (richText != null) {
                Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, SimpleInputTestTagSubheading);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                BentoRichText.m15948BentoRichText0sCZWFg(richText, PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i3).m21592getMediumD9Ej5fM(), 7, null), TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composerStartRestartGroup, i3).getTextM(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), 0L, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) null, composerStartRestartGroup, i2 & 14, 1016);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.simpleinput.SimpleInputComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SimpleInputComposable.Subheading$lambda$11(richText, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final String SimpleInputComposable$lambda$8$lambda$1(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    private static final void Input(final String str, final String str2, final String str3, final Function1<? super String, Unit> function1, Composer composer, final int i) {
        int i2;
        Function1<? super String, Unit> function12;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(410076929);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function12 = function1;
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
        } else {
            function12 = function1;
        }
        if ((i2 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(410076929, i2, -1, "com.robinhood.android.pathfinder.corepages.simpleinput.Input (SimpleInputComposable.kt:93)");
            }
            composer2 = composerStartRestartGroup;
            BentoTextInput4.BentoTextInput(str, function12, TestTag3.testTag(Modifier.INSTANCE, SimpleInputTestTagInput), null, str2, null, str3 != null ? new BentoTextInput8.Message.Error(str3) : null, null, null, null, null, null, null, false, false, composer2, (i2 & 14) | 384 | ((i2 >> 6) & 112) | ((i2 << 9) & 57344) | (BentoTextInput8.Message.Error.$stable << 18), 0, 32680);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.simpleinput.SimpleInputComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SimpleInputComposable.Input$lambda$13(str, str2, str3, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void CtaButton(final String str, final boolean z, final boolean z2, final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1836248256);
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
                ComposerKt.traceEventStart(-1836248256, i2, -1, "com.robinhood.android.pathfinder.corepages.simpleinput.CtaButton (SimpleInputComposable.kt:105)");
            }
            int i3 = ((i2 >> 9) & 14) | ((i2 << 3) & 112);
            int i4 = i2 << 12;
            composer2 = composerStartRestartGroup;
            BentoButtonKt.m20586BentoButtonEikTQX8(function0, str, PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(TestTag3.testTag(Modifier.INSTANCE, SimpleInputTestTagCta), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null), null, null, z, z2, null, null, null, null, false, null, composer2, i3 | (458752 & i4) | (i4 & 3670016), 0, 8088);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.simpleinput.SimpleInputComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SimpleInputComposable.CtaButton$lambda$14(str, z, z2, function0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
