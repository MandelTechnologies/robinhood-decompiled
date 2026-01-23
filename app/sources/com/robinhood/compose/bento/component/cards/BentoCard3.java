package com.robinhood.compose.bento.component.cards;

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
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.compose.C11917R;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoCard.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.cards.ComposableSingletons$BentoCardKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoCard3 {
    public static final BentoCard3 INSTANCE = new BentoCard3();
    private static Function2<Composer, Integer, Unit> lambda$517990684 = ComposableLambda3.composableLambdaInstance(517990684, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.cards.ComposableSingletons$BentoCardKt$lambda$517990684$1
        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(517990684, i, -1, "com.robinhood.compose.bento.component.cards.ComposableSingletons$BentoCardKt.lambda$517990684.<anonymous> (BentoCard.kt:106)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer, 6).m21590getDefaultD9Ej5fM(), 7, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, 6).m21590getDefaultD9Ej5fM()), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
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
            BentoCard.m20870BentoCardlmFMXvc(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, 6).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), null, "CardButton Title", "Subtitle of Card", SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C11917R.drawable.svg_paycheck_recurring_cash_brokerage), null, null, null, 0, null, composer, 0, 62), null, new CardBadge("Badge", bentoTheme.getColors(composer, 6).m21371getBg0d7_KjU(), bentoTheme.getColors(composer, 6).m21456getPositive0d7_KjU(), null), bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU(), false, composer, 3456, EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE);
            BentoCard.m20870BentoCardlmFMXvc(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, 6).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), null, "CardButton with no badge", "Subtitle of Card", SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C11917R.drawable.svg_paycheck_recurring_cash_brokerage), null, null, null, 0, null, composer, 0, 62), null, null, bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU(), false, composer, 100666752, 98);
            BentoCard.m20870BentoCardlmFMXvc(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, 6).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), null, "CardButton with no subtitle and no badge", null, SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C11917R.drawable.svg_paycheck_recurring_cash_brokerage), null, null, null, 0, null, composer, 0, 62), null, null, bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU(), false, composer, 384, 362);
            BentoCard.m20870BentoCardlmFMXvc(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, 6).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), null, "CardButton with no subtitle, with badge", null, SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C11917R.drawable.svg_paycheck_recurring_cash_brokerage), null, null, null, 0, null, composer, 0, 62), null, new CardBadge("Badge", bentoTheme.getColors(composer, 6).m21371getBg0d7_KjU(), bentoTheme.getColors(composer, 6).m21456getPositive0d7_KjU(), null), bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU(), false, composer, 384, EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE);
            BentoCard.m20870BentoCardlmFMXvc(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, 6).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), null, "CardButton", "This is a very long\nsubtitle\nwith\nmany new\nlines\nfor\ntesting", SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C11917R.drawable.svg_paycheck_recurring_cash_brokerage), null, null, null, 0, null, composer, 0, 62), null, new CardBadge("Badge", bentoTheme.getColors(composer, 6).m21371getBg0d7_KjU(), bentoTheme.getColors(composer, 6).m21456getPositive0d7_KjU(), null), bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU(), false, composer, 3456, EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE);
            BentoCard.m20870BentoCardlmFMXvc(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, 6).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), null, "CardButton", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum", SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(Integer.valueOf(C11917R.drawable.svg_paycheck_recurring_cash_brokerage), null, null, null, 0, null, composer, 0, 62), null, null, bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU(), false, composer, 3456, 354);
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

    public final Function2<Composer, Integer, Unit> getLambda$517990684$lib_compose_bento_externalRelease() {
        return lambda$517990684;
    }
}
