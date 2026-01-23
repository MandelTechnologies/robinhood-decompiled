package com.robinhood.arsenal.proto.p281v1.idl;

import com.robinhood.android.idl.common.RhGenerated;
import com.robinhood.android.idl.common.httpoption.IdlField;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmSuppressWildcards;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Query;

/* compiled from: PrivateCompanyServiceRetrofit.kt */
@RhGenerated
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J<\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0001\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0001\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH§@¢\u0006\u0002\u0010\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/PrivateCompanyServiceRetrofit;", "", "ListPrivateCompanies", "Lretrofit2/Response;", "Lcom/robinhood/arsenal/proto/v1/idl/ListPrivateCompaniesResponseDto;", "headers", "", "", "private_company_ids", "", "(Ljava/util/Map;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmSuppressWildcards
/* loaded from: classes5.dex */
public interface PrivateCompanyServiceRetrofit {
    @GET("arsenal/v1/privates/detail")
    Object ListPrivateCompanies(@HeaderMap Map<String, String> map, @IdlField(protoType = "string") @Query("privateCompanyIds") List<String> list, Continuation<Response<ListPrivateCompaniesResponseDto>> continuation);
}
