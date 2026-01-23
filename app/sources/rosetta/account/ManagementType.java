package rosetta.account;

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
/* compiled from: ManagementType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lrosetta/account/ManagementType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MANAGEMENT_TYPE_UNSPECIFIED", "SELF_DIRECTED", "MANAGED", "TRADEPMR_MANAGED", "Companion", "rosetta.account_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class ManagementType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ManagementType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ManagementType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ManagementType MANAGED;
    public static final ManagementType MANAGEMENT_TYPE_UNSPECIFIED;
    public static final ManagementType SELF_DIRECTED;
    public static final ManagementType TRADEPMR_MANAGED;
    private final int value;

    private static final /* synthetic */ ManagementType[] $values() {
        return new ManagementType[]{MANAGEMENT_TYPE_UNSPECIFIED, SELF_DIRECTED, MANAGED, TRADEPMR_MANAGED};
    }

    @JvmStatic
    public static final ManagementType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ManagementType> getEntries() {
        return $ENTRIES;
    }

    private ManagementType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ManagementType managementType = new ManagementType("MANAGEMENT_TYPE_UNSPECIFIED", 0, 0);
        MANAGEMENT_TYPE_UNSPECIFIED = managementType;
        SELF_DIRECTED = new ManagementType("SELF_DIRECTED", 1, 1);
        MANAGED = new ManagementType("MANAGED", 2, 2);
        TRADEPMR_MANAGED = new ManagementType("TRADEPMR_MANAGED", 3, 3);
        ManagementType[] managementTypeArr$values = $values();
        $VALUES = managementTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(managementTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ManagementType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ManagementType>(orCreateKotlinClass, syntax, managementType) { // from class: rosetta.account.ManagementType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ManagementType fromValue(int value) {
                return ManagementType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ManagementType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/account/ManagementType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/account/ManagementType;", "fromValue", "value", "", "rosetta.account_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ManagementType fromValue(int value) {
            if (value == 0) {
                return ManagementType.MANAGEMENT_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return ManagementType.SELF_DIRECTED;
            }
            if (value == 2) {
                return ManagementType.MANAGED;
            }
            if (value != 3) {
                return null;
            }
            return ManagementType.TRADEPMR_MANAGED;
        }
    }

    public static ManagementType valueOf(String str) {
        return (ManagementType) Enum.valueOf(ManagementType.class, str);
    }

    public static ManagementType[] values() {
        return (ManagementType[]) $VALUES.clone();
    }
}
