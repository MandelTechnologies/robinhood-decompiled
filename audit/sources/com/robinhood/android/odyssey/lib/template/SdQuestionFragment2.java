package com.robinhood.android.odyssey.lib.template;

import android.view.View;
import com.robinhood.android.lib.odyssey.databinding.FragmentSdQuestionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdQuestionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.template.SdQuestionFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class SdQuestionFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSdQuestionBinding> {
    public static final SdQuestionFragment2 INSTANCE = new SdQuestionFragment2();

    SdQuestionFragment2() {
        super(1, FragmentSdQuestionBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdQuestionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSdQuestionBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSdQuestionBinding.bind(p0);
    }
}
