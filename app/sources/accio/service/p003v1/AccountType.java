package accio.service.p003v1;

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
/* compiled from: AccountType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Laccio/service/v1/AccountType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ACCOUNT_TYPE_UNSPECIFIED", "DEPOSITORY", "INVESTMENT", "CREDIT", "LOAN", "OTHER", "Companion", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class AccountType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountType[] $VALUES;
    public static final AccountType ACCOUNT_TYPE_UNSPECIFIED;

    @JvmField
    public static final ProtoAdapter<AccountType> ADAPTER;
    public static final AccountType CREDIT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final AccountType DEPOSITORY;
    public static final AccountType INVESTMENT;
    public static final AccountType LOAN;
    public static final AccountType OTHER;
    private final int value;

    private static final /* synthetic */ AccountType[] $values() {
        return new AccountType[]{ACCOUNT_TYPE_UNSPECIFIED, DEPOSITORY, INVESTMENT, CREDIT, LOAN, OTHER};
    }

    @JvmStatic
    public static final AccountType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<AccountType> getEntries() {
        return $ENTRIES;
    }

    private AccountType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final AccountType accountType = new AccountType("ACCOUNT_TYPE_UNSPECIFIED", 0, 0);
        ACCOUNT_TYPE_UNSPECIFIED = accountType;
        DEPOSITORY = new AccountType("DEPOSITORY", 1, 1);
        INVESTMENT = new AccountType("INVESTMENT", 2, 2);
        CREDIT = new AccountType("CREDIT", 3, 3);
        LOAN = new AccountType("LOAN", 4, 4);
        OTHER = new AccountType("OTHER", 5, 5);
        AccountType[] accountTypeArr$values = $values();
        $VALUES = accountTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(accountTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<AccountType>(orCreateKotlinClass, syntax, accountType) { // from class: accio.service.v1.AccountType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public AccountType fromValue(int value) {
                return AccountType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: AccountType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Laccio/service/v1/AccountType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Laccio/service/v1/AccountType;", "fromValue", "value", "", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountType fromValue(int value) {
            if (value == 0) {
                return AccountType.ACCOUNT_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return AccountType.DEPOSITORY;
            }
            if (value == 2) {
                return AccountType.INVESTMENT;
            }
            if (value == 3) {
                return AccountType.CREDIT;
            }
            if (value == 4) {
                return AccountType.LOAN;
            }
            if (value != 5) {
                return null;
            }
            return AccountType.OTHER;
        }
    }

    public static AccountType valueOf(String str) {
        return (AccountType) Enum.valueOf(AccountType.class, str);
    }

    public static AccountType[] values() {
        return (AccountType[]) $VALUES.clone();
    }
}
