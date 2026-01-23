package com.robinhood.android.mcduckling.card.help.p179ui;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.mcduckling.card.help.C21627R;
import com.robinhood.android.mcduckling.card.help.databinding.FragmentCardReplacementConfirmationBinding;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: CardReplacementConfirmationFragment.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementConfirmationFragment;", "Lcom/robinhood/android/mcduckling/card/help/ui/BaseCardHelpFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementConfirmationDuxo;", "getDuxo", "()Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementConfirmationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/mcduckling/card/help/databinding/FragmentCardReplacementConfirmationBinding;", "getBinding", "()Lcom/robinhood/android/mcduckling/card/help/databinding/FragmentCardReplacementConfirmationBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onStart", "", "bind", "state", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementConfirmationViewState;", "onBackPressed", "", "Args", "Companion", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CardReplacementConfirmationFragment extends BaseCardHelpFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CardReplacementConfirmationFragment.class, "binding", "getBinding()Lcom/robinhood/android/mcduckling/card/help/databinding/FragmentCardReplacementConfirmationBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public CardReplacementConfirmationFragment() {
        super(C21627R.layout.fragment_card_replacement_confirmation);
        this.duxo = OldDuxos.oldDuxo(this, CardReplacementConfirmationDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, CardReplacementConfirmationFragment2.INSTANCE);
    }

    private final CardReplacementConfirmationDuxo getDuxo() {
        return (CardReplacementConfirmationDuxo) this.duxo.getValue();
    }

    private final FragmentCardReplacementConfirmationBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentCardReplacementConfirmationBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Observable<CardReplacementConfirmationViewState> observableDistinctUntilChanged = getDuxo().getStates().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C216411(this));
    }

    /* compiled from: CardReplacementConfirmationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.mcduckling.card.help.ui.CardReplacementConfirmationFragment$onStart$1 */
    /* synthetic */ class C216411 extends FunctionReferenceImpl implements Function1<CardReplacementConfirmationViewState, Unit> {
        C216411(Object obj) {
            super(1, obj, CardReplacementConfirmationFragment.class, "bind", "bind(Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementConfirmationViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CardReplacementConfirmationViewState cardReplacementConfirmationViewState) {
            invoke2(cardReplacementConfirmationViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CardReplacementConfirmationViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CardReplacementConfirmationFragment) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final CardReplacementConfirmationViewState state) {
        RhTextView rhTextView = getBinding().cardReplacementConfirmationSubtitle;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        rhTextView.setText(state.getSubtitle(contextRequireContext));
        RdsButton rdsButton = getBinding().doneButton;
        rdsButton.setText(getString(state.getDoneButtonTextResId()));
        Intrinsics.checkNotNull(rdsButton);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardReplacementConfirmationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardReplacementConfirmationFragment.bind$lambda$1$lambda$0(state, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$1$lambda$0(CardReplacementConfirmationViewState cardReplacementConfirmationViewState, CardReplacementConfirmationFragment cardReplacementConfirmationFragment) {
        if (cardReplacementConfirmationViewState.isCardEligibleForGooglePay()) {
            cardReplacementConfirmationFragment.getCallbacks().proceed(CardAddToGooglePayFragment.INSTANCE.newInstance());
        } else {
            cardReplacementConfirmationFragment.requireActivity().finish();
        }
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }

    /* compiled from: CardReplacementConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementConfirmationFragment$Args;", "Landroid/os/Parcelable;", "cardId", "Ljava/util/UUID;", "type", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementType;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementType;)V", "getCardId", "()Ljava/util/UUID;", "getType", "()Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementType;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID cardId;
        private final CardReplacementType type;

        /* compiled from: CardReplacementConfirmationFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable(), CardReplacementType.valueOf(parcel.readString()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.cardId);
            dest.writeString(this.type.name());
        }

        public Args(UUID cardId, CardReplacementType type2) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(type2, "type");
            this.cardId = cardId;
            this.type = type2;
        }

        public final UUID getCardId() {
            return this.cardId;
        }

        public final CardReplacementType getType() {
            return this.type;
        }
    }

    /* compiled from: CardReplacementConfirmationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementConfirmationFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementConfirmationFragment;", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementConfirmationFragment$Args;", "<init>", "()V", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CardReplacementConfirmationFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CardReplacementConfirmationFragment cardReplacementConfirmationFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cardReplacementConfirmationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CardReplacementConfirmationFragment newInstance(Args args) {
            return (CardReplacementConfirmationFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CardReplacementConfirmationFragment cardReplacementConfirmationFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cardReplacementConfirmationFragment, args);
        }
    }
}
