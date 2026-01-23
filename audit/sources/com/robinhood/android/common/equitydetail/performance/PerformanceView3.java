package com.robinhood.android.common.equitydetail.performance;

import android.view.View;
import com.robinhood.android.common.equitydetail.databinding.MergePerformanceViewContentBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PerformanceView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.equitydetail.performance.PerformanceView$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class PerformanceView3 extends FunctionReferenceImpl implements Function1<View, MergePerformanceViewContentBinding> {
    public static final PerformanceView3 INSTANCE = new PerformanceView3();

    PerformanceView3() {
        super(1, MergePerformanceViewContentBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/equitydetail/databinding/MergePerformanceViewContentBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergePerformanceViewContentBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergePerformanceViewContentBinding.bind(p0);
    }
}
