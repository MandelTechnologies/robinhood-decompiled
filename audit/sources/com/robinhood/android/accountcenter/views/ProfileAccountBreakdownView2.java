package com.robinhood.android.accountcenter.views;

import android.view.View;
import com.robinhood.android.accountcenter.databinding.MergeProfileAccountBreakdownViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProfileAccountBreakdownView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.accountcenter.views.ProfileAccountBreakdownView$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class ProfileAccountBreakdownView2 extends FunctionReferenceImpl implements Function1<View, MergeProfileAccountBreakdownViewBinding> {
    public static final ProfileAccountBreakdownView2 INSTANCE = new ProfileAccountBreakdownView2();

    ProfileAccountBreakdownView2() {
        super(1, MergeProfileAccountBreakdownViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/accountcenter/databinding/MergeProfileAccountBreakdownViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeProfileAccountBreakdownViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeProfileAccountBreakdownViewBinding.bind(p0);
    }
}
