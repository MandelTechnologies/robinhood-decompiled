package com.robinhood.android.equitydetail.p123ui;

import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.robinhood.android.equitydetail.p123ui.InstrumentDetailFragment;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.Instrument;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InstrumentDetailListFragmentAdapter.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u0011H\u0016J\u000e\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0011R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0017\u001a\u00020\u0013*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u001c¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/InstrumentDetailListFragmentAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragment", "Landroidx/fragment/app/Fragment;", "source", "Lcom/robinhood/android/navigation/app/keys/data/InstrumentDetailSource;", "<init>", "(Landroidx/fragment/app/Fragment;Lcom/robinhood/android/navigation/app/keys/data/InstrumentDetailSource;)V", "value", "", "Lcom/robinhood/models/db/Instrument;", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getItemCount", "", "getItemId", "", "position", "containsItem", "", "itemId", "createFragment", "Lcom/robinhood/android/equitydetail/ui/InstrumentDetailFragment;", "getItem", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "(Lcom/robinhood/models/db/Instrument;)J", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstrumentDetailListFragmentAdapter extends FragmentStateAdapter {
    public static final int $stable = 8;
    private List<Instrument> items;
    private final InstrumentDetailSource source;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentDetailListFragmentAdapter(Fragment fragment, InstrumentDetailSource instrumentDetailSource) {
        super(fragment.getChildFragmentManager(), fragment.getViewLifecycleOwner().getLifecycle());
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.source = instrumentDetailSource;
        this.items = CollectionsKt.emptyList();
    }

    public final List<Instrument> getItems() {
        return this.items;
    }

    public final void setItems(List<Instrument> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.items = value;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSize() {
        return this.items.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return getItemId(this.items.get(position));
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public boolean containsItem(long itemId) {
        List<Instrument> list = this.items;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (getItemId((Instrument) it.next()) == itemId) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public InstrumentDetailFragment createFragment(int position) {
        return (InstrumentDetailFragment) InstrumentDetailFragment.INSTANCE.newInstance((Parcelable) new InstrumentDetailFragment.InstrumentDetailArgs(this.items.get(position), this.source));
    }

    public final Instrument getItem(int index) {
        return this.items.get(index);
    }

    private final long getItemId(Instrument instrument) {
        return instrument.getId().hashCode();
    }
}
