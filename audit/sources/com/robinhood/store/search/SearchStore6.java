package com.robinhood.store.search;

import com.plaid.internal.EnumC7081g;
import com.robinhood.api.search.SearchBonfireApi;
import com.robinhood.api.search.SearchCryptoBonfireApi;
import com.robinhood.g11n.iso.RegionCode;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.CryptoInstrumentType;
import com.robinhood.models.api.search.ApiSearchResult;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SearchStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/search/ApiSearchResult;", "searchParams", "Lcom/robinhood/store/search/SearchParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.search.SearchStore$searchEndpoint$1", m3645f = "SearchStore.kt", m3646l = {57, 63, 64, 66, EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE, 79}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.store.search.SearchStore$searchEndpoint$1, reason: use source file name */
/* loaded from: classes12.dex */
final class SearchStore6 extends ContinuationImpl7 implements Function2<SearchParams, Continuation<? super PaginatedResult<? extends ApiSearchResult>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SearchStore this$0;

    /* compiled from: SearchStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.store.search.SearchStore$searchEndpoint$1$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SearchStore4.values().length];
            try {
                iArr[SearchStore4.UNIVERSAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SearchStore4.CRYPTO_TRADER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SearchStore4.RETIREMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SearchStore4.JOINT_ACCOUNTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SearchStore4.CRYPTO_RHC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SearchStore4.PERPETUALS_RHC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SearchStore6(SearchStore searchStore, Continuation<? super SearchStore6> continuation) {
        super(2, continuation);
        this.this$0 = searchStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SearchStore6 searchStore6 = new SearchStore6(this.this$0, continuation);
        searchStore6.L$0 = obj;
        return searchStore6;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(SearchParams searchParams, Continuation<? super PaginatedResult<ApiSearchResult>> continuation) {
        return ((SearchStore6) create(searchParams, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(SearchParams searchParams, Continuation<? super PaginatedResult<? extends ApiSearchResult>> continuation) {
        return invoke2(searchParams, (Continuation<? super PaginatedResult<ApiSearchResult>>) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        if (r11 == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
    
        if (r11 == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d3, code lost:
    
        if (r11 == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00eb, code lost:
    
        if (r11 == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0103, code lost:
    
        if (r11 == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0123, code lost:
    
        if (r11 == r0) goto L53;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                SearchParams searchParams = (SearchParams) this.L$0;
                switch (WhenMappings.$EnumSwitchMapping$0[searchParams.getSearchSource().ordinal()]) {
                    case 1:
                    case 2:
                        SearchBonfireApi searchBonfireApi = this.this$0.bonfire;
                        String query = searchParams.getQuery();
                        CommaSeparatedList<String> contentTypes = searchParams.getContentTypes();
                        String queryContext = searchParams.getQueryContext();
                        this.label = 1;
                        obj = searchBonfireApi.search(query, contentTypes, queryContext, this);
                        break;
                    case 3:
                        SearchBonfireApi searchBonfireApi2 = this.this$0.bonfire;
                        String query2 = searchParams.getQuery();
                        this.label = 2;
                        obj = searchBonfireApi2.retirementSearch(query2, this);
                        break;
                    case 4:
                        SearchBonfireApi searchBonfireApi3 = this.this$0.bonfire;
                        String query3 = searchParams.getQuery();
                        this.label = 3;
                        obj = searchBonfireApi3.jointAccountsSearch(query3, this);
                        break;
                    case 5:
                        if (this.this$0.authManager.isLoggedIn()) {
                            SearchCryptoBonfireApi searchCryptoBonfireApi = this.this$0.searchCryptoBonfireApi;
                            String query4 = searchParams.getQuery();
                            CommaSeparatedList<String> contentTypes2 = searchParams.getContentTypes();
                            if (!CollectionsKt.any(contentTypes2.getItems())) {
                                contentTypes2 = null;
                            }
                            Map<String, String> additionalParams = searchParams.getAdditionalParams();
                            this.label = 4;
                            obj = SearchCryptoBonfireApi.DefaultImpls.cryptoSearch$default(searchCryptoBonfireApi, query4, null, contentTypes2, additionalParams, this, 2, null);
                            break;
                        } else {
                            SearchCryptoBonfireApi searchCryptoBonfireApi2 = this.this$0.searchCryptoBonfireApi;
                            RegionCode regionCode = RegionCode.f5251EU;
                            String query5 = searchParams.getQuery();
                            CommaSeparatedList<String> contentTypes3 = searchParams.getContentTypes();
                            if (!CollectionsKt.any(contentTypes3.getItems())) {
                                contentTypes3 = null;
                            }
                            this.label = 5;
                            obj = searchCryptoBonfireApi2.cryptoSearchAnonymous(regionCode, query5, contentTypes3, this);
                            break;
                        }
                        return coroutine_suspended;
                    case 6:
                        SearchCryptoBonfireApi searchCryptoBonfireApi3 = this.this$0.searchCryptoBonfireApi;
                        String query6 = searchParams.getQuery();
                        CryptoInstrumentType cryptoInstrumentType = CryptoInstrumentType.PERPETUALS;
                        this.label = 6;
                        obj = SearchCryptoBonfireApi.DefaultImpls.cryptoSearch$default(searchCryptoBonfireApi3, query6, cryptoInstrumentType, null, null, this, 12, null);
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            case 1:
                ResultKt.throwOnFailure(obj);
                return (PaginatedResult) obj;
            case 2:
                ResultKt.throwOnFailure(obj);
                return (PaginatedResult) obj;
            case 3:
                ResultKt.throwOnFailure(obj);
                return (PaginatedResult) obj;
            case 4:
                ResultKt.throwOnFailure(obj);
                return (PaginatedResult) obj;
            case 5:
                ResultKt.throwOnFailure(obj);
                return (PaginatedResult) obj;
            case 6:
                ResultKt.throwOnFailure(obj);
                return (PaginatedResult) obj;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
