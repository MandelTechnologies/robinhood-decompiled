package com.robinhood.shared.iac.infobanner;

import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.models.api.IacDismissMethod;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.shared.data.store.iac.IacInfoBannerStore;
import com.robinhood.shared.iac.extensions.IacInfoBanners;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Context7;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.rx2.RxConvert;

/* compiled from: DashboardInfoBannerCoordinatorDuxo.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ \u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0014J\u001e\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00120\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/shared/iac/infobanner/DashboardInfoBannerCoordinatorDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/shared/iac/infobanner/DashboardInfoBannerCoordinatorDuxoDataState;", "Lcom/robinhood/shared/iac/infobanner/DashboardInfoBannerCoordinatorDuxoViewState;", "iacInfoBannerStore", "Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/data/store/iac/IacInfoBannerStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "tapInfoBanner", "", "receiptUuid", "Ljava/util/UUID;", "action", "Lcom/robinhood/models/serverdriven/db/GenericAction$DeeplinkAction;", "dismissInfoBanner", "location", "Lcom/robinhood/models/db/IacInfoBannerLocation;", "dismissMethod", "Lcom/robinhood/models/api/IacDismissMethod;", "bind", "Lkotlinx/coroutines/Job;", "locations", "", "accountNumber", "", "lib-iac-info-banner_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class DashboardInfoBannerCoordinatorDuxo extends BaseDuxo<DashboardInfoBannerCoordinatorDuxoDataState, DashboardInfoBannerCoordinatorDuxoViewState> {
    public static final int $stable = 8;
    private final IacInfoBannerStore iacInfoBannerStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DashboardInfoBannerCoordinatorDuxo(IacInfoBannerStore iacInfoBannerStore, DuxoBundle duxoBundle) {
        super(new DashboardInfoBannerCoordinatorDuxoDataState(null, 1, 0 == true ? 1 : 0), DashboardInfoBannerCoordinatorDuxoDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(iacInfoBannerStore, "iacInfoBannerStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.iacInfoBannerStore = iacInfoBannerStore;
    }

    public final void tapInfoBanner(UUID receiptUuid, GenericAction.DeeplinkAction action) {
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        Intrinsics.checkNotNullParameter(action, "action");
        bind(this.iacInfoBannerStore.postTapped(receiptUuid, action.getUri().toString()), LifecycleEvent.ON_DESTROY).subscribeKotlin();
    }

    public static /* synthetic */ void dismissInfoBanner$default(DashboardInfoBannerCoordinatorDuxo dashboardInfoBannerCoordinatorDuxo, IacInfoBannerLocation iacInfoBannerLocation, UUID uuid, IacDismissMethod iacDismissMethod, int i, Object obj) {
        if ((i & 4) != 0) {
            iacDismissMethod = IacDismissMethod.PASSIVE;
        }
        dashboardInfoBannerCoordinatorDuxo.dismissInfoBanner(iacInfoBannerLocation, uuid, iacDismissMethod);
    }

    /* compiled from: DashboardInfoBannerCoordinatorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/iac/infobanner/DashboardInfoBannerCoordinatorDuxoDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.iac.infobanner.DashboardInfoBannerCoordinatorDuxo$dismissInfoBanner$1", m3645f = "DashboardInfoBannerCoordinatorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.iac.infobanner.DashboardInfoBannerCoordinatorDuxo$dismissInfoBanner$1 */
    static final class C390621 extends ContinuationImpl7 implements Function2<DashboardInfoBannerCoordinatorDuxoDataState, Continuation<? super DashboardInfoBannerCoordinatorDuxoDataState>, Object> {
        final /* synthetic */ IacInfoBannerLocation $location;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C390621(IacInfoBannerLocation iacInfoBannerLocation, Continuation<? super C390621> continuation) {
            super(2, continuation);
            this.$location = iacInfoBannerLocation;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C390621 c390621 = new C390621(this.$location, continuation);
            c390621.L$0 = obj;
            return c390621;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DashboardInfoBannerCoordinatorDuxoDataState dashboardInfoBannerCoordinatorDuxoViewState2, Continuation<? super DashboardInfoBannerCoordinatorDuxoDataState> continuation) {
            return ((C390621) create(dashboardInfoBannerCoordinatorDuxoViewState2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            DashboardInfoBannerCoordinatorDuxoDataState dashboardInfoBannerCoordinatorDuxoViewState2 = (DashboardInfoBannerCoordinatorDuxoDataState) this.L$0;
            Map mutableMap = MapsKt.toMutableMap(dashboardInfoBannerCoordinatorDuxoViewState2.getBannersByLocation());
            mutableMap.remove(this.$location);
            return dashboardInfoBannerCoordinatorDuxoViewState2.copy(extensions2.toImmutableMap(mutableMap));
        }
    }

    public final void dismissInfoBanner(IacInfoBannerLocation location, UUID receiptUuid, IacDismissMethod dismissMethod) {
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(receiptUuid, "receiptUuid");
        Intrinsics.checkNotNullParameter(dismissMethod, "dismissMethod");
        applyMutation(new C390621(location, null));
        bind(this.iacInfoBannerStore.postDismissed(receiptUuid, dismissMethod), LifecycleEvent.ON_DESTROY).subscribeKotlin();
    }

    /* compiled from: DashboardInfoBannerCoordinatorDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.iac.infobanner.DashboardInfoBannerCoordinatorDuxo$bind$1", m3645f = "DashboardInfoBannerCoordinatorDuxo.kt", m3646l = {78}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.iac.infobanner.DashboardInfoBannerCoordinatorDuxo$bind$1 */
    static final class C390611 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ List<IacInfoBannerLocation> $locations;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C390611(List<? extends IacInfoBannerLocation> list, String str, Continuation<? super C390611> continuation) {
            super(2, continuation);
            this.$locations = list;
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DashboardInfoBannerCoordinatorDuxo.this.new C390611(this.$locations, this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C390611) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Observable observableStreamBatch$default = IacInfoBannerStore.streamBatch$default(DashboardInfoBannerCoordinatorDuxo.this.iacInfoBannerStore, this.$locations, null, null, null, null, null, null, null, null, this.$accountNumber, null, 1534, null);
                final List<IacInfoBannerLocation> list = this.$locations;
                Observable map = observableStreamBatch$default.map(new Function() { // from class: com.robinhood.shared.iac.infobanner.DashboardInfoBannerCoordinatorDuxo.bind.1.1
                    @Override // io.reactivex.functions.Function
                    public final ImmutableMap<IacInfoBannerLocation, IacInfoBanner> apply(List<IacInfoBanner> banners) {
                        Intrinsics.checkNotNullParameter(banners, "banners");
                        List<IacInfoBannerLocation> list2 = list;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
                        for (T t : list2) {
                            linkedHashMap.put(t, IacInfoBanners.findByLocation(banners, (IacInfoBannerLocation) t));
                        }
                        return extensions2.toImmutableMap(linkedHashMap);
                    }
                });
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                Flow flowBuffer$default = Context7.buffer$default(RxConvert.asFlow(map), Integer.MAX_VALUE, null, 2, null);
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(DashboardInfoBannerCoordinatorDuxo.this, null);
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

        /* compiled from: DashboardInfoBannerCoordinatorDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005 \u0006*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00030\u0003H\n"}, m3636d2 = {"<anonymous>", "", "bannersMap", "Lkotlinx/collections/immutable/ImmutableMap;", "Lcom/robinhood/models/db/IacInfoBannerLocation;", "Lcom/robinhood/models/db/IacInfoBanner;", "kotlin.jvm.PlatformType"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.iac.infobanner.DashboardInfoBannerCoordinatorDuxo$bind$1$2", m3645f = "DashboardInfoBannerCoordinatorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.iac.infobanner.DashboardInfoBannerCoordinatorDuxo$bind$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<ImmutableMap<IacInfoBannerLocation, ? extends IacInfoBanner>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DashboardInfoBannerCoordinatorDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(DashboardInfoBannerCoordinatorDuxo dashboardInfoBannerCoordinatorDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = dashboardInfoBannerCoordinatorDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(ImmutableMap<IacInfoBannerLocation, ? extends IacInfoBanner> immutableMap, Continuation<? super Unit> continuation) {
                return invoke2((ImmutableMap<IacInfoBannerLocation, IacInfoBanner>) immutableMap, continuation);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(ImmutableMap<IacInfoBannerLocation, IacInfoBanner> immutableMap, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(immutableMap, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: DashboardInfoBannerCoordinatorDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/iac/infobanner/DashboardInfoBannerCoordinatorDuxoDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.shared.iac.infobanner.DashboardInfoBannerCoordinatorDuxo$bind$1$2$1", m3645f = "DashboardInfoBannerCoordinatorDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.shared.iac.infobanner.DashboardInfoBannerCoordinatorDuxo$bind$1$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DashboardInfoBannerCoordinatorDuxoDataState, Continuation<? super DashboardInfoBannerCoordinatorDuxoDataState>, Object> {
                final /* synthetic */ ImmutableMap<IacInfoBannerLocation, IacInfoBanner> $bannersMap;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(ImmutableMap<IacInfoBannerLocation, IacInfoBanner> immutableMap, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$bannersMap = immutableMap;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$bannersMap, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(DashboardInfoBannerCoordinatorDuxoDataState dashboardInfoBannerCoordinatorDuxoViewState2, Continuation<? super DashboardInfoBannerCoordinatorDuxoDataState> continuation) {
                    return ((AnonymousClass1) create(dashboardInfoBannerCoordinatorDuxoViewState2, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    DashboardInfoBannerCoordinatorDuxoDataState dashboardInfoBannerCoordinatorDuxoViewState2 = (DashboardInfoBannerCoordinatorDuxoDataState) this.L$0;
                    ImmutableMap<IacInfoBannerLocation, IacInfoBanner> immutableMap = this.$bannersMap;
                    Intrinsics.checkNotNull(immutableMap);
                    return dashboardInfoBannerCoordinatorDuxoViewState2.copy(immutableMap);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new AnonymousClass1((ImmutableMap) this.L$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public final Job bind(List<? extends IacInfoBannerLocation> locations, String accountNumber) {
        Intrinsics.checkNotNullParameter(locations, "locations");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C390611(locations, accountNumber, null), 3, null);
    }
}
