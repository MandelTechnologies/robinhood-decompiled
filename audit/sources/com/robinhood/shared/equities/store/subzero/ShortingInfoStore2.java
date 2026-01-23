package com.robinhood.shared.equities.store.subzero;

import com.robinhood.api.equity.EquitiesBrokeback;
import com.robinhood.shared.equities.subzero.ApiShortingInfo;
import com.robinhood.shared.equities.subzero.ApiShortingInfo2;
import com.robinhood.shared.equities.subzero.ShortingInfo;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ShortingInfoStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/equities/subzero/ShortingInfo;", "instrumentId", "Ljava/util/UUID;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.equities.store.subzero.ShortingInfoStore$getShortingInfo$1", m3645f = "ShortingInfoStore.kt", m3646l = {29}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.equities.store.subzero.ShortingInfoStore$getShortingInfo$1, reason: use source file name */
/* loaded from: classes6.dex */
final class ShortingInfoStore2 extends ContinuationImpl7 implements Function2<UUID, Continuation<? super ShortingInfo>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ShortingInfoStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShortingInfoStore2(ShortingInfoStore shortingInfoStore, Continuation<? super ShortingInfoStore2> continuation) {
        super(2, continuation);
        this.this$0 = shortingInfoStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShortingInfoStore2 shortingInfoStore2 = new ShortingInfoStore2(this.this$0, continuation);
        shortingInfoStore2.L$0 = obj;
        return shortingInfoStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UUID uuid, Continuation<? super ShortingInfo> continuation) {
        return ((ShortingInfoStore2) create(uuid, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UUID uuid = (UUID) this.L$0;
            EquitiesBrokeback equitiesBrokeback = this.this$0.brokeback;
            this.label = 1;
            obj = equitiesBrokeback.getShortingInfo(uuid, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ApiShortingInfo2.toShortingInfo((ApiShortingInfo) obj);
    }
}
