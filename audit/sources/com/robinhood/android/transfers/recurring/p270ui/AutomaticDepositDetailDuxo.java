package com.robinhood.android.transfers.recurring.p270ui;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.transfers.recurring.p270ui.AutomaticDepositDetailDuxo;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.AutomaticDepositStore;
import com.robinhood.librobinhood.data.store.rhy.RecurringContributionInfoStore;
import com.robinhood.models.api.ApiAutomaticDeposit;
import com.robinhood.models.api.bonfire.ApiRecurringIraContributionInfo;
import com.robinhood.models.card.p311db.Card;
import com.robinhood.models.p320db.AutomaticDeposit;
import com.robinhood.models.p355ui.UiAutomaticDeposit;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
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
import p479j$.time.Clock;

/* compiled from: AutomaticDepositDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002! B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/android/lib/account/AccountProvider;", "accountProvider", "Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "automaticDepositStore", "Lcom/robinhood/librobinhood/data/store/rhy/RecurringContributionInfoStore;", "recurringContributionInfoStore", "j$/time/Clock", Card.Icon.CLOCK, "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;Lcom/robinhood/librobinhood/data/store/rhy/RecurringContributionInfoStore;Lj$/time/Clock;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "", "onResume", "()V", "cancelAutomaticDeposit", "skipAutomaticDeposit", "Lcom/robinhood/android/lib/account/AccountProvider;", "Lcom/robinhood/librobinhood/data/store/AutomaticDepositStore;", "Lcom/robinhood/librobinhood/data/store/rhy/RecurringContributionInfoStore;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "", "automaticDepositId", "Ljava/lang/String;", "Companion", "Result", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class AutomaticDepositDetailDuxo extends BaseDuxo4<AutomaticDepositDetailViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final String automaticDepositId;
    private final AutomaticDepositStore automaticDepositStore;
    private final RecurringContributionInfoStore recurringContributionInfoStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutomaticDepositDetailDuxo(AccountProvider accountProvider, AutomaticDepositStore automaticDepositStore, RecurringContributionInfoStore recurringContributionInfoStore, Clock clock, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new AutomaticDepositDetailViewState(null, null, false, null, null, false, null, clock, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null), duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(automaticDepositStore, "automaticDepositStore");
        Intrinsics.checkNotNullParameter(recurringContributionInfoStore, "recurringContributionInfoStore");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.accountProvider = accountProvider;
        this.automaticDepositStore = automaticDepositStore;
        this.recurringContributionInfoStore = recurringContributionInfoStore;
        this.savedStateHandle = savedStateHandle;
        this.automaticDepositId = ((LegacyFragmentKey.AutomaticDepositDetail) INSTANCE.getArgs(getSavedStateHandle())).getAutomaticDepositId();
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        this.automaticDepositStore.refresh(false);
        Observable<UiAutomaticDeposit> observableRefCount = this.automaticDepositStore.getAutomaticDeposit(this.automaticDepositId).distinctUntilChanged().replay(1).refCount();
        Intrinsics.checkNotNullExpressionValue(observableRefCount, "refCount(...)");
        Observable<R> observableSwitchMap = observableRefCount.switchMap(new Function() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailDuxo.onResume.1

            /* compiled from: AutomaticDepositDetailDuxo.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailDuxo$onResume$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ApiAutomaticDeposit.DestinationAccountType.values().length];
                    try {
                        iArr[ApiAutomaticDeposit.DestinationAccountType.RHS_IRA_ROTH.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ApiAutomaticDeposit.DestinationAccountType.RHS_IRA_ROTH_INHERITED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ApiAutomaticDeposit.DestinationAccountType.RHS_IRA_TRADITIONAL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ApiAutomaticDeposit.DestinationAccountType.RHS_IRA_TRADITIONAL_INHERITED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ApiAutomaticDeposit.DestinationAccountType.RHS_ACCOUNT.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[ApiAutomaticDeposit.DestinationAccountType.RHS_JOINT_TENANCY_WITH_ROS.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[ApiAutomaticDeposit.DestinationAccountType.RHY_ACCOUNT.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[ApiAutomaticDeposit.DestinationAccountType.UNKNOWN.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<UiAutomaticDeposit, ApiRecurringIraContributionInfo>> apply(final UiAutomaticDeposit deposit) {
                Intrinsics.checkNotNullParameter(deposit, "deposit");
                switch (WhenMappings.$EnumSwitchMapping$0[deposit.getAutomaticDeposit().getDestinationAccount().getAccountType().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        return AutomaticDepositDetailDuxo.this.recurringContributionInfoStore.streamContributionInfo(deposit.getAutomaticDeposit().getId()).map(new Function() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailDuxo.onResume.1.1
                            @Override // io.reactivex.functions.Function
                            public final Tuples2<UiAutomaticDeposit, ApiRecurringIraContributionInfo> apply(Optional<ApiRecurringIraContributionInfo> optional) {
                                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                                return Tuples4.m3642to(deposit, optional.component1());
                            }
                        }).onErrorReturnItem(Tuples4.m3642to(deposit, null));
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        return Observable.just(Tuples4.m3642to(deposit, null));
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableSwitchMap, "switchMap(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSwitchMap, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutomaticDepositDetailDuxo.onResume$lambda$0(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$0(AutomaticDepositDetailDuxo automaticDepositDetailDuxo, Tuples2 tuples2) {
        Object objComponent1 = tuples2.component1();
        Intrinsics.checkNotNullExpressionValue(objComponent1, "component1(...)");
        automaticDepositDetailDuxo.applyMutation(new AutomaticDepositDetailDuxo5((UiAutomaticDeposit) objComponent1, (ApiRecurringIraContributionInfo) tuples2.component2(), null));
        return Unit.INSTANCE;
    }

    /* compiled from: AutomaticDepositDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailDuxo$cancelAutomaticDeposit$1", m3645f = "AutomaticDepositDetailDuxo.kt", m3646l = {82}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailDuxo$cancelAutomaticDeposit$1 */
    static final class C304401 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C304401(Continuation<? super C304401> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AutomaticDepositDetailDuxo.this.new C304401(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C304401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AutomaticDepositStore automaticDepositStore = AutomaticDepositDetailDuxo.this.automaticDepositStore;
                String str = AutomaticDepositDetailDuxo.this.automaticDepositId;
                this.label = 1;
                if (AutomaticDepositStore.deleteAutomaticDeposit$default(automaticDepositStore, str, false, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final void cancelAutomaticDeposit() {
        Observable observableDoOnComplete = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C304401(null), 1, null).andThen(Observable.just(Result.Success.INSTANCE)).startWith((Observable) Result.Loading.INSTANCE).onErrorReturn(new Function() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailDuxo.cancelAutomaticDeposit.2
            @Override // io.reactivex.functions.Function
            public final Result.Error apply(Throwable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return new Result.Error(p0);
            }
        }).doOnComplete(new Action() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailDuxo.cancelAutomaticDeposit.3
            @Override // io.reactivex.functions.Action
            public final void run() {
                AutomaticDepositDetailDuxo.this.automaticDepositStore.refresh(true);
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableDoOnComplete, "doOnComplete(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDoOnComplete, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutomaticDepositDetailDuxo.cancelAutomaticDeposit$lambda$1(this.f$0, (AutomaticDepositDetailDuxo.Result) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelAutomaticDeposit$lambda$1(AutomaticDepositDetailDuxo automaticDepositDetailDuxo, Result result) {
        if (Intrinsics.areEqual(result, Result.Loading.INSTANCE)) {
            automaticDepositDetailDuxo.applyMutation(new AutomaticDepositDetailDuxo2(null));
        } else if (result instanceof Result.Error) {
            automaticDepositDetailDuxo.applyMutation(new AutomaticDepositDetailDuxo3(result, null));
        } else {
            if (!Intrinsics.areEqual(result, Result.Success.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            automaticDepositDetailDuxo.applyMutation(new AutomaticDepositDetailDuxo4(null));
        }
        return Unit.INSTANCE;
    }

    public final void skipAutomaticDeposit() {
        Single<AutomaticDeposit> singleDoFinally = this.automaticDepositStore.skipAutomaticDeposit(this.automaticDepositId).doOnSubscribe(new Consumer() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailDuxo.skipAutomaticDeposit.1

            /* compiled from: AutomaticDepositDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailDuxo$skipAutomaticDeposit$1$1", m3645f = "AutomaticDepositDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailDuxo$skipAutomaticDeposit$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AutomaticDepositDetailViewState, Continuation<? super AutomaticDepositDetailViewState>, Object> {
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
                public final Object invoke(AutomaticDepositDetailViewState automaticDepositDetailViewState, Continuation<? super AutomaticDepositDetailViewState> continuation) {
                    return ((AnonymousClass1) create(automaticDepositDetailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return AutomaticDepositDetailViewState.copy$default((AutomaticDepositDetailViewState) this.L$0, null, null, false, null, null, true, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
                }
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(Disposable disposable) {
                AutomaticDepositDetailDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        }).doFinally(new Action() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailDuxo.skipAutomaticDeposit.2

            /* compiled from: AutomaticDepositDetailDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailDuxo$skipAutomaticDeposit$2$1", m3645f = "AutomaticDepositDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailDuxo$skipAutomaticDeposit$2$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AutomaticDepositDetailViewState, Continuation<? super AutomaticDepositDetailViewState>, Object> {
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
                public final Object invoke(AutomaticDepositDetailViewState automaticDepositDetailViewState, Continuation<? super AutomaticDepositDetailViewState> continuation) {
                    return ((AnonymousClass1) create(automaticDepositDetailViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return AutomaticDepositDetailViewState.copy$default((AutomaticDepositDetailViewState) this.L$0, null, null, false, null, null, false, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
                }
            }

            @Override // io.reactivex.functions.Action
            public final void run() {
                AutomaticDepositDetailDuxo.this.applyMutation(new AnonymousClass1(null));
            }
        });
        Intrinsics.checkNotNullExpressionValue(singleDoFinally, "doFinally(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleDoFinally, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutomaticDepositDetailDuxo.skipAutomaticDeposit$lambda$2(this.f$0, (AutomaticDeposit) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.recurring.ui.AutomaticDepositDetailDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AutomaticDepositDetailDuxo.skipAutomaticDeposit$lambda$3(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit skipAutomaticDeposit$lambda$2(AutomaticDepositDetailDuxo automaticDepositDetailDuxo, AutomaticDeposit automaticDeposit) {
        automaticDepositDetailDuxo.applyMutation(new AutomaticDepositDetailDuxo6(automaticDeposit, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit skipAutomaticDeposit$lambda$3(AutomaticDepositDetailDuxo automaticDepositDetailDuxo, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        automaticDepositDetailDuxo.applyMutation(new AutomaticDepositDetailDuxo7(t, null));
        return Unit.INSTANCE;
    }

    /* compiled from: AutomaticDepositDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailDuxo$Result;", "", "Loading", "Success", "Error", "Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailDuxo$Result$Error;", "Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailDuxo$Result$Loading;", "Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailDuxo$Result$Success;", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Result {

        /* compiled from: AutomaticDepositDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailDuxo$Result$Loading;", "Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailDuxo$Result;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Loading implements Result {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object other) {
                return this == other || (other instanceof Loading);
            }

            public int hashCode() {
                return 453381278;
            }

            public String toString() {
                return "Loading";
            }

            private Loading() {
            }
        }

        /* compiled from: AutomaticDepositDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailDuxo$Result$Success;", "Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailDuxo$Result;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success implements Result {
            public static final int $stable = 0;
            public static final Success INSTANCE = new Success();

            public boolean equals(Object other) {
                return this == other || (other instanceof Success);
            }

            public int hashCode() {
                return -1750439067;
            }

            public String toString() {
                return "Success";
            }

            private Success() {
            }
        }

        /* compiled from: AutomaticDepositDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailDuxo$Result$Error;", "Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailDuxo$Result;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Error implements Result {
            public static final int $stable = 8;
            private final Throwable throwable;

            public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = error.throwable;
                }
                return error.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public final Error copy(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return new Error(throwable);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
            }

            public int hashCode() {
                return this.throwable.hashCode();
            }

            public String toString() {
                return "Error(throwable=" + this.throwable + ")";
            }

            public Error(Throwable throwable) {
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                this.throwable = throwable;
            }

            public final Throwable getThrowable() {
                return this.throwable;
            }
        }
    }

    /* compiled from: AutomaticDepositDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/transfers/recurring/ui/AutomaticDepositDetailDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$AutomaticDepositDetail;", "<init>", "()V", "feature-recurring-deposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AutomaticDepositDetailDuxo, LegacyFragmentKey.AutomaticDepositDetail> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.AutomaticDepositDetail getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.AutomaticDepositDetail) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.AutomaticDepositDetail getArgs(AutomaticDepositDetailDuxo automaticDepositDetailDuxo) {
            return (LegacyFragmentKey.AutomaticDepositDetail) DuxoCompanion.DefaultImpls.getArgs(this, automaticDepositDetailDuxo);
        }
    }
}
