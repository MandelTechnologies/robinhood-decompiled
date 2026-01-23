package com.robinhood.store.base;

import com.robinhood.models.api.ApiInvestmentScheduleUpdateRequest;
import com.robinhood.models.crypto.p314db.CryptoAccountSwitcherLocation;
import com.robinhood.recurring.models.api.ApiAssetType;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.api.ApiInvestmentScheduleRequest;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import idl.recurring.proto.p474v1.GetScheduleConfigRequestDto;
import idl.recurring.proto.p474v1.GetScheduleConfigResponseDto;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;

/* compiled from: InvestmentScheduleStore.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\n\u001a\u00020\u000bH&J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H&J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u000e\u001a\u00020\u000bH&J\u001c\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0010\u001a\u00020\u0011H&J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0013\u001a\u00020\u0014H&J\u001e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H¦@¢\u0006\u0002\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001cH¦@¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00072\u0006\u0010 \u001a\u00020!H&¨\u0006\""}, m3636d2 = {"Lcom/robinhood/store/base/InvestmentScheduleStore;", "", "refresh", "Lkotlinx/coroutines/Job;", "force", "", "streamInvestmentSchedulesByCurrencyPairId", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "currencyPairId", "Ljava/util/UUID;", "streamCryptoInvestmentSchedules", "streamInvestmentScheduleById", "id", "streamInvestmentSchedulesForType", "assetType", "Lcom/robinhood/recurring/models/api/ApiAssetType;", "streamInvestmentSchedulesBySelectedAccount", "location", "Lcom/robinhood/models/crypto/db/CryptoAccountSwitcherLocation$WithCurrencyPair;", "updateInvestmentSchedule", "Lcom/robinhood/recurring/models/api/ApiInvestmentSchedule;", "update", "Lcom/robinhood/models/api/ApiInvestmentScheduleUpdateRequest;", "(Ljava/util/UUID;Lcom/robinhood/models/api/ApiInvestmentScheduleUpdateRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitInvestmentSchedule", "request", "Lcom/robinhood/recurring/models/api/ApiInvestmentScheduleRequest;", "(Lcom/robinhood/recurring/models/api/ApiInvestmentScheduleRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getConfig", "Lidl/recurring/proto/v1/GetScheduleConfigResponseDto;", "requestDto", "Lidl/recurring/proto/v1/GetScheduleConfigRequestDto;", "lib-store-base_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface InvestmentScheduleStore {
    /* renamed from: getConfig */
    Flow<GetScheduleConfigResponseDto> mo22734getConfig(GetScheduleConfigRequestDto requestDto);

    Job refresh(boolean force);

    Flow<List<InvestmentSchedule>> streamCryptoInvestmentSchedules();

    Flow<InvestmentSchedule> streamInvestmentScheduleById(UUID id);

    Flow<List<InvestmentSchedule>> streamInvestmentSchedulesByCurrencyPairId(UUID currencyPairId);

    Flow<List<InvestmentSchedule>> streamInvestmentSchedulesBySelectedAccount(CryptoAccountSwitcherLocation.WithCurrencyPair location);

    /* renamed from: streamInvestmentSchedulesForType */
    Flow<List<InvestmentSchedule>> mo22735streamInvestmentSchedulesForType(ApiAssetType assetType);

    Object submitInvestmentSchedule(ApiInvestmentScheduleRequest apiInvestmentScheduleRequest, Continuation<? super InvestmentSchedule> continuation);

    Object updateInvestmentSchedule(UUID uuid, ApiInvestmentScheduleUpdateRequest apiInvestmentScheduleUpdateRequest, Continuation<? super ApiInvestmentSchedule> continuation);
}
