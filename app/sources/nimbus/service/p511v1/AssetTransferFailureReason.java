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
/* compiled from: AssetTransferFailureReason.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b#\b\u0086\u0081\u0002\u0018\u0000 &2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001&B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%¨\u0006'"}, m3636d2 = {"Lnimbus/service/v1/AssetTransferFailureReason;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FAILURE_REASON_UNSPECIFIED", "FAILURE_REASON_NONE", "FAILURE_REASON_INSUFFICIENT_FUNDS_FOR_ACATS_CLAWBACK", "FAILURE_REASON_SOURCE_ACCOUNT_DISABLED", "FAILURE_REASON_DESTINATION_ACCOUNT_DISABLED", "FAILURE_REASON_SOURCE_ACCOUNT_DEFICIT", "FAILURE_REASON_DESTINATION_ACCOUNT_DEFICIT", "FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_RESTRICTION", "FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_RESTRICTION", "FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL", "FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL", "FAILURE_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED", "FAILURE_REASON_MAINTENANCE_EXCESS_CHECK_FAILED", "FAILURE_REASON_BORROWING_LIMIT_CHECK_FAILED", "FAILURE_REASON_TRANSFER_LIMIT_CHECK_FAILED", "FAILURE_REASON_UNSETTLED_POSITIONS_CHECK_FAILED", "FAILURE_REASON_CASH_HOLD_REJECTED", "FAILURE_REASON_EQUITY_POSITION_HOLD_REJECTED", "FAILURE_REASON_CASH_HOLD_FAILED", "FAILURE_REASON_EQUITY_POSITION_HOLD_FAILED", "FAILURE_REASON_CANCELLED_BY_USER", "FAILURE_REASON_CANCELLED_BY_MO_USER", "FAILURE_REASON_OTHER", "FAILURE_REASON_NEGATIVE_TRANSFER_MARKET_VALUE", "FAILURE_REASON_SOURCE_ACCOUNT_OPEN_FUTURES_POSITION", "FAILURE_REASON_TRANSFER_COUNT_CHECK_FAILED", "FAILURE_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED", "FAILURE_REASON_INSTRUMENT_NOT_TRANSFERABLE", "FAILURE_REASON_MANAGED_ACCOUNT_FUNDING_TRANSFER_VALUE_CHECK_FAILED", "Companion", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class AssetTransferFailureReason implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AssetTransferFailureReason[] $VALUES;

    @JvmField
    public static final ProtoAdapter<AssetTransferFailureReason> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final AssetTransferFailureReason FAILURE_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED;
    public static final AssetTransferFailureReason FAILURE_REASON_BORROWING_LIMIT_CHECK_FAILED;
    public static final AssetTransferFailureReason FAILURE_REASON_CANCELLED_BY_MO_USER;
    public static final AssetTransferFailureReason FAILURE_REASON_CANCELLED_BY_USER;
    public static final AssetTransferFailureReason FAILURE_REASON_CASH_HOLD_FAILED;
    public static final AssetTransferFailureReason FAILURE_REASON_CASH_HOLD_REJECTED;
    public static final AssetTransferFailureReason FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL;
    public static final AssetTransferFailureReason FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_RESTRICTION;
    public static final AssetTransferFailureReason FAILURE_REASON_DESTINATION_ACCOUNT_DEFICIT;
    public static final AssetTransferFailureReason FAILURE_REASON_DESTINATION_ACCOUNT_DISABLED;
    public static final AssetTransferFailureReason FAILURE_REASON_EQUITY_POSITION_HOLD_FAILED;
    public static final AssetTransferFailureReason FAILURE_REASON_EQUITY_POSITION_HOLD_REJECTED;
    public static final AssetTransferFailureReason FAILURE_REASON_INSTRUMENT_NOT_TRANSFERABLE;
    public static final AssetTransferFailureReason FAILURE_REASON_INSUFFICIENT_FUNDS_FOR_ACATS_CLAWBACK;
    public static final AssetTransferFailureReason FAILURE_REASON_MAINTENANCE_EXCESS_CHECK_FAILED;

    /* renamed from: FAILURE_REASON_MANAGED_ACCOUNT_FUNDING_TRANSFER_VALUE_CHECK_FAILED */
    public static final AssetTransferFailureReason f7124x2d5e119c;
    public static final AssetTransferFailureReason FAILURE_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED;
    public static final AssetTransferFailureReason FAILURE_REASON_NEGATIVE_TRANSFER_MARKET_VALUE;
    public static final AssetTransferFailureReason FAILURE_REASON_NONE;
    public static final AssetTransferFailureReason FAILURE_REASON_OTHER;
    public static final AssetTransferFailureReason FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL;
    public static final AssetTransferFailureReason FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_RESTRICTION;
    public static final AssetTransferFailureReason FAILURE_REASON_SOURCE_ACCOUNT_DEFICIT;
    public static final AssetTransferFailureReason FAILURE_REASON_SOURCE_ACCOUNT_DISABLED;
    public static final AssetTransferFailureReason FAILURE_REASON_SOURCE_ACCOUNT_OPEN_FUTURES_POSITION;
    public static final AssetTransferFailureReason FAILURE_REASON_TRANSFER_COUNT_CHECK_FAILED;
    public static final AssetTransferFailureReason FAILURE_REASON_TRANSFER_LIMIT_CHECK_FAILED;
    public static final AssetTransferFailureReason FAILURE_REASON_UNSETTLED_POSITIONS_CHECK_FAILED;
    public static final AssetTransferFailureReason FAILURE_REASON_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ AssetTransferFailureReason[] $values() {
        return new AssetTransferFailureReason[]{FAILURE_REASON_UNSPECIFIED, FAILURE_REASON_NONE, FAILURE_REASON_INSUFFICIENT_FUNDS_FOR_ACATS_CLAWBACK, FAILURE_REASON_SOURCE_ACCOUNT_DISABLED, FAILURE_REASON_DESTINATION_ACCOUNT_DISABLED, FAILURE_REASON_SOURCE_ACCOUNT_DEFICIT, FAILURE_REASON_DESTINATION_ACCOUNT_DEFICIT, FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_RESTRICTION, FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_RESTRICTION, FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL, FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL, FAILURE_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED, FAILURE_REASON_MAINTENANCE_EXCESS_CHECK_FAILED, FAILURE_REASON_BORROWING_LIMIT_CHECK_FAILED, FAILURE_REASON_TRANSFER_LIMIT_CHECK_FAILED, FAILURE_REASON_UNSETTLED_POSITIONS_CHECK_FAILED, FAILURE_REASON_CASH_HOLD_REJECTED, FAILURE_REASON_EQUITY_POSITION_HOLD_REJECTED, FAILURE_REASON_CASH_HOLD_FAILED, FAILURE_REASON_EQUITY_POSITION_HOLD_FAILED, FAILURE_REASON_CANCELLED_BY_USER, FAILURE_REASON_CANCELLED_BY_MO_USER, FAILURE_REASON_OTHER, FAILURE_REASON_NEGATIVE_TRANSFER_MARKET_VALUE, FAILURE_REASON_SOURCE_ACCOUNT_OPEN_FUTURES_POSITION, FAILURE_REASON_TRANSFER_COUNT_CHECK_FAILED, FAILURE_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED, FAILURE_REASON_INSTRUMENT_NOT_TRANSFERABLE, f7124x2d5e119c};
    }

    @JvmStatic
    public static final AssetTransferFailureReason fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<AssetTransferFailureReason> getEntries() {
        return $ENTRIES;
    }

    private AssetTransferFailureReason(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final AssetTransferFailureReason assetTransferFailureReason = new AssetTransferFailureReason("FAILURE_REASON_UNSPECIFIED", 0, 0);
        FAILURE_REASON_UNSPECIFIED = assetTransferFailureReason;
        FAILURE_REASON_NONE = new AssetTransferFailureReason("FAILURE_REASON_NONE", 1, 1);
        FAILURE_REASON_INSUFFICIENT_FUNDS_FOR_ACATS_CLAWBACK = new AssetTransferFailureReason("FAILURE_REASON_INSUFFICIENT_FUNDS_FOR_ACATS_CLAWBACK", 2, 2);
        FAILURE_REASON_SOURCE_ACCOUNT_DISABLED = new AssetTransferFailureReason("FAILURE_REASON_SOURCE_ACCOUNT_DISABLED", 3, 3);
        FAILURE_REASON_DESTINATION_ACCOUNT_DISABLED = new AssetTransferFailureReason("FAILURE_REASON_DESTINATION_ACCOUNT_DISABLED", 4, 4);
        FAILURE_REASON_SOURCE_ACCOUNT_DEFICIT = new AssetTransferFailureReason("FAILURE_REASON_SOURCE_ACCOUNT_DEFICIT", 5, 5);
        FAILURE_REASON_DESTINATION_ACCOUNT_DEFICIT = new AssetTransferFailureReason("FAILURE_REASON_DESTINATION_ACCOUNT_DEFICIT", 6, 6);
        FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_RESTRICTION = new AssetTransferFailureReason("FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_RESTRICTION", 7, 7);
        FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_RESTRICTION = new AssetTransferFailureReason("FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_RESTRICTION", 8, 8);
        FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL = new AssetTransferFailureReason("FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL", 9, 9);
        FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL = new AssetTransferFailureReason("FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL", 10, 10);
        FAILURE_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED = new AssetTransferFailureReason("FAILURE_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED", 11, 11);
        FAILURE_REASON_MAINTENANCE_EXCESS_CHECK_FAILED = new AssetTransferFailureReason("FAILURE_REASON_MAINTENANCE_EXCESS_CHECK_FAILED", 12, 12);
        FAILURE_REASON_BORROWING_LIMIT_CHECK_FAILED = new AssetTransferFailureReason("FAILURE_REASON_BORROWING_LIMIT_CHECK_FAILED", 13, 13);
        FAILURE_REASON_TRANSFER_LIMIT_CHECK_FAILED = new AssetTransferFailureReason("FAILURE_REASON_TRANSFER_LIMIT_CHECK_FAILED", 14, 14);
        FAILURE_REASON_UNSETTLED_POSITIONS_CHECK_FAILED = new AssetTransferFailureReason("FAILURE_REASON_UNSETTLED_POSITIONS_CHECK_FAILED", 15, 15);
        FAILURE_REASON_CASH_HOLD_REJECTED = new AssetTransferFailureReason("FAILURE_REASON_CASH_HOLD_REJECTED", 16, 16);
        FAILURE_REASON_EQUITY_POSITION_HOLD_REJECTED = new AssetTransferFailureReason("FAILURE_REASON_EQUITY_POSITION_HOLD_REJECTED", 17, 17);
        FAILURE_REASON_CASH_HOLD_FAILED = new AssetTransferFailureReason("FAILURE_REASON_CASH_HOLD_FAILED", 18, 18);
        FAILURE_REASON_EQUITY_POSITION_HOLD_FAILED = new AssetTransferFailureReason("FAILURE_REASON_EQUITY_POSITION_HOLD_FAILED", 19, 19);
        FAILURE_REASON_CANCELLED_BY_USER = new AssetTransferFailureReason("FAILURE_REASON_CANCELLED_BY_USER", 20, 20);
        FAILURE_REASON_CANCELLED_BY_MO_USER = new AssetTransferFailureReason("FAILURE_REASON_CANCELLED_BY_MO_USER", 21, 21);
        FAILURE_REASON_OTHER = new AssetTransferFailureReason("FAILURE_REASON_OTHER", 22, 22);
        FAILURE_REASON_NEGATIVE_TRANSFER_MARKET_VALUE = new AssetTransferFailureReason("FAILURE_REASON_NEGATIVE_TRANSFER_MARKET_VALUE", 23, 23);
        FAILURE_REASON_SOURCE_ACCOUNT_OPEN_FUTURES_POSITION = new AssetTransferFailureReason("FAILURE_REASON_SOURCE_ACCOUNT_OPEN_FUTURES_POSITION", 24, 24);
        FAILURE_REASON_TRANSFER_COUNT_CHECK_FAILED = new AssetTransferFailureReason("FAILURE_REASON_TRANSFER_COUNT_CHECK_FAILED", 25, 25);
        FAILURE_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED = new AssetTransferFailureReason("FAILURE_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED", 26, 28);
        FAILURE_REASON_INSTRUMENT_NOT_TRANSFERABLE = new AssetTransferFailureReason("FAILURE_REASON_INSTRUMENT_NOT_TRANSFERABLE", 27, 29);
        f7124x2d5e119c = new AssetTransferFailureReason("FAILURE_REASON_MANAGED_ACCOUNT_FUNDING_TRANSFER_VALUE_CHECK_FAILED", 28, 30);
        AssetTransferFailureReason[] assetTransferFailureReasonArr$values = $values();
        $VALUES = assetTransferFailureReasonArr$values;
        $ENTRIES = EnumEntries2.enumEntries(assetTransferFailureReasonArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AssetTransferFailureReason.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<AssetTransferFailureReason>(orCreateKotlinClass, syntax, assetTransferFailureReason) { // from class: nimbus.service.v1.AssetTransferFailureReason$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public AssetTransferFailureReason fromValue(int value) {
                return AssetTransferFailureReason.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: AssetTransferFailureReason.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lnimbus/service/v1/AssetTransferFailureReason$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lnimbus/service/v1/AssetTransferFailureReason;", "fromValue", "value", "", "nimbus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AssetTransferFailureReason fromValue(int value) {
            switch (value) {
                case 0:
                    return AssetTransferFailureReason.FAILURE_REASON_UNSPECIFIED;
                case 1:
                    return AssetTransferFailureReason.FAILURE_REASON_NONE;
                case 2:
                    return AssetTransferFailureReason.FAILURE_REASON_INSUFFICIENT_FUNDS_FOR_ACATS_CLAWBACK;
                case 3:
                    return AssetTransferFailureReason.FAILURE_REASON_SOURCE_ACCOUNT_DISABLED;
                case 4:
                    return AssetTransferFailureReason.FAILURE_REASON_DESTINATION_ACCOUNT_DISABLED;
                case 5:
                    return AssetTransferFailureReason.FAILURE_REASON_SOURCE_ACCOUNT_DEFICIT;
                case 6:
                    return AssetTransferFailureReason.FAILURE_REASON_DESTINATION_ACCOUNT_DEFICIT;
                case 7:
                    return AssetTransferFailureReason.FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_RESTRICTION;
                case 8:
                    return AssetTransferFailureReason.FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_RESTRICTION;
                case 9:
                    return AssetTransferFailureReason.FAILURE_REASON_SOURCE_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL;
                case 10:
                    return AssetTransferFailureReason.FAILURE_REASON_DESTINATION_ACCOUNT_ACTIVE_PAST_DUE_MARGIN_CALL;
                case 11:
                    return AssetTransferFailureReason.FAILURE_REASON_2K_MINIMUM_EQUITY_CHECK_FAILED;
                case 12:
                    return AssetTransferFailureReason.FAILURE_REASON_MAINTENANCE_EXCESS_CHECK_FAILED;
                case 13:
                    return AssetTransferFailureReason.FAILURE_REASON_BORROWING_LIMIT_CHECK_FAILED;
                case 14:
                    return AssetTransferFailureReason.FAILURE_REASON_TRANSFER_LIMIT_CHECK_FAILED;
                case 15:
                    return AssetTransferFailureReason.FAILURE_REASON_UNSETTLED_POSITIONS_CHECK_FAILED;
                case 16:
                    return AssetTransferFailureReason.FAILURE_REASON_CASH_HOLD_REJECTED;
                case 17:
                    return AssetTransferFailureReason.FAILURE_REASON_EQUITY_POSITION_HOLD_REJECTED;
                case 18:
                    return AssetTransferFailureReason.FAILURE_REASON_CASH_HOLD_FAILED;
                case 19:
                    return AssetTransferFailureReason.FAILURE_REASON_EQUITY_POSITION_HOLD_FAILED;
                case 20:
                    return AssetTransferFailureReason.FAILURE_REASON_CANCELLED_BY_USER;
                case 21:
                    return AssetTransferFailureReason.FAILURE_REASON_CANCELLED_BY_MO_USER;
                case 22:
                    return AssetTransferFailureReason.FAILURE_REASON_OTHER;
                case 23:
                    return AssetTransferFailureReason.FAILURE_REASON_NEGATIVE_TRANSFER_MARKET_VALUE;
                case 24:
                    return AssetTransferFailureReason.FAILURE_REASON_SOURCE_ACCOUNT_OPEN_FUTURES_POSITION;
                case 25:
                    return AssetTransferFailureReason.FAILURE_REASON_TRANSFER_COUNT_CHECK_FAILED;
                case 26:
                case 27:
                default:
                    return null;
                case 28:
                    return AssetTransferFailureReason.FAILURE_REASON_MANAGED_ACCOUNT_INSTRUMENT_NOT_ALLOWED;
                case 29:
                    return AssetTransferFailureReason.FAILURE_REASON_INSTRUMENT_NOT_TRANSFERABLE;
                case 30:
                    return AssetTransferFailureReason.f7124x2d5e119c;
            }
        }
    }

    public static AssetTransferFailureReason valueOf(String str) {
        return (AssetTransferFailureReason) Enum.valueOf(AssetTransferFailureReason.class, str);
    }

    public static AssetTransferFailureReason[] values() {
        return (AssetTransferFailureReason[]) $VALUES.clone();
    }
}
