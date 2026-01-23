package com.robinhood.android.transfers;

import android.view.View;
import com.robinhood.android.transfers.transferhub.databinding.FragmentDebitCardBottomSheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebitCardBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.DebitCardBottomSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class DebitCardBottomSheetFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDebitCardBottomSheetBinding> {
    public static final DebitCardBottomSheetFragment2 INSTANCE = new DebitCardBottomSheetFragment2();

    DebitCardBottomSheetFragment2() {
        super(1, FragmentDebitCardBottomSheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/transferhub/databinding/FragmentDebitCardBottomSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDebitCardBottomSheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDebitCardBottomSheetBinding.bind(p0);
    }
}
