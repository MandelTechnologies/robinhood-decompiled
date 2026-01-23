package com.robinhood.shared.crypto.p375ui.trade.view;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoOrderReviewRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.trade.view.ComposableSingletons$CryptoOrderReviewRowKt$lambda$-197435549$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoOrderReviewRow2 implements Function2<Composer, Integer, Unit> {
    public static final CryptoOrderReviewRow2 INSTANCE = new CryptoOrderReviewRow2();

    CryptoOrderReviewRow2() {
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-197435549, i, -1, "com.robinhood.shared.crypto.ui.trade.view.ComposableSingletons$CryptoOrderReviewRowKt.lambda$-197435549.<anonymous> (CryptoOrderReviewRow.kt:382)");
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer, i2).m21371getBg0d7_KjU(), null, 2, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5144paddingVpY3zN4$default);
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
        StringResource.Companion companion3 = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion3.invoke("Robinhood fee");
        CryptoOrderReviewRowState.TextStyleOverride textStyleOverride = CryptoOrderReviewRowState.TextStyleOverride.TEXT_M_HIGHLIGHT_GRADIENT;
        FontWeight.Companion companion4 = FontWeight.INSTANCE;
        CryptoOrderReviewRowState.TextContent textContent = new CryptoOrderReviewRowState.TextContent(stringResourceInvoke, null, null, null, textStyleOverride, companion4.getBold(), false, 78, null);
        StringResource stringResourceInvoke2 = companion3.invoke("$0.00");
        CryptoOrderReviewRowState.ColorOverride colorOverride = CryptoOrderReviewRowState.ColorOverride.DAY_PRIME;
        CryptoOrderReviewRowState cryptoOrderReviewRowState = new CryptoOrderReviewRowState(textContent, new CryptoOrderReviewRowState.TextContent(stringResourceInvoke2, colorOverride, null, null, null, companion4.getBold(), false, 92, null), null, null, null, true, null, false, null, null, 988, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion5 = Composer.INSTANCE;
        if (objRememberedValue == companion5.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.ui.trade.view.ComposableSingletons$CryptoOrderReviewRowKt$lambda$-197435549$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoOrderReviewRow2.invoke$lambda$16$lambda$1$lambda$0((CryptoOrderReviewRowState.TapAction) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CryptoOrderReviewRow3.CryptoOrderReviewRow(cryptoOrderReviewRowState, null, (Function1) objRememberedValue, composer, 384, 2);
        CryptoOrderReviewRowState cryptoOrderReviewRowState2 = new CryptoOrderReviewRowState(new CryptoOrderReviewRowState.TextContent(companion3.invoke("Robinhood fee"), null, null, null, textStyleOverride, companion4.getBold(), false, 78, null), new CryptoOrderReviewRowState.TextContent(companion3.invoke("$0.00"), colorOverride, null, null, null, companion4.getBold(), false, 92, null), null, null, null, true, null, false, null, null, 860, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion5.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.ui.trade.view.ComposableSingletons$CryptoOrderReviewRowKt$lambda$-197435549$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoOrderReviewRow2.invoke$lambda$16$lambda$3$lambda$2((CryptoOrderReviewRowState.TapAction) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceGroup();
        CryptoOrderReviewRow3.CryptoOrderReviewRow(cryptoOrderReviewRowState2, null, (Function1) objRememberedValue2, composer, 384, 2);
        StringResource stringResourceInvoke3 = companion3.invoke("Buy spread (0.37%)");
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.QUESTION_FILLED_16;
        CryptoOrderReviewRowState cryptoOrderReviewRowState3 = new CryptoOrderReviewRowState(new CryptoOrderReviewRowState.TextContent(stringResourceInvoke3, null, new CryptoOrderReviewRowState.IconContent(new BentoIcon4.Size16(serverToBentoAssetMapper2), CryptoOrderReviewRowState.ColorOverride.f6213FG), null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null), new CryptoOrderReviewRowState.TextContent(companion3.invoke("$0.37"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, extensions2.persistentListOf(new CryptoOrderReviewRowState.SecondaryTextRow(new CryptoOrderReviewRowState.TextContent(companion3.invoke("Included in BTC price"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, 2, null)), null, true, null, false, null, null, 980, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion5.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.crypto.ui.trade.view.ComposableSingletons$CryptoOrderReviewRowKt$lambda$-197435549$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoOrderReviewRow2.invoke$lambda$16$lambda$5$lambda$4((CryptoOrderReviewRowState.TapAction) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        composer.endReplaceGroup();
        CryptoOrderReviewRow3.CryptoOrderReviewRow(cryptoOrderReviewRowState3, null, (Function1) objRememberedValue3, composer, 384, 2);
        CryptoOrderReviewRowState.TextContent textContent2 = new CryptoOrderReviewRowState.TextContent(companion3.invoke("BTC amount"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        CryptoOrderReviewRowState.TextContent textContent3 = new CryptoOrderReviewRowState.TextContent(companion3.invoke("0.00152356 BTC"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
        StringResource stringResourceInvoke4 = companion3.invoke("0.01% bonus included");
        CryptoOrderReviewRowState.IconContent iconContent = new CryptoOrderReviewRowState.IconContent(new BentoIcon4.Size16(serverToBentoAssetMapper2), colorOverride);
        CryptoOrderReviewRowState.TextStyleOverride textStyleOverride2 = CryptoOrderReviewRowState.TextStyleOverride.TEXT_S_HIGHLIGHT_GRADIENT;
        CryptoOrderReviewRowState cryptoOrderReviewRowState4 = new CryptoOrderReviewRowState(textContent2, textContent3, null, extensions2.persistentListOf(new CryptoOrderReviewRowState.SecondaryTextRow(new CryptoOrderReviewRowState.TextContent(stringResourceInvoke4, null, iconContent, null, textStyleOverride2, companion4.getBold(), false, 74, null), new CryptoOrderReviewRowState.TextContent(companion3.invoke("0.00001234 BTC"), colorOverride, null, null, null, companion4.getBold(), false, 92, null))), null, true, null, false, null, null, 980, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion5.getEmpty()) {
            objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.crypto.ui.trade.view.ComposableSingletons$CryptoOrderReviewRowKt$lambda$-197435549$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoOrderReviewRow2.invoke$lambda$16$lambda$7$lambda$6((CryptoOrderReviewRowState.TapAction) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        CryptoOrderReviewRow3.CryptoOrderReviewRow(cryptoOrderReviewRowState4, null, (Function1) objRememberedValue4, composer, 384, 2);
        CryptoOrderReviewRowState cryptoOrderReviewRowState5 = new CryptoOrderReviewRowState(new CryptoOrderReviewRowState.TextContent(companion3.invoke("BTC amount"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), new CryptoOrderReviewRowState.TextContent(companion3.invoke("0.00152356 BTC"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, extensions2.persistentListOf(new CryptoOrderReviewRowState.SecondaryTextRow(new CryptoOrderReviewRowState.TextContent(companion3.invoke("0.01% bonus included"), null, new CryptoOrderReviewRowState.IconContent(new BentoIcon4.Size16(serverToBentoAssetMapper2), colorOverride), null, textStyleOverride2, companion4.getBold(), false, 74, null), new CryptoOrderReviewRowState.TextContent(companion3.invoke("0.00001234 BTC"), colorOverride, null, null, null, companion4.getBold(), false, 92, null))), null, true, null, false, null, null, 852, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion5.getEmpty()) {
            objRememberedValue5 = new Function1() { // from class: com.robinhood.shared.crypto.ui.trade.view.ComposableSingletons$CryptoOrderReviewRowKt$lambda$-197435549$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoOrderReviewRow2.invoke$lambda$16$lambda$9$lambda$8((CryptoOrderReviewRowState.TapAction) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        CryptoOrderReviewRow3.CryptoOrderReviewRow(cryptoOrderReviewRowState5, null, (Function1) objRememberedValue5, composer, 384, 2);
        CryptoOrderReviewRowState cryptoOrderReviewRowState6 = new CryptoOrderReviewRowState(new CryptoOrderReviewRowState.TextContent(companion3.invoke("Total"), null, null, null, null, companion4.getBold(), false, 94, null), new CryptoOrderReviewRowState.TextContent(companion3.invoke("$100.00"), null, null, null, null, companion4.getBold(), false, 94, null), null, null, null, true, null, false, null, null, 988, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion5.getEmpty()) {
            objRememberedValue6 = new Function1() { // from class: com.robinhood.shared.crypto.ui.trade.view.ComposableSingletons$CryptoOrderReviewRowKt$lambda$-197435549$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoOrderReviewRow2.invoke$lambda$16$lambda$11$lambda$10((CryptoOrderReviewRowState.TapAction) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue6);
        }
        composer.endReplaceGroup();
        CryptoOrderReviewRow3.CryptoOrderReviewRow(cryptoOrderReviewRowState6, null, (Function1) objRememberedValue6, composer, 384, 2);
        CryptoOrderReviewRowState cryptoOrderReviewRowState7 = new CryptoOrderReviewRowState(new CryptoOrderReviewRowState.TextContent(companion3.invoke("Estimated fees"), null, null, null, null, companion4.getBold(), false, 94, null), new CryptoOrderReviewRowState.TextContent(companion3.invoke("$100.00"), null, null, null, null, companion4.getBold(), true, 30, null), null, null, null, true, null, false, null, null, 988, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue7 = composer.rememberedValue();
        if (objRememberedValue7 == companion5.getEmpty()) {
            objRememberedValue7 = new Function1() { // from class: com.robinhood.shared.crypto.ui.trade.view.ComposableSingletons$CryptoOrderReviewRowKt$lambda$-197435549$1$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoOrderReviewRow2.invoke$lambda$16$lambda$13$lambda$12((CryptoOrderReviewRowState.TapAction) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue7);
        }
        composer.endReplaceGroup();
        CryptoOrderReviewRow3.CryptoOrderReviewRow(cryptoOrderReviewRowState7, null, (Function1) objRememberedValue7, composer, 384, 2);
        CryptoOrderReviewRowState cryptoOrderReviewRowState8 = new CryptoOrderReviewRowState(new CryptoOrderReviewRowState.TextContent(companion3.invoke("Estimated margin required"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), new CryptoOrderReviewRowState.TextContent(companion3.invoke("$460.00"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, extensions2.persistentListOf(new CryptoOrderReviewRowState.SecondaryTextRow(new CryptoOrderReviewRowState.TextContent(companion3.invoke("Leverage"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), new CryptoOrderReviewRowState.TextContent(companion3.invoke("Cross 2x"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null)), new CryptoOrderReviewRowState.SecondaryTextRow(new CryptoOrderReviewRowState.TextContent(companion3.invoke("Estimated fees"), null, new CryptoOrderReviewRowState.IconContent(new BentoIcon4.Size16(serverToBentoAssetMapper2), null, 2, null), null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null), new CryptoOrderReviewRowState.TextContent(companion3.invoke("$5.00"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null))), new CryptoOrderReviewRowState.TextContent(companion3.invoke("Edit"), null, null, CryptoOrderReviewRowState.TapAction.EditPrice.INSTANCE, null, null, false, 118, null), false, null, false, null, null, 964, null);
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue8 = composer.rememberedValue();
        if (objRememberedValue8 == companion5.getEmpty()) {
            objRememberedValue8 = new Function1() { // from class: com.robinhood.shared.crypto.ui.trade.view.ComposableSingletons$CryptoOrderReviewRowKt$lambda$-197435549$1$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoOrderReviewRow2.invoke$lambda$16$lambda$15$lambda$14((CryptoOrderReviewRowState.TapAction) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue8);
        }
        composer.endReplaceGroup();
        CryptoOrderReviewRow3.CryptoOrderReviewRow(cryptoOrderReviewRowState8, null, (Function1) objRememberedValue8, composer, 384, 2);
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$1$lambda$0(CryptoOrderReviewRowState.TapAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$3$lambda$2(CryptoOrderReviewRowState.TapAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$5$lambda$4(CryptoOrderReviewRowState.TapAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$7$lambda$6(CryptoOrderReviewRowState.TapAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$9$lambda$8(CryptoOrderReviewRowState.TapAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$11$lambda$10(CryptoOrderReviewRowState.TapAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$13$lambda$12(CryptoOrderReviewRowState.TapAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$16$lambda$15$lambda$14(CryptoOrderReviewRowState.TapAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
