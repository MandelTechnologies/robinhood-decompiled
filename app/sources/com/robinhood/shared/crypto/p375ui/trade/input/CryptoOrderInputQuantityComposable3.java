package com.robinhood.shared.crypto.p375ui.trade.input;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.models.p355ui.ServerDrivenAlert;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.shared.crypto.p375ui.trade.input.CryptoOrderInputQuantityState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderHeaderState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderInputRowState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoOrderInputQuantityComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.trade.input.ComposableSingletons$CryptoOrderInputQuantityComposableKt$lambda$68423805$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoOrderInputQuantityComposable3 implements Function2<Composer, Integer, Unit> {
    public static final CryptoOrderInputQuantityComposable3 INSTANCE = new CryptoOrderInputQuantityComposable3();

    CryptoOrderInputQuantityComposable3() {
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(68423805, i, -1, "com.robinhood.shared.crypto.ui.trade.input.ComposableSingletons$CryptoOrderInputQuantityComposableKt.lambda$68423805.<anonymous> (CryptoOrderInputQuantityComposable.kt:85)");
        }
        Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
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
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        OrderSide orderSide = OrderSide.BUY;
        StringResource.Companion companion2 = StringResource.INSTANCE;
        CryptoOrderInputQuantityState cryptoOrderInputQuantityState = new CryptoOrderInputQuantityState(new CryptoOrderHeaderState(orderSide, "AAPL", companion2.invoke("€1,500.00 available"), ServerDrivenAlert.INSTANCE.from(new GenericAlert(null, "So much buying powah monies", "Lots of it", CollectionsKt.emptyList())), false, 16, null), extensions2.persistentListOf(new CryptoOrderInputQuantityState.RowType.Input(new CryptoOrderInputRowState(new CryptoOrderInputRowState.TextContent(companion2.invoke("Quantity"), null, null, false, 14, null), null, companion2.invoke("0"), null, null, false, false, 114, null)), new CryptoOrderInputQuantityState.RowType.Data(new CryptoOrderReviewRowState(new CryptoOrderReviewRowState.TextContent(companion2.invoke("Estimated price"), null, new CryptoOrderReviewRowState.IconContent(new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_16), null, 2, null), null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null), new CryptoOrderReviewRowState.TextContent(companion2.invoke("€201.93"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, extensions2.persistentListOf(new CryptoOrderReviewRowState.SecondaryTextRow(new CryptoOrderReviewRowState.TextContent(companion2.invoke("Price in USD"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), new CryptoOrderReviewRowState.TextContent(companion2.invoke("$219.49"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null)), new CryptoOrderReviewRowState.SecondaryTextRow(new CryptoOrderReviewRowState.TextContent(companion2.invoke("Real value"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), new CryptoOrderReviewRowState.TextContent(companion2.invoke("1 BTC"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null))), null, false, null, false, null, null, 1012, null))));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion3 = Composer.INSTANCE;
        if (objRememberedValue == companion3.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.ui.trade.input.ComposableSingletons$CryptoOrderInputQuantityComposableKt$lambda$68423805$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoOrderInputQuantityComposable3.invoke$lambda$8$lambda$1$lambda$0((CryptoOrderInputRowState) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function1 function1 = (Function1) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion3.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.ui.trade.input.ComposableSingletons$CryptoOrderInputQuantityComposableKt$lambda$68423805$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoOrderInputQuantityComposable3.invoke$lambda$8$lambda$3$lambda$2((CryptoOrderInputRowState) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function1 function12 = (Function1) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion3.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.crypto.ui.trade.input.ComposableSingletons$CryptoOrderInputQuantityComposableKt$lambda$68423805$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoOrderInputQuantityComposable3.invoke$lambda$8$lambda$5$lambda$4((CryptoOrderReviewRowState.TapAction) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function1 function13 = (Function1) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion3.getEmpty()) {
            objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.crypto.ui.trade.input.ComposableSingletons$CryptoOrderInputQuantityComposableKt$lambda$68423805$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        CryptoOrderInputQuantityComposable4.CryptoOrderInputQuantityComposable(cryptoOrderInputQuantityState, function1, function12, function13, (Function0) objRememberedValue4, null, null, composer, 28080, 96);
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
    public static final Unit invoke$lambda$8$lambda$1$lambda$0(CryptoOrderInputRowState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$3$lambda$2(CryptoOrderInputRowState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$5$lambda$4(CryptoOrderReviewRowState.TapAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
