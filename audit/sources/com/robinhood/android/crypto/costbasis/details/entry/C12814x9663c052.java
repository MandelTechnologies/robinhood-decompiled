package com.robinhood.android.crypto.costbasis.details.entry;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt;
import com.robinhood.android.crypto.costbasis.details.entry.InputRow;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoCostBasisEntryComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposableContent$1$1$1$1", m3645f = "CryptoCostBasisEntryComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.costbasis.details.entry.CryptoCostBasisEntryComposableKt$CryptoCostBasisEntryComposableContent$1$1$1$1 */
/* loaded from: classes2.dex */
final class C12814x9663c052 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<InputRow.Type> $focusedRowType$delegate;
    final /* synthetic */ CryptoCostBasisEntryViewState $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C12814x9663c052(CryptoCostBasisEntryViewState cryptoCostBasisEntryViewState, SnapshotState<InputRow.Type> snapshotState, Continuation<? super C12814x9663c052> continuation) {
        super(2, continuation);
        this.$state = cryptoCostBasisEntryViewState;
        this.$focusedRowType$delegate = snapshotState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C12814x9663c052(this.$state, this.$focusedRowType$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C12814x9663c052) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            CryptoCostBasisEntryComposableKt.C128131.AnonymousClass1.invoke$lambda$3(this.$focusedRowType$delegate, ((InputRow) CollectionsKt.first((List) this.$state.getInputRows())).getType());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
