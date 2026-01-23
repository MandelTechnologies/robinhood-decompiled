package com.robinhood.android.acats.retries.activity;

import android.view.View;
import com.robinhood.android.common.p088ui.databinding.ActivityFragmentContainerWithRdsLoadingViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsRetriesActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acats.retries.activity.AcatsRetriesActivity$bindings$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsRetriesActivity2 extends FunctionReferenceImpl implements Function1<View, ActivityFragmentContainerWithRdsLoadingViewBinding> {
    public static final AcatsRetriesActivity2 INSTANCE = new AcatsRetriesActivity2();

    AcatsRetriesActivity2() {
        super(1, ActivityFragmentContainerWithRdsLoadingViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/ui/databinding/ActivityFragmentContainerWithRdsLoadingViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ActivityFragmentContainerWithRdsLoadingViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ActivityFragmentContainerWithRdsLoadingViewBinding.bind(p0);
    }
}
