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
/* compiled from: TransferActionType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m3636d2 = {"Lbff_money_movement/service/v1/TransferActionType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TRANSFER_ACTION_TYPE_UNSPECIFIED", "TRANSFER_ACTION_TYPE_DISMISS", "TRANSFER_ACTION_TYPE_CONTINUE", "TRANSFER_ACTION_TYPE_EDIT_AMOUNT", "TRANSFER_ACTION_TYPE_DEEPLINK", "TRANSFER_ACTION_TYPE_SEND_INCOMING_WIRE", "TRANSFER_ACTION_TYPE_SHOW_LIMIT_HUB", "TRANSFER_ACTION_TYPE_WITHDRAW_FULL_BALANCE", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class TransferActionType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferActionType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<TransferActionType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TransferActionType TRANSFER_ACTION_TYPE_CONTINUE;
    public static final TransferActionType TRANSFER_ACTION_TYPE_DEEPLINK;
    public static final TransferActionType TRANSFER_ACTION_TYPE_DISMISS;
    public static final TransferActionType TRANSFER_ACTION_TYPE_EDIT_AMOUNT;
    public static final TransferActionType TRANSFER_ACTION_TYPE_SEND_INCOMING_WIRE;
    public static final TransferActionType TRANSFER_ACTION_TYPE_SHOW_LIMIT_HUB;
    public static final TransferActionType TRANSFER_ACTION_TYPE_UNSPECIFIED;
    public static final TransferActionType TRANSFER_ACTION_TYPE_WITHDRAW_FULL_BALANCE;
    private final int value;

    private static final /* synthetic */ TransferActionType[] $values() {
        return new TransferActionType[]{TRANSFER_ACTION_TYPE_UNSPECIFIED, TRANSFER_ACTION_TYPE_DISMISS, TRANSFER_ACTION_TYPE_CONTINUE, TRANSFER_ACTION_TYPE_EDIT_AMOUNT, TRANSFER_ACTION_TYPE_DEEPLINK, TRANSFER_ACTION_TYPE_SEND_INCOMING_WIRE, TRANSFER_ACTION_TYPE_SHOW_LIMIT_HUB, TRANSFER_ACTION_TYPE_WITHDRAW_FULL_BALANCE};
    }

    @JvmStatic
    public static final TransferActionType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<TransferActionType> getEntries() {
        return $ENTRIES;
    }

    private TransferActionType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final TransferActionType transferActionType = new TransferActionType("TRANSFER_ACTION_TYPE_UNSPECIFIED", 0, 0);
        TRANSFER_ACTION_TYPE_UNSPECIFIED = transferActionType;
        TRANSFER_ACTION_TYPE_DISMISS = new TransferActionType("TRANSFER_ACTION_TYPE_DISMISS", 1, 1);
        TRANSFER_ACTION_TYPE_CONTINUE = new TransferActionType("TRANSFER_ACTION_TYPE_CONTINUE", 2, 2);
        TRANSFER_ACTION_TYPE_EDIT_AMOUNT = new TransferActionType("TRANSFER_ACTION_TYPE_EDIT_AMOUNT", 3, 3);
        TRANSFER_ACTION_TYPE_DEEPLINK = new TransferActionType("TRANSFER_ACTION_TYPE_DEEPLINK", 4, 4);
        TRANSFER_ACTION_TYPE_SEND_INCOMING_WIRE = new TransferActionType("TRANSFER_ACTION_TYPE_SEND_INCOMING_WIRE", 5, 5);
        TRANSFER_ACTION_TYPE_SHOW_LIMIT_HUB = new TransferActionType("TRANSFER_ACTION_TYPE_SHOW_LIMIT_HUB", 6, 6);
        TRANSFER_ACTION_TYPE_WITHDRAW_FULL_BALANCE = new TransferActionType("TRANSFER_ACTION_TYPE_WITHDRAW_FULL_BALANCE", 7, 7);
        TransferActionType[] transferActionTypeArr$values = $values();
        $VALUES = transferActionTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferActionTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TransferActionType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<TransferActionType>(orCreateKotlinClass, syntax, transferActionType) { // from class: bff_money_movement.service.v1.TransferActionType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public TransferActionType fromValue(int value) {
                return TransferActionType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: TransferActionType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbff_money_movement/service/v1/TransferActionType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbff_money_movement/service/v1/TransferActionType;", "fromValue", "value", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TransferActionType fromValue(int value) {
            switch (value) {
                case 0:
                    return TransferActionType.TRANSFER_ACTION_TYPE_UNSPECIFIED;
                case 1:
                    return TransferActionType.TRANSFER_ACTION_TYPE_DISMISS;
                case 2:
                    return TransferActionType.TRANSFER_ACTION_TYPE_CONTINUE;
                case 3:
                    return TransferActionType.TRANSFER_ACTION_TYPE_EDIT_AMOUNT;
                case 4:
                    return TransferActionType.TRANSFER_ACTION_TYPE_DEEPLINK;
                case 5:
                    return TransferActionType.TRANSFER_ACTION_TYPE_SEND_INCOMING_WIRE;
                case 6:
                    return TransferActionType.TRANSFER_ACTION_TYPE_SHOW_LIMIT_HUB;
                case 7:
                    return TransferActionType.TRANSFER_ACTION_TYPE_WITHDRAW_FULL_BALANCE;
                default:
                    return null;
            }
        }
    }

    public static TransferActionType valueOf(String str) {
        return (TransferActionType) Enum.valueOf(TransferActionType.class, str);
    }

    public static TransferActionType[] values() {
        return (TransferActionType[]) $VALUES.clone();
    }
}
