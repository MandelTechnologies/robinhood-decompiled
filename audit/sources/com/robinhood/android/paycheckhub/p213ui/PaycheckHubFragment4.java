package com.robinhood.android.paycheckhub.p213ui;

import android.view.View;
import com.robinhood.android.paycheckhub.databinding.FragmentPaycheckHubBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PaycheckHubFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.paycheckhub.ui.PaycheckHubFragment$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class PaycheckHubFragment4 extends FunctionReferenceImpl implements Function1<View, FragmentPaycheckHubBinding> {
    public static final PaycheckHubFragment4 INSTANCE = new PaycheckHubFragment4();

    PaycheckHubFragment4() {
        super(1, FragmentPaycheckHubBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/paycheckhub/databinding/FragmentPaycheckHubBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentPaycheckHubBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentPaycheckHubBinding.bind(p0);
    }
}
