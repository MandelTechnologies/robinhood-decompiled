package com.robinhood.android.snacks.p257ui;

import android.view.View;
import com.robinhood.android.snacks.databinding.FragmentSnacksSubscribeBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SnacksSubscribeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.snacks.ui.SnacksSubscribeFragment$viewBinding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class SnacksSubscribeFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSnacksSubscribeBinding> {
    public static final SnacksSubscribeFragment2 INSTANCE = new SnacksSubscribeFragment2();

    SnacksSubscribeFragment2() {
        super(1, FragmentSnacksSubscribeBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/snacks/databinding/FragmentSnacksSubscribeBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSnacksSubscribeBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSnacksSubscribeBinding.bind(p0);
    }
}
