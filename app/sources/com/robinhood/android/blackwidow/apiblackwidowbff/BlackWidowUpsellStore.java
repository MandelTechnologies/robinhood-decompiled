package com.robinhood.android.blackwidow.apiblackwidowbff;

import black_widow_bff.service.p026v1.BlackWidowBffService;
import black_widow_bff.service.p026v1.SendEmailAccessLinkRequestDto;
import black_widow_bff.service.p026v1.SendEmailAccessLinkResponseDto;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BlackWidowUpsellStore.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0086@¢\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/blackwidow/apiblackwidowbff/BlackWidowUpsellStore;", "Lcom/robinhood/store/Store;", "api", "Lblack_widow_bff/service/v1/BlackWidowBffService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lblack_widow_bff/service/v1/BlackWidowBffService;Lcom/robinhood/store/StoreBundle;)V", "sendEmail", "Lcom/robinhood/android/blackwidow/apiblackwidowbff/SendEmailStatus;", "source", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-api-black-widow-bff_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BlackWidowUpsellStore extends Store {
    private final BlackWidowBffService api;

    /* compiled from: BlackWidowUpsellStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.blackwidow.apiblackwidowbff.BlackWidowUpsellStore", m3645f = "BlackWidowUpsellStore.kt", m3646l = {19}, m3647m = "sendEmail")
    /* renamed from: com.robinhood.android.blackwidow.apiblackwidowbff.BlackWidowUpsellStore$sendEmail$1 */
    static final class C98601 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C98601(Continuation<? super C98601> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BlackWidowUpsellStore.this.sendEmail(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlackWidowUpsellStore(BlackWidowBffService api, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.api = api;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendEmail(String str, Continuation<? super SendEmailStatus> continuation) {
        C98601 c98601;
        Object objM28550constructorimpl;
        if (continuation instanceof C98601) {
            c98601 = (C98601) continuation;
            int i = c98601.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c98601.label = i - Integer.MIN_VALUE;
            } else {
                c98601 = new C98601(continuation);
            }
        }
        Object objSendEmailAccessLink = c98601.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c98601.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(objSendEmailAccessLink);
                SendEmailAccessLinkRequestDto sendEmailAccessLinkRequestDto = new SendEmailAccessLinkRequestDto(str);
                Result.Companion companion = Result.INSTANCE;
                BlackWidowBffService blackWidowBffService = this.api;
                c98601.label = 1;
                objSendEmailAccessLink = blackWidowBffService.SendEmailAccessLink(sendEmailAccessLinkRequestDto, c98601);
                if (objSendEmailAccessLink == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objSendEmailAccessLink);
            }
            objM28550constructorimpl = Result.m28550constructorimpl((SendEmailAccessLinkResponseDto) objSendEmailAccessLink);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
            return new SendEmailStatus(true);
        }
        return new SendEmailStatus(false);
    }
}
