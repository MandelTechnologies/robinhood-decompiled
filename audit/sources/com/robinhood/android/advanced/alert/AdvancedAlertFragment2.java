package com.robinhood.android.advanced.alert;

import android.view.View;
import com.robinhood.android.advanced.alert.databinding.FragmentAdvancedAlertV2Binding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedAlertFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertFragment$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AdvancedAlertFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAdvancedAlertV2Binding> {
    public static final AdvancedAlertFragment2 INSTANCE = new AdvancedAlertFragment2();

    AdvancedAlertFragment2() {
        super(1, FragmentAdvancedAlertV2Binding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/advanced/alert/databinding/FragmentAdvancedAlertV2Binding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAdvancedAlertV2Binding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAdvancedAlertV2Binding.bind(p0);
    }
}
