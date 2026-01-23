package com.robinhood.android.history.p153ui.transfer;

import android.view.View;
import com.robinhood.android.history.databinding.FragmentDebitCardTransferDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstantTransferDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.history.ui.transfer.InstantTransferDetailFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class InstantTransferDetailFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDebitCardTransferDetailBinding> {
    public static final InstantTransferDetailFragment2 INSTANCE = new InstantTransferDetailFragment2();

    InstantTransferDetailFragment2() {
        super(1, FragmentDebitCardTransferDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/history/databinding/FragmentDebitCardTransferDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDebitCardTransferDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDebitCardTransferDetailBinding.bind(p0);
    }
}
