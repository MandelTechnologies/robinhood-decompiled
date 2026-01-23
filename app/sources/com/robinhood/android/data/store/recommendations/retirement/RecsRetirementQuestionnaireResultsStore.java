package com.robinhood.android.data.store.recommendations.retirement;

import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.api.retrofit.RecsRetirementApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.recommendations.retirement.models.api.ApiQuestionnaireResults;
import com.robinhood.recommendations.retirement.models.api.ApiQuestionnaireResultsRequestBody;
import com.robinhood.recommendations.retirement.models.p364ui.UiQuestionnaireResults;
import com.robinhood.recommendations.retirement.models.p364ui.UiQuestionnaireResults2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RecsRetirementQuestionnaireResultsStore.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/data/store/recommendations/retirement/RecsRetirementQuestionnaireResultsStore;", "Lcom/robinhood/store/Store;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "recsRetirementApi", "Lcom/robinhood/api/retrofit/RecsRetirementApi;", "<init>", "(Lcom/robinhood/store/StoreBundle;Lcom/robinhood/api/retrofit/RecsRetirementApi;)V", "endpoint", "Lcom/robinhood/android/moria/network/PostEndpoint;", "Lcom/robinhood/recommendations/retirement/models/api/ApiQuestionnaireResultsRequestBody;", "Lcom/robinhood/recommendations/retirement/models/api/ApiQuestionnaireResults;", "getQuestionnaireResults", "Lio/reactivex/Single;", "Lcom/robinhood/recommendations/retirement/models/ui/UiQuestionnaireResults;", "accountNumber", "", "lib-store-recommendations-for-retirement_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class RecsRetirementQuestionnaireResultsStore extends Store {
    private final PostEndpoint<ApiQuestionnaireResultsRequestBody, ApiQuestionnaireResults> endpoint;
    private final RecsRetirementApi recsRetirementApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecsRetirementQuestionnaireResultsStore(StoreBundle storeBundle, RecsRetirementApi recsRetirementApi) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(recsRetirementApi, "recsRetirementApi");
        this.recsRetirementApi = recsRetirementApi;
        this.endpoint = PostEndpoint.INSTANCE.create(new RecsRetirementQuestionnaireResultsStore2(this, null), new RecsRetirementQuestionnaireResultsStore3(null));
    }

    /* compiled from: RecsRetirementQuestionnaireResultsStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/recommendations/retirement/models/ui/UiQuestionnaireResults;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.data.store.recommendations.retirement.RecsRetirementQuestionnaireResultsStore$getQuestionnaireResults$1", m3645f = "RecsRetirementQuestionnaireResultsStore.kt", m3646l = {28}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.data.store.recommendations.retirement.RecsRetirementQuestionnaireResultsStore$getQuestionnaireResults$1 */
    static final class C138761 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiQuestionnaireResults>, Object> {
        final /* synthetic */ String $accountNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C138761(String str, Continuation<? super C138761> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RecsRetirementQuestionnaireResultsStore.this.new C138761(this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiQuestionnaireResults> continuation) {
            return ((C138761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PostEndpoint postEndpoint = RecsRetirementQuestionnaireResultsStore.this.endpoint;
                ApiQuestionnaireResultsRequestBody apiQuestionnaireResultsRequestBody = new ApiQuestionnaireResultsRequestBody(this.$accountNumber);
                this.label = 1;
                obj = PostEndpoint.DefaultImpls.post$default(postEndpoint, apiQuestionnaireResultsRequestBody, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return UiQuestionnaireResults2.toUiModel((ApiQuestionnaireResults) obj);
        }
    }

    public final Single<UiQuestionnaireResults> getQuestionnaireResults(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C138761(accountNumber, null), 1, null);
    }
}
