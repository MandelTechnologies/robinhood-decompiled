package com.robinhood.android.acatsin.partials.search;

import android.view.View;
import com.robinhood.android.acats.p057ui.databinding.FragmentAcatsInSearchEquitySymbolBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInSearchEquityFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.partials.search.AcatsInSearchEquityFragment$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AcatsInSearchEquityFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAcatsInSearchEquitySymbolBinding> {
    public static final AcatsInSearchEquityFragment2 INSTANCE = new AcatsInSearchEquityFragment2();

    AcatsInSearchEquityFragment2() {
        super(1, FragmentAcatsInSearchEquitySymbolBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/acats/ui/databinding/FragmentAcatsInSearchEquitySymbolBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAcatsInSearchEquitySymbolBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAcatsInSearchEquitySymbolBinding.bind(p0);
    }
}
