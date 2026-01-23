package com.robinhood.android.shareholderexperience.askquestion;

import android.view.View;
import com.robinhood.android.shareholderexperience.databinding.FragmentAskQuestionBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AskQuestionFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.shareholderexperience.askquestion.AskQuestionFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class AskQuestionFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAskQuestionBinding> {
    public static final AskQuestionFragment2 INSTANCE = new AskQuestionFragment2();

    AskQuestionFragment2() {
        super(1, FragmentAskQuestionBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/shareholderexperience/databinding/FragmentAskQuestionBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAskQuestionBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAskQuestionBinding.bind(p0);
    }
}
