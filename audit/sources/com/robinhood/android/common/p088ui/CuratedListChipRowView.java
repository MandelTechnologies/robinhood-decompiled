package com.robinhood.android.common.p088ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.autoeventlogging.ViewsKt;
import com.robinhood.android.common.lists.C11222R;
import com.robinhood.android.designsystem.chip.RdsChip;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.lists.models.shared.p298db.SizedUrlHolder;
import com.robinhood.utils.extensions.ViewGroups;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CuratedListChipRowView.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0016\u0017B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0015R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/ui/CuratedListChipRowView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "chip", "Lcom/robinhood/android/designsystem/chip/RdsChip;", "bind", "", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/common/ui/CuratedListChipItem;", "onClick", "Lkotlin/Function1;", "Companion", "IconChipInflater", "feature-lib-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CuratedListChipRowView extends Hammer_CuratedListChipRowView {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final RdsChip chip;
    public Navigator navigator;

    public /* synthetic */ CuratedListChipRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CuratedListChipRowView(Context context, AttributeSet attributeSet) {
        int i;
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        int[] CuratedListChipRowView = C11222R.styleable.CuratedListChipRowView;
        Intrinsics.checkNotNullExpressionValue(CuratedListChipRowView, "CuratedListChipRowView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CuratedListChipRowView, 0, 0);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(C11222R.styleable.CuratedListChipRowView_iconChip, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z) {
            i = C11222R.layout.merge_curated_list_thumbnail_icon_chip_row_view;
        } else {
            i = C11222R.layout.merge_curated_list_thumbnail_chip_row_view;
        }
        ViewGroups.inflate(this, i, true);
        ViewsKt.eventData$default(this, false, new Function0() { // from class: com.robinhood.android.common.ui.CuratedListChipRowView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListChipRowView._init_$lambda$1(this.f$0);
            }
        }, 1, null);
        View viewFindViewById = findViewById(C11222R.id.curated_list_chip_row_view_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.chip = (RdsChip) viewFindViewById;
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor _init_$lambda$1(CuratedListChipRowView curatedListChipRowView) {
        return ViewsKt.getEventData(curatedListChipRowView.chip);
    }

    public final void bind(final CuratedListChipItem item, final Function1<? super CuratedListChipItem, Unit> onClick) {
        Intrinsics.checkNotNullParameter(item, "item");
        final RdsChip rdsChip = this.chip;
        ViewsKt.eventData$default(rdsChip, false, new Function0() { // from class: com.robinhood.android.common.ui.CuratedListChipRowView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return item.getEventData();
            }
        }, 1, null);
        rdsChip.setText(item.getDisplayName());
        OnClickListeners.onClick(rdsChip, new Function0() { // from class: com.robinhood.android.common.ui.CuratedListChipRowView$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListChipRowView.bind$lambda$4$lambda$3(onClick, item, this, rdsChip);
            }
        });
        if (item.getCircleSizedUrlHolder() != null) {
            SizedUrlHolder circleSizedUrlHolder = item.getCircleSizedUrlHolder();
            Context context = rdsChip.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            rdsChip.loadImage(circleSizedUrlHolder.getSizedUrl(context), Integer.valueOf(C11222R.drawable.curated_list_error_circle_28dp));
        } else if (item.getIconDrawableRes() != null) {
            rdsChip.setIconDrawable(com.robinhood.utils.extensions.ViewsKt.getDrawable(rdsChip, item.getIconDrawableRes().intValue()));
        }
        rdsChip.setBadged(item.isBadged());
        rdsChip.setClosable(item.isClosable());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bind$lambda$4$lambda$3(Function1 function1, CuratedListChipItem curatedListChipItem, CuratedListChipRowView curatedListChipRowView, RdsChip rdsChip) {
        if (function1 != null) {
            function1.invoke(curatedListChipItem);
        }
        if (curatedListChipItem.getFragmentKey() != null) {
            Navigator navigator = curatedListChipRowView.getNavigator();
            Context context = rdsChip.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Navigator.DefaultImpls.showFragment$default(navigator, context, curatedListChipItem.getFragmentKey(), false, false, false, null, false, null, false, false, null, null, 4092, null);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: CuratedListChipRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/ui/CuratedListChipRowView$Companion;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/common/ui/CuratedListChipRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Inflater<CuratedListChipRowView> {
        private final /* synthetic */ Inflater<CuratedListChipRowView> $$delegate_0;

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public CuratedListChipRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (CuratedListChipRowView) this.$$delegate_0.inflate(parent);
        }

        private Companion() {
            this.$$delegate_0 = Inflater.INSTANCE.include(C11222R.layout.include_curated_list_thumbnail_chip_row_view);
        }
    }

    /* compiled from: CuratedListChipRowView.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/ui/CuratedListChipRowView$IconChipInflater;", "Lcom/robinhood/utils/ui/view/Inflater;", "Lcom/robinhood/android/common/ui/CuratedListChipRowView;", "<init>", "()V", "inflate", "parent", "Landroid/view/ViewGroup;", "feature-lib-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class IconChipInflater implements Inflater<CuratedListChipRowView> {
        public static final IconChipInflater INSTANCE = new IconChipInflater();
        private final /* synthetic */ Inflater<CuratedListChipRowView> $$delegate_0 = Inflater.INSTANCE.include(C11222R.layout.include_curated_list_thumbnail_icon_chip_row_view);

        @Override // com.robinhood.utils.p409ui.view.Inflater
        public CuratedListChipRowView inflate(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            return (CuratedListChipRowView) this.$$delegate_0.inflate(parent);
        }

        private IconChipInflater() {
        }
    }
}
