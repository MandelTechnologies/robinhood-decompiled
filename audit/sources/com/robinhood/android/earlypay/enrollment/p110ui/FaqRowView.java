package com.robinhood.android.earlypay.enrollment.p110ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.designsystem.container.RdsRippleContainerView;
import com.robinhood.android.earlypay.C14433R;
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

/* compiled from: FaqRowView.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dR\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/earlypay/enrollment/ui/FaqRowView;", "Lcom/robinhood/android/designsystem/container/RdsRippleContainerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "questionTxt", "Landroid/widget/TextView;", "getQuestionTxt", "()Landroid/widget/TextView;", "questionTxt$delegate", "Lkotlin/properties/ReadOnlyProperty;", "answerTxt", "getAnswerTxt", "answerTxt$delegate", "expandBtn", "Landroid/widget/ImageView;", "getExpandBtn", "()Landroid/widget/ImageView;", "expandBtn$delegate", "bind", "", "question", "", "answer", "", "expanded", "", "Companion", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FaqRowView extends RdsRippleContainerView {

    /* renamed from: answerTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 answerTxt;

    /* renamed from: expandBtn$delegate, reason: from kotlin metadata */
    private final Interfaces2 expandBtn;

    /* renamed from: questionTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 questionTxt;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(FaqRowView.class, "questionTxt", "getQuestionTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(FaqRowView.class, "answerTxt", "getAnswerTxt()Landroid/widget/TextView;", 0)), Reflection.property1(new PropertyReference1Impl(FaqRowView.class, "expandBtn", "getExpandBtn()Landroid/widget/ImageView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ FaqRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FaqRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C14433R.layout.merge_faq_row_view, true);
        this.questionTxt = BindViewDelegate2.bindView$default(this, C14433R.id.question_txt, null, 2, null);
        this.answerTxt = BindViewDelegate2.bindView$default(this, C14433R.id.answer_txt, null, 2, null);
        this.expandBtn = BindViewDelegate2.bindView$default(this, C14433R.id.expand_answer_btn, null, 2, null);
    }

    private final TextView getQuestionTxt() {
        return (TextView) this.questionTxt.getValue(this, $$delegatedProperties[0]);
    }

    private final TextView getAnswerTxt() {
        return (TextView) this.answerTxt.getValue(this, $$delegatedProperties[1]);
    }

    private final ImageView getExpandBtn() {
        return (ImageView) this.expandBtn.getValue(this, $$delegatedProperties[2]);
    }

    public final void bind(String question, CharSequence answer, boolean expanded) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answer, "answer");
        getQuestionTxt().setText(question);
        getAnswerTxt().setText(answer);
        getAnswerTxt().setVisibility(expanded ? 0 : 8);
        getExpandBtn().setRotation(expanded ? 180.0f : 0.0f);
    }

    /* compiled from: FaqRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/earlypay/enrollment/ui/FaqRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/earlypay/enrollment/ui/FaqRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-early-pay_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<FaqRowView> {
        private final /* synthetic */ Inflater<FaqRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public FaqRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (FaqRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C14433R.layout.include_faq_row_view);
        }
    }
}
