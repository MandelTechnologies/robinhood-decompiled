package com.robinhood.android.common.recurring.backup;

import android.view.View;
import com.robinhood.android.common.recurring.databinding.FragmentRecurringOrderBackupPaymentMethodBinding;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderBackupPaymentMethodFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.backup.RecurringOrderBackupPaymentMethodFragment$binding$2, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class RecurringOrderBackupPaymentMethodFragment2 extends FunctionReferenceImpl implements Function1<View, FragmentRecurringOrderBackupPaymentMethodBinding> {
    public static final RecurringOrderBackupPaymentMethodFragment2 INSTANCE = new RecurringOrderBackupPaymentMethodFragment2();

    RecurringOrderBackupPaymentMethodFragment2() {
        super(1, FragmentRecurringOrderBackupPaymentMethodBinding.class, "bind", "bind(Landroid/view/View;)Lcom/robinhood/android/common/recurring/databinding/FragmentRecurringOrderBackupPaymentMethodBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final FragmentRecurringOrderBackupPaymentMethodBinding invoke(View p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return FragmentRecurringOrderBackupPaymentMethodBinding.bind(p0);
    }
}
