package com.robinhood.shared.education.p377ui.timeline;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.timeline.RdsTimelineRowView;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.shared.education.C38790R;
import com.robinhood.shared.education.databinding.MergeEducationTimelineRowViewBinding;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationTimelineRow;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationTimelineRow3;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: EducationTimelineRowView.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0013B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0003H\u0016R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/timeline/EducationTimelineRowView;", "Landroid/widget/FrameLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationTimelineRow;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/shared/education/databinding/MergeEducationTimelineRowViewBinding;", "getBinding", "()Lcom/robinhood/shared/education/databinding/MergeEducationTimelineRowViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "state", "Companion", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class EducationTimelineRowView extends FrameLayout implements Bindable<EducationTimelineRow> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EducationTimelineRowView.class, "binding", "getBinding()Lcom/robinhood/shared/education/databinding/MergeEducationTimelineRowViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EducationTimelineRowView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EducationTimelineRow3.values().length];
            try {
                iArr[EducationTimelineRow3.COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EducationTimelineRow3.INCOMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EducationTimelineRowView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        ViewGroups.inflate(this, C38790R.layout.merge_education_timeline_row_view, true);
        this.binding = ViewBinding5.viewBinding(this, EducationTimelineRowView2.INSTANCE);
    }

    private final MergeEducationTimelineRowViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeEducationTimelineRowViewBinding) value;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(EducationTimelineRow state) {
        Intrinsics.checkNotNullParameter(state, "state");
        RdsTimelineRowView rdsTimelineRowView = getBinding().educationTimelineRow;
        rdsTimelineRowView.setPrimaryText(state.getTitle());
        rdsTimelineRowView.setPosition(EducationTimelineRows.toViewPosition(state.getPosition()));
        RdsTimelineRowView.State viewState = EducationTimelineRows.toViewState(state.getState());
        if (viewState != null) {
            rdsTimelineRowView.setState(viewState);
            int i = WhenMappings.$EnumSwitchMapping$0[state.getState().ordinal()];
            if (i == 1) {
                rdsTimelineRowView.setIconStyle(RdsTimelineRowView.IconStyle.FILLED);
                Intrinsics.checkNotNull(rdsTimelineRowView);
                rdsTimelineRowView.setIconDrawable(ViewsKt.getDrawable(rdsTimelineRowView, C20690R.drawable.ic_rds_checkmark_16dp));
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                rdsTimelineRowView.setIconStyle(RdsTimelineRowView.IconStyle.OUTLINE);
                Intrinsics.checkNotNull(rdsTimelineRowView);
                rdsTimelineRowView.setIconDrawable(ViewsKt.getDrawable(rdsTimelineRowView, C38790R.drawable.transparent_circle_16dp));
            }
        }
    }

    /* compiled from: EducationTimelineRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/education/ui/timeline/EducationTimelineRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/shared/education/ui/timeline/EducationTimelineRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<EducationTimelineRowView> {
        private final /* synthetic */ Inflater<EducationTimelineRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public EducationTimelineRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (EducationTimelineRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C38790R.layout.include_education_timeline_row_view);
        }
    }
}
