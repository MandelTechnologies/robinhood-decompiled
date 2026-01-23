package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.recurring.retrofit.RecurringBrokebackApi;
import com.robinhood.models.api.ApiDripEnrollment;
import com.robinhood.models.p320db.DripEnrollment;
import com.robinhood.models.p320db.DripEnrollment2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: DripSettingsStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/DripEnrollment;", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.DripSettingsStore$dripEnrollmentEndpoint$1", m3645f = "DripSettingsStore.kt", m3646l = {57}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.DripSettingsStore$dripEnrollmentEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class DripSettingsStore2 extends ContinuationImpl7 implements Function2<String, Continuation<? super DripEnrollment>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DripSettingsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DripSettingsStore2(DripSettingsStore dripSettingsStore, Continuation<? super DripSettingsStore2> continuation) {
        super(2, continuation);
        this.this$0 = dripSettingsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DripSettingsStore2 dripSettingsStore2 = new DripSettingsStore2(this.this$0, continuation);
        dripSettingsStore2.L$0 = obj;
        return dripSettingsStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super DripEnrollment> continuation) {
        return ((DripSettingsStore2) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String str;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str2 = (String) this.L$0;
            RecurringBrokebackApi recurringBrokebackApi = this.this$0.brokeback;
            this.L$0 = str2;
            this.label = 1;
            Object dripEnrollment = recurringBrokebackApi.getDripEnrollment(str2, this);
            if (dripEnrollment == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = str2;
            obj = dripEnrollment;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return DripEnrollment2.toDbModel((ApiDripEnrollment) obj, str);
    }
}
