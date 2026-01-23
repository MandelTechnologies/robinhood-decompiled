package com.robinhood.android.prompts;

import android.view.View;
import com.robinhood.android.prompts.databinding.FragmentPromptsEnrollmentBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PromptsEnrollmentFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.prompts.PromptsEnrollmentFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class PromptsEnrollmentFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentPromptsEnrollmentBinding> {
    public static final PromptsEnrollmentFragment2 INSTANCE = new PromptsEnrollmentFragment2();

    PromptsEnrollmentFragment2() {
        super(1, FragmentPromptsEnrollmentBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/prompts/databinding/FragmentPromptsEnrollmentBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentPromptsEnrollmentBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentPromptsEnrollmentBinding.bind(p0);
    }
}
