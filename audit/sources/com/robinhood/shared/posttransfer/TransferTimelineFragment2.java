package com.robinhood.shared.posttransfer;

import android.view.View;
import com.robinhood.shared.posttransfer.databinding.FragmentTransferTimelineBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferTimelineFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.posttransfer.TransferTimelineFragment$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class TransferTimelineFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentTransferTimelineBinding> {
    public static final TransferTimelineFragment2 INSTANCE = new TransferTimelineFragment2();

    TransferTimelineFragment2() {
        super(1, FragmentTransferTimelineBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/posttransfer/databinding/FragmentTransferTimelineBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentTransferTimelineBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentTransferTimelineBinding.bind(p0);
    }
}
