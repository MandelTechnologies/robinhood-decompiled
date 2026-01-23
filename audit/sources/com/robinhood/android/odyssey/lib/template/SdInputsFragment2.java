package com.robinhood.android.odyssey.lib.template;

import android.view.View;
import com.robinhood.android.lib.odyssey.databinding.FragmentSdInputsBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdInputsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.template.SdInputsFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class SdInputsFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSdInputsBinding> {
    public static final SdInputsFragment2 INSTANCE = new SdInputsFragment2();

    SdInputsFragment2() {
        super(1, FragmentSdInputsBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdInputsBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSdInputsBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSdInputsBinding.bind(p0);
    }
}
