package com.robinhood.android.optionschain.extensions;

import com.robinhood.android.optionschain.C24135R;
import com.robinhood.models.api.strategybuilder.StrategyBuilderSentiment;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StrategyBuilderSentiments.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0017\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"headerText", "Lcom/robinhood/utils/resource/StringResource;", "Lcom/robinhood/models/api/strategybuilder/StrategyBuilderSentiment;", "getHeaderText", "(Lcom/robinhood/models/api/strategybuilder/StrategyBuilderSentiment;)Lcom/robinhood/utils/resource/StringResource;", "feature-options-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.extensions.StrategyBuilderSentimentsKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class StrategyBuilderSentiments {

    /* compiled from: StrategyBuilderSentiments.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.extensions.StrategyBuilderSentimentsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StrategyBuilderSentiment.values().length];
            try {
                iArr[StrategyBuilderSentiment.BULLISH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StrategyBuilderSentiment.BEARISH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StrategyBuilderSentiment.VOLATILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StrategyBuilderSentiment.NEUTRAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StrategyBuilderSentiment.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final StringResource getHeaderText(StrategyBuilderSentiment strategyBuilderSentiment) {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        int i2 = strategyBuilderSentiment == null ? -1 : WhenMappings.$EnumSwitchMapping$0[strategyBuilderSentiment.ordinal()];
        if (i2 == -1) {
            i = C24135R.string.option_strategy_builder_no_sentiment_title;
        } else if (i2 == 1) {
            i = C24135R.string.option_strategy_builder_bullish_title;
        } else if (i2 == 2) {
            i = C24135R.string.option_strategy_builder_bearish_title;
        } else if (i2 == 3) {
            i = C24135R.string.option_strategy_builder_volatile_title;
        } else if (i2 == 4) {
            i = C24135R.string.option_strategy_builder_neutral_title;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = C24135R.string.option_strategy_builder_no_sentiment_title;
        }
        return companion.invoke(i, new Object[0]);
    }
}
