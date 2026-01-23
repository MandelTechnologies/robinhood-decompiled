package com.robinhood.android.optionschain;

import android.view.View;
import com.robinhood.android.optionschain.databinding.ActivityOptionChainBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.OptionChainActivity$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionChainActivity2 extends FunctionReferenceImpl implements Function1<View, ActivityOptionChainBinding> {
    public static final OptionChainActivity2 INSTANCE = new OptionChainActivity2();

    OptionChainActivity2() {
        super(1, ActivityOptionChainBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/optionschain/databinding/ActivityOptionChainBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ActivityOptionChainBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ActivityOptionChainBinding.bind(p0);
    }
}
