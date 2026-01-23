package com.robinhood.shared.trade.crypto.p397ui.limitOrder;

import android.view.View;
import com.robinhood.shared.trade.crypto.databinding.FragmentCryptoLimitOrderBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoLimitOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.limitOrder.CryptoLimitOrderFragment$fragmentBinding$2, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class CryptoLimitOrderFragment8 extends FunctionReferenceImpl implements Function1<View, FragmentCryptoLimitOrderBinding> {
    public static final CryptoLimitOrderFragment8 INSTANCE = new CryptoLimitOrderFragment8();

    CryptoLimitOrderFragment8() {
        super(1, FragmentCryptoLimitOrderBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/trade/crypto/databinding/FragmentCryptoLimitOrderBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentCryptoLimitOrderBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentCryptoLimitOrderBinding.bind(p0);
    }
}
