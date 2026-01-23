package com.robinhood.android.instrumentrow;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
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
import com.robinhood.android.instrumentrow.models.BackgroundColor;
import com.robinhood.android.instrumentrow.models.Text;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InstrumentRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.instrumentrow.ComposableSingletons$InstrumentRowKt$lambda$1286873362$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InstrumentRow4 implements Function2<Composer, Integer, Unit> {
    public static final InstrumentRow4 INSTANCE = new InstrumentRow4();

    InstrumentRow4() {
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1286873362, i, -1, "com.robinhood.android.instrumentrow.ComposableSingletons$InstrumentRowKt.lambda$1286873362.<anonymous> (InstrumentRow.kt:517)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
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
        InstrumentRowState instrumentRowState = new InstrumentRowState(null, null, null, new Text("AAPL", bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null), new Text("Apple Inc.", bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), null), new Text("$150.00", bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null), new Text("149.88%", bentoTheme.getColors(composer, i2).m21456getPositive0d7_KjU(), null), new BackgroundColor(bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), null), null, false, false, 0, false, false, false, Direction.f5855UP, 30983, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.android.instrumentrow.ComposableSingletons$InstrumentRowKt$lambda$1286873362$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        InstrumentRow5.InstrumentRow(null, instrumentRowState, "test-identifier", (Function0) objRememberedValue, composer, 3456, 1);
        Text text = new Text("AAPL", bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null);
        Text text2 = new Text("Apple Inc.", bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), null);
        Text text3 = new Text("$150.00", bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null);
        Text text4 = new Text("149.88%", bentoTheme.getColors(composer, i2).m21452getNegative0d7_KjU(), null);
        BackgroundColor backgroundColor = new BackgroundColor(bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), null);
        Direction direction = Direction.DOWN;
        InstrumentRowState instrumentRowState2 = new InstrumentRowState(null, null, null, text, text2, text3, text4, backgroundColor, null, false, false, 0, false, false, false, direction, 30983, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.instrumentrow.ComposableSingletons$InstrumentRowKt$lambda$1286873362$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        InstrumentRow5.InstrumentRow(null, instrumentRowState2, "test-identifier", (Function0) objRememberedValue2, composer, 3456, 1);
        InstrumentRowState instrumentRowState3 = new InstrumentRowState(null, null, null, new Text("AAPL", bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null), new Text("Apple Inc.", bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), null), new Text("$150.00", bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null), new Text("149.88%", bentoTheme.getColors(composer, i2).m21452getNegative0d7_KjU(), null), new BackgroundColor(bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), null), null, false, true, 0, false, false, false, direction, 30983, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.instrumentrow.ComposableSingletons$InstrumentRowKt$lambda$1286873362$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        InstrumentRow5.InstrumentRow(null, instrumentRowState3, "test-identifier", (Function0) objRememberedValue3, composer, 3456, 1);
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
