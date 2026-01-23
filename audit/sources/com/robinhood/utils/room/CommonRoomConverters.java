package com.robinhood.utils.room;

import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.database.InjectedTypeConverter;
import com.robinhood.utils.extensions.StringsKt;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.extensions.Uuids;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.HttpUrl;
import org.threeten.extra.AmPm;
import org.threeten.extra.YearQuarter;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.LocalDateTime;
import p479j$.time.OffsetDateTime;
import p479j$.time.ZonedDateTime;
import p479j$.time.format.DateTimeFormatter;
import p479j$.time.format.DateTimeFormatterBuilder;
import p479j$.time.format.ResolverStyle;

/* compiled from: CommonRoomConverters.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0007\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 [2\u00020\u0001:\u0001[B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001c\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001a2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u0004\u0018\u00010\u00062\b\u0010!\u001a\u0004\u0018\u00010 H\u0007¢\u0006\u0004\b\"\u0010#J\u001b\u0010$\u001a\u0004\u0018\u00010 2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b$\u0010%J\u001b\u0010(\u001a\u0004\u0018\u00010\u00062\b\u0010'\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0004\b(\u0010)J\u001b\u0010*\u001a\u0004\u0018\u00010&2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b*\u0010+J\u001b\u0010.\u001a\u0004\u0018\u00010\u00062\b\u0010-\u001a\u0004\u0018\u00010,H\u0007¢\u0006\u0004\b.\u0010/J\u001b\u00100\u001a\u0004\u0018\u00010,2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b0\u00101J\u001b\u00104\u001a\u0004\u0018\u00010\u00062\b\u00103\u001a\u0004\u0018\u000102H\u0007¢\u0006\u0004\b4\u00105J\u001b\u00106\u001a\u0004\u0018\u0001022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b6\u00107J\u001b\u0010:\u001a\u0004\u0018\u00010\u00062\b\u00109\u001a\u0004\u0018\u000108H\u0007¢\u0006\u0004\b:\u0010;J\u001b\u0010<\u001a\u0004\u0018\u0001082\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b<\u0010=J\u001b\u0010@\u001a\u0004\u0018\u00010\u00062\b\u0010?\u001a\u0004\u0018\u00010>H\u0007¢\u0006\u0004\b@\u0010AJ\u001b\u0010B\u001a\u0004\u0018\u00010>2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bB\u0010CJ!\u0010E\u001a\u0004\u0018\u00010\u00062\u000e\u0010D\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001aH\u0007¢\u0006\u0004\bE\u0010\u001dJ!\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001a2\b\u0010F\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bG\u0010\u001fJ!\u0010J\u001a\u0004\u0018\u00010\u00062\u000e\u0010I\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010\u001aH\u0007¢\u0006\u0004\bJ\u0010\u001dJ!\u0010K\u001a\n\u0012\u0004\u0012\u00020H\u0018\u00010\u001a2\b\u0010F\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bK\u0010\u001fJ\u001b\u0010M\u001a\u0004\u0018\u00010\u00062\b\u0010L\u001a\u0004\u0018\u00010HH\u0007¢\u0006\u0004\bM\u0010NJ\u001b\u0010P\u001a\u0004\u0018\u00010H2\b\u0010O\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\bP\u0010QR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010R\u001a\u0004\bS\u0010TR%\u0010W\u001a\u0013\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0014¢\u0006\u0002\bV0\u001a0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR%\u0010Y\u001a\u0013\u0012\u000f\u0012\r\u0012\t\u0012\u00070\u0006¢\u0006\u0002\bV0\u001a0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010XR%\u0010Z\u001a\u0013\u0012\u000f\u0012\r\u0012\t\u0012\u00070H¢\u0006\u0002\bV0\u001a0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010X¨\u0006\\"}, m3636d2 = {"Lcom/robinhood/utils/room/CommonRoomConverters;", "Lcom/robinhood/database/InjectedTypeConverter;", "Lcom/robinhood/utils/moshi/LazyMoshi;", "moshi", "<init>", "(Lcom/robinhood/utils/moshi/LazyMoshi;)V", "", "input", "Ljava/math/BigDecimal;", "stringToBigDecimal", "(Ljava/lang/String;)Ljava/math/BigDecimal;", "bigDecimalToString", "(Ljava/math/BigDecimal;)Ljava/lang/String;", "j$/time/Instant", GoldFeature.INSTANT, "instantToString", "(Lj$/time/Instant;)Ljava/lang/String;", "string", "stringToInstant", "(Ljava/lang/String;)Lj$/time/Instant;", "j$/time/LocalDate", "localDate", "localDateToString", "(Lj$/time/LocalDate;)Ljava/lang/String;", "stringToLocalDate", "(Ljava/lang/String;)Lj$/time/LocalDate;", "", "localDates", "localDateListToString", "(Ljava/util/List;)Ljava/lang/String;", "stringToLocalDateList", "(Ljava/lang/String;)Ljava/util/List;", "j$/time/LocalDateTime", "localDateTime", "localDateTimeToString", "(Lj$/time/LocalDateTime;)Ljava/lang/String;", "stringToLocalDateTime", "(Ljava/lang/String;)Lj$/time/LocalDateTime;", "j$/time/OffsetDateTime", "offsetDateTime", "offsetDateTimeToString", "(Lj$/time/OffsetDateTime;)Ljava/lang/String;", "stringToOffsetDateTime", "(Ljava/lang/String;)Lj$/time/OffsetDateTime;", "j$/time/ZonedDateTime", "zonedDateTime", "zonedDateTimeToString", "(Lj$/time/ZonedDateTime;)Ljava/lang/String;", "stringToZonedDateTime", "(Ljava/lang/String;)Lj$/time/ZonedDateTime;", "Lorg/threeten/extra/AmPm;", "amPm", "amPmToString", "(Lorg/threeten/extra/AmPm;)Ljava/lang/String;", "stringToAmPm", "(Ljava/lang/String;)Lorg/threeten/extra/AmPm;", "Lorg/threeten/extra/YearQuarter;", "yearQuarter", "yearQuarterToString", "(Lorg/threeten/extra/YearQuarter;)Ljava/lang/String;", "stringToYearQuarter", "(Ljava/lang/String;)Lorg/threeten/extra/YearQuarter;", "Lokhttp3/HttpUrl;", "httpUrl", "httpUrlToStringConverter", "(Lokhttp3/HttpUrl;)Ljava/lang/String;", "stringToHttpUrlConverter", "(Ljava/lang/String;)Lokhttp3/HttpUrl;", "strings", "stringListToString", "str", "stringToStringList", "Ljava/util/UUID;", "uuids", "uuidListToString", "stringToUuidList", "uuid", "uuidToString", "(Ljava/util/UUID;)Ljava/lang/String;", "uuidString", "stringToUuid", "(Ljava/lang/String;)Ljava/util/UUID;", "Lcom/robinhood/utils/moshi/LazyMoshi;", "getMoshi", "()Lcom/robinhood/utils/moshi/LazyMoshi;", "Lcom/squareup/moshi/JsonAdapter;", "Lkotlin/jvm/JvmSuppressWildcards;", "localDateListJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "stringListJsonAdapter", "uuidListJsonAdapter", "Companion", "lib-utils-room_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes21.dex */
public final class CommonRoomConverters implements InjectedTypeConverter {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int INSTANT_FRACTIONAL_DIGITS = 9;
    private static final DateTimeFormatter fixedPrecisionInstantFormatter;
    private final JsonAdapter<List<LocalDate>> localDateListJsonAdapter;
    private final LazyMoshi moshi;
    private final JsonAdapter<List<String>> stringListJsonAdapter;
    private final JsonAdapter<List<UUID>> uuidListJsonAdapter;

    public CommonRoomConverters(LazyMoshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.moshi = moshi;
        Types types = Types.INSTANCE;
        this.localDateListJsonAdapter = moshi.adapter(new TypeToken<List<LocalDate>>() { // from class: com.robinhood.utils.room.CommonRoomConverters$special$$inlined$getAdapter$1
        }.getType());
        this.stringListJsonAdapter = moshi.adapter(new TypeToken<List<String>>() { // from class: com.robinhood.utils.room.CommonRoomConverters$special$$inlined$getAdapter$2
        }.getType());
        this.uuidListJsonAdapter = moshi.adapter(new TypeToken<List<UUID>>() { // from class: com.robinhood.utils.room.CommonRoomConverters$special$$inlined$getAdapter$3
        }.getType());
    }

    public final LazyMoshi getMoshi() {
        return this.moshi;
    }

    public final BigDecimal stringToBigDecimal(String input) {
        if (input != null) {
            return new BigDecimal(input);
        }
        return null;
    }

    public final String bigDecimalToString(BigDecimal input) {
        if (input != null) {
            return input.toString();
        }
        return null;
    }

    public final String instantToString(Instant instant) {
        if (instant != null) {
            return INSTANCE.instantToString(instant);
        }
        return null;
    }

    public final Instant stringToInstant(String string2) {
        if (string2 != null) {
            return Instant.parse(string2);
        }
        return null;
    }

    public final String localDateToString(LocalDate localDate) {
        if (localDate != null) {
            return localDate.toString();
        }
        return null;
    }

    public final LocalDate stringToLocalDate(String string2) {
        if (string2 != null) {
            return LocalDate.parse(string2);
        }
        return null;
    }

    public final String localDateListToString(List<LocalDate> localDates) {
        if (localDates != null) {
            return this.localDateListJsonAdapter.toJson(localDates);
        }
        return null;
    }

    public final List<LocalDate> stringToLocalDateList(String string2) {
        if (string2 != null) {
            return this.localDateListJsonAdapter.fromJson(string2);
        }
        return null;
    }

    public final String localDateTimeToString(LocalDateTime localDateTime) {
        if (localDateTime != null) {
            return localDateTime.toString();
        }
        return null;
    }

    public final LocalDateTime stringToLocalDateTime(String string2) {
        if (string2 != null) {
            return LocalDateTime.parse(string2);
        }
        return null;
    }

    public final String offsetDateTimeToString(OffsetDateTime offsetDateTime) {
        if (offsetDateTime != null) {
            return offsetDateTime.toString();
        }
        return null;
    }

    public final OffsetDateTime stringToOffsetDateTime(String string2) {
        if (string2 != null) {
            return OffsetDateTime.parse(string2);
        }
        return null;
    }

    public final String zonedDateTimeToString(ZonedDateTime zonedDateTime) {
        if (zonedDateTime != null) {
            return zonedDateTime.toString();
        }
        return null;
    }

    public final ZonedDateTime stringToZonedDateTime(String string2) {
        if (string2 != null) {
            return ZonedDateTime.parse(string2);
        }
        return null;
    }

    public final String amPmToString(AmPm amPm) {
        if (amPm != null) {
            return amPm.name();
        }
        return null;
    }

    public final AmPm stringToAmPm(String string2) {
        if (string2 != null) {
            return AmPm.valueOf(string2);
        }
        return null;
    }

    public final String yearQuarterToString(YearQuarter yearQuarter) {
        if (yearQuarter != null) {
            return yearQuarter.toString();
        }
        return null;
    }

    public final YearQuarter stringToYearQuarter(String string2) {
        if (string2 != null) {
            return YearQuarter.parse(string2);
        }
        return null;
    }

    public final String httpUrlToStringConverter(HttpUrl httpUrl) {
        if (httpUrl != null) {
            return httpUrl.getUrl();
        }
        return null;
    }

    public final HttpUrl stringToHttpUrlConverter(String string2) {
        if (string2 != null) {
            return HttpUrl.INSTANCE.parse(string2);
        }
        return null;
    }

    public final String stringListToString(List<String> strings) {
        if (strings != null) {
            return this.stringListJsonAdapter.toJson(strings);
        }
        return null;
    }

    public final List<String> stringToStringList(String str) {
        if (str != null) {
            return this.stringListJsonAdapter.fromJson(str);
        }
        return null;
    }

    public final String uuidListToString(List<UUID> uuids) {
        if (uuids != null) {
            return this.uuidListJsonAdapter.toJson(uuids);
        }
        return null;
    }

    public final List<UUID> stringToUuidList(String str) {
        if (str != null) {
            return this.uuidListJsonAdapter.fromJson(str);
        }
        return null;
    }

    public final String uuidToString(UUID uuid) {
        if (uuid != null) {
            return Uuids.safeToString(uuid);
        }
        return null;
    }

    public final UUID stringToUuid(String uuidString) {
        if (uuidString != null) {
            return StringsKt.toUuid(uuidString);
        }
        return null;
    }

    /* compiled from: CommonRoomConverters.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/utils/room/CommonRoomConverters$Companion;", "", "<init>", "()V", "j$/time/Instant", GoldFeature.INSTANT, "", "instantToString", "(Lj$/time/Instant;)Ljava/lang/String;", "", "INSTANT_FRACTIONAL_DIGITS", "I", "j$/time/format/DateTimeFormatter", "fixedPrecisionInstantFormatter", "Lj$/time/format/DateTimeFormatter;", "lib-utils-room_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String instantToString(Instant instant) {
            Intrinsics.checkNotNullParameter(instant, "instant");
            String str = CommonRoomConverters.fixedPrecisionInstantFormatter.format(instant);
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
    }

    static {
        DateTimeFormatter dateTimeFormatterWithResolverStyle = new DateTimeFormatterBuilder().parseCaseInsensitive().appendInstant(9).toFormatter().withResolverStyle(ResolverStyle.STRICT);
        Intrinsics.checkNotNullExpressionValue(dateTimeFormatterWithResolverStyle, "withResolverStyle(...)");
        fixedPrecisionInstantFormatter = dateTimeFormatterWithResolverStyle;
    }
}
