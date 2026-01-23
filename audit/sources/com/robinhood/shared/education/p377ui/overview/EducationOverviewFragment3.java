package com.robinhood.shared.education.p377ui.overview;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DiffUtil;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.shared.education.p377ui.overview.EducationOverviewItemView;
import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationOverviewFragment.kt */
@Metadata(m3635d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001e\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0014¨\u0006\t"}, m3636d2 = {"com/robinhood/shared/education/ui/overview/EducationOverviewFragment$listAdapter$1", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/shared/education/ui/overview/EducationOverviewItemView;", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;", "onBindViewHolder", "", "holder", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "feature-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.education.ui.overview.EducationOverviewFragment$listAdapter$1, reason: use source file name */
/* loaded from: classes6.dex */
public final class EducationOverviewFragment3 extends GenericListAdapter<EducationOverviewItemView, EducationLessonPreview> {
    final /* synthetic */ EducationOverviewFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EducationOverviewFragment3(EducationOverviewFragment educationOverviewFragment, EducationOverviewItemView.Companion companion, DiffUtil.ItemCallback<EducationLessonPreview> itemCallback) {
        super(companion, itemCallback);
        this.this$0 = educationOverviewFragment;
    }

    @Override // com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter
    public /* bridge */ /* synthetic */ void onBindViewHolder(GenericViewHolder genericViewHolder, EducationLessonPreview educationLessonPreview) {
        onBindViewHolder2((GenericViewHolder<EducationOverviewItemView>) genericViewHolder, educationLessonPreview);
    }

    /* renamed from: onBindViewHolder, reason: avoid collision after fix types in other method */
    protected void onBindViewHolder2(GenericViewHolder<EducationOverviewItemView> holder, final EducationLessonPreview item) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(item, "item");
        View view = holder.getView();
        final EducationOverviewFragment educationOverviewFragment = this.this$0;
        EducationOverviewItemView educationOverviewItemView = (EducationOverviewItemView) view;
        educationOverviewItemView.bind(item);
        OnClickListeners.onClick(educationOverviewItemView, new Function0() { // from class: com.robinhood.shared.education.ui.overview.EducationOverviewFragment$listAdapter$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EducationOverviewFragment3.onBindViewHolder$lambda$1$lambda$0(educationOverviewFragment, item, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$1$lambda$0(EducationOverviewFragment educationOverviewFragment, EducationLessonPreview educationLessonPreview, EducationOverviewFragment3 educationOverviewFragment3) {
        educationOverviewFragment.getCallbacks().onEducationLessonClicked(educationLessonPreview, educationOverviewFragment3.getCurrentList().indexOf(educationLessonPreview), ((LegacyIntentKey.EducationOverview) EducationOverviewFragment.INSTANCE.getArgs((Fragment) educationOverviewFragment)).getSource());
        return Unit.INSTANCE;
    }
}
