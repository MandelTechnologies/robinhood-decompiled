package com.robinhood.android.crypto.gifting.details.p092ui;

import android.view.View;
import com.robinhood.android.crypto.gifting.databinding.MergeCryptoGiftEditorGiftCardRowViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GiftCardRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.gifting.details.ui.GiftCardRowView$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class GiftCardRowView3 extends FunctionReferenceImpl implements Function1<View, MergeCryptoGiftEditorGiftCardRowViewBinding> {
    public static final GiftCardRowView3 INSTANCE = new GiftCardRowView3();

    GiftCardRowView3() {
        super(1, MergeCryptoGiftEditorGiftCardRowViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/crypto/gifting/databinding/MergeCryptoGiftEditorGiftCardRowViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeCryptoGiftEditorGiftCardRowViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeCryptoGiftEditorGiftCardRowViewBinding.bind(p0);
    }
}
