package com.robinhood.android.accountcenter.views;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.accountcenter.C8293R;
import com.robinhood.android.common.p088ui.CuratedListChipItem;
import com.robinhood.android.common.p088ui.CuratedListChipRecyclerView;
import com.robinhood.android.common.util.extensions.RichTexts;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.color.ThemeColors;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ProfileEmptyAssetBreakdownView.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bR.\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R.\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/ProfileEmptyAssetBreakdownView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "onCuratedListClick", "Lkotlin/Function2;", "", "Ljava/util/UUID;", "", "getOnCuratedListClick", "()Lkotlin/jvm/functions/Function2;", "setOnCuratedListClick", "(Lkotlin/jvm/functions/Function2;)V", "onDescriptionLinkClick", "Landroid/net/Uri;", "getOnDescriptionLinkClick", "setOnDescriptionLinkClick", "descriptionTxt", "Landroid/widget/TextView;", "curatedListsView", "Lcom/robinhood/android/common/ui/CuratedListChipRecyclerView;", "bind", "state", "Lcom/robinhood/android/accountcenter/views/EmptyAssetBreakdownState;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class ProfileEmptyAssetBreakdownView extends ConstraintLayout {
    public static final int $stable = 8;
    private final CuratedListChipRecyclerView curatedListsView;
    private final TextView descriptionTxt;
    private Function2<? super String, ? super UUID, Unit> onCuratedListClick;
    private Function2<? super String, ? super Uri, Unit> onDescriptionLinkClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileEmptyAssetBreakdownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C8293R.layout.merge_profile_empty_asset_breakdown_view, true);
        View viewFindViewById = findViewById(C8293R.id.profile_empty_asset_breakdown_description_txt);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.descriptionTxt = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(C8293R.id.profile_empty_asset_breakdown_curated_lists_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        CuratedListChipRecyclerView curatedListChipRecyclerView = (CuratedListChipRecyclerView) viewFindViewById2;
        this.curatedListsView = curatedListChipRecyclerView;
        curatedListChipRecyclerView.setItemAnimator(null);
    }

    public final Function2<String, UUID, Unit> getOnCuratedListClick() {
        return this.onCuratedListClick;
    }

    public final void setOnCuratedListClick(Function2<? super String, ? super UUID, Unit> function2) {
        this.onCuratedListClick = function2;
    }

    public final Function2<String, Uri, Unit> getOnDescriptionLinkClick() {
        return this.onDescriptionLinkClick;
    }

    public final void setOnDescriptionLinkClick(Function2<? super String, ? super Uri, Unit> function2) {
        this.onDescriptionLinkClick = function2;
    }

    public final void bind(final EmptyAssetBreakdownState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        TextView textView = this.descriptionTxt;
        RichText description = state.getDescription();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        textView.setText(RichTexts.toSpannableString$default(description, context, Integer.valueOf(ThemeColors.getThemeColor(context2, C20690R.attr.colorPrimary)), false, new Function1() { // from class: com.robinhood.android.accountcenter.views.ProfileEmptyAssetBreakdownView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ProfileEmptyAssetBreakdownView.bind$lambda$0(this.f$0, state, (Uri) obj);
            }
        }, 4, null));
        this.curatedListsView.setVisibility(state.getShowCuratedLists() ? 0 : 8);
        this.curatedListsView.setCallbacks(new CuratedListChipRecyclerView.Callbacks() { // from class: com.robinhood.android.accountcenter.views.ProfileEmptyAssetBreakdownView.bind.2
            @Override // com.robinhood.android.common.ui.CuratedListChipRecyclerView.Callbacks
            public void onChipClick(CuratedListChipItem data) {
                Intrinsics.checkNotNullParameter(data, "data");
                Function2<String, UUID, Unit> onCuratedListClick = ProfileEmptyAssetBreakdownView.this.getOnCuratedListClick();
                if (onCuratedListClick != null) {
                    onCuratedListClick.invoke(state.getAssetId(), data.getId());
                }
            }
        });
        if (state.getShowCuratedLists()) {
            this.curatedListsView.setRowCount(state.getCuratedListRowCount());
            this.curatedListsView.bind(state.getCuratedLists());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(ProfileEmptyAssetBreakdownView profileEmptyAssetBreakdownView, EmptyAssetBreakdownState emptyAssetBreakdownState, Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Function2<? super String, ? super Uri, Unit> function2 = profileEmptyAssetBreakdownView.onDescriptionLinkClick;
        if (function2 != null) {
            function2.invoke(emptyAssetBreakdownState.getAssetId(), uri);
        }
        return Unit.INSTANCE;
    }
}
