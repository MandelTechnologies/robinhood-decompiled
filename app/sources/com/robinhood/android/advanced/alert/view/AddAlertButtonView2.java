package com.robinhood.android.advanced.alert.view;

import android.view.View;
import com.robinhood.android.advanced.alert.databinding.MergeAddAlertButtonViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddAlertButtonView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advanced.alert.view.AddAlertButtonView$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AddAlertButtonView2 extends FunctionReferenceImpl implements Function1<View, MergeAddAlertButtonViewBinding> {
    public static final AddAlertButtonView2 INSTANCE = new AddAlertButtonView2();

    AddAlertButtonView2() {
        super(1, MergeAddAlertButtonViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/advanced/alert/databinding/MergeAddAlertButtonViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeAddAlertButtonViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeAddAlertButtonViewBinding.bind(p0);
    }
}
