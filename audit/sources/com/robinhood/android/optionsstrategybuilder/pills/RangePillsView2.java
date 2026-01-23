package com.robinhood.android.optionsstrategybuilder.pills;

import android.view.View;
import com.robinhood.android.optionsstrategybuilder.databinding.MergeRangePillsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RangePillsView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsstrategybuilder.pills.RangePillsView$bindings$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class RangePillsView2 extends FunctionReferenceImpl implements Function1<View, MergeRangePillsBinding> {
    public static final RangePillsView2 INSTANCE = new RangePillsView2();

    RangePillsView2() {
        super(1, MergeRangePillsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionsstrategybuilder/databinding/MergeRangePillsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeRangePillsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeRangePillsBinding.bind(p0);
    }
}
