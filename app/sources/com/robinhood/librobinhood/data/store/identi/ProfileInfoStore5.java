package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.api.retrofit.Identi;
import com.robinhood.librobinhood.data.store.identi.ProfileInfoStore;
import com.robinhood.models.api.identi.ApiProfileInfo;
import com.robinhood.models.p355ui.identi.UiProfileInfo;
import com.robinhood.models.p355ui.identi.UiProfileInfo2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ProfileInfoStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/ui/identi/UiProfileInfo;", "params", "Lcom/robinhood/librobinhood/data/store/identi/ProfileInfoStore$UpdateProfileInfoParams;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.ProfileInfoStore$updateProfileInfoEndpoint$1", m3645f = "ProfileInfoStore.kt", m3646l = {42}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.identi.ProfileInfoStore$updateProfileInfoEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class ProfileInfoStore5 extends ContinuationImpl7 implements Function2<ProfileInfoStore.UpdateProfileInfoParams, Continuation<? super UiProfileInfo>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ProfileInfoStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileInfoStore5(ProfileInfoStore profileInfoStore, Continuation<? super ProfileInfoStore5> continuation) {
        super(2, continuation);
        this.this$0 = profileInfoStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProfileInfoStore5 profileInfoStore5 = new ProfileInfoStore5(this.this$0, continuation);
        profileInfoStore5.L$0 = obj;
        return profileInfoStore5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ProfileInfoStore.UpdateProfileInfoParams updateProfileInfoParams, Continuation<? super UiProfileInfo> continuation) {
        return ((ProfileInfoStore5) create(updateProfileInfoParams, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ProfileInfoStore.UpdateProfileInfoParams updateProfileInfoParams = (ProfileInfoStore.UpdateProfileInfoParams) this.L$0;
            Identi identi2 = this.this$0.identi;
            UUID challengeId = updateProfileInfoParams.getChallengeId();
            ApiProfileInfo.Request request = updateProfileInfoParams.getRequest();
            this.label = 1;
            obj = identi2.updateProfileInfo(challengeId, request, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return UiProfileInfo2.toUiModel((ApiProfileInfo) obj);
    }
}
