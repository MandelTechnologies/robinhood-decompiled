package kotlin.time;

import com.singular.sdk.internal.Constants;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DurationUnit.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0001\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0001H\u0001\u001a\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0001¨\u0006\t"}, m3636d2 = {"shortName", "", "Lkotlin/time/DurationUnit;", "durationUnitByShortName", "durationUnitByIsoChar", "isoChar", "", "isTimeComponent", "", "kotlin-stdlib"}, m3637k = 5, m3638mv = {2, 1, 0}, m3640xi = 49, m3641xs = "kotlin/time/DurationUnitKt")
/* renamed from: kotlin.time.DurationUnitKt__DurationUnitKt, reason: use source file name */
/* loaded from: classes23.dex */
class DurationUnit2 extends DurationUnitJvm2 {

    /* compiled from: DurationUnit.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: kotlin.time.DurationUnitKt__DurationUnitKt$WhenMappings */
    /* loaded from: classes14.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DurationUnitJvm.values().length];
            try {
                iArr[DurationUnitJvm.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DurationUnitJvm.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DurationUnitJvm.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DurationUnitJvm.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DurationUnitJvm.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DurationUnitJvm.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DurationUnitJvm.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @SinceKotlin
    public static final String shortName(DurationUnitJvm durationUnitJvm) {
        Intrinsics.checkNotNullParameter(durationUnitJvm, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[durationUnitJvm.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "us";
            case 3:
                return "ms";
            case 4:
                return Constants.RequestParamsKeys.SESSION_ID_KEY;
            case 5:
                return "m";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new IllegalStateException(("Unknown unit: " + durationUnitJvm).toString());
        }
    }

    @SinceKotlin
    public static final DurationUnitJvm durationUnitByShortName(String shortName) {
        Intrinsics.checkNotNullParameter(shortName, "shortName");
        int iHashCode = shortName.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && shortName.equals("us")) {
                                    return DurationUnitJvm.MICROSECONDS;
                                }
                            } else if (shortName.equals("ns")) {
                                return DurationUnitJvm.NANOSECONDS;
                            }
                        } else if (shortName.equals("ms")) {
                            return DurationUnitJvm.MILLISECONDS;
                        }
                    } else if (shortName.equals(Constants.RequestParamsKeys.SESSION_ID_KEY)) {
                        return DurationUnitJvm.SECONDS;
                    }
                } else if (shortName.equals("m")) {
                    return DurationUnitJvm.MINUTES;
                }
            } else if (shortName.equals("h")) {
                return DurationUnitJvm.HOURS;
            }
        } else if (shortName.equals("d")) {
            return DurationUnitJvm.DAYS;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }

    @SinceKotlin
    public static final DurationUnitJvm durationUnitByIsoChar(char c, boolean z) {
        if (!z) {
            if (c == 'D') {
                return DurationUnitJvm.DAYS;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c);
        }
        if (c == 'H') {
            return DurationUnitJvm.HOURS;
        }
        if (c == 'M') {
            return DurationUnitJvm.MINUTES;
        }
        if (c == 'S') {
            return DurationUnitJvm.SECONDS;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c);
    }
}
