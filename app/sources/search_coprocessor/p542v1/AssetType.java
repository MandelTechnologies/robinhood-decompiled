package search_coprocessor.p542v1;

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
/* compiled from: AssetType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lsearch_coprocessor/v1/AssetType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TYPE_UNSPECIFIED", "EQUITY", "CRYPTOCURRENCY", "FUTURES_PRODUCT", "FUTURES_CONTRACT", "INDEX", "Companion", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class AssetType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AssetType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<AssetType> ADAPTER;
    public static final AssetType CRYPTOCURRENCY;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final AssetType EQUITY;
    public static final AssetType FUTURES_CONTRACT;
    public static final AssetType FUTURES_PRODUCT;
    public static final AssetType INDEX;
    public static final AssetType TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ AssetType[] $values() {
        return new AssetType[]{TYPE_UNSPECIFIED, EQUITY, CRYPTOCURRENCY, FUTURES_PRODUCT, FUTURES_CONTRACT, INDEX};
    }

    @JvmStatic
    public static final AssetType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<AssetType> getEntries() {
        return $ENTRIES;
    }

    private AssetType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final AssetType assetType = new AssetType("TYPE_UNSPECIFIED", 0, 0);
        TYPE_UNSPECIFIED = assetType;
        EQUITY = new AssetType("EQUITY", 1, 1);
        CRYPTOCURRENCY = new AssetType("CRYPTOCURRENCY", 2, 2);
        FUTURES_PRODUCT = new AssetType("FUTURES_PRODUCT", 3, 3);
        FUTURES_CONTRACT = new AssetType("FUTURES_CONTRACT", 4, 4);
        INDEX = new AssetType("INDEX", 5, 5);
        AssetType[] assetTypeArr$values = $values();
        $VALUES = assetTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(assetTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AssetType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<AssetType>(orCreateKotlinClass, syntax, assetType) { // from class: search_coprocessor.v1.AssetType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public AssetType fromValue(int value) {
                return AssetType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: AssetType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lsearch_coprocessor/v1/AssetType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lsearch_coprocessor/v1/AssetType;", "fromValue", "value", "", "search_coprocessor.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AssetType fromValue(int value) {
            if (value == 0) {
                return AssetType.TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return AssetType.EQUITY;
            }
            if (value == 2) {
                return AssetType.CRYPTOCURRENCY;
            }
            if (value == 3) {
                return AssetType.FUTURES_PRODUCT;
            }
            if (value == 4) {
                return AssetType.FUTURES_CONTRACT;
            }
            if (value != 5) {
                return null;
            }
            return AssetType.INDEX;
        }
    }

    public static AssetType valueOf(String str) {
        return (AssetType) Enum.valueOf(AssetType.class, str);
    }

    public static AssetType[] values() {
        return (AssetType[]) $VALUES.clone();
    }
}
