package com.robinhood.android.matcha.p177ui.search.contactlookup;

import com.robinhood.android.store.matcha.MatchaSearchStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ContactLookupDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/search/contactlookup/ContactLookupDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.search.contactlookup.ContactLookupDuxo$onStart$1$1", m3645f = "ContactLookupDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.matcha.ui.search.contactlookup.ContactLookupDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class ContactLookupDuxo2 extends ContinuationImpl7 implements Function2<ContactLookupDataState, Continuation<? super ContactLookupDataState>, Object> {
    final /* synthetic */ MatchaSearchStore.SearchResponse $it;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContactLookupDuxo2(MatchaSearchStore.SearchResponse searchResponse, Continuation<? super ContactLookupDuxo2> continuation) {
        super(2, continuation);
        this.$it = searchResponse;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ContactLookupDuxo2 contactLookupDuxo2 = new ContactLookupDuxo2(this.$it, continuation);
        contactLookupDuxo2.L$0 = obj;
        return contactLookupDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ContactLookupDataState contactLookupDataState, Continuation<? super ContactLookupDataState> continuation) {
        return ((ContactLookupDuxo2) create(contactLookupDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ContactLookupDataState.copy$default((ContactLookupDataState) this.L$0, null, this.$it, null, 5, null);
    }
}
