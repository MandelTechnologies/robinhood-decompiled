package com.robinhood.android.employment.p114ui;

import android.view.View;
import com.robinhood.android.employment.databinding.FragmentChooseEmploymentStatusBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChooseEmploymentStatusFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.employment.ui.ChooseEmploymentStatusFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class ChooseEmploymentStatusFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentChooseEmploymentStatusBinding> {
    public static final ChooseEmploymentStatusFragment2 INSTANCE = new ChooseEmploymentStatusFragment2();

    ChooseEmploymentStatusFragment2() {
        super(1, FragmentChooseEmploymentStatusBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/employment/databinding/FragmentChooseEmploymentStatusBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentChooseEmploymentStatusBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentChooseEmploymentStatusBinding.bind(p0);
    }
}
