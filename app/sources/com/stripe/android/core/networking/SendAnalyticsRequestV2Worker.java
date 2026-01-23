package com.stripe.android.core.networking;

import android.app.Application;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SendAnalyticsRequestV2Worker.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, m3636d2 = {"Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/ListenableWorker$Result;", "doWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SendAnalyticsRequestV2Worker extends CoroutineWorker {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static StripeNetworkClient networkClient = new DefaultStripeNetworkClient(null, null, null, 0, null, 31, null);
    private static Function1<? super Context, ? extends AnalyticsRequestV2Storage> storage = new Function1<Context, AnalyticsRequestV2Storage2>() { // from class: com.stripe.android.core.networking.SendAnalyticsRequestV2Worker$Companion$storage$1
        @Override // kotlin.jvm.functions.Function1
        public final AnalyticsRequestV2Storage2 invoke(Context it) {
            Intrinsics.checkNotNullParameter(it, "it");
            Context applicationContext = it.getApplicationContext();
            Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
            return new AnalyticsRequestV2Storage2((Application) applicationContext);
        }
    };

    /* compiled from: SendAnalyticsRequestV2Worker.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.stripe.android.core.networking.SendAnalyticsRequestV2Worker", m3645f = "SendAnalyticsRequestV2Worker.kt", m3646l = {83, 22}, m3647m = "doWork")
    /* renamed from: com.stripe.android.core.networking.SendAnalyticsRequestV2Worker$doWork$1 */
    static final class C425221 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C425221(Continuation<? super C425221> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SendAnalyticsRequestV2Worker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendAnalyticsRequestV2Worker(Context appContext, WorkerParameters params) {
        super(appContext, params);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(params, "params");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        C425221 c425221;
        SendAnalyticsRequestV2Worker sendAnalyticsRequestV2Worker;
        SendAnalyticsRequestV2Worker sendAnalyticsRequestV2Worker2;
        SendAnalyticsRequestV2Worker sendAnalyticsRequestV2Worker3;
        Object objM28550constructorimpl;
        Throwable thM28553exceptionOrNullimpl;
        ListenableWorker.Result resultFailure;
        if (continuation instanceof C425221) {
            c425221 = (C425221) continuation;
            int i = c425221.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c425221.label = i - Integer.MIN_VALUE;
            } else {
                c425221 = new C425221(continuation);
            }
        }
        Object objRetrieve = c425221.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c425221.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objRetrieve);
            String string2 = getInputData().getString(WebsocketGatewayConstants.DATA_KEY);
            if (string2 == null) {
                ListenableWorker.Result resultFailure2 = ListenableWorker.Result.failure();
                Intrinsics.checkNotNullExpressionValue(resultFailure2, "failure(...)");
                return resultFailure2;
            }
            Function1<Context, AnalyticsRequestV2Storage> storage2 = INSTANCE.getStorage();
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            AnalyticsRequestV2Storage analyticsRequestV2StorageInvoke = storage2.invoke(applicationContext);
            c425221.L$0 = this;
            c425221.L$1 = this;
            c425221.label = 1;
            objRetrieve = analyticsRequestV2StorageInvoke.retrieve(string2, c425221);
            if (objRetrieve != coroutine_suspended) {
                sendAnalyticsRequestV2Worker = this;
                sendAnalyticsRequestV2Worker2 = sendAnalyticsRequestV2Worker;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sendAnalyticsRequestV2Worker3 = (SendAnalyticsRequestV2Worker) c425221.L$0;
            try {
                ResultKt.throwOnFailure(objRetrieve);
                objM28550constructorimpl = Result.m28550constructorimpl((StripeResponse) objRetrieve);
            } catch (Throwable th) {
                th = th;
                Result.Companion companion = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
                thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
                if (thM28553exceptionOrNullimpl == null) {
                }
                Intrinsics.checkNotNullExpressionValue(resultFailure, "fold(...)");
                return resultFailure;
            }
            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl == null) {
                if (SendAnalyticsRequestV2Worker3.getShouldRetry(thM28553exceptionOrNullimpl) && sendAnalyticsRequestV2Worker3.getRunAttemptCount() < 4) {
                    resultFailure = ListenableWorker.Result.retry();
                } else {
                    resultFailure = ListenableWorker.Result.failure();
                }
            } else {
                resultFailure = ListenableWorker.Result.success();
            }
            Intrinsics.checkNotNullExpressionValue(resultFailure, "fold(...)");
            return resultFailure;
        }
        sendAnalyticsRequestV2Worker = (SendAnalyticsRequestV2Worker) c425221.L$1;
        sendAnalyticsRequestV2Worker2 = (SendAnalyticsRequestV2Worker) c425221.L$0;
        ResultKt.throwOnFailure(objRetrieve);
        AnalyticsRequestV2 analyticsRequestV2 = (AnalyticsRequestV2) objRetrieve;
        if (analyticsRequestV2 == null) {
            ListenableWorker.Result resultFailure3 = ListenableWorker.Result.failure();
            Intrinsics.checkNotNullExpressionValue(resultFailure3, "failure(...)");
            return resultFailure3;
        }
        AnalyticsRequestV2 analyticsRequestV2WithWorkManagerParams = analyticsRequestV2.withWorkManagerParams(sendAnalyticsRequestV2Worker.getRunAttemptCount());
        try {
            Result.Companion companion2 = Result.INSTANCE;
            StripeNetworkClient stripeNetworkClient = networkClient;
            c425221.L$0 = sendAnalyticsRequestV2Worker2;
            c425221.L$1 = null;
            c425221.label = 2;
            objRetrieve = stripeNetworkClient.executeRequest(analyticsRequestV2WithWorkManagerParams, c425221);
        } catch (Throwable th2) {
            th = th2;
            sendAnalyticsRequestV2Worker3 = sendAnalyticsRequestV2Worker2;
            Result.Companion companion3 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl == null) {
            }
            Intrinsics.checkNotNullExpressionValue(resultFailure, "fold(...)");
            return resultFailure;
        }
        if (objRetrieve != coroutine_suspended) {
            sendAnalyticsRequestV2Worker3 = sendAnalyticsRequestV2Worker2;
            objM28550constructorimpl = Result.m28550constructorimpl((StripeResponse) objRetrieve);
            thM28553exceptionOrNullimpl = Result.m28553exceptionOrNullimpl(objM28550constructorimpl);
            if (thM28553exceptionOrNullimpl == null) {
            }
            Intrinsics.checkNotNullExpressionValue(resultFailure, "fold(...)");
            return resultFailure;
        }
        return coroutine_suspended;
    }

    /* compiled from: SendAnalyticsRequestV2Worker.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R<\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/stripe/android/core/networking/SendAnalyticsRequestV2Worker$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcom/stripe/android/core/networking/AnalyticsRequestV2Storage;", "<set-?>", PlaceTypes.STORAGE, "Lkotlin/jvm/functions/Function1;", "getStorage", "()Lkotlin/jvm/functions/Function1;", "", "TAG", "Ljava/lang/String;", "stripe-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Function1<Context, AnalyticsRequestV2Storage> getStorage() {
            return SendAnalyticsRequestV2Worker.storage;
        }
    }
}
