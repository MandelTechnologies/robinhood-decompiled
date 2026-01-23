package com.robinhood.viewmode;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.util.SecurityViewMode;
import com.robinhood.android.lib.watchlist.C20683R;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Inflater;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ViewModeSelectionRowView.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/viewmode/ViewModeSelectionRowView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "viewModeTxt", "Landroid/widget/TextView;", "selectedImg", "Landroid/widget/ImageView;", "bind", "", "securityViewMode", "Lcom/robinhood/android/common/util/SecurityViewMode;", "isSelected", "", "getSecurityViewModeString", "", "Companion", "feature-lib-watchlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ViewModeSelectionRowView extends ConstraintLayout {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final ImageView selectedImg;
    private final TextView viewModeTxt;

    /* compiled from: ViewModeSelectionRowView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SecurityViewMode.values().length];
            try {
                iArr[SecurityViewMode.LAST_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SecurityViewMode.EQUITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SecurityViewMode.PERCENT_CHANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SecurityViewMode.TODAYS_DELTA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SecurityViewMode.TOTAL_DELTA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[SecurityViewMode.TOTAL_PERCENT_CHANGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[SecurityViewMode.FUTURES_MARGIN_REQUIREMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ ViewModeSelectionRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewModeSelectionRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C20683R.layout.merge_view_mode_selection_row_view, true);
        View viewFindViewById = findViewById(C20683R.id.view_mode_selection_item_name_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.viewModeTxt = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C20683R.id.view_mode_selection_item_direction_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.selectedImg = (ImageView) viewFindViewById2;
    }

    public final void bind(SecurityViewMode securityViewMode, boolean isSelected) {
        Intrinsics.checkNotNullParameter(securityViewMode, "securityViewMode");
        this.viewModeTxt.setText(ViewsKt.getString(this, getSecurityViewModeString(securityViewMode)));
        this.selectedImg.setVisibility(isSelected ? 0 : 8);
    }

    private final int getSecurityViewModeString(SecurityViewMode securityViewMode) {
        switch (WhenMappings.$EnumSwitchMapping$0[securityViewMode.ordinal()]) {
            case 1:
                return C20683R.string.watchlist_menu_view_mode_last_price_label;
            case 2:
                return C20683R.string.watchlist_menu_view_mode_equity_label;
            case 3:
                return C20683R.string.watchlist_menu_view_mode_percent_change_label;
            case 4:
                return C20683R.string.watchlist_menu_view_mode_todays_delta_label;
            case 5:
                return C20683R.string.watchlist_menu_view_mode_total_delta_label;
            case 6:
                return C20683R.string.watchlist_menu_view_mode_total_percent_change_label;
            case 7:
                return C20683R.string.watchlist_menu_view_mode_margin_requirement_label;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: ViewModeSelectionRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/viewmode/ViewModeSelectionRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/viewmode/ViewModeSelectionRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-watchlist_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<ViewModeSelectionRowView> {
        private final /* synthetic */ Inflater<ViewModeSelectionRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public ViewModeSelectionRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (ViewModeSelectionRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20683R.layout.include_view_mode_selection_item_view);
        }
    }
}
