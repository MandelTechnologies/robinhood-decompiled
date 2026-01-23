package com.robinhood.android.feature.instantinfo.p137ui;

import android.view.View;
import com.robinhood.android.feature_instant_info.databinding.MergeInstantInfoCtaViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstantInfoCtaView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.instantinfo.ui.InstantInfoCtaView$viewBinding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class InstantInfoCtaView2 extends FunctionReferenceImpl implements Function1<View, MergeInstantInfoCtaViewBinding> {
    public static final InstantInfoCtaView2 INSTANCE = new InstantInfoCtaView2();

    InstantInfoCtaView2() {
        super(1, MergeInstantInfoCtaViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/feature_instant_info/databinding/MergeInstantInfoCtaViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeInstantInfoCtaViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeInstantInfoCtaViewBinding.bind(p0);
    }
}
