package com.robinhood.android.margin.upgrade.agreements;

import androidx.compose.p011ui.tooling.preview.datasource.CollectionPreviewParameterProvider;
import com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementState3;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: MarginUpgradeAgreementFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewStateParameterProvider;", "Landroidx/compose/ui/tooling/preview/datasource/CollectionPreviewParameterProvider;", "Lcom/robinhood/android/margin/upgrade/agreements/MarginUpgradeAgreementViewState;", "<init>", "()V", "feature-margin-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.margin.upgrade.agreements.MarginUpgradeAgreementViewStateParameterProvider, reason: use source file name */
/* loaded from: classes8.dex */
final class MarginUpgradeAgreementFragment7 extends CollectionPreviewParameterProvider<MarginUpgradeAgreementState3> {
    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public MarginUpgradeAgreementFragment7() {
        super(CollectionsKt.listOf((Object[]) new MarginUpgradeAgreementState3[]{MarginUpgradeAgreementState3.Loading.INSTANCE, MarginUpgradeAgreementFragment6.mockIndividualAgreementLoadedState(), new MarginUpgradeAgreementState3.JointAccountAgreementLoaded(MarginUpgradeAgreementFragment6.loremIpsum(), "123456", "Bob", true, false, MarginUpgradeAgreementFragment6.mockAgreement())}));
    }
}
