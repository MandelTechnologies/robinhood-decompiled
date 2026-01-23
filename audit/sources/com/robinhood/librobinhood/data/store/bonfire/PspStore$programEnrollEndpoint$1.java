package com.robinhood.librobinhood.data.store.bonfire;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.psp.PspApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.models.api.bonfire.ApiPspEnrollmentResponse;
import com.robinhood.utils.Optional;
import io.reactivex.Single;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: PspStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiPspEnrollmentResponse;", "programId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PspStore$programEnrollEndpoint$1", m3645f = "PspStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, 100}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class PspStore$programEnrollEndpoint$1 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super ApiPspEnrollmentResponse>, Object> {
    final /* synthetic */ AccountProvider $accountProvider;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PspStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PspStore$programEnrollEndpoint$1(AccountProvider accountProvider, PspStore pspStore, Continuation<? super PspStore$programEnrollEndpoint$1> continuation) {
        super(2, continuation);
        this.$accountProvider = accountProvider;
        this.this$0 = pspStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PspStore$programEnrollEndpoint$1 pspStore$programEnrollEndpoint$1 = new PspStore$programEnrollEndpoint$1(this.$accountProvider, this.this$0, continuation);
        pspStore$programEnrollEndpoint$1.L$0 = obj;
        return pspStore$programEnrollEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ApiPspEnrollmentResponse> continuation) {
        return ((PspStore$programEnrollEndpoint$1) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        UUID uuid;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            uuid = (UUID) this.L$0;
            Single<Optional<String>> individualAccountNumber = this.$accountProvider.getIndividualAccountNumber();
            this.L$0 = uuid;
            this.label = 1;
            obj = RxAwait3.await(individualAccountNumber, this);
            if (obj != coroutine_suspended) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        uuid = (UUID) this.L$0;
        ResultKt.throwOnFailure(obj);
        String str = (String) ((Optional) obj).component1();
        PspApi pspApi = this.this$0.api;
        Intrinsics.checkNotNull(str);
        this.L$0 = null;
        this.label = 2;
        Object objEnrollProgram = pspApi.enrollProgram(str, uuid, this);
        return objEnrollProgram == coroutine_suspended ? coroutine_suspended : objEnrollProgram;
    }
}
