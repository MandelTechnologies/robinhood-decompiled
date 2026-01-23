package com.robinhood.android.common.options.upsell.alert;

import android.view.View;
import com.robinhood.android.common.options.databinding.FragmentOptionPostTradeAlertBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionPostTradeAlertFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.options.upsell.alert.OptionPostTradeAlertFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class OptionPostTradeAlertFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentOptionPostTradeAlertBinding> {
    public static final OptionPostTradeAlertFragment2 INSTANCE = new OptionPostTradeAlertFragment2();

    OptionPostTradeAlertFragment2() {
        super(1, FragmentOptionPostTradeAlertBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/options/databinding/FragmentOptionPostTradeAlertBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentOptionPostTradeAlertBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentOptionPostTradeAlertBinding.bind(p0);
    }
}
