package com.robinhood.android.gold.upgrade.agreements.switchplan;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.gold.subscription.api.GoldSwitchSubscriptionPlanRequest;
import com.robinhood.android.gold.subscription.api.GoldSwitchSubscriptionPlanResponse;
import com.robinhood.android.gold.subscription.store.GoldSubscriptionStore;
import com.robinhood.android.gold.upgrade.agreements.switchplan.GoldSwitchPlanAlertSheetEvent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasSavedState;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GoldSwitchPlanAlertSheetDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/gold/upgrade/agreements/switchplan/GoldSwitchPlanAlertSheetDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/gold/upgrade/agreements/switchplan/GoldSwitchPlanAlertSheetViewState;", "Lcom/robinhood/android/gold/upgrade/agreements/switchplan/GoldSwitchPlanAlertSheetEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "goldSubscriptionStore", "Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/gold/subscription/store/GoldSubscriptionStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "switchSubscriptionPlan", "", "fromPlanId", "Ljava/util/UUID;", "toPlanId", "feature-gold-upgrade-agreements_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class GoldSwitchPlanAlertSheetDuxo extends BaseDuxo5<GoldSwitchPlanAlertSheetViewState, GoldSwitchPlanAlertSheetEvent> implements HasSavedState {
    public static final int $stable = 8;
    private final GoldSubscriptionStore goldSubscriptionStore;
    private final SavedStateHandle savedStateHandle;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GoldSwitchPlanAlertSheetDuxo(GoldSubscriptionStore goldSubscriptionStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new GoldSwitchPlanAlertSheetViewState(false, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(goldSubscriptionStore, "goldSubscriptionStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.goldSubscriptionStore = goldSubscriptionStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: GoldSwitchPlanAlertSheetDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.agreements.switchplan.GoldSwitchPlanAlertSheetDuxo$switchSubscriptionPlan$1", m3645f = "GoldSwitchPlanAlertSheetDuxo.kt", m3646l = {30}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.gold.upgrade.agreements.switchplan.GoldSwitchPlanAlertSheetDuxo$switchSubscriptionPlan$1 */
    static final class C180181 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UUID $toPlanId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C180181(UUID uuid, Continuation<? super C180181> continuation) {
            super(2, continuation);
            this.$toPlanId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return GoldSwitchPlanAlertSheetDuxo.this.new C180181(this.$toPlanId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C180181) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: GoldSwitchPlanAlertSheetDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/gold/upgrade/agreements/switchplan/GoldSwitchPlanAlertSheetViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.gold.upgrade.agreements.switchplan.GoldSwitchPlanAlertSheetDuxo$switchSubscriptionPlan$1$1", m3645f = "GoldSwitchPlanAlertSheetDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.gold.upgrade.agreements.switchplan.GoldSwitchPlanAlertSheetDuxo$switchSubscriptionPlan$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<GoldSwitchPlanAlertSheetViewState, Continuation<? super GoldSwitchPlanAlertSheetViewState>, Object> {
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
            public final Object invoke(GoldSwitchPlanAlertSheetViewState goldSwitchPlanAlertSheetViewState, Continuation<? super GoldSwitchPlanAlertSheetViewState> continuation) {
                return ((AnonymousClass1) create(goldSwitchPlanAlertSheetViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((GoldSwitchPlanAlertSheetViewState) this.L$0).copy(true);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    GoldSwitchPlanAlertSheetDuxo.this.applyMutation(new AnonymousClass1(null));
                    GoldSubscriptionStore goldSubscriptionStore = GoldSwitchPlanAlertSheetDuxo.this.goldSubscriptionStore;
                    GoldSwitchSubscriptionPlanRequest goldSwitchSubscriptionPlanRequest = new GoldSwitchSubscriptionPlanRequest(this.$toPlanId);
                    this.label = 1;
                    obj = goldSubscriptionStore.switchSubscriptionPlan(goldSwitchSubscriptionPlanRequest, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                GoldSwitchPlanAlertSheetDuxo.this.submit(new GoldSwitchPlanAlertSheetEvent.SwitchComplete((GoldSwitchSubscriptionPlanResponse) obj));
            } catch (Exception e) {
                GoldSwitchPlanAlertSheetDuxo.this.submit(new GoldSwitchPlanAlertSheetEvent.Failed(e));
            }
            return Unit.INSTANCE;
        }
    }

    public final void switchSubscriptionPlan(UUID fromPlanId, UUID toPlanId) {
        Intrinsics.checkNotNullParameter(fromPlanId, "fromPlanId");
        Intrinsics.checkNotNullParameter(toPlanId, "toPlanId");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C180181(toPlanId, null), 3, null);
    }
}
