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
/* compiled from: TransferFrequency.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lbff_money_movement/service/v1/TransferFrequency;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TRANSFER_FREQUENCY_UNSPECIFIED", "TRANSFER_FREQUENCY_ONCE", "TRANSFER_FREQUENCY_WEEKLY", "TRANSFER_FREQUENCY_BIWEEKLY", "TRANSFER_FREQUENCY_MONTHLY", "TRANSFER_FREQUENCY_QUARTERLY", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class TransferFrequency implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferFrequency[] $VALUES;

    @JvmField
    public static final ProtoAdapter<TransferFrequency> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TransferFrequency TRANSFER_FREQUENCY_BIWEEKLY;
    public static final TransferFrequency TRANSFER_FREQUENCY_MONTHLY;
    public static final TransferFrequency TRANSFER_FREQUENCY_ONCE;
    public static final TransferFrequency TRANSFER_FREQUENCY_QUARTERLY;
    public static final TransferFrequency TRANSFER_FREQUENCY_UNSPECIFIED;
    public static final TransferFrequency TRANSFER_FREQUENCY_WEEKLY;
    private final int value;

    private static final /* synthetic */ TransferFrequency[] $values() {
        return new TransferFrequency[]{TRANSFER_FREQUENCY_UNSPECIFIED, TRANSFER_FREQUENCY_ONCE, TRANSFER_FREQUENCY_WEEKLY, TRANSFER_FREQUENCY_BIWEEKLY, TRANSFER_FREQUENCY_MONTHLY, TRANSFER_FREQUENCY_QUARTERLY};
    }

    @JvmStatic
    public static final TransferFrequency fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<TransferFrequency> getEntries() {
        return $ENTRIES;
    }

    private TransferFrequency(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final TransferFrequency transferFrequency = new TransferFrequency("TRANSFER_FREQUENCY_UNSPECIFIED", 0, 0);
        TRANSFER_FREQUENCY_UNSPECIFIED = transferFrequency;
        TRANSFER_FREQUENCY_ONCE = new TransferFrequency("TRANSFER_FREQUENCY_ONCE", 1, 1);
        TRANSFER_FREQUENCY_WEEKLY = new TransferFrequency("TRANSFER_FREQUENCY_WEEKLY", 2, 2);
        TRANSFER_FREQUENCY_BIWEEKLY = new TransferFrequency("TRANSFER_FREQUENCY_BIWEEKLY", 3, 3);
        TRANSFER_FREQUENCY_MONTHLY = new TransferFrequency("TRANSFER_FREQUENCY_MONTHLY", 4, 4);
        TRANSFER_FREQUENCY_QUARTERLY = new TransferFrequency("TRANSFER_FREQUENCY_QUARTERLY", 5, 5);
        TransferFrequency[] transferFrequencyArr$values = $values();
        $VALUES = transferFrequencyArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferFrequencyArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TransferFrequency.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<TransferFrequency>(orCreateKotlinClass, syntax, transferFrequency) { // from class: bff_money_movement.service.v1.TransferFrequency$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public TransferFrequency fromValue(int value) {
                return TransferFrequency.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: TransferFrequency.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbff_money_movement/service/v1/TransferFrequency$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbff_money_movement/service/v1/TransferFrequency;", "fromValue", "value", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TransferFrequency fromValue(int value) {
            if (value == 0) {
                return TransferFrequency.TRANSFER_FREQUENCY_UNSPECIFIED;
            }
            if (value == 1) {
                return TransferFrequency.TRANSFER_FREQUENCY_ONCE;
            }
            if (value == 2) {
                return TransferFrequency.TRANSFER_FREQUENCY_WEEKLY;
            }
            if (value == 3) {
                return TransferFrequency.TRANSFER_FREQUENCY_BIWEEKLY;
            }
            if (value == 4) {
                return TransferFrequency.TRANSFER_FREQUENCY_MONTHLY;
            }
            if (value != 5) {
                return null;
            }
            return TransferFrequency.TRANSFER_FREQUENCY_QUARTERLY;
        }
    }

    public static TransferFrequency valueOf(String str) {
        return (TransferFrequency) Enum.valueOf(TransferFrequency.class, str);
    }

    public static TransferFrequency[] values() {
        return (TransferFrequency[]) $VALUES.clone();
    }
}
