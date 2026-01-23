package com.robinhood.android.odyssey.lib.bottomsheet;

import android.view.View;
import com.robinhood.android.lib.odyssey.databinding.FragmentBottomSheetActionListBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdActionListBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.bottomsheet.SdActionListBottomSheet$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class SdActionListBottomSheet2 extends FunctionReferenceImpl implements Function1<View, FragmentBottomSheetActionListBinding> {
    public static final SdActionListBottomSheet2 INSTANCE = new SdActionListBottomSheet2();

    SdActionListBottomSheet2() {
        super(1, FragmentBottomSheetActionListBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lib/odyssey/databinding/FragmentBottomSheetActionListBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentBottomSheetActionListBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentBottomSheetActionListBinding.bind(p0);
    }
}
