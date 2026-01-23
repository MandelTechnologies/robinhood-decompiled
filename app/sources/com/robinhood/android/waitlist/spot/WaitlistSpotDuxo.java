package com.robinhood.android.waitlist.spot;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.android.waitlist.spot.WaitlistSpotFragment;
import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.waitlist.ApiWaitlistSpot;
import com.robinhood.models.p355ui.bonfire.waitlist.WaitlistSpot2;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: WaitlistSpotDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/waitlist/spot/WaitlistSpotDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/waitlist/spot/WaitlistSpotViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "bonfire", "Lcom/robinhood/api/retrofit/BonfireApi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/api/retrofit/BonfireApi;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "joinWaitlist", "", "Companion", "feature-waitlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class WaitlistSpotDuxo extends OldBaseDuxo<WaitlistSpotViewState> implements HasSavedState {
    private final BonfireApi bonfire;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WaitlistSpotDuxo(BonfireApi bonfire2, SavedStateHandle savedStateHandle) {
        super(new WaitlistSpotViewState(new UiEvent(((WaitlistSpotFragment.Args) INSTANCE.getArgs(savedStateHandle)).getSpot()), null, false, null, 14, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(bonfire2, "bonfire");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.bonfire = bonfire2;
        this.savedStateHandle = savedStateHandle;
    }

    public final void joinWaitlist() {
        applyMutation(new Function1() { // from class: com.robinhood.android.waitlist.spot.WaitlistSpotDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WaitlistSpotDuxo.joinWaitlist$lambda$0((WaitlistSpotViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C314482(null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.waitlist.spot.WaitlistSpotDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WaitlistSpotDuxo.joinWaitlist$lambda$2(this.f$0, (ApiWaitlistSpot) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.waitlist.spot.WaitlistSpotDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WaitlistSpotDuxo.joinWaitlist$lambda$4(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WaitlistSpotViewState joinWaitlist$lambda$0(WaitlistSpotViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return WaitlistSpotViewState.copy$default(applyMutation, null, null, true, null, 11, null);
    }

    /* compiled from: WaitlistSpotDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/waitlist/ApiWaitlistSpot;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.waitlist.spot.WaitlistSpotDuxo$joinWaitlist$2", m3645f = "WaitlistSpotDuxo.kt", m3646l = {26}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.waitlist.spot.WaitlistSpotDuxo$joinWaitlist$2 */
    static final class C314482 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiWaitlistSpot>, Object> {
        int label;

        C314482(Continuation<? super C314482> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return WaitlistSpotDuxo.this.new C314482(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiWaitlistSpot> continuation) {
            return ((C314482) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            BonfireApi bonfireApi = WaitlistSpotDuxo.this.bonfire;
            String waitlistName = ((WaitlistSpotFragment.Args) WaitlistSpotDuxo.INSTANCE.getArgs((HasSavedState) WaitlistSpotDuxo.this)).getWaitlistName();
            this.label = 1;
            Object objJoinWaitlist = bonfireApi.joinWaitlist(waitlistName, this);
            return objJoinWaitlist == coroutine_suspended ? coroutine_suspended : objJoinWaitlist;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit joinWaitlist$lambda$2(WaitlistSpotDuxo waitlistSpotDuxo, final ApiWaitlistSpot it) {
        Intrinsics.checkNotNullParameter(it, "it");
        waitlistSpotDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.waitlist.spot.WaitlistSpotDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WaitlistSpotDuxo.joinWaitlist$lambda$2$lambda$1(it, (WaitlistSpotViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WaitlistSpotViewState joinWaitlist$lambda$2$lambda$1(ApiWaitlistSpot apiWaitlistSpot, WaitlistSpotViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return applyMutation.copy(new UiEvent<>(WaitlistSpot2.toUiModel(apiWaitlistSpot)), new UiEvent<>(Unit.INSTANCE), false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit joinWaitlist$lambda$4(WaitlistSpotDuxo waitlistSpotDuxo, final Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        waitlistSpotDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.waitlist.spot.WaitlistSpotDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WaitlistSpotDuxo.joinWaitlist$lambda$4$lambda$3(error, (WaitlistSpotViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WaitlistSpotViewState joinWaitlist$lambda$4$lambda$3(Throwable th, WaitlistSpotViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return WaitlistSpotViewState.copy$default(applyMutation, null, null, false, th, 3, null);
    }

    /* compiled from: WaitlistSpotDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/waitlist/spot/WaitlistSpotDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/waitlist/spot/WaitlistSpotDuxo;", "Lcom/robinhood/android/waitlist/spot/WaitlistSpotFragment$Args;", "<init>", "()V", "feature-waitlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<WaitlistSpotDuxo, WaitlistSpotFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public WaitlistSpotFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (WaitlistSpotFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public WaitlistSpotFragment.Args getArgs(WaitlistSpotDuxo waitlistSpotDuxo) {
            return (WaitlistSpotFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, waitlistSpotDuxo);
        }
    }
}
