package com.robinhood.android.redesign.accounttab.analytics;

import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;

/* compiled from: AccountTabAnalytics.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/analytics/AccountTabAnalytics;", "", "<init>", "()V", "IDENTIFIER_REORDER", "", "IDENTIFIER_ADD_ACCOUNT", "IDENTIFIER_PULL_DOWN_TO_EXPAND", "IDENTIFIER_ACCOUNT_SELECTOR", "IDENTIFIER_PAGE", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "userDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "getUserDescriptor", "()Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "userEventData", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "getUserEventData", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class AccountTabAnalytics {
    public static final int $stable;
    public static final String IDENTIFIER_ACCOUNT_SELECTOR = "ACCOUNTS_SELECTOR";
    public static final String IDENTIFIER_ADD_ACCOUNT = "selector_add_account";
    public static final String IDENTIFIER_PAGE = "PAGE";
    public static final String IDENTIFIER_PULL_DOWN_TO_EXPAND = "SELECTOR_PULL_DOWN_EXPAND";
    public static final String IDENTIFIER_REORDER = "selector_reorder_account";
    public static final AccountTabAnalytics INSTANCE = new AccountTabAnalytics();
    private static final Screen screen;
    private static final UserInteractionEventDescriptor userDescriptor;
    private static final UserInteractionEventData userEventData;

    private AccountTabAnalytics() {
    }

    static {
        Screen screen2 = new Screen(null, null, "RD_ACCOUNTS_HOME", null, 11, null);
        screen = screen2;
        userDescriptor = new UserInteractionEventDescriptor(null, screen2, null, null, null, null, 61, null);
        userEventData = new UserInteractionEventData(null, screen2, null, null, null, null, null, 125, null);
        $stable = 8;
    }

    public final Screen getScreen() {
        return screen;
    }

    public final UserInteractionEventDescriptor getUserDescriptor() {
        return userDescriptor;
    }

    public final UserInteractionEventData getUserEventData() {
        return userEventData;
    }
}
