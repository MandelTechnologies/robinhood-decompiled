package com.robinhood.shared.education.p377ui.info;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.SpannableString;
import android.util.AttributeSet;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.databinding.MergeEducationInfoViewBinding;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonSection;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: EducationInfoView.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/info/EducationInfoView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "binding", "Lcom/robinhood/shared/education/databinding/MergeEducationInfoViewBinding;", "getBinding", "()Lcom/robinhood/shared/education/databinding/MergeEducationInfoViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "displayAsCard", "", "bind", "", "state", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonSection$Info;", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class EducationInfoView extends Hammer_EducationInfoView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EducationInfoView.class, "binding", "getBinding()Lcom/robinhood/shared/education/databinding/MergeEducationInfoViewBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private boolean displayAsCard;
    public Markwon markwon;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C38790R.layout.merge_education_info_view, true);
        this.binding = ViewBinding5.viewBinding(this, EducationInfoView2.INSTANCE);
        setOrientation(1);
        int[] EducationInfoView = C38790R.styleable.EducationInfoView;
        Intrinsics.checkNotNullExpressionValue(EducationInfoView, "EducationInfoView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, EducationInfoView, 0, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C38790R.styleable.EducationInfoView_displayAsCard, false);
        this.displayAsCard = z;
        setGravity(z ? 16 : 8388611);
        getBinding().titleTxt.setGravity(this.displayAsCard ? 17 : 8388611);
        getBinding().contentTxt.setGravity(this.displayAsCard ? 17 : 8388611);
        typedArrayObtainStyledAttributes.recycle();
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

    private final MergeEducationInfoViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeEducationInfoViewBinding) value;
    }

    public final void bind(EducationLessonSection.Info state) {
        Intrinsics.checkNotNullParameter(state, "state");
        MergeEducationInfoViewBinding binding = getBinding();
        RhTextView headerTxt = binding.headerTxt;
        Intrinsics.checkNotNullExpressionValue(headerTxt, "headerTxt");
        TextViewsKt.setVisibilityText(headerTxt, !this.displayAsCard ? state.getHeader() : null);
        binding.titleTxt.setText(state.getTitle());
        binding.contentTxt.setSpannableString(new SpannableString(Markwons.toSpanned$default(getMarkwon(), state.getContent(), null, 2, null)));
        binding.contentTxt.setTextColor(state.getTextColor());
        binding.contentTxt.setLinkTextColor(state.getLinkTextColor());
    }
}
