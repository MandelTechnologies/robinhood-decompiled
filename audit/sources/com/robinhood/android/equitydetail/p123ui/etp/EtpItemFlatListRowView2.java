package com.robinhood.android.equitydetail.p123ui.etp;

import android.view.View;
import com.robinhood.android.equitydetail.databinding.MergeEtpFlatListRowViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EtpItemFlatListRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.etp.EtpItemFlatListRowView$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EtpItemFlatListRowView2 extends FunctionReferenceImpl implements Function1<View, MergeEtpFlatListRowViewBinding> {
    public static final EtpItemFlatListRowView2 INSTANCE = new EtpItemFlatListRowView2();

    EtpItemFlatListRowView2() {
        super(1, MergeEtpFlatListRowViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equitydetail/databinding/MergeEtpFlatListRowViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeEtpFlatListRowViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeEtpFlatListRowViewBinding.bind(p0);
    }
}
