package com.robinhood.android.account.api;

import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiAccount;
import com.robinhood.models.api.BrokerageAccountType;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.Query;

/* compiled from: AccountApi.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0003\u0010\n\u001a\u00020\tH§@¢\u0006\u0002\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u000eH§@¢\u0006\u0002\u0010\u000fJ\"\u0010\u0010\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u0012H§@¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/account/api/AccountApi;", "", "getAccounts", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiAccount;", "types", "Lcom/robinhood/models/CommaSeparatedList;", "Lcom/robinhood/models/api/BrokerageAccountType;", "includeManaged", "", "includeMultipleIndividual", "(Lcom/robinhood/models/CommaSeparatedList;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAccount", "accountNumber", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setNickname", "request", "Lcom/robinhood/models/api/ApiAccount$NicknameRequest;", "(Ljava/lang/String;Lcom/robinhood/models/api/ApiAccount$NicknameRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-account_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public interface AccountApi {
    @GET("accounts/{accountNumber}/")
    Object getAccount(@Path("accountNumber") String str, Continuation<? super ApiAccount> continuation);

    @GET("accounts/")
    Object getAccounts(@Query("brokerage_account_types") CommaSeparatedList<BrokerageAccountType> commaSeparatedList, @Query("include_managed") boolean z, @Query("include_multiple_individual") boolean z2, Continuation<? super PaginatedResult<ApiAccount>> continuation);

    @PATCH("accounts/{accountNumber}/")
    Object setNickname(@Path("accountNumber") String str, @Body ApiAccount.NicknameRequest nicknameRequest, Continuation<? super ApiAccount> continuation);

    /* compiled from: AccountApi.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes24.dex */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object getAccounts$default(AccountApi accountApi, CommaSeparatedList commaSeparatedList, boolean z, boolean z2, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAccounts");
            }
            if ((i & 1) != 0) {
                commaSeparatedList = null;
            }
            if ((i & 2) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                z2 = true;
            }
            return accountApi.getAccounts(commaSeparatedList, z, z2, continuation);
        }
    }
}
