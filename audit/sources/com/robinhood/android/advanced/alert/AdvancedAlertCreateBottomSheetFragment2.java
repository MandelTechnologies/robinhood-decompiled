package com.robinhood.android.advanced.alert;

import android.view.View;
import com.robinhood.android.advanced.alert.databinding.FragmentAdvancedCreateAlertBottomsheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedAlertCreateBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advanced.alert.AdvancedAlertCreateBottomSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes24.dex */
/* synthetic */ class AdvancedAlertCreateBottomSheetFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentAdvancedCreateAlertBottomsheetBinding> {
    public static final AdvancedAlertCreateBottomSheetFragment2 INSTANCE = new AdvancedAlertCreateBottomSheetFragment2();

    AdvancedAlertCreateBottomSheetFragment2() {
        super(1, FragmentAdvancedCreateAlertBottomsheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/advanced/alert/databinding/FragmentAdvancedCreateAlertBottomsheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentAdvancedCreateAlertBottomsheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentAdvancedCreateAlertBottomsheetBinding.bind(p0);
    }
}
