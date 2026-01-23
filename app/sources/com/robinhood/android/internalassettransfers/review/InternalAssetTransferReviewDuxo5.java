package com.robinhood.android.internalassettransfers.review;

import com.robinhood.android.internalassettransfers.AccountSelection;
import com.robinhood.android.internalassettransfers.accountselection.UiIatAccount;
import com.robinhood.android.internalassettransfers.presubmissionwarn.PreSubmitWarningsCheckUseCase;
import com.robinhood.android.internalassettransfers.presubmissionwarn.PresubmissionChecksAlertSheet;
import com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewEvent;
import com.robinhood.android.internalassettransfers.review.models.UiAssets;
import java.util.ArrayList;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InternalAssetTransferReviewDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewDuxo$submitWithPresubmitCheck$1$2", m3645f = "InternalAssetTransferReviewDuxo.kt", m3646l = {63}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewDuxo$submitWithPresubmitCheck$1$2, reason: use source file name */
/* loaded from: classes10.dex */
final class InternalAssetTransferReviewDuxo5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ UiAssets $assetsToTransfer;
    final /* synthetic */ UiIatAccount $sinkAccount;
    final /* synthetic */ UiIatAccount $sourceAccount;
    int label;
    final /* synthetic */ InternalAssetTransferReviewDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InternalAssetTransferReviewDuxo5(InternalAssetTransferReviewDuxo internalAssetTransferReviewDuxo, UiIatAccount uiIatAccount, UiIatAccount uiIatAccount2, UiAssets uiAssets, Continuation<? super InternalAssetTransferReviewDuxo5> continuation) {
        super(2, continuation);
        this.this$0 = internalAssetTransferReviewDuxo;
        this.$sourceAccount = uiIatAccount;
        this.$sinkAccount = uiIatAccount2;
        this.$assetsToTransfer = uiAssets;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InternalAssetTransferReviewDuxo5(this.this$0, this.$sourceAccount, this.$sinkAccount, this.$assetsToTransfer, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InternalAssetTransferReviewDuxo5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: InternalAssetTransferReviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewDuxo$submitWithPresubmitCheck$1$2$1", m3645f = "InternalAssetTransferReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewDuxo$submitWithPresubmitCheck$1$2$1 */
    static final class C192711 extends ContinuationImpl7 implements Function2<InternalAssetTransferReviewDataState, Continuation<? super InternalAssetTransferReviewDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C192711(Continuation<? super C192711> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C192711 c192711 = new C192711(continuation);
            c192711.L$0 = obj;
            return c192711;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalAssetTransferReviewDataState internalAssetTransferReviewDataState, Continuation<? super InternalAssetTransferReviewDataState> continuation) {
            return ((C192711) create(internalAssetTransferReviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InternalAssetTransferReviewDataState.copy$default((InternalAssetTransferReviewDataState) this.L$0, null, null, null, null, true, null, null, 111, null);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.this$0.applyMutation(new C192711(null));
            PreSubmitWarningsCheckUseCase preSubmitWarningsCheckUseCase = this.this$0.preSubmitWarningsCheckUseCase;
            AccountSelection accountSelection = new AccountSelection(this.$sourceAccount, this.$sinkAccount);
            UiAssets uiAssets = this.$assetsToTransfer;
            this.label = 1;
            obj = preSubmitWarningsCheckUseCase.invoke(accountSelection, uiAssets, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            this.this$0.submitTransferRequest(this.$sourceAccount, this.$sinkAccount, this.$assetsToTransfer);
            return Unit.INSTANCE;
        }
        if (list.size() == 1) {
            this.this$0.applyMutation(new C192722(list, null));
            return Unit.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((PresubmissionChecksAlertSheet) obj2).isBlocking()) {
                arrayList.add(obj2);
            }
        }
        if (!arrayList.isEmpty()) {
            this.this$0.applyMutation(new C192733(arrayList, null));
            return Unit.INSTANCE;
        }
        this.this$0.submit(new InternalAssetTransferReviewEvent.NavigateToPreSubmissionWarnsScreen(list));
        return Unit.INSTANCE;
    }

    /* compiled from: InternalAssetTransferReviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewDuxo$submitWithPresubmitCheck$1$2$2", m3645f = "InternalAssetTransferReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewDuxo$submitWithPresubmitCheck$1$2$2 */
    static final class C192722 extends ContinuationImpl7 implements Function2<InternalAssetTransferReviewDataState, Continuation<? super InternalAssetTransferReviewDataState>, Object> {
        final /* synthetic */ List<PresubmissionChecksAlertSheet> $presubmitAlerts;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C192722(List<PresubmissionChecksAlertSheet> list, Continuation<? super C192722> continuation) {
            super(2, continuation);
            this.$presubmitAlerts = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C192722 c192722 = new C192722(this.$presubmitAlerts, continuation);
            c192722.L$0 = obj;
            return c192722;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalAssetTransferReviewDataState internalAssetTransferReviewDataState, Continuation<? super InternalAssetTransferReviewDataState> continuation) {
            return ((C192722) create(internalAssetTransferReviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InternalAssetTransferReviewDataState.copy$default((InternalAssetTransferReviewDataState) this.L$0, null, null, null, null, false, null, new PresubmitAlertsWrapper(this.$presubmitAlerts, 0L, 2, null), 47, null);
        }
    }

    /* compiled from: InternalAssetTransferReviewDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/review/InternalAssetTransferReviewDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewDuxo$submitWithPresubmitCheck$1$2$3", m3645f = "InternalAssetTransferReviewDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.review.InternalAssetTransferReviewDuxo$submitWithPresubmitCheck$1$2$3 */
    static final class C192733 extends ContinuationImpl7 implements Function2<InternalAssetTransferReviewDataState, Continuation<? super InternalAssetTransferReviewDataState>, Object> {
        final /* synthetic */ List<PresubmissionChecksAlertSheet> $blockingPresubmitAlerts;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C192733(List<PresubmissionChecksAlertSheet> list, Continuation<? super C192733> continuation) {
            super(2, continuation);
            this.$blockingPresubmitAlerts = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C192733 c192733 = new C192733(this.$blockingPresubmitAlerts, continuation);
            c192733.L$0 = obj;
            return c192733;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalAssetTransferReviewDataState internalAssetTransferReviewDataState, Continuation<? super InternalAssetTransferReviewDataState> continuation) {
            return ((C192733) create(internalAssetTransferReviewDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InternalAssetTransferReviewDataState.copy$default((InternalAssetTransferReviewDataState) this.L$0, null, null, null, null, false, null, new PresubmitAlertsWrapper(CollectionsKt.listOf(CollectionsKt.first((List) this.$blockingPresubmitAlerts)), 0L, 2, null), 47, null);
        }
    }
}
