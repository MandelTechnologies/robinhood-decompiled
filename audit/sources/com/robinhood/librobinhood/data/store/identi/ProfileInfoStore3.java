package com.robinhood.librobinhood.data.store.identi;

import com.robinhood.models.api.identi.ApiProfileInfo;
import com.robinhood.models.p355ui.identi.UiProfileInfo2;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: ProfileInfoStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "profileInfo", "Lcom/robinhood/models/api/identi/ApiProfileInfo;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.identi.ProfileInfoStore$profileInfoEndpoint$2", m3645f = "ProfileInfoStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.identi.ProfileInfoStore$profileInfoEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class ProfileInfoStore3 extends ContinuationImpl7 implements Function2<ApiProfileInfo, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ProfileInfoStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileInfoStore3(ProfileInfoStore profileInfoStore, Continuation<? super ProfileInfoStore3> continuation) {
        super(2, continuation);
        this.this$0 = profileInfoStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ProfileInfoStore3 profileInfoStore3 = new ProfileInfoStore3(this.this$0, continuation);
        profileInfoStore3.L$0 = obj;
        return profileInfoStore3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiProfileInfo apiProfileInfo, Continuation<? super Unit> continuation) {
        return ((ProfileInfoStore3) create(apiProfileInfo, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            ((Function1) this.this$0.profileInfoSaveAction).invoke(UiProfileInfo2.toUiModel((ApiProfileInfo) this.L$0));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
