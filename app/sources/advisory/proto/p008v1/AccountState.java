package advisory.proto.p008v1;

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
/* compiled from: AccountState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m3636d2 = {"Ladvisory/proto/v1/AccountState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STATE_UNSPECIFIED", "UNFUNDED", "UNFUNDED_PENDING_DEPOSIT", "FUNDED", "FUNDED_PENDING_INVESTMENT", "INVESTED_PENDING_RETURNS", "INVESTED_RETURNS_AVAILABLE", "CLOSED", "Companion", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class AccountState implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountState[] $VALUES;

    @JvmField
    public static final ProtoAdapter<AccountState> ADAPTER;
    public static final AccountState CLOSED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final AccountState FUNDED;
    public static final AccountState FUNDED_PENDING_INVESTMENT;
    public static final AccountState INVESTED_PENDING_RETURNS;
    public static final AccountState INVESTED_RETURNS_AVAILABLE;
    public static final AccountState STATE_UNSPECIFIED;
    public static final AccountState UNFUNDED;
    public static final AccountState UNFUNDED_PENDING_DEPOSIT;
    private final int value;

    private static final /* synthetic */ AccountState[] $values() {
        return new AccountState[]{STATE_UNSPECIFIED, UNFUNDED, UNFUNDED_PENDING_DEPOSIT, FUNDED, FUNDED_PENDING_INVESTMENT, INVESTED_PENDING_RETURNS, INVESTED_RETURNS_AVAILABLE, CLOSED};
    }

    @JvmStatic
    public static final AccountState fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<AccountState> getEntries() {
        return $ENTRIES;
    }

    private AccountState(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final AccountState accountState = new AccountState("STATE_UNSPECIFIED", 0, 0);
        STATE_UNSPECIFIED = accountState;
        UNFUNDED = new AccountState("UNFUNDED", 1, 1);
        UNFUNDED_PENDING_DEPOSIT = new AccountState("UNFUNDED_PENDING_DEPOSIT", 2, 2);
        FUNDED = new AccountState("FUNDED", 3, 3);
        FUNDED_PENDING_INVESTMENT = new AccountState("FUNDED_PENDING_INVESTMENT", 4, 4);
        INVESTED_PENDING_RETURNS = new AccountState("INVESTED_PENDING_RETURNS", 5, 5);
        INVESTED_RETURNS_AVAILABLE = new AccountState("INVESTED_RETURNS_AVAILABLE", 6, 6);
        CLOSED = new AccountState("CLOSED", 7, 7);
        AccountState[] accountStateArr$values = $values();
        $VALUES = accountStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(accountStateArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountState.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<AccountState>(orCreateKotlinClass, syntax, accountState) { // from class: advisory.proto.v1.AccountState$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public AccountState fromValue(int value) {
                return AccountState.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: AccountState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Ladvisory/proto/v1/AccountState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Ladvisory/proto/v1/AccountState;", "fromValue", "value", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountState fromValue(int value) {
            switch (value) {
                case 0:
                    return AccountState.STATE_UNSPECIFIED;
                case 1:
                    return AccountState.UNFUNDED;
                case 2:
                    return AccountState.UNFUNDED_PENDING_DEPOSIT;
                case 3:
                    return AccountState.FUNDED;
                case 4:
                    return AccountState.FUNDED_PENDING_INVESTMENT;
                case 5:
                    return AccountState.INVESTED_PENDING_RETURNS;
                case 6:
                    return AccountState.INVESTED_RETURNS_AVAILABLE;
                case 7:
                    return AccountState.CLOSED;
                default:
                    return null;
            }
        }
    }

    public static AccountState valueOf(String str) {
        return (AccountState) Enum.valueOf(AccountState.class, str);
    }

    public static AccountState[] values() {
        return (AccountState[]) $VALUES.clone();
    }
}
