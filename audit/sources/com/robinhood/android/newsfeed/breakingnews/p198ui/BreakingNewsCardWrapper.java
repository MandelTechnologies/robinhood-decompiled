package com.robinhood.android.newsfeed.breakingnews.p198ui;

import com.robinhood.android.newsfeed.models.breakingnews.SherwoodNewsInfoBannerExperiments;
import com.robinhood.android.newsfeed.models.breakingnews.SherwoodNewsInfoBannerExperiments3;
import com.robinhood.android.newsfeed.models.breakingnews.SherwoodNewsInfoBannerExperiments4;
import com.robinhood.android.newsfeed.models.breakingnews.api.ApiAssetType;
import com.robinhood.android.newsfeed.models.breakingnews.p199db.BreakingNews;
import com.robinhood.android.newsfeed.store.breakingnews.BreakingNewsStore;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples3;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: BreakingNewsCardWrapper.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ \u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/newsfeed/breakingnews/ui/BreakingNewsCardDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/newsfeed/breakingnews/ui/BreakingNewsCardViewState;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "breakingNewsStore", "Lcom/robinhood/android/newsfeed/store/breakingnews/BreakingNewsStore;", "<init>", "(Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/newsfeed/store/breakingnews/BreakingNewsStore;)V", "lastRequest", "Lkotlin/Triple;", "", "Ljava/util/UUID;", "Lcom/robinhood/android/newsfeed/models/breakingnews/api/ApiAssetType;", "loadBreakingNews", "", "accountNumber", "assetId", "assetType", "lib-breakingnews-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardDuxo, reason: use source file name */
/* loaded from: classes8.dex */
public final class BreakingNewsCardWrapper extends BaseDuxo4<BreakingNewsCardViewState> {
    public static final int $stable = 8;
    private final BreakingNewsStore breakingNewsStore;
    private final ExperimentsStore experimentsStore;
    private Tuples3<String, UUID, ? extends ApiAssetType> lastRequest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BreakingNewsCardWrapper(DuxoBundle duxoBundle, ExperimentsStore experimentsStore, BreakingNewsStore breakingNewsStore) {
        super(new BreakingNewsCardViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(breakingNewsStore, "breakingNewsStore");
        this.experimentsStore = experimentsStore;
        this.breakingNewsStore = breakingNewsStore;
    }

    public final void loadBreakingNews(String accountNumber, UUID assetId, ApiAssetType assetType) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Tuples3<String, UUID, ? extends ApiAssetType> tuples3 = new Tuples3<>(accountNumber, assetId, assetType);
        if (Intrinsics.areEqual(this.lastRequest, tuples3)) {
            return;
        }
        this.lastRequest = tuples3;
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C225761(assetType, accountNumber, this, assetId, null), 3, null);
    }

    /* compiled from: BreakingNewsCardWrapper.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardDuxo$loadBreakingNews$1", m3645f = "BreakingNewsCardWrapper.kt", m3646l = {102}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardDuxo$loadBreakingNews$1 */
    static final class C225761 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $assetId;
        final /* synthetic */ ApiAssetType $assetType;
        int label;
        final /* synthetic */ BreakingNewsCardWrapper this$0;

        /* compiled from: BreakingNewsCardWrapper.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardDuxo$loadBreakingNews$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ApiAssetType.values().length];
                try {
                    iArr[ApiAssetType.EQUITY.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ApiAssetType.CRYPTO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ApiAssetType.EVENT_CONTRACT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C225761(ApiAssetType apiAssetType, String str, BreakingNewsCardWrapper breakingNewsCardWrapper, UUID uuid, Continuation<? super C225761> continuation) {
            super(2, continuation);
            this.$assetType = apiAssetType;
            this.$accountNumber = str;
            this.this$0 = breakingNewsCardWrapper;
            this.$assetId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C225761(this.$assetType, this.$accountNumber, this.this$0, this.$assetId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C225761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Experiment experiment;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                int i2 = WhenMappings.$EnumSwitchMapping$0[this.$assetType.ordinal()];
                if (i2 == 1) {
                    experiment = SherwoodNewsInfoBannerExperiments4.INSTANCE;
                } else if (i2 == 2) {
                    experiment = SherwoodNewsInfoBannerExperiments.INSTANCE;
                } else if (i2 == 3) {
                    experiment = SherwoodNewsInfoBannerExperiments3.INSTANCE;
                } else {
                    return Unit.INSTANCE;
                }
                if (this.$assetType == ApiAssetType.EQUITY && this.$accountNumber == null) {
                    return Unit.INSTANCE;
                }
                Flow flowTransformLatest = FlowKt.transformLatest(ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{experiment}, false, null, 6, null), new C22575xeea3033f(null, this.this$0, this.$assetId, this.$assetType, this.$accountNumber));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowTransformLatest, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: BreakingNewsCardWrapper.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/newsfeed/models/breakingnews/db/BreakingNews;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardDuxo$loadBreakingNews$1$2", m3645f = "BreakingNewsCardWrapper.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardDuxo$loadBreakingNews$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<BreakingNews, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ BreakingNewsCardWrapper this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(BreakingNewsCardWrapper breakingNewsCardWrapper, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = breakingNewsCardWrapper;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(BreakingNews breakingNews, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(breakingNews, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: BreakingNewsCardWrapper.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/newsfeed/breakingnews/ui/BreakingNewsCardViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardDuxo$loadBreakingNews$1$2$1", m3645f = "BreakingNewsCardWrapper.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.newsfeed.breakingnews.ui.BreakingNewsCardDuxo$loadBreakingNews$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<BreakingNewsCardViewState, Continuation<? super BreakingNewsCardViewState>, Object> {
                final /* synthetic */ BreakingNews $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(BreakingNews breakingNews, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = breakingNews;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BreakingNewsCardViewState breakingNewsCardViewState, Continuation<? super BreakingNewsCardViewState> continuation) {
                    return ((AnonymousClass1) create(breakingNewsCardViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((BreakingNewsCardViewState) this.L$0).copy(this.$it);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((BreakingNews) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }
}
