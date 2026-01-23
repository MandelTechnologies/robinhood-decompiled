package com.robinhood.test.idler;

import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrackedListAdapter.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\n\b\u0001\u0010\u0002*\u0004\u0018\u00010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0004B\u0017\b\u0016\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\bB\u0017\b\u0016\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b\u0007\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011H\u0016J\"\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/test/idler/TrackedListAdapter;", "T", "VH", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroidx/recyclerview/widget/ListAdapter;", "callback", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "<init>", "(Landroidx/recyclerview/widget/DiffUtil$ItemCallback;)V", "config", "Landroidx/recyclerview/widget/AsyncDifferConfig;", "(Landroidx/recyclerview/widget/AsyncDifferConfig;)V", "idleTracker", "Lcom/robinhood/test/idler/ListAdapterIdleTracker;", "submitList", "", "list", "", "commitCallback", "Ljava/lang/Runnable;", "lib-idling-resources_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public abstract class TrackedListAdapter<T, VH extends RecyclerView.ViewHolder> extends ListAdapter<T, VH> {
    private final ListAdapterIdleTracker idleTracker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackedListAdapter(DiffUtil.ItemCallback<T> callback) {
        super(callback);
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.idleTracker = new ListAdapterIdleTracker();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackedListAdapter(AsyncDifferConfig<T> config) {
        super(config);
        Intrinsics.checkNotNullParameter(config, "config");
        this.idleTracker = new ListAdapterIdleTracker();
    }

    @Override // androidx.recyclerview.widget.ListAdapter
    public void submitList(List<? extends T> list) {
        submitList(list, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.ListAdapter
    public void submitList(List<? extends T> list, final Runnable commitCallback) {
        this.idleTracker.onSubmit();
        super.submitList(list, new Runnable() { // from class: com.robinhood.test.idler.TrackedListAdapter.submitList.1
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable = commitCallback;
                if (runnable != null) {
                    runnable.run();
                }
                ((TrackedListAdapter) this).idleTracker.onCommit();
            }
        });
    }
}
