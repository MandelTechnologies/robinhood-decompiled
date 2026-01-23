package com.robinhood.android.transfers.cryptocheckout.service;

import bff_money_movement.service.p019v1.FetchCryptoBillingAccountsResponseDto;
import contracts.money_movement.crypto_account_selection.proto.p432v1.GetAccountsResponseDto;
import kotlin.Metadata;

/* compiled from: RealCryptoAccountSelectionService.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m3636d2 = {"toGetAccountsResponseDto", "Lcontracts/money_movement/crypto_account_selection/proto/v1/GetAccountsResponseDto;", "Lbff_money_movement/service/v1/FetchCryptoBillingAccountsResponseDto;", "feature-crypto-checkout_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.cryptocheckout.service.RealCryptoAccountSelectionServiceKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class RealCryptoAccountSelectionService2 {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final GetAccountsResponseDto toGetAccountsResponseDto(FetchCryptoBillingAccountsResponseDto fetchCryptoBillingAccountsResponseDto) {
        return new GetAccountsResponseDto(new FetchCryptoBillingAccountsResponseDto(fetchCryptoBillingAccountsResponseDto.getDaily_total_ach_limit(), fetchCryptoBillingAccountsResponseDto.getDaily_remaining_ach_limit(), fetchCryptoBillingAccountsResponseDto.getDaily_total_dcf_limit(), fetchCryptoBillingAccountsResponseDto.getDaily_remaining_dcf_limit(), fetchCryptoBillingAccountsResponseDto.getAccounts()), null, 2, 0 == true ? 1 : 0);
    }
}
