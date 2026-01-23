package com.robinhood.ceres.p284v1;

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
/* compiled from: AccountFuturesEligibilityStatus.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/ceres/v1/AccountFuturesEligibilityStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ACCOUNT_FUTURES_ELIGIBILITY_STATUS_UNSPECIFIED", "ELIGIBLE", "INELIGIBLE", "ALREADY_HAS_ACCOUNT", "IN_MANUAL_REVIEW", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class AccountFuturesEligibilityStatus implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountFuturesEligibilityStatus[] $VALUES;
    public static final AccountFuturesEligibilityStatus ACCOUNT_FUTURES_ELIGIBILITY_STATUS_UNSPECIFIED;

    @JvmField
    public static final ProtoAdapter<AccountFuturesEligibilityStatus> ADAPTER;
    public static final AccountFuturesEligibilityStatus ALREADY_HAS_ACCOUNT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final AccountFuturesEligibilityStatus ELIGIBLE;
    public static final AccountFuturesEligibilityStatus INELIGIBLE;
    public static final AccountFuturesEligibilityStatus IN_MANUAL_REVIEW;
    private final int value;

    private static final /* synthetic */ AccountFuturesEligibilityStatus[] $values() {
        return new AccountFuturesEligibilityStatus[]{ACCOUNT_FUTURES_ELIGIBILITY_STATUS_UNSPECIFIED, ELIGIBLE, INELIGIBLE, ALREADY_HAS_ACCOUNT, IN_MANUAL_REVIEW};
    }

    @JvmStatic
    public static final AccountFuturesEligibilityStatus fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<AccountFuturesEligibilityStatus> getEntries() {
        return $ENTRIES;
    }

    private AccountFuturesEligibilityStatus(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final AccountFuturesEligibilityStatus accountFuturesEligibilityStatus = new AccountFuturesEligibilityStatus("ACCOUNT_FUTURES_ELIGIBILITY_STATUS_UNSPECIFIED", 0, 0);
        ACCOUNT_FUTURES_ELIGIBILITY_STATUS_UNSPECIFIED = accountFuturesEligibilityStatus;
        ELIGIBLE = new AccountFuturesEligibilityStatus("ELIGIBLE", 1, 1);
        INELIGIBLE = new AccountFuturesEligibilityStatus("INELIGIBLE", 2, 2);
        ALREADY_HAS_ACCOUNT = new AccountFuturesEligibilityStatus("ALREADY_HAS_ACCOUNT", 3, 3);
        IN_MANUAL_REVIEW = new AccountFuturesEligibilityStatus("IN_MANUAL_REVIEW", 4, 4);
        AccountFuturesEligibilityStatus[] accountFuturesEligibilityStatusArr$values = $values();
        $VALUES = accountFuturesEligibilityStatusArr$values;
        $ENTRIES = EnumEntries2.enumEntries(accountFuturesEligibilityStatusArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountFuturesEligibilityStatus.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<AccountFuturesEligibilityStatus>(orCreateKotlinClass, syntax, accountFuturesEligibilityStatus) { // from class: com.robinhood.ceres.v1.AccountFuturesEligibilityStatus$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public AccountFuturesEligibilityStatus fromValue(int value) {
                return AccountFuturesEligibilityStatus.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: AccountFuturesEligibilityStatus.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/ceres/v1/AccountFuturesEligibilityStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/ceres/v1/AccountFuturesEligibilityStatus;", "fromValue", "value", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountFuturesEligibilityStatus fromValue(int value) {
            if (value == 0) {
                return AccountFuturesEligibilityStatus.ACCOUNT_FUTURES_ELIGIBILITY_STATUS_UNSPECIFIED;
            }
            if (value == 1) {
                return AccountFuturesEligibilityStatus.ELIGIBLE;
            }
            if (value == 2) {
                return AccountFuturesEligibilityStatus.INELIGIBLE;
            }
            if (value == 3) {
                return AccountFuturesEligibilityStatus.ALREADY_HAS_ACCOUNT;
            }
            if (value != 4) {
                return null;
            }
            return AccountFuturesEligibilityStatus.IN_MANUAL_REVIEW;
        }
    }

    public static AccountFuturesEligibilityStatus valueOf(String str) {
        return (AccountFuturesEligibilityStatus) Enum.valueOf(AccountFuturesEligibilityStatus.class, str);
    }

    public static AccountFuturesEligibilityStatus[] values() {
        return (AccountFuturesEligibilityStatus[]) $VALUES.clone();
    }
}
