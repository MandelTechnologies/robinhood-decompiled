package com.robinhood.android.advisory.onboarding.firstdeposit;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.advisory.onboarding.C8825R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.money.Currencies;
import com.robinhood.utils.resource.StringResource;
import defpackage.TransferAccountListConfig;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountRowData.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0001#B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JI\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00072\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/AccountRowData;", "", "accountId", "", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "isExternal", "", "enabled", "secondaryText", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "<init>", "(Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;ZZLcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", "getAccountId", "()Ljava/lang/String;", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "()Z", "getEnabled", "getSecondaryText", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AccountRowData {
    private final String accountId;
    private final boolean enabled;
    private final ServerToBentoAssetMapper2 icon;
    private final boolean isExternal;
    private final StringResource primaryText;
    private final StringResource secondaryText;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = StringResource.$stable;

    public static /* synthetic */ AccountRowData copy$default(AccountRowData accountRowData, String str, StringResource stringResource, boolean z, boolean z2, StringResource stringResource2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = accountRowData.accountId;
        }
        if ((i & 2) != 0) {
            stringResource = accountRowData.primaryText;
        }
        if ((i & 4) != 0) {
            z = accountRowData.isExternal;
        }
        if ((i & 8) != 0) {
            z2 = accountRowData.enabled;
        }
        if ((i & 16) != 0) {
            stringResource2 = accountRowData.secondaryText;
        }
        if ((i & 32) != 0) {
            serverToBentoAssetMapper2 = accountRowData.icon;
        }
        StringResource stringResource3 = stringResource2;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
        return accountRowData.copy(str, stringResource, z, z2, stringResource3, serverToBentoAssetMapper22);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsExternal() {
        return this.isExternal;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* renamed from: component5, reason: from getter */
    public final StringResource getSecondaryText() {
        return this.secondaryText;
    }

    /* renamed from: component6, reason: from getter */
    public final ServerToBentoAssetMapper2 getIcon() {
        return this.icon;
    }

    public final AccountRowData copy(String accountId, StringResource primaryText, boolean isExternal, boolean enabled, StringResource secondaryText, ServerToBentoAssetMapper2 icon) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        return new AccountRowData(accountId, primaryText, isExternal, enabled, secondaryText, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountRowData)) {
            return false;
        }
        AccountRowData accountRowData = (AccountRowData) other;
        return Intrinsics.areEqual(this.accountId, accountRowData.accountId) && Intrinsics.areEqual(this.primaryText, accountRowData.primaryText) && this.isExternal == accountRowData.isExternal && this.enabled == accountRowData.enabled && Intrinsics.areEqual(this.secondaryText, accountRowData.secondaryText) && this.icon == accountRowData.icon;
    }

    public int hashCode() {
        int iHashCode = ((((((this.accountId.hashCode() * 31) + this.primaryText.hashCode()) * 31) + Boolean.hashCode(this.isExternal)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        StringResource stringResource = this.secondaryText;
        int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.icon;
        return iHashCode2 + (serverToBentoAssetMapper2 != null ? serverToBentoAssetMapper2.hashCode() : 0);
    }

    public String toString() {
        return "AccountRowData(accountId=" + this.accountId + ", primaryText=" + this.primaryText + ", isExternal=" + this.isExternal + ", enabled=" + this.enabled + ", secondaryText=" + this.secondaryText + ", icon=" + this.icon + ")";
    }

    public AccountRowData(String accountId, StringResource primaryText, boolean z, boolean z2, StringResource stringResource, ServerToBentoAssetMapper2 serverToBentoAssetMapper2) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        this.accountId = accountId;
        this.primaryText = primaryText;
        this.isExternal = z;
        this.enabled = z2;
        this.secondaryText = stringResource;
        this.icon = serverToBentoAssetMapper2;
    }

    public /* synthetic */ AccountRowData(String str, StringResource stringResource, boolean z, boolean z2, StringResource stringResource2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, stringResource, z, z2, (i & 16) != 0 ? null : stringResource2, (i & 32) != 0 ? null : serverToBentoAssetMapper2);
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final StringResource getPrimaryText() {
        return this.primaryText;
    }

    public final boolean isExternal() {
        return this.isExternal;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final StringResource getSecondaryText() {
        return this.secondaryText;
    }

    public final ServerToBentoAssetMapper2 getIcon() {
        return this.icon;
    }

    /* compiled from: AccountRowData.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/AccountRowData$Companion;", "", "<init>", "()V", "from", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/AccountRowData;", "account", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "config", "LTransferAccountListConfig;", "inFundingV3Experiment", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {

        /* compiled from: AccountRowData.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[BrokerageAccountType.values().length];
                try {
                    iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[ApiTransferAccount.TransferAccountType.values().length];
                try {
                    iArr2[ApiTransferAccount.TransferAccountType.RHS.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[ApiTransferAccount.TransferAccountType.RHY.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[ApiTransferAccount.TransferAccountType.IRA_ROTH.ordinal()] = 3;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL.ordinal()] = 4;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[ApiTransferAccount.TransferAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 5;
                } catch (NoSuchFieldError unused7) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0117  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final AccountRowData from(TransferAccount account, TransferAccountListConfig config, boolean inFundingV3Experiment) {
            boolean z;
            boolean z2;
            boolean z3;
            DisplayName brokerageAccountDisplayName;
            StringResource stringResourceInvoke;
            StringResource stringResource;
            StringResource stringResourceInvoke2;
            DisplayName.Variants withInvesting;
            Money money;
            Intrinsics.checkNotNullParameter(account, "account");
            Intrinsics.checkNotNullParameter(config, "config");
            boolean z4 = config instanceof TransferAccountListConfig.InternalOnly;
            if (z4) {
                int i = WhenMappings.$EnumSwitchMapping$0[((TransferAccountListConfig.InternalOnly) config).getSink().ordinal()];
                if (i == 1 ? account.getType() == ApiTransferAccount.TransferAccountType.IRA_ROTH : !(i != 2 || account.getType() != ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL)) {
                    z = true;
                }
                if (!Intrinsics.areEqual(config, TransferAccountListConfig.Default.INSTANCE)) {
                    if (!z4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!account.isManaged()) {
                        int i2 = WhenMappings.$EnumSwitchMapping$0[((TransferAccountListConfig.InternalOnly) config).getSink().ordinal()];
                        if (i2 == 1 || i2 == 2) {
                            z3 = z;
                        } else {
                            z3 = !account.getType().isIra();
                        }
                        if (z3) {
                            z2 = true;
                        }
                    }
                    z2 = false;
                }
                BigDecimal withdrawableCash = account.getWithdrawableCash();
                ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = null;
                String str = (withdrawableCash != null || (money = Money3.toMoney(withdrawableCash, Currencies.USD)) == null) ? null : Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null);
                String accountId = account.getAccountId();
                boolean zIsExternal = account.isExternal();
                brokerageAccountDisplayName = AccountDisplayNames.getBrokerageAccountDisplayName(account);
                if (brokerageAccountDisplayName != null || (withInvesting = brokerageAccountDisplayName.getWithInvesting()) == null || (stringResourceInvoke = withInvesting.getTitle()) == null) {
                    stringResourceInvoke = StringResource.INSTANCE.invoke(account.getDisplayTitle());
                } else {
                    if (!inFundingV3Experiment) {
                        stringResourceInvoke = null;
                    }
                    if (stringResourceInvoke == null) {
                    }
                }
                StringResource stringResource2 = stringResourceInvoke;
                if (account.isExternal() && inFundingV3Experiment && str != null) {
                    if (!z2) {
                        stringResourceInvoke2 = StringResource.INSTANCE.invoke(C8825R.string.advisory_first_deposit_not_available_secondary_text, new Object[0]);
                    } else if (z) {
                        stringResourceInvoke2 = StringResource.INSTANCE.invoke(C8825R.string.advisory_first_deposit_ira_to_ira_secondary_text, str);
                    } else {
                        stringResourceInvoke2 = StringResource.INSTANCE.invoke(str);
                    }
                    stringResource = stringResourceInvoke2;
                } else {
                    stringResource = null;
                }
                if (!account.isExternal() && inFundingV3Experiment) {
                    if (account.isManaged()) {
                        int i3 = WhenMappings.$EnumSwitchMapping$1[account.getType().ordinal()];
                        if (i3 == 1) {
                            serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.FINANCE_24;
                        } else if (i3 == 2) {
                            serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CASH_24;
                        } else if (i3 == 3 || i3 == 4) {
                            serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.RETIREMENT_24;
                        } else if (i3 == 5) {
                            serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.JOINT_ACCOUNT_24;
                        }
                    } else {
                        serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.MANAGED_ACCOUNTS_24;
                    }
                }
                return new AccountRowData(accountId, stringResource2, zIsExternal, z2, stringResource, serverToBentoAssetMapper2);
            }
            if (!Intrinsics.areEqual(config, TransferAccountListConfig.Default.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
            if (!Intrinsics.areEqual(config, TransferAccountListConfig.Default.INSTANCE)) {
            }
            BigDecimal withdrawableCash2 = account.getWithdrawableCash();
            ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = null;
            if (withdrawableCash2 != null) {
            }
            String accountId2 = account.getAccountId();
            boolean zIsExternal2 = account.isExternal();
            brokerageAccountDisplayName = AccountDisplayNames.getBrokerageAccountDisplayName(account);
            if (brokerageAccountDisplayName != null) {
                stringResourceInvoke = StringResource.INSTANCE.invoke(account.getDisplayTitle());
            }
            StringResource stringResource22 = stringResourceInvoke;
            if (account.isExternal()) {
                stringResource = null;
            }
            if (!account.isExternal()) {
                if (account.isManaged()) {
                }
            }
            return new AccountRowData(accountId2, stringResource22, zIsExternal2, z2, stringResource, serverToBentoAssetMapper22);
        }
    }
}
