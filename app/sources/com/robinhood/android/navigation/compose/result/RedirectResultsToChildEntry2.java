package com.robinhood.android.navigation.compose.result;

import androidx.compose.runtime.SnapshotState4;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RedirectResultsToChildEntry.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.navigation.compose.result.RedirectResultsToChildEntryKt$RedirectResultsToChildEntry$1$1", m3645f = "RedirectResultsToChildEntry.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.navigation.compose.result.RedirectResultsToChildEntryKt$RedirectResultsToChildEntry$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class RedirectResultsToChildEntry2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    final /* synthetic */ NavController $navController;
    final /* synthetic */ SnapshotState4<Object> $result$delegate;
    final /* synthetic */ SavedStateHandle $savedStateHandle;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RedirectResultsToChildEntry2(NavController navController, String str, SavedStateHandle savedStateHandle, SnapshotState4<? extends Object> snapshotState4, Continuation<? super RedirectResultsToChildEntry2> continuation) {
        super(2, continuation);
        this.$navController = navController;
        this.$key = str;
        this.$savedStateHandle = savedStateHandle;
        this.$result$delegate = snapshotState4;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RedirectResultsToChildEntry2(this.$navController, this.$key, this.$savedStateHandle, this.$result$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RedirectResultsToChildEntry2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        SavedStateHandle savedStateHandle;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$result$delegate.getValue() != null) {
            NavBackStackEntry currentBackStackEntry = this.$navController.getCurrentBackStackEntry();
            if (currentBackStackEntry != null && (savedStateHandle = currentBackStackEntry.getSavedStateHandle()) != null) {
                savedStateHandle.set(this.$key, this.$result$delegate.getValue());
            }
            this.$savedStateHandle.getLiveData(this.$key).setValue(null);
        }
        return Unit.INSTANCE;
    }
}
