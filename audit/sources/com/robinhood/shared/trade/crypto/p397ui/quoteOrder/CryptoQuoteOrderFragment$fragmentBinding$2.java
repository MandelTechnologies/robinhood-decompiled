package com.robinhood.shared.trade.crypto.p397ui.quoteOrder;

import android.view.View;
import com.robinhood.shared.trade.crypto.databinding.FragmentCryptoQuoteOrderBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoQuoteOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class CryptoQuoteOrderFragment$fragmentBinding$2 extends FunctionReferenceImpl implements Function1<View, FragmentCryptoQuoteOrderBinding> {
    public static final CryptoQuoteOrderFragment$fragmentBinding$2 INSTANCE = new CryptoQuoteOrderFragment$fragmentBinding$2();

    CryptoQuoteOrderFragment$fragmentBinding$2() {
        super(1, FragmentCryptoQuoteOrderBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/trade/crypto/databinding/FragmentCryptoQuoteOrderBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentCryptoQuoteOrderBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentCryptoQuoteOrderBinding.bind(p0);
    }
}
