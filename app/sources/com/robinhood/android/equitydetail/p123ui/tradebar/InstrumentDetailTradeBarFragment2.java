package com.robinhood.android.equitydetail.p123ui.tradebar;

import android.view.View;
import com.robinhood.android.equitydetail.databinding.FragmentInstrumentDetailTradeBarBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InstrumentDetailTradeBarFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.tradebar.InstrumentDetailTradeBarFragment$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class InstrumentDetailTradeBarFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentInstrumentDetailTradeBarBinding> {
    public static final InstrumentDetailTradeBarFragment2 INSTANCE = new InstrumentDetailTradeBarFragment2();

    InstrumentDetailTradeBarFragment2() {
        super(1, FragmentInstrumentDetailTradeBarBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equitydetail/databinding/FragmentInstrumentDetailTradeBarBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentInstrumentDetailTradeBarBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentInstrumentDetailTradeBarBinding.bind(p0);
    }
}
