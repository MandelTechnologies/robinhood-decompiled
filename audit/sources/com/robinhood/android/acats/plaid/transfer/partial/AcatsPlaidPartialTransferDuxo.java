package com.robinhood.android.acats.plaid.transfer.partial;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo3;
import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferViewState;
import com.robinhood.android.acatsin.partials.UiAcatsAsset;
import com.robinhood.android.acatsin.store.AcatsInActivityStore;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.EquityAsset;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.OptionAsset;
import com.robinhood.models.acats.p299db.bonfire.plaid.brokerassets.PlaidBrokerAssets;
import com.robinhood.models.api.bonfire.ApiAcatsAccountContentsResponse;
import com.robinhood.models.api.bonfire.ApiAcatsTransfer;
import com.robinhood.models.api.bonfire.plaid.brokerassets.AcatsInBrokerAssetOptionPosition2;
import com.robinhood.models.api.bonfire.plaid.brokerassets.AcatsInBrokerAssetOptionType2;
import com.robinhood.models.p320db.OptionContractType;
import com.robinhood.models.serverdriven.experimental.api.Money;
import com.robinhood.models.serverdriven.experimental.extensions.Format2;
import com.robinhood.utils.extensions.StringsKt;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import p479j$.time.LocalDate;

/* compiled from: AcatsPlaidPartialTransferDuxo.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001$B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001e\u001a\u00020\u0012J\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 J\u0006\u0010\"\u001a\u00020\u0012J\u000e\u0010#\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferDataState;", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "acatsInActivityStore", "Lcom/robinhood/android/acatsin/store/AcatsInActivityStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferStateProvider;", "<init>", "(Lcom/robinhood/android/acatsin/store/AcatsInActivityStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "resetFilterState", "onFilterClicked", "key", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferSortKey;", "editSelectedRow", "row", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;", "removeAssetFromTransfer", "asset", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType;", "updateAssetTransferAmount", "clearEditState", "buildUiAcatsAssets", "", "Lcom/robinhood/android/acatsin/partials/UiAcatsAsset;", "clearRemoveAssetConfirmationState", "confirmAssetRemoval", "Companion", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsPlaidPartialTransferDuxo extends BaseDuxo<AcatsPlaidPartialTransferDataState, AcatsPlaidPartialTransferViewState> implements HasSavedState {
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
    public AcatsPlaidPartialTransferDuxo(AcatsInActivityStore acatsInActivityStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, AcatsPlaidPartialTransferStateProvider stateProvider) {
        super(new AcatsPlaidPartialTransferDataState(null, null, null, null, null, null, null, null, 0, 511, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(acatsInActivityStore, "acatsInActivityStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.acatsInActivityStore = acatsInActivityStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: AcatsPlaidPartialTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$onCreate$1", m3645f = "AcatsPlaidPartialTransferDuxo.kt", m3646l = {45}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$onCreate$1 */
    static final class C74781 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C74781(Continuation<? super C74781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsPlaidPartialTransferDuxo.this.new C74781(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C74781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AcatsInActivityStore acatsInActivityStore = AcatsPlaidPartialTransferDuxo.this.acatsInActivityStore;
                Companion companion = AcatsPlaidPartialTransferDuxo.INSTANCE;
                Deferred plaidBrokerAssets$default = AcatsInActivityStore.getPlaidBrokerAssets$default(acatsInActivityStore, ((AcatsPlaidPartialTransferKey) companion.getArgs((HasSavedState) AcatsPlaidPartialTransferDuxo.this)).getRhsAccountNumber(), ((AcatsPlaidPartialTransferKey) companion.getArgs((HasSavedState) AcatsPlaidPartialTransferDuxo.this)).getContraAccountNumber(), ((AcatsPlaidPartialTransferKey) companion.getArgs((HasSavedState) AcatsPlaidPartialTransferDuxo.this)).getPlaidAccessTokenId(), false, 8, null);
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
            PlaidBrokerAssets plaidBrokerAssets = (PlaidBrokerAssets) obj;
            Companion companion2 = AcatsPlaidPartialTransferDuxo.INSTANCE;
            boolean zContains = ((AcatsPlaidPartialTransferKey) companion2.getArgs((HasSavedState) AcatsPlaidPartialTransferDuxo.this)).getSupportedContentTypes().contains(ApiAcatsAccountContentsResponse.SupportedContentType.CASH);
            AcatsPlaidPartialTransferDuxo.this.applyMutation(new AnonymousClass1(plaidBrokerAssets, ((AcatsPlaidPartialTransferKey) companion2.getArgs((HasSavedState) AcatsPlaidPartialTransferDuxo.this)).getSupportedContentTypes().contains(ApiAcatsAccountContentsResponse.SupportedContentType.MARGIN), zContains, ((AcatsPlaidPartialTransferKey) companion2.getArgs((HasSavedState) AcatsPlaidPartialTransferDuxo.this)).getSupportedContentTypes().contains(ApiAcatsAccountContentsResponse.SupportedContentType.STOCKS_ETFS), ((AcatsPlaidPartialTransferKey) companion2.getArgs((HasSavedState) AcatsPlaidPartialTransferDuxo.this)).getSupportedContentTypes().contains(ApiAcatsAccountContentsResponse.SupportedContentType.OPTIONS), null));
            return Unit.INSTANCE;
        }

        /* compiled from: AcatsPlaidPartialTransferDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$onCreate$1$1", m3645f = "AcatsPlaidPartialTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AcatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState>, Object> {
            final /* synthetic */ boolean $cashSupported;
            final /* synthetic */ boolean $equitiesSupported;
            final /* synthetic */ boolean $marginCashSupported;
            final /* synthetic */ boolean $optionsSupported;
            final /* synthetic */ PlaidBrokerAssets $plaidBrokerAssets;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(PlaidBrokerAssets plaidBrokerAssets, boolean z, boolean z2, boolean z3, boolean z4, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$plaidBrokerAssets = plaidBrokerAssets;
                this.$marginCashSupported = z;
                this.$cashSupported = z2;
                this.$equitiesSupported = z3;
                this.$optionsSupported = z4;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$plaidBrokerAssets, this.$marginCashSupported, this.$cashSupported, this.$equitiesSupported, this.$optionsSupported, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AcatsPlaidPartialTransferDataState acatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState> continuation) {
                return ((AnonymousClass1) create(acatsPlaidPartialTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment cashAssetWithAdjustment;
                AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment marginCashAssetWithAdjustment;
                List listEmptyList;
                List listEmptyList2;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                AcatsPlaidPartialTransferDataState acatsPlaidPartialTransferDataState = (AcatsPlaidPartialTransferDataState) this.L$0;
                int iNumUnsupportedAssets = this.$plaidBrokerAssets.numUnsupportedAssets(this.$marginCashSupported, this.$cashSupported, this.$equitiesSupported, this.$optionsSupported);
                Money cash = this.$plaidBrokerAssets.getCash();
                if (cash == null) {
                    cashAssetWithAdjustment = null;
                } else {
                    if (!this.$cashSupported) {
                        cash = null;
                    }
                    if (cash != null) {
                        cashAssetWithAdjustment = new AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment(cash, cash);
                    }
                }
                Money margin = this.$plaidBrokerAssets.getMargin();
                if (margin == null) {
                    marginCashAssetWithAdjustment = null;
                } else {
                    if (!this.$marginCashSupported) {
                        margin = null;
                    }
                    if (margin != null) {
                        marginCashAssetWithAdjustment = new AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment(margin, margin);
                    }
                }
                List<EquityAsset> equityAssets = this.$plaidBrokerAssets.getEquityAssets();
                if (!this.$equitiesSupported) {
                    equityAssets = null;
                }
                if (equityAssets != null) {
                    ArrayList<EquityAsset> arrayList = new ArrayList();
                    for (Object obj2 : equityAssets) {
                        if (((EquityAsset) obj2).isSupported()) {
                            arrayList.add(obj2);
                        }
                    }
                    listEmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    for (EquityAsset equityAsset : arrayList) {
                        listEmptyList.add(new AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment(equityAsset, equityAsset.getQuantity()));
                    }
                } else {
                    listEmptyList = CollectionsKt.emptyList();
                }
                List<OptionAsset> optionAssets = this.$optionsSupported ? this.$plaidBrokerAssets.getOptionAssets() : null;
                if (optionAssets != null) {
                    ArrayList<OptionAsset> arrayList2 = new ArrayList();
                    for (Object obj3 : optionAssets) {
                        if (((OptionAsset) obj3).isSupported()) {
                            arrayList2.add(obj3);
                        }
                    }
                    listEmptyList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                    for (OptionAsset optionAsset : arrayList2) {
                        listEmptyList2.add(new AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment(optionAsset, optionAsset.getQuantity()));
                    }
                } else {
                    listEmptyList2 = CollectionsKt.emptyList();
                }
                return AcatsPlaidPartialTransferDataState.copy$default(acatsPlaidPartialTransferDataState, this.$plaidBrokerAssets, cashAssetWithAdjustment, marginCashAssetWithAdjustment, listEmptyList, listEmptyList2, null, null, null, iNumUnsupportedAssets, 224, null);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C74781(null), 3, null);
    }

    /* compiled from: AcatsPlaidPartialTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$resetFilterState$1", m3645f = "AcatsPlaidPartialTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$resetFilterState$1 */
    static final class C74841 extends ContinuationImpl7 implements Function2<AcatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C74841(Continuation<? super C74841> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C74841 c74841 = new C74841(continuation);
            c74841.L$0 = obj;
            return c74841;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsPlaidPartialTransferDataState acatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState> continuation) {
            return ((C74841) create(acatsPlaidPartialTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsPlaidPartialTransferDataState.copy$default((AcatsPlaidPartialTransferDataState) this.L$0, null, null, null, null, null, AcatsPlaidPartialTransferDuxo6.ALL, null, null, 0, 479, null);
        }
    }

    private final void resetFilterState() {
        applyMutation(new C74841(null));
    }

    /* compiled from: AcatsPlaidPartialTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$onFilterClicked$1", m3645f = "AcatsPlaidPartialTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$onFilterClicked$1 */
    static final class C74791 extends ContinuationImpl7 implements Function2<AcatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState>, Object> {
        final /* synthetic */ AcatsPlaidPartialTransferDuxo6 $key;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C74791(AcatsPlaidPartialTransferDuxo6 acatsPlaidPartialTransferDuxo6, Continuation<? super C74791> continuation) {
            super(2, continuation);
            this.$key = acatsPlaidPartialTransferDuxo6;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C74791 c74791 = new C74791(this.$key, continuation);
            c74791.L$0 = obj;
            return c74791;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsPlaidPartialTransferDataState acatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState> continuation) {
            return ((C74791) create(acatsPlaidPartialTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsPlaidPartialTransferDataState.copy$default((AcatsPlaidPartialTransferDataState) this.L$0, null, null, null, null, null, this.$key, null, null, 0, 479, null);
        }
    }

    public final void onFilterClicked(AcatsPlaidPartialTransferDuxo6 key) {
        Intrinsics.checkNotNullParameter(key, "key");
        applyMutation(new C74791(key, null));
    }

    /* compiled from: AcatsPlaidPartialTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$editSelectedRow$1", m3645f = "AcatsPlaidPartialTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$editSelectedRow$1 */
    static final class C74771 extends ContinuationImpl7 implements Function2<AcatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState>, Object> {
        final /* synthetic */ AcatsPlaidPartialTransferAssetRowData $row;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C74771(AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, Continuation<? super C74771> continuation) {
            super(2, continuation);
            this.$row = acatsPlaidPartialTransferAssetRowData;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C74771 c74771 = new C74771(this.$row, continuation);
            c74771.L$0 = obj;
            return c74771;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsPlaidPartialTransferDataState acatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState> continuation) {
            return ((C74771) create(acatsPlaidPartialTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsPlaidPartialTransferDataState.copy$default((AcatsPlaidPartialTransferDataState) this.L$0, null, null, null, null, null, null, this.$row, null, 0, 447, null);
        }
    }

    public final void editSelectedRow(AcatsPlaidPartialTransferAssetRowData row) {
        Intrinsics.checkNotNullParameter(row, "row");
        applyMutation(new C74771(row, null));
    }

    public final void removeAssetFromTransfer(AcatsPlaidPartialTransferDuxo3 asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        AcatsPlaidPartialTransferViewState value = getStateFlow().getValue();
        if (value instanceof AcatsPlaidPartialTransferViewState.Ready) {
            if (asset instanceof AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment) {
                applyMutation(new C74801(null));
                if (((AcatsPlaidPartialTransferViewState.Ready) value).getMarginCashAsset() == null) {
                    resetFilterState();
                }
            } else if (asset instanceof AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment) {
                applyMutation(new C74812(null));
                if (((AcatsPlaidPartialTransferViewState.Ready) value).getCashAsset() == null) {
                    resetFilterState();
                }
            } else if (asset instanceof AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) {
                List<AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment> equityAssets = ((AcatsPlaidPartialTransferViewState.Ready) value).getEquityAssets();
                ArrayList arrayList = new ArrayList();
                for (Object obj : equityAssets) {
                    if (!Intrinsics.areEqual(((AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) obj).getEquityAsset(), ((AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) asset).getEquityAsset())) {
                        arrayList.add(obj);
                    }
                }
                applyMutation(new C74823(arrayList, null));
                if (arrayList.isEmpty()) {
                    resetFilterState();
                }
            } else {
                if (!(asset instanceof AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment)) {
                    throw new NoWhenBranchMatchedException();
                }
                List<AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment> optionAssets = ((AcatsPlaidPartialTransferViewState.Ready) value).getOptionAssets();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : optionAssets) {
                    if (!Intrinsics.areEqual(((AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment) obj2).getOptionsAsset(), ((AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment) asset).getOptionsAsset())) {
                        arrayList2.add(obj2);
                    }
                }
                applyMutation(new C74834(arrayList2, null));
                if (arrayList2.isEmpty()) {
                    resetFilterState();
                }
            }
            clearEditState();
            clearRemoveAssetConfirmationState();
        }
    }

    /* compiled from: AcatsPlaidPartialTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$removeAssetFromTransfer$1", m3645f = "AcatsPlaidPartialTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$removeAssetFromTransfer$1 */
    static final class C74801 extends ContinuationImpl7 implements Function2<AcatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C74801(Continuation<? super C74801> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C74801 c74801 = new C74801(continuation);
            c74801.L$0 = obj;
            return c74801;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsPlaidPartialTransferDataState acatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState> continuation) {
            return ((C74801) create(acatsPlaidPartialTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsPlaidPartialTransferDataState.copy$default((AcatsPlaidPartialTransferDataState) this.L$0, null, null, null, null, null, null, null, null, 0, 509, null);
        }
    }

    /* compiled from: AcatsPlaidPartialTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$removeAssetFromTransfer$2", m3645f = "AcatsPlaidPartialTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$removeAssetFromTransfer$2 */
    static final class C74812 extends ContinuationImpl7 implements Function2<AcatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C74812(Continuation<? super C74812> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C74812 c74812 = new C74812(continuation);
            c74812.L$0 = obj;
            return c74812;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsPlaidPartialTransferDataState acatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState> continuation) {
            return ((C74812) create(acatsPlaidPartialTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsPlaidPartialTransferDataState.copy$default((AcatsPlaidPartialTransferDataState) this.L$0, null, null, null, null, null, null, null, null, 0, 507, null);
        }
    }

    /* compiled from: AcatsPlaidPartialTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$removeAssetFromTransfer$3", m3645f = "AcatsPlaidPartialTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$removeAssetFromTransfer$3 */
    static final class C74823 extends ContinuationImpl7 implements Function2<AcatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState>, Object> {
        final /* synthetic */ List<AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment> $filteredAssets;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C74823(List<AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment> list, Continuation<? super C74823> continuation) {
            super(2, continuation);
            this.$filteredAssets = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C74823 c74823 = new C74823(this.$filteredAssets, continuation);
            c74823.L$0 = obj;
            return c74823;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsPlaidPartialTransferDataState acatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState> continuation) {
            return ((C74823) create(acatsPlaidPartialTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsPlaidPartialTransferDataState.copy$default((AcatsPlaidPartialTransferDataState) this.L$0, null, null, null, this.$filteredAssets, null, null, null, null, 0, 503, null);
        }
    }

    /* compiled from: AcatsPlaidPartialTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$removeAssetFromTransfer$4", m3645f = "AcatsPlaidPartialTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$removeAssetFromTransfer$4 */
    static final class C74834 extends ContinuationImpl7 implements Function2<AcatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState>, Object> {
        final /* synthetic */ List<AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment> $filteredAssets;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C74834(List<AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment> list, Continuation<? super C74834> continuation) {
            super(2, continuation);
            this.$filteredAssets = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C74834 c74834 = new C74834(this.$filteredAssets, continuation);
            c74834.L$0 = obj;
            return c74834;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsPlaidPartialTransferDataState acatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState> continuation) {
            return ((C74834) create(acatsPlaidPartialTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsPlaidPartialTransferDataState.copy$default((AcatsPlaidPartialTransferDataState) this.L$0, null, null, null, null, this.$filteredAssets, null, null, null, 0, 495, null);
        }
    }

    public final void updateAssetTransferAmount(AcatsPlaidPartialTransferDuxo3 asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        AcatsPlaidPartialTransferViewState value = getStateFlow().getValue();
        if (value instanceof AcatsPlaidPartialTransferViewState.Ready) {
            if (asset instanceof AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment) {
                applyMutation(new C74851(asset, null));
            } else if (asset instanceof AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment) {
                applyMutation(new C74862(asset, null));
            } else if (asset instanceof AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) {
                List<AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment> equityAssets = ((AcatsPlaidPartialTransferViewState.Ready) value).getEquityAssets();
                ArrayList arrayList = new ArrayList();
                for (Object obj : equityAssets) {
                    if (!Intrinsics.areEqual(((AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) obj).getEquityAsset(), ((AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) asset).getEquityAsset())) {
                        arrayList.add(obj);
                    }
                }
                List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
                mutableList.add(asset);
                applyMutation(new C74873(mutableList, null));
            } else {
                if (!(asset instanceof AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment)) {
                    throw new NoWhenBranchMatchedException();
                }
                List<AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment> optionAssets = ((AcatsPlaidPartialTransferViewState.Ready) value).getOptionAssets();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : optionAssets) {
                    if (!Intrinsics.areEqual(((AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment) obj2).getOptionsAsset(), ((AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment) asset).getOptionsAsset())) {
                        arrayList2.add(obj2);
                    }
                }
                List mutableList2 = CollectionsKt.toMutableList((Collection) arrayList2);
                mutableList2.add(asset);
                applyMutation(new C74884(mutableList2, null));
            }
            clearEditState();
        }
    }

    /* compiled from: AcatsPlaidPartialTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$updateAssetTransferAmount$1", m3645f = "AcatsPlaidPartialTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$updateAssetTransferAmount$1 */
    static final class C74851 extends ContinuationImpl7 implements Function2<AcatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState>, Object> {
        final /* synthetic */ AcatsPlaidPartialTransferDuxo3 $asset;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C74851(AcatsPlaidPartialTransferDuxo3 acatsPlaidPartialTransferDuxo3, Continuation<? super C74851> continuation) {
            super(2, continuation);
            this.$asset = acatsPlaidPartialTransferDuxo3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C74851 c74851 = new C74851(this.$asset, continuation);
            c74851.L$0 = obj;
            return c74851;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsPlaidPartialTransferDataState acatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState> continuation) {
            return ((C74851) create(acatsPlaidPartialTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsPlaidPartialTransferDataState.copy$default((AcatsPlaidPartialTransferDataState) this.L$0, null, (AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment) this.$asset, null, null, null, null, null, null, 0, 509, null);
        }
    }

    /* compiled from: AcatsPlaidPartialTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$updateAssetTransferAmount$2", m3645f = "AcatsPlaidPartialTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$updateAssetTransferAmount$2 */
    static final class C74862 extends ContinuationImpl7 implements Function2<AcatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState>, Object> {
        final /* synthetic */ AcatsPlaidPartialTransferDuxo3 $asset;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C74862(AcatsPlaidPartialTransferDuxo3 acatsPlaidPartialTransferDuxo3, Continuation<? super C74862> continuation) {
            super(2, continuation);
            this.$asset = acatsPlaidPartialTransferDuxo3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C74862 c74862 = new C74862(this.$asset, continuation);
            c74862.L$0 = obj;
            return c74862;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsPlaidPartialTransferDataState acatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState> continuation) {
            return ((C74862) create(acatsPlaidPartialTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsPlaidPartialTransferDataState.copy$default((AcatsPlaidPartialTransferDataState) this.L$0, null, null, (AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment) this.$asset, null, null, null, null, null, 0, 507, null);
        }
    }

    /* compiled from: AcatsPlaidPartialTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$updateAssetTransferAmount$3", m3645f = "AcatsPlaidPartialTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$updateAssetTransferAmount$3 */
    static final class C74873 extends ContinuationImpl7 implements Function2<AcatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState>, Object> {
        final /* synthetic */ List<AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment> $updatedList;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C74873(List<AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment> list, Continuation<? super C74873> continuation) {
            super(2, continuation);
            this.$updatedList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C74873 c74873 = new C74873(this.$updatedList, continuation);
            c74873.L$0 = obj;
            return c74873;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsPlaidPartialTransferDataState acatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState> continuation) {
            return ((C74873) create(acatsPlaidPartialTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsPlaidPartialTransferDataState.copy$default((AcatsPlaidPartialTransferDataState) this.L$0, null, null, null, this.$updatedList, null, null, null, null, 0, 503, null);
        }
    }

    /* compiled from: AcatsPlaidPartialTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$updateAssetTransferAmount$4", m3645f = "AcatsPlaidPartialTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$updateAssetTransferAmount$4 */
    static final class C74884 extends ContinuationImpl7 implements Function2<AcatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState>, Object> {
        final /* synthetic */ List<AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment> $updatedList;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C74884(List<AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment> list, Continuation<? super C74884> continuation) {
            super(2, continuation);
            this.$updatedList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C74884 c74884 = new C74884(this.$updatedList, continuation);
            c74884.L$0 = obj;
            return c74884;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsPlaidPartialTransferDataState acatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState> continuation) {
            return ((C74884) create(acatsPlaidPartialTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsPlaidPartialTransferDataState.copy$default((AcatsPlaidPartialTransferDataState) this.L$0, null, null, null, null, this.$updatedList, null, null, null, 0, 495, null);
        }
    }

    /* compiled from: AcatsPlaidPartialTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$clearEditState$1", m3645f = "AcatsPlaidPartialTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$clearEditState$1 */
    static final class C74741 extends ContinuationImpl7 implements Function2<AcatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C74741(Continuation<? super C74741> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C74741 c74741 = new C74741(continuation);
            c74741.L$0 = obj;
            return c74741;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsPlaidPartialTransferDataState acatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState> continuation) {
            return ((C74741) create(acatsPlaidPartialTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsPlaidPartialTransferDataState.copy$default((AcatsPlaidPartialTransferDataState) this.L$0, null, null, null, null, null, null, null, null, 0, 447, null);
        }
    }

    public final void clearEditState() {
        applyMutation(new C74741(null));
    }

    public final List<UiAcatsAsset> buildUiAcatsAssets() {
        AcatsPlaidPartialTransferViewState value = getStateFlow().getValue();
        ArrayList arrayList = null;
        if (value instanceof AcatsPlaidPartialTransferViewState.Ready) {
            ArrayList arrayList2 = new ArrayList();
            AcatsPlaidPartialTransferViewState.Ready ready = (AcatsPlaidPartialTransferViewState.Ready) value;
            AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment cashAsset = ready.getCashAsset();
            if (cashAsset != null) {
                arrayList2.add(new UiAcatsAsset.CashAsset(Format2.toMoney(cashAsset.getAdjustableCashBalance()), UiAcatsAsset.CashAsset.CashType.CASH, false));
            }
            AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment marginCashAsset = ready.getMarginCashAsset();
            if (marginCashAsset != null) {
                arrayList2.add(new UiAcatsAsset.CashAsset(Format2.toMoney(marginCashAsset.getAdjustableMarginCashBalance()), UiAcatsAsset.CashAsset.CashType.MARGIN, true));
            }
            List<AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment> equityAssets = ready.getEquityAssets();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(equityAssets, 10));
            for (AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment equityAssetWithAdjustment : equityAssets) {
                String instrumentId = equityAssetWithAdjustment.getEquityAsset().getInstrumentId();
                UUID uuid = instrumentId != null ? StringsKt.toUuid(instrumentId) : null;
                if (uuid == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                arrayList3.add(new UiAcatsAsset.EquityAsset(uuid, equityAssetWithAdjustment.getEquityAsset().getName(), "", Integer.valueOf(equityAssetWithAdjustment.getAdjustableQuantity().abs().intValue()), equityAssetWithAdjustment.getAdjustableQuantity().compareTo(BigDecimal.ZERO) < 0 ? ApiAcatsTransfer.Asset.Direction.SHORT : ApiAcatsTransfer.Asset.Direction.LONG, equityAssetWithAdjustment.getEquityAsset().getBorrowFee()));
            }
            arrayList2.addAll(arrayList3);
            List<AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment> optionAssets = ready.getOptionAssets();
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(optionAssets, 10));
            for (AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment optionAssetWithAdjustment : optionAssets) {
                String chainId = optionAssetWithAdjustment.getOptionsAsset().getChainId();
                UUID uuid2 = chainId != null ? StringsKt.toUuid(chainId) : null;
                if (uuid2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ApiAcatsTransfer.Asset.Direction uIAcatsType = AcatsInBrokerAssetOptionPosition2.toUIAcatsType(optionAssetWithAdjustment.getOptionsAsset().getPosition());
                if (uIAcatsType == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                int iIntValue = optionAssetWithAdjustment.getAdjustableQuantity().intValue();
                OptionContractType uIAcatsType2 = AcatsInBrokerAssetOptionType2.toUIAcatsType(optionAssetWithAdjustment.getOptionsAsset().getType());
                if (uIAcatsType2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Money strikePrice = optionAssetWithAdjustment.getOptionsAsset().getStrikePrice();
                if (strikePrice == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                com.robinhood.models.util.Money money = Format2.toMoney(strikePrice);
                LocalDate expirationDate = optionAssetWithAdjustment.getOptionsAsset().getExpirationDate();
                String instrumentId2 = optionAssetWithAdjustment.getOptionsAsset().getInstrumentId();
                UUID uuid3 = instrumentId2 != null ? StringsKt.toUuid(instrumentId2) : null;
                if (uuid3 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                arrayList4.add(new UiAcatsAsset.OptionAsset(uuid2, uuid3, optionAssetWithAdjustment.getOptionsAsset().getName(), uIAcatsType, Integer.valueOf(iIntValue), uIAcatsType2, money, expirationDate));
            }
            arrayList2.addAll(arrayList4);
            arrayList = arrayList2;
        }
        if (arrayList != null) {
            return arrayList;
        }
        throw new IllegalStateException("Attempted to build UI assets while partial transfer state was loading");
    }

    /* compiled from: AcatsPlaidPartialTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$clearRemoveAssetConfirmationState$1", m3645f = "AcatsPlaidPartialTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$clearRemoveAssetConfirmationState$1 */
    static final class C74751 extends ContinuationImpl7 implements Function2<AcatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C74751(Continuation<? super C74751> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C74751 c74751 = new C74751(continuation);
            c74751.L$0 = obj;
            return c74751;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsPlaidPartialTransferDataState acatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState> continuation) {
            return ((C74751) create(acatsPlaidPartialTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsPlaidPartialTransferDataState.copy$default((AcatsPlaidPartialTransferDataState) this.L$0, null, null, null, null, null, null, null, null, 0, 383, null);
        }
    }

    public final void clearRemoveAssetConfirmationState() {
        applyMutation(new C74751(null));
    }

    /* compiled from: AcatsPlaidPartialTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$confirmAssetRemoval$1", m3645f = "AcatsPlaidPartialTransferDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo$confirmAssetRemoval$1 */
    static final class C74761 extends ContinuationImpl7 implements Function2<AcatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState>, Object> {
        final /* synthetic */ AcatsPlaidPartialTransferDuxo3 $asset;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C74761(AcatsPlaidPartialTransferDuxo3 acatsPlaidPartialTransferDuxo3, Continuation<? super C74761> continuation) {
            super(2, continuation);
            this.$asset = acatsPlaidPartialTransferDuxo3;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C74761 c74761 = new C74761(this.$asset, continuation);
            c74761.L$0 = obj;
            return c74761;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsPlaidPartialTransferDataState acatsPlaidPartialTransferDataState, Continuation<? super AcatsPlaidPartialTransferDataState> continuation) {
            return ((C74761) create(acatsPlaidPartialTransferDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsPlaidPartialTransferDataState.copy$default((AcatsPlaidPartialTransferDataState) this.L$0, null, null, null, null, null, null, null, this.$asset, 0, 383, null);
        }
    }

    public final void confirmAssetRemoval(AcatsPlaidPartialTransferDuxo3 asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        applyMutation(new C74761(asset, null));
    }

    /* compiled from: AcatsPlaidPartialTransferDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferDuxo;", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferKey;", "<init>", "()V", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AcatsPlaidPartialTransferDuxo, AcatsPlaidPartialTransferKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsPlaidPartialTransferKey getArgs(SavedStateHandle savedStateHandle) {
            return (AcatsPlaidPartialTransferKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsPlaidPartialTransferKey getArgs(AcatsPlaidPartialTransferDuxo acatsPlaidPartialTransferDuxo) {
            return (AcatsPlaidPartialTransferKey) DuxoCompanion.DefaultImpls.getArgs(this, acatsPlaidPartialTransferDuxo);
        }
    }
}
