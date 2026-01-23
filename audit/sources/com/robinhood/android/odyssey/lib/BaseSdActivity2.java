package com.robinhood.android.odyssey.lib;

import android.view.View;
import com.robinhood.android.common.databinding.ActivityFragmentContainerBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseSdActivity.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.BaseSdActivity$bindings$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class BaseSdActivity2 extends FunctionReferenceImpl implements Function1<View, ActivityFragmentContainerBinding> {
    public static final BaseSdActivity2 INSTANCE = new BaseSdActivity2();

    BaseSdActivity2() {
        super(1, ActivityFragmentContainerBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/databinding/ActivityFragmentContainerBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ActivityFragmentContainerBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ActivityFragmentContainerBinding.bind(p0);
    }
}
