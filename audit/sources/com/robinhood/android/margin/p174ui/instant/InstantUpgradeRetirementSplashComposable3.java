package com.robinhood.android.margin.p174ui.instant;

import androidx.compose.p011ui.tooling.preview.datasource.CollectionPreviewParameterProvider;
import com.robinhood.android.margin.p174ui.instant.InstantUpgradeRetirementSplashDuxo2;
import com.robinhood.android.models.retirement.api.ApiRetirementSignUpFlow;
import com.robinhood.models.serverdriven.experimental.api.PlainText;
import com.robinhood.models.serverdriven.experimental.api.Text;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: InstantUpgradeRetirementSplashComposable.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementSplashStateParameterProvider;", "Landroidx/compose/ui/tooling/preview/datasource/CollectionPreviewParameterProvider;", "Lcom/robinhood/android/margin/ui/instant/InstantUpgradeRetirementSplashState;", "<init>", "()V", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.ui.instant.InstantUpgradeRetirementSplashStateParameterProvider, reason: use source file name */
/* loaded from: classes8.dex */
public final class InstantUpgradeRetirementSplashComposable3 extends CollectionPreviewParameterProvider<InstantUpgradeRetirementSplashDuxo2> {
    public static final int $stable = CollectionPreviewParameterProvider.$stable;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public InstantUpgradeRetirementSplashComposable3() {
        super(CollectionsKt.listOf((Object[]) new InstantUpgradeRetirementSplashDuxo2[]{InstantUpgradeRetirementSplashDuxo2.Loading.INSTANCE, new InstantUpgradeRetirementSplashDuxo2.ShowInstantSplash(new ApiRetirementSignUpFlow.InstantDepositsViewModel("url", CollectionsKt.listOf(new Text(new PlainText("component"), null, null, null, null, 30, null)), "enable instant", "not now", new Text(new PlainText("disclosure_markdown"), null, null, null, null, 30, null)))}));
    }
}
