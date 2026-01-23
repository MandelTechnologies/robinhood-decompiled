package com.robinhood.shared.trade.crypto.p397ui.order;

import android.view.View;
import com.robinhood.shared.trade.crypto.databinding.FragmentCryptoOrderBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.ui.order.CryptoOrderFragment$fragmentBinding$2, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class CryptoOrderFragment6 extends FunctionReferenceImpl implements Function1<View, FragmentCryptoOrderBinding> {
    public static final CryptoOrderFragment6 INSTANCE = new CryptoOrderFragment6();

    CryptoOrderFragment6() {
        super(1, FragmentCryptoOrderBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/trade/crypto/databinding/FragmentCryptoOrderBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentCryptoOrderBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentCryptoOrderBinding.bind(p0);
    }
}
