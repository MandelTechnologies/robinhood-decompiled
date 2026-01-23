package com.robinhood.android.referral.pastRewards;

import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.ReferralStore;
import com.robinhood.librobinhood.data.store.RewardStore;
import com.robinhood.models.p320db.RewardReferral;
import com.robinhood.rhc.upsells.Upsell;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RewardsDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/referral/pastRewards/RewardsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/referral/pastRewards/RewardsViewState;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "rewardStore", "Lcom/robinhood/librobinhood/data/store/RewardStore;", "referralStore", "Lcom/robinhood/librobinhood/data/store/ReferralStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/librobinhood/data/store/RewardStore;Lcom/robinhood/librobinhood/data/store/ReferralStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "onResume", "", "remindReferral", Upsell.Single.Referral.f5956ID, "Lcom/robinhood/models/db/RewardReferral;", "feature-referral_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RewardsDuxo extends BaseDuxo4<RewardsViewState> {
    public static final int $stable = 8;
    private final AnalyticsLogger analytics;
    private final ReferralStore referralStore;
    private final RewardStore rewardStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsDuxo(AnalyticsLogger analytics, RewardStore rewardStore, ReferralStore referralStore, DuxoBundle duxoBundle) {
        super(new RewardsViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(rewardStore, "rewardStore");
        Intrinsics.checkNotNullParameter(referralStore, "referralStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.analytics = analytics;
        this.rewardStore = rewardStore;
        this.referralStore = referralStore;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        this.rewardStore.refresh(true);
        LifecycleHost.DefaultImpls.bind$default(this, this.rewardStore.streamSections(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.referral.pastRewards.RewardsDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsDuxo.onResume$lambda$0(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(RewardsDuxo rewardsDuxo, List sections) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        rewardsDuxo.applyMutation(new RewardsDuxo2(sections, null));
        return Unit.INSTANCE;
    }

    /* compiled from: RewardsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.referral.pastRewards.RewardsDuxo$remindReferral$1", m3645f = "RewardsDuxo.kt", m3646l = {39}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.referral.pastRewards.RewardsDuxo$remindReferral$1 */
    static final class C267711 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RewardReferral $referral;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C267711(RewardReferral rewardReferral, Continuation<? super C267711> continuation) {
            super(2, continuation);
            this.$referral = rewardReferral;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C267711 c267711 = RewardsDuxo.this.new C267711(this.$referral, continuation);
            c267711.L$0 = obj;
            return c267711;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C267711) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RewardsDuxo rewardsDuxo = RewardsDuxo.this;
                    RewardReferral rewardReferral = this.$referral;
                    Result.Companion companion = Result.INSTANCE;
                    ReferralStore referralStore = rewardsDuxo.referralStore;
                    UUID id = rewardReferral.getId();
                    this.label = 1;
                    if (referralStore.remindPendingReferral(id, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Result.m28550constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            RewardsDuxo.this.rewardStore.refresh(true);
            return Unit.INSTANCE;
        }
    }

    public final void remindReferral(RewardReferral referral) {
        Intrinsics.checkNotNullParameter(referral, "referral");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C267711(referral, null), 3, null);
        AnalyticsLogger.DefaultImpls.logButtonGroupTap$default(this.analytics, AnalyticsStrings.BUTTON_GROUP_REFERRALS_REMINDER_PAST_REFERRALS, AnalyticsStrings.BUTTON_REFERRALS_REMINDER, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }
}
