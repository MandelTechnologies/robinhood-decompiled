package com.robinhood.android.rhy.referral.fund.select;

import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.android.rhy.referral.C27406R;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RhyReferralFundSelectPill.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\f\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/rhy/referral/fund/select/RhyReferralFundSelectPill;", "", "amount", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;ILjava/math/BigDecimal;)V", "getAmount", "()Ljava/math/BigDecimal;", "TWENTY_FIVE", "FIFTY", "ONE_HUNDRED", "OTHER", "displayString", "", "getDisplayString", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "feature-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyReferralFundSelectPill {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RhyReferralFundSelectPill[] $VALUES;
    private final BigDecimal amount;
    public static final RhyReferralFundSelectPill TWENTY_FIVE = new RhyReferralFundSelectPill("TWENTY_FIVE", 0, new BigDecimal(String.valueOf(25.0f)));
    public static final RhyReferralFundSelectPill FIFTY = new RhyReferralFundSelectPill("FIFTY", 1, new BigDecimal(String.valueOf(50.0f)));
    public static final RhyReferralFundSelectPill ONE_HUNDRED = new RhyReferralFundSelectPill("ONE_HUNDRED", 2, new BigDecimal(String.valueOf(100.0f)));
    public static final RhyReferralFundSelectPill OTHER = new RhyReferralFundSelectPill("OTHER", 3, null);

    private static final /* synthetic */ RhyReferralFundSelectPill[] $values() {
        return new RhyReferralFundSelectPill[]{TWENTY_FIVE, FIFTY, ONE_HUNDRED, OTHER};
    }

    public static EnumEntries<RhyReferralFundSelectPill> getEntries() {
        return $ENTRIES;
    }

    private RhyReferralFundSelectPill(String str, int i, BigDecimal bigDecimal) {
        this.amount = bigDecimal;
    }

    public final BigDecimal getAmount() {
        return this.amount;
    }

    static {
        RhyReferralFundSelectPill[] rhyReferralFundSelectPillArr$values = $values();
        $VALUES = rhyReferralFundSelectPillArr$values;
        $ENTRIES = EnumEntries2.enumEntries(rhyReferralFundSelectPillArr$values);
    }

    @JvmName
    public final String getDisplayString(Composer composer, int i) {
        String strStringResource;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1956562045, i, -1, "com.robinhood.android.rhy.referral.fund.select.RhyReferralFundSelectPill.<get-displayString> (RhyReferralFundSelectPill.kt:20)");
        }
        if (this == OTHER) {
            strStringResource = StringResources_androidKt.stringResource(C27406R.string.rhy_referral_funding_ellipses, composer, 0);
        } else {
            NumberFormatter wholeNumberCurrencyFormat = Formats.getWholeNumberCurrencyFormat();
            BigDecimal bigDecimal = this.amount;
            Intrinsics.checkNotNull(bigDecimal);
            strStringResource = wholeNumberCurrencyFormat.format(Float.valueOf(bigDecimal.floatValue()));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return strStringResource;
    }

    public static RhyReferralFundSelectPill valueOf(String str) {
        return (RhyReferralFundSelectPill) Enum.valueOf(RhyReferralFundSelectPill.class, str);
    }

    public static RhyReferralFundSelectPill[] values() {
        return (RhyReferralFundSelectPill[]) $VALUES.clone();
    }
}
