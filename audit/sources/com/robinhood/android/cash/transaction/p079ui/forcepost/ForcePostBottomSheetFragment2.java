package com.robinhood.android.cash.transaction.p079ui.forcepost;

import android.view.View;
import com.robinhood.android.cash.transaction.databinding.FragmentForcePostBottomSheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ForcePostBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.transaction.ui.forcepost.ForcePostBottomSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class ForcePostBottomSheetFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentForcePostBottomSheetBinding> {
    public static final ForcePostBottomSheetFragment2 INSTANCE = new ForcePostBottomSheetFragment2();

    ForcePostBottomSheetFragment2() {
        super(1, FragmentForcePostBottomSheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/cash/transaction/databinding/FragmentForcePostBottomSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentForcePostBottomSheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentForcePostBottomSheetBinding.bind(p0);
    }
}
