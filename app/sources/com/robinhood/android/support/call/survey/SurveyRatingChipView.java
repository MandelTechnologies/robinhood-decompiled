package com.robinhood.android.support.call.survey;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.progress.RdsProgressBar;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.support.call.survey.SurveyRatingQuestionViewState;
import com.robinhood.shared.support.C39996R;
import com.robinhood.shared.support.databinding.MergeSurveyRatingChipViewBinding;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SurveyRatingChipView.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyRatingChipView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/shared/support/databinding/MergeSurveyRatingChipViewBinding;", "getBinding", "()Lcom/robinhood/shared/support/databinding/MergeSurveyRatingChipViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/support/call/survey/SurveyRatingQuestionViewState$RatingEntry;", "Companion", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class SurveyRatingChipView extends FrameLayout {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SurveyRatingChipView.class, "binding", "getBinding()Lcom/robinhood/shared/support/databinding/MergeSurveyRatingChipViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ SurveyRatingChipView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurveyRatingChipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C39996R.layout.merge_survey_rating_chip_view, true);
        this.binding = ViewBinding5.viewBinding(this, SurveyRatingChipView2.INSTANCE);
    }

    private final MergeSurveyRatingChipViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeSurveyRatingChipViewBinding) value;
    }

    public final void bind(SurveyRatingQuestionViewState.RatingEntry data) {
        Intrinsics.checkNotNullParameter(data, "data");
        setSelected(data.isSelected());
        RhTextView rhTextView = getBinding().surveyRatingChipViewValueTxt;
        Intrinsics.checkNotNull(rhTextView);
        rhTextView.setVisibility(!rhTextView.isSelected() ? 0 : 8);
        getBinding().surveyRatingChipViewValueTxt.setText(data.getData().getText());
        RdsProgressBar surveyRatingChipViewProgressBar = getBinding().surveyRatingChipViewProgressBar;
        Intrinsics.checkNotNullExpressionValue(surveyRatingChipViewProgressBar, "surveyRatingChipViewProgressBar");
        surveyRatingChipViewProgressBar.setVisibility(isSelected() ? 0 : 8);
    }

    /* compiled from: SurveyRatingChipView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/support/call/survey/SurveyRatingChipView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/support/call/survey/SurveyRatingChipView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<SurveyRatingChipView> {
        private final /* synthetic */ Inflater<SurveyRatingChipView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public SurveyRatingChipView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (SurveyRatingChipView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C39996R.layout.include_survey_rating_chip_view);
        }
    }
}
