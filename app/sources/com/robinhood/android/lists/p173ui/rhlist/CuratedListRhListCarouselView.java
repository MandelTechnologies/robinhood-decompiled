package com.robinhood.android.lists.p173ui.rhlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.robinhood.android.common.p088ui.CuratedListChipItem;
import com.robinhood.android.common.p088ui.CuratedListChipRecyclerView;
import com.robinhood.android.lists.C20839R;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CuratedListRhListCarouselView.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0002\u0018\u0019B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListCarouselView;", "Landroid/widget/LinearLayout;", "Lcom/robinhood/android/common/ui/CuratedListChipRecyclerView$Callbacks;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "carouselView", "Lcom/robinhood/android/common/ui/CuratedListChipRecyclerView;", "callbacks", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListCarouselView$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListCarouselView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListCarouselView$Callbacks;)V", "onChipClick", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/common/ui/CuratedListChipItem;", "bind", "state", "Lcom/robinhood/android/lists/ui/rhlist/RelatedListCarouselState;", "Callbacks", "Companion", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class CuratedListRhListCarouselView extends LinearLayout implements CuratedListChipRecyclerView.Callbacks {
    public Callbacks callbacks;
    private final CuratedListChipRecyclerView carouselView;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: CuratedListRhListCarouselView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListCarouselView$Callbacks;", "", "onChildListClicked", "", "childListId", "Ljava/util/UUID;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onChildListClicked(UUID childListId);
    }

    public /* synthetic */ CuratedListRhListCarouselView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CuratedListRhListCarouselView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        ViewGroups.inflate(this, C20839R.layout.merge_rh_list_curated_list_chip_carousel, true);
        View viewFindViewById = findViewById(C20839R.id.rh_list_curated_list_chip_carousel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        CuratedListChipRecyclerView curatedListChipRecyclerView = (CuratedListChipRecyclerView) viewFindViewById;
        this.carouselView = curatedListChipRecyclerView;
        curatedListChipRecyclerView.setCallbacks(this);
    }

    public final Callbacks getCallbacks() {
        Callbacks callbacks = this.callbacks;
        if (callbacks != null) {
            return callbacks;
        }
        Intrinsics.throwUninitializedPropertyAccessException("callbacks");
        return null;
    }

    public final void setCallbacks(Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "<set-?>");
        this.callbacks = callbacks;
    }

    @Override // com.robinhood.android.common.ui.CuratedListChipRecyclerView.Callbacks
    public void onChipClick(CuratedListChipItem data) {
        Intrinsics.checkNotNullParameter(data, "data");
        getCallbacks().onChildListClicked(data.getId());
    }

    public final void bind(RelatedListCarouselState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.carouselView.bind(state.getPartialListItems());
    }

    /* compiled from: CuratedListRhListCarouselView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListCarouselView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/lists/ui/rhlist/CuratedListRhListCarouselView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<CuratedListRhListCarouselView> {
        private final /* synthetic */ Inflater<CuratedListRhListCarouselView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public CuratedListRhListCarouselView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (CuratedListRhListCarouselView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C20839R.layout.include_rh_list_curated_list_chip_carousel);
        }
    }
}
