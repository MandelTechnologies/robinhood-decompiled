package com.robinhood.android.matcha.p177ui.username;

import com.robinhood.models.p320db.Profile;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: UpdateUsernameDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/username/UpdateUsernameDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.username.UpdateUsernameDuxo$onStart$1$1", m3645f = "UpdateUsernameDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.matcha.ui.username.UpdateUsernameDuxo$onStart$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class UpdateUsernameDuxo2 extends ContinuationImpl7 implements Function2<UpdateUsernameDataState, Continuation<? super UpdateUsernameDataState>, Object> {
    final /* synthetic */ Profile $profile;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UpdateUsernameDuxo2(Profile profile, Continuation<? super UpdateUsernameDuxo2> continuation) {
        super(2, continuation);
        this.$profile = profile;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UpdateUsernameDuxo2 updateUsernameDuxo2 = new UpdateUsernameDuxo2(this.$profile, continuation);
        updateUsernameDuxo2.L$0 = obj;
        return updateUsernameDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UpdateUsernameDataState updateUsernameDataState, Continuation<? super UpdateUsernameDataState> continuation) {
        return ((UpdateUsernameDuxo2) create(updateUsernameDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return UpdateUsernameDataState.copy$default((UpdateUsernameDataState) this.L$0, this.$profile, null, false, null, 14, null);
    }
}
