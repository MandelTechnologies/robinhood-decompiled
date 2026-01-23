package com.robinhood.compose.bento.component;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIconButton4;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoIconButton.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.ComposableSingletons$BentoIconButtonKt$lambda$683080080$1, reason: use source file name */
/* loaded from: classes15.dex */
final class BentoIconButton7 implements Function2<Composer, Integer, Unit> {
    public static final BentoIconButton7 INSTANCE = new BentoIconButton7();

    BentoIconButton7() {
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(683080080, i, -1, "com.robinhood.compose.bento.component.ComposableSingletons$BentoIconButtonKt.lambda$683080080.<anonymous> (BentoIconButton.kt:264)");
        }
        Arrangement arrangement = Arrangement.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, 6).m21590getDefaultD9Ej5fM());
        Modifier.Companion companion = Modifier.INSTANCE;
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, companion2.getTop(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
        Row6 row6 = Row6.INSTANCE;
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, 6).m21590getDefaultD9Ej5fM()), companion2.getStart(), composer, 0);
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
        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
        }
        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
        Column6 column6 = Column6.INSTANCE;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion4 = Composer.INSTANCE;
        if (objRememberedValue == companion4.getEmpty()) {
            objRememberedValue = new Function0() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoIconButtonKt$lambda$683080080$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composer.endReplaceGroup();
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CLOSE_16;
        BentoIconButton4.Icon.StandardSize16 standardSize16 = new BentoIconButton4.Icon.StandardSize16(serverToBentoAssetMapper2);
        BentoIconButton4.Type type2 = BentoIconButton4.Type.Secondary;
        BentoIconButton2.m20641BentoIconButtoncqYvz4g(function0, standardSize16, "Close", null, type2, false, null, null, null, null, false, composer, 24966, 0, 2024);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion4.getEmpty()) {
            objRememberedValue2 = new Function0() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoIconButtonKt$lambda$683080080$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = ServerToBentoAssetMapper2.CLOSE_24;
        BentoIconButton2.m20641BentoIconButtoncqYvz4g((Function0) objRememberedValue2, new BentoIconButton4.Icon.HeroSize24(serverToBentoAssetMapper22), "Close", null, type2, false, null, null, null, null, false, composer, 24966, 0, 2024);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion4.getEmpty()) {
            objRememberedValue3 = new Function0() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoIconButtonKt$lambda$683080080$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        BentoIconButton4.Icon.HeroSize24 heroSize24 = new BentoIconButton4.Icon.HeroSize24(serverToBentoAssetMapper22);
        Color.Companion companion5 = Color.INSTANCE;
        BentoIconButton2.m20641BentoIconButtoncqYvz4g((Function0) objRememberedValue3, heroSize24, "Close", null, type2, false, null, null, Color.m6701boximpl(companion5.m6724getRed0d7_KjU()), null, false, composer, 100688262, 0, 1768);
        composer.endNode();
        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer, 6).m21590getDefaultD9Ej5fM()), companion2.getStart(), composer, 0);
        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, companion);
        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
        if (composer.getApplier() == null) {
            Composables.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor3);
        } else {
            composer.useNode();
        }
        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
        }
        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion4.getEmpty()) {
            objRememberedValue4 = new Function0() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoIconButtonKt$lambda$683080080$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        BentoIconButton2.m20641BentoIconButtoncqYvz4g((Function0) objRememberedValue4, new BentoIconButton4.Icon.StandardSize16(serverToBentoAssetMapper2), "Close", null, type2, false, null, null, null, null, false, composer, 221574, 0, 1992);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion4.getEmpty()) {
            objRememberedValue5 = new Function0() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoIconButtonKt$lambda$683080080$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        BentoIconButton2.m20641BentoIconButtoncqYvz4g((Function0) objRememberedValue5, new BentoIconButton4.Icon.HeroSize24(serverToBentoAssetMapper22), "Close", null, type2, false, null, null, null, null, false, composer, 221574, 0, 1992);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion4.getEmpty()) {
            objRememberedValue6 = new Function0() { // from class: com.robinhood.compose.bento.component.ComposableSingletons$BentoIconButtonKt$lambda$683080080$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue6);
        }
        composer.endReplaceGroup();
        BentoIconButton2.m20641BentoIconButtoncqYvz4g((Function0) objRememberedValue6, new BentoIconButton4.Icon.HeroSize24(serverToBentoAssetMapper22), "Close", null, type2, false, null, null, Color.m6701boximpl(companion5.m6724getRed0d7_KjU()), null, false, composer, 100884870, 0, 1736);
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
}
