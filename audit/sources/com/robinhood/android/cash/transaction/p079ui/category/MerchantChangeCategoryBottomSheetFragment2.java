package com.robinhood.android.cash.transaction.p079ui.category;

import android.view.View;
import com.robinhood.android.cash.transaction.databinding.MerchantCategoryBottomSheetFragmentBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MerchantChangeCategoryBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.transaction.ui.category.MerchantChangeCategoryBottomSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class MerchantChangeCategoryBottomSheetFragment2 extends FunctionReferenceImpl implements Function1<View, MerchantCategoryBottomSheetFragmentBinding> {
    public static final MerchantChangeCategoryBottomSheetFragment2 INSTANCE = new MerchantChangeCategoryBottomSheetFragment2();

    MerchantChangeCategoryBottomSheetFragment2() {
        super(1, MerchantCategoryBottomSheetFragmentBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/transaction/databinding/MerchantCategoryBottomSheetFragmentBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final MerchantCategoryBottomSheetFragmentBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return MerchantCategoryBottomSheetFragmentBinding.bind(p0);
    }
}
