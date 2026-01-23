package com.robinhood.android.odyssey.lib.bottomsheet;

import android.view.View;
import com.robinhood.android.lib.odyssey.databinding.FragmentBottomSheetInformationalListBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdInformationalListBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.bottomsheet.SdInformationalListBottomSheet$binding$2, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class SdInformationalListBottomSheet2 extends FunctionReferenceImpl implements Function1<View, FragmentBottomSheetInformationalListBinding> {
    public static final SdInformationalListBottomSheet2 INSTANCE = new SdInformationalListBottomSheet2();

    SdInformationalListBottomSheet2() {
        super(1, FragmentBottomSheetInformationalListBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/lib/odyssey/databinding/FragmentBottomSheetInformationalListBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentBottomSheetInformationalListBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentBottomSheetInformationalListBinding.bind(p0);
    }
}
