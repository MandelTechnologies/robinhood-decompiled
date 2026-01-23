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
/* compiled from: DigestItemType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/DigestItemType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DIGEST_ITEM_TYPE_UNSPECIFIED", "GENERIC", "RETURN_DRIVER", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class DigestItemType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DigestItemType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<DigestItemType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final DigestItemType DIGEST_ITEM_TYPE_UNSPECIFIED;
    public static final DigestItemType GENERIC;
    public static final DigestItemType RETURN_DRIVER;
    private final int value;

    private static final /* synthetic */ DigestItemType[] $values() {
        return new DigestItemType[]{DIGEST_ITEM_TYPE_UNSPECIFIED, GENERIC, RETURN_DRIVER};
    }

    @JvmStatic
    public static final DigestItemType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<DigestItemType> getEntries() {
        return $ENTRIES;
    }

    private DigestItemType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final DigestItemType digestItemType = new DigestItemType("DIGEST_ITEM_TYPE_UNSPECIFIED", 0, 0);
        DIGEST_ITEM_TYPE_UNSPECIFIED = digestItemType;
        GENERIC = new DigestItemType("GENERIC", 1, 1);
        RETURN_DRIVER = new DigestItemType("RETURN_DRIVER", 2, 2);
        DigestItemType[] digestItemTypeArr$values = $values();
        $VALUES = digestItemTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(digestItemTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DigestItemType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<DigestItemType>(orCreateKotlinClass, syntax, digestItemType) { // from class: com.robinhood.copilot.proto.v1.DigestItemType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public DigestItemType fromValue(int value) {
                return DigestItemType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: DigestItemType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/DigestItemType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/copilot/proto/v1/DigestItemType;", "fromValue", "value", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DigestItemType fromValue(int value) {
            if (value == 0) {
                return DigestItemType.DIGEST_ITEM_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return DigestItemType.GENERIC;
            }
            if (value != 2) {
                return null;
            }
            return DigestItemType.RETURN_DRIVER;
        }
    }

    public static DigestItemType valueOf(String str) {
        return (DigestItemType) Enum.valueOf(DigestItemType.class, str);
    }

    public static DigestItemType[] values() {
        return (DigestItemType[]) $VALUES.clone();
    }
}
