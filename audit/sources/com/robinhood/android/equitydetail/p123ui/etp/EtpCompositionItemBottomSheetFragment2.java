package com.robinhood.android.equitydetail.p123ui.etp;

import android.view.View;
import com.robinhood.android.equitydetail.databinding.FragmentEtpItemBottomSheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EtpCompositionItemBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.etp.EtpCompositionItemBottomSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class EtpCompositionItemBottomSheetFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentEtpItemBottomSheetBinding> {
    public static final EtpCompositionItemBottomSheetFragment2 INSTANCE = new EtpCompositionItemBottomSheetFragment2();

    EtpCompositionItemBottomSheetFragment2() {
        super(1, FragmentEtpItemBottomSheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equitydetail/databinding/FragmentEtpItemBottomSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentEtpItemBottomSheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentEtpItemBottomSheetBinding.bind(p0);
    }
}
