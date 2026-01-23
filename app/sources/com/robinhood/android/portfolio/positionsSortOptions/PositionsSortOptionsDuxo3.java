package com.robinhood.android.portfolio.positionsSortOptions;

import com.robinhood.android.portfolio.contracts.PositionsSortOptionsKey;
import com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsDuxo;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.bonfire.portfolio.PositionsV2Store;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import timber.log.Timber;

/* compiled from: PositionsSortOptionsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsDuxo$onDone$1$2", m3645f = "PositionsSortOptionsDuxo.kt", m3646l = {96}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsDuxo$onDone$1$2, reason: use source file name */
/* loaded from: classes11.dex */
final class PositionsSortOptionsDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PositionsSortOptionsDataState $dataState;
    int label;
    final /* synthetic */ PositionsSortOptionsDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PositionsSortOptionsDuxo3(PositionsSortOptionsDuxo positionsSortOptionsDuxo, PositionsSortOptionsDataState positionsSortOptionsDataState, Continuation<? super PositionsSortOptionsDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = positionsSortOptionsDuxo;
        this.$dataState = positionsSortOptionsDataState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PositionsSortOptionsDuxo3(this.this$0, this.$dataState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PositionsSortOptionsDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PositionsV2Store positionsV2Store = this.this$0.positionsV2Store;
                PositionsSortOptionsDuxo.Companion companion = PositionsSortOptionsDuxo.INSTANCE;
                Job jobSortPositions = positionsV2Store.sortPositions(((PositionsSortOptionsKey) companion.getArgs((HasSavedState) this.this$0)).getAccountNumber(), ((PositionsSortOptionsKey) companion.getArgs((HasSavedState) this.this$0)).getPositionInstrumentType(), ((PositionsSortOptionsKey) companion.getArgs((HasSavedState) this.this$0)).getPositionsLocation(), this.$dataState.getSortPreference());
                this.label = 1;
                if (jobSortPositions.join(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.applyMutation(new C258461(null));
        } catch (Exception e) {
            Timber.INSTANCE.mo3355e(e, "Failed to sort positions", new Object[0]);
            this.this$0.applyMutation(new C258472(null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: PositionsSortOptionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsDuxo$onDone$1$2$1", m3645f = "PositionsSortOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsDuxo$onDone$1$2$1 */
    static final class C258461 extends ContinuationImpl7 implements Function2<PositionsSortOptionsDataState, Continuation<? super PositionsSortOptionsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C258461(Continuation<? super C258461> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C258461 c258461 = new C258461(continuation);
            c258461.L$0 = obj;
            return c258461;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PositionsSortOptionsDataState positionsSortOptionsDataState, Continuation<? super PositionsSortOptionsDataState> continuation) {
            return ((C258461) create(positionsSortOptionsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PositionsSortOptionsDataState.copy$default((PositionsSortOptionsDataState) this.L$0, null, null, null, null, false, true, 31, null);
        }
    }

    /* compiled from: PositionsSortOptionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/portfolio/positionsSortOptions/PositionsSortOptionsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsDuxo$onDone$1$2$2", m3645f = "PositionsSortOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.portfolio.positionsSortOptions.PositionsSortOptionsDuxo$onDone$1$2$2 */
    static final class C258472 extends ContinuationImpl7 implements Function2<PositionsSortOptionsDataState, Continuation<? super PositionsSortOptionsDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C258472(Continuation<? super C258472> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C258472 c258472 = new C258472(continuation);
            c258472.L$0 = obj;
            return c258472;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PositionsSortOptionsDataState positionsSortOptionsDataState, Continuation<? super PositionsSortOptionsDataState> continuation) {
            return ((C258472) create(positionsSortOptionsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PositionsSortOptionsDataState.copy$default((PositionsSortOptionsDataState) this.L$0, null, null, null, null, false, false, 47, null);
        }
    }
}
