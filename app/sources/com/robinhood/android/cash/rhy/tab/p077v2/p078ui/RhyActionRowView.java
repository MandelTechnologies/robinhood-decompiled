package com.robinhood.android.cash.rhy.tab.p077v2.p078ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.robinhood.android.cash.rhy.tab.C10285R;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.models.p320db.rhy.RhyTabState;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.Bindable;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RhyActionRowView.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 .2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001.B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0003H\u0016J\u0014\u0010,\u001a\u00020*2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020*0-R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010\u001b\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR(\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010%\u001a\u00020$2\u0006\u0010\u0014\u001a\u00020$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/RhyActionRowView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lcom/robinhood/utils/ui/view/Bindable;", "Lcom/robinhood/models/db/rhy/RhyTabState$Action;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "rdsRowView", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "featuredIcon", "Landroid/widget/ImageView;", "value", "", "primaryText", "getPrimaryText", "()Ljava/lang/CharSequence;", "setPrimaryText", "(Ljava/lang/CharSequence;)V", "secondaryText", "getSecondaryText", "setSecondaryText", "Landroid/graphics/drawable/Drawable;", "leadingIconDrawable", "getLeadingIconDrawable", "()Landroid/graphics/drawable/Drawable;", "setLeadingIconDrawable", "(Landroid/graphics/drawable/Drawable;)V", "", "isFeatured", "()Z", "setFeatured", "(Z)V", "bind", "", "action", "onClick", "Lkotlin/Function0;", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class RhyActionRowView extends Hammer_RhyActionRowView implements Bindable<RhyTabState.Action> {
    private final ImageView featuredIcon;
    public Navigator navigator;
    private final RdsRowView rdsRowView;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public /* synthetic */ RhyActionRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RhyActionRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewGroups.inflate(this, C10285R.layout.merge_rhy_action_row_view, true);
        View viewFindViewById = findViewById(C10285R.id.rhy_action_row_view_rds_row);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.rdsRowView = (RdsRowView) viewFindViewById;
        View viewFindViewById2 = findViewById(C10285R.id.rhy_action_row_featured_icon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.featuredIcon = (ImageView) viewFindViewById2;
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    public final CharSequence getPrimaryText() {
        return this.rdsRowView.getPrimaryText();
    }

    public final void setPrimaryText(CharSequence charSequence) {
        this.rdsRowView.setPrimaryText(charSequence);
    }

    public final CharSequence getSecondaryText() {
        return this.rdsRowView.getSecondaryText();
    }

    public final void setSecondaryText(CharSequence charSequence) {
        this.rdsRowView.setSecondaryText(charSequence);
    }

    public final Drawable getLeadingIconDrawable() {
        return this.rdsRowView.getLeadingIconDrawable();
    }

    public final void setLeadingIconDrawable(Drawable drawable) {
        this.rdsRowView.setLeadingIconDrawable(drawable);
    }

    public final boolean isFeatured() {
        return this.featuredIcon.getVisibility() == 0;
    }

    public final void setFeatured(boolean z) {
        this.featuredIcon.setVisibility(!z ? 4 : 0);
    }

    @Override // com.robinhood.utils.p409ui.view.Bindable
    public void bind(RhyTabState.Action action) {
        Intrinsics.checkNotNullParameter(action, "action");
        setPrimaryText(action.getTitle());
        setSecondaryText(action.getMessage());
        setLeadingIconDrawable(ViewsKt.getDrawable(this, action.getIcon().getResourceId()));
        setFeatured(action.isFeatured());
    }

    public final void onClick(final Function0<Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        OnClickListeners.onClick(this.rdsRowView, new Function0() { // from class: com.robinhood.android.cash.rhy.tab.v2.ui.RhyActionRowView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RhyActionRowView.onClick$lambda$0(action);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClick$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* compiled from: RhyActionRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/RhyActionRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/RhyActionRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<RhyActionRowView> {
        private final /* synthetic */ Inflater<RhyActionRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public RhyActionRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (RhyActionRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C10285R.layout.include_rhy_action_row_view);
        }
    }
}
