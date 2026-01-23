package com.robinhood.compose.bento.component;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SingleLineMiddleEllipsisBentoText.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.ComposableSingletons$SingleLineMiddleEllipsisBentoTextKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class SingleLineMiddleEllipsisBentoText2 {
    public static final SingleLineMiddleEllipsisBentoText2 INSTANCE = new SingleLineMiddleEllipsisBentoText2();

    /* renamed from: lambda$-1984910592, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9332lambda$1984910592 = ComposableLambda3.composableLambdaInstance(-1984910592, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$SingleLineMiddleEllipsisBentoTextKt$lambda$-1984910592$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1984910592, i, -1, "com.robinhood.compose.bento.component.ComposableSingletons$SingleLineMiddleEllipsisBentoTextKt.lambda$-1984910592.<anonymous> (SingleLineMiddleEllipsisBentoText.kt:141)");
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
            SingleLineMiddleEllipsisBentoText4.m20836SingleLineMiddleEllipsisBentoTextxqIIw2o("1 line - Lorem ipsum dolor sit amet, consectetur adipiscing elit Lorem ipsum dolor sit amet, consectetur adipiscing elit", SizeKt.m5174width3ABfNKs(companion, C2002Dp.m7995constructorimpl(120)), null, null, composer, 48, 12);
            SingleLineMiddleEllipsisBentoText4.m20836SingleLineMiddleEllipsisBentoTextxqIIw2o("Short text", null, null, null, composer, 6, 14);
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

    /* renamed from: getLambda$-1984910592$lib_compose_bento_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m20807getLambda$1984910592$lib_compose_bento_externalRelease() {
        return f9332lambda$1984910592;
    }
}
