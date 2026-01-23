package com.robinhood.android.crypto.costbasis.hub;

import com.robinhood.android.udf.StateProvider;
import com.robinhood.staticcontent.model.OtherMarkdown;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoCostBasisHubStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubDataState;", "Lcom/robinhood/android/crypto/costbasis/hub/CryptoCostBasisHubViewState;", "<init>", "()V", "reduce", "dataState", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoCostBasisHubStateProvider implements StateProvider<CryptoCostBasisHubDataState, CryptoCostBasisHubViewState> {
    public static final int $stable = 0;

    @Override // com.robinhood.android.udf.StateProvider
    public CryptoCostBasisHubViewState reduce(CryptoCostBasisHubDataState dataState) {
        ImmutableList<CostBasisRow> rows;
        ImmutableList<CostBasisRow> rows2;
        ImmutableList<CostBasisRow> rows3;
        String markdown2;
        String markdown22;
        String markdown23;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        CryptoCostBasisHubSection section$feature_crypto_cost_basis_externalDebug = dataState.getSection2025Sold().getSection$feature_crypto_cost_basis_externalDebug();
        StringResource title = dataState.getSection2025Sold().getTitle();
        OtherMarkdown bannerMarkdown$feature_crypto_cost_basis_externalDebug = dataState.getSection2025Sold().getBannerMarkdown$feature_crypto_cost_basis_externalDebug();
        String str = (bannerMarkdown$feature_crypto_cost_basis_externalDebug == null || (markdown23 = bannerMarkdown$feature_crypto_cost_basis_externalDebug.getMarkdown2()) == null || StringsKt.isBlank(markdown23) || markdown23.length() <= 1) ? null : markdown23;
        boolean zIsLoading = dataState.getSection2025Sold().isLoading();
        if (dataState.getSection2025Sold().isLoading()) {
            rows = dataState.getSection2025Sold().getPlaceholderRows();
        } else {
            rows = dataState.getSection2025Sold().getRows();
        }
        CryptoCostBasisHubSectionViewState cryptoCostBasisHubSectionViewState = new CryptoCostBasisHubSectionViewState(section$feature_crypto_cost_basis_externalDebug, str, title, zIsLoading, rows, dataState.getSection2025Sold().isLoadingMore$feature_crypto_cost_basis_externalDebug(), dataState.getSection2025Sold().getHideShowMore(), dataState.getSection2025Sold().getHideSection());
        CryptoCostBasisHubSection section$feature_crypto_cost_basis_externalDebug2 = dataState.getSectionMissingDetails().getSection$feature_crypto_cost_basis_externalDebug();
        StringResource title2 = dataState.getSectionMissingDetails().getTitle();
        OtherMarkdown bannerMarkdown$feature_crypto_cost_basis_externalDebug2 = dataState.getSectionMissingDetails().getBannerMarkdown$feature_crypto_cost_basis_externalDebug();
        String str2 = (bannerMarkdown$feature_crypto_cost_basis_externalDebug2 == null || (markdown22 = bannerMarkdown$feature_crypto_cost_basis_externalDebug2.getMarkdown2()) == null || StringsKt.isBlank(markdown22) || markdown22.length() <= 1) ? null : markdown22;
        boolean zIsLoading2 = dataState.getSectionMissingDetails().isLoading();
        if (dataState.getSectionMissingDetails().isLoading()) {
            rows2 = dataState.getSectionMissingDetails().getPlaceholderRows();
        } else {
            rows2 = dataState.getSectionMissingDetails().getRows();
        }
        CryptoCostBasisHubSectionViewState cryptoCostBasisHubSectionViewState2 = new CryptoCostBasisHubSectionViewState(section$feature_crypto_cost_basis_externalDebug2, str2, title2, zIsLoading2, rows2, dataState.getSectionMissingDetails().isLoadingMore$feature_crypto_cost_basis_externalDebug(), dataState.getSectionMissingDetails().getHideShowMore(), dataState.getSectionMissingDetails().getHideSection());
        CryptoCostBasisHubSection section$feature_crypto_cost_basis_externalDebug3 = dataState.getSectionConfirmed().getSection$feature_crypto_cost_basis_externalDebug();
        StringResource title3 = dataState.getSectionConfirmed().getTitle();
        OtherMarkdown bannerMarkdown$feature_crypto_cost_basis_externalDebug3 = dataState.getSectionConfirmed().getBannerMarkdown$feature_crypto_cost_basis_externalDebug();
        String str3 = (bannerMarkdown$feature_crypto_cost_basis_externalDebug3 == null || (markdown2 = bannerMarkdown$feature_crypto_cost_basis_externalDebug3.getMarkdown2()) == null || StringsKt.isBlank(markdown2) || markdown2.length() <= 1) ? null : markdown2;
        boolean zIsLoading3 = dataState.getSectionConfirmed().isLoading();
        if (dataState.getSectionConfirmed().isLoading()) {
            rows3 = dataState.getSectionConfirmed().getPlaceholderRows();
        } else {
            rows3 = dataState.getSectionConfirmed().getRows();
        }
        return new CryptoCostBasisHubViewState(cryptoCostBasisHubSectionViewState, cryptoCostBasisHubSectionViewState2, new CryptoCostBasisHubSectionViewState(section$feature_crypto_cost_basis_externalDebug3, str3, title3, zIsLoading3, rows3, dataState.getSectionConfirmed().isLoadingMore$feature_crypto_cost_basis_externalDebug(), dataState.getSectionConfirmed().getHideShowMore(), dataState.getSectionConfirmed().getHideSection()));
    }
}
