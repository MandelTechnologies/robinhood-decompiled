package com.robinhood.android.lists.p173ui.userlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.p088ui.BindViewDelegate2;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.lists.C20839R;
import com.robinhood.common.strings.C32428R;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: CuratedListUserListHeaderView.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u000f\u0010\u000bR\u001b\u0010\u0011\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/userlist/CuratedListUserListHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "titleTextView", "Lcom/robinhood/android/designsystem/text/RhTextView;", "getTitleTextView", "()Lcom/robinhood/android/designsystem/text/RhTextView;", "titleTextView$delegate", "Lkotlin/properties/ReadOnlyProperty;", "emojiTxt", "getEmojiTxt", "emojiTxt$delegate", "instrumentQuantityTextView", "getInstrumentQuantityTextView", "instrumentQuantityTextView$delegate", "bind", "", "state", "Lcom/robinhood/android/lists/ui/userlist/CuratedListUserListViewState;", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CuratedListUserListHeaderView extends ConstraintLayout {

    /* renamed from: emojiTxt$delegate, reason: from kotlin metadata */
    private final Interfaces2 emojiTxt;

    /* renamed from: instrumentQuantityTextView$delegate, reason: from kotlin metadata */
    private final Interfaces2 instrumentQuantityTextView;

    /* renamed from: titleTextView$delegate, reason: from kotlin metadata */
    private final Interfaces2 titleTextView;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CuratedListUserListHeaderView.class, "titleTextView", "getTitleTextView()Lcom/robinhood/android/designsystem/text/RhTextView;", 0)), Reflection.property1(new PropertyReference1Impl(CuratedListUserListHeaderView.class, "emojiTxt", "getEmojiTxt()Lcom/robinhood/android/designsystem/text/RhTextView;", 0)), Reflection.property1(new PropertyReference1Impl(CuratedListUserListHeaderView.class, "instrumentQuantityTextView", "getInstrumentQuantityTextView()Lcom/robinhood/android/designsystem/text/RhTextView;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CuratedListUserListHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C20839R.layout.merge_user_list_header_view, true);
        this.titleTextView = BindViewDelegate2.bindView$default(this, C20839R.id.fragment_user_list_title, null, 2, null);
        this.emojiTxt = BindViewDelegate2.bindView$default(this, C20839R.id.fragment_user_list_emoji_txt, null, 2, null);
        this.instrumentQuantityTextView = BindViewDelegate2.bindView$default(this, C20839R.id.fragment_user_list_instrument_quantity, null, 2, null);
    }

    private final RhTextView getTitleTextView() {
        return (RhTextView) this.titleTextView.getValue(this, $$delegatedProperties[0]);
    }

    private final RhTextView getEmojiTxt() {
        return (RhTextView) this.emojiTxt.getValue(this, $$delegatedProperties[1]);
    }

    private final RhTextView getInstrumentQuantityTextView() {
        return (RhTextView) this.instrumentQuantityTextView.getValue(this, $$delegatedProperties[2]);
    }

    public final void bind(CuratedListUserListViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        CuratedList curatedList = state.getCuratedList();
        if (curatedList != null) {
            getTitleTextView().setText(curatedList.getDisplayName());
            getEmojiTxt().setText(curatedList.getIconEmoji());
            int totalListItemCount = state.getTotalListItemCount();
            getInstrumentQuantityTextView().setText(getResources().getQuantityString(C32428R.plurals.lists_number_of_items, totalListItemCount, Integer.valueOf(totalListItemCount)));
        }
    }

    /* compiled from: CuratedListUserListHeaderView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/userlist/CuratedListUserListHeaderView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/lists/ui/userlist/CuratedListUserListHeaderView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<CuratedListUserListHeaderView> {
        private final /* synthetic */ Inflater<CuratedListUserListHeaderView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public CuratedListUserListHeaderView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (CuratedListUserListHeaderView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20839R.layout.include_user_list_header_view);
        }
    }
}
