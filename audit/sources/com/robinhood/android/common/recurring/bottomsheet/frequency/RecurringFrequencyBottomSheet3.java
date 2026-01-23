package com.robinhood.android.common.recurring.bottomsheet.frequency;

import android.view.View;
import com.robinhood.android.common.recurring.databinding.FragmentRecurringFrequencyBottomSheetBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringFrequencyBottomSheet.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class RecurringFrequencyBottomSheet3 extends FunctionReferenceImpl implements Function1<View, FragmentRecurringFrequencyBottomSheetBinding> {
    public static final RecurringFrequencyBottomSheet3 INSTANCE = new RecurringFrequencyBottomSheet3();

    RecurringFrequencyBottomSheet3() {
        super(1, FragmentRecurringFrequencyBottomSheetBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringFrequencyBottomSheetBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecurringFrequencyBottomSheetBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecurringFrequencyBottomSheetBinding.bind(p0);
    }
}
