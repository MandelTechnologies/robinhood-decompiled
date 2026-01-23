package com.robinhood.shared.onboarding.lib.menuofoption;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.robinhood.android.common.p088ui.daynight.DayNightChanges;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.extensions.Views;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.models.api.identi.sortinghat.SortingHatTypes4;
import com.robinhood.models.p320db.identi.sortinghat.MenuOfOptionsPathItem;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.onboarding.lib.menuofoption.databinding.MenuOfOptionsPathItemViewBinding;
import com.robinhood.utils.extensions.Activity;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MenuOfOptionsPathItemsAdapter.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0007H\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0007H\u0016R\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsPathItemsAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/robinhood/models/db/identi/sortinghat/MenuOfOptionsPathItem;", "Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsPathItemsAdapter$ViewHolder;", "<init>", "()V", "screenWidth", "", "Landroid/view/View;", "getScreenWidth", "(Landroid/view/View;)I", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onBindViewHolder", "", "holder", "position", "getItemId", "", "getItemViewType", "ViewHolder", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class MenuOfOptionsPathItemsAdapter extends ListAdapter<MenuOfOptionsPathItem, ViewHolder> {
    public static final int $stable = 8;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return position;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenuOfOptionsPathItemsAdapter() {
        super(DiffCallbacks.Equality.INSTANCE);
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
    }

    private final int getScreenWidth(View view) {
        return Activity.getDisplayMetrics(Views.baseActivity(view)).widthPixels;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        MenuOfOptionsPathItemViewBinding menuOfOptionsPathItemViewBindingInflate = MenuOfOptionsPathItemViewBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(menuOfOptionsPathItemViewBindingInflate, "inflate(...)");
        ConstraintLayout root = menuOfOptionsPathItemViewBindingInflate.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        menuOfOptionsPathItemViewBindingInflate.getRoot().setLayoutParams(new RecyclerView.LayoutParams(getScreenWidth(root) / 2, -2));
        return new ViewHolder(menuOfOptionsPathItemViewBindingInflate);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ViewHolder holder, int position) {
        int screenWidth;
        Intrinsics.checkNotNullParameter(holder, "holder");
        MenuOfOptionsPathItem item = getItem(position);
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
        if (position == getSize() - 1 && item.getFeatured()) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            screenWidth = getScreenWidth(itemView) / 4;
        } else {
            screenWidth = 0;
        }
        layoutParams2.setMarginEnd(screenWidth);
        holder.itemView.setLayoutParams(layoutParams2);
        Intrinsics.checkNotNull(item);
        holder.bind(item);
    }

    /* compiled from: MenuOfOptionsPathItemsAdapter.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0014\u0010\n\u001a\u00020\u0007*\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/onboarding/lib/menuofoption/MenuOfOptionsPathItemsAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/robinhood/shared/onboarding/lib/menuofoption/databinding/MenuOfOptionsPathItemViewBinding;", "<init>", "(Lcom/robinhood/shared/onboarding/lib/menuofoption/databinding/MenuOfOptionsPathItemViewBinding;)V", "bind", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/models/db/identi/sortinghat/MenuOfOptionsPathItem;", "setMenuOfOptionsPathSegment", "Landroid/view/View;", "segmentState", "Lcom/robinhood/models/api/identi/sortinghat/MenuOfOptionsPathSegment;", "lib-menu-of-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final int $stable = 8;
        private final MenuOfOptionsPathItemViewBinding binding;

        /* compiled from: MenuOfOptionsPathItemsAdapter.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SortingHatTypes4.values().length];
                try {
                    iArr[SortingHatTypes4.ACTIVE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SortingHatTypes4.INACTIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SortingHatTypes4.ACTIVE_FADE_TO_INACTIVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[SortingHatTypes4.ACTIVE_FADE_OUT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[SortingHatTypes4.INACTIVE_FADE_OUT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewHolder(MenuOfOptionsPathItemViewBinding binding) {
            super(binding.getRoot());
            Intrinsics.checkNotNullParameter(binding, "binding");
            this.binding = binding;
        }

        public final void bind(MenuOfOptionsPathItem item) {
            int i;
            Intrinsics.checkNotNullParameter(item, "item");
            MenuOfOptionsPathItemViewBinding menuOfOptionsPathItemViewBinding = this.binding;
            menuOfOptionsPathItemViewBinding.pathItemText.setText(item.getTitle());
            Context context = menuOfOptionsPathItemViewBinding.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            boolean zIsDay = DayNightChanges.isDay(ScarletManager2.getScarletManager(Contexts7.requireBaseActivityBaseContext(context)));
            AppCompatImageView appCompatImageView = menuOfOptionsPathItemViewBinding.pathItemHero;
            ConstraintLayout root = menuOfOptionsPathItemViewBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            appCompatImageView.setImageDrawable(ViewsKt.getDrawable(root, MenuOfOptionsAssetMappers.drawableRes(item.getAsset(), zIsDay)));
            AppCompatImageView appCompatImageView2 = menuOfOptionsPathItemViewBinding.userJourneyNodeDecoration;
            ConstraintLayout root2 = menuOfOptionsPathItemViewBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "getRoot(...)");
            appCompatImageView2.setImageDrawable(ViewsKt.getDrawable(root2, MenuOfOptionsAssetMappers.getIconRes(item.getTimeline().getDecoration())));
            View pathItemLeadingSegment = menuOfOptionsPathItemViewBinding.pathItemLeadingSegment;
            Intrinsics.checkNotNullExpressionValue(pathItemLeadingSegment, "pathItemLeadingSegment");
            setMenuOfOptionsPathSegment(pathItemLeadingSegment, item.getTimeline().getLeadingSegment());
            View pathItemTrailingSegment = menuOfOptionsPathItemViewBinding.pathItemTrailingSegment;
            Intrinsics.checkNotNullExpressionValue(pathItemTrailingSegment, "pathItemTrailingSegment");
            setMenuOfOptionsPathSegment(pathItemTrailingSegment, item.getTimeline().getTrailingSegment());
            ConstraintLayout root3 = menuOfOptionsPathItemViewBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root3, "getRoot(...)");
            if (item.getFeatured()) {
                i = C39252R.dimen.menu_of_options_hero_featured_height;
            } else {
                i = C39252R.dimen.menu_of_options_hero_default_height;
            }
            menuOfOptionsPathItemViewBinding.pathItemHero.setLayoutParams(new LinearLayout.LayoutParams(-2, (int) ViewsKt.getDimension(root3, i)));
        }

        private final void setMenuOfOptionsPathSegment(View view, SortingHatTypes4 sortingHatTypes4) {
            int i = WhenMappings.$EnumSwitchMapping$0[sortingHatTypes4.ordinal()];
            if (i == 1) {
                view.setBackgroundColor(view.getContext().getColor(C20690R.color.mobius_prime));
                return;
            }
            if (i == 2) {
                view.setBackgroundColor(view.getContext().getColor(C20690R.color.mobius_background_3_day));
                return;
            }
            if (i == 3) {
                view.setBackgroundResource(C39252R.drawable.gradient_user_journey_active_to_inactive);
            } else if (i == 4) {
                view.setBackgroundResource(C39252R.drawable.gradient_user_journey_active_fade_out);
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                view.setBackgroundResource(C39252R.drawable.gradient_user_journey_inactive_fade_out);
            }
        }
    }
}
