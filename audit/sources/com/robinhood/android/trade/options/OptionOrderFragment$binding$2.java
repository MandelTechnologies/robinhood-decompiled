package com.robinhood.android.trade.options;

import android.view.View;
import com.robinhood.android.trade.options.databinding.MergeOptionOrderBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionOrderFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
/* synthetic */ class OptionOrderFragment$binding$2 extends FunctionReferenceImpl implements Function1<View, MergeOptionOrderBinding> {
    public static final OptionOrderFragment$binding$2 INSTANCE = new OptionOrderFragment$binding$2();

    OptionOrderFragment$binding$2() {
        super(1, MergeOptionOrderBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/trade/options/databinding/MergeOptionOrderBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeOptionOrderBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeOptionOrderBinding.bind(p0);
    }
}
