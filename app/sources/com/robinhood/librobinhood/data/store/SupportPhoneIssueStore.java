package com.robinhood.librobinhood.data.store;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.p196db.Query;
import com.robinhood.android.moria.p196db.reactor.PollEach;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.ApiIssue;
import com.robinhood.models.api.ApiSimpleIssue;
import com.robinhood.models.api.PhoneChannelStatus;
import com.robinhood.models.p355ui.Issue;
import com.robinhood.models.p355ui.SimpleIssue;
import com.robinhood.prefs.Installation;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import p479j$.time.Duration;
import retrofit2.Response;

/* compiled from: SupportPhoneIssueStore.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001<B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00100%2\u0006\u0010&\u001a\u00020\u000fJ\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00180%2\u0006\u0010&\u001a\u00020\u000fJ\u0012\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120%J\u0012\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00170%J\u0012\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170%J\u0016\u0010+\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010-J\u001e\u0010.\u001a\u00020\u00182\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010/\u001a\u000200H\u0086@¢\u0006\u0002\u00101J\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020\u0010032\u0006\u0010&\u001a\u00020\u000fJ\u0014\u00104\u001a\b\u0012\u0004\u0012\u00020\u0010032\u0006\u0010&\u001a\u00020\u000fJ\u0012\u00105\u001a\u0006\u0012\u0002\b\u00030%2\u0006\u00106\u001a\u00020\u0018J\u000e\u00107\u001a\u00020\u001f2\u0006\u00106\u001a\u00020\u0018J\u0012\u00108\u001a\u0006\u0012\u0002\b\u00030%2\u0006\u00106\u001a\u00020\u0018J\u000e\u00109\u001a\u00020\u001f2\u0006\u00106\u001a\u00020\u0018J\u0016\u0010:\u001a\u00020\u001f2\u0006\u00106\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010;R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00150\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00150\rX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u001e\u001a\u001a\u0012\u0004\u0012\u00020\u001f\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u00120\u001c0\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\"X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010#\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\"X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006="}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/SupportPhoneIssueStore;", "Lcom/robinhood/store/Store;", "supportIssueStore", "Lcom/robinhood/librobinhood/data/store/SupportIssueStore;", "installation", "Lcom/robinhood/prefs/Installation;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/SupportIssueStore;Lcom/robinhood/prefs/Installation;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/store/StoreBundle;)V", "issueFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Ljava/util/UUID;", "Lcom/robinhood/models/ui/Issue;", "activeIssuesFlow", "", "Lcom/robinhood/models/ui/SimpleIssue;", "assignedIssuesFlow", "", "loggedOutPhoneIssueFlow", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/Issue$Phone;", "dismissedIssuesFlow", "issueEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lretrofit2/Response;", "Lcom/robinhood/models/api/ApiIssue;", "activeIssuesEndpoint", "", "Lcom/robinhood/models/api/ApiSimpleIssue;", "issueQuery", "Lcom/robinhood/android/moria/db/Query;", "activeIssuesQuery", "streamIssue", "Lio/reactivex/Observable;", "issueId", "streamPhoneIssue", "streamActiveIssues", "streamActiveIssue", "streamLoggedOutPhoneIssue", "createLoggedInVoiceCase", "inquiryId", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createLoggedOutVoiceCase", "loggedOutPhoneNumber", "", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelIssue", "Lio/reactivex/Single;", "requeueIssue", "streamPhoneIssueAssigned", "issue", "clearPhoneIssueAssigned", "streamDismissedPhoneIssue", "clearDismissedPhoneIssue", "updateIssueRelay", "(Lcom/robinhood/models/ui/Issue;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "lib-store-cx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class SupportPhoneIssueStore extends Store {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final long ISSUES_POLL_DURATION_S = 60;
    public static final long ISSUE_POLL_DURATION_S = 20;
    private final Endpoint<Unit, Response<List<ApiSimpleIssue>>> activeIssuesEndpoint;
    private final StateFlow2<List<SimpleIssue>> activeIssuesFlow;
    private final Query<Unit, List<SimpleIssue>> activeIssuesQuery;
    private final StateFlow2<Set<UUID>> assignedIssuesFlow;
    private final AuthManager authManager;
    private final StateFlow2<Set<UUID>> dismissedIssuesFlow;
    private final Installation installation;
    private final Endpoint<UUID, Response<ApiIssue>> issueEndpoint;
    private final StateFlow2<Map<UUID, Issue>> issueFlow;
    private final Query<UUID, Issue> issueQuery;
    private final StateFlow2<Optional<Issue.Phone>> loggedOutPhoneIssueFlow;
    private final SupportIssueStore supportIssueStore;

    /* compiled from: SupportPhoneIssueStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportPhoneIssueStore", m3645f = "SupportPhoneIssueStore.kt", m3646l = {147}, m3647m = "createLoggedInVoiceCase")
    /* renamed from: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$createLoggedInVoiceCase$1 */
    static final class C343471 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C343471(Continuation<? super C343471> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SupportPhoneIssueStore.this.createLoggedInVoiceCase(null, this);
        }
    }

    /* compiled from: SupportPhoneIssueStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportPhoneIssueStore", m3645f = "SupportPhoneIssueStore.kt", m3646l = {156, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "createLoggedOutVoiceCase")
    /* renamed from: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$createLoggedOutVoiceCase$1 */
    static final class C343481 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C343481(Continuation<? super C343481> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SupportPhoneIssueStore.this.createLoggedOutVoiceCase(null, null, this);
        }
    }

    /* compiled from: SupportPhoneIssueStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportPhoneIssueStore", m3645f = "SupportPhoneIssueStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE}, m3647m = "updateIssueRelay")
    /* renamed from: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$updateIssueRelay$1 */
    static final class C343521 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C343521(Continuation<? super C343521> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SupportPhoneIssueStore.this.updateIssueRelay(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportPhoneIssueStore(SupportIssueStore supportIssueStore, Installation installation, AuthManager authManager, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(supportIssueStore, "supportIssueStore");
        Intrinsics.checkNotNullParameter(installation, "installation");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.supportIssueStore = supportIssueStore;
        this.installation = installation;
        this.authManager = authManager;
        this.issueFlow = StateFlow4.MutableStateFlow(MapsKt.emptyMap());
        this.activeIssuesFlow = StateFlow4.MutableStateFlow(CollectionsKt.emptyList());
        this.assignedIssuesFlow = StateFlow4.MutableStateFlow(SetsKt.emptySet());
        this.loggedOutPhoneIssueFlow = StateFlow4.MutableStateFlow(Optional2.INSTANCE);
        this.dismissedIssuesFlow = StateFlow4.MutableStateFlow(SetsKt.emptySet());
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.issueEndpoint = Endpoint.Companion.create$default(companion, new SupportPhoneIssueStore4(this, null), getLogoutKillswitch(), new SupportPhoneIssueStore5(this, null), storeBundle.getClock(), null, 16, null);
        this.activeIssuesEndpoint = Endpoint.Companion.create$default(companion, new SupportPhoneIssueStore2(this, null), getLogoutKillswitch(), new SupportPhoneIssueStore3(this, null), storeBundle.getClock(), null, 16, null);
        Query.Companion companion2 = Query.INSTANCE;
        this.issueQuery = Store.create$default(this, companion2, "queryIssue", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportPhoneIssueStore.issueQuery$lambda$0(this.f$0, (UUID) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportPhoneIssueStore.issueQuery$lambda$2(this.f$0, (UUID) obj);
            }
        }, false, 8, null);
        this.activeIssuesQuery = Store.create$default(this, companion2, "queryActiveIssues", CollectionsKt.listOf(new PollEach(getStoreScope(), new Function1() { // from class: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportPhoneIssueStore.activeIssuesQuery$lambda$3(this.f$0, (Unit) obj);
            }
        })), new Function1() { // from class: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SupportPhoneIssueStore.activeIssuesQuery$lambda$4(this.f$0, (Unit) obj);
            }
        }, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow issueQuery$lambda$0(SupportPhoneIssueStore supportPhoneIssueStore, UUID issueId) {
        Intrinsics.checkNotNullParameter(issueId, "issueId");
        Endpoint<UUID, Response<ApiIssue>> endpoint = supportPhoneIssueStore.issueEndpoint;
        Duration durationOfSeconds = Duration.ofSeconds(20L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return Endpoint8.backendPoll$default(endpoint, issueId, durationOfSeconds, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow issueQuery$lambda$2(SupportPhoneIssueStore supportPhoneIssueStore, final UUID issueId) {
        Intrinsics.checkNotNullParameter(issueId, "issueId");
        final StateFlow2<Map<UUID, Issue>> stateFlow2 = supportPhoneIssueStore.issueFlow;
        return new Flow<Issue>() { // from class: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$issueQuery$lambda$2$$inlined$mapNotNull$1

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$issueQuery$lambda$2$$inlined$mapNotNull$1$2 */
            public static final class C343402<T> implements FlowCollector {
                final /* synthetic */ UUID $issueId$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$issueQuery$lambda$2$$inlined$mapNotNull$1$2", m3645f = "SupportPhoneIssueStore.kt", m3646l = {52}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$issueQuery$lambda$2$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C343402.this.emit(null, this);
                    }
                }

                public C343402(FlowCollector flowCollector, UUID uuid) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$issueId$inlined = uuid;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Object obj3 = ((Map) obj).get(this.$issueId$inlined);
                        if (obj3 != null) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Issue> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new C343402(flowCollector, issueId), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow activeIssuesQuery$lambda$3(SupportPhoneIssueStore supportPhoneIssueStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Endpoint<Unit, Response<List<ApiSimpleIssue>>> endpoint = supportPhoneIssueStore.activeIssuesEndpoint;
        Unit unit = Unit.INSTANCE;
        Duration durationOfSeconds = Duration.ofSeconds(60L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return Endpoint8.backendPoll$default(endpoint, unit, durationOfSeconds, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Flow activeIssuesQuery$lambda$4(SupportPhoneIssueStore supportPhoneIssueStore, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return supportPhoneIssueStore.activeIssuesFlow;
    }

    public final Observable<Issue> streamIssue(UUID issueId) {
        Intrinsics.checkNotNullParameter(issueId, "issueId");
        return this.issueQuery.asObservable(issueId);
    }

    public final Observable<Issue.Phone> streamPhoneIssue(UUID issueId) {
        Intrinsics.checkNotNullParameter(issueId, "issueId");
        Observable map = streamIssue(issueId).map(new Function() { // from class: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore.streamPhoneIssue.1
            @Override // io.reactivex.functions.Function
            public final Issue.Phone apply(Issue it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return (Issue.Phone) it;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final Observable<List<SimpleIssue>> streamActiveIssues() {
        return this.activeIssuesQuery.asObservable(Unit.INSTANCE);
    }

    public final Observable<Optional<Issue>> streamActiveIssue() {
        Observable<Optional<Issue>> observableSwitchMap = ObservablesKt.mapFirstOptional(streamActiveIssues()).switchMap(new Function() { // from class: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore.streamActiveIssue.1
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Optional<Issue>> apply(Optional<SimpleIssue> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                SimpleIssue simpleIssueComponent1 = optional.component1();
                if (simpleIssueComponent1 != null) {
                    return ObservablesKt.toOptionals(SupportPhoneIssueStore.this.streamIssue(simpleIssueComponent1.getId()));
                }
                Observable observableJust = Observable.just(Optional2.INSTANCE);
                Intrinsics.checkNotNull(observableJust);
                return observableJust;
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        return observableSwitchMap;
    }

    public final Observable<Optional<Issue.Phone>> streamLoggedOutPhoneIssue() {
        final StateFlow2<Optional<Issue.Phone>> stateFlow2 = this.loggedOutPhoneIssueFlow;
        return asObservable(new Flow<Optional<? extends Issue.Phone>>() { // from class: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$streamLoggedOutPhoneIssue$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Optional<? extends Issue.Phone>> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new C343422(flowCollector, this), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$streamLoggedOutPhoneIssue$$inlined$map$1$2 */
            public static final class C343422<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ SupportPhoneIssueStore this$0;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$streamLoggedOutPhoneIssue$$inlined$map$1$2", m3645f = "SupportPhoneIssueStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$streamLoggedOutPhoneIssue$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return C343422.this.emit(null, this);
                    }
                }

                public C343422(FlowCollector flowCollector, SupportPhoneIssueStore supportPhoneIssueStore) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = supportPhoneIssueStore;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        Object obj3 = (Optional) obj;
                        if (this.this$0.authManager.isLoggedIn()) {
                            obj3 = Optional2.INSTANCE;
                        }
                        anonymousClass1.label = 1;
                        if (flowCollector.emit(obj3, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createLoggedInVoiceCase(UUID uuid, Continuation<? super Issue.Phone> continuation) {
        C343471 c343471;
        if (continuation instanceof C343471) {
            c343471 = (C343471) continuation;
            int i = c343471.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c343471.label = i - Integer.MIN_VALUE;
            } else {
                c343471 = new C343471(continuation);
            }
        }
        Object objCreateLoggedInPhoneIssue = c343471.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c343471.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateLoggedInPhoneIssue);
            SupportIssueStore supportIssueStore = this.supportIssueStore;
            c343471.label = 1;
            objCreateLoggedInPhoneIssue = supportIssueStore.createLoggedInPhoneIssue(uuid, c343471);
            if (objCreateLoggedInPhoneIssue == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objCreateLoggedInPhoneIssue);
        }
        Intrinsics.checkNotNull(objCreateLoggedInPhoneIssue, "null cannot be cast to non-null type com.robinhood.models.ui.Issue.Phone");
        return (Issue.Phone) objCreateLoggedInPhoneIssue;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object createLoggedOutVoiceCase(UUID uuid, String str, Continuation<? super Issue.Phone> continuation) {
        C343481 c343481;
        if (continuation instanceof C343481) {
            c343481 = (C343481) continuation;
            int i = c343481.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c343481.label = i - Integer.MIN_VALUE;
            } else {
                c343481 = new C343481(continuation);
            }
        }
        Object objCreateLoggedOutPhoneIssue = c343481.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c343481.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objCreateLoggedOutPhoneIssue);
            SupportIssueStore supportIssueStore = this.supportIssueStore;
            String strMo2745id = this.installation.mo2745id();
            c343481.label = 1;
            objCreateLoggedOutPhoneIssue = supportIssueStore.createLoggedOutPhoneIssue(uuid, str, strMo2745id, c343481);
            if (objCreateLoggedOutPhoneIssue != coroutine_suspended) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Issue.Phone phone = (Issue.Phone) c343481.L$0;
            ResultKt.throwOnFailure(objCreateLoggedOutPhoneIssue);
            return phone;
        }
        ResultKt.throwOnFailure(objCreateLoggedOutPhoneIssue);
        Intrinsics.checkNotNull(objCreateLoggedOutPhoneIssue, "null cannot be cast to non-null type com.robinhood.models.ui.Issue.Phone");
        Issue.Phone phone2 = (Issue.Phone) objCreateLoggedOutPhoneIssue;
        StateFlow2<Optional<Issue.Phone>> stateFlow2 = this.loggedOutPhoneIssueFlow;
        Optional<Issue.Phone> optionalAsOptional = Optional3.asOptional(phone2);
        c343481.L$0 = phone2;
        c343481.label = 2;
        return stateFlow2.emit(optionalAsOptional, c343481) == coroutine_suspended ? coroutine_suspended : phone2;
    }

    /* compiled from: SupportPhoneIssueStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/ui/Issue;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$cancelIssue$1", m3645f = "SupportPhoneIssueStore.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$cancelIssue$1 */
    static final class C343441 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Issue>, Object> {
        final /* synthetic */ UUID $issueId;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C343441(UUID uuid, Continuation<? super C343441> continuation) {
            super(2, continuation);
            this.$issueId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportPhoneIssueStore.this.new C343441(this.$issueId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Issue> continuation) {
            return ((C343441) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Issue issue;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SupportIssueStore supportIssueStore = SupportPhoneIssueStore.this.supportIssueStore;
                UUID uuid = this.$issueId;
                this.label = 1;
                obj = supportIssueStore.cancelPhoneIssue(uuid, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                issue = (Issue) this.L$0;
                ResultKt.throwOnFailure(obj);
                Endpoint.DefaultImpls.refresh$default(SupportPhoneIssueStore.this.activeIssuesEndpoint, Unit.INSTANCE, true, null, 4, null);
                return issue;
            }
            ResultKt.throwOnFailure(obj);
            Issue issue2 = (Issue) obj;
            SupportPhoneIssueStore supportPhoneIssueStore = SupportPhoneIssueStore.this;
            this.L$0 = issue2;
            this.label = 2;
            if (supportPhoneIssueStore.updateIssueRelay(issue2, this) != coroutine_suspended) {
                issue = issue2;
                Endpoint.DefaultImpls.refresh$default(SupportPhoneIssueStore.this.activeIssuesEndpoint, Unit.INSTANCE, true, null, 4, null);
                return issue;
            }
            return coroutine_suspended;
        }
    }

    public final Single<Issue> cancelIssue(UUID issueId) {
        Intrinsics.checkNotNullParameter(issueId, "issueId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C343441(issueId, null), 1, null);
    }

    /* compiled from: SupportPhoneIssueStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/ui/Issue;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$requeueIssue$1", m3645f = "SupportPhoneIssueStore.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 182}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$requeueIssue$1 */
    static final class C343491 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Issue>, Object> {
        final /* synthetic */ UUID $issueId;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C343491(UUID uuid, Continuation<? super C343491> continuation) {
            super(2, continuation);
            this.$issueId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportPhoneIssueStore.this.new C343491(this.$issueId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Issue> continuation) {
            return ((C343491) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SupportIssueStore supportIssueStore = SupportPhoneIssueStore.this.supportIssueStore;
                UUID uuid = this.$issueId;
                this.label = 1;
                obj = supportIssueStore.requeuePhoneIssue(uuid, this);
                if (obj != coroutine_suspended) {
                }
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Issue issue = (Issue) this.L$0;
                ResultKt.throwOnFailure(obj);
                return issue;
            }
            ResultKt.throwOnFailure(obj);
            Issue issue2 = (Issue) obj;
            SupportPhoneIssueStore supportPhoneIssueStore = SupportPhoneIssueStore.this;
            this.L$0 = issue2;
            this.label = 2;
            return supportPhoneIssueStore.updateIssueRelay(issue2, this) == coroutine_suspended ? coroutine_suspended : issue2;
        }
    }

    public final Single<Issue> requeueIssue(UUID issueId) {
        Intrinsics.checkNotNullParameter(issueId, "issueId");
        return RxFactory.DefaultImpls.rxSingle$default(this, null, new C343491(issueId, null), 1, null);
    }

    public final Observable<?> streamPhoneIssueAssigned(final Issue.Phone issue) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        final StateFlow2<Set<UUID>> stateFlow2 = this.assignedIssuesFlow;
        return asObservable(new Flow<Set<? extends UUID>>() { // from class: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$streamPhoneIssueAssigned$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Set<? extends UUID>> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new AnonymousClass2(flowCollector, issue), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$streamPhoneIssueAssigned$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ Issue.Phone $issue$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$streamPhoneIssueAssigned$$inlined$filter$1$2", m3645f = "SupportPhoneIssueStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$streamPhoneIssueAssigned$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, Issue.Phone phone) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$issue$inlined = phone;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (((Set) obj).contains(this.$issue$inlined.getId())) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        });
    }

    /* compiled from: SupportPhoneIssueStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$clearPhoneIssueAssigned$1", m3645f = "SupportPhoneIssueStore.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$clearPhoneIssueAssigned$1 */
    static final class C343461 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Issue.Phone $issue;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C343461(Issue.Phone phone, Continuation<? super C343461> continuation) {
            super(2, continuation);
            this.$issue = phone;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportPhoneIssueStore.this.new C343461(this.$issue, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C343461) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2 stateFlow2 = SupportPhoneIssueStore.this.assignedIssuesFlow;
                Object value = SupportPhoneIssueStore.this.assignedIssuesFlow.getValue();
                if (value == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Set setMinus = SetsKt.minus((Set<? extends UUID>) value, this.$issue.getId());
                this.label = 1;
                if (stateFlow2.emit(setMinus, this) == coroutine_suspended) {
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

    public final void clearPhoneIssueAssigned(Issue.Phone issue) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C343461(issue, null), 3, null);
    }

    public final Observable<?> streamDismissedPhoneIssue(final Issue.Phone issue) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        final StateFlow2<Set<UUID>> stateFlow2 = this.dismissedIssuesFlow;
        return asObservable(new Flow<Set<? extends UUID>>() { // from class: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$streamDismissedPhoneIssue$$inlined$filter$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super Set<? extends UUID>> flowCollector, Continuation continuation) {
                Object objCollect = stateFlow2.collect(new AnonymousClass2(flowCollector, issue), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }

            /* compiled from: Emitters.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @SourceDebugExtension
            /* renamed from: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$streamDismissedPhoneIssue$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ Issue.Phone $issue$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$streamDismissedPhoneIssue$$inlined$filter$1$2", m3645f = "SupportPhoneIssueStore.kt", m3646l = {50}, m3647m = "emit")
                /* renamed from: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$streamDismissedPhoneIssue$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, Issue.Phone phone) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$issue$inlined = phone;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    }
                    Object obj2 = anonymousClass1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FlowCollector flowCollector = this.$this_unsafeFlow;
                        if (((Set) obj).contains(this.$issue$inlined.getId())) {
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(obj, anonymousClass1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }
        });
    }

    /* compiled from: SupportPhoneIssueStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$clearDismissedPhoneIssue$1", m3645f = "SupportPhoneIssueStore.kt", m3646l = {211}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.librobinhood.data.store.SupportPhoneIssueStore$clearDismissedPhoneIssue$1 */
    static final class C343451 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Issue.Phone $issue;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C343451(Issue.Phone phone, Continuation<? super C343451> continuation) {
            super(2, continuation);
            this.$issue = phone;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportPhoneIssueStore.this.new C343451(this.$issue, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C343451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow2 stateFlow2 = SupportPhoneIssueStore.this.dismissedIssuesFlow;
                Object value = SupportPhoneIssueStore.this.dismissedIssuesFlow.getValue();
                if (value == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Set setMinus = SetsKt.minus((Set<? extends UUID>) value, this.$issue.getId());
                this.label = 1;
                if (stateFlow2.emit(setMinus, this) == coroutine_suspended) {
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

    public final void clearDismissedPhoneIssue(Issue.Phone issue) {
        Intrinsics.checkNotNullParameter(issue, "issue");
        BuildersKt__Builders_commonKt.launch$default(getStoreScope(), null, null, new C343451(issue, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x013c, code lost:
    
        if (r14.emit(r13, r0) != r1) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateIssueRelay(Issue issue, Continuation<? super Unit> continuation) {
        C343521 c343521;
        Map<UUID, Issue> map;
        Issue issue2;
        Issue issue3;
        Map<UUID, Issue> map2;
        if (continuation instanceof C343521) {
            c343521 = (C343521) continuation;
            int i = c343521.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c343521.label = i - Integer.MIN_VALUE;
            } else {
                c343521 = new C343521(continuation);
            }
        }
        Object obj = c343521.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c343521.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Map<UUID, Issue> value = this.issueFlow.getValue();
            if (value == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            map = value;
            issue2 = map.get(issue.getId());
            Issue.Phone phone = issue2 instanceof Issue.Phone ? (Issue.Phone) issue2 : null;
            if ((phone != null ? phone.getChannelStatus() : null) == PhoneChannelStatus.WAITING) {
                Issue.Phone phone2 = issue instanceof Issue.Phone ? (Issue.Phone) issue : null;
                if ((phone2 != null ? phone2.getChannelStatus() : null) == PhoneChannelStatus.ASSIGNED) {
                    StateFlow2<Set<UUID>> stateFlow2 = this.assignedIssuesFlow;
                    Set<UUID> value2 = stateFlow2.getValue();
                    if (value2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Set<UUID> setPlus = SetsKt.plus(value2, ((Issue.Phone) issue).getId());
                    c343521.L$0 = issue;
                    c343521.L$1 = map;
                    c343521.L$2 = issue2;
                    c343521.label = 1;
                    if (stateFlow2.emit(setPlus, c343521) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
            }
        } else if (i2 == 1) {
            Issue issue4 = (Issue) c343521.L$2;
            map = (Map) c343521.L$1;
            Issue issue5 = (Issue) c343521.L$0;
            ResultKt.throwOnFailure(obj);
            issue2 = issue4;
            issue = issue5;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            map2 = (Map) c343521.L$1;
            issue3 = (Issue) c343521.L$0;
            ResultKt.throwOnFailure(obj);
            Issue issue6 = issue3;
            map = map2;
            issue = issue6;
            StateFlow2<Map<UUID, Issue>> stateFlow22 = this.issueFlow;
            Map<UUID, Issue> mapPlus = MapsKt.plus(map, Tuples4.m3642to(issue.getId(), issue));
            c343521.L$0 = null;
            c343521.L$1 = null;
            c343521.L$2 = null;
            c343521.label = 3;
        }
        Issue.Phone phone3 = issue2 instanceof Issue.Phone ? (Issue.Phone) issue2 : null;
        if ((phone3 != null ? phone3.getChannelStatus() : null) == PhoneChannelStatus.MISSED) {
            Issue.Phone phone4 = issue instanceof Issue.Phone ? (Issue.Phone) issue : null;
            if ((phone4 != null ? phone4.getChannelStatus() : null) == PhoneChannelStatus.CANCELLED) {
                StateFlow2<Set<UUID>> stateFlow23 = this.dismissedIssuesFlow;
                Set<UUID> value3 = stateFlow23.getValue();
                if (value3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Set<UUID> setPlus2 = SetsKt.plus(value3, ((Issue.Phone) issue).getId());
                c343521.L$0 = issue;
                c343521.L$1 = map;
                c343521.L$2 = null;
                c343521.label = 2;
                if (stateFlow23.emit(setPlus2, c343521) != coroutine_suspended) {
                    Map<UUID, Issue> map3 = map;
                    issue3 = issue;
                    map2 = map3;
                    Issue issue62 = issue3;
                    map = map2;
                    issue = issue62;
                }
            }
            return coroutine_suspended;
        }
        StateFlow2<Map<UUID, Issue>> stateFlow222 = this.issueFlow;
        Map<UUID, Issue> mapPlus2 = MapsKt.plus(map, Tuples4.m3642to(issue.getId(), issue));
        c343521.L$0 = null;
        c343521.L$1 = null;
        c343521.L$2 = null;
        c343521.label = 3;
    }

    /* compiled from: SupportPhoneIssueStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/SupportPhoneIssueStore$Companion;", "", "<init>", "()V", "ISSUE_POLL_DURATION_S", "", "getISSUE_POLL_DURATION_S$lib_store_cx_externalDebug$annotations", "ISSUES_POLL_DURATION_S", "getISSUES_POLL_DURATION_S$lib_store_cx_externalDebug$annotations", "lib-store-cx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getISSUES_POLL_DURATION_S$lib_store_cx_externalDebug$annotations() {
        }

        public static /* synthetic */ void getISSUE_POLL_DURATION_S$lib_store_cx_externalDebug$annotations() {
        }

        private Companion() {
        }
    }
}
