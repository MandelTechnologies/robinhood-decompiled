package nimbus.service.p511v1;

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
/* compiled from: AssetTransferType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\"\b\u0086\u0081\u0002\u0018\u0000 %2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001%B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$¨\u0006&"}, m3636d2 = {"Lnimbus/service/v1/AssetTransferType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TYPE_UNSPECIFIED", "INDIVIDUAL_TO_JOINT", "JOINT_TO_INDIVIDUAL", "INDIVIDUAL_TO_INDIVIDUAL", "INDIVIDUAL_TO_MANAGED_INDIVIDUAL", "JOINT_TO_MANAGED_INDIVIDUAL", "IRA_TRADITIONAL_TO_IRA_TRADITIONAL", "IRA_ROTH_TO_IRA_ROTH", "IRA_TRADITIONAL_TO_MANAGED_IRA_TRADITIONAL", "IRA_ROTH_TO_MANAGED_IRA_ROTH", "INDIVIDUAL_TO_CUSTODIAL_UTMA", "INDIVIDUAL_TO_CUSTODIAL_UGMA", "JOINT_TO_CUSTODIAL_UTMA", "JOINT_TO_CUSTODIAL_UGMA", "CUSTODIAL_UTMA_TO_CUSTODIAL_UTMA", "CUSTODIAL_UGMA_TO_CUSTODIAL_UGMA", "CUSTODIAL_UTMA_TO_MANAGED_CUSTODIAL_UTMA", "CUSTODIAL_UGMA_TO_MANAGED_CUSTODIAL_UGMA", "CUSTODIAL_UTMA_TO_INDIVIDUAL", "CUSTODIAL_UGMA_TO_INDIVIDUAL", "CUSTODIAL_UTMA_TO_MANAGED_INDIVIDUAL", "CUSTODIAL_UGMA_TO_MANAGED_INDIVIDUAL", "CUSTODIAL_UTMA_TO_JOINT", "CUSTODIAL_UGMA_TO_JOINT", "INDIVIDUAL_TO_MANAGED_CUSTODIAL_UTMA", "INDIVIDUAL_TO_MANAGED_CUSTODIAL_UGMA", "JOINT_TO_MANAGED_CUSTODIAL_UTMA", "JOINT_TO_MANAGED_CUSTODIAL_UGMA", "Companion", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class AssetTransferType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AssetTransferType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<AssetTransferType> ADAPTER;
    public static final AssetTransferType CUSTODIAL_UGMA_TO_CUSTODIAL_UGMA;
    public static final AssetTransferType CUSTODIAL_UGMA_TO_INDIVIDUAL;
    public static final AssetTransferType CUSTODIAL_UGMA_TO_JOINT;
    public static final AssetTransferType CUSTODIAL_UGMA_TO_MANAGED_CUSTODIAL_UGMA;
    public static final AssetTransferType CUSTODIAL_UGMA_TO_MANAGED_INDIVIDUAL;
    public static final AssetTransferType CUSTODIAL_UTMA_TO_CUSTODIAL_UTMA;
    public static final AssetTransferType CUSTODIAL_UTMA_TO_INDIVIDUAL;
    public static final AssetTransferType CUSTODIAL_UTMA_TO_JOINT;
    public static final AssetTransferType CUSTODIAL_UTMA_TO_MANAGED_CUSTODIAL_UTMA;
    public static final AssetTransferType CUSTODIAL_UTMA_TO_MANAGED_INDIVIDUAL;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final AssetTransferType INDIVIDUAL_TO_CUSTODIAL_UGMA;
    public static final AssetTransferType INDIVIDUAL_TO_CUSTODIAL_UTMA;
    public static final AssetTransferType INDIVIDUAL_TO_INDIVIDUAL;
    public static final AssetTransferType INDIVIDUAL_TO_JOINT;
    public static final AssetTransferType INDIVIDUAL_TO_MANAGED_CUSTODIAL_UGMA;
    public static final AssetTransferType INDIVIDUAL_TO_MANAGED_CUSTODIAL_UTMA;
    public static final AssetTransferType INDIVIDUAL_TO_MANAGED_INDIVIDUAL;
    public static final AssetTransferType IRA_ROTH_TO_IRA_ROTH;
    public static final AssetTransferType IRA_ROTH_TO_MANAGED_IRA_ROTH;
    public static final AssetTransferType IRA_TRADITIONAL_TO_IRA_TRADITIONAL;
    public static final AssetTransferType IRA_TRADITIONAL_TO_MANAGED_IRA_TRADITIONAL;
    public static final AssetTransferType JOINT_TO_CUSTODIAL_UGMA;
    public static final AssetTransferType JOINT_TO_CUSTODIAL_UTMA;
    public static final AssetTransferType JOINT_TO_INDIVIDUAL;
    public static final AssetTransferType JOINT_TO_MANAGED_CUSTODIAL_UGMA;
    public static final AssetTransferType JOINT_TO_MANAGED_CUSTODIAL_UTMA;
    public static final AssetTransferType JOINT_TO_MANAGED_INDIVIDUAL;
    public static final AssetTransferType TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ AssetTransferType[] $values() {
        return new AssetTransferType[]{TYPE_UNSPECIFIED, INDIVIDUAL_TO_JOINT, JOINT_TO_INDIVIDUAL, INDIVIDUAL_TO_INDIVIDUAL, INDIVIDUAL_TO_MANAGED_INDIVIDUAL, JOINT_TO_MANAGED_INDIVIDUAL, IRA_TRADITIONAL_TO_IRA_TRADITIONAL, IRA_ROTH_TO_IRA_ROTH, IRA_TRADITIONAL_TO_MANAGED_IRA_TRADITIONAL, IRA_ROTH_TO_MANAGED_IRA_ROTH, INDIVIDUAL_TO_CUSTODIAL_UTMA, INDIVIDUAL_TO_CUSTODIAL_UGMA, JOINT_TO_CUSTODIAL_UTMA, JOINT_TO_CUSTODIAL_UGMA, CUSTODIAL_UTMA_TO_CUSTODIAL_UTMA, CUSTODIAL_UGMA_TO_CUSTODIAL_UGMA, CUSTODIAL_UTMA_TO_MANAGED_CUSTODIAL_UTMA, CUSTODIAL_UGMA_TO_MANAGED_CUSTODIAL_UGMA, CUSTODIAL_UTMA_TO_INDIVIDUAL, CUSTODIAL_UGMA_TO_INDIVIDUAL, CUSTODIAL_UTMA_TO_MANAGED_INDIVIDUAL, CUSTODIAL_UGMA_TO_MANAGED_INDIVIDUAL, CUSTODIAL_UTMA_TO_JOINT, CUSTODIAL_UGMA_TO_JOINT, INDIVIDUAL_TO_MANAGED_CUSTODIAL_UTMA, INDIVIDUAL_TO_MANAGED_CUSTODIAL_UGMA, JOINT_TO_MANAGED_CUSTODIAL_UTMA, JOINT_TO_MANAGED_CUSTODIAL_UGMA};
    }

    @JvmStatic
    public static final AssetTransferType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<AssetTransferType> getEntries() {
        return $ENTRIES;
    }

    private AssetTransferType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final AssetTransferType assetTransferType = new AssetTransferType("TYPE_UNSPECIFIED", 0, 0);
        TYPE_UNSPECIFIED = assetTransferType;
        INDIVIDUAL_TO_JOINT = new AssetTransferType("INDIVIDUAL_TO_JOINT", 1, 1);
        JOINT_TO_INDIVIDUAL = new AssetTransferType("JOINT_TO_INDIVIDUAL", 2, 2);
        INDIVIDUAL_TO_INDIVIDUAL = new AssetTransferType("INDIVIDUAL_TO_INDIVIDUAL", 3, 3);
        INDIVIDUAL_TO_MANAGED_INDIVIDUAL = new AssetTransferType("INDIVIDUAL_TO_MANAGED_INDIVIDUAL", 4, 4);
        JOINT_TO_MANAGED_INDIVIDUAL = new AssetTransferType("JOINT_TO_MANAGED_INDIVIDUAL", 5, 5);
        IRA_TRADITIONAL_TO_IRA_TRADITIONAL = new AssetTransferType("IRA_TRADITIONAL_TO_IRA_TRADITIONAL", 6, 6);
        IRA_ROTH_TO_IRA_ROTH = new AssetTransferType("IRA_ROTH_TO_IRA_ROTH", 7, 7);
        IRA_TRADITIONAL_TO_MANAGED_IRA_TRADITIONAL = new AssetTransferType("IRA_TRADITIONAL_TO_MANAGED_IRA_TRADITIONAL", 8, 8);
        IRA_ROTH_TO_MANAGED_IRA_ROTH = new AssetTransferType("IRA_ROTH_TO_MANAGED_IRA_ROTH", 9, 9);
        INDIVIDUAL_TO_CUSTODIAL_UTMA = new AssetTransferType("INDIVIDUAL_TO_CUSTODIAL_UTMA", 10, 10);
        INDIVIDUAL_TO_CUSTODIAL_UGMA = new AssetTransferType("INDIVIDUAL_TO_CUSTODIAL_UGMA", 11, 11);
        JOINT_TO_CUSTODIAL_UTMA = new AssetTransferType("JOINT_TO_CUSTODIAL_UTMA", 12, 12);
        JOINT_TO_CUSTODIAL_UGMA = new AssetTransferType("JOINT_TO_CUSTODIAL_UGMA", 13, 13);
        CUSTODIAL_UTMA_TO_CUSTODIAL_UTMA = new AssetTransferType("CUSTODIAL_UTMA_TO_CUSTODIAL_UTMA", 14, 14);
        CUSTODIAL_UGMA_TO_CUSTODIAL_UGMA = new AssetTransferType("CUSTODIAL_UGMA_TO_CUSTODIAL_UGMA", 15, 15);
        CUSTODIAL_UTMA_TO_MANAGED_CUSTODIAL_UTMA = new AssetTransferType("CUSTODIAL_UTMA_TO_MANAGED_CUSTODIAL_UTMA", 16, 16);
        CUSTODIAL_UGMA_TO_MANAGED_CUSTODIAL_UGMA = new AssetTransferType("CUSTODIAL_UGMA_TO_MANAGED_CUSTODIAL_UGMA", 17, 17);
        CUSTODIAL_UTMA_TO_INDIVIDUAL = new AssetTransferType("CUSTODIAL_UTMA_TO_INDIVIDUAL", 18, 18);
        CUSTODIAL_UGMA_TO_INDIVIDUAL = new AssetTransferType("CUSTODIAL_UGMA_TO_INDIVIDUAL", 19, 19);
        CUSTODIAL_UTMA_TO_MANAGED_INDIVIDUAL = new AssetTransferType("CUSTODIAL_UTMA_TO_MANAGED_INDIVIDUAL", 20, 20);
        CUSTODIAL_UGMA_TO_MANAGED_INDIVIDUAL = new AssetTransferType("CUSTODIAL_UGMA_TO_MANAGED_INDIVIDUAL", 21, 21);
        CUSTODIAL_UTMA_TO_JOINT = new AssetTransferType("CUSTODIAL_UTMA_TO_JOINT", 22, 22);
        CUSTODIAL_UGMA_TO_JOINT = new AssetTransferType("CUSTODIAL_UGMA_TO_JOINT", 23, 23);
        INDIVIDUAL_TO_MANAGED_CUSTODIAL_UTMA = new AssetTransferType("INDIVIDUAL_TO_MANAGED_CUSTODIAL_UTMA", 24, 24);
        INDIVIDUAL_TO_MANAGED_CUSTODIAL_UGMA = new AssetTransferType("INDIVIDUAL_TO_MANAGED_CUSTODIAL_UGMA", 25, 25);
        JOINT_TO_MANAGED_CUSTODIAL_UTMA = new AssetTransferType("JOINT_TO_MANAGED_CUSTODIAL_UTMA", 26, 26);
        JOINT_TO_MANAGED_CUSTODIAL_UGMA = new AssetTransferType("JOINT_TO_MANAGED_CUSTODIAL_UGMA", 27, 27);
        AssetTransferType[] assetTransferTypeArr$values = $values();
        $VALUES = assetTransferTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(assetTransferTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AssetTransferType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<AssetTransferType>(orCreateKotlinClass, syntax, assetTransferType) { // from class: nimbus.service.v1.AssetTransferType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public AssetTransferType fromValue(int value) {
                return AssetTransferType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: AssetTransferType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lnimbus/service/v1/AssetTransferType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lnimbus/service/v1/AssetTransferType;", "fromValue", "value", "", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AssetTransferType fromValue(int value) {
            switch (value) {
                case 0:
                    return AssetTransferType.TYPE_UNSPECIFIED;
                case 1:
                    return AssetTransferType.INDIVIDUAL_TO_JOINT;
                case 2:
                    return AssetTransferType.JOINT_TO_INDIVIDUAL;
                case 3:
                    return AssetTransferType.INDIVIDUAL_TO_INDIVIDUAL;
                case 4:
                    return AssetTransferType.INDIVIDUAL_TO_MANAGED_INDIVIDUAL;
                case 5:
                    return AssetTransferType.JOINT_TO_MANAGED_INDIVIDUAL;
                case 6:
                    return AssetTransferType.IRA_TRADITIONAL_TO_IRA_TRADITIONAL;
                case 7:
                    return AssetTransferType.IRA_ROTH_TO_IRA_ROTH;
                case 8:
                    return AssetTransferType.IRA_TRADITIONAL_TO_MANAGED_IRA_TRADITIONAL;
                case 9:
                    return AssetTransferType.IRA_ROTH_TO_MANAGED_IRA_ROTH;
                case 10:
                    return AssetTransferType.INDIVIDUAL_TO_CUSTODIAL_UTMA;
                case 11:
                    return AssetTransferType.INDIVIDUAL_TO_CUSTODIAL_UGMA;
                case 12:
                    return AssetTransferType.JOINT_TO_CUSTODIAL_UTMA;
                case 13:
                    return AssetTransferType.JOINT_TO_CUSTODIAL_UGMA;
                case 14:
                    return AssetTransferType.CUSTODIAL_UTMA_TO_CUSTODIAL_UTMA;
                case 15:
                    return AssetTransferType.CUSTODIAL_UGMA_TO_CUSTODIAL_UGMA;
                case 16:
                    return AssetTransferType.CUSTODIAL_UTMA_TO_MANAGED_CUSTODIAL_UTMA;
                case 17:
                    return AssetTransferType.CUSTODIAL_UGMA_TO_MANAGED_CUSTODIAL_UGMA;
                case 18:
                    return AssetTransferType.CUSTODIAL_UTMA_TO_INDIVIDUAL;
                case 19:
                    return AssetTransferType.CUSTODIAL_UGMA_TO_INDIVIDUAL;
                case 20:
                    return AssetTransferType.CUSTODIAL_UTMA_TO_MANAGED_INDIVIDUAL;
                case 21:
                    return AssetTransferType.CUSTODIAL_UGMA_TO_MANAGED_INDIVIDUAL;
                case 22:
                    return AssetTransferType.CUSTODIAL_UTMA_TO_JOINT;
                case 23:
                    return AssetTransferType.CUSTODIAL_UGMA_TO_JOINT;
                case 24:
                    return AssetTransferType.INDIVIDUAL_TO_MANAGED_CUSTODIAL_UTMA;
                case 25:
                    return AssetTransferType.INDIVIDUAL_TO_MANAGED_CUSTODIAL_UGMA;
                case 26:
                    return AssetTransferType.JOINT_TO_MANAGED_CUSTODIAL_UTMA;
                case 27:
                    return AssetTransferType.JOINT_TO_MANAGED_CUSTODIAL_UGMA;
                default:
                    return null;
            }
        }
    }

    public static AssetTransferType valueOf(String str) {
        return (AssetTransferType) Enum.valueOf(AssetTransferType.class, str);
    }

    public static AssetTransferType[] values() {
        return (AssetTransferType[]) $VALUES.clone();
    }
}
