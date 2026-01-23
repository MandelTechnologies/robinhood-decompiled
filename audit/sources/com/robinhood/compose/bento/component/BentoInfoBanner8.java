package com.robinhood.compose.bento.component;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoInfoBanner.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.ComposableSingletons$BentoInfoBannerKt$lambda$728320880$1, reason: use source file name */
/* loaded from: classes15.dex */
final class BentoInfoBanner8 implements Function2<Composer, Integer, Unit> {
    public static final BentoInfoBanner8 INSTANCE = new BentoInfoBanner8();

    BentoInfoBanner8() {
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(728320880, i, -1, "com.robinhood.compose.bento.component.ComposableSingletons$BentoInfoBannerKt.lambda$728320880.<anonymous> (BentoInfoBanner.kt:380)");
        }
        Arrangement arrangement = Arrangement.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, 6).m21593getSmallD9Ej5fM());
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 0);
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
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.INFO_24;
        BentoIcon4.Size24 size24 = new BentoIcon4.Size24(serverToBentoAssetMapper2);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoInfoBannerKt$lambda$728320880$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(companion, "This is a string test banner", size24, "CTA", null, (Function0) objRememberedValue, bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU(), composer, 224310, 0);
        AnnotatedString annotatedString = new AnnotatedString("This is a annotated string test banner", null, 2, null);
        BentoIcon4.Size24 size242 = new BentoIcon4.Size24(serverToBentoAssetMapper2);
        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU();
        long jM21373getBg30d7_KjU = bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoInfoBannerKt$lambda$728320880$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        BentoInfoBanner2.m20654BentoInfoBannernjYn8yo(annotatedString, "CTA", jM21425getFg0d7_KjU, jM21373getBg30d7_KjU, companion, size242, null, (Function0) objRememberedValue2, composer, 14180406, 0);
        BentoIcon4.Size24 size243 = new BentoIcon4.Size24(serverToBentoAssetMapper2);
        long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composer, 6).m21425getFg0d7_KjU();
        long jM21373getBg30d7_KjU2 = bentoTheme.getColors(composer, 6).m21373getBg30d7_KjU();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoInfoBannerKt$lambda$728320880$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        BentoInfoBanner2.m20652BentoInfoBannerRakH_j8("This is a markdown test banner [CTA]()", jM21425getFg0d7_KjU2, jM21373getBg30d7_KjU2, companion, size243, (Function0) objRememberedValue3, null, null, composer, 199686, 192);
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
