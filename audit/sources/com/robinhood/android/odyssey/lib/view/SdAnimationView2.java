package com.robinhood.android.odyssey.lib.view;

import android.view.View;
import com.robinhood.android.lib.odyssey.databinding.MergeSdAnimationBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdAnimationView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.view.SdAnimationView$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class SdAnimationView2 extends FunctionReferenceImpl implements Function1<View, MergeSdAnimationBinding> {
    public static final SdAnimationView2 INSTANCE = new SdAnimationView2();

    SdAnimationView2() {
        super(1, MergeSdAnimationBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lib/odyssey/databinding/MergeSdAnimationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeSdAnimationBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeSdAnimationBinding.bind(p0);
    }
}
