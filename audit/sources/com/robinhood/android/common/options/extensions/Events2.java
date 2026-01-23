package com.robinhood.android.common.options.extensions;

import com.robinhood.utils.logging.CrashReporter;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rosetta.option.StrategyName;

/* compiled from: Events.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"getStrategyName", "Lrosetta/option/StrategyName;", "strategy", "", "feature-lib-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.options.extensions.EventsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class Events2 {
    public static final StrategyName getStrategyName(String strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        try {
            String upperCase = strategy.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return StrategyName.valueOf(upperCase);
        } catch (IllegalArgumentException e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, e, true, null, 4, null);
            return StrategyName.STRATEGY_NAME_UNSPECIFIED;
        }
    }
}
