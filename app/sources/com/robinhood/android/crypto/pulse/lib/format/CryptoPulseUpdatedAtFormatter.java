package com.robinhood.android.crypto.pulse.lib.format;

import com.robinhood.android.crypto.pulse.lib.C12946R;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Clock;
import p479j$.time.Duration;
import p479j$.time.Instant;

/* compiled from: CryptoPulseUpdatedAtFormatter.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"j$/time/Instant", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/utils/resource/StringResource;", "updatedAtRelativeString", "(Lj$/time/Instant;Lj$/time/Clock;)Lcom/robinhood/utils/resource/StringResource;", "lib-crypto-pulse_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.pulse.lib.format.CryptoPulseUpdatedAtFormatterKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoPulseUpdatedAtFormatter {
    public static final StringResource updatedAtRelativeString(Instant instant, Clock clock) {
        Intrinsics.checkNotNullParameter(instant, "<this>");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Duration durationBetween = Duration.between(instant, Instant.now(clock));
        if (durationBetween.getSeconds() < 60) {
            return StringResource.INSTANCE.invoke(C12946R.string.crypto_pulse_updated_at_just_now, new Object[0]);
        }
        if (durationBetween.toMinutes() < 60) {
            return StringResource.INSTANCE.invoke(C12946R.string.crypto_pulse_updated_at_minutes_ago, Long.valueOf(durationBetween.toMinutes()));
        }
        return StringResource.INSTANCE.invoke(C12946R.string.crypto_pulse_updated_at_hours_ago, Long.valueOf(durationBetween.toHours()));
    }
}
