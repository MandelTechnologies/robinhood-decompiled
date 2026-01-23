package com.robinhood.android.transfers.p271ui.robinhood3ds;

import android.view.View;
import com.robinhood.android.transfers.databinding.FragmentThreeDSWebViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreeDSWebViewFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.robinhood3ds.ThreeDSWebViewFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class ThreeDSWebViewFragment4 extends FunctionReferenceImpl implements Function1<View, FragmentThreeDSWebViewBinding> {
    public static final ThreeDSWebViewFragment4 INSTANCE = new ThreeDSWebViewFragment4();

    ThreeDSWebViewFragment4() {
        super(1, FragmentThreeDSWebViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/transfers/databinding/FragmentThreeDSWebViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentThreeDSWebViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentThreeDSWebViewBinding.bind(p0);
    }
}
