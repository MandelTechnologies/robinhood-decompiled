package com.robinhood.android.equitydetail.p123ui.analystreports;

import android.view.View;
import com.robinhood.android.equitydetail.databinding.FragmentAnalystReportBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AnalystReportFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.analystreports.AnalystReportFragment$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class AnalystReportFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAnalystReportBinding> {
    public static final AnalystReportFragment2 INSTANCE = new AnalystReportFragment2();

    AnalystReportFragment2() {
        super(1, FragmentAnalystReportBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equitydetail/databinding/FragmentAnalystReportBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAnalystReportBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAnalystReportBinding.bind(p0);
    }
}
