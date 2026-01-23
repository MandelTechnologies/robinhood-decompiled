package com.robinhood.android.cash.atm.p069ui;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.location.Location;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.cash.atm.C9956R;
import com.robinhood.android.cash.atm.p069ui.AtmAdapter2;
import com.robinhood.android.cash.lib.atm.p072ui.MapPinDrawableFactory;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.models.api.minerva.Atm;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: AtmAdapter.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/cash/atm/ui/AtmViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "Header", "Item", "Lcom/robinhood/android/cash/atm/ui/AtmViewHolder$Header;", "Lcom/robinhood/android/cash/atm/ui/AtmViewHolder$Item;", "feature-cash-atm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.atm.ui.AtmViewHolder, reason: use source file name */
/* loaded from: classes7.dex */
public abstract class AtmAdapter2 extends RecyclerView.ViewHolder {
    public static final int $stable = 8;

    public /* synthetic */ AtmAdapter2(View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(view);
    }

    private AtmAdapter2(View view) {
        super(view);
    }

    /* compiled from: AtmAdapter.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/cash/atm/ui/AtmViewHolder$Header;", "Lcom/robinhood/android/cash/atm/ui/AtmViewHolder;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "atmCountTxt", "Landroid/widget/TextView;", "progressBar", "Landroid/widget/ProgressBar;", "bind", "", "atmCount", "", "isLoading", "", "feature-cash-atm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cash.atm.ui.AtmViewHolder$Header */
    public static final class Header extends AtmAdapter2 {
        public static final int $stable = 8;
        private final TextView atmCountTxt;
        private final ProgressBar progressBar;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Header(View view) {
            super(view, null);
            Intrinsics.checkNotNullParameter(view, "view");
            View viewFindViewById = view.findViewById(C9956R.id.atm_finder_header_text);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.atmCountTxt = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(C9956R.id.atm_finder_header_progress_bar);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.progressBar = (ProgressBar) viewFindViewById2;
        }

        public final void bind(int atmCount, boolean isLoading) {
            this.atmCountTxt.setText(this.itemView.getContext().getResources().getQuantityString(C9956R.plurals.atm_finder_atms_found, atmCount, String.valueOf(atmCount)));
            this.atmCountTxt.setAlpha(isLoading ? 0.3f : 1.0f);
            this.progressBar.setVisibility(isLoading ? 0 : 8);
        }
    }

    /* compiled from: AtmAdapter.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/cash/atm/ui/AtmViewHolder$Item;", "Lcom/robinhood/android/cash/atm/ui/AtmViewHolder;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "locationIcon", "Landroid/widget/ImageView;", "nameTxt", "Landroid/widget/TextView;", "distanceTxt", "annotationTxt", "bind", "", PlaceTypes.ATM, "Lcom/robinhood/models/api/minerva/Atm;", "isSelected", "", "userLocation", "Landroid/location/Location;", "feature-cash-atm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cash.atm.ui.AtmViewHolder$Item */
    public static final class Item extends AtmAdapter2 {
        public static final int $stable = 8;
        private final TextView annotationTxt;
        private final TextView distanceTxt;
        private final ImageView locationIcon;
        private final TextView nameTxt;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Item(View view) {
            super(view, null);
            Intrinsics.checkNotNullParameter(view, "view");
            View viewFindViewById = view.findViewById(C9956R.id.atm_location_icon);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.locationIcon = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(C9956R.id.atm_name_txt);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.nameTxt = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(C9956R.id.atm_distance_txt);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
            this.distanceTxt = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(C9956R.id.atm_annotation_txt);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
            this.annotationTxt = (TextView) viewFindViewById4;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void bind(final Atm atm, boolean isSelected, Location userLocation) {
            boolean z;
            Intrinsics.checkNotNullParameter(atm, "atm");
            this.nameTxt.setText(atm.getName());
            TextView textView = this.distanceTxt;
            Resources resources = textView.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            textView.setText(Atms.getDistanceLabel(atm, userLocation, resources));
            TextView textView2 = this.annotationTxt;
            String annotation = atm.getAnnotation();
            if (annotation != null) {
                z = StringsKt.isBlank(annotation) ^ true;
            }
            textView2.setVisibility(z ? 0 : 8);
            textView2.setText(atm.getAnnotation());
            this.locationIcon.setImageDrawable(this.itemView.getContext().getDrawable(MapPinDrawableFactory.Type.INSTANCE.fromHighlighted(isSelected).getDrawableRes()));
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            OnClickListeners.onClick(itemView, new Function0() { // from class: com.robinhood.android.cash.atm.ui.AtmViewHolder$Item$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AtmAdapter2.Item.bind$lambda$1(this.f$0, atm);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bind$lambda$1(Item item, Atm atm) {
            Context context = item.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            BaseActivity baseActivityRequireBaseActivityBaseContext = Contexts7.requireBaseActivityBaseContext(context);
            Intent data = new Intent("android.intent.action.VIEW").setData(atm.getGeoUri());
            Intrinsics.checkNotNullExpressionValue(data, "setData(...)");
            try {
                baseActivityRequireBaseActivityBaseContext.startActivity(data);
            } catch (ActivityNotFoundException unused) {
            }
            return Unit.INSTANCE;
        }
    }
}
