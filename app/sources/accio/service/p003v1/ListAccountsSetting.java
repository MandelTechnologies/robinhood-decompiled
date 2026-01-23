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
/* compiled from: ListAccountsSetting.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, m3636d2 = {"Laccio/service/v1/ListAccountsSetting;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LIST_ACCOUNTS_SETTING_UNSPECIFIED", "INCLUDE_ACCOUNT_NUMBER", "INCLUDE_RHS_LINKED_BANK_ACCOUNTS", "INCLUDE_ROBINHOOD_ACCOUNTS", "INCLUDE_REAL_TIME_BALANCE", "REFRESH_PLAID_ITEM", "INCLUDE_INSTITUTION_LOGO", "INCLUDE_ACCOUNT_LINK_ID", "INCLUDE_REFRESHED_PLAID_BALANCE", "Companion", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class ListAccountsSetting implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ListAccountsSetting[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ListAccountsSetting> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ListAccountsSetting INCLUDE_ACCOUNT_LINK_ID;
    public static final ListAccountsSetting INCLUDE_ACCOUNT_NUMBER;
    public static final ListAccountsSetting INCLUDE_INSTITUTION_LOGO;
    public static final ListAccountsSetting INCLUDE_REAL_TIME_BALANCE;
    public static final ListAccountsSetting INCLUDE_REFRESHED_PLAID_BALANCE;
    public static final ListAccountsSetting INCLUDE_RHS_LINKED_BANK_ACCOUNTS;
    public static final ListAccountsSetting INCLUDE_ROBINHOOD_ACCOUNTS;
    public static final ListAccountsSetting LIST_ACCOUNTS_SETTING_UNSPECIFIED;
    public static final ListAccountsSetting REFRESH_PLAID_ITEM;
    private final int value;

    private static final /* synthetic */ ListAccountsSetting[] $values() {
        return new ListAccountsSetting[]{LIST_ACCOUNTS_SETTING_UNSPECIFIED, INCLUDE_ACCOUNT_NUMBER, INCLUDE_RHS_LINKED_BANK_ACCOUNTS, INCLUDE_ROBINHOOD_ACCOUNTS, INCLUDE_REAL_TIME_BALANCE, REFRESH_PLAID_ITEM, INCLUDE_INSTITUTION_LOGO, INCLUDE_ACCOUNT_LINK_ID, INCLUDE_REFRESHED_PLAID_BALANCE};
    }

    @JvmStatic
    public static final ListAccountsSetting fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ListAccountsSetting> getEntries() {
        return $ENTRIES;
    }

    private ListAccountsSetting(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ListAccountsSetting listAccountsSetting = new ListAccountsSetting("LIST_ACCOUNTS_SETTING_UNSPECIFIED", 0, 0);
        LIST_ACCOUNTS_SETTING_UNSPECIFIED = listAccountsSetting;
        INCLUDE_ACCOUNT_NUMBER = new ListAccountsSetting("INCLUDE_ACCOUNT_NUMBER", 1, 1);
        INCLUDE_RHS_LINKED_BANK_ACCOUNTS = new ListAccountsSetting("INCLUDE_RHS_LINKED_BANK_ACCOUNTS", 2, 2);
        INCLUDE_ROBINHOOD_ACCOUNTS = new ListAccountsSetting("INCLUDE_ROBINHOOD_ACCOUNTS", 3, 3);
        INCLUDE_REAL_TIME_BALANCE = new ListAccountsSetting("INCLUDE_REAL_TIME_BALANCE", 4, 4);
        REFRESH_PLAID_ITEM = new ListAccountsSetting("REFRESH_PLAID_ITEM", 5, 5);
        INCLUDE_INSTITUTION_LOGO = new ListAccountsSetting("INCLUDE_INSTITUTION_LOGO", 6, 6);
        INCLUDE_ACCOUNT_LINK_ID = new ListAccountsSetting("INCLUDE_ACCOUNT_LINK_ID", 7, 7);
        INCLUDE_REFRESHED_PLAID_BALANCE = new ListAccountsSetting("INCLUDE_REFRESHED_PLAID_BALANCE", 8, 8);
        ListAccountsSetting[] listAccountsSettingArr$values = $values();
        $VALUES = listAccountsSettingArr$values;
        $ENTRIES = EnumEntries2.enumEntries(listAccountsSettingArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ListAccountsSetting.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ListAccountsSetting>(orCreateKotlinClass, syntax, listAccountsSetting) { // from class: accio.service.v1.ListAccountsSetting$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ListAccountsSetting fromValue(int value) {
                return ListAccountsSetting.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ListAccountsSetting.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Laccio/service/v1/ListAccountsSetting$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Laccio/service/v1/ListAccountsSetting;", "fromValue", "value", "", "accio.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ListAccountsSetting fromValue(int value) {
            switch (value) {
                case 0:
                    return ListAccountsSetting.LIST_ACCOUNTS_SETTING_UNSPECIFIED;
                case 1:
                    return ListAccountsSetting.INCLUDE_ACCOUNT_NUMBER;
                case 2:
                    return ListAccountsSetting.INCLUDE_RHS_LINKED_BANK_ACCOUNTS;
                case 3:
                    return ListAccountsSetting.INCLUDE_ROBINHOOD_ACCOUNTS;
                case 4:
                    return ListAccountsSetting.INCLUDE_REAL_TIME_BALANCE;
                case 5:
                    return ListAccountsSetting.REFRESH_PLAID_ITEM;
                case 6:
                    return ListAccountsSetting.INCLUDE_INSTITUTION_LOGO;
                case 7:
                    return ListAccountsSetting.INCLUDE_ACCOUNT_LINK_ID;
                case 8:
                    return ListAccountsSetting.INCLUDE_REFRESHED_PLAID_BALANCE;
                default:
                    return null;
            }
        }
    }

    public static ListAccountsSetting valueOf(String str) {
        return (ListAccountsSetting) Enum.valueOf(ListAccountsSetting.class, str);
    }

    public static ListAccountsSetting[] values() {
        return (ListAccountsSetting[]) $VALUES.clone();
    }
}
