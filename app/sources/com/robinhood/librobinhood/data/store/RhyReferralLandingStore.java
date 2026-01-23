package com.robinhood.librobinhood.data.store;

import com.robinhood.api.rhy.referral.RhyReferralBonfireApi;
import com.robinhood.models.rhy.referral.api.ApiRefereeLanding;
import com.robinhood.models.rhy.referral.api.ApiReferrerLanding;
import com.robinhood.models.rhy.referral.p345db.RefereeLanding;
import com.robinhood.models.rhy.referral.p345db.RefereeLanding2;
import com.robinhood.models.rhy.referral.p345db.ReferrerLanding;
import com.robinhood.models.rhy.referral.p345db.ReferrerLanding2;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyReferralLandingStore.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/RhyReferralLandingStore;", "Lcom/robinhood/store/Store;", "rhyReferralApi", "Lcom/robinhood/api/rhy/referral/RhyReferralBonfireApi;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/api/rhy/referral/RhyReferralBonfireApi;Lcom/robinhood/store/StoreBundle;)V", "forceFetchReferrerLanding", "Lcom/robinhood/models/rhy/referral/db/ReferrerLanding;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forceFetchRefereeLanding", "Lcom/robinhood/models/rhy/referral/db/RefereeLanding;", "lib-store-rhy-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class RhyReferralLandingStore extends Store {
    private final RhyReferralBonfireApi rhyReferralApi;

    /* compiled from: RhyReferralLandingStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RhyReferralLandingStore", m3645f = "RhyReferralLandingStore.kt", m3646l = {18}, m3647m = "forceFetchRefereeLanding")
    /* renamed from: com.robinhood.librobinhood.data.store.RhyReferralLandingStore$forceFetchRefereeLanding$1 */
    static final class C342971 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C342971(Continuation<? super C342971> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RhyReferralLandingStore.this.forceFetchRefereeLanding(this);
        }
    }

    /* compiled from: RhyReferralLandingStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.RhyReferralLandingStore", m3645f = "RhyReferralLandingStore.kt", m3646l = {16}, m3647m = "forceFetchReferrerLanding")
    /* renamed from: com.robinhood.librobinhood.data.store.RhyReferralLandingStore$forceFetchReferrerLanding$1 */
    static final class C342981 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C342981(Continuation<? super C342981> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RhyReferralLandingStore.this.forceFetchReferrerLanding(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyReferralLandingStore(RhyReferralBonfireApi rhyReferralApi, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(rhyReferralApi, "rhyReferralApi");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.rhyReferralApi = rhyReferralApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object forceFetchReferrerLanding(Continuation<? super ReferrerLanding> continuation) {
        C342981 c342981;
        if (continuation instanceof C342981) {
            c342981 = (C342981) continuation;
            int i = c342981.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c342981.label = i - Integer.MIN_VALUE;
            } else {
                c342981 = new C342981(continuation);
            }
        }
        Object referrerLandingPage = c342981.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c342981.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(referrerLandingPage);
            RhyReferralBonfireApi rhyReferralBonfireApi = this.rhyReferralApi;
            c342981.label = 1;
            referrerLandingPage = rhyReferralBonfireApi.getReferrerLandingPage(c342981);
            if (referrerLandingPage == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(referrerLandingPage);
        }
        return ReferrerLanding2.toDbModel((ApiReferrerLanding) referrerLandingPage);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object forceFetchRefereeLanding(Continuation<? super RefereeLanding> continuation) {
        C342971 c342971;
        if (continuation instanceof C342971) {
            c342971 = (C342971) continuation;
            int i = c342971.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c342971.label = i - Integer.MIN_VALUE;
            } else {
                c342971 = new C342971(continuation);
            }
        }
        Object refereeLandingPage = c342971.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c342971.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(refereeLandingPage);
            RhyReferralBonfireApi rhyReferralBonfireApi = this.rhyReferralApi;
            c342971.label = 1;
            refereeLandingPage = rhyReferralBonfireApi.getRefereeLandingPage(c342971);
            if (refereeLandingPage == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(refereeLandingPage);
        }
        return RefereeLanding2.toDbModel((ApiRefereeLanding) refereeLandingPage);
    }
}
