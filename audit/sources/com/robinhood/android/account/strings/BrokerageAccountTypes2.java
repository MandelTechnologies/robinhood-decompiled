package com.robinhood.android.account.strings;

import android.content.res.Resources;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import java.util.Comparator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BrokerageAccountTypes.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014*\b\u0012\u0004\u0012\u00020\u00150\u0014\"\u001e\u0010\u0005\u001a\u00020\u0006*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u001e\u0010\u000b\u001a\u00020\u0006*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n\"\u001e\u0010\u000e\u001a\u00020\u0006*\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\b\u001a\u0004\b\u0010\u0010\n\"\u0015\u0010\u0011\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\n¨\u0006\u0016"}, m3636d2 = {"getDisplayName", "", "Lcom/robinhood/models/api/BrokerageAccountType;", "resources", "Landroid/content/res/Resources;", "displayNameRes", "", "getDisplayNameRes$annotations", "(Lcom/robinhood/models/api/BrokerageAccountType;)V", "getDisplayNameRes", "(Lcom/robinhood/models/api/BrokerageAccountType;)I", "displayNameInSentenceWithAccountRes", "getDisplayNameInSentenceWithAccountRes$annotations", "getDisplayNameInSentenceWithAccountRes", "displayNameShortRes", "getDisplayNameShortRes$annotations", "getDisplayNameShortRes", "sortValue", "getSortValue", "sortByAccountType", "", "Lcom/robinhood/models/db/Account;", "lib-account-strings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.account.strings.BrokerageAccountTypesKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class BrokerageAccountTypes2 {

    /* compiled from: BrokerageAccountTypes.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.account.strings.BrokerageAccountTypesKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BrokerageAccountType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Deprecated
    public static /* synthetic */ void getDisplayNameInSentenceWithAccountRes$annotations(BrokerageAccountType brokerageAccountType) {
    }

    @Deprecated
    public static /* synthetic */ void getDisplayNameRes$annotations(BrokerageAccountType brokerageAccountType) {
    }

    @Deprecated
    public static /* synthetic */ void getDisplayNameShortRes$annotations(BrokerageAccountType brokerageAccountType) {
    }

    @Deprecated
    public static final String getDisplayName(BrokerageAccountType brokerageAccountType, Resources resources) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string2 = resources.getString(getDisplayNameRes(brokerageAccountType));
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        return string2;
    }

    public static final int getDisplayNameRes(BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[brokerageAccountType.ordinal()]) {
            case 1:
            case 2:
                return C8179R.string.account_type_custodial;
            case 3:
            case 4:
                return C8179R.string.account_type_individual;
            case 5:
                return C8179R.string.account_type_ira_roth;
            case 6:
                return C8179R.string.account_type_ira_traditional;
            case 7:
                return C8179R.string.account_type_joint_tenancy_with_ros;
            case 8:
                return C8179R.string.account_type_stocks_and_shares_isa;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int getDisplayNameInSentenceWithAccountRes(BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[brokerageAccountType.ordinal()]) {
            case 1:
            case 2:
                return C8179R.string.account_type_custodial_lowercase_with_account;
            case 3:
            case 4:
                return C8179R.string.account_type_individual_lowercase_with_account;
            case 5:
                return C8179R.string.account_type_ira_roth;
            case 6:
                return C8179R.string.account_type_ira_traditional_lowercase;
            case 7:
                return C8179R.string.account_type_joint_tenancy_with_ros_lowercase_with_account;
            case 8:
                return C8179R.string.account_type_stocks_and_shares_isa_lowercase;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int getDisplayNameShortRes(BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[brokerageAccountType.ordinal()]) {
            case 1:
            case 2:
                return C8179R.string.account_type_custodial_short;
            case 3:
            case 4:
                return C8179R.string.account_type_individual;
            case 5:
                return C8179R.string.account_type_ira_roth;
            case 6:
                return C8179R.string.account_type_ira_traditional;
            case 7:
                return C8179R.string.account_type_joint_tenancy_with_ros_short;
            case 8:
                return C8179R.string.account_type_stocks_and_shares_isa_short;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final int getSortValue(BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[brokerageAccountType.ordinal()]) {
            case 1:
            case 2:
                return 2;
            case 3:
                return 0;
            case 4:
                return Integer.MAX_VALUE;
            case 5:
                return 3;
            case 6:
                return 4;
            case 7:
                return 1;
            case 8:
                return 5;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final List<Account> sortByAccountType(List<Account> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return CollectionsKt.sortedWith(list, new Comparator() { // from class: com.robinhood.android.account.strings.BrokerageAccountTypesKt$sortByAccountType$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(BrokerageAccountTypes2.getSortValue(((Account) t).getBrokerageAccountType())), Integer.valueOf(BrokerageAccountTypes2.getSortValue(((Account) t2).getBrokerageAccountType())));
            }
        });
    }
}
