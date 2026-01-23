package com.robinhood.android.lists.p173ui.listitemsort;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.robinhood.android.common.extensions.SortOrders;
import com.robinhood.android.designsystem.chip.RdsChip;
import com.robinhood.android.lists.C20839R;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CuratedListUserSortOptionsView.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0012J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0017H\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/listitemsort/CuratedListUserSortOptionsView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/android/lists/ui/listitemsort/CuratedListUserSortOptionsView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/lists/ui/listitemsort/CuratedListUserSortOptionsView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/lists/ui/listitemsort/CuratedListUserSortOptionsView$Callbacks;)V", "sortChip", "Lcom/robinhood/android/designsystem/chip/RdsChip;", "kotlin.jvm.PlatformType", "sortOrder", "Lcom/robinhood/models/api/ApiCuratedList$SortOrder;", "bind", "", "selectedSortOrder", "onSaveInstanceState", "Landroid/os/Parcelable;", "onRestoreInstanceState", "state", "Callbacks", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CuratedListUserSortOptionsView extends LinearLayout {
    private static final String SAVE_STATE = "save_state";
    private static final String SUPER_STATE = "super_state";
    private Callbacks callbacks;
    private final RdsChip sortChip;
    private ApiCuratedList.SortOrder sortOrder;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CuratedListUserSortOptionsView.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/listitemsort/CuratedListUserSortOptionsView$Callbacks;", "", "onSortOptionChipClicked", "", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onSortOptionChipClicked();
    }

    public /* synthetic */ CuratedListUserSortOptionsView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CuratedListUserSortOptionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C20839R.layout.merge_curated_list_sort_option_view, true);
        this.sortChip = (RdsChip) findViewById(C20839R.id.curated_list_sort_chip);
    }

    public final Callbacks getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callbacks callbacks) {
        this.callbacks = callbacks;
    }

    public final void bind(ApiCuratedList.SortOrder selectedSortOrder) {
        Intrinsics.checkNotNullParameter(selectedSortOrder, "selectedSortOrder");
        this.sortOrder = selectedSortOrder;
        this.sortChip.setText(ViewsKt.getString(this, SortOrders.getDisplayNameRes(selectedSortOrder)));
        RdsChip sortChip = this.sortChip;
        Intrinsics.checkNotNullExpressionValue(sortChip, "sortChip");
        OnClickListeners.onClick(sortChip, new Function0() { // from class: com.robinhood.android.lists.ui.listitemsort.CuratedListUserSortOptionsView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListUserSortOptionsView.bind$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(CuratedListUserSortOptionsView curatedListUserSortOptionsView) {
        Callbacks callbacks = curatedListUserSortOptionsView.callbacks;
        if (callbacks != null) {
            callbacks.onSortOptionChipClicked();
        }
        return Unit.INSTANCE;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable(SUPER_STATE, parcelableOnSaveInstanceState);
        bundle.putSerializable(SAVE_STATE, this.sortOrder);
        return bundle;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Bundle bundle = (Bundle) state;
        ApiCuratedList.SortOrder sortOrder = (ApiCuratedList.SortOrder) bundle.getSerializable(SAVE_STATE);
        if (sortOrder != null) {
            bind(sortOrder);
        }
        super.onRestoreInstanceState(bundle.getParcelable(SUPER_STATE));
    }

    /* compiled from: CuratedListUserSortOptionsView.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0096\u0001R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/listitemsort/CuratedListUserSortOptionsView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/lists/ui/listitemsort/CuratedListUserSortOptionsView;", "<init>", "()V", "SAVE_STATE", "", "SUPER_STATE", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<CuratedListUserSortOptionsView> {
        private final /* synthetic */ Inflater<CuratedListUserSortOptionsView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public CuratedListUserSortOptionsView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (CuratedListUserSortOptionsView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20839R.layout.include_curated_list_sort_option_view);
        }
    }
}
