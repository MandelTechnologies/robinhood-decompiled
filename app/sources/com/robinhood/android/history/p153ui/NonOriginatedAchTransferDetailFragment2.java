package com.robinhood.android.history.p153ui;

import android.view.View;
import com.robinhood.android.history.databinding.FragmentNonOriginatedAchTransferDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NonOriginatedAchTransferDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.history.ui.NonOriginatedAchTransferDetailFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class NonOriginatedAchTransferDetailFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentNonOriginatedAchTransferDetailBinding> {
    public static final NonOriginatedAchTransferDetailFragment2 INSTANCE = new NonOriginatedAchTransferDetailFragment2();

    NonOriginatedAchTransferDetailFragment2() {
        super(1, FragmentNonOriginatedAchTransferDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/history/databinding/FragmentNonOriginatedAchTransferDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentNonOriginatedAchTransferDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentNonOriginatedAchTransferDetailBinding.bind(p0);
    }
}
