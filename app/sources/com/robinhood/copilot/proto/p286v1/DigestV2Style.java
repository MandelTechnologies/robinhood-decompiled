package com.robinhood.copilot.proto.p286v1;

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
/* compiled from: DigestV2Style.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/DigestV2Style;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEFAULT_UNSPECIFIED", "BREAKING", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class DigestV2Style implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DigestV2Style[] $VALUES;

    @JvmField
    public static final ProtoAdapter<DigestV2Style> ADAPTER;
    public static final DigestV2Style BREAKING;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final DigestV2Style DEFAULT_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ DigestV2Style[] $values() {
        return new DigestV2Style[]{DEFAULT_UNSPECIFIED, BREAKING};
    }

    @JvmStatic
    public static final DigestV2Style fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<DigestV2Style> getEntries() {
        return $ENTRIES;
    }

    private DigestV2Style(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final DigestV2Style digestV2Style = new DigestV2Style("DEFAULT_UNSPECIFIED", 0, 0);
        DEFAULT_UNSPECIFIED = digestV2Style;
        BREAKING = new DigestV2Style("BREAKING", 1, 1);
        DigestV2Style[] digestV2StyleArr$values = $values();
        $VALUES = digestV2StyleArr$values;
        $ENTRIES = EnumEntries2.enumEntries(digestV2StyleArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DigestV2Style.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<DigestV2Style>(orCreateKotlinClass, syntax, digestV2Style) { // from class: com.robinhood.copilot.proto.v1.DigestV2Style$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public DigestV2Style fromValue(int value) {
                return DigestV2Style.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: DigestV2Style.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/DigestV2Style$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/copilot/proto/v1/DigestV2Style;", "fromValue", "value", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DigestV2Style fromValue(int value) {
            if (value == 0) {
                return DigestV2Style.DEFAULT_UNSPECIFIED;
            }
            if (value != 1) {
                return null;
            }
            return DigestV2Style.BREAKING;
        }
    }

    public static DigestV2Style valueOf(String str) {
        return (DigestV2Style) Enum.valueOf(DigestV2Style.class, str);
    }

    public static DigestV2Style[] values() {
        return (DigestV2Style[]) $VALUES.clone();
    }
}
