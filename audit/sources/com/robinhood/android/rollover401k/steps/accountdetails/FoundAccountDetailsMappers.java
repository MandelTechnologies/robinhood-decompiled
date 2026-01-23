package com.robinhood.android.rollover401k.steps.accountdetails;

import bonfire.proto.idl.retirement.p038v1.DataRowDto;
import bonfire.proto.idl.retirement.p038v1.GetAccountDetailsResponseDto;
import bonfire.proto.idl.retirement.p038v1.PortfolioAllocationDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: FoundAccountDetailsMappers.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m3636d2 = {"toAccountDetailsViewModel", "Lcom/robinhood/android/rollover401k/steps/accountdetails/AccountDetailsViewModel;", "Lbonfire/proto/idl/retirement/v1/GetAccountDetailsResponseDto;", "feature-rollover-401k_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsMappersKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class FoundAccountDetailsMappers {
    public static final AccountDetailsViewModel toAccountDetailsViewModel(GetAccountDetailsResponseDto getAccountDetailsResponseDto) {
        Intrinsics.checkNotNullParameter(getAccountDetailsResponseDto, "<this>");
        String title = getAccountDetailsResponseDto.getTitle();
        String broker_name = getAccountDetailsResponseDto.getBroker_name();
        String connected_date = getAccountDetailsResponseDto.getConnected_date();
        String account_balance = getAccountDetailsResponseDto.getAccount_balance();
        String contribution_type = getAccountDetailsResponseDto.getContribution_type();
        String last_contribution_date = getAccountDetailsResponseDto.getLast_contribution_date();
        String account_fees = getAccountDetailsResponseDto.getAccount_fees();
        String account_details_heading = getAccountDetailsResponseDto.getAccount_details_heading();
        List<DataRowDto> account_details_rows = getAccountDetailsResponseDto.getAccount_details_rows();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(account_details_rows, 10));
        for (DataRowDto dataRowDto : account_details_rows) {
            arrayList.add(new DataRow(dataRowDto.getLabel(), dataRowDto.getValue()));
        }
        String portfolio_allocation_heading = getAccountDetailsResponseDto.getPortfolio_allocation_heading();
        List<PortfolioAllocationDto> portfolio_allocations = getAccountDetailsResponseDto.getPortfolio_allocations();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(portfolio_allocations, 10));
        for (PortfolioAllocationDto portfolioAllocationDto : portfolio_allocations) {
            arrayList2.add(new PortfolioAllocation(portfolioAllocationDto.getAsset_type(), portfolioAllocationDto.getPercentage()));
        }
        List<DataRowDto> portfolio_allocation_rows = getAccountDetailsResponseDto.getPortfolio_allocation_rows();
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(portfolio_allocation_rows, 10));
        for (DataRowDto dataRowDto2 : portfolio_allocation_rows) {
            arrayList3.add(new DataRow(dataRowDto2.getLabel(), dataRowDto2.getValue()));
            portfolio_allocation_heading = portfolio_allocation_heading;
        }
        return new AccountDetailsViewModel(title, broker_name, connected_date, account_balance, contribution_type, last_contribution_date, account_fees, account_details_heading, arrayList, portfolio_allocation_heading, arrayList2, arrayList3, getAccountDetailsResponseDto.getConnected_message(), getAccountDetailsResponseDto.getPlaid_disclaimer(), getAccountDetailsResponseDto.getFooter_disclaimer());
    }
}
