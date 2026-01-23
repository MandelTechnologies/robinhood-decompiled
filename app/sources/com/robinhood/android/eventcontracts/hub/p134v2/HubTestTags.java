package com.robinhood.android.eventcontracts.hub.p134v2;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HubTestTags.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/HubTestTags;", "", "<init>", "()V", "HUB_SECTION_DIVIDER_LINE", "", "HUB_DISCLOSURE", "eventCard", "sectionIdentifier", "sectionHeader", "seeMoreFooter", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class HubTestTags {
    public static final int $stable = 0;
    public static final String HUB_DISCLOSURE = "hub_disclosure";
    public static final String HUB_SECTION_DIVIDER_LINE = "hub_divider_line";
    public static final HubTestTags INSTANCE = new HubTestTags();

    private HubTestTags() {
    }

    public final String eventCard(String sectionIdentifier) {
        Intrinsics.checkNotNullParameter(sectionIdentifier, "sectionIdentifier");
        return "event_card_" + sectionIdentifier;
    }

    public final String sectionHeader(String sectionIdentifier) {
        Intrinsics.checkNotNullParameter(sectionIdentifier, "sectionIdentifier");
        return "section_header_" + sectionIdentifier;
    }

    public final String seeMoreFooter(String sectionIdentifier) {
        Intrinsics.checkNotNullParameter(sectionIdentifier, "sectionIdentifier");
        return "hub_see_more_footer_" + sectionIdentifier;
    }
}
