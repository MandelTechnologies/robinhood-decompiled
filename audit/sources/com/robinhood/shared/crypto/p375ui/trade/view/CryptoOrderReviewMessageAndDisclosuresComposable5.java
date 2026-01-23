package com.robinhood.shared.crypto.p375ui.trade.view;

import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: CryptoOrderReviewMessageAndDisclosuresComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/trade/view/ParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewMessageAndDisclosuresState;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.ui.trade.view.ParameterProvider, reason: use source file name */
/* loaded from: classes6.dex */
final class CryptoOrderReviewMessageAndDisclosuresComposable5 implements PreviewParameterProvider<CryptoOrderReviewMessageAndDisclosuresState> {
    private final Sequence<CryptoOrderReviewMessageAndDisclosuresState> values = SequencesKt.flatten(SequencesKt.map(SequencesKt.sequenceOf(Boolean.TRUE, Boolean.FALSE), new Function1() { // from class: com.robinhood.shared.crypto.ui.trade.view.ParameterProvider$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return CryptoOrderReviewMessageAndDisclosuresComposable5.values$lambda$0(((Boolean) obj).booleanValue());
        }
    }));

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<CryptoOrderReviewMessageAndDisclosuresState> getValues() {
        return this.values;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Sequence values$lambda$0(boolean z) {
        StringResource.Companion companion = StringResource.INSTANCE;
        return SequencesKt.sequenceOf(new CryptoOrderReviewMessageAndDisclosuresState(null, companion.invoke("Cryptocurrency trading is offered through an account with Robinhood Crypto. Robinhood Crypto is not a broker-dealer or FINRA member. Cryptocurrencies offered by Robinhood Crypto, LLC are not securities and are not FDIC insured or protected by SIPC."), new CryptoOrderReviewMessageAndDisclosuresState.DisclosuresContent(companion.invoke("Disclosures"), companion.invoke("")), z, 1, null), new CryptoOrderReviewMessageAndDisclosuresState(null, companion.invoke("Cryptocurrency trading is offered through an account with Robinhood Crypto. Robinhood Crypto is not a broker-dealer or FINRA member. Cryptocurrencies offered by Robinhood Crypto, LLC are not securities and are not FDIC insured or protected by SIPC."), null, z, 1, null), new CryptoOrderReviewMessageAndDisclosuresState(null, companion.invoke("You're placing a limit order to buy 1.23 BTC that's good for 90 days. Your order will be routed to partner exchanges and will execute if the BTC ask price decreases to $90,000.00 or lower. Once executed, the transaction may not be undone. [Disclosures](robinhood://web?url=https://cdn.robinhood.com/assets/robinhood/legal/Robinhood%20Crypto%20Risk%20Disclosures.pdf)"), null, z, 1, null));
    }
}
