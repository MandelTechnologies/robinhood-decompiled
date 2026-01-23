package com.robinhood.android.acats.plaid.partialsupport;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedContract;
import com.robinhood.android.acatsin.store.AcatsInActivityStore;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.EquityAsset;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.PlaidBrokerAssets;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* compiled from: AcatsInPlaidPartialTransferSupportedDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/partialsupport/AcatsInPlaidPartialTransferSupportedDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/acats/plaid/partialsupport/AcatsPlaidPartialTransferSupportedViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "acatsInActivityStore", "Lcom/robinhood/android/acatsin/store/AcatsInActivityStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/acatsin/store/AcatsInActivityStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInPlaidPartialTransferSupportedDuxo extends BaseDuxo4<AcatsPlaidPartialTransferSupportedViewState> implements HasSavedState {
    private final AcatsInActivityStore acatsInActivityStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsInPlaidPartialTransferSupportedDuxo(AcatsInActivityStore acatsInActivityStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new AcatsPlaidPartialTransferSupportedViewState(0, false, 3, null), duxoBundle);
        Intrinsics.checkNotNullParameter(acatsInActivityStore, "acatsInActivityStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.acatsInActivityStore = acatsInActivityStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: AcatsInPlaidPartialTransferSupportedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedDuxo$onCreate$1", m3645f = "AcatsInPlaidPartialTransferSupportedDuxo.kt", m3646l = {32}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedDuxo$onCreate$1 */
    static final class C74481 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C74481(Continuation<? super C74481> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInPlaidPartialTransferSupportedDuxo.this.new C74481(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C74481) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AcatsInActivityStore acatsInActivityStore = AcatsInPlaidPartialTransferSupportedDuxo.this.acatsInActivityStore;
                Companion companion = AcatsInPlaidPartialTransferSupportedDuxo.INSTANCE;
                Deferred plaidBrokerAssets$default = AcatsInActivityStore.getPlaidBrokerAssets$default(acatsInActivityStore, ((AcatsInPlaidPartialTransferSupportedContract.Key) companion.getArgs((HasSavedState) AcatsInPlaidPartialTransferSupportedDuxo.this)).getRhAccountNumber(), ((AcatsInPlaidPartialTransferSupportedContract.Key) companion.getArgs((HasSavedState) AcatsInPlaidPartialTransferSupportedDuxo.this)).getContraAccountNumber(), ((AcatsInPlaidPartialTransferSupportedContract.Key) companion.getArgs((HasSavedState) AcatsInPlaidPartialTransferSupportedDuxo.this)).getPlaidAccessTokenId(), false, 8, null);
                this.label = 1;
                obj = plaidBrokerAssets$default.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AcatsInPlaidPartialTransferSupportedDuxo acatsInPlaidPartialTransferSupportedDuxo = AcatsInPlaidPartialTransferSupportedDuxo.this;
            acatsInPlaidPartialTransferSupportedDuxo.applyMutation(new AnonymousClass1((PlaidBrokerAssets) obj, acatsInPlaidPartialTransferSupportedDuxo, null));
            return Unit.INSTANCE;
        }

        /* compiled from: AcatsInPlaidPartialTransferSupportedDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/plaid/partialsupport/AcatsPlaidPartialTransferSupportedViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedDuxo$onCreate$1$1", m3645f = "AcatsInPlaidPartialTransferSupportedDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.acats.plaid.partialsupport.AcatsInPlaidPartialTransferSupportedDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AcatsPlaidPartialTransferSupportedViewState, Continuation<? super AcatsPlaidPartialTransferSupportedViewState>, Object> {
            final /* synthetic */ PlaidBrokerAssets $plaidBrokerAssets;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ AcatsInPlaidPartialTransferSupportedDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PlaidBrokerAssets plaidBrokerAssets, AcatsInPlaidPartialTransferSupportedDuxo acatsInPlaidPartialTransferSupportedDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$plaidBrokerAssets = plaidBrokerAssets;
                this.this$0 = acatsInPlaidPartialTransferSupportedDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$plaidBrokerAssets, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AcatsPlaidPartialTransferSupportedViewState acatsPlaidPartialTransferSupportedViewState, Continuation<? super AcatsPlaidPartialTransferSupportedViewState> continuation) {
                return ((AnonymousClass1) create(acatsPlaidPartialTransferSupportedViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AcatsPlaidPartialTransferSupportedViewState acatsPlaidPartialTransferSupportedViewState = (AcatsPlaidPartialTransferSupportedViewState) this.L$0;
                PlaidBrokerAssets plaidBrokerAssets = this.$plaidBrokerAssets;
                Companion companion = AcatsInPlaidPartialTransferSupportedDuxo.INSTANCE;
                boolean z = false;
                int iNumSupportedAssets$default = PlaidBrokerAssets.numSupportedAssets$default(plaidBrokerAssets, ((AcatsInPlaidPartialTransferSupportedContract.Key) companion.getArgs((HasSavedState) this.this$0)).isMarginInvestingEnabled(), false, false, ((AcatsInPlaidPartialTransferSupportedContract.Key) companion.getArgs((HasSavedState) this.this$0)).isOptionsInvestingEnabled(), 6, null);
                List<EquityAsset> equityAssets = this.$plaidBrokerAssets.getEquityAssets();
                if (!(equityAssets instanceof Collection) || !equityAssets.isEmpty()) {
                    Iterator<T> it = equityAssets.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        EquityAsset equityAsset = (EquityAsset) it.next();
                        if (equityAsset.getQuantity().compareTo(BigDecimal.ZERO) < 0 && equityAsset.getBorrowFee() != null) {
                            z = true;
                            break;
                        }
                    }
                }
                return acatsPlaidPartialTransferSupportedViewState.copy(iNumSupportedAssets$default, z);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C74481(null), 3, null);
    }

    /* compiled from: AcatsInPlaidPartialTransferSupportedDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/partialsupport/AcatsInPlaidPartialTransferSupportedDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/acats/plaid/partialsupport/AcatsInPlaidPartialTransferSupportedDuxo;", "Lcom/robinhood/android/acats/plaid/partialsupport/AcatsInPlaidPartialTransferSupportedContract$Key;", "<init>", "()V", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AcatsInPlaidPartialTransferSupportedDuxo, AcatsInPlaidPartialTransferSupportedContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInPlaidPartialTransferSupportedContract.Key getArgs(SavedStateHandle savedStateHandle) {
            return (AcatsInPlaidPartialTransferSupportedContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInPlaidPartialTransferSupportedContract.Key getArgs(AcatsInPlaidPartialTransferSupportedDuxo acatsInPlaidPartialTransferSupportedDuxo) {
            return (AcatsInPlaidPartialTransferSupportedContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, acatsInPlaidPartialTransferSupportedDuxo);
        }
    }
}
