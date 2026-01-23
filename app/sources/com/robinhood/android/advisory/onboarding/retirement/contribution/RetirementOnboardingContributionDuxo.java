package com.robinhood.android.advisory.onboarding.retirement.contribution;

import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionEvent;
import com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionFragment;
import com.robinhood.android.models.retirement.api.contributions.ContributionYear;
import com.robinhood.android.models.retirement.api.contributions.KeypadChip;
import com.robinhood.android.retirement.contributions.ExtensionsKt;
import com.robinhood.android.tickerinputview.keyevent.DollarInputConsumer;
import com.robinhood.android.tickerinputview.keyevent.InputKeyEventConsumer;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.prefs.DefaultAchRelationship;
import com.robinhood.librobinhood.data.store.bonfire.TransferAccountStore;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.api.bonfire.ApiTransferAccount;
import com.robinhood.models.p320db.bonfire.ManagementInfo;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.util.Money;
import com.robinhood.prefs.StringPreference;
import com.robinhood.store.advisory.AdvisoryFirstDepositConfig;
import com.robinhood.store.advisory.AdvisoryOnboardingStore;
import com.robinhood.utils.money.Currencies;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
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
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Year;

/* compiled from: RetirementOnboardingContributionDuxo.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 22\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u00012B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u0014J\r\u0010\u001e\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u0014J\u0017\u0010!\u001a\u00020\u00122\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00122\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020\u00122\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0012¢\u0006\u0004\b+\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010.R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010/\u001a\u0004\b0\u00101¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionDataState;", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionViewState;", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "transferAccountStore", "Lcom/robinhood/prefs/StringPreference;", "defaultAchRelationshipPref", "Lcom/robinhood/store/advisory/AdvisoryOnboardingStore;", "onboardingStore", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;Lcom/robinhood/prefs/StringPreference;Lcom/robinhood/store/advisory/AdvisoryOnboardingStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "", "onCreate", "()V", "Lcom/robinhood/android/models/retirement/api/contributions/KeypadChip;", "chip", "onChipPressed", "(Lcom/robinhood/android/models/retirement/api/contributions/KeypadChip;)V", "Landroid/view/KeyEvent;", "keyEvent", "consumeKeyEvent", "(Landroid/view/KeyEvent;)V", "onEditContinueClicked", "moveToEditMode", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "account", "setSourceAccount", "(Lcom/robinhood/models/db/bonfire/TransferAccount;)V", "j$/time/Year", "year", "setTaxYear", "(Lj$/time/Year;)V", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "frequency", "setFrequency", "(Lcom/robinhood/models/api/bonfire/TransferFrequency;)V", "onSubmitClicked", "Lcom/robinhood/librobinhood/data/store/bonfire/TransferAccountStore;", "Lcom/robinhood/prefs/StringPreference;", "Lcom/robinhood/store/advisory/AdvisoryOnboardingStore;", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RetirementOnboardingContributionDuxo extends BaseDuxo3<RetirementOnboardingContributionDataState, RetirementOnboardingContributionViewState, RetirementOnboardingContributionEvent> implements HasSavedState {
    private final StringPreference defaultAchRelationshipPref;
    private final AdvisoryOnboardingStore onboardingStore;
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
    public RetirementOnboardingContributionDuxo(TransferAccountStore transferAccountStore, @DefaultAchRelationship StringPreference defaultAchRelationshipPref, AdvisoryOnboardingStore onboardingStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(transferAccountStore, "transferAccountStore");
        Intrinsics.checkNotNullParameter(defaultAchRelationshipPref, "defaultAchRelationshipPref");
        Intrinsics.checkNotNullParameter(onboardingStore, "onboardingStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new RetirementOnboardingContributionDataState(((RetirementOnboardingContributionFragment.Args) companion.getArgs(savedStateHandle)).getAccountType(), ((RetirementOnboardingContributionFragment.Args) companion.getArgs(savedStateHandle)).getContributionYears(), ((RetirementOnboardingContributionFragment.Args) companion.getArgs(savedStateHandle)).getMinimumContribution(), null, false, null, null, null, null, false, null, 2040, null), RetirementOnboardingContributionDataState.INSTANCE, duxoBundle);
        this.transferAccountStore = transferAccountStore;
        this.defaultAchRelationshipPref = defaultAchRelationshipPref;
        this.onboardingStore = onboardingStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onCreate() {
        super.onCreate();
        List<ContributionYear> contributionYears = ((RetirementOnboardingContributionFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getContributionYears();
        if (!(contributionYears instanceof Collection) || !contributionYears.isEmpty()) {
            Iterator<T> it = contributionYears.iterator();
            while (it.hasNext()) {
                if (!((ContributionYear) it.next()).isContributable()) {
                    break;
                }
            }
            if (((RetirementOnboardingContributionFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getContributionYears().size() > 1) {
                submit(RetirementOnboardingContributionEvent.LaunchTaxYear.INSTANCE);
            }
        } else if (((RetirementOnboardingContributionFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getContributionYears().size() > 1) {
        }
        this.transferAccountStore.refresh(false);
        Observable<R> map = this.transferAccountStore.fetchIfStaleThenStream().map(new Function() { // from class: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionDuxo.onCreate.1
            @Override // io.reactivex.functions.Function
            public final List<TransferAccount> apply(List<TransferAccount> accounts2) {
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                ArrayList arrayList = new ArrayList();
                for (T t : accounts2) {
                    ManagementInfo managementInfo = ((TransferAccount) t).getManagementInfo();
                    if ((managementInfo != null ? managementInfo.getManagement_type() : null) != ManagementType.MANAGED) {
                        arrayList.add(t);
                    }
                }
                return arrayList;
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementOnboardingContributionDuxo.onCreate$lambda$3(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit onCreate$lambda$3(RetirementOnboardingContributionDuxo retirementOnboardingContributionDuxo, List list) {
        Object next;
        Intrinsics.checkNotNull(list);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            TransferAccount transferAccount = (TransferAccount) next;
            if (transferAccount.getType() == ApiTransferAccount.TransferAccountType.ACH) {
                String str = retirementOnboardingContributionDuxo.defaultAchRelationshipPref.get();
                boolean z = true;
                if (!(str != null ? Intrinsics.areEqual(str, transferAccount.getAccountId()) : true)) {
                    z = false;
                }
                if (z) {
                    break;
                }
            }
        }
        retirementOnboardingContributionDuxo.applyMutation(new RetirementOnboardingContributionDuxo2((TransferAccount) next, list, null));
        return Unit.INSTANCE;
    }

    /* compiled from: RetirementOnboardingContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionDuxo$onChipPressed$1", m3645f = "RetirementOnboardingContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionDuxo$onChipPressed$1 */
    static final class C90561 extends ContinuationImpl7 implements Function2<RetirementOnboardingContributionDataState, Continuation<? super RetirementOnboardingContributionDataState>, Object> {
        final /* synthetic */ KeypadChip $chip;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C90561(KeypadChip keypadChip, Continuation<? super C90561> continuation) {
            super(2, continuation);
            this.$chip = keypadChip;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C90561 c90561 = new C90561(this.$chip, continuation);
            c90561.L$0 = obj;
            return c90561;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RetirementOnboardingContributionDataState retirementOnboardingContributionDataState, Continuation<? super RetirementOnboardingContributionDataState> continuation) {
            return ((C90561) create(retirementOnboardingContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RetirementOnboardingContributionDataState.copy$default((RetirementOnboardingContributionDataState) this.L$0, null, null, null, null, false, this.$chip.getValue().getDecimalValue(), null, null, null, false, null, 1999, null);
        }
    }

    public final void onChipPressed(KeypadChip chip) {
        Intrinsics.checkNotNullParameter(chip, "chip");
        applyMutation(new C90561(chip, null));
    }

    /* compiled from: RetirementOnboardingContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionDuxo$consumeKeyEvent$1", m3645f = "RetirementOnboardingContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionDuxo$consumeKeyEvent$1 */
    static final class C90541 extends ContinuationImpl7 implements Function2<RetirementOnboardingContributionDataState, Continuation<? super RetirementOnboardingContributionDataState>, Object> {
        final /* synthetic */ KeyEvent $keyEvent;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C90541(KeyEvent keyEvent, Continuation<? super C90541> continuation) {
            super(2, continuation);
            this.$keyEvent = keyEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C90541 c90541 = new C90541(this.$keyEvent, continuation);
            c90541.L$0 = obj;
            return c90541;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RetirementOnboardingContributionDataState retirementOnboardingContributionDataState, Continuation<? super RetirementOnboardingContributionDataState> continuation) {
            return ((C90541) create(retirementOnboardingContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RetirementOnboardingContributionDataState retirementOnboardingContributionDataState = (RetirementOnboardingContributionDataState) this.L$0;
            DollarInputConsumer dollarInputConsumer = new DollarInputConsumer(ExtensionsKt.getAmountRemainingUntilLimit(retirementOnboardingContributionDataState.getActiveContributionYear()), true);
            BigDecimal userInputAmount = retirementOnboardingContributionDataState.getUserInputAmount();
            char[] charArray = retirementOnboardingContributionDataState.getUserInputString().toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            return RetirementOnboardingContributionDataState.copy$default(retirementOnboardingContributionDataState, null, null, null, null, false, dollarInputConsumer.consume(new InputKeyEventConsumer.InputState(userInputAmount, charArray), this.$keyEvent).component1(), null, null, null, false, null, 2015, null);
        }
    }

    public final void consumeKeyEvent(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        applyMutation(new C90541(keyEvent, null));
    }

    /* compiled from: RetirementOnboardingContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionDuxo$onEditContinueClicked$1", m3645f = "RetirementOnboardingContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionDuxo$onEditContinueClicked$1 */
    static final class C90581 extends ContinuationImpl7 implements Function2<RetirementOnboardingContributionDataState, Continuation<? super RetirementOnboardingContributionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C90581(Continuation<? super C90581> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C90581 c90581 = new C90581(continuation);
            c90581.L$0 = obj;
            return c90581;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RetirementOnboardingContributionDataState retirementOnboardingContributionDataState, Continuation<? super RetirementOnboardingContributionDataState> continuation) {
            return ((C90581) create(retirementOnboardingContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RetirementOnboardingContributionDataState.copy$default((RetirementOnboardingContributionDataState) this.L$0, null, null, null, null, false, null, null, null, null, false, null, 2031, null);
        }
    }

    public final void onEditContinueClicked() {
        applyMutation(new C90581(null));
    }

    /* compiled from: RetirementOnboardingContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionDuxo$moveToEditMode$1", m3645f = "RetirementOnboardingContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionDuxo$moveToEditMode$1 */
    static final class C90551 extends ContinuationImpl7 implements Function2<RetirementOnboardingContributionDataState, Continuation<? super RetirementOnboardingContributionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C90551(Continuation<? super C90551> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C90551 c90551 = new C90551(continuation);
            c90551.L$0 = obj;
            return c90551;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RetirementOnboardingContributionDataState retirementOnboardingContributionDataState, Continuation<? super RetirementOnboardingContributionDataState> continuation) {
            return ((C90551) create(retirementOnboardingContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RetirementOnboardingContributionDataState.copy$default((RetirementOnboardingContributionDataState) this.L$0, null, null, null, null, true, null, null, null, null, false, null, 2031, null);
        }
    }

    public final void moveToEditMode() {
        applyMutation(new C90551(null));
    }

    /* compiled from: RetirementOnboardingContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionDuxo$setSourceAccount$1", m3645f = "RetirementOnboardingContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionDuxo$setSourceAccount$1 */
    static final class C90601 extends ContinuationImpl7 implements Function2<RetirementOnboardingContributionDataState, Continuation<? super RetirementOnboardingContributionDataState>, Object> {
        final /* synthetic */ TransferAccount $account;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C90601(TransferAccount transferAccount, Continuation<? super C90601> continuation) {
            super(2, continuation);
            this.$account = transferAccount;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C90601 c90601 = new C90601(this.$account, continuation);
            c90601.L$0 = obj;
            return c90601;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RetirementOnboardingContributionDataState retirementOnboardingContributionDataState, Continuation<? super RetirementOnboardingContributionDataState> continuation) {
            return ((C90601) create(retirementOnboardingContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RetirementOnboardingContributionDataState.copy$default((RetirementOnboardingContributionDataState) this.L$0, null, null, null, null, false, null, this.$account, null, null, false, null, 1983, null);
        }
    }

    public final void setSourceAccount(TransferAccount account) {
        applyMutation(new C90601(account, null));
    }

    /* compiled from: RetirementOnboardingContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionDuxo$setTaxYear$1", m3645f = "RetirementOnboardingContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionDuxo$setTaxYear$1 */
    static final class C90611 extends ContinuationImpl7 implements Function2<RetirementOnboardingContributionDataState, Continuation<? super RetirementOnboardingContributionDataState>, Object> {
        final /* synthetic */ Year $year;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C90611(Year year, Continuation<? super C90611> continuation) {
            super(2, continuation);
            this.$year = year;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C90611 c90611 = RetirementOnboardingContributionDuxo.this.new C90611(this.$year, continuation);
            c90611.L$0 = obj;
            return c90611;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RetirementOnboardingContributionDataState retirementOnboardingContributionDataState, Continuation<? super RetirementOnboardingContributionDataState> continuation) {
            return ((C90611) create(retirementOnboardingContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object next;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RetirementOnboardingContributionDataState retirementOnboardingContributionDataState = (RetirementOnboardingContributionDataState) this.L$0;
            List<ContributionYear> contributionYears = ((RetirementOnboardingContributionFragment.Args) RetirementOnboardingContributionDuxo.INSTANCE.getArgs((HasSavedState) RetirementOnboardingContributionDuxo.this)).getContributionYears();
            Year year = this.$year;
            Iterator<T> it = contributionYears.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ContributionYear contributionYear = (ContributionYear) next;
                if (year != null && contributionYear.getTaxYear() == year.getValue()) {
                    break;
                }
            }
            ContributionYear activeContributionYear = (ContributionYear) next;
            if (activeContributionYear == null) {
                activeContributionYear = retirementOnboardingContributionDataState.getActiveContributionYear();
            }
            return RetirementOnboardingContributionDataState.copy$default(retirementOnboardingContributionDataState, null, null, null, activeContributionYear, false, null, null, null, null, false, null, 2039, null);
        }
    }

    public final void setTaxYear(Year year) {
        applyMutation(new C90611(year, null));
    }

    /* compiled from: RetirementOnboardingContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionDuxo$setFrequency$1", m3645f = "RetirementOnboardingContributionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionDuxo$setFrequency$1 */
    static final class C90591 extends ContinuationImpl7 implements Function2<RetirementOnboardingContributionDataState, Continuation<? super RetirementOnboardingContributionDataState>, Object> {
        final /* synthetic */ ApiCreateTransferRequest2 $frequency;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C90591(ApiCreateTransferRequest2 apiCreateTransferRequest2, Continuation<? super C90591> continuation) {
            super(2, continuation);
            this.$frequency = apiCreateTransferRequest2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C90591 c90591 = new C90591(this.$frequency, continuation);
            c90591.L$0 = obj;
            return c90591;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RetirementOnboardingContributionDataState retirementOnboardingContributionDataState, Continuation<? super RetirementOnboardingContributionDataState> continuation) {
            return ((C90591) create(retirementOnboardingContributionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return RetirementOnboardingContributionDataState.copy$default((RetirementOnboardingContributionDataState) this.L$0, null, null, null, null, false, null, null, this.$frequency, null, false, null, 1919, null);
        }
    }

    public final void setFrequency(ApiCreateTransferRequest2 frequency) {
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        applyMutation(new C90591(frequency, null));
    }

    public final void onSubmitClicked() {
        withDataState(new Function1() { // from class: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RetirementOnboardingContributionDuxo.onSubmitClicked$lambda$4(this.f$0, (RetirementOnboardingContributionDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSubmitClicked$lambda$4(RetirementOnboardingContributionDuxo retirementOnboardingContributionDuxo, RetirementOnboardingContributionDataState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        TransferAccount sourceAccount = state.getSourceAccount();
        if (sourceAccount == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ContributionYear activeContributionYear = state.getActiveContributionYear();
        AdvisoryOnboardingStore advisoryOnboardingStore = retirementOnboardingContributionDuxo.onboardingStore;
        UUID applicationId = ((RetirementOnboardingContributionFragment.Args) INSTANCE.getArgs((HasSavedState) retirementOnboardingContributionDuxo)).getApplicationId();
        Money money = new Money(Currencies.USD, state.getUserInputAmount());
        ApiCreateTransferRequest2 frequency = state.getFrequency();
        Year yearM3433of = Year.m3433of(activeContributionYear.getTaxYear());
        Intrinsics.checkNotNullExpressionValue(yearM3433of, "of(...)");
        advisoryOnboardingStore.setFirstDepositConfig(applicationId, new AdvisoryFirstDepositConfig.Transfer.Retirement(money, sourceAccount, frequency, activeContributionYear.getContributionLimit(), yearM3433of, state.getCurrentPercentage()));
        retirementOnboardingContributionDuxo.submit(RetirementOnboardingContributionEvent.PushToAgreements.INSTANCE);
        return Unit.INSTANCE;
    }

    /* compiled from: RetirementOnboardingContributionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionDuxo;", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionFragment$Args;", "<init>", "()V", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<RetirementOnboardingContributionDuxo, RetirementOnboardingContributionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementOnboardingContributionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (RetirementOnboardingContributionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public RetirementOnboardingContributionFragment.Args getArgs(RetirementOnboardingContributionDuxo retirementOnboardingContributionDuxo) {
            return (RetirementOnboardingContributionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, retirementOnboardingContributionDuxo);
        }
    }
}
