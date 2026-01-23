package com.robinhood.android.account.icons;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.p320db.Account;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountDisplayIcons.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\n\u001a\u00020\u0001*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"displayIcon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "Lcom/robinhood/models/db/Account;", "getDisplayIcon", "(Lcom/robinhood/models/db/Account;)Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getDisplayIcon24", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "managementType", "Lcom/robinhood/models/api/ManagementType;", "defaultIconAsset", "getDefaultIconAsset", "(Lcom/robinhood/models/api/BrokerageAccountType;)Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "lib-account-strings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.icons.AccountDisplayIconsKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AccountDisplayIcons {

    /* compiled from: AccountDisplayIcons.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.account.icons.AccountDisplayIconsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ManagementType.values().length];
            try {
                iArr[ManagementType.MANAGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ManagementType.SELF_DIRECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ManagementType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BrokerageAccountType.values().length];
            try {
                iArr2[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BrokerageAccountType.INDIVIDUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BrokerageAccountType.IRA_ROTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[BrokerageAccountType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final ServerToBentoAssetMapper2 getDisplayIcon(Account account) {
        Intrinsics.checkNotNullParameter(account, "<this>");
        return getDisplayIcon24(account.getBrokerageAccountType(), account.getManagementType());
    }

    public static final ServerToBentoAssetMapper2 getDisplayIcon24(BrokerageAccountType brokerageAccountType, ManagementType managementType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "brokerageAccountType");
        Intrinsics.checkNotNullParameter(managementType, "managementType");
        int i = WhenMappings.$EnumSwitchMapping$0[managementType.ordinal()];
        if (i == 1) {
            return ServerToBentoAssetMapper2.MANAGED_ACCOUNTS_24;
        }
        if (i == 2 || i == 3) {
            return getDefaultIconAsset(brokerageAccountType);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final ServerToBentoAssetMapper2 getDefaultIconAsset(BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$1[brokerageAccountType.ordinal()]) {
            case 1:
            case 2:
                return ServerToBentoAssetMapper2.CUSTODIAL_24;
            case 3:
                return ServerToBentoAssetMapper2.FINANCE_24;
            case 4:
            case 5:
                return ServerToBentoAssetMapper2.RETIREMENT_24;
            case 6:
                return ServerToBentoAssetMapper2.JOINT_ACCOUNT_24;
            case 7:
                return ServerToBentoAssetMapper2.ISA_24;
            case 8:
                return ServerToBentoAssetMapper2.INFO_FILLED_24;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
