package com.robinhood.shared.trade.crypto.views.edittext;

import android.view.View;
import com.robinhood.shared.trade.crypto.databinding.MergeCryptoAmountInputViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAmountInputView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.trade.crypto.views.edittext.CryptoAmountInputView$binding$2, reason: use source file name */
/* loaded from: classes12.dex */
/* synthetic */ class CryptoAmountInputView2 extends FunctionReferenceImpl implements Function1<View, MergeCryptoAmountInputViewBinding> {
    public static final CryptoAmountInputView2 INSTANCE = new CryptoAmountInputView2();

    CryptoAmountInputView2() {
        super(1, MergeCryptoAmountInputViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/trade/crypto/databinding/MergeCryptoAmountInputViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeCryptoAmountInputViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeCryptoAmountInputViewBinding.bind(p0);
    }
}
