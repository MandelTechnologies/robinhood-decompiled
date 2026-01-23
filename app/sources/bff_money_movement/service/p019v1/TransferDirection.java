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
/* compiled from: TransferDirection.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lbff_money_movement/service/v1/TransferDirection;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TRANSFER_DIRECTION_UNSPECIFIED", "TRANSFER_DIRECTION_DEPOSIT", "TRANSFER_DIRECTION_WITHDRAWAL", "TRANSFER_DIRECTION_INTERNAL", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class TransferDirection implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferDirection[] $VALUES;

    @JvmField
    public static final ProtoAdapter<TransferDirection> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TransferDirection TRANSFER_DIRECTION_DEPOSIT;
    public static final TransferDirection TRANSFER_DIRECTION_INTERNAL;
    public static final TransferDirection TRANSFER_DIRECTION_UNSPECIFIED;
    public static final TransferDirection TRANSFER_DIRECTION_WITHDRAWAL;
    private final int value;

    private static final /* synthetic */ TransferDirection[] $values() {
        return new TransferDirection[]{TRANSFER_DIRECTION_UNSPECIFIED, TRANSFER_DIRECTION_DEPOSIT, TRANSFER_DIRECTION_WITHDRAWAL, TRANSFER_DIRECTION_INTERNAL};
    }

    @JvmStatic
    public static final TransferDirection fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<TransferDirection> getEntries() {
        return $ENTRIES;
    }

    private TransferDirection(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final TransferDirection transferDirection = new TransferDirection("TRANSFER_DIRECTION_UNSPECIFIED", 0, 0);
        TRANSFER_DIRECTION_UNSPECIFIED = transferDirection;
        TRANSFER_DIRECTION_DEPOSIT = new TransferDirection("TRANSFER_DIRECTION_DEPOSIT", 1, 1);
        TRANSFER_DIRECTION_WITHDRAWAL = new TransferDirection("TRANSFER_DIRECTION_WITHDRAWAL", 2, 2);
        TRANSFER_DIRECTION_INTERNAL = new TransferDirection("TRANSFER_DIRECTION_INTERNAL", 3, 3);
        TransferDirection[] transferDirectionArr$values = $values();
        $VALUES = transferDirectionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferDirectionArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TransferDirection.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<TransferDirection>(orCreateKotlinClass, syntax, transferDirection) { // from class: bff_money_movement.service.v1.TransferDirection$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public TransferDirection fromValue(int value) {
                return TransferDirection.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: TransferDirection.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbff_money_movement/service/v1/TransferDirection$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbff_money_movement/service/v1/TransferDirection;", "fromValue", "value", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TransferDirection fromValue(int value) {
            if (value == 0) {
                return TransferDirection.TRANSFER_DIRECTION_UNSPECIFIED;
            }
            if (value == 1) {
                return TransferDirection.TRANSFER_DIRECTION_DEPOSIT;
            }
            if (value == 2) {
                return TransferDirection.TRANSFER_DIRECTION_WITHDRAWAL;
            }
            if (value != 3) {
                return null;
            }
            return TransferDirection.TRANSFER_DIRECTION_INTERNAL;
        }
    }

    public static TransferDirection valueOf(String str) {
        return (TransferDirection) Enum.valueOf(TransferDirection.class, str);
    }

    public static TransferDirection[] values() {
        return (TransferDirection[]) $VALUES.clone();
    }
}
