package com.robinhood.android.equitydetail.p123ui.etp;

import android.view.View;
import com.robinhood.android.equitydetail.databinding.MergeEtpGridRowViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EtpItemGridRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.etp.EtpItemGridRowView$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EtpItemGridRowView2 extends FunctionReferenceImpl implements Function1<View, MergeEtpGridRowViewBinding> {
    public static final EtpItemGridRowView2 INSTANCE = new EtpItemGridRowView2();

    EtpItemGridRowView2() {
        super(1, MergeEtpGridRowViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equitydetail/databinding/MergeEtpGridRowViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeEtpGridRowViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeEtpGridRowViewBinding.bind(p0);
    }
}
