package com.robinhood.android.odyssey.lib.template;

import android.view.View;
import com.robinhood.android.lib.odyssey.databinding.FragmentSdScrollingMarkdownBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdScrollingMarkdownFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.template.SdScrollingMarkdownFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class SdScrollingMarkdownFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSdScrollingMarkdownBinding> {
    public static final SdScrollingMarkdownFragment2 INSTANCE = new SdScrollingMarkdownFragment2();

    SdScrollingMarkdownFragment2() {
        super(1, FragmentSdScrollingMarkdownBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdScrollingMarkdownBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSdScrollingMarkdownBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSdScrollingMarkdownBinding.bind(p0);
    }
}
