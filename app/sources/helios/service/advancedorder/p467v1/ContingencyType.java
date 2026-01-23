package helios.service.advancedorder.p467v1;

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
/* compiled from: ContingencyType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lhelios/service/advancedorder/v1/ContingencyType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CONTINGENCY_TYPE_UNSPECIFIED", "CONTINGENCY_TYPE_CFO", "CONTINGENCY_TYPE_OCO", "CONTINGENCY_TYPE_OTO", "CONTINGENCY_TYPE_FX_AT_TRADE", "Companion", "helios.advancedorder.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ContingencyType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ContingencyType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ContingencyType> ADAPTER;
    public static final ContingencyType CONTINGENCY_TYPE_CFO;
    public static final ContingencyType CONTINGENCY_TYPE_FX_AT_TRADE;
    public static final ContingencyType CONTINGENCY_TYPE_OCO;
    public static final ContingencyType CONTINGENCY_TYPE_OTO;
    public static final ContingencyType CONTINGENCY_TYPE_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ ContingencyType[] $values() {
        return new ContingencyType[]{CONTINGENCY_TYPE_UNSPECIFIED, CONTINGENCY_TYPE_CFO, CONTINGENCY_TYPE_OCO, CONTINGENCY_TYPE_OTO, CONTINGENCY_TYPE_FX_AT_TRADE};
    }

    @JvmStatic
    public static final ContingencyType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ContingencyType> getEntries() {
        return $ENTRIES;
    }

    private ContingencyType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ContingencyType contingencyType = new ContingencyType("CONTINGENCY_TYPE_UNSPECIFIED", 0, 0);
        CONTINGENCY_TYPE_UNSPECIFIED = contingencyType;
        CONTINGENCY_TYPE_CFO = new ContingencyType("CONTINGENCY_TYPE_CFO", 1, 1);
        CONTINGENCY_TYPE_OCO = new ContingencyType("CONTINGENCY_TYPE_OCO", 2, 2);
        CONTINGENCY_TYPE_OTO = new ContingencyType("CONTINGENCY_TYPE_OTO", 3, 3);
        CONTINGENCY_TYPE_FX_AT_TRADE = new ContingencyType("CONTINGENCY_TYPE_FX_AT_TRADE", 4, 4);
        ContingencyType[] contingencyTypeArr$values = $values();
        $VALUES = contingencyTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(contingencyTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ContingencyType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ContingencyType>(orCreateKotlinClass, syntax, contingencyType) { // from class: helios.service.advancedorder.v1.ContingencyType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ContingencyType fromValue(int value) {
                return ContingencyType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ContingencyType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lhelios/service/advancedorder/v1/ContingencyType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lhelios/service/advancedorder/v1/ContingencyType;", "fromValue", "value", "", "helios.advancedorder.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ContingencyType fromValue(int value) {
            if (value == 0) {
                return ContingencyType.CONTINGENCY_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return ContingencyType.CONTINGENCY_TYPE_CFO;
            }
            if (value == 2) {
                return ContingencyType.CONTINGENCY_TYPE_OCO;
            }
            if (value == 3) {
                return ContingencyType.CONTINGENCY_TYPE_OTO;
            }
            if (value != 4) {
                return null;
            }
            return ContingencyType.CONTINGENCY_TYPE_FX_AT_TRADE;
        }
    }

    public static ContingencyType valueOf(String str) {
        return (ContingencyType) Enum.valueOf(ContingencyType.class, str);
    }

    public static ContingencyType[] values() {
        return (ContingencyType[]) $VALUES.clone();
    }
}
