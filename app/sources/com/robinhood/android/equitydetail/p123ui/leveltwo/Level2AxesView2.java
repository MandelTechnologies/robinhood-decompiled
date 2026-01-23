package com.robinhood.android.equitydetail.p123ui.leveltwo;

import android.view.View;
import com.robinhood.android.equitydetail.databinding.MergeLevel2AxesViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Level2AxesView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.leveltwo.Level2AxesView$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class Level2AxesView2 extends FunctionReferenceImpl implements Function1<View, MergeLevel2AxesViewBinding> {
    public static final Level2AxesView2 INSTANCE = new Level2AxesView2();

    Level2AxesView2() {
        super(1, MergeLevel2AxesViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equitydetail/databinding/MergeLevel2AxesViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeLevel2AxesViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeLevel2AxesViewBinding.bind(p0);
    }
}
