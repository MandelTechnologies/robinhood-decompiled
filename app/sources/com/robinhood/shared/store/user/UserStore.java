package com.robinhood.shared.store.user;

import com.robinhood.android.moria.network.Endpoint;
import com.robinhood.android.moria.network.Endpoint8;
import com.robinhood.android.moria.network.PostEndpoint;
import com.robinhood.android.moria.network.bouncer.DefaultStaleDecider;
import com.robinhood.api.retrofit.Sheriff;
import com.robinhood.coroutines.flow.Polling2;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.models.api.GenericMessage;
import com.robinhood.models.api.sheriff.ApiUser;
import com.robinhood.models.api.sheriff.ApiUserEmailValidationResponse;
import com.robinhood.models.api.sheriff.ApiUserVerifyEmailInfo;
import com.robinhood.models.dao.UserDao;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.models.p320db.sheriff.User2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import com.robinhood.utils.LogoutKillswitch;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import p479j$.time.Clock;
import p479j$.time.Duration;

/* compiled from: UserStore.kt */
@Metadata(m3635d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0012J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0015J\u0010\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\u0016\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u001aJ\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\u0006\u0010\u001c\u001a\u00020\u001dJ\u0016\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001fH\u0086@¢\u0006\u0002\u0010 J\u0016\u0010!\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u001aJ\u0016\u0010#\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u001aJ\u000e\u0010%\u001a\u00020$H\u0086@¢\u0006\u0002\u0010&J\u000e\u0010'\u001a\u00020(H\u0086@¢\u0006\u0002\u0010&J\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0012J\u0016\u0010*\u001a\u00020+2\u0006\u0010\u0019\u001a\u00020\u0010H\u0086@¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006,"}, m3636d2 = {"Lcom/robinhood/shared/store/user/UserStore;", "Lcom/robinhood/store/Store;", "sheriff", "Lcom/robinhood/api/retrofit/Sheriff;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "dao", "Lcom/robinhood/models/dao/UserDao;", "<init>", "(Lcom/robinhood/api/retrofit/Sheriff;Lcom/robinhood/store/StoreBundle;Lcom/robinhood/models/dao/UserDao;)V", "getUserEndpoint", "Lcom/robinhood/android/moria/network/Endpoint;", "", "Lcom/robinhood/models/db/sheriff/User;", "updateEmailAddress", "Lcom/robinhood/android/moria/network/PostEndpoint;", "", "cachedUserFlow", "Lkotlinx/coroutines/flow/Flow;", "coGetUser", "getUser", "Lio/reactivex/Observable;", "refresh", "force", "", "email", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createUser", "request", "Lcom/robinhood/models/api/sheriff/ApiUser$CreateUserRequest;", "validateEmail", "Lcom/robinhood/models/api/sheriff/ApiUser$ValidateEmailRequest;", "(Lcom/robinhood/models/api/sheriff/ApiUser$ValidateEmailRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetPassword", "password", "sendPasswordResetEmail", "Lcom/robinhood/models/api/GenericMessage;", "requestPasswordResetEmail", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserEmailVerifyInfo", "Lcom/robinhood/models/api/sheriff/ApiUserVerifyEmailInfo;", "pollUserEmailVerifyInfo", "getUserEmailValidation", "Lcom/robinhood/models/api/sheriff/ApiUserEmailValidationResponse;", "lib-store-user_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class UserStore extends Store {
    private final Flow<User> cachedUserFlow;
    private final UserDao dao;
    private final Endpoint<Unit, User> getUserEndpoint;
    private final Sheriff sheriff;
    private final PostEndpoint<String, User> updateEmailAddress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserStore(Sheriff sheriff, StoreBundle storeBundle, UserDao dao) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(sheriff, "sheriff");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        Intrinsics.checkNotNullParameter(dao, "dao");
        this.sheriff = sheriff;
        this.dao = dao;
        Endpoint.Companion companion = Endpoint.INSTANCE;
        UserStore2 userStore2 = new UserStore2(this, null);
        LogoutKillswitch logoutKillswitch = getLogoutKillswitch();
        UserStore3 userStore3 = new UserStore3(dao);
        Clock clock = storeBundle.getClock();
        Duration durationOfDays = Duration.ofDays(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfDays, "ofDays(...)");
        this.getUserEndpoint = companion.create(userStore2, logoutKillswitch, userStore3, clock, new DefaultStaleDecider(durationOfDays, storeBundle.getClock()));
        this.updateEmailAddress = PostEndpoint.INSTANCE.create(new C399941(null), new C399952(dao));
        this.cachedUserFlow = FlowKt.shareIn(FlowKt.distinctUntilChanged(FlowKt.filterNotNull(dao.getUser())), getLogoutKillswitch().getLoggedInScope(), SharingStarted.INSTANCE.getLazily(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object getUserEndpoint$insert(UserDao userDao, User user, Continuation continuation) {
        userDao.insert(user);
        return Unit.INSTANCE;
    }

    /* compiled from: UserStore.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/db/sheriff/User;", "email", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.store.user.UserStore$updateEmailAddress$1", m3645f = "UserStore.kt", m3646l = {46}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.store.user.UserStore$updateEmailAddress$1 */
    static final class C399941 extends ContinuationImpl7 implements Function2<String, Continuation<? super User>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C399941(Continuation<? super C399941> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C399941 c399941 = UserStore.this.new C399941(continuation);
            c399941.L$0 = obj;
            return c399941;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super User> continuation) {
            return ((C399941) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = (String) this.L$0;
                Sheriff sheriff = UserStore.this.sheriff;
                ApiUser.UpdateRequest updateRequest = new ApiUser.UpdateRequest(str, null, null);
                this.label = 1;
                obj = sheriff.updateUser(updateRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return User2.toDbModel((ApiUser) obj);
        }
    }

    /* compiled from: UserStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.store.user.UserStore$updateEmailAddress$2 */
    /* synthetic */ class C399952 extends AdaptedFunctionReference implements Function2<User, Continuation<? super Unit>, Object>, ContinuationImpl6 {
        C399952(Object obj) {
            super(2, obj, UserDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(User user, Continuation<? super Unit> continuation) {
            return UserStore.updateEmailAddress$insert$0((UserDao) this.receiver, user, continuation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object updateEmailAddress$insert$0(UserDao userDao, User user, Continuation continuation) {
        userDao.insert(user);
        return Unit.INSTANCE;
    }

    public final Flow<User> coGetUser() {
        return this.cachedUserFlow;
    }

    public final Observable<User> getUser() {
        return asObservable(this.cachedUserFlow);
    }

    public static /* synthetic */ void refresh$default(UserStore userStore, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        userStore.refresh(z);
    }

    public final void refresh(boolean force) {
        Endpoint8.refresh$default(this.getUserEndpoint, force, null, 2, null);
    }

    public final Object updateEmailAddress(String str, Continuation<? super User> continuation) {
        return PostEndpoint.DefaultImpls.post$default(this.updateEmailAddress, str, null, continuation, 2, null);
    }

    public final Observable<User> createUser(ApiUser.CreateUserRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.getUsername() != null) {
            String username = request.getUsername();
            Intrinsics.checkNotNull(username);
            String string2 = StringsKt.trim(username).toString();
            Locale ROOT = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
            String lowerCase = string2.toLowerCase(ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            request.setUsername(lowerCase);
        }
        Observable<User> observable = RxFactory.DefaultImpls.rxSingle$default(this, null, new C399911(request, null), 1, null).map(new Function() { // from class: com.robinhood.shared.store.user.UserStore.createUser.2
            @Override // io.reactivex.functions.Function
            public final User apply(ApiUser p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return User2.toDbModel(p0);
            }
        }).toObservable();
        Intrinsics.checkNotNullExpressionValue(observable, "toObservable(...)");
        return observable;
    }

    /* compiled from: UserStore.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/sheriff/ApiUser;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.store.user.UserStore$createUser$1", m3645f = "UserStore.kt", m3646l = {78}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.store.user.UserStore$createUser$1 */
    /* loaded from: classes6.dex */
    static final class C399911 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiUser>, Object> {
        final /* synthetic */ ApiUser.CreateUserRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C399911(ApiUser.CreateUserRequest createUserRequest, Continuation<? super C399911> continuation) {
            super(2, continuation);
            this.$request = createUserRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return UserStore.this.new C399911(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiUser> continuation) {
            return ((C399911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            Sheriff sheriff = UserStore.this.sheriff;
            ApiUser.CreateUserRequest createUserRequest = this.$request;
            this.label = 1;
            Object objCreateUser = sheriff.createUser(createUserRequest, this);
            return objCreateUser == coroutine_suspended ? coroutine_suspended : objCreateUser;
        }
    }

    public final Object validateEmail(ApiUser.ValidateEmailRequest validateEmailRequest, Continuation<? super Unit> continuation) {
        Object objValidateEmail = this.sheriff.validateEmail(validateEmailRequest, continuation);
        return objValidateEmail == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objValidateEmail : Unit.INSTANCE;
    }

    public final Object resetPassword(String str, Continuation<? super Unit> continuation) {
        Object objResetPassword = this.sheriff.resetPassword(str, continuation);
        return objResetPassword == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objResetPassword : Unit.INSTANCE;
    }

    public final Object sendPasswordResetEmail(String str, Continuation<? super GenericMessage> continuation) {
        return this.sheriff.sendPasswordResetEmail(str, continuation);
    }

    public final Object requestPasswordResetEmail(Continuation<? super GenericMessage> continuation) {
        return this.sheriff.requestPasswordResetEmail(continuation);
    }

    public final Object getUserEmailVerifyInfo(Continuation<? super ApiUserVerifyEmailInfo> continuation) {
        return this.sheriff.getUserVerifyEmailInfo(continuation);
    }

    /* compiled from: UserStore.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/sheriff/ApiUserVerifyEmailInfo;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.store.user.UserStore$pollUserEmailVerifyInfo$1", m3645f = "UserStore.kt", m3646l = {105}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.store.user.UserStore$pollUserEmailVerifyInfo$1 */
    /* loaded from: classes6.dex */
    static final class C399931 extends ContinuationImpl7 implements Function1<Continuation<? super ApiUserVerifyEmailInfo>, Object> {
        int label;

        C399931(Continuation<? super C399931> continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Continuation<?> continuation) {
            return UserStore.this.new C399931(continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super ApiUserVerifyEmailInfo> continuation) {
            return ((C399931) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
            Sheriff sheriff = UserStore.this.sheriff;
            this.label = 1;
            Object userVerifyEmailInfo = sheriff.getUserVerifyEmailInfo(this);
            return userVerifyEmailInfo == coroutine_suspended ? coroutine_suspended : userVerifyEmailInfo;
        }
    }

    public final Flow<ApiUserVerifyEmailInfo> pollUserEmailVerifyInfo() {
        Duration durationOfSeconds = Duration.ofSeconds(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfSeconds, "ofSeconds(...)");
        return Polling2.networkPoll(durationOfSeconds, new C399931(null));
    }

    public final Object getUserEmailValidation(String str, Continuation<? super ApiUserEmailValidationResponse> continuation) {
        return this.sheriff.getUserEmailValidation(str, continuation);
    }
}
