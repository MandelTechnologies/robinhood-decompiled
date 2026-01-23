package com.robinhood.librobinhood.data.store.alert;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advanced.alert.api.AdvancedAlertApi;
import com.robinhood.models.advanced.alert.api.ApiAdvancedAlert;
import com.robinhood.models.advanced.alert.api.ApiCreateIndicatorAlertRequest;
import com.robinhood.utils.Optional;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvancedAlertStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/advanced/alert/api/ApiAdvancedAlert;", "<destruct>", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/models/advanced/alert/api/ApiCreateIndicatorAlertRequest;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.alert.AdvancedAlertStore$createIndicatorAlert$1", m3645f = "AdvancedAlertStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class AdvancedAlertStore$createIndicatorAlert$1 extends ContinuationImpl7 implements Function2<Tuples2<? extends UUID, ? extends ApiCreateIndicatorAlertRequest>, Continuation<? super Optional<? extends ApiAdvancedAlert>>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AdvancedAlertStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdvancedAlertStore$createIndicatorAlert$1(AdvancedAlertStore advancedAlertStore, Continuation<? super AdvancedAlertStore$createIndicatorAlert$1> continuation) {
        super(2, continuation);
        this.this$0 = advancedAlertStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdvancedAlertStore$createIndicatorAlert$1 advancedAlertStore$createIndicatorAlert$1 = new AdvancedAlertStore$createIndicatorAlert$1(this.this$0, continuation);
        advancedAlertStore$createIndicatorAlert$1.L$0 = obj;
        return advancedAlertStore$createIndicatorAlert$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends UUID, ? extends ApiCreateIndicatorAlertRequest> tuples2, Continuation<? super Optional<? extends ApiAdvancedAlert>> continuation) {
        return invoke2((Tuples2<UUID, ApiCreateIndicatorAlertRequest>) tuples2, (Continuation<? super Optional<ApiAdvancedAlert>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Tuples2<UUID, ApiCreateIndicatorAlertRequest> tuples2, Continuation<? super Optional<ApiAdvancedAlert>> continuation) {
        return ((AdvancedAlertStore$createIndicatorAlert$1) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Optional.Companion companion;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            UUID uuid = (UUID) tuples2.component1();
            ApiCreateIndicatorAlertRequest apiCreateIndicatorAlertRequest = (ApiCreateIndicatorAlertRequest) tuples2.component2();
            UUID uuidRandomUUID = UUID.randomUUID();
            Optional.Companion companion2 = Optional.INSTANCE;
            AdvancedAlertApi advancedAlertApi = this.this$0.advancedAlertApi;
            Intrinsics.checkNotNull(uuidRandomUUID);
            this.L$0 = companion2;
            this.label = 1;
            Object objCreateAdvancedAlertSettingsV2 = advancedAlertApi.createAdvancedAlertSettingsV2(uuid, uuidRandomUUID, true, apiCreateIndicatorAlertRequest, this);
            if (objCreateAdvancedAlertSettingsV2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            companion = companion2;
            obj = objCreateAdvancedAlertSettingsV2;
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
