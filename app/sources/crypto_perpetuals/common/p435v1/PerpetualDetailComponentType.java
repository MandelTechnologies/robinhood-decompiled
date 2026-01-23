package crypto_perpetuals.common.p435v1;

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
/* compiled from: PerpetualDetailComponentType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/PerpetualDetailComponentType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PERPETUAL_DETAIL_COMPONENT_TYPE_UNSPECIFIED", "PERPETUAL_DETAIL_COMPONENT_TYPE_CHART", "PERPETUAL_DETAIL_COMPONENT_TYPE_OPEN_POSITIONS", "PERPETUAL_DETAIL_COMPONENT_TYPE_PENDING_ORDERS", "PERPETUAL_DETAIL_COMPONENT_TYPE_CONTRACT_DETAILS", "PERPETUAL_DETAIL_COMPONENT_TYPE_ABOUT", "PERPETUAL_DETAIL_COMPONENT_TYPE_HISTORY", "PERPETUAL_DETAIL_COMPONENT_TYPE_EDUCATION", "PERPETUAL_DETAIL_COMPONENT_TYPE_DISCLOSURES", "Companion", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class PerpetualDetailComponentType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PerpetualDetailComponentType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<PerpetualDetailComponentType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final PerpetualDetailComponentType PERPETUAL_DETAIL_COMPONENT_TYPE_ABOUT;
    public static final PerpetualDetailComponentType PERPETUAL_DETAIL_COMPONENT_TYPE_CHART;
    public static final PerpetualDetailComponentType PERPETUAL_DETAIL_COMPONENT_TYPE_CONTRACT_DETAILS;
    public static final PerpetualDetailComponentType PERPETUAL_DETAIL_COMPONENT_TYPE_DISCLOSURES;
    public static final PerpetualDetailComponentType PERPETUAL_DETAIL_COMPONENT_TYPE_EDUCATION;
    public static final PerpetualDetailComponentType PERPETUAL_DETAIL_COMPONENT_TYPE_HISTORY;
    public static final PerpetualDetailComponentType PERPETUAL_DETAIL_COMPONENT_TYPE_OPEN_POSITIONS;
    public static final PerpetualDetailComponentType PERPETUAL_DETAIL_COMPONENT_TYPE_PENDING_ORDERS;
    public static final PerpetualDetailComponentType PERPETUAL_DETAIL_COMPONENT_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ PerpetualDetailComponentType[] $values() {
        return new PerpetualDetailComponentType[]{PERPETUAL_DETAIL_COMPONENT_TYPE_UNSPECIFIED, PERPETUAL_DETAIL_COMPONENT_TYPE_CHART, PERPETUAL_DETAIL_COMPONENT_TYPE_OPEN_POSITIONS, PERPETUAL_DETAIL_COMPONENT_TYPE_PENDING_ORDERS, PERPETUAL_DETAIL_COMPONENT_TYPE_CONTRACT_DETAILS, PERPETUAL_DETAIL_COMPONENT_TYPE_ABOUT, PERPETUAL_DETAIL_COMPONENT_TYPE_HISTORY, PERPETUAL_DETAIL_COMPONENT_TYPE_EDUCATION, PERPETUAL_DETAIL_COMPONENT_TYPE_DISCLOSURES};
    }

    @JvmStatic
    public static final PerpetualDetailComponentType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<PerpetualDetailComponentType> getEntries() {
        return $ENTRIES;
    }

    private PerpetualDetailComponentType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final PerpetualDetailComponentType perpetualDetailComponentType = new PerpetualDetailComponentType("PERPETUAL_DETAIL_COMPONENT_TYPE_UNSPECIFIED", 0, 0);
        PERPETUAL_DETAIL_COMPONENT_TYPE_UNSPECIFIED = perpetualDetailComponentType;
        PERPETUAL_DETAIL_COMPONENT_TYPE_CHART = new PerpetualDetailComponentType("PERPETUAL_DETAIL_COMPONENT_TYPE_CHART", 1, 1);
        PERPETUAL_DETAIL_COMPONENT_TYPE_OPEN_POSITIONS = new PerpetualDetailComponentType("PERPETUAL_DETAIL_COMPONENT_TYPE_OPEN_POSITIONS", 2, 2);
        PERPETUAL_DETAIL_COMPONENT_TYPE_PENDING_ORDERS = new PerpetualDetailComponentType("PERPETUAL_DETAIL_COMPONENT_TYPE_PENDING_ORDERS", 3, 3);
        PERPETUAL_DETAIL_COMPONENT_TYPE_CONTRACT_DETAILS = new PerpetualDetailComponentType("PERPETUAL_DETAIL_COMPONENT_TYPE_CONTRACT_DETAILS", 4, 4);
        PERPETUAL_DETAIL_COMPONENT_TYPE_ABOUT = new PerpetualDetailComponentType("PERPETUAL_DETAIL_COMPONENT_TYPE_ABOUT", 5, 5);
        PERPETUAL_DETAIL_COMPONENT_TYPE_HISTORY = new PerpetualDetailComponentType("PERPETUAL_DETAIL_COMPONENT_TYPE_HISTORY", 6, 6);
        PERPETUAL_DETAIL_COMPONENT_TYPE_EDUCATION = new PerpetualDetailComponentType("PERPETUAL_DETAIL_COMPONENT_TYPE_EDUCATION", 7, 7);
        PERPETUAL_DETAIL_COMPONENT_TYPE_DISCLOSURES = new PerpetualDetailComponentType("PERPETUAL_DETAIL_COMPONENT_TYPE_DISCLOSURES", 8, 8);
        PerpetualDetailComponentType[] perpetualDetailComponentTypeArr$values = $values();
        $VALUES = perpetualDetailComponentTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(perpetualDetailComponentTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PerpetualDetailComponentType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<PerpetualDetailComponentType>(orCreateKotlinClass, syntax, perpetualDetailComponentType) { // from class: crypto_perpetuals.common.v1.PerpetualDetailComponentType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public PerpetualDetailComponentType fromValue(int value) {
                return PerpetualDetailComponentType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: PerpetualDetailComponentType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/PerpetualDetailComponentType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcrypto_perpetuals/common/v1/PerpetualDetailComponentType;", "fromValue", "value", "", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PerpetualDetailComponentType fromValue(int value) {
            switch (value) {
                case 0:
                    return PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_UNSPECIFIED;
                case 1:
                    return PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_CHART;
                case 2:
                    return PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_OPEN_POSITIONS;
                case 3:
                    return PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_PENDING_ORDERS;
                case 4:
                    return PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_CONTRACT_DETAILS;
                case 5:
                    return PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_ABOUT;
                case 6:
                    return PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_HISTORY;
                case 7:
                    return PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_EDUCATION;
                case 8:
                    return PerpetualDetailComponentType.PERPETUAL_DETAIL_COMPONENT_TYPE_DISCLOSURES;
                default:
                    return null;
            }
        }
    }

    public static PerpetualDetailComponentType valueOf(String str) {
        return (PerpetualDetailComponentType) Enum.valueOf(PerpetualDetailComponentType.class, str);
    }

    public static PerpetualDetailComponentType[] values() {
        return (PerpetualDetailComponentType[]) $VALUES.clone();
    }
}
