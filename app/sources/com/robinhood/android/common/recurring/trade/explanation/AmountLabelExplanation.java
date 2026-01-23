package com.robinhood.android.common.recurring.trade.explanation;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.recurring.C11595R;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.recurring.models.AmountType;
import com.robinhood.recurring.models.InvestmentScheduleAmount;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AmountLabelExplanation.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B%\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\nR\u0011\u0010\u0015\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\nj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/common/recurring/trade/explanation/AmountLabelExplanation;", "", "id", "", "tag", "", "learnMoreUrl", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/Integer;)V", "getId", "()I", "getTag", "()Ljava/lang/String;", "getLearnMoreUrl", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "CRYPTO_COLLARING", "DIRECT_DEPOSIT_AMOUNT_TYPE", "CRYPTO_COLLARING_FEE", "title", "getTitle", "theme", "getTheme", "getStringResource", "Lcom/robinhood/utils/resource/StringResource;", "amount", "Lcom/robinhood/recurring/models/InvestmentScheduleAmount;", "feature-lib-recurring_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class AmountLabelExplanation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AmountLabelExplanation[] $VALUES;
    private final int id;
    private final Integer learnMoreUrl;
    private final String tag;
    public static final AmountLabelExplanation CRYPTO_COLLARING = new AmountLabelExplanation("CRYPTO_COLLARING", 0, C11595R.id.dialog_id_collar_explanation, "priceVolatility", Integer.valueOf(C11595R.string.collar_explanation_learn_more_url));
    public static final AmountLabelExplanation DIRECT_DEPOSIT_AMOUNT_TYPE = new AmountLabelExplanation("DIRECT_DEPOSIT_AMOUNT_TYPE", 1, C11595R.id.dialog_id_amount_type_explanation, "amountType", null, 4, null);
    public static final AmountLabelExplanation CRYPTO_COLLARING_FEE = new AmountLabelExplanation("CRYPTO_COLLARING_FEE", 2, C11595R.id.dialog_id_collar_fee_explanation, "priceVolatilityFee", Integer.valueOf(C11595R.string.collar_fee_explanation_learn_more_url));

    /* compiled from: AmountLabelExplanation.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AmountLabelExplanation.values().length];
            try {
                iArr[AmountLabelExplanation.CRYPTO_COLLARING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AmountLabelExplanation.DIRECT_DEPOSIT_AMOUNT_TYPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AmountLabelExplanation.CRYPTO_COLLARING_FEE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AmountType.values().length];
            try {
                iArr2[AmountType.DOLLAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[AmountType.PERCENTAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final /* synthetic */ AmountLabelExplanation[] $values() {
        return new AmountLabelExplanation[]{CRYPTO_COLLARING, DIRECT_DEPOSIT_AMOUNT_TYPE, CRYPTO_COLLARING_FEE};
    }

    public static EnumEntries<AmountLabelExplanation> getEntries() {
        return $ENTRIES;
    }

    private AmountLabelExplanation(String str, int i, int i2, String str2, Integer num) {
        this.id = i2;
        this.tag = str2;
        this.learnMoreUrl = num;
    }

    /* synthetic */ AmountLabelExplanation(String str, int i, int i2, String str2, Integer num, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, str2, (i3 & 4) != 0 ? null : num);
    }

    public final int getId() {
        return this.id;
    }

    public final String getTag() {
        return this.tag;
    }

    public final Integer getLearnMoreUrl() {
        return this.learnMoreUrl;
    }

    static {
        AmountLabelExplanation[] amountLabelExplanationArr$values = $values();
        $VALUES = amountLabelExplanationArr$values;
        $ENTRIES = EnumEntries2.enumEntries(amountLabelExplanationArr$values);
    }

    public final int getTitle() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return C11595R.string.collar_explanation_dialog_title;
        }
        if (i == 2) {
            return C11595R.string.amount_type_explanation_dialog_title;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C11595R.string.collar_fee_explanation_dialog_title;
    }

    public final int getTheme() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome;
        }
        if (i == 2) {
            return C11048R.style.ThemeOverlay_Robinhood_Dialog_Negative;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return C13997R.style.ThemeOverlay_Robinhood_DesignSystem_Dialog_Monochrome;
    }

    public final StringResource getStringResource(InvestmentScheduleAmount amount) {
        int i;
        Intrinsics.checkNotNullParameter(amount, "amount");
        int i2 = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i2 == 1) {
            return StringResource.INSTANCE.invoke(C11595R.string.collar_explanation_dialog_message, amount.format());
        }
        if (i2 != 2) {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return StringResource.INSTANCE.invoke(C11595R.string.collar_fee_explanation_dialog_message, new Object[0]);
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        int i3 = C11595R.string.amount_type_explanation_dialog_message;
        int i4 = WhenMappings.$EnumSwitchMapping$1[amount.getAmountType().ordinal()];
        if (i4 == 1) {
            i = C11595R.string.amount_type_explanation_dialog_dollar_amount;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = C11595R.string.amount_type_explanation_dialog_percentage;
        }
        return companion.invoke(i3, companion.invoke(i, new Object[0]));
    }

    public static AmountLabelExplanation valueOf(String str) {
        return (AmountLabelExplanation) Enum.valueOf(AmountLabelExplanation.class, str);
    }

    public static AmountLabelExplanation[] values() {
        return (AmountLabelExplanation[]) $VALUES.clone();
    }
}
