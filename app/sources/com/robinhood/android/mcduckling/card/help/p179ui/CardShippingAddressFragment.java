package com.robinhood.android.mcduckling.card.help.p179ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.p011ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.mcduckling.address.CardShippingAddress;
import com.robinhood.android.common.mcduckling.address.MailingAddress;
import com.robinhood.android.common.mcduckling.p084ui.callbacks.CardHelpCallbacks;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.p090rx.ErrorHandlers;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.mcduckling.card.help.C21627R;
import com.robinhood.android.mcduckling.card.help.databinding.FragmentCardShippingAddressBinding;
import com.robinhood.android.mcduckling.card.help.p179ui.CardReplacementSubmissionFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: CardShippingAddressFragment.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 &2\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0011H\u0016J)\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0002\u0010\u001eJ\"\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardShippingAddressFragment;", "Lcom/robinhood/android/mcduckling/card/help/ui/BaseCardHelpFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/mcduckling/card/help/ui/CardShippingAddressDuxo;", "getDuxo", "()Lcom/robinhood/android/mcduckling/card/help/ui/CardShippingAddressDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/mcduckling/card/help/databinding/FragmentCardShippingAddressBinding;", "getBinding", "()Lcom/robinhood/android/mcduckling/card/help/databinding/FragmentCardShippingAddressBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "confirmAddress", "mailingAddress", "Lcom/robinhood/android/common/mcduckling/address/MailingAddress;", "shippingAddressId", "Ljava/util/UUID;", "isBillingAddress", "", "(Lcom/robinhood/android/common/mcduckling/address/MailingAddress;Ljava/util/UUID;Ljava/lang/Boolean;)V", "onActivityResult", "requestCode", "", "resultCode", WebsocketGatewayConstants.DATA_KEY, "Landroid/content/Intent;", "Args", "Companion", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CardShippingAddressFragment extends BaseCardHelpFragment {
    private static final int REQUEST_CODE_CHOOSE_ADDRESS = 1;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CardShippingAddressFragment.class, "binding", "getBinding()Lcom/robinhood/android/mcduckling/card/help/databinding/FragmentCardShippingAddressBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public CardShippingAddressFragment() {
        super(C21627R.layout.fragment_card_shipping_address);
        this.duxo = OldDuxos.oldDuxo(this, CardShippingAddressDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, CardShippingAddressFragment2.INSTANCE);
    }

    private final CardShippingAddressDuxo getDuxo() {
        return (CardShippingAddressDuxo) this.duxo.getValue();
    }

    private final FragmentCardShippingAddressBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentCardShippingAddressBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsButton cardShippingChangeAddressBtn = getBinding().cardShippingChangeAddressBtn;
        Intrinsics.checkNotNullExpressionValue(cardShippingChangeAddressBtn, "cardShippingChangeAddressBtn");
        OnClickListeners.onClick(cardShippingChangeAddressBtn, new Function0() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardShippingAddressFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardShippingAddressFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        getBinding().cardShippingLoadingView.setContent(CardShippingAddressFragment3.INSTANCE.getLambda$864804783$feature_mcduckling_help_externalDebug());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(CardShippingAddressFragment cardShippingAddressFragment) {
        Navigator navigator = cardShippingAddressFragment.getNavigator();
        Context contextRequireContext = cardShippingAddressFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        cardShippingAddressFragment.startActivityForResult(Navigator.DefaultImpls.createIntent$default(navigator, contextRequireContext, LegacyIntentKey.SelectCardShippingAddress.INSTANCE, null, false, 12, null), 1);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardShippingAddressFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardShippingAddressFragment.onStart$lambda$6(this.f$0, (CardShippingAddressViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6(final CardShippingAddressFragment cardShippingAddressFragment, final CardShippingAddressViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        ComposeView cardShippingLoadingView = cardShippingAddressFragment.getBinding().cardShippingLoadingView;
        Intrinsics.checkNotNullExpressionValue(cardShippingLoadingView, "cardShippingLoadingView");
        boolean z = false;
        cardShippingLoadingView.setVisibility(state.isLoading() ? 0 : 8);
        cardShippingAddressFragment.getBinding().cardShippingTitleTxt.setText(cardShippingAddressFragment.getString(state.getTitleTextRes()));
        RhTextView rhTextView = cardShippingAddressFragment.getBinding().cardShippingSubtitleTxt;
        Intrinsics.checkNotNull(rhTextView);
        rhTextView.setVisibility(state.isSubtitleVisible() ? 0 : 8);
        Integer subtitleTextRes = state.getSubtitleTextRes();
        if (subtitleTextRes != null) {
            rhTextView.setText(cardShippingAddressFragment.getString(subtitleTextRes.intValue()));
        }
        RhTextView rhTextView2 = cardShippingAddressFragment.getBinding().cardShippingAddressTxt;
        Intrinsics.checkNotNull(rhTextView2);
        rhTextView2.setVisibility(state.isLoading() ? 4 : 0);
        MailingAddress mailingAddress = state.getMailingAddress();
        rhTextView2.setText(mailingAddress != null ? MailingAddress.format$default(mailingAddress, false, false, 2, null) : null);
        RdsButton rdsButton = cardShippingAddressFragment.getBinding().cardShippingContinueBtn;
        if (state.getMailingAddress() != null && !state.isLoading()) {
            z = true;
        }
        rdsButton.setEnabled(z);
        Intrinsics.checkNotNull(rdsButton);
        OnClickListeners.onClick(rdsButton, new Function0() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardShippingAddressFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardShippingAddressFragment.onStart$lambda$6$lambda$5$lambda$4(this.f$0, state);
            }
        });
        ErrorHandlers.handleErrorEvent(cardShippingAddressFragment.getActivityErrorHandler(), state.getLoadAddressError());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$6$lambda$5$lambda$4(CardShippingAddressFragment cardShippingAddressFragment, CardShippingAddressViewState cardShippingAddressViewState) {
        MailingAddress mailingAddress = cardShippingAddressViewState.getMailingAddress();
        Intrinsics.checkNotNull(mailingAddress);
        cardShippingAddressFragment.confirmAddress(mailingAddress, cardShippingAddressViewState.getShippingAddressId(), cardShippingAddressViewState.isBillingAddress());
        return Unit.INSTANCE;
    }

    private final void confirmAddress(MailingAddress mailingAddress, UUID shippingAddressId, Boolean isBillingAddress) {
        CardHelpCallbacks callbacks = getCallbacks();
        CardReplacementSubmissionFragment.Companion companion = CardReplacementSubmissionFragment.INSTANCE;
        Companion companion2 = INSTANCE;
        callbacks.proceed(companion.newInstance(new CardReplacementSubmissionDetails(((Args) companion2.getArgs((Fragment) this)).getCardId(), ((Args) companion2.getArgs((Fragment) this)).getReplacementType(), mailingAddress, null, shippingAddressId, isBillingAddress, 8, null)));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode != 1) {
            super.onActivityResult(requestCode, resultCode, data);
        } else if (resultCode == -1) {
            CardShippingAddress cardShippingAddress = data != null ? (CardShippingAddress) data.getParcelableExtra(CardShippingAddress.EXTRA_CARD_SHIPPING_ADDRESS_RESULT) : null;
            Intrinsics.checkNotNull(cardShippingAddress);
            getDuxo().setShippingAddress(cardShippingAddress);
        }
    }

    /* compiled from: CardShippingAddressFragment.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardShippingAddressFragment$Args;", "Landroid/os/Parcelable;", "cardId", "Ljava/util/UUID;", "replacementType", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementType;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementType;)V", "getCardId", "()Ljava/util/UUID;", "getReplacementType", "()Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementType;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final UUID cardId;
        private final CardReplacementType replacementType;

        /* compiled from: CardShippingAddressFragment.kt */
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
            dest.writeString(this.replacementType.name());
        }

        public Args(UUID cardId, CardReplacementType replacementType) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            Intrinsics.checkNotNullParameter(replacementType, "replacementType");
            this.cardId = cardId;
            this.replacementType = replacementType;
        }

        public final UUID getCardId() {
            return this.cardId;
        }

        public final CardReplacementType getReplacementType() {
            return this.replacementType;
        }
    }

    /* compiled from: CardShippingAddressFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardShippingAddressFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/mcduckling/card/help/ui/CardShippingAddressFragment;", "Lcom/robinhood/android/mcduckling/card/help/ui/CardShippingAddressFragment$Args;", "<init>", "()V", "REQUEST_CODE_CHOOSE_ADDRESS", "", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CardShippingAddressFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CardShippingAddressFragment cardShippingAddressFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cardShippingAddressFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CardShippingAddressFragment newInstance(Args args) {
            return (CardShippingAddressFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CardShippingAddressFragment cardShippingAddressFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cardShippingAddressFragment, args);
        }
    }
}
