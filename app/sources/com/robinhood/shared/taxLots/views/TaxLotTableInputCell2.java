package com.robinhood.shared.taxLots.views;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.state.ToggleableState;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.transfers.ach.p265ui.CreateQueuedAchDepositDuxo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TaxLotTableInputCell.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.taxLots.views.ComposableSingletons$TaxLotTableInputCellKt$lambda$-488149893$1, reason: use source file name */
/* loaded from: classes6.dex */
final class TaxLotTableInputCell2 implements Function2<Composer, Integer, Unit> {
    public static final TaxLotTableInputCell2 INSTANCE = new TaxLotTableInputCell2();

    TaxLotTableInputCell2() {
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-488149893, i, -1, "com.robinhood.shared.taxLots.views.ComposableSingletons$TaxLotTableInputCellKt.lambda$-488149893.<anonymous> (TaxLotTableInputCell.kt:194)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
        ToggleableState toggleableState = ToggleableState.Off;
        TaxLotTableInputCellState taxLotTableInputCellState = new TaxLotTableInputCellState("id", "", CreateQueuedAchDepositDuxo.DEFAULT_AMOUNT_HINT_ZERO, toggleableState, false, false, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.shared.taxLots.views.ComposableSingletons$TaxLotTableInputCellKt$lambda$-488149893$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotTableInputCell2.invoke$lambda$16$lambda$1$lambda$0((Unit) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = new Function2() { // from class: com.robinhood.shared.taxLots.views.ComposableSingletons$TaxLotTableInputCellKt$lambda$-488149893$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLotTableInputCell2.invoke$lambda$16$lambda$3$lambda$2((String) obj, ((Boolean) obj2).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        TaxLotTableInputCell3.TaxLotTableInputCell(taxLotTableInputCellState, function1, (Function2) objRememberedValue2, null, composer, 432, 8);
        TaxLotTableInputCellState taxLotTableInputCellState2 = new TaxLotTableInputCellState("id", "1.23", CreateQueuedAchDepositDuxo.DEFAULT_AMOUNT_HINT_ZERO, ToggleableState.Indeterminate, false, false, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.taxLots.views.ComposableSingletons$TaxLotTableInputCellKt$lambda$-488149893$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotTableInputCell2.invoke$lambda$16$lambda$5$lambda$4((Unit) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function1 function12 = (Function1) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion3.getEmpty()) {
            objRememberedValue4 = new Function2() { // from class: com.robinhood.shared.taxLots.views.ComposableSingletons$TaxLotTableInputCellKt$lambda$-488149893$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLotTableInputCell2.invoke$lambda$16$lambda$7$lambda$6((String) obj, ((Boolean) obj2).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        TaxLotTableInputCell3.TaxLotTableInputCell(taxLotTableInputCellState2, function12, (Function2) objRememberedValue4, null, composer, 432, 8);
        TaxLotTableInputCellState taxLotTableInputCellState3 = new TaxLotTableInputCellState("id", "2.34", CreateQueuedAchDepositDuxo.DEFAULT_AMOUNT_HINT_ZERO, ToggleableState.f174On, false, false, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion3.getEmpty()) {
            objRememberedValue5 = new Function1() { // from class: com.robinhood.shared.taxLots.views.ComposableSingletons$TaxLotTableInputCellKt$lambda$-488149893$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotTableInputCell2.invoke$lambda$16$lambda$9$lambda$8((Unit) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        Function1 function13 = (Function1) objRememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion3.getEmpty()) {
            objRememberedValue6 = new Function2() { // from class: com.robinhood.shared.taxLots.views.ComposableSingletons$TaxLotTableInputCellKt$lambda$-488149893$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLotTableInputCell2.invoke$lambda$16$lambda$11$lambda$10((String) obj, ((Boolean) obj2).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue6);
        }
        composer.endReplaceGroup();
        TaxLotTableInputCell3.TaxLotTableInputCell(taxLotTableInputCellState3, function13, (Function2) objRememberedValue6, null, composer, 432, 8);
        TaxLotTableInputCellState taxLotTableInputCellState4 = new TaxLotTableInputCellState("id", "", CreateQueuedAchDepositDuxo.DEFAULT_AMOUNT_HINT_ZERO, toggleableState, false, false, null, false, 224, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue7 = composer.rememberedValue();
        if (objRememberedValue7 == companion3.getEmpty()) {
            objRememberedValue7 = new Function1() { // from class: com.robinhood.shared.taxLots.views.ComposableSingletons$TaxLotTableInputCellKt$lambda$-488149893$1$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TaxLotTableInputCell2.invoke$lambda$16$lambda$13$lambda$12((Unit) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue7);
        }
        Function1 function14 = (Function1) objRememberedValue7;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == companion3.getEmpty()) {
            objRememberedValue8 = new Function2() { // from class: com.robinhood.shared.taxLots.views.ComposableSingletons$TaxLotTableInputCellKt$lambda$-488149893$1$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TaxLotTableInputCell2.invoke$lambda$16$lambda$15$lambda$14((String) obj, ((Boolean) obj2).booleanValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue8);
        }
        composer.endReplaceGroup();
        TaxLotTableInputCell3.TaxLotTableInputCell(taxLotTableInputCellState4, function14, (Function2) objRememberedValue8, null, composer, 432, 8);
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
    public static final Unit invoke$lambda$16$lambda$1$lambda$0(Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$3$lambda$2(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$5$lambda$4(Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$7$lambda$6(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$9$lambda$8(Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$11$lambda$10(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$13$lambda$12(Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$15$lambda$14(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "<unused var>");
        return Unit.INSTANCE;
    }
}
