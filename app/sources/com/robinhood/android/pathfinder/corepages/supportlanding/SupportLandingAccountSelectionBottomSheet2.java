package com.robinhood.android.pathfinder.corepages.supportlanding;

import android.view.View;
import com.robinhood.shared.pathfinder.corepages.databinding.FragmentSupportLandingAccountSelectionBottomSheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportLandingAccountSelectionBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingAccountSelectionBottomSheet$binding$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class SupportLandingAccountSelectionBottomSheet2 extends FunctionReferenceImpl implements Function1<View, FragmentSupportLandingAccountSelectionBottomSheetBinding> {
    public static final SupportLandingAccountSelectionBottomSheet2 INSTANCE = new SupportLandingAccountSelectionBottomSheet2();

    SupportLandingAccountSelectionBottomSheet2() {
        super(1, FragmentSupportLandingAccountSelectionBottomSheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/shared/pathfinder/corepages/databinding/FragmentSupportLandingAccountSelectionBottomSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentSupportLandingAccountSelectionBottomSheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentSupportLandingAccountSelectionBottomSheetBinding.bind(p0);
    }
}
