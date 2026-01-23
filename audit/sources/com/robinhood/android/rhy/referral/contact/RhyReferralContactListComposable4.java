package com.robinhood.android.rhy.referral.contact;

import com.google.accompanist.permissions.PermissionState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RhyReferralContactListComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.rhy.referral.contact.RhyReferralContactListComposableKt$RhyReferralContactListComposable$3$1", m3645f = "RhyReferralContactListComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.rhy.referral.contact.RhyReferralContactListComposableKt$RhyReferralContactListComposable$3$1, reason: use source file name */
/* loaded from: classes5.dex */
final class RhyReferralContactListComposable4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $contactListPermissionGranted;
    final /* synthetic */ PermissionState $contactListPermissionState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RhyReferralContactListComposable4(Function0<Unit> function0, PermissionState permissionState, Continuation<? super RhyReferralContactListComposable4> continuation) {
        super(2, continuation);
        this.$contactListPermissionGranted = function0;
        this.$contactListPermissionState = permissionState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RhyReferralContactListComposable4(this.$contactListPermissionGranted, this.$contactListPermissionState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RhyReferralContactListComposable4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (RhyReferralContactListComposable3.RhyReferralContactListComposable$hasGrantedContactListPermission(this.$contactListPermissionState)) {
                this.$contactListPermissionGranted.invoke();
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
