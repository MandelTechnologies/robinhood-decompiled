package com.robinhood.android.transfers.p271ui.confirm;

import android.view.View;
import com.robinhood.android.transfers.databinding.FragmentConfirmTransferBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConfirmTransferFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.confirm.ConfirmTransferFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class ConfirmTransferFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentConfirmTransferBinding> {
    public static final ConfirmTransferFragment2 INSTANCE = new ConfirmTransferFragment2();

    ConfirmTransferFragment2() {
        super(1, FragmentConfirmTransferBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/databinding/FragmentConfirmTransferBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentConfirmTransferBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentConfirmTransferBinding.bind(p0);
    }
}
