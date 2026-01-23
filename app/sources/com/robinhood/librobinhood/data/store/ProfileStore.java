package com.robinhood.librobinhood.data.store;

import com.jakewharton.rxrelay2.BehaviorRelay;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.api.retrofit.Brokeback;
import com.robinhood.api.social.SocialBonfireApi;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.models.api.ApiProfile;
import com.robinhood.models.api.bonfire.ApiSocialProfileInfo;
import com.robinhood.models.api.bonfire.ApiUpdateSocialProfileInfo;
import com.robinhood.models.dao.ProfileDao;
import com.robinhood.models.p320db.Profile;
import com.robinhood.models.p320db.Profile2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Completables;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.Action;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
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

/* compiled from: ProfileStore.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001cJ\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020#J\u0012\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u000e\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0011 \u0012*\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00100\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/ProfileStore;", "Lcom/robinhood/store/Store;", "brokeback", "Lcom/robinhood/api/retrofit/Brokeback;", "socialApi", "Lcom/robinhood/api/social/SocialBonfireApi;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/ProfileDao;", "<init>", "(Lcom/robinhood/api/retrofit/Brokeback;Lcom/robinhood/api/social/SocialBonfireApi;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/ProfileDao;)V", "savedProfileEventRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/udf/UiEvent;", "", "kotlin.jvm.PlatformType", "profileEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "Lcom/robinhood/models/api/ApiProfile;", "newProfileEndpoint", "Lcom/robinhood/models/api/bonfire/ApiSocialProfileInfo;", "streamProfile", "Lio/reactivex/Observable;", "Lcom/robinhood/models/db/Profile;", "fetchProfile", "Lio/reactivex/Single;", "refreshProfile", "Lio/reactivex/Completable;", "force", "", "updateProfile", "request", "Lcom/robinhood/models/api/ApiProfile$Request;", "streamSavedProfileEvent", "lib-store-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class ProfileStore extends Store {
    private final Brokeback brokeback;
    private final ProfileDao dao;
    private final ExperimentsStore experimentsStore;
    private final Endpoint<Unit, ApiSocialProfileInfo> newProfileEndpoint;
    private final Endpoint<Unit, ApiProfile> profileEndpoint;
    private final BehaviorRelay<UiEvent<Unit>> savedProfileEventRelay;
    private final SocialBonfireApi socialApi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileStore(Brokeback brokeback, SocialBonfireApi socialApi, ExperimentsStore experimentsStore, StoreBundle storeBundle, ProfileDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(brokeback, "brokeback");
        Intrinsics.checkNotNullParameter(socialApi, "socialApi");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.brokeback = brokeback;
        this.socialApi = socialApi;
        this.experimentsStore = experimentsStore;
        this.dao = dao;
        BehaviorRelay<UiEvent<Unit>> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.savedProfileEventRelay = behaviorRelayCreate;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        this.profileEndpoint = Endpoint.Companion.create$default(companion, new ProfileStore4(this, null), getLogoutKillswitch(), new ProfileStore5(this, null), storeBundle.getClock(), null, 16, null);
        this.newProfileEndpoint = Endpoint.Companion.create$default(companion, new ProfileStore2(this, null), getLogoutKillswitch(), new ProfileStore3(this, null), storeBundle.getClock(), null, 16, null);
    }

    public final Observable<Profile> streamProfile() {
        return asObservable(takeWhileLoggedIn(Operators.mapFirstItem(this.dao.get())));
    }

    public final Single<Profile> fetchProfile() {
        Single<Profile> singleFlatMap = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{ProfileServiceMigrationRollout.INSTANCE}, false, null, 6, null).firstOrError().flatMap(new Function() { // from class: com.robinhood.librobinhood.data.store.ProfileStore.fetchProfile.1

            /* compiled from: ProfileStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/Profile;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ProfileStore$fetchProfile$1$1", m3645f = "ProfileStore.kt", m3646l = {66, EnumC7081g.SDK_ASSET_ICON_HOME_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.ProfileStore$fetchProfile$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Profile>, Object> {
                final /* synthetic */ Boolean $inRollout;
                int label;
                final /* synthetic */ ProfileStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Boolean bool, ProfileStore profileStore, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$inRollout = bool;
                    this.this$0 = profileStore;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$inRollout, this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Profile> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
                
                    if (r5 == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
                
                    if (r5 == r0) goto L19;
                 */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i != 0) {
                        if (i == 1) {
                            ResultKt.throwOnFailure(obj);
                            return ProfileStore7.toDbModel((ApiSocialProfileInfo) obj);
                        }
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return ((ApiProfile) obj).toDbModel();
                    }
                    ResultKt.throwOnFailure(obj);
                    if (this.$inRollout.booleanValue()) {
                        Endpoint endpoint = this.this$0.newProfileEndpoint;
                        this.label = 1;
                        obj = Endpoint8.forceFetch$default(endpoint, null, this, 1, null);
                    } else {
                        Endpoint endpoint2 = this.this$0.profileEndpoint;
                        this.label = 2;
                        obj = Endpoint8.forceFetch$default(endpoint2, null, this, 1, null);
                    }
                    return coroutine_suspended;
                }
            }

            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends Profile> apply(Boolean inRollout) {
                Intrinsics.checkNotNullParameter(inRollout, "inRollout");
                ProfileStore profileStore = ProfileStore.this;
                return RxFactory.DefaultImpls.rxSingle$default(profileStore, null, new AnonymousClass1(inRollout, profileStore, null), 1, null);
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleFlatMap, "flatMap(...)");
        return singleFlatMap;
    }

    public final Completable refreshProfile(final boolean force) {
        Completable completableFlatMapCompletable = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{ProfileServiceMigrationRollout.INSTANCE}, false, null, 6, null).firstOrError().flatMapCompletable(new Function() { // from class: com.robinhood.librobinhood.data.store.ProfileStore$refreshProfile$completable$1

            /* compiled from: ProfileStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ProfileStore$refreshProfile$completable$1$1", m3645f = "ProfileStore.kt", m3646l = {81, 83, 87, 89}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.ProfileStore$refreshProfile$completable$1$1 */
            static final class C342631 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ boolean $force;
                final /* synthetic */ Boolean $inRollout;
                int label;
                final /* synthetic */ ProfileStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C342631(Boolean bool, boolean z, ProfileStore profileStore, Continuation<? super C342631> continuation) {
                    super(2, continuation);
                    this.$inRollout = bool;
                    this.$force = z;
                    this.this$0 = profileStore;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C342631(this.$inRollout, this.$force, this.this$0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C342631) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:19:0x0049, code lost:
                
                    if (r7 == r0) goto L34;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
                
                    if (r7 == r0) goto L34;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
                
                    if (r7 == r0) goto L34;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
                
                    if (r7 == r0) goto L34;
                 */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (this.$inRollout.booleanValue()) {
                            if (this.$force) {
                                Endpoint endpoint = this.this$0.newProfileEndpoint;
                                this.label = 1;
                                obj = Endpoint8.forceFetch$default(endpoint, null, this, 1, null);
                            } else {
                                Endpoint endpoint2 = this.this$0.newProfileEndpoint;
                                this.label = 2;
                                obj = Endpoint8.fetch$default(endpoint2, null, this, 1, null);
                            }
                        } else if (this.$force) {
                            Endpoint endpoint3 = this.this$0.profileEndpoint;
                            this.label = 3;
                            obj = Endpoint8.forceFetch$default(endpoint3, null, this, 1, null);
                        } else {
                            Endpoint endpoint4 = this.this$0.profileEndpoint;
                            this.label = 4;
                            obj = Endpoint8.fetch$default(endpoint4, null, this, 1, null);
                        }
                        return coroutine_suspended;
                    }
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else if (i == 2) {
                        ResultKt.throwOnFailure(obj);
                    } else if (i == 3) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(Boolean inRollout) {
                Intrinsics.checkNotNullParameter(inRollout, "inRollout");
                ProfileStore profileStore = this.this$0;
                return RxFactory.DefaultImpls.rxCompletable$default(profileStore, null, new C342631(inRollout, force, profileStore, null), 1, null).cache();
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        ScopedSubscriptionKt.subscribeIn(Completables.ignoreNetworkExceptions(completableFlatMapCompletable), getStoreScope());
        return completableFlatMapCompletable;
    }

    public final Completable updateProfile(final ApiProfile.Request request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.getMedia_id() != null && request.getRemove_media()) {
            throw new IllegalArgumentException("media_id and remove_media cannot both be set.");
        }
        Completable completableDoOnComplete = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{ProfileServiceMigrationRollout.INSTANCE}, false, null, 6, null).firstOrError().flatMapCompletable(new Function() { // from class: com.robinhood.librobinhood.data.store.ProfileStore.updateProfile.2

            /* compiled from: ProfileStore.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.ProfileStore$updateProfile$2$1", m3645f = "ProfileStore.kt", m3646l = {111, 120}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.librobinhood.data.store.ProfileStore$updateProfile$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Boolean $inRollout;
                final /* synthetic */ ApiProfile.Request $request;
                int label;
                final /* synthetic */ ProfileStore this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(Boolean bool, ProfileStore profileStore, ApiProfile.Request request, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$inRollout = bool;
                    this.this$0 = profileStore;
                    this.$request = request;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$inRollout, this.this$0, this.$request, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
                
                    if (r8.updateProfile(r6, r7) == r0) goto L24;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
                
                    if (r8.updateProfile(r1, r7) == r0) goto L24;
                 */
                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        if (this.$inRollout.booleanValue()) {
                            SocialBonfireApi socialBonfireApi = this.this$0.socialApi;
                            String username = this.$request.getUsername();
                            UUID media_id = this.$request.getMedia_id();
                            String string2 = media_id != null ? media_id.toString() : null;
                            Profile2 color = this.$request.getColor();
                            ApiUpdateSocialProfileInfo apiUpdateSocialProfileInfo = new ApiUpdateSocialProfileInfo(string2, color != null ? color.getServerValue() : null, username, this.$request.getRemove_media());
                            this.label = 1;
                        } else {
                            Brokeback brokeback = this.this$0.brokeback;
                            ApiProfile.Request request = this.$request;
                            this.label = 2;
                        }
                        return coroutine_suspended;
                    }
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        Unit unit = Unit.INSTANCE;
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(Boolean inRollout) {
                Intrinsics.checkNotNullParameter(inRollout, "inRollout");
                ProfileStore profileStore = ProfileStore.this;
                return RxFactory.DefaultImpls.rxCompletable$default(profileStore, null, new AnonymousClass1(inRollout, profileStore, request, null), 1, null);
            }
        }).subscribeOn(Schedulers.m3346io()).doOnComplete(new Action() { // from class: com.robinhood.librobinhood.data.store.ProfileStore.updateProfile.3
            @Override // io.reactivex.functions.Action
            public final void run() {
                ProfileStore.this.savedProfileEventRelay.accept(new UiEvent(Unit.INSTANCE));
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDoOnComplete, "doOnComplete(...)");
        return completableDoOnComplete;
    }

    public final Observable<UiEvent<Unit>> streamSavedProfileEvent() {
        Observable<UiEvent<Unit>> observableHide = this.savedProfileEventRelay.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        return observableHide;
    }
}
