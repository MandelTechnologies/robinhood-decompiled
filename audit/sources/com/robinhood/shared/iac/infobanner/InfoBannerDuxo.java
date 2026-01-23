package com.robinhood.shared.iac.infobanner;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.models.api.IacDismissMethod;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.shared.data.store.iac.IacInfoBannerStore;
import com.robinhood.shared.data.store.iac.IacInfoBannersBatchParams;
import com.robinhood.shared.iac.extensions.IacInfoBanners;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: InfoBannerDuxo.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/iac/infobanner/InfoBannerDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/iac/infobanner/InfoBannerDataState;", "Lcom/robinhood/shared/iac/infobanner/InfoBannerViewState;", "iacInfoBannerStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "tapInfoBanner", "", "receiptUuid", "Ljava/util/UUID;", "action", "Lcom/robinhood/models/serverdriven/db/GenericAction$DeeplinkAction;", "dismissInfoBanner", "dismissMethod", "Lcom/robinhood/models/api/IacDismissMethod;", "bind", "Lkotlinx/coroutines/Job;", "batchParams", "Lcom/robinhood/shared/data/store/iac/IacInfoBannersBatchParams;", "lib-iac-info-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class InfoBannerDuxo extends BaseDuxo<InfoBannerDataState, InfoBannerViewState> {
    public static final int $stable = 8;
    private final IacInfoBannerStore iacInfoBannerStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoBannerDuxo(IacInfoBannerStore iacInfoBannerStore, DuxoBundle duxoBundle) {
        super(new InfoBannerDataState(null, 1, null), InfoBannerDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(iacInfoBannerStore, "iacInfoBannerStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.iacInfoBannerStore = iacInfoBannerStore;
    }

    public final void tapInfoBanner(UUID receiptUuid, GenericAction.DeeplinkAction action) {
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        Intrinsics.checkNotNullParameter(action, "action");
        bind(this.iacInfoBannerStore.postTapped(receiptUuid, action.getUri().toString()), LifecycleEvent.ON_DESTROY).subscribeKotlin();
    }

    public static /* synthetic */ void dismissInfoBanner$default(InfoBannerDuxo infoBannerDuxo, UUID uuid, IacDismissMethod iacDismissMethod, int i, Object obj) {
        if ((i & 2) != 0) {
            iacDismissMethod = IacDismissMethod.PASSIVE;
        }
        infoBannerDuxo.dismissInfoBanner(uuid, iacDismissMethod);
    }

    /* compiled from: InfoBannerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/iac/infobanner/InfoBannerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.iac.infobanner.InfoBannerDuxo$dismissInfoBanner$1", m3645f = "InfoBannerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.iac.infobanner.InfoBannerDuxo$dismissInfoBanner$1 */
    static final class C390701 extends ContinuationImpl7 implements Function2<InfoBannerDataState, Continuation<? super InfoBannerDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C390701(Continuation<? super C390701> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C390701 c390701 = new C390701(continuation);
            c390701.L$0 = obj;
            return c390701;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InfoBannerDataState infoBannerDataState, Continuation<? super InfoBannerDataState> continuation) {
            return ((C390701) create(infoBannerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ((InfoBannerDataState) this.L$0).copy(null);
        }
    }

    public final void dismissInfoBanner(UUID receiptUuid, IacDismissMethod dismissMethod) {
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        Intrinsics.checkNotNullParameter(dismissMethod, "dismissMethod");
        applyMutation(new C390701(null));
        bind(this.iacInfoBannerStore.postDismissed(receiptUuid, dismissMethod), LifecycleEvent.ON_DESTROY).subscribeKotlin();
    }

    /* compiled from: InfoBannerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.iac.infobanner.InfoBannerDuxo$bind$1", m3645f = "InfoBannerDuxo.kt", m3646l = {63}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.iac.infobanner.InfoBannerDuxo$bind$1 */
    static final class C390691 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ IacInfoBannersBatchParams $batchParams;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C390691(IacInfoBannersBatchParams iacInfoBannersBatchParams, Continuation<? super C390691> continuation) {
            super(2, continuation);
            this.$batchParams = iacInfoBannersBatchParams;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return InfoBannerDuxo.this.new C390691(this.$batchParams, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C390691) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable<List<IacInfoBanner>> observableStreamBatch = InfoBannerDuxo.this.iacInfoBannerStore.streamBatch(this.$batchParams);
                final IacInfoBannersBatchParams iacInfoBannersBatchParams = this.$batchParams;
                ObservableSource map = observableStreamBatch.map(new Function() { // from class: com.robinhood.shared.iac.infobanner.InfoBannerDuxo.bind.1.1
                    @Override // io.reactivex.functions.Function
                    public final Optional<IacInfoBanner> apply(List<IacInfoBanner> banners) {
                        Intrinsics.checkNotNullParameter(banners, "banners");
                        return Optional3.asOptional(IacInfoBanners.findByLocation(banners, (IacInfoBannerLocation) CollectionsKt.single((List) iacInfoBannersBatchParams.getLocations())));
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(map), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(InfoBannerDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowBuffer$default, anonymousClass2, this) == coroutine_suspended) {
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

        /* compiled from: InfoBannerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/IacInfoBanner;", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.iac.infobanner.InfoBannerDuxo$bind$1$2", m3645f = "InfoBannerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.iac.infobanner.InfoBannerDuxo$bind$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<Optional<? extends IacInfoBanner>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ InfoBannerDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(InfoBannerDuxo infoBannerDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = infoBannerDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(Optional<IacInfoBanner> optional, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(optional, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Optional<? extends IacInfoBanner> optional, Continuation<? super Unit> continuation) {
                return invoke2((Optional<IacInfoBanner>) optional, continuation);
            }

            /* compiled from: InfoBannerDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/iac/infobanner/InfoBannerDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.iac.infobanner.InfoBannerDuxo$bind$1$2$1", m3645f = "InfoBannerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.iac.infobanner.InfoBannerDuxo$bind$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<InfoBannerDataState, Continuation<? super InfoBannerDataState>, Object> {
                final /* synthetic */ IacInfoBanner $banner;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(IacInfoBanner iacInfoBanner, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$banner = iacInfoBanner;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$banner, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InfoBannerDataState infoBannerDataState, Continuation<? super InfoBannerDataState> continuation) {
                    return ((AnonymousClass1) create(infoBannerDataState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return ((InfoBannerDataState) this.L$0).copy(this.$banner);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((IacInfoBanner) ((Optional) this.L$0).component1(), null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Job bind(IacInfoBannersBatchParams batchParams) {
        Intrinsics.checkNotNullParameter(batchParams, "batchParams");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C390691(batchParams, null), 3, null);
    }
}
