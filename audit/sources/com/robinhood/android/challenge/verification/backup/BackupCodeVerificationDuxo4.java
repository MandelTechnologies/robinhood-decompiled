package com.robinhood.android.challenge.verification.backup;

import com.robinhood.android.challenge.verification.ChallengeVerificationDataState;
import com.robinhood.models.p355ui.identi.UiProfileInfo;
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
@DebugMetadata(m3644c = "com.robinhood.android.challenge.verification.backup.BackupCodeVerificationDuxo$onResume$2$1", m3645f = "BackupCodeVerificationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.challenge.verification.backup.BackupCodeVerificationDuxo$onResume$2$1, reason: use source file name */
/* loaded from: classes7.dex */
final class BackupCodeVerificationDuxo4 extends ContinuationImpl7 implements Function2<ChallengeVerificationDataState, Continuation<? super ChallengeVerificationDataState>, Object> {
    final /* synthetic */ UiProfileInfo $profileInfo;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BackupCodeVerificationDuxo4(UiProfileInfo uiProfileInfo, Continuation<? super BackupCodeVerificationDuxo4> continuation) {
        super(2, continuation);
        this.$profileInfo = uiProfileInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BackupCodeVerificationDuxo4 backupCodeVerificationDuxo4 = new BackupCodeVerificationDuxo4(this.$profileInfo, continuation);
        backupCodeVerificationDuxo4.L$0 = obj;
        return backupCodeVerificationDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ChallengeVerificationDataState challengeVerificationDataState, Continuation<? super ChallengeVerificationDataState> continuation) {
        return ((BackupCodeVerificationDuxo4) create(challengeVerificationDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ChallengeVerificationDataState.copy$default((ChallengeVerificationDataState) this.L$0, null, null, this.$profileInfo, null, false, null, null, false, false, false, 1019, null);
    }
}
