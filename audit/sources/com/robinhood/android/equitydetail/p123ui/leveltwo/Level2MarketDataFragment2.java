package com.robinhood.android.equitydetail.p123ui.leveltwo;

import android.view.View;
import com.robinhood.android.equitydetail.databinding.FragmentLevel2Binding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Level2MarketDataFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.leveltwo.Level2MarketDataFragment$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class Level2MarketDataFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentLevel2Binding> {
    public static final Level2MarketDataFragment2 INSTANCE = new Level2MarketDataFragment2();

    Level2MarketDataFragment2() {
        super(1, FragmentLevel2Binding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equitydetail/databinding/FragmentLevel2Binding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentLevel2Binding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentLevel2Binding.bind(p0);
    }
}
