package com.robinhood.android.crypto.tab.p093ui.discover;

import com.robinhood.android.slip.onboarding.hub.SlipHubComposable3;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import kotlin.Metadata;

/* compiled from: CryptoHomeDiscoverExperimentComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/discover/ExperimentTestTags;", "", "<init>", "()V", "makePillTag", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "EXPLORE_SECTION_TITLE", "SHOW_MORE_BUTTON", SlipHubComposable3.INSTRUMENT_ROW_TEST_TAG, "EXPLORE_SECTION_INFO_BUTTON", "TEST_TAG_DISCOVER_EXPERIMENT_ITEM_LOADING", "TEST_TAG_DISCOVER_EXPERIMENT_ITEM_LOADED", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class ExperimentTestTags {
    public static final int $stable = 0;
    public static final String EXPLORE_SECTION_INFO_BUTTON = "position_hub_button";
    public static final String EXPLORE_SECTION_TITLE = "explore_crypto_section_title";
    public static final ExperimentTestTags INSTANCE = new ExperimentTestTags();
    public static final String INSTRUMENT_ROW = "ResultInstrumentRow";
    public static final String SHOW_MORE_BUTTON = "show_more_crypto_button";
    public static final String TEST_TAG_DISCOVER_EXPERIMENT_ITEM_LOADED = "TEST_TAG_DISCOVER_ITEM_LOADED";
    public static final String TEST_TAG_DISCOVER_EXPERIMENT_ITEM_LOADING = "TEST_TAG_DISCOVER_ITEM_LOADING";

    private ExperimentTestTags() {
    }

    public final String makePillTag(int index) {
        return "explore_filter_pill_" + index;
    }
}
