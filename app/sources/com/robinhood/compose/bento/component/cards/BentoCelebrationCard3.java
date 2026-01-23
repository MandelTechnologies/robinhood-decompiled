package com.robinhood.compose.bento.component.cards;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoCelebrationCard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.cards.ComposableSingletons$BentoCelebrationCardKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoCelebrationCard3 {
    public static final BentoCelebrationCard3 INSTANCE = new BentoCelebrationCard3();
    private static Function2<Composer, Integer, Unit> lambda$909181342 = ComposableLambda3.composableLambdaInstance(909181342, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.cards.ComposableSingletons$BentoCelebrationCardKt$lambda$909181342$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(909181342, i, -1, "com.robinhood.compose.bento.component.cards.ComposableSingletons$BentoCelebrationCardKt.lambda$909181342.<anonymous> (BentoCelebrationCard.kt:156)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoColor bentoColor = BentoColor.INSTANCE;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Background3.m4872backgroundbw27NRU$default(companion, bentoColor.m21318getNightJade0d7_KjU(), null, 2, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(modifierVerticalScroll$default, bentoTheme.getSpacing(composer, 6).m21592getMediumD9Ej5fM());
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, 6).m21590getDefaultD9Ej5fM()), Alignment.INSTANCE.getStart(), composer, 0);
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
            BentoCelebrationCard.m20873BentoCelebrationCardjY6E1Zs(null, "Celebrate good times, come on!", new AnnotatedString("Basic Celebration Card", null, 2, null), null, null, "Primary", "Metadata", null, null, 0L, 0L, composer, 1769904, 0, 1945);
            BentoCelebrationCard.m20873BentoCelebrationCardjY6E1Zs(null, "Celebrate good times, come on!", new AnnotatedString("Celebration Card with Description", null, 2, null), null, null, "Primary", "Metadata", "There's a party going on right here. A celebration to last throughout the years. So bring your good times and your laughter too. We're gonna celebrate your party with you.", null, 0L, 0L, composer, 1769904, 0, 1817);
            BentoCelebrationCard.m20873BentoCelebrationCardjY6E1Zs(null, "Celebrate good times, come on!", new AnnotatedString("Celebration Card with Secondary Row and Description", null, 2, null), null, null, "Primary", "Metadata", "There's a party going on right here. A celebration to last throughout the years. So bring your good times and your laughter too. We're gonna celebrate your party with you.", new SecondaryRow("Secondary", "Secondary Metadata"), 0L, 0L, composer, 1769904, 0, 1561);
            BentoCelebrationCard.m20873BentoCelebrationCardjY6E1Zs(null, "Celebrate good times, come on!", new AnnotatedString("Celebration Card with Custom Branding", null, 2, null), null, null, "Primary", "Metadata", "There's a party going on right here. A celebration to last throughout the years. So bring your good times and your laughter too. We're gonna celebrate your party with you.", new SecondaryRow("Secondary", "Secondary Metadata"), Color2.Color(4294924895L), bentoColor.m21334getNightNova0d7_KjU(), composer, 807076272, 6, 25);
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

    public final Function2<Composer, Integer, Unit> getLambda$909181342$lib_compose_bento_externalRelease() {
        return lambda$909181342;
    }
}
