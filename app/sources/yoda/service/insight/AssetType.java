package yoda.service.insight;

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
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0017B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0018"}, m3636d2 = {"Lyoda/service/insight/AssetType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ASSET_TYPE_UNSPECIFIED", "ASSET_TYPE_CONTENTFUL_VIDEO", "ASSET_TYPE_CONTENTFUL_IMAGE", "ASSET_TYPE_PORTFOLIO_BREAKDOWN_STOCKS_HIGHLIGHT", "ASSET_TYPE_PORTFOLIO_BREAKDOWN_ETFS_HIGHLIGHT", "ASSET_TYPE_SINGLE_PORTFOLIO_BREAKDOWN_COMPARISON_SINGLE_CATEGORY_HIGHLIGHT", "ASSET_TYPE_SINGLE_PORTFOLIO_BREAKDOWN_COMPARISON_MULTIPLE_CATEGORY_HIGHLIGHT", "ASSET_TYPE_PERFORMANCE_CHART_NO_HIGHLIGHT", "ASSET_TYPE_PERFORMANCE_CHART_SINGLE_DATE_HIGHLIGHT", "ASSET_TYPE_PERFORMANCE_CHART_DATE_RANGE_HIGHLIGHT", "ASSET_TYPE_TWO_BAR_CHART_COMPARISON", "ASSET_TYPE_NONE", "ASSET_TYPE_RETURNS_CHART_POSITIVE", "ASSET_TYPE_RETURNS_CHART_NEGATIVE", "Companion", "yoda.v1.insight_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes28.dex */
public final class AssetType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AssetType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<AssetType> ADAPTER;
    public static final AssetType ASSET_TYPE_CONTENTFUL_IMAGE;
    public static final AssetType ASSET_TYPE_CONTENTFUL_VIDEO;
    public static final AssetType ASSET_TYPE_NONE;
    public static final AssetType ASSET_TYPE_PERFORMANCE_CHART_DATE_RANGE_HIGHLIGHT;
    public static final AssetType ASSET_TYPE_PERFORMANCE_CHART_NO_HIGHLIGHT;
    public static final AssetType ASSET_TYPE_PERFORMANCE_CHART_SINGLE_DATE_HIGHLIGHT;
    public static final AssetType ASSET_TYPE_PORTFOLIO_BREAKDOWN_ETFS_HIGHLIGHT;
    public static final AssetType ASSET_TYPE_PORTFOLIO_BREAKDOWN_STOCKS_HIGHLIGHT;
    public static final AssetType ASSET_TYPE_RETURNS_CHART_NEGATIVE;
    public static final AssetType ASSET_TYPE_RETURNS_CHART_POSITIVE;

    /* renamed from: ASSET_TYPE_SINGLE_PORTFOLIO_BREAKDOWN_COMPARISON_MULTIPLE_CATEGORY_HIGHLIGHT */
    public static final AssetType f8522xb5108702;

    /* renamed from: ASSET_TYPE_SINGLE_PORTFOLIO_BREAKDOWN_COMPARISON_SINGLE_CATEGORY_HIGHLIGHT */
    public static final AssetType f8523x6d0641ca;
    public static final AssetType ASSET_TYPE_TWO_BAR_CHART_COMPARISON;
    public static final AssetType ASSET_TYPE_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ AssetType[] $values() {
        return new AssetType[]{ASSET_TYPE_UNSPECIFIED, ASSET_TYPE_CONTENTFUL_VIDEO, ASSET_TYPE_CONTENTFUL_IMAGE, ASSET_TYPE_PORTFOLIO_BREAKDOWN_STOCKS_HIGHLIGHT, ASSET_TYPE_PORTFOLIO_BREAKDOWN_ETFS_HIGHLIGHT, f8523x6d0641ca, f8522xb5108702, ASSET_TYPE_PERFORMANCE_CHART_NO_HIGHLIGHT, ASSET_TYPE_PERFORMANCE_CHART_SINGLE_DATE_HIGHLIGHT, ASSET_TYPE_PERFORMANCE_CHART_DATE_RANGE_HIGHLIGHT, ASSET_TYPE_TWO_BAR_CHART_COMPARISON, ASSET_TYPE_NONE, ASSET_TYPE_RETURNS_CHART_POSITIVE, ASSET_TYPE_RETURNS_CHART_NEGATIVE};
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
        final AssetType assetType = new AssetType("ASSET_TYPE_UNSPECIFIED", 0, 0);
        ASSET_TYPE_UNSPECIFIED = assetType;
        ASSET_TYPE_CONTENTFUL_VIDEO = new AssetType("ASSET_TYPE_CONTENTFUL_VIDEO", 1, 1);
        ASSET_TYPE_CONTENTFUL_IMAGE = new AssetType("ASSET_TYPE_CONTENTFUL_IMAGE", 2, 2);
        ASSET_TYPE_PORTFOLIO_BREAKDOWN_STOCKS_HIGHLIGHT = new AssetType("ASSET_TYPE_PORTFOLIO_BREAKDOWN_STOCKS_HIGHLIGHT", 3, 3);
        ASSET_TYPE_PORTFOLIO_BREAKDOWN_ETFS_HIGHLIGHT = new AssetType("ASSET_TYPE_PORTFOLIO_BREAKDOWN_ETFS_HIGHLIGHT", 4, 4);
        f8523x6d0641ca = new AssetType("ASSET_TYPE_SINGLE_PORTFOLIO_BREAKDOWN_COMPARISON_SINGLE_CATEGORY_HIGHLIGHT", 5, 5);
        f8522xb5108702 = new AssetType("ASSET_TYPE_SINGLE_PORTFOLIO_BREAKDOWN_COMPARISON_MULTIPLE_CATEGORY_HIGHLIGHT", 6, 6);
        ASSET_TYPE_PERFORMANCE_CHART_NO_HIGHLIGHT = new AssetType("ASSET_TYPE_PERFORMANCE_CHART_NO_HIGHLIGHT", 7, 7);
        ASSET_TYPE_PERFORMANCE_CHART_SINGLE_DATE_HIGHLIGHT = new AssetType("ASSET_TYPE_PERFORMANCE_CHART_SINGLE_DATE_HIGHLIGHT", 8, 8);
        ASSET_TYPE_PERFORMANCE_CHART_DATE_RANGE_HIGHLIGHT = new AssetType("ASSET_TYPE_PERFORMANCE_CHART_DATE_RANGE_HIGHLIGHT", 9, 9);
        ASSET_TYPE_TWO_BAR_CHART_COMPARISON = new AssetType("ASSET_TYPE_TWO_BAR_CHART_COMPARISON", 10, 10);
        ASSET_TYPE_NONE = new AssetType("ASSET_TYPE_NONE", 11, 11);
        ASSET_TYPE_RETURNS_CHART_POSITIVE = new AssetType("ASSET_TYPE_RETURNS_CHART_POSITIVE", 12, 12);
        ASSET_TYPE_RETURNS_CHART_NEGATIVE = new AssetType("ASSET_TYPE_RETURNS_CHART_NEGATIVE", 13, 13);
        AssetType[] assetTypeArr$values = $values();
        $VALUES = assetTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(assetTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AssetType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<AssetType>(orCreateKotlinClass, syntax, assetType) { // from class: yoda.service.insight.AssetType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public AssetType fromValue(int value) {
                return AssetType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: AssetType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lyoda/service/insight/AssetType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lyoda/service/insight/AssetType;", "fromValue", "value", "", "yoda.v1.insight_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AssetType fromValue(int value) {
            switch (value) {
                case 0:
                    return AssetType.ASSET_TYPE_UNSPECIFIED;
                case 1:
                    return AssetType.ASSET_TYPE_CONTENTFUL_VIDEO;
                case 2:
                    return AssetType.ASSET_TYPE_CONTENTFUL_IMAGE;
                case 3:
                    return AssetType.ASSET_TYPE_PORTFOLIO_BREAKDOWN_STOCKS_HIGHLIGHT;
                case 4:
                    return AssetType.ASSET_TYPE_PORTFOLIO_BREAKDOWN_ETFS_HIGHLIGHT;
                case 5:
                    return AssetType.f8523x6d0641ca;
                case 6:
                    return AssetType.f8522xb5108702;
                case 7:
                    return AssetType.ASSET_TYPE_PERFORMANCE_CHART_NO_HIGHLIGHT;
                case 8:
                    return AssetType.ASSET_TYPE_PERFORMANCE_CHART_SINGLE_DATE_HIGHLIGHT;
                case 9:
                    return AssetType.ASSET_TYPE_PERFORMANCE_CHART_DATE_RANGE_HIGHLIGHT;
                case 10:
                    return AssetType.ASSET_TYPE_TWO_BAR_CHART_COMPARISON;
                case 11:
                    return AssetType.ASSET_TYPE_NONE;
                case 12:
                    return AssetType.ASSET_TYPE_RETURNS_CHART_POSITIVE;
                case 13:
                    return AssetType.ASSET_TYPE_RETURNS_CHART_NEGATIVE;
                default:
                    return null;
            }
        }
    }

    public static AssetType valueOf(String str) {
        return (AssetType) Enum.valueOf(AssetType.class, str);
    }

    public static AssetType[] values() {
        return (AssetType[]) $VALUES.clone();
    }
}
