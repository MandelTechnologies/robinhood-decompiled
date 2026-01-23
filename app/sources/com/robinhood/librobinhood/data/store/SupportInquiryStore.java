package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.api.retrofit.PathfinderApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.ApiChannelAvailabilityDetails;
import com.robinhood.models.api.ApiInquiry;
import com.robinhood.models.api.ApiIssueDetail;
import com.robinhood.models.api.ApiSupportBreadcrumb;
import com.robinhood.models.api.ChannelType;
import com.robinhood.models.api.CreateBreadcrumbInquiryRequest;
import com.robinhood.models.api.CreateInquiryRequest;
import com.robinhood.models.api.PathfinderInitialState;
import com.robinhood.models.api.suv.ApiCreateUserMachineRequest;
import com.robinhood.models.p355ui.ChannelAvailabilityDetails;
import com.robinhood.models.p355ui.ChannelAvailabilityDetails3;
import com.robinhood.models.p355ui.IssueDetail;
import com.robinhood.models.p355ui.IssueDetail2;
import com.robinhood.prefs.Installation;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.UUID;
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

/* compiled from: SupportInquiryStore.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\u0006\u0010\r\u001a\u00020\u000eJ$\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bJ\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u0019\u001a\u00020\u001aJ\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dJ\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010 \u001a\u00020!J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/SupportInquiryStore;", "Lcom/robinhood/store/Store;", "pathfinderApi", "Lcom/robinhood/api/retrofit/PathfinderApi;", "installation", "Lcom/robinhood/prefs/Installation;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/retrofit/PathfinderApi;Lcom/robinhood/prefs/Installation;Lcom/robinhood/store/StoreBundle;)V", "fetchIssueDetail", "Lio/reactivex/Single;", "Lcom/robinhood/models/ui/IssueDetail;", "inquiryId", "Ljava/util/UUID;", "fetchPhoneIssueDetail", "Lcom/robinhood/models/ui/IssueDetail$Phone;", "fetchChannelAvailability", "Lcom/robinhood/models/ui/ChannelAvailabilityDetails;", "channelType", "Lcom/robinhood/models/api/ChannelType;", "channelScreen", "", "createBlankInquiry", "createInquiryForState", "state", "Lcom/robinhood/models/api/PathfinderInitialState;", "createInquiryWithBreadcrumbs", "breadcrumbs", "", "Lcom/robinhood/models/api/ApiSupportBreadcrumb;", "createUserMachineInquiry", "request", "Lcom/robinhood/models/api/suv/ApiCreateUserMachineRequest;", "createSurveyInquiry", "lib-store-cx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class SupportInquiryStore extends Store {
    private final Installation installation;
    private final PathfinderApi pathfinderApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportInquiryStore(PathfinderApi pathfinderApi, Installation installation, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(pathfinderApi, "pathfinderApi");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.pathfinderApi = pathfinderApi;
        this.installation = installation;
    }

    /* compiled from: SupportInquiryStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiIssueDetail;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportInquiryStore$fetchIssueDetail$1", m3645f = "SupportInquiryStore.kt", m3646l = {35}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.SupportInquiryStore$fetchIssueDetail$1 */
    static final class C343321 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiIssueDetail>, Object> {
        final /* synthetic */ UUID $inquiryId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C343321(UUID uuid, Continuation<? super C343321> continuation) {
            super(2, continuation);
            this.$inquiryId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportInquiryStore.this.new C343321(this.$inquiryId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiIssueDetail> continuation) {
            return ((C343321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            PathfinderApi pathfinderApi = SupportInquiryStore.this.pathfinderApi;
            UUID uuid = this.$inquiryId;
            String strMo2745id = SupportInquiryStore.this.installation.mo2745id();
            this.label = 1;
            Object issueDetail = pathfinderApi.getIssueDetail(uuid, strMo2745id, this);
            return issueDetail == coroutine_suspended ? coroutine_suspended : issueDetail;
        }
    }

    private final Single<IssueDetail> fetchIssueDetail(UUID inquiryId) {
        Single<IssueDetail> map = RxFactory.DefaultImpls.rxSingle$default(this, null, new C343321(inquiryId, null), 1, null).map(new Function() { // from class: com.robinhood.librobinhood.data.store.SupportInquiryStore.fetchIssueDetail.2
            @Override // io.reactivex.functions.Function
            public final IssueDetail apply(ApiIssueDetail it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return IssueDetail2.toUiModel(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Single<IssueDetail.Phone> fetchPhoneIssueDetail(UUID inquiryId) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Single map = fetchIssueDetail(inquiryId).map(new Function() { // from class: com.robinhood.librobinhood.data.store.SupportInquiryStore.fetchPhoneIssueDetail.1
            @Override // io.reactivex.functions.Function
            public final IssueDetail.Phone apply(IssueDetail issueDetail) throws SupportInquiryStore2 {
                Intrinsics.checkNotNullParameter(issueDetail, "issueDetail");
                if (!(issueDetail instanceof IssueDetail.Phone)) {
                    throw new SupportInquiryStore2(ChannelType.PHONE, issueDetail.getChannelType());
                }
                return (IssueDetail.Phone) issueDetail;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* compiled from: SupportInquiryStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiChannelAvailabilityDetails;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportInquiryStore$fetchChannelAvailability$1", m3645f = "SupportInquiryStore.kt", m3646l = {61}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.SupportInquiryStore$fetchChannelAvailability$1 */
    static final class C343301 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiChannelAvailabilityDetails>, Object> {
        final /* synthetic */ String $channelScreen;
        final /* synthetic */ ChannelType $channelType;
        final /* synthetic */ UUID $inquiryId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C343301(UUID uuid, ChannelType channelType, String str, Continuation<? super C343301> continuation) {
            super(2, continuation);
            this.$inquiryId = uuid;
            this.$channelType = channelType;
            this.$channelScreen = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportInquiryStore.this.new C343301(this.$inquiryId, this.$channelType, this.$channelScreen, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiChannelAvailabilityDetails> continuation) {
            return ((C343301) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            PathfinderApi pathfinderApi = SupportInquiryStore.this.pathfinderApi;
            UUID uuid = this.$inquiryId;
            ChannelType channelType = this.$channelType;
            String str = this.$channelScreen;
            String strMo2745id = SupportInquiryStore.this.installation.mo2745id();
            this.label = 1;
            Object channelAvailability = pathfinderApi.getChannelAvailability(uuid, channelType, str, strMo2745id, this);
            return channelAvailability == coroutine_suspended ? coroutine_suspended : channelAvailability;
        }
    }

    public final Single<ChannelAvailabilityDetails> fetchChannelAvailability(UUID inquiryId, ChannelType channelType, String channelScreen) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(channelType, "channelType");
        Intrinsics.checkNotNullParameter(channelScreen, "channelScreen");
        Single<ChannelAvailabilityDetails> map = RxFactory.DefaultImpls.rxSingle$default(this, null, new C343301(inquiryId, channelType, channelScreen, null), 1, null).map(new Function() { // from class: com.robinhood.librobinhood.data.store.SupportInquiryStore.fetchChannelAvailability.2
            @Override // io.reactivex.functions.Function
            public final ChannelAvailabilityDetails apply(ApiChannelAvailabilityDetails it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return ChannelAvailabilityDetails3.toUiModel(it);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* compiled from: SupportInquiryStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiInquiry;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportInquiryStore$createBlankInquiry$1", m3645f = "SupportInquiryStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.SupportInquiryStore$createBlankInquiry$1 */
    static final class C343221 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiInquiry>, Object> {
        int label;

        C343221(Continuation<? super C343221> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportInquiryStore.this.new C343221(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiInquiry> continuation) {
            return ((C343221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            PathfinderApi pathfinderApi = SupportInquiryStore.this.pathfinderApi;
            CreateInquiryRequest createInquiryRequest = new CreateInquiryRequest(SupportInquiryStore.this.installation.mo2745id(), null, 2, null);
            this.label = 1;
            Object objCreateInquiry = pathfinderApi.createInquiry(createInquiryRequest, this);
            return objCreateInquiry == coroutine_suspended ? coroutine_suspended : objCreateInquiry;
        }
    }

    public final Single<UUID> createBlankInquiry() {
        Single<UUID> map = RxFactory.DefaultImpls.rxSingle$default(this, null, new C343221(null), 1, null).map(new Function() { // from class: com.robinhood.librobinhood.data.store.SupportInquiryStore.createBlankInquiry.2
            @Override // io.reactivex.functions.Function
            public final UUID apply(ApiInquiry it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getId();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* compiled from: SupportInquiryStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiInquiry;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportInquiryStore$createInquiryForState$1", m3645f = "SupportInquiryStore.kt", m3646l = {75}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.SupportInquiryStore$createInquiryForState$1 */
    static final class C343241 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiInquiry>, Object> {
        final /* synthetic */ PathfinderInitialState $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C343241(PathfinderInitialState pathfinderInitialState, Continuation<? super C343241> continuation) {
            super(2, continuation);
            this.$state = pathfinderInitialState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportInquiryStore.this.new C343241(this.$state, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiInquiry> continuation) {
            return ((C343241) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            PathfinderApi pathfinderApi = SupportInquiryStore.this.pathfinderApi;
            CreateInquiryRequest createInquiryRequest = new CreateInquiryRequest(SupportInquiryStore.this.installation.mo2745id(), this.$state.getKey());
            this.label = 1;
            Object objCreateInquiry = pathfinderApi.createInquiry(createInquiryRequest, this);
            return objCreateInquiry == coroutine_suspended ? coroutine_suspended : objCreateInquiry;
        }
    }

    public final Single<UUID> createInquiryForState(PathfinderInitialState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Single<UUID> map = RxFactory.DefaultImpls.rxSingle$default(this, null, new C343241(state, null), 1, null).map(new Function() { // from class: com.robinhood.librobinhood.data.store.SupportInquiryStore.createInquiryForState.2
            @Override // io.reactivex.functions.Function
            public final UUID apply(ApiInquiry it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getId();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* compiled from: SupportInquiryStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiInquiry;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportInquiryStore$createInquiryWithBreadcrumbs$1", m3645f = "SupportInquiryStore.kt", m3646l = {82}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.SupportInquiryStore$createInquiryWithBreadcrumbs$1 */
    static final class C343261 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiInquiry>, Object> {
        final /* synthetic */ List<ApiSupportBreadcrumb> $breadcrumbs;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C343261(List<ApiSupportBreadcrumb> list, Continuation<? super C343261> continuation) {
            super(2, continuation);
            this.$breadcrumbs = list;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportInquiryStore.this.new C343261(this.$breadcrumbs, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiInquiry> continuation) {
            return ((C343261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            PathfinderApi pathfinderApi = SupportInquiryStore.this.pathfinderApi;
            CreateBreadcrumbInquiryRequest createBreadcrumbInquiryRequest = new CreateBreadcrumbInquiryRequest(SupportInquiryStore.this.installation.mo2745id(), this.$breadcrumbs);
            this.label = 1;
            Object objCreateBreadcrumbInquiry = pathfinderApi.createBreadcrumbInquiry(createBreadcrumbInquiryRequest, this);
            return objCreateBreadcrumbInquiry == coroutine_suspended ? coroutine_suspended : objCreateBreadcrumbInquiry;
        }
    }

    public final Single<UUID> createInquiryWithBreadcrumbs(List<ApiSupportBreadcrumb> breadcrumbs) {
        Intrinsics.checkNotNullParameter(breadcrumbs, "breadcrumbs");
        Single<UUID> map = RxFactory.DefaultImpls.rxSingle$default(this, null, new C343261(breadcrumbs, null), 1, null).map(new Function() { // from class: com.robinhood.librobinhood.data.store.SupportInquiryStore.createInquiryWithBreadcrumbs.2
            @Override // io.reactivex.functions.Function
            public final UUID apply(ApiInquiry it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it.getId();
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    /* compiled from: SupportInquiryStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Ljava/util/UUID;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportInquiryStore$createUserMachineInquiry$1", m3645f = "SupportInquiryStore.kt", m3646l = {91}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.SupportInquiryStore$createUserMachineInquiry$1 */
    static final class C343291 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UUID>, Object> {
        final /* synthetic */ ApiCreateUserMachineRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C343291(ApiCreateUserMachineRequest apiCreateUserMachineRequest, Continuation<? super C343291> continuation) {
            super(2, continuation);
            this.$request = apiCreateUserMachineRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportInquiryStore.this.new C343291(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UUID> continuation) {
            return ((C343291) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PathfinderApi pathfinderApi = SupportInquiryStore.this.pathfinderApi;
                ApiCreateUserMachineRequest apiCreateUserMachineRequest = this.$request;
                this.label = 1;
                obj = pathfinderApi.createUserMachine(apiCreateUserMachineRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((ApiInquiry) obj).getId();
        }
    }

    public final Single<UUID> createUserMachineInquiry(ApiCreateUserMachineRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C343291(request, null), 1, null);
    }

    /* compiled from: SupportInquiryStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Ljava/util/UUID;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportInquiryStore$createSurveyInquiry$1", m3645f = "SupportInquiryStore.kt", m3646l = {101}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.SupportInquiryStore$createSurveyInquiry$1 */
    static final class C343281 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UUID>, Object> {
        int label;

        C343281(Continuation<? super C343281> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportInquiryStore.this.new C343281(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UUID> continuation) {
            return ((C343281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PathfinderApi pathfinderApi = SupportInquiryStore.this.pathfinderApi;
                this.label = 1;
                obj = pathfinderApi.createSurveyInquiry(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return ((ApiInquiry) obj).getId();
        }
    }

    public final Single<UUID> createSurveyInquiry() {
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C343281(null), 1, null);
    }
}
