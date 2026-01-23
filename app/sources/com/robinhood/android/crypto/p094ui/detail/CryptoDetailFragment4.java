package com.robinhood.android.crypto.p094ui.detail;

import android.view.View;
import com.robinhood.android.crypto.databinding.FragmentCryptoDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.ui.detail.CryptoDetailFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class CryptoDetailFragment4 extends FunctionReferenceImpl implements Function1<View, FragmentCryptoDetailBinding> {
    public static final CryptoDetailFragment4 INSTANCE = new CryptoDetailFragment4();

    CryptoDetailFragment4() {
        super(1, FragmentCryptoDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/crypto/databinding/FragmentCryptoDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentCryptoDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentCryptoDetailBinding.bind(p0);
    }
}
