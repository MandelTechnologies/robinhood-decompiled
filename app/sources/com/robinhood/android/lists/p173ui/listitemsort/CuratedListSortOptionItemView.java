package com.robinhood.android.lists.p173ui.listitemsort;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.extensions.SortOrders;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.lists.C20839R;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.p355ui.SortOption;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CuratedListSortOptionItemView.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0011B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/listitemsort/CuratedListSortOptionItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/models/ui/SortOption;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "sortOrderTxt", "Landroid/widget/TextView;", "sortDirectionImg", "Landroid/widget/ImageView;", "bind", "", "state", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CuratedListSortOptionItemView extends ConstraintLayout implements Bindable<SortOption> {
    private final ImageView sortDirectionImg;
    private final TextView sortOrderTxt;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CuratedListSortOptionItemView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiCuratedList.SortDirection.values().length];
            try {
                iArr[ApiCuratedList.SortDirection.ASCENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiCuratedList.SortDirection.DESCENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CuratedListSortOptionItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CuratedListSortOptionItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C20839R.layout.merge_curated_list_sort_options_item_view, true);
        View viewFindViewById = findViewById(C20839R.id.curated_list_sort_options_item_name_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.sortOrderTxt = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C20839R.id.curated_list_sort_options_item_direction_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.sortDirectionImg = (ImageView) viewFindViewById2;
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(SortOption state) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(state, "state");
        this.sortOrderTxt.setText(ViewsKt.getString(this, SortOrders.getDisplayNameRes(state.getSortOrder())));
        int i = WhenMappings.$EnumSwitchMapping$0[state.getSortDirection().ordinal()];
        Drawable themeDrawable = null;
        if (i == 1) {
            numValueOf = Integer.valueOf(C20690R.attr.iconArrowUp24dp);
        } else {
            numValueOf = i != 2 ? null : Integer.valueOf(C20690R.attr.iconArrowDown24dp);
        }
        if (numValueOf != null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            themeDrawable = Contexts7.getThemeDrawable(context, numValueOf.intValue());
        }
        this.sortDirectionImg.setImageDrawable(themeDrawable);
    }

    /* compiled from: CuratedListSortOptionItemView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/listitemsort/CuratedListSortOptionItemView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/lists/ui/listitemsort/CuratedListSortOptionItemView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<CuratedListSortOptionItemView> {
        private final /* synthetic */ Inflater<CuratedListSortOptionItemView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public CuratedListSortOptionItemView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (CuratedListSortOptionItemView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20839R.layout.include_curated_list_sort_options_item_view);
        }
    }
}
