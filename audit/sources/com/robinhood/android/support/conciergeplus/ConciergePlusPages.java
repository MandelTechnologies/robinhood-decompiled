package com.robinhood.android.support.conciergeplus;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* compiled from: ConciergePlusPages.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/support/conciergeplus/ConciergePlusPages;", "", "<init>", "()V", "Page", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class ConciergePlusPages {
    public static final int $stable = 0;
    public static final ConciergePlusPages INSTANCE = new ConciergePlusPages();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ConciergePlusPages.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/support/conciergeplus/ConciergePlusPages$Page;", "", "slug", "", "path", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getSlug", "()Ljava/lang/String;", "getPath", "LANDING", "ONBOARDING", "HUB", "TAX", "ESTATE", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Page {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Page[] $VALUES;
        private final String path;
        private final String slug;
        public static final Page LANDING = new Page("LANDING", 0, "support-concierge-plus-landing", "/support/concierge-plus/landing");
        public static final Page ONBOARDING = new Page("ONBOARDING", 1, "support-concierge-plus-onboarding", "/support/concierge-plus/onboarding");
        public static final Page HUB = new Page("HUB", 2, "support-concierge-plus", "/account/concierge-tax-and-estate");
        public static final Page TAX = new Page("TAX", 3, "support-concierge-plus-tax", "/support/concierge-plus/tax");
        public static final Page ESTATE = new Page("ESTATE", 4, "support-concierge-plus-estate", "/support/concierge-plus/estate");

        private static final /* synthetic */ Page[] $values() {
            return new Page[]{LANDING, ONBOARDING, HUB, TAX, ESTATE};
        }

        public static EnumEntries<Page> getEntries() {
            return $ENTRIES;
        }

        private Page(String str, int i, String str2, String str3) {
            this.slug = str2;
            this.path = str3;
        }

        public final String getPath() {
            return this.path;
        }

        public final String getSlug() {
            return this.slug;
        }

        static {
            Page[] pageArr$values = $values();
            $VALUES = pageArr$values;
            $ENTRIES = EnumEntries2.enumEntries(pageArr$values);
        }

        public static Page valueOf(String str) {
            return (Page) Enum.valueOf(Page.class, str);
        }

        public static Page[] values() {
            return (Page[]) $VALUES.clone();
        }
    }

    private ConciergePlusPages() {
    }
}
