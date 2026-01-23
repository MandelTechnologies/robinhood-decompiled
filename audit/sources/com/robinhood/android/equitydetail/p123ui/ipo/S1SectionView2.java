package com.robinhood.android.equitydetail.p123ui.ipo;

import android.view.View;
import com.robinhood.android.equitydetail.databinding.MergeS1SectionViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: S1SectionView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.ipo.S1SectionView$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class S1SectionView2 extends FunctionReferenceImpl implements Function1<View, MergeS1SectionViewBinding> {
    public static final S1SectionView2 INSTANCE = new S1SectionView2();

    S1SectionView2() {
        super(1, MergeS1SectionViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equitydetail/databinding/MergeS1SectionViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeS1SectionViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeS1SectionViewBinding.bind(p0);
    }
}
