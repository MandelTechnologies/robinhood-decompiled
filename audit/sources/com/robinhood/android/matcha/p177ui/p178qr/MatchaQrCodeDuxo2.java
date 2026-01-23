package com.robinhood.android.matcha.p177ui.p178qr;

import com.robinhood.models.p320db.matcha.EncryptedUserId;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MatchaQrCodeDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/qr/MatchaQrCodeDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.qr.MatchaQrCodeDuxo$onStart$1$1", m3645f = "MatchaQrCodeDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.matcha.ui.qr.MatchaQrCodeDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MatchaQrCodeDuxo2 extends ContinuationImpl7 implements Function2<MatchaQrCodeDataState, Continuation<? super MatchaQrCodeDataState>, Object> {
    final /* synthetic */ EncryptedUserId $encryptedUserId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchaQrCodeDuxo2(EncryptedUserId encryptedUserId, Continuation<? super MatchaQrCodeDuxo2> continuation) {
        super(2, continuation);
        this.$encryptedUserId = encryptedUserId;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MatchaQrCodeDuxo2 matchaQrCodeDuxo2 = new MatchaQrCodeDuxo2(this.$encryptedUserId, continuation);
        matchaQrCodeDuxo2.L$0 = obj;
        return matchaQrCodeDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MatchaQrCodeDataState matchaQrCodeDataState, Continuation<? super MatchaQrCodeDataState> continuation) {
        return ((MatchaQrCodeDuxo2) create(matchaQrCodeDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return MatchaQrCodeDataState.copy$default((MatchaQrCodeDataState) this.L$0, null, this.$encryptedUserId, null, null, 13, null);
    }
}
