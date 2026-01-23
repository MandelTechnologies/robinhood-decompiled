package com.robinhood.android.onboarding.p205ui.usercreation;

import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.UserRegion;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: UserCreationEmailDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/onboarding/ui/usercreation/UserCreationEmailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailDuxo$onCreate$1$1", m3645f = "UserCreationEmailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.onboarding.ui.usercreation.UserCreationEmailDuxo$onCreate$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class UserCreationEmailDuxo2 extends ContinuationImpl7 implements Function2<UserCreationEmailViewState, Continuation<? super UserCreationEmailViewState>, Object> {
    final /* synthetic */ UserRegion $region;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserCreationEmailDuxo2(UserRegion userRegion, Continuation<? super UserCreationEmailDuxo2> continuation) {
        super(2, continuation);
        this.$region = userRegion;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UserCreationEmailDuxo2 userCreationEmailDuxo2 = new UserCreationEmailDuxo2(this.$region, continuation);
        userCreationEmailDuxo2.L$0 = obj;
        return userCreationEmailDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(UserCreationEmailViewState userCreationEmailViewState, Continuation<? super UserCreationEmailViewState> continuation) {
        return ((UserCreationEmailDuxo2) create(userCreationEmailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return UserCreationEmailViewState.copy$default((UserCreationEmailViewState) this.L$0, null, false, null, CountryCode.INSTANCE.parseInstance(this.$region.getRegion()), 7, null);
    }
}
