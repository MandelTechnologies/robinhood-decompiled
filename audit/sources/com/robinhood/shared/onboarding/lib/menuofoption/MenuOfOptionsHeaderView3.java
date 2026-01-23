package com.robinhood.shared.onboarding.lib.menuofoption;

import android.view.View;
import com.robinhood.shared.onboarding.lib.menuofoption.databinding.MergeMenuOfOptionsHeaderBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MenuOfOptionsHeaderView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.onboarding.lib.menuofoption.MenuOfOptionsHeaderView$viewBinding$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class MenuOfOptionsHeaderView3 extends FunctionReferenceImpl implements Function1<View, MergeMenuOfOptionsHeaderBinding> {
    public static final MenuOfOptionsHeaderView3 INSTANCE = new MenuOfOptionsHeaderView3();

    MenuOfOptionsHeaderView3() {
        super(1, MergeMenuOfOptionsHeaderBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/onboarding/lib/menuofoption/databinding/MergeMenuOfOptionsHeaderBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MergeMenuOfOptionsHeaderBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MergeMenuOfOptionsHeaderBinding.bind(p0);
    }
}
