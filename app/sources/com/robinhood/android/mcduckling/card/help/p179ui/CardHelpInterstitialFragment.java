package com.robinhood.android.mcduckling.card.help.p179ui;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Breadcrumbs2;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumb;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbTracker2;
import com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbType;
import com.robinhood.android.mcduckling.card.help.C21627R;
import com.robinhood.android.mcduckling.card.help.databinding.FragmentCardHelpInterstitialBinding;
import com.robinhood.android.mcduckling.card.help.p179ui.CardHelpInterstitialViewState;
import com.robinhood.android.mcduckling.card.help.p179ui.CardShippingAddressFragment;
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

/* compiled from: CardHelpInterstitialFragment.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0002#$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J(\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0002J\u0010\u0010\"\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpInterstitialFragment;", "Lcom/robinhood/android/mcduckling/card/help/ui/BaseCardHelpFragment;", "Lcom/robinhood/android/lib/breadcrumbs/AutomaticBreadcrumbProvider;", "<init>", "()V", "duxo", "Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpInterstitialDuxo;", "getDuxo", "()Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpInterstitialDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/mcduckling/card/help/databinding/FragmentCardHelpInterstitialBinding;", "getBinding", "()Lcom/robinhood/android/mcduckling/card/help/databinding/FragmentCardHelpInterstitialBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "breadcrumb", "Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumb;", "getBreadcrumb", "()Lcom/robinhood/android/lib/breadcrumbs/SupportBreadcrumb;", "onStart", "", "bind", "state", "Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpInterstitialViewState;", "bindRow", "rowState", "Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpInterstitialViewState$CardHelpInterstitialRowInfo;", "pogView", "Lcom/robinhood/android/designsystem/pog/RdsPogView;", "titleTextView", "Landroid/widget/TextView;", "subtitleTextView", "onContinueButtonClick", "Args", "Companion", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CardHelpInterstitialFragment extends BaseCardHelpFragment implements SupportBreadcrumbTracker2 {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CardHelpInterstitialFragment.class, "binding", "getBinding()Lcom/robinhood/android/mcduckling/card/help/databinding/FragmentCardHelpInterstitialBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public CardHelpInterstitialFragment() {
        super(C21627R.layout.fragment_card_help_interstitial);
        this.duxo = OldDuxos.oldDuxo(this, CardHelpInterstitialDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, CardHelpInterstitialFragment2.INSTANCE);
    }

    private final CardHelpInterstitialDuxo getDuxo() {
        return (CardHelpInterstitialDuxo) this.duxo.getValue();
    }

    private final FragmentCardHelpInterstitialBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentCardHelpInterstitialBinding) value;
    }

    @Override // com.robinhood.android.lib.breadcrumbs.SupportBreadcrumbTracker2
    public SupportBreadcrumb getBreadcrumb() {
        return Breadcrumbs2.createBreadcrumb(this, SupportBreadcrumbType.CASH_DEBIT_CARD_REPORT, ((Args) INSTANCE.getArgs((Fragment) this)).getType());
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Observable<CardHelpInterstitialViewState> observableDistinctUntilChanged = getDuxo().getStates().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C216361(this));
    }

    /* compiled from: CardHelpInterstitialFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.mcduckling.card.help.ui.CardHelpInterstitialFragment$onStart$1 */
    /* synthetic */ class C216361 extends FunctionReferenceImpl implements Function1<CardHelpInterstitialViewState, Unit> {
        C216361(Object obj) {
            super(1, obj, CardHelpInterstitialFragment.class, "bind", "bind(Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpInterstitialViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CardHelpInterstitialViewState cardHelpInterstitialViewState) {
            invoke2(cardHelpInterstitialViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CardHelpInterstitialViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((CardHelpInterstitialFragment) this.receiver).bind(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(final CardHelpInterstitialViewState state) {
        getBinding().cardHelpImageView.setImageResource(state.getHeaderIconResId());
        getBinding().cardHelpTitleText.setText(state.getHeaderTextResId());
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        CardHelpInterstitialViewState.CardHelpInterstitialRowInfo cancellationRowInfo = state.getCancellationRowInfo(contextRequireContext);
        RdsPogView cancellationPog = getBinding().cancellationPog;
        Intrinsics.checkNotNullExpressionValue(cancellationPog, "cancellationPog");
        RhTextView cancellationTextTitle = getBinding().cancellationTextTitle;
        Intrinsics.checkNotNullExpressionValue(cancellationTextTitle, "cancellationTextTitle");
        RhTextView cancellationTextSubtitle = getBinding().cancellationTextSubtitle;
        Intrinsics.checkNotNullExpressionValue(cancellationTextSubtitle, "cancellationTextSubtitle");
        bindRow(cancellationRowInfo, cancellationPog, cancellationTextTitle, cancellationTextSubtitle);
        Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "requireContext(...)");
        CardHelpInterstitialViewState.CardHelpInterstitialRowInfo mailingRowInfo = state.getMailingRowInfo(contextRequireContext2);
        RdsPogView mailingPog = getBinding().mailingPog;
        Intrinsics.checkNotNullExpressionValue(mailingPog, "mailingPog");
        RhTextView mailingTextTitle = getBinding().mailingTextTitle;
        Intrinsics.checkNotNullExpressionValue(mailingTextTitle, "mailingTextTitle");
        RhTextView mailingTextSubtitle = getBinding().mailingTextSubtitle;
        Intrinsics.checkNotNullExpressionValue(mailingTextSubtitle, "mailingTextSubtitle");
        bindRow(mailingRowInfo, mailingPog, mailingTextTitle, mailingTextSubtitle);
        Context contextRequireContext3 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext3, "requireContext(...)");
        CardHelpInterstitialViewState.CardHelpInterstitialRowInfo newCardRowInfo = state.getNewCardRowInfo(contextRequireContext3);
        RdsPogView newCardPog = getBinding().newCardPog;
        Intrinsics.checkNotNullExpressionValue(newCardPog, "newCardPog");
        RhTextView newCardTextTitle = getBinding().newCardTextTitle;
        Intrinsics.checkNotNullExpressionValue(newCardTextTitle, "newCardTextTitle");
        RhTextView newCardTextSubtitle = getBinding().newCardTextSubtitle;
        Intrinsics.checkNotNullExpressionValue(newCardTextSubtitle, "newCardTextSubtitle");
        bindRow(newCardRowInfo, newCardPog, newCardTextTitle, newCardTextSubtitle);
        getBinding().getNewCardButton.setLoading(!state.isLoaded());
        RdsButton getNewCardButton = getBinding().getNewCardButton;
        Intrinsics.checkNotNullExpressionValue(getNewCardButton, "getNewCardButton");
        OnClickListeners.onClick(getNewCardButton, new Function0() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardHelpInterstitialFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardHelpInterstitialFragment.bind$lambda$0(this.f$0, state);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(CardHelpInterstitialFragment cardHelpInterstitialFragment, CardHelpInterstitialViewState cardHelpInterstitialViewState) {
        cardHelpInterstitialFragment.onContinueButtonClick(cardHelpInterstitialViewState);
        return Unit.INSTANCE;
    }

    private final void bindRow(CardHelpInterstitialViewState.CardHelpInterstitialRowInfo rowState, RdsPogView pogView, TextView titleTextView, TextView subtitleTextView) {
        pogView.setVisibility(rowState.isVisible() ? 0 : 8);
        titleTextView.setVisibility(rowState.isVisible() ? 0 : 8);
        subtitleTextView.setVisibility(rowState.isVisible() ? 0 : 8);
        pogView.setNumber(Integer.valueOf(rowState.getPogNumber()));
        titleTextView.setText(rowState.getTitleText());
        subtitleTextView.setText(rowState.getSubtitleText());
    }

    private final void onContinueButtonClick(CardHelpInterstitialViewState state) {
        UUID cardId = ((Args) INSTANCE.getArgs((Fragment) this)).getCardId();
        CardReplacementType replacementType = state.getReplacementType();
        if (state.isStolenVirtualReplacementType()) {
            getCallbacks().proceed(CardReplacementSubmissionFragment.INSTANCE.newInstance(new CardReplacementSubmissionDetails(cardId, replacementType, null, null, null, null, 60, null)));
        } else {
            getCallbacks().proceed((BaseFragment) CardShippingAddressFragment.INSTANCE.newInstance((Parcelable) new CardShippingAddressFragment.Args(cardId, replacementType)));
        }
    }

    /* compiled from: CardHelpInterstitialFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpInterstitialFragment$Args;", "Landroid/os/Parcelable;", "cardId", "Ljava/util/UUID;", "type", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementType;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementType;)V", "getCardId", "()Ljava/util/UUID;", "getType", "()Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementType;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID cardId;
        private final CardReplacementType type;

        /* compiled from: CardHelpInterstitialFragment.kt */
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

    /* compiled from: CardHelpInterstitialFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpInterstitialFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpInterstitialFragment;", "Lcom/robinhood/android/mcduckling/card/help/ui/CardHelpInterstitialFragment$Args;", "<init>", "()V", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CardHelpInterstitialFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CardHelpInterstitialFragment cardHelpInterstitialFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cardHelpInterstitialFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CardHelpInterstitialFragment newInstance(Args args) {
            return (CardHelpInterstitialFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CardHelpInterstitialFragment cardHelpInterstitialFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cardHelpInterstitialFragment, args);
        }
    }
}
