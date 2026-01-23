package com.robinhood.android.odyssey.lib.template;

import android.view.View;
import com.robinhood.android.lib.odyssey.databinding.FragmentSdActionListBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdActionListFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.template.SdActionListFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class SdActionListFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentSdActionListBinding> {
    public static final SdActionListFragment2 INSTANCE = new SdActionListFragment2();

    SdActionListFragment2() {
        super(1, FragmentSdActionListBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lib/odyssey/databinding/FragmentSdActionListBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSdActionListBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSdActionListBinding.bind(p0);
    }
}
