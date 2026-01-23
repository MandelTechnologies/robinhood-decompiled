package com.robinhood.android.individualaccounts.onboarding.outro;

import androidx.compose.runtime.SnapshotState;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: LoadingAccountScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.individualaccounts.onboarding.outro.LoadingAccountScreenKt$LoadingAccountScreen$3$1$2$4$1$2$1$1", m3645f = "LoadingAccountScreen.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.individualaccounts.onboarding.outro.LoadingAccountScreenKt$LoadingAccountScreen$3$1$2$4$1$2$1$1, reason: use source file name */
/* loaded from: classes10.dex */
final class LoadingAccountScreen6 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ IndividualAccountOutroScreen $callbacks;
    final /* synthetic */ SnapshotState<Boolean> $contactSupportLoading$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoadingAccountScreen6(IndividualAccountOutroScreen individualAccountOutroScreen, SnapshotState<Boolean> snapshotState, Continuation<? super LoadingAccountScreen6> continuation) {
        super(2, continuation);
        this.$callbacks = individualAccountOutroScreen;
        this.$contactSupportLoading$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LoadingAccountScreen6(this.$callbacks, this.$contactSupportLoading$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LoadingAccountScreen6) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LoadingAccountScreen4.invoke$lambda$6$lambda$3(this.$contactSupportLoading$delegate, true);
            IndividualAccountOutroScreen individualAccountOutroScreen = this.$callbacks;
            this.label = 1;
            if (individualAccountOutroScreen.onContactSupportClicked(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        LoadingAccountScreen4.invoke$lambda$6$lambda$3(this.$contactSupportLoading$delegate, false);
        return Unit.INSTANCE;
    }
}
