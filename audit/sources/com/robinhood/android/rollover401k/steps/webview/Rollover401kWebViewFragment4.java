package com.robinhood.android.rollover401k.steps.webview;

import android.view.View;
import com.robinhood.android.rollover401k.databinding.Fragment401kRolloverWebviewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Rollover401kWebViewFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rollover401k.steps.webview.Rollover401kWebViewFragment$viewBinding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class Rollover401kWebViewFragment4 extends FunctionReferenceImpl implements Function1<View, Fragment401kRolloverWebviewBinding> {
    public static final Rollover401kWebViewFragment4 INSTANCE = new Rollover401kWebViewFragment4();

    Rollover401kWebViewFragment4() {
        super(1, Fragment401kRolloverWebviewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/rollover401k/databinding/Fragment401kRolloverWebviewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Fragment401kRolloverWebviewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return Fragment401kRolloverWebviewBinding.bind(p0);
    }
}
