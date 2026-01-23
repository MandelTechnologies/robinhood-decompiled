package com.robinhood.android.common;

import android.animation.Animator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.util.extensions.LottieAnimationViewsKt;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.ResourceType;
import com.robinhood.scarlet.util.resource.ThemedResourceReference;
import com.robinhood.shared.remote.assets.LottieUrl;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.resource.StringResource;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: GenericActionableInformationFragment.kt */
@Metadata(m3635d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0004\u0085\u0001\u0086\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0004J\u0018\u0010n\u001a\u00020\u00122\u000e\u0010o\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010pH\u0004J\u0016\u0010q\u001a\u00020\u00122\f\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00120pH\u0004J\u0016\u0010r\u001a\u00020\u00122\f\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00120pH\u0004J\u0010\u0010s\u001a\u00020\u00122\u0006\u0010t\u001a\u00020uH\u0016J\b\u0010v\u001a\u00020\u0012H\u0016J\u0018\u0010w\u001a\u00020x*\u00020F2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010zH\u0004J\u0018\u0010w\u001a\u00020{*\u00020|2\n\b\u0002\u0010y\u001a\u0004\u0018\u00010zH\u0004J\f\u0010}\u001a\u00020~*\u00020FH\u0004J\r\u0010\u007f\u001a\u00030\u0080\u0001*\u00020FH\u0004J\r\u0010\u007f\u001a\u00030\u0081\u0001*\u00020RH\u0004J\u000e\u0010\u007f\u001a\u00030\u0082\u0001*\u00030\u0083\u0001H\u0004J\u000f\u0010\u0084\u0001\u001a\u00020\u001a*\u0004\u0018\u00010\u001aH\u0004R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000b@DX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u001a@DX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001b\u0010 \u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\t\u001a\u0004\b!\u0010\u0018R$\u0010#\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u001a@DX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\u001b\u0010&\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\t\u001a\u0004\b(\u0010)R$\u0010+\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u001a@DX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001d\"\u0004\b-\u0010\u001fR$\u0010/\u001a\u00020.2\u0006\u0010\n\u001a\u00020.@DX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R$\u00104\u001a\u00020.2\u0006\u0010\n\u001a\u00020.8D@DX\u0084\u000e¢\u0006\f\u001a\u0004\b5\u00101\"\u0004\b6\u00103R\u001b\u00107\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\t\u001a\u0004\b9\u0010:R\u001b\u0010<\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b>\u0010\t\u001a\u0004\b=\u0010)R$\u0010?\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\u001a@DX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u001d\"\u0004\bA\u0010\u001fR,\u0010B\u001a\u00020.2\u0006\u0010\n\u001a\u00020.8\u0004@DX\u0085\u000e¢\u0006\u0014\n\u0000\u0012\u0004\bC\u0010\u0003\u001a\u0004\bD\u00101\"\u0004\bE\u00103R&\u0010G\u001a\u00020F2\u0006\u0010\n\u001a\u00020F8\u0004@DX\u0085\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR$\u0010L\u001a\u00020F2\u0006\u0010\n\u001a\u00020F@DX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010I\"\u0004\bN\u0010KR\u001b\u0010O\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010\t\u001a\u0004\bP\u0010\u0018R$\u0010S\u001a\u00020R2\u0006\u0010\n\u001a\u00020R8D@DX\u0084\u000e¢\u0006\f\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001b\u0010X\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010\t\u001a\u0004\bZ\u0010[R$\u0010]\u001a\u00020.2\u0006\u0010\n\u001a\u00020.@DX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u00101\"\u0004\b_\u00103R\u001b\u0010`\u001a\u00020a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bd\u0010\t\u001a\u0004\bb\u0010cR(\u0010e\u001a\u0004\u0018\u00010\u001a2\b\u0010\n\u001a\u0004\u0018\u00010\u001a@DX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010\u001d\"\u0004\bg\u0010\u001fR,\u0010h\u001a\u0004\u0018\u00010F2\b\u0010\n\u001a\u0004\u0018\u00010F8\u0004@DX\u0085\u000e¢\u0006\u0010\n\u0002\u0010m\u001a\u0004\bi\u0010j\"\u0004\bk\u0010l¨\u0006\u0087\u0001"}, m3636d2 = {"Lcom/robinhood/android/common/GenericActionableInformationFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "illustrationView", "Lcom/airbnb/lottie/LottieAnimationView;", "getIllustrationView", "()Lcom/airbnb/lottie/LottieAnimationView;", "illustrationView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "value", "Lcom/robinhood/android/common/GenericActionableInformationFragment$IllustrationType;", "illustration", "getIllustration", "()Lcom/robinhood/android/common/GenericActionableInformationFragment$IllustrationType;", "setIllustration", "(Lcom/robinhood/android/common/GenericActionableInformationFragment$IllustrationType;)V", "overrideConstraintWidthPercent", "", "constraintWidthPercentOverride", "", "titleTextView", "Landroid/widget/TextView;", "getTitleTextView", "()Landroid/widget/TextView;", "titleTextView$delegate", "Lcom/robinhood/android/common/GenericActionableInformationFragment$TextType;", "title", "getTitle", "()Lcom/robinhood/android/common/GenericActionableInformationFragment$TextType;", "setTitle", "(Lcom/robinhood/android/common/GenericActionableInformationFragment$TextType;)V", "descriptionTextView", "getDescriptionTextView", "descriptionTextView$delegate", "description", "getDescription", "setDescription", "primaryActionButton", "Lcom/robinhood/android/designsystem/button/RdsButton;", "getPrimaryActionButton", "()Lcom/robinhood/android/designsystem/button/RdsButton;", "primaryActionButton$delegate", "primaryAction", "getPrimaryAction", "setPrimaryAction", "", "primaryActionMonochromeStyle", "getPrimaryActionMonochromeStyle", "()Z", "setPrimaryActionMonochromeStyle", "(Z)V", "actionLoading", "getActionLoading", "setActionLoading", "spacing", "Landroid/widget/Space;", "getSpacing", "()Landroid/widget/Space;", "spacing$delegate", "secondaryActionButton", "getSecondaryActionButton", "secondaryActionButton$delegate", "secondaryAction", "getSecondaryAction", "setSecondaryAction", "secondaryActionMonochromeStyle", "getSecondaryActionMonochromeStyle$annotations", "getSecondaryActionMonochromeStyle", "setSecondaryActionMonochromeStyle", "", "secondaryActionStyle", "getSecondaryActionStyle", "()I", "setSecondaryActionStyle", "(I)V", "secondaryActionWidth", "getSecondaryActionWidth", "setSecondaryActionWidth", "disclosureTxtView", "getDisclosureTxtView", "disclosureTxtView$delegate", "", "disclosureText", "getDisclosureText", "()Ljava/lang/CharSequence;", "setDisclosureText", "(Ljava/lang/CharSequence;)V", "loadingView", "Landroid/view/View;", "getLoadingView", "()Landroid/view/View;", "loadingView$delegate", "fullScreenLoading", "getFullScreenLoading", "setFullScreenLoading", "infoBanner", "Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView;", "getInfoBanner", "()Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView;", "infoBanner$delegate", "infoBannerText", "getInfoBannerText", "setInfoBannerText", "infoBannerIconRes", "getInfoBannerIconRes", "()Ljava/lang/Integer;", "setInfoBannerIconRes", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "onDisclosureClick", "click", "Lkotlin/Function0;", "onPrimaryActionClick", "onSecondaryActionClick", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onDestroyView", "toLottieIllustration", "Lcom/robinhood/android/common/GenericActionableInformationFragment$IllustrationType$Lottie$Raw;", "animatorListener", "Landroid/animation/Animator$AnimatorListener;", "Lcom/robinhood/android/common/GenericActionableInformationFragment$IllustrationType$Lottie$Url;", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "toDrawableIllustration", "Lcom/robinhood/android/common/GenericActionableInformationFragment$IllustrationType$Drawable;", "toText", "Lcom/robinhood/android/common/GenericActionableInformationFragment$TextType$Resource;", "Lcom/robinhood/android/common/GenericActionableInformationFragment$TextType$Formatted;", "Lcom/robinhood/android/common/GenericActionableInformationFragment$TextType$RhResource;", "Lcom/robinhood/utils/resource/StringResource;", "orEmpty", "IllustrationType", "TextType", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public class GenericActionableInformationFragment extends BaseFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(GenericActionableInformationFragment.class, "illustrationView", "getIllustrationView()Lcom/airbnb/lottie/LottieAnimationView;", 0)), Reflection.property1(new PropertyReference1Impl(GenericActionableInformationFragment.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(GenericActionableInformationFragment.class, "descriptionTextView", "getDescriptionTextView()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(GenericActionableInformationFragment.class, "primaryActionButton", "getPrimaryActionButton()Lcom/robinhood/android/designsystem/button/RdsButton;", 0)), Reflection.property1(new PropertyReference1Impl(GenericActionableInformationFragment.class, "spacing", "getSpacing()Landroid/widget/Space;", 0)), Reflection.property1(new PropertyReference1Impl(GenericActionableInformationFragment.class, "secondaryActionButton", "getSecondaryActionButton()Lcom/robinhood/android/designsystem/button/RdsButton;", 0)), Reflection.property1(new PropertyReference1Impl(GenericActionableInformationFragment.class, "disclosureTxtView", "getDisclosureTxtView()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(GenericActionableInformationFragment.class, "loadingView", "getLoadingView()Landroid/view/View;", 0)), Reflection.property1(new PropertyReference1Impl(GenericActionableInformationFragment.class, "infoBanner", "getInfoBanner()Lcom/robinhood/android/designsystem/banner/RdsInfoBannerView;", 0))};
    public static final int $stable = 8;
    private TextType description;

    /* renamed from: descriptionTextView$delegate, reason: from kotlin metadata */
    private final Interfaces2 descriptionTextView;

    /* renamed from: disclosureTxtView$delegate, reason: from kotlin metadata */
    private final Interfaces2 disclosureTxtView;
    private boolean fullScreenLoading;
    private IllustrationType illustration;

    /* renamed from: illustrationView$delegate, reason: from kotlin metadata */
    private final Interfaces2 illustrationView;

    /* renamed from: infoBanner$delegate, reason: from kotlin metadata */
    private final Interfaces2 infoBanner;
    private Integer infoBannerIconRes;
    private TextType infoBannerText;

    /* renamed from: loadingView$delegate, reason: from kotlin metadata */
    private final Interfaces2 loadingView;
    private TextType primaryAction;

    /* renamed from: primaryActionButton$delegate, reason: from kotlin metadata */
    private final Interfaces2 primaryActionButton;
    private boolean primaryActionMonochromeStyle;
    private TextType secondaryAction;

    /* renamed from: secondaryActionButton$delegate, reason: from kotlin metadata */
    private final Interfaces2 secondaryActionButton;
    private boolean secondaryActionMonochromeStyle;
    private int secondaryActionStyle;
    private int secondaryActionWidth;

    /* renamed from: spacing$delegate, reason: from kotlin metadata */
    private final Interfaces2 spacing;
    private TextType title;

    /* renamed from: titleTextView$delegate, reason: from kotlin metadata */
    private final Interfaces2 titleTextView;

    @Deprecated
    protected static /* synthetic */ void getSecondaryActionMonochromeStyle$annotations() {
    }

    public GenericActionableInformationFragment() {
        super(C11048R.layout.fragment_generic_actionable_info);
        this.illustrationView = bindView(C11048R.id.generic_actionable_info_image);
        this.illustration = IllustrationType.Empty.INSTANCE;
        this.titleTextView = bindView(C11048R.id.generic_actionable_info_title);
        TextType.Empty empty = TextType.Empty.INSTANCE;
        this.title = empty;
        this.descriptionTextView = bindView(C11048R.id.generic_actionable_info_detail);
        this.description = empty;
        this.primaryActionButton = bindView(C11048R.id.generic_actionable_info_primary_action);
        this.primaryAction = new TextType.Resource(C11048R.string.general_label_continue);
        this.spacing = bindView(C11048R.id.space);
        this.secondaryActionButton = bindView(C11048R.id.generic_actionable_info_secondary_action);
        this.secondaryAction = empty;
        this.secondaryActionStyle = C20690R.attr.legacyGhostButtonStyle;
        this.secondaryActionWidth = -2;
        this.disclosureTxtView = bindView(C11048R.id.generic_actionable_info_disclosure_title);
        this.loadingView = bindView(C11048R.id.generic_actionable_info_loading);
        this.infoBanner = bindView(C11048R.id.generic_actionable_info_banner);
    }

    private final LottieAnimationView getIllustrationView() {
        return (LottieAnimationView) this.illustrationView.getValue(this, $$delegatedProperties[0]);
    }

    protected final IllustrationType getIllustration() {
        return this.illustration;
    }

    protected final void setIllustration(IllustrationType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(value, IllustrationType.Empty.INSTANCE)) {
            getIllustrationView().setImageDrawable(null);
            return;
        }
        if (value instanceof IllustrationType.Drawable) {
            getIllustrationView().setImageResource(((IllustrationType.Drawable) value).getDrawableResId());
            return;
        }
        if (!(value instanceof IllustrationType.Lottie)) {
            throw new NoWhenBranchMatchedException();
        }
        if (getIllustrationView().isAnimating()) {
            getIllustrationView().cancelAnimation();
        }
        IllustrationType.Lottie lottie = (IllustrationType.Lottie) value;
        if (lottie.getAnimatorListener() != null) {
            getIllustrationView().addAnimatorListener(lottie.getAnimatorListener());
        }
        if (lottie instanceof IllustrationType.Lottie.Raw) {
            getIllustrationView().setAnimation(((IllustrationType.Lottie.Raw) value).getRawId());
        } else {
            if (!(lottie instanceof IllustrationType.Lottie.Url)) {
                throw new NoWhenBranchMatchedException();
            }
            LottieAnimationViewsKt.setRemoteUrl(getIllustrationView(), ((IllustrationType.Lottie.Url) value).getUrl());
        }
        getIllustrationView().playAnimation();
    }

    protected final void overrideConstraintWidthPercent(float constraintWidthPercentOverride) {
        LottieAnimationView illustrationView = getIllustrationView();
        ViewGroup.LayoutParams layoutParams = getIllustrationView().getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((ConstraintLayout.LayoutParams) layoutParams).matchConstraintPercentWidth = constraintWidthPercentOverride;
        illustrationView.requestLayout();
    }

    private final TextView getTitleTextView() {
        return (TextView) this.titleTextView.getValue(this, $$delegatedProperties[1]);
    }

    protected final TextType getTitle() {
        return this.title;
    }

    protected final void setTitle(TextType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.title = value;
        if (Intrinsics.areEqual(value, TextType.Empty.INSTANCE)) {
            getTitleTextView().setText((CharSequence) null);
            return;
        }
        if (value instanceof TextType.Resource) {
            getTitleTextView().setText(((TextType.Resource) value).getStringResId());
            return;
        }
        if (value instanceof TextType.Formatted) {
            getTitleTextView().setText(((TextType.Formatted) value).getFormattedStringRes());
            return;
        }
        if (!(value instanceof TextType.RhResource)) {
            throw new NoWhenBranchMatchedException();
        }
        TextView titleTextView = getTitleTextView();
        StringResource stringResource = ((TextType.RhResource) value).getStringResource();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        titleTextView.setText(stringResource.getText(resources));
    }

    private final TextView getDescriptionTextView() {
        return (TextView) this.descriptionTextView.getValue(this, $$delegatedProperties[2]);
    }

    protected final TextType getDescription() {
        return this.description;
    }

    protected final void setDescription(TextType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(value, TextType.Empty.INSTANCE)) {
            getDescriptionTextView().setText((CharSequence) null);
            return;
        }
        if (value instanceof TextType.Resource) {
            getDescriptionTextView().setText(((TextType.Resource) value).getStringResId());
            return;
        }
        if (value instanceof TextType.Formatted) {
            getDescriptionTextView().setText(((TextType.Formatted) value).getFormattedStringRes());
            return;
        }
        if (!(value instanceof TextType.RhResource)) {
            throw new NoWhenBranchMatchedException();
        }
        TextView descriptionTextView = getDescriptionTextView();
        StringResource stringResource = ((TextType.RhResource) value).getStringResource();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        descriptionTextView.setText(stringResource.getText(resources));
    }

    private final RdsButton getPrimaryActionButton() {
        return (RdsButton) this.primaryActionButton.getValue(this, $$delegatedProperties[3]);
    }

    protected final TextType getPrimaryAction() {
        return this.primaryAction;
    }

    protected final void setPrimaryAction(TextType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(value, TextType.Empty.INSTANCE)) {
            getPrimaryActionButton().setText((CharSequence) null);
            getPrimaryActionButton().setVisibility(8);
            return;
        }
        if (value instanceof TextType.Resource) {
            getPrimaryActionButton().setText(((TextType.Resource) value).getStringResId());
            getPrimaryActionButton().setVisibility(0);
            return;
        }
        if (value instanceof TextType.Formatted) {
            getPrimaryActionButton().setText(((TextType.Formatted) value).getFormattedStringRes());
            getPrimaryActionButton().setVisibility(0);
        } else {
            if (!(value instanceof TextType.RhResource)) {
                throw new NoWhenBranchMatchedException();
            }
            RdsButton primaryActionButton = getPrimaryActionButton();
            StringResource stringResource = ((TextType.RhResource) value).getStringResource();
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            primaryActionButton.setText(stringResource.getText(resources));
            getPrimaryActionButton().setVisibility(0);
        }
    }

    protected final boolean getPrimaryActionMonochromeStyle() {
        return this.primaryActionMonochromeStyle;
    }

    protected final void setPrimaryActionMonochromeStyle(boolean z) {
        if (z) {
            ScarletManager2.overrideStyle$default(getPrimaryActionButton(), new ThemedResourceReference(ResourceType.STYLE.INSTANCE, C20690R.attr.primaryMonochromeButtonStyle), false, 2, null);
        } else {
            ScarletManager2.overrideStyle$default(getPrimaryActionButton(), new ThemedResourceReference(ResourceType.STYLE.INSTANCE, C20690R.attr.primaryButtonStyle), false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setActionLoading(boolean z) {
        getPrimaryActionButton().setLoading(z);
    }

    protected final boolean getActionLoading() {
        return getPrimaryActionButton().getIsLoading();
    }

    private final Space getSpacing() {
        return (Space) this.spacing.getValue(this, $$delegatedProperties[4]);
    }

    private final RdsButton getSecondaryActionButton() {
        return (RdsButton) this.secondaryActionButton.getValue(this, $$delegatedProperties[5]);
    }

    protected final TextType getSecondaryAction() {
        return this.secondaryAction;
    }

    protected final void setSecondaryAction(TextType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(value, TextType.Empty.INSTANCE)) {
            getSecondaryActionButton().setText((CharSequence) null);
            getSecondaryActionButton().setVisibility(8);
            getSpacing().setVisibility(8);
            return;
        }
        if (value instanceof TextType.Resource) {
            getSecondaryActionButton().setText(((TextType.Resource) value).getStringResId());
            getSecondaryActionButton().setVisibility(0);
            getSpacing().setVisibility(0);
        } else if (value instanceof TextType.Formatted) {
            getSecondaryActionButton().setText(((TextType.Formatted) value).getFormattedStringRes());
            getSecondaryActionButton().setVisibility(0);
            getSpacing().setVisibility(0);
        } else {
            if (!(value instanceof TextType.RhResource)) {
                throw new NoWhenBranchMatchedException();
            }
            RdsButton secondaryActionButton = getSecondaryActionButton();
            StringResource stringResource = ((TextType.RhResource) value).getStringResource();
            Resources resources = getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            secondaryActionButton.setText(stringResource.getText(resources));
            getSecondaryActionButton().setVisibility(0);
            getSpacing().setVisibility(0);
        }
    }

    protected final boolean getSecondaryActionMonochromeStyle() {
        return this.secondaryActionMonochromeStyle;
    }

    protected final void setSecondaryActionMonochromeStyle(boolean z) {
        int i;
        if (z) {
            i = C20690R.attr.legacyGhostMonochromeButtonStyle;
        } else {
            i = C20690R.attr.legacyGhostButtonStyle;
        }
        setSecondaryActionStyle(i);
    }

    protected final int getSecondaryActionStyle() {
        return this.secondaryActionStyle;
    }

    protected final void setSecondaryActionStyle(int i) {
        ScarletManager2.overrideStyle$default(getSecondaryActionButton(), new ThemedResourceReference(ResourceType.STYLE.INSTANCE, i), false, 2, null);
    }

    protected final int getSecondaryActionWidth() {
        return this.secondaryActionWidth;
    }

    protected final void setSecondaryActionWidth(int i) {
        RdsButton secondaryActionButton = getSecondaryActionButton();
        ViewGroup.LayoutParams layoutParams = secondaryActionButton.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).width = i;
            secondaryActionButton.setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    private final TextView getDisclosureTxtView() {
        return (TextView) this.disclosureTxtView.getValue(this, $$delegatedProperties[6]);
    }

    protected final void setDisclosureText(CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getDisclosureTxtView().setText(value);
        getDisclosureTxtView().setVisibility(0);
    }

    protected final CharSequence getDisclosureText() {
        CharSequence text = getDisclosureTxtView().getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return text;
    }

    private final View getLoadingView() {
        return (View) this.loadingView.getValue(this, $$delegatedProperties[7]);
    }

    protected final boolean getFullScreenLoading() {
        return this.fullScreenLoading;
    }

    protected final void setFullScreenLoading(boolean z) {
        getLoadingView().setVisibility(z ? 0 : 8);
    }

    private final RdsInfoBannerView getInfoBanner() {
        return (RdsInfoBannerView) this.infoBanner.getValue(this, $$delegatedProperties[8]);
    }

    protected final TextType getInfoBannerText() {
        return this.infoBannerText;
    }

    protected final void setInfoBannerText(TextType textType) {
        if (textType instanceof TextType.Resource) {
            getInfoBanner().setText(getResources().getString(((TextType.Resource) textType).getStringResId()));
            getInfoBanner().setVisibility(0);
            return;
        }
        if (textType instanceof TextType.Formatted) {
            getInfoBanner().setText(((TextType.Formatted) textType).getFormattedStringRes());
            getInfoBanner().setVisibility(0);
            return;
        }
        if (!(textType instanceof TextType.RhResource)) {
            if (!Intrinsics.areEqual(textType, TextType.Empty.INSTANCE) && textType != null) {
                throw new NoWhenBranchMatchedException();
            }
            getInfoBanner().setText(null);
            getInfoBanner().setVisibility(8);
            return;
        }
        RdsInfoBannerView infoBanner = getInfoBanner();
        StringResource stringResource = ((TextType.RhResource) textType).getStringResource();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        infoBanner.setText(stringResource.getText(resources));
        getInfoBanner().setVisibility(0);
    }

    protected final Integer getInfoBannerIconRes() {
        return this.infoBannerIconRes;
    }

    protected final void setInfoBannerIconRes(Integer num) {
        getInfoBanner().setIcon(num != null ? AppCompatResources.getDrawable(requireContext(), num.intValue()) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDisclosureClick$lambda$3(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    protected final void onDisclosureClick(final Function0<Unit> click) {
        OnClickListeners.onClick(getDisclosureTxtView(), new Function0() { // from class: com.robinhood.android.common.GenericActionableInformationFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GenericActionableInformationFragment.onDisclosureClick$lambda$3(click);
            }
        });
        if (click == null) {
            getDisclosureTxtView().setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else {
            getDisclosureTxtView().setCompoundDrawablesWithIntrinsicBounds(C20690R.drawable.ic_rds_pop_out_16dp, 0, 0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onPrimaryActionClick$lambda$4(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    protected final void onPrimaryActionClick(final Function0<Unit> click) {
        Intrinsics.checkNotNullParameter(click, "click");
        OnClickListeners.onClick(getPrimaryActionButton(), new Function0() { // from class: com.robinhood.android.common.GenericActionableInformationFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GenericActionableInformationFragment.onPrimaryActionClick$lambda$4(click);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSecondaryActionClick$lambda$5(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    protected final void onSecondaryActionClick(final Function0<Unit> click) {
        Intrinsics.checkNotNullParameter(click, "click");
        OnClickListeners.onClick(getSecondaryActionButton(), new Function0() { // from class: com.robinhood.android.common.GenericActionableInformationFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GenericActionableInformationFragment.onSecondaryActionClick$lambda$5(click);
            }
        });
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getIllustrationView().cancelAnimation();
        getIllustrationView().removeAllAnimatorListeners();
    }

    /* compiled from: GenericActionableInformationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b4\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/GenericActionableInformationFragment$IllustrationType;", "", "<init>", "()V", "Empty", "Drawable", "Lottie", "Lcom/robinhood/android/common/GenericActionableInformationFragment$IllustrationType$Drawable;", "Lcom/robinhood/android/common/GenericActionableInformationFragment$IllustrationType$Empty;", "Lcom/robinhood/android/common/GenericActionableInformationFragment$IllustrationType$Lottie;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    protected static abstract class IllustrationType {
        public /* synthetic */ IllustrationType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: GenericActionableInformationFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/GenericActionableInformationFragment$IllustrationType$Empty;", "Lcom/robinhood/android/common/GenericActionableInformationFragment$IllustrationType;", "<init>", "()V", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Empty extends IllustrationType {
            public static final int $stable = 0;
            public static final Empty INSTANCE = new Empty();

            private Empty() {
                super(null);
            }
        }

        private IllustrationType() {
        }

        /* compiled from: GenericActionableInformationFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/GenericActionableInformationFragment$IllustrationType$Drawable;", "Lcom/robinhood/android/common/GenericActionableInformationFragment$IllustrationType;", "drawableResId", "", "<init>", "(I)V", "getDrawableResId", "()I", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Drawable extends IllustrationType {
            public static final int $stable = 0;
            private final int drawableResId;

            public Drawable(int i) {
                super(null);
                this.drawableResId = i;
            }

            public final int getDrawableResId() {
                return this.drawableResId;
            }
        }

        /* compiled from: GenericActionableInformationFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\b\tB\u0015\b\u0004\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/GenericActionableInformationFragment$IllustrationType$Lottie;", "Lcom/robinhood/android/common/GenericActionableInformationFragment$IllustrationType;", "animatorListener", "Landroid/animation/Animator$AnimatorListener;", "<init>", "(Landroid/animation/Animator$AnimatorListener;)V", "getAnimatorListener", "()Landroid/animation/Animator$AnimatorListener;", "Raw", "Url", "Lcom/robinhood/android/common/GenericActionableInformationFragment$IllustrationType$Lottie$Raw;", "Lcom/robinhood/android/common/GenericActionableInformationFragment$IllustrationType$Lottie$Url;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static abstract class Lottie extends IllustrationType {
            public static final int $stable = 8;
            private final Animator.AnimatorListener animatorListener;

            public /* synthetic */ Lottie(Animator.AnimatorListener animatorListener, DefaultConstructorMarker defaultConstructorMarker) {
                this(animatorListener);
            }

            public /* synthetic */ Lottie(Animator.AnimatorListener animatorListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : animatorListener, null);
            }

            public final Animator.AnimatorListener getAnimatorListener() {
                return this.animatorListener;
            }

            private Lottie(Animator.AnimatorListener animatorListener) {
                super(null);
                this.animatorListener = animatorListener;
            }

            /* compiled from: GenericActionableInformationFragment.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/GenericActionableInformationFragment$IllustrationType$Lottie$Raw;", "Lcom/robinhood/android/common/GenericActionableInformationFragment$IllustrationType$Lottie;", "rawId", "", "animatorListener", "Landroid/animation/Animator$AnimatorListener;", "<init>", "(ILandroid/animation/Animator$AnimatorListener;)V", "getRawId", "()I", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Raw extends Lottie {
                public static final int $stable = 8;
                private final int rawId;

                public final int getRawId() {
                    return this.rawId;
                }

                public Raw(int i, Animator.AnimatorListener animatorListener) {
                    super(animatorListener, null);
                    this.rawId = i;
                }
            }

            /* compiled from: GenericActionableInformationFragment.kt */
            @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/GenericActionableInformationFragment$IllustrationType$Lottie$Url;", "Lcom/robinhood/android/common/GenericActionableInformationFragment$IllustrationType$Lottie;", "url", "Lcom/robinhood/shared/remote/assets/LottieUrl;", "animatorListener", "Landroid/animation/Animator$AnimatorListener;", "<init>", "(Lcom/robinhood/shared/remote/assets/LottieUrl;Landroid/animation/Animator$AnimatorListener;)V", "getUrl", "()Lcom/robinhood/shared/remote/assets/LottieUrl;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Url extends Lottie {
                public static final int $stable = 8;
                private final LottieUrl url;

                public final LottieUrl getUrl() {
                    return this.url;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Url(LottieUrl url, Animator.AnimatorListener animatorListener) {
                    super(animatorListener, null);
                    Intrinsics.checkNotNullParameter(url, "url");
                    this.url = url;
                }
            }
        }
    }

    /* compiled from: GenericActionableInformationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b4\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/GenericActionableInformationFragment$TextType;", "", "<init>", "()V", "Empty", "Resource", "Formatted", "RhResource", "Lcom/robinhood/android/common/GenericActionableInformationFragment$TextType$Empty;", "Lcom/robinhood/android/common/GenericActionableInformationFragment$TextType$Formatted;", "Lcom/robinhood/android/common/GenericActionableInformationFragment$TextType$Resource;", "Lcom/robinhood/android/common/GenericActionableInformationFragment$TextType$RhResource;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    protected static abstract class TextType {
        public /* synthetic */ TextType(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: GenericActionableInformationFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/GenericActionableInformationFragment$TextType$Empty;", "Lcom/robinhood/android/common/GenericActionableInformationFragment$TextType;", "<init>", "()V", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Empty extends TextType {
            public static final int $stable = 0;
            public static final Empty INSTANCE = new Empty();

            private Empty() {
                super(null);
            }
        }

        private TextType() {
        }

        /* compiled from: GenericActionableInformationFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/GenericActionableInformationFragment$TextType$Resource;", "Lcom/robinhood/android/common/GenericActionableInformationFragment$TextType;", "stringResId", "", "<init>", "(I)V", "getStringResId", "()I", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Resource extends TextType {
            public static final int $stable = 0;
            private final int stringResId;

            public Resource(int i) {
                super(null);
                this.stringResId = i;
            }

            public final int getStringResId() {
                return this.stringResId;
            }
        }

        /* compiled from: GenericActionableInformationFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/GenericActionableInformationFragment$TextType$Formatted;", "Lcom/robinhood/android/common/GenericActionableInformationFragment$TextType;", "formattedStringRes", "", "<init>", "(Ljava/lang/CharSequence;)V", "getFormattedStringRes", "()Ljava/lang/CharSequence;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Formatted extends TextType {
            public static final int $stable = 8;
            private final CharSequence formattedStringRes;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Formatted(CharSequence formattedStringRes) {
                super(null);
                Intrinsics.checkNotNullParameter(formattedStringRes, "formattedStringRes");
                this.formattedStringRes = formattedStringRes;
            }

            public final CharSequence getFormattedStringRes() {
                return this.formattedStringRes;
            }
        }

        /* compiled from: GenericActionableInformationFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/GenericActionableInformationFragment$TextType$RhResource;", "Lcom/robinhood/android/common/GenericActionableInformationFragment$TextType;", "stringResource", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;)V", "getStringResource", "()Lcom/robinhood/utils/resource/StringResource;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class RhResource extends TextType {
            public static final int $stable = StringResource.$stable;
            private final StringResource stringResource;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RhResource(StringResource stringResource) {
                super(null);
                Intrinsics.checkNotNullParameter(stringResource, "stringResource");
                this.stringResource = stringResource;
            }

            public final StringResource getStringResource() {
                return this.stringResource;
            }
        }
    }

    public static /* synthetic */ IllustrationType.Lottie.Raw toLottieIllustration$default(GenericActionableInformationFragment genericActionableInformationFragment, int i, Animator.AnimatorListener animatorListener, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toLottieIllustration");
        }
        if ((i2 & 1) != 0) {
            animatorListener = null;
        }
        return genericActionableInformationFragment.toLottieIllustration(i, animatorListener);
    }

    protected final IllustrationType.Lottie.Raw toLottieIllustration(int i, Animator.AnimatorListener animatorListener) {
        return new IllustrationType.Lottie.Raw(i, animatorListener);
    }

    public static /* synthetic */ IllustrationType.Lottie.Url toLottieIllustration$default(GenericActionableInformationFragment genericActionableInformationFragment, LottieUrl lottieUrl, Animator.AnimatorListener animatorListener, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toLottieIllustration");
        }
        if ((i & 1) != 0) {
            animatorListener = null;
        }
        return genericActionableInformationFragment.toLottieIllustration(lottieUrl, animatorListener);
    }

    protected final IllustrationType.Lottie.Url toLottieIllustration(LottieUrl lottieUrl, Animator.AnimatorListener animatorListener) {
        Intrinsics.checkNotNullParameter(lottieUrl, "<this>");
        return new IllustrationType.Lottie.Url(lottieUrl, animatorListener);
    }

    protected final IllustrationType.Drawable toDrawableIllustration(int i) {
        return new IllustrationType.Drawable(i);
    }

    protected final TextType.Resource toText(int i) {
        return new TextType.Resource(i);
    }

    protected final TextType.Formatted toText(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return new TextType.Formatted(charSequence);
    }

    protected final TextType.RhResource toText(StringResource stringResource) {
        Intrinsics.checkNotNullParameter(stringResource, "<this>");
        return new TextType.RhResource(stringResource);
    }

    protected final TextType orEmpty(TextType textType) {
        return textType == null ? TextType.Empty.INSTANCE : textType;
    }
}
