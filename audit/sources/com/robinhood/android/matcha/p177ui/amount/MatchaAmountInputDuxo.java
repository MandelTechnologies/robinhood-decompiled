package com.robinhood.android.matcha.p177ui.amount;

import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.matcha.p177ui.MatchaMultiuserExperiment;
import com.robinhood.android.matcha.p177ui.amount.MatchaAmountInputDuxo;
import com.robinhood.android.matcha.p177ui.amount.MatchaAmountInputFragment;
import com.robinhood.android.matcha.p177ui.models.Direction;
import com.robinhood.android.matcha.p177ui.sourceoffunds.TransferAccounts3;
import com.robinhood.android.models.matcha.api.ApiMatchaRestrictionResponse;
import com.robinhood.android.tickerinputview.keyevent.DollarInputConsumer;
import com.robinhood.android.tickerinputview.keyevent.InputKeyEventConsumer;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.matcha.MatchaApi;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.serverdriven.api.ApiGenericAlert;
import com.robinhood.models.serverdriven.p347db.GenericAlert;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.money.Currencies;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MatchaAmountInputDuxo.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001 B)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0013J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bJ\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/amount/MatchaAmountInputDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/matcha/ui/amount/MatchaAmountInputViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "matchaApi", "Lcom/robinhood/api/matcha/MatchaApi;", "transferAccountStore", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/api/matcha/MatchaApi;Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "inputKeyEventConsumer", "Lcom/robinhood/android/tickerinputview/keyevent/DollarInputConsumer;", "onStart", "", "onResume", "consumeKeyEvent", "keyEvent", "Landroid/view/KeyEvent;", "onContinueButtonClick", "setSourceOfFunds", MatchaAmountInputDuxo.SAVED_STATE_SOURCE_OF_FUNDS, "Lcom/robinhood/models/db/bonfire/TransferAccount;", "getDefaultSourceOfFunds", "transferAccounts", "", "fetchRestriction", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MatchaAmountInputDuxo extends OldBaseDuxo<MatchaAmountInputViewState> implements HasSavedState {
    private static final String SAVED_STATE_SOURCE_OF_FUNDS = "sourceOfFunds";
    private final ExperimentsStore experimentsStore;
    private final DollarInputConsumer inputKeyEventConsumer;
    private final MatchaApi matchaApi;
    private final SavedStateHandle savedStateHandle;
    private final TransferAccountStore transferAccountStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public MatchaAmountInputDuxo(MatchaApi matchaApi, TransferAccountStore transferAccountStore, ExperimentsStore experimentsStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(matchaApi, "matchaApi");
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        BigDecimal bigDecimal = null;
        char[] cArr = null;
        UiEvent uiEvent = null;
        UiEvent uiEvent2 = null;
        UiEvent uiEvent3 = null;
        super(new MatchaAmountInputViewState(((MatchaAmountInputFragment.Args) companion.getArgs(savedStateHandle)).getDirection(), bigDecimal, ((MatchaAmountInputFragment.Args) companion.getArgs(savedStateHandle)).getTransactors(), cArr, uiEvent, uiEvent2, uiEvent3, (TransferAccount) savedStateHandle.get(SAVED_STATE_SOURCE_OF_FUNDS), null, null, null, 1914, null), null, 2, 0 == true ? 1 : 0);
        this.matchaApi = matchaApi;
        this.transferAccountStore = transferAccountStore;
        this.experimentsStore = experimentsStore;
        this.savedStateHandle = savedStateHandle;
        this.inputKeyEventConsumer = new DollarInputConsumer(new BigDecimal(100000), true);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, getStates(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.amount.MatchaAmountInputDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaAmountInputDuxo.onStart$lambda$0(this.f$0, (MatchaAmountInputViewState) obj);
            }
        });
        this.transferAccountStore.refresh(true);
        LifecycleHost.DefaultImpls.bind$default(this, this.transferAccountStore.stream(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.amount.MatchaAmountInputDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaAmountInputDuxo.onStart$lambda$3(this.f$0, (List) obj);
            }
        });
        Observable observableDistinctUntilChanged = ExperimentsProvider.DefaultImpls.streamState$default(this.experimentsStore, new Experiment[]{MatchaMultiuserExperiment.INSTANCE}, false, null, 6, null).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.matcha.ui.amount.MatchaAmountInputDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaAmountInputDuxo.onStart$lambda$5(this.f$0, (Boolean) obj);
            }
        });
        fetchRestriction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(MatchaAmountInputDuxo matchaAmountInputDuxo, MatchaAmountInputViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        matchaAmountInputDuxo.getSavedStateHandle().set(SAVED_STATE_SOURCE_OF_FUNDS, it.getSourceOfFunds());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$3(final MatchaAmountInputDuxo matchaAmountInputDuxo, final List accounts2) {
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        matchaAmountInputDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.amount.MatchaAmountInputDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaAmountInputDuxo.onStart$lambda$3$lambda$2(accounts2, matchaAmountInputDuxo, (MatchaAmountInputViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchaAmountInputViewState onStart$lambda$3$lambda$2(List list, MatchaAmountInputDuxo matchaAmountInputDuxo, MatchaAmountInputViewState applyMutation) {
        Object obj;
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String id = ((TransferAccount) next).getId();
            TransferAccount sourceOfFunds = applyMutation.getSourceOfFunds();
            if (Intrinsics.areEqual(id, sourceOfFunds != null ? sourceOfFunds.getId() : null)) {
                obj = next;
                break;
            }
        }
        TransferAccount defaultSourceOfFunds = (TransferAccount) obj;
        if (defaultSourceOfFunds == null) {
            defaultSourceOfFunds = matchaAmountInputDuxo.getDefaultSourceOfFunds(list);
        }
        return MatchaAmountInputViewState.copy$default(applyMutation, null, null, null, null, null, null, null, defaultSourceOfFunds, list, null, null, 1663, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$5(MatchaAmountInputDuxo matchaAmountInputDuxo, final Boolean bool) {
        matchaAmountInputDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.amount.MatchaAmountInputDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaAmountInputDuxo.onStart$lambda$5$lambda$4(bool, (MatchaAmountInputViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchaAmountInputViewState onStart$lambda$5$lambda$4(Boolean bool, MatchaAmountInputViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MatchaAmountInputViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, null, bool, 1023, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        this.transferAccountStore.refresh(true);
    }

    public final void consumeKeyEvent(final KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.amount.MatchaAmountInputDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaAmountInputDuxo.consumeKeyEvent$lambda$6(this.f$0, keyEvent, (MatchaAmountInputViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchaAmountInputViewState consumeKeyEvent$lambda$6(MatchaAmountInputDuxo matchaAmountInputDuxo, KeyEvent keyEvent, MatchaAmountInputViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        InputKeyEventConsumer.InputState<BigDecimal> inputStateConsume = matchaAmountInputDuxo.inputKeyEventConsumer.consume(new InputKeyEventConsumer.InputState(applyMutation.getAmount(), applyMutation.getInputChars()), keyEvent);
        return MatchaAmountInputViewState.copy$default(applyMutation, null, inputStateConsume.component1(), null, inputStateConsume.getInput(), new UiEvent(Unit.INSTANCE), null, null, null, null, null, null, 2021, null);
    }

    public final void onContinueButtonClick() {
        applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.amount.MatchaAmountInputDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaAmountInputDuxo.onContinueButtonClick$lambda$7((MatchaAmountInputViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchaAmountInputViewState onContinueButtonClick$lambda$7(MatchaAmountInputViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        if (applyMutation.getHasInsufficientFunds()) {
            return MatchaAmountInputViewState.copy$default(applyMutation, null, null, null, null, null, null, new UiEvent(Unit.INSTANCE), null, null, null, null, 1983, null);
        }
        Money money = Money3.toMoney(applyMutation.getAmount(), Currencies.USD);
        TransferAccount sourceOfFunds = applyMutation.getSourceOfFunds();
        return MatchaAmountInputViewState.copy$default(applyMutation, null, null, null, null, null, new UiEvent(Tuples4.m3642to(money, sourceOfFunds != null ? TransferAccounts3.toSourceOfFunds(sourceOfFunds) : null)), null, null, null, null, null, 2015, null);
    }

    public final void setSourceOfFunds(final TransferAccount sourceOfFunds) {
        Intrinsics.checkNotNullParameter(sourceOfFunds, "sourceOfFunds");
        applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.amount.MatchaAmountInputDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MatchaAmountInputDuxo.setSourceOfFunds$lambda$8(sourceOfFunds, (MatchaAmountInputViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchaAmountInputViewState setSourceOfFunds$lambda$8(TransferAccount transferAccount, MatchaAmountInputViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MatchaAmountInputViewState.copy$default(applyMutation, null, null, null, null, null, null, null, transferAccount, null, null, null, 1919, null);
    }

    private final TransferAccount getDefaultSourceOfFunds(List<TransferAccount> transferAccounts) {
        Object next;
        Iterator<T> it = transferAccounts.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((TransferAccount) next).getType() == TransferAccounts3.getDefaultSourceOfFundsType()) {
                break;
            }
        }
        return (TransferAccount) next;
    }

    /* compiled from: MatchaAmountInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.amount.MatchaAmountInputDuxo$fetchRestriction$1", m3645f = "MatchaAmountInputDuxo.kt", m3646l = {131}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.amount.MatchaAmountInputDuxo$fetchRestriction$1 */
    static final class C212991 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* compiled from: MatchaAmountInputDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.matcha.ui.amount.MatchaAmountInputDuxo$fetchRestriction$1$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Direction.values().length];
                try {
                    iArr[Direction.SEND.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Direction.REQUEST.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        C212991(Continuation<? super C212991> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MatchaAmountInputDuxo.this.new C212991(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C212991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            ApiMatchaRestrictionResponse.Flow flow;
            ApiGenericAlert alert;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            final GenericAlert dbModel = null;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MatchaApi matchaApi = MatchaAmountInputDuxo.this.matchaApi;
                    int i2 = WhenMappings.$EnumSwitchMapping$0[((MatchaAmountInputFragment.Args) MatchaAmountInputDuxo.INSTANCE.getArgs((HasSavedState) MatchaAmountInputDuxo.this)).getDirection().ordinal()];
                    if (i2 == 1) {
                        flow = ApiMatchaRestrictionResponse.Flow.CREATE_PAYMENT;
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        flow = ApiMatchaRestrictionResponse.Flow.CREATE_REQUEST;
                    }
                    this.label = 1;
                    obj = matchaApi.getRestriction(flow, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ApiMatchaRestrictionResponse.Restriction restriction = ((ApiMatchaRestrictionResponse) obj).getRestriction();
                if (restriction != null && (alert = restriction.getAlert()) != null) {
                    dbModel = alert.toDbModel();
                }
            } catch (Throwable th) {
                if (!Throwables.isNetworkRelated(th)) {
                    throw th;
                }
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 6, null);
            }
            if (dbModel != null) {
                MatchaAmountInputDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.matcha.ui.amount.MatchaAmountInputDuxo$fetchRestriction$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return MatchaAmountInputDuxo.C212991.invokeSuspend$lambda$1$lambda$0(dbModel, (MatchaAmountInputViewState) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MatchaAmountInputViewState invokeSuspend$lambda$1$lambda$0(GenericAlert genericAlert, MatchaAmountInputViewState matchaAmountInputViewState) {
            return MatchaAmountInputViewState.copy$default(matchaAmountInputViewState, null, null, null, null, null, null, null, null, null, new UiEvent(genericAlert), null, 1535, null);
        }
    }

    private final void fetchRestriction() {
        getLifecycleScope().launchWhenStarted(new C212991(null));
    }

    /* compiled from: MatchaAmountInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/amount/MatchaAmountInputDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/matcha/ui/amount/MatchaAmountInputDuxo;", "Lcom/robinhood/android/matcha/ui/amount/MatchaAmountInputFragment$Args;", "<init>", "()V", "SAVED_STATE_SOURCE_OF_FUNDS", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MatchaAmountInputDuxo, MatchaAmountInputFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchaAmountInputFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (MatchaAmountInputFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public MatchaAmountInputFragment.Args getArgs(MatchaAmountInputDuxo matchaAmountInputDuxo) {
            return (MatchaAmountInputFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, matchaAmountInputDuxo);
        }
    }
}
