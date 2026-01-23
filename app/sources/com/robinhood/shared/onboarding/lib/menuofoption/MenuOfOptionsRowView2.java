package com.robinhood.shared.onboarding.lib.menuofoption;

import android.view.View;
import com.robinhood.shared.onboarding.lib.menuofoption.databinding.MergeMenuOfOptionsRowViewBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MenuOfOptionsRowView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsRowView$binding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class MenuOfOptionsRowView2 extends FunctionReferenceImpl implements Function1<View, MergeMenuOfOptionsRowViewBinding> {
    public static final MenuOfOptionsRowView2 INSTANCE = new MenuOfOptionsRowView2();

    MenuOfOptionsRowView2() {
        super(1, MergeMenuOfOptionsRowViewBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/onboarding/lib/menuofoption/databinding/MergeMenuOfOptionsRowViewBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeMenuOfOptionsRowViewBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeMenuOfOptionsRowViewBinding.bind(p0);
    }
}
