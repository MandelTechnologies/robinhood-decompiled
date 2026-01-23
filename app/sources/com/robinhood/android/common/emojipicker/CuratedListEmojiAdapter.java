package com.robinhood.android.common.emojipicker;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.emojipicker.CuratedListEmojiPickerViewState2;
import com.robinhood.android.common.util.SimpleViewHolder;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListEmojiAdapter.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0014\u0015\u0016\u0017\u0018B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/common/emojipicker/CuratedListEmojiAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/android/common/emojipicker/UiEmojiItem;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "callbacks", "Lcom/robinhood/android/common/emojipicker/CuratedListEmojiAdapter$Callbacks;", "initialEmoji", "", "<init>", "(Lcom/robinhood/android/common/emojipicker/CuratedListEmojiAdapter$Callbacks;Ljava/lang/String;)V", "getItemViewType", "", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "Callbacks", "DiffCallback", "EmojiViewHolder", "ExpandFooterViewHolder", "Companion", "lib-emoji-picker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CuratedListEmojiAdapter extends ListAdapter<CuratedListEmojiPickerViewState2, RecyclerView.ViewHolder> {
    public static final int VIEW_TYPE_EXPAND_FOOTER = 2;
    public static final int VIEW_TYPE_HEADER = 0;
    public static final int VIEW_TYPE_ITEM = 1;
    private final Callbacks callbacks;
    private final String initialEmoji;
    public static final int $stable = 8;

    /* compiled from: CuratedListEmojiAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/common/emojipicker/CuratedListEmojiAdapter$Callbacks;", "", "onEmojiItemClick", "", "clickedEmoji", "Lcom/robinhood/android/common/emojipicker/Emoji;", "onShowMoreClick", "key", "", "lib-emoji-picker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onEmojiItemClick(Emoji clickedEmoji);

        void onShowMoreClick(String key);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CuratedListEmojiAdapter(Callbacks callbacks, String initialEmoji) {
        super(DiffCallback.INSTANCE);
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(initialEmoji, "initialEmoji");
        this.callbacks = callbacks;
        this.initialEmoji = initialEmoji;
    }

    /* compiled from: CuratedListEmojiAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/emojipicker/CuratedListEmojiAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/robinhood/android/common/emojipicker/UiEmojiItem;", "<init>", "()V", "areItemsTheSame", "", "oldItem", "newItem", "areContentsTheSame", "lib-emoji-picker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DiffCallback extends DiffUtil.ItemCallback<CuratedListEmojiPickerViewState2> {
        public static final DiffCallback INSTANCE = new DiffCallback();
        public static final int $stable = 8;

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(CuratedListEmojiPickerViewState2 oldItem, CuratedListEmojiPickerViewState2 newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return true;
        }

        private DiffCallback() {
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(CuratedListEmojiPickerViewState2 oldItem, CuratedListEmojiPickerViewState2 newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            if ((oldItem instanceof CuratedListEmojiPickerViewState2.Header) && (newItem instanceof CuratedListEmojiPickerViewState2.Header)) {
                return Intrinsics.areEqual(((CuratedListEmojiPickerViewState2.Header) oldItem).getLabel(), ((CuratedListEmojiPickerViewState2.Header) newItem).getLabel());
            }
            if ((oldItem instanceof CuratedListEmojiPickerViewState2.Item) && (newItem instanceof CuratedListEmojiPickerViewState2.Item)) {
                return Intrinsics.areEqual(((CuratedListEmojiPickerViewState2.Item) oldItem).getEmoji().getCharacter(), ((CuratedListEmojiPickerViewState2.Item) newItem).getEmoji().getCharacter());
            }
            if ((oldItem instanceof CuratedListEmojiPickerViewState2.ExpandFooter) && (newItem instanceof CuratedListEmojiPickerViewState2.ExpandFooter)) {
                return Intrinsics.areEqual(((CuratedListEmojiPickerViewState2.ExpandFooter) oldItem).getAssociatedSectionName(), ((CuratedListEmojiPickerViewState2.ExpandFooter) newItem).getAssociatedSectionName());
            }
            return false;
        }
    }

    /* compiled from: CuratedListEmojiAdapter.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/common/emojipicker/CuratedListEmojiAdapter$EmojiViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "emojiItemTxt", "Landroid/widget/TextView;", "bind", "", AnalyticsStrings.BUTTON_DESCRIPTION_LIST_EMOJI, "", "isInitialEmoji", "", "lib-emoji-picker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class EmojiViewHolder extends RecyclerView.ViewHolder {
        private final TextView emojiItemTxt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EmojiViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            View viewFindViewById = view.findViewById(C11149R.id.emoji_item_txt);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.emojiItemTxt = (TextView) viewFindViewById;
        }

        public final void bind(String emoji, boolean isInitialEmoji) {
            Intrinsics.checkNotNullParameter(emoji, "emoji");
            this.emojiItemTxt.setText(emoji);
            TextView textView = this.emojiItemTxt;
            textView.setBackground(isInitialEmoji ? ViewsKt.getDrawable(textView, C11149R.drawable.selected_emoji_background) : null);
        }
    }

    /* compiled from: CuratedListEmojiAdapter.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/emojipicker/CuratedListEmojiAdapter$ExpandFooterViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "expandButton", "Lcom/robinhood/android/designsystem/button/RdsButton;", "getExpandButton", "()Lcom/robinhood/android/designsystem/button/RdsButton;", "lib-emoji-picker_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class ExpandFooterViewHolder extends RecyclerView.ViewHolder {
        private final RdsButton expandButton;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ExpandFooterViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            View viewFindViewById = view.findViewById(C11149R.id.emoji_footer_expand_button);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.expandButton = (RdsButton) viewFindViewById;
        }

        public final RdsButton getExpandButton() {
            return this.expandButton;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        CuratedListEmojiPickerViewState2 item = getItem(position);
        if (item instanceof CuratedListEmojiPickerViewState2.Header) {
            return 0;
        }
        if (item instanceof CuratedListEmojiPickerViewState2.Item) {
            return 1;
        }
        if (item instanceof CuratedListEmojiPickerViewState2.ExpandFooter) {
            return 2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (viewType == 0) {
            return new SimpleViewHolder(ViewGroups.inflate$default(parent, C11149R.layout.emoji_header_item, false, 2, null));
        }
        if (viewType == 1) {
            return new EmojiViewHolder(ViewGroups.inflate$default(parent, C11149R.layout.emoji_picker_item, false, 2, null));
        }
        if (viewType == 2) {
            return new ExpandFooterViewHolder(ViewGroups.inflate$default(parent, C11149R.layout.emoji_footer_expand_item, false, 2, null));
        }
        Preconditions.INSTANCE.failUnexpectedItemKotlin(Integer.valueOf(viewType));
        throw new ExceptionsH();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        int itemViewType = getItemViewType(position);
        if (itemViewType == 0) {
            CuratedListEmojiPickerViewState2 item = getItem(position);
            Intrinsics.checkNotNull(item, "null cannot be cast to non-null type com.robinhood.android.common.emojipicker.UiEmojiItem.Header");
            View view = holder.itemView;
            Intrinsics.checkNotNull(view, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) view).setText(((CuratedListEmojiPickerViewState2.Header) item).getLabel());
            return;
        }
        if (itemViewType != 1) {
            if (itemViewType != 2) {
                return;
            }
            CuratedListEmojiPickerViewState2 item2 = getItem(position);
            Intrinsics.checkNotNull(item2, "null cannot be cast to non-null type com.robinhood.android.common.emojipicker.UiEmojiItem.ExpandFooter");
            final CuratedListEmojiPickerViewState2.ExpandFooter expandFooter = (CuratedListEmojiPickerViewState2.ExpandFooter) item2;
            OnClickListeners.onClick(((ExpandFooterViewHolder) holder).getExpandButton(), new Function0() { // from class: com.robinhood.android.common.emojipicker.CuratedListEmojiAdapter$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CuratedListEmojiAdapter.onBindViewHolder$lambda$1(this.f$0, expandFooter);
                }
            });
            return;
        }
        CuratedListEmojiPickerViewState2 item3 = getItem(position);
        Intrinsics.checkNotNull(item3, "null cannot be cast to non-null type com.robinhood.android.common.emojipicker.UiEmojiItem.Item");
        final CuratedListEmojiPickerViewState2.Item item4 = (CuratedListEmojiPickerViewState2.Item) item3;
        String character = item4.getEmoji().getCharacter();
        ((EmojiViewHolder) holder).bind(character, Intrinsics.areEqual(character, this.initialEmoji));
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        OnClickListeners.onClick(itemView, new Function0() { // from class: com.robinhood.android.common.emojipicker.CuratedListEmojiAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListEmojiAdapter.onBindViewHolder$lambda$0(this.f$0, item4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$0(CuratedListEmojiAdapter curatedListEmojiAdapter, CuratedListEmojiPickerViewState2.Item item) {
        curatedListEmojiAdapter.callbacks.onEmojiItemClick(item.getEmoji());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBindViewHolder$lambda$1(CuratedListEmojiAdapter curatedListEmojiAdapter, CuratedListEmojiPickerViewState2.ExpandFooter expandFooter) {
        curatedListEmojiAdapter.callbacks.onShowMoreClick(expandFooter.getAssociatedSectionName());
        return Unit.INSTANCE;
    }
}
