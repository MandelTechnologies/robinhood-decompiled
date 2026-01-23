package com.robinhood.librobinhood.data.store.alert;

import com.robinhood.android.advanced.alert.api.AdvancedAlertApi;
import com.robinhood.models.advanced.alert.api.ApiAdvancedAlert;
import com.robinhood.models.advanced.alert.api.ApiAdvancedAlert2;
import com.robinhood.models.advanced.alert.api.ApiCreateAdvancedAlertSettingRequest;
import com.robinhood.utils.Optional;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedAlertStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/advanced/alert/api/ApiAdvancedAlert;", "param", "Lcom/robinhood/librobinhood/data/store/alert/CreateAlertParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore$createAlert$1", m3645f = "AdvancedAlertStore.kt", m3646l = {95}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AdvancedAlertStore$createAlert$1 extends ContinuationImpl7 implements Function2<CreateAlertParams, Continuation<? super Optional<? extends ApiAdvancedAlert>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvancedAlertStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvancedAlertStore$createAlert$1(AdvancedAlertStore advancedAlertStore, Continuation<? super AdvancedAlertStore$createAlert$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedAlertStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvancedAlertStore$createAlert$1 advancedAlertStore$createAlert$1 = new AdvancedAlertStore$createAlert$1(this.this$0, continuation);
        advancedAlertStore$createAlert$1.L$0 = obj;
        return advancedAlertStore$createAlert$1;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CreateAlertParams createAlertParams, Continuation<? super Optional<ApiAdvancedAlert>> continuation) {
        return ((AdvancedAlertStore$createAlert$1) create(createAlertParams, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CreateAlertParams createAlertParams, Continuation<? super Optional<? extends ApiAdvancedAlert>> continuation) {
        return invoke2(createAlertParams, (Continuation<? super Optional<ApiAdvancedAlert>>) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String serverValue;
        Optional.Companion companion;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CreateAlertParams createAlertParams = (CreateAlertParams) this.L$0;
            UUID uuidRandomUUID = UUID.randomUUID();
            Optional.Companion companion2 = Optional.INSTANCE;
            AdvancedAlertApi advancedAlertApi = this.this$0.advancedAlertApi;
            ApiAdvancedAlert2 entityType = createAlertParams.getEntityType();
            UUID entityId = createAlertParams.getEntityId();
            Intrinsics.checkNotNull(uuidRandomUUID);
            boolean allowMultiple = createAlertParams.getAllowMultiple();
            if (createAlertParams.getAllowMultiple()) {
                serverValue = SortingType.CREATED_AT.getServerValue();
            } else {
                serverValue = SortingType.SETTING_TYPE.getServerValue();
            }
            ApiCreateAdvancedAlertSettingRequest body = createAlertParams.getBody();
            this.L$0 = companion2;
            this.label = 1;
            obj = advancedAlertApi.createAdvancedAlertSettings(entityType, entityId, uuidRandomUUID, allowMultiple, serverValue, body, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            companion = companion2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion = (Optional.Companion) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return companion.m2972of(obj);
    }
}
