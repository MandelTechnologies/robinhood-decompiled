package com.squareup.wire;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FieldEncoding.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000f"}, m3636d2 = {"Lcom/squareup/wire/FieldEncoding;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue$wire_runtime", "()I", "VARINT", "FIXED64", "LENGTH_DELIMITED", "FIXED32", "rawProtoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "Companion", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class FieldEncoding {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FieldEncoding[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final FieldEncoding VARINT = new FieldEncoding("VARINT", 0, 0);
    public static final FieldEncoding FIXED64 = new FieldEncoding("FIXED64", 1, 1);
    public static final FieldEncoding LENGTH_DELIMITED = new FieldEncoding("LENGTH_DELIMITED", 2, 2);
    public static final FieldEncoding FIXED32 = new FieldEncoding("FIXED32", 3, 5);

    /* compiled from: FieldEncoding.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FieldEncoding.values().length];
            try {
                iArr[FieldEncoding.VARINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FieldEncoding.FIXED32.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FieldEncoding.FIXED64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FieldEncoding.LENGTH_DELIMITED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ FieldEncoding[] $values() {
        return new FieldEncoding[]{VARINT, FIXED64, LENGTH_DELIMITED, FIXED32};
    }

    public static EnumEntries<FieldEncoding> getEntries() {
        return $ENTRIES;
    }

    private FieldEncoding(String str, int i, int i2) {
        this.value = i2;
    }

    /* renamed from: getValue$wire_runtime, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    static {
        FieldEncoding[] fieldEncodingArr$values = $values();
        $VALUES = fieldEncodingArr$values;
        $ENTRIES = EnumEntries2.enumEntries(fieldEncodingArr$values);
        INSTANCE = new Companion(null);
    }

    public final ProtoAdapter<?> rawProtoAdapter() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return ProtoAdapter.UINT64;
        }
        if (i == 2) {
            return ProtoAdapter.FIXED32;
        }
        if (i == 3) {
            return ProtoAdapter.FIXED64;
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        return ProtoAdapter.BYTES;
    }

    /* compiled from: FieldEncoding.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0081\u0002¢\u0006\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/squareup/wire/FieldEncoding$Companion;", "", "<init>", "()V", "get", "Lcom/squareup/wire/FieldEncoding;", "value", "", "get$wire_runtime", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FieldEncoding get$wire_runtime(int value) throws IOException {
            if (value == 0) {
                return FieldEncoding.VARINT;
            }
            if (value == 1) {
                return FieldEncoding.FIXED64;
            }
            if (value == 2) {
                return FieldEncoding.LENGTH_DELIMITED;
            }
            if (value == 5) {
                return FieldEncoding.FIXED32;
            }
            throw new ProtocolException("Unexpected FieldEncoding: " + value);
        }
    }

    public static FieldEncoding valueOf(String str) {
        return (FieldEncoding) Enum.valueOf(FieldEncoding.class, str);
    }

    public static FieldEncoding[] values() {
        return (FieldEncoding[]) $VALUES.clone();
    }
}
