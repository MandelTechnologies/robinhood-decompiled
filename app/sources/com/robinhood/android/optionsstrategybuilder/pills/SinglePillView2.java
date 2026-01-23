package com.robinhood.android.optionsstrategybuilder.pills;

import android.view.View;
import com.robinhood.android.optionsstrategybuilder.databinding.MergeSinglePillBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SinglePillView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsstrategybuilder.pills.SinglePillView$bindings$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class SinglePillView2 extends FunctionReferenceImpl implements Function1<View, MergeSinglePillBinding> {
    public static final SinglePillView2 INSTANCE = new SinglePillView2();

    SinglePillView2() {
        super(1, MergeSinglePillBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionsstrategybuilder/databinding/MergeSinglePillBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeSinglePillBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeSinglePillBinding.bind(p0);
    }
}
