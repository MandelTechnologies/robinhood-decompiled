package com.robinhood.android.trade.directipo.util;

import com.robinhood.android.lib.api.directipo.DirectIpoApi;
import com.robinhood.models.api.bonfire.ApiDirectIpoPostCobFollowup;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Timeout6;

/* compiled from: DirectIpoOrderSubmissionManager.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiDirectIpoPostCobFollowup;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.trade.directipo.util.DirectIpoOrderSubmissionManager$getOrderResponse$1$followupAsync$1", m3645f = "DirectIpoOrderSubmissionManager.kt", m3646l = {61}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.trade.directipo.util.DirectIpoOrderSubmissionManager$getOrderResponse$1$followupAsync$1, reason: use source file name */
/* loaded from: classes9.dex */
final class DirectIpoOrderSubmissionManager4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiDirectIpoPostCobFollowup>, Object> {
    final /* synthetic */ UUID $orderId;
    int label;
    final /* synthetic */ DirectIpoOrderSubmissionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DirectIpoOrderSubmissionManager4(DirectIpoOrderSubmissionManager directIpoOrderSubmissionManager, UUID uuid, Continuation<? super DirectIpoOrderSubmissionManager4> continuation) {
        super(2, continuation);
        this.this$0 = directIpoOrderSubmissionManager;
        this.$orderId = uuid;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DirectIpoOrderSubmissionManager4(this.this$0, this.$orderId, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiDirectIpoPostCobFollowup> continuation) {
        return ((DirectIpoOrderSubmissionManager4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: DirectIpoOrderSubmissionManager.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiDirectIpoPostCobFollowup;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.trade.directipo.util.DirectIpoOrderSubmissionManager$getOrderResponse$1$followupAsync$1$1", m3645f = "DirectIpoOrderSubmissionManager.kt", m3646l = {63}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.trade.directipo.util.DirectIpoOrderSubmissionManager$getOrderResponse$1$followupAsync$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiDirectIpoPostCobFollowup>, Object> {
        final /* synthetic */ UUID $orderId;
        int label;
        final /* synthetic */ DirectIpoOrderSubmissionManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DirectIpoOrderSubmissionManager directIpoOrderSubmissionManager, UUID uuid, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = directIpoOrderSubmissionManager;
            this.$orderId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$orderId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiDirectIpoPostCobFollowup> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    DirectIpoApi directIpoApi = this.this$0.api;
                    UUID uuid = this.$orderId;
                    this.label = 1;
                    obj = directIpoApi.getDirectIpoPostCobFollowup(uuid, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return (ApiDirectIpoPostCobFollowup) obj;
            } catch (Exception unused) {
                return null;
            }
        }
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
        Duration.Companion companion = Duration.INSTANCE;
        long duration = Duration3.toDuration(5, DurationUnitJvm.SECONDS);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$orderId, null);
        this.label = 1;
        Object objM28790withTimeoutOrNullKLykuaI = Timeout6.m28790withTimeoutOrNullKLykuaI(duration, anonymousClass1, this);
        return objM28790withTimeoutOrNullKLykuaI == coroutine_suspended ? coroutine_suspended : objM28790withTimeoutOrNullKLykuaI;
    }
}
