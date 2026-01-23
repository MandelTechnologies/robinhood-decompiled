package com.robinhood.android.redesign.accounttab.p228ui;

import androidx.compose.animation.AnimationModifier;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.GraphicsLayerModifier6;
import androidx.compose.p011ui.graphics.GraphicsLayerScope;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountSelectorTabsRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
final class AccountSelectorTabsRowKt$AccountTab$4$1$2$1 implements Function6<Float, Boolean, AccountTabInfo.Account, Float, Composer, Integer, Unit> {
    final /* synthetic */ boolean $showSubtitles;

    AccountSelectorTabsRowKt$AccountTab$4$1$2$1(boolean z) {
        this.$showSubtitles = z;
    }

    @Override // kotlin.jvm.functions.Function6
    public /* bridge */ /* synthetic */ Unit invoke(Float f, Boolean bool, AccountTabInfo.Account account, Float f2, Composer composer, Integer num) {
        invoke(f.floatValue(), bool.booleanValue(), account, f2.floatValue(), composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(final float f, boolean z, AccountTabInfo.Account tabInfo, float f2, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(tabInfo, "tabInfo");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-108561127, i, -1, "com.robinhood.android.redesign.accounttab.ui.AccountTab.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccountSelectorTabsRow.kt:479)");
        }
        if (f > 0.01f) {
            Modifier.Companion companion = Modifier.INSTANCE;
            composer.startReplaceGroup(5004770);
            boolean z2 = (((i & 14) ^ 6) > 4 && composer.changed(f)) || (i & 6) == 4;
            Object objRememberedValue = composer.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$AccountTab$4$1$2$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AccountSelectorTabsRowKt$AccountTab$4$1$2$1.invoke$lambda$1$lambda$0(f, (GraphicsLayerScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierAnimateContentSize$default = AnimationModifier.animateContentSize$default(GraphicsLayerModifier6.graphicsLayer(companion, (Function1) objRememberedValue), null, null, 3, null);
            boolean z3 = this.$showSubtitles;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierAnimateContentSize$default);
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
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composer, i2).m21593getSmallD9Ej5fM()), composer, 0);
            if (z3 && tabInfo.getSubtitle() != null) {
                composer.startReplaceGroup(-535629704);
                BentoText2.m20747BentoText38GnDrw(StringResources6.getText(tabInfo.getSubtitle(), composer, StringResource.$stable).toString(), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, C2002Dp.m7995constructorimpl(4), 7, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer, 48, 0, 16380);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-535369769);
                AccountSelectorTabsRowKt.m17898BalanceRowXOJAsU(z, tabInfo, bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), composer, (i >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                AccountSelectorTabsRowKt.PerformanceRowArea(tabInfo, f2, composer, (i >> 6) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                composer.endReplaceGroup();
            }
            composer.endNode();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(float f, GraphicsLayerScope graphicsLayer) {
        Intrinsics.checkNotNullParameter(graphicsLayer, "$this$graphicsLayer");
        if (f < 0.95d) {
            f = 0.0f;
        }
        graphicsLayer.setAlpha(f);
        return Unit.INSTANCE;
    }
}
