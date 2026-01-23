package com.robinhood.android.lists.p173ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.robinhood.android.common.views.crypto.CryptoRowView;
import com.robinhood.android.equitydetail.p123ui.statistics.StatisticsSection2;
import com.robinhood.android.lists.C20839R;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RemoveCryptoRowView.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001dR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/lists/ui/RemoveCryptoRowView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "rowView", "Lcom/robinhood/android/common/views/crypto/CryptoRowView;", "removeButton", "Landroid/widget/ImageView;", "reorderImg", StatisticsSection2.DIVIDER, "Landroid/view/View;", "currencyPairId", "Ljava/util/UUID;", "getCurrencyPairId", "()Ljava/util/UUID;", "setCurrencyPairId", "(Ljava/util/UUID;)V", "bind", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/common/views/crypto/CryptoRowView$Data;", "callbacks", "Lcom/robinhood/android/lists/ui/RemoveCryptoRowView$Callbacks;", "showDivider", "show", "", "Callbacks", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class RemoveCryptoRowView extends ConstraintLayout {
    private UUID currencyPairId;
    private final View divider;
    private final ImageView removeButton;
    private final ImageView reorderImg;
    private final CryptoRowView rowView;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: RemoveCryptoRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/RemoveCryptoRowView$Callbacks;", "", "onRemoveClicked", "", "currencyPairId", "Ljava/util/UUID;", "onReorderPressed", "view", "Landroid/view/View;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onRemoveClicked(UUID currencyPairId);

        void onReorderPressed(View view);
    }

    public /* synthetic */ RemoveCryptoRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveCryptoRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C20839R.layout.merge_remove_crypto_row_view, true);
        View viewFindViewById = findViewById(C20839R.id.remove_crypto_row_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        CryptoRowView cryptoRowView = (CryptoRowView) viewFindViewById;
        this.rowView = cryptoRowView;
        View viewFindViewById2 = findViewById(C20839R.id.remove_crypto_row_view_remove_button);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.removeButton = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(C20839R.id.remove_crypto_row_view_reorder_handle_img);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.reorderImg = (ImageView) viewFindViewById3;
        View viewFindViewById4 = findViewById(C20839R.id.remove_crypto_row_view_divider);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        this.divider = viewFindViewById4;
        cryptoRowView.hidePriceText();
        cryptoRowView.showDivider(false);
    }

    public final UUID getCurrencyPairId() {
        return this.currencyPairId;
    }

    public final void setCurrencyPairId(UUID uuid) {
        this.currencyPairId = uuid;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void bind(final CryptoRowView.Data data, final Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        this.currencyPairId = data.getCurrencyPairId();
        this.rowView.bind(data, null);
        OnClickListeners.onClick(this.removeButton, new Function0() { // from class: com.robinhood.android.lists.ui.RemoveCryptoRowView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RemoveCryptoRowView.bind$lambda$0(callbacks, data);
            }
        });
        this.reorderImg.setOnTouchListener(new View.OnTouchListener() { // from class: com.robinhood.android.lists.ui.RemoveCryptoRowView.bind.2
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
    public static final Unit bind$lambda$0(Callbacks callbacks, CryptoRowView.Data data) {
        callbacks.onRemoveClicked(data.getCurrencyPairId());
        return Unit.INSTANCE;
    }

    public final void showDivider(boolean show) {
        this.divider.setVisibility(show ? 0 : 8);
    }

    /* compiled from: RemoveCryptoRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/RemoveCryptoRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/lists/ui/RemoveCryptoRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<RemoveCryptoRowView> {
        private final /* synthetic */ Inflater<RemoveCryptoRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RemoveCryptoRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RemoveCryptoRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20839R.layout.include_remove_crypto_row_view);
        }
    }
}
