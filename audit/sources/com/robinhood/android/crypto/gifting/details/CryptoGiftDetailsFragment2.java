package com.robinhood.android.crypto.gifting.details;

import android.view.View;
import com.robinhood.android.crypto.gifting.databinding.FragmentCryptoGiftDetailsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoGiftDetailsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.gifting.details.CryptoGiftDetailsFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class CryptoGiftDetailsFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentCryptoGiftDetailsBinding> {
    public static final CryptoGiftDetailsFragment2 INSTANCE = new CryptoGiftDetailsFragment2();

    CryptoGiftDetailsFragment2() {
        super(1, FragmentCryptoGiftDetailsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/crypto/gifting/databinding/FragmentCryptoGiftDetailsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentCryptoGiftDetailsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentCryptoGiftDetailsBinding.bind(p0);
    }
}
