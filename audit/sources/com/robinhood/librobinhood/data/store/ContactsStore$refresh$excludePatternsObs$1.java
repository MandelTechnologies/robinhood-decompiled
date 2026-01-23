package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ExcludePatternsResponse;
import com.robinhood.referral.api.ContactsApi;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ContactsStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ExcludePatternsResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ContactsStore$refresh$excludePatternsObs$1", m3645f = "ContactsStore.kt", m3646l = {59}, m3647m = "invokeSuspend")
/* loaded from: classes13.dex */
final class ContactsStore$refresh$excludePatternsObs$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ExcludePatternsResponse>, Object> {
    int label;
    final /* synthetic */ ContactsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactsStore$refresh$excludePatternsObs$1(ContactsStore contactsStore, Continuation<? super ContactsStore$refresh$excludePatternsObs$1> continuation) {
        super(2, continuation);
        this.this$0 = contactsStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ContactsStore$refresh$excludePatternsObs$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ExcludePatternsResponse> continuation) {
        return ((ContactsStore$refresh$excludePatternsObs$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        ContactsApi contactsApi = this.this$0.contactsApi;
        this.label = 1;
        Object excludePatters = contactsApi.getExcludePatters(this);
        return excludePatters == coroutine_suspended ? coroutine_suspended : excludePatters;
    }
}
