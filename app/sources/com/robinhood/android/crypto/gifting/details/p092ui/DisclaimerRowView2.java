package com.robinhood.android.crypto.gifting.details.p092ui;

import android.view.View;
import com.robinhood.android.crypto.gifting.databinding.MergeCryptoGiftDisclaimerRowViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisclaimerRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.gifting.details.ui.DisclaimerRowView$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class DisclaimerRowView2 extends FunctionReferenceImpl implements Function1<View, MergeCryptoGiftDisclaimerRowViewBinding> {
    public static final DisclaimerRowView2 INSTANCE = new DisclaimerRowView2();

    DisclaimerRowView2() {
        super(1, MergeCryptoGiftDisclaimerRowViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/crypto/gifting/databinding/MergeCryptoGiftDisclaimerRowViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeCryptoGiftDisclaimerRowViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeCryptoGiftDisclaimerRowViewBinding.bind(p0);
    }
}
