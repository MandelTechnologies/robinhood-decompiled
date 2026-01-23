package com.robinhood.android.account.strings;

import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.bonfire.ManagementInfo;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.p320db.phoenix.UnifiedAccountV2;
import com.robinhood.utils.resource.StringResource;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AccountDisplayNames.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u001a\"\u0010\t\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u001a\f\u0010\u0019\u001a\u0004\u0018\u00010\u001a*\u00020\b\u001a\u001e\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018\u001a\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002\u001a \u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001dH\u0002\" \u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u0015\u0010\u000b\u001a\u00020\u0007*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\n\"\u0015\u0010\u0006\u001a\u00020\u0007*\u00020\r8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000e\"\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u0007*\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, m3636d2 = {"BROKERAGE_ACCOUNT_TYPES_APPEND_SUFFIX", "", "Lcom/robinhood/models/api/BrokerageAccountType;", "", "getBROKERAGE_ACCOUNT_TYPES_APPEND_SUFFIX", "()Ljava/util/Map;", "displayName", "Lcom/robinhood/android/account/strings/DisplayName;", "Lcom/robinhood/models/db/Account;", "getDisplayName", "(Lcom/robinhood/models/db/Account;)Lcom/robinhood/android/account/strings/DisplayName;", "displayNameWithoutNickname", "getDisplayNameWithoutNickname", "Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;", "(Lcom/robinhood/models/db/phoenix/UnifiedAccountV2;)Lcom/robinhood/android/account/strings/DisplayName;", "brokerageAccountDisplayName", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "getBrokerageAccountDisplayName", "(Lcom/robinhood/models/db/bonfire/TransferAccount;)Lcom/robinhood/android/account/strings/DisplayName;", "getDisplayNameWithNickname", "nickname", "", "brokerageAccountType", "managementType", "Lcom/robinhood/models/api/ManagementType;", "nicknameDotFormat", "Lcom/robinhood/utils/resource/StringResource;", "getNicknameDotFormat", "getBrokerageAccountTypeNameVariants", "Lcom/robinhood/android/account/strings/DisplayName$Variants;", "getAccountHeadlineName", "nameVariants", "lib-account-strings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.strings.AccountDisplayNamesKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AccountDisplayNames {
    private static final Map<BrokerageAccountType, Boolean> BROKERAGE_ACCOUNT_TYPES_APPEND_SUFFIX;

    /* compiled from: AccountDisplayNames.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.account.strings.AccountDisplayNamesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[ApiTransferAccount.TransferAccountType.values().length];
            try {
                iArr[ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.IRA_ROTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.RHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiTransferAccount.TransferAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BrokerageAccountType.values().length];
            try {
                iArr2[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BrokerageAccountType.INDIVIDUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BrokerageAccountType.IRA_ROTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[BrokerageAccountType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[ManagementType.values().length];
            try {
                iArr3[ManagementType.SELF_DIRECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[ManagementType.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[ManagementType.MANAGED.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public static final Map<BrokerageAccountType, Boolean> getBROKERAGE_ACCOUNT_TYPES_APPEND_SUFFIX() {
        return BROKERAGE_ACCOUNT_TYPES_APPEND_SUFFIX;
    }

    static {
        BrokerageAccountType brokerageAccountType = BrokerageAccountType.CUSTODIAL_UGMA;
        Boolean bool = Boolean.TRUE;
        Tuples2 tuples2M3642to = Tuples4.m3642to(brokerageAccountType, bool);
        Tuples2 tuples2M3642to2 = Tuples4.m3642to(BrokerageAccountType.CUSTODIAL_UTMA, bool);
        Tuples2 tuples2M3642to3 = Tuples4.m3642to(BrokerageAccountType.INDIVIDUAL, bool);
        BrokerageAccountType brokerageAccountType2 = BrokerageAccountType.IRA_ROTH;
        Boolean bool2 = Boolean.FALSE;
        BROKERAGE_ACCOUNT_TYPES_APPEND_SUFFIX = MapsKt.mapOf(tuples2M3642to, tuples2M3642to2, tuples2M3642to3, Tuples4.m3642to(brokerageAccountType2, bool2), Tuples4.m3642to(BrokerageAccountType.IRA_TRADITIONAL, bool2), Tuples4.m3642to(BrokerageAccountType.JOINT_TENANCY_WITH_ROS, bool), Tuples4.m3642to(BrokerageAccountType.UNKNOWN, bool2));
    }

    public static final DisplayName getDisplayName(Account account) {
        Intrinsics.checkNotNullParameter(account, "<this>");
        return getDisplayName(account.getBrokerageAccountType(), account.getManagementType(), account.getNickname());
    }

    public static final DisplayName getDisplayNameWithoutNickname(Account account) {
        Intrinsics.checkNotNullParameter(account, "<this>");
        return getDisplayName(account.getBrokerageAccountType(), account.getManagementType(), null);
    }

    public static final DisplayName getDisplayName(UnifiedAccountV2 unifiedAccountV2) {
        Intrinsics.checkNotNullParameter(unifiedAccountV2, "<this>");
        return getDisplayName(unifiedAccountV2.getBrokerageAccountType(), unifiedAccountV2.getManagementType(), unifiedAccountV2.getNickname());
    }

    public static final DisplayName getBrokerageAccountDisplayName(TransferAccount transferAccount) {
        BrokerageAccountType brokerageAccountType;
        ManagementType management_type;
        Intrinsics.checkNotNullParameter(transferAccount, "<this>");
        if (!CollectionsKt.listOf((Object[]) new ApiTransferAccount.TransferAccountType[]{ApiTransferAccount.TransferAccountType.IRA_TRADITIONAL, ApiTransferAccount.TransferAccountType.IRA_ROTH, ApiTransferAccount.TransferAccountType.RHS, ApiTransferAccount.TransferAccountType.JOINT_TENANCY_WITH_ROS}).contains(transferAccount.getType())) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[transferAccount.getType().ordinal()];
        if (i == 1) {
            brokerageAccountType = BrokerageAccountType.IRA_TRADITIONAL;
        } else if (i == 2) {
            brokerageAccountType = BrokerageAccountType.IRA_ROTH;
        } else if (i == 3) {
            brokerageAccountType = BrokerageAccountType.INDIVIDUAL;
        } else if (i == 4) {
            brokerageAccountType = BrokerageAccountType.JOINT_TENANCY_WITH_ROS;
        } else {
            brokerageAccountType = BrokerageAccountType.UNKNOWN;
        }
        ManagementInfo managementInfo = transferAccount.getManagementInfo();
        if (managementInfo == null || (management_type = managementInfo.getManagement_type()) == null) {
            management_type = ManagementType.UNKNOWN;
        }
        return getDisplayName(brokerageAccountType, management_type, transferAccount.getAccountName());
    }

    private static final DisplayName getDisplayNameWithNickname(String str) {
        StringResource.Companion companion = StringResource.INSTANCE;
        StringResource stringResourceInvoke = companion.invoke(str);
        return new DisplayName(str, new DisplayName.Variants(stringResourceInvoke, stringResourceInvoke), new DisplayName.Variants(stringResourceInvoke, companion.invoke(C8179R.string.account_display_name_account_suffix, stringResourceInvoke)), new DisplayName.Variants(stringResourceInvoke, companion.invoke(C8179R.string.account_display_name_investing_suffix, stringResourceInvoke)), stringResourceInvoke);
    }

    public static /* synthetic */ DisplayName getDisplayName$default(BrokerageAccountType brokerageAccountType, ManagementType managementType, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        return getDisplayName(brokerageAccountType, managementType, str);
    }

    public static final DisplayName getDisplayName(BrokerageAccountType brokerageAccountType, ManagementType managementType, String str) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(managementType, "managementType");
        if (str != null && (!StringsKt.isBlank(str))) {
            return getDisplayNameWithNickname(str);
        }
        int i = C8179R.string.account_display_name_account_suffix;
        int i2 = C8179R.string.account_display_name_investing_suffix;
        DisplayName.Variants brokerageAccountTypeNameVariants = getBrokerageAccountTypeNameVariants(brokerageAccountType);
        if (brokerageAccountType == BrokerageAccountType.UNKNOWN) {
            return new DisplayName(str, brokerageAccountTypeNameVariants, brokerageAccountTypeNameVariants, brokerageAccountTypeNameVariants, brokerageAccountTypeNameVariants.getTitle());
        }
        StringResource title = brokerageAccountTypeNameVariants.getTitle();
        StringResource inSentence = brokerageAccountTypeNameVariants.getInSentence();
        if (managementType == ManagementType.MANAGED) {
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke = companion.invoke(C8179R.string.managed_prefix_title, inSentence);
            inSentence = companion.invoke(C8179R.string.managed_prefix_inline, inSentence);
            title = stringResourceInvoke;
        }
        Boolean bool = BROKERAGE_ACCOUNT_TYPES_APPEND_SUFFIX.get(brokerageAccountType);
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        DisplayName.Variants variants = new DisplayName.Variants(title, inSentence);
        DisplayName.Variants variants2 = new DisplayName.Variants(zBooleanValue ? StringResource.INSTANCE.invoke(i, title) : title, zBooleanValue ? StringResource.INSTANCE.invoke(i, inSentence) : inSentence);
        if (zBooleanValue) {
            title = StringResource.INSTANCE.invoke(i2, title);
        }
        if (zBooleanValue) {
            inSentence = StringResource.INSTANCE.invoke(i2, inSentence);
        }
        return new DisplayName(str, variants, variants2, new DisplayName.Variants(title, inSentence), getAccountHeadlineName(brokerageAccountType, managementType, variants));
    }

    public static final StringResource nicknameDotFormat(Account account) {
        Intrinsics.checkNotNullParameter(account, "<this>");
        String nickname = account.getNickname();
        if (nickname == null || StringsKt.isBlank(nickname)) {
            return null;
        }
        return getNicknameDotFormat(nickname, account.getBrokerageAccountType(), account.getManagementType());
    }

    public static final StringResource getNicknameDotFormat(String nickname, BrokerageAccountType brokerageAccountType, ManagementType managementType) {
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(managementType, "managementType");
        DisplayName displayName = getDisplayName(brokerageAccountType, managementType, null);
        StringResource.Companion companion = StringResource.INSTANCE;
        return companion.invoke(C8179R.string.account_display_name_dot_type, companion.invoke(nickname), displayName.getShort().getTitle());
    }

    private static final DisplayName.Variants getBrokerageAccountTypeNameVariants(BrokerageAccountType brokerageAccountType) {
        switch (WhenMappings.$EnumSwitchMapping$1[brokerageAccountType.ordinal()]) {
            case 1:
            case 2:
                StringResource.Companion companion = StringResource.INSTANCE;
                return new DisplayName.Variants(companion.invoke(C8179R.string.account_custodial_title, new Object[0]), companion.invoke(C8179R.string.account_custodial_inline, new Object[0]));
            case 3:
                StringResource.Companion companion2 = StringResource.INSTANCE;
                return new DisplayName.Variants(companion2.invoke(C8179R.string.account_individual_title, new Object[0]), companion2.invoke(C8179R.string.account_individual_inline, new Object[0]));
            case 4:
                StringResource.Companion companion3 = StringResource.INSTANCE;
                return new DisplayName.Variants(companion3.invoke(C8179R.string.account_roth_ira_title, new Object[0]), companion3.invoke(C8179R.string.account_roth_ira_inline, new Object[0]));
            case 5:
                StringResource.Companion companion4 = StringResource.INSTANCE;
                return new DisplayName.Variants(companion4.invoke(C8179R.string.account_traditional_ira_title, new Object[0]), companion4.invoke(C8179R.string.account_traditional_ira_inline, new Object[0]));
            case 6:
                StringResource.Companion companion5 = StringResource.INSTANCE;
                return new DisplayName.Variants(companion5.invoke(C8179R.string.account_joint_title, new Object[0]), companion5.invoke(C8179R.string.account_joint_inline, new Object[0]));
            case 7:
                StringResource.Companion companion6 = StringResource.INSTANCE;
                return new DisplayName.Variants(companion6.invoke(C8179R.string.account_stocks_and_shares_isa_title, new Object[0]), companion6.invoke(C8179R.string.account_stocks_and_shares_isa_inline, new Object[0]));
            case 8:
                StringResource.Companion companion7 = StringResource.INSTANCE;
                return new DisplayName.Variants(companion7.invoke(C8179R.string.account_default_title, new Object[0]), companion7.invoke(C8179R.string.account_default_inline, new Object[0]));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final StringResource getAccountHeadlineName(BrokerageAccountType brokerageAccountType, ManagementType managementType, DisplayName.Variants variants) {
        switch (WhenMappings.$EnumSwitchMapping$1[brokerageAccountType.ordinal()]) {
            case 1:
            case 2:
                int i = WhenMappings.$EnumSwitchMapping$2[managementType.ordinal()];
                if (i == 1 || i == 2) {
                    return StringResource.INSTANCE.invoke(C8179R.string.account_display_name_investing_suffix, variants.getTitle());
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return variants.getTitle();
            case 3:
                int i2 = WhenMappings.$EnumSwitchMapping$2[managementType.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    return StringResource.INSTANCE.invoke(C8179R.string.self_directed_individual_headline, new Object[0]);
                }
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return StringResource.INSTANCE.invoke(C8179R.string.managed_individual_headline, new Object[0]);
            case 4:
            case 7:
            case 8:
                return variants.getTitle();
            case 5:
                int i3 = WhenMappings.$EnumSwitchMapping$2[managementType.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    return variants.getTitle();
                }
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return StringResource.INSTANCE.invoke(C8179R.string.managed_traditional_ira_headline, new Object[0]);
            case 6:
                int i4 = WhenMappings.$EnumSwitchMapping$2[managementType.ordinal()];
                if (i4 == 1 || i4 == 2) {
                    return StringResource.INSTANCE.invoke(C8179R.string.account_display_name_investing_suffix, variants.getTitle());
                }
                if (i4 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return variants.getTitle();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
