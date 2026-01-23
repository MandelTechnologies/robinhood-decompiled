package com.robinhood.android.common.options.upsell.fridaytrading;

import android.view.View;
import com.robinhood.android.common.options.databinding.FragmentTradeOnExpirationUpsellBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TradeOnExpirationUpsellFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.options.upsell.fridaytrading.TradeOnExpirationUpsellFragment$bindings$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class TradeOnExpirationUpsellFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentTradeOnExpirationUpsellBinding> {
    public static final TradeOnExpirationUpsellFragment2 INSTANCE = new TradeOnExpirationUpsellFragment2();

    TradeOnExpirationUpsellFragment2() {
        super(1, FragmentTradeOnExpirationUpsellBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/options/databinding/FragmentTradeOnExpirationUpsellBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentTradeOnExpirationUpsellBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentTradeOnExpirationUpsellBinding.bind(p0);
    }
}
