package com.robinhood.android.crypto.costbasis.hub;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.crypto.contracts.CryptoCostBasisHubFragmentKey;
import com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListDuxo;
import com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubEvent;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.librobinhood.data.store.costbasis.CryptoCostBasisStore;
import com.robinhood.models.crypto.p315ui.transfer.UiCostBasisDetails;
import com.robinhood.models.crypto.p315ui.transfer.UiCostBasisSummary;
import com.robinhood.utils.extensions.StringsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
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
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CryptoCostBasisHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$load$2$2", m3645f = "CryptoCostBasisHubDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$load$2$2, reason: use source file name */
/* loaded from: classes2.dex */
final class CryptoCostBasisHubDuxo3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CryptoCostBasisHubDataState $dataState;
    final /* synthetic */ int $limit;
    final /* synthetic */ boolean $reset;
    final /* synthetic */ CryptoCostBasisHubSection $section;
    int label;
    final /* synthetic */ CryptoCostBasisHubDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CryptoCostBasisHubDuxo3(CryptoCostBasisHubDuxo cryptoCostBasisHubDuxo, CryptoCostBasisHubSection cryptoCostBasisHubSection, boolean z, CryptoCostBasisHubDataState cryptoCostBasisHubDataState, int i, Continuation<? super CryptoCostBasisHubDuxo3> continuation) {
        super(2, continuation);
        this.this$0 = cryptoCostBasisHubDuxo;
        this.$section = cryptoCostBasisHubSection;
        this.$reset = z;
        this.$dataState = cryptoCostBasisHubDataState;
        this.$limit = i;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CryptoCostBasisHubDuxo3(this.this$0, this.$section, this.$reset, this.$dataState, this.$limit, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CryptoCostBasisHubDuxo3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r15 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        if (r15 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009b, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c3  */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        UUID accountId;
        UUID uuid;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            accountId = ((CryptoCostBasisHubFragmentKey) CryptoCostBasisHubDuxo.INSTANCE.getArgs((HasArgs) this.this$0)).getAccountId();
            if (accountId == null) {
                Flow<String> flowStreamAccountId = this.this$0.cryptoAccountStore.streamAccountId();
                this.label = 1;
                obj = FlowKt.firstOrNull(flowStreamAccountId, this);
            }
            uuid = accountId;
            if (uuid != null) {
                CryptoCostBasisStore cryptoCostBasisStore = this.this$0.cryptoCostBasisStore;
                CryptoCostBasisStore.SummaryParams summaryParams = new CryptoCostBasisStore.SummaryParams(uuid, CryptoCostBasisDetailsListDuxo.SOURCE_TYPE, ((CryptoCostBasisHubFragmentKey) CryptoCostBasisHubDuxo.INSTANCE.getArgs((HasArgs) this.this$0)).getCurrencyPairId(), this.$limit, this.$section.getYear(), this.$section.getStatus(), this.$section.getAllowCorrection(), this.$reset ? null : this.this$0.cursor(this.$dataState, this.$section));
                this.label = 2;
                obj = cryptoCostBasisStore.fetchCostBasisSummary(summaryParams, this);
            } else {
                throw new IllegalStateException("Account ID is required but not available");
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                UiCostBasisSummary uiCostBasisSummary = (UiCostBasisSummary) obj;
                if (uiCostBasisSummary != null) {
                    this.this$0.applyMutation(new C128941(uiCostBasisSummary, this.$section, this.$reset, null));
                } else {
                    this.this$0.submit(new CryptoCostBasisHubEvent.Error(new Throwable("Failed to load cost basis data.")));
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        String str = (String) obj;
        if (str != null) {
            accountId = StringsKt.toUuid(str);
            uuid = accountId;
            if (uuid != null) {
            }
        } else {
            uuid = null;
            if (uuid != null) {
            }
        }
    }

    /* compiled from: CryptoCostBasisHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$load$2$2$1", m3645f = "CryptoCostBasisHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$load$2$2$1 */
    static final class C128941 extends ContinuationImpl7 implements Function2<CryptoCostBasisHubDataState, Continuation<? super CryptoCostBasisHubDataState>, Object> {
        final /* synthetic */ boolean $reset;
        final /* synthetic */ UiCostBasisSummary $response;
        final /* synthetic */ CryptoCostBasisHubSection $section;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: CryptoCostBasisHubDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.crypto.costbasis.hub.CryptoCostBasisHubDuxo$load$2$2$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CryptoCostBasisHubSection.values().length];
                try {
                    iArr[CryptoCostBasisHubSection.SOLD_IN_2025.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CryptoCostBasisHubSection.MISSING_DETAILS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CryptoCostBasisHubSection.CONFIRMED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C128941(UiCostBasisSummary uiCostBasisSummary, CryptoCostBasisHubSection cryptoCostBasisHubSection, boolean z, Continuation<? super C128941> continuation) {
            super(2, continuation);
            this.$response = uiCostBasisSummary;
            this.$section = cryptoCostBasisHubSection;
            this.$reset = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C128941 c128941 = new C128941(this.$response, this.$section, this.$reset, continuation);
            c128941.L$0 = obj;
            return c128941;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CryptoCostBasisHubDataState cryptoCostBasisHubDataState, Continuation<? super CryptoCostBasisHubDataState> continuation) {
            return ((C128941) create(cryptoCostBasisHubDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CryptoCostBasisHubDataState cryptoCostBasisHubDataState = (CryptoCostBasisHubDataState) this.L$0;
            Iterable results = this.$response.getResults();
            String next = this.$response.getNext();
            boolean zIsBlank = kotlin.text.StringsKt.isBlank(next);
            int i = WhenMappings.$EnumSwitchMapping$0[this.$section.ordinal()];
            if (i == 1) {
                CryptoCostBasisHubSectionDataState section2025Sold = cryptoCostBasisHubDataState.getSection2025Sold();
                if (!this.$reset) {
                    Collection details$feature_crypto_cost_basis_externalDebug = cryptoCostBasisHubDataState.getSection2025Sold().getDetails$feature_crypto_cost_basis_externalDebug();
                    if (details$feature_crypto_cost_basis_externalDebug == null) {
                        details$feature_crypto_cost_basis_externalDebug = CollectionsKt.emptyList();
                    }
                    results = CollectionsKt.plus(details$feature_crypto_cost_basis_externalDebug, results);
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : results) {
                    if (hashSet.add(((UiCostBasisDetails) obj2).getResponse().getSource_id())) {
                        arrayList.add(obj2);
                    }
                }
                return CryptoCostBasisHubDataState.copy$default(cryptoCostBasisHubDataState, CryptoCostBasisHubSectionDataState.copy$default(section2025Sold, null, null, extensions2.toPersistentList(arrayList), false, next, boxing.boxBoolean(zIsBlank), null, 67, null), null, null, 6, null);
            }
            if (i == 2) {
                CryptoCostBasisHubSectionDataState sectionMissingDetails = cryptoCostBasisHubDataState.getSectionMissingDetails();
                if (!this.$reset) {
                    Collection details$feature_crypto_cost_basis_externalDebug2 = cryptoCostBasisHubDataState.getSectionMissingDetails().getDetails$feature_crypto_cost_basis_externalDebug();
                    if (details$feature_crypto_cost_basis_externalDebug2 == null) {
                        details$feature_crypto_cost_basis_externalDebug2 = CollectionsKt.emptyList();
                    }
                    results = CollectionsKt.plus(details$feature_crypto_cost_basis_externalDebug2, results);
                }
                HashSet hashSet2 = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : results) {
                    if (hashSet2.add(((UiCostBasisDetails) obj3).getResponse().getSource_id())) {
                        arrayList2.add(obj3);
                    }
                }
                return CryptoCostBasisHubDataState.copy$default(cryptoCostBasisHubDataState, null, CryptoCostBasisHubSectionDataState.copy$default(sectionMissingDetails, null, null, extensions2.toPersistentList(arrayList2), false, next, boxing.boxBoolean(zIsBlank), null, 67, null), null, 5, null);
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            CryptoCostBasisHubSectionDataState sectionConfirmed = cryptoCostBasisHubDataState.getSectionConfirmed();
            if (!this.$reset) {
                Collection details$feature_crypto_cost_basis_externalDebug3 = cryptoCostBasisHubDataState.getSectionConfirmed().getDetails$feature_crypto_cost_basis_externalDebug();
                if (details$feature_crypto_cost_basis_externalDebug3 == null) {
                    details$feature_crypto_cost_basis_externalDebug3 = CollectionsKt.emptyList();
                }
                results = CollectionsKt.plus(details$feature_crypto_cost_basis_externalDebug3, results);
            }
            HashSet hashSet3 = new HashSet();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : results) {
                if (hashSet3.add(((UiCostBasisDetails) obj4).getResponse().getSource_id())) {
                    arrayList3.add(obj4);
                }
            }
            return CryptoCostBasisHubDataState.copy$default(cryptoCostBasisHubDataState, null, null, CryptoCostBasisHubSectionDataState.copy$default(sectionConfirmed, null, null, extensions2.toPersistentList(arrayList3), false, next, boxing.boxBoolean(zIsBlank), null, 67, null), 3, null);
        }
    }
}
