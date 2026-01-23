package com.robinhood.android.lib.creditcard.p165ui.invite;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.creditcard.CreditApplicationInviteBannerExperiments;
import com.robinhood.android.lib.creditcard.CreditApplicationInviteBannerExperiments2;
import com.robinhood.android.lib.creditcard.CreditApplicationInviteBannerExperiments3;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.models.creditcard.api.graphql.CreditApplicationStage;
import com.robinhood.android.models.creditcard.api.graphql.CreditApplicationsResponse;
import com.robinhood.android.models.creditcard.api.graphql.ValidCreditApplicationInviteResponse;
import com.robinhood.android.regiongate.CreditCardRegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.rx2.RxAwait3;
import p479j$.time.Clock;
import p479j$.time.Instant;

/* compiled from: CreditApplicationInviteBannerDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u001aB9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/lib/creditcard/ui/invite/CreditApplicationInviteBannerDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/lib/creditcard/ui/invite/CreditApplicationInviteState;", "Lcom/robinhood/android/lib/creditcard/ui/invite/CreditApplicationInviteBannerEvent;", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "creditCardStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/shared/store/user/UserStore;", "userStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/regiongate/RegionGateProvider;", "regionGateProvider", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/shared/store/user/UserStore;Lj$/time/Clock;Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "", "onStart", "()V", "Lcom/robinhood/android/lib/store/creditcard/CreditCardStore;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "Lcom/robinhood/shared/store/user/UserStore;", "Lj$/time/Clock;", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "Companion", "feature-lib-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CreditApplicationInviteBannerDuxo extends BaseDuxo5<CreditApplicationInviteState, CreditApplicationInviteBannerDuxo2> {
    private final Clock clock;
    private final CreditCardStore creditCardStore;
    private final ExperimentsStore experimentsStore;
    private final RegionGateProvider regionGateProvider;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditApplicationInviteBannerDuxo(CreditCardStore creditCardStore, ExperimentsStore experimentsStore, UserStore userStore, Clock clock, RegionGateProvider regionGateProvider, DuxoBundle duxoBundle) {
        super(new CreditApplicationInviteState(false, false, false, false, 15, null), duxoBundle);
        Intrinsics.checkNotNullParameter(creditCardStore, "creditCardStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.creditCardStore = creditCardStore;
        this.experimentsStore = experimentsStore;
        this.userStore = userStore;
        this.clock = clock;
        this.regionGateProvider = regionGateProvider;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().launchWhenStarted(new C202701(null));
    }

    /* compiled from: CreditApplicationInviteBannerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.creditcard.ui.invite.CreditApplicationInviteBannerDuxo$onStart$1", m3645f = "CreditApplicationInviteBannerDuxo.kt", m3646l = {37, 118, 119, 120, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, 56, 61}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.lib.creditcard.ui.invite.CreditApplicationInviteBannerDuxo$onStart$1 */
    static final class C202701 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int I$0;
        Object L$0;
        boolean Z$0;
        boolean Z$1;
        int label;

        C202701(Continuation<? super C202701> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CreditApplicationInviteBannerDuxo.this.new C202701(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C202701) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:65:0x019d, code lost:
        
            if (r0 == r6) goto L66;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00bd A[PHI: r0 r1
          0x00bd: PHI (r0v16 boolean) = (r0v14 boolean), (r0v18 boolean) binds: [B:24:0x00b9, B:10:0x003d] A[DONT_GENERATE, DONT_INLINE]
          0x00bd: PHI (r1v7 java.lang.Object) = (r1v6 java.lang.Object), (r1v10 java.lang.Object) binds: [B:24:0x00b9, B:10:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x011a A[PHI: r0
          0x011a: PHI (r0v25 java.lang.Object) = (r0v23 java.lang.Object), (r0v29 java.lang.Object) binds: [B:35:0x0116, B:8:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0182  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object regionGateState$default;
            Object objAwaitFirstOrNull;
            boolean zAreEqual;
            Object objAwaitFirstOrNull2;
            Object objAwaitFirstOrNull3;
            boolean z;
            boolean z2;
            Object objAwaitFirstOrNull4;
            User user;
            UUID id;
            Object creditApplications;
            List<CreditApplicationsResponse.AuthIdentityObject.CreditApplication> creditApplications2;
            int i;
            Object validCreditApplicationInvites;
            CreditApplicationsResponse.AuthIdentityObject authIdentity;
            ArrayList arrayList;
            ValidCreditApplicationInviteResponse.Response creditApplicationInvites;
            List<ValidCreditApplicationInviteResponse.Response.Invite> invites;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    RegionGateProvider regionGateProvider = CreditApplicationInviteBannerDuxo.this.regionGateProvider;
                    CreditCardRegionGate creditCardRegionGate = CreditCardRegionGate.INSTANCE;
                    this.label = 1;
                    regionGateState$default = RegionGateProvider.DefaultImpls.getRegionGateState$default(regionGateProvider, creditCardRegionGate, false, this, 2, null);
                    if (regionGateState$default != coroutine_suspended) {
                        if (((Boolean) regionGateState$default).booleanValue()) {
                            return Unit.INSTANCE;
                        }
                        Observable observableStreamState$default = ExperimentsProvider.DefaultImpls.streamState$default(CreditApplicationInviteBannerDuxo.this.experimentsStore, new Experiment[]{CreditApplicationInviteBannerExperiments3.INSTANCE}, false, null, 6, null);
                        this.label = 2;
                        objAwaitFirstOrNull = RxAwait3.awaitFirstOrNull(observableStreamState$default, this);
                        if (objAwaitFirstOrNull != coroutine_suspended) {
                            zAreEqual = Intrinsics.areEqual(objAwaitFirstOrNull, boxing.boxBoolean(true));
                            Observable observableStreamState$default2 = ExperimentsProvider.DefaultImpls.streamState$default(CreditApplicationInviteBannerDuxo.this.experimentsStore, new Experiment[]{CreditApplicationInviteBannerExperiments.INSTANCE}, false, null, 6, null);
                            this.Z$0 = zAreEqual;
                            this.label = 3;
                            objAwaitFirstOrNull2 = RxAwait3.awaitFirstOrNull(observableStreamState$default2, this);
                            if (objAwaitFirstOrNull2 != coroutine_suspended) {
                                boolean zAreEqual2 = Intrinsics.areEqual(objAwaitFirstOrNull2, boxing.boxBoolean(true));
                                Observable observableStreamState$default3 = ExperimentsProvider.DefaultImpls.streamState$default(CreditApplicationInviteBannerDuxo.this.experimentsStore, new Experiment[]{CreditApplicationInviteBannerExperiments2.INSTANCE}, false, null, 6, null);
                                this.Z$0 = zAreEqual;
                                this.Z$1 = zAreEqual2;
                                this.label = 4;
                                objAwaitFirstOrNull3 = RxAwait3.awaitFirstOrNull(observableStreamState$default3, this);
                                if (objAwaitFirstOrNull3 != coroutine_suspended) {
                                    z = zAreEqual;
                                    z2 = zAreEqual2;
                                    boolean zAreEqual3 = Intrinsics.areEqual(objAwaitFirstOrNull3, boxing.boxBoolean(true));
                                    CreditApplicationInviteBannerDuxo.this.applyMutation(new AnonymousClass1(z, z2, zAreEqual3, null));
                                    if (!z || z2 || zAreEqual3) {
                                        Observable<User> user2 = CreditApplicationInviteBannerDuxo.this.userStore.getUser();
                                        this.label = 5;
                                        objAwaitFirstOrNull4 = RxAwait3.awaitFirstOrNull(user2, this);
                                        if (objAwaitFirstOrNull4 != coroutine_suspended) {
                                            user = (User) objAwaitFirstOrNull4;
                                            if (user != null || (id = user.getId()) == null) {
                                                return Unit.INSTANCE;
                                            }
                                            CreditCardStore creditCardStore = CreditApplicationInviteBannerDuxo.this.creditCardStore;
                                            this.L$0 = id;
                                            this.label = 6;
                                            creditApplications = creditCardStore.getCreditApplications(this);
                                            if (creditApplications != coroutine_suspended) {
                                                CreditApplicationsResponse creditApplicationsResponse = (CreditApplicationsResponse) creditApplications;
                                                creditApplications2 = (creditApplicationsResponse != null || (authIdentity = creditApplicationsResponse.getAuthIdentity()) == null) ? null : authIdentity.getCreditApplications();
                                                if (creditApplications2 == null) {
                                                    List<CreditApplicationsResponse.AuthIdentityObject.CreditApplication> list = creditApplications2;
                                                    if ((list instanceof Collection) && list.isEmpty()) {
                                                        i = 0;
                                                        CreditCardStore creditCardStore2 = CreditApplicationInviteBannerDuxo.this.creditCardStore;
                                                        String string2 = id.toString();
                                                        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                                                        this.L$0 = null;
                                                        this.I$0 = i;
                                                        this.label = 7;
                                                        validCreditApplicationInvites = creditCardStore2.getValidCreditApplicationInvites(string2, this);
                                                    } else {
                                                        Iterator<T> it = list.iterator();
                                                        while (it.hasNext()) {
                                                            if (!SetsKt.setOf((Object[]) new CreditApplicationStage[]{CreditApplicationStage.IN_PROGRESS, CreditApplicationStage.APPROVED}).contains(((CreditApplicationsResponse.AuthIdentityObject.CreditApplication) it.next()).getStage())) {
                                                                i = 1;
                                                                CreditCardStore creditCardStore22 = CreditApplicationInviteBannerDuxo.this.creditCardStore;
                                                                String string22 = id.toString();
                                                                Intrinsics.checkNotNullExpressionValue(string22, "toString(...)");
                                                                this.L$0 = null;
                                                                this.I$0 = i;
                                                                this.label = 7;
                                                                validCreditApplicationInvites = creditCardStore22.getValidCreditApplicationInvites(string22, this);
                                                                break;
                                                            }
                                                        }
                                                        i = 0;
                                                        CreditCardStore creditCardStore222 = CreditApplicationInviteBannerDuxo.this.creditCardStore;
                                                        String string222 = id.toString();
                                                        Intrinsics.checkNotNullExpressionValue(string222, "toString(...)");
                                                        this.L$0 = null;
                                                        this.I$0 = i;
                                                        this.label = 7;
                                                        validCreditApplicationInvites = creditCardStore222.getValidCreditApplicationInvites(string222, this);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    ResultKt.throwOnFailure(obj);
                    regionGateState$default = obj;
                    if (((Boolean) regionGateState$default).booleanValue()) {
                    }
                    break;
                case 2:
                    ResultKt.throwOnFailure(obj);
                    objAwaitFirstOrNull = obj;
                    zAreEqual = Intrinsics.areEqual(objAwaitFirstOrNull, boxing.boxBoolean(true));
                    Observable observableStreamState$default22 = ExperimentsProvider.DefaultImpls.streamState$default(CreditApplicationInviteBannerDuxo.this.experimentsStore, new Experiment[]{CreditApplicationInviteBannerExperiments.INSTANCE}, false, null, 6, null);
                    this.Z$0 = zAreEqual;
                    this.label = 3;
                    objAwaitFirstOrNull2 = RxAwait3.awaitFirstOrNull(observableStreamState$default22, this);
                    if (objAwaitFirstOrNull2 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 3:
                    zAreEqual = this.Z$0;
                    ResultKt.throwOnFailure(obj);
                    objAwaitFirstOrNull2 = obj;
                    boolean zAreEqual22 = Intrinsics.areEqual(objAwaitFirstOrNull2, boxing.boxBoolean(true));
                    Observable observableStreamState$default32 = ExperimentsProvider.DefaultImpls.streamState$default(CreditApplicationInviteBannerDuxo.this.experimentsStore, new Experiment[]{CreditApplicationInviteBannerExperiments2.INSTANCE}, false, null, 6, null);
                    this.Z$0 = zAreEqual;
                    this.Z$1 = zAreEqual22;
                    this.label = 4;
                    objAwaitFirstOrNull3 = RxAwait3.awaitFirstOrNull(observableStreamState$default32, this);
                    if (objAwaitFirstOrNull3 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 4:
                    z2 = this.Z$1;
                    z = this.Z$0;
                    ResultKt.throwOnFailure(obj);
                    objAwaitFirstOrNull3 = obj;
                    boolean zAreEqual32 = Intrinsics.areEqual(objAwaitFirstOrNull3, boxing.boxBoolean(true));
                    CreditApplicationInviteBannerDuxo.this.applyMutation(new AnonymousClass1(z, z2, zAreEqual32, null));
                    if (!z) {
                    }
                    Observable<User> user22 = CreditApplicationInviteBannerDuxo.this.userStore.getUser();
                    this.label = 5;
                    objAwaitFirstOrNull4 = RxAwait3.awaitFirstOrNull(user22, this);
                    if (objAwaitFirstOrNull4 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 5:
                    ResultKt.throwOnFailure(obj);
                    objAwaitFirstOrNull4 = obj;
                    user = (User) objAwaitFirstOrNull4;
                    if (user != null) {
                        break;
                    }
                    return Unit.INSTANCE;
                case 6:
                    id = (UUID) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    creditApplications = obj;
                    CreditApplicationsResponse creditApplicationsResponse2 = (CreditApplicationsResponse) creditApplications;
                    if (creditApplicationsResponse2 != null) {
                        if (creditApplications2 == null) {
                        }
                        break;
                    }
                    return Unit.INSTANCE;
                case 7:
                    int i2 = this.I$0;
                    ResultKt.throwOnFailure(obj);
                    i = i2;
                    validCreditApplicationInvites = obj;
                    ValidCreditApplicationInviteResponse validCreditApplicationInviteResponse = (ValidCreditApplicationInviteResponse) validCreditApplicationInvites;
                    if (validCreditApplicationInviteResponse == null || (creditApplicationInvites = validCreditApplicationInviteResponse.getCreditApplicationInvites()) == null || (invites = creditApplicationInvites.getInvites()) == null) {
                        arrayList = null;
                    } else {
                        CreditApplicationInviteBannerDuxo creditApplicationInviteBannerDuxo = CreditApplicationInviteBannerDuxo.this;
                        arrayList = new ArrayList();
                        for (Object obj2 : invites) {
                            Long expiresAt = ((ValidCreditApplicationInviteResponse.Response.Invite) obj2).getExpiresAt();
                            if (expiresAt == null || Instant.now(creditApplicationInviteBannerDuxo.clock).compareTo(Instant.ofEpochMilli(expiresAt.longValue())) <= 0) {
                                arrayList.add(obj2);
                            }
                        }
                    }
                    CreditApplicationInviteBannerDuxo.this.applyMutation(new AnonymousClass2(i != 0, arrayList, null));
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* compiled from: CreditApplicationInviteBannerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/creditcard/ui/invite/CreditApplicationInviteState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.lib.creditcard.ui.invite.CreditApplicationInviteBannerDuxo$onStart$1$1", m3645f = "CreditApplicationInviteBannerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.lib.creditcard.ui.invite.CreditApplicationInviteBannerDuxo$onStart$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CreditApplicationInviteState, Continuation<? super CreditApplicationInviteState>, Object> {
            final /* synthetic */ boolean $inAccountExperiment;
            final /* synthetic */ boolean $inInboxExperiment;
            final /* synthetic */ boolean $inSearchExperiment;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(boolean z, boolean z2, boolean z3, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$inSearchExperiment = z;
                this.$inAccountExperiment = z2;
                this.$inInboxExperiment = z3;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$inSearchExperiment, this.$inAccountExperiment, this.$inInboxExperiment, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CreditApplicationInviteState creditApplicationInviteState, Continuation<? super CreditApplicationInviteState> continuation) {
                return ((AnonymousClass1) create(creditApplicationInviteState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CreditApplicationInviteState.copy$default((CreditApplicationInviteState) this.L$0, false, this.$inSearchExperiment, this.$inAccountExperiment, this.$inInboxExperiment, 1, null);
            }
        }

        /* compiled from: CreditApplicationInviteBannerDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/creditcard/ui/invite/CreditApplicationInviteState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.lib.creditcard.ui.invite.CreditApplicationInviteBannerDuxo$onStart$1$2", m3645f = "CreditApplicationInviteBannerDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.lib.creditcard.ui.invite.CreditApplicationInviteBannerDuxo$onStart$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CreditApplicationInviteState, Continuation<? super CreditApplicationInviteState>, Object> {
            final /* synthetic */ boolean $hasTerminalApps;
            final /* synthetic */ List<ValidCreditApplicationInviteResponse.Response.Invite> $validInvites;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(boolean z, List<ValidCreditApplicationInviteResponse.Response.Invite> list, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$hasTerminalApps = z;
                this.$validInvites = list;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$hasTerminalApps, this.$validInvites, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CreditApplicationInviteState creditApplicationInviteState, Continuation<? super CreditApplicationInviteState> continuation) {
                return ((AnonymousClass2) create(creditApplicationInviteState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                List<ValidCreditApplicationInviteResponse.Response.Invite> list;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return CreditApplicationInviteState.copy$default((CreditApplicationInviteState) this.L$0, (this.$hasTerminalApps || (list = this.$validInvites) == null || list.isEmpty()) ? false : true, false, false, false, 14, null);
            }
        }
    }

    /* compiled from: CreditApplicationInviteBannerDuxo.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/lib/creditcard/ui/invite/CreditApplicationInviteBannerDuxo$Companion;", "", "<init>", "()V", "shouldShowBanner", "", "viewState", "Lcom/robinhood/android/lib/creditcard/ui/invite/CreditApplicationInviteState;", "location", "Lcom/robinhood/android/lib/creditcard/ui/invite/Location;", "getLoggingIdentifier", "", "getEntryPointSource", "feature-lib-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {

        /* compiled from: CreditApplicationInviteBannerDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CreditApplicationInviteBannerDuxo4.values().length];
                try {
                    iArr[CreditApplicationInviteBannerDuxo4.SEARCH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CreditApplicationInviteBannerDuxo4.ACCOUNT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CreditApplicationInviteBannerDuxo4.INBOX.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final boolean shouldShowBanner(CreditApplicationInviteState viewState, CreditApplicationInviteBannerDuxo4 location) {
            boolean inSearchExperiment;
            Intrinsics.checkNotNullParameter(viewState, "viewState");
            Intrinsics.checkNotNullParameter(location, "location");
            if (!viewState.getShouldShowInviteBanner()) {
                return false;
            }
            int i = WhenMappings.$EnumSwitchMapping$0[location.ordinal()];
            if (i == 1) {
                inSearchExperiment = viewState.getInSearchExperiment();
            } else if (i == 2) {
                inSearchExperiment = viewState.getInAccountExperiment();
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                inSearchExperiment = viewState.getInInboxExperiment();
            }
            return inSearchExperiment;
        }

        public final String getLoggingIdentifier(CreditApplicationInviteBannerDuxo4 location) {
            Intrinsics.checkNotNullParameter(location, "location");
            int i = WhenMappings.$EnumSwitchMapping$0[location.ordinal()];
            if (i == 1) {
                return "credit-application-search-screen-entrypoint";
            }
            if (i == 2) {
                return "credit-application-account-center-entrypoint";
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return "credit-application-notification-screen-entrypoint";
        }

        public final String getEntryPointSource(CreditApplicationInviteBannerDuxo4 location) {
            Intrinsics.checkNotNullParameter(location, "location");
            int i = WhenMappings.$EnumSwitchMapping$0[location.ordinal()];
            if (i == 1) {
                return "search_screen";
            }
            if (i == 2) {
                return "account_center_screen";
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            return "notifications_screen";
        }
    }
}
