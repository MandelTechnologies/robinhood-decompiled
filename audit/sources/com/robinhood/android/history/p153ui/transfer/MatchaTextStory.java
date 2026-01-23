package com.robinhood.android.history.p153ui.transfer;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.StyleSpan;
import com.robinhood.android.banking.util.SpannableUtils;
import com.robinhood.android.debitcard.strings.C13932R;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.ThemableColorSpans3;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.models.api.bonfire.transfer.ApiServiceFeeParams4;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.scarlet.util.resource.ResourceReferences5;
import com.robinhood.transfers.api.ServiceFeeDiscount;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.p409ui.color.ThemeColors;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MatchaTextStory.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\fJ6\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0002¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/history/ui/transfer/MatchaTextStory;", "", "<init>", "()V", "getRowDisplayData", "Lcom/robinhood/android/history/ui/transfer/MatchaTextStory$RowDisplayData;", "context", "Landroid/content/Context;", "discountDetailsList", "", "Lcom/robinhood/transfers/api/ServiceFeeDiscount;", "serviceFee", "Ljava/math/BigDecimal;", "statusString", "", "serviceFeeDiscountAmount", "getMatchaDisplayCombo", "Lkotlin/Pair;", "", "discountDetails", "RowDisplayData", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class MatchaTextStory {
    public static final int $stable = 0;
    public static final MatchaTextStory INSTANCE = new MatchaTextStory();

    /* compiled from: MatchaTextStory.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiServiceFeeParams4.values().length];
            try {
                iArr[ApiServiceFeeParams4.FREE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiServiceFeeParams4.CHEAPER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiServiceFeeParams4.PAID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private MatchaTextStory() {
    }

    /* compiled from: MatchaTextStory.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/history/ui/transfer/MatchaTextStory$RowDisplayData;", "", "feeRowPrimaryText", "", "feeRowVisibility", "", "feeRowSecondaryText", "statusRowSecondaryText", "<init>", "(Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Ljava/lang/CharSequence;)V", "getFeeRowPrimaryText", "()Ljava/lang/CharSequence;", "getFeeRowVisibility", "()Z", "getFeeRowSecondaryText", "getStatusRowSecondaryText", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RowDisplayData {
        public static final int $stable = 8;
        private final CharSequence feeRowPrimaryText;
        private final CharSequence feeRowSecondaryText;
        private final boolean feeRowVisibility;
        private final CharSequence statusRowSecondaryText;

        public static /* synthetic */ RowDisplayData copy$default(RowDisplayData rowDisplayData, CharSequence charSequence, boolean z, CharSequence charSequence2, CharSequence charSequence3, int i, Object obj) {
            if ((i & 1) != 0) {
                charSequence = rowDisplayData.feeRowPrimaryText;
            }
            if ((i & 2) != 0) {
                z = rowDisplayData.feeRowVisibility;
            }
            if ((i & 4) != 0) {
                charSequence2 = rowDisplayData.feeRowSecondaryText;
            }
            if ((i & 8) != 0) {
                charSequence3 = rowDisplayData.statusRowSecondaryText;
            }
            return rowDisplayData.copy(charSequence, z, charSequence2, charSequence3);
        }

        /* renamed from: component1, reason: from getter */
        public final CharSequence getFeeRowPrimaryText() {
            return this.feeRowPrimaryText;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getFeeRowVisibility() {
            return this.feeRowVisibility;
        }

        /* renamed from: component3, reason: from getter */
        public final CharSequence getFeeRowSecondaryText() {
            return this.feeRowSecondaryText;
        }

        /* renamed from: component4, reason: from getter */
        public final CharSequence getStatusRowSecondaryText() {
            return this.statusRowSecondaryText;
        }

        public final RowDisplayData copy(CharSequence feeRowPrimaryText, boolean feeRowVisibility, CharSequence feeRowSecondaryText, CharSequence statusRowSecondaryText) {
            Intrinsics.checkNotNullParameter(feeRowPrimaryText, "feeRowPrimaryText");
            Intrinsics.checkNotNullParameter(feeRowSecondaryText, "feeRowSecondaryText");
            Intrinsics.checkNotNullParameter(statusRowSecondaryText, "statusRowSecondaryText");
            return new RowDisplayData(feeRowPrimaryText, feeRowVisibility, feeRowSecondaryText, statusRowSecondaryText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RowDisplayData)) {
                return false;
            }
            RowDisplayData rowDisplayData = (RowDisplayData) other;
            return Intrinsics.areEqual(this.feeRowPrimaryText, rowDisplayData.feeRowPrimaryText) && this.feeRowVisibility == rowDisplayData.feeRowVisibility && Intrinsics.areEqual(this.feeRowSecondaryText, rowDisplayData.feeRowSecondaryText) && Intrinsics.areEqual(this.statusRowSecondaryText, rowDisplayData.statusRowSecondaryText);
        }

        public int hashCode() {
            return (((((this.feeRowPrimaryText.hashCode() * 31) + Boolean.hashCode(this.feeRowVisibility)) * 31) + this.feeRowSecondaryText.hashCode()) * 31) + this.statusRowSecondaryText.hashCode();
        }

        public String toString() {
            CharSequence charSequence = this.feeRowPrimaryText;
            return "RowDisplayData(feeRowPrimaryText=" + ((Object) charSequence) + ", feeRowVisibility=" + this.feeRowVisibility + ", feeRowSecondaryText=" + ((Object) this.feeRowSecondaryText) + ", statusRowSecondaryText=" + ((Object) this.statusRowSecondaryText) + ")";
        }

        public RowDisplayData(CharSequence feeRowPrimaryText, boolean z, CharSequence feeRowSecondaryText, CharSequence statusRowSecondaryText) {
            Intrinsics.checkNotNullParameter(feeRowPrimaryText, "feeRowPrimaryText");
            Intrinsics.checkNotNullParameter(feeRowSecondaryText, "feeRowSecondaryText");
            Intrinsics.checkNotNullParameter(statusRowSecondaryText, "statusRowSecondaryText");
            this.feeRowPrimaryText = feeRowPrimaryText;
            this.feeRowVisibility = z;
            this.feeRowSecondaryText = feeRowSecondaryText;
            this.statusRowSecondaryText = statusRowSecondaryText;
        }

        public final CharSequence getFeeRowPrimaryText() {
            return this.feeRowPrimaryText;
        }

        public final boolean getFeeRowVisibility() {
            return this.feeRowVisibility;
        }

        public final CharSequence getFeeRowSecondaryText() {
            return this.feeRowSecondaryText;
        }

        public final CharSequence getStatusRowSecondaryText() {
            return this.statusRowSecondaryText;
        }
    }

    private final Tuples2<CharSequence, String> getMatchaDisplayCombo(Context context, ServiceFeeDiscount discountDetails, BigDecimal serviceFee, BigDecimal serviceFeeDiscountAmount) {
        int i;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) context.getString(C13932R.string.debit_card_fee_label));
        spannableStringBuilder.append((CharSequence) " ·  ");
        Object[] objArr = {new StyleSpan(1), new ThemableColorSpans3(ResourceReferences5.toColor(ThemeAttributes.INSTANCE.getCOLOR_POSITIVE()))};
        int length = spannableStringBuilder.length();
        int i2 = WhenMappings.$EnumSwitchMapping$0[discountDetails.getValue().ordinal()];
        if (i2 == 1) {
            i = C13932R.string.matcha_free;
        } else if (i2 == 2) {
            i = C13932R.string.matcha_cheaper;
        } else if (i2 == 3) {
            i = C13932R.string.instant_withdrawals;
        } else {
            i = C13932R.string.instant_withdrawals;
        }
        spannableStringBuilder.append((CharSequence) context.getString(i));
        for (int i3 = 0; i3 < 2; i3++) {
            spannableStringBuilder.setSpan(objArr[i3], length, spannableStringBuilder.length(), 17);
        }
        SpannableUtils.insertLightningIcon(spannableStringBuilder, context, ThemeColors.getThemeColor(context, C20690R.attr.colorPositive), 6);
        SpannedString spannedString = new SpannedString(spannableStringBuilder);
        Currency currency = Currencies.USD;
        String str = Money.format$default(Money3.toMoney(serviceFee, currency), null, false, null, false, 0, null, false, null, false, false, 1023, null) + " · ";
        if (CollectionsKt.listOf((Object[]) new ApiServiceFeeParams4[]{ApiServiceFeeParams4.FREE, ApiServiceFeeParams4.CHEAPER}).contains(discountDetails.getValue()) && serviceFeeDiscountAmount != null) {
            str = str + context.getString(C13932R.string.matcha_you_saved, Money.format$default(Money3.toMoney(serviceFeeDiscountAmount, currency), null, false, null, false, 0, null, false, null, false, false, 1023, null));
        }
        return Tuples4.m3642to(spannedString, str);
    }

    public final RowDisplayData getRowDisplayData(Context context, List<ServiceFeeDiscount> discountDetailsList, BigDecimal serviceFee, CharSequence statusString, BigDecimal serviceFeeDiscountAmount) {
        String str;
        CharSequence charSequenceComponent1;
        String strComponent2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(serviceFee, "serviceFee");
        Intrinsics.checkNotNullParameter(statusString, "statusString");
        ServiceFeeDiscount serviceFeeDiscount = discountDetailsList != null ? (ServiceFeeDiscount) CollectionsKt.firstOrNull((List) discountDetailsList) : null;
        boolean z = true;
        if (serviceFeeDiscount == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) context.getString(C13932R.string.debit_card_fee_label));
            spannableStringBuilder.append((CharSequence) " ·  ");
            Object[] objArr = {new StyleSpan(1), new ThemableColorSpans3(ResourceReferences5.toColor(ThemeAttributes.INSTANCE.getCOLOR_POSITIVE()))};
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) context.getString(C13932R.string.debit_card_instant_transfers_label));
            for (int i = 0; i < 2; i++) {
                spannableStringBuilder.setSpan(objArr[i], length, spannableStringBuilder.length(), 17);
            }
            SpannableUtils.insertLightningIcon(spannableStringBuilder, context, ThemeColors.getThemeColor(context, C20690R.attr.colorPositive), 6);
            SpannedString spannedString = new SpannedString(spannableStringBuilder);
            if (serviceFee.compareTo(BigDecimal.ZERO) > 0) {
                str = Money.format$default(Money3.toMoney(serviceFee, Currencies.USD), null, false, null, false, 0, null, false, null, false, false, 1023, null);
            } else {
                str = "";
                z = false;
            }
            String str2 = str;
            charSequenceComponent1 = spannedString;
            strComponent2 = str2;
        } else {
            Tuples2<CharSequence, String> matchaDisplayCombo = getMatchaDisplayCombo(context, serviceFeeDiscount, serviceFee, serviceFeeDiscountAmount);
            charSequenceComponent1 = matchaDisplayCombo.component1();
            strComponent2 = matchaDisplayCombo.component2();
        }
        return new RowDisplayData(charSequenceComponent1, z, strComponent2, statusString);
    }
}
