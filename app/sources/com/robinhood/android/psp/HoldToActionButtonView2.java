package com.robinhood.android.psp;

import android.view.View;
import com.robinhood.android.psp.databinding.MergeHoldToActionButtonComposeViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HoldToActionButtonView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.psp.HoldToActionButtonView$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class HoldToActionButtonView2 extends FunctionReferenceImpl implements Function1<View, MergeHoldToActionButtonComposeViewBinding> {
    public static final HoldToActionButtonView2 INSTANCE = new HoldToActionButtonView2();

    HoldToActionButtonView2() {
        super(1, MergeHoldToActionButtonComposeViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/psp/databinding/MergeHoldToActionButtonComposeViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeHoldToActionButtonComposeViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeHoldToActionButtonComposeViewBinding.bind(p0);
    }
}
