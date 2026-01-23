package com.robinhood.android.transfers.wireshistory;

import android.view.View;
import com.robinhood.android.transfers.wireshistory.databinding.FragmentWireDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WireDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.wireshistory.WireDetailFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class WireDetailFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentWireDetailBinding> {
    public static final WireDetailFragment2 INSTANCE = new WireDetailFragment2();

    WireDetailFragment2() {
        super(1, FragmentWireDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/wireshistory/databinding/FragmentWireDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentWireDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentWireDetailBinding.bind(p0);
    }
}
