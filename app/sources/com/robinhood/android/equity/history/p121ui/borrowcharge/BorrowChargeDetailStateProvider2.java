package com.robinhood.android.equity.history.p121ui.borrowcharge;

import com.robinhood.android.equity.history.C15093R;
import com.robinhood.models.api.ApiBorrowCharge3;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BorrowChargeDetailStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"displayString", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/api/BorrowChargeStatus;", "feature-equity-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailStateProviderKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class BorrowChargeDetailStateProvider2 {

    /* compiled from: BorrowChargeDetailStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailStateProviderKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiBorrowCharge3.values().length];
            try {
                iArr[ApiBorrowCharge3.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiBorrowCharge3.NEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiBorrowCharge3.PROCESSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiBorrowCharge3.COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiBorrowCharge3.INCONSISTENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource displayString(ApiBorrowCharge3 apiBorrowCharge3) {
        Intrinsics.checkNotNullParameter(apiBorrowCharge3, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[apiBorrowCharge3.ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C15093R.string.borrow_charge_charge_status_pending, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C15093R.string.borrow_charge_charge_status_new, new Object[0]);
        }
        if (i == 3) {
            return StringResource.INSTANCE.invoke(C15093R.string.borrow_charge_charge_status_processing, new Object[0]);
        }
        if (i == 4) {
            return StringResource.INSTANCE.invoke(C15093R.string.borrow_charge_charge_status_completed, new Object[0]);
        }
        if (i != 5) {
            throw new NoWhenBranchMatchedException();
        }
        return StringResource.INSTANCE.invoke(C15093R.string.borrow_charge_charge_status_inconsistent, new Object[0]);
    }
}
