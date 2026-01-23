package com.robinhood.android.idl.common.httpoption;

import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.idl.IdlDecimal;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.ByteString;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.format.DateTimeFormatter;
import retrofit2.Converter;
import retrofit2.Retrofit;

/* compiled from: HttpOptionAdapterFactory.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u0004\u001a\u000e\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/idl/common/httpoption/HttpOptionAdapterFactory;", "Lretrofit2/Converter$Factory;", "<init>", "()V", "stringConverter", "Lretrofit2/Converter;", "", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "retrofit", "Lretrofit2/Retrofit;", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;", "ToStringFormatter", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class HttpOptionAdapterFactory extends Converter.Factory {

    /* compiled from: HttpOptionAdapterFactory.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u00020\u00040\u0003:\u0007\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/idl/common/httpoption/HttpOptionAdapterFactory$ToStringFormatter;", "T", "", "Lretrofit2/Converter;", "", "DefaultToStringFormatter", "ByteStringToStringFormatter", "DurationToStringFormatter", "TimestampToStringFormatter", "UnsignedLongToStringFormatter", "UnsignedIntToStringFormatter", "DecimalToStringFormatter", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes10.dex */
    public interface ToStringFormatter<T> extends Converter<T, String> {
        @Override // retrofit2.Converter
        /* synthetic */ String convert(Object obj) throws IOException;

        /* compiled from: HttpOptionAdapterFactory.kt */
        @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u0006HÖ\u0001¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/idl/common/httpoption/HttpOptionAdapterFactory$ToStringFormatter$DefaultToStringFormatter;", "Lcom/robinhood/android/idl/common/httpoption/HttpOptionAdapterFactory$ToStringFormatter;", "", "<init>", "()V", "convert", "", "value", "equals", "", "other", "hashCode", "", "toString", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DefaultToStringFormatter implements ToStringFormatter<Object> {
            public static final DefaultToStringFormatter INSTANCE = new DefaultToStringFormatter();

            public boolean equals(Object other) {
                return this == other || (other instanceof DefaultToStringFormatter);
            }

            public int hashCode() {
                return -2132720924;
            }

            public String toString() {
                return "DefaultToStringFormatter";
            }

            private DefaultToStringFormatter() {
            }

            @Override // com.robinhood.android.idl.common.httpoption.HttpOptionAdapterFactory.ToStringFormatter, retrofit2.Converter
            public String convert(Object value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.toString();
            }
        }

        /* compiled from: HttpOptionAdapterFactory.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0006HÖ\u0001¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/idl/common/httpoption/HttpOptionAdapterFactory$ToStringFormatter$ByteStringToStringFormatter;", "Lcom/robinhood/android/idl/common/httpoption/HttpOptionAdapterFactory$ToStringFormatter;", "Lokio/ByteString;", "<init>", "()V", "convert", "", "value", "equals", "", "other", "", "hashCode", "", "toString", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ByteStringToStringFormatter implements ToStringFormatter<ByteString> {
            public static final ByteStringToStringFormatter INSTANCE = new ByteStringToStringFormatter();

            public boolean equals(Object other) {
                return this == other || (other instanceof ByteStringToStringFormatter);
            }

            public int hashCode() {
                return 1149592766;
            }

            public String toString() {
                return "ByteStringToStringFormatter";
            }

            private ByteStringToStringFormatter() {
            }

            @Override // com.robinhood.android.idl.common.httpoption.HttpOptionAdapterFactory.ToStringFormatter, retrofit2.Converter
            public String convert(ByteString value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.base64();
            }
        }

        /* compiled from: HttpOptionAdapterFactory.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/idl/common/httpoption/HttpOptionAdapterFactory$ToStringFormatter$DurationToStringFormatter;", "Lcom/robinhood/android/idl/common/httpoption/HttpOptionAdapterFactory$ToStringFormatter;", "j$/time/Duration", "<init>", "()V", "value", "", "convert", "(Lj$/time/Duration;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DurationToStringFormatter implements ToStringFormatter<Duration> {
            public static final DurationToStringFormatter INSTANCE = new DurationToStringFormatter();

            public boolean equals(Object other) {
                return this == other || (other instanceof DurationToStringFormatter);
            }

            public int hashCode() {
                return 1314814467;
            }

            public String toString() {
                return "DurationToStringFormatter";
            }

            private DurationToStringFormatter() {
            }

            @Override // com.robinhood.android.idl.common.httpoption.HttpOptionAdapterFactory.ToStringFormatter, retrofit2.Converter
            public String convert(Duration value) {
                String str;
                Intrinsics.checkNotNullParameter(value, "value");
                long seconds = value.getSeconds();
                int nano = value.getNano();
                if (seconds < 0) {
                    if (seconds == Long.MIN_VALUE) {
                        str = "-922337203685477580";
                        seconds = 8;
                    } else {
                        seconds = -seconds;
                        str = "-";
                    }
                    if (nano != 0) {
                        seconds--;
                        nano = 1000000000 - nano;
                    }
                } else {
                    str = "";
                }
                if (nano == 0) {
                    String str2 = String.format("%s%ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds)}, 2));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                    return str2;
                }
                if (nano % InvestFlowConstants.MAX_ONE_TIME_AMOUNT == 0) {
                    String str3 = String.format("%s%d.%03ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(nano / 1000000)}, 3));
                    Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                    return str3;
                }
                if (nano % 1000 == 0) {
                    String str4 = String.format("%s%d.%06ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(nano / 1000)}, 3));
                    Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
                    return str4;
                }
                String str5 = String.format("%s%d.%09ds", Arrays.copyOf(new Object[]{str, Long.valueOf(seconds), Long.valueOf(nano)}, 3));
                Intrinsics.checkNotNullExpressionValue(str5, "format(...)");
                return str5;
            }
        }

        /* compiled from: HttpOptionAdapterFactory.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/idl/common/httpoption/HttpOptionAdapterFactory$ToStringFormatter$TimestampToStringFormatter;", "Lcom/robinhood/android/idl/common/httpoption/HttpOptionAdapterFactory$ToStringFormatter;", "j$/time/Instant", "<init>", "()V", "value", "", "convert", "(Lj$/time/Instant;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class TimestampToStringFormatter implements ToStringFormatter<Instant> {
            public static final TimestampToStringFormatter INSTANCE = new TimestampToStringFormatter();

            public boolean equals(Object other) {
                return this == other || (other instanceof TimestampToStringFormatter);
            }

            public int hashCode() {
                return -89450769;
            }

            public String toString() {
                return "TimestampToStringFormatter";
            }

            private TimestampToStringFormatter() {
            }

            @Override // com.robinhood.android.idl.common.httpoption.HttpOptionAdapterFactory.ToStringFormatter, retrofit2.Converter
            public String convert(Instant value) {
                Intrinsics.checkNotNullParameter(value, "value");
                String str = DateTimeFormatter.ISO_INSTANT.format(value);
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                return str;
            }
        }

        /* compiled from: HttpOptionAdapterFactory.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\bHÖ\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/idl/common/httpoption/HttpOptionAdapterFactory$ToStringFormatter$UnsignedLongToStringFormatter;", "Lcom/robinhood/android/idl/common/httpoption/HttpOptionAdapterFactory$ToStringFormatter;", "", "<init>", "()V", "power64", "Ljava/math/BigInteger;", "convert", "", "value", "equals", "", "other", "", "hashCode", "", "toString", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UnsignedLongToStringFormatter implements ToStringFormatter<Long> {
            public static final UnsignedLongToStringFormatter INSTANCE = new UnsignedLongToStringFormatter();
            private static final BigInteger power64 = new BigInteger("18446744073709551616");

            public boolean equals(Object other) {
                return this == other || (other instanceof UnsignedLongToStringFormatter);
            }

            public int hashCode() {
                return 97963430;
            }

            public String toString() {
                return "UnsignedLongToStringFormatter";
            }

            private UnsignedLongToStringFormatter() {
            }

            @Override // com.robinhood.android.idl.common.httpoption.HttpOptionAdapterFactory.ToStringFormatter, retrofit2.Converter
            public /* bridge */ /* synthetic */ String convert(Object obj) {
                return convert(((Number) obj).longValue());
            }

            public String convert(long value) {
                Object objValueOf;
                if (value < 0) {
                    objValueOf = power64.add(BigInteger.valueOf(value));
                } else {
                    objValueOf = Long.valueOf(value);
                }
                return objValueOf.toString();
            }
        }

        /* compiled from: HttpOptionAdapterFactory.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000f\u001a\u00020\bHÖ\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/idl/common/httpoption/HttpOptionAdapterFactory$ToStringFormatter$UnsignedIntToStringFormatter;", "Lcom/robinhood/android/idl/common/httpoption/HttpOptionAdapterFactory$ToStringFormatter;", "", "<init>", "()V", "power32", "", "convert", "", "value", "equals", "", "other", "", "hashCode", "toString", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UnsignedIntToStringFormatter implements ToStringFormatter<Integer> {
            public static final UnsignedIntToStringFormatter INSTANCE = new UnsignedIntToStringFormatter();
            private static final long power32 = 4294967296L;

            public boolean equals(Object other) {
                return this == other || (other instanceof UnsignedIntToStringFormatter);
            }

            public int hashCode() {
                return -1535977973;
            }

            public String toString() {
                return "UnsignedIntToStringFormatter";
            }

            private UnsignedIntToStringFormatter() {
            }

            @Override // com.robinhood.android.idl.common.httpoption.HttpOptionAdapterFactory.ToStringFormatter, retrofit2.Converter
            public /* bridge */ /* synthetic */ String convert(Object obj) {
                return convert(((Number) obj).intValue());
            }

            public String convert(int value) {
                Object objValueOf;
                if (value < 0) {
                    objValueOf = Long.valueOf(value + power32);
                } else {
                    objValueOf = Integer.valueOf(value);
                }
                return objValueOf.toString();
            }
        }

        /* compiled from: HttpOptionAdapterFactory.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0006HÖ\u0001¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/idl/common/httpoption/HttpOptionAdapterFactory$ToStringFormatter$DecimalToStringFormatter;", "Lcom/robinhood/android/idl/common/httpoption/HttpOptionAdapterFactory$ToStringFormatter;", "Lcom/robinhood/idl/IdlDecimal;", "<init>", "()V", "convert", "", "value", "equals", "", "other", "", "hashCode", "", "toString", "lib-serialization_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class DecimalToStringFormatter implements ToStringFormatter<IdlDecimal> {
            public static final DecimalToStringFormatter INSTANCE = new DecimalToStringFormatter();

            public boolean equals(Object other) {
                return this == other || (other instanceof DecimalToStringFormatter);
            }

            public int hashCode() {
                return 438814676;
            }

            public String toString() {
                return "DecimalToStringFormatter";
            }

            private DecimalToStringFormatter() {
            }

            @Override // com.robinhood.android.idl.common.httpoption.HttpOptionAdapterFactory.ToStringFormatter, retrofit2.Converter
            public String convert(IdlDecimal value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.getStringValue();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
    
        if (r4.equals("sfixed64") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
    
        if (r4.equals("google.protobuf.Int64Value") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        if (r4.equals("google.protobuf.BytesValue") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0065, code lost:
    
        if (r4.equals("google.protobuf.UInt64Value") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0087, code lost:
    
        if (r4.equals("int64") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0090, code lost:
    
        if (r4.equals("bytes") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0095, code lost:
    
        return com.robinhood.android.idl.common.httpoption.HttpOptionAdapterFactory.ToStringFormatter.ByteStringToStringFormatter.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x009c, code lost:
    
        if (r4.equals("fixed64") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a5, code lost:
    
        if (r4.equals("fixed32") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00af, code lost:
    
        if (r4.equals("uint64") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b4, code lost:
    
        return com.robinhood.android.idl.common.httpoption.HttpOptionAdapterFactory.ToStringFormatter.UnsignedLongToStringFormatter.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bc, code lost:
    
        if (r4.equals("uint32") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00c6, code lost:
    
        if (r4.equals("sint64") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00cb, code lost:
    
        return com.robinhood.android.idl.common.httpoption.HttpOptionAdapterFactory.ToStringFormatter.DefaultToStringFormatter.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d2, code lost:
    
        if (r4.equals("google.protobuf.UInt32Value") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00d7, code lost:
    
        return com.robinhood.android.idl.common.httpoption.HttpOptionAdapterFactory.ToStringFormatter.UnsignedIntToStringFormatter.INSTANCE;
     */
    @Override // retrofit2.Converter.Factory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Converter<?, String> stringConverter(Type type2, Annotation[] annotations, Retrofit retrofit) {
        Annotation annotation;
        Intrinsics.checkNotNullParameter(type2, "type");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        int length = annotations.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotations[i];
            if (annotation instanceof IdlField) {
                break;
            }
            i++;
        }
        IdlField idlField = (IdlField) annotation;
        if (idlField == null) {
            return null;
        }
        String strProtoType = idlField.protoType();
        switch (strProtoType.hashCode()) {
            case -2019379094:
                break;
            case -902255014:
                break;
            case -844996807:
                break;
            case -844996712:
                break;
            case -843915053:
                break;
            case -843914958:
                break;
            case 94224491:
                break;
            case 100359917:
                break;
            case 342280146:
                if (strProtoType.equals("com.robinhood.idl.IdlDecimal")) {
                    return ToStringFormatter.DecimalToStringFormatter.INSTANCE;
                }
                return null;
            case 541796418:
                if (strProtoType.equals("google.protobuf.Duration")) {
                    return ToStringFormatter.DurationToStringFormatter.INSTANCE;
                }
                return null;
            case 700390251:
                break;
            case 1127568116:
                break;
            case 1293788200:
                if (strProtoType.equals("google.protobuf.Timestamp")) {
                    return ToStringFormatter.TimestampToStringFormatter.INSTANCE;
                }
                return null;
            case 1887466930:
                break;
            case 2010777951:
                break;
            default:
                return null;
        }
    }
}
