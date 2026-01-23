package com.robinhood.android.equitydetail.p123ui.options;

import android.view.View;
import com.robinhood.android.equitydetail.databinding.MergeInstrumentStrategiesViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentDetailOptionStrategyHeaderView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.options.InstrumentDetailOptionStrategyHeaderView$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class InstrumentDetailOptionStrategyHeaderView2 extends FunctionReferenceImpl implements Function1<View, MergeInstrumentStrategiesViewBinding> {
    public static final InstrumentDetailOptionStrategyHeaderView2 INSTANCE = new InstrumentDetailOptionStrategyHeaderView2();

    InstrumentDetailOptionStrategyHeaderView2() {
        super(1, MergeInstrumentStrategiesViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equitydetail/databinding/MergeInstrumentStrategiesViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeInstrumentStrategiesViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeInstrumentStrategiesViewBinding.bind(p0);
    }
}
