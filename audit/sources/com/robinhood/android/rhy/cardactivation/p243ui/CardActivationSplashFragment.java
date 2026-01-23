package com.robinhood.android.rhy.cardactivation.p243ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.mcduckling.p084ui.WizardFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.rhy.cardactivation.C27358R;
import com.robinhood.android.rhy.cardactivation.databinding.FragmentCardActivationSplashBinding;
import com.robinhood.android.rhy.cardactivation.p243ui.CardActivationSplashFragment;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.NoSuchElementException;
import java.util.UUID;
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

/* compiled from: CardActivationSplashFragment.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001c\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001bH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationSplashFragment;", "Lcom/robinhood/android/common/mcduckling/ui/WizardFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/rhy/cardactivation/databinding/FragmentCardActivationSplashBinding;", "getBinding", "()Lcom/robinhood/android/rhy/cardactivation/databinding/FragmentCardActivationSplashBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "continueBtn", "Landroid/view/View;", "getContinueBtn", "()Landroid/view/View;", "continueBtn$delegate", "callbacks", "Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationSplashFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationSplashFragment$Callbacks;", "callbacks$delegate", "onViewCreated", "", "view", "savedInstanceState", "Landroid/os/Bundle;", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "Callbacks", "Companion", "feature-card-activation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class CardActivationSplashFragment extends WizardFragment {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: continueBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 continueBtn;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CardActivationSplashFragment.class, "binding", "getBinding()Lcom/robinhood/android/rhy/cardactivation/databinding/FragmentCardActivationSplashBinding;", 0)), Reflection.property1(new PropertyReference1Impl(CardActivationSplashFragment.class, "continueBtn", "getContinueBtn()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(CardActivationSplashFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationSplashFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CardActivationSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\t\u001a\u00020\nH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationSplashFragment$Callbacks;", "", "cardId", "Ljava/util/UUID;", "getCardId", "()Ljava/util/UUID;", "isPinSet", "", "()Z", "onSplashContinue", "", "feature-card-activation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        UUID getCardId();

        boolean isPinSet();

        void onSplashContinue();
    }

    public CardActivationSplashFragment() {
        super(C27358R.layout.fragment_card_activation_splash);
        this.binding = ViewBinding5.viewBinding(this, CardActivationSplashFragment2.INSTANCE);
        this.continueBtn = bindView(C27358R.id.continue_btn);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationSplashFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof CardActivationSplashFragment.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
    }

    private final FragmentCardActivationSplashBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentCardActivationSplashBinding) value;
    }

    private final View getContinueBtn() {
        return (View) this.continueBtn.getValue(this, $$delegatedProperties[1]);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[2]);
    }

    @Override // com.robinhood.android.common.mcduckling.p084ui.WizardFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        RdsButton continueBtn = getBinding().continueBtn;
        Intrinsics.checkNotNullExpressionValue(continueBtn, "continueBtn");
        ApplyWindowInsets.m26663applyWindowInsetsAsMarginqNU9l24(continueBtn, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        OnClickListeners.onClick(getContinueBtn(), new Function0() { // from class: com.robinhood.android.rhy.cardactivation.ui.CardActivationSplashFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CardActivationSplashFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(CardActivationSplashFragment cardActivationSplashFragment) {
        cardActivationSplashFragment.getCallbacks().onSplashContinue();
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    /* compiled from: CardActivationSplashFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationSplashFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/rhy/cardactivation/ui/CardActivationSplashFragment;", "feature-card-activation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CardActivationSplashFragment newInstance() {
            return new CardActivationSplashFragment();
        }
    }
}
