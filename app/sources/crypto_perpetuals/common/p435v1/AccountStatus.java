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
/* compiled from: AccountStatus.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/AccountStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ACCOUNT_STATUS_UNSPECIFIED", "ACCOUNT_STATUS_ACTIVE", "ACCOUNT_STATUS_INACTIVE", "ACCOUNT_STATUS_POSITION_REDUCING_ONLY", "ACCOUNT_STATUS_PENDING_APPROVAL", "ACCOUNT_STATUS_ACCOUNT_NOT_FOUND", "Companion", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class AccountStatus implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountStatus[] $VALUES;
    public static final AccountStatus ACCOUNT_STATUS_ACCOUNT_NOT_FOUND;
    public static final AccountStatus ACCOUNT_STATUS_ACTIVE;
    public static final AccountStatus ACCOUNT_STATUS_INACTIVE;
    public static final AccountStatus ACCOUNT_STATUS_PENDING_APPROVAL;
    public static final AccountStatus ACCOUNT_STATUS_POSITION_REDUCING_ONLY;
    public static final AccountStatus ACCOUNT_STATUS_UNSPECIFIED;

    @JvmField
    public static final ProtoAdapter<AccountStatus> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ AccountStatus[] $values() {
        return new AccountStatus[]{ACCOUNT_STATUS_UNSPECIFIED, ACCOUNT_STATUS_ACTIVE, ACCOUNT_STATUS_INACTIVE, ACCOUNT_STATUS_POSITION_REDUCING_ONLY, ACCOUNT_STATUS_PENDING_APPROVAL, ACCOUNT_STATUS_ACCOUNT_NOT_FOUND};
    }

    @JvmStatic
    public static final AccountStatus fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<AccountStatus> getEntries() {
        return $ENTRIES;
    }

    private AccountStatus(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final AccountStatus accountStatus = new AccountStatus("ACCOUNT_STATUS_UNSPECIFIED", 0, 0);
        ACCOUNT_STATUS_UNSPECIFIED = accountStatus;
        ACCOUNT_STATUS_ACTIVE = new AccountStatus("ACCOUNT_STATUS_ACTIVE", 1, 1);
        ACCOUNT_STATUS_INACTIVE = new AccountStatus("ACCOUNT_STATUS_INACTIVE", 2, 2);
        ACCOUNT_STATUS_POSITION_REDUCING_ONLY = new AccountStatus("ACCOUNT_STATUS_POSITION_REDUCING_ONLY", 3, 3);
        ACCOUNT_STATUS_PENDING_APPROVAL = new AccountStatus("ACCOUNT_STATUS_PENDING_APPROVAL", 4, 4);
        ACCOUNT_STATUS_ACCOUNT_NOT_FOUND = new AccountStatus("ACCOUNT_STATUS_ACCOUNT_NOT_FOUND", 5, 5);
        AccountStatus[] accountStatusArr$values = $values();
        $VALUES = accountStatusArr$values;
        $ENTRIES = EnumEntries2.enumEntries(accountStatusArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountStatus.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<AccountStatus>(orCreateKotlinClass, syntax, accountStatus) { // from class: crypto_perpetuals.common.v1.AccountStatus$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public AccountStatus fromValue(int value) {
                return AccountStatus.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: AccountStatus.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/AccountStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcrypto_perpetuals/common/v1/AccountStatus;", "fromValue", "value", "", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountStatus fromValue(int value) {
            if (value == 0) {
                return AccountStatus.ACCOUNT_STATUS_UNSPECIFIED;
            }
            if (value == 1) {
                return AccountStatus.ACCOUNT_STATUS_ACTIVE;
            }
            if (value == 2) {
                return AccountStatus.ACCOUNT_STATUS_INACTIVE;
            }
            if (value == 3) {
                return AccountStatus.ACCOUNT_STATUS_POSITION_REDUCING_ONLY;
            }
            if (value == 4) {
                return AccountStatus.ACCOUNT_STATUS_PENDING_APPROVAL;
            }
            if (value != 5) {
                return null;
            }
            return AccountStatus.ACCOUNT_STATUS_ACCOUNT_NOT_FOUND;
        }
    }

    public static AccountStatus valueOf(String str) {
        return (AccountStatus) Enum.valueOf(AccountStatus.class, str);
    }

    public static AccountStatus[] values() {
        return (AccountStatus[]) $VALUES.clone();
    }
}
