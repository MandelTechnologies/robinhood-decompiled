package cbc.service.p048v1;

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
/* compiled from: LotType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcbc/service/v1/LotType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LOT_TYPE_UNSPECIFIED", "LOT_TYPE_OPEN", "LOT_TYPE_CLOSE", "Companion", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class LotType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LotType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<LotType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final LotType LOT_TYPE_CLOSE;
    public static final LotType LOT_TYPE_OPEN;
    public static final LotType LOT_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ LotType[] $values() {
        return new LotType[]{LOT_TYPE_UNSPECIFIED, LOT_TYPE_OPEN, LOT_TYPE_CLOSE};
    }

    @JvmStatic
    public static final LotType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<LotType> getEntries() {
        return $ENTRIES;
    }

    private LotType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final LotType lotType = new LotType("LOT_TYPE_UNSPECIFIED", 0, 0);
        LOT_TYPE_UNSPECIFIED = lotType;
        LOT_TYPE_OPEN = new LotType("LOT_TYPE_OPEN", 1, 1);
        LOT_TYPE_CLOSE = new LotType("LOT_TYPE_CLOSE", 2, 2);
        LotType[] lotTypeArr$values = $values();
        $VALUES = lotTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(lotTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LotType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<LotType>(orCreateKotlinClass, syntax, lotType) { // from class: cbc.service.v1.LotType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public LotType fromValue(int value) {
                return LotType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: LotType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcbc/service/v1/LotType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcbc/service/v1/LotType;", "fromValue", "value", "", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LotType fromValue(int value) {
            if (value == 0) {
                return LotType.LOT_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return LotType.LOT_TYPE_OPEN;
            }
            if (value != 2) {
                return null;
            }
            return LotType.LOT_TYPE_CLOSE;
        }
    }

    public static LotType valueOf(String str) {
        return (LotType) Enum.valueOf(LotType.class, str);
    }

    public static LotType[] values() {
        return (LotType[]) $VALUES.clone();
    }
}
