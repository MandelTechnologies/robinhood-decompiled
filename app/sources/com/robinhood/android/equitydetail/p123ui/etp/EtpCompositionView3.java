package com.robinhood.android.equitydetail.p123ui.etp;

import android.view.View;
import com.robinhood.android.equitydetail.databinding.MergeEtpCompositionViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EtpCompositionView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.etp.EtpCompositionView$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EtpCompositionView3 extends FunctionReferenceImpl implements Function1<View, MergeEtpCompositionViewBinding> {
    public static final EtpCompositionView3 INSTANCE = new EtpCompositionView3();

    EtpCompositionView3() {
        super(1, MergeEtpCompositionViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equitydetail/databinding/MergeEtpCompositionViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeEtpCompositionViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeEtpCompositionViewBinding.bind(p0);
    }
}
