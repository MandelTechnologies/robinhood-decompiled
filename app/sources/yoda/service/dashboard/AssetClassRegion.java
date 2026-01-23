package yoda.service.dashboard;

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
/* compiled from: AssetClassRegion.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, m3636d2 = {"Lyoda/service/dashboard/AssetClassRegion;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ASSET_CLASS_REGION_UNSPECIFIED", "ASSET_CLASS_REGION_US_EQUITY", "ASSET_CLASS_REGION_INTERNATIONAL_EQUITY", "ASSET_CLASS_REGION_US_BONDS", "ASSET_CLASS_REGION_INTERNATIONAL_BONDS", "ASSET_CLASS_REGION_OTHER", "ASSET_CLASS_REGION_CASH", "ASSET_CLASS_REGION_GOLD", "ASSET_CLASS_REGION_COMMODITIES", "ASSET_CLASS_REGION_CRYPTO", "Companion", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class AssetClassRegion implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AssetClassRegion[] $VALUES;

    @JvmField
    public static final ProtoAdapter<AssetClassRegion> ADAPTER;
    public static final AssetClassRegion ASSET_CLASS_REGION_CASH;
    public static final AssetClassRegion ASSET_CLASS_REGION_COMMODITIES;
    public static final AssetClassRegion ASSET_CLASS_REGION_CRYPTO;
    public static final AssetClassRegion ASSET_CLASS_REGION_GOLD;
    public static final AssetClassRegion ASSET_CLASS_REGION_INTERNATIONAL_BONDS;
    public static final AssetClassRegion ASSET_CLASS_REGION_INTERNATIONAL_EQUITY;
    public static final AssetClassRegion ASSET_CLASS_REGION_OTHER;
    public static final AssetClassRegion ASSET_CLASS_REGION_UNSPECIFIED;
    public static final AssetClassRegion ASSET_CLASS_REGION_US_BONDS;
    public static final AssetClassRegion ASSET_CLASS_REGION_US_EQUITY;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ AssetClassRegion[] $values() {
        return new AssetClassRegion[]{ASSET_CLASS_REGION_UNSPECIFIED, ASSET_CLASS_REGION_US_EQUITY, ASSET_CLASS_REGION_INTERNATIONAL_EQUITY, ASSET_CLASS_REGION_US_BONDS, ASSET_CLASS_REGION_INTERNATIONAL_BONDS, ASSET_CLASS_REGION_OTHER, ASSET_CLASS_REGION_CASH, ASSET_CLASS_REGION_GOLD, ASSET_CLASS_REGION_COMMODITIES, ASSET_CLASS_REGION_CRYPTO};
    }

    @JvmStatic
    public static final AssetClassRegion fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<AssetClassRegion> getEntries() {
        return $ENTRIES;
    }

    private AssetClassRegion(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final AssetClassRegion assetClassRegion = new AssetClassRegion("ASSET_CLASS_REGION_UNSPECIFIED", 0, 0);
        ASSET_CLASS_REGION_UNSPECIFIED = assetClassRegion;
        ASSET_CLASS_REGION_US_EQUITY = new AssetClassRegion("ASSET_CLASS_REGION_US_EQUITY", 1, 1);
        ASSET_CLASS_REGION_INTERNATIONAL_EQUITY = new AssetClassRegion("ASSET_CLASS_REGION_INTERNATIONAL_EQUITY", 2, 2);
        ASSET_CLASS_REGION_US_BONDS = new AssetClassRegion("ASSET_CLASS_REGION_US_BONDS", 3, 3);
        ASSET_CLASS_REGION_INTERNATIONAL_BONDS = new AssetClassRegion("ASSET_CLASS_REGION_INTERNATIONAL_BONDS", 4, 4);
        ASSET_CLASS_REGION_OTHER = new AssetClassRegion("ASSET_CLASS_REGION_OTHER", 5, 5);
        ASSET_CLASS_REGION_CASH = new AssetClassRegion("ASSET_CLASS_REGION_CASH", 6, 6);
        ASSET_CLASS_REGION_GOLD = new AssetClassRegion("ASSET_CLASS_REGION_GOLD", 7, 7);
        ASSET_CLASS_REGION_COMMODITIES = new AssetClassRegion("ASSET_CLASS_REGION_COMMODITIES", 8, 8);
        ASSET_CLASS_REGION_CRYPTO = new AssetClassRegion("ASSET_CLASS_REGION_CRYPTO", 9, 9);
        AssetClassRegion[] assetClassRegionArr$values = $values();
        $VALUES = assetClassRegionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(assetClassRegionArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AssetClassRegion.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<AssetClassRegion>(orCreateKotlinClass, syntax, assetClassRegion) { // from class: yoda.service.dashboard.AssetClassRegion$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public AssetClassRegion fromValue(int value) {
                return AssetClassRegion.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: AssetClassRegion.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lyoda/service/dashboard/AssetClassRegion$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lyoda/service/dashboard/AssetClassRegion;", "fromValue", "value", "", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AssetClassRegion fromValue(int value) {
            switch (value) {
                case 0:
                    return AssetClassRegion.ASSET_CLASS_REGION_UNSPECIFIED;
                case 1:
                    return AssetClassRegion.ASSET_CLASS_REGION_US_EQUITY;
                case 2:
                    return AssetClassRegion.ASSET_CLASS_REGION_INTERNATIONAL_EQUITY;
                case 3:
                    return AssetClassRegion.ASSET_CLASS_REGION_US_BONDS;
                case 4:
                    return AssetClassRegion.ASSET_CLASS_REGION_INTERNATIONAL_BONDS;
                case 5:
                    return AssetClassRegion.ASSET_CLASS_REGION_OTHER;
                case 6:
                    return AssetClassRegion.ASSET_CLASS_REGION_CASH;
                case 7:
                    return AssetClassRegion.ASSET_CLASS_REGION_GOLD;
                case 8:
                    return AssetClassRegion.ASSET_CLASS_REGION_COMMODITIES;
                case 9:
                    return AssetClassRegion.ASSET_CLASS_REGION_CRYPTO;
                default:
                    return null;
            }
        }
    }

    public static AssetClassRegion valueOf(String str) {
        return (AssetClassRegion) Enum.valueOf(AssetClassRegion.class, str);
    }

    public static AssetClassRegion[] values() {
        return (AssetClassRegion[]) $VALUES.clone();
    }
}
