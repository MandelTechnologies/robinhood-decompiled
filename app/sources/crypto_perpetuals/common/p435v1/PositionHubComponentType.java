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
/* compiled from: PositionHubComponentType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/PositionHubComponentType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "POSITION_HUB_COMPONENT_TYPE_UNSPECIFIED", "POSITION_HUB_COMPONENT_TYPE_POSITION_HEALTH_WITHOUT_ACCOUNT", "POSITION_HUB_COMPONENT_TYPE_POSITION_HEALTH_WITH_ACCOUNT", "POSITION_HUB_COMPONENT_TYPE_OPEN_POSITIONS", "POSITION_HUB_COMPONENT_TYPE_PENDING_ORDERS", "POSITION_HUB_COMPONENT_TYPE_HISTORY", "POSITION_HUB_COMPONENT_TYPE_EXPLORE", "POSITION_HUB_COMPONENT_TYPE_EDUCATION", "POSITION_HUB_COMPONENT_TYPE_DISCLOSURES", "Companion", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class PositionHubComponentType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PositionHubComponentType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<PositionHubComponentType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final PositionHubComponentType POSITION_HUB_COMPONENT_TYPE_DISCLOSURES;
    public static final PositionHubComponentType POSITION_HUB_COMPONENT_TYPE_EDUCATION;
    public static final PositionHubComponentType POSITION_HUB_COMPONENT_TYPE_EXPLORE;
    public static final PositionHubComponentType POSITION_HUB_COMPONENT_TYPE_HISTORY;
    public static final PositionHubComponentType POSITION_HUB_COMPONENT_TYPE_OPEN_POSITIONS;
    public static final PositionHubComponentType POSITION_HUB_COMPONENT_TYPE_PENDING_ORDERS;
    public static final PositionHubComponentType POSITION_HUB_COMPONENT_TYPE_POSITION_HEALTH_WITHOUT_ACCOUNT;
    public static final PositionHubComponentType POSITION_HUB_COMPONENT_TYPE_POSITION_HEALTH_WITH_ACCOUNT;
    public static final PositionHubComponentType POSITION_HUB_COMPONENT_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ PositionHubComponentType[] $values() {
        return new PositionHubComponentType[]{POSITION_HUB_COMPONENT_TYPE_UNSPECIFIED, POSITION_HUB_COMPONENT_TYPE_POSITION_HEALTH_WITHOUT_ACCOUNT, POSITION_HUB_COMPONENT_TYPE_POSITION_HEALTH_WITH_ACCOUNT, POSITION_HUB_COMPONENT_TYPE_OPEN_POSITIONS, POSITION_HUB_COMPONENT_TYPE_PENDING_ORDERS, POSITION_HUB_COMPONENT_TYPE_HISTORY, POSITION_HUB_COMPONENT_TYPE_EXPLORE, POSITION_HUB_COMPONENT_TYPE_EDUCATION, POSITION_HUB_COMPONENT_TYPE_DISCLOSURES};
    }

    @JvmStatic
    public static final PositionHubComponentType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<PositionHubComponentType> getEntries() {
        return $ENTRIES;
    }

    private PositionHubComponentType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final PositionHubComponentType positionHubComponentType = new PositionHubComponentType("POSITION_HUB_COMPONENT_TYPE_UNSPECIFIED", 0, 0);
        POSITION_HUB_COMPONENT_TYPE_UNSPECIFIED = positionHubComponentType;
        POSITION_HUB_COMPONENT_TYPE_POSITION_HEALTH_WITHOUT_ACCOUNT = new PositionHubComponentType("POSITION_HUB_COMPONENT_TYPE_POSITION_HEALTH_WITHOUT_ACCOUNT", 1, 1);
        POSITION_HUB_COMPONENT_TYPE_POSITION_HEALTH_WITH_ACCOUNT = new PositionHubComponentType("POSITION_HUB_COMPONENT_TYPE_POSITION_HEALTH_WITH_ACCOUNT", 2, 2);
        POSITION_HUB_COMPONENT_TYPE_OPEN_POSITIONS = new PositionHubComponentType("POSITION_HUB_COMPONENT_TYPE_OPEN_POSITIONS", 3, 3);
        POSITION_HUB_COMPONENT_TYPE_PENDING_ORDERS = new PositionHubComponentType("POSITION_HUB_COMPONENT_TYPE_PENDING_ORDERS", 4, 4);
        POSITION_HUB_COMPONENT_TYPE_HISTORY = new PositionHubComponentType("POSITION_HUB_COMPONENT_TYPE_HISTORY", 5, 5);
        POSITION_HUB_COMPONENT_TYPE_EXPLORE = new PositionHubComponentType("POSITION_HUB_COMPONENT_TYPE_EXPLORE", 6, 6);
        POSITION_HUB_COMPONENT_TYPE_EDUCATION = new PositionHubComponentType("POSITION_HUB_COMPONENT_TYPE_EDUCATION", 7, 7);
        POSITION_HUB_COMPONENT_TYPE_DISCLOSURES = new PositionHubComponentType("POSITION_HUB_COMPONENT_TYPE_DISCLOSURES", 8, 8);
        PositionHubComponentType[] positionHubComponentTypeArr$values = $values();
        $VALUES = positionHubComponentTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(positionHubComponentTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PositionHubComponentType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<PositionHubComponentType>(orCreateKotlinClass, syntax, positionHubComponentType) { // from class: crypto_perpetuals.common.v1.PositionHubComponentType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public PositionHubComponentType fromValue(int value) {
                return PositionHubComponentType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: PositionHubComponentType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/PositionHubComponentType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcrypto_perpetuals/common/v1/PositionHubComponentType;", "fromValue", "value", "", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PositionHubComponentType fromValue(int value) {
            switch (value) {
                case 0:
                    return PositionHubComponentType.POSITION_HUB_COMPONENT_TYPE_UNSPECIFIED;
                case 1:
                    return PositionHubComponentType.POSITION_HUB_COMPONENT_TYPE_POSITION_HEALTH_WITHOUT_ACCOUNT;
                case 2:
                    return PositionHubComponentType.POSITION_HUB_COMPONENT_TYPE_POSITION_HEALTH_WITH_ACCOUNT;
                case 3:
                    return PositionHubComponentType.POSITION_HUB_COMPONENT_TYPE_OPEN_POSITIONS;
                case 4:
                    return PositionHubComponentType.POSITION_HUB_COMPONENT_TYPE_PENDING_ORDERS;
                case 5:
                    return PositionHubComponentType.POSITION_HUB_COMPONENT_TYPE_HISTORY;
                case 6:
                    return PositionHubComponentType.POSITION_HUB_COMPONENT_TYPE_EXPLORE;
                case 7:
                    return PositionHubComponentType.POSITION_HUB_COMPONENT_TYPE_EDUCATION;
                case 8:
                    return PositionHubComponentType.POSITION_HUB_COMPONENT_TYPE_DISCLOSURES;
                default:
                    return null;
            }
        }
    }

    public static PositionHubComponentType valueOf(String str) {
        return (PositionHubComponentType) Enum.valueOf(PositionHubComponentType.class, str);
    }

    public static PositionHubComponentType[] values() {
        return (PositionHubComponentType[]) $VALUES.clone();
    }
}
