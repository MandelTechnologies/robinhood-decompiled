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
/* compiled from: AssetTransferSubType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lnimbus/service/v1/AssetTransferSubType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SUBTYPE_UNSPECIFIED", "SUBTYPE_NONE", "Companion", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class AssetTransferSubType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AssetTransferSubType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<AssetTransferSubType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final AssetTransferSubType SUBTYPE_NONE;
    public static final AssetTransferSubType SUBTYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ AssetTransferSubType[] $values() {
        return new AssetTransferSubType[]{SUBTYPE_UNSPECIFIED, SUBTYPE_NONE};
    }

    @JvmStatic
    public static final AssetTransferSubType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<AssetTransferSubType> getEntries() {
        return $ENTRIES;
    }

    private AssetTransferSubType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final AssetTransferSubType assetTransferSubType = new AssetTransferSubType("SUBTYPE_UNSPECIFIED", 0, 0);
        SUBTYPE_UNSPECIFIED = assetTransferSubType;
        SUBTYPE_NONE = new AssetTransferSubType("SUBTYPE_NONE", 1, 1);
        AssetTransferSubType[] assetTransferSubTypeArr$values = $values();
        $VALUES = assetTransferSubTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(assetTransferSubTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AssetTransferSubType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<AssetTransferSubType>(orCreateKotlinClass, syntax, assetTransferSubType) { // from class: nimbus.service.v1.AssetTransferSubType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public AssetTransferSubType fromValue(int value) {
                return AssetTransferSubType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: AssetTransferSubType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lnimbus/service/v1/AssetTransferSubType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lnimbus/service/v1/AssetTransferSubType;", "fromValue", "value", "", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AssetTransferSubType fromValue(int value) {
            if (value == 0) {
                return AssetTransferSubType.SUBTYPE_UNSPECIFIED;
            }
            if (value != 1) {
                return null;
            }
            return AssetTransferSubType.SUBTYPE_NONE;
        }
    }

    public static AssetTransferSubType valueOf(String str) {
        return (AssetTransferSubType) Enum.valueOf(AssetTransferSubType.class, str);
    }

    public static AssetTransferSubType[] values() {
        return (AssetTransferSubType[]) $VALUES.clone();
    }
}
