package com.robinhood.android.employment.p114ui;

import android.view.View;
import com.robinhood.android.employment.databinding.FragmentChooseEmployerBottomSheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChooseEmployerBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.employment.ui.ChooseEmployerBottomSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class ChooseEmployerBottomSheetFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentChooseEmployerBottomSheetBinding> {
    public static final ChooseEmployerBottomSheetFragment2 INSTANCE = new ChooseEmployerBottomSheetFragment2();

    ChooseEmployerBottomSheetFragment2() {
        super(1, FragmentChooseEmployerBottomSheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/employment/databinding/FragmentChooseEmployerBottomSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentChooseEmployerBottomSheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentChooseEmployerBottomSheetBinding.bind(p0);
    }
}
