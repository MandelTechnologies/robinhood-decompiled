package com.robinhood.android.mcduckling.card.help.p179ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.mcduckling.card.help.C21627R;
import com.robinhood.android.mcduckling.card.help.databinding.FragmentCardHelpIntroBinding;
import com.robinhood.android.mcduckling.card.help.p179ui.CardHelpInterstitialFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
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

/* compiled from: CardHelpIntroFragment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0016J\u0010\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpIntroFragment;", "Lcom/robinhood/android/mcduckling/card/help/ui/BaseCardHelpFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpIntroDuxo;", "getDuxo", "()Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpIntroDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/mcduckling/card/help/databinding/FragmentCardHelpIntroBinding;", "getBinding", "()Lcom/robinhood/android/mcduckling/card/help/databinding/FragmentCardHelpIntroBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "bind", "state", "Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpIntroViewState;", "Args", "Companion", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CardHelpIntroFragment extends BaseCardHelpFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CardHelpIntroFragment.class, "binding", "getBinding()Lcom/robinhood/android/mcduckling/card/help/databinding/FragmentCardHelpIntroBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public CardHelpIntroFragment() {
        super(C21627R.layout.fragment_card_help_intro);
        this.duxo = OldDuxos.oldDuxo(this, CardHelpIntroDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, CardHelpIntroFragment2.INSTANCE);
    }

    private final CardHelpIntroDuxo getDuxo() {
        return (CardHelpIntroDuxo) this.duxo.getValue();
    }

    private final FragmentCardHelpIntroBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentCardHelpIntroBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsRowView cardHelpIntroReportOtherView = getBinding().cardHelpIntroReportOtherView;
        Intrinsics.checkNotNullExpressionValue(cardHelpIntroReportOtherView, "cardHelpIntroReportOtherView");
        OnClickListeners.onClick(cardHelpIntroReportOtherView, new Function0() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardHelpIntroFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardHelpIntroFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(CardHelpIntroFragment cardHelpIntroFragment) {
        Navigator navigator = cardHelpIntroFragment.getNavigator();
        Context contextRequireContext = cardHelpIntroFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigators3.showContactSupportTriageFragment$default(navigator, contextRequireContext, ((Args) INSTANCE.getArgs((Fragment) cardHelpIntroFragment)).getGenericTopicId(), false, 4, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Observable<CardHelpIntroViewState> observableDistinctUntilChanged = getDuxo().getStates().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C216371(this));
    }

    /* compiled from: CardHelpIntroFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.mcduckling.card.help.ui.CardHelpIntroFragment$onStart$1 */
    /* synthetic */ class C216371 extends FunctionReferenceImpl implements Function1<CardHelpIntroViewState, Unit> {
        C216371(Object obj) {
            super(1, obj, CardHelpIntroFragment.class, "bind", "bind(Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpIntroViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CardHelpIntroViewState cardHelpIntroViewState) {
            invoke2(cardHelpIntroViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CardHelpIntroViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CardHelpIntroFragment) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final CardHelpIntroViewState state) {
        getBinding().cardHelpIntroSubheader.setText(state.getSubHeaderTextResId());
        RdsRowView rdsRowView = getBinding().cardHelpIntroReportDamagedView;
        Intrinsics.checkNotNull(rdsRowView);
        rdsRowView.setVisibility(state.isReportDamagedVisible() ? 0 : 8);
        OnClickListeners.onClick(rdsRowView, new Function0() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardHelpIntroFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardHelpIntroFragment.bind$lambda$2$lambda$1(this.f$0, state);
            }
        });
        RdsRowView rdsRowView2 = getBinding().cardHelpIntroReportLostView;
        Intrinsics.checkNotNull(rdsRowView2);
        rdsRowView2.setVisibility(state.isReportLostVisible() ? 0 : 8);
        OnClickListeners.onClick(rdsRowView2, new Function0() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardHelpIntroFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardHelpIntroFragment.bind$lambda$4$lambda$3(this.f$0, state);
            }
        });
        RdsRowView rdsRowView3 = getBinding().cardHelpIntroReportStolenView;
        Intrinsics.checkNotNull(rdsRowView3);
        rdsRowView3.setVisibility(state.isReportStolenVisible() ? 0 : 8);
        OnClickListeners.onClick(rdsRowView3, new Function0() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardHelpIntroFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardHelpIntroFragment.bind$lambda$6$lambda$5(this.f$0, state);
            }
        });
        RdsRowView cardHelpIntroDisputeTransactionsView = getBinding().cardHelpIntroDisputeTransactionsView;
        Intrinsics.checkNotNullExpressionValue(cardHelpIntroDisputeTransactionsView, "cardHelpIntroDisputeTransactionsView");
        OnClickListeners.onClick(cardHelpIntroDisputeTransactionsView, new Function0() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardHelpIntroFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardHelpIntroFragment.bind$lambda$7(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2$lambda$1(CardHelpIntroFragment cardHelpIntroFragment, CardHelpIntroViewState cardHelpIntroViewState) {
        cardHelpIntroFragment.getCallbacks().proceed((BaseFragment) CardHelpInterstitialFragment.INSTANCE.newInstance((Parcelable) new CardHelpInterstitialFragment.Args(cardHelpIntroViewState.getCardId(), CardReplacementType.DAMAGED)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$4$lambda$3(CardHelpIntroFragment cardHelpIntroFragment, CardHelpIntroViewState cardHelpIntroViewState) {
        cardHelpIntroFragment.getCallbacks().proceed((BaseFragment) CardHelpInterstitialFragment.INSTANCE.newInstance((Parcelable) new CardHelpInterstitialFragment.Args(cardHelpIntroViewState.getCardId(), CardReplacementType.LOST)));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$6$lambda$5(CardHelpIntroFragment cardHelpIntroFragment, CardHelpIntroViewState cardHelpIntroViewState) {
        cardHelpIntroFragment.getCallbacks().proceed((BaseFragment) CardHelpInterstitialFragment.INSTANCE.newInstance((Parcelable) new CardHelpInterstitialFragment.Args(cardHelpIntroViewState.getCardId(), cardHelpIntroViewState.getStolenType())));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$7(CardHelpIntroFragment cardHelpIntroFragment) {
        Navigator navigator = cardHelpIntroFragment.getNavigator();
        Context contextRequireContext = cardHelpIntroFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new LegacyIntentKey.DisputeCreation(null, 1, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    /* compiled from: CardHelpIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpIntroFragment$Args;", "Landroid/os/Parcelable;", "cardId", "Ljava/util/UUID;", "genericTopicId", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getCardId", "()Ljava/util/UUID;", "getGenericTopicId", "()Ljava/lang/String;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID cardId;
        private final String genericTopicId;

        /* compiled from: CardHelpIntroFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((UUID) parcel.readSerializable(), parcel.readString());
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
            dest.writeString(this.genericTopicId);
        }

        public Args(UUID cardId, String genericTopicId) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(genericTopicId, "genericTopicId");
            this.cardId = cardId;
            this.genericTopicId = genericTopicId;
        }

        public final UUID getCardId() {
            return this.cardId;
        }

        public final String getGenericTopicId() {
            return this.genericTopicId;
        }
    }

    /* compiled from: CardHelpIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpIntroFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpIntroFragment;", "Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpIntroFragment$Args;", "<init>", "()V", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CardHelpIntroFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CardHelpIntroFragment cardHelpIntroFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cardHelpIntroFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CardHelpIntroFragment newInstance(Args args) {
            return (CardHelpIntroFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CardHelpIntroFragment cardHelpIntroFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cardHelpIntroFragment, args);
        }
    }
}
