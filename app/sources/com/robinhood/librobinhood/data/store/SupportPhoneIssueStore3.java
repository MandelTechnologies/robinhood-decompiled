package com.robinhood.librobinhood.data.store;

import com.robinhood.models.api.ApiSimpleIssue;
import com.robinhood.models.p355ui.SimpleIssue2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow2;
import retrofit2.Response;

/* compiled from: SupportPhoneIssueStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "response", "Lretrofit2/Response;", "", "Lcom/robinhood/models/api/ApiSimpleIssue;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$activeIssuesEndpoint$2", m3645f = "SupportPhoneIssueStore.kt", m3646l = {76}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$activeIssuesEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class SupportPhoneIssueStore3 extends ContinuationImpl7 implements Function2<Response<List<? extends ApiSimpleIssue>>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SupportPhoneIssueStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SupportPhoneIssueStore3(SupportPhoneIssueStore supportPhoneIssueStore, Continuation<? super SupportPhoneIssueStore3> continuation) {
        super(2, continuation);
        this.this$0 = supportPhoneIssueStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SupportPhoneIssueStore3 supportPhoneIssueStore3 = new SupportPhoneIssueStore3(this.this$0, continuation);
        supportPhoneIssueStore3.L$0 = obj;
        return supportPhoneIssueStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Response<List<? extends ApiSimpleIssue>> response, Continuation<? super Unit> continuation) {
        return invoke2((Response<List<ApiSimpleIssue>>) response, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Response<List<ApiSimpleIssue>> response, Continuation<? super Unit> continuation) {
        return ((SupportPhoneIssueStore3) create(response, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            List list = (List) ((Response) this.L$0).body();
            if (list != null) {
                SupportPhoneIssueStore supportPhoneIssueStore = this.this$0;
                List list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(SimpleIssue2.toUiModel((ApiSimpleIssue) it.next()));
                }
                StateFlow2 stateFlow2 = supportPhoneIssueStore.activeIssuesFlow;
                this.label = 1;
                if (stateFlow2.emit(arrayList, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
