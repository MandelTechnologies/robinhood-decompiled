package com.robinhood.android.onboarding.p205ui.postusercreation;

import android.view.View;
import com.robinhood.android.common.p088ui.databinding.ActivityRdsLoadingBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PostUserCreationShimActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.onboarding.ui.postusercreation.PostUserCreationShimActivity$bindings$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class PostUserCreationShimActivity2 extends FunctionReferenceImpl implements Function1<View, ActivityRdsLoadingBinding> {
    public static final PostUserCreationShimActivity2 INSTANCE = new PostUserCreationShimActivity2();

    PostUserCreationShimActivity2() {
        super(1, ActivityRdsLoadingBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/ui/databinding/ActivityRdsLoadingBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ActivityRdsLoadingBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ActivityRdsLoadingBinding.bind(p0);
    }
}
