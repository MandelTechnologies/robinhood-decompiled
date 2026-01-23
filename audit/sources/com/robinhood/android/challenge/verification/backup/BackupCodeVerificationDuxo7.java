package com.robinhood.android.challenge.verification.backup;

import com.adjust.sdk.network.ErrorCodes;
import com.robinhood.android.challenge.verification.ChallengeVerificationDataState;
import com.robinhood.android.challenge.verification.ChallengeVerificationEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: BackupCodeVerificationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/challenge/verification/ChallengeVerificationDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.challenge.verification.backup.BackupCodeVerificationDuxo$submitChallenge$3$2", m3645f = "BackupCodeVerificationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationDuxo$submitChallenge$3$2, reason: use source file name */
/* loaded from: classes7.dex */
final class BackupCodeVerificationDuxo7 extends ContinuationImpl7 implements Function2<ChallengeVerificationDataState, Continuation<? super ChallengeVerificationDataState>, Object> {

    /* renamed from: $t */
    final /* synthetic */ Throwable f3949$t;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BackupCodeVerificationDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BackupCodeVerificationDuxo7(BackupCodeVerificationDuxo backupCodeVerificationDuxo, Throwable th, Continuation<? super BackupCodeVerificationDuxo7> continuation) {
        super(2, continuation);
        this.this$0 = backupCodeVerificationDuxo;
        this.f3949$t = th;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BackupCodeVerificationDuxo7 backupCodeVerificationDuxo7 = new BackupCodeVerificationDuxo7(this.this$0, this.f3949$t, continuation);
        backupCodeVerificationDuxo7.L$0 = obj;
        return backupCodeVerificationDuxo7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ChallengeVerificationDataState challengeVerificationDataState, Continuation<? super ChallengeVerificationDataState> continuation) {
        return ((BackupCodeVerificationDuxo7) create(challengeVerificationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        ChallengeVerificationDataState challengeVerificationDataState = (ChallengeVerificationDataState) this.L$0;
        this.this$0.submit(new ChallengeVerificationEvent.Error(this.f3949$t));
        return ChallengeVerificationDataState.copy$default(challengeVerificationDataState, null, null, null, null, false, null, null, false, false, false, ErrorCodes.IO_EXCEPTION, null);
    }
}
