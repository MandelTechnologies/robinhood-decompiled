package com.robinhood.compose.bento.component.rows;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoBaseRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$BentoBaseRowKt {
    public static final ComposableSingletons$BentoBaseRowKt INSTANCE = new ComposableSingletons$BentoBaseRowKt();
    private static Function2<Composer, Integer, Unit> lambda$1746772588 = ComposableLambda3.composableLambdaInstance(1746772588, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoBaseRowKt$lambda$1746772588$1
        public final void invoke(Composer composer, int i) {
            Composer composer2 = composer;
            if ((i & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1746772588, i, -1, "com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoBaseRowKt.lambda$1746772588.<anonymous> (BentoBaseRow.kt:1081)");
            }
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer2, 6).m21371getBg0d7_KjU(), null, 2, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            composer2.startReplaceGroup(-1107837554);
            Iterator<T> it = BaseRowPreviewState.INSTANCE.everything(composer2, 6).iterator();
            while (it.hasNext()) {
                BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, (BentoBaseRowState) it.next(), false, false, false, 0L, null, composer2, 0, 125);
                composer2 = composer;
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
    });

    public final Function2<Composer, Integer, Unit> getLambda$1746772588$lib_compose_bento_externalRelease() {
        return lambda$1746772588;
    }
}
