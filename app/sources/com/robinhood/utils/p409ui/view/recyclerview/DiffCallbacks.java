package com.robinhood.utils.p409ui.view.recyclerview;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.DiffUtil;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiffCallbacks.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\f\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\b\b\u0000\u0010\u0006*\u00020\u00012\u0019\u0010\u0007\u001a\u0015\u0012\u0004\u0012\u0002H\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0002\b\tJ\u0019\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000b\"\b\b\u0000\u0010\u0006*\u00020\u0001H\u0086\b¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/utils/ui/view/recyclerview/DiffCallbacks;", "", "<init>", "()V", "byEquality", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "T", "identitySelector", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "withEquals", "Lcom/robinhood/utils/ui/view/recyclerview/ItemCallbackAdapter;", "Equality", "Single", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class DiffCallbacks {
    public static final int $stable = 0;
    public static final DiffCallbacks INSTANCE = new DiffCallbacks();

    private DiffCallbacks() {
    }

    public final <T> DiffUtil.ItemCallback<T> byEquality(final Function1<? super T, ? extends Object> identitySelector) {
        Intrinsics.checkNotNullParameter(identitySelector, "identitySelector");
        return new DiffUtil.ItemCallback<T>() { // from class: com.robinhood.utils.ui.view.recyclerview.DiffCallbacks.byEquality.1
            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            public boolean areItemsTheSame(T oldItem, T newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.areEqual(identitySelector.invoke(oldItem), identitySelector.invoke(newItem));
            }

            @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
            @SuppressLint({"DiffUtilEquals"})
            public boolean areContentsTheSame(T oldItem, T newItem) {
                Intrinsics.checkNotNullParameter(oldItem, "oldItem");
                Intrinsics.checkNotNullParameter(newItem, "newItem");
                return Intrinsics.areEqual(oldItem, newItem);
            }
        };
    }

    public final <T> DiffCallbacks3<T> withEquals() {
        return Equality.INSTANCE;
    }

    /* compiled from: DiffCallbacks.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/utils/ui/view/recyclerview/DiffCallbacks$Equality;", "Lcom/robinhood/utils/ui/view/recyclerview/ItemCallbackAdapter;", "", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Equality extends DiffCallbacks3<Object> {
        public static final Equality INSTANCE = new Equality();
        public static final int $stable = 8;

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(Object oldItem, Object newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return true;
        }

        private Equality() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(Object oldItem, Object newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }

    /* compiled from: DiffCallbacks.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0017¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/utils/ui/view/recyclerview/DiffCallbacks$Single;", "Lcom/robinhood/utils/ui/view/recyclerview/ItemCallbackAdapter;", "", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "lib-utils-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes12.dex */
    public static final class Single extends DiffCallbacks3<Object> {
        public static final Single INSTANCE = new Single();
        public static final int $stable = 8;

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(Object oldItem, Object newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return true;
        }

        private Single() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        @SuppressLint({"DiffUtilEquals"})
        public boolean areContentsTheSame(Object oldItem, Object newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return Intrinsics.areEqual(oldItem, newItem);
        }
    }
}
