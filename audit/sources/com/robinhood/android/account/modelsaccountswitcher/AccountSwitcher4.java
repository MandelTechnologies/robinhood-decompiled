package com.robinhood.android.account.modelsaccountswitcher;

import account_aggregation.service.models.p004v1.AccountSwitcherAccountDto;
import account_aggregation.service.p005v1.GetAccountSwitcherResponseDto;
import com.robinhood.android.account.modelsaccountswitcher.AccountSwitcher3;
import com.robinhood.android.shared.serverui.utils.IconKt;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Clock;
import p479j$.time.Instant;
import rosetta.account.BrokerageAccountTypeDto;
import rosetta.account.ManagementTypeDto;

/* compiled from: AccountSwitcher.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\b\u001a\u0019\u0010\u0002\u001a\u00020\n*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Laccount_aggregation/service/models/v1/AccountSwitcherAccountDto$DetailsDto;", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherAccountDetails;", "toDbModel", "(Laccount_aggregation/service/models/v1/AccountSwitcherAccountDto$DetailsDto;)Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherAccountDetails;", "Laccount_aggregation/service/models/v1/AccountSwitcherAccountDto;", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherAccount;", "(Laccount_aggregation/service/models/v1/AccountSwitcherAccountDto;Lj$/time/Clock;)Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcherAccount;", "Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto;", "Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcher;", "(Laccount_aggregation/service/v1/GetAccountSwitcherResponseDto;Lj$/time/Clock;)Lcom/robinhood/android/account/modelsaccountswitcher/AccountSwitcher;", "lib-models-account-switcher_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.account.modelsaccountswitcher.AccountSwitcherKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class AccountSwitcher4 {

    /* compiled from: AccountSwitcher.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.account.modelsaccountswitcher.AccountSwitcherKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BrokerageAccountTypeDto.values().length];
            try {
                iArr[BrokerageAccountTypeDto.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountTypeDto.IRA_TRADITIONAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrokerageAccountTypeDto.IRA_ROTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BrokerageAccountTypeDto.IRA_TRADITIONAL_INHERITED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BrokerageAccountTypeDto.IRA_ROTH_INHERITED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BrokerageAccountTypeDto.JOINT_TENANCY_WITH_ROS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BrokerageAccountTypeDto.CUSTODIAL_UGMA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BrokerageAccountTypeDto.CUSTODIAL_UTMA.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BrokerageAccountTypeDto.BROKERAGE_ACCOUNT_TYPE_UNSPECIFIED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BrokerageAccountTypeDto.ISA_STOCKS_AND_SHARES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ManagementTypeDto.values().length];
            try {
                iArr2[ManagementTypeDto.TRADEPMR_MANAGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[ManagementTypeDto.MANAGEMENT_TYPE_UNSPECIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[ManagementTypeDto.SELF_DIRECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[ManagementTypeDto.MANAGED.ordinal()] = 4;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final AccountSwitcher3 toDbModel(AccountSwitcherAccountDto.DetailsDto detailsDto) {
        Intrinsics.checkNotNullParameter(detailsDto, "<this>");
        if (detailsDto instanceof AccountSwitcherAccountDto.DetailsDto.EquityDetails) {
            return new AccountSwitcher3.Equity(((AccountSwitcherAccountDto.DetailsDto.EquityDetails) detailsDto).getValue().is_closing_short_position());
        }
        if (detailsDto instanceof AccountSwitcherAccountDto.DetailsDto.IndexDetails) {
            return new AccountSwitcher3.Index(false, 1, null);
        }
        if (detailsDto instanceof AccountSwitcherAccountDto.DetailsDto.OptionsDetails) {
            return new AccountSwitcher3.Options(false, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final AccountSwitcherAccount toDbModel(AccountSwitcherAccountDto accountSwitcherAccountDto, Clock clock) {
        BrokerageAccountType brokerageAccountType;
        ManagementType managementType;
        Intrinsics.checkNotNullParameter(accountSwitcherAccountDto, "<this>");
        Intrinsics.checkNotNullParameter(clock, "clock");
        String account_number = accountSwitcherAccountDto.getAccount_number();
        switch (WhenMappings.$EnumSwitchMapping$0[accountSwitcherAccountDto.getBrokerage_account_type().ordinal()]) {
            case 1:
                brokerageAccountType = BrokerageAccountType.INDIVIDUAL;
                break;
            case 2:
                brokerageAccountType = BrokerageAccountType.IRA_TRADITIONAL;
                break;
            case 3:
                brokerageAccountType = BrokerageAccountType.IRA_ROTH;
                break;
            case 4:
                brokerageAccountType = BrokerageAccountType.IRA_TRADITIONAL;
                break;
            case 5:
                brokerageAccountType = BrokerageAccountType.IRA_ROTH;
                break;
            case 6:
                brokerageAccountType = BrokerageAccountType.JOINT_TENANCY_WITH_ROS;
                break;
            case 7:
                brokerageAccountType = BrokerageAccountType.CUSTODIAL_UGMA;
                break;
            case 8:
                brokerageAccountType = BrokerageAccountType.CUSTODIAL_UTMA;
                break;
            case 9:
            case 10:
                brokerageAccountType = BrokerageAccountType.UNKNOWN;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
        int i = WhenMappings.$EnumSwitchMapping$1[accountSwitcherAccountDto.getManagement_type().ordinal()];
        if (i == 1 || i == 2) {
            managementType = ManagementType.UNKNOWN;
        } else if (i == 3) {
            managementType = ManagementType.SELF_DIRECTED;
        } else {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            managementType = ManagementType.MANAGED;
        }
        ManagementType managementType2 = managementType;
        String entry_title = accountSwitcherAccountDto.getEntry_title();
        String title = accountSwitcherAccountDto.getTitle();
        String subtitle = accountSwitcherAccountDto.getSubtitle();
        String metadata_title = accountSwitcherAccountDto.getMetadata_title();
        String metadata_subtitle = accountSwitcherAccountDto.getMetadata_subtitle();
        Icon iconFromServerValue = Icon.INSTANCE.fromServerValue(IconKt.getServerValue(accountSwitcherAccountDto.getIcon()));
        if (iconFromServerValue == null) {
            iconFromServerValue = Icon.UNKNOWN;
        }
        Icon icon = iconFromServerValue;
        boolean zIs_selectable = accountSwitcherAccountDto.is_selectable();
        String logging_identifier = accountSwitcherAccountDto.getLogging_identifier();
        AccountSwitcherAccountDto.DetailsDto details = accountSwitcherAccountDto.getDetails();
        AccountSwitcher3 dbModel = details != null ? toDbModel(details) : null;
        Instant created_at = accountSwitcherAccountDto.getCreated_at();
        if (created_at == null) {
            created_at = Instant.now(clock);
        }
        Instant instant = created_at;
        Intrinsics.checkNotNull(instant);
        return new AccountSwitcherAccount(account_number, brokerageAccountType2, managementType2, entry_title, title, subtitle, metadata_title, metadata_subtitle, icon, zIs_selectable, logging_identifier, dbModel, instant);
    }

    public static final AccountSwitcher toDbModel(GetAccountSwitcherResponseDto getAccountSwitcherResponseDto, Clock clock) {
        Intrinsics.checkNotNullParameter(getAccountSwitcherResponseDto, "<this>");
        Intrinsics.checkNotNullParameter(clock, "clock");
        String asset_id = getAccountSwitcherResponseDto.getAsset_id();
        if (asset_id == null) {
            asset_id = "";
        }
        String str = asset_id;
        AccountSwitcherLocation dbModel = AccountSwitcherLocation3.toDbModel(getAccountSwitcherResponseDto.getLocation());
        String title = getAccountSwitcherResponseDto.getTitle();
        List<GetAccountSwitcherResponseDto.SelectableItemDto> accounts2 = getAccountSwitcherResponseDto.getAccounts();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = accounts2.iterator();
        while (it.hasNext()) {
            AccountSwitcherAccountDto account = ((GetAccountSwitcherResponseDto.SelectableItemDto) it.next()).getAccount();
            AccountSwitcherAccount dbModel2 = account != null ? toDbModel(account, clock) : null;
            if (dbModel2 != null) {
                arrayList.add(dbModel2);
            }
        }
        return new AccountSwitcher(str, dbModel, title, arrayList, getAccountSwitcherResponseDto.getPositive_button_text());
    }
}
