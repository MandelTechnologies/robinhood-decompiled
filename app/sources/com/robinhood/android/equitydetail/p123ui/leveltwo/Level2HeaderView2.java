package com.robinhood.android.equitydetail.p123ui.leveltwo;

import android.view.View;
import com.robinhood.android.equitydetail.databinding.IncludeLevel2HeaderBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Level2HeaderView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equitydetail.ui.leveltwo.Level2HeaderView$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class Level2HeaderView2 extends FunctionReferenceImpl implements Function1<View, IncludeLevel2HeaderBinding> {
    public static final Level2HeaderView2 INSTANCE = new Level2HeaderView2();

    Level2HeaderView2() {
        super(1, IncludeLevel2HeaderBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equitydetail/databinding/IncludeLevel2HeaderBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final IncludeLevel2HeaderBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return IncludeLevel2HeaderBinding.bind(p0);
    }
}
