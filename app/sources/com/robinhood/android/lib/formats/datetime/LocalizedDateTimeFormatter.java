package com.robinhood.android.lib.formats.datetime;

import android.content.Context;
import androidx.core.i18n.DateTimeFormatter;
import androidx.core.i18n.DateTimeFormatterSkeletonOptions;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.lib.formats.C20282R;
import com.robinhood.g11n.CurrencyFormatterLocale;
import com.robinhood.iso.countrycode.CountryCode;
import java.util.Date;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;
import p479j$.util.DesugarDate;

/* compiled from: LocalizedDateTimeFormatter.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0007\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format;", "format", "j$/time/Instant", GoldFeature.INSTANT, "", "formatWithOption", "(Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format;Lj$/time/Instant;)Ljava/lang/String;", "Landroidx/core/i18n/DateTimeFormatterSkeletonOptions;", "buildOptions", "(Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format;)Landroidx/core/i18n/DateTimeFormatterSkeletonOptions;", "(Lj$/time/Instant;Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format;)Ljava/lang/String;", "Landroid/content/Context;", "Format", "Separator", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class LocalizedDateTimeFormatter {
    private final Context context;

    /* compiled from: LocalizedDateTimeFormatter.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Separator.values().length];
            try {
                iArr[Separator.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Separator.f4263AT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Separator.DOT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LocalizedDateTimeFormatter(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* compiled from: LocalizedDateTimeFormatter.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format;", "", "<init>", "()V", "Medium", "MediumDate", "MediumDateNoYear", "MediumTime", "ShortDate", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format$Medium;", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format$MediumDate;", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format$MediumDateNoYear;", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format$MediumTime;", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format$ShortDate;", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Format {
        public /* synthetic */ Format(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Format() {
        }

        /* compiled from: LocalizedDateTimeFormatter.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format$Medium;", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format;", "<init>", "()V", "separator", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Separator;", "getSeparator", "()Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Separator;", "Default", "NoYear", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format$Medium$Default;", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format$Medium$NoYear;", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static abstract class Medium extends Format {
            public /* synthetic */ Medium(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public abstract Separator getSeparator();

            private Medium() {
                super(null);
            }

            /* compiled from: LocalizedDateTimeFormatter.kt */
            @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format$Medium$Default;", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format$Medium;", "separator", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Separator;", "<init>", "(Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Separator;)V", "getSeparator", "()Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Separator;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Default extends Medium {
                private final Separator separator;

                public static /* synthetic */ Default copy$default(Default r0, Separator separator, int i, Object obj) {
                    if ((i & 1) != 0) {
                        separator = r0.separator;
                    }
                    return r0.copy(separator);
                }

                /* renamed from: component1, reason: from getter */
                public final Separator getSeparator() {
                    return this.separator;
                }

                public final Default copy(Separator separator) {
                    Intrinsics.checkNotNullParameter(separator, "separator");
                    return new Default(separator);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Default) && this.separator == ((Default) other).separator;
                }

                public int hashCode() {
                    return this.separator.hashCode();
                }

                public String toString() {
                    return "Default(separator=" + this.separator + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Default(Separator separator) {
                    super(null);
                    Intrinsics.checkNotNullParameter(separator, "separator");
                    this.separator = separator;
                }

                @Override // com.robinhood.android.lib.formats.datetime.LocalizedDateTimeFormatter.Format.Medium
                public Separator getSeparator() {
                    return this.separator;
                }
            }

            /* compiled from: LocalizedDateTimeFormatter.kt */
            @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format$Medium$NoYear;", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format$Medium;", "separator", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Separator;", "<init>", "(Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Separator;)V", "getSeparator", "()Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Separator;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class NoYear extends Medium {
                private final Separator separator;

                public static /* synthetic */ NoYear copy$default(NoYear noYear, Separator separator, int i, Object obj) {
                    if ((i & 1) != 0) {
                        separator = noYear.separator;
                    }
                    return noYear.copy(separator);
                }

                /* renamed from: component1, reason: from getter */
                public final Separator getSeparator() {
                    return this.separator;
                }

                public final NoYear copy(Separator separator) {
                    Intrinsics.checkNotNullParameter(separator, "separator");
                    return new NoYear(separator);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof NoYear) && this.separator == ((NoYear) other).separator;
                }

                public int hashCode() {
                    return this.separator.hashCode();
                }

                public String toString() {
                    return "NoYear(separator=" + this.separator + ")";
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public NoYear(Separator separator) {
                    super(null);
                    Intrinsics.checkNotNullParameter(separator, "separator");
                    this.separator = separator;
                }

                @Override // com.robinhood.android.lib.formats.datetime.LocalizedDateTimeFormatter.Format.Medium
                public Separator getSeparator() {
                    return this.separator;
                }
            }
        }

        /* compiled from: LocalizedDateTimeFormatter.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format$MediumDate;", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class MediumDate extends Format {
            public static final MediumDate INSTANCE = new MediumDate();

            public boolean equals(Object other) {
                return this == other || (other instanceof MediumDate);
            }

            public int hashCode() {
                return -1077710844;
            }

            public String toString() {
                return "MediumDate";
            }

            private MediumDate() {
                super(null);
            }
        }

        /* compiled from: LocalizedDateTimeFormatter.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format$MediumDateNoYear;", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class MediumDateNoYear extends Format {
            public static final MediumDateNoYear INSTANCE = new MediumDateNoYear();

            public boolean equals(Object other) {
                return this == other || (other instanceof MediumDateNoYear);
            }

            public int hashCode() {
                return -1167553854;
            }

            public String toString() {
                return "MediumDateNoYear";
            }

            private MediumDateNoYear() {
                super(null);
            }
        }

        /* compiled from: LocalizedDateTimeFormatter.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format$MediumTime;", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class MediumTime extends Format {
            public static final MediumTime INSTANCE = new MediumTime();

            public boolean equals(Object other) {
                return this == other || (other instanceof MediumTime);
            }

            public int hashCode() {
                return -1077226717;
            }

            public String toString() {
                return "MediumTime";
            }

            private MediumTime() {
                super(null);
            }
        }

        /* compiled from: LocalizedDateTimeFormatter.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format$ShortDate;", "Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Format;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ShortDate extends Format {
            public static final ShortDate INSTANCE = new ShortDate();

            public boolean equals(Object other) {
                return this == other || (other instanceof ShortDate);
            }

            public int hashCode() {
                return -1867604247;
            }

            public String toString() {
                return "ShortDate";
            }

            private ShortDate() {
                super(null);
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LocalizedDateTimeFormatter.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/lib/formats/datetime/LocalizedDateTimeFormatter$Separator;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", CountryCode.COUNTRY_CODE_AT, "DOT", "lib-formats_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Separator {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Separator[] $VALUES;
        public static final Separator NONE = new Separator("NONE", 0);

        /* renamed from: AT */
        public static final Separator f4263AT = new Separator(CountryCode.COUNTRY_CODE_AT, 1);
        public static final Separator DOT = new Separator("DOT", 2);

        private static final /* synthetic */ Separator[] $values() {
            return new Separator[]{NONE, f4263AT, DOT};
        }

        public static EnumEntries<Separator> getEntries() {
            return $ENTRIES;
        }

        private Separator(String str, int i) {
        }

        static {
            Separator[] separatorArr$values = $values();
            $VALUES = separatorArr$values;
            $ENTRIES = EnumEntries2.enumEntries(separatorArr$values);
        }

        public static Separator valueOf(String str) {
            return (Separator) Enum.valueOf(Separator.class, str);
        }

        public static Separator[] values() {
            return (Separator[]) $VALUES.clone();
        }
    }

    public final String format(Instant instant, Format format2) {
        String string2;
        Format format3;
        Intrinsics.checkNotNullParameter(instant, "instant");
        Intrinsics.checkNotNullParameter(format2, "format");
        if (format2 instanceof Format.Medium) {
            Format.Medium medium = (Format.Medium) format2;
            int i = WhenMappings.$EnumSwitchMapping$0[medium.getSeparator().ordinal()];
            if (i == 1) {
                string2 = null;
            } else if (i == 2) {
                string2 = this.context.getString(C20282R.string.date_time_separator);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                string2 = "·";
            }
            if (medium instanceof Format.Medium.Default) {
                format3 = Format.MediumDate.INSTANCE;
            } else {
                if (!(medium instanceof Format.Medium.NoYear)) {
                    throw new NoWhenBranchMatchedException();
                }
                format3 = Format.MediumDateNoYear.INSTANCE;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(formatWithOption(format3, instant));
            if (string2 != null) {
                sb.append(PlaceholderUtils.XXShortPlaceholderText);
                sb.append(string2);
                sb.append(PlaceholderUtils.XXShortPlaceholderText);
            } else {
                sb.append(PlaceholderUtils.XXShortPlaceholderText);
            }
            sb.append(formatWithOption(Format.MediumTime.INSTANCE, instant));
            return sb.toString();
        }
        if (!Intrinsics.areEqual(format2, Format.MediumDate.INSTANCE) && !Intrinsics.areEqual(format2, Format.MediumDateNoYear.INSTANCE) && !Intrinsics.areEqual(format2, Format.MediumTime.INSTANCE) && !Intrinsics.areEqual(format2, Format.ShortDate.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
        return formatWithOption(format2, instant);
    }

    private final String formatWithOption(Format format2, Instant instant) {
        DateTimeFormatter dateTimeFormatter = new DateTimeFormatter(this.context, buildOptions(format2), CurrencyFormatterLocale.INSTANCE.getInstance().getDateTimeFormatterLocale());
        Date dateFrom = DesugarDate.from(instant);
        Intrinsics.checkNotNullExpressionValue(dateFrom, "from(...)");
        return dateTimeFormatter.format(dateFrom);
    }

    private final DateTimeFormatterSkeletonOptions buildOptions(Format format2) {
        DateTimeFormatterSkeletonOptions.Builder year;
        DateTimeFormatterSkeletonOptions.Builder builder = new DateTimeFormatterSkeletonOptions.Builder(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
        if (format2 instanceof Format.Medium.Default) {
            year = builder.setDay(DateTimeFormatterSkeletonOptions.Day.NUMERIC).setMonth(DateTimeFormatterSkeletonOptions.Month.ABBREVIATED).setYear(DateTimeFormatterSkeletonOptions.Year.NUMERIC).setHour(DateTimeFormatterSkeletonOptions.Hour.NUMERIC).setMinute(DateTimeFormatterSkeletonOptions.Minute.NUMERIC).setPeriod(DateTimeFormatterSkeletonOptions.Period.ABBREVIATED);
        } else if (format2 instanceof Format.Medium.NoYear) {
            year = builder.setDay(DateTimeFormatterSkeletonOptions.Day.NUMERIC).setMonth(DateTimeFormatterSkeletonOptions.Month.ABBREVIATED).setHour(DateTimeFormatterSkeletonOptions.Hour.NUMERIC).setMinute(DateTimeFormatterSkeletonOptions.Minute.NUMERIC).setPeriod(DateTimeFormatterSkeletonOptions.Period.ABBREVIATED);
        } else if (Intrinsics.areEqual(format2, Format.MediumDate.INSTANCE)) {
            year = builder.setDay(DateTimeFormatterSkeletonOptions.Day.NUMERIC).setMonth(DateTimeFormatterSkeletonOptions.Month.ABBREVIATED).setYear(DateTimeFormatterSkeletonOptions.Year.NUMERIC);
        } else if (Intrinsics.areEqual(format2, Format.MediumDateNoYear.INSTANCE)) {
            year = builder.setDay(DateTimeFormatterSkeletonOptions.Day.NUMERIC).setMonth(DateTimeFormatterSkeletonOptions.Month.ABBREVIATED);
        } else if (Intrinsics.areEqual(format2, Format.MediumTime.INSTANCE)) {
            year = builder.setHour(DateTimeFormatterSkeletonOptions.Hour.NUMERIC).setMinute(DateTimeFormatterSkeletonOptions.Minute.NUMERIC).setPeriod(DateTimeFormatterSkeletonOptions.Period.ABBREVIATED);
        } else {
            if (!Intrinsics.areEqual(format2, Format.ShortDate.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            year = builder.setDay(DateTimeFormatterSkeletonOptions.Day.NUMERIC).setMonth(DateTimeFormatterSkeletonOptions.Month.NUMERIC).setYear(DateTimeFormatterSkeletonOptions.Year.TWO_DIGITS);
        }
        return year.build();
    }
}
