package com.robinhood.shared.education.p377ui.timeline;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.databinding.MergeEducationTimelineViewBinding;
import com.robinhood.shared.education.p377ui.timeline.EducationTimelineRowView;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonSection;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationTimelineRow;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: EducationTimelineView.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0003H\u0016R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/timeline/EducationTimelineView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonSection$Timeline;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "binding", "Lcom/robinhood/shared/education/databinding/MergeEducationTimelineViewBinding;", "getBinding", "()Lcom/robinhood/shared/education/databinding/MergeEducationTimelineViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "timelineAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/shared/education/ui/timeline/EducationTimelineRowView;", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationTimelineRow;", "bind", "", "state", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class EducationTimelineView extends Hammer_EducationTimelineView implements Bindable<EducationLessonSection.Timeline> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EducationTimelineView.class, "binding", "getBinding()Lcom/robinhood/shared/education/databinding/MergeEducationTimelineViewBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public Markwon markwon;
    private final GenericListAdapter<EducationTimelineRowView, EducationTimelineRow> timelineAdapter;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationTimelineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        ViewGroups.inflate(this, C38790R.layout.merge_education_timeline_view, true);
        this.binding = ViewBinding5.viewBinding(this, EducationTimelineView2.INSTANCE);
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        EducationTimelineRowView.Companion companion2 = EducationTimelineRowView.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        GenericListAdapter<EducationTimelineRowView, EducationTimelineRow> genericListAdapterM2986of = companion.m2986of(companion2, DiffCallbacks.Equality.INSTANCE);
        this.timelineAdapter = genericListAdapterM2986of;
        RecyclerView recyclerView = getBinding().timelineRecyclerView;
        recyclerView.setAdapter(genericListAdapterM2986of);
        recyclerView.suppressLayout(true);
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

    private final MergeEducationTimelineViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeEducationTimelineViewBinding) value;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(EducationLessonSection.Timeline state) {
        Intrinsics.checkNotNullParameter(state, "state");
        MergeEducationTimelineViewBinding binding = getBinding();
        binding.headerTxt.setText(state.getHeader());
        binding.titleTxt.setText(state.getTitle());
        binding.contentTxt.setSpannableString(new SpannableString(Markwons.toSpanned$default(getMarkwon(), state.getContent(), null, 2, null)));
        binding.contentTxt.setTextColor(state.getTextColor());
        binding.contentTxt.setLinkTextColor(state.getLinkTextColor());
        this.timelineAdapter.submitList(state.getTimelineRows());
    }
}
