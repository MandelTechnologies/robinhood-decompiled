package com.robinhood.shared.posttransfer;

import android.view.View;
import com.robinhood.shared.posttransfer.databinding.FragmentTransferInstantAvailabilityBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferInstantAvailabilityFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.posttransfer.TransferInstantAvailabilityFragment$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class TransferInstantAvailabilityFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentTransferInstantAvailabilityBinding> {
    public static final TransferInstantAvailabilityFragment2 INSTANCE = new TransferInstantAvailabilityFragment2();

    TransferInstantAvailabilityFragment2() {
        super(1, FragmentTransferInstantAvailabilityBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/posttransfer/databinding/FragmentTransferInstantAvailabilityBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentTransferInstantAvailabilityBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentTransferInstantAvailabilityBinding.bind(p0);
    }
}
