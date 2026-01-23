package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.librobinhood.data.store.bonfire.slip.SlipPostTradeUpsellStore;
import com.robinhood.models.api.bonfire.transfer.ApiSuggestedAmountsResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: SuggestedAmountsStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.bonfire.SuggestedAmountsStore$query$1$1", m3645f = "SuggestedAmountsStore.kt", m3646l = {120, 81}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.SuggestedAmountsStore$query$1$1, reason: use source file name */
/* loaded from: classes13.dex */
final class SuggestedAmountsStore4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $force;
    final /* synthetic */ String $guidedTransfersVariant;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ SuggestedAmountsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SuggestedAmountsStore4(SuggestedAmountsStore suggestedAmountsStore, String str, boolean z, Continuation<? super SuggestedAmountsStore4> continuation) {
        super(2, continuation);
        this.this$0 = suggestedAmountsStore;
        this.$guidedTransfersVariant = str;
        this.$force = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SuggestedAmountsStore4(this.this$0, this.$guidedTransfersVariant, this.$force, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SuggestedAmountsStore4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref.ObjectRef objectRef;
        Mutex mutex;
        SuggestedAmountsStore suggestedAmountsStore;
        Throwable th;
        Mutex mutex2;
        Ref.ObjectRef objectRef2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z = true;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                objectRef = new Ref.ObjectRef();
                Mutex mutex3 = this.this$0.mutex;
                SuggestedAmountsStore suggestedAmountsStore2 = this.this$0;
                this.L$0 = objectRef;
                this.L$1 = mutex3;
                this.L$2 = suggestedAmountsStore2;
                this.label = 1;
                if (mutex3.lock(null, this) != coroutine_suspended) {
                    mutex = mutex3;
                    suggestedAmountsStore = suggestedAmountsStore2;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) this.L$1;
                objectRef2 = (Ref.ObjectRef) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    Unit unit = Unit.INSTANCE;
                    mutex2.unlock(null);
                    Endpoint endpoint = this.this$0.endpoint;
                    String str = this.$guidedTransfersVariant;
                    if (!this.$force && objectRef2.element != 0) {
                        z = false;
                    }
                    Endpoint.DefaultImpls.refresh$default(endpoint, str, z, null, 4, null);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            suggestedAmountsStore = (SuggestedAmountsStore) this.L$2;
            mutex = (Mutex) this.L$1;
            Ref.ObjectRef objectRef3 = (Ref.ObjectRef) this.L$0;
            ResultKt.throwOnFailure(obj);
            objectRef = objectRef3;
            if (System.currentTimeMillis() - suggestedAmountsStore.lastUpdatedAtPreference.get() <= SlipPostTradeUpsellStore.MIN_PROMPT_GAP_MILLIS) {
                objectRef.element = suggestedAmountsStore.suggestedAmountsPreference.get();
            }
            SharedFlow2 sharedFlow2 = suggestedAmountsStore.transferBannerChannel;
            String str2 = (String) objectRef.element;
            ApiSuggestedAmountsResponse apiSuggestedAmountsResponse = str2 != null ? (ApiSuggestedAmountsResponse) suggestedAmountsStore.getAdapter().fromJson(str2) : null;
            this.L$0 = objectRef;
            this.L$1 = mutex;
            this.L$2 = null;
            this.label = 2;
            if (sharedFlow2.emit(apiSuggestedAmountsResponse, this) != coroutine_suspended) {
                objectRef2 = objectRef;
                mutex2 = mutex;
                Unit unit2 = Unit.INSTANCE;
                mutex2.unlock(null);
                Endpoint endpoint2 = this.this$0.endpoint;
                String str3 = this.$guidedTransfersVariant;
                if (!this.$force) {
                    z = false;
                }
                Endpoint.DefaultImpls.refresh$default(endpoint2, str3, z, null, 4, null);
                return Unit.INSTANCE;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
    }
}
