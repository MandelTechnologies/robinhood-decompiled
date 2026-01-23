package com.robinhood.crypto.perpetuals.values;

import android.content.res.Resources;
import com.robinhood.android.common.history.p082ui.format.TransactionSummary;
import com.robinhood.crypto.models.perpetuals.p288db.MarginEditStatus;
import com.robinhood.crypto.models.perpetuals.p288db.MarginEditType;
import com.robinhood.crypto.models.perpetuals.p288db.MarginMode;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualContract;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualCurrency;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualMoney;
import com.robinhood.crypto.models.perpetuals.p288db.PerpetualMoney2;
import com.robinhood.crypto.models.perpetuals.p289ui.UiPerpetualMarginEdit;
import com.robinhood.crypto.perpetuals.C33018R;
import com.robinhood.crypto.perpetuals.util.PerpetualMoneyUtil;
import com.robinhood.shared.formats.crypto.CurrencyDefinitions;
import com.robinhood.utils.resource.StringResource;
import crypto_perpetuals.common.p435v1.ConversionDto;
import crypto_perpetuals.common.p435v1.MoneyDto;
import crypto_perpetuals.position.p439v1.BuyingPowerEffectDto;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UiPerpetualMarginEditValues.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0010\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0004\"\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0004\"\u0018\u0010\u0011\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0004\"\u0015\u0010\u0013\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0004\"\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u0017"}, m3636d2 = {"historyRowLabelText", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualMarginEdit;", "getHistoryRowLabelText", "(Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualMarginEdit;)Lcom/robinhood/utils/resource/StringResource;", "historyRowValueText", "", "getHistoryRowValueText", "(Lcom/robinhood/crypto/models/perpetuals/ui/UiPerpetualMarginEdit;)Ljava/lang/String;", "historyRowSecondaryText", "getHistoryRowSecondaryText", "pendingHistoryRowSecondaryLabelText", "getPendingHistoryRowSecondaryLabelText", "getHistoryStatusBadge", "Lcom/robinhood/android/common/history/ui/format/TransactionSummary$Badge;", "resources", "Landroid/content/res/Resources;", "marginSource", "getMarginSource", "amountLabel", "getAmountLabel", "amountValue", "getAmountValue", "lib-perpetuals_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.crypto.perpetuals.values.UiPerpetualMarginEditValuesKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class UiPerpetualMarginEditValues {

    /* compiled from: UiPerpetualMarginEditValues.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.crypto.perpetuals.values.UiPerpetualMarginEditValuesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[MarginEditType.values().length];
            try {
                iArr[MarginEditType.MARGIN_EDIT_TYPE_CREDIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarginEditType.MARGIN_EDIT_TYPE_DEBIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MarginEditType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MarginMode.values().length];
            try {
                iArr2[MarginMode.CROSS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[MarginMode.ISOLATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[MarginEditStatus.values().length];
            try {
                iArr3[MarginEditStatus.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[MarginEditStatus.PARTIALLY_FILLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final StringResource getHistoryRowLabelText(UiPerpetualMarginEdit uiPerpetualMarginEdit) {
        Intrinsics.checkNotNullParameter(uiPerpetualMarginEdit, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[uiPerpetualMarginEdit.getMarginEdit().getEditType().ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C33018R.string.order_margin_edit_history_row_increase_label_text, getMarginSource(uiPerpetualMarginEdit));
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C33018R.string.order_margin_edit_history_row_decrease_label_text, getMarginSource(uiPerpetualMarginEdit));
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("Cannot map unknown margin edit type");
    }

    public static final String getHistoryRowValueText(UiPerpetualMarginEdit uiPerpetualMarginEdit) {
        BigDecimal bigDecimalNegate;
        Intrinsics.checkNotNullParameter(uiPerpetualMarginEdit, "<this>");
        PerpetualMoney amount = uiPerpetualMarginEdit.getMarginEdit().getAmount();
        if (amount == null) {
            return "";
        }
        int i = WhenMappings.$EnumSwitchMapping$0[uiPerpetualMarginEdit.getMarginEdit().getEditType().ordinal()];
        if (i == 1) {
            bigDecimalNegate = amount.getAmount().negate();
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new IllegalStateException("Cannot map unknown margin edit type");
            }
            bigDecimalNegate = amount.getAmount();
        }
        BigDecimal bigDecimal = bigDecimalNegate;
        PerpetualCurrency currency = amount.getCurrency();
        Intrinsics.checkNotNull(bigDecimal);
        return CurrencyDefinitions.formatCurrency$default(currency, bigDecimal, false, false, null, CurrencyDefinitions.getMinFractionDigitsForCurrency(amount.getCurrency()), null, Boolean.TRUE, true, true, false, false, 1578, null);
    }

    public static final StringResource getHistoryRowSecondaryText(UiPerpetualMarginEdit uiPerpetualMarginEdit) {
        Intrinsics.checkNotNullParameter(uiPerpetualMarginEdit, "<this>");
        MarginMode marginMode = uiPerpetualMarginEdit.getMarginEdit().getMarginMode();
        int i = WhenMappings.$EnumSwitchMapping$1[marginMode.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (getHistoryRowValueText(uiPerpetualMarginEdit).length() > 0) {
            return PerpetualDisplayNames.getShortDisplayName(marginMode);
        }
        return null;
    }

    public static final StringResource getPendingHistoryRowSecondaryLabelText(UiPerpetualMarginEdit uiPerpetualMarginEdit) {
        Intrinsics.checkNotNullParameter(uiPerpetualMarginEdit, "<this>");
        MarginMode marginMode = uiPerpetualMarginEdit.getMarginEdit().getMarginMode();
        int i = WhenMappings.$EnumSwitchMapping$1[marginMode.ordinal()];
        if (i == 1) {
            return null;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return PerpetualDisplayNames.getShortDisplayName(marginMode);
    }

    public static final TransactionSummary.Badge getHistoryStatusBadge(UiPerpetualMarginEdit uiPerpetualMarginEdit, Resources resources) {
        Intrinsics.checkNotNullParameter(uiPerpetualMarginEdit, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        MarginEditStatus status = uiPerpetualMarginEdit.getMarginEdit().getStatus();
        if (WhenMappings.$EnumSwitchMapping$2[status.ordinal()] == 1) {
            return new TransactionSummary.Badge(MarginEditStatusDisplayNames.getDisplayName(status).getText(resources), TransactionSummary.Tint.FOREGROUND_2, false, 4, null);
        }
        return null;
    }

    private static final StringResource getMarginSource(UiPerpetualMarginEdit uiPerpetualMarginEdit) {
        MarginMode marginMode = uiPerpetualMarginEdit.getMarginEdit().getMarginMode();
        int i = WhenMappings.$EnumSwitchMapping$1[marginMode.ordinal()];
        if (i == 1) {
            return PerpetualDisplayNames.getShortDisplayName(marginMode);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        PerpetualContract perpetualContract = uiPerpetualMarginEdit.getPerpetualContract();
        String symbol = perpetualContract != null ? perpetualContract.getSymbol() : null;
        if (symbol == null) {
            symbol = "";
        }
        return companion.invoke(symbol);
    }

    public static final StringResource getAmountLabel(UiPerpetualMarginEdit uiPerpetualMarginEdit) {
        Intrinsics.checkNotNullParameter(uiPerpetualMarginEdit, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[uiPerpetualMarginEdit.getMarginEdit().getEditType().ordinal()];
        if (i == 1) {
            return StringResource.INSTANCE.invoke(C33018R.string.order_margin_edit_detail_amount_increase_label_text, new Object[0]);
        }
        if (i == 2) {
            return StringResource.INSTANCE.invoke(C33018R.string.order_margin_edit_detail_amount_decrease_label_text, new Object[0]);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        throw new IllegalStateException("edit type cannot be unknown");
    }

    public static final StringResource getAmountValue(UiPerpetualMarginEdit uiPerpetualMarginEdit) {
        MoneyDto estimated_total;
        Intrinsics.checkNotNullParameter(uiPerpetualMarginEdit, "<this>");
        ConversionDto conversion = null;
        if (WhenMappings.$EnumSwitchMapping$2[uiPerpetualMarginEdit.getMarginEdit().getStatus().ordinal()] == 2) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i = C33018R.string.order_margin_edit_detail_partially_filled_amount_value;
            BuyingPowerEffectDto buyingPowerEffect = uiPerpetualMarginEdit.getMarginEdit().getBuyingPowerEffect();
            if (buyingPowerEffect != null && (estimated_total = buyingPowerEffect.getEstimated_total()) != null) {
                conversion = estimated_total.getConversion();
            }
            if (conversion == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String formattedAmount = PerpetualMoneyUtil.getFormattedAmount(PerpetualMoney2.toDbModel(conversion));
            PerpetualMoney amount = uiPerpetualMarginEdit.getMarginEdit().getAmount();
            if (amount != null) {
                return companion.invoke(i, formattedAmount, PerpetualMoneyUtil.getFormattedAmount(amount));
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        PerpetualMoney amount2 = uiPerpetualMarginEdit.getMarginEdit().getAmount();
        if (amount2 != null) {
            return StringResource.INSTANCE.invoke(PerpetualMoneyUtil.getFormattedAmount(amount2));
        }
        return null;
    }
}
