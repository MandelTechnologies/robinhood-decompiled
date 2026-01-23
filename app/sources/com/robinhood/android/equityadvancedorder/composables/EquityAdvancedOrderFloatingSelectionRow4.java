package com.robinhood.android.equityadvancedorder.composables;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
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
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquityAdvancedOrderFloatingSelectionRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityadvancedorder.composables.ComposableSingletons$EquityAdvancedOrderFloatingSelectionRowKt$lambda$931286178$1, reason: use source file name */
/* loaded from: classes3.dex */
final class EquityAdvancedOrderFloatingSelectionRow4 implements Function2<Composer, Integer, Unit> {
    public static final EquityAdvancedOrderFloatingSelectionRow4 INSTANCE = new EquityAdvancedOrderFloatingSelectionRow4();

    EquityAdvancedOrderFloatingSelectionRow4() {
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(931286178, i, -1, "com.robinhood.android.equityadvancedorder.composables.ComposableSingletons$EquityAdvancedOrderFloatingSelectionRowKt.lambda$931286178.<anonymous> (EquityAdvancedOrderFloatingSelectionRow.kt:262)");
        }
        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        StringResource.Companion companion2 = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion2.invoke("Order Type");
        StringResource stringResourceInvoke2 = companion2.invoke("Market");
        OrderForm6 orderForm6 = OrderForm6.EDITING;
        StringResource stringResourceInvoke3 = companion2.invoke("Market");
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.equityadvancedorder.composables.ComposableSingletons$EquityAdvancedOrderFloatingSelectionRowKt$lambda$931286178$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        EquityOrderFormRowState.FloatingSelection.SelectionItem.Checkable checkable = new EquityOrderFormRowState.FloatingSelection.SelectionItem.Checkable(stringResourceInvoke3, true, (Function0) objRememberedValue);
        StringResource stringResourceInvoke4 = companion2.invoke("Limit");
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equityadvancedorder.composables.ComposableSingletons$EquityAdvancedOrderFloatingSelectionRowKt$lambda$931286178$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        EquityOrderFormRowState.FloatingSelection.SelectionItem.Checkable checkable2 = new EquityOrderFormRowState.FloatingSelection.SelectionItem.Checkable(stringResourceInvoke4, false, (Function0) objRememberedValue2);
        StringResource stringResourceInvoke5 = companion2.invoke("Custom");
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equityadvancedorder.composables.ComposableSingletons$EquityAdvancedOrderFloatingSelectionRowKt$lambda$931286178$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        EquityAdvancedOrderFloatingSelectionRow5.EquityAdvancedOrderFloatingSelectionRow(new EquityOrderFormRowState.FloatingSelection(EquityOrderFormRowState2.SelectionRowTestTag, stringResourceInvoke, true, null, orderForm6, stringResourceInvoke2, CollectionsKt.listOf((Object[]) new EquityOrderFormRowState.FloatingSelection.SelectionItem[]{checkable, checkable2, new EquityOrderFormRowState.FloatingSelection.SelectionItem.MoreOptions(stringResourceInvoke5, (Function0) objRememberedValue3)})), null, null, false, composer, 0, 14);
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
}
