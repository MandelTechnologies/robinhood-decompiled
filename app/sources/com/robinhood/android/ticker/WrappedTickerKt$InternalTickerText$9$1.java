package com.robinhood.android.ticker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.robinhood.android.ticker.databinding.RegularSmallTickerViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WrappedTicker.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
/* synthetic */ class WrappedTickerKt$InternalTickerText$9$1 extends FunctionReferenceImpl implements Function3<LayoutInflater, ViewGroup, Boolean, RegularSmallTickerViewBinding> {
    public static final WrappedTickerKt$InternalTickerText$9$1 INSTANCE = new WrappedTickerKt$InternalTickerText$9$1();

    WrappedTickerKt$InternalTickerText$9$1() {
        super(3, RegularSmallTickerViewBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lcom/robinhood/android/ticker/databinding/RegularSmallTickerViewBinding;", 0);
    }

    public final RegularSmallTickerViewBinding invoke(LayoutInflater p0, ViewGroup viewGroup, boolean z) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return RegularSmallTickerViewBinding.inflate(p0, viewGroup, z);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ RegularSmallTickerViewBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }
}
