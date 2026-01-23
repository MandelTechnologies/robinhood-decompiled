package com.robinhood.android.acats.plaid.transfer.unsupported;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsContract;
import com.robinhood.android.acatsin.store.AcatsInActivityStore;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.PlaidBrokerAssets;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: AcatsInPlaidUnsupportedAssetsDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/unsupported/AcatsInPlaidUnsupportedAssetsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/acats/plaid/transfer/unsupported/AcatsInPlaidUnsupportedAssetsDataState;", "Lcom/robinhood/android/acats/plaid/transfer/unsupported/AcatsInPlaidUnsupportedAssetsViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "acatsInActivityStore", "Lcom/robinhood/android/acatsin/store/AcatsInActivityStore;", "stateProvider", "Lcom/robinhood/android/acats/plaid/transfer/unsupported/AcatsInPlaidUnsupportedAssetsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/acatsin/store/AcatsInActivityStore;Lcom/robinhood/android/acats/plaid/transfer/unsupported/AcatsInPlaidUnsupportedAssetsStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInPlaidUnsupportedAssetsDuxo extends BaseDuxo<AcatsInPlaidUnsupportedAssetsDataState, AcatsInPlaidUnsupportedAssetsViewState> implements HasSavedState {
    private final AcatsInActivityStore acatsInActivityStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AcatsInPlaidUnsupportedAssetsDuxo(AcatsInActivityStore acatsInActivityStore, AcatsInPlaidUnsupportedAssetsStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(acatsInActivityStore, "acatsInActivityStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new AcatsInPlaidUnsupportedAssetsDataState(((AcatsInPlaidUnsupportedAssetsContract.Key) companion.getArgs(savedStateHandle)).isOptionsInvestingEnabled(), ((AcatsInPlaidUnsupportedAssetsContract.Key) companion.getArgs(savedStateHandle)).isMarginInvestingEnabled(), null, 4, null), stateProvider, duxoBundle);
        this.acatsInActivityStore = acatsInActivityStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: AcatsInPlaidUnsupportedAssetsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsDuxo$onCreate$1", m3645f = "AcatsInPlaidUnsupportedAssetsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsDuxo$onCreate$1 */
    static final class C76441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C76441(Continuation<? super C76441> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInPlaidUnsupportedAssetsDuxo.this.new C76441(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C76441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AcatsInPlaidUnsupportedAssetsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/plaid/transfer/unsupported/AcatsInPlaidUnsupportedAssetsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsDuxo$onCreate$1$1", m3645f = "AcatsInPlaidUnsupportedAssetsDuxo.kt", m3646l = {37}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.acats.plaid.transfer.unsupported.AcatsInPlaidUnsupportedAssetsDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AcatsInPlaidUnsupportedAssetsDataState, Continuation<? super AcatsInPlaidUnsupportedAssetsDataState>, Object> {
            int I$0;
            int I$1;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AcatsInPlaidUnsupportedAssetsDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AcatsInPlaidUnsupportedAssetsDuxo acatsInPlaidUnsupportedAssetsDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = acatsInPlaidUnsupportedAssetsDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AcatsInPlaidUnsupportedAssetsDataState acatsInPlaidUnsupportedAssetsDataState, Continuation<? super AcatsInPlaidUnsupportedAssetsDataState> continuation) {
                return ((AnonymousClass1) create(acatsInPlaidUnsupportedAssetsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                AcatsInPlaidUnsupportedAssetsDataState acatsInPlaidUnsupportedAssetsDataState;
                int i;
                int i2;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.label;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    acatsInPlaidUnsupportedAssetsDataState = (AcatsInPlaidUnsupportedAssetsDataState) this.L$0;
                    AcatsInActivityStore acatsInActivityStore = this.this$0.acatsInActivityStore;
                    Companion companion = AcatsInPlaidUnsupportedAssetsDuxo.INSTANCE;
                    Deferred plaidBrokerAssets$default = AcatsInActivityStore.getPlaidBrokerAssets$default(acatsInActivityStore, ((AcatsInPlaidUnsupportedAssetsContract.Key) companion.getArgs((HasSavedState) this.this$0)).getRhsAccountNumber(), ((AcatsInPlaidUnsupportedAssetsContract.Key) companion.getArgs((HasSavedState) this.this$0)).getContraAccountNumber(), ((AcatsInPlaidUnsupportedAssetsContract.Key) companion.getArgs((HasSavedState) this.this$0)).getPlaidAccessTokenId(), false, 8, null);
                    this.L$0 = acatsInPlaidUnsupportedAssetsDataState;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    obj = plaidBrokerAssets$default.await(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i = 0;
                    i2 = 0;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i = this.I$1;
                    i2 = this.I$0;
                    acatsInPlaidUnsupportedAssetsDataState = (AcatsInPlaidUnsupportedAssetsDataState) this.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return AcatsInPlaidUnsupportedAssetsDataState.copy$default(acatsInPlaidUnsupportedAssetsDataState, i2 != 0, i != 0, (PlaidBrokerAssets) obj, 3, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsInPlaidUnsupportedAssetsDuxo acatsInPlaidUnsupportedAssetsDuxo = AcatsInPlaidUnsupportedAssetsDuxo.this;
            acatsInPlaidUnsupportedAssetsDuxo.applyMutation(new AnonymousClass1(acatsInPlaidUnsupportedAssetsDuxo, null));
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C76441(null), 3, null);
    }

    /* compiled from: AcatsInPlaidUnsupportedAssetsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/unsupported/AcatsInPlaidUnsupportedAssetsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/acats/plaid/transfer/unsupported/AcatsInPlaidUnsupportedAssetsDuxo;", "Lcom/robinhood/android/acats/plaid/transfer/unsupported/AcatsInPlaidUnsupportedAssetsContract$Key;", "<init>", "()V", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AcatsInPlaidUnsupportedAssetsDuxo, AcatsInPlaidUnsupportedAssetsContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInPlaidUnsupportedAssetsContract.Key getArgs(SavedStateHandle savedStateHandle) {
            return (AcatsInPlaidUnsupportedAssetsContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInPlaidUnsupportedAssetsContract.Key getArgs(AcatsInPlaidUnsupportedAssetsDuxo acatsInPlaidUnsupportedAssetsDuxo) {
            return (AcatsInPlaidUnsupportedAssetsContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, acatsInPlaidUnsupportedAssetsDuxo);
        }
    }
}
