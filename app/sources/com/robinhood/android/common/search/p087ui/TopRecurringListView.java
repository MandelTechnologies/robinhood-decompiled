package com.robinhood.android.common.search.p087ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.search.C11798R;
import com.robinhood.android.common.search.databinding.MergeTopRecurringListBinding;
import com.robinhood.android.common.search.p087ui.RecurringCard;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.utils.extensions.TextViewsKt;
import com.robinhood.utils.extensions.ViewGroups;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: TopRecurringListView.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u0016R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/common/search/ui/TopRecurringListView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lcom/robinhood/android/common/search/databinding/MergeTopRecurringListBinding;", "getBinding", "()Lcom/robinhood/android/common/search/databinding/MergeTopRecurringListBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "bind", "", "list", "Lcom/robinhood/models/db/CuratedList;", "topRecurringListItems", "", "Ljava/util/UUID;", "callbacks", "Lcom/robinhood/android/common/search/ui/RecurringCard$Callbacks;", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class TopRecurringListView extends LinearLayout {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(TopRecurringListView.class, "binding", "getBinding()Lcom/robinhood/android/common/search/databinding/MergeTopRecurringListBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopRecurringListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = ViewBinding5.viewBinding(this, TopRecurringListView2.INSTANCE);
        setOrientation(1);
        ViewGroups.inflate(this, C11798R.layout.merge_top_recurring_list, true);
    }

    private final MergeTopRecurringListBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MergeTopRecurringListBinding) value;
    }

    public final void bind(CuratedList list, List<UUID> topRecurringListItems, RecurringCard.Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(topRecurringListItems, "topRecurringListItems");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        RhTextView topRecurringListTitle = getBinding().topRecurringListTitle;
        Intrinsics.checkNotNullExpressionValue(topRecurringListTitle, "topRecurringListTitle");
        TextViewsKt.setVisibilityText(topRecurringListTitle, list != null ? list.getDisplayName() : null);
        RhTextView topRecurringListDescription = getBinding().topRecurringListDescription;
        Intrinsics.checkNotNullExpressionValue(topRecurringListDescription, "topRecurringListDescription");
        TextViewsKt.setVisibilityText(topRecurringListDescription, list != null ? list.getDisplayDescription() : null);
        getBinding().recurringCarousel.setCallbacks(callbacks);
        getBinding().recurringCarousel.bindItems(topRecurringListItems);
    }
}
