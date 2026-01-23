package com.robinhood.android.crypto.costbasis.hub;

import androidx.compose.runtime.SnapshotState4;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoCostBasisHubComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubComposableKt$CryptoCostBasisHubContent$2$1", m3645f = "CryptoCostBasisHubComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes2.dex */
final class CryptoCostBasisHubComposableKt$CryptoCostBasisHubContent$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState4<List<CryptoCostBasisHubSection>> $additionalRefreshData$delegate;
    final /* synthetic */ Function2<CryptoCostBasisHubSection, Integer, Unit> $onShowMore;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CryptoCostBasisHubComposableKt$CryptoCostBasisHubContent$2$1(SnapshotState4<? extends List<? extends CryptoCostBasisHubSection>> snapshotState4, Function2<? super CryptoCostBasisHubSection, ? super Integer, Unit> function2, Continuation<? super CryptoCostBasisHubComposableKt$CryptoCostBasisHubContent$2$1> continuation) {
        super(2, continuation);
        this.$additionalRefreshData$delegate = snapshotState4;
        this.$onShowMore = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoCostBasisHubComposableKt$CryptoCostBasisHubContent$2$1(this.$additionalRefreshData$delegate, this.$onShowMore, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoCostBasisHubComposableKt$CryptoCostBasisHubContent$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            List listCryptoCostBasisHubContent$lambda$12 = CryptoCostBasisHubComposableKt.CryptoCostBasisHubContent$lambda$12(this.$additionalRefreshData$delegate);
            if (listCryptoCostBasisHubContent$lambda$12 != null) {
                Function2<CryptoCostBasisHubSection, Integer, Unit> function2 = this.$onShowMore;
                Iterator it = listCryptoCostBasisHubContent$lambda$12.iterator();
                while (it.hasNext()) {
                    function2.invoke((CryptoCostBasisHubSection) it.next(), boxing.boxInt(1));
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
