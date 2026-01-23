package com.robinhood.shared.tradeladder.p398ui.ladder.shared.pill;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.tradeladder.p398ui.ladder.gestures.LadderCustomGestureDetector3;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.LadderState;
import com.robinhood.shared.tradeladder.p398ui.ladder.models.Side;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PillStyle;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AnimatedPendingOrderPillStack.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.ComposableSingletons$AnimatedPendingOrderPillStackKt$lambda$1237057395$1 */
/* loaded from: classes12.dex */
final class C41030xbb7337b7 implements Function2<Composer, Integer, Unit> {
    public static final C41030xbb7337b7 INSTANCE = new C41030xbb7337b7();

    C41030xbb7337b7() {
    }

    private static final LadderState.LadderData.PendingOrderRow.Group invoke$lambda$2(SnapshotState4<LadderState.LadderData.PendingOrderRow.Group> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Integer invoke$lambda$4(SnapshotState<Integer> snapshotState) {
        return snapshotState.getValue();
    }

    private static final LadderCustomGestureDetector3 invoke$lambda$7(SnapshotState<LadderCustomGestureDetector3> snapshotState) {
        return snapshotState.getValue();
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1237057395, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.pill.ComposableSingletons$AnimatedPendingOrderPillStackKt.lambda$1237057395.<anonymous> (AnimatedPendingOrderPillStack.kt:842)");
        }
        final Side side = Side.START;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.ComposableSingletons$AnimatedPendingOrderPillStackKt$lambda$1237057395$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C41030xbb7337b7.invoke$lambda$1$lambda$0(side);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        final SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(objRememberedValue3);
        }
        final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
        composer.endReplaceGroup();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
        Alignment.Companion companion3 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getCenterHorizontally(), composer, 48);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, companion2);
        Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        LadderState.LadderData.PendingOrderRow.Group groupInvoke$lambda$2 = invoke$lambda$2(snapshotState4);
        Integer numInvoke$lambda$4 = invoke$lambda$4(snapshotState);
        LadderCustomGestureDetector3 ladderCustomGestureDetector3Invoke$lambda$7 = invoke$lambda$7(snapshotState2);
        composer.startReplaceGroup(-1746271574);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.pill.ComposableSingletons$AnimatedPendingOrderPillStackKt$lambda$1237057395$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return C41030xbb7337b7.invoke$lambda$12$lambda$11$lambda$10$lambda$9(snapshotState2, snapshotState4, snapshotState);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        AnimatedPendingOrderPillStackKt.AnimatedPendingOrderPillStack(boxScopeInstance, side, groupInvoke$lambda$2, numInvoke$lambda$4, ladderCustomGestureDetector3Invoke$lambda$7, null, (Function0) objRememberedValue4, null, composer, 1572918, 80);
        composer.endNode();
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
    public static final LadderState.LadderData.PendingOrderRow.Group invoke$lambda$1$lambda$0(Side side) {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke("+" + AnimatedPendingOrderPillStackKt.previewTestQuantities.get(0) + " LMT");
        PillStyle.PillVisualState pillVisualState = PillStyle.PillVisualState.OUTLINED;
        LadderState.LadderData.UiPendingOrder uiPendingOrder = new LadderState.LadderData.UiPendingOrder(uuidRandomUUID, 0, side, stringResourceInvoke, false, false, pillVisualState);
        UUID uuidRandomUUID2 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID2, "randomUUID(...)");
        return new LadderState.LadderData.PendingOrderRow.Group(extensions2.persistentListOf(uiPendingOrder, new LadderState.LadderData.UiPendingOrder(uuidRandomUUID2, 0, side, companion.invoke("+" + AnimatedPendingOrderPillStackKt.previewTestQuantities.get(1) + " LMT"), false, false, pillVisualState)), companion.invoke("+" + CollectionsKt.sumOfInt(AnimatedPendingOrderPillStackKt.previewTestQuantities) + " LMT"), companion.invoke(""));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11$lambda$10$lambda$9(SnapshotState snapshotState, SnapshotState4 snapshotState4, SnapshotState snapshotState2) {
        snapshotState.setValue(null);
        snapshotState2.setValue(Integer.valueOf(AnimatedPendingOrderPillStackKt.nextIndex(invoke$lambda$2(snapshotState4).getOrders(), invoke$lambda$4(snapshotState2))));
        return Unit.INSTANCE;
    }
}
