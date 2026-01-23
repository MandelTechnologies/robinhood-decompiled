package com.robinhood.librobinhood.data.store;

import com.robinhood.enums.RhEnum;
import com.robinhood.models.p320db.KaizenExperiment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Duration;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CryptoExperimentsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000ej\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/PollingIntervalVariant;", "Lcom/robinhood/enums/RhEnum;", "", "", "serverValue", "j$/time/Duration", "duration", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lj$/time/Duration;)V", "Ljava/lang/String;", "getServerValue", "()Ljava/lang/String;", "Lj$/time/Duration;", "getDuration", "()Lj$/time/Duration;", "Companion", "CONTROL", "MEMBER_1", "MEMBER_2", "MEMBER_3", "MEMBER_4", "lib-store-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class PollingIntervalVariant implements RhEnum<PollingIntervalVariant> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PollingIntervalVariant[] $VALUES;
    public static final PollingIntervalVariant CONTROL;
    public static final PollingIntervalVariant MEMBER_1;
    public static final PollingIntervalVariant MEMBER_2;
    public static final PollingIntervalVariant MEMBER_3;
    public static final PollingIntervalVariant MEMBER_4;
    private final Duration duration;
    private final String serverValue;

    private static final /* synthetic */ PollingIntervalVariant[] $values() {
        return new PollingIntervalVariant[]{CONTROL, MEMBER_1, MEMBER_2, MEMBER_3, MEMBER_4};
    }

    public static EnumEntries<PollingIntervalVariant> getEntries() {
        return $ENTRIES;
    }

    private PollingIntervalVariant(String str, int i, String str2, Duration duration) {
        this.serverValue = str2;
        this.duration = duration;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    public final Duration getDuration() {
        return this.duration;
    }

    static {
        Duration durationOfSeconds = Duration.ofSeconds(5L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        CONTROL = new PollingIntervalVariant("CONTROL", 0, KaizenExperiment.VARIATION_CONTROL, durationOfSeconds);
        Duration durationOfSeconds2 = Duration.ofSeconds(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds2, "ofSeconds(...)");
        MEMBER_1 = new PollingIntervalVariant("MEMBER_1", 1, "member1", durationOfSeconds2);
        Duration durationOfSeconds3 = Duration.ofSeconds(2L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds3, "ofSeconds(...)");
        MEMBER_2 = new PollingIntervalVariant("MEMBER_2", 2, "member2", durationOfSeconds3);
        Duration durationOfSeconds4 = Duration.ofSeconds(3L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds4, "ofSeconds(...)");
        MEMBER_3 = new PollingIntervalVariant("MEMBER_3", 3, "member3", durationOfSeconds4);
        Duration durationOfSeconds5 = Duration.ofSeconds(4L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds5, "ofSeconds(...)");
        MEMBER_4 = new PollingIntervalVariant("MEMBER_4", 4, "member4", durationOfSeconds5);
        PollingIntervalVariant[] pollingIntervalVariantArr$values = $values();
        $VALUES = pollingIntervalVariantArr$values;
        $ENTRIES = EnumEntries2.enumEntries(pollingIntervalVariantArr$values);
        INSTANCE = new Companion(null);
    }

    public static PollingIntervalVariant valueOf(String str) {
        return (PollingIntervalVariant) Enum.valueOf(PollingIntervalVariant.class, str);
    }

    public static PollingIntervalVariant[] values() {
        return (PollingIntervalVariant[]) $VALUES.clone();
    }
}
