package com.robinhood.android.cash.disputes.p070ui.question.image;

import android.view.View;
import com.robinhood.android.cash.disputes.databinding.FragmentImageQuestionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ImageQuestionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.disputes.ui.question.image.ImageQuestionFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class ImageQuestionFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentImageQuestionBinding> {
    public static final ImageQuestionFragment2 INSTANCE = new ImageQuestionFragment2();

    ImageQuestionFragment2() {
        super(1, FragmentImageQuestionBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/disputes/databinding/FragmentImageQuestionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentImageQuestionBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentImageQuestionBinding.bind(p0);
    }
}
