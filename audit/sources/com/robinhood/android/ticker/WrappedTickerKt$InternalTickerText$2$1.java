package com.robinhood.android.ticker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.robinhood.android.ticker.databinding.DisplayTickerMediumViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WrappedTicker.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
/* synthetic */ class WrappedTickerKt$InternalTickerText$2$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, DisplayTickerMediumViewBinding> {
    public static final WrappedTickerKt$InternalTickerText$2$1 INSTANCE = new WrappedTickerKt$InternalTickerText$2$1();

    WrappedTickerKt$InternalTickerText$2$1() {
        super(3, DisplayTickerMediumViewBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/robinhood/android/ticker/databinding/DisplayTickerMediumViewBinding;", 0);
    }

    public final DisplayTickerMediumViewBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return DisplayTickerMediumViewBinding.inflate(p0, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ DisplayTickerMediumViewBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }
}
