package com.robinhood.android.cash.disputes.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.robinhood.android.cash.disputes.C10007R;
import com.robinhood.android.cash.disputes.databinding.MergeQuestionResponseRowViewBinding;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* compiled from: QuestionResponseRowView.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u0018@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/view/QuestionResponseRowView;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/cash/disputes/databinding/MergeQuestionResponseRowViewBinding;", "getBinding", "()Lcom/robinhood/android/cash/disputes/databinding/MergeQuestionResponseRowViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "value", "", "primaryText", "getPrimaryText", "()Ljava/lang/CharSequence;", "setPrimaryText", "(Ljava/lang/CharSequence;)V", "secondaryText", "getSecondaryText", "setSecondaryText", "", "fileCount", "getFileCount", "()I", "setFileCount", "(I)V", "Companion", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class QuestionResponseRowView extends RdsRippleContainerView {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private int fileCount;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(QuestionResponseRowView.class, "binding", "getBinding()Lcom/robinhood/android/cash/disputes/databinding/MergeQuestionResponseRowViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestionResponseRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, QuestionResponseRowView2.INSTANCE);
        ViewGroups.inflate(this, C10007R.layout.merge_question_response_row_view, true);
    }

    private final MergeQuestionResponseRowViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeQuestionResponseRowViewBinding) value;
    }

    public final CharSequence getPrimaryText() {
        return getBinding().questionResponseRowPrimaryText.getText();
    }

    public final void setPrimaryText(CharSequence charSequence) {
        getBinding().questionResponseRowPrimaryText.setText(charSequence);
    }

    public final CharSequence getSecondaryText() {
        return getBinding().questionResponseRowSecondaryText.getText();
    }

    public final void setSecondaryText(CharSequence charSequence) {
        getBinding().questionResponseRowSecondaryText.setText(charSequence);
        RhTextView questionResponseRowSecondaryText = getBinding().questionResponseRowSecondaryText;
        Intrinsics.checkNotNullExpressionValue(questionResponseRowSecondaryText, "questionResponseRowSecondaryText");
        questionResponseRowSecondaryText.setVisibility(charSequence == null || StringsKt.isBlank(charSequence) ? 8 : 0);
    }

    public final int getFileCount() {
        return this.fileCount;
    }

    public final void setFileCount(int i) {
        this.fileCount = i;
        if (i == 0) {
            ImageView questionResponseRowFileImage = getBinding().questionResponseRowFileImage;
            Intrinsics.checkNotNullExpressionValue(questionResponseRowFileImage, "questionResponseRowFileImage");
            questionResponseRowFileImage.setVisibility(8);
            RhTextView questionResponseRowFileCount = getBinding().questionResponseRowFileCount;
            Intrinsics.checkNotNullExpressionValue(questionResponseRowFileCount, "questionResponseRowFileCount");
            questionResponseRowFileCount.setVisibility(8);
            return;
        }
        ImageView questionResponseRowFileImage2 = getBinding().questionResponseRowFileImage;
        Intrinsics.checkNotNullExpressionValue(questionResponseRowFileImage2, "questionResponseRowFileImage");
        questionResponseRowFileImage2.setVisibility(0);
        RhTextView questionResponseRowFileCount2 = getBinding().questionResponseRowFileCount;
        Intrinsics.checkNotNullExpressionValue(questionResponseRowFileCount2, "questionResponseRowFileCount");
        questionResponseRowFileCount2.setVisibility(0);
        getBinding().questionResponseRowFileCount.setText(getResources().getQuantityString(C10007R.plurals.question_response_row_file_count, i, Integer.valueOf(i)));
    }

    /* compiled from: QuestionResponseRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/disputes/view/QuestionResponseRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/cash/disputes/view/QuestionResponseRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-cash-disputes_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<QuestionResponseRowView> {
        private final /* synthetic */ Inflater<QuestionResponseRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public QuestionResponseRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (QuestionResponseRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C10007R.layout.include_question_response_row_view);
        }
    }
}
