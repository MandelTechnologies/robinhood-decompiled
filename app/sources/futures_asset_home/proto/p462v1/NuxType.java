package futures_asset_home.proto.p462v1;

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
/* compiled from: NuxType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lfutures_asset_home/proto/v1/NuxType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TYPE_UNSPECIFIED", "TYPE_PNL", "TYPE_CHART_BAR_DISPLAY", "TYPE_CHART_BAR_TAP", "TYPE_POSITIONS_FILTER", "Companion", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class NuxType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NuxType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<NuxType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final NuxType TYPE_CHART_BAR_DISPLAY;
    public static final NuxType TYPE_CHART_BAR_TAP;
    public static final NuxType TYPE_PNL;
    public static final NuxType TYPE_POSITIONS_FILTER;
    public static final NuxType TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ NuxType[] $values() {
        return new NuxType[]{TYPE_UNSPECIFIED, TYPE_PNL, TYPE_CHART_BAR_DISPLAY, TYPE_CHART_BAR_TAP, TYPE_POSITIONS_FILTER};
    }

    @JvmStatic
    public static final NuxType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<NuxType> getEntries() {
        return $ENTRIES;
    }

    private NuxType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final NuxType nuxType = new NuxType("TYPE_UNSPECIFIED", 0, 0);
        TYPE_UNSPECIFIED = nuxType;
        TYPE_PNL = new NuxType("TYPE_PNL", 1, 1);
        TYPE_CHART_BAR_DISPLAY = new NuxType("TYPE_CHART_BAR_DISPLAY", 2, 2);
        TYPE_CHART_BAR_TAP = new NuxType("TYPE_CHART_BAR_TAP", 3, 3);
        TYPE_POSITIONS_FILTER = new NuxType("TYPE_POSITIONS_FILTER", 4, 4);
        NuxType[] nuxTypeArr$values = $values();
        $VALUES = nuxTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(nuxTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(NuxType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<NuxType>(orCreateKotlinClass, syntax, nuxType) { // from class: futures_asset_home.proto.v1.NuxType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public NuxType fromValue(int value) {
                return NuxType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: NuxType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lfutures_asset_home/proto/v1/NuxType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lfutures_asset_home/proto/v1/NuxType;", "fromValue", "value", "", "futures_asset_home.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final NuxType fromValue(int value) {
            if (value == 0) {
                return NuxType.TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return NuxType.TYPE_PNL;
            }
            if (value == 2) {
                return NuxType.TYPE_CHART_BAR_DISPLAY;
            }
            if (value == 3) {
                return NuxType.TYPE_CHART_BAR_TAP;
            }
            if (value != 4) {
                return null;
            }
            return NuxType.TYPE_POSITIONS_FILTER;
        }
    }

    public static NuxType valueOf(String str) {
        return (NuxType) Enum.valueOf(NuxType.class, str);
    }

    public static NuxType[] values() {
        return (NuxType[]) $VALUES.clone();
    }
}
