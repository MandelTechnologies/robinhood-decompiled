package com.robinhood.android.matcha.p177ui.history.detail.transfer;

import android.view.View;
import com.robinhood.android.matcha.databinding.FragmentMatchaTransferDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaTransferDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.history.detail.transfer.MatchaTransferDetailFragment$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MatchaTransferDetailFragment9 extends FunctionReferenceImpl implements Function1<View, FragmentMatchaTransferDetailBinding> {
    public static final MatchaTransferDetailFragment9 INSTANCE = new MatchaTransferDetailFragment9();

    MatchaTransferDetailFragment9() {
        super(1, FragmentMatchaTransferDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/matcha/databinding/FragmentMatchaTransferDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentMatchaTransferDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentMatchaTransferDetailBinding.bind(p0);
    }
}
