package com.robinhood.librobinhood.data.store;

import com.robinhood.android.sweep.api.SweepApi;
import com.robinhood.models.api.ApiSweepsInterest;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: SweepsInterestStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "Lkotlin/Pair;", "Lcom/robinhood/utils/Optional;", "", "Lcom/robinhood/models/api/ApiSweepsInterest;", "it"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SweepsInterestStore$sweepsInterestEndpoint$1", m3645f = "SweepsInterestStore.kt", m3646l = {33}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.SweepsInterestStore$sweepsInterestEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class SweepsInterestStore2 extends ContinuationImpl7 implements Function2<Optional<? extends String>, Continuation<? super Tuples2<? extends Optional<? extends String>, ? extends ApiSweepsInterest>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SweepsInterestStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SweepsInterestStore2(SweepsInterestStore sweepsInterestStore, Continuation<? super SweepsInterestStore2> continuation) {
        super(2, continuation);
        this.this$0 = sweepsInterestStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SweepsInterestStore2 sweepsInterestStore2 = new SweepsInterestStore2(this.this$0, continuation);
        sweepsInterestStore2.L$0 = obj;
        return sweepsInterestStore2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Optional<String> optional, Continuation<? super Tuples2<? extends Optional<String>, ApiSweepsInterest>> continuation) {
        return ((SweepsInterestStore2) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Optional<? extends String> optional, Continuation<? super Tuples2<? extends Optional<? extends String>, ? extends ApiSweepsInterest>> continuation) {
        return invoke2((Optional<String>) optional, (Continuation<? super Tuples2<? extends Optional<String>, ApiSweepsInterest>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Optional optional;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Optional optional2 = (Optional) this.L$0;
            SweepApi sweepApi = this.this$0.sweepApi;
            String str = (String) optional2.getOrNull();
            this.L$0 = optional2;
            this.label = 1;
            Object sweepsInterest = sweepApi.getSweepsInterest(str, this);
            if (sweepsInterest == coroutine_suspended) {
                return coroutine_suspended;
            }
            optional = optional2;
            obj = sweepsInterest;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            optional = (Optional) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return Tuples4.m3642to(optional, obj);
    }
}
