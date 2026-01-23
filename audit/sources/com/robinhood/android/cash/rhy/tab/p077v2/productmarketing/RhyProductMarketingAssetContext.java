package com.robinhood.android.cash.rhy.tab.p077v2.productmarketing;

import com.robinhood.targetbackend.Endpoint;
import com.robinhood.utils.extensions.ContextsUiExtensions2;
import com.robinhood.utils.extensions.DensitySpecs;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RhyProductMarketingAssetContext.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/productmarketing/RhyProductMarketingAssetContext;", "", "assetPath", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "RHY_ONBOARDING", "getAssetUrl", "Lokhttp3/HttpUrl;", "assetKey", "density", "Lcom/robinhood/utils/extensions/DensitySpec;", "Companion", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RhyProductMarketingAssetContext {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RhyProductMarketingAssetContext[] $VALUES;
    private static final String PLATFORM_PATH = "android";
    public static final RhyProductMarketingAssetContext RHY_ONBOARDING = new RhyProductMarketingAssetContext("RHY_ONBOARDING", 0, "assets/rhy/onboarding");
    private final String assetPath;

    private static final /* synthetic */ RhyProductMarketingAssetContext[] $values() {
        return new RhyProductMarketingAssetContext[]{RHY_ONBOARDING};
    }

    public static EnumEntries<RhyProductMarketingAssetContext> getEntries() {
        return $ENTRIES;
    }

    private RhyProductMarketingAssetContext(String str, int i, String str2) {
        this.assetPath = str2;
    }

    static {
        RhyProductMarketingAssetContext[] rhyProductMarketingAssetContextArr$values = $values();
        $VALUES = rhyProductMarketingAssetContextArr$values;
        $ENTRIES = EnumEntries2.enumEntries(rhyProductMarketingAssetContextArr$values);
        INSTANCE = new Companion(null);
    }

    public final HttpUrl getAssetUrl(String assetKey, ContextsUiExtensions2 density) {
        Intrinsics.checkNotNullParameter(assetKey, "assetKey");
        Intrinsics.checkNotNullParameter(density, "density");
        return Endpoint.BrokerageStatic.INSTANCE.getURL_CDN().newBuilder().addPathSegment(this.assetPath).addPathSegment(assetKey).addPathSegment(PLATFORM_PATH).addPathSegment(DensitySpecs.getMultiplierString(density) + ".png").build();
    }

    public static RhyProductMarketingAssetContext valueOf(String str) {
        return (RhyProductMarketingAssetContext) Enum.valueOf(RhyProductMarketingAssetContext.class, str);
    }

    public static RhyProductMarketingAssetContext[] values() {
        return (RhyProductMarketingAssetContext[]) $VALUES.clone();
    }
}
