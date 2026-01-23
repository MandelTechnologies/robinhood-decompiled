package com.robinhood.android.transfers.history.internaltransfer;

import android.view.View;
import com.robinhood.android.transfers.history.databinding.FragmentInternalTransferHistoryDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalTransferHistoryDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.history.internaltransfer.InternalTransferHistoryDetailFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class InternalTransferHistoryDetailFragment3 extends FunctionReferenceImpl implements Function1<View, FragmentInternalTransferHistoryDetailBinding> {
    public static final InternalTransferHistoryDetailFragment3 INSTANCE = new InternalTransferHistoryDetailFragment3();

    InternalTransferHistoryDetailFragment3() {
        super(1, FragmentInternalTransferHistoryDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/history/databinding/FragmentInternalTransferHistoryDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentInternalTransferHistoryDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentInternalTransferHistoryDetailBinding.bind(p0);
    }
}
