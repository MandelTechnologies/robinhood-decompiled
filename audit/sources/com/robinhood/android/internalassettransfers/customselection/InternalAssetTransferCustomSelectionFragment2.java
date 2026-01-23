package com.robinhood.android.internalassettransfers.customselection;

import com.robinhood.android.internalassettransfers.AssetSelection;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: InternalAssetTransferCustomSelectionFragment.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$ComposeContent$13$1", m3645f = "InternalAssetTransferCustomSelectionFragment.kt", m3646l = {102}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$ComposeContent$13$1, reason: use source file name */
/* loaded from: classes10.dex */
final class InternalAssetTransferCustomSelectionFragment2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ InternalAssetTransferCustomSelectionFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalAssetTransferCustomSelectionFragment2(InternalAssetTransferCustomSelectionFragment internalAssetTransferCustomSelectionFragment, Continuation<? super InternalAssetTransferCustomSelectionFragment2> continuation) {
        super(2, continuation);
        this.this$0 = internalAssetTransferCustomSelectionFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InternalAssetTransferCustomSelectionFragment2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InternalAssetTransferCustomSelectionFragment2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: InternalAssetTransferCustomSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/internalassettransfers/AssetSelection;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$ComposeContent$13$1$1", m3645f = "InternalAssetTransferCustomSelectionFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.customselection.InternalAssetTransferCustomSelectionFragment$ComposeContent$13$1$1 */
    static final class C191381 extends ContinuationImpl7 implements Function2<AssetSelection, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ InternalAssetTransferCustomSelectionFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C191381(InternalAssetTransferCustomSelectionFragment internalAssetTransferCustomSelectionFragment, Continuation<? super C191381> continuation) {
            super(2, continuation);
            this.this$0 = internalAssetTransferCustomSelectionFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C191381 c191381 = new C191381(this.this$0, continuation);
            c191381.L$0 = obj;
            return c191381;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AssetSelection assetSelection, Continuation<? super Unit> continuation) {
            return ((C191381) create(assetSelection, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                this.this$0.getDuxo().onAssetSelectionChanged((AssetSelection) this.L$0);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<AssetSelection> assetSelectionFlow = this.this$0.getCallbacks().getAssetSelectionFlow();
            C191381 c191381 = new C191381(this.this$0, null);
            this.label = 1;
            if (FlowKt.collectLatest(assetSelectionFlow, c191381, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
