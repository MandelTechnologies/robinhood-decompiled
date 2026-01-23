package com.robinhood.android.rhyonboarding.postaccountopen;

import com.robinhood.analytics.EventLogger;
import com.robinhood.android.rhyonboarding.postaccountopen.RhyPostAccountOpenViewState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.bonfire.RhyAccountStore;
import com.robinhood.models.PaginatedResult;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyPostAccountOpenDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0014B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenDataState;", "Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenViewState;", "rhyAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "stateProvider", "Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/RhyAccountStore;Lcom/robinhood/analytics/EventLogger;Lcom/robinhood/android/rhyonboarding/postaccountopen/RhyPostAccountOpenStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onStart", "", "logAppearAction", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "state", "Companion", "feature-rhy-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class RhyPostAccountOpenDuxo extends BaseDuxo<RhyPostAccountOpenDataState, RhyPostAccountOpenViewState> {
    private static final long LOADING_DELAY_SECONDS = 2;
    private static final long TIMEOUT_SECONDS = 8;
    private final EventLogger eventLogger;
    private final RhyAccountStore rhyAccountStore;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyPostAccountOpenDuxo(RhyAccountStore rhyAccountStore, EventLogger eventLogger, RhyPostAccountOpenStateProvider stateProvider, DuxoBundle duxoBundle) {
        super(new RhyPostAccountOpenDataState(false, null, false, 7, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(rhyAccountStore, "rhyAccountStore");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.rhyAccountStore = rhyAccountStore;
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        this.rhyAccountStore.refresh(true);
        Observable observablePollAccountsUntilPresentObservable$default = RhyAccountStore.pollAccountsUntilPresentObservable$default(this.rhyAccountStore, null, 1, null);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Observable observableDistinctUntilChanged = observablePollAccountsUntilPresentObservable$default.delay(2L, timeUnit).timeout(TIMEOUT_SECONDS, timeUnit).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.rhyonboarding.postaccountopen.RhyPostAccountOpenDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyPostAccountOpenDuxo.onStart$lambda$0(this.f$0, (PaginatedResult) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.rhyonboarding.postaccountopen.RhyPostAccountOpenDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhyPostAccountOpenDuxo.onStart$lambda$1(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(RhyPostAccountOpenDuxo rhyPostAccountOpenDuxo, PaginatedResult paginatedResult) {
        rhyPostAccountOpenDuxo.applyMutation(new RhyPostAccountOpenDuxo2(paginatedResult, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(RhyPostAccountOpenDuxo rhyPostAccountOpenDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        rhyPostAccountOpenDuxo.applyMutation(new RhyPostAccountOpenDuxo3(null));
        return Unit.INSTANCE;
    }

    public final void logAppearAction(Screen eventScreen, RhyPostAccountOpenViewState state) {
        UserInteractionEventData.Action action;
        Intrinsics.checkNotNullParameter(eventScreen, "eventScreen");
        Intrinsics.checkNotNullParameter(state, "state");
        if (state instanceof RhyPostAccountOpenViewState.Finished) {
            if (!((RhyPostAccountOpenViewState.Finished) state).getSpendingAccountCreated()) {
                return;
            } else {
                action = UserInteractionEventData.Action.APPROVE;
            }
        } else if (state instanceof RhyPostAccountOpenViewState.Timeout) {
            action = UserInteractionEventData.Action.TIMEOUT;
        } else {
            if (!(state instanceof RhyPostAccountOpenViewState.Loading)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        EventLogger.DefaultImpls.logAppear$default(this.eventLogger, action, eventScreen, null, null, null, 28, null);
    }
}
