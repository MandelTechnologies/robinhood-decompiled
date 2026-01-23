package com.robinhood.android.crypto.p094ui.detaillist;

import android.view.View;
import com.robinhood.android.crypto.databinding.FragmentCryptoDetailListBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoDetailListFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.ui.detaillist.CryptoDetailListFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class CryptoDetailListFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentCryptoDetailListBinding> {
    public static final CryptoDetailListFragment2 INSTANCE = new CryptoDetailListFragment2();

    CryptoDetailListFragment2() {
        super(1, FragmentCryptoDetailListBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/crypto/databinding/FragmentCryptoDetailListBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentCryptoDetailListBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentCryptoDetailListBinding.bind(p0);
    }
}
