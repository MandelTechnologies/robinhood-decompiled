package com.robinhood.android.lib.margin.hub;

import com.robinhood.android.lib.margin.hub.api.MarginHubApi;
import com.robinhood.android.lib.margin.hub.api.models.MarginStatusDetailViewResponse;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MarginHubStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/margin/hub/api/models/MarginStatusDetailViewResponse;", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lib.margin.hub.MarginHubStore$marginStatusDetailEndpoint$1", m3645f = "MarginHubStore.kt", m3646l = {89}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.lib.margin.hub.MarginHubStore$marginStatusDetailEndpoint$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginHubStore7 extends ContinuationImpl7 implements Function2<String, Continuation<? super MarginStatusDetailViewResponse>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MarginHubStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginHubStore7(MarginHubStore marginHubStore, Continuation<? super MarginHubStore7> continuation) {
        super(2, continuation);
        this.this$0 = marginHubStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MarginHubStore7 marginHubStore7 = new MarginHubStore7(this.this$0, continuation);
        marginHubStore7.L$0 = obj;
        return marginHubStore7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, Continuation<? super MarginStatusDetailViewResponse> continuation) {
        return ((MarginHubStore7) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        String str;
        Exception e;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            String str2 = (String) this.L$0;
            try {
                MarginHubApi marginHubApi = this.this$0.marginHubApi;
                this.L$0 = str2;
                this.label = 1;
                Object marginStatusDetailView = marginHubApi.getMarginStatusDetailView(str2, this);
                if (marginStatusDetailView == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str = str2;
                obj = marginStatusDetailView;
            } catch (Exception e2) {
                str = str2;
                e = e2;
                return new MarginStatusDetailViewResponse.Error(str, e);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$0;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Exception e3) {
                e = e3;
                return new MarginStatusDetailViewResponse.Error(str, e);
            }
        }
        return (MarginStatusDetailViewResponse) obj;
    }
}
