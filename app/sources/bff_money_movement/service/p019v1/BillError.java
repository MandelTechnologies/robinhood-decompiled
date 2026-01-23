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
/* compiled from: BillError.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lbff_money_movement/service/v1/BillError;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BILL_ERROR_UNSPECIFIED", "BILL_ERROR_UNKNOWN", "BILL_ERROR_FAILED_DEPOSIT", "BILL_ERROR_FAILED_ORDER", "BILL_ERROR_CRYPTO_FEE_UNAVAILABLE", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class BillError implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BillError[] $VALUES;

    @JvmField
    public static final ProtoAdapter<BillError> ADAPTER;
    public static final BillError BILL_ERROR_CRYPTO_FEE_UNAVAILABLE;
    public static final BillError BILL_ERROR_FAILED_DEPOSIT;
    public static final BillError BILL_ERROR_FAILED_ORDER;
    public static final BillError BILL_ERROR_UNKNOWN;
    public static final BillError BILL_ERROR_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ BillError[] $values() {
        return new BillError[]{BILL_ERROR_UNSPECIFIED, BILL_ERROR_UNKNOWN, BILL_ERROR_FAILED_DEPOSIT, BILL_ERROR_FAILED_ORDER, BILL_ERROR_CRYPTO_FEE_UNAVAILABLE};
    }

    @JvmStatic
    public static final BillError fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<BillError> getEntries() {
        return $ENTRIES;
    }

    private BillError(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final BillError billError = new BillError("BILL_ERROR_UNSPECIFIED", 0, 0);
        BILL_ERROR_UNSPECIFIED = billError;
        BILL_ERROR_UNKNOWN = new BillError("BILL_ERROR_UNKNOWN", 1, 1);
        BILL_ERROR_FAILED_DEPOSIT = new BillError("BILL_ERROR_FAILED_DEPOSIT", 2, 2);
        BILL_ERROR_FAILED_ORDER = new BillError("BILL_ERROR_FAILED_ORDER", 3, 3);
        BILL_ERROR_CRYPTO_FEE_UNAVAILABLE = new BillError("BILL_ERROR_CRYPTO_FEE_UNAVAILABLE", 4, 4);
        BillError[] billErrorArr$values = $values();
        $VALUES = billErrorArr$values;
        $ENTRIES = EnumEntries2.enumEntries(billErrorArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BillError.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<BillError>(orCreateKotlinClass, syntax, billError) { // from class: bff_money_movement.service.v1.BillError$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public BillError fromValue(int value) {
                return BillError.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: BillError.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbff_money_movement/service/v1/BillError$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbff_money_movement/service/v1/BillError;", "fromValue", "value", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BillError fromValue(int value) {
            if (value == 0) {
                return BillError.BILL_ERROR_UNSPECIFIED;
            }
            if (value == 1) {
                return BillError.BILL_ERROR_UNKNOWN;
            }
            if (value == 2) {
                return BillError.BILL_ERROR_FAILED_DEPOSIT;
            }
            if (value == 3) {
                return BillError.BILL_ERROR_FAILED_ORDER;
            }
            if (value != 4) {
                return null;
            }
            return BillError.BILL_ERROR_CRYPTO_FEE_UNAVAILABLE;
        }
    }

    public static BillError valueOf(String str) {
        return (BillError) Enum.valueOf(BillError.class, str);
    }

    public static BillError[] values() {
        return (BillError[]) $VALUES.clone();
    }
}
