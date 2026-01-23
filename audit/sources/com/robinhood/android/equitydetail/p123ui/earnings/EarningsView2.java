package com.robinhood.android.equitydetail.p123ui.earnings;

import android.view.View;
import com.robinhood.android.equitydetail.databinding.IncludeEarningsViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EarningsView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.earnings.EarningsView$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EarningsView2 extends FunctionReferenceImpl implements Function1<View, IncludeEarningsViewBinding> {
    public static final EarningsView2 INSTANCE = new EarningsView2();

    EarningsView2() {
        super(1, IncludeEarningsViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equitydetail/databinding/IncludeEarningsViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final IncludeEarningsViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return IncludeEarningsViewBinding.bind(p0);
    }
}
