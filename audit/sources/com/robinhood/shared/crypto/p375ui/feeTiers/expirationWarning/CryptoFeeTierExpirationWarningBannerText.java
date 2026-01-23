package com.robinhood.shared.crypto.p375ui.feeTiers.expirationWarning;

import com.robinhood.models.crypto.p314db.fee.CryptoFeeTier;
import com.robinhood.models.crypto.p314db.fee.CryptoFeeTierInfo;
import com.robinhood.models.crypto.p314db.fee.CryptoFeeTierInfo6;
import com.robinhood.models.util.Money;
import com.robinhood.shared.crypto.p375ui.C38572R;
import com.robinhood.shared.crypto.p375ui.feeTiers.FormatFeeRate;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;
import p479j$.time.ZoneId;
import p479j$.time.format.DateTimeFormatter;

/* compiled from: CryptoFeeTierExpirationWarningBannerText.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\"\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0018\u0010\t\u001a\u00020\u0006*\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;", "Lcom/robinhood/utils/resource/StringResource;", "getFeeTierExpirationWarningBannerText", "(Lcom/robinhood/models/crypto/db/fee/CryptoFeeTierInfo;)Lcom/robinhood/utils/resource/StringResource;", "feeTierExpirationWarningBannerText", "j$/time/Instant", "", "getFormattedDate", "(Lj$/time/Instant;)Ljava/lang/String;", "formattedDate", "lib-crypto-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.ui.feeTiers.expirationWarning.CryptoFeeTierExpirationWarningBannerTextKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoFeeTierExpirationWarningBannerText {

    /* compiled from: CryptoFeeTierExpirationWarningBannerText.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.ui.feeTiers.expirationWarning.CryptoFeeTierExpirationWarningBannerTextKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoFeeTierInfo6.values().length];
            try {
                iArr[CryptoFeeTierInfo6.FEE_TIER_STATUS_LOSE_TIER_PENDING_AFTER_LOCK_PERIOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoFeeTierInfo6.FEE_TIER_STATUS_CLOSE_TO_LOSE_TIER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CryptoFeeTierInfo6.FEE_TIER_STATUS_UNSPECIFIED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource getFeeTierExpirationWarningBannerText(CryptoFeeTierInfo cryptoFeeTierInfo) {
        Intrinsics.checkNotNullParameter(cryptoFeeTierInfo, "<this>");
        CryptoFeeTier projectedDowngradeFeeTier = cryptoFeeTierInfo.getProjectedDowngradeFeeTier();
        if (projectedDowngradeFeeTier == null) {
            return null;
        }
        CryptoFeeTierInfo6 feeTierStatus = cryptoFeeTierInfo.getFeeTierStatus();
        int i = feeTierStatus == null ? -1 : WhenMappings.$EnumSwitchMapping$0[feeTierStatus.ordinal()];
        if (i != -1) {
            if (i == 1) {
                Instant currentTierExpirationDateTime = cryptoFeeTierInfo.getCurrentTierExpirationDateTime();
                if (currentTierExpirationDateTime == null) {
                    return null;
                }
                return StringResource.INSTANCE.invoke(C38572R.string.crypto_home_tab_fee_tier_status_expiration_banner_text, FormatFeeRate.formatFeeRate(projectedDowngradeFeeTier.getFeeRatio()), getFormattedDate(currentTierExpirationDateTime), Integer.valueOf(cryptoFeeTierInfo.getEvaluationPeriodDays()), Money.formatCompact$default(cryptoFeeTierInfo.getCurrentFeeTier().getMinVolume(), null, null, 0, 3, null));
            }
            if (i == 2) {
                Instant projectedDowngradeDateTime = cryptoFeeTierInfo.getProjectedDowngradeDateTime();
                if (projectedDowngradeDateTime == null) {
                    return null;
                }
                return StringResource.INSTANCE.invoke(C38572R.string.crypto_home_tab_fee_tier_status_projected_expiration_banner_text, FormatFeeRate.formatFeeRate(projectedDowngradeFeeTier.getFeeRatio()), getFormattedDate(projectedDowngradeDateTime), Integer.valueOf(cryptoFeeTierInfo.getEvaluationPeriodDays()), Money.formatCompact$default(cryptoFeeTierInfo.getCurrentFeeTier().getMinVolume(), null, null, 0, 3, null));
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    private static final String getFormattedDate(Instant instant) {
        String str = instant.atZone(ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("MMM d"));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
