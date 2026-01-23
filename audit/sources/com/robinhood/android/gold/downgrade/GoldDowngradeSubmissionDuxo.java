package com.robinhood.android.gold.downgrade;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.CardManager;
import com.robinhood.android.gold.downgrade.GoldDowngradeSubmissionEvent;
import com.robinhood.android.gold.subscription.api.GoldUnsubscribeResponse;
import com.robinhood.android.gold.subscription.store.GoldSubscriptionStore;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.MinTimeInFlight;
import com.robinhood.lib.sweep.enrollment.SweepEnrollmentStore;
import com.robinhood.librobinhood.data.store.SweepsInterestStore;
import com.robinhood.librobinhood.data.store.identi.BaseSortingHatStore;
import com.robinhood.models.card.p311db.Card;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.Duration3;
import kotlin.time.DurationUnitJvm;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import p479j$.time.Clock;

/* compiled from: GoldDowngradeSubmissionDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\"BI\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001aR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001bR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001cR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001dR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001eR\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/gold/downgrade/GoldDowngradeSubmissionDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeSubmissionEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/common/util/CardManager;", "cardManager", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "sortingHatStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;", "goldSubscriptionStore", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "sweepEnrollmentStore", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "sweepsInterestStore", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/android/common/util/CardManager;Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;Lj$/time/Clock;Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "onCreate", "()V", "Lcom/robinhood/android/common/util/CardManager;", "Lcom/robinhood/librobinhood/data/store/identi/BaseSortingHatStore;", "Lj$/time/Clock;", "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;", "Lcom/robinhood/lib/sweep/enrollment/SweepEnrollmentStore;", "Lcom/robinhood/librobinhood/data/store/SweepsInterestStore;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "feature-gold-downgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldDowngradeSubmissionDuxo extends BaseDuxo5<Unit, GoldDowngradeSubmissionEvent> implements HasSavedState {
    private final CardManager cardManager;
    private final Clock clock;
    private final GoldSubscriptionStore goldSubscriptionStore;
    private final SavedStateHandle savedStateHandle;
    private final BaseSortingHatStore sortingHatStore;
    private final SweepEnrollmentStore sweepEnrollmentStore;
    private final SweepsInterestStore sweepsInterestStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldDowngradeSubmissionDuxo(CardManager cardManager, BaseSortingHatStore sortingHatStore, Clock clock, GoldSubscriptionStore goldSubscriptionStore, SweepEnrollmentStore sweepEnrollmentStore, SweepsInterestStore sweepsInterestStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(cardManager, "cardManager");
        Intrinsics.checkNotNullParameter(sortingHatStore, "sortingHatStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(goldSubscriptionStore, "goldSubscriptionStore");
        Intrinsics.checkNotNullParameter(sweepEnrollmentStore, "sweepEnrollmentStore");
        Intrinsics.checkNotNullParameter(sweepsInterestStore, "sweepsInterestStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.cardManager = cardManager;
        this.sortingHatStore = sortingHatStore;
        this.clock = clock;
        this.goldSubscriptionStore = goldSubscriptionStore;
        this.sweepEnrollmentStore = sweepEnrollmentStore;
        this.sweepsInterestStore = sweepsInterestStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C177451(((GoldDowngradeContext) INSTANCE.getArgs((HasSavedState) this)).getSubscription().getId(), null), 3, null);
    }

    /* compiled from: GoldDowngradeSubmissionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.downgrade.GoldDowngradeSubmissionDuxo$onCreate$1", m3645f = "GoldDowngradeSubmissionDuxo.kt", m3646l = {43}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.downgrade.GoldDowngradeSubmissionDuxo$onCreate$1 */
    static final class C177451 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $subscriptionId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C177451(UUID uuid, Continuation<? super C177451> continuation) {
            super(2, continuation);
            this.$subscriptionId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GoldDowngradeSubmissionDuxo.this.new C177451(this.$subscriptionId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C177451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    Clock clock = GoldDowngradeSubmissionDuxo.this.clock;
                    Duration.Companion companion = Duration.INSTANCE;
                    long duration = Duration3.toDuration(1000L, DurationUnitJvm.MILLISECONDS);
                    GoldDowngradeSubmissionDuxo2 goldDowngradeSubmissionDuxo2 = new GoldDowngradeSubmissionDuxo2(GoldDowngradeSubmissionDuxo.this, this.$subscriptionId, null);
                    this.label = 1;
                    obj = MinTimeInFlight.m22184withMinTimeInFlightdWUq8MI(clock, duration, goldDowngradeSubmissionDuxo2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                GoldUnsubscribeResponse goldUnsubscribeResponse = (GoldUnsubscribeResponse) obj;
                GoldDowngradeSubmissionDuxo.this.sweepsInterestStore.refreshNoAccountNumber(true);
                SweepEnrollmentStore.refreshSweepSplash$default(GoldDowngradeSubmissionDuxo.this.sweepEnrollmentStore, null, true, 1, null);
                GoldDowngradeSubmissionDuxo.this.cardManager.invalidateCardsBestEffort();
                GoldDowngradeSubmissionDuxo.this.sortingHatStore.invalidateSortingHatCacheIfNeeded();
                if (goldUnsubscribeResponse.getSuccess()) {
                    GoldDowngradeSubmissionDuxo.this.submit(new GoldDowngradeSubmissionEvent.Success(goldUnsubscribeResponse.getGoldDowngradeConfirmation()));
                }
            } catch (Throwable th) {
                GoldDowngradeSubmissionDuxo.this.submit(new GoldDowngradeSubmissionEvent.Failure(th));
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: GoldDowngradeSubmissionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/gold/downgrade/GoldDowngradeSubmissionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeSubmissionDuxo;", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeContext;", "<init>", "()V", "feature-gold-downgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<GoldDowngradeSubmissionDuxo, GoldDowngradeContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public GoldDowngradeContext getArgs(SavedStateHandle savedStateHandle) {
            return (GoldDowngradeContext) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public GoldDowngradeContext getArgs(GoldDowngradeSubmissionDuxo goldDowngradeSubmissionDuxo) {
            return (GoldDowngradeContext) DuxoCompanion.DefaultImpls.getArgs(this, goldDowngradeSubmissionDuxo);
        }
    }
}
