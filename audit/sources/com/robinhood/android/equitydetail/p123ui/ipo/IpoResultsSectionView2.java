package com.robinhood.android.equitydetail.p123ui.ipo;

import android.view.View;
import com.robinhood.android.equitydetail.databinding.MergeIpoResultsSectionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IpoResultsSectionView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.ipo.IpoResultsSectionView$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class IpoResultsSectionView2 extends FunctionReferenceImpl implements Function1<View, MergeIpoResultsSectionBinding> {
    public static final IpoResultsSectionView2 INSTANCE = new IpoResultsSectionView2();

    IpoResultsSectionView2() {
        super(1, MergeIpoResultsSectionBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equitydetail/databinding/MergeIpoResultsSectionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeIpoResultsSectionBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeIpoResultsSectionBinding.bind(p0);
    }
}
