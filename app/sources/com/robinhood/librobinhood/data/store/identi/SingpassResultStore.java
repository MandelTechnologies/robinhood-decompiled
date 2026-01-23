package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.QueryKt;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.api.identi.IdentiApi;
import com.robinhood.api.utils.extensions.NetworkThrowables;
import com.robinhood.models.api.identi.ApiSingpassResult;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import retrofit2.HttpException;
import retrofit2.Response;

/* compiled from: SingpassResultStore.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0012\u001a\u00020\f*\u00020\u0013H\u0002J\u000e\u0010\u0019\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u001aJ\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0011\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/identi/SingpassResultStore;", "Lcom/robinhood/store/Store;", "identi", "Lcom/robinhood/api/identi/IdentiApi;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/identi/IdentiApi;Lcom/robinhood/utils/moshi/LazyMoshi;Lcom/robinhood/store/StoreBundle;)V", "singpassResultAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/models/api/identi/ApiSingpassResult;", "getSingpassResultAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "singpassResultAdapter$delegate", "Lkotlin/Lazy;", "defaultSingpassResult", "toApiSingpassResult", "Lretrofit2/HttpException;", "singpassResultFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "endpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "", "postSingpassResult", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "singpassResultQuery", "Lcom/robinhood/android/moria/db/Query;", "pollSingpassResult", "Lkotlinx/coroutines/flow/Flow;", "lib-store-identi_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class SingpassResultStore extends Store {
    private final ApiSingpassResult defaultSingpassResult;
    private final PostEndpoint<Unit, ApiSingpassResult> endpoint;
    private final IdentiApi identi;
    private final LazyMoshi moshi;

    /* renamed from: singpassResultAdapter$delegate, reason: from kotlin metadata */
    private final Lazy singpassResultAdapter;
    private final SharedFlow2<ApiSingpassResult> singpassResultFlow;
    private final Query<Unit, ApiSingpassResult> singpassResultQuery;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingpassResultStore(IdentiApi identi2, LazyMoshi moshi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(identi2, "identi");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.identi = identi2;
        this.moshi = moshi;
        this.singpassResultAdapter = LazyKt.lazy(new Function0() { // from class: com.robinhood.librobinhood.data.store.identi.SingpassResultStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SingpassResultStore.singpassResultAdapter_delegate$lambda$0(this.f$0);
            }
        });
        this.defaultSingpassResult = new ApiSingpassResult(false, "");
        SharedFlow2<ApiSingpassResult> sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this.singpassResultFlow = sharedFlow2MutableSharedFlow$default;
        this.endpoint = PostEndpoint.INSTANCE.create(new SingpassResultStore2(this, null), new SingpassResultStore3(sharedFlow2MutableSharedFlow$default));
        this.singpassResultQuery = Store.create$default(this, Query.INSTANCE, "streamSingpassResult", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.identi.SingpassResultStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SingpassResultStore.singpassResultQuery$lambda$1(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.identi.SingpassResultStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SingpassResultStore.singpassResultQuery$lambda$2(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    private final JsonAdapter<ApiSingpassResult> getSingpassResultAdapter() {
        return (JsonAdapter) this.singpassResultAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JsonAdapter singpassResultAdapter_delegate$lambda$0(SingpassResultStore singpassResultStore) {
        LazyMoshi lazyMoshi = singpassResultStore.moshi;
        Types types = Types.INSTANCE;
        return lazyMoshi.adapter(new TypeToken<ApiSingpassResult>() { // from class: com.robinhood.librobinhood.data.store.identi.SingpassResultStore$singpassResultAdapter_delegate$lambda$0$$inlined$getAdapter$1
        }.getType());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ApiSingpassResult toApiSingpassResult(HttpException httpException) {
        String strExtractErrorBodyString;
        ApiSingpassResult apiSingpassResultFromJson;
        Response<?> response = httpException.response();
        if (response == null || (strExtractErrorBodyString = NetworkThrowables.extractErrorBodyString(response)) == null) {
            return this.defaultSingpassResult;
        }
        try {
            apiSingpassResultFromJson = getSingpassResultAdapter().fromJson(strExtractErrorBodyString);
        } catch (Throwable th) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            apiSingpassResultFromJson = null;
        }
        return apiSingpassResultFromJson == null ? this.defaultSingpassResult : apiSingpassResultFromJson;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object endpoint$tryEmit(SharedFlow2 sharedFlow2, ApiSingpassResult apiSingpassResult, Continuation continuation) {
        sharedFlow2.tryEmit(apiSingpassResult);
        return Unit.INSTANCE;
    }

    public final Object postSingpassResult(Continuation<? super ApiSingpassResult> continuation) {
        return PostEndpoint.DefaultImpls.post$default(this.endpoint, Unit.INSTANCE, null, continuation, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow singpassResultQuery$lambda$1(SingpassResultStore singpassResultStore, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "<unused var>");
        return PostEndpoint.DefaultImpls.poll$default(singpassResultStore.endpoint, Unit.INSTANCE, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow singpassResultQuery$lambda$2(SingpassResultStore singpassResultStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return singpassResultStore.singpassResultFlow;
    }

    public final Flow<ApiSingpassResult> pollSingpassResult() {
        return QueryKt.asFlow(this.singpassResultQuery);
    }
}
