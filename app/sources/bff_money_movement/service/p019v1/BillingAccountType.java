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
/* compiled from: BillingAccountType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lbff_money_movement/service/v1/BillingAccountType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BILLING_ACCOUNT_TYPE_UNSPECIFIED", "BILLING_ACCOUNT_TYPE_CRYPTO_BUYING_POWER", "BILLING_ACCOUNT_TYPE_BANK_ACCOUNT", "BILLING_ACCOUNT_TYPE_DEBIT_CARD", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class BillingAccountType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BillingAccountType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<BillingAccountType> ADAPTER;
    public static final BillingAccountType BILLING_ACCOUNT_TYPE_BANK_ACCOUNT;
    public static final BillingAccountType BILLING_ACCOUNT_TYPE_CRYPTO_BUYING_POWER;
    public static final BillingAccountType BILLING_ACCOUNT_TYPE_DEBIT_CARD;
    public static final BillingAccountType BILLING_ACCOUNT_TYPE_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ BillingAccountType[] $values() {
        return new BillingAccountType[]{BILLING_ACCOUNT_TYPE_UNSPECIFIED, BILLING_ACCOUNT_TYPE_CRYPTO_BUYING_POWER, BILLING_ACCOUNT_TYPE_BANK_ACCOUNT, BILLING_ACCOUNT_TYPE_DEBIT_CARD};
    }

    @JvmStatic
    public static final BillingAccountType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<BillingAccountType> getEntries() {
        return $ENTRIES;
    }

    private BillingAccountType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final BillingAccountType billingAccountType = new BillingAccountType("BILLING_ACCOUNT_TYPE_UNSPECIFIED", 0, 0);
        BILLING_ACCOUNT_TYPE_UNSPECIFIED = billingAccountType;
        BILLING_ACCOUNT_TYPE_CRYPTO_BUYING_POWER = new BillingAccountType("BILLING_ACCOUNT_TYPE_CRYPTO_BUYING_POWER", 1, 1);
        BILLING_ACCOUNT_TYPE_BANK_ACCOUNT = new BillingAccountType("BILLING_ACCOUNT_TYPE_BANK_ACCOUNT", 2, 2);
        BILLING_ACCOUNT_TYPE_DEBIT_CARD = new BillingAccountType("BILLING_ACCOUNT_TYPE_DEBIT_CARD", 3, 3);
        BillingAccountType[] billingAccountTypeArr$values = $values();
        $VALUES = billingAccountTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(billingAccountTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BillingAccountType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<BillingAccountType>(orCreateKotlinClass, syntax, billingAccountType) { // from class: bff_money_movement.service.v1.BillingAccountType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public BillingAccountType fromValue(int value) {
                return BillingAccountType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: BillingAccountType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbff_money_movement/service/v1/BillingAccountType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbff_money_movement/service/v1/BillingAccountType;", "fromValue", "value", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BillingAccountType fromValue(int value) {
            if (value == 0) {
                return BillingAccountType.BILLING_ACCOUNT_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return BillingAccountType.BILLING_ACCOUNT_TYPE_CRYPTO_BUYING_POWER;
            }
            if (value == 2) {
                return BillingAccountType.BILLING_ACCOUNT_TYPE_BANK_ACCOUNT;
            }
            if (value != 3) {
                return null;
            }
            return BillingAccountType.BILLING_ACCOUNT_TYPE_DEBIT_CARD;
        }
    }

    public static BillingAccountType valueOf(String str) {
        return (BillingAccountType) Enum.valueOf(BillingAccountType.class, str);
    }

    public static BillingAccountType[] values() {
        return (BillingAccountType[]) $VALUES.clone();
    }
}
