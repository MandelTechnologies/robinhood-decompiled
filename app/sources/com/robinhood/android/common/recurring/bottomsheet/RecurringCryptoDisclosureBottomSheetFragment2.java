package com.robinhood.android.common.recurring.bottomsheet;

import android.view.View;
import com.robinhood.android.common.recurring.databinding.DialogRecurringInfoBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringCryptoDisclosureBottomSheetFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.bottomsheet.RecurringCryptoDisclosureBottomSheetFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class RecurringCryptoDisclosureBottomSheetFragment2 extends FunctionReferenceImpl implements Function1<View, DialogRecurringInfoBinding> {
    public static final RecurringCryptoDisclosureBottomSheetFragment2 INSTANCE = new RecurringCryptoDisclosureBottomSheetFragment2();

    RecurringCryptoDisclosureBottomSheetFragment2() {
        super(1, DialogRecurringInfoBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/recurring/databinding/DialogRecurringInfoBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final DialogRecurringInfoBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return DialogRecurringInfoBinding.bind(p0);
    }
}
