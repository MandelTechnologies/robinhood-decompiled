package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EventCategory.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EventCategory;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ACCOUNT_SECURITY", "APP_SESSION", "CRYPTO_ORDER", "DEVICE_SECURITY", "EQUITY_ORDER", "ERROR_EVENT", "EXPERIMENTS", "HTTP_CALL", "NETWORK_ERROR", "OPTION_ORDER", "PATHFINDER_FALLBACK_TO_WEB_VIEW", "PERFORMANCE_METRIC", "PERFORMANCE_METRIC_SPAN", "PROMPTS_CHALLENGE", "TWILIO_CONVERSATIONS_SDK", "USER_INTERACTION", "WEB_VIEW_NAVIGATION", "DEEPLINK", "PERPETUAL_ORDER", "lib-rosetta_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class EventCategory {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EventCategory[] $VALUES;
    private final String value;
    public static final EventCategory ACCOUNT_SECURITY = new EventCategory("ACCOUNT_SECURITY", 0, "account_security");
    public static final EventCategory APP_SESSION = new EventCategory("APP_SESSION", 1, "app_session");
    public static final EventCategory CRYPTO_ORDER = new EventCategory("CRYPTO_ORDER", 2, "crypto_order");
    public static final EventCategory DEVICE_SECURITY = new EventCategory("DEVICE_SECURITY", 3, "device_security_event");
    public static final EventCategory EQUITY_ORDER = new EventCategory("EQUITY_ORDER", 4, "equity_order");
    public static final EventCategory ERROR_EVENT = new EventCategory("ERROR_EVENT", 5, "error_event");
    public static final EventCategory EXPERIMENTS = new EventCategory("EXPERIMENTS", 6, "experiments");
    public static final EventCategory HTTP_CALL = new EventCategory("HTTP_CALL", 7, "http_call");
    public static final EventCategory NETWORK_ERROR = new EventCategory("NETWORK_ERROR", 8, AnalyticsStrings.TAB_CRYPTO_UPGRADE_AGREEMENT_NETWORK_ERROR);
    public static final EventCategory OPTION_ORDER = new EventCategory("OPTION_ORDER", 9, "option_order");
    public static final EventCategory PATHFINDER_FALLBACK_TO_WEB_VIEW = new EventCategory("PATHFINDER_FALLBACK_TO_WEB_VIEW", 10, "pathfinder_fallback_to_web_view");
    public static final EventCategory PERFORMANCE_METRIC = new EventCategory("PERFORMANCE_METRIC", 11, "performance_metric");
    public static final EventCategory PERFORMANCE_METRIC_SPAN = new EventCategory("PERFORMANCE_METRIC_SPAN", 12, "performance_metric_span");
    public static final EventCategory PROMPTS_CHALLENGE = new EventCategory("PROMPTS_CHALLENGE", 13, "prompts_challenge");
    public static final EventCategory TWILIO_CONVERSATIONS_SDK = new EventCategory("TWILIO_CONVERSATIONS_SDK", 14, "twilio_conversations_sdk");
    public static final EventCategory USER_INTERACTION = new EventCategory("USER_INTERACTION", 15, "user_interaction");
    public static final EventCategory WEB_VIEW_NAVIGATION = new EventCategory("WEB_VIEW_NAVIGATION", 16, "web_view_navigation");
    public static final EventCategory DEEPLINK = new EventCategory("DEEPLINK", 17, "deeplink");
    public static final EventCategory PERPETUAL_ORDER = new EventCategory("PERPETUAL_ORDER", 18, "perpetual_order");

    private static final /* synthetic */ EventCategory[] $values() {
        return new EventCategory[]{ACCOUNT_SECURITY, APP_SESSION, CRYPTO_ORDER, DEVICE_SECURITY, EQUITY_ORDER, ERROR_EVENT, EXPERIMENTS, HTTP_CALL, NETWORK_ERROR, OPTION_ORDER, PATHFINDER_FALLBACK_TO_WEB_VIEW, PERFORMANCE_METRIC, PERFORMANCE_METRIC_SPAN, PROMPTS_CHALLENGE, TWILIO_CONVERSATIONS_SDK, USER_INTERACTION, WEB_VIEW_NAVIGATION, DEEPLINK, PERPETUAL_ORDER};
    }

    public static EnumEntries<EventCategory> getEntries() {
        return $ENTRIES;
    }

    private EventCategory(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        EventCategory[] eventCategoryArr$values = $values();
        $VALUES = eventCategoryArr$values;
        $ENTRIES = EnumEntries2.enumEntries(eventCategoryArr$values);
    }

    public static EventCategory valueOf(String str) {
        return (EventCategory) Enum.valueOf(EventCategory.class, str);
    }

    public static EventCategory[] values() {
        return (EventCategory[]) $VALUES.clone();
    }
}
