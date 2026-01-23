package com.robinhood.android.crypto.p094ui.detaillist;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.robinhood.android.crypto.p094ui.detail.CryptoDetailFragment;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailKey;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailV2FragmentKey;
import com.robinhood.utils.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoDetailListAdapter.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\nH\u0016J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\nJ\u0016\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detaillist/CryptoDetailListAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "fragment", "Landroidx/fragment/app/Fragment;", "items", "", "Lcom/robinhood/android/crypto/ui/detaillist/CryptoDetailListAdapter$Item;", "<init>", "(Landroidx/fragment/app/Fragment;Ljava/util/List;)V", "getItemCount", "", "getItemId", "", "position", "containsItem", "", "itemId", "createFragment", "getUiCurrencyPairAtPosition", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "submitList", "", "newItems", "Item", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoDetailListAdapter extends FragmentStateAdapter {
    public static final int $stable = 8;
    private List<Item> items;

    public /* synthetic */ CryptoDetailListAdapter(Fragment fragment, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fragment, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoDetailListAdapter(Fragment fragment, List<Item> items) {
        super(fragment.getChildFragmentManager(), fragment.getViewLifecycleOwner().getLifecycle());
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: getItemCount */
    public int getSize() {
        return this.items.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return this.items.get(position).getItemId();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public boolean containsItem(long itemId) {
        List<Item> list = this.items;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((Item) it.next()).getItemId() == itemId) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public Fragment createFragment(int position) {
        Fragment fragmentNewInstance;
        CryptoDetailKey key = this.items.get(position).getKey();
        if (key instanceof CryptoDetailFragment.Args) {
            fragmentNewInstance = CryptoDetailFragment.INSTANCE.newInstance((Parcelable) key);
        } else {
            if (!(key instanceof CryptoDetailV2FragmentKey.Crypto) && !(key instanceof CryptoDetailV2FragmentKey.Tokenized)) {
                Preconditions.INSTANCE.failUnexpectedItemKotlin("Unsupported key type: " + key);
                throw new ExceptionsH();
            }
            fragmentNewInstance = com.robinhood.android.crypto.p094ui.detail.p095v2.CryptoDetailFragment.INSTANCE.newInstance((Parcelable) key);
        }
        fragmentNewInstance.setMenuVisibility(false);
        return fragmentNewInstance;
    }

    public final UiCurrencyPair getUiCurrencyPairAtPosition(int position) {
        return this.items.get(position).getUiCurrencyPair();
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void submitList(List<Item> newItems) {
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        this.items = newItems;
        notifyDataSetChanged();
    }

    /* compiled from: CryptoDetailListAdapter.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detaillist/CryptoDetailListAdapter$Item;", "", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "key", "Lcom/robinhood/shared/crypto/contracts/detail/CryptoDetailKey;", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Lcom/robinhood/shared/crypto/contracts/detail/CryptoDetailKey;)V", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getKey", "()Lcom/robinhood/shared/crypto/contracts/detail/CryptoDetailKey;", "itemId", "", "getItemId", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Item {
        public static final int $stable = 8;
        private final long itemId;
        private final CryptoDetailKey key;
        private final UiCurrencyPair uiCurrencyPair;

        public static /* synthetic */ Item copy$default(Item item, UiCurrencyPair uiCurrencyPair, CryptoDetailKey cryptoDetailKey, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCurrencyPair = item.uiCurrencyPair;
            }
            if ((i & 2) != 0) {
                cryptoDetailKey = item.key;
            }
            return item.copy(uiCurrencyPair, cryptoDetailKey);
        }

        /* renamed from: component1, reason: from getter */
        public final UiCurrencyPair getUiCurrencyPair() {
            return this.uiCurrencyPair;
        }

        /* renamed from: component2, reason: from getter */
        public final CryptoDetailKey getKey() {
            return this.key;
        }

        public final Item copy(UiCurrencyPair uiCurrencyPair, CryptoDetailKey key) {
            Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
            Intrinsics.checkNotNullParameter(key, "key");
            return new Item(uiCurrencyPair, key);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.areEqual(this.uiCurrencyPair, item.uiCurrencyPair) && Intrinsics.areEqual(this.key, item.key);
        }

        public int hashCode() {
            return (this.uiCurrencyPair.hashCode() * 31) + this.key.hashCode();
        }

        public String toString() {
            return "Item(uiCurrencyPair=" + this.uiCurrencyPair + ", key=" + this.key + ")";
        }

        public Item(UiCurrencyPair uiCurrencyPair, CryptoDetailKey key) {
            Intrinsics.checkNotNullParameter(uiCurrencyPair, "uiCurrencyPair");
            Intrinsics.checkNotNullParameter(key, "key");
            this.uiCurrencyPair = uiCurrencyPair;
            this.key = key;
            this.itemId = uiCurrencyPair.getId().hashCode();
        }

        public final UiCurrencyPair getUiCurrencyPair() {
            return this.uiCurrencyPair;
        }

        public final CryptoDetailKey getKey() {
            return this.key;
        }

        public final long getItemId() {
            return this.itemId;
        }
    }
}
