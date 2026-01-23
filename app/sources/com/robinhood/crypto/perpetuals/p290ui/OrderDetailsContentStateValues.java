package com.robinhood.crypto.perpetuals.p290ui;

import androidx.compose.p011ui.text.font.FontWeight;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualMoney;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualOrderFees;
import com.robinhood.crypto.models.perpetuals.p289ui.UiPerpetualOrderDetails;
import com.robinhood.crypto.perpetuals.util.PerpetualMoneyUtil;
import com.robinhood.crypto.perpetuals.values.UiPerpetualOrderDetailValues;
import com.robinhood.shared.crypto.p375ui.content.CryptoContentState;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: OrderDetailsContentStateValues.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\"\u0010\u0000\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007\u001a\u000e\u0010\t\u001a\u00020\n*\u0004\u0018\u00010\u0005H\u0001\u001a\u0016\u0010\u000b\u001a\u00020\n*\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\rH\u0001\u001a\u0016\u0010\u000e\u001a\u00020\n*\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001\u001a\u000e\u0010\u000f\u001a\u00020\n*\u0004\u0018\u00010\u0005H\u0001\"\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u001c\u0010\u0013\u001a\u00020\r8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, m3636d2 = {"getOrderFeeSheetContentState", "Lcom/robinhood/shared/crypto/ui/content/CryptoContentState;", "uiOrderDetails", "Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualOrderDetails;", "orderFees", "Lcom/robinhood/crypto/models/perpetuals/db/PerpetualOrderFees;", "isFeesEstimated", "", "isLiquidationFees", "getRobinhoodFeesRowState", "Lcom/robinhood/shared/crypto/ui/content/CryptoContentState$ContentRowState;", "getVenueFeesRowState", AnnotatedPrivateKey.LABEL, "Lcom/robinhood/utils/resource/StringResource;", "getTotalFeesRowState", "getLiquidationFeesRowState", "FEES_LEARN_MORE_URL", "getFEES_LEARN_MORE_URL", "()Lcom/robinhood/utils/resource/StringResource;", "DEFAULT_UNKNOWN_VALUE", "getDEFAULT_UNKNOWN_VALUE$annotations", "()V", "getDEFAULT_UNKNOWN_VALUE", "lib-perpetuals-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.crypto.perpetuals.ui.OrderDetailsContentStateValuesKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class OrderDetailsContentStateValues {
    private static final StringResource DEFAULT_UNKNOWN_VALUE;
    private static final StringResource FEES_LEARN_MORE_URL;

    public static /* synthetic */ void getDEFAULT_UNKNOWN_VALUE$annotations() {
    }

    public static final CryptoContentState getOrderFeeSheetContentState(UiPerpetualOrderDetails uiOrderDetails) {
        Intrinsics.checkNotNullParameter(uiOrderDetails, "uiOrderDetails");
        return getOrderFeeSheetContentState(uiOrderDetails.getOrderDetails().getOrderFees(), !UiPerpetualOrderDetailValues.getOrderIsPartiallyOrFullyExecuted(uiOrderDetails), uiOrderDetails.getOrderDetails().isLiquidationOrder());
    }

    public static /* synthetic */ CryptoContentState getOrderFeeSheetContentState$default(PerpetualOrderFees perpetualOrderFees, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        return getOrderFeeSheetContentState(perpetualOrderFees, z, z2);
    }

    public static final CryptoContentState getOrderFeeSheetContentState(PerpetualOrderFees perpetualOrderFees, boolean z, boolean z2) {
        StringResource stringResourceInvoke;
        StringResource stringResourceInvoke2;
        ImmutableList3 immutableList3PersistentListOf;
        String summary;
        if (z) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C33033R.string.order_fees_sheet_title, new Object[0]);
        } else {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C33033R.string.order_fees_sheet_filled_title, new Object[0]);
        }
        StringResource stringResource = stringResourceInvoke;
        if (z2) {
            stringResourceInvoke2 = StringResource.INSTANCE.invoke(C33033R.string.order_fees_sheet_liquidation_description, new Object[0]);
        } else {
            stringResourceInvoke2 = StringResource.INSTANCE.invoke(C33033R.string.order_fees_sheet_description, new Object[0]);
        }
        StringResource stringResource2 = stringResourceInvoke2;
        if (z2) {
            immutableList3PersistentListOf = extensions2.persistentListOf(getLiquidationFeesRowState(perpetualOrderFees));
        } else {
            immutableList3PersistentListOf = extensions2.persistentListOf(getRobinhoodFeesRowState(perpetualOrderFees), getVenueFeesRowState(perpetualOrderFees, StringResource.INSTANCE.invoke(C33033R.string.order_fees_sheet_venue_fee_label, new Object[0])), getTotalFeesRowState(perpetualOrderFees, z));
        }
        ImmutableList3 immutableList3 = immutableList3PersistentListOf;
        StringResource stringResourceInvoke3 = (perpetualOrderFees == null || (summary = perpetualOrderFees.getSummary()) == null) ? null : StringResource.INSTANCE.invoke(summary);
        StringResource.Companion companion = StringResource.INSTANCE;
        return new CryptoContentState(stringResource, stringResource2, immutableList3, stringResourceInvoke3, companion.invoke(C33033R.string.order_detail_sheet_ok_cta, new Object[0]), companion.invoke(C33033R.string.order_detail_sheet_learn_more_cta, new Object[0]));
    }

    public static final CryptoContentState.ContentRowState getRobinhoodFeesRowState(PerpetualOrderFees perpetualOrderFees) {
        StringResource stringResourceInvoke;
        PerpetualMoney robinhoodFees;
        String formattedAmount;
        StringResource.Companion companion = StringResource.INSTANCE;
        CryptoContentState.ContentRowState.TextContentState textContentState = new CryptoContentState.ContentRowState.TextContentState(companion.invoke(C33033R.string.order_fees_sheet_robinhood_fee_label, new Object[0]), null, null, null, 14, null);
        if (perpetualOrderFees == null || (robinhoodFees = perpetualOrderFees.getRobinhoodFees()) == null || (formattedAmount = PerpetualMoneyUtil.getFormattedAmount(robinhoodFees)) == null || (stringResourceInvoke = companion.invoke(formattedAmount)) == null) {
            stringResourceInvoke = DEFAULT_UNKNOWN_VALUE;
        }
        return new CryptoContentState.ContentRowState(textContentState, new CryptoContentState.ContentRowState.ValueContentState(stringResourceInvoke, null, 2, null), null, null);
    }

    public static final CryptoContentState.ContentRowState getVenueFeesRowState(PerpetualOrderFees perpetualOrderFees, StringResource label) {
        StringResource stringResourceInvoke;
        PerpetualMoney venueFees;
        String formattedAmount;
        Intrinsics.checkNotNullParameter(label, "label");
        CryptoContentState.ContentRowState.TextContentState textContentState = new CryptoContentState.ContentRowState.TextContentState(label, null, null, null, 14, null);
        if (perpetualOrderFees == null || (venueFees = perpetualOrderFees.getVenueFees()) == null || (formattedAmount = PerpetualMoneyUtil.getFormattedAmount(venueFees)) == null || (stringResourceInvoke = StringResource.INSTANCE.invoke(formattedAmount)) == null) {
            stringResourceInvoke = DEFAULT_UNKNOWN_VALUE;
        }
        return new CryptoContentState.ContentRowState(textContentState, new CryptoContentState.ContentRowState.ValueContentState(stringResourceInvoke, null, 2, null), null, null);
    }

    public static final CryptoContentState.ContentRowState getTotalFeesRowState(PerpetualOrderFees perpetualOrderFees, boolean z) {
        StringResource stringResourceInvoke;
        StringResource stringResourceInvoke2;
        PerpetualMoney fees;
        String formattedAmount;
        if (z) {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C33033R.string.order_fees_sheet_total_estimated_fee_label, new Object[0]);
        } else {
            stringResourceInvoke = StringResource.INSTANCE.invoke(C33033R.string.order_fees_sheet_total_fee_label, new Object[0]);
        }
        StringResource stringResource = stringResourceInvoke;
        FontWeight.Companion companion = FontWeight.INSTANCE;
        CryptoContentState.ContentRowState.TextContentState textContentState = new CryptoContentState.ContentRowState.TextContentState(stringResource, companion.getBold(), null, null, 12, null);
        if (perpetualOrderFees == null || (fees = perpetualOrderFees.getFees()) == null || (formattedAmount = PerpetualMoneyUtil.getFormattedAmount(fees)) == null || (stringResourceInvoke2 = StringResource.INSTANCE.invoke(formattedAmount)) == null) {
            stringResourceInvoke2 = DEFAULT_UNKNOWN_VALUE;
        }
        return new CryptoContentState.ContentRowState(textContentState, new CryptoContentState.ContentRowState.ValueContentState(stringResourceInvoke2, companion.getBold()), null, null);
    }

    public static final CryptoContentState.ContentRowState getLiquidationFeesRowState(PerpetualOrderFees perpetualOrderFees) {
        StringResource stringResourceInvoke;
        PerpetualMoney fees;
        String formattedAmount;
        StringResource.Companion companion = StringResource.INSTANCE;
        CryptoContentState.ContentRowState.TextContentState textContentState = new CryptoContentState.ContentRowState.TextContentState(companion.invoke(C33033R.string.order_fees_sheet_liquidation_fee_label, new Object[0]), null, null, null, 14, null);
        if (perpetualOrderFees == null || (fees = perpetualOrderFees.getFees()) == null || (formattedAmount = PerpetualMoneyUtil.getFormattedAmount(fees)) == null || (stringResourceInvoke = companion.invoke(formattedAmount)) == null) {
            stringResourceInvoke = DEFAULT_UNKNOWN_VALUE;
        }
        return new CryptoContentState.ContentRowState(textContentState, new CryptoContentState.ContentRowState.ValueContentState(stringResourceInvoke, null, 2, null), null, null);
    }

    static {
        StringResource.Companion companion = StringResource.INSTANCE;
        FEES_LEARN_MORE_URL = companion.invoke(C33033R.string.order_fees_learn_more_url, new Object[0]);
        DEFAULT_UNKNOWN_VALUE = companion.invoke(C33033R.string.order_fees_sheet_unknown_value, new Object[0]);
    }

    public static final StringResource getFEES_LEARN_MORE_URL() {
        return FEES_LEARN_MORE_URL;
    }

    public static final StringResource getDEFAULT_UNKNOWN_VALUE() {
        return DEFAULT_UNKNOWN_VALUE;
    }
}
