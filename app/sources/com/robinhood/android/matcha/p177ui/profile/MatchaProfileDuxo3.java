package com.robinhood.android.matcha.p177ui.profile;

import com.robinhood.models.api.bonfire.ApiSocialProfileInfo;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: MatchaProfileDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/profile/MatchaProfileDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.profile.MatchaProfileDuxo$toggleBlockState$2$2$1", m3645f = "MatchaProfileDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.matcha.ui.profile.MatchaProfileDuxo$toggleBlockState$2$2$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MatchaProfileDuxo3 extends ContinuationImpl7 implements Function2<MatchaProfileDataState, Continuation<? super MatchaProfileDataState>, Object> {
    final /* synthetic */ ApiSocialProfileInfo $socialProfileResponse;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MatchaProfileDuxo3(ApiSocialProfileInfo apiSocialProfileInfo, Continuation<? super MatchaProfileDuxo3> continuation) {
        super(2, continuation);
        this.$socialProfileResponse = apiSocialProfileInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MatchaProfileDuxo3 matchaProfileDuxo3 = new MatchaProfileDuxo3(this.$socialProfileResponse, continuation);
        matchaProfileDuxo3.L$0 = obj;
        return matchaProfileDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(MatchaProfileDataState matchaProfileDataState, Continuation<? super MatchaProfileDataState> continuation) {
        return ((MatchaProfileDuxo3) create(matchaProfileDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return MatchaProfileDataState.copy$default((MatchaProfileDataState) this.L$0, false, null, false, null, this.$socialProfileResponse, false, null, 111, null);
    }
}
