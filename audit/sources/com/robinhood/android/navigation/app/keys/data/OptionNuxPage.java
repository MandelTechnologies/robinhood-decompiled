package com.robinhood.android.navigation.app.keys.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionNuxPage.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/OptionNuxPage;", "", "deepLinkPageName", "", "contentfulIdentifier", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getDeepLinkPageName", "()Ljava/lang/String;", "getContentfulIdentifier", "FIRST_TRADE", "PICKING_AN_OPTION", "OPTION_EXPIRATION", "Companion", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class OptionNuxPage {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionNuxPage[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String contentfulIdentifier;
    private final String deepLinkPageName;
    public static final OptionNuxPage FIRST_TRADE = new OptionNuxPage("FIRST_TRADE", 0, "trading", "option-nux-make-your-first-options-trade");
    public static final OptionNuxPage PICKING_AN_OPTION = new OptionNuxPage("PICKING_AN_OPTION", 1, "choosing", "option-nux-picking-an-option");
    public static final OptionNuxPage OPTION_EXPIRATION = new OptionNuxPage("OPTION_EXPIRATION", 2, "expiration", "option-nux-option-expiration");

    private static final /* synthetic */ OptionNuxPage[] $values() {
        return new OptionNuxPage[]{FIRST_TRADE, PICKING_AN_OPTION, OPTION_EXPIRATION};
    }

    public static EnumEntries<OptionNuxPage> getEntries() {
        return $ENTRIES;
    }

    private OptionNuxPage(String str, int i, String str2, String str3) {
        this.deepLinkPageName = str2;
        this.contentfulIdentifier = str3;
    }

    public final String getDeepLinkPageName() {
        return this.deepLinkPageName;
    }

    public final String getContentfulIdentifier() {
        return this.contentfulIdentifier;
    }

    static {
        OptionNuxPage[] optionNuxPageArr$values = $values();
        $VALUES = optionNuxPageArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionNuxPageArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: OptionNuxPage.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/navigation/app/keys/data/OptionNuxPage$Companion;", "", "<init>", "()V", "valueOfName", "Lcom/robinhood/android/navigation/app/keys/data/OptionNuxPage;", "name", "", "lib-navigation-app_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final OptionNuxPage valueOfName(String name) {
            OptionNuxPage optionNuxPage;
            if (name == null) {
                return OptionNuxPage.FIRST_TRADE;
            }
            OptionNuxPage[] optionNuxPageArrValues = OptionNuxPage.values();
            int length = optionNuxPageArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    optionNuxPage = null;
                    break;
                }
                optionNuxPage = optionNuxPageArrValues[i];
                if (Intrinsics.areEqual(optionNuxPage.getDeepLinkPageName(), name)) {
                    break;
                }
                i++;
            }
            return optionNuxPage == null ? OptionNuxPage.FIRST_TRADE : optionNuxPage;
        }
    }

    public static OptionNuxPage valueOf(String str) {
        return (OptionNuxPage) Enum.valueOf(OptionNuxPage.class, str);
    }

    public static OptionNuxPage[] values() {
        return (OptionNuxPage[]) $VALUES.clone();
    }
}
