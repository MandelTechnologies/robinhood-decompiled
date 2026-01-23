package com.robinhood.android.rhymigration.p245ui.openaccount;

import android.view.View;
import com.robinhood.android.rhymigration.databinding.FragmentRhyOpenAccountBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyOpenAccountFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.rhymigration.ui.openaccount.RhyOpenAccountFragment$binding$2, reason: use source file name */
/* loaded from: classes5.dex */
/* synthetic */ class RhyOpenAccountFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRhyOpenAccountBinding> {
    public static final RhyOpenAccountFragment2 INSTANCE = new RhyOpenAccountFragment2();

    RhyOpenAccountFragment2() {
        super(1, FragmentRhyOpenAccountBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/rhymigration/databinding/FragmentRhyOpenAccountBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRhyOpenAccountBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRhyOpenAccountBinding.bind(p0);
    }
}
