package com.robinhood.android.transfers.lib;

import com.robinhood.android.common.C11048R;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Frequency.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"textRes", "", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "getTextRes", "(Lcom/robinhood/models/api/bonfire/TransferFrequency;)I", "lib-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.lib.FrequencyKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class Frequency3 {

    /* compiled from: Frequency.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.lib.FrequencyKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiCreateTransferRequest2.values().length];
            try {
                iArr[ApiCreateTransferRequest2.ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCreateTransferRequest2.WEEKLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiCreateTransferRequest2.BIWEEKLY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiCreateTransferRequest2.MONTHLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ApiCreateTransferRequest2.QUARTERLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ApiCreateTransferRequest2.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getTextRes(ApiCreateTransferRequest2 apiCreateTransferRequest2) {
        Intrinsics.checkNotNullParameter(apiCreateTransferRequest2, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[apiCreateTransferRequest2.ordinal()]) {
            case 1:
                return C30383R.string.automatic_deposit_frequency_once;
            case 2:
                return C30383R.string.automatic_deposit_frequency_weekly;
            case 3:
                return C30383R.string.automatic_deposit_frequency_biweekly;
            case 4:
                return C30383R.string.automatic_deposit_frequency_monthly;
            case 5:
                return C30383R.string.automatic_deposit_frequency_quarterly;
            case 6:
                return C11048R.string.general_label_unknown;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
