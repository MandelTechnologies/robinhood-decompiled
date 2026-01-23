package com.robinhood.android.acatsin.assets;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.acats.contracts.AcatsFragmentKeys3;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.bonfire.AcatsTransferStore;
import com.robinhood.models.acats.p299db.bonfire.AcatsListPageResponse;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AcatsInAssetListDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0016B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/acatsin/assets/AcatsInAssetListDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/acatsin/assets/AcatsInAssetListDataState;", "Lcom/robinhood/android/acatsin/assets/AcatsInAssetListViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "acatsTransferStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsTransferStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/acatsin/assets/AcatsInAssetListStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/AcatsTransferStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/acatsin/assets/AcatsInAssetListStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "setAssetTypeSelection", "assetType", "Lcom/robinhood/models/api/bonfire/ApiAcatsTransfer$Asset$AssetType;", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInAssetListDuxo extends BaseDuxo<AcatsInAssetListDataState, AcatsInAssetListViewState> implements HasSavedState {
    private final AcatsTransferStore acatsTransferStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsInAssetListDuxo(AcatsTransferStore acatsTransferStore, SavedStateHandle savedStateHandle, AcatsInAssetListViewState3 stateProvider, DuxoBundle duxoBundle) {
        super(new AcatsInAssetListDataState(null, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(acatsTransferStore, "acatsTransferStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.acatsTransferStore = acatsTransferStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: AcatsInAssetListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.assets.AcatsInAssetListDuxo$onCreate$1", m3645f = "AcatsInAssetListDuxo.kt", m3646l = {29}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.acatsin.assets.AcatsInAssetListDuxo$onCreate$1 */
    static final class C77821 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C77821(Continuation<? super C77821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C77821 c77821 = AcatsInAssetListDuxo.this.new C77821(continuation);
            c77821.L$0 = obj;
            return c77821;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C77821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AcatsInAssetListDuxo acatsInAssetListDuxo = AcatsInAssetListDuxo.this;
                    Result.Companion companion = Result.INSTANCE;
                    AcatsTransferStore acatsTransferStore = acatsInAssetListDuxo.acatsTransferStore;
                    UUID acatsInTransferId = ((AcatsFragmentKeys3) AcatsInAssetListDuxo.INSTANCE.getArgs((HasSavedState) acatsInAssetListDuxo)).getAcatsInTransferId();
                    this.label = 1;
                    obj = acatsTransferStore.fetchAcatListPage(acatsInTransferId, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl((AcatsListPageResponse) obj);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            AcatsInAssetListDuxo acatsInAssetListDuxo2 = AcatsInAssetListDuxo.this;
            if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                acatsInAssetListDuxo2.applyMutation(new AcatsInAssetListDuxo2((AcatsListPageResponse) objM28550constructorimpl, null));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C77821(null));
    }

    /* compiled from: AcatsInAssetListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/assets/AcatsInAssetListDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.assets.AcatsInAssetListDuxo$setAssetTypeSelection$1", m3645f = "AcatsInAssetListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.assets.AcatsInAssetListDuxo$setAssetTypeSelection$1 */
    static final class C77831 extends ContinuationImpl7 implements Function2<AcatsInAssetListDataState, Continuation<? super AcatsInAssetListDataState>, Object> {
        final /* synthetic */ ApiAcatsTransfer.Asset.AssetType $assetType;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C77831(ApiAcatsTransfer.Asset.AssetType assetType, Continuation<? super C77831> continuation) {
            super(2, continuation);
            this.$assetType = assetType;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C77831 c77831 = new C77831(this.$assetType, continuation);
            c77831.L$0 = obj;
            return c77831;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInAssetListDataState acatsInAssetListDataState, Continuation<? super AcatsInAssetListDataState> continuation) {
            return ((C77831) create(acatsInAssetListDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInAssetListDataState.copy$default((AcatsInAssetListDataState) this.L$0, null, this.$assetType, 1, null);
        }
    }

    public final void setAssetTypeSelection(ApiAcatsTransfer.Asset.AssetType assetType) {
        applyMutation(new C77831(assetType, null));
    }

    /* compiled from: AcatsInAssetListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/assets/AcatsInAssetListDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/acatsin/assets/AcatsInAssetListDuxo;", "Lcom/robinhood/android/acats/contracts/AcatsInAssetList;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AcatsInAssetListDuxo, AcatsFragmentKeys3> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsFragmentKeys3 getArgs(SavedStateHandle savedStateHandle) {
            return (AcatsFragmentKeys3) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsFragmentKeys3 getArgs(AcatsInAssetListDuxo acatsInAssetListDuxo) {
            return (AcatsFragmentKeys3) DuxoCompanion.DefaultImpls.getArgs(this, acatsInAssetListDuxo);
        }
    }
}
