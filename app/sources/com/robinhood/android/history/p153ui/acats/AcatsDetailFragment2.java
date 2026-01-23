package com.robinhood.android.history.p153ui.acats;

import android.view.View;
import com.robinhood.android.history.databinding.FragmentAcatsInDetailBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsDetailFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.history.ui.acats.AcatsDetailFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class AcatsDetailFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAcatsInDetailBinding> {
    public static final AcatsDetailFragment2 INSTANCE = new AcatsDetailFragment2();

    AcatsDetailFragment2() {
        super(1, FragmentAcatsInDetailBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/history/databinding/FragmentAcatsInDetailBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAcatsInDetailBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAcatsInDetailBinding.bind(p0);
    }
}
