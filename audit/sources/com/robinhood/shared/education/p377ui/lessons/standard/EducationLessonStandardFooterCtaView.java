package com.robinhood.shared.education.p377ui.lessons.standard;

import android.content.Context;
import android.util.AttributeSet;
import com.robinhood.android.autoeventlogging.AutoLoggingConfig;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.rosetta.eventlogging.LearningLesson;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.databinding.MergeEducationLessonFooterCtaViewBinding;
import com.robinhood.shared.education.p377ui.lessons.standard.EducationLessonStandardFooterData;
import com.robinhood.shared.education.util.RdsButtons2;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import io.noties.markwon.Markwon;
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
import kotlin.text.StringsKt;

/* compiled from: EducationLessonStandardFooterCtaView.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001%B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#J\u0010\u0010$\u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0002R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0014\u001a\u00020\u00158\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001a\u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001d¨\u0006&"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterCtaView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterCtaView$FooterCtaCallbacks;", "getCallbacks", "()Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterCtaView$FooterCtaCallbacks;", "setCallbacks", "(Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterCtaView$FooterCtaCallbacks;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "binding", "Lcom/robinhood/shared/education/databinding/MergeEducationLessonFooterCtaViewBinding;", "getBinding", "()Lcom/robinhood/shared/education/databinding/MergeEducationLessonFooterCtaViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterData$CtaButtons;", "onDeeplinkAction", "FooterCtaCallbacks", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class EducationLessonStandardFooterCtaView extends Hammer_EducationLessonStandardFooterCtaView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EducationLessonStandardFooterCtaView.class, "binding", "getBinding()Lcom/robinhood/shared/education/databinding/MergeEducationLessonFooterCtaViewBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private FooterCtaCallbacks callbacks;
    public Markwon markwon;
    public Navigator navigator;

    /* compiled from: EducationLessonStandardFooterCtaView.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/lessons/standard/EducationLessonStandardFooterCtaView$FooterCtaCallbacks;", "", "onDismissAction", "", "onFinishWithResultAction", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface FooterCtaCallbacks {
        void onDismissAction();

        void onFinishWithResultAction();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationLessonStandardFooterCtaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        ViewGroups.inflate(this, C38790R.layout.merge_education_lesson_footer_cta_view, true);
        this.binding = ViewBinding5.viewBinding(this, EducationLessonStandardFooterCtaView2.INSTANCE);
        RdsButton primaryCtaButton = getBinding().primaryCtaButton;
        Intrinsics.checkNotNullExpressionValue(primaryCtaButton, "primaryCtaButton");
        ViewsKt.setLoggingConfig(primaryCtaButton, new AutoLoggingConfig(false, false));
        RdsButton secondaryCtaButton = getBinding().secondaryCtaButton;
        Intrinsics.checkNotNullExpressionValue(secondaryCtaButton, "secondaryCtaButton");
        ViewsKt.setLoggingConfig(secondaryCtaButton, new AutoLoggingConfig(false, false));
    }

    public final FooterCtaCallbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(FooterCtaCallbacks footerCtaCallbacks) {
        this.callbacks = footerCtaCallbacks;
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
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

    public final MergeEducationLessonFooterCtaViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeEducationLessonFooterCtaViewBinding) value;
    }

    public final void bind(final EducationLessonStandardFooterData.CtaButtons data) {
        Intrinsics.checkNotNullParameter(data, "data");
        RdsButton primaryCtaButton = getBinding().primaryCtaButton;
        Intrinsics.checkNotNullExpressionValue(primaryCtaButton, "primaryCtaButton");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RdsButtons2.bindLessonCta(primaryCtaButton, context, data.getPrimaryCta(), null, null, getNavigator(), data.getLearningLesson(), data.getEventItemPosition(), data.getEventItemCount(), new Function0() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFooterCtaView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationLessonStandardFooterCtaView.bind$lambda$0(this.f$0);
            }
        }, new Function0() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFooterCtaView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationLessonStandardFooterCtaView.bind$lambda$1(this.f$0);
            }
        }, new Function0() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFooterCtaView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationLessonStandardFooterCtaView.bind$lambda$2(this.f$0, data);
            }
        });
        RdsButton secondaryCtaButton = getBinding().secondaryCtaButton;
        Intrinsics.checkNotNullExpressionValue(secondaryCtaButton, "secondaryCtaButton");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        RdsButtons2.bindLessonCta(secondaryCtaButton, context2, data.getSecondaryCta(), null, null, getNavigator(), data.getLearningLesson(), data.getEventItemPosition(), data.getEventItemCount(), new Function0() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFooterCtaView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationLessonStandardFooterCtaView.bind$lambda$3(this.f$0);
            }
        }, new Function0() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFooterCtaView$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationLessonStandardFooterCtaView.bind$lambda$4(this.f$0);
            }
        }, new Function0() { // from class: com.robinhood.shared.education.ui.lessons.standard.EducationLessonStandardFooterCtaView$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationLessonStandardFooterCtaView.bind$lambda$5(this.f$0, data);
            }
        });
        getBinding().disclosure.setText(Markwons.toSpanned$default(getMarkwon(), data.getDisclosure(), null, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(EducationLessonStandardFooterCtaView educationLessonStandardFooterCtaView) {
        FooterCtaCallbacks footerCtaCallbacks = educationLessonStandardFooterCtaView.callbacks;
        if (footerCtaCallbacks != null) {
            footerCtaCallbacks.onDismissAction();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$2(EducationLessonStandardFooterCtaView educationLessonStandardFooterCtaView, EducationLessonStandardFooterData.CtaButtons ctaButtons) {
        educationLessonStandardFooterCtaView.onDeeplinkAction(ctaButtons);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$1(EducationLessonStandardFooterCtaView educationLessonStandardFooterCtaView) {
        FooterCtaCallbacks footerCtaCallbacks = educationLessonStandardFooterCtaView.callbacks;
        if (footerCtaCallbacks != null) {
            footerCtaCallbacks.onFinishWithResultAction();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$3(EducationLessonStandardFooterCtaView educationLessonStandardFooterCtaView) {
        FooterCtaCallbacks footerCtaCallbacks = educationLessonStandardFooterCtaView.callbacks;
        if (footerCtaCallbacks != null) {
            footerCtaCallbacks.onDismissAction();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$5(EducationLessonStandardFooterCtaView educationLessonStandardFooterCtaView, EducationLessonStandardFooterData.CtaButtons ctaButtons) {
        educationLessonStandardFooterCtaView.onDeeplinkAction(ctaButtons);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$4(EducationLessonStandardFooterCtaView educationLessonStandardFooterCtaView) {
        FooterCtaCallbacks footerCtaCallbacks = educationLessonStandardFooterCtaView.callbacks;
        if (footerCtaCallbacks != null) {
            footerCtaCallbacks.onFinishWithResultAction();
        }
        return Unit.INSTANCE;
    }

    private final void onDeeplinkAction(EducationLessonStandardFooterData.CtaButtons data) {
        String identifier;
        LearningLesson learningLesson = data.getLearningLesson();
        if (learningLesson == null || (identifier = learningLesson.getIdentifier()) == null || !StringsKt.startsWith$default(identifier, "slip-learning-lesson-content-", false, 2, (Object) null)) {
            Views.baseActivity(this).finish();
        }
    }
}
