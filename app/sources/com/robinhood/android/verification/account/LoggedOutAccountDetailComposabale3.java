package com.robinhood.android.verification.account;

import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.verification.account.LoggedOutAccountDetailComposabale;
import com.robinhood.models.p355ui.PhoneNumber;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: LoggedOutAccountDetailComposabale.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.verification.account.LoggedOutAccountDetailComposabaleKt$LoggedOutAccountDetailComposable$1$3$1", m3645f = "LoggedOutAccountDetailComposabale.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.verification.account.LoggedOutAccountDetailComposabaleKt$LoggedOutAccountDetailComposable$1$3$1, reason: use source file name */
/* loaded from: classes9.dex */
final class LoggedOutAccountDetailComposabale3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<PhoneNumber> $numberInput$delegate;
    final /* synthetic */ Function1<PhoneNumber, Unit> $onNumberChanged;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LoggedOutAccountDetailComposabale3(Function1<? super PhoneNumber, Unit> function1, SnapshotState<PhoneNumber> snapshotState, Continuation<? super LoggedOutAccountDetailComposabale3> continuation) {
        super(2, continuation);
        this.$onNumberChanged = function1;
        this.$numberInput$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LoggedOutAccountDetailComposabale3(this.$onNumberChanged, this.$numberInput$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LoggedOutAccountDetailComposabale3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(200L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$onNumberChanged.invoke(LoggedOutAccountDetailComposabale.C313761.invoke$lambda$6(this.$numberInput$delegate));
        return Unit.INSTANCE;
    }
}
