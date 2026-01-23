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
/* compiled from: TradingStatus.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/TradingStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TRADING_STATUS_UNSPECIFIED", "TRADING_STATUS_ACTIVE", "TRADING_STATUS_INACTIVE", "TRADING_STATUS_POSITION_REDUCING_ONLY", "Companion", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class TradingStatus implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TradingStatus[] $VALUES;

    @JvmField
    public static final ProtoAdapter<TradingStatus> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TradingStatus TRADING_STATUS_ACTIVE;
    public static final TradingStatus TRADING_STATUS_INACTIVE;
    public static final TradingStatus TRADING_STATUS_POSITION_REDUCING_ONLY;
    public static final TradingStatus TRADING_STATUS_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ TradingStatus[] $values() {
        return new TradingStatus[]{TRADING_STATUS_UNSPECIFIED, TRADING_STATUS_ACTIVE, TRADING_STATUS_INACTIVE, TRADING_STATUS_POSITION_REDUCING_ONLY};
    }

    @JvmStatic
    public static final TradingStatus fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<TradingStatus> getEntries() {
        return $ENTRIES;
    }

    private TradingStatus(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final TradingStatus tradingStatus = new TradingStatus("TRADING_STATUS_UNSPECIFIED", 0, 0);
        TRADING_STATUS_UNSPECIFIED = tradingStatus;
        TRADING_STATUS_ACTIVE = new TradingStatus("TRADING_STATUS_ACTIVE", 1, 1);
        TRADING_STATUS_INACTIVE = new TradingStatus("TRADING_STATUS_INACTIVE", 2, 2);
        TRADING_STATUS_POSITION_REDUCING_ONLY = new TradingStatus("TRADING_STATUS_POSITION_REDUCING_ONLY", 3, 3);
        TradingStatus[] tradingStatusArr$values = $values();
        $VALUES = tradingStatusArr$values;
        $ENTRIES = EnumEntries2.enumEntries(tradingStatusArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TradingStatus.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<TradingStatus>(orCreateKotlinClass, syntax, tradingStatus) { // from class: crypto_perpetuals.common.v1.TradingStatus$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public TradingStatus fromValue(int value) {
                return TradingStatus.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: TradingStatus.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/TradingStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcrypto_perpetuals/common/v1/TradingStatus;", "fromValue", "value", "", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TradingStatus fromValue(int value) {
            if (value == 0) {
                return TradingStatus.TRADING_STATUS_UNSPECIFIED;
            }
            if (value == 1) {
                return TradingStatus.TRADING_STATUS_ACTIVE;
            }
            if (value == 2) {
                return TradingStatus.TRADING_STATUS_INACTIVE;
            }
            if (value != 3) {
                return null;
            }
            return TradingStatus.TRADING_STATUS_POSITION_REDUCING_ONLY;
        }
    }

    public static TradingStatus valueOf(String str) {
        return (TradingStatus) Enum.valueOf(TradingStatus.class, str);
    }

    public static TradingStatus[] values() {
        return (TradingStatus[]) $VALUES.clone();
    }
}
