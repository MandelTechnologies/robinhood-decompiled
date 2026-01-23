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
/* compiled from: AccountMarkType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/ceres/v1/AccountMarkType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ACCOUNT_MARK_TYPE_UNSPECIFIED", "NORMAL_CUSTOMER", "NON_CUSTOMER", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class AccountMarkType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountMarkType[] $VALUES;
    public static final AccountMarkType ACCOUNT_MARK_TYPE_UNSPECIFIED;

    @JvmField
    public static final ProtoAdapter<AccountMarkType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final AccountMarkType NON_CUSTOMER;
    public static final AccountMarkType NORMAL_CUSTOMER;
    private final int value;

    private static final /* synthetic */ AccountMarkType[] $values() {
        return new AccountMarkType[]{ACCOUNT_MARK_TYPE_UNSPECIFIED, NORMAL_CUSTOMER, NON_CUSTOMER};
    }

    @JvmStatic
    public static final AccountMarkType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<AccountMarkType> getEntries() {
        return $ENTRIES;
    }

    private AccountMarkType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final AccountMarkType accountMarkType = new AccountMarkType("ACCOUNT_MARK_TYPE_UNSPECIFIED", 0, 0);
        ACCOUNT_MARK_TYPE_UNSPECIFIED = accountMarkType;
        NORMAL_CUSTOMER = new AccountMarkType("NORMAL_CUSTOMER", 1, 1);
        NON_CUSTOMER = new AccountMarkType("NON_CUSTOMER", 2, 2);
        AccountMarkType[] accountMarkTypeArr$values = $values();
        $VALUES = accountMarkTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(accountMarkTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AccountMarkType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<AccountMarkType>(orCreateKotlinClass, syntax, accountMarkType) { // from class: com.robinhood.ceres.v1.AccountMarkType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public AccountMarkType fromValue(int value) {
                return AccountMarkType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: AccountMarkType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/ceres/v1/AccountMarkType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/ceres/v1/AccountMarkType;", "fromValue", "value", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AccountMarkType fromValue(int value) {
            if (value == 0) {
                return AccountMarkType.ACCOUNT_MARK_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return AccountMarkType.NORMAL_CUSTOMER;
            }
            if (value != 2) {
                return null;
            }
            return AccountMarkType.NON_CUSTOMER;
        }
    }

    public static AccountMarkType valueOf(String str) {
        return (AccountMarkType) Enum.valueOf(AccountMarkType.class, str);
    }

    public static AccountMarkType[] values() {
        return (AccountMarkType[]) $VALUES.clone();
    }
}
