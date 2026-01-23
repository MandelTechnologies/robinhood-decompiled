package com.robinhood.android.lists.p173ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.util.SecurityViewMode;
import com.robinhood.android.common.views.futures.FuturesRowView;
import com.robinhood.android.equitydetail.p123ui.statistics.StatisticsSection2;
import com.robinhood.android.lists.C20839R;
import com.robinhood.android.models.futures.p189db.UiFuturesPosition;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EditFuturesRowView.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002$%B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007JD\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0007J\u000e\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020!R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/EditFuturesRowView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "rowView", "Lcom/robinhood/android/common/views/futures/FuturesRowView;", "removeButton", "Landroid/widget/ImageView;", "reorderImg", StatisticsSection2.DIVIDER, "Landroid/view/View;", "contractId", "Ljava/util/UUID;", "getContractId", "()Ljava/util/UUID;", "setContractId", "(Ljava/util/UUID;)V", "bind", "", "name", "", "symbol", "position", "Lcom/robinhood/android/models/futures/db/UiFuturesPosition;", "viewMode", "Lcom/robinhood/android/common/util/SecurityViewMode;", "callbacks", "Lcom/robinhood/android/lists/ui/EditFuturesRowView$Callbacks;", "isRhList", "", "showDivider", "show", "Callbacks", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class EditFuturesRowView extends ConstraintLayout {
    public UUID contractId;
    private final View divider;
    private final ImageView removeButton;
    private final ImageView reorderImg;
    private final FuturesRowView rowView;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: EditFuturesRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/EditFuturesRowView$Callbacks;", "", "onRemoveClicked", "", "contractId", "Ljava/util/UUID;", "onReorderPressed", "view", "Landroid/view/View;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onRemoveClicked(UUID contractId);

        void onReorderPressed(View view);
    }

    public /* synthetic */ EditFuturesRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditFuturesRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C20839R.layout.merge_edit_futures_row_view, true);
        View viewFindViewById = findViewById(C20839R.id.edit_futures_row_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        FuturesRowView futuresRowView = (FuturesRowView) viewFindViewById;
        this.rowView = futuresRowView;
        View viewFindViewById2 = findViewById(C20839R.id.edit_futures_row_view_remove_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.removeButton = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C20839R.id.edit_futures_row_view_reorder_handle_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.reorderImg = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(C20839R.id.edit_futures_row_view_divider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.divider = viewFindViewById4;
        futuresRowView.hidePriceText();
        futuresRowView.showDivider(false);
    }

    public final UUID getContractId() {
        UUID uuid = this.contractId;
        if (uuid != null) {
            return uuid;
        }
        Intrinsics.throwUninitializedPropertyAccessException("contractId");
        return null;
    }

    public final void setContractId(UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<set-?>");
        this.contractId = uuid;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void bind(final UUID contractId, String name, String symbol, UiFuturesPosition position, SecurityViewMode viewMode, final Callbacks callbacks, boolean isRhList) {
        Intrinsics.checkNotNullParameter(contractId, "contractId");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        setContractId(contractId);
        this.rowView.setViewMode(viewMode);
        this.rowView.bind(contractId, name, symbol, position, isRhList);
        OnClickListeners.onClick(this.removeButton, new Function0() { // from class: com.robinhood.android.lists.ui.EditFuturesRowView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EditFuturesRowView.bind$lambda$0(callbacks, contractId);
            }
        });
        this.reorderImg.setOnTouchListener(new View.OnTouchListener() { // from class: com.robinhood.android.lists.ui.EditFuturesRowView.bind.2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() != 0) {
                    return false;
                }
                callbacks.onReorderPressed(this);
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$0(Callbacks callbacks, UUID uuid) {
        callbacks.onRemoveClicked(uuid);
        return Unit.INSTANCE;
    }

    public final void showDivider(boolean show) {
        this.divider.setVisibility(show ? 0 : 8);
    }

    /* compiled from: EditFuturesRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/EditFuturesRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/lists/ui/EditFuturesRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<EditFuturesRowView> {
        private final /* synthetic */ Inflater<EditFuturesRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public EditFuturesRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (EditFuturesRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20839R.layout.include_edit_futures_row_view);
        }
    }
}
