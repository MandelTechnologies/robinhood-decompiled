package com.robinhood.android.feature.margin.hub;

import androidx.compose.p011ui.tooling.preview.datasource.CollectionPreviewParameterProvider;
import com.robinhood.android.feature.margin.hub.BuyingPowerHubState3;
import com.robinhood.android.lib.margin.hub.p168db.models.BuyingPowerHubView;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.BuyingPowerHubAction;
import com.robinhood.models.serverdriven.experimental.api.Container;
import com.robinhood.models.serverdriven.experimental.api.DataRowCondensed;
import com.robinhood.models.serverdriven.experimental.api.DismissAction;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.InfoBanner;
import com.robinhood.models.serverdriven.experimental.api.LayoutAxis;
import com.robinhood.models.serverdriven.experimental.api.PlainText;
import com.robinhood.models.serverdriven.experimental.api.PlatformLayoutAxis;
import com.robinhood.models.serverdriven.experimental.api.PrimaryAxisAlignment;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.models.serverdriven.experimental.api.Text;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.rosetta.eventlogging.BuyingPowerHubContext;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: BuyingPowerHubFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubViewStateParameterProvider;", "Landroidx/compose/ui/tooling/preview/datasource/CollectionPreviewParameterProvider;", "Lcom/robinhood/android/feature/margin/hub/BuyingPowerHubViewState;", "<init>", "()V", "feature-margin-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class BuyingPowerHubViewStateParameterProvider extends CollectionPreviewParameterProvider<BuyingPowerHubState3> {
    public static final int $stable = CollectionPreviewParameterProvider.$stable;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BuyingPowerHubViewStateParameterProvider() {
        List listListOf = CollectionsKt.listOf((Object[]) new UIComponent[]{new Text(new PlainText("Buying Power\n$5,000.00"), TextStyle.DISPLAY_LARGE, null, null, null, 28, null), new DataRowCondensed("Brokerage Cash", null, "$5,000.00", 2, null), new DataRowCondensed("Total", null, "$5,000.00", 2, null), new InfoBanner(null, new RichText("Want more buying power? Explore margin investing to unlock additional funds.", CollectionsKt.emptyList()), Icon.LIGHTNING_24, "Learn more", null, false, null, null, null, 497, null)});
        LayoutAxis layoutAxis = LayoutAxis.VERTICAL;
        super(CollectionsKt.listOf((Object[]) new BuyingPowerHubState3[]{BuyingPowerHubState3.Loading.INSTANCE, new BuyingPowerHubState3.Loaded(new BuyingPowerHubView("123456", new Container(listListOf, null, new PlatformLayoutAxis(layoutAxis, layoutAxis), PrimaryAxisAlignment.CENTER, null, 18, null), new Button("Deposit funds", null, new BuyingPowerHubAction.Dismiss(new DismissAction(false)), false, null, null, null, null, null, null, 1018, null), new BuyingPowerHubContext(null, null, false, false, null, 31, null), null, 16, null), false)}));
    }
}
