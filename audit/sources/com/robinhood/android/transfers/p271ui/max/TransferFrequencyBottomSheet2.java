package com.robinhood.android.transfers.p271ui.max;

import android.view.View;
import com.robinhood.android.transfers.databinding.FragmentTransferFrequencyBottomSheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferFrequencyBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.TransferFrequencyBottomSheet$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class TransferFrequencyBottomSheet2 extends FunctionReferenceImpl implements Function1<View, FragmentTransferFrequencyBottomSheetBinding> {
    public static final TransferFrequencyBottomSheet2 INSTANCE = new TransferFrequencyBottomSheet2();

    TransferFrequencyBottomSheet2() {
        super(1, FragmentTransferFrequencyBottomSheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/databinding/FragmentTransferFrequencyBottomSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentTransferFrequencyBottomSheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentTransferFrequencyBottomSheetBinding.bind(p0);
    }
}
