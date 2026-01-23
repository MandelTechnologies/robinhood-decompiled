package com.robinhood.android.cash.rhy.tab.p077v2;

import android.view.View;
import com.robinhood.android.cash.rhy.tab.databinding.FragmentRhyFullScreenInfoBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyFullScreenInfoFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.rhy.tab.v2.RhyFullScreenInfoFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class RhyFullScreenInfoFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRhyFullScreenInfoBinding> {
    public static final RhyFullScreenInfoFragment2 INSTANCE = new RhyFullScreenInfoFragment2();

    RhyFullScreenInfoFragment2() {
        super(1, FragmentRhyFullScreenInfoBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/rhy/tab/databinding/FragmentRhyFullScreenInfoBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRhyFullScreenInfoBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRhyFullScreenInfoBinding.bind(p0);
    }
}
