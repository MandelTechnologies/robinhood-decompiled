package com.robinhood.android.margin.p174ui.daytrade;

import android.view.View;
import com.robinhood.android.margin.databinding.FragmentDayTradeInfoIntroBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DayTradeInfoIntroFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.ui.daytrade.DayTradeInfoIntroFragment$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class DayTradeInfoIntroFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentDayTradeInfoIntroBinding> {
    public static final DayTradeInfoIntroFragment2 INSTANCE = new DayTradeInfoIntroFragment2();

    DayTradeInfoIntroFragment2() {
        super(1, FragmentDayTradeInfoIntroBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/margin/databinding/FragmentDayTradeInfoIntroBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentDayTradeInfoIntroBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentDayTradeInfoIntroBinding.bind(p0);
    }
}
