package com.robinhood.android.data.store.gdpr;

import com.robinhood.android.gdpr.GdprConsent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import p479j$.time.Instant;

/* compiled from: GdprStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m3636d2 = {"Lkotlin/Pair;", "Lcom/robinhood/android/gdpr/GdprConsent;", "j$/time/Instant", "<unused var>", "", "<anonymous>", "(Lkotlin/Pair;Lkotlin/Pair;)V"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.data.store.gdpr.GdprStore$postEndpoint$2", m3645f = "GdprStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.data.store.gdpr.GdprStore$postEndpoint$2, reason: use source file name */
/* loaded from: classes17.dex */
final class GdprStore5 extends ContinuationImpl7 implements Function3<Tuples2<? extends GdprConsent, ? extends Instant>, Tuples2<? extends GdprConsent, ? extends Instant>, Continuation<? super Unit>, Object> {
    int label;

    GdprStore5(Continuation<? super GdprStore5> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends GdprConsent, ? extends Instant> tuples2, Tuples2<? extends GdprConsent, ? extends Instant> tuples22, Continuation<? super Unit> continuation) {
        return invoke2((Tuples2<GdprConsent, Instant>) tuples2, (Tuples2<GdprConsent, Instant>) tuples22, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<GdprConsent, Instant> tuples2, Tuples2<GdprConsent, Instant> tuples22, Continuation<? super Unit> continuation) {
        return new GdprStore5(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
