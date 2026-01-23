package com.robinhood.android.lib.webview.p172ui;

import android.view.View;
import com.robinhood.android.lib.webview.databinding.FragmentEmbeddedWebviewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhEmbeddedWebviewFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.webview.ui.RhEmbeddedWebviewFragment$binding$2, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class RhEmbeddedWebviewFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentEmbeddedWebviewBinding> {
    public static final RhEmbeddedWebviewFragment2 INSTANCE = new RhEmbeddedWebviewFragment2();

    RhEmbeddedWebviewFragment2() {
        super(1, FragmentEmbeddedWebviewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lib/webview/databinding/FragmentEmbeddedWebviewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentEmbeddedWebviewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentEmbeddedWebviewBinding.bind(p0);
    }
}
