package com.robinhood.android.acatsin;

import android.view.View;
import com.robinhood.android.common.p088ui.databinding.ActivityFragmentContainerWithRdsLoadingViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.AcatsInActivity$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsInActivity2 extends FunctionReferenceImpl implements Function1<View, ActivityFragmentContainerWithRdsLoadingViewBinding> {
    public static final AcatsInActivity2 INSTANCE = new AcatsInActivity2();

    AcatsInActivity2() {
        super(1, ActivityFragmentContainerWithRdsLoadingViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ActivityFragmentContainerWithRdsLoadingViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ActivityFragmentContainerWithRdsLoadingViewBinding.bind(p0);
    }
}
