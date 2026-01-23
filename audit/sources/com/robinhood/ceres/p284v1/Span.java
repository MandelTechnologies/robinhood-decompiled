package com.robinhood.ceres.p284v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Span.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/ceres/v1/Span;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SPAN_UNSPECIFIED", "SPAN_1W", "SPAN_1M", "SPAN_3M", "SPAN_YTD", "SPAN_1Y", "SPAN_ALL", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class Span implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Span[] $VALUES;

    @JvmField
    public static final ProtoAdapter<Span> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Span SPAN_1M;
    public static final Span SPAN_1W;
    public static final Span SPAN_1Y;
    public static final Span SPAN_3M;
    public static final Span SPAN_ALL;
    public static final Span SPAN_UNSPECIFIED;
    public static final Span SPAN_YTD;
    private final int value;

    private static final /* synthetic */ Span[] $values() {
        return new Span[]{SPAN_UNSPECIFIED, SPAN_1W, SPAN_1M, SPAN_3M, SPAN_YTD, SPAN_1Y, SPAN_ALL};
    }

    @JvmStatic
    public static final Span fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<Span> getEntries() {
        return $ENTRIES;
    }

    private Span(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final Span span = new Span("SPAN_UNSPECIFIED", 0, 0);
        SPAN_UNSPECIFIED = span;
        SPAN_1W = new Span("SPAN_1W", 1, 1);
        SPAN_1M = new Span("SPAN_1M", 2, 2);
        SPAN_3M = new Span("SPAN_3M", 3, 3);
        SPAN_YTD = new Span("SPAN_YTD", 4, 4);
        SPAN_1Y = new Span("SPAN_1Y", 5, 5);
        SPAN_ALL = new Span("SPAN_ALL", 6, 6);
        Span[] spanArr$values = $values();
        $VALUES = spanArr$values;
        $ENTRIES = EnumEntries2.enumEntries(spanArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Span.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<Span>(orCreateKotlinClass, syntax, span) { // from class: com.robinhood.ceres.v1.Span$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public Span fromValue(int value) {
                return Span.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: Span.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/ceres/v1/Span$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/ceres/v1/Span;", "fromValue", "value", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Span fromValue(int value) {
            switch (value) {
                case 0:
                    return Span.SPAN_UNSPECIFIED;
                case 1:
                    return Span.SPAN_1W;
                case 2:
                    return Span.SPAN_1M;
                case 3:
                    return Span.SPAN_3M;
                case 4:
                    return Span.SPAN_YTD;
                case 5:
                    return Span.SPAN_1Y;
                case 6:
                    return Span.SPAN_ALL;
                default:
                    return null;
            }
        }
    }

    public static Span valueOf(String str) {
        return (Span) Enum.valueOf(Span.class, str);
    }

    public static Span[] values() {
        return (Span[]) $VALUES.clone();
    }
}
