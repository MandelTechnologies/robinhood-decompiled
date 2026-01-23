package com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub;

import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub.section.IpoLearningHubBulletedListSectionView;
import com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub.section.IpoLearningHubCarouselSectionView;
import com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub.section.IpoLearningHubLabelSectionView;
import com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub.section.IpoLearningHubLottieSectionView;
import com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub.section.IpoLearningHubNumberedListSectionView;
import com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub.section.IpoLearningHubParticipantVisualSectionView;
import com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub.section.IpoLearningHubTitleSubtitleLottieSectionView;
import com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub.section.IpoLearningHubTitleSubtitleSectionView;
import com.robinhood.directipo.models.p292db.IpoAccessLearningHubSectionData;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DirectIpoLearningHubSectionAdapter.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubSectionAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/directipo/models/db/IpoAccessLearningHubSectionData;", "Lcom/robinhood/android/common/util/SimpleViewHolder;", "<init>", "()V", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "getDayNightOverlay", "()Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "setDayNightOverlay", "(Lcom/robinhood/android/designsystem/style/DayNightOverlay;)V", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "Companion", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectIpoLearningHubSectionAdapter extends ListAdapter<IpoAccessLearningHubSectionData, SimpleViewHolder> {
    public static final int VIEW_TYPE_BULLET_LIST = 0;
    public static final int VIEW_TYPE_CAROUSEL = 5;
    public static final int VIEW_TYPE_IPOA_PARTICIPANT_VISUAL = 8;
    public static final int VIEW_TYPE_LABEL = 2;
    public static final int VIEW_TYPE_LOTTIE = 4;
    public static final int VIEW_TYPE_NUMBERED_LIST = 3;
    public static final int VIEW_TYPE_SPACER = 6;
    public static final int VIEW_TYPE_TITLE_SUBTITLE = 1;
    public static final int VIEW_TYPE_TITLE_SUBTITLE_LABELED_LOTTIE = 7;
    private DayNightOverlay dayNightOverlay;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectIpoLearningHubSectionAdapter() {
        super(DiffCallbacks.Equality.INSTANCE);
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.dayNightOverlay = DayNightOverlay.DAY;
    }

    public final DayNightOverlay getDayNightOverlay() {
        return this.dayNightOverlay;
    }

    public final void setDayNightOverlay(DayNightOverlay dayNightOverlay) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "<set-?>");
        this.dayNightOverlay = dayNightOverlay;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        IpoAccessLearningHubSectionData item = getItem(position);
        if (item instanceof IpoAccessLearningHubSectionData.BulletList) {
            return 0;
        }
        if (item instanceof IpoAccessLearningHubSectionData.TitleSubtitle) {
            return 1;
        }
        if (item instanceof IpoAccessLearningHubSectionData.Label) {
            return 2;
        }
        if (item instanceof IpoAccessLearningHubSectionData.NumberedList) {
            return 3;
        }
        if (item instanceof IpoAccessLearningHubSectionData.LottieSection) {
            return 4;
        }
        if (item instanceof IpoAccessLearningHubSectionData.Carousel) {
            return 5;
        }
        if (item instanceof IpoAccessLearningHubSectionData.Spacer) {
            return 6;
        }
        if (item instanceof IpoAccessLearningHubSectionData.TitleSubtitleLabeledLottieSection) {
            return 7;
        }
        if (item instanceof IpoAccessLearningHubSectionData.ParticipantGraphVisual) {
            return 8;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewInflate;
        Intrinsics.checkNotNullParameter(parent, "parent");
        switch (viewType) {
            case 0:
                viewInflate = IpoLearningHubBulletedListSectionView.INSTANCE.inflate(parent);
                break;
            case 1:
                viewInflate = IpoLearningHubTitleSubtitleSectionView.INSTANCE.inflate(parent);
                break;
            case 2:
                viewInflate = IpoLearningHubLabelSectionView.INSTANCE.inflate(parent);
                break;
            case 3:
                viewInflate = IpoLearningHubNumberedListSectionView.INSTANCE.inflate(parent);
                break;
            case 4:
                viewInflate = IpoLearningHubLottieSectionView.INSTANCE.inflate(parent);
                break;
            case 5:
                viewInflate = IpoLearningHubCarouselSectionView.INSTANCE.inflate(parent);
                break;
            case 6:
                viewInflate = new View(parent.getContext());
                break;
            case 7:
                viewInflate = IpoLearningHubTitleSubtitleLottieSectionView.INSTANCE.inflate(parent);
                break;
            case 8:
                viewInflate = IpoLearningHubParticipantVisualSectionView.INSTANCE.inflate(parent);
                break;
            default:
                Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
                throw new ExceptionsH();
        }
        return new SimpleViewHolder(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        IpoAccessLearningHubSectionData item = getItem(position);
        if (item instanceof IpoAccessLearningHubSectionData.Label) {
            View view = holder.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.directipo.allocation.clarity.ui.learninghub.section.IpoLearningHubLabelSectionView");
            ((IpoLearningHubLabelSectionView) view).bind((IpoAccessLearningHubSectionData.Label) item);
            return;
        }
        if (item instanceof IpoAccessLearningHubSectionData.Spacer) {
            holder.itemView.getLayoutParams().height = (int) TypedValue.applyDimension(1, ((IpoAccessLearningHubSectionData.Spacer) item).getHeight(), holder.itemView.getContext().getResources().getDisplayMetrics());
            return;
        }
        if (item instanceof IpoAccessLearningHubSectionData.TitleSubtitle) {
            View view2 = holder.itemView;
            Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.android.directipo.allocation.clarity.ui.learninghub.section.IpoLearningHubTitleSubtitleSectionView");
            ((IpoLearningHubTitleSubtitleSectionView) view2).bind((IpoAccessLearningHubSectionData.TitleSubtitle) item);
            return;
        }
        if (item instanceof IpoAccessLearningHubSectionData.BulletList) {
            View view3 = holder.itemView;
            Intrinsics.checkNotNull(view3, "null cannot be cast to non-null type com.robinhood.android.directipo.allocation.clarity.ui.learninghub.section.IpoLearningHubBulletedListSectionView");
            ((IpoLearningHubBulletedListSectionView) view3).bind((IpoAccessLearningHubSectionData.BulletList) item);
            return;
        }
        if (item instanceof IpoAccessLearningHubSectionData.NumberedList) {
            View view4 = holder.itemView;
            Intrinsics.checkNotNull(view4, "null cannot be cast to non-null type com.robinhood.android.directipo.allocation.clarity.ui.learninghub.section.IpoLearningHubNumberedListSectionView");
            ((IpoLearningHubNumberedListSectionView) view4).bind((IpoAccessLearningHubSectionData.NumberedList) item);
            return;
        }
        if (item instanceof IpoAccessLearningHubSectionData.LottieSection) {
            View view5 = holder.itemView;
            Intrinsics.checkNotNull(view5, "null cannot be cast to non-null type com.robinhood.android.directipo.allocation.clarity.ui.learninghub.section.IpoLearningHubLottieSectionView");
            ((IpoLearningHubLottieSectionView) view5).bind((IpoAccessLearningHubSectionData.LottieSection) item);
            return;
        }
        if (item instanceof IpoAccessLearningHubSectionData.Carousel) {
            View view6 = holder.itemView;
            Intrinsics.checkNotNull(view6, "null cannot be cast to non-null type com.robinhood.android.directipo.allocation.clarity.ui.learninghub.section.IpoLearningHubCarouselSectionView");
            ((IpoLearningHubCarouselSectionView) view6).bind((IpoAccessLearningHubSectionData.Carousel) item, this.dayNightOverlay);
        } else if (item instanceof IpoAccessLearningHubSectionData.TitleSubtitleLabeledLottieSection) {
            View view7 = holder.itemView;
            Intrinsics.checkNotNull(view7, "null cannot be cast to non-null type com.robinhood.android.directipo.allocation.clarity.ui.learninghub.section.IpoLearningHubTitleSubtitleLottieSectionView");
            ((IpoLearningHubTitleSubtitleLottieSectionView) view7).bind((IpoAccessLearningHubSectionData.TitleSubtitleLabeledLottieSection) item);
        } else {
            if (!(item instanceof IpoAccessLearningHubSectionData.ParticipantGraphVisual)) {
                throw new NoWhenBranchMatchedException();
            }
            View view8 = holder.itemView;
            Intrinsics.checkNotNull(view8, "null cannot be cast to non-null type com.robinhood.android.directipo.allocation.clarity.ui.learninghub.section.IpoLearningHubParticipantVisualSectionView");
            ((IpoLearningHubParticipantVisualSectionView) view8).bind((IpoAccessLearningHubSectionData.ParticipantGraphVisual) item, this.dayNightOverlay);
        }
    }
}
