package com.robinhood.shared.crypto.p375ui.primer;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.shape.RoundedCornerShape2;
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
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PrimerHeaderAssetContainer.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a>\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u000b\u0010\f\"\u0015\u0010\u0011\u001a\u00020\u000e*\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "backgroundColorOverride", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "", "Lkotlin/ExtensionFunctionType;", "content", "PrimerHeaderAssetContainer", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Preview", "(Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/compose/bento/theme/BentoTheme;", "Landroidx/compose/ui/graphics/Color;", "getPrimerHeaderAssetColor", "(Lcom/robinhood/compose/bento/theme/BentoTheme;Landroidx/compose/runtime/Composer;I)J", "primerHeaderAssetColor", "lib-crypto-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.primer.PrimerHeaderAssetContainerKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class PrimerHeaderAssetContainer4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$2(int i, Composer composer, int i2) {
        Preview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimerHeaderAssetContainer$lambda$1(Modifier modifier, ThemedColor themedColor, Function3 function3, int i, int i2, Composer composer, int i3) {
        PrimerHeaderAssetContainer(modifier, themedColor, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void PrimerHeaderAssetContainer(Modifier modifier, ThemedColor themedColor, final Function3<? super BoxScope, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        long value;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-581493937);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(themedColor) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                themedColor = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-581493937, i3, -1, "com.robinhood.shared.crypto.ui.primer.PrimerHeaderAssetContainer (PrimerHeaderAssetContainer.kt:29)");
            }
            composerStartRestartGroup.startReplaceGroup(-469917601);
            Color composeColor = themedColor != null ? SduiColors2.toComposeColor(themedColor, composerStartRestartGroup, (i3 >> 3) & 14) : null;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-469918239);
            if (composeColor != null) {
                value = composeColor.getValue();
            } else {
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                if (bentoTheme.getColors(composerStartRestartGroup, i6).getIsDay()) {
                    composerStartRestartGroup.startReplaceGroup(-1682486267);
                    value = bentoTheme.getColors(composerStartRestartGroup, i6).getNeon();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-1682434745);
                    value = bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(modifier, value, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM()));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4871backgroundbw27NRU);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            content.invoke(BoxScopeInstance.INSTANCE, composerStartRestartGroup, Integer.valueOf(((i3 >> 3) & 112) | 6));
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final ThemedColor themedColor2 = themedColor;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.primer.PrimerHeaderAssetContainerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PrimerHeaderAssetContainer4.PrimerHeaderAssetContainer$lambda$1(modifier2, themedColor2, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @JvmName
    public static final long getPrimerHeaderAssetColor(BentoTheme bentoTheme, Composer composer, int i) {
        long xray;
        Intrinsics.checkNotNullParameter(bentoTheme, "<this>");
        composer.startReplaceGroup(2133973224);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2133973224, i, -1, "com.robinhood.shared.crypto.ui.primer.<get-primerHeaderAssetColor> (PrimerHeaderAssetContainer.kt:49)");
        }
        int i2 = BentoTheme.$stable;
        int i3 = i & 14;
        if (bentoTheme.getColors(composer, i2 | i3).getIsDay()) {
            composer.startReplaceGroup(-909556767);
            xray = bentoTheme.getColors(composer, i3 | i2).m21425getFg0d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-909525953);
            xray = bentoTheme.getColors(composer, i3 | i2).getXray();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return xray;
    }

    private static final void Preview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1692931649);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1692931649, i, -1, "com.robinhood.shared.crypto.ui.primer.Preview (PrimerHeaderAssetContainer.kt:57)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, PrimerHeaderAssetContainer.INSTANCE.getLambda$1377828233$lib_crypto_ui_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.primer.PrimerHeaderAssetContainerKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PrimerHeaderAssetContainer4.Preview$lambda$2(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
