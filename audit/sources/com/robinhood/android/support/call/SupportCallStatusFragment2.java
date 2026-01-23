package com.robinhood.android.support.call;

import android.view.View;
import com.robinhood.shared.support.databinding.FragmentSupportCallStatusBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportCallStatusFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.support.call.SupportCallStatusFragment$binding$2, reason: use source file name */
/* loaded from: classes9.dex */
/* synthetic */ class SupportCallStatusFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSupportCallStatusBinding> {
    public static final SupportCallStatusFragment2 INSTANCE = new SupportCallStatusFragment2();

    SupportCallStatusFragment2() {
        super(1, FragmentSupportCallStatusBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/support/databinding/FragmentSupportCallStatusBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSupportCallStatusBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSupportCallStatusBinding.bind(p0);
    }
}
