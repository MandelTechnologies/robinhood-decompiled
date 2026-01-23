package com.robinhood.android.margin.p174ui.daytrade;

import android.view.View;
import com.robinhood.android.margin.databinding.FragmentDayTradeInfoStepBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DayTradeInfoStepsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.ui.daytrade.DayTradeInfoStepsFragment$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class DayTradeInfoStepsFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDayTradeInfoStepBinding> {
    public static final DayTradeInfoStepsFragment2 INSTANCE = new DayTradeInfoStepsFragment2();

    DayTradeInfoStepsFragment2() {
        super(1, FragmentDayTradeInfoStepBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/margin/databinding/FragmentDayTradeInfoStepBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDayTradeInfoStepBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDayTradeInfoStepBinding.bind(p0);
    }
}
