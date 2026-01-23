package com.robinhood.compose.bento.component.rows;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.rows.BentoToggleRowState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoAccordionToggleRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoAccordionToggleRowKt$lambda$486699783$1 */
/* loaded from: classes15.dex */
final class C32629x608baae4 implements Function2<Composer, Integer, Unit> {
    public static final C32629x608baae4 INSTANCE = new C32629x608baae4();

    C32629x608baae4() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$1$lambda$0(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$3$lambda$2(boolean z) {
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(486699783, i, -1, "com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoAccordionToggleRowKt.lambda$486699783.<anonymous> (BentoAccordionToggleRow.kt:70)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        BentoToggleRowState bentoToggleRowState = new BentoToggleRowState(new BentoToggleRowState.Start.Icon(ServerToBentoAssetMapper2.BANKING_16, null, 2, null), "Primary Text", new BentoToggleRowState.Text.Plain("Secondary Text"), true, false, null, "Row toggled off", false, false, false, 800, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoAccordionToggleRowKt$lambda$486699783$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C32629x608baae4.invoke$lambda$16$lambda$1$lambda$0(((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoAccordionToggleRowKt$lambda$486699783$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C32629x608baae4.invoke$lambda$16$lambda$3$lambda$2(((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        ComposableSingletons$BentoAccordionToggleRowKt composableSingletons$BentoAccordionToggleRowKt = ComposableSingletons$BentoAccordionToggleRowKt.INSTANCE;
        BentoAccordionToggleRowKt.BentoAccordionToggleRow(bentoToggleRowState, function1, (Function1) objRememberedValue2, composableSingletons$BentoAccordionToggleRowKt.getLambda$996241531$lib_compose_bento_externalRelease(), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), false, composer, 224688, 0);
        BentoToggleRowState bentoToggleRowState2 = new BentoToggleRowState(null, "Primary Text", new BentoToggleRowState.Text.Plain("Secondary Text"), true, true, null, "Row toggled on", false, false, false, 800, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoAccordionToggleRowKt$lambda$486699783$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C32629x608baae4.invoke$lambda$16$lambda$5$lambda$4(((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function1 function12 = (Function1) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion3.getEmpty()) {
            objRememberedValue4 = new Function1() { // from class: com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoAccordionToggleRowKt$lambda$486699783$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C32629x608baae4.invoke$lambda$16$lambda$7$lambda$6(((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        BentoAccordionToggleRowKt.BentoAccordionToggleRow(bentoToggleRowState2, function12, (Function1) objRememberedValue4, composableSingletons$BentoAccordionToggleRowKt.getLambda$392388964$lib_compose_bento_externalRelease(), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), false, composer, 224688, 0);
        BentoToggleRowState bentoToggleRowState3 = new BentoToggleRowState(null, "Primary Text", new BentoToggleRowState.Text.Plain("Secondary Text"), true, true, null, "Loading", false, false, false, 800, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion3.getEmpty()) {
            objRememberedValue5 = new Function1() { // from class: com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoAccordionToggleRowKt$lambda$486699783$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C32629x608baae4.invoke$lambda$16$lambda$9$lambda$8(((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        Function1 function13 = (Function1) objRememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion3.getEmpty()) {
            objRememberedValue6 = new Function1() { // from class: com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoAccordionToggleRowKt$lambda$486699783$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C32629x608baae4.invoke$lambda$16$lambda$11$lambda$10(((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue6);
        }
        composer.endReplaceGroup();
        BentoAccordionToggleRowKt.BentoAccordionToggleRow(bentoToggleRowState3, function13, (Function1) objRememberedValue6, composableSingletons$BentoAccordionToggleRowKt.getLambda$837926275$lib_compose_bento_externalRelease(), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), false, composer, 224688, 0);
        BentoToggleRowState bentoToggleRowState4 = new BentoToggleRowState(null, "Primary Text", new BentoToggleRowState.Text.Plain("Secondary Text"), false, false, null, "Disabled", false, false, false, 800, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue7 = composer.rememberedValue();
        if (objRememberedValue7 == companion3.getEmpty()) {
            objRememberedValue7 = new Function1() { // from class: com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoAccordionToggleRowKt$lambda$486699783$1$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C32629x608baae4.invoke$lambda$16$lambda$13$lambda$12(((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue7);
        }
        Function1 function14 = (Function1) objRememberedValue7;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == companion3.getEmpty()) {
            objRememberedValue8 = new Function1() { // from class: com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoAccordionToggleRowKt$lambda$486699783$1$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C32629x608baae4.invoke$lambda$16$lambda$15$lambda$14(((Boolean) obj).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue8);
        }
        composer.endReplaceGroup();
        BentoAccordionToggleRowKt.BentoAccordionToggleRow(bentoToggleRowState4, function14, (Function1) objRememberedValue8, composableSingletons$BentoAccordionToggleRowKt.getLambda$1283463586$lib_compose_bento_externalRelease(), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), false, composer, 224688, 0);
        composer.endNode();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$5$lambda$4(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$7$lambda$6(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$9$lambda$8(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$11$lambda$10(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$13$lambda$12(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$15$lambda$14(boolean z) {
        return Unit.INSTANCE;
    }
}
