package com.robinhood.android.margin.p174ui.limit;

import com.plaid.internal.EnumC7081g;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.p320db.sheriff.User;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: MarginLimitActivityDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.margin.ui.limit.MarginLimitActivityDuxo$onCreate$1$result$1$locality$1", m3645f = "MarginLimitActivityDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitActivityDuxo$onCreate$1$result$1$locality$1, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginLimitActivityDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super CountryCode.Supported>, Object> {
    int label;
    final /* synthetic */ MarginLimitActivityDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MarginLimitActivityDuxo3(MarginLimitActivityDuxo marginLimitActivityDuxo, Continuation<? super MarginLimitActivityDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = marginLimitActivityDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MarginLimitActivityDuxo3(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CountryCode.Supported> continuation) {
        return ((MarginLimitActivityDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Observable<User> user = this.this$0.userStore.getUser();
            this.label = 1;
            obj = RxAwait3.awaitFirst(user, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return ((User) obj).getOrigin().getLocality();
    }
}
