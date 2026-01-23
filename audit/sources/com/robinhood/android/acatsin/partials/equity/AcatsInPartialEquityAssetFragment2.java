package com.robinhood.android.acatsin.partials.equity;

import android.view.View;
import com.robinhood.android.acats.p057ui.databinding.FragmentAcatsInEquityAssetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInPartialEquityAssetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.partials.equity.AcatsInPartialEquityAssetFragment$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsInPartialEquityAssetFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAcatsInEquityAssetBinding> {
    public static final AcatsInPartialEquityAssetFragment2 INSTANCE = new AcatsInPartialEquityAssetFragment2();

    AcatsInPartialEquityAssetFragment2() {
        super(1, FragmentAcatsInEquityAssetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInEquityAssetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAcatsInEquityAssetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAcatsInEquityAssetBinding.bind(p0);
    }
}
