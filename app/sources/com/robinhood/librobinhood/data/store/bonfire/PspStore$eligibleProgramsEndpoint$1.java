package com.robinhood.librobinhood.data.store.bonfire;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.psp.PspApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.models.CommaSeparatedList;
import com.robinhood.models.CommaSeparatedList2;
import com.robinhood.models.api.bonfire.ApiEligibleProgram;
import com.robinhood.utils.Optional;
import io.reactivex.Single;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.rx2.RxAwait3;
import retrofit2.Response;

/* compiled from: PspStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, m3636d2 = {"<anonymous>", "Lretrofit2/Response;", "", "Lcom/robinhood/models/api/bonfire/ApiEligibleProgram;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PspStore$eligibleProgramsEndpoint$1", m3645f = "PspStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, 87}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class PspStore$eligibleProgramsEndpoint$1 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Response<List<? extends ApiEligibleProgram>>>, Object> {
    final /* synthetic */ AccountProvider $accountProvider;
    int label;
    final /* synthetic */ PspStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PspStore$eligibleProgramsEndpoint$1(AccountProvider accountProvider, PspStore pspStore, Continuation<? super PspStore$eligibleProgramsEndpoint$1> continuation) {
        super(2, continuation);
        this.$accountProvider = accountProvider;
        this.this$0 = pspStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PspStore$eligibleProgramsEndpoint$1(this.$accountProvider, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Unit unit, Continuation<? super Response<List<? extends ApiEligibleProgram>>> continuation) {
        return invoke2(unit, (Continuation<? super Response<List<ApiEligibleProgram>>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Unit unit, Continuation<? super Response<List<ApiEligibleProgram>>> continuation) {
        return ((PspStore$eligibleProgramsEndpoint$1) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r5 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Single<Optional<String>> individualAccountNumber = this.$accountProvider.getIndividualAccountNumber();
            this.label = 1;
            obj = RxAwait3.await(individualAccountNumber, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return (Response) obj;
        }
        ResultKt.throwOnFailure(obj);
        String str = (String) ((Optional) obj).component1();
        if (str != null) {
            PspApi pspApi = this.this$0.api;
            CommaSeparatedList<String> commaSeparatedList = CommaSeparatedList2.toCommaSeparatedList(CollectionsKt.listOf(str));
            this.label = 2;
            obj = pspApi.getEligiblePrograms(commaSeparatedList, this);
        } else {
            Response responseSuccess = Response.success(CollectionsKt.emptyList());
            Intrinsics.checkNotNull(responseSuccess);
            return responseSuccess;
        }
    }
}
