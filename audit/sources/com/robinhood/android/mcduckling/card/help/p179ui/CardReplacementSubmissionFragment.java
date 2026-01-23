package com.robinhood.android.mcduckling.card.help.p179ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.common.util.p090rx.ContextErrorHandler;
import com.robinhood.android.mcduckling.card.help.C21627R;
import com.robinhood.android.mcduckling.card.help.p179ui.CardReplacementConfirmationFragment;
import com.robinhood.android.mcduckling.card.help.p179ui.CardReplacementSubmissionState;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.utils.extensions.ObservablesAndroid;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CardReplacementSubmissionFragment.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0012H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementSubmissionFragment;", "Lcom/robinhood/android/mcduckling/card/help/ui/BaseCardHelpFragment;", "<init>", "()V", "cardReplacementSubmissionDetails", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementSubmissionDetails;", "getCardReplacementSubmissionDetails", "()Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementSubmissionDetails;", "cardReplacementSubmissionDetails$delegate", "Lkotlin/Lazy;", "duxo", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementSubmissionDuxo;", "getDuxo", "()Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementSubmissionDuxo;", "duxo$delegate", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onSaveInstanceState", "outState", "Companion", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CardReplacementSubmissionFragment extends BaseCardHelpFragment {
    private static final String ARG_CARD_REPLACEMENT = "card";

    /* renamed from: cardReplacementSubmissionDetails$delegate, reason: from kotlin metadata */
    private final Lazy cardReplacementSubmissionDetails;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public CardReplacementSubmissionFragment() {
        super(C21627R.layout.fragment_card_replacement_submission);
        this.cardReplacementSubmissionDetails = Fragments2.argument(this, ARG_CARD_REPLACEMENT);
        this.duxo = OldDuxos.oldDuxo(this, CardReplacementSubmissionDuxo.class);
    }

    private final CardReplacementSubmissionDetails getCardReplacementSubmissionDetails() {
        return (CardReplacementSubmissionDetails) this.cardReplacementSubmissionDetails.getValue();
    }

    private final CardReplacementSubmissionDuxo getDuxo() {
        return (CardReplacementSubmissionDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getDuxo().restoreState(savedInstanceState);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.mcduckling.card.help.ui.CardReplacementSubmissionFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CardReplacementSubmissionFragment.onStart$lambda$0(this.f$0, (CardReplacementSubmissionState) obj);
            }
        });
        getDuxo().submit(getCardReplacementSubmissionDetails());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(CardReplacementSubmissionFragment cardReplacementSubmissionFragment, CardReplacementSubmissionState state) {
        Fragment fragmentNewInstance;
        Intrinsics.checkNotNullParameter(state, "state");
        if (!Intrinsics.areEqual(state, CardReplacementSubmissionState.Submitting.INSTANCE)) {
            if (Intrinsics.areEqual(state, CardReplacementSubmissionState.Success.INSTANCE)) {
                if (cardReplacementSubmissionFragment.getCardReplacementSubmissionDetails().getReplacementType() == CardReplacementType.STOLEN_VIRTUAL) {
                    fragmentNewInstance = CardReplacementDeactivatedSuccessFragment.INSTANCE.newInstance();
                } else {
                    fragmentNewInstance = CardReplacementConfirmationFragment.INSTANCE.newInstance((Parcelable) new CardReplacementConfirmationFragment.Args(cardReplacementSubmissionFragment.getCardReplacementSubmissionDetails().getCardId(), cardReplacementSubmissionFragment.getCardReplacementSubmissionDetails().getReplacementType()));
                }
                cardReplacementSubmissionFragment.getCallbacks().proceed((BaseFragment) fragmentNewInstance);
            } else {
                if (!(state instanceof CardReplacementSubmissionState.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                Context contextRequireContext = cardReplacementSubmissionFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                AbsErrorHandler.handleError$default(new ContextErrorHandler(contextRequireContext), ((CardReplacementSubmissionState.Error) state).getThrowable(), false, 2, null);
                cardReplacementSubmissionFragment.requireActivity().finish();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        getDuxo().saveState(outState);
    }

    /* compiled from: CardReplacementSubmissionFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementSubmissionFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$CardReplacementVirtualToPhysicalSubmission;", "<init>", "()V", "ARG_CARD_REPLACEMENT", "", "newInstance", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementSubmissionFragment;", "cardReplacementDetails", "Lcom/robinhood/android/mcduckling/card/help/ui/CardReplacementSubmissionDetails;", "createFragment", "key", "feature-mcduckling-help_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements FragmentResolver<LegacyFragmentKey.CardReplacementVirtualToPhysicalSubmission> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CardReplacementSubmissionFragment newInstance(CardReplacementSubmissionDetails cardReplacementDetails) {
            Intrinsics.checkNotNullParameter(cardReplacementDetails, "cardReplacementDetails");
            CardReplacementSubmissionFragment cardReplacementSubmissionFragment = new CardReplacementSubmissionFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable(CardReplacementSubmissionFragment.ARG_CARD_REPLACEMENT, cardReplacementDetails);
            if (cardReplacementDetails.getReplacementType() == CardReplacementType.VIRTUAL_TO_PHYSICAL && cardReplacementDetails.getCardColor() == null) {
                throw new IllegalStateException("Card color is needed for submitting a physical card");
            }
            cardReplacementSubmissionFragment.setArguments(bundle);
            return cardReplacementSubmissionFragment;
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public CardReplacementSubmissionFragment createFragment(LegacyFragmentKey.CardReplacementVirtualToPhysicalSubmission key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return newInstance(new CardReplacementSubmissionDetails(key.getCardId(), CardReplacementType.VIRTUAL_TO_PHYSICAL, null, key.getCardColor(), key.getShippingAddressId(), null, 36, null));
        }
    }
}
