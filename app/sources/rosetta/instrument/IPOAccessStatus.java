package rosetta.instrument;

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
/* compiled from: IPOAccessStatus.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m3636d2 = {"Lrosetta/instrument/IPOAccessStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "IPO_ACCESS_STATUS_UNSPECIFIED", "IPO_ACCESS_STATUS_EMPTY", "IPO_ACCESS_STATUS_S1_FILED", "IPO_ACCESS_STATUS_PRICE_INITIALIZED", "IPO_ACCESS_STATUS_PRICE_FINALIZED", "IPO_ACCESS_STATUS_PUBLIC", "IPO_ACCESS_STATUS_CANCELED", "IPO_ACCESS_STATUS_DELAYED", "Companion", "rosetta.instrument_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class IPOAccessStatus implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IPOAccessStatus[] $VALUES;

    @JvmField
    public static final ProtoAdapter<IPOAccessStatus> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final IPOAccessStatus IPO_ACCESS_STATUS_CANCELED;
    public static final IPOAccessStatus IPO_ACCESS_STATUS_DELAYED;
    public static final IPOAccessStatus IPO_ACCESS_STATUS_EMPTY;
    public static final IPOAccessStatus IPO_ACCESS_STATUS_PRICE_FINALIZED;
    public static final IPOAccessStatus IPO_ACCESS_STATUS_PRICE_INITIALIZED;
    public static final IPOAccessStatus IPO_ACCESS_STATUS_PUBLIC;
    public static final IPOAccessStatus IPO_ACCESS_STATUS_S1_FILED;
    public static final IPOAccessStatus IPO_ACCESS_STATUS_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ IPOAccessStatus[] $values() {
        return new IPOAccessStatus[]{IPO_ACCESS_STATUS_UNSPECIFIED, IPO_ACCESS_STATUS_EMPTY, IPO_ACCESS_STATUS_S1_FILED, IPO_ACCESS_STATUS_PRICE_INITIALIZED, IPO_ACCESS_STATUS_PRICE_FINALIZED, IPO_ACCESS_STATUS_PUBLIC, IPO_ACCESS_STATUS_CANCELED, IPO_ACCESS_STATUS_DELAYED};
    }

    @JvmStatic
    public static final IPOAccessStatus fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<IPOAccessStatus> getEntries() {
        return $ENTRIES;
    }

    private IPOAccessStatus(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final IPOAccessStatus iPOAccessStatus = new IPOAccessStatus("IPO_ACCESS_STATUS_UNSPECIFIED", 0, 0);
        IPO_ACCESS_STATUS_UNSPECIFIED = iPOAccessStatus;
        IPO_ACCESS_STATUS_EMPTY = new IPOAccessStatus("IPO_ACCESS_STATUS_EMPTY", 1, 0);
        IPO_ACCESS_STATUS_S1_FILED = new IPOAccessStatus("IPO_ACCESS_STATUS_S1_FILED", 2, 1);
        IPO_ACCESS_STATUS_PRICE_INITIALIZED = new IPOAccessStatus("IPO_ACCESS_STATUS_PRICE_INITIALIZED", 3, 2);
        IPO_ACCESS_STATUS_PRICE_FINALIZED = new IPOAccessStatus("IPO_ACCESS_STATUS_PRICE_FINALIZED", 4, 3);
        IPO_ACCESS_STATUS_PUBLIC = new IPOAccessStatus("IPO_ACCESS_STATUS_PUBLIC", 5, 4);
        IPO_ACCESS_STATUS_CANCELED = new IPOAccessStatus("IPO_ACCESS_STATUS_CANCELED", 6, 5);
        IPO_ACCESS_STATUS_DELAYED = new IPOAccessStatus("IPO_ACCESS_STATUS_DELAYED", 7, 6);
        IPOAccessStatus[] iPOAccessStatusArr$values = $values();
        $VALUES = iPOAccessStatusArr$values;
        $ENTRIES = EnumEntries2.enumEntries(iPOAccessStatusArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IPOAccessStatus.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<IPOAccessStatus>(orCreateKotlinClass, syntax, iPOAccessStatus) { // from class: rosetta.instrument.IPOAccessStatus$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public IPOAccessStatus fromValue(int value) {
                return IPOAccessStatus.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: IPOAccessStatus.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/instrument/IPOAccessStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/instrument/IPOAccessStatus;", "fromValue", "value", "", "rosetta.instrument_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final IPOAccessStatus fromValue(int value) {
            switch (value) {
                case 0:
                    return IPOAccessStatus.IPO_ACCESS_STATUS_UNSPECIFIED;
                case 1:
                    return IPOAccessStatus.IPO_ACCESS_STATUS_S1_FILED;
                case 2:
                    return IPOAccessStatus.IPO_ACCESS_STATUS_PRICE_INITIALIZED;
                case 3:
                    return IPOAccessStatus.IPO_ACCESS_STATUS_PRICE_FINALIZED;
                case 4:
                    return IPOAccessStatus.IPO_ACCESS_STATUS_PUBLIC;
                case 5:
                    return IPOAccessStatus.IPO_ACCESS_STATUS_CANCELED;
                case 6:
                    return IPOAccessStatus.IPO_ACCESS_STATUS_DELAYED;
                default:
                    return null;
            }
        }
    }

    public static IPOAccessStatus valueOf(String str) {
        return (IPOAccessStatus) Enum.valueOf(IPOAccessStatus.class, str);
    }

    public static IPOAccessStatus[] values() {
        return (IPOAccessStatus[]) $VALUES.clone();
    }
}
