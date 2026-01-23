package com.robinhood.android.acatsin.namechange;

import android.view.View;
import com.robinhood.android.acatsin.databinding.FragmentAcatsInNameChangeBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInNameChangeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.namechange.AcatsInNameChangeFragment$viewBinding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsInNameChangeFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAcatsInNameChangeBinding> {
    public static final AcatsInNameChangeFragment2 INSTANCE = new AcatsInNameChangeFragment2();

    AcatsInNameChangeFragment2() {
        super(1, FragmentAcatsInNameChangeBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInNameChangeBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAcatsInNameChangeBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAcatsInNameChangeBinding.bind(p0);
    }
}
