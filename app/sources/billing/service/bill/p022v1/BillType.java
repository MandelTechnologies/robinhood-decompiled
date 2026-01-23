package billing.service.bill.p022v1;

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
/* compiled from: BillType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lbilling/service/bill/v1/BillType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BILL_TYPE_UNSPECIFIED", "BILL_TYPE_CRYPTO", "BILL_TYPE_GOLD", "BILL_TYPE_CUSTODIAL_STOCK_GIFT", "BILL_TYPE_CUSTODIAL_CASH_GIFT", "Companion", "billing.bill_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class BillType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BillType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<BillType> ADAPTER;
    public static final BillType BILL_TYPE_CRYPTO;
    public static final BillType BILL_TYPE_CUSTODIAL_CASH_GIFT;
    public static final BillType BILL_TYPE_CUSTODIAL_STOCK_GIFT;
    public static final BillType BILL_TYPE_GOLD;
    public static final BillType BILL_TYPE_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ BillType[] $values() {
        return new BillType[]{BILL_TYPE_UNSPECIFIED, BILL_TYPE_CRYPTO, BILL_TYPE_GOLD, BILL_TYPE_CUSTODIAL_STOCK_GIFT, BILL_TYPE_CUSTODIAL_CASH_GIFT};
    }

    @JvmStatic
    public static final BillType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<BillType> getEntries() {
        return $ENTRIES;
    }

    private BillType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final BillType billType = new BillType("BILL_TYPE_UNSPECIFIED", 0, 0);
        BILL_TYPE_UNSPECIFIED = billType;
        BILL_TYPE_CRYPTO = new BillType("BILL_TYPE_CRYPTO", 1, 1);
        BILL_TYPE_GOLD = new BillType("BILL_TYPE_GOLD", 2, 2);
        BILL_TYPE_CUSTODIAL_STOCK_GIFT = new BillType("BILL_TYPE_CUSTODIAL_STOCK_GIFT", 3, 3);
        BILL_TYPE_CUSTODIAL_CASH_GIFT = new BillType("BILL_TYPE_CUSTODIAL_CASH_GIFT", 4, 4);
        BillType[] billTypeArr$values = $values();
        $VALUES = billTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(billTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BillType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<BillType>(orCreateKotlinClass, syntax, billType) { // from class: billing.service.bill.v1.BillType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public BillType fromValue(int value) {
                return BillType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: BillType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbilling/service/bill/v1/BillType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbilling/service/bill/v1/BillType;", "fromValue", "value", "", "billing.bill_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BillType fromValue(int value) {
            if (value == 0) {
                return BillType.BILL_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return BillType.BILL_TYPE_CRYPTO;
            }
            if (value == 2) {
                return BillType.BILL_TYPE_GOLD;
            }
            if (value == 3) {
                return BillType.BILL_TYPE_CUSTODIAL_STOCK_GIFT;
            }
            if (value != 4) {
                return null;
            }
            return BillType.BILL_TYPE_CUSTODIAL_CASH_GIFT;
        }
    }

    public static BillType valueOf(String str) {
        return (BillType) Enum.valueOf(BillType.class, str);
    }

    public static BillType[] values() {
        return (BillType[]) $VALUES.clone();
    }
}
