package com.robinhood.shared.trade.crypto.p397ui.orderConfirmation;

import android.view.View;
import com.robinhood.shared.trade.crypto.databinding.FragmentCryptoOrderConfirmationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderConfirmationFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderConfirmation.CryptoOrderConfirmationFragment$fragmentBinding$2, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class CryptoOrderConfirmationFragment4 extends FunctionReferenceImpl implements Function1<View, FragmentCryptoOrderConfirmationBinding> {
    public static final CryptoOrderConfirmationFragment4 INSTANCE = new CryptoOrderConfirmationFragment4();

    CryptoOrderConfirmationFragment4() {
        super(1, FragmentCryptoOrderConfirmationBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/trade/crypto/databinding/FragmentCryptoOrderConfirmationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentCryptoOrderConfirmationBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentCryptoOrderConfirmationBinding.bind(p0);
    }
}
