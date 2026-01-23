package com.robinhood.common.strings;

import android.content.res.Resources;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.models.api.ApiInstrumentSplit;
import com.robinhood.models.p355ui.UiInstrumentSplitPayment;
import com.robinhood.utils.datetime.format.InstantFormatter;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiInstrumentSplitPayments.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0012\u0010\u0005\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0012\u0010\n\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\n\u0010\u000b\u001a\u00020\u0006*\u00020\u0007\u001a\n\u0010\f\u001a\u00020\u0006*\u00020\u0007\u001a\n\u0010\r\u001a\u00020\u0006*\u00020\u0007\u001a\u0012\u0010\u000e\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a\u0012\u0010\u000f\u001a\u00020\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u0006*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"titleStringRes", "", "Lcom/robinhood/models/api/ApiInstrumentSplit$Direction;", "getTitleStringRes", "(Lcom/robinhood/models/api/ApiInstrumentSplit$Direction;)I", "getPrimaryText", "", "Lcom/robinhood/models/ui/UiInstrumentSplitPayment;", "res", "Landroid/content/res/Resources;", "getRatioText", "getDateReceivedText", "getNewSharesText", "getPreviousSharesText", "getSplitQuantityText", "getDetailTitleText", "instrumentDisplayName", "getInstrumentDisplayName", "(Lcom/robinhood/models/ui/UiInstrumentSplitPayment;)Ljava/lang/String;", "lib-common-strings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.common.strings.UiInstrumentSplitPaymentsKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class UiInstrumentSplitPayments {

    /* compiled from: UiInstrumentSplitPayments.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.common.strings.UiInstrumentSplitPaymentsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiInstrumentSplit.Direction.values().length];
            try {
                iArr[ApiInstrumentSplit.Direction.FORWARDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiInstrumentSplit.Direction.REVERSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int getTitleStringRes(ApiInstrumentSplit.Direction direction) {
        Intrinsics.checkNotNullParameter(direction, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i == 1) {
            return C32428R.string.instrument_split_payment_direction_forwards;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return C32428R.string.instrument_split_payment_direction_reverse;
    }

    public static final String getPrimaryText(UiInstrumentSplitPayment uiInstrumentSplitPayment, Resources res) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uiInstrumentSplitPayment, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        String string2 = res.getString(getTitleStringRes(uiInstrumentSplitPayment.getInstrumentSplitPayment().getSplit().getDirection()), uiInstrumentSplitPayment.getInstrumentSymbol());
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getRatioText(UiInstrumentSplitPayment uiInstrumentSplitPayment, Resources res) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uiInstrumentSplitPayment, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        String string2 = res.getString(C32428R.string.instrument_split_payment_ratio_display, Formats.getShareQuantityFormat().format(uiInstrumentSplitPayment.getInstrumentSplitPayment().getSplit().getMultiplier()), Formats.getShareQuantityFormat().format(uiInstrumentSplitPayment.getInstrumentSplitPayment().getSplit().getDivisor()));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getDateReceivedText(UiInstrumentSplitPayment uiInstrumentSplitPayment) {
        Intrinsics.checkNotNullParameter(uiInstrumentSplitPayment, "<this>");
        return InstantFormatter.DATE_IN_SYSTEM_ZONE.format(uiInstrumentSplitPayment.getInstrumentSplitPayment().getPaidAt());
    }

    public static final String getNewSharesText(UiInstrumentSplitPayment uiInstrumentSplitPayment) {
        Intrinsics.checkNotNullParameter(uiInstrumentSplitPayment, "<this>");
        return Formats.getShareQuantityFormat().format(uiInstrumentSplitPayment.getInstrumentSplitPayment().getNewShares());
    }

    public static final String getPreviousSharesText(UiInstrumentSplitPayment uiInstrumentSplitPayment) {
        Intrinsics.checkNotNullParameter(uiInstrumentSplitPayment, "<this>");
        return Formats.getShareQuantityFormat().format(uiInstrumentSplitPayment.getInstrumentSplitPayment().getOldShares());
    }

    public static final String getSplitQuantityText(UiInstrumentSplitPayment uiInstrumentSplitPayment, Resources res) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uiInstrumentSplitPayment, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        String string2 = res.getString(C32428R.string.instrument_split_payment_detail_split_quantity, Formats.getShareQuantityFormat().format(uiInstrumentSplitPayment.getInstrumentSplitPayment().getSplit().getMultiplier()), Formats.getShareQuantityFormat().format(uiInstrumentSplitPayment.getInstrumentSplitPayment().getSplit().getDivisor()));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final String getDetailTitleText(UiInstrumentSplitPayment uiInstrumentSplitPayment, Resources res) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(uiInstrumentSplitPayment, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        int i = WhenMappings.$EnumSwitchMapping$0[uiInstrumentSplitPayment.getInstrumentSplitPayment().getSplit().getDirection().ordinal()];
        if (i == 1) {
            String string2 = res.getString(C32428R.string.instrument_split_payment_detail_title_forward);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            return string2;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String string3 = res.getString(C32428R.string.instrument_split_payment_detail_title_reverse);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    public static final String getInstrumentDisplayName(UiInstrumentSplitPayment uiInstrumentSplitPayment) {
        Intrinsics.checkNotNullParameter(uiInstrumentSplitPayment, "<this>");
        String instrumentSimpleName = uiInstrumentSplitPayment.getInstrumentSimpleName();
        return instrumentSimpleName == null ? uiInstrumentSplitPayment.getInstrumentName() : instrumentSimpleName;
    }
}
