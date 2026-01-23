package com.robinhood.android.equitydetail.p123ui.ipo;

import android.view.View;
import com.robinhood.android.equitydetail.databinding.MergeIpoHeaderBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IpoHeaderView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.ipo.IpoHeaderView$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class IpoHeaderView2 extends FunctionReferenceImpl implements Function1<View, MergeIpoHeaderBinding> {
    public static final IpoHeaderView2 INSTANCE = new IpoHeaderView2();

    IpoHeaderView2() {
        super(1, MergeIpoHeaderBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equitydetail/databinding/MergeIpoHeaderBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeIpoHeaderBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeIpoHeaderBinding.bind(p0);
    }
}
