package com.robinhood.android.crypto.tab.p093ui.rewards.banner;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.contentful.StaticContentStore;
import com.robinhood.contentful.model.AssetDetail;
import com.robinhood.contentful.model.AssetResource;
import com.robinhood.contentful.model.EntryResource;
import com.robinhood.contentful.repository.ContentRepository;
import com.robinhood.staticcontent.model.productupsell.ProductUpsellResource;
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

/* compiled from: CryptoHomeRewardsDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000eB!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/rewards/banner/CryptoHomeRewardsDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/crypto/tab/ui/rewards/banner/CryptoHomeRewardsDataState;", "Lcom/robinhood/android/crypto/tab/ui/rewards/banner/CryptoHomeRewardsViewState;", "staticContentStore", "Lcom/robinhood/contentful/StaticContentStore;", "stateProvider", "Lcom/robinhood/android/crypto/tab/ui/rewards/banner/CryptoHomeRewardsStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/contentful/StaticContentStore;Lcom/robinhood/android/crypto/tab/ui/rewards/banner/CryptoHomeRewardsStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "Companion", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoHomeRewardsDuxo extends BaseDuxo<CryptoHomeRewardsDataState, CryptoHomeRewardsViewState> {
    public static final String contentId = "3ENsrnHtsbsvYK8ijHH8yJ";
    private final StaticContentStore staticContentStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoHomeRewardsDuxo(StaticContentStore staticContentStore, CryptoHomeRewardsStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new CryptoHomeRewardsDataState(null, null, null, null, 15, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(staticContentStore, "staticContentStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.staticContentStore = staticContentStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C132101(null), 3, null);
    }

    /* compiled from: CryptoHomeRewardsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.rewards.banner.CryptoHomeRewardsDuxo$onStart$1", m3645f = "CryptoHomeRewardsDuxo.kt", m3646l = {28, 37, 38}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.tab.ui.rewards.banner.CryptoHomeRewardsDuxo$onStart$1 */
    static final class C132101 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        C132101(Continuation<? super C132101> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C132101 c132101 = CryptoHomeRewardsDuxo.this.new C132101(continuation);
            c132101.L$0 = obj;
            return c132101;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C132101) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00a5, code lost:
        
            if (r0 != r6) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Object objLoadEntry$default;
            Object objAwait;
            ProductUpsellResource productUpsellResource;
            Deferred deferred;
            AssetResource.Content content;
            Object objAwait2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                StaticContentStore staticContentStore = CryptoHomeRewardsDuxo.this.staticContentStore;
                this.L$0 = coroutineScope;
                this.label = 1;
                objLoadEntry$default = ContentRepository.DefaultImpls.loadEntry$default(staticContentStore, CryptoHomeRewardsDuxo.contentId, null, this, 2, null);
                if (objLoadEntry$default != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i == 1) {
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope = coroutineScope2;
                objLoadEntry$default = obj;
            } else {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AssetResource.Content content2 = (AssetResource.Content) this.L$1;
                    ProductUpsellResource productUpsellResource2 = (ProductUpsellResource) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    productUpsellResource = productUpsellResource2;
                    content = content2;
                    objAwait2 = obj;
                    CryptoHomeRewardsDuxo.this.applyMutation(new AnonymousClass1(productUpsellResource, content, (ProductUpsellResource.CtaButton) objAwait2, null));
                    return Unit.INSTANCE;
                }
                deferred = (Deferred) this.L$1;
                ProductUpsellResource productUpsellResource3 = (ProductUpsellResource) this.L$0;
                ResultKt.throwOnFailure(obj);
                productUpsellResource = productUpsellResource3;
                objAwait = obj;
                content = (AssetResource.Content) objAwait;
                this.L$0 = productUpsellResource;
                this.L$1 = content;
                this.label = 3;
                objAwait2 = deferred.await(this);
            }
            ProductUpsellResource productUpsellResource4 = (ProductUpsellResource) ((EntryResource) objLoadEntry$default).getValue();
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CryptoHomeRewardsDuxo2(CryptoHomeRewardsDuxo.this, productUpsellResource4, null), 3, null);
            Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new CryptoHomeRewardsDuxo3(CryptoHomeRewardsDuxo.this, productUpsellResource4, null), 3, null);
            this.L$0 = productUpsellResource4;
            this.L$1 = deferredAsync$default2;
            this.label = 2;
            objAwait = deferredAsync$default.await(this);
            if (objAwait != coroutine_suspended) {
                productUpsellResource = productUpsellResource4;
                deferred = deferredAsync$default2;
                content = (AssetResource.Content) objAwait;
                this.L$0 = productUpsellResource;
                this.L$1 = content;
                this.label = 3;
                objAwait2 = deferred.await(this);
            }
            return coroutine_suspended;
        }

        /* compiled from: CryptoHomeRewardsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/crypto/tab/ui/rewards/banner/CryptoHomeRewardsDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.tab.ui.rewards.banner.CryptoHomeRewardsDuxo$onStart$1$1", m3645f = "CryptoHomeRewardsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.tab.ui.rewards.banner.CryptoHomeRewardsDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CryptoHomeRewardsDataState, Continuation<? super CryptoHomeRewardsDataState>, Object> {
            final /* synthetic */ AssetResource.Content<? extends AssetDetail> $headerImageInfo;
            final /* synthetic */ ProductUpsellResource.CtaButton $primaryCtaInfo;
            final /* synthetic */ ProductUpsellResource $resource;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(ProductUpsellResource productUpsellResource, AssetResource.Content<? extends AssetDetail> content, ProductUpsellResource.CtaButton ctaButton, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$resource = productUpsellResource;
                this.$headerImageInfo = content;
                this.$primaryCtaInfo = ctaButton;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$resource, this.$headerImageInfo, this.$primaryCtaInfo, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CryptoHomeRewardsDataState cryptoHomeRewardsDataState, Continuation<? super CryptoHomeRewardsDataState> continuation) {
                return ((AnonymousClass1) create(cryptoHomeRewardsDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((CryptoHomeRewardsDataState) this.L$0).copy(this.$resource.getTitle(), this.$resource.getBody(), this.$headerImageInfo.getFile().getUrl(), this.$primaryCtaInfo.getActionUri());
            }
        }
    }

    /* compiled from: CryptoHomeRewardsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/rewards/banner/CryptoHomeRewardsDuxo$Companion;", "", "<init>", "()V", "contentId", "", "getContentId$feature_crypto_tab_externalDebug$annotations", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getContentId$feature_crypto_tab_externalDebug$annotations() {
        }

        private Companion() {
        }
    }
}
