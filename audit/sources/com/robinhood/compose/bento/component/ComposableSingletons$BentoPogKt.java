package com.robinhood.compose.bento.component;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoPog.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ComposableSingletons$BentoPogKt {
    public static final ComposableSingletons$BentoPogKt INSTANCE = new ComposableSingletons$BentoPogKt();

    /* renamed from: lambda$-1657115703, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9326lambda$1657115703 = ComposableLambda3.composableLambdaInstance(-1657115703, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoPogKt$lambda$-1657115703$1
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
                ComposerKt.traceEventStart(-1657115703, i, -1, "com.robinhood.compose.bento.component.ComposableSingletons$BentoPogKt.lambda$-1657115703.<anonymous> (BentoPog.kt:440)");
            }
            BentoPogKt.PreviewTextPogs(true, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$639631493 = ComposableLambda3.composableLambdaInstance(639631493, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoPogKt$lambda$639631493$1
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
                ComposerKt.traceEventStart(639631493, i, -1, "com.robinhood.compose.bento.component.ComposableSingletons$BentoPogKt.lambda$639631493.<anonymous> (BentoPog.kt:454)");
            }
            BentoPogKt.PreviewTextPogs(false, composer, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1954432639 = ComposableLambda3.composableLambdaInstance(1954432639, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoPogKt$lambda$1954432639$1
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
                ComposerKt.traceEventStart(1954432639, i, -1, "com.robinhood.compose.bento.component.ComposableSingletons$BentoPogKt.lambda$1954432639.<anonymous> (BentoPog.kt:467)");
            }
            BentoPogKt.BentoPog(BentoPogKt.getPogLongText(composer, 0), null, composer, 0, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$1416956412 = ComposableLambda3.composableLambdaInstance(1416956412, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoPogKt$lambda$1416956412$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1416956412, i, -1, "com.robinhood.compose.bento.component.ComposableSingletons$BentoPogKt.lambda$1416956412.<anonymous> (BentoPog.kt:474)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(companion, BentoTheme.INSTANCE.getColors(composer, 6).m21371getBg0d7_KjU(), null, 2, null), C2002Dp.m7995constructorimpl(8));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5142padding3ABfNKs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, companion);
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoPogKt.BentoPog(BentoPogKt.getPog(composer, 0), null, composer, 0, 2);
            float f = 16;
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), composer, 6);
            BentoPogKt.BentoPog(BentoPogKt.getPogDisabled(composer, 0), null, composer, 0, 2);
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(32)), composer, 6);
            BentoPogKt.BentoPog(BentoPogKt.getHeroPog(composer, 0), null, composer, 0, 2);
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), composer, 6);
            BentoPogKt.BentoPog(BentoPogKt.getHeroPogDisabled(composer, 0), null, composer, 0, 2);
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
    });
    private static Function2<Composer, Integer, Unit> lambda$674394520 = ComposableLambda3.composableLambdaInstance(674394520, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoPogKt$lambda$674394520$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(674394520, i, -1, "com.robinhood.compose.bento.component.ComposableSingletons$BentoPogKt.lambda$674394520.<anonymous> (BentoPog.kt:509)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 8;
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(Background3.m4872backgroundbw27NRU$default(companion, BentoTheme.INSTANCE.getColors(composer, 6).m21371getBg0d7_KjU(), null, 2, null), C2002Dp.m7995constructorimpl(f));
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5142padding3ABfNKs);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            BentoPogKt.m20683BentoNumberPogxqIIw2o(1, null, true, null, composer, 390, 10);
            float f2 = 4;
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(f2)), composer, 6);
            BentoPogKt.m20683BentoNumberPogxqIIw2o(99, null, true, null, composer, 390, 10);
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(f)), composer, 6);
            BentoPogKt.m20683BentoNumberPogxqIIw2o(1, null, false, null, composer, 390, 10);
            Spacer2.Spacer(SizeKt.m5169size3ABfNKs(companion, C2002Dp.m7995constructorimpl(f2)), composer, 6);
            BentoPogKt.m20683BentoNumberPogxqIIw2o(99, null, false, null, composer, 390, 10);
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
    private static Function2<Composer, Integer, Unit> lambda$268164100 = ComposableLambda3.composableLambdaInstance(268164100, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoPogKt$lambda$268164100$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(268164100, i, -1, "com.robinhood.compose.bento.component.ComposableSingletons$BentoPogKt.lambda$268164100.<anonymous> (BentoPog.kt:547)");
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
            BentoPogKt.PictogramPogs(true, C20690R.drawable.pict_clr_rds_prime_flower, composer, 6);
            BentoPogKt.PictogramPogs(false, C20690R.drawable.pict_clr_rds_prime_flower, composer, 6);
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

    /* renamed from: lambda$-900201184, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9327lambda$900201184 = ComposableLambda3.composableLambdaInstance(-900201184, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoPogKt$lambda$-900201184$1
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
                ComposerKt.traceEventStart(-900201184, i, -1, "com.robinhood.compose.bento.component.ComposableSingletons$BentoPogKt.lambda$-900201184.<anonymous> (BentoPog.kt:671)");
            }
            BentoPogKt.m20684BentoPictogramPogRhg8lNc(C20690R.drawable.pict_mono_rds_robinhood, null, false, null, null, null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer, 6).m21368getAccent0d7_KjU()), composer, 0, 62);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1657115703$lib_compose_bento_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m20793getLambda$1657115703$lib_compose_bento_externalRelease() {
        return f9326lambda$1657115703;
    }

    /* renamed from: getLambda$-900201184$lib_compose_bento_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m20794getLambda$900201184$lib_compose_bento_externalRelease() {
        return f9327lambda$900201184;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1416956412$lib_compose_bento_externalRelease() {
        return lambda$1416956412;
    }

    public final Function2<Composer, Integer, Unit> getLambda$1954432639$lib_compose_bento_externalRelease() {
        return lambda$1954432639;
    }

    public final Function2<Composer, Integer, Unit> getLambda$268164100$lib_compose_bento_externalRelease() {
        return lambda$268164100;
    }

    public final Function2<Composer, Integer, Unit> getLambda$639631493$lib_compose_bento_externalRelease() {
        return lambda$639631493;
    }

    public final Function2<Composer, Integer, Unit> getLambda$674394520$lib_compose_bento_externalRelease() {
        return lambda$674394520;
    }
}
