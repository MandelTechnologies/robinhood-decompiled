package com.robinhood.librobinhood.data.store.alert;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.advanced.alert.api.ApiAdvancedAlert;
import com.robinhood.models.advanced.alert.api.ApiAdvancedAlert2;
import com.robinhood.models.advanced.alert.api.ApiDeleteAdvancedAlertSettingRequest;
import com.robinhood.utils.Optional;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: AdvancedAlertStore.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0018\u0010\u0002\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\n"}, m3636d2 = {"<anonymous>", "", "params", "Lkotlin/Triple;", "Lcom/robinhood/models/advanced/alert/api/AdvancedAlertEntityType;", "Ljava/util/UUID;", "Lcom/robinhood/models/advanced/alert/api/ApiDeleteAdvancedAlertSettingRequest;", "alert", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/advanced/alert/api/ApiAdvancedAlert;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore$deleteIndicatorAlert$2", m3645f = "AdvancedAlertStore.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AdvancedAlertStore$deleteIndicatorAlert$2 extends ContinuationImpl7 implements Function3<Tuples3<? extends ApiAdvancedAlert2, ? extends UUID, ? extends ApiDeleteAdvancedAlertSettingRequest>, Optional<? extends ApiAdvancedAlert>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ AdvancedAlertStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvancedAlertStore$deleteIndicatorAlert$2(AdvancedAlertStore advancedAlertStore, Continuation<? super AdvancedAlertStore$deleteIndicatorAlert$2> continuation) {
        super(3, continuation);
        this.this$0 = advancedAlertStore;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Tuples3<? extends ApiAdvancedAlert2, ? extends UUID, ? extends ApiDeleteAdvancedAlertSettingRequest> tuples3, Optional<? extends ApiAdvancedAlert> optional, Continuation<? super Unit> continuation) {
        return invoke2((Tuples3<? extends ApiAdvancedAlert2, UUID, ApiDeleteAdvancedAlertSettingRequest>) tuples3, (Optional<ApiAdvancedAlert>) optional, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples3<? extends ApiAdvancedAlert2, UUID, ApiDeleteAdvancedAlertSettingRequest> tuples3, Optional<ApiAdvancedAlert> optional, Continuation<? super Unit> continuation) {
        AdvancedAlertStore$deleteIndicatorAlert$2 advancedAlertStore$deleteIndicatorAlert$2 = new AdvancedAlertStore$deleteIndicatorAlert$2(this.this$0, continuation);
        advancedAlertStore$deleteIndicatorAlert$2.L$0 = tuples3;
        advancedAlertStore$deleteIndicatorAlert$2.L$1 = optional;
        return advancedAlertStore$deleteIndicatorAlert$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples3 tuples3 = (Tuples3) this.L$0;
            Optional optional = (Optional) this.L$1;
            Function3 function3 = this.this$0.saveAlertActionWithSettingsUpdate;
            Object first = tuples3.getFirst();
            this.L$0 = null;
            this.label = 1;
            if (function3.invoke(first, optional, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
