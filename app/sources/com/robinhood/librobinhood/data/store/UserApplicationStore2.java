package com.robinhood.librobinhood.data.store;

import com.robinhood.api.retrofit.Identi;
import com.robinhood.models.api.identi.ApiIdentiApplication;
import com.robinhood.models.p355ui.identi.UiApplication;
import com.robinhood.models.p355ui.identi.UiApplication2;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import retrofit2.HttpException;

/* compiled from: UserApplicationStore.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/identi/UiApplication;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.UserApplicationStore$getApplicationEndpoint$1", m3645f = "UserApplicationStore.kt", m3646l = {34}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.UserApplicationStore$getApplicationEndpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class UserApplicationStore2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super Optional<? extends UiApplication>>, Object> {
    int label;
    final /* synthetic */ UserApplicationStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserApplicationStore2(UserApplicationStore userApplicationStore, Continuation<? super UserApplicationStore2> continuation) {
        super(2, continuation);
        this.this$0 = userApplicationStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserApplicationStore2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Unit unit, Continuation<? super Optional<? extends UiApplication>> continuation) {
        return invoke2(unit, (Continuation<? super Optional<UiApplication>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Unit unit, Continuation<? super Optional<UiApplication>> continuation) {
        return ((UserApplicationStore2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Identi identi2 = this.this$0.identi;
                this.label = 1;
                obj = identi2.getApplication(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Optional3.asOptional(UiApplication2.toUiModel((ApiIdentiApplication) obj));
        } catch (HttpException e) {
            if (e.code() == 404) {
                return Optional2.INSTANCE;
            }
            throw e;
        }
    }
}
