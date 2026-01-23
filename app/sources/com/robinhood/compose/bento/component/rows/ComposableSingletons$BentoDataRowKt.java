package com.robinhood.compose.bento.component.rows;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
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
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoDataRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$BentoDataRowKt {
    public static final ComposableSingletons$BentoDataRowKt INSTANCE = new ComposableSingletons$BentoDataRowKt();
    private static Function2<Composer, Integer, Unit> lambda$968930347 = ComposableLambda3.composableLambdaInstance(968930347, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoDataRowKt$lambda$968930347$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(968930347, i, -1, "com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoDataRowKt.lambda$968930347.<anonymous> (BentoDataRow.kt:266)");
            }
            BentoDataRowKt.PreviewContent(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$675631892 = ComposableLambda3.composableLambdaInstance(675631892, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoDataRowKt$lambda$675631892$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(675631892, i, -1, "com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoDataRowKt.lambda$675631892.<anonymous> (BentoDataRow.kt:268)");
            }
            BentoDataRowKt.PreviewContentCondensed(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$249029105 = ComposableLambda3.composableLambdaInstance(249029105, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoDataRowKt$lambda$249029105$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(249029105, i, -1, "com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoDataRowKt.lambda$249029105.<anonymous> (BentoDataRow.kt:261)");
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
            BentoDataRowKt.PreviewContent(composer, 0);
            float f = 16;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), composer, 6);
            BentoDataRowKt.PreviewContentCondensed(composer, 0);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), composer, 6);
            ComposableSingletons$BentoDataRowKt composableSingletons$BentoDataRowKt = ComposableSingletons$BentoDataRowKt.INSTANCE;
            LocalShowPlaceholder.Loadable(true, null, null, composableSingletons$BentoDataRowKt.getLambda$968930347$lib_compose_bento_externalRelease(), composer, 3078, 6);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), composer, 6);
            LocalShowPlaceholder.Loadable(true, null, null, composableSingletons$BentoDataRowKt.getLambda$675631892$lib_compose_bento_externalRelease(), composer, 3078, 6);
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
    private static Function2<Composer, Integer, Unit> lambda$1489456423 = ComposableLambda3.composableLambdaInstance(1489456423, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoDataRowKt$lambda$1489456423$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1489456423, i, -1, "com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoDataRowKt.lambda$1489456423.<anonymous> (BentoDataRow.kt:282)");
            }
            BentoDataRowKt.PreviewContent(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda$-1197484592, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9338lambda$1197484592 = ComposableLambda3.composableLambdaInstance(-1197484592, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoDataRowKt$lambda$-1197484592$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1197484592, i, -1, "com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoDataRowKt.lambda$-1197484592.<anonymous> (BentoDataRow.kt:284)");
            }
            BentoDataRowKt.PreviewContentCondensed(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1154097517 = ComposableLambda3.composableLambdaInstance(1154097517, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoDataRowKt$lambda$1154097517$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1154097517, i, -1, "com.robinhood.compose.bento.component.rows.ComposableSingletons$BentoDataRowKt.lambda$1154097517.<anonymous> (BentoDataRow.kt:277)");
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
            BentoDataRowKt.PreviewContent(composer, 0);
            float f = 16;
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), composer, 6);
            BentoDataRowKt.PreviewContentCondensed(composer, 0);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), composer, 6);
            ComposableSingletons$BentoDataRowKt composableSingletons$BentoDataRowKt = ComposableSingletons$BentoDataRowKt.INSTANCE;
            LocalShowPlaceholder.Loadable(true, null, null, composableSingletons$BentoDataRowKt.getLambda$1489456423$lib_compose_bento_externalRelease(), composer, 3078, 6);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), composer, 6);
            LocalShowPlaceholder.Loadable(true, null, null, composableSingletons$BentoDataRowKt.m21035getLambda$1197484592$lib_compose_bento_externalRelease(), composer, 3078, 6);
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

    /* renamed from: getLambda$-1197484592$lib_compose_bento_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m21035getLambda$1197484592$lib_compose_bento_externalRelease() {
        return f9338lambda$1197484592;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1154097517$lib_compose_bento_externalRelease() {
        return lambda$1154097517;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1489456423$lib_compose_bento_externalRelease() {
        return lambda$1489456423;
    }

    public final Function2<Composer, Integer, Unit> getLambda$249029105$lib_compose_bento_externalRelease() {
        return lambda$249029105;
    }

    public final Function2<Composer, Integer, Unit> getLambda$675631892$lib_compose_bento_externalRelease() {
        return lambda$675631892;
    }

    public final Function2<Composer, Integer, Unit> getLambda$968930347$lib_compose_bento_externalRelease() {
        return lambda$968930347;
    }
}
