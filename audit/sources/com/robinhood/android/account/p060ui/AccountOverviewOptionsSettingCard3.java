package com.robinhood.android.account.p060ui;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountOverviewOptionsSettingCard.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/account/ui/OptionsSectionSummary;", "", "Text", "TextWithLink", "TextWithSubstringLink", "Lcom/robinhood/android/account/ui/OptionsSectionSummary$Text;", "Lcom/robinhood/android/account/ui/OptionsSectionSummary$TextWithLink;", "Lcom/robinhood/android/account/ui/OptionsSectionSummary$TextWithSubstringLink;", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.account.ui.OptionsSectionSummary, reason: use source file name */
/* loaded from: classes24.dex */
public interface AccountOverviewOptionsSettingCard3 {

    /* compiled from: AccountOverviewOptionsSettingCard.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/account/ui/OptionsSectionSummary$Text;", "Lcom/robinhood/android/account/ui/OptionsSectionSummary;", "text", "", "<init>", "(Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.account.ui.OptionsSectionSummary$Text, reason: from toString */
    public static final /* data */ class Text implements AccountOverviewOptionsSettingCard3 {
        public static final int $stable = 0;
        private final String text;

        public static /* synthetic */ Text copy$default(Text text, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = text.text;
            }
            return text.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Text copy(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new Text(text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Text) && Intrinsics.areEqual(this.text, ((Text) other).text);
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return "Text(text=" + this.text + ")";
        }

        public Text(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
        }

        public final String getText() {
            return this.text;
        }
    }

    /* compiled from: AccountOverviewOptionsSettingCard.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/account/ui/OptionsSectionSummary$TextWithLink;", "Lcom/robinhood/android/account/ui/OptionsSectionSummary;", "text", "", "linkText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getLinkText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.account.ui.OptionsSectionSummary$TextWithLink, reason: from toString */
    public static final /* data */ class TextWithLink implements AccountOverviewOptionsSettingCard3 {
        public static final int $stable = 0;
        private final String linkText;
        private final String text;

        public static /* synthetic */ TextWithLink copy$default(TextWithLink textWithLink, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = textWithLink.text;
            }
            if ((i & 2) != 0) {
                str2 = textWithLink.linkText;
            }
            return textWithLink.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLinkText() {
            return this.linkText;
        }

        public final TextWithLink copy(String text, String linkText) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(linkText, "linkText");
            return new TextWithLink(text, linkText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextWithLink)) {
                return false;
            }
            TextWithLink textWithLink = (TextWithLink) other;
            return Intrinsics.areEqual(this.text, textWithLink.text) && Intrinsics.areEqual(this.linkText, textWithLink.linkText);
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.linkText.hashCode();
        }

        public String toString() {
            return "TextWithLink(text=" + this.text + ", linkText=" + this.linkText + ")";
        }

        public TextWithLink(String text, String linkText) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(linkText, "linkText");
            this.text = text;
            this.linkText = linkText;
        }

        public final String getText() {
            return this.text;
        }

        public final String getLinkText() {
            return this.linkText;
        }
    }

    /* compiled from: AccountOverviewOptionsSettingCard.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/account/ui/OptionsSectionSummary$TextWithSubstringLink;", "Lcom/robinhood/android/account/ui/OptionsSectionSummary;", "text", "", "substringLinkText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getText", "()Ljava/lang/String;", "getSubstringLinkText", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-account-overview_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.account.ui.OptionsSectionSummary$TextWithSubstringLink, reason: from toString */
    public static final /* data */ class TextWithSubstringLink implements AccountOverviewOptionsSettingCard3 {
        public static final int $stable = 0;
        private final String substringLinkText;
        private final String text;

        public static /* synthetic */ TextWithSubstringLink copy$default(TextWithSubstringLink textWithSubstringLink, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = textWithSubstringLink.text;
            }
            if ((i & 2) != 0) {
                str2 = textWithSubstringLink.substringLinkText;
            }
            return textWithSubstringLink.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubstringLinkText() {
            return this.substringLinkText;
        }

        public final TextWithSubstringLink copy(String text, String substringLinkText) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(substringLinkText, "substringLinkText");
            return new TextWithSubstringLink(text, substringLinkText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextWithSubstringLink)) {
                return false;
            }
            TextWithSubstringLink textWithSubstringLink = (TextWithSubstringLink) other;
            return Intrinsics.areEqual(this.text, textWithSubstringLink.text) && Intrinsics.areEqual(this.substringLinkText, textWithSubstringLink.substringLinkText);
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.substringLinkText.hashCode();
        }

        public String toString() {
            return "TextWithSubstringLink(text=" + this.text + ", substringLinkText=" + this.substringLinkText + ")";
        }

        public TextWithSubstringLink(String text, String substringLinkText) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(substringLinkText, "substringLinkText");
            this.text = text;
            this.substringLinkText = substringLinkText;
        }

        public final String getText() {
            return this.text;
        }

        public final String getSubstringLinkText() {
            return this.substringLinkText;
        }
    }
}
