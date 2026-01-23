package com.robinhood.android.equityadvancedorder.bottomsheet;

import android.view.View;
import com.robinhood.android.equityadvancedorder.databinding.FragmentTaxWarningBottomSheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BackupWithholdingWarningBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityadvancedorder.bottomsheet.BackupWithholdingWarningBottomSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class BackupWithholdingWarningBottomSheetFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentTaxWarningBottomSheetBinding> {
    public static final BackupWithholdingWarningBottomSheetFragment2 INSTANCE = new BackupWithholdingWarningBottomSheetFragment2();

    BackupWithholdingWarningBottomSheetFragment2() {
        super(1, FragmentTaxWarningBottomSheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/equityadvancedorder/databinding/FragmentTaxWarningBottomSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentTaxWarningBottomSheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentTaxWarningBottomSheetBinding.bind(p0);
    }
}
