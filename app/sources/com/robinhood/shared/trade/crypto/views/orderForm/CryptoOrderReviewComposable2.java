package com.robinhood.shared.trade.crypto.views.orderForm;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.apitestdata.models.ApiCreateUserRequest;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderHeaderState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoOrderReviewComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.views.orderForm.ComposableSingletons$CryptoOrderReviewComposableKt$lambda$1578544075$1, reason: use source file name */
/* loaded from: classes12.dex */
final class CryptoOrderReviewComposable2 implements Function2<Composer, Integer, Unit> {
    public static final CryptoOrderReviewComposable2 INSTANCE = new CryptoOrderReviewComposable2();

    CryptoOrderReviewComposable2() {
    }

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
            ComposerKt.traceEventStart(1578544075, i, -1, "com.robinhood.shared.trade.crypto.views.orderForm.ComposableSingletons$CryptoOrderReviewComposableKt.lambda$1578544075.<anonymous> (CryptoOrderReviewComposable.kt:87)");
        }
        Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer, 6, 1);
        OrderSide orderSide = OrderSide.SELL;
        StringResource.Companion companion = StringResource.INSTANCE;
        CryptoOrderHeaderState cryptoOrderHeaderState = new CryptoOrderHeaderState(orderSide, ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, companion.invoke("4.634844 BTC available"), null, false, 16, null);
        StringResource stringResourceInvoke = companion.invoke("Robinhood fee");
        CryptoOrderReviewRowState.TextStyleOverride textStyleOverride = CryptoOrderReviewRowState.TextStyleOverride.TEXT_M_HIGHLIGHT_GRADIENT;
        FontWeight.Companion companion2 = FontWeight.INSTANCE;
        CryptoOrderReviewComposableState cryptoOrderReviewComposableState = new CryptoOrderReviewComposableState(cryptoOrderHeaderState, extensions2.persistentListOf(new CryptoOrderReviewRowState(new CryptoOrderReviewRowState.TextContent(stringResourceInvoke, null, null, null, textStyleOverride, companion2.getBold(), false, 78, null), new CryptoOrderReviewRowState.TextContent(companion.invoke("$0.00"), CryptoOrderReviewRowState.ColorOverride.DAY_PRIME, null, null, null, companion2.getBold(), false, 92, null), null, null, null, true, null, false, null, null, 988, null), new CryptoOrderReviewRowState(new CryptoOrderReviewRowState.TextContent(companion.invoke("Buy spread (0.37%)"), null, new CryptoOrderReviewRowState.IconContent(new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_FILLED_16), CryptoOrderReviewRowState.ColorOverride.f6213FG), null, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null), new CryptoOrderReviewRowState.TextContent(companion.invoke("$0.37"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, extensions2.persistentListOf(new CryptoOrderReviewRowState.SecondaryTextRow(new CryptoOrderReviewRowState.TextContent(companion.invoke("Included in BTC price"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, 2, null)), null, true, null, false, null, null, 980, null), new CryptoOrderReviewRowState(new CryptoOrderReviewRowState.TextContent(companion.invoke("Total"), null, null, null, null, companion2.getBold(), false, 94, null), new CryptoOrderReviewRowState.TextContent(companion.invoke("$100.00"), null, null, null, null, companion2.getBold(), false, 94, null), null, null, null, false, null, false, null, null, 988, null)), new CryptoOrderReviewMessageAndDisclosuresState(null, companion.invoke("Cryptocurrency trading is offered through an account with Robinhood Crypto. Robinhood Crypto is not a broker-dealer or FINRA member. Cryptocurrencies offered by Robinhood Crypto, LLC are not securities and are not FDIC insured or protected by SIPC."), new CryptoOrderReviewMessageAndDisclosuresState.DisclosuresContent(companion.invoke("Disclosures"), companion.invoke("")), false, 9, null));
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function1() { // from class: com.robinhood.shared.trade.crypto.views.orderForm.ComposableSingletons$CryptoOrderReviewComposableKt$lambda$1578544075$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CryptoOrderReviewComposable2.invoke$lambda$1$lambda$0((CryptoOrderReviewRowState.TapAction) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        CryptoOrderReviewComposable4.CryptoOrderReviewComposable(cryptoOrderReviewComposableState, (Function1) objRememberedValue, modifierM21623defaultHorizontalPaddingrAjV9yQ, composer, CryptoOrderHeaderState.$stable | CryptoOrderReviewRowState.$stable | CryptoOrderReviewMessageAndDisclosuresState.$stable | 48, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(CryptoOrderReviewRowState.TapAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }
}
