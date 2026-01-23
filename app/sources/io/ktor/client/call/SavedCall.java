package io.ktor.client.call;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import io.ktor.utils.p478io.ByteReadChannelJVM;
import io.ktor.utils.p478io.core.ByteReadPacket;
import io.ktor.utils.p478io.core.StringsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SavedCall.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0003"}, m3636d2 = {AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE, "Lio/ktor/client/call/HttpClientCall;", "(Lio/ktor/client/call/HttpClientCall;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ktor-client-core"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* renamed from: io.ktor.client.call.SavedCallKt, reason: use source file name */
/* loaded from: classes14.dex */
public final class SavedCall {

    /* compiled from: SavedCall.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "io.ktor.client.call.SavedCallKt", m3645f = "SavedCall.kt", m3646l = {73}, m3647m = AnalyticsStrings.BUTTON_EDIT_PROFILE_SAVE)
    /* renamed from: io.ktor.client.call.SavedCallKt$save$1 */
    static final class C455611 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C455611(Continuation<? super C455611> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SavedCall.save(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object save(HttpClientCall httpClientCall, Continuation<? super HttpClientCall> continuation) {
        C455611 c455611;
        if (continuation instanceof C455611) {
            c455611 = (C455611) continuation;
            int i = c455611.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c455611.label = i - Integer.MIN_VALUE;
            } else {
                c455611 = new C455611(continuation);
            }
        }
        C455611 c4556112 = c455611;
        Object remaining$default = c4556112.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c4556112.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(remaining$default);
            ByteReadChannelJVM content = httpClientCall.getResponse().getContent();
            c4556112.L$0 = httpClientCall;
            c4556112.label = 1;
            remaining$default = ByteReadChannelJVM.DefaultImpls.readRemaining$default(content, 0L, c4556112, 1, null);
            if (remaining$default == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            httpClientCall = (HttpClientCall) c4556112.L$0;
            ResultKt.throwOnFailure(remaining$default);
        }
        return new SavedCall2(httpClientCall.getClient(), httpClientCall.getRequest(), httpClientCall.getResponse(), StringsKt.readBytes$default((ByteReadPacket) remaining$default, 0, 1, null));
    }
}
