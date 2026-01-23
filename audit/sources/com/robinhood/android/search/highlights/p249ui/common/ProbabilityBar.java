package com.robinhood.android.search.highlights.p249ui.common;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
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
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import com.robinhood.android.search.highlights.model.ProbabilitySegment;
import com.robinhood.android.search.highlights.model.ProbabilitySegments2;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProbabilityBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.search.highlights.ui.common.ComposableSingletons$ProbabilityBarKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ProbabilityBar {
    public static final ProbabilityBar INSTANCE = new ProbabilityBar();

    /* renamed from: lambda$-353355414, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9245lambda$353355414 = ComposableLambda3.composableLambdaInstance(-353355414, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.search.highlights.ui.common.ComposableSingletons$ProbabilityBarKt$lambda$-353355414$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-353355414, i, -1, "com.robinhood.android.search.highlights.ui.common.ComposableSingletons$ProbabilityBarKt.lambda$-353355414.<anonymous> (ProbabilityBar.kt:132)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            float f = 16;
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), C2002Dp.m7995constructorimpl(f));
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(C2002Dp.m7995constructorimpl(f)), Alignment.INSTANCE.getStart(), composer, 6);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            ProbabilityBar3.m18629ProbabilityBarDH4mp8Y(ProbabilitySegments2.applyMinFractionRule$default(CollectionsKt.listOf((Object[]) new ProbabilitySegment[]{new ProbabilitySegment(0.01f, new DayNightColor(bentoTheme.getColors(composer, i2).getHydro(), bentoTheme.getColors(composer, i2).getHydro(), null)), new ProbabilitySegment(0.99f, new DayNightColor(bentoTheme.getColors(composer, i2).getJoule(), bentoTheme.getColors(composer, i2).getJoule(), null))}), 0.0f, 2, null), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, 0.0f, composer, 48, 60);
            ProbabilityBar3.m18629ProbabilityBarDH4mp8Y(ProbabilitySegments2.applyMinFractionRule$default(CollectionsKt.listOf((Object[]) new ProbabilitySegment[]{new ProbabilitySegment(0.99f, new DayNightColor(bentoTheme.getColors(composer, i2).getHydro(), bentoTheme.getColors(composer, i2).getHydro(), null)), new ProbabilitySegment(0.01f, new DayNightColor(bentoTheme.getColors(composer, i2).getJoule(), bentoTheme.getColors(composer, i2).getJoule(), null))}), 0.0f, 2, null), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, 0.0f, composer, 48, 60);
            ProbabilityBar3.m18629ProbabilityBarDH4mp8Y(ProbabilitySegments2.applyMinFractionRule$default(CollectionsKt.listOf((Object[]) new ProbabilitySegment[]{new ProbabilitySegment(0.5f, new DayNightColor(bentoTheme.getColors(composer, i2).getHydro(), bentoTheme.getColors(composer, i2).getHydro(), null)), new ProbabilitySegment(0.5f, new DayNightColor(bentoTheme.getColors(composer, i2).getJoule(), bentoTheme.getColors(composer, i2).getJoule(), null))}), 0.0f, 2, null), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, 0.0f, composer, 48, 60);
            ProbabilityBar3.m18629ProbabilityBarDH4mp8Y(ProbabilitySegments2.applyMinFractionRule$default(CollectionsKt.listOf((Object[]) new ProbabilitySegment[]{new ProbabilitySegment(0.25f, new DayNightColor(bentoTheme.getColors(composer, i2).getHydro(), bentoTheme.getColors(composer, i2).getHydro(), null)), new ProbabilitySegment(0.75f, new DayNightColor(bentoTheme.getColors(composer, i2).getJoule(), bentoTheme.getColors(composer, i2).getJoule(), null))}), 0.0f, 2, null), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, 0.0f, composer, 48, 60);
            ProbabilityBar3.m18629ProbabilityBarDH4mp8Y(ProbabilitySegments2.applyMinFractionRule$default(CollectionsKt.listOf((Object[]) new ProbabilitySegment[]{new ProbabilitySegment(0.33f, new DayNightColor(bentoTheme.getColors(composer, i2).getHydro(), bentoTheme.getColors(composer, i2).getHydro(), null)), new ProbabilitySegment(0.34f, new DayNightColor(bentoTheme.getColors(composer, i2).getJoule(), bentoTheme.getColors(composer, i2).getJoule(), null)), new ProbabilitySegment(0.33f, new DayNightColor(bentoTheme.getColors(composer, i2).getNeon(), bentoTheme.getColors(composer, i2).getNeon(), null))}), 0.0f, 2, null), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, 0.0f, composer, 48, 60);
            ProbabilitySegment probabilitySegment = new ProbabilitySegment(0.4f, new DayNightColor(bentoTheme.getColors(composer, i2).getHydro(), bentoTheme.getColors(composer, i2).getHydro(), null));
            ProbabilitySegment probabilitySegment2 = new ProbabilitySegment(0.3f, new DayNightColor(bentoTheme.getColors(composer, i2).getJoule(), bentoTheme.getColors(composer, i2).getJoule(), null));
            ProbabilitySegment probabilitySegment3 = new ProbabilitySegment(0.2f, new DayNightColor(bentoTheme.getColors(composer, i2).getNeon(), bentoTheme.getColors(composer, i2).getNeon(), null));
            Color.Companion companion3 = Color.INSTANCE;
            ProbabilityBar3.m18629ProbabilityBarDH4mp8Y(ProbabilitySegments2.applyMinFractionRule$default(CollectionsKt.listOf((Object[]) new ProbabilitySegment[]{probabilitySegment, probabilitySegment2, probabilitySegment3, new ProbabilitySegment(0.1f, new DayNightColor(companion3.m6718getCyan0d7_KjU(), companion3.m6718getCyan0d7_KjU(), null))}), 0.0f, 2, null), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, 0.0f, composer, 48, 60);
            ProbabilityBar3.m18629ProbabilityBarDH4mp8Y(ProbabilitySegments2.applyMinFractionRule$default(CollectionsKt.listOf((Object[]) new ProbabilitySegment[]{new ProbabilitySegment(0.5f, new DayNightColor(bentoTheme.getColors(composer, i2).getHydro(), bentoTheme.getColors(composer, i2).getHydro(), null)), new ProbabilitySegment(0.25f, new DayNightColor(bentoTheme.getColors(composer, i2).getJoule(), bentoTheme.getColors(composer, i2).getJoule(), null)), new ProbabilitySegment(0.15f, new DayNightColor(bentoTheme.getColors(composer, i2).getNeon(), bentoTheme.getColors(composer, i2).getNeon(), null)), new ProbabilitySegment(0.08f, new DayNightColor(companion3.m6718getCyan0d7_KjU(), companion3.m6718getCyan0d7_KjU(), null)), new ProbabilitySegment(0.02f, new DayNightColor(companion3.m6723getMagenta0d7_KjU(), companion3.m6723getMagenta0d7_KjU(), null))}), 0.0f, 2, null), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, 0.0f, composer, 48, 60);
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

    /* renamed from: getLambda$-353355414$lib_search_highlights_externalDebug, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m18626getLambda$353355414$lib_search_highlights_externalDebug() {
        return f9245lambda$353355414;
    }
}
