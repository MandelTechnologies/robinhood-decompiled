package com.robinhood.android.data.store.gdpr;

import com.robinhood.android.api.gdpr.GdprApi;
import com.robinhood.android.gdpr.GdprConsent;
import com.robinhood.android.gdpr.GdprConsentStatus2;
import com.robinhood.android.models.gdpr.api.ApiGdprConsent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import p479j$.time.Instant;

/* compiled from: GdprStore.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m3636d2 = {"", "it", "Lkotlin/Pair;", "Lcom/robinhood/android/gdpr/GdprConsent;", "j$/time/Instant", "<anonymous>", "(V)Lkotlin/Pair;"}, m3637k = 3, m3638mv = {2, 1, 0})
@DebugMetadata(m3644c = "com.robinhood.android.data.store.gdpr.GdprStore$getEndpoint$1", m3645f = "GdprStore.kt", m3646l = {22}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.data.store.gdpr.GdprStore$getEndpoint$1, reason: use source file name */
/* loaded from: classes17.dex */
final class GdprStore2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Tuples2<? extends GdprConsent, ? extends Instant>>, Object> {
    int label;
    final /* synthetic */ GdprStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GdprStore2(GdprStore gdprStore, Continuation<? super GdprStore2> continuation) {
        super(2, continuation);
        this.this$0 = gdprStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GdprStore2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Unit unit, Continuation<? super Tuples2<? extends GdprConsent, ? extends Instant>> continuation) {
        return invoke2(unit, (Continuation<? super Tuples2<GdprConsent, Instant>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Unit unit, Continuation<? super Tuples2<GdprConsent, Instant>> continuation) {
        return ((GdprStore2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            GdprApi gdprApi = this.this$0.gdprApi;
            this.label = 1;
            obj = gdprApi.getConsent(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ApiGdprConsent apiGdprConsent = (ApiGdprConsent) obj;
        return new Tuples2(new GdprConsent(GdprConsentStatus2.toConsentStatus(apiGdprConsent.getFunctional()), GdprConsentStatus2.toConsentStatus(apiGdprConsent.getMarketing()), GdprConsentStatus2.toConsentStatus(apiGdprConsent.getPerformance())), apiGdprConsent.getLastUpdated());
    }
}
