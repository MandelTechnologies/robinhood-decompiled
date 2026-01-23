package com.robinhood.android.creditcard.p091ui.post.signup;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.creditcard.p091ui.CreditCardWaitlistBlockReferralsExperiment;
import com.robinhood.android.creditcard.p091ui.post.signup.PostSignUpAddToWaitlistDuxo7;
import com.robinhood.android.gold.subscription.store.GoldSubscriptionStore;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.lib.store.creditcard.CreditCardWaitlistStore;
import com.robinhood.android.models.creditcard.api.graphql.CreditApplicationsResponse;
import com.robinhood.android.models.creditcard.api.graphql.ValidCreditApplicationInviteResponse;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.coroutines.dagger.annotation.DefaultDispatcher;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.bonfire.waitlist.ApiEmailWaitlistSpot;
import com.robinhood.models.api.bonfire.waitlist.EmailWaitlistSpotStatus;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import com.robinhood.utils.logging.CrashReporter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.FlowCollector;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: PostSignUpAddToWaitlistDuxo.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00012BK\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0016H\u0016¢\u0006\u0004\b \u0010\u0018J\r\u0010!\u001a\u00020\u0016¢\u0006\u0004\b!\u0010\u0018J\r\u0010\"\u001a\u00020\u0016¢\u0006\u0004\b\"\u0010\u0018J\u0017\u0010'\u001a\u00020\u00162\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020\u0016¢\u0006\u0004\b(\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010-R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010.R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010/R\u0016\u00100\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistState;", "Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistEvent;", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "creditCardStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;", "goldSubscriptionStore", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "Lcom/robinhood/android/lib/store/creditcard/CreditCardWaitlistStore;", "waitlistStore", "Lkotlinx/coroutines/CoroutineDispatcher;", "defaultDispatcher", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;Lcom/robinhood/shared/store/user/UserStore;Lcom/robinhood/android/lib/store/creditcard/CreditCardWaitlistStore;Lkotlinx/coroutines/CoroutineDispatcher;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;)V", "", "handleUserInWaitlistWithInvite", "()V", "", "email", "", "handleUserNotInWaitlist", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchExperiments", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onStart", "launchWaitlistFlow", "joinWaitlist", "Lcom/robinhood/android/creditcard/ui/post/signup/Screen;", "screen", "toNextScreen$feature_credit_card_externalDebug", "(Lcom/robinhood/android/creditcard/ui/post/signup/Screen;)V", "toNextScreen", "closeFlow", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;", "Lcom/robinhood/shared/store/user/UserStore;", "Lcom/robinhood/android/lib/store/creditcard/CreditCardWaitlistStore;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lj$/time/Clock;", "lastScreen", "Lcom/robinhood/android/creditcard/ui/post/signup/Screen;", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class PostSignUpAddToWaitlistDuxo extends BaseDuxo5<PostSignUpAddToWaitlistState, PostSignUpAddToWaitlistDuxo7> {
    private static final String FROM_REFERRAL_IDENTIFIER = "cc-waitlist-from-referral";
    private static final String POST_ONBOARDING_WAITLIST_SOURCE = "RH_ONBOARDING";
    private final Clock clock;
    private final CreditCardStore creditCardStore;
    private final CoroutineDispatcher defaultDispatcher;
    private final ExperimentsStore experimentsStore;
    private final GoldSubscriptionStore goldSubscriptionStore;
    private PostSignUpAddToWaitlistDuxo9 lastScreen;
    private final UserStore userStore;
    private final CreditCardWaitlistStore waitlistStore;
    public static final int $stable = 8;

    /* compiled from: PostSignUpAddToWaitlistDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EmailWaitlistSpotStatus.values().length];
            try {
                iArr[EmailWaitlistSpotStatus.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EmailWaitlistSpotStatus.VERIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EmailWaitlistSpotStatus.INACTIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: PostSignUpAddToWaitlistDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo", m3645f = "PostSignUpAddToWaitlistDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE}, m3647m = "handleUserNotInWaitlist")
    /* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$handleUserNotInWaitlist$1 */
    static final class C126321 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C126321(Continuation<? super C126321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PostSignUpAddToWaitlistDuxo.this.handleUserNotInWaitlist(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostSignUpAddToWaitlistDuxo(CreditCardStore creditCardStore, ExperimentsStore experimentsStore, GoldSubscriptionStore goldSubscriptionStore, UserStore userStore, CreditCardWaitlistStore waitlistStore, @DefaultDispatcher CoroutineDispatcher defaultDispatcher, Clock clock, DuxoBundle duxoBundle) {
        super(new PostSignUpAddToWaitlistState(null, false, false, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null), duxoBundle);
        Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(goldSubscriptionStore, "goldSubscriptionStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(waitlistStore, "waitlistStore");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.creditCardStore = creditCardStore;
        this.experimentsStore = experimentsStore;
        this.goldSubscriptionStore = goldSubscriptionStore;
        this.userStore = userStore;
        this.waitlistStore = waitlistStore;
        this.defaultDispatcher = defaultDispatcher;
        this.clock = clock;
        this.lastScreen = PostSignUpAddToWaitlistDuxo9.INTRO;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().launchWhenStarted(new C126361(null));
    }

    /* compiled from: PostSignUpAddToWaitlistDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$onStart$1", m3645f = "PostSignUpAddToWaitlistDuxo.kt", m3646l = {47, 58, 59, 66, EnumC7081g.SDK_ASSET_ICON_GUIDE_VALUE, 73, 86}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$onStart$1 */
    static final class C126361 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        C126361(Continuation<? super C126361> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C126361 c126361 = PostSignUpAddToWaitlistDuxo.this.new C126361(continuation);
            c126361.L$0 = obj;
            return c126361;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C126361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:75:0x01b7, code lost:
        
            if (r13.handleUserNotInWaitlist(r3, r12) == r0) goto L76;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00e6 A[PHI: r13
          0x00e6: PHI (r13v19 java.lang.Object) = (r13v18 java.lang.Object), (r13v0 java.lang.Object) binds: [B:33:0x00e2, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x010d  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x013f  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0141  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineScope coroutineScope;
            Deferred deferred;
            Deferred deferred2;
            Object objAwait;
            Boolean bool;
            Deferred deferred3;
            Object creditApplications;
            UUID uuid;
            String str;
            Object validCreditApplicationInvites;
            List<CreditApplicationsResponse.AuthIdentityObject.CreditApplication> list;
            CreditApplicationsResponse.AuthIdentityObject authIdentity;
            ValidCreditApplicationInviteResponse validCreditApplicationInviteResponse;
            ArrayList arrayList;
            List<CreditApplicationsResponse.AuthIdentityObject.CreditApplication> list2;
            ValidCreditApplicationInviteResponse.Response creditApplicationInvites;
            List<ValidCreditApplicationInviteResponse.Response.Invite> invites;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            try {
            } catch (Throwable th) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
                PostSignUpAddToWaitlistDuxo.this.submit(PostSignUpAddToWaitlistDuxo7.Error.INSTANCE);
            }
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    coroutineScope = (CoroutineScope) this.L$0;
                    PostSignUpAddToWaitlistDuxo postSignUpAddToWaitlistDuxo = PostSignUpAddToWaitlistDuxo.this;
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (postSignUpAddToWaitlistDuxo.fetchExperiments(this) != coroutine_suspended) {
                        CoroutineScope coroutineScope2 = coroutineScope;
                        PostSignUpAddToWaitlistDuxo.this.applyMutation(new AnonymousClass1(null));
                        Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new PostSignUpAddToWaitlistDuxo3(PostSignUpAddToWaitlistDuxo.this, null), 3, null);
                        Deferred deferredAsync$default2 = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new PostSignUpAddToWaitlistDuxo4(PostSignUpAddToWaitlistDuxo.this, null), 3, null);
                        Deferred deferredAsync$default3 = BuildersKt__Builders_commonKt.async$default(coroutineScope2, null, null, new PostSignUpAddToWaitlistDuxo5(PostSignUpAddToWaitlistDuxo.this, null), 3, null);
                        this.L$0 = deferredAsync$default2;
                        this.L$1 = deferredAsync$default3;
                        this.label = 2;
                        obj = deferredAsync$default.await(this);
                        if (obj != coroutine_suspended) {
                            deferred = deferredAsync$default2;
                            deferred2 = deferredAsync$default3;
                            Boolean bool2 = (Boolean) obj;
                            this.L$0 = deferred2;
                            this.L$1 = bool2;
                            this.label = 3;
                            objAwait = deferred.await(this);
                            if (objAwait != coroutine_suspended) {
                                Deferred deferred4 = deferred2;
                                bool = bool2;
                                obj = objAwait;
                                deferred3 = deferred4;
                                PostSignUpAddToWaitlistDuxo.this.applyMutation(new AnonymousClass2((GoldSubscriptionStore.GoldSubscriptionState) obj, bool, null));
                                this.L$0 = null;
                                this.L$1 = null;
                                this.label = 4;
                                obj = deferred3.await(this);
                                if (obj != coroutine_suspended) {
                                    User user = (User) obj;
                                    PostSignUpAddToWaitlistDuxo.this.applyMutation(new AnonymousClass3(user, null));
                                    String email = user.getEmail();
                                    UUID id = user.getId();
                                    CreditCardStore creditCardStore = PostSignUpAddToWaitlistDuxo.this.creditCardStore;
                                    this.L$0 = email;
                                    this.L$1 = id;
                                    this.label = 5;
                                    creditApplications = creditCardStore.getCreditApplications(this);
                                    if (creditApplications == coroutine_suspended) {
                                        uuid = id;
                                        obj = creditApplications;
                                        str = email;
                                        CreditApplicationsResponse creditApplicationsResponse = (CreditApplicationsResponse) obj;
                                        List<CreditApplicationsResponse.AuthIdentityObject.CreditApplication> creditApplications2 = (creditApplicationsResponse != null || (authIdentity = creditApplicationsResponse.getAuthIdentity()) == null) ? null : authIdentity.getCreditApplications();
                                        CreditCardStore creditCardStore2 = PostSignUpAddToWaitlistDuxo.this.creditCardStore;
                                        String string2 = uuid.toString();
                                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                        this.L$0 = str;
                                        this.L$1 = creditApplications2;
                                        this.label = 6;
                                        validCreditApplicationInvites = creditCardStore2.getValidCreditApplicationInvites(string2, this);
                                        if (validCreditApplicationInvites == coroutine_suspended) {
                                            list = creditApplications2;
                                            obj = validCreditApplicationInvites;
                                            validCreditApplicationInviteResponse = (ValidCreditApplicationInviteResponse) obj;
                                            if (validCreditApplicationInviteResponse != null || (creditApplicationInvites = validCreditApplicationInviteResponse.getCreditApplicationInvites()) == null || (invites = creditApplicationInvites.getInvites()) == null) {
                                                arrayList = null;
                                            } else {
                                                PostSignUpAddToWaitlistDuxo postSignUpAddToWaitlistDuxo2 = PostSignUpAddToWaitlistDuxo.this;
                                                arrayList = new ArrayList();
                                                for (Object obj2 : invites) {
                                                    Long expiresAt = ((ValidCreditApplicationInviteResponse.Response.Invite) obj2).getExpiresAt();
                                                    if (expiresAt == null || Instant.now(postSignUpAddToWaitlistDuxo2.clock).compareTo(Instant.ofEpochMilli(expiresAt.longValue())) <= 0) {
                                                        arrayList.add(obj2);
                                                    }
                                                }
                                            }
                                            if ((arrayList != null || arrayList.isEmpty()) && ((list2 = list) == null || list2.isEmpty())) {
                                                PostSignUpAddToWaitlistDuxo postSignUpAddToWaitlistDuxo3 = PostSignUpAddToWaitlistDuxo.this;
                                                this.L$0 = null;
                                                this.L$1 = null;
                                                this.label = 7;
                                                break;
                                            } else {
                                                PostSignUpAddToWaitlistDuxo.this.handleUserInWaitlistWithInvite();
                                                Unit unit = Unit.INSTANCE;
                                            }
                                            PostSignUpAddToWaitlistDuxo.this.applyMutation(new AnonymousClass4(null));
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    coroutineScope = (CoroutineScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope22 = coroutineScope;
                    PostSignUpAddToWaitlistDuxo.this.applyMutation(new AnonymousClass1(null));
                    Deferred deferredAsync$default4 = BuildersKt__Builders_commonKt.async$default(coroutineScope22, null, null, new PostSignUpAddToWaitlistDuxo3(PostSignUpAddToWaitlistDuxo.this, null), 3, null);
                    Deferred deferredAsync$default22 = BuildersKt__Builders_commonKt.async$default(coroutineScope22, null, null, new PostSignUpAddToWaitlistDuxo4(PostSignUpAddToWaitlistDuxo.this, null), 3, null);
                    Deferred deferredAsync$default32 = BuildersKt__Builders_commonKt.async$default(coroutineScope22, null, null, new PostSignUpAddToWaitlistDuxo5(PostSignUpAddToWaitlistDuxo.this, null), 3, null);
                    this.L$0 = deferredAsync$default22;
                    this.L$1 = deferredAsync$default32;
                    this.label = 2;
                    obj = deferredAsync$default4.await(this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 2:
                    deferred2 = (Deferred) this.L$1;
                    deferred = (Deferred) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    Boolean bool22 = (Boolean) obj;
                    this.L$0 = deferred2;
                    this.L$1 = bool22;
                    this.label = 3;
                    objAwait = deferred.await(this);
                    if (objAwait != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 3:
                    bool = (Boolean) this.L$1;
                    deferred3 = (Deferred) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    PostSignUpAddToWaitlistDuxo.this.applyMutation(new AnonymousClass2((GoldSubscriptionStore.GoldSubscriptionState) obj, bool, null));
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 4;
                    obj = deferred3.await(this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 4:
                    ResultKt.throwOnFailure(obj);
                    User user2 = (User) obj;
                    PostSignUpAddToWaitlistDuxo.this.applyMutation(new AnonymousClass3(user2, null));
                    String email2 = user2.getEmail();
                    UUID id2 = user2.getId();
                    CreditCardStore creditCardStore3 = PostSignUpAddToWaitlistDuxo.this.creditCardStore;
                    this.L$0 = email2;
                    this.L$1 = id2;
                    this.label = 5;
                    creditApplications = creditCardStore3.getCreditApplications(this);
                    if (creditApplications == coroutine_suspended) {
                    }
                    break;
                case 5:
                    uuid = (UUID) this.L$1;
                    str = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    CreditApplicationsResponse creditApplicationsResponse2 = (CreditApplicationsResponse) obj;
                    if (creditApplicationsResponse2 != null) {
                        break;
                    }
                    CreditCardStore creditCardStore22 = PostSignUpAddToWaitlistDuxo.this.creditCardStore;
                    String string22 = uuid.toString();
                    Intrinsics.checkNotNullExpressionValue(string22, "toString(...)");
                    this.L$0 = str;
                    this.L$1 = creditApplications2;
                    this.label = 6;
                    validCreditApplicationInvites = creditCardStore22.getValidCreditApplicationInvites(string22, this);
                    if (validCreditApplicationInvites == coroutine_suspended) {
                    }
                    break;
                case 6:
                    list = (List) this.L$1;
                    str = (String) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    validCreditApplicationInviteResponse = (ValidCreditApplicationInviteResponse) obj;
                    if (validCreditApplicationInviteResponse != null) {
                        break;
                    }
                    arrayList = null;
                    if (arrayList != null) {
                        PostSignUpAddToWaitlistDuxo postSignUpAddToWaitlistDuxo32 = PostSignUpAddToWaitlistDuxo.this;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 7;
                        break;
                    } else {
                        PostSignUpAddToWaitlistDuxo postSignUpAddToWaitlistDuxo322 = PostSignUpAddToWaitlistDuxo.this;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 7;
                    }
                    PostSignUpAddToWaitlistDuxo.this.applyMutation(new AnonymousClass4(null));
                    return Unit.INSTANCE;
                case 7:
                    ResultKt.throwOnFailure(obj);
                    PostSignUpAddToWaitlistDuxo.this.applyMutation(new AnonymousClass4(null));
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: PostSignUpAddToWaitlistDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$onStart$1$1", m3645f = "PostSignUpAddToWaitlistDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PostSignUpAddToWaitlistState, Continuation<? super PostSignUpAddToWaitlistState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PostSignUpAddToWaitlistState postSignUpAddToWaitlistState, Continuation<? super PostSignUpAddToWaitlistState> continuation) {
                return ((AnonymousClass1) create(postSignUpAddToWaitlistState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PostSignUpAddToWaitlistState.copy$default((PostSignUpAddToWaitlistState) this.L$0, null, true, false, false, false, null, null, 125, null);
            }
        }

        /* compiled from: PostSignUpAddToWaitlistDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$onStart$1$2", m3645f = "PostSignUpAddToWaitlistDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<PostSignUpAddToWaitlistState, Continuation<? super PostSignUpAddToWaitlistState>, Object> {
            final /* synthetic */ Boolean $inBlockGoldFlow;
            final /* synthetic */ GoldSubscriptionStore.GoldSubscriptionState $subscriptionState;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState, Boolean bool, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$subscriptionState = goldSubscriptionState;
                this.$inBlockGoldFlow = bool;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$subscriptionState, this.$inBlockGoldFlow, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PostSignUpAddToWaitlistState postSignUpAddToWaitlistState, Continuation<? super PostSignUpAddToWaitlistState> continuation) {
                return ((AnonymousClass2) create(postSignUpAddToWaitlistState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                PostSignUpAddToWaitlistState postSignUpAddToWaitlistState = (PostSignUpAddToWaitlistState) this.L$0;
                GoldSubscriptionStore.GoldSubscriptionState goldSubscriptionState = this.$subscriptionState;
                Intrinsics.checkNotNull(goldSubscriptionState);
                Boolean bool = this.$inBlockGoldFlow;
                Intrinsics.checkNotNull(bool);
                return PostSignUpAddToWaitlistState.copy$default(postSignUpAddToWaitlistState, null, false, false, bool.booleanValue(), false, goldSubscriptionState, null, 87, null);
            }
        }

        /* compiled from: PostSignUpAddToWaitlistDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$onStart$1$3", m3645f = "PostSignUpAddToWaitlistDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$onStart$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<PostSignUpAddToWaitlistState, Continuation<? super PostSignUpAddToWaitlistState>, Object> {
            final /* synthetic */ User $user;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(User user, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$user = user;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$user, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PostSignUpAddToWaitlistState postSignUpAddToWaitlistState, Continuation<? super PostSignUpAddToWaitlistState> continuation) {
                return ((AnonymousClass3) create(postSignUpAddToWaitlistState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PostSignUpAddToWaitlistState.copy$default((PostSignUpAddToWaitlistState) this.L$0, null, false, false, false, false, null, this.$user, 63, null);
            }
        }

        /* compiled from: PostSignUpAddToWaitlistDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$onStart$1$4", m3645f = "PostSignUpAddToWaitlistDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$onStart$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<PostSignUpAddToWaitlistState, Continuation<? super PostSignUpAddToWaitlistState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(PostSignUpAddToWaitlistState postSignUpAddToWaitlistState, Continuation<? super PostSignUpAddToWaitlistState> continuation) {
                return ((AnonymousClass4) create(postSignUpAddToWaitlistState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return PostSignUpAddToWaitlistState.copy$default((PostSignUpAddToWaitlistState) this.L$0, null, false, false, false, false, null, null, 125, null);
            }
        }
    }

    public final void launchWaitlistFlow() {
        submit(PostSignUpAddToWaitlistDuxo7.LaunchWaitlistFlow.INSTANCE);
    }

    public final void joinWaitlist() {
        withDataState(new Function1() { // from class: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PostSignUpAddToWaitlistDuxo.joinWaitlist$lambda$0(this.f$0, (PostSignUpAddToWaitlistState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit joinWaitlist$lambda$0(PostSignUpAddToWaitlistDuxo postSignUpAddToWaitlistDuxo, PostSignUpAddToWaitlistState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        BuildersKt__Builders_commonKt.launch$default(postSignUpAddToWaitlistDuxo.getLifecycleScope(), postSignUpAddToWaitlistDuxo.defaultDispatcher, null, new PostSignUpAddToWaitlistDuxo2(postSignUpAddToWaitlistDuxo, state, null), 2, null);
        return Unit.INSTANCE;
    }

    public final void toNextScreen$feature_credit_card_externalDebug(PostSignUpAddToWaitlistDuxo9 screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.lastScreen = screen;
        applyMutation(new PostSignUpAddToWaitlistDuxo6(screen, null));
    }

    public final void closeFlow() {
        submit(PostSignUpAddToWaitlistDuxo7.ShowRetirementSignUp.INSTANCE);
    }

    /* compiled from: PostSignUpAddToWaitlistDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$handleUserInWaitlistWithInvite$1", m3645f = "PostSignUpAddToWaitlistDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$handleUserInWaitlistWithInvite$1 */
    static final class C126311 extends ContinuationImpl7 implements Function2<PostSignUpAddToWaitlistState, Continuation<? super PostSignUpAddToWaitlistState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C126311(Continuation<? super C126311> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C126311 c126311 = new C126311(continuation);
            c126311.L$0 = obj;
            return c126311;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PostSignUpAddToWaitlistState postSignUpAddToWaitlistState, Continuation<? super PostSignUpAddToWaitlistState> continuation) {
            return ((C126311) create(postSignUpAddToWaitlistState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return PostSignUpAddToWaitlistState.copy$default((PostSignUpAddToWaitlistState) this.L$0, PostSignUpAddToWaitlistDuxo9.INTRO, false, false, false, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleUserInWaitlistWithInvite() {
        applyMutation(new C126311(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object handleUserNotInWaitlist(String str, Continuation<? super Boolean> continuation) {
        C126321 c126321;
        if (continuation instanceof C126321) {
            c126321 = (C126321) continuation;
            int i = c126321.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c126321.label = i - Integer.MIN_VALUE;
            } else {
                c126321 = new C126321(continuation);
            }
        }
        Object waitlistStatus = c126321.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c126321.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(waitlistStatus);
            CreditCardWaitlistStore creditCardWaitlistStore = this.waitlistStore;
            c126321.label = 1;
            waitlistStatus = creditCardWaitlistStore.getWaitlistStatus(str, c126321);
            if (waitlistStatus == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(waitlistStatus);
        }
        int i3 = WhenMappings.$EnumSwitchMapping$0[((ApiEmailWaitlistSpot) waitlistStatus).getState().ordinal()];
        if (i3 == 1 || i3 == 2) {
            withDataState(new Function1() { // from class: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PostSignUpAddToWaitlistDuxo.handleUserNotInWaitlist$lambda$1(this.f$0, (PostSignUpAddToWaitlistState) obj);
                }
            });
        } else if (i3 == 3) {
            toNextScreen$feature_credit_card_externalDebug(PostSignUpAddToWaitlistDuxo9.INTRO);
        } else {
            submit(PostSignUpAddToWaitlistDuxo7.Error.INSTANCE);
        }
        return boxing.boxBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleUserNotInWaitlist$lambda$1(PostSignUpAddToWaitlistDuxo postSignUpAddToWaitlistDuxo, PostSignUpAddToWaitlistState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        postSignUpAddToWaitlistDuxo.toNextScreen$feature_credit_card_externalDebug(PostSignUpAddToWaitlistDuxo9.CONFIRMATION);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchExperiments(Continuation<? super Unit> continuation) {
        Object objCollect = ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.experimentsStore, new Experiment[]{CreditCardWaitlistBlockReferralsExperiment.INSTANCE}, false, null, 6, null).collect(new FlowCollector() { // from class: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo.fetchExperiments.2

            /* compiled from: PostSignUpAddToWaitlistDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/post/signup/PostSignUpAddToWaitlistState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$fetchExperiments$2$1", m3645f = "PostSignUpAddToWaitlistDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.creditcard.ui.post.signup.PostSignUpAddToWaitlistDuxo$fetchExperiments$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<PostSignUpAddToWaitlistState, Continuation<? super PostSignUpAddToWaitlistState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(boolean z, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$it, continuation);
                    anonymousClass1.L$0 = obj;
                    return anonymousClass1;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PostSignUpAddToWaitlistState postSignUpAddToWaitlistState, Continuation<? super PostSignUpAddToWaitlistState> continuation) {
                    return ((AnonymousClass1) create(postSignUpAddToWaitlistState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return PostSignUpAddToWaitlistState.copy$default((PostSignUpAddToWaitlistState) this.L$0, null, false, this.$it, false, false, null, null, 123, null);
                }
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation2) {
                return emit(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) continuation2);
            }

            public final Object emit(boolean z, Continuation<? super Unit> continuation2) {
                PostSignUpAddToWaitlistDuxo.this.applyMutation(new AnonymousClass1(z, null));
                return Unit.INSTANCE;
            }
        }, continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }
}
