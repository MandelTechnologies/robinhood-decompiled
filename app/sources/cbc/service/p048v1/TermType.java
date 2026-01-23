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
/* compiled from: TermType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m3636d2 = {"Lcbc/service/v1/TermType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TERM_TYPE_UNSPECIFIED", "TERM_TYPE_LT", "TERM_TYPE_ST", "TERM_TYPE_ST40LT60", "TERM_TYPE_LT_OR", "TERM_TYPE_MIXED", "TERM_TYPE_OR", "TERM_TYPE_ST_OR", "TERM_TYPE_UNKNOWN", "Companion", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class TermType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TermType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<TermType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TermType TERM_TYPE_LT;
    public static final TermType TERM_TYPE_LT_OR;
    public static final TermType TERM_TYPE_MIXED;
    public static final TermType TERM_TYPE_OR;
    public static final TermType TERM_TYPE_ST;
    public static final TermType TERM_TYPE_ST40LT60;
    public static final TermType TERM_TYPE_ST_OR;
    public static final TermType TERM_TYPE_UNKNOWN;
    public static final TermType TERM_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ TermType[] $values() {
        return new TermType[]{TERM_TYPE_UNSPECIFIED, TERM_TYPE_LT, TERM_TYPE_ST, TERM_TYPE_ST40LT60, TERM_TYPE_LT_OR, TERM_TYPE_MIXED, TERM_TYPE_OR, TERM_TYPE_ST_OR, TERM_TYPE_UNKNOWN};
    }

    @JvmStatic
    public static final TermType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<TermType> getEntries() {
        return $ENTRIES;
    }

    private TermType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final TermType termType = new TermType("TERM_TYPE_UNSPECIFIED", 0, 0);
        TERM_TYPE_UNSPECIFIED = termType;
        TERM_TYPE_LT = new TermType("TERM_TYPE_LT", 1, 1);
        TERM_TYPE_ST = new TermType("TERM_TYPE_ST", 2, 2);
        TERM_TYPE_ST40LT60 = new TermType("TERM_TYPE_ST40LT60", 3, 3);
        TERM_TYPE_LT_OR = new TermType("TERM_TYPE_LT_OR", 4, 4);
        TERM_TYPE_MIXED = new TermType("TERM_TYPE_MIXED", 5, 5);
        TERM_TYPE_OR = new TermType("TERM_TYPE_OR", 6, 6);
        TERM_TYPE_ST_OR = new TermType("TERM_TYPE_ST_OR", 7, 7);
        TERM_TYPE_UNKNOWN = new TermType("TERM_TYPE_UNKNOWN", 8, 8);
        TermType[] termTypeArr$values = $values();
        $VALUES = termTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(termTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TermType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<TermType>(orCreateKotlinClass, syntax, termType) { // from class: cbc.service.v1.TermType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public TermType fromValue(int value) {
                return TermType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: TermType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcbc/service/v1/TermType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcbc/service/v1/TermType;", "fromValue", "value", "", "cbc.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TermType fromValue(int value) {
            switch (value) {
                case 0:
                    return TermType.TERM_TYPE_UNSPECIFIED;
                case 1:
                    return TermType.TERM_TYPE_LT;
                case 2:
                    return TermType.TERM_TYPE_ST;
                case 3:
                    return TermType.TERM_TYPE_ST40LT60;
                case 4:
                    return TermType.TERM_TYPE_LT_OR;
                case 5:
                    return TermType.TERM_TYPE_MIXED;
                case 6:
                    return TermType.TERM_TYPE_OR;
                case 7:
                    return TermType.TERM_TYPE_ST_OR;
                case 8:
                    return TermType.TERM_TYPE_UNKNOWN;
                default:
                    return null;
            }
        }
    }

    public static TermType valueOf(String str) {
        return (TermType) Enum.valueOf(TermType.class, str);
    }

    public static TermType[] values() {
        return (TermType[]) $VALUES.clone();
    }
}
