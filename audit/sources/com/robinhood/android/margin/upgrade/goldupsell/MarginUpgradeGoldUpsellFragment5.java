package com.robinhood.android.margin.upgrade.goldupsell;

import androidx.compose.p011ui.tooling.preview.datasource.CollectionPreviewParameterProvider;
import com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellState3;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.CenterAlignedListPage;
import com.robinhood.models.serverdriven.experimental.api.DismissAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.IconImage;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: MarginUpgradeGoldUpsellFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellViewStateParameterProvider;", "Landroidx/compose/ui/tooling/preview/datasource/CollectionPreviewParameterProvider;", "Lcom/robinhood/android/margin/upgrade/goldupsell/MarginUpgradeGoldUpsellViewState;", "<init>", "()V", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.upgrade.goldupsell.MarginUpgradeGoldUpsellViewStateParameterProvider, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginUpgradeGoldUpsellFragment5 extends CollectionPreviewParameterProvider<MarginUpgradeGoldUpsellState3> {
    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public MarginUpgradeGoldUpsellFragment5() {
        super(CollectionsKt.listOf((Object[]) new MarginUpgradeGoldUpsellState3[]{MarginUpgradeGoldUpsellState3.Loading.INSTANCE, new MarginUpgradeGoldUpsellState3.Loaded(new CenterAlignedListPage(null, false, false, null, null, CollectionsKt.listOf(new IconImage(Icon.GOLD_24, null, 2, null)), CollectionsKt.listOf(new Button("Do a thing", null, new GenericAction.Dismiss(new DismissAction(false)), false, null, null, null, null, null, null, 1018, null)), 31, null))}));
    }
}
