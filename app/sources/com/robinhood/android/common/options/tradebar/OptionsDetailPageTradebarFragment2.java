package com.robinhood.android.common.options.tradebar;

import android.view.View;
import com.robinhood.android.common.options.tradebar.databinding.IncludeOptionsDetailPageTradeBarBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsDetailPageTradebarFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.options.tradebar.OptionsDetailPageTradebarFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class OptionsDetailPageTradebarFragment2 extends FunctionReferenceImpl implements Function1<View, IncludeOptionsDetailPageTradeBarBinding> {
    public static final OptionsDetailPageTradebarFragment2 INSTANCE = new OptionsDetailPageTradebarFragment2();

    OptionsDetailPageTradebarFragment2() {
        super(1, IncludeOptionsDetailPageTradeBarBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/options/tradebar/databinding/IncludeOptionsDetailPageTradeBarBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final IncludeOptionsDetailPageTradeBarBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return IncludeOptionsDetailPageTradeBarBinding.bind(p0);
    }
}
