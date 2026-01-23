package com.robinhood.android.employment.p114ui;

import android.view.View;
import com.robinhood.android.employment.databinding.FragmentChooseEmployerBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChooseEmployerFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.employment.ui.ChooseEmployerFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class ChooseEmployerFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentChooseEmployerBinding> {
    public static final ChooseEmployerFragment2 INSTANCE = new ChooseEmployerFragment2();

    ChooseEmployerFragment2() {
        super(1, FragmentChooseEmployerBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/employment/databinding/FragmentChooseEmployerBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentChooseEmployerBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentChooseEmployerBinding.bind(p0);
    }
}
