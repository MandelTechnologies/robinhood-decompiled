package bff_money_movement.service.p019v1;

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
/* compiled from: DepositScheduleState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lbff_money_movement/service/v1/DepositScheduleState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "DEPOSIT_SCHEDULE_STATE_UNSPECIFIED", "DEPOSIT_SCHEDULE_STATE_ACTIVE", "DEPOSIT_SCHEDULE_STATE_CANCELED", "DEPOSIT_SCHEDULE_STATE_PAUSED", "DEPOSIT_SCHEDULE_STATE_FAILED", "DEPOSIT_SCHEDULE_STATE_EXPIRED", "DEPOSIT_SCHEDULE_STATE_EXPIRED_BAD_CONNECTION", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class DepositScheduleState implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DepositScheduleState[] $VALUES;

    @JvmField
    public static final ProtoAdapter<DepositScheduleState> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final DepositScheduleState DEPOSIT_SCHEDULE_STATE_ACTIVE;
    public static final DepositScheduleState DEPOSIT_SCHEDULE_STATE_CANCELED;
    public static final DepositScheduleState DEPOSIT_SCHEDULE_STATE_EXPIRED;
    public static final DepositScheduleState DEPOSIT_SCHEDULE_STATE_EXPIRED_BAD_CONNECTION;
    public static final DepositScheduleState DEPOSIT_SCHEDULE_STATE_FAILED;
    public static final DepositScheduleState DEPOSIT_SCHEDULE_STATE_PAUSED;
    public static final DepositScheduleState DEPOSIT_SCHEDULE_STATE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ DepositScheduleState[] $values() {
        return new DepositScheduleState[]{DEPOSIT_SCHEDULE_STATE_UNSPECIFIED, DEPOSIT_SCHEDULE_STATE_ACTIVE, DEPOSIT_SCHEDULE_STATE_CANCELED, DEPOSIT_SCHEDULE_STATE_PAUSED, DEPOSIT_SCHEDULE_STATE_FAILED, DEPOSIT_SCHEDULE_STATE_EXPIRED, DEPOSIT_SCHEDULE_STATE_EXPIRED_BAD_CONNECTION};
    }

    @JvmStatic
    public static final DepositScheduleState fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<DepositScheduleState> getEntries() {
        return $ENTRIES;
    }

    private DepositScheduleState(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final DepositScheduleState depositScheduleState = new DepositScheduleState("DEPOSIT_SCHEDULE_STATE_UNSPECIFIED", 0, 0);
        DEPOSIT_SCHEDULE_STATE_UNSPECIFIED = depositScheduleState;
        DEPOSIT_SCHEDULE_STATE_ACTIVE = new DepositScheduleState("DEPOSIT_SCHEDULE_STATE_ACTIVE", 1, 1);
        DEPOSIT_SCHEDULE_STATE_CANCELED = new DepositScheduleState("DEPOSIT_SCHEDULE_STATE_CANCELED", 2, 2);
        DEPOSIT_SCHEDULE_STATE_PAUSED = new DepositScheduleState("DEPOSIT_SCHEDULE_STATE_PAUSED", 3, 3);
        DEPOSIT_SCHEDULE_STATE_FAILED = new DepositScheduleState("DEPOSIT_SCHEDULE_STATE_FAILED", 4, 4);
        DEPOSIT_SCHEDULE_STATE_EXPIRED = new DepositScheduleState("DEPOSIT_SCHEDULE_STATE_EXPIRED", 5, 5);
        DEPOSIT_SCHEDULE_STATE_EXPIRED_BAD_CONNECTION = new DepositScheduleState("DEPOSIT_SCHEDULE_STATE_EXPIRED_BAD_CONNECTION", 6, 7);
        DepositScheduleState[] depositScheduleStateArr$values = $values();
        $VALUES = depositScheduleStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(depositScheduleStateArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DepositScheduleState.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<DepositScheduleState>(orCreateKotlinClass, syntax, depositScheduleState) { // from class: bff_money_movement.service.v1.DepositScheduleState$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public DepositScheduleState fromValue(int value) {
                return DepositScheduleState.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: DepositScheduleState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbff_money_movement/service/v1/DepositScheduleState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbff_money_movement/service/v1/DepositScheduleState;", "fromValue", "value", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final DepositScheduleState fromValue(int value) {
            if (value == 0) {
                return DepositScheduleState.DEPOSIT_SCHEDULE_STATE_UNSPECIFIED;
            }
            if (value == 1) {
                return DepositScheduleState.DEPOSIT_SCHEDULE_STATE_ACTIVE;
            }
            if (value == 2) {
                return DepositScheduleState.DEPOSIT_SCHEDULE_STATE_CANCELED;
            }
            if (value == 3) {
                return DepositScheduleState.DEPOSIT_SCHEDULE_STATE_PAUSED;
            }
            if (value == 4) {
                return DepositScheduleState.DEPOSIT_SCHEDULE_STATE_FAILED;
            }
            if (value == 5) {
                return DepositScheduleState.DEPOSIT_SCHEDULE_STATE_EXPIRED;
            }
            if (value != 7) {
                return null;
            }
            return DepositScheduleState.DEPOSIT_SCHEDULE_STATE_EXPIRED_BAD_CONNECTION;
        }
    }

    public static DepositScheduleState valueOf(String str) {
        return (DepositScheduleState) Enum.valueOf(DepositScheduleState.class, str);
    }

    public static DepositScheduleState[] values() {
        return (DepositScheduleState[]) $VALUES.clone();
    }
}
