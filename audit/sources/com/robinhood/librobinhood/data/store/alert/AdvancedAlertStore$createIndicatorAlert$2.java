package com.robinhood.librobinhood.data.store.alert;

import com.plaid.internal.EnumC7081g;
import com.robinhood.models.advanced.alert.api.ApiAdvancedAlert;
import com.robinhood.models.advanced.alert.api.ApiAdvancedAlert2;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* compiled from: AdvancedAlertStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "alert", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/advanced/alert/api/ApiAdvancedAlert;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore$createIndicatorAlert$2", m3645f = "AdvancedAlertStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AdvancedAlertStore$createIndicatorAlert$2 extends ContinuationImpl7 implements Function2<Optional<? extends ApiAdvancedAlert>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvancedAlertStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvancedAlertStore$createIndicatorAlert$2(AdvancedAlertStore advancedAlertStore, Continuation<? super AdvancedAlertStore$createIndicatorAlert$2> continuation) {
        super(2, continuation);
        this.this$0 = advancedAlertStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvancedAlertStore$createIndicatorAlert$2 advancedAlertStore$createIndicatorAlert$2 = new AdvancedAlertStore$createIndicatorAlert$2(this.this$0, continuation);
        advancedAlertStore$createIndicatorAlert$2.L$0 = obj;
        return advancedAlertStore$createIndicatorAlert$2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Optional<ApiAdvancedAlert> optional, Continuation<? super Unit> continuation) {
        return ((AdvancedAlertStore$createIndicatorAlert$2) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Optional<? extends ApiAdvancedAlert> optional, Continuation<? super Unit> continuation) {
        return invoke2((Optional<ApiAdvancedAlert>) optional, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Optional optional = (Optional) this.L$0;
            Function3 function3 = this.this$0.saveAlertActionWithSettingsUpdate;
            ApiAdvancedAlert2 apiAdvancedAlert2 = ApiAdvancedAlert2.INSTRUMENTS;
            this.label = 1;
            if (function3.invoke(apiAdvancedAlert2, optional, this) == coroutine_suspended) {
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
