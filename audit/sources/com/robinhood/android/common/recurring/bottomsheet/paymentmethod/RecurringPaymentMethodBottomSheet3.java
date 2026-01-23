package com.robinhood.android.common.recurring.bottomsheet.paymentmethod;

import android.view.View;
import com.robinhood.android.common.recurring.databinding.FragmentRecurringPaymentMethodBottomSheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringPaymentMethodBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.bottomsheet.paymentmethod.RecurringPaymentMethodBottomSheet$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class RecurringPaymentMethodBottomSheet3 extends FunctionReferenceImpl implements Function1<View, FragmentRecurringPaymentMethodBottomSheetBinding> {
    public static final RecurringPaymentMethodBottomSheet3 INSTANCE = new RecurringPaymentMethodBottomSheet3();

    RecurringPaymentMethodBottomSheet3() {
        super(1, FragmentRecurringPaymentMethodBottomSheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringPaymentMethodBottomSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecurringPaymentMethodBottomSheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecurringPaymentMethodBottomSheetBinding.bind(p0);
    }
}
