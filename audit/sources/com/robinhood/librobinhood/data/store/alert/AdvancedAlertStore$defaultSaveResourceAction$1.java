package com.robinhood.librobinhood.data.store.alert;

import com.robinhood.models.advanced.alert.p302db.AlertHubUiResources;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AdvancedAlertStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/advanced/alert/db/AlertHubUiResources;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore$defaultSaveResourceAction$1", m3645f = "AdvancedAlertStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AdvancedAlertStore$defaultSaveResourceAction$1 extends ContinuationImpl7 implements Function2<Optional<? extends AlertHubUiResources>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvancedAlertStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvancedAlertStore$defaultSaveResourceAction$1(AdvancedAlertStore advancedAlertStore, Continuation<? super AdvancedAlertStore$defaultSaveResourceAction$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedAlertStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvancedAlertStore$defaultSaveResourceAction$1 advancedAlertStore$defaultSaveResourceAction$1 = new AdvancedAlertStore$defaultSaveResourceAction$1(this.this$0, continuation);
        advancedAlertStore$defaultSaveResourceAction$1.L$0 = obj;
        return advancedAlertStore$defaultSaveResourceAction$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Optional<AlertHubUiResources> optional, Continuation<? super Unit> continuation) {
        return ((AdvancedAlertStore$defaultSaveResourceAction$1) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Optional<? extends AlertHubUiResources> optional, Continuation<? super Unit> continuation) {
        return invoke2((Optional<AlertHubUiResources>) optional, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AlertHubUiResources alertHubUiResources = (AlertHubUiResources) ((Optional) this.L$0).component1();
        if (alertHubUiResources != null) {
            this.this$0.resourceDao.deleteAll();
            this.this$0.resourceDao.insert(alertHubUiResources);
        }
        return Unit.INSTANCE;
    }
}
