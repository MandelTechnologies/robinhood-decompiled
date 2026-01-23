package com.robinhood.android.transfers.ach.p265ui;

import android.view.View;
import com.robinhood.android.transfers.ach.databinding.FragmentCreateAchTransferBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseCreateAchTransferFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ach.ui.BaseCreateAchTransferFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class BaseCreateAchTransferFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentCreateAchTransferBinding> {
    public static final BaseCreateAchTransferFragment2 INSTANCE = new BaseCreateAchTransferFragment2();

    BaseCreateAchTransferFragment2() {
        super(1, FragmentCreateAchTransferBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/ach/databinding/FragmentCreateAchTransferBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentCreateAchTransferBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentCreateAchTransferBinding.bind(p0);
    }
}
