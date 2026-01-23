package com.robinhood.rosetta.converters.options;

import com.robinhood.rosetta.eventlogging.OptionWatchlistAboutContext;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsWatchlist.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, m3636d2 = {"toOptionsWatchlistOnboardingSourceType", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext$SourceType;", "", "lib-rosetta-converters_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.rosetta.converters.options.OptionsWatchlistKt, reason: use source file name */
/* loaded from: classes26.dex */
public final class OptionsWatchlist2 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final OptionWatchlistAboutContext.SourceType toOptionsWatchlistOnboardingSourceType(String str) {
        String lowerCase;
        if (str != null) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        } else {
            lowerCase = null;
        }
        if (lowerCase != null) {
            switch (lowerCase.hashCode()) {
                case -1043655596:
                    if (lowerCase.equals("investment_page_card")) {
                        return OptionWatchlistAboutContext.SourceType.INVESTMENT_PAGE_CARD;
                    }
                    break;
                case 400802883:
                    if (lowerCase.equals("marketing_email")) {
                        return OptionWatchlistAboutContext.SourceType.MARKETING_EMAIL;
                    }
                    break;
                case 666902000:
                    if (lowerCase.equals("push_notification")) {
                        return OptionWatchlistAboutContext.SourceType.PUSH_NOTIFICATION;
                    }
                    break;
                case 1392894798:
                    if (lowerCase.equals("inbox_message")) {
                        return OptionWatchlistAboutContext.SourceType.INBOX_MESSAGE;
                    }
                    break;
            }
        }
        return OptionWatchlistAboutContext.SourceType.OTHER;
    }
}
