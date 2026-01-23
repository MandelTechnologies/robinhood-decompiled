package com.robinhood.librobinhood.data.store.bonfire.retirement;

import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.models.retirement.api.ApiRothConversionInfoViewModel;
import com.robinhood.android.models.retirement.p194db.RothConversionInfoViewModel;
import com.robinhood.android.models.retirement.p194db.RothConversionInfoViewModel2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.Produce4;

/* compiled from: RothConversionStore.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/robinhood/android/models/retirement/db/RothConversionInfoViewModel;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.retirement.RothConversionStore$infoQuery$1$1", m3645f = "RothConversionStore.kt", m3646l = {23, 24}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.retirement.RothConversionStore$infoQuery$1$1, reason: use source file name */
/* loaded from: classes13.dex */
final class RothConversionStore2 extends ContinuationImpl7 implements Function2<Produce4<? super RothConversionInfoViewModel>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ RothConversionStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RothConversionStore2(RothConversionStore rothConversionStore, Continuation<? super RothConversionStore2> continuation) {
        super(2, continuation);
        this.this$0 = rothConversionStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        RothConversionStore2 rothConversionStore2 = new RothConversionStore2(this.this$0, continuation);
        rothConversionStore2.L$0 = obj;
        return rothConversionStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Produce4<? super RothConversionInfoViewModel> produce4, Continuation<? super Unit> continuation) {
        return ((RothConversionStore2) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        if (r1.send(r6, r5) != r0) goto L29;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Produce4 produce4;
        Exception e;
        Produce4 produce42;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Produce4 produce43 = (Produce4) this.L$0;
            try {
                RetirementApi retirementApi = this.this$0.retirementApi;
                this.L$0 = produce43;
                this.label = 1;
                Object rothConversionInfo = retirementApi.getRothConversionInfo(this);
                if (rothConversionInfo != coroutine_suspended) {
                    produce42 = produce43;
                    obj = rothConversionInfo;
                    RothConversionInfoViewModel dbModel = RothConversionInfoViewModel2.toDbModel((ApiRothConversionInfoViewModel) obj);
                    this.L$0 = produce42;
                    this.label = 2;
                }
                return coroutine_suspended;
            } catch (Exception e2) {
                produce4 = produce43;
                e = e2;
                produce4.close(e);
                return Unit.INSTANCE;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            produce4 = (Produce4) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e3) {
                e = e3;
                produce4.close(e);
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }
        produce42 = (Produce4) this.L$0;
        try {
            ResultKt.throwOnFailure(obj);
            RothConversionInfoViewModel dbModel2 = RothConversionInfoViewModel2.toDbModel((ApiRothConversionInfoViewModel) obj);
            this.L$0 = produce42;
            this.label = 2;
        } catch (Exception e4) {
            e = e4;
            produce4 = produce42;
            produce4.close(e);
            return Unit.INSTANCE;
        }
    }
}
