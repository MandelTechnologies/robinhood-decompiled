package com.robinhood.store.supportchat.salesforce;

import com.salesforce.android.smi.core.CoreClient;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.Produce4;

/* compiled from: SalesforceChatStore.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/salesforce/android/smi/core/CoreClient;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.store.supportchat.salesforce.SalesforceChatStore$coreClientFlow$1", m3645f = "SalesforceChatStore.kt", m3646l = {100, 103, 105}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$coreClientFlow$1, reason: use source file name */
/* loaded from: classes12.dex */
final class SalesforceChatStore2 extends ContinuationImpl7 implements Function2<Produce4<? super CoreClient>, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ SalesforceChatStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SalesforceChatStore2(SalesforceChatStore salesforceChatStore, Continuation<? super SalesforceChatStore2> continuation) {
        super(2, continuation);
        this.this$0 = salesforceChatStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SalesforceChatStore2 salesforceChatStore2 = new SalesforceChatStore2(this.this$0, continuation);
        salesforceChatStore2.L$0 = obj;
        return salesforceChatStore2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Produce4<? super CoreClient> produce4, Continuation<? super Unit> continuation) {
        return ((SalesforceChatStore2) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009d, code lost:
    
        if (kotlinx.coroutines.channels.Produce.awaitClose(r3, r4, r6) != r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws IOException {
        Produce4 produce4;
        final CoreClient coreClientCreateCoreClient;
        Produce4 produce42;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            produce4 = (Produce4) this.L$0;
            coreClientCreateCoreClient = this.this$0.coreClientFactory.createCoreClient();
            coreClientCreateCoreClient.registerUserVerificationProvider(this.this$0.tokenRefresher);
            if (!this.this$0.coreClientStarted.get()) {
                coreClientCreateCoreClient.start(this.this$0.getStoreScope());
                this.this$0.coreClientStarted.set(true);
            }
            this.L$0 = produce4;
            this.L$1 = coreClientCreateCoreClient;
            this.label = 1;
            if (coreClientCreateCoreClient.revokeToken(false, this) != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            coreClientCreateCoreClient = (CoreClient) this.L$1;
            Produce4 produce43 = (Produce4) this.L$0;
            ResultKt.throwOnFailure(obj);
            produce4 = produce43;
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            coreClientCreateCoreClient = (CoreClient) this.L$1;
            produce42 = (Produce4) this.L$0;
            ResultKt.throwOnFailure(obj);
            final SalesforceChatStore salesforceChatStore = this.this$0;
            Function0 function0 = new Function0() { // from class: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$coreClientFlow$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SalesforceChatStore2.invokeSuspend$lambda$0(coreClientCreateCoreClient, salesforceChatStore);
                }
            };
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        this.L$0 = produce4;
        this.L$1 = coreClientCreateCoreClient;
        this.label = 2;
        if (produce4.send(coreClientCreateCoreClient, this) != coroutine_suspended) {
            produce42 = produce4;
            final SalesforceChatStore salesforceChatStore2 = this.this$0;
            Function0 function02 = new Function0() { // from class: com.robinhood.store.supportchat.salesforce.SalesforceChatStore$coreClientFlow$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return SalesforceChatStore2.invokeSuspend$lambda$0(coreClientCreateCoreClient, salesforceChatStore2);
                }
            };
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0(CoreClient coreClient, SalesforceChatStore salesforceChatStore) {
        coreClient.stop();
        salesforceChatStore.coreClientStarted.set(false);
        return Unit.INSTANCE;
    }
}
