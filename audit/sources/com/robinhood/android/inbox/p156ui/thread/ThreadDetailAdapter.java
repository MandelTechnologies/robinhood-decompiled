package com.robinhood.android.inbox.p156ui.thread;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.inbox.C18721R;
import com.robinhood.android.inbox.p156ui.thread.ThreadDetailViewState4;
import com.robinhood.android.inbox.p156ui.thread.ThreadMessageRowView;
import com.robinhood.android.inbox.p156ui.thread.ThreadMetadataRowView;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.p320db.MediaMetadata;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreadDetailAdapter.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00012\u00020\u00052\u00020\u0006:\u0004&'()B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u001e\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0010\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$H\u0016J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020%H\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020%H\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadDetailAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/inbox/ui/thread/ViewType;", "Lcom/robinhood/utils/ui/view/recyclerview/GenericViewHolder;", "Landroid/view/View;", "Lcom/robinhood/android/inbox/ui/thread/ThreadMessageRowView$Callbacks;", "Lcom/robinhood/android/inbox/ui/thread/ThreadMetadataRowView$Callbacks;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailAdapter$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/inbox/ui/thread/ThreadDetailAdapter$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/inbox/ui/thread/ThreadDetailAdapter$Callbacks;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "holder", "position", "getItemViewType", "getItem", "onExternalActionClick", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/inbox/ui/thread/ViewType$Text;", "onInternalActionClick", "onRetryClick", "localMessageId", "Ljava/util/UUID;", "onAvatarClicked", "onImageClick", "mediaMetadata", "Lcom/robinhood/models/db/MediaMetadata;", "Lcom/robinhood/android/inbox/ui/thread/ViewType$Metadata;", "Callbacks", "DiffCallback", "PaddingItemDecoration", "Companion", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ThreadDetailAdapter extends ListAdapter<ThreadDetailViewState4, GenericViewHolder<? extends View>> implements ThreadMessageRowView.Callbacks, ThreadMetadataRowView.Callbacks {
    private static final int DATE_VIEW_TYPE = 3;
    private static final int METADATA_VIEW_TYPE = 4;
    private static final int PROGRESS_BAR_TYPE = 5;
    private static final int RESPONSE_VIEW_TYPE = 1;
    private static final int TEXT_VIEW_TYPE = 0;
    private static final int TIMESTAMP_VIEW_TYPE = 2;
    private Callbacks callbacks;

    /* compiled from: ThreadDetailAdapter.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadDetailAdapter$Callbacks;", "", "onResponseClick", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/inbox/ui/thread/ViewType$Response;", "onExternalActionClick", "Lcom/robinhood/android/inbox/ui/thread/ViewType;", "onInternalActionClick", "onRetryClick", "localMessageId", "Ljava/util/UUID;", "onAvatarClick", "Lcom/robinhood/android/inbox/ui/thread/ViewType$Text;", "onImageClick", "mediaMetadata", "Lcom/robinhood/models/db/MediaMetadata;", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAvatarClick(ThreadDetailViewState4.Text item);

        void onExternalActionClick(ThreadDetailViewState4 item);

        void onImageClick(MediaMetadata mediaMetadata);

        void onInternalActionClick(ThreadDetailViewState4 item);

        void onResponseClick(ThreadDetailViewState4.Response item);

        void onRetryClick(UUID localMessageId);
    }

    public ThreadDetailAdapter() {
        super(DiffCallback.INSTANCE);
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public GenericViewHolder<View> onCreateViewHolder(ViewGroup parent, int viewType) {
        View viewInflate;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            ThreadMessageRowView threadMessageRowViewInflate = ThreadMessageRowView.INSTANCE.inflate(parent);
            threadMessageRowViewInflate.setCallbacks(this);
            viewInflate = threadMessageRowViewInflate;
        } else if (viewType == 1) {
            viewInflate = ThreadResponseRowView.INSTANCE.inflate(parent);
        } else if (viewType == 2) {
            viewInflate = ThreadTimestampRowView.INSTANCE.inflate(parent);
        } else if (viewType == 3) {
            viewInflate = ThreadDateRowView.INSTANCE.inflate(parent);
        } else if (viewType == 4) {
            ThreadMetadataRowView threadMetadataRowViewInflate = ThreadMetadataRowView.INSTANCE.inflate(parent);
            threadMetadataRowViewInflate.setCallbacks(this);
            viewInflate = threadMetadataRowViewInflate;
        } else if (viewType == 5) {
            viewInflate = ThreadProgressBarRowView.INSTANCE.inflate(parent);
        } else {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
            throw new ExceptionsH();
        }
        return new GenericViewHolder<>(viewInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(GenericViewHolder<? extends View> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final ThreadDetailViewState4 item = getItem(position);
        KeyEvent.Callback view = holder.getView();
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type com.robinhood.utils.ui.view.Bindable<com.robinhood.android.inbox.ui.thread.ViewType>");
        ((Bindable) view).bind(item);
        if (item instanceof ThreadDetailViewState4.Response) {
            OnClickListeners.onClick(holder.getView(), new Function0() { // from class: com.robinhood.android.inbox.ui.thread.ThreadDetailAdapter$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ThreadDetailAdapter.onBindViewHolder$lambda$2(this.f$0, item);
                }
            });
        } else {
            holder.getView().setOnClickListener(null);
            holder.getView().setClickable(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$2(ThreadDetailAdapter threadDetailAdapter, ThreadDetailViewState4 threadDetailViewState4) {
        Callbacks callbacks = threadDetailAdapter.callbacks;
        if (callbacks != null) {
            callbacks.onResponseClick((ThreadDetailViewState4.Response) threadDetailViewState4);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        ThreadDetailViewState4 item = getItem(position);
        if (item instanceof ThreadDetailViewState4.Text) {
            return 0;
        }
        if (item instanceof ThreadDetailViewState4.Response) {
            return 1;
        }
        if (item instanceof ThreadDetailViewState4.Timestamp) {
            return 2;
        }
        if (item instanceof ThreadDetailViewState4.Date) {
            return 3;
        }
        if (item instanceof ThreadDetailViewState4.Metadata) {
            return 4;
        }
        if (item instanceof ThreadDetailViewState4.ProgressBar) {
            return 5;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.recyclerview.widget.ListAdapter
    public ThreadDetailViewState4 getItem(int position) {
        Object item = super.getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        return (ThreadDetailViewState4) item;
    }

    @Override // com.robinhood.android.inbox.ui.thread.ThreadMessageRowView.Callbacks
    public void onExternalActionClick(ThreadDetailViewState4.Text item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            callbacks.onExternalActionClick(item);
        }
    }

    @Override // com.robinhood.android.inbox.ui.thread.ThreadMessageRowView.Callbacks
    public void onInternalActionClick(ThreadDetailViewState4.Text item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            callbacks.onInternalActionClick(item);
        }
    }

    @Override // com.robinhood.android.inbox.ui.thread.ThreadMessageRowView.Callbacks
    public void onRetryClick(UUID localMessageId) {
        Intrinsics.checkNotNullParameter(localMessageId, "localMessageId");
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            callbacks.onRetryClick(localMessageId);
        }
    }

    @Override // com.robinhood.android.inbox.ui.thread.ThreadMessageRowView.Callbacks
    public void onAvatarClicked(ThreadDetailViewState4.Text item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            callbacks.onAvatarClick(item);
        }
    }

    @Override // com.robinhood.android.inbox.ui.thread.ThreadMessageRowView.Callbacks
    public void onImageClick(MediaMetadata mediaMetadata) {
        Intrinsics.checkNotNullParameter(mediaMetadata, "mediaMetadata");
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            callbacks.onImageClick(mediaMetadata);
        }
    }

    @Override // com.robinhood.android.inbox.ui.thread.ThreadMetadataRowView.Callbacks
    public void onInternalActionClick(ThreadDetailViewState4.Metadata item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            callbacks.onInternalActionClick(item);
        }
    }

    @Override // com.robinhood.android.inbox.ui.thread.ThreadMetadataRowView.Callbacks
    public void onExternalActionClick(ThreadDetailViewState4.Metadata item) {
        Intrinsics.checkNotNullParameter(item, "item");
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            callbacks.onExternalActionClick(item);
        }
    }

    /* compiled from: ThreadDetailAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadDetailAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/robinhood/android/inbox/ui/thread/ViewType;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DiffCallback extends DiffUtil.ItemCallback<ThreadDetailViewState4> {
        public static final DiffCallback INSTANCE = new DiffCallback();

        private DiffCallback() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(ThreadDetailViewState4 oldItem, ThreadDetailViewState4 newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.isTheSameAs(newItem);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        @SuppressLint({"DiffUtilEquals"})
        public boolean areContentsTheSame(ThreadDetailViewState4 oldItem, ThreadDetailViewState4 newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }

    /* compiled from: ThreadDetailAdapter.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadDetailAdapter$PaddingItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "defaultSpacing", "", "mediumSpacing", "smallSpacing", "extraExtraSmallSpacing", "dateTimeBottomSpacing", "responseSpacing", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PaddingItemDecoration extends RecyclerView.ItemDecoration {
        private final int dateTimeBottomSpacing;
        private final int defaultSpacing;
        private final int extraExtraSmallSpacing;
        private final int mediumSpacing;
        private final int responseSpacing;
        private final int smallSpacing;

        public PaddingItemDecoration(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            this.defaultSpacing = context.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_default);
            this.mediumSpacing = context.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_medium);
            this.smallSpacing = context.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_small);
            this.extraExtraSmallSpacing = context.getResources().getDimensionPixelSize(C13997R.dimen.rds_spacing_xsmall);
            this.dateTimeBottomSpacing = context.getResources().getDimensionPixelSize(C18721R.dimen.inbox_thread_date_time_bottom_spacing);
            this.responseSpacing = context.getResources().getDimensionPixelSize(C18721R.dimen.inbox_thread_response_spacing);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
            int i;
            Intrinsics.checkNotNullParameter(outRect, "outRect");
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(state, "state");
            outRect.set(0, 0, 0, 0);
            int childAdapterPosition = parent.getChildAdapterPosition(view);
            if (childAdapterPosition == -1) {
                return;
            }
            RecyclerView.Adapter adapter = parent.getAdapter();
            Intrinsics.checkNotNull(adapter, "null cannot be cast to non-null type com.robinhood.android.inbox.ui.thread.ThreadDetailAdapter");
            ThreadDetailAdapter threadDetailAdapter = (ThreadDetailAdapter) adapter;
            int itemViewType = threadDetailAdapter.getItemViewType(childAdapterPosition);
            Integer numValueOf = childAdapterPosition > 0 ? Integer.valueOf(threadDetailAdapter.getItemViewType(childAdapterPosition - 1)) : null;
            if (childAdapterPosition == 0) {
                outRect.top = this.mediumSpacing;
            }
            if (childAdapterPosition == threadDetailAdapter.getSize() - 1) {
                outRect.bottom = this.mediumSpacing;
            }
            if (numValueOf != null && numValueOf.intValue() == 3 && itemViewType == 4) {
                i = this.smallSpacing;
            } else if (numValueOf != null && numValueOf.intValue() == 3) {
                i = this.dateTimeBottomSpacing;
            } else if (numValueOf != null && numValueOf.intValue() == 0 && itemViewType == 0) {
                ThreadDetailViewState4 item = threadDetailAdapter.getItem(childAdapterPosition - 1);
                Intrinsics.checkNotNull(item, "null cannot be cast to non-null type com.robinhood.android.inbox.ui.thread.ViewType.Text");
                if (((ThreadDetailViewState4.Text) item).getLatest()) {
                    i = this.mediumSpacing;
                } else {
                    i = this.extraExtraSmallSpacing;
                }
            } else if (numValueOf != null && numValueOf.intValue() == 0 && itemViewType == 3) {
                i = this.mediumSpacing;
            } else if (numValueOf != null && numValueOf.intValue() == 1 && itemViewType == 1) {
                i = this.responseSpacing;
            } else if (itemViewType == 1) {
                i = this.mediumSpacing;
            } else if (itemViewType == 2) {
                i = this.extraExtraSmallSpacing;
            } else {
                i = this.defaultSpacing;
            }
            outRect.top = i;
        }
    }
}
