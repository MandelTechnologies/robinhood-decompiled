package com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ListAdapter;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub.section.IpoLearningHubParticipantVisualSectionView;
import com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub.section.IpoLearningHubTitleSubtitleLottieSectionView;
import com.robinhood.directipo.models.p292db.IpoAccessLearningHubSectionData;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DirectIpoLearningHubCarouselPagerAdapter.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubCarouselPagerAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/directipo/models/db/IpoAccessLearningHubSectionData;", "Lcom/robinhood/android/common/util/SimpleViewHolder;", "<init>", "()V", "dayNightOverlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "getDayNightOverlay", "()Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "setDayNightOverlay", "(Lcom/robinhood/android/designsystem/style/DayNightOverlay;)V", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "Companion", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectIpoLearningHubCarouselPagerAdapter extends ListAdapter<IpoAccessLearningHubSectionData, SimpleViewHolder> {
    public static final int VIEW_TYPE_IPOA_PARTICIPANT_VISUAL = 1;
    public static final int VIEW_TYPE_TITLE_SUBTITLE_LABELED_LOTTIE = 0;
    private DayNightOverlay dayNightOverlay;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DirectIpoLearningHubCarouselPagerAdapter() {
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
        if (item instanceof IpoAccessLearningHubSectionData.TitleSubtitleLabeledLottieSection) {
            return 0;
        }
        if (item instanceof IpoAccessLearningHubSectionData.ParticipantGraphVisual) {
            return 1;
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(item);
        throw new ExceptionsH();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public SimpleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewInflate;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            viewInflate = IpoLearningHubTitleSubtitleLottieSectionView.INSTANCE.inflate(parent);
        } else if (viewType == 1) {
            viewInflate = IpoLearningHubParticipantVisualSectionView.INSTANCE.inflate(parent);
        } else {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
            throw new ExceptionsH();
        }
        ViewGroup.LayoutParams layoutParams = viewInflate.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = -1;
            viewInflate.setLayoutParams(layoutParams);
            return new SimpleViewHolder(viewInflate);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(SimpleViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        IpoAccessLearningHubSectionData item = getItem(position);
        if (item instanceof IpoAccessLearningHubSectionData.TitleSubtitleLabeledLottieSection) {
            View view = holder.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.android.directipo.allocation.clarity.ui.learninghub.section.IpoLearningHubTitleSubtitleLottieSectionView");
            ((IpoLearningHubTitleSubtitleLottieSectionView) view).bind((IpoAccessLearningHubSectionData.TitleSubtitleLabeledLottieSection) item);
        } else if (item instanceof IpoAccessLearningHubSectionData.ParticipantGraphVisual) {
            View view2 = holder.itemView;
            Intrinsics.checkNotNull(view2, "null cannot be cast to non-null type com.robinhood.android.directipo.allocation.clarity.ui.learninghub.section.IpoLearningHubParticipantVisualSectionView");
            ((IpoLearningHubParticipantVisualSectionView) view2).bind((IpoAccessLearningHubSectionData.ParticipantGraphVisual) item, this.dayNightOverlay);
        } else if (!(item instanceof IpoAccessLearningHubSectionData.BulletList) && !(item instanceof IpoAccessLearningHubSectionData.Carousel) && !(item instanceof IpoAccessLearningHubSectionData.Label) && !(item instanceof IpoAccessLearningHubSectionData.LottieSection) && !(item instanceof IpoAccessLearningHubSectionData.NumberedList) && !(item instanceof IpoAccessLearningHubSectionData.Spacer) && !(item instanceof IpoAccessLearningHubSectionData.TitleSubtitle)) {
            throw new NoWhenBranchMatchedException();
        }
        holder.itemView.setTag(Integer.valueOf(position));
    }
}
