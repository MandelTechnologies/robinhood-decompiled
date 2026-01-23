package com.robinhood.android.matcha.p177ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseDialogFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.models.p176ui.Transactor;
import com.robinhood.android.matcha.p177ui.amount.MatchaAmountInputFragment;
import com.robinhood.android.matcha.p177ui.common.HasPromptedUsernameUpdatePref;
import com.robinhood.android.matcha.p177ui.confirmation.ConfirmationType;
import com.robinhood.android.matcha.p177ui.confirmation.MatchaTransactionSuccessParentFragment;
import com.robinhood.android.matcha.p177ui.memo.MemoInputActivity;
import com.robinhood.android.matcha.p177ui.models.Direction;
import com.robinhood.android.matcha.p177ui.review.MatchaReviewTransactionFragment;
import com.robinhood.android.matcha.p177ui.review.multiuser.MatchaReviewMultiuserTransactionFragment;
import com.robinhood.android.matcha.p177ui.search.MatchaSearchFragment;
import com.robinhood.android.matcha.p177ui.username.UpdateUsernameFragment;
import com.robinhood.android.models.matcha.api.SourceOfFunds;
import com.robinhood.android.navigation.IntentResolverWithExtrasCompanion;
import com.robinhood.android.social.contracts.matcha.MatchaTransaction;
import com.robinhood.models.util.Money;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: MatchaTransferActivity.kt */
@Metadata(m3635d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 C2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0002BCB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0014J\u0010\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&H\u0016J\u001a\u0010'\u001a\u00020!2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0010\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020.H\u0016J\u0016\u0010/\u001a\u00020!2\f\u00100\u001a\b\u0012\u0004\u0012\u00020.01H\u0016J\u0010\u00102\u001a\u00020!2\u0006\u00103\u001a\u000204H\u0016J\u0018\u00105\u001a\u00020!2\u0006\u00103\u001a\u0002042\u0006\u00106\u001a\u00020.H\u0016J\b\u00107\u001a\u00020!H\u0016J\b\u00108\u001a\u000209H\u0002J\b\u0010:\u001a\u000209H\u0002J\u0010\u0010;\u001a\u0002092\u0006\u0010<\u001a\u00020=H\u0002R$\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u0014\n\u0000\u0012\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00128B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010>\u001a\u00020\u0012*\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006D"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/MatchaTransferActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/matcha/ui/amount/MatchaAmountInputFragment$Callbacks;", "Lcom/robinhood/android/matcha/ui/search/MatchaSearchFragment$Callbacks;", "Lcom/robinhood/android/matcha/ui/review/MatchaReviewTransactionFragment$Callbacks;", "Lcom/robinhood/android/matcha/ui/review/multiuser/MatchaReviewMultiuserTransactionFragment$Callbacks;", "Lcom/robinhood/android/matcha/ui/username/UpdateUsernameFragment$Callbacks;", "Lcom/robinhood/android/common/ui/BaseDialogFragment$OnDismissListener;", "<init>", "()V", "hasPromptedUsernameUpdatePref", "Lcom/robinhood/prefs/BooleanPreference;", "getHasPromptedUsernameUpdatePref$annotations", "getHasPromptedUsernameUpdatePref", "()Lcom/robinhood/prefs/BooleanPreference;", "setHasPromptedUsernameUpdatePref", "(Lcom/robinhood/prefs/BooleanPreference;)V", "<set-?>", "Lcom/robinhood/android/matcha/ui/MatchaTransferActivity$State;", "state", "getState", "()Lcom/robinhood/android/matcha/ui/MatchaTransferActivity$State;", "setState", "(Lcom/robinhood/android/matcha/ui/MatchaTransferActivity$State;)V", "state$delegate", "Lkotlin/properties/ReadWriteProperty;", "direction", "Lcom/robinhood/android/matcha/ui/models/Direction;", "getDirection", "()Lcom/robinhood/android/matcha/ui/models/Direction;", "direction$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDialogDismissed", "id", "", "onAmountEntered", "amount", "Lcom/robinhood/models/util/Money;", "sourceOfFunds", "Lcom/robinhood/android/models/matcha/api/SourceOfFunds;", "onAddTransactors", "existingTransactor", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "onSearchResultSelected", "transactors", "", "onTransactionSuccess", "confirmationType", "Lcom/robinhood/android/matcha/ui/confirmation/ConfirmationType;", "onTransactionSent", "transactor", "onUsernameUpdateComplete", "getFlowEntranceFragment", "Lcom/robinhood/android/common/ui/BaseFragment;", "getStartFragment", "getReviewFragment", "nextState", "Lcom/robinhood/android/matcha/ui/MatchaTransferActivity$State$ReadyForReview;", "initialState", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction;", "getInitialState", "(Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction;)Lcom/robinhood/android/matcha/ui/MatchaTransferActivity$State;", "State", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class MatchaTransferActivity extends BaseActivity implements MatchaAmountInputFragment.Callbacks, MatchaSearchFragment.Callbacks, MatchaReviewTransactionFragment.Callbacks, MatchaReviewMultiuserTransactionFragment.Callbacks, UpdateUsernameFragment.Callbacks, BaseDialogFragment.OnDismissListener {

    /* renamed from: direction$delegate, reason: from kotlin metadata */
    private final Lazy direction;
    public BooleanPreference hasPromptedUsernameUpdatePref;

    /* renamed from: state$delegate, reason: from kotlin metadata */
    private final Interfaces3 state;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(MatchaTransferActivity.class, "state", "getState()Lcom/robinhood/android/matcha/ui/MatchaTransferActivity$State;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MatchaTransferActivity.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MatchaTransaction.Direction.values().length];
            try {
                iArr[MatchaTransaction.Direction.SEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MatchaTransaction.Direction.REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @HasPromptedUsernameUpdatePref
    public static /* synthetic */ void getHasPromptedUsernameUpdatePref$annotations() {
    }

    public MatchaTransferActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.state = (Interfaces3) BindSavedState2.savedParcelable(this, State.Empty.INSTANCE).provideDelegate(this, $$delegatedProperties[0]);
        this.direction = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.matcha.ui.MatchaTransferActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MatchaTransferActivity.direction_delegate$lambda$0(this.f$0);
            }
        });
    }

    public final BooleanPreference getHasPromptedUsernameUpdatePref() {
        BooleanPreference booleanPreference = this.hasPromptedUsernameUpdatePref;
        if (booleanPreference != null) {
            return booleanPreference;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hasPromptedUsernameUpdatePref");
        return null;
    }

    public final void setHasPromptedUsernameUpdatePref(BooleanPreference booleanPreference) {
        Intrinsics.checkNotNullParameter(booleanPreference, "<set-?>");
        this.hasPromptedUsernameUpdatePref = booleanPreference;
    }

    private final State getState() {
        return (State) this.state.getValue(this, $$delegatedProperties[0]);
    }

    private final void setState(State state) {
        this.state.setValue(this, $$delegatedProperties[0], state);
    }

    private final Direction getDirection() {
        return (Direction) this.direction.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Direction direction_delegate$lambda$0(MatchaTransferActivity matchaTransferActivity) {
        int i = WhenMappings.$EnumSwitchMapping$0[((MatchaTransaction) INSTANCE.getExtras((Activity) matchaTransferActivity)).getDirection().ordinal()];
        if (i == 1) {
            return Direction.SEND;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return Direction.REQUEST;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), AchromaticOverlay.INSTANCE, null, 2, null);
        if (Intrinsics.areEqual(getState(), State.Empty.INSTANCE)) {
            setState(getInitialState((MatchaTransaction) INSTANCE.getExtras((Activity) this)));
        }
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, getStartFragment());
        }
    }

    @Override // com.robinhood.android.common.ui.BaseDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C21284R.id.dialog_id_matcha_restriction_error) {
            finish();
        }
    }

    @Override // com.robinhood.android.matcha.ui.amount.MatchaAmountInputFragment.Callbacks
    public void onAmountEntered(Money amount, SourceOfFunds sourceOfFunds) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        setState(new State.AmountEntered(amount, sourceOfFunds));
        replaceFragment(MatchaSearchFragment.INSTANCE.newInstance((Parcelable) new MatchaSearchFragment.Args(false, null, getDirection(), amount, ((MatchaTransaction) INSTANCE.getExtras((Activity) this)).getEntryPoint(), sourceOfFunds, 2, null)));
    }

    @Override // com.robinhood.android.matcha.ui.amount.MatchaAmountInputFragment.Callbacks
    public void onAddTransactors(Transactor existingTransactor) {
        Intrinsics.checkNotNullParameter(existingTransactor, "existingTransactor");
        State state = getState();
        if (state instanceof State.AmountEntered) {
            State.AmountEntered amountEntered = (State.AmountEntered) state;
            Tuples2 tuples2M3642to = Tuples4.m3642to(amountEntered.getAmount(), amountEntered.getSourceOfFunds());
            replaceFragment(MatchaSearchFragment.INSTANCE.newInstance((Parcelable) new MatchaSearchFragment.Args(true, existingTransactor, getDirection(), (Money) tuples2M3642to.component1(), ((MatchaTransaction) INSTANCE.getExtras((Activity) this)).getEntryPoint(), (SourceOfFunds) tuples2M3642to.component2())));
            return;
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(state);
        throw new ExceptionsH();
    }

    @Override // com.robinhood.android.matcha.ui.search.MatchaSearchFragment.Callbacks
    public void onSearchResultSelected(List<? extends Transactor> transactors) {
        Tuples2 tuples2M3642to;
        Intrinsics.checkNotNullParameter(transactors, "transactors");
        State state = getState();
        if (state instanceof State.AmountEntered) {
            State.AmountEntered amountEntered = (State.AmountEntered) state;
            tuples2M3642to = Tuples4.m3642to(amountEntered.getAmount(), amountEntered.getSourceOfFunds());
        } else {
            if (!(state instanceof State.ReadyForReview)) {
                Preconditions.INSTANCE.failUnexpectedItemKotlin(state);
                throw new ExceptionsH();
            }
            State.ReadyForReview readyForReview = (State.ReadyForReview) state;
            tuples2M3642to = Tuples4.m3642to(readyForReview.getAmount(), readyForReview.getSourceOfFunds());
        }
        setState(new State.ReadyForReview((Money) tuples2M3642to.component1(), transactors, (SourceOfFunds) tuples2M3642to.component2(), null, null, 24, null));
        State state2 = getState();
        Intrinsics.checkNotNull(state2, "null cannot be cast to non-null type com.robinhood.android.matcha.ui.MatchaTransferActivity.State.ReadyForReview");
        replaceFragment(getReviewFragment((State.ReadyForReview) state2));
    }

    @Override // com.robinhood.android.matcha.ui.review.MatchaReviewTransactionFragment.Callbacks, com.robinhood.android.matcha.ui.review.multiuser.MatchaReviewMultiuserTransactionFragment.Callbacks
    public void onTransactionSuccess(ConfirmationType confirmationType) {
        Intrinsics.checkNotNullParameter(confirmationType, "confirmationType");
        MatchaTransactionSuccessParentFragment.Companion companion = MatchaTransactionSuccessParentFragment.INSTANCE;
        Direction direction = getDirection();
        State state = getState();
        State.ReadyForReview readyForReview = state instanceof State.ReadyForReview ? (State.ReadyForReview) state : null;
        replaceFragment(companion.newInstance((Parcelable) new MatchaTransactionSuccessParentFragment.Args(confirmationType, direction, readyForReview != null ? readyForReview.getTransactors() : null, ((MatchaTransaction) INSTANCE.getExtras((Activity) this)).getEntryPoint())));
    }

    @Override // com.robinhood.android.matcha.ui.search.MatchaSearchFragment.Callbacks
    public void onTransactionSent(ConfirmationType confirmationType, Transactor transactor) {
        Intrinsics.checkNotNullParameter(confirmationType, "confirmationType");
        Intrinsics.checkNotNullParameter(transactor, "transactor");
        replaceFragment(MatchaTransactionSuccessParentFragment.INSTANCE.newInstance((Parcelable) new MatchaTransactionSuccessParentFragment.Args(confirmationType, getDirection(), CollectionsKt.listOf(transactor), ((MatchaTransaction) INSTANCE.getExtras((Activity) this)).getEntryPoint())));
    }

    @Override // com.robinhood.android.matcha.ui.username.UpdateUsernameFragment.Callbacks
    public void onUsernameUpdateComplete() {
        replaceFragment(getFlowEntranceFragment());
    }

    private final BaseFragment getFlowEntranceFragment() {
        return (BaseFragment) MatchaAmountInputFragment.INSTANCE.newInstance((Parcelable) new MatchaAmountInputFragment.Args(false, null, getDirection(), ((MatchaTransaction) INSTANCE.getExtras((Activity) this)).getEntryPoint(), 2, null));
    }

    private final BaseFragment getStartFragment() {
        if (getState() instanceof State.ReadyForReview) {
            State state = getState();
            Intrinsics.checkNotNull(state, "null cannot be cast to non-null type com.robinhood.android.matcha.ui.MatchaTransferActivity.State.ReadyForReview");
            return getReviewFragment((State.ReadyForReview) state);
        }
        if (getHasPromptedUsernameUpdatePref().get()) {
            return getFlowEntranceFragment();
        }
        return new UpdateUsernameFragment();
    }

    private final BaseFragment getReviewFragment(State.ReadyForReview nextState) {
        if (nextState.getTransactors().size() > 1) {
            return (BaseFragment) MatchaReviewMultiuserTransactionFragment.INSTANCE.newInstance((Parcelable) new MatchaReviewMultiuserTransactionFragment.Args(nextState.getAmount(), nextState.getTransactors(), getDirection(), nextState.getSourceOfFunds(), null, null, ((MatchaTransaction) INSTANCE.getExtras((Activity) this)).getEntryPoint(), 48, null));
        }
        return (BaseFragment) MatchaReviewTransactionFragment.INSTANCE.newInstance((Parcelable) new MatchaReviewTransactionFragment.Args(nextState.getAmount(), (Transactor) CollectionsKt.first((List) nextState.getTransactors()), getDirection(), nextState.getSourceOfFunds(), nextState.getRequestId(), null, ((MatchaTransaction) INSTANCE.getExtras((Activity) this)).getEntryPoint(), 32, null));
    }

    private final State getInitialState(MatchaTransaction matchaTransaction) {
        if (matchaTransaction instanceof MatchaTransaction.Create) {
            return State.Empty.INSTANCE;
        }
        if (matchaTransaction instanceof MatchaTransaction.Review) {
            MatchaTransaction.Review review = (MatchaTransaction.Review) matchaTransaction;
            Money amount = review.getAmount();
            if (amount != null) {
                return new State.ReadyForReview(amount, CollectionsKt.listOf(review.getTransactor()), null, null, null, 28, null);
            }
            return new State.TransactorSelected(CollectionsKt.listOf(review.getTransactor()));
        }
        if (!(matchaTransaction instanceof MatchaTransaction.ReviewRequestPayment)) {
            throw new NoWhenBranchMatchedException();
        }
        MatchaTransaction.ReviewRequestPayment reviewRequestPayment = (MatchaTransaction.ReviewRequestPayment) matchaTransaction;
        return new State.ReadyForReview(reviewRequestPayment.getAmount(), CollectionsKt.listOf(reviewRequestPayment.getTransactor()), null, reviewRequestPayment.getRequestId(), reviewRequestPayment.getMemo(), 4, null);
    }

    /* compiled from: MatchaTransferActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/MatchaTransferActivity$State;", "Landroid/os/Parcelable;", "<init>", "()V", "Empty", "AmountEntered", "TransactorSelected", "ReadyForReview", "Lcom/robinhood/android/matcha/ui/MatchaTransferActivity$State$AmountEntered;", "Lcom/robinhood/android/matcha/ui/MatchaTransferActivity$State$Empty;", "Lcom/robinhood/android/matcha/ui/MatchaTransferActivity$State$ReadyForReview;", "Lcom/robinhood/android/matcha/ui/MatchaTransferActivity$State$TransactorSelected;", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class State implements Parcelable {
        public static final int $stable = 0;

        public /* synthetic */ State(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private State() {
        }

        /* compiled from: MatchaTransferActivity.kt */
        @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/MatchaTransferActivity$State$Empty;", "Lcom/robinhood/android/matcha/ui/MatchaTransferActivity$State;", "<init>", "()V", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Empty extends State {
            public static final int $stable = 0;
            public static final Empty INSTANCE = new Empty();
            public static final Parcelable.Creator<Empty> CREATOR = new Creator();

            /* compiled from: MatchaTransferActivity.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<Empty> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Empty createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Empty.INSTANCE;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final Empty[] newArray(int i) {
                    return new Empty[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }

            private Empty() {
                super(null);
            }
        }

        /* compiled from: MatchaTransferActivity.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/MatchaTransferActivity$State$AmountEntered;", "Lcom/robinhood/android/matcha/ui/MatchaTransferActivity$State;", "amount", "Lcom/robinhood/models/util/Money;", "sourceOfFunds", "Lcom/robinhood/android/models/matcha/api/SourceOfFunds;", "<init>", "(Lcom/robinhood/models/util/Money;Lcom/robinhood/android/models/matcha/api/SourceOfFunds;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getSourceOfFunds", "()Lcom/robinhood/android/models/matcha/api/SourceOfFunds;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class AmountEntered extends State {
            public static final int $stable = 8;
            public static final Parcelable.Creator<AmountEntered> CREATOR = new Creator();
            private final Money amount;
            private final SourceOfFunds sourceOfFunds;

            /* compiled from: MatchaTransferActivity.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<AmountEntered> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AmountEntered createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new AmountEntered((Money) parcel.readParcelable(AmountEntered.class.getClassLoader()), (SourceOfFunds) parcel.readParcelable(AmountEntered.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final AmountEntered[] newArray(int i) {
                    return new AmountEntered[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.amount, flags);
                dest.writeParcelable(this.sourceOfFunds, flags);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AmountEntered(Money amount, SourceOfFunds sourceOfFunds) {
                super(null);
                Intrinsics.checkNotNullParameter(amount, "amount");
                this.amount = amount;
                this.sourceOfFunds = sourceOfFunds;
            }

            public final Money getAmount() {
                return this.amount;
            }

            public final SourceOfFunds getSourceOfFunds() {
                return this.sourceOfFunds;
            }
        }

        /* compiled from: MatchaTransferActivity.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/MatchaTransferActivity$State$TransactorSelected;", "Lcom/robinhood/android/matcha/ui/MatchaTransferActivity$State;", "transactors", "", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "<init>", "(Ljava/util/List;)V", "getTransactors", "()Ljava/util/List;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class TransactorSelected extends State {
            public static final int $stable = 8;
            public static final Parcelable.Creator<TransactorSelected> CREATOR = new Creator();
            private final List<Transactor> transactors;

            /* compiled from: MatchaTransferActivity.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<TransactorSelected> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TransactorSelected createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(parcel.readParcelable(TransactorSelected.class.getClassLoader()));
                    }
                    return new TransactorSelected(arrayList);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final TransactorSelected[] newArray(int i) {
                    return new TransactorSelected[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                List<Transactor> list = this.transactors;
                dest.writeInt(list.size());
                Iterator<Transactor> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public TransactorSelected(List<? extends Transactor> transactors) {
                super(null);
                Intrinsics.checkNotNullParameter(transactors, "transactors");
                this.transactors = transactors;
            }

            public final List<Transactor> getTransactors() {
                return this.transactors;
            }
        }

        /* compiled from: MatchaTransferActivity.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/MatchaTransferActivity$State$ReadyForReview;", "Lcom/robinhood/android/matcha/ui/MatchaTransferActivity$State;", "amount", "Lcom/robinhood/models/util/Money;", "transactors", "", "Lcom/robinhood/android/matcha/models/ui/Transactor;", "sourceOfFunds", "Lcom/robinhood/android/models/matcha/api/SourceOfFunds;", "requestId", "Ljava/util/UUID;", MemoInputActivity.EXTRA_MEMO, "", "<init>", "(Lcom/robinhood/models/util/Money;Ljava/util/List;Lcom/robinhood/android/models/matcha/api/SourceOfFunds;Ljava/util/UUID;Ljava/lang/String;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getTransactors", "()Ljava/util/List;", "getSourceOfFunds", "()Lcom/robinhood/android/models/matcha/api/SourceOfFunds;", "getRequestId", "()Ljava/util/UUID;", "getMemo", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class ReadyForReview extends State {
            public static final int $stable = 8;
            public static final Parcelable.Creator<ReadyForReview> CREATOR = new Creator();
            private final Money amount;
            private final String memo;
            private final UUID requestId;
            private final SourceOfFunds sourceOfFunds;
            private final List<Transactor> transactors;

            /* compiled from: MatchaTransferActivity.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Creator implements Parcelable.Creator<ReadyForReview> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ReadyForReview createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    Money money = (Money) parcel.readParcelable(ReadyForReview.class.getClassLoader());
                    int i = parcel.readInt();
                    ArrayList arrayList = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList.add(parcel.readParcelable(ReadyForReview.class.getClassLoader()));
                    }
                    return new ReadyForReview(money, arrayList, (SourceOfFunds) parcel.readParcelable(ReadyForReview.class.getClassLoader()), (UUID) parcel.readSerializable(), parcel.readString());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                public final ReadyForReview[] newArray(int i) {
                    return new ReadyForReview[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.amount, flags);
                List<Transactor> list = this.transactors;
                dest.writeInt(list.size());
                Iterator<Transactor> it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable(it.next(), flags);
                }
                dest.writeParcelable(this.sourceOfFunds, flags);
                dest.writeSerializable(this.requestId);
                dest.writeString(this.memo);
            }

            public /* synthetic */ ReadyForReview(Money money, List list, SourceOfFunds sourceOfFunds, UUID uuid, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(money, list, (i & 4) != 0 ? null : sourceOfFunds, (i & 8) != 0 ? null : uuid, (i & 16) != 0 ? null : str);
            }

            public final Money getAmount() {
                return this.amount;
            }

            public final List<Transactor> getTransactors() {
                return this.transactors;
            }

            public final SourceOfFunds getSourceOfFunds() {
                return this.sourceOfFunds;
            }

            public final UUID getRequestId() {
                return this.requestId;
            }

            public final String getMemo() {
                return this.memo;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public ReadyForReview(Money amount, List<? extends Transactor> transactors, SourceOfFunds sourceOfFunds, UUID uuid, String str) {
                super(null);
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(transactors, "transactors");
                this.amount = amount;
                this.transactors = transactors;
                this.sourceOfFunds = sourceOfFunds;
                this.requestId = uuid;
                this.memo = str;
            }
        }
    }

    /* compiled from: MatchaTransferActivity.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/MatchaTransferActivity$Companion;", "Lcom/robinhood/android/navigation/IntentResolverWithExtrasCompanion;", "Lcom/robinhood/android/matcha/ui/MatchaTransferActivity;", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements IntentResolverWithExtrasCompanion<MatchaTransferActivity, MatchaTransaction> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion
        public MatchaTransaction getExtras(MatchaTransferActivity matchaTransferActivity) {
            return (MatchaTransaction) IntentResolverWithExtrasCompanion.DefaultImpls.getExtras(this, matchaTransferActivity);
        }

        @Override // com.robinhood.android.navigation.IntentResolver
        public Intent getIntent(Context context, MatchaTransaction matchaTransaction) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntent(this, context, matchaTransaction);
        }

        @Override // com.robinhood.utils.p409ui.activity.ActivityCompanion3
        public Intent getIntentWithExtras(Context context, MatchaTransaction matchaTransaction) {
            return IntentResolverWithExtrasCompanion.DefaultImpls.getIntentWithExtras(this, context, matchaTransaction);
        }
    }
}
