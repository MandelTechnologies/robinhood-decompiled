package com.robinhood.android.feature.account.onboarding.accounttype;

import accounts.onboarding.proto.p006v1.AvailableAccountRowDto;
import accounts.onboarding.proto.p006v1.BrokerageAccountTypeSelectionDto;
import com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionRow;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import rosetta.account.BrokerageAccountType;

/* compiled from: AccountTypeSelectionRow.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toSelectionRow", "Lcom/robinhood/android/feature/account/onboarding/accounttype/AccountTypeSelectionRow;", "Laccounts/onboarding/proto/v1/AvailableAccountRowDto;", "feature-account-onboarding_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.feature.account.onboarding.accounttype.AccountTypeSelectionRowKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class AccountTypeSelectionRow2 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final AccountTypeSelectionRow toSelectionRow(AvailableAccountRowDto availableAccountRowDto) {
        AccountTypeSelectionRow.RowType account;
        Intrinsics.checkNotNullParameter(availableAccountRowDto, "<this>");
        String title = availableAccountRowDto.getTitle();
        String subtitle = availableAccountRowDto.getSubtitle();
        boolean enabled = availableAccountRowDto.getEnabled();
        String identifier = availableAccountRowDto.getIdentifier();
        AvailableAccountRowDto.RowTypeDto row_type = availableAccountRowDto.getRow_type();
        if (row_type == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (row_type instanceof AvailableAccountRowDto.RowTypeDto.BrokerageAccountTypeSelection) {
            BrokerageAccountTypeSelectionDto value = ((AvailableAccountRowDto.RowTypeDto.BrokerageAccountTypeSelection) row_type).getValue();
            if (value != null) {
                account = new AccountTypeSelectionRow.RowType.Account(BrokerageAccountTypes3.toBrokerageAccountType((BrokerageAccountType) value.getBrokerage_account_type().toProto()));
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else if (row_type instanceof AvailableAccountRowDto.RowTypeDto.RetirementSelection) {
            account = AccountTypeSelectionRow.RowType.Retirement.INSTANCE;
        } else {
            if (!(row_type instanceof AvailableAccountRowDto.RowTypeDto.CustodialSelection)) {
                throw new NoWhenBranchMatchedException();
            }
            account = AccountTypeSelectionRow.RowType.Custodial.INSTANCE;
        }
        return new AccountTypeSelectionRow(title, subtitle, enabled, identifier, account);
    }
}
