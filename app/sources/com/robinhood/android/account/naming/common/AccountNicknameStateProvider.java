package com.robinhood.android.account.naming.common;

import bonfire.proto.idl.accounts.p028v1.ValidateNicknameResponseDto;
import com.robinhood.android.account.naming.C8116R;
import com.robinhood.android.account.naming.common.AccountNicknameViewState2;
import com.robinhood.android.account.store.naming.NicknameValidationResult;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountNicknameStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/account/naming/common/AccountNicknameStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/account/naming/common/AccountNicknameDataState;", "Lcom/robinhood/android/account/naming/common/AccountNicknameViewState;", "<init>", "()V", "reduce", "dataState", "feature-account-naming_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AccountNicknameStateProvider implements StateProvider<AccountNicknameDataState, AccountNicknameViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public AccountNicknameViewState reduce(AccountNicknameDataState dataState) {
        AccountNicknameViewState2 error;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        NicknameValidationResult validation = dataState.getValidation();
        if (validation instanceof NicknameValidationResult.Valid) {
            error = new AccountNicknameViewState2.Info(StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C8116R.plurals.characters_entered, dataState.getNickname().length()), Integer.valueOf(dataState.getNickname().length()), 14));
        } else if (validation instanceof NicknameValidationResult.NotEnoughLetters) {
            error = new AccountNicknameViewState2.Info(StringResource.INSTANCE.invoke(C8116R.string.enter_at_least_characters, new Object[0]));
        } else if (Intrinsics.areEqual(validation, NicknameValidationResult.InvalidCharacters.INSTANCE)) {
            error = new AccountNicknameViewState2.Error(StringResource.INSTANCE.invoke(C8116R.string.only_enter_these_chars, new Object[0]));
        } else if (validation instanceof NicknameValidationResult.Error) {
            if (((NicknameValidationResult.Error) dataState.getValidation()).getSeverity() == ValidateNicknameResponseDto.WarningDto.SeverityDto.SEVERITY_INFO) {
                error = new AccountNicknameViewState2.Info(StringResource.INSTANCE.invoke(((NicknameValidationResult.Error) dataState.getValidation()).getMessage()));
            } else {
                error = new AccountNicknameViewState2.Error(StringResource.INSTANCE.invoke(((NicknameValidationResult.Error) dataState.getValidation()).getMessage()));
            }
        } else {
            if (!Intrinsics.areEqual(validation, NicknameValidationResult.UnknownError.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            error = new AccountNicknameViewState2.Error(StringResource.INSTANCE.invoke(C8116R.string.unknown_error, new Object[0]));
        }
        return new AccountNicknameViewState(dataState.getNickname(), dataState.isSaving(), error, dataState.getCtaText(), dataState.getValidation().getCanSubmit(), dataState.getBrokerageAccountType(), dataState.getManagementType());
    }
}
