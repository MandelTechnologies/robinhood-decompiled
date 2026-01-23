package com.robinhood.android.matcha.p177ui.p178qr;

import com.robinhood.models.api.identi.ApiOptOutConsentStatus;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: MatchaQrCodeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/qr/MatchaQrCodeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.qr.MatchaQrCodeDuxo$onStart$6$1", m3645f = "MatchaQrCodeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.matcha.ui.qr.MatchaQrCodeDuxo$onStart$6$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MatchaQrCodeDuxo5 extends ContinuationImpl7 implements Function2<MatchaQrCodeDataState, Continuation<? super MatchaQrCodeDataState>, Object> {
    final /* synthetic */ List<ApiOptOutConsentStatus> $statuses;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchaQrCodeDuxo5(List<ApiOptOutConsentStatus> list, Continuation<? super MatchaQrCodeDuxo5> continuation) {
        super(2, continuation);
        this.$statuses = list;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MatchaQrCodeDuxo5 matchaQrCodeDuxo5 = new MatchaQrCodeDuxo5(this.$statuses, continuation);
        matchaQrCodeDuxo5.L$0 = obj;
        return matchaQrCodeDuxo5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MatchaQrCodeDataState matchaQrCodeDataState, Continuation<? super MatchaQrCodeDataState> continuation) {
        return ((MatchaQrCodeDuxo5) create(matchaQrCodeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MatchaQrCodeDataState matchaQrCodeDataState = (MatchaQrCodeDataState) this.L$0;
        List<ApiOptOutConsentStatus> list = this.$statuses;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (ApiOptOutConsentStatus apiOptOutConsentStatus : list) {
            Tuples2 tuples2M3642to = Tuples4.m3642to(apiOptOutConsentStatus.getType(), boxing.boxBoolean(apiOptOutConsentStatus.getConsent_status()));
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        return MatchaQrCodeDataState.copy$default(matchaQrCodeDataState, null, null, null, linkedHashMap, 7, null);
    }
}
