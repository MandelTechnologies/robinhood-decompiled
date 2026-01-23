package com.robinhood.android.gold.level2;

import android.view.View;
import com.robinhood.android.gold.upgrade.databinding.FragmentGoldLevel2PromoBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GoldLevel2PromoFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.level2.GoldLevel2PromoFragment$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class GoldLevel2PromoFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentGoldLevel2PromoBinding> {
    public static final GoldLevel2PromoFragment2 INSTANCE = new GoldLevel2PromoFragment2();

    GoldLevel2PromoFragment2() {
        super(1, FragmentGoldLevel2PromoBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/gold/upgrade/databinding/FragmentGoldLevel2PromoBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentGoldLevel2PromoBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentGoldLevel2PromoBinding.bind(p0);
    }
}
