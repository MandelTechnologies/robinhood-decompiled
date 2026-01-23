package com.robinhood.android.pathfinder.corepages.supportlanding;

import com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDataState;
import com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.InvalidAuxContextException;
import com.robinhood.librobinhood.data.store.SupportLandingStore;
import com.robinhood.models.p355ui.pathfinder.auxcontext.AuxContext;
import com.robinhood.shared.support.contracts.pathfinder.SupportLandingFragmentKey;
import com.robinhood.utils.extensions.Throwables;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SupportLandingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo$fetchAccounts$2", m3645f = "SupportLandingDuxo.kt", m3646l = {88}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo$fetchAccounts$2, reason: use source file name */
/* loaded from: classes11.dex */
final class SupportLandingDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $accountType;
    int label;
    final /* synthetic */ SupportLandingDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SupportLandingDuxo3(SupportLandingDuxo supportLandingDuxo, String str, Continuation<? super SupportLandingDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = supportLandingDuxo;
        this.$accountType = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SupportLandingDuxo3(this.this$0, this.$accountType, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((SupportLandingDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SupportLandingStore supportLandingStore = this.this$0.supportLandingStore;
                SupportLandingDuxo.Companion companion = SupportLandingDuxo.INSTANCE;
                UUID inquiryId = ((SupportLandingFragmentKey) companion.getArgs((HasSavedState) this.this$0)).getInquiryId();
                int sequence = ((SupportLandingFragmentKey) companion.getArgs((HasSavedState) this.this$0)).getUserViewState().getSequence();
                String str = this.$accountType;
                this.label = 1;
                obj = supportLandingStore.fetchAccountContent(inquiryId, sequence, str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.this$0.applyMutation(new C253851(this.$accountType, new SupportLandingDataState.TabContentStatus.Success(((AuxContext.SupportLandingAccountContent) obj).getContent().getAccounts()), null));
        } catch (Throwable th) {
            if (Throwables.isNetworkRelated(th) || (th instanceof InvalidAuxContextException)) {
                this.this$0.applyMutation(new C253862(this.$accountType, null));
            } else {
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    /* compiled from: SupportLandingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo$fetchAccounts$2$1", m3645f = "SupportLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo$fetchAccounts$2$1 */
    static final class C253851 extends ContinuationImpl7 implements Function2<SupportLandingDataState, Continuation<? super SupportLandingDataState>, Object> {
        final /* synthetic */ String $accountType;
        final /* synthetic */ SupportLandingDataState.TabContentStatus.Success $newTabStatus;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C253851(String str, SupportLandingDataState.TabContentStatus.Success success, Continuation<? super C253851> continuation) {
            super(2, continuation);
            this.$accountType = str;
            this.$newTabStatus = success;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C253851 c253851 = new C253851(this.$accountType, this.$newTabStatus, continuation);
            c253851.L$0 = obj;
            return c253851;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SupportLandingDataState supportLandingDataState, Continuation<? super SupportLandingDataState> continuation) {
            return ((C253851) create(supportLandingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SupportLandingDataState supportLandingDataState = (SupportLandingDataState) this.L$0;
            return SupportLandingDataState.copy$default(supportLandingDataState, null, null, MapsKt.plus(supportLandingDataState.getAccountTypeToTabStatus(), Tuples4.m3642to(this.$accountType, this.$newTabStatus)), null, false, 27, null);
        }
    }

    /* compiled from: SupportLandingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo$fetchAccounts$2$2", m3645f = "SupportLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.pathfinder.corepages.supportlanding.SupportLandingDuxo$fetchAccounts$2$2 */
    static final class C253862 extends ContinuationImpl7 implements Function2<SupportLandingDataState, Continuation<? super SupportLandingDataState>, Object> {
        final /* synthetic */ String $accountType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C253862(String str, Continuation<? super C253862> continuation) {
            super(2, continuation);
            this.$accountType = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C253862 c253862 = new C253862(this.$accountType, continuation);
            c253862.L$0 = obj;
            return c253862;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SupportLandingDataState supportLandingDataState, Continuation<? super SupportLandingDataState> continuation) {
            return ((C253862) create(supportLandingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SupportLandingDataState supportLandingDataState = (SupportLandingDataState) this.L$0;
            return SupportLandingDataState.copy$default(supportLandingDataState, null, null, MapsKt.plus(supportLandingDataState.getAccountTypeToTabStatus(), Tuples4.m3642to(this.$accountType, SupportLandingDataState.TabContentStatus.Error.INSTANCE)), null, false, 27, null);
        }
    }
}
