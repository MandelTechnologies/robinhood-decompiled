package com.robinhood.android.internalassettransfers;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.assettransfers.contracts.InternalAssetTransfer;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.internalassettransfers.InternalAssetTransferEvent;
import com.robinhood.android.internalassettransfers.accountselection.UiIatAccount;
import com.robinhood.android.internalassettransfers.accountselection.accountlist.AccountSelectionListFragment;
import com.robinhood.android.internalassettransfers.customselection.equity.ShareSelection;
import com.robinhood.android.internalassettransfers.presubmissionwarn.PresubmissionChecksAlertSheet;
import com.robinhood.android.internalassettransfers.review.models.UiAssets;
import com.robinhood.android.internalassettransfers.review.models.UiAssets2;
import com.robinhood.android.internalassettransfers.review.models.UiAssets3;
import com.robinhood.android.internalassettransfers.review.models.UiEligibleAsset;
import com.robinhood.android.internalassettransfers.review.models.UiEligibleAsset2;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAsset;
import com.robinhood.android.models.internalassettransfers.p193db.EligibleAssets;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.utils.extensions.StringsKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;

/* compiled from: InternalAssetTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 E2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001EB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020\u001bJ\u0006\u0010#\u001a\u00020\u001bJ\b\u0010$\u001a\u00020\u001bH\u0002J\u0006\u0010%\u001a\u00020\u001bJ\u0006\u0010&\u001a\u00020\u001bJ\u000e\u0010'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020\u001bJ\u0014\u0010+\u001a\u00020\u001b2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-J\u0006\u0010/\u001a\u00020\u001bJ\u000e\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u000202J\u001c\u00103\u001a\u00020\u001b2\u0006\u00104\u001a\u00020)2\f\u00105\u001a\b\u0012\u0004\u0012\u0002060-J\u001c\u00107\u001a\u00020\u001b2\u0006\u00104\u001a\u00020)2\f\u00105\u001a\b\u0012\u0004\u0012\u0002060-J\u0006\u00108\u001a\u00020\u001bJ\u0006\u00109\u001a\u00020\u001bJ\u0006\u0010:\u001a\u00020\u001bJ\u0006\u0010;\u001a\u00020\u001bJ\u0016\u0010<\u001a\u00020\u001b2\u0006\u0010=\u001a\u0002062\u0006\u0010>\u001a\u00020?J\u000e\u0010@\u001a\u00020\u001b2\u0006\u0010=\u001a\u000206J\u000e\u0010A\u001a\u00020\u001b2\u0006\u0010=\u001a\u000206J\u0016\u0010B\u001a\u00020\u001b2\u0006\u0010C\u001a\u00020\u00162\u0006\u0010D\u001a\u00020\u0017R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R%\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00150\u000e8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0011R\"\u0010\u0019\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00150\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006F"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/InternalAssetTransferDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferViewState;", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "assetSelectionFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/android/internalassettransfers/AssetSelection;", "getAssetSelectionFlow", "()Lkotlinx/coroutines/flow/Flow;", "_assetSelectionFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "accountSelectionFlow", "Lkotlin/Pair;", "Lcom/robinhood/android/internalassettransfers/accountselection/accountlist/AccountSelectionListFragment$AccountSelectionType;", "", "getAccountSelectionFlow", "_accountSelectionFlow", "setAccountSelection", "", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/android/internalassettransfers/accountselection/UiIatAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "setSourceEligibleAssets", "sourceEligibleAssets", "Lcom/robinhood/android/models/internalassettransfers/db/EligibleAssets;", "navigateToTransferTypeSelectionOrAgreementsScreen", "navigateToReviewScreen", "navigateToTransferTypeSelectionScreen", "navigateToAgreementsScreen", "onFullTransferSelected", "onPartialTransferSelected", "shouldAbortIatFlow", "", "navigateToCashBalanceScreen", "navigateToPreSubmissionWarnsScreen", "alerts", "", "Lcom/robinhood/android/internalassettransfers/presubmissionwarn/PresubmissionChecksAlertSheet;", "continueFromCustomSelection", "cashBalanceConfirmed", AnalyticsStrings.BUTTON_GROUP_TITLE_CASH, "Ljava/math/BigDecimal;", "clearAssetSelection", "isCashVisible", "instrumentIds", "Ljava/util/UUID;", "selectAssets", "clearAccountSelection", "cashBalanceSelected", "cashBalanceUnselected", "navigateToNonTransferableAssetList", "makeEquityShareSelection", "instrumentId", "shareSelection", "Lcom/robinhood/android/internalassettransfers/customselection/equity/ShareSelection;", "selectEquity", "unselectEquity", "selectAccount", "selectionType", "accountNumber", "Companion", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class InternalAssetTransferDuxo extends BaseDuxo5<InternalAssetTransferViewState, InternalAssetTransferEvent> implements HasSavedState {
    private static final String KEY_ACCOUNT_SELECTION = "account_selection";
    private static final String KEY_SOURCE_ELIGIBLE_ASSETS = "source_eligible_assets";
    private final StateFlow2<Tuples2<AccountSelectionListFragment.AccountSelectionType, String>> _accountSelectionFlow;
    private final StateFlow2<AssetSelection> _assetSelectionFlow;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalAssetTransferDuxo(DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new InternalAssetTransferViewState((AccountSelection) savedStateHandle.get(KEY_ACCOUNT_SELECTION), (EligibleAssets) savedStateHandle.get(KEY_SOURCE_ELIGIBLE_ASSETS), null, false, 12, null), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.savedStateHandle = savedStateHandle;
        this._assetSelectionFlow = StateFlow4.MutableStateFlow(new AssetSelection(null, null, 3, null));
        this._accountSelectionFlow = StateFlow4.MutableStateFlow(null);
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C189731(null));
    }

    public final Flow<AssetSelection> getAssetSelectionFlow() {
        return this._assetSelectionFlow;
    }

    public final Flow<Tuples2<AccountSelectionListFragment.AccountSelectionType, String>> getAccountSelectionFlow() {
        return this._accountSelectionFlow;
    }

    /* compiled from: InternalAssetTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.InternalAssetTransferDuxo$1", m3645f = "InternalAssetTransferDuxo.kt", m3646l = {53}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.InternalAssetTransferDuxo$1 */
    static final class C189731 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C189731(Continuation<? super C189731> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InternalAssetTransferDuxo.this.new C189731(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C189731) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: InternalAssetTransferDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "assetSelection", "Lcom/robinhood/android/internalassettransfers/AssetSelection;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.InternalAssetTransferDuxo$1$1", m3645f = "InternalAssetTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.internalassettransfers.InternalAssetTransferDuxo$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AssetSelection, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InternalAssetTransferDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(InternalAssetTransferDuxo internalAssetTransferDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = internalAssetTransferDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AssetSelection assetSelection, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(assetSelection, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: InternalAssetTransferDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.InternalAssetTransferDuxo$1$1$1", m3645f = "InternalAssetTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.internalassettransfers.InternalAssetTransferDuxo$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502151 extends ContinuationImpl7 implements Function2<InternalAssetTransferViewState, Continuation<? super InternalAssetTransferViewState>, Object> {
                final /* synthetic */ AssetSelection $assetSelection;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502151(AssetSelection assetSelection, Continuation<? super C502151> continuation) {
                    super(2, continuation);
                    this.$assetSelection = assetSelection;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502151 c502151 = new C502151(this.$assetSelection, continuation);
                    c502151.L$0 = obj;
                    return c502151;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InternalAssetTransferViewState internalAssetTransferViewState, Continuation<? super InternalAssetTransferViewState> continuation) {
                    return ((C502151) create(internalAssetTransferViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return InternalAssetTransferViewState.copy$default((InternalAssetTransferViewState) this.L$0, null, null, this.$assetSelection, false, 11, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C502151((AssetSelection) this.L$0, null));
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
                Flow<AssetSelection> assetSelectionFlow = InternalAssetTransferDuxo.this.getAssetSelectionFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(InternalAssetTransferDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(assetSelectionFlow, anonymousClass1, this) == coroutine_suspended) {
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

    public final void setAccountSelection(final UiIatAccount sourceAccount, final UiIatAccount sinkAccount) {
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        withDataState(new Function1() { // from class: com.robinhood.android.internalassettransfers.InternalAssetTransferDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferDuxo.setAccountSelection$lambda$0(sourceAccount, sinkAccount, this, (InternalAssetTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setAccountSelection$lambda$0(UiIatAccount uiIatAccount, UiIatAccount uiIatAccount2, InternalAssetTransferDuxo internalAssetTransferDuxo, InternalAssetTransferViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AccountSelection accountSelection = new AccountSelection(uiIatAccount, uiIatAccount2);
        internalAssetTransferDuxo.applyMutation(new InternalAssetTransferDuxo4(accountSelection, null));
        internalAssetTransferDuxo.getSavedStateHandle().set(KEY_ACCOUNT_SELECTION, accountSelection);
        return Unit.INSTANCE;
    }

    public final void setSourceEligibleAssets(EligibleAssets sourceEligibleAssets) {
        Intrinsics.checkNotNullParameter(sourceEligibleAssets, "sourceEligibleAssets");
        BigDecimal availableCash = sourceEligibleAssets.getAvailableCash();
        List<EligibleAsset> transferableAssets = sourceEligibleAssets.getTransferableAssets();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(transferableAssets, 10)), 16));
        for (EligibleAsset eligibleAsset : transferableAssets) {
            Tuples2 tuples2M3642to = Tuples4.m3642to(StringsKt.toUuid(eligibleAsset.getInstrumentId()), eligibleAsset.getAvailableShares());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        AssetSelection assetSelection = new AssetSelection(availableCash, linkedHashMap);
        StateFlow2<AssetSelection> stateFlow2 = this._assetSelectionFlow;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), assetSelection)) {
        }
        applyMutation(new C189742(sourceEligibleAssets, null));
        getSavedStateHandle().set(KEY_SOURCE_ELIGIBLE_ASSETS, sourceEligibleAssets);
    }

    /* compiled from: InternalAssetTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.InternalAssetTransferDuxo$setSourceEligibleAssets$2", m3645f = "InternalAssetTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.InternalAssetTransferDuxo$setSourceEligibleAssets$2 */
    static final class C189742 extends ContinuationImpl7 implements Function2<InternalAssetTransferViewState, Continuation<? super InternalAssetTransferViewState>, Object> {
        final /* synthetic */ EligibleAssets $sourceEligibleAssets;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C189742(EligibleAssets eligibleAssets, Continuation<? super C189742> continuation) {
            super(2, continuation);
            this.$sourceEligibleAssets = eligibleAssets;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C189742 c189742 = new C189742(this.$sourceEligibleAssets, continuation);
            c189742.L$0 = obj;
            return c189742;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalAssetTransferViewState internalAssetTransferViewState, Continuation<? super InternalAssetTransferViewState> continuation) {
            return ((C189742) create(internalAssetTransferViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InternalAssetTransferViewState.copy$default((InternalAssetTransferViewState) this.L$0, null, this.$sourceEligibleAssets, null, false, 13, null);
        }
    }

    public final void navigateToTransferTypeSelectionOrAgreementsScreen() {
        withDataState(new Function1() { // from class: com.robinhood.android.internalassettransfers.InternalAssetTransferDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferDuxo.navigateToTransferTypeSelectionOrAgreementsScreen$lambda$3(this.f$0, (InternalAssetTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigateToTransferTypeSelectionOrAgreementsScreen$lambda$3(InternalAssetTransferDuxo internalAssetTransferDuxo, InternalAssetTransferViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        internalAssetTransferDuxo.navigateToTransferTypeSelectionScreen();
        return Unit.INSTANCE;
    }

    public final void navigateToReviewScreen() {
        withDataState(new Function1() { // from class: com.robinhood.android.internalassettransfers.InternalAssetTransferDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferDuxo.navigateToReviewScreen$lambda$8(this.f$0, (InternalAssetTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigateToReviewScreen$lambda$8(InternalAssetTransferDuxo internalAssetTransferDuxo, InternalAssetTransferViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AccountSelection accountSelection = it.getAccountSelection();
        if (accountSelection == null) {
            throw new IllegalArgumentException("Accounts must have been selected before reaching agreement signing");
        }
        EligibleAssets sourceEligibleAssets = it.getSourceEligibleAssets();
        if (sourceEligibleAssets == null) {
            throw new IllegalArgumentException("Source eligible assets must have been set before reaching agreement signing");
        }
        if (it.isFullTransfer()) {
            internalAssetTransferDuxo.submit(new InternalAssetTransferEvent.NavigateToReviewScreen(accountSelection, ((InternalAssetTransfer) INSTANCE.getExtras((HasSavedState) internalAssetTransferDuxo)).getSource(), UiAssets3.toTransferableUiModel(sourceEligibleAssets), UiAssets3.toNontransferableUiModel(sourceEligibleAssets)));
        } else {
            BigDecimal cash = it.getAssetSelection().getCash();
            Map<UUID, BigDecimal> equities = it.getAssetSelection().getEquities();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<UUID, BigDecimal> entry : equities.entrySet()) {
                if (entry.getValue().compareTo(BigDecimal.ZERO) > 0) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                EligibleAsset eligibleAsset = sourceEligibleAssets.getEquityMap().get(((UUID) entry2.getKey()).toString());
                UiEligibleAsset uiModel = eligibleAsset != null ? UiEligibleAsset2.toUiModel(eligibleAsset, (BigDecimal) entry2.getValue()) : null;
                if (uiModel != null) {
                    arrayList.add(uiModel);
                }
            }
            internalAssetTransferDuxo.submit(new InternalAssetTransferEvent.NavigateToReviewScreen(accountSelection, ((InternalAssetTransfer) INSTANCE.getExtras((HasSavedState) internalAssetTransferDuxo)).getSource(), new UiAssets(cash, arrayList, UiAssets2.TRANSFERABLE), UiAssets3.toNontransferableUiModel(sourceEligibleAssets)));
        }
        return Unit.INSTANCE;
    }

    private final void navigateToTransferTypeSelectionScreen() {
        withDataState(new Function1() { // from class: com.robinhood.android.internalassettransfers.InternalAssetTransferDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferDuxo.navigateToTransferTypeSelectionScreen$lambda$11(this.f$0, (InternalAssetTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigateToTransferTypeSelectionScreen$lambda$11(InternalAssetTransferDuxo internalAssetTransferDuxo, InternalAssetTransferViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        AccountSelection accountSelection = it.getAccountSelection();
        if (accountSelection == null) {
            throw new IllegalArgumentException("Accounts must have been selected before transfer type choosing");
        }
        EligibleAssets sourceEligibleAssets = it.getSourceEligibleAssets();
        if (sourceEligibleAssets == null) {
            throw new IllegalArgumentException("Source eligible assets must have been set before reaching agreement signing");
        }
        internalAssetTransferDuxo.submit(new InternalAssetTransferEvent.NavigateToFullPartialChoiceScreen(accountSelection.getSinkAccount(), accountSelection.getSourceAccount(), sourceEligibleAssets, ((InternalAssetTransfer) INSTANCE.getExtras((HasSavedState) internalAssetTransferDuxo)).getSource()));
        return Unit.INSTANCE;
    }

    public final void navigateToAgreementsScreen() {
        submit(new InternalAssetTransferEvent.NavigateToAgreementsScreen(((InternalAssetTransfer) INSTANCE.getExtras((HasSavedState) this)).getSource()));
    }

    public final void onFullTransferSelected() {
        withDataState(new Function1() { // from class: com.robinhood.android.internalassettransfers.InternalAssetTransferDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferDuxo.onFullTransferSelected$lambda$13(this.f$0, (InternalAssetTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onFullTransferSelected$lambda$13(InternalAssetTransferDuxo internalAssetTransferDuxo, InternalAssetTransferViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EligibleAssets sourceEligibleAssets = it.getSourceEligibleAssets();
        if (sourceEligibleAssets == null) {
            throw new IllegalArgumentException("Source eligible assets must have been set before reaching agreement signing");
        }
        internalAssetTransferDuxo.setSourceEligibleAssets(sourceEligibleAssets);
        internalAssetTransferDuxo.applyMutation(new InternalAssetTransferDuxo2(null));
        internalAssetTransferDuxo.submit(new InternalAssetTransferEvent.NavigateToAgreementsScreen(((InternalAssetTransfer) INSTANCE.getExtras((HasSavedState) internalAssetTransferDuxo)).getSource()));
        return Unit.INSTANCE;
    }

    public final void onPartialTransferSelected(final boolean shouldAbortIatFlow) {
        withDataState(new Function1() { // from class: com.robinhood.android.internalassettransfers.InternalAssetTransferDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferDuxo.onPartialTransferSelected$lambda$17(shouldAbortIatFlow, this, (InternalAssetTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPartialTransferSelected$lambda$17(boolean z, InternalAssetTransferDuxo internalAssetTransferDuxo, InternalAssetTransferViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EligibleAssets sourceEligibleAssets = it.getSourceEligibleAssets();
        if (sourceEligibleAssets == null) {
            throw new IllegalArgumentException("Source eligible assets must have been set before making a selection");
        }
        AccountSelection accountSelection = it.getAccountSelection();
        if (accountSelection == null) {
            throw new IllegalArgumentException("Accounts must have been selected before transfer type choosing");
        }
        if (!z) {
            StateFlow2<AssetSelection> stateFlow2 = internalAssetTransferDuxo._assetSelectionFlow;
            while (!stateFlow2.compareAndSet(stateFlow2.getValue(), new AssetSelection(null, null, 3, null))) {
            }
        }
        internalAssetTransferDuxo.applyMutation(new InternalAssetTransferDuxo3(null));
        internalAssetTransferDuxo.submit(new InternalAssetTransferEvent.NavigateToCustomSelectionScreen(((InternalAssetTransfer) INSTANCE.getExtras((HasSavedState) internalAssetTransferDuxo)).getSource(), sourceEligibleAssets, internalAssetTransferDuxo._assetSelectionFlow.getValue(), accountSelection, z));
        return Unit.INSTANCE;
    }

    public final void navigateToCashBalanceScreen() {
        withDataState(new Function1() { // from class: com.robinhood.android.internalassettransfers.InternalAssetTransferDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferDuxo.navigateToCashBalanceScreen$lambda$19(this.f$0, (InternalAssetTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigateToCashBalanceScreen$lambda$19(InternalAssetTransferDuxo internalAssetTransferDuxo, InternalAssetTransferViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EligibleAssets sourceEligibleAssets = it.getSourceEligibleAssets();
        if (sourceEligibleAssets == null) {
            throw new IllegalArgumentException("Source eligible assets must have been set before reaching agreement signing");
        }
        internalAssetTransferDuxo.submit(new InternalAssetTransferEvent.NavigateToCashBalanceScreen(((InternalAssetTransfer) INSTANCE.getExtras((HasSavedState) internalAssetTransferDuxo)).getSource(), sourceEligibleAssets, internalAssetTransferDuxo._assetSelectionFlow.getValue()));
        return Unit.INSTANCE;
    }

    public final void navigateToPreSubmissionWarnsScreen(List<PresubmissionChecksAlertSheet> alerts) {
        Intrinsics.checkNotNullParameter(alerts, "alerts");
        submit(new InternalAssetTransferEvent.NavigateToPreSubmissionWarnsScreen(((InternalAssetTransfer) INSTANCE.getExtras((HasSavedState) this)).getSource(), alerts));
    }

    public final void continueFromCustomSelection() {
        submit(new InternalAssetTransferEvent.NavigateToAgreementsScreen(((InternalAssetTransfer) INSTANCE.getExtras((HasSavedState) this)).getSource()));
    }

    public final void cashBalanceConfirmed(BigDecimal cash) {
        AssetSelection value;
        Intrinsics.checkNotNullParameter(cash, "cash");
        StateFlow2<AssetSelection> stateFlow2 = this._assetSelectionFlow;
        do {
            value = stateFlow2.getValue();
        } while (!stateFlow2.compareAndSet(value, AssetSelection.copy$default(value, cash, null, 2, null)));
    }

    public final void clearAssetSelection(boolean isCashVisible, List<UUID> instrumentIds) {
        AssetSelection value;
        AssetSelection assetSelection;
        BigDecimal cash;
        Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
        List<UUID> list = instrumentIds;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap.put(obj, BigDecimal.ZERO);
        }
        StateFlow2<AssetSelection> stateFlow2 = this._assetSelectionFlow;
        do {
            value = stateFlow2.getValue();
            assetSelection = value;
            if (isCashVisible) {
                cash = BigDecimal.ZERO;
            } else {
                cash = assetSelection.getCash();
            }
            Intrinsics.checkNotNull(cash);
        } while (!stateFlow2.compareAndSet(value, assetSelection.copy(cash, MapsKt.plus(assetSelection.getEquities(), linkedHashMap))));
    }

    public final void selectAssets(final boolean isCashVisible, final List<UUID> instrumentIds) {
        Intrinsics.checkNotNullParameter(instrumentIds, "instrumentIds");
        withDataState(new Function1() { // from class: com.robinhood.android.internalassettransfers.InternalAssetTransferDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferDuxo.selectAssets$lambda$27(this.f$0, instrumentIds, isCashVisible, (InternalAssetTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectAssets$lambda$27(InternalAssetTransferDuxo internalAssetTransferDuxo, List list, boolean z, InternalAssetTransferViewState it) {
        AssetSelection value;
        AssetSelection assetSelection;
        BigDecimal cash;
        Intrinsics.checkNotNullParameter(it, "it");
        EligibleAssets sourceEligibleAssets = it.getSourceEligibleAssets();
        if (sourceEligibleAssets == null) {
            throw new IllegalArgumentException("Source eligible assets must have been set before reaching agreement signing");
        }
        List<EligibleAsset> transferableAssets = sourceEligibleAssets.getTransferableAssets();
        ArrayList<EligibleAsset> arrayList = new ArrayList();
        for (Object obj : transferableAssets) {
            if (list.contains(StringsKt.toUuid(((EligibleAsset) obj).getInstrumentId()))) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (EligibleAsset eligibleAsset : arrayList) {
            Tuples2 tuples2M3642to = Tuples4.m3642to(StringsKt.toUuid(eligibleAsset.getInstrumentId()), eligibleAsset.getAvailableShares());
            linkedHashMap.put(tuples2M3642to.getFirst(), tuples2M3642to.getSecond());
        }
        StateFlow2<AssetSelection> stateFlow2 = internalAssetTransferDuxo._assetSelectionFlow;
        do {
            value = stateFlow2.getValue();
            assetSelection = value;
            if (z) {
                cash = sourceEligibleAssets.getAvailableCash();
            } else {
                cash = assetSelection.getCash();
            }
        } while (!stateFlow2.compareAndSet(value, assetSelection.copy(cash, MapsKt.plus(assetSelection.getEquities(), linkedHashMap))));
        return Unit.INSTANCE;
    }

    public final void clearAccountSelection() {
        StateFlow2<Tuples2<AccountSelectionListFragment.AccountSelectionType, String>> stateFlow2 = this._accountSelectionFlow;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), null)) {
        }
    }

    public final void cashBalanceSelected() {
        withDataState(new Function1() { // from class: com.robinhood.android.internalassettransfers.InternalAssetTransferDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferDuxo.cashBalanceSelected$lambda$30(this.f$0, (InternalAssetTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cashBalanceSelected$lambda$30(InternalAssetTransferDuxo internalAssetTransferDuxo, InternalAssetTransferViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EligibleAssets sourceEligibleAssets = it.getSourceEligibleAssets();
        if (sourceEligibleAssets == null) {
            throw new IllegalArgumentException("Source eligible assets must have been set before reaching agreement signing");
        }
        internalAssetTransferDuxo.cashBalanceConfirmed(sourceEligibleAssets.getAvailableCash());
        return Unit.INSTANCE;
    }

    public final void cashBalanceUnselected() {
        withDataState(new Function1() { // from class: com.robinhood.android.internalassettransfers.InternalAssetTransferDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferDuxo.cashBalanceUnselected$lambda$31(this.f$0, (InternalAssetTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cashBalanceUnselected$lambda$31(InternalAssetTransferDuxo internalAssetTransferDuxo, InternalAssetTransferViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        internalAssetTransferDuxo.cashBalanceConfirmed(ZERO);
        return Unit.INSTANCE;
    }

    public final void navigateToNonTransferableAssetList() {
        withDataState(new Function1() { // from class: com.robinhood.android.internalassettransfers.InternalAssetTransferDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferDuxo.navigateToNonTransferableAssetList$lambda$33(this.f$0, (InternalAssetTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit navigateToNonTransferableAssetList$lambda$33(InternalAssetTransferDuxo internalAssetTransferDuxo, InternalAssetTransferViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EligibleAssets sourceEligibleAssets = it.getSourceEligibleAssets();
        if (sourceEligibleAssets == null) {
            throw new IllegalArgumentException("Source eligible assets must have been set before reaching agreement signing");
        }
        internalAssetTransferDuxo.submit(new InternalAssetTransferEvent.NavigateToReviewAssetsScreen(((InternalAssetTransfer) INSTANCE.getExtras((HasSavedState) internalAssetTransferDuxo)).getSource(), UiAssets3.toNontransferableUiModel(sourceEligibleAssets)));
        return Unit.INSTANCE;
    }

    public final void makeEquityShareSelection(final UUID instrumentId, final ShareSelection shareSelection) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(shareSelection, "shareSelection");
        withDataState(new Function1() { // from class: com.robinhood.android.internalassettransfers.InternalAssetTransferDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferDuxo.makeEquityShareSelection$lambda$37(shareSelection, this, instrumentId, (InternalAssetTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit makeEquityShareSelection$lambda$37(ShareSelection shareSelection, InternalAssetTransferDuxo internalAssetTransferDuxo, UUID uuid, InternalAssetTransferViewState it) {
        BigDecimal shares;
        AssetSelection value;
        AssetSelection assetSelection;
        Object next;
        Intrinsics.checkNotNullParameter(it, "it");
        EligibleAssets sourceEligibleAssets = it.getSourceEligibleAssets();
        if (sourceEligibleAssets == null) {
            throw new IllegalArgumentException("Source eligible assets must have been set before reaching agreement signing");
        }
        if (Intrinsics.areEqual(shareSelection, ShareSelection.AllShares.INSTANCE)) {
            Iterator<T> it2 = sourceEligibleAssets.getEquityPositions().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (Intrinsics.areEqual(StringsKt.toUuid(((EligibleAsset) next).getInstrumentId()), uuid)) {
                    break;
                }
            }
            EligibleAsset eligibleAsset = (EligibleAsset) next;
            shares = eligibleAsset != null ? eligibleAsset.getAvailableShares() : null;
        } else {
            if (!(shareSelection instanceof ShareSelection.SpecificShares)) {
                throw new NoWhenBranchMatchedException();
            }
            shares = ((ShareSelection.SpecificShares) shareSelection).getShares();
        }
        if (shares == null) {
            return Unit.INSTANCE;
        }
        StateFlow2<AssetSelection> stateFlow2 = internalAssetTransferDuxo._assetSelectionFlow;
        do {
            value = stateFlow2.getValue();
            assetSelection = value;
        } while (!stateFlow2.compareAndSet(value, AssetSelection.copy$default(assetSelection, null, MapsKt.plus(assetSelection.getEquities(), Tuples4.m3642to(uuid, shares)), 1, null)));
        return Unit.INSTANCE;
    }

    public final void selectEquity(final UUID instrumentId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        withDataState(new Function1() { // from class: com.robinhood.android.internalassettransfers.InternalAssetTransferDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferDuxo.selectEquity$lambda$41(this.f$0, instrumentId, (InternalAssetTransferViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit selectEquity$lambda$41(InternalAssetTransferDuxo internalAssetTransferDuxo, UUID uuid, InternalAssetTransferViewState it) {
        Object next;
        AssetSelection value;
        AssetSelection assetSelection;
        Intrinsics.checkNotNullParameter(it, "it");
        EligibleAssets sourceEligibleAssets = it.getSourceEligibleAssets();
        if (sourceEligibleAssets == null) {
            throw new IllegalArgumentException("Source eligible assets must have been set before reaching agreement signing");
        }
        Iterator<T> it2 = sourceEligibleAssets.getTransferableAssets().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.areEqual(StringsKt.toUuid(((EligibleAsset) next).getInstrumentId()), uuid)) {
                break;
            }
        }
        EligibleAsset eligibleAsset = (EligibleAsset) next;
        if (eligibleAsset == null) {
            throw new IllegalStateException("Couldn't find checked equity");
        }
        StateFlow2<AssetSelection> stateFlow2 = internalAssetTransferDuxo._assetSelectionFlow;
        do {
            value = stateFlow2.getValue();
            assetSelection = value;
        } while (!stateFlow2.compareAndSet(value, AssetSelection.copy$default(assetSelection, null, MapsKt.plus(assetSelection.getEquities(), Tuples4.m3642to(uuid, eligibleAsset.getAvailableShares())), 1, null)));
        return Unit.INSTANCE;
    }

    public final void unselectEquity(UUID instrumentId) {
        AssetSelection value;
        AssetSelection assetSelection;
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        StateFlow2<AssetSelection> stateFlow2 = this._assetSelectionFlow;
        do {
            value = stateFlow2.getValue();
            assetSelection = value;
        } while (!stateFlow2.compareAndSet(value, AssetSelection.copy$default(assetSelection, null, MapsKt.plus(assetSelection.getEquities(), Tuples4.m3642to(instrumentId, BigDecimal.ZERO)), 1, null)));
    }

    public final void selectAccount(AccountSelectionListFragment.AccountSelectionType selectionType, String accountNumber) {
        Intrinsics.checkNotNullParameter(selectionType, "selectionType");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        StateFlow2<Tuples2<AccountSelectionListFragment.AccountSelectionType, String>> stateFlow2 = this._accountSelectionFlow;
        while (!stateFlow2.compareAndSet(stateFlow2.getValue(), Tuples4.m3642to(selectionType, accountNumber))) {
        }
    }

    /* compiled from: InternalAssetTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/InternalAssetTransferDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/internalassettransfers/InternalAssetTransferDuxo;", "Lcom/robinhood/android/assettransfers/contracts/InternalAssetTransfer;", "<init>", "()V", "KEY_ACCOUNT_SELECTION", "", "KEY_SOURCE_ELIGIBLE_ASSETS", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<InternalAssetTransferDuxo, InternalAssetTransfer> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public InternalAssetTransfer getExtras(SavedStateHandle savedStateHandle) {
            return (InternalAssetTransfer) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public InternalAssetTransfer getExtras(InternalAssetTransferDuxo internalAssetTransferDuxo) {
            return (InternalAssetTransfer) DuxoCompanion2.DefaultImpls.getExtras(this, internalAssetTransferDuxo);
        }
    }
}
