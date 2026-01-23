package com.robinhood.shared.ticker.internal;

import com.robinhood.shared.ticker.TextType;
import com.robinhood.shared.ticker.config.TickerLocaleConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: TickerTextUtils.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\u001a\"\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u001a\u001a\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u001a\u0018\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\r"}, m3636d2 = {"extractTrailingSymbol", "", "text", "textType", "Lcom/robinhood/shared/ticker/TextType;", "localeConfig", "Lcom/robinhood/shared/ticker/config/TickerLocaleConfig;", "extractMoneyTrailingSymbol", "extractPercentageTrailingSymbol", "stripGroupingSeparators", "extractGroupingSeparatorPositions", "", "", "lib-ticker-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.ticker.internal.TickerTextUtilsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class TickerTextUtils {

    /* compiled from: TickerTextUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.ticker.internal.TickerTextUtilsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextType.values().length];
            try {
                iArr[TextType.MONEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextType.PERCENTAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextType.DEFAULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String extractTrailingSymbol(String text, TextType textType, TickerLocaleConfig localeConfig) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textType, "textType");
        Intrinsics.checkNotNullParameter(localeConfig, "localeConfig");
        int i = WhenMappings.$EnumSwitchMapping$0[textType.ordinal()];
        if (i == 1) {
            return extractMoneyTrailingSymbol(text, localeConfig);
        }
        if (i == 2) {
            return extractPercentageTrailingSymbol(text, localeConfig);
        }
        if (i == 3) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String extractMoneyTrailingSymbol(String text, TickerLocaleConfig localeConfig) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(localeConfig, "localeConfig");
        Set<Character> moneyCharacters = localeConfig.getMoneyCharacters();
        int length = text.length() - 1;
        if (length >= 0) {
            while (true) {
                int i = length - 1;
                char cCharAt = text.charAt(length);
                if (Character.isDigit(cCharAt) || moneyCharacters.contains(Character.valueOf(cCharAt))) {
                    break;
                }
                if (i < 0) {
                    break;
                }
                length = i;
            }
            length = -1;
        } else {
            length = -1;
        }
        if (length == -1) {
            return text;
        }
        if (length == StringsKt.getLastIndex(text)) {
            return null;
        }
        String strSubstring = text.substring(length + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final String extractPercentageTrailingSymbol(String text, TickerLocaleConfig localeConfig) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(localeConfig, "localeConfig");
        char percentSymbol = localeConfig.getPercentSymbol();
        if (StringsKt.endsWith$default((CharSequence) text, percentSymbol, false, 2, (Object) null)) {
            return String.valueOf(percentSymbol);
        }
        return null;
    }

    public static final String stripGroupingSeparators(String text, TickerLocaleConfig localeConfig) throws IOException {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(localeConfig, "localeConfig");
        char groupingSeparator = localeConfig.getGroupingSeparator();
        char monetaryGroupingSeparator = localeConfig.getMonetaryGroupingSeparator();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char cCharAt = text.charAt(i);
            if (cCharAt != groupingSeparator && cCharAt != monetaryGroupingSeparator) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static final List<Integer> extractGroupingSeparatorPositions(String text, TickerLocaleConfig localeConfig) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(localeConfig, "localeConfig");
        char groupingSeparator = localeConfig.getGroupingSeparator();
        char monetaryGroupingSeparator = localeConfig.getMonetaryGroupingSeparator();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        while (i < text.length()) {
            char cCharAt = text.charAt(i);
            int i3 = i2 + 1;
            if (cCharAt == groupingSeparator || cCharAt == monetaryGroupingSeparator) {
                arrayList.add(Integer.valueOf(i2 - arrayList.size()));
            }
            i++;
            i2 = i3;
        }
        return arrayList;
    }
}
