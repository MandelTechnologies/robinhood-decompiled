package com.robinhood.android.directdeposit.p101ui.accountinfo;

import android.view.View;
import com.robinhood.android.directdeposit.databinding.BottomSheetAccountInfoBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountInfoBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.directdeposit.ui.accountinfo.AccountInfoBottomSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes27.dex */
/* synthetic */ class AccountInfoBottomSheetFragment2 extends FunctionReferenceImpl implements Function1<View, BottomSheetAccountInfoBinding> {
    public static final AccountInfoBottomSheetFragment2 INSTANCE = new AccountInfoBottomSheetFragment2();

    AccountInfoBottomSheetFragment2() {
        super(1, BottomSheetAccountInfoBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/directdeposit/databinding/BottomSheetAccountInfoBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final BottomSheetAccountInfoBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return BottomSheetAccountInfoBinding.bind(p0);
    }
}
