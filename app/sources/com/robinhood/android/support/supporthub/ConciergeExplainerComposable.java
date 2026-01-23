package com.robinhood.android.support.supporthub;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.support.C39996R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConciergeExplainerComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.supporthub.ComposableSingletons$ConciergeExplainerComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class ConciergeExplainerComposable {
    public static final ConciergeExplainerComposable INSTANCE = new ConciergeExplainerComposable();

    /* renamed from: lambda$-1801152882, reason: not valid java name */
    private static Function2<Composer, Integer, Unit> f9253lambda$1801152882 = ComposableLambda3.composableLambdaInstance(-1801152882, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ComposableSingletons$ConciergeExplainerComposableKt$lambda$-1801152882$1
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
                ComposerKt.traceEventStart(-1801152882, i, -1, "com.robinhood.android.support.supporthub.ComposableSingletons$ConciergeExplainerComposableKt.lambda$-1801152882.<anonymous> (ConciergeExplainerComposable.kt:63)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function3<PaddingValues, Composer, Integer, Unit> lambda$1083383967 = ComposableLambda3.composableLambdaInstance(1083383967, false, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.support.supporthub.ComposableSingletons$ConciergeExplainerComposableKt$lambda$1083383967$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(paddingValues) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1083383967, i2, -1, "com.robinhood.android.support.supporthub.ComposableSingletons$ConciergeExplainerComposableKt.lambda$1083383967.<anonymous> (ConciergeExplainerComposable.kt:93)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), 0.0f, paddingValues.getTop(), 0.0f, 0.0f, 13, null));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierNavigationBarsPadding);
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
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(Column6.INSTANCE, companion, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierVerticalScroll$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            Modifier modifierM5158heightInVpY3zN4$default = SizeKt.m5158heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, C2002Dp.m7995constructorimpl(165), 1, null);
            Painter painterPainterResource = PainterResources_androidKt.painterResource(C39996R.drawable.concierge_hub_explainer_hero_image, composer, 0);
            ColorFilter.Companion companion4 = ColorFilter.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            ImageKt.Image(painterPainterResource, (String) null, modifierM5158heightInVpY3zN4$default, (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(companion4, bentoTheme.getColors(composer, i3).m21427getFg30d7_KjU(), 0, 2, null), composer, 25008, 40);
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5142padding3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM()), 0.0f, 1, null);
            String strStringResource = StringResources_androidKt.stringResource(C39996R.string.concierge_explainer_title, composer, 0);
            TextAlign.Companion companion5 = TextAlign.INSTANCE;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierFillMaxWidth$default, null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleLarge(), composer, 0, 0, 8124);
            Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.SPARKLE_BULLET_24;
            BentoBaseRowState.Start.Icon icon = new BentoBaseRowState.Start.Icon(serverToBentoAssetMapper2, null, null, 6, null);
            String strStringResource2 = StringResources_androidKt.stringResource(C39996R.string.concierge_explainer_feature_1_primary, composer, 0);
            String strStringResource3 = StringResources_androidKt.stringResource(C39996R.string.concierge_explainer_feature_1_secondary, composer, 0);
            int i4 = BentoBaseRowState.Start.Icon.$stable;
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierFillMaxWidth$default2, icon, strStringResource2, strStringResource3, null, null, null, false, false, false, 0L, null, composer, (i4 << 3) | 12582918, 0, 3952);
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), new BentoBaseRowState.Start.Icon(serverToBentoAssetMapper2, null, null, 6, null), StringResources_androidKt.stringResource(C39996R.string.concierge_explainer_feature_2_primary, composer, 0), StringResources_androidKt.stringResource(C39996R.string.concierge_explainer_feature_2_secondary, composer, 0), null, null, null, false, false, false, 0L, null, composer, (i4 << 3) | 12582918, 0, 3952);
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), new BentoBaseRowState.Start.Icon(serverToBentoAssetMapper2, null, null, 6, null), StringResources_androidKt.stringResource(C39996R.string.concierge_explainer_feature_3_primary, composer, 0), StringResources_androidKt.stringResource(C39996R.string.concierge_explainer_feature_3_secondary, composer, 0), null, null, null, false, false, false, 0L, null, composer, (i4 << 3) | 12582918, 0, 3952);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM()), composer, 0);
            composer.endNode();
            Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(PaddingKt.m5144paddingVpY3zN4$default(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 1, null);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39996R.string.concierge_explainer_disclaimer, composer, 0), modifierFillMaxWidth$default3, Color.m6701boximpl(bentoTheme.getColors(composer, i3).m21427getFg30d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 0, 0, 8120);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda$-1801152882$feature_support_externalRelease, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m19092getLambda$1801152882$feature_support_externalRelease() {
        return f9253lambda$1801152882;
    }

    public final Function3<PaddingValues, Composer, Integer, Unit> getLambda$1083383967$feature_support_externalRelease() {
        return lambda$1083383967;
    }
}
