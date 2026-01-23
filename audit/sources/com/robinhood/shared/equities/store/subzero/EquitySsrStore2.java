package com.robinhood.shared.equities.store.subzero;

import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.shared.equities.subzero.ApiEquitySsr;
import com.robinhood.shared.equities.subzero.ApiEquitySsrData;
import com.robinhood.shared.equities.subzero.ApiEquitySsrResponseList;
import java.util.ArrayList;
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
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EquitySsrStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/shared/equities/subzero/ApiEquitySsrData;", "ids", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.equities.store.subzero.EquitySsrStore$getEquitySsr$1", m3645f = "EquitySsrStore.kt", m3646l = {20}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.shared.equities.store.subzero.EquitySsrStore$getEquitySsr$1, reason: use source file name */
/* loaded from: classes6.dex */
final class EquitySsrStore2 extends ContinuationImpl7 implements Function2<String, Continuation<? super List<? extends ApiEquitySsrData>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ EquitySsrStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquitySsrStore2(EquitySsrStore equitySsrStore, Continuation<? super EquitySsrStore2> continuation) {
        super(2, continuation);
        this.this$0 = equitySsrStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        EquitySsrStore2 equitySsrStore2 = new EquitySsrStore2(this.this$0, continuation);
        equitySsrStore2.L$0 = obj;
        return equitySsrStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(String str, Continuation<? super List<? extends ApiEquitySsrData>> continuation) {
        return invoke2(str, (Continuation<? super List<ApiEquitySsrData>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(String str, Continuation<? super List<ApiEquitySsrData>> continuation) {
        return ((EquitySsrStore2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        List<ApiEquitySsr> data;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str = (String) this.L$0;
            EquitiesBrokeback equitiesBrokeback = this.this$0.brokeback;
            this.label = 1;
            obj = equitiesBrokeback.getEquitySsr(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ApiEquitySsrResponseList apiEquitySsrResponseList = (ApiEquitySsrResponseList) obj;
        if (apiEquitySsrResponseList == null || (data = apiEquitySsrResponseList.getData()) == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (ApiEquitySsr apiEquitySsr : data) {
            ApiEquitySsrData data2 = apiEquitySsr != null ? apiEquitySsr.getData() : null;
            if (data2 != null) {
                arrayList.add(data2);
            }
        }
        return arrayList;
    }
}
