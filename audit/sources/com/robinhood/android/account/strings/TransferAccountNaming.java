package com.robinhood.android.account.strings;

import com.robinhood.android.models.transfer.shared.AccountType;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferAccountNaming.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"stringResource", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/android/models/transfer/shared/AccountType;", "getStringResource", "(Lcom/robinhood/android/models/transfer/shared/AccountType;)Lcom/robinhood/utils/resource/StringResource;", "lib-account-strings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.strings.TransferAccountNamingKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class TransferAccountNaming {

    /* compiled from: TransferAccountNaming.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.account.strings.TransferAccountNamingKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountType.values().length];
            try {
                iArr[AccountType.RCT_FIRM_ACCOUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountType.RHS_ROTH_IRA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountType.RHS_ROTH_IRA_INHERITED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountType.RHS_TRADITIONAL_IRA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AccountType.RHS_TRADITIONAL_IRA_INHERITED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AccountType.RHS_ACCOUNT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AccountType.RHS_FIRM_ACCOUNT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[AccountType.RHY_ACCOUNT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[AccountType.RHY_FIRM_ACCOUNT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[AccountType.RHS_JOINT_TENANCY_WITH_ROS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[AccountType.OUTGOING_WIRE_ACCOUNT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[AccountType.RHUK_ISA_STOCKS_AND_SHARES.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AccountType.UNKNOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[AccountType.RHCE_CUSTOMER_ACCOUNT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[AccountType.ACH_RELATIONSHIP.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[AccountType.DEBIT_CARD_INSTRUMENT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[AccountType.UK_BANK_ACCOUNT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[AccountType.EXTERNAL.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource getStringResource(AccountType accountType) {
        Intrinsics.checkNotNullParameter(accountType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[accountType.ordinal()]) {
            case 1:
                return StringResource.INSTANCE.invoke(C8179R.string.account_type_credit_card, new Object[0]);
            case 2:
            case 3:
                return StringResource.INSTANCE.invoke(C8179R.string.account_type_ira_roth, new Object[0]);
            case 4:
            case 5:
                return StringResource.INSTANCE.invoke(C8179R.string.account_type_ira_traditional, new Object[0]);
            case 6:
            case 7:
                return StringResource.INSTANCE.invoke(C8179R.string.account_type_individual, new Object[0]);
            case 8:
            case 9:
                return StringResource.INSTANCE.invoke(C8179R.string.account_type_spending, new Object[0]);
            case 10:
                return StringResource.INSTANCE.invoke(C8179R.string.account_type_joint_tenancy_with_ros, new Object[0]);
            case 11:
                return StringResource.INSTANCE.invoke(C8179R.string.outgoing_wire_account, new Object[0]);
            case 12:
                return StringResource.INSTANCE.invoke(C8179R.string.account_type_stocks_and_shares_isa, new Object[0]);
            case 13:
                return StringResource.INSTANCE.invoke(C8179R.string.account_type_unknown, new Object[0]);
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                throw new IllegalStateException(("Unsupported account type: " + accountType).toString());
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
