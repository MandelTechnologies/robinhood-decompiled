package com.robinhood.android.crypto.gifting.details.p092ui;

import android.view.View;
import com.robinhood.android.crypto.gifting.databinding.MergeCryptoGiftDetailsMessageRowViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MessageRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.gifting.details.ui.MessageRowView$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class MessageRowView2 extends FunctionReferenceImpl implements Function1<View, MergeCryptoGiftDetailsMessageRowViewBinding> {
    public static final MessageRowView2 INSTANCE = new MessageRowView2();

    MessageRowView2() {
        super(1, MergeCryptoGiftDetailsMessageRowViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/crypto/gifting/databinding/MergeCryptoGiftDetailsMessageRowViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeCryptoGiftDetailsMessageRowViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeCryptoGiftDetailsMessageRowViewBinding.bind(p0);
    }
}
