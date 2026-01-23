package com.robinhood.android.indexes.detail.components.infobanner;

import com.robinhood.android.common.detail.component.infobanner.DetailPageIacInfoBannerViewState;
import com.robinhood.android.indexes.detail.IndexDetailPageDuxoHelper;
import com.robinhood.android.indexes.store.IndexAccountSwitcherStore;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: IndexDetailPageIacInfoBannerDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/indexes/detail/components/infobanner/IndexDetailPageIacInfoBannerDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/indexes/detail/components/infobanner/IndexDetailPageIacInfoBannerDataState;", "Lcom/robinhood/android/common/detail/component/infobanner/DetailPageIacInfoBannerViewState;", "indexAccountSwitcherStore", "Lcom/robinhood/android/indexes/store/IndexAccountSwitcherStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/indexes/detail/components/infobanner/IndexDetailPageIacInfoBannerStateProvider;", "<init>", "(Lcom/robinhood/android/indexes/store/IndexAccountSwitcherStore;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/indexes/detail/components/infobanner/IndexDetailPageIacInfoBannerStateProvider;)V", "onCreate", "", "feature-index-detail-page_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class IndexDetailPageIacInfoBannerDuxo extends BaseDuxo<IndexDetailPageIacInfoBannerDataState, DetailPageIacInfoBannerViewState> {
    public static final int $stable = 8;
    private final IndexAccountSwitcherStore indexAccountSwitcherStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndexDetailPageIacInfoBannerDuxo(IndexAccountSwitcherStore indexAccountSwitcherStore, DuxoBundle duxoBundle, IndexDetailPageIacInfoBannerStateProvider stateProvider) {
        super(new IndexDetailPageIacInfoBannerDataState(null, IacInfoBannerLocation.INFO_BANNER_INDEX_DETAIL_PAGE_MOBILE_TOP_LEVEL, 1, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(indexAccountSwitcherStore, "indexAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.indexAccountSwitcherStore = indexAccountSwitcherStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C188391(IndexDetailPageDuxoHelper.getCurrentAccountNumberFlow(this.indexAccountSwitcherStore), this, null));
    }

    /* compiled from: IndexDetailPageIacInfoBannerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.infobanner.IndexDetailPageIacInfoBannerDuxo$onCreate$1", m3645f = "IndexDetailPageIacInfoBannerDuxo.kt", m3646l = {32}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.indexes.detail.components.infobanner.IndexDetailPageIacInfoBannerDuxo$onCreate$1 */
    static final class C188391 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Flow<String> $currentAccountNumberFlow;
        int label;
        final /* synthetic */ IndexDetailPageIacInfoBannerDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C188391(Flow<String> flow, IndexDetailPageIacInfoBannerDuxo indexDetailPageIacInfoBannerDuxo, Continuation<? super C188391> continuation) {
            super(2, continuation);
            this.$currentAccountNumberFlow = flow;
            this.this$0 = indexDetailPageIacInfoBannerDuxo;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C188391(this.$currentAccountNumberFlow, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C188391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: IndexDetailPageIacInfoBannerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "accountNumber", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.infobanner.IndexDetailPageIacInfoBannerDuxo$onCreate$1$1", m3645f = "IndexDetailPageIacInfoBannerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.indexes.detail.components.infobanner.IndexDetailPageIacInfoBannerDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<String, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ IndexDetailPageIacInfoBannerDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(IndexDetailPageIacInfoBannerDuxo indexDetailPageIacInfoBannerDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = indexDetailPageIacInfoBannerDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(String str, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: IndexDetailPageIacInfoBannerDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/indexes/detail/components/infobanner/IndexDetailPageIacInfoBannerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.indexes.detail.components.infobanner.IndexDetailPageIacInfoBannerDuxo$onCreate$1$1$1", m3645f = "IndexDetailPageIacInfoBannerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.indexes.detail.components.infobanner.IndexDetailPageIacInfoBannerDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C501961 extends ContinuationImpl7 implements Function2<IndexDetailPageIacInfoBannerDataState, Continuation<? super IndexDetailPageIacInfoBannerDataState>, Object> {
                final /* synthetic */ String $accountNumber;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C501961(String str, Continuation<? super C501961> continuation) {
                    super(2, continuation);
                    this.$accountNumber = str;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C501961 c501961 = new C501961(this.$accountNumber, continuation);
                    c501961.L$0 = obj;
                    return c501961;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(IndexDetailPageIacInfoBannerDataState indexDetailPageIacInfoBannerDataState, Continuation<? super IndexDetailPageIacInfoBannerDataState> continuation) {
                    return ((C501961) create(indexDetailPageIacInfoBannerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return IndexDetailPageIacInfoBannerDataState.copy$default((IndexDetailPageIacInfoBannerDataState) this.L$0, this.$accountNumber, null, 2, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C501961((String) this.L$0, null));
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
                Flow<String> flow = this.$currentAccountNumberFlow;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flow, anonymousClass1, this) == coroutine_suspended) {
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
}
