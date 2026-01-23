package com.robinhood.android.acatsin.brokeragesearch;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.acatsin.brokeragesearch.BrokerageAdapter;
import com.robinhood.android.acatsin.util.ImageViews;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: BrokerageAdapter.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B#\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/acatsin/brokeragesearch/BrokerageAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "Lcom/robinhood/android/acatsin/brokeragesearch/BrokerageAdapter$ViewHolder;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "onBrokerageSelected", "Lkotlin/Function1;", "", "<init>", "(Lcom/robinhood/android/rhimage/ImageLoader;Lkotlin/jvm/functions/Function1;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "holder", "position", "ViewHolder", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class BrokerageAdapter extends ListAdapter<ApiBrokerage, ViewHolder> {
    public static final int $stable = 8;
    private final ImageLoader imageLoader;
    private final Function1<ApiBrokerage, Unit> onBrokerageSelected;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object _init_$lambda$0(ApiBrokerage apiBrokerage) {
        return apiBrokerage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BrokerageAdapter(ImageLoader imageLoader, Function1<? super ApiBrokerage, Unit> onBrokerageSelected) {
        super(DiffCallbacks.INSTANCE.byEquality(new Function1() { // from class: com.robinhood.android.acatsin.brokeragesearch.BrokerageAdapter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BrokerageAdapter._init_$lambda$0((ApiBrokerage) obj);
            }
        }));
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(onBrokerageSelected, "onBrokerageSelected");
        this.imageLoader = imageLoader;
        this.onBrokerageSelected = onBrokerageSelected;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ViewHolder(ViewGroups.inflate$default(parent, C7725R.layout.row_broker_search, false, 2, null), this.imageLoader, this.onBrokerageSelected);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ApiBrokerage item = getItem(position);
        Intrinsics.checkNotNullExpressionValue(item, "getItem(...)");
        holder.bind(item);
    }

    /* compiled from: BrokerageAdapter.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\tJ\u0012\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0016J\u0012\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/acatsin/brokeragesearch/BrokerageAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Lcom/robinhood/android/rhimage/ImageLoader$Target;", "view", "Landroid/view/View;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "onBrokerageSelected", "Lkotlin/Function1;", "Lcom/robinhood/models/api/bonfire/ApiBrokerage;", "", "<init>", "(Landroid/view/View;Lcom/robinhood/android/rhimage/ImageLoader;Lkotlin/jvm/functions/Function1;)V", "logoView", "Landroid/widget/ImageView;", "nameTxt", "Landroid/widget/TextView;", "bind", "brokerage", "onSuccess", "result", "Landroid/graphics/drawable/Drawable;", "onError", "error", "onStart", "placeholder", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ViewHolder extends RecyclerView.ViewHolder implements ImageLoader.Target {
        public static final int $stable = 8;
        private final ImageLoader imageLoader;
        private final ImageView logoView;
        private final TextView nameTxt;
        private final Function1<ApiBrokerage, Unit> onBrokerageSelected;

        @Override // com.robinhood.android.rhimage.ImageLoader.Target
        public void onStart(Drawable placeholder) {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public ViewHolder(View view, ImageLoader imageLoader, Function1<? super ApiBrokerage, Unit> onBrokerageSelected) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
            Intrinsics.checkNotNullParameter(onBrokerageSelected, "onBrokerageSelected");
            this.imageLoader = imageLoader;
            this.onBrokerageSelected = onBrokerageSelected;
            View viewFindViewById = view.findViewById(C7725R.id.broker_logo_view);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            this.logoView = (ImageView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(C7725R.id.broker_name_txt);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
            this.nameTxt = (TextView) viewFindViewById2;
        }

        public final void bind(final ApiBrokerage brokerage) {
            Intrinsics.checkNotNullParameter(brokerage, "brokerage");
            HttpUrl logo = brokerage.getLogo();
            ImageViews.showDefaultBrokerageLogo(this.logoView);
            if (logo != null) {
                this.imageLoader.load(logo).into(this);
            }
            this.nameTxt.setText(brokerage.getName());
            View itemView = this.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            OnClickListeners.onClick(itemView, new Function0() { // from class: com.robinhood.android.acatsin.brokeragesearch.BrokerageAdapter$ViewHolder$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BrokerageAdapter.ViewHolder.bind$lambda$0(this.f$0, brokerage);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit bind$lambda$0(ViewHolder viewHolder, ApiBrokerage apiBrokerage) {
            viewHolder.onBrokerageSelected.invoke(apiBrokerage);
            return Unit.INSTANCE;
        }

        @Override // com.robinhood.android.rhimage.ImageLoader.Target
        public void onSuccess(Drawable result) {
            if (result != null) {
                this.logoView.setImageDrawable(result);
            }
        }

        @Override // com.robinhood.android.rhimage.ImageLoader.Target
        public void onError(Drawable error) {
            ImageViews.showDefaultBrokerageLogo(this.logoView);
        }
    }
}
