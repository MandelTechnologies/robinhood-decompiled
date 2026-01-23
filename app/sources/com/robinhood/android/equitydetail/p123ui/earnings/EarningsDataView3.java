package com.robinhood.android.equitydetail.p123ui.earnings;

import android.view.View;
import com.robinhood.android.equitydetail.databinding.IncludeEarningsDataViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EarningsDataView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.earnings.EarningsDataView$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EarningsDataView3 extends FunctionReferenceImpl implements Function1<View, IncludeEarningsDataViewBinding> {
    public static final EarningsDataView3 INSTANCE = new EarningsDataView3();

    EarningsDataView3() {
        super(1, IncludeEarningsDataViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equitydetail/databinding/IncludeEarningsDataViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final IncludeEarningsDataViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return IncludeEarningsDataViewBinding.bind(p0);
    }
}
