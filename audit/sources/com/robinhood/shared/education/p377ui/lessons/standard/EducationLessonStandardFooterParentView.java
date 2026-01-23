package com.robinhood.shared.education.p377ui.lessons.standard;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.transition.Fade;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.LearningSection;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.databinding.MergeEducationLessonStandardFooterParentViewBinding;
import com.robinhood.shared.education.p377ui.lessons.standard.EducationLessonStandardFooterCtaView;
import com.robinhood.shared.education.p377ui.lessons.standard.EducationLessonStandardFooterData;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationSectionFooter;
import com.robinhood.utils.extensions.Transitions2;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import io.noties.markwon.Markwon;
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

/* compiled from: EducationLessonStandardFooterParentView.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 52\u00020\u0001:\u000245B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010$\u001a\u00020%H\u0014J\u0016\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*J\u0018\u0010+\u001a\u00020%2\u0006\u0010'\u001a\u00020,2\u0006\u0010)\u001a\u00020*H\u0002J\u0018\u0010-\u001a\u00020%2\u0006\u0010'\u001a\u00020.2\u0006\u0010)\u001a\u00020*H\u0002J\u0018\u0010/\u001a\u00020%2\u0006\u00100\u001a\u0002012\u0006\u0010)\u001a\u00020*H\u0002J\u0010\u00102\u001a\u00020%2\u0006\u0010'\u001a\u000203H\u0002R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000¨\u00066"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterParentView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "callbacks", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterParentView$FooterParentCallbacks;", "getCallbacks", "()Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterParentView$FooterParentCallbacks;", "setCallbacks", "(Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterParentView$FooterParentCallbacks;)V", "binding", "Lcom/robinhood/shared/education/databinding/MergeEducationLessonStandardFooterParentViewBinding;", "getBinding", "()Lcom/robinhood/shared/education/databinding/MergeEducationLessonStandardFooterParentViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "constraintSet", "Landroidx/constraintlayout/widget/ConstraintSet;", "previousPosition", "", "onAttachedToWindow", "", "bind", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterData;", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "bindNextButton", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterData$NextButton;", "bindBackAndNextButtons", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterData$BackAndNextButton;", "bindSectionFooter", Footer.f10637type, "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationSectionFooter;", "bindCtaButtons", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterData$CtaButtons;", "FooterParentCallbacks", "Companion", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class EducationLessonStandardFooterParentView extends Hammer_EducationLessonStandardFooterParentView {
    private static final long CTA_BUTTONS_ANIM_DURATION = 400;
    private static final long NAV_BUTTON_TRANSLATION_ANIM_DURATION = 300;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private FooterParentCallbacks callbacks;
    private final ConstraintSet constraintSet;
    public ImageLoader imageLoader;
    public Markwon markwon;
    private int previousPosition;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EducationLessonStandardFooterParentView.class, "binding", "getBinding()Lcom/robinhood/shared/education/databinding/MergeEducationLessonStandardFooterParentViewBinding;", 0))};
    public static final int $stable = 8;

    /* compiled from: EducationLessonStandardFooterParentView.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterParentView$FooterParentCallbacks;", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterCtaView$FooterCtaCallbacks;", "onBackButtonClicked", "", "onNextButtonClicked", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface FooterParentCallbacks extends EducationLessonStandardFooterCtaView.FooterCtaCallbacks {
        void onBackButtonClicked();

        void onNextButtonClicked();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationLessonStandardFooterParentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C38790R.layout.merge_education_lesson_standard_footer_parent_view, true);
        this.binding = ViewBinding5.viewBinding(this, EducationLessonStandardFooterParentView2.INSTANCE);
        this.constraintSet = new ConstraintSet();
        this.previousPosition = -1;
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
    }

    public final FooterParentCallbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(FooterParentCallbacks footerParentCallbacks) {
        this.callbacks = footerParentCallbacks;
    }

    public final MergeEducationLessonStandardFooterParentViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeEducationLessonStandardFooterParentViewBinding) value;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MergeEducationLessonStandardFooterParentViewBinding binding = getBinding();
        RdsIconButton footerBackButton = binding.footerBackButton;
        Intrinsics.checkNotNullExpressionValue(footerBackButton, "footerBackButton");
        ViewsKt.setLoggingConfig(footerBackButton, new AutoLoggingConfig(false, false, 1, null));
        RdsIconButton footerBackButton2 = binding.footerBackButton;
        Intrinsics.checkNotNullExpressionValue(footerBackButton2, "footerBackButton");
        OnClickListeners.onClick(footerBackButton2, new Function0() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFooterParentView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationLessonStandardFooterParentView.onAttachedToWindow$lambda$2$lambda$0(this.f$0);
            }
        });
        RdsIconButton footerNextButton = binding.footerNextButton;
        Intrinsics.checkNotNullExpressionValue(footerNextButton, "footerNextButton");
        ViewsKt.setLoggingConfig(footerNextButton, new AutoLoggingConfig(false, false, 1, null));
        RdsIconButton footerNextButton2 = binding.footerNextButton;
        Intrinsics.checkNotNullExpressionValue(footerNextButton2, "footerNextButton");
        OnClickListeners.onClick(footerNextButton2, new Function0() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFooterParentView$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationLessonStandardFooterParentView.onAttachedToWindow$lambda$2$lambda$1(this.f$0);
            }
        });
        binding.footerCtaButtons.setCallbacks(this.callbacks);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$2$lambda$0(EducationLessonStandardFooterParentView educationLessonStandardFooterParentView) {
        FooterParentCallbacks footerParentCallbacks = educationLessonStandardFooterParentView.callbacks;
        if (footerParentCallbacks != null) {
            footerParentCallbacks.onBackButtonClicked();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$2$lambda$1(EducationLessonStandardFooterParentView educationLessonStandardFooterParentView) {
        FooterParentCallbacks footerParentCallbacks = educationLessonStandardFooterParentView.callbacks;
        if (footerParentCallbacks != null) {
            footerParentCallbacks.onNextButtonClicked();
        }
        return Unit.INSTANCE;
    }

    public final void bind(EducationLessonStandardFooterData data, DayNightOverlay dayNightOverlay) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        boolean z = data instanceof EducationLessonStandardFooterData.None;
        if (z) {
            ConstraintLayout footerContent = getBinding().footerContent;
            Intrinsics.checkNotNullExpressionValue(footerContent, "footerContent");
            footerContent.setVisibility(8);
            return;
        }
        ConstraintLayout footerContent2 = getBinding().footerContent;
        Intrinsics.checkNotNullExpressionValue(footerContent2, "footerContent");
        footerContent2.setVisibility(0);
        if (data instanceof EducationLessonStandardFooterData.NextButton) {
            bindNextButton((EducationLessonStandardFooterData.NextButton) data, dayNightOverlay);
            return;
        }
        if (data instanceof EducationLessonStandardFooterData.BackAndNextButton) {
            bindBackAndNextButtons((EducationLessonStandardFooterData.BackAndNextButton) data, dayNightOverlay);
        } else if (data instanceof EducationLessonStandardFooterData.CtaButtons) {
            bindCtaButtons((EducationLessonStandardFooterData.CtaButtons) data);
        } else if (!z) {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void bindNextButton(final EducationLessonStandardFooterData.NextButton data, DayNightOverlay dayNightOverlay) {
        MergeEducationLessonStandardFooterParentViewBinding binding = getBinding();
        LinearLayout disclosureSection = binding.disclosureSection;
        Intrinsics.checkNotNullExpressionValue(disclosureSection, "disclosureSection");
        disclosureSection.setVisibility(data.getSectionFooter() != null ? 0 : 8);
        Transitions2.beginDelayedTransition(this, new Fade());
        if (data.getSectionFooter() != null) {
            bindSectionFooter(data.getSectionFooter(), dayNightOverlay);
        }
        this.constraintSet.clone(getContext(), C38790R.layout.education_lesson_standard_next_button_constraints);
        this.constraintSet.applyTo(binding.footerContent);
        RdsIconButton footerNextButton = binding.footerNextButton;
        Intrinsics.checkNotNullExpressionValue(footerNextButton, "footerNextButton");
        ViewsKt.eventData$default(footerNextButton, false, new Function0() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFooterParentView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationLessonStandardFooterParentView.bindNextButton$lambda$4$lambda$3(data);
            }
        }, 1, null);
        if (data.getEventContext().getItem_position() != this.previousPosition) {
            this.previousPosition = data.getEventContext().getItem_position();
            RdsIconButton footerNextButton2 = binding.footerNextButton;
            Intrinsics.checkNotNullExpressionValue(footerNextButton2, "footerNextButton");
            ViewsKt.logAppear$default(footerNextButton2, null, false, 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bindNextButton$lambda$4$lambda$3(EducationLessonStandardFooterData.NextButton nextButton) {
        LearningSection learning_section = nextButton.getEventContext().getLearning_section();
        return new UserInteractionEventDescriptor((learning_section != null ? learning_section.getIdentifier() : null) + "-next-button", null, UserInteractionEventData.Action.CONTINUE, nextButton.getEventContext(), new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, 34, null);
    }

    private final void bindBackAndNextButtons(final EducationLessonStandardFooterData.BackAndNextButton data, DayNightOverlay dayNightOverlay) {
        MergeEducationLessonStandardFooterParentViewBinding binding = getBinding();
        LinearLayout disclosureSection = binding.disclosureSection;
        Intrinsics.checkNotNullExpressionValue(disclosureSection, "disclosureSection");
        disclosureSection.setVisibility(data.getSectionFooter() != null ? 0 : 8);
        Transitions2.beginDelayedTransition(this, new Fade());
        if (data.getSectionFooter() != null) {
            bindSectionFooter(data.getSectionFooter(), dayNightOverlay);
        }
        this.constraintSet.clone(getContext(), C38790R.layout.education_lesson_standard_prev_next_button_constraints);
        this.constraintSet.applyTo(binding.footerContent);
        RdsIconButton footerBackButton = binding.footerBackButton;
        Intrinsics.checkNotNullExpressionValue(footerBackButton, "footerBackButton");
        ViewsKt.eventData$default(footerBackButton, false, new Function0() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFooterParentView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationLessonStandardFooterParentView.bindBackAndNextButtons$lambda$7$lambda$5(data);
            }
        }, 1, null);
        RdsIconButton footerNextButton = binding.footerNextButton;
        Intrinsics.checkNotNullExpressionValue(footerNextButton, "footerNextButton");
        ViewsKt.eventData$default(footerNextButton, false, new Function0() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFooterParentView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationLessonStandardFooterParentView.bindBackAndNextButtons$lambda$7$lambda$6(data);
            }
        }, 1, null);
        if (data.getEventContext().getItem_position() != this.previousPosition) {
            this.previousPosition = data.getEventContext().getItem_position();
            RdsIconButton footerBackButton2 = binding.footerBackButton;
            Intrinsics.checkNotNullExpressionValue(footerBackButton2, "footerBackButton");
            ViewsKt.logAppear$default(footerBackButton2, null, false, 3, null);
            RdsIconButton footerNextButton2 = binding.footerNextButton;
            Intrinsics.checkNotNullExpressionValue(footerNextButton2, "footerNextButton");
            ViewsKt.logAppear$default(footerNextButton2, null, false, 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bindBackAndNextButtons$lambda$7$lambda$5(EducationLessonStandardFooterData.BackAndNextButton backAndNextButton) {
        LearningSection learning_section = backAndNextButton.getEventContext().getLearning_section();
        return new UserInteractionEventDescriptor((learning_section != null ? learning_section.getIdentifier() : null) + "-back-button", null, UserInteractionEventData.Action.BACK, backAndNextButton.getEventContext(), new Component(Component.ComponentType.BACK_BUTTON, null, null, 6, null), null, 34, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor bindBackAndNextButtons$lambda$7$lambda$6(EducationLessonStandardFooterData.BackAndNextButton backAndNextButton) {
        LearningSection learning_section = backAndNextButton.getEventContext().getLearning_section();
        return new UserInteractionEventDescriptor((learning_section != null ? learning_section.getIdentifier() : null) + "-next-button", null, UserInteractionEventData.Action.CONTINUE, backAndNextButton.getEventContext(), new Component(Component.ComponentType.CONTINUE_BUTTON, null, null, 6, null), null, 34, null);
    }

    private final void bindSectionFooter(EducationSectionFooter footer, DayNightOverlay dayNightOverlay) {
        MergeEducationLessonStandardFooterParentViewBinding binding = getBinding();
        String firstTextSection = footer.getFirstTextSection();
        if (firstTextSection != null) {
            RhTextView firstTextSection2 = binding.firstTextSection;
            Intrinsics.checkNotNullExpressionValue(firstTextSection2, "firstTextSection");
            firstTextSection2.setVisibility(0);
            binding.firstTextSection.setText(getMarkwon().toMarkdown(firstTextSection));
        } else {
            RhTextView firstTextSection3 = binding.firstTextSection;
            Intrinsics.checkNotNullExpressionValue(firstTextSection3, "firstTextSection");
            firstTextSection3.setVisibility(8);
        }
        String secondTextSection = footer.getSecondTextSection();
        if (secondTextSection != null) {
            RhTextView secondTextSection2 = binding.secondTextSection;
            Intrinsics.checkNotNullExpressionValue(secondTextSection2, "secondTextSection");
            secondTextSection2.setVisibility(0);
            binding.secondTextSection.setText(getMarkwon().toMarkdown(secondTextSection));
        } else {
            RhTextView secondTextSection3 = binding.secondTextSection;
            Intrinsics.checkNotNullExpressionValue(secondTextSection3, "secondTextSection");
            secondTextSection3.setVisibility(8);
        }
        EducationSectionFooter.ThemedImage image = footer.getImage();
        if (image == null) {
            ImageView footerImage = binding.footerImage;
            Intrinsics.checkNotNullExpressionValue(footerImage, "footerImage");
            footerImage.setVisibility(8);
            return;
        }
        ImageView footerImage2 = binding.footerImage;
        Intrinsics.checkNotNullExpressionValue(footerImage2, "footerImage");
        footerImage2.setVisibility(0);
        String lightUrl = dayNightOverlay == DayNightOverlay.DAY ? image.getLightUrl() : image.getDarkUrl();
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams = binding.footerImage.getLayoutParams();
        layoutParams.height = (int) TypedValue.applyDimension(1, image.getImageSize().getHeight(), displayMetrics);
        layoutParams.width = (int) TypedValue.applyDimension(1, image.getImageSize().getWidth(), displayMetrics);
        ImageLoader.ImageRequest imageRequestLoad = getImageLoader().load(lightUrl);
        ImageView footerImage3 = binding.footerImage;
        Intrinsics.checkNotNullExpressionValue(footerImage3, "footerImage");
        ImageLoader.ImageRequest.DefaultImpls.into$default(imageRequestLoad, footerImage3, null, null, 6, null);
    }

    private final void bindCtaButtons(EducationLessonStandardFooterData.CtaButtons data) {
        final MergeEducationLessonStandardFooterParentViewBinding binding = getBinding();
        LinearLayout disclosureSection = binding.disclosureSection;
        Intrinsics.checkNotNullExpressionValue(disclosureSection, "disclosureSection");
        disclosureSection.setVisibility(8);
        binding.footerCtaButtons.bind(data);
        EducationLessonStandardFooterCtaView footerCtaButtons = binding.footerCtaButtons;
        Intrinsics.checkNotNullExpressionValue(footerCtaButtons, "footerCtaButtons");
        if (footerCtaButtons.getVisibility() != 0) {
            final float height = binding.footerBackButton.getHeight();
            AnimatorSet animatorSet = new AnimatorSet();
            Property property = View.TRANSLATION_Y;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(binding.footerBackButton, (Property<RdsIconButton, Float>) property, 0.0f, height);
            objectAnimatorOfFloat.setDuration(300L);
            Unit unit = Unit.INSTANCE;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(binding.footerNextButton, (Property<RdsIconButton, Float>) property, 0.0f, height);
            objectAnimatorOfFloat2.setDuration(300L);
            Property property2 = View.ALPHA;
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(binding.footerBackButton, (Property<RdsIconButton, Float>) property2, 1.0f, 0.0f);
            objectAnimatorOfFloat3.setDuration(200L);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(binding.footerNextButton, (Property<RdsIconButton, Float>) property2, 1.0f, 0.0f);
            objectAnimatorOfFloat4.setDuration(200L);
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(binding.footerCtaButtons, (Property<EducationLessonStandardFooterCtaView, Float>) property, height, 0.0f);
            objectAnimatorOfFloat5.setDuration(400L);
            objectAnimatorOfFloat5.setStartDelay(200L);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(binding.footerCtaButtons, (Property<EducationLessonStandardFooterCtaView, Float>) property2, 0.0f, 1.0f);
            objectAnimatorOfFloat6.setDuration(400L);
            objectAnimatorOfFloat6.setStartDelay(200L);
            animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5, objectAnimatorOfFloat6);
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFooterParentView$bindCtaButtons$lambda$23$lambda$22$$inlined$doOnStart$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                    binding.footerCtaButtons.setTranslationY(height);
                    binding.footerCtaButtons.setAlpha(0.0f);
                    EducationLessonStandardFooterCtaView footerCtaButtons2 = binding.footerCtaButtons;
                    Intrinsics.checkNotNullExpressionValue(footerCtaButtons2, "footerCtaButtons");
                    footerCtaButtons2.setVisibility(0);
                }
            });
            animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFooterParentView$bindCtaButtons$lambda$23$lambda$22$$inlined$doOnEnd$1
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    RdsIconButton footerBackButton = binding.footerBackButton;
                    Intrinsics.checkNotNullExpressionValue(footerBackButton, "footerBackButton");
                    footerBackButton.setVisibility(8);
                    RdsIconButton footerNextButton = binding.footerNextButton;
                    Intrinsics.checkNotNullExpressionValue(footerNextButton, "footerNextButton");
                    footerNextButton.setVisibility(8);
                }
            });
            animatorSet.start();
        } else {
            RdsIconButton footerBackButton = binding.footerBackButton;
            Intrinsics.checkNotNullExpressionValue(footerBackButton, "footerBackButton");
            footerBackButton.setVisibility(8);
            RdsIconButton footerNextButton = binding.footerNextButton;
            Intrinsics.checkNotNullExpressionValue(footerNextButton, "footerNextButton");
            footerNextButton.setVisibility(8);
        }
        this.previousPosition = data.getEventItemPosition();
    }
}
