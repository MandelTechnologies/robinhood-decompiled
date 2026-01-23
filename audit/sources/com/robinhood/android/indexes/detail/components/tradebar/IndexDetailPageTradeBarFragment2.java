package com.robinhood.android.indexes.detail.components.tradebar;

import android.view.View;
import com.robinhood.android.indexes.detail.databinding.IncludeIndexDetailPageTradeBarBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IndexDetailPageTradeBarFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.indexes.detail.components.tradebar.IndexDetailPageTradeBarFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class IndexDetailPageTradeBarFragment2 extends FunctionReferenceImpl implements Function1<View, IncludeIndexDetailPageTradeBarBinding> {
    public static final IndexDetailPageTradeBarFragment2 INSTANCE = new IndexDetailPageTradeBarFragment2();

    IndexDetailPageTradeBarFragment2() {
        super(1, IncludeIndexDetailPageTradeBarBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/indexes/detail/databinding/IncludeIndexDetailPageTradeBarBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final IncludeIndexDetailPageTradeBarBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return IncludeIndexDetailPageTradeBarBinding.bind(p0);
    }
}
