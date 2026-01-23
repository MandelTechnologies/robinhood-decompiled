package com.robinhood.android.equitydetail.p123ui.shareholderexperience;

import android.view.View;
import com.robinhood.android.equitydetail.databinding.MergeQaEventViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShareholderQaEventView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.shareholderexperience.ShareholderQaEventView$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class ShareholderQaEventView2 extends FunctionReferenceImpl implements Function1<View, MergeQaEventViewBinding> {
    public static final ShareholderQaEventView2 INSTANCE = new ShareholderQaEventView2();

    ShareholderQaEventView2() {
        super(1, MergeQaEventViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equitydetail/databinding/MergeQaEventViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeQaEventViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeQaEventViewBinding.bind(p0);
    }
}
