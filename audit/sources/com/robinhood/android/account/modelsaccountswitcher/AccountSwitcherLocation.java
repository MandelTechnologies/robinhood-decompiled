package com.robinhood.android.account.modelsaccountswitcher;

import account_aggregation.service.models.p004v1.AccountSwitcherLocationDto;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AccountSwitcherLocation.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherLocation;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", EducationTourScreenNames.UNSPECIFIED_SCREEN, "INDEX_DETAIL_TRADE_BAR", "toDto", "Laccount_aggregation/service/models/v1/AccountSwitcherLocationDto;", "Companion", "lib-models-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AccountSwitcherLocation implements RhEnum<AccountSwitcherLocation> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AccountSwitcherLocation[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String serverValue;
    public static final AccountSwitcherLocation UNSPECIFIED = new AccountSwitcherLocation(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0, "unspecified");
    public static final AccountSwitcherLocation INDEX_DETAIL_TRADE_BAR = new AccountSwitcherLocation("INDEX_DETAIL_TRADE_BAR", 1, "index_detail_trade_bar");

    /* compiled from: AccountSwitcherLocation.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountSwitcherLocation.values().length];
            try {
                iArr[AccountSwitcherLocation.UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountSwitcherLocation.INDEX_DETAIL_TRADE_BAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ AccountSwitcherLocation[] $values() {
        return new AccountSwitcherLocation[]{UNSPECIFIED, INDEX_DETAIL_TRADE_BAR};
    }

    @JvmStatic
    public static AccountSwitcherLocation fromServerValue(String str) {
        return INSTANCE.fromServerValue(str);
    }

    public static EnumEntries<AccountSwitcherLocation> getEntries() {
        return $ENTRIES;
    }

    @JvmStatic
    public static String toServerValue(AccountSwitcherLocation accountSwitcherLocation) {
        return INSTANCE.toServerValue(accountSwitcherLocation);
    }

    private AccountSwitcherLocation(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        AccountSwitcherLocation[] accountSwitcherLocationArr$values = $values();
        $VALUES = accountSwitcherLocationArr$values;
        $ENTRIES = EnumEntries2.enumEntries(accountSwitcherLocationArr$values);
        INSTANCE = new Companion(null);
    }

    public final AccountSwitcherLocationDto toDto() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return AccountSwitcherLocationDto.ASL_UNSPECIFIED;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return AccountSwitcherLocationDto.ASL_INDEX_DETAIL_TRADE_BAR;
    }

    /* compiled from: AccountSwitcherLocation.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0017J\u0014\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherLocation$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherLocation;", "<init>", "()V", "toServerValue", "", "enumValue", "fromServerValue", "serverValue", "lib-models-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion extends RhEnum.Converter.Defaulted<AccountSwitcherLocation> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super(AccountSwitcherLocation.values(), AccountSwitcherLocation.UNSPECIFIED, false, 4, null);
        }

        @Override // com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public String toServerValue(AccountSwitcherLocation enumValue) {
            return super.toServerValue((Enum) enumValue);
        }

        @Override // com.robinhood.enums.RhEnum.Converter.Defaulted, com.robinhood.enums.RhEnum.Converter
        @JvmStatic
        public AccountSwitcherLocation fromServerValue(String serverValue) {
            return (AccountSwitcherLocation) super.fromServerValue(serverValue);
        }
    }

    public static AccountSwitcherLocation valueOf(String str) {
        return (AccountSwitcherLocation) Enum.valueOf(AccountSwitcherLocation.class, str);
    }

    public static AccountSwitcherLocation[] values() {
        return (AccountSwitcherLocation[]) $VALUES.clone();
    }
}
