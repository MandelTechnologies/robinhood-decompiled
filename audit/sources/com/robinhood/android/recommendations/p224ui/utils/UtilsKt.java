package com.robinhood.android.recommendations.p224ui.utils;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: Utils.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u000e\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005"}, m3636d2 = {"getRiskBucketPauseFrame", "", "volatilityTarget", "getSheenStartFrame", "getSheenEndFrame", "feature-recommendations_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class UtilsKt {
    public static final int getRiskBucketPauseFrame(int i) {
        Integer num = (Integer) CollectionsKt.getOrNull(CollectionsKt.listOf((Object[]) new Integer[]{40, 60, 80, 100, 120}), i - 1);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("invalid volatility target");
    }

    public static final int getSheenStartFrame(int i) {
        Integer num = (Integer) CollectionsKt.getOrNull(CollectionsKt.listOf((Object[]) new Integer[]{0, 51, 102, Integer.valueOf(EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE), 204}), i - 1);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("invalid volatility target");
    }

    public static final int getSheenEndFrame(int i) {
        Integer num = (Integer) CollectionsKt.getOrNull(CollectionsKt.listOf((Object[]) new Integer[]{50, 101, Integer.valueOf(EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE), Integer.valueOf(EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE), Integer.valueOf(EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE)}), i - 1);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("invalid volatility target");
    }
}
