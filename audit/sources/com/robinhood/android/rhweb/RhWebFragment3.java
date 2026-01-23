package com.robinhood.android.rhweb;

import android.view.View;
import com.robinhood.android.rhweb.databinding.FragmentRhwebBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhWebFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhweb.RhWebFragment$bindings$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class RhWebFragment3 extends FunctionReferenceImpl implements Function1<View, FragmentRhwebBinding> {
    public static final RhWebFragment3 INSTANCE = new RhWebFragment3();

    RhWebFragment3() {
        super(1, FragmentRhwebBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/rhweb/databinding/FragmentRhwebBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRhwebBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRhwebBinding.bind(p0);
    }
}
