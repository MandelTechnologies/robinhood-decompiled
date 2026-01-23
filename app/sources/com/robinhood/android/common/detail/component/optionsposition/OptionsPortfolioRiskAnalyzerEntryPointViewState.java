package com.robinhood.android.common.detail.component.optionsposition;

import androidx.compose.p011ui.text.AnnotatedString;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DetailPageOptionsPositionViewState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/common/detail/component/optionsposition/OptionsPortfolioRiskAnalyzerEntryPointViewState;", "Lcom/robinhood/android/common/detail/component/optionsposition/DetailPageEntryPointRowViewState;", "iconAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "description", "Landroidx/compose/ui/text/AnnotatedString;", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Landroidx/compose/ui/text/AnnotatedString;Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getIconAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getDescription", "()Landroidx/compose/ui/text/AnnotatedString;", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-detail-component_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OptionsPortfolioRiskAnalyzerEntryPointViewState extends DetailPageOptionsPositionViewState2 {
    public static final int $stable = 8;
    private final AnnotatedString description;
    private final FragmentKey fragmentKey;
    private final ServerToBentoAssetMapper2 iconAsset;

    public static /* synthetic */ OptionsPortfolioRiskAnalyzerEntryPointViewState copy$default(OptionsPortfolioRiskAnalyzerEntryPointViewState optionsPortfolioRiskAnalyzerEntryPointViewState, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, AnnotatedString annotatedString, FragmentKey fragmentKey, int i, Object obj) {
        if ((i & 1) != 0) {
            serverToBentoAssetMapper2 = optionsPortfolioRiskAnalyzerEntryPointViewState.iconAsset;
        }
        if ((i & 2) != 0) {
            annotatedString = optionsPortfolioRiskAnalyzerEntryPointViewState.description;
        }
        if ((i & 4) != 0) {
            fragmentKey = optionsPortfolioRiskAnalyzerEntryPointViewState.fragmentKey;
        }
        return optionsPortfolioRiskAnalyzerEntryPointViewState.copy(serverToBentoAssetMapper2, annotatedString, fragmentKey);
    }

    /* renamed from: component1, reason: from getter */
    public final ServerToBentoAssetMapper2 getIconAsset() {
        return this.iconAsset;
    }

    /* renamed from: component2, reason: from getter */
    public final AnnotatedString getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final FragmentKey getFragmentKey() {
        return this.fragmentKey;
    }

    public final OptionsPortfolioRiskAnalyzerEntryPointViewState copy(ServerToBentoAssetMapper2 iconAsset, AnnotatedString description, FragmentKey fragmentKey) {
        Intrinsics.checkNotNullParameter(iconAsset, "iconAsset");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
        return new OptionsPortfolioRiskAnalyzerEntryPointViewState(iconAsset, description, fragmentKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsPortfolioRiskAnalyzerEntryPointViewState)) {
            return false;
        }
        OptionsPortfolioRiskAnalyzerEntryPointViewState optionsPortfolioRiskAnalyzerEntryPointViewState = (OptionsPortfolioRiskAnalyzerEntryPointViewState) other;
        return this.iconAsset == optionsPortfolioRiskAnalyzerEntryPointViewState.iconAsset && Intrinsics.areEqual(this.description, optionsPortfolioRiskAnalyzerEntryPointViewState.description) && Intrinsics.areEqual(this.fragmentKey, optionsPortfolioRiskAnalyzerEntryPointViewState.fragmentKey);
    }

    public int hashCode() {
        return (((this.iconAsset.hashCode() * 31) + this.description.hashCode()) * 31) + this.fragmentKey.hashCode();
    }

    public String toString() {
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.iconAsset;
        AnnotatedString annotatedString = this.description;
        return "OptionsPortfolioRiskAnalyzerEntryPointViewState(iconAsset=" + serverToBentoAssetMapper2 + ", description=" + ((Object) annotatedString) + ", fragmentKey=" + this.fragmentKey + ")";
    }

    public final ServerToBentoAssetMapper2 getIconAsset() {
        return this.iconAsset;
    }

    public final AnnotatedString getDescription() {
        return this.description;
    }

    @Override // com.robinhood.android.common.detail.component.optionsposition.DetailPageOptionsPositionViewState2
    public FragmentKey getFragmentKey() {
        return this.fragmentKey;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsPortfolioRiskAnalyzerEntryPointViewState(ServerToBentoAssetMapper2 iconAsset, AnnotatedString description, FragmentKey fragmentKey) {
        super(fragmentKey, null);
        Intrinsics.checkNotNullParameter(iconAsset, "iconAsset");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
        this.iconAsset = iconAsset;
        this.description = description;
        this.fragmentKey = fragmentKey;
    }
}
