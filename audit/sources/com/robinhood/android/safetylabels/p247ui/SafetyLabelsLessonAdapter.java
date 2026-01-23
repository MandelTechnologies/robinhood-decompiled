package com.robinhood.android.safetylabels.p247ui;

import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionConfig;
import com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.safetylabels.C27803R;
import com.robinhood.rosetta.eventlogging.SafetyLabelLesson;
import com.robinhood.shared.models.p387db.bonfire.education.safetylabels.SafetyLabelsLessonSection;
import com.robinhood.staticcontent.util.Markwons;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ViewGroups;
import io.noties.markwon.Markwon;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SafetyLabelsLessonAdapter.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0016\u0017B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/shared/models/db/bonfire/education/safetylabels/SafetyLabelsLessonSection;", "Lcom/robinhood/android/common/util/SimpleViewHolder;", "markwon", "Lio/noties/markwon/Markwon;", "rdsInlineDefinitionConfig", "Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionConfig;", "safetyLabelLesson", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelLesson;", "<init>", "(Lio/noties/markwon/Markwon;Lcom/robinhood/android/designsystem/inlinedefinition/RdsInlineDefinitionConfig;Lcom/robinhood/rosetta/eventlogging/SafetyLabelLesson;)V", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "DiffCallback", "Companion", "feature-safety-labels_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SafetyLabelsLessonAdapter extends ListAdapter<SafetyLabelsLessonSection, SimpleViewHolder> {
    public static final int VIEW_TYPE_CONTENT = 1;
    public static final int VIEW_TYPE_HEADER = 0;
    public static final int VIEW_TYPE_SLIDES = 2;
    private final Markwon markwon;
    private final RdsInlineDefinitionConfig rdsInlineDefinitionConfig;
    private final SafetyLabelLesson safetyLabelLesson;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyLabelsLessonAdapter(Markwon markwon, RdsInlineDefinitionConfig rdsInlineDefinitionConfig, SafetyLabelLesson safetyLabelLesson) {
        super(DiffCallback.INSTANCE);
        Intrinsics.checkNotNullParameter(markwon, "markwon");
        Intrinsics.checkNotNullParameter(rdsInlineDefinitionConfig, "rdsInlineDefinitionConfig");
        this.markwon = markwon;
        this.rdsInlineDefinitionConfig = rdsInlineDefinitionConfig;
        this.safetyLabelLesson = safetyLabelLesson;
    }

    /* compiled from: SafetyLabelsLessonAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/robinhood/shared/models/db/bonfire/education/safetylabels/SafetyLabelsLessonSection;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "feature-safety-labels_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DiffCallback extends DiffUtil.ItemCallback<SafetyLabelsLessonSection> {
        public static final DiffCallback INSTANCE = new DiffCallback();
        public static final int $stable = 8;

        private DiffCallback() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(SafetyLabelsLessonSection oldItem, SafetyLabelsLessonSection newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if ((oldItem instanceof SafetyLabelsLessonSection.Header) && (newItem instanceof SafetyLabelsLessonSection.Header)) {
                return Intrinsics.areEqual(((SafetyLabelsLessonSection.Header) oldItem).getTitle(), ((SafetyLabelsLessonSection.Header) newItem).getTitle());
            }
            if ((oldItem instanceof SafetyLabelsLessonSection.TextContent) && (newItem instanceof SafetyLabelsLessonSection.TextContent)) {
                return Intrinsics.areEqual(((SafetyLabelsLessonSection.TextContent) oldItem).getContent(), ((SafetyLabelsLessonSection.TextContent) newItem).getContent());
            }
            if ((oldItem instanceof SafetyLabelsLessonSection.SlidesContent) && (newItem instanceof SafetyLabelsLessonSection.SlidesContent)) {
                return Intrinsics.areEqual(oldItem, newItem);
            }
            return false;
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(SafetyLabelsLessonSection oldItem, SafetyLabelsLessonSection newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        SafetyLabelsLessonSection item = getItem(position);
        if (item instanceof SafetyLabelsLessonSection.Header) {
            return 0;
        }
        if (item instanceof SafetyLabelsLessonSection.TextContent) {
            return 1;
        }
        if (item instanceof SafetyLabelsLessonSection.SlidesContent) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            return new SimpleViewHolder(ViewGroups.inflate$default(parent, C27803R.layout.include_safety_labels_lesson_header_view, false, 2, null));
        }
        if (viewType == 1) {
            return new SimpleViewHolder(ViewGroups.inflate$default(parent, C27803R.layout.include_safety_labels_lesson_content_text_view, false, 2, null));
        }
        if (viewType == 2) {
            return new SimpleViewHolder(SafetyLabelsSlidesView.INSTANCE.inflate(parent));
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
        throw new ExceptionsH();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        SafetyLabelsLessonSection item = getItem(position);
        if (item instanceof SafetyLabelsLessonSection.Header) {
            View view = holder.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.designsystem.text.RhTextView");
            ((RhTextView) view).setText(((SafetyLabelsLessonSection.Header) item).getTitle());
        } else {
            if (item instanceof SafetyLabelsLessonSection.TextContent) {
                View view2 = holder.itemView;
                Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.android.designsystem.inlinedefinition.RdsInlineDefinitionTextView");
                RdsInlineDefinitionTextView rdsInlineDefinitionTextView = (RdsInlineDefinitionTextView) view2;
                rdsInlineDefinitionTextView.setConfig(this.rdsInlineDefinitionConfig);
                rdsInlineDefinitionTextView.setSpannableString(new SpannableString(Markwons.toSpanned$default(this.markwon, ((SafetyLabelsLessonSection.TextContent) item).getContent(), null, 2, null)));
                return;
            }
            if (!(item instanceof SafetyLabelsLessonSection.SlidesContent)) {
                throw new NoWhenBranchMatchedException();
            }
            View view3 = holder.itemView;
            Intrinsics.checkNotNull(view3, "null cannot be cast to non-null type com.robinhood.android.safetylabels.ui.SafetyLabelsSlidesView");
            ((SafetyLabelsSlidesView) view3).bind((SafetyLabelsLessonSection.SlidesContent) item, this.safetyLabelLesson);
        }
    }
}
