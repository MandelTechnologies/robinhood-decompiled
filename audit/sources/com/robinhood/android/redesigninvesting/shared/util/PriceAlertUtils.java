package com.robinhood.android.redesigninvesting.shared.util;

import com.robinhood.android.redesign.model.HighlightImpression;
import com.robinhood.android.redesigninvesting.redesignsettings.RedesignSettings;
import com.robinhood.models.card.p311db.Card;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: PriceAlertUtils.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/redesigninvesting/shared/util/PriceAlertUtil;", "", "<init>", "()V", "Lcom/robinhood/android/redesign/model/HighlightImpression;", "highlightImpression", "Lcom/robinhood/android/redesigninvesting/redesignsettings/RedesignSettings$HighlightSettings;", "settings", "j$/time/Clock", Card.Icon.CLOCK, "Lkotlin/Function0;", "", "priceCheck", "isPriceAlertEligibleForDisplay", "(Lcom/robinhood/android/redesign/model/HighlightImpression;Lcom/robinhood/android/redesigninvesting/redesignsettings/RedesignSettings$HighlightSettings;Lj$/time/Clock;Lkotlin/jvm/functions/Function0;)Z", "lib-shared-util_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.redesigninvesting.shared.util.PriceAlertUtil, reason: use source file name */
/* loaded from: classes5.dex */
public final class PriceAlertUtils {
    public static final PriceAlertUtils INSTANCE = new PriceAlertUtils();

    private PriceAlertUtils() {
    }

    public final boolean isPriceAlertEligibleForDisplay(HighlightImpression highlightImpression, RedesignSettings.HighlightSettings settings, Clock clock, Function0<Boolean> priceCheck) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(priceCheck, "priceCheck");
        Long firstSeenAt = highlightImpression != null ? highlightImpression.getFirstSeenAt() : null;
        Long lValueOf = highlightImpression != null ? Long.valueOf(highlightImpression.getFirstGeneratedAt()) : null;
        return priceCheck.invoke().booleanValue() && (firstSeenAt == null || clock.instant().isBefore(Instant.ofEpochMilli(firstSeenAt.longValue()).plusSeconds(settings.getPriceAlertsFirstSeenThresholdSeconds()))) && (lValueOf == null || clock.instant().isBefore(Instant.ofEpochMilli(lValueOf.longValue()).plusSeconds(settings.getPriceAlertStaleDurationThresholdSeconds())));
    }
}
