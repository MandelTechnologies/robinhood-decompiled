package com.robinhood.android.shareholderexperience.questionlist;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.shareholder.view.LiveInfoTag;
import com.robinhood.android.designsystem.button.RdsTextButton;
import com.robinhood.android.designsystem.chip.RdsChip;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.shareholderexperience.C28477R;
import com.robinhood.android.shareholderexperience.databinding.MergeQuestionListHeaderViewBinding;
import com.robinhood.android.shareholderexperience.questionlist.QuestionListItem;
import com.robinhood.android.util.extensions.IconExtensions;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.InfoTag;
import com.robinhood.models.serverdriven.experimental.api.InfoTagType;
import com.robinhood.shareholderx.models.p401db.DropdownItem;
import com.robinhood.shareholderx.models.p401db.QaEventMetadata;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: QuestionListHeaderView.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00172\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003:\u0002\u0016\u0017B\u001b\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0005H\u0016R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/graphics/drawable/Drawable$Callback;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListView;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListItem$Header;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListHeaderView$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/shareholderexperience/databinding/MergeQuestionListHeaderViewBinding;", "getBinding", "()Lcom/robinhood/android/shareholderexperience/databinding/MergeQuestionListHeaderViewBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "callbacks", "Callbacks", "Companion", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final class QuestionListHeaderView extends ConstraintLayout implements Drawable.Callback, QuestionListView<QuestionListItem.Header, Callbacks> {

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(QuestionListHeaderView.class, "binding", "getBinding()Lcom/robinhood/android/shareholderexperience/databinding/MergeQuestionListHeaderViewBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: QuestionListHeaderView.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J&\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\fH&¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListHeaderView$Callbacks;", "", "onEventInfoClicked", "", "metadata", "Lcom/robinhood/shareholderx/models/db/QaEventMetadata;", "onDropdownChipClicked", "type", "Lcom/robinhood/android/shareholderexperience/questionlist/DropdownType;", "activeItem", "Lcom/robinhood/shareholderx/models/db/DropdownItem;", "options", "", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onDropdownChipClicked(DropdownType type2, DropdownItem activeItem, List<DropdownItem> options);

        void onEventInfoClicked(QaEventMetadata metadata);
    }

    public /* synthetic */ QuestionListHeaderView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestionListHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C28477R.layout.merge_question_list_header_view, true);
        this.binding = ViewBinding5.viewBinding(this, QuestionListHeaderView2.INSTANCE);
    }

    private final MergeQuestionListHeaderViewBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeQuestionListHeaderViewBinding) value;
    }

    @Override // com.robinhood.android.shareholderexperience.questionlist.QuestionListView
    public void bind(final QuestionListItem.Header item, final Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        MergeQuestionListHeaderViewBinding binding = getBinding();
        QaEventMetadata.Header header = item.getMetadata().getHeader();
        binding.questionListHeaderTitle.setText(header.getTitle());
        binding.questionListHeaderSubtitle.setText(header.getSubtitle());
        binding.questionListHeaderDescription.setText(header.getDescription());
        View view = binding.questionListHeaderBanner;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        view.setBackgroundColor(UtilKt.getPrimaryColor(header, context));
        binding.questionListHeaderInfoTag.setVisibility(header.getInfoTag() == null ? 4 : 0);
        InfoTag<GenericAction> infoTag = header.getInfoTag();
        if (infoTag != null) {
            LiveInfoTag liveInfoTag = binding.questionListHeaderInfoTag;
            InfoTagType type2 = infoTag.getType();
            Icon icon = infoTag.getIcon();
            LiveInfoTag.setInfoTagData$default(liveInfoTag, type2, icon != null ? Integer.valueOf(IconExtensions.getResourceId(icon)) : null, infoTag.getLabel(), this, header.getLiveCall(), false, 32, null);
        }
        RdsTextButton questionListHeaderEventInfoButton = binding.questionListHeaderEventInfoButton;
        Intrinsics.checkNotNullExpressionValue(questionListHeaderEventInfoButton, "questionListHeaderEventInfoButton");
        OnClickListeners.onClick(questionListHeaderEventInfoButton, new Function0() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListHeaderView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuestionListHeaderView.bind$lambda$6$lambda$1(callbacks, item);
            }
        });
        DropdownItem activeFilter = item.getActiveFilter();
        DropdownItem activeSort = item.getActiveSort();
        LinearLayout questionListHeaderDropdowns = binding.questionListHeaderDropdowns;
        Intrinsics.checkNotNullExpressionValue(questionListHeaderDropdowns, "questionListHeaderDropdowns");
        questionListHeaderDropdowns.setVisibility(activeFilter != null || activeSort != null ? 0 : 8);
        UtilKt.bindOrHide(binding.questionListHeaderFilterChip, activeFilter, new Function2() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListHeaderView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return QuestionListHeaderView.bind$lambda$6$lambda$3(callbacks, item, (RdsChip) obj, (DropdownItem) obj2);
            }
        });
        UtilKt.bindOrHide(binding.questionListSortChip, activeSort, new Function2() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListHeaderView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return QuestionListHeaderView.bind$lambda$6$lambda$5(callbacks, item, (RdsChip) obj, (DropdownItem) obj2);
            }
        });
        getBinding().questionListPortraitsCarousel.bind(header.getIcon(), header.getPortraits(), header.getSymbol());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$6$lambda$1(Callbacks callbacks, QuestionListItem.Header header) {
        callbacks.onEventInfoClicked(header.getMetadata());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$6$lambda$3(final Callbacks callbacks, final QuestionListItem.Header header, RdsChip bindOrHide, final DropdownItem filter) {
        Intrinsics.checkNotNullParameter(bindOrHide, "$this$bindOrHide");
        Intrinsics.checkNotNullParameter(filter, "filter");
        bindOrHide.setText(filter.getLabel());
        OnClickListeners.onClick(bindOrHide, new Function0() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListHeaderView$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuestionListHeaderView.bind$lambda$6$lambda$3$lambda$2(callbacks, filter, header);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$6$lambda$3$lambda$2(Callbacks callbacks, DropdownItem dropdownItem, QuestionListItem.Header header) {
        callbacks.onDropdownChipClicked(DropdownType.FILTER, dropdownItem, header.getMetadata().getFilters());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$6$lambda$5(final Callbacks callbacks, final QuestionListItem.Header header, RdsChip bindOrHide, final DropdownItem sort) {
        Intrinsics.checkNotNullParameter(bindOrHide, "$this$bindOrHide");
        Intrinsics.checkNotNullParameter(sort, "sort");
        bindOrHide.setText(sort.getLabel());
        OnClickListeners.onClick(bindOrHide, new Function0() { // from class: com.robinhood.android.shareholderexperience.questionlist.QuestionListHeaderView$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return QuestionListHeaderView.bind$lambda$6$lambda$5$lambda$4(callbacks, sort, header);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$6$lambda$5$lambda$4(Callbacks callbacks, DropdownItem dropdownItem, QuestionListItem.Header header) {
        callbacks.onDropdownChipClicked(DropdownType.SORT, dropdownItem, header.getMetadata().getSorters());
        return Unit.INSTANCE;
    }

    /* compiled from: QuestionListHeaderView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListHeaderView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/shareholderexperience/questionlist/QuestionListHeaderView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-shareholder-experience_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<QuestionListHeaderView> {
        private final /* synthetic */ Inflater<QuestionListHeaderView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public QuestionListHeaderView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (QuestionListHeaderView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C28477R.layout.include_question_list_header_view);
        }
    }
}
