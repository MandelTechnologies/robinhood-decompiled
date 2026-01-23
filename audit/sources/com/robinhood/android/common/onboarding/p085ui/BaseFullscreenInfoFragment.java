package com.robinhood.android.common.onboarding.p085ui;

import android.content.Context;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.robinhood.android.common.onboarding.C11287R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.util.extensions.TextViewsKt;
import com.robinhood.android.common.util.text.ActionSpan;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import com.robinhood.android.wires.p278ui.WiresInvalidAccountContentComposable;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: BaseFullscreenInfoFragment.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0016J$\u00102\u001a\u00020*2\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u000108H\u0016J\u001a\u00109\u001a\u00020/2\u0006\u0010:\u001a\u00020*2\b\u00107\u001a\u0004\u0018\u000108H\u0016J\b\u0010;\u001a\u00020/H\u0016J\b\u0010<\u001a\u00020/H\u0016R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0015\u0010\u000bR\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010!\u001a\u0004\u0018\u00010\"8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b#\u0010$R\u001d\u0010&\u001a\u0004\u0018\u00010\"8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\u001b\u001a\u0004\b'\u0010$R\u001d\u0010)\u001a\u0004\u0018\u00010*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010\u001b\u001a\u0004\b+\u0010,¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/common/onboarding/ui/BaseFullscreenInfoFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "splashPage", "Lcom/robinhood/android/common/onboarding/ui/SplashPage;", "getSplashPage", "()Lcom/robinhood/android/common/onboarding/ui/SplashPage;", "primaryButtonLabelRes", "", "getPrimaryButtonLabelRes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "secondaryButtonLabelRes", "getSecondaryButtonLabelRes", "layoutRes", "getLayoutRes", "()I", "disclosureTextRes", "getDisclosureTextRes", "disclosureTextUrlRes", "getDisclosureTextUrlRes", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Landroid/widget/TextView;", "getDisclosure", "()Landroid/widget/TextView;", "disclosure$delegate", "Lkotlin/properties/ReadOnlyProperty;", "creativeView", "Landroid/view/ViewStub;", "getCreativeView", "()Landroid/view/ViewStub;", "creativeView$delegate", WiresInvalidAccountContentComposable.PrimaryButtonTag, "Lcom/robinhood/android/designsystem/button/RdsButton;", "getPrimaryButton", "()Lcom/robinhood/android/designsystem/button/RdsButton;", "primaryButton$delegate", WiresInvalidAccountContentComposable.SecondaryButtonTag, "getSecondaryButton", "secondaryButton$delegate", "bottomMargin", "Landroid/view/View;", "getBottomMargin", "()Landroid/view/View;", "bottomMargin$delegate", "onAttach", "", "context", "Landroid/content/Context;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "onPrimaryButtonClicked", "onSecondaryButtonClicked", "lib-common-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class BaseFullscreenInfoFragment extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BaseFullscreenInfoFragment.class, OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "getDisclosure()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(BaseFullscreenInfoFragment.class, "creativeView", "getCreativeView()Landroid/view/ViewStub;", 0)), Reflection.property1(new PropertyReference1Impl(BaseFullscreenInfoFragment.class, WiresInvalidAccountContentComposable.PrimaryButtonTag, "getPrimaryButton()Lcom/robinhood/android/designsystem/button/RdsButton;", 0)), Reflection.property1(new PropertyReference1Impl(BaseFullscreenInfoFragment.class, WiresInvalidAccountContentComposable.SecondaryButtonTag, "getSecondaryButton()Lcom/robinhood/android/designsystem/button/RdsButton;", 0)), Reflection.property1(new PropertyReference1Impl(BaseFullscreenInfoFragment.class, "bottomMargin", "getBottomMargin()Landroid/view/View;", 0))};

    /* renamed from: bottomMargin$delegate, reason: from kotlin metadata */
    private final Interfaces2 bottomMargin;

    /* renamed from: creativeView$delegate, reason: from kotlin metadata */
    private final Interfaces2 creativeView;

    /* renamed from: disclosure$delegate, reason: from kotlin metadata */
    private final Interfaces2 disclosure;
    private final Integer disclosureTextRes;
    private final Integer disclosureTextUrlRes;
    private final int layoutRes;

    /* renamed from: primaryButton$delegate, reason: from kotlin metadata */
    private final Interfaces2 primaryButton;
    private final Integer primaryButtonLabelRes;

    /* renamed from: secondaryButton$delegate, reason: from kotlin metadata */
    private final Interfaces2 secondaryButton;
    private final Integer secondaryButtonLabelRes;
    private final SplashPage splashPage;

    public void onPrimaryButtonClicked() {
    }

    public void onSecondaryButtonClicked() {
    }

    public BaseFullscreenInfoFragment() {
        super(0);
        this.layoutRes = C11287R.layout.fragment_base_fullscreen_info;
        this.disclosure = bindView(C11287R.id.fullscreen_info_disclosure);
        this.creativeView = bindView(C11287R.id.fullscreen_info_creative);
        this.primaryButton = bindView(C11287R.id.fullscreen_info_primary_btn);
        this.secondaryButton = bindView(C11287R.id.fullscreen_info_secondary_btn);
        this.bottomMargin = bindView(C11287R.id.filled_button_space);
    }

    public SplashPage getSplashPage() {
        return this.splashPage;
    }

    public Integer getPrimaryButtonLabelRes() {
        return this.primaryButtonLabelRes;
    }

    public Integer getSecondaryButtonLabelRes() {
        return this.secondaryButtonLabelRes;
    }

    public int getLayoutRes() {
        return this.layoutRes;
    }

    public Integer getDisclosureTextRes() {
        return this.disclosureTextRes;
    }

    public Integer getDisclosureTextUrlRes() {
        return this.disclosureTextUrlRes;
    }

    private final TextView getDisclosure() {
        return (TextView) this.disclosure.getValue(this, $$delegatedProperties[0]);
    }

    private final ViewStub getCreativeView() {
        return (ViewStub) this.creativeView.getValue(this, $$delegatedProperties[1]);
    }

    protected final RdsButton getPrimaryButton() {
        return (RdsButton) this.primaryButton.getValue(this, $$delegatedProperties[2]);
    }

    protected final RdsButton getSecondaryButton() {
        return (RdsButton) this.secondaryButton.getValue(this, $$delegatedProperties[3]);
    }

    private final View getBottomMargin() {
        return (View) this.bottomMargin.getValue(this, $$delegatedProperties[4]);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(getLayoutRes(), container, false);
        Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        RdsButton secondaryButton;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (!isInTabFragment()) {
            ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        }
        SplashPage splashPage = getSplashPage();
        if (splashPage != null) {
            getCreativeView().setLayoutResource(splashPage.getLayoutRes());
            View viewInflate = getCreativeView().inflate();
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
            splashPage.setupView(viewInflate);
        }
        Integer primaryButtonLabelRes = getPrimaryButtonLabelRes();
        if (primaryButtonLabelRes != null) {
            int iIntValue = primaryButtonLabelRes.intValue();
            RdsButton primaryButton = getPrimaryButton();
            if (primaryButton == null) {
                throw new IllegalStateException("Primary button label set despite no primary button");
            }
            primaryButton.setText(iIntValue);
            primaryButton.setVisibility(0);
            OnClickListeners.onClick(primaryButton, new Function0() { // from class: com.robinhood.android.common.onboarding.ui.BaseFullscreenInfoFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseFullscreenInfoFragment.onViewCreated$lambda$3$lambda$2(this.f$0);
                }
            });
        }
        Integer secondaryButtonLabelRes = getSecondaryButtonLabelRes();
        if (secondaryButtonLabelRes != null) {
            int iIntValue2 = secondaryButtonLabelRes.intValue();
            RdsButton secondaryButton2 = getSecondaryButton();
            if (secondaryButton2 == null) {
                throw new IllegalStateException("Secondary button label set despite no secondary button");
            }
            secondaryButton2.setText(iIntValue2);
            secondaryButton2.setVisibility(0);
            OnClickListeners.onClick(secondaryButton2, new Function0() { // from class: com.robinhood.android.common.onboarding.ui.BaseFullscreenInfoFragment$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseFullscreenInfoFragment.onViewCreated$lambda$5$lambda$4(this.f$0);
                }
            });
        }
        View bottomMargin = getBottomMargin();
        if (bottomMargin != null) {
            RdsButton primaryButton2 = getPrimaryButton();
            bottomMargin.setVisibility(primaryButton2 != null && primaryButton2.getVisibility() == 0 && ((secondaryButton = getSecondaryButton()) == null || secondaryButton.getVisibility() == 8) ? 0 : 8);
        }
        Integer disclosureTextRes = getDisclosureTextRes();
        final Integer disclosureTextUrlRes = getDisclosureTextUrlRes();
        if (disclosureTextRes == null || disclosureTextUrlRes == null) {
            return;
        }
        getDisclosure().setVisibility(0);
        TextView disclosure = getDisclosure();
        String string2 = ViewsKt.getString(disclosure, disclosureTextRes.intValue());
        num = num.intValue() == 0 ? null : 0;
        TextViewsKt.setTextWithLearnMore(disclosure, (CharSequence) string2, true, true, num != null ? ViewsKt.getString(disclosure, num.intValue()) : null, (ClickableSpan) new ActionSpan(false, (Function0) new Function0<Unit>() { // from class: com.robinhood.android.common.onboarding.ui.BaseFullscreenInfoFragment$onViewCreated$$inlined$setTextWithLearnMore$default$1
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String string3 = this.this$0.getString(disclosureTextUrlRes.intValue());
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                Navigator navigator = this.this$0.getNavigator();
                Context contextRequireContext = this.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, string3);
            }
        }, 1, (DefaultConstructorMarker) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$3$lambda$2(BaseFullscreenInfoFragment baseFullscreenInfoFragment) {
        baseFullscreenInfoFragment.onPrimaryButtonClicked();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5$lambda$4(BaseFullscreenInfoFragment baseFullscreenInfoFragment) {
        baseFullscreenInfoFragment.onSecondaryButtonClicked();
        return Unit.INSTANCE;
    }
}
