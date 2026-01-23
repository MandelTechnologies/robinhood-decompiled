package com.robinhood.librobinhood.data.store.bonfire;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.api.psp.PspApi;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.models.api.bonfire.ApiProgramDetail;
import com.robinhood.models.p320db.bonfire.ProgramDetail;
import com.robinhood.models.p320db.bonfire.ProgramDetail2;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: PspStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/bonfire/ProgramDetail;", "programId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.PspStore$programDetailEndpoint$1", m3645f = "PspStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, 109}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes13.dex */
final class PspStore$programDetailEndpoint$1 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super Optional<? extends ProgramDetail>>, Object> {
    final /* synthetic */ AccountProvider $accountProvider;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ PspStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PspStore$programDetailEndpoint$1(AccountProvider accountProvider, PspStore pspStore, Continuation<? super PspStore$programDetailEndpoint$1> continuation) {
        super(2, continuation);
        this.$accountProvider = accountProvider;
        this.this$0 = pspStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PspStore$programDetailEndpoint$1 pspStore$programDetailEndpoint$1 = new PspStore$programDetailEndpoint$1(this.$accountProvider, this.this$0, continuation);
        pspStore$programDetailEndpoint$1.L$0 = obj;
        return pspStore$programDetailEndpoint$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(UUID uuid, Continuation<? super Optional<? extends ProgramDetail>> continuation) {
        return invoke2(uuid, (Continuation<? super Optional<ProgramDetail>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(UUID uuid, Continuation<? super Optional<ProgramDetail>> continuation) {
        return ((PspStore$programDetailEndpoint$1) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        if (r6 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
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
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Optional3.asOptional(ProgramDetail2.toDbModel((ApiProgramDetail) obj));
        }
        uuid = (UUID) this.L$0;
        ResultKt.throwOnFailure(obj);
        String str = (String) ((Optional) obj).component1();
        if (str != null) {
            PspApi pspApi = this.this$0.api;
            this.L$0 = null;
            this.label = 2;
            obj = pspApi.getProgramDetail(str, uuid, this);
        } else {
            return Optional2.INSTANCE;
        }
    }
}
