package com.robinhood.android.retirement.contributions;

import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.transfers.lib.C30383R;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Frequency.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m3636d2 = {"getRetirementContributionReviewFooterText", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "amount", "Ljava/math/BigDecimal;", "lib-retirement-contributions_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.contributions.FrequencyKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class Frequency2 {

    /* compiled from: Frequency.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.contributions.FrequencyKt$WhenMappings */
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

    public static final StringResource getRetirementContributionReviewFooterText(ApiCreateTransferRequest2 apiCreateTransferRequest2, BigDecimal amount) {
        Intrinsics.checkNotNullParameter(apiCreateTransferRequest2, "<this>");
        Intrinsics.checkNotNullParameter(amount, "amount");
        switch (WhenMappings.$EnumSwitchMapping$0[apiCreateTransferRequest2.ordinal()]) {
            case 1:
                return StringResource.INSTANCE.invoke(C26981R.string.create_retirement_contribution_helper_text_once, Formats.getCurrencyFormat().format(amount));
            case 2:
                return StringResource.INSTANCE.invoke(C30383R.string.ach_transfer_automatic_deposit_description_week, new Object[0]);
            case 3:
                return StringResource.INSTANCE.invoke(C30383R.string.ach_transfer_automatic_deposit_description_two_weeks, new Object[0]);
            case 4:
                return StringResource.INSTANCE.invoke(C30383R.string.ach_transfer_automatic_deposit_description_month, new Object[0]);
            case 5:
                return StringResource.INSTANCE.invoke(C30383R.string.ach_transfer_automatic_deposit_description_quarter, new Object[0]);
            case 6:
                return StringResource.INSTANCE.invoke("");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
